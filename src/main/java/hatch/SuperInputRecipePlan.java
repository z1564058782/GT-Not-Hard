package hatch;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.IdentityHashMap;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.objects.ItemData;
import gregtech.api.util.GTOreDictUnificator;
import gregtech.api.util.GTRecipe;
import machines.ChaosParallel;

/**
 * 不展开分片的配方数量匹配器。只在输入含压缩视图时启用，普通机器仍使用 GT 原路径。
 *
 * <p>
 * 按 GT 合并后的物品需求匹配矿辞、NBT 和候选物品，按 FluidStack.isFluidEqual 匹配流体/NBT。
 * 最大并行用精确整数二分，int 路径最多 31 次、long 路径最多 63 次试算；矩阵和工作数组复用，不按理论片数分配对象。
 * 极少数需求乘法超过 long 时才使用 BigInteger，避免边界溢出或 double 舍入造成多算一份。
 * 多种互相重叠的替代输入按声明顺序贪心预留，与 GT 类似，可能保守拒绝但不会重复花费同一库存。
 */
public final class SuperInputRecipePlan {

    /** 当前配方的原始定义，概率和合并需求均来自该对象。 */
    private final GTRecipe recipe;
    /** 本次候选输入的物品原引用，含普通库存和压缩视图。 */
    private final ItemStack[] itemInputs;
    /** 本次候选输入的流体原引用。 */
    private final FluidStack[] fluidInputs;
    /** 物品需求与输入类型匹配矩阵，只构造一次。 */
    private final Requirement[] itemRequirements;
    /** 每个流体槽的所有合法替代需求；同一槽只选择一种。 */
    private final Requirement[][] fluidRequirements;
    /** 完整成本试算选中的替代流体，概率扣料时复用，防止因少扣前项而切换到冲突替代。 */
    private final Requirement[] selectedFluidRequirements;
    /** 各输入本次试算前的精确 long 可用量。 */
    private final long[] initialItems;
    /** 各流体本次试算前的精确 long 可用量。 */
    private final long[] initialFluids;
    /** 可复用物品试算数组，避免二分时反复创建数组。 */
    private final long[] remainingItems;
    /** 可复用流体试算数组。 */
    private final long[] remainingFluids;

