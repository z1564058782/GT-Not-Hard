package Recipes.SingularityRecipes_VoidIngot;

import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

public class SingularityIngotRecipes_T1 {

    public static final Map<String, ItemStack[]> VoidIngotRecipes_T1 = new HashMap<>();

    public static void addVoidIngotRecipes_T1() {
        // T0 - Overworld - Ow
        VoidIngotRecipes_T1.put(
            "Mo",
            new ItemStack[] {
                // Molybdenum Vein
                // "Calcium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
                // "Lead Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),
                // "Molybdenum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11048),

                // Quartz Vein
                // "Barium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11063),
                // "Raw Silicon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),

                // Monazite Vein
                // "Calcium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
                // "Zirconium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 11007),
                // "Aluminium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
                // "Arsenic Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11039),
                // "Beryllium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11008),
                // "Bismuth Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11090),
                // "Caesium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11062),
                // "Carbon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11010),
                // "Cerium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11065),
                // "Chrome Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11030),
                // "Cobalt Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11033),
                // "Copper Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
                // "Dysprosium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11073),
                // "Erbium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11075),
                // "Gadolinium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11071),
                // "Holmium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11074),
                // "Lanthanum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11064),
                // "Lead Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),
                // "Manganese Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11031),
                // "Magnesium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
                // "Neodymium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11067),
                // "Nickel Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
                // "Niobium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11047),
                // "Potassium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11025),
                // "Raw Silicon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
                // "Samarium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11069),
                // "Tantalum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11080),
                // "Tellurium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11059),
                // "Thorium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11096),
                // "Tin Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11057),
                // "Uranium 235 Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11097),
                // "Ytterbium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11077),
                // "Yttrium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11045),
                // "Germanium Ingot"
                getModItem(GTPlusPlus.ID, "itemIngotGermanium", 1L),
                // "Iodine Ingot"
                getModItem(GTPlusPlus.ID, "itemIngotIodine", 1L),
                // "Runite Ingot"
                getModItem(GTPlusPlus.ID, "itemIngotRunite", 1L),
                // "Gold Ingot"
                getModItem(Minecraft.ID, "gold_ingot", 1L),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L),

                // Ilmenite Vein
                // "Aluminium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
                // "Chrome Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11030),
                // "Magnesium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
                // "Raw Silicon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
                // "Titanium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11028),
                // "Wrought Iron Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11304),
                // "Calcium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
                // "Zirconium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 11007),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L),

                // Copper Vein
                // "Cobalt Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11033),
                // "Copper Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
                // "Nickel Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
                // "Tin Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11057),
                // "Calcium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L),
                // "Gold Ingot"
                getModItem(Minecraft.ID, "gold_ingot", 1L),

                // Bauxite Vein
                // "Calcium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
                // "Zirconium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 11007),
                // "Aluminium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
                // "Gallium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11037),
                // "Raw Silicon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
                // "Titanium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11028),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L),

                // Galena Vein
                // "Silver Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11054),
                // "Lead Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),

                // Cassiterite Vein
                // "Tin Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11057),
                // "Zinc Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11036),
                // "Zirconium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 11007),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L),

                // Small Ore Stats
                // Meteoric Iron Ore
                // "Rhodium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 78),
                // "Ruthenium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 64),
                // "Iridium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11084),
                // "Meteoric Iron Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11340),
                // "Nickel Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
                // "Osmium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11083),
                // "Palladium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11052),
                // "Platinum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11085),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L) });
    }
}
