package loader;

import static tectech.thing.CustomItemList.*;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;

import goodgenerator.api.recipe.GoodGeneratorRecipeMaps;
import goodgenerator.util.ItemRefer;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.enums.SoundResource;
import gregtech.api.objects.ItemData;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import gregtech.api.recipe.RecipeMaps;
import gregtech.api.recipe.maps.AssemblyLineFrontend;
import gregtech.api.util.GTOreDictUnificator;
import gregtech.api.util.GTRecipe;
import gregtech.api.util.GTRecipeBuilder;
import gtPlusPlus.api.recipe.GTPPRecipeMaps;
import util.ChaosManager;
import util.Utils;

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
        ChaosManager.addRecipeMapToChaos("basicmachine.centrifuge", GTPPRecipeMaps.centrifugeNonCellRecipes);
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
        ChaosManager.addRecipeMapToChaos("basicmachine.electrolyzer", GTPPRecipeMaps.electrolyzerNonCellRecipes);
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
        ChaosManager.addRecipeMapToChaos("basicmachine.mixer", GTPPRecipeMaps.mixerNonCellRecipes);
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

        // Precise Auto-Assembler MT-3662
        ChaosManager
            .addRecipeMapToChaos("Precise Auto-Assembler MT-3662", GoodGeneratorRecipeMaps.preciseAssemblerRecipes);
        ChaosManager.addRecipeMapToChaos("Precise Auto-Assembler MT-3662", RecipeMaps.assemblerRecipes);
    }

    public static final RecipeMap<RecipeMapBackend> AssemblyLineWithoutResearchRecipe = RecipeMapBuilder
        .of("Chaos of AssemblyLine", RecipeMapBackend::new)
        .maxIO(16, 1, 4, 0)
        .minInputs(1, 0)
        .useSpecialSlot()
        .neiTransferRect(88, 8, 18, 72)
        .neiTransferRect(124, 8, 18, 72)
        .neiTransferRect(142, 26, 18, 18)
        // .neiHandlerInfo(builder -> builder.setDisplayStack(GTCMItemList.IndistinctTentacle.get(1)))
        .frontend(AssemblyLineFrontend::new)
        .build();

    public ItemStack transToWildCircuit(ItemStack items) {
        ItemData tPrefixMaterial = GTOreDictUnificator.getAssociation(items);

        if (tPrefixMaterial == null || !tPrefixMaterial.hasValidPrefixMaterialData()) return null;
        if (tPrefixMaterial.mPrefix == OrePrefixes.circuit) {
            return GTOreDictUnificator.get(false, items, true);
        }
        return null;
    }

    public static List<ItemStack[]> generateAllItemInput(ItemStack[] baseStack, ItemStack[][] wildCard) {
        List<ItemStack[]> result = new ArrayList<>();
        result.add(Utils.copyItemStackArray(baseStack));
        int len = baseStack.length;
        for (int i = 0; i < len; i++) {
            if (wildCard[i] == null) continue;
            for (int j = 1; j < wildCard[i].length; j++) {
                if (wildCard[i][j] == null) continue;
                ItemStack wildCardCopy = wildCard[i][j].copy();
                int resultSize = result.size();
                for (int k = 0; k < resultSize; k++) {
                    ItemStack[] inputList = Utils.copyItemStackArray(result.get(k));
                    inputList[i] = wildCardCopy;
                    result.add(inputList);
                }
            }
        }
        return result;
    }

    public void loadRecipes() {

        // skip these recipes
        ItemStack[] skipRecipeOutputs = new ItemStack[] { ItemList.Circuit_Wetwaremainframe.get(1),
            ItemList.Circuit_Biowaresupercomputer.get(1), ItemList.Circuit_Biomainframe.get(1),
            ItemList.Circuit_OpticalAssembly.get(1), ItemList.Circuit_OpticalComputer.get(1),
            ItemList.Circuit_OpticalMainframe.get(1), SpacetimeCompressionFieldGeneratorTier0.get(1),
            SpacetimeCompressionFieldGeneratorTier1.get(1), SpacetimeCompressionFieldGeneratorTier2.get(1),
            SpacetimeCompressionFieldGeneratorTier3.get(1), SpacetimeCompressionFieldGeneratorTier4.get(1),
            SpacetimeCompressionFieldGeneratorTier5.get(1), SpacetimeCompressionFieldGeneratorTier6.get(1),
            SpacetimeCompressionFieldGeneratorTier7.get(1), SpacetimeCompressionFieldGeneratorTier8.get(1),
            TimeAccelerationFieldGeneratorTier0.get(1), TimeAccelerationFieldGeneratorTier1.get(1),
            TimeAccelerationFieldGeneratorTier2.get(1), TimeAccelerationFieldGeneratorTier3.get(1),
            TimeAccelerationFieldGeneratorTier4.get(1), TimeAccelerationFieldGeneratorTier5.get(1),
            TimeAccelerationFieldGeneratorTier6.get(1), TimeAccelerationFieldGeneratorTier7.get(1),
            TimeAccelerationFieldGeneratorTier8.get(1), StabilisationFieldGeneratorTier0.get(1),
            StabilisationFieldGeneratorTier1.get(1), StabilisationFieldGeneratorTier2.get(1),
            StabilisationFieldGeneratorTier3.get(1), StabilisationFieldGeneratorTier4.get(1),
            StabilisationFieldGeneratorTier5.get(1), StabilisationFieldGeneratorTier6.get(1),
            StabilisationFieldGeneratorTier7.get(1), StabilisationFieldGeneratorTier8.get(1),
            ItemList.Hatch_Energy_LuV.get(1), ItemList.Hatch_Energy_ZPM.get(1), ItemList.Hatch_Energy_UV.get(1),
            ItemList.Hatch_Energy_UHV.get(1), ItemList.Hatch_Dynamo_LuV.get(1), ItemList.Hatch_Dynamo_ZPM.get(1),
            ItemList.Hatch_Dynamo_UV.get(1), ItemList.Hatch_Dynamo_UHV.get(1), ItemList.Casing_Dim_Injector.get(1),
            ItemList.Casing_Dim_Trans.get(1), ItemRefer.Advanced_Radiation_Protection_Plate.get(1),
            tectech.thing.CustomItemList.eM_energyTunnel8_UXV.get(1),
            tectech.thing.CustomItemList.eM_dynamoTunnel8_UXV.get(1),
            tectech.thing.CustomItemList.eM_energyTunnel9_UXV.get(1),
            tectech.thing.CustomItemList.eM_dynamoTunnel9_UXV.get(1) };

        // start check assembly line recipes
        checkRecipe: for (var recipe : GTRecipe.RecipeAssemblyLine.sAssemblylineRecipes) {
            // debugLogInfo("Recipe output: " + recipe.mOutput.getDisplayName());

            for (ItemStack skip : skipRecipeOutputs) {
                // skip recipes need skip
                if (Utils.metaItemEqual(recipe.mOutput, skip)) {
                    // debugLogInfo("Skip recipe.");
                    continue checkRecipe;
                }
            }

            ItemStack[] inputItems = new ItemStack[recipe.mInputs.length];
            ItemStack[][] inputWildcards = new ItemStack[recipe.mInputs.length][];
            boolean hasCustomWildcardItemList = false;

            if (recipe.mOreDictAlt != null && recipe.mOreDictAlt.length > 0) {
                // wildcards recipe
                for (int i = 0; i < recipe.mOreDictAlt.length; i++) {
                    if (recipe.mOreDictAlt[i] != null && recipe.mOreDictAlt[i].length > 0) {
                        ItemStack circuitStack = transToWildCircuit(recipe.mOreDictAlt[i][0]);
                        if (circuitStack != null) {
                            // this wildcard is a circuit stack
                            // replace it by dreamcraft:anyCircuit then the recipe will check this stack by any circuit
                            inputItems[i] = circuitStack;
                        } else {
                            // this wildcard is a custom list
                            hasCustomWildcardItemList = true;
                            inputWildcards[i] = recipe.mOreDictAlt[i];
                        }
                    } else {
                        // this stack is normal
                        inputItems[i] = recipe.mInputs[i];
                    }
                }
            } else {
                // no wildcards recipe
                inputItems = recipe.mInputs;
            }

            if (!hasCustomWildcardItemList) {
                // debugLogInfo("Normal recipe generating.");
                GTRecipeBuilder ra = GTValues.RA.stdBuilder();
                ra.itemInputs(Utils.sortNoNullArray(inputItems))
                    .itemOutputs(recipe.mOutput);
                if (recipe.mFluidInputs != null) {
                    ra.fluidInputs(Utils.sortNoNullArray(recipe.mFluidInputs));
                }
                ra.eut(recipe.mEUt)
                    .duration(recipe.mDuration)
                    .addTo(AssemblyLineWithoutResearchRecipe);

            } else {
                // debugLogInfo("Wildcard recipe generating.");
                for (int i = 0; i < inputItems.length; i++) {
                    if (inputItems[i] == null) {
                        if (inputWildcards[i] != null && inputWildcards[i].length > 0) {
                            inputItems[i] = inputWildcards[i][0];
                        }
                    }
                }
                List<ItemStack[]> inputCombine = generateAllItemInput(inputItems, inputWildcards);
                // debugLogInfo("inputCombine.size " + inputCombine.size());
                // int loopFlag = 1;
                for (ItemStack[] inputs : inputCombine) {
                    // debugLogInfo("generate " + loopFlag);
                    // debugLogInfo("Input item list: " + Arrays.toString(inputs));
                    // loopFlag++;

                    GTRecipeBuilder ra = GTValues.RA.stdBuilder();
                    ra.itemInputs(Utils.sortNoNullArray(inputs))
                        .itemOutputs(recipe.mOutput);
                    if (recipe.mFluidInputs != null) {
                        ra.fluidInputs(Utils.sortNoNullArray(recipe.mFluidInputs));
                    }
                    ra.eut(recipe.mEUt)
                        .duration(recipe.mDuration)
                        .addTo(AssemblyLineWithoutResearchRecipe);
                }
            }
        }

        // debugLogInfo(
        // "Mega Assembly Line Recipe List size: " + GTCMRecipe.AssemblyLineWithoutResearchRecipe.getAllRecipes()
        // .size());
    }
}