    /** 为一份候选配方创建匹配矩阵，输入对象在配方检查周期内保持有效。 */
    public SuperInputRecipePlan(GTRecipe recipe, ItemStack[] itemInputs, FluidStack[] fluidInputs) {
        // 保存 GT 配方身份，不复制或改写配方本身。
        this.recipe = recipe;
        // null 输入转为空数组，保留非空数组的原始元素引用。
        this.itemInputs = uniqueItems(itemInputs);
        // 同样规范化流体输入。
        this.fluidInputs = uniqueFluids(fluidInputs);
        // 每个实际输入槽只需要一个 long，不与等级片数相乘。
        initialItems = new long[this.itemInputs.length];
        // 保存流体可用量。
        initialFluids = new long[this.fluidInputs.length];
        // 二分试算复用数组。
        remainingItems = new long[initialItems.length];
        // 流体试算复用数组。
        remainingFluids = new long[initialFluids.length];
        // 矿辞关联只查询一次，GT 的 RecipeItemInput 负责最终身份匹配。
        ItemData[] associations = new ItemData[this.itemInputs.length];
        // null 物品没有矿辞身份。
        for (int inputIndex = 0; inputIndex < associations.length; inputIndex++) {
            // 保留 GT 原版的统一匹配方式。
            associations[inputIndex] = this.itemInputs[inputIndex] == null ? null
                : GTOreDictUnificator.getAssociation(this.itemInputs[inputIndex]);
        }
        // GT 自身的缓存合并物品类型和替代/矿辞需求。
        GTRecipe.RecipeItemInput[] combinedInputs = recipe.getCachedCombinedItemInputs();
        // 每个合并物品需求对应一行矩阵。
        itemRequirements = new Requirement[combinedInputs.length];
        // 遍历实际配方需求，不遍历逻辑分片。
        for (int requirementIndex = 0; requirementIndex < combinedInputs.length; requirementIndex++) {
            // 当前 GT 需求带 long 数量以及 NBT、矿辞匹配规则。
            GTRecipe.RecipeItemInput input = combinedInputs[requirementIndex];
            // 保存该需求匹配的所有输入来源。
            boolean[] matches = new boolean[this.itemInputs.length];
            // 按原输入顺序分配资源，防止重复花费重叠的矿辞输入。
            for (int inputIndex = 0; inputIndex < matches.length; inputIndex++) {
                // null 物品不视为零数量工具。
                matches[inputIndex] = this.itemInputs[inputIndex] != null
                    && input.matchesRecipe(associations[inputIndex], this.itemInputs[inputIndex]);
            }
            // 与 GT 原版合并概率语义一致；零数量工具不执行除零。
            int chance = recipe.mInputChances == null || input.inputAmount == 0 ? 10000
                : (int) Math.round(input.chanceWeightedAmount / input.inputAmount * 10000);
            // 原始 long 每份成本在后续乘并行时进行溢出校验。
            itemRequirements[requirementIndex] = new Requirement(input.inputAmount, matches, chance);
        }
        // null 配方流体数组表示没有流体需求。
        FluidStack[] recipeFluids = recipe.mFluidInputs == null ? new FluidStack[0] : recipe.mFluidInputs;
        // 为每个配方流体槽保存替代列表。
        fluidRequirements = new Requirement[recipeFluids.length][];
        // 仅每个实际配方槽一条引用，最大并行二分复用同一数组。
        selectedFluidRequirements = new Requirement[recipeFluids.length];
        // 每次只匹配实际定义的流体槽。
        for (int requirementIndex = 0; requirementIndex < recipeFluids.length; requirementIndex++) {
            // 沿用 GT 对替代流体数组的读取约定。
            FluidStack[] alternatives = recipe.mAltFluidInputs != null
                && requirementIndex < recipe.mAltFluidInputs.length
                && recipe.mAltFluidInputs[requirementIndex] != null ? recipe.mAltFluidInputs[requirementIndex]
                    : new FluidStack[] { recipeFluids[requirementIndex] };
            // 每个替代候选有自己的匹配行，保留其不同需求数量。
            fluidRequirements[requirementIndex] = new Requirement[alternatives.length];
            // 流体消费概率按原始配方槽保存。
            int chance = recipe.mFluidInputChances != null && requirementIndex < recipe.mFluidInputChances.length
                ? recipe.mFluidInputChances[requirementIndex]
                : 10000;
            // 构建每个有效流体候选。
            for (int alternativeIndex = 0; alternativeIndex < alternatives.length; alternativeIndex++) {
                // null 候选保留空位置，运行时忽略。
                FluidStack alternative = alternatives[alternativeIndex];
                // 无效候选不参与匹配。
                if (alternative == null) continue;
                // 流体匹配矩阵大小只与实际来源数有关。
                boolean[] matches = new boolean[this.fluidInputs.length];
                // Forge 匹配包括流体 NBT，不能只比较 Fluid 的名称。
                for (int inputIndex = 0; inputIndex < matches.length; inputIndex++) {
                    // 避免给 null 输入调用实例方法。
                    matches[inputIndex] = this.fluidInputs[inputIndex] != null
                        && alternative.isFluidEqual(this.fluidInputs[inputIndex]);
                }
                // 一个槽的候选可以要求不同数量。
                fluidRequirements[requirementIndex][alternativeIndex] = new Requirement(
                    alternative.amount,
                    matches,
                    chance);
            }
        }
    }

    /** 同一个真实物品对象只能申报一次；不同对象的相同物品仍可独立累计。 */
    private static ItemStack[] uniqueItems(ItemStack[] inputs) {
        // 使用对象身份而非类型键，避免把两个独立物理槽错误合并。
        IdentityHashMap<ItemStack, Boolean> seen = new IdentityHashMap<>();
        // 列表规模只与实际输入槽有关。
        ArrayList<ItemStack> unique = new ArrayList<>();
        // null 元素不提供资源，重复电路或控制器引用不能重复花费。
        if (inputs != null) for (ItemStack stack : inputs) {
            // 同一对象首次出现时保留原引用。
            if (stack != null && seen.put(stack, Boolean.TRUE) == null) unique.add(stack);
        }
        // 数组仅用于矩阵来源，元素仍是原始可扣料对象。
        return unique.toArray(new ItemStack[0]);
    }

