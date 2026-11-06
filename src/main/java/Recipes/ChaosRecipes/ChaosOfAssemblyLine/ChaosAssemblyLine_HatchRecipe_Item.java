package Recipes.ChaosRecipes.ChaosOfAssemblyLine;

import static Recipes.ChaosRecipes.ChaosRecipeMap.AssemblyLineNormalRecipe;
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
import EnumList.EnumItemList.EnumModList.AE2FluidCraftingList;
import EnumList.EnumItemList.EnumModList.AmunRaList;
import EnumList.EnumItemList.EnumModList.Appliedenergistics2List;
import EnumList.EnumItemList.EnumModList.GTNHIntergalacticList;
import EnumList.EnumItemList.EnumModList.GTNHLanthanidesList;
import EnumList.EnumItemList.EnumModList.GoodGeneratorList;
import EnumList.EnumItemList.EnumModList.OpenComputersList;
import EnumList.EnumItemList.EnumModList.TecTechList;
import EnumList.EnumItemList.EnumOreProductList.GemList;
import EnumList.EnumItemList.EnumOreProductList.IngotList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GTUtility;
import util.ChaosAssemblyRecipeBuilder;

public class ChaosAssemblyLine_HatchRecipe_Item {

    public static void addChaosAssemblyLine_HatchRecipe_Item() {
        // "Antimatter Hatch"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#1")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(HatchList.Antimatter_Hatch.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 16),
                getMaterialInput(OrePrefixes.circuit, Materials.UEV, 64 + 8),
                getMaterialInput(OrePrefixes.circuit, Materials.UHV, 32),

                setStackSize(GemList.Nether_Star.copy(), 64 * 6 + 8),

                setStackSize(HatchList.Output_Hatch_UIV.copy(), 1),

                setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 3 + 8),
                setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 48),
                setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 2 + 48),
                setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 32),
                setStackSize(IngotList.Cobalt_Ingot.copy(), 64),
                setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 19 + 24),

                setStackSize(IngotList.Draconium_Ingot.copy(), 64 * 5 + 32),
                setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 8),
                setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 5 + 4),
                setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64 * 16),
                setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 9),
                setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 48),

                setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 5 + 20),
                setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 21 + 16),
                setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 5 + 8),
                setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 10 + 8),
                setStackSize(IngotList.Radox_Polymer_Bar.copy(), 9),
                setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64),

                setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 3),
                setStackSize(IngotList.Tritanium_Ingot.copy(), 64 * 5),

                setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 8))
            .fluidInputs(
                requiredFluid("dimensionallyshiftedsuperfluid", 1000 * 33),
                requiredFluid("ic2coolant", 1000 * 64),
                requiredFluid("lubricant", 1000 * (64 + 32)),
                requiredFluid("molten.mutatedlivingsolder", 144 * (64 * 12 + 24)),
                requiredFluid("protomatter", 250),
                requiredFluid("radon", 1000 * (64 * 8 + 20)))
            .itemOutputs(setStackSize(HatchList.Antimatter_Hatch.copy(), 1))
            .eut(RECIPE_UIV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Auto-Taping Maintenance Hatch"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#2")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(HatchList.Auto_Taping_Maintenance_Hatch.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.UV, 6),
                getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 8),
                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 16),
                getMaterialInput(OrePrefixes.circuit, Materials.IV, 8),
                getMaterialInput(OrePrefixes.circuit, Materials.EV, 16),

                setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 8),
                setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 8),
                setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 8),
                setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 8),
                setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64),
                setStackSize(CircuitList.High_Power_IC_Chip.copy(), 64),
                setStackSize(CircuitList.Multilayer_Fiber_Reinforced_Circuit_Board.copy(), 1),

                setStackSize(GTBlockList.Machine_Hull_LuV.copy(), 1),

                setStackSize(IngotList.Americium_Ingot.copy(), 64 * 4 + 40),
                setStackSize(IngotList.Carbon_Ingot.copy(), 32),
                setStackSize(IngotList.HSSS_Ingot.copy(), 64 + 8),
                setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 2),
                setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 18),
                setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 + 4),

                setStackSize(IngotList.Naquadah_Ingot.copy(), 12),
                setStackSize(IngotList.Naquadria_Ingot.copy(), 64 + 26),
                setStackSize(IngotList.Neutronium_Ingot.copy(), 64 + 40),
                setStackSize(IngotList.Platinum_Ingot.copy(), 8),
                setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 34),
                setStackSize(IngotList.Ruridit_Ingot.copy(), 64 + 32),

                setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 44),
                setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 16))
            .fluidInputs(requiredFluid("lubricant", 1000 * (64 * 4 + 22) + 500))
            .itemOutputs(setStackSize(HatchList.Auto_Taping_Maintenance_Hatch.copy(), 1))
            .eut(RECIPE_UV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Beam Input Hatch"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#3")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(HatchList.Beam_Input_Hatch.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),

                setStackSize(GTBlockList.Machine_Hull_LuV.copy(), 1),

                setStackSize(GTNHLanthanidesList.Capillary_Exchange.copy(), 2),

                setStackSize(IngotList.HSSS_Ingot.copy(), 15),
                setStackSize(IngotList.Indalloy_140_Ingot.copy(), 2),
                setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 1),
                setStackSize(IngotList.Mu_metal_Ingot.copy(), 8),
                setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 2),
                setStackSize(IngotList.Osmiridium_Ingot.copy(), 1),

                setStackSize(IngotList.Ruridit_Ingot.copy(), 16),
                setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 1),
                setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 64 + 1),
                setStackSize(IngotList.Tungstencarbide_Ingot.copy(), 8),
                setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 2))
            .fluidInputs(
                requiredFluid("argon", 1000),
                requiredFluid("helium", 1000 * 2),
                requiredFluid("lubricant", 500))
            .itemOutputs(setStackSize(HatchList.Beam_Input_Hatch.copy(), 1))
            .eut(RECIPE_LuV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Beam Output Hatch"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#4")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(HatchList.Beam_Output_Hatch.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 6),

                setStackSize(GTBlockList.Machine_Hull_LuV.copy(), 1),

                setStackSize(GTNHLanthanidesList.Capillary_Exchange.copy(), 4),

                setStackSize(IngotList.HSSS_Ingot.copy(), 38),
                setStackSize(IngotList.Indalloy_140_Ingot.copy(), 8),
                setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 6),
                setStackSize(IngotList.Mu_metal_Ingot.copy(), 12),
                setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 4),
                setStackSize(IngotList.Osmiridium_Ingot.copy(), 1),

                setStackSize(IngotList.Ruridit_Ingot.copy(), 64 + 32),
                setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 2),
                setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 64 + 1),
                setStackSize(IngotList.Tungstencarbide_Ingot.copy(), 8),
                setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 8),

                setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 8))
            .fluidInputs(
                requiredFluid("argon", 1000),
                requiredFluid("helium", 1000 * 6),
                requiredFluid("lubricant", 1000 * 2))
            .itemOutputs(setStackSize(HatchList.Beam_Output_Hatch.copy(), 1))
            .eut(RECIPE_LuV)
            .duration(240 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Bose-Einstein Condensate
        {
            // "Bose-Einstein Condensate Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#5")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Bose_Einstein_Condensate_Hatch.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 10),

                    setStackSize(GemList.Nether_Star.copy(), 16),

                    setStackSize(GTBlockList.Machine_Hull_LuV.copy(), 2),
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 1),

                    setStackSize(GTNHLanthanidesList.Capillary_Exchange.copy(), 6),

                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 32),
                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 24),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 28),
                    setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 32),
                    setStackSize(IngotList.Churitsu_Ingot.copy(), 5),
                    setStackSize(IngotList.HSSS_Ingot.copy(), 53),

                    setStackSize(IngotList.Hypogen_Ingot.copy(), 1),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 10),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 16),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 7),
                    setStackSize(IngotList.Mu_metal_Ingot.copy(), 20),
                    setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 6),

                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 2),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 64 + 48),
                    setStackSize(IngotList.Shijima_Ingot.copy(), 5),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 35),
                    setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 64 * 2 + 2),

                    setStackSize(IngotList.Tairitsu_Ingot.copy(), 5),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Tungstencarbide_Ingot.copy(), 16),
                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 10),

                    setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 8))
                .fluidInputs(
                    requiredFluid("argon", 1000 * 2),
                    requiredFluid("dimensionallyshiftedsuperfluid", 1000 * 16),
                    requiredFluid("helium", 1000 * 8),
                    requiredFluid("lubricant", 1000 * 2 + 500),
                    requiredFluid("molten.mutatedlivingsolder", 144 * (64 * 9 + 8)))
                .itemOutputs(setStackSize(HatchList.Bose_Einstein_Condensate_Hatch.copy(), 1))
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Nanite Tier Detector Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#6")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Nanite_Tier_Detector_Hatch.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 4),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 2 + 18),

                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 1),

                    setStackSize(HatchList.Electrode_Detector_Hatch.copy(), 1),

                    setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 16),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 16),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 20),
                    setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 32),
                    setStackSize(IngotList.Churitsu_Ingot.copy(), 4),
                    setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 16),

                    setStackSize(IngotList.Hypogen_Ingot.copy(), 2),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 8),
                    setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 16),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 16),
                    setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 16),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64),

                    setStackSize(IngotList.Shijima_Ingot.copy(), 4),
                    setStackSize(IngotList.Tairitsu_Ingot.copy(), 4),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 32))
                .fluidInputs(
                    requiredFluid("dimensionallyshiftedsuperfluid", 1000 * 4),
                    requiredFluid("molten.mutatedlivingsolder", 144 * (64 * 8 + 36)))
                .itemOutputs(setStackSize(HatchList.Nanite_Tier_Detector_Hatch.copy(), 1))
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Bose-Einstein Condensate Detector Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#7")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Bose_Einstein_Condensate_Detector_Hatch.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 10),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 2 + 34),

                    setStackSize(GTBlockList.Machine_Hull_LuV.copy(), 2),
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 3),

                    setStackSize(GTNHLanthanidesList.Capillary_Exchange.copy(), 6),

                    setStackSize(HatchList.Electrode_Detector_Hatch.copy(), 1),

                    setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 16),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 48),
                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 64 + 24),
                    setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Churitsu_Ingot.copy(), 28),
                    setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 16),

                    setStackSize(IngotList.HSSS_Ingot.copy(), 53),
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 3),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 10),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 24),
                    setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 16),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 7),

                    setStackSize(IngotList.Mu_metal_Ingot.copy(), 20),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 16),
                    setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 6),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 2),
                    setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 16),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 3),

                    setStackSize(IngotList.Ruridit_Ingot.copy(), 64 + 48),
                    setStackSize(IngotList.Shijima_Ingot.copy(), 12),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 35),
                    setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 64 * 2 + 2),
                    setStackSize(IngotList.Tairitsu_Ingot.copy(), 12),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 2),

                    setStackSize(IngotList.Tungstencarbide_Ingot.copy(), 16),
                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 10),

                    setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 8))
                .fluidInputs(
                    requiredFluid("argon", 1000 * 2),
                    requiredFluid("dimensionallyshiftedsuperfluid", 1000 * 20),
                    requiredFluid("helium", 1000 * 8),
                    requiredFluid("lubricant", 1000 * 2 + 500),
                    requiredFluid("molten.mutatedlivingsolder", 144 * (64 * 25 + 44)))
                .itemOutputs(setStackSize(HatchList.Bose_Einstein_Condensate_Detector_Hatch.copy(), 1))
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Line-Of-Sight Connector Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#8")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Line_Of_Sight_Connector_Hatch.copy(), 0),

                    setStackSize(GemList.Nether_Star.copy(), 13),

                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 1),

                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 32),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 28),
                    setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 32),
                    setStackSize(IngotList.Churitsu_Ingot.copy(), 1),
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 16),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 2),

                    setStackSize(IngotList.Shijima_Ingot.copy(), 1),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 + 16),
                    setStackSize(IngotList.Tairitsu_Ingot.copy(), 1),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 56),

                    setStackSize(MultiMachineCasingList.Dimensional_Bridge.copy(), 2))
                .fluidInputs(
                    requiredFluid("dimensionallyshiftedsuperfluid", 1000 * 12),
                    requiredFluid("molten.mutatedlivingsolder", 144 * (64 * 8 + 54)))
                .itemOutputs(setStackSize(HatchList.Line_Of_Sight_Connector_Hatch.copy(), 1))
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Teleportation Node Controller Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#9")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Teleportation_Node_Controller_Hatch.copy(), 0),

                    setStackSize(Appliedenergistics2List.ME_Controller.copy(), 1),
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 1),
                    setStackSize(HatchList.Degasser_Control_Hatch.copy(), 1),

                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 16),
                    setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 32),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 16),

                    setStackSize(MachineList.Teleporter.copy(), 1))
                .fluidInputs(requiredFluid("molten.mutatedlivingsolder", 144 * 64 * 8))
                .itemOutputs(setStackSize(HatchList.Teleportation_Node_Controller_Hatch.copy(), 1))
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Bulk Catalyst Housing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#10")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(HatchList.Bulk_Catalyst_Housing.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 4),
                getMaterialInput(OrePrefixes.circuit, Materials.UEV, 21),
                getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),
                getMaterialInput(OrePrefixes.circuit, Materials.UV, 16),

                setStackSize(GemList.Nether_Star.copy(), 64 + 26),

                setStackSize(GTBlockList.Machine_Hull_UEV.copy(), 2),

                setStackSize(GTPPList.Quantum_Anomaly.copy(), 4),

                setStackSize(IngotList.Abyssal_Alloy_Ingot.copy(), 64 * 2),
                setStackSize(IngotList.Americium_Ingot.copy(), 64 * 3 + 51),
                setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 48),
                setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 70),
                setStackSize(IngotList.Draconium_Ingot.copy(), 64 + 36),
                setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 52),

                setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64 * 36),
                setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 19 + 8),
                setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 8),
                setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 + 24),
                setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 4 + 17),
                setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 3 + 56),

                setStackSize(IngotList.Octiron_Ingot.copy(), 64 * 4),
                setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 3 + 24),
                setStackSize(IngotList.Quantum_Ingot.copy(), 32),
                setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 2),
                setStackSize(IngotList.Tritanium_Ingot.copy(), 64))
            .fluidInputs(
                requiredFluid("lubricant", 1000 * (64 + 4)),
                requiredFluid("molten.mutatedlivingsolder", 144 * (64 * 4 + 24)),
                requiredFluid("radon", 1000 * (64 * 2 + 2) + 500))
            .itemOutputs(setStackSize(HatchList.Bulk_Catalyst_Housing.copy(), 1))
            .eut(RECIPE_UEV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Cloud Computation Client Hatch"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#11")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(HatchList.Cloud_Computation_Client_Hatch.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.UXV, 1),

                setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 64),

                setStackSize(GTItemList.Energised_Tesseract.copy(), 1),

                setStackSize(HatchList.Optical_Reception_Connector.copy(), 1),

                setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 9),
                setStackSize(IngotList.Shirabon_Ingot.copy(), 16),

                setStackSize(MultiMachineControllerList.Static_Network_Switch_With_QoS.copy(), 1),

                setStackSize(OpenComputersList.Internet_Card.copy(), 1))
            .fluidInputs(requiredFluid("molten.mutatedlivingsolder", 144 * 9), requiredFluid("exciteddtec", 500))
            .itemOutputs(setStackSize(HatchList.Cloud_Computation_Client_Hatch.copy(), 1))
            .eut(RECIPE_UMV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Cloud Computation Server Hatch"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#12")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(HatchList.Cloud_Computation_Server_Hatch.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.UXV, 1),

                setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 64),

                setStackSize(GTItemList.Energised_Tesseract.copy(), 1),

                setStackSize(HatchList.Optical_Transmission_Connector.copy(), 1),

                setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 9),
                setStackSize(IngotList.Shirabon_Ingot.copy(), 16),

                setStackSize(MultiMachineControllerList.Static_Network_Switch_With_QoS.copy(), 1),

                setStackSize(OpenComputersList.Internet_Card.copy(), 1))
            .fluidInputs(requiredFluid("molten.mutatedlivingsolder", 144 * 9), requiredFluid("exciteddtec", 500))
            .itemOutputs(setStackSize(HatchList.Cloud_Computation_Server_Hatch.copy(), 1))
            .eut(RECIPE_UMV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Crafting Input Bus (ME)"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#13")
            .itemInputsUnsafe(
                setStackSize(HatchList.Stocking_Input_Bus_ME.copy(), 1),
                setStackSize(Appliedenergistics2List.ME_Storage_Component_4096k.copy(), 1),
                setStackSize(Appliedenergistics2List.ME_Controller.copy(), 1),
                setStackSize(Appliedenergistics2List.ME_Interface.copy(), 1),

                setStackSize(Appliedenergistics2List.Pattern_Capacity_Card.copy(), 3))
            .fluidInputs(requiredFluid("molten.indalloy140", 144 * 8))
            .itemOutputs(setStackSize(HatchList.Crafting_Input_Bus_ME, 1))
            .eut(RECIPE_LuV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Data Orb Repository"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#14")
            .itemInputsUnsafe(
                setStackSize(GTPPList.Integral_Framework_III.copy(), 2),
                setStackSize(GTItemList.Field_Generator_EV.copy(), 4),
                setStackSize(GTPPList.Energy_Core_EV.copy(), 2),
                setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 8),

                setStackSize(IngotList.Zeron_100_Ingot.copy(), 2),
                setStackSize(IngotList.Trinium_Naquadah_Carbonite_Ingot.copy(), 2),
                setStackSize(IngotList.Inconel_625_Ingot.copy(), 8),
                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 32),

                setStackSize(GTItemList.Data_Orb.copy(), 32))
            .fluidInputs(
                requiredFluid("molten.zeron100", 144 * 16),
                requiredFluid("molten.arcanite", 144 * 8),
                requiredFluid("molten.energycrystal", 144 * 8),
                requiredFluid("molten.babbitalloy", 144 * 64))
            .itemOutputs(setStackSize(HatchList.Data_Orb_Repository, 1))
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Energized Wireless Dynamo Hatch"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#15")
            .itemInputsUnsafe(
                setStackSize(HatchList.Laser_Source_Hatch65536_UMV.copy(), 1),
                setStackSize(BatteryList.Really_Ultimate_Battery_Empty.copy(), 1),
                getMaterialInput(OrePrefixes.circuit, Materials.UMV, 4),
                setStackSize(GTItemList.Field_Generator_UMV.copy(), 1),

                setStackSize(IngotList.SpaceTime_Ingot.copy(), 32),
                setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 1))
            .fluidInputs(
                requiredFluid("molten.mutatedlivingsolder", 144 * 20),
                requiredFluid("exciteddtsc", 1000 * 8),
                requiredFluid("molten.shirabon", 144 * 20))
            .itemOutputs(setStackSize(HatchList.Energized_Wireless_Dynamo_Hatch.copy(), 1))
            .eut(RECIPE_UMV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Energy hatch and dynamo hatch of LuV - UHV
        {
            // "LuV Dynamo Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#16")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Machine_Hull_LuV.copy(), 1),
                    setStackSize(IngotList.Superconductor_Base_LuV_Ingot.copy(), 1),
                    setStackSize(CircuitList.Ultra_High_Power_IC_Chip.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),

                    setStackSize(GTItemList.Ludicrous_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_LuV.copy(), 1))
                .fluidInputs(requiredFluid("molten.indalloy140", 144 * 5), requiredFluid("ic2coolant", 1000 * 2))
                .itemOutputs(setStackSize(HatchList.Dynamo_Hatch_LuV, 1))
                .eut(RECIPE_LuV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "ZPM Dynamo Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#17")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Machine_Hull_ZPM.copy(), 1),
                    setStackSize(IngotList.Superconductor_Base_ZPM_Ingot.copy(), 1),
                    setStackSize(CircuitList.Nano_Power_IC_Chip.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 2),

                    setStackSize(GTItemList.ZPM_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 1))
                .fluidInputs(requiredFluid("molten.indalloy140", 144 * 10), requiredFluid("ic2coolant", 1000 * 4))
                .itemOutputs(setStackSize(HatchList.Dynamo_Hatch_ZPM, 1))
                .eut(RECIPE_ZPM)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UV Dynamo Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#18")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Machine_Hull_UV.copy(), 1),
                    setStackSize(IngotList.Superconductor_Base_UV_Ingot.copy(), 1),
                    setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 2),

                    setStackSize(GTItemList.Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UV.copy(), 1))
                .fluidInputs(requiredFluid("molten.indalloy140", 144 * 20), requiredFluid("ic2coolant", 1000 * 8))
                .itemOutputs(setStackSize(HatchList.Dynamo_Hatch_UV, 1))
                .eut(RECIPE_UV)
                .duration(40 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UHV Dynamo Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#19")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Machine_Hull_UHV.copy(), 1),
                    setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 1),
                    setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 2),

                    setStackSize(GTItemList.Highly_Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UHV.copy(), 1))
                .fluidInputs(requiredFluid("molten.indalloy140", 144 * 40), requiredFluid("ic2coolant", 1000 * 16))
                .itemOutputs(setStackSize(HatchList.Dynamo_Hatch_UHV, 1))
                .eut(RECIPE_UHV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UEV Dynamo Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#20")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Machine_Hull_UEV.copy(), 1),
                    setStackSize(IngotList.Superconductor_Base_UEV_Ingot.copy(), 1),
                    setStackSize(CircuitList.Femto_Power_IC_Chip.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 2),

                    setStackSize(GTItemList.Extremely_Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UEV.copy(), 1))
                .fluidInputs(
                    requiredFluid("molten.mutatedlivingsolder", 144 * 20),
                    requiredFluid("ic2coolant", 1000 * 32),
                    requiredFluid("ic2uumatter", 1000 * 8))
                .itemOutputs(setStackSize(HatchList.Dynamo_Hatch_UEV, 1))
                .eut(RECIPE_UEV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UIV Dynamo Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#21")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 1),
                    setStackSize(IngotList.Superconductor_Base_UIV_Ingot.copy(), 1),
                    setStackSize(CircuitList.Atto_Power_IC_Chip.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 2),

                    setStackSize(GTItemList.Insanely_Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 1))
                .fluidInputs(
                    requiredFluid("molten.mutatedlivingsolder", 144 * 20),
                    requiredFluid("ic2uumatter", 1000 * 16),
                    requiredFluid("supercoolant", 1000 * 16))
                .itemOutputs(setStackSize(HatchList.Dynamo_Hatch_UIV, 1))
                .eut(RECIPE_UIV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UMV Dynamo Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#22")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Machine_Hull_UMV.copy(), 1),
                    setStackSize(IngotList.Superconductor_Base_UMV_Ingot.copy(), 1),
                    setStackSize(CircuitList.Zepto_Power_IC_Chip.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 2),

                    setStackSize(GTItemList.Mega_Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UMV.copy(), 1))
                .fluidInputs(
                    requiredFluid("molten.mutatedlivingsolder", 144 * 40),
                    requiredFluid("ic2uumatter", 1000 * 32),
                    requiredFluid("supercoolant", 1000 * 32))
                .itemOutputs(setStackSize(HatchList.Dynamo_Hatch_UMV, 1))
                .eut(RECIPE_UMV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UXV Dynamo Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#23")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),
                    setStackSize(IngotList.Superconductor_Base_UMV_Ingot.copy(), 2),
                    setStackSize(CircuitList.Yocto_Power_IC_Chip.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 2),

                    setStackSize(GTItemList.Extended_Mega_Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UXV.copy(), 1))
                .fluidInputs(
                    requiredFluid("molten.mutatedlivingsolder", 144 * 80),
                    requiredFluid("ic2uumatter", 1000 * 64),
                    requiredFluid("supercoolant", 1000 * 64))
                .itemOutputs(setStackSize(HatchList.Dynamo_Hatch_UXV, 1))
                .eut(RECIPE_UXV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "LuV Energy Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#24")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Machine_Hull_LuV.copy(), 1),
                    setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 2),
                    setStackSize(CircuitList.Ultra_High_Power_IC_Chip.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),

                    setStackSize(GTItemList.Ludicrous_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_LuV.copy(), 1))
                .fluidInputs(requiredFluid("molten.indalloy140", 144 * 5), requiredFluid("ic2coolant", 1000 * 2))
                .itemOutputs(setStackSize(HatchList.Energy_Hatch_LuV, 1))
                .eut(RECIPE_LuV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "ZPM Energy Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#25")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Machine_Hull_ZPM.copy(), 1),
                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 4),
                    setStackSize(CircuitList.Nano_Power_IC_Chip.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 2),

                    setStackSize(GTItemList.ZPM_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 1))
                .fluidInputs(requiredFluid("molten.indalloy140", 144 * 10), requiredFluid("ic2coolant", 1000 * 4))
                .itemOutputs(setStackSize(HatchList.Energy_Hatch_ZPM, 1))
                .eut(RECIPE_ZPM)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UV Energy Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#26")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Machine_Hull_UV.copy(), 1),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 4),
                    setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 2),

                    setStackSize(GTItemList.Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UV.copy(), 1))
                .fluidInputs(requiredFluid("molten.indalloy140", 144 * 20), requiredFluid("ic2coolant", 1000 * 8))
                .itemOutputs(setStackSize(HatchList.Energy_Hatch_UV, 1))
                .eut(RECIPE_UV)
                .duration(40 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UHV Energy Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#27")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Machine_Hull_UHV.copy(), 1),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 8),
                    setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 2),

                    setStackSize(GTItemList.Highly_Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UHV.copy(), 1))
                .fluidInputs(requiredFluid("molten.indalloy140", 144 * 40), requiredFluid("ic2coolant", 1000 * 16))
                .itemOutputs(setStackSize(HatchList.Energy_Hatch_UHV, 1))
                .eut(RECIPE_UHV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UEV Energy Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#28")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Machine_Hull_UEV.copy(), 1),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 8),
                    setStackSize(CircuitList.Femto_Power_IC_Chip.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 2),

                    setStackSize(GTItemList.Extremely_Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UEV.copy(), 1))
                .fluidInputs(
                    requiredFluid("molten.mutatedlivingsolder", 144 * 20),
                    requiredFluid("ic2coolant", 1000 * 32),
                    requiredFluid("ic2uumatter", 1000 * 8))
                .itemOutputs(setStackSize(HatchList.Energy_Hatch_UEV, 1))
                .eut(RECIPE_UEV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UIV Energy Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#29")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 1),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 8),
                    setStackSize(CircuitList.Atto_Power_IC_Chip.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 2),

                    setStackSize(GTItemList.Insanely_Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 1))
                .fluidInputs(
                    requiredFluid("molten.mutatedlivingsolder", 144 * 20),
                    requiredFluid("ic2uumatter", 1000 * 16),
                    requiredFluid("supercoolant", 1000 * 16))
                .itemOutputs(setStackSize(HatchList.Energy_Hatch_UIV, 1))
                .eut(RECIPE_UIV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UMV Energy Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#30")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Machine_Hull_UMV.copy(), 1),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 8),
                    setStackSize(CircuitList.Zepto_Power_IC_Chip.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 2),

                    setStackSize(GTItemList.Mega_Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UMV.copy(), 1))
                .fluidInputs(
                    requiredFluid("molten.mutatedlivingsolder", 144 * 40),
                    requiredFluid("ic2uumatter", 1000 * 32),
                    requiredFluid("supercoolant", 1000 * 32))
                .itemOutputs(setStackSize(HatchList.Energy_Hatch_UMV, 1))
                .eut(RECIPE_UMV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UXV Energy Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#31")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 32),
                    setStackSize(CircuitList.Yocto_Power_IC_Chip.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 2),

                    setStackSize(GTItemList.Extended_Mega_Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UXV.copy(), 1))
                .fluidInputs(
                    requiredFluid("molten.mutatedlivingsolder", 144 * 80),
                    requiredFluid("ic2uumatter", 1000 * 64),
                    requiredFluid("supercoolant", 1000 * 64))
                .itemOutputs(setStackSize(HatchList.Energy_Hatch_UXV, 1))
                .eut(RECIPE_UXV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Filtered Beam Output Hatch"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#32")
            .itemInputsUnsafe(
                setStackSize(HatchList.Beam_Output_Hatch.copy(), 1),
                setStackSize(GTItemList.Sensor_UV.copy(), 4),
                setStackSize(GTItemList.Emitter_UV.copy(), 4),
                setStackSize(GTItemList.Activated_Carbon_Filter_Mesh.copy(), 32))
            .fluidInputs(requiredFluid("ic2uumatter", 1000))
            .itemOutputs(setStackSize(HatchList.Filtered_Beam_Output_Hatch, 1))
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Nanite Containment Bus"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#33")
            .itemInputsUnsafe(
                setStackSize(HatchList.Input_Bus_UHV.copy(), 1),
                setStackSize(GTBlockList.Quantum_Chest_IV.copy(), 1),
                setStackSize(GTItemList.Field_Generator_UHV.copy(), 1),
                setStackSize(AmunRaList.Nanite_Control_Module.copy(), 4),

                setStackSize(IngotList.Enriched_Naquadah_Alloy_Ingot.copy(), 36),
                setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 4))
            .fluidInputs(requiredFluid("molten.mutatedlivingsolder", 144 * 16))
            .itemOutputs(setStackSize(HatchList.Nanite_Containment_Bus, 1))
            .eut(RECIPE_UHV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Quantum Uplink ME Connector Hatch"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#34")
            .itemInputsUnsafe(
                setStackSize(HatchList.Optical_Reception_Connector.copy(), 1),
                setStackSize(Appliedenergistics2List.ME_Storage_Component_16384k.copy(), 1),
                setStackSize(AE2FluidCraftingList.ME_Dual_Interface.copy(), 1),
                setStackSize(Appliedenergistics2List.ME_Pattern_Terminal.copy(), 1),

                setStackSize(GTItemList.Robot_Arm_UV.copy(), 1),
                setStackSize(Appliedenergistics2List.Blank_Pattern.copy(), 64),
                getMaterialInput(OrePrefixes.circuit, Materials.UV, 4))
            .fluidInputs(requiredFluid("molten.indalloy140", 144 * 32), requiredFluid("molten.naquadria", 144 * 16))
            .itemOutputs(setStackSize(HatchList.Quantum_Uplink_ME_Connector_Hatch, 1))
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Wireless Assembly Line Reception Connector"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#35")
            .itemInputsUnsafe(
                setStackSize(HatchList.Assembly_line_Reception_Connector.copy(), 1),
                setStackSize(MultiMachineControllerList.Data_Bank.copy(), 1),
                setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 64),
                setStackSize(OpenComputersList.Internet_Card.copy(), 1),

                setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 4),
                setStackSize(IngotList.Infinity_Ingot.copy(), 16),
                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 2),
                setStackSize(GTItemList.Sensor_UEV.copy(), 1))
            .fluidInputs(requiredFluid("molten.mutatedlivingsolder", 144 * 8))
            .itemOutputs(setStackSize(HatchList.Wireless_Assembly_line_Reception_Connector, 1))
            .eut(RECIPE_UEV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Wireless Data Bank Transmission Connector"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#36")
            .itemInputsUnsafe(
                setStackSize(HatchList.Data_Bank_Transmission_Connector.copy(), 1),
                setStackSize(MultiMachineControllerList.Data_Bank.copy(), 1),
                setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 64),
                setStackSize(OpenComputersList.Internet_Card.copy(), 1),

                setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 4),
                setStackSize(IngotList.Infinity_Ingot.copy(), 16),
                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 2),
                setStackSize(GTItemList.Sensor_UEV.copy(), 1))
            .fluidInputs(requiredFluid("molten.mutatedlivingsolder", 144 * 8))
            .itemOutputs(setStackSize(HatchList.Wireless_Data_Bank_Transmission_Connector, 1))
            .eut(RECIPE_UEV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Wireless Energy Hatch
        {
            // 1A Wireless Energy Hatch
            {
                final ItemStack[] Energy_Hatch = new ItemStack[] { HatchList.Energy_Hatch_ULV,
                    HatchList.Energy_Hatch_LV.copy(), HatchList.Energy_Hatch_MV.copy(), HatchList.Energy_Hatch_HV,
                    HatchList.Energy_Hatch_EV.copy(), HatchList.Energy_Hatch_IV.copy(), HatchList.Energy_Hatch_LuV,
                    HatchList.Energy_Hatch_ZPM.copy(), HatchList.Energy_Hatch_UV.copy(), HatchList.Energy_Hatch_UHV,
                    HatchList.Energy_Hatch_UEV.copy(), HatchList.Energy_Hatch_UIV.copy(), HatchList.Energy_Hatch_UMV,
                    HatchList.Energy_Hatch_UXV };

                final ItemStack[] Circuit_List = new ItemStack[] {
                    getMaterialInput(OrePrefixes.circuit, Materials.LV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.MV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.HV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.EV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.IV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.MAX, 4) };

                final ItemStack[] Wireless_Energy_Hatch = new ItemStack[] { HatchList.Wireless_Energy_Hatch_ULV,
                    HatchList.Wireless_Energy_Hatch_LV.copy(), HatchList.Wireless_Energy_Hatch_MV,
                    HatchList.Wireless_Energy_Hatch_HV.copy(), HatchList.Wireless_Energy_Hatch_EV,
                    HatchList.Wireless_Energy_Hatch_IV.copy(), HatchList.Wireless_Energy_Hatch_LuV,
                    HatchList.Wireless_Energy_Hatch_ZPM.copy(), HatchList.Wireless_Energy_Hatch_UV,
                    HatchList.Wireless_Energy_Hatch_UHV.copy(), HatchList.Wireless_Energy_Hatch_UEV,
                    HatchList.Wireless_Energy_Hatch_UIV.copy(), HatchList.Wireless_Energy_Hatch_UMV,
                    HatchList.Wireless_Energy_Hatch_UXV };

                for (int Wireless_Energy_Hatch_Tier = 0; Wireless_Energy_Hatch_Tier
                    < 14; Wireless_Energy_Hatch_Tier++) {
                    ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#37")
                        .itemInputsUnsafe(
                            Energy_Hatch[Wireless_Energy_Hatch_Tier],
                            setStackSize(GoodGeneratorList.Ameliorated_Superconduct_Coil.copy(), 1),
                            setStackSize(MultiMachineCasingList.Superconducting_Coil_Block.copy(), 1),
                            setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 1),

                            setStackSize(TecTechList.High_Power_Casing.copy(), 2),
                            setStackSize(IngotList.SpaceTime_Ingot.copy(), 1),
                            setStackSize(IngotList.Infinity_Ingot.copy(), 9),
                            Circuit_List[Wireless_Energy_Hatch_Tier],

                            setStackSize(GTItemList.Energised_Tesseract.copy(), 1))
                        .fluidInputs(
                            requiredFluid("molten.mutatedlivingsolder", 144 * 9),
                            requiredFluid("exciteddtec", 500))
                        .itemOutputs(Wireless_Energy_Hatch[Wireless_Energy_Hatch_Tier])
                        .eut(RECIPE_UMV)
                        .duration(20 * SECONDS)
                        .addTo(AssemblyLineNormalRecipe);
                }
            }

            // 4A Wireless Energy Hatch
            {
                final ItemStack[] Energy_Hatch = new ItemStack[] { HatchList.Energy_Hatch4_EV,
                    HatchList.Energy_Hatch4_IV.copy(), HatchList.Energy_Hatch4_LuV.copy(), HatchList.Energy_Hatch4_ZPM,
                    HatchList.Energy_Hatch4_UV.copy(), HatchList.Energy_Hatch4_UHV.copy(), HatchList.Energy_Hatch4_UEV,
                    HatchList.Energy_Hatch4_UIV.copy(), HatchList.Energy_Hatch4_UMV.copy(),
                    HatchList.Energy_Hatch4_UXV };

                final ItemStack[] Circuit_List = new ItemStack[] {
                    getMaterialInput(OrePrefixes.circuit, Materials.IV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.MAX, 4) };

                final ItemStack[] Wireless_Energy_Hatch = new ItemStack[] { HatchList.Wireless_Energy_Hatch4_EV,
                    HatchList.Wireless_Energy_Hatch4_IV.copy(), HatchList.Wireless_Energy_Hatch4_LuV,
                    HatchList.Wireless_Energy_Hatch4_ZPM.copy(), HatchList.Wireless_Energy_Hatch4_UV,
                    HatchList.Wireless_Energy_Hatch4_UHV.copy(), HatchList.Wireless_Energy_Hatch4_UEV,
                    HatchList.Wireless_Energy_Hatch4_UIV.copy(), HatchList.Wireless_Energy_Hatch4_UMV,
                    HatchList.Wireless_Energy_Hatch4_UXV };

                for (int Wireless_Energy_Hatch_Tier = 0; Wireless_Energy_Hatch_Tier
                    < 10; Wireless_Energy_Hatch_Tier++) {
                    ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#38")
                        .itemInputsUnsafe(
                            Energy_Hatch[Wireless_Energy_Hatch_Tier],
                            setStackSize(GoodGeneratorList.Compact_Fusion_Coil.copy(), 1),
                            setStackSize(MultiMachineCasingList.Superconducting_Coil_Block.copy(), 1),
                            setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 1),

                            setStackSize(TecTechList.High_Power_Casing.copy(), 4),
                            setStackSize(IngotList.SpaceTime_Ingot.copy(), 2),
                            setStackSize(IngotList.Shirabon_Ingot.copy(), 4),
                            setStackSize(IngotList.Flerovium_Ingot.copy(), 36),

                            Circuit_List[Wireless_Energy_Hatch_Tier],
                            setStackSize(GTItemList.Energised_Tesseract.copy(), 1))
                        .fluidInputs(
                            requiredFluid("molten.mutatedlivingsolder", 144 * 36),
                            requiredFluid("exciteddtec", 1000 * 2))
                        .itemOutputs(Wireless_Energy_Hatch[Wireless_Energy_Hatch_Tier])
                        .eut(RECIPE_UMV)
                        .duration(20 * SECONDS)
                        .addTo(AssemblyLineNormalRecipe);
                }
            }

            // 16A Wireless Energy Hatch
            {
                final ItemStack[] Energy_Hatch = new ItemStack[] { HatchList.Energy_Hatch16_EV,
                    HatchList.Energy_Hatch16_IV.copy(), HatchList.Energy_Hatch16_LuV.copy(),
                    HatchList.Energy_Hatch16_ZPM, HatchList.Energy_Hatch16_UV.copy(),
                    HatchList.Energy_Hatch16_UHV.copy(), HatchList.Energy_Hatch16_UEV,
                    HatchList.Energy_Hatch16_UIV.copy(), HatchList.Energy_Hatch16_UMV.copy(),
                    HatchList.Energy_Hatch16_UXV };

                final ItemStack[] Circuit_List = new ItemStack[] {
                    getMaterialInput(OrePrefixes.circuit, Materials.IV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.MAX, 4) };

                final ItemStack[] Wireless_Energy_Hatch = new ItemStack[] { HatchList.Wireless_Energy_Hatch16_EV,
                    HatchList.Wireless_Energy_Hatch16_IV.copy(), HatchList.Wireless_Energy_Hatch16_LuV,
                    HatchList.Wireless_Energy_Hatch16_ZPM.copy(), HatchList.Wireless_Energy_Hatch16_UV,
                    HatchList.Wireless_Energy_Hatch16_UHV.copy(), HatchList.Wireless_Energy_Hatch16_UEV,
                    HatchList.Wireless_Energy_Hatch16_UIV.copy(), HatchList.Wireless_Energy_Hatch16_UMV,
                    HatchList.Wireless_Energy_Hatch16_UXV };

                for (int Wireless_Energy_Hatch_Tier = 0; Wireless_Energy_Hatch_Tier
                    < 10; Wireless_Energy_Hatch_Tier++) {
                    ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#39")
                        .itemInputsUnsafe(
                            Energy_Hatch[Wireless_Energy_Hatch_Tier],
                            setStackSize(GoodGeneratorList.Advanced_Compact_Fusion_Coil.copy(), 1),
                            setStackSize(MultiMachineCasingList.Superconducting_Coil_Block.copy(), 1),
                            setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 1),

                            setStackSize(TecTechList.High_Power_Casing.copy(), 16),
                            setStackSize(IngotList.SpaceTime_Ingot.copy(), 8),
                            setStackSize(IngotList.Shirabon_Ingot.copy(), 48),
                            setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 36),

                            Circuit_List[Wireless_Energy_Hatch_Tier],
                            setStackSize(GTItemList.Energised_Tesseract.copy(), 1))
                        .fluidInputs(
                            requiredFluid("molten.mutatedlivingsolder", 144 * 144),
                            requiredFluid("exciteddtec", 1000 * 8))
                        .itemOutputs(Wireless_Energy_Hatch[Wireless_Energy_Hatch_Tier])
                        .eut(RECIPE_UMV)
                        .duration(20 * SECONDS)
                        .addTo(AssemblyLineNormalRecipe);
                }
            }

            // 64A Wireless Energy Hatch
            {
                final ItemStack[] Energy_Hatch = new ItemStack[] { HatchList.Energy_Hatch64_EV,
                    HatchList.Energy_Hatch64_IV.copy(), HatchList.Energy_Hatch64_LuV.copy(),
                    HatchList.Energy_Hatch64_ZPM, HatchList.Energy_Hatch64_UV.copy(),
                    HatchList.Energy_Hatch64_UHV.copy(), HatchList.Energy_Hatch64_UEV,
                    HatchList.Energy_Hatch64_UIV.copy(), HatchList.Energy_Hatch64_UMV.copy(),
                    HatchList.Energy_Hatch64_UXV };

                final ItemStack[] Circuit_List = new ItemStack[] {
                    getMaterialInput(OrePrefixes.circuit, Materials.IV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.MAX, 4) };

                final ItemStack[] Wireless_Energy_Hatch = new ItemStack[] { HatchList.Wireless_Energy_Hatch64_EV,
                    HatchList.Wireless_Energy_Hatch64_IV.copy(), HatchList.Wireless_Energy_Hatch64_LuV,
                    HatchList.Wireless_Energy_Hatch64_ZPM.copy(), HatchList.Wireless_Energy_Hatch64_UV,
                    HatchList.Wireless_Energy_Hatch64_UHV.copy(), HatchList.Wireless_Energy_Hatch64_UEV,
                    HatchList.Wireless_Energy_Hatch64_UIV.copy(), HatchList.Wireless_Energy_Hatch64_UMV,
                    HatchList.Wireless_Energy_Hatch64_UXV };

                for (int Wireless_Energy_Hatch_Tier = 0; Wireless_Energy_Hatch_Tier
                    < 10; Wireless_Energy_Hatch_Tier++) {
                    ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#40")
                        .itemInputsUnsafe(
                            Energy_Hatch[Wireless_Energy_Hatch_Tier],
                            setStackSize(GoodGeneratorList.Compact_Fusion_Coil_MKII_Prototype.copy(), 1),
                            setStackSize(MultiMachineCasingList.Superconducting_Coil_Block.copy(), 1),
                            setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 1),

                            setStackSize(TecTechList.High_Power_Casing.copy(), 64),
                            setStackSize(IngotList.SpaceTime_Ingot.copy(), 32),
                            setStackSize(IngotList.Shirabon_Ingot.copy(), 64 * 3),
                            setStackSize(IngotList.Metastable_Oganesson_Ingot.copy(), 36),

                            Circuit_List[Wireless_Energy_Hatch_Tier],
                            setStackSize(GTItemList.Energised_Tesseract.copy(), 1))
                        .fluidInputs(
                            requiredFluid("molten.mutatedlivingsolder", 144 * 64 * 9),
                            requiredFluid("exciteddtec", 1000 * 32))
                        .itemOutputs(Wireless_Energy_Hatch[Wireless_Energy_Hatch_Tier])
                        .eut(RECIPE_UMV)
                        .duration(20 * SECONDS)
                        .addTo(AssemblyLineNormalRecipe);
                }
            }

            // UXV Wireless Energy Hatch
            {
                final ItemStack[] Energy_Hatch = new ItemStack[] { HatchList.Laser_Source_Hatch256_UXV,
                    HatchList.Laser_Source_Hatch1024_UXV.copy(), HatchList.Laser_Source_Hatch4096_UXV,
                    HatchList.Laser_Source_Hatch16384_UXV.copy(), HatchList.Laser_Source_Hatch65536_UXV,
                    HatchList.Laser_Source_Hatch262144_UXV.copy(), HatchList.Laser_Source_Hatch1048576_UXV };

                final ItemStack[] Wireless_Energy_Hatch = new ItemStack[] { HatchList.Wireless_Energy_Hatch256_UXV,
                    HatchList.Wireless_Energy_Hatch1024_UXV.copy(), HatchList.Wireless_Energy_Hatch4096_UXV,
                    HatchList.Wireless_Energy_Hatch16384_UXV.copy(), HatchList.Wireless_Energy_Hatch65536_UXV,
                    HatchList.Wireless_Energy_Hatch262144_UXV.copy(), HatchList.Wireless_Energy_Hatch1048576_UXV };

                for (int Wireless_Energy_Hatch_Tier = 0; Wireless_Energy_Hatch_Tier < 7; Wireless_Energy_Hatch_Tier++) {
                    ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#41")
                        .itemInputsUnsafe(
                            Energy_Hatch[Wireless_Energy_Hatch_Tier],
                            setStackSize(GoodGeneratorList.Compact_Fusion_Coil_MKII_Finaltype.copy(), 1),
                            setStackSize(
                                GTNHIntergalacticList.Dyson_Swarm_Module_Deployment_Unit_Superconducting_Magnet,
                                1),
                            setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 1),

                            setStackSize(TecTechList.High_Power_Casing.copy(), 64),
                            setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 8),
                            setStackSize(IngotList.Eternity_Ingot.copy(), 64 * 4 + 32),
                            setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot, 64 * 2 + 16),

                            getMaterialInput(OrePrefixes.circuit, Materials.MAX, 8),
                            setStackSize(GTItemList.Energised_Tesseract.copy(), 1))
                        .fluidInputs(
                            requiredFluid("molten.mutatedlivingsolder", 144 * 64 * 36),
                            requiredFluid("exciteddtsc", 1000 * 32))
                        .itemOutputs(Wireless_Energy_Hatch[Wireless_Energy_Hatch_Tier])
                        .eut(RECIPE_UMV)
                        .duration(20 * SECONDS)
                        .addTo(AssemblyLineNormalRecipe);
                }
            }
        }

        // Special Laser Hatch
        {
            // "UMV 4,194,304A/t Laser Source Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#42")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Machine_Hull_UMV.copy(), 1),
                    setStackSize(GTItemList.Diamond_Lens.copy(), 64 * 2),
                    setStackSize(GTItemList.Emitter_UMV.copy(), 64 * 2),
                    setStackSize(GTItemList.Electric_Pump_UMV.copy(), 64 * 2),

                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 4))
                .fluidInputs(requiredFluid("molten.mutatedlivingsolder", 144 * 64 * 36))
                .itemOutputs(setStackSize(HatchList.Laser_Source_Hatch4194304_UMV, 1))
                .eut(RECIPE_UMV)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UXV 4,194,304A/t Laser Source Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#43")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),
                    setStackSize(GTItemList.Diamond_Lens.copy(), 64 * 2),
                    setStackSize(GTItemList.Emitter_UXV.copy(), 64 * 2),
                    setStackSize(GTItemList.Electric_Pump_UXV.copy(), 64 * 2),

                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 64 * 4))
                .fluidInputs(requiredFluid("molten.mutatedlivingsolder", 144 * 64 * 36))
                .itemOutputs(setStackSize(HatchList.Laser_Source_Hatch4194304_UXV, 1))
                .eut(RECIPE_UXV)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UXV 16,777,216A/t Laser Source Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#44")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),
                    setStackSize(GTItemList.Diamond_Lens.copy(), 64 * 4),
                    setStackSize(GTItemList.Emitter_UXV.copy(), 64 * 4),
                    setStackSize(GTItemList.Electric_Pump_UXV.copy(), 64 * 4),

                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 64 * 8))
                .fluidInputs(requiredFluid("molten.mutatedlivingsolder", 144 * 64 * 72))
                .itemOutputs(setStackSize(HatchList.Laser_Source_Hatch1677216_UXV, 1))
                .eut(RECIPE_UXV)
                .duration(110 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Legendary Laser Source Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#45")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(3),

                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),
                    setStackSize(GTItemList.Diamond_Lens.copy(), 64 * 8),
                    setStackSize(GTItemList.Emitter_UXV.copy(), 64 * 8),
                    setStackSize(GTItemList.Electric_Pump_UXV.copy(), 64 * 8),

                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 64 * 16))
                .fluidInputs(requiredFluid("molten.mutatedlivingsolder", 144 * 64 * 144))
                .itemOutputs(setStackSize(HatchList.Laser_Source_Hatch_Legendary, 1))
                .eut(RECIPE_UXV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UMV 4,194,304A/t Laser Target Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#46")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Machine_Hull_UMV.copy(), 1),
                    setStackSize(GTItemList.Diamond_Lens.copy(), 64 * 2),
                    setStackSize(GTItemList.Sensor_UMV.copy(), 64 * 2),
                    setStackSize(GTItemList.Electric_Pump_UMV.copy(), 64 * 2),

                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 4))
                .fluidInputs(requiredFluid("molten.mutatedlivingsolder", 144 * 64 * 36))
                .itemOutputs(setStackSize(HatchList.Laser_Target_Hatch4194304_UMV, 1))
                .eut(RECIPE_UMV)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UXV 4,194,304A/t Laser Target Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#47")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),
                    setStackSize(GTItemList.Diamond_Lens.copy(), 64 * 2),
                    setStackSize(GTItemList.Sensor_UXV.copy(), 64 * 2),
                    setStackSize(GTItemList.Electric_Pump_UXV.copy(), 64 * 2),

                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 64 * 4))
                .fluidInputs(requiredFluid("molten.mutatedlivingsolder", 144 * 64 * 36))
                .itemOutputs(setStackSize(HatchList.Laser_Target_Hatch4194304_UXV, 1))
                .eut(RECIPE_UXV)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UXV 16,777,216A/t Laser Target Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#48")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),
                    setStackSize(GTItemList.Diamond_Lens.copy(), 64 * 4),
                    setStackSize(GTItemList.Sensor_UXV.copy(), 64 * 4),
                    setStackSize(GTItemList.Electric_Pump_UXV.copy(), 64 * 4),

                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 64 * 8))
                .fluidInputs(requiredFluid("molten.mutatedlivingsolder", 144 * 64 * 72))
                .itemOutputs(setStackSize(HatchList.Laser_Target_Hatch1677216_UXV, 1))
                .eut(RECIPE_UXV)
                .duration(110 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Legendary Laser Target Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#49")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(3),

                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),
                    setStackSize(GTItemList.Diamond_Lens.copy(), 64 * 8),
                    setStackSize(GTItemList.Sensor_UXV.copy(), 64 * 8),
                    setStackSize(GTItemList.Electric_Pump_UXV.copy(), 64 * 8),

                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 64 * 16))
                .fluidInputs(requiredFluid("molten.mutatedlivingsolder", 144 * 64 * 144))
                .itemOutputs(setStackSize(HatchList.Laser_Target_Hatch_Legendary, 1))
                .eut(RECIPE_UXV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // ME Bus/Hatch
        {
            // "Advanced Stocking Input Bus (ME)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#50")
                .itemInputsUnsafe(
                    setStackSize(HatchList.Input_Bus_LuV.copy(), 1),
                    setStackSize(Appliedenergistics2List.ME_Interface.copy(), 1),
                    setStackSize(GTItemList.Conveyor_Module_IV.copy(), 1),
                    setStackSize(Appliedenergistics2List.Acceleration_Card.copy(), 4))
                .fluidInputs(requiredFluid("molten.indalloy140", 144 * 2), requiredFluid("lubricant", 500))
                .itemOutputs(setStackSize(HatchList.Advanced_Stocking_Input_Bus_ME, 1))
                .eut(RECIPE_LuV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Crafting Input Bus (ME)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#51")
                .itemInputsUnsafe(
                    setStackSize(HatchList.Stocking_Input_Bus_ME.copy(), 1),
                    setStackSize(Appliedenergistics2List.ME_Storage_Component_4096k.copy(), 1),
                    setStackSize(Appliedenergistics2List.ME_Controller.copy(), 1),
                    setStackSize(Appliedenergistics2List.ME_Interface_Terminal.copy(), 1),
                    setStackSize(Appliedenergistics2List.Pattern_Capacity_Card.copy(), 3))
                .fluidInputs(requiredFluid("molten.indalloy140", 144 * 8))
                .itemOutputs(setStackSize(HatchList.Crafting_Input_Bus_ME, 1))
                .eut(RECIPE_LuV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Neutron Accelerator
        {
            // "Neutron Accelerator LuV"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#52")
                .itemInputsUnsafe(
                    setStackSize(GoodGeneratorList.Inverter.copy(), 2),
                    setStackSize(GTBlockList.Machine_Hull_LuV.copy(), 1),
                    setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 16),
                    setStackSize(GemList.Nether_Star.copy(), 1),

                    setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 4),
                    setStackSize(IngotList.Magnetic_Neodymium_Ingot.copy(), 8),
                    setStackSize(GTItemList.Electric_Motor_LuV.copy(), 2))
                .fluidInputs(requiredFluid("argon", 1000 * 3))
                .itemOutputs(setStackSize(HatchList.Neutron_Accelerator_LuV, 1))
                .eut(RECIPE_LuV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Neutron Accelerator ZPM"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#53")
                .itemInputsUnsafe(
                    setStackSize(GoodGeneratorList.Inverter.copy(), 2),
                    setStackSize(GTBlockList.Machine_Hull_ZPM.copy(), 1),
                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 16),
                    setStackSize(GemList.Nether_Star.copy(), 1),

                    setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 8),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 8),
                    setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 2))
                .fluidInputs(requiredFluid("xenon", 1000 * 3))
                .itemOutputs(setStackSize(HatchList.Neutron_Accelerator_ZPM, 1))
                .eut(RECIPE_ZPM)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Neutron Accelerator UV"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#54")
                .itemInputsUnsafe(
                    setStackSize(GoodGeneratorList.Inverter.copy(), 4),
                    setStackSize(GTBlockList.Machine_Hull_UV.copy(), 1),
                    setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 16),
                    setStackSize(GemList.Nether_Star.copy(), 2),

                    setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 12),
                    setStackSize(GTItemList.ZPM_Voltage_Coil.copy(), 8),
                    setStackSize(IngotList.Nickel_Zinc_Ferrite_Ingot.copy(), 16),
                    setStackSize(GTItemList.Electric_Motor_UV.copy(), 2))
                .fluidInputs(requiredFluid("oganesson", 1000 * 3))
                .itemOutputs(setStackSize(HatchList.Neutron_Accelerator_UV, 1))
                .eut(RECIPE_UV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Neutron Accelerator UHV"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#55")
                .itemInputsUnsafe(
                    setStackSize(GoodGeneratorList.Inverter.copy(), 8),
                    setStackSize(GTBlockList.Machine_Hull_UHV.copy(), 1),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 16),
                    setStackSize(GemList.Orundum.copy(), 2),

                    setStackSize(IngotList.Kevlar_Ingot.copy(), 24),
                    setStackSize(GTItemList.Ultimate_Voltage_Coil.copy(), 8),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 16),
                    setStackSize(GTItemList.Electric_Motor_UHV.copy(), 2))
                .fluidInputs(requiredFluid("oganesson", 1000 * 12), requiredFluid("grade5purifiedwater", 1000 * 16))
                .itemOutputs(setStackSize(HatchList.Neutron_Accelerator_UHV, 1))
                .eut(RECIPE_UHV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Neutron Accelerator UEV"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#56")
                .itemInputsUnsafe(
                    setStackSize(GoodGeneratorList.Inverter.copy(), 16),
                    setStackSize(GTBlockList.Machine_Hull_UEV.copy(), 1),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 16),
                    setStackSize(GemList.Orundum.copy(), 8),

                    setStackSize(IngotList.Kevlar_Ingot.copy(), 64 * 2 + 16),
                    setStackSize(GTItemList.Highly_Ultimate_Voltage_Coil.copy(), 8),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 16),
                    setStackSize(GTItemList.Electric_Motor_UEV.copy(), 2))
                .fluidInputs(
                    requiredFluid("molten.metastable oganesson", 144 * 3),
                    requiredFluid("grade6purifiedwater", 1000 * 16))
                .itemOutputs(setStackSize(HatchList.Neutron_Accelerator_UEV, 1))
                .eut(RECIPE_UEV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Neutron Accelerator UIV"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#57")
                .itemInputsUnsafe(
                    setStackSize(GoodGeneratorList.Inverter.copy(), 32),
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 1),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 16),
                    setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 8),

                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 32),
                    setStackSize(GTItemList.Extremely_Ultimate_Voltage_Coil.copy(), 8),
                    setStackSize(GTItemList.Raw_Tesseract.copy(), 8),
                    setStackSize(GTItemList.Tengam_Electromagnet.copy(), 1),

                    setStackSize(GTItemList.Electric_Motor_UIV.copy(), 2),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 16))
                .fluidInputs(
                    requiredFluid("molten.metastable oganesson", 144 * 12),
                    requiredFluid("dimensionallyshiftedsuperfluid", 1000 * 4),
                    requiredFluid("grade7purifiedwater", 1000 * 16))
                .itemOutputs(setStackSize(HatchList.Neutron_Accelerator_UIV, 1))
                .eut(RECIPE_UIV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Neutron Accelerator UMV"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#58")
                .itemInputsUnsafe(
                    setStackSize(GoodGeneratorList.Inverter.copy(), 64),
                    setStackSize(GTBlockList.Machine_Hull_UMV.copy(), 1),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 16),
                    setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 32),

                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 64),
                    setStackSize(GTItemList.Insanely_Ultimate_Voltage_Coil.copy(), 8),
                    setStackSize(GTItemList.Energised_Tesseract.copy(), 12),
                    setStackSize(GTItemList.Tengam_Electromagnet.copy(), 1),

                    setStackSize(GTItemList.Electric_Motor_UMV.copy(), 2),
                    setStackSize(IngotList.Creon_Ingot.copy(), 16),
                    setStackSize(IngotList.Mellion_Ingot.copy(), 16))
                .fluidInputs(
                    requiredFluid("molten.shirabon", 144 * 3),
                    requiredFluid("dimensionallyshiftedsuperfluid", 1000 * 8),
                    requiredFluid("grade8purifiedwater", 1000 * 16))
                .itemOutputs(setStackSize(HatchList.Neutron_Accelerator_UMV, 1))
                .eut(RECIPE_UMV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Object Holder"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#59")
            .itemInputsUnsafe(
                setStackSize(HatchList.Input_Bus_ZPM.copy(), 1),
                setStackSize(TecTechList.Advanced_Computer_Casing.copy(), 1),
                setStackSize(GTItemList.Emitter_ZPM.copy(), 8),
                setStackSize(GTItemList.Robot_Arm_ZPM.copy(), 1),

                setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 2),
                getMaterialInput(OrePrefixes.circuit, Materials.UV, 1),
                setStackSize(IngotList.Naquadah_Ingot.copy(), 2),
                setStackSize(IngotList.Naquadah_Ingot.copy(), 2),

                setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 2))
            .fluidInputs(
                requiredFluid("ic2uumatter", 500),
                requiredFluid("molten.iridium", 144 * 8),
                requiredFluid("ic2coolant", 1000))
            .itemOutputs(setStackSize(HatchList.Object_Holder, 1))
            .eut(RECIPE_UV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Turbine Housing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#60")
            .itemInputsUnsafe(
                setStackSize(GTBlockList.Machine_Hull_UV.copy(), 4),
                setStackSize(GTItemList.Conveyor_Module_UV.copy(), 24),
                setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 32),
                setStackSize(GTItemList.Electric_Piston_ZPM.copy(), 16),

                setStackSize(GTPPList.Energy_Core_LuV.copy(), 8),
                setStackSize(IngotList.Advanced_Nitinol_Ingot.copy(), 24),
                setStackSize(IngotList.Titansteel_Ingot.copy(), 6),
                setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 4),

                setStackSize(IngotList.Zeron_100_Ingot.copy(), 6),
                getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 20),
                setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 64 + 16))
            .fluidInputs(
                requiredFluid("molten.advancednitinol", 144 * 32),
                requiredFluid("molten.cinobitea243", 144 * 16),
                requiredFluid("molten.arceusalloy2b", 144 * 16),
                requiredFluid("molten.babbitalloy", 144 * 64 * 2))
            .itemOutputs(setStackSize(HatchList.Turbine_Housing.copy(), 4))
            .eut(RECIPE_UV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);
    }
}
