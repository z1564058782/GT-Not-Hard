package Recipes.ChaosRecipes;

import static gregtech.api.util.GTModHandler.getDistilledWater;
import static gregtech.api.util.GTUtility.areStacksEqual;
import static gregtech.api.util.GTUtility.copyAmount;
import static gregtech.api.util.GTUtility.copyAmountUnsafe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.enums.Materials;
import gregtech.api.recipe.RecipeMaps;
import gregtech.api.util.GTRecipe;
import gregtech.api.util.GTUtility;
import gregtech.api.util.OverclockCalculator;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;

/**
 * 混沌矿石处理厂配方逻辑抽象类
 * 将原版MTEIntegratedOreFactory的矿物处理逻辑抽象为可配置的方法
 * 支持在Chaos机器的矿石处理模式下使用
 */
public abstract class ChaosOreFactoryRecipes {

    // ====================== 配置常量 ======================

    /**
     * 默认每矿石处理所需电量（EU/t）
     */
    public static final long DEFAULT_RECIPE_EUT = 1L;

    /**
     * 默认每矿石处理所需润滑油量（mB）
     */
    public static final int DEFAULT_LUBRICANT_PER_ORE = 1;

    /**
     * 默认每矿石处理所需蒸馏水量（mB）
     */
    public static final int DEFAULT_DISTILLED_WATER_PER_ORE = 1;

    /**
     * 默认最大并行数
     */
    public static final int DEFAULT_MAX_PARALLEL = 1024;

    /**
     * 默认基础时间单位（秒对应的tick数）
     */
    public static final int DEFAULT_SECOND_TICKS = 20;

    // ====================== 矿石类型标识集 ======================

    /**
     * 已纯化粉碎矿石标识集
     */
    protected static final IntOpenHashSet crushedPureOreSet = new IntOpenHashSet();

    /**
     * 热力离心矿石标识集
     */
    protected static final IntOpenHashSet thermalCentrifugedSet = new IntOpenHashSet();

    /**
     * 粉碎矿石标识集
     */
    protected static final IntOpenHashSet crushedOreSet = new IntOpenHashSet();

    /**
     * 不纯粉尘标识集
     */
    protected static final IntOpenHashSet impureDustSet = new IntOpenHashSet();

    /**
     * 纯净粉尘标识集
     */
    protected static final IntOpenHashSet pureDustSet = new IntOpenHashSet();

    /**
     * 矿石标识集
     */
    protected static final IntOpenHashSet oreSet = new IntOpenHashSet();

    /**
     * 初始化标识集标志
     */
    protected static boolean isInitialized = false;

    /**
     * 初始化矿石类型标识集
     * 从矿物词典中收集各类矿石、粉碎矿石、粉尘的标识
     */
    @SuppressWarnings("ForLoopReplaceableByForEach")
    public static void initializeOreSets() {
        if (isInitialized) return;

        for (String name : net.minecraftforge.oredict.OreDictionary.getOreNames()) {
            if (name == null || name.isEmpty()) continue;

            ArrayList<ItemStack> ores = net.minecraftforge.oredict.OreDictionary.getOres(name);

            if (name.startsWith("crushedPurified")) {
                // 已纯化粉碎矿石
                for (int i = 0, size = ores.size(); i < size; i++) {
                    crushedPureOreSet.add(GTUtility.stackToInt(ores.get(i)));
                }
            } else if (name.startsWith("crushedCentrifuged")) {
                // 热力离心矿石
                for (int i = 0, size = ores.size(); i < size; i++) {
                    thermalCentrifugedSet.add(GTUtility.stackToInt(ores.get(i)));
                }
            } else if (name.startsWith("crushed")) {
                // 粉碎矿石
                for (int i = 0, size = ores.size(); i < size; i++) {
                    crushedOreSet.add(GTUtility.stackToInt(ores.get(i)));
                }
            } else if (name.startsWith("dustImpure")) {
                // 不纯粉尘
                for (int i = 0, size = ores.size(); i < size; i++) {
                    impureDustSet.add(GTUtility.stackToInt(ores.get(i)));
                }
            } else if (name.startsWith("dustPure")) {
                // 纯净粉尘
                for (int i = 0, size = ores.size(); i < size; i++) {
                    pureDustSet.add(GTUtility.stackToInt(ores.get(i)));
                }
            } else if (name.startsWith("ore") || name.startsWith("rawOre")) {
                // 矿石
                for (int i = 0, size = ores.size(); i < size; i++) {
                    oreSet.add(GTUtility.stackToInt(ores.get(i)));
                }
            }
        }

        isInitialized = true;
    }

