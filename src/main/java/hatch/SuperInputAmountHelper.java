package hatch;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

/**
 * 压缩的独立分片库存：以可用区间记录数量，不按片数分配 ItemStack/FluidStack 或数组。
 *
 * <p>
 * 每片仍有独立的 long 索引，可以单独查询和消耗。未改动的连续分片共用一个区间描述；
 * 顺序消耗整个 Long.MAX_VALUE 库存也只修改一个区间，时间和内存不随理论片数增长。
 * 一个资源只暴露一个 int 数量视图供原版 GUI/索引识别；完整数量由 SuperInputProcessingLogic 处理。
 */
public final class SuperInputAmountHelper {

    /**
     * 原版 ItemStack 为 final，只能按原始对象身份关联账本。
     * ItemStack 不重写 equals/hashCode；弱键与弱值共同避免账本持有视图形成保活环。
     * 配方周期内仓室强引用 Snapshot，因此有效输入的关联不会提前丢失。
     */
    private static final Map<ItemStack, WeakReference<Snapshot<ItemStack>>> itemSnapshots = Collections
        .synchronizedMap(new WeakHashMap<ItemStack, WeakReference<Snapshot<ItemStack>>>());

    /** @return 仅原始识别视图对应的账本；普通堆栈或 copy 返回 null */
    public static Snapshot<ItemStack> getItemSnapshot(ItemStack stack) {
        // 原版复制出的物品不携带关联，不会误扣原仓室。
        WeakReference<Snapshot<ItemStack>> reference = itemSnapshots.get(stack);
        // 弱值不保活已结束检查的整个账本。
        return reference == null ? null : reference.get();
    }

    /** 保留上一版字段名称；仅代表无等级参数的兼容入口使用 III 级的 64 片。 */
    public static final int maxVirtualStacks = 64;

    /** 保留上一版默认容量；有等级的生产入口必须使用 SuperInputTier.getMaxInputAmount。 */
    public static final long maxInputAmount = (long) Integer.MAX_VALUE * maxVirtualStacks;

    /** 两类堆栈的复制/读写策略只创建一次，不按配方检查重复分配匿名适配器。 */
    private static final StackAdapter<ItemStack> itemAdapter = new StackAdapter<ItemStack>() {

        @Override
        public ItemStack copyWithAmount(ItemStack stack, int stackAmount) {
            // copy 保留物品身份、元数据和独立 NBT。
            ItemStack copiedStack = stack.copy();
            // 原版数量字段继续保持合法 int。
            copiedStack.stackSize = stackAmount;
            // 返回独立副本，不能改动过滤器。
            return copiedStack;
        }

        @Override
        public int getAmount(ItemStack stack) {
            return stack.stackSize;
        }

        @Override
        public void setAmount(ItemStack stack, int amount) {
            stack.stackSize = amount;
        }
    };

    /** 流体策略同样保留 FluidStack.tag，不重新构造丢失 NBT 的流体原型。 */
    private static final StackAdapter<FluidStack> fluidAdapter = new StackAdapter<FluidStack>() {

        @Override
        public FluidStack copyWithAmount(FluidStack stack, int stackAmount) {
            // copy 会复制流体 NBT。
            FluidStack copiedStack = stack.copy();
            // 写入视图实际可表达的 int 数量。
            copiedStack.amount = stackAmount;
            // 返回副本。
            return copiedStack;
        }

        @Override
        public int getAmount(FluidStack stack) {
            return stack.amount;
        }

        @Override
        public void setAmount(FluidStack stack, int amount) {
            stack.amount = amount;
        }
    };

    /** 工具类不需要实例。 */
    private SuperInputAmountHelper() {}

    /** @return 与上一版 64 片入口兼容的物品快照 */
    public static Snapshot<ItemStack> forItems(ItemStack prototype, long amount) {
        // 旧签名保留，不改变已有调用方的方法名称。
        return forItems(prototype, amount, SuperInputTier.legacyTierIndex);
    }

    /** @return 指定等级的压缩物品快照，不展开理论分片 */
    public static Snapshot<ItemStack> forItems(ItemStack prototype, long amount, int tierIndex) {
        // 先构造 long 区间，再关联一个供配方索引使用的视图。
        Snapshot<ItemStack> snapshot = new Snapshot<>(prototype, amount, tierIndex, itemAdapter);
        // ItemStack 为 final；使用普通独立副本，不能继承或更改 Minecraft 类。
        ItemStack view = itemAdapter.copyWithAmount(prototype, 1);
        // 一个原始视图只关联一个资源账本，copy 不自动加入身份表。
        itemSnapshots.put(view, new WeakReference<>(snapshot));
        // 保存视图强引用，等级容量仍完全保存在 long 账本。
        snapshot.attachView(view);
        // 返回独立资源账本。
        return snapshot;
    }

