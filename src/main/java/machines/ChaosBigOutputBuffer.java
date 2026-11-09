package machines;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.util.GTRecipe;
import gregtech.api.util.GTUtility;
import hatch.SuperInputOutputSummary;

/**
 * 一批配方的压缩待产物。对象数只与实际资源身份数有关，数量使用 BigInteger。
 * 运行阶段不输出；完成后按固定工作预算交付，未接受的余额一直保存在控制器内。
 */
public final class ChaosBigOutputBuffer {

    public static final String NBT_KEY = "chaosBigOutputs";
    private static final BigInteger LONG_MAX = BigInteger.valueOf(Long.MAX_VALUE);
    private static final int FORMAT_VERSION = 1;
    // 合法 GT 配方即使合并全部 int 个输出，其数量也远小于 1024 位；拒绝损坏存档的巨型整数。
    private static final int MAX_SAVED_AMOUNT_BYTES = 128;

    public static final class Entry {

        final ItemStack item;
        final FluidStack fluid;
        final Object identity;
        private BigInteger amount;
        int routeCursor;

        private Entry(ItemStack item, FluidStack fluid, Object identity, BigInteger amount) {
            this.item = item;
            this.fluid = fluid;
            this.identity = identity;
            this.amount = amount;
        }

        public boolean isItem() {
            return item != null;
        }

        public BigInteger getAmount() {
            return amount;
        }
    }

    /** 返回实际接受数量；调用方必须先修改目的库存，失败时返回零。 */
    public interface Receiver {

        boolean hasBudget();

        long insert(Entry entry, long requested);
    }

    private final ArrayList<Entry> entries = new ArrayList<>();
    private final Map<Object, Entry> identities = new HashMap<>();
    private int nonEmptyEntries;
    private int cursor;
    private boolean ready;
    private NBTTagCompound invalidData;
    private long revision;
    private long summaryRevision = -1;
    private String summary = "";

    public static ChaosBigOutputBuffer fromRecipe(GTRecipe recipe, long parallel) {
        ChaosBigOutputBuffer buffer = new ChaosBigOutputBuffer();
        if (recipe.mOutputs != null) for (int i = 0; i < recipe.mOutputs.length; i++) {
            ItemStack prototype = recipe.getOutput(i);
            if (prototype == null || prototype.stackSize <= 0) continue;
            BigInteger quantity = ChaosParallel.bigChanceMultiplier(recipe.getOutputChance(i), parallel)
                .multiply(BigInteger.valueOf(prototype.stackSize));
            buffer.addItem(prototype, quantity);
        }
        if (recipe.mFluidOutputs != null) for (int i = 0; i < recipe.mFluidOutputs.length; i++) {
            FluidStack prototype = recipe.getFluidOutput(i);
            if (prototype == null || prototype.amount <= 0) continue;
            BigInteger quantity = ChaosParallel.bigChanceMultiplier(recipe.getFluidOutputChance(i), parallel)
                .multiply(BigInteger.valueOf(prototype.amount));
            buffer.addFluid(prototype, quantity);
        }
        return buffer;
    }

    public void addItem(ItemStack prototype, BigInteger amount) {
        if (amount.signum() == 0) return;
        if (amount.signum() < 0 || prototype == null || prototype.getItem() == null)
            throw new IllegalArgumentException("Invalid Chaos item output");
        ItemStack copy = prototype.copy();
        copy.stackSize = 1;
        Object id = GTUtility.ItemId.createNoCopy(copy);
        add(new Entry(copy, null, id, amount));
    }

    public void addFluid(FluidStack prototype, BigInteger amount) {
        if (amount.signum() == 0) return;
        if (amount.signum() < 0 || prototype == null || prototype.getFluid() == null)
            throw new IllegalArgumentException("Invalid Chaos fluid output");
        FluidStack copy = prototype.copy();
        copy.amount = 1;
        Object id = GTUtility.FluidId.createNoCopy(copy.getFluid(), null, copy.tag);
        add(new Entry(null, copy, id, amount));
    }

    private void add(Entry entry) {
        Entry previous = identities.get(entry.identity);
        if (previous == null) {
            identities.put(entry.identity, entry);
            entries.add(entry);
            nonEmptyEntries++;
        } else {
            if (previous.amount.signum() == 0) nonEmptyEntries++;
            previous.amount = previous.amount.add(entry.amount);
        }
        revision++;
    }

    public boolean hasData() {
        return invalidData != null || nonEmptyEntries > 0;
    }

    public boolean isInvalid() {
        return invalidData != null;
    }

    public boolean isReady() {
        return ready;
    }

    public int getEntryCount() {
        return nonEmptyEntries;
    }

    long getRevision() {
        return revision;
    }

    public void markReady() {
        if (!ready) {
            ready = true;
            revision++;
        }
    }

