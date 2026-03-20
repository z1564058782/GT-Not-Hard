package Recipes.SingularityRecipes_Pachinko;

import static gregtech.api.enums.Mods.AppliedEnergistics2;
import static gregtech.api.enums.Mods.Avaritia;
import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.BloodArsenal;
import static gregtech.api.enums.Mods.Botania;
import static gregtech.api.enums.Mods.Chisel;
import static gregtech.api.enums.Mods.EnderIO;
import static gregtech.api.enums.Mods.ExtraUtilities;
import static gregtech.api.enums.Mods.Forestry;
import static gregtech.api.enums.Mods.GTNHIntergalactic;
import static gregtech.api.enums.Mods.GTNHLanthanides;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GoodGenerator;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.IndustrialCraft2;
import static gregtech.api.enums.Mods.KekzTech;
import static gregtech.api.enums.Mods.KubaTech;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.Mods.ProjectRedIllumination;
import static gregtech.api.enums.Mods.Railcraft;
import static gregtech.api.enums.Mods.RandomThings;
import static gregtech.api.enums.Mods.TecTech;
import static gregtech.api.enums.Mods.Thaumcraft;
import static gregtech.api.enums.Mods.ThaumicBases;
import static gregtech.api.util.GTModHandler.getModItem;

import net.minecraft.item.ItemStack;

public class GT_Machine {

    // Shared Blocks
    // Coil Block
    public static final ItemStack[] Coil_Block = new ItemStack[] {
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
        getModItem(GregTech.ID, "gt.blockcasings5", 1L, 13) };