    /** @return 与上一版入口兼容的 III 级流体快照 */
    public static Snapshot<FluidStack> forFluids(FluidStack prototype, long amount) {
        // 保留旧方法签名。
        return forFluids(prototype, amount, SuperInputTier.legacyTierIndex);
    }

    /** @return 指定等级的压缩流体快照 */
    public static Snapshot<FluidStack> forFluids(FluidStack prototype, long amount, int tierIndex) {
        // 容量按等级饱和，不能把 long 转成 int 后构造。
        Snapshot<FluidStack> snapshot = new Snapshot<>(prototype, amount, tierIndex, fluidAdapter);
        // 全部理论分片共用一个识别视图，真实数量保存在快照中。
        snapshot.attachView(new FluidView(snapshot));
        // 返回资源账本。
        return snapshot;
    }

    /** 堆栈复制和 int 视图读写接口；T 仅为物品或流体。 */
    private interface StackAdapter<T> {

        /** @return 带独立 NBT 的副本 */
        T copyWithAmount(T stack, int amount);

        /** @return 原版可见的 int 数量 */
        int getAmount(T stack);

        /** 更新原版可见数量，不改变 long 账本。 */
        void setAmount(T stack, int amount);
    }

    /**
     * 一种资源的压缩独立分片。
     *
     * @param <T> ItemStack 或 FluidStack
     */
    public static final class Snapshot<T> {

        /** 数量为 1 的独立原型；配置改变不能改变待扣资源。 */
        private final T prototype;
        /** 本轮初始 long 数量，最高可精确为 Long.MAX_VALUE。 */
        private final long initialAmount;
        /** 本级理论片数；未装入实际库存的片也存在，但可用量为 0。 */
        private final long shardCount;
        /** 可用数量区间 [start,end)，初始只需一条记录，不分配每片对象。 */
        private final TreeMap<Long, Long> availableRanges = new TreeMap<>();
        /** 当前未消耗总量；所有差额都由这个 long 字段精确计算。 */
        private long remainingAmount;
        /** 原版识别视图；只能直接表达 min(剩余量,Integer.MAX_VALUE)。 */
        private T view;
        /** 原版最后一次同步的 int 数量，检测旧接口对视图的直接减量。 */
        private int displayedAmount;
        /** 只含一个视图的兼容列表，绝不能当作全部理论分片展开。 */
        private List<T> stacks;
        /** 复制、读取和写入对应类型 int 字段的策略。 */
        private final StackAdapter<T> adapter;

        /** 构造账本；amount 非负，tierIndex 为 0～16，prototype 不得为空。 */
        private Snapshot(T prototype, long amount, int tierIndex, StackAdapter<T> adapter) {
            // 负数或空原型不能转换成合法库存。
            if (prototype == null || amount < 0) throw new IllegalArgumentException("Invalid SuperInput snapshot");
            // 保存只创建一次的类型策略。
            this.adapter = adapter;
            // 独立保存身份和 NBT，后续不读取可能被编辑的过滤器。
            this.prototype = adapter.copyWithAmount(prototype, 1);
            // 保存完整逻辑片数，而不是 int 数组长度。
            shardCount = SuperInputTier.getShardCount(tierIndex);
            // 只限制本轮输入，不从网络删除超过等级上限的真实库存。
            initialAmount = Math.min(amount, SuperInputTier.getMaxInputAmount(tierIndex));
            // 本轮起始时全部可用。
            remainingAmount = initialAmount;
            // Long.MAX_VALUE 本身可以作为区间右端点，无需加 1。
            if (initialAmount > 0) availableRanges.put(0L, initialAmount);
        }

        /** 关联唯一视图，仅在工厂构造阶段调用。 */
        private void attachView(T view) {
            // 保存堆栈对象，控制器用其子类识别完整账本。
            this.view = view;
            // 列表结构不能被外部增删。
            stacks = Collections.singletonList(view);
            // 初始化合法 int 可见量。
            refreshView();
        }

        /** @return 原型副本，调用者修改不会改变待扣资源 */
        public T getPrototype() {
            return adapter.copyWithAmount(prototype, 1);
        }

        /** @return 本轮初始完整 long 数量 */
        public long getInitialAmount() {
            return initialAmount;
        }

        /** @return 本级完整逻辑片数，无数组展开 */
        public long getShardCount() {
            return shardCount;
        }

