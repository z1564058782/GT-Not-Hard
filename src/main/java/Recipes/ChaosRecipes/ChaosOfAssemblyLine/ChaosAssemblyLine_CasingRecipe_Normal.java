package Recipes.ChaosRecipes.ChaosOfAssemblyLine;

import static Recipes.ChaosRecipes.ChaosRecipeMap.AssemblyLineNormalRecipe;
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
import EnumList.EnumItemList.EnumMaterialList.CasingList;
import EnumList.EnumItemList.EnumMaterialList.DensePlateList;
import EnumList.EnumItemList.EnumMaterialList.DoublePlateList;
import EnumList.EnumItemList.EnumMaterialList.FineWireList;
import EnumList.EnumItemList.EnumMaterialList.FoilList;
import EnumList.EnumItemList.EnumMaterialList.FrameBoxList;
import EnumList.EnumItemList.EnumMaterialList.GearList;
import EnumList.EnumItemList.EnumMaterialList.LongRodList;
import EnumList.EnumItemList.EnumMaterialList.PlateList;
import EnumList.EnumItemList.EnumMaterialList.QuadruplePlateList;
import EnumList.EnumItemList.EnumMaterialList.RingList;
import EnumList.EnumItemList.EnumMaterialList.RodList;
import EnumList.EnumItemList.EnumMaterialList.RotorList;
import EnumList.EnumItemList.EnumMaterialList.ScrewList;
import EnumList.EnumItemList.EnumMaterialList.SmallGearList;
import EnumList.EnumItemList.EnumMaterialList.SuperdensePlateList;
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
import EnumList.EnumItemList.EnumModList.MinecraftList;
import EnumList.EnumItemList.EnumModList.NewHorizonsCoreModList;
import EnumList.EnumItemList.EnumModList.OpenComputersList;
import EnumList.EnumItemList.EnumModList.RailcraftList;
import EnumList.EnumItemList.EnumModList.SolarPanelsList;
import EnumList.EnumItemList.EnumModList.TecTechList;
import EnumList.EnumItemList.EnumOreProductList.DustList;
import EnumList.EnumItemList.EnumTinkerConstructList.TinkerConstructList;
import EnumList.EnumItemList.EnumTinkerConstructList.TinkersGregworksLargePlateList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GTUtility;
import util.ChaosAssemblyRecipeBuilder;

public class ChaosAssemblyLine_CasingRecipe_Normal {