    // Glass Block
    public static final ItemStack[] Glass_Block = new ItemStack[] {
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
        // "Quite Clear Glass"
        getModItem(EnderIO.ID, "blockFusedQuartz", 1L, 1),
        // "Warded Glass"
        getModItem(Thaumcraft.ID, "blockCosmeticOpaque", 1L, 2),
        // "Chemical Grade Glass"
        getModItem(GregTech.ID, "gt.blockglass1", 1L, 0),
        // "Tinted Industrial Glass (White)"
        getModItem(GregTech.ID, "gt.blocktintedglass", 1L, 0),
        // "Tinted Industrial Glass (Light Gray)"
        getModItem(GregTech.ID, "gt.blocktintedglass", 1L, 1),
        // "Tinted Industrial Glass (Gray)"
        getModItem(GregTech.ID, "gt.blocktintedglass", 1L, 2),
        // "Tinted Industrial Glass (Black)"
        getModItem(GregTech.ID, "gt.blocktintedglass", 1L, 3),
        // "Reinforced Glass"
        getModItem(IndustrialCraft2.ID, "blockAlloyGlass", 1L),
        // "Blood Stained Glass"
        getModItem(BloodArsenal.ID, "blood_stained_glass", 1L),
        // Managlass
        getModItem(Botania.ID, "manaGlass", 1L),
        // "Thorium Yttrium Glass Block"
        getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 12),
        // Alfglass
        getModItem(Botania.ID, "elfGlass", 1L),
        // "Bifrost Block"
        getModItem(Botania.ID, "bifrostPerm", 1L),
        // "Quantum Glass"
        getModItem(TecTech.ID, "tile.quantumGlass", 1L),
        // "Electron-Permeable Neutronium Coated Glass"
        getModItem(GregTech.ID, "gt.blockglass1", 1L, 1),
        // "Omni-Purpose Infinity Fused Glass"
        getModItem(GregTech.ID, "gt.blockglass1", 1L, 2),
        // "Non-Photonic Matter Exclusion Glass"
        getModItem(GregTech.ID, "gt.blockglass1", 1L, 3),
        // "Hawking Radiation Realignment Focus"
        getModItem(GregTech.ID, "gt.blockglass1", 1L, 4),
        // "Spatially Transcendent Gravitational Lens Block"
        getModItem(TecTech.ID, "tile.spatiallyTranscendentGravitationalLens", 1L),
        // "Antimatter Containment Casing"
        getModItem(GoodGenerator.ID, "antimatterContainmentCasing", 1L, 0),
        // "Nanite Shielding Glass"
        getModItem(GregTech.ID, "gt.blockglass1", 1L, 5) };

    // Item Pipe Casing
    public static final ItemStack[] Item_Pipe_Casing = new ItemStack[] {
        // "Tin Item Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings11", 1L, 0),
        // "Brass Item Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings11", 1L, 1),
        // "Electrum Item Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings11", 1L, 2),
        // "Platinum Item Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings11", 1L, 3),
        // "Osmium Item Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings11", 1L, 4),
        // "Quantium Item Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings11", 1L, 5),
        // "Fluxed Electrum Item Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings11", 1L, 6),
        // "Black Plutonium Item Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings11", 1L, 7) };

    // Machine Casing
    public static final ItemStack[] Machine_Casing = new ItemStack[] {
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
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 9) };

    // "Bricked Blast Furnace" - 140
    public static final ItemStack[] Bricked_Blast_Furnace = new ItemStack[] {
        // "Bricked Blast Furnace"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 140),
        // Firebricks
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 15) };

    // "Fluid Drilling Rig II" - 141
    public static final ItemStack[] Fluid_Drilling_RigII = new ItemStack[] {
        // "Fluid Drilling Rig II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 141),
        // "Clean Stainless Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1),
        // "Stainless Steel Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 306) };

    // "Fluid Drilling Rig III" - 142
    public static final ItemStack[] Fluid_Drilling_RigIII = new ItemStack[] {
        // "Fluid Drilling Rig III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 142),
        // "Stable Titanium Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2),
        // "Titanium Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 28) };

    // "Concrete Backfiller" - 143
    public static final ItemStack[] Concrete_Backfiller = new ItemStack[] {
        // "Concrete Backfiller"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 143),
        // "Solid Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0),
        // "Steel Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 305) };

    // "Advanced Concrete Backfiller" - 144
    public static final ItemStack[] Advanced_Concrete_Backfiller = new ItemStack[] {
        // "Advanced Concrete Backfiller"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 144),
        // "Stable Titanium Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2),
        // "Titanium Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 28) };

    // "Infinite Fluid Drilling Rig" - 148
    public static final ItemStack[] Infinite_Fluid_Drilling_Rig = new ItemStack[] {
        // "Infinite Fluid Drilling Rig"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 148),
        // "Mining Neutronium Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 2),
        // "Neutronium Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 129) };

    // "Fluid Drilling Rig IV" - 149
    public static final ItemStack[] Fluid_Drilling_RigIV = new ItemStack[] {
        // "Fluid Drilling Rig IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 149),
        // "Robust Tungstensteel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0),
        // "Tungstensteel Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 316) };

    // "PCB Factory" - 356
    public static final ItemStack[] PCB_Factory = new ItemStack[] {
        // "PCB Factory"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 356),
        // "Nanite Containment Bus"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9415),
        // "Superconducting Coil Block"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 15),
        // "Tungstensteel Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 15),
        // "Grate Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings3", 1L, 10),
        // "Clean Stainless Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1),
        // "Extreme Engine Intake Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 4),
        // "Radiant Naquadah Alloy Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 10),
        // "Basic Photolithographic Framework Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 11),
        // "Reinforced Photolithographic Framework Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 12),
        // "Radiation Proof Photolithographic Framework Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 13),
        // "Infinity Cooled Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 14),
        // "Americium Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 103),
        // "Duranium Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 328),
        // "Damascus Steel Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 335),
        // "Vibrant Alloy Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 367),
        // "Plascrete Block"
        getModItem(GregTech.ID, "gt.blockreinforced", 1L, 2) };

    // "Nano Forge" - 357
    public static final ItemStack[] Nano_Forge = new ItemStack[] {
        // "Nano Forge"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 357),
        // "Assembly Line Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 5),
        // "Europium Reinforced Radiation Proof Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 5),
        // "Radiant Naquadah Alloy Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 10),
        // "Precision Field Sync Casing"
        getModItem(GregTech.ID, "gt.blockcasings13", 1L, 5),
        // "Magnetic Anchor Casing"
        getModItem(GregTech.ID, "gt.blockcasings13", 1L, 6),
        // "Field Energy Absorber Casing"
        getModItem(GregTech.ID, "gt.blockcasings13", 1L, 7),
        // "Loadbearing Distribution Casing"
        getModItem(GregTech.ID, "gt.blockcasings13", 1L, 8),
        // "Nanite Replication Framework"
        getModItem(GregTech.ID, "gt.blockcasings13", 1L, 9),
        // "Magmatter Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 143),
        // "Stellar Alloy Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 405),
        // "White Dwarf Matter Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 585),
        // "Black Dwarf Matter Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 586),
        // "Nanite Shielding Glass"
        getModItem(GregTech.ID, "gt.blockglass1", 1L, 5) };

    // "Magnetic Flux Exhibitor" - 358
    public static final ItemStack[] Magnetic_Flux_Exhibitor = new ItemStack[] {
        // "Magnetic Flux Exhibitor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 358),
        // "Electromagnet Housing"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 359),
        // "MagTech Casing"
        getModItem(GregTech.ID, "gt.blockcasings10", 1L, 0),
        // "Magnetic Neodymium Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 356) };

    // "TurboCan Pro" - 360
    public static final ItemStack[] TurboCan_Pro = new ItemStack[] {
        // "TurboCan Pro"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 360),
        // "Solid Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0),
        // "Steel Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 13) };

    // "Fluid Shaper" - 366
    public static final ItemStack[] Fluid_Shaper = new ItemStack[] {
        // "Fluid Shaper"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 366),
        // "Heat Proof Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 11),
        // "Clean Stainless Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1),
        // "Solidifier Casing"
        getModItem(GregTech.ID, "gt.blockcasings10", 1L, 13),
        // "Solidifier Radiator"
        getModItem(GregTech.ID, "gt.blockcasings10", 1L, 14) };

    // "Solar Factory" - 367
    public static final ItemStack[] Solar_Factory = new ItemStack[] {
        // "Solar Factory"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 367),
        // "Robust Tungstensteel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0),
        // "Clean Stainless Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1),
        // "Advanced Iridium Plated Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 7),
        // "Black Plutonium Item Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings11", 1L, 7),
        // "Tungsten Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 81),
        // "Damascus Steel Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 335),
        // "Precise Electronic Unit Casing MK-II"
        getModItem(GoodGenerator.ID, "preciseUnitCasing", 1L, 1),
        // "Precise Electronic Unit Casing MK-III"
        getModItem(GoodGenerator.ID, "preciseUnitCasing", 1L, 2),
        // "Precise Electronic Unit Casing MK-IV"
        getModItem(GoodGenerator.ID, "preciseUnitCasing", 1L, 3) };

    // "Industrial Precision Lathe" - 686
    public static final ItemStack[] Industrial_Precision_Lathe = new ItemStack[] {
        // "Industrial Precision Lathe"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 686),
        // "Solid Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0),
        // "Grate Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings3", 1L, 10) };

    // "Industrial Autoclave" - 687
    public static final ItemStack[] Industrial_Autoclave = new ItemStack[] {
        // "Industrial Autoclave"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 687),
        // "Pressure Containment Casing"
        getModItem(GregTech.ID, "gt.blockcasings10", 1L, 3),
        // "Polytetrafluoroethylene Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 473) };

    // "Nuclear Salt Processing Plant" -749
    public static final ItemStack[] Nuclear_Salt_Processing_Plant = new ItemStack[] {
        // "Nuclear Salt Processing Plant"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 749),
        // "Thermally Insulated Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 8),
        // "IV Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 5) };

    // "Thorium Reactor [LFTR]" - 751
    public static final ItemStack[] Thorium_Reactor_LFTR = new ItemStack[] {
        // "Thorium Reactor [LFTR]"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 751),
        // "Hastelloy-N Reactor Casing"
        getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 12),
        // "Reactor Shield Casing"
        getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 13) };

    // "Industrial Centrifuge" - 790
    public static final ItemStack[] Industrial_Centrifuge = new ItemStack[] {
        // "Industrial Centrifuge"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 790),
        // "Centrifuge Casing"
        getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 0) };

    // "Industrial Coke Oven" - 791
    public static final ItemStack[] Industrial_Coke_Oven = new ItemStack[] {
        // "Industrial Coke Oven"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 791),
        // "Structural Coke Oven Casing"
        getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 1),
        // "Heat Resistant Coke Oven Casing"
        getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 2),
        // "Heat Proof Coke Oven Casing"
        getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 3) };

    // "Industrial Material Press" - 792
    public static final ItemStack[] Industrial_Material_Press = new ItemStack[] {
        // "Industrial Material Press"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 792),
        // "Material Press Machine Casing"
        getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 4) };

    // "Industrial Electrolyzer" - 796
    public static final ItemStack[] Industrial_Electrolyzer = new ItemStack[] {
        // "Industrial Electrolyzer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 796),
        // "Electrolyzer Casing"
        getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 5) };

    // "Industrial Maceration Stack" - 797
    public static final ItemStack[] Industrial_Maceration_Stack = new ItemStack[] {
        // "Industrial Maceration Stack"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 797),
        // "Stable Titanium Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2),
        // "Maceration Stack Casing"
        getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 7),
        // "Maceration Upgrade Chip"
        getModItem(GTPlusPlus.ID, "MU-metaitem.01", 1L, 32152) };

    // "Industrial Wire Factory" - 798
    public static final ItemStack[] Industrial_Wire_Factory = new ItemStack[] {
        // "Industrial Wire Factory"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 798),
        // "Wire Factory Casing"
        getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 6) };

    // "Matter Fabrication CPU" - 799
    public static final ItemStack[] Matter_Fabrication_CPU = new ItemStack[] {
        // "Matter Fabrication CPU"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 799),
        // "Matter Generation Coil"
        getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 8),
        // "Matter Fabricator Casing"
        getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 9),
        // "Containment Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 15) };

    // "Alloy Blast Smelter" - 810
    public static final ItemStack[] Alloy_Blast_Smelter = new ItemStack[] {
        // "Alloy Blast Smelter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 810),
        // "Blast Smelter Heat Containment Coil"
        getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 14),
        // "Blast Smelter Casing Block"
        getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 15) };

    // "Industrial Mixing Machine" - 811
    public static final ItemStack[] Industrial_Mixing_Machine = new ItemStack[] {
        // "Industrial Mixing Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 811),
        // "Titanium Turbine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 11),
        // "Multi-Use Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 2) };

    // "Power Station Control Node" - 812
    public static final ItemStack[] Power_Station_Control_Node = new ItemStack[] {
        // "Power Station Control Node"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 812),
        // "Sub-Station External Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 8),

        // "Vanadium Redox Power Cell"
        // "Vanadium Redox Power Cell (EV)"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 7),
        // "Vanadium Redox Power Cell (IV)"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 4),
        // "Vanadium Redox Power Cell (LuV)"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 5),
        // "Vanadium Redox Power Cell (ZPM)"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 6),
        // "Vanadium Redox Power Cell (UV)"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 7),
        // "Vanadium Redox Power Cell (UHV)"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 8) };

    // "COMET - Compact Cyclotron" - 828
    public static final ItemStack[] COMET_Compact_Cyclotron = new ItemStack[] {
        // "COMET - Compact Cyclotron"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 828),
        // "Cyclotron Coil"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 9),
        // "Cyclotron Outer Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 10) };

    // "Zhuhai - Fishing Port" - 829
    public static final ItemStack[] Zhuhai_Fishing_Port = new ItemStack[] {
        // "Zhuhai - Fishing Port"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 829),
        // "Aquatic Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 0) };

    // "Reactor Fuel Processing Plant" - 835
    public static final ItemStack[] Reactor_Fuel_Processing_Plant = new ItemStack[] {
        // "Reactor Fuel Processing Plant"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 835),
        // "Reactor Shield Casing"
        getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 13),
        // "Hastelloy-N Sealant Block"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 1),
        // "Hastelloy-X Structural Block"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 2),
        // "Incoloy-DS Fluid Containment Block"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 3) };

    // "Tree Growth Simulator" - 836
    public static final ItemStack[] Tree_Growth_Simulator = new ItemStack[] {
        // "Tree Growth Simulator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 836),
        // "Sterile Farm Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 15) };

    // "Large Sifter Control Block" - 840
    public static final ItemStack[] Large_Sifter_Control_Block = new ItemStack[] {
        // "Large Sifter Control Block"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 840),
        // "Industrial Sieve Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 5),
        // "Large Sieve Grate"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 6) };

    // "Large Thermal Refinery" - 849
    public static final ItemStack[] Large_Thermal_Refinery = new ItemStack[] {
        // "Large Thermal Refinery"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 849),
        // "Thermal Processing Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 0) };

    // "Ore Washing Plant" - 850
    public static final ItemStack[] Ore_Washing_Plant = new ItemStack[] {
        // "Ore Washing Plant"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 850),
        // "Wash Plant Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 4) };

    // "Industrial Extrusion Machine" - 859
    public static final ItemStack[] Industrial_Extrusion_Machine = new ItemStack[] {
        // "Industrial Extrusion Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 859),
        // "Inconel Reinforced Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 1) };

    // "High Current Industrial Arc Furnace" - 862
    public static final ItemStack[] High_Current_Industrial_Arc_Furnace = new ItemStack[] {
        // "High Current Industrial Arc Furnace"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 862),
        // "Tempered Arc Furnace Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.4", 1L, 3) };

    // "Solar Tower" - 863
    public static final ItemStack[] Solar_Tower = new ItemStack[] {
        // "Solar Tower"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 863),
        // "Solar Reflector"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 864),
        // "Thermal Containment Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 11),
        // "Salt Containment Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 7),
        // "Thermally Insulated Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 8) };

    // "XL Turbo Steam Turbine" - 865
    public static final ItemStack[] XL_Turbo_Steam_Turbine = new ItemStack[] {
        // "XL Turbo Steam Turbine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 865),
        // "Rotor Assembly"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30010),
        // "Turbine Shaft"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 0),
        // "Reinforced Steam Turbine Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 1) };

    // "XL Turbo HP Steam Turbine" - 866
    public static final ItemStack[] XL_Turbo_HP_Steam_Turbine = new ItemStack[] {
        // "XL Turbo HP Steam Turbine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 866),
        // "Rotor Assembly"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30010),
        // "Turbine Shaft"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 0),
        // "Reinforced HP Steam Turbine Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 2) };

    // "Thermal Boiler" - 875
    public static final ItemStack[] Thermal_Boiler = new ItemStack[] {
        // "Thermal Boiler"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 875),
        // "Thermal Containment Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 11) };

    // "Large Scale Auto-Assembler v1.01" - 876
    public static final ItemStack[] Large_Scale_Auto_Assembler = new ItemStack[] {
        // "Large Scale Auto-Assembler v1.01"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 876),
        // "Bulk Production Frame"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 12) };

    // "Cryogenic Freezer" - 910
    public static final ItemStack[] Cryogenic_Freezer = new ItemStack[] {
        // "Cryogenic Freezer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 910),
        // "Cryotheum Cooling Hatch"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 967),
        // "Advanced Cryogenic Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 10) };

    // "Amazon Warehousing Depot" - 942
    public static final ItemStack[] Amazon_Warehousing_Depot = new ItemStack[] {
        // "Amazon Warehousing Depot"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 942),
        // "Supply Depot Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 9) };

    // Volcanus - 963
    public static final ItemStack[] Volcanus = new ItemStack[] {
        // Volcanus
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 963),
        // "Pyrotheum Heating Vent"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 968),
        // "Volcanus Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 11) };

    // Density^2 - 964
    public static final ItemStack[] Density = new ItemStack[] {
        // Density^2
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 964),
        // "Robust Tungstensteel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0) };

    // "FusionTech MK IV" - 965
    public static final ItemStack[] FusionTech_MKIV = new ItemStack[] {
        // "FusionTech MK IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 965),
        // "Drone DownLink Module"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9401),
        // "Fusion Machine Casing MK III"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 12),
        // "Advanced Fusion Coil"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 13) };

    // "FusionTech MK V" - 975
    public static final ItemStack[] FusionTech_MKV = new ItemStack[] {
        // "FusionTech MK V"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 975),
        // "Drone DownLink Module"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9401),
        // "Fusion Machine Casing MK IV"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.6", 1L, 0),
        // "Advanced Fusion Coil II"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.6", 1L, 1) };

    // "Industrial Cutting Factory" - 992
    public static final ItemStack[] Industrial_Cutting_Factory = new ItemStack[] {
        // "Industrial Cutting Factory"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 992),
        // "Cutting Factory Frame"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 13) };

    // Utupu-Tanuri - 995
    public static final ItemStack[] Utupu_Tanuri = new ItemStack[] {
        // Utupu-Tanuri
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 995),
        // "Vacuum Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.4", 1L, 10) };

    // "Rocketdyne F-1A Engine" - 996
    public static final ItemStack[] Rocketdyne_F1A_Engine = new ItemStack[] {
        // "Rocketdyne F-1A Engine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 996),
        // "Inconel Reinforced Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 1),
        // "Turbodyne Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.4", 1L, 11) };

    // "Algae Farm" - 997
    public static final ItemStack[] Algae_Farm = new ItemStack[] {
        // "Algae Farm"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 997),
        // "Sterile Farm Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 15) };

    // "ExxonMobil Chemical Plant" - 998
    public static final ItemStack[] ExxonMobil_Chemical_Plant = new ItemStack[] {
        // "ExxonMobil Chemical Plant"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 998),
        // "Catalyst Housing"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31030),

        // "Pipe Casing"
        // "Steel Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 13),
        // "Titanium Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 14),
        // "Tungstensteel Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 15),

        // "Machine Casing"
        // "Solid Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0),
        // "Robust Tungstensteel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0),
        // "Clean Stainless Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1),
        // "Stable Titanium Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2),
        // "Strong Bronze Machine Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.2", 1L, 0),
        // "Sturdy Aluminium Machine Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.2", 1L, 1),
        // "Vigorous Laurenium Machine Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.2", 1L, 2),
        // "Rugged Botmium Machine Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.2", 1L, 3) };

    // "Electric Blast Furnace" - 1000
    public static final ItemStack[] Electric_Blast_Furnace = new ItemStack[] {
        // "Electric Blast Furnace"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1000),
        // "Heat Proof Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 11) };

    // "Implosion Compressor" - 1001
    public static final ItemStack[] Implosion_Compressor = new ItemStack[] {
        // "Implosion Compressor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1001),
        // "Solid Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0) };

    // "Vacuum Freezer" - 1002
    public static final ItemStack[] Vacuum_Freezer = new ItemStack[] {
        // "Vacuum Freezer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1002),
        // "Frost Proof Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 1) };

    // "Multi Smelter" - 1003
    public static final ItemStack[] Multi_Smelter = new ItemStack[] {
        // "Multi Smelter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1003),
        // "Heat Proof Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 11) };

    // "Dimensionally Transcendent Plasma Forge" - 1004
    public static final ItemStack[] Dimensionally_Transcendent_Plasma_Forge = new ItemStack[] {
        // "Dimensionally Transcendent Plasma Forge"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1004),
        // "Dimensionally Transcendent Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 12),
        // "Dimensional Injection Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 13),
        // "Dimensional Bridge"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 14) };

    // "Transcendent Plasma Mixer" - 1006
    public static final ItemStack[] Transcendent_Plasma_Mixer = new ItemStack[] {
        // "Transcendent Plasma Mixer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1006),
        // "Dimensionally Transcendent Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 12),
        // "Dimensional Injection Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 13),
        // "Dimensional Bridge"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 14) };

    // "Large Bronze Boiler" - 1020
    public static final ItemStack[] Large_Bronze_Boiler = new ItemStack[] {
        // "Large Bronze Boiler"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1020),
        // "Bronze Plated Bricks"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 10),
        // "Bronze Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 12),
        // "Bronze Firebox Casing"
        getModItem(GregTech.ID, "gt.blockcasings3", 1L, 13) };

    // "Large Steel Boiler" - 1021
    public static final ItemStack[] Large_Steel_Boiler = new ItemStack[] {
        // "Large Steel Boiler"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1021),
        // "Solid Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0),
        // "Steel Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 13),
        // "Steel Firebox Casing"
        getModItem(GregTech.ID, "gt.blockcasings3", 1L, 14) };

    // "Large Titanium Boiler" - 1022
    public static final ItemStack[] Large_Titanium_Boiler = new ItemStack[] {
        // "Large Titanium Boiler"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1022),
        // "Titanium Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 14),
        // "Stable Titanium Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2),
        // "Titanium Firebox Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 3) };

    // "Large Tungstensteel Boiler" - 1023
    public static final ItemStack[] Large_Tungstensteel_Boiler = new ItemStack[] {
        // "Large Tungstensteel Boiler"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1023),
        // "Tungstensteel Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 15),
        // "Tungstensteel Firebox Casing"
        getModItem(GregTech.ID, "gt.blockcasings3", 1L, 15),
        // "Robust Tungstensteel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0) };

    // "Distillation Tower" - 1126
    public static final ItemStack[] Distillation_Tower = new ItemStack[] {
        // "Distillation Tower"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1126),
        // "Clean Stainless Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1) };

    // "Large Steam Turbine" - 1131
    public static final ItemStack[] Large_Steam_Turbine = new ItemStack[] {
        // "Large Steam Turbine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1131),
        // "Turbine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 9) };

    // "Integrated Ore Factory" - 1132
    public static final ItemStack[] Integrated_Ore_Factory = new ItemStack[] {
        // "Integrated Ore Factory"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1132),
        // "Steel Gear Box Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 3),
        // "Tungstensteel Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 15),
        // "Clean Stainless Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1),
        // "Advanced Iridium Plated Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 7),
        // "Tungstensteel Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 316) };

    // "Large Gas Turbine" - 1151
    public static final ItemStack[] Large_Gas_Turbine = new ItemStack[] {
        // "Large Gas Turbine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1151),
        // "Stainless Steel Turbine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 10) };

    // "Large HP Steam Turbine" - 1152
    public static final ItemStack[] Large_HP_Steam_Turbine = new ItemStack[] {
        // "Large HP Steam Turbine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1152),
        // "Titanium Turbine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 11) };

    // "Large Plasma Turbine" - 1153
    public static final ItemStack[] Large_Plasma_Turbine = new ItemStack[] {
        // "Large Plasma Turbine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1153),
        // "Tungstensteel Turbine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 12) };

    // "Large Heat Exchanger" - 1154
    public static final ItemStack[] Large_Heat_Exchanger = new ItemStack[] {
        // "Large Heat Exchanger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1154),
        // "Titanium Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 14),
        // "Stable Titanium Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2) };

    // "Fluid Drilling Rig" - 1157
    public static final ItemStack[] Fluid_Drilling_Rig = new ItemStack[] {
        // "Fluid Drilling Rig"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1157),
        // "Solid Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0),
        // "Steel Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 305) };

    // "Ore Drilling Plant" - 1158
    public static final ItemStack[] Ore_Drilling_Plant = new ItemStack[] {
        // "Ore Drilling Plant"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1158),
        // "Solid Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0),
        // "Steel Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 305) };

    // "Pyrolyse Oven" - 1159
    public static final ItemStack[] Pyrolyse_Oven = new ItemStack[] {
        // "Pyrolyse Oven"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1159),
        // "Pyrolyse Oven Casing"
        getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 2) };

    // "Oil Cracking Unit" - 1160
    public static final ItemStack[] Oil_Cracking_Unit = new ItemStack[] {
        // "Oil Cracking Unit"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1160),
        // "Clean Stainless Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1) };

    // "Large Chemical Reactor" - 1169
    public static final ItemStack[] Large_Chemical_Reactor = new ItemStack[] {
        // "Large Chemical Reactor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1169),
        // "Cupronickel Coil Block"
        getModItem(GregTech.ID, "gt.blockcasings5", 1L, 0),
        // "Chemically Inert Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 0),
        // "PTFE Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 1) };

    // "Assembly Line" - 1170
    public static final ItemStack[] Assembly_Line = new ItemStack[] {
        // "Assembly Line"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1170),
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
        getModItem(GregTech.ID, "gt.blockcasings3", 1L, 10) };

    // "Large Combustion Engine" - 1171
    public static final ItemStack[] Large_Combustion_Engine = new ItemStack[] {
        // "Large Combustion Engine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1171),
        // "Titanium Gear Box Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 4),
        // "Stable Titanium Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2),
        // "Engine Intake Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 13) };

    // "Cleanroom Controller" - 1172
    public static final ItemStack[] Cleanroom = new ItemStack[] {
        // "Cleanroom Controller"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1172),
        // "Plascrete Block"
        getModItem(GregTech.ID, "gt.blockreinforced", 1L, 2) };

    // "Ore Drilling Plant II" - 1177
    public static final ItemStack[] Ore_Drilling_Plant_II = new ItemStack[] {
        // "Ore Drilling Plant II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1177),
        // "Stable Titanium Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2),
        // "Titanium Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 28) };

    // "Ore Drilling Plant III" - 1178
    public static final ItemStack[] Ore_Drilling_Plant_III = new ItemStack[] {
        // "Ore Drilling Plant III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1178),
        // "Robust Tungstensteel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0),
        // "Tungstensteel Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 316) };

    // "Ore Drilling Plant IV" - 1179
    public static final ItemStack[] Ore_Drilling_Plant_IV = new ItemStack[] {
        // "Ore Drilling Plant IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1179),
        // "Mining Osmiridium Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 14),
        // "Osmiridium Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 317) };

    // "Fusion Control Computer Mark I" - 1193
    public static final ItemStack[] Fusion_Control_Computer_MarkI = new ItemStack[] {
        // "Fusion Control Computer Mark I"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1193),
        // "Drone DownLink Module"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9401),
        // "LuV Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 6),
        // "Superconducting Coil Block"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 15) };

    // "Fusion Control Computer Mark II" - 1194
    public static final ItemStack[] Fusion_Control_Computer_MarkII = new ItemStack[] {
        // "Fusion Control Computer Mark II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1194),
        // "Drone DownLink Module"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9401),
        // "Fusion Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 6),
        // "Fusion Coil Block"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 7) };

    // "Fusion Control Computer Mark III" - 1195
    public static final ItemStack[] Fusion_Control_Computer_MarkIII = new ItemStack[] {
        // "Fusion Control Computer Mark III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1195),
        // "Drone DownLink Module"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9401),
        // "Fusion Coil Block"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 7),
        // "Fusion Machine Casing MK II"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 8) };

    // "Extreme Combustion Engine" - 2105
    public static final ItemStack[] Extreme_Combustion_Engine = new ItemStack[] {
        // "Extreme Combustion Engine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2105),
        // "Titanium Gear Box Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 4),
        // "Robust Tungstensteel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0),
        // "Extreme Engine Intake Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 4) };

    // "Large Fluid Extractor" - 2730
    public static final ItemStack[] Large_Fluid_Extractor = new ItemStack[] {
        // "Large Fluid Extractor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2730),
        // "Black Steel Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 334),

        // "Solenoid Superconductor Coil"
        // "MV Solenoid Superconductor Coil"
        getModItem(GregTech.ID, "gt.blockcasings.cyclotron_coils", 1L, 0),
        // "HV Solenoid Superconductor Coil"
        getModItem(GregTech.ID, "gt.blockcasings.cyclotron_coils", 1L, 1),
        // "EV Solenoid Superconductor Coil"
        getModItem(GregTech.ID, "gt.blockcasings.cyclotron_coils", 1L, 2),
        // "IV Solenoid Superconductor Coil"
        getModItem(GregTech.ID, "gt.blockcasings.cyclotron_coils", 1L, 3),
        // "LuV Solenoid Superconductor Coil"
        getModItem(GregTech.ID, "gt.blockcasings.cyclotron_coils", 1L, 4),
        // "ZPM Solenoid Superconductor Coil"
        getModItem(GregTech.ID, "gt.blockcasings.cyclotron_coils", 1L, 5),
        // "UV Solenoid Superconductor Coil"
        getModItem(GregTech.ID, "gt.blockcasings.cyclotron_coils", 1L, 6),
        // "UHV Solenoid Superconductor Coil"
        getModItem(GregTech.ID, "gt.blockcasings.cyclotron_coils", 1L, 7),
        // "UEV Solenoid Superconductor Coil"
        getModItem(GregTech.ID, "gt.blockcasings.cyclotron_coils", 1L, 8),
        // "UIV Solenoid Superconductor Coil"
        getModItem(GregTech.ID, "gt.blockcasings.cyclotron_coils", 1L, 9),
        // "UMV Solenoid Superconductor Coil"
        getModItem(GregTech.ID, "gt.blockcasings.cyclotron_coils", 1L, 10) };

    // "Matter Manipulator Quantum Uplink" - 2731
    public static final ItemStack[] Matter_Manipulator_Quantum_Uplink = new ItemStack[] {
        // "Matter Manipulator Quantum Uplink"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2731),
        // "Quantum Uplink ME Connector Hatch"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2732),
        // "Matter Generation Coil"
        getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 8),
        // "Advanced Iridium Plated Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 7),
        // "Radiant Naquadah Alloy Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 10),
        // "Naquadah Alloy Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 325),
        // "Trinium Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 868) };

    // "Hyper-Intensity Laser Engraver" - 3004
    public static final ItemStack[] Hyper_Intensity_Laser_Engraver = new ItemStack[] {
        // "Hyper-Intensity Laser Engraver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 3004),
        // "Laser Resistant Plate"
        getModItem(GregTech.ID, "gt.laserplate", 1L),
        // "Laser Containment Casing"
        getModItem(GregTech.ID, "gt.blockcasings10", 1L, 1),
        // "Tungstensteel Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 316) };

    // "Large Electric Compressor" - 3005
    public static final ItemStack[] Large_Electric_Compressor = new ItemStack[] {
        // "Large Electric Compressor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 3005),
        // "Electric Compressor Casing"
        getModItem(GregTech.ID, "gt.blockcasings10", 1L, 4),
        // "Compression Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings10", 1L, 5) };

    // "Hot Isostatic Pressurization Unit" - 3006
    public static final ItemStack[] Hot_Isostatic_Pressurization_Unit = new ItemStack[] {
        // "Hot Isostatic Pressurization Unit"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 3006),
        // "Heat Sensor Hatch"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 3009),
        // "Electric Compressor Casing"
        getModItem(GregTech.ID, "gt.blockcasings10", 1L, 4),
        // "Compression Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings10", 1L, 5),
        // "Coolant Duct"
        getModItem(GregTech.ID, "gt.blockcasings10", 1L, 9),
        // "Heating Duct"
        getModItem(GregTech.ID, "gt.blockcasings10", 1L, 10) };

    // "Neutronium Compressor" - 3007
    public static final ItemStack[] Neutronium_Compressor = new ItemStack[] {
        // "Neutronium Compressor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 3007),
        // "Neutronium Casing"
        getModItem(GregTech.ID, "gt.blockcasings10", 1L, 6),
        // "Active Neutronium Casing"
        getModItem(GregTech.ID, "gt.blockcasings10", 1L, 7),
        // "Neutronium Stabilization Casing"
        getModItem(GregTech.ID, "gt.blockcasings10", 1L, 8),
        // "Naquadah Alloy Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 325) };

    // "Pseudostable Black Hole Containment Field" - 3008
    public static final ItemStack[] Pseudostable_Black_Hole_Containment_Field = new ItemStack[] {
        // "Pseudostable Black Hole Containment Field"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 3008),
        // "Black Hole Utility Hatch"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 3012),
        // "Extreme Density Space-Bending Casing"
        getModItem(GregTech.ID, "gt.blockcasings10", 1L, 11),
        // "Background Radiation Absorbent Casing"
        getModItem(GregTech.ID, "gt.blockcasings10", 1L, 12),
        // "Hawking Radiation Realignment Focus"
        getModItem(GregTech.ID, "gt.blockglass1", 1L, 4),
        // "Naquadah Alloy Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 325) };

    // "Dissection Apparatus" - 3010
    public static final ItemStack[] Dissection_Apparatus = new ItemStack[] {
        // "Dissection Apparatus"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 3010),
        // "Clean Stainless Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1) };

    // "Big Barrel Brewery" - 3011
    public static final ItemStack[] Big_Barrel_Brewery = new ItemStack[] {
        // "Big Barrel Brewery"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 3011),
        // "Reinforced Wooden Casing"
        getModItem(GregTech.ID, "gt.blockcasings10", 1L, 15),
        // "Steel Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 305) };

    // "Draconic Evolution Fusion Crafter" - 5001
    public static final ItemStack[] Draconic_Evolution_Fusion_Crafter = new ItemStack[] {
        // "Draconic Evolution Fusion Crafter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 5001),
        // "Fusion Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 6),
        // "Fusion Coil Block"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 7),
        // "Fusion Machine Casing MK II"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 8),
        // "Naquadah Alloy Fusion Casing"
        getModItem(KubaTech.ID, "defc.casing", 1L, 7),
        // "Bloody Ichorium Fusion Casing"
        getModItem(KubaTech.ID, "defc.casing", 1L, 8),
        // "Draconium Fusion Casing"
        getModItem(KubaTech.ID, "defc.casing", 1L, 9),
        // "Wyvern Fusion Casing"
        getModItem(KubaTech.ID, "defc.casing", 1L, 10),
        // "Awakened Draconium Fusion Casing"
        getModItem(KubaTech.ID, "defc.casing", 1L, 11),
        // "Chaotic Fusion Casing"
        getModItem(KubaTech.ID, "defc.casing", 1L, 12) };

    // "Drone Centre" - 9400
    public static final ItemStack[] Drone_Centre = new ItemStack[] {
        // "Drone Centre"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9400),
        // "Heat Proof Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 11),
        // "Robust Tungstensteel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0),
        // "Stable Titanium Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2) };

    // "Water Purification Plant" - 9402
    public static final ItemStack[] Water_Purification_Plant = new ItemStack[] {
        // "Water Purification Plant"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9402),
        // "Superplasticizer-Treated High Strength Concrete"
        getModItem(GregTech.ID, "gt.blockcasings9", 1L, 3),
        // "Sterile Water Plant Casing"
        getModItem(GregTech.ID, "gt.blockcasings9", 1L, 4),
        // "Reinforced Sterile Water Plant Casing"
        getModItem(GregTech.ID, "gt.blockcasings9", 1L, 5),
        // "Tungsten Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 81),
        // "Tinted Industrial Glass (White)"
        getModItem(GregTech.ID, "gt.blocktintedglass", 1L, 0),

        // "Clarifier Purification Unit"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9403),
        // "Filter Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings3", 1L, 11),
        // "PTFE Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 1),
        // "Reinforced Sterile Water Plant Casing"
        getModItem(GregTech.ID, "gt.blockcasings9", 1L, 5),
        // "Iridium Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 84),
        // "Damascus Steel Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 335),

        // "Ozonation Purification Unit"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9404),
        // "PTFE Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 1),
        // "Reactive Gas Containment Casing"
        getModItem(GregTech.ID, "gt.blockcasings9", 1L, 9),
        // "Inert Filtration Casing"
        getModItem(GregTech.ID, "gt.blockcasings9", 1L, 10),
        // "Tungstensteel Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 316),
        // "Tinted Industrial Glass (White)"
        getModItem(GregTech.ID, "gt.blocktintedglass", 1L, 0),

        // "Flocculation Purification Unit"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9405),
        // "Filter Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings3", 1L, 11),
        // "Sterile Water Plant Casing"
        getModItem(GregTech.ID, "gt.blockcasings9", 1L, 4),
        // "Reinforced Sterile Water Plant Casing"
        getModItem(GregTech.ID, "gt.blockcasings9", 1L, 5),
        // "Reinforced Sterile Water Plant Casing"
        getModItem(GregTech.ID, "gt.blockcasings9", 1L, 6),
        // "Adamantium Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 319),
        // "Tinted Industrial Glass (White)"
        getModItem(GregTech.ID, "gt.blocktintedglass", 1L, 0),

        // "pH Neutralization Purification Unit"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9406),
        // "pH Sensor Hatch"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9407),
        // "Stabilized Naquadah Water Plant Casing"
        getModItem(GregTech.ID, "gt.blockcasings9", 1L, 7),
        // "Inert Neutralization Water Plant Casing"
        getModItem(GregTech.ID, "gt.blockcasings9", 1L, 8),
        // "Naquadah Alloy Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 325),
        // "Chemical Grade Glass"
        getModItem(GregTech.ID, "gt.blockglass1", 1L, 0),

        // "Extreme Temperature Fluctuation Purification Unit"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9408),
        // "Superconducting Coil Block"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 15),
        // "Reinforced Sterile Water Plant Casing"
        getModItem(GregTech.ID, "gt.blockcasings9", 1L, 5),
        // "Heat-Resistant Trinium Plated Casing"
        getModItem(GregTech.ID, "gt.blockcasings9", 1L, 11),
        // "Superconductor Base ZPM Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 992),
        // "Tinted Industrial Glass (White)"
        getModItem(GregTech.ID, "gt.blocktintedglass", 1L, 0),
        // Neonite
        getModItem(Chisel.ID, "neonite", 1L, 7),

        // "High Energy Laser Purification Unit"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9409),
        // "Lens Housing"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9410),
        // "Lens Indicator Hatch"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9411),
        // "Naquadria-Reinforced Water Plant Casing"
        getModItem(GregTech.ID, "gt.blockcasings9", 1L, 12),
        // "High Energy Ultraviolet Emitter Casing"
        getModItem(GregTech.ID, "gt.blockcasings9", 1L, 13),
        // "Stellar Alloy Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 405),
        // "Electron-Permeable Neutronium Coated Glass"
        getModItem(GregTech.ID, "gt.blockglass1", 1L, 1),

        // "Residual Decontaminant Degasser Purification Unit"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9412),
        // "Degasser Control Hatch"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9413),
        // "Heat-Resistant Trinium Plated Casing"
        getModItem(GregTech.ID, "gt.blockcasings9", 1L, 11),
        // "Bedrockium Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 395),
        // "Omni-Purpose Infinity Fused Glass"
        getModItem(GregTech.ID, "gt.blockglass1", 1L, 2),

        // "Absolute Baryonic Perfection Purification Unit"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9414),
        // "Particle Beam Guidance Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings9", 1L, 14),
        // "Femtometer-Calibrated Particle Beam Casing"
        getModItem(GregTech.ID, "gt.blockcasings9", 1L, 15),
        // "Quark Exclusion Casing"
        getModItem(GregTech.ID, "gt.blockcasings10", 1L, 2),
        // "Bedrockium Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 395),
        // "Non-Photonic Matter Exclusion Glass"
        getModItem(GregTech.ID, "gt.blockglass1", 1L, 3) };

    // Digester - 10500
    public static final ItemStack[] Digester = new ItemStack[] {
        // Digester
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10500),
        // "Heat Proof Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 11),
        // "Robust Tungstensteel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0),
        // "Clean Stainless Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1) };

    // "Dissolution Tank" - 10501
    public static final ItemStack[] Dissolution_Tank = new ItemStack[] {
        // "Dissolution Tank"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10501),
        // "Heat Proof Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 11),
        // "Clean Stainless Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1) };

    // "Linear Accelerator" - 10505
    public static final ItemStack[] Linear_Accelerator = new ItemStack[] {
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
        getModItem(GTNHLanthanides.ID, "tile.casing.shielded_accelerator_glass", 1L) };

    // "Source Chamber" - 10506
    public static final ItemStack[] Source_Chamber = new ItemStack[] {
        // "Source Chamber"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10506),
        // "LuV Beamline Output Hatch"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10504),
        // "Shielded Accelerator Casing"
        getModItem(GTNHLanthanides.ID, "casing.shielded_accelerator", 1L),
        // "Electrode Casing"
        getModItem(GTNHLanthanides.ID, "casing.electrode", 1L),
        // "Shielded Accelerator Glass"
        getModItem(GTNHLanthanides.ID, "tile.casing.shielded_accelerator_glass", 1L) };

    // Synchrotron - 10507
    public static final ItemStack[] Synchrotron = new ItemStack[] {
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
        getModItem(GTNHLanthanides.ID, "casing.niobium_cavity", 1L) };

    // "Target Chamber" - 10508
    public static final ItemStack[] Target_Chamber = new ItemStack[] {
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
        getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 1) };

    // "Electric Air Filter T1" - 12020
    public static final ItemStack[] Electric_Air_Filter_T1 = new ItemStack[] {
        // "Electric Air Filter T1"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12020),
        // "Air Filter Turbine Casing"
        getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 0),
        // "Air Filter Vent Casing"
        getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 1) };

    // "Electric Air Filter T2" - 12021
    public static final ItemStack[] Electric_Air_Filter_T2 = new ItemStack[] {
        // "Electric Air Filter T2"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12021),
        // "Advanced Air Filter Turbine Casing"
        getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 3),
        // "Advanced Air Filter Vent Casing"
        getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 4) };

    // "Electric Air Filter T3" - 12022
    public static final ItemStack[] Electric_Air_Filter_T3 = new ItemStack[] {
        // "Electric Air Filter T3"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12022),
        // "Super Air Filter Turbine Casing"
        getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 5),
        // "Super Air Filter Vent Casing"
        getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 6) };

    // "Manual Transformer" - 12697
    public static final ItemStack[] Manual_Transformer = new ItemStack[] {
        // "Manual Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12697),
        // "MV Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 2),
        // "Nickel-Zinc Ferrite Block"
        getModItem(BartWorks.ID, "BW_Machinery_Casings", 1L, 0),
        // "Transformer-Winding Block"
        getModItem(BartWorks.ID, "BW_Machinery_Casings", 1L, 1) };

    // Windmill - 12698
    public static final ItemStack[] Windmill = new ItemStack[] {
        // Windmill
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12698),
        // "Primitive Kinetic Shaftbox"
        getModItem(BartWorks.ID, "BWRotorBlock", 1L, 0),
        // Bricks
        getModItem(Minecraft.ID, "brick_block", 1L),
        // "Oak Planks"
        getModItem(Minecraft.ID, "planks", 1L, 0),
        // Terracotta
        getModItem(Minecraft.ID, "hardened_clay", 1L) };

    // "Bacterial Vat" - 12712
    public static final ItemStack[] Bacterial_Vat = new ItemStack[] {
        // "Bacterial Vat"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12712),
        // "Radio Hatch"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12713),
        // "Clean Stainless Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1) };

    // "Deep Earth Heating Pump" - 12729
    public static final ItemStack[] Deep_Earth_Heating_Pump = new ItemStack[] {
        // "Deep Earth Heating Pump"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12729),
        // "Data Access Hatch"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 145),
        // "Heat Proof Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 11),
        // "Tungsten Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 81) };

    // "Mega Electric Blast Furnace" - 12730
    public static final ItemStack[] Mega_Electric_Blast_Furnace = new ItemStack[] {
        // "Mega Electric Blast Furnace"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12730),
        // "Heat Proof Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 11) };

    // "Mega Vacuum Freezer" - 12731
    public static final ItemStack[] Mega_Vacuum_Freezer = new ItemStack[] {
        // "Mega Vacuum Freezer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12731),
        // "Frost Proof Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 1),
        // "Infinity Cooled Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 14) };

    // "Large Naquadah Reactor" - 12732
    public static final ItemStack[] Large_Naquadah_Reactor = new ItemStack[] {
        // "Large Naquadah Reactor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12732),
        // "Tungstensteel Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 15),
        // "Radiation Proof Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings3", 1L, 12),
        // "Field Restriction Casing"
        getModItem(GoodGenerator.ID, "MAR_Casing", 1L, 0),
        // "Radiation Proof Steel Frame Box"
        getModItem(GoodGenerator.ID, "radiationProtectionSteelFrame", 1L, 0) };

    // "Thorium High Temperature Reactor" - 12733
    public static final ItemStack[] Thorium_High_Temperature_Reactor = new ItemStack[] {
        // "Thorium High Temperature Reactor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12733),
        // "Radiation Proof Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings3", 1L, 12) };

    // "Electric Implosion Compressor" - 12734
    public static final ItemStack[] Electric_Implosion_Compressor = new ItemStack[] {
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
        getModItem(GregTech.ID, "gt.blockmetal9", 1L, 8) };

    // "Circuit Assembly Line" - 12735
    public static final ItemStack[] Circuit_Assembly_Line = new ItemStack[] {
        // "Circuit Assembly Line"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12735),
        // "Solid Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0),
        // "Assembly Line Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 5),
        // "Grate Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings3", 1L, 10) };

    // "Mega Distillation Tower" - 12738
    public static final ItemStack[] Mega_Distillation_Tower = new ItemStack[] {
        // "Mega Distillation Tower"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12738),
        // "Clean Stainless Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1) };

    // "Void Miner III" - 12739
    public static final ItemStack[] Void_Miner_III = new ItemStack[] {
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
        getModItem(BartWorks.ID, "bw.werkstoffblockscasingadvanced.01", 1L, 31850) };

    // "Void Miner II" - 12740
    public static final ItemStack[] Void_Miner_II = new ItemStack[] {
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
        getModItem(BartWorks.ID, "bw.werkstoffblockscasingadvanced.01", 1L, 32091) };

    // "Void Miner I" - 12741
    public static final ItemStack[] Void_Miner_I = new ItemStack[] {
        // "Void Miner I"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12741),
        // "Mining Osmiridium Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 14),
        // "Osmiridium Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 317),
        // "Bolted Osmiridium Casing"
        getModItem(BartWorks.ID, "bw.werkstoffblockscasing.01", 1L, 32083),
        // "Rebolted Osmiridium Casing"
        getModItem(BartWorks.ID, "bw.werkstoffblockscasingadvanced.01", 1L, 32083) };

    // "High Temperature Gas-cooled Reactor" - 12791
    public static final ItemStack[] High_Temperature_Gas_Cooled_Reactor = new ItemStack[] {
        // "High Temperature Gas-cooled Reactor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12791),
        // "Europium Reinforced Radiation Proof Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 5) };

    // "Extreme Industrial Greenhouse" - 12792
    public static final ItemStack[] Extreme_Industrial_Greenhouse = new ItemStack[] {
        // "Extreme Industrial Greenhouse"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12792),
        // "Clean Stainless Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1),
        // "Purple Lamp"
        getModItem(ProjectRedIllumination.ID, "projectred.illumination.lamp", 1L, 10),
        // "Fertilized Dirt"
        getModItem(RandomThings.ID, "fertilizedDirt", 1L) };

    // "Research Completer" - 13001
    public static final ItemStack[] Research_Completer = new ItemStack[] {
        // "Research Completer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 13001),
        // "Magical Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 8),
        // "Warded Glass"
        getModItem(Thaumcraft.ID, "blockCosmeticOpaque", 1L, 2) };

    // "Solid-Oxide Fuel Cell Mk I" - 13101
    public static final ItemStack[] Solid_Oxide_Fuel_Cell_MkI = new ItemStack[] {
        // "Solid-Oxide Fuel Cell Mk I"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 13101),
        // "Clean Stainless Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1),
        // "Reinforced Glass"
        getModItem(IndustrialCraft2.ID, "blockAlloyGlass", 1L),
        // "YSZ Ceramic Electrolyte Unit"
        getModItem(KekzTech.ID, "kekztech_yszceramicelectrolyteunit_block", 1L) };

    // "Solid-Oxide Fuel Cell Mk II" - 13102
    public static final ItemStack[] Solid_Oxide_Fuel_Cell_MkII = new ItemStack[] {
        // "Solid-Oxide Fuel Cell Mk II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 13102),
        // "Robust Tungstensteel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0),
        // "Reinforced Glass"
        getModItem(IndustrialCraft2.ID, "blockAlloyGlass", 1L),
        // "GDC Ceramic Electrolyte Unit"
        getModItem(KekzTech.ID, "kekztech_gdcceramicelectrolyteunit_block", 1L) };

    // T.F.F.T - 13104
    public static final ItemStack[] TFFT = new ItemStack[] {
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
        getModItem(KekzTech.ID, "kekztech_tfftstoragefield_block", 1L, 10) };

    // "Lapotronic Supercapacitor" - 13106
    public static final ItemStack[] Lapotronic_Supercapacitor = new ItemStack[] {
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
        getModItem(KekzTech.ID, "kekztech_lapotronicenergyunit_block", 1L, 10) };

    // "Miniature Wormhole Generator" - 13115
    public static final ItemStack[] Miniature_Wormhole_Generator = new ItemStack[] {
        // "Miniature Wormhole Generator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 13115),
        // "Fusion Coil Block"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 7),
        // "Europium Reinforced Radiation Proof Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 5),
        // "High Power Casing"
        getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 0),
        // "Molecular Casing"
        getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 4) };

    // "Mega Chemical Reactor" - 13366
    public static final ItemStack[] Mega_Chemical_Reactor = new ItemStack[] {
        // "Mega Chemical Reactor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 13366),
        // "Fusion Coil Block"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 7),
        // "Chemically Inert Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 0),
        // "PTFE Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings8", 1L, 1) };

    // "Mega Oil Cracker" - 13367
    public static final ItemStack[] Mega_Oil_Cracker = new ItemStack[] {
        // "Mega Oil Cracker"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 13367),
        // "Clean Stainless Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1) };

    // "Advanced Assembly Line" - 13532
    public static final ItemStack[] Advanced_Assembly_Line = new ItemStack[] {
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
        getModItem(GregTech.ID, "gt.blockcasings3", 1L, 10) };

    // "Dyson Swarm Ground Unit" - 14001
    public static final ItemStack[] Dyson_Swarm_Ground_Unit = new ItemStack[] {
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
        getModItem(GTNHIntergalactic.ID, "dysonswarmparts", 1L, 9) };

    // "Planetary Gas Siphon" - 14002
    public static final ItemStack[] Planetary_Gas_Siphon = new ItemStack[] {
        // "Planetary Gas Siphon"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 14002),
        // "Tungstensteel Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 316),
        // "Planetary Siphon Casing"
        getModItem(GTNHIntergalactic.ID, "gassiphoncasing", 1L),
        // "Rebolted Rhodium-Plated Palladium Casing"
        getModItem(BartWorks.ID, "bw.werkstoffblockscasingadvanced.01", 1L, 88) };

    // "Space Elevator" - 14003
    public static final ItemStack[] Space_Elevator = new ItemStack[] {
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
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 14014) };

    // "Large Molecular Assembler" - 14101
    public static final ItemStack[] Large_Molecular_Assembler = new ItemStack[] {
        // "Large Molecular Assembler"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 14101),
        // "Robust Tungstensteel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0),
        // "Vibrant Quartz Glass"
        getModItem(AppliedEnergistics2.ID, "tile.BlockQuartzLamp", 1L) };

    // "Extreme Entity Crusher" - 14201
    public static final ItemStack[] Extreme_Entity_Crusher = new ItemStack[] {
        // "Extreme Entity Crusher"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 14201),
        // "Solid Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0),
        // "Steel Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 305),
        // "Diamond Spike"
        getModItem(ExtraUtilities.ID, "spike_base_diamond", 1L) };

    // "Industrial Apicultural Acclimatiser and Drone Domestication Station" - 14202
    public static final ItemStack[] Industrial_Apicultural_Acclimatiser_and_Drone_Domestication_Station = new ItemStack[] {
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
        getModItem(Minecraft.ID, "wooden_slab", 1L, 0) };

    // "Active Transformer" - 15300
    public static final ItemStack[] Active_Transformer = new ItemStack[] {
        // "Active Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 15300),
        // "Superconducting Coil Block"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 15),
        // "High Power Casing"
        getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 0) };

    // "Weighted Network Switch With QoS" - 15310
    public static final ItemStack[] Weighted_Network_Switch_With_QoS = new ItemStack[] {
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
        getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 3) };

    // "Quantum Computer" - 15311
    public static final ItemStack[] Quantum_Computer = new ItemStack[] {
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
        getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 3) };

    // "Microwave Grinder" - 15312
    public static final ItemStack[] Microwave_Grinder = new ItemStack[] {
        // "Microwave Grinder"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 15312),
        // "Clean Stainless Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1) };

    // "Data Bank" - 15313
    public static final ItemStack[] Data_Bank = new ItemStack[] {
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
        getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 2) };

    // "Tesla Tower" - 15314
    public static final ItemStack[] Tesla_Tower = new ItemStack[] {
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
        getModItem(TecTech.ID, "gt.blockcasingsBA0", 1L, 9) };

    // "Static Network Switch With QoS" - 15315
    public static final ItemStack[] Static_Network_Switch_With_QoS = new ItemStack[] {
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
        getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 3) };

    // "Research Station" - 15331
    public static final ItemStack[] Research_Station = new ItemStack[] {
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
        getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 3) };

    // "Energy Infuser" - 15350
    public static final ItemStack[] Energy_Infuser = new ItemStack[] {
        // "Energy Infuser"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 15350),
        // "High Power Casing"
        getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 0),
        // "Molecular Casing"
        getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 4),
        // "Molecular Coil"
        getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 7) };

    // "Eye of Harmony" - 15410
    public static final ItemStack[] Eye_of_Harmony = new ItemStack[] {
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
        getModItem(TecTech.ID, "gt.stabilisation_field_generator", 1L, 8) };

    // "Forge of the Gods" - 15411
    public static final ItemStack[] Forge_of_the_Gods = new ItemStack[] {
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

        // - "Helioflare Power Forge" - 15412
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
        getModItem(TecTech.ID, "gt.godforgecasing", 1L, 8) };

    // "Entropic Processor" - 15750
    public static final ItemStack[] Entropic_Processor = new ItemStack[] {
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
        getModItem(Thaumcraft.ID, "blockMetalDevice", 1L, 9) };

    // "Decay Warehouse" - 15751
    public static final ItemStack[] Decay_Warehouse = new ItemStack[] {
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
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 128) };

    // "Naquadah Fuel Refinery" - 16999
    public static final ItemStack[] Naquadah_Fuel_Refinery = new ItemStack[] {
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
        getModItem(GoodGenerator.ID, "FRF_Coil_4", 1L, 0) };

    // "Hydro Dam" - 17000
    public static final ItemStack[] Hydro_Dam = new ItemStack[] {
        // "Hydro Dam"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 17000),
        // "Light Concrete"
        getModItem(GregTech.ID, "gt.blockconcretes", 1L, 8) };

    // "Hydro Pump" - 17003
    public static final ItemStack[] Hydro_Pump = new ItemStack[] {
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
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 14) };

    // "Hydro Turbine" - 17019
    public static final ItemStack[] Hydro_Turbine = new ItemStack[] {
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
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 14) };

    // "Dangote Distillus" - 31021
    public static final ItemStack[] Dangote_Distillus = new ItemStack[] {
        // "Dangote Distillus"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31021),
        // "Clean Stainless Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1) };

    // Zyngen - 31023
    public static final ItemStack[] Zyngen = new ItemStack[] {
        // Zyngen
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31023),
        // "Inconel Reinforced Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 1),
        // "Integral Encasement V"
        getModItem(GTPlusPlus.ID, "gtplusplus.blocktieredcasings.1", 1L, 4) };

    // "Large Semifluid Burner" - 31026
    public static final ItemStack[] Large_Semifluid_Burner = new ItemStack[] {
        // "Large Semifluid Burner"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31026),
        // "Steel Gear Box Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 3),
        // "Stable Titanium Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2),
        // "Engine Intake Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 13) };

    // "IsaMill Grinding Machine" - 31027
    public static final ItemStack[] IsaMill_Grinding_Machine = new ItemStack[] {
        // "IsaMill Grinding Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31027),
        // "Ball Housing"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31029),
        // "IsaMill Exterior Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 0),
        // "IsaMill Piping"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 1),
        // "IsaMill Gearbox"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 2) };

    // "Flotation Cell Regulator" - 31028
    public static final ItemStack[] Flotation_Cell_Regulator = new ItemStack[] {
        // "Flotation Cell Regulator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31028),
        // "Flotation Cell Casings"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 9),
        // "Inconel Reinforced Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 1) };

    // "Sparge Tower Controller" - 31035
    public static final ItemStack[] Sparge_Tower_Controller = new ItemStack[] {
        // "Sparge Tower Controller"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31035),
        // "Sparge Tower Exterior Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 4) };

    // "Steam Grinder" - 31041
    public static final ItemStack[] Steam_Grinder = new ItemStack[] {
        // "Steam Grinder"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31041),
        // "Bronze Plated Bricks"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 10),
        // "Solid Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0) };

    // "Elemental Duplicator" - 31050
    public static final ItemStack[] Elemental_Duplicator = new ItemStack[] {
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
        getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.3", 1L, 6) };

    // Boldarnator - 31065
    public static final ItemStack[] Boldarnator = new ItemStack[] {
        // Boldarnator
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31065),
        // "Thermal Processing Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 0),
        // "Thermal Containment Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 11) };

    // "Industrial 3D Copying Machine" - 31069
    public static final ItemStack[] Industrial_3D_Copying_Machine = new ItemStack[] {
        // "Industrial 3D Copying Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31069),
        // "Sturdy Printer Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 5) };

    // "Molecular Transformer" - 31072
    public static final ItemStack[] Molecular_Transformer = new ItemStack[] {
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
        getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.3", 1L, 4) };

    // "XL Turbo Gas Turbine" - 31073
    public static final ItemStack[] XL_Turbo_Gas_Turbine = new ItemStack[] {
        // "XL Turbo Gas Turbine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31073),
        // "Rotor Assembly"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30010),
        // "Turbine Shaft"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 0),
        // "Reinforced Gas Turbine Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 3) };

    // "XL Turbo Plasma Turbine" - 31074
    public static final ItemStack[] XL_Turbo_Plasma_Turbine = new ItemStack[] {
        // "XL Turbo Plasma Turbine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31074),
        // "Rotor Assembly"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30010),
        // "Turbine Shaft"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 0),
        // "Reinforced Plasma Turbine Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 4) };

    // "Industrial Sledgehammer" - 31075
    public static final ItemStack[] Industrial_Sledgehammer = new ItemStack[] {
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
        getModItem(EnderIO.ID, "blockDarkSteelAnvil", 1L, 3) };

    // "XL Turbo SC Steam Turbine" - 31076
    public static final ItemStack[] XL_Turbo_SC_Steam_Turbine = new ItemStack[] {
        // "XL Turbo SC Steam Turbine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31076),
        // "Rotor Assembly"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30010),
        // "Turbine Shaft"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 0),
        // "Reinforced SC Turbine Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 15) };

    // "Thermic Heating Device" - 31077
    public static final ItemStack[] Thermic_Heating_Device = new ItemStack[] {
        // "Thermic Heating Device"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31077),
        // "Thermal Containment Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 11),
        // "Multi-Use Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 2) };

    // "Steam Squasher" - 31078
    public static final ItemStack[] Steam_Squasher = new ItemStack[] {
        // "Steam Squasher"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31078),
        // "Bronze Plated Bricks"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 10),
        // "Solid Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0) };

    // "Whakawhiti Wera XL" - 31079
    public static final ItemStack[] Whakawhiti_Wera_XL = new ItemStack[] {
        // "Whakawhiti Wera XL"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31079),
        // "Tungstensteel Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 15),
        // "Talonite Frame Box"
        getModItem(GTPlusPlus.ID, "blockFrameGtTalonite", 1L),
        // "Reinforced Heat Exchanger Casing"
        getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 14) };

    // "Steam Separator" - 31080
    public static final ItemStack[] Steam_Separator = new ItemStack[] {
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
        getModItem(GregTech.ID, "gt.blockcasings3", 1L, 14) };

    // "Steam Purifier" - 31082
    public static final ItemStack[] Steam_Purifier = new ItemStack[] {
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
        getModItem(Minecraft.ID, "glass", 1L) };

    // "Steam Presser" - 31083
    public static final ItemStack[] Steam_Presser = new ItemStack[] {
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
        getModItem(Minecraft.ID, "iron_block", 1L) };

    // "Steam Blender" - 31084
    public static final ItemStack[] Steam_Blender = new ItemStack[] {
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
        getModItem(Minecraft.ID, "iron_block", 1L) };

    // "Water Pump" - 31085
    public static final ItemStack[] Water_Pump = new ItemStack[] {
        // "Water Pump"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31085),
        // "Primitive Wooden Casing"
        getModItem(GregTech.ID, "gt.blockcasings9", 1L, 2),
        // "Bronze Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 300),
        // "Steel Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 305) };

    // "Steam Fuser" - 31086
    public static final ItemStack[] Steam_Fuser = new ItemStack[] {
        // "Steam Fuser"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31086),
        // "Bronze Plated Bricks"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 10),
        // "Solid Steel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0),
        // "Bronze Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 12),
        // "Steel Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 13) };

    // "Mega Alloy Blast Smelter" - 31150
    public static final ItemStack[] Mega_Alloy_Blast_Smelter = new ItemStack[] {
        // "Mega Alloy Blast Smelter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31150),
        // "Blast Smelter Heat Containment Coil"
        getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 14),
        // "Blast Smelter Casing Block"
        getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 15) };

    // "Quantum Force Transformer" - 31151
    public static final ItemStack[] Quantum_Force_Transformer = new ItemStack[] {
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
        getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 15) };

    // "Universal Chemical Fuel Engine" - 32001
    public static final ItemStack[] Universal_Chemical_Fuel_Engine = new ItemStack[] {
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
        getModItem(GoodGenerator.ID, "titaniumPlatedCylinder", 1L, 0) };

    // "Neutron Activator" - 32013
    public static final ItemStack[] Neutron_Activator = new ItemStack[] {
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
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32764) };

    // YOTTank - 32014
    public static final ItemStack[] YOTTank = new ItemStack[] {
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
        getModItem(GoodGenerator.ID, "yottaFluidTankCells", 1L, 9) };

    // "Large Supercritical Steam Turbine" - 32016
    public static final ItemStack[] Large_Supercritical_Steam_Turbine = new ItemStack[] {
        // "Large Supercritical Steam Turbine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32016),
        // "SC Turbine Casing"
        getModItem(GoodGenerator.ID, "supercriticalFluidTurbineCasing", 1L, 0) };

    // "Extreme Heat Exchanger" - 32017
    public static final ItemStack[] Extreme_Heat_Exchanger = new ItemStack[] {
        // "Extreme Heat Exchanger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32017),
        // "Tungstensteel Pipe Casing"
        getModItem(GregTech.ID, "gt.blockcasings2", 1L, 15),
        // "Robust Tungstensteel Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0),
        // "Pressure Resistant Wall"
        getModItem(GoodGenerator.ID, "pressureResistantWalls", 1L, 0) };

    // "Precise Auto-Assembler MT-3662" - 32018
    public static final ItemStack[] Precise_Auto_Assembler_MT3662 = new ItemStack[] {
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
        getModItem(GoodGenerator.ID, "preciseUnitCasing", 1L, 3) };

    // "Compact Fusion Computer MK-I Prototype" - 32019
    public static final ItemStack[] Compact_Fusion_Computer_MKI_Prototype = new ItemStack[] {
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
        getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 3) };

    // "Compact Fusion Computer MK-II" - 32020
    public static final ItemStack[] Compact_Fusion_Computer_MKII = new ItemStack[] {
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
        getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 4) };

    // "Compact Fusion Computer MK-III" - 32021
    public static final ItemStack[] Compact_Fusion_Computer_MKIII = new ItemStack[] {
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
        getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 5) };

    // "Compact Fusion Computer MK-IV Prototype" - 32022
    public static final ItemStack[] Compact_Fusion_Computer_MKIV_Prototype = new ItemStack[] {
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
        getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 13) };

    // "Compact Fusion Computer MK-V" - 32023
    public static final ItemStack[] Compact_Fusion_Computer_MKV = new ItemStack[] {
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
        getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 14) };

    // "Large Essentia Smeltery" - 32024
    public static final ItemStack[] Large_Essentia_Smeltery = new ItemStack[] {
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
        getModItem(GoodGenerator.ID, "essentiaFilterCasing", 1L, 0) };

    // "Coolant Tower" - 32025
    public static final ItemStack[] Coolant_Tower = new ItemStack[] {
        // "Coolant Tower"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32025),
        // "Tungstencarbide Frame Box"
        getModItem(GregTech.ID, "gt.blockframes", 1L, 370),
        // "Light Concrete"
        getModItem(GregTech.ID, "gt.blockconcretes", 1L, 8) };

    // "Component Assembly Line" - 32026
    public static final ItemStack[] Component_Assembly_Line = new ItemStack[] {
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
        getModItem(GoodGenerator.ID, "componentAssemblylineCasing", 1L, 13) };

    // "Semi-Stable Antimatter Stabilization Sequencer" - 32027
    public static final ItemStack[] Semi_Stable_Antimatter_Stabilization_Sequencer = new ItemStack[] {
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
        getModItem(GoodGenerator.ID, "antimatterContainmentCasing", 1L, 0) };

    // "Shielded Lagrangian Annihilation Matrix" - 32028
    public static final ItemStack[] Shielded_Lagrangian_Annihilation_Matrix = new ItemStack[] {
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
        getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0) };
}
