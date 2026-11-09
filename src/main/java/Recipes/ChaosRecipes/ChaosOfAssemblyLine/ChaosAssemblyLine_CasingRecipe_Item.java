package Recipes.ChaosRecipes.ChaosOfAssemblyLine;

import static Recipes.ChaosRecipes.ChaosRecipeMap.AssemblyLineItemRecipe;
import static com.google.common.math.LongMath.pow;
import static gregtech.api.enums.TierEU.RECIPE_IV;
import static gregtech.api.enums.TierEU.RECIPE_LuV;
import static gregtech.api.enums.TierEU.RECIPE_UEV;
import static gregtech.api.enums.TierEU.RECIPE_UHV;
import static gregtech.api.enums.TierEU.RECIPE_UIV;
import static gregtech.api.enums.TierEU.RECIPE_UMV;
import static gregtech.api.enums.TierEU.RECIPE_UV;
import static gregtech.api.enums.TierEU.RECIPE_UXV;
import static gregtech.api.enums.TierEU.RECIPE_ZPM;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;
import static util.ChaosAssemblyRecipeBuilder.requiredFluid;
import static util.Utils.getMaterialInput;
import static util.Utils.setStackSize;

import net.minecraft.item.ItemStack;

import EnumList.EnumFluidList.FluidList;
import EnumList.EnumFluidList.GasList;
import EnumList.EnumFluidList.MoltenList;
import EnumList.EnumFluidList.PlasmaList;
import EnumList.EnumItemList.EnumGTList.BatteryList;
import EnumList.EnumItemList.EnumGTList.CircuitList;
import EnumList.EnumItemList.EnumGTList.GTBlockList;
import EnumList.EnumItemList.EnumGTList.GTItemList;
import EnumList.EnumItemList.EnumGTList.GTPPList;
import EnumList.EnumItemList.EnumGTList.HatchList;
import EnumList.EnumItemList.EnumGTList.MachineList;
import EnumList.EnumItemList.EnumGTList.MultiMachineCasingList;
import EnumList.EnumItemList.EnumGTList.MultiMachineControllerList;
import EnumList.EnumItemList.EnumGTList.WireList;
import EnumList.EnumItemList.EnumMaterialList.FoilList;
import EnumList.EnumItemList.EnumMiscList.SingularityList;
import EnumList.EnumItemList.EnumModList.AE2FluidCraftingList;
import EnumList.EnumItemList.EnumModList.AmunRaList;
import EnumList.EnumItemList.EnumModList.Appliedenergistics2List;
import EnumList.EnumItemList.EnumModList.AvaritiaList;
import EnumList.EnumItemList.EnumModList.EnderIOList;
import EnumList.EnumItemList.EnumModList.GTNHIntergalacticList;
import EnumList.EnumItemList.EnumModList.GTNHLanthanidesList;
import EnumList.EnumItemList.EnumModList.GoodGeneratorList;
import EnumList.EnumItemList.EnumModList.KekzTechList;
import EnumList.EnumItemList.EnumModList.NewHorizonsCoreModList;
import EnumList.EnumItemList.EnumModList.OpenComputersList;
import EnumList.EnumItemList.EnumModList.SolarPanelsList;
import EnumList.EnumItemList.EnumModList.TecTechList;
import EnumList.EnumItemList.EnumOreProductList.GemList;
import EnumList.EnumItemList.EnumOreProductList.IngotList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GTUtility;
import util.ChaosAssemblyRecipeBuilder;

public class ChaosAssemblyLine_CasingRecipe_Item {