    // ====================== 矿石处理逻辑接口 ======================

    /**
     * 矿石处理配置接口
     * 用于传递矿石处理所需的各种配置参数
     */
    public static class OreProcessingConfig {

        /**
         * 处理模式 (0-6)
         */
        public int processingMode = 0;

        /**
         * 是否弃石模式（弃置石头粉尘）
         */
        public boolean voidStoneMode = false;

        /**
         * 每矿石所需电量（EU/t）
         */
        public long powerPerOre = DEFAULT_RECIPE_EUT;

        /**
         * 每矿石所需润滑油量（mB）
         */
        public int lubricantPerOre = DEFAULT_LUBRICANT_PER_ORE;

        /**
         * 每矿石所需蒸馏水量（mB）
         */
        public int distilledWaterPerOre = DEFAULT_DISTILLED_WATER_PER_ORE;

        /**
         * 最大并行数（由外部传入）
         */
        public int maxParallel = DEFAULT_MAX_PARALLEL;

        /**
         * 可用电压
         */
        public long availableVoltage = 0L;

        /**
         * 输入流体列表（引用）
         */
        public List<FluidStack> inputFluids = null;

        /**
         * 输入物品列表（引用）
         */
        public List<ItemStack> inputItems = null;

        /**
         * 超频计算器（由外部传入）
         */
        public OverclockCalculator overclockCalculator = null;
    }

    /**
     * 矿石处理结果接口
     * 用于返回矿石处理的各种结果
     */
    public static class OreProcessingResult {

        /**
         * 处理是否成功
         */
        public boolean success = false;

        /**
         * 实际使用的并行数
         */
        public int usedParallel = 0;

        /**
         * 每tick消耗的电量
         */
        public long powerPerTick = 0L;

        /**
         * 总电量消耗
         */
        public long totalPower = 0L;

        /**
         * 处理时间（ticks）
         */
        public int processingTime = 0;

        /**
         * 输出物品数组
         */
        public ItemStack[] outputItems = null;

        /**
         * 输出流体数组
         */
        public FluidStack[] outputFluids = null;

        /**
         * 消耗的润滑油量
         */
        public int consumedLubricant = 0;

        /**
         * 消耗的蒸馏水量
         */
        public int consumedDistilledWater = 0;

        /**
         * 消耗的输入物品列表
         */
        public List<ItemStack> consumedItems = null;

        /**
         * 错误消息（如果处理失败）
         */
        public String errorMessage = "";
    }

    // ====================== 核心处理逻辑 ======================

