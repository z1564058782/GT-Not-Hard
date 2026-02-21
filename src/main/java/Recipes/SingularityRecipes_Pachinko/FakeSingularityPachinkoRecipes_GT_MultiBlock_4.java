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
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.OneToManyItemsFrontend_Large;

// GregTech Multi-Block Machine 20000~32768
public class FakeSingularityPachinkoRecipes_GT_MultiBlock_4 {

    public static final RecipeMap<RecipeMapBackend> addFakePachinkoRecipes_GT_MultiBlock_4 = RecipeMapBuilder
        .of("Singularity of Pachinko_GT_MultiBlock_4")
        .maxIO(1, 135, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static void addFakePachinkoRecipes_GT_MultiBlock_4() {
        // "Dangote Distillus" - 31021
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31021))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31021), // "Dangote Distillus"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1) // "Clean Stainless Steel Machine Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // Zyngen - 31023
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31023))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31023), // Zyngen
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 1), // "Inconel Reinforced Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blocktieredcasings.1", 1L, 4), // "Integral Encasement V"

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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Large Semifluid Burner" - 31026
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31026))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31026), // "Large Semifluid Burner"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 3), // "Steel Gear Box Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2), // "Stable Titanium Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 13) // "Engine Intake Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "IsaMill Grinding Machine" - 31027
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31027))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31027), // "IsaMill Grinding Machine"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31029), // "Ball Housing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 0), // "IsaMill Exterior Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 1), // "IsaMill Piping"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 2) // "IsaMill Gearbox"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Flotation Cell Regulator" - 31028
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31028))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31028), // "Flotation Cell Regulator"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 9), // "Flotation Cell Casings"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 1) // "Inconel Reinforced Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Sparge Tower Controller" - 31035
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31035))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31035), // "Sparge Tower Controller"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 4) // "Sparge Tower Exterior Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Steam Grinder" - 31041
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31041))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31041), // "Steam Grinder"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 10), // "Bronze Plated Bricks"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0) // "Solid Steel Machine Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Elemental Duplicator" - 31050
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31050))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31050), // "Elemental Duplicator"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31051), // "Data Orb Repository"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 8), // "Matter Generation Coil"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 9), // "Matter Fabricator Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 3), // "Elemental Confinement Shell"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 12), // "High Voltage Current
                                                                                       // Capacitor"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 13), // "Particle Containment Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.3", 1L, 2), // "Resonance Chamber III"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.3", 1L, 6) // "Modulator III"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // Boldarnator - 31065
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31065))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31065), // Boldarnator
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 0), // "Thermal Processing Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 11) // "Thermal Containment Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Industrial 3D Copying Machine" - 31069
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31069))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31069), // "Industrial 3D Copying Machine"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 5) // "Sturdy Printer Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Molecular Transformer" - 31072
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31072))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31072), // "Molecular Transformer"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0), // "Robust Tungstensteel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 3), // "TPV-Alloy Coil Block"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 11), // "Molecular Containment Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 12), // "High Voltage Current
                                                                                       // Capacitor"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 13), // "Particle Containment Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.3", 1L, 0), // "Resonance Chamber I"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.3", 1L, 4) // "Modulator I"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "XL Turbo Gas Turbine" - 31073
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31073))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31073), // "XL Turbo Gas Turbine"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30010), // "Rotor Assembly"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 0), // "Turbine Shaft"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 3) // "Reinforced Gas Turbine Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "XL Turbo Plasma Turbine" - 31074
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31074))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31074), // "XL Turbo Plasma Turbine"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30010), // "Rotor Assembly"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 0), // "Turbine Shaft"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 4) // "Reinforced Plasma Turbine
                                                                                     // Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Industrial Sledgehammer" - 31075
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31075))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31075), // "Industrial Sledgehammer"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 6), // "Forge Casing"
                getModItem(Minecraft.ID, "anvil", 1L, 1), // "Slightly Damaged Anvil"
                getModItem(Railcraft.ID, "anvil", 1L, 2), // "Very Damaged Steel Anvil"
                getModItem(ThaumicBases.ID, "thaumicAnvil", 1L, 3), // "Thaumium Anvil"
                getModItem(ThaumicBases.ID, "voidAnvil", 1L, 4), // "Void Metal Anvil"
                getModItem(EnderIO.ID, "blockDarkSteelAnvil", 1L, 3) // "Dark Steel Anvil"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "XL Turbo SC Steam Turbine" - 31076
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31076))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31076), // "XL Turbo SC Steam Turbine"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30010), // "Rotor Assembly"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 0), // "Turbine Shaft"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 15) // "Reinforced SC Turbine Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Thermic Heating Device" - 31077
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31077))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31077), // "Thermic Heating Device"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 11), // "Thermal Containment Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 2) // "Multi-Use Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Steam Squasher" - 31078
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31078))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31078), // "Steam Squasher"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 10), // "Bronze Plated Bricks"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0) // "Solid Steel Machine Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Whakawhiti Wera XL" - 31079
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31079))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31079), // "Whakawhiti Wera XL"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 15), // "Tungstensteel Pipe Casing"
                getModItem(GTPlusPlus.ID, "blockFrameGtTalonite", 1L), // "Talonite Frame Box"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 14) // "Reinforced Heat Exchanger
                                                                                      // Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Steam Separator" - 31080
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31080))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31080), // "Steam Separator"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 10), // "Bronze Plated Bricks"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 2), // "Bronze Gear Box Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 12), // "Bronze Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 13), // "Bronze Firebox Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0), // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 3), // "Steel Gear Box Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 13), // "Steel Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 14) // "Steel Firebox Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Steam Purifier" - 31082
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31082))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31082), // "Steam Purifier"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 10), // "Bronze Plated Bricks"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 2), // "Bronze Gear Box Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 12), // "Bronze Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0), // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 3), // "Steel Gear Box Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 13), // "Steel Pipe Casing"
                getModItem(Minecraft.ID, "glass", 1L) // "Glass"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Steam Presser" - 31083
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31083))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31083), // "Steam Presser"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 10), // "Bronze Plated Bricks"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0), // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 12), // "Bronze Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 13), // "Steel Pipe Casing"
                getModItem(GregTech.ID, "gt.blockmetal6", 1L, 13), // "Block of Steel"
                getModItem(Minecraft.ID, "iron_block", 1L) // "Block of Iron"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Steam Blender" - 31084
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31084))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31084), // "Steam Blender"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 10), // "Bronze Plated Bricks"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 2), // "Bronze Gear Box Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 12), // "Bronze Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0), // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 3), // "Steel Gear Box Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 13), // "Steel Pipe Casing"
                getModItem(Minecraft.ID, "iron_block", 1L) // "Block of Iron"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Water Pump" - 31085
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31085))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31085), // "Water Pump"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 2), // "Primitive Wooden Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 300), // "Bronze Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 305) // "Steel Frame Box"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Steam Fuser" - 31086
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31086))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31086), // "Steam Fuser"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 10), // "Bronze Plated Bricks"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0), // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 12), // "Bronze Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 13), // "Steel Pipe Casing"

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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Mega Alloy Blast Smelter" - 31150
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31150))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31150), // "Mega Alloy Blast Smelter"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 14), // "Blast Smelter Heat Containment Coil"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 15), // "Blast Smelter Casing Block"

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
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 13))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Quantum Force Transformer" - 31151
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31151))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31151), // "Quantum Force Transformer"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9416), // "Bulk Catalyst Housing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 12), // "Bulk Production Frame"
                // "Quantum Force Transformer Coil Casings"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.4", 1L, 4),
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 7), // "Neutron Pulse Manipulator"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 8), // "Cosmic Fabric Manipulator"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 9), // "Infinity Infused Manipulator"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 10), // "SpaceTime Continuum Ripper"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 11), // "Neutron Shielding Core"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 12), // "Cosmic Fabric Shielding Core"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 13), // "Infinity Infused Shielding Core"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 14), // "SpaceTime Bending Core"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.5", 1L, 15) // "Force Field Glass"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Universal Chemical Fuel Engine" - 32001
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32001))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32001), // "Universal Chemical Fuel Engine"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 4), // "Titanium Gear Box Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 14), // "Titanium Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2), // "Stable Titanium Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 13), // "Engine Intake Casing"
                getModItem(GoodGenerator.ID, "titaniumPlatedCylinder", 1L, 0) // "Titanium Plated Cylinder"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Neutron Activator" - 32013
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32013))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32013), // "Neutron Activator"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32012), // "Neutron Sensor"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 6), // "Processor Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1), // "Clean Stainless Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 305), // "Steel Frame Box"
                getModItem(GoodGenerator.ID, "speedingPipe", 1L, 0), // "Speeding Pipe Casing"

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
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // YOTTank - 32014
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32014))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32014), // YOTTank
                getModItem(GregTech.ID, "gt.blockframes", 1L, 305), // "Steel Frame Box"
                getModItem(GoodGenerator.ID, "yottaFluidTankCasing", 1L, 0), // "YOTTank Casing"

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
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Large Supercritical Steam Turbine" - 32016
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32016))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32016), // "Large Supercritical Steam Turbine"
                getModItem(GoodGenerator.ID, "supercriticalFluidTurbineCasing", 1L, 0) // "SC Turbine Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Extreme Heat Exchanger" - 32017
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32017))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32017), // "Extreme Heat Exchanger"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 15), // "Tungstensteel Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0), // "Robust Tungstensteel Machine Casing"
                getModItem(GoodGenerator.ID, "pressureResistantWalls", 1L, 0), // "Pressure Resistant Wall"

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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Precise Auto-Assembler MT-3662" - 32018
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32018))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32018), // "Precise Auto-Assembler MT-3662"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 316), // "Tungstensteel Frame Box"

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
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Compact Fusion Computer MK-I Prototype" - 32019
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32019))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32019), // "Compact Fusion Computer MK-I Prototype"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9401), // "Drone DownLink Module"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 6), // "LuV Machine Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 325), // "Naquadah Alloy Frame Box"
                getModItem(GoodGenerator.ID, "compactFusionCoil", 1L, 0), // "Ameliorated Superconduct Coil"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 3) // "Rhodium-Plated Palladium Reinforced Borosilicate
                                                                 // Glass Block"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Compact Fusion Computer MK-II" - 32020
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32020))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32020), // "Compact Fusion Computer MK-II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9401), // "Drone DownLink Module"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 6), // "Fusion Machine Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 328), // "Duranium Frame Box"
                getModItem(GoodGenerator.ID, "compactFusionCoil", 1L, 1), // "Compact Fusion Coil"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 4) // "Iridium Reinforced Borosilicate Glass Block"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Compact Fusion Computer MK-III" - 32021
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32021))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32021), // "Compact Fusion Computer MK-III"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9401), // "Drone DownLink Module"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 8), // "Fusion Machine Casing MK II"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 129), // "Neutronium Frame Box"
                getModItem(GoodGenerator.ID, "compactFusionCoil", 1L, 2), // "Advanced Compact Fusion Coil"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 5) // "Osmium Reinforced Borosilicate Glass Block"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Compact Fusion Computer MK-IV Prototype" - 32022
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32022))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32022), // "Compact Fusion Computer MK-IV Prototype"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9401), // "Drone DownLink Module"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 12), // "Fusion Machine Casing MK III"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 394), // "Infinity Catalyst Frame Box"
                getModItem(GoodGenerator.ID, "compactFusionCoil", 1L, 3), // "Compact Fusion Coil MK-II Prototype"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 13) // "Neutronium Reinforced Borosilicate Glass Block"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Compact Fusion Computer MK-V" - 32023
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32023))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32023), // "Compact Fusion Computer MK-V"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9401), // "Drone DownLink Module"
                getModItem(GregTech.ID, "gt.blockcasings6", 1L, 0), // "Fusion Machine Casing MK IV"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 397), // "Infinity Frame Box"
                getModItem(GoodGenerator.ID, "compactFusionCoil", 1L, 4), // "Compact Fusion Coil MK-II Finaltype"
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 14) // "Cosmic Neutronium Reinforced Borosilicate Glass
                                                                  // Block"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Large Essentia Smeltery" - 32024
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32024))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32024), // "Large Essentia Smeltery"
                getModItem(Thaumcraft.ID, "blockCosmeticOpaque", 1L, 2), // "Warded Glass"
                getModItem(ThaumicBases.ID, "advAlchFurnace", 1L), // "Thaumium Alchemical Furnace"
                getModItem(GoodGenerator.ID, "magicCasing", 1L, 0), // "Magic Casing"
                getModItem(GoodGenerator.ID, "essentiaCell", 1L, 0), // "Novice Essentia Diffusion Cell"
                getModItem(GoodGenerator.ID, "essentiaFilterCasing", 1L, 0) // "Essentia Filter Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Coolant Tower" - 32025
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32025))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32025), // "Coolant Tower"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 370), // "Tungstencarbide Frame Box"
                getModItem(GregTech.ID, "gt.blockconcretes", 1L, 8) // "Light Concrete"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Component Assembly Line" - 32026
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32026))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32026), // "Component Assembly Line"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 5), // "Assembly Line Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 9), // "Assembler Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 7), // "Advanced Iridium Plated Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 0), // "PBI Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 1), // "Advanced Filter Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 316), // "Tungstensteel Frame Box"

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
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Semi-Stable Antimatter Stabilization Sequencer" - 32027
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32027))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32027), // "Semi-Stable Antimatter Stabilization
                                                                        // Sequencer"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32029), // "Antimatter Hatch"
                getModItem(GoodGenerator.ID, "magneticFluxCasing", 1L, 0), // "Magnetic Flux Casing"
                getModItem(GoodGenerator.ID, "gravityStabilizationCasing", 1L, 0), // "Gravity Stabilization Casing"
                getModItem(GoodGenerator.ID, "protomatterActivationCoil", 1L, 0), // "Protomatter Activation Coil"
                getModItem(GoodGenerator.ID, "antimatterContainmentCasing", 1L, 0) // "Antimatter Containment Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);

        // "Shielded Lagrangian Annihilation Matrix" - 32028
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32028))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32028), // "Shielded Lagrangian Annihilation Matrix"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 1), // "Advanced Filter Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 327), // "Naquadria Frame Box"
                getModItem(GoodGenerator.ID, "gravityStabilizationCasing", 1L, 0), // "Gravity Stabilization Casing"
                getModItem(GoodGenerator.ID, "magneticFluxCasing", 1L, 0), // "Magnetic Flux Casing"
                getModItem(GoodGenerator.ID, "antimatterAnnihilationMatrix", 1L, 0), // "Antimatter Annihilation Matrix"
                getModItem(GoodGenerator.ID, "protomatterActivationCoil", 1L, 0), // "Protomatter Activation Coil"
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0) // "Transcendentally Reinforced Borosilicate Glass
                                                                  // Block"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_4);
    }
}