    public static void addChaosAssemblyLine_CasingRecipe_Item() {
        // Antenna Casing
        {
            // "Antenna Casing (T1)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#1")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GTNHLanthanidesList.Antenna_Casing_T1.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 24),

                    setStackSize(GemList.Nether_Star.copy(), 6),

                    setStackSize(IngotList.Copper_Ingot.copy(), 4),
                    setStackSize(IngotList.Electrum_Ingot.copy(), 54),
                    setStackSize(IngotList.Gallium_Ingot.copy(), 64 * 4 + 32),
                    setStackSize(IngotList.Gold_Ingot.copy(), 36),
                    setStackSize(IngotList.HSSS_Ingot.copy(), 24),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 30),

                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 6),
                    setStackSize(IngotList.Mu_metal_Ingot.copy(), 5),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 64 + 56),
                    setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 48),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 2),
                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 30),

                    setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 16))
                .fluidInputs(
                    requiredFluid(FluidList.Lubricant, 1000 + 500),
                    requiredFluid(GasList.Radon, 1000 * 7 + 500),
                    requiredFluid(GasList.Xenon, 1000 * 2))
                .itemOutputs(setStackSize(GTNHLanthanidesList.Antenna_Casing_T1.copy(), 1))
                .eut(RECIPE_LuV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Antenna Casing (T2)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#2")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GTNHLanthanidesList.Antenna_Casing_T2.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 24),

                    setStackSize(GemList.Nether_Star.copy(), 12),

                    setStackSize(IngotList.Copper_Ingot.copy(), 4),
                    setStackSize(IngotList.Electrum_Ingot.copy(), 54),
                    setStackSize(IngotList.Europium_Ingot.copy(), 64 * 2 + 12),
                    setStackSize(IngotList.Gold_Ingot.copy(), 56),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 60),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 6),

                    setStackSize(IngotList.Mu_metal_Ingot.copy(), 5),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 54),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 24),
                    setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 96),
                    setStackSize(IngotList.Trinium_Ingot.copy(), 64 * 4 + 32),
                    setStackSize(IngotList.Tungstencarbide_Ingot.copy(), 2),

                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64 * 2 + 40),

                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 16))
                .fluidInputs(
                    requiredFluid(FluidList.Lubricant, 1000 * 4 + 500),
                    requiredFluid(GasList.Radon, 1000 * 15),
                    requiredFluid(GasList.Xenon, 1000 * 2))
                .itemOutputs(setStackSize(GTNHLanthanidesList.Antenna_Casing_T2.copy(), 1))
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // "Antimatter Annihilation Matrix"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#3")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(GoodGeneratorList.Antimatter_Annihilation_Matrix.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 17),

                setStackSize(GemList.Nether_Star.copy(), 64 * 8 + 36),

                setStackSize(GoodGeneratorList.Protomatter_Activation_Coil.copy(), 1),

                setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 64),
                setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64),
                setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 32),
                setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 64),
                setStackSize(IngotList.Hypogen_Ingot.copy(), 26),
                setStackSize(IngotList.Infinity_Ingot.copy(), 32),

                setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 64),
                setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 64),
                setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 4 + 28),
                setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 2),

                setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 2))
            .fluidInputs(
                requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 17),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 2 + 16)),
                requiredFluid(FluidList.Semi_Stable_Antimatter, 4))
            .itemOutputs(setStackSize(GoodGeneratorList.Antimatter_Annihilation_Matrix.copy(), 4))
            .eut(RECIPE_UIV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Antimatter Containment Casing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#36")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(GoodGeneratorList.Antimatter_Containment_Casing.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 16),

                setStackSize(GemList.Nether_Star.copy(), 64 * 8),

                setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 64),
                setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64),
                setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 32),
                setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 64),
                setStackSize(IngotList.Infinity_Ingot.copy(), 33),
                setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 64),

                setStackSize(IngotList.Neutronium_Ingot.copy(), 8),
                setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 64),
                setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 4 + 4),
                setStackSize(IngotList.Radox_Polymer_Bar, 1),
                setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 2 + 28),

                setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64))
            .fluidInputs(
                requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 16),
                requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Resplendent_Catalyst, 1000 * 4),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 2 + 16)),
                requiredFluid(PlasmaList.Helium_Plasma, 144 * 4))
            .itemOutputs(setStackSize(GoodGeneratorList.Antimatter_Containment_Casing.copy(), 4))
            .eut(RECIPE_UIV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // Bose-Einstein Condensate
        {
            // "Coherence-Preserving Plasma Conduit"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#4")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(MultiMachineCasingList.Coherence_Preserving_Plasma_Conduit.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 52),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 64 * 3),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 7 + 12),

                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 + 24),
                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 24),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 17),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64),
                    setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.Churitsu_Ingot.copy(), 6),

                    setStackSize(IngotList.Cobalt_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 22),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 24),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 48),
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 5),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 30 + 24),

                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 5 + 18),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 * 4 + 32),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 32),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 32 + 24),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 37 + 32),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 2 + 3),

                    setStackSize(IngotList.Quantium_Ingot.copy(), 39),
                    setStackSize(IngotList.Shijima_Ingot.copy(), 6),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 48),
                    setStackSize(IngotList.Six_Phased_Copper_Ingot.copy(), 5),
                    setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 16),
                    setStackSize(IngotList.Tairitsu_Ingot.copy(), 6),

                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 2 + 46),
                    setStackSize(IngotList.Tritanium_Ingot.copy(), 64 * 6 + 32),

                    setStackSize(MultiMachineCasingList.Peace_Enforcement_Casing.copy(), 6),

                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 48),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 24))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 16),
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Resplendent_Catalyst, 1000 * 4),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * (64 * 6)),
                    requiredFluid(FluidList.Lubricant, 1000 * (64 * 3 + 8)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 2 + 28)),
                    requiredFluid(GasList.Radon, 1000 * (64 * 9 + 24)))
                .itemOutputs(setStackSize(MultiMachineCasingList.Coherence_Preserving_Plasma_Conduit.copy(), 4))
                .eut(RECIPE_UIV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Electromagnetically-Isolated Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#5")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(MultiMachineCasingList.Electromagnetically_Isolated_Casing.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 7),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 25),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 12),

                    setStackSize(GemList.Nether_Star.copy(), 64 + 35),

                    setStackSize(GTItemList.Energised_Tesseract.copy(), 2),

                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 32),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 + 2),
                    setStackSize(IngotList.Callisto_Ice_Ingot.copy(), 64 + 56),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 48),
                    setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.Churitsu_Ingot.copy(), 20),

                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 4 + 57),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 64 + 24),
                    setStackSize(IngotList.Enriched_Holmium_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 3),
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 3),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 56),

                    setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 4 + 8),
                    setStackSize(IngotList.Ledox_Ingot.copy(), 64 + 56),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 12),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 + 56),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 6 + 54),

                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 8),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 2 + 34),
                    setStackSize(IngotList.Shijima_Ingot.copy(), 20),
                    setStackSize(IngotList.Six_Phased_Copper_Ingot.copy(), 8),
                    setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 64 + 56),
                    setStackSize(IngotList.Tairitsu_Ingot.copy(), 23),

                    setStackSize(IngotList.Tritanium_Ingot.copy(), 64),

                    setStackSize(NewHorizonsCoreModList.Irradiant_Reinforced_Bedrockium_Plate.copy(), 8))
                .fluidInputs(
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Resplendent_Catalyst, 1000 * 6),
                    requiredFluid(FluidList.Lubricant, 1000 * 28),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 34 + 34)),
                    requiredFluid(GasList.Radon, 1000 * (64 * 2 + 13)))
                .itemOutputs(setStackSize(MultiMachineCasingList.Electromagnetically_Isolated_Casing.copy(), 4))
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Fine-Structure Constant Manipulator"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#6")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(MultiMachineCasingList.Fine_Structure_Constant_Manipulator.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 19),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 12),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 6),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 9 + 21),

                    setStackSize(GTItemList.Energised_Tesseract.copy(), 1),
                    setStackSize(GTItemList.Insanely_Ultimate_Voltage_Coil.copy(), 6),

                    setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 64),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 + 16),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 33),
                    setStackSize(IngotList.Callisto_Ice_Ingot.copy(), 60),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 + 40),
                    setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 64 * 9),

                    setStackSize(IngotList.Churitsu_Ingot.copy(), 25),
                    setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 64),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 2 + 28),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 44),
                    setStackSize(IngotList.Enriched_Holmium_Ingot.copy(), 36),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 + 32),

                    setStackSize(IngotList.Hypogen_Ingot.copy(), 4),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 60),
                    setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 3 + 20),
                    setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 64),
                    setStackSize(IngotList.Ledox_Ingot.copy(), 60),

                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 6),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 60),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 4 + 39),
                    setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 64),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 4 + 13),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 + 17),

                    setStackSize(IngotList.Shijima_Ingot.copy(), 42),
                    setStackSize(IngotList.Six_Phased_Copper_Ingot.copy(), 7),
                    setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 60),
                    setStackSize(IngotList.Tairitsu_Ingot.copy(), 29),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Tritanium_Ingot.copy(), 32),

                    setStackSize(NewHorizonsCoreModList.Irradiant_Reinforced_Bedrockium_Plate.copy(), 4))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 16),
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Resplendent_Catalyst, 1000 * 3),
                    requiredFluid(FluidList.Lubricant, 1000 * 14),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 19 + 49)),
                    requiredFluid(GasList.Radon, 1000 * (64 + 6)))
                .itemOutputs(setStackSize(MultiMachineCasingList.Fine_Structure_Constant_Manipulator.copy(), 4))
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Electromagnetic Waveguide"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#7")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GTBlockList.Electromagnetic_Waveguide.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 32),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 32),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 14 + 16),

                    setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 2 + 32),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 * 3 + 48),
                    setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 64 * 12),
                    setStackSize(IngotList.Churitsu_Ingot.copy(), 6),
                    setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 64 + 32),

                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 64 * 2 + 48),
                    setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 8 + 16),
                    setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 4 + 44),

                    setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 6 + 12),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 5 + 4),
                    setStackSize(IngotList.Radox_Polymer_Bar, 2),
                    setStackSize(IngotList.Shijima_Ingot.copy(), 3),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 24),

                    setStackSize(IngotList.Tairitsu_Ingot.copy(), 3),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 3 + 42),
                    setStackSize(IngotList.Tritanium_Ingot.copy(), 64 * 2),

                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 + 32))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 24),
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Resplendent_Catalyst, 1000 * 6),
                    requiredFluid(FluidList.Lubricant, 1000 * 32),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 8 + 28)),
                    requiredFluid(GasList.Radon, 1000 * (64 * 3 + 24)),
                    requiredFluid(PlasmaList.Helium_Plasma, 144 * 6))
                .itemOutputs(setStackSize(GTBlockList.Electromagnetic_Waveguide.copy(), 4))
                .eut(RECIPE_UIV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Condensate Transformative Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#8")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(MultiMachineCasingList.Condensate_Transformative_Coil.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 30),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 64 * 3 + 32),

                    setStackSize(CircuitList.Atto_Power_IC_Chip.copy(), 6),
                    setStackSize(CircuitList.PPIC_Wafer.copy(), 64 + 32),

                    setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 6),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 5 + 28),

                    setStackSize(GTItemList.Insanely_Ultimate_Voltage_Coil.copy(), 3),

                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 15),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 24),
                    setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 64 * 3),
                    setStackSize(IngotList.Churitsu_Ingot.copy(), 11),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 21 + 20),

                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 40),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 34 + 50),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 2 + 40),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 * 3 + 32),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 34 + 50),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 78 + 24),

                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 3),
                    setStackSize(IngotList.Shijima_Ingot.copy(), 25),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 2),
                    setStackSize(IngotList.Tairitsu_Ingot.copy(), 25),

                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 12),
                    setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 64 * 8))
                .fluidInputs(
                    requiredFluid(FluidList.Lubricant, 1000 * (64 * 8 + 32)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 8),
                    requiredFluid(GasList.Radon, 1000 * (64 * 5 + 53)))
                .itemOutputs(setStackSize(MultiMachineCasingList.Condensate_Transformative_Coil.copy(), 1))
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Condensate Guidance Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#9")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(MultiMachineCasingList.Condensate_Guidance_Coil.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 18),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 64),

                    setStackSize(CircuitList.PPIC_Wafer.copy(), 64 + 32),

                    setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 6),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 2 + 16),

                    setStackSize(GTItemList.Insanely_Ultimate_Voltage_Coil.copy(), 3),

                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 7 + 32),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 12),
                    setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Churitsu_Ingot.copy(), 7),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 13 + 52),

                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 16),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 19 + 56),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 2 + 28),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 19 + 56),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 45),

                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 3),
                    setStackSize(IngotList.Shijima_Ingot.copy(), 7),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 2),
                    setStackSize(IngotList.Tairitsu_Ingot.copy(), 7),

                    setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 64 * 8))
                .fluidInputs(
                    requiredFluid(FluidList.Lubricant, 1000 * (64 * 7)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 4),
                    requiredFluid(GasList.Radon, 1000 * (64 * 2 + 54)))
                .itemOutputs(setStackSize(MultiMachineCasingList.Condensate_Guidance_Coil.copy(), 1))
                .eut(RECIPE_UIV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // Coil Block
        {
            // "Infinity Coil Block"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#10")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(MultiMachineCasingList.Infinity_Coil_Block.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 1),

                    setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 24),

                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 4),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 9))
                .itemOutputs(setStackSize(MultiMachineCasingList.Infinity_Coil_Block.copy(), 1))
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Hypogen Coil Block"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#11")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(MultiMachineCasingList.Hypogen_Coil_Block.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 1),

                    setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 32),

                    setStackSize(IngotList.Hypogen_Ingot.copy(), 9),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 4))
                .itemOutputs(setStackSize(MultiMachineCasingList.Hypogen_Coil_Block.copy(), 1))
                .eut(RECIPE_UIV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Eternal Coil Block"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#12")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(MultiMachineCasingList.Eternal_Coil_Block.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 1),

                    setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 64),

                    setStackSize(IngotList.Hypogen_Ingot.copy(), 4),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 18))
                .itemOutputs(setStackSize(MultiMachineCasingList.Eternal_Coil_Block.copy(), 1))
                .eut(RECIPE_UMV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // Component Assembly Line Casing
        {
            // "Component Assembly Line Casing (LuV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#13")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_LuV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 24),
                    getMaterialInput(OrePrefixes.circuit, Materials.IV, 48),
                    getMaterialInput(OrePrefixes.circuit, Materials.EV, 64),

                    setStackSize(IngotList.Artherium_Sn_Ingot.copy(), 6),
                    setStackSize(IngotList.Europium_Ingot.copy(), 2),
                    setStackSize(IngotList.HSSS_Ingot.copy(), 46 * 8 + 18),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 60),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 50),

                    setStackSize(IngotList.Rhodium_Plated_Palladium_Ingot.copy(), 64 + 22),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 64 * 12 + 32),
                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 16),
                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 64 + 46),
                    setStackSize(IngotList.Zeron_100_Ingot.copy(), 12))
                .fluidInputs(requiredFluid(FluidList.Lubricant, 1000 * 27))
                .itemOutputs(setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_LuV.copy(), 1))
                .eut(RECIPE_IV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Component Assembly Line Casing (ZPM)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#14")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_ZPM.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 24),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 48),
                    getMaterialInput(OrePrefixes.circuit, Materials.IV, 64),

                    setStackSize(IngotList.Dalisenite_Ingot.copy(), 7),
                    setStackSize(IngotList.Europium_Ingot.copy(), 64 * 18 + 48),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 3 + 36),
                    setStackSize(IngotList.Iridium_Ingot.copy(), 64 + 34),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 50),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 12 + 12),

                    setStackSize(IngotList.Naquadah_Ingot.copy(), 16),
                    setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 14),
                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64 * 6 + 56))
                .fluidInputs(requiredFluid(FluidList.Lubricant, 1000 * 62))
                .itemOutputs(setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_ZPM.copy(), 1))
                .eut(RECIPE_LuV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Component Assembly Line Casing (UV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#15")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_UV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 24),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 48),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 64),

                    setStackSize(IngotList.Advanced_Nitinol_Ingot.copy(), 16),
                    setStackSize(IngotList.Americium_Ingot.copy(), 64 * 28 + 32),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 12 + 4),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 + 36),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 7 + 8),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 10 + 52),

                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 13 + 48),
                    setStackSize(IngotList.Osmium_Ingot.copy(), 64 + 34),
                    setStackSize(IngotList.Tairitsu_Ingot.copy(), 8))
                .fluidInputs(requiredFluid(FluidList.Lubricant, 1000 * (64 * 2 + 30)))
                .itemOutputs(setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_UV.copy(), 1))
                .eut(RECIPE_ZPM)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Component Assembly Line Casing (UHV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#16")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_UHV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 24),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 48),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 64),

                    setStackSize(IngotList.Abyssal_Alloy_Ingot.copy(), 18),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 22 + 56),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 22 + 26),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 * 3 + 8),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 21 + 54),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 50),
                    setStackSize(IngotList.Precious_Metals_Alloy_Ingot.copy(), 9))
                .fluidInputs(requiredFluid(FluidList.Lubricant, 1000 * (64 * 4 + 55)))
                .itemOutputs(setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_UHV.copy(), 1))
                .eut(RECIPE_UV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Component Assembly Line Casing (UEV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#17")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_UEV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 24),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 48),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 64),

                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 6 + 16),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 50),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 64 * 7 + 8),
                    setStackSize(IngotList.Enriched_Naquadah_Alloy_Ingot.copy(), 10),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 31 + 50),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 21 + 54),
                    setStackSize(IngotList.Quantum_Ingot.copy(), 20))
                .fluidInputs(
                    requiredFluid(FluidList.Lubricant, 1000 * (64 * 4 + 56)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 22)))
                .itemOutputs(setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_UEV.copy(), 1))
                .eut(RECIPE_UHV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Component Assembly Line Casing (UIV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#18")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_UIV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 24),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 48),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 64),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 7 + 24),

                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 12 + 32),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 * 4 + 48),
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 22),
                    setStackSize(IngotList.Metastable_Oganesson_Ingot.copy(), 12),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 50 + 18),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 29 + 40))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * (64 * 4 + 57)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 22 + 4)))
                .itemOutputs(setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_UIV.copy(), 1))
                .eut(RECIPE_UEV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Component Assembly Line Casing (UMV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#19")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_UMV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 24),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 48),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 64),

                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 25),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 * 4 + 48),
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 64 * 55 + 8),
                    setStackSize(IngotList.Metastable_Oganesson_Ingot.copy(), 14),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 7 + 8),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 30 + 30))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * (64 * 4 + 58)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 15 + 24)))
                .itemOutputs(setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_UMV.copy(), 1))
                .eut(RECIPE_UIV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Component Assembly Line Casing (UXV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#20")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_UXV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 24),
                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 48),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 64),

                    setStackSize(GTItemList.Energised_Tesseract.copy(), 50),
                    setStackSize(GTItemList.Neutronium_Nanites.copy(), 64 * 5 + 16),

                    setStackSize(IngotList.Black_Dwarf_Matter_Ingot.copy(), 26),
                    setStackSize(IngotList.Eternity_Ingot.copy(), 15),
                    setStackSize(IngotList.Magmatter_Ingot.copy(), 64 * 18 + 19),
                    setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(), 64 * 46 + 57),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 18 + 32),
                    setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 64 * 12 + 32),
                    setStackSize(IngotList.Universium_Ingot.copy(), 64 * 33 + 56))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * (64 * 9 + 43)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 52))
                .itemOutputs(setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_UXV, 1))
                .eut(RECIPE_UMV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // "Containment Casing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#21")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(MultiMachineCasingList.Containment_Casing.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.IV, 64),
                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 32),
                getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 16),

                setStackSize(BatteryList.Lapotronic_Energy_Orb_Empty.copy(), 32),
                setStackSize(GTItemList.Electric_Motor_EV.copy(), 64),
                setStackSize(GTItemList.Field_Generator_IV.copy(), 32),
                setStackSize(GTPPList.Quantum_Anomaly.copy(), 1),

                setStackSize(IngotList.Arcanite_Ingot.copy(), 32),
                setStackSize(IngotList.Energy_Crystal_Ingot.copy(), 64 + 8),
                setStackSize(IngotList.Gadolinium_Ingot.copy(), 32),
                setStackSize(IngotList.Naquadah_Ingot.copy(), 64),
                setStackSize(IngotList.Naquadria_Ingot.copy(), 64),
                setStackSize(IngotList.Nichrome_Ingot.copy(), 16),
                setStackSize(IngotList.Nitinol_60_Ingot.copy(), 36),
                setStackSize(IngotList.Platinum_Ingot.copy(), 64 * 8),
                setStackSize(IngotList.Samarium_Ingot.copy(), 16),
                setStackSize(IngotList.Tumbaga_Ingot.copy(), 64 * 4 + 32),
                setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 64 * 3))
            .itemOutputs(setStackSize(MultiMachineCasingList.Containment_Casing.copy(), 32))
            .eut(RECIPE_LuV)
            .duration(1200 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Coolant Delivery Casing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#22")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(GTNHLanthanidesList.Coolant_Delivery_Casing.copy(), 0),

                setStackSize(GTNHLanthanidesList.Capillary_Exchange.copy(), 3),

                setStackSize(IngotList.Aluminium_Ingot.copy(), 2),
                setStackSize(IngotList.Copper_Ingot.copy(), 6),
                setStackSize(IngotList.HSSS_Ingot.copy(), 45),
                setStackSize(IngotList.Indalloy_140_Ingot.copy(), 6),
                setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 3),
                setStackSize(IngotList.Naquadah_Ingot.copy(), 12),

                setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 6),
                setStackSize(IngotList.Ruridit_Ingot.copy(), 48),
                setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 3),
                setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 2),
                setStackSize(IngotList.Tungsten_Ingot.copy(), 1),
                setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 6),

                setStackSize(NewHorizonsCoreModList.Mica_Insulator_Sheet.copy(), 6))
            .fluidInputs(requiredFluid(FluidList.Lubricant, 1000 * 2 + 652))
            .itemOutputs(setStackSize(GTNHLanthanidesList.Coolant_Delivery_Casing.copy(), 1))
            .eut(RECIPE_LuV)
            .duration(50 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Dimensional Bridge"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#23")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(MultiMachineCasingList.Dimensional_Bridge.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),
                getMaterialInput(OrePrefixes.circuit, Materials.UHV, 20),
                getMaterialInput(OrePrefixes.circuit, Materials.UV, 36),
                getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 12),
                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 32),

                setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 8),
                setStackSize(CircuitList.ASoC_Wafer.copy(), 64 * 2),
                setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 2),
                setStackSize(CircuitList.FPIC_Wafer.copy(), 4),

                setStackSize(GemList.Nether_Star.copy(), 64 + 18),

                setStackSize(IngotList.Americium_Ingot.copy(), 64 * 6 + 48),
                setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 + 24),
                setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 + 12),
                setStackSize(IngotList.Enriched_Naquadah_Ingot.copy(), 10),
                setStackSize(IngotList.Europium_Ingot.copy(), 16),
                setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 4),

                setStackSize(IngotList.Gallium_Ingot.copy(), 64 * 6),
                setStackSize(IngotList.HSSS_Ingot.copy(), 48),
                setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 7 + 62),
                setStackSize(IngotList.Iron_Ingot.copy(), 64 * 2052),
                setStackSize(IngotList.Laurenium_Ingot.copy(), 1),
                setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 40),

                setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 2 + 32),
                setStackSize(IngotList.Naquadah_Ingot.copy(), 16),
                setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 10 + 59),
                setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 9 + 12),
                setStackSize(IngotList.Osmiridium_Ingot.copy(), 4),
                setStackSize(IngotList.Ruridit_Ingot.copy(), 64 * 3 + 32),

                setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 48),

                setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 7))
            .fluidInputs(
                requiredFluid(FluidList.IC2_Coolant, 1000 * 16),
                requiredFluid(FluidList.Lubricant, 1000 * (64 + 34)),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 + 2)),
                requiredFluid(GasList.Oganesson, 1000 * 8 + 500),
                requiredFluid(GasList.Radon, 1000 * (64 + 40) + 500))
            .itemOutputs(setStackSize(MultiMachineCasingList.Dimensional_Bridge.copy(), 1))
            .eut(RECIPE_UIV)
            .duration(240 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Dimensional Injection Casing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#24")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(MultiMachineCasingList.Dimensional_Injection_Casing.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.IV, 10),

                setStackSize(CircuitList.FPIC_Wafer.copy(), 2),

                setStackSize(IngotList.Callisto_Ice_Ingot.copy(), 9),
                setStackSize(IngotList.Enriched_Naquadah_Ingot.copy(), 2),
                setStackSize(IngotList.Laurenium_Ingot.copy(), 1),
                setStackSize(IngotList.Ledox_Ingot.copy(), 9),
                setStackSize(IngotList.Osmiridium_Ingot.copy(), 4),

                setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 2))
            .fluidInputs(
                requiredFluid(GasList.Oganesson, 1000),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 4))
            .itemOutputs(setStackSize(MultiMachineCasingList.Dimensional_Injection_Casing.copy(), 1))
            .eut(RECIPE_UIV)
            .duration(20 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // Dimensionally Transcendent Casing
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#25")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(MultiMachineCasingList.Dimensionally_Transcendent_Casing.copy(), 0),

                setStackSize(IngotList.Enriched_Naquadah_Ingot.copy(), 1),
                setStackSize(IngotList.Laurenium_Ingot.copy(), 1),
                setStackSize(IngotList.Osmiridium_Ingot.copy(), 4),

                setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 1))
            .fluidInputs(requiredFluid(GasList.Oganesson, 500), requiredFluid(FluidList.Mutated_Living_Solder, 144 * 2))
            .itemOutputs(setStackSize(MultiMachineCasingList.Dimensionally_Transcendent_Casing.copy(), 1))
            .eut(RECIPE_UIV)
            .duration(20 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // Dyson Swarm Ground Unit
        {
            // "Dyson Swarm Control Center Base Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#26")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GTNHIntergalacticList.Dyson_Swarm_Control_Center_Base_Casing.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 8),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.IV, 64),

                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 4),
                    setStackSize(MultiMachineControllerList.Quantum_Computer.copy(), 4))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 + 16)),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 32),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Dyson_Swarm_Control_Center_Base_Casing.copy(), 8))
                .eut(RECIPE_UEV)
                .duration(80 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Dyson Swarm Control Center Primary Windings"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#27")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GTNHIntergalacticList.Dyson_Swarm_Control_Center_Primary_Windings.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 1),
                    setStackSize(CircuitList.Femto_Power_IC_Chip.copy(), 2),
                    setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 24),
                    setStackSize(IngotList.Cobalt_Ingot.copy(), 1),
                    setStackSize(IngotList.Copper_Ingot.copy(), 1),
                    setStackSize(IngotList.Europium_Ingot.copy(), 33),
                    setStackSize(IngotList.Iridium_Ingot.copy(), 7),
                    setStackSize(IngotList.Lead_Ingot.copy(), 8),
                    setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 1),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 27),
                    setStackSize(IngotList.Osmium_Ingot.copy(), 9),
                    setStackSize(IngotList.Plutonium_239_Ingot.copy(), 8),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 1),
                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 24),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 13),
                    setStackSize(IngotList.Trinium_Ingot.copy(), 14),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 6),
                    setStackSize(IngotList.Uranium_238_Ingot.copy(), 8),
                    setStackSize(MultiMachineCasingList.Fusion_Coil_Block.copy(), 2),
                    setStackSize(MultiMachineCasingList.Naquadah_Alloy_Coil_Block.copy(), 2))
                .fluidInputs(
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 3),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 + 16)),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 16),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8),
                    requiredFluid(GasList.Argon, 500))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Dyson_Swarm_Control_Center_Primary_Windings.copy(), 4))
                .eut(RECIPE_UEV)
                .duration(40 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Dyson Swarm Control Center Secondary Windings"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#28")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GTNHIntergalacticList.Dyson_Swarm_Control_Center_Secondary_Windings.copy(), 0),

                    setStackSize(CircuitList.Femto_Power_IC_Chip.copy(), 2),
                    setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 64 + 24),
                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 32),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 4),
                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 24))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 + 16)),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 16),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8))
                .itemOutputs(
                    setStackSize(GTNHIntergalacticList.Dyson_Swarm_Control_Center_Secondary_Windings.copy(), 4))
                .eut(RECIPE_UEV)
                .duration(40 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Dyson Swarm Control Center Toroid Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#29")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GTNHIntergalacticList.Dyson_Swarm_Control_Center_Toroid_Casing.copy(), 0),

                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 1),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 2),
                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 1),
                    setStackSize(IngotList.Superconductor_Base_UEV_Ingot.copy(), 8))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 + 16)),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 16),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Dyson_Swarm_Control_Center_Toroid_Casing, 1))
                .eut(RECIPE_UEV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Dyson Swarm Energy Receiver Base Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#30")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GTNHIntergalacticList.Dyson_Swarm_Energy_Receiver_Base_Casing.copy(), 0),

                    setStackSize(CircuitList.Femto_Power_IC_Chip.copy(), 32),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 12),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 32),
                    setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 8),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64),
                    setStackSize(GTItemList.Extremely_Ultimate_Voltage_Coil.copy(), 64))
                .fluidInputs(
                    requiredFluid(FluidList.Liquid_Helium, 1000 * 50),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 + 16)),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 16),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Dyson_Swarm_Energy_Receiver_Base_Casing.copy(), 4))
                .eut(RECIPE_UEV)
                .duration(40 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Dyson Swarm Energy Receiver Dish Block"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#31")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GTNHIntergalacticList.Dyson_Swarm_Energy_Receiver_Dish_Block.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 18),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 64),

                    setStackSize(CircuitList.PPIC_Wafer.copy(), 64 + 32),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 2 + 16),

                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 7 + 32),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 13 + 52),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 20),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 27 + 56),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 2 + 40),
                    setStackSize(IngotList.Iridium_Ingot.copy(), 64 * 144),
                    setStackSize(IngotList.Lead_Ingot.copy(), 64 * 17),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 20),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 19 + 56),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 49),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Rhugnor_Ingot.copy(), 1),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 2),
                    setStackSize(IngotList.Tantalum_Hafnium_Carbide_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Trinium_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Tungstencarbide_Ingot.copy(), 64),
                    setStackSize(IngotList.Vibrant_Alloy_Ingot.copy(), 64 * 4),

                    setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 64 * 8))
                .fluidInputs(
                    requiredFluid(FluidList.Lubricant, 1000 * (64 * 7)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 + 16)),
                    requiredFluid(FluidList.Prismatic_Naquadah_Composite_Slurry, 1000 * (64 * 2)),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 16),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8),
                    requiredFluid(GasList.Radon, 1000 * (64 * 2 + 54)))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Dyson_Swarm_Energy_Receiver_Dish_Block.copy(), 3))
                .eut(RECIPE_UEV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Dyson Swarm Module Deployment Unit Base Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#32")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GTNHIntergalacticList.Dyson_Swarm_Module_Deployment_Unit_Base_Casing.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 18),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 64),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 12 + 8),

                    setStackSize(IngotList.Americium_Ingot.copy(), 64 * 16 + 42),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 24 + 32),
                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 * 10),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 40),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 7 + 52),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 2 + 16),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 36),
                    setStackSize(IngotList.Mysterious_Crystal_Ingot.copy(), 12),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 5 + 48),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 24),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 17 + 40),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 6 + 36),
                    setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 24),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 96),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 + 44),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 52 + 8),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 52 + 32))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * (64 * 10 + 50)),
                    requiredFluid(FluidList.Lubricant, 1000 * (64 * 3)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 40 + 60)),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 32),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8),
                    requiredFluid(GasList.Radon, 1000 * (64 + 24)))
                .itemOutputs(
                    setStackSize(GTNHIntergalacticList.Dyson_Swarm_Module_Deployment_Unit_Base_Casing.copy(), 4))
                .eut(RECIPE_UEV)
                .duration(40 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Dyson Swarm Module Deployment Unit Core"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#33")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GTNHIntergalacticList.Dyson_Swarm_Module_Deployment_Unit_Core.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 64),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 64 * 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 64 * 4),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 29),

                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 48),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 * 20),
                    setStackSize(IngotList.Iron_Ingot.copy(), 64 * 5),
                    setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 16),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 192),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 40),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 113 + 32))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * (64 * 20 + 50)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 91 + 16)),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 32),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Dyson_Swarm_Module_Deployment_Unit_Core, 1))
                .eut(RECIPE_UEV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Dyson Swarm Module Deployment Unit Superconducting Magnet"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#34")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(
                        GTNHIntergalacticList.Dyson_Swarm_Module_Deployment_Unit_Superconducting_Magnet.copy(),
                        0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 8),
                    setStackSize(CircuitList.Femto_Power_IC_Chip.copy(), 32),
                    setStackSize(GemList.Nether_Star.copy(), 64),
                    setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 16),
                    setStackSize(IngotList.Rhugnor_Ingot, 1),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 32),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 4))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 + 16)),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 16),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8))
                .itemOutputs(
                    setStackSize(
                        GTNHIntergalacticList.Dyson_Swarm_Module_Deployment_Unit_Superconducting_Magnet.copy(),
                        4))
                .eut(RECIPE_UEV)
                .duration(40 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // "Eye of Harmony"
        {
            // "Reinforced Spatial Structure Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#37")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(TecTechList.Reinforced_Spatial_Structure_Casing.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 5),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 16),

                    setStackSize(GemList.Nether_Star.copy(), 18),

                    setStackSize(GTBlockList.Block_Solar_Panel_UV.copy(), 1),

                    setStackSize(GTItemList.Energised_Tesseract.copy(), 1),
                    setStackSize(GTItemList.Gravitation_Engine.copy(), 64),
                    setStackSize(GTItemList.Neutronium_Nanites.copy(), 48),

                    setStackSize(IngotList.Abyssal_Alloy_Ingot.copy(), 64),
                    setStackSize(IngotList.Americium_Ingot.copy(), 64 * 3 + 51),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 16),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 2048 + 8),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 * 256),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 43),

                    setStackSize(IngotList.Creon_Ingot.copy(), 64 * 2 + 32),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 20),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 18),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 52),
                    setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 17 + 8),

                    setStackSize(IngotList.Iron_Ingot.copy(), 64 * 8208),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 8),
                    setStackSize(IngotList.Mellion_Ingot.copy(), 64 * 2 + 32),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 + 24),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 4 + 17),
                    setStackSize(IngotList.Netherite_Ingot.copy(), 64 * 16),

                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 282 + 48),
                    setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 4),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 54),
                    setStackSize(IngotList.Quantum_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Shirabon_Ingot.copy(), 8),

                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 2),
                    setStackSize(IngotList.Six_Phased_Copper_Ingot.copy(), 64),
                    setStackSize(IngotList.Superconductor_Base_UEV_Ingot.copy(), 64),
                    setStackSize(IngotList.Superconductor_Base_UIV_Ingot.copy(), 64),
                    setStackSize(IngotList.Titansteel_Ingot.copy(), 64),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 16))
                .fluidInputs(
                    requiredFluid(FluidList.Lubricant, 1000 * 52),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 136 + 54)),
                    requiredFluid(FluidList.Spatially_Enlarged_Fluid, 144 * 10),
                    requiredFluid(GasList.Radon, 1000 * 22 + 500))
                .itemOutputs(setStackSize(TecTechList.Reinforced_Spatial_Structure_Casing.copy(), 4))
                .eut(RECIPE_UMV)
                .duration(500 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Reinforced Temporal Structure Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#38")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(TecTechList.Reinforced_Temporal_Structure_Casing.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 64),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 32),

                    setStackSize(GTBlockList.Block_Solar_Panel_UV.copy(), 1),
                    setStackSize(GTItemList.Energised_Tesseract.copy(), 1),
                    setStackSize(GTItemList.Gravitation_Engine.copy(), 64),
                    setStackSize(GTItemList.Neutronium_Nanites.copy(), 48),

                    setStackSize(IngotList.Abyssal_Alloy_Ingot.copy(), 64),
                    setStackSize(IngotList.Americium_Ingot.copy(), 64 * 39),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 2048 + 8),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 * 256),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 41),
                    setStackSize(IngotList.Creon_Ingot.copy(), 64 * 2 + 32),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 18),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 12 + 44),
                    setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 16 + 8),
                    setStackSize(IngotList.Iron_Ingot.copy(), 64 * 8208),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 + 40),
                    setStackSize(IngotList.Mellion_Ingot.copy(), 64 * 2 + 32),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 7 + 32),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 48),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 11 + 52),
                    setStackSize(IngotList.Netherite_Ingot.copy(), 64 * 16),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 295 + 52),
                    setStackSize(IngotList.Osmium_Ingot.copy(), 32),
                    setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 8),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Quantum_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Shirabon_Ingot.copy(), 8),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 2 + 48),
                    setStackSize(IngotList.Six_Phased_Copper_Ingot.copy(), 64),
                    setStackSize(IngotList.Superconductor_Base_UEV_Ingot.copy(), 64),
                    setStackSize(IngotList.Superconductor_Base_UIV_Ingot.copy(), 64),
                    setStackSize(IngotList.Titansteel_Ingot.copy(), 64),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 16))
                .fluidInputs(
                    requiredFluid(FluidList.Lubricant, 1000 * (64 * 2 + 40)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 136)),
                    requiredFluid(FluidList.Tachyon_Rich_Temporal_Fluid, 144 * 10))
                .itemOutputs(setStackSize(TecTechList.Reinforced_Temporal_Structure_Casing.copy(), 4))
                .eut(RECIPE_UMV)
                .duration(500 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Infinite Spacetime Energy Boundary Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#39")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(TecTechList.Infinite_Spacetime_Energy_Boundary_Casing.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 8),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 20),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 64 * 2 + 32),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 64 * 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 8),

                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64 * 5),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 32),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 64),
                    setStackSize(CircuitList.HPIC_Wafer.copy(), 64 * 16),
                    setStackSize(CircuitList.UHPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Zepto_Power_IC_Chip.copy(), 8),

                    setStackSize(GemList.Blue_Topaz.copy(), 7),
                    setStackSize(GemList.Nether_Star.copy(), 64 * 7 + 16),

                    setStackSize(GoodGeneratorList.Ameliorated_Superconduct_Coil.copy(), 4),

                    setStackSize(GTBlockList.Block_Solar_Panel_UV.copy(), 1),
                    setStackSize(GTBlockList.Machine_Hull_UMV.copy(), 4),
                    setStackSize(GTItemList.Energised_Tesseract.copy(), 4),
                    setStackSize(GTItemList.Mega_Ultimate_Voltage_Coil.copy(), 8),
                    setStackSize(HatchList.Laser_Target_Hatch65536_UMV.copy(), 1),

                    setStackSize(IngotList.Americium_Ingot.copy(), 64 * 58),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 5 + 32),
                    setStackSize(IngotList.Callisto_Ice_Ingot.copy(), 7),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 32),
                    setStackSize(IngotList.Cobalt_Ingot.copy(), 16),
                    setStackSize(IngotList.Copper_Ingot.copy(), 16),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 68 + 59),
                    setStackSize(IngotList.Europium_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 16),
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 64 * 4 + 32),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 37 + 40),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 + 20),
                    setStackSize(IngotList.Iridium_Ingot.copy(), 64 + 48),
                    setStackSize(IngotList.Ledox_Ingot.copy(), 7),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 * 3),
                    setStackSize(IngotList.Metastable_Oganesson_Ingot.copy(), 7),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 22),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 79 + 24),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 116 + 32),
                    setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 16),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 32),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 16 + 60),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 32),

                    setStackSize(MultiMachineCasingList.Superconducting_Coil_Block.copy(), 4),
                    setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 20),
                    setStackSize(MultiMachineControllerList.Lapotronic_Supercapacitor.copy(), 1),
                    setStackSize(NewHorizonsCoreModList.High_Energy_Flow_Circuit.copy(), 64),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 6),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 64 + 32))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 32),
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 2),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * (64 * 2 + 32)),
                    requiredFluid(FluidList.Lubricant, 1000 * (64 * 11)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 37 + 52)),
                    requiredFluid(FluidList.Super_Coolant, 1000 * (64 * 2)),
                    requiredFluid(FluidList.UU_Matter, 1000 * (64 * 2)),
                    requiredFluid(GasList.Radon, 1000 * (64 * 8 + 28)))
                .itemOutputs(setStackSize(TecTechList.Infinite_Spacetime_Energy_Boundary_Casing.copy(), 1))
                .eut(RECIPE_UMV)
                .duration(500 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            final ItemStack[] boltList = new ItemStack[] { setStackSize(IngotList.Shirabon_Ingot.copy(), 1),
                setStackSize(IngotList.White_Dwarf_Matter_Ingot.copy(), 1),
                setStackSize(IngotList.White_Dwarf_Matter_Ingot.copy(), 1),
                setStackSize(IngotList.White_Dwarf_Matter_Ingot.copy(), 2),
                setStackSize(IngotList.Black_Dwarf_Matter_Ingot.copy(), 1),
                setStackSize(IngotList.Black_Dwarf_Matter_Ingot.copy(), 1),
                setStackSize(IngotList.Black_Dwarf_Matter_Ingot.copy(), 2),
                setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(), 1),
                setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(), 1) };

            // Spacetime Compression Field Generator
            {
                final ItemStack[] yottankCell = new ItemStack[] {
                    setStackSize(GTBlockList.Fluid_Cell_Block_T7.copy(), 1),
                    setStackSize(GTBlockList.Fluid_Cell_Block_T7.copy(), 2).copy(),
                    setStackSize(GTBlockList.Fluid_Cell_Block_T7.copy(), 3),
                    setStackSize(GTBlockList.Fluid_Cell_Block_T8.copy(), 1).copy(),
                    setStackSize(GTBlockList.Fluid_Cell_Block_T8.copy(), 2),
                    setStackSize(GTBlockList.Fluid_Cell_Block_T8.copy(), 3).copy(),
                    setStackSize(GTBlockList.Fluid_Cell_Block_T9.copy(), 1),
                    setStackSize(GTBlockList.Fluid_Cell_Block_T9.copy(), 2),
                    setStackSize(GTBlockList.Fluid_Cell_Block_T9.copy(), 3) };

                final ItemStack[] manipulator = new ItemStack[] {
                    setStackSize(MultiMachineCasingList.Cosmic_Fabric_Manipulator.copy(), 1),
                    setStackSize(MultiMachineCasingList.Cosmic_Fabric_Manipulator.copy(), 2),
                    setStackSize(MultiMachineCasingList.Cosmic_Fabric_Manipulator.copy(), 3),
                    setStackSize(MultiMachineCasingList.Infinity_Infused_Manipulator.copy(), 1),
                    setStackSize(MultiMachineCasingList.Infinity_Infused_Manipulator.copy(), 2),
                    setStackSize(MultiMachineCasingList.Infinity_Infused_Manipulator.copy(), 3),
                    setStackSize(MultiMachineCasingList.SpaceTime_Continuum_Ripper.copy(), 1),
                    setStackSize(MultiMachineCasingList.SpaceTime_Continuum_Ripper.copy(), 2),
                    setStackSize(MultiMachineCasingList.SpaceTime_Continuum_Ripper.copy(), 3) };

                final ItemStack[] researchStuff = new ItemStack[] {
                    TecTechList.Crude_Spacetime_Compression_Field_Generator,
                    TecTechList.Primitive_Spacetime_Compression_Field_Generator,
                    TecTechList.Stable_Spacetime_Compression_Field_Generator,
                    TecTechList.Advanced_Spacetime_Compression_Field_Generator,
                    TecTechList.Superb_Spacetime_Compression_Field_Generator,
                    TecTechList.Exotic_Spacetime_Compression_Field_Generator,
                    TecTechList.Perfect_Spacetime_Compression_Field_Generator,
                    TecTechList.Tipler_Spacetime_Compression_Field_Generator,
                    TecTechList.Gallifreyan_Spacetime_Compression_Field_Generator };

                for (int absoluteTier = 0; absoluteTier < 9; absoluteTier++) {
                    ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#40")
                        .itemInputsUnsafe(
                            GTUtility.getIntegratedCircuit(absoluteTier + 1),

                            MultiMachineCasingList.Reinforced_Spatial_Structure_Casing,
                            yottankCell[absoluteTier],
                            setStackSize(GTBlockList.Quantum_Tank_IV.copy(), 4 * (absoluteTier + 1)),
                            setStackSize(AvaritiaList.Infinity_Chest.copy(), absoluteTier + 1),
                            setStackSize(IngotList.SpaceTime_Ingot.copy(), 10),

                            manipulator[absoluteTier],
                            setStackSize(
                                Appliedenergistics2List.Digital_Singularity_ME_Storage_Cell.copy(),
                                absoluteTier + 1),
                            boltList[absoluteTier],
                            getMaterialInput(OrePrefixes.circuit, Materials.UXV, (absoluteTier / 3) + 1))
                        .fluidInputs(
                            requiredFluid(FluidList.Mutated_Living_Solder, (int) (144 * 20 * pow(2, absoluteTier))),
                            requiredFluid(FluidList.Spatially_Enlarged_Fluid, 144 * 10 * (absoluteTier + 1)))
                        .itemOutputs(researchStuff[absoluteTier])
                        .eut(RECIPE_UMV)
                        .duration(4_000 * SECONDS * (absoluteTier + 1))
                        .addTo(AssemblyLineItemRecipe);
                }
            }

            // EOH Time Dilation Field Generators.
            {
                final ItemStack[] fusionReactors = new ItemStack[] {
                    setStackSize(MultiMachineControllerList.Fusion_Control_Computer_Mark_II.copy(), 1),
                    setStackSize(MultiMachineControllerList.Fusion_Control_Computer_Mark_II.copy(), 2),
                    setStackSize(MultiMachineControllerList.Fusion_Control_Computer_Mark_II.copy(), 3),
                    setStackSize(MultiMachineControllerList.Fusion_Control_Computer_Mark_III.copy(), 1),
                    setStackSize(MultiMachineControllerList.Fusion_Control_Computer_Mark_III.copy(), 2),
                    setStackSize(MultiMachineControllerList.Fusion_Control_Computer_Mark_III.copy(), 3),
                    setStackSize(MultiMachineControllerList.FusionTech_MK_IV.copy(), 1),
                    setStackSize(MultiMachineControllerList.FusionTech_MK_IV.copy(), 2),
                    setStackSize(MultiMachineControllerList.FusionTech_MK_IV.copy(), 3) };

                final ItemStack[] fusionCoils = new ItemStack[] {
                    setStackSize(GoodGeneratorList.Compact_Fusion_Coil.copy(), 1),
                    setStackSize(GoodGeneratorList.Compact_Fusion_Coil.copy(), 2),
                    setStackSize(GoodGeneratorList.Compact_Fusion_Coil.copy(), 3),
                    setStackSize(GoodGeneratorList.Advanced_Compact_Fusion_Coil.copy(), 1),
                    setStackSize(GoodGeneratorList.Advanced_Compact_Fusion_Coil.copy(), 2),
                    setStackSize(GoodGeneratorList.Advanced_Compact_Fusion_Coil.copy(), 3),
                    setStackSize(GoodGeneratorList.Compact_Fusion_Coil_MKII_Prototype.copy(), 1),
                    setStackSize(GoodGeneratorList.Compact_Fusion_Coil_MKII_Prototype.copy(), 2),
                    setStackSize(GoodGeneratorList.Compact_Fusion_Coil_MKII_Prototype.copy(), 3) };

                final ItemStack[] researchStuff = new ItemStack[] { TecTechList.Crude_Time_Dilation_Field_Generator,
                    TecTechList.Primitive_Time_Dilation_Field_Generator,
                    TecTechList.Stable_Time_Dilation_Field_Generator,
                    TecTechList.Advanced_Time_Dilation_Field_Generator,
                    TecTechList.Superb_Time_Dilation_Field_Generator.copy(),
                    TecTechList.Exotic_Time_Dilation_Field_Generator,
                    TecTechList.Perfect_Time_Dilation_Field_Generator.copy(),
                    TecTechList.Tipler_Time_Dilation_Field_Generator,
                    TecTechList.Gallifreyan_Time_Dilation_Field_Generator };

                for (int absoluteTier = 0; absoluteTier < 9; absoluteTier++) {
                    ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#41")
                        .itemInputsUnsafe(
                            GTUtility.getIntegratedCircuit(absoluteTier + 1),

                            MultiMachineCasingList.Reinforced_Temporal_Structure_Casing,
                            fusionReactors[absoluteTier],
                            fusionCoils[absoluteTier],
                            setStackSize(GTBlockList.Block_Solar_Panel_UV.copy(), absoluteTier + 1),

                            getMaterialInput(OrePrefixes.circuit, Materials.UXV, absoluteTier + 1),
                            setStackSize(SolarPanelsList.Red_Spectral_Component.copy(), 64),
                            setStackSize(SolarPanelsList.Green_Spectral_Component.copy(), 64),
                            setStackSize(SolarPanelsList.Blue_Spectral_Component.copy(), 64),

                            boltList[absoluteTier],
                            setStackSize(
                                GTNHIntergalacticList.Dyson_Swarm_Module_Deployment_Unit_Base_Casing,
                                4 * (absoluteTier + 1)),
                            setStackSize(
                                GTNHIntergalacticList.Dyson_Swarm_Energy_Receiver_Dish_Block,
                                4 * (absoluteTier + 1)),
                            setStackSize(MachineList.World_Accelerator_UV.copy(), 4 * (absoluteTier + 1)),

                            setStackSize(BatteryList.Energy_Module_Empty.copy(), absoluteTier + 1),
                            setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 4 * (absoluteTier + 1)),
                            setStackSize(IngotList.SpaceTime_Ingot.copy(), 10))
                        .fluidInputs(
                            requiredFluid(FluidList.Mutated_Living_Solder, (int) (144 * 20 * pow(2, absoluteTier))),
                            requiredFluid(FluidList.Tachyon_Rich_Temporal_Fluid, 144 * 10 * (absoluteTier + 1)))
                        .itemOutputs(researchStuff[absoluteTier])
                        .eut(RECIPE_UMV)
                        .duration(4_000 * SECONDS * (absoluteTier + 1))
                        .addTo(AssemblyLineItemRecipe);
                }
            }

            // EOH Stabilisation Field Generator
            {
                final ItemStack[] timeCasings = new ItemStack[] { TecTechList.Crude_Time_Dilation_Field_Generator,
                    TecTechList.Primitive_Time_Dilation_Field_Generator,
                    TecTechList.Stable_Time_Dilation_Field_Generator,
                    TecTechList.Advanced_Time_Dilation_Field_Generator,
                    TecTechList.Superb_Time_Dilation_Field_Generator.copy(),
                    TecTechList.Exotic_Time_Dilation_Field_Generator,
                    TecTechList.Perfect_Time_Dilation_Field_Generator.copy(),
                    TecTechList.Tipler_Time_Dilation_Field_Generator,
                    TecTechList.Gallifreyan_Time_Dilation_Field_Generator };

                final ItemStack[] spacetimeCasings = new ItemStack[] {
                    TecTechList.Crude_Spacetime_Compression_Field_Generator,
                    TecTechList.Primitive_Spacetime_Compression_Field_Generator,
                    TecTechList.Stable_Spacetime_Compression_Field_Generator,
                    TecTechList.Advanced_Spacetime_Compression_Field_Generator,
                    TecTechList.Superb_Spacetime_Compression_Field_Generator,
                    TecTechList.Exotic_Spacetime_Compression_Field_Generator,
                    TecTechList.Perfect_Spacetime_Compression_Field_Generator,
                    TecTechList.Tipler_Spacetime_Compression_Field_Generator,
                    TecTechList.Gallifreyan_Spacetime_Compression_Field_Generator };

                final ItemStack[] researchStuff = new ItemStack[] { TecTechList.Crude_Stabilisation_Field_Generator,
                    TecTechList.Primitive_Stabilisation_Field_Generator,
                    TecTechList.Stable_Stabilisation_Field_Generator,
                    TecTechList.Advanced_Stabilisation_Field_Generator,
                    TecTechList.Superb_Stabilisation_Field_Generator.copy(),
                    TecTechList.Exotic_Stabilisation_Field_Generator,
                    TecTechList.Perfect_Stabilisation_Field_Generator.copy(),
                    TecTechList.Tipler_Stabilisation_Field_Generator,
                    TecTechList.Gallifreyan_Stabilisation_Field_Generator };

                for (int absoluteTier = 0; absoluteTier < 9; absoluteTier++) {
                    ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#42")
                        .itemInputsUnsafe(
                            GTUtility.getIntegratedCircuit(absoluteTier + 1),

                            timeCasings[absoluteTier],
                            spacetimeCasings[absoluteTier],
                            MultiMachineCasingList.Infinite_Spacetime_Energy_Boundary_Casing,
                            setStackSize(GTNHIntergalacticList.Dyson_Swarm_Module.copy(), 4 * (absoluteTier + 1)),

                            setStackSize(IngotList.Superconductor_Base_UMV_Ingot.copy(), 8 * (absoluteTier + 1)),
                            setStackSize(IngotList.Superconductor_Base_UIV_Ingot.copy(), 8 * (absoluteTier + 1)),
                            setStackSize(IngotList.Superconductor_Base_UEV_Ingot.copy(), 8 * (absoluteTier + 1)),
                            setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 8 * (absoluteTier + 1)),

                            setStackSize(GTItemList.Gravitation_Engine.copy(), 256),
                            boltList[absoluteTier],
                            setStackSize(IngotList.SpaceTime_Ingot.copy(), 4 * (absoluteTier + 1)),
                            setStackSize(IngotList.SpaceTime_Ingot.copy(), absoluteTier + 1),
                            setStackSize(IngotList.SpaceTime_Ingot.copy(), 10))
                        .fluidInputs(
                            requiredFluid(FluidList.Mutated_Living_Solder, (int) (144 * 20 * pow(2, absoluteTier))),
                            requiredFluid(FluidList.Tachyon_Rich_Temporal_Fluid, 144 * 10 * (absoluteTier + 1)),
                            requiredFluid(FluidList.Spatially_Enlarged_Fluid, 144 * 10 * (absoluteTier + 1)))
                        .itemOutputs(researchStuff[absoluteTier])
                        .eut(RECIPE_UMV)
                        .duration((absoluteTier + 1) * 4_000 * SECONDS)
                        .addTo(AssemblyLineItemRecipe);
                }
            }
        }

        // Exo-Foundry
        {
            // S.O.C
            {
                // "Sentient Overclocker Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#43")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),
                        setStackSize(MultiMachineCasingList.Sentient_Overclocker_Casing.copy(), 0),

                        getMaterialInput(OrePrefixes.circuit, Materials.UXV, 6),
                        getMaterialInput(OrePrefixes.circuit, Materials.UMV, 16),
                        getMaterialInput(OrePrefixes.circuit, Materials.UIV, 12),
                        getMaterialInput(OrePrefixes.circuit, Materials.UEV, 2),
                        getMaterialInput(OrePrefixes.circuit, Materials.UHV, 10),
                        getMaterialInput(OrePrefixes.circuit, Materials.UV, 1),
                        getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 14 + 31),

                        setStackSize(GoodGeneratorList.Compact_Fusion_Coil_MKII_Finaltype.copy(), 1),
                        setStackSize(GTItemList.Stable_Boson_Containment_Unit.copy(), 1),
                        setStackSize(GTItemList.Transcendent_Metal_Nanites.copy(), 2),

                        setStackSize(IngotList.Abyssal_Alloy_Ingot.copy(), 10),
                        setStackSize(IngotList.Advanced_Nitinol_Ingot.copy(), 4),
                        setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 44),
                        setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 64),
                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 4 + 34),
                        setStackSize(IngotList.Bedrockium_Ingot.copy(), 44),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 * 2 + 18),
                        setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 16),
                        setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 32),
                        setStackSize(IngotList.Cobalt_Ingot.copy(), 16),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 56),
                        setStackSize(IngotList.Creon_Ingot.copy(), 8),
                        setStackSize(IngotList.Europium_Ingot.copy(), 32),
                        setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 4 + 16),
                        setStackSize(IngotList.Hypogen_Ingot.copy(), 64 * 10 + 4),
                        setStackSize(IngotList.Ichorium_Ingot.copy(), 8),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 29),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 64 + 40),
                        setStackSize(IngotList.Iron_Ingot.copy(), 64 * 1026),
                        setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 32),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 13),
                        setStackSize(IngotList.Mellion_Ingot.copy(), 8),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 14),
                        setStackSize(IngotList.Naquadah_Ingot.copy(), 16),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 64 + 21),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 3 + 8),
                        setStackSize(IngotList.Octiron_Ingot.copy(), 8),
                        setStackSize(IngotList.Osmiridium_Ingot.copy(), 4),
                        setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 32),
                        setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 2 + 10),
                        setStackSize(IngotList.Purified_Tengam_Ingot.copy(), 16),
                        setStackSize(IngotList.Quantium_Ingot.copy(), 64 + 56),
                        setStackSize(IngotList.Quantum_Ingot.copy(), 64),
                        setStackSize(IngotList.Shirabon_Ingot.copy(), 40),
                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64),
                        setStackSize(IngotList.Six_Phased_Copper_Ingot.copy(), 64),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 5 + 8),
                        setStackSize(IngotList.Superconductor_Base_UIV_Ingot.copy(), 64 * 16),
                        setStackSize(IngotList.Titansteel_Ingot.copy(), 64 + 8),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 + 6),
                        setStackSize(IngotList.Trinium_Ingot.copy(), 48),
                        setStackSize(IngotList.Tritanium_Ingot.copy(), 16),
                        setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 32),

                        setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 5 + 32),
                        setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 32))
                    .fluidInputs(
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * (64 * 5 + 56)),
                        requiredFluid(FluidList.IC2_Coolant, 1000 * 16),
                        requiredFluid(FluidList.Lubricant, 1000 * 8),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 6)),
                        requiredFluid(FluidList.Super_Coolant, 1000 * 2 + 500),
                        requiredFluid(GasList.Radon, 1000 * 29),
                        requiredFluid(MoltenList.Molten_Proto_Halkonite_Steel_Base, 144 * 20))
                    .itemOutputs(setStackSize(MultiMachineCasingList.Sentient_Overclocker_Casing.copy(), 1))
                    .eut(RECIPE_UMV)
                    .duration(45 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Magnetic Flux Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#44")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),
                        setStackSize(GoodGeneratorList.Magnetic_Flux_Casing.copy(), 0),

                        getMaterialInput(OrePrefixes.circuit, Materials.UIV, 9),
                        getMaterialInput(OrePrefixes.circuit, Materials.UEV, 8),
                        getMaterialInput(OrePrefixes.circuit, Materials.UHV, 32),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 5 + 44),

                        setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 32),
                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 40),
                        setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 2 + 48),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 16),
                        setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 32),
                        setStackSize(IngotList.Cobalt_Ingot.copy(), 64),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 3 + 24),
                        setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 8),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 5 + 4),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 16),
                        setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 32),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 48),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 5 + 20),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 12 + 16),
                        setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 32),
                        setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 2 + 17),
                        setStackSize(IngotList.Purified_Tengam_Ingot.copy(), 64),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 + 24),
                        setStackSize(IngotList.Tritanium_Ingot.copy(), 64),

                        setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 8),
                        setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64))
                    .fluidInputs(
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 8),
                        requiredFluid(FluidList.IC2_Coolant, 1000 * 64),
                        requiredFluid(FluidList.Lubricant, 1000 * 32),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 + 8)),
                        requiredFluid(FluidList.Super_Coolant, 1000 * 10),
                        requiredFluid(GasList.Radon, 1000 * (64 + 36)))
                    .itemOutputs(setStackSize(GoodGeneratorList.Magnetic_Flux_Casing.copy(), 4))
                    .eut(RECIPE_UIV)
                    .duration(60 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Gravity Stabilization Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#45")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),
                        setStackSize(GoodGeneratorList.Gravity_Stabilization_Casing.copy(), 0),

                        getMaterialInput(OrePrefixes.circuit, Materials.UIV, 9),
                        getMaterialInput(OrePrefixes.circuit, Materials.UHV, 8),
                        getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),
                        getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 16),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 4 + 14),
                        setStackSize(GTItemList.Stable_Boson_Containment_Unit.copy(), 2),

                        setStackSize(IngotList.Abyssal_Alloy_Ingot.copy(), 40),
                        setStackSize(IngotList.Advanced_Nitinol_Ingot.copy(), 16),
                        setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 64 + 16),
                        setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 1),
                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 32),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 16),
                        setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 64),
                        setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 32),
                        setStackSize(IngotList.Europium_Ingot.copy(), 64 * 2),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 48),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 16),
                        setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 32),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 4),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 55),
                        setStackSize(IngotList.Naquadah_Ingot.copy(), 64),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 16),
                        setStackSize(IngotList.Octiron_Ingot.copy(), 32),
                        setStackSize(IngotList.Osmiridium_Ingot.copy(), 16),
                        setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 32),
                        setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 2 + 8),
                        setStackSize(IngotList.Titansteel_Ingot.copy(), 33),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64),
                        setStackSize(IngotList.Trinium_Ingot.copy(), 64 * 3),
                        setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64 * 2),
                        setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 14),
                        setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64))
                    .fluidInputs(
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 8),
                        requiredFluid(FluidList.Lubricant, 1000 * 3),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 + 8)),
                        requiredFluid(GasList.Radon, 1000 * 17 + 500))
                    .itemOutputs(setStackSize(GoodGeneratorList.Gravity_Stabilization_Casing.copy(), 4))
                    .eut(RECIPE_UIV)
                    .duration(60 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Antimatter Containment Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#46")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),
                        setStackSize(GoodGeneratorList.Antimatter_Containment_Casing.copy(), 0),

                        getMaterialInput(OrePrefixes.circuit, Materials.UIV, 8),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 4),

                        setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 32),
                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 32),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 16),
                        setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 64),
                        setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 32),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 20),
                        setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 32),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 32),
                        setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 32),
                        setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 2 + 4),
                        setStackSize(IngotList.Radox_Polymer_Bar.copy(), 1),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 + 32),

                        setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64))
                    .fluidInputs(
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 8),
                        requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Resplendent_Catalyst, 1000 * 4),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 36),
                        requiredFluid(PlasmaList.Helium_Plasma, 144 * 16))
                    .itemOutputs(setStackSize(GoodGeneratorList.Antimatter_Containment_Casing.copy(), 4))
                    .eut(RECIPE_UIV)
                    .duration(60 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Infinite Magnetic Chassis"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#47")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),
                        setStackSize(MultiMachineCasingList.Infinite_Magnetic_Chassis.copy(), 0),

                        getMaterialInput(OrePrefixes.circuit, Materials.UEV, 1),
                        getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),

                        setStackSize(CircuitList.Optically_Compatible_Memory.copy(), 8),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 2 + 8),

                        setStackSize(GoodGeneratorList.Hi_Computation_Station_MKIV_Prototype.copy(), 4),

                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 1),
                        setStackSize(IngotList.Bedrockium_Ingot.copy(), 18),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 19),
                        setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64),
                        setStackSize(IngotList.High_Durability_Compound_Steel_Ingot.copy(), 32),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 39),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 8),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 4),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 39),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 + 16),
                        setStackSize(IngotList.Rhugnor_Ingot, 1),
                        setStackSize(IngotList.Superconductor_Base_UEV_Ingot.copy(), 2))
                    .fluidInputs(
                        requiredFluid(FluidList.Lubricant, 1000 * 4),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 4),
                        requiredFluid(GasList.Radon, 1000 * 10))
                    .itemOutputs(setStackSize(MultiMachineCasingList.Infinite_Magnetic_Chassis.copy(), 1))
                    .eut(RECIPE_UEV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Eternal Magnetic Chassis"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#48")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),
                        setStackSize(MultiMachineCasingList.Eternal_Magnetic_Chassis.copy(), 0),

                        getMaterialInput(OrePrefixes.circuit, Materials.UIV, 8),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 2),

                        setStackSize(GoodGeneratorList.Compact_Fusion_Coil_MKII_Finaltype.copy(), 1),

                        setStackSize(GTItemList.Transcendent_Metal_Nanites.copy(), 2),

                        setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 16),
                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 16),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 8),
                        setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 16),
                        setStackSize(IngotList.Creon_Ingot.copy(), 8),
                        setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 2 + 16),
                        setStackSize(IngotList.Ichorium_Ingot.copy(), 8),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 8),
                        setStackSize(IngotList.Iron_Ingot.copy(), 64 * 1026),
                        setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 16),
                        setStackSize(IngotList.Mellion_Ingot.copy(), 8),
                        setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 16),
                        setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64),
                        setStackSize(IngotList.Six_Phased_Copper_Ingot.copy(), 64),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 32))
                    .fluidInputs(
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 24),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 36),
                        requiredFluid(MoltenList.Molten_Proto_Halkonite_Steel_Base, 144 * 20))
                    .itemOutputs(setStackSize(MultiMachineCasingList.Eternal_Magnetic_Chassis.copy(), 1))
                    .eut(RECIPE_UIV)
                    .duration(45 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);
            }

            // S.L.C
            {
                // "Streamlined Casting Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#49")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),
                        setStackSize(MultiMachineCasingList.Streamlined_Casting_Casing.copy(), 0),

                        getMaterialInput(OrePrefixes.circuit, Materials.UEV, 3),
                        getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),
                        getMaterialInput(OrePrefixes.circuit, Materials.UV, 23),
                        getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 64),
                        getMaterialInput(OrePrefixes.circuit, Materials.LuV, 64 * 2),

                        setStackSize(CircuitList.Optically_Compatible_Memory.copy(), 8),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 2 + 8),

                        setStackSize(GoodGeneratorList.Hi_Computation_Station_MKIV_Prototype.copy(), 4),

                        setStackSize(IngotList.Americium_Ingot.copy(), 64 * 82),
                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 1),
                        setStackSize(IngotList.Bedrockium_Ingot.copy(), 26),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 20),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 55),
                        setStackSize(IngotList.Enriched_Naquadah_Alloy_Ingot.copy(), 10),
                        setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64),
                        setStackSize(IngotList.High_Durability_Compound_Steel_Ingot.copy(), 32),
                        setStackSize(IngotList.Holmium_Ingot.copy(), 40),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 26 + 38),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 8),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 * 2 + 24),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 14 + 16),
                        setStackSize(IngotList.Naquadah_Ingot.copy(), 64 + 32),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 32 + 34),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 31 + 52),
                        setStackSize(IngotList.Osmium_Ingot.copy(), 64),
                        setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 16),
                        setStackSize(IngotList.Rhugnor_Ingot, 1),
                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 5 + 40),
                        setStackSize(IngotList.Superconductor_Base_UEV_Ingot.copy(), 2),
                        setStackSize(IngotList.Tritanium_Ingot.copy(), 64 * 16))
                    .fluidInputs(
                        requiredFluid(FluidList.Lubricant, 1000 * (64 * 5 + 28)),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 24),
                        requiredFluid(GasList.Radon, 1000 * 10))
                    .itemOutputs(setStackSize(MultiMachineCasingList.Streamlined_Casting_Casing.copy(), 1))
                    .eut(RECIPE_UEV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Elemental Confinement Shell"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#35")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),
                        setStackSize(MultiMachineCasingList.Elemental_Confinement_Shell.copy(), 0),

                        getMaterialInput(OrePrefixes.circuit, Materials.IV, 4),
                        setStackSize(GTItemList.Data_Stick.copy(), 4),
                        setStackSize(GTItemList.Field_Generator_HV.copy(), 16),
                        setStackSize(GTPPList.Energy_Core_MV.copy(), 2),
                        setStackSize(IngotList.Babbit_Alloy_Ingot.copy(), 16),
                        setStackSize(IngotList.Hastelloy_N_Ingot.copy(), 8),
                        setStackSize(IngotList.Inconel_625_Ingot.copy(), 18),
                        setStackSize(IngotList.Inconel_792_Ingot.copy(), 8),
                        setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 5),
                        setStackSize(IngotList.Polytetrafluoroethylene_PTFE_Bar.copy(), 10),
                        setStackSize(IngotList.Rhodium_Plated_Palladium_Ingot.copy(), 40),
                        setStackSize(IngotList.Trinium_Naquadah_Carbonite_Ingot.copy(), 1),
                        setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 5))
                    .itemOutputs(setStackSize(MultiMachineCasingList.Elemental_Confinement_Shell.copy(), 1))
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);
            }

            // P.V.S
            {
                // "Proto-Volt Stabilizer Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#51")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),
                        setStackSize(MultiMachineCasingList.Proto_Volt_Stabilizer_Casing.copy(), 0),

                        getMaterialInput(OrePrefixes.circuit, Materials.UEV, 1),
                        getMaterialInput(OrePrefixes.circuit, Materials.UHV, 12),
                        getMaterialInput(OrePrefixes.circuit, Materials.UV, 44),
                        getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 32),

                        setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 16),
                        setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 4),
                        setStackSize(CircuitList.HPIC_Wafer.copy(), 64 * 2),
                        setStackSize(CircuitList.Optically_Compatible_Memory.copy(), 8),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 2 + 61),

                        setStackSize(GoodGeneratorList.Hi_Computation_Station_MKIV_Prototype.copy(), 4),

                        setStackSize(GTItemList.Solar_Panel_UV.copy(), 1),

                        setStackSize(IngotList.Americium_Ingot.copy(), 64 * 7 + 32),
                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 7),
                        setStackSize(IngotList.Bedrockium_Ingot.copy(), 18),
                        setStackSize(IngotList.Cobalt_Ingot.copy(), 48),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 19),
                        setStackSize(IngotList.Europium_Ingot.copy(), 64 * 4 + 32),
                        setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 2 + 16),
                        setStackSize(IngotList.High_Durability_Compound_Steel_Ingot.copy(), 32),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 6 + 3),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 8),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 52),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 4 + 24),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 9 + 9),
                        setStackSize(IngotList.Neodymium_Ingot.copy(), 64 * 4),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 5 + 32),
                        setStackSize(IngotList.Osmiridium_Ingot.copy(), 32),
                        setStackSize(IngotList.Purified_Tengam_Ingot.copy(), 64),
                        setStackSize(IngotList.Rhugnor_Ingot, 1),
                        setStackSize(IngotList.Samarium_Ingot.copy(), 64 * 2),
                        setStackSize(IngotList.Superconductor_Base_UEV_Ingot.copy(), 2),
                        setStackSize(IngotList.Trinium_Ingot.copy(), 64 * 6),
                        setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64 * 4),
                        setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 2),
                        setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 64 * 4))
                    .fluidInputs(
                        requiredFluid(FluidList.IC2_Coolant, 1000 * 48),
                        requiredFluid(FluidList.Lubricant, 1000 * (64 + 26)),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 24),
                        requiredFluid(GasList.Radon, 1000 * (64 + 16)))
                    .itemOutputs(setStackSize(MultiMachineCasingList.Proto_Volt_Stabilizer_Casing.copy(), 1))
                    .eut(RECIPE_UEV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);
            }

            // H.C
            {
                // "Hypercooler Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#52")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),
                        setStackSize(MultiMachineCasingList.Hypercooler_Casing.copy(), 0),

                        getMaterialInput(OrePrefixes.circuit, Materials.UEV, 1),
                        getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),
                        getMaterialInput(OrePrefixes.circuit, Materials.UIV, 10),
                        getMaterialInput(OrePrefixes.circuit, Materials.UV, 23),
                        getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 64),
                        getMaterialInput(OrePrefixes.circuit, Materials.LuV, 64 * 2),

                        setStackSize(CircuitList.Optically_Compatible_Memory.copy(), 8),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 3 + 8),

                        setStackSize(GoodGeneratorList.Hi_Computation_Station_MKIV_Prototype.copy(), 4),

                        setStackSize(IngotList.Americium_Ingot.copy(), 64 * 82),
                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 2),
                        setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 64 + 32),
                        setStackSize(IngotList.Bedrockium_Ingot.copy(), 18),
                        setStackSize(IngotList.Callisto_Ice_Ingot.copy(), 64 * 32),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 19),
                        setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64),
                        setStackSize(IngotList.High_Durability_Compound_Steel_Ingot.copy(), 32),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 26),
                        setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64 * 64),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 8),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 * 3 + 20),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 14 + 16),
                        setStackSize(IngotList.Naquadah_Ingot.copy(), 64 + 32),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 24 + 15),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 24 + 40),
                        setStackSize(IngotList.Osmium_Ingot.copy(), 64),
                        setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 16),
                        setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 8),
                        setStackSize(IngotList.Rhugnor_Ingot, 1),
                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 7 + 32),
                        setStackSize(IngotList.Six_Phased_Copper_Ingot.copy(), 64 * 16),
                        setStackSize(IngotList.SpaceTime_Ingot, 1),
                        setStackSize(IngotList.Superconductor_Base_UEV_Ingot.copy(), 2),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 6))
                    .fluidInputs(
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * (64 * 2 + 26)),
                        requiredFluid(FluidList.Lubricant, 1000 * (64 * 5 + 20)),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 20 + 36)),
                        requiredFluid(GasList.Radon, 1000 * 10),
                        requiredFluid(MoltenList.Molten_Proto_Halkonite_Steel_Base, 144 * 8))
                    .itemOutputs(setStackSize(MultiMachineCasingList.Hypercooler_Casing.copy(), 1))
                    .eut(RECIPE_UIV)
                    .duration(45 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);
            }

            // S.C.B
            {
                // "Superdense Casting Basin Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#53")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),
                        setStackSize(MultiMachineCasingList.Superdense_Casting_Basin_Casing.copy(), 0),

                        getMaterialInput(OrePrefixes.circuit, Materials.UEV, 2),
                        getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),

                        setStackSize(CircuitList.Optically_Compatible_Memory.copy(), 8),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 2 + 8),

                        setStackSize(GoodGeneratorList.Hi_Computation_Station_MKIV_Prototype.copy(), 4),

                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 2),
                        setStackSize(IngotList.Bedrockium_Ingot.copy(), 18),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 2 + 19),
                        setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64),
                        setStackSize(IngotList.High_Durability_Compound_Steel_Ingot.copy(), 32),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 39),
                        setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64 * 2),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 8),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 4),
                        setStackSize(IngotList.Manyullyn_Ingot.copy(), 64 + 36),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 6 + 54),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 3 + 32),
                        setStackSize(IngotList.Precious_Metals_Alloy_Ingot.copy(), 20),
                        setStackSize(IngotList.Rhugnor_Ingot, 1),
                        setStackSize(IngotList.Superconductor_Base_UEV_Ingot.copy(), 6),
                        setStackSize(IngotList.Tantalum_Hafnium_Carbide_Ingot.copy(), 16))
                    .fluidInputs(
                        requiredFluid(FluidList.Lubricant, 1000 * 4),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 24),
                        requiredFluid(GasList.Radon, 1000 * 10))
                    .itemOutputs(setStackSize(MultiMachineCasingList.Superdense_Casting_Basin_Casing.copy(), 1))
                    .eut(RECIPE_UEV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Primary Exo-Foundry Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#54")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),
                        setStackSize(MultiMachineCasingList.Primary_Exo_Foundry_Casing.copy(), 0),

                        setStackSize(CircuitList.Optically_Perfected_CPU.copy(), 6),

                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 2),
                        setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 32),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 1),
                        setStackSize(IngotList.Iridium_Ingot.copy(), 64 * 18),
                        setStackSize(IngotList.Lead_Ingot.copy(), 64 * 2 + 8),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 2 + 32),
                        setStackSize(IngotList.Netherite_Ingot.copy(), 2),
                        setStackSize(IngotList.Osmiridium_Ingot.copy(), 32),
                        setStackSize(IngotList.Trinium_Ingot.copy(), 32),
                        setStackSize(IngotList.Tungstencarbide_Ingot.copy(), 8),
                        setStackSize(IngotList.Vibrant_Alloy_Ingot.copy(), 32),

                        setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 2))
                    .fluidInputs(
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 4),
                        requiredFluid(FluidList.Prismatic_Naquadah_Composite_Slurry, 1000 * 16),
                        requiredFluid(GasList.Oganesson, 500))
                    .itemOutputs(setStackSize(MultiMachineCasingList.Primary_Exo_Foundry_Casing.copy(), 1))
                    .eut(RECIPE_UEV)
                    .duration(15 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);
            }

            // H.R
            {
                // "Heliocast Reinforcement Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#55")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),
                        setStackSize(MultiMachineCasingList.Heliocast_Reinforcement_Casing.copy(), 0),
                        setStackSize(IngotList.Six_Phased_Copper_Ingot.copy(), 6),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 6),

                        getMaterialInput(OrePrefixes.circuit, Materials.UIV, 8),
                        setStackSize(GTItemList.Sensor_UIV.copy(), 4),
                        setStackSize(GTItemList.Emitter_UIV.copy(), 4),
                        setStackSize(IngotList.Rhugnor_Ingot.copy(), 16),
                        setStackSize(IngotList.Metastable_Oganesson_Ingot.copy(), 40),
                        setStackSize(IngotList.Mellion_Ingot.copy(), 20),
                        setStackSize(IngotList.Creon_Ingot.copy(), 20),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 5),

                        getMaterialInput(OrePrefixes.circuit, Materials.UIV, 8),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 2),

                        setStackSize(GoodGeneratorList.Compact_Fusion_Coil_MKII_Finaltype.copy(), 1),

                        setStackSize(GTItemList.Transcendent_Metal_Nanites.copy(), 2),

                        setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 16),
                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 16),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 8),
                        setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 16),
                        setStackSize(IngotList.Creon_Ingot.copy(), 8),
                        setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 2 + 16),
                        setStackSize(IngotList.Ichorium_Ingot.copy(), 8),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 8),
                        setStackSize(IngotList.Iron_Ingot.copy(), 64 * 1026),
                        setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 16),
                        setStackSize(IngotList.Mellion_Ingot.copy(), 8),
                        setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 16),
                        setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64),
                        setStackSize(IngotList.Six_Phased_Copper_Ingot.copy(), 64),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 32),

                        getMaterialInput(OrePrefixes.circuit, Materials.UEV, 64 * 2 + 32),
                        getMaterialInput(OrePrefixes.circuit, Materials.UIV, 8),
                        setStackSize(AmunRaList.Artificial_Gravity_Generator.copy(), 4),
                        setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 64 * 64),
                        setStackSize(GemList.Nether_Star.copy(), 64 * 2 + 16),
                        setStackSize(GTItemList.Neutronium_Heat_Capacitor_1G.copy(), 2),
                        setStackSize(GTItemList.Stable_Boson_Containment_Unit.copy(), 1),
                        setStackSize(HatchList.Laser_Target_Hatch1048576_UIV.copy(), 1),
                        setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 16),
                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 8),
                        setStackSize(IngotList.Creon_Ingot.copy(), 60),
                        setStackSize(IngotList.Draconium_Ingot.copy(), 64 * 2 + 48),
                        setStackSize(IngotList.Hypogen_Ingot.copy(), 64 * 18 + 6),
                        setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64 * 8),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 12 + 32),
                        setStackSize(IngotList.Mellion_Ingot.copy(), 32),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 4 + 32),
                        setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 5 + 4),
                        setStackSize(IngotList.Six_Phased_Copper_Ingot.copy(), 32),
                        setStackSize(IngotList.Superconductor_Base_UIV_Ingot.copy(), 32),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 16),
                        setStackSize(IngotList.Tritanium_Ingot.copy(), 64 * 2),
                        setStackSize(MachineList.Plasma_Generator_UV.copy(), 64),
                        setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 4))
                    .fluidInputs(
                        requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 64 * 2),
                        requiredFluid(FluidList.Lubricant, 1000 * 32),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 5 + 36)),
                        requiredFluid(GasList.Radon, 1000 * (64 * 3 + 24)),
                        requiredFluid(PlasmaList.Lead_Plasma, 144 * 2),
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 24),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 36),
                        requiredFluid(MoltenList.Molten_Proto_Halkonite_Steel_Base, 144 * 20))
                    .itemOutputs(setStackSize(MultiMachineCasingList.Heliocast_Reinforcement_Casing.copy(), 1))
                    .eut(RECIPE_UIV)
                    .duration(45 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Transcendentally Amplified Magnetic Confinement Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#56")
                    .itemInputsUnsafe(
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 16),
                        setStackSize(GemList.Magneto_Resonatic.copy(), 64 * 2 + 16),
                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 4 + 32),
                        setStackSize(IngotList.Creon_Ingot.copy(), 16),

                        setStackSize(IngotList.Hypogen_Ingot.copy(), 1),
                        setStackSize(IngotList.Six_Phased_Copper_Ingot.copy(), 1),
                        setStackSize(GTItemList.Superconductor_Rare_Earth_Composite.copy(), 1),
                        setStackSize(GTItemList.Emitter_UIV.copy(), 2),

                        setStackSize(GTItemList.Tengam_Electromagnet.copy(), 1))
                    .fluidInputs(
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 16),
                        requiredFluid(PlasmaList.Plutonium_241_Plasma, 144 * 16))
                    .itemOutputs(
                        setStackSize(TecTechList.Transcendentally_Amplified_Magnetic_Confinement_Casing.copy(), 8))
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Spatially Transcendent Gravitational Lens Block"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#57")
                    .itemInputsUnsafe(
                        setStackSize(TecTechList.Quantum_Glass.copy(), 8),
                        setStackSize(GTBlockList.Transcendentally_Reinforced_Borosilicate_Glass_Block.copy(), 8),
                        setStackSize(GTPPList.Force_Field_Glass.copy(), 8),
                        setStackSize(GTItemList.Stable_Boson_Containment_Unit.copy(), 4),

                        setStackSize(GTItemList.Radox_Polymer_Lens.copy(), 6),
                        setStackSize(GTItemList.Chromatic_Lens.copy(), 6),
                        setStackSize(GTItemList.Quite_Certain_Crystal_Lens.copy(), 6),
                        setStackSize(GTItemList.Magneto_Resonatic_Lens.copy(), 6),

                        setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 64 * 5 + 8),
                        setStackSize(IngotList.Creon_Ingot.copy(), 6),
                        setStackSize(IngotList.Mellion_Ingot.copy(), 6),
                        setStackSize(IngotList.Six_Phased_Copper_Ingot.copy(), 6),
                        setStackSize(IngotList.Rhugnor_Ingot.copy(), 16),
                        setStackSize(IngotList.Creon_Ingot.copy(), 16),
                        setStackSize(IngotList.Advanced_Nitinol_Ingot.copy(), 64 * 16))
                    .fluidInputs()
                    .itemOutputs(setStackSize(TecTechList.Spatially_Transcendent_Gravitational_Lens_Block, 1))
                    .eut(RECIPE_UIV)
                    .duration(10 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);
            }

            // U.C
            {
                // "Universal Collapser Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#58")
                    .itemInputsUnsafe(
                        setStackSize(MultiMachineCasingList.Celestial_Magnetic_Chassis.copy(), 4),
                        setStackSize(MultiMachineControllerList.Eye_of_Harmony.copy(), 1),
                        setStackSize(TecTechList.Gallifreyan_Stabilisation_Field_Generator.copy(), 32),
                        setStackSize(HatchList.Laser_Source_Hatch1048576_UXV.copy(), 1),

                        setStackSize(GTItemList.Black_Hole_Seed.copy(), 64),
                        setStackSize(GTItemList.Timepiece.copy(), 64),
                        setStackSize(IngotList.Eternity_Ingot.copy(), 64 * 64),
                        setStackSize(GTItemList.Black_Hole_Collapser.copy(), 64),

                        setStackSize(GTItemList.Field_Generator_UXV.copy(), 16),
                        setStackSize(GTItemList.Magmatter_Nanites.copy(), 1),
                        setStackSize(BatteryList.Mega_Ultimate_Battery_Empty.copy(), 1),
                        setStackSize(GTItemList.Graviton_Shard.copy(), 1))
                    .fluidInputs(
                        requiredFluid(FluidList.Condensed_Raw_Stellar_Plasma_Mixture, 1000 * 4000),
                        requiredFluid(FluidList.Tachyon_Rich_Temporal_Fluid, 1000 * 4000),
                        requiredFluid(FluidList.Spatially_Enlarged_Fluid, 1000 * 4000),
                        requiredFluid(FluidList.Lossless_Phonon_Transfer_Medium, 1000 * 1000))
                    .itemOutputs(setStackSize(MultiMachineCasingList.Universal_Collapser_Casing, 1))
                    .eut(RECIPE_UXV)
                    .duration(60 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);
            }
        }

        // "Femtometer-Calibrated Particle Beam Casing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#59")
            .itemInputsUnsafe(
                setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 32),
                setStackSize(IngotList.Infinity_Ingot.copy(), 32),
                setStackSize(IngotList.Tritanium_Ingot.copy(), 32),
                setStackSize(IngotList.Neutronium_Ingot.copy(), 32),

                setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 16),
                setStackSize(IngotList.Infinity_Ingot.copy(), 16),
                setStackSize(IngotList.Tritanium_Ingot.copy(), 16),
                setStackSize(IngotList.Neutronium_Ingot.copy(), 16),

                setStackSize(GTItemList.Field_Generator_UHV.copy(), 1),
                getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),
                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 2),
                setStackSize(IngotList.Infinity_Ingot.copy(), 32),
                setStackSize(IngotList.Tritanium_Ingot.copy(), 32),
                setStackSize(IngotList.Infinity_Ingot.copy(), 48))
            .fluidInputs(
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 32),
                requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Resplendent_Catalyst, 1000 * 4))
            .itemOutputs(setStackSize(MultiMachineCasingList.Femtometer_Calibrated_Particle_Beam_Casing.copy(), 4))
            .eut(RECIPE_UIV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // Fluid Cell Block
        {
            // "Fluid Cell Block T3"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#60")
                .itemInputsUnsafe(
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 2),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T3.copy(), 10),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 8),
                    setStackSize(GTItemList.Electric_Pump_IV.copy(), 8),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 10),

                    setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 24),
                    setStackSize(IngotList.Adamantium_Alloy_Ingot.copy(), 32))
                .fluidInputs(
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 8),
                    requiredFluid(FluidList.Lubricant, 1000 * 8))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Cell_Block_T3, 1))
                .eut(RECIPE_LuV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Fluid Cell Block T4"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#61")
                .itemInputsUnsafe(
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 2),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T4.copy(), 10),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 8),
                    setStackSize(GTItemList.Electric_Pump_LuV.copy(), 8),

                    setStackSize(IngotList.Draconium_Ingot.copy(), 10),
                    setStackSize(IngotList.Mysterious_Crystal_Ingot.copy(), 24),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 32))
                .fluidInputs(
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 16),
                    requiredFluid(FluidList.Lubricant, 1000 * 16))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Cell_Block_T4, 1))
                .eut(RECIPE_ZPM)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Fluid Cell Block T5"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#62")
                .itemInputsUnsafe(
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 2),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T5.copy(), 10),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 8),
                    setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 8),

                    setStackSize(IngotList.Draconium_Ingot.copy(), 10),
                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 24),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64))
                .fluidInputs(
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 16),
                    requiredFluid(FluidList.Lubricant, 1000 * 16))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Cell_Block_T5, 1))
                .eut(RECIPE_UV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Fluid Cell Block T6"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#63")
                .itemInputsUnsafe(
                    setStackSize(IngotList.Infinity_Ingot.copy(), 2),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T6.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 8),
                    setStackSize(GTItemList.Electric_Pump_UV.copy(), 8),

                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 10),
                    setStackSize(GemList.Nether_Star.copy(), 24),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64))
                .fluidInputs(
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 46),
                    requiredFluid(FluidList.Lubricant, 1000 * 32))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Cell_Block_T6, 1))
                .eut(RECIPE_UHV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Fluid Cell Block T7"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#64")
                .itemInputsUnsafe(
                    setStackSize(IngotList.Infinity_Ingot.copy(), 2),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T7.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 8),
                    setStackSize(GTItemList.Electric_Pump_UHV.copy(), 8),
                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 100),

                    setStackSize(GemList.Nether_Star.copy(), 48),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 32),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 32))
                .fluidInputs(
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 46),
                    requiredFluid(FluidList.Lubricant, 1000 * 46))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Cell_Block_T7, 1))
                .eut(RECIPE_UEV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Fluid Cell Block T8"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#65")
                .itemInputsUnsafe(
                    setStackSize(IngotList.Infinity_Ingot.copy(), 2),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T8.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 8),
                    setStackSize(GTItemList.Electric_Pump_UEV.copy(), 8),

                    setStackSize(GemList.Nether_Star.copy(), 64 + 8),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 24),
                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 24),
                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 100),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64))
                .fluidInputs(
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 46),
                    requiredFluid(FluidList.Lubricant, 1000 * 46))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Cell_Block_T8, 1))
                .eut(RECIPE_UIV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Fluid Cell Block T9"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#66")
                .itemInputsUnsafe(
                    setStackSize(IngotList.Infinity_Ingot.copy(), 4),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T9.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 8),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 8),
                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 100),

                    setStackSize(GemList.Nether_Star.copy(), 64 + 8),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 24),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 24),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64))
                .fluidInputs(
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 46),
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 46))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Cell_Block_T9, 1))
                .eut(RECIPE_UMV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Fluid Cell Block T10"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#67")
                .itemInputsUnsafe(
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 4),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T10.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 12),
                    setStackSize(GTItemList.Electric_Pump_UMV.copy(), 8),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 6),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 24),
                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 10),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 10),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 24),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 10))
                .fluidInputs(
                    requiredFluid(FluidList.Super_Coolant, 1000 * 46),
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 46))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Cell_Block_T10, 1))
                .eut(RECIPE_UXV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // "Focus Manipulator"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#68")
            .itemInputsUnsafe(
                setStackSize(IngotList.Aluminium_Ingot.copy(), 2),
                getMaterialInput(OrePrefixes.circuit, Materials.IV, 4),
                setStackSize(GTItemList.Robot_Arm_LuV.copy(), 4),
                setStackSize(GTItemList.Conveyor_Module_LuV.copy(), 2),
                setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 64),
                setStackSize(IngotList.Gold_Ingot.copy(), 16),

                setStackSize(IngotList.Gold_Ingot.copy(), 4),
                setStackSize(IngotList.Tungsten_Ingot.copy(), 1))
            .fluidInputs(requiredFluid(GasList.Argon, 1000))
            .itemOutputs(setStackSize(GTNHLanthanidesList.Focus_Manipulator, 1))
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // Forge of the Gods
        {
            // "Singularity Reinforced Stellar Shielding Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#69")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(TecTechList.Singularity_Reinforced_Stellar_Shielding_Casing.copy(), 0),

                    setStackSize(IngotList.Abyssal_Alloy_Ingot.copy(), 8),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 256),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 * 32),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Creon_Ingot.copy(), 20),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 2 + 16),
                    setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 8),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Iron_Ingot.copy(), 64 * 1026),
                    setStackSize(IngotList.Mellion_Ingot.copy(), 20),
                    setStackSize(IngotList.Netherite_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 32),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 16),
                    setStackSize(IngotList.Quantum_Ingot.copy(), 16),
                    setStackSize(IngotList.Six_Phased_Copper_Ingot.copy(), 8),
                    setStackSize(IngotList.Superconductor_Base_UEV_Ingot.copy(), 8),
                    setStackSize(IngotList.Superconductor_Base_UIV_Ingot.copy(), 8),
                    setStackSize(IngotList.Titansteel_Ingot.copy(), 8),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 2))
                .fluidInputs(requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 2)))
                .itemOutputs(setStackSize(TecTechList.Singularity_Reinforced_Stellar_Shielding_Casing.copy(), 4))
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Remote Graviton Flow Modulator"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#70")
                .itemInputsUnsafe(
                    setStackSize(TecTechList.Transcendentally_Amplified_Magnetic_Confinement_Casing.copy(), 2),
                    setStackSize(GoodGeneratorList.Ultimate_Field_Restriction_Coil.copy(), 1),
                    setStackSize(IngotList.Creon_Ingot.copy(), 16),
                    setStackSize(IngotList.Mellion_Ingot.copy(), 8),

                    setStackSize(GTPPList.Graviton_Anomaly.copy(), 2),
                    setStackSize(GTPPList.Quantum_Anomaly.copy(), 4),
                    setStackSize(GTItemList.Emitter_UIV.copy(), 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 16),

                    setStackSize(GTItemList.Silver_Nanites.copy(), 2),
                    setStackSize(IngotList.Superconductor_Base_UIV_Ingot.copy(), 32),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 32))
                .fluidInputs(requiredFluid(FluidList.Mutated_Living_Solder, 144 * 32))
                .itemOutputs(setStackSize(TecTechList.Remote_Graviton_Flow_Modulator.copy(), 2))
                .eut(RECIPE_UIV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Celestial Matter Guidance Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#71")
                .itemInputsUnsafe(
                    setStackSize(TecTechList.Boundless_Gravitationally_Severed_Structure_Casing.copy(), 1),
                    setStackSize(BatteryList.Ultimate_Battery_Empty.copy(), 1),
                    setStackSize(GTPPList.Cosmic_Fabric_Manipulator.copy(), 1),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 2),

                    setStackSize(GTItemList.Emitter_UIV.copy(), 3),
                    setStackSize(IngotList.Creon_Ingot.copy(), 6),
                    setStackSize(IngotList.Creon_Ingot.copy(), 32),
                    setStackSize(IngotList.Mellion_Ingot.copy(), 8))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 16),
                    requiredFluid(PlasmaList.Thorium_Plasma, 144 * 2))
                .itemOutputs(setStackSize(TecTechList.Celestial_Matter_Guidance_Casing, 1))
                .eut(RECIPE_UIV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Boundless Gravitationally Severed Structure Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#72")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(TecTechList.Boundless_Gravitationally_Severed_Structure_Casing.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 32),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 8),
                    setStackSize(AmunRaList.Artificial_Gravity_Generator.copy(), 4),
                    setStackSize(GemList.Nether_Star.copy(), 64 * 2 + 16),
                    setStackSize(GTItemList.Stable_Boson_Containment_Unit.copy(), 1),

                    setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 16),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Creon_Ingot.copy(), 6),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 64 * 2 + 48),
                    setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 4 + 32),
                    setStackSize(IngotList.Mellion_Ingot.copy(), 32),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 4 + 32),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 5 + 4),
                    setStackSize(IngotList.Six_Phased_Copper_Ingot.copy(), 32),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 16),
                    setStackSize(IngotList.Tritanium_Ingot.copy(), 64 * 2))
                .fluidInputs(
                    requiredFluid(FluidList.Lubricant, 1000 * 32),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 5 + 20)),
                    requiredFluid(GasList.Radon, 1000 * (64 * 3 + 24)),
                    requiredFluid(PlasmaList.Lead_Plasma, 144 * 2))
                .itemOutputs(setStackSize(TecTechList.Boundless_Gravitationally_Severed_Structure_Casing.copy(), 1))
                .eut(RECIPE_UIV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Stellar Energy Siphon Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#73")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(TecTechList.Stellar_Energy_Siphon_Casing.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 64 * 2 + 32),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 8),
                    setStackSize(AmunRaList.Artificial_Gravity_Generator.copy(), 4),
                    setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 64 * 64),
                    setStackSize(GemList.Nether_Star.copy(), 64 * 2 + 16),
                    setStackSize(GTItemList.Neutronium_Heat_Capacitor_1G.copy(), 2),
                    setStackSize(GTItemList.Stable_Boson_Containment_Unit.copy(), 1),
                    setStackSize(HatchList.Laser_Target_Hatch1048576_UIV.copy(), 1),
                    setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 16),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Creon_Ingot.copy(), 60),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 64 * 2 + 48),
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 64 * 18 + 6),
                    setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 12 + 32),
                    setStackSize(IngotList.Mellion_Ingot.copy(), 32),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 4 + 32),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 5 + 4),
                    setStackSize(IngotList.Six_Phased_Copper_Ingot.copy(), 32),
                    setStackSize(IngotList.Superconductor_Base_UIV_Ingot.copy(), 32),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 16),
                    setStackSize(IngotList.Tritanium_Ingot.copy(), 64 * 2),
                    setStackSize(MachineList.Plasma_Generator_UV.copy(), 64),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 4))
                .fluidInputs(
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 64 * 2),
                    requiredFluid(FluidList.Lubricant, 1000 * 32),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 5 + 36)),
                    requiredFluid(GasList.Radon, 1000 * (64 * 3 + 24)),
                    requiredFluid(PlasmaList.Lead_Plasma, 144 * 2))
                .itemOutputs(setStackSize(TecTechList.Stellar_Energy_Siphon_Casing.copy(), 1))
                .eut(RECIPE_UIV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Medial Graviton Flow Modulator"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#74")
                .itemInputsUnsafe(
                    setStackSize(TecTechList.Transcendentally_Amplified_Magnetic_Confinement_Casing.copy(), 1),
                    setStackSize(GoodGeneratorList.Temporal_Field_Restriction_Coil.copy(), 1),
                    setStackSize(IngotList.Creon_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Mellion_Ingot.copy(), 16),

                    setStackSize(GTPPList.Graviton_Anomaly.copy(), 4),
                    setStackSize(GTPPList.Quantum_Anomaly.copy(), 8),
                    setStackSize(GTItemList.Emitter_UMV.copy(), 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 8),

                    setStackSize(GTItemList.Silver_Nanites.copy(), 2),
                    setStackSize(GTItemList.Gold_Nanites.copy(), 2),
                    setStackSize(IngotList.Superconductor_Base_UMV_Ingot.copy(), 64),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 64))
                .fluidInputs(requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64))
                .itemOutputs(setStackSize(TecTechList.Medial_Graviton_Flow_Modulator, 1))
                .eut(RECIPE_UMV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Central Graviton Flow Modulator"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#75")
                .itemInputsUnsafe(
                    setStackSize(TecTechList.Transcendentally_Amplified_Magnetic_Confinement_Casing.copy(), 1),
                    setStackSize(GoodGeneratorList.Temporal_Field_Restriction_Coil.copy(), 4),
                    setStackSize(IngotList.Creon_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Mellion_Ingot.copy(), 64 * 4),

                    setStackSize(GTPPList.SpaceTime_Continuum_Ripper.copy(), 8),
                    setStackSize(GTPPList.Graviton_Anomaly.copy(), 8),
                    setStackSize(GTPPList.Quantum_Anomaly.copy(), 8),
                    setStackSize(GTItemList.Emitter_UXV.copy(), 4),

                    getMaterialInput(OrePrefixes.circuit, Materials.MAX, 8),
                    setStackSize(GTItemList.Silver_Nanites.copy(), 8),
                    setStackSize(GTItemList.Gold_Nanites.copy(), 8),
                    setStackSize(GTItemList.Six_Phased_Copper_Nanites.copy(), 8),

                    setStackSize(GTItemList.Universium_Nanites.copy(), 8),
                    setStackSize(IngotList.Superconductor_Base_UMV_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.White_Dwarf_Matter_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Eternity_Ingot.copy(), 64 * 4))
                .fluidInputs(requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 4))
                .itemOutputs(setStackSize(TecTechList.Medial_Graviton_Flow_Modulator, 1))
                .eut(RECIPE_UXV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Harmonic Phonon Transmission Conduit"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#76")
                .itemInputsUnsafe(
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 2),
                    setStackSize(IngotList.Creon_Ingot.copy(), 12),
                    setStackSize(KekzTechList.TFFT_Storage_Field_Block_TierIX.copy(), 1),
                    setStackSize(GTItemList.Raw_Tesseract.copy(), 8),

                    setStackSize(GTItemList.Relativistic_Heat_Capacitor.copy(), 4),
                    setStackSize(GTItemList.Thermal_Superconductor.copy(), 6),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 4),
                    setStackSize(IngotList.Six_Phased_Copper_Ingot.copy(), 3))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64),
                    requiredFluid(FluidList.Lossless_Phonon_Transfer_Medium, 1000),
                    requiredFluid(PlasmaList.Plutonium_241_Plasma, 144 * 16))
                .itemOutputs(setStackSize(TecTechList.Harmonic_Phonon_Transmission_Conduit, 1))
                .eut(RECIPE_UIV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // Fusion Computer
        {
            // "Advanced Fusion Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#77")
                .itemInputsUnsafe(
                    setStackSize(BatteryList.Lapotronic_Energy_Orb_Cluster_Empty.copy(), 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 8),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 8),

                    setStackSize(GTItemList.Emitter_UHV.copy(), 1),
                    setStackSize(GTItemList.Sensor_UHV.copy(), 1),
                    setStackSize(MultiMachineCasingList.Fusion_Coil_Block.copy(), 1),
                    setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 16),
                    setStackSize(IngotList.Octiron_Ingot.copy(), 16),
                    setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 16))
                .fluidInputs(requiredFluid(FluidList.UU_Matter, 1000 * 8))
                .itemOutputs(setStackSize(MultiMachineCasingList.Advanced_Fusion_Coil, 1))
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Advanced Fusion Coil II"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#78")
                .itemInputsUnsafe(
                    setStackSize(BatteryList.Energy_Module_Empty.copy(), 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 8),
                    setStackSize(IngotList.Rhugnor_Ingot.copy(), 8),

                    setStackSize(GTItemList.Emitter_UEV.copy(), 1),
                    setStackSize(GTItemList.Sensor_UEV.copy(), 1),
                    setStackSize(GoodGeneratorList.Advanced_Compact_Fusion_Coil.copy(), 1),
                    setStackSize(IngotList.Neptunium_Ingot.copy(), 16),
                    setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 16),
                    setStackSize(IngotList.Abyssal_Alloy_Ingot.copy(), 16),
                    setStackSize(IngotList.Dragonblood_Ingot.copy(), 16))
                .fluidInputs()
                .itemOutputs(setStackSize(MultiMachineCasingList.Advanced_Fusion_Coil_II, 1))
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Fusion Machine Casing MK III"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#79")
                .itemInputsUnsafe(
                    getMaterialInput(OrePrefixes.circuit, Materials.EV, 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.IV, 8),
                    setStackSize(IngotList.Netherite_Ingot.copy(), 18),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 8),

                    setStackSize(GTItemList.Electric_Motor_UHV.copy(), 2),
                    setStackSize(GTItemList.Electric_Piston_UHV.copy(), 1),
                    setStackSize(MultiMachineCasingList.Fusion_Machine_Casing_MK_II.copy(), 1),
                    setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 4),
                    setStackSize(IngotList.Octiron_Ingot.copy(), 4),
                    setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 4))
                .fluidInputs(requiredFluid(FluidList.UU_Matter, 1000))
                .itemOutputs(setStackSize(MultiMachineCasingList.Fusion_Machine_Casing_MK_III, 1))
                .eut(RECIPE_UHV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Fusion Machine Casing MK IV"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#80")
                .itemInputsUnsafe(
                    getMaterialInput(OrePrefixes.circuit, Materials.IV, 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 8),
                    setStackSize(IngotList.Netherite_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 8),

                    setStackSize(GTItemList.Electric_Motor_UEV.copy(), 2),
                    setStackSize(GTItemList.Electric_Piston_UEV.copy(), 1),
                    setStackSize(MultiMachineCasingList.Fusion_Machine_Casing_MK_III.copy(), 1),
                    setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 8),
                    setStackSize(IngotList.Abyssal_Alloy_Ingot.copy(), 8),
                    setStackSize(IngotList.Dragonblood_Ingot.copy(), 8))
                .fluidInputs(requiredFluid(FluidList.Fermium, 144 * 8))
                .itemOutputs(setStackSize(MultiMachineCasingList.Fusion_Machine_Casing_MK_IV, 1))
                .eut(RECIPE_UEV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // "Hollow Casing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#81")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(TecTechList.Hollow_Casing.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 1),
                setStackSize(IngotList.Cobalt_Ingot.copy(), 2),
                setStackSize(IngotList.Copper_Ingot.copy(), 2),
                setStackSize(IngotList.Europium_Ingot.copy(), 18),
                setStackSize(IngotList.Iridium_Ingot.copy(), 14),
                setStackSize(IngotList.Lead_Ingot.copy(), 16),
                setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 2),
                setStackSize(IngotList.Osmiridium_Ingot.copy(), 54),
                setStackSize(IngotList.Osmium_Ingot.copy(), 18),
                setStackSize(IngotList.Plutonium_239_Ingot.copy(), 16),
                setStackSize(IngotList.Quantium_Ingot.copy(), 2),
                setStackSize(IngotList.Trinium_Ingot.copy(), 12),
                setStackSize(IngotList.Tungstensteel_Ingot.copy(), 13),
                setStackSize(IngotList.Uranium_238_Ingot.copy(), 16))
            .fluidInputs(requiredFluid(FluidList.IC2_Coolant, 1000 * 2), requiredFluid(GasList.Argon, 1000))
            .itemOutputs(setStackSize(TecTechList.Hollow_Casing.copy(), 2))
            .eut(RECIPE_UV)
            .duration(10 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Ion Thruster Base"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#82")
            .itemInputsUnsafe(
                setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 16),
                setStackSize(GTBlockList.Battery_Buffer16_UHV.copy(), 2),
                setStackSize(GTItemList.Emitter_UHV.copy(), 4),
                setStackSize(GTItemList.Field_Generator_UHV.copy(), 2),

                setStackSize(IngotList.Infinity_Ingot.copy(), 50),
                setStackSize(AmunRaList.Nanite_Cluster.copy(), 1))
            .fluidInputs(
                requiredFluid(FluidList.Super_Coolant, 1000 * 64),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64))
            .itemOutputs(setStackSize(AmunRaList.Ion_Thruster_Base, 1))
            .eut(RECIPE_UEV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Ion Thruster Jet"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#83")
            .itemInputsUnsafe(
                setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 64),
                setStackSize(GoodGeneratorList.Advanced_Field_Restriction_Coil.copy(), 8),
                setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 2),
                setStackSize(GTItemList.Emitter_UHV.copy(), 16),

                setStackSize(IngotList.Infinity_Ingot.copy(), 50),
                setStackSize(GTItemList.Field_Generator_UHV.copy(), 8),
                setStackSize(AmunRaList.Nanite_Cluster.copy(), 4))
            .fluidInputs(
                requiredFluid(FluidList.Super_Coolant, 1000 * 64),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64))
            .itemOutputs(setStackSize(AmunRaList.Ion_Thruster_Base, 1))
            .eut(RECIPE_UEV)
            .duration(360 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // Lapotronic Capacitor
        {
            // "Lapotronic Capacitor (LuV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#84")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(KekzTechList.Lapotronic_Capacitor_LuV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),
                    setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 8),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 8),
                    setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 8),
                    setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 8),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 + 8),
                    setStackSize(CircuitList.High_Power_IC_Chip.copy(), 64),
                    setStackSize(CircuitList.Multilayer_Fiber_Reinforced_Circuit_Board.copy(), 1),

                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 5),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 32),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 11),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 8))
                .itemOutputs(setStackSize(KekzTechList.Lapotronic_Capacitor_LuV.copy(), 1))
                .eut(RECIPE_ZPM)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Lapotronic Capacitor (ZPM)" - 1
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#85")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(KekzTechList.Lapotronic_Capacitor_ZPM.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 12),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 64),
                    setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 64),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64 + 8),
                    setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 64),
                    setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 64),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 8),
                    setStackSize(CircuitList.High_Power_IC_Chip.copy(), 64 * 8),
                    setStackSize(CircuitList.Multilayer_Fiber_Reinforced_Circuit_Board.copy(), 8),

                    setStackSize(GemList.Nether_Star.copy(), 12),

                    setStackSize(IngotList.Europium_Ingot.copy(), 16),
                    setStackSize(IngotList.Gallium_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.HSSS_Ingot.copy(), 48),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 44),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 8),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 2 + 11),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 16),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 64),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 64 * 3 + 32),
                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 48))
                .fluidInputs(
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 16),
                    requiredFluid(FluidList.Lubricant, 1000 * 2),
                    requiredFluid(GasList.Radon, 1000 * 17))
                .itemOutputs(setStackSize(KekzTechList.Lapotronic_Capacitor_ZPM.copy(), 1))
                .eut(RECIPE_ZPM)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Lapotronic Capacitor (UV)" - 1
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#88")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(KekzTechList.Lapotronic_Capacitor_UV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 12),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 64 * 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 64 * 4),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64 + 16),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 64 * 16),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 16),
                    setStackSize(CircuitList.HPIC_Wafer.copy(), 64 * 2),
                    setStackSize(GemList.Nether_Star.copy(), 64 + 52),
                    setStackSize(IngotList.Americium_Ingot.copy(), 16),
                    setStackSize(IngotList.Europium_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.Gallium_Ingot.copy(), 64 * 48),
                    setStackSize(IngotList.HSSS_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 10 + 20),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 + 40),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 11),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 32),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 64 * 28),
                    setStackSize(IngotList.Trinium_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 64 * 6))
                .fluidInputs(
                    requiredFluid(FluidList.IC2_Coolant, 1000 * (64 * 2 + 16)),
                    requiredFluid(FluidList.Lubricant, 1000 * 22),
                    requiredFluid(GasList.Radon, 1000 * (64 * 2 + 33)))
                .itemOutputs(setStackSize(KekzTechList.Lapotronic_Capacitor_UV.copy(), 1))
                .eut(RECIPE_ZPM)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Ultimate Capacitor (UHV)" - 1
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#91")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(KekzTechList.Ultimate_Capacitor_UHV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 20),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 64 * 2 + 32),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 64 * 4),

                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64 * 5),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 32),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 64),
                    setStackSize(CircuitList.HPIC_Wafer.copy(), 64 * 16),
                    setStackSize(CircuitList.UHPIC_Wafer.copy(), 64 * 2),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 6 + 48 + 32),

                    setStackSize(IngotList.Americium_Ingot.copy(), 64 * 58),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 5 + 32),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 4 + 59),
                    setStackSize(IngotList.Europium_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 16),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 37 + 40),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 * 3),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 22),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 79 + 24),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 52 + 32),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 6))
                .fluidInputs(
                    requiredFluid(FluidList.IC2_Coolant, 1000 * (64 * 2 + 32)),
                    requiredFluid(FluidList.Lubricant, 1000 * (64 * 11)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 32),
                    requiredFluid(GasList.Radon, 1000 * (64 * 8 + 28)))
                .itemOutputs(setStackSize(KekzTechList.Ultimate_Capacitor_UHV.copy(), 1))
                .eut(RECIPE_UHV)
                .duration(200 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Extremely Ultimate Capacitor (UEV)" - 1
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#94")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(KekzTechList.Extremely_Ultimate_Capacitor_UEV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 20),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 64 * 2 + 32),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 64 * 4),

                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64 * 8),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 64 * 5),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 128),
                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),
                    setStackSize(CircuitList.PPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.UHPIC_Wafer.copy(), 64 * 16),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 13 + 32),

                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 22),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 35),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 64 * 5 + 32),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 64),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 40 + 32),
                    setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64 * 18),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 9 + 11),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 50 + 32),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 123),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 12 + 8),
                    setStackSize(IngotList.Tritanium_Ingot.copy(), 64 * 4),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 4),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 16))
                .fluidInputs(
                    requiredFluid(FluidList.IC2_Coolant, 1000 * (64 * 4)),
                    requiredFluid(FluidList.Lubricant, 1000 * (64 * 5)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 15 + 8)),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 64),
                    requiredFluid(GasList.Radon, 1000 * (64 * 18)))
                .itemOutputs(setStackSize(KekzTechList.Extremely_Ultimate_Capacitor_UEV.copy(), 1))
                .eut(RECIPE_UHV)
                .duration(640 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Insanely Ultimate Capacitor (UIV)" - 1
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#97")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(KekzTechList.Insanely_Ultimate_Capacitor_UIV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 20),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 64 * 2 + 32),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 64 * 4),

                    setStackSize(CircuitList.ASoC_Wafer.copy(), 64 * 8),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 256),
                    setStackSize(CircuitList.Living_Crystal_Chip.copy(), 64),
                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64 * 9),
                    setStackSize(CircuitList.Optical_SMD_Inductor.copy(), 32),
                    setStackSize(CircuitList.PPIC_Wafer.copy(), 64 * 16),
                    setStackSize(CircuitList.QPIC_Wafer.copy(), 64 * 2),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 55),

                    setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 12),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 * 4 + 16),
                    setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 64),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 64 * 22),
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64 * 80),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 38 + 16),
                    setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 16),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 10),
                    setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 20),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 58 + 16),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 8 + 43),
                    setStackSize(IngotList.Tritanium_Ingot.copy(), 64 * 16),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 32),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 8))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 64),
                    requiredFluid(FluidList.Lubricant, 1000 * (64 * 4)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 60 + 40)),
                    requiredFluid(FluidList.Super_Coolant, 1000 * (64 * 10)),
                    requiredFluid(GasList.Radon, 1000 * (64 * 27)))
                .itemOutputs(setStackSize(KekzTechList.Insanely_Ultimate_Capacitor_UIV.copy(), 1))
                .eut(RECIPE_UIV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Mega Ultimate Capacitor (UMV)" - 1
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#100")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(KekzTechList.Mega_Ultimate_Capacitor_UMV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 20),
                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 64 * 2 + 32),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 64 * 4),

                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 512),
                    setStackSize(CircuitList.FPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Living_Bio_Chip.copy(), 64),
                    setStackSize(CircuitList.Living_Crystal_Chip.copy(), 64 * 8),
                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64 * 9),
                    setStackSize(CircuitList.Optical_SMD_Inductor.copy(), 64 * 5),
                    setStackSize(CircuitList.QPIC_Wafer.copy(), 64 * 16),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 186),

                    setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 64 * 16),
                    setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 24),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 * 35 + 16),
                    setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 64 * 16),
                    setStackSize(IngotList.Dragonblood_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 64 * 38 + 16),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 19 + 32),
                    setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 64 * 16),
                    setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 64 * 16),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 80),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 21 + 32),
                    setStackSize(IngotList.Quantum_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 8 + 43),
                    setStackSize(IngotList.Titansteel_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 34),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 64),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 64 * 16))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * (64 * 5)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 70 + 40)),
                    requiredFluid(FluidList.Super_Coolant, 1000 * (64 * 20)))
                .itemOutputs(setStackSize(KekzTechList.Mega_Ultimate_Capacitor_UMV.copy(), 1))
                .eut(RECIPE_UIV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // "Laser Vacuum Mirror"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#103")
            .itemInputsUnsafe(
                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 1),
                setStackSize(IngotList.Iridium_Ingot.copy(), 14),
                setStackSize(IngotList.Cobalt_Ingot.copy(), 2),
                setStackSize(IngotList.Copper_Ingot.copy(), 2),
                setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 1),
                setStackSize(IngotList.Tungstensteel_Ingot.copy(), 4),
                setStackSize(GTBlockList.Laser_Vacuum_Pipe.copy(), 4),
                setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 9),
                setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 2),

                getMaterialInput(OrePrefixes.circuit, Materials.UHV, 1))
            .fluidInputs(requiredFluid(FluidList.pH_Neutralized_Water_Grade_4, 1000 * 4))
            .itemOutputs(setStackSize(GTBlockList.Laser_Vacuum_Mirror, 1))
            .eut(RECIPE_UHV)
            .duration(10 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Magnetic Anchor Casing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#104")
            .itemInputsUnsafe(
                setStackSize(GoodGeneratorList.Magnetic_Flux_Casing.copy(), 16),
                setStackSize(MultiMachineCasingList.Transcendentally_Amplified_Magnetic_Confinement_Casing.copy(), 16),
                setStackSize(GTItemList.Field_Generator_UMV.copy(), 1),
                setStackSize(IngotList.Magmatter_Ingot.copy(), 64),
                setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 64),
                setStackSize(IngotList.Shirabon_Ingot.copy(), 64 * 9),
                setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot, 1))
            .fluidInputs(
                requiredFluid(FluidList.Spatially_Enlarged_Fluid, 144 * 64),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64))
            .itemOutputs(setStackSize(MultiMachineCasingList.Magnetic_Anchor_Casing.copy(), 4))
            .eut(RECIPE_UMV)
            .duration(20 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Molecular Coil"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#105")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(TecTechList.Molecular_Coil.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 1),
                setStackSize(IngotList.Cobalt_Ingot.copy(), 1),
                setStackSize(IngotList.Copper_Ingot.copy(), 1),
                setStackSize(IngotList.Europium_Ingot.copy(), 33),
                setStackSize(IngotList.Iridium_Ingot.copy(), 7),
                setStackSize(IngotList.Lead_Ingot.copy(), 8),
                setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 1),
                setStackSize(IngotList.Osmiridium_Ingot.copy(), 27),
                setStackSize(IngotList.Osmium_Ingot.copy(), 9),
                setStackSize(IngotList.Plutonium_239_Ingot.copy(), 8),
                setStackSize(IngotList.Quantium_Ingot.copy(), 1),
                setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 13),
                setStackSize(IngotList.Trinium_Ingot.copy(), 14),
                setStackSize(IngotList.Tungstensteel_Ingot.copy(), 6),
                setStackSize(IngotList.Uranium_238_Ingot.copy(), 8),
                setStackSize(MultiMachineCasingList.Fusion_Coil_Block.copy(), 2),
                setStackSize(MultiMachineCasingList.Naquadah_Alloy_Coil_Block.copy(), 2))
            .fluidInputs(requiredFluid(FluidList.IC2_Coolant, 1000 * 3), requiredFluid(GasList.Argon, 500))
            .itemOutputs(setStackSize(TecTechList.Molecular_Coil.copy(), 4))
            .eut(RECIPE_UV)
            .duration(25 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // Nanochip Assembly Complex
        {
            // "Nanochip Computational Matrix Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#106")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineCasingList.Nanochip_Mesh_Interface_Casing.copy(), 4),
                    setStackSize(HatchList.Computer_Rack.copy(), 1),
                    setStackSize(Appliedenergistics2List.ME_Storage_Component_16384k.copy(), 1),
                    setStackSize(AE2FluidCraftingList.ME_Fluid_Storage_Component_16384k.copy(), 1),

                    setStackSize(OpenComputersList.Server_Tier4.copy(), 1),
                    setStackSize(CircuitList.Optically_Perfected_CPU.copy(), 2),
                    setStackSize(CircuitList.Optically_Compatible_Memory.copy(), 2),
                    setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 16),
                    setStackSize(IngotList.Purified_Tengam_Ingot.copy(), 16))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 16),
                    requiredFluid(FluidList.Xenoxene, 144 * 16))
                .itemOutputs(setStackSize(MultiMachineCasingList.Nanochip_Computational_Matrix_Casing.copy(), 4))
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Nanochip Firewall Projection Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#107")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineCasingList.Nanochip_Reinforcement_Casing.copy(), 1),
                    setStackSize(MachineList.Monster_Repellator_UV.copy(), 4),
                    setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 8),

                    setStackSize(GTItemList.Emitter_UEV.copy(), 2),
                    setStackSize(GTItemList.Sensor_UEV.copy(), 2),
                    setStackSize(SingularityList.Nether_Star_Singularity.copy(), 1),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 1),
                    setStackSize(IngotList.Superconductor_Base_UEV_Ingot.copy(), 16),
                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 4))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 2),
                    requiredFluid(GasList.Oganesson, 1000 * 16))
                .itemOutputs(setStackSize(MultiMachineCasingList.Nanochip_Firewall_Projection_Casing, 1))
                .eut(RECIPE_UEV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // "Naquadah Fuel Refinery"
        {
            // "Advanced Field Restriction Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#108")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GoodGeneratorList.Advanced_Field_Restriction_Coil.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 9),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 32),

                    setStackSize(CircuitList.PPIC_Wafer.copy(), 48),

                    setStackSize(GemList.Nether_Star.copy(), 64 + 8),

                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 64),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 3 + 48),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 6 + 58),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 9 + 60),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 9 + 60),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 22 + 32),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64),
                    setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 64 * 4))
                .fluidInputs(
                    requiredFluid(FluidList.Lubricant, 1000 * (64 * 3 + 32)),
                    requiredFluid(GasList.Radon, 1000 * (64 + 27)))
                .itemOutputs(setStackSize(GoodGeneratorList.Advanced_Field_Restriction_Coil.copy(), 1))
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Field Restriction Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#109")
                .itemInputsUnsafe(
                    setStackSize(IngotList.Osmium_Ingot.copy(), 2),
                    setStackSize(GTItemList.Field_Generator_UV.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UV.copy(), 8),
                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 64 * 2),

                    setStackSize(IngotList.Americium_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 48),
                    setStackSize(CircuitList.PPIC_Wafer.copy(), 32),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 8))
                .fluidInputs(requiredFluid(GasList.Krypton, 1000), requiredFluid(FluidList.Lubricant, 1000 * 128))
                .itemOutputs(setStackSize(GoodGeneratorList.Field_Restriction_Coil, 1))
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Naquadah Fuel Refinery Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#110")
                .itemInputsUnsafe(
                    setStackSize(IngotList.Thulium_Ingot.copy(), 2),
                    setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 6),
                    setStackSize(GTItemList.Field_Generator_IV.copy(), 2),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 8),

                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 8),
                    setStackSize(IngotList.Manyullyn_Ingot.copy(), 8),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 8),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 16),
                    setStackSize(GemList.Orundum.copy(), 4))
                .fluidInputs()
                .itemOutputs(setStackSize(GTNHLanthanidesList.Focus_Manipulator, 1))
                .eut(RECIPE_ZPM)
                .duration(25 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Temporal Field Restriction Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#111")
                .itemInputsUnsafe(
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 2),
                    setStackSize(GTItemList.Field_Generator_UIV.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 8),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 8),

                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 48),
                    setStackSize(CircuitList.PPIC_Wafer.copy(), 64),
                    setStackSize(IngotList.Metastable_Oganesson_Ingot, 7),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64),
                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 1))
                .fluidInputs(requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 64))
                .itemOutputs(setStackSize(GoodGeneratorList.Temporal_Field_Restriction_Coil, 1))
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Ultimate Field Restriction Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#112")
                .itemInputsUnsafe(
                    setStackSize(IngotList.Infinity_Ingot.copy(), 2),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UEV.copy(), 8),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 8),

                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 48),
                    setStackSize(CircuitList.PPIC_Wafer.copy(), 64),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 1))
                .fluidInputs(
                    requiredFluid(GasList.Oganesson, 1000),
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 64))
                .itemOutputs(setStackSize(GoodGeneratorList.Ultimate_Field_Restriction_Coil, 1))
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // "Particle Beam Guidance Pipe Casing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#113")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(MultiMachineCasingList.Particle_Beam_Guidance_Pipe_Casing.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 2),
                getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),

                setStackSize(GemList.Nether_Star.copy(), 12),

                setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 8),
                setStackSize(IngotList.Bedrockium_Ingot.copy(), 32),
                setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 + 48),
                setStackSize(IngotList.Draconium_Ingot.copy(), 24),
                setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 4 + 34),
                setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 32),

                setStackSize(IngotList.Naquadria_Ingot.copy(), 32),
                setStackSize(IngotList.Quantium_Ingot.copy(), 39),
                setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 16),
                setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 16),
                setStackSize(IngotList.Tritanium_Ingot.copy(), 32))
            .fluidInputs(
                requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Resplendent_Catalyst, 1000 * 4),
                requiredFluid(FluidList.Lubricant, 1000 * 8),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 + 4)))
            .itemOutputs(setStackSize(MultiMachineCasingList.Particle_Beam_Guidance_Pipe_Casing.copy(), 4))
            .eut(RECIPE_UIV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Precision Field Sync Casing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#114")
            .itemInputsUnsafe(
                setStackSize(GoodGeneratorList.Gravity_Stabilization_Casing.copy(), 16),
                setStackSize(GoodGeneratorList.Temporal_Field_Restriction_Coil.copy(), 2),
                setStackSize(TecTechList.Crude_Stabilisation_Field_Generator.copy(), 1),
                setStackSize(IngotList.White_Dwarf_Matter_Ingot.copy(), 2),

                setStackSize(GTItemList.Field_Generator_UMV.copy(), 1),
                setStackSize(IngotList.Magmatter_Ingot.copy(), 8),
                setStackSize(IngotList.Superconductor_Base_UMV_Ingot.copy(), 8),
                setStackSize(IngotList.Shirabon_Ingot.copy(), 8),

                setStackSize(IngotList.Flerovium_Ingot.copy(), 64 * 16),
                setStackSize(IngotList.Eternity_Ingot.copy(), 64))
            .fluidInputs(
                requiredFluid(PlasmaList.Chromatic_Glass_Plasma, 144 * 64),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64))
            .itemOutputs(setStackSize(MultiMachineCasingList.Precision_Field_Sync_Casing.copy(), 8))
            .eut(RECIPE_UMV)
            .duration(10 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Protomatter Activation Coil"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#115")
            .itemInputsUnsafe(
                setStackSize(GoodGeneratorList.Ultimate_Field_Restriction_Coil.copy(), 1),
                setStackSize(GTItemList.Electric_Pump_UIV.copy(), 2),
                setStackSize(WireList.Superconductor_UIV_Wire_16x.copy(), 8),
                setStackSize(IngotList.Infinity_Ingot.copy(), 64),
                setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 20),
                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 1),
                setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 16),
                setStackSize(GTItemList.Field_Generator_UEV.copy(), 4))
            .fluidInputs(
                requiredFluid(FluidList.Protomatter, 100),
                requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000))
            .itemOutputs(setStackSize(GoodGeneratorList.Protomatter_Activation_Coil.copy(), 4))
            .eut(RECIPE_UIV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Primary Exo-Foundry Casing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#116")
            .itemInputsUnsafe(
                setStackSize(IngotList.Netherite_Ingot.copy(), 2),
                setStackSize(CircuitList.Optically_Perfected_CPU.copy(), 8),
                setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 8),
                setStackSize(IngotList.Infinity_Ingot.copy(), 1),

                setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 8),
                setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 2))
            .fluidInputs(requiredFluid(FluidList.Mutated_Living_Solder, 144 * 4), requiredFluid(GasList.Oganesson, 500))
            .itemOutputs(setStackSize(MultiMachineCasingList.Primary_Exo_Foundry_Casing, 1))
            .eut(RECIPE_UEV)
            .duration(15 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Quantum Force Transformer"
        {
            // "Neutron Pulse Manipulator"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#117")
                .itemInputsUnsafe(
                    setStackSize(GTPPList.Force_Field_Glass.copy(), 1),
                    setStackSize(GTItemList.Carbon_Nanites.copy(), 4),
                    setStackSize(GTItemList.Emitter_UV.copy(), 4),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 2),
                    setStackSize(IngotList.Thulium_Ingot.copy(), 10),

                    setStackSize(GTPPList.Quantum_Anomaly.copy(), 1),
                    setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 2))
                .fluidInputs(
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Crude_Catalyst, 1000 * 5),
                    requiredFluid(PlasmaList.Neptunium_Plasma, 500),
                    requiredFluid(PlasmaList.Fermium_Plasma, 500))
                .itemOutputs(setStackSize(GTPPList.Neutron_Pulse_Manipulator, 1))
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Neutron Shielding Core"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#118")
                .itemInputsUnsafe(
                    setStackSize(IngotList.Quantum_Ingot.copy(), 2),
                    setStackSize(IngotList.Precious_Metals_Alloy_Ingot.copy(), 36),
                    setStackSize(IngotList.Netherite_Ingot.copy(), 64 * 2),
                    setStackSize(GTItemList.Field_Generator_UV.copy(), 1),

                    setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 2))
                .fluidInputs(requiredFluid(FluidList.Mutated_Living_Solder, 144 * 10))
                .itemOutputs(setStackSize(GTPPList.Neutron_Shielding_Core, 1))
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Cosmic Fabric Manipulator"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#119")
                .itemInputsUnsafe(
                    setStackSize(GTPPList.Force_Field_Glass.copy(), 2),
                    setStackSize(GTItemList.Carbon_Nanites.copy(), 8),
                    setStackSize(GTItemList.Emitter_UEV.copy(), 4),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 2),

                    setStackSize(GTPPList.Quantum_Anomaly.copy(), 1),
                    setStackSize(IngotList.Thulium_Ingot.copy(), 12),
                    setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 4),
                    setStackSize(GTItemList.Hyper_Stable_Self_Healing_Adhesive.copy(), 4))
                .fluidInputs(
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Prosaic_Catalyst, 1000 * 5),
                    requiredFluid(PlasmaList.Neptunium_Plasma, 2500),
                    requiredFluid(PlasmaList.Fermium_Plasma, 2500))
                .itemOutputs(setStackSize(GTPPList.Cosmic_Fabric_Manipulator, 1))
                .eut(RECIPE_UIV)
                .duration(75 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Cosmic Fabric Shielding Core"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#120")
                .itemInputsUnsafe(
                    setStackSize(IngotList.Quantum_Ingot.copy(), 4),
                    setStackSize(IngotList.Enriched_Naquadah_Alloy_Ingot.copy(), 36),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 2),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 1),

                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 2),
                    setStackSize(GTItemList.Hyper_Stable_Self_Healing_Adhesive.copy(), 4))
                .fluidInputs(requiredFluid(FluidList.Mutated_Living_Solder, 144 * 20))
                .itemOutputs(setStackSize(GTPPList.Cosmic_Fabric_Shielding_Core, 1))
                .eut(RECIPE_UIV)
                .duration(75 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Infinity Infused Manipulator"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#121")
                .itemInputsUnsafe(
                    setStackSize(GTPPList.Force_Field_Glass.copy(), 4),
                    setStackSize(GTItemList.Carbon_Nanites.copy(), 16),
                    setStackSize(GTItemList.Emitter_UIV.copy(), 4),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 2),

                    setStackSize(GTPPList.Quantum_Anomaly.copy(), 1),
                    setStackSize(IngotList.Thulium_Ingot.copy(), 15),
                    setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 8),
                    setStackSize(GTItemList.Superconductor_Rare_Earth_Composite.copy(), 4))
                .fluidInputs(
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Resplendent_Catalyst, 1000 * 5),
                    requiredFluid(PlasmaList.Neptunium_Plasma, 1000 * 10),
                    requiredFluid(PlasmaList.Fermium_Plasma, 1000 * 10))
                .itemOutputs(setStackSize(GTPPList.Infinity_Infused_Manipulator, 1))
                .eut(RECIPE_UMV)
                .duration(90 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Infinity Infused Shielding Core"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#122")
                .itemInputsUnsafe(
                    setStackSize(IngotList.Quantum_Ingot.copy(), 8),
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 36),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 2),
                    setStackSize(GTItemList.Field_Generator_UIV.copy(), 1),

                    setStackSize(IngotList.Metastable_Oganesson_Ingot.copy(), 2),
                    setStackSize(GTItemList.Superconductor_Rare_Earth_Composite.copy(), 4))
                .fluidInputs(requiredFluid(FluidList.Mutated_Living_Solder, 144 * 40))
                .itemOutputs(setStackSize(GTPPList.Infinity_Infused_Shielding_Core, 1))
                .eut(RECIPE_UMV)
                .duration(90 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "SpaceTime Continuum Ripper"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#123")
                .itemInputsUnsafe(
                    setStackSize(GTPPList.Force_Field_Glass.copy(), 8),
                    setStackSize(GTItemList.Carbon_Nanites.copy(), 32),
                    setStackSize(GTItemList.Emitter_UMV.copy(), 4),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 64 * 2),

                    setStackSize(GTPPList.Quantum_Anomaly.copy(), 1),
                    setStackSize(IngotList.Thulium_Ingot.copy(), 20),
                    setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 16),
                    setStackSize(GTItemList.Black_Body_Naquadria_Supersolid.copy(), 4))
                .fluidInputs(
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 5),
                    requiredFluid(PlasmaList.Neptunium_Plasma, 1000 * 20),
                    requiredFluid(PlasmaList.Fermium_Plasma, 1000 * 20))
                .itemOutputs(setStackSize(GTPPList.SpaceTime_Continuum_Ripper, 1))
                .eut(RECIPE_UXV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "SpaceTime Bending Core"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#124")
                .itemInputsUnsafe(
                    setStackSize(IngotList.Quantum_Ingot.copy(), 8),
                    setStackSize(IngotList.Shirabon_Ingot.copy(), 36),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 2),
                    setStackSize(GTItemList.Field_Generator_UMV.copy(), 1),

                    setStackSize(GemList.Dilithium.copy(), 2),
                    setStackSize(GTItemList.Black_Body_Naquadria_Supersolid.copy(), 4))
                .fluidInputs(requiredFluid(FluidList.Mutated_Living_Solder, 144 * 80))
                .itemOutputs(setStackSize(GTPPList.SpaceTime_Bending_Core, 1))
                .eut(RECIPE_UXV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // "Quark Exclusion Casing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#125")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(MultiMachineCasingList.Quark_Exclusion_Casing.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 4),
                getMaterialInput(OrePrefixes.circuit, Materials.UEV, 12),
                getMaterialInput(OrePrefixes.circuit, Materials.UHV, 16),

                setStackSize(GemList.Nether_Star.copy(), 36),

                setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 + 24),
                setStackSize(IngotList.Callisto_Ice_Ingot.copy(), 64 * 2 + 32),
                setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 + 12),
                setStackSize(IngotList.Enriched_Holmium_Ingot.copy(), 64 + 32),
                setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 4),
                setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 2 + 34),

                setStackSize(IngotList.Infinity_Ingot.copy(), 64 + 32),
                setStackSize(IngotList.Ledox_Ingot.copy(), 64 * 2 + 32),
                setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 16),
                setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 2 + 34),
                setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 6 + 8),
                setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 64 * 2 + 32))
            .fluidInputs(
                requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Resplendent_Catalyst, 1000 * 8),
                requiredFluid(FluidList.Lubricant, 1000 * 16),
                requiredFluid(GasList.Radon, 1000 * 45))
            .itemOutputs(setStackSize(MultiMachineCasingList.Quark_Exclusion_Casing.copy(), 8))
            .eut(RECIPE_UIV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Rocket Engine Base"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#126")
            .itemInputsUnsafe(
                setStackSize(GTNHIntergalacticList.Ultra_High_Temperature_Resistant_Mesh.copy(), 64),
                setStackSize(GTBlockList.Quantum_Tank_IV.copy(), 2),
                setStackSize(GTItemList.Electric_Pump_UHV.copy(), 4),
                getMaterialInput(OrePrefixes.circuit, Materials.UHV, 2),
                setStackSize(IngotList.Infinity_Ingot.copy(), 50),

                setStackSize(AmunRaList.Nanite_Cluster.copy(), 1))
            .fluidInputs(
                requiredFluid(FluidList.Super_Coolant, 1000 * 64),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64))
            .itemOutputs(setStackSize(AmunRaList.Rocket_Engine_Base, 1))
            .eut(RECIPE_UHV)
            .duration(50 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Rocket Engine Jet"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#127")
            .itemInputsUnsafe(
                setStackSize(GTNHIntergalacticList.Ultra_High_Temperature_Resistant_Mesh.copy(), 64 * 4),
                setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4.copy(), 64),
                setStackSize(IngotList.Infinity_Ingot.copy(), 64 + 32),
                setStackSize(GTItemList.Electric_Pump_UHV.copy(), 16),
                setStackSize(IngotList.Infinity_Ingot.copy(), 50),

                getMaterialInput(OrePrefixes.circuit, Materials.UHV, 8),
                setStackSize(AmunRaList.Nanite_Cluster.copy(), 4))
            .fluidInputs(
                requiredFluid(FluidList.Super_Coolant, 1000 * 64),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64))
            .itemOutputs(setStackSize(AmunRaList.Rocket_Engine_Jet, 1))
            .eut(RECIPE_UHV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // Solenoid Superconductor Coil
        {
            // "LuV Solenoid Superconductor Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#128")
                .itemInputsUnsafe(
                    setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 16),
                    setStackSize(IngotList.HSSG_Ingot.copy(), 4),
                    setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 3),
                    setStackSize(IngotList.Mu_metal_Ingot.copy(), 8),

                    setStackSize(IngotList.HSSS_Ingot.copy(), 4),
                    setStackSize(GTItemList.Electric_Pump_LuV.copy(), 1),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 4))
                .fluidInputs()
                .itemOutputs(setStackSize(MultiMachineCasingList.LuV_Solenoid_Superconductor_Coil, 1))
                .eut(RECIPE_LuV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "ZPM Solenoid Superconductor Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#129")
                .itemInputsUnsafe(
                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 16),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 4),
                    setStackSize(IngotList.Enderium_Ingot.copy(), 3),
                    setStackSize(IngotList.Mu_metal_Ingot.copy(), 8),

                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 4),
                    setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 1),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 4))
                .fluidInputs()
                .itemOutputs(setStackSize(MultiMachineCasingList.ZPM_Solenoid_Superconductor_Coil, 1))
                .eut(RECIPE_ZPM)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "UV Solenoid Superconductor Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#130")
                .itemInputsUnsafe(
                    setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 32),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 4),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 3),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 8),

                    setStackSize(IngotList.Neutronium_Ingot.copy(), 4),
                    setStackSize(GTItemList.Electric_Pump_UV.copy(), 1),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 16))
                .fluidInputs(requiredFluid(FluidList.Super_Coolant, 1000 * 16))
                .itemOutputs(setStackSize(MultiMachineCasingList.UV_Solenoid_Superconductor_Coil, 1))
                .eut(RECIPE_UV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "UHV Solenoid Superconductor Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#131")
                .itemInputsUnsafe(
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 32),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 4),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 3),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 8),

                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 4),
                    setStackSize(GTItemList.Electric_Pump_UHV.copy(), 1),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64))
                .fluidInputs(requiredFluid(FluidList.Super_Coolant, 1000 * 64))
                .itemOutputs(setStackSize(MultiMachineCasingList.UHV_Solenoid_Superconductor_Coil, 1))
                .eut(RECIPE_UHV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "UEV Solenoid Superconductor Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#132")
                .itemInputsUnsafe(
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 32),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 4),
                    setStackSize(GemList.Nether_Star.copy(), 3),
                    setStackSize(IngotList.Metastable_Oganesson_Ingot.copy(), 8),

                    setStackSize(IngotList.Infinity_Ingot.copy(), 4),
                    setStackSize(GTItemList.Electric_Pump_UEV.copy(), 1))
                .fluidInputs(
                    requiredFluid(FluidList.Super_Coolant, 1000 * 64 * 4),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 8))
                .itemOutputs(setStackSize(MultiMachineCasingList.UEV_Solenoid_Superconductor_Coil, 1))
                .eut(RECIPE_UEV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "UIV Solenoid Superconductor Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#133")
                .itemInputsUnsafe(
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 32),
                    setStackSize(GemList.Nether_Star.copy(), 8),
                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 3),
                    setStackSize(IngotList.Metastable_Oganesson_Ingot.copy(), 8),

                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 32),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 4),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 1))
                .fluidInputs(requiredFluid(FluidList.Mutated_Living_Solder, 144 * 32))
                .itemOutputs(setStackSize(MultiMachineCasingList.UIV_Solenoid_Superconductor_Coil, 1))
                .eut(RECIPE_UIV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "UMV Solenoid Superconductor Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#134")
                .itemInputsUnsafe(
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 32),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 4),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 3),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 8),

                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 4),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 16),
                    setStackSize(GTItemList.Electric_Pump_UMV.copy(), 1))
                .fluidInputs(requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 2))
                .itemOutputs(setStackSize(MultiMachineCasingList.UMV_Solenoid_Superconductor_Coil, 1))
                .eut(RECIPE_UMV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // Space Elevator
        {
            // "Space Elevator Base Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#135")
                .itemInputsUnsafe(
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 16),
                    setStackSize(IngotList.Palladium_Ingot.copy(), 4),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 64),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),

                    setStackSize(GTItemList.Electric_Piston_UV.copy(), 2),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 40),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 2),
                    setStackSize(IngotList.Iridium_Ingot.copy(), 8))
                .fluidInputs(requiredFluid(FluidList.UU_Matter, 1000 * 2))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 8))
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Space Elevator Support Structure"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#136")
                .itemInputsUnsafe(
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 16),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 2),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 8),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 40),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 16),
                    setStackSize(IngotList.Iridium_Ingot.copy(), 10))
                .fluidInputs(requiredFluid(FluidList.UU_Matter, 1000))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Space_Elevator_Support_Structure.copy(), 8))
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Space Elevator Internal Structure"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#137")
                .itemInputsUnsafe(
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 8),
                    setStackSize(IngotList.Iridium_Ingot.copy(), 64 + 48),
                    setStackSize(IngotList.Cobalt_Ingot.copy(), 16),
                    setStackSize(IngotList.Copper_Ingot.copy(), 16),
                    setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 8),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 32),

                    setStackSize(IngotList.Palladium_Ingot.copy(), 2),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 40),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 16))
                .fluidInputs(
                    requiredFluid(FluidList.UU_Matter, 1000 * 8),
                    requiredFluid(FluidList.Wet_Concrete, 144 * 10))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Space_Elevator_Support_Structure.copy(), 8))
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Space Elevator Motor MK-I"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#138")
                .itemInputsUnsafe(
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 1),
                    setStackSize(GTItemList.Electric_Motor_UV.copy(), 4),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 2),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 2),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 40),

                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 1),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 10),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 2),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 16))
                .fluidInputs(
                    requiredFluid(FluidList.UU_Matter, 1000 * 8),
                    requiredFluid(FluidList.Lubricant, 1000 * 16))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Space_Elevator_Motor_MKI, 1))
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Space Elevator Motor MK-II"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#139")
                .itemInputsUnsafe(
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 1),
                    setStackSize(GTItemList.Electric_Motor_UHV.copy(), 4),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 2),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 2),

                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 1),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 2),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 40),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 10),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 16))
                .fluidInputs(
                    requiredFluid(FluidList.UU_Matter, 1000 * 8),
                    requiredFluid(FluidList.Lubricant, 1000 * 16))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Space_Elevator_Motor_MKII, 1))
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Space Elevator Motor MK-III"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#140")
                .itemInputsUnsafe(
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 1),
                    setStackSize(GTItemList.Electric_Motor_UEV.copy(), 4),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 2),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 2),

                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 1),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 2),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 10),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 16))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 20),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8),
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 24))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Space_Elevator_Motor_MKIII, 1))
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Space Elevator Motor MK-IV"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#141")
                .itemInputsUnsafe(
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 1),
                    setStackSize(GTItemList.Electric_Motor_UIV.copy(), 4),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 2),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 2),

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 1),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 2),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 10),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 16))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 20),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8),
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 24))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Space_Elevator_Motor_MKIV, 1))
                .eut(RECIPE_UIV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Space Elevator Motor MK-V"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#142")
                .itemInputsUnsafe(
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 1),
                    setStackSize(GTItemList.Electric_Motor_UMV.copy(), 4),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 2),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 2),

                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 1),
                    setStackSize(IngotList.Universium_Ingot.copy(), 2),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 10),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 16))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 20),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8),
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 24))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Space_Elevator_Motor_MKV, 1))
                .eut(RECIPE_UMV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // "Super Stock Replenisher"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#143")
            .itemInputsUnsafe(
                setStackSize(HatchList.Stocking_Input_Bus_ME.copy(), 1),
                setStackSize(HatchList.Stocking_Input_Hatch_ME.copy(), 1),
                setStackSize(Appliedenergistics2List.ME_Controller.copy(), 1),
                setStackSize(Appliedenergistics2List.ME_Chest.copy(), 1),
                setStackSize(IngotList.Naquadria_Ingot.copy(), 8),
                setStackSize(IngotList.Indalloy_140_Ingot.copy(), 8),

                setStackSize(Appliedenergistics2List.Capacity_Card.copy(), 4),
                setStackSize(Appliedenergistics2List.Hyper_Acceleration_Card.copy(), 4))
            .fluidInputs(requiredFluid(FluidList.Lubricant, 2000))
            .itemOutputs(setStackSize(AE2FluidCraftingList.Super_Stock_Replenisher, 1))
            .eut(RECIPE_UV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Target Receptacle"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#144")
            .itemInputsUnsafe(
                setStackSize(IngotList.Aluminium_Ingot.copy(), 2),
                getMaterialInput(OrePrefixes.circuit, Materials.IV, 4),
                setStackSize(GTItemList.Robot_Arm_LuV.copy(), 4),
                setStackSize(IngotList.Gold_Ingot.copy(), 2),
                setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 64),
                setStackSize(IngotList.Gold_Ingot.copy(), 16),

                setStackSize(IngotList.Tungsten_Ingot.copy(), 1))
            .fluidInputs(requiredFluid(GasList.Argon, 1000))
            .itemOutputs(setStackSize(GTNHLanthanidesList.Focus_Manipulator, 1))
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // TFFT Storage Field Block
        {
            // "TFFT Storage Field Block (Tier VI)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#145")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineCasingList.Hermetic_Casing_VII.copy(), 4),
                    setStackSize(IngotList.Crystalline_Pink_Slime_Ingot.copy(), 24),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 27),
                    setStackSize(NewHorizonsCoreModList.Chrome_Bars.copy(), 6),

                    setStackSize(IngotList.Quantium_Ingot.copy(), 30),
                    setStackSize(GTItemList.Field_Generator_EV.copy(), 8),
                    setStackSize(GTItemList.Fluid_Regulator_LuV.copy(), 1),
                    setStackSize(IngotList.Enderium_Ingot.copy(), 10),
                    setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 11),
                    setStackSize(NewHorizonsCoreModList.Fluid_Processor_Tier_II.copy(), 4))
                .fluidInputs()
                .itemOutputs(setStackSize(KekzTechList.TFFT_Storage_Field_Block_TierVI, 1))
                .eut(RECIPE_LuV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "TFFT Storage Field Block (Tier VII)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#146")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineCasingList.Hermetic_Casing_X.copy(), 16),
                    setStackSize(IngotList.Melodic_Alloy_Ingot.copy(), 24),
                    setStackSize(GemList.Nether_Star.copy(), 27),
                    setStackSize(NewHorizonsCoreModList.Osmium_Bars.copy(), 6),

                    setStackSize(IngotList.Mysterious_Crystal_Ingot.copy(), 30),
                    setStackSize(GTItemList.Field_Generator_IV.copy(), 16),
                    setStackSize(GTItemList.Field_Generator_LuV.copy(), 4),
                    setStackSize(GTItemList.Fluid_Regulator_UV.copy(), 1),
                    setStackSize(IngotList.Crystalline_Alloy_Ingot.copy(), 20),
                    setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 14),

                    setStackSize(NewHorizonsCoreModList.Fluid_Processor_Tier_II.copy(), 16))
                .fluidInputs()
                .itemOutputs(setStackSize(KekzTechList.TFFT_Storage_Field_Block_TierVII, 1))
                .eut(RECIPE_UV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "TFFT Storage Field Block (Tier VIII)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#147")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Quantum_Tank_V.copy(), 1),
                    setStackSize(MultiMachineControllerList.Neutronium_Compressor.copy(), 1),
                    setStackSize(IngotList.Stellar_Alloy_Ingot.copy(), 64 + 44),
                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 27),

                    setStackSize(NewHorizonsCoreModList.Neutronium_Bars.copy(), 6),
                    setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 30),
                    setStackSize(GTItemList.Field_Generator_ZPM.copy(), 16),
                    setStackSize(GTItemList.Field_Generator_UV.copy(), 4),

                    setStackSize(IngotList.Crystalline_Pink_Slime_Ingot.copy(), 30),
                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 20),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKIII.copy(), 4),
                    setStackSize(SingularityList.Ender_Singularity.copy(), 1))
                .fluidInputs()
                .itemOutputs(setStackSize(KekzTechList.TFFT_Storage_Field_Block_TierVIII, 1))
                .eut(RECIPE_UEV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "TFFT Storage Field Block (Tier IX)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#148")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Quantum_Tank_V.copy(), 4),
                    setStackSize(MultiMachineControllerList.Neutronium_Compressor.copy(), 2),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 54),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 54),

                    setStackSize(IngotList.Infinity_Ingot.copy(), 27),
                    setStackSize(GTItemList.Energised_Tesseract.copy(), 1),
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 30),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 16),

                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 4),
                    setStackSize(IngotList.Melodic_Alloy_Ingot.copy(), 40),
                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 24),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKIV_Prototype.copy(), 4),
                    setStackSize(SingularityList.Ender_Singularity.copy(), 1))
                .fluidInputs()
                .itemOutputs(setStackSize(KekzTechList.TFFT_Storage_Field_Block_TierIX, 1))
                .eut(RECIPE_UMV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "TFFT Storage Field Block (Tier X)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Item#149")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Quantum_Tank_V.copy(), 16),
                    setStackSize(MultiMachineControllerList.Neutronium_Compressor.copy(), 4),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 + 44),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 27),
                    setStackSize(GTItemList.Energised_Tesseract.copy(), 6),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 30),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 16),
                    setStackSize(GTItemList.Field_Generator_UIV.copy(), 4),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKV_Finaltype.copy(), 8),
                    setStackSize(EnderIOList.Stellar_Capacitor.copy(), 64),
                    setStackSize(IngotList.Stellar_Alloy_Ingot.copy(), 50),
                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 32),
                    setStackSize(SingularityList.Eternal_Singularity.copy(), 1))
                .fluidInputs()
                .itemOutputs(setStackSize(KekzTechList.TFFT_Storage_Field_Block_TierX, 1))
                .eut(RECIPE_UXV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }
    }
}
