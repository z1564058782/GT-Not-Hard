package hatch;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.util.GTUtility;

/**
 * 只供本 Mod 的 Chaos / Origin 使用的输出显示摘要，不是实际库存或输出容器。
 * 按物品/流体及 NBT 汇总 long 数量；不编码产物 NBT，不将摘要回写到服务器输出数组。
 * 数量预算限制真实产出对象，独立的 UTF-8 预算限制网络正文，二者不能相互替代。
 */
public final class SuperInputOutputSummary {

    /** GUI 摘要最多 8192 字节，给包头及其他字段留下远大于实际需要的空间。 */
    public static final int maxSummaryBytes = 8192;

    /** 最多显示 32 种产物，后续对象仍实际产出，只在界面省略。 */
    public static final int maxSummaryEntries = 32;

    /** 单个名称最多保留 96 个 Unicode 码点，避免自定义名称占满整包。 */
    private static final int maxNameCodePoints = 96;

    /** 最近观察到的物品数组引用，控制器每轮计算、结算和重载都会替换引用。 */
    private ItemStack[] cachedItems;

    /** 最近观察到的流体数组引用，用于避免未变化时每 tick 重建汇总表。 */
    private FluidStack[] cachedFluids;

    /** 最近一次有界文本；进度变化不改变产物，不需要重新序列化全部输出。 */
    private String cachedText = "";

    /** 单种产物的只读身份引用和 long 汇总；不修改原堆栈数量或 NBT。 */
    private static final class SummaryEntry {

        /** 物品原型引用；流体条目时为 null。 */
        private ItemStack itemStack;

        /** 流体原型引用；物品条目时为 null。 */
        private FluidStack fluidStack;

        /** 已合并的数量；一个 Java 数组最多 int 个 int 数量堆栈，合计不会溢出 long。 */
        private long amount;
    }

    /**
     * 获取真实产物的显示摘要；相同数组引用直接返回缓存。
     *
     * @param items  当前真实物品输出，允许 null、空数组及 null 元素
     * @param fluids 当前真实流体输出，允许 null、空数组及 null 元素
     * @return 最多 maxSummaryBytes 个 UTF-8 字节的文本，不包含产物 NBT
     */
    public String getText(ItemStack[] items, FluidStack[] fluids) {
        // 产物数组不会随进度增长修改，引用未变时无需扫描全部输出。
        if (items == cachedItems && fluids == cachedFluids) return cachedText;
        // 将本次观察结果作为缓存键，不持有任何额外堆栈副本。
        cachedItems = items;
        // 物品和流体任一变化都需要重算文本。
        cachedFluids = fluids;
        // 汇总表只保留固定数量的身份，旧版大数组也不会制造等量显示部件。
        List<SummaryEntry> entries = new ArrayList<>();
        // 记录省略的实际输出对象数，不将其误标为省略的产物种类数。
        long omittedFragments = 0;
        // 物品的相同身份包含物品 ID、damage 和 NBT，数量本身不参与身份。
        if (items != null) for (ItemStack stack : items) {
            // 无效或零数量元素不会真实产出，也不占显示空间。
            if (stack == null || stack.stackSize <= 0) continue;
            // 只在最多 32 个显示条目中查找，不建立随碎片数增长的索引。
            SummaryEntry found = null;
            // 比较只读原型，避免为每个碎片复制 NBT。
            for (SummaryEntry entry : entries) {
                // GT 原生比较保留 NBT 区分，不能将不同标签的物品合并。
                if (entry.itemStack != null && GTUtility.areStacksEqual(entry.itemStack, stack)) {
                    // 同类后续碎片汇总到已有条目。
                    found = entry;
                    // 已找到身份，停止固定小表查询。
                    break;
                }
            }
            // 达到显示上限时仅省略新身份，不省略实际产出。
            if (found == null && entries.size() >= maxSummaryEntries) {
                // 该计数只属于显示，不会参与配方消费和输出。
                omittedFragments++;
                // 已保留身份的后续碎片仍会在前面的查询中合并。
                continue;
            }
            // 首次出现的身份建立一个固定开销的汇总条目。
            if (found == null) {
                // 不使用 ItemStack 副本，避免显示同步复制大型标签。
                found = new SummaryEntry();
                // 只读取原型名称及身份，不向此对象写入数量。
                found.itemStack = stack;
                // 添加已选择显示的产物。
                entries.add(found);
            }
            // 用 long 相加，超过 2.1G 的显示数量不能截成 int。
            found.amount += stack.stackSize;
        }
        // 流体与物品共享显示条目上限。
        if (fluids != null) for (FluidStack stack : fluids) {
            // 过滤不存在或不会产出的流体。
            if (stack == null || stack.amount <= 0) continue;
            // 寻找同流体且同标签的条目。
            SummaryEntry found = null;
            // 列表大小始终有界。
            for (SummaryEntry entry : entries) {
                // Forge 原生流体身份比较包含标签。
                if (entry.fluidStack != null && entry.fluidStack.isFluidEqual(stack)) {
                    // 汇总已有流体。
                    found = entry;
                    // 找到后不继续检查其他类型。
                    break;
                }
            }
            // 显示上限不影响真实输出数组。
            if (found == null && entries.size() >= maxSummaryEntries) {
                // 记录有多少实际对象没有在摘要里展开。
                omittedFragments++;
                // 当前流体仍由原版输出逻辑完整处理。
                continue;
            }
            // 首次显示该身份时只保存引用。
            if (found == null) {
                // 每种被显示的产物只创建一个小记录。
                found = new SummaryEntry();
                // 保留原型用于名称读取和标签比较。
                found.fluidStack = stack;
                // 加入固定大小的显示表。
                entries.add(found);
            }
            // 两个 int 相加也必须使用 long 累计。
            found.amount += stack.amount;
        }
        // 最终文本只包含名称和数量，不发送任何堆栈 NBT。
        StringBuilder text = new StringBuilder();
        // 按原输出第一次出现的顺序显示，避免进度更新时行顺序跳变。
        for (SummaryEntry entry : entries) {
            // 每个产物占一个普通文本行，不建立动态同步部件。
            if (text.length() > 0) text.append('\n');
            // 名称由服务端现有注册资源提供，与自定义物品名称兼容。
            String name = entry.itemStack != null ? entry.itemStack.getDisplayName()
                : entry.fluidStack.getLocalizedName();
            // 清理控制字符并限制码点数，避免名称注入额外行。
            text.append(safeName(name))
                .append(" × ")
                .append(entry.amount);
            // 流体数量明确使用 mB，不能误写成桶数。
            if (entry.fluidStack != null) text.append(" mB");
        }
        // 省略提示不携带被省略产物的大型标签。
        if (omittedFragments > 0) text.append("\n… +")
            .append(omittedFragments)
            .append(" output stacks");
        // UTF-8 字节上界独立于条目数和字符数量，中文及 emoji 同样受限。
        cachedText = limitUtf8(text.toString(), maxSummaryBytes);
        // 调用方仅拿到不可变字符串，不能借此改变真实库存。
        return cachedText;
    }