    /**
     * 执行矿石处理
     * 这是主要的矿石处理入口方法
     *
     * @param config 矿石处理配置
     * @return 矿石处理结果
     */
    public static OreProcessingResult processOres(OreProcessingConfig config) {
        OreProcessingResult result = new OreProcessingResult();

        // 初始化矿石标识集
        if (!isInitialized) {
            initializeOreSets();
        }

        // 验证输入
        if (config.inputItems == null || config.inputItems.isEmpty()) {
            result.errorMessage = "No input items";
            return result;
        }

        // 验证最大并行数
        if (config.maxParallel <= 0) {
            result.errorMessage = "Invalid parallel count";
            return result;
        }

        // 获取基础处理时间
        int baseProcessingTime = getProcessingTime(config.processingMode, DEFAULT_SECOND_TICKS);

        // 根据物品计算实际使用的并行数
        int itemParallel = calculateItemParallel(config, config.maxParallel);
        if (itemParallel <= 0) {
            result.errorMessage = "No valid ore input";
            return result;
        }

        // 根据流体计算实际使用的并行数
        int fluidParallel = itemParallel;
        if (config.inputFluids != null && !config.inputFluids.isEmpty()) {
            fluidParallel = calculateFluidParallel(config, itemParallel);
            if (fluidParallel <= 0) {
                result.errorMessage = "Insufficient fluids";
                return result;
            }
        }

        // 最终并行数为物品和流体限制中的较小值
        int finalParallel = Math.min(itemParallel, fluidParallel);

        // 计算处理时间和功耗（使用外部传入的超频计算器）
        OverclockCalculator calculator = config.overclockCalculator;
        int processingTime = baseProcessingTime;
        long powerPerTick = config.powerPerOre * finalParallel;

        if (calculator != null) {
            // 使用外部超频计算器
            calculator.setEUt(config.availableVoltage)
                .setRecipeEUt(config.powerPerOre * finalParallel)
                .setDuration(baseProcessingTime)
                .setParallel(finalParallel)
                .calculate();

            processingTime = calculator.getDuration();
            powerPerTick = calculator.getConsumption();
        } else {
            // 无超频，简单计算
            processingTime = baseProcessingTime;
            powerPerTick = config.powerPerOre * finalParallel;
        }

        // 总电量消耗
        long totalPower = powerPerTick * processingTime;

        // 消耗流体
        int consumedLubricant = finalParallel * config.lubricantPerOre;
        int consumedDistilledWater = finalParallel * config.distilledWaterPerOre;

        // 处理矿石并生成输出，同时获取消耗的物品
        ProcessedOreResult processedResult = processOreItemsWithConsumption(config, finalParallel);

        // 设置结果
        result.success = true;
        result.usedParallel = finalParallel;
        result.totalPower = totalPower;
        result.powerPerTick = powerPerTick;
        result.processingTime = processingTime;
        result.outputItems = processedResult.outputItems;
        result.outputFluids = new FluidStack[0]; // 矿石处理通常不产生流体输出
        result.consumedLubricant = consumedLubricant;
        result.consumedDistilledWater = consumedDistilledWater;
        result.consumedItems = processedResult.consumedItems;

        return result;
    }

    /**
     * 根据流体计算最大并行数
     *
     * @param config      矿石处理配置
     * @param maxParallel 当前最大并行数
     * @return 考虑流体限制后的并行数
     */
    private static int calculateFluidParallel(OreProcessingConfig config, int maxParallel) {
        int lubricantAmount = 0;
        int distilledWaterAmount = 0;

        // 统计可用流体
        for (FluidStack fluid : config.inputFluids) {
            if (fluid == null) continue;

            if (areFluidsEqual(fluid, getDistilledWater(1L))) {
                distilledWaterAmount += fluid.amount;
            } else if (areFluidsEqual(fluid, Materials.Lubricant.getFluid(1L))) {
                lubricantAmount += fluid.amount;
            }
        }

        // 计算并行限制
        int lubricantParallel = lubricantAmount / config.lubricantPerOre;
        int waterParallel = distilledWaterAmount / config.distilledWaterPerOre;

        return Math.min(maxParallel, Math.min(lubricantParallel, waterParallel));
    }

