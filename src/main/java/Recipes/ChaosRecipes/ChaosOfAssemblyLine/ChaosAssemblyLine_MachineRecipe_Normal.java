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
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import util.ChaosAssemblyRecipeBuilder;

public class ChaosAssemblyLine_MachineRecipe_Normal {

    public static void addChaosAssemblyLine_NormalMachineRecipe() {
        // "Advanced Assembly Line"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#1")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Assembly_Line.copy(), 1),
                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 2),
                getMaterialInput(OrePrefixes.circuit, Materials.IV, 4),
                getMaterialInput(OrePrefixes.circuit, Materials.EV, 8),

                setStackSize(GTBlockList.Chest_Buffer_LuV.copy(), 1))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 9),
                requiredFluid(FluidList.Lubricant, 1000 * 2))
            .itemOutputs(setStackSize(MultiMachineControllerList.Advanced_Assembly_Line, 1))
            .eut(RECIPE_LuV)
            .duration(180 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Beam Crafter"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#2")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Target_Chamber.copy(), 1),
                setStackSize(GTItemList.Field_Generator_ZPM.copy(), 4),
                setStackSize(GTNHLanthanidesList.Shielded_Accelerator_Casing.copy(), 32),
                setStackSize(MultiMachineControllerList.Large_Molecular_Assembler.copy(), 2))
            .fluidInputs(requiredFluid(FluidList.UU_Matter, 1000 * 8))
            .itemOutputs(setStackSize(MultiMachineControllerList.Beam_Crafter, 1))
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Beam Splitter"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#3")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Weighted_Network_Switch_With_QoS.copy(), 1),
                setStackSize(GTItemList.Samarium_Electromagnet.copy(), 1),
                setStackSize(GTNHLanthanidesList.Shielded_Accelerator_Casing.copy(), 4))
            .fluidInputs(requiredFluid(FluidList.Super_Coolant, 1000 * 16))
            .itemOutputs(setStackSize(MultiMachineControllerList.Beam_Splitter, 1))
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // BEC
        {
            // "Bose-Einstein Condensate Containment Field"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#4")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 1),
                    setStackSize(MultiMachineCasingList.Fine_Structure_Constant_Manipulator.copy(), 4),
                    setStackSize(KekzTechList.TFFT_Storage_Field_Block_TierIX.copy(), 8),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 4),

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 32),
                    setStackSize(DensePlateList.Dense_Tairitsu_Plate.copy(), 16),
                    setStackSize(DensePlateList.Dense_Churitsu_Plate.copy(), 16),
                    setStackSize(DensePlateList.Dense_Shijima_Plate.copy(), 16),

                    setStackSize(GTItemList.Stable_Baryon_Containment_Unit.copy(), 8),
                    setStackSize(GTItemList.Stable_Lepton_Containment_Unit.copy(), 8),
                    setStackSize(GTItemList.Stable_Meson_Containment_Unit.copy(), 8),
                    setStackSize(GTItemList.Stable_Boson_Containment_Unit.copy(), 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Chromatic_Glass, 144 * 64 * 32),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 16),
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 2000),
                    requiredFluid(MoltenList.Molten_SpaceTime, 144 * 64))
                .itemOutputs(setStackSize(MultiMachineControllerList.Bose_Einstein_Condensate_Containment_Field, 1))
                .eut(RECIPE_UMV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Bose-Einstein Condensate Entanglement Apparatus"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#5")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineControllerList.Thermic_Heating_Device.copy(), 1),
                    setStackSize(MultiMachineCasingList.Electromagnetically_Isolated_Casing.copy(), 4),
                    setStackSize(MultiMachineCasingList.Hypogen_Coil_Block.copy(), 16),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 4),

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 16),
                    setStackSize(DensePlateList.Dense_Tairitsu_Plate.copy(), 8),
                    setStackSize(DensePlateList.Dense_Churitsu_Plate.copy(), 8),
                    setStackSize(DensePlateList.Dense_Shijima_Plate.copy(), 8),

                    setStackSize(GTItemList.Emitter_UIV.copy(), 16),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 16),
                    setStackSize(GTPPList.Quantum_Anomaly.copy(), 16))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Chromatic_Glass, 144 * 64 * 16),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 8),
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 1000),
                    requiredFluid(MoltenList.Molten_SpaceTime, 144 * 32))
                .itemOutputs(
                    setStackSize(MultiMachineControllerList.Bose_Einstein_Condensate_Entanglement_Apparatus, 1))
                .eut(RECIPE_UMV)
                .duration(150 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Bose-Einstein Condensate Maxwell Gate"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#6")
                .itemInputsUnsafe(
                    setStackSize(Appliedenergistics2List.ME_Storage_Bus.copy(), 1),
                    setStackSize(MultiMachineCasingList.Electromagnetically_Isolated_Casing.copy(), 4),
                    setStackSize(GTItemList.Fluid_Regulator_UIV.copy(), 4),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 4),

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 8),
                    setStackSize(DensePlateList.Dense_Tairitsu_Plate.copy(), 4),
                    setStackSize(DensePlateList.Dense_Churitsu_Plate.copy(), 4),
                    setStackSize(DensePlateList.Dense_Shijima_Plate.copy(), 4))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Chromatic_Glass, 144 * 64 * 8),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 4),
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 500),
                    requiredFluid(MoltenList.Molten_SpaceTime, 144 * 16))
                .itemOutputs(setStackSize(MultiMachineControllerList.Bose_Einstein_Condensate_Maxwell_Gate, 1))
                .eut(RECIPE_UMV)
                .duration(75 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Bose-Einstein Condensate Observation Array"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#7")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineControllerList.Advanced_Assembly_Line.copy(), 1),
                    setStackSize(MultiMachineCasingList.Coherence_Preserving_Plasma_Conduit.copy(), 4),
                    setStackSize(MultiMachineCasingList.Dimensional_Bridge.copy(), 16),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 4),

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 16),
                    setStackSize(DensePlateList.Dense_Tairitsu_Plate.copy(), 8),
                    setStackSize(DensePlateList.Dense_Churitsu_Plate.copy(), 8),
                    setStackSize(DensePlateList.Dense_Shijima_Plate.copy(), 8),

                    setStackSize(GTItemList.Sensor_UIV.copy(), 16),
                    setStackSize(GTItemList.Robot_Arm_UIV.copy(), 16),
                    setStackSize(GTItemList.Chromatic_Lens.copy(), 64),
                    setStackSize(Appliedenergistics2List.Singularity.copy(), 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Chromatic_Glass, 144 * 64 * 16),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 8),
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 1000),
                    requiredFluid(MoltenList.Molten_SpaceTime, 144 * 32))
                .itemOutputs(setStackSize(MultiMachineControllerList.Bose_Einstein_Condensate_Observation_Array, 1))
                .eut(RECIPE_UMV)
                .duration(150 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Observation Array Teleportation Node"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#8")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineCasingList.Coherence_Preserving_Plasma_Conduit.copy(), 4),
                    setStackSize(MultiMachineCasingList.Dimensional_Bridge.copy(), 16),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 16),

                    setStackSize(DensePlateList.Dense_Tairitsu_Plate.copy(), 8),
                    setStackSize(DensePlateList.Dense_Churitsu_Plate.copy(), 8),
                    setStackSize(DensePlateList.Dense_Shijima_Plate.copy(), 8),
                    setStackSize(GTItemList.Emitter_UIV.copy(), 8),

                    setStackSize(GTItemList.Conveyor_Module_UIV.copy(), 8),
                    setStackSize(SingularityList.Eternal_Singularity.copy(), 4),
                    setStackSize(Appliedenergistics2List.Singularity.copy(), 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Chromatic_Glass, 144 * 64 * 16),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 8),
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 1000),
                    requiredFluid(MoltenList.Molten_SpaceTime, 144 * 32))
                .itemOutputs(setStackSize(MultiMachineControllerList.Bose_Einstein_Condensate_Observation_Array, 1))
                .eut(RECIPE_UMV)
                .duration(150 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Bio Chamber"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#9")
            .itemInputsUnsafe(
                setStackSize(MultiMachineCasingList.Clean_Stainless_Steel_Machine_Casing.copy(), 4),
                getMaterialInput(OrePrefixes.circuit, Materials.UV, 2),
                setStackSize(CircuitList.Stemcells.copy(), 64),
                setStackSize(GTItemList.Fluid_Regulator_ZPM.copy(), 1),

                setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 1),
                setStackSize(GTItemList.Sensor_ZPM.copy(), 4),
                setStackSize(FineWireList.Fine_Holmium_Wire.copy(), 32))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 32),
                requiredFluid(FluidList.Growth_Catalyst_Medium, 144 * 64 * 3))
            .itemOutputs(setStackSize(MultiMachineControllerList.Bio_Chamber, 1))
            .eut(RECIPE_UV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Circuit Assembly Line"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#10")
            .itemInputsUnsafe(
                setStackSize(MachineList.Circuit_Assembler_LuV.copy(), 1),
                setStackSize(GTItemList.Robot_Arm_LuV.copy(), 4),
                setStackSize(GTItemList.Electric_Motor_LuV.copy(), 4),
                setStackSize(GTItemList.Field_Generator_LuV.copy(), 1),

                setStackSize(GTItemList.Emitter_LuV.copy(), 1),
                setStackSize(GTItemList.Sensor_LuV.copy(), 1),
                setStackSize(PlateList.Rhodium_Plated_Palladium_Plate.copy(), 8))
            .fluidInputs(requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 10))
            .itemOutputs(setStackSize(MultiMachineControllerList.Circuit_Assembly_Line, 1))
            .eut(RECIPE_ZPM)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Component Assembly Line"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#11")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Assembly_Line.copy(), 16),
                setStackSize(MultiMachineCasingList.Assembler_Machine_Casing.copy(), 16),
                setStackSize(MultiMachineCasingList.Assembly_Line_Casing.copy(), 32),
                setStackSize(GTItemList.Robot_Arm_UV.copy(), 16),

                setStackSize(GTItemList.Conveyor_Module_UV.copy(), 32),
                setStackSize(GTItemList.Electric_Motor_UV.copy(), 32),
                setStackSize(PipeList.PBI_Fluid_Pipe.copy(), 16),
                setStackSize(SuperdensePlateList.Superdense_Iridium_Plate.copy(), 4),

                setStackSize(MachineList.Fluid_Solidifier_ZPM.copy(), 16),
                getMaterialInput(OrePrefixes.circuit, Materials.UV, 16),
                getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 20),
                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 24))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 12),
                requiredFluid(MoltenList.Molten_Naquadria, 144 * 16),
                requiredFluid(FluidList.Lubricant, 1000 * 5))
            .itemOutputs(setStackSize(MultiMachineControllerList.Component_Assembly_Line, 1))
            .eut(RECIPE_UHV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Cooling Tower"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#12")
            .itemInputsUnsafe(
                setStackSize(MultiMachineCasingList.Reinforced_Photolithographic_Framework_Casing.copy(), 4),
                setStackSize(MultiMachineCasingList.Superconducting_Coil_Block.copy(), 16),
                getMaterialInput(OrePrefixes.circuit, Materials.UHV, 2),
                setStackSize(FoilList.Damascus_Steel_Foil.copy(), 16),

                setStackSize(GTItemList.Electric_Pump_UV.copy(), 1),
                setStackSize(GTItemList.Sensor_UV.copy(), 4),
                setStackSize(FineWireList.Fine_Infinity_Wire.copy(), 32))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 32),
                requiredFluid(FluidList.Super_Coolant, 1000 * 8))
            .itemOutputs(setStackSize(MultiMachineControllerList.Cooling_Tower, 1))
            .eut(RECIPE_UV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Data Bank"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#13")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Static_Network_Switch_With_QoS.copy(), 1),
                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 2),
                setStackSize(GTItemList.Data_Orb.copy(), 1),
                setStackSize(GTItemList.Computer_Monitor_Cover.copy(), 1))
            .fluidInputs(requiredFluid(FluidList.IC2_Coolant, 1000 * 2), requiredFluid(GasList.Hydrogen, 1000))
            .itemOutputs(setStackSize(MultiMachineControllerList.Data_Bank, 1))
            .eut(RECIPE_LuV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Dimensionally Transcendent Plasma Forge"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#14")
            .itemInputsUnsafe(
                setStackSize(MultiMachineCasingList.Dimensional_Bridge.copy(), 4),
                setStackSize(MultiMachineControllerList.Exothermic_Hearth.copy(), 16),
                setStackSize(HatchList.Energy_Hatch_UEV.copy(), 4),
                setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 96),

                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 20),
                setStackSize(GTItemList.Field_Generator_UEV.copy(), 4),
                setStackSize(SingularityList.Eternal_Singularity.copy(), 4),
                setStackSize(GTPPList.Quantum_Anomaly.copy(), 1),

                setStackSize(SuperdensePlateList.Superdense_Osmiridium_Plate.copy(), 4),
                setStackSize(GTItemList.Electric_Pump_UEV.copy(), 4),
                setStackSize(BatteryList.Really_Ultimate_Battery_Empty.copy(), 1))
            .fluidInputs(
                requiredFluid(GasList.Oganesson, 1000 * 64 * 2),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 8),
                requiredFluid(MoltenList.Molten_Californium, 144 * 64 * 4),
                requiredFluid(MoltenList.Molten_Enriched_Naquadah, 144 * 64 * 4))
            .itemOutputs(setStackSize(MultiMachineControllerList.Dimensionally_Transcendent_Plasma_Forge, 1))
            .eut(RECIPE_UIV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Draconic Evolution Fusion Crafter"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#15")
            .itemInputsUnsafe(
                setStackSize(MachineList.Assembler_UHV.copy(), 1),
                setStackSize(MultiMachineCasingList.Bloody_Ichorium_Fusion_Casing.copy(), 1),
                setStackSize(DensePlateList.Dense_Gaia_Spirit_Plate.copy(), 1),
                setStackSize(MultiMachineCasingList.Awakened_Draconium_Coil_Block.copy(), 8),

                setStackSize(GTItemList.Electric_Motor_UHV.copy(), 8),
                setStackSize(GTItemList.Robot_Arm_UHV.copy(), 4),
                getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),
                setStackSize(GTItemList.Gravi_Star.copy(), 4),

                setStackSize(ThaumcraftList.Primordial_Pearl.copy(), 1),
                setStackSize(BloodMagicList.Soul_Shard.copy(), 8),
                setStackSize(BloodMagicList.Life_Shard.copy(), 8),
                setStackSize(SuperdensePlateList.Superdense_Void_Metal_Plate.copy(), 1))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 20),
                requiredFluid(MoltenList.Molten_Void_Metal, 144 * 20),
                requiredFluid(MoltenList.Molten_Awakened_Draconium, 144 * 10))
            .itemOutputs(setStackSize(MultiMachineControllerList.Draconic_Evolution_Fusion_Crafter, 1))
            .eut(RECIPE_UEV)
            .duration(75 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Electric Implosion Compressor"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#16")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Implosion_Compressor.copy(), 1),
                setStackSize(SuperdensePlateList.Superdense_Neutronium_Plate.copy(), 1),
                setStackSize(LongRodList.Long_Osmium_Rod.copy(), 64),
                setStackSize(RingList.Osmium_Ring.copy(), 64),

                setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64),
                setStackSize(GTItemList.Electric_Piston_UV.copy(), 64))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 10),
                requiredFluid(MoltenList.Molten_Osmium, 144 * 10),
                requiredFluid(MoltenList.Molten_Neutronium, 144 * 10))
            .itemOutputs(setStackSize(MultiMachineControllerList.Electric_Implosion_Compressor, 1))
            .eut(RECIPE_UV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Elemental Duplicator"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#17")
            .itemInputsUnsafe(
                setStackSize(GTBlockList.Machine_Hull_ZPM.copy(), 4),
                setStackSize(GTItemList.Field_Generator_IV.copy(), 16),
                setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 16),
                setStackSize(GTItemList.Electric_Piston_ZPM.copy(), 4),

                setStackSize(GTPPList.Energy_Core_LuV.copy(), 2),
                setStackSize(PlateList.Pikyonium_64B_Plate.copy(), 16),
                setStackSize(ScrewList.Pikyonium_64B_Screw.copy(), 32),
                setStackSize(BoltList.Trinium_Naquadah_Carbonite_Bolt.copy(), 32),

                setStackSize(RodList.Zeron_100_Rod.copy(), 16),
                getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 20),
                setStackSize(GTItemList.Data_Orb.copy(), 32),
                setStackSize(GTPPList.Quantum_Anomaly.copy(), 1))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Pikyonium_64B, 144 * 32),
                requiredFluid(MoltenList.Molten_Lafium_Compound, 144 * 16),
                requiredFluid(MoltenList.Molten_Trinium_Naquadah_Carbonite, 144 * 16),
                requiredFluid(MoltenList.Molten_Babbit_Alloy, 144 * 64 * 2))
            .itemOutputs(setStackSize(MultiMachineControllerList.Elemental_Duplicator, 1))
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Endothermic Fridge"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#18")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Vacuum_Freezer.copy(), 64),
                setStackSize(MultiMachineControllerList.Cryogenic_Freezer.copy(), 8),
                getMaterialInput(OrePrefixes.circuit, Materials.UV, 8),
                setStackSize(MultiMachineCasingList.Coolant_Duct.copy(), 4),

                setStackSize(RodList.Callisto_Ice_Rod.copy(), 32),
                setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 8),
                setStackSize(GTItemList.Fluid_Regulator_ZPM.copy(), 8),
                setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 32),

                setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 16),
                setStackSize(SuperdensePlateList.Superdense_Ledox_Plate.copy(), 8),
                setStackSize(SuperdensePlateList.Superdense_Aluminium_Plate.copy(), 8))
            .fluidInputs(
                requiredFluid(FluidList.Gelid_Cryotheum, 1000 * 256),
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 10),
                requiredFluid(FluidList.Lubricant, 1000 * 16))
            .itemOutputs(setStackSize(MultiMachineControllerList.Endothermic_Fridge, 1))
            .eut(RECIPE_ZPM)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Energy Infuser"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#19")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 1),
                setStackSize(MultiMachineCasingList.Molecular_Coil.copy(), 8),
                setStackSize(MultiMachineCasingList.High_Power_Casing.copy(), 8),
                setStackSize(ScrewList.Magnetic_Neodymium_Screw.copy(), 16))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Electrum_GregTech, 144 * 18),
                requiredFluid(MoltenList.Molten_Europium, 144 * 13),
                requiredFluid(FluidList.IC2_Coolant, 1000 * 2))
            .itemOutputs(setStackSize(MultiMachineControllerList.Energy_Infuser, 1))
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Eye of Harmony"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#20")
            .itemInputsUnsafe(
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
                requiredFluid(FluidList.Tachyon_Rich_Temporal_Fluid, 144 * 1000),
                requiredFluid(FluidList.Spatially_Enlarged_Fluid, 144 * 1000),
                requiredFluid(MoltenList.Molten_Metastable_Oganesson, 144 * 64 * 16),
                requiredFluid(MoltenList.Molten_Shirabon, 144 * 64 * 16))
            .itemOutputs(setStackSize(MultiMachineControllerList.Eye_of_Harmony, 1))
            .eut(RECIPE_UMV)
            .duration(24_000 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Exo-Foundry
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#21")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Mass_Solidifier.copy(), 64),
                setStackSize(MultiMachineCasingList.Primary_Exo_Foundry_Casing.copy(), 16),
                setStackSize(PipeList.Large_Infinity_Fluid_Pipe.copy(), 8),
                setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 2),

                setStackSize(GTItemList.Field_Generator_UEV.copy(), 4),
                setStackSize(GTItemList.Electric_Pump_UEV.copy(), 8),
                setStackSize(GTItemList.Fluid_Regulator_UEV.copy(), 8),
                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 2),

                setStackSize(SuperdensePlateList.Superdense_Netherite_Plate.copy(), 4),
                setStackSize(RotorList.Cosmic_Neutronium_Rotor.copy(), 8),
                setStackSize(SingularityList.Eternal_Singularity.copy(), 1),
                setStackSize(GTPPList.Quantum_Anomaly.copy(), 1))
            .fluidInputs(
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64),
                requiredFluid(MoltenList.Molten_Precious_Metals_Alloy, 144 * 32),
                requiredFluid(MoltenList.Molten_Metastable_Oganesson, 144 * 20),
                requiredFluid(MoltenList.Molten_Dragonblood, 144 * 10))
            .itemOutputs(setStackSize(MultiMachineControllerList.Exo_Foundry, 1))
            .eut(RECIPE_UIV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Exothermic Hearth"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#22")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Electric_Blast_Furnace.copy(), 64),
                setStackSize(MultiMachineControllerList.Volcanus.copy(), 8),
                getMaterialInput(OrePrefixes.circuit, Materials.UV, 8),
                setStackSize(MultiMachineCasingList.Heating_Duct.copy(), 4),

                setStackSize(RodList.Firestone_Rod.copy(), 32),
                setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 8),
                setStackSize(GTItemList.Fluid_Regulator_ZPM.copy(), 8),
                setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 32),

                setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 16),
                setStackSize(SuperdensePlateList.Superdense_Invar_Plate.copy(), 8),
                setStackSize(SuperdensePlateList.Superdense_Cupronickel_Plate.copy(), 8))
            .fluidInputs(
                requiredFluid(FluidList.Blazing_Pyrotheum, 1000 * 256),
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 10),
                requiredFluid(FluidList.Lubricant, 1000 * 16))
            .itemOutputs(setStackSize(MultiMachineControllerList.Exothermic_Hearth, 1))
            .eut(RECIPE_ZPM)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Flotation Cell Regulator"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#23")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Dangote_Distillus.copy(), 2),
                setStackSize(MultiMachineCasingList.Inconel_Reinforced_Casing.copy(), 4),
                setStackSize(MultiMachineCasingList.Flotation_Cell_Casings.copy(), 4),
                setStackSize(GTItemList.Electric_Pump_LuV.copy(), 4),

                setStackSize(GearList.Stellite_Gear.copy(), 8),
                setStackSize(PlateList.Stellite_Plate.copy(), 32),
                setStackSize(DoublePlateList.Double_Hastelloy_N_Plate.copy(), 16),
                setStackSize(ScrewList.Hastelloy_N_Screw.copy(), 64))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Inconel_625, 144 * 16),
                requiredFluid(MoltenList.Molten_Inconel_792, 144 * 32),
                requiredFluid(MoltenList.Molten_Hastelloy_N, 144 * 32))
            .itemOutputs(setStackSize(MultiMachineControllerList.Flotation_Cell_Regulator, 1))
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Forge of the Gods
        {
            // "Forge of the Gods"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#24")
                .itemInputsUnsafe(
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
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 64),

                    setStackSize(HatchList.Laser_Target_Hatch1048576_UIV.copy(), 1),
                    setStackSize(GTBlockList.Energy_Distributor_UIV.copy(), 1))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 32),
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 8192),
                    requiredFluid(PlasmaList.Thorium_Plasma, 144 * 64 * 4),
                    requiredFluid(MoltenList.Molten_Transcendent_Metal, 144 * 64 * 32))
                .itemOutputs(setStackSize(MultiMachineControllerList.Forge_of_the_Gods, 1))
                .eut(RECIPE_UMV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Helioflare Power Forge"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#25")
                .itemInputsUnsafe(
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
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 32))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 16),
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 2048),
                    requiredFluid(PlasmaList.Lead_Plasma, 144 * 64 * 4),
                    requiredFluid(MoltenList.Molten_Transcendent_Metal, 144 * 64 * 16))
                .itemOutputs(setStackSize(MultiMachineControllerList.Helioflare_Power_Forge, 1))
                .eut(RECIPE_UMV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Helioflux Melting Core"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#26")
                .itemInputsUnsafe(
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

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 32))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 16),
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 2048),
                    requiredFluid(FluidList.Lossless_Phonon_Transfer_Medium, 1000 * 32),
                    requiredFluid(MoltenList.Molten_Transcendent_Metal, 144 * 64 * 16))
                .itemOutputs(setStackSize(MultiMachineControllerList.Helioflux_Melting_Core, 1))
                .eut(RECIPE_UMV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Heliofusion Exoticizer"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#27")
                .itemInputsUnsafe(
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

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 64))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 16),
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 2048),
                    requiredFluid(FluidList.Lossless_Phonon_Transfer_Medium, 1000 * 32),
                    requiredFluid(MoltenList.Molten_Transcendent_Metal, 144 * 64 * 16))
                .itemOutputs(setStackSize(MultiMachineControllerList.Heliofusion_Exoticizer, 1))
                .eut(RECIPE_UMV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Heliothermal Plasma Fabricator"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#28")
                .itemInputsUnsafe(
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

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 32))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 16),
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 2048),
                    requiredFluid(FluidList.Lossless_Phonon_Transfer_Medium, 1000 * 32),
                    requiredFluid(MoltenList.Molten_Transcendent_Metal, 144 * 64 * 16))
                .itemOutputs(setStackSize(MultiMachineControllerList.Heliothermal_Plasma_Fabricator, 1))
                .eut(RECIPE_UMV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Fusion Control Computer
        {
            // "Fusion Control Computer Mark I"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#29")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineCasingList.Fusion_Coil_Block.copy(), 1),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),
                    setStackSize(DensePlateList.Dense_Naquadah_Alloy_Plate.copy(), 4),
                    setStackSize(DensePlateList.Dense_Netherite_Plate.copy(), 1),

                    setStackSize(GTItemList.Field_Generator_LuV.copy(), 2),
                    setStackSize(CircuitList.UHPIC_Wafer.copy(), 32),
                    setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 32))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 20),
                    requiredFluid(MoltenList.Molten_Vanadium_Gallium, 144 * 8))
                .itemOutputs(setStackSize(MultiMachineControllerList.Fusion_Control_Computer_Mark_I, 1))
                .eut(RECIPE_LuV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fusion Control Computer Mark II"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#30")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineCasingList.Fusion_Coil_Block.copy(), 1),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),
                    setStackSize(SuperdensePlateList.Superdense_Europium_Plate.copy(), 1),
                    setStackSize(GTItemList.Field_Generator_ZPM.copy(), 2),

                    setStackSize(CircuitList.PPIC_Wafer.copy(), 48),
                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 64))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 20),
                    requiredFluid(MoltenList.Molten_Niobium_Titanium, 144 * 8))
                .itemOutputs(setStackSize(MultiMachineControllerList.Fusion_Control_Computer_Mark_II, 1))
                .eut(RECIPE_LuV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fusion Control Computer Mark III"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#31")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineCasingList.Fusion_Coil_Block.copy(), 1),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),
                    setStackSize(SuperdensePlateList.Superdense_Americium_Plate.copy(), 1),
                    setStackSize(GTItemList.Field_Generator_UV.copy(), 2),

                    setStackSize(CircuitList.QPIC_Wafer.copy(), 64),
                    setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 64 * 2))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 20),
                    requiredFluid(MoltenList.Molten_Fluxed_Electrum, 144 * 8))
                .itemOutputs(setStackSize(MultiMachineControllerList.Fusion_Control_Computer_Mark_III, 1))
                .eut(RECIPE_ZPM)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "FusionTech MK IV"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#32")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineCasingList.Advanced_Fusion_Coil.copy(), 1),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),
                    setStackSize(SuperdensePlateList.Superdense_Neutronium_Plate.copy(), 1),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 2),

                    setStackSize(CircuitList.FPIC_Wafer.copy(), 64),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 2))
                .fluidInputs(
                    requiredFluid(FluidList.UU_Matter, 1000 * 50),
                    requiredFluid(MoltenList.Molten_Cinobite_A243, 144 * 64),
                    requiredFluid(MoltenList.Molten_Octiron, 144 * 64),
                    requiredFluid(MoltenList.Molten_Astral_Titanium, 144 * 64))
                .itemOutputs(setStackSize(MultiMachineControllerList.FusionTech_MK_IV, 1))
                .eut(RECIPE_UHV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "FusionTech MK V"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#33")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineCasingList.Advanced_Fusion_Coil_II.copy(), 1),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 4),
                    setStackSize(DensePlateList.Dense_Metastable_Oganesson_Plate.copy(), 4),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 2),

                    setStackSize(CircuitList.APIC_Wafer.copy(), 64),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 2))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Curium, 144 * 64),
                    requiredFluid(MoltenList.Molten_Chromatic_Glass, 144 * 64),
                    requiredFluid(MoltenList.Molten_Abyssal_Alloy, 144 * 64),
                    requiredFluid(MoltenList.Molten_Dragonblood, 144 * 64))
                .itemOutputs(setStackSize(MultiMachineControllerList.FusionTech_MK_V, 1))
                .eut(RECIPE_UEV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Compact Fusion Computer MK-II"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#34")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineControllerList.Fusion_Control_Computer_Mark_II.copy(), 48),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),
                    setStackSize(CircuitList.UHPIC_Wafer.copy(), 32),
                    setStackSize(GTItemList.ZPM_Voltage_Coil.copy(), 16),

                    setStackSize(GTItemList.Iridium_Neutron_Reflector.copy(), 4),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKII.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_ZPM.copy(), 8),
                    setStackSize(SmallGearList.Small_Artherium_Sn_Gear.copy(), 32))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_MAR_Ce_M200_Steel, 144 * 16),
                    requiredFluid(MoltenList.Molten_High_Durability_Compound_Steel, 144 * 8),
                    requiredFluid(MoltenList.Molten_Artherium_Sn, 144 * 2))
                .itemOutputs(setStackSize(MultiMachineControllerList.Compact_Fusion_Computer_MKII, 1))
                .eut(RECIPE_ZPM)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Compact Fusion Computer MK-III"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#35")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineControllerList.Fusion_Control_Computer_Mark_III.copy(), 48),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),
                    setStackSize(CircuitList.NPIC_Wafer.copy(), 64),
                    setStackSize(GTItemList.Ultimate_Voltage_Coil.copy(), 16),

                    setStackSize(MiscPlateList.Advanced_Radiation_Proof_Plate.copy(), 8),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKIII.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UV.copy(), 8),
                    setStackSize(SmallGearList.Small_High_Durability_Compound_Steel_Gear.copy(), 64))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Tanmolyium_Beta_C, 144 * 16),
                    requiredFluid(MoltenList.Molten_Dalisenite, 144 * 8),
                    requiredFluid(MoltenList.Molten_Americium, 144 * 2))
                .itemOutputs(setStackSize(MultiMachineControllerList.Compact_Fusion_Computer_MKIII, 1))
                .eut(RECIPE_ZPM)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Compact Fusion Computer Mk-IV"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#36")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineControllerList.FusionTech_MK_IV.copy(), 48),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),
                    setStackSize(CircuitList.PPIC_Wafer.copy(), 64),
                    setStackSize(GTItemList.Highly_Ultimate_Voltage_Coil.copy(), 16),

                    setStackSize(DensePlateList.Dense_Titansteel_Plate.copy(), 8),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKIV_Prototype.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 8),
                    setStackSize(SmallGearList.Small_Enriched_Naquadah_Alloy_Gear.copy(), 64))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Radox_Polymer, 144 * 9),
                    requiredFluid(MoltenList.Molten_Dalisenite, 144 * 8),
                    requiredFluid(MoltenList.Molten_Botmium, 144 * 2))
                .itemOutputs(setStackSize(MultiMachineControllerList.Compact_Fusion_Computer_MkIV, 1))
                .eut(RECIPE_UV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Compact Fusion Computer MK-V"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#37")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineControllerList.FusionTech_MK_V.copy(), 48),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),
                    setStackSize(CircuitList.QPIC_Wafer.copy(), 64),
                    setStackSize(GTItemList.Extremely_Ultimate_Voltage_Coil.copy(), 16),

                    setStackSize(DensePlateList.Dense_Hypogen_Plate.copy(), 8),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKV_Finaltype.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 8),
                    setStackSize(SmallGearList.Small_Metastable_Oganesson_Gear.copy(), 64))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Tairitsu, 144 * 16),
                    requiredFluid(MoltenList.Molten_Octiron, 144 * 8),
                    requiredFluid(MoltenList.Molten_Rhugnor, 144 * 2))
                .itemOutputs(setStackSize(MultiMachineControllerList.Compact_Fusion_Computer_MKV, 1))
                .eut(RECIPE_UHV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Hot Isostatic Pressurization Unit"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#38")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Large_Electric_Compressor.copy(), 4),
                setStackSize(MultiMachineCasingList.Heating_Duct.copy(), 4),
                setStackSize(MultiMachineCasingList.Coolant_Duct.copy(), 4),
                setStackSize(BlockList.Block_of_Netherite.copy(), 4),

                setStackSize(GTItemList.Electric_Piston_ZPM.copy(), 16),
                setStackSize(GTItemList.Robot_Arm_ZPM.copy(), 4),
                setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 4),
                getMaterialInput(OrePrefixes.circuit, Materials.UV, 4))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Incoloy_903, 144 * 64 * 4),
                requiredFluid(MoltenList.Molten_Enriched_Naquadah, 144 * 64),
                requiredFluid(FluidList.Liquid_Air, 1000 * 16),
                requiredFluid(FluidList.Lubricant, 1000 * 16))
            .itemOutputs(setStackSize(MultiMachineControllerList.Hot_Isostatic_Pressurization_Unit, 1))
            .eut(RECIPE_ZPM)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Industrial Apicultural Acclimatiser and Drone Domestication Station"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#39")
            .itemInputsUnsafe(
                setStackSize(MachineList.Industrial_Apiary.copy(), 64),
                setStackSize(GTItemList.Upgraded_Acceleration_Upgrade_x256.copy(), 64),
                setStackSize(GTItemList.Genetic_Stabilizer_Upgrade.copy(), 64),
                setStackSize(GTItemList.Electric_Pump_UHV.copy(), 16),

                setStackSize(GTItemList.Robot_Arm_UV.copy(), 16),
                getMaterialInput(OrePrefixes.circuit, Materials.UV, 16))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 200),
                requiredFluid(FluidList.Honey_Forestry, 1000 * 20))
            .itemOutputs(
                setStackSize(
                    MultiMachineControllerList.Industrial_Apicultural_Acclimatiser_and_Drone_Domestication_Station,
                    1))
            .eut(RECIPE_UHV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Infinite Fluid Drilling Rig"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#40")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Fluid_Drilling_Rig_IV.copy(), 1),
                setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 4),
                getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),
                setStackSize(GTItemList.Electric_Motor_UHV.copy(), 4),

                setStackSize(GTItemList.Electric_Pump_UHV.copy(), 4),
                setStackSize(GearList.Neutronium_Gear.copy(), 4),
                setStackSize(GTItemList.Sensor_UHV.copy(), 3),
                setStackSize(GTItemList.Field_Generator_UHV.copy(), 3),

                setStackSize(ScrewList.Neutronium_Screw.copy(), 12))
            .fluidInputs(
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 9),
                requiredFluid(MoltenList.Molten_Neutronium, 144 * 4))
            .itemOutputs(setStackSize(MultiMachineControllerList.Infinite_Fluid_Drilling_Rig, 1))
            .eut(RECIPE_UHV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Integrated Ore Factory"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#41")
            .itemInputsUnsafe(
                setStackSize(GTBlockList.Machine_Hull_UHV.copy(), 1),
                setStackSize(GTItemList.Electric_Motor_UHV.copy(), 32),
                setStackSize(GTItemList.Electric_Piston_UHV.copy(), 8),
                setStackSize(GTItemList.Electric_Pump_UHV.copy(), 16),

                setStackSize(GTItemList.Conveyor_Module_UHV.copy(), 8),
                setStackSize(GTItemList.Robot_Arm_UHV.copy(), 8),
                getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),
                setStackSize(WireList.Naquadah_Alloy_Wire_1x.copy(), 64 * 2),

                setStackSize(PipeList.PBI_Fluid_Pipe.copy(), 64),
                setStackSize(GTItemList.Tungsten_Grinding_Head.copy(), 64),
                setStackSize(DoublePlateList.Double_Stainless_Steel_Plate.copy(), 32),
                setStackSize(RotorList.Chrome_Rotor.copy(), 16))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 20),
                requiredFluid(MoltenList.Molten_Naquadria, 144 * 10))
            .itemOutputs(setStackSize(MultiMachineControllerList.Integrated_Ore_Factory, 1))
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "IsaMill Grinding Machine"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#42")
            .itemInputsUnsafe(
                setStackSize(MultiMachineCasingList.IsaMill_Exterior_Casing.copy(), 4),
                setStackSize(MultiMachineCasingList.IsaMill_Gearbox.copy(), 4),
                setStackSize(GTItemList.Tungsten_Grinding_Head.copy(), 16),
                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 16),

                setStackSize(GearList.Inconel_625_Gear.copy(), 8),
                setStackSize(PlateList.Inconel_625_Plate.copy(), 32),
                setStackSize(DoublePlateList.Double_Zeron_100_Plate.copy(), 16),
                setStackSize(ScrewList.Zeron_100_Screw.copy(), 64))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Zeron_100, 144 * 16),
                requiredFluid(MoltenList.Molten_Lafium_Compound, 144 * 32),
                requiredFluid(MoltenList.Molten_Trinium_Naquadah_Carbonite, 144 * 32))
            .itemOutputs(setStackSize(MultiMachineControllerList.IsaMill_Grinding_Machine, 1))
            .eut(RECIPE_LuV)
            .duration(600 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Large Hadron Collider"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#43")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Research_Station.copy(), 8),
                setStackSize(HatchList.Neutron_Accelerator_UV.copy(), 8),
                setStackSize(GoodGeneratorList.Compact_Fusion_Coil.copy(), 64),
                setStackSize(GoodGeneratorList.Advanced_Compact_Fusion_Coil.copy(), 32),

                getMaterialInput(OrePrefixes.circuit, Materials.UHV, 64),
                setStackSize(GTItemList.Field_Generator_UV.copy(), 64),
                setStackSize(GTItemList.Samarium_Electromagnet.copy(), 1),
                setStackSize(MultiMachineCasingList.Charged_Matter_Sensor_Casing.copy(), 8))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Neutronium, 144 * 64 * 72),
                requiredFluid(MoltenList.Molten_Cosmic_Neutronium, 144 * 64 * 72))
            .itemOutputs(setStackSize(MultiMachineControllerList.Large_Hadron_Collider, 1))
            .eut(RECIPE_UHV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Large Naquadah Reactor"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#44")
            .itemInputsUnsafe(
                setStackSize(FrameBoxList.Adamantium_Frame_Box.copy(), 8),
                setStackSize(GoodGeneratorList.Radiation_Proof_Plate.copy(), 16),
                setStackSize(GTItemList.Field_Generator_ZPM.copy(), 2),
                setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 8),

                getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),
                setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 64),
                setStackSize(PipeList.Huge_Naquadah_Fluid_Pipe.copy(), 4),
                setStackSize(PlateList.Prismatic_Naquadah_Plate.copy(), 8),

                setStackSize(ScrewList.Osmium_Screw.copy(), 16))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Trinium, 144 * 4),
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 32),
                requiredFluid(FluidList.Lubricant, 1000 * 8))
            .itemOutputs(setStackSize(MultiMachineControllerList.Large_Naquadah_Reactor, 1))
            .eut(RECIPE_LuV)
            .duration(600 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Matter Manipulator Quantum Uplink"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#45")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Data_Bank.copy(), 1),
                setStackSize(Appliedenergistics2List.ME_Controller.copy(), 4),
                setStackSize(Appliedenergistics2List.ME_Quantum_Ring.copy(), 8),
                setStackSize(Appliedenergistics2List.ME_Quantum_Link_Chamber.copy(), 1),

                setStackSize(Appliedenergistics2List.ME_IO_Port.copy(), 1),
                setStackSize(Appliedenergistics2List.Hyper_Acceleration_Card.copy(), 2),
                setStackSize(HatchList.Optical_Transmission_Connector.copy(), 1),
                setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 32),

                getMaterialInput(OrePrefixes.circuit, Materials.UHV, 2))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 64),
                requiredFluid(MoltenList.Molten_Naquadria, 144 * 32))
            .itemOutputs(setStackSize(MultiMachineControllerList.Matter_Manipulator_Quantum_Uplink, 1))
            .eut(RECIPE_UV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Mega Alloy Blast Smelter"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#46")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Alloy_Blast_Smelter.copy(), 64 * 4),
                setStackSize(GTItemList.Ultimate_Voltage_Coil.copy(), 16),
                setStackSize(GTItemList.Conveyor_Module_UV.copy(), 4),
                getMaterialInput(OrePrefixes.circuit, Materials.UV, 8),
                getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 16),
                setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 16),

                setStackSize(PlateList.Pikyonium_64B_Plate.copy(), 16),
                setStackSize(ScrewList.Cinobite_A243_Screw.copy(), 32))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Pikyonium_64B, 144 * 8),
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 9),
                requiredFluid(MoltenList.Molten_Soldering_Alloy, 144 * 10))
            .itemOutputs(setStackSize(MultiMachineControllerList.Mega_Alloy_Blast_Smelter, 1))
            .eut(RECIPE_UHV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Mega Chemical Reactor"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#47")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Large_Chemical_Reactor.copy(), 64),
                setStackSize(MultiMachineControllerList.ExxonMobil_Chemical_Plant.copy(), 4),
                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),
                setStackSize(MultiMachineCasingList.Chemically_Inert_Machine_Casing.copy(), 8),

                setStackSize(GTItemList.Electric_Pump_LuV.copy(), 4),
                setStackSize(GTItemList.Fluid_Regulator_LuV.copy(), 4),
                setStackSize(MachineList.Chemical_Reactor_IV.copy(), 2),
                setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 32))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 10),
                requiredFluid(MoltenList.Molten_Naquadah, 144 * 4),
                requiredFluid(FluidList.Lubricant, 1000 * 16))
            .itemOutputs(setStackSize(MultiMachineControllerList.Mega_Chemical_Reactor, 1))
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Mega Distillation Tower"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#48")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Distillation_Tower.copy(), 64),
                setStackSize(MultiMachineControllerList.Dangote_Distillus.copy(), 4),
                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),
                setStackSize(MultiMachineCasingList.Naquadah_Reinforced_Distillation_Casing.copy(), 8),

                setStackSize(GTItemList.Electric_Pump_LuV.copy(), 4),
                setStackSize(GTItemList.Fluid_Regulator_LuV.copy(), 4),
                setStackSize(MachineList.Distillery_IV.copy(), 2),
                setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 32))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 10),
                requiredFluid(MoltenList.Molten_Naquadah, 144 * 4),
                requiredFluid(FluidList.Lubricant, 1000 * 16))
            .itemOutputs(setStackSize(MultiMachineControllerList.Mega_Distillation_Tower, 1))
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Mega Oil Cracker"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#49")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Oil_Cracking_Unit.copy(), 64),
                setStackSize(MultiMachineControllerList.Large_Chemical_Reactor.copy(), 4),
                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),
                setStackSize(MultiMachineCasingList.Naquadah_Reinforced_Distillation_Casing.copy(), 8),

                setStackSize(GTItemList.Steam_Valve_IV.copy(), 8),
                setStackSize(GTItemList.Steam_Regulator_IV.copy(), 8),
                setStackSize(MultiMachineCasingList.Naquadah_Coil_Block.copy(), 8),
                setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 32))
            .fluidInputs(
                requiredFluid(FluidList.Lubricant, 1000 * 16),
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 10),
                requiredFluid(MoltenList.Molten_Naquadah, 144 * 4))
            .itemOutputs(setStackSize(MultiMachineControllerList.Mega_Oil_Cracker, 1))
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Miniature Wormhole Generator"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#50")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 1),
                setStackSize(Appliedenergistics2List.Singularity.copy(), 4),
                setStackSize(GTItemList.Field_Generator_ZPM.copy(), 4),
                setStackSize(GTItemList.Emitter_ZPM.copy(), 4),

                setStackSize(MultiMachineCasingList.Fusion_Coil_Block.copy(), 4),
                getMaterialInput(OrePrefixes.circuit, Materials.UV, 2),
                setStackSize(GTBlockList.Laser_Vacuum_Pipe.copy(), 64))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Neutronium, 144 * 12),
                requiredFluid(MoltenList.Molten_Tritanium, 144 * 12),
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 24),
                requiredFluid(FluidList.Super_Coolant, 1000 * 7))
            .itemOutputs(setStackSize(MultiMachineControllerList.Miniature_Wormhole_Generator, 1))
            .eut(RECIPE_ZPM)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Molecular Transformer"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#51")
            .itemInputsUnsafe(
                setStackSize(FineWireList.Fine_HG_1223_Wire.copy(), 64 * 2),
                setStackSize(GTItemList.Electric_Motor_IV.copy(), 16),
                setStackSize(BatteryList.Lapotronic_Energy_Orb_Empty.copy(), 16),
                setStackSize(CableList.Platinum_Cable_12x.copy(), 16),

                setStackSize(WireList.Nichrome_Wire_16x.copy(), 32),
                setStackSize(FrameBoxList.Zeron_100_Frame_Box.copy(), 4),
                setStackSize(DoublePlateList.Double_Zirconium_Carbide_Plate.copy(), 32),
                setStackSize(PlateList.Babbit_Alloy_Plate.copy(), 64),

                setStackSize(GearList.Grisium_Gear.copy(), 8),
                getMaterialInput(OrePrefixes.circuit, Materials.EV, 64),
                getMaterialInput(OrePrefixes.circuit, Materials.IV, 32),
                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 16),

                setStackSize(GTItemList.Woods_Glass_Lens.copy(), 1))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Nitinol_60, 144 * 18),
                requiredFluid(MoltenList.Molten_Incoloy_MA956, 144 * 72),
                requiredFluid(MoltenList.Molten_Kanthal, 144 * 4))
            .itemOutputs(setStackSize(MultiMachineControllerList.Molecular_Transformer, 1))
            .eut(RECIPE_LuV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Mothership Navigation Console"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#52")
            .itemInputsUnsafe(
                setStackSize(GTBlockList.Machine_Hull_UHV.copy(), 1),
                setStackSize(AmunRaList.Nanite_Control_Module.copy(), 32),
                setStackSize(MiscPlateList.Irradiant_Reinforced_Neutronium_Plate.copy(), 64),
                setStackSize(GalaxySpaceList.Rocket_Control_Computer_Tier_8.copy(), 4),

                getMaterialInput(OrePrefixes.circuit, Materials.UHV, 16),
                setStackSize(GTItemList.Sensor_UHV.copy(), 8),
                setStackSize(GTItemList.Emitter_UHV.copy(), 8))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Infinity, 144 * 100),
                requiredFluid(MoltenList.Molten_Enriched_Naquadah_Alloy, 144 * 64 * 4),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64))
            .itemOutputs(setStackSize(MultiMachineControllerList.Mothership_Navigation_Console, 1))
            .eut(RECIPE_UEV)
            .duration(240 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Nano Forge"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#53")
            .itemInputsUnsafe(
                setStackSize(GTBlockList.Machine_Hull_UV.copy(), 16),
                setStackSize(GTItemList.Carbon_Nanites.copy(), 16),
                setStackSize(GTItemList.Field_Generator_ZPM.copy(), 16),
                setStackSize(GTItemList.Conveyor_Module_UV.copy(), 16),

                setStackSize(GTItemList.Electric_Motor_UV.copy(), 32),
                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 16),
                setStackSize(WireList.Naquadah_Wire_1x.copy(), 64 * 4),
                setStackSize(SuperdensePlateList.Superdense_Naquadah_Alloy_Plate.copy(), 4))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 32),
                requiredFluid(MoltenList.Molten_HSS_S, 144 * 32),
                requiredFluid(MoltenList.Molten_Osmiridium, 144 * 16))
            .itemOutputs(setStackSize(MultiMachineControllerList.Nano_Forge, 1))
            .eut(RECIPE_ZPM)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Nanochip Assembly Complex"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#54")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Circuit_Assembly_Line.copy(), 64),
                setStackSize(MultiMachineControllerList.Quantum_Computer.copy(), 8),
                setStackSize(MultiMachineControllerList.Research_Station.copy(), 8),
                setStackSize(MultiMachineControllerList.Data_Bank.copy(), 8),

                setStackSize(MultiMachineCasingList.Nanochip_Mesh_Interface_Casing.copy(), 16),
                setStackSize(MultiMachineCasingList.Nanochip_Reinforcement_Casing.copy(), 16),
                setStackSize(MultiMachineCasingList.Nanochip_Computational_Matrix_Casing.copy(), 8),
                setStackSize(MultiMachineCasingList.Nanochip_Firewall_Projection_Casing.copy(), 4),

                getMaterialInput(OrePrefixes.circuit, Materials.UEV, 8),
                getMaterialInput(OrePrefixes.circuit, Materials.UHV, 16),
                getMaterialInput(OrePrefixes.circuit, Materials.UV, 32),
                setStackSize(BatteryList.Ultimate_Battery_Empty.copy(), 1),

                setStackSize(GTItemList.Sensor_UEV.copy(), 4),
                setStackSize(GTItemList.Emitter_UEV.copy(), 4),
                setStackSize(OpenComputersList.Screen_Tier3.copy(), 1),
                setStackSize(OpenComputersList.Keyboard.copy(), 1))
            .fluidInputs(
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 4),
                requiredFluid(PlasmaList.Celestial_Tungsten_Plasma, 144 * 64),
                requiredFluid(PlasmaList.Americium_Plasma, 144 * 64),
                requiredFluid(PlasmaList.Astral_Titanium_Plasma, 144 * 64))
            .itemOutputs(setStackSize(MultiMachineControllerList.Nanochip_Assembly_Complex, 1))
            .eut(RECIPE_UIV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Naquadah Fuel Refinery"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#55")
            .itemInputsUnsafe(
                setStackSize(FrameBoxList.Osmiridium_Frame_Box.copy(), 8),
                setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 64),
                setStackSize(GTItemList.Field_Generator_UV.copy(), 8),
                setStackSize(GTItemList.Electric_Pump_UHV.copy(), 2),

                getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),
                setStackSize(PipeList.Huge_Mysterious_Crystal_Fluid_Pipe.copy(), 8),
                setStackSize(CircuitList.NPIC_Wafer.copy(), 16),
                setStackSize(GTItemList.Highly_Ultimate_Voltage_Coil.copy(), 64),

                setStackSize(GTItemList.Aer_Lens.copy(), 16),
                setStackSize(ScrewList.Thulium_Screw.copy(), 64))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Quantium, 144 * 64),
                requiredFluid(MoltenList.Molten_Awakened_Draconium, 144 * 32),
                requiredFluid(MoltenList.Molten_Extremely_Unstable_Naquadah, 144 * 10),
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 100))
            .itemOutputs(setStackSize(MultiMachineControllerList.Naquadah_Fuel_Refinery, 1))
            .eut(RECIPE_UHV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "PCB Factory"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#56")
            .itemInputsUnsafe(
                setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 32),
                setStackSize(MachineList.Circuit_Assembler_ZPM.copy(), 4),
                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 16),
                setStackSize(GTItemList.Robot_Arm_ZPM.copy(), 8))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 36),
                requiredFluid(MoltenList.Molten_Naquadah, 144 * 18))
            .itemOutputs(setStackSize(MultiMachineControllerList.PCB_Factory, 1))
            .eut(RECIPE_UV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Pseudostable Black Hole Containment Field"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#57")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Hot_Isostatic_Pressurization_Unit.copy(), 1),
                setStackSize(MultiMachineControllerList.Neutronium_Compressor.copy(), 1),
                setStackSize(MultiMachineControllerList.Density2.copy(), 16),
                setStackSize(MachineList.Compressor_UIV.copy(), 8),

                setStackSize(MultiMachineControllerList.Electric_Implosion_Compressor.copy(), 4),
                setStackSize(GTItemList.Field_Generator_UEV.copy(), 4),
                setStackSize(BatteryList.Really_Ultimate_Battery_Empty.copy(), 2),
                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 4),

                setStackSize(GTPPList.Quantum_Anomaly.copy(), 64),
                setStackSize(RingList.Proto_Halkonite_Steel_Ring.copy(), 32),
                setStackSize(RotorList.Proto_Halkonite_Steel_Rotor.copy(), 16),
                setStackSize(GearList.Proto_Halkonite_Steel_Gear.copy(), 8),

                setStackSize(SuperdensePlateList.Superdense_Neutronium_Plate.copy(), 16),
                setStackSize(SuperdensePlateList.Superdense_Naquadria_Plate.copy(), 16),
                setStackSize(SuperdensePlateList.Superdense_Cosmic_Neutronium_Plate.copy(), 8),
                setStackSize(SuperdensePlateList.Superdense_Kevlar_Plate.copy(), 4))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_SpaceTime, 144 * 10),
                requiredFluid(GasList.Oganesson, 1000 * 64 * 4),
                requiredFluid(MoltenList.Molten_Superconductor_Base_UIV, 144 * 300),
                requiredFluid(MoltenList.Molten_Infinity, 144 * 100))
            .itemOutputs(setStackSize(MultiMachineControllerList.Pseudostable_Black_Hole_Containment_Field, 1))
            .eut(RECIPE_UIV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Quantum Computer"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#58")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Static_Network_Switch_With_QoS.copy(), 1),
                getMaterialInput(OrePrefixes.circuit, Materials.UV, 2),
                setStackSize(GTItemList.Data_Orb.copy(), 1),
                setStackSize(GTItemList.Computer_Monitor_Cover.copy(), 1),

                setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 32),
                setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 8),
                setStackSize(SuperdensePlateList.Superdense_Polybenzimidazole_PBI_Sheet.copy(), 2))
            .fluidInputs(
                requiredFluid(FluidList.UU_Matter, 1000),
                requiredFluid(MoltenList.Molten_Iridium, 144 * 9),
                requiredFluid(FluidList.IC2_Coolant, 1000 * 2),
                requiredFluid(GasList.Hydrogen, 1000))
            .itemOutputs(setStackSize(MultiMachineControllerList.Quantum_Computer, 1))
            .eut(RECIPE_ZPM)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Quantum Force Transformer"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#59")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Molecular_Transformer.copy(), 1),
                setStackSize(SingularityList.Eternal_Singularity.copy(), 1),
                getMaterialInput(OrePrefixes.circuit, Materials.UEV, 8),
                setStackSize(GTItemList.Electric_Pump_UEV.copy(), 4),

                setStackSize(GTItemList.Field_Generator_UEV.copy(), 4),
                setStackSize(GTPPList.Quantum_Anomaly.copy(), 1))
            .fluidInputs(
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 10),
                requiredFluid(MoltenList.Molten_Pikyonium_64B, 144 * 32))
            .itemOutputs(setStackSize(MultiMachineControllerList.Quantum_Force_Transformer, 1))
            .eut(RECIPE_UIV)
            .duration(180 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Research Station"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#60")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Static_Network_Switch_With_QoS.copy(), 1),
                setStackSize(GTItemList.Sensor_ZPM.copy(), 8),
                getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),
                setStackSize(GTItemList.Field_Generator_ZPM.copy(), 1),

                setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 2),
                setStackSize(CableList.Naquadah_Cable_2x.copy(), 4),
                setStackSize(FineWireList.Fine_Naquadah_Wire.copy(), 32),
                setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 16))
            .fluidInputs(
                requiredFluid(FluidList.UU_Matter, 1000),
                requiredFluid(MoltenList.Molten_Iridium, 144 * 9),
                requiredFluid(FluidList.IC2_Coolant, 1000 * 2),
                requiredFluid(MoltenList.Molten_Osmium, 144 * 9))
            .itemOutputs(setStackSize(MultiMachineControllerList.Research_Station, 1))
            .eut(RECIPE_UV)
            .duration(180 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Semi-Stable Antimatter Stabilization Sequencer"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#61")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Compact_Fusion_Computer_MKV.copy(), 1),
                setStackSize(FrameBoxList.Proto_Halkonite_Steel_Frame_Box.copy(), 16),
                setStackSize(MultiMachineCasingList.Cosmic_Fabric_Manipulator.copy(), 16),
                setStackSize(GoodGeneratorList.Ultimate_Field_Restriction_Coil.copy(), 16),

                setStackSize(FineWireList.Fine_Hypogen_Wire.copy(), 64),
                setStackSize(FineWireList.Fine_Proto_Halkonite_Steel_Wire.copy(), 64),
                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 16),
                setStackSize(GTItemList.Electric_Pump_UIV.copy(), 16),

                setStackSize(SuperdensePlateList.Superdense_Proto_Halkonite_Steel_Plate.copy(), 4),
                setStackSize(DensePlateList.Dense_Transcendent_Metal_Plate.copy(), 64))
            .fluidInputs(
                requiredFluid(FluidList.Protomatter, 1000 * 10),
                requiredFluid(MoltenList.Molten_Six_Phased_Copper, 144 * 64),
                requiredFluid(MoltenList.Molten_Transcendent_Metal, 144 * 64),
                requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 10))
            .itemOutputs(setStackSize(MultiMachineControllerList.Semi_Stable_Antimatter_Stabilization_Sequencer, 1))
            .eut(RECIPE_UMV)
            .duration(360 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Shielded Lagrangian Annihilation Matrix"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#62")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Miniature_Wormhole_Generator.copy(), 1),
                setStackSize(HatchList.Laser_Source_Hatch1048576_UIV.copy(), 4),
                setStackSize(GoodGeneratorList.Protomatter_Activation_Coil.copy(), 16),
                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 16),

                setStackSize(GTItemList.Emitter_UIV.copy(), 32),
                setStackSize(SuperdensePlateList.Superdense_Proto_Halkonite_Steel_Plate.copy(), 4),
                setStackSize(RotorList.Proto_Halkonite_Steel_Rotor.copy(), 16),
                setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 16),

                setStackSize(FineWireList.Fine_Hypogen_Wire.copy(), 64 * 3))
            .fluidInputs(
                requiredFluid(FluidList.Semi_Stable_Antimatter, 1000),
                requiredFluid(MoltenList.Molten_Six_Phased_Copper, 144 * 64),
                requiredFluid(MoltenList.Molten_Transcendent_Metal, 144 * 64),
                requiredFluid(MoltenList.Molten_Superconductor_Base_UIV, 144 * 64))
            .itemOutputs(setStackSize(MultiMachineControllerList.Shielded_Lagrangian_Annihilation_Matrix, 1))
            .eut(RECIPE_UMV)
            .duration(360 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Space Elevator
        {
            // "Space Elevator"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#63")
                .itemInputsUnsafe(
                    setStackSize(OpenBlocksList.Elevator.copy(), 1),
                    setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 64),
                    setStackSize(GTItemList.Field_Generator_UV.copy(), 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 16),

                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_7.copy(), 32),
                    setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 64),
                    setStackSize(ScrewList.Cosmic_Neutronium_Screw.copy(), 64),
                    setStackSize(GTItemList.Electric_Motor_UV.copy(), 32),

                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 40),
                    requiredFluid(FluidList.UU_Matter, 1000 * 16),
                    requiredFluid(FluidList.Lubricant, 1000 * 32),
                    requiredFluid(MoltenList.Molten_Neutronium, 144 * 10))
                .itemOutputs(setStackSize(MultiMachineControllerList.Space_Elevator, 1))
                .eut(RECIPE_UHV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Assembler Module MK-I"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#64")
                .itemInputsUnsafe(
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 1),
                    setStackSize(MachineList.Assembler_UV.copy(), 4),
                    setStackSize(MachineList.Circuit_Assembler_UV.copy(), 4),
                    setStackSize(GearList.Cosmic_Neutronium_Gear.copy(), 8),

                    setStackSize(SmallGearList.Small_Cosmic_Neutronium_Gear.copy(), 16),
                    setStackSize(GTItemList.Robot_Arm_UHV.copy(), 8),
                    setStackSize(GTItemList.Conveyor_Module_UHV.copy(), 16),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKIII.copy(), 32),

                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 16),
                    setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 8),
                    setStackSize(ScrewList.Neutronium_Screw.copy(), 32))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 9),
                    requiredFluid(MoltenList.Molten_Naquadria, 144 * 9),
                    requiredFluid(FluidList.Lubricant, 1000 * 16))
                .itemOutputs(setStackSize(MultiMachineControllerList.Space_Assembler_Module_MKI, 1))
                .eut(RECIPE_UEV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Assembler Module MK-II"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#65")
                .itemInputsUnsafe(
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 1),
                    setStackSize(MachineList.Assembler_UEV.copy(), 4),
                    setStackSize(MachineList.Circuit_Assembler_UEV.copy(), 4),
                    setStackSize(GearList.Transcendent_Metal_Gear.copy(), 8),

                    setStackSize(SmallGearList.Small_Proto_Halkonite_Steel_Gear.copy(), 16),
                    setStackSize(GTItemList.Robot_Arm_UIV.copy(), 8),
                    setStackSize(GTItemList.Conveyor_Module_UIV.copy(), 16),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKIV_Prototype.copy(), 32),

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 16),
                    setStackSize(FrameBoxList.Hypogen_Frame_Box.copy(), 8),
                    setStackSize(ScrewList.Hypogen_Screw.copy(), 32))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 9),
                    requiredFluid(MoltenList.Molten_Infinity, 144 * 9),
                    requiredFluid(FluidList.UU_Matter, 1000 * 16))
                .itemOutputs(setStackSize(MultiMachineControllerList.Space_Assembler_Module_MKII, 1))
                .eut(RECIPE_UIV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Assembler Module MK-III"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#66")
                .itemInputsUnsafe(
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
                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 16),
                    setStackSize(FrameBoxList.Universium_Frame_Box.copy(), 8),

                    setStackSize(ScrewList.Universium_Screw.copy(), 32))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 36),
                    requiredFluid(MoltenList.Molten_Black_Dwarf_Matter, 144 * 9),
                    requiredFluid(MoltenList.Molten_White_Dwarf_Matter, 144 * 9),
                    requiredFluid(MoltenList.Molten_SpaceTime, 144 * 9))
                .itemOutputs(setStackSize(MultiMachineControllerList.Space_Assembler_Module_MKIII, 1))
                .eut(RECIPE_UXV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Mining Module MK-I"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#67")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineControllerList.Ore_Drilling_Plant_IV.copy(), 1),
                    setStackSize(GTItemList.Robot_Arm_UV.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UV.copy(), 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 16),

                    setStackSize(GTItemList.Sensor_UV.copy(), 16),
                    setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 64 * 2),
                    setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 16))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 20),
                    requiredFluid(MoltenList.Molten_Naquadria, 144 * 10),
                    requiredFluid(FluidList.Lubricant, 1000 * 8))
                .itemOutputs(setStackSize(MultiMachineControllerList.Space_Mining_Module_MKI, 1))
                .eut(RECIPE_UHV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Mining Module MK-II"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#68")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineControllerList.Space_Mining_Module_MKI.copy(), 1),
                    setStackSize(GTItemList.Robot_Arm_UHV.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 16),

                    setStackSize(GTItemList.Sensor_UHV.copy(), 16),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 2),
                    setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box.copy(), 16))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 20),
                    requiredFluid(MoltenList.Molten_Naquadria, 144 * 20),
                    requiredFluid(FluidList.Lubricant, 1000 * 16))
                .itemOutputs(setStackSize(MultiMachineControllerList.Space_Mining_Module_MKII, 1))
                .eut(RECIPE_UEV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Mining Module MK-III"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#69")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineControllerList.Space_Mining_Module_MKII.copy(), 1),
                    setStackSize(GTItemList.Robot_Arm_UEV.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 16),

                    setStackSize(GTItemList.Sensor_UEV.copy(), 16),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 2),
                    setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 16))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 20),
                    requiredFluid(MoltenList.Molten_Transcendent_Metal, 144 * 10),
                    requiredFluid(FluidList.UU_Matter, 1000 * 2))
                .itemOutputs(setStackSize(MultiMachineControllerList.Space_Mining_Module_MKIII, 1))
                .eut(RECIPE_UIV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Pumping Module MK-I"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#70")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineControllerList.Infinite_Fluid_Drilling_Rig.copy(), 1),
                    setStackSize(MultiMachineControllerList.Planetary_Gas_Siphon.copy(), 1),
                    setStackSize(TecTechList.Ender_Fluid_Link_Cover.copy(), 2),
                    setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 4),

                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),
                    setStackSize(GTItemList.Electric_Pump_UEV.copy(), 2),
                    setStackSize(GearList.Infinity_Gear.copy(), 4),
                    setStackSize(ScrewList.Cosmic_Neutronium_Screw.copy(), 32))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 9),
                    requiredFluid(MoltenList.Molten_Infinity, 144 * 4))
                .itemOutputs(setStackSize(MultiMachineControllerList.Space_Pumping_Module_MKI, 1))
                .eut(RECIPE_UEV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Pumping Module MK-II"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#71")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineControllerList.Infinite_Fluid_Drilling_Rig.copy(), 4),
                    setStackSize(MultiMachineControllerList.Planetary_Gas_Siphon.copy(), 4),
                    setStackSize(TecTechList.Ender_Fluid_Link_Cover.copy(), 8),
                    setStackSize(FrameBoxList.SpaceTime_Frame_Box.copy(), 4),

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 4),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 8),
                    setStackSize(GearList.SpaceTime_Gear.copy(), 4),
                    setStackSize(ScrewList.Metastable_Oganesson_Screw.copy(), 64))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 32),
                    requiredFluid(MoltenList.Molten_Proto_Halkonite_Steel_Base, 144 * 16))
                .itemOutputs(setStackSize(MultiMachineControllerList.Space_Pumping_Module_MKII, 1))
                .eut(RECIPE_UIV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Pumping Module MK-III"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#72")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineControllerList.Infinite_Fluid_Drilling_Rig.copy(), 16),
                    setStackSize(MultiMachineControllerList.Planetary_Gas_Siphon.copy(), 16),
                    setStackSize(TecTechList.Ender_Fluid_Link_Cover.copy(), 32),
                    setStackSize(FrameBoxList.Black_Dwarf_Matter_Frame_Box.copy(), 4),

                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 16),
                    setStackSize(GTItemList.Electric_Pump_UMV.copy(), 8),
                    setStackSize(GearList.Black_Dwarf_Matter_Gear.copy(), 4),
                    setStackSize(ScrewList.White_Dwarf_Matter_Screw.copy(), 64))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64),
                    requiredFluid(MoltenList.Molten_Eternity, 144 * 16))
                .itemOutputs(setStackSize(MultiMachineControllerList.Space_Pumping_Module_MKIII, 1))
                .eut(RECIPE_UMV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Sparge Tower Controller"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#73")
            .itemInputsUnsafe(
                setStackSize(MultiMachineCasingList.Sparge_Tower_Exterior_Casing.copy(), 4),
                setStackSize(MultiMachineCasingList.Integral_Encasement_V.copy(), 4),
                setStackSize(MachineList.Distillery_IV.copy(), 1),
                getMaterialInput(OrePrefixes.circuit, Materials.IV, 8),

                setStackSize(GearList.HS188_A_Gear.copy(), 8),
                setStackSize(PlateList.HS188_A_Plate.copy(), 32),
                setStackSize(DoublePlateList.Double_Hastelloy_N_Plate.copy(), 16),
                setStackSize(ScrewList.Hastelloy_N_Screw.copy(), 64),

                setStackSize(FineWireList.Fine_Yttrium_Barium_Cuprate_Wire.copy(), 64 * 2),
                setStackSize(FoilList.Platinum_Foil.copy(), 64))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Incoloy_DS, 144 * 16),
                requiredFluid(MoltenList.Molten_Tantalum_Carbide, 144 * 32),
                requiredFluid(MoltenList.Molten_Titanium, 144 * 32))
            .itemOutputs(setStackSize(MultiMachineControllerList.Sparge_Tower_Controller, 1))
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Spinmatron-2737
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#74")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Industrial_Centrifuge.copy(), 64),
                setStackSize(MultiMachineControllerList.Large_Supercritical_Steam_Turbine.copy(), 4),
                setStackSize(HatchList.Rotor_Assembly.copy(), 4),
                getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),

                setStackSize(RotorList.Pikyonium_64B_Rotor.copy(), 4),
                setStackSize(RotorList.HeLiCoPtEr_Rotor.copy(), 4),
                setStackSize(RotorList.Arceus_Alloy_2B_Rotor.copy(), 4),
                setStackSize(RotorList.Netherite_Rotor.copy(), 4),

                setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 4),
                setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 4),
                setStackSize(ScrewList.Pikyonium_64B_Screw.copy(), 16),
                setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 64))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_MAR_Ce_M200_Steel, 144 * 16),
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 10),
                requiredFluid(FluidList.Lubricant, 1000 * 4))
            .itemOutputs(setStackSize(MultiMachineControllerList.Spinmatron_2737, 1))
            .eut(RECIPE_ZPM)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Transcendent Plasma Mixer"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#75")
            .itemInputsUnsafe(
                setStackSize(HatchList.Laser_Target_Hatch262144_UEV.copy(), 4),
                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 32),
                setStackSize(GTItemList.Electric_Pump_UEV.copy(), 16),
                setStackSize(PlateList.Proto_Halkonite_Steel_Plate.copy(), 64),

                setStackSize(GearList.Proto_Halkonite_Steel_Gear.copy(), 16),
                setStackSize(SmallGearList.Small_Proto_Halkonite_Steel_Gear.copy(), 64),
                setStackSize(ScrewList.Proto_Halkonite_Steel_Screw.copy(), 64),
                setStackSize(GTItemList.Energised_Tesseract.copy(), 32))
            .fluidInputs(
                requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Crude_Catalyst, 1000 * 64 * 32),
                requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Prosaic_Catalyst, 1000 * 64 * 32),
                requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Resplendent_Catalyst, 1000 * 64 * 32),
                requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 64 * 32))
            .itemOutputs(setStackSize(MultiMachineControllerList.Transcendent_Plasma_Mixer, 1))
            .eut(RECIPE_UIV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Uncertainty Resolution"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#76")
            .itemInputsUnsafe(
                setStackSize(MultiMachineCasingList.Advanced_Computer_Casing.copy(), 1),
                setStackSize(HatchList.Auto_Taping_Maintenance_Hatch.copy(), 1),
                setStackSize(GTItemList.Field_Generator_UIV.copy(), 1),
                setStackSize(GTPPList.Quantum_Anomaly.copy(), 4),

                getMaterialInput(OrePrefixes.circuit, Materials.UMV, 2),
                setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 64 * 2),
                setStackSize(GTItemList.Computer_Monitor_Cover.copy(), 1))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Iridium, 144 * 100),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18),
                requiredFluid(PlasmaList.Neptunium_Plasma, 1000 * 20),
                requiredFluid(PlasmaList.Fermium_Plasma, 1000 * 20))
            .itemOutputs(setStackSize(HatchList.Uncertainty_Resolution, 1))
            .eut(RECIPE_UIV)
            .duration(200 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Void Miner I"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#77")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Ore_Drilling_Plant_IV.copy(), 1),
                setStackSize(FrameBoxList.Netherite_Frame_Box.copy(), 4),
                setStackSize(PlateList.Europium_Plate.copy(), 3),
                setStackSize(GTItemList.Electric_Motor_LuV.copy(), 9),

                setStackSize(GTItemList.Sensor_LuV.copy(), 9),
                setStackSize(GTItemList.Field_Generator_LuV.copy(), 9),
                setStackSize(ScrewList.Europium_Screw.copy(), 36))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 10),
                requiredFluid(GasList.Neon, 1000 * 20))
            .itemOutputs(setStackSize(MultiMachineControllerList.Void_Miner_I, 1))
            .eut(RECIPE_LuV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Void Miner II"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#78")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Void_Miner_I.copy(), 1),
                setStackSize(FrameBoxList.Black_Plutonium_Frame_Box.copy(), 9),
                setStackSize(PlateList.Black_Plutonium_Plate.copy(), 3),
                setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 9),

                setStackSize(GTItemList.Sensor_ZPM.copy(), 9),
                setStackSize(GTItemList.Field_Generator_ZPM.copy(), 9),
                setStackSize(ScrewList.Black_Plutonium_Screw.copy(), 36))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 10),
                requiredFluid(GasList.Krypton, 1000 * 20))
            .itemOutputs(setStackSize(MultiMachineControllerList.Void_Miner_II, 1))
            .eut(RECIPE_ZPM)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Void Miner III"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#79")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Void_Miner_II.copy(), 1),
                setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 9),
                setStackSize(PlateList.Neutronium_Plate.copy(), 3),
                setStackSize(GTItemList.Electric_Motor_UV.copy(), 9),

                setStackSize(GTItemList.Sensor_UV.copy(), 9),
                setStackSize(GTItemList.Field_Generator_UV.copy(), 9),
                setStackSize(ScrewList.Neutronium_Screw.copy(), 36))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 10),
                requiredFluid(GasList.Oganesson, 1000 * 20))
            .itemOutputs(setStackSize(MultiMachineControllerList.Void_Miner_III, 1))
            .eut(RECIPE_UV)
            .duration(120 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Water Machine
        {
            // "Water Purification Plant"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#80")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Tungsten_Frame_Box.copy(), 4),
                    setStackSize(MultiMachineCasingList.Sterile_Water_Plant_Casing.copy(), 8),
                    setStackSize(MultiMachineCasingList.Reinforced_Sterile_Water_Plant_Casing.copy(), 8),
                    setStackSize(GTItemList.Electric_Motor_LuV.copy(), 2),

                    setStackSize(GTItemList.Robot_Arm_LuV.copy(), 1),
                    setStackSize(GTItemList.Electric_Pump_LuV.copy(), 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 2),

                    setStackSize(CableList.Niobium_Titanium_Cable_8x.copy(), 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 8),
                    requiredFluid(FluidList.Lubricant, 1000 * 16))
                .itemOutputs(setStackSize(MultiMachineControllerList.Water_Purification_Plant, 1))
                .eut(RECIPE_LuV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Clarifier Purification Unit"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#81")
                .itemInputsUnsafe(
                    setStackSize(GTItemList.Activated_Carbon_Filter_Mesh.copy(), 16),
                    setStackSize(MultiMachineCasingList.Reinforced_Sterile_Water_Plant_Casing.copy(), 8),
                    setStackSize(MultiMachineCasingList.Filter_Machine_Casing.copy(), 8),
                    setStackSize(HatchList.Energy_Hatch64_LuV.copy(), 1),

                    setStackSize(GTItemList.Electric_Motor_LuV.copy(), 4),
                    setStackSize(GTItemList.Electric_Pump_LuV.copy(), 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 2),

                    setStackSize(PipeList.Tungstensteel_Fluid_Pipe.copy(), 16))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Osmium, 144 * 8),
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 8),
                    requiredFluid(FluidList.Lubricant, 1000 * 16))
                .itemOutputs(setStackSize(MultiMachineControllerList.Clarifier_Purification_Unit, 1))
                .eut(RECIPE_LuV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Ozonation Purification Unit"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#82")
                .itemInputsUnsafe(
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
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 8),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),

                    setStackSize(PipeList.Tungstensteel_Fluid_Pipe.copy(), 32))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Hastelloy_C276, 144 * 8),
                    requiredFluid(MoltenList.Molten_Hastelloy_X, 144 * 8),
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 8),
                    requiredFluid(FluidList.Lubricant, 1000 * 16))
                .itemOutputs(setStackSize(MultiMachineControllerList.Clarifier_Purification_Unit, 1))
                .eut(RECIPE_LuV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Flocculation Purification Unit"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#83")
                .itemInputsUnsafe(
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
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 2),

                    setStackSize(PipeList.Large_Naquadah_Fluid_Pipe.copy(), 16))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Iridium, 144 * 16),
                    requiredFluid(MoltenList.Molten_Naquadah_Alloy, 144 * 16),
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 16),
                    requiredFluid(FluidList.Lubricant, 1000 * 32))
                .itemOutputs(setStackSize(MultiMachineControllerList.Flocculation_Purification_Unit, 1))
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "pH Neutralization Purification Unit"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#84")
                .itemInputsUnsafe(
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
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 8),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),

                    setStackSize(PipeList.Large_Naquadah_Fluid_Pipe.copy(), 32))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Naquadah_Alloy, 144 * 16),
                    requiredFluid(MoltenList.Molten_Hastelloy_C276, 144 * 16),
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 16),
                    requiredFluid(FluidList.Lubricant, 1000 * 32))
                .itemOutputs(setStackSize(MultiMachineControllerList.pH_Neutralization_Purification_Unit, 1))
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Extreme Temperature Fluctuation Purification Unit"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#85")
                .itemInputsUnsafe(
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
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 8),

                    setStackSize(PipeList.Large_Neutronium_Fluid_Pipe.copy(), 32))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Neutronium, 144 * 32),
                    requiredFluid(MoltenList.Molten_Naquadria, 144 * 32),
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 32),
                    requiredFluid(FluidList.Lubricant, 1000 * 64))
                .itemOutputs(
                    setStackSize(MultiMachineControllerList.Extreme_Temperature_Fluctuation_Purification_Unit, 1))
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "High Energy Laser Purification Unit"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#86")
                .itemInputsUnsafe(
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
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 8),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),

                    setStackSize(PipeList.Large_Neutronium_Fluid_Pipe.copy(), 64))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Neutronium, 144 * 32),
                    requiredFluid(MoltenList.Molten_Naquadria, 144 * 32),
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 32),
                    requiredFluid(FluidList.Lubricant, 1000 * 64))
                .itemOutputs(setStackSize(MultiMachineControllerList.High_Energy_Laser_Purification_Unit, 1))
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Residual Decontaminant Degasser Purification Unit"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#87")
                .itemInputsUnsafe(
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
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 8),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),

                    setStackSize(PipeList.Infinity_Fluid_Pipe.copy(), 32))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Quantium, 144 * 64),
                    requiredFluid(MoltenList.Molten_Infinity, 144 * 64),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64),
                    requiredFluid(FluidList.Lubricant, 1000 * 128))
                .itemOutputs(
                    setStackSize(MultiMachineControllerList.Residual_Decontaminant_Degasser_Purification_Unit, 1))
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Absolute Baryonic Perfection Purification Unit"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_MachineRecipe_Normal#88")
                .itemInputsUnsafe(
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
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 8),

                    setStackSize(PipeList.Infinity_Fluid_Pipe.copy(), 64))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Superconductor_Base_UHV, 144 * 64),
                    requiredFluid(MoltenList.Molten_Infinity, 144 * 64),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64),
                    requiredFluid(FluidList.Lubricant, 1000 * 128))
                .itemOutputs(setStackSize(MultiMachineControllerList.Absolute_Baryonic_Perfection_Purification_Unit, 1))
                .eut(RECIPE_UIV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }
    }
}
