package util;

import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import Recipes.ChaosRecipes.ChaosOreFactoryRecipes;

public class ChaosOreProcessingUtil {

    /**
     * 在Chaos机器中处理矿石的简便方法
     *
     * @param inputItems       输入物品列表
     * @param inputFluids      输入流体列表
     * @param mode             处理模式 (0-6)
     * @param voidStone        是否弃石
     * @param availableVoltage 可用电压
     * @param maxParallel      最大并行数
     * @return 处理后的物品数组
     */
    public static ItemStack[] processOresInChaos(List<ItemStack> inputItems, List<FluidStack> inputFluids, int mode,
        boolean voidStone, long availableVoltage, int maxParallel) {

        // 创建配置
        ChaosOreFactoryRecipes.OreProcessingConfig config = ChaosOreFactoryRecipes.createDefaultConfig();
        config.processingMode = mode;
        config.voidStoneMode = voidStone;
        config.availableVoltage = availableVoltage;
        config.maxParallel = maxParallel;
        config.inputItems = inputItems;
        config.inputFluids = inputFluids;

        // 执行处理
        ChaosOreFactoryRecipes.OreProcessingResult result = ChaosOreFactoryRecipes.processOres(config);

        if (result.success) {
            return result.outputItems;
        } else {
            return new ItemStack[0];
        }
    }

    /**
     * 检查物品是否为有效的矿石类型
     *
     * @param stack 物品堆
     * @return 是否为有效矿石
     */
    public static boolean isValidOre(ItemStack stack) {
        return ChaosOreFactoryRecipes.isValidOreType(gregtech.api.util.GTUtility.stackToInt(stack));
    }

    /**
     * 获取矿石处理模式描述
     *
     * @param mode 处理模式
     * @return 模式描述列表
     */
    public static List<String> getProcessingModeDescription(int mode) {
        return ChaosOreFactoryRecipes.getModeDescription(mode);
    }
}