    /** 单 tick 最多访问给定种类数，接收器另行限制真实仓室/ME 调用次数。 */
    public boolean drain(Receiver receiver, int entryBudget) {
        if (!ready || invalidData != null || nonEmptyEntries == 0) return false;
        boolean changed = false;
        int visits = Math.min(entries.size(), Math.max(0, entryBudget));
        while (visits-- > 0 && receiver.hasBudget()) {
            Entry entry = entries.get(cursor);
            cursor = (cursor + 1) % entries.size();
            if (entry.amount.signum() == 0) continue;
            long requested = entry.amount.min(LONG_MAX)
                .longValueExact();
            long accepted = receiver.insert(entry, requested);
            if (accepted < 0 || accepted > requested) throw new IllegalStateException("Invalid Chaos output receipt");
            if (accepted == 0) continue;
            entry.amount = entry.amount.subtract(BigInteger.valueOf(accepted));
            if (entry.amount.signum() == 0) nonEmptyEntries--;
            // 每张回执立即提交版本；后续目的地抛异常也不能漏掉已完成扣减的脏标记。
            revision++;
            changed = true;
        }
        if (nonEmptyEntries == 0) {
            entries.clear();
            identities.clear();
            cursor = 0;
        }
        return changed;
    }

    /** 每个身份只保存一个数量为 1 的原型及一个 BigInteger 字节数组。 */
    public void save(NBTTagCompound root) {
        if (!hasData()) {
            root.removeTag(NBT_KEY);
            return;
        }
        if (invalidData != null) {
            root.setTag(NBT_KEY, invalidData.copy());
            return;
        }
        NBTTagCompound data = new NBTTagCompound();
        data.setInteger("version", FORMAT_VERSION);
        data.setBoolean("ready", ready);
        NBTTagList records = new NBTTagList();
        for (Entry entry : entries) {
            if (entry.amount.signum() == 0) continue;
            NBTTagCompound record = new NBTTagCompound();
            NBTTagCompound prototype = new NBTTagCompound();
            record.setBoolean("item", entry.isItem());
            if (entry.isItem()) entry.item.writeToNBT(prototype);
            else entry.fluid.writeToNBT(prototype);
            record.setTag("prototype", prototype);
            record.setByteArray("amount", entry.amount.toByteArray());
            records.appendTag(record);
        }
        data.setTag("entries", records);
        root.setTag(NBT_KEY, data);
    }

    public static ChaosBigOutputBuffer load(NBTTagCompound root) {
        ChaosBigOutputBuffer buffer = new ChaosBigOutputBuffer();
        if (!root.hasKey(NBT_KEY)) return buffer;
        NBTTagCompound data = root.getCompoundTag(NBT_KEY);
        try {
            if (data.getInteger("version") != FORMAT_VERSION || !data.hasKey("entries", 9))
                throw new IllegalArgumentException("Unknown Chaos output format");
            NBTTagList records = data.getTagList("entries", 10);
            for (int i = 0; i < records.tagCount(); i++) {
                NBTTagCompound record = records.getCompoundTagAt(i);
                byte[] bytes = record.getByteArray("amount");
                if (bytes.length == 0 || bytes.length > MAX_SAVED_AMOUNT_BYTES)
                    throw new IllegalArgumentException("Invalid Chaos output quantity");
                BigInteger amount = new BigInteger(bytes);
                if (amount.signum() <= 0) throw new IllegalArgumentException("Non-positive Chaos output");
                NBTTagCompound prototype = record.getCompoundTag("prototype");
                if (record.getBoolean("item")) buffer.addItem(ItemStack.loadItemStackFromNBT(prototype), amount);
                else buffer.addFluid(FluidStack.loadFluidStackFromNBT(prototype), amount);
            }
            buffer.ready = data.getBoolean("ready");
        } catch (RuntimeException error) {
            // 无法识别的原始数据原样保留并阻止新配方，不能静默丢弃或覆盖真实产物。
            buffer = new ChaosBigOutputBuffer();
            buffer.invalidData = (NBTTagCompound) data.copy();
        }
        return buffer;
    }

    /** 有界只读摘要；数量只在实际收货后变化，不随进度 tick 重建。 */
    public String getSummary() {
        if (summaryRevision == revision) return summary;
        summaryRevision = revision;
        if (invalidData != null) {
            summary = StatCollector.translateToLocal("gtnothard.chaos.big_output_invalid");
            return summary;
        }
        StringBuilder text = new StringBuilder(
            StatCollector
                .translateToLocal(ready ? "gtnothard.chaos.big_output_ready" : "gtnothard.chaos.big_output_running"));
        int shown = 0;
        for (Entry entry : entries) {
            if (entry.amount.signum() == 0) continue;
            if (shown == SuperInputOutputSummary.maxSummaryEntries) break;
            String name = entry.isItem() ? entry.item.getDisplayName() : entry.fluid.getLocalizedName();
            text.append('\n')
                .append(safeName(name))
                .append(" × ")
                .append(entry.amount);
            if (!entry.isItem()) text.append(" mB");
            shown++;
        }
        if (nonEmptyEntries > shown) text.append("\n… +")
            .append(nonEmptyEntries - shown);
        summary = SuperInputOutputSummary.limitUtf8(text.toString(), SuperInputOutputSummary.maxSummaryBytes);
        return summary;
    }

    private static String safeName(String name) {
        if (name == null) return "?";
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int offset = 0; offset < name.length() && count < 96; count++) {
            int codePoint = name.codePointAt(offset);
            if (!Character.isISOControl(codePoint)) result.appendCodePoint(codePoint);
            offset += Character.charCount(codePoint);
        }
        return result.toString();
    }
}