    /** 流体同样按对象身份去除重复引用，不按 Fluid 合并独立物理储罐。 */
    private static FluidStack[] uniqueFluids(FluidStack[] inputs) {
        // 身份映射阻止同一 FluidStack 被重复声明。
        IdentityHashMap<FluidStack, Boolean> seen = new IdentityHashMap<>();
        // 临时列表与真实来源数成正比。
        ArrayList<FluidStack> unique = new ArrayList<>();
        // 跳过 null 并保留顺序。
        if (inputs != null) for (FluidStack stack : inputs) {
            // 不复制流体，否则实际消耗无法反馈到仓室。
            if (stack != null && seen.put(stack, Boolean.TRUE) == null) unique.add(stack);
        }
        // 返回真实来源数组。
        return unique.toArray(new FluidStack[0]);
    }

    /** @return 当前剩余输入能支持的最大并行，精确整数计算且不修改真实库存 */
    public int getMaxParallel(int maxParallel) {
        return (int) getMaxParallel((long) maxParallel);
    }

    /** Chaos 无线专用的 long 上界，沿用同一匹配矩阵与库存分配器。 */
    public long getMaxParallel(long maxParallel) {
        // 零或负上限无需试算。
        if (maxParallel <= 0) return 0;
        // 网络快照可能已被同轮批处理消耗，需要重新读取当前值。
        readAvailable();
        // 先测上限，常见库存充足的路径只做一次分配。
        if (allocate(maxParallel, false)) return maxParallel;
        // 小于一并行时立即失败，避免后续二分无意义地重复。
        if (maxParallel == 1 || !allocate(1, false)) return 0;
        // 下界已经证明可行。
        long lowerParallel = 1;
        // 上界已经证明不可行。
        long upperParallel = maxParallel;
        // 采用差值中点，避免 lower+upper 溢出。
        while (upperParallel - lowerParallel > 1) {
            // 中点始终在合法正 long 范围内。
            long middleParallel = lowerParallel + (upperParallel - lowerParallel) / 2;
            // 每次试算重置工作数组，不消费实际账本。
            if (allocate(middleParallel, false)) lowerParallel = middleParallel;
            // 不可行时收紧上界。
            else upperParallel = middleParallel;
        }
        // 返回经过实际分配验证的下界。
        return lowerParallel;
    }

    /** 为 GT ParallelHelper 消费实际输入；先完整试算，再一次性提交各来源差额。 */
    public void consume(int parallel) {
        consume((long) parallel);
    }

    /** 精确提交 long 并行，普通库存仍只扣除其实际存在的 int 数量。 */
    public void consume(long parallel) {
        // GT 的批处理可能传入 0，保持幂等。
        if (parallel <= 0) return;
        // 获取当前长库存，不能复用上一轮二分的过时数值。
        readAvailable();
        // 概率消费也先验证 100% 情形，保留 GT 的“先存在、再概率扣除”规则。
        if (!allocate(parallel, false)) throw new IllegalStateException("SuperInput recipe inputs changed");
        // 用原版概率采样生成实际扣料计划，采样次数与配方需求数有关。
        if (!allocate(parallel, true)) throw new IllegalStateException("Invalid SuperInput chance allocation");
        // 所有需求都成功分配后才修改物品来源。
        for (int inputIndex = 0; inputIndex < itemInputs.length; inputIndex++) {
            // 非负差额绝不超过该来源开始时的 long 数量。
            long consumedAmount = initialItems[inputIndex] - remainingItems[inputIndex];
            // 零消耗来源不触发任何写入。
            if (consumedAmount == 0) continue;
            // 压缩视图必须减少完整 long 账本。
            SuperInputAmountHelper.Snapshot<ItemStack> snapshot = SuperInputAmountHelper
                .getItemSnapshot(itemInputs[inputIndex]);
            // 物品视图使用身份表，原版 final ItemStack 不需要改类或反射。
            if (snapshot != null) {
                // 不把已计算差额转成 int。
                snapshot.consume(consumedAmount);
            } else {
                // 普通库存单来源本来就是 int，差额已经由分配器限制在原值以内。
                itemInputs[inputIndex].stackSize -= (int) consumedAmount;
            }
        }
        // 使用同样的提交规则处理流体来源。
        for (int inputIndex = 0; inputIndex < fluidInputs.length; inputIndex++) {
            // 差额使用 long。
            long consumedAmount = initialFluids[inputIndex] - remainingFluids[inputIndex];
            // 没有消耗则不修改原对象。
            if (consumedAmount == 0) continue;
            // 压缩流体与普通真实流体分开提交。
            if (fluidInputs[inputIndex] instanceof SuperInputAmountHelper.FluidView) {
                // 保留 long 精度直到 AE 最终结算。
                ((SuperInputAmountHelper.FluidView) fluidInputs[inputIndex]).snapshot.consume(consumedAmount);
            } else {
                // 普通 FluidStack 仍保持原版 int 数量。
                fluidInputs[inputIndex].amount -= (int) consumedAmount;
            }
        }
    }

