package hatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.metatileentity.implementations.MTEHatchInput;
import gregtech.api.metatileentity.implementations.MTEHatchInputBus;
import gregtech.api.metatileentity.implementations.MTEHatchInputDebug;
import gregtech.api.metatileentity.implementations.MTEHatchMultiInput;
import gregtech.api.metatileentity.implementations.MTEMultiBlockBase;
import gregtech.api.util.GTUtility;
import gregtech.common.tileentities.machines.MTEHatchCraftingInputME;
import gregtech.common.tileentities.machines.MTEHatchInputBusME;
import gregtech.common.tileentities.machines.MTEHatchInputME;

/**
 * GT-Not-Hard 控制器的完整压缩资源组收集器。
 *
 * <p>
 * GT 原版通过 Map&lt;ItemId, ItemStack&gt; 与 Map&lt;Fluid, FluidStack&gt; 去重 ME 库存。
 * 直接向原版返回多片相同资源会只留下最后一片，因此必须把“单个堆栈”改为“整组分片”后去重。
 * 本类只供本 Mod 控制器显式调用，不修改 GT、GTNL、AE 或其他 Mod 的类。
 *
 * <p>
 * 沿用原版跨 ME 仓室按资源类型去重的保守规则：同类型只选择一个来源。
 * 大数量来源优先于原版来源；多个大数量来源选择初始可用量最大的一组，不将共享库存相加。
 * 不同 ME 网络的同类型资源也不合并，和原版一样避免重复申报，但会低估独立网络的合计量。
 */
public final class SuperInputProcessing {

    /** 工具类不需要实例。 */
    private SuperInputProcessing() {}

    /**
     * 收集普通输入总线、原版 ME 总线和大数量 ME 总线的完整物品输入。
     *
     * @param controller     当前机器
     * @param color          当前输入颜色，empty 表示不按颜色筛选
     * @param originalInputs 原版收集结果，没有大数量总线时直接返回以保留原行为
     * @return 包含原始可消耗引用的输入列表
     */
    public static ArrayList<ItemStack> collectItemInputs(MTEMultiBlockBase controller, Optional<Byte> color,
        ArrayList<ItemStack> originalInputs) {
        // 没有大数量总线时无需重新收集原版库存。
        boolean hasSuperBus = false;
        // 先检查结构实际接入的有效总线。
        for (MTEHatchInputBus bus : GTUtility.validMTEList(controller.mInputBusses)) {
            // 仅当前颜色组的大数量总线需要特殊处理。
            if (bus instanceof SuperInputBusME && matchesColor(bus.getColor(), color)) hasSuperBus = true;
        }
        // 保留其他机器原有输入集合和对象顺序。
        if (!hasSuperBus) return originalInputs;
        // 普通物理库存可以正常相加，不参与 ME 共享库存去重。
        ArrayList<ItemStack> itemInputs = new ArrayList<>();
        // 每个 ME 资源键保存一整组分片，不能把分片当作不同库存来源。
        Map<GTUtility.ItemId, InputGroup<ItemStack>> meInputs = new LinkedHashMap<>();
        // 保留原版总线结构顺序与颜色过滤规则。
        for (MTEHatchInputBus bus : GTUtility.validMTEList(controller.mInputBusses)) {
            // 合成输入总线仍由 GT 自己的专用路径处理。
            if (bus instanceof MTEHatchCraftingInputME || !matchesColor(bus.getColor(), color)) continue;
            // 维持原版把控制器配方表传给输入总线的行为。
            bus.mRecipeMap = controller.getRecipeMap();
            // 大数量总线需要先处理整组快照，不能走普通 ME 单堆栈去重。
            if (bus instanceof SuperInputBusME) {
                // 保持 Java 8 字节码兼容，不使用模式匹配语法。
                SuperInputBusME superBus = (SuperInputBusME) bus;
                // 按每种资源的完整快照进行来源选择。
                for (SuperInputAmountHelper.Snapshot<ItemStack> snapshot : superBus.getRecipeItemSnapshots()) {
                    // 使用独立原型生成类型、元数据、NBT 都一致的键。
                    GTUtility.ItemId itemId = GTUtility.ItemId.createNoCopy(snapshot.getPrototype());
                    // 分片列表内的所有引用作为一个整体保留或舍弃。
                    putGroup(meInputs, itemId, snapshot.getStacks(), snapshot.getInitialAmount(), true);
                }
                // 真实手动库存独立于 ME 网络，必须作为普通物理物品参与配方。
                ItemStack manualStack = superBus.mInventory[superBus.getManualSlot()];
                // 保留原版反向枚举时手动槽先于电路槽的次序。
                if (manualStack != null) itemInputs.add(manualStack);
                // 电路槽使用原版数量 0 的工具语义，不能复制或改成 1。
                ItemStack circuitStack = superBus.mInventory[superBus.getCircuitSlot()];
                // 配方直接读取原始电路引用。
                if (circuitStack != null) itemInputs.add(circuitStack);
                // 大数量总线已完整处理，不再按动态槽遍历重复添加分片。
                continue;
            }
            // 其他总线沿用原版反向槽位收集顺序。
            for (int slotIndex = bus.getSizeInventory() - 1; slotIndex >= 0; slotIndex--) {
                // 读取库存引用，不复制真实物理物品。
                ItemStack stack = bus.getStackInSlot(slotIndex);
                // 空槽不参与配方。
                if (stack == null) continue;
                // 原版 ME 来源仍按类型去重，但不能覆盖已选择的大数量整组。
                if (bus instanceof MTEHatchInputBusME) {
                    // 单个原版堆栈也表示为组，以统一来源选择逻辑。
                    putGroup(
                        meInputs,
                        GTUtility.ItemId.createNoCopy(stack),
                        Collections.singletonList(stack),
                        Math.max(0, stack.stackSize),
                        false);
                } else {
                    // 普通总线中的物品是独立库存，可以与其他总线累计。
                    itemInputs.add(stack);
                }
            }
        }
        // 保留 GT 原版控制器 1 号槽中的集成电路检查。
        ItemStack controllerStack = controller.getStackInSlot(1);
        // 原版仅把以该前缀命名的电路附加到输入中。
        if (controllerStack != null && controllerStack.getUnlocalizedName()
            .startsWith("gt.integrated_circuit")) {
            // 必须使用原引用，保持原版工具/消耗语义。
            itemInputs.add(controllerStack);
        }
        // 去重完成后一次性展开所选资源组，保留各资源的唯一账本视图。
        for (InputGroup<ItemStack> group : meInputs.values()) {
            // addAll 只复制引用，GT 减量能反馈到仓室快照。
            itemInputs.addAll(group.stacks);
        }
        // 返回普通库存与完整 ME 分片组成的输入集合。
        return itemInputs;
    }

