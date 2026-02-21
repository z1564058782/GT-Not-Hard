package util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.minecraftforge.fluids.FluidStack;

/**
 * FluidStack数组聚合操作工具类
 * 提供FluidStack数组的合并、去重合并和分割功能
 * 对应ItemStack[]操作的工具类转换版本
 *
 * @author GTNH2.8.0
 */
public class AggregateFluidStackArray {

    /**
     * 将多个FluidStack数组合并为一个大的FluidStack数组
     * 此方法仅进行简单的数组合并，不进行去重或数量合并操作
     *
     * @param arrays 需要合并的FluidStack数组参数，可以是0个或多个
     * @return 合并后的FluidStack数组，如果参数为空则返回空数组
     */
    public static FluidStack[] addAggregateArray(FluidStack[]... arrays) {
        // 检查输入参数是否为空
        if (arrays == null || arrays.length == 0) {
            // 返回空数组而不是null，避免空指针异常
            return new FluidStack[0];
        }

        // 第一步：计算合并后数组的总长度
        int totalLength = 0;
        for (FluidStack[] array : arrays) {
            // 只计算非空数组的长度
            if (array != null) {
                totalLength += array.length;
            }
        }

        // 第二步：创建合并后的数组
        FluidStack[] aggregatedArray = new FluidStack[totalLength];

        // 第三步：将各个数组的元素复制到合并后的数组中
        int currentIndex = 0;
        for (FluidStack[] array : arrays) {
            // 跳过空数组
            if (array == null) {
                continue;
            }

            // 使用System.arraycopy进行高效数组复制
            System.arraycopy(array, 0, aggregatedArray, currentIndex, array.length);

            // 更新当前索引位置
            currentIndex += array.length;
        }

        // 第四步：返回合并后的数组
        return aggregatedArray;
    }

    /**
     * 将多个FluidStack数组合并为一个大的FluidStack数组，并确保合并后数组中的元素具有唯一性
     * 此方法基于流体ID进行唯一性判断，不考虑流体数量和NBT标签
     * 性能更优，适用于需要去重但不关心数量的场景
     *
     * @param arrays 需要合并的FluidStack数组参数，可以是0个或多个
     * @return 合并后的FluidStack数组（元素唯一），如果参数为空则返回空数组
     */
    public static FluidStack[] addCompressAggregateArray(FluidStack[]... arrays) {
        // 检查输入参数是否为空
        if (arrays == null || arrays.length == 0) {
            // 返回空数组而不是null，避免空指针异常
            return new FluidStack[0];
        }

        // 第一步：使用List临时存储所有元素，便于去重操作
        List<FluidStack> fluidList = new ArrayList<>();

        // 第二步：遍历所有输入数组，收集所有元素
        for (FluidStack[] array : arrays) {
            // 跳过空数组
            if (array == null) {
                continue;
            }

            // 遍历当前数组的所有元素
            for (FluidStack fluidStack : array) {
                // 跳过空元素
                if (fluidStack != null && fluidStack.getFluid() != null) {
                    fluidList.add(fluidStack);
                }
            }
        }

        // 第三步：如果没有元素，直接返回空数组
        if (fluidList.isEmpty()) {
            return new FluidStack[0];
        }

        // 第四步：使用Set进行去重，确保元素唯一性（基于流体ID的唯一性判断）
        // 创建用于存储唯一元素的List
        List<FluidStack> uniqueFluidList = new ArrayList<>();
        // 创建用于记录已处理流体的Set，仅基于流体ID
        Set<String> processedFluidSet = new HashSet<>();

        // 遍历所有流体，进行去重处理
        for (FluidStack fluidStack : fluidList) {
            // 生成流体的唯一标识（仅流体ID）
            String fluidKey = generateFluidStackKey(fluidStack);

            // 检查该流体是否已处理过
            if (!processedFluidSet.contains(fluidKey)) {
                // 如果是新流体，添加到结果列表和已处理集合中
                uniqueFluidList.add(fluidStack);
                processedFluidSet.add(fluidKey);
            }
            // 如果已存在，跳过该流体，确保唯一性
        }

        // 第五步：将List转换为数组并返回
        FluidStack[] uniqueArray = new FluidStack[uniqueFluidList.size()];
        uniqueFluidList.toArray(uniqueArray);

        return uniqueArray;
    }

