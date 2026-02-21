package Recipes.SingularityRecipes_VoidIngot;

import static gregtech.api.enums.Mods.AdvancedSolarPanel;
import static gregtech.api.enums.Mods.Avaritia;
import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.BloodArsenal;
import static gregtech.api.enums.Mods.Botania;
import static gregtech.api.enums.Mods.DraconicEvolution;
import static gregtech.api.enums.Mods.EnderIO;
import static gregtech.api.enums.Mods.EtFuturumRequiem;
import static gregtech.api.enums.Mods.ExtraUtilities;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GalacticraftAmunRa;
import static gregtech.api.enums.Mods.GoodGenerator;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.HardcoreEnderExpansion;
import static gregtech.api.enums.Mods.IndustrialCraft2;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.Mods.NewHorizonsCoreMod;
import static gregtech.api.enums.Mods.PamsHarvestTheNether;
import static gregtech.api.enums.Mods.SGCraft;
import static gregtech.api.enums.Mods.TaintedMagic;
import static gregtech.api.enums.Mods.Thaumcraft;
import static gregtech.api.enums.Mods.ThaumicBases;
import static gregtech.api.enums.Mods.ThaumicTinkerer;
import static gregtech.api.enums.Mods.TinkerConstruct;
import static gregtech.api.enums.Mods.TinkersDefence;
import static gregtech.api.enums.Mods.TwilightForest;
import static gregtech.api.enums.Mods.Witchery;
import static gregtech.api.util.GTModHandler.getModItem;

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
        // "Iron Ingot"
        getModItem(Minecraft.ID, "iron_ingot", 1L),
        // "Gold Ingot"
        getModItem(Minecraft.ID, "gold_ingot", 1L),
        // "Brick"
        getModItem(Minecraft.ID, "brick", 1L),
        // "Nether Brick"
        getModItem(Minecraft.ID, "netherbrick", 1L),
        // "Iridium Ingot"
        getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1L, 10),
        // "Uranium Ingot"
        getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1L, 11),
        // "Crystal Matrix Ingot"
        getModItem(Avaritia.ID, "Resource", 1L, 1),
        // "Cosmic Neutronium Ingot"
        getModItem(Avaritia.ID, "Resource", 1L, 4),
        // "Infinity Ingot"
        getModItem(Avaritia.ID, "Resource", 1L, 6),
        // "Blood Infused Iron Ingot"
        getModItem(BloodArsenal.ID, "blood_infused_iron", 1L),
        // "Manasteel Ingot"
        getModItem(Botania.ID, "manaResource", 1L),
        // "Terrasteel Ingot"
        getModItem(Botania.ID, "manaResource", 1L, 4),
        // "Elementium Ingot"
        getModItem(Botania.ID, "manaResource", 1L, 7),
        // "Gaia Spirit Ingot"
        getModItem(Botania.ID, "manaResource", 1L, 14),
        // "Draconium Ingot"
        getModItem(DraconicEvolution.ID, "draconiumIngot", 1L),
        // "Awakened Draconium Ingot"
        getModItem(DraconicEvolution.ID, "draconicIngot", 1L),
        // "Electrical Steel"
        getModItem(EnderIO.ID, "itemAlloy", 1L),
        // "Energetic Alloy"
        getModItem(EnderIO.ID, "itemAlloy", 1L, 1),
        // "Vibrant Alloy"
        getModItem(EnderIO.ID, "itemAlloy", 1L, 2),
        // "Redstone Alloy"
        getModItem(EnderIO.ID, "itemAlloy", 1L, 3),
        // "Conductive Iron"
        getModItem(EnderIO.ID, "itemAlloy", 1L, 4),
        // "Pulsating Iron"
        getModItem(EnderIO.ID, "itemAlloy", 1L, 5),
        // "Dark Steel"
        getModItem(EnderIO.ID, "itemAlloy", 1L, 6),
        // "Soularium"
        getModItem(EnderIO.ID, "itemAlloy", 1L, 7),
        // "End Steel"
        getModItem(EnderIO.ID, "itemAlloy", 1L, 8),
        // "Clay Compound"
        getModItem(EnderIO.ID, "itemAlloyEndergy", 1L),
        // "Crystalline Alloy"
        getModItem(EnderIO.ID, "itemAlloyEndergy", 1L, 1),
        // "Melodic Alloy"
        getModItem(EnderIO.ID, "itemAlloyEndergy", 1L, 2),
        // "Stellar Alloy"
        getModItem(EnderIO.ID, "itemAlloyEndergy", 1L, 3),
        // "Crystalline Pink Slime"
        getModItem(EnderIO.ID, "itemAlloyEndergy", 1L, 4),
        // "Energetic Silver"
        getModItem(EnderIO.ID, "itemAlloyEndergy", 1L, 5),
        // "Vivid Alloy"
        getModItem(EnderIO.ID, "itemAlloyEndergy", 1L, 6),
        // "Enderium Base"
        getModItem(EnderIO.ID, "itemPowderIngot", 1L, 6),
        // "Unstable Ingot"
        getModItem(ExtraUtilities.ID, "unstableingot", 1L),
        // '"Mobius ""Unstable/Stable"" Ingot"'
        getModItem(ExtraUtilities.ID, "unstableingot", 1L, 2),
        // "Bedrockium Ingot"
        getModItem(ExtraUtilities.ID, "bedrockiumIngot", 1L),
        // "Uranium Ingot"
        getModItem(GalacticraftAmunRa.ID, "item.baseItem", 1L, 11),
        // "Endium Ingot"
        getModItem(HardcoreEnderExpansion.ID, "endium_ingot", 1L),
        // "Naquadah Alloy Ingot"
        getModItem(SGCraft.ID, "naquadahIngot", 1L),
        // "Cobalt Ingot"
        getModItem(TinkerConstruct.ID, "materials", 1L, 3),
        // "Ardite Ingot"
        getModItem(TinkerConstruct.ID, "materials", 1L, 4),
        // "Manyullyn Ingot"
        getModItem(TinkerConstruct.ID, "materials", 1L, 5),
        // "Bronze Ingot"
        getModItem(TinkerConstruct.ID, "materials", 1L, 13),
        // "Aluminum Brass Ingot"
        getModItem(TinkerConstruct.ID, "materials", 1L, 14),
        // "Obzinite Ingot"
        getModItem(TinkerConstruct.ID, "materials", 1L, 15),
        // "Obsidian Ingot"
        getModItem(TinkerConstruct.ID, "materials", 1L, 18),
        // "Pig Iron Ingot"
        getModItem(TinkerConstruct.ID, "materials", 1L, 34),
        // "Shadowmetal Ingot"
        getModItem(TaintedMagic.ID, "ItemMaterial", 1L),
        // "Thaumium Ingot"
        getModItem(Thaumcraft.ID, "ItemResource", 1L, 2),
        // "Void Metal Ingot"
        getModItem(Thaumcraft.ID, "ItemResource", 1L, 16),
        // "Ichorium"
        getModItem(ThaumicTinkerer.ID, "kamiResource", 1L, 2),
        // "Ironwood Ingot"
        getModItem(TwilightForest.ID, "item.ironwoodIngot", 1L),
        // "Fiery Ingot"
        getModItem(TwilightForest.ID, "item.fieryIngot", 1L),
        // "Knightmetal Ingot"
        getModItem(TwilightForest.ID, "item.knightMetal", 1L),
        // "Zirconium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 3),
        // "Thorium 232 Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 30),
        // "Californium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 39),
        // "Calcium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
        // "BArTiMaEuSNeK Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 43),
        // "Ruthenium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 64),
        // "Rhodium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 78),
        // "Rhodium-Plated Palladium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 88),
        // "Ruridit Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 90),
        // "High Durability Compound Steel Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 92),
        // "Ademic Steel Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 96),
        // "Fluorophlogopite Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 104),
        // "Tantalum Hafnium Carbide Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 11503),
        // "Magnesia Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 32237),
        // "Atomic Separation Catalyst Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 10022),
        // "Extremely Unstable Naquadah Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 10024),
        // "Zn-Th Alloy Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 10053),
        // "Zircaloy-4 Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 10082),
        // "Zircaloy-2 Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 10083),
        // "Incoloy-903 Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 10084),
        // "Adamantium Alloy Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 10085),
        // "MAR-M200 Steel Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 10096),
        // "MAR-Ce-M200 Steel Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 10097),
        // "Lithium Chloride Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 10098),
        // "Signalium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 10099),
        // "Lumiium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 10101),
        // "Artherium-Sn Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 10102),
        // "Tanmolyium Beta-C Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 10103),
        // "Dalisenite Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 10104),
        // "Hikarium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 10105),
        // "Tairitsu Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 10106),
        // "Precious Metals Alloy Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 10109),
        // "Enriched Naquadah Alloy Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 10110),
        // "Metastable Oganesson Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 10111),
        // "Shirabon Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 10112),
        // "Hafnium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 11000),
        // "Zirconium Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 11007),
        // "PTMEG Elastomer Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 11312),
        // "Permalloy Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 11350),
        // "Mu-metal Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 11351),
        // "Silicon Nitride Ingot"
        getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 11353),
        // "Coke Oven Brick"
        getModItem(NewHorizonsCoreMod.ID, "item.CokeOvenBrick", 1L),
        // "Netherite Ingot"
        getModItem(EtFuturumRequiem.ID, "netherite_ingot", 1L),
        // "Lithium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11006),
        // "Beryllium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11008),
        // "Carbon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11010),
        // "Magnesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
        // "Aluminium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
        // "Raw Silicon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
        // "Potassium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11025),
        // "Scandium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11027),
        // "Titanium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11028),
        // "Vanadium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11029),
        // "Chrome Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11030),
        // "Manganese Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11031),
        // "Cobalt Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11033),
        // "Nickel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
        // "Copper Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
        // "Zinc Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11036),
        // "Gallium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11037),
        // "Arsenic Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11039),
        // "Rubidium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11043),
        // "Strontium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11044),
        // "Yttrium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11045),
        // "Niobium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11047),
        // "Molybdenum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11048),
        // "Palladium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11052),
        // "Silver Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11054),
        // "Indium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11056),
        // "Tin Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11057),
        // "Antimony Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11058),
        // "Tellurium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11059),
        // "Caesium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11062),
        // "Barium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11063),
        // "Lanthanum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11064),
        // "Cerium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11065),
        // "Praseodymium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11066),
        // "Neodymium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11067),
        // "Promethium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11068),
        // "Samarium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11069),
        // "Europium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11070),
        // "Gadolinium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11071),
        // "Terbium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11072),
        // "Dysprosium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11073),
        // "Holmium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11074),
        // "Erbium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11075),
        // "Thulium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11076),
        // "Ytterbium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11077),
        // "Lutetium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11078),
        // "Tantalum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11080),
        // "Tungsten Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11081),
        // "Osmium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11083),
        // "Iridium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11084),
        // "Platinum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11085),
        // "Lead Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),
        // "Bismuth Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11090),
        // "Thorium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11096),
        // "Uranium 235 Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11097),
        // "Uranium 238 Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11098),
        // "Plutonium 239 Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11100),
        // "Plutonium 241 Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11101),
        // "Americium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11103),
        // "Purified Tengam Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11111),
        // "Attuned Tengam Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11112),
        // "Hellish Metal Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11125),
        // "Neutronium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11129),
        // "Superconductor Base UIV Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11131),
        // "Netherite Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11132),
        // "Superconductor Base UMV Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11134),
        // "Universium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11139),
        // "Eternity Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11141),
        // "Magmatter Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11143),
        // "Six-Phased Copper Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11147),
        // "Mellion Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11148),
        // "Creon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11149),
        // "Proto-Halkonite Steel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11154),
        // "Exo-Halkonite Steel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11157),
        // "Prismatic Naquadah Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11163),
        // "Bronze Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11300),
        // "Brass Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11301),
        // "Invar Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11302),
        // "Electrum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11303),
        // "Wrought Iron Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11304),
        // "Steel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11305),
        // "Stainless Steel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11306),
        // "Pig Iron Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11307),
        // "Red Alloy Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11308),
        // "Blue Alloy Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11309),
        // "Cupronickel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11310),
        // "Nichrome Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11311),
        // "Kanthal Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11312),
        // "Magnalium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11313),
        // "Soldering Alloy Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11314),
        // "Battery Alloy Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11315),
        // "Tungstensteel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11316),
        // "Osmiridium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11317),
        // "Sunnarium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11318),
        // "Adamantium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11319),
        // "Fluxed Electrum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11320),
        // "Enderium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11321),
        // "Infused Gold Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11323),
        // "Naquadah Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11324),
        // "Naquadah Alloy Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11325),
        // "Enriched Naquadah Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11326),
        // "Naquadria Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11327),
        // "Duranium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11328),
        // "Tritanium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11329),
        // "Thaumium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11330),
        // "Mithril Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11331),
        // "Astral Silver Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11333),
        // "Black Steel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11334),
        // "Damascus Steel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11335),
        // "Shadow Iron Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11336),
        // "Shadow Steel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11337),
        // "Ironwood Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11338),
        // "Meteoric Iron Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11340),
        // "Meteoric Steel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11341),
        // "Deep Dark Iron Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11342),
        // "Cobalt Brass Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11343),
        // "Ultimet Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11344),
        // "Annealed Copper Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11345),
        // "Fiery Steel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11346),
        // "Red Steel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11348),
        // "Blue Steel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11349),
        // "Sterling Silver Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11350),
        // "Rose Gold Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11351),
        // "Black Bronze Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11352),
        // "Bismuth Bronze Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11353),
        // "Magnetic Iron Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11354),
        // "Magnetic Steel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11355),
        // "Magnetic Neodymium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11356),
        // "Vanadium-Gallium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11357),
        // "Yttrium Barium Cuprate Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11358),
        // "Niobium Nitride Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11359),
        // "Niobium-Titanium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11360),
        // "Chromium Dioxide Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11361),
        // "Knightmetal Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11362),
        // "Tin Alloy Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11363),
        // "Dark Steel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11364),
        // "Electrical Steel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11365),
        // "Energetic Alloy Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11366),
        // "Vibrant Alloy Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11367),
        // "Shadow Metal Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11368),
        // "Conductive Iron Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11369),
        // "Tungstencarbide Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11370),
        // "Vanadiumsteel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11371),
        // "HSS-G Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11372),
        // "HSS-E Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11373),
        // "HSS-S Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11374),
        // "Pulsating Iron Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11378),
        // "Soularium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11379),
        // "Enderium Base Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11380),
        // "Redstone Alloy Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11381),
        // "Ardite Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11382),
        // "Reinforced Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11383),
        // "Galgadorian Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11384),
        // "Enhanced Galgadorian Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11385),
        // "Manyullyn Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11386),
        // "Mytryl Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11387),
        // "Black Plutonium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11388),
        // "Callisto Ice Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11389),
        // "Ledox Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11390),
        // "Quantium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11391),
        // "Duralumin Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11392),
        // "Oriharukon Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11393),
        // "Infinity Catalyst Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11394),
        // "Bedrockium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11395),
        // "Infinity Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11397),
        // "Mysterious Crystal Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11398),
        // "Magnetic Samarium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11399),
        // "Obzinite Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11400),
        // "End Steel Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11401),
        // "Clay Compound Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11402),
        // "Crystalline Alloy Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11403),
        // "Melodic Alloy Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11404),
        // "Stellar Alloy Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11405),
        // "Crystalline Pink Slime Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11406),
        // "Energetic Silver Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11407),
        // "Vivid Alloy Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11408),
        // "Epoxid Bar"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11470),
        // "Silicone Rubber Bar"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11471),
        // "Polycaprolactam Bar"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11472),
        // "Polytetrafluoroethylene Bar"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11473),
        // "Alduorite Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11485),
        // "Rubracium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11488),
        // "Vulcanite Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11489),
        // "Force Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11521),
        // "Vinteum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11529),
        // "TPV-Alloy Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11576),
        // "Transcendent Metal Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11581),
        // "Enriched Holmium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11582),
        // "Magnetohydrodynamically Constrained Star Matter Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11583),
        // "White Dwarf Matter Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11585),
        // "Black Dwarf Matter Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11586),
        // "SpaceTime Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11588),
        // "Polybenzimidazole Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11599),
        // "Fiber-Reinforced Epoxy Resin Bar"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11610),
        // "Borosilicate Glass Bar"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11611),
        // "Nickel-Zinc Ferrite Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11613),
        // "Polyphenylene Sulfide Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11631),
        // "Styrene-Butadiene Rubber Bar"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11635),
        // "Polystyrene Bar"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11636),
        // "Polyvinyl Chloride Bar"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11649),
        // "Kevlar Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11765),
        // "Endium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11770),
        // "Nickel Aluminide Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11772),
        // "Obsidian Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11804),
        // "Deep Iron Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11829),
        // "Silicon Solar Grade (Poly SI) Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11856),
        // "Trinium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11868),
        // "Polyethylene Bar"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11874),
        // "Desh Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11884),
        // "Chrysotile Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11912),
        // "Realgar Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11913),
        // "Vyroxeres Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11951),
        // "Ceruclase Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11952),
        // "Tartarite Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11956),
        // "Orichalcum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11966),
        // "Void Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11970),
        // "Superconductor Base UEV Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11974),
        // "Draconium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11975),
        // "Awakened Draconium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11976),
        // "Blood Infused Iron Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11977),
        // "Ichorium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11978),
        // "Radox Polymer Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11979),
        // "Gallium Arsenide Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11980),
        // "Indium Gallium Phosphide Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11981),
        // "Cosmic Neutronium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11982),
        // "Flerovium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11984),
        // "Superconductor Base UHV Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11985),
        // "Superconductor Base UV Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11986),
        // "Superconductor Base MV Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11987),
        // "Superconductor Base HV Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11988),
        // "Superconductor Base EV Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11989),
        // "Superconductor Base IV Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11990),
        // "Superconductor Base LuV Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11991),
        // "Superconductor Base ZPM Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11992),
        // "Quartz Ingot"
        getModItem(PamsHarvestTheNether.ID, "quartzingotItem", 1L),
        // "Selenium Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotSelenium", 1L),
        // "Iodine Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotIodine", 1L),
        // "Rhenium Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotRhenium", 1L),
        // "Thallium Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotThallium", 1L),
        // "Germanium Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotGermanium", 1L),
        // "Polonium Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotPolonium", 1L),
        // "Radium Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotRadium", 1L),
        // "Protactinium Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotProtactinium", 1L),
        // "Curium Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotCurium", 1L),
        // "Neptunium Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotNeptunium", 1L),
        // "Fermium Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotFermium", 1L),
        // "Lithium 7 Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotLithium7", 1L),
        // "Uranium 232 Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotUranium232", 1L),
        // "Uranium 233 Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotUranium233", 1L),
        // "Plutonium-238 Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotPlutonium238", 1L),
        // "Advanced Nitinol Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotAdvancedNitinol", 1L),
        // "Astral Titanium Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotAstralTitanium", 1L),
        // "Celestial Tungsten Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotCelestialTungsten", 1L),
        // "Hypogen Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotHypogen", 1L),
        // "Chromatic Glass Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotChromaticGlass", 1L),
        // "Black Metal Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotBlackMetal", 1L),
        // "White Metal Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotWhiteMetal", 1L),
        // "Ancient Granite Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotAncientGranite", 1L),
        // "Runite Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotRunite", 1L),
        // "Dragonblood Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotDragonblood", 1L),
        // "Silicon Carbide Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotSiliconCarbide", 1L),
        // "Zirconium Carbide Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotZirconiumCarbide", 1L),
        // "Tantalum Carbide Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotTantalumCarbide", 1L),
        // "Niobium Carbide Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotNiobiumCarbide", 1L),
        // "Tungsten Titanium Carbide Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotTungstenTitaniumCarbide", 1L),
        // "Energy Crystal Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotEnergyCrystal", 1L),
        // "Blood Steel Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotBloodSteel", 1L),
        // "Zeron-100 Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotZeron100", 1L),
        // "Tumbaga Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotTumbaga", 1L),
        // "Potin Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotPotin", 1L),
        // "Staballoy Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotStaballoy", 1L),
        // "Tantalloy-60 Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotTantalloy60", 1L),
        // "Tantalloy-61 Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotTantalloy61", 1L),
        // "Inconel-625 Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotInconel625", 1L),
        // "Inconel-690 Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotInconel690", 1L),
        // "Inconel-792 Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotInconel792", 1L),
        // "Eglin Steel Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotEglinSteel", 1L),
        // "Maraging Steel 250 Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotMaragingSteel250", 1L),
        // "Maraging Steel 300 Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotMaragingSteel300", 1L),
        // "Maraging Steel 350 Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotMaragingSteel350", 1L),
        // "Watertight Steel Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotWatertightSteel", 1L),
        // "Nitinol 60 Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotNitinol60", 1L),
        // "Stellite Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotStellite", 1L),
        // "Talonite Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotTalonite", 1L),
        // "Hastelloy-W Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotHastelloyW", 1L),
        // "Hastelloy-X Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotHastelloyX", 1L),
        // "Hastelloy-C276 Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotHastelloyC276", 1L),
        // "Hastelloy-N Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotHastelloyN", 1L),
        // "Incoloy-020 Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotIncoloy020", 1L),
        // "Incoloy-DS Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotIncoloyDS", 1L),
        // "Incoloy-MA956 Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotIncoloyMA956", 1L),
        // "Grisium Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotGrisium", 1L),
        // "HG-1223 Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotHG1223", 1L),
        // "Trinium Titanium Alloy Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotTriniumTitaniumAlloy", 1L),
        // "Trinium Naquadah Alloy Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotTriniumNaquadahAlloy", 1L),
        // "Trinium Naquadah Carbonite Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotTriniumNaquadahCarbonite", 1L),
        // "Arceus Alloy 2B Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotArceusAlloy2B", 1L),
        // "HeLiCoPtEr Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotHeLiCoPtEr", 1L),
        // "Lafium Compound Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotLafiumCompound", 1L),
        // "Cinobite A243 Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotCinobiteA243", 1L),
        // "Pikyonium 64B Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotPikyonium64B", 1L),
        // "Abyssal Alloy Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotAbyssalAlloy", 1L),
        // "Laurenium Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotLaurenium", 1L),
        // "Botmium Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotBotmium", 1L),
        // "HS188-A Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotHS188A", 1L),
        // "Titansteel Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotTitansteel", 1L),
        // "Arcanite Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotArcanite", 1L),
        // "Octiron Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotOctiron", 1L),
        // "Babbit Alloy Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotBabbitAlloy", 1L),
        // "Black Titanium Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotBlackTitanium", 1L),
        // "Indalloy 140 Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotIndalloy140", 1L),
        // "Rhugnor Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotRhugnor", 1L),
        // "Quantum Ingot"
        getModItem(GTPlusPlus.ID, "itemIngotQuantum", 1L),
        // "Thauminite Ingot"
        getModItem(ThaumicBases.ID, "resource", 1L, 1),
        // "Koboldite Ingot"
        getModItem(Witchery.ID, "ingredient", 1L, 150),
        // "Wrapped Uranium Ingot"
        getModItem(GoodGenerator.ID, "wrappedUraniumIngot", 1L),
        // "Wrapped Thorium Ingot"
        getModItem(GoodGenerator.ID, "wrappedThoriumIngot", 1L),
        // "Wrapped Plutonium Ingot"
        getModItem(GoodGenerator.ID, "wrappedPlutoniumIngot", 1L),
        // "Rubber"
        getModItem(IndustrialCraft2.ID, "itemRubber", 1L),
        // "Mixed Metal Ingot"
        getModItem(IndustrialCraft2.ID, "itemIngot", 1L, 4),
        // "Heavy Duty Alloy Ingot T4"
        getModItem(NewHorizonsCoreMod.ID, "item.HeavyDutyAlloyIngotT4", 1L),
        // "Heavy Duty Alloy Ingot T6"
        getModItem(NewHorizonsCoreMod.ID, "item.HeavyDutyAlloyIngotT6", 1L),
        // "Heavy Duty Alloy Ingot T5"
        getModItem(NewHorizonsCoreMod.ID, "item.HeavyDutyAlloyIngotT5", 1L),
        // "Heavy Duty Alloy Ingot T8"
        getModItem(NewHorizonsCoreMod.ID, "item.HeavyDutyAlloyIngotT8", 1L),
        // "Heavy Duty Alloy Ingot T7"
        getModItem(NewHorizonsCoreMod.ID, "item.HeavyDutyAlloyIngotT7", 1L),
        // "Rubber Bar"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11880),
        // "Heavy Duty Alloy Ingot T1"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32462),
        // "Heavy Duty Alloy Ingot T2"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32463),
        // "Heavy Duty Alloy Ingot T3"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32464),
        // "Iridium Alloy Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32480),
        // "Aeon Steel Ingot"
        getModItem(TinkersDefence.ID, "AeonSteel Ingot", 1L),
        // "Queen's Gold Ingot"
        getModItem(TinkersDefence.ID, "Queen's Gold Ingot", 1L),
        // "Dogbearium Ingot"
        getModItem(TinkersDefence.ID, "DogbeariumIngot", 1L) };
}