    /**
     * 收集普通、多流体、调试、原版 ME 和大数量 ME 输入仓。
     *
     * @param controller     当前机器
     * @param color          当前输入颜色，empty 表示全部颜色
     * @param originalInputs 原版结果，没有大数量仓时原样返回
     * @return 含所有所选流体分片原引用的列表
     */
    public static ArrayList<FluidStack> collectFluidInputs(MTEMultiBlockBase controller, Optional<Byte> color,
        ArrayList<FluidStack> originalInputs) {
        // 检查是否真的需要启用大数量收集逻辑。
        boolean hasSuperHatch = false;
        // 只检测当前结构中有效且颜色匹配的仓室。
        for (MTEHatchInput hatch : GTUtility.validMTEList(controller.mInputHatches)) {
            // 大数量仓保持普通输入仓的结构识别类型。
            if (hatch instanceof SuperInputHatchME && matchesColor(hatch.getColor(), color)) hasSuperHatch = true;
        }
        // 未接入大数量仓时完整保留原版路径。
        if (!hasSuperHatch) return originalInputs;
        // 普通流体仓中的液体是物理库存，直接保留引用。
        ArrayList<FluidStack> fluidInputs = new ArrayList<>();
        // 延续 GT 按 Fluid 资源类型去重的规则，但值改为完整压缩资源组组。
        Map<Fluid, InputGroup<FluidStack>> meInputs = new LinkedHashMap<>();
        // 依次处理有效输入仓。
        for (MTEHatchInput hatch : GTUtility.validMTEList(controller.mInputHatches)) {
            // 颜色分组与原版 getStoredFluidsForColor 一致。
            if (!matchesColor(hatch.getColor(), color)) continue;
            // 维持输入仓使用控制器配方表的行为。
            hatch.mRecipeMap = controller.getRecipeMap();
            // 大数量仓必须先于原版 ME 仓判断，因为它继承了原版类。
            if (hatch instanceof SuperInputHatchME) {
                // 显式转换保持新增代码可编译为 Java 8。
                SuperInputHatchME superHatch = (SuperInputHatchME) hatch;
                // 每种流体作为一个来源组参与去重。
                for (SuperInputAmountHelper.Snapshot<FluidStack> snapshot : superHatch.getRecipeFluidSnapshots()) {
                    // 保留这一来源的所有分片，不能只保留最后一片。
                    putGroup(
                        meInputs,
                        snapshot.getPrototype()
                            .getFluid(),
                        snapshot.getStacks(),
                        snapshot.getInitialAmount(),
                        true);
                }
            } else if (hatch instanceof MTEHatchMultiInput) {
                // 多流体仓暴露多个独立的真实流体槽。
                for (FluidStack fluid : ((MTEHatchMultiInput) hatch).getStoredFluid()) {
                    // 直接添加非空真实流体引用。
                    if (fluid != null) fluidInputs.add(fluid);
                }
            } else if (hatch instanceof MTEHatchInputME) {
                // 普通 ME 流体仓仍由父类提供已模拟好的单个 int 堆栈。
                for (FluidStack fluid : ((MTEHatchInputME) hatch).getStoredFluids()) {
                    // 没有库存的配置不参与来源选择。
                    if (fluid == null) continue;
                    // 原版来源不能覆盖已存在的大数量来源。
                    putGroup(
                        meInputs,
                        fluid.getFluid(),
                        Collections.singletonList(fluid),
                        Math.max(0, fluid.amount),
                        false);
                }
            } else if (hatch instanceof MTEHatchInputDebug) {
                // 保留原版调试仓的无限流体视图，不改动其真实配置。
                for (FluidStack fluid : ((MTEHatchInputDebug) hatch).getFluidList()) {
                    // 跳过空配置。
                    if (fluid == null) continue;
                    // 原版这里使用副本，是调试仓既有的特殊语义。
                    FluidStack stack = fluid.copy();
                    // 每个调试流体最多暴露一个 int 上限堆栈。
                    stack.amount = Integer.MAX_VALUE;
                    // 将调试视图添加到普通流体列表。
                    fluidInputs.add(stack);
                }
            } else {
                // 普通单流体仓沿用原版 fillableStack 访问方式。
                FluidStack fluid = hatch.getFillableStack();
                // 保留真实引用以便原版配方直接消耗。
                if (fluid != null) fluidInputs.add(fluid);
            }
        }
        // 对每种 ME 流体只展开一个完整来源组。
        for (InputGroup<FluidStack> group : meInputs.values()) {
            // 所有识别视图都保留原引用，结束阶段才能准确计算差额。
            fluidInputs.addAll(group.stacks);
        }
        // 返回所有普通库存与所选 ME 分片。
        return fluidInputs;
    }

