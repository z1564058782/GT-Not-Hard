package Recipes.ChaosRecipes.ChaosOfAssemblyLine;

import static Recipes.ChaosRecipes.ChaosRecipeMap.AssemblyLineItemRecipe;
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
                requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 33),
                requiredFluid(FluidList.IC2_Coolant, 1000 * 64),
                requiredFluid(FluidList.Lubricant, 1000 * (64 + 32)),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 12 + 24)),
                requiredFluid(FluidList.Protomatter, 250),
                requiredFluid(GasList.Radon, 1000 * (64 * 8 + 20)))
            .itemOutputs(setStackSize(HatchList.Antimatter_Hatch.copy(), 1))
            .eut(RECIPE_UIV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

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
            .fluidInputs(requiredFluid(FluidList.Lubricant, 1000 * (64 * 4 + 22) + 500))
            .itemOutputs(setStackSize(HatchList.Auto_Taping_Maintenance_Hatch.copy(), 1))
            .eut(RECIPE_UV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

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
                requiredFluid(GasList.Argon, 1000),
                requiredFluid(GasList.Helium, 1000 * 2),
                requiredFluid(FluidList.Lubricant, 500))
            .itemOutputs(setStackSize(HatchList.Beam_Input_Hatch.copy(), 1))
            .eut(RECIPE_LuV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

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
                requiredFluid(GasList.Argon, 1000),
                requiredFluid(GasList.Helium, 1000 * 6),
                requiredFluid(FluidList.Lubricant, 1000 * 2))
            .itemOutputs(setStackSize(HatchList.Beam_Output_Hatch.copy(), 1))
            .eut(RECIPE_LuV)
            .duration(240 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

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
                    requiredFluid(GasList.Argon, 1000 * 2),
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 16),
                    requiredFluid(GasList.Helium, 1000 * 8),
                    requiredFluid(FluidList.Lubricant, 1000 * 2 + 500),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 9 + 8)))
                .itemOutputs(setStackSize(HatchList.Bose_Einstein_Condensate_Hatch.copy(), 1))
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

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
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 4),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 8 + 36)))
                .itemOutputs(setStackSize(HatchList.Nanite_Tier_Detector_Hatch.copy(), 1))
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

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
                    requiredFluid(GasList.Argon, 1000 * 2),
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 20),
                    requiredFluid(GasList.Helium, 1000 * 8),
                    requiredFluid(FluidList.Lubricant, 1000 * 2 + 500),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 25 + 44)))
                .itemOutputs(setStackSize(HatchList.Bose_Einstein_Condensate_Detector_Hatch.copy(), 1))
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

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
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 12),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 8 + 54)))
                .itemOutputs(setStackSize(HatchList.Line_Of_Sight_Connector_Hatch.copy(), 1))
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

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
                .fluidInputs(requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 8))
                .itemOutputs(setStackSize(HatchList.Teleportation_Node_Controller_Hatch.copy(), 1))
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
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
                requiredFluid(FluidList.Lubricant, 1000 * (64 + 4)),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 4 + 24)),
                requiredFluid(GasList.Radon, 1000 * (64 * 2 + 2) + 500))
            .itemOutputs(setStackSize(HatchList.Bulk_Catalyst_Housing.copy(), 1))
            .eut(RECIPE_UEV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

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
            .fluidInputs(
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 9),
                requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 500))
            .itemOutputs(setStackSize(HatchList.Cloud_Computation_Client_Hatch.copy(), 1))
            .eut(RECIPE_UMV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

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
            .fluidInputs(
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 9),
                requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 500))
            .itemOutputs(setStackSize(HatchList.Cloud_Computation_Server_Hatch.copy(), 1))
            .eut(RECIPE_UMV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Crafting Input Bus (ME)"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#13")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(HatchList.Crafting_Input_Bus_ME.copy(), 0),

                setStackSize(Appliedenergistics2List.ME_Controller.copy(), 1),
                setStackSize(Appliedenergistics2List.ME_Interface.copy(), 1),
                setStackSize(Appliedenergistics2List.ME_Storage_Component_4096k.copy(), 1),
                setStackSize(Appliedenergistics2List.Pattern_Capacity_Card.copy(), 3),

                setStackSize(HatchList.Stocking_Input_Bus_ME.copy(), 1),

                setStackSize(IngotList.Indalloy_140_Ingot.copy(), 8))
            .itemOutputs(setStackSize(HatchList.Crafting_Input_Bus_ME.copy(), 1))
            .eut(RECIPE_LuV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Data Orb Repository"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#14")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(HatchList.Data_Orb_Repository.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 32),

                setStackSize(GTItemList.Data_Orb.copy(), 32),
                setStackSize(GTItemList.Field_Generator_EV.copy(), 4),

                setStackSize(GTPPList.Energy_Core_EV.copy(), 2),
                setStackSize(GTPPList.Integral_Framework_III.copy(), 2),

                setStackSize(IngotList.Arcanite_Ingot.copy(), 8),
                setStackSize(IngotList.Babbit_Alloy_Ingot.copy(), 64),
                setStackSize(IngotList.Energy_Crystal_Ingot.copy(), 8),
                setStackSize(IngotList.Inconel_625_Ingot.copy(), 8),
                setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 8),
                setStackSize(IngotList.Trinium_Naquadah_Carbonite_Ingot.copy(), 2),

                setStackSize(IngotList.Zeron_100_Ingot.copy(), 18))
            .itemOutputs(setStackSize(HatchList.Data_Orb_Repository.copy(), 1))
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Energized Wireless Dynamo Hatch"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#15")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(HatchList.Energized_Wireless_Dynamo_Hatch.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.UXV, 4),
                getMaterialInput(OrePrefixes.circuit, Materials.UMV, 20),
                getMaterialInput(OrePrefixes.circuit, Materials.UEV, 12),
                getMaterialInput(OrePrefixes.circuit, Materials.UHV, 32),

                setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64),
                setStackSize(CircuitList.ASoC_Wafer.copy(), 32),
                setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 16),
                setStackSize(CircuitList.UHPIC_Wafer.copy(), 64 * 2),

                setStackSize(GemList.Nether_Star.copy(), 64 * 11 + 8),

                setStackSize(HatchList.Laser_Source_Hatch65536_UMV.copy(), 1),

                setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 64),
                setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 2),
                setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 2 + 48),
                setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 + 36),
                setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 2 + 24),
                setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 8),

                setStackSize(IngotList.Hypogen_Ingot.copy(), 64 * 5 + 36),
                setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 5 + 4),
                setStackSize(IngotList.Infinity_Ingot.copy(), 40),
                setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 32),
                setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 6 + 4),
                setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 14 + 16),

                setStackSize(IngotList.Quantium_Ingot.copy(), 64 + 24),
                setStackSize(IngotList.Quantum_Ingot.copy(), 64),
                setStackSize(IngotList.Shirabon_Ingot.copy(), 20),
                setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 2 + 40),
                setStackSize(IngotList.Titansteel_Ingot.copy(), 64),

                setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 1),

                setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 2))
            .fluidInputs(
                requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 16),
                requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Stellar_Catalyst, 1000 * 8),
                requiredFluid(FluidList.IC2_Coolant, 1000 * 32),
                requiredFluid(FluidList.Lubricant, 1000 * 32),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 3 + 22)),
                requiredFluid(GasList.Radon, 1000 * (64 + 26)))
            .itemOutputs(setStackSize(HatchList.Energized_Wireless_Dynamo_Hatch.copy(), 1))
            .eut(RECIPE_UMV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // Energy hatch and dynamo hatch of LuV - UHV
        {
            // "LuV Dynamo Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#16")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Dynamo_Hatch_LuV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),

                    setStackSize(CircuitList.Ultra_High_Power_IC_Chip.copy(), 2),

                    setStackSize(GTBlockList.Machine_Hull_LuV.copy(), 1),

                    setStackSize(GTItemList.Ludicrous_Voltage_Coil.copy(), 2),

                    setStackSize(IngotList.HSSS_Ingot.copy(), 15),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 7),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 1),
                    setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 2),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 16),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 1),

                    setStackSize(IngotList.Superconductor_Base_LuV_Ingot.copy(), 1),
                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 2))
                .fluidInputs(requiredFluid(FluidList.IC2_Coolant, 1000 * 2), requiredFluid(FluidList.Lubricant, 500))
                .itemOutputs(setStackSize(HatchList.Dynamo_Hatch_LuV.copy(), 1))
                .eut(RECIPE_LuV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "ZPM Dynamo Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#17")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Dynamo_Hatch_ZPM.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 2),

                    setStackSize(CircuitList.Nano_Power_IC_Chip.copy(), 2),

                    setStackSize(GTBlockList.Machine_Hull_ZPM.copy(), 1),

                    setStackSize(GTItemList.ZPM_Voltage_Coil.copy(), 2),

                    setStackSize(IngotList.Enderium_Ingot.copy(), 6),
                    setStackSize(IngotList.Europium_Ingot.copy(), 24),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 14),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 1),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 20),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 2),

                    setStackSize(IngotList.Superconductor_Base_ZPM_Ingot.copy(), 1),
                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 8))
                .fluidInputs(
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 4),
                    requiredFluid(FluidList.Lubricant, 1000 + 500))
                .itemOutputs(setStackSize(HatchList.Dynamo_Hatch_ZPM.copy(), 1))
                .eut(RECIPE_ZPM)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "UV Dynamo Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#18")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Dynamo_Hatch_UV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 2),

                    setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 2),

                    setStackSize(GTBlockList.Machine_Hull_UV.copy(), 1),

                    setStackSize(GTItemList.Ultimate_Voltage_Coil.copy(), 2),

                    setStackSize(IngotList.Americium_Ingot.copy(), 48),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 38),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 2),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 8),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 12),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 18),

                    setStackSize(IngotList.Neutronium_Ingot.copy(), 22),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 4),
                    setStackSize(IngotList.Superconductor_Base_UV_Ingot.copy(), 1))
                .fluidInputs(
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 8),
                    requiredFluid(FluidList.Lubricant, 1000 * 4))
                .itemOutputs(setStackSize(HatchList.Dynamo_Hatch_UV.copy(), 1))
                .eut(RECIPE_UV)
                .duration(40 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "UHV Dynamo Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#19")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Dynamo_Hatch_UHV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 2),

                    setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 2),

                    setStackSize(GTBlockList.Machine_Hull_UHV.copy(), 1),

                    setStackSize(GTItemList.Highly_Ultimate_Voltage_Coil.copy(), 2),

                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 8),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 36),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 15),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 4),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 39),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 + 12),

                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 8),
                    setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 1))
                .fluidInputs(
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 16),
                    requiredFluid(FluidList.Lubricant, 1000 * 8))
                .itemOutputs(setStackSize(HatchList.Dynamo_Hatch_UHV.copy(), 1))
                .eut(RECIPE_UHV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "UEV Dynamo Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#20")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Dynamo_Hatch_UEV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 2),

                    setStackSize(CircuitList.Femto_Power_IC_Chip.copy(), 2),

                    setStackSize(GemList.Nether_Star.copy(), 12),

                    setStackSize(GTBlockList.Machine_Hull_UEV.copy(), 1),

                    setStackSize(GTItemList.Extremely_Ultimate_Voltage_Coil.copy(), 2),

                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 8),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 8),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 50),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 39),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 16),

                    setStackSize(IngotList.Superconductor_Base_UEV_Ingot.copy(), 1))
                .fluidInputs(
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 32),
                    requiredFluid(FluidList.Lubricant, 1000 * 8),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 56),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8))
                .itemOutputs(setStackSize(HatchList.Dynamo_Hatch_UEV.copy(), 1))
                .eut(RECIPE_UEV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "UIV Dynamo Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#21")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Dynamo_Hatch_UIV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 2),

                    setStackSize(CircuitList.Atto_Power_IC_Chip.copy(), 2),

                    setStackSize(GemList.Nether_Star.copy(), 8),

                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 1),

                    setStackSize(GTItemList.Insanely_Ultimate_Voltage_Coil.copy(), 2),

                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 16),
                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 12),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 8),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 16),
                    setStackSize(IngotList.Superconductor_Base_UIV_Ingot.copy(), 1),

                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 48))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 8),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 56),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 16),
                    requiredFluid(FluidList.UU_Matter, 1000 * 16))
                .itemOutputs(setStackSize(HatchList.Dynamo_Hatch_UIV.copy(), 1))
                .eut(RECIPE_UIV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "UMV Dynamo Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#22")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Dynamo_Hatch_UMV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 2),

                    setStackSize(CircuitList.Zepto_Power_IC_Chip.copy(), 2),

                    setStackSize(GTBlockList.Machine_Hull_UMV.copy(), 1),

                    setStackSize(GTItemList.Mega_Ultimate_Voltage_Coil.copy(), 2),

                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 32),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 8),
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 12),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 8),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 16),

                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 48),
                    setStackSize(IngotList.Superconductor_Base_UMV_Ingot.copy(), 1))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 8),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 + 12)),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 32),
                    requiredFluid(FluidList.UU_Matter, 1000 * 32))
                .itemOutputs(setStackSize(HatchList.Dynamo_Hatch_UMV.copy(), 1))
                .eut(RECIPE_UMV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "UXV Dynamo Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#23")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Dynamo_Hatch_UXV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 2),

                    setStackSize(CircuitList.Yocto_Power_IC_Chip.copy(), 2),

                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),

                    setStackSize(GTItemList.Energised_Tesseract.copy(), 1),
                    setStackSize(GTItemList.Extended_Mega_Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Neutronium_Nanites.copy(), 8),

                    setStackSize(IngotList.Kevlar_Ingot.copy(), 16),
                    setStackSize(IngotList.Magmatter_Ingot.copy(), 36),
                    setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 16),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 36),
                    setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 16),

                    setStackSize(IngotList.Superconductor_Base_UMV_Ingot.copy(), 2),
                    setStackSize(IngotList.Universium_Ingot.copy(), 52))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 16),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 80),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 64),
                    requiredFluid(FluidList.UU_Matter, 1000 * 64))
                .itemOutputs(setStackSize(HatchList.Dynamo_Hatch_UXV.copy(), 1))
                .eut(RECIPE_UXV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "LuV Energy Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#24")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Energy_Hatch_LuV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),

                    setStackSize(CircuitList.Ultra_High_Power_IC_Chip.copy(), 2),

                    setStackSize(GTBlockList.Machine_Hull_LuV.copy(), 1),

                    setStackSize(GTItemList.Ludicrous_Voltage_Coil.copy(), 2),

                    setStackSize(IngotList.HSSS_Ingot.copy(), 15),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 7),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 1),
                    setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 2),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 16),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 1),

                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 2),

                    setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 2))
                .fluidInputs(requiredFluid(FluidList.IC2_Coolant, 1000 * 2), requiredFluid(FluidList.Lubricant, 500))
                .itemOutputs(setStackSize(HatchList.Energy_Hatch_LuV.copy(), 1))
                .eut(RECIPE_LuV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "ZPM Energy Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#25")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Energy_Hatch_ZPM.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 2),

                    setStackSize(CircuitList.Nano_Power_IC_Chip.copy(), 2),

                    setStackSize(GTBlockList.Machine_Hull_ZPM.copy(), 1),

                    setStackSize(GTItemList.ZPM_Voltage_Coil.copy(), 2),

                    setStackSize(IngotList.Enderium_Ingot.copy(), 6),
                    setStackSize(IngotList.Europium_Ingot.copy(), 24),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 14),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 1),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 20),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 2),

                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 8),

                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 4))
                .fluidInputs(
                    requiredFluid(FluidList.Lubricant, 1000 + 500),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 4))
                .itemOutputs(setStackSize(HatchList.Energy_Hatch_ZPM.copy(), 1))
                .eut(RECIPE_ZPM)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "UV Energy Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#26")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Energy_Hatch_UV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 2),

                    setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 2),

                    setStackSize(GTBlockList.Machine_Hull_UV.copy(), 1),

                    setStackSize(GTItemList.Ultimate_Voltage_Coil.copy(), 2),

                    setStackSize(IngotList.Americium_Ingot.copy(), 48),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 38),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 2),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 8),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 12),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 18),

                    setStackSize(IngotList.Neutronium_Ingot.copy(), 22),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 4),

                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 4))
                .fluidInputs(
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 8),
                    requiredFluid(FluidList.Lubricant, 1000 * 4))
                .itemOutputs(setStackSize(HatchList.Energy_Hatch_UV.copy(), 1))
                .eut(RECIPE_UV)
                .duration(40 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "UHV Energy Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#27")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Energy_Hatch_UHV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 2),

                    setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 2),

                    setStackSize(GTBlockList.Machine_Hull_UHV.copy(), 1),

                    setStackSize(GTItemList.Highly_Ultimate_Voltage_Coil.copy(), 2),

                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 8),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 36),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 15),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 4),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 39),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 + 12),

                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 8),

                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 8))
                .fluidInputs(
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 16),
                    requiredFluid(FluidList.Lubricant, 1000 * 8))
                .itemOutputs(setStackSize(HatchList.Energy_Hatch_UHV.copy(), 1))
                .eut(RECIPE_UHV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "UEV Energy Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#28")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Energy_Hatch_UEV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 2),

                    setStackSize(CircuitList.Femto_Power_IC_Chip.copy(), 2),

                    setStackSize(GemList.Nether_Star.copy(), 12),

                    setStackSize(GTBlockList.Machine_Hull_UEV.copy(), 1),

                    setStackSize(GTItemList.Extremely_Ultimate_Voltage_Coil.copy(), 2),

                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 8),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 8),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 50),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 39),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 16),

                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 8))
                .fluidInputs(
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 32),
                    requiredFluid(FluidList.Lubricant, 1000 * 8),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 56),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8))
                .itemOutputs(setStackSize(HatchList.Energy_Hatch_UEV.copy(), 1))
                .eut(RECIPE_UEV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "UIV Energy Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#29")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Energy_Hatch_UIV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 2),

                    setStackSize(CircuitList.Atto_Power_IC_Chip.copy(), 2),

                    setStackSize(GemList.Nether_Star.copy(), 8),

                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 1),

                    setStackSize(GTItemList.Insanely_Ultimate_Voltage_Coil.copy(), 2),

                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 16),
                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 12),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 8),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 16),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 48),

                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 8))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 8),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 56),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 16),
                    requiredFluid(FluidList.UU_Matter, 1000 * 16))
                .itemOutputs(setStackSize(HatchList.Energy_Hatch_UIV.copy(), 1))
                .eut(RECIPE_UIV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "UMV Energy Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#30")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Energy_Hatch_UMV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 2),

                    setStackSize(CircuitList.Zepto_Power_IC_Chip.copy(), 2),

                    setStackSize(GTBlockList.Machine_Hull_UMV.copy(), 1),

                    setStackSize(GTItemList.Mega_Ultimate_Voltage_Coil.copy(), 2),

                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 32),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 8),
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 12),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 8),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 16),

                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 48),

                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 8))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 8),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 + 12)),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 32),
                    requiredFluid(FluidList.UU_Matter, 1000 * 32))
                .itemOutputs(setStackSize(HatchList.Energy_Hatch_UMV.copy(), 1))
                .eut(RECIPE_UMV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "UXV Energy Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#31")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Energy_Hatch_UXV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 2),

                    setStackSize(CircuitList.Yocto_Power_IC_Chip.copy(), 2),

                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),

                    setStackSize(GTItemList.Energised_Tesseract.copy(), 1),
                    setStackSize(GTItemList.Extended_Mega_Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Neutronium_Nanites.copy(), 8),

                    setStackSize(IngotList.Kevlar_Ingot.copy(), 16),
                    setStackSize(IngotList.Magmatter_Ingot.copy(), 36),
                    setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 16),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 36),
                    setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 16),

                    setStackSize(IngotList.Universium_Ingot.copy(), 52),

                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 32))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 16),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 80),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 64),
                    requiredFluid(FluidList.UU_Matter, 1000 * 64))
                .itemOutputs(setStackSize(HatchList.Energy_Hatch_UXV.copy(), 1))
                .eut(RECIPE_UXV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // "Filtered Beam Output Hatch"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#32")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(HatchList.Filtered_Beam_Output_Hatch.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.UV, 32),
                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 6),

                setStackSize(GemList.Nether_Star.copy(), 32),

                setStackSize(GTBlockList.Machine_Hull_LuV.copy(), 1),

                setStackSize(GTItemList.Activated_Carbon_Filter_Mesh.copy(), 32),

                setStackSize(GTNHLanthanidesList.Capillary_Exchange.copy(), 4),

                setStackSize(IngotList.Americium_Ingot.copy(), 64 * 6),
                setStackSize(IngotList.HSSS_Ingot.copy(), 38),
                setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 3 + 16),
                setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 22),
                setStackSize(IngotList.Mu_metal_Ingot.copy(), 12),
                setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 2 + 16),

                setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 8 + 16),
                setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 3 + 8),
                setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 4),
                setStackSize(IngotList.Osmiridium_Ingot.copy(), 1),
                setStackSize(IngotList.Ruridit_Ingot.copy(), 64 + 32),
                setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 2),

                setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 64 + 1),
                setStackSize(IngotList.Tungstencarbide_Ingot.copy(), 8),
                setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 8),

                setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 8))
            .fluidInputs(
                requiredFluid(FluidList.Lubricant, 1000 * (64 + 18)),
                requiredFluid(FluidList.UU_Matter, 1000),
                requiredFluid(GasList.Argon, 1000),
                requiredFluid(GasList.Helium, 1000 * 6),
                requiredFluid(GasList.Radon, 1000 * 40))
            .itemOutputs(setStackSize(HatchList.Filtered_Beam_Output_Hatch.copy(), 1))
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Nanite Containment Bus"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#33")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(HatchList.Nanite_Containment_Bus.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),
                getMaterialInput(OrePrefixes.circuit, Materials.UHV, 21),
                getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),
                getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 16),

                setStackSize(AmunRaList.Nanite_Control_Module.copy(), 4),

                setStackSize(GemList.Nether_Star.copy(), 46),

                setStackSize(GTBlockList.Machine_Hull_UHV.copy(), 1),

                setStackSize(HatchList.Input_Bus_UHV.copy(), 1),

                setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 + 36),
                setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 5 + 40),
                setStackSize(IngotList.Enriched_Naquadah_Alloy_Ingot.copy(), 36),
                setStackSize(IngotList.Europium_Ingot.copy(), 64 * 2 + 3),
                setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 4),
                setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 4 + 8),

                setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 28),
                setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 44),
                setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 3 + 24),
                setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 8 + 8),
                setStackSize(IngotList.Osmiridium_Ingot.copy(), 16),
                setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 40),

                setStackSize(IngotList.Trinium_Ingot.copy(), 64 * 3),
                setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64 * 2))
            .fluidInputs(
                requiredFluid(FluidList.Lubricant, 1000 * 31),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 16),
                requiredFluid(GasList.Radon, 1000 * (64 + 3) + 500))
            .itemOutputs(setStackSize(HatchList.Nanite_Containment_Bus.copy(), 1))
            .eut(RECIPE_UHV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Quantum Uplink ME Connector Hatch"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#34")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(HatchList.Quantum_Uplink_ME_Connector_Hatch.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.UV, 6),
                getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),
                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 8),

                setStackSize(AE2FluidCraftingList.ME_Dual_Interface.copy(), 1),

                setStackSize(Appliedenergistics2List.Blank_Pattern.copy(), 64),
                setStackSize(Appliedenergistics2List.ME_Pattern_Terminal.copy(), 1),
                setStackSize(Appliedenergistics2List.ME_Storage_Component_16384k.copy(), 1),

                setStackSize(HatchList.Optical_Reception_Connector.copy(), 1),

                setStackSize(IngotList.Americium_Ingot.copy(), 64 * 2 + 16),
                setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 20),
                setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 6),
                setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 32),
                setStackSize(IngotList.Naquadria_Ingot.copy(), 61),
                setStackSize(IngotList.Neutronium_Ingot.copy(), 57))
            .fluidInputs(requiredFluid(FluidList.Lubricant, 1000 * 10))
            .itemOutputs(setStackSize(HatchList.Quantum_Uplink_ME_Connector_Hatch.copy(), 1))
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Wireless Assembly Line Reception Connector"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#35")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(HatchList.Wireless_Assembly_line_Reception_Connector.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 2),
                getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),

                setStackSize(GemList.Nether_Star.copy(), 16),

                setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 64),

                setStackSize(HatchList.Assembly_line_Reception_Connector.copy(), 1),

                setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 8),
                setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64),
                setStackSize(IngotList.Draconium_Ingot.copy(), 18),
                setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64),
                setStackSize(IngotList.Infinity_Ingot.copy(), 50),
                setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 4 + 32),

                setStackSize(IngotList.Quantium_Ingot.copy(), 39),

                setStackSize(MultiMachineControllerList.Data_Bank.copy(), 1),

                setStackSize(OpenComputersList.Internet_Card.copy(), 1))
            .fluidInputs(
                requiredFluid(FluidList.Lubricant, 1000 * 4),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 44),
                requiredFluid(GasList.Radon, 1000 * 24))
            .itemOutputs(setStackSize(HatchList.Wireless_Assembly_line_Reception_Connector.copy(), 1))
            .eut(RECIPE_UEV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Wireless Data Bank Transmission Connector"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#36")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(HatchList.Wireless_Data_Bank_Transmission_Connector.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 2),
                getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),

                setStackSize(GemList.Nether_Star.copy(), 16),

                setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 64),

                setStackSize(HatchList.Data_Bank_Transmission_Connector.copy(), 1),

                setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 8),
                setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64),
                setStackSize(IngotList.Draconium_Ingot.copy(), 18),
                setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64),
                setStackSize(IngotList.Infinity_Ingot.copy(), 50),
                setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 4 + 32),

                setStackSize(IngotList.Quantium_Ingot.copy(), 36),

                setStackSize(MultiMachineControllerList.Data_Bank.copy(), 1),

                setStackSize(OpenComputersList.Internet_Card.copy(), 1))
            .fluidInputs(
                requiredFluid(FluidList.Lubricant, 1000 * 4),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 44),
                requiredFluid(GasList.Radon, 1000 * 24))
            .itemOutputs(setStackSize(HatchList.Wireless_Data_Bank_Transmission_Connector.copy(), 1))
            .eut(RECIPE_UEV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // Wireless Energy Hatch
        {
            // 1A Wireless Energy Hatch
            {
                final ItemStack[] Energy_Hatch = new ItemStack[] { HatchList.Energy_Hatch_ULV,
                    HatchList.Energy_Hatch_LV.copy(), HatchList.Energy_Hatch_MV.copy(),
                    HatchList.Energy_Hatch_HV.copy(), HatchList.Energy_Hatch_EV.copy(),
                    HatchList.Energy_Hatch_IV.copy(), HatchList.Energy_Hatch_LuV.copy(),
                    HatchList.Energy_Hatch_ZPM.copy(), HatchList.Energy_Hatch_UV.copy(),
                    HatchList.Energy_Hatch_UHV.copy(), HatchList.Energy_Hatch_UEV.copy(),
                    HatchList.Energy_Hatch_UIV.copy(), HatchList.Energy_Hatch_UMV.copy(),
                    HatchList.Energy_Hatch_UXV.copy() };

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

                final ItemStack[] Wireless_Energy_Hatch = new ItemStack[] { HatchList.Wireless_Energy_Hatch_ULV.copy(),
                    HatchList.Wireless_Energy_Hatch_LV.copy(), HatchList.Wireless_Energy_Hatch_MV.copy(),
                    HatchList.Wireless_Energy_Hatch_HV.copy(), HatchList.Wireless_Energy_Hatch_EV.copy(),
                    HatchList.Wireless_Energy_Hatch_IV.copy(), HatchList.Wireless_Energy_Hatch_LuV.copy(),
                    HatchList.Wireless_Energy_Hatch_ZPM.copy(), HatchList.Wireless_Energy_Hatch_UV.copy(),
                    HatchList.Wireless_Energy_Hatch_UHV.copy(), HatchList.Wireless_Energy_Hatch_UEV.copy(),
                    HatchList.Wireless_Energy_Hatch_UIV.copy(), HatchList.Wireless_Energy_Hatch_UMV.copy(),
                    HatchList.Wireless_Energy_Hatch_UXV.copy() };

                for (int Wireless_Energy_Hatch_Tier = 0; Wireless_Energy_Hatch_Tier
                    < 14; Wireless_Energy_Hatch_Tier++) {
                    ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#37")
                        .itemInputsUnsafe(
                            GTUtility.getIntegratedCircuit(1),
                            setStackSize(Wireless_Energy_Hatch[Wireless_Energy_Hatch_Tier], 0),

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
                            requiredFluid(FluidList.Mutated_Living_Solder, 144 * 9),
                            requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 500))
                        .itemOutputs(Wireless_Energy_Hatch[Wireless_Energy_Hatch_Tier])
                        .eut(RECIPE_UMV)
                        .duration(20 * SECONDS)
                        .addTo(AssemblyLineItemRecipe);
                }
            }

            // 4A Wireless Energy Hatch
            {
                final ItemStack[] Energy_Hatch = new ItemStack[] { HatchList.Energy_Hatch4_EV.copy(),
                    HatchList.Energy_Hatch4_IV.copy(), HatchList.Energy_Hatch4_LuV.copy(),
                    HatchList.Energy_Hatch4_ZPM.copy(), HatchList.Energy_Hatch4_UV.copy(),
                    HatchList.Energy_Hatch4_UHV.copy(), HatchList.Energy_Hatch4_UEV.copy(),
                    HatchList.Energy_Hatch4_UIV.copy(), HatchList.Energy_Hatch4_UMV.copy(),
                    HatchList.Energy_Hatch4_UXV.copy() };

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

                final ItemStack[] Wireless_Energy_Hatch = new ItemStack[] { HatchList.Wireless_Energy_Hatch4_EV.copy(),
                    HatchList.Wireless_Energy_Hatch4_IV.copy(), HatchList.Wireless_Energy_Hatch4_LuV.copy(),
                    HatchList.Wireless_Energy_Hatch4_ZPM.copy(), HatchList.Wireless_Energy_Hatch4_UV.copy(),
                    HatchList.Wireless_Energy_Hatch4_UHV.copy(), HatchList.Wireless_Energy_Hatch4_UEV.copy(),
                    HatchList.Wireless_Energy_Hatch4_UIV.copy(), HatchList.Wireless_Energy_Hatch4_UMV.copy(),
                    HatchList.Wireless_Energy_Hatch4_UXV.copy() };

                for (int Wireless_Energy_Hatch_Tier = 0; Wireless_Energy_Hatch_Tier
                    < 10; Wireless_Energy_Hatch_Tier++) {
                    ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#38")
                        .itemInputsUnsafe(
                            GTUtility.getIntegratedCircuit(1),
                            setStackSize(Wireless_Energy_Hatch[Wireless_Energy_Hatch_Tier], 0),

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
                            requiredFluid(FluidList.Mutated_Living_Solder, 144 * 36),
                            requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 2))
                        .itemOutputs(Wireless_Energy_Hatch[Wireless_Energy_Hatch_Tier])
                        .eut(RECIPE_UMV)
                        .duration(20 * SECONDS)
                        .addTo(AssemblyLineItemRecipe);
                }
            }

            // 16A Wireless Energy Hatch
            {
                final ItemStack[] Energy_Hatch = new ItemStack[] { HatchList.Energy_Hatch16_EV.copy(),
                    HatchList.Energy_Hatch16_IV.copy(), HatchList.Energy_Hatch16_LuV.copy(),
                    HatchList.Energy_Hatch16_ZPM.copy(), HatchList.Energy_Hatch16_UV.copy(),
                    HatchList.Energy_Hatch16_UHV.copy(), HatchList.Energy_Hatch16_UEV.copy(),
                    HatchList.Energy_Hatch16_UIV.copy(), HatchList.Energy_Hatch16_UMV.copy(),
                    HatchList.Energy_Hatch16_UXV.copy() };

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

                final ItemStack[] Wireless_Energy_Hatch = new ItemStack[] { HatchList.Wireless_Energy_Hatch16_EV.copy(),
                    HatchList.Wireless_Energy_Hatch16_IV.copy(), HatchList.Wireless_Energy_Hatch16_LuV.copy(),
                    HatchList.Wireless_Energy_Hatch16_ZPM.copy(), HatchList.Wireless_Energy_Hatch16_UV.copy(),
                    HatchList.Wireless_Energy_Hatch16_UHV.copy(), HatchList.Wireless_Energy_Hatch16_UEV.copy(),
                    HatchList.Wireless_Energy_Hatch16_UIV.copy(), HatchList.Wireless_Energy_Hatch16_UMV.copy(),
                    HatchList.Wireless_Energy_Hatch16_UXV.copy() };

                for (int Wireless_Energy_Hatch_Tier = 0; Wireless_Energy_Hatch_Tier
                    < 10; Wireless_Energy_Hatch_Tier++) {
                    ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#39")
                        .itemInputsUnsafe(
                            GTUtility.getIntegratedCircuit(1),
                            setStackSize(Wireless_Energy_Hatch[Wireless_Energy_Hatch_Tier], 0),

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
                            requiredFluid(FluidList.Mutated_Living_Solder, 144 * 144),
                            requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 8))
                        .itemOutputs(Wireless_Energy_Hatch[Wireless_Energy_Hatch_Tier])
                        .eut(RECIPE_UMV)
                        .duration(20 * SECONDS)
                        .addTo(AssemblyLineItemRecipe);
                }
            }

            // 64A Wireless Energy Hatch
            {
                final ItemStack[] Energy_Hatch = new ItemStack[] { HatchList.Energy_Hatch64_EV.copy(),
                    HatchList.Energy_Hatch64_IV.copy(), HatchList.Energy_Hatch64_LuV.copy(),
                    HatchList.Energy_Hatch64_ZPM.copy(), HatchList.Energy_Hatch64_UV.copy(),
                    HatchList.Energy_Hatch64_UHV.copy(), HatchList.Energy_Hatch64_UEV.copy(),
                    HatchList.Energy_Hatch64_UIV.copy(), HatchList.Energy_Hatch64_UMV.copy(),
                    HatchList.Energy_Hatch64_UXV.copy() };

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

                final ItemStack[] Wireless_Energy_Hatch = new ItemStack[] { HatchList.Wireless_Energy_Hatch64_EV.copy(),
                    HatchList.Wireless_Energy_Hatch64_IV.copy(), HatchList.Wireless_Energy_Hatch64_LuV.copy(),
                    HatchList.Wireless_Energy_Hatch64_ZPM.copy(), HatchList.Wireless_Energy_Hatch64_UV.copy(),
                    HatchList.Wireless_Energy_Hatch64_UHV.copy(), HatchList.Wireless_Energy_Hatch64_UEV.copy(),
                    HatchList.Wireless_Energy_Hatch64_UIV.copy(), HatchList.Wireless_Energy_Hatch64_UMV.copy(),
                    HatchList.Wireless_Energy_Hatch64_UXV.copy() };

                for (int Wireless_Energy_Hatch_Tier = 0; Wireless_Energy_Hatch_Tier
                    < 10; Wireless_Energy_Hatch_Tier++) {
                    ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#40")
                        .itemInputsUnsafe(
                            GTUtility.getIntegratedCircuit(1),
                            setStackSize(Wireless_Energy_Hatch[Wireless_Energy_Hatch_Tier], 0),

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
                            requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 9),
                            requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 32))
                        .itemOutputs(Wireless_Energy_Hatch[Wireless_Energy_Hatch_Tier])
                        .eut(RECIPE_UMV)
                        .duration(20 * SECONDS)
                        .addTo(AssemblyLineItemRecipe);
                }
            }

            // UXV Wireless Energy Hatch
            {
                final ItemStack[] Energy_Hatch = new ItemStack[] { HatchList.Laser_Source_Hatch256_UXV.copy(),
                    HatchList.Laser_Source_Hatch1024_UXV.copy(), HatchList.Laser_Source_Hatch4096_UXV.copy(),
                    HatchList.Laser_Source_Hatch16384_UXV.copy(), HatchList.Laser_Source_Hatch65536_UXV.copy(),
                    HatchList.Laser_Source_Hatch262144_UXV.copy(), HatchList.Laser_Source_Hatch1048576_UXV.copy() };

                final ItemStack[] Wireless_Energy_Hatch = new ItemStack[] {
                    HatchList.Wireless_Energy_Hatch256_UXV.copy(), HatchList.Wireless_Energy_Hatch1024_UXV.copy(),
                    HatchList.Wireless_Energy_Hatch4096_UXV.copy(), HatchList.Wireless_Energy_Hatch16384_UXV.copy(),
                    HatchList.Wireless_Energy_Hatch65536_UXV.copy(), HatchList.Wireless_Energy_Hatch262144_UXV.copy(),
                    HatchList.Wireless_Energy_Hatch1048576_UXV.copy() };

                for (int Wireless_Energy_Hatch_Tier = 0; Wireless_Energy_Hatch_Tier < 7; Wireless_Energy_Hatch_Tier++) {
                    ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#41")
                        .itemInputsUnsafe(
                            GTUtility.getIntegratedCircuit(1),
                            setStackSize(Wireless_Energy_Hatch[Wireless_Energy_Hatch_Tier], 0),

                            Energy_Hatch[Wireless_Energy_Hatch_Tier],
                            setStackSize(GoodGeneratorList.Compact_Fusion_Coil_MKII_Finaltype.copy(), 1),
                            setStackSize(
                                GTNHIntergalacticList.Dyson_Swarm_Module_Deployment_Unit_Superconducting_Magnet,
                                1),
                            setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 1),

                            setStackSize(TecTechList.High_Power_Casing.copy(), 64),
                            setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 8),
                            setStackSize(IngotList.Eternity_Ingot.copy(), 64 * 4 + 32),
                            setStackSize(
                                IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(),
                                64 * 2 + 16),

                            getMaterialInput(OrePrefixes.circuit, Materials.MAX, 8),
                            setStackSize(GTItemList.Energised_Tesseract.copy(), 1))
                        .fluidInputs(
                            requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 36),
                            requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Stellar_Catalyst, 1000 * 32))
                        .itemOutputs(Wireless_Energy_Hatch[Wireless_Energy_Hatch_Tier])
                        .eut(RECIPE_UMV)
                        .duration(20 * SECONDS)
                        .addTo(AssemblyLineItemRecipe);
                }
            }
        }

        // Special Laser Hatch
        {
            // "UMV 4,194,304A/t Laser Source Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#42")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Laser_Source_Hatch4194304_UMV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 64 * 8),

                    setStackSize(GemList.Diamond.copy(), 64 * 2),
                    setStackSize(GemList.Nether_Star.copy(), 64 * 256),

                    setStackSize(GTBlockList.Machine_Hull_UMV.copy(), 1),

                    setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 64 * 32),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 128),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 * 64),
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 64 * 288),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 40),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 56),

                    setStackSize(IngotList.Quantum_Ingot.copy(), 64 * 32),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 32),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 160),
                    setStackSize(IngotList.Titansteel_Ingot.copy(), 64 * 32))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * (64 * 24)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 180)))
                .itemOutputs(setStackSize(HatchList.Laser_Source_Hatch4194304_UMV.copy(), 1))
                .eut(RECIPE_UMV)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "UXV 4,194,304A/t Laser Source Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#43")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Laser_Source_Hatch4194304_UXV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 64 * 8),

                    setStackSize(GemList.Diamond.copy(), 64 * 2),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 2048),

                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),

                    setStackSize(GTItemList.Energised_Tesseract.copy(), 64 * 4),
                    setStackSize(GTItemList.Neutronium_Nanites.copy(), 64 * 40),

                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 128),
                    setStackSize(IngotList.Kevlar_Ingot.copy(), 64 * 32),
                    setStackSize(IngotList.Magmatter_Ingot.copy(), 64 * 136),
                    setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(), 64 * 288),
                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 64 * 32),

                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 192),
                    setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 64 * 64),
                    setStackSize(IngotList.Universium_Ingot.copy(), 64 * 248))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * (64 * 48)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 236)))
                .itemOutputs(setStackSize(HatchList.Laser_Source_Hatch4194304_UXV.copy(), 1))
                .eut(RECIPE_UXV)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "UXV 16,777,216A/t Laser Source Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#44")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Laser_Source_Hatch1677216_UXV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 64 * 16),

                    setStackSize(GemList.Diamond.copy(), 64 * 4),
                    setStackSize(GemList.Nether_Star.copy(), 64 * 4096),

                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),

                    setStackSize(GTItemList.Energised_Tesseract.copy(), 64 * 8),
                    setStackSize(GTItemList.Neutronium_Nanites.copy(), 64 * 80),

                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 256),
                    setStackSize(IngotList.Kevlar_Ingot.copy(), 64 * 64),
                    setStackSize(IngotList.Magmatter_Ingot.copy(), 64 * 272),
                    setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(), 64 * 576),
                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 64 * 64),

                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 384),
                    setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 64 * 128),
                    setStackSize(IngotList.Universium_Ingot.copy(), 64 * 496))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * (64 * 96)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 472)))
                .itemOutputs(setStackSize(HatchList.Laser_Source_Hatch1677216_UXV.copy(), 1))
                .eut(RECIPE_UXV)
                .duration(110 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Legendary Laser Source Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#45")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Laser_Source_Hatch_Legendary.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 64 * 32),

                    setStackSize(GemList.Diamond.copy(), 64 * 8),
                    setStackSize(GemList.Nether_Star.copy(), 64 * 8192),

                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),

                    setStackSize(GTItemList.Energised_Tesseract.copy(), 64 * 16),
                    setStackSize(GTItemList.Neutronium_Nanites.copy(), 64 * 160),

                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 64 * 16),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 512),
                    setStackSize(IngotList.Kevlar_Ingot.copy(), 64 * 128),
                    setStackSize(IngotList.Magmatter_Ingot.copy(), 64 * 554),
                    setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(), 64 * 1152),
                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 64 * 128),

                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 768),
                    setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 64 * 256),
                    setStackSize(IngotList.Universium_Ingot.copy(), 64 * 960))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * (64 * 192)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 74528)))
                .itemOutputs(setStackSize(HatchList.Laser_Source_Hatch_Legendary.copy(), 1))
                .eut(RECIPE_UXV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "UMV 4,194,304A/t Laser Target Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#46")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Laser_Target_Hatch4194304_UMV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 64 * 8),

                    setStackSize(GemList.Diamond.copy(), 64 * 2),
                    setStackSize(GemList.Nether_Star.copy(), 64 * 256),

                    setStackSize(GTBlockList.Machine_Hull_UMV.copy(), 1),

                    setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 64 * 32),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 128),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 * 64),
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 64 * 288),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 40),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 56),

                    setStackSize(IngotList.Quantum_Ingot.copy(), 64 * 32),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 32),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 160),
                    setStackSize(IngotList.Titansteel_Ingot.copy(), 64 * 32))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * (64 * 24)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 180)))
                .itemOutputs(setStackSize(HatchList.Laser_Target_Hatch4194304_UMV.copy(), 1))
                .eut(RECIPE_UMV)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "UXV 4,194,304A/t Laser Target Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#47")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Laser_Target_Hatch4194304_UXV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 64 * 8),

                    setStackSize(GemList.Diamond.copy(), 64 * 2),
                    setStackSize(GemList.Nether_Star.copy(), 64 * 2048),

                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),

                    setStackSize(GTItemList.Energised_Tesseract.copy(), 64 * 4),
                    setStackSize(GTItemList.Neutronium_Nanites.copy(), 64 * 40),

                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 128),
                    setStackSize(IngotList.Kevlar_Ingot.copy(), 64 * 32),
                    setStackSize(IngotList.Magmatter_Ingot.copy(), 64 * 136),
                    setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(), 64 * 288),
                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 64 * 32),

                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 192),
                    setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 64 * 64),
                    setStackSize(IngotList.Universium_Ingot.copy(), 64 * 240))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * (64 * 48)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 236)))
                .itemOutputs(setStackSize(HatchList.Laser_Target_Hatch4194304_UXV.copy(), 1))
                .eut(RECIPE_UXV)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "UXV 16,777,216A/t Laser Target Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#48")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Laser_Target_Hatch1677216_UXV.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 64 * 16),

                    setStackSize(GemList.Diamond.copy(), 64 * 4),
                    setStackSize(GemList.Nether_Star.copy(), 64 * 4096),

                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),

                    setStackSize(GTItemList.Energised_Tesseract.copy(), 64 * 8),
                    setStackSize(GTItemList.Neutronium_Nanites.copy(), 64 * 80),

                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 256),
                    setStackSize(IngotList.Kevlar_Ingot.copy(), 64 * 64),
                    setStackSize(IngotList.Magmatter_Ingot.copy(), 64 * 272),
                    setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(), 64 * 576),
                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 64 * 64),

                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 384),
                    setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 64 * 128),
                    setStackSize(IngotList.Universium_Ingot.copy(), 64 * 580))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * (64 * 96)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 472)))
                .itemOutputs(setStackSize(HatchList.Laser_Target_Hatch1677216_UXV.copy(), 1))
                .eut(RECIPE_UXV)
                .duration(110 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Legendary Laser Target Hatch"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#49")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Laser_Target_Hatch_Legendary.copy(), 0),

                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 64 * 32),

                    setStackSize(GemList.Diamond.copy(), 64 * 8),
                    setStackSize(GemList.Nether_Star.copy(), 64 * 8192),

                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),

                    setStackSize(GTItemList.Energised_Tesseract.copy(), 64 * 16),
                    setStackSize(GTItemList.Neutronium_Nanites.copy(), 64 * 160),

                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 64 * 16),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 512),
                    setStackSize(IngotList.Kevlar_Ingot.copy(), 64 * 128),
                    setStackSize(IngotList.Magmatter_Ingot.copy(), 64 * 554),
                    setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(), 64 * 1152),
                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 64 * 128),

                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 768),
                    setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 64 * 256),
                    setStackSize(IngotList.Universium_Ingot.copy(), 64 * 960))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * (64 * 192)),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * (64 * 944)))
                .itemOutputs(setStackSize(HatchList.Laser_Target_Hatch_Legendary.copy(), 1))
                .eut(RECIPE_UXV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // ME Bus/Hatch
        {
            // "Advanced Stocking Input Bus (ME)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#50")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Advanced_Stocking_Input_Bus_ME.copy(), 0),

                    setStackSize(Appliedenergistics2List.Acceleration_Card.copy(), 4),
                    setStackSize(Appliedenergistics2List.ME_Interface.copy(), 1),
                    setStackSize(GTItemList.Conveyor_Module_IV.copy(), 1),
                    setStackSize(HatchList.Input_Bus_LuV.copy(), 1),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 2))
                .fluidInputs(requiredFluid(FluidList.Lubricant, 500))
                .itemOutputs(setStackSize(HatchList.Advanced_Stocking_Input_Bus_ME.copy(), 1))
                .eut(RECIPE_LuV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Crafting Input Bus (ME)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#51")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Crafting_Input_Bus_ME.copy(), 0),

                    setStackSize(Appliedenergistics2List.ME_Storage_Component_4096k.copy(), 1),
                    setStackSize(Appliedenergistics2List.ME_Controller.copy(), 1),
                    setStackSize(Appliedenergistics2List.ME_Interface_Terminal.copy(), 1),
                    setStackSize(Appliedenergistics2List.Pattern_Capacity_Card.copy(), 3),

                    setStackSize(HatchList.Stocking_Input_Bus_ME.copy(), 1),

                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 8))
                .itemOutputs(setStackSize(HatchList.Crafting_Input_Bus_ME.copy(), 1))
                .eut(RECIPE_LuV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // Neutron Accelerator
        {
            // "Neutron Accelerator LuV"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#52")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Neutron_Accelerator_LuV.copy(), 0),

                    setStackSize(GemList.Nether_Star.copy(), 1),

                    setStackSize(GoodGeneratorList.Inverter.copy(), 2),

                    setStackSize(GTBlockList.Machine_Hull_LuV.copy(), 1),

                    setStackSize(IngotList.HSSS_Ingot.copy(), 4),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 2),
                    setStackSize(IngotList.Magnetic_Neodymium_Ingot.copy(), 8),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 2),
                    setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 4),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 32),

                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 2),

                    setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 16))
                .fluidInputs(requiredFluid(FluidList.Lubricant, 500), requiredFluid(GasList.Argon, 1000 * 3))
                .itemOutputs(setStackSize(HatchList.Neutron_Accelerator_LuV.copy(), 1))
                .eut(RECIPE_LuV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Neutron Accelerator ZPM"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#53")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Neutron_Accelerator_ZPM.copy(), 0),

                    setStackSize(GemList.Nether_Star.copy(), 1),

                    setStackSize(GoodGeneratorList.Inverter.copy(), 2),

                    setStackSize(GTBlockList.Machine_Hull_ZPM.copy(), 1),

                    setStackSize(IngotList.Europium_Ingot.copy(), 48),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 4),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 10),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 14),
                    setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 8),
                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 8),

                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 16))
                .fluidInputs(requiredFluid(FluidList.Lubricant, 1000 + 500), requiredFluid(GasList.Xenon, 1000 * 3))
                .itemOutputs(setStackSize(HatchList.Neutron_Accelerator_ZPM.copy(), 1))
                .eut(RECIPE_ZPM)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Neutron Accelerator UV"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#54")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Neutron_Accelerator_UV.copy(), 0),

                    setStackSize(GemList.Nether_Star.copy(), 2),

                    setStackSize(GoodGeneratorList.Inverter.copy(), 4),

                    setStackSize(GTBlockList.Machine_Hull_UV.copy(), 1),

                    setStackSize(GTItemList.ZPM_Voltage_Coil.copy(), 8),

                    setStackSize(IngotList.Americium_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 18),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 4),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 8),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 18),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 18),

                    setStackSize(IngotList.Nickel_Zinc_Ferrite_Ingot.copy(), 16),
                    setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 12),

                    setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 16))
                .fluidInputs(requiredFluid(FluidList.Lubricant, 1000 * 4), requiredFluid(GasList.Oganesson, 1000 * 3))
                .itemOutputs(setStackSize(HatchList.Neutron_Accelerator_UV.copy(), 1))
                .eut(RECIPE_UV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Neutron Accelerator UHV"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#55")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Neutron_Accelerator_UHV.copy(), 0),

                    setStackSize(GemList.Orundum.copy(), 2),

                    setStackSize(GoodGeneratorList.Inverter.copy(), 8),

                    setStackSize(GTBlockList.Machine_Hull_UHV.copy(), 1),

                    setStackSize(GTItemList.Ultimate_Voltage_Coil.copy(), 8),

                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 8),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 22),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 36),
                    setStackSize(IngotList.Kevlar_Ingot.copy(), 24),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 8),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 36),

                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 2 + 16),

                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 16))
                .fluidInputs(
                    requiredFluid(FluidList.Extreme_Temperature_Treated_Water_Grade_5, 1000 * 16),
                    requiredFluid(FluidList.Lubricant, 1000 * 8),
                    requiredFluid(GasList.Oganesson, 1000 * 12))
                .itemOutputs(setStackSize(HatchList.Neutron_Accelerator_UHV.copy(), 1))
                .eut(RECIPE_UHV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Neutron Accelerator UEV"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#56")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Neutron_Accelerator_UEV.copy(), 0),

                    setStackSize(GemList.Orundum.copy(), 8),

                    setStackSize(GoodGeneratorList.Inverter.copy(), 16),

                    setStackSize(GTBlockList.Machine_Hull_UEV.copy(), 1),

                    setStackSize(GTItemList.Highly_Ultimate_Voltage_Coil.copy(), 8),

                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 32),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 8),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 48),
                    setStackSize(IngotList.Kevlar_Ingot.copy(), 64 * 2 + 16),
                    setStackSize(IngotList.Metastable_Oganesson_Ingot.copy(), 3),

                    setStackSize(IngotList.Quantium_Ingot.copy(), 36),

                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 16))
                .fluidInputs(
                    requiredFluid(FluidList.Lubricant, 1000 * 8),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 36),
                    requiredFluid(FluidList.Ultraviolet_Treated_Electrically_Neutral_Water_Grade_6, 1000 * 16))
                .itemOutputs(setStackSize(HatchList.Neutron_Accelerator_UEV.copy(), 1))
                .eut(RECIPE_UEV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Neutron Accelerator UIV"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#57")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Neutron_Accelerator_UIV.copy(), 0),

                    setStackSize(GemList.Nether_Star.copy(), 8),

                    setStackSize(GoodGeneratorList.Inverter.copy(), 32),

                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 1),

                    setStackSize(GTItemList.Extremely_Ultimate_Voltage_Coil.copy(), 8),
                    setStackSize(GTItemList.Raw_Tesseract.copy(), 8),
                    setStackSize(GTItemList.Tengam_Electromagnet.copy(), 1),

                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 32),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 8),
                    setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 8),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 16),
                    setStackSize(IngotList.Metastable_Oganesson_Ingot.copy(), 12),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 2),

                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 32),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 44),

                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 16))
                .fluidInputs(
                    requiredFluid(FluidList.Degassed_Decontaminant_Free_Water_Grade_7, 1000 * 16),
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 12),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 36))
                .itemOutputs(setStackSize(HatchList.Neutron_Accelerator_UIV.copy(), 1))
                .eut(RECIPE_UIV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Neutron Accelerator UMV"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#58")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(HatchList.Neutron_Accelerator_UMV.copy(), 0),

                    setStackSize(GoodGeneratorList.Inverter.copy(), 64),

                    setStackSize(GTBlockList.Machine_Hull_UMV.copy(), 1),

                    setStackSize(GTItemList.Energised_Tesseract.copy(), 12),
                    setStackSize(GTItemList.Insanely_Ultimate_Voltage_Coil.copy(), 8),
                    setStackSize(GTItemList.Tengam_Electromagnet.copy(), 1),

                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 8),
                    setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 32),
                    setStackSize(IngotList.Creon_Ingot.copy(), 16),
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 64 * 2 + 8),
                    setStackSize(IngotList.Mellion_Ingot.copy(), 16),

                    setStackSize(IngotList.Quantium_Ingot.copy(), 8),
                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 64),
                    setStackSize(IngotList.Shirabon_Ingot.copy(), 3),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 44),

                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 16))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 16),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 36),
                    requiredFluid(FluidList.Subatomically_Perfect_Water_Grade_8, 1000 * 16))
                .itemOutputs(setStackSize(HatchList.Neutron_Accelerator_UMV.copy(), 1))
                .eut(RECIPE_UMV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // "Object Holder"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#59")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(HatchList.Object_Holder.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.UV, 1),
                getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 34),
                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),
                getMaterialInput(OrePrefixes.circuit, Materials.IV, 8),

                setStackSize(GemList.Nether_Star.copy(), 16),

                setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 2),

                setStackSize(HatchList.Input_Bus_ZPM.copy(), 1),

                setStackSize(IngotList.Europium_Ingot.copy(), 64 * 4 + 56),
                setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 36),
                setStackSize(IngotList.Iridium_Ingot.copy(), 8),
                setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 13),
                setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 2 + 9),
                setStackSize(IngotList.Naquadah_Ingot.copy(), 4),

                setStackSize(IngotList.Osmiridium_Ingot.copy(), 32),
                setStackSize(IngotList.Trinium_Ingot.copy(), 64 * 6),
                setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64 * 4 + 8),

                setStackSize(TecTechList.Advanced_Computer_Casing.copy(), 1))
            .fluidInputs(
                requiredFluid(FluidList.IC2_Coolant, 1000),
                requiredFluid(FluidList.Lubricant, 1000 * 10 + 250),
                requiredFluid(FluidList.UU_Matter, 500),
                requiredFluid(GasList.Radon, 1000 * 20))
            .itemOutputs(setStackSize(HatchList.Object_Holder.copy(), 1))
            .eut(RECIPE_UV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Turbine Housing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_HatchRecipe_Item#60")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),
                setStackSize(HatchList.Turbine_Housing.copy(), 0),

                getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 20),

                setStackSize(GTBlockList.Machine_Hull_UV.copy(), 4),

                setStackSize(GTPPList.Energy_Core_LuV.copy(), 8),

                setStackSize(IngotList.Advanced_Nitinol_Ingot.copy(), 56),
                setStackSize(IngotList.Americium_Ingot.copy(), 64 * 36),
                setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 20),
                setStackSize(IngotList.Babbit_Alloy_Ingot.copy(), 64 * 2),
                setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 16),
                setStackSize(IngotList.Europium_Ingot.copy(), 64 * 18),

                setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 12 + 8),
                setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 64 + 16),
                setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 * 2 + 16),
                setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 16),
                setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 10 + 8),
                setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 9 + 24),

                setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 15),
                setStackSize(IngotList.Titansteel_Ingot.copy(), 6),
                setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64 * 5),
                setStackSize(IngotList.Zeron_100_Ingot.copy(), 6))
            .fluidInputs(requiredFluid(FluidList.Lubricant, 1000 * (64 * 3)))
            .itemOutputs(setStackSize(HatchList.Turbine_Housing.copy(), 4))
            .eut(RECIPE_UV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineItemRecipe);
    }
}
