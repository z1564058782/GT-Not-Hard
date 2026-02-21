package util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.minecraft.item.ItemStack;

public class AggregateItemStackArray {

    /**
     * 将多个ItemStack数组合并为一个大的ItemStack数组
     *
     * @param arrays 需要合并的ItemStack数组参数，可以是0个或多个
     * @return 合并后的ItemStack数组，如果参数为空则返回空数组
     */
    public static ItemStack[] addAggregateArray(ItemStack[]... arrays) {
        // 检查输入参数是否为空
        if (arrays == null || arrays.length == 0) {
            // 返回空数组而不是null，避免空指针异常
            return new ItemStack[0];
        }

        // 第一步：计算合并后数组的总长度
        int totalLength = 0;
        for (ItemStack[] array : arrays) {
            // 只计算非空数组的长度
            if (array != null) {
                totalLength += array.length;
            }
        }

        // 第二步：创建合并后的数组
        ItemStack[] aggregatedArray = new ItemStack[totalLength];

        // 第三步：将各个数组的元素复制到合并后的数组中
        int currentIndex = 0;
        for (ItemStack[] array : arrays) {
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
     * 将多个ItemStack数组合并为一个大的ItemStack数组，并确保合并后数组中的元素具有唯一性
     * 此方法提供简化的唯一性判断，仅基于物品ID和元数据
     * 性能更优，适用于不需要考虑NBT和数量的场景
     *
     * @param arrays 需要合并的ItemStack数组参数，可以是0个或多个
     * @return 合并后的ItemStack数组（元素唯一），如果参数为空则返回空数组
     */
    public static ItemStack[] addCompressAggregateArray(ItemStack[]... arrays) {
        // 检查输入参数是否为空
        if (arrays == null || arrays.length == 0) {
            // 返回空数组而不是null，避免空指针异常
            return new ItemStack[0];
        }

        // 第一步：使用List临时存储所有元素，便于去重操作
        List<ItemStack> itemList = new ArrayList<>();

        // 第二步：遍历所有输入数组，收集所有元素
        for (ItemStack[] array : arrays) {
            // 跳过空数组
            if (array == null) {
                continue;
            }

            // 遍历当前数组的所有元素
            for (ItemStack itemStack : array) {
                // 跳过空元素
                if (itemStack != null && itemStack.getItem() != null) {
                    itemList.add(itemStack);
                }
            }
        }

        // 第三步：如果没有元素，直接返回空数组
        if (itemList.isEmpty()) {
            return new ItemStack[0];
        }

        // 第四步：使用Set进行去重，确保元素唯一性（简化的唯一性判断）
        // 创建用于存储唯一元素的List
        List<ItemStack> uniqueItemList = new ArrayList<>();
        // 创建用于记录已处理物品的Set，仅基于物品ID和元数据
        Set<String> processedItemSet = new HashSet<>();

        // 遍历所有物品，进行去重处理
        for (ItemStack itemStack : itemList) {
            // 生成简化的物品唯一标识（仅物品ID和元数据）
            String itemKey = generateSimpleItemStackKey(itemStack);

            // 检查该物品是否已处理过
            if (!processedItemSet.contains(itemKey)) {
                // 如果是新物品，添加到结果列表和已处理集合中
                uniqueItemList.add(itemStack);
                processedItemSet.add(itemKey);
            }
            // 如果已存在，跳过该物品，确保唯一性
        }

        // 第五步：将List转换为数组并返回
        ItemStack[] uniqueArray = new ItemStack[uniqueItemList.size()];
        uniqueItemList.toArray(uniqueArray);

        return uniqueArray;
    }

    /**
     * 生成ItemStack的简化唯一标识字符串
     * 仅基于物品ID和元数据，不考虑NBT和数量
     * 性能更优，适用于大多数场景
     *
     * @param itemStack 需要生成标识的ItemStack对象
     * @return ItemStack的简化唯一标识字符串，格式为"物品ID:元数据"
     */
    private static String generateSimpleItemStackKey(ItemStack itemStack) {
        // 检查itemStack是否为空
        if (itemStack == null || itemStack.getItem() == null) {
            return "null:0";
        }

        // 获取物品ID和元数据
        String itemId = itemStack.getItem()
            .getUnlocalizedName();
        int metaData = itemStack.getItemDamage();

        // 构建简化的唯一标识字符串
        // 格式：物品ID:元数据
        return itemId + ":" + metaData;
    }

    /**
     * 将一个ItemStack数组按照指定的长度进行分割
     * 如果数组长度不能整除分割长度，最后一个子数组将包含剩余的所有元素
     *
     * @param sourceArray 需要分割的原始ItemStack数组
     * @param splitLength 每个子数组的长度（分割大小），必须大于0
     * @return 分割后的ItemStack二维数组，包含所有子数组
     *         如果输入数组为空或null，返回空二维数组
     *         如果分割长度小于等于0，返回包含原始数组的二维数组
     */
    public static ItemStack[][] addSplitAggregateArray(ItemStack[] sourceArray, int splitLength) {
        // 第一步：检查输入参数的合法性
        if (sourceArray == null || sourceArray.length == 0) {
            // 如果源数组为空或null，返回空二维数组
            return new ItemStack[0][];
        }

        if (splitLength <= 0) {
            // 如果分割长度不合法，返回包含原始数组的二维数组
            System.err.println("警告：分割长度必须大于0，当前值为: " + splitLength + "，将返回原始数组");
            ItemStack[][] result = new ItemStack[1][];
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
        ItemStack[][] splitArrays = new ItemStack[numberOfArrays][];

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
            ItemStack[] currentArray = new ItemStack[currentLength];

            // 将源数组的元素复制到当前子数组中
            System.arraycopy(sourceArray, startIndex, currentArray, 0, currentLength);

            // 将当前子数组添加到结果中
            splitArrays[i] = currentArray;
        }

        // 第五步：返回分割后的二维数组
        return splitArrays;
    }
}