    /**
     * 判断当前仓室是否属于本次颜色组。
     *
     * @param hatchColor 仓室颜色，-1 表示未染色
     * @param color      当前控制器颜色组
     * @return 未指定颜色、未染色或颜色相同均为 true
     */
    private static boolean matchesColor(byte hatchColor, Optional<Byte> color) {
        // 完整保留 GT 原版未染色仓室可参与所有颜色组的规则。
        return !color.isPresent() || hatchColor == -1 || hatchColor == color.get();
    }

    /**
     * 原子地选择一个资源来源组，避免同一 ME 库存被重复累计。
     *
     * @param groups        已选择的资源来源
     * @param key           物品身份或 Fluid
     * @param stacks        这一来源的全部分片引用
     * @param initialAmount 这一来源本轮初始可用量
     * @param superInput    是否为新增大数量来源
     * @param <K>           资源身份类型
     * @param <T>           堆栈类型
     */
    private static <K, T> void putGroup(Map<K, InputGroup<T>> groups, K key, List<T> stacks, long initialAmount,
        boolean superInput) {
        // 查询是否已有相同资源的来源，不能将新组直接追加到旧组。
        InputGroup<T> previousGroup = groups.get(key);
        // 两个大数量来源选择可用量较大的一组，数量相同保留先遇到的一组。
        if (previousGroup != null && previousGroup.superInput
            && (!superInput || previousGroup.initialAmount >= initialAmount)) return;
        // 没有旧来源、大数量覆盖原版，或原版覆盖原版时保存整个新组。
        groups.put(key, new InputGroup<>(stacks, initialAmount, superInput));
    }

    /**
     * 一个完整 ME 资源来源，不能把同组的不同分片分别去重。
     *
     * @param <T> ItemStack 或 FluidStack
     */
    private static final class InputGroup<T> {

        /** 来源中的分片列表，列表元素始终是仓室持有的原对象。 */
        private final List<T> stacks;

        /** 用于比较来源规模的初始 long 总量。 */
        private final long initialAmount;

        /** 大数量来源优先，原版来源继续沿用单堆栈行为。 */
        private final boolean superInput;

        /**
         * 保存来源元数据，不复制内部堆栈。
         *
         * @param stacks        所有分片原引用
         * @param initialAmount 初始总量
         * @param superInput    是否为新增大数量仓室
         */
        private InputGroup(List<T> stacks, long initialAmount, boolean superInput) {
            // 不复制堆栈，否则消耗无法反馈到仓室。
            this.stacks = stacks;
            // 比较来源时不能使用 int 求和。
            this.initialAmount = initialAmount;
            // 保存来源优先级。
            this.superInput = superInput;
        }
    }
}
