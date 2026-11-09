package machines;

import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import appeng.api.networking.energy.IEnergySource;
import appeng.api.storage.IMEMonitor;
import appeng.api.storage.data.IAEFluidStack;
import appeng.api.storage.data.IAEItemStack;
import appeng.me.GridAccessException;
import appeng.util.Platform;
import appeng.util.item.AEFluidStack;
import appeng.util.item.AEItemStack;
import gregtech.api.interfaces.IOutputBus;
import gregtech.api.interfaces.IOutputHatch;
import gregtech.api.metatileentity.implementations.MTEMultiBlockBase;
import gregtech.api.util.GTUtility;
import gregtech.common.tileentities.machines.outputme.MTEHatchOutputBusME;
import gregtech.common.tileentities.machines.outputme.MTEHatchOutputME;
import hatch.SuperOutputBusME;

/**
 * 压缩缓存与现有输出口之间的有界适配器，不修改 Minecraft、GT 或 AE 的实现。
 * ME 每次接受至多一个 long，普通输出口每次接受至多一个 int，余额继续留在 BigInteger 账本。
 */
public final class ChaosBigOutputRouter implements ChaosBigOutputBuffer.Receiver {

    public static final int MAX_ROUTE_CALLS_PER_TICK = 32;
    public static final int MAX_ENTRIES_PER_TICK = 32;
    public static final int BLOCKED_RETRY_TICKS = 20;

    private final List<IOutputBus> buses;
    private final List<? extends IOutputHatch> hatches;
    private int callsLeft = MAX_ROUTE_CALLS_PER_TICK;

    public ChaosBigOutputRouter(MTEMultiBlockBase controller) {
        buses = controller.getOutputBusses();
        hatches = controller.getOutputHatches();
    }

    @Override
    public boolean hasBudget() {
        return callsLeft > 0;
    }

    @Override
    public long insert(ChaosBigOutputBuffer.Entry entry, long requested) {
        int targets = entry.isItem() ? buses.size() : hatches.size();
        if (targets == 0) return 0;
        // 每种资源每 tick 最多扫描一遍目的地；游标在调用之间保留，堵塞目标不会饿死后续目标。
        for (int visited = 0; visited < targets && callsLeft > 0; visited++) {
            int target = Math.floorMod(entry.routeCursor, targets);
            entry.routeCursor = (target + 1) % targets;
            callsLeft--;
            long accepted = entry.isItem() ? insertItem(buses.get(target), entry, requested)
                : insertFluid(hatches.get(target), entry, requested);
            if (accepted < 0 || accepted > requested)
                throw new IllegalStateException("Invalid Chaos destination receipt");
            // 一次收货立即返回，让账本先提交余额；不把多次真实插入藏在一个延迟回执中。
            if (accepted > 0) return accepted;
        }
        return 0;
    }

    private static long insertItem(IOutputBus bus, ChaosBigOutputBuffer.Entry entry, long amount) {
        if (bus.isFiltered() && !bus.isFilteredToItem((GTUtility.ItemId) entry.identity)) return 0;
        try {
            // 使用控制器的 BigInteger 缓存，直接向该输出口连接的 ME 网络交付，不填充旧 long 缓存。
            if (bus instanceof SuperOutputBusME) {
                SuperOutputBusME me = (SuperOutputBusME) bus;
                if (!me.getProxy()
                    .isActive()) return 0;
                return injectItem(
                    me.getProxy()
                        .getStorage()
                        .getItemInventory(),
                    me.getProxy()
                        .getEnergy(),
                    entry.item,
                    amount,
                    me.getActionSource());
            }
            if (bus instanceof MTEHatchOutputBusME) {
                MTEHatchOutputBusME me = (MTEHatchOutputBusME) bus;
                if (!me.getProxy()
                    .isActive()) return 0;
                return injectItem(
                    me.getProxy()
                        .getStorage()
                        .getItemInventory(),
                    me.getProxy()
                        .getEnergy(),
                    entry.item,
                    amount,
                    me.getActionSource());
            }
        } catch (GridAccessException unavailable) {
            return 0;
        }
        ItemStack stack = entry.item.copy();
        int offered = (int) Math.min(Integer.MAX_VALUE, amount);
        stack.stackSize = offered;
        bus.storePartial(stack, false);
        return (long) offered - stack.stackSize;
    }

    private static long insertFluid(IOutputHatch hatch, ChaosBigOutputBuffer.Entry entry, long amount) {
        if (hatch.isFiltered() && !hatch.isFilteredToFluid((GTUtility.FluidId) entry.identity)) return 0;
        if (hatch instanceof MTEHatchOutputME) {
            MTEHatchOutputME me = (MTEHatchOutputME) hatch;
            if (!me.getProxy()
                .isActive()) return 0;
            try {
                IMEMonitor<IAEFluidStack> inventory = me.getProxy()
                    .getStorage()
                    .getFluidInventory();
                IAEFluidStack request = AEFluidStack.create(entry.fluid);
                IAEFluidStack existing = inventory.getStorageList()
                    .findPrecise(request);
                long offered = Math.min(
                    Math.min(amount, Long.MAX_VALUE - request.getAmountPerUnit()),
                    headroom(existing == null ? 0 : existing.getStackSize()));
                if (offered == 0) return 0;
                request.setStackSize(offered);
                IAEFluidStack rejected = Platform.poweredInsert(
                    me.getProxy()
                        .getEnergy(),
                    inventory,
                    request,
                    me.getActionSource());
                return offered - (rejected == null ? 0 : rejected.getStackSize());
            } catch (GridAccessException unavailable) {
                return 0;
            }
        }
        FluidStack stack = entry.fluid.copy();
        int offered = (int) Math.min(Integer.MAX_VALUE, amount);
        stack.amount = offered;
        hatch.storePartial(stack, false);
        return (long) offered - stack.amount;
    }

    private static long injectItem(IMEMonitor<IAEItemStack> inventory, IEnergySource energy, ItemStack prototype,
        long amount, appeng.api.networking.security.BaseActionSource source) {
        IAEItemStack request = AEItemStack.create(prototype);
        IAEItemStack existing = inventory.getStorageList()
            .findPrecise(request);
        // 本依赖的 Platform.ceilDiv 先 addExact(a, unit) 再减 1；保留 unit 的余量以免耗能计算溢出。
        long offered = Math.min(
            Math.min(amount, Long.MAX_VALUE - request.getAmountPerUnit()),
            headroom(existing == null ? 0 : existing.getStackSize()));
        if (offered == 0) return 0;
        request.setStackSize(offered);
        IAEItemStack rejected = Platform.poweredInsert(energy, inventory, request, source);
        return offered - (rejected == null ? 0 : rejected.getStackSize());
    }

    /** AE 的单种资源总数仍是 long；先减再插入，避免网络数量加法溢出。 */
    public static long headroom(long stored) {
        return stored < 0 ? 0 : Long.MAX_VALUE - stored;
    }
}
