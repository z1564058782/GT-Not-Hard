package Recipes.SingularityRecipes_VoidIngot;

import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.DraconicEvolution;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

public class SingularityIngotRecipes_T2 {

    public static final Map<String, ItemStack[]> VoidIngotRecipes_T2 = new HashMap<>();

    public static void addVoidIngotRecipes_T2() {
        // T2 - Deimos - De
        VoidIngotRecipes_T2.put(
            "De",
            new ItemStack[] {
                // Uranium 238 Vein
                // "Lead Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),
                // "Thorium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11096),
                // "Uranium 235 Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11097),
                // "Uranium 238 Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11098),

                // Tungstate Vein
                // "Calcium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
                // "Lithium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11006),
                // "Manganese Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11031),
                // "Molybdenum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11048),
                // "Silver Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11054),
                // "Tungsten Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11081),

                // Sulfur Vein
                // "Calcium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
                // "Aluminium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
                // "Chrome Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11030),
                // "Gallium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11037),
                // "Raw Silicon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
                // "Zinc Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11036),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L),

                // Lapis Vein
                // "Calcium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
                // "Aluminium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
                // "Carbon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11010),
                // "Copper Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
                // "Raw Silicon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L),

                // Draconium Vein
                // "Aluminium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
                // "Draconium Ingot"
                getModItem(DraconicEvolution.ID, "draconiumIngot", 1L),
                // "Electrum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11303),
                // "Raw Silicon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
                // "Vinteum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11529),

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

                // Nickel Vein
                // "Rhodium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 78),
                // "Ruthenium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 64),
                // "Arsenic Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11039),
                // "Cobalt Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11033),
                // "Iridium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11084),
                // "Nickel Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
                // "Osmium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11083),
                // "Palladium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11052),
                // "Platinum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11085),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L),

                // Tetrahedrite Vein
                // "Antimony Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11058),
                // "Cobalt Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11033),
                // "Copper Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
                // "Nickel Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
                // "Zinc Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11036),
                // "Gold Ingot"
                getModItem(Minecraft.ID, "gold_ingot", 1L),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L),

                // Oriharukon Vein
                // "Oriharukon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11393),

                // Magnetite Vein
                // "Nickel Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
                // "Tin Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11057),
                // "Vanadium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11029),
                // "Gold Ingot"
                getModItem(Minecraft.ID, "gold_ingot", 1L),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L),

                // Small Ore Stats
                // Saltpeter Ore
                // "Potassium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11025),

                // Titanium Ore
                // Tin Ore
                // "Tin Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11057),
                // "Zinc Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11036),
                // "Zirconium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 11007),

                // Lead Ore
                // "Lead Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),
                // "Silver Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11054),

                // Diamond Ore

                // Draconium Ore
                // Chromite Ore
                // Tungstate Ore
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
                getModItem(Minecraft.ID, "iron_ingot", 1L),

                // Desh Ore
                // Nickel Ore
                // "Rhodium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 78),
                // "Ruthenium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 64),
                // "Cobalt Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11033),
                // "Iridium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11084),
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

        // T2 - Mars - Ma
        VoidIngotRecipes_T2.put(
            "Ma",
            new ItemStack[] {
                // Tungstate Vein
                // "Calcium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
                // "Lithium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11006),
                // "Manganese Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11031),
                // "Molybdenum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11048),
                // "Silver Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11054),
                // "Tungsten Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11081),

                // Sulfur Vein
                // "Calcium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
                // "Aluminium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
                // "Chrome Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11030),
                // "Gallium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11037),
                // "Raw Silicon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
                // "Zinc Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11036),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L),

                // Desh Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 884), // Desh Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 910), // Scheelite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 841), // Tungstate Ore

                // Pitchblende Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 873), // Pitchblende
                getModItem(GregTech.ID, "gt.blockores", 1L, 922), // Uraninite Ore

                // Quartz Vein
                // "Barium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11063),
                // "Raw Silicon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),

                // Redstone Vein
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
                // "Magnesium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
                // "Manganese Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11031),
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

                // Nickel Vein
                // "Rhodium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 78),
                // "Ruthenium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 64),
                // "Arsenic Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11039),
                // "Cobalt Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11033),
                // "Iridium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11084),
                // "Nickel Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
                // "Osmium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11083),
                // "Palladium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11052),
                // "Platinum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11085),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L),

                // Arsenic Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 39), // Arsenic Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 90), // Bismuth Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 58), // Antimony Ore

                // Gold Vein
                // "Copper Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
                // "Nickel Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
                // "Vanadium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11029),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L),
                // "Gold Ingot"
                getModItem(Minecraft.ID, "gold_ingot", 1L),

                // Iron Vein
                // "Calcium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
                // "Carbon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11010),
                // "Cobalt Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11033),
                // "Copper Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
                // "Nickel Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L),

                // Beryllium Vein
                // "Aluminium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
                // "Beryllium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11008),
                // "Lead Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),
                // "Raw Silicon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
                // "Thorium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11096),
                // "Uranium 238 Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11098),

                // Tetrahedrite Vein
                // "Antimony Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11058),
                // "Cobalt Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11033),
                // "Copper Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
                // "Nickel Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
                // "Zinc Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11036),
                // "Gold Ingot"
                getModItem(Minecraft.ID, "gold_ingot", 1L),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L),

                // Galena Vein
                // "Silver Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11054),
                // "Lead Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),

                // Salt Vein
                // "Aluminium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
                // "Caesium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11062),
                // "Lithium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11006),
                // "Potassium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11025),

                // Small Ore Stats
                // Saltpeter Ore
                // "Potassium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11025),

                // Iron Ore
                // "Nickel Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
                // "Tin Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11057),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L),

                // Copper Ore
                // "Cobalt Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11033),
                // "Copper Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
                // "Nickel Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
                // "Gold Ingot"
                getModItem(Minecraft.ID, "gold_ingot", 1L),

                // Titanium Ore
                // Oriharukon Ore
                // Tin Ore
                // "Tin Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11057),
                // "Zinc Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11036),
                // "Zirconium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 11007),

                // Lead Ore
                // "Lead Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),
                // "Silver Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11054),

                // Redstone Ore
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

                // Gold Ore
                // "Copper Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
                // "Nickel Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
                // "Gold Ingot"
                getModItem(Minecraft.ID, "gold_ingot", 1L),

                // Chromite Ore
                // Tungstate Ore
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
                getModItem(Minecraft.ID, "iron_ingot", 1L),

                // Bismuth Ore
                // Zinc Ore
                // "Gallium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11037),
                // "Tin Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11057),
                // "Zinc Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11036),

                // Nickel Ore
                // "Rhodium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 78),
                // "Ruthenium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 64),
                // "Cobalt Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11033),
                // "Iridium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11084),
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

        // T2 - Phobos - Ph
        VoidIngotRecipes_T2.put(
            "Ph",
            new ItemStack[] {
                // Uranium 238 Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 922), // Uraninite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 98), // Uranium 238 Ore

                // Sulfur Vein
                // "Calcium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
                // "Aluminium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
                // "Chrome Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11030),
                // "Gallium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11037),
                // "Raw Silicon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
                // "Zinc Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11036),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L),

                // Diamond Vein
                // "Carbon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11010),
                // "Thorium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11096),

                // Molybdenum Vein
                // "Calcium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
                // "Lead Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),
                // "Molybdenum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11048),

                // Pitchblende Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 873), // Pitchblende
                getModItem(GregTech.ID, "gt.blockores", 1L, 922), // Uraninite Ore

                // Quartz Vein
                // "Barium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11063),
                // "Raw Silicon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),

                // Draconium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 975), // Draconium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 812), // Electrotine Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 537), // Jade Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 529), // Vinteum Ore

                // Nickel Vein
                // "Rhodium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 78),
                // "Ruthenium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 64),
                // "Arsenic Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11039),
                // "Cobalt Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11033),
                // "Iridium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11084),
                // "Nickel Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
                // "Osmium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11083),
                // "Palladium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11052),
                // "Platinum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11085),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L),

                // Arsenic Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 39), // Arsenic Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 90), // Bismuth Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 58), // Antimony Ore

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

                // Gold Vein
                // "Copper Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
                // "Nickel Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
                // "Vanadium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11029),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L),
                // "Gold Ingot"
                getModItem(Minecraft.ID, "gold_ingot", 1L),

                // Oriharukon Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 393), // Oriharukon Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 508), // Tanzanite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 951), // Vyroxeres Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 900), // Mirabilite Ore

                // Small Ore Stats
                // Iron Ore
                // "Nickel Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
                // "Tin Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11057),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L),

                // Copper Ore
                // "Cobalt Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11033),
                // "Copper Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
                // "Nickel Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
                // "Gold Ingot"
                getModItem(Minecraft.ID, "gold_ingot", 1L),

                // Titanium Ore
                // Gold Ore
                // "Copper Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
                // "Nickel Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
                // "Gold Ingot"
                getModItem(Minecraft.ID, "gold_ingot", 1L),

                // Draconium Ore
                // Chromite Ore
                // Tungstate Ore
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
                getModItem(Minecraft.ID, "iron_ingot", 1L),

                // Lapis Ore
                // "Calcium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
                // "Aluminium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
                // "Raw Silicon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L),

            // Desh Ore
            });
    }
}
