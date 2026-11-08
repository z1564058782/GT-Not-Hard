package hatch;

import java.util.stream.Stream;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.logic.ProcessingLogic;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.check.CheckRecipeResult;
import gregtech.api.recipe.check.SingleRecipeCheck;
import gregtech.api.util.GTRecipe;
import gregtech.api.util.OverclockCalculator;
import gregtech.api.util.ParallelHelper;

/**
 * 继承 GT 完整超频、耗能、输出保护与批处理流程，只替换压缩输入的匹配和消耗回调。
 * 不按 2^(2n) 构造堆栈，也不扫描整个 RecipeMap；继续使用原版索引和缓存候选查询。
 */
public class SuperInputProcessingLogic extends ProcessingLogic {

    /** 一次完整启动最多构造 256 个原版输出堆栈；Chaos 的最多 32 轮共用此预算，仓室 long 容量不变。 */
    public static final int maxOutputStackFragments = 256;

    /** 当前完整启动尚可构造的输出对象数；只在真实成功后扣减，不预扣原料或丢弃产物。 */
    private int remainingOutputFragments = maxOutputStackFragments;

    /** true 表示调用方正在跨多次 process 共享预算，普通单轮处理会在 process 入口重置预算。 */
    private boolean sharedOutputBudget;

    /** 在 Chaos 同步启动的 32 轮之前调用；预算属于当前机器实例，不限制其他机器。 */
    public void beginSharedOutputBudget() {
        // 每次完整启动独立计数，不能从上次配方继承已消耗的预算。
        remainingOutputFragments = maxOutputStackFragments;
        // 后续每轮 process 不再自行重置预算。
        sharedOutputBudget = true;
    }

    /** 在调用方 finally 中释放启动作用域，失败、能源不足和异常同样必须释放。 */
    public void endSharedOutputBudget() {
        // 不改变已经计算的输出或库存，只恢复下一次普通调用的预算规则。
        sharedOutputBudget = false;
    }

    /** @return 当前完整启动是否还有至少一个输出对象的预算 */
    public boolean hasRemainingOutputBudget() {
        // 调用方可在重新查询 ME 和配方之前退出，不制造无意义的额外启动轮次。
        return remainingOutputFragments > 0;
    }

    /** long 输入检查期间选定的锁定配方；不使用只认识 int 视图的 SingleRecipeCheck 数量缓存。 */
    private GTRecipe longLockedRecipe;

    /** 本次调用是否启用精确数量路径；已有锁即使换成普通仓室也必须走此路径。 */
    private boolean longProcessing;

    /** 玩家是否要求为本次成功配方建立持久锁。 */
    private boolean establishLongLock;

    /** @return 当前候选数组是否含有压缩 long 视图 */
    private boolean hasLongInputs() {
        // 输入分离或颜色分组会替换数组，所以每次以当前数组为准。
        if (inputItems != null) for (ItemStack stack : inputItems) {
            // 只有本 Mod 压缩视图触发新数量路径。
            if (SuperInputAmountHelper.getItemSnapshot(stack) != null) return true;
        }
        // 普通物品加压缩流体同样需要 long 路径。
        if (inputFluids != null) for (FluidStack stack : inputFluids) {
            // 不依赖物品输入存在。
            if (stack instanceof SuperInputAmountHelper.FluidView) return true;
        }
        // 普通仓室完全沿用 GT 原流程。
        return false;
    }

    /** 保留锁定配方选择，但对压缩输入绕过 int 数量缓存，仍由原版计算输出和耗能。 */
    @Override
    public CheckRecipeResult process() {
        // 普通控制器每次 process 有独立预算；Chaos 由外层完整启动统一重置。
        if (!sharedOutputBudget) remainingOutputFragments = maxOutputStackFragments;
        // 普通输入无需改变任何流程。
        if (!hasLongInputs() && !(isRecipeLocked && recipeLockableMachine != null
            && recipeLockableMachine.getSingleRecipeCheck() != null)) return super.process();
        // 保存原锁定开关，所有退出路径恢复它。
        boolean originalRecipeLocked = isRecipeLocked;
        // 已建立锁时只允许同一配方，不能把禁用数量缓存误变成解锁。
        longLockedRecipe = originalRecipeLocked && recipeLockableMachine != null
            && recipeLockableMachine.getSingleRecipeCheck() != null
                ? recipeLockableMachine.getSingleRecipeCheck()
                    .getRecipe()
                : null;
        try {
            // 已有锁和压缩库存都使用下方精确匹配/扣料逻辑，不能回到空成本的 int 缓存。
            longProcessing = true;
            // 首次启用锁时在成功 applyRecipe 后创建可序列化的配方身份锁。
            establishLongLock = originalRecipeLocked && recipeLockableMachine != null && longLockedRecipe == null;
            // GT 的 SingleRecipeCheck 在内部直接消费 int 堆栈，long 路径改用下方回调。
            isRecipeLocked = false;
            // 原版继续负责验证、电压、超频、批处理、输出保护和结果状态。
            return super.process();
        } finally {
            // 不能让一次压缩检查永久改变玩家的锁定开关。
            isRecipeLocked = originalRecipeLocked;
            // 不持有过期配方，下一次按当前机器状态读取。
            longLockedRecipe = null;
            // 清理调用范围的标志，普通未锁定配方下次继续走原版。
            longProcessing = false;
            // 未成功的配方不会建立锁。
            establishLongLock = false;
        }
    }

