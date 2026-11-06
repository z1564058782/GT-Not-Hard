package loader;

import gregtech.api.enums.SoundResource;
import gregtech.api.recipe.RecipeMaps;
import util.ChaosManager;

public class ChaosRecipeLoader {

    public static void registerDefaultGregtechMaps() {

        // Alloy Smelter
        ChaosManager.addRecipeMapToChaos("basicmachine.alloysmelter", RecipeMaps.alloySmelterRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.alloysmelter", SoundResource.IC2_MACHINES_INDUCTION_LOOP);
        // Arc Furnace
        ChaosManager.addRecipeMapToChaos("basicmachine.arcfurnace", RecipeMaps.arcFurnaceRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.arcfurnace", SoundResource.IC2_MACHINES_INDUCTION_LOOP);
        // Assembler
        ChaosManager.addRecipeMapToChaos("basicmachine.assembler", RecipeMaps.assemblerRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.assembler", SoundResource.NONE);
        // Autoclave
        ChaosManager.addRecipeMapToChaos("basicmachine.autoclave", RecipeMaps.autoclaveRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.autoclave", SoundResource.NONE);
        // Bender
        ChaosManager.addRecipeMapToChaos("basicmachine.bender", RecipeMaps.benderRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.bender", SoundResource.IC2_MACHINES_COMPRESSOR_OP);
        // Boxinator
        ChaosManager.addRecipeMapToChaos("basicmachine.boxinator", RecipeMaps.packagerRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.boxinator", SoundResource.NONE);
        // Brewery
        ChaosManager.addRecipeMapToChaos("basicmachine.brewery", RecipeMaps.brewingRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.brewery", SoundResource.NONE);
        // Canner
        ChaosManager.addRecipeMapToChaos("basicmachine.canner", RecipeMaps.cannerRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.canner", SoundResource.IC2_MACHINES_EXTRACTOR_OP);
        // Centrifuge
        ChaosManager.addRecipeMapToChaos("basicmachine.centrifuge", RecipeMaps.centrifugeNonCellRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.centrifuge", SoundResource.NONE);
        // Chemical Bath
        ChaosManager.addRecipeMapToChaos("basicmachine.chemicalbath", RecipeMaps.chemicalBathRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.chemicalbath", SoundResource.NONE);
        // Chemical Reactor
        ChaosManager.addRecipeMapToChaos("basicmachine.chemicalreactor", RecipeMaps.multiblockChemicalReactorRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.chemicalreactor", SoundResource.IC2_MACHINES_EXTRACTOR_OP);
        // Circuit Assembler
        ChaosManager.addRecipeMapToChaos("basicmachine.circuitassembler", RecipeMaps.circuitAssemblerRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.circuitassembler", SoundResource.NONE);
        // Compressor
        ChaosManager.addRecipeMapToChaos("basicmachine.compressor", RecipeMaps.compressorRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.compressor", SoundResource.IC2_MACHINES_COMPRESSOR_OP);
        // Cutting Machine
        ChaosManager.addRecipeMapToChaos("basicmachine.cutter", RecipeMaps.cutterRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.cutter", SoundResource.NONE);
        // Distillery
        ChaosManager.addRecipeMapToChaos("basicmachine.distillery", RecipeMaps.distilleryRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.distillery", SoundResource.GT_MACHINES_DISTILLERY_LOOP);
        // Electrolyzer
        ChaosManager.addRecipeMapToChaos("basicmachine.electrolyzer", RecipeMaps.electrolyzerNonCellRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.electrolyzer", SoundResource.IC2_MACHINES_MAGNETIZER_LOOP);
        // Extractor
        ChaosManager.addRecipeMapToChaos("basicmachine.extractor", RecipeMaps.extractorRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.extractor", SoundResource.IC2_MACHINES_EXTRACTOR_OP);
        // Extruder
        ChaosManager.addRecipeMapToChaos("basicmachine.extruder", RecipeMaps.extruderRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.extruder", SoundResource.IC2_MACHINES_INDUCTION_LOOP);
        // Fermenter
        ChaosManager.addRecipeMapToChaos("basicmachine.fermenter", RecipeMaps.fermentingRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.fermenter", SoundResource.NONE);
        // Fluid Extractor
        ChaosManager.addRecipeMapToChaos("basicmachine.fluidextractor", RecipeMaps.fluidExtractionRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.fluidextractor", SoundResource.IC2_MACHINES_EXTRACTOR_OP);
        // Fluid Heater
        ChaosManager.addRecipeMapToChaos("basicmachine.fluidheater", RecipeMaps.fluidHeaterRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.fluidheater", SoundResource.NONE);
        // Fluid Solidifier
        ChaosManager.addRecipeMapToChaos("basicmachine.fluidsolidifier", RecipeMaps.fluidSolidifierRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.fluidsolidifier", SoundResource.NONE);
        // Forge Hammer
        ChaosManager.addRecipeMapToChaos("basicmachine.hammer", RecipeMaps.hammerRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.hammer", SoundResource.RANDOM_ANVIL_USE);
        // Forming Press
        ChaosManager.addRecipeMapToChaos("basicmachine.press", RecipeMaps.formingPressRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.press", SoundResource.IC2_MACHINES_COMPRESSOR_OP);
        // Laser Engraver
        ChaosManager.addRecipeMapToChaos("basicmachine.laserengraver", RecipeMaps.laserEngraverRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.laserengraver", SoundResource.IC2_MACHINES_MAGNETIZER_LOOP);
        // Lathe
        ChaosManager.addRecipeMapToChaos("basicmachine.lathe", RecipeMaps.latheRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.lathe", SoundResource.NONE);
        // Macerator
        ChaosManager.addRecipeMapToChaos("basicmachine.macerator", RecipeMaps.maceratorRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.macerator", SoundResource.IC2_MACHINES_MACERATOR_OP);
        // Magnetic Separator
        ChaosManager
            .addRecipeMapToChaos("basicmachine.electromagneticseparator", RecipeMaps.electroMagneticSeparatorRecipes);
        ChaosManager.addSoundResourceToChaos(
            "basicmachine.electromagneticseparator",
            SoundResource.IC2_MACHINES_MAGNETIZER_LOOP);
        // Matter Amplifier
        ChaosManager.addRecipeMapToChaos("basicmachine.amplifab", RecipeMaps.amplifierRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.amplifab", SoundResource.IC2_MACHINES_EXTRACTOR_OP);
        // Microwave
        ChaosManager.addRecipeMapToChaos("basicmachine.microwave", RecipeMaps.microwaveRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.microwave", SoundResource.IC2_MACHINES_ELECTROFURNACE_LOOP);
        // Mixer
        ChaosManager.addRecipeMapToChaos("basicmachine.mixer", RecipeMaps.mixerNonCellRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.mixer", SoundResource.NONE);
        // Ore Washer
        ChaosManager.addRecipeMapToChaos("basicmachine.orewasher", RecipeMaps.oreWasherRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.orewasher", SoundResource.NONE);
        // Polarizer
        ChaosManager.addRecipeMapToChaos("basicmachine.polarizer", RecipeMaps.polarizerRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.polarizer", SoundResource.IC2_MACHINES_MAGNETIZER_LOOP);
        // Printer
        ChaosManager.addRecipeMapToChaos("basicmachine.printer", RecipeMaps.printerRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.printer", SoundResource.IC2_MACHINES_COMPRESSOR_OP);
        // Recycler
        ChaosManager.addRecipeMapToChaos("basicmachine.recycler", RecipeMaps.recyclerRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.recycler", SoundResource.IC2_MACHINES_RECYCLER_OP);
        // Scanner
        ChaosManager.addRecipeMapToChaos("basicmachine.scanner", RecipeMaps.scannerFakeRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.scanner", SoundResource.IC2_MACHINES_MAGNETIZER_LOOP);
        // Sifter
        ChaosManager.addRecipeMapToChaos("basicmachine.sifter", RecipeMaps.sifterRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.sifter", SoundResource.NONE);
        // Thermal Centrifuge
        ChaosManager.addRecipeMapToChaos("basicmachine.thermalcentrifuge", RecipeMaps.thermalCentrifugeRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.thermalcentrifuge", SoundResource.NONE);
        // Unboxinator
        ChaosManager.addRecipeMapToChaos("basicmachine.unboxinator", RecipeMaps.unpackagerRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.unboxinator", SoundResource.NONE);
        // Wiremill
        ChaosManager.addRecipeMapToChaos("basicmachine.wiremill", RecipeMaps.wiremillRecipes);
        ChaosManager.addSoundResourceToChaos("basicmachine.wiremill", SoundResource.IC2_MACHINES_RECYCLER_OP);
    }
}