        /** @return 当前区间记录条数，便于验证内存复杂度与实际编辑数相关 */
        public int getRangeCount() {
            synchronizeView();
            return availableRanges.size();
        }

        /** @return 唯一原版识别视图的兼容列表；完整数量应读 getRemainingAmount */
        public List<T> getStacks() {
            synchronizeView();
            return stacks;
        }

        /** @return 精确剩余量，同时接收旧 int 接口对视图的合法减量 */
        public long getRemainingAmount() {
            synchronizeView();
            return remainingAmount;
        }

        /** @return 精确已消耗量，不使用 double 或可能溢出的总量求和 */
        public long getConsumedAmount() {
            return initialAmount - getRemainingAmount();
        }

        /**
         * 查询一个独立分片的剩余量，不生成中间所有分片。
         *
         * @param shardIndex long 分片索引，范围为 [0,shardCount)
         * @return 该片中仍可用的数量，范围为 [0,Integer.MAX_VALUE]
         */
        public int getShardAmount(long shardIndex) {
            // 先接收直接视图减量。
            synchronizeView();
            // 检查索引且避免对超出实际 long 地址空间的片执行溢出乘法。
            long start = shardStart(shardIndex);
            // 容量饱和后不可寻址的空片直接返回 0。
            if (start >= initialAmount) return 0;
            // 通过差值限制右端点，绝不计算 Long.MAX_VALUE + 1。
            long end = start + Math.min(Integer.MAX_VALUE, initialAmount - start);
            // 从覆盖起点或其后的第一个区间开始。
            Map.Entry<Long, Long> range = availableRanges.floorEntry(start);
            // 起点落在已消耗空隙时向后找。
            if (range == null || range.getValue() <= start) range = availableRanges.ceilingEntry(start);
            // 一片最多 Integer.MAX_VALUE，求和仍以 long 防止中间计算出错。
            long amount = 0;
            // 只访问与此片相交的压缩区间。
            while (range != null && range.getKey() < end) {
                // 每个区间贡献与本片相交的部分。
                amount += Math.max(0L, Math.min(end, range.getValue()) - Math.max(start, range.getKey()));
                // 查询下一个实际存在的区间，不逐片扫描。
                range = availableRanges.higherEntry(range.getKey());
            }
            // 此时数值已经证明在 int 范围内。
            return (int) amount;
        }

        /**
         * 单独消耗指定片；可对高位片随机操作，其他片的数量不变。
         *
         * @param shardIndex 独立片索引
         * @param amount     消耗数量，不能超过该片现有量
         */
        public void consumeShard(long shardIndex, int amount) {
            // 查询也完成边界和旧视图同步。
            int availableAmount = getShardAmount(shardIndex);
            // 非法修改必须明确失败，不能悄悄截断。
            if (amount < 0 || amount > availableAmount) throw new IllegalArgumentException("Insufficient shard amount");
            // 零数量不产生新的区间记录。
            if (amount == 0) return;
            // 范围起点已由上面的查询验证。
            long start = shardStart(shardIndex);
            // 仅从该片所在范围取走数量，必要时拆开现有连续区间。
            removeWithin(start, start + Math.min(Integer.MAX_VALUE, initialAmount - start), amount);
            // 独立片减少量同时计入完整账本。
            remainingAmount -= amount;
            // 同步 int 识别视图。
            refreshView();
        }

        /** 按资源总量顺序消耗，跨越任意多片也只访问实际区间。 */
        public void consume(long amount) {
            // 先接收旧接口的合法减量。
            synchronizeView();
            // 所有 long 边界在减法之前验证。
            if (amount < 0 || amount > remainingAmount)
                throw new IllegalArgumentException("Insufficient SuperInput amount");
            // 内部批量路径不按分片循环。
            consumeInternal(amount);
            // 更新识别视图供后续查询使用。
            refreshView();
        }

        /** @return 实际可寻址的片起点；超出 long 饱和部分返回 initialAmount */
        private long shardStart(long shardIndex) {
            // 每片索引独立校验。
            if (shardIndex < 0 || shardIndex >= shardCount) throw new IndexOutOfBoundsException("Invalid shard index");
            // 避免 shardIndex * Integer.MAX_VALUE 溢出。
            return shardIndex > initialAmount / Integer.MAX_VALUE ? initialAmount : shardIndex * Integer.MAX_VALUE;
        }

