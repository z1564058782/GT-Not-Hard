package EnumList.EnumListCheck;

import static EnumList.EnumListCheck.GTItemNBT.GregTech_gt_metaitem_01;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;
import static util.AggregateItemStackArray.addSplitAggregateArray;
import static util.Utils.setStackSize;

import net.minecraft.item.ItemStack;

import EnumList.EnumItemList.EnumBiologyList.MobSoulList;
import EnumList.EnumItemList.EnumBiologyList.SoulVialList;
import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.OneToManyItemsFrontend_Large;

public class ItemNBTCheck {

    public static int NEI_ItemOutput_Size = util.RecipesFrontend.ResourceCatalogFrontend.OUTPUTS_PER_PAGE;

    public static final RecipeMap<RecipeMapBackend> addItemNBTCheckRecipes = RecipeMapBuilder.of("Item NBT Check")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(util.RecipesFrontend.ResourceCatalogFrontend.HANDLER_HEIGHT))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static void addItemNBTCheckRecipes() {

        // GregTech:gt.metaitem.01
        ItemStack[][] Fake_GregTech_gt_metaitem_01_Split = addSplitAggregateArray(
            GregTech_gt_metaitem_01,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_GregTech_gt_metaitem_01_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item NBT Check")
                .eut(0)
                .addTo(addItemNBTCheckRecipes);
        }

        // EnderIO:itemSoulVessel
        ItemStack[] Fake_SoulVial_List = new ItemStack[] { setStackSize(SoulVialList.SoulVessel_Bat, 1),
            setStackSize(SoulVialList.SoulVessel_Blaze, 1), };
        ItemStack[][] Fake_SoulVial_List_Split = addSplitAggregateArray(Fake_SoulVial_List, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_SoulVial_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item NBT Check")
                .eut(0)
                .addTo(addItemNBTCheckRecipes);
        }

        // DraconicEvolution:mobSoul
        ItemStack[] Fake_MobSoul_List = new ItemStack[] { setStackSize(MobSoulList.MobSoul_Bat, 1),
            setStackSize(MobSoulList.MobSoul_Blaze, 1), getModItem(GTPlusPlus.ID, "GTPP.BattPack.01.name", 1L, 1) };
        ItemStack[][] Fake_MobSoul_List_Split = addSplitAggregateArray(Fake_MobSoul_List, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_MobSoul_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item NBT Check")
                .eut(0)
                .addTo(addItemNBTCheckRecipes);
        }
    }
}