    /**
     * 根据物品计算最大并行数
     *
     * @param config      矿石处理配置
     * @param maxParallel 当前最大并行数
     * @return 考虑物品限制后的并行数
     */
    private static int calculateItemParallel(OreProcessingConfig config, int maxParallel) {
        int itemCount = 0;

        for (ItemStack stack : config.inputItems) {
            if (stack == null) continue;

            int itemId = GTUtility.stackToInt(stack);
            if (itemId == 0) continue;

            // 检查是否为有效矿石类型
            if (isValidOreType(itemId)) {
                if (itemCount + stack.stackSize <= maxParallel) {
                    itemCount += stack.stackSize;
                } else {
                    itemCount = maxParallel;
                    break;
                }
            }
        }

        return itemCount;
    }

    /**
     * 检查物品是否为有效的矿石类型
     *
     * @param itemId 物品ID
     * @return 是否为有效矿石类型
     */
    public static boolean isValidOreType(int itemId) {
        return oreSet.contains(itemId) || crushedOreSet.contains(itemId)
            || crushedPureOreSet.contains(itemId)
            || thermalCentrifugedSet.contains(itemId)
            || pureDustSet.contains(itemId)
            || impureDustSet.contains(itemId);
    }

    /**
     * 处理矿石的结果（包含输出和消耗）
     */
    private static class ProcessedOreResult {

        public ItemStack[] outputItems;
        public List<ItemStack> consumedItems;
    }

    /**
     * 处理矿石物品并生成输出，同时记录消耗
     *
     * @param config   矿石处理配置
     * @param parallel 并行数
     * @return 处理结果
     */
    private static ProcessedOreResult processOreItemsWithConsumption(OreProcessingConfig config, int parallel) {
        ProcessedOreResult result = new ProcessedOreResult();
        List<ItemStack> oreStacks = new ArrayList<>();
        List<ItemStack> consumedStacks = new ArrayList<>();
        int remaining = parallel;

        // 收集要处理的矿石
        for (ItemStack stack : config.inputItems) {
            if (stack == null || stack.stackSize <= 0) continue;

            int itemId = GTUtility.stackToInt(stack);
            if (!isValidOreType(itemId)) continue;

            if (remaining >= stack.stackSize) {
                // 全部消耗
                oreStacks.add(copyAmount(stack.stackSize, stack));
                consumedStacks.add(copyAmount(stack.stackSize, stack));
                remaining -= stack.stackSize;
            } else {
                // 部分消耗
                oreStacks.add(copyAmount(remaining, stack));
                consumedStacks.add(copyAmount(remaining, stack));
                remaining = 0;
                break;
            }
        }

        // 处理矿石（根据模式）
        ItemStack[] processedItems = oreStacks.toArray(new ItemStack[0]);
        processedItems = applyProcessingMode(
            processedItems,
            config.processingMode,
            config.voidStoneMode,
            config.inputFluids);

        result.outputItems = processedItems;
        result.consumedItems = consumedStacks;
        return result;
    }

    // ====================== 处理模式应用 ======================

