package EnumList.EnumItemList.EnumBiologyList;

import static gregtech.api.enums.Mods.DraconicEvolution;

import net.minecraft.item.ItemStack;

import util.ItemUtils;

public class MobSoulList {

    public static final ItemStack MobSoul_Bat = ItemUtils
        .getItemStack(DraconicEvolution.ID, "mobSoul", 1L, "{Name: \"Bat\"}");
    public static final ItemStack MobSoul_Blaze = ItemUtils
        .getItemStack(DraconicEvolution.ID, "mobSoul", 1L, "{Name: \"Blaze\"}");
}
