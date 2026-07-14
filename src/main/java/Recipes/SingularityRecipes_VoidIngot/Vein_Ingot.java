package Recipes.SingularityRecipes_VoidIngot;

import static gregtech.api.enums.Mods.Avaritia;
import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.DraconicEvolution;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.Mods.TinkerConstruct;
import static gregtech.api.util.GTModHandler.getModItem;

import EnumList.EnumItemList.EnumOreProductList.IngotList;
import net.minecraft.item.ItemStack;

public class Vein_Ingot {

    // Apatite Vein
    public static final ItemStack[] Apatite_Vein = new ItemStack[] {
        // "Calcium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
        // "Carbon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11010),
        // "Niobium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11047) };

    // Arsenic Vein
    public static final ItemStack[] Arsenic_Vein = new ItemStack[] {
        // "Antimony Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11058),
        // "Arsenic Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11039),
        // "Bismuth Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11090),
        // "Zinc Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11036),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Arsenopyrite & Ferberite & Loellingite & Roquesite Vein
    public static final ItemStack[] Arsenopyrite_Ferberite_Loellingite_Roquesite_Vein = new ItemStack[] {
        // "Arsenic Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11039),
        // "Copper Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
        // "Indium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11056),
        // "Tungsten Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11081),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Awakened Draconium Vein
    public static final ItemStack[] Awakened_Draconium_Vein = new ItemStack[] {
        // "Draconium Ingot"
        getModItem(DraconicEvolution.ID, "draconiumIngot", 1L),
        // "Awakened Draconium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11976) };

    // BArTiMaEuSNeK Vein
    public static final ItemStack[] BArTiMaEuSNeK_Vein = new ItemStack[] {
        // "BArTiMaEuSNeK Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 43),
        // "Europium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11070),
        // "Titanium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11028) };

    // Basaltic Mineral Sand Vein
    public static final ItemStack[] Basaltic_Mineral_Sand_Vein = new ItemStack[] {
        // "Calcium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Carbon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11010),
        // "Magnesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
        // "Potassium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11025),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Gold Ingot"
        getModItem(Minecraft.ID, "gold_ingot", 1L),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Bauxite Vein
    public static final ItemStack[] Bauxite_Vein = new ItemStack[] {
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
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Beryllium Vein
    public static final ItemStack[] Beryllium_Vein = new ItemStack[] {
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
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11098) };

    // Bismutite & Bismuthinite Vein
    public static final ItemStack[] Bismutite_Bismuthinite_Vein = new ItemStack[] {
        // "Antimony Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11058),
        // "Bismuth Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11090) };

    // Black Plutonium Vein
    public static final ItemStack[] Black_Plutonium_Vein = new ItemStack[] {
        // "Calcium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Black Plutonium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11388),
        // "Chrome Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11030),
        // "Magnesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
        // "Manganese Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11031),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Callisto Ice Vein
    public static final ItemStack[] Callisto_Ice_Vein = new ItemStack[] {
        // "Alduorite Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11485),
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Callisto Ice Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11389),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020) };

    // Cassiterite Vein
    public static final ItemStack[] Cassiterite_Vein = new ItemStack[] {
        // "Zirconium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 11007),
        // "Tin Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11057),
        // "Zinc Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11036),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Certus Quartz Vein
    public static final ItemStack[] Certus_Quartz_Vein = new ItemStack[] {
        // "Barium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11063),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020) };

    // Chrome Vein
    public static final ItemStack[] Chrome_Vein = new ItemStack[] {
        // "Chrome Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11030),
        // "Lithium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11006),
        // "Magnesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
        // "Manganese Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11031),
        // "Molybdenum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11048),
        // "Silver Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11054),
        // "Tungsten Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11081),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Coal Vein
    public static final ItemStack[] Coal_Vein = new ItemStack[] {
        // "Carbon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11010) };

    // Copper Vein
    public static final ItemStack[] Copper_Vein = new ItemStack[] {
        // "Calcium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
        // "Cobalt Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11033),
        // "Copper Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
        // "Nickel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
        // "Tin Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11057),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L),
        // "Gold Ingot"
        getModItem(Minecraft.ID, "gold_ingot", 1L) };

    // Cosmic Neutronium Vein
    public static final ItemStack[] Cosmic_Neutronium_Vein = new ItemStack[] {
        // "Cosmic Neutronium Ingot"
        getModItem(Avaritia.ID, "Resource", 1L, 4),
        // "Bedrockium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11395),
        // "Black Plutonium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11388),
        // "Neutronium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11129) };

    // Cryolite Vein
    public static final ItemStack[] Cryolite_Vein = new ItemStack[] {
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Lead Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),
        // "Silver Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11054) };

    // Desh Vein
    public static final ItemStack[] Desh_Vein = new ItemStack[] {
        // "Calcium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
        // "Desh Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11884),
        // "Lithium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11006),
        // "Manganese Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11031),
        // "Molybdenum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11048),
        // "Silver Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11054),
        // "Tungsten Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11081) };

    // Diamond Vein
    public static final ItemStack[] Diamond_Vein = new ItemStack[] {
        // "Carbon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11010),
        // "Thorium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11096) };

    // Dilithium Vein
    public static final ItemStack[] Dilithium_Vein = new ItemStack[] {
        // "Mysterious Crystal Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11398),
        // "Vinteum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11529) };

    // Djurleite & Bornite & Wittichenite Vein
    public static final ItemStack[] Djurleite_Bornite_Wittichenite_Vein = new ItemStack[] {
        // "Antimony Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11058),
        // "Bismuth Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11090),
        // "Copper Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Dolomite Vein
    public static final ItemStack[] Dolomite_Vein = new ItemStack[] {
        // "Calcium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Carbon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11010),
        // "Chrome Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11030),
        // "Magnesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Draconium Vein
    public static final ItemStack[] Draconium_Vein = new ItemStack[] {
        // "Draconium Ingot"
        getModItem(DraconicEvolution.ID, "draconiumIngot", 1L),
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Electrum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11303),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Vinteum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11529) };

    // Electrotine Vein
    public static final ItemStack[] Electrotine_Vein = new ItemStack[] {
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Electrum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11303),
        // "Potassium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11025),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Silver Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11054),
        // "Gold Ingot"
        getModItem(Minecraft.ID, "gold_ingot", 1L),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Fayalite & Green Fuchsite & Red Zircon & Red Fuchsite Vein
    public static final ItemStack[] Fayalite_GreenFuchsite_RedZircon_RedFuchsite_Vein = new ItemStack[] {
        // "Zirconium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 11007),
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Chrome Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11030),
        // "Potassium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11025),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Ferberite & Huebnerite & Loellingite Vein
    public static final ItemStack[] Ferberite_Huebnerite_Loellingite_Vein = new ItemStack[] {
        // "Calcium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
        // "Arsenic Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11039),
        // "Manganese Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11031),
        // "Molybdenum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11048),
        // "Tungsten Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11081),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Fluorspar Vein
    public static final ItemStack[] Fluorspar_Vein = new ItemStack[] {
        // "Calcium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Chrome Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11030),
        // "Gallium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11037),
        // "Lead Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Silver Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11054),
        // "Zinc Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11036),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Forsterite & Fayalite & Orange Descloizite & Red Descloizite Vein
    public static final ItemStack[] Forsterite_Fayalite_OrangeDescloizite_RedDescloizite_Vein = new ItemStack[] {
        // "Copper Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
        // "Lead Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),
        // "Magnesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Vanadium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11029),
        // "Zinc Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11036),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Galena Vein
    public static final ItemStack[] Galena_Vein = new ItemStack[] {
        // "Lead Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),
        // "Silver Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11054) };

    // Gold Vein
    public static final ItemStack[] Gold_Vein = new ItemStack[] {
        // "Copper Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
        // "Nickel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
        // "Vanadium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11029),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L),
        // "Gold Ingot"
        getModItem(Minecraft.ID, "gold_ingot", 1L) };

    // Hedenbergite & Fayalite & Orange Descloizite & Red Descloizite Vein
    public static final ItemStack[] Hedenbergite_Fayalite_OrangeDescloizite_RedDescloizite_Vein = new ItemStack[] {
        // "Calcium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
        // "Copper Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
        // "Lead Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Vanadium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11029),
        // "Zinc Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11036),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Ilmenite Vein
    public static final ItemStack[] Ilmenite_Vein = new ItemStack[] {
        // "Calcium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
        // "Zirconium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 11007),
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
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Infinity Catalyst Vein
    public static final ItemStack[] Infinity_Catalyst_Vein = new ItemStack[] {
        // "Adamantium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11319),
        // "Bedrockium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11395),
        // "Infinity Catalyst Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11394),
        // "Neutronium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11129) };

    // Infused Gold Vein
    public static final ItemStack[] Infused_Gold_Vein = new ItemStack[] {
        // "Rhodium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 78),
        // "Ruthenium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 64),
        // "Copper Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
        // "Infused Gold Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11323),
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
        // "Gold Ingot"
        getModItem(Minecraft.ID, "gold_ingot", 1L) };

    // Iridium Vein
    public static final ItemStack[] Iridium_Vein = new ItemStack[] {
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
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Iron Vein
    public static final ItemStack[] Iron_Vein = new ItemStack[] {
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
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Kaolinite Vein
    public static final ItemStack[] Kaolinite_Vein = new ItemStack[] {
        // "Calcium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Magnesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
        // "Potassium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11025),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Lapis Vein
    public static final ItemStack[] Lapis_Vein = new ItemStack[] {
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
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Ledox Vein
    public static final ItemStack[] Ledox_Vein = new ItemStack[] {
        // "Calcium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Ledox Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11390),
        // "Orichalcum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11966),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Rubracium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11488),
        // "Samarium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11069),
        // "Thorium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11096) };

    // Lignite Coal Vein
    public static final ItemStack[] Lignite_Coal_Vein = new ItemStack[] {
        // "Carbon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11010),
        // "Thorium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11096) };

    // Magnesite Vein
    public static final ItemStack[] Magnesite_Vein = new ItemStack[] {
        // "Calcium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Magnesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Magnetite Vein
    public static final ItemStack[] Magnetite_Vein = new ItemStack[] {
        // "Nickel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
        // "Tin Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11057),
        // "Vanadium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11029),
        // "Gold Ingot"
        getModItem(Minecraft.ID, "gold_ingot", 1L),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Manganese Vein
    public static final ItemStack[] Manganese_Vein = new ItemStack[] {
        // "Calcium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Chrome Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11030),
        // "Manganese Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11031),
        // "Magnesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
        // "Niobium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11047),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Tantalum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11080),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Mica Vein
    public static final ItemStack[] Mica_Vein = new ItemStack[] {
        // "Zirconium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 11007),
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Caesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11062),
        // "Potassium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11025),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Rubidium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11043),
        // "Tin Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11057) };

    // Molybdenum Vein
    public static final ItemStack[] Molybdenum_Vein = new ItemStack[] {
        // "Calcium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
        // "Lead Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),
        // "Molybdenum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11048) };

    // Monazite Vein
    public static final ItemStack[] Monazite_Vein = new ItemStack[] {
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
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Mytryl Vein
    public static final ItemStack[] Mytryl_Vein = new ItemStack[] {
        // "Cerium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11065),
        // "Ceruclase Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11952),
        // "Gadolinium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11071),
        // "Holmium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11074),
        // "Lanthanum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11064),
        // "Mytryl Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11387),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Samarium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11069),
        // "Vulcanite Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11489),
        // "Zinc Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11036) };

    // Naquadah Vein
    public static final ItemStack[] Naquadah_Vein = new ItemStack[] {
        // "Adamantium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11319),
        // "Americium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11103),
        // "Barium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11063),
        // "Enriched Naquadah Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11326),
        // "Indium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11056),
        // "Gallium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11037),
        // "Naquadah Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11324),
        // "Naquadria Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11327),
        // "Nickel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
        // "Titanium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11028),
        // "Trinium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11868) };

    // Naquadria Vein
    public static final ItemStack[] Naquadria_Vein = new ItemStack[] {
        // "Adamantium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11319),
        // "Americium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11103),
        // "Barium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11063),
        // "Enriched Naquadah Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11326),
        // "Indium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11056),
        // "Gallium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11037),
        // "Naquadah Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11324),
        // "Naquadria Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11327),
        // "Nickel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
        // "Titanium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11028),
        // "Trinium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11868) };

    // Nether Quartz Vein
    public static final ItemStack[] Nether_Quartz_Vein = new ItemStack[] {
        // "Barium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11063),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Gold Ingot"
        getModItem(Minecraft.ID, "gold_ingot", 1L) };

    // Nether Star Vein
    public static final ItemStack[] Nether_Star_Vein = new ItemStack[] {
        // "Calcium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Chrome Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11030),
        // "Magnesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
        // "Manganese Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11031),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Neutronium Vein
    public static final ItemStack[] Neutronium_Vein = new ItemStack[] {
        // "Adamantium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11319),
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Enriched Naquadah Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11326),
        // "Naquadah Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11324),
        // "Neutronium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11129),
        // "Nickel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Titanium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11028),
        // "Trinium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11868),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Nickel Vein
    public static final ItemStack[] Nickel_Vein = new ItemStack[] {
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
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Niobium Vein
    public static final ItemStack[] Niobium_Vein = new ItemStack[] {
        // "Gallium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11037),
        // "Niobium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11047),
        // "Yttrium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11045) };

    // Olenite & Fluor-Buergerite & Chromo-Alumino-Povondraite & Vanadio-Oxy-Dravit Vein
    public static final ItemStack[] Olenite_FluorBuergerite_ChromoAluminoPovondraite_VanadioOxyDravit_Vein = new ItemStack[] {
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Chrome Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11030),
        // "Magnalium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11313),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Vanadium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11029),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Olivine Vein
    public static final ItemStack[] Olivine_Vein = new ItemStack[] {
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Carbon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11010),
        // "Magnesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
        // "Potassium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11025),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Oriharukon Vein
    public static final ItemStack[] Oriharukon_Vein = new ItemStack[] {
        // "Calcium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Oriharukon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11393),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Vyroxeres Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11951) };

    // Osmium Vein
    public static final ItemStack[] Osmium_Vein = new ItemStack[] {
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
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Palladium Vein
    public static final ItemStack[] Palladium_Vein = new ItemStack[] {
        // "Rhodium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 78),
        // "Ruthenium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 64),
        // "Chrome Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11030),
        // "Iridium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11084),
        // "Magnesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
        // "Nickel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
        // "Osmium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11083),
        // "Palladium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11052),
        // "Platinum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11085),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Pitchblende Vein
    public static final ItemStack[] Pitchblende_Vein = new ItemStack[] {
        // "Lead Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),
        // "Thorium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11096),
        // "Uranium 235 Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11097),
        // "Uranium 238 Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11098) };

    // Platinum Vein
    public static final ItemStack[] Platinum_Vein = new ItemStack[] {
        // "Rhodium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 78),
        // "Ruthenium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 64),
        // "Iridium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11084),
        // "Nickel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
        // "Osmium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11083),
        // "Palladium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11052),
        // "Platinum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11085) };

    // Plutonium 239 Vein
    public static final ItemStack[] Plutonium239_Vein = new ItemStack[] {
        // "Lead Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),
        // "Plutonium 239 Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11100),
        // "Thorium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11096),
        // "Uranium 235 Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11097),
        // "Uranium 238 Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11098) };

    // Prasiolite & Hedenbergite Vein
    public static final ItemStack[] Prasiolite_Hedenbergite_Vein = new ItemStack[] {
        // "Calcium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Magnesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Pyrolusite Vein
    public static final ItemStack[] Pyrolusite_Vein = new ItemStack[] {
        // "Calcium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
        // "Manganese Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11031),
        // "Niobium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11047),
        // "Tantalum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11080) };

    // Quantium Vein
    public static final ItemStack[] Quantium_Vein = new ItemStack[] {
        // "Quantium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11391),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Titanium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11028),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L),
        // "Ardite Ingot"
        getModItem(TinkerConstruct.ID, "materials", 1L, 4) };

    // Quartz Vein
    public static final ItemStack[] Quartz_Vein = new ItemStack[] {
        // "Barium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11063),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020) };

    // Quartzite Vein
    public static final ItemStack[] Quartzite_Vein = new ItemStack[] {
        // "Barium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11063),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020) };

    // Rare Earth Vein
    public static final ItemStack[] Rare_Earth_Vein = new ItemStack[] {
        // "Caesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11062),
        // "Cerium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11065),
        // "Gadolinium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11071),
        // "Holmium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11074),
        // "Lanthanum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11064),
        // "Samarium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11069), };

    // Raw Tengam Vein
    public static final ItemStack[] Raw_Tengam_Vein = new ItemStack[] {
        // "Electrum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11303),
        // "Gadolinium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11071),
        // "Magnetic Neodymium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11356),
        // "Magnetic Samarium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11399),
        // "Purified Tengam Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11111),
        // "Samarium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11069) };

    // Red Garnet Vein
    public static final ItemStack[] Red_Garnet_Vein = new ItemStack[] {
        // "Calcium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Arsenic Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11039),
        // "Chrome Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11030),
        // "Magnesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
        // "Manganese Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11031),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Realgar Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11913),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Redstone Vein
    public static final ItemStack[] Redstone_Vein = new ItemStack[] {
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
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Rutile Vein
    public static final ItemStack[] Rutile_Vein = new ItemStack[] {
        // "Calcium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
        // "Rhodium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 78),
        // "Ruthenium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 64),
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Gallium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11037),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
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
        // "Titanium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11028),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Salt Vein
    public static final ItemStack[] Salt_Vein = new ItemStack[] {
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Caesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11062),
        // "Lithium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11006),
        // "Potassium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11025) };

    // Samarium Vein
    public static final ItemStack[] Samarium_Vein = new ItemStack[] {
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
        // "Tartarite Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11956),
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
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Sapphire Vein
    public static final ItemStack[] Sapphire_Vein = new ItemStack[] {
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Magnesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
        // "Manganese Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11031),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Soapstone Vein
    public static final ItemStack[] Soapstone_Vein = new ItemStack[] {
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Cobalt Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11033),
        // "Magnesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
        // "Nickel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
        // "Potassium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11025),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Sulfur Vein
    public static final ItemStack[] Sulfur_Vein = new ItemStack[] {
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
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Tetrahedrite Vein
    public static final ItemStack[] Tetrahedrite_Vein = new ItemStack[] {
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
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Thorianite Vein
    public static final ItemStack[] Thorianite_Vein = new ItemStack[] {
        // "Thorium 232 Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 30),
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Caesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11062),
        // "Lithium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11006),
        // "Potassium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11025),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Thorium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11096),
        // "Uranium 235 Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11097),
        // "Uranium 238 Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11098) };

    // Thorium Vein
    public static final ItemStack[] Thorium_Vein = new ItemStack[] {
        // "Lead Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),
        // "Plutonium 241 Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11101),
        // "Thorium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11096),
        // "Uranium 235 Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11097),
        // "Uranium 238 Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11098) };

    // Tiberium Vein
    public static final ItemStack[] Tiberium_Vein = new ItemStack[] {
        // "Adamantium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11319),
        // "Americium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11103),
        // "Barium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11063),
        // "Enriched Naquadah Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11326),
        // "Indium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11056),
        // "Gallium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11037),
        // "Naquadah Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11324),
        // "Naquadria Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11327),
        // "Nickel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
        // "Titanium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11028),
        // "Trinium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11868) };

    // Tin Vein
    public static final ItemStack[] Tin_Vein = new ItemStack[] {
        // "Calcium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Chrome Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11030),
        // "Magnesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
        // "Manganese Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11031),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Tin Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11057),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Tungstate Vein
    public static final ItemStack[] Tungstate_Vein = new ItemStack[] {
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
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11081) };

    // Tungsten Vein
    public static final ItemStack[] Tungsten_Vein = new ItemStack[] {
        // "Deep Iron Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11829),
        // "Manganese Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11031),
        // "Molybdenum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11048),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Shadow Iron Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11336),
        // "Trinium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11868),
        // "Tungsten Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11081),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Uranium 238 Vein
    public static final ItemStack[] Uranium238_Vein = new ItemStack[] {
        // "Lead Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),
        // "Thorium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11096),
        // "Uranium 235 Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11097),
        // "Uranium 238 Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11098) };

    // Vanadium Vein
    public static final ItemStack[] Vanadium_Vein = new ItemStack[] {
        // "Chrome Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11030),
        // "Copper Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
        // "Magnesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
        // "Nickel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
        // "Vanadium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11029),
        // "Gold Ingot"
        getModItem(Minecraft.ID, "gold_ingot", 1L),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    // Vermiculite Vein
    public static final ItemStack[] Vermiculite_Vein = new ItemStack[] {
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Cobalt Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11033),
        // "Copper Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
        // "Magnesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
        // "Potassium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11025),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Tin Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11057),
        // "Zirconium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 11007),
        // "Gold Ingot"
        getModItem(Minecraft.ID, "gold_ingot", 1L),
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L) };

    public static final ItemStack[] T10_Ingot = new ItemStack[] {
        IngotList.Iron_Ingot,
        IngotList.Gold_Ingot,
        IngotList.Brick,
        IngotList.Nether_Brick,
        IngotList.Crystal_Matrix_Ingot,
        IngotList.Cosmic_Neutronium_Ingot,
        IngotList.Infinity_Ingot,
        IngotList.Manasteel_Ingot,
        IngotList.Terrasteel_Ingot,
        IngotList.Elementium_Ingot,
        IngotList.Gaia_Spirit_Ingot,
        IngotList.Electrical_Steel,
        IngotList.Energetic_Alloy,
        IngotList.Vibrant_Alloy,
        IngotList.Redstone_Alloy,
        IngotList.Conductive_Iron,
        IngotList.Pulsating_Iron,
        IngotList.Dark_Steel,
        IngotList.Soularium,
        IngotList.End_Steel,
        IngotList.Clay_Compound,
        IngotList.Crystalline_Alloy,
        IngotList.Melodic_Alloy,
        IngotList.Stellar_Alloy,
        IngotList.Crystalline_Pink_Slime,
        IngotList.Energetic_Silver,
        IngotList.Vivid_Alloy,
        IngotList.Unstable_Ingot,
        IngotList.Mobius_,
        IngotList.Endium_Ingot,
        IngotList.Electrotine_Alloy_Ingot,
        IngotList.Seared_Brick,
        IngotList.Aluminum_Brass_Ingot,
        IngotList.Pig_Iron_Ingot_TC,
        IngotList.Shadowmetal_Ingot,
        IngotList.Thaumium_Ingot,
        IngotList.Void_Metal_Ingot,
        IngotList.Ichorium,
        IngotList.Ironwood_Ingot,
        IngotList.Fiery_Ingot,
        IngotList.Knightmetal_Ingot,
        IngotList.Zirconium_Ingot,
        IngotList.Thorium_232_Ingot,
        IngotList.Californium_Ingot,
        IngotList.Calcium_Ingot,
        IngotList.BArTiMaEuSNeK_Ingot,
        IngotList.Ruthenium_Ingot,
        IngotList.Rhodium_Ingot,
        IngotList.Rhodium_Plated_Palladium_Ingot,
        IngotList.Ruridit_Ingot,
        IngotList.High_Durability_Compound_Steel_Ingot,
        IngotList.Ademic_Steel_Ingot,
        IngotList.Fluorophlogopite_Ingot,
        IngotList.Tantalum_Hafnium_Carbide_Ingot,
        IngotList.Magnesia_Ingot,
        IngotList.Atomic_Separation_Catalyst_Ingot,
        IngotList.Extremely_Unstable_Naquadah_Ingot,
        IngotList.Zn_Th_Alloy_Ingot,
        IngotList.Zircaloy_4_Ingot,
        IngotList.Zircaloy_2_Ingot,
        IngotList.Incoloy_903_Ingot,
        IngotList.Adamantium_Alloy_Ingot,
        IngotList.MAR_M200_Steel_Ingot,
        IngotList.MAR_Ce_M200_Steel_Ingot,
        IngotList.Lithium_Chloride_Ingot,
        IngotList.Signalium_Ingot,
        IngotList.Lumiium_Ingot,
        IngotList.Artherium_Sn_Ingot,
        IngotList.Tanmolyium_Beta_C_Ingot,
        IngotList.Dalisenite_Ingot,
        IngotList.Hikarium_Ingot,
        IngotList.Tairitsu_Ingot,
        IngotList.Precious_Metals_Alloy_Ingot,
        IngotList.Enriched_Naquadah_Alloy_Ingot,
        IngotList.Metastable_Oganesson_Ingot,
        IngotList.Shirabon_Ingot,
        IngotList.Hafnium_Ingot,
        IngotList.Permalloy_Ingot,
        IngotList.Mu_metal_Ingot,
        IngotList.Silicon_Nitride_Ingot,
        IngotList.Coke_Oven_Brick,
        IngotList.Quartz_Ingot,
        IngotList.Lithium_Ingot,
        IngotList.Beryllium_Ingot,
        IngotList.Carbon_Ingot,
        IngotList.Magnesium_Ingot,
        IngotList.Aluminium_Ingot,
        IngotList.Raw_Silicon_Ingot,
        IngotList.Potassium_Ingot,
        IngotList.Scandium_Ingot,
        IngotList.Titanium_Ingot,
        IngotList.Vanadium_Ingot,
        IngotList.Chrome_Ingot,
        IngotList.Manganese_Ingot,
        IngotList.Cobalt_Ingot,
        IngotList.Nickel_Ingot,
        IngotList.Copper_Ingot,
        IngotList.Zinc_Ingot,
        IngotList.Gallium_Ingot,
        IngotList.Arsenic_Ingot,
        IngotList.Rubidium_Ingot,
        IngotList.Strontium_Ingot,
        IngotList.Yttrium_Ingot,
        IngotList.Niobium_Ingot,
        IngotList.Molybdenum_Ingot,
        IngotList.Palladium_Ingot,
        IngotList.Silver_Ingot,
        IngotList.Indium_Ingot,
        IngotList.Tin_Ingot,
        IngotList.Antimony_Ingot,
        IngotList.Tellurium_Ingot,
        IngotList.Caesium_Ingot,
        IngotList.Barium_Ingot,
        IngotList.Lanthanum_Ingot,
        IngotList.Cerium_Ingot,
        IngotList.Praseodymium_Ingot,
        IngotList.Neodymium_Ingot,
        IngotList.Promethium_Ingot,
        IngotList.Samarium_Ingot,
        IngotList.Europium_Ingot,
        IngotList.Gadolinium_Ingot,
        IngotList.Terbium_Ingot,
        IngotList.Dysprosium_Ingot,
        IngotList.Holmium_Ingot,
        IngotList.Erbium_Ingot,
        IngotList.Thulium_Ingot,
        IngotList.Ytterbium_Ingot,
        IngotList.Lutetium_Ingot,
        IngotList.Tantalum_Ingot,
        IngotList.Tungsten_Ingot,
        IngotList.Osmium_Ingot,
        IngotList.Iridium_Ingot,
        IngotList.Platinum_Ingot,
        IngotList.Lead_Ingot,
        IngotList.Bismuth_Ingot,
        IngotList.Thorium_Ingot,
        IngotList.Uranium_235_Ingot,
        IngotList.Uranium_238_Ingot,
        IngotList.Plutonium_239_Ingot,
        IngotList.Plutonium_241_Ingot,
        IngotList.Americium_Ingot,
        IngotList.Purified_Tengam_Ingot,
        IngotList.Attuned_Tengam_Ingot,
        IngotList.Hellish_Metal_Ingot,
        IngotList.Neutronium_Ingot,
        IngotList.Superconductor_Base_UIV_Ingot,
        IngotList.Netherite_Ingot,
        IngotList.Superconductor_Base_UMV_Ingot,
        IngotList.Universium_Ingot,
        IngotList.Eternity_Ingot,
        IngotList.Magmatter_Ingot,
        IngotList.Six_Phased_Copper_Ingot,
        IngotList.Mellion_Ingot,
        IngotList.Creon_Ingot,
        IngotList.Proto_Halkonite_Steel_Ingot,
        IngotList.Exo_Halkonite_Steel_Ingot,
        IngotList.Prismatic_Naquadah_Ingot,
        IngotList.Hexanite_Ingot,
        IngotList.Shijima_Ingot,
        IngotList.Churitsu_Ingot,
        IngotList.Bronze_Ingot,
        IngotList.Brass_Ingot,
        IngotList.Invar_Ingot,
        IngotList.Electrum_Ingot,
        IngotList.Cast_Iron_Ingot,
        IngotList.Steel_Ingot,
        IngotList.Stainless_Steel_Ingot,
        IngotList.Pig_Iron_Ingot_GT,
        IngotList.Red_Alloy_Ingot,
        IngotList.Blue_Alloy_Ingot,
        IngotList.Cupronickel_Ingot,
        IngotList.Nichrome_Ingot,
        IngotList.Kanthal_Ingot,
        IngotList.Magnalium_Ingot,
        IngotList.Soldering_Alloy_Ingot,
        IngotList.Battery_Alloy_Ingot,
        IngotList.Tungstensteel_Ingot,
        IngotList.Osmiridium_Ingot,
        IngotList.Sunnarium_Ingot,
        IngotList.Adamantium_Ingot,
        IngotList.Fluxed_Electrum_Ingot,
        IngotList.Enderium_Ingot,
        IngotList.Infused_Gold_Ingot,
        IngotList.Naquadah_Ingot,
        IngotList.Naquadah_Alloy_Ingot,
        IngotList.Enriched_Naquadah_Ingot,
        IngotList.Naquadria_Ingot,
        IngotList.Duranium_Ingot,
        IngotList.Tritanium_Ingot,
        IngotList.Mithril_Ingot,
        IngotList.Astral_Silver_Ingot,
        IngotList.Black_Steel_Ingot,
        IngotList.Damascus_Steel_Ingot,
        IngotList.Shadow_Iron_Ingot,
        IngotList.Shadow_Steel_Ingot,
        IngotList.Meteoric_Iron_Ingot,
        IngotList.Meteoric_Steel_Ingot,
        IngotList.Deep_Dark_Iron_Ingot,
        IngotList.Cobalt_Brass_Ingot,
        IngotList.Ultimet_Ingot,
        IngotList.Annealed_Copper_Ingot,
        IngotList.Fiery_Steel_Ingot,
        IngotList.Red_Steel_Ingot,
        IngotList.Blue_Steel_Ingot,
        IngotList.Sterling_Silver_Ingot,
        IngotList.Rose_Gold_Ingot,
        IngotList.Black_Bronze_Ingot,
        IngotList.Bismuth_Bronze_Ingot,
        IngotList.Magnetic_Iron_Ingot,
        IngotList.Magnetic_Steel_Ingot,
        IngotList.Magnetic_Neodymium_Ingot,
        IngotList.Vanadium_Gallium_Ingot,
        IngotList.Yttrium_Barium_Cuprate_Ingot,
        IngotList.Niobium_Nitride_Ingot,
        IngotList.Niobium_Titanium_Ingot,
        IngotList.Chromium_Dioxide_Ingot,
        IngotList.Tin_Alloy_Ingot,
        IngotList.Dark_Steel_Ingot,
        IngotList.Electrical_Steel_Ingot,
        IngotList.Energetic_Alloy_Ingot,
        IngotList.Vibrant_Alloy_Ingot,
        IngotList.Shadow_Metal_Ingot,
        IngotList.Conductive_Iron_Ingot,
        IngotList.Tungstencarbide_Ingot,
        IngotList.Vanadiumsteel_Ingot,
        IngotList.HSSG_Ingot,
        IngotList.HSSE_Ingot,
        IngotList.HSSS_Ingot,
        IngotList.Pulsating_Iron_Ingot,
        IngotList.Soularium_Ingot,
        IngotList.Enderium_Base_Ingot,
        IngotList.Redstone_Alloy_Ingot,
        IngotList.Ardite_Ingot,
        IngotList.Reinforced_Ingot,
        IngotList.Galgadorian_Ingot,
        IngotList.Enhanced_Galgadorian_Ingot,
        IngotList.Manyullyn_Ingot,
        IngotList.Mytryl_Ingot,
        IngotList.Black_Plutonium_Ingot,
        IngotList.Callisto_Ice_Ingot,
        IngotList.Ledox_Ingot,
        IngotList.Quantium_Ingot,
        IngotList.Duralumin_Ingot,
        IngotList.Oriharukon_Ingot,
        IngotList.Infinity_Catalyst_Ingot,
        IngotList.Bedrockium_Ingot,
        IngotList.Mysterious_Crystal_Ingot,
        IngotList.Magnetic_Samarium_Ingot,
        IngotList.Obzinite_Ingot,
        IngotList.End_Steel_Ingot,
        IngotList.Clay_Compound_Ingot,
        IngotList.Crystalline_Alloy_Ingot,
        IngotList.Melodic_Alloy_Ingot,
        IngotList.Stellar_Alloy_Ingot,
        IngotList.Crystalline_Pink_Slime_Ingot,
        IngotList.Energetic_Silver_Ingot,
        IngotList.Vivid_Alloy_Ingot,
        IngotList.Epoxid_Bar,
        IngotList.Silicone_Rubber_Bar,
        IngotList.Polycaprolactam_PCL_Bar,
        IngotList.Polytetrafluoroethylene_PTFE_Bar,
        IngotList.Alduorite_Ingot,
        IngotList.Rubracium_Ingot,
        IngotList.Vulcanite_Ingot,
        IngotList.Force_Ingot,
        IngotList.Vinteum_Ingot,
        IngotList.TPV_Alloy_Ingot,
        IngotList.Transcendent_Metal_Ingot,
        IngotList.Enriched_Holmium_Ingot,
        IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot,
        IngotList.White_Dwarf_Matter_Ingot,
        IngotList.Black_Dwarf_Matter_Ingot,
        IngotList.SpaceTime_Ingot,
        IngotList.Polybenzimidazole_PBI_Bar,
        IngotList.Fiber_Reinforced_Epoxy_Resin_Bar,
        IngotList.Borosilicate_Glass_Bar,
        IngotList.Nickel_Zinc_Ferrite_Ingot,
        IngotList.Polyphenylene_Sulfide_PPS_Bar,
        IngotList.Styrene_Butadiene_Rubber_SBR_Bar,
        IngotList.Polystyrene_PS_Bar,
        IngotList.Polyvinyl_Chloride_PVC_Bar,
        IngotList.Kevlar_Ingot,
        IngotList.Nickel_Aluminide_Ingot,
        IngotList.Obsidian_Ingot,
        IngotList.Deep_Iron_Ingot,
        IngotList.Silicon_Solar_Grade_Poly_SI_Ingot,
        IngotList.Trinium_Ingot,
        IngotList.Polyethylene_PE_Bar,
        IngotList.Desh_Ingot,
        IngotList.Chrysotile_Ingot,
        IngotList.Realgar_Ingot,
        IngotList.Vyroxeres_Ingot,
        IngotList.Ceruclase_Ingot,
        IngotList.Tartarite_Ingot,
        IngotList.Orichalcum_Ingot,
        IngotList.Superconductor_Base_UEV_Ingot,
        IngotList.Draconium_Ingot,
        IngotList.Awakened_Draconium_Ingot,
        IngotList.Blood_Infused_Iron_Ingot,
        IngotList.Ichorium_Ingot,
        IngotList.Radox_Polymer_Bar,
        IngotList.Gallium_Arsenide_Ingot,
        IngotList.Indium_Gallium_Phosphide_Ingot,
        IngotList.Flerovium_Ingot,
        IngotList.Superconductor_Base_UHV_Ingot,
        IngotList.Superconductor_Base_UV_Ingot,
        IngotList.Superconductor_Base_MV_Ingot,
        IngotList.Superconductor_Base_HV_Ingot,
        IngotList.Superconductor_Base_EV_Ingot,
        IngotList.Superconductor_Base_IV_Ingot,
        IngotList.Superconductor_Base_LuV_Ingot,
        IngotList.Superconductor_Base_ZPM_Ingot,
        IngotList.Firebrick,
        IngotList.Selenium_Ingot,
        IngotList.Iodine_Ingot,
        IngotList.Rhenium_Ingot,
        IngotList.Thallium_Ingot,
        IngotList.Germanium_Ingot,
        IngotList.Technetium_Ingot,
        IngotList.Polonium_Ingot,
        IngotList.Radium_Ingot,
        IngotList.Protactinium_Ingot,
        IngotList.Curium_Ingot,
        IngotList.Neptunium_Ingot,
        IngotList.Fermium_Ingot,
        IngotList.Lithium_7_Ingot,
        IngotList.Uranium_232_Ingot,
        IngotList.Uranium_233_Ingot,
        IngotList.Plutonium_238_Ingot,
        IngotList.Advanced_Nitinol_Ingot,
        IngotList.Astral_Titanium_Ingot,
        IngotList.Celestial_Tungsten_Ingot,
        IngotList.Hypogen_Ingot,
        IngotList.Chromatic_Glass_Ingot,
        IngotList.Black_Metal_Ingot,
        IngotList.Ancient_Granite_Ingot,
        IngotList.Runite_Ingot,
        IngotList.Dragonblood_Ingot,
        IngotList.Silicon_Carbide_Ingot,
        IngotList.Zirconium_Carbide_Ingot,
        IngotList.Tantalum_Carbide_Ingot,
        IngotList.Niobium_Carbide_Ingot,
        IngotList.Tungsten_Titanium_Carbide_Ingot,
        IngotList.Energy_Crystal_Ingot,
        IngotList.Blood_Steel_Ingot,
        IngotList.Zeron_100_Ingot,
        IngotList.Tumbaga_Ingot,
        IngotList.Potin_Ingot,
        IngotList.Staballoy_Ingot,
        IngotList.Tantalloy_60_Ingot,
        IngotList.Tantalloy_61_Ingot,
        IngotList.Inconel_625_Ingot,
        IngotList.Inconel_690_Ingot,
        IngotList.Inconel_792_Ingot,
        IngotList.Eglin_Steel_Ingot,
        IngotList.Maraging_Steel_250_Ingot,
        IngotList.Maraging_Steel_300_Ingot,
        IngotList.Maraging_Steel_350_Ingot,
        IngotList.Watertight_Steel_Ingot,
        IngotList.Nitinol_60_Ingot,
        IngotList.Stellite_Ingot,
        IngotList.Talonite_Ingot,
        IngotList.Hastelloy_W_Ingot,
        IngotList.Hastelloy_X_Ingot,
        IngotList.Hastelloy_C276_Ingot,
        IngotList.Hastelloy_N_Ingot,
        IngotList.Incoloy_020_Ingot,
        IngotList.Incoloy_DS_Ingot,
        IngotList.Incoloy_MA956_Ingot,
        IngotList.Grisium_Ingot,
        IngotList.HG_1223_Ingot,
        IngotList.Trinium_Titanium_Alloy_Ingot,
        IngotList.Trinium_Naquadah_Alloy_Ingot,
        IngotList.Trinium_Naquadah_Carbonite_Ingot,
        IngotList.Arceus_Alloy_2B_Ingot,
        IngotList.HeLiCoPtEr_Ingot,
        IngotList.Lafium_Compound_Ingot,
        IngotList.Cinobite_A243_Ingot,
        IngotList.Pikyonium_64B_Ingot,
        IngotList.Abyssal_Alloy_Ingot,
        IngotList.Laurenium_Ingot,
        IngotList.Botmium_Ingot,
        IngotList.HS188_A_Ingot,
        IngotList.Titansteel_Ingot,
        IngotList.Arcanite_Ingot,
        IngotList.Octiron_Ingot,
        IngotList.Babbit_Alloy_Ingot,
        IngotList.Black_Titanium_Ingot,
        IngotList.Indalloy_140_Ingot,
        IngotList.Rhugnor_Ingot,
        IngotList.Quantum_Ingot,
        IngotList.Thauminite_Ingot,
        IngotList.Koboldite_Ingot,
        IngotList.Wrapped_Uranium_Ingot,
        IngotList.Wrapped_Thorium_Ingot,
        IngotList.Wrapped_Plutonium_Ingot,
        IngotList.Mixed_Metal_Ingot,
        IngotList.Heavy_Duty_Alloy_Ingot_T4,
        IngotList.Heavy_Duty_Alloy_Ingot_T5,
        IngotList.Heavy_Duty_Alloy_Ingot_T6,
        IngotList.Heavy_Duty_Alloy_Ingot_T7,
        IngotList.Heavy_Duty_Alloy_Ingot_T8,
        IngotList.Lightweight_Alloy_Ingot,
        IngotList.Rubber_Bar,
        IngotList.Heavy_Duty_Alloy_Ingot_T1,
        IngotList.Heavy_Duty_Alloy_Ingot_T2,
        IngotList.Heavy_Duty_Alloy_Ingot_T3,
        IngotList.Iridium_Alloy_Ingot,
        IngotList.Aeon_Steel_Ingot,
        IngotList.Queens_Gold_Ingot,
        IngotList.Dogbearium_Ingot
    };
}