    /** 读取实际来源当前数量，负库存不是合法的零库存。 */
    private void readAvailable() {
        // 一次查询每个实际物品来源。
        for (int inputIndex = 0; inputIndex < itemInputs.length; inputIndex++) {
            // 提取实际对象引用。
            ItemStack stack = itemInputs[inputIndex];
            // 压缩视图只查账本，不展开分片。
            SuperInputAmountHelper.Snapshot<ItemStack> snapshot = SuperInputAmountHelper.getItemSnapshot(stack);
            // 弱关联仅对当前原始视图存在，普通库存继续使用合法 int 数量。
            initialItems[inputIndex] = snapshot != null ? snapshot.getRemainingAmount()
                : stack == null ? 0 : stack.stackSize;
            // 负值说明配方或其他代码存在非法写入。
            if (initialItems[inputIndex] < 0) throw new IllegalStateException("Negative item input");
        }
        // 逐个读取实际流体来源。
        for (int inputIndex = 0; inputIndex < fluidInputs.length; inputIndex++) {
            // null 流体不产生可用量。
            FluidStack stack = fluidInputs[inputIndex];
            // 所有压缩来源都保留 long。
            initialFluids[inputIndex] = stack instanceof SuperInputAmountHelper.FluidView
                ? ((SuperInputAmountHelper.FluidView) stack).snapshot.getRemainingAmount()
                : stack == null ? 0 : stack.amount;
            // 拒绝回绕为负数的输入。
            if (initialFluids[inputIndex] < 0) throw new IllegalStateException("Negative fluid input");
        }
    }

    /** 在可复用工作数组中分配，false 表示完全不触碰真实对象。 */
    private boolean allocate(long parallel, boolean useChance) {
        // 每次从本次读取的完整库存开始，二分试算之间不相互影响。
        System.arraycopy(initialItems, 0, remainingItems, 0, initialItems.length);
        // 流体也重置到同一个试算起点。
        System.arraycopy(initialFluids, 0, remainingFluids, 0, initialFluids.length);
        // 按合并需求顺序预留物品，同一来源不会重复申报。
        for (Requirement requirement : itemRequirements) {
            // 最大并行用 100% 数量，真实消耗才使用原版概率采样。
            long multiplier = multiplier(requirement.chance, parallel, useChance);
            // 先验证需求可满足，再写工作数组。
            if (!transfer(requirement, multiplier, remainingItems, false)) return false;
            // 真正操作的仍然只是试算数组。
            transfer(requirement, multiplier, remainingItems, true);
        }
        // 每个流体槽只能选择一种替代，避免多个替代被同时扣料。
        for (int requirementIndex = 0; requirementIndex < fluidRequirements.length; requirementIndex++) {
            // 完整成本试算使用此槽的全部候选。
            Requirement[] alternatives = fluidRequirements[requirementIndex];
            // 尚未找到满足此槽的候选。
            Requirement selected = useChance ? selectedFluidRequirements[requirementIndex] : null;
            // 按声明顺序选择可满足完整请求的第一种，结果稳定且不依赖 double 比值。
            if (!useChance) for (Requirement alternative : alternatives) {
                // null 候选不能满足需求。
                if (alternative != null && transfer(alternative, parallel, remainingFluids, false)) {
                    // 保存候选，工作数组此时尚未改变。
                    selected = alternative;
                    // 此槽只选一种流体。
                    break;
                }
            }
            // 整个配方槽无法满足，不能消费任何真实来源。
            if (selected == null) return false;
            // 实际概率扣料严格复用已证明可行的选择，不重新贪心切换替代。
            if (!useChance) selectedFluidRequirements[requirementIndex] = selected;
            // 概率仅决定实际消耗，候选选择仍要求完整库存存在。
            long multiplier = multiplier(selected.chance, parallel, useChance);
            // 候选已经通过完整数量验证，较少的概率数量也一定足够。
            transfer(selected, multiplier, remainingFluids, true);
        }
        // 全部需求均成功预留。
        return true;
    }