    /** @return 经原版类型索引筛选，并经精确 long 需求检查的候选流 */
    @Override
    protected Stream<GTRecipe> findRecipeMatches(RecipeMap<?> map) {
        // 普通库存保留原版候选搜索方式。
        if (!longProcessing) return super.findRecipeMatches(map);
        // 空配方表没有候选。
        if (map == null) return Stream.empty();
        // 已有锁只检查锁定配方，避免换成同输入的其他配方。
        if (longLockedRecipe != null) return Stream.of(longLockedRecipe)
            .filter(recipe -> new SuperInputRecipePlan(recipe, inputItems, inputFluids).getMaxParallel(1) == 1);
        // 只跳过原版 int 数量门槛；NBT、特殊槽、配方启用状态仍由原版后端验证。
        return map.findRecipeQuery()
            .caching(recipeCaching)
            .items(inputItems)
            .fluids(inputFluids)
            .specialSlot(specialSlotItem)
            .cachedRecipe(lastRecipe)
            .dontCheckStackSizes(true)
            .findAll()
            .filter(recipe -> new SuperInputRecipePlan(recipe, inputItems, inputFluids).getMaxParallel(1) == 1);
    }

    /** @return 使用原版超频/输出逻辑、但从压缩库存计算和消费数量的并行助手 */
    @Override
    protected ParallelHelper createParallelHelper(GTRecipe recipe) {
        // 先完整沿用父类设置，包括机器、电压、批处理和输出保护。
        ParallelHelper helper = super.createParallelHelper(recipe);
        // 普通输入也需要输出预算，避免本 Mod 的控制器在换回原版仓室后重新产生巨大数组。
        if (!longProcessing) {
            // 普通未锁定路径继续使用 GT 原生匹配和消费，只包裹数量上界。
            int[] remainingOutputParallels = { getOutputParallelLimit(recipe, remainingOutputFragments) };
            // 批处理及小于一 tick 的额外并行都经过相同的剩余数量检查。
            helper.setMaxParallelCalculator((candidate, maxParallel, fluids, items) -> candidate
                .maxParallelCalculatedByInputs(Math.min(maxParallel, remainingOutputParallels[0]), fluids, items));
            // 不改原版原料消耗语义，额外批处理只可使用剩余输出预算。
            helper.setInputConsumer((candidate, parallel, fluids, items) -> {
                // 实际成功的并行量由 GT 原生算法消费。
                candidate.consumeInput(parallel, fluids, items);
                // 第一轮与额外批处理的数量总和必须受限。
                remainingOutputParallels[0] -= parallel;
            });
            // 原版缓存锁可能绕过上述回调；已锁定和建立锁的路径在 process 中统一接入精确计划。
            return helper;
        }
        // 一个候选配方复用同一需求矩阵和工作数组，包括批处理追加并行。
        SuperInputRecipePlan plan = new SuperInputRecipePlan(recipe, inputItems, inputFluids);
        // 批处理和一 tick 内追加并行共用输出预算，不能每个回调重新取得完整预算。
        int[] remainingOutputParallels = { getOutputParallelLimit(recipe, remainingOutputFragments) };
        // 禁用 int 消费缓存，但 process 已保留锁定配方选择。
        helper.setRecipeLocked(recipeLockableMachine, false);
        // 最大并行使用精确整数比较，不通过 double 近似 long 库存。
        helper.setMaxParallelCalculator(
            (candidate, maxParallel, fluids, items) -> plan
                .getMaxParallel(Math.min(maxParallel, remainingOutputParallels[0])));
        // 实际消耗直接减少 long 账本，不产生分片数组。
        helper.setInputConsumer((candidate, parallel, fluids, items) -> {
            // 所有真实消耗先经计划验证，不因输出预算直接丢弃原料。
            plan.consume(parallel);
            // 后续批处理仅可使用剩余预算，总输出碎片数量不会随批次数倍增。
            remainingOutputParallels[0] -= parallel;
        });
        // 保留原版其他所有助手行为。
        return helper;
    }

    /** @return 保证 GT 原生 int 输出拆分规模有界的并行上限，无输出配方保持 int 最大并行 */
    private static int getOutputParallelLimit(GTRecipe recipe) {
        // 保留原方法名与签名，供单轮预算检查及既有调用使用。
        return getOutputParallelLimit(recipe, maxOutputStackFragments);
    }

