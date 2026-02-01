package Recipes.SingularityRecipes_Pachinko;

import static gregtech.api.enums.Mods.AppliedEnergistics2;
import static gregtech.api.enums.Mods.Avaritia;
import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.ExtraUtilities;
import static gregtech.api.enums.Mods.Forestry;
import static gregtech.api.enums.Mods.GTNHIntergalactic;
import static gregtech.api.enums.Mods.GTNHLanthanides;
import static gregtech.api.enums.Mods.GoodGenerator;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.IndustrialCraft2;
import static gregtech.api.enums.Mods.KekzTech;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.Mods.ProjectRedIllumination;
import static gregtech.api.enums.Mods.RandomThings;
import static gregtech.api.enums.Mods.TecTech;
import static gregtech.api.enums.Mods.Thaumcraft;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

// GregTech Multi-Block Machine 10000~19999
public class SingularityPachinkoRecipes_GT_MultiBlock_3 {

    public static final Map<Integer, ItemStack[]> PachinkoRecipes_GT_MultiBlock_3 = new HashMap<>();

    public static void addPachinkoRecipes_GT_MultiBlock_3() {
        // Digester - 10500
        PachinkoRecipes_GT_MultiBlock_3.put(
            10500,
            new ItemStack[] {
                // Digester
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10500),
                // "Heat Proof Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 11),
                // "Robust Tungstensteel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0),
                // "Clean Stainless Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1),

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

        // "Dissolution Tank" - 10501
        PachinkoRecipes_GT_MultiBlock_3.put(
            10501,
            new ItemStack[] {
                // "Dissolution Tank"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10501),
                // "Heat Proof Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 11),
                // "Clean Stainless Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1),

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

        // "Linear Accelerator" - 10505
        PachinkoRecipes_GT_MultiBlock_3.put(
            10505,
            new ItemStack[] {
                // "Linear Accelerator"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10505),
                // "LuV Beamline Input Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10503),
                // "LuV Beamline Output Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10504),
                // "Superconducting Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 15),
                // "Grate Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 10),
                // "Shielded Accelerator Casing"
                getModItem(GTNHLanthanides.ID, "casing.shielded_accelerator", 1L),
                // "Electrode Casing"
                getModItem(GTNHLanthanides.ID, "casing.electrode", 1L),
                // "Coolant Delivery Casing"
                getModItem(GTNHLanthanides.ID, "casing.coolant_delivery", 1L),
                // "Shielded Accelerator Glass"
                getModItem(GTNHLanthanides.ID, "tile.casing.shielded_accelerator_glass", 1L),

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

        // "Source Chamber" - 10506
        PachinkoRecipes_GT_MultiBlock_3.put(
            10506,
            new ItemStack[] {
                // "Source Chamber"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10506),
                // "LuV Beamline Output Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10504),
                // "Shielded Accelerator Casing"
                getModItem(GTNHLanthanides.ID, "casing.shielded_accelerator", 1L),
                // "Electrode Casing"
                getModItem(GTNHLanthanides.ID, "casing.electrode", 1L),
                // "Shielded Accelerator Glass"
                getModItem(GTNHLanthanides.ID, "tile.casing.shielded_accelerator_glass", 1L) });

        // Synchrotron - 10507
        PachinkoRecipes_GT_MultiBlock_3.put(
            10507,
            new ItemStack[] {
                // Synchrotron
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10507),
                // "LuV Beamline Input Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10503),
                // "LuV Beamline Output Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10504),
                // "Superconducting Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 15),
                // "Shielded Accelerator Casing"
                getModItem(GTNHLanthanides.ID, "casing.shielded_accelerator", 1L),
                // "Coolant Delivery Casing"
                getModItem(GTNHLanthanides.ID, "casing.coolant_delivery", 1L),
                // "Antenna Casing (T2)"
                getModItem(GTNHLanthanides.ID, "casing.antenna_t2", 1L),
                // "Niobium Cavity Machine Casing"
                getModItem(GTNHLanthanides.ID, "casing.niobium_cavity", 1L),

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

        // "Target Chamber" - 10508
        PachinkoRecipes_GT_MultiBlock_3.put(
            10508,
            new ItemStack[] {
                // "Target Chamber"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10508),
                // "LuV Beamline Input Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10503),
                // "Focus Input Bus"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10509),
                // "Grate Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 10),
                // "Shielded Accelerator Casing"
                getModItem(GTNHLanthanides.ID, "casing.shielded_accelerator", 1L),
                // "Shielded Accelerator Glass"
                getModItem(GTNHLanthanides.ID, "tile.casing.shielded_accelerator_glass", 1L),
                // "Target Receptacle"
                getModItem(GTNHLanthanides.ID, "casing.target_receptacle", 1L),
                // "Focus Manipulator"
                getModItem(GTNHLanthanides.ID, "casing.focus_manipulator", 1L),
                // "Target Holder"
                getModItem(GTNHLanthanides.ID, "casing.target_holder", 1L),
                // "Focus Holder"
                getModItem(GTNHLanthanides.ID, "casing.focus_holder", 1L),
                // "Titanium Reinforced Borosilicate Glass Block"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 1) });

        // "Electric Air Filter T1" - 12020
        PachinkoRecipes_GT_MultiBlock_3.put(
            12020,
            new ItemStack[] {
                // "Electric Air Filter T1"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12020),
                // "Air Filter Turbine Casing"
                getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 0),
                // "Air Filter Vent Casing"
                getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 1) });

        // "Electric Air Filter T2" - 12021
        PachinkoRecipes_GT_MultiBlock_3.put(
            12021,
            new ItemStack[] {
                // "Electric Air Filter T2"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12021),
                // "Advanced Air Filter Turbine Casing"
                getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 3),
                // "Advanced Air Filter Vent Casing"
                getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 4) });

        // "Electric Air Filter T3" - 12022
        PachinkoRecipes_GT_MultiBlock_3.put(
            12022,
            new ItemStack[] {
                // "Electric Air Filter T3"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12022),
                // "Super Air Filter Turbine Casing"
                getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 5),
                // "Super Air Filter Vent Casing"
                getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 6) });

        // "Manual Transformer" - 12697
        PachinkoRecipes_GT_MultiBlock_3.put(
            12697,
            new ItemStack[] {
                // "Manual Transformer"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12697),
                // "MV Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 2),
                // "Nickel-Zinc Ferrite Block"
                getModItem(BartWorks.ID, "BW_Machinery_Casings", 1L, 0),
                // "Transformer-Winding Block"
                getModItem(BartWorks.ID, "BW_Machinery_Casings", 1L, 1) });

        // Windmill - 12698
        PachinkoRecipes_GT_MultiBlock_3.put(
            12698,
            new ItemStack[] {
                // Windmill
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12698),
                // "Primitive Kinetic Shaftbox"
                getModItem(BartWorks.ID, "BWRotorBlock", 1L, 0),
                // Bricks
                getModItem(Minecraft.ID, "brick_block", 1L),
                // "Oak Planks"
                getModItem(Minecraft.ID, "planks", 1L, 0),
                // Terracotta
                getModItem(Minecraft.ID, "hardened_clay", 1L) });

        // "Bacterial Vat" - 12712
        PachinkoRecipes_GT_MultiBlock_3.put(
            12712,
            new ItemStack[] {
                // "Bacterial Vat"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12712),
                // "Radio Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12713),
                // "Clean Stainless Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1),

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

        // "Deep Earth Heating Pump" - 12729
        PachinkoRecipes_GT_MultiBlock_3.put(
            12729,
            new ItemStack[] {
                // "Deep Earth Heating Pump"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12729),
                // "Data Access Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 145),
                // "Heat Proof Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 11),
                // "Tungsten Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 81) });

        // "Mega Electric Blast Furnace" - 12730
        PachinkoRecipes_GT_MultiBlock_3.put(
            12730,
            new ItemStack[] {
                // "Mega Electric Blast Furnace"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12730),
                // "Heat Proof Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 11),

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
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 13),

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

        // "Mega Vacuum Freezer" - 12731
        PachinkoRecipes_GT_MultiBlock_3.put(
            12731,
            new ItemStack[] {
                // "Mega Vacuum Freezer"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12731),
                // "Frost Proof Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 1),
                // "Infinity Cooled Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 14) });

        // "Large Naquadah Reactor" - 12732
        PachinkoRecipes_GT_MultiBlock_3.put(
            12732,
            new ItemStack[] {
                // "Large Naquadah Reactor"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12732),
                // "Tungstensteel Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 15),
                // "Radiation Proof Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 12),
                // "Field Restriction Casing"
                getModItem(GoodGenerator.ID, "MAR_Casing", 1L, 0),
                // "Radiation Proof Steel Frame Box"
                getModItem(GoodGenerator.ID, "radiationProtectionSteelFrame", 1L, 0) });

        // "Thorium High Temperature Reactor" - 12733
        PachinkoRecipes_GT_MultiBlock_3.put(
            12733,
            new ItemStack[] {
                // "Thorium High Temperature Reactor"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12733),
                // "Radiation Proof Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 12) });

        // "Electric Implosion Compressor" - 12734
        PachinkoRecipes_GT_MultiBlock_3.put(
            12734,
            new ItemStack[] {
                // "Electric Implosion Compressor"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12734),
                // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0),
                // "Nickel-Zinc Ferrite Block"
                getModItem(BartWorks.ID, "BW_Machinery_Casings", 1L, 0),
                // "Transformer-Winding Block"
                getModItem(BartWorks.ID, "BW_Machinery_Casings", 1L, 1),
                // "Block of Neutronium"
                getModItem(GregTech.ID, "gt.blockmetal5", 1L, 2),
                // "Infinity Block"
                getModItem(Avaritia.ID, "Resource_Block", 1L, 1),
                // "Block of Transcendent Metal"
                getModItem(GregTech.ID, "gt.blockmetal9", 1L, 4),
                // "Block of SpaceTime"
                getModItem(GregTech.ID, "gt.blockmetal9", 1L, 3),
                // "Block of Universium"
                getModItem(GregTech.ID, "gt.blockmetal9", 1L, 8) });

        // "Circuit Assembly Line" - 12735
        PachinkoRecipes_GT_MultiBlock_3.put(
            12735,
            new ItemStack[] {
                // "Circuit Assembly Line"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12735),
                // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0),
                // "Assembly Line Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 5),
                // "Grate Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 10),

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

        // "Mega Distillation Tower" - 12738
        PachinkoRecipes_GT_MultiBlock_3.put(
            12738,
            new ItemStack[] {
                // "Mega Distillation Tower"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12738),
                // "Clean Stainless Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1) });

        // "Void Miner III" - 12739
        PachinkoRecipes_GT_MultiBlock_3.put(
            12739,
            new ItemStack[] {
                // "Void Miner III"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12739),
                // "Mining Neutronium Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 2),
                // "Black Plutonium Item Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings11", 1L, 7),
                // "Adamantium Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 319),
                // "Bolted Iridium Casing"
                getModItem(BartWorks.ID, "bw.werkstoffblockscasing.01", 1L, 31850),
                // "Rebolted Iridium Casing"
                getModItem(BartWorks.ID, "bw.werkstoffblockscasingadvanced.01", 1L, 31850) });

        // "Void Miner II" - 12740
        PachinkoRecipes_GT_MultiBlock_3.put(
            12740,
            new ItemStack[] {
                // "Void Miner II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12740),
                // "Mining Black Plutonium Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 3),
                // "Black Plutonium Item Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings11", 1L, 7),
                // "Naquadah Alloy Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 325),
                // "Bolted Naquadah Alloy Casing"
                getModItem(BartWorks.ID, "bw.werkstoffblockscasing.01", 1L, 32091),
                // "Rebolted Naquadah Alloy Casing"
                getModItem(BartWorks.ID, "bw.werkstoffblockscasingadvanced.01", 1L, 32091) });

        // "Void Miner I" - 12741
        PachinkoRecipes_GT_MultiBlock_3.put(
            12741,
            new ItemStack[] {
                // "Void Miner I"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12741),
                // "Mining Osmiridium Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 14),
                // "Osmiridium Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 317),
                // "Bolted Osmiridium Casing"
                getModItem(BartWorks.ID, "bw.werkstoffblockscasing.01", 1L, 32083),
                // "Rebolted Osmiridium Casing"
                getModItem(BartWorks.ID, "bw.werkstoffblockscasingadvanced.01", 1L, 32083) });

        // "High Temperature Gas-cooled Reactor" - 12791
        PachinkoRecipes_GT_MultiBlock_3.put(
            12791,
            new ItemStack[] {
                // "High Temperature Gas-cooled Reactor"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12791),
                // "Europium Reinforced Radiation Proof Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 5) });

        // "Extreme Industrial Greenhouse" - 12792
        PachinkoRecipes_GT_MultiBlock_3.put(
            12792,
            new ItemStack[] {
                // "Extreme Industrial Greenhouse"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12792),
                // "Clean Stainless Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1),
                // "Purple Lamp"
                getModItem(ProjectRedIllumination.ID, "projectred.illumination.lamp", 1L, 10),
                // "Fertilized Dirt"
                getModItem(RandomThings.ID, "fertilizedDirt", 1L),

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

        // "Research Completer" - 13001
        PachinkoRecipes_GT_MultiBlock_3.put(
            13001,
            new ItemStack[] {
                // "Research Completer"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 13001),
                // "Magical Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 8),
                // "Warded Glass"
                getModItem(Thaumcraft.ID, "blockCosmeticOpaque", 1L, 2) });

        // "Solid-Oxide Fuel Cell Mk I" - 13101
        PachinkoRecipes_GT_MultiBlock_3.put(
            13101,
            new ItemStack[] {
                // "Solid-Oxide Fuel Cell Mk I"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 13101),
                // "Clean Stainless Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1),
                // "Reinforced Glass"
                getModItem(IndustrialCraft2.ID, "blockAlloyGlass", 1L),
                // "YSZ Ceramic Electrolyte Unit"
                getModItem(KekzTech.ID, "kekztech_yszceramicelectrolyteunit_block", 1L) });

        // "Solid-Oxide Fuel Cell Mk II" - 13102
        PachinkoRecipes_GT_MultiBlock_3.put(
            13102,
            new ItemStack[] {
                // "Solid-Oxide Fuel Cell Mk II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 13102),
                // "Robust Tungstensteel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0),
                // "Reinforced Glass"
                getModItem(IndustrialCraft2.ID, "blockAlloyGlass", 1L),
                // "GDC Ceramic Electrolyte Unit"
                getModItem(KekzTech.ID, "kekztech_gdcceramicelectrolyteunit_block", 1L) });

        // T.F.F.T - 13104
        PachinkoRecipes_GT_MultiBlock_3.put(
            13104,
            new ItemStack[] {
                // T.F.F.T
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 13104),
                // "T.F.F.T Casing"
                getModItem(KekzTech.ID, "kekztech_tfftstoragefield_block", 1L, 0),

                // "T.F.F.T Storage Field Block"
                // "T.F.F.T Storage Field Block (Tier I)"
                getModItem(KekzTech.ID, "kekztech_tfftstoragefield_block", 1L, 1),
                // "T.F.F.T Storage Field Block (Tier II)"
                getModItem(KekzTech.ID, "kekztech_tfftstoragefield_block", 1L, 2),
                // "T.F.F.T Storage Field Block (Tier III)"
                getModItem(KekzTech.ID, "kekztech_tfftstoragefield_block", 1L, 3),
                // "T.F.F.T Storage Field Block (Tier IV)"
                getModItem(KekzTech.ID, "kekztech_tfftstoragefield_block", 1L, 4),
                // "T.F.F.T Storage Field Block (Tier V)"
                getModItem(KekzTech.ID, "kekztech_tfftstoragefield_block", 1L, 5),
                // "T.F.F.T Storage Field Block (Tier VI)"
                getModItem(KekzTech.ID, "kekztech_tfftstoragefield_block", 1L, 6),
                // "T.F.F.T Storage Field Block (Tier VII)"
                getModItem(KekzTech.ID, "kekztech_tfftstoragefield_block", 1L, 7),
                // "T.F.F.T Storage Field Block (Tier VII)"
                getModItem(KekzTech.ID, "kekztech_tfftstoragefield_block", 1L, 8),
                // "T.F.F.T Storage Field Block (Tier IX)"
                getModItem(KekzTech.ID, "kekztech_tfftstoragefield_block", 1L, 9),
                // "T.F.F.T Storage Field Block (Tier X)"
                getModItem(KekzTech.ID, "kekztech_tfftstoragefield_block", 1L, 10),

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

        // "Lapotronic Supercapacitor" - 13106
        PachinkoRecipes_GT_MultiBlock_3.put(
            13106,
            new ItemStack[] {
                // "Lapotronic Supercapacitor"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 13106),
                // "Lapotronic Super Capacitor Casing"
                getModItem(KekzTech.ID, "kekztech_lapotronicenergyunit_block", 1L, 0),

                // Capacitor
                // "Empty Capacitor (-)"
                getModItem(KekzTech.ID, "kekztech_lapotronicenergyunit_block", 1L, 6),
                // "Lapotron Capacitor (EV)"
                getModItem(KekzTech.ID, "kekztech_lapotronicenergyunit_block", 1L, 7),
                // "Lapotronic Capacitor (IV)"
                getModItem(KekzTech.ID, "kekztech_lapotronicenergyunit_block", 1L, 1),
                // "Lapotronic Capacitor (LuV)"
                getModItem(KekzTech.ID, "kekztech_lapotronicenergyunit_block", 1L, 2),
                // "Lapotronic Capacitor (ZPM)"
                getModItem(KekzTech.ID, "kekztech_lapotronicenergyunit_block", 1L, 3),
                // "Lapotronic Capacitor (UV)"
                getModItem(KekzTech.ID, "kekztech_lapotronicenergyunit_block", 1L, 4),
                // "Ultimate Capacitor (UHV)"
                getModItem(KekzTech.ID, "kekztech_lapotronicenergyunit_block", 1L, 5),
                // "Extremely Ultimate Capacitor (UEV)"
                getModItem(KekzTech.ID, "kekztech_lapotronicenergyunit_block", 1L, 8),
                // "Insanely Ultimate Capacitor (UIV)"
                getModItem(KekzTech.ID, "kekztech_lapotronicenergyunit_block", 1L, 9),
                // "Mega Ultimate Capacitor (UMV)"
                getModItem(KekzTech.ID, "kekztech_lapotronicenergyunit_block", 1L, 10),

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

        // "Miniature Wormhole Generator" - 13115
        PachinkoRecipes_GT_MultiBlock_3.put(
            13115,
            new ItemStack[] {
                // "Miniature Wormhole Generator"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 13115),
                // "Fusion Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 7),
                // "Europium Reinforced Radiation Proof Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 5),
                // "High Power Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 0),
                // "Molecular Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 4),

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

        // "Mega Chemical Reactor" - 13366
        PachinkoRecipes_GT_MultiBlock_3.put(
            13366,
            new ItemStack[] {
                // "Mega Chemical Reactor"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 13366),
                // "Fusion Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 7),
                // "Chemically Inert Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 0),
                // "PTFE Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 1),

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

        // "Mega Oil Cracker" - 13367
        PachinkoRecipes_GT_MultiBlock_3.put(
            13367,
            new ItemStack[] {
                // "Mega Oil Cracker"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 13367),
                // "Clean Stainless Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1),

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
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 13),

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

        // "Advanced Assembly Line" - 13532
        PachinkoRecipes_GT_MultiBlock_3.put(
            13532,
            new ItemStack[] {
                // "Advanced Assembly Line"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 13532),
                // "Data Access Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 145),
                // "Advanced Data Access Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 146),
                // "Automatable Data Access Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 147),
                // "Assembly line Reception Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15442),
                // "Wireless Assembly line Reception Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15446),
                // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0),
                // "Assembly Line Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 5),
                // "Assembler Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 9),
                // "Grate Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 10),

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

        // "Dyson Swarm Ground Unit" - 14001
        PachinkoRecipes_GT_MultiBlock_3.put(
            14001,
            new ItemStack[] {
                // "Dyson Swarm Ground Unit"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14001),
                // "Optical Reception Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15440),
                // "Awakened Draconium Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 8),
                // "Hermetic Casing X"
                getModItem(GregTech.ID, "gt.blockcasings6", 1L, 10),
                // "Titanium Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 28),
                // "HSS-S Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 374),
                // "Superconductor Base UHV Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 985),
                // "Dyson Swarm Energy Receiver Base Casing"
                getModItem(GTNHIntergalactic.ID, "dysonswarmparts", 1L, 0),
                // "Dyson Swarm Energy Receiver Dish Block"
                getModItem(GTNHIntergalactic.ID, "dysonswarmparts", 1L, 1),
                // "Dyson Swarm Module Deployment Unit Base Casing"
                getModItem(GTNHIntergalactic.ID, "dysonswarmparts", 1L, 2),
                // "Dyson Swarm Module Deployment Unit Core"
                getModItem(GTNHIntergalactic.ID, "dysonswarmparts", 1L, 3),
                // "Dyson Swarm Module Deployment Unit Superconducting Magnet"
                getModItem(GTNHIntergalactic.ID, "dysonswarmparts", 1L, 4),
                // "Dyson Swarm Control Center Base Casing"
                getModItem(GTNHIntergalactic.ID, "dysonswarmparts", 1L, 5),
                // "Dyson Swarm Control Center Primary Windings"
                getModItem(GTNHIntergalactic.ID, "dysonswarmparts", 1L, 6),
                // "Dyson Swarm Control Center Secondary Windings"
                getModItem(GTNHIntergalactic.ID, "dysonswarmparts", 1L, 7),
                // "Dyson Swarm Control Center Toroid Casing"
                getModItem(GTNHIntergalactic.ID, "dysonswarmparts", 1L, 8),
                // "Ultra High Strength Concrete Floor"
                getModItem(GTNHIntergalactic.ID, "dysonswarmparts", 1L, 9) });

        // "Planetary Gas Siphon" - 14002
        PachinkoRecipes_GT_MultiBlock_3.put(
            14002,
            new ItemStack[] {
                // "Planetary Gas Siphon"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14002),
                // "Tungstensteel Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 316),
                // "Planetary Siphon Casing"
                getModItem(GTNHIntergalactic.ID, "gassiphoncasing", 1L),
                // "Rebolted Rhodium-Plated Palladium Casing"
                getModItem(BartWorks.ID, "bw.werkstoffblockscasingadvanced.01", 1L, 88) });

        // "Space Elevator" - 14003
        PachinkoRecipes_GT_MultiBlock_3.put(
            14003,
            new ItemStack[] {
                // "Space Elevator"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14003),
                // "Uncertainty Resolver X"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15431),
                // "Optical Reception Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15440),
                // "Optical Transmission Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15441),
                // "Cloud Computation Client Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15445),
                // "Neutronium Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 129),
                // "Space Elevator Cable"
                getModItem(GTNHIntergalactic.ID, "spaceelevatorcable", 1L),
                // "Ultra High Strength Concrete Floor"
                getModItem(GTNHIntergalactic.ID, "dysonswarmparts", 1L, 9),
                // "Space Elevator Base Casing"
                getModItem(GTNHIntergalactic.ID, "gt.blockcasingsSE", 1L, 0),
                // "Space Elevator Support Structure"
                getModItem(GTNHIntergalactic.ID, "gt.blockcasingsSE", 1L, 1),
                // "Space Elevator Internal Structure"
                getModItem(GTNHIntergalactic.ID, "gt.blockcasingsSE", 1L, 2),

                // "Space Elevator Motor"
                // "Space Elevator Motor MK-I"
                getModItem(GTNHIntergalactic.ID, "gt.blockcasingsSEMotor", 1L, 0),
                // "Space Elevator Motor MK-II"
                getModItem(GTNHIntergalactic.ID, "gt.blockcasingsSEMotor", 1L, 1),
                // "Space Elevator Motor MK-III"
                getModItem(GTNHIntergalactic.ID, "gt.blockcasingsSEMotor", 1L, 2),
                // "Space Elevator Motor MK-IV"
                getModItem(GTNHIntergalactic.ID, "gt.blockcasingsSEMotor", 1L, 3),
                // "Space Elevator Motor MK-V"
                getModItem(GTNHIntergalactic.ID, "gt.blockcasingsSEMotor", 1L, 4),

                // "Space Module"
                // "Space Assembler Module MK-I"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14004),
                // "Space Assembler Module MK-II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14005),
                // "Space Assembler Module MK-III"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14006),
                // "Space Mining Module MK-I"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14007),
                // "Space Mining Module MK-II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14008),
                // "Space Mining Module MK-III"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14009),
                // "Space Pumping Module MK-I"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14010),
                // "Space Pumping Module MK-II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14011),
                // "Space Pumping Module MK-III"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14014) });

        // "Large Molecular Assembler" - 14101
        PachinkoRecipes_GT_MultiBlock_3.put(
            14101,
            new ItemStack[] {
                // "Large Molecular Assembler"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14101),
                // "Robust Tungstensteel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0),
                // "Vibrant Quartz Glass"
                getModItem(AppliedEnergistics2.ID, "tile.BlockQuartzLamp", 1L) });

        // "Extreme Entity Crusher" - 14201
        PachinkoRecipes_GT_MultiBlock_3.put(
            14201,
            new ItemStack[] {
                // "Extreme Entity Crusher"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14201),
                // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0),
                // "Steel Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 305),
                // "Diamond Spike"
                getModItem(ExtraUtilities.ID, "spike_base_diamond", 1L),

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

        // "Industrial Apicultural Acclimatiser and Drone Domestication Station" - 14202
        PachinkoRecipes_GT_MultiBlock_3.put(
            14202,
            new ItemStack[] {
                // "Industrial Apicultural Acclimatiser and Drone Domestication Station"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14202),
                // "Bronze Plated Bricks"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 10),
                // Apiary
                getModItem(Forestry.ID, "apiculture", 1L, 0),
                // Alveary
                getModItem(Forestry.ID, "alveary", 1L, 0),
                // "Alveary Fan"
                getModItem(Forestry.ID, "alveary", 1L, 3),
                // "Alveary Heater"
                getModItem(Forestry.ID, "alveary", 1L, 4),
                // "Alveary Hygroregulator"
                getModItem(Forestry.ID, "alveary", 1L, 5),
                // "Alveary Stabiliser"
                getModItem(Forestry.ID, "alveary", 1L, 6),
                // Dirt
                getModItem(Minecraft.ID, "dirt", 1L, 0),
                // "Oak Planks"
                getModItem(Minecraft.ID, "planks", 1L, 0),
                // "Oak Slab"
                getModItem(Minecraft.ID, "wooden_slab", 1L, 0),

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

        // "Active Transformer" - 15300
        PachinkoRecipes_GT_MultiBlock_3.put(
            15300,
            new ItemStack[] {
                // "Active Transformer"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15300),
                // "Superconducting Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 15),
                // "High Power Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 0) });

        // "Weighted Network Switch With QoS" - 15310
        PachinkoRecipes_GT_MultiBlock_3.put(
            15310,
            new ItemStack[] {
                // "Weighted Network Switch With QoS"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15310),
                // "Optical Reception Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15440),
                // "Optical Transmission Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15441),
                // "Cloud Computation Server Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15444),
                // "Computer Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 1),
                // "Advanced Computer Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 3) });

        // "Quantum Computer" - 15311
        PachinkoRecipes_GT_MultiBlock_3.put(
            15311,
            new ItemStack[] {
                // "Quantum Computer"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15311),
                // "Uncertainty Resolver X"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15431),
                // "Optical Reception Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15440),
                // "Optical Transmission Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15441),
                // "Cloud Computation Server Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15444),
                // "Computer Rack"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15450),
                // "Computer Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 1),
                // "Computer Heat Vent"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 2),
                // "Advanced Computer Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 3) });

        // "Microwave Grinder" - 15312
        PachinkoRecipes_GT_MultiBlock_3.put(
            15312,
            new ItemStack[] {
                // "Microwave Grinder"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15312),
                // "Clean Stainless Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1) });

        // "Data Bank" - 15313
        PachinkoRecipes_GT_MultiBlock_3.put(
            15313,
            new ItemStack[] {
                // "Data Bank"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15313),
                // "Data Access Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 145),
                // "Advanced Data Access Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 146),
                // "Automatable Data Access Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 147),
                // "Assembly line Reception Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15442),
                // "Data Bank Transmission Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15443),
                // "Wireless Data Bank Transmission Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15447),
                // "High Power Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 0),
                // "Computer Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 1),
                // "Computer Heat Vent"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 2) });

        // "Tesla Tower" - 15314
        PachinkoRecipes_GT_MultiBlock_3.put(
            15314,
            new ItemStack[] {
                // "Tesla Tower"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15314),
                // "Capacitor Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15452),
                // "Titanium Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 28),
                // "Tesla Base Casing"
                getModItem(TecTech.ID, "gt.blockcasingsBA0", 1L, 6),
                // "Tesla Toroid Casing"
                getModItem(TecTech.ID, "gt.blockcasingsBA0", 1L, 7),
                // "Tesla Secondary Windings"
                getModItem(TecTech.ID, "gt.blockcasingsBA0", 1L, 8),

                // "Primary Tesla Windings"
                // "Redstone Alloy Primary Tesla Windings"
                getModItem(TecTech.ID, "gt.blockcasingsBA0", 1L, 0),
                // "MV Superconductor Primary Tesla Windings"
                getModItem(TecTech.ID, "gt.blockcasingsBA0", 1L, 1),
                // "HV Superconductor Primary Tesla Windings"
                getModItem(TecTech.ID, "gt.blockcasingsBA0", 1L, 2),
                // "EV Superconductor Primary Tesla Windings"
                getModItem(TecTech.ID, "gt.blockcasingsBA0", 1L, 3),
                // "IV Superconductor Primary Tesla Windings"
                getModItem(TecTech.ID, "gt.blockcasingsBA0", 1L, 4),
                // "LuV Superconductor Primary Tesla Windings"
                getModItem(TecTech.ID, "gt.blockcasingsBA0", 1L, 5),
                // "ZPM Superconductor Primary Tesla Windings"
                getModItem(TecTech.ID, "gt.blockcasingsBA0", 1L, 9) });

        // "Static Network Switch With QoS" - 15315
        PachinkoRecipes_GT_MultiBlock_3.put(
            15315,
            new ItemStack[] {
                // "Static Network Switch With QoS"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15315),
                // "Optical Reception Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15440),
                // "Optical Transmission Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15441),
                // "Cloud Computation Server Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15444),
                // "Computer Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 1),
                // "Advanced Computer Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 3) });

        // "Research Station" - 15331
        PachinkoRecipes_GT_MultiBlock_3.put(
            15331,
            new ItemStack[] {
                // "Research Station"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15331),
                // "Optical Reception Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15440),
                // "Optical Transmission Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15441),
                // "Cloud Computation Server Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15444),
                // "Computer Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 1),
                // "Advanced Computer Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 3) });

        // "Energy Infuser" - 15350
        PachinkoRecipes_GT_MultiBlock_3.put(
            15350,
            new ItemStack[] {
                // "Energy Infuser"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15350),
                // "High Power Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 0),
                // "Molecular Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 4),
                // "Molecular Coil"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 7) });

        // "Eye of Harmony" - 15410
        PachinkoRecipes_GT_MultiBlock_3.put(
            15410,
            new ItemStack[] {
                // "Eye of Harmony"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15410),
                // "Reinforced Temporal Structure Casing"
                getModItem(TecTech.ID, "gt.blockcasingsBA0", 1L, 10),
                // "Reinforced Spatial Structure Casing"
                getModItem(TecTech.ID, "gt.blockcasingsBA0", 1L, 11),
                // "Infinite Spacetime Energy Boundary Casing"
                getModItem(TecTech.ID, "gt.blockcasingsBA0", 1L, 12),

                // "Time Dilation Field Generator"
                // "Crude Time Dilation Field Generator"
                getModItem(TecTech.ID, "gt.time_acceleration_field_generator", 1L, 0),
                // "Primitive Time Dilation Field Generator"
                getModItem(TecTech.ID, "gt.time_acceleration_field_generator", 1L, 1),
                // "Stable Time Dilation Field Generator"
                getModItem(TecTech.ID, "gt.time_acceleration_field_generator", 1L, 2),
                // "Advanced Time Dilation Field Generator"
                getModItem(TecTech.ID, "gt.time_acceleration_field_generator", 1L, 3),
                // "Superb Time Dilation Field Generator"
                getModItem(TecTech.ID, "gt.time_acceleration_field_generator", 1L, 4),
                // "Exotic Time Dilation Field Generator"
                getModItem(TecTech.ID, "gt.time_acceleration_field_generator", 1L, 5),
                // "Perfect Time Dilation Field Generator"
                getModItem(TecTech.ID, "gt.time_acceleration_field_generator", 1L, 6),
                // "Tipler Time Dilation Field Generator"
                getModItem(TecTech.ID, "gt.time_acceleration_field_generator", 1L, 7),
                // "Gallifreyan Time Dilation Field Generator"
                getModItem(TecTech.ID, "gt.time_acceleration_field_generator", 1L, 8),

                // "Spacetime Compression Field Generator"
                // "Crude Spacetime Compression Field Generator"
                getModItem(TecTech.ID, "gt.spacetime_compression_field_generator", 1L, 0),
                // "Primitive Spacetime Compression Field Generator"
                getModItem(TecTech.ID, "gt.spacetime_compression_field_generator", 1L, 1),
                // "Stable Spacetime Compression Field Generator"
                getModItem(TecTech.ID, "gt.spacetime_compression_field_generator", 1L, 2),
                // "Advanced Spacetime Compression Field Generator"
                getModItem(TecTech.ID, "gt.spacetime_compression_field_generator", 1L, 3),
                // "Superb Spacetime Compression Field Generator"
                getModItem(TecTech.ID, "gt.spacetime_compression_field_generator", 1L, 4),
                // "Exotic Spacetime Compression Field Generator"
                getModItem(TecTech.ID, "gt.spacetime_compression_field_generator", 1L, 5),
                // "Perfect Spacetime Compression Field Generator"
                getModItem(TecTech.ID, "gt.spacetime_compression_field_generator", 1L, 6),
                // "Tipler Spacetime Compression Field Generator"
                getModItem(TecTech.ID, "gt.spacetime_compression_field_generator", 1L, 7),
                // "Gallifreyan Spacetime Compression Field Generator"
                getModItem(TecTech.ID, "gt.spacetime_compression_field_generator", 1L, 8),

                // "Stabilisation Field Generator"
                // "Crude Stabilisation Field Generator"
                getModItem(TecTech.ID, "gt.stabilisation_field_generator", 1L, 0),
                // "Primitive Stabilisation Field Generator"
                getModItem(TecTech.ID, "gt.stabilisation_field_generator", 1L, 1),
                // "Stable Stabilisation Field Generator"
                getModItem(TecTech.ID, "gt.stabilisation_field_generator", 1L, 2),
                // "Advanced Stabilisation Field Generator"
                getModItem(TecTech.ID, "gt.stabilisation_field_generator", 1L, 3),
                // "Superb Stabilisation Field Generator"
                getModItem(TecTech.ID, "gt.stabilisation_field_generator", 1L, 4),
                // "Exotic Stabilisation Field Generator"
                getModItem(TecTech.ID, "gt.stabilisation_field_generator", 1L, 5),
                // "Perfect Stabilisation Field Generator"
                getModItem(TecTech.ID, "gt.stabilisation_field_generator", 1L, 6),
                // "Tipler Stabilisation Field Generator"
                getModItem(TecTech.ID, "gt.stabilisation_field_generator", 1L, 7),
                // "Gallifreyan Stabilisation Field Generator"
                getModItem(TecTech.ID, "gt.stabilisation_field_generator", 1L, 8) });

        // "Forge of the Gods" - 15411
        PachinkoRecipes_GT_MultiBlock_3.put(
            15411,
            new ItemStack[] {
                // "Forge of the Gods"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15411),
                // "Singularity Reinforced Stellar Shielding Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 0),
                // "Celestial Matter Guidance Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 1),
                // "Boundless Gravitationally Severed Structure Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 2),
                // "Transcendentally Amplified Magnetic Confinement Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 3),
                // "Stellar Energy Siphon Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 4),
                // "Remote Graviton Flow Modulator"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 5),
                // "Medial Graviton Flow Modulator"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 6),
                // "Central Graviton Flow Modulator"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 7),
                // "Spatially Transcendent Gravitational Lens Block"
                getModItem(TecTech.ID, "tile.spatiallyTranscendentGravitationalLens", 1L),

                // "Helioflare Power Forge" - 15412
                // "Helioflare Power Forge"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15412),
                // "Hypogen Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 12),
                // "Singularity Reinforced Stellar Shielding Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 0),
                // "Celestial Matter Guidance Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 1),
                // "Boundless Gravitationally Severed Structure Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 2),
                // "Transcendentally Amplified Magnetic Confinement Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 3),
                // "Stellar Energy Siphon Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 4),

                // "Helioflux Melting Core" - 14513
                // "Helioflux Melting Core"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14513),
                // "Singularity Reinforced Stellar Shielding Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 0),
                // "Celestial Matter Guidance Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 1),
                // "Boundless Gravitationally Severed Structure Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 2),
                // "Transcendentally Amplified Magnetic Confinement Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 3),
                // "Stellar Energy Siphon Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 4),
                // "Harmonic Phonon Transmission Conduit"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 8),

                // "Heliothermal Plasma Fabricator" - 14514
                // "Heliothermal Plasma Fabricator"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14514),
                // "Singularity Reinforced Stellar Shielding Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 0),
                // "Celestial Matter Guidance Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 1),
                // "Boundless Gravitationally Severed Structure Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 2),
                // "Transcendentally Amplified Magnetic Confinement Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 3),
                // "Stellar Energy Siphon Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 4),
                // "Harmonic Phonon Transmission Conduit"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 8),

                // "Heliofusion Exoticizer" - 14515
                // "Heliofusion Exoticizer"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14515),
                // "Singularity Reinforced Stellar Shielding Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 0),
                // "Celestial Matter Guidance Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 1),
                // "Boundless Gravitationally Severed Structure Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 2),
                // "Transcendentally Amplified Magnetic Confinement Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 3),
                // "Stellar Energy Siphon Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 4),
                // "Harmonic Phonon Transmission Conduit"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 8) });

        // "Entropic Processor" - 15750
        PachinkoRecipes_GT_MultiBlock_3.put(
            15750,
            new ItemStack[] {
                // "Entropic Processor"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15750),
                // "Alchemically Resistant Thaumium Casing"
                getModItem(GregTech.ID, "gt.blockcasings12", 1L, 10),
                // "Alchemically Inert Void Casing"
                getModItem(GregTech.ID, "gt.blockcasings12", 1L, 11),
                // "Alchemically Immune Ichorium Casing"
                getModItem(GregTech.ID, "gt.blockcasings12", 1L, 12),
                // "Warded Glass"
                getModItem(Thaumcraft.ID, "blockCosmeticOpaque", 1L, 2),
                // "Advanced Alchemical Construct"
                getModItem(Thaumcraft.ID, "blockMetalDevice", 1L, 3),
                // "Alchemical Construct"
                getModItem(Thaumcraft.ID, "blockMetalDevice", 1L, 9) });

        // "Decay Warehouse" - 15751
        PachinkoRecipes_GT_MultiBlock_3.put(
            15751,
            new ItemStack[] {
                // "Decay Warehouse"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15751),
                // "Radiation Proof Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 12),

                // Chest
                // "Super Chest I"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 135),
                // "Super Chest II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 136),
                // "Super Chest III"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 137),
                // "Super Chest IV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 138),
                // "Super Chest V"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 139),
                // "Quantum Chest I"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 125),
                // "Quantum Chest II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 126),
                // "Quantum Chest III"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 127),
                // "Quantum Chest IV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 128) });

        // "Naquadah Fuel Refinery" - 16999
        PachinkoRecipes_GT_MultiBlock_3.put(
            16999,
            new ItemStack[] {
                // "Naquadah Fuel Refinery"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 16999),
                // "Naquadah Fuel Refinery Casing"
                getModItem(GoodGenerator.ID, "FRF_Casings", 1L, 0),
                // "Field Restriction Glass"
                getModItem(GoodGenerator.ID, "fieldRestrictingGlass", 1L, 0),
                // "Field Restriction Coil"
                getModItem(GoodGenerator.ID, "FRF_Coil_1", 1L, 0),
                // "Advanced Field Restriction Coil"
                getModItem(GoodGenerator.ID, "FRF_Coil_2", 1L, 0),
                // "Ultimate Field Restriction Coil"
                getModItem(GoodGenerator.ID, "FRF_Coil_3", 1L, 0),
                // "Temporal Field Restriction Coil"
                getModItem(GoodGenerator.ID, "FRF_Coil_4", 1L, 0) });

        // "Hydro Dam" - 17000
        PachinkoRecipes_GT_MultiBlock_3.put(
            17000,
            new ItemStack[] {
                // "Hydro Dam"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17000),
                // "Light Concrete"
                getModItem(GregTech.ID, "gt.blockconcretes", 1L, 8) });

        // "Hydro Pump" - 17003
        PachinkoRecipes_GT_MultiBlock_3.put(
            17003,
            new ItemStack[] {
                // "Hydro Pump (MV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17003),
                // "Frost Proof Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 1),
                // "Hydro Pump (HV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17004),
                // "Clean Stainless Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1),
                // "Hydro Pump (EV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17005),
                // "Stable Titanium Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2),
                // "Hydro Pump (IV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17006),
                // "Robust Tungstensteel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0),
                // "Hydro Pump (LuV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17007),
                // "Advanced Rhodium Plated Palladium Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 6),
                // "Hydro Pump (ZPM)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17008),
                // "Hydro Pump (ZPM)"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 7),
                // "Hydro Pump (UV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17009),
                // "Mining Osmiridium Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 14) });

        // "Hydro Turbine" - 17019
        PachinkoRecipes_GT_MultiBlock_3.put(
            17019,
            new ItemStack[] {
                // "Hydro Turbine (MV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17019),
                // "Frost Proof Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 1),
                // "Hydro Turbine (HV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17020),
                // "Clean Stainless Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1),
                // "Hydro Turbine (EV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17021),
                // "Stable Titanium Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2),
                // "Hydro Turbine (IV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17022),
                // "Robust Tungstensteel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0),
                // "Hydro Turbine (LuV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17023),
                // "Advanced Rhodium Plated Palladium Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 6),
                // "Hydro Turbine (ZPM)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17024),
                // "Hydro Pump (ZPM)"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 7),
                // "Hydro Turbine (UV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17025),
                // "Mining Osmiridium Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 14) });
    }
}