        /** 接收原版旧接口对单个 int 视图的直接减量，拒绝负数或增量。 */
        private void synchronizeView() {
            // 工厂关联视图之前没有需要同步的外部写入。
            if (view == null) return;
            // 保存原版当前可见量。
            int currentAmount = adapter.getAmount(view);
            // 直接加量或负数写入都不能作为真实库存。
            if (currentAmount < 0 || currentAmount > displayedAmount)
                throw new IllegalStateException("Invalid SuperInput view mutation");
            // 使用上次显示值计算旧接口消耗，不会把 long 总量截成 int。
            if (currentAmount < displayedAmount) {
                // 这段差额最多是一个 int 视图大小。
                consumeInternal((long) displayedAmount - currentAmount);
                // 重装合法显示值，剩余长库存仍存在于账本。
                refreshView();
            }
        }

        /** 不递归读取视图的内部顺序减量。 */
        private void consumeInternal(long amount) {
            // 保存本次差额，循环中不会逐片减少它。
            long pendingAmount = amount;
            // 只遍历非连续编辑实际形成的区间数量。
            while (pendingAmount > 0) {
                // 取最靠前仍可用的一段。
                Map.Entry<Long, Long> range = availableRanges.firstEntry();
                // 正常账本不可能出现缺失；错误要在产出前暴露。
                if (range == null) throw new IllegalStateException("Missing SuperInput range");
                // 本次最多直接消耗整个连续段。
                long takenAmount = Math.min(pendingAmount, range.getValue() - range.getKey());
                // 删除旧起点。
                availableRanges.remove(range.getKey());
                // 尚有剩余则移动区间起点；此加法不超过原右端点。
                if (takenAmount < range.getValue() - range.getKey())
                    availableRanges.put(range.getKey() + takenAmount, range.getValue());
                // 消耗跨越数十亿片时，这里仍只需一次迭代。
                pendingAmount -= takenAmount;
            }
            // 一次性减少完整 long 总量。
            remainingAmount -= amount;
        }

        /** 在一个片的有限范围内删除 amount，可把区间拆成前后两段。 */
        private void removeWithin(long start, long end, long amount) {
            // 所需量由调用方预先验证，本循环只访问实际相交区间。
            long pendingAmount = amount;
            // 找到覆盖起点的区间。
            Map.Entry<Long, Long> range = availableRanges.floorEntry(start);
            // 落在空隙时从下一个实际可用区间开始。
            if (range == null || range.getValue() <= start) range = availableRanges.ceilingEntry(start);
            // 循环次数由这一个片的实际编辑数决定。
            while (pendingAmount > 0 && range != null && range.getKey() < end) {
                // 保存原边界，删除后仍可计算两边保留段。
                long originalStart = range.getKey();
                // 区间右端点永远不超过 Long.MAX_VALUE。
                long originalEnd = range.getValue();
                // 此区间内真正开始删除的位置。
                long removeStart = Math.max(start, originalStart);
                // 一次删除剩余所需量或此片剩余交集。
                long takenAmount = Math.min(pendingAmount, Math.min(end, originalEnd) - removeStart);
                // 移除旧完整段。
                availableRanges.remove(originalStart);
                // 保留本片之前仍可用的区间。
                if (originalStart < removeStart) availableRanges.put(originalStart, removeStart);
                // 保留删除位置之后的区间。
                if (removeStart + takenAmount < originalEnd)
                    availableRanges.put(removeStart + takenAmount, originalEnd);
                // 本轮删除完成的数量。
                pendingAmount -= takenAmount;
                // 从删除终点之后继续，无需扫描中间理论片。
                range = availableRanges.ceilingEntry(removeStart + takenAmount);
            }
            // 任何内部不一致都不能静默降低扣料数量。
            if (pendingAmount != 0) throw new IllegalStateException("Invalid SuperInput shard ranges");
        }

        /** 将完整 long 剩余量映射到唯一的合法 int 识别视图。 */
        private void refreshView() {
            // int 只用于 GUI 和资源索引，不承担完整配方数量。
            displayedAmount = (int) Math.min(Integer.MAX_VALUE, remainingAmount);
            // 直接写字段，避免间接触发账本读取。
            adapter.setAmount(view, displayedAmount);
        }
    }

    /** 保持 Forge 类型兼容的流体识别视图。 */
    public static final class FluidView extends FluidStack {

        /** 该视图对应的完整 long 账本。 */
        public final Snapshot<FluidStack> snapshot;

        /** 工厂专用构造器。 */
        private FluidView(Snapshot<FluidStack> snapshot) {
            // FluidStack 复制构造保留类型及流体标签。
            super(snapshot.prototype, 1);
            // 保存账本身份供控制器准确扣料。
            this.snapshot = snapshot;
        }
    }
}