    /**
     * 应用处理模式到矿石
     *
     * @param inputItems  输入物品
     * @param mode        处理模式
     * @param voidStone   是否弃石
     * @param inputFluids 输入流体（用于化学洗涤）
     * @return 处理后的物品
     */
    public static ItemStack[] applyProcessingMode(ItemStack[] inputItems, int mode, boolean voidStone,
        List<FluidStack> inputFluids) {
        if (inputItems == null || inputItems.length == 0) {
            return new ItemStack[0];
        }

        // 根据模式应用不同的处理流程
        switch (mode) {
            case 0 -> {
                // 模式0: 破碎 -> 洗矿 -> 热离 -> 破碎
                inputItems = applyMacerator(inputItems, oreSet);
                inputItems = applyOreWasher(inputItems, crushedOreSet);
                inputItems = applyThermalCentrifuge(inputItems, crushedPureOreSet, crushedOreSet);
                inputItems = applyMacerator(
                    inputItems,
                    thermalCentrifugedSet,
                    oreSet,
                    crushedOreSet,
                    crushedPureOreSet);
            }
            case 1 -> {
                // 模式1: 破碎 -> 洗矿 -> 破碎 -> 离心
                inputItems = applyMacerator(inputItems, oreSet);
                inputItems = applyOreWasher(inputItems, crushedOreSet);
                inputItems = applyMacerator(inputItems, oreSet, crushedOreSet, crushedPureOreSet);
                inputItems = applyCentrifuge(inputItems, impureDustSet, pureDustSet);
            }
            case 2 -> {
                // 模式2: 破碎 -> 破碎 -> 离心
                inputItems = applyMacerator(inputItems, oreSet);
                inputItems = applyMacerator(
                    inputItems,
                    thermalCentrifugedSet,
                    oreSet,
                    crushedOreSet,
                    crushedPureOreSet);
                inputItems = applyCentrifuge(inputItems, impureDustSet, pureDustSet);
            }
            case 3 -> {
                // 模式3: 破碎 -> 洗矿 -> 筛矿
                inputItems = applyMacerator(inputItems, oreSet);
                inputItems = applyOreWasher(inputItems, crushedOreSet);
                inputItems = applySifter(inputItems, crushedPureOreSet);
            }
            case 4 -> {
                // 模式4: 破碎 -> 化学洗 -> 破碎 -> 离心
                inputItems = applyMacerator(inputItems, oreSet);
                inputItems = applyChemicalBath(inputItems, crushedOreSet, crushedPureOreSet, inputFluids);
                inputItems = applyMacerator(inputItems, crushedOreSet, crushedPureOreSet);
                inputItems = applyCentrifuge(inputItems, impureDustSet, pureDustSet);
            }
            case 5 -> {
                // 模式5: 破碎 -> 化学洗 -> 热离 -> 破碎
                inputItems = applyMacerator(inputItems, oreSet);
                inputItems = applyChemicalBath(inputItems, crushedOreSet, crushedPureOreSet, inputFluids);
                inputItems = applyThermalCentrifuge(inputItems, crushedPureOreSet, crushedOreSet);
                inputItems = applyMacerator(
                    inputItems,
                    thermalCentrifugedSet,
                    oreSet,
                    crushedOreSet,
                    crushedPureOreSet);
            }
            case 6 -> {
                // 模式6: 锻压 -> 锻压 -> 简单洗
                inputItems = applyHammer(inputItems, oreSet);
                inputItems = applyHammer(inputItems, thermalCentrifugedSet, oreSet, crushedOreSet, crushedPureOreSet);
                inputItems = applySimpleWasher(inputItems, impureDustSet, pureDustSet);
            }
            default -> {
                // 无效模式，返回原物品
                return inputItems;
            }
        }

        // 应用弃石逻辑和压缩相同物品
        inputItems = compressAndVoid(inputItems, voidStone);

        return inputItems;
    }

    // ====================== 单个处理单元方法 ======================

    /**
     * 应用破碎机处理
     *
     * @param items      输入物品
     * @param validTypes 有效的物品类型集合
     * @return 处理后的物品
     */
    public static ItemStack[] applyMacerator(ItemStack[] items, IntOpenHashSet... validTypes) {
        return applyRecipeProcessing(items, RecipeMaps.maceratorRecipes, validTypes);
    }

    /**
     * 应用洗矿机处理
     *
     * @param items      输入物品
     * @param validTypes 有效的物品类型集合
     * @return 处理后的物品
     */
    public static ItemStack[] applyOreWasher(ItemStack[] items, IntOpenHashSet... validTypes) {
        return applyFluidRecipeProcessing(
            items,
            RecipeMaps.oreWasherRecipes,
            getDistilledWater(Integer.MAX_VALUE),
            validTypes);
    }

    /**
     * 应用热力离心机处理
     *
     * @param items      输入物品
     * @param validTypes 有效的物品类型集合
     * @return 处理后的物品
     */
    public static ItemStack[] applyThermalCentrifuge(ItemStack[] items, IntOpenHashSet... validTypes) {
        return applyRecipeProcessing(items, RecipeMaps.thermalCentrifugeRecipes, validTypes);
    }

