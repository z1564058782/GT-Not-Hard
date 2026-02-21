package Recipes.SingularityRecipes_Pachinko;

import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GoodGenerator;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.OneToManyItemsFrontend_Large;

public class FakeSingularityPachinkoRecipes_GT_MultiBlock_1 {

    public static final RecipeMap<RecipeMapBackend> addFakePachinkoRecipes_GT_MultiBlock_1 = RecipeMapBuilder
        .of("Singularity of Pachinko_GT_MultiBlock_1")
        .maxIO(1, 135, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static void addFakePachinkoRecipes_GT_MultiBlock_1() {
        // "Bricked Blast Furnace" - 140
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 140))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 140), // "Bricked Blast Furnace"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 15) // Firebricks
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Fluid Drilling Rig II" - 141
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 141))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 141), // "Fluid Drilling Rig II"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1), // "Clean Stainless Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 306) // "Stainless Steel Frame Box"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Fluid Drilling Rig III" - 142
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 142))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 142), // "Fluid Drilling Rig III"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2), // "Stable Titanium Machine Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 28) // "Titanium Frame Box"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Concrete Backfiller" - 143
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 143))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 143), // "Concrete Backfiller"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0), // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 305) // "Steel Frame Box"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Advanced Concrete Backfiller" - 144
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 144))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 144), // "Advanced Concrete Backfiller"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2), // "Stable Titanium Machine Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 28) // "Titanium Frame Box"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Infinite Fluid Drilling Rig" - 148
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 148))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 148), // "Infinite Fluid Drilling Rig"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 2), // "Mining Neutronium Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 129) // "Neutronium Frame Box"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Fluid Drilling Rig IV" - 149
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 149))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 149), // "Fluid Drilling Rig IV"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0), // "Robust Tungstensteel Machine Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 316) // "Tungstensteel Frame Box"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "PCB Factory" - 356
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 356))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 356), // "PCB Factory"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9415), // "Nanite Containment Bus"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 11), // "Basic Photolithographic Framework Casing"
                getModItem(GregTech.ID, "gt.blockreinforced", 1L, 2), // "Plascrete Block"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 15), // "Superconducting Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 15), // "Tungstensteel Pipe Casing"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 10), // "Grate Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1), // "Clean Stainless Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 4), // "Extreme Engine Intake Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 10), // "Radiant Naquadah Alloy Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 12), // "Reinforced Photolithographic Framework Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 13), // "Radiation Proof Photolithographic Framework
                                                                     // Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 14), // "Infinity Cooled Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 103), // "Americium Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 328), // "Duranium Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 335), // "Damascus Steel Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 367), // "Vibrant Alloy Frame Box"

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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Nano Forge" - 357
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 357))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 357), // "Nano Forge"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 5), // "Assembly Line Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 5), // "Europium Reinforced Radiation Proof Machine
                                                                    // Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 10), // "Radiant Naquadah Alloy Casing"
                getModItem(GregTech.ID, "gt.blockcasings13", 1L, 5), // "Precision Field Sync Casing"
                getModItem(GregTech.ID, "gt.blockcasings13", 1L, 6), // "Magnetic Anchor Casing"
                getModItem(GregTech.ID, "gt.blockcasings13", 1L, 7), // "Field Energy Absorber Casing"
                getModItem(GregTech.ID, "gt.blockcasings13", 1L, 8), // "Loadbearing Distribution Casing"
                getModItem(GregTech.ID, "gt.blockcasings13", 1L, 9), // "Nanite Replication Framework"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 143), // "Magmatter Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 405), // "Stellar Alloy Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 585), // "White Dwarf Matter Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 586), // "Black Dwarf Matter Frame Box"
                getModItem(GregTech.ID, "gt.blockglass1", 1L, 5) // "Nanite Shielding Glass"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Magnetic Flux Exhibitor" - 358
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 358))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 358), // "Magnetic Flux Exhibitor"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 359), // "Electromagnet Housing"
                getModItem(GregTech.ID, "gt.blockcasings10", 1L, 0), // "MagTech Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 356), // "Magnetic Neodymium Frame Box"

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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "TurboCan Pro" - 360
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 360))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 360), // "TurboCan Pro"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0), // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 13) // "Steel Pipe Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Fluid Shaper" - 366
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 366))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 366), // "Fluid Shaper"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 11), // "Heat Proof Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1), // "Clean Stainless Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings10", 1L, 13), // "Solidifier Casing"
                getModItem(GregTech.ID, "gt.blockcasings10", 1L, 14), // "Solidifier Radiator"

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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Solar Factory" - 367
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 367))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 367), // "Solar Factory"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0), // "Robust Tungstensteel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1), // "Clean Stainless Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 7), // "Advanced Iridium Plated Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings11", 1L, 7), // "Black Plutonium Item Pipe Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 81), // "Tungsten Frame Box"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 335), // "Damascus Steel Frame Box"
                getModItem(GoodGenerator.ID, "preciseUnitCasing", 1L, 1), // "Precise Electronic Unit Casing MK-II"
                getModItem(GoodGenerator.ID, "preciseUnitCasing", 1L, 2), // "Precise Electronic Unit Casing MK-III"
                getModItem(GoodGenerator.ID, "preciseUnitCasing", 1L, 3), // "Precise Electronic Unit Casing MK-IV"

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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Industrial Precision Lathe" - 686
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 686))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 686), // "Industrial Precision Lathe"
                getModItem(GregTech.ID, "gt.blockcasings2", 1L, 0), // "Solid Steel Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 10), // "Grate Machine Casing"

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
                getModItem(GregTech.ID, "gt.blockcasings11", 1L, 7),

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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Industrial Autoclave" - 687
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 687))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 687), // "Industrial Autoclave"
                getModItem(GregTech.ID, "gt.blockcasings10", 1L, 3), // "Pressure Containment Casing"
                getModItem(GregTech.ID, "gt.blockframes", 1L, 473), // "Polytetrafluoroethylene Frame Box"

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
                getModItem(GregTech.ID, "gt.blockcasings11", 1L, 7),

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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Nuclear Salt Processing Plant" - 749
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 749))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 749), // "Nuclear Salt Processing Plant"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 8), // "Thermally Insulated Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 5) // "IV Machine Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Thorium Reactor [LFTR]" - 751
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 751))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 751), // "Thorium Reactor [LFTR]"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 12), // "Hastelloy-N Reactor Casing"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 13) // "Reactor Shield Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Industrial Centrifuge" - 790
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 790))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 790), // "Industrial Centrifuge"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 0) // "Centrifuge Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Industrial Coke Oven" - 791
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 791))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 791), // "Industrial Coke Oven"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 1), // "Structural Coke Oven Casing"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 2), // "Heat Resistant Coke Oven Casing"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 3) // "Heat Proof Coke Oven Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Industrial Material Press" - 792
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 792))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 792), // "Industrial Material Press"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 4) // "Material Press Machine Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Industrial Electrolyzer" - 796
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 796))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 796), // "Industrial Electrolyzer"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 5) // "Electrolyzer Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Industrial Maceration Stack" - 797
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 797))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 797), // "Industrial Maceration Stack"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 2), // "Stable Titanium Machine Casing"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 7), // "Maceration Stack Casing"
                getModItem(GTPlusPlus.ID, "MU-metaitem.01", 1L, 32152) // "Maceration Upgrade Chip"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Industrial Wire Factory" - 798
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 798))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 798), // "Industrial Wire Factory"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 6) // "Wire Factory Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Matter Fabrication CPU" - 799
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 799))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 799), // "Matter Fabrication CPU"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 8), // "Matter Generation Coil"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 9), // "Matter Fabricator Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 15) // "Containment Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Alloy Blast Smelter" - 810
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 810))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 810), // "Alloy Blast Smelter"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 14), // "Blast Smelter Heat Containment Coil"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 15) // "Blast Smelter Casing Block"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Industrial Mixing Machine" - 811
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 811))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 811), // "Industrial Mixing Machine"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 11), // "Titanium Turbine Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 2) // "Multi-Use Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Power Station Control Node" - 812
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 812))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 812), // "Power Station Control Node"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 8), // "Sub-Station External Casing"

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
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 8))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "COMET - Compact Cyclotron" - 828
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 828))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 828), // "COMET - Compact Cyclotron"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 9), // "Cyclotron Coil"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 10) // "Cyclotron Outer Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Zhuhai - Fishing Port" - 829
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 829))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 829), // "Zhuhai - Fishing Port"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 0) // "Aquatic Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Reactor Fuel Processing Plant" - 835
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 835))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 835), // "Reactor Fuel Processing Plant"
                getModItem(GTPlusPlus.ID, "miscutils.blockcasings", 1L, 13), // "Reactor Shield Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 1), // "Hastelloy-N Sealant Block"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 2), // "Hastelloy-X Structural Block"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 3) // "Incoloy-DS Fluid Containment Block"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Tree Growth Simulator" - 836
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 836))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 836), // "Tree Growth Simulator"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 15) // "Sterile Farm Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Large Sifter Control Block" - 840
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 840))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 840), // "Large Sifter Control Block"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 5), // "Industrial Sieve Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 6) // "Large Sieve Grate"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Large Thermal Refinery" - 849
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 849))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 849), // "Large Thermal Refinery"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 0) // "Thermal Processing Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Ore Washing Plant" - 850
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 850))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 850), // "Ore Washing Plant"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 4) // "Wash Plant Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Industrial Extrusion Machine" - 859
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 859))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 859), // "Industrial Extrusion Machine"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 1) // "Inconel Reinforced Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "High Current Industrial Arc Furnace" - 862
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 862))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 862), // "High Current Industrial Arc Furnace"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.4", 1L, 3) // "Tempered Arc Furnace Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Solar Tower" - 863
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 863))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 863), // "Solar Tower"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 864), // "Solar Reflector"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 11), // "Thermal Containment Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 7), // "Salt Containment Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 8) // "Thermally Insulated Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "XL Turbo Steam Turbine" - 865
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 865))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 865), // "XL Turbo Steam Turbine"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30010), // "Rotor Assembly"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 0), // "Turbine Shaft"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 1) // "Reinforced Steam Turbine
                                                                                     // Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "XL Turbo HP Steam Turbine" - 866
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 866))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 866), // "XL Turbo HP Steam Turbine"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30010), // "Rotor Assembly"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 0), // "Turbine Shaft"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.1", 1L, 2) // "Reinforced HP Steam Turbine
                                                                                     // Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Thermal Boiler" - 875
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 875))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 875), // "Thermal Boiler"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 11) // "Thermal Containment Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Large Scale Auto-Assembler v1.01" - 876
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 876))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 876), // "Large Scale Auto-Assembler v1.01"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 12) // "Bulk Production Frame"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Cryogenic Freezer" - 910
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 910))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 910), // "Cryogenic Freezer"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 967), // "Cryotheum Cooling Hatch"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 10) // "Advanced Cryogenic Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Amazon Warehousing Depot" - 942
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 942))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 942), // "Amazon Warehousing Depot"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 9) // "Supply Depot Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // Volcanus - 963
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 963))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 963), // Volcanus
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 968), // "Pyrotheum Heating Vent"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 11), // "Volcanus Casing"

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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // Density^2 - 964
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 964))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 964), // Density^2
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 0) // "Robust Tungstensteel Machine Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "FusionTech MK IV" - 965
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 965))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 965), // "FusionTech MK IV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9401), // "Drone DownLink Module"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 12), // "Fusion Machine Casing MK III"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 13) // "Advanced Fusion Coil"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "FusionTech MK V" - 975
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 975))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 975), // "FusionTech MK V"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 9401), // "Drone DownLink Module"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.6", 1L, 0), // "Fusion Machine Casing MK IV"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.6", 1L, 1) // "Advanced Fusion Coil II"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Industrial Cutting Factory" - 992
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 992))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 992), // "Industrial Cutting Factory"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 13) // "Cutting Factory Frame"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // Utupu-Tanuri - 995
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 995))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 995), // Utupu-Tanuri
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.4", 1L, 10), // "Vacuum Casing"

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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Rocketdyne F-1A Engine" - 996
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 996))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 996), // "Rocketdyne F-1A Engine"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.3", 1L, 1), // "Inconel Reinforced Casing"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.4", 1L, 11) // "Turbodyne Casing"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "Algae Farm" - 997
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 997))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 997), // "Algae Farm"
                getModItem(GTPlusPlus.ID, "gtplusplus.blockcasings.2", 1L, 15), // "Sterile Farm Casing"

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
                // "UEV Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 10),
                // "UIV Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 11),
                // "UMV Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 12),
                // "UXV Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 13),
                // "MAX Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 14))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);

        // "ExxonMobil Chemical Plant" - 998
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 998))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 998), // "ExxonMobil Chemical Plant"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31030), // "Catalyst Housing"

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
                getModItem(GTPlusPlus.ID, "gtplusplus.blockspecialcasings.2", 1L, 3),

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
            .addTo(addFakePachinkoRecipes_GT_MultiBlock_1);
    }
}
