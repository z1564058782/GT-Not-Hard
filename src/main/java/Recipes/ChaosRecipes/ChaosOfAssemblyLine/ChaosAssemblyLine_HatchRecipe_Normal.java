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
import static util.Utils.setStackSize;

import net.minecraft.item.ItemStack;

import EnumList.EnumFluidList.FluidList;
import EnumList.EnumFluidList.GasList;
import EnumList.EnumFluidList.MoltenList;
import EnumList.EnumItemList.EnumGTList.BatteryList;
import EnumList.EnumItemList.EnumGTList.CableList;
import EnumList.EnumItemList.EnumGTList.CircuitList;
import EnumList.EnumItemList.EnumGTList.GTBlockList;
import EnumList.EnumItemList.EnumGTList.GTItemList;
import EnumList.EnumItemList.EnumGTList.GTPPList;
import EnumList.EnumItemList.EnumGTList.HatchList;
import EnumList.EnumItemList.EnumGTList.MultiMachineCasingList;
import EnumList.EnumItemList.EnumGTList.MultiMachineControllerList;
import EnumList.EnumItemList.EnumGTList.WireList;
import EnumList.EnumItemList.EnumMaterialList.BoltList;
import EnumList.EnumItemList.EnumMaterialList.DensePlateList;
import EnumList.EnumItemList.EnumMaterialList.DoublePlateList;
import EnumList.EnumItemList.EnumMaterialList.FineWireList;
import EnumList.EnumItemList.EnumMaterialList.FoilList;
import EnumList.EnumItemList.EnumMaterialList.FrameBoxList;
import EnumList.EnumItemList.EnumMaterialList.GearList;
import EnumList.EnumItemList.EnumMaterialList.LongRodList;
import EnumList.EnumItemList.EnumMaterialList.PlateList;
import EnumList.EnumItemList.EnumMaterialList.RodList;
import EnumList.EnumItemList.EnumMaterialList.RotorList;
import EnumList.EnumItemList.EnumMaterialList.ScrewList;
import EnumList.EnumItemList.EnumMaterialList.SmallGearList;
import EnumList.EnumItemList.EnumMaterialList.SpringList;
import EnumList.EnumItemList.EnumMaterialList.SuperdensePlateList;
import EnumList.EnumItemList.EnumMaterialList.TriplePlateList;
import EnumList.EnumItemList.EnumModList.AE2FluidCraftingList;
import EnumList.EnumItemList.EnumModList.AmunRaList;
import EnumList.EnumItemList.EnumModList.Appliedenergistics2List;
import EnumList.EnumItemList.EnumModList.GTNHIntergalacticList;
import EnumList.EnumItemList.EnumModList.GTNHLanthanidesList;
import EnumList.EnumItemList.EnumModList.GoodGeneratorList;
import EnumList.EnumItemList.EnumModList.MinecraftList;
import EnumList.EnumItemList.EnumModList.OpenComputersList;
import EnumList.EnumItemList.EnumModList.TecTechList;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GTOreDictUnificator;
import gregtech.api.util.GTUtility;

public class ChaosAssemblyLine_HatchRecipe_Normal {