    /** @return 与 GT 原版一致的概率并行倍数，不在最大并行试算中消耗随机数 */
    private static long multiplier(int chance, long parallel, boolean useChance) {
        // 100% 消耗或纯试算直接走整数快速路径。
        if (!useChance || chance >= 10000) return parallel;
        // 原版采样一次合并需求的实际份数，不逐个物品掷骰。
        long actualMultiplier = ChaosParallel.chanceMultiplier(Math.max(0, chance), parallel);
        // 防止概率实现的极端舍入返回超过原始并行数的份数。
        return Math.max(0L, Math.min(parallel, actualMultiplier));
    }

    /**
     * 从匹配来源分配完整需求。普通路径全用 long；需求乘法溢出才启用 BigInteger。
     * apply=false 时不改工作数组，可安全尝试另一个流体候选。
     */
    private static boolean transfer(Requirement requirement, long multiplier, long[] amounts, boolean apply) {
        // 负配方数量属于无效定义，不能把它当成免费输入。
        if (requirement.amount < 0) return false;
        // 数量为 0 的工具仍要求匹配类型存在，允许原版零数量电路。
        if (requirement.amount == 0) {
            // 不同匹配类型也不能用 null 工具满足。
            for (boolean match : requirement.matches) if (match) return true;
            // 没有类型匹配时整个需求失败。
            return false;
        }
        // 概率采样为 0 表示本次不实际扣除，但之前已经验证过资源存在。
        if (multiplier == 0) return true;
        // 先除后比较，正常需求不分配 BigInteger。
        if (requirement.amount <= Long.MAX_VALUE / multiplier) {
            // 已证明此乘法安全。
            long pendingAmount = requirement.amount * multiplier;
            // 来源数只与真实槽数有关。
            for (int inputIndex = 0; inputIndex < amounts.length && pendingAmount > 0; inputIndex++) {
                // 不匹配来源不能用于本需求。
                if (!requirement.matches[inputIndex]) continue;
                // 单个来源最多提供当前未预留量。
                long takenAmount = Math.min(pendingAmount, amounts[inputIndex]);
                // 试算仅在 apply=true 时写工作数组。
                if (apply) amounts[inputIndex] -= takenAmount;
                // 通过连续减法避免多个来源求和溢出。
                pendingAmount -= takenAmount;
            }
            // 尚有差额则不足。
            return pendingAmount == 0;
        }
        // 合并配方需求可能超过单个 long，但多个独立来源仍可共同满足。
        BigInteger pendingAmount = BigInteger.valueOf(requirement.amount)
            .multiply(BigInteger.valueOf(multiplier));
        // 溢出路径仍然只遍历实际来源数。
        for (int inputIndex = 0; inputIndex < amounts.length && pendingAmount.signum() > 0; inputIndex++) {
            // 类型不匹配的来源跳过。
            if (!requirement.matches[inputIndex]) continue;
            // min 的结果不超过单个来源 long，因此转回 long 是安全的。
            long takenAmount = pendingAmount.min(BigInteger.valueOf(amounts[inputIndex]))
                .longValue();
            // 只更新试算数组，不访问 ME。
            if (apply) amounts[inputIndex] -= takenAmount;
            // 大整数需求精确减量，避免 double 在 2^53 后丢失整数精度。
            pendingAmount = pendingAmount.subtract(BigInteger.valueOf(takenAmount));
        }
        // 返回完整请求是否分配成功。
        return pendingAmount.signum() == 0;
    }

    /** 一条不可变需求及其类型匹配行。 */
    private static final class Requirement {

        /** 每份原始需求的精确数量。 */
        private final long amount;
        /** 哪些实际来源能满足此需求。 */
        private final boolean[] matches;
        /** 合并后的消费概率，万分比。 */
        private final int chance;

        /** 保存完整需求，不复制配方或输入对象。 */
        private Requirement(long amount, boolean[] matches, int chance) {
            // long 成本保留到乘法校验阶段。
            this.amount = amount;
            // 匹配行已由构造器创建，后续只读。
            this.matches = matches;
            // 保存原版消费概率。
            this.chance = chance;
        }
    }
}
