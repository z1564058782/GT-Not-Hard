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

import EnumList.EnumFluidList.FluidList;
import EnumList.EnumFluidList.GasList;
import EnumList.EnumFluidList.MoltenList;
import EnumList.EnumFluidList.PlasmaList;
import EnumList.EnumItemList.EnumGTList.BatteryList;
import EnumList.EnumItemList.EnumGTList.CableList;
import EnumList.EnumItemList.EnumGTList.CircuitList;
import EnumList.EnumItemList.EnumGTList.GTBlockList;
import EnumList.EnumItemList.EnumGTList.GTItemList;
import EnumList.EnumItemList.EnumGTList.GTPPList;
import EnumList.EnumItemList.EnumGTList.HatchList;
import EnumList.EnumItemList.EnumGTList.MachineList;
import EnumList.EnumItemList.EnumGTList.MultiMachineCasingList;
import EnumList.EnumItemList.EnumGTList.MultiMachineControllerList;
import EnumList.EnumItemList.EnumGTList.PipeList;
import EnumList.EnumItemList.EnumGTList.WireList;
import EnumList.EnumItemList.EnumMaterialList.BlockList;
import EnumList.EnumItemList.EnumMaterialList.BoltList;
import EnumList.EnumItemList.EnumMaterialList.DensePlateList;
import EnumList.EnumItemList.EnumMaterialList.DoublePlateList;
import EnumList.EnumItemList.EnumMaterialList.FineWireList;
import EnumList.EnumItemList.EnumMaterialList.FoilList;
import EnumList.EnumItemList.EnumMaterialList.FrameBoxList;
import EnumList.EnumItemList.EnumMaterialList.GearList;
import EnumList.EnumItemList.EnumMaterialList.LongRodList;
import EnumList.EnumItemList.EnumMaterialList.MiscPlateList;
import EnumList.EnumItemList.EnumMaterialList.PlateList;
import EnumList.EnumItemList.EnumMaterialList.RingList;
import EnumList.EnumItemList.EnumMaterialList.RodList;
import EnumList.EnumItemList.EnumMaterialList.RotorList;
import EnumList.EnumItemList.EnumMaterialList.ScrewList;
import EnumList.EnumItemList.EnumMaterialList.SmallGearList;
import EnumList.EnumItemList.EnumMaterialList.SuperdensePlateList;
import EnumList.EnumItemList.EnumMiscList.SingularityList;
import EnumList.EnumItemList.EnumModList.AmunRaList;
import EnumList.EnumItemList.EnumModList.Appliedenergistics2List;
import EnumList.EnumItemList.EnumModList.BloodMagicList;
import EnumList.EnumItemList.EnumModList.GTNHIntergalacticList;
import EnumList.EnumItemList.EnumModList.GTNHLanthanidesList;
import EnumList.EnumItemList.EnumModList.GalaxySpaceList;
import EnumList.EnumItemList.EnumModList.GoodGeneratorList;
import EnumList.EnumItemList.EnumModList.KekzTechList;
import EnumList.EnumItemList.EnumModList.OpenBlocksList;
import EnumList.EnumItemList.EnumModList.OpenComputersList;
import EnumList.EnumItemList.EnumModList.TecTechList;
import EnumList.EnumItemList.EnumModList.ThaumcraftList;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GTOreDictUnificator;

public class ChaosAssemblyLine_MachineRecipe_Normal {

