package EnumList.EnumItemList.EnumBiologyList;

import static gregtech.api.enums.Mods.EnderIO;

import net.minecraft.item.ItemStack;

import util.ItemUtils;

public class SoulVialList {

    public static final ItemStack SoulVessel_Bat = ItemUtils
        .getItemStack(EnderIO.ID, "itemSoulVessel", 1L, "{isStub:1, id:\"Bat\"}");
    public static final ItemStack SoulVessel_Blaze = ItemUtils
        .getItemStack(EnderIO.ID, "itemSoulVessel", 1L, "{isStub:1, id:\"Blaze\"}");
}
