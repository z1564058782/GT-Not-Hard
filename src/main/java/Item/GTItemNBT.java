package Item;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import util.ItemUtils;

public class GTItemNBT {

    // GregTech:gt.metaitem.01
    // "Insanely Ultimate Battery"
    public static final ItemStack Insanely_Ultimate_Battery = ItemUtils.getItemStack(
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32145),
        "{GT.ItemCharge:9223372036854775807L}",
        null);
    public static final ItemStack[] GregTech_gt_metaitem_01 = { Insanely_Ultimate_Battery };

}