    /**
     * 应用离心机处理
     *
     * @param items      输入物品
     * @param validTypes 有效的物品类型集合
     * @return 处理后的物品
     */
    public static ItemStack[] applyCentrifuge(ItemStack[] items, IntOpenHashSet... validTypes) {
        return applyRecipeProcessing(items, RecipeMaps.centrifugeRecipes, validTypes);
    }

    /**
     * 应用筛矿机处理
     *
     * @param items      输入物品
     * @param validTypes 有效的物品类型集合
     * @return 处理后的物品
     */
    public static ItemStack[] applySifter(ItemStack[] items, IntOpenHashSet... validTypes) {
        return applyRecipeProcessing(items, RecipeMaps.sifterRecipes, validTypes);
    }

    /**
     * 应用化学洗涤处理
     *
     * @param items       输入物品
     * @param validTypes  有效的物品类型集合
     * @param inputFluids 输入流体列表
     * @return 处理后的物品
     */
    public static ItemStack[] applyChemicalBath(ItemStack[] items, IntOpenHashSet[] validTypes,
        List<FluidStack> inputFluids) {
        // 转换参数格式
        if (validTypes == null || validTypes.length == 0) {
            return items;
        }

        IntOpenHashSet validType1 = validTypes[0];
        IntOpenHashSet validType2 = validTypes.length > 1 ? validTypes[1] : null;

        return applyChemicalBath(items, validType1, validType2, inputFluids);
    }

    /**
     * 应用化学洗涤处理（重载）
     */
    public static ItemStack[] applyChemicalBath(ItemStack[] items, IntOpenHashSet validType1, IntOpenHashSet validType2,
        List<FluidStack> inputFluids) {
        List<ItemStack> result = new ArrayList<>();

        if (items == null) return new ItemStack[0];

        for (ItemStack stack : items) {
            if (stack == null) continue;

            int itemId = GTUtility.stackToInt(stack);
            boolean isValid = false;

            if (validType1 != null && validType1.contains(itemId)) {
                isValid = true;
            } else if (validType2 != null && validType2.contains(itemId)) {
                isValid = true;
            }

            if (isValid) {
                // 查找化学洗涤配方
                GTRecipe recipe = RecipeMaps.chemicalBathRecipes.findRecipeQuery()
                    .items(stack)
                    .fluids(inputFluids.toArray(new FluidStack[0]))
                    .find();

                if (recipe != null && recipe.getRepresentativeFluidInput(0) != null) {
                    FluidStack requiredFluid = recipe.getRepresentativeFluidInput(0)
                        .copy();
                    // 这里简化处理，实际实现需要检查可用流体
                    result.addAll(getRecipeOutputs(recipe, stack.stackSize));
                } else {
                    result.add(stack);
                }
            } else {
                result.add(stack);
            }
        }

        return result.toArray(new ItemStack[0]);
    }

    /**
     * 应用锻压处理
     *
     * @param items      输入物品
     * @param validTypes 有效的物品类型集合
     * @return 处理后的物品
     */
    public static ItemStack[] applyHammer(ItemStack[] items, IntOpenHashSet... validTypes) {
        return applyRecipeProcessing(items, RecipeMaps.hammerRecipes, validTypes);
    }

    /**
     * 应用简单洗涤处理
     *
     * @param items      输入物品
     * @param validTypes 有效的物品类型集合
     * @return 处理后的物品
     */
    public static ItemStack[] applySimpleWasher(ItemStack[] items, IntOpenHashSet... validTypes) {
        // 简单洗涤需要水
        FluidStack water = Materials.Water.getFluid(100);
        return applyFluidRecipeProcessing(
            items,
            gtPlusPlus.api.recipe.GTPPRecipeMaps.simpleWasherRecipes,
            water,
            validTypes);
    }

    // ====================== 辅助方法 ======================

