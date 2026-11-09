package machines;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.function.BooleanSupplier;
import java.util.function.LongSupplier;
import java.util.function.Predicate;
import java.util.stream.Stream;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.check.CheckRecipeResult;
import gregtech.api.recipe.check.CheckRecipeResultRegistry;
import gregtech.api.recipe.check.SingleRecipeCheck;
import gregtech.api.util.GTRecipe;
import hatch.SuperInputProcessingLogic;
import hatch.SuperInputRecipePlan;

/**
 * 只替换 Chaos 无线处理：一次 long 数量计划代替反复 int 启动。
 * 有线模式继续使用已有处理逻辑；无线产物改用按身份合并的 BigInteger 账本。
 */
public class ChaosWirelessProcessingLogic extends SuperInputProcessingLogic {

    private final BooleanSupplier wireless;
    private final LongSupplier parallelLimit;
    private final Predicate<BigInteger> payEnergy;
    private long wirelessParallels;
    private ChaosBigOutputBuffer bigOutputs = new ChaosBigOutputBuffer();
    private BigInteger wirelessCost = BigInteger.ZERO;

    public ChaosWirelessProcessingLogic(BooleanSupplier wireless, LongSupplier parallelLimit,
        Predicate<BigInteger> payEnergy) {
        this.wireless = wireless;
        this.parallelLimit = parallelLimit;
        this.payEnergy = payEnergy;
    }

    public ChaosBigOutputBuffer takeBigOutputs() {
        ChaosBigOutputBuffer result = bigOutputs;
        bigOutputs = new ChaosBigOutputBuffer();
        return result;
    }

    public long getWirelessParallels() {
        return wirelessParallels;
    }

    public BigInteger getWirelessCost() {
        return wirelessCost;
    }

    @Override
    public ChaosWirelessProcessingLogic clear() {
        super.clear();
        wirelessParallels = 0;
        wirelessCost = BigInteger.ZERO;
        bigOutputs = new ChaosBigOutputBuffer();
        return this;
    }

    @Override
    public CheckRecipeResult process() {
        if (!wireless.getAsBoolean()) return super.process();
        wirelessParallels = 0;
        wirelessCost = BigInteger.ZERO;
        bigOutputs = new ChaosBigOutputBuffer();
        RecipeMap<?> map = getCurrentRecipeMap();
        if (euModSupplier != null) euModifier = euModSupplier.get();
        inputItems = prepareCatalyst(inputItems == null ? new ItemStack[0] : inputItems);
        if (inputFluids == null) inputFluids = new FluidStack[0];
        SingleRecipeCheck lock = isRecipeLocked && recipeLockableMachine != null
            ? recipeLockableMachine.getSingleRecipeCheck()
            : null;
        Stream<GTRecipe> candidates = lock == null ? findWirelessRecipeMatches(map) : Stream.of(lock.getRecipe());
        CheckRecipeResult failure = CheckRecipeResultRegistry.NO_RECIPE;
        // 沿用原版配方索引和 lastRecipe 缓存，不全表扫描，不按并行数循环。
        try (Stream<GTRecipe> matches = candidates) {
            for (GTRecipe recipe : (Iterable<GTRecipe>) matches::iterator) {
                CheckRecipeResult validation = validateRecipe(recipe);
                if (!validation.wasSuccessful()) {
                    failure = validation;
                    continue;
                }
                if (recipe.mDuration <= 0 || recipe.mEUt < 0) continue;
                SuperInputRecipePlan plan = new SuperInputRecipePlan(recipe, inputItems, inputFluids);
                long parallel = plan.getMaxParallel(parallelLimit.getAsLong());
                if (parallel == 0) continue;
                wirelessCost = calculateCost(recipe, parallel, euModifier);
                // 控制器缓存完整的一批 BigInteger 产物；不拆分堆栈，也不受旧的 256 片预算限制。
                // 缓存未交付完之前，控制器禁止再次启动，输出堵塞不会导致批次无限积累或销毁。
                ChaosBigOutputBuffer batch = ChaosBigOutputBuffer.fromRecipe(recipe, parallel);
                CheckRecipeResult hook = onRecipeStart(recipe);
                if (!hook.wasSuccessful()) return hook;
                if (!payEnergy.test(wirelessCost)) {
                    return CheckRecipeResultRegistry.insufficientStartupPower(wirelessCost);
                }
                plan.consume(parallel);
                if (isRecipeLocked && recipeLockableMachine != null && lock == null && map != null) {
                    // 身份锁兼容现有有线 long 路径，数量每次用真实库存重新检查。
                    recipeLockableMachine.setSingleRecipeCheck(
                        SingleRecipeCheck.builder(map)
                            .setRecipe(recipe)
                            .setBefore(new ItemStack[0], new FluidStack[0])
                            .setAfter(new ItemStack[0], new FluidStack[0])
                            .build());
                }
                lastRecipe = recipe.mCanBeBuffered ? recipe : null;
                wirelessParallels = parallel;
                calculatedParallels = (int) Math.min(Integer.MAX_VALUE, parallel);
                calculatedEut = wirelessCost.divide(BigInteger.valueOf(128))
                    .min(BigInteger.valueOf(Long.MAX_VALUE))
                    .longValue();
                duration = 128;
                bigOutputs = batch;
                outputItems = new ItemStack[0];
                outputFluids = new FluidStack[0];
                return CheckRecipeResultRegistry.SUCCESSFUL;
            }
        }
        return failure;
    }

    protected Stream<GTRecipe> findWirelessRecipeMatches(RecipeMap<?> map) {
        if (map == null) return Stream.empty();
        // 仅跳过 int 数量门槛；矿辞、NBT、替代输入与精确数量由原有计划验证。
        return map.findRecipeQuery()
            .caching(recipeCaching)
            .items(inputItems)
            .fluids(inputFluids)
            .specialSlot(specialSlotItem)
            .cachedRecipe(lastRecipe)
            .dontCheckStackSizes(true)
            .findAll();
    }

    /** 先计算总 EU/t 的折扣与向上取整，再乘原配方时长，不乘旧的 32 轮系数。 */
    public static BigInteger calculateCost(GTRecipe recipe, long parallel, double euModifier) {
        return BigDecimal.valueOf(recipe.mEUt)
            .multiply(BigDecimal.valueOf(parallel))
            .multiply(BigDecimal.valueOf(euModifier))
            .setScale(0, RoundingMode.CEILING)
            .toBigIntegerExact()
            .multiply(BigInteger.valueOf(recipe.mDuration));
    }

}
