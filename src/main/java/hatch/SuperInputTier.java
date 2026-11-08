package hatch;

/**
 * 两种仓室共用的等级定义。物品 Meta 从 0 起算，显示等级 n 从 1 起算。
 * 每级拥有 2^(2n) 个独立逻辑分片，每片最多 Integer.MAX_VALUE 个物品或 mB。
 * XVII 的理论分片容量超过有符号 long，因此实际请求在 Long.MAX_VALUE 饱和。
 */
public final class SuperInputTier {

    /** I 至 XVII；XVI 的 2^32 片还不足以覆盖 Long.MAX_VALUE。 */
    public static final int tierCount = 17;

    /** 世界、掉落和放置时共用的等级 NBT 键，与原版配置键隔离。 */
    public static final String tierTag = "superInputTier";

    /** 上一版没有等级标签而具有 64 片，迁移为 III，避免旧方块降级。 */
    public static final int legacyTierIndex = 2;

    /** 每个 Meta 对应的罗马数字，不随语言变化。 */
    private static final String[] tierNames = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI",
        "XII", "XIII", "XIV", "XV", "XVI", "XVII" };

    /** 定义类不持有可变实例。 */
    private SuperInputTier() {}

    /** @return 校验后的 0～16 Meta；非法等级直接拒绝，不能回绕成高等级 */
    public static int checkTierIndex(int tierIndex) {
        // 在移位和索引前检查范围，避免 Java 移位计数截断。
        if (tierIndex < 0 || tierIndex >= tierCount)
            throw new IllegalArgumentException("Invalid SuperInput tier: " + tierIndex);
        // 保持调用者传入的合法 Meta。
        return tierIndex;
    }

    /** @return 按 2^(2n) 计算的逻辑片数，XVII 为 17,179,869,184 */
    public static long getShardCount(int tierIndex) {
        // 全程用 long 移位；最高只移 34 位。
        return 1L << (2 * (checkTierIndex(tierIndex) + 1));
    }

    /** @return 当前等级每种资源一次检查的上限，精确到 Long.MAX_VALUE */
    public static long getMaxInputAmount(int tierIndex) {
        // 先计算片数，不能先用 int 相乘。
        long shardCount = getShardCount(tierIndex);
        // 先除后比较，避免乘法溢出；最后一级饱和而不是变负。
        return shardCount > Long.MAX_VALUE / Integer.MAX_VALUE ? Long.MAX_VALUE : shardCount * Integer.MAX_VALUE;
    }

    /** @return I～XVII 的稳定名称后缀 */
    public static String getTierName(int tierIndex) {
        // 对外方法都不接受越界 Meta。
        return tierNames[checkTierIndex(tierIndex)];
    }
}