    /**
     * 应用配方处理（通用）
     */
    private static ItemStack[] applyRecipeProcessing(ItemStack[] items, gregtech.api.recipe.RecipeMap<?> recipeMap,
        IntOpenHashSet... validTypes) {
        List<ItemStack> result = new ArrayList<>();

        if (items == null) return new ItemStack[0];

        for (ItemStack stack : items) {
            if (stack == null) continue;

            int itemId = GTUtility.stackToInt(stack);
            if (isInAnySet(itemId, validTypes)) {
                GTRecipe recipe = recipeMap.findRecipeQuery()
                    .items(stack)
                    .find();

                if (recipe != null) {
                    result.addAll(getRecipeOutputs(recipe, stack.stackSize));
                } else {
                    result.add(stack);
                }
            } else {
                result.add(stack);
            }
        }

        return result.toArray(new ItemStack[0]);
    }

    /**
     * 应用需要流体的配方处理
     */
    private static ItemStack[] applyFluidRecipeProcessing(ItemStack[] items, gregtech.api.recipe.RecipeMap<?> recipeMap,
        FluidStack requiredFluid, IntOpenHashSet... validTypes) {
        List<ItemStack> result = new ArrayList<>();

        if (items == null) return new ItemStack[0];

        for (ItemStack stack : items) {
            if (stack == null) continue;

            int itemId = GTUtility.stackToInt(stack);
            if (isInAnySet(itemId, validTypes)) {
                GTRecipe recipe = recipeMap.findRecipeQuery()
                    .items(stack)
                    .fluids(requiredFluid)
                    .find();

                if (recipe != null) {
                    result.addAll(getRecipeOutputs(recipe, stack.stackSize));
                } else {
                    result.add(stack);
                }
            } else {
                result.add(stack);
            }
        }

        return result.toArray(new ItemStack[0]);
    }

