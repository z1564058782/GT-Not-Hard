package util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.minecraftforge.fluids.FluidRegistry;
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

    /**
     * 检查FluidStack数组中的每个流体是否实际存在
     * 如果流体不存在（为null或流体注册名为空），自动替换为水（water）
     * 此方法会创建新的数组，不会修改原始数组
     *
     * @param fluidStacks 需要检查的FluidStack数组
     * @return 检查并替换后的新FluidStack数组
     */
    public static FluidStack[] checkFluidStack(FluidStack[] fluidStacks) {
        // 第一步：检查输入参数是否为null
        if (fluidStacks == null) {
            // 如果输入为null，返回空数组
            System.err.println("警告：输入的FluidStack数组为null，将返回空数组");
            return new FluidStack[0];
        }

        // 第二步：如果数组长度为0，直接返回空数组
        if (fluidStacks.length == 0) {
            return new FluidStack[0];
        }

        // 第三步：创建水的静态实例，用于替换无效流体
        // 使用FluidRegistry.getFluidStack("water", 1)获取水
        FluidStack waterFluid = FluidRegistry.getFluidStack("water", 1);

        // 检查水是否成功获取，如果水不存在（理论上不应该发生），则创建一个空的FluidStack占位符
        if (waterFluid == null) {
            System.err.println("严重警告：无法获取水（water）流体，将使用null作为替换值");
            // 注意：这里如果水都不存在，我们只能使用null，但后续会再次检查
        }

        // 第四步：创建新数组，长度与原数组相同
        FluidStack[] checkedArray = new FluidStack[fluidStacks.length];

        // 第五步：遍历原数组的每个元素进行检查
        for (int i = 0; i < fluidStacks.length; i++) {
            FluidStack currentFluid = fluidStacks[i];

            // 判断当前流体是否存在：
            // 1. currentFluid不为null
            // 2. currentFluid的getFluid()返回不为null
            // 3. 流体的名称不为空（通过getFluid().getName()检查）
            if (currentFluid != null && currentFluid.getFluid() != null
                && currentFluid.getFluid()
                    .getName() != null
                && !currentFluid.getFluid()
                    .getName()
                    .isEmpty()) {

                // 流体存在，保留原流体
                // 注意：这里复制的是引用，如果需要深拷贝可以修改为copy()方法
                checkedArray[i] = currentFluid;
            } else {
                // 流体不存在（null或无效），替换为水
                // 输出调试信息，帮助定位问题
                System.err.println("警告：位置 " + i + " 的流体不存在（无效流体或null），已自动替换为水");

                // 使用水的copy()方法创建新的实例，避免多个位置共享同一个对象
                if (waterFluid != null) {
                    checkedArray[i] = waterFluid.copy();
                } else {
                    // 如果水都不存在，只能设置为null
                    checkedArray[i] = null;
                }
            }
        }

        // 第六步：返回检查并替换后的新数组
        return checkedArray;
    }
}