    public static void addChaosAssemblyLine_CasingRecipe_Normal() {
        // Antenna Casing
        {
            // "Antenna Casing (T1)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#1")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Tungstensteel_Frame_Box.copy(), 1),
                    setStackSize(PlateList.Copper_Plate.copy(), 4),
                    setStackSize(PlateList.Mu_metal_Plate.copy(), 5),
                    setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 16),

                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),
                    setStackSize(GTItemList.Emitter_LuV.copy(), 6),
                    setStackSize(FineWireList.Fine_Gold_Wire.copy(), 32),
                    setStackSize(DensePlateList.Dense_Electrum_Plate.copy(), 6))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Soldering_Alloy, 144 * 48),
                    requiredFluid(MoltenList.Molten_Gold_GregTech, 144 * 32),
                    requiredFluid(GasList.Xenon, 1000 * 2))
                .itemOutputs(setStackSize(GTNHLanthanidesList.Antenna_Casing_T1, 1))
                .eut(RECIPE_LuV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Antenna Casing (T2)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#2")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Tungstencarbide_Frame_Box.copy(), 1),
                    setStackSize(PlateList.Copper_Plate.copy(), 4),
                    setStackSize(PlateList.Mu_metal_Plate.copy(), 5),
                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 16),

                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),
                    setStackSize(GTItemList.Emitter_ZPM.copy(), 6),
                    setStackSize(FineWireList.Fine_Gold_Wire.copy(), 64),
                    setStackSize(DensePlateList.Dense_Electrum_Plate.copy(), 6))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Soldering_Alloy, 144 * 96),
                    requiredFluid(MoltenList.Molten_Gold_GregTech, 144 * 48),
                    requiredFluid(GasList.Xenon, 1000 * 2))
                .itemOutputs(setStackSize(GTNHLanthanidesList.Antenna_Casing_T2, 1))
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Antimatter Annihilation Matrix"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#3")
            .itemInputsUnsafe(
                setStackSize(GoodGeneratorList.Protomatter_Activation_Coil.copy(), 1),
                setStackSize(FoilList.Hypogen_Foil.copy(), 64),
                setStackSize(GTItemList.Emitter_UIV.copy(), 2),
                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 1),

                setStackSize(FrameBoxList.Proto_Halkonite_Steel_Frame_Box.copy(), 4),
                setStackSize(WireList.Superconductor_UIV_Wire_16x.copy(), 8),
                setStackSize(GTItemList.Sensor_UIV.copy(), 2),
                setStackSize(RotorList.Proto_Halkonite_Steel_Rotor.copy(), 4))
            .fluidInputs(
                requiredFluid(FluidList.Semi_Stable_Antimatter, 4),
                requiredFluid(MoltenList.Molten_Hypogen, 144 * 10),
                requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000))
            .itemOutputs(setStackSize(GoodGeneratorList.Antimatter_Annihilation_Matrix.copy(), 4))
            .eut(RECIPE_UIV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Bose-Einstein Condensate
        {
            // "Coherence-Preserving Plasma Conduit"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#4")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineCasingList.Peace_Enforcement_Casing.copy(), 6),
                    setStackSize(MultiMachineCasingList.Particle_Beam_Guidance_Pipe_Casing.copy(), 1),
                    setStackSize(PipeList.Huge_Transcendent_Metal_Fluid_Pipe.copy(), 6),
                    setStackSize(GTItemList.Tengam_Electromagnet.copy(), 6),

                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 24),
                    setStackSize(RodList.Proto_Halkonite_Steel_Rod.copy(), 6),
                    setStackSize(FoilList.Tairitsu_Foil.copy(), 24),
                    setStackSize(RingList.Churitsu_Ring.copy(), 12),

                    setStackSize(ScrewList.Shijima_Screw.copy(), 48),
                    setStackSize(RotorList.Six_Phased_Copper_Rotor.copy(), 1),
                    setStackSize(LongRodList.Long_Churitsu_Rod.copy(), 3),
                    setStackSize(RotorList.Hypogen_Rotor.copy(), 1),

                    setStackSize(LongRodList.Long_Transcendent_Metal_Rod.copy(), 6),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 2))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Chromatic_Glass, 144 * 64 * 6),
                    requiredFluid(MoltenList.Molten_Infinity, 144 * 48),
                    requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 48),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 16))
                .itemOutputs(setStackSize(MultiMachineCasingList.Coherence_Preserving_Plasma_Conduit.copy(), 4))
                .eut(RECIPE_UIV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Electromagnetically-Isolated Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#5")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineCasingList.Quark_Exclusion_Casing.copy(), 6),
                    setStackSize(FrameBoxList.Tairitsu.copy(), 6),
                    setStackSize(FrameBoxList.Churitsu_Frame_Box.copy(), 6),
                    setStackSize(FrameBoxList.Shijima_Frame_Box.copy(), 6),

                    setStackSize(NewHorizonsCoreModList.Irradiant_Reinforced_Bedrockium_Plate.copy(), 8),
                    setStackSize(FoilList.Proto_Halkonite_Steel_Foil.copy(), 32),
                    setStackSize(PlateList.Tairitsu_Plate.copy(), 8),
                    setStackSize(ScrewList.Churitsu_Screw.copy(), 64),

                    setStackSize(BoltList.Shijima_Bolt.copy(), 64),
                    setStackSize(BoltList.Six_Phased_Copper_Bolt.copy(), 64),
                    setStackSize(RingList.Tairitsu_Ring.copy(), 12),
                    setStackSize(ScrewList.Hypogen_Screw.copy(), 24),

                    setStackSize(GTItemList.Energised_Tesseract.copy(), 2),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Chromatic_Glass, 144 * 64 * 6),
                    requiredFluid(MoltenList.Molten_Infinity, 144 * 48),
                    requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 48),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 32))
                .itemOutputs(setStackSize(MultiMachineCasingList.Electromagnetically_Isolated_Casing.copy(), 4))
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fine-Structure Constant Manipulator"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#6")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineCasingList.Conflict_Inducement_Casing.copy(), 6),
                    setStackSize(MultiMachineCasingList.Electromagnetically_Isolated_Casing.copy(), 2),
                    setStackSize(SmallGearList.Small_Six_Phased_Copper_Gear.copy(), 3),
                    setStackSize(GearList.Shijima_Gear.copy(), 2),

                    setStackSize(SmallGearList.Small_Hypogen_Gear.copy(), 3),
                    setStackSize(GTItemList.Insanely_Ultimate_Voltage_Coil.copy(), 6),
                    setStackSize(LongRodList.Long_Proto_Halkonite_Steel_Rod.copy(), 6),
                    setStackSize(FineWireList.Fine_Tairitsu_Wire.copy(), 48),

                    setStackSize(FoilList.Churitsu_Foil.copy(), 24),
                    setStackSize(ScrewList.Shijima_Screw.copy(), 48),
                    setStackSize(RailcraftList.Neutronium_Tank_Valve.copy(), 6),
                    setStackSize(RingList.Proto_Halkonite_Steel_Ring.copy(), 12),

                    setStackSize(SmallGearList.Small_Churitsu_Gear.copy(), 6),
                    setStackSize(BoltList.Shijima_Bolt.copy(), 48),
                    setStackSize(GTItemList.Sensor_UIV.copy(), 2),
                    setStackSize(GTItemList.Emitter_UIV.copy(), 2))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Chromatic_Glass, 144 * 64 * 6),
                    requiredFluid(MoltenList.Molten_Infinity, 144 * 48),
                    requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 48),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 16))
                .itemOutputs(setStackSize(MultiMachineCasingList.Fine_Structure_Constant_Manipulator.copy(), 4))
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Electromagnetic Waveguide"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#7")
                .itemInputsUnsafe(
                    setStackSize(GoodGeneratorList.Antimatter_Containment_Casing.copy(), 6),
                    setStackSize(LongRodList.Long_Proto_Halkonite_Steel_Rod.copy(), 6),
                    setStackSize(FineWireList.Fine_Tairitsu_Wire.copy(), 24),
                    setStackSize(FoilList.Churitsu_Foil.copy(), 12),

                    setStackSize(ScrewList.Shijima_Screw.copy(), 24),
                    setStackSize(CasingList.Churitsu_Casing.copy(), 6),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 2))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Chromatic_Glass, 144 * 64 * 12),
                    requiredFluid(MoltenList.Molten_Infinity, 144 * 64 * 3),
                    requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 64 * 3),
                    requiredFluid(MoltenList.Molten_SpaceTime, 144 * 24))
                .itemOutputs(setStackSize(GTBlockList.Electromagnetic_Waveguide.copy(), 4))
                .eut(RECIPE_UIV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Condensate Transformative Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#8")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineCasingList.Condensate_Guidance_Coil.copy(), 1),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 12),
                    setStackSize(CircuitList.Atto_Power_IC_Chip.copy(), 6),
                    setStackSize(GTItemList.Sensor_UHV.copy(), 12),

                    setStackSize(PlateList.Tairitsu_Plate.copy(), 12),
                    setStackSize(CasingList.Churitsu_Casing.copy(), 6),
                    setStackSize(ScrewList.Shijima_Screw.copy(), 64),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 3),

                    setStackSize(LongRodList.Long_Tairitsu_Rod.copy(), 6),
                    setStackSize(RingList.Churitsu_Ring.copy(), 3),
                    setStackSize(DoublePlateList.Double_Shijima_Plate.copy(), 6))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Chromatic_Glass, 144 * 96),
                    requiredFluid(MoltenList.Molten_Infinity, 144 * 12),
                    requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 12),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 4))
                .itemOutputs(setStackSize(MultiMachineCasingList.Condensate_Transformative_Coil, 1))
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Condensate Guidance Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#9")
                .itemInputsUnsafe(
                    setStackSize(GoodGeneratorList.Advanced_Field_Restriction_Coil.copy(), 2),
                    setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 6),
                    setStackSize(GTItemList.Insanely_Ultimate_Voltage_Coil.copy(), 3),
                    setStackSize(LongRodList.Long_Proto_Halkonite_Steel_Rod.copy(), 3),

                    setStackSize(FineWireList.Fine_Tairitsu_Wire.copy(), 24),
                    setStackSize(FoilList.Churitsu_Foil.copy(), 12),
                    setStackSize(ScrewList.Shijima_Screw.copy(), 24),
                    setStackSize(FrameBoxList.Churitsu_Frame_Box.copy(), 2),

                    setStackSize(ScrewList.Tairitsu_Screw.copy(), 32),
                    setStackSize(BoltList.Shijima_Bolt.copy(), 32))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Chromatic_Glass, 144 * 96),
                    requiredFluid(MoltenList.Molten_Infinity, 144 * 12),
                    requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 12),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 4))
                .itemOutputs(setStackSize(MultiMachineCasingList.Condensate_Guidance_Coil, 1))
                .eut(RECIPE_UIV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Coil Block
        {
            // "Infinity Coil Block"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#10")
                .itemInputsUnsafe(
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 1),
                    setStackSize(WireList.Infinity_Wire_2x.copy(), 8),
                    setStackSize(ScrewList.Infinity_Screw.copy(), 8),
                    setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 24))
                .fluidInputs(requiredFluid(MoltenList.Molten_Awakened_Draconium, 144 * 4))
                .itemOutputs(setStackSize(MultiMachineCasingList.Infinity_Coil_Block, 1))
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Hypogen Coil Block"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#11")
                .itemInputsUnsafe(
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 1),
                    setStackSize(WireList.Hypogen_Wire_2x.copy(), 8),
                    setStackSize(ScrewList.Hypogen_Screw.copy(), 8),
                    setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 32))
                .fluidInputs(requiredFluid(MoltenList.Molten_Infinity, 144 * 4))
                .itemOutputs(setStackSize(MultiMachineCasingList.Hypogen_Coil_Block, 1))
                .eut(RECIPE_UIV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Eternal Coil Block"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#12")
                .itemInputsUnsafe(
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 1),
                    setStackSize(WireList.SpaceTime_Wire_4x.copy(), 8),
                    setStackSize(ScrewList.SpaceTime_Screw.copy(), 8),
                    setStackSize(SingularityList.Eternal_Singularity.copy(), 1),
                    setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 64))
                .fluidInputs(requiredFluid(MoltenList.Molten_Hypogen, 144 * 4))
                .itemOutputs(setStackSize(MultiMachineCasingList.Eternal_Coil_Block, 1))
                .eut(RECIPE_UMV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Component Assembly Line Casing
        {
            // "Component Assembly Line Casing (LuV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#13")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Europium_Frame_Box.copy(), 1),
                    setStackSize(DensePlateList.Dense_Rhodium_Plated_Palladium_Plate.copy(), 6),
                    setStackSize(GTItemList.Robot_Arm_LuV.copy(), 8),
                    setStackSize(GTItemList.Electric_Piston_LuV.copy(), 10),

                    setStackSize(GTItemList.Electric_Motor_LuV.copy(), 16),
                    setStackSize(GearList.Rhodium_Plated_Palladium_Gear.copy(), 4),
                    setStackSize(SmallGearList.Small_Rhodium_Plated_Palladium_Gear.copy(), 16),
                    setStackSize(CableList.Vanadium_Gallium_Cable_4x.copy(), 8),

                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 8),
                    getMaterialInput(OrePrefixes.circuit, Materials.IV, 16))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 24),
                    requiredFluid(MoltenList.Molten_Zeron_100, 144 * 12),
                    requiredFluid(MoltenList.Molten_Artherium_Sn, 144 * 6),
                    requiredFluid(FluidList.Lubricant, 1000 * 4))
                .itemOutputs(setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_LuV, 1))
                .eut(RECIPE_IV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Component Assembly Line Casing (ZPM)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#14")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Iridium_Frame_Box.copy(), 1),
                    setStackSize(SuperdensePlateList.Superdense_Iridium_Plate.copy(), 1),
                    setStackSize(GTItemList.Robot_Arm_ZPM.copy(), 8),
                    setStackSize(GTItemList.Electric_Piston_ZPM.copy(), 10),

                    setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 16),
                    setStackSize(GearList.Iridium_Gear.copy(), 4),
                    setStackSize(SmallGearList.Small_Iridium_Gear.copy(), 16),
                    setStackSize(CableList.Naquadah_Cable_4x.copy(), 8),

                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 8),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 16))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 28),
                    requiredFluid(MoltenList.Molten_Pikyonium_64B, 144 * 14),
                    requiredFluid(MoltenList.Molten_Dalisenite, 144 * 7),
                    requiredFluid(FluidList.Lubricant, 1000 * 5))
                .itemOutputs(setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_ZPM, 1))
                .eut(RECIPE_LuV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Component Assembly Line Casing (UV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#15")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Osmium_Frame_Box.copy(), 1),
                    setStackSize(SuperdensePlateList.Superdense_Osmium_Plate.copy(), 1),
                    setStackSize(GTItemList.Robot_Arm_UV.copy(), 8),
                    setStackSize(GTItemList.Electric_Piston_UV.copy(), 10),

                    setStackSize(GTItemList.Electric_Motor_UV.copy(), 16),
                    setStackSize(GearList.Osmium_Gear.copy(), 4),
                    setStackSize(SmallGearList.Small_Osmium_Gear.copy(), 16),
                    setStackSize(CableList.Naquadah_Alloy_Cable_4x.copy(), 8),

                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 8),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 16))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 32),
                    requiredFluid(MoltenList.Molten_Advanced_Nitinol, 144 * 16),
                    requiredFluid(MoltenList.Molten_Tairitsu, 144 * 8),
                    requiredFluid(FluidList.Lubricant, 1000 * 6))
                .itemOutputs(setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_UV, 1))
                .eut(RECIPE_ZPM)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Component Assembly Line Casing (UHV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#16")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box.copy(), 1),
                    setStackSize(SuperdensePlateList.Superdense_Cosmic_Neutronium_Plate.copy(), 1),
                    setStackSize(GTItemList.Robot_Arm_UHV.copy(), 8),
                    setStackSize(GTItemList.Electric_Piston_UHV.copy(), 10),

                    setStackSize(GTItemList.Electric_Motor_UHV.copy(), 16),
                    setStackSize(GearList.Cosmic_Neutronium_Gear.copy(), 4),
                    setStackSize(SmallGearList.Small_Cosmic_Neutronium_Gear.copy(), 16),
                    setStackSize(CableList.Bedrockium_Cable_4x.copy(), 8),

                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 8),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 16))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 36),
                    requiredFluid(MoltenList.Molten_Abyssal_Alloy, 144 * 18),
                    requiredFluid(MoltenList.Molten_Precious_Metals_Alloy, 144 * 9),
                    requiredFluid(FluidList.Lubricant, 1000 * 7))
                .itemOutputs(setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_UHV, 1))
                .eut(RECIPE_UV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Component Assembly Line Casing (UEV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#17")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 1),
                    setStackSize(SuperdensePlateList.Superdense_Infinity_Plate.copy(), 1),
                    setStackSize(GTItemList.Robot_Arm_UEV.copy(), 8),
                    setStackSize(GTItemList.Electric_Piston_UEV.copy(), 10),

                    setStackSize(GTItemList.Electric_Motor_UEV.copy(), 16),
                    setStackSize(GearList.Infinity_Gear.copy(), 4),
                    setStackSize(SmallGearList.Small_Infinity_Gear.copy(), 16),
                    setStackSize(CableList.Draconium_Cable_4x.copy(), 8),

                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 8),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 16))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 40),
                    requiredFluid(MoltenList.Molten_Quantum, 144 * 20),
                    requiredFluid(MoltenList.Molten_Enriched_Naquadah_Alloy, 144 * 10),
                    requiredFluid(FluidList.Lubricant, 1000 * 8))
                .itemOutputs(setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_UEV, 1))
                .eut(RECIPE_UHV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Component Assembly Line Casing (UIV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#18")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Proto_Halkonite_Steel_Frame_Box.copy(), 1),
                    setStackSize(SuperdensePlateList.Superdense_Transcendent_Metal_Plate.copy(), 1),
                    setStackSize(GTItemList.Robot_Arm_UIV.copy(), 8),
                    setStackSize(GTItemList.Electric_Piston_UIV.copy(), 10),

                    setStackSize(GTItemList.Electric_Motor_UIV.copy(), 16),
                    setStackSize(GearList.Transcendent_Metal_Gear.copy(), 4),
                    setStackSize(SmallGearList.Small_Proto_Halkonite_Steel_Gear.copy(), 16),
                    setStackSize(CableList.Nether_Star_Cable_4x.copy(), 8),

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 8),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 16))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 44),
                    requiredFluid(MoltenList.Molten_Hypogen, 144 * 22),
                    requiredFluid(MoltenList.Molten_Metastable_Oganesson, 144 * 12),
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 9))
                .itemOutputs(setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_UIV, 1))
                .eut(RECIPE_UEV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Component Assembly Line Casing (UMV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#19")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.SpaceTime_Frame_Box.copy(), 1),
                    setStackSize(SuperdensePlateList.Superdense_SpaceTime_Plate.copy(), 1),
                    setStackSize(GTItemList.Robot_Arm_UMV.copy(), 8),
                    setStackSize(GTItemList.Electric_Piston_UMV.copy(), 10),

                    setStackSize(GTItemList.Electric_Motor_UMV.copy(), 16),
                    setStackSize(GearList.SpaceTime_Gear.copy(), 4),
                    setStackSize(SmallGearList.Small_SpaceTime_Gear.copy(), 16),
                    setStackSize(CableList.Quantium_Cable_4x.copy(), 8),

                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 8),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 16))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 48),
                    requiredFluid(MoltenList.Molten_Hypogen, 144 * 24),
                    requiredFluid(MoltenList.Molten_Metastable_Oganesson, 144 * 14),
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 10))
                .itemOutputs(setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_UMV, 1))
                .eut(RECIPE_UIV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Component Assembly Line Casing (UXV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#20")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Magnetohydrodynamically_Constrained_Star_Matter_Frame_Box.copy(), 1),
                    setStackSize(DensePlateList.Dense_Magnetohydrodynamically_Constrained_Star_Matter_Plate.copy(), 3),
                    setStackSize(DensePlateList.Dense_Magmatter_Plate.copy(), 3),
                    setStackSize(GTItemList.Robot_Arm_UXV.copy(), 8),

                    setStackSize(GTItemList.Electric_Piston_UXV.copy(), 10),
                    setStackSize(GTItemList.Electric_Motor_UXV.copy(), 16),
                    setStackSize(GearList.Magnetohydrodynamically_Constrained_Star_Matter_Gear.copy(), 2),
                    setStackSize(GearList.Magmatter_Gear.copy(), 2),
                    setStackSize(SmallGearList.Small_Magnetohydrodynamically_Constrained_Star_Matter_Gear.copy(), 8),
                    setStackSize(SmallGearList.Small_Magmatter_Gear.copy(), 8),

                    setStackSize(WireList.SpaceTime_Wire_4x.copy(), 8),
                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 8),
                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 16))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 52),
                    requiredFluid(MoltenList.Molten_Black_Dwarf_Matter, 144 * 26),
                    requiredFluid(MoltenList.Molten_Eternity, 144 * 15),
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 11))
                .itemOutputs(setStackSize(GoodGeneratorList.Component_Assembly_Line_Casing_UXV, 1))
                .eut(RECIPE_UMV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Containment Casing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#21")
            .itemInputsUnsafe(
                setStackSize(GTItemList.Field_Generator_IV.copy(), 32),
                setStackSize(GTItemList.Electric_Motor_EV.copy(), 64),
                setStackSize(BatteryList.Lapotronic_Energy_Orb_Empty.copy(), 32),
                setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_12x.copy(), 32),

                setStackSize(WireList.Platinum_Wire_16x.copy(), 64),
                setStackSize(PlateList.Naquadria_Plate.copy(), 64),
                setStackSize(DustList.Gadolinium_Dust.copy(), 32),
                setStackSize(DustList.Samarium_Dust.copy(), 16),

                setStackSize(GearList.Arcanite_Gear.copy(), 8),
                getMaterialInput(OrePrefixes.circuit, Materials.IV, 64),
                getMaterialInput(OrePrefixes.circuit, Materials.LuV, 32),
                getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 16),

                setStackSize(GTPPList.Quantum_Anomaly.copy(), 1),
                setStackSize(GTPPList.Coil_Wire_ZPM.copy(), 64))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Nitinol_60, 144 * 36),
                requiredFluid(MoltenList.Molten_Energy_Crystal, 144 * 72),
                requiredFluid(MoltenList.Molten_Tumbaga, 144 * 288),
                requiredFluid(MoltenList.Molten_Nichrome, 144 * 16))
            .itemOutputs(setStackSize(MultiMachineCasingList.Containment_Casing.copy(), 32))
            .eut(RECIPE_LuV)
            .duration(1200 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Coolant Delivery Casing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#22")
            .itemInputsUnsafe(
                setStackSize(FrameBoxList.Aluminium_Frame_Box.copy(), 1),
                setStackSize(PlateList.Copper_Plate.copy(), 6),
                setStackSize(PipeList.Large_Naquadah_Fluid_Pipe.copy(), 2),
                setStackSize(GTItemList.Electric_Pump_LuV.copy(), 3),

                setStackSize(GTNHLanthanidesList.Capillary_Exchange.copy(), 3),
                setStackSize(NewHorizonsCoreModList.Mica_Insulator_Sheet.copy(), 6),
                setStackSize(WireList.Tungsten_Wire_1x.copy(), 1))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Soldering_Alloy, 144 * 2),
                requiredFluid(FluidList.Lubricant, 1152))
            .itemOutputs(setStackSize(GTNHLanthanidesList.Coolant_Delivery_Casing, 1))
            .eut(RECIPE_LuV)
            .duration(50 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Dimensional Bridge"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#23")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),

                setStackSize(MultiMachineCasingList.Dimensionally_Transcendent_Casing.copy(), 1),
                setStackSize(MachineList.Microwave_Energy_Transmitter_UV.copy(), 1),
                getMaterialInput(OrePrefixes.circuit, Materials.UV, 2),
                setStackSize(SingularityList.Iron_Singularity.copy(), 2),

                setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 6),
                setStackSize(CircuitList.FPIC_Wafer.copy(), 4),
                setStackSize(GTItemList.Field_Generator_UHV.copy(), 1))
            .fluidInputs(
                requiredFluid(GasList.Oganesson, 1000 * 8),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64),
                requiredFluid(MoltenList.Molten_Enriched_Naquadah, 144 * 9))
            .itemOutputs(setStackSize(MultiMachineCasingList.Dimensional_Bridge, 1))
            .eut(RECIPE_UIV)
            .duration(240 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Dimensional Injection Casing
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#24")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(1),

                setStackSize(PlateList.Osmiridium_Plate.copy(), 4),
                setStackSize(DensePlateList.Dense_Ledox_Plate.copy(), 1),
                setStackSize(DensePlateList.Dense_Callisto_Ice_Plate.copy(), 1),
                setStackSize(ScrewList.Laurenium_Screw.copy(), 12),

                getMaterialInput(OrePrefixes.circuit, Materials.IV, 2),
                setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 2),
                setStackSize(GTBlockList.Super_Chest_V.copy(), 1),
                setStackSize(GTBlockList.Super_Tank_V.copy(), 1),

                setStackSize(CircuitList.FPIC_Wafer.copy(), 2))
            .fluidInputs(
                requiredFluid(GasList.Oganesson, 1000),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 4),
                requiredFluid(MoltenList.Molten_Enriched_Naquadah, 144 * 2))
            .itemOutputs(setStackSize(MultiMachineCasingList.Dimensional_Injection_Casing, 1))
            .eut(RECIPE_UIV)
            .duration(20 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Dimensionally Transcendent Casing
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#25")
            .itemInputsUnsafe(
                GTUtility.getIntegratedCircuit(2),

                setStackSize(PlateList.Osmiridium_Plate.copy(), 4),
                setStackSize(ScrewList.Laurenium_Screw.copy(), 12),
                setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 1))
            .fluidInputs(
                requiredFluid(GasList.Oganesson, 500),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 2),
                requiredFluid(MoltenList.Molten_Enriched_Naquadah, 144))
            .itemOutputs(setStackSize(MultiMachineCasingList.Dimensionally_Transcendent_Casing, 1))
            .eut(RECIPE_UIV)
            .duration(20 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Dyson Swarm Ground Unit
        {
            // "Dyson Swarm Control Center Base Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#26")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 4),
                    setStackSize(OpenComputersList.Accelerated_Processing_Unit_APU_Tier3.copy(), 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 4),
                    setStackSize(MultiMachineControllerList.Quantum_Computer.copy(), 4))
                .fluidInputs(
                    requiredFluid(FluidList.Super_Coolant, 1000 * 32),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 80),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Dyson_Swarm_Control_Center_Base_Casing.copy(), 8))
                .eut(RECIPE_UEV)
                .duration(80 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Dyson Swarm Control Center Primary Windings"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#27")
                .itemInputsUnsafe(
                    setStackSize(CircuitList.Femto_Power_IC_Chip.copy(), 2),
                    setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 24),
                    setStackSize(TecTechList.Molecular_Coil.copy(), 4))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Radox_Polymer, 144 * 24),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 16),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 80),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Dyson_Swarm_Control_Center_Primary_Windings.copy(), 4))
                .eut(RECIPE_UEV)
                .duration(40 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Dyson Swarm Control Center Secondary Windings"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#28")
                .itemInputsUnsafe(
                    setStackSize(CircuitList.Femto_Power_IC_Chip.copy(), 2),
                    setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 24),
                    setStackSize(MultiMachineCasingList.Awakened_Draconium_Coil_Block.copy(), 4))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Radox_Polymer, 144 * 24),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 16),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 80),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8))
                .itemOutputs(
                    setStackSize(GTNHIntergalacticList.Dyson_Swarm_Control_Center_Secondary_Windings.copy(), 4))
                .eut(RECIPE_UEV)
                .duration(40 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Dyson Swarm Control Center Toroid Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#29")
                .itemInputsUnsafe(
                    setStackSize(ScrewList.Cosmic_Neutronium_Screw.copy(), 4),
                    setStackSize(FoilList.Neutronium_Foil.copy(), 8),
                    setStackSize(FrameBoxList.Superconductor_Base_UEV_Frame_Box.copy(), 4))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Radox_Polymer, 144),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 16),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 80),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Dyson_Swarm_Control_Center_Toroid_Casing, 1))
                .eut(RECIPE_UEV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Dyson Swarm Energy Receiver Base Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#30")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Energy_Distributor_UHV.copy(), 4),
                    setStackSize(CircuitList.Femto_Power_IC_Chip.copy(), 32),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64),
                    setStackSize(GTItemList.Extremely_Ultimate_Voltage_Coil.copy(), 64))
                .fluidInputs(
                    requiredFluid(FluidList.Liquid_Helium, 1000 * 50),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 16),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 80),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Dyson_Swarm_Energy_Receiver_Base_Casing.copy(), 4))
                .eut(RECIPE_UEV)
                .duration(40 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Dyson Swarm Energy Receiver Dish Block"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#31")
                .itemInputsUnsafe(
                    setStackSize(GTNHIntergalacticList.Ultra_High_Temperature_Resistant_Mesh.copy(), 64),
                    setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 64),
                    setStackSize(PipeList.Infinity_Fluid_Pipe.copy(), 8),
                    setStackSize(GoodGeneratorList.Advanced_Field_Restriction_Coil.copy(), 2))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Rhugnor, 40),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 16),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 80),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Dyson_Swarm_Energy_Receiver_Dish_Block.copy(), 3))
                .eut(RECIPE_UEV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Dyson Swarm Module Deployment Unit Base Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#32")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 4),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 32),
                    setStackSize(GTBlockList.Quantum_Tank_V.copy(), 2),

                    setStackSize(GTItemList.Conveyor_Module_UIV.copy(), 32),
                    setStackSize(GTBlockList.Quantum_Chest_V.copy(), 2))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 50),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 32),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 80),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8))
                .itemOutputs(
                    setStackSize(GTNHIntergalacticList.Dyson_Swarm_Module_Deployment_Unit_Base_Casing.copy(), 4))
                .eut(RECIPE_UEV)
                .duration(40 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Dyson Swarm Module Deployment Unit Core"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#33")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 4),
                    setStackSize(GTItemList.Conveyor_Module_UIV.copy(), 32),
                    setStackSize(GTItemList.Robot_Arm_UIV.copy(), 32),
                    setStackSize(GTItemList.Electric_Piston_UIV.copy(), 32),

                    setStackSize(MinecraftList.Dropper.copy(), 64 * 4))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 50),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 32),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 80),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Dyson_Swarm_Module_Deployment_Unit_Core, 1))
                .eut(RECIPE_UEV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Dyson Swarm Module Deployment Unit Superconducting Magnet"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#34")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 4),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 4),
                    setStackSize(CircuitList.Femto_Power_IC_Chip.copy(), 32),
                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Rhugnor, 40),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 16),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 80),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8))
                .itemOutputs(
                    setStackSize(
                        GTNHIntergalacticList.Dyson_Swarm_Module_Deployment_Unit_Superconducting_Magnet.copy(),
                        4))
                .eut(RECIPE_UEV)
                .duration(40 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Elemental Confinement Shell"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#35")
            .itemInputsUnsafe(
                setStackSize(GTBlockList.Machine_Hull_LuV.copy(), 5),
                setStackSize(GTItemList.Field_Generator_HV.copy(), 16),
                setStackSize(GTPPList.Energy_Core_MV.copy(), 2),
                setStackSize(PlateList.Pikyonium_64B_Plate.copy(), 4),

                setStackSize(ScrewList.Pikyonium_64B_Screw.copy(), 4),
                setStackSize(BoltList.Trinium_Naquadah_Carbonite_Bolt.copy(), 8),
                setStackSize(RodList.Inconel_625_Rod.copy(), 4),
                getMaterialInput(OrePrefixes.circuit, Materials.IV, 4),

                setStackSize(GTItemList.Data_Stick.copy(), 4))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Inconel_625, 144 * 16),
                requiredFluid(MoltenList.Molten_Inconel_792, 144 * 8),
                requiredFluid(MoltenList.Molten_Hastelloy_N, 144 * 8),
                requiredFluid(MoltenList.Molten_Babbit_Alloy, 144 * 16))
            .itemOutputs(setStackSize(MultiMachineCasingList.Elemental_Confinement_Shell, 1))
            .eut(RECIPE_ZPM)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Energy Infuser"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#36")
            .itemInputsUnsafe(
                setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 1),
                setStackSize(TecTechList.Molecular_Coil.copy(), 8),
                setStackSize(TecTechList.High_Power_Casing.copy(), 8),
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
        {
            // "Reinforced Spatial Structure Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#37")
                .itemInputsUnsafe(
                    setStackSize(TecTechList.Singularity_Reinforced_Stellar_Shielding_Casing.copy(), 32),
                    setStackSize(AvaritiaList.Cosmic_Neutronium_Block.copy(), 64),
                    setStackSize(BlockList.Block_of_Neutronium.copy(), 64),
                    setStackSize(GTItemList.Neutronium_Nanites.copy(), 48),

                    setStackSize(TinkerConstructList.Bedrockium_Large_Plate.copy(), 1),
                    setStackSize(TinkerConstructList.Neutronium_Large_Plate.copy(), 1),
                    setStackSize(TinkersGregworksLargePlateList.Shirabon_Large_Plate.copy(), 1),
                    setStackSize(TinkerConstructList.Infinity_Large_Plate.copy(), 1),

                    setStackSize(GTBlockList.Block_Solar_Panel_UV.copy(), 1),
                    setStackSize(GTBlockList.Quantum_Chest_V.copy(), 1),
                    setStackSize(GTItemList.Gravitation_Engine.copy(), 64),
                    setStackSize(GTItemList.Energised_Tesseract.copy(), 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Neutronium, 144 * 64 * 16),
                    requiredFluid(MoltenList.Molten_Cosmic_Neutronium, 144 * 64 * 16),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 8),
                    requiredFluid(FluidList.Spatially_Enlarged_Fluid, 144 * 10))
                .itemOutputs(setStackSize(TecTechList.Reinforced_Spatial_Structure_Casing.copy(), 4))
                .eut(RECIPE_UMV)
                .duration(500 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Reinforced Temporal Structure Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#38")
                .itemInputsUnsafe(
                    setStackSize(TecTechList.Singularity_Reinforced_Stellar_Shielding_Casing.copy(), 32),
                    setStackSize(AvaritiaList.Cosmic_Neutronium_Block.copy(), 64),
                    setStackSize(BlockList.Block_of_Neutronium.copy(), 64),
                    setStackSize(GTItemList.Neutronium_Nanites.copy(), 48),

                    setStackSize(TinkerConstructList.Bedrockium_Large_Plate.copy(), 1),
                    setStackSize(TinkerConstructList.Neutronium_Large_Plate.copy(), 1),
                    setStackSize(TinkersGregworksLargePlateList.Shirabon_Large_Plate.copy(), 1),
                    setStackSize(TinkerConstructList.Infinity_Large_Plate.copy(), 1),

                    setStackSize(GTBlockList.Block_Solar_Panel_UV.copy(), 1),
                    setStackSize(MachineList.World_Accelerator_UV.copy(), 4),
                    setStackSize(GTItemList.Gravitation_Engine.copy(), 64),
                    setStackSize(GTItemList.Energised_Tesseract.copy(), 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Neutronium, 144 * 64 * 16),
                    requiredFluid(MoltenList.Molten_Cosmic_Neutronium, 144 * 64 * 16),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 8),
                    requiredFluid(FluidList.Tachyon_Rich_Temporal_Fluid, 144 * 10))
                .itemOutputs(setStackSize(TecTechList.Reinforced_Temporal_Structure_Casing.copy(), 4))
                .eut(RECIPE_UMV)
                .duration(500 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Infinite Spacetime Energy Boundary Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#39")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineControllerList.Lapotronic_Supercapacitor.copy(), 1),
                    setStackSize(GTBlockList.Block_Solar_Panel_UV.copy(), 1),
                    setStackSize(KekzTechList.Ultimate_Capacitor_UHV.copy(), 1),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 64),

                    setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 16),
                    setStackSize(HatchList.Wireless_Energy_Hatch_UMV.copy(), 4),
                    setStackSize(HatchList.Laser_Target_Hatch65536_UMV.copy(), 1),
                    setStackSize(NewHorizonsCoreModList.High_Energy_Flow_Circuit.copy(), 64),

                    setStackSize(PlateList.Metastable_Oganesson_Plate.copy(), 6),
                    setStackSize(PlateList.Blue_Topaz_Plate.copy(), 6),
                    setStackSize(PlateList.Callisto_Ice_Plate.copy(), 6),
                    setStackSize(PlateList.Ledox_Plate.copy(), 6),

                    setStackSize(ScrewList.Metastable_Oganesson_Screw.copy(), 6),
                    setStackSize(ScrewList.Blue_Topaz_Screw.copy(), 6),
                    setStackSize(ScrewList.Callisto_Ice_Screw.copy(), 6),
                    setStackSize(ScrewList.Ledox_Screw.copy(), 6))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Neutronium, 144 * 64 * 64),
                    requiredFluid(MoltenList.Molten_Cosmic_Neutronium, 144 * 64 * 64),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 32),
                    requiredFluid(MoltenList.Molten_SpaceTime, 1000 * 64 * 2))
                .itemOutputs(setStackSize(TecTechList.Infinite_Spacetime_Energy_Boundary_Casing, 1))
                .eut(RECIPE_UMV)
                .duration(500 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            final ItemStack[] boltList = new ItemStack[] { setStackSize(BoltList.Shirabon_Bolt.copy(), 2),
                setStackSize(BoltList.White_Dwarf_Matter_Bolt.copy(), 2).copy(),
                setStackSize(BoltList.White_Dwarf_Matter_Bolt.copy(), 8),
                setStackSize(BoltList.White_Dwarf_Matter_Bolt.copy(), 32).copy(),
                setStackSize(BoltList.Black_Dwarf_Matter_Bolt.copy(), 2),
                setStackSize(BoltList.Black_Dwarf_Matter_Bolt.copy(), 8).copy(),
                setStackSize(BoltList.Black_Dwarf_Matter_Bolt.copy(), 32),
                setStackSize(BoltList.Magnetohydrodynamically_Constrained_Star_Matter_Bolt.copy(), 2),
                setStackSize(BoltList.Magnetohydrodynamically_Constrained_Star_Matter_Bolt.copy(), 8) };

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
                    ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#40")
                        .itemInputsUnsafe(
                            GTUtility.getIntegratedCircuit(absoluteTier + 1),

                            MultiMachineCasingList.Reinforced_Spatial_Structure_Casing,
                            yottankCell[absoluteTier],
                            setStackSize(GTBlockList.Quantum_Tank_IV.copy(), 4 * (absoluteTier + 1)),
                            setStackSize(AvaritiaList.Infinity_Chest.copy(), absoluteTier + 1),

                            manipulator[absoluteTier],
                            setStackSize(
                                Appliedenergistics2List.Digital_Singularity_ME_Storage_Cell.copy(),
                                absoluteTier + 1),
                            boltList[absoluteTier],
                            getMaterialInput(OrePrefixes.circuit, Materials.UXV, (absoluteTier / 3) + 1))
                        .fluidInputs(
                            requiredFluid(FluidList.Mutated_Living_Solder, (int) (144 * 20 * pow(2, absoluteTier))),
                            requiredFluid(FluidList.Spatially_Enlarged_Fluid, 144 * 10 * (absoluteTier + 1)),
                            requiredFluid(MoltenList.Molten_SpaceTime, 144 * 10))
                        .itemOutputs(researchStuff[absoluteTier])
                        .eut(RECIPE_UMV)
                        .duration(4_000 * SECONDS * (absoluteTier + 1))
                        .addTo(AssemblyLineNormalRecipe);
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
                    ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#41")
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
                            setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 4 * (absoluteTier + 1)))
                        .fluidInputs(
                            requiredFluid(FluidList.Mutated_Living_Solder, (int) (144 * 20 * pow(2, absoluteTier))),
                            requiredFluid(FluidList.Tachyon_Rich_Temporal_Fluid, 144 * 10 * (absoluteTier + 1)),
                            requiredFluid(MoltenList.Molten_SpaceTime, 144 * 10))
                        .itemOutputs(researchStuff[absoluteTier])
                        .eut(RECIPE_UMV)
                        .duration(4_000 * SECONDS * (absoluteTier + 1))
                        .addTo(AssemblyLineNormalRecipe);
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
                    ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#42")
                        .itemInputsUnsafe(
                            GTUtility.getIntegratedCircuit(absoluteTier + 1),

                            timeCasings[absoluteTier],
                            spacetimeCasings[absoluteTier],
                            MultiMachineCasingList.Infinite_Spacetime_Energy_Boundary_Casing,
                            setStackSize(GTNHIntergalacticList.Dyson_Swarm_Module.copy(), 4 * (absoluteTier + 1)),

                            setStackSize(FrameBoxList.Superconductor_Base_UMV_Frame_Box.copy(), 4 * (absoluteTier + 1)),
                            setStackSize(FrameBoxList.Superconductor_Base_UIV_Frame_Box.copy(), 4 * (absoluteTier + 1)),
                            setStackSize(FrameBoxList.Superconductor_Base_UEV_Frame_Box.copy(), 4 * (absoluteTier + 1)),
                            setStackSize(FrameBoxList.Superconductor_Base_UHV_Frame_Box.copy(), 4 * (absoluteTier + 1)),

                            setStackSize(GTItemList.Gravitation_Engine.copy(), 256),
                            boltList[absoluteTier],
                            setStackSize(GearList.SpaceTime_Gear.copy(), absoluteTier + 1),
                            setStackSize(SmallGearList.Small_SpaceTime_Gear.copy(), absoluteTier + 1))
                        .fluidInputs(
                            requiredFluid(FluidList.Mutated_Living_Solder, (int) (144 * 20 * pow(2, absoluteTier))),
                            requiredFluid(FluidList.Tachyon_Rich_Temporal_Fluid, 144 * 10 * (absoluteTier + 1)),
                            requiredFluid(FluidList.Spatially_Enlarged_Fluid, 144 * 10 * (absoluteTier + 1)),
                            requiredFluid(MoltenList.Molten_SpaceTime, 144 * 10))
                        .itemOutputs(researchStuff[absoluteTier])
                        .eut(RECIPE_UMV)
                        .duration((absoluteTier + 1) * 4_000 * SECONDS)
                        .addTo(AssemblyLineNormalRecipe);
                }
            }
        }

        // Exo-Foundry
        {
            // S.O.C
            {
                // "Sentient Overclocker Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#43")
                    .itemInputsUnsafe(
                        setStackSize(MultiMachineCasingList.Eternal_Magnetic_Chassis.copy(), 1),
                        setStackSize(GoodGeneratorList.Gravity_Stabilization_Casing.copy(), 1),
                        setStackSize(GoodGeneratorList.Magnetic_Flux_Casing.copy(), 1),
                        setStackSize(SuperdensePlateList.Superdense_Superconductor_Base_UIV_Plate.copy(), 16),

                        setStackSize(RodList.Proto_Halkonite_Steel_Rod.copy(), 8),
                        getMaterialInput(OrePrefixes.circuit, Materials.UXV, 2),
                        setStackSize(GTItemList.Electric_Pump_UMV.copy(), 4),
                        setStackSize(GTItemList.Field_Generator_UMV.copy(), 1))
                    .fluidInputs(
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 16),
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 300),
                        requiredFluid(MoltenList.Molten_Shirabon, 144 * 40))
                    .itemOutputs(setStackSize(MultiMachineCasingList.Sentient_Overclocker_Casing, 1))
                    .eut(RECIPE_UMV)
                    .duration(45 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Magnetic Flux Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#44")
                    .itemInputsUnsafe(
                        setStackSize(FrameBoxList.Proto_Halkonite_Steel_Frame_Box.copy(), 4),
                        setStackSize(GTItemList.Sensor_UIV.copy(), 2),
                        setStackSize(GTItemList.Tengam_Electromagnet.copy(), 1),
                        setStackSize(DensePlateList.Dense_Proto_Halkonite_Steel_Plate.copy(), 1),

                        getMaterialInput(OrePrefixes.circuit, Materials.UIV, 1),
                        setStackSize(CasingList.Transcendent_Metal_Casing.copy(), 16),
                        setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Purified_Tengam, 144 * 64),
                        requiredFluid(MoltenList.Molten_Transcendent_Metal, 144 * 16),
                        requiredFluid(FluidList.Super_Coolant, 1000 * 10))
                    .itemOutputs(setStackSize(GoodGeneratorList.Magnetic_Flux_Casing.copy(), 4))
                    .eut(RECIPE_UIV)
                    .duration(60 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Gravity Stabilization Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#45")
                    .itemInputsUnsafe(
                        setStackSize(MultiMachineCasingList.Neutronium_Stabilization_Casing.copy(), 4),
                        setStackSize(GTItemList.Emitter_UIV.copy(), 2),
                        setStackSize(GTPPList.Graviton_Anomaly.copy(), 1),
                        setStackSize(PlateList.Proto_Halkonite_Steel_Plate.copy(), 4),

                        setStackSize(GearList.Proto_Halkonite_Steel_Gear.copy(), 1),
                        setStackSize(GTItemList.Gravi_Star.copy(), 4),
                        getMaterialInput(OrePrefixes.circuit, Materials.UIV, 1),
                        setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Chromatic_Glass, 144 * 64),
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 144 * 16))
                    .itemOutputs(setStackSize(GoodGeneratorList.Gravity_Stabilization_Casing.copy(), 4))
                    .eut(RECIPE_UIV)
                    .duration(60 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Antimatter Containment Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#46")
                    .itemInputsUnsafe(
                        setStackSize(MultiMachineCasingList.Neutronium_Stabilization_Casing.copy(), 4),
                        setStackSize(GTItemList.Emitter_UIV.copy(), 2),
                        setStackSize(GTPPList.Graviton_Anomaly.copy(), 1),
                        setStackSize(PlateList.Proto_Halkonite_Steel_Plate.copy(), 4),

                        setStackSize(GearList.Proto_Halkonite_Steel_Gear.copy(), 1),
                        setStackSize(GTItemList.Gravi_Star.copy(), 4),
                        getMaterialInput(OrePrefixes.circuit, Materials.UIV, 1),
                        setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Chromatic_Glass, 144 * 64),
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 144 * 16))
                    .itemOutputs(setStackSize(GoodGeneratorList.Gravity_Stabilization_Casing.copy(), 4))
                    .eut(RECIPE_UIV)
                    .duration(60 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Infinite Magnetic Chassis"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#47")
                    .itemInputsUnsafe(
                        setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box.copy(), 1),
                        setStackSize(PlateList.High_Durability_Compound_Steel_Plate.copy(), 32),
                        setStackSize(CircuitList.Optically_Compatible_Memory.copy(), 8),
                        setStackSize(GoodGeneratorList.Hi_Computation_Station_MKIV_Prototype.copy(), 4),

                        getMaterialInput(OrePrefixes.circuit, Materials.UEV, 1),
                        setStackSize(GTItemList.Emitter_UHV.copy(), 1),
                        setStackSize(ScrewList.Attuned_Tengam_Screw.copy(), 6),
                        setStackSize(GTItemList.Nuclear_Star.copy(), 2))
                    .fluidInputs(
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 4),
                        requiredFluid(MoltenList.Molten_Superconductor_Base_UEV, 144 * 2),
                        requiredFluid(MoltenList.Molten_Rhugnor, 144))
                    .itemOutputs(setStackSize(MultiMachineCasingList.Infinite_Magnetic_Chassis, 1))
                    .eut(RECIPE_UEV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Eternal Magnetic Chassis"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#48")
                    .itemInputsUnsafe(
                        setStackSize(GoodGeneratorList.Compact_Fusion_Coil_MKII_Finaltype.copy(), 1),
                        setStackSize(ScrewList.Ichorium_Screw.copy(), 64),
                        setStackSize(SingularityList.Spaghettic_Singularity.copy(), 1),
                        setStackSize(SingularityList.Cryptic_Singularity.copy(), 1),

                        getMaterialInput(OrePrefixes.circuit, Materials.UIV, 4),
                        setStackSize(GTItemList.Transcendent_Metal_Nanites.copy(), 2),
                        setStackSize(SuperdensePlateList.Superdense_Six_Phased_Copper_Plate.copy(), 1),
                        setStackSize(GTItemList.Emitter_UIV.copy(), 1))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Proto_Halkonite_Steel_Base, 144 * 20),
                        requiredFluid(MoltenList.Molten_Mellion, 144 * 4),
                        requiredFluid(MoltenList.Molten_Creon, 144 * 4),
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 20))
                    .itemOutputs(setStackSize(MultiMachineCasingList.Eternal_Magnetic_Chassis, 1))
                    .eut(RECIPE_UIV)
                    .duration(45 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // S.L.C
            {
                // "Streamlined Casting Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#49")
                    .itemInputsUnsafe(
                        setStackSize(MultiMachineCasingList.Infinite_Magnetic_Chassis.copy(), 1),
                        setStackSize(SuperdensePlateList.Superdense_Tritanium_Plate.copy(), 16),
                        setStackSize(MachineList.World_Accelerator_UV.copy(), 8),
                        setStackSize(RotorList.Celestial_Tungsten_Rotor.copy(), 4),

                        getMaterialInput(OrePrefixes.circuit, Materials.UEV, 2),
                        setStackSize(GTItemList.Electric_Pump_UHV.copy(), 1))
                    .fluidInputs(
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 20),
                        requiredFluid(MoltenList.Molten_Holmium, 144 * 40),
                        requiredFluid(MoltenList.Molten_Enriched_Naquadah_Alloy, 144 * 10))
                    .itemOutputs(setStackSize(MultiMachineCasingList.Streamlined_Casting_Casing, 1))
                    .eut(RECIPE_UEV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Elemental Confinement Shell"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#50")
                    .itemInputsUnsafe(
                        setStackSize(GTBlockList.Machine_Hull_LuV.copy(), 5),
                        setStackSize(GTItemList.Field_Generator_HV.copy(), 16),
                        setStackSize(GTPPList.Energy_Core_MV.copy(), 2),
                        setStackSize(PlateList.Pikyonium_64B_Plate.copy(), 4),

                        setStackSize(ScrewList.Pikyonium_64B_Screw.copy(), 4),
                        setStackSize(BoltList.Trinium_Naquadah_Carbonite_Bolt.copy(), 8),
                        setStackSize(RodList.Inconel_625_Rod.copy(), 4),
                        getMaterialInput(OrePrefixes.circuit, Materials.IV, 4),

                        setStackSize(GTItemList.Data_Stick.copy(), 4))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Inconel_625, 144 * 16),
                        requiredFluid(MoltenList.Molten_Inconel_792, 144 * 8),
                        requiredFluid(MoltenList.Molten_Hastelloy_N, 144 * 8),
                        requiredFluid(MoltenList.Molten_Babbit_Alloy, 144 * 16))
                    .itemOutputs(setStackSize(MultiMachineCasingList.Elemental_Confinement_Shell, 1))
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // P.V.S
            {
                // "Proto-Volt Stabilizer Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#51")
                    .itemInputsUnsafe(
                        setStackSize(MultiMachineCasingList.Infinite_Magnetic_Chassis.copy(), 1),
                        setStackSize(PlateList.Attuned_Tengam_Plate.copy(), 6),
                        setStackSize(GTItemList.Samarium_Electromagnet.copy(), 1),
                        setStackSize(GTItemList.Solar_Panel_UV.copy(), 1),

                        setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 2),
                        setStackSize(BatteryList.Energy_Cluster_Empty.copy(), 1))
                    .fluidInputs(
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 20),
                        requiredFluid(MoltenList.Molten_Neodymium, 144 * 64 * 4),
                        requiredFluid(MoltenList.Molten_Samarium, 144 * 64 * 2),
                        requiredFluid(MoltenList.Molten_Purified_Tengam, 144 * 64))
                    .itemOutputs(setStackSize(MultiMachineCasingList.Proto_Volt_Stabilizer_Casing, 1))
                    .eut(RECIPE_UEV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // H.C
            {
                // "Hypercooler Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#52")
                    .itemInputsUnsafe(
                        setStackSize(MultiMachineCasingList.Infinite_Magnetic_Chassis.copy(), 1),
                        setStackSize(SuperdensePlateList.Superdense_Infinity_Catalyst_Plate.copy(), 64),
                        setStackSize(SuperdensePlateList.Superdense_Callisto_Ice_Plate.copy(), 32),
                        setStackSize(SuperdensePlateList.Superdense_Six_Phased_Copper_Plate.copy(), 16),

                        setStackSize(MachineList.World_Accelerator_UV.copy(), 8),
                        setStackSize(GTItemList.Electric_Pump_UIV.copy(), 4),
                        setStackSize(GTItemList.Fluid_Regulator_UIV.copy(), 4),
                        getMaterialInput(OrePrefixes.circuit, Materials.UIV, 2))
                    .fluidInputs(
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 16),
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 90),
                        requiredFluid(MoltenList.Molten_Proto_Halkonite_Steel_Base, 144 * 8),
                        requiredFluid(MoltenList.Molten_SpaceTime, 36))
                    .itemOutputs(setStackSize(MultiMachineCasingList.Hypercooler_Casing, 1))
                    .eut(RECIPE_UIV)
                    .duration(45 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // S.C.B
            {
                // "Superdense Casting Basin Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#53")
                    .itemInputsUnsafe(
                        setStackSize(MultiMachineCasingList.Infinite_Magnetic_Chassis.copy(), 1),
                        setStackSize(GTNHIntergalacticList.Ultra_High_Temperature_Resistant_Mesh.copy(), 16),
                        getMaterialInput(OrePrefixes.circuit, Materials.UEV, 1),
                        setStackSize(LongRodList.Long_Superconductor_Base_UEV_Rod.copy(), 4),

                        setStackSize(SuperdensePlateList.Superdense_Infinity_Catalyst_Plate.copy(), 2),
                        setStackSize(SuperdensePlateList.Superdense_Attuned_Tengam_Plate.copy(), 2),
                        setStackSize(SuperdensePlateList.Superdense_Cosmic_Neutronium_Plate.copy(), 2),
                        setStackSize(SuperdensePlateList.Superdense_Neutronium_Plate.copy(), 2))
                    .fluidInputs(
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 20),
                        requiredFluid(MoltenList.Molten_Naquadria, 144 * 400),
                        requiredFluid(MoltenList.Molten_Manyullyn_GregTech, 144 * 100),
                        requiredFluid(MoltenList.Molten_Precious_Metals_Alloy, 144 * 20))
                    .itemOutputs(setStackSize(MultiMachineCasingList.Superdense_Casting_Basin_Casing, 1))
                    .eut(RECIPE_UEV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Primary Exo-Foundry Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#54")
                    .itemInputsUnsafe(
                        setStackSize(FrameBoxList.Netherite_Frame_Box.copy(), 1),
                        setStackSize(CircuitList.Optically_Perfected_CPU.copy(), 6),
                        setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 8),
                        setStackSize(ScrewList.Infinity_Screw.copy(), 4),

                        setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 2))
                    .fluidInputs(
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 4),
                        requiredFluid(GasList.Oganesson, 500),
                        requiredFluid(MoltenList.Molten_Cosmic_Neutronium, 144 * 2))
                    .itemOutputs(setStackSize(MultiMachineCasingList.Primary_Exo_Foundry_Casing, 1))
                    .eut(RECIPE_UEV)
                    .duration(15 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // H.R
            {
                // "Heliocast Reinforcement Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#55")
                    .itemInputsUnsafe(
                        setStackSize(MultiMachineCasingList.Eternal_Magnetic_Chassis.copy(), 1),
                        setStackSize(TecTechList.Stellar_Energy_Siphon_Casing.copy(), 1),
                        setStackSize(LongRodList.Long_Six_Phased_Copper_Rod.copy(), 6),
                        setStackSize(LongRodList.Long_Transcendent_Metal_Rod.copy(), 6),

                        getMaterialInput(OrePrefixes.circuit, Materials.UIV, 8),
                        setStackSize(GTItemList.Sensor_UIV.copy(), 4),
                        setStackSize(GTItemList.Emitter_UIV.copy(), 4),
                        setStackSize(GearList.Rhugnor_Gear.copy(), 4))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Metastable_Oganesson, 144 * 40),
                        requiredFluid(MoltenList.Molten_Mellion, 144 * 20),
                        requiredFluid(MoltenList.Molten_Creon, 144 * 20),
                        requiredFluid(MoltenList.Molten_SpaceTime, 144 * 5))
                    .itemOutputs(setStackSize(MultiMachineCasingList.Heliocast_Reinforcement_Casing, 1))
                    .eut(RECIPE_UIV)
                    .duration(45 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Transcendentally Amplified Magnetic Confinement Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#56")
                    .itemInputsUnsafe(
                        setStackSize(FrameBoxList.Transcendent_Metal_Frame_Box.copy(), 8),
                        setStackSize(BlockList.Block_of_Magneto_Resonatic.copy(), 16),
                        setStackSize(DensePlateList.Dense_Attuned_Tengam_Plate.copy(), 32),
                        setStackSize(PlateList.Creon_Plate.copy(), 16),

                        setStackSize(ScrewList.Hypogen_Screw.copy(), 8),
                        setStackSize(ScrewList.Six_Phased_Copper_Screw.copy(), 8),
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
                    .addTo(AssemblyLineNormalRecipe);

                // "Spatially Transcendent Gravitational Lens Block"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#57")
                    .itemInputsUnsafe(
                        setStackSize(TecTechList.Quantum_Glass.copy(), 8),
                        setStackSize(GTBlockList.Transcendentally_Reinforced_Borosilicate_Glass_Block.copy(), 8),
                        setStackSize(GTPPList.Force_Field_Glass.copy(), 8),
                        setStackSize(GTItemList.Stable_Boson_Containment_Unit.copy(), 4),

                        setStackSize(GTItemList.Radox_Polymer_Lens.copy(), 6),
                        setStackSize(GTItemList.Chromatic_Lens.copy(), 6),
                        setStackSize(GTItemList.Quite_Certain_Crystal_Lens.copy(), 6),
                        setStackSize(GTItemList.Magneto_Resonatic_Lens.copy(), 6),

                        setStackSize(DensePlateList.Dense_Chromatic_Glass_Plate.copy(), 36),
                        setStackSize(LongRodList.Long_Creon_Rod.copy(), 6),
                        setStackSize(LongRodList.Long_Mellion_Rod.copy(), 6),
                        setStackSize(LongRodList.Long_Six_Phased_Copper_Rod.copy(), 6))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Rhugnor, 144 * 16),
                        requiredFluid(MoltenList.Molten_Creon, 144 * 16),
                        requiredFluid(MoltenList.Molten_Advanced_Nitinol, 144 * 64 * 16))
                    .itemOutputs(setStackSize(TecTechList.Spatially_Transcendent_Gravitational_Lens_Block, 1))
                    .eut(RECIPE_UIV)
                    .duration(10 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // U.C
            {
                // "Universal Collapser Casing"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#58")
                    .itemInputsUnsafe(
                        setStackSize(MultiMachineCasingList.Celestial_Magnetic_Chassis.copy(), 4),
                        setStackSize(MultiMachineControllerList.Eye_of_Harmony.copy(), 1),
                        setStackSize(TecTechList.Gallifreyan_Stabilisation_Field_Generator.copy(), 32),
                        setStackSize(HatchList.Laser_Source_Hatch1048576_UXV.copy(), 1),

                        setStackSize(GTItemList.Black_Hole_Seed.copy(), 64),
                        setStackSize(GTItemList.Timepiece.copy(), 64),
                        setStackSize(SuperdensePlateList.Superdense_Eternity_Plate.copy(), 64),
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
                    .addTo(AssemblyLineNormalRecipe);
            }
        }

        // "Femtometer-Calibrated Particle Beam Casing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#59")
            .itemInputsUnsafe(
                setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box.copy(), 16),
                setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 16),
                setStackSize(FrameBoxList.Tritanium_Frame_Box.copy(), 16),
                setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 16),

                setStackSize(PlateList.Cosmic_Neutronium_Plate.copy(), 16),
                setStackSize(PlateList.Infinity_Plate.copy(), 16),
                setStackSize(PlateList.Tritanium_Plate.copy(), 16),
                setStackSize(PlateList.Neutronium_Plate.copy(), 16),

                setStackSize(GTItemList.Field_Generator_UHV.copy(), 1),
                getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),
                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 2),
                setStackSize(PipeList.Infinity_Fluid_Pipe.copy(), 16))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Infinity, 144 * 32),
                requiredFluid(MoltenList.Molten_Tritanium, 144 * 32),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 32),
                requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Resplendent_Catalyst, 1000 * 4))
            .itemOutputs(setStackSize(MultiMachineCasingList.Femtometer_Calibrated_Particle_Beam_Casing.copy(), 4))
            .eut(RECIPE_UIV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Fluid Cell Block
        {
            // "Fluid Cell Block T3"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#60")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Naquadah_Frame_Box.copy(), 1),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T3.copy(), 10),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 8),
                    setStackSize(GTItemList.Electric_Pump_IV.copy(), 8),

                    setStackSize(PipeList.Niobium_Titanium_Fluid_Pipe.copy(), 8),
                    setStackSize(PlateList.Adamantium_Alloy_Plate.copy(), 32))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Quantium, 144 * 10),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 8),
                    requiredFluid(FluidList.Lubricant, 1000 * 8))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Cell_Block_T3, 1))
                .eut(RECIPE_LuV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Cell Block T4"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#61")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 1),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T4.copy(), 10),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 8),
                    setStackSize(GTItemList.Electric_Pump_LuV.copy(), 8),

                    setStackSize(PipeList.Mysterious_Crystal_Fluid_Pipe.copy(), 8),
                    setStackSize(PlateList.Fluxed_Electrum_Plate.copy(), 32))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Draconium, 144 * 10),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 16),
                    requiredFluid(FluidList.Lubricant, 1000 * 16))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Cell_Block_T4, 1))
                .eut(RECIPE_ZPM)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Cell Block T5"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#62")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box.copy(), 1),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T5.copy(), 10),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 8),
                    setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 8),

                    setStackSize(PipeList.Awakened_Draconium_Fluid_Pipe.copy(), 8),
                    setStackSize(PlateList.Neutronium_Plate.copy(), 64))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Draconium, 144 * 10),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 16),
                    requiredFluid(FluidList.Lubricant, 1000 * 16))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Cell_Block_T5, 1))
                .eut(RECIPE_UV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Cell Block T6"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#63")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 1),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T6.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 8),
                    setStackSize(GTItemList.Electric_Pump_UV.copy(), 8),

                    setStackSize(PipeList.Nether_Star_Fluid_Pipe.copy(), 8),
                    setStackSize(PlateList.Infinity_Plate.copy(), 64))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Awakened_Draconium, 144 * 10),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 46),
                    requiredFluid(FluidList.Lubricant, 1000 * 32))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Cell_Block_T6, 1))
                .eut(RECIPE_UHV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Cell Block T7"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#64")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 1),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T7.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 8),
                    setStackSize(GTItemList.Electric_Pump_UHV.copy(), 8),

                    setStackSize(PipeList.Nether_Star_Fluid_Pipe.copy(), 16),
                    setStackSize(PlateList.Cosmic_Neutronium_Plate.copy(), 32),
                    setStackSize(PlateList.Infinity_Plate.copy(), 32))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Awakened_Draconium, 144 * 100),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 46),
                    requiredFluid(FluidList.Lubricant, 1000 * 46))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Cell_Block_T7, 1))
                .eut(RECIPE_UEV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Cell Block T8"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#65")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 1),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T8.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 8),
                    setStackSize(GTItemList.Electric_Pump_UEV.copy(), 8),

                    setStackSize(PipeList.Large_Nether_Star_Fluid_Pipe.copy(), 12),
                    setStackSize(DoublePlateList.Double_Cosmic_Neutronium_Plate.copy(), 12),
                    setStackSize(DoublePlateList.Double_Awakened_Draconium_Plate.copy(), 12),
                    setStackSize(PlateList.Infinity_Plate.copy(), 64))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Awakened_Draconium, 144 * 100),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 46),
                    requiredFluid(FluidList.Lubricant, 1000 * 46))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Cell_Block_T8, 1))
                .eut(RECIPE_UIV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Cell Block T9"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#66")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 2),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T9.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 8),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 8),

                    setStackSize(PipeList.Large_Nether_Star_Fluid_Pipe.copy(), 12),
                    setStackSize(DoublePlateList.Double_Cosmic_Neutronium_Plate.copy(), 12),
                    setStackSize(DoublePlateList.Double_Proto_Halkonite_Steel_Plate.copy(), 12),
                    setStackSize(PlateList.Infinity_Plate.copy(), 64))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Awakened_Draconium, 144 * 100),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 46),
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 46))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Cell_Block_T9, 1))
                .eut(RECIPE_UMV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Cell Block T10"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#67")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.SpaceTime_Frame_Box.copy(), 2),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T10.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 12),
                    setStackSize(GTItemList.Electric_Pump_UMV.copy(), 8),

                    setStackSize(PipeList.Large_Nether_Star_Fluid_Pipe.copy(), 64),
                    setStackSize(DoublePlateList.Double_Cosmic_Neutronium_Plate.copy(), 12),
                    setStackSize(DoublePlateList.Double_Proto_Halkonite_Steel_Plate.copy(), 12),
                    setStackSize(PlateList.SpaceTime_Plate.copy(), 10))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Awakened_Draconium, 144 * 10),
                    requiredFluid(MoltenList.Molten_Transcendent_Metal, 144 * 10),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 46),
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 46))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Cell_Block_T10, 1))
                .eut(RECIPE_UXV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Focus Manipulator"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#68")
            .itemInputsUnsafe(
                setStackSize(FrameBoxList.Aluminium_Frame_Box.copy(), 1),
                getMaterialInput(OrePrefixes.circuit, Materials.IV, 4),
                setStackSize(GTItemList.Robot_Arm_LuV.copy(), 4),
                setStackSize(GTItemList.Conveyor_Module_LuV.copy(), 2),

                setStackSize(FineWireList.Fine_Gold_Wire.copy(), 32),
                setStackSize(WireList.Tungsten_Wire_1x.copy(), 2))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Soldering_Alloy, 144 * 64),
                requiredFluid(MoltenList.Molten_Gold_GregTech, 144 * 16),
                requiredFluid(GasList.Argon, 1000))
            .itemOutputs(setStackSize(GTNHLanthanidesList.Focus_Manipulator, 1))
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Forge of the Gods
        {
            // "Singularity Reinforced Stellar Shielding Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#69")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Six_Phased_Copper_Frame_Box.copy(), 4),
                    setStackSize(FrameBoxList.Infinity_Catalyst_Frame_Box.copy(), 4),
                    setStackSize(FrameBoxList.Titansteel_Frame_Box.copy(), 4),
                    setStackSize(FrameBoxList.Abyssal_Alloy_Frame_Box.copy(), 4),

                    setStackSize(SuperdensePlateList.Superdense_Infinity_Plate.copy(), 2),
                    setStackSize(SuperdensePlateList.Superdense_Netherite_Plate.copy(), 2),
                    setStackSize(SuperdensePlateList.Superdense_Cosmic_Neutronium_Plate.copy(), 2),
                    setStackSize(SuperdensePlateList.Superdense_Transcendent_Metal_Plate.copy(), 2),

                    setStackSize(PlateList.Mellion_Plate.copy(), 16),
                    setStackSize(PlateList.Quantum_Plate.copy(), 16),
                    setStackSize(PlateList.Creon_Plate.copy(), 16),
                    setStackSize(PlateList.Proto_Halkonite_Steel_Plate.copy(), 16),

                    setStackSize(SingularityList.Spaghettic_Singularity.copy(), 1),
                    setStackSize(SingularityList.Cryptic_Singularity.copy(), 1),
                    setStackSize(LongRodList.Long_Superconductor_Base_UEV_Rod.copy(), 8),
                    setStackSize(LongRodList.Long_Superconductor_Base_UIV_Rod.copy(), 8))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 2),
                    requiredFluid(MoltenList.Molten_Bedrockium, 144 * 64 * 256),
                    requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 64 * 32),
                    requiredFluid(MoltenList.Molten_Neutronium, 144 * 64 * 32))
                .itemOutputs(setStackSize(TecTechList.Singularity_Reinforced_Stellar_Shielding_Casing.copy(), 4))
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Remote Graviton Flow Modulator"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#70")
                .itemInputsUnsafe(
                    setStackSize(TecTechList.Transcendentally_Amplified_Magnetic_Confinement_Casing.copy(), 2),
                    setStackSize(GoodGeneratorList.Ultimate_Field_Restriction_Coil.copy(), 1),
                    setStackSize(PlateList.Creon_Plate.copy(), 16),
                    setStackSize(SmallGearList.Small_Mellion_Gear.copy(), 8),

                    setStackSize(GTPPList.Graviton_Anomaly.copy(), 2),
                    setStackSize(GTPPList.Quantum_Anomaly.copy(), 4),
                    setStackSize(GTItemList.Emitter_UIV.copy(), 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 16),

                    setStackSize(GTItemList.Silver_Nanites.copy(), 2))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 32),
                    requiredFluid(MoltenList.Molten_Superconductor_Base_UIV, 144 * 32),
                    requiredFluid(MoltenList.Molten_Infinity, 144 * 32))
                .itemOutputs(setStackSize(TecTechList.Remote_Graviton_Flow_Modulator.copy(), 2))
                .eut(RECIPE_UIV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Celestial Matter Guidance Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#71")
                .itemInputsUnsafe(
                    setStackSize(TecTechList.Boundless_Gravitationally_Severed_Structure_Casing.copy(), 1),
                    setStackSize(BatteryList.Ultimate_Battery_Empty.copy(), 1),
                    setStackSize(GTPPList.Cosmic_Fabric_Manipulator.copy(), 1),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 2),

                    setStackSize(GTItemList.Emitter_UIV.copy(), 3),
                    setStackSize(PlateList.Creon_Plate.copy(), 6),
                    setStackSize(GearList.Creon_Gear.copy(), 8),
                    setStackSize(SmallGearList.Small_Mellion_Gear.copy(), 8))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 16),
                    requiredFluid(PlasmaList.Thorium_Plasma, 144 * 2))
                .itemOutputs(setStackSize(TecTechList.Celestial_Matter_Guidance_Casing, 1))
                .eut(RECIPE_UIV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Boundless Gravitationally Severed Structure Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#72")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Mellion_Frame_Box.copy(), 16),
                    setStackSize(FrameBoxList.Six_Phased_Copper_Frame_Box.copy(), 16),
                    setStackSize(FrameBoxList.Transcendent_Metal_Frame_Box.copy(), 8),
                    setStackSize(FrameBoxList.Astral_Titanium_Frame_Box.copy(), 8),

                    setStackSize(PlateList.Creon_Plate.copy(), 6),
                    setStackSize(GTItemList.Stable_Boson_Containment_Unit.copy(), 1),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 2),
                    setStackSize(AmunRaList.Artificial_Gravity_Generator.copy(), 4))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 16),
                    requiredFluid(PlasmaList.Lead_Plasma, 144 * 2))
                .itemOutputs(setStackSize(TecTechList.Boundless_Gravitationally_Severed_Structure_Casing, 1))
                .eut(RECIPE_UIV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Stellar Energy Siphon Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#73")
                .itemInputsUnsafe(
                    setStackSize(TecTechList.Boundless_Gravitationally_Severed_Structure_Casing.copy(), 1),
                    setStackSize(GTBlockList.Hypogen_Coil_Block.copy(), 64 * 2),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 4),
                    setStackSize(GTItemList.Neutronium_Heat_Capacitor_1G.copy(), 2),

                    setStackSize(HatchList.Laser_Target_Hatch1048576_UIV.copy(), 1),
                    setStackSize(MachineList.Plasma_Generator_UV.copy(), 64),
                    setStackSize(DensePlateList.Dense_Creon_Plate.copy(), 6),
                    setStackSize(PlateList.Hypogen_Plate.copy(), 6))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 16),
                    requiredFluid(MoltenList.Molten_Superconductor_Base_UIV, 144 * 32),
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 64 * 2))
                .itemOutputs(setStackSize(TecTechList.Stellar_Energy_Siphon_Casing, 1))
                .eut(RECIPE_UIV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Medial Graviton Flow Modulator"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#74")
                .itemInputsUnsafe(
                    setStackSize(TecTechList.Transcendentally_Amplified_Magnetic_Confinement_Casing.copy(), 1),
                    setStackSize(GoodGeneratorList.Temporal_Field_Restriction_Coil.copy(), 1),
                    setStackSize(DensePlateList.Dense_Creon_Plate.copy(), 8),
                    setStackSize(GearList.Mellion_Gear.copy(), 4),

                    setStackSize(GTPPList.Graviton_Anomaly.copy(), 4),
                    setStackSize(GTPPList.Quantum_Anomaly.copy(), 8),
                    setStackSize(GTItemList.Emitter_UMV.copy(), 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 8),

                    setStackSize(GTItemList.Silver_Nanites.copy(), 2),
                    setStackSize(GTItemList.Gold_Nanites.copy(), 2))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64),
                    requiredFluid(MoltenList.Molten_Superconductor_Base_UMV, 144 * 64),
                    requiredFluid(MoltenList.Molten_SpaceTime, 144 * 64))
                .itemOutputs(setStackSize(TecTechList.Medial_Graviton_Flow_Modulator, 1))
                .eut(RECIPE_UMV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Central Graviton Flow Modulator"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#75")
                .itemInputsUnsafe(
                    setStackSize(TecTechList.Transcendentally_Amplified_Magnetic_Confinement_Casing.copy(), 1),
                    setStackSize(GoodGeneratorList.Temporal_Field_Restriction_Coil.copy(), 4),
                    setStackSize(SuperdensePlateList.Superdense_Creon_Plate.copy(), 8),
                    setStackSize(GearList.Mellion_Gear.copy(), 64),

                    setStackSize(GTPPList.SpaceTime_Continuum_Ripper.copy(), 8),
                    setStackSize(GTPPList.Graviton_Anomaly.copy(), 8),
                    setStackSize(GTPPList.Quantum_Anomaly.copy(), 8),
                    setStackSize(GTItemList.Emitter_UXV.copy(), 4),

                    getMaterialInput(OrePrefixes.circuit, Materials.MAX, 8),
                    setStackSize(GTItemList.Silver_Nanites.copy(), 8),
                    setStackSize(GTItemList.Gold_Nanites.copy(), 8),
                    setStackSize(GTItemList.Six_Phased_Copper_Nanites.copy(), 8),

                    setStackSize(GTItemList.Universium_Nanites.copy(), 8))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 4),
                    requiredFluid(MoltenList.Molten_Superconductor_Base_UMV, 144 * 64 * 4),
                    requiredFluid(MoltenList.Molten_White_Dwarf_Matter, 144 * 64 * 4),
                    requiredFluid(MoltenList.Molten_Eternity, 144 * 64 * 4))
                .itemOutputs(setStackSize(TecTechList.Medial_Graviton_Flow_Modulator, 1))
                .eut(RECIPE_UXV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Harmonic Phonon Transmission Conduit"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#76")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Transcendent_Metal_Frame_Box.copy(), 1),
                    setStackSize(LongRodList.Long_Creon_Rod.copy(), 12),
                    setStackSize(KekzTechList.TFFT_Storage_Field_Block_TierIX.copy(), 1),
                    setStackSize(GTItemList.Raw_Tesseract.copy(), 8),

                    setStackSize(GTItemList.Relativistic_Heat_Capacitor.copy(), 4),
                    setStackSize(GTItemList.Thermal_Superconductor.copy(), 6),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 4),
                    setStackSize(BoltList.Six_Phased_Copper_Bolt.copy(), 24))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64),
                    requiredFluid(FluidList.Lossless_Phonon_Transfer_Medium, 1000),
                    requiredFluid(PlasmaList.Plutonium_241_Plasma, 144 * 16))
                .itemOutputs(setStackSize(TecTechList.Harmonic_Phonon_Transmission_Conduit, 1))
                .eut(RECIPE_UIV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Fusion Computer
        {
            // "Advanced Fusion Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#77")
                .itemInputsUnsafe(
                    setStackSize(BatteryList.Lapotronic_Energy_Orb_Cluster_Empty.copy(), 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 8),
                    setStackSize(PlateList.Neutronium_Plate.copy(), 8),

                    setStackSize(GTItemList.Emitter_UHV.copy(), 1),
                    setStackSize(GTItemList.Sensor_UHV.copy(), 1),
                    setStackSize(MultiMachineCasingList.Fusion_Coil_Block.copy(), 1))
                .fluidInputs(
                    requiredFluid(FluidList.UU_Matter, 1000 * 8),
                    requiredFluid(MoltenList.Molten_Cinobite_A243, 144 * 16),
                    requiredFluid(MoltenList.Molten_Octiron, 144 * 16),
                    requiredFluid(MoltenList.Molten_Astral_Titanium, 144 * 16))
                .itemOutputs(setStackSize(MultiMachineCasingList.Advanced_Fusion_Coil, 1))
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Advanced Fusion Coil II"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#78")
                .itemInputsUnsafe(
                    setStackSize(BatteryList.Energy_Module_Empty.copy(), 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 8),
                    setStackSize(PlateList.Rhugnor_Plate.copy(), 8),

                    setStackSize(GTItemList.Emitter_UEV.copy(), 1),
                    setStackSize(GTItemList.Sensor_UEV.copy(), 1),
                    setStackSize(GoodGeneratorList.Advanced_Compact_Fusion_Coil.copy(), 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Neptunium, 144 * 16),
                    requiredFluid(MoltenList.Molten_Chromatic_Glass, 144 * 16),
                    requiredFluid(MoltenList.Molten_Abyssal_Alloy, 144 * 16),
                    requiredFluid(MoltenList.Molten_Dragonblood, 144 * 16))
                .itemOutputs(setStackSize(MultiMachineCasingList.Advanced_Fusion_Coil_II, 1))
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fusion Machine Casing MK III"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#79")
                .itemInputsUnsafe(
                    getMaterialInput(OrePrefixes.circuit, Materials.EV, 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.IV, 8),
                    setStackSize(BlockList.Block_of_Netherite.copy(), 2),
                    setStackSize(PlateList.Neutronium_Plate.copy(), 8),

                    setStackSize(GTItemList.Electric_Motor_UHV.copy(), 2),
                    setStackSize(GTItemList.Electric_Piston_UHV.copy(), 1),
                    setStackSize(MultiMachineCasingList.Fusion_Machine_Casing_MK_II.copy(), 1))
                .fluidInputs(
                    requiredFluid(FluidList.UU_Matter, 1000),
                    requiredFluid(MoltenList.Molten_Cinobite_A243, 144 * 4),
                    requiredFluid(MoltenList.Molten_Octiron, 144 * 4),
                    requiredFluid(MoltenList.Molten_Astral_Titanium, 144 * 4))
                .itemOutputs(setStackSize(MultiMachineCasingList.Fusion_Machine_Casing_MK_III, 1))
                .eut(RECIPE_UHV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fusion Machine Casing MK IV"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#80")
                .itemInputsUnsafe(
                    getMaterialInput(OrePrefixes.circuit, Materials.IV, 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 8),
                    setStackSize(BlockList.Block_of_Netherite.copy(), 8),
                    setStackSize(PlateList.Chromatic_Glass_Plate.copy(), 8),

                    setStackSize(GTItemList.Electric_Motor_UEV.copy(), 2),
                    setStackSize(GTItemList.Electric_Piston_UEV.copy(), 1),
                    setStackSize(MultiMachineCasingList.Fusion_Machine_Casing_MK_III.copy(), 1))
                .fluidInputs(
                    requiredFluid(FluidList.Fermium, 144 * 8),
                    requiredFluid(MoltenList.Molten_Chromatic_Glass, 144 * 8),
                    requiredFluid(MoltenList.Molten_Abyssal_Alloy, 144 * 8),
                    requiredFluid(MoltenList.Molten_Dragonblood, 144 * 8))
                .itemOutputs(setStackSize(MultiMachineCasingList.Fusion_Machine_Casing_MK_IV, 1))
                .eut(RECIPE_UEV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Hollow Casing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#81")
            .itemInputsUnsafe(
                setStackSize(TecTechList.Molecular_Casing.copy(), 1),
                setStackSize(DensePlateList.Dense_Europium_Plate.copy(), 2),
                setStackSize(QuadruplePlateList.Quadruple_Plutonium_239_Plate.copy(), 4),
                setStackSize(DoublePlateList.Double_Lead_Plate.copy(), 8),

                setStackSize(PlateList.Uranium_238_Plate.copy(), 16),
                setStackSize(ScrewList.Quantium_Screw.copy(), 16))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Trinium, 144 * 9),
                requiredFluid(MoltenList.Molten_Osmium, 144 * 9),
                requiredFluid(FluidList.IC2_Coolant, 1000 * 2),
                requiredFluid(GasList.Argon, 1000))
            .itemOutputs(setStackSize(TecTechList.Hollow_Casing.copy(), 2))
            .eut(RECIPE_UV)
            .duration(10 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Ion Thruster Base"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#82")
            .itemInputsUnsafe(
                setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 16),
                setStackSize(GTBlockList.Battery_Buffer16_UHV.copy(), 2),
                setStackSize(GTItemList.Emitter_UHV.copy(), 4),
                setStackSize(GTItemList.Field_Generator_UHV.copy(), 2),

                setStackSize(AmunRaList.Nanite_Cluster.copy(), 1))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Infinity, 144 * 50),
                requiredFluid(FluidList.Super_Coolant, 1000 * 64),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64))
            .itemOutputs(setStackSize(AmunRaList.Ion_Thruster_Base, 1))
            .eut(RECIPE_UEV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Ion Thruster Jet"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#83")
            .itemInputsUnsafe(
                setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 64),
                setStackSize(GoodGeneratorList.Advanced_Field_Restriction_Coil.copy(), 8),
                setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 2),
                setStackSize(GTItemList.Emitter_UHV.copy(), 16),

                setStackSize(GTItemList.Field_Generator_UHV.copy(), 8),
                setStackSize(AmunRaList.Nanite_Cluster.copy(), 4))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Infinity, 144 * 50),
                requiredFluid(FluidList.Super_Coolant, 1000 * 64),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64))
            .itemOutputs(setStackSize(AmunRaList.Ion_Thruster_Base, 1))
            .eut(RECIPE_UEV)
            .duration(360 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Lapotronic Capacitor
        {
            // "Lapotronic Capacitor (LuV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#84")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Osmiridium_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.Osmiridium_Screw.copy(), 24),
                    setStackSize(CircuitList.Multilayer_Fiber_Reinforced_Circuit_Board.copy(), 1),
                    setStackSize(FoilList.Naquadah_Alloy_Foil.copy(), 64),

                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 72),
                    setStackSize(CircuitList.High_Power_IC_Chip.copy(), 64),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 8),

                    setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 8),
                    setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 8),
                    setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 8),
                    setStackSize(FineWireList.Fine_Platinum_Wire.copy(), 64))
                .fluidInputs(requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 5))
                .itemOutputs(setStackSize(KekzTechList.Lapotronic_Capacitor_LuV, 1))
                .eut(RECIPE_ZPM)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Lapotronic Capacitor (ZPM)" - 1
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#85")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(FrameBoxList.Naquadah_Alloy_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.Naquadah_Alloy_Screw.copy(), 24),
                    setStackSize(PlateList.Europium_Plate.copy(), 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),

                    setStackSize(BatteryList.Lapotronic_Energy_Orb_Cluster_Empty.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_LuV.copy(), 2),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 8),

                    setStackSize(CableList.Naquadah_Cable_1x.copy(), 32))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 20),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 16))
                .itemOutputs(setStackSize(KekzTechList.Lapotronic_Capacitor_ZPM, 1))
                .eut(RECIPE_ZPM)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Lapotronic Capacitor (ZPM)" - 2
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#86")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 32),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64 + 8),
                    setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 64),

                    setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 64),
                    setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 64),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 9),

                    setStackSize(CircuitList.High_Power_IC_Chip.copy(), 64 * 8),
                    setStackSize(CircuitList.Multilayer_Fiber_Reinforced_Circuit_Board.copy(), 8),
                    setStackSize(FineWireList.Fine_Platinum_Wire.copy(), 64 * 8),
                    setStackSize(FoilList.Naquadah_Alloy_Foil.copy(), 64 * 8),

                    setStackSize(FrameBoxList.Naquadah_Alloy_Frame_Box.copy(), 4),
                    setStackSize(GTItemList.Field_Generator_LuV.copy(), 2),
                    setStackSize(ScrewList.Naquadah_Alloy_Screw.copy(), 24))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 60),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 16))
                .itemOutputs(setStackSize(KekzTechList.Lapotronic_Capacitor_ZPM, 1))
                .eut(RECIPE_UV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Lapotronic Capacitor (ZPM)" - 3
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#87")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(3),

                    setStackSize(FrameBoxList.Naquadah_Alloy_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.Naquadah_Alloy_Screw.copy(), 24),
                    setStackSize(PlateList.Europium_Plate.copy(), 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),

                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 2),
                    setStackSize(GTItemList.Field_Generator_LuV.copy(), 2),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 8),

                    setStackSize(CableList.Naquadah_Cable_1x.copy(), 32))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 20),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 16))
                .itemOutputs(setStackSize(KekzTechList.Lapotronic_Capacitor_ZPM, 1))
                .eut(RECIPE_UV)
                .duration(25 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Lapotronic Capacitor (UV)" - 1
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#88")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.Neutronium_Screw.copy(), 24),
                    setStackSize(PlateList.Americium_Plate.copy(), 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),

                    setStackSize(BatteryList.Energy_Module_Empty.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_ZPM.copy(), 2),
                    setStackSize(CircuitList.HPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 16),

                    setStackSize(CableList.Naquadah_Alloy_Cable_1x.copy(), 32))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 20),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 16))
                .itemOutputs(setStackSize(KekzTechList.Lapotronic_Capacitor_UV, 1))
                .eut(RECIPE_ZPM)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Lapotronic Capacitor (UV)" - 2
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#89")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 32),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),
                    setStackSize(CableList.Naquadah_Cable_1x.copy(), 64 * 4 + 32),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64 + 16),

                    setStackSize(CircuitList.ASoC_Wafer.copy(), 64 * 16),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 16),
                    setStackSize(CircuitList.HPIC_Wafer.copy(), 64 * 2),
                    setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 4),

                    setStackSize(GTItemList.Field_Generator_LuV.copy(), 16),
                    setStackSize(GTItemList.Field_Generator_ZPM.copy(), 2),
                    setStackSize(PlateList.Americium_Plate.copy(), 16),
                    setStackSize(PlateList.Europium_Plate.copy(), 64 * 2),

                    setStackSize(ScrewList.Neutronium_Screw.copy(), 24))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 180),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 144))
                .itemOutputs(setStackSize(KekzTechList.Lapotronic_Capacitor_UV, 1))
                .eut(RECIPE_UV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Lapotronic Capacitor (UV)" - 3
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#90")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(3),

                    setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.Neutronium_Screw.copy(), 24),
                    setStackSize(PlateList.Americium_Plate.copy(), 32),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),

                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 4),
                    setStackSize(GTItemList.Field_Generator_ZPM.copy(), 2),
                    setStackSize(CircuitList.HPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 16),

                    setStackSize(CableList.Naquadah_Alloy_Cable_1x.copy(), 32))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 20),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 16))
                .itemOutputs(setStackSize(KekzTechList.Lapotronic_Capacitor_UV, 1))
                .eut(RECIPE_UV)
                .duration(25 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Ultimate Capacitor (UHV)" - 1
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#91")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.Cosmic_Neutronium_Screw.copy(), 24),
                    setStackSize(DoublePlateList.Double_Neutronium_Plate.copy(), 64),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),

                    setStackSize(BatteryList.Ultimate_Battery_Empty.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 4),
                    setStackSize(CircuitList.UHPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 32),

                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 2))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 32),
                    requiredFluid(MoltenList.Molten_Naquadria, 144 * 64),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 32))
                .itemOutputs(setStackSize(KekzTechList.Ultimate_Capacitor_UHV, 1))
                .eut(RECIPE_UHV)
                .duration(200 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Ultimate Capacitor (UHV)" - 2
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#92")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 32),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64 * 5),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 32),

                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 64),
                    setStackSize(CircuitList.HPIC_Wafer.copy(), 64 * 16),
                    setStackSize(CircuitList.UHPIC_Wafer.copy(), 64 * 2),
                    setStackSize(DoublePlateList.Double_Neutronium_Plate.copy(), 64),

                    setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box.copy(), 4),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 4),
                    setStackSize(GTItemList.Field_Generator_UV.copy(), 16),
                    setStackSize(PlateList.Tritanium_Plate.copy(), 64 * 8),

                    setStackSize(ScrewList.Cosmic_Neutronium_Screw.copy(), 24),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 6))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 160),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 32),
                    requiredFluid(MoltenList.Molten_Naquadria, 144 * 64),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 160))
                .itemOutputs(setStackSize(KekzTechList.Ultimate_Capacitor_UHV, 1))
                .eut(RECIPE_UEV)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Ultimate Capacitor (UHV)" - 3
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#93")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(3),

                    setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.Cosmic_Neutronium_Screw.copy(), 24),
                    setStackSize(DoublePlateList.Double_Neutronium_Plate.copy(), 64),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),

                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 16),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 2),
                    setStackSize(CircuitList.UHPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 32),

                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 2))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 32),
                    requiredFluid(MoltenList.Molten_Naquadria, 144 * 64),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 32))
                .itemOutputs(setStackSize(KekzTechList.Ultimate_Capacitor_UHV, 1))
                .eut(RECIPE_UEV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Extremely Ultimate Capacitor (UEV)" - 1
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#94")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.Infinity_Screw.copy(), 24),
                    setStackSize(DoublePlateList.Double_Infinity_Catalyst_Plate.copy(), 64),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 4),

                    setStackSize(BatteryList.Really_Ultimate_Battery_Empty.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 4),
                    setStackSize(CircuitList.PPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 64),

                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 4))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64),
                    requiredFluid(MoltenList.Molten_Quantium, 144 * 64 * 2),
                    requiredFluid(MoltenList.Molten_Naquadria, 144 * 64 * 2),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 64))
                .itemOutputs(setStackSize(KekzTechList.Extremely_Ultimate_Capacitor_UEV, 1))
                .eut(RECIPE_UHV)
                .duration(640 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Extremely Ultimate Capacitor (UEV)" - 2
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#95")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 32),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 4),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 64 * 5),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 128),

                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64 * 3),
                    setStackSize(CircuitList.PPIC_Wafer.copy(), 64 * 6),
                    setStackSize(CircuitList.UHPIC_Wafer.copy(), 64 * 16),
                    setStackSize(DoublePlateList.Double_Infinity_Catalyst_Plate.copy(), 64),

                    setStackSize(DoublePlateList.Double_Neutronium_Plate.copy(), 64 * 8),
                    setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 4),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 4),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 16),

                    setStackSize(ScrewList.Infinity_Screw.copy(), 24),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 4),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 16))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 320),
                    requiredFluid(MoltenList.Molten_Quantium, 144 * 64 * 2),
                    requiredFluid(MoltenList.Molten_Naquadria, 144 * 64 * 10),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 320))
                .itemOutputs(setStackSize(KekzTechList.Extremely_Ultimate_Capacitor_UEV, 1))
                .eut(RECIPE_UEV)
                .duration(320 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Extremely Ultimate Capacitor (UEV)" - 3
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#96")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(3),

                    setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.Infinity_Screw.copy(), 24),
                    setStackSize(DoublePlateList.Double_Infinity_Catalyst_Plate.copy(), 64),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 4),

                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 32),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 2),
                    setStackSize(CircuitList.PPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 64),

                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 4))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64),
                    requiredFluid(MoltenList.Molten_Quantium, 144 * 64 * 2),
                    requiredFluid(MoltenList.Molten_Naquadria, 144 * 64 * 2),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 64))
                .itemOutputs(setStackSize(KekzTechList.Extremely_Ultimate_Capacitor_UEV, 1))
                .eut(RECIPE_UEV)
                .duration(160 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Insanely Ultimate Capacitor (UIV)" - 1
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#97")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(FrameBoxList.Transcendent_Metal_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.Transcendent_Metal_Screw.copy(), 24),
                    setStackSize(DoublePlateList.Double_Hypogen_Plate.copy(), 64),
                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 4),

                    setStackSize(BatteryList.Extremely_Ultimate_Battery_Empty.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UIV.copy(), 4),
                    setStackSize(CircuitList.QPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Living_Crystal_Chip.copy(), 64),

                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),
                    setStackSize(CircuitList.Optical_SMD_Inductor.copy(), 32),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 8))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 2),
                    requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 64 * 2),
                    requiredFluid(MoltenList.Molten_Quantium, 144 * 64 * 2),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 64 * 2))
                .itemOutputs(setStackSize(KekzTechList.Insanely_Ultimate_Capacitor_UIV, 1))
                .eut(RECIPE_UIV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Insanely Ultimate Capacitor (UIV)" - 2
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#98")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 32),
                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 4),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 64 * 8),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 256),

                    setStackSize(CircuitList.Living_Crystal_Chip.copy(), 64),
                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64 * 10),
                    setStackSize(CircuitList.QPIC_Wafer.copy(), 64 * 6),
                    setStackSize(DoublePlateList.Double_Hypogen_Plate.copy(), 64),

                    setStackSize(DoublePlateList.Double_Infinity_Catalyst_Plate.copy(), 64 * 8),
                    setStackSize(FrameBoxList.Transcendent_Metal_Frame_Box.copy(), 4),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 16),
                    setStackSize(GTItemList.Field_Generator_UIV.copy(), 4),

                    setStackSize(ScrewList.Transcendent_Metal_Screw.copy(), 24),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 32),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 8))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 10),
                    requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 64 * 8),
                    requiredFluid(MoltenList.Molten_Quantium, 144 * 64 * 18),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 64 * 10))
                .itemOutputs(setStackSize(KekzTechList.Insanely_Ultimate_Capacitor_UIV, 1))
                .eut(RECIPE_UMV)
                .duration(150 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Insanely Ultimate Capacitor (UIV)" - 3
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#99")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(3),

                    setStackSize(FrameBoxList.Transcendent_Metal_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.Transcendent_Metal_Screw.copy(), 24),
                    setStackSize(DoublePlateList.Double_Hypogen_Plate.copy(), 64),
                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 4),

                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 64),
                    setStackSize(GTItemList.Field_Generator_UIV.copy(), 2),
                    setStackSize(CircuitList.QPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Living_Crystal_Chip.copy(), 64),

                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),
                    setStackSize(CircuitList.Optical_SMD_Inductor.copy(), 32),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 8))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 2),
                    requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 64 * 2),
                    requiredFluid(MoltenList.Molten_Quantium, 144 * 64 * 2),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 64 * 2))
                .itemOutputs(setStackSize(KekzTechList.Insanely_Ultimate_Capacitor_UIV, 1))
                .eut(RECIPE_UMV)
                .duration(75 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mega Ultimate Capacitor (UMV)" - 1
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#100")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(FrameBoxList.SpaceTime_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.SpaceTime_Screw.copy(), 24),
                    setStackSize(DoublePlateList.Double_Dragonblood_Plate.copy(), 64),
                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 4),

                    setStackSize(BatteryList.Insanely_Ultimate_Battery_Empty.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UMV.copy(), 4),
                    setStackSize(CircuitList.FPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Living_Bio_Chip.copy(), 64),

                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),
                    setStackSize(CircuitList.Optical_SMD_Inductor.copy(), 64),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 64 * 16))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 4),
                    requiredFluid(MoltenList.Molten_Astral_Titanium, 144 * 64 * 4),
                    requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 64 * 4),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 64 * 4))
                .itemOutputs(setStackSize(KekzTechList.Mega_Ultimate_Capacitor_UMV, 1))
                .eut(RECIPE_UIV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mega Ultimate Capacitor (UMV)" - 2
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#101")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 32),
                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 4),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 512),
                    setStackSize(CircuitList.FPIC_Wafer.copy(), 64 * 6),

                    setStackSize(CircuitList.Living_Bio_Chip.copy(), 64 * 3),
                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64 * 9),
                    setStackSize(CircuitList.Optical_SMD_Inductor.copy(), 64 * 5),
                    setStackSize(DoublePlateList.Double_Dragonblood_Plate.copy(), 64),

                    setStackSize(DoublePlateList.Double_Hypogen_Plate.copy(), 64 * 8),
                    setStackSize(FrameBoxList.SpaceTime_Frame_Box.copy(), 4),
                    setStackSize(GTItemList.Field_Generator_UIV.copy(), 16),
                    setStackSize(GTItemList.Field_Generator_UMV.copy(), 4),

                    setStackSize(ScrewList.SpaceTime_Screw.copy(), 24),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 64),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 64 * 16))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 20),
                    requiredFluid(MoltenList.Molten_Astral_Titanium, 144 * 64 * 12),
                    requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 64 * 20),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 64 * 20))
                .itemOutputs(setStackSize(KekzTechList.Mega_Ultimate_Capacitor_UMV, 1))
                .eut(RECIPE_UMV)
                .duration(150 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mega Ultimate Capacitor (UMV)" - 3
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#102")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(3),

                    setStackSize(FrameBoxList.SpaceTime_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.SpaceTime_Screw.copy(), 24),
                    setStackSize(DoublePlateList.Double_Dragonblood_Plate.copy(), 64),
                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 4),

                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 128),
                    setStackSize(GTItemList.Field_Generator_UMV.copy(), 2),
                    setStackSize(CircuitList.FPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Living_Bio_Chip.copy(), 64),

                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),
                    setStackSize(CircuitList.Optical_SMD_Inductor.copy(), 64),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 64 * 64))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 4),
                    requiredFluid(MoltenList.Molten_Astral_Titanium, 144 * 64 * 4),
                    requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 64 * 4),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 64 * 4))
                .itemOutputs(setStackSize(KekzTechList.Mega_Ultimate_Capacitor_UMV, 1))
                .eut(RECIPE_UMV)
                .duration(75 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Laser Vacuum Mirror"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#103")
            .itemInputsUnsafe(
                setStackSize(TecTechList.High_Power_Casing.copy(), 1),
                setStackSize(GTBlockList.Laser_Vacuum_Pipe.copy(), 4),
                setStackSize(DensePlateList.Dense_Chromatic_Glass_Plate.copy(), 1),
                setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 2),

                getMaterialInput(OrePrefixes.circuit, Materials.UHV, 1))
            .fluidInputs(requiredFluid(FluidList.pH_Neutralized_Water_Grade_4, 1000 * 4))
            .itemOutputs(setStackSize(GTBlockList.Laser_Vacuum_Mirror, 1))
            .eut(RECIPE_UHV)
            .duration(10 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Magnetic Anchor Casing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#104")
            .itemInputsUnsafe(
                setStackSize(GoodGeneratorList.Magnetic_Flux_Casing.copy(), 16),
                setStackSize(MultiMachineCasingList.Transcendentally_Amplified_Magnetic_Confinement_Casing.copy(), 16),
                setStackSize(GTItemList.Field_Generator_UMV.copy(), 1),
                setStackSize(SuperdensePlateList.Superdense_Magmatter_Plate.copy(), 1),
                setStackSize(WireList.Superconductor_UMV_Wire_8x.copy(), 8),
                setStackSize(DensePlateList.Dense_Shirabon_Plate.copy(), 64))
            .fluidInputs(
                requiredFluid(FluidList.Spatially_Enlarged_Fluid, 144 * 64),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64),
                requiredFluid(MoltenList.Molten_Magnetohydrodynamically_Constrained_Star_Matter, 16))
            .itemOutputs(setStackSize(MultiMachineCasingList.Magnetic_Anchor_Casing.copy(), 4))
            .eut(RECIPE_UMV)
            .duration(20 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Molecular Coil"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#105")
            .itemInputsUnsafe(
                setStackSize(TecTechList.Hollow_Casing.copy(), 1),
                setStackSize(MultiMachineCasingList.Fusion_Coil_Block.copy(), 2),
                setStackSize(MultiMachineCasingList.Naquadah_Alloy_Coil_Block.copy(), 2),
                setStackSize(FineWireList.Fine_Europium_Wire.copy(), 64),

                setStackSize(FoilList.Europium_Foil.copy(), 64))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Glass_GregTech, 144 * 16),
                requiredFluid(MoltenList.Molten_Silicone_Rubber, 144 * 13),
                requiredFluid(FluidList.IC2_Coolant, 1000 * 2),
                requiredFluid(MoltenList.Molten_Trinium, 144 * 8))
            .itemOutputs(setStackSize(TecTechList.Molecular_Coil.copy(), 4))
            .eut(RECIPE_UV)
            .duration(25 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Nanochip Assembly Complex
        {
            // "Nanochip Computational Matrix Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#106")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineCasingList.Nanochip_Mesh_Interface_Casing.copy(), 4),
                    setStackSize(HatchList.Computer_Rack.copy(), 1),
                    setStackSize(Appliedenergistics2List.ME_Storage_Component_16384k.copy(), 1),
                    setStackSize(AE2FluidCraftingList.ME_Fluid_Storage_Component_16384k.copy(), 1),

                    setStackSize(OpenComputersList.Server_Tier4.copy(), 1),
                    setStackSize(CircuitList.Optically_Perfected_CPU.copy(), 2),
                    setStackSize(CircuitList.Optically_Compatible_Memory.copy(), 2),
                    setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 16))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 16),
                    requiredFluid(FluidList.Xenoxene, 144 * 16),
                    requiredFluid(MoltenList.Molten_Purified_Tengam, 144 * 16))
                .itemOutputs(setStackSize(MultiMachineCasingList.Nanochip_Computational_Matrix_Casing.copy(), 4))
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Nanochip Firewall Projection Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#107")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineCasingList.Nanochip_Reinforcement_Casing.copy(), 1),
                    setStackSize(MachineList.Monster_Repellator_UV.copy(), 4),
                    setStackSize(SuperdensePlateList.Superdense_Superconductor_Base_UHV_Plate.copy(), 2),
                    setStackSize(SuperdensePlateList.Superdense_Attuned_Tengam_Plate.copy(), 8),

                    setStackSize(GTItemList.Emitter_UEV.copy(), 2),
                    setStackSize(GTItemList.Sensor_UEV.copy(), 2),
                    setStackSize(SingularityList.Nether_Star_Singularity.copy(), 1),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 1))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 2),
                    requiredFluid(GasList.Oganesson, 1000 * 16),
                    requiredFluid(MoltenList.Molten_Superconductor_Base_UEV, 144 * 16),
                    requiredFluid(MoltenList.Molten_Radox_Polymer, 144 * 4))
                .itemOutputs(setStackSize(MultiMachineCasingList.Nanochip_Firewall_Projection_Casing, 1))
                .eut(RECIPE_UEV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Naquadah Fuel Refinery"
        {
            // "Advanced Field Restriction Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#108")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box.copy(), 1),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UHV.copy(), 8),
                    setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 64 * 4),

                    setStackSize(DensePlateList.Dense_Infinity_Plate.copy(), 8),
                    setStackSize(PipeList.Neutronium_Fluid_Pipe.copy(), 16),
                    setStackSize(CircuitList.PPIC_Wafer.copy(), 48),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 1))
                .fluidInputs(
                    requiredFluid(PlasmaList.Radon_Plasma, 1000),
                    requiredFluid(MoltenList.Molten_Awakened_Draconium, 144 * 64),
                    requiredFluid(FluidList.Lubricant, 1000 * 128))
                .itemOutputs(setStackSize(GoodGeneratorList.Advanced_Field_Restriction_Coil, 1))
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Field Restriction Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#109")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Osmium_Frame_Box.copy(), 1),
                    setStackSize(GTItemList.Field_Generator_UV.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UV.copy(), 8),
                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 64 * 2),

                    setStackSize(DensePlateList.Dense_Americium_Plate.copy(), 8),
                    setStackSize(PipeList.Black_Plutonium_Item_Pipe.copy(), 16),
                    setStackSize(CircuitList.PPIC_Wafer.copy(), 32),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 8))
                .fluidInputs(
                    requiredFluid(GasList.Krypton, 1000),
                    requiredFluid(MoltenList.Molten_Fluxed_Electrum, 144 * 64),
                    requiredFluid(FluidList.Lubricant, 1000 * 128))
                .itemOutputs(setStackSize(GoodGeneratorList.Field_Restriction_Coil, 1))
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Naquadah Fuel Refinery Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#110")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Thulium_Frame_Box.copy(), 1),
                    setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 6),
                    setStackSize(GTItemList.Field_Generator_IV.copy(), 2),
                    setStackSize(PipeList.Tiny_Naquadah_Fluid_Pipe.copy(), 16),

                    setStackSize(FineWireList.Fine_Naquadah_Alloy_Wire.copy(), 64),
                    setStackSize(FineWireList.Fine_Manyullyn_Wire.copy(), 64),
                    setStackSize(PlateList.Orundum_Plate.copy(), 4))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Tungstensteel, 144 * 8),
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 16))
                .itemOutputs(setStackSize(GTNHLanthanidesList.Focus_Manipulator, 1))
                .eut(RECIPE_ZPM)
                .duration(25 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Temporal Field Restriction Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#111")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.SpaceTime_Frame_Box.copy(), 1),
                    setStackSize(GTItemList.Field_Generator_UIV.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 8),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 8),

                    setStackSize(DensePlateList.Dense_SpaceTime_Plate.copy(), 8),
                    setStackSize(PipeList.SpaceTime_Fluid_Pipe.copy(), 16),
                    setStackSize(CircuitList.PPIC_Wafer.copy(), 64),
                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Metastable_Oganesson, 1000),
                    requiredFluid(MoltenList.Molten_Transcendent_Metal, 144 * 64),
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 64))
                .itemOutputs(setStackSize(GoodGeneratorList.Temporal_Field_Restriction_Coil, 1))
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Ultimate Field Restriction Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#112")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 1),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UEV.copy(), 8),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 8),

                    setStackSize(DensePlateList.Dense_Transcendent_Metal_Plate.copy(), 8),
                    setStackSize(PipeList.Infinity_Fluid_Pipe.copy(), 16),
                    setStackSize(CircuitList.PPIC_Wafer.copy(), 64),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 1))
                .fluidInputs(
                    requiredFluid(GasList.Oganesson, 1000),
                    requiredFluid(MoltenList.Molten_Neutronium, 144 * 64),
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 64))
                .itemOutputs(setStackSize(GoodGeneratorList.Ultimate_Field_Restriction_Coil, 1))
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Particle Beam Guidance Pipe Casing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#113")
            .itemInputsUnsafe(
                setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box.copy(), 16),
                setStackSize(FrameBoxList.Naquadria_Frame_Box.copy(), 16),
                setStackSize(FrameBoxList.Naquadah_Alloy_Frame_Box.copy(), 16),
                setStackSize(FrameBoxList.Bedrockium_Frame_Box.copy(), 16),

                setStackSize(FoilList.Infinity_Foil.copy(), 64),
                setStackSize(FoilList.Cosmic_Neutronium_Foil.copy(), 64),
                setStackSize(FoilList.Superconductor_Base_UHV_Foil.copy(), 64),
                setStackSize(FoilList.Draconium_Foil.copy(), 64),

                setStackSize(GTItemList.Electric_Pump_UEV.copy(), 1),
                getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),
                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 2),
                setStackSize(PipeList.Quadruple_Infinity_Fluid_Pipe.copy(), 16))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Infinity, 144 * 32),
                requiredFluid(MoltenList.Molten_Tritanium, 144 * 32),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 32),
                requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Resplendent_Catalyst, 1000 * 4))
            .itemOutputs(setStackSize(MultiMachineCasingList.Particle_Beam_Guidance_Pipe_Casing.copy(), 4))
            .eut(RECIPE_UIV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Precision Field Sync Casing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#114")
            .itemInputsUnsafe(
                setStackSize(GoodGeneratorList.Gravity_Stabilization_Casing.copy(), 16),
                setStackSize(GoodGeneratorList.Temporal_Field_Restriction_Coil.copy(), 2),
                setStackSize(TecTechList.Crude_Stabilisation_Field_Generator.copy(), 1),
                setStackSize(FrameBoxList.White_Dwarf_Matter_Frame_Box.copy(), 1),

                setStackSize(GTItemList.Field_Generator_UMV.copy(), 1),
                setStackSize(FineWireList.Fine_Magmatter_Wire.copy(), 64),
                setStackSize(FineWireList.Fine_Superconductor_Base_UMV_Wire.copy(), 64),
                setStackSize(FineWireList.Fine_Shirabon_Wire.copy(), 64),

                setStackSize(SuperdensePlateList.Superdense_Flerovium_Plate.copy(), 16))
            .fluidInputs(
                requiredFluid(PlasmaList.Chromatic_Glass_Plasma, 144 * 64),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64),
                requiredFluid(MoltenList.Molten_Eternity, 144 * 64))
            .itemOutputs(setStackSize(MultiMachineCasingList.Precision_Field_Sync_Casing.copy(), 8))
            .eut(RECIPE_UMV)
            .duration(10 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Protomatter Activation Coil"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#115")
            .itemInputsUnsafe(
                setStackSize(GoodGeneratorList.Ultimate_Field_Restriction_Coil.copy(), 1),
                setStackSize(GTItemList.Electric_Pump_UIV.copy(), 2),
                setStackSize(WireList.Superconductor_UIV_Wire_16x.copy(), 8),
                setStackSize(SuperdensePlateList.Superdense_Infinity_Plate.copy(), 1),
                setStackSize(RotorList.Proto_Halkonite_Steel_Rotor.copy(), 4),
                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 1),
                setStackSize(GTItemList.Field_Generator_UEV.copy(), 4))
            .fluidInputs(
                requiredFluid(FluidList.Protomatter, 100),
                requiredFluid(MoltenList.Molten_Transcendent_Metal, 144 * 16),
                requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000))
            .itemOutputs(setStackSize(GoodGeneratorList.Protomatter_Activation_Coil.copy(), 4))
            .eut(RECIPE_UIV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Primary Exo-Foundry Casing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#116")
            .itemInputsUnsafe(
                setStackSize(FrameBoxList.Netherite_Frame_Box.copy(), 1),
                setStackSize(CircuitList.Optically_Perfected_CPU.copy(), 8),
                setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 8),
                setStackSize(ScrewList.Infinity_Screw.copy(), 6),

                setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 8))
            .fluidInputs(
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 4),
                requiredFluid(GasList.Oganesson, 500),
                requiredFluid(MoltenList.Molten_Cosmic_Neutronium, 144 * 2))
            .itemOutputs(setStackSize(MultiMachineCasingList.Primary_Exo_Foundry_Casing, 1))
            .eut(RECIPE_UEV)
            .duration(15 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Quantum Force Transformer"
        {
            // "Neutron Pulse Manipulator"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#117")
                .itemInputsUnsafe(
                    setStackSize(GTPPList.Force_Field_Glass.copy(), 1),
                    setStackSize(GTItemList.Carbon_Nanites.copy(), 4),
                    setStackSize(GTItemList.Emitter_UV.copy(), 4),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 2),

                    setStackSize(GTPPList.Quantum_Anomaly.copy(), 1),
                    setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 2))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Thulium, 144 * 10),
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Crude_Catalyst, 1000 * 5),
                    requiredFluid(PlasmaList.Neptunium_Plasma, 500),
                    requiredFluid(PlasmaList.Fermium_Plasma, 500))
                .itemOutputs(setStackSize(GTPPList.Neutron_Pulse_Manipulator, 1))
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Neutron Shielding Core"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#118")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Quantum_Frame_Box.copy(), 1),
                    setStackSize(DensePlateList.Dense_Precious_Metals_Alloy_Plate.copy(), 4),
                    setStackSize(SuperdensePlateList.Superdense_Netherite_Plate.copy(), 2),
                    setStackSize(GTItemList.Field_Generator_UV.copy(), 1),

                    setStackSize(ScrewList.Chromatic_Glass_Screw.copy(), 16))
                .fluidInputs(requiredFluid(FluidList.Mutated_Living_Solder, 144 * 10))
                .itemOutputs(setStackSize(GTPPList.Neutron_Shielding_Core, 1))
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Cosmic Fabric Manipulator"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#119")
                .itemInputsUnsafe(
                    setStackSize(GTPPList.Force_Field_Glass.copy(), 2),
                    setStackSize(GTItemList.Carbon_Nanites.copy(), 8),
                    setStackSize(GTItemList.Emitter_UEV.copy(), 4),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 2),

                    setStackSize(GTPPList.Quantum_Anomaly.copy(), 1),
                    setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 4),
                    setStackSize(GTItemList.Hyper_Stable_Self_Healing_Adhesive.copy(), 4))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Thulium, 144 * 12),
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Prosaic_Catalyst, 1000 * 5),
                    requiredFluid(PlasmaList.Neptunium_Plasma, 2500),
                    requiredFluid(PlasmaList.Fermium_Plasma, 2500))
                .itemOutputs(setStackSize(GTPPList.Cosmic_Fabric_Manipulator, 1))
                .eut(RECIPE_UIV)
                .duration(75 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Cosmic Fabric Shielding Core"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#120")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Quantum_Frame_Box.copy(), 2),
                    setStackSize(DensePlateList.Dense_Enriched_Naquadah_Alloy_Plate.copy(), 4),
                    setStackSize(SuperdensePlateList.Superdense_Infinity_Plate.copy(), 2),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 1),

                    setStackSize(ScrewList.Radox_Polymer_Screw.copy(), 16),
                    setStackSize(GTItemList.Hyper_Stable_Self_Healing_Adhesive.copy(), 4))
                .fluidInputs(requiredFluid(FluidList.Mutated_Living_Solder, 144 * 20))
                .itemOutputs(setStackSize(GTPPList.Cosmic_Fabric_Shielding_Core, 1))
                .eut(RECIPE_UIV)
                .duration(75 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Infinity Infused Manipulator"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#121")
                .itemInputsUnsafe(
                    setStackSize(GTPPList.Force_Field_Glass.copy(), 4),
                    setStackSize(GTItemList.Carbon_Nanites.copy(), 16),
                    setStackSize(GTItemList.Emitter_UIV.copy(), 4),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 2),

                    setStackSize(GTPPList.Quantum_Anomaly.copy(), 1),
                    setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 8),
                    setStackSize(GTItemList.Superconductor_Rare_Earth_Composite.copy(), 4))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Thulium, 144 * 15),
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Resplendent_Catalyst, 1000 * 5),
                    requiredFluid(PlasmaList.Neptunium_Plasma, 1000 * 10),
                    requiredFluid(PlasmaList.Fermium_Plasma, 1000 * 10))
                .itemOutputs(setStackSize(GTPPList.Infinity_Infused_Manipulator, 1))
                .eut(RECIPE_UMV)
                .duration(90 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Infinity Infused Shielding Core"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#122")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Quantum_Frame_Box.copy(), 4),
                    setStackSize(DensePlateList.Dense_Hypogen_Plate.copy(), 4),
                    setStackSize(SuperdensePlateList.Superdense_Proto_Halkonite_Steel_Plate.copy(), 2),
                    setStackSize(GTItemList.Field_Generator_UIV.copy(), 1),

                    setStackSize(ScrewList.Metastable_Oganesson_Screw.copy(), 16),
                    setStackSize(GTItemList.Superconductor_Rare_Earth_Composite.copy(), 4))
                .fluidInputs(requiredFluid(FluidList.Mutated_Living_Solder, 144 * 40))
                .itemOutputs(setStackSize(GTPPList.Infinity_Infused_Shielding_Core, 1))
                .eut(RECIPE_UMV)
                .duration(90 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "SpaceTime Continuum Ripper"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#123")
                .itemInputsUnsafe(
                    setStackSize(GTPPList.Force_Field_Glass.copy(), 8),
                    setStackSize(GTItemList.Carbon_Nanites.copy(), 32),
                    setStackSize(GTItemList.Emitter_UMV.copy(), 4),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 64 * 2),

                    setStackSize(GTPPList.Quantum_Anomaly.copy(), 1),
                    setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 16),
                    setStackSize(GTItemList.Black_Body_Naquadria_Supersolid.copy(), 4))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Thulium, 144 * 20),
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 1000 * 5),
                    requiredFluid(PlasmaList.Neptunium_Plasma, 1000 * 20),
                    requiredFluid(PlasmaList.Fermium_Plasma, 1000 * 20))
                .itemOutputs(setStackSize(GTPPList.SpaceTime_Continuum_Ripper, 1))
                .eut(RECIPE_UXV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "SpaceTime Bending Core"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#124")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Quantum_Frame_Box.copy(), 4),
                    setStackSize(DensePlateList.Dense_Shirabon_Plate.copy(), 4),
                    setStackSize(SuperdensePlateList.Superdense_SpaceTime_Plate.copy(), 2),
                    setStackSize(GTItemList.Field_Generator_UMV.copy(), 1),

                    setStackSize(ScrewList.Dilithium_Screw.copy(), 16),
                    setStackSize(GTItemList.Black_Body_Naquadria_Supersolid.copy(), 4))
                .fluidInputs(requiredFluid(FluidList.Mutated_Living_Solder, 144 * 80))
                .itemOutputs(setStackSize(GTPPList.SpaceTime_Bending_Core, 1))
                .eut(RECIPE_UXV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Quark Exclusion Casing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#125")
            .itemInputsUnsafe(
                setStackSize(FrameBoxList.Superconductor_Base_UHV_Frame_Box.copy(), 32),
                setStackSize(FrameBoxList.Ledox_Frame_Box.copy(), 32),
                setStackSize(FrameBoxList.Callisto_Ice_Frame_Box.copy(), 32),
                setStackSize(FrameBoxList.Enriched_Holmium_Frame_Box.copy(), 32),

                setStackSize(PlateList.Superconductor_Base_UHV_Plate.copy(), 32),
                setStackSize(PlateList.Ledox_Plate.copy(), 32),
                setStackSize(PlateList.Callisto_Ice_Plate.copy(), 32),
                setStackSize(PlateList.Enriched_Holmium_Plate.copy(), 32),

                setStackSize(GTItemList.Field_Generator_UHV.copy(), 1),
                getMaterialInput(OrePrefixes.circuit, Materials.UEV, 8),
                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 4),
                setStackSize(PipeList.Infinity_Fluid_Pipe.copy(), 32))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Superconductor_Base_UHV, 144 * 64),
                requiredFluid(MoltenList.Molten_Ledox, 144 * 64),
                requiredFluid(MoltenList.Molten_Callisto_Ice, 144 * 64),
                requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Resplendent_Catalyst, 1000 * 8))
            .itemOutputs(setStackSize(MultiMachineCasingList.Quark_Exclusion_Casing.copy(), 8))
            .eut(RECIPE_UIV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Rocket Engine Base"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#126")
            .itemInputsUnsafe(
                setStackSize(GTNHIntergalacticList.Ultra_High_Temperature_Resistant_Mesh.copy(), 64),
                setStackSize(GTBlockList.Quantum_Tank_IV.copy(), 2),
                setStackSize(GTItemList.Electric_Pump_UHV.copy(), 4),
                getMaterialInput(OrePrefixes.circuit, Materials.UHV, 2),

                setStackSize(AmunRaList.Nanite_Cluster.copy(), 1))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Infinity, 144 * 50),
                requiredFluid(FluidList.Super_Coolant, 1000 * 64),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64))
            .itemOutputs(setStackSize(AmunRaList.Rocket_Engine_Base, 1))
            .eut(RECIPE_UHV)
            .duration(50 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Rocket Engine Jet"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#127")
            .itemInputsUnsafe(
                setStackSize(GTNHIntergalacticList.Ultra_High_Temperature_Resistant_Mesh.copy(), 64 * 4),
                setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4.copy(), 64),
                setStackSize(PipeList.Huge_Infinity_Fluid_Pipe.copy(), 8),
                setStackSize(GTItemList.Electric_Pump_UHV.copy(), 16),

                getMaterialInput(OrePrefixes.circuit, Materials.UHV, 8),
                setStackSize(AmunRaList.Nanite_Cluster.copy(), 4))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Infinity, 144 * 50),
                requiredFluid(FluidList.Super_Coolant, 1000 * 64),
                requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64))
            .itemOutputs(setStackSize(AmunRaList.Rocket_Engine_Jet, 1))
            .eut(RECIPE_UHV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Solenoid Superconductor Coil
        {
            // "LuV Solenoid Superconductor Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#128")
                .itemInputsUnsafe(
                    setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 16),
                    setStackSize(CableList.HSSG_Cable_4x.copy(), 2),
                    setStackSize(PipeList.Niobium_Titanium_Fluid_Pipe.copy(), 1),
                    setStackSize(LongRodList.Long_Mu_metal_Rod.copy(), 8),

                    setStackSize(DoublePlateList.Double_HSSS_Plate.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_LuV.copy(), 1))
                .fluidInputs(requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 4))
                .itemOutputs(setStackSize(MultiMachineCasingList.LuV_Solenoid_Superconductor_Coil, 1))
                .eut(RECIPE_LuV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "ZPM Solenoid Superconductor Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#129")
                .itemInputsUnsafe(
                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 16),
                    setStackSize(CableList.Naquadah_Cable_4x.copy(), 2),
                    setStackSize(PipeList.Enderium_Fluid_Pipe.copy(), 1),
                    setStackSize(LongRodList.Long_Mu_metal_Rod.copy(), 8),

                    setStackSize(DoublePlateList.Double_Naquadah_Alloy_Plate.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 1))
                .fluidInputs(requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 4))
                .itemOutputs(setStackSize(MultiMachineCasingList.ZPM_Solenoid_Superconductor_Coil, 1))
                .eut(RECIPE_ZPM)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UV Solenoid Superconductor Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#130")
                .itemInputsUnsafe(
                    setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 32),
                    setStackSize(CableList.Fluxed_Electrum_Cable_4x.copy(), 2),
                    setStackSize(PipeList.Naquadah_Fluid_Pipe.copy(), 1),
                    setStackSize(LongRodList.Long_Naquadria_Rod.copy(), 8),

                    setStackSize(DoublePlateList.Double_Neutronium_Plate.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UV.copy(), 1))
                .fluidInputs(
                    requiredFluid(FluidList.Super_Coolant, 1000 * 16),
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 16))
                .itemOutputs(setStackSize(MultiMachineCasingList.UV_Solenoid_Superconductor_Coil, 1))
                .eut(RECIPE_UV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UHV Solenoid Superconductor Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#131")
                .itemInputsUnsafe(
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 32),
                    setStackSize(CableList.Bedrockium_Cable_4x.copy(), 2),
                    setStackSize(PipeList.Neutronium_Fluid_Pipe.copy(), 1),
                    setStackSize(LongRodList.Long_Naquadria_Rod.copy(), 8),

                    setStackSize(DoublePlateList.Double_Cosmic_Neutronium_Plate.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UHV.copy(), 1))
                .fluidInputs(
                    requiredFluid(FluidList.Super_Coolant, 1000 * 64),
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 64))
                .itemOutputs(setStackSize(MultiMachineCasingList.UHV_Solenoid_Superconductor_Coil, 1))
                .eut(RECIPE_UHV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UEV Solenoid Superconductor Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#132")
                .itemInputsUnsafe(
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 32),
                    setStackSize(CableList.Draconium_Cable_4x.copy(), 2),
                    setStackSize(PipeList.Nether_Star_Fluid_Pipe.copy(), 1),
                    setStackSize(LongRodList.Long_Metastable_Oganesson_Rod.copy(), 8),

                    setStackSize(DoublePlateList.Double_Infinity_Plate.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UEV.copy(), 1))
                .fluidInputs(
                    requiredFluid(FluidList.Super_Coolant, 1000 * 64 * 4),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 8))
                .itemOutputs(setStackSize(MultiMachineCasingList.UEV_Solenoid_Superconductor_Coil, 1))
                .eut(RECIPE_UEV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UIV Solenoid Superconductor Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#133")
                .itemInputsUnsafe(
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 32),
                    setStackSize(CableList.Nether_Star_Cable_4x.copy(), 2),
                    setStackSize(PipeList.Awakened_Draconium_Fluid_Pipe.copy(), 1),
                    setStackSize(LongRodList.Long_Metastable_Oganesson_Rod.copy(), 8),

                    setStackSize(DoublePlateList.Double_Transcendent_Metal_Plate.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Transcendent_Metal, 144 * 32),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 32))
                .itemOutputs(setStackSize(MultiMachineCasingList.UIV_Solenoid_Superconductor_Coil, 1))
                .eut(RECIPE_UIV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UMV Solenoid Superconductor Coil"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#134")
                .itemInputsUnsafe(
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 32),
                    setStackSize(CableList.Quantium_Cable_4x.copy(), 2),
                    setStackSize(PipeList.Infinity_Fluid_Pipe.copy(), 1),
                    setStackSize(LongRodList.Long_Infinity_Rod.copy(), 8),

                    setStackSize(DoublePlateList.Double_SpaceTime_Plate.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UMV.copy(), 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_SpaceTime, 144 * 16),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 2))
                .itemOutputs(setStackSize(MultiMachineCasingList.UMV_Solenoid_Superconductor_Coil, 1))
                .eut(RECIPE_UMV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Space Elevator
        {
            // "Space Elevator Base Casing"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#135")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 8),
                    setStackSize(ScrewList.Palladium_Screw.copy(), 32),
                    setStackSize(PlateList.Osmiridium_Plate.copy(), 64),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),

                    setStackSize(GTItemList.Electric_Piston_UV.copy(), 2),
                    setStackSize(RingList.Cosmic_Neutronium_Ring.copy(), 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 40),
                    requiredFluid(FluidList.UU_Matter, 1000 * 2),
                    requiredFluid(MoltenList.Molten_Iridium, 144 * 8))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 8))
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Elevator Support Structure"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#136")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 8),
                    setStackSize(BoltList.Naquadria_Bolt.copy(), 16),
                    setStackSize(LongRodList.Long_Neutronium_Rod.copy(), 8),
                    setStackSize(DoublePlateList.Double_Osmiridium_Plate.copy(), 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 40),
                    requiredFluid(FluidList.UU_Matter, 1000),
                    requiredFluid(MoltenList.Molten_Iridium, 144 * 10))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Space_Elevator_Support_Structure.copy(), 8))
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Elevator Internal Structure"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#137")
                .itemInputsUnsafe(
                    setStackSize(TecTechList.High_Power_Casing.copy(), 8),
                    setStackSize(BoltList.Palladium_Bolt.copy(), 16),
                    setStackSize(DoublePlateList.Double_Neutronium_Plate.copy(), 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 40),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8),
                    requiredFluid(FluidList.Wet_Concrete, 144 * 10))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Space_Elevator_Support_Structure.copy(), 8))
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Elevator Motor MK-I"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#138")
                .itemInputsUnsafe(
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 1),
                    setStackSize(GTItemList.Electric_Motor_UV.copy(), 4),
                    setStackSize(RingList.Neutronium_Ring.copy(), 8),
                    setStackSize(RodList.Neutronium_Rod.copy(), 4),

                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 1),
                    setStackSize(ScrewList.Cosmic_Neutronium_Screw.copy(), 16),
                    setStackSize(PlateList.Osmiridium_Plate.copy(), 16))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 40),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8),
                    requiredFluid(MoltenList.Molten_Naquadria, 144 * 10),
                    requiredFluid(FluidList.Lubricant, 1000 * 16))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Space_Elevator_Motor_MKI, 1))
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Elevator Motor MK-II"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#139")
                .itemInputsUnsafe(
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 1),
                    setStackSize(GTItemList.Electric_Motor_UHV.copy(), 4),
                    setStackSize(RingList.Cosmic_Neutronium_Ring.copy(), 8),
                    setStackSize(RodList.Cosmic_Neutronium_Rod.copy(), 4),

                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 1),
                    setStackSize(ScrewList.Infinity_Screw.copy(), 16),
                    setStackSize(PlateList.Osmiridium_Plate.copy(), 16))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 40),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8),
                    requiredFluid(MoltenList.Molten_Naquadria, 144 * 10),
                    requiredFluid(FluidList.Lubricant, 1000 * 16))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Space_Elevator_Motor_MKII, 1))
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Elevator Motor MK-III"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#140")
                .itemInputsUnsafe(
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 1),
                    setStackSize(GTItemList.Electric_Motor_UEV.copy(), 4),
                    setStackSize(RingList.Infinity_Ring.copy(), 8),
                    setStackSize(RodList.Infinity_Rod.copy(), 4),

                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 1),
                    setStackSize(ScrewList.Transcendent_Metal_Screw.copy(), 16),
                    setStackSize(PlateList.Osmiridium_Plate.copy(), 16))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 20),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8),
                    requiredFluid(MoltenList.Molten_Naquadria, 144 * 10),
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 24))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Space_Elevator_Motor_MKIII, 1))
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Elevator Motor MK-IV"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#141")
                .itemInputsUnsafe(
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 1),
                    setStackSize(GTItemList.Electric_Motor_UIV.copy(), 4),
                    setStackSize(RingList.Transcendent_Metal_Ring.copy(), 8),
                    setStackSize(RodList.Transcendent_Metal_Rod.copy(), 4),

                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 1),
                    setStackSize(ScrewList.SpaceTime_Screw.copy(), 16),
                    setStackSize(PlateList.Osmiridium_Plate.copy(), 16))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 20),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8),
                    requiredFluid(MoltenList.Molten_Naquadria, 144 * 10),
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 24))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Space_Elevator_Motor_MKIV, 1))
                .eut(RECIPE_UIV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Elevator Motor MK-V"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#142")
                .itemInputsUnsafe(
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 1),
                    setStackSize(GTItemList.Electric_Motor_UMV.copy(), 4),
                    setStackSize(RingList.SpaceTime_Ring.copy(), 8),
                    setStackSize(RodList.SpaceTime_Rod.copy(), 4),

                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 1),
                    setStackSize(ScrewList.Universium_Screw.copy(), 16),
                    setStackSize(PlateList.Osmiridium_Plate.copy(), 16))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 20),
                    requiredFluid(FluidList.UU_Matter, 1000 * 8),
                    requiredFluid(MoltenList.Molten_Naquadria, 144 * 10),
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 24))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Space_Elevator_Motor_MKV, 1))
                .eut(RECIPE_UMV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Super Stock Replenisher"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#143")
            .itemInputsUnsafe(
                setStackSize(HatchList.Stocking_Input_Bus_ME.copy(), 1),
                setStackSize(HatchList.Stocking_Input_Hatch_ME.copy(), 1),
                setStackSize(Appliedenergistics2List.ME_Controller.copy(), 1),
                setStackSize(Appliedenergistics2List.ME_Chest.copy(), 1),

                setStackSize(Appliedenergistics2List.Capacity_Card.copy(), 4),
                setStackSize(Appliedenergistics2List.Hyper_Acceleration_Card.copy(), 4))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Naquadria, 144 * 8),
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 8),
                requiredFluid(FluidList.Lubricant, 2000))
            .itemOutputs(setStackSize(AE2FluidCraftingList.Super_Stock_Replenisher, 1))
            .eut(RECIPE_UV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Target Receptacle"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#144")
            .itemInputsUnsafe(
                setStackSize(FrameBoxList.Aluminium_Frame_Box.copy(), 1),
                getMaterialInput(OrePrefixes.circuit, Materials.IV, 4),
                setStackSize(GTItemList.Robot_Arm_LuV.copy(), 4),
                setStackSize(FineWireList.Fine_Gold_Wire.copy(), 16),

                setStackSize(WireList.Tungsten_Wire_1x.copy(), 2))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Soldering_Alloy, 144 * 64),
                requiredFluid(MoltenList.Molten_Gold_GregTech, 144 * 16),
                requiredFluid(GasList.Argon, 1000))
            .itemOutputs(setStackSize(GTNHLanthanidesList.Focus_Manipulator, 1))
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // TFFT Storage Field Block
        {
            // "TFFT Storage Field Block (Tier VI)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#145")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineCasingList.Hermetic_Casing_VII.copy(), 4),
                    setStackSize(QuadruplePlateList.Quadruple_Crystalline_Pink_Slime_Plate.copy(), 6),
                    setStackSize(PipeList.Nonuple_Naquadah_Fluid_Pipe.copy(), 3),
                    setStackSize(NewHorizonsCoreModList.Chrome_Bars.copy(), 6),

                    setStackSize(RotorList.Quantium_Rotor.copy(), 6),
                    setStackSize(GTItemList.Field_Generator_EV.copy(), 8),
                    setStackSize(GTItemList.Fluid_Regulator_LuV.copy(), 1),
                    setStackSize(NewHorizonsCoreModList.Fluid_Processor_Tier_II.copy(), 4))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Enderium_GregTech, 144 * 10),
                    requiredFluid(MoltenList.Molten_Polybenzimidazole_PBI, 144 * 11))
                .itemOutputs(setStackSize(KekzTechList.TFFT_Storage_Field_Block_TierVI, 1))
                .eut(RECIPE_LuV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "TFFT Storage Field Block (Tier VII)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#146")
                .itemInputsUnsafe(
                    setStackSize(MultiMachineCasingList.Hermetic_Casing_X.copy(), 16),
                    setStackSize(QuadruplePlateList.Quadruple_Melodic_Alloy_Plate.copy(), 6),
                    setStackSize(PipeList.Nonuple_Nether_Star_Fluid_Pipe.copy(), 3),
                    setStackSize(NewHorizonsCoreModList.Osmium_Bars.copy(), 6),

                    setStackSize(RotorList.Mysterious_Crystal_Rotor.copy(), 6),
                    setStackSize(GTItemList.Field_Generator_IV.copy(), 16),
                    setStackSize(GTItemList.Field_Generator_LuV.copy(), 4),
                    setStackSize(GTItemList.Fluid_Regulator_UV.copy(), 1),

                    setStackSize(NewHorizonsCoreModList.Fluid_Processor_Tier_II.copy(), 16))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Crystalline_Alloy, 144 * 20),
                    requiredFluid(MoltenList.Molten_Polybenzimidazole_PBI, 144 * 14))
                .itemOutputs(setStackSize(KekzTechList.TFFT_Storage_Field_Block_TierVII, 1))
                .eut(RECIPE_UV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "TFFT Storage Field Block (Tier VIII)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#147")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Quantum_Tank_V.copy(), 1),
                    setStackSize(MultiMachineControllerList.Neutronium_Compressor.copy(), 1),
                    setStackSize(DensePlateList.Dense_Stellar_Alloy_Plate.copy(), 12),
                    setStackSize(PipeList.Nonuple_Awakened_Draconium_Fluid_Pipe.copy(), 3),

                    setStackSize(NewHorizonsCoreModList.Neutronium_Bars.copy(), 6),
                    setStackSize(RotorList.Infinity_Catalyst_Rotor.copy(), 6),
                    setStackSize(GTItemList.Field_Generator_ZPM.copy(), 16),
                    setStackSize(GTItemList.Field_Generator_UV.copy(), 4),

                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKIII.copy(), 4),
                    setStackSize(SingularityList.Ender_Singularity.copy(), 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Crystalline_Pink_Slime, 144 * 30),
                    requiredFluid(MoltenList.Molten_Radox_Polymer, 144 * 20))
                .itemOutputs(setStackSize(KekzTechList.TFFT_Storage_Field_Block_TierVIII, 1))
                .eut(RECIPE_UEV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "TFFT Storage Field Block (Tier IX)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#148")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Quantum_Tank_V.copy(), 4),
                    setStackSize(MultiMachineControllerList.Neutronium_Compressor.copy(), 2),
                    setStackSize(DensePlateList.Dense_Transcendent_Metal_Plate.copy(), 6),
                    setStackSize(DensePlateList.Dense_Proto_Halkonite_Steel_Plate.copy(), 6),

                    setStackSize(PipeList.Nonuple_Infinity_Fluid_Pipe.copy(), 3),
                    setStackSize(GTItemList.Energised_Tesseract.copy(), 1),
                    setStackSize(RotorList.Hypogen_Rotor.copy(), 6),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 16),

                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 4),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKIV_Prototype.copy(), 4),
                    setStackSize(SingularityList.Ender_Singularity.copy(), 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Melodic_Alloy, 144 * 40),
                    requiredFluid(MoltenList.Molten_Radox_Polymer, 144 * 24))
                .itemOutputs(setStackSize(KekzTechList.TFFT_Storage_Field_Block_TierIX, 1))
                .eut(RECIPE_UMV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "TFFT Storage Field Block (Tier X)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#149")
                .itemInputsUnsafe(
                    setStackSize(GTBlockList.Quantum_Tank_V.copy(), 16),
                    setStackSize(MultiMachineControllerList.Neutronium_Compressor.copy(), 4),
                    setStackSize(DensePlateList.Dense_SpaceTime_Plate.copy(), 12),
                    setStackSize(PipeList.Nonuple_SpaceTime_Fluid_Pipe.copy(), 3),
                    setStackSize(GTItemList.Energised_Tesseract.copy(), 6),
                    setStackSize(RotorList.SpaceTime_Rotor.copy(), 6),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 16),
                    setStackSize(GTItemList.Field_Generator_UIV.copy(), 4),
                    setStackSize(GoodGeneratorList.Hi_Computation_Station_MKV_Finaltype.copy(), 8),
                    setStackSize(EnderIOList.Stellar_Capacitor.copy(), 64),
                    setStackSize(SingularityList.Eternal_Singularity.copy(), 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Stellar_Alloy, 144 * 50),
                    requiredFluid(MoltenList.Molten_Radox_Polymer, 144 * 32))
                .itemOutputs(setStackSize(KekzTechList.TFFT_Storage_Field_Block_TierX, 1))
                .eut(RECIPE_UXV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Antimatter Containment Casing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_CasingRecipe_Normal#150")
            .itemInputsUnsafe(
                setStackSize(GTBlockList.Non_Photonic_Matter_Exclusion_Glass.copy(), 4),
                setStackSize(LongRodList.Long_Proto_Halkonite_Steel_Rod.copy(), 4),
                setStackSize(LongRodList.Long_Transcendent_Metal_Rod.copy(), 12),
                setStackSize(GTItemList.Emitter_UIV.copy(), 4),
                setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Transcendent_Metal, 144 * 16),
                requiredFluid(MoltenList.Molten_Radox_Polymer, 16))
            .itemOutputs(setStackSize(GoodGeneratorList.Antimatter_Containment_Casing.copy(), 4))
            .eut(RECIPE_UIV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);
    }
}