    public static void addChaosAssemblyLine_NormalMachineRecipe() {
        // "Advanced Assembly Line"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Assembly_Line.copy(), 1),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 2),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.EV, 8),

                setStackSize(GTBlockList.Chest_Buffer_LuV.copy(), 1))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 9),
                setStackSize(FluidList.Lubricant.copy(), 1000 * 2))
            .itemOutputs(MultiMachineControllerList.Advanced_Assembly_Line)
            .eut(RECIPE_LuV)
            .duration(180 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Beam Crafter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Target_Chamber.copy(), 1),
                setStackSize(GTItemList.Field_Generator_ZPM.copy(), 4),
                setStackSize(GTNHLanthanidesList.Shielded_Accelerator_Casing.copy(), 32),
                setStackSize(MultiMachineControllerList.Large_Molecular_Assembler.copy(), 2))
            .fluidInputs(setStackSize(FluidList.UU_Matter.copy(), 1000 * 8))
            .itemOutputs(MultiMachineControllerList.Beam_Crafter)
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Beam Splitter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Weighted_Network_Switch_With_QoS.copy(), 1),
                setStackSize(GTItemList.Samarium_Electromagnet.copy(), 1),
                setStackSize(GTNHLanthanidesList.Shielded_Accelerator_Casing.copy(), 4))
            .fluidInputs(setStackSize(FluidList.Super_Coolant.copy(), 1000 * 16))
            .itemOutputs(MultiMachineControllerList.Beam_Splitter)
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // BEC
        {
            // "Bose-Einstein Condensate Containment Field"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 1),
                    setStackSize(MultiMachineCasingList.Fine_Structure_Constant_Manipulator.copy(), 4),
                    setStackSize(KekzTechList.TFFT_Storage_Field_Block_TierIX.copy(), 8),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 32),
                    setStackSize(DensePlateList.Dense_Tairitsu_Plate.copy(), 16),
                    setStackSize(DensePlateList.Dense_Churitsu_Plate.copy(), 16),
                    setStackSize(DensePlateList.Dense_Shijima_Plate.copy(), 16),

                    setStackSize(GTItemList.Stable_Baryon_Containment_Unit.copy(), 8),
                    setStackSize(GTItemList.Stable_Lepton_Containment_Unit.copy(), 8),
                    setStackSize(GTItemList.Stable_Meson_Containment_Unit.copy(), 8),
                    setStackSize(GTItemList.Stable_Boson_Containment_Unit.copy(), 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Chromatic_Glass.copy(), 144 * 64 * 32),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 16),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(), 1000 * 2000),
                    setStackSize(MoltenList.Molten_SpaceTime.copy(), 144 * 64))
                .itemOutputs(MultiMachineControllerList.Bose_Einstein_Condensate_Containment_Field)
                .eut(RECIPE_UMV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Bose-Einstein Condensate Entanglement Apparatus"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.Thermic_Heating_Device.copy(), 1),
                    setStackSize(MultiMachineCasingList.Electromagnetically_Isolated_Casing.copy(), 4),
                    setStackSize(MultiMachineCasingList.Hypogen_Coil_Block.copy(), 16),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 16),
                    setStackSize(DensePlateList.Dense_Tairitsu_Plate.copy(), 8),
                    setStackSize(DensePlateList.Dense_Churitsu_Plate.copy(), 8),
                    setStackSize(DensePlateList.Dense_Shijima_Plate.copy(), 8),

                    setStackSize(GTItemList.Emitter_UIV.copy(), 16),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 16),
                    setStackSize(GTPPList.Quantum_Anomaly.copy(), 16))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Chromatic_Glass.copy(), 144 * 64 * 16),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 8),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(), 1000 * 1000),
                    setStackSize(MoltenList.Molten_SpaceTime.copy(), 144 * 32))
                .itemOutputs(MultiMachineControllerList.Bose_Einstein_Condensate_Entanglement_Apparatus)
                .eut(RECIPE_UMV)
                .duration(150 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Bose-Einstein Condensate Maxwell Gate"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(Appliedenergistics2List.ME_Storage_Bus.copy(), 1),
                    setStackSize(MultiMachineCasingList.Electromagnetically_Isolated_Casing.copy(), 4),
                    setStackSize(GTItemList.Fluid_Regulator_UIV.copy(), 4),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 8),
                    setStackSize(DensePlateList.Dense_Tairitsu_Plate.copy(), 4),
                    setStackSize(DensePlateList.Dense_Churitsu_Plate.copy(), 4),
                    setStackSize(DensePlateList.Dense_Shijima_Plate.copy(), 4))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Chromatic_Glass.copy(), 144 * 64 * 8),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 4),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(), 1000 * 500),
                    setStackSize(MoltenList.Molten_SpaceTime.copy(), 144 * 16))
                .itemOutputs(MultiMachineControllerList.Bose_Einstein_Condensate_Maxwell_Gate)
                .eut(RECIPE_UMV)
                .duration(75 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Bose-Einstein Condensate Observation Array"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.Advanced_Assembly_Line.copy(), 1),
                    setStackSize(MultiMachineCasingList.Coherence_Preserving_Plasma_Conduit.copy(), 4),
                    setStackSize(MultiMachineCasingList.Dimensional_Bridge.copy(), 16),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 16),
                    setStackSize(DensePlateList.Dense_Tairitsu_Plate.copy(), 8),
                    setStackSize(DensePlateList.Dense_Churitsu_Plate.copy(), 8),
                    setStackSize(DensePlateList.Dense_Shijima_Plate.copy(), 8),

                    setStackSize(GTItemList.Sensor_UIV.copy(), 16),
                    setStackSize(GTItemList.Robot_Arm_UIV.copy(), 16),
                    setStackSize(GTItemList.Chromatic_Lens.copy(), 64),
                    setStackSize(Appliedenergistics2List.Singularity.copy(), 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Chromatic_Glass.copy(), 144 * 64 * 16),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 8),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(), 1000 * 1000),
                    setStackSize(MoltenList.Molten_SpaceTime.copy(), 144 * 32))
                .itemOutputs(MultiMachineControllerList.Bose_Einstein_Condensate_Observation_Array)
                .eut(RECIPE_UMV)
                .duration(150 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Observation Array Teleportation Node"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Coherence_Preserving_Plasma_Conduit.copy(), 4),
                    setStackSize(MultiMachineCasingList.Dimensional_Bridge.copy(), 16),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 16),

                    setStackSize(DensePlateList.Dense_Tairitsu_Plate.copy(), 8),
                    setStackSize(DensePlateList.Dense_Churitsu_Plate.copy(), 8),
                    setStackSize(DensePlateList.Dense_Shijima_Plate.copy(), 8),
                    setStackSize(GTItemList.Emitter_UIV.copy(), 8),

                    setStackSize(GTItemList.Conveyor_Module_UIV.copy(), 8),
                    setStackSize(SingularityList.Eternal_Singularity.copy(), 4),
                    setStackSize(Appliedenergistics2List.Singularity.copy(), 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Chromatic_Glass.copy(), 144 * 64 * 16),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 8),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(), 1000 * 1000),
                    setStackSize(MoltenList.Molten_SpaceTime.copy(), 144 * 32))
                .itemOutputs(MultiMachineControllerList.Bose_Einstein_Condensate_Observation_Array)
                .eut(RECIPE_UMV)
                .duration(150 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Bio Chamber"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineCasingList.Clean_Stainless_Steel_Machine_Casing.copy(), 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 2),
                setStackSize(CircuitList.Stemcells.copy(), 64),
                setStackSize(GTItemList.Fluid_Regulator_ZPM.copy(), 1),

                setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 1),
                setStackSize(GTItemList.Sensor_ZPM.copy(), 4),
                setStackSize(FineWireList.Fine_Holmium_Wire.copy(), 32))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 32),
                setStackSize(FluidList.Growth_Catalyst_Medium.copy(), 144 * 64 * 3))
            .itemOutputs(MultiMachineControllerList.Bio_Chamber)
            .eut(RECIPE_UV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Circuit Assembly Line"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MachineList.Circuit_Assembler_LuV.copy(), 1),
                setStackSize(GTItemList.Robot_Arm_LuV.copy(), 4),
                setStackSize(GTItemList.Electric_Motor_LuV.copy(), 4),
                setStackSize(GTItemList.Field_Generator_LuV.copy(), 1),

                setStackSize(GTItemList.Emitter_LuV.copy(), 1),
                setStackSize(GTItemList.Sensor_LuV.copy(), 1),
                setStackSize(PlateList.Rhodium_Plated_Palladium_Plate.copy(), 8))
            .fluidInputs(setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 10))
            .itemOutputs(MultiMachineControllerList.Circuit_Assembly_Line)
            .eut(RECIPE_ZPM)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Component Assembly Line"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Assembly_Line.copy(), 16),
                setStackSize(MultiMachineCasingList.Assembler_Machine_Casing.copy(), 16),
                setStackSize(MultiMachineCasingList.Assembly_Line_Casing.copy(), 32),
                setStackSize(GTItemList.Robot_Arm_UV.copy(), 16),

                setStackSize(GTItemList.Conveyor_Module_UV.copy(), 32),
                setStackSize(GTItemList.Electric_Motor_UV.copy(), 32),
                setStackSize(PipeList.PBI_Fluid_Pipe.copy(), 16),
                setStackSize(SuperdensePlateList.Superdense_Iridium_Plate.copy(), 4),

                setStackSize(MachineList.Fluid_Solidifier_ZPM.copy(), 16),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 16),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 20),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 24))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 12),
                setStackSize(MoltenList.Molten_Naquadria.copy(), 144 * 16),
                setStackSize(FluidList.Lubricant.copy(), 1000 * 5))
            .itemOutputs(MultiMachineControllerList.Component_Assembly_Line)
            .eut(RECIPE_UHV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Cooling Tower"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineCasingList.Reinforced_Photolithographic_Framework_Casing.copy(), 4),
                setStackSize(MultiMachineCasingList.Superconducting_Coil_Block.copy(), 16),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 2),
                setStackSize(FoilList.Damascus_Steel_Foil.copy(), 16),

                setStackSize(GTItemList.Electric_Pump_UV.copy(), 1),
                setStackSize(GTItemList.Sensor_UV.copy(), 4),
                setStackSize(FineWireList.Fine_Infinity_Wire.copy(), 32))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 32),
                setStackSize(FluidList.Super_Coolant.copy(), 1000 * 8))
            .itemOutputs(MultiMachineControllerList.Cooling_Tower)
            .eut(RECIPE_UV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Data Bank"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Static_Network_Switch_With_QoS.copy(), 1),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 2),
                setStackSize(GTItemList.Data_Orb.copy(), 1),
                setStackSize(GTItemList.Computer_Monitor_Cover.copy(), 1))
            .fluidInputs(
                setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 2).copy(),
                setStackSize(GasList.Hydrogen.copy(), 1000))
            .itemOutputs(MultiMachineControllerList.Data_Bank)
            .eut(RECIPE_LuV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Dimensionally Transcendent Plasma Forge"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineCasingList.Dimensional_Bridge.copy(), 4),
                setStackSize(MultiMachineControllerList.Exothermic_Hearth.copy(), 16),
                setStackSize(HatchList.Energy_Hatch_UEV.copy(), 4),
                setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 96),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 20),
                setStackSize(GTItemList.Field_Generator_UEV.copy(), 4),
                setStackSize(SingularityList.Eternal_Singularity.copy(), 4),
                setStackSize(GTPPList.Quantum_Anomaly.copy(), 1),

                setStackSize(SuperdensePlateList.Superdense_Osmiridium_Plate.copy(), 4),
                setStackSize(GTItemList.Electric_Pump_UEV.copy(), 4),
                setStackSize(BatteryList.Really_Ultimate_Battery_Empty.copy(), 1))
            .fluidInputs(
                setStackSize(GasList.Oganesson.copy(), 1000 * 64 * 2),
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 8),
                setStackSize(MoltenList.Molten_Californium.copy(), 144 * 64 * 4),
                setStackSize(MoltenList.Molten_Enriched_Naquadah.copy(), 144 * 64 * 4))
            .itemOutputs(MultiMachineControllerList.Dimensionally_Transcendent_Plasma_Forge)
            .eut(RECIPE_UIV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Draconic Evolution Fusion Crafter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MachineList.Assembler_UHV.copy(), 1),
                setStackSize(MultiMachineCasingList.Bloody_Ichorium_Fusion_Casing.copy(), 1),
                setStackSize(DensePlateList.Dense_Gaia_Spirit_Plate.copy(), 1),
                setStackSize(MultiMachineCasingList.Awakened_Draconium_Coil_Block.copy(), 8),

                setStackSize(GTItemList.Electric_Motor_UHV.copy(), 8),
                setStackSize(GTItemList.Robot_Arm_UHV.copy(), 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),
                setStackSize(GTItemList.Gravi_Star.copy(), 4),

                setStackSize(ThaumcraftList.Primordial_Pearl.copy(), 1),
                setStackSize(BloodMagicList.Soul_Shard.copy(), 8),
                setStackSize(BloodMagicList.Life_Shard.copy(), 8),
                setStackSize(SuperdensePlateList.Superdense_Void_Metal_Plate.copy(), 1))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 20),
                setStackSize(MoltenList.Molten_Void_Metal.copy(), 144 * 20),
                setStackSize(MoltenList.Molten_Awakened_Draconium.copy(), 144 * 10))
            .itemOutputs(MultiMachineControllerList.Draconic_Evolution_Fusion_Crafter)
            .eut(RECIPE_UEV)
            .duration(75 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Electric Implosion Compressor"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Implosion_Compressor.copy(), 1),
                setStackSize(SuperdensePlateList.Superdense_Neutronium_Plate.copy(), 1),
                setStackSize(LongRodList.Long_Osmium_Rod.copy(), 64),
                setStackSize(RingList.Osmium_Ring.copy(), 64),

                setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64),
                setStackSize(GTItemList.Electric_Piston_UV.copy(), 64))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 10),
                setStackSize(MoltenList.Molten_Osmium.copy(), 144 * 10),
                setStackSize(MoltenList.Molten_Neutronium.copy(), 144 * 10))
            .itemOutputs(MultiMachineControllerList.Electric_Implosion_Compressor)
            .eut(RECIPE_UV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Elemental Duplicator"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GTBlockList.Machine_Hull_ZPM.copy(), 4),
                setStackSize(GTItemList.Field_Generator_IV.copy(), 16),
                setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 16),
                setStackSize(GTItemList.Electric_Piston_ZPM.copy(), 4),

                setStackSize(GTPPList.Energy_Core_LuV.copy(), 2),
                setStackSize(PlateList.Pikyonium_64B_Plate.copy(), 16),
                setStackSize(ScrewList.Pikyonium_64B_Screw.copy(), 32),
                setStackSize(BoltList.Trinium_Naquadah_Carbonite_Bolt.copy(), 32),

                setStackSize(RodList.Zeron_100_Rod.copy(), 16),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 20),
                setStackSize(GTItemList.Data_Orb.copy(), 32),
                setStackSize(GTPPList.Quantum_Anomaly.copy(), 1))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Pikyonium_64B.copy(), 144 * 32),
                setStackSize(MoltenList.Molten_Lafium_Compound.copy(), 144 * 16),
                setStackSize(MoltenList.Molten_Trinium_Naquadah_Carbonite.copy(), 144 * 16),
                setStackSize(MoltenList.Molten_Babbit_Alloy.copy(), 144 * 64 * 2))
            .itemOutputs(MultiMachineControllerList.Elemental_Duplicator)
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Endothermic Fridge"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Vacuum_Freezer.copy(), 64),
                setStackSize(MultiMachineControllerList.Cryogenic_Freezer.copy(), 8),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 8),
                setStackSize(MultiMachineCasingList.Coolant_Duct.copy(), 4),

                setStackSize(RodList.Callisto_Ice_Rod.copy(), 32),
                setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 8),
                setStackSize(GTItemList.Fluid_Regulator_ZPM.copy(), 8),
                setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 32),

                setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 16),
                setStackSize(SuperdensePlateList.Superdense_Ledox_Plate.copy(), 8),
                setStackSize(SuperdensePlateList.Superdense_Aluminium_Plate.copy(), 8))
            .fluidInputs(
                setStackSize(FluidList.Gelid_Cryotheum.copy(), 1000 * 256),
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 10),
                setStackSize(FluidList.Lubricant.copy(), 1000 * 16))
            .itemOutputs(MultiMachineControllerList.Endothermic_Fridge)
            .eut(RECIPE_ZPM)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Energy Infuser"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 1),
                setStackSize(MultiMachineCasingList.Molecular_Coil.copy(), 8),
                setStackSize(MultiMachineCasingList.High_Power_Casing.copy(), 8),
                setStackSize(ScrewList.Magnetic_Neodymium_Screw.copy(), 16))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Electrum_GregTech.copy(), 144 * 18),
                setStackSize(MoltenList.Molten_Europium.copy(), 144 * 13),
                setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 2))
            .itemOutputs(MultiMachineControllerList.Energy_Infuser)
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Eye of Harmony"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Space_Elevator.copy(), 16),
                setStackSize(MultiMachineControllerList.Forge_of_the_Gods.copy(), 4),
                setStackSize(MultiMachineControllerList.Dimensionally_Transcendent_Plasma_Forge.copy(), 4),
                setStackSize(TecTechList.Infinite_Spacetime_Energy_Boundary_Casing.copy(), 1),

                setStackSize(TecTechList.Crude_Time_Dilation_Field_Generator.copy(), 1),
                setStackSize(TecTechList.Crude_Spacetime_Compression_Field_Generator.copy(), 1),
                setStackSize(TecTechList.Crude_Stabilisation_Field_Generator.copy(), 1),
                setStackSize(MultiMachineControllerList.Quantum_Computer.copy(), 64),

                setStackSize(MachineList.World_Accelerator_UV.copy(), 64),
                setStackSize(GTBlockList.Quantum_Chest_V.copy(), 64),
                setStackSize(MultiMachineControllerList.Void_Miner_III.copy(), 64),
                setStackSize(MultiMachineControllerList.Infinite_Fluid_Drilling_Rig.copy(), 64),

                setStackSize(GTItemList.Field_Generator_UMV.copy(), 16),
                setStackSize(GTItemList.Robot_Arm_UMV.copy(), 16),
                setStackSize(BatteryList.Insanely_Ultimate_Battery_Empty.copy(), 4),
                setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 64 * 16))
            .fluidInputs(
                setStackSize(FluidList.Tachyon_Rich_Temporal_Fluid.copy(), 144 * 1000),
                setStackSize(FluidList.Spatially_Enlarged_Fluid.copy(), 144 * 1000),
                setStackSize(MoltenList.Molten_Metastable_Oganesson.copy(), 144 * 64 * 16),
                setStackSize(MoltenList.Molten_Shirabon.copy(), 144 * 64 * 16))
            .itemOutputs(MultiMachineControllerList.Eye_of_Harmony)
            .eut(RECIPE_UMV)
            .duration(24_000 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Exo-Foundry
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Mass_Solidifier.copy(), 64),
                setStackSize(MultiMachineCasingList.Primary_Exo_Foundry_Casing.copy(), 16),
                setStackSize(PipeList.Large_Infinity_Fluid_Pipe.copy(), 8),
                setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 2),

                setStackSize(GTItemList.Field_Generator_UEV.copy(), 4),
                setStackSize(GTItemList.Electric_Pump_UEV.copy(), 8),
                setStackSize(GTItemList.Fluid_Regulator_UEV.copy(), 8),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 2),

                setStackSize(SuperdensePlateList.Superdense_Netherite_Plate.copy(), 4),
                setStackSize(RotorList.Cosmic_Neutronium_Rotor.copy(), 8),
                setStackSize(SingularityList.Eternal_Singularity.copy(), 1),
                setStackSize(GTPPList.Quantum_Anomaly.copy(), 1))
            .fluidInputs(
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64),
                setStackSize(MoltenList.Molten_Precious_Metals_Alloy.copy(), 144 * 32),
                setStackSize(MoltenList.Molten_Metastable_Oganesson.copy(), 144 * 20),
                setStackSize(MoltenList.Molten_Dragonblood.copy(), 144 * 10))
            .itemOutputs(MultiMachineControllerList.Exo_Foundry)
            .eut(RECIPE_UIV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Exothermic Hearth"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Electric_Blast_Furnace.copy(), 64),
                setStackSize(MultiMachineControllerList.Volcanus.copy(), 8),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 8),
                setStackSize(MultiMachineCasingList.Heating_Duct.copy(), 4),

                setStackSize(RodList.Firestone_Rod.copy(), 32),
                setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 8),
                setStackSize(GTItemList.Fluid_Regulator_ZPM.copy(), 8),
                setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 32),

                setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 16),
                setStackSize(SuperdensePlateList.Superdense_Invar_Plate.copy(), 8),
                setStackSize(SuperdensePlateList.Superdense_Cupronickel_Plate.copy(), 8))
            .fluidInputs(
                setStackSize(FluidList.Blazing_Pyrotheum.copy(), 1000 * 256),
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 10),
                setStackSize(FluidList.Lubricant.copy(), 1000 * 16))
            .itemOutputs(MultiMachineControllerList.Exothermic_Hearth)
            .eut(RECIPE_ZPM)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Flotation Cell Regulator"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Dangote_Distillus.copy(), 2),
                setStackSize(MultiMachineCasingList.Inconel_Reinforced_Casing.copy(), 4),
                setStackSize(MultiMachineCasingList.Flotation_Cell_Casings.copy(), 4),
                setStackSize(GTItemList.Electric_Pump_LuV.copy(), 4),

                setStackSize(GearList.Stellite_Gear.copy(), 8),
                setStackSize(PlateList.Stellite_Plate.copy(), 32),
                setStackSize(DoublePlateList.Double_Hastelloy_N_Plate.copy(), 16),
                setStackSize(ScrewList.Hastelloy_N_Screw.copy(), 64))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Inconel_625.copy(), 144 * 16),
                setStackSize(MoltenList.Molten_Inconel_792.copy(), 144 * 32),
                setStackSize(MoltenList.Molten_Hastelloy_N.copy(), 144 * 32))
            .itemOutputs(MultiMachineControllerList.Flotation_Cell_Regulator)
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Forge of the Gods
        {
            // "Forge of the Gods"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Stellar_Energy_Siphon_Casing.copy(), 4),
                    setStackSize(BatteryList.Extremely_Ultimate_Battery_Empty.copy(), 2),
                    setStackSize(MultiMachineCasingList.Dimensional_Bridge.copy(), 64),
                    setStackSize(SingularityList.Eternal_Singularity.copy(), 32),

                    setStackSize(DensePlateList.Dense_Mellion_Plate.copy(), 16),
                    setStackSize(DensePlateList.Dense_Six_Phased_Copper_Plate.copy(), 16),
                    setStackSize(DensePlateList.Dense_Creon_Plate.copy(), 16),
                    setStackSize(DensePlateList.Dense_Metastable_Oganesson_Plate.copy(), 16),

                    setStackSize(GTItemList.Stable_Boson_Containment_Unit.copy(), 8),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 4),
                    setStackSize(GTItemList.Sensor_UIV.copy(), 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 64),

                    setStackSize(HatchList.Laser_Target_Hatch1048576_UIV.copy(), 1),
                    setStackSize(GTBlockList.Energy_Distributor_UIV.copy(), 1))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 32),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(), 1000 * 8192),
                    setStackSize(PlasmaList.Thorium_Plasma.copy(), 144 * 64 * 4),
                    setStackSize(MoltenList.Molten_Transcendent_Metal.copy(), 144 * 64 * 32))
                .itemOutputs(MultiMachineControllerList.Forge_of_the_Gods)
                .eut(RECIPE_UMV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Helioflare Power Forge"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Singularity_Reinforced_Stellar_Shielding_Casing.copy(), 4),
                    setStackSize(MultiMachineControllerList.Exothermic_Hearth.copy(), 64),
                    setStackSize(MultiMachineControllerList.Multi_Smelter.copy(), 64),
                    setStackSize(BatteryList.Extremely_Ultimate_Battery_Empty.copy(), 1),

                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 4),
                    setStackSize(GTItemList.Robot_Arm_UIV.copy(), 16),
                    setStackSize(GTItemList.Conveyor_Module_UIV.copy(), 16),
                    setStackSize(DensePlateList.Dense_Six_Phased_Copper_Plate.copy(), 16),

                    setStackSize(DensePlateList.Dense_Creon_Plate.copy(), 8),
                    setStackSize(DensePlateList.Dense_Mellion_Plate.copy(), 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 32))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 16),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(), 1000 * 2048),
                    setStackSize(PlasmaList.Lead_Plasma.copy(), 144 * 64 * 4),
                    setStackSize(MoltenList.Molten_Transcendent_Metal.copy(), 144 * 64 * 16))
                .itemOutputs(MultiMachineControllerList.Helioflare_Power_Forge)
                .eut(RECIPE_UMV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Helioflux Melting Core"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Singularity_Reinforced_Stellar_Shielding_Casing.copy(), 4),
                    setStackSize(MultiMachineControllerList.Exothermic_Hearth.copy(), 64),
                    setStackSize(MultiMachineControllerList.Mega_Alloy_Blast_Smelter.copy(), 64),
                    setStackSize(BatteryList.Extremely_Ultimate_Battery_Empty.copy(), 1),

                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 8),
                    setStackSize(GTItemList.Robot_Arm_UIV.copy(), 16),
                    setStackSize(GTItemList.Conveyor_Module_UIV.copy(), 32),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 64),

                    setStackSize(GTItemList.Relativistic_Heat_Capacitor.copy(), 8),
                    setStackSize(DensePlateList.Dense_Six_Phased_Copper_Plate.copy(), 16),
                    setStackSize(DensePlateList.Dense_Creon_Plate.copy(), 8),
                    setStackSize(DensePlateList.Dense_Mellion_Plate.copy(), 8),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 32))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 16),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(), 1000 * 2048),
                    setStackSize(FluidList.Lossless_Phonon_Transfer_Medium.copy(), 1000 * 32),
                    setStackSize(MoltenList.Molten_Transcendent_Metal.copy(), 144 * 64 * 16))
                .itemOutputs(MultiMachineControllerList.Helioflux_Melting_Core)
                .eut(RECIPE_UMV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Heliofusion Exoticizer"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Singularity_Reinforced_Stellar_Shielding_Casing.copy(), 4),
                    setStackSize(MultiMachineControllerList.Transcendent_Plasma_Mixer.copy(), 4),
                    setStackSize(MultiMachineControllerList.Compact_Fusion_Computer_MKV.copy(), 1),
                    setStackSize(BatteryList.Extremely_Ultimate_Battery_Empty.copy(), 4),

                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 16),
                    setStackSize(GTItemList.Robot_Arm_UIV.copy(), 16),
                    setStackSize(GTItemList.Conveyor_Module_UIV.copy(), 32),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 64),

                    setStackSize(TecTechList.Harmonic_Phonon_Transmission_Conduit.copy(), 8),
                    setStackSize(SuperdensePlateList.Superdense_Six_Phased_Copper_Plate.copy(), 4),
                    setStackSize(SuperdensePlateList.Superdense_Creon_Plate.copy(), 2),
                    setStackSize(SuperdensePlateList.Superdense_Mellion_Plate.copy(), 2),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 64))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 16),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(), 1000 * 2048),
                    setStackSize(FluidList.Lossless_Phonon_Transfer_Medium.copy(), 1000 * 32),
                    setStackSize(MoltenList.Molten_Transcendent_Metal.copy(), 144 * 64 * 16))
                .itemOutputs(MultiMachineControllerList.Heliofusion_Exoticizer)
                .eut(RECIPE_UMV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Heliothermal Plasma Fabricator"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Singularity_Reinforced_Stellar_Shielding_Casing.copy(), 4),
                    setStackSize(MachineList.Fluid_Heater_UIV.copy(), 64),
                    setStackSize(MultiMachineControllerList.FusionTech_MK_V.copy(), 8),
                    setStackSize(BatteryList.Extremely_Ultimate_Battery_Empty.copy(), 1),

                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 8),
                    setStackSize(GTItemList.Robot_Arm_UIV.copy(), 16),
                    setStackSize(GTItemList.Conveyor_Module_UIV.copy(), 32),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 64),

                    setStackSize(GTItemList.Relativistic_Heat_Capacitor.copy(), 8),
                    setStackSize(SuperdensePlateList.Superdense_Six_Phased_Copper_Plate.copy(), 2),
                    setStackSize(SuperdensePlateList.Superdense_Creon_Plate.copy(), 1),
                    setStackSize(SuperdensePlateList.Superdense_Mellion_Plate.copy(), 1),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 32))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 16),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(), 1000 * 2048),
                    setStackSize(FluidList.Lossless_Phonon_Transfer_Medium.copy(), 1000 * 32),
                    setStackSize(MoltenList.Molten_Transcendent_Metal.copy(), 144 * 64 * 16))
                .itemOutputs(MultiMachineControllerList.Heliothermal_Plasma_Fabricator)
                .eut(RECIPE_UMV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Fusion Control Computer
        {
            // "Fusion Control Computer Mark I"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Fusion_Coil_Block.copy(), 1),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),
                    setStackSize(DensePlateList.Dense_Naquadah_Alloy_Plate.copy(), 4),
                    setStackSize(DensePlateList.Dense_Netherite_Plate.copy(), 1),

                    setStackSize(GTItemList.Field_Generator_LuV.copy(), 2),
                    setStackSize(CircuitList.UHPIC_Wafer.copy(), 32),
                    setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 20),
                    setStackSize(MoltenList.Molten_Vanadium_Gallium.copy(), 144 * 8))
                .itemOutputs(MultiMachineControllerList.Fusion_Control_Computer_Mark_I)
                .eut(RECIPE_LuV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fusion Control Computer Mark II"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Fusion_Coil_Block.copy(), 1),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                    setStackSize(SuperdensePlateList.Superdense_Europium_Plate.copy(), 1),
                    setStackSize(GTItemList.Field_Generator_ZPM.copy(), 2),

                    setStackSize(CircuitList.PPIC_Wafer.copy(), 48),
                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 64))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 20),
                    setStackSize(MoltenList.Molten_Niobium_Titanium.copy(), 144 * 8))
                .itemOutputs(MultiMachineControllerList.Fusion_Control_Computer_Mark_II)
                .eut(RECIPE_LuV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fusion Control Computer Mark III"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Fusion_Coil_Block.copy(), 1),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),
                    setStackSize(SuperdensePlateList.Superdense_Americium_Plate.copy(), 1),
                    setStackSize(GTItemList.Field_Generator_UV.copy(), 2),

                    setStackSize(CircuitList.QPIC_Wafer.copy(), 64),
                    setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 64 * 2))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 20),
                    setStackSize(MoltenList.Molten_Fluxed_Electrum.copy(), 144 * 8))
                .itemOutputs(MultiMachineControllerList.Fusion_Control_Computer_Mark_III)
                .eut(RECIPE_ZPM)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "FusionTech MK IV"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Advanced_Fusion_Coil.copy(), 1),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                    setStackSize(SuperdensePlateList.Superdense_Neutronium_Plate.copy(), 1),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 2),

                    setStackSize(CircuitList.FPIC_Wafer.copy(), 64),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 2))
                .fluidInputs(
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 50),
                    setStackSize(MoltenList.Molten_Cinobite_A243.copy(), 144 * 64),
                    setStackSize(MoltenList.Molten_Octiron.copy(), 144 * 64),
                    setStackSize(MoltenList.Molten_Astral_Titanium.copy(), 144 * 64))
                .itemOutputs(MultiMachineControllerList.FusionTech_MK_IV)
                .eut(RECIPE_UHV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "FusionTech MK V"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Advanced_Fusion_Coil_II.copy(), 1),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),
                    setStackSize(DensePlateList.Dense_Metastable_Oganesson_Plate.copy(), 4),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 2),

                    setStackSize(CircuitList.APIC_Wafer.copy(), 64),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 2))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Curium.copy(), 144 * 64),
                    setStackSize(MoltenList.Molten_Chromatic_Glass.copy(), 144 * 64),
                    setStackSize(MoltenList.Molten_Abyssal_Alloy.copy(), 144 * 64),
                    setStackSize(MoltenList.Molten_Dragonblood.copy(), 144 * 64))
                .itemOutputs(MultiMachineControllerList.FusionTech_MK_V)
                .eut(RECIPE_UEV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Compact Fusion Computer MK-II"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.Fusion_Control_Computer_Mark_II.copy(), 48),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),
                    setStackSize(CircuitList.UHPIC_Wafer.copy(), 32),
                    setStackSize(GTItemList.ZPM_Voltage_Coil.copy(), 16),

                    setStackSize(GTItemList.Iridium_Neutron_Reflector.copy(), 4),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKII.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_ZPM.copy(), 8),
                    setStackSize(SmallGearList.Small_Artherium_Sn_Gear.copy(), 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_MAR_Ce_M200_Steel.copy(), 144 * 16),
                    setStackSize(MoltenList.Molten_High_Durability_Compound_Steel.copy(), 144 * 8),
                    setStackSize(MoltenList.Molten_Artherium_Sn.copy(), 144 * 2))
                .itemOutputs(MultiMachineControllerList.Compact_Fusion_Computer_MKII)
                .eut(RECIPE_ZPM)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Compact Fusion Computer MK-III"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.Fusion_Control_Computer_Mark_III.copy(), 48),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                    setStackSize(CircuitList.NPIC_Wafer.copy(), 64),
                    setStackSize(GTItemList.Ultimate_Voltage_Coil.copy(), 16),

                    setStackSize(MiscPlateList.Advanced_Radiation_Proof_Plate.copy(), 8),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKIII.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UV.copy(), 8),
                    setStackSize(SmallGearList.Small_High_Durability_Compound_Steel_Gear.copy(), 64))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Tanmolyium_Beta_C.copy(), 144 * 16),
                    setStackSize(MoltenList.Molten_Dalisenite.copy(), 144 * 8),
                    setStackSize(MoltenList.Molten_Americium.copy(), 144 * 2))
                .itemOutputs(MultiMachineControllerList.Compact_Fusion_Computer_MKIII)
                .eut(RECIPE_ZPM)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Compact Fusion Computer Mk-IV"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.FusionTech_MK_IV.copy(), 48),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),
                    setStackSize(CircuitList.PPIC_Wafer.copy(), 64),
                    setStackSize(GTItemList.Highly_Ultimate_Voltage_Coil.copy(), 16),

                    setStackSize(DensePlateList.Dense_Titansteel_Plate.copy(), 8),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKIV_Prototype.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 8),
                    setStackSize(SmallGearList.Small_Enriched_Naquadah_Alloy_Gear.copy(), 64))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Radox_Polymer.copy(), 144 * 9),
                    setStackSize(MoltenList.Molten_Dalisenite.copy(), 144 * 8),
                    setStackSize(MoltenList.Molten_Botmium.copy(), 144 * 2))
                .itemOutputs(MultiMachineControllerList.Compact_Fusion_Computer_MkIV)
                .eut(RECIPE_UV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Compact Fusion Computer MK-V"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.FusionTech_MK_V.copy(), 48),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                    setStackSize(CircuitList.QPIC_Wafer.copy(), 64),
                    setStackSize(GTItemList.Extremely_Ultimate_Voltage_Coil.copy(), 16),

                    setStackSize(DensePlateList.Dense_Hypogen_Plate.copy(), 8),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKV_Finaltype.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 8),
                    setStackSize(SmallGearList.Small_Metastable_Oganesson_Gear.copy(), 64))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Tairitsu.copy(), 144 * 16),
                    setStackSize(MoltenList.Molten_Octiron.copy(), 144 * 8),
                    setStackSize(MoltenList.Molten_Rhugnor.copy(), 144 * 2))
                .itemOutputs(MultiMachineControllerList.Compact_Fusion_Computer_MKV)
                .eut(RECIPE_UHV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Hot Isostatic Pressurization Unit"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Large_Electric_Compressor.copy(), 4),
                setStackSize(MultiMachineCasingList.Heating_Duct.copy(), 4),
                setStackSize(MultiMachineCasingList.Coolant_Duct.copy(), 4),
                setStackSize(BlockList.Block_of_Netherite.copy(), 4),

                setStackSize(GTItemList.Electric_Piston_ZPM.copy(), 16),
                setStackSize(GTItemList.Robot_Arm_ZPM.copy(), 4),
                setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Incoloy_903.copy(), 144 * 64 * 4),
                setStackSize(MoltenList.Molten_Enriched_Naquadah.copy(), 144 * 64),
                setStackSize(FluidList.Liquid_Air.copy(), 1000 * 16),
                setStackSize(FluidList.Lubricant.copy(), 1000 * 16))
            .itemOutputs(MultiMachineControllerList.Hot_Isostatic_Pressurization_Unit)
            .eut(RECIPE_ZPM)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Industrial Apicultural Acclimatiser and Drone Domestication Station"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MachineList.Industrial_Apiary.copy(), 64),
                setStackSize(GTItemList.Upgraded_Acceleration_Upgrade_x256.copy(), 64),
                setStackSize(GTItemList.Genetic_Stabilizer_Upgrade.copy(), 64),
                setStackSize(GTItemList.Electric_Pump_UHV.copy(), 16),

                setStackSize(GTItemList.Robot_Arm_UV.copy(), 16),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 16))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 200),
                setStackSize(FluidList.Honey_Forestry.copy(), 1000 * 20))
            .itemOutputs(MultiMachineControllerList.Industrial_Apicultural_Acclimatiser_and_Drone_Domestication_Station)
            .eut(RECIPE_UHV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Infinite Fluid Drilling Rig"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Fluid_Drilling_Rig_IV.copy(), 1),
                setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),
                setStackSize(GTItemList.Electric_Motor_UHV.copy(), 4),

                setStackSize(GTItemList.Electric_Pump_UHV.copy(), 4),
                setStackSize(GearList.Neutronium_Gear.copy(), 4),
                setStackSize(GTItemList.Sensor_UHV.copy(), 3),
                setStackSize(GTItemList.Field_Generator_UHV.copy(), 3),

                setStackSize(ScrewList.Neutronium_Screw.copy(), 12))
            .fluidInputs(
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 9),
                setStackSize(MoltenList.Molten_Neutronium.copy(), 144 * 4))
            .itemOutputs(MultiMachineControllerList.Infinite_Fluid_Drilling_Rig)
            .eut(RECIPE_UHV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Integrated Ore Factory"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GTBlockList.Machine_Hull_UHV.copy(), 1),
                setStackSize(GTItemList.Electric_Motor_UHV.copy(), 32),
                setStackSize(GTItemList.Electric_Piston_UHV.copy(), 8),
                setStackSize(GTItemList.Electric_Pump_UHV.copy(), 16),

                setStackSize(GTItemList.Conveyor_Module_UHV.copy(), 8),
                setStackSize(GTItemList.Robot_Arm_UHV.copy(), 8),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                setStackSize(WireList.Naquadah_Alloy_Wire_1x.copy(), 64 * 2),

                setStackSize(PipeList.PBI_Fluid_Pipe.copy(), 64),
                setStackSize(GTItemList.Tungsten_Grinding_Head.copy(), 64),
                setStackSize(DoublePlateList.Double_Stainless_Steel_Plate.copy(), 32),
                setStackSize(RotorList.Chrome_Rotor.copy(), 16))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 20),
                setStackSize(MoltenList.Molten_Naquadria.copy(), 144 * 10))
            .itemOutputs(MultiMachineControllerList.Integrated_Ore_Factory)
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "IsaMill Grinding Machine"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineCasingList.IsaMill_Exterior_Casing.copy(), 4),
                setStackSize(MultiMachineCasingList.IsaMill_Gearbox.copy(), 4),
                setStackSize(GTItemList.Tungsten_Grinding_Head.copy(), 16),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 16),

                setStackSize(GearList.Inconel_625_Gear.copy(), 8),
                setStackSize(PlateList.Inconel_625_Plate.copy(), 32),
                setStackSize(DoublePlateList.Double_Zeron_100_Plate.copy(), 16),
                setStackSize(ScrewList.Zeron_100_Screw.copy(), 64))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Zeron_100.copy(), 144 * 16),
                setStackSize(MoltenList.Molten_Lafium_Compound.copy(), 144 * 32),
                setStackSize(MoltenList.Molten_Trinium_Naquadah_Carbonite.copy(), 144 * 32))
            .itemOutputs(MultiMachineControllerList.IsaMill_Grinding_Machine)
            .eut(RECIPE_LuV)
            .duration(600 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Large Hadron Collider"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Research_Station.copy(), 8),
                setStackSize(HatchList.Neutron_Accelerator_UV.copy(), 8),
                setStackSize(GoodGeneratorList.Compact_Fusion_Coil.copy(), 64),
                setStackSize(GoodGeneratorList.Advanced_Compact_Fusion_Coil.copy(), 32),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 64),
                setStackSize(GTItemList.Field_Generator_UV.copy(), 64),
                setStackSize(GTItemList.Samarium_Electromagnet.copy(), 1),
                setStackSize(MultiMachineCasingList.Charged_Matter_Sensor_Casing.copy(), 8))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Neutronium.copy(), 144 * 64 * 72),
                setStackSize(MoltenList.Molten_Cosmic_Neutronium.copy(), 144 * 64 * 72))
            .itemOutputs(MultiMachineControllerList.Large_Hadron_Collider)
            .eut(RECIPE_UHV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Large Naquadah Reactor"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(FrameBoxList.Adamantium_Frame_Box.copy(), 8),
                setStackSize(GoodGeneratorList.Radiation_Proof_Plate.copy(), 16),
                setStackSize(GTItemList.Field_Generator_ZPM.copy(), 2),
                setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 8),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 64),
                setStackSize(PipeList.Huge_Naquadah_Fluid_Pipe.copy(), 4),
                setStackSize(PlateList.Prismatic_Naquadah_Plate.copy(), 8),

                setStackSize(ScrewList.Osmium_Screw.copy(), 16))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Trinium.copy(), 144 * 4),
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 32),
                setStackSize(FluidList.Lubricant.copy(), 1000 * 8))
            .itemOutputs(MultiMachineControllerList.Large_Naquadah_Reactor)
            .eut(RECIPE_LuV)
            .duration(600 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Matter Manipulator Quantum Uplink"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Data_Bank.copy(), 1),
                setStackSize(Appliedenergistics2List.ME_Controller.copy(), 4),
                setStackSize(Appliedenergistics2List.ME_Quantum_Ring.copy(), 8),
                setStackSize(Appliedenergistics2List.ME_Quantum_Link_Chamber.copy(), 1),

                setStackSize(Appliedenergistics2List.ME_IO_Port.copy(), 1),
                setStackSize(Appliedenergistics2List.Hyper_Acceleration_Card.copy(), 2),
                setStackSize(HatchList.Optical_Transmission_Connector.copy(), 1),
                setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 32),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 2))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 64),
                setStackSize(MoltenList.Molten_Naquadria.copy(), 144 * 32))
            .itemOutputs(MultiMachineControllerList.Matter_Manipulator_Quantum_Uplink)
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Mega Alloy Blast Smelter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Alloy_Blast_Smelter.copy(), 64 * 4),
                setStackSize(GTItemList.Ultimate_Voltage_Coil.copy(), 16),
                setStackSize(GTItemList.Conveyor_Module_UV.copy(), 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 8),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 16),
                setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 16),

                setStackSize(PlateList.Pikyonium_64B_Plate.copy(), 16),
                setStackSize(ScrewList.Cinobite_A243_Screw.copy(), 32))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Pikyonium_64B.copy(), 144 * 8),
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 9),
                setStackSize(MoltenList.Molten_Soldering_Alloy.copy(), 144 * 10))
            .itemOutputs(MultiMachineControllerList.Mega_Alloy_Blast_Smelter)
            .eut(RECIPE_UHV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Mega Chemical Reactor"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Large_Chemical_Reactor.copy(), 64),
                setStackSize(MultiMachineControllerList.ExxonMobil_Chemical_Plant.copy(), 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),
                setStackSize(MultiMachineCasingList.Chemically_Inert_Machine_Casing.copy(), 8),

                setStackSize(GTItemList.Electric_Pump_LuV.copy(), 4),
                setStackSize(GTItemList.Fluid_Regulator_LuV.copy(), 4),
                setStackSize(MachineList.Chemical_Reactor_IV.copy(), 2),
                setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 32))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 10),
                setStackSize(MoltenList.Molten_Naquadah.copy(), 144 * 4),
                setStackSize(FluidList.Lubricant.copy(), 1000 * 16))
            .itemOutputs(MultiMachineControllerList.Mega_Chemical_Reactor)
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Mega Distillation Tower"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Distillation_Tower.copy(), 64),
                setStackSize(MultiMachineControllerList.Dangote_Distillus.copy(), 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),
                setStackSize(MultiMachineCasingList.Naquadah_Reinforced_Distillation_Casing.copy(), 8),

                setStackSize(GTItemList.Electric_Pump_LuV.copy(), 4),
                setStackSize(GTItemList.Fluid_Regulator_LuV.copy(), 4),
                setStackSize(MachineList.Distillery_IV.copy(), 2),
                setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 32))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 10),
                setStackSize(MoltenList.Molten_Naquadah.copy(), 144 * 4),
                setStackSize(FluidList.Lubricant.copy(), 1000 * 16))
            .itemOutputs(MultiMachineControllerList.Mega_Distillation_Tower)
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Mega Oil Cracker"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Oil_Cracking_Unit.copy(), 64),
                setStackSize(MultiMachineControllerList.Large_Chemical_Reactor.copy(), 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),
                setStackSize(MultiMachineCasingList.Naquadah_Reinforced_Distillation_Casing.copy(), 8),

                setStackSize(GTItemList.Steam_Valve_IV.copy(), 8),
                setStackSize(GTItemList.Steam_Regulator_IV.copy(), 8),
                setStackSize(MultiMachineCasingList.Naquadah_Coil_Block.copy(), 8),
                setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 32))
            .fluidInputs(
                setStackSize(FluidList.Lubricant.copy(), 1000 * 16),
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 10),
                setStackSize(MoltenList.Molten_Naquadah.copy(), 144 * 4))
            .itemOutputs(MultiMachineControllerList.Mega_Oil_Cracker)
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Miniature Wormhole Generator"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 1),
                setStackSize(Appliedenergistics2List.Singularity.copy(), 4),
                setStackSize(GTItemList.Field_Generator_ZPM.copy(), 4),
                setStackSize(GTItemList.Emitter_ZPM.copy(), 4),

                setStackSize(MultiMachineCasingList.Fusion_Coil_Block.copy(), 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 2),
                setStackSize(GTBlockList.Laser_Vacuum_Pipe.copy(), 64))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Neutronium.copy(), 144 * 12),
                setStackSize(MoltenList.Molten_Tritanium.copy(), 144 * 12),
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 24),
                setStackSize(FluidList.Super_Coolant.copy(), 1000 * 7))
            .itemOutputs(MultiMachineControllerList.Miniature_Wormhole_Generator)
            .eut(RECIPE_ZPM)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Molecular Transformer"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(FineWireList.Fine_HG_1223_Wire.copy(), 64 * 2),
                setStackSize(GTItemList.Electric_Motor_IV.copy(), 16),
                setStackSize(BatteryList.Lapotronic_Energy_Orb_Empty.copy(), 16),
                setStackSize(CableList.Platinum_Cable_12x.copy(), 16),

                setStackSize(WireList.Nichrome_Wire_16x.copy(), 32),
                setStackSize(FrameBoxList.Zeron_100_Frame_Box.copy(), 4),
                setStackSize(DoublePlateList.Double_Zirconium_Carbide_Plate.copy(), 32),
                setStackSize(PlateList.Babbit_Alloy_Plate.copy(), 64),

                setStackSize(GearList.Grisium_Gear.copy(), 8),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.EV, 64),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 32),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 16),

                setStackSize(GTItemList.Woods_Glass_Lens.copy(), 1))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Nitinol_60.copy(), 144 * 18),
                setStackSize(MoltenList.Molten_Incoloy_MA956.copy(), 144 * 72),
                setStackSize(MoltenList.Molten_Kanthal.copy(), 144 * 4))
            .itemOutputs(MultiMachineControllerList.Molecular_Transformer)
            .eut(RECIPE_LuV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Mothership Navigation Console"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GTBlockList.Machine_Hull_UHV.copy(), 1),
                setStackSize(AmunRaList.Nanite_Control_Module.copy(), 32),
                setStackSize(MiscPlateList.Irradiant_Reinforced_Neutronium_Plate.copy(), 64),
                setStackSize(GalaxySpaceList.Rocket_Control_Computer_Tier_8.copy(), 4),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 16),
                setStackSize(GTItemList.Sensor_UHV.copy(), 8),
                setStackSize(GTItemList.Emitter_UHV.copy(), 8))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Infinity.copy(), 144 * 100),
                setStackSize(MoltenList.Molten_Enriched_Naquadah_Alloy.copy(), 144 * 64 * 4),
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64))
            .itemOutputs(MultiMachineControllerList.Mothership_Navigation_Console)
            .eut(RECIPE_UEV)
            .duration(240 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Nano Forge"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GTBlockList.Machine_Hull_UV.copy(), 16),
                setStackSize(GTItemList.Carbon_Nanites.copy(), 16),
                setStackSize(GTItemList.Field_Generator_ZPM.copy(), 16),
                setStackSize(GTItemList.Conveyor_Module_UV.copy(), 16),

                setStackSize(GTItemList.Electric_Motor_UV.copy(), 32),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 16),
                setStackSize(WireList.Naquadah_Wire_1x.copy(), 64 * 4),
                setStackSize(SuperdensePlateList.Superdense_Naquadah_Alloy_Plate.copy(), 4))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 32),
                setStackSize(MoltenList.Molten_HSS_S.copy(), 144 * 32),
                setStackSize(MoltenList.Molten_Osmiridium.copy(), 144 * 16))
            .itemOutputs(MultiMachineControllerList.Nano_Forge)
            .eut(RECIPE_ZPM)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Nanochip Assembly Complex"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Circuit_Assembly_Line.copy(), 64),
                setStackSize(MultiMachineControllerList.Quantum_Computer.copy(), 8),
                setStackSize(MultiMachineControllerList.Research_Station.copy(), 8),
                setStackSize(MultiMachineControllerList.Data_Bank.copy(), 8),

                setStackSize(MultiMachineCasingList.Nanochip_Mesh_Interface_Casing.copy(), 16),
                setStackSize(MultiMachineCasingList.Nanochip_Reinforcement_Casing.copy(), 16),
                setStackSize(MultiMachineCasingList.Nanochip_Computational_Matrix_Casing.copy(), 8),
                setStackSize(MultiMachineCasingList.Nanochip_Firewall_Projection_Casing.copy(), 4),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 8),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 16),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 32),
                setStackSize(BatteryList.Ultimate_Battery_Empty.copy(), 1),

                setStackSize(GTItemList.Sensor_UEV.copy(), 4),
                setStackSize(GTItemList.Emitter_UEV.copy(), 4),
                setStackSize(OpenComputersList.Screen_Tier3.copy(), 1),
                setStackSize(OpenComputersList.Keyboard.copy(), 1))
            .fluidInputs(
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 4),
                setStackSize(PlasmaList.Celestial_Tungsten_Plasma.copy(), 144 * 64),
                setStackSize(PlasmaList.Americium_Plasma.copy(), 144 * 64),
                setStackSize(PlasmaList.Astral_Titanium_Plasma.copy(), 144 * 64))
            .itemOutputs(MultiMachineControllerList.Nanochip_Assembly_Complex)
            .eut(RECIPE_UIV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Naquadah Fuel Refinery"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(FrameBoxList.Osmiridium_Frame_Box.copy(), 8),
                setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 64),
                setStackSize(GTItemList.Field_Generator_UV.copy(), 8),
                setStackSize(GTItemList.Electric_Pump_UHV.copy(), 2),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                setStackSize(PipeList.Huge_Mysterious_Crystal_Fluid_Pipe.copy(), 8),
                setStackSize(CircuitList.NPIC_Wafer.copy(), 16),
                setStackSize(GTItemList.Highly_Ultimate_Voltage_Coil.copy(), 64),

                setStackSize(GTItemList.Aer_Lens.copy(), 16),
                setStackSize(ScrewList.Thulium_Screw.copy(), 64))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Quantium.copy(), 144 * 64),
                setStackSize(MoltenList.Molten_Awakened_Draconium.copy(), 144 * 32),
                setStackSize(MoltenList.Molten_Extremely_Unstable_Naquadah.copy(), 144 * 10),
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 100))
            .itemOutputs(MultiMachineControllerList.Naquadah_Fuel_Refinery)
            .eut(RECIPE_UHV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "PCB Factory"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 32),
                setStackSize(MachineList.Circuit_Assembler_ZPM.copy(), 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 16),
                setStackSize(GTItemList.Robot_Arm_ZPM.copy(), 8))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 36),
                setStackSize(MoltenList.Molten_Naquadah.copy(), 144 * 18))
            .itemOutputs(MultiMachineControllerList.PCB_Factory)
            .eut(RECIPE_UV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Pseudostable Black Hole Containment Field"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Hot_Isostatic_Pressurization_Unit.copy(), 1),
                setStackSize(MultiMachineControllerList.Neutronium_Compressor.copy(), 1),
                setStackSize(MultiMachineControllerList.Density2.copy(), 16),
                setStackSize(MachineList.Compressor_UIV.copy(), 8),

                setStackSize(MultiMachineControllerList.Electric_Implosion_Compressor.copy(), 4),
                setStackSize(GTItemList.Field_Generator_UEV.copy(), 4),
                setStackSize(BatteryList.Really_Ultimate_Battery_Empty.copy(), 2),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),

                setStackSize(GTPPList.Quantum_Anomaly.copy(), 64),
                setStackSize(RingList.Proto_Halkonite_Steel_Ring.copy(), 32),
                setStackSize(RotorList.Proto_Halkonite_Steel_Rotor.copy(), 16),
                setStackSize(GearList.Proto_Halkonite_Steel_Gear.copy(), 8),

                setStackSize(SuperdensePlateList.Superdense_Neutronium_Plate.copy(), 16),
                setStackSize(SuperdensePlateList.Superdense_Naquadria_Plate.copy(), 16),
                setStackSize(SuperdensePlateList.Superdense_Cosmic_Neutronium_Plate.copy(), 8),
                setStackSize(SuperdensePlateList.Superdense_Kevlar_Plate.copy(), 4))
            .fluidInputs(
                setStackSize(MoltenList.Molten_SpaceTime.copy(), 144 * 10),
                setStackSize(GasList.Oganesson.copy(), 1000 * 64 * 4),
                setStackSize(MoltenList.Molten_Superconductor_Base_UIV.copy(), 144 * 300),
                setStackSize(MoltenList.Molten_Infinity.copy(), 144 * 100))
            .itemOutputs(MultiMachineControllerList.Pseudostable_Black_Hole_Containment_Field)
            .eut(RECIPE_UIV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Quantum Computer"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Static_Network_Switch_With_QoS.copy(), 1),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 2),
                setStackSize(GTItemList.Data_Orb.copy(), 1),
                setStackSize(GTItemList.Computer_Monitor_Cover.copy(), 1),

                setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 32),
                setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 8),
                setStackSize(SuperdensePlateList.Superdense_Polybenzimidazole_PBI_Sheet.copy(), 2))
            .fluidInputs(
                setStackSize(FluidList.UU_Matter.copy(), 1000),
                setStackSize(MoltenList.Molten_Iridium.copy(), 144 * 9),
                setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 2),
                setStackSize(GasList.Hydrogen.copy(), 1000))
            .itemOutputs(MultiMachineControllerList.Quantum_Computer)
            .eut(RECIPE_ZPM)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Quantum Force Transformer"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Molecular_Transformer.copy(), 1),
                setStackSize(SingularityList.Eternal_Singularity.copy(), 1),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 8),
                setStackSize(GTItemList.Electric_Pump_UEV.copy(), 4),

                setStackSize(GTItemList.Field_Generator_UEV.copy(), 4),
                setStackSize(GTPPList.Quantum_Anomaly.copy(), 1))
            .fluidInputs(
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 10),
                setStackSize(MoltenList.Molten_Pikyonium_64B.copy(), 144 * 32))
            .itemOutputs(MultiMachineControllerList.Quantum_Force_Transformer)
            .eut(RECIPE_UIV)
            .duration(180 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Research Station"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Static_Network_Switch_With_QoS.copy(), 1),
                setStackSize(GTItemList.Sensor_ZPM.copy(), 8),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                setStackSize(GTItemList.Field_Generator_ZPM.copy(), 1),

                setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 2),
                setStackSize(CableList.Naquadah_Cable_2x.copy(), 4),
                setStackSize(FineWireList.Fine_Naquadah_Wire.copy(), 32),
                setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 16))
            .fluidInputs(
                setStackSize(FluidList.UU_Matter.copy(), 1000),
                setStackSize(MoltenList.Molten_Iridium.copy(), 144 * 9),
                setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 2),
                setStackSize(MoltenList.Molten_Osmium.copy(), 144 * 9))
            .itemOutputs(MultiMachineControllerList.Research_Station)
            .eut(RECIPE_UV)
            .duration(180 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Semi-Stable Antimatter Stabilization Sequencer"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Compact_Fusion_Computer_MKV.copy(), 1),
                setStackSize(FrameBoxList.Proto_Halkonite_Steel_Frame_Box.copy(), 16),
                setStackSize(MultiMachineCasingList.Cosmic_Fabric_Manipulator.copy(), 16),
                setStackSize(GoodGeneratorList.Ultimate_Field_Restriction_Coil.copy(), 16),

                setStackSize(FineWireList.Fine_Hypogen_Wire.copy(), 64),
                setStackSize(FineWireList.Fine_Proto_Halkonite_Steel_Wire.copy(), 64),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 16),
                setStackSize(GTItemList.Electric_Pump_UIV.copy(), 16),

                setStackSize(SuperdensePlateList.Superdense_Proto_Halkonite_Steel_Plate.copy(), 4),
                setStackSize(DensePlateList.Dense_Transcendent_Metal_Plate.copy(), 64))
            .fluidInputs(
                setStackSize(FluidList.Protomatter.copy(), 1000 * 10),
                setStackSize(MoltenList.Molten_Six_Phased_Copper.copy(), 144 * 64),
                setStackSize(MoltenList.Molten_Transcendent_Metal.copy(), 144 * 64),
                setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 10))
            .itemOutputs(MultiMachineControllerList.Semi_Stable_Antimatter_Stabilization_Sequencer)
            .eut(RECIPE_UMV)
            .duration(360 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Shielded Lagrangian Annihilation Matrix"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Miniature_Wormhole_Generator.copy(), 1),
                setStackSize(HatchList.Laser_Source_Hatch1048576_UIV.copy(), 4),
                setStackSize(GoodGeneratorList.Protomatter_Activation_Coil.copy(), 16),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 16),

                setStackSize(GTItemList.Emitter_UIV.copy(), 32),
                setStackSize(SuperdensePlateList.Superdense_Proto_Halkonite_Steel_Plate.copy(), 4),
                setStackSize(RotorList.Proto_Halkonite_Steel_Rotor.copy(), 16),
                setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 16),

                setStackSize(FineWireList.Fine_Hypogen_Wire.copy(), 64 * 3))
            .fluidInputs(
                setStackSize(FluidList.Semi_Stable_Antimatter.copy(), 1000),
                setStackSize(MoltenList.Molten_Six_Phased_Copper.copy(), 144 * 64),
                setStackSize(MoltenList.Molten_Transcendent_Metal.copy(), 144 * 64),
                setStackSize(MoltenList.Molten_Superconductor_Base_UIV.copy(), 144 * 64))
            .itemOutputs(MultiMachineControllerList.Shielded_Lagrangian_Annihilation_Matrix)
            .eut(RECIPE_UMV)
            .duration(360 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Space Elevator
        {
            // "Space Elevator"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(OpenBlocksList.Elevator.copy(), 1),
                    setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 64),
                    setStackSize(GTItemList.Field_Generator_UV.copy(), 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 16),

                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_7.copy(), 32),
                    setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 64),
                    setStackSize(ScrewList.Cosmic_Neutronium_Screw.copy(), 64),
                    setStackSize(GTItemList.Electric_Motor_UV.copy(), 32),

                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 40),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 16),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 32),
                    setStackSize(MoltenList.Molten_Neutronium.copy(), 144 * 10))
                .itemOutputs(MultiMachineControllerList.Space_Elevator)
                .eut(RECIPE_UHV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Assembler Module MK-I"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 1),
                    setStackSize(MachineList.Assembler_UV.copy(), 4),
                    setStackSize(MachineList.Circuit_Assembler_UV.copy(), 4),
                    setStackSize(GearList.Cosmic_Neutronium_Gear.copy(), 8),

                    setStackSize(SmallGearList.Small_Cosmic_Neutronium_Gear.copy(), 16),
                    setStackSize(GTItemList.Robot_Arm_UHV.copy(), 8),
                    setStackSize(GTItemList.Conveyor_Module_UHV.copy(), 16),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKIII.copy(), 32),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 16),
                    setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 8),
                    setStackSize(ScrewList.Neutronium_Screw.copy(), 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 9),
                    setStackSize(MoltenList.Molten_Naquadria.copy(), 144 * 9),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 16))
                .itemOutputs(MultiMachineControllerList.Space_Assembler_Module_MKI)
                .eut(RECIPE_UEV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Assembler Module MK-II"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 1),
                    setStackSize(MachineList.Assembler_UEV.copy(), 4),
                    setStackSize(MachineList.Circuit_Assembler_UEV.copy(), 4),
                    setStackSize(GearList.Transcendent_Metal_Gear.copy(), 8),

                    setStackSize(SmallGearList.Small_Proto_Halkonite_Steel_Gear.copy(), 16),
                    setStackSize(GTItemList.Robot_Arm_UIV.copy(), 8),
                    setStackSize(GTItemList.Conveyor_Module_UIV.copy(), 16),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKIV_Prototype.copy(), 32),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 16),
                    setStackSize(FrameBoxList.Hypogen_Frame_Box.copy(), 8),
                    setStackSize(ScrewList.Hypogen_Screw.copy(), 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 9),
                    setStackSize(MoltenList.Molten_Infinity.copy(), 144 * 9),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 16))
                .itemOutputs(MultiMachineControllerList.Space_Assembler_Module_MKII)
                .eut(RECIPE_UIV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Assembler Module MK-III"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 1),
                    setStackSize(MachineList.Assembler_UMV.copy(), 4),
                    setStackSize(MachineList.Circuit_Assembler_UMV.copy(), 4),
                    setStackSize(GearList.Magnetohydrodynamically_Constrained_Star_Matter_Gear.copy(), 8),

                    setStackSize(GearList.Magmatter_Gear.copy(), 8),
                    setStackSize(SmallGearList.Small_Magnetohydrodynamically_Constrained_Star_Matter_Gear.copy(), 16),
                    setStackSize(SmallGearList.Small_Magmatter_Gear.copy(), 16),
                    setStackSize(GTItemList.Robot_Arm_UXV.copy(), 8),

                    setStackSize(GTItemList.Conveyor_Module_UXV.copy(), 16),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKV_Finaltype.copy(), 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 16),
                    setStackSize(FrameBoxList.Universium_Frame_Box.copy(), 8),

                    setStackSize(ScrewList.Universium_Screw.copy(), 32))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 36),
                    setStackSize(MoltenList.Molten_Black_Dwarf_Matter.copy(), 144 * 9),
                    setStackSize(MoltenList.Molten_White_Dwarf_Matter.copy(), 144 * 9),
                    setStackSize(MoltenList.Molten_SpaceTime.copy(), 144 * 9))
                .itemOutputs(MultiMachineControllerList.Space_Assembler_Module_MKIII)
                .eut(RECIPE_UXV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Mining Module MK-I"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.Ore_Drilling_Plant_IV.copy(), 1),
                    setStackSize(GTItemList.Robot_Arm_UV.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UV.copy(), 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 16),

                    setStackSize(GTItemList.Sensor_UV.copy(), 16),
                    setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 64 * 2),
                    setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 16))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 20),
                    setStackSize(MoltenList.Molten_Naquadria.copy(), 144 * 10),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 8))
                .itemOutputs(MultiMachineControllerList.Space_Mining_Module_MKI)
                .eut(RECIPE_UHV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Mining Module MK-II"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.Space_Mining_Module_MKI.copy(), 1),
                    setStackSize(GTItemList.Robot_Arm_UHV.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 16),

                    setStackSize(GTItemList.Sensor_UHV.copy(), 16),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 2),
                    setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box.copy(), 16))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 20),
                    setStackSize(MoltenList.Molten_Naquadria.copy(), 144 * 20),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 16))
                .itemOutputs(MultiMachineControllerList.Space_Mining_Module_MKII)
                .eut(RECIPE_UEV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Mining Module MK-III"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.Space_Mining_Module_MKII.copy(), 1),
                    setStackSize(GTItemList.Robot_Arm_UEV.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 16),

                    setStackSize(GTItemList.Sensor_UEV.copy(), 16),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 2),
                    setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 16))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 20),
                    setStackSize(MoltenList.Molten_Transcendent_Metal.copy(), 144 * 10),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 2))
                .itemOutputs(MultiMachineControllerList.Space_Mining_Module_MKIII)
                .eut(RECIPE_UIV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Pumping Module MK-I"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.Infinite_Fluid_Drilling_Rig.copy(), 1),
                    setStackSize(MultiMachineControllerList.Planetary_Gas_Siphon.copy(), 1),
                    setStackSize(TecTechList.Ender_Fluid_Link_Cover.copy(), 2),
                    setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                    setStackSize(GTItemList.Electric_Pump_UEV.copy(), 2),
                    setStackSize(GearList.Infinity_Gear.copy(), 4),
                    setStackSize(ScrewList.Cosmic_Neutronium_Screw.copy(), 32))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 9),
                    setStackSize(MoltenList.Molten_Infinity.copy(), 144 * 4))
                .itemOutputs(MultiMachineControllerList.Space_Pumping_Module_MKI)
                .eut(RECIPE_UEV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Pumping Module MK-II"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.Infinite_Fluid_Drilling_Rig.copy(), 4),
                    setStackSize(MultiMachineControllerList.Planetary_Gas_Siphon.copy(), 4),
                    setStackSize(TecTechList.Ender_Fluid_Link_Cover.copy(), 8),
                    setStackSize(FrameBoxList.SpaceTime_Frame_Box.copy(), 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 8),
                    setStackSize(GearList.SpaceTime_Gear.copy(), 4),
                    setStackSize(ScrewList.Metastable_Oganesson_Screw.copy(), 64))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 32),
                    setStackSize(MoltenList.Molten_Proto_Halkonite_Steel_Base.copy(), 144 * 16))
                .itemOutputs(MultiMachineControllerList.Space_Pumping_Module_MKII)
                .eut(RECIPE_UIV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Pumping Module MK-III"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineControllerList.Infinite_Fluid_Drilling_Rig.copy(), 16),
                    setStackSize(MultiMachineControllerList.Planetary_Gas_Siphon.copy(), 16),
                    setStackSize(TecTechList.Ender_Fluid_Link_Cover.copy(), 32),
                    setStackSize(FrameBoxList.Black_Dwarf_Matter_Frame_Box.copy(), 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 16),
                    setStackSize(GTItemList.Electric_Pump_UMV.copy(), 8),
                    setStackSize(GearList.Black_Dwarf_Matter_Gear.copy(), 4),
                    setStackSize(ScrewList.White_Dwarf_Matter_Screw.copy(), 64))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64),
                    setStackSize(MoltenList.Molten_Eternity.copy(), 144 * 16))
                .itemOutputs(MultiMachineControllerList.Space_Pumping_Module_MKIII)
                .eut(RECIPE_UMV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Sparge Tower Controller"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineCasingList.Sparge_Tower_Exterior_Casing.copy(), 4),
                setStackSize(MultiMachineCasingList.Integral_Encasement_V.copy(), 4),
                setStackSize(MachineList.Distillery_IV.copy(), 1),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 8),

                setStackSize(GearList.HS188_A_Gear.copy(), 8),
                setStackSize(PlateList.HS188_A_Plate.copy(), 32),
                setStackSize(DoublePlateList.Double_Hastelloy_N_Plate.copy(), 16),
                setStackSize(ScrewList.Hastelloy_N_Screw.copy(), 64),

                setStackSize(FineWireList.Fine_Yttrium_Barium_Cuprate_Wire.copy(), 64 * 2),
                setStackSize(FoilList.Platinum_Foil.copy(), 64))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Incoloy_DS.copy(), 144 * 16),
                setStackSize(MoltenList.Molten_Tantalum_Carbide.copy(), 144 * 32),
                setStackSize(MoltenList.Molten_Titanium.copy(), 144 * 32))
            .itemOutputs(MultiMachineControllerList.Sparge_Tower_Controller)
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Spinmatron-2737
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Industrial_Centrifuge.copy(), 64),
                setStackSize(MultiMachineControllerList.Large_Supercritical_Steam_Turbine.copy(), 4),
                setStackSize(HatchList.Rotor_Assembly.copy(), 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),

                setStackSize(RotorList.Pikyonium_64B_Rotor.copy(), 4),
                setStackSize(RotorList.HeLiCoPtEr_Rotor.copy(), 4),
                setStackSize(RotorList.Arceus_Alloy_2B_Rotor.copy(), 4),
                setStackSize(RotorList.Netherite_Rotor.copy(), 4),

                setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 4),
                setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 4),
                setStackSize(ScrewList.Pikyonium_64B_Screw.copy(), 16),
                setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 64))
            .fluidInputs(
                setStackSize(MoltenList.Molten_MAR_Ce_M200_Steel.copy(), 144 * 16),
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 10),
                setStackSize(FluidList.Lubricant.copy(), 1000 * 4))
            .itemOutputs(MultiMachineControllerList.Spinmatron_2737)
            .eut(RECIPE_ZPM)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Transcendent Plasma Mixer"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(HatchList.Laser_Target_Hatch262144_UEV.copy(), 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 32),
                setStackSize(GTItemList.Electric_Pump_UEV.copy(), 16),
                setStackSize(PlateList.Proto_Halkonite_Steel_Plate.copy(), 64),

                setStackSize(GearList.Proto_Halkonite_Steel_Gear.copy(), 16),
                setStackSize(SmallGearList.Small_Proto_Halkonite_Steel_Gear.copy(), 64),
                setStackSize(ScrewList.Proto_Halkonite_Steel_Screw.copy(), 64),
                setStackSize(GTItemList.Energised_Tesseract.copy(), 32))
            .fluidInputs(
                setStackSize(FluidList.Excited_Dimensionally_Transcendent_Crude_Catalyst.copy(), 1000 * 64 * 32),
                setStackSize(FluidList.Excited_Dimensionally_Transcendent_Prosaic_Catalyst.copy(), 1000 * 64 * 32),
                setStackSize(FluidList.Excited_Dimensionally_Transcendent_Resplendent_Catalyst.copy(), 1000 * 64 * 32),
                setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(), 1000 * 64 * 32))
            .itemOutputs(MultiMachineControllerList.Transcendent_Plasma_Mixer)
            .eut(RECIPE_UIV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Uncertainty Resolution"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineCasingList.Advanced_Computer_Casing.copy(), 1),
                setStackSize(HatchList.Auto_Taping_Maintenance_Hatch.copy(), 1),
                setStackSize(GTItemList.Field_Generator_UIV.copy(), 1),
                setStackSize(GTPPList.Quantum_Anomaly.copy(), 4),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 2),
                setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 64 * 2),
                setStackSize(GTItemList.Computer_Monitor_Cover.copy(), 1))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Iridium.copy(), 144 * 100),
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 18),
                setStackSize(PlasmaList.Neptunium_Plasma.copy(), 1000 * 20),
                setStackSize(PlasmaList.Fermium_Plasma.copy(), 1000 * 20))
            .itemOutputs(HatchList.Uncertainty_Resolution)
            .eut(RECIPE_UIV)
            .duration(200 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Void Miner I"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Ore_Drilling_Plant_IV.copy(), 1),
                setStackSize(FrameBoxList.Netherite_Frame_Box.copy(), 4),
                setStackSize(PlateList.Europium_Plate.copy(), 3),
                setStackSize(GTItemList.Electric_Motor_LuV.copy(), 9),

                setStackSize(GTItemList.Sensor_LuV.copy(), 9),
                setStackSize(GTItemList.Field_Generator_LuV.copy(), 9),
                setStackSize(ScrewList.Europium_Screw.copy(), 36))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 10).copy(),
                setStackSize(GasList.Neon.copy(), 1000 * 20))
            .itemOutputs(MultiMachineControllerList.Void_Miner_I)
            .eut(RECIPE_LuV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Void Miner II"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Void_Miner_I.copy(), 1),
                setStackSize(FrameBoxList.Black_Plutonium_Frame_Box.copy(), 9),
                setStackSize(PlateList.Black_Plutonium_Plate.copy(), 3),
                setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 9),

                setStackSize(GTItemList.Sensor_ZPM.copy(), 9),
                setStackSize(GTItemList.Field_Generator_ZPM.copy(), 9),
                setStackSize(ScrewList.Black_Plutonium_Screw.copy(), 36))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 10),
                setStackSize(GasList.Krypton.copy(), 1000 * 20))
            .itemOutputs(MultiMachineControllerList.Void_Miner_II)
            .eut(RECIPE_ZPM)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Void Miner III"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Void_Miner_II.copy(), 1),
                setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 9),
                setStackSize(PlateList.Neutronium_Plate.copy(), 3),
                setStackSize(GTItemList.Electric_Motor_UV.copy(), 9),

                setStackSize(GTItemList.Sensor_UV.copy(), 9),
                setStackSize(GTItemList.Field_Generator_UV.copy(), 9),
                setStackSize(ScrewList.Neutronium_Screw.copy(), 36))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 10),
                setStackSize(GasList.Oganesson.copy(), 1000 * 20))
            .itemOutputs(MultiMachineControllerList.Void_Miner_III)
            .eut(RECIPE_UV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Water Machine
        {
            // "Water Purification Plant"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Tungsten_Frame_Box.copy(), 4),
                    setStackSize(MultiMachineCasingList.Sterile_Water_Plant_Casing.copy(), 8),
                    setStackSize(MultiMachineCasingList.Reinforced_Sterile_Water_Plant_Casing.copy(), 8),
                    setStackSize(GTItemList.Electric_Motor_LuV.copy(), 2),

                    setStackSize(GTItemList.Robot_Arm_LuV.copy(), 1),
                    setStackSize(GTItemList.Electric_Pump_LuV.copy(), 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 2),

                    setStackSize(CableList.Niobium_Titanium_Cable_8x.copy(), 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 8),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 16))
                .itemOutputs(MultiMachineControllerList.Water_Purification_Plant)
                .eut(RECIPE_LuV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Clarifier Purification Unit"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTItemList.Activated_Carbon_Filter_Mesh.copy(), 16),
                    setStackSize(MultiMachineCasingList.Reinforced_Sterile_Water_Plant_Casing.copy(), 8),
                    setStackSize(MultiMachineCasingList.Filter_Machine_Casing.copy(), 8),
                    setStackSize(HatchList.Energy_Hatch64_LuV.copy(), 1),

                    setStackSize(GTItemList.Electric_Motor_LuV.copy(), 4),
                    setStackSize(GTItemList.Electric_Pump_LuV.copy(), 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 2),

                    setStackSize(PipeList.Tungstensteel_Fluid_Pipe.copy(), 16))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Osmium.copy(), 144 * 8),
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 8),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 16))
                .itemOutputs(MultiMachineControllerList.Clarifier_Purification_Unit)
                .eut(RECIPE_LuV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Ozonation Purification Unit"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Tungstensteel_Frame_Box.copy(), 8),
                    setStackSize(MultiMachineCasingList.Inert_Filtration_Casing.copy(), 8),
                    setStackSize(MultiMachineCasingList.Filter_Machine_Casing.copy(), 8),
                    setStackSize(HatchList.Energy_Hatch64_LuV.copy(), 1),

                    setStackSize(PlateList.Hastelloy_C276_Plate.copy(), 8),
                    setStackSize(RotorList.Hastelloy_C276_Rotor.copy(), 4),
                    setStackSize(RotorList.Hastelloy_X_Rotor.copy(), 4),
                    setStackSize(PlateList.Hastelloy_X_Plate.copy(), 8),

                    setStackSize(GTItemList.Electric_Motor_LuV.copy(), 4),
                    setStackSize(GTItemList.Electric_Pump_LuV.copy(), 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),

                    setStackSize(PipeList.Tungstensteel_Fluid_Pipe.copy(), 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Hastelloy_C276.copy(), 144 * 8),
                    setStackSize(MoltenList.Molten_Hastelloy_X.copy(), 144 * 8),
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 8),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 16))
                .itemOutputs(MultiMachineControllerList.Clarifier_Purification_Unit)
                .eut(RECIPE_LuV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Flocculation Purification Unit"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Adamantium_Frame_Box.copy(), 8),
                    setStackSize(MultiMachineCasingList.Slick_Sterile_Flocculation_Casing.copy(), 8),
                    setStackSize(MultiMachineCasingList.Filter_Machine_Casing.copy(), 8),
                    setStackSize(HatchList.Energy_Hatch64_LuV.copy(), 1),

                    setStackSize(PlateList.Trinium_Plate.copy(), 8),
                    setStackSize(RotorList.Trinium_Rotor.copy(), 4),
                    setStackSize(RotorList.Naquadah_Alloy_Rotor.copy(), 4),
                    setStackSize(PlateList.Naquadah_Alloy_Plate.copy(), 8),

                    setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 4),
                    setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 2),

                    setStackSize(PipeList.Large_Naquadah_Fluid_Pipe.copy(), 16))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Iridium.copy(), 144 * 16),
                    setStackSize(MoltenList.Molten_Naquadah_Alloy.copy(), 144 * 16),
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 16),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 32))
                .itemOutputs(MultiMachineControllerList.Flocculation_Purification_Unit)
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "pH Neutralization Purification Unit"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Naquadah_Alloy_Frame_Box.copy(), 8),
                    setStackSize(MultiMachineCasingList.Stabilized_Naquadah_Water_Plant_Casing.copy(), 8),
                    setStackSize(MultiMachineCasingList.Inert_Neutralization_Water_Plant_Casing.copy(), 8),
                    setStackSize(HatchList.Energy_Hatch64_ZPM.copy(), 1),

                    setStackSize(PlateList.Naquadah_Alloy_Plate.copy(), 8),
                    setStackSize(RotorList.Naquadah_Alloy_Rotor.copy(), 4),
                    setStackSize(RotorList.Hastelloy_C276_Rotor.copy(), 4),
                    setStackSize(PlateList.Hastelloy_C276_Plate.copy(), 8),

                    setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 4),
                    setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),

                    setStackSize(PipeList.Large_Naquadah_Fluid_Pipe.copy(), 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Naquadah_Alloy.copy(), 144 * 16),
                    setStackSize(MoltenList.Molten_Hastelloy_C276.copy(), 144 * 16),
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 16),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 32))
                .itemOutputs(MultiMachineControllerList.pH_Neutralization_Purification_Unit)
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Extreme Temperature Fluctuation Purification Unit"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 8),
                    setStackSize(MultiMachineCasingList.Heat_Resistant_Trinium_Plated_Casing.copy(), 8),
                    setStackSize(MultiMachineCasingList.Superconducting_Coil_Block.copy(), 8),
                    setStackSize(HatchList.Energy_Hatch64_UV.copy(), 1),

                    setStackSize(PlateList.Neutronium_Plate.copy(), 8),
                    setStackSize(RotorList.Neutronium_Rotor.copy(), 4),
                    setStackSize(RotorList.Netherite_Rotor.copy(), 4),
                    setStackSize(PlateList.Netherite_Plate.copy(), 8),

                    setStackSize(GTItemList.Electric_Motor_UV.copy(), 4),
                    setStackSize(GTItemList.Electric_Pump_UV.copy(), 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 8),

                    setStackSize(PipeList.Large_Neutronium_Fluid_Pipe.copy(), 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Neutronium.copy(), 144 * 32),
                    setStackSize(MoltenList.Molten_Naquadria.copy(), 144 * 32),
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 32),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 64))
                .itemOutputs(MultiMachineControllerList.Extreme_Temperature_Fluctuation_Purification_Unit)
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "High Energy Laser Purification Unit"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Naquadria_Frame_Box.copy(), 8),
                    setStackSize(MultiMachineCasingList.Naquadria_Reinforced_Water_Plant_Casing.copy(), 8),
                    setStackSize(MultiMachineCasingList.High_Energy_Ultraviolet_Emitter_Casing.copy(), 8),
                    setStackSize(HatchList.Energy_Hatch64_UV.copy(), 1),

                    setStackSize(PlateList.Neutronium_Plate.copy(), 8),
                    setStackSize(RotorList.Neutronium_Rotor.copy(), 4),
                    setStackSize(RotorList.Draconium_Rotor.copy(), 4),
                    setStackSize(PlateList.Draconium_Plate.copy(), 8),

                    setStackSize(GTItemList.Electric_Motor_UV.copy(), 4),
                    setStackSize(GTItemList.Electric_Pump_UV.copy(), 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),

                    setStackSize(PipeList.Large_Neutronium_Fluid_Pipe.copy(), 64))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Neutronium.copy(), 144 * 32),
                    setStackSize(MoltenList.Molten_Naquadria.copy(), 144 * 32),
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 32),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 64))
                .itemOutputs(MultiMachineControllerList.High_Energy_Laser_Purification_Unit)
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Residual Decontaminant Degasser Purification Unit"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 8),
                    setStackSize(MultiMachineCasingList.Heat_Resistant_Trinium_Plated_Casing.copy(), 8),
                    setStackSize(MultiMachineCasingList.Computer_Casing.copy(), 8),
                    setStackSize(HatchList.Energy_Hatch64_UEV.copy(), 1),

                    setStackSize(PlateList.Infinity_Plate.copy(), 8),
                    setStackSize(RotorList.Infinity_Rotor.copy(), 4),
                    setStackSize(RotorList.Cosmic_Neutronium_Rotor.copy(), 4),
                    setStackSize(PlateList.Cosmic_Neutronium_Plate.copy(), 8),

                    setStackSize(GTItemList.Electric_Motor_UEV.copy(), 4),
                    setStackSize(GTItemList.Electric_Pump_UEV.copy(), 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),

                    setStackSize(PipeList.Infinity_Fluid_Pipe.copy(), 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Quantium.copy(), 144 * 64),
                    setStackSize(MoltenList.Molten_Infinity.copy(), 144 * 64),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 128))
                .itemOutputs(MultiMachineControllerList.Residual_Decontaminant_Degasser_Purification_Unit)
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Absolute Baryonic Perfection Purification Unit"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 16),
                    setStackSize(MultiMachineCasingList.Quark_Exclusion_Casing.copy(), 8),
                    setStackSize(MultiMachineCasingList.Femtometer_Calibrated_Particle_Beam_Casing.copy(), 8),
                    setStackSize(HatchList.Energy_Hatch64_UEV.copy(), 1),

                    setStackSize(PlateList.Infinity_Plate.copy(), 16),
                    setStackSize(RotorList.Infinity_Rotor.copy(), 8),
                    setStackSize(RotorList.Cosmic_Neutronium_Rotor.copy(), 8),
                    setStackSize(PlateList.Cosmic_Neutronium_Plate.copy(), 16),

                    setStackSize(GTItemList.Electric_Motor_UEV.copy(), 4),
                    setStackSize(GTItemList.Electric_Pump_UEV.copy(), 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 8),

                    setStackSize(PipeList.Infinity_Fluid_Pipe.copy(), 64))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Superconductor_Base_UHV.copy(), 144 * 64),
                    setStackSize(MoltenList.Molten_Infinity.copy(), 144 * 64),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 128))
                .itemOutputs(MultiMachineControllerList.Absolute_Baryonic_Perfection_Purification_Unit)
                .eut(RECIPE_UIV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }
    }
}