    public static void addChaosAssemblyLine_NormalHatchRecipe() {
        // "Antimatter Hatch"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(HatchList.Output_Hatch_UIV.copy(), 1),
                setStackSize(GTItemList.Field_Generator_UEV.copy(), 4),
                setStackSize(SuperdensePlateList.Superdense_Proto_Halkonite_Steel_Plate.copy(), 1),
                setStackSize(GTItemList.Electric_Pump_UIV.copy(), 4),

                setStackSize(GTItemList.Tengam_Electromagnet.copy(), 1),
                setStackSize(FoilList.Proto_Halkonite_Steel_Foil.copy(), 32))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Radox_Polymer.copy(), 144 * 9),
                setStackSize(FluidList.Protomatter.copy(), 250),
                setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000))
            .itemOutputs(setStackSize(HatchList.Antimatter_Hatch.copy(), 1))
            .eut(RECIPE_UIV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Auto-Taping Maintenance Hatch"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(HatchList.Auto_Maintenance_Hatch.copy(), 1),
                setStackSize(GTItemList.Robot_Arm_UV.copy(), 1),
                setStackSize(GTItemList.Electric_Pump_UV.copy(), 1),
                setStackSize(GTItemList.Conveyor_Module_UV.copy(), 1),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                setStackSize(BatteryList.Lapotronic_Energy_Orb_Cluster_Empty.copy(), 1),
                setStackSize(GTItemList.BrainTech_Aerospace_Advanced_Reinforced_Duct_Tape_FAL_84.copy(), 64 * 2),
                setStackSize(FineWireList.Fine_Americium_Wire.copy(), 64))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 8),
                setStackSize(FluidList.Lubricant.copy(), 1000 * 64 * 4))
            .itemOutputs(HatchList.Auto_Taping_Maintenance_Hatch)
            .eut(RECIPE_UV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Beam Input Hatch"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GTBlockList.Machine_Hull_LuV.copy(), 1),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),
                setStackSize(GTNHLanthanidesList.Capillary_Exchange.copy(), 2),
                setStackSize(GTItemList.Electric_Pump_LuV.copy(), 1),

                setStackSize(GTBlockList.Beam_Pipe.copy(), 1),
                setStackSize(PlateList.Mu_metal_Plate.copy(), 4))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Soldering_Alloy.copy(), 144 * 64),
                setStackSize(GasList.Argon.copy(), 1000),
                setStackSize(GasList.Helium.copy(), 1000 * 2))
            .itemOutputs(HatchList.Beam_Input_Hatch)
            .eut(RECIPE_LuV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Beam Output Hatch"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GTBlockList.Machine_Hull_LuV.copy(), 1),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 6),
                setStackSize(GTNHLanthanidesList.Capillary_Exchange.copy(), 4),
                setStackSize(GTItemList.Electric_Pump_LuV.copy(), 2),

                setStackSize(GTItemList.Electric_Motor_LuV.copy(), 4),
                setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 8),
                setStackSize(GTBlockList.Beam_Pipe.copy(), 1),
                setStackSize(PlateList.Mu_metal_Plate.copy(), 8))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Soldering_Alloy.copy(), 144 * 64),
                setStackSize(GasList.Argon.copy(), 1000),
                setStackSize(GasList.Helium.copy(), 1000 * 6))
            .itemOutputs(HatchList.Beam_Output_Hatch)
            .eut(RECIPE_LuV)
            .duration(240 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Bose-Einstein Condensate
        {
            // "Bose-Einstein Condensate Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 1),
                    setStackSize(HatchList.Beam_Input_Hatch.copy(), 1),
                    setStackSize(HatchList.Beam_Output_Hatch.copy(), 1),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 2),

                    setStackSize(LongRodList.Long_Hypogen_Rod.copy(), 1),
                    setStackSize(RotorList.Tairitsu_Rotor.copy(), 1),
                    setStackSize(RotorList.Churitsu_Rotor.copy(), 1),
                    setStackSize(RotorList.Shijima_Rotor.copy(), 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Infinity.copy(), 144 * 16),
                    setStackSize(MoltenList.Molten_Chromatic_Glass.copy(), 144 * 32),
                    setStackSize(MoltenList.Molten_Celestial_Tungsten.copy(), 144 * 12),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 8))
                .itemOutputs(HatchList.Bose_Einstein_Condensate_Hatch)
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Nanite Tier Detector Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 1),
                    setStackSize(HatchList.Electrode_Detector_Hatch.copy(), 1),
                    setStackSize(GTItemList.Sensor_UIV.copy(), 1),
                    setStackSize(SmallGearList.Small_Hypogen_Gear.copy(), 2),

                    setStackSize(GearList.Tairitsu_Gear.copy(), 1),
                    setStackSize(GearList.Churitsu_Gear.copy(), 1),
                    setStackSize(GearList.Shijima_Gear.copy(), 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Neutronium.copy(), 144 * 16),
                    setStackSize(MoltenList.Molten_Chromatic_Glass.copy(), 144 * 32),
                    setStackSize(MoltenList.Molten_Celestial_Tungsten.copy(), 144 * 12),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 8))
                .itemOutputs(HatchList.Bose_Einstein_Condensate_Hatch)
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Bose-Einstein Condensate Detector Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 1),
                    setStackSize(HatchList.Bose_Einstein_Condensate_Hatch.copy(), 1),
                    setStackSize(HatchList.Nanite_Tier_Detector_Hatch.copy(), 1),
                    setStackSize(PlateList.Tairitsu_Plate.copy(), 3),

                    setStackSize(PlateList.Churitsu_Plate.copy(), 3),
                    setStackSize(PlateList.Shijima_Plate.copy(), 3))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Churitsu.copy(), 144 * 16),
                    setStackSize(MoltenList.Molten_Chromatic_Glass.copy(), 144 * 32),
                    setStackSize(MoltenList.Molten_Celestial_Tungsten.copy(), 144 * 16),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 8))
                .itemOutputs(HatchList.Bose_Einstein_Condensate_Detector_Hatch)
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Line-Of-Sight Connector Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 1),
                    setStackSize(MinecraftList.Beacon.copy(), 1),
                    setStackSize(MultiMachineCasingList.Dimensional_Bridge.copy(), 2),
                    setStackSize(GTItemList.Conveyor_Module_UIV.copy(), 1),

                    setStackSize(FineWireList.Fine_Tairitsu_Wire.copy(), 8),
                    setStackSize(FineWireList.Fine_Churitsu_Wire.copy(), 8),
                    setStackSize(FineWireList.Fine_Shijima_Wire.copy(), 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Hypogen.copy(), 144 * 16),
                    setStackSize(MoltenList.Molten_Chromatic_Glass.copy(), 144 * 32),
                    setStackSize(MoltenList.Molten_Celestial_Tungsten.copy(), 144 * 16),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 8))
                .itemOutputs(HatchList.Line_Of_Sight_Connector_Hatch)
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Teleportation Node Controller Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 1),
                    setStackSize(MinecraftList.Beacon.copy(), 1),
                    setStackSize(MultiMachineCasingList.Dimensional_Bridge.copy(), 2),
                    setStackSize(GTItemList.Conveyor_Module_UIV.copy(), 1),

                    setStackSize(FineWireList.Fine_Tairitsu_Wire.copy(), 8),
                    setStackSize(FineWireList.Fine_Churitsu_Wire.copy(), 8),
                    setStackSize(FineWireList.Fine_Shijima_Wire.copy(), 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Hypogen.copy(), 144 * 16),
                    setStackSize(MoltenList.Molten_Chromatic_Glass.copy(), 144 * 32),
                    setStackSize(MoltenList.Molten_Celestial_Tungsten.copy(), 144 * 16),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 8))
                .itemOutputs(HatchList.Line_Of_Sight_Connector_Hatch)
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Bulk Catalyst Housing"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GTBlockList.Machine_Hull_UEV.copy(), 1),
                setStackSize(GTBlockList.Quantum_Chest_V.copy(), 1),
                setStackSize(FrameBoxList.Quantum_Frame_Box.copy(), 16),
                setStackSize(GTItemList.Field_Generator_UEV.copy(), 1),

                setStackSize(GTPPList.Quantum_Anomaly.copy(), 4),
                setStackSize(SuperdensePlateList.Superdense_Cosmic_Neutronium_Plate.copy(), 64),
                setStackSize(SuperdensePlateList.Superdense_Infinity_Catalyst_Plate.copy(), 32),
                setStackSize(SuperdensePlateList.Superdense_Infinity_Plate.copy(), 16))
            .fluidInputs(
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64),
                setStackSize(MoltenList.Molten_Abyssal_Alloy.copy(), 144 * 64 * 2),
                setStackSize(MoltenList.Molten_Octiron.copy(), 144 * 64 * 4))
            .itemOutputs(HatchList.Bulk_Catalyst_Housing)
            .eut(RECIPE_UEV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Cloud Computation Client Hatch"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(HatchList.Optical_Reception_Connector.copy(), 1),
                setStackSize(MultiMachineControllerList.Static_Network_Switch_With_QoS.copy(), 1),
                setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 64),
                setStackSize(OpenComputersList.Internet_Card.copy(), 1),

                setStackSize(DensePlateList.Dense_Infinity_Plate.copy(), 64),
                setStackSize(FoilList.Shirabon_Foil.copy(), 64),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 1),
                setStackSize(GTItemList.Energised_Tesseract.copy(), 1))
            .fluidInputs(
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 9),
                setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(), 500))
            .itemOutputs(setStackSize(HatchList.Cloud_Computation_Client_Hatch.copy(), 1))
            .eut(RECIPE_UMV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Cloud Computation Server Hatch"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(HatchList.Optical_Transmission_Connector.copy(), 1),
                setStackSize(MultiMachineControllerList.Static_Network_Switch_With_QoS.copy(), 1),
                setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 64),
                setStackSize(OpenComputersList.Internet_Card.copy(), 1),

                setStackSize(DensePlateList.Dense_Infinity_Plate.copy(), 64),
                setStackSize(FoilList.Shirabon_Foil.copy(), 64),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 1),
                setStackSize(GTItemList.Energised_Tesseract.copy(), 1))
            .fluidInputs(
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 9),
                setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(), 500))
            .itemOutputs(setStackSize(HatchList.Cloud_Computation_Server_Hatch.copy(), 1))
            .eut(RECIPE_UMV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Crafting Input Bus (ME)"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(HatchList.Stocking_Input_Bus_ME.copy(), 1),
                setStackSize(Appliedenergistics2List.ME_Storage_Component_4096k.copy(), 1),
                setStackSize(Appliedenergistics2List.ME_Controller.copy(), 1),
                setStackSize(Appliedenergistics2List.ME_Interface.copy(), 1),

                setStackSize(Appliedenergistics2List.Pattern_Capacity_Card.copy(), 3))
            .fluidInputs(setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 8))
            .itemOutputs(HatchList.Crafting_Input_Bus_ME)
            .eut(RECIPE_LuV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Data Orb Repository"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GTPPList.Integral_Framework_III.copy(), 2),
                setStackSize(GTItemList.Field_Generator_EV.copy(), 4),
                setStackSize(GTPPList.Energy_Core_EV.copy(), 2),
                setStackSize(PlateList.Pikyonium_64B_Plate.copy(), 8),

                setStackSize(ScrewList.Zeron_100_Screw.copy(), 16),
                setStackSize(BoltList.Trinium_Naquadah_Carbonite_Bolt.copy(), 16),
                setStackSize(RodList.Inconel_625_Rod.copy(), 16),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 32),

                setStackSize(GTItemList.Data_Orb.copy(), 32))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Zeron_100.copy(), 144 * 16),
                setStackSize(MoltenList.Molten_Arcanite.copy(), 144 * 8),
                setStackSize(MoltenList.Molten_Energy_Crystal.copy(), 144 * 8),
                setStackSize(MoltenList.Molten_Babbit_Alloy.copy(), 144 * 64))
            .itemOutputs(HatchList.Data_Orb_Repository)
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Energized Wireless Dynamo Hatch"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(HatchList.Laser_Source_Hatch65536_UMV.copy(), 1),
                setStackSize(BatteryList.Really_Ultimate_Battery_Empty.copy(), 1),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 4),
                setStackSize(GTItemList.Field_Generator_UMV.copy(), 1),

                setStackSize(WireList.SpaceTime_Wire_4x.copy(), 16),
                setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 1))
            .fluidInputs(
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 20),
                setStackSize(FluidList.Excited_Dimensionally_Transcendent_Stellar_Catalyst.copy(), 1000 * 8),
                setStackSize(MoltenList.Molten_Shirabon.copy(), 144 * 20))
            .itemOutputs(setStackSize(HatchList.Energized_Wireless_Dynamo_Hatch.copy(), 1))
            .eut(RECIPE_UMV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Energy hatch and dynamo hatch of LuV - UHV
        {
            // "LuV Dynamo Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_LuV.copy(), 1),
                    setStackSize(SpringList.Superconductor_Base_LuV_Spring.copy(), 2),
                    setStackSize(CircuitList.Ultra_High_Power_IC_Chip.copy(), 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),

                    setStackSize(GTItemList.Ludicrous_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_LuV.copy(), 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 5),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 2))
                .itemOutputs(HatchList.Dynamo_Hatch_LuV)
                .eut(RECIPE_LuV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "ZPM Dynamo Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_ZPM.copy(), 1),
                    setStackSize(SpringList.Superconductor_Base_ZPM_Spring.copy(), 4),
                    setStackSize(CircuitList.Nano_Power_IC_Chip.copy(), 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 2),

                    setStackSize(GTItemList.ZPM_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 10),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 4))
                .itemOutputs(HatchList.Dynamo_Hatch_ZPM)
                .eut(RECIPE_ZPM)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UV Dynamo Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UV.copy(), 1),
                    setStackSize(SpringList.Superconductor_Base_UV_Spring.copy(), 4),
                    setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 2),

                    setStackSize(GTItemList.Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UV.copy(), 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 20),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 8))
                .itemOutputs(HatchList.Dynamo_Hatch_UV)
                .eut(RECIPE_UV)
                .duration(40 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UHV Dynamo Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UHV.copy(), 1),
                    setStackSize(SpringList.Superconductor_Base_UHV_Spring.copy(), 8),
                    setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 2),

                    setStackSize(GTItemList.Highly_Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UHV.copy(), 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 40),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 16))
                .itemOutputs(HatchList.Dynamo_Hatch_UHV)
                .eut(RECIPE_UHV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UEV Dynamo Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UEV.copy(), 1),
                    setStackSize(SpringList.Superconductor_Base_UEV_Spring.copy(), 8),
                    setStackSize(CircuitList.Femto_Power_IC_Chip.copy(), 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 2),

                    setStackSize(GTItemList.Extremely_Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UEV.copy(), 1))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 20),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 32),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 8))
                .itemOutputs(HatchList.Dynamo_Hatch_UEV)
                .eut(RECIPE_UEV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UIV Dynamo Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 1),
                    setStackSize(SpringList.Superconductor_Base_UIV_Spring.copy(), 8),
                    setStackSize(CircuitList.Atto_Power_IC_Chip.copy(), 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 2),

                    setStackSize(GTItemList.Insanely_Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 1))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 20),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 16),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 16))
                .itemOutputs(HatchList.Dynamo_Hatch_UIV)
                .eut(RECIPE_UIV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UMV Dynamo Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UMV.copy(), 1),
                    setStackSize(SpringList.Superconductor_Base_UMV_Spring.copy(), 8),
                    setStackSize(CircuitList.Zepto_Power_IC_Chip.copy(), 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 2),

                    setStackSize(GTItemList.Mega_Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UMV.copy(), 1))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 40),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 32),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 32))
                .itemOutputs(HatchList.Dynamo_Hatch_UMV)
                .eut(RECIPE_UMV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UXV Dynamo Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),
                    setStackSize(SpringList.Superconductor_Base_UMV_Spring.copy(), 16),
                    setStackSize(CircuitList.Yocto_Power_IC_Chip.copy(), 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 2),

                    setStackSize(GTItemList.Extended_Mega_Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UXV.copy(), 1))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 80),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 64),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64))
                .itemOutputs(HatchList.Dynamo_Hatch_UXV)
                .eut(RECIPE_UXV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "LuV Energy Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_LuV.copy(), 1),
                    setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 2),
                    setStackSize(CircuitList.Ultra_High_Power_IC_Chip.copy(), 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),

                    setStackSize(GTItemList.Ludicrous_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_LuV.copy(), 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 5),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 2))
                .itemOutputs(HatchList.Energy_Hatch_LuV)
                .eut(RECIPE_LuV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "ZPM Energy Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_ZPM.copy(), 1),
                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 4),
                    setStackSize(CircuitList.Nano_Power_IC_Chip.copy(), 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 2),

                    setStackSize(GTItemList.ZPM_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 10),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 4))
                .itemOutputs(HatchList.Energy_Hatch_ZPM)
                .eut(RECIPE_ZPM)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UV Energy Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UV.copy(), 1),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 4),
                    setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 2),

                    setStackSize(GTItemList.Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UV.copy(), 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 20),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 8))
                .itemOutputs(HatchList.Energy_Hatch_UV)
                .eut(RECIPE_UV)
                .duration(40 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UHV Energy Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UHV.copy(), 1),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 8),
                    setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 2),

                    setStackSize(GTItemList.Highly_Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UHV.copy(), 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 40),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 16))
                .itemOutputs(HatchList.Energy_Hatch_UHV)
                .eut(RECIPE_UHV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UEV Energy Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UEV.copy(), 1),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 8),
                    setStackSize(CircuitList.Femto_Power_IC_Chip.copy(), 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 2),

                    setStackSize(GTItemList.Extremely_Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UEV.copy(), 1))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 20),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 32),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 8))
                .itemOutputs(HatchList.Energy_Hatch_UEV)
                .eut(RECIPE_UEV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UIV Energy Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 1),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 8),
                    setStackSize(CircuitList.Atto_Power_IC_Chip.copy(), 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 2),

                    setStackSize(GTItemList.Insanely_Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 1))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 20),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 16),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 16))
                .itemOutputs(HatchList.Energy_Hatch_UIV)
                .eut(RECIPE_UIV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UMV Energy Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UMV.copy(), 1),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 8),
                    setStackSize(CircuitList.Zepto_Power_IC_Chip.copy(), 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 2),

                    setStackSize(GTItemList.Mega_Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UMV.copy(), 1))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 40),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 32),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 32))
                .itemOutputs(HatchList.Energy_Hatch_UMV)
                .eut(RECIPE_UMV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UXV Energy Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 32),
                    setStackSize(CircuitList.Yocto_Power_IC_Chip.copy(), 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 2),

                    setStackSize(GTItemList.Extended_Mega_Ultimate_Voltage_Coil.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UXV.copy(), 1))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 80),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 64),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64))
                .itemOutputs(HatchList.Energy_Hatch_UXV)
                .eut(RECIPE_UXV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Filtered Beam Output Hatch"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(HatchList.Beam_Output_Hatch.copy(), 1),
                setStackSize(GTItemList.Sensor_UV.copy(), 4),
                setStackSize(GTItemList.Emitter_UV.copy(), 4),
                setStackSize(GTItemList.Activated_Carbon_Filter_Mesh.copy(), 32))
            .fluidInputs(setStackSize(FluidList.UU_Matter.copy(), 1000))
            .itemOutputs(HatchList.Filtered_Beam_Output_Hatch)
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Nanite Containment Bus"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(HatchList.Input_Bus_UHV.copy(), 1),
                setStackSize(GTBlockList.Quantum_Chest_IV.copy(), 1),
                setStackSize(GTItemList.Field_Generator_UHV.copy(), 1),
                setStackSize(AmunRaList.Nanite_Control_Module.copy(), 4),

                setStackSize(DensePlateList.Dense_Enriched_Naquadah_Alloy_Plate.copy(), 4),
                setStackSize(SuperdensePlateList.Superdense_Cosmic_Neutronium_Plate.copy(), 4))
            .fluidInputs(setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 16))
            .itemOutputs(HatchList.Nanite_Containment_Bus)
            .eut(RECIPE_UHV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Quantum Uplink ME Connector Hatch"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(HatchList.Optical_Reception_Connector.copy(), 1),
                setStackSize(Appliedenergistics2List.ME_Storage_Component_16384k.copy(), 1),
                setStackSize(AE2FluidCraftingList.ME_Dual_Interface.copy(), 1),
                setStackSize(Appliedenergistics2List.ME_Pattern_Terminal.copy(), 1),

                setStackSize(GTItemList.Robot_Arm_UV.copy(), 1),
                setStackSize(Appliedenergistics2List.Blank_Pattern.copy(), 64),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 32),
                setStackSize(MoltenList.Molten_Naquadria.copy(), 144 * 16))
            .itemOutputs(HatchList.Quantum_Uplink_ME_Connector_Hatch)
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Wireless Assembly Line Reception Connector"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(HatchList.Assembly_line_Reception_Connector.copy(), 1),
                setStackSize(MultiMachineControllerList.Data_Bank.copy(), 1),
                setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 64),
                setStackSize(OpenComputersList.Internet_Card.copy(), 1),

                setStackSize(SuperdensePlateList.Superdense_Neutronium_Plate.copy(), 4),
                setStackSize(FoilList.Infinity_Foil.copy(), 64),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 2),
                setStackSize(GTItemList.Sensor_UEV.copy(), 1))
            .fluidInputs(setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 8))
            .itemOutputs(HatchList.Wireless_Assembly_line_Reception_Connector)
            .eut(RECIPE_UEV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Wireless Data Bank Transmission Connector"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(HatchList.Data_Bank_Transmission_Connector.copy(), 1),
                setStackSize(MultiMachineControllerList.Data_Bank.copy(), 1),
                setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 64),
                setStackSize(OpenComputersList.Internet_Card.copy(), 1),

                setStackSize(SuperdensePlateList.Superdense_Neutronium_Plate.copy(), 4),
                setStackSize(FoilList.Infinity_Foil.copy(), 64),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 2),
                setStackSize(GTItemList.Sensor_UEV.copy(), 1))
            .fluidInputs(setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 8))
            .itemOutputs(HatchList.Wireless_Data_Bank_Transmission_Connector)
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
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.MV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.HV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.EV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.MAX, 4) };

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
                    GTValues.RA.stdBuilder()
                        .itemInputs(
                            Energy_Hatch[Wireless_Energy_Hatch_Tier],
                            setStackSize(GoodGeneratorList.Ameliorated_Superconduct_Coil.copy(), 1),
                            setStackSize(MultiMachineCasingList.Superconducting_Coil_Block.copy(), 1),
                            setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 1),

                            setStackSize(TecTechList.High_Power_Casing.copy(), 2),
                            setStackSize(WireList.SpaceTime_Wire_1x.copy(), 2),
                            setStackSize(DensePlateList.Dense_Infinity_Plate.copy(), 1),
                            Circuit_List[Wireless_Energy_Hatch_Tier],

                            setStackSize(GTItemList.Energised_Tesseract.copy(), 1))
                        .fluidInputs(
                            setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 9),
                            setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(), 500))
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
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.MAX, 4) };

                final ItemStack[] Wireless_Energy_Hatch = new ItemStack[] { HatchList.Wireless_Energy_Hatch4_EV,
                    HatchList.Wireless_Energy_Hatch4_IV.copy(), HatchList.Wireless_Energy_Hatch4_LuV,
                    HatchList.Wireless_Energy_Hatch4_ZPM.copy(), HatchList.Wireless_Energy_Hatch4_UV,
                    HatchList.Wireless_Energy_Hatch4_UHV.copy(), HatchList.Wireless_Energy_Hatch4_UEV,
                    HatchList.Wireless_Energy_Hatch4_UIV.copy(), HatchList.Wireless_Energy_Hatch4_UMV,
                    HatchList.Wireless_Energy_Hatch4_UXV };

                for (int Wireless_Energy_Hatch_Tier = 0; Wireless_Energy_Hatch_Tier
                    < 10; Wireless_Energy_Hatch_Tier++) {
                    GTValues.RA.stdBuilder()
                        .itemInputs(
                            Energy_Hatch[Wireless_Energy_Hatch_Tier],
                            setStackSize(GoodGeneratorList.Compact_Fusion_Coil.copy(), 1),
                            setStackSize(MultiMachineCasingList.Superconducting_Coil_Block.copy(), 1),
                            setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 1),

                            setStackSize(TecTechList.High_Power_Casing.copy(), 4),
                            setStackSize(WireList.SpaceTime_Wire_1x.copy(), 4),
                            setStackSize(TriplePlateList.Triple_Shirabon_Plate.copy(), 4),
                            setStackSize(DensePlateList.Dense_Flerovium_Plate.copy(), 4),

                            Circuit_List[Wireless_Energy_Hatch_Tier],
                            setStackSize(GTItemList.Energised_Tesseract.copy(), 1))
                        .fluidInputs(
                            setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 36),
                            setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(), 1000 * 2))
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
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.MAX, 4) };

                final ItemStack[] Wireless_Energy_Hatch = new ItemStack[] { HatchList.Wireless_Energy_Hatch16_EV,
                    HatchList.Wireless_Energy_Hatch16_IV.copy(), HatchList.Wireless_Energy_Hatch16_LuV,
                    HatchList.Wireless_Energy_Hatch16_ZPM.copy(), HatchList.Wireless_Energy_Hatch16_UV,
                    HatchList.Wireless_Energy_Hatch16_UHV.copy(), HatchList.Wireless_Energy_Hatch16_UEV,
                    HatchList.Wireless_Energy_Hatch16_UIV.copy(), HatchList.Wireless_Energy_Hatch16_UMV,
                    HatchList.Wireless_Energy_Hatch16_UXV };

                for (int Wireless_Energy_Hatch_Tier = 0; Wireless_Energy_Hatch_Tier
                    < 10; Wireless_Energy_Hatch_Tier++) {
                    GTValues.RA.stdBuilder()
                        .itemInputs(
                            Energy_Hatch[Wireless_Energy_Hatch_Tier],
                            setStackSize(GoodGeneratorList.Advanced_Compact_Fusion_Coil.copy(), 1),
                            setStackSize(MultiMachineCasingList.Superconducting_Coil_Block.copy(), 1),
                            setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 1),

                            setStackSize(TecTechList.High_Power_Casing.copy(), 16),
                            setStackSize(WireList.SpaceTime_Wire_1x.copy(), 16),
                            setStackSize(TriplePlateList.Triple_Shirabon_Plate.copy(), 16),
                            setStackSize(DensePlateList.Dense_Transcendent_Metal_Plate.copy(), 4),

                            Circuit_List[Wireless_Energy_Hatch_Tier],
                            setStackSize(GTItemList.Energised_Tesseract.copy(), 1))
                        .fluidInputs(
                            setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 144),
                            setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(), 1000 * 8))
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
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.MAX, 4) };

                final ItemStack[] Wireless_Energy_Hatch = new ItemStack[] { HatchList.Wireless_Energy_Hatch64_EV,
                    HatchList.Wireless_Energy_Hatch64_IV.copy(), HatchList.Wireless_Energy_Hatch64_LuV,
                    HatchList.Wireless_Energy_Hatch64_ZPM.copy(), HatchList.Wireless_Energy_Hatch64_UV,
                    HatchList.Wireless_Energy_Hatch64_UHV.copy(), HatchList.Wireless_Energy_Hatch64_UEV,
                    HatchList.Wireless_Energy_Hatch64_UIV.copy(), HatchList.Wireless_Energy_Hatch64_UMV,
                    HatchList.Wireless_Energy_Hatch64_UXV };

                for (int Wireless_Energy_Hatch_Tier = 0; Wireless_Energy_Hatch_Tier
                    < 10; Wireless_Energy_Hatch_Tier++) {
                    GTValues.RA.stdBuilder()
                        .itemInputs(
                            Energy_Hatch[Wireless_Energy_Hatch_Tier],
                            setStackSize(GoodGeneratorList.Compact_Fusion_Coil_MKII_Prototype.copy(), 1),
                            setStackSize(MultiMachineCasingList.Superconducting_Coil_Block.copy(), 1),
                            setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 1),

                            setStackSize(TecTechList.High_Power_Casing.copy(), 64),
                            setStackSize(WireList.SpaceTime_Wire_1x.copy(), 64),
                            setStackSize(TriplePlateList.Triple_Shirabon_Plate.copy(), 64),
                            setStackSize(DensePlateList.Dense_Metastable_Oganesson_Plate.copy(), 4),

                            Circuit_List[Wireless_Energy_Hatch_Tier],
                            setStackSize(GTItemList.Energised_Tesseract.copy(), 1))
                        .fluidInputs(
                            setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 9),
                            setStackSize(
                                FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(),
                                1000 * 32))
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
                    GTValues.RA.stdBuilder()
                        .itemInputs(
                            Energy_Hatch[Wireless_Energy_Hatch_Tier],
                            setStackSize(GoodGeneratorList.Compact_Fusion_Coil_MKII_Finaltype.copy(), 1),
                            setStackSize(
                                GTNHIntergalacticList.Dyson_Swarm_Module_Deployment_Unit_Superconducting_Magnet,
                                1),
                            setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 1),

                            setStackSize(TecTechList.High_Power_Casing.copy(), 64),
                            setStackSize(WireList.SpaceTime_Wire_1x.copy(), 64 * 16),
                            setStackSize(DensePlateList.Dense_Eternity_Plate.copy(), 32),
                            setStackSize(
                                DensePlateList.Dense_Magnetohydrodynamically_Constrained_Star_Matter_Plate,
                                16),

                            GTOreDictUnificator.get(OrePrefixes.circuit, Materials.MAX, 8),
                            setStackSize(GTItemList.Energised_Tesseract.copy(), 1))
                        .fluidInputs(
                            setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 36),
                            setStackSize(
                                FluidList.Excited_Dimensionally_Transcendent_Stellar_Catalyst.copy(),
                                1000 * 32))
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
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UMV.copy(), 1),
                    setStackSize(GTItemList.Diamond_Lens.copy(), 64 * 2),
                    setStackSize(GTItemList.Emitter_UMV.copy(), 64 * 2),
                    setStackSize(GTItemList.Electric_Pump_UMV.copy(), 64 * 2),

                    setStackSize(WireList.Quantium_Wire_1x.copy(), 64 * 8))
                .fluidInputs(setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 36))
                .itemOutputs(HatchList.Laser_Source_Hatch4194304_UMV)
                .eut(RECIPE_UMV)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UXV 4,194,304A/t Laser Source Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),
                    setStackSize(GTItemList.Diamond_Lens.copy(), 64 * 2),
                    setStackSize(GTItemList.Emitter_UXV.copy(), 64 * 2),
                    setStackSize(GTItemList.Electric_Pump_UXV.copy(), 64 * 2),

                    setStackSize(WireList.Black_Plutonium_Wire_1x.copy(), 64 * 8))
                .fluidInputs(setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 36))
                .itemOutputs(HatchList.Laser_Source_Hatch4194304_UXV)
                .eut(RECIPE_UXV)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UXV 16,777,216A/t Laser Source Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),
                    setStackSize(GTItemList.Diamond_Lens.copy(), 64 * 4),
                    setStackSize(GTItemList.Emitter_UXV.copy(), 64 * 4),
                    setStackSize(GTItemList.Electric_Pump_UXV.copy(), 64 * 4),

                    setStackSize(WireList.Black_Plutonium_Wire_1x.copy(), 64 * 16))
                .fluidInputs(setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 72))
                .itemOutputs(HatchList.Laser_Source_Hatch1677216_UXV)
                .eut(RECIPE_UXV)
                .duration(110 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Legendary Laser Source Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(3),

                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),
                    setStackSize(GTItemList.Diamond_Lens.copy(), 64 * 8),
                    setStackSize(GTItemList.Emitter_UXV.copy(), 64 * 8),
                    setStackSize(GTItemList.Electric_Pump_UXV.copy(), 64 * 8),

                    setStackSize(WireList.Black_Plutonium_Wire_1x.copy(), 64 * 32))
                .fluidInputs(setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 144))
                .itemOutputs(HatchList.Laser_Source_Hatch_Legendary)
                .eut(RECIPE_UXV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UMV 4,194,304A/t Laser Target Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UMV.copy(), 1),
                    setStackSize(GTItemList.Diamond_Lens.copy(), 64 * 2),
                    setStackSize(GTItemList.Sensor_UMV.copy(), 64 * 2),
                    setStackSize(GTItemList.Electric_Pump_UMV.copy(), 64 * 2),

                    setStackSize(WireList.Quantium_Wire_1x.copy(), 64 * 8))
                .fluidInputs(setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 36))
                .itemOutputs(HatchList.Laser_Target_Hatch4194304_UMV)
                .eut(RECIPE_UMV)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UXV 4,194,304A/t Laser Target Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),
                    setStackSize(GTItemList.Diamond_Lens.copy(), 64 * 2),
                    setStackSize(GTItemList.Sensor_UXV.copy(), 64 * 2),
                    setStackSize(GTItemList.Electric_Pump_UXV.copy(), 64 * 2),

                    setStackSize(WireList.Black_Plutonium_Wire_1x.copy(), 64 * 8))
                .fluidInputs(setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 36))
                .itemOutputs(HatchList.Laser_Target_Hatch4194304_UXV)
                .eut(RECIPE_UXV)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UXV 16,777,216A/t Laser Target Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),
                    setStackSize(GTItemList.Diamond_Lens.copy(), 64 * 4),
                    setStackSize(GTItemList.Sensor_UXV.copy(), 64 * 4),
                    setStackSize(GTItemList.Electric_Pump_UXV.copy(), 64 * 4),

                    setStackSize(WireList.Black_Plutonium_Wire_1x.copy(), 64 * 16))
                .fluidInputs(setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 72))
                .itemOutputs(HatchList.Laser_Target_Hatch1677216_UXV)
                .eut(RECIPE_UXV)
                .duration(110 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Legendary Laser Target Hatch"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(3),

                    setStackSize(GTBlockList.Machine_Hull_UXV.copy(), 1),
                    setStackSize(GTItemList.Diamond_Lens.copy(), 64 * 8),
                    setStackSize(GTItemList.Sensor_UXV.copy(), 64 * 8),
                    setStackSize(GTItemList.Electric_Pump_UXV.copy(), 64 * 8),

                    setStackSize(WireList.Black_Plutonium_Wire_1x.copy(), 64 * 32))
                .fluidInputs(setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 144))
                .itemOutputs(HatchList.Laser_Target_Hatch_Legendary)
                .eut(RECIPE_UXV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // ME Bus/Hatch
        {
            // "Advanced Stocking Input Bus (ME)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(HatchList.Input_Bus_LuV.copy(), 1),
                    setStackSize(Appliedenergistics2List.ME_Interface.copy(), 1),
                    setStackSize(GTItemList.Conveyor_Module_IV.copy(), 1),
                    setStackSize(Appliedenergistics2List.Acceleration_Card.copy(), 4))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 2),
                    setStackSize(FluidList.Lubricant.copy(), 500))
                .itemOutputs(HatchList.Advanced_Stocking_Input_Bus_ME)
                .eut(RECIPE_LuV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Crafting Input Bus (ME)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(HatchList.Stocking_Input_Bus_ME.copy(), 1),
                    setStackSize(Appliedenergistics2List.ME_Storage_Component_4096k.copy(), 1),
                    setStackSize(Appliedenergistics2List.ME_Controller.copy(), 1),
                    setStackSize(Appliedenergistics2List.ME_Interface_Terminal.copy(), 1),
                    setStackSize(Appliedenergistics2List.Pattern_Capacity_Card.copy(), 3))
                .fluidInputs(setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 8))
                .itemOutputs(HatchList.Crafting_Input_Bus_ME)
                .eut(RECIPE_LuV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Neutron Accelerator
        {
            // "Neutron Accelerator LuV"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GoodGeneratorList.Inverter.copy(), 2),
                    setStackSize(GTBlockList.Machine_Hull_LuV.copy(), 1),
                    setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 16),
                    setStackSize(PlateList.Nether_Star_Plate.copy(), 1),

                    setStackSize(PlateList.Polybenzimidazole_PBI_Sheet.copy(), 4),
                    setStackSize(PlateList.Magnetic_Neodymium_Plate.copy(), 8),
                    setStackSize(GTItemList.Electric_Motor_LuV.copy(), 2))
                .fluidInputs(setStackSize(GasList.Argon.copy(), 1000 * 3))
                .itemOutputs(HatchList.Neutron_Accelerator_LuV)
                .eut(RECIPE_LuV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Neutron Accelerator ZPM"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GoodGeneratorList.Inverter.copy(), 2),
                    setStackSize(GTBlockList.Machine_Hull_ZPM.copy(), 1),
                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 16),
                    setStackSize(PlateList.Nether_Star_Plate.copy(), 1),

                    setStackSize(DoublePlateList.Double_Polybenzimidazole_PBI_Sheet.copy(), 4),
                    setStackSize(PlateList.Magnetic_Samarium_Plate.copy(), 8),
                    setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 2))
                .fluidInputs(setStackSize(GasList.Xenon.copy(), 1000 * 3))
                .itemOutputs(HatchList.Neutron_Accelerator_ZPM)
                .eut(RECIPE_ZPM)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Neutron Accelerator UV"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GoodGeneratorList.Inverter.copy(), 4),
                    setStackSize(GTBlockList.Machine_Hull_UV.copy(), 1),
                    setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 16),
                    setStackSize(PlateList.Nether_Star_Plate.copy(), 2),

                    setStackSize(TriplePlateList.Triple_Polybenzimidazole_PBI_Sheet.copy(), 4),
                    setStackSize(GTItemList.ZPM_Voltage_Coil.copy(), 8),
                    setStackSize(LongRodList.Long_Nickel_Zinc_Ferrite_Rod.copy(), 16),
                    setStackSize(GTItemList.Electric_Motor_UV.copy(), 2))
                .fluidInputs(setStackSize(GasList.Oganesson.copy(), 1000 * 3))
                .itemOutputs(HatchList.Neutron_Accelerator_UV)
                .eut(RECIPE_UV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Neutron Accelerator UHV"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GoodGeneratorList.Inverter.copy(), 8),
                    setStackSize(GTBlockList.Machine_Hull_UHV.copy(), 1),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 16),
                    setStackSize(PlateList.Orundum_Plate.copy(), 2),

                    setStackSize(TriplePlateList.Triple_Kevlar_Plate.copy(), 8),
                    setStackSize(GTItemList.Ultimate_Voltage_Coil.copy(), 8),
                    setStackSize(LongRodList.Long_Neutronium_Rod.copy(), 16),
                    setStackSize(GTItemList.Electric_Motor_UHV.copy(), 2))
                .fluidInputs(
                    setStackSize(GasList.Oganesson.copy(), 1000 * 12),
                    setStackSize(FluidList.Extreme_Temperature_Treated_Water_Grade_5.copy(), 1000 * 16))
                .itemOutputs(HatchList.Neutron_Accelerator_UHV)
                .eut(RECIPE_UHV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Neutron Accelerator UEV"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GoodGeneratorList.Inverter.copy(), 16),
                    setStackSize(GTBlockList.Machine_Hull_UEV.copy(), 1),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 16),
                    setStackSize(PlateList.Orundum_Plate.copy(), 8),

                    setStackSize(DensePlateList.Dense_Kevlar_Plate.copy(), 16),
                    setStackSize(GTItemList.Highly_Ultimate_Voltage_Coil.copy(), 8),
                    setStackSize(LongRodList.Long_Attuned_Tengam_Rod.copy(), 16),
                    setStackSize(GTItemList.Electric_Motor_UEV.copy(), 2))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Metastable_Oganesson.copy(), 144 * 3),
                    setStackSize(FluidList.Ultraviolet_Treated_Electrically_Neutral_Water_Grade_6.copy(), 1000 * 16))
                .itemOutputs(HatchList.Neutron_Accelerator_UEV)
                .eut(RECIPE_UEV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Neutron Accelerator UIV"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GoodGeneratorList.Inverter.copy(), 32),
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 1),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 16),
                    setStackSize(PlateList.Chromatic_Glass_Plate.copy(), 8),

                    setStackSize(DoublePlateList.Double_Radox_Polymer_Sheet.copy(), 16),
                    setStackSize(GTItemList.Extremely_Ultimate_Voltage_Coil.copy(), 8),
                    setStackSize(GTItemList.Raw_Tesseract.copy(), 8),
                    setStackSize(GTItemList.Tengam_Electromagnet.copy(), 1),

                    setStackSize(GTItemList.Electric_Motor_UIV.copy(), 2),
                    setStackSize(LongRodList.Long_Infinity_Rod.copy(), 16))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Metastable_Oganesson.copy(), 144 * 12),
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 4),
                    setStackSize(FluidList.Degassed_Decontaminant_Free_Water_Grade_7.copy(), 1000 * 16))
                .itemOutputs(HatchList.Neutron_Accelerator_UIV)
                .eut(RECIPE_UIV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Neutron Accelerator UMV"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GoodGeneratorList.Inverter.copy(), 64),
                    setStackSize(GTBlockList.Machine_Hull_UMV.copy(), 1),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 16),
                    setStackSize(PlateList.Chromatic_Glass_Plate.copy(), 32),

                    setStackSize(SuperdensePlateList.Superdense_Radox_Polymer_Sheet.copy(), 1),
                    setStackSize(GTItemList.Insanely_Ultimate_Voltage_Coil.copy(), 8),
                    setStackSize(GTItemList.Energised_Tesseract.copy(), 12),
                    setStackSize(GTItemList.Tengam_Electromagnet.copy(), 1),

                    setStackSize(GTItemList.Electric_Motor_UMV.copy(), 2),
                    setStackSize(LongRodList.Long_Creon_Rod.copy(), 16),
                    setStackSize(LongRodList.Long_Mellion_Rod.copy(), 16))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Shirabon.copy(), 144 * 3),
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 8),
                    setStackSize(FluidList.Subatomically_Perfect_Water_Grade_8.copy(), 1000 * 16))
                .itemOutputs(HatchList.Neutron_Accelerator_UMV)
                .eut(RECIPE_UMV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Object Holder"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(HatchList.Input_Bus_ZPM.copy(), 1),
                setStackSize(TecTechList.Advanced_Computer_Casing.copy(), 1),
                setStackSize(GTItemList.Emitter_ZPM.copy(), 8),
                setStackSize(GTItemList.Robot_Arm_ZPM.copy(), 1),

                setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 2),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 1),
                setStackSize(CableList.Naquadah_Cable_2x.copy(), 2),
                setStackSize(FineWireList.Fine_Naquadah_Wire.copy(), 16),

                setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 2))
            .fluidInputs(
                setStackSize(FluidList.UU_Matter.copy(), 500),
                setStackSize(MoltenList.Molten_Iridium.copy(), 144 * 8),
                setStackSize(FluidList.IC2_Coolant.copy(), 1000))
            .itemOutputs(HatchList.Object_Holder)
            .eut(RECIPE_UV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Turbine Housing"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GTBlockList.Machine_Hull_UV.copy(), 4),
                setStackSize(GTItemList.Conveyor_Module_UV.copy(), 24),
                setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 32),
                setStackSize(GTItemList.Electric_Piston_ZPM.copy(), 16),

                setStackSize(GTPPList.Energy_Core_LuV.copy(), 8),
                setStackSize(PlateList.Advanced_Nitinol_Plate.copy(), 24),
                setStackSize(ScrewList.Titansteel_Screw.copy(), 48),
                setStackSize(BoltList.Arceus_Alloy_2B_Bolt.copy(), 32),

                setStackSize(RodList.Zeron_100_Rod.copy(), 12),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 20),
                setStackSize(RotorList.Lafium_Compound_Rotor.copy(), 16))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Advanced_Nitinol.copy(), 144 * 32),
                setStackSize(MoltenList.Molten_Cinobite_A243.copy(), 144 * 16),
                setStackSize(MoltenList.Molten_Arceus_Alloy_2B.copy(), 144 * 16),
                setStackSize(MoltenList.Molten_Babbit_Alloy.copy(), 144 * 64 * 2))
            .itemOutputs(setStackSize(HatchList.Turbine_Housing.copy(), 4))
            .eut(RECIPE_UV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);
    }
}
