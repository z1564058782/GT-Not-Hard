package Recipes.SingularityRecipes_Pachinko;

import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.Chisel;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.KubaTech;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.OneToManyItemsFrontend;

// GregTech Multi-Block Machine 1000~9999
public class FakeSingularityPachinkoRecipes_GT_MultiBlock_2 {

    public static final RecipeMap<RecipeMapBackend> addFakePachinkoRecipes_GT_MultiBlock_2 = RecipeMapBuilder
        .of("Singularity of Pachinko_GT_MultiBlock_2")
        .maxIO(1, 135, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend::new)
        .build();

    public static void addFakePachinkoRecipes_GT_MultiBlock_2() {
        // "Electric Blast Furnace" - 1000
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1000))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1000), // "Electric Blast Furnace"
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
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 13))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Implosion Compressor" - 1001
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1001))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1001), // "Implosion Compressor"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0) // "Solid Steel Machine Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Vacuum Freezer" - 1002
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1002))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1002), // "Vacuum Freezer"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 1) // "Frost Proof Machine Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Multi Smelter" - 1003
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1003))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1003), // "Multi Smelter"
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
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 13))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Dimensionally Transcendent Plasma Forge" - 1004
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1004))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1004), // "Dimensionally Transcendent Plasma Forge"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 12), // "Dimensionally Transcendent Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 13), // "Dimensional Injection Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 14), // "Dimensional Bridge"

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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Transcendent Plasma Mixer" - 1006
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1006))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1006), // "Transcendent Plasma Mixer"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 12), // "Dimensionally Transcendent Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 13), // "Dimensional Injection Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 14) // "Dimensional Bridge"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Large Bronze Boiler" - 1020
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1020))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1020), // "Large Bronze Boiler"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 10), // "Bronze Plated Bricks"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 12), // "Bronze Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 13) // "Bronze Firebox Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Large Steel Boiler" - 1021
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1021))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1021), // "Large Steel Boiler"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0), // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 13), // "Steel Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 14) // "Steel Firebox Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Large Titanium Boiler" - 1022
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1022))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1022), // "Large Titanium Boiler"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 14), // "Titanium Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2), // "Stable Titanium Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 3) // "Titanium Firebox Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Large Tungstensteel Boiler" - 1023
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1023))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1023), // "Large Tungstensteel Boiler"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 15), // "Tungstensteel Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 15), // "Tungstensteel Firebox Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0) // "Robust Tungstensteel Machine Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Distillation Tower" - 1126
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1126))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1126), // "Distillation Tower"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1) // "Clean Stainless Steel Machine Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Large Steam Turbine" - 1131
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1131))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1131), // "Large Steam Turbine"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 9) // "Turbine Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Integrated Ore Factory" - 1132
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1132))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1132), // "Integrated Ore Factory"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 3), // "Steel Gear Box Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 15), // "Tungstensteel Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1), // "Clean Stainless Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 7), // "Advanced Iridium Plated Machine Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 316), // "Tungstensteel Frame Box"

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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Large Gas Turbine" - 1151
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1151))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1151), // "Large Gas Turbine"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 10) // "Stainless Steel Turbine Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Large HP Steam Turbine" - 1152
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1152))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1152), // "Large HP Steam Turbine"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 11) // "Titanium Turbine Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Large Plasma Turbine" - 1153
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1153))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1153), // "Large Plasma Turbine"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 12) // "Tungstensteel Turbine Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Large Heat Exchanger" - 1154
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1154))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1154), // "Large Heat Exchanger"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 14), // "Titanium Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2) // "Stable Titanium Machine Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Fluid Drilling Rig" - 1157
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1157))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1157), // "Fluid Drilling Rig"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0), // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 305) // "Steel Frame Box"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Ore Drilling Plant" - 1158
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1158))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1158), // "Ore Drilling Plant"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0), // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 305) // "Steel Frame Box"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Pyrolyse Oven" - 1159
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1159))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1159), // "Pyrolyse Oven"
                getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 2), // "Pyrolyse Oven Casing"

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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Oil Cracking Unit" - 1160
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1160))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1160), // "Oil Cracking Unit"
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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Large Chemical Reactor" - 1169
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1169))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1169), // "Large Chemical Reactor"
                getModItem(GregTech.ID, "gt.blockcasings5", 1L, 0), // "Cupronickel Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 0), // "Chemically Inert Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 1) // "PTFE Pipe Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Assembly Line" - 1170
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1170))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1170), // "Assembly Line"
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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Large Combustion Engine" - 1171
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1171))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1171), // "Large Combustion Engine"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 4), // "Titanium Gear Box Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2), // "Stable Titanium Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 13) // "Engine Intake Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Cleanroom Controller" - 1172
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1172))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1172), // "Cleanroom Controller"
                getModItem(GregTech.ID, "gt.blockreinforced", 1L, 2) // "Plascrete Block"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Ore Drilling Plant II" - 1177
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1177))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1177), // "Ore Drilling Plant II"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2), // "Stable Titanium Machine Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 28) // "Titanium Frame Box"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Ore Drilling Plant III" - 1178
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1178))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1178), // "Ore Drilling Plant III"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0), // "Robust Tungstensteel Machine Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 316) // "Tungstensteel Frame Box"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Ore Drilling Plant IV" - 1179
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1179))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1179), // "Ore Drilling Plant IV"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 14), // "Mining Osmiridium Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 317) // "Osmiridium Frame Box"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Fusion Control Computer Mark I" - 1193
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1193))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1193), // "Fusion Control Computer Mark I"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9401), // "Drone DownLink Module"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 6), // "LuV Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 15) // "Superconducting Coil Block"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Fusion Control Computer Mark II" - 1194
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1194))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1194), // "Fusion Control Computer Mark II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9401), // "Drone DownLink Module"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 6), // "Fusion Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 7) // "Fusion Coil Block"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Fusion Control Computer Mark III" - 1195
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1195))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1195), // "Fusion Control Computer Mark III"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9401), // "Drone DownLink Module"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 7), // "Fusion Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 8) // "Fusion Machine Casing MK II"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Extreme Combustion Engine" - 2105
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 2105))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 2105), // "Extreme Combustion Engine"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 4), // "Titanium Gear Box Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0), // "Robust Tungstensteel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 4) // "Extreme Engine Intake Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Large Fluid Extractor" - 2730
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 2730))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 2730), // "Large Fluid Extractor"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 334), // "Black Steel Frame Box"

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
                getModItem(GregTech.ID, "gt.blockcasings.cyclotron_coils", 1L, 10),

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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Matter Manipulator Quantum Uplink" - 2731
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 2731))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 2731), // "Matter Manipulator Quantum Uplink"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 2732), // "Quantum Uplink ME Connector Hatch"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 8), // "Matter Generation Coil"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 7), // "Advanced Iridium Plated Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 10), // "Radiant Naquadah Alloy Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 325), // "Naquadah Alloy Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 868) // "Trinium Frame Box"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Hyper-Intensity Laser Engraver" - 3004
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 3004))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 3004), // "Hyper-Intensity Laser Engraver"
                getModItem(GregTech.ID, "gt.laserplate", 1L), // "Laser Resistant Plate"
                getModItem(GregTech.ID, "gt.blockcasings10", 1L, 1), // "Laser Containment Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 316), // "Tungstensteel Frame Box"

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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Large Electric Compressor" - 3005
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 3005))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 3005), // "Large Electric Compressor"
                getModItem(GregTech.ID, "gt.blockcasings10", 1L, 4), // "Electric Compressor Casing"
                getModItem(GregTech.ID, "gt.blockcasings10", 1L, 5), // "Compression Pipe Casing"

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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Hot Isostatic Pressurization Unit" - 3006
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 3006))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 3006), // "Hot Isostatic Pressurization Unit"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 3009), // "Heat Sensor Hatch"
                getModItem(GregTech.ID, "gt.blockcasings10", 1L, 4), // "Electric Compressor Casing"
                getModItem(GregTech.ID, "gt.blockcasings10", 1L, 5), // "Compression Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings10", 1L, 9), // "Coolant Duct"
                getModItem(GregTech.ID, "gt.blockcasings10", 1L, 10), // "Heating Duct"

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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Neutronium Compressor" - 3007
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 3007))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 3007), // "Neutronium Compressor"
                getModItem(GregTech.ID, "gt.blockcasings10", 1L, 6), // "Neutronium Casing"
                getModItem(GregTech.ID, "gt.blockcasings10", 1L, 7), // "Active Neutronium Casing"
                getModItem(GregTech.ID, "gt.blockcasings10", 1L, 8), // "Neutronium Stabilization Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 325), // "Naquadah Alloy Frame Box"

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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Pseudostable Black Hole Containment Field" - 3008
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 3008))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 3008), // "Pseudostable Black Hole Containment Field"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 3012), // "Black Hole Utility Hatch"
                getModItem(GregTech.ID, "gt.blockcasings10", 1L, 11), // "Extreme Density Space-Bending Casing"
                getModItem(GregTech.ID, "gt.blockcasings10", 1L, 12), // "Background Radiation Absorbent Casing"
                getModItem(GregTech.ID, "gt.blockglass1", 1L, 4), // "Hawking Radiation Realignment Focus"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 325) // "Naquadah Alloy Frame Box"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Dissection Apparatus" - 3010
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 3010))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 3010), // "Dissection Apparatus"
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
                getModItem(BartWorks.ID, "BW_GlasBlocks2", 1L, 0),

                // Item Pipe Casing
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
                getModItem(GregTech.ID, "gt.blockcasings11", 1L, 7))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Big Barrel Brewery" - 3011
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 3011))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 3011), // "Big Barrel Brewery"
                getModItem(GregTech.ID, "gt.blockcasings10", 1L, 15), // "Reinforced Wooden Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 305), // "Steel Frame Box"

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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Draconic Evolution Fusion Crafter" - 5001
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 5001))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 5001), // "Draconic Evolution Fusion Crafter"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 6), // "Fusion Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 7), // "Fusion Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 8), // "Fusion Machine Casing MK II"
                getModItem(KubaTech.ID, "defc.casing", 1L, 7), // "Naquadah Alloy Fusion Casing"
                getModItem(KubaTech.ID, "defc.casing", 1L, 8), // "Bloody Ichorium Fusion Casing"
                getModItem(KubaTech.ID, "defc.casing", 1L, 9), // "Draconium Fusion Casing"
                getModItem(KubaTech.ID, "defc.casing", 1L, 10), // "Wyvern Fusion Casing"
                getModItem(KubaTech.ID, "defc.casing", 1L, 11), // "Awakened Draconium Fusion Casing"
                getModItem(KubaTech.ID, "defc.casing", 1L, 12) // "Chaotic Fusion Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Drone Centre" - 9400
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 9400))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9400), // "Drone Centre"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 11), // "Heat Proof Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0), // "Robust Tungstensteel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2), // "Stable Titanium Machine Casing"

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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);

        // "Water Purification Plant" - 9402
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 9402))
            .itemOutputs(
                // "Water Purification Plant"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9402),
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 3), // "Superplasticizer-Treated High Strength Concrete"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 4), // "Sterile Water Plant Casing"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 5), // "Reinforced Sterile Water Plant Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 81), // "Tungsten Frame Box"
                getModItem(GregTech.ID, "gt.blocktintedglass", 1L, 0), // "Tinted Industrial Glass (White)"

                // "Clarifier Purification Unit"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9403),
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 11), // "Filter Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 1), // "PTFE Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 5), // "Reinforced Sterile Water Plant Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 84), // "Iridium Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 335), // "Damascus Steel Frame Box"

                // "Ozonation Purification Unit"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9404),
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 1), // "PTFE Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 9), // "Reactive Gas Containment Casing"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 10), // "Inert Filtration Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 316), // "Tungstensteel Frame Box"
                getModItem(GregTech.ID, "gt.blocktintedglass", 1L, 0), // "Tinted Industrial Glass (White)"

                // "Flocculation Purification Unit"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9405),
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 11), // "Filter Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 4), // "Sterile Water Plant Casing"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 5), // "Reinforced Sterile Water Plant Casing"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 6), // "Reinforced Sterile Water Plant Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 319), // "Adamantium Frame Box"
                getModItem(GregTech.ID, "gt.blocktintedglass", 1L, 0), // "Tinted Industrial Glass (White)"

                // "pH Neutralization Purification Unit"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9406),
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9407), // "pH Sensor Hatch"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 7), // "Stabilized Naquadah Water Plant Casing"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 8), // "Inert Neutralization Water Plant Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 325), // "Naquadah Alloy Frame Box"
                getModItem(GregTech.ID, "gt.blockglass1", 1L, 0), // "Chemical Grade Glass"

                // "Extreme Temperature Fluctuation Purification Unit"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9408),
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 15), // "Superconducting Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 5), // "Reinforced Sterile Water Plant Casing"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 11), // "Heat-Resistant Trinium Plated Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 992), // "Superconductor Base ZPM Frame Box"
                getModItem(GregTech.ID, "gt.blocktintedglass", 1L, 0), // "Tinted Industrial Glass (White)"
                getModItem(Chisel.ID, "neonite", 1L, 7), // Neonite

                // "High Energy Laser Purification Unit"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9409),
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9410), // "Lens Housing"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9411), // "Lens Indicator Hatch"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 12), // "Naquadria-Reinforced Water Plant Casing"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 13), // "High Energy Ultraviolet Emitter Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 405), // "Stellar Alloy Frame Box"
                getModItem(GregTech.ID, "gt.blockglass1", 1L, 1), // "Electron-Permeable Neutronium Coated Glass"

                // "Residual Decontaminant Degasser Purification Unit"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9412),
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9413), // "Degasser Control Hatch"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 11), // "Heat-Resistant Trinium Plated Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 395), // "Bedrockium Frame Box"
                getModItem(GregTech.ID, "gt.blockglass1", 1L, 2), // "Omni-Purpose Infinity Fused Glass"

                // "Absolute Baryonic Perfection Purification Unit"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9414),
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 14), // "Particle Beam Guidance Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings9", 1L, 15), // "Femtometer-Calibrated Particle Beam Casing"
                getModItem(GregTech.ID, "gt.blockcasings10", 1L, 2), // "Quark Exclusion Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 395), // "Bedrockium Frame Box"
                getModItem(GregTech.ID, "gt.blockglass1", 1L, 3) // "Non-Photonic Matter Exclusion Glass"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_2);
    }
}
