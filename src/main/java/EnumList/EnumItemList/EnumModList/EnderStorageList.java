package EnumList.EnumItemList.EnumModList;

import static gregtech.api.enums.Mods.EnderStorage;
import static gregtech.api.util.GTModHandler.getModItem;

import net.minecraft.item.ItemStack;

public class EnderStorageList {

    public static final ItemStack Advanced_Ender_Chest = getModItem(EnderStorage.ID, "enderChest", 1L);
    public static final ItemStack Advanced_Ender_Tank = getModItem(EnderStorage.ID, "enderChest", 1L, 4096);
    public static final ItemStack Ender_Pouch = getModItem(EnderStorage.ID, "enderPouch", 1L);

    public static final ItemStack[] EnderStorage_List = new ItemStack[] { Advanced_Ender_Chest, Advanced_Ender_Tank,
        Ender_Pouch };
}
