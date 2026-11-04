package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import net.minecraftforge.fluids.FluidStack;

public class AggregateFluidStackArray {

    public static FluidStack[] addAggregateArray(FluidStack[]... arrays) {
        List<FluidStack> result = new ArrayList<>();
        if (arrays != null) {
            for (FluidStack[] array : arrays) {
                if (array != null) {
                    result.addAll(Arrays.asList(array));
                }
            }
        }
        return result.toArray(new FluidStack[0]);
    }

    public static FluidStack[] addCompressAggregateArray(FluidStack[]... arrays) {
        Map<String, FluidStack> unique = new LinkedHashMap<>();
        for (FluidStack stack : checkFluidStack(addAggregateArray(arrays))) {
            unique.putIfAbsent(
                stack.getFluid()
                    .getName(),
                stack);
        }
        return unique.values()
            .toArray(new FluidStack[0]);
    }

    public static FluidStack[][] addSplitAggregateArray(FluidStack[] sourceArray, int splitLength) {
        if (sourceArray == null || sourceArray.length == 0) {
            return new FluidStack[0][];
        }
        if (splitLength <= 0) {
            return new FluidStack[][] { sourceArray };
        }
        int pageCount = (sourceArray.length - 1) / splitLength + 1;
        FluidStack[][] result = new FluidStack[pageCount][];
        for (int i = 0; i < pageCount; i++) {
            int start = i * splitLength;
            result[i] = Arrays.copyOfRange(sourceArray, start, Math.min(start + splitLength, sourceArray.length));
        }
        return result;
    }

    /** Missing resources are omitted, never replaced with water. */
    public static FluidStack[] checkFluidStack(FluidStack[] fluidStacks) {
        List<FluidStack> result = new ArrayList<>();
        if (fluidStacks != null) {
            for (FluidStack stack : fluidStacks) {
                if (stack != null && stack.getFluid() != null
                    && stack.getFluid()
                        .getName() != null
                    && !stack.getFluid()
                        .getName()
                        .isEmpty()) {
                    result.add(stack);
                }
            }
        }
        return result.toArray(new FluidStack[0]);
    }
}
