package loader;

import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GTModHandler;
import hatch.SuperInputTier;

/** 分级生存配方：I 级由原版高级 ME 仓室升级，后续每级消耗四个前一级。 */
public final class SuperInputRecipeLoader {

    /** 防止加载器重复调用时重复添加配方。 */
    private static boolean recipesRegistered;

    /** 纯静态加载器无需实例。 */
    private SuperInputRecipeLoader() {}

    /** 添加全部 34 个精确 Meta 配方；平衡成本集中在此文件。 */
    public static void registerRecipes() {
        // 保证重复初始化没有副作用。
        if (recipesRegistered) return;
        // 沿用 GT 的缓存和不可移除配方标记。
        long recipeBits = GTModHandler.RecipeBits.BUFFERED | GTModHandler.RecipeBits.NOT_REMOVABLE;
        // 第一层四块中子素板、四个 UV 电路和原版高级 ME 物品总线。
        GTModHandler.addCraftingRecipe(
            SuperInputLoader.getStack(true, 0, 1),
            recipeBits,
            new Object[] { "PCP", "CHC", "PCP", 'P', OrePrefixes.plate.get(Materials.Neutronium), 'C',
                OrePrefixes.circuit.get(Materials.UV), 'H', ItemList.Hatch_Input_Bus_ME_Advanced });
        // 流体仓第一层采用同样材料，中心换成原版高级 ME 流体仓。
        GTModHandler.addCraftingRecipe(
            SuperInputLoader.getStack(false, 0, 1),
            recipeBits,
            new Object[] { "PCP", "CHC", "PCP", 'P', OrePrefixes.plate.get(Materials.Neutronium), 'C',
                OrePrefixes.circuit.get(Materials.UV), 'H', ItemList.Hatch_Input_ME_Advanced });
        // 之后每级四合一，与分片数量四倍递增一致；只注册 16 次升级。
        for (int tierIndex = 1; tierIndex < SuperInputTier.tierCount; tierIndex++) {
            // 总线配方精确匹配前一级的子类型 Meta，不使用通配 damage。
            GTModHandler.addCraftingRecipe(
                SuperInputLoader.getStack(true, tierIndex, 1),
                recipeBits,
                new Object[] { "HCH", " P ", "HCH", 'H', SuperInputLoader.getStack(true, tierIndex - 1, 1), 'C',
                    OrePrefixes.circuit.get(Materials.UV), 'P', OrePrefixes.plate.get(Materials.Neutronium) });
            // 仓室升级与总线完全分离，不能互换合成。
            GTModHandler.addCraftingRecipe(
                SuperInputLoader.getStack(false, tierIndex, 1),
                recipeBits,
                new Object[] { "HCH", " P ", "HCH", 'H', SuperInputLoader.getStack(false, tierIndex - 1, 1), 'C',
                    OrePrefixes.circuit.get(Materials.UV), 'P', OrePrefixes.plate.get(Materials.Neutronium) });
        }
        // 全部配方注册完毕后标记，初始化失败时不伪装成成功。
        recipesRegistered = true;
    }
}