    /**
     * 用摘要替换父类已经生成的 Waila 输出标签；保留机器状态、能源和维护数据。
     * 新版配方对象总数有界，父类遍历本身也受启动预算限制；不临时清空机器数组，避免网络线程竞争。
     *
     * @param tag    当前 Waila 响应 NBT，允许修改这个响应对象
     * @param items  当前真实物品输出，不修改
     * @param fluids 当前真实流体输出，不修改
     */
    public void writeWailaSummary(NBTTagCompound tag, ItemStack[] items, FluidStack[] fluids) {
        // 复制键集合后删除，不能在遍历原 live keySet 时修改它。
        for (String key : new ArrayList<String>(tag.func_150296_c())) {
            // 只移除 GT 专用于逐片产物显示的字段，不影响其他机器信息。
            if (key.startsWith("outputItem") || key.startsWith("outputFluid")) tag.removeTag(key);
        }
        // Waila 使用比 GUI 更小的文本预算，观察机器不会发送完整产物列表。
        tag.setString("superInputOutputSummary", limitUtf8(getText(items, fluids), 2048));
    }

    /** 将服务端 Waila 摘要作为只读文本显示，不触发任何客户端输出回写。 */
    public static void appendWailaSummary(List<String> currentTip, NBTTagCompound tag) {
        // 没有产物时不添加空提示行。
        String text = tag.getString("superInputOutputSummary");
        // 每行都是已经限制长度的名称和数量。
        if (!text.isEmpty()) for (String line : text.split("\n")) currentTip.add(line);
    }

    /** 清理名称控制字符并按 Unicode 码点截断，避免拆开合法代理对。 */
    private static String safeName(String name) {
        // 非法自定义物品返回空名称时仍显示数量。
        if (name == null) return "?";
        // 清除换行、制表符及其他控制字符，保留普通 Unicode 文本。
        String cleanName = name.replaceAll("\\p{Cntrl}", " ");
        // 以码点计算长度，emoji 不会被当作两个独立字符切开。
        int codePoints = cleanName.codePointCount(0, cleanName.length());
        // 普通名称无需分配截断子串。
        if (codePoints <= maxNameCodePoints) return cleanName;
        // 截断边界是完整码点边界。
        return cleanName.substring(0, cleanName.offsetByCodePoints(0, maxNameCodePoints)) + "…";
    }

    /**
     * 在完整 Unicode 码点边界限制 UTF-8 长度，截断时用省略号提示。
     *
     * @param text     待显示文本
     * @param maxBytes 最大 UTF-8 字节数，至少为三，以容纳省略号
     * @return 不超过预算的原文本或截断文本
     */
    public static String limitUtf8(String text, int maxBytes) {
        // 公共方法的非法预算明确拒绝，不能返回超过调用方预算的省略号。
        if (maxBytes < 3) throw new IllegalArgumentException("UTF-8 budget must be at least three bytes");
        // 扫描无需为每个码点创建 byte[]，为省略号预留三个 UTF-8 字节。
        int usedBytes = 0;
        // 记录可保留的 UTF-16 边界，不能位于代理对中间。
        int safeEnd = 0;
        // 每次按完整 Unicode 码点前进。
        for (int index = 0; index < text.length();) {
            // 读取当前位置的完整字符。
            int codePoint = text.codePointAt(index);
            // UTF-8 的标准编码长度；孤立代理按三个字节保守计费。
            int codePointBytes = codePoint <= 0x7f ? 1 : codePoint <= 0x7ff ? 2 : codePoint <= 0xffff ? 3 : 4;
            // 即将超出预算时保留已有安全边界及一个省略号。
            if (usedBytes + codePointBytes > maxBytes) return text.substring(0, safeEnd) + "…";
            // 纳入当前字符的字节数。
            usedBytes += codePointBytes;
            // 跳过整个码点。
            index += Character.charCount(codePoint);
            // 仅记录给省略号留足空间的位置。
            if (usedBytes <= maxBytes - 3) safeEnd = index;
        }
        // 未超限时返回原字符串，避免额外复制。
        return text;
    }
}