    /**
     * 检查物品是否在任意集合中
     */
    private static boolean isInAnySet(int itemId, IntOpenHashSet... sets) {
        if (sets == null) return false;

        for (IntOpenHashSet set : sets) {
            if (set != null && set.contains(itemId)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 获取配方输出（考虑概率）
     */
    private static List<ItemStack> getRecipeOutputs(GTRecipe recipe, int multiplier) {
        List<ItemStack> outputs = new ArrayList<>();

        if (recipe == null || recipe.mOutputs == null) return outputs;

        for (int i = 0; i < recipe.mOutputs.length; i++) {
            ItemStack output = recipe.getOutput(i);
            if (output == null) continue;

            int chance = recipe.getOutputChance(i);
            if (chance == 10000) {
                // 100%概率，直接相乘
                outputs.add(copyAmountUnsafe(multiplier * output.stackSize, output));
            } else {
                // 概率输出，使用正态分布
                double mean = multiplier * (chance / 10000.0);
                double variance = multiplier * (chance / 10000.0) * (1 - (chance / 10000.0));
                Random random = new Random();
                int amount = (int) Math.ceil(Math.sqrt(variance) * random.nextGaussian() + mean);
                if (amount > 0) {
                    outputs.add(copyAmountUnsafe(amount * output.stackSize, output));
                }
            }
        }

        return outputs.stream()
            .filter(stack -> stack != null && stack.stackSize > 0)
            .collect(Collectors.toList());
    }

    /**
     * 压缩相同物品并应用弃石逻辑
     */
    public static ItemStack[] compressAndVoid(ItemStack[] items, boolean voidStone) {
        if (items == null || items.length == 0) {
            return new ItemStack[0];
        }

        HashMap<Integer, Integer> compressedMap = new HashMap<>();

        for (ItemStack stack : items) {
            if (stack == null) continue;

            // 弃石逻辑
            if (voidStone && areStacksEqual(Materials.Stone.getDust(1), stack)) {
                continue;
            }

            int itemId = GTUtility.stackToInt(stack);
            if (itemId != 0) {
                compressedMap.merge(itemId, stack.stackSize, Integer::sum);
            }
        }

        ItemStack[] result = new ItemStack[compressedMap.size()];
        int index = 0;

        for (Integer itemId : compressedMap.keySet()) {
            ItemStack baseStack = GTUtility.intToStack(itemId);
            result[index] = copyAmountUnsafe(compressedMap.get(itemId), baseStack);
            index++;
        }

        return result;
    }

    /**
     * 检查两个流体是否相等
     */
    private static boolean areFluidsEqual(FluidStack a, FluidStack b) {
        if (a == null || b == null) return false;
        return a.isFluidEqual(b);
    }

    // ====================== 时间计算方法 ======================

    /**
     * 根据处理模式获取处理时间
     * 
     * @param mode     处理模式 (0-6)
     * @param tickTime 基础时间单位
     * @return 该模式下的处理时间
     */
    public static int getProcessingTime(int mode, int tickTime) {
        return switch (mode) {
            case 0 -> 30 * tickTime; // 模式0: 30秒
            case 1 -> 15 * tickTime; // 模式1: 15秒
            case 2 -> 10 * tickTime; // 模式2: 10秒
            case 3 -> 20 * tickTime; // 模式3: 20秒
            case 4 -> 17 * tickTime; // 模式4: 17秒
            case 5 -> 32 * tickTime; // 模式5: 32秒
            case 6 -> 1 * tickTime; // 模式6: 1秒
            default -> 1000000000; // 默认: 极大值（错误模式）
        };
    }

    // ====================== 配置获取方法 ======================

    /**
     * 创建默认配置
     */
    public static OreProcessingConfig createDefaultConfig() {
        OreProcessingConfig config = new OreProcessingConfig();
        config.processingMode = 0;
        config.voidStoneMode = false;
        config.powerPerOre = DEFAULT_RECIPE_EUT;
        config.lubricantPerOre = DEFAULT_LUBRICANT_PER_ORE;
        config.distilledWaterPerOre = DEFAULT_DISTILLED_WATER_PER_ORE;
        config.maxParallel = DEFAULT_MAX_PARALLEL;
        return config;
    }

    /**
     * 获取显示模式描述
     */
    public static List<String> getModeDescription(int mode) {
        List<String> description = new ArrayList<>();

        switch (mode) {
            case 0 -> description.addAll(Arrays.asList("破碎", "->", "洗矿", "->", "热力离心", "->", "破碎"));
            case 1 -> description.addAll(Arrays.asList("破碎", "->", "洗矿", "->", "破碎", "->", "离心"));
            case 2 -> description.addAll(Arrays.asList("破碎", "->", "破碎", "->", "离心"));
            case 3 -> description.addAll(Arrays.asList("破碎", "->", "洗矿", "->", "筛矿"));
            case 4 -> description.addAll(Arrays.asList("破碎", "->", "化学洗涤", "->", "破碎", "->", "离心"));
            case 5 -> description.addAll(Arrays.asList("破碎", "->", "化学洗涤", "->", "热力离心", "->", "破碎"));
            case 6 -> description.addAll(Arrays.asList("锻压", "->", "锻压", "->", "简单洗涤"));
            default -> description.add("无效模式");
        }

        return description;
    }

    /**
     * 获取模式详细描述（带时间信息）
     */
    public static String getModeDetailedDescription(int mode) {
        String modeName = switch (mode) {
            case 0 -> "标准处理";
            case 1 -> "快速离心";
            case 2 -> "双重破碎离心";
            case 3 -> "筛矿处理";
            case 4 -> "化学洗涤离心";
            case 5 -> "化学热离";
            case 6 -> "锻压洗涤";
            default -> "未知模式";
        };

        int timeSeconds = getProcessingTime(mode, 1) / 20; // 转换为秒
        return String.format("%s (%d秒)", modeName, timeSeconds);
    }
}
