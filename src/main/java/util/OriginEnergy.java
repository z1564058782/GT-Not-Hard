package util;

import java.math.BigInteger;

/** Exact per-tick output and persistence calculations for Origin. */
public final class OriginEnergy {

    private OriginEnergy() {}

    public static BigInteger calculate(long recipeEUt, long tier, int multiplier) {
        if (recipeEUt >= 0 || tier <= 0 || multiplier <= 0) {
            return BigInteger.ZERO;
        }
        return BigInteger.valueOf(recipeEUt)
            .negate()
            .multiply(BigInteger.valueOf(tier))
            .multiply(BigInteger.valueOf(multiplier));
    }

    public static BigInteger restore(String savedEnergy, long legacyEUt, boolean running) {
        if (!running) {
            return BigInteger.ZERO;
        }
        if (savedEnergy == null) {
            return BigInteger.valueOf(Math.max(0, legacyEUt));
        }
        try {
            return new BigInteger(savedEnergy).max(BigInteger.ZERO);
        } catch (NumberFormatException ignored) {
            return BigInteger.ZERO;
        }
    }

    public static BigInteger limitDynamoInjection(BigInteger remaining, long voltage, long amps, long stored,
        long capacity) {
        if (remaining.signum() <= 0 || voltage <= 0 || amps <= 0 || stored < 0 || capacity <= stored) {
            return BigInteger.ZERO;
        }
        return BigInteger.valueOf(voltage)
            .multiply(BigInteger.valueOf(amps))
            .min(BigInteger.valueOf(capacity - stored))
            .min(remaining);
    }
}
