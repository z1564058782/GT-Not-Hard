package EnumList.EnumItemList.EnumGTList;

import static gregtech.api.enums.Mods.GGFab;
import static gregtech.api.util.GTModHandler.getModItem;

import net.minecraft.item.ItemStack;

public class ToolList {

    public static final ItemStack Single_Use_File = getModItem(GGFab.ID, "gt.ggfab.d1", 1L, 0);
    public static final ItemStack Single_Use_Wrench = getModItem(GGFab.ID, "gt.ggfab.d1", 1L, 1);
    public static final ItemStack Single_Use_Crowbar = getModItem(GGFab.ID, "gt.ggfab.d1", 1L, 2);
    public static final ItemStack Single_Use_Cutter = getModItem(GGFab.ID, "gt.ggfab.d1", 1L, 3);
    public static final ItemStack Single_Use_Hammer = getModItem(GGFab.ID, "gt.ggfab.d1", 1L, 4);
    public static final ItemStack Single_Use_Mallet = getModItem(GGFab.ID, "gt.ggfab.d1", 1L, 5);
    public static final ItemStack Single_Use_Screwdriver = getModItem(GGFab.ID, "gt.ggfab.d1", 1L, 6);
    public static final ItemStack Single_Use_Saw = getModItem(GGFab.ID, "gt.ggfab.d1", 1L, 7);

    public static final ItemStack[] Tool_List = new ItemStack[] { Single_Use_File, Single_Use_Wrench,
        Single_Use_Crowbar, Single_Use_Cutter, Single_Use_Hammer, Single_Use_Mallet, Single_Use_Screwdriver,
        Single_Use_Saw };
}
