package machines;

import java.math.BigInteger;
import java.util.concurrent.ThreadLocalRandom;

import gregtech.api.util.ParallelHelper;

/** Chaos 无线并行的整数运算；不展开机器数、并行数或输入分片。 */
public final class ChaosParallel {

    private ChaosParallel() {}

    /** 2.1G 沿用 GT 的 int 上限；32 个机器开始明确饱和到 long 上限。 */
    public static long wirelessLimit(int machines) {
        if (machines <= 0) return 0;
        if (machines >= 32) return Long.MAX_VALUE;
        return ((long) Integer.MAX_VALUE) << machines;
    }

    /** 长并行概率采样，整数部分保持精确，随机部分采用 GT 同类的正态近似。 */
    public static long chanceMultiplier(int chance, long parallel) {
        return bigChanceMultiplier(chance, parallel).longValueExact();
    }

    /** 输出概率允许整倍产物超过 long，输入的 0～100% 概率仍可精确转回 long。 */
    public static BigInteger bigChanceMultiplier(int chance, long parallel) {
        if (chance <= 0 || parallel <= 0) return BigInteger.ZERO;
        BigInteger integral = BigInteger.valueOf(parallel)
            .multiply(BigInteger.valueOf(chance / 10000));
        int fractional = chance % 10000;
        if (fractional == 0) return integral;
        if (parallel <= Integer.MAX_VALUE) {
            // GT 内部的整倍概率先做 int 乘法；单独采样余数，避免 >100% 时溢出。
            return integral.add(
                BigInteger
                    .valueOf(ParallelHelper.calculateIntegralChancedOutputMultiplier(fractional, (int) parallel)));
        }
        // 先商后余，避免超过 2^53 时把确定性的期望整数部分转换成 double。
        long numerator = (parallel % 10000) * fractional;
        long mean = (parallel / 10000) * fractional + numerator / 10000;
        double probability = fractional / 10000.0;
        double deviation = Math.sqrt(parallel * probability * (1.0 - probability));
        long delta = Math.round(
            deviation * ThreadLocalRandom.current()
                .nextGaussian() + (numerator % 10000) / 10000.0);
        long sampled = delta < 0 ? mean - Math.min(mean, -delta) : mean + Math.min(parallel - mean, delta);
        return integral.add(BigInteger.valueOf(sampled));
    }
}
