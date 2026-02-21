package Recipes.SingularityRecipes_Ecosystem;

import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.util.GTModHandler.getModItem;

import net.minecraft.item.ItemStack;

public class Ecosystem_AlgaeFarm {

    // Pure
    public static final ItemStack[] Pure_AlgaeFarm = new ItemStack[] {
        // "Algae Biomass"
        getModItem(GTPlusPlus.ID, "item.BasicAgrichemItem", 1L, 0),
        // "Green Algae Biomass"
        getModItem(GTPlusPlus.ID, "item.BasicAgrichemItem", 1L, 1),
        // "Brown Algae Biomass"
        getModItem(GTPlusPlus.ID, "item.BasicAgrichemItem", 1L, 2),
        // "Golden-Brown Algae Biomass"
        getModItem(GTPlusPlus.ID, "item.BasicAgrichemItem", 1L, 3),
        // "Red Algae Biomass"
        getModItem(GTPlusPlus.ID, "item.BasicAgrichemItem", 1L, 4) };
}
