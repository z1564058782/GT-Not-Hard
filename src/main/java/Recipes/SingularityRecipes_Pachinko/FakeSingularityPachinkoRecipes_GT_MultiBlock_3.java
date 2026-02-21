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
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.OneToManyItemsFrontend_Large;

// GregTech Multi-Block Machine 10000~19999
public class FakeSingularityPachinkoRecipes_GT_MultiBlock_3 {

    public static final RecipeMap<RecipeMapBackend> addFakePachinkoRecipes_GT_MultiBlock_3 = RecipeMapBuilder
        .of("Singularity of Pachinko_GT_MultiBlock_3")
        .maxIO(1, 135, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static void addFakePachinkoRecipes_GT_MultiBlock_3() {
        // Digester - 10500
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 10500))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10500), // Digester
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 11), // "Heat Proof Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0), // "Robust Tungstensteel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1), // "Clean Stainless Steel Machine Casing"

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
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 13))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Dissolution Tank" - 10501
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 10501))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10501), // "Dissolution Tank"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 11), // "Heat Proof Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1), // "Clean Stainless Steel Machine Casing"

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
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Linear Accelerator" - 10505
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 10505))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10505), // "Linear Accelerator"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10503), // "LuV Beamline Input Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10504), // "LuV Beamline Output Hatch"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 15), // "Superconducting Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 10), // "Grate Machine Casing"
                getModItem(GTNHLanthanides.ID, "casing.shielded_accelerator", 1L), // "Shielded Accelerator Casing"
                getModItem(GTNHLanthanides.ID, "casing.electrode", 1L), // "Electrode Casing"
                getModItem(GTNHLanthanides.ID, "casing.coolant_delivery", 1L), // "Coolant Delivery Casing"
                getModItem(GTNHLanthanides.ID, "tile.casing.shielded_accelerator_glass", 1L), // "Shielded Accelerator
                                                                                              // Glass"

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
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Source Chamber" - 10506
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 10506))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10506), // "Source Chamber"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10504), // "LuV Beamline Output Hatch"
                getModItem(GTNHLanthanides.ID, "casing.shielded_accelerator", 1L), // "Shielded Accelerator Casing"
                getModItem(GTNHLanthanides.ID, "casing.electrode", 1L), // "Electrode Casing"
                getModItem(GTNHLanthanides.ID, "tile.casing.shielded_accelerator_glass", 1L) // "Shielded Accelerator
                                                                                             // Glass"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // Synchrotron - 10507
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 10507))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10507), // Synchrotron
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10503), // "LuV Beamline Input Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10504), // "LuV Beamline Output Hatch"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 15), // "Superconducting Coil Block"
                getModItem(GTNHLanthanides.ID, "casing.shielded_accelerator", 1L), // "Shielded Accelerator Casing"
                getModItem(GTNHLanthanides.ID, "casing.coolant_delivery", 1L), // "Coolant Delivery Casing"
                getModItem(GTNHLanthanides.ID, "casing.antenna_t2", 1L), // "Antenna Casing (T2)"
                getModItem(GTNHLanthanides.ID, "casing.niobium_cavity", 1L), // "Niobium Cavity Machine Casing"

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
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Target Chamber" - 10508
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 10508))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10508), // "Target Chamber"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10503), // "LuV Beamline Input Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10509), // "Focus Input Bus"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 10), // "Grate Machine Casing"
                getModItem(GTNHLanthanides.ID, "casing.shielded_accelerator", 1L), // "Shielded Accelerator Casing"
                getModItem(GTNHLanthanides.ID, "tile.casing.shielded_accelerator_glass", 1L), // "Shielded Accelerator
                                                                                              // Glass"
                getModItem(GTNHLanthanides.ID, "casing.target_receptacle", 1L), // "Target Receptacle"
                getModItem(GTNHLanthanides.ID, "casing.focus_manipulator", 1L), // "Focus Manipulator"
                getModItem(GTNHLanthanides.ID, "casing.target_holder", 1L), // "Target Holder"
                getModItem(GTNHLanthanides.ID, "casing.focus_holder", 1L), // "Focus Holder"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 1) // "Titanium Reinforced Borosilicate Glass Block"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Electric Air Filter T1" - 12020
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12020))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12020), // "Electric Air Filter T1"
                getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 0), // "Air Filter Turbine Casing"
                getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 1) // "Air Filter Vent Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Electric Air Filter T2" - 12021
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12021))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12021), // "Electric Air Filter T2"
                getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 3), // "Advanced Air Filter Turbine Casing"
                getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 4) // "Advanced Air Filter Vent Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Electric Air Filter T3" - 12022
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12022))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12022), // "Electric Air Filter T3"
                getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 5), // "Super Air Filter Turbine Casing"
                getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 6) // "Super Air Filter Vent Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Manual Transformer" - 12697
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12697))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12697), // "Manual Transformer"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 2), // "MV Machine Casing"
                getModItem(BartWorks.ID, "BW_Machinery_Casings", 1L, 0), // "Nickel-Zinc Ferrite Block"
                getModItem(BartWorks.ID, "BW_Machinery_Casings", 1L, 1) // "Transformer-Winding Block"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // Windmill - 12698
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12698))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12698), // Windmill
                getModItem(BartWorks.ID, "BWRotorBlock", 1L, 0), // "Primitive Kinetic Shaftbox"
                getModItem(Minecraft.ID, "brick_block", 1L), // Bricks
                getModItem(Minecraft.ID, "planks", 1L, 0), // "Oak Planks"
                getModItem(Minecraft.ID, "hardened_clay", 1L) // Terracotta
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Bacterial Vat" - 12712
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12712))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12712), // "Bacterial Vat"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12713), // "Radio Hatch"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1), // "Clean Stainless Steel Machine Casing"

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
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Deep Earth Heating Pump" - 12729
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12729))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12729), // "Deep Earth Heating Pump"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 145), // "Data Access Hatch"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 11), // "Heat Proof Machine Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 81) // "Tungsten Frame Box"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Mega Electric Blast Furnace" - 12730
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12730))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12730), // "Mega Electric Blast Furnace"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 11), // "Heat Proof Machine Casing"

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
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Mega Vacuum Freezer" - 12731
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12731))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12731), // "Mega Vacuum Freezer"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 1), // "Frost Proof Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 14) // "Infinity Cooled Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Large Naquadah Reactor" - 12732
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12732))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12732), // "Large Naquadah Reactor"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 15), // "Tungstensteel Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 12), // "Radiation Proof Machine Casing"
                getModItem(GoodGenerator.ID, "MAR_Casing", 1L, 0), // "Field Restriction Casing"
                // "Radiation Proof Steel Frame Box"
                getModItem(GoodGenerator.ID, "radiationProtectionSteelFrame", 1L, 0))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Thorium High Temperature Reactor" - 12733
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12733))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12733), // "Thorium High Temperature Reactor"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 12) // "Radiation Proof Machine Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Electric Implosion Compressor" - 12734
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12734))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12734), // "Electric Implosion Compressor"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0), // "Solid Steel Machine Casing"
                getModItem(BartWorks.ID, "BW_Machinery_Casings", 1L, 0), // "Nickel-Zinc Ferrite Block"
                getModItem(BartWorks.ID, "BW_Machinery_Casings", 1L, 1), // "Transformer-Winding Block"
                getModItem(GregTech.ID, "gt.blockmetal5", 1L, 2), // "Block of Neutronium"
                getModItem(Avaritia.ID, "Resource_Block", 1L, 1), // "Infinity Block"
                getModItem(GregTech.ID, "gt.blockmetal9", 1L, 4), // "Block of Transcendent Metal"
                getModItem(GregTech.ID, "gt.blockmetal9", 1L, 3), // "Block of SpaceTime"
                getModItem(GregTech.ID, "gt.blockmetal9", 1L, 8) // "Block of Universium"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Circuit Assembly Line" - 12735
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12735))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12735), // "Circuit Assembly Line"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0), // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 5), // "Assembly Line Casing"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 10), // "Grate Machine Casing"

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
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Mega Distillation Tower" - 12738
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12738))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12738), // "Mega Distillation Tower"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1) // "Clean Stainless Steel Machine Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Void Miner III" - 12739
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12739))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12739), // "Void Miner III"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 2), // "Mining Neutronium Casing"
                getModItem(GregTech.ID, "gt.blockcasings11", 1L, 7), // "Black Plutonium Item Pipe Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 319), // "Adamantium Frame Box"
                getModItem(BartWorks.ID, "bw.werkstoffblockscasing.01", 1L, 31850), // "Bolted Iridium Casing"
                getModItem(BartWorks.ID, "bw.werkstoffblockscasingadvanced.01", 1L, 31850) // "Rebolted Iridium Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Void Miner II" - 12740
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12740))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12740), // "Void Miner II"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 3), // "Mining Black Plutonium Casing"
                getModItem(GregTech.ID, "gt.blockcasings11", 1L, 7), // "Black Plutonium Item Pipe Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 325), // "Naquadah Alloy Frame Box"
                getModItem(BartWorks.ID, "bw.werkstoffblockscasing.01", 1L, 32091), // "Bolted Naquadah Alloy Casing"
                getModItem(BartWorks.ID, "bw.werkstoffblockscasingadvanced.01", 1L, 32091) // "Rebolted Naquadah Alloy
                                                                                           // Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Void Miner I" - 12741
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12741))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12741), // "Void Miner I"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 14), // "Mining Osmiridium Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 317), // "Osmiridium Frame Box"
                getModItem(BartWorks.ID, "bw.werkstoffblockscasing.01", 1L, 32083), // "Bolted Osmiridium Casing"
                getModItem(BartWorks.ID, "bw.werkstoffblockscasingadvanced.01", 1L, 32083) // "Rebolted Osmiridium
                                                                                           // Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "High Temperature Gas-cooled Reactor" - 12791
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12791))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12791), // "High Temperature Gas-cooled Reactor"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 5) // "Europium Reinforced Radiation Proof Machine
                                                                   // Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Extreme Industrial Greenhouse" - 12792
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12792))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12792), // "Extreme Industrial Greenhouse"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1), // "Clean Stainless Steel Machine Casing"
                getModItem(ProjectRedIllumination.ID, "projectred.illumination.lamp", 1L, 10), // "Purple Lamp"
                getModItem(RandomThings.ID, "fertilizedDirt", 1L), // "Fertilized Dirt"

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
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Research Completer" - 13001
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 13001))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 13001), // "Research Completer"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 8), // "Magical Machine Casing"
                getModItem(Thaumcraft.ID, "blockCosmeticOpaque", 1L, 2) // "Warded Glass"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Solid-Oxide Fuel Cell Mk I" - 13101
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 13101))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 13101), // "Solid-Oxide Fuel Cell Mk I"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1), // "Clean Stainless Steel Machine Casing"
                getModItem(IndustrialCraft2.ID, "blockAlloyGlass", 1L), // "Reinforced Glass"
                getModItem(KekzTech.ID, "kekztech_yszceramicelectrolyteunit_block", 1L) // "YSZ Ceramic Electrolyte
                                                                                        // Unit"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Solid-Oxide Fuel Cell Mk II" - 13102
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 13102))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 13102), // "Solid-Oxide Fuel Cell Mk II"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0), // "Robust Tungstensteel Machine Casing"
                getModItem(IndustrialCraft2.ID, "blockAlloyGlass", 1L), // "Reinforced Glass"
                getModItem(KekzTech.ID, "kekztech_gdcceramicelectrolyteunit_block", 1L) // "GDC Ceramic Electrolyte
                                                                                        // Unit"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // T.F.F.T - 13104
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 13104))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 13104), // T.F.F.T
                getModItem(KekzTech.ID, "kekztech_tfftstoragefield_block", 1L, 0), // "T.F.F.T Casing"

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
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Lapotronic Supercapacitor" - 13106
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 13106))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 13106), // "Lapotronic Supercapacitor"
                getModItem(KekzTech.ID, "kekztech_lapotronicenergyunit_block", 1L, 0), // "Lapotronic Super Capacitor
                                                                                       // Casing"

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
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Miniature Wormhole Generator" - 13115
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 13115))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 13115), // "Miniature Wormhole Generator"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 7), // "Fusion Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 5), // "Europium Reinforced Radiation Proof Machine
                                                                    // Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 0), // "High Power Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 4), // "Molecular Casing"

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
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Mega Chemical Reactor" - 13366
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 13366))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 13366), // "Mega Chemical Reactor"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 7), // "Fusion Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 0), // "Chemically Inert Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 1), // "PTFE Pipe Casing"

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
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Mega Oil Cracker" - 13367
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 13367))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 13367), // "Mega Oil Cracker"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1), // "Clean Stainless Steel Machine Casing"

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
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Advanced Assembly Line" - 13532
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 13532))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 13532), // "Advanced Assembly Line"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 145), // "Data Access Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 146), // "Advanced Data Access Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 147), // "Automatable Data Access Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15442), // "Assembly line Reception Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15446), // "Wireless Assembly line Reception Connector"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0), // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 5), // "Assembly Line Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 9), // "Assembler Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 10), // "Grate Machine Casing"

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
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Dyson Swarm Ground Unit" - 14001
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 14001))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14001), // "Dyson Swarm Ground Unit"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15440), // "Optical Reception Connector"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 8), // "Awakened Draconium Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings6", 1L, 10), // "Hermetic Casing X"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 28), // "Titanium Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 374), // "HSS-S Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 985), // "Superconductor Base UHV Frame Box"
                getModItem(GTNHIntergalactic.ID, "dysonswarmparts", 1L, 0), // "Dyson Swarm Energy Receiver Base Casing"
                getModItem(GTNHIntergalactic.ID, "dysonswarmparts", 1L, 1), // "Dyson Swarm Energy Receiver Dish Block"
                getModItem(GTNHIntergalactic.ID, "dysonswarmparts", 1L, 2), // "Dyson Swarm Module Deployment Unit Base
                                                                            // Casing"
                getModItem(GTNHIntergalactic.ID, "dysonswarmparts", 1L, 3), // "Dyson Swarm Module Deployment Unit Core"
                getModItem(GTNHIntergalactic.ID, "dysonswarmparts", 1L, 4), // "Dyson Swarm Module Deployment Unit
                                                                            // Superconducting Magnet"
                getModItem(GTNHIntergalactic.ID, "dysonswarmparts", 1L, 5), // "Dyson Swarm Control Center Base Casing"
                getModItem(GTNHIntergalactic.ID, "dysonswarmparts", 1L, 6), // "Dyson Swarm Control Center Primary
                                                                            // Windings"
                getModItem(GTNHIntergalactic.ID, "dysonswarmparts", 1L, 7), // "Dyson Swarm Control Center Secondary
                                                                            // Windings"
                getModItem(GTNHIntergalactic.ID, "dysonswarmparts", 1L, 8), // "Dyson Swarm Control Center Toroid
                                                                            // Casing"
                getModItem(GTNHIntergalactic.ID, "dysonswarmparts", 1L, 9) // "Ultra High Strength Concrete Floor"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Planetary Gas Siphon" - 14002
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 14002))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14002), // "Planetary Gas Siphon"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 316), // "Tungstensteel Frame Box"
                getModItem(GTNHIntergalactic.ID, "gassiphoncasing", 1L), // "Planetary Siphon Casing"
                getModItem(BartWorks.ID, "bw.werkstoffblockscasingadvanced.01", 1L, 88) // "Rebolted Rhodium-Plated
                                                                                        // Palladium Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Space Elevator" - 14003
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 14003))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14003), // "Space Elevator"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15431), // "Uncertainty Resolver X"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15440), // "Optical Reception Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15441), // "Optical Transmission Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15445), // "Cloud Computation Client Hatch"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 129), // "Neutronium Frame Box"
                getModItem(GTNHIntergalactic.ID, "spaceelevatorcable", 1L), // "Space Elevator Cable"
                getModItem(GTNHIntergalactic.ID, "dysonswarmparts", 1L, 9), // "Ultra High Strength Concrete Floor"
                getModItem(GTNHIntergalactic.ID, "gt.blockcasingsSE", 1L, 0), // "Space Elevator Base Casing"
                getModItem(GTNHIntergalactic.ID, "gt.blockcasingsSE", 1L, 1), // "Space Elevator Support Structure"
                getModItem(GTNHIntergalactic.ID, "gt.blockcasingsSE", 1L, 2), // "Space Elevator Internal Structure"

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
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14014))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Large Molecular Assembler" - 14101
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 14101))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14101), // "Large Molecular Assembler"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0), // "Robust Tungstensteel Machine Casing"
                getModItem(AppliedEnergistics2.ID, "tile.BlockQuartzLamp", 1L) // "Vibrant Quartz Glass"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Extreme Entity Crusher" - 14201
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 14201))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14201), // "Extreme Entity Crusher"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0), // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 305), // "Steel Frame Box"
                getModItem(ExtraUtilities.ID, "spike_base_diamond", 1L), // "Diamond Spike"

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
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Industrial Apicultural Acclimatiser and Drone Domestication Station" - 14202
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 14202))
            .itemOutputs(
                // "Industrial Apicultural Acclimatiser and Drone Domestication Station"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14202),
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 10), // "Bronze Plated Bricks"
                getModItem(Forestry.ID, "apiculture", 1L, 0), // Apiary
                getModItem(Forestry.ID, "alveary", 1L, 0), // Alveary
                getModItem(Forestry.ID, "alveary", 1L, 3), // "Alveary Fan"
                getModItem(Forestry.ID, "alveary", 1L, 4), // "Alveary Heater"
                getModItem(Forestry.ID, "alveary", 1L, 5), // "Alveary Hygroregulator"
                getModItem(Forestry.ID, "alveary", 1L, 6), // "Alveary Stabiliser"
                getModItem(Minecraft.ID, "dirt", 1L, 0), // Dirt
                getModItem(Minecraft.ID, "planks", 1L, 0), // "Oak Planks"
                getModItem(Minecraft.ID, "wooden_slab", 1L, 0), // "Oak Slab"

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
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Active Transformer" - 15300
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15300))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15300), // "Active Transformer"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 15), // "Superconducting Coil Block"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 0) // "High Power Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Weighted Network Switch With QoS" - 15310
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15310))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15310), // "Weighted Network Switch With QoS"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15440), // "Optical Reception Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15441), // "Optical Transmission Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15444), // "Cloud Computation Server Hatch"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 1), // "Computer Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 3) // "Advanced Computer Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Quantum Computer" - 15311
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15311))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15311), // "Quantum Computer"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15431), // "Uncertainty Resolver X"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15440), // "Optical Reception Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15441), // "Optical Transmission Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15444), // "Cloud Computation Server Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15450), // "Computer Rack"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 1), // "Computer Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 2), // "Computer Heat Vent"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 3) // "Advanced Computer Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Microwave Grinder" - 15312
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15312))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15312), // "Microwave Grinder"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1) // "Clean Stainless Steel Machine Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Data Bank" - 15313
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15313))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15313), // "Data Bank"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 145), // "Data Access Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 146), // "Advanced Data Access Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 147), // "Automatable Data Access Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15442), // "Assembly line Reception Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15443), // "Data Bank Transmission Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15447), // "Wireless Data Bank Transmission Connector"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 0), // "High Power Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 1), // "Computer Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 2) // "Computer Heat Vent"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Tesla Tower" - 15314
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15314))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15314), // "Tesla Tower"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15452), // "Capacitor Hatch"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 28), // "Titanium Frame Box"
                getModItem(TecTech.ID, "gt.blockcasingsBA0", 1L, 6), // "Tesla Base Casing"
                getModItem(TecTech.ID, "gt.blockcasingsBA0", 1L, 7), // "Tesla Toroid Casing"
                getModItem(TecTech.ID, "gt.blockcasingsBA0", 1L, 8), // "Tesla Secondary Windings"

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
                getModItem(TecTech.ID, "gt.blockcasingsBA0", 1L, 9))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Static Network Switch With QoS" - 15315
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15315))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15315), // "Static Network Switch With QoS"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15440), // "Optical Reception Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15441), // "Optical Transmission Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15444), // "Cloud Computation Server Hatch"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 1), // "Computer Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 3) // "Advanced Computer Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Research Station" - 15331
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15331))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15331), // "Research Station"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15440), // "Optical Reception Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15441), // "Optical Transmission Connector"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15444), // "Cloud Computation Server Hatch"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 1), // "Computer Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 3) // "Advanced Computer Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Energy Infuser" - 15350
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15350))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15350), // "Energy Infuser"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 0), // "High Power Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 4), // "Molecular Casing"
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 7) // "Molecular Coil"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Eye of Harmony" - 15410
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15410))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15410), // "Eye of Harmony"
                getModItem(TecTech.ID, "gt.blockcasingsBA0", 1L, 10), // "Reinforced Temporal Structure Casing"
                getModItem(TecTech.ID, "gt.blockcasingsBA0", 1L, 11), // "Reinforced Spatial Structure Casing"
                getModItem(TecTech.ID, "gt.blockcasingsBA0", 1L, 12), // "Infinite Spacetime Energy Boundary Casing"

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
                getModItem(TecTech.ID, "gt.stabilisation_field_generator", 1L, 8))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Forge of the Gods" - 15411
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15411))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15411), // "Forge of the Gods"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 0), // "Singularity Reinforced Stellar Shielding Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 1), // "Celestial Matter Guidance Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 2), // "Boundless Gravitationally Severed Structure
                                                                    // Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 3), // "Transcendentally Amplified Magnetic Confinement
                                                                    // Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 4), // "Stellar Energy Siphon Casing"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 5), // "Remote Graviton Flow Modulator"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 6), // "Medial Graviton Flow Modulator"
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 7), // "Central Graviton Flow Modulator"
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
                getModItem(TecTech.ID, "gt.godforgecasing", 1L, 8))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Entropic Processor" - 15750
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15750))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15750), // "Entropic Processor"
                getModItem(GregTech.ID, "gt.blockcasings12", 1L, 10), // "Alchemically Resistant Thaumium Casing"
                getModItem(GregTech.ID, "gt.blockcasings12", 1L, 11), // "Alchemically Inert Void Casing"
                getModItem(GregTech.ID, "gt.blockcasings12", 1L, 12), // "Alchemically Immune Ichorium Casing"
                getModItem(Thaumcraft.ID, "blockCosmeticOpaque", 1L, 2), // "Warded Glass"
                getModItem(Thaumcraft.ID, "blockMetalDevice", 1L, 3), // "Advanced Alchemical Construct"
                getModItem(Thaumcraft.ID, "blockMetalDevice", 1L, 9) // "Alchemical Construct"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Decay Warehouse" - 15751
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15751))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15751), // "Decay Warehouse"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 12), // "Radiation Proof Machine Casing"

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
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 128))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Naquadah Fuel Refinery" - 16999
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 16999))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 16999), // "Naquadah Fuel Refinery"
                getModItem(GoodGenerator.ID, "FRF_Casings", 1L, 0), // "Naquadah Fuel Refinery Casing"
                getModItem(GoodGenerator.ID, "fieldRestrictingGlass", 1L, 0), // "Field Restriction Glass"
                getModItem(GoodGenerator.ID, "FRF_Coil_1", 1L, 0), // "Field Restriction Coil"
                getModItem(GoodGenerator.ID, "FRF_Coil_2", 1L, 0), // "Advanced Field Restriction Coil"
                getModItem(GoodGenerator.ID, "FRF_Coil_3", 1L, 0), // "Ultimate Field Restriction Coil"
                getModItem(GoodGenerator.ID, "FRF_Coil_4", 1L, 0) // "Temporal Field Restriction Coil"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Hydro Dam" - 17000
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 17000))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17000), // "Hydro Dam"
                getModItem(GregTech.ID, "gt.blockconcretes", 1L, 8) // "Light Concrete"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Hydro Pump" - 17003
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 17003))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17003), // "Hydro Pump (MV)"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 1), // "Frost Proof Machine Casing"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17004), // "Hydro Pump (HV)"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1), // "Clean Stainless Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17005), // "Hydro Pump (EV)"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2), // "Stable Titanium Machine Casing"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17006), // "Hydro Pump (IV)"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0), // "Robust Tungstensteel Machine Casing"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17007), // "Hydro Pump (LuV)"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 6), // "Advanced Rhodium Plated Palladium Machine
                                                                    // Casing"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17008), // "Hydro Pump (ZPM)"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 7), // "Hydro Pump (ZPM)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17009), // "Hydro Pump (UV)"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 14) // "Mining Osmiridium Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);

        // "Hydro Turbine" - 17019
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 17019))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17019), // "Hydro Turbine (MV)"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 1), // "Frost Proof Machine Casing"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17020), // "Hydro Turbine (HV)"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1), // "Clean Stainless Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17021), // "Hydro Turbine (EV)"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2), // "Stable Titanium Machine Casing"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17022), // "Hydro Turbine (IV)"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0), // "Robust Tungstensteel Machine Casing"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17023), // "Hydro Turbine (LuV)"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 6), // "Advanced Rhodium Plated Palladium Machine
                                                                    // Casing"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17024), // "Hydro Turbine (ZPM)"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 7), // "Hydro Pump (ZPM)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 17025), // "Hydro Turbine (UV)"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 14) // "Mining Osmiridium Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_3);
    }
}
