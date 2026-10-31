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
import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GTOreDictUnificator;
import gregtech.api.util.GTUtility;

public class ChaosAssemblyLine_CasingRecipe_Normal {

    public static void addChaosAssemblyLine_NormalCasingRecipe() {
        // Antenna Casing
        {
            // "Antenna Casing (T1)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Tungstensteel_Frame_Box.copy(), 1),
                    setStackSize(PlateList.Copper_Plate.copy(), 4),
                    setStackSize(PlateList.Mu_metal_Plate.copy(), 5),
                    setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 16),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),
                    setStackSize(GTItemList.Emitter_LuV.copy(), 6),
                    setStackSize(FineWireList.Fine_Gold_Wire.copy(), 32),
                    setStackSize(DensePlateList.Dense_Electrum_Plate.copy(), 6))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Soldering_Alloy.copy(), 144 * 48),
                    setStackSize(MoltenList.Molten_Gold_GregTech.copy(), 144 * 32),
                    setStackSize(GasList.Xenon.copy(), 1000 * 2))
                .itemOutputs(GTNHLanthanidesList.Antenna_Casing_T1)
                .eut(RECIPE_LuV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Antenna Casing (T2)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Tungstencarbide_Frame_Box.copy(), 1),
                    setStackSize(PlateList.Copper_Plate.copy(), 4),
                    setStackSize(PlateList.Mu_metal_Plate.copy(), 5),
                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 16),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                    setStackSize(GTItemList.Emitter_ZPM.copy(), 6),
                    setStackSize(FineWireList.Fine_Gold_Wire.copy(), 64),
                    setStackSize(DensePlateList.Dense_Electrum_Plate.copy(), 6))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Soldering_Alloy.copy(), 144 * 96),
                    setStackSize(MoltenList.Molten_Gold_GregTech.copy(), 144 * 48),
                    setStackSize(GasList.Xenon.copy(), 1000 * 2))
                .itemOutputs(GTNHLanthanidesList.Antenna_Casing_T2)
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Antimatter Annihilation Matrix"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GoodGeneratorList.Protomatter_Activation_Coil.copy(), 1),
                setStackSize(FoilList.Hypogen_Foil.copy(), 64),
                setStackSize(GTItemList.Emitter_UIV.copy(), 2),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 1),

                setStackSize(FrameBoxList.Proto_Halkonite_Steel_Frame_Box.copy(), 4),
                setStackSize(WireList.Superconductor_UIV_Wire_16x.copy(), 8),
                setStackSize(GTItemList.Sensor_UIV.copy(), 2),
                setStackSize(RotorList.Proto_Halkonite_Steel_Rotor.copy(), 4))
            .fluidInputs(
                setStackSize(FluidList.Semi_Stable_Antimatter.copy(), 4),
                setStackSize(MoltenList.Molten_Hypogen.copy(), 144 * 10),
                setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000))
            .itemOutputs(setStackSize(GoodGeneratorList.Antimatter_Annihilation_Matrix.copy(), 4))
            .eut(RECIPE_UIV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Bose-Einstein Condensate
        {
            // "Coherence-Preserving Plasma Conduit"
            GTValues.RA.stdBuilder()
                .itemInputs(
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
                    setStackSize(MoltenList.Molten_Chromatic_Glass.copy(), 144 * 64 * 6),
                    setStackSize(MoltenList.Molten_Infinity.copy(), 144 * 48),
                    setStackSize(MoltenList.Molten_Celestial_Tungsten.copy(), 144 * 48),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 16))
                .itemOutputs(setStackSize(MultiMachineCasingList.Coherence_Preserving_Plasma_Conduit.copy(), 4))
                .eut(RECIPE_UIV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Electromagnetically-Isolated Casing"
            GTValues.RA.stdBuilder()
                .itemInputs(
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
                    setStackSize(MoltenList.Molten_Chromatic_Glass.copy(), 144 * 64 * 6),
                    setStackSize(MoltenList.Molten_Infinity.copy(), 144 * 48),
                    setStackSize(MoltenList.Molten_Celestial_Tungsten.copy(), 144 * 48),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 32))
                .itemOutputs(setStackSize(MultiMachineCasingList.Electromagnetically_Isolated_Casing.copy(), 4))
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fine-Structure Constant Manipulator"
            GTValues.RA.stdBuilder()
                .itemInputs(
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
                    setStackSize(MoltenList.Molten_Chromatic_Glass.copy(), 144 * 64 * 6),
                    setStackSize(MoltenList.Molten_Infinity.copy(), 144 * 48),
                    setStackSize(MoltenList.Molten_Celestial_Tungsten.copy(), 144 * 48),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 16))
                .itemOutputs(setStackSize(MultiMachineCasingList.Fine_Structure_Constant_Manipulator.copy(), 4))
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Electromagnetic Waveguide"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GoodGeneratorList.Antimatter_Containment_Casing.copy(), 6),
                    setStackSize(LongRodList.Long_Proto_Halkonite_Steel_Rod.copy(), 6),
                    setStackSize(FineWireList.Fine_Tairitsu_Wire.copy(), 24),
                    setStackSize(FoilList.Churitsu_Foil.copy(), 12),

                    setStackSize(ScrewList.Shijima_Screw.copy(), 24),
                    setStackSize(CasingList.Churitsu_Casing.copy(), 6),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 2))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Chromatic_Glass.copy(), 144 * 64 * 12),
                    setStackSize(MoltenList.Molten_Infinity.copy(), 144 * 64 * 3),
                    setStackSize(MoltenList.Molten_Celestial_Tungsten.copy(), 144 * 64 * 3),
                    setStackSize(MoltenList.Molten_SpaceTime.copy(), 144 * 24))
                .itemOutputs(setStackSize(GTBlockList.Electromagnetic_Waveguide.copy(), 4))
                .eut(RECIPE_UIV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Condensate Transformative Coil"
            GTValues.RA.stdBuilder()
                .itemInputs(
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
                    setStackSize(MoltenList.Molten_Chromatic_Glass.copy(), 144 * 96),
                    setStackSize(MoltenList.Molten_Infinity.copy(), 144 * 12),
                    setStackSize(MoltenList.Molten_Celestial_Tungsten.copy(), 144 * 12),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 4))
                .itemOutputs(MultiMachineCasingList.Condensate_Transformative_Coil)
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Condensate Guidance Coil"
            GTValues.RA.stdBuilder()
                .itemInputs(
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
                    setStackSize(MoltenList.Molten_Chromatic_Glass.copy(), 144 * 96),
                    setStackSize(MoltenList.Molten_Infinity.copy(), 144 * 12),
                    setStackSize(MoltenList.Molten_Celestial_Tungsten.copy(), 144 * 12),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 4))
                .itemOutputs(MultiMachineCasingList.Condensate_Transformative_Coil)
                .eut(RECIPE_UIV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Coil Block
        {
            // "Infinity Coil Block"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 1),
                    setStackSize(WireList.Infinity_Wire_2x.copy(), 8),
                    setStackSize(ScrewList.Infinity_Screw.copy(), 8),
                    setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 24))
                .fluidInputs(setStackSize(MoltenList.Molten_Awakened_Draconium.copy(), 144 * 4))
                .itemOutputs(MultiMachineCasingList.Infinity_Coil_Block)
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Hypogen Coil Block"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 1),
                    setStackSize(WireList.Hypogen_Wire_2x.copy(), 8),
                    setStackSize(ScrewList.Hypogen_Screw.copy(), 8),
                    setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 32))
                .fluidInputs(setStackSize(MoltenList.Molten_Infinity.copy(), 144 * 4))
                .itemOutputs(MultiMachineCasingList.Hypogen_Coil_Block)
                .eut(RECIPE_UIV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Eternal Coil Block"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 1),
                    setStackSize(WireList.SpaceTime_Wire_4x.copy(), 8),
                    setStackSize(ScrewList.SpaceTime_Screw.copy(), 8),
                    setStackSize(SingularityList.Eternal_Singularity.copy(), 1),
                    setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 64))
                .fluidInputs(setStackSize(MoltenList.Molten_Hypogen.copy(), 144 * 4))
                .itemOutputs(MultiMachineCasingList.Eternal_Coil_Block)
                .eut(RECIPE_UMV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Component Assembly Line Casing
        {
            // "Component Assembly Line Casing (LuV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Europium_Frame_Box.copy(), 1),
                    setStackSize(DensePlateList.Dense_Rhodium_Plated_Palladium_Plate.copy(), 6),
                    setStackSize(GTItemList.Robot_Arm_LuV.copy(), 8),
                    setStackSize(GTItemList.Electric_Piston_LuV.copy(), 10),

                    setStackSize(GTItemList.Electric_Motor_LuV.copy(), 16),
                    setStackSize(GearList.Rhodium_Plated_Palladium_Gear.copy(), 4),
                    setStackSize(SmallGearList.Small_Rhodium_Plated_Palladium_Gear.copy(), 16),
                    setStackSize(CableList.Vanadium_Gallium_Cable_4x.copy(), 8),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 16))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 24),
                    setStackSize(MoltenList.Molten_Zeron_100.copy(), 144 * 12),
                    setStackSize(MoltenList.Molten_Artherium_Sn.copy(), 144 * 6),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 4))
                .itemOutputs(GoodGeneratorList.Component_Assembly_Line_Casing_LuV)
                .eut(RECIPE_IV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Component Assembly Line Casing (ZPM)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Iridium_Frame_Box.copy(), 1),
                    setStackSize(SuperdensePlateList.Superdense_Iridium_Plate.copy(), 1),
                    setStackSize(GTItemList.Robot_Arm_ZPM.copy(), 8),
                    setStackSize(GTItemList.Electric_Piston_ZPM.copy(), 10),

                    setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 16),
                    setStackSize(GearList.Iridium_Gear.copy(), 4),
                    setStackSize(SmallGearList.Small_Iridium_Gear.copy(), 16),
                    setStackSize(CableList.Naquadah_Cable_4x.copy(), 8),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 16))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 28),
                    setStackSize(MoltenList.Molten_Pikyonium_64B.copy(), 144 * 14),
                    setStackSize(MoltenList.Molten_Dalisenite.copy(), 144 * 7),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 5))
                .itemOutputs(GoodGeneratorList.Component_Assembly_Line_Casing_ZPM)
                .eut(RECIPE_LuV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Component Assembly Line Casing (UV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Osmium_Frame_Box.copy(), 1),
                    setStackSize(SuperdensePlateList.Superdense_Osmium_Plate.copy(), 1),
                    setStackSize(GTItemList.Robot_Arm_UV.copy(), 8),
                    setStackSize(GTItemList.Electric_Piston_UV.copy(), 10),

                    setStackSize(GTItemList.Electric_Motor_UV.copy(), 16),
                    setStackSize(GearList.Osmium_Gear.copy(), 4),
                    setStackSize(SmallGearList.Small_Osmium_Gear.copy(), 16),
                    setStackSize(CableList.Naquadah_Alloy_Cable_4x.copy(), 8),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 16))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 32),
                    setStackSize(MoltenList.Molten_Advanced_Nitinol.copy(), 144 * 16),
                    setStackSize(MoltenList.Molten_Tairitsu.copy(), 144 * 8),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 6))
                .itemOutputs(GoodGeneratorList.Component_Assembly_Line_Casing_UV)
                .eut(RECIPE_ZPM)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Component Assembly Line Casing (UHV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box.copy(), 1),
                    setStackSize(SuperdensePlateList.Superdense_Cosmic_Neutronium_Plate.copy(), 1),
                    setStackSize(GTItemList.Robot_Arm_UHV.copy(), 8),
                    setStackSize(GTItemList.Electric_Piston_UHV.copy(), 10),

                    setStackSize(GTItemList.Electric_Motor_UHV.copy(), 16),
                    setStackSize(GearList.Cosmic_Neutronium_Gear.copy(), 4),
                    setStackSize(SmallGearList.Small_Cosmic_Neutronium_Gear.copy(), 16),
                    setStackSize(CableList.Bedrockium_Cable_4x.copy(), 8),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 16))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 36),
                    setStackSize(MoltenList.Molten_Abyssal_Alloy.copy(), 144 * 18),
                    setStackSize(MoltenList.Molten_Precious_Metals_Alloy.copy(), 144 * 9),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 7))
                .itemOutputs(GoodGeneratorList.Component_Assembly_Line_Casing_UHV)
                .eut(RECIPE_UV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Component Assembly Line Casing (UEV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 1),
                    setStackSize(SuperdensePlateList.Superdense_Infinity_Plate.copy(), 1),
                    setStackSize(GTItemList.Robot_Arm_UEV.copy(), 8),
                    setStackSize(GTItemList.Electric_Piston_UEV.copy(), 10),

                    setStackSize(GTItemList.Electric_Motor_UHV.copy(), 16),
                    setStackSize(GearList.Infinity_Gear.copy(), 4),
                    setStackSize(SmallGearList.Small_Infinity_Gear.copy(), 16),
                    setStackSize(CableList.Draconium_Cable_4x.copy(), 8),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 16))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 40),
                    setStackSize(MoltenList.Molten_Quantum.copy(), 144 * 20),
                    setStackSize(MoltenList.Molten_Enriched_Naquadah_Alloy.copy(), 144 * 10),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 8))
                .itemOutputs(GoodGeneratorList.Component_Assembly_Line_Casing_UEV)
                .eut(RECIPE_UHV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Component Assembly Line Casing (UIV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Proto_Halkonite_Steel_Frame_Box.copy(), 1),
                    setStackSize(SuperdensePlateList.Superdense_Transcendent_Metal_Plate.copy(), 1),
                    setStackSize(GTItemList.Robot_Arm_UIV.copy(), 8),
                    setStackSize(GTItemList.Electric_Piston_UIV.copy(), 10),

                    setStackSize(GTItemList.Electric_Motor_UIV.copy(), 16),
                    setStackSize(GearList.Transcendent_Metal_Gear.copy(), 4),
                    setStackSize(SmallGearList.Small_Proto_Halkonite_Steel_Gear.copy(), 16),
                    setStackSize(CableList.Nether_Star_Cable_4x.copy(), 8),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 16))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 44),
                    setStackSize(MoltenList.Molten_Hypogen.copy(), 144 * 22),
                    setStackSize(MoltenList.Molten_Metastable_Oganesson.copy(), 144 * 12),
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 9))
                .itemOutputs(GoodGeneratorList.Component_Assembly_Line_Casing_UIV)
                .eut(RECIPE_UEV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Component Assembly Line Casing (UMV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.SpaceTime_Frame_Box.copy(), 1),
                    setStackSize(SuperdensePlateList.Superdense_SpaceTime_Plate.copy(), 1),
                    setStackSize(GTItemList.Robot_Arm_UMV.copy(), 8),
                    setStackSize(GTItemList.Electric_Piston_UMV.copy(), 10),

                    setStackSize(GTItemList.Electric_Motor_UMV.copy(), 16),
                    setStackSize(GearList.SpaceTime_Gear.copy(), 4),
                    setStackSize(SmallGearList.Small_SpaceTime_Gear.copy(), 16),
                    setStackSize(CableList.Quantium_Cable_4x.copy(), 8),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 16))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 48),
                    setStackSize(MoltenList.Molten_Hypogen.copy(), 144 * 24),
                    setStackSize(MoltenList.Molten_Metastable_Oganesson.copy(), 144 * 14),
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 10))
                .itemOutputs(GoodGeneratorList.Component_Assembly_Line_Casing_UMV)
                .eut(RECIPE_UIV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Component Assembly Line Casing (UXV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
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
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 16))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 52),
                    setStackSize(MoltenList.Molten_Black_Dwarf_Matter.copy(), 144 * 26),
                    setStackSize(MoltenList.Molten_Eternity.copy(), 144 * 15),
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 11))
                .itemOutputs(GoodGeneratorList.Component_Assembly_Line_Casing_UXV)
                .eut(RECIPE_UMV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Containment Casing"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GTItemList.Field_Generator_IV.copy(), 32),
                setStackSize(GTItemList.Electric_Motor_EV.copy(), 64),
                setStackSize(BatteryList.Lapotronic_Energy_Orb_Empty.copy(), 32),
                setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_12x.copy(), 32),

                setStackSize(WireList.Platinum_Wire_16x.copy(), 64),
                setStackSize(PlateList.Naquadria_Plate.copy(), 64),
                setStackSize(DustList.Gadolinium_Dust.copy(), 32),
                setStackSize(DustList.Samarium_Dust.copy(), 16),

                setStackSize(GearList.Arcanite_Gear.copy(), 8),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 64),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 32),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 16),

                setStackSize(GTPPList.Quantum_Anomaly.copy(), 1),
                setStackSize(GTPPList.Coil_Wire_ZPM.copy(), 64))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Nitinol_60.copy(), 144 * 36),
                setStackSize(MoltenList.Molten_Energy_Crystal.copy(), 144 * 72),
                setStackSize(MoltenList.Molten_Tumbaga.copy(), 144 * 288),
                setStackSize(MoltenList.Molten_Nichrome.copy(), 144 * 16))
            .itemOutputs(setStackSize(MultiMachineCasingList.Containment_Casing.copy(), 32))
            .eut(RECIPE_LuV)
            .duration(1200 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Coolant Delivery Casing"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(FrameBoxList.Aluminium_Frame_Box.copy(), 1),
                setStackSize(PlateList.Copper_Plate.copy(), 6),
                setStackSize(PipeList.Large_Naquadah_Fluid_Pipe.copy(), 2),
                setStackSize(GTItemList.Electric_Pump_LuV.copy(), 3),

                setStackSize(GTNHLanthanidesList.Capillary_Exchange.copy(), 3),
                setStackSize(NewHorizonsCoreModList.Mica_Insulator_Sheet.copy(), 6),
                setStackSize(WireList.Tungsten_Wire_1x.copy(), 1))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Soldering_Alloy.copy(), 144 * 2),
                setStackSize(FluidList.Lubricant.copy(), 1152))
            .itemOutputs(GTNHLanthanidesList.Coolant_Delivery_Casing)
            .eut(RECIPE_LuV)
            .duration(50 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Dimensional Bridge"
        GTValues.RA.stdBuilder()
            .itemInputs(
                GTUtility.getIntegratedCircuit(1),

                setStackSize(MultiMachineCasingList.Dimensionally_Transcendent_Casing.copy(), 1),
                setStackSize(MachineList.Microwave_Energy_Transmitter_UV.copy(), 1),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 2),
                setStackSize(SingularityList.Iron_Singularity.copy(), 2),

                setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 6),
                setStackSize(CircuitList.FPIC_Wafer.copy(), 4),
                setStackSize(GTItemList.Field_Generator_UHV.copy(), 1))
            .fluidInputs(
                setStackSize(GasList.Oganesson.copy(), 1000 * 8),
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64),
                setStackSize(MoltenList.Molten_Enriched_Naquadah.copy(), 144 * 9))
            .itemOutputs(MultiMachineCasingList.Dimensional_Bridge)
            .eut(RECIPE_UIV)
            .duration(240 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Dimensional Injection Casing
        GTValues.RA.stdBuilder()
            .itemInputs(
                GTUtility.getIntegratedCircuit(1),

                setStackSize(PlateList.Osmiridium_Plate.copy(), 4),
                setStackSize(DensePlateList.Dense_Ledox_Plate.copy(), 1),
                setStackSize(DensePlateList.Dense_Callisto_Ice_Plate.copy(), 1),
                setStackSize(ScrewList.Laurenium_Screw.copy(), 12),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 2),
                setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 2),
                setStackSize(GTBlockList.Super_Chest_V.copy(), 1),
                setStackSize(GTBlockList.Super_Tank_V.copy(), 1),

                setStackSize(CircuitList.FPIC_Wafer.copy(), 2))
            .fluidInputs(
                setStackSize(GasList.Oganesson.copy(), 1000),
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 4),
                setStackSize(MoltenList.Molten_Enriched_Naquadah.copy(), 144 * 2))
            .itemOutputs(MultiMachineCasingList.Dimensional_Injection_Casing)
            .eut(RECIPE_UIV)
            .duration(20 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Dimensionally Transcendent Casing
        GTValues.RA.stdBuilder()
            .itemInputs(
                GTUtility.getIntegratedCircuit(2),

                setStackSize(PlateList.Osmiridium_Plate.copy(), 4),
                setStackSize(ScrewList.Laurenium_Screw.copy(), 12),
                setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 1))
            .fluidInputs(
                setStackSize(GasList.Oganesson.copy(), 500),
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 2),
                setStackSize(MoltenList.Molten_Enriched_Naquadah.copy(), 144))
            .itemOutputs(MultiMachineCasingList.Dimensionally_Transcendent_Casing)
            .eut(RECIPE_UIV)
            .duration(20 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Dyson Swarm Ground Unit
        {
            // "Dyson Swarm Control Center Base Casing"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 4),
                    setStackSize(OpenComputersList.Accelerated_Processing_Unit_APU_Tier3.copy(), 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 4),
                    setStackSize(MultiMachineControllerList.Quantum_Computer.copy(), 4))
                .fluidInputs(
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 32),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 80),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 8))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Dyson_Swarm_Control_Center_Base_Casing.copy(), 8))
                .eut(RECIPE_UEV)
                .duration(80 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Dyson Swarm Control Center Primary Windings"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(CircuitList.Femto_Power_IC_Chip.copy(), 2),
                    setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 24),
                    setStackSize(TecTechList.Molecular_Coil.copy(), 4))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Radox_Polymer.copy(), 144 * 24),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 16),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 80),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 8))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Dyson_Swarm_Control_Center_Primary_Windings.copy(), 4))
                .eut(RECIPE_UEV)
                .duration(40 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Dyson Swarm Control Center Secondary Windings"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(CircuitList.Femto_Power_IC_Chip.copy(), 2),
                    setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 24),
                    setStackSize(MultiMachineCasingList.Awakened_Draconium_Coil_Block.copy(), 4))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Radox_Polymer.copy(), 144 * 24),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 16),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 80),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 8))
                .itemOutputs(
                    setStackSize(GTNHIntergalacticList.Dyson_Swarm_Control_Center_Secondary_Windings.copy(), 4))
                .eut(RECIPE_UEV)
                .duration(40 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Dyson Swarm Control Center Toroid Casing"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(ScrewList.Cosmic_Neutronium_Screw.copy(), 4),
                    setStackSize(FoilList.Neutronium_Foil.copy(), 8),
                    setStackSize(FrameBoxList.Superconductor_Base_UEV_Frame_Box.copy(), 4))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Radox_Polymer.copy(), 144),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 16),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 80),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 8))
                .itemOutputs(GTNHIntergalacticList.Dyson_Swarm_Control_Center_Toroid_Casing)
                .eut(RECIPE_UEV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Dyson Swarm Energy Receiver Base Casing"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Energy_Distributor_UHV.copy(), 4),
                    setStackSize(CircuitList.Femto_Power_IC_Chip.copy(), 32),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64),
                    setStackSize(GTItemList.Extremely_Ultimate_Voltage_Coil.copy(), 64))
                .fluidInputs(
                    setStackSize(FluidList.Liquid_Helium.copy(), 1000 * 50),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 16),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 80),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 8))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Dyson_Swarm_Energy_Receiver_Base_Casing.copy(), 4))
                .eut(RECIPE_UEV)
                .duration(40 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Dyson Swarm Energy Receiver Dish Block"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTNHIntergalacticList.Ultra_High_Temperature_Resistant_Mesh.copy(), 64),
                    setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 64),
                    setStackSize(PipeList.Infinity_Fluid_Pipe.copy(), 8),
                    setStackSize(GoodGeneratorList.Advanced_Field_Restriction_Coil.copy(), 2))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Rhugnor.copy(), 40),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 16),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 80),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 8))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Dyson_Swarm_Energy_Receiver_Dish_Block.copy(), 3))
                .eut(RECIPE_UEV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Dyson Swarm Module Deployment Unit Base Casing"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 4),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 32),
                    setStackSize(GTBlockList.Quantum_Tank_V.copy(), 2),

                    setStackSize(GTItemList.Conveyor_Module_UIV.copy(), 32),
                    setStackSize(GTBlockList.Quantum_Chest_V.copy(), 2))
                .fluidInputs(
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 50),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 32),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 80),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 8))
                .itemOutputs(
                    setStackSize(GTNHIntergalacticList.Dyson_Swarm_Module_Deployment_Unit_Base_Casing.copy(), 4))
                .eut(RECIPE_UEV)
                .duration(40 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Dyson Swarm Module Deployment Unit Core"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 4),
                    setStackSize(GTItemList.Conveyor_Module_UIV.copy(), 32),
                    setStackSize(GTItemList.Robot_Arm_UIV.copy(), 32),
                    setStackSize(GTItemList.Electric_Piston_UIV.copy(), 32),

                    setStackSize(MinecraftList.Dropper.copy(), 64 * 4))
                .fluidInputs(
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 50),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 32),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 80),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 8))
                .itemOutputs(GTNHIntergalacticList.Dyson_Swarm_Module_Deployment_Unit_Core)
                .eut(RECIPE_UEV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Dyson Swarm Module Deployment Unit Superconducting Magnet"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTBlockList.Machine_Hull_UIV.copy(), 4),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 4),
                    setStackSize(CircuitList.Femto_Power_IC_Chip.copy(), 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Rhugnor.copy(), 40),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 16),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 80),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 8))
                .itemOutputs(
                    setStackSize(
                        GTNHIntergalacticList.Dyson_Swarm_Module_Deployment_Unit_Superconducting_Magnet.copy(),
                        4))
                .eut(RECIPE_UEV)
                .duration(40 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Elemental Confinement Shell"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GTBlockList.Machine_Hull_LuV.copy(), 5),
                setStackSize(GTItemList.Field_Generator_HV.copy(), 16),
                setStackSize(GTPPList.Energy_Core_MV.copy(), 2),
                setStackSize(PlateList.Pikyonium_64B_Plate.copy(), 4),

                setStackSize(ScrewList.Pikyonium_64B_Screw.copy(), 4),
                setStackSize(BoltList.Trinium_Naquadah_Carbonite_Bolt.copy(), 8),
                setStackSize(RodList.Inconel_625_Rod.copy(), 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 4),

                setStackSize(GTItemList.Data_Stick.copy(), 4))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Inconel_625.copy(), 144 * 16),
                setStackSize(MoltenList.Molten_Inconel_792.copy(), 144 * 8),
                setStackSize(MoltenList.Molten_Hastelloy_N.copy(), 144 * 8),
                setStackSize(MoltenList.Molten_Babbit_Alloy.copy(), 144 * 16))
            .itemOutputs(MultiMachineCasingList.Elemental_Confinement_Shell)
            .eut(RECIPE_ZPM)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Energy Infuser"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 1),
                setStackSize(TecTechList.Molecular_Coil.copy(), 8),
                setStackSize(TecTechList.High_Power_Casing.copy(), 8),
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
        {
            // "Reinforced Spatial Structure Casing"
            GTValues.RA.stdBuilder()
                .itemInputs(
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
                    setStackSize(MoltenList.Molten_Neutronium.copy(), 144 * 64 * 16),
                    setStackSize(MoltenList.Molten_Cosmic_Neutronium.copy(), 144 * 64 * 16),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 8),
                    setStackSize(FluidList.Spatially_Enlarged_Fluid.copy(), 144 * 10))
                .itemOutputs(setStackSize(TecTechList.Reinforced_Spatial_Structure_Casing.copy(), 4))
                .eut(RECIPE_UMV)
                .duration(500 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Reinforced Temporal Structure Casing"
            GTValues.RA.stdBuilder()
                .itemInputs(
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
                    setStackSize(MoltenList.Molten_Neutronium.copy(), 144 * 64 * 16),
                    setStackSize(MoltenList.Molten_Cosmic_Neutronium.copy(), 144 * 64 * 16),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 8),
                    setStackSize(FluidList.Tachyon_Rich_Temporal_Fluid.copy(), 144 * 10))
                .itemOutputs(setStackSize(TecTechList.Reinforced_Temporal_Structure_Casing.copy(), 4))
                .eut(RECIPE_UMV)
                .duration(500 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Infinite Spacetime Energy Boundary Casing"
            GTValues.RA.stdBuilder()
                .itemInputs(
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
                    setStackSize(MoltenList.Molten_Neutronium.copy(), 144 * 64 * 64),
                    setStackSize(MoltenList.Molten_Cosmic_Neutronium.copy(), 144 * 64 * 64),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 32),
                    setStackSize(MoltenList.Molten_SpaceTime.copy(), 1000 * 64 * 2))
                .itemOutputs(TecTechList.Infinite_Spacetime_Energy_Boundary_Casing)
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
                    GTValues.RA.stdBuilder()
                        .itemInputs(
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
                            GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, (absoluteTier / 3) + 1))
                        .fluidInputs(
                            setStackSize(
                                FluidList.Mutated_Living_Solder.copy(),
                                (int) (144 * 20 * pow(2, absoluteTier))),
                            setStackSize(FluidList.Spatially_Enlarged_Fluid.copy(), 144 * 10 * (absoluteTier + 1)),
                            setStackSize(MoltenList.Molten_SpaceTime.copy(), 144 * 10))
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
                    GTValues.RA.stdBuilder()
                        .itemInputs(
                            GTUtility.getIntegratedCircuit(absoluteTier + 1),

                            MultiMachineCasingList.Reinforced_Temporal_Structure_Casing,
                            fusionReactors[absoluteTier],
                            fusionCoils[absoluteTier],
                            setStackSize(GTBlockList.Block_Solar_Panel_UV.copy(), absoluteTier + 1),

                            GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, absoluteTier + 1),
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
                            setStackSize(
                                FluidList.Mutated_Living_Solder.copy(),
                                (int) (144 * 20 * pow(2, absoluteTier))),
                            setStackSize(FluidList.Tachyon_Rich_Temporal_Fluid.copy(), 144 * 10 * (absoluteTier + 1)),
                            setStackSize(MoltenList.Molten_SpaceTime.copy(), 144 * 10))
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
                    GTValues.RA.stdBuilder()
                        .itemInputs(
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
                            setStackSize(
                                FluidList.Mutated_Living_Solder.copy(),
                                (int) (144 * 20 * pow(2, absoluteTier))),
                            setStackSize(FluidList.Tachyon_Rich_Temporal_Fluid.copy(), 144 * 10 * (absoluteTier + 1)),
                            setStackSize(FluidList.Spatially_Enlarged_Fluid.copy(), 144 * 10 * (absoluteTier + 1)),
                            setStackSize(MoltenList.Molten_SpaceTime.copy(), 144 * 10))
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
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(MultiMachineCasingList.Eternal_Magnetic_Chassis.copy(), 1),
                        setStackSize(GoodGeneratorList.Gravity_Stabilization_Casing.copy(), 1),
                        setStackSize(GoodGeneratorList.Magnetic_Flux_Casing.copy(), 1),
                        setStackSize(SuperdensePlateList.Superdense_Superconductor_Base_UIV_Plate.copy(), 16),

                        setStackSize(RodList.Proto_Halkonite_Steel_Rod.copy(), 8),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 2),
                        setStackSize(GTItemList.Electric_Pump_UMV.copy(), 4),
                        setStackSize(GTItemList.Field_Generator_UMV.copy(), 1))
                    .fluidInputs(
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 16),
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 300),
                        setStackSize(MoltenList.Molten_Shirabon.copy(), 144 * 40))
                    .itemOutputs(MultiMachineCasingList.Sentient_Overclocker_Casing)
                    .eut(RECIPE_UMV)
                    .duration(45 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Magnetic Flux Casing"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(FrameBoxList.Proto_Halkonite_Steel_Frame_Box.copy(), 4),
                        setStackSize(GTItemList.Sensor_UIV.copy(), 2),
                        setStackSize(GTItemList.Tengam_Electromagnet.copy(), 1),
                        setStackSize(DensePlateList.Dense_Proto_Halkonite_Steel_Plate.copy(), 1),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 1),
                        setStackSize(CasingList.Transcendent_Metal_Casing.copy(), 16),
                        setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Purified_Tengam.copy(), 144 * 64),
                        setStackSize(MoltenList.Molten_Transcendent_Metal.copy(), 144 * 16),
                        setStackSize(FluidList.Super_Coolant.copy(), 1000 * 10))
                    .itemOutputs(setStackSize(GoodGeneratorList.Magnetic_Flux_Casing.copy(), 4))
                    .eut(RECIPE_UIV)
                    .duration(60 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Gravity Stabilization Casing"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(MultiMachineCasingList.Neutronium_Stabilization_Casing.copy(), 4),
                        setStackSize(GTItemList.Emitter_UIV.copy(), 2),
                        setStackSize(GTPPList.Graviton_Anomaly.copy(), 1),
                        setStackSize(PlateList.Proto_Halkonite_Steel_Plate.copy(), 4),

                        setStackSize(GearList.Proto_Halkonite_Steel_Gear.copy(), 1),
                        setStackSize(GTItemList.Gravi_Star.copy(), 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 1),
                        setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Chromatic_Glass.copy(), 144 * 64),
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 144 * 16))
                    .itemOutputs(setStackSize(GoodGeneratorList.Gravity_Stabilization_Casing.copy(), 4))
                    .eut(RECIPE_UIV)
                    .duration(60 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Antimatter Containment Casing"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(MultiMachineCasingList.Neutronium_Stabilization_Casing.copy(), 4),
                        setStackSize(GTItemList.Emitter_UIV.copy(), 2),
                        setStackSize(GTPPList.Graviton_Anomaly.copy(), 1),
                        setStackSize(PlateList.Proto_Halkonite_Steel_Plate.copy(), 4),

                        setStackSize(GearList.Proto_Halkonite_Steel_Gear.copy(), 1),
                        setStackSize(GTItemList.Gravi_Star.copy(), 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 1),
                        setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Chromatic_Glass.copy(), 144 * 64),
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 144 * 16))
                    .itemOutputs(setStackSize(GoodGeneratorList.Gravity_Stabilization_Casing.copy(), 4))
                    .eut(RECIPE_UIV)
                    .duration(60 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Infinite Magnetic Chassis"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box.copy(), 1),
                        setStackSize(PlateList.High_Durability_Compound_Steel_Plate.copy(), 32),
                        setStackSize(CircuitList.Optically_Compatible_Memory.copy(), 8),
                        setStackSize(GoodGeneratorList.Hi_Computation_Station_MKIV_Prototype.copy(), 4),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 1),
                        setStackSize(GTItemList.Emitter_UHV.copy(), 1),
                        setStackSize(ScrewList.Attuned_Tengam_Screw.copy(), 6),
                        setStackSize(GTItemList.Nuclear_Star.copy(), 2))
                    .fluidInputs(
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 4),
                        setStackSize(MoltenList.Molten_Superconductor_Base_UEV.copy(), 144 * 2),
                        setStackSize(MoltenList.Molten_Rhugnor.copy(), 144))
                    .itemOutputs(MultiMachineCasingList.Infinite_Magnetic_Chassis)
                    .eut(RECIPE_UEV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Eternal Magnetic Chassis"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GoodGeneratorList.Compact_Fusion_Coil_MKII_Finaltype.copy(), 1),
                        setStackSize(ScrewList.Ichorium_Screw.copy(), 64),
                        setStackSize(SingularityList.Spaghettic_Singularity.copy(), 1),
                        setStackSize(SingularityList.Cryptic_Singularity.copy(), 1),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),
                        setStackSize(GTItemList.Transcendent_Metal_Nanites.copy(), 2),
                        setStackSize(SuperdensePlateList.Superdense_Six_Phased_Copper_Plate.copy(), 1),
                        setStackSize(GTItemList.Emitter_UIV.copy(), 1))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Proto_Halkonite_Steel_Base.copy(), 144 * 20),
                        setStackSize(MoltenList.Molten_Mellion.copy(), 144 * 4),
                        setStackSize(MoltenList.Molten_Creon.copy(), 144 * 4),
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 20))
                    .itemOutputs(MultiMachineCasingList.Eternal_Magnetic_Chassis)
                    .eut(RECIPE_UIV)
                    .duration(45 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // S.L.C
            {
                // "Streamlined Casting Casing"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(MultiMachineCasingList.Infinite_Magnetic_Chassis.copy(), 1),
                        setStackSize(SuperdensePlateList.Superdense_Tritanium_Plate.copy(), 16),
                        setStackSize(MachineList.World_Accelerator_UV.copy(), 8),
                        setStackSize(RotorList.Celestial_Tungsten_Rotor.copy(), 4),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 2),
                        setStackSize(GTItemList.Electric_Pump_UHV.copy(), 1))
                    .fluidInputs(
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 20),
                        setStackSize(MoltenList.Molten_Holmium.copy(), 144 * 40),
                        setStackSize(MoltenList.Molten_Enriched_Naquadah_Alloy.copy(), 144 * 10))
                    .itemOutputs(MultiMachineCasingList.Streamlined_Casting_Casing)
                    .eut(RECIPE_UEV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Elemental Confinement Shell"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTBlockList.Machine_Hull_LuV.copy(), 5),
                        setStackSize(GTItemList.Field_Generator_HV.copy(), 16),
                        setStackSize(GTPPList.Energy_Core_MV.copy(), 2),
                        setStackSize(PlateList.Pikyonium_64B_Plate.copy(), 4),

                        setStackSize(ScrewList.Pikyonium_64B_Screw.copy(), 4),
                        setStackSize(BoltList.Trinium_Naquadah_Carbonite_Bolt.copy(), 8),
                        setStackSize(RodList.Inconel_625_Rod.copy(), 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 4),

                        setStackSize(GTItemList.Data_Stick.copy(), 4))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Inconel_625.copy(), 144 * 16),
                        setStackSize(MoltenList.Molten_Inconel_792.copy(), 144 * 8),
                        setStackSize(MoltenList.Molten_Hastelloy_N.copy(), 144 * 8),
                        setStackSize(MoltenList.Molten_Babbit_Alloy.copy(), 144 * 16))
                    .itemOutputs(MultiMachineCasingList.Elemental_Confinement_Shell)
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // P.V.S
            {
                // "Proto-Volt Stabilizer Casing"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(MultiMachineCasingList.Infinite_Magnetic_Chassis.copy(), 1),
                        setStackSize(PlateList.Attuned_Tengam_Plate.copy(), 6),
                        setStackSize(GTItemList.Samarium_Electromagnet.copy(), 1),
                        setStackSize(GTItemList.Solar_Panel_UV.copy(), 1),

                        setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 2),
                        setStackSize(BatteryList.Energy_Cluster_Empty.copy(), 1))
                    .fluidInputs(
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 20),
                        setStackSize(MoltenList.Molten_Neodymium.copy(), 144 * 64 * 4),
                        setStackSize(MoltenList.Molten_Samarium.copy(), 144 * 64 * 2),
                        setStackSize(MoltenList.Molten_Purified_Tengam.copy(), 144 * 64))
                    .itemOutputs(MultiMachineCasingList.Proto_Volt_Stabilizer_Casing)
                    .eut(RECIPE_UEV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // H.C
            {
                // "Hypercooler Casing"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(MultiMachineCasingList.Infinite_Magnetic_Chassis.copy(), 1),
                        setStackSize(SuperdensePlateList.Superdense_Infinity_Catalyst_Plate.copy(), 64),
                        setStackSize(SuperdensePlateList.Superdense_Callisto_Ice_Plate.copy(), 32),
                        setStackSize(SuperdensePlateList.Superdense_Six_Phased_Copper_Plate.copy(), 16),

                        setStackSize(MachineList.World_Accelerator_UV.copy(), 8),
                        setStackSize(GTItemList.Electric_Pump_UIV.copy(), 4),
                        setStackSize(GTItemList.Fluid_Regulator_UIV.copy(), 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 2))
                    .fluidInputs(
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 16),
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 90),
                        setStackSize(MoltenList.Molten_Proto_Halkonite_Steel_Base.copy(), 144 * 8),
                        setStackSize(MoltenList.Molten_SpaceTime.copy(), 36))
                    .itemOutputs(MultiMachineCasingList.Hypercooler_Casing)
                    .eut(RECIPE_UIV)
                    .duration(45 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // S.C.B
            {
                // "Superdense Casting Basin Casing"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(MultiMachineCasingList.Infinite_Magnetic_Chassis.copy(), 1),
                        setStackSize(GTNHIntergalacticList.Ultra_High_Temperature_Resistant_Mesh.copy(), 16),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 1),
                        setStackSize(LongRodList.Long_Superconductor_Base_UEV_Rod.copy(), 4),

                        setStackSize(SuperdensePlateList.Superdense_Infinity_Catalyst_Plate.copy(), 2),
                        setStackSize(SuperdensePlateList.Superdense_Attuned_Tengam_Plate.copy(), 2),
                        setStackSize(SuperdensePlateList.Superdense_Cosmic_Neutronium_Plate.copy(), 2),
                        setStackSize(SuperdensePlateList.Superdense_Neutronium_Plate.copy(), 2))
                    .fluidInputs(
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 20),
                        setStackSize(MoltenList.Molten_Naquadria.copy(), 144 * 400),
                        setStackSize(MoltenList.Molten_Manyullyn_GregTech.copy(), 144 * 100),
                        setStackSize(MoltenList.Molten_Precious_Metals_Alloy.copy(), 144 * 20))
                    .itemOutputs(MultiMachineCasingList.Superdense_Casting_Basin_Casing)
                    .eut(RECIPE_UEV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Primary Exo-Foundry Casing"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(FrameBoxList.Netherite_Frame_Box.copy(), 1),
                        setStackSize(CircuitList.Optically_Perfected_CPU.copy(), 6),
                        setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 8),
                        setStackSize(ScrewList.Infinity_Screw.copy(), 4),

                        setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 2))
                    .fluidInputs(
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 4),
                        setStackSize(GasList.Oganesson.copy(), 500),
                        setStackSize(MoltenList.Molten_Cosmic_Neutronium.copy(), 144 * 2))
                    .itemOutputs(MultiMachineCasingList.Primary_Exo_Foundry_Casing)
                    .eut(RECIPE_UEV)
                    .duration(15 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // H.R
            {
                // "Heliocast Reinforcement Casing"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(MultiMachineCasingList.Eternal_Magnetic_Chassis.copy(), 1),
                        setStackSize(TecTechList.Stellar_Energy_Siphon_Casing.copy(), 1),
                        setStackSize(LongRodList.Long_Six_Phased_Copper_Rod.copy(), 6),
                        setStackSize(LongRodList.Long_Transcendent_Metal_Rod.copy(), 6),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 8),
                        setStackSize(GTItemList.Sensor_UIV.copy(), 4),
                        setStackSize(GTItemList.Emitter_UIV.copy(), 4),
                        setStackSize(GearList.Rhugnor_Gear.copy(), 4))
                    .fluidInputs(
                        setStackSize(MoltenList.Molten_Metastable_Oganesson.copy(), 144 * 40),
                        setStackSize(MoltenList.Molten_Mellion.copy(), 144 * 20),
                        setStackSize(MoltenList.Molten_Creon.copy(), 144 * 20),
                        setStackSize(MoltenList.Molten_SpaceTime.copy(), 144 * 5))
                    .itemOutputs(MultiMachineCasingList.Heliocast_Reinforcement_Casing)
                    .eut(RECIPE_UIV)
                    .duration(45 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Transcendentally Amplified Magnetic Confinement Casing"
                GTValues.RA.stdBuilder()
                    .itemInputs(
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
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 16),
                        setStackSize(PlasmaList.Plutonium_241_Plasma.copy(), 144 * 16))
                    .itemOutputs(
                        setStackSize(TecTechList.Transcendentally_Amplified_Magnetic_Confinement_Casing.copy(), 8))
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Spatially Transcendent Gravitational Lens Block"
                GTValues.RA.stdBuilder()
                    .itemInputs(
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
                        setStackSize(MoltenList.Molten_Rhugnor.copy(), 144 * 16),
                        setStackSize(MoltenList.Molten_Creon.copy(), 144 * 16),
                        setStackSize(MoltenList.Molten_Advanced_Nitinol.copy(), 144 * 64 * 16))
                    .itemOutputs(TecTechList.Spatially_Transcendent_Gravitational_Lens_Block)
                    .eut(RECIPE_UIV)
                    .duration(10 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // U.C
            {
                // "Universal Collapser Casing"
                GTValues.RA.stdBuilder()
                    .itemInputs(
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
                        setStackSize(FluidList.Condensed_Raw_Stellar_Plasma_Mixture.copy(), 1000 * 4000),
                        setStackSize(FluidList.Tachyon_Rich_Temporal_Fluid.copy(), 1000 * 4000),
                        setStackSize(FluidList.Spatially_Enlarged_Fluid.copy(), 1000 * 4000),
                        setStackSize(FluidList.Lossless_Phonon_Transfer_Medium.copy(), 1000 * 1000))
                    .itemOutputs(MultiMachineCasingList.Universal_Collapser_Casing)
                    .eut(RECIPE_UXV)
                    .duration(60 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }
        }

        // "Femtometer-Calibrated Particle Beam Casing"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box.copy(), 16),
                setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 16),
                setStackSize(FrameBoxList.Tritanium_Frame_Box.copy(), 16),
                setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 16),

                setStackSize(PlateList.Cosmic_Neutronium_Plate.copy(), 16),
                setStackSize(PlateList.Infinity_Plate.copy(), 16),
                setStackSize(PlateList.Tritanium_Plate.copy(), 16),
                setStackSize(PlateList.Neutronium_Plate.copy(), 16),

                setStackSize(GTItemList.Field_Generator_UHV.copy(), 1),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 2),
                setStackSize(PipeList.Infinity_Fluid_Pipe.copy(), 16))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Infinity.copy(), 144 * 32),
                setStackSize(MoltenList.Molten_Tritanium.copy(), 144 * 32),
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 32),
                setStackSize(FluidList.Excited_Dimensionally_Transcendent_Resplendent_Catalyst.copy(), 1000 * 4))
            .itemOutputs(setStackSize(MultiMachineCasingList.Femtometer_Calibrated_Particle_Beam_Casing.copy(), 4))
            .eut(RECIPE_UIV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Fluid Cell Block
        {
            // "Fluid Cell Block T3"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Naquadah_Frame_Box.copy(), 1),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T3.copy(), 10),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 8),
                    setStackSize(GTItemList.Electric_Pump_IV.copy(), 8),

                    setStackSize(PipeList.Niobium_Titanium_Fluid_Pipe.copy(), 8),
                    setStackSize(PlateList.Adamantium_Alloy_Plate.copy(), 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Quantium.copy(), 144 * 10),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 8),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 8))
                .itemOutputs(GoodGeneratorList.Fluid_Cell_Block_T3)
                .eut(RECIPE_LuV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Cell Block T4"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 1),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T4.copy(), 10),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 8),
                    setStackSize(GTItemList.Electric_Pump_LuV.copy(), 8),

                    setStackSize(PipeList.Mysterious_Crystal_Fluid_Pipe.copy(), 8),
                    setStackSize(PlateList.Fluxed_Electrum_Plate.copy(), 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Draconium.copy(), 144 * 10),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 16),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 16))
                .itemOutputs(GoodGeneratorList.Fluid_Cell_Block_T4)
                .eut(RECIPE_ZPM)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Cell Block T5"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box.copy(), 1),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T5.copy(), 10),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 8),
                    setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 8),

                    setStackSize(PipeList.Awakened_Draconium_Fluid_Pipe.copy(), 8),
                    setStackSize(PlateList.Neutronium_Plate.copy(), 64))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Draconium.copy(), 144 * 10),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 16),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 16))
                .itemOutputs(GoodGeneratorList.Fluid_Cell_Block_T5)
                .eut(RECIPE_UV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Cell Block T6"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 1),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T6.copy(), 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 8),
                    setStackSize(GTItemList.Electric_Pump_UV.copy(), 8),

                    setStackSize(PipeList.Nether_Star_Fluid_Pipe.copy(), 8),
                    setStackSize(PlateList.Infinity_Plate.copy(), 64))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Awakened_Draconium.copy(), 144 * 10),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 46),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 32))
                .itemOutputs(GoodGeneratorList.Fluid_Cell_Block_T6)
                .eut(RECIPE_UHV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Cell Block T7"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 1),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T7.copy(), 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 8),
                    setStackSize(GTItemList.Electric_Pump_UHV.copy(), 8),

                    setStackSize(PipeList.Nether_Star_Fluid_Pipe.copy(), 16),
                    setStackSize(PlateList.Cosmic_Neutronium_Plate.copy(), 32),
                    setStackSize(PlateList.Infinity_Plate.copy(), 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Awakened_Draconium.copy(), 144 * 100),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 46),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 46))
                .itemOutputs(GoodGeneratorList.Fluid_Cell_Block_T7)
                .eut(RECIPE_UEV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Cell Block T8"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 1),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T8.copy(), 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 8),
                    setStackSize(GTItemList.Electric_Pump_UEV.copy(), 8),

                    setStackSize(PipeList.Large_Nether_Star_Fluid_Pipe.copy(), 12),
                    setStackSize(DoublePlateList.Double_Cosmic_Neutronium_Plate.copy(), 12),
                    setStackSize(DoublePlateList.Double_Awakened_Draconium_Plate.copy(), 12),
                    setStackSize(PlateList.Infinity_Plate.copy(), 64))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Awakened_Draconium.copy(), 144 * 100),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 46),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 46))
                .itemOutputs(GoodGeneratorList.Fluid_Cell_Block_T8)
                .eut(RECIPE_UIV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Cell Block T9"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 2),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T9.copy(), 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 8),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 8),

                    setStackSize(PipeList.Large_Nether_Star_Fluid_Pipe.copy(), 12),
                    setStackSize(DoublePlateList.Double_Cosmic_Neutronium_Plate.copy(), 12),
                    setStackSize(DoublePlateList.Double_Proto_Halkonite_Steel_Plate.copy(), 12),
                    setStackSize(PlateList.Infinity_Plate.copy(), 64))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Awakened_Draconium.copy(), 144 * 100),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 46),
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 46))
                .itemOutputs(GoodGeneratorList.Fluid_Cell_Block_T9)
                .eut(RECIPE_UMV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Cell Block T10"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.SpaceTime_Frame_Box.copy(), 2),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T10.copy(), 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 12),
                    setStackSize(GTItemList.Electric_Pump_UMV.copy(), 8),

                    setStackSize(PipeList.Large_Nether_Star_Fluid_Pipe.copy(), 64),
                    setStackSize(DoublePlateList.Double_Cosmic_Neutronium_Plate.copy(), 12),
                    setStackSize(DoublePlateList.Double_Proto_Halkonite_Steel_Plate.copy(), 12),
                    setStackSize(PlateList.SpaceTime_Plate.copy(), 10))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Awakened_Draconium.copy(), 144 * 10),
                    setStackSize(MoltenList.Molten_Transcendent_Metal.copy(), 144 * 10),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 46),
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 46))
                .itemOutputs(GoodGeneratorList.Fluid_Cell_Block_T10)
                .eut(RECIPE_UXV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Focus Manipulator"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(FrameBoxList.Aluminium_Frame_Box.copy(), 1),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 4),
                setStackSize(GTItemList.Robot_Arm_LuV.copy(), 4),
                setStackSize(GTItemList.Conveyor_Module_LuV.copy(), 2),

                setStackSize(FineWireList.Fine_Gold_Wire.copy(), 32),
                setStackSize(WireList.Tungsten_Wire_1x.copy(), 2))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Soldering_Alloy.copy(), 144 * 64),
                setStackSize(MoltenList.Molten_Gold_GregTech.copy(), 144 * 16),
                setStackSize(GasList.Argon.copy(), 1000))
            .itemOutputs(GTNHLanthanidesList.Focus_Manipulator)
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Forge of the Gods
        {
            // "Singularity Reinforced Stellar Shielding Casing"
            GTValues.RA.stdBuilder()
                .itemInputs(
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
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 2),
                    setStackSize(MoltenList.Molten_Bedrockium.copy(), 144 * 64 * 256),
                    setStackSize(MoltenList.Molten_Celestial_Tungsten.copy(), 144 * 64 * 32),
                    setStackSize(MoltenList.Molten_Neutronium.copy(), 144 * 64 * 32))
                .itemOutputs(setStackSize(TecTechList.Singularity_Reinforced_Stellar_Shielding_Casing.copy(), 4))
                .eut(RECIPE_UIV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Remote Graviton Flow Modulator"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(TecTechList.Transcendentally_Amplified_Magnetic_Confinement_Casing.copy(), 2),
                    setStackSize(GoodGeneratorList.Ultimate_Field_Restriction_Coil.copy(), 1),
                    setStackSize(PlateList.Creon_Plate.copy(), 16),
                    setStackSize(SmallGearList.Small_Mellion_Gear.copy(), 8),

                    setStackSize(GTPPList.Graviton_Anomaly.copy(), 2),
                    setStackSize(GTPPList.Quantum_Anomaly.copy(), 4),
                    setStackSize(GTItemList.Emitter_UIV.copy(), 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 16),

                    setStackSize(GTItemList.Silver_Nanites.copy(), 2))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 32),
                    setStackSize(MoltenList.Molten_Superconductor_Base_UIV.copy(), 144 * 32),
                    setStackSize(MoltenList.Molten_Infinity.copy(), 144 * 32))
                .itemOutputs(setStackSize(TecTechList.Remote_Graviton_Flow_Modulator.copy(), 2))
                .eut(RECIPE_UIV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Celestial Matter Guidance Casing"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(TecTechList.Boundless_Gravitationally_Severed_Structure_Casing.copy(), 1),
                    setStackSize(BatteryList.Ultimate_Battery_Empty.copy(), 1),
                    setStackSize(GTPPList.Cosmic_Fabric_Manipulator.copy(), 1),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 2),

                    setStackSize(GTItemList.Emitter_UIV.copy(), 3),
                    setStackSize(PlateList.Creon_Plate.copy(), 6),
                    setStackSize(GearList.Creon_Gear.copy(), 8),
                    setStackSize(SmallGearList.Small_Mellion_Gear.copy(), 8))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 16),
                    setStackSize(PlasmaList.Thorium_Plasma.copy(), 144 * 2))
                .itemOutputs(TecTechList.Celestial_Matter_Guidance_Casing)
                .eut(RECIPE_UIV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Boundless Gravitationally Severed Structure Casing"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Mellion_Frame_Box.copy(), 16),
                    setStackSize(FrameBoxList.Six_Phased_Copper_Frame_Box.copy(), 16),
                    setStackSize(FrameBoxList.Transcendent_Metal_Frame_Box.copy(), 8),
                    setStackSize(FrameBoxList.Astral_Titanium_Frame_Box.copy(), 8),

                    setStackSize(PlateList.Creon_Plate.copy(), 6),
                    setStackSize(GTItemList.Stable_Boson_Containment_Unit.copy(), 1),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 2),
                    setStackSize(AmunRaList.Artificial_Gravity_Generator.copy(), 4))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 16),
                    setStackSize(PlasmaList.Lead_Plasma.copy(), 144 * 2))
                .itemOutputs(TecTechList.Boundless_Gravitationally_Severed_Structure_Casing)
                .eut(RECIPE_UIV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Stellar Energy Siphon Casing"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(TecTechList.Boundless_Gravitationally_Severed_Structure_Casing.copy(), 1),
                    setStackSize(GTBlockList.Hypogen_Coil_Block.copy(), 64 * 2),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 4),
                    setStackSize(GTItemList.Neutronium_Heat_Capacitor_1G.copy(), 2),

                    setStackSize(HatchList.Laser_Target_Hatch1048576_UIV.copy(), 1),
                    setStackSize(MachineList.Plasma_Generator_UV.copy(), 64),
                    setStackSize(DensePlateList.Dense_Creon_Plate.copy(), 6),
                    setStackSize(PlateList.Hypogen_Plate.copy(), 6))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 16),
                    setStackSize(MoltenList.Molten_Superconductor_Base_UIV.copy(), 144 * 32),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(), 1000 * 64 * 2))
                .itemOutputs(TecTechList.Stellar_Energy_Siphon_Casing)
                .eut(RECIPE_UIV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Medial Graviton Flow Modulator"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(TecTechList.Transcendentally_Amplified_Magnetic_Confinement_Casing.copy(), 1),
                    setStackSize(GoodGeneratorList.Temporal_Field_Restriction_Coil.copy(), 1),
                    setStackSize(DensePlateList.Dense_Creon_Plate.copy(), 8),
                    setStackSize(GearList.Mellion_Gear.copy(), 4),

                    setStackSize(GTPPList.Graviton_Anomaly.copy(), 4),
                    setStackSize(GTPPList.Quantum_Anomaly.copy(), 8),
                    setStackSize(GTItemList.Emitter_UMV.copy(), 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 8),

                    setStackSize(GTItemList.Silver_Nanites.copy(), 2),
                    setStackSize(GTItemList.Gold_Nanites.copy(), 2))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64),
                    setStackSize(MoltenList.Molten_Superconductor_Base_UMV.copy(), 144 * 64),
                    setStackSize(MoltenList.Molten_SpaceTime.copy(), 144 * 64))
                .itemOutputs(TecTechList.Medial_Graviton_Flow_Modulator)
                .eut(RECIPE_UMV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Central Graviton Flow Modulator"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(TecTechList.Transcendentally_Amplified_Magnetic_Confinement_Casing.copy(), 1),
                    setStackSize(GoodGeneratorList.Temporal_Field_Restriction_Coil.copy(), 4),
                    setStackSize(SuperdensePlateList.Superdense_Creon_Plate.copy(), 8),
                    setStackSize(GearList.Mellion_Gear.copy(), 64),

                    setStackSize(GTPPList.SpaceTime_Continuum_Ripper.copy(), 8),
                    setStackSize(GTPPList.Graviton_Anomaly.copy(), 8),
                    setStackSize(GTPPList.Quantum_Anomaly.copy(), 8),
                    setStackSize(GTItemList.Emitter_UXV.copy(), 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.MAX, 8),
                    setStackSize(GTItemList.Silver_Nanites.copy(), 8),
                    setStackSize(GTItemList.Gold_Nanites.copy(), 8),
                    setStackSize(GTItemList.Six_Phased_Copper_Nanites.copy(), 8),

                    setStackSize(GTItemList.Universium_Nanites.copy(), 8))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 4),
                    setStackSize(MoltenList.Molten_Superconductor_Base_UMV.copy(), 144 * 64 * 4),
                    setStackSize(MoltenList.Molten_White_Dwarf_Matter.copy(), 144 * 64 * 4),
                    setStackSize(MoltenList.Molten_Eternity.copy(), 144 * 64 * 4))
                .itemOutputs(TecTechList.Medial_Graviton_Flow_Modulator)
                .eut(RECIPE_UXV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Harmonic Phonon Transmission Conduit"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Transcendent_Metal_Frame_Box.copy(), 1),
                    setStackSize(LongRodList.Long_Creon_Rod.copy(), 12),
                    setStackSize(KekzTechList.TFFT_Storage_Field_Block_TierIX.copy(), 1),
                    setStackSize(GTItemList.Raw_Tesseract.copy(), 8),

                    setStackSize(GTItemList.Relativistic_Heat_Capacitor.copy(), 4),
                    setStackSize(GTItemList.Thermal_Superconductor.copy(), 6),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 4),
                    setStackSize(BoltList.Six_Phased_Copper_Bolt.copy(), 24))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64),
                    setStackSize(FluidList.Lossless_Phonon_Transfer_Medium.copy(), 1000),
                    setStackSize(PlasmaList.Plutonium_241_Plasma.copy(), 144 * 16))
                .itemOutputs(TecTechList.Harmonic_Phonon_Transmission_Conduit)
                .eut(RECIPE_UIV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Fusion Computer
        {
            // "Advanced Fusion Coil"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(BatteryList.Lapotronic_Energy_Orb_Cluster_Empty.copy(), 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 8),
                    setStackSize(PlateList.Neutronium_Plate.copy(), 8),

                    setStackSize(GTItemList.Emitter_UHV.copy(), 1),
                    setStackSize(GTItemList.Sensor_UHV.copy(), 1),
                    setStackSize(MultiMachineCasingList.Fusion_Coil_Block.copy(), 1))
                .fluidInputs(
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 8),
                    setStackSize(MoltenList.Molten_Cinobite_A243.copy(), 144 * 16),
                    setStackSize(MoltenList.Molten_Octiron.copy(), 144 * 16),
                    setStackSize(MoltenList.Molten_Astral_Titanium.copy(), 144 * 16))
                .itemOutputs(MultiMachineCasingList.Advanced_Fusion_Coil)
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Advanced Fusion Coil II"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(BatteryList.Energy_Module_Empty.copy(), 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 8),
                    setStackSize(PlateList.Rhugnor_Plate.copy(), 8),

                    setStackSize(GTItemList.Emitter_UEV.copy(), 1),
                    setStackSize(GTItemList.Sensor_UEV.copy(), 1),
                    setStackSize(GoodGeneratorList.Advanced_Compact_Fusion_Coil.copy(), 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Neptunium.copy(), 144 * 16),
                    setStackSize(MoltenList.Molten_Chromatic_Glass.copy(), 144 * 16),
                    setStackSize(MoltenList.Molten_Abyssal_Alloy.copy(), 144 * 16),
                    setStackSize(MoltenList.Molten_Dragonblood.copy(), 144 * 16))
                .itemOutputs(MultiMachineCasingList.Advanced_Fusion_Coil_II)
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fusion Machine Casing MK III"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.EV, 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 8),
                    setStackSize(BlockList.Block_of_Netherite.copy(), 2),
                    setStackSize(PlateList.Neutronium_Plate.copy(), 8),

                    setStackSize(GTItemList.Electric_Motor_UHV.copy(), 2),
                    setStackSize(GTItemList.Electric_Piston_UHV.copy(), 1),
                    setStackSize(MultiMachineCasingList.Fusion_Machine_Casing_MK_II.copy(), 1))
                .fluidInputs(
                    setStackSize(FluidList.UU_Matter.copy(), 1000),
                    setStackSize(MoltenList.Molten_Cinobite_A243.copy(), 144 * 4),
                    setStackSize(MoltenList.Molten_Octiron.copy(), 144 * 4),
                    setStackSize(MoltenList.Molten_Astral_Titanium.copy(), 144 * 4))
                .itemOutputs(MultiMachineCasingList.Fusion_Machine_Casing_MK_III)
                .eut(RECIPE_UHV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fusion Machine Casing MK IV"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 8),
                    setStackSize(BlockList.Block_of_Netherite.copy(), 8),
                    setStackSize(PlateList.Chromatic_Glass_Plate.copy(), 8),

                    setStackSize(GTItemList.Electric_Motor_UEV.copy(), 2),
                    setStackSize(GTItemList.Electric_Piston_UEV.copy(), 1),
                    setStackSize(MultiMachineCasingList.Fusion_Machine_Casing_MK_III.copy(), 1))
                .fluidInputs(
                    setStackSize(FluidList.Fermium.copy(), 144 * 8),
                    setStackSize(MoltenList.Molten_Chromatic_Glass.copy(), 144 * 8),
                    setStackSize(MoltenList.Molten_Abyssal_Alloy.copy(), 144 * 8),
                    setStackSize(MoltenList.Molten_Dragonblood.copy(), 144 * 8))
                .itemOutputs(MultiMachineCasingList.Fusion_Machine_Casing_MK_IV)
                .eut(RECIPE_UEV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Hollow Casing"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(TecTechList.Molecular_Casing.copy(), 1),
                setStackSize(DensePlateList.Dense_Europium_Plate.copy(), 2),
                setStackSize(QuadruplePlateList.Quadruple_Plutonium_239_Plate.copy(), 4),
                setStackSize(DoublePlateList.Double_Lead_Plate.copy(), 8),

                setStackSize(PlateList.Uranium_238_Plate.copy(), 16),
                setStackSize(ScrewList.Quantium_Screw.copy(), 16))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Trinium.copy(), 144 * 9),
                setStackSize(MoltenList.Molten_Osmium.copy(), 144 * 9),
                setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 2),
                setStackSize(GasList.Argon.copy(), 1000))
            .itemOutputs(setStackSize(TecTechList.Hollow_Casing.copy(), 2))
            .eut(RECIPE_UV)
            .duration(10 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Ion Thruster Base"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 16),
                setStackSize(GTBlockList.Battery_Buffer16_UHV.copy(), 2),
                setStackSize(GTItemList.Emitter_UHV.copy(), 4),
                setStackSize(GTItemList.Field_Generator_UHV.copy(), 2),

                setStackSize(AmunRaList.Nanite_Cluster.copy(), 1))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Infinity.copy(), 144 * 50),
                setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64),
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64))
            .itemOutputs(AmunRaList.Ion_Thruster_Base)
            .eut(RECIPE_UEV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Ion Thruster Jet"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 64),
                setStackSize(GoodGeneratorList.Advanced_Field_Restriction_Coil.copy(), 8),
                setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 2),
                setStackSize(GTItemList.Emitter_UHV.copy(), 16),

                setStackSize(GTItemList.Field_Generator_UHV.copy(), 8),
                setStackSize(AmunRaList.Nanite_Cluster.copy(), 4))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Infinity.copy(), 144 * 50),
                setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64),
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64))
            .itemOutputs(AmunRaList.Ion_Thruster_Base)
            .eut(RECIPE_UEV)
            .duration(360 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Lapotronic Capacitor
        {
            // "Lapotronic Capacitor (LuV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Osmiridium_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.Osmiridium_Screw.copy(), 24),
                    setStackSize(CircuitList.Multilayer_Fiber_Reinforced_Circuit_Board.copy(), 1),
                    setStackSize(FoilList.Naquadah_Alloy_Foil.copy(), 64),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 72),
                    setStackSize(CircuitList.High_Power_IC_Chip.copy(), 64),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 8),

                    setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 8),
                    setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 8),
                    setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 8),
                    setStackSize(FineWireList.Fine_Platinum_Wire.copy(), 64))
                .fluidInputs(setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 5))
                .itemOutputs(KekzTechList.Lapotronic_Capacitor_LuV)
                .eut(RECIPE_ZPM)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Lapotronic Capacitor (ZPM)" - 1
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(FrameBoxList.Naquadah_Alloy_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.Naquadah_Alloy_Screw.copy(), 24),
                    setStackSize(PlateList.Europium_Plate.copy(), 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),

                    setStackSize(BatteryList.Lapotronic_Energy_Orb_Cluster_Empty.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_LuV.copy(), 2),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 8),

                    setStackSize(CableList.Naquadah_Cable_1x.copy(), 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 20),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 16))
                .itemOutputs(KekzTechList.Lapotronic_Capacitor_ZPM)
                .eut(RECIPE_ZPM)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Lapotronic Capacitor (ZPM)" - 2
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),
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
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 60),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 16))
                .itemOutputs(KekzTechList.Lapotronic_Capacitor_ZPM)
                .eut(RECIPE_UV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Lapotronic Capacitor (ZPM)" - 3
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(3),

                    setStackSize(FrameBoxList.Naquadah_Alloy_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.Naquadah_Alloy_Screw.copy(), 24),
                    setStackSize(PlateList.Europium_Plate.copy(), 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),

                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 2),
                    setStackSize(GTItemList.Field_Generator_LuV.copy(), 2),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 8),

                    setStackSize(CableList.Naquadah_Cable_1x.copy(), 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 20),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 16))
                .itemOutputs(KekzTechList.Lapotronic_Capacitor_ZPM)
                .eut(RECIPE_UV)
                .duration(25 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Lapotronic Capacitor (UV)" - 1
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.Neutronium_Screw.copy(), 24),
                    setStackSize(PlateList.Americium_Plate.copy(), 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),

                    setStackSize(BatteryList.Energy_Module_Empty.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_ZPM.copy(), 2),
                    setStackSize(CircuitList.HPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 16),

                    setStackSize(CableList.Naquadah_Alloy_Cable_1x.copy(), 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 20),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 16))
                .itemOutputs(KekzTechList.Lapotronic_Capacitor_UV)
                .eut(RECIPE_ZPM)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Lapotronic Capacitor (UV)" - 2
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
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
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 180),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 144))
                .itemOutputs(KekzTechList.Lapotronic_Capacitor_UV)
                .eut(RECIPE_UV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Lapotronic Capacitor (UV)" - 3
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(3),

                    setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.Neutronium_Screw.copy(), 24),
                    setStackSize(PlateList.Americium_Plate.copy(), 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),

                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 4),
                    setStackSize(GTItemList.Field_Generator_ZPM.copy(), 2),
                    setStackSize(CircuitList.HPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 16),

                    setStackSize(CableList.Naquadah_Alloy_Cable_1x.copy(), 32))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 20),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 16))
                .itemOutputs(KekzTechList.Lapotronic_Capacitor_UV)
                .eut(RECIPE_UV)
                .duration(25 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Ultimate Capacitor (UHV)" - 1
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.Cosmic_Neutronium_Screw.copy(), 24),
                    setStackSize(DoublePlateList.Double_Neutronium_Plate.copy(), 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),

                    setStackSize(BatteryList.Ultimate_Battery_Empty.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 4),
                    setStackSize(CircuitList.UHPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 32),

                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 2))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 32),
                    setStackSize(MoltenList.Molten_Naquadria.copy(), 144 * 64),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 32))
                .itemOutputs(KekzTechList.Ultimate_Capacitor_UHV)
                .eut(RECIPE_UHV)
                .duration(200 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Ultimate Capacitor (UHV)" - 2
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 32),
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
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 160),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 32),
                    setStackSize(MoltenList.Molten_Naquadria.copy(), 144 * 64),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 160))
                .itemOutputs(KekzTechList.Ultimate_Capacitor_UHV)
                .eut(RECIPE_UEV)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Ultimate Capacitor (UHV)" - 3
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(3),

                    setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.Cosmic_Neutronium_Screw.copy(), 24),
                    setStackSize(DoublePlateList.Double_Neutronium_Plate.copy(), 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),

                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 16),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 2),
                    setStackSize(CircuitList.UHPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 32),

                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 2))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 32),
                    setStackSize(MoltenList.Molten_Naquadria.copy(), 144 * 64),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 32))
                .itemOutputs(KekzTechList.Ultimate_Capacitor_UHV)
                .eut(RECIPE_UEV)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Extremely Ultimate Capacitor (UEV)" - 1
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.Infinity_Screw.copy(), 24),
                    setStackSize(DoublePlateList.Double_Infinity_Catalyst_Plate.copy(), 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),

                    setStackSize(BatteryList.Really_Ultimate_Battery_Empty.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 4),
                    setStackSize(CircuitList.PPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 64),

                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 4))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64),
                    setStackSize(MoltenList.Molten_Quantium.copy(), 144 * 64 * 2),
                    setStackSize(MoltenList.Molten_Naquadria.copy(), 144 * 64 * 2),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64))
                .itemOutputs(KekzTechList.Extremely_Ultimate_Capacitor_UEV)
                .eut(RECIPE_UHV)
                .duration(640 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Extremely Ultimate Capacitor (UEV)" - 2
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),
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
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 320),
                    setStackSize(MoltenList.Molten_Quantium.copy(), 144 * 64 * 2),
                    setStackSize(MoltenList.Molten_Naquadria.copy(), 144 * 64 * 10),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 320))
                .itemOutputs(KekzTechList.Extremely_Ultimate_Capacitor_UEV)
                .eut(RECIPE_UEV)
                .duration(320 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Extremely Ultimate Capacitor (UEV)" - 3
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(3),

                    setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.Infinity_Screw.copy(), 24),
                    setStackSize(DoublePlateList.Double_Infinity_Catalyst_Plate.copy(), 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),

                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 32),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 2),
                    setStackSize(CircuitList.PPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 64),

                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 4))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64),
                    setStackSize(MoltenList.Molten_Quantium.copy(), 144 * 64 * 2),
                    setStackSize(MoltenList.Molten_Naquadria.copy(), 144 * 64 * 2),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64))
                .itemOutputs(KekzTechList.Extremely_Ultimate_Capacitor_UEV)
                .eut(RECIPE_UEV)
                .duration(160 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Insanely Ultimate Capacitor (UIV)" - 1
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(FrameBoxList.Transcendent_Metal_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.Transcendent_Metal_Screw.copy(), 24),
                    setStackSize(DoublePlateList.Double_Hypogen_Plate.copy(), 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 4),

                    setStackSize(BatteryList.Extremely_Ultimate_Battery_Empty.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UIV.copy(), 4),
                    setStackSize(CircuitList.QPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Living_Crystal_Chip.copy(), 64),

                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),
                    setStackSize(CircuitList.Optical_SMD_Inductor.copy(), 32),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 8))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 2),
                    setStackSize(MoltenList.Molten_Celestial_Tungsten.copy(), 144 * 64 * 2),
                    setStackSize(MoltenList.Molten_Quantium.copy(), 144 * 64 * 2),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64 * 2))
                .itemOutputs(KekzTechList.Insanely_Ultimate_Capacitor_UIV)
                .eut(RECIPE_UIV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Insanely Ultimate Capacitor (UIV)" - 2
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 4),
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
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 10),
                    setStackSize(MoltenList.Molten_Celestial_Tungsten.copy(), 144 * 64 * 8),
                    setStackSize(MoltenList.Molten_Quantium.copy(), 144 * 64 * 18),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64 * 10))
                .itemOutputs(KekzTechList.Insanely_Ultimate_Capacitor_UIV)
                .eut(RECIPE_UMV)
                .duration(150 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Insanely Ultimate Capacitor (UIV)" - 3
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(3),

                    setStackSize(FrameBoxList.Transcendent_Metal_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.Transcendent_Metal_Screw.copy(), 24),
                    setStackSize(DoublePlateList.Double_Hypogen_Plate.copy(), 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 4),

                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 64),
                    setStackSize(GTItemList.Field_Generator_UIV.copy(), 2),
                    setStackSize(CircuitList.QPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Living_Crystal_Chip.copy(), 64),

                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),
                    setStackSize(CircuitList.Optical_SMD_Inductor.copy(), 32),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 8))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 2),
                    setStackSize(MoltenList.Molten_Celestial_Tungsten.copy(), 144 * 64 * 2),
                    setStackSize(MoltenList.Molten_Quantium.copy(), 144 * 64 * 2),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64 * 2))
                .itemOutputs(KekzTechList.Insanely_Ultimate_Capacitor_UIV)
                .eut(RECIPE_UMV)
                .duration(75 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mega Ultimate Capacitor (UMV)" - 1
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(FrameBoxList.SpaceTime_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.SpaceTime_Screw.copy(), 24),
                    setStackSize(DoublePlateList.Double_Dragonblood_Plate.copy(), 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 4),

                    setStackSize(BatteryList.Insanely_Ultimate_Battery_Empty.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UMV.copy(), 4),
                    setStackSize(CircuitList.FPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Living_Bio_Chip.copy(), 64),

                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),
                    setStackSize(CircuitList.Optical_SMD_Inductor.copy(), 64),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 64 * 16))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 4),
                    setStackSize(MoltenList.Molten_Astral_Titanium.copy(), 144 * 64 * 4),
                    setStackSize(MoltenList.Molten_Celestial_Tungsten.copy(), 144 * 64 * 4),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64 * 4))
                .itemOutputs(KekzTechList.Mega_Ultimate_Capacitor_UMV)
                .eut(RECIPE_UIV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mega Ultimate Capacitor (UMV)" - 2
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 4),
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
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 20),
                    setStackSize(MoltenList.Molten_Astral_Titanium.copy(), 144 * 64 * 12),
                    setStackSize(MoltenList.Molten_Celestial_Tungsten.copy(), 144 * 64 * 20),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64 * 20))
                .itemOutputs(KekzTechList.Mega_Ultimate_Capacitor_UMV)
                .eut(RECIPE_UMV)
                .duration(150 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mega Ultimate Capacitor (UMV)" - 3
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(3),

                    setStackSize(FrameBoxList.SpaceTime_Frame_Box.copy(), 4),
                    setStackSize(ScrewList.SpaceTime_Screw.copy(), 24),
                    setStackSize(DoublePlateList.Double_Dragonblood_Plate.copy(), 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 4),

                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 128),
                    setStackSize(GTItemList.Field_Generator_UMV.copy(), 2),
                    setStackSize(CircuitList.FPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Living_Bio_Chip.copy(), 64),

                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),
                    setStackSize(CircuitList.Optical_SMD_Inductor.copy(), 64),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 64 * 64))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 4),
                    setStackSize(MoltenList.Molten_Astral_Titanium.copy(), 144 * 64 * 4),
                    setStackSize(MoltenList.Molten_Celestial_Tungsten.copy(), 144 * 64 * 4),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64 * 4))
                .itemOutputs(KekzTechList.Mega_Ultimate_Capacitor_UMV)
                .eut(RECIPE_UMV)
                .duration(75 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Laser Vacuum Mirror"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(TecTechList.High_Power_Casing.copy(), 1),
                setStackSize(GTBlockList.Laser_Vacuum_Pipe.copy(), 4),
                setStackSize(DensePlateList.Dense_Chromatic_Glass_Plate.copy(), 1),
                setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 2),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 1))
            .fluidInputs(setStackSize(FluidList.pH_Neutralized_Water_Grade_4.copy(), 1000 * 4))
            .itemOutputs(GTBlockList.Laser_Vacuum_Mirror)
            .eut(RECIPE_UHV)
            .duration(10 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Magnetic Anchor Casing"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GoodGeneratorList.Magnetic_Flux_Casing.copy(), 16),
                setStackSize(MultiMachineCasingList.Transcendentally_Amplified_Magnetic_Confinement_Casing.copy(), 16),
                setStackSize(GTItemList.Field_Generator_UMV.copy(), 1),
                setStackSize(SuperdensePlateList.Superdense_Magmatter_Plate.copy(), 1),
                setStackSize(WireList.Superconductor_UMV_Wire_8x.copy(), 8),
                setStackSize(DensePlateList.Dense_Shirabon_Plate.copy(), 64))
            .fluidInputs(
                setStackSize(FluidList.Spatially_Enlarged_Fluid.copy(), 144 * 64),
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64),
                setStackSize(MoltenList.Molten_Magnetohydrodynamically_Constrained_Star_Matter.copy(), 16))
            .itemOutputs(setStackSize(MultiMachineCasingList.Magnetic_Anchor_Casing.copy(), 4))
            .eut(RECIPE_UMV)
            .duration(20 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Molecular Coil"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(TecTechList.Hollow_Casing.copy(), 1),
                setStackSize(MultiMachineCasingList.Fusion_Coil_Block.copy(), 2),
                setStackSize(MultiMachineCasingList.Naquadah_Alloy_Coil_Block.copy(), 2),
                setStackSize(FineWireList.Fine_Europium_Wire.copy(), 64),

                setStackSize(FoilList.Europium_Foil.copy(), 64))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Glass_GregTech.copy(), 144 * 16),
                setStackSize(MoltenList.Molten_Silicone_Rubber.copy(), 144 * 13),
                setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 2),
                setStackSize(MoltenList.Molten_Trinium.copy(), 144 * 8))
            .itemOutputs(setStackSize(TecTechList.Molecular_Coil.copy(), 4))
            .eut(RECIPE_UV)
            .duration(25 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Nanochip Assembly Complex
        {
            // "Nanochip Computational Matrix Casing"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Nanochip_Mesh_Interface_Casing.copy(), 4),
                    setStackSize(HatchList.Computer_Rack.copy(), 1),
                    setStackSize(Appliedenergistics2List.ME_Storage_Component_16384k.copy(), 1),
                    setStackSize(AE2FluidCraftingList.ME_Fluid_Storage_Component_16384k.copy(), 1),

                    setStackSize(OpenComputersList.Server_Tier4.copy(), 1),
                    setStackSize(CircuitList.Optically_Perfected_CPU.copy(), 2),
                    setStackSize(CircuitList.Optically_Compatible_Memory.copy(), 2),
                    setStackSize(GTBlockList.Optical_Fiber_Cable.copy(), 16))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 16),
                    setStackSize(FluidList.Xenoxene.copy(), 144 * 16),
                    setStackSize(MoltenList.Molten_Purified_Tengam.copy(), 144 * 16))
                .itemOutputs(setStackSize(MultiMachineCasingList.Nanochip_Computational_Matrix_Casing.copy(), 4))
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Nanochip Firewall Projection Casing"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Nanochip_Reinforcement_Casing.copy(), 1),
                    setStackSize(MachineList.Monster_Repellator_UV.copy(), 4),
                    setStackSize(SuperdensePlateList.Superdense_Superconductor_Base_UHV_Plate.copy(), 2),
                    setStackSize(SuperdensePlateList.Superdense_Attuned_Tengam_Plate.copy(), 8),

                    setStackSize(GTItemList.Emitter_UEV.copy(), 2),
                    setStackSize(GTItemList.Sensor_UEV.copy(), 2),
                    setStackSize(SingularityList.Nether_Star_Singularity.copy(), 1),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 1))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 2),
                    setStackSize(GasList.Oganesson.copy(), 1000 * 16),
                    setStackSize(MoltenList.Molten_Superconductor_Base_UEV.copy(), 144 * 16),
                    setStackSize(MoltenList.Molten_Radox_Polymer.copy(), 144 * 4))
                .itemOutputs(MultiMachineCasingList.Nanochip_Firewall_Projection_Casing)
                .eut(RECIPE_UEV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Naquadah Fuel Refinery"
        {
            // "Advanced Field Restriction Coil"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box.copy(), 1),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UHV.copy(), 8),
                    setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 64 * 4),

                    setStackSize(DensePlateList.Dense_Infinity_Plate.copy(), 8),
                    setStackSize(PipeList.Neutronium_Fluid_Pipe.copy(), 16),
                    setStackSize(CircuitList.PPIC_Wafer.copy(), 48),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 1))
                .fluidInputs(
                    setStackSize(PlasmaList.Radon_Plasma.copy(), 1000),
                    setStackSize(MoltenList.Molten_Awakened_Draconium.copy(), 144 * 64),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 128))
                .itemOutputs(GoodGeneratorList.Advanced_Field_Restriction_Coil)
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Field Restriction Coil"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Osmium_Frame_Box.copy(), 1),
                    setStackSize(GTItemList.Field_Generator_UV.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UV.copy(), 8),
                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 64 * 2),

                    setStackSize(DensePlateList.Dense_Americium_Plate.copy(), 8),
                    setStackSize(PipeList.Black_Plutonium_Item_Pipe.copy(), 16),
                    setStackSize(CircuitList.PPIC_Wafer.copy(), 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 8))
                .fluidInputs(
                    setStackSize(GasList.Krypton.copy(), 1000),
                    setStackSize(MoltenList.Molten_Fluxed_Electrum.copy(), 144 * 64),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 128))
                .itemOutputs(GoodGeneratorList.Field_Restriction_Coil)
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Naquadah Fuel Refinery Casing"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Thulium_Frame_Box.copy(), 1),
                    setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 6),
                    setStackSize(GTItemList.Field_Generator_IV.copy(), 2),
                    setStackSize(PipeList.Tiny_Naquadah_Fluid_Pipe.copy(), 16),

                    setStackSize(FineWireList.Fine_Naquadah_Alloy_Wire.copy(), 64),
                    setStackSize(FineWireList.Fine_Manyullyn_Wire.copy(), 64),
                    setStackSize(PlateList.Orundum_Plate.copy(), 4))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Tungstensteel.copy(), 144 * 8),
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 16))
                .itemOutputs(GTNHLanthanidesList.Focus_Manipulator)
                .eut(RECIPE_ZPM)
                .duration(25 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Temporal Field Restriction Coil"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.SpaceTime_Frame_Box.copy(), 1),
                    setStackSize(GTItemList.Field_Generator_UIV.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 8),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 8),

                    setStackSize(DensePlateList.Dense_SpaceTime_Plate.copy(), 8),
                    setStackSize(PipeList.SpaceTime_Fluid_Pipe.copy(), 16),
                    setStackSize(CircuitList.PPIC_Wafer.copy(), 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Metastable_Oganesson.copy(), 1000),
                    setStackSize(MoltenList.Molten_Transcendent_Metal.copy(), 144 * 64),
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 64))
                .itemOutputs(GoodGeneratorList.Temporal_Field_Restriction_Coil)
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Ultimate Field Restriction Coil"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 1),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UEV.copy(), 8),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 8),

                    setStackSize(DensePlateList.Dense_Transcendent_Metal_Plate.copy(), 8),
                    setStackSize(PipeList.Infinity_Fluid_Pipe.copy(), 16),
                    setStackSize(CircuitList.PPIC_Wafer.copy(), 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 1))
                .fluidInputs(
                    setStackSize(GasList.Oganesson.copy(), 1000),
                    setStackSize(MoltenList.Molten_Neutronium.copy(), 144 * 64),
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 64))
                .itemOutputs(GoodGeneratorList.Ultimate_Field_Restriction_Coil)
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Particle Beam Guidance Pipe Casing"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box.copy(), 16),
                setStackSize(FrameBoxList.Naquadria_Frame_Box.copy(), 16),
                setStackSize(FrameBoxList.Naquadah_Alloy_Frame_Box.copy(), 16),
                setStackSize(FrameBoxList.Bedrockium_Frame_Box.copy(), 16),

                setStackSize(FoilList.Infinity_Foil.copy(), 64),
                setStackSize(FoilList.Cosmic_Neutronium_Foil.copy(), 64),
                setStackSize(FoilList.Superconductor_Base_UHV_Foil.copy(), 64),
                setStackSize(FoilList.Draconium_Foil.copy(), 64),

                setStackSize(GTItemList.Electric_Pump_UEV.copy(), 1),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 2),
                setStackSize(PipeList.Quadruple_Infinity_Fluid_Pipe.copy(), 16))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Infinity.copy(), 144 * 32),
                setStackSize(MoltenList.Molten_Tritanium.copy(), 144 * 32),
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 32),
                setStackSize(FluidList.Excited_Dimensionally_Transcendent_Resplendent_Catalyst.copy(), 1000 * 4))
            .itemOutputs(setStackSize(MultiMachineCasingList.Particle_Beam_Guidance_Pipe_Casing.copy(), 4))
            .eut(RECIPE_UIV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Precision Field Sync Casing"
        GTValues.RA.stdBuilder()
            .itemInputs(
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
                setStackSize(PlasmaList.Chromatic_Glass_Plasma.copy(), 144 * 64),
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64),
                setStackSize(MoltenList.Molten_Eternity.copy(), 144 * 64))
            .itemOutputs(setStackSize(MultiMachineCasingList.Precision_Field_Sync_Casing.copy(), 8))
            .eut(RECIPE_UMV)
            .duration(10 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Protomatter Activation Coil"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GoodGeneratorList.Ultimate_Field_Restriction_Coil.copy(), 1),
                setStackSize(GTItemList.Electric_Pump_UIV.copy(), 2),
                setStackSize(WireList.Superconductor_UIV_Wire_16x.copy(), 8),
                setStackSize(SuperdensePlateList.Superdense_Infinity_Plate.copy(), 1),
                setStackSize(RotorList.Proto_Halkonite_Steel_Rotor.copy(), 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 1),
                setStackSize(GTItemList.Field_Generator_UEV.copy(), 4))
            .fluidInputs(
                setStackSize(FluidList.Protomatter.copy(), 100),
                setStackSize(MoltenList.Molten_Transcendent_Metal.copy(), 144 * 16),
                setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000))
            .itemOutputs(setStackSize(GoodGeneratorList.Protomatter_Activation_Coil.copy(), 4))
            .eut(RECIPE_UIV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Primary Exo-Foundry Casing"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(FrameBoxList.Netherite_Frame_Box.copy(), 1),
                setStackSize(CircuitList.Optically_Perfected_CPU.copy(), 8),
                setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 8),
                setStackSize(ScrewList.Infinity_Screw.copy(), 6),

                setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 8))
            .fluidInputs(
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 4),
                setStackSize(GasList.Oganesson.copy(), 500),
                setStackSize(MoltenList.Molten_Cosmic_Neutronium.copy(), 144 * 2))
            .itemOutputs(MultiMachineCasingList.Primary_Exo_Foundry_Casing)
            .eut(RECIPE_UEV)
            .duration(15 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Quantum Force Transformer"
        {
            // "Neutron Pulse Manipulator"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTPPList.Force_Field_Glass.copy(), 1),
                    setStackSize(GTItemList.Carbon_Nanites.copy(), 4),
                    setStackSize(GTItemList.Emitter_UV.copy(), 4),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 2),

                    setStackSize(GTPPList.Quantum_Anomaly.copy(), 1),
                    setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 2))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Thulium.copy(), 144 * 10),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Crude_Catalyst.copy(), 1000 * 5),
                    setStackSize(PlasmaList.Neptunium_Plasma.copy(), 500),
                    setStackSize(PlasmaList.Fermium_Plasma.copy(), 500))
                .itemOutputs(GTPPList.Neutron_Pulse_Manipulator)
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Neutron Shielding Core"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Quantum_Frame_Box.copy(), 1),
                    setStackSize(DensePlateList.Dense_Precious_Metals_Alloy_Plate.copy(), 4),
                    setStackSize(SuperdensePlateList.Superdense_Netherite_Plate.copy(), 2),
                    setStackSize(GTItemList.Field_Generator_UV.copy(), 1),

                    setStackSize(ScrewList.Chromatic_Glass_Screw.copy(), 16))
                .fluidInputs(setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 10))
                .itemOutputs(GTPPList.Neutron_Shielding_Core)
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Cosmic Fabric Manipulator"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTPPList.Force_Field_Glass.copy(), 2),
                    setStackSize(GTItemList.Carbon_Nanites.copy(), 8),
                    setStackSize(GTItemList.Emitter_UEV.copy(), 4),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 2),

                    setStackSize(GTPPList.Quantum_Anomaly.copy(), 1),
                    setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 4),
                    setStackSize(GTItemList.Hyper_Stable_Self_Healing_Adhesive.copy(), 4))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Thulium.copy(), 144 * 12),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Prosaic_Catalyst.copy(), 1000 * 5),
                    setStackSize(PlasmaList.Neptunium_Plasma.copy(), 2500),
                    setStackSize(PlasmaList.Fermium_Plasma.copy(), 2500))
                .itemOutputs(GTPPList.Cosmic_Fabric_Manipulator)
                .eut(RECIPE_UIV)
                .duration(75 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Cosmic Fabric Shielding Core"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Quantum_Frame_Box.copy(), 2),
                    setStackSize(DensePlateList.Dense_Enriched_Naquadah_Alloy_Plate.copy(), 4),
                    setStackSize(SuperdensePlateList.Superdense_Infinity_Plate.copy(), 2),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 1),

                    setStackSize(ScrewList.Radox_Polymer_Screw.copy(), 16),
                    setStackSize(GTItemList.Hyper_Stable_Self_Healing_Adhesive.copy(), 4))
                .fluidInputs(setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 20))
                .itemOutputs(GTPPList.Cosmic_Fabric_Shielding_Core)
                .eut(RECIPE_UIV)
                .duration(75 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Infinity Infused Manipulator"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTPPList.Force_Field_Glass.copy(), 4),
                    setStackSize(GTItemList.Carbon_Nanites.copy(), 16),
                    setStackSize(GTItemList.Emitter_UIV.copy(), 4),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 2),

                    setStackSize(GTPPList.Quantum_Anomaly.copy(), 1),
                    setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 8),
                    setStackSize(GTItemList.Superconductor_Rare_Earth_Composite.copy(), 4))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Thulium.copy(), 144 * 15),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Resplendent_Catalyst.copy(), 1000 * 5),
                    setStackSize(PlasmaList.Neptunium_Plasma.copy(), 1000 * 10),
                    setStackSize(PlasmaList.Fermium_Plasma.copy(), 1000 * 10))
                .itemOutputs(GTPPList.Infinity_Infused_Manipulator)
                .eut(RECIPE_UMV)
                .duration(90 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Infinity Infused Shielding Core"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Quantum_Frame_Box.copy(), 4),
                    setStackSize(DensePlateList.Dense_Hypogen_Plate.copy(), 4),
                    setStackSize(SuperdensePlateList.Superdense_Proto_Halkonite_Steel_Plate.copy(), 2),
                    setStackSize(GTItemList.Field_Generator_UIV.copy(), 1),

                    setStackSize(ScrewList.Metastable_Oganesson_Screw.copy(), 16),
                    setStackSize(GTItemList.Superconductor_Rare_Earth_Composite.copy(), 4))
                .fluidInputs(setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 40))
                .itemOutputs(GTPPList.Infinity_Infused_Shielding_Core)
                .eut(RECIPE_UMV)
                .duration(90 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "SpaceTime Continuum Ripper"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTPPList.Force_Field_Glass.copy(), 8),
                    setStackSize(GTItemList.Carbon_Nanites.copy(), 32),
                    setStackSize(GTItemList.Emitter_UMV.copy(), 4),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 64 * 2),

                    setStackSize(GTPPList.Quantum_Anomaly.copy(), 1),
                    setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 16),
                    setStackSize(GTItemList.Black_Body_Naquadria_Supersolid.copy(), 4))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Thulium.copy(), 144 * 20),
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(), 1000 * 5),
                    setStackSize(PlasmaList.Neptunium_Plasma.copy(), 1000 * 20),
                    setStackSize(PlasmaList.Fermium_Plasma.copy(), 1000 * 20))
                .itemOutputs(GTPPList.SpaceTime_Continuum_Ripper)
                .eut(RECIPE_UXV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "SpaceTime Bending Core"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Quantum_Frame_Box.copy(), 4),
                    setStackSize(DensePlateList.Dense_Shirabon_Plate.copy(), 4),
                    setStackSize(SuperdensePlateList.Superdense_SpaceTime_Plate.copy(), 2),
                    setStackSize(GTItemList.Field_Generator_UMV.copy(), 1),

                    setStackSize(ScrewList.Dilithium_Screw.copy(), 16),
                    setStackSize(GTItemList.Black_Body_Naquadria_Supersolid.copy(), 4))
                .fluidInputs(setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 80))
                .itemOutputs(GTPPList.SpaceTime_Bending_Core)
                .eut(RECIPE_UXV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Quark Exclusion Casing"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(FrameBoxList.Superconductor_Base_UHV_Frame_Box.copy(), 32),
                setStackSize(FrameBoxList.Ledox_Frame_Box.copy(), 32),
                setStackSize(FrameBoxList.Callisto_Ice_Frame_Box.copy(), 32),
                setStackSize(FrameBoxList.Enriched_Holmium_Frame_Box.copy(), 32),

                setStackSize(PlateList.Superconductor_Base_UHV_Plate.copy(), 32),
                setStackSize(PlateList.Ledox_Plate.copy(), 32),
                setStackSize(PlateList.Callisto_Ice_Plate.copy(), 32),
                setStackSize(PlateList.Enriched_Holmium_Plate.copy(), 32),

                setStackSize(GTItemList.Field_Generator_UHV.copy(), 1),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 8),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),
                setStackSize(PipeList.Infinity_Fluid_Pipe.copy(), 32))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Superconductor_Base_UHV.copy(), 144 * 64),
                setStackSize(MoltenList.Molten_Ledox.copy(), 144 * 64),
                setStackSize(MoltenList.Molten_Callisto_Ice.copy(), 144 * 64),
                setStackSize(FluidList.Excited_Dimensionally_Transcendent_Resplendent_Catalyst.copy(), 1000 * 8))
            .itemOutputs(setStackSize(MultiMachineCasingList.Quark_Exclusion_Casing.copy(), 8))
            .eut(RECIPE_UIV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Rocket Engine Base"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GTNHIntergalacticList.Ultra_High_Temperature_Resistant_Mesh.copy(), 64),
                setStackSize(GTBlockList.Quantum_Tank_IV.copy(), 2),
                setStackSize(GTItemList.Electric_Pump_UHV.copy(), 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 2),

                setStackSize(AmunRaList.Nanite_Cluster.copy(), 1))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Infinity.copy(), 144 * 50),
                setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64),
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64))
            .itemOutputs(AmunRaList.Rocket_Engine_Base)
            .eut(RECIPE_UHV)
            .duration(50 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Rocket Engine Jet"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GTNHIntergalacticList.Ultra_High_Temperature_Resistant_Mesh.copy(), 64 * 4),
                setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4.copy(), 64),
                setStackSize(PipeList.Huge_Infinity_Fluid_Pipe.copy(), 8),
                setStackSize(GTItemList.Electric_Pump_UHV.copy(), 16),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 8),
                setStackSize(AmunRaList.Nanite_Cluster.copy(), 4))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Infinity.copy(), 144 * 50),
                setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64),
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64))
            .itemOutputs(AmunRaList.Rocket_Engine_Jet)
            .eut(RECIPE_UHV)
            .duration(300 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Solenoid Superconductor Coil
        {
            // "LuV Solenoid Superconductor Coil"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 16),
                    setStackSize(CableList.HSSG_Cable_4x.copy(), 2),
                    setStackSize(PipeList.Niobium_Titanium_Fluid_Pipe.copy(), 1),
                    setStackSize(LongRodList.Long_Mu_metal_Rod.copy(), 8),

                    setStackSize(DoublePlateList.Double_HSSS_Plate.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_LuV.copy(), 1))
                .fluidInputs(setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 4))
                .itemOutputs(MultiMachineCasingList.LuV_Solenoid_Superconductor_Coil)
                .eut(RECIPE_LuV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "ZPM Solenoid Superconductor Coil"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 16),
                    setStackSize(CableList.Naquadah_Cable_4x.copy(), 2),
                    setStackSize(PipeList.Enderium_Fluid_Pipe.copy(), 1),
                    setStackSize(LongRodList.Long_Mu_metal_Rod.copy(), 8),

                    setStackSize(DoublePlateList.Double_Naquadah_Alloy_Plate.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 1))
                .fluidInputs(setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 4))
                .itemOutputs(MultiMachineCasingList.ZPM_Solenoid_Superconductor_Coil)
                .eut(RECIPE_ZPM)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UV Solenoid Superconductor Coil"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 32),
                    setStackSize(CableList.Fluxed_Electrum_Cable_4x.copy(), 2),
                    setStackSize(PipeList.Naquadah_Fluid_Pipe.copy(), 1),
                    setStackSize(LongRodList.Long_Naquadria_Rod.copy(), 8),

                    setStackSize(DoublePlateList.Double_Neutronium_Plate.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UV.copy(), 1))
                .fluidInputs(
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 16),
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 16))
                .itemOutputs(MultiMachineCasingList.UV_Solenoid_Superconductor_Coil)
                .eut(RECIPE_UV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UHV Solenoid Superconductor Coil"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 32),
                    setStackSize(CableList.Bedrockium_Cable_4x.copy(), 2),
                    setStackSize(PipeList.Neutronium_Fluid_Pipe.copy(), 1),
                    setStackSize(LongRodList.Long_Naquadria_Rod.copy(), 8),

                    setStackSize(DoublePlateList.Double_Cosmic_Neutronium_Plate.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UHV.copy(), 1))
                .fluidInputs(
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64),
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 64))
                .itemOutputs(MultiMachineCasingList.UHV_Solenoid_Superconductor_Coil)
                .eut(RECIPE_UHV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UEV Solenoid Superconductor Coil"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 32),
                    setStackSize(CableList.Draconium_Cable_4x.copy(), 2),
                    setStackSize(PipeList.Nether_Star_Fluid_Pipe.copy(), 1),
                    setStackSize(LongRodList.Long_Metastable_Oganesson_Rod.copy(), 8),

                    setStackSize(DoublePlateList.Double_Infinity_Plate.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UEV.copy(), 1))
                .fluidInputs(
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64 * 4),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 8))
                .itemOutputs(MultiMachineCasingList.UEV_Solenoid_Superconductor_Coil)
                .eut(RECIPE_UEV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UIV Solenoid Superconductor Coil"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 32),
                    setStackSize(CableList.Nether_Star_Cable_4x.copy(), 2),
                    setStackSize(PipeList.Awakened_Draconium_Fluid_Pipe.copy(), 1),
                    setStackSize(LongRodList.Long_Metastable_Oganesson_Rod.copy(), 8),

                    setStackSize(DoublePlateList.Double_Transcendent_Metal_Plate.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UIV.copy(), 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Transcendent_Metal.copy(), 144 * 32),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 32))
                .itemOutputs(MultiMachineCasingList.UIV_Solenoid_Superconductor_Coil)
                .eut(RECIPE_UIV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "UMV Solenoid Superconductor Coil"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 32),
                    setStackSize(CableList.Quantium_Cable_4x.copy(), 2),
                    setStackSize(PipeList.Infinity_Fluid_Pipe.copy(), 1),
                    setStackSize(LongRodList.Long_Infinity_Rod.copy(), 8),

                    setStackSize(DoublePlateList.Double_SpaceTime_Plate.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_UMV.copy(), 1))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_SpaceTime.copy(), 144 * 16),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 64 * 2))
                .itemOutputs(MultiMachineCasingList.UMV_Solenoid_Superconductor_Coil)
                .eut(RECIPE_UMV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Space Elevator
        {
            // "Space Elevator Base Casing"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 8),
                    setStackSize(ScrewList.Palladium_Screw.copy(), 32),
                    setStackSize(PlateList.Osmiridium_Plate.copy(), 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),

                    setStackSize(GTItemList.Electric_Piston_UV.copy(), 2),
                    setStackSize(RingList.Cosmic_Neutronium_Ring.copy(), 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 40),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 2),
                    setStackSize(MoltenList.Molten_Iridium.copy(), 144 * 8))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 8))
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Elevator Support Structure"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 8),
                    setStackSize(BoltList.Naquadria_Bolt.copy(), 16),
                    setStackSize(LongRodList.Long_Neutronium_Rod.copy(), 8),
                    setStackSize(DoublePlateList.Double_Osmiridium_Plate.copy(), 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 40),
                    setStackSize(FluidList.UU_Matter.copy(), 1000),
                    setStackSize(MoltenList.Molten_Iridium.copy(), 144 * 10))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Space_Elevator_Support_Structure.copy(), 8))
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Elevator Internal Structure"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(TecTechList.High_Power_Casing.copy(), 8),
                    setStackSize(BoltList.Palladium_Bolt.copy(), 16),
                    setStackSize(DoublePlateList.Double_Neutronium_Plate.copy(), 8))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 40),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 8),
                    setStackSize(FluidList.Wet_Concrete.copy(), 144 * 10))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Space_Elevator_Support_Structure.copy(), 8))
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Elevator Motor MK-I"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 1),
                    setStackSize(GTItemList.Electric_Motor_UV.copy(), 4),
                    setStackSize(RingList.Neutronium_Ring.copy(), 8),
                    setStackSize(RodList.Neutronium_Rod.copy(), 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 1),
                    setStackSize(ScrewList.Cosmic_Neutronium_Screw.copy(), 16),
                    setStackSize(PlateList.Osmiridium_Plate.copy(), 16))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 40),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 8),
                    setStackSize(MoltenList.Molten_Naquadria.copy(), 144 * 10),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 16))
                .itemOutputs(GTNHIntergalacticList.Space_Elevator_Motor_MKI)
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Elevator Motor MK-II"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 1),
                    setStackSize(GTItemList.Electric_Motor_UHV.copy(), 4),
                    setStackSize(RingList.Cosmic_Neutronium_Ring.copy(), 8),
                    setStackSize(RodList.Cosmic_Neutronium_Rod.copy(), 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 1),
                    setStackSize(ScrewList.Infinity_Screw.copy(), 16),
                    setStackSize(PlateList.Osmiridium_Plate.copy(), 16))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 40),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 8),
                    setStackSize(MoltenList.Molten_Naquadria.copy(), 144 * 10),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 16))
                .itemOutputs(GTNHIntergalacticList.Space_Elevator_Motor_MKII)
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Elevator Motor MK-III"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 1),
                    setStackSize(GTItemList.Electric_Motor_UEV.copy(), 4),
                    setStackSize(RingList.Infinity_Ring.copy(), 8),
                    setStackSize(RodList.Infinity_Rod.copy(), 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 1),
                    setStackSize(ScrewList.Transcendent_Metal_Screw.copy(), 16),
                    setStackSize(PlateList.Osmiridium_Plate.copy(), 16))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 20),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 8),
                    setStackSize(MoltenList.Molten_Naquadria.copy(), 144 * 10),
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 24))
                .itemOutputs(GTNHIntergalacticList.Space_Elevator_Motor_MKIII)
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Elevator Motor MK-IV"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 1),
                    setStackSize(GTItemList.Electric_Motor_UIV.copy(), 4),
                    setStackSize(RingList.Transcendent_Metal_Ring.copy(), 8),
                    setStackSize(RodList.Transcendent_Metal_Rod.copy(), 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 1),
                    setStackSize(ScrewList.SpaceTime_Screw.copy(), 16),
                    setStackSize(PlateList.Osmiridium_Plate.copy(), 16))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 20),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 8),
                    setStackSize(MoltenList.Molten_Naquadria.copy(), 144 * 10),
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 24))
                .itemOutputs(GTNHIntergalacticList.Space_Elevator_Motor_MKIV)
                .eut(RECIPE_UIV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Space Elevator Motor MK-V"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Base_Casing.copy(), 1),
                    setStackSize(GTItemList.Electric_Motor_UMV.copy(), 4),
                    setStackSize(RingList.SpaceTime_Ring.copy(), 8),
                    setStackSize(RodList.SpaceTime_Rod.copy(), 4),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 1),
                    setStackSize(ScrewList.Universium_Screw.copy(), 16),
                    setStackSize(PlateList.Osmiridium_Plate.copy(), 16))
                .fluidInputs(
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 20),
                    setStackSize(FluidList.UU_Matter.copy(), 1000 * 8),
                    setStackSize(MoltenList.Molten_Naquadria.copy(), 144 * 10),
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 24))
                .itemOutputs(GTNHIntergalacticList.Space_Elevator_Motor_MKV)
                .eut(RECIPE_UMV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Super Stock Replenisher"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(HatchList.Stocking_Input_Bus_ME.copy(), 1),
                setStackSize(HatchList.Stocking_Input_Hatch_ME.copy(), 1),
                setStackSize(Appliedenergistics2List.ME_Controller.copy(), 1),
                setStackSize(Appliedenergistics2List.ME_Chest.copy(), 1),

                setStackSize(Appliedenergistics2List.Capacity_Card.copy(), 4),
                setStackSize(Appliedenergistics2List.Hyper_Acceleration_Card.copy(), 4))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Naquadria.copy(), 144 * 8),
                setStackSize(MoltenList.Molten_Indalloy_140.copy(), 144 * 8),
                setStackSize(FluidList.Lubricant.copy(), 2000))
            .itemOutputs(AE2FluidCraftingList.Super_Stock_Replenisher)
            .eut(RECIPE_UV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Target Receptacle"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(FrameBoxList.Aluminium_Frame_Box.copy(), 1),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 4),
                setStackSize(GTItemList.Robot_Arm_LuV.copy(), 4),
                setStackSize(FineWireList.Fine_Gold_Wire.copy(), 16),

                setStackSize(WireList.Tungsten_Wire_1x.copy(), 2))
            .fluidInputs(
                setStackSize(MoltenList.Molten_Soldering_Alloy.copy(), 144 * 64),
                setStackSize(MoltenList.Molten_Gold_GregTech.copy(), 144 * 16),
                setStackSize(GasList.Argon.copy(), 1000))
            .itemOutputs(GTNHLanthanidesList.Focus_Manipulator)
            .eut(RECIPE_LuV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // TFFT Storage Field Block
        {
            // "TFFT Storage Field Block (Tier VI)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    setStackSize(MultiMachineCasingList.Hermetic_Casing_VII.copy(), 4),
                    setStackSize(QuadruplePlateList.Quadruple_Crystalline_Pink_Slime_Plate.copy(), 6),
                    setStackSize(PipeList.Nonuple_Naquadah_Fluid_Pipe.copy(), 3),
                    setStackSize(NewHorizonsCoreModList.Chrome_Bars.copy(), 6),

                    setStackSize(RotorList.Quantium_Rotor.copy(), 6),
                    setStackSize(GTItemList.Field_Generator_EV.copy(), 8),
                    setStackSize(GTItemList.Fluid_Regulator_LuV.copy(), 1),
                    setStackSize(NewHorizonsCoreModList.Fluid_Processor_Tier_II.copy(), 4))
                .fluidInputs(
                    setStackSize(MoltenList.Molten_Enderium_GregTech.copy(), 144 * 10),
                    setStackSize(MoltenList.Molten_Polybenzimidazole_PBI.copy(), 144 * 11))
                .itemOutputs(KekzTechList.TFFT_Storage_Field_Block_TierVI)
                .eut(RECIPE_LuV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "TFFT Storage Field Block (Tier VII)"
            GTValues.RA.stdBuilder()
                .itemInputs(
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
                    setStackSize(MoltenList.Molten_Crystalline_Alloy.copy(), 144 * 20),
                    setStackSize(MoltenList.Molten_Polybenzimidazole_PBI.copy(), 144 * 14))
                .itemOutputs(KekzTechList.TFFT_Storage_Field_Block_TierVII)
                .eut(RECIPE_UV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "TFFT Storage Field Block (Tier VIII)"
            GTValues.RA.stdBuilder()
                .itemInputs(
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
                    setStackSize(MoltenList.Molten_Crystalline_Pink_Slime.copy(), 144 * 30),
                    setStackSize(MoltenList.Molten_Radox_Polymer.copy(), 144 * 20))
                .itemOutputs(KekzTechList.TFFT_Storage_Field_Block_TierVIII)
                .eut(RECIPE_UEV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "TFFT Storage Field Block (Tier IX)"
            GTValues.RA.stdBuilder()
                .itemInputs(
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
                    setStackSize(MoltenList.Molten_Melodic_Alloy.copy(), 144 * 40),
                    setStackSize(MoltenList.Molten_Radox_Polymer.copy(), 144 * 24))
                .itemOutputs(KekzTechList.TFFT_Storage_Field_Block_TierIX)
                .eut(RECIPE_UMV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "TFFT Storage Field Block (Tier X)"
            GTValues.RA.stdBuilder()
                .itemInputs(
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
                    setStackSize(MoltenList.Molten_Stellar_Alloy.copy(), 144 * 50),
                    setStackSize(MoltenList.Molten_Radox_Polymer.copy(), 144 * 32))
                .itemOutputs(KekzTechList.TFFT_Storage_Field_Block_TierX)
                .eut(RECIPE_UXV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }
    }
}