    /**
     * 生成FluidStack的唯一标识字符串
     * 仅基于流体ID，不考虑数量和NBT标签
     * 适用于大多数需要流体去重的场景
     *
     * @param fluidStack 需要生成标识的FluidStack对象
     * @return FluidStack的唯一标识字符串，格式为"流体名称"
     */
    private static String generateFluidStackKey(FluidStack fluidStack) {
        // 检查fluidStack是否为空
        if (fluidStack == null || fluidStack.getFluid() == null) {
            return "null";
        }

        // 获取流体名称作为唯一标识
        String fluidName = fluidStack.getFluid()
            .getName();

        // 构建唯一标识字符串
        // 格式：流体名称
        return fluidName;
    }

    /**
     * 将一个FluidStack数组按照指定的长度进行分割
     * 如果数组长度不能整除分割长度，最后一个子数组将包含剩余的所有元素
     *
     * @param sourceArray 需要分割的原始FluidStack数组
     * @param splitLength 每个子数组的长度（分割大小），必须大于0
     * @return 分割后的FluidStack二维数组，包含所有子数组
     *         如果输入数组为空或null，返回空二维数组
     *         如果分割长度小于等于0，返回包含原始数组的二维数组
     */
    public static FluidStack[][] addSplitAggregateArray(FluidStack[] sourceArray, int splitLength) {
        // 第一步：检查输入参数的合法性
        if (sourceArray == null || sourceArray.length == 0) {
            // 如果源数组为空或null，返回空二维数组
            return new FluidStack[0][];
        }

        if (splitLength <= 0) {
            // 如果分割长度不合法，返回包含原始数组的二维数组
            System.err.println("警告：分割长度必须大于0，当前值为: " + splitLength + "，将返回原始数组");
            FluidStack[][] result = new FluidStack[1][];
            result[0] = sourceArray;
            return result;
        }

        // 第二步：计算需要分割成多少个子数组
        int sourceLength = sourceArray.length; // 源数组长度
        int numberOfArrays; // 子数组数量

        if (sourceLength % splitLength == 0) {
            // 如果能整除，子数组数量为 sourceLength / splitLength
            numberOfArrays = sourceLength / splitLength;
        } else {
            // 如果不能整除，需要额外一个数组存放剩余元素
            numberOfArrays = sourceLength / splitLength + 1;
        }

        // 第三步：创建结果二维数组
        FluidStack[][] splitArrays = new FluidStack[numberOfArrays][];

        // 第四步：进行分割操作
        for (int i = 0; i < numberOfArrays; i++) {
            // 计算当前子数组的起始索引
            int startIndex = i * splitLength;

            // 计算当前子数组的实际长度
            // 如果是最后一个子数组，且不能整除，长度可能小于splitLength
            int currentLength;
            if (i == numberOfArrays - 1 && sourceLength % splitLength != 0) {
                // 最后一个子数组，且不能整除
                currentLength = sourceLength % splitLength;
            } else {
                // 其他子数组，长度都为splitLength
                currentLength = splitLength;
            }

            // 创建当前子数组
            FluidStack[] currentArray = new FluidStack[currentLength];

            // 将源数组的元素复制到当前子数组中
            System.arraycopy(sourceArray, startIndex, currentArray, 0, currentLength);

            // 将当前子数组添加到结果中
            splitArrays[i] = currentArray;
        }

        // 第五步：返回分割后的二维数组
        return splitArrays;
    }
}
