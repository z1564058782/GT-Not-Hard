package EnumList.EnumItemList.EnumModList;

import static gregtech.api.enums.Mods.AdvancedSolarPanel;
import static gregtech.api.enums.Mods.SuperSolarPanels;
import static gregtech.api.util.GTModHandler.getModItem;

import net.minecraft.item.ItemStack;

public class SolarPanelsList {

    public static final ItemStack Sunnarium = getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1L);
    public static final ItemStack Sunnarium_Alloy = getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1L, 1);
    public static final ItemStack Irradiant_Uranium = getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1L, 2);
    public static final ItemStack Enriched_Sunnarium = getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1L, 3);
    public static final ItemStack Enriched_Sunnarium_Alloy = getModItem(
        AdvancedSolarPanel.ID,
        "asp_crafting_items",
        1L,
        4);
    public static final ItemStack Irradiant_Glass_Pane = getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1L, 5);
    public static final ItemStack Iridium_Iron_Plate = getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1L, 6);
    public static final ItemStack Reinforced_Iridium_Iron_Plate = getModItem(
        AdvancedSolarPanel.ID,
        "asp_crafting_items",
        1L,
        7);
    public static final ItemStack Irradiant_Reinforced_Iridium_Plate = getModItem(
        AdvancedSolarPanel.ID,
        "asp_crafting_items",
        1L,
        8);
    public static final ItemStack Sunnarium_Piece = getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1L, 9);
    public static final ItemStack Quantum_Core = getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1L, 13);
    public static final ItemStack Solar_Light_Splitter = getModItem(SuperSolarPanels.ID, "solarsplitter", 1L);
    public static final ItemStack Ender_Quantum_Component = getModItem(
        SuperSolarPanels.ID,
        "enderquantumcomponent",
        1L);
    public static final ItemStack Blue_Spectral_Component = getModItem(SuperSolarPanels.ID, "bluecomponent", 1L);
    public static final ItemStack Green_Spectral_Component = getModItem(SuperSolarPanels.ID, "greencomponent", 1L);
    public static final ItemStack Red_Spectral_Component = getModItem(SuperSolarPanels.ID, "redcomponent", 1L);

    public static final ItemStack[] SolarPanels_List = new ItemStack[] { Sunnarium, Sunnarium_Alloy, Irradiant_Uranium,
        Enriched_Sunnarium, Enriched_Sunnarium_Alloy, Irradiant_Glass_Pane, Iridium_Iron_Plate,
        Reinforced_Iridium_Iron_Plate, Irradiant_Reinforced_Iridium_Plate, Sunnarium_Piece, Quantum_Core,
        Solar_Light_Splitter, Ender_Quantum_Component, Blue_Spectral_Component, Green_Spectral_Component,
        Red_Spectral_Component };
}
