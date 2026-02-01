package Recipes.SingularityRecipes_Pachinko;

import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.EnderIO;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GoodGenerator;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.Mods.Railcraft;
import static gregtech.api.enums.Mods.Thaumcraft;
import static gregtech.api.enums.Mods.ThaumicBases;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

// GregTech Multi-Block Machine 20000~32768
public class SingularityPachinkoRecipes_GT_MultiBlock_4 {

    public static final Map<Integer, ItemStack[]> PachinkoRecipes_GT_MultiBlock_4 = new HashMap<>();

    public static void addPachinkoRecipes_GT_MultiBlock_4() {
        // "Dangote Distillus" - 31021
        PachinkoRecipes_GT_MultiBlock_4.put(
            31021,
            new ItemStack[] {
                // "Dangote Distillus"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31021),
                // "Clean Stainless Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1) });

        // Zyngen - 31023
        PachinkoRecipes_GT_MultiBlock_4.put(
            31023,
            new ItemStack[] {
                // Zyngen
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31023),
                // "Inconel Reinforced Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 1),
                // "Integral Encasement V"
                getModItem(GTPlusPlus.ID, "gtplusplus.blocktieredcasings.1", 1L, 4),

                // "Coil Block"
                // "Cupronickel Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 0),
                // "Kanthal Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 1),
                // "Nichrome Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 2),
                // "TPV-Alloy Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 3),
                // "HSS-G Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 4),
                // "Naquadah Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 5),
                // "Naquadah Alloy Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 6),
                // "Electrum Flux Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 7),
                // "Awakened Draconium Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 8),
                // "HSS-S Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 9),
                // "Trinium Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 10),
                // "Infinity Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 11),
                // "Hypogen Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 12),
                // "Eternal Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 13) });

        // "Large Semifluid Burner" - 31026
        PachinkoRecipes_GT_MultiBlock_4.put(
            31026,
            new ItemStack[] {
                // "Large Semifluid Burner"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31026),
                // "Steel Gear Box Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 3),
                // "Stable Titanium Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2),
                // "Engine Intake Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 13) });

        // "IsaMill Grinding Machine" - 31027
        PachinkoRecipes_GT_MultiBlock_4.put(
            31027,
            new ItemStack[] {
                // "IsaMill Grinding Machine"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31027),
                // "Ball Housing"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31029),
                // "IsaMill Exterior Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 0),
                // "IsaMill Piping"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 1),
                // "IsaMill Gearbox"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 2) });

        // "Flotation Cell Regulator" - 31028
        PachinkoRecipes_GT_MultiBlock_4.put(
            31028,
            new ItemStack[] {
                // "Flotation Cell Regulator"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31028),
                // "Flotation Cell Casings"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 9),
                // "Inconel Reinforced Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 1) });

        // "Sparge Tower Controller" - 31035
        PachinkoRecipes_GT_MultiBlock_4.put(
            31035,
            new ItemStack[] {
                // "Sparge Tower Controller"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31035),
                // "Sparge Tower Exterior Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 4) });

        // "Steam Grinder" - 31041
        PachinkoRecipes_GT_MultiBlock_4.put(
            31041,
            new ItemStack[] {
                // "Steam Grinder"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31041),
                // "Bronze Plated Bricks"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 10),
                // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0) });

        // "Elemental Duplicator" - 31050
        PachinkoRecipes_GT_MultiBlock_4.put(
            31050,
            new ItemStack[] {
                // "Elemental Duplicator"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31050),
                // "Data Orb Repository"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31051),
                // "Matter Generation Coil"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 8),
                // "Matter Fabricator Casing"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 9),
                // "Elemental Confinement Shell"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 3),
                // "High Voltage Current Capacitor"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 12),
                // "Particle Containment Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 13),
                // "Resonance Chamber III"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.3", 1L, 2),
                // "Modulator III"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.3", 1L, 6) });

        // Boldarnator - 31065
        PachinkoRecipes_GT_MultiBlock_4.put(
            31065,
            new ItemStack[] {
                // Boldarnator
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31065),
                // "Thermal Processing Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 0),
                // "Thermal Containment Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 11) });

        // "Industrial 3D Copying Machine" - 31069
        PachinkoRecipes_GT_MultiBlock_4.put(
            31069,
            new ItemStack[] {
                // "Industrial 3D Copying Machine"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31069),
                // "Sturdy Printer Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 5) });

        // "Molecular Transformer" - 31072
        PachinkoRecipes_GT_MultiBlock_4.put(
            31072,
            new ItemStack[] {
                // "Molecular Transformer"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31072),
                // "Robust Tungstensteel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0),
                // "TPV-Alloy Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 3),
                // "Molecular Containment Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 11),
                // "High Voltage Current Capacitor"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 12),
                // "Particle Containment Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 13),
                // "Resonance Chamber I"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.3", 1L, 0),
                // "Modulator I"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.3", 1L, 4) });

        // "XL Turbo Gas Turbine" - 31073
        PachinkoRecipes_GT_MultiBlock_4.put(
            31073,
            new ItemStack[] {
                // "XL Turbo Gas Turbine"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31073),
                // "Rotor Assembly"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30010),
                // "Turbine Shaft"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 0),
                // "Reinforced Gas Turbine Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 3) });

        // "XL Turbo Plasma Turbine" - 31074
        PachinkoRecipes_GT_MultiBlock_4.put(
            31074,
            new ItemStack[] {
                // "XL Turbo Plasma Turbine"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31074),
                // "Rotor Assembly"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30010),
                // "Turbine Shaft"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 0),
                // "Reinforced Plasma Turbine Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 4) });

        // "Industrial Sledgehammer" - 31075
        PachinkoRecipes_GT_MultiBlock_4.put(
            31075,
            new ItemStack[] {
                // "Industrial Sledgehammer"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31075),
                // "Forge Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 6),
                // "Slightly Damaged Anvil"
                getModItem(Minecraft.ID, "anvil", 1L, 1),
                // "Very Damaged Steel Anvil"
                getModItem(Railcraft.ID, "anvil", 1L, 2),
                // "Thaumium Anvil"
                getModItem(ThaumicBases.ID, "thaumicAnvil", 1L, 3),
                // "Void Metal Anvil"
                getModItem(ThaumicBases.ID, "voidAnvil", 1L, 4),
                // "Dark Steel Anvil"
                getModItem(EnderIO.ID, "blockDarkSteelAnvil", 1L, 3) });

        // "XL Turbo SC Steam Turbine" - 31076
        PachinkoRecipes_GT_MultiBlock_4.put(
            31076,
            new ItemStack[] {
                // "XL Turbo SC Steam Turbine"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31076),
                // "Rotor Assembly"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30010),
                // "Turbine Shaft"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 0),
                // "Reinforced SC Turbine Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 15) });

        // "Thermic Heating Device" - 31077
        PachinkoRecipes_GT_MultiBlock_4.put(
            31077,
            new ItemStack[] {
                // "Thermic Heating Device"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31077),
                // "Thermal Containment Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 11),
                // "Multi-Use Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 2) });

        // "Steam Squasher" - 31078
        PachinkoRecipes_GT_MultiBlock_4.put(
            31078,
            new ItemStack[] {
                // "Steam Squasher"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31078),
                // "Bronze Plated Bricks"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 10),
                // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0) });

        // "Whakawhiti Wera XL" - 31079
        PachinkoRecipes_GT_MultiBlock_4.put(
            31079,
            new ItemStack[] {
                // "Whakawhiti Wera XL"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31079),
                // "Tungstensteel Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 15),
                // "Talonite Frame Box"
                getModItem(GTPlusPlus.ID, "blockFrameGtTalonite", 1L),
                // "Reinforced Heat Exchanger Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 14) });

        // "Steam Separator" - 31080
        PachinkoRecipes_GT_MultiBlock_4.put(
            31080,
            new ItemStack[] {
                // "Steam Separator"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31080),
                // "Bronze Plated Bricks"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 10),
                // "Bronze Gear Box Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 2),
                // "Bronze Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 12),
                // "Bronze Firebox Casing"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 13),
                // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0),
                // "Steel Gear Box Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 3),
                // "Steel Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 13),
                // "Steel Firebox Casing"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 14) });

        // "Steam Purifier" - 31082
        PachinkoRecipes_GT_MultiBlock_4.put(
            31082,
            new ItemStack[] {
                // "Steam Purifier"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31082),
                // "Bronze Plated Bricks"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 10),
                // "Bronze Gear Box Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 2),
                // "Bronze Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 12),
                // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0),
                // "Steel Gear Box Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 3),
                // "Steel Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 13),
                // "Glass"
                getModItem(Minecraft.ID, "glass", 1L) });

        // "Steam Presser" - 31083
        PachinkoRecipes_GT_MultiBlock_4.put(
            31083,
            new ItemStack[] {
                // "Steam Presser"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31083),
                // "Bronze Plated Bricks"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 10),
                // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0),
                // "Bronze Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 12),
                // "Steel Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 13),
                // "Block of Steel"
                getModItem(GregTech.ID, "gt.blockmetal6", 1L, 13),
                // "Block of Iron"
                getModItem(Minecraft.ID, "iron_block", 1L) });

        // "Steam Blender" - 31084
        PachinkoRecipes_GT_MultiBlock_4.put(
            31084,
            new ItemStack[] {
                // "Steam Blender"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31084),
                // "Bronze Plated Bricks"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 10),
                // "Bronze Gear Box Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 2),
                // "Bronze Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 12),
                // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0),
                // "Steel Gear Box Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 3),
                // "Steel Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 13),
                // "Block of Iron"
                getModItem(Minecraft.ID, "iron_block", 1L) });

        // "Water Pump" - 31085
        PachinkoRecipes_GT_MultiBlock_4.put(
            31085,
            new ItemStack[] {
                // "Water Pump"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31085),
                // "Primitive Wooden Casing"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 2),
                // "Bronze Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 300),
                // "Steel Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 305) });

        // "Steam Fuser" - 31086
        PachinkoRecipes_GT_MultiBlock_4.put(
            31086,
            new ItemStack[] {
                // "Steam Fuser"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31086),
                // "Bronze Plated Bricks"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 10),
                // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0),
                // "Bronze Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 12),
                // "Steel Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 13),

                // "Borosilicate Glass Block"
                // "Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 0),
                // "Titanium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 1),
                // "Tungstensteel Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 2),
                // "Rhodium-Plated Palladium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 3),
                // "Iridium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 4),
                // "Osmium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 5),
                // "Neutronium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 13),
                // "Cosmic Neutronium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 14),
                // "Infinity Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 15),
                // "Transcendentally Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0) });

        // "Mega Alloy Blast Smelter" - 31150
        PachinkoRecipes_GT_MultiBlock_4.put(
            31150,
            new ItemStack[] {
                // "Mega Alloy Blast Smelter"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31150),
                // "Blast Smelter Heat Containment Coil"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 14),
                // "Blast Smelter Casing Block"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 15),

                // "Borosilicate Glass Block"
                // "Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 0),
                // "Titanium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 1),
                // "Tungstensteel Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 2),
                // "Rhodium-Plated Palladium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 3),
                // "Iridium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 4),
                // "Osmium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 5),
                // "Neutronium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 13),
                // "Cosmic Neutronium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 14),
                // "Infinity Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 15),
                // "Transcendentally Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0),

                // "Coil Block"
                // "Cupronickel Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 0),
                // "Kanthal Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 1),
                // "Nichrome Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 2),
                // "TPV-Alloy Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 3),
                // "HSS-G Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 4),
                // "Naquadah Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 5),
                // "Naquadah Alloy Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 6),
                // "Electrum Flux Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 7),
                // "Awakened Draconium Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 8),
                // "HSS-S Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 9),
                // "Trinium Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 10),
                // "Infinity Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 11),
                // "Hypogen Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 12),
                // "Eternal Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 13) });

        // "Quantum Force Transformer" - 31151
        PachinkoRecipes_GT_MultiBlock_4.put(
            31151,
            new ItemStack[] {
                // "Quantum Force Transformer"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31151),
                // "Bulk Catalyst Housing"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9416),
                // "Bulk Production Frame"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 12),
                // "Quantum Force Transformer Coil Casings"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.4", 1L, 4),
                // "Neutron Pulse Manipulator"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 7),
                // "Cosmic Fabric Manipulator"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 8),
                // "Infinity Infused Manipulator"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 9),
                // "SpaceTime Continuum Ripper"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 10),
                // "Neutron Shielding Core"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 11),
                // "Cosmic Fabric Shielding Core"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 12),
                // "Infinity Infused Shielding Core"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 13),
                // "SpaceTime Bending Core"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 14),
                // "Force Field Glass"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 15) });

        // "Universal Chemical Fuel Engine" - 32001
        PachinkoRecipes_GT_MultiBlock_4.put(
            32001,
            new ItemStack[] {
                // "Universal Chemical Fuel Engine"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32001),
                // "Titanium Gear Box Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 4),
                // "Titanium Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 14),
                // "Stable Titanium Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2),
                // "Engine Intake Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 13),
                // "Titanium Plated Cylinder"
                getModItem(GoodGenerator.ID, "titaniumPlatedCylinder", 1L, 0) });

        // "Neutron Activator" - 32013
        PachinkoRecipes_GT_MultiBlock_4.put(
            32013,
            new ItemStack[] {
                // "Neutron Activator"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32013),
                // "Neutron Sensor"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32012),
                // "Processor Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 6),
                // "Clean Stainless Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1),
                // "Steel Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 305),
                // "Speeding Pipe Casing"
                getModItem(GoodGenerator.ID, "speedingPipe", 1L, 0),

                // "Neutron Accelerator"
                // "Neutron Accelerator ULV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32003),
                // "Neutron Accelerator LV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32004),
                // "Neutron Accelerator MV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32005),
                // "Neutron Accelerator HV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32006),
                // "Neutron Accelerator EV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32007),
                // "Neutron Accelerator IV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32008),
                // "Neutron Accelerator LuV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32009),
                // "Neutron Accelerator ZPM"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32010),
                // "Neutron Accelerator UV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32011),
                // "Neutron Accelerator UHV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32761),
                // "Neutron Accelerator UEV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32762),
                // "Neutron Accelerator UIV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32763),
                // "Neutron Accelerator UMV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32764),

                // "Borosilicate Glass Block"
                // "Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 0),
                // "Titanium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 1),
                // "Tungstensteel Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 2),
                // "Rhodium-Plated Palladium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 3),
                // "Iridium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 4),
                // "Osmium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 5),
                // "Neutronium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 13),
                // "Cosmic Neutronium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 14),
                // "Infinity Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 15),
                // "Transcendentally Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0) });

        // YOTTank - 32014
        PachinkoRecipes_GT_MultiBlock_4.put(
            32014,
            new ItemStack[] {
                // YOTTank
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32014),
                // "Steel Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 305),
                // "YOTTank Casing"
                getModItem(GoodGenerator.ID, "yottaFluidTankCasing", 1L, 0),

                // "Fluid Cell Block"
                // "Fluid Cell Block T1"
                getModItem(GoodGenerator.ID, "yottaFluidTankCells", 1L, 0),
                // "Fluid Cell Block T2"
                getModItem(GoodGenerator.ID, "yottaFluidTankCells", 1L, 1),
                // "Fluid Cell Block T3"
                getModItem(GoodGenerator.ID, "yottaFluidTankCells", 1L, 2),
                // "Fluid Cell Block T4"
                getModItem(GoodGenerator.ID, "yottaFluidTankCells", 1L, 3),
                // "Fluid Cell Block T5"
                getModItem(GoodGenerator.ID, "yottaFluidTankCells", 1L, 4),
                // "Fluid Cell Block T6"
                getModItem(GoodGenerator.ID, "yottaFluidTankCells", 1L, 5),
                // "Fluid Cell Block T7"
                getModItem(GoodGenerator.ID, "yottaFluidTankCells", 1L, 6),
                // "Fluid Cell Block T8"
                getModItem(GoodGenerator.ID, "yottaFluidTankCells", 1L, 7),
                // "Fluid Cell Block T9"
                getModItem(GoodGenerator.ID, "yottaFluidTankCells", 1L, 8),
                // "Fluid Cell Block T10"
                getModItem(GoodGenerator.ID, "yottaFluidTankCells", 1L, 9),

                // "Borosilicate Glass Block"
                // "Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 0),
                // "Titanium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 1),
                // "Tungstensteel Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 2),
                // "Rhodium-Plated Palladium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 3),
                // "Iridium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 4),
                // "Osmium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 5),
                // "Neutronium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 13),
                // "Cosmic Neutronium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 14),
                // "Infinity Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 15),
                // "Transcendentally Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0) });

        // "Large Supercritical Steam Turbine" - 32016
        PachinkoRecipes_GT_MultiBlock_4.put(
            32016,
            new ItemStack[] {
                // "Large Supercritical Steam Turbine"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32016),
                // "SC Turbine Casing"
                getModItem(GoodGenerator.ID, "supercriticalFluidTurbineCasing", 1L, 0) });

        // "Extreme Heat Exchanger" - 32017
        PachinkoRecipes_GT_MultiBlock_4.put(
            32017,
            new ItemStack[] {
                // "Extreme Heat Exchanger"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32017),
                // "Tungstensteel Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 15),
                // "Robust Tungstensteel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0),
                // "Pressure Resistant Wall"
                getModItem(GoodGenerator.ID, "pressureResistantWalls", 1L, 0),

                // "Borosilicate Glass Block"
                // "Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 0),
                // "Titanium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 1),
                // "Tungstensteel Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 2),
                // "Rhodium-Plated Palladium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 3),
                // "Iridium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 4),
                // "Osmium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 5),
                // "Neutronium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 13),
                // "Cosmic Neutronium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 14),
                // "Infinity Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 15),
                // "Transcendentally Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0) });

        // "Precise Auto-Assembler MT-3662" - 32018
        PachinkoRecipes_GT_MultiBlock_4.put(
            32018,
            new ItemStack[] {
                // "Precise Auto-Assembler MT-3662"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32018),
                // "Tungstensteel Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 316),

                // "Precise Electronic Unit Casing"
                // "Imprecise Electronic Unit Casing"
                getModItem(GoodGenerator.ID, "impreciseUnitCasing", 1L, 0),
                // "Precise Electronic Unit Casing MK-I"
                getModItem(GoodGenerator.ID, "preciseUnitCasing", 1L, 0),
                // "Precise Electronic Unit Casing MK-II"
                getModItem(GoodGenerator.ID, "preciseUnitCasing", 1L, 1),
                // "Precise Electronic Unit Casing MK-III"
                getModItem(GoodGenerator.ID, "preciseUnitCasing", 1L, 2),
                // "Precise Electronic Unit Casing MK-IV"
                getModItem(GoodGenerator.ID, "preciseUnitCasing", 1L, 3),

                // "Machine Casing"
                // "LV Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 1),
                // "MV Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 2),
                // "HV Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 3),
                // "EV Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 4),
                // "IV Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 5),
                // "LuV Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 6),
                // "ZPM Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 7),
                // "UV Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 8),
                // "UHV Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 9),

                // "Borosilicate Glass Block"
                // "Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 0),
                // "Titanium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 1),
                // "Tungstensteel Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 2),
                // "Rhodium-Plated Palladium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 3),
                // "Iridium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 4),
                // "Osmium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 5),
                // "Neutronium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 13),
                // "Cosmic Neutronium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 14),
                // "Infinity Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 15),
                // "Transcendentally Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0) });

        // "Compact Fusion Computer MK-I Prototype" - 32019
        PachinkoRecipes_GT_MultiBlock_4.put(
            32019,
            new ItemStack[] {
                // "Compact Fusion Computer MK-I Prototype"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32019),
                // "Drone DownLink Module"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9401),
                // "LuV Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 6),
                // "Naquadah Alloy Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 325),
                // "Ameliorated Superconduct Coil"
                getModItem(GoodGenerator.ID, "compactFusionCoil", 1L, 0),
                // "Rhodium-Plated Palladium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 3) });

        // "Compact Fusion Computer MK-II" - 32020
        PachinkoRecipes_GT_MultiBlock_4.put(
            32020,
            new ItemStack[] {
                // "Compact Fusion Computer MK-II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32020),
                // "Drone DownLink Module"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9401),
                // "Fusion Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 6),
                // "Duranium Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 328),
                // "Compact Fusion Coil"
                getModItem(GoodGenerator.ID, "compactFusionCoil", 1L, 1),
                // "Iridium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 4) });

        // "Compact Fusion Computer MK-III" - 32021
        PachinkoRecipes_GT_MultiBlock_4.put(
            32021,
            new ItemStack[] {
                // "Compact Fusion Computer MK-III"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32021),
                // "Drone DownLink Module"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9401),
                // "Fusion Machine Casing MK II"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 8),
                // "Neutronium Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 129),
                // "Advanced Compact Fusion Coil"
                getModItem(GoodGenerator.ID, "compactFusionCoil", 1L, 2),
                // "Osmium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 5) });

        // "Compact Fusion Computer MK-IV Prototype" - 32022
        PachinkoRecipes_GT_MultiBlock_4.put(
            32022,
            new ItemStack[] {
                // "Compact Fusion Computer MK-IV Prototype"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32022),
                // "Drone DownLink Module"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9401),
                // "Fusion Machine Casing MK III"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 12),
                // "Infinity Catalyst Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 394),
                // "Compact Fusion Coil MK-II Prototype"
                getModItem(GoodGenerator.ID, "compactFusionCoil", 1L, 3),
                // "Neutronium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 13) });

        // "Compact Fusion Computer MK-V" - 32023
        PachinkoRecipes_GT_MultiBlock_4.put(
            32023,
            new ItemStack[] {
                // "Compact Fusion Computer MK-V"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32023),
                // "Drone DownLink Module"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9401),
                // "Fusion Machine Casing MK IV"
                getModItem(GregTech.ID, "gt.blockcasings6", 1L, 0),
                // "Infinity Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 397),
                // "Compact Fusion Coil MK-II Finaltype"
                getModItem(GoodGenerator.ID, "compactFusionCoil", 1L, 4),
                // "Cosmic Neutronium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 14) });

        // "Large Essentia Smeltery" - 32024
        PachinkoRecipes_GT_MultiBlock_4.put(
            32024,
            new ItemStack[] {
                // "Large Essentia Smeltery"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32024),
                // "Warded Glass"
                getModItem(Thaumcraft.ID, "blockCosmeticOpaque", 1L, 2),
                // "Thaumium Alchemical Furnace"
                getModItem(ThaumicBases.ID, "advAlchFurnace", 1L),
                // "Magic Casing"
                getModItem(GoodGenerator.ID, "magicCasing", 1L, 0),
                // "Novice Essentia Diffusion Cell"
                getModItem(GoodGenerator.ID, "essentiaCell", 1L, 0),
                // "Essentia Filter Casing"
                getModItem(GoodGenerator.ID, "essentiaFilterCasing", 1L, 0) });

        // "Coolant Tower" - 32025
        PachinkoRecipes_GT_MultiBlock_4.put(
            32025,
            new ItemStack[] {
                // "Coolant Tower"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32025),
                // "Tungstencarbide Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 370),
                // "Light Concrete"
                getModItem(GregTech.ID, "gt.blockconcretes", 1L, 8) });

        // "Component Assembly Line" - 32026
        PachinkoRecipes_GT_MultiBlock_4.put(
            32026,
            new ItemStack[] {
                // "Component Assembly Line"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32026),
                // "Assembly Line Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 5),
                // "Assembler Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 9),
                // "Advanced Iridium Plated Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 7),
                // "PBI Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 0),
                // "Advanced Filter Casing"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 1),
                // "Tungstensteel Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 316),

                // "Component Assembly Line Casing"
                // "Component Assembly Line Casing (LV)"
                getModItem(GoodGenerator.ID, "componentAssemblylineCasing", 1L, 0),
                // "Component Assembly Line Casing (MV)"
                getModItem(GoodGenerator.ID, "componentAssemblylineCasing", 1L, 1),
                // "Component Assembly Line Casing (HV)"
                getModItem(GoodGenerator.ID, "componentAssemblylineCasing", 1L, 2),
                // "Component Assembly Line Casing (EV)"
                getModItem(GoodGenerator.ID, "componentAssemblylineCasing", 1L, 3),
                // "Component Assembly Line Casing (IV)"
                getModItem(GoodGenerator.ID, "componentAssemblylineCasing", 1L, 4),
                // "Component Assembly Line Casing (LuV)"
                getModItem(GoodGenerator.ID, "componentAssemblylineCasing", 1L, 5),
                // "Component Assembly Line Casing (ZPM)"
                getModItem(GoodGenerator.ID, "componentAssemblylineCasing", 1L, 6),
                // "Component Assembly Line Casing (UV)"
                getModItem(GoodGenerator.ID, "componentAssemblylineCasing", 1L, 7),
                // "Component Assembly Line Casing (UHV)"
                getModItem(GoodGenerator.ID, "componentAssemblylineCasing", 1L, 8),
                // "Component Assembly Line Casing (UEV)"
                getModItem(GoodGenerator.ID, "componentAssemblylineCasing", 1L, 9),
                // "Component Assembly Line Casing (UIV)"
                getModItem(GoodGenerator.ID, "componentAssemblylineCasing", 1L, 10),
                // "Component Assembly Line Casing (UMV)"
                getModItem(GoodGenerator.ID, "componentAssemblylineCasing", 1L, 11),
                // "Component Assembly Line Casing (UXV)"
                getModItem(GoodGenerator.ID, "componentAssemblylineCasing", 1L, 12),
                // "Component Assembly Line Casing (MAX)"
                getModItem(GoodGenerator.ID, "componentAssemblylineCasing", 1L, 13),

                // "Borosilicate Glass Block"
                // "Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 0),
                // "Titanium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 1),
                // "Tungstensteel Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 2),
                // "Rhodium-Plated Palladium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 3),
                // "Iridium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 4),
                // "Osmium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 5),
                // "Neutronium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 13),
                // "Cosmic Neutronium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 14),
                // "Infinity Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 15),
                // "Transcendentally Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0) });

        // "Semi-Stable Antimatter Stabilization Sequencer" - 32027
        PachinkoRecipes_GT_MultiBlock_4.put(
            32027,
            new ItemStack[] {
                // "Semi-Stable Antimatter Stabilization Sequencer"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32027),
                // "Antimatter Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32029),
                // "Magnetic Flux Casing"
                getModItem(GoodGenerator.ID, "magneticFluxCasing", 1L, 0),
                // "Gravity Stabilization Casing"
                getModItem(GoodGenerator.ID, "gravityStabilizationCasing", 1L, 0),
                // "Protomatter Activation Coil"
                getModItem(GoodGenerator.ID, "protomatterActivationCoil", 1L, 0),
                // "Antimatter Containment Casing"
                getModItem(GoodGenerator.ID, "antimatterContainmentCasing", 1L, 0) });

        // "Shielded Lagrangian Annihilation Matrix" - 32028
        PachinkoRecipes_GT_MultiBlock_4.put(
            32028,
            new ItemStack[] {
                // "Shielded Lagrangian Annihilation Matrix"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32028),
                // "Advanced Filter Casing"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 1),
                // "Naquadria Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 327),
                // "Gravity Stabilization Casing"
                getModItem(GoodGenerator.ID, "gravityStabilizationCasing", 1L, 0),
                // "Magnetic Flux Casing"
                getModItem(GoodGenerator.ID, "magneticFluxCasing", 1L, 0),
                // "Antimatter Annihilation Matrix"
                getModItem(GoodGenerator.ID, "antimatterAnnihilationMatrix", 1L, 0),
                // "Protomatter Activation Coil"
                getModItem(GoodGenerator.ID, "protomatterActivationCoil", 1L, 0),
                // "Transcendentally Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0) });
    }
}