    /**
     * 按剩余对象数计算并行上界，概率按向上取整的最坏产出估计，不能在计算后截掉产物。
     *
     * @param recipe 当前候选配方，保持其输出、NBT 和概率不变
     * @param availableFragments 完整启动中尚可构造的对象数
     * @return 可安全计算的并行数；预算不足以容纳一次配方时返回零
     */
    private static int getOutputParallelLimit(GTRecipe recipe, int availableFragments) {
        // 只数实际输出类型，不生成输出列表。
        int outputCount = 0;
        // null 输出不占预算。
        if (recipe.mOutputs != null) for (ItemStack stack : recipe.mOutputs) {
            // 零数量不会产生输出碎片。
            if (stack != null && stack.stackSize > 0) outputCount++;
        }
        // 流体也使用相同的碎片预算。
        if (recipe.mFluidOutputs != null) for (FluidStack stack : recipe.mFluidOutputs) {
            // 忽略空输出。
            if (stack != null && stack.amount > 0) outputCount++;
        }
        // 例如无产物燃料配方，不引入无意义限制。
        if (outputCount == 0) return Integer.MAX_VALUE;
        // 一份配方也放不下时必须拒绝，不允许 max(1, ...) 绕过整体预算。
        if (availableFragments < outputCount) return 0;
        // 每个输出至少能产生一片；一般 GT 配方输出种类远小于预算。
        long capacityPerOutput = (long) Integer.MAX_VALUE * (availableFragments / outputCount);
        // 初始上限沿用 GT 支持的最大 int 并行。
        long parallelLimit = Integer.MAX_VALUE;
        // 根据每份输出数量及概率的最坏倍数计算安全预算。
        if (recipe.mOutputs != null) for (int outputIndex = 0; outputIndex < recipe.mOutputs.length; outputIndex++) {
            // 不改变原配方对象或其输出数量。
            ItemStack stack = recipe.mOutputs[outputIndex];
            // GT 不为空/零输出创建堆栈。
            if (stack == null || stack.stackSize <= 0) continue;
            // 大于 100% 的概率允许一份配方产生多份输出，向上取整作为安全界。
            long chanceFactor = Math.max(1L, ((long) recipe.getOutputChance(outputIndex) + 9999L) / 10000L);
            // 先除后比较，乘法不可能越过 long 边界。
            parallelLimit = Math.min(parallelLimit, capacityPerOutput / stack.stackSize / chanceFactor);
        }
        // 流体输出同样避免 GT addFluidsLong 的逐片创建失控。
        if (recipe.mFluidOutputs != null)
            for (int outputIndex = 0; outputIndex < recipe.mFluidOutputs.length; outputIndex++) {
                // 获取当前输出原型。
                FluidStack stack = recipe.mFluidOutputs[outputIndex];
                // 空输出没有开销。
                if (stack == null || stack.amount <= 0) continue;
                // GT 流体输出也支持超过 100% 的概率。
                long chanceFactor = Math.max(1L, ((long) recipe.getFluidOutputChance(outputIndex) + 9999L) / 10000L);
                // 取各输出中最严格的数量预算。
                parallelLimit = Math.min(parallelLimit, capacityPerOutput / stack.amount / chanceFactor);
            }
        // 返回零会使原生助手拒绝本轮；不能先消费再截断输出。
        return (int) Math.max(0L, parallelLimit);
    }

    /**
     * 成功配方建立原版可序列化的身份锁；数量每次重新按真实库存校验。
     * 空 before/after 表示本逻辑不使用 SingleRecipeCheck 的 int 成本，不表示免费输入。
     * process 在存在此锁时无论输入是否含压缩视图都会绕过其 int 消费方法。
     */
    @Override
    protected CheckRecipeResult applyRecipe(GTRecipe recipe, ParallelHelper helper, OverclockCalculator calculator,
        CheckRecipeResult result) {
        // 输出、耗能、时长和启动钩子保持父类完整行为。
        CheckRecipeResult appliedResult = super.applyRecipe(recipe, helper, calculator, result);
        // 仅成功计算的真实对象占用完整启动预算，概率零产出不会消耗对象名额。
        if (appliedResult.wasSuccessful()) {
            // helper 的数组长度就是稍后提交给控制器的实际输出对象数。
            int outputFragments = (helper.getItemOutputs() == null ? 0 : helper.getItemOutputs().length)
                + (helper.getFluidOutputs() == null ? 0 : helper.getFluidOutputs().length);
            // 输入数量回调已保证上界；这里保留非负状态以便调用方停止追加轮次。
            remainingOutputFragments = Math.max(0, remainingOutputFragments - outputFragments);
        }
        // 只为成功且玩家要求锁定的配方记录身份。
        if (appliedResult.wasSuccessful() && establishLongLock && getCurrentRecipeMap() != null) {
            // GT 原有 NBT 保存配方身份；全部实际成本仍由 SuperInputRecipePlan 重新校验。
            recipeLockableMachine.setSingleRecipeCheck(
                SingleRecipeCheck.builder(getCurrentRecipeMap())
                    .setRecipe(recipe)
                    .setBefore(new ItemStack[0], new FluidStack[0])
                    .setAfter(new ItemStack[0], new FluidStack[0])
                    .build());
        }
        // 返回原版结果，不能掩盖启动钩子拒绝或溢出错误。
        return appliedResult;
    }
}
