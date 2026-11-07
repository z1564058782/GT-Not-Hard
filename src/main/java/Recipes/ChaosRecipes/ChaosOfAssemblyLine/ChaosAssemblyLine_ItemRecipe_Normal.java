package Recipes.ChaosRecipes.ChaosOfAssemblyLine;

import static Recipes.ChaosRecipes.ChaosRecipeMap.AssemblyLineNormalRecipe;
import static gregtech.api.enums.TierEU.RECIPE_EV;
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
import EnumList.EnumItemList.EnumMaterialList.DrillTipList;
import EnumList.EnumItemList.EnumMaterialList.FineWireList;
import EnumList.EnumItemList.EnumMaterialList.FoilList;
import EnumList.EnumItemList.EnumMaterialList.FrameBoxList;
import EnumList.EnumItemList.EnumMaterialList.GearList;
import EnumList.EnumItemList.EnumMaterialList.LongRodList;
import EnumList.EnumItemList.EnumMaterialList.MiscPlateList;
import EnumList.EnumItemList.EnumMaterialList.PlateList;
import EnumList.EnumItemList.EnumMaterialList.QuintuplePlateList;
import EnumList.EnumItemList.EnumMaterialList.RingList;
import EnumList.EnumItemList.EnumMaterialList.RodList;
import EnumList.EnumItemList.EnumMaterialList.RotorList;
import EnumList.EnumItemList.EnumMaterialList.RoundList;
import EnumList.EnumItemList.EnumMaterialList.ScrewList;
import EnumList.EnumItemList.EnumMaterialList.SmallGearList;
import EnumList.EnumItemList.EnumMaterialList.SuperdensePlateList;
import EnumList.EnumItemList.EnumMiscList.SingularityList;
import EnumList.EnumItemList.EnumModList.AE2FluidCraftingList;
import EnumList.EnumItemList.EnumModList.AmunRaList;
import EnumList.EnumItemList.EnumModList.Appliedenergistics2List;
import EnumList.EnumItemList.EnumModList.AvaritiaList;
import EnumList.EnumItemList.EnumModList.DraconicEvolutionList;
import EnumList.EnumItemList.EnumModList.ExtraUtilitieList;
import EnumList.EnumItemList.EnumModList.GTNHIntergalacticList;
import EnumList.EnumItemList.EnumModList.GalacticraftList;
import EnumList.EnumItemList.EnumModList.GoodGeneratorList;
import EnumList.EnumItemList.EnumModList.KubaTechList;
import EnumList.EnumItemList.EnumModList.MatterManipulatorList;
import EnumList.EnumItemList.EnumModList.NewHorizonsCoreModList;
import EnumList.EnumItemList.EnumModList.OpenComputersList;
import EnumList.EnumItemList.EnumModList.TecTechList;
import EnumList.EnumItemList.EnumOreProductList.DustList;
import EnumList.EnumItemList.EnumOreProductList.GemList;
import EnumList.EnumItemList.EnumOreProductList.IngotList;
import EnumList.EnumItemList.EnumOreProductList.OreList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GTUtility;
import util.ChaosAssemblyRecipeBuilder;

public class ChaosAssemblyLine_ItemRecipe_Normal {

    public static void addChaosAssemblyLine_ItemRecipe_Normal() {
        // "Advanced Radiation Proof Plate"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#1")
            .itemInputsUnsafe(
                setStackSize(MiscPlateList.Radiation_Proof_Plate.copy(), 2),
                setStackSize(PlateList.Fluxed_Electrum_Plate.copy(), 4),
                setStackSize(PlateList.Trinium_Plate.copy(), 4),
                setStackSize(PlateList.Naquadah_Alloy_Plate.copy(), 4),

                setStackSize(PlateList.Osmiridium_Plate.copy(), 4),
                setStackSize(PlateList.Vibrant_Alloy_Plate.copy(), 4),
                setStackSize(MiscPlateList.Radiation_Proof_Prismatic_Naquadah_Composite_Sheet.copy(), 4))
            .fluidInputs(requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 8))
            .itemOutputs(setStackSize(MiscPlateList.Advanced_Radiation_Proof_Plate, 1))
            .eut(RECIPE_ZPM)
            .duration(50 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Bio Processing Unit"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#2")
            .itemInputsUnsafe(
                setStackSize(CircuitList.Ultra_Bio_Mutated_Circuit_Board.copy(), 1),
                setStackSize(CircuitList.Biocells.copy(), 16),
                setStackSize(GTItemList.Reinforced_Glass_Tube.copy(), 16),
                setStackSize(PipeList.Tiny_PBI_Fluid_Pipe.copy(), 16),

                setStackSize(CasingList.Fluxed_Electrum_Casing.copy(), 16),
                setStackSize(FoilList.Thin_Silicone_Rubber_Sheet.copy(), 64),
                setStackSize(BoltList.HSSS_Bolt.copy(), 32))
            .fluidInputs(
                requiredFluid(FluidList.Sterilized_Bio_Catalyst_Medium, 500),
                requiredFluid(FluidList.UU_Matter, 500),
                requiredFluid(FluidList.IC2_Coolant, 1000 * 2))
            .itemOutputs(setStackSize(CircuitList.Bio_Processing_Unit, 1))
            .eut(RECIPE_UHV)
            .duration(30 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // "Carbon Nanites"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#3")
            .itemInputsUnsafe(
                getMaterialInput(OrePrefixes.circuit, Materials.UV, 16),
                setStackSize(GTItemList.Robot_Arm_UV.copy(), 16),
                setStackSize(CircuitList.Stemcells.copy(), 32),
                setStackSize(RingList.Naquadah_Alloy_Ring.copy(), 32),

                setStackSize(RodList.Naquadah_Alloy_Rod.copy(), 16),
                setStackSize(DustList.Carbon_Dust.copy(), 64))
            .fluidInputs(
                requiredFluid(FluidList.UU_Matter, 1000 * 10),
                requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 32))
            .itemOutputs(setStackSize(GTItemList.Carbon_Nanites, 1))
            .eut(RECIPE_UV)
            .duration(50 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Charge Pack
        {
            // "Containment Unit I"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#4")
                .itemInputsUnsafe(
                    setStackSize(PlateList.Inconel_625_Plate.copy(), 16),
                    setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_8x.copy(), 32),
                    setStackSize(GearList.Inconel_625_Gear.copy(), 4),
                    setStackSize(GTPPList.Coil_Wire_EV.copy(), 64))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Zeron_100, 144 * 8),
                    requiredFluid(MoltenList.Molten_Hastelloy_N, 144 * 16),
                    requiredFluid(MoltenList.Molten_Lafium_Compound, 144 * 16))
                .itemOutputs(setStackSize(GTPPList.Containment_Unit_I, 1))
                .eut(RECIPE_LuV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Proton Cell Empty"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#5")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(GTPPList.Containment_Unit_I.copy(), 1),
                    setStackSize(GTItemList.Stable_Baryon_Containment_Unit.copy(), 16),
                    setStackSize(PlateList.Zeron_100_Plate.copy(), 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),

                    setStackSize(WireList.Yttrium_Barium_Cuprate_Wire_1x.copy(), 64 * 8),
                    setStackSize(BoltList.Trinium_Naquadah_Carbonite_Bolt.copy(), 8),
                    setStackSize(ScrewList.Inconel_625_Screw.copy(), 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Zeron_100, 144 * 16),
                    requiredFluid(MoltenList.Molten_Hastelloy_N, 144 * 32),
                    requiredFluid(MoltenList.Molten_Lafium_Compound, 144 * 16),
                    requiredFluid(MoltenList.Molten_Energy_Crystal, 144 * 16))
                .itemOutputs(setStackSize(GTPPList.Proton_Cell_Empty, 1))
                .eut(RECIPE_LuV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Proton Cell"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#6")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(GTPPList.Containment_Unit_I.copy(), 1),
                    setStackSize(GTItemList.Stable_Baryon_Containment_Unit.copy(), 16),
                    setStackSize(PlateList.Zeron_100_Plate.copy(), 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),

                    setStackSize(WireList.Yttrium_Barium_Cuprate_Wire_1x.copy(), 64 * 8),
                    setStackSize(BoltList.Trinium_Naquadah_Carbonite_Bolt.copy(), 8),
                    setStackSize(ScrewList.Inconel_625_Screw.copy(), 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Zeron_100, 144 * 16),
                    requiredFluid(MoltenList.Molten_Hastelloy_N, 144 * 32),
                    requiredFluid(MoltenList.Molten_Lafium_Compound, 144 * 16),
                    requiredFluid(MoltenList.Molten_Energy_Crystal, 144 * 16))
                .itemOutputs(setStackSize(GTPPList.Proton_Cell, 1))
                .eut(RECIPE_LuV)
                .duration(240 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Charge Pack [LuV] Empty"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#7")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(GTPPList.Proton_Cell_Empty.copy(), 2),
                    setStackSize(GTPPList.Coil_Wire_EV.copy(), 64),
                    setStackSize(PlateList.Zeron_100_Plate.copy(), 8),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),

                    getMaterialInput(OrePrefixes.circuit, Materials.IV, 8),
                    setStackSize(CableList.Nichrome_Cable_12x.copy(), 16),
                    setStackSize(ScrewList.Zeron_100_Screw.copy(), 16),
                    setStackSize(BoltList.Hastelloy_N_Bolt.copy(), 32),

                    setStackSize(GTItemList.Field_Generator_IV.copy(), 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Zeron_100, 144 * 16),
                    requiredFluid(MoltenList.Molten_Energy_Crystal, 144 * 16),
                    requiredFluid(MoltenList.Molten_Arcanite, 144 * 16),
                    requiredFluid(MoltenList.Molten_Inconel_792, 144 * 16))
                .itemOutputs(setStackSize(GTPPList.Charge_Pack_LuV_Empty, 1))
                .eut(RECIPE_LuV)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Charge Pack [LuV]"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#8")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(GTPPList.Proton_Cell_Empty.copy(), 2),
                    setStackSize(GTPPList.Coil_Wire_EV.copy(), 64),
                    setStackSize(PlateList.Zeron_100_Plate.copy(), 8),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),

                    getMaterialInput(OrePrefixes.circuit, Materials.IV, 8),
                    setStackSize(CableList.Nichrome_Cable_12x.copy(), 16),
                    setStackSize(ScrewList.Zeron_100_Screw.copy(), 16),
                    setStackSize(BoltList.Hastelloy_N_Bolt.copy(), 32),

                    setStackSize(GTItemList.Field_Generator_IV.copy(), 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Zeron_100, 144 * 16),
                    requiredFluid(MoltenList.Molten_Energy_Crystal, 144 * 16),
                    requiredFluid(MoltenList.Molten_Arcanite, 144 * 16),
                    requiredFluid(MoltenList.Molten_Inconel_792, 144 * 16))
                .itemOutputs(setStackSize(GTPPList.Charge_Pack_LuV, 1))
                .eut(RECIPE_LuV)
                .duration(360 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Containment Unit II"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#9")
                .itemInputsUnsafe(
                    setStackSize(PlateList.Zeron_100_Plate.copy(), 16),
                    setStackSize(CableList.Naquadah_Cable_8x.copy(), 32),
                    setStackSize(GearList.Zeron_100_Gear.copy(), 4),
                    setStackSize(GTPPList.Coil_Wire_IV.copy(), 64))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Pikyonium_64B, 144 * 8),
                    requiredFluid(MoltenList.Molten_Energy_Crystal, 144 * 16),
                    requiredFluid(MoltenList.Molten_Cinobite_A243, 144 * 16))
                .itemOutputs(setStackSize(GTPPList.Containment_Unit_II, 1))
                .eut(RECIPE_ZPM)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Electron Cell Empty"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#10")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(GTPPList.Containment_Unit_II.copy(), 1),
                    setStackSize(GTItemList.Stable_Lepton_Containment_Unit.copy(), 16),
                    setStackSize(PlateList.Pikyonium_64B_Plate.copy(), 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 8),

                    setStackSize(WireList.Naquadah_Wire_1x.copy(), 64 * 8),
                    setStackSize(BoltList.Arceus_Alloy_2B_Bolt.copy(), 8),
                    setStackSize(ScrewList.Zeron_100_Screw.copy(), 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Pikyonium_64B, 144 * 16),
                    requiredFluid(MoltenList.Molten_Energy_Crystal, 144 * 32),
                    requiredFluid(MoltenList.Molten_Cinobite_A243, 144 * 16),
                    requiredFluid(MoltenList.Molten_Trinium_Naquadah_Carbonite, 144 * 16))
                .itemOutputs(setStackSize(GTPPList.Electron_Cell_Empty, 1))
                .eut(RECIPE_ZPM)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Electron Cell"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#11")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(GTPPList.Containment_Unit_II.copy(), 1),
                    setStackSize(GTItemList.Stable_Lepton_Containment_Unit.copy(), 16),
                    setStackSize(PlateList.Pikyonium_64B_Plate.copy(), 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 8),

                    setStackSize(WireList.Naquadah_Wire_1x.copy(), 64 * 8),
                    setStackSize(BoltList.Arceus_Alloy_2B_Bolt.copy(), 8),
                    setStackSize(ScrewList.Zeron_100_Screw.copy(), 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Pikyonium_64B, 144 * 16),
                    requiredFluid(MoltenList.Molten_Energy_Crystal, 144 * 32),
                    requiredFluid(MoltenList.Molten_Cinobite_A243, 144 * 16),
                    requiredFluid(MoltenList.Molten_Trinium_Naquadah_Carbonite, 144 * 16))
                .itemOutputs(setStackSize(GTPPList.Electron_Cell, 1))
                .eut(RECIPE_ZPM)
                .duration(240 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Charge Pack [ZPM] Empty"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#12")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(GTPPList.Electron_Cell_Empty.copy(), 2),
                    setStackSize(GTPPList.Coil_Wire_IV.copy(), 64),
                    setStackSize(PlateList.Pikyonium_64B_Plate.copy(), 8),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),

                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 8),
                    setStackSize(CableList.Platinum_Cable_12x.copy(), 16),
                    setStackSize(ScrewList.Pikyonium_64B_Screw.copy(), 16),
                    setStackSize(BoltList.Energy_Crystal_Bolt.copy(), 32),

                    setStackSize(GTItemList.Field_Generator_LuV.copy(), 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Pikyonium_64B, 144 * 32),
                    requiredFluid(MoltenList.Molten_Trinium_Naquadah_Carbonite, 144 * 32),
                    requiredFluid(MoltenList.Molten_Lafium_Compound, 144 * 32),
                    requiredFluid(MoltenList.Molten_Arcanite, 144 * 32))
                .itemOutputs(setStackSize(GTPPList.Charge_Pack_ZPM_Empty, 1))
                .eut(RECIPE_ZPM)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Charge Pack [ZPM]"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#13")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(GTPPList.Electron_Cell_Empty.copy(), 2),
                    setStackSize(GTPPList.Coil_Wire_IV.copy(), 64),
                    setStackSize(PlateList.Pikyonium_64B_Plate.copy(), 8),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),

                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 8),
                    setStackSize(CableList.Platinum_Cable_12x.copy(), 16),
                    setStackSize(ScrewList.Pikyonium_64B_Screw.copy(), 16),
                    setStackSize(BoltList.Energy_Crystal_Bolt.copy(), 32),

                    setStackSize(GTItemList.Field_Generator_LuV.copy(), 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Pikyonium_64B, 144 * 32),
                    requiredFluid(MoltenList.Molten_Trinium_Naquadah_Carbonite, 144 * 32),
                    requiredFluid(MoltenList.Molten_Lafium_Compound, 144 * 32),
                    requiredFluid(MoltenList.Molten_Arcanite, 144 * 32))
                .itemOutputs(setStackSize(GTPPList.Charge_Pack_ZPM, 1))
                .eut(RECIPE_ZPM)
                .duration(360 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Advanced Containment Unit"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#14")
                .itemInputsUnsafe(
                    setStackSize(PlateList.Pikyonium_64B_Plate.copy(), 16),
                    setStackSize(CableList.Duranium_Cable_8x.copy(), 32),
                    setStackSize(GearList.Pikyonium_64B_Gear.copy(), 4),
                    setStackSize(GTPPList.Coil_Wire_LuV.copy(), 64))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Advanced_Nitinol, 144 * 8),
                    requiredFluid(MoltenList.Molten_Trinium_Naquadah_Carbonite, 144 * 16),
                    requiredFluid(MoltenList.Molten_Titansteel, 144 * 16))
                .itemOutputs(setStackSize(GTPPList.Advanced_Containment_Unit, 1))
                .eut(RECIPE_UV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Quark Entanglement Empty"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#15")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(GTPPList.Advanced_Containment_Unit.copy(), 1),
                    setStackSize(GTItemList.Stable_Meson_Containment_Unit.copy(), 16),
                    setStackSize(PlateList.Advanced_Nitinol_Plate.copy(), 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 8),

                    setStackSize(WireList.Duranium_Wire_1x.copy(), 64 * 8),
                    setStackSize(BoltList.Titansteel_Bolt.copy(), 8),
                    setStackSize(ScrewList.Pikyonium_64B_Screw.copy(), 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Advanced_Nitinol, 144 * 16),
                    requiredFluid(MoltenList.Molten_Trinium_Naquadah_Carbonite, 144 * 32),
                    requiredFluid(MoltenList.Molten_Titansteel, 144 * 16),
                    requiredFluid(MoltenList.Molten_Arceus_Alloy_2B, 144 * 16))
                .itemOutputs(setStackSize(GTPPList.Quark_Entanglement_Empty, 1))
                .eut(RECIPE_UV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Quark Entanglement"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#16")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(GTPPList.Advanced_Containment_Unit.copy(), 1),
                    setStackSize(GTItemList.Stable_Meson_Containment_Unit.copy(), 16),
                    setStackSize(PlateList.Advanced_Nitinol_Plate.copy(), 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 8),

                    setStackSize(WireList.Duranium_Wire_1x.copy(), 64 * 8),
                    setStackSize(BoltList.Titansteel_Bolt.copy(), 8),
                    setStackSize(ScrewList.Pikyonium_64B_Screw.copy(), 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Advanced_Nitinol, 144 * 16),
                    requiredFluid(MoltenList.Molten_Trinium_Naquadah_Carbonite, 144 * 32),
                    requiredFluid(MoltenList.Molten_Titansteel, 144 * 16),
                    requiredFluid(MoltenList.Molten_Arceus_Alloy_2B, 144 * 16))
                .itemOutputs(setStackSize(GTPPList.Quark_Entanglement, 1))
                .eut(RECIPE_UV)
                .duration(240 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Charge Pack [UV] Empty"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#17")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(GTPPList.Quark_Entanglement_Empty.copy(), 2),
                    setStackSize(GTPPList.Coil_Wire_LuV.copy(), 64),
                    setStackSize(PlateList.Advanced_Nitinol_Plate.copy(), 8),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),

                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 8),
                    setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_12x.copy(), 16),
                    setStackSize(ScrewList.Titansteel_Screw.copy(), 16),
                    setStackSize(BoltList.Trinium_Naquadah_Carbonite_Bolt.copy(), 32),

                    setStackSize(GTItemList.Field_Generator_ZPM.copy(), 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Advanced_Nitinol, 144 * 32),
                    requiredFluid(MoltenList.Molten_Arceus_Alloy_2B, 144 * 32),
                    requiredFluid(MoltenList.Molten_Cinobite_A243, 144 * 32),
                    requiredFluid(MoltenList.Molten_Lafium_Compound, 144 * 32))
                .itemOutputs(setStackSize(GTPPList.Charge_Pack_UV_Empty, 1))
                .eut(RECIPE_UV)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Charge Pack [UV]"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#18")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(GTPPList.Quark_Entanglement_Empty.copy(), 2),
                    setStackSize(GTPPList.Coil_Wire_LuV.copy(), 64),
                    setStackSize(PlateList.Advanced_Nitinol_Plate.copy(), 8),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),

                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 8),
                    setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_12x.copy(), 16),
                    setStackSize(ScrewList.Titansteel_Screw.copy(), 16),
                    setStackSize(BoltList.Trinium_Naquadah_Carbonite_Bolt.copy(), 32),

                    setStackSize(GTItemList.Field_Generator_ZPM.copy(), 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Advanced_Nitinol, 144 * 32),
                    requiredFluid(MoltenList.Molten_Arceus_Alloy_2B, 144 * 32),
                    requiredFluid(MoltenList.Molten_Cinobite_A243, 144 * 32),
                    requiredFluid(MoltenList.Molten_Lafium_Compound, 144 * 32))
                .itemOutputs(setStackSize(GTPPList.Charge_Pack_UV, 1))
                .eut(RECIPE_UV)
                .duration(360 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Exotic Containment Unit Empty"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#19")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(PlateList.Advanced_Nitinol_Plate.copy(), 16),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 6),
                    setStackSize(GearList.Titansteel_Gear.copy(), 4),
                    setStackSize(GTPPList.Coil_Wire_ZPM.copy(), 64))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Abyssal_Alloy, 144 * 8),
                    requiredFluid(MoltenList.Molten_Arceus_Alloy_2B, 144 * 16),
                    requiredFluid(MoltenList.Molten_Octiron, 144 * 16))
                .itemOutputs(setStackSize(GTPPList.Exotic_Containment_Unit_Empty, 1))
                .eut(RECIPE_UHV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Exotic Containment Unit"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#20")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(PlateList.Advanced_Nitinol_Plate.copy(), 16),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 6),
                    setStackSize(GearList.Titansteel_Gear.copy(), 4),
                    setStackSize(GTPPList.Coil_Wire_ZPM.copy(), 64))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Abyssal_Alloy, 144 * 8),
                    requiredFluid(MoltenList.Molten_Arceus_Alloy_2B, 144 * 16),
                    requiredFluid(MoltenList.Molten_Octiron, 144 * 16))
                .itemOutputs(setStackSize(GTPPList.Exotic_Containment_Unit, 1))
                .eut(RECIPE_UHV)
                .duration(240 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Graviton Anomaly"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#21")
                .itemInputsUnsafe(
                    setStackSize(GTPPList.Exotic_Containment_Unit_Empty.copy(), 1),
                    setStackSize(GTItemList.Stable_Boson_Containment_Unit.copy(), 2),
                    setStackSize(PlateList.Abyssal_Alloy_Plate.copy(), 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 8),

                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 8),
                    setStackSize(BoltList.Astral_Titanium_Bolt.copy(), 8),
                    setStackSize(ScrewList.Titansteel_Screw.copy(), 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Abyssal_Alloy, 144 * 16),
                    requiredFluid(MoltenList.Molten_Arceus_Alloy_2B, 144 * 32),
                    requiredFluid(MoltenList.Molten_Octiron, 144 * 16),
                    requiredFluid(MoltenList.Molten_Titansteel, 144 * 16))
                .itemOutputs(setStackSize(GTPPList.Graviton_Anomaly, 1))
                .eut(RECIPE_UHV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Charge Pack [UHV] Empty"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#22")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(GTPPList.Graviton_Anomaly.copy(), 2),
                    setStackSize(GTPPList.Coil_Wire_ZPM.copy(), 64),
                    setStackSize(PlateList.Abyssal_Alloy_Plate.copy(), 8),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),

                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 8),
                    setStackSize(CableList.Naquadah_Cable_12x.copy(), 16),
                    setStackSize(ScrewList.Abyssal_Alloy_Screw.copy(), 16),
                    setStackSize(BoltList.Arceus_Alloy_2B_Bolt.copy(), 32),

                    setStackSize(GTItemList.Field_Generator_UV.copy(), 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Abyssal_Alloy, 144 * 32),
                    requiredFluid(MoltenList.Molten_Titansteel, 144 * 64),
                    requiredFluid(MoltenList.Molten_Cinobite_A243, 144 * 32))
                .itemOutputs(setStackSize(GTPPList.Charge_Pack_UHV_Empty, 1))
                .eut(RECIPE_UHV)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Charge Pack [UHV]"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#23")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(GTPPList.Graviton_Anomaly.copy(), 2),
                    setStackSize(GTPPList.Coil_Wire_ZPM.copy(), 64),
                    setStackSize(PlateList.Abyssal_Alloy_Plate.copy(), 8),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),

                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 8),
                    setStackSize(CableList.Naquadah_Cable_12x.copy(), 16),
                    setStackSize(ScrewList.Abyssal_Alloy_Screw.copy(), 16),
                    setStackSize(BoltList.Arceus_Alloy_2B_Bolt.copy(), 32),

                    setStackSize(GTItemList.Field_Generator_UV.copy(), 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Abyssal_Alloy, 144 * 32),
                    requiredFluid(MoltenList.Molten_Titansteel, 144 * 64),
                    requiredFluid(MoltenList.Molten_Cinobite_A243, 144 * 32))
                .itemOutputs(setStackSize(GTPPList.Charge_Pack_UHV, 1))
                .eut(RECIPE_UHV)
                .duration(360 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Circuit
        {
            // "Neuro Processing Unit"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#24")
                .itemInputsUnsafe(
                    setStackSize(CircuitList.Extreme_Wetware_Lifesupport_Circuit_Board.copy(), 1),
                    setStackSize(CircuitList.Stemcells.copy(), 16),
                    setStackSize(GTItemList.Reinforced_Glass_Tube.copy(), 16),
                    setStackSize(PipeList.Tiny_PBI_Fluid_Pipe.copy(), 8),

                    setStackSize(CasingList.Enriched_Naquadah_Casing.copy(), 4),
                    setStackSize(FoilList.Thin_Silicone_Rubber_Sheet.copy(), 64),
                    setStackSize(BoltList.Tungstensteel_Bolt.copy(), 32))
                .fluidInputs(
                    requiredFluid(FluidList.Growth_Catalyst_Medium, 250),
                    requiredFluid(FluidList.UU_Matter, 250),
                    requiredFluid(FluidList.IC2_Coolant, 1000))
                .itemOutputs(setStackSize(CircuitList.Neuro_Processing_Unit, 1))
                .eut(RECIPE_ZPM)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // Wetware Mainframe
            {
                final ItemStack[] superConductor = new ItemStack[] {
                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 64),
                    setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 32),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 16),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 8),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 4),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 2) };

                for (int superConductor_Tier = 0; superConductor_Tier < 6; superConductor_Tier++) {
                    ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#25")
                        .itemInputsUnsafe(
                            GTUtility.getIntegratedCircuit(superConductor_Tier + 1),

                            setStackSize(FrameBoxList.Tritanium_Frame_Box.copy(), 2),
                            setStackSize(CircuitList.Wetware_Supercomputer.copy(), 2),
                            setStackSize(CircuitList.Advanced_SMD_Inductor.copy(), 16),
                            setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 16),

                            setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 16),
                            setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 16),
                            setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 16),
                            setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 48),

                            superConductor[superConductor_Tier],
                            setStackSize(FoilList.Thin_Silicone_Rubber_Sheet.copy(), 64))
                        .fluidInputs(
                            requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 20),
                            requiredFluid(FluidList.IC2_Coolant, 1000 * 10),
                            requiredFluid(GasList.Radon, 2500))
                        .itemOutputs(setStackSize(CircuitList.Wetware_Mainframe, 1))
                        .eut(RECIPE_UV)
                        .duration(100 * SECONDS)
                        .addTo(AssemblyLineNormalRecipe);
                }

                for (int superConductor_Tier = 0; superConductor_Tier < 6; superConductor_Tier++) {
                    ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#26")
                        .itemInputsUnsafe(
                            GTUtility.getIntegratedCircuit(superConductor_Tier + 7),

                            setStackSize(FrameBoxList.Tritanium_Frame_Box.copy(), 2),
                            setStackSize(CircuitList.Wetware_Supercomputer.copy(), 2),
                            setStackSize(CircuitList.Optical_SMD_Inductor.copy(), 4),
                            setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 4),

                            setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 4),
                            setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 4),
                            setStackSize(CircuitList.Optical_SMD_Diode.copy(), 4),
                            setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 48),

                            superConductor[superConductor_Tier],
                            setStackSize(FoilList.Thin_Silicone_Rubber_Sheet.copy(), 64))
                        .fluidInputs(
                            requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 20),
                            requiredFluid(FluidList.IC2_Coolant, 1000 * 10),
                            requiredFluid(GasList.Radon, 2500))
                        .itemOutputs(setStackSize(CircuitList.Wetware_Mainframe, 1))
                        .eut(RECIPE_UV)
                        .duration(100 * SECONDS)
                        .addTo(AssemblyLineNormalRecipe);
                }
            }

            // Bioware SuperComputer
            {
                final ItemStack[] Transistor = new ItemStack[] {
                    setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 16),
                    setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 4) };

                final ItemStack[] Resistor = new ItemStack[] {
                    setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 16),
                    setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 4) };

                final ItemStack[] Capacitor = new ItemStack[] {
                    setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 16),
                    setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 4) };

                final ItemStack[] Diode = new ItemStack[] { setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 16),
                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 4) };

                for (int Circuit_Parts_Tier = 0; Circuit_Parts_Tier < 2; Circuit_Parts_Tier++) {
                    ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#27")
                        .itemInputsUnsafe(
                            GTUtility.getIntegratedCircuit(Circuit_Parts_Tier + 1),

                            setStackSize(CircuitList.Ultra_Bio_Mutated_Circuit_Board.copy(), 2),
                            setStackSize(CircuitList.Bioware_Assembly.copy(), 2),
                            Transistor[Circuit_Parts_Tier],
                            Resistor[Circuit_Parts_Tier],

                            Capacitor[Circuit_Parts_Tier],
                            Diode[Circuit_Parts_Tier],
                            setStackSize(CircuitList.NOR_Memory_Chip.copy(), 32),
                            setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 64),

                            setStackSize(FineWireList.Fine_Niobium_Titanium_Wire.copy(), 32),
                            setStackSize(FoilList.Thin_Silicone_Rubber_Sheet.copy(), 64))
                        .fluidInputs(
                            requiredFluid(FluidList.Mutated_Living_Solder, 144 * 10),
                            requiredFluid(FluidList.Sterilized_Bio_Catalyst_Medium, 144 * 10),
                            requiredFluid(FluidList.Super_Coolant, 1000 * 10))
                        .itemOutputs(setStackSize(CircuitList.Bioware_Supercomputer, 1))
                        .eut(RECIPE_UV)
                        .duration(200 * SECONDS)
                        .addTo(AssemblyLineNormalRecipe);
                }
            }

            // Bio Mainframe
            {
                final ItemStack[] superConductor = new ItemStack[] {
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 32),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 16),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 8) };

                for (int superConductor_Tier = 0; superConductor_Tier < 4; superConductor_Tier++) {
                    ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#28")
                        .itemInputsUnsafe(
                            GTUtility.getIntegratedCircuit(superConductor_Tier + 1),

                            setStackSize(FrameBoxList.Tritanium_Frame_Box.copy(), 4),
                            setStackSize(CircuitList.Bioware_Supercomputer.copy(), 2),
                            setStackSize(CircuitList.Advanced_SMD_Inductor.copy(), 24),
                            setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 24),

                            setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 24),
                            setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 24),
                            setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 24),
                            setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 64),

                            superConductor[superConductor_Tier],
                            setStackSize(FoilList.Thin_Silicone_Rubber_Sheet.copy(), 64),
                            setStackSize(FoilList.Thin_Polybenzimidazole_PBI_Sheet.copy(), 64))
                        .fluidInputs(
                            requiredFluid(FluidList.Mutated_Living_Solder, 144 * 20),
                            requiredFluid(FluidList.Sterilized_Bio_Catalyst_Medium, 144 * 20),
                            requiredFluid(FluidList.Super_Coolant, 1000 * 20))
                        .itemOutputs(setStackSize(CircuitList.Bioware_Mainframe, 1))
                        .eut(RECIPE_UHV)
                        .duration(300 * SECONDS)
                        .addTo(AssemblyLineNormalRecipe);
                }

                for (int superConductor_Tier = 0; superConductor_Tier < 4; superConductor_Tier++) {
                    ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#29")
                        .itemInputsUnsafe(
                            GTUtility.getIntegratedCircuit(superConductor_Tier + 5),

                            setStackSize(FrameBoxList.Tritanium_Frame_Box.copy(), 4),
                            setStackSize(CircuitList.Bioware_Supercomputer.copy(), 2),
                            setStackSize(CircuitList.Optical_SMD_Inductor.copy(), 6),
                            setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 6),

                            setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 6),
                            setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 6),
                            setStackSize(CircuitList.Optical_SMD_Diode.copy(), 6),
                            setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 64),

                            superConductor[superConductor_Tier],
                            setStackSize(FoilList.Thin_Silicone_Rubber_Sheet.copy(), 64),
                            setStackSize(FoilList.Thin_Polybenzimidazole_PBI_Sheet.copy(), 64))
                        .fluidInputs(
                            requiredFluid(FluidList.Mutated_Living_Solder, 144 * 20),
                            requiredFluid(FluidList.Sterilized_Bio_Catalyst_Medium, 144 * 20),
                            requiredFluid(FluidList.Super_Coolant, 1000 * 20))
                        .itemOutputs(setStackSize(CircuitList.Bioware_Mainframe, 1))
                        .eut(RECIPE_UHV)
                        .duration(300 * SECONDS)
                        .addTo(AssemblyLineNormalRecipe);
                }
            }

            // Optical Assembly
            {
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#30")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),

                        CircuitList.Optical_Circuit_Board,
                        setStackSize(CircuitList.Optical_Processor.copy(), 4),
                        setStackSize(CircuitList.Optical_SMD_Inductor.copy(), 16),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 20),

                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 20),
                        setStackSize(CircuitList.NOR_Memory_Chip.copy(), 32),
                        setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 64),
                        setStackSize(FineWireList.Fine_Lumiium_Wire.copy(), 24),

                        setStackSize(FoilList.Thin_Silicone_Rubber_Sheet.copy(), 64))
                    .fluidInputs(
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 10),
                        requiredFluid(PlasmaList.Radon_Plasma, 144 * 10),
                        requiredFluid(FluidList.Super_Coolant, 1000 * 10),
                        requiredFluid(GasList.Oganesson, 500))
                    .itemOutputs(setStackSize(CircuitList.Optical_Assembly, 1))
                    .eut(RECIPE_UHV)
                    .duration(20 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // Optical Computer
            {
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#31")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(CircuitList.Optical_Circuit_Board.copy(), 2),
                        setStackSize(CircuitList.Optical_Assembly.copy(), 4),
                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 24),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 24),

                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 24),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 24),
                        setStackSize(CircuitList.NOR_Memory_Chip.copy(), 64),
                        setStackSize(CircuitList.ASoC_Chip.copy(), 32),

                        setStackSize(FineWireList.Fine_Lumiium_Wire.copy(), 32),
                        setStackSize(FoilList.Thin_Silicone_Rubber_Sheet.copy(), 64),
                        setStackSize(FoilList.Thin_Polybenzimidazole_PBI_Sheet.copy(), 64))
                    .fluidInputs(
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 20),
                        requiredFluid(PlasmaList.Radon_Plasma, 144 * 20),
                        requiredFluid(FluidList.Super_Coolant, 1000 * 20),
                        requiredFluid(GasList.Oganesson, 1000))
                    .itemOutputs(setStackSize(CircuitList.Optical_Supercomputer, 1))
                    .eut(RECIPE_UHV)
                    .duration(200 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // Optical Mainframe
            {
                final ItemStack[] superConductor = new ItemStack[] {
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 32),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 16) };

                for (int superConductor_Tier = 0; superConductor_Tier < 3; superConductor_Tier++) {
                    ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#32")
                        .itemInputsUnsafe(
                            GTUtility.getIntegratedCircuit(superConductor_Tier + 1),

                            setStackSize(FrameBoxList.Tritanium_Frame_Box.copy(), 8),
                            setStackSize(CircuitList.Optical_Supercomputer.copy(), 4),
                            setStackSize(CircuitList.Advanced_SMD_Inductor.copy(), 32),
                            setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 32),

                            setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 32),
                            setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 32),
                            setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 32),
                            setStackSize(CircuitList.ASoC_Chip.copy(), 64),

                            superConductor[superConductor_Tier],
                            setStackSize(FoilList.Thin_Silicone_Rubber_Sheet.copy(), 128),
                            setStackSize(FoilList.Thin_Polybenzimidazole_PBI_Sheet.copy(), 128))
                        .fluidInputs(
                            requiredFluid(FluidList.Mutated_Living_Solder, 144 * 40),
                            requiredFluid(PlasmaList.Radon_Plasma, 144 * 40),
                            requiredFluid(FluidList.Super_Coolant, 1000 * 40),
                            requiredFluid(GasList.Oganesson, 1000 * 2))
                        .itemOutputs(setStackSize(CircuitList.Optical_Mainframe, 1))
                        .eut(RECIPE_UEV)
                        .duration(300 * SECONDS)
                        .addTo(AssemblyLineNormalRecipe);
                }
            }

            // Special Circuit
            {
                // "Nano Circuit"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#33")
                    .itemInputsUnsafe(
                        setStackSize(FrameBoxList.Tritanium_Frame_Box.copy(), 8),
                        setStackSize(CircuitList.Bioware_Mainframe.copy(), 2),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 32),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 32),

                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 32),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 32),
                        setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 64),
                        setStackSize(CircuitList.Nano_Power_IC_Chip.copy(), 64),

                        setStackSize(WireList.Draconium_Wire_1x.copy(), 64),
                        setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 128),
                        setStackSize(FoilList.Thin_Silicone_Rubber_Sheet.copy(), 64),
                        setStackSize(FoilList.Thin_Polybenzimidazole_PBI_Sheet.copy(), 64))
                    .fluidInputs(
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 26),
                        requiredFluid(MoltenList.Molten_Naquadria, 144 * 28),
                        requiredFluid(FluidList.IC2_Coolant, 1000 * 20))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Nano_Circuit, 1))
                    .eut(RECIPE_UIV)
                    .duration(400 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Pico Circuit"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#34")
                    .itemInputsUnsafe(
                        setStackSize(CircuitList.Optical_Circuit_Board.copy(), 1),
                        getMaterialInput(OrePrefixes.circuit, Materials.UIV, 2),
                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 48),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 48),

                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 48),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 48),
                        setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 64),
                        setStackSize(FoilList.Thin_Radox_Polymer_Sheet.copy(), 16),

                        setStackSize(BoltList.Transcendent_Metal_Bolt.copy(), 32),
                        setStackSize(BoltList.Neutronium_Bolt.copy(), 16),
                        setStackSize(FineWireList.Fine_Lanthanum_Wire.copy(), 64))
                    .fluidInputs(
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 26),
                        requiredFluid(FluidList.UU_Matter, 1000 * 8),
                        requiredFluid(MoltenList.Molten_Osmium, 144 * 8))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Pico_Circuit, 1))
                    .eut(RECIPE_UMV)
                    .duration(500 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Quantum Circuit"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#35")
                    .itemInputsUnsafe(
                        setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 16),
                        getMaterialInput(OrePrefixes.circuit, Materials.UMV, 2),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 64),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),

                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 64),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 64),
                        setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 64),
                        setStackSize(FoilList.Shirabon_Foil.copy(), 64),

                        setStackSize(BoltList.Indium_Bolt.copy(), 64),
                        setStackSize(WireList.SpaceTime_Wire_1x.copy(), 8),
                        setStackSize(FineWireList.Fine_Lanthanum_Wire.copy(), 16))
                    .fluidInputs(
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 26),
                        requiredFluid(FluidList.UU_Matter, 1000 * 24),
                        requiredFluid(MoltenList.Molten_Osmium, 144 * 16))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Quantum_Circuit, 1))
                    .eut(RECIPE_UMV)
                    .duration(1000 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }
        }

        // Drone
        {
            // "Drone Remote Interface"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#36")
                .itemInputsUnsafe(
                    setStackSize(SuperdensePlateList.Superdense_Infinity_Plate.copy(), 16),
                    setStackSize(GTItemList.Computer_Monitor_Cover.copy(), 4),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 4),

                    setStackSize(GTItemList.Sensor_UHV.copy(), 8),
                    setStackSize(GTItemList.Emitter_UHV.copy(), 8),
                    setStackSize(GTItemList.Drone_Level_3.copy(), 1),
                    setStackSize(GTItemList.Data_Orb.copy(), 4))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 1000),
                    requiredFluid(FluidList.Ethyl_Cyanoacrylate_Super_Glue, 1000 * 64))
                .itemOutputs(setStackSize(GTItemList.Drone_Remote_Interface, 1))
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Drone (Level 2)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#37")
                .itemInputsUnsafe(
                    setStackSize(DensePlateList.Dense_Naquadah_Alloy_Plate.copy(), 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_3.copy(), 4),
                    setStackSize(GTItemList.Large_Osmium_Fluid_Cell.copy(), 1),

                    setStackSize(PipeList.Quadruple_Mysterious_Crystal_Fluid_Pipe.copy(), 1),
                    setStackSize(GTItemList.Emitter_ZPM.copy(), 4),
                    setStackSize(BatteryList.Energy_Module_Empty.copy(), 1),
                    setStackSize(GTItemList.Wireless_Needs_Maintenance_Cover.copy(), 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 4),
                    requiredFluid(FluidList.CN3H7O3_Rocket_Fuel, 1000 * 4))
                .itemOutputs(setStackSize(GTItemList.Drone_Level_2.copy(), 4))
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Drone (Level 3)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#38")
                .itemInputsUnsafe(
                    setStackSize(DensePlateList.Dense_Infinity_Plate.copy(), 16),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),
                    setStackSize(GTItemList.Field_Generator_UV.copy(), 16),
                    setStackSize(GTItemList.Gravi_Star.copy(), 8),

                    setStackSize(GTItemList.Emitter_UV.copy(), 4),
                    setStackSize(HatchList.Auto_Taping_Maintenance_Hatch.copy(), 16),
                    setStackSize(BatteryList.Energy_Cluster_Empty.copy(), 8),
                    setStackSize(GTItemList.Wireless_Needs_Maintenance_Cover.copy(), 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 1000),
                    requiredFluid(FluidList.Ethyl_Cyanoacrylate_Super_Glue, 1000 * 2))
                .itemOutputs(setStackSize(GTItemList.Drone_Level_3, 1))
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Drone (Level 4)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#39")
                .itemInputsUnsafe(
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 1),
                    setStackSize(SingularityList.Eternal_Singularity.copy(), 1),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 16),

                    setStackSize(GTItemList.Nuclear_Star.copy(), 8),
                    setStackSize(GTItemList.Emitter_UHV.copy(), 4),
                    setStackSize(BatteryList.Really_Ultimate_Battery_Empty.copy(), 1),
                    setStackSize(GTNHIntergalacticList.Space_Elevator_Motor_MKIII.copy(), 64))
                .fluidInputs(
                    requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Crude_Catalyst, 1000 * 8),
                    requiredFluid(FluidList.Mutated_Living_Solder, 1000 * 8))
                .itemOutputs(setStackSize(GTItemList.Drone_Level_4, 1))
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Dyson
        {
            // "Corona-Resistant Drone Case"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#40")
                .itemInputsUnsafe(
                    setStackSize(OpenComputersList.Drone_Case_Tier3.copy(), 4),
                    setStackSize(FrameBoxList.Transcendent_Metal_Frame_Box.copy(), 4),
                    setStackSize(GTItemList.Emitter_UEV.copy(), 1),
                    setStackSize(OpenComputersList.Navigation_Upgrade.copy(), 64),

                    setStackSize(GTItemList.Gravitation_Engine.copy(), 4),
                    setStackSize(BatteryList.Lapotronic_Energy_Orb_Cluster_Empty.copy(), 4),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4.copy(), 1))
                .fluidInputs(
                    requiredFluid(PlasmaList.Xenon_Plasma, 1000),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 5))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Corona_Resistant_Drone_Case, 1))
                .eut(RECIPE_UHV)
                .duration(5 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Magnetically Shielded Femtocontroller"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#41")
                .itemInputsUnsafe(
                    setStackSize(OpenComputersList.Microcontroller_Case_Tier3.copy(), 4),
                    setStackSize(CircuitList.Optically_Perfected_CPU.copy(), 1),
                    setStackSize(GTItemList.Sensor_UEV.copy(), 1),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 2),

                    setStackSize(GTItemList.Energised_Tesseract.copy(), 1),
                    setStackSize(ScrewList.Enriched_Naquadah_Alloy_Screw.copy(), 8),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 4))
                .fluidInputs(
                    requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 5))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Magnetically_Shielded_Femtocontroller, 1))
                .eut(RECIPE_UHV)
                .duration(5 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Dyson Swarm Module"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#42")
                .itemInputsUnsafe(
                    setStackSize(GTNHIntergalacticList.Ultra_Durable_Solar_Sail.copy(), 4),
                    setStackSize(GTNHIntergalacticList.Corona_Resistant_Drone_Case.copy(), 1),
                    setStackSize(GTNHIntergalacticList.Magnetically_Shielded_Femtocontroller.copy(), 1),
                    setStackSize(MachineList.Radioisotope_Thermoelectric_Generator.copy(), 1),

                    setStackSize(GTNHIntergalacticList.Hyperfine_TrNq_Radioisomer_Pellet.copy(), 1),
                    setStackSize(CircuitList.Femto_Power_IC_Chip.copy(), 4))
                .fluidInputs(
                    requiredFluid(FluidList.Gelid_Cryotheum, 1000 * 16),
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 64 * 2))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Dyson_Swarm_Module.copy(), 64))
                .eut(RECIPE_UHV)
                .duration(5 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Electromagnet
        {
            // "Steel Electromagnet"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#43")
                .itemInputsUnsafe(
                    setStackSize(PlateList.Nickel_Zinc_Ferrite_Plate.copy(), 32),
                    setStackSize(RingList.Magnetic_Steel_Ring.copy(), 16),
                    setStackSize(GTItemList.Ludicrous_Voltage_Coil.copy(), 16),
                    setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 64),

                    setStackSize(GTItemList.Field_Generator_LuV.copy(), 2))
                .fluidInputs(
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 8),
                    requiredFluid(MoltenList.Molten_Cobalt_GregTech, 144 * 16),
                    requiredFluid(MoltenList.Molten_Vanadium_Gallium, 144 * 16))
                .itemOutputs(setStackSize(GTItemList.Steel_Electromagnet, 1))
                .eut(RECIPE_LuV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Neodymium Electromagnet"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#44")
                .itemInputsUnsafe(
                    setStackSize(PlateList.Naquadah_Alloy_Plate.copy(), 32),
                    setStackSize(RingList.Magnetic_Neodymium_Ring.copy(), 16),
                    setStackSize(GTItemList.ZPM_Voltage_Coil.copy(), 16),
                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 64 * 2),

                    setStackSize(GTItemList.Field_Generator_ZPM.copy(), 2))
                .fluidInputs(
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 16),
                    requiredFluid(MoltenList.Molten_Cobalt_GregTech, 144 * 32),
                    requiredFluid(MoltenList.Molten_Osmiridium, 144 * 16))
                .itemOutputs(setStackSize(GTItemList.Neodymium_Electromagnet, 1))
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Samarium Electromagnet"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#45")
                .itemInputsUnsafe(
                    setStackSize(DoublePlateList.Double_Neutronium_Plate.copy(), 32),
                    setStackSize(RingList.Magnetic_Samarium_Ring.copy(), 32),
                    setStackSize(GTItemList.Ultimate_Voltage_Coil.copy(), 32),
                    setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 64 * 4),

                    setStackSize(GTItemList.Field_Generator_UV.copy(), 2))
                .fluidInputs(
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 32),
                    requiredFluid(MoltenList.Molten_Cobalt_GregTech, 144 * 48),
                    requiredFluid(MoltenList.Molten_Fluxed_Electrum, 144 * 16))
                .itemOutputs(setStackSize(GTItemList.Samarium_Electromagnet, 1))
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Tengam Electromagnet"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#46")
                .itemInputsUnsafe(
                    setStackSize(DoublePlateList.Double_Cosmic_Neutronium_Plate.copy(), 32),
                    setStackSize(RingList.Attuned_Tengam_Ring.copy(), 32),
                    setStackSize(GTItemList.Highly_Ultimate_Voltage_Coil.copy(), 32),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 8),

                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 2))
                .fluidInputs(
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 64),
                    requiredFluid(MoltenList.Molten_Cobalt_GregTech, 144 * 64),
                    requiredFluid(MoltenList.Molten_Naquadria, 144 * 16))
                .itemOutputs(setStackSize(GTItemList.Tengam_Electromagnet, 1))
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Empty Quark Release Catalyst Housing"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#47")
            .itemInputsUnsafe(
                setStackSize(PlateList.Neutronium_Plate.copy(), 16),
                setStackSize(PlateList.Infinity_Plate.copy(), 16),
                setStackSize(PlateList.Tritanium_Plate.copy(), 16),
                setStackSize(PlateList.Cosmic_Neutronium_Plate.copy(), 16),

                setStackSize(FineWireList.Fine_Neutronium_Wire.copy(), 64),
                setStackSize(FineWireList.Fine_Infinity_Wire.copy(), 64),
                setStackSize(FineWireList.Fine_Tritanium_Wire.copy(), 64),
                setStackSize(FineWireList.Fine_Cosmic_Neutronium_Wire.copy(), 64),

                getMaterialInput(OrePrefixes.circuit, Materials.UHV, 16),
                getMaterialInput(OrePrefixes.circuit, Materials.UEV, 8),
                setStackSize(GTItemList.Field_Generator_UEV.copy(), 1))
            .fluidInputs(
                requiredFluid(MoltenList.Molten_Neutronium, 144 * 16),
                requiredFluid(MoltenList.Molten_Infinity, 144 * 16),
                requiredFluid(MoltenList.Molten_Tritanium, 144 * 16),
                requiredFluid(MoltenList.Molten_Cosmic_Neutronium, 144 * 16))
            .itemOutputs(setStackSize(GTItemList.Empty_Quark_Release_Catalyst_Housing, 1))
            .eut(RECIPE_UIV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Energy Orb & Ultimate Battery
        {
            // "Lapotronic Energy Orb Cluster"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#48")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(CircuitList.Multilayer_Fiber_Reinforced_Circuit_Board.copy(), 1),
                    setStackSize(FoilList.Naquadah_Alloy_Foil.copy(), 64),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64),

                    setStackSize(CircuitList.High_Power_IC_Chip.copy(), 64),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 8),
                    setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 8),
                    setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 8),

                    setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 8),
                    setStackSize(FineWireList.Fine_Platinum_Wire.copy(), 64))
                .fluidInputs(requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 5))
                .itemOutputs(setStackSize(BatteryList.Lapotronic_Energy_Orb_Cluster_Empty, 1))
                .eut(RECIPE_ZPM)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Lapotronic Energy Orb Cluster"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#49")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(CircuitList.Multilayer_Fiber_Reinforced_Circuit_Board.copy(), 1),
                    setStackSize(FoilList.Naquadah_Alloy_Foil.copy(), 64),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64),

                    setStackSize(CircuitList.High_Power_IC_Chip.copy(), 64),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 8),
                    setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 8),
                    setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 8),

                    setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 8),
                    setStackSize(FineWireList.Fine_Platinum_Wire.copy(), 64))
                .fluidInputs(requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 5))
                .itemOutputs(setStackSize(BatteryList.Lapotronic_Energy_Orb_Cluster, 1))
                .eut(RECIPE_ZPM)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Energy Module"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#50")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

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
                .itemOutputs(setStackSize(BatteryList.Energy_Module_Empty, 1))
                .eut(RECIPE_ZPM)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Energy Module"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#51")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

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
                .itemOutputs(setStackSize(BatteryList.Energy_Module, 1))
                .eut(RECIPE_ZPM)
                .duration(200 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Energy Cluster"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#52")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

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
                .itemOutputs(setStackSize(BatteryList.Energy_Cluster_Empty, 1))
                .eut(RECIPE_UV)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Energy Cluster"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#53")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

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
                .itemOutputs(setStackSize(BatteryList.Energy_Cluster, 1))
                .eut(RECIPE_UV)
                .duration(200 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Ultimate Battery"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#54")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

                    setStackSize(PlateList.Tritanium_Plate.copy(), 64),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 8),
                    setStackSize(GTItemList.Field_Generator_UV.copy(), 2),

                    setStackSize(CircuitList.HPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 32),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 32))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 20),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 16))
                .itemOutputs(setStackSize(BatteryList.Ultimate_Battery_Empty, 1))
                .eut(RECIPE_UV)
                .duration(150 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Ultimate Battery"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#55")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

                    setStackSize(PlateList.Tritanium_Plate.copy(), 64),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 8),
                    setStackSize(GTItemList.Field_Generator_UV.copy(), 2),

                    setStackSize(CircuitList.HPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 32),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 32))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 20),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 16))
                .itemOutputs(setStackSize(BatteryList.Ultimate_Battery, 1))
                .eut(RECIPE_UV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Really Ultimate Battery"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#56")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

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
                .itemOutputs(setStackSize(BatteryList.Really_Ultimate_Battery_Empty, 1))
                .eut(RECIPE_UHV)
                .duration(200 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Really Ultimate Battery"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#57")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

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
                .itemOutputs(setStackSize(BatteryList.Really_Ultimate_Battery, 1))
                .eut(RECIPE_UHV)
                .duration(400 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Extremely Ultimate Battery"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#58")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

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
                .itemOutputs(setStackSize(BatteryList.Extremely_Ultimate_Battery_Empty, 1))
                .eut(RECIPE_UEV)
                .duration(250 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Extremely Ultimate Battery"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#59")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

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
                .itemOutputs(setStackSize(BatteryList.Extremely_Ultimate_Battery, 1))
                .eut(RECIPE_UEV)
                .duration(500 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Insanely Ultimate Battery"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#60")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

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
                .itemOutputs(setStackSize(BatteryList.Insanely_Ultimate_Battery_Empty, 1))
                .eut(RECIPE_UIV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Insanely Ultimate Battery"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#61")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

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
                .itemOutputs(setStackSize(BatteryList.Insanely_Ultimate_Battery, 1))
                .eut(RECIPE_UIV)
                .duration(600 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mega Ultimate Battery"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#62")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(1),

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
                .itemOutputs(setStackSize(BatteryList.Mega_Ultimate_Battery_Empty, 1))
                .eut(RECIPE_UMV)
                .duration(360 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mega Ultimate Battery"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#63")
                .itemInputsUnsafe(
                    GTUtility.getIntegratedCircuit(2),

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
                .itemOutputs(setStackSize(BatteryList.Mega_Ultimate_Battery, 1))
                .eut(RECIPE_UMV)
                .duration(720 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Fluid Storage Core
        {
            // "Fluid Storage Core T3"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#64")
                .itemInputsUnsafe(
                    setStackSize(PipeList.Nonuple_Stainless_Steel_Fluid_Pipe.copy(), 4),
                    setStackSize(GTItemList.Electric_Pump_HV.copy(), 8),
                    setStackSize(GTBlockList.Quantum_Tank_I.copy(), 1),
                    setStackSize(DensePlateList.Dense_Osmium_Plate.copy(), 8),

                    setStackSize(GalacticraftList.Fluid_Manipulator.copy(), 1),
                    setStackSize(FoilList.Thin_Polycaprolactam_PCL_Sheet.copy(), 32))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 16),
                    requiredFluid(FluidList.Lubricant, 1000 * 4))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Storage_Core_T3, 1))
                .eut(RECIPE_LuV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Storage Core T4"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#65")
                .itemInputsUnsafe(
                    setStackSize(PipeList.Nonuple_Titanium_Fluid_Pipe.copy(), 4),
                    setStackSize(GTItemList.Electric_Pump_EV.copy(), 8),
                    setStackSize(GTBlockList.Quantum_Tank_I.copy(), 4),
                    setStackSize(DensePlateList.Dense_Europium_Plate.copy(), 8),

                    setStackSize(GalacticraftList.Fluid_Manipulator.copy(), 4),
                    setStackSize(FoilList.Thin_Styrene_Butadiene_Rubber_SBR_Sheet.copy(), 64),
                    setStackSize(PipeList.Large_Tungstensteel_Fluid_Pipe.copy(), 64))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 64 * 2),
                    requiredFluid(FluidList.Lubricant, 1000 * 16))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Storage_Core_T4, 1))
                .eut(RECIPE_ZPM)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Storage Core T5"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#66")
                .itemInputsUnsafe(
                    setStackSize(PipeList.Nonuple_Mysterious_Crystal_Fluid_Pipe.copy(), 4),
                    setStackSize(GTItemList.Electric_Pump_IV.copy(), 8),
                    setStackSize(GTBlockList.Quantum_Tank_III.copy(), 8),
                    setStackSize(DensePlateList.Dense_Neutronium_Plate.copy(), 8),

                    setStackSize(GalacticraftList.Fluid_Manipulator.copy(), 16),
                    setStackSize(QuintuplePlateList.Quintuple_Polycaprolactam_PCL_Sheet.copy(), 24),
                    setStackSize(PipeList.Huge_Titanium_Fluid_Pipe.copy(), 64))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Draconium, 144 * 16),
                    requiredFluid(MoltenList.Molten_Titanium, 144 * 2),
                    requiredFluid(FluidList.Lubricant, 1000 * 64))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Storage_Core_T5, 1))
                .eut(RECIPE_UV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Storage Core T6"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#67")
                .itemInputsUnsafe(
                    setStackSize(PipeList.Nonuple_Infinity_Fluid_Pipe.copy(), 4),
                    setStackSize(GTItemList.Electric_Pump_LuV.copy(), 8),
                    setStackSize(GTBlockList.Quantum_Tank_IV.copy(), 16),
                    setStackSize(DensePlateList.Dense_Infinity_Plate.copy(), 16),

                    setStackSize(DensePlateList.Dense_Awakened_Draconium_Plate.copy(), 16),
                    setStackSize(GalacticraftList.Fluid_Manipulator.copy(), 16),
                    setStackSize(MachineList.Compressor_IV.copy(), 64))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Draconium, 144 * 16),
                    requiredFluid(MoltenList.Molten_Titanium, 144 * 2),
                    requiredFluid(FluidList.Lubricant, 1000 * 64))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Storage_Core_T6, 1))
                .eut(RECIPE_UHV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Storage Core T7"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#68")
                .itemInputsUnsafe(
                    setStackSize(GalacticraftList.Fluid_Manipulator.copy(), 64),
                    setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 8),
                    setStackSize(MultiMachineControllerList.Neutronium_Compressor.copy(), 1),
                    setStackSize(GTBlockList.Quantum_Tank_IV.copy(), 32),

                    setStackSize(PipeList.Nonuple_Infinity_Fluid_Pipe.copy(), 8),
                    setStackSize(QuintuplePlateList.Quintuple_Infinity_Catalyst_Plate.copy(), 8),
                    setStackSize(DensePlateList.Dense_Awakened_Draconium_Plate.copy(), 16))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Draconium, 144 * 160),
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 16),
                    requiredFluid(MoltenList.Molten_Infinity_Catalyst, 144 * 8))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Storage_Core_T7, 1))
                .eut(RECIPE_UEV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Storage Core T8"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#69")
                .itemInputsUnsafe(
                    setStackSize(GalacticraftList.Fluid_Manipulator.copy(), 64),
                    setStackSize(GTItemList.Electric_Pump_UV.copy(), 8),
                    setStackSize(MultiMachineControllerList.Neutronium_Compressor.copy(), 2),
                    setStackSize(GTBlockList.Quantum_Tank_IV.copy(), 64),

                    setStackSize(PipeList.Nonuple_Infinity_Fluid_Pipe.copy(), 8),
                    setStackSize(QuintuplePlateList.Quintuple_Infinity_Plate.copy(), 24),
                    setStackSize(DensePlateList.Dense_Awakened_Draconium_Plate.copy(), 16))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Draconium, 144 * 64 * 4),
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 210),
                    requiredFluid(MoltenList.Molten_Infinity_Catalyst, 144 * 40))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Storage_Core_T8, 1))
                .eut(RECIPE_UIV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Storage Core T9"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#70")
                .itemInputsUnsafe(
                    setStackSize(GalacticraftList.Fluid_Manipulator.copy(), 64),
                    setStackSize(GTItemList.Electric_Pump_UHV.copy(), 8),
                    setStackSize(MultiMachineControllerList.Neutronium_Compressor.copy(), 2),
                    setStackSize(GTBlockList.Quantum_Tank_V.copy(), 8),

                    setStackSize(PipeList.Nonuple_Infinity_Fluid_Pipe.copy(), 32),
                    setStackSize(QuintuplePlateList.Quintuple_Infinity_Plate.copy(), 36),
                    setStackSize(DensePlateList.Dense_Awakened_Draconium_Plate.copy(), 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Draconium, 144 * 64 * 4),
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 210),
                    requiredFluid(MoltenList.Molten_Transcendent_Metal, 144 * 10),
                    requiredFluid(MoltenList.Molten_Infinity_Catalyst, 144 * 40))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Storage_Core_T9, 1))
                .eut(RECIPE_UMV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Fluid Storage Core T10"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#71")
                .itemInputsUnsafe(
                    setStackSize(GalacticraftList.Fluid_Manipulator.copy(), 64),
                    setStackSize(GTItemList.Electric_Pump_UEV.copy(), 8),
                    setStackSize(MultiMachineControllerList.Neutronium_Compressor.copy(), 4),
                    setStackSize(GTBlockList.Quantum_Tank_V.copy(), 16),

                    setStackSize(PipeList.Nonuple_Infinity_Fluid_Pipe.copy(), 32),
                    setStackSize(QuintuplePlateList.Quintuple_Cosmic_Neutronium_Plate.copy(), 24),
                    setStackSize(DoublePlateList.Double_SpaceTime_Plate.copy(), 4))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Draconium, 144 * 64 * 4),
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 320),
                    requiredFluid(MoltenList.Molten_Transcendent_Metal, 144 * 30),
                    requiredFluid(MoltenList.Molten_Infinity_Catalyst, 144 * 120))
                .itemOutputs(setStackSize(GoodGeneratorList.Fluid_Storage_Core_T10, 1))
                .eut(RECIPE_UXV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // GT Part Items
        {
            // LuV
            {
                // "Electric Motor (LuV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#72")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(RodList.Magnetic_Samarium_Rod.copy(), 1),
                        setStackSize(LongRodList.Long_HSSS_Rod.copy(), 2),
                        setStackSize(FineWireList.Fine_Ruridit_Wire.copy(), 64 * 2),
                        setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_1x.copy(), 2))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144),
                        requiredFluid(FluidList.Lubricant, 250))
                    .itemOutputs(setStackSize(GTItemList.Electric_Motor_LuV, 1))
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Pump (LuV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#73")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(GTItemList.Electric_Motor_LuV.copy(), 1),
                        setStackSize(PipeList.Small_Niobium_Titanium_Fluid_Pipe.copy(), 2),
                        setStackSize(PlateList.HSSS_Plate.copy(), 2),
                        setStackSize(ScrewList.HSSS_Screw.copy(), 8),

                        setStackSize(RingList.Silicone_Rubber_Ring.copy(), 4),
                        setStackSize(RotorList.HSSS_Rotor.copy(), 2),
                        setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_1x.copy(), 2))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144),
                        requiredFluid(FluidList.Lubricant, 250))
                    .itemOutputs(setStackSize(GTItemList.Electric_Pump_LuV, 1))
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Conveyor Module (LuV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#74")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(GTItemList.Electric_Motor_LuV.copy(), 2),
                        setStackSize(PlateList.HSSS_Plate.copy(), 2),
                        setStackSize(RingList.HSSS_Ring.copy(), 4),
                        setStackSize(RoundList.HSSS_Round.copy(), 32),

                        setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_1x.copy(), 2),
                        setStackSize(PlateList.Silicone_Rubber_Sheet.copy(), 10))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144),
                        requiredFluid(FluidList.Lubricant, 250))
                    .itemOutputs(setStackSize(GTItemList.Conveyor_Module_LuV, 1))
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Piston (LuV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#75")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(4),

                        setStackSize(GTItemList.Electric_Motor_LuV.copy(), 1),
                        setStackSize(PlateList.HSSS_Plate.copy(), 6),
                        setStackSize(RingList.HSSS_Ring.copy(), 4),
                        setStackSize(RoundList.HSSS_Round.copy(), 32),

                        setStackSize(RodList.HSSS_Rod.copy(), 4),
                        setStackSize(GearList.HSSS_Gear.copy(), 1),
                        setStackSize(SmallGearList.Small_HSSS_Gear.copy(), 2),
                        setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_1x.copy(), 4))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144),
                        requiredFluid(FluidList.Lubricant, 250))
                    .itemOutputs(setStackSize(GTItemList.Electric_Piston_LuV, 1))
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Robot Arm (LuV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#76")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(LongRodList.Long_HSSS_Rod.copy(), 4),
                        setStackSize(GearList.HSSS_Gear.copy(), 1),
                        setStackSize(SmallGearList.Small_HSSS_Gear.copy(), 3),
                        setStackSize(GTItemList.Electric_Motor_LuV.copy(), 2),

                        setStackSize(GTItemList.Electric_Piston_LuV.copy(), 1),
                        getMaterialInput(OrePrefixes.circuit, Materials.LuV, 2),
                        getMaterialInput(OrePrefixes.circuit, Materials.IV, 4),
                        getMaterialInput(OrePrefixes.circuit, Materials.EV, 8),

                        setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_1x.copy(), 6))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 4),
                        requiredFluid(FluidList.Lubricant, 250))
                    .itemOutputs(setStackSize(GTItemList.Robot_Arm_LuV, 1))
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Field Generator (LuV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#77")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(6),

                        setStackSize(FrameBoxList.HSSS_Frame_Box.copy(), 1),
                        setStackSize(PlateList.HSSS_Plate.copy(), 6),
                        setStackSize(GTItemList.Quantum_Star.copy(), 2),
                        setStackSize(GTItemList.Emitter_LuV.copy(), 4),

                        getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),
                        setStackSize(FineWireList.Fine_Ruridit_Wire.copy(), 64 * 4),
                        setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_1x.copy(), 8))
                    .fluidInputs(requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 4))
                    .itemOutputs(setStackSize(GTItemList.Field_Generator_LuV, 1))
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Emitter (LuV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#78")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(7),

                        setStackSize(FrameBoxList.HSSS_Frame_Box.copy(), 1),
                        setStackSize(GTItemList.Electric_Motor_LuV.copy(), 1),
                        setStackSize(RodList.Ruridit_Rod.copy(), 8),
                        setStackSize(GTItemList.Quantum_Star.copy(), 1),

                        getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),
                        setStackSize(FoilList.Gallium_Foil.copy(), 64 * 3),
                        setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_1x.copy(), 7))
                    .fluidInputs(requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 4))
                    .itemOutputs(setStackSize(GTItemList.Emitter_LuV, 1))
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Sensor (LuV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#79")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(8),

                        setStackSize(FrameBoxList.HSSS_Frame_Box.copy(), 1),
                        setStackSize(GTItemList.Electric_Motor_LuV.copy(), 1),
                        setStackSize(PlateList.Ruridit_Plate.copy(), 8),
                        setStackSize(GTItemList.Quantum_Star.copy(), 1),

                        getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),
                        setStackSize(FoilList.Gallium_Foil.copy(), 64 * 3),
                        setStackSize(CableList.Yttrium_Barium_Cuprate_Cable_1x.copy(), 7))
                    .fluidInputs(requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 4))
                    .itemOutputs(setStackSize(GTItemList.Sensor_LuV, 1))
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // ZPM
            {
                // "Electric Motor (ZPM)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#80")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(RodList.Magnetic_Samarium_Rod.copy(), 2),
                        setStackSize(LongRodList.Long_Naquadah_Alloy_Rod.copy(), 4),
                        setStackSize(RingList.Naquadah_Alloy_Ring.copy(), 4),
                        setStackSize(RoundList.Naquadah_Alloy_Round.copy(), 16),

                        setStackSize(FineWireList.Fine_Europium_Wire.copy(), 64 * 3),
                        setStackSize(CableList.Vanadium_Gallium_Cable_4x.copy(), 2))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 2),
                        requiredFluid(FluidList.Lubricant, 750))
                    .itemOutputs(setStackSize(GTItemList.Electric_Motor_ZPM, 1))
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Pump (ZPM)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#81")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 1),
                        setStackSize(PipeList.Enderium_Fluid_Pipe.copy(), 2),
                        setStackSize(PlateList.Naquadah_Alloy_Plate.copy(), 2),
                        setStackSize(ScrewList.Naquadah_Alloy_Screw.copy(), 8),

                        setStackSize(RingList.Silicone_Rubber_Ring.copy(), 8),
                        setStackSize(RotorList.Naquadah_Alloy_Rotor.copy(), 2),
                        setStackSize(CableList.Vanadium_Gallium_Cable_4x.copy(), 2))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 2),
                        requiredFluid(FluidList.Lubricant, 750))
                    .itemOutputs(setStackSize(GTItemList.Electric_Pump_ZPM, 1))
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Conveyor Module (ZPM)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#82")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 2),
                        setStackSize(PlateList.Naquadah_Alloy_Plate.copy(), 2),
                        setStackSize(RingList.Naquadah_Alloy_Ring.copy(), 4),
                        setStackSize(RoundList.Naquadah_Alloy_Round.copy(), 32),

                        setStackSize(CableList.Vanadium_Gallium_Cable_4x.copy(), 2),
                        setStackSize(PlateList.Silicone_Rubber_Sheet.copy(), 20))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 2),
                        requiredFluid(FluidList.Lubricant, 750))
                    .itemOutputs(setStackSize(GTItemList.Conveyor_Module_ZPM, 1))
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Piston (ZPM)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#83")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(4),

                        setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 1),
                        setStackSize(PlateList.Naquadah_Alloy_Plate.copy(), 6),
                        setStackSize(RingList.Naquadah_Alloy_Ring.copy(), 4),
                        setStackSize(RoundList.Naquadah_Alloy_Round.copy(), 32),

                        setStackSize(RodList.Naquadah_Alloy_Rod.copy(), 4),
                        setStackSize(GearList.Naquadah_Alloy_Gear.copy(), 1),
                        setStackSize(SmallGearList.Small_Naquadah_Alloy_Gear.copy(), 2),
                        setStackSize(CableList.Vanadium_Gallium_Cable_4x.copy(), 4))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 2),
                        requiredFluid(FluidList.Lubricant, 750))
                    .itemOutputs(setStackSize(GTItemList.Electric_Piston_ZPM, 1))
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Robot Arm (ZPM)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#84")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(LongRodList.Long_Naquadah_Alloy_Rod.copy(), 4),
                        setStackSize(GearList.Naquadah_Alloy_Gear.copy(), 1),
                        setStackSize(SmallGearList.Small_Naquadah_Alloy_Gear.copy(), 3),
                        setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 2),

                        setStackSize(GTItemList.Electric_Piston_ZPM.copy(), 1),
                        getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 2),
                        getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),
                        getMaterialInput(OrePrefixes.circuit, Materials.IV, 8),

                        setStackSize(CableList.Vanadium_Gallium_Cable_4x.copy(), 6))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 8),
                        requiredFluid(FluidList.Lubricant, 750))
                    .itemOutputs(setStackSize(GTItemList.Robot_Arm_ZPM, 1))
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Field Generator (ZPM)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#85")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(6),

                        setStackSize(FrameBoxList.Naquadah_Alloy_Frame_Box.copy(), 1),
                        setStackSize(PlateList.Naquadah_Alloy_Plate.copy(), 6),
                        setStackSize(GTItemList.Quantum_Star.copy(), 2),
                        setStackSize(GTItemList.Emitter_ZPM.copy(), 4),

                        getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),
                        setStackSize(FineWireList.Fine_Europium_Wire.copy(), 64 * 4),
                        setStackSize(CableList.Vanadium_Gallium_Cable_4x.copy(), 8))
                    .fluidInputs(requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 8))
                    .itemOutputs(setStackSize(GTItemList.Field_Generator_ZPM, 1))
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Emitter (ZPM)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#86")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(7),

                        setStackSize(FrameBoxList.Naquadah_Alloy_Frame_Box.copy(), 1),
                        setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 1),
                        setStackSize(RodList.Osmiridium_Rod.copy(), 8),
                        setStackSize(GTItemList.Quantum_Star.copy(), 2),

                        getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),
                        setStackSize(FoilList.Trinium_Foil.copy(), 64 * 3),
                        setStackSize(CableList.Vanadium_Gallium_Cable_4x.copy(), 7))
                    .fluidInputs(requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 8))
                    .itemOutputs(setStackSize(GTItemList.Emitter_ZPM, 1))
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Sensor (ZPM)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#87")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(8),

                        setStackSize(FrameBoxList.Naquadah_Alloy_Frame_Box.copy(), 1),
                        setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 1),
                        setStackSize(PlateList.Osmiridium_Plate.copy(), 8),
                        setStackSize(GTItemList.Quantum_Star.copy(), 2),

                        getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),
                        setStackSize(FoilList.Trinium_Foil.copy(), 64 * 3),
                        setStackSize(CableList.Vanadium_Gallium_Cable_4x.copy(), 7))
                    .fluidInputs(requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 8))
                    .itemOutputs(setStackSize(GTItemList.Sensor_ZPM, 1))
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // UV
            {
                // "Electric Motor (UV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#88")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(LongRodList.Long_Magnetic_Samarium_Rod.copy(), 2),
                        setStackSize(LongRodList.Long_Neutronium_Rod.copy(), 4),
                        setStackSize(RingList.Neutronium_Ring.copy(), 4),
                        setStackSize(RoundList.Neutronium_Round.copy(), 16),

                        setStackSize(FineWireList.Fine_Americium_Wire.copy(), 64 * 6),
                        setStackSize(CableList.Naquadah_Alloy_Cable_4x.copy(), 2))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Naquadria, 144 * 9),
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 9),
                        requiredFluid(FluidList.Lubricant, 1000 * 2))
                    .itemOutputs(setStackSize(GTItemList.Electric_Motor_UV, 1))
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Pump (UV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#89")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(GTItemList.Electric_Motor_UV.copy(), 1),
                        setStackSize(PipeList.Large_Naquadah_Fluid_Pipe.copy(), 2),
                        setStackSize(PlateList.Neutronium_Plate.copy(), 2),
                        setStackSize(ScrewList.Neutronium_Screw.copy(), 8),

                        setStackSize(RingList.Silicone_Rubber_Ring.copy(), 16),
                        setStackSize(RotorList.Neutronium_Rotor.copy(), 2),
                        setStackSize(CableList.Naquadah_Alloy_Cable_4x.copy(), 2))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Naquadria, 144 * 9),
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 9),
                        requiredFluid(FluidList.Lubricant, 1000 * 2))
                    .itemOutputs(setStackSize(GTItemList.Electric_Pump_UV, 1))
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Conveyor Module (UV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#90")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(GTItemList.Electric_Motor_UV.copy(), 2),
                        setStackSize(PlateList.Neutronium_Plate.copy(), 2),
                        setStackSize(RingList.Neutronium_Ring.copy(), 4),
                        setStackSize(RoundList.Neutronium_Round.copy(), 32),

                        setStackSize(CableList.Naquadah_Alloy_Cable_4x.copy(), 2),
                        setStackSize(PlateList.Silicone_Rubber_Sheet.copy(), 40))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Naquadria, 144 * 9),
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 9),
                        requiredFluid(FluidList.Lubricant, 1000 * 2))
                    .itemOutputs(setStackSize(GTItemList.Conveyor_Module_UV, 1))
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Piston (UV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#91")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(4),

                        setStackSize(GTItemList.Electric_Motor_UV.copy(), 1),
                        setStackSize(PlateList.Neutronium_Plate.copy(), 6),
                        setStackSize(RingList.Neutronium_Ring.copy(), 4),
                        setStackSize(RoundList.Neutronium_Round.copy(), 32),

                        setStackSize(RodList.Neutronium_Rod.copy(), 4),
                        setStackSize(GearList.Neutronium_Gear.copy(), 1),
                        setStackSize(SmallGearList.Small_Neutronium_Gear.copy(), 2),
                        setStackSize(CableList.Naquadah_Alloy_Cable_4x.copy(), 4))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Naquadria, 144 * 9),
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 9),
                        requiredFluid(FluidList.Lubricant, 1000 * 2))
                    .itemOutputs(setStackSize(GTItemList.Electric_Piston_UV, 1))
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Robot Arm (UV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#92")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(LongRodList.Long_Neutronium_Rod.copy(), 4),
                        setStackSize(GearList.Neutronium_Gear.copy(), 1),
                        setStackSize(SmallGearList.Small_Neutronium_Gear.copy(), 3),
                        setStackSize(GTItemList.Electric_Motor_UV.copy(), 2),

                        setStackSize(GTItemList.Electric_Piston_UV.copy(), 1),
                        getMaterialInput(OrePrefixes.circuit, Materials.UV, 2),
                        getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),
                        getMaterialInput(OrePrefixes.circuit, Materials.LuV, 8),

                        setStackSize(CableList.Naquadah_Alloy_Cable_4x.copy(), 6))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Naquadria, 144 * 9),
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 16),
                        requiredFluid(FluidList.Lubricant, 1000 * 2))
                    .itemOutputs(setStackSize(GTItemList.Robot_Arm_UV, 1))
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Field Generator (UV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#93")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(6),

                        setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 1),
                        setStackSize(PlateList.Neutronium_Plate.copy(), 6),
                        setStackSize(GTItemList.Gravi_Star.copy(), 2),
                        setStackSize(GTItemList.Emitter_UV.copy(), 4),

                        getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),
                        setStackSize(FineWireList.Fine_Americium_Wire.copy(), 64 * 6),
                        setStackSize(CableList.Naquadah_Alloy_Cable_4x.copy(), 8))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Naquadria, 144 * 9),
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 16))
                    .itemOutputs(setStackSize(GTItemList.Field_Generator_UV, 1))
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Emitter (UV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#94")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(7),

                        setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 1),
                        setStackSize(GTItemList.Electric_Motor_UV.copy(), 1),
                        setStackSize(RodList.Neutronium_Rod.copy(), 8),
                        setStackSize(GTItemList.Gravi_Star.copy(), 4),

                        getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),
                        setStackSize(FoilList.Naquadria_Foil.copy(), 64 * 3),
                        setStackSize(CableList.Naquadah_Alloy_Cable_4x.copy(), 7))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Naquadria, 144 * 9),
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 16))
                    .itemOutputs(setStackSize(GTItemList.Emitter_UV, 1))
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Sensor (UV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#95")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(8),

                        setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 1),
                        setStackSize(GTItemList.Electric_Motor_UV.copy(), 1),
                        setStackSize(PlateList.Neutronium_Plate.copy(), 8),
                        setStackSize(GTItemList.Gravi_Star.copy(), 4),

                        getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),
                        setStackSize(FoilList.Naquadria_Foil.copy(), 64 * 3),
                        setStackSize(CableList.Naquadah_Alloy_Cable_4x.copy(), 7))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Naquadria, 144 * 9),
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 16))
                    .itemOutputs(setStackSize(GTItemList.Sensor_UV, 1))
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // UHV
            {
                // "Electric Motor (UHV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#96")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(LongRodList.Long_Magnetic_Samarium_Rod.copy(), 4),
                        setStackSize(LongRodList.Long_Cosmic_Neutronium_Rod.copy(), 8),
                        setStackSize(RingList.Cosmic_Neutronium_Ring.copy(), 4),
                        setStackSize(RoundList.Cosmic_Neutronium_Round.copy(), 16),

                        setStackSize(FineWireList.Fine_Neutronium_Wire.copy(), 64 * 8),
                        setStackSize(CableList.Bedrockium_Cable_4x.copy(), 2))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Naquadria, 144 * 18),
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 18),
                        requiredFluid(FluidList.Lubricant, 1000 * 4))
                    .itemOutputs(setStackSize(GTItemList.Electric_Motor_UHV, 1))
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Pump (UHV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#97")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(GTItemList.Electric_Motor_UHV.copy(), 1),
                        setStackSize(PipeList.Large_Neutronium_Fluid_Pipe.copy(), 2),
                        setStackSize(PlateList.Cosmic_Neutronium_Plate.copy(), 4),
                        setStackSize(ScrewList.Cosmic_Neutronium_Screw.copy(), 16),

                        setStackSize(RingList.Silicone_Rubber_Ring.copy(), 32),
                        setStackSize(RotorList.Cosmic_Neutronium_Rotor.copy(), 4),
                        setStackSize(CableList.Bedrockium_Cable_4x.copy(), 2))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Naquadria, 144 * 18),
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 18),
                        requiredFluid(FluidList.Lubricant, 1000 * 4))
                    .itemOutputs(setStackSize(GTItemList.Electric_Pump_UHV, 1))
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Conveyor Module (UHV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#98")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(GTItemList.Electric_Motor_UHV.copy(), 2),
                        setStackSize(PlateList.Cosmic_Neutronium_Plate.copy(), 2),
                        setStackSize(RingList.Cosmic_Neutronium_Ring.copy(), 8),
                        setStackSize(RoundList.Cosmic_Neutronium_Round.copy(), 64),

                        setStackSize(CableList.Bedrockium_Cable_4x.copy(), 2),
                        setStackSize(PlateList.Silicone_Rubber_Sheet.copy(), 40))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Naquadria, 144 * 18),
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 18),
                        requiredFluid(FluidList.Lubricant, 1000 * 4))
                    .itemOutputs(setStackSize(GTItemList.Conveyor_Module_UHV, 1))
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Piston (UHV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#99")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(4),

                        setStackSize(GTItemList.Electric_Motor_UHV.copy(), 1),
                        setStackSize(PlateList.Cosmic_Neutronium_Plate.copy(), 6),
                        setStackSize(RingList.Cosmic_Neutronium_Ring.copy(), 8),
                        setStackSize(RoundList.Cosmic_Neutronium_Round.copy(), 64),

                        setStackSize(RodList.Cosmic_Neutronium_Rod.copy(), 8),
                        setStackSize(GearList.Cosmic_Neutronium_Gear.copy(), 2),
                        setStackSize(SmallGearList.Small_Cosmic_Neutronium_Gear.copy(), 4),
                        setStackSize(CableList.Bedrockium_Cable_4x.copy(), 4))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Naquadria, 144 * 18),
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 18),
                        requiredFluid(FluidList.Lubricant, 1000 * 4))
                    .itemOutputs(setStackSize(GTItemList.Electric_Piston_UHV, 1))
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Robot Arm (UHV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#100")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(LongRodList.Long_Cosmic_Neutronium_Rod.copy(), 8),
                        setStackSize(GearList.Cosmic_Neutronium_Gear.copy(), 2),
                        setStackSize(SmallGearList.Small_Cosmic_Neutronium_Gear.copy(), 6),
                        setStackSize(GTItemList.Electric_Motor_UHV.copy(), 2),

                        setStackSize(GTItemList.Electric_Piston_UHV.copy(), 1),
                        getMaterialInput(OrePrefixes.circuit, Materials.UHV, 2),
                        getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),
                        getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 8),

                        setStackSize(CableList.Bedrockium_Cable_4x.copy(), 6))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Naquadria, 144 * 18),
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 18),
                        requiredFluid(FluidList.Lubricant, 1000 * 4))
                    .itemOutputs(setStackSize(GTItemList.Robot_Arm_UHV, 1))
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Field Generator (UHV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#101")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(6),

                        setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box.copy(), 1),
                        setStackSize(PlateList.Cosmic_Neutronium_Plate.copy(), 6),
                        setStackSize(GTItemList.Gravi_Star.copy(), 4),
                        setStackSize(GTItemList.Emitter_UHV.copy(), 4),

                        getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),
                        setStackSize(FineWireList.Fine_Neutronium_Wire.copy(), 64 * 8),
                        setStackSize(CableList.Bedrockium_Cable_4x.copy(), 8))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Naquadria, 144 * 18),
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 18))
                    .itemOutputs(setStackSize(GTItemList.Field_Generator_UHV, 1))
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Emitter (UHV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#102")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(7),

                        setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box.copy(), 1),
                        setStackSize(GTItemList.Electric_Motor_UHV.copy(), 1),
                        setStackSize(RodList.Cosmic_Neutronium_Rod.copy(), 8),
                        setStackSize(GTItemList.Gravi_Star.copy(), 8),

                        getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),
                        setStackSize(FoilList.Fluxed_Electrum_Foil.copy(), 64 * 4),
                        setStackSize(CableList.Bedrockium_Cable_4x.copy(), 7))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Naquadria, 144 * 18),
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 18))
                    .itemOutputs(setStackSize(GTItemList.Emitter_UHV, 1))
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Sensor (UHV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#103")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(8),

                        setStackSize(FrameBoxList.Cosmic_Neutronium_Frame_Box.copy(), 1),
                        setStackSize(GTItemList.Electric_Motor_UHV.copy(), 1),
                        setStackSize(PlateList.Cosmic_Neutronium_Plate.copy(), 8),
                        setStackSize(GTItemList.Gravi_Star.copy(), 8),

                        getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),
                        setStackSize(FoilList.Fluxed_Electrum_Foil.copy(), 64 * 4),
                        setStackSize(CableList.Bedrockium_Cable_4x.copy(), 7))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Naquadria, 144 * 18),
                        requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 18))
                    .itemOutputs(setStackSize(GTItemList.Sensor_UHV, 1))
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // UEV
            {
                // "Electric Motor (UEV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#104")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(LongRodList.Long_Attuned_Tengam_Rod.copy(), 8),
                        setStackSize(LongRodList.Long_Infinity_Rod.copy(), 16),
                        setStackSize(RingList.Infinity_Ring.copy(), 8),
                        setStackSize(RoundList.Infinity_Round.copy(), 32),

                        setStackSize(FineWireList.Fine_Cosmic_Neutronium_Wire.copy(), 64 * 8),
                        setStackSize(CableList.Draconium_Cable_4x.copy(), 2))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Quantium, 144 * 18),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18),
                        requiredFluid(FluidList.Lubricant, 1000 * 4))
                    .itemOutputs(setStackSize(GTItemList.Electric_Motor_UEV, 1))
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Pump (UEV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#105")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(GTItemList.Electric_Motor_UEV.copy(), 1),
                        setStackSize(PipeList.Large_Nether_Star_Fluid_Pipe.copy(), 2),
                        setStackSize(PlateList.Infinity_Plate.copy(), 4),
                        setStackSize(ScrewList.Infinity_Screw.copy(), 16),

                        setStackSize(RingList.Silicone_Rubber_Ring.copy(), 64),
                        setStackSize(RotorList.Infinity_Rotor.copy(), 4),
                        setStackSize(CableList.Draconium_Cable_4x.copy(), 2))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Quantium, 144 * 18),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18),
                        requiredFluid(FluidList.Lubricant, 1000 * 4))
                    .itemOutputs(setStackSize(GTItemList.Electric_Pump_UEV, 1))
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Conveyor Module (UEV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#106")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(GTItemList.Electric_Motor_UEV.copy(), 2),
                        setStackSize(PlateList.Infinity_Plate.copy(), 2),
                        setStackSize(RingList.Infinity_Ring.copy(), 8),
                        setStackSize(RoundList.Infinity_Round.copy(), 64),

                        setStackSize(CableList.Draconium_Cable_4x.copy(), 2),
                        setStackSize(PlateList.Silicone_Rubber_Sheet.copy(), 64 * 2))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Quantium, 144 * 18),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18),
                        requiredFluid(FluidList.Lubricant, 1000 * 4))
                    .itemOutputs(setStackSize(GTItemList.Conveyor_Module_UEV, 1))
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Piston (UEV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#107")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(4),

                        setStackSize(GTItemList.Electric_Motor_UEV.copy(), 1),
                        setStackSize(PlateList.Infinity_Plate.copy(), 6),
                        setStackSize(RingList.Infinity_Ring.copy(), 8),
                        setStackSize(RoundList.Infinity_Round.copy(), 64),

                        setStackSize(RodList.Infinity_Rod.copy(), 8),
                        setStackSize(GearList.Infinity_Gear.copy(), 2),
                        setStackSize(SmallGearList.Small_Infinity_Gear.copy(), 4),
                        setStackSize(CableList.Draconium_Cable_4x.copy(), 4))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Quantium, 144 * 18),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18),
                        requiredFluid(FluidList.Lubricant, 1000 * 4))
                    .itemOutputs(setStackSize(GTItemList.Electric_Piston_UEV, 1))
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Robot Arm (UEV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#108")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(LongRodList.Long_Infinity_Rod.copy(), 8),
                        setStackSize(GearList.Infinity_Gear.copy(), 2),
                        setStackSize(SmallGearList.Small_Infinity_Gear.copy(), 6),
                        setStackSize(GTItemList.Electric_Motor_UEV.copy(), 2),

                        setStackSize(GTItemList.Electric_Piston_UEV.copy(), 1),
                        getMaterialInput(OrePrefixes.circuit, Materials.UEV, 2),
                        getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),
                        getMaterialInput(OrePrefixes.circuit, Materials.UV, 8),

                        setStackSize(CableList.Draconium_Cable_4x.copy(), 6))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Quantium, 144 * 18),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18),
                        requiredFluid(FluidList.Lubricant, 1000 * 4))
                    .itemOutputs(setStackSize(GTItemList.Robot_Arm_UEV, 1))
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Field Generator (UEV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#109")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(6),

                        setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 1),
                        setStackSize(PlateList.Infinity_Plate.copy(), 6),
                        setStackSize(GTItemList.Gravi_Star.copy(), 8),
                        setStackSize(GTItemList.Emitter_UEV.copy(), 4),

                        getMaterialInput(OrePrefixes.circuit, Materials.UIV, 4),
                        setStackSize(FineWireList.Fine_Tritanium_Wire.copy(), 64 * 8),
                        setStackSize(CableList.Draconium_Cable_4x.copy(), 8))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Quantium, 144 * 18),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18))
                    .itemOutputs(setStackSize(GTItemList.Field_Generator_UEV, 1))
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Emitter (UEV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#110")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(7),

                        setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 1),
                        setStackSize(GTItemList.Electric_Motor_UEV.copy(), 1),
                        setStackSize(RodList.Infinity_Rod.copy(), 16),
                        setStackSize(GTItemList.Gravi_Star.copy(), 16),

                        getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),
                        setStackSize(FoilList.Infinity_Catalyst_Foil.copy(), 64 * 4),
                        setStackSize(CableList.Draconium_Cable_4x.copy(), 7))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Quantium, 144 * 18),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18))
                    .itemOutputs(setStackSize(GTItemList.Emitter_UEV, 1))
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Sensor (UEV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#111")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(8),

                        setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 1),
                        setStackSize(GTItemList.Electric_Motor_UEV.copy(), 1),
                        setStackSize(PlateList.Infinity_Plate.copy(), 8),
                        setStackSize(GTItemList.Gravi_Star.copy(), 16),

                        getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),
                        setStackSize(FoilList.Infinity_Catalyst_Foil.copy(), 64 * 4),
                        setStackSize(CableList.Draconium_Cable_4x.copy(), 7))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Quantium, 144 * 18),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18))
                    .itemOutputs(setStackSize(GTItemList.Sensor_UEV, 1))
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // UIV
            {
                // "Electric Motor (UIV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#112")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(LongRodList.Long_Attuned_Tengam_Rod.copy(), 16),
                        setStackSize(LongRodList.Long_Transcendent_Metal_Rod.copy(), 16),
                        setStackSize(RingList.Transcendent_Metal_Ring.copy(), 8),
                        setStackSize(RoundList.Transcendent_Metal_Round.copy(), 32),

                        setStackSize(FineWireList.Fine_Proto_Halkonite_Steel_Wire.copy(), 64 * 8),
                        setStackSize(CableList.Nether_Star_Cable_4x.copy(), 2))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18),
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 4))
                    .itemOutputs(setStackSize(GTItemList.Electric_Motor_UIV, 1))
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Pump (UIV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#113")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(GTItemList.Electric_Motor_UIV.copy(), 1),
                        setStackSize(PipeList.Large_Awakened_Draconium_Fluid_Pipe.copy(), 2),
                        setStackSize(PlateList.Transcendent_Metal_Plate.copy(), 4),
                        setStackSize(ScrewList.Transcendent_Metal_Screw.copy(), 16),

                        setStackSize(RingList.Silicone_Rubber_Ring.copy(), 64),
                        setStackSize(RotorList.Transcendent_Metal_Rotor.copy(), 4),
                        setStackSize(CableList.Nether_Star_Cable_4x.copy(), 2))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18),
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 4))
                    .itemOutputs(setStackSize(GTItemList.Electric_Pump_UIV, 1))
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Conveyor Module (UIV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#114")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(GTItemList.Electric_Motor_UIV.copy(), 2),
                        setStackSize(PlateList.Transcendent_Metal_Plate.copy(), 2),
                        setStackSize(RingList.Transcendent_Metal_Ring.copy(), 8),
                        setStackSize(RoundList.Transcendent_Metal_Round.copy(), 64),

                        setStackSize(CableList.Nether_Star_Cable_4x.copy(), 2),
                        setStackSize(PlateList.Silicone_Rubber_Sheet.copy(), 64 + 16))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18),
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 4))
                    .itemOutputs(setStackSize(GTItemList.Conveyor_Module_UIV, 1))
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Piston (UIV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#115")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(4),

                        setStackSize(GTItemList.Electric_Motor_UIV.copy(), 1),
                        setStackSize(PlateList.Transcendent_Metal_Plate.copy(), 6),
                        setStackSize(RingList.Transcendent_Metal_Ring.copy(), 8),
                        setStackSize(RoundList.Transcendent_Metal_Round.copy(), 64),

                        setStackSize(RodList.Transcendent_Metal_Rod.copy(), 8),
                        setStackSize(GearList.Transcendent_Metal_Gear.copy(), 2),
                        setStackSize(SmallGearList.Small_Transcendent_Metal_Gear.copy(), 4),
                        setStackSize(CableList.Nether_Star_Cable_4x.copy(), 4))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18),
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 4))
                    .itemOutputs(setStackSize(GTItemList.Electric_Piston_UIV, 1))
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Robot Arm (UIV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#116")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(LongRodList.Long_Transcendent_Metal_Rod.copy(), 8),
                        setStackSize(GearList.Transcendent_Metal_Gear.copy(), 2),
                        setStackSize(SmallGearList.Small_Transcendent_Metal_Gear.copy(), 6),
                        setStackSize(GTItemList.Electric_Motor_UIV.copy(), 2),

                        setStackSize(GTItemList.Electric_Piston_UIV.copy(), 1),
                        getMaterialInput(OrePrefixes.circuit, Materials.UIV, 2),
                        getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),
                        getMaterialInput(OrePrefixes.circuit, Materials.UHV, 8),

                        setStackSize(CableList.Nether_Star_Cable_4x.copy(), 6))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18),
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 4))
                    .itemOutputs(setStackSize(GTItemList.Robot_Arm_UIV, 1))
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Field Generator (UIV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#117")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(6),

                        setStackSize(FrameBoxList.Transcendent_Metal_Frame_Box.copy(), 1),
                        setStackSize(PlateList.Transcendent_Metal_Plate.copy(), 6),
                        setStackSize(GTItemList.Nuclear_Star.copy(), 1),
                        setStackSize(GTItemList.Emitter_UIV.copy(), 4),

                        getMaterialInput(OrePrefixes.circuit, Materials.UMV, 4),
                        setStackSize(FineWireList.Fine_Proto_Halkonite_Steel_Wire.copy(), 64 * 8),
                        setStackSize(CableList.Nether_Star_Cable_4x.copy(), 8))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18))
                    .itemOutputs(setStackSize(GTItemList.Field_Generator_UIV, 1))
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Emitter (UIV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#118")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(7),

                        setStackSize(FrameBoxList.Transcendent_Metal_Frame_Box.copy(), 1),
                        setStackSize(GTItemList.Electric_Motor_UIV.copy(), 1),
                        setStackSize(RodList.Transcendent_Metal_Rod.copy(), 16),
                        setStackSize(GTItemList.Nuclear_Star.copy(), 2),

                        getMaterialInput(OrePrefixes.circuit, Materials.UIV, 4),
                        setStackSize(FoilList.Arceus_Alloy_2B_Foil.copy(), 64),
                        setStackSize(FoilList.Lafium_Compound_Foil.copy(), 64),
                        setStackSize(FoilList.Cinobite_A243_Foil.copy(), 64),

                        setStackSize(FoilList.Pikyonium_64B_Foil.copy(), 64),
                        setStackSize(CableList.Nether_Star_Cable_4x.copy(), 7))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18))
                    .itemOutputs(setStackSize(GTItemList.Emitter_UIV, 1))
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Sensor (UIV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#119")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(8),

                        setStackSize(FrameBoxList.Transcendent_Metal_Frame_Box.copy(), 1),
                        setStackSize(GTItemList.Electric_Motor_UIV.copy(), 1),
                        setStackSize(PlateList.Transcendent_Metal_Plate.copy(), 8),
                        setStackSize(GTItemList.Nuclear_Star.copy(), 2),

                        getMaterialInput(OrePrefixes.circuit, Materials.UIV, 4),
                        setStackSize(FoilList.Arceus_Alloy_2B_Foil.copy(), 64),
                        setStackSize(FoilList.Lafium_Compound_Foil.copy(), 64),
                        setStackSize(FoilList.Cinobite_A243_Foil.copy(), 64),

                        setStackSize(FoilList.Pikyonium_64B_Foil.copy(), 64),
                        setStackSize(CableList.Nether_Star_Cable_4x.copy(), 7))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18))
                    .itemOutputs(setStackSize(GTItemList.Sensor_UIV, 1))
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // UMV
            {
                // "Electric Motor (UMV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#120")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(LongRodList.Long_Attuned_Tengam_Rod.copy(), 32),
                        setStackSize(LongRodList.Long_SpaceTime_Rod.copy(), 16),
                        setStackSize(RingList.SpaceTime_Ring.copy(), 8),
                        setStackSize(RoundList.SpaceTime_Round.copy(), 32),

                        setStackSize(FineWireList.Fine_Hypogen_Wire.copy(), 64 * 8),
                        setStackSize(CableList.Quantium_Cable_4x.copy(), 2))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Hypogen, 144 * 4),
                        requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18),
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 4))
                    .itemOutputs(setStackSize(GTItemList.Electric_Motor_UMV, 1))
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Pump (UMV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#121")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(GTItemList.Electric_Motor_UMV.copy(), 1),
                        setStackSize(PipeList.Large_Infinity_Fluid_Pipe.copy(), 2),
                        setStackSize(PlateList.SpaceTime_Plate.copy(), 4),
                        setStackSize(ScrewList.SpaceTime_Screw.copy(), 16),

                        setStackSize(RingList.Silicone_Rubber_Ring.copy(), 64),
                        setStackSize(RotorList.SpaceTime_Rotor.copy(), 4),
                        setStackSize(CableList.Quantium_Cable_4x.copy(), 2))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Hypogen, 144 * 4),
                        requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18),
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 4))
                    .itemOutputs(setStackSize(GTItemList.Electric_Pump_UMV, 1))
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Conveyor Module (UMV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#122")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(GTItemList.Electric_Motor_UMV.copy(), 2),
                        setStackSize(PlateList.SpaceTime_Plate.copy(), 2),
                        setStackSize(RingList.SpaceTime_Ring.copy(), 8),
                        setStackSize(RoundList.SpaceTime_Round.copy(), 64),

                        setStackSize(CableList.Quantium_Cable_4x.copy(), 2),
                        setStackSize(PlateList.Silicone_Rubber_Sheet.copy(), 64 + 16))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Hypogen, 144 * 4),
                        requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18),
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 4))
                    .itemOutputs(setStackSize(GTItemList.Conveyor_Module_UMV, 1))
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Piston (UMV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#123")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(4),

                        setStackSize(GTItemList.Electric_Motor_UMV.copy(), 1),
                        setStackSize(PlateList.SpaceTime_Plate.copy(), 6),
                        setStackSize(RingList.SpaceTime_Ring.copy(), 8),
                        setStackSize(RoundList.SpaceTime_Round.copy(), 64),

                        setStackSize(RodList.SpaceTime_Rod.copy(), 8),
                        setStackSize(GearList.SpaceTime_Gear.copy(), 2),
                        setStackSize(SmallGearList.Small_SpaceTime_Gear.copy(), 4),
                        setStackSize(CableList.Quantium_Cable_4x.copy(), 4))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Hypogen, 144 * 4),
                        requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18),
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 4))
                    .itemOutputs(setStackSize(GTItemList.Electric_Piston_UMV, 1))
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Robot Arm (UMV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#124")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(LongRodList.Long_SpaceTime_Rod.copy(), 8),
                        setStackSize(GearList.SpaceTime_Gear.copy(), 2),
                        setStackSize(SmallGearList.Small_SpaceTime_Gear.copy(), 6),
                        setStackSize(GTItemList.Electric_Motor_UMV.copy(), 2),

                        setStackSize(GTItemList.Electric_Piston_UMV.copy(), 1),
                        getMaterialInput(OrePrefixes.circuit, Materials.UMV, 2),
                        getMaterialInput(OrePrefixes.circuit, Materials.UIV, 4),
                        getMaterialInput(OrePrefixes.circuit, Materials.UEV, 8),

                        setStackSize(CableList.Quantium_Cable_4x.copy(), 6))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Hypogen, 144 * 4),
                        requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18),
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 4))
                    .itemOutputs(setStackSize(GTItemList.Robot_Arm_UMV, 1))
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Field Generator (UMV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#125")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(6),

                        setStackSize(FrameBoxList.SpaceTime_Frame_Box.copy(), 1),
                        setStackSize(PlateList.SpaceTime_Plate.copy(), 6),
                        setStackSize(GTItemList.Nuclear_Star.copy(), 2),
                        setStackSize(GTItemList.Emitter_UMV.copy(), 4),

                        getMaterialInput(OrePrefixes.circuit, Materials.UXV, 4),
                        setStackSize(FineWireList.Fine_Hypogen_Wire.copy(), 64 * 8),
                        setStackSize(CableList.Quantium_Cable_4x.copy(), 8))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Hypogen, 144 * 4),
                        requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18))
                    .itemOutputs(setStackSize(GTItemList.Field_Generator_UMV, 1))
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Emitter (UMV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#126")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(7),

                        setStackSize(FrameBoxList.SpaceTime_Frame_Box.copy(), 1),
                        setStackSize(GTItemList.Electric_Motor_UMV.copy(), 1),
                        setStackSize(RodList.SpaceTime_Rod.copy(), 16),
                        setStackSize(GTItemList.Nuclear_Star.copy(), 2),

                        getMaterialInput(OrePrefixes.circuit, Materials.UMV, 4),
                        setStackSize(FoilList.Celestial_Tungsten_Foil.copy(), 64),
                        setStackSize(FoilList.Quantum_Foil.copy(), 64),
                        setStackSize(FoilList.Astral_Titanium_Foil.copy(), 64),

                        setStackSize(FoilList.Titansteel_Foil.copy(), 64),
                        setStackSize(CableList.Quantium_Cable_4x.copy(), 7))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Hypogen, 144 * 4),
                        requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18))
                    .itemOutputs(setStackSize(GTItemList.Emitter_UMV, 1))
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Sensor (UMV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#127")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(8),

                        setStackSize(FrameBoxList.SpaceTime_Frame_Box.copy(), 1),
                        setStackSize(GTItemList.Electric_Motor_UMV.copy(), 1),
                        setStackSize(PlateList.SpaceTime_Plate.copy(), 8),
                        setStackSize(GTItemList.Nuclear_Star.copy(), 2),

                        getMaterialInput(OrePrefixes.circuit, Materials.UMV, 4),
                        setStackSize(FoilList.Celestial_Tungsten_Foil.copy(), 64),
                        setStackSize(FoilList.Quantum_Foil.copy(), 64),
                        setStackSize(FoilList.Astral_Titanium_Foil.copy(), 64),

                        setStackSize(FoilList.Titansteel_Foil.copy(), 64),
                        setStackSize(CableList.Quantium_Cable_4x.copy(), 7))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Hypogen, 144 * 4),
                        requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 18))
                    .itemOutputs(setStackSize(GTItemList.Sensor_UMV, 1))
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // UXV
            {
                // "Electric Motor (UXV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#128")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(GTItemList.Energised_Tesseract.copy(), 1),
                        setStackSize(LongRodList.Long_Magnetohydrodynamically_Constrained_Star_Matter_Rod.copy(), 16),
                        setStackSize(RingList.Magnetohydrodynamically_Constrained_Star_Matter_Ring.copy(), 8),
                        setStackSize(RoundList.Magnetohydrodynamically_Constrained_Star_Matter_Round.copy(), 32),

                        setStackSize(FineWireList.Fine_Superconductor_Base_UHV_Wire.copy(), 64 * 2),
                        setStackSize(
                            FineWireList.Fine_Magnetohydrodynamically_Constrained_Star_Matter_Wire.copy(),
                            64 * 2),
                        setStackSize(FineWireList.Fine_Universium_Wire.copy(), 64 * 2),
                        setStackSize(FineWireList.Fine_Magmatter_Wire.copy(), 64 * 2),

                        setStackSize(WireList.SpaceTime_Wire_4x.copy(), 4),
                        setStackSize(GTItemList.Neutronium_Nanites.copy(), 4))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Magnetohydrodynamically_Constrained_Star_Matter, 144 * 4),
                        requiredFluid(MoltenList.Molten_SpaceTime, 144 * 4),
                        requiredFluid(MoltenList.Molten_Universium, 144 * 18),
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 8))
                    .itemOutputs(setStackSize(GTItemList.Electric_Motor_UXV, 1))
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Pump (UXV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#129")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(GTItemList.Electric_Motor_UXV.copy(), 1),
                        setStackSize(PipeList.Large_SpaceTime_Fluid_Pipe.copy(), 2),
                        setStackSize(PlateList.Magnetohydrodynamically_Constrained_Star_Matter_Plate.copy(), 4),
                        setStackSize(ScrewList.Magnetohydrodynamically_Constrained_Star_Matter_Screw.copy(), 16),

                        setStackSize(RingList.Kevlar_Ring.copy(), 64),
                        setStackSize(RingList.Radox_Polymer_Ring.copy(), 64),
                        setStackSize(RotorList.Magnetohydrodynamically_Constrained_Star_Matter_Rotor.copy(), 4),
                        setStackSize(RotorList.Magmatter_Rotor.copy(), 4),

                        setStackSize(WireList.SpaceTime_Wire_4x.copy(), 4),
                        setStackSize(GTItemList.Neutronium_Nanites.copy(), 4))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Magnetohydrodynamically_Constrained_Star_Matter, 144 * 4),
                        requiredFluid(MoltenList.Molten_SpaceTime, 144 * 4),
                        requiredFluid(MoltenList.Molten_Universium, 144 * 18),
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 8))
                    .itemOutputs(setStackSize(GTItemList.Electric_Pump_UXV, 1))
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Conveyor Module (UXV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#130")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(GTItemList.Electric_Motor_UXV.copy(), 2),
                        setStackSize(PlateList.Magnetohydrodynamically_Constrained_Star_Matter_Plate.copy(), 2),
                        setStackSize(RingList.Magnetohydrodynamically_Constrained_Star_Matter_Ring.copy(), 8),
                        setStackSize(RoundList.Magnetohydrodynamically_Constrained_Star_Matter_Round.copy(), 64),

                        setStackSize(WireList.SpaceTime_Wire_4x.copy(), 2),
                        setStackSize(PlateList.Kevlar_Plate.copy(), 64 + 16),
                        setStackSize(PlateList.Radox_Polymer_Sheet.copy(), 64 + 16),
                        setStackSize(GTItemList.Neutronium_Nanites.copy(), 4))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Magnetohydrodynamically_Constrained_Star_Matter, 144 * 4),
                        requiredFluid(MoltenList.Molten_SpaceTime, 144 * 4),
                        requiredFluid(MoltenList.Molten_Universium, 144 * 18),
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 8))
                    .itemOutputs(setStackSize(GTItemList.Conveyor_Module_UXV, 1))
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Electric Piston (UXV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#131")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(4),

                        setStackSize(GTItemList.Electric_Motor_UXV.copy(), 1),
                        setStackSize(PlateList.Magnetohydrodynamically_Constrained_Star_Matter_Plate.copy(), 6),
                        setStackSize(RingList.Magnetohydrodynamically_Constrained_Star_Matter_Ring.copy(), 8),
                        setStackSize(RoundList.Magnetohydrodynamically_Constrained_Star_Matter_Round.copy(), 64),

                        setStackSize(RodList.Magnetohydrodynamically_Constrained_Star_Matter_Rod.copy(), 8),
                        setStackSize(GearList.Magnetohydrodynamically_Constrained_Star_Matter_Gear.copy(), 2),
                        setStackSize(GearList.Magmatter_Gear.copy(), 2),
                        setStackSize(
                            SmallGearList.Small_Magnetohydrodynamically_Constrained_Star_Matter_Gear.copy(),
                            4),

                        setStackSize(SmallGearList.Small_Magmatter_Gear.copy(), 4),
                        setStackSize(WireList.SpaceTime_Wire_4x.copy(), 8),
                        setStackSize(GTItemList.Neutronium_Nanites.copy(), 4))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Magnetohydrodynamically_Constrained_Star_Matter, 144 * 4),
                        requiredFluid(MoltenList.Molten_SpaceTime, 144 * 4),
                        requiredFluid(MoltenList.Molten_Universium, 144 * 18),
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 8))
                    .itemOutputs(setStackSize(GTItemList.Electric_Piston_UXV, 1))
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Robot Arm (UXV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#132")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(LongRodList.Long_Magnetohydrodynamically_Constrained_Star_Matter_Rod.copy(), 8),
                        setStackSize(GearList.Magnetohydrodynamically_Constrained_Star_Matter_Gear.copy(), 2),
                        setStackSize(GearList.Magmatter_Gear.copy(), 2),
                        setStackSize(
                            SmallGearList.Small_Magnetohydrodynamically_Constrained_Star_Matter_Gear.copy(),
                            6),
                        setStackSize(SmallGearList.Small_Magmatter_Gear.copy(), 6),
                        setStackSize(GTItemList.Electric_Motor_UXV.copy(), 2),

                        setStackSize(GTItemList.Electric_Piston_UXV.copy(), 1),
                        getMaterialInput(OrePrefixes.circuit, Materials.UXV, 2),
                        getMaterialInput(OrePrefixes.circuit, Materials.UMV, 4),
                        getMaterialInput(OrePrefixes.circuit, Materials.UIV, 8),

                        setStackSize(WireList.SpaceTime_Wire_4x.copy(), 12),
                        setStackSize(GTItemList.Neutronium_Nanites.copy(), 8))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Magnetohydrodynamically_Constrained_Star_Matter, 144 * 4),
                        requiredFluid(MoltenList.Molten_SpaceTime, 144 * 4),
                        requiredFluid(MoltenList.Molten_Universium, 144 * 18),
                        requiredFluid(FluidList.Dimensionally_Shifted_Superfluid, 1000 * 8))
                    .itemOutputs(setStackSize(GTItemList.Robot_Arm_UXV, 1))
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Field Generator (UXV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#133")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(6),

                        setStackSize(FrameBoxList.Magnetohydrodynamically_Constrained_Star_Matter_Frame_Box.copy(), 1),
                        setStackSize(PlateList.Magnetohydrodynamically_Constrained_Star_Matter_Plate.copy(), 6),
                        setStackSize(GTItemList.Nuclear_Star.copy(), 64),
                        setStackSize(GTItemList.Emitter_UXV.copy(), 4),

                        getMaterialInput(OrePrefixes.circuit, Materials.MAX, 4),
                        setStackSize(FineWireList.Fine_Superconductor_Base_UHV_Wire.copy(), 64 * 2),
                        setStackSize(
                            FineWireList.Fine_Magnetohydrodynamically_Constrained_Star_Matter_Wire.copy(),
                            64 * 2),
                        setStackSize(FineWireList.Fine_Universium_Wire.copy(), 64 * 2),

                        setStackSize(FineWireList.Fine_Magmatter_Wire.copy(), 64 * 2),
                        setStackSize(WireList.SpaceTime_Wire_4x.copy(), 16),
                        setStackSize(GTItemList.Neutronium_Nanites.copy(), 12))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Magnetohydrodynamically_Constrained_Star_Matter, 144 * 4),
                        requiredFluid(MoltenList.Molten_SpaceTime, 144 * 4),
                        requiredFluid(MoltenList.Molten_Universium, 144 * 18),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 100))
                    .itemOutputs(setStackSize(GTItemList.Field_Generator_UXV, 1))
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Emitter (UXV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#134")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(7),

                        setStackSize(FrameBoxList.Magnetohydrodynamically_Constrained_Star_Matter_Frame_Box.copy(), 1),
                        setStackSize(GTItemList.Electric_Motor_UXV.copy(), 1),
                        setStackSize(RodList.Magnetohydrodynamically_Constrained_Star_Matter_Rod.copy(), 16),
                        setStackSize(GTItemList.Nuclear_Star.copy(), 16),

                        getMaterialInput(OrePrefixes.circuit, Materials.UXV, 4),
                        setStackSize(FoilList.Magnetohydrodynamically_Constrained_Star_Matter_Foil.copy(), 64),
                        setStackSize(FoilList.Magmatter_Foil.copy(), 64),
                        setStackSize(FoilList.SpaceTime_Foil.copy(), 64),

                        setStackSize(FoilList.Universium_Foil.copy(), 64),
                        setStackSize(WireList.SpaceTime_Wire_4x.copy(), 14),
                        setStackSize(GTItemList.Neutronium_Nanites.copy(), 8))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Magnetohydrodynamically_Constrained_Star_Matter, 144 * 4),
                        requiredFluid(MoltenList.Molten_SpaceTime, 144 * 4),
                        requiredFluid(MoltenList.Molten_Universium, 144 * 18),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 100))
                    .itemOutputs(setStackSize(GTItemList.Emitter_UXV, 1))
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Sensor (UXV)"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#135")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(8),

                        setStackSize(FrameBoxList.Magnetohydrodynamically_Constrained_Star_Matter_Frame_Box.copy(), 1),
                        setStackSize(GTItemList.Electric_Motor_UXV.copy(), 1),
                        setStackSize(PlateList.Magnetohydrodynamically_Constrained_Star_Matter_Plate.copy(), 8),
                        setStackSize(GTItemList.Nuclear_Star.copy(), 16),

                        getMaterialInput(OrePrefixes.circuit, Materials.UXV, 4),
                        setStackSize(FoilList.Magnetohydrodynamically_Constrained_Star_Matter_Foil.copy(), 64),
                        setStackSize(FoilList.Magmatter_Foil.copy(), 64),
                        setStackSize(FoilList.SpaceTime_Foil.copy(), 64),

                        setStackSize(FoilList.Universium_Foil.copy(), 64),
                        setStackSize(WireList.SpaceTime_Wire_4x.copy(), 14),
                        setStackSize(GTItemList.Neutronium_Nanites.copy(), 8))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Magnetohydrodynamically_Constrained_Star_Matter, 144 * 4),
                        requiredFluid(MoltenList.Molten_SpaceTime, 144 * 4),
                        requiredFluid(MoltenList.Molten_Universium, 144 * 18),
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 100))
                    .itemOutputs(setStackSize(GTItemList.Sensor_UXV, 1))
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }
        }

        // Heavy Duty Alloy Ingot
        {
            // "Heavy Duty Alloy Ingot T4"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#136")
                .itemInputsUnsafe(
                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_3.copy(), 1),
                    setStackSize(MiscPlateList.Compressed_Ice_Plate.copy(), 6),
                    setStackSize(BoltList.Ruridit_Bolt.copy(), 4))
                .fluidInputs(requiredFluid(MoltenList.Molten_Indalloy_140, 36))
                .itemOutputs(setStackSize(NewHorizonsCoreModList.Heavy_Duty_Alloy_Ingot_T4, 1))
                .eut(RECIPE_LuV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Heavy Duty Alloy Ingot T5"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#137")
                .itemInputsUnsafe(
                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_4.copy(), 1),
                    setStackSize(MiscPlateList.Compressed_Quantium_Plate.copy(), 8),
                    setStackSize(BoltList.Europium_Bolt.copy(), 8))
                .fluidInputs(requiredFluid(MoltenList.Molten_Indalloy_140, 72))
                .itemOutputs(setStackSize(NewHorizonsCoreModList.Heavy_Duty_Alloy_Ingot_T5, 1))
                .eut(RECIPE_ZPM)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Heavy Duty Alloy Ingot T6"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#138")
                .itemInputsUnsafe(
                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_5.copy(), 1),
                    setStackSize(MiscPlateList.Compressed_Lead_Oriharukon_Plate.copy(), 10),
                    setStackSize(BoltList.Tritanium_Bolt.copy(), 8))
                .fluidInputs(requiredFluid(MoltenList.Molten_Indalloy_140, 144))
                .itemOutputs(setStackSize(NewHorizonsCoreModList.Heavy_Duty_Alloy_Ingot_T6, 1))
                .eut(RECIPE_UV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Heavy Duty Alloy Ingot T7"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#139")
                .itemInputsUnsafe(
                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_6.copy(), 1),
                    setStackSize(MiscPlateList.Compressed_Mysterious_Crystal_Plate.copy(), 12),
                    setStackSize(BoltList.Neutronium_Bolt.copy(), 10))
                .fluidInputs(requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 2))
                .itemOutputs(setStackSize(NewHorizonsCoreModList.Heavy_Duty_Alloy_Ingot_T7, 1))
                .eut(RECIPE_UHV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Heavy Duty Alloy Ingot T8"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#140")
                .itemInputsUnsafe(
                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_7.copy(), 1),
                    setStackSize(MiscPlateList.Compressed_Black_Plutonium_Plate.copy(), 14),
                    setStackSize(BoltList.Black_Plutonium_Bolt.copy(), 12))
                .fluidInputs(requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 4))
                .itemOutputs(setStackSize(NewHorizonsCoreModList.Heavy_Duty_Alloy_Ingot_T8, 1))
                .eut(RECIPE_UEV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Lightweight Alloy Ingot"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#141")
                .itemInputsUnsafe(
                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_8.copy(), 1),
                    setStackSize(PlateList.Kevlar_Plate.copy(), 14),
                    setStackSize(ScrewList.Neutronium_Screw.copy(), 12))
                .fluidInputs(requiredFluid(MoltenList.Molten_Radox_Polymer, 144 * 4))
                .itemOutputs(setStackSize(NewHorizonsCoreModList.Lightweight_Alloy_Ingot, 1))
                .eut(RECIPE_UEV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Matter Manipulator
        {
            // "Matter Manipulator Power Core MKII"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#142")
                .itemInputsUnsafe(
                    setStackSize(CasingList.HSSS_Casing.copy(), 8),
                    setStackSize(BatteryList.Lapotronic_Energy_Orb_Cluster_Empty.copy(), 1),
                    setStackSize(CircuitList.High_Power_IC_Chip.copy(), 4),
                    setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 12),

                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 2),
                    setStackSize(ScrewList.HSSS_Screw.copy(), 16))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 8),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 16))
                .itemOutputs(setStackSize(MatterManipulatorList.Matter_Manipulator_Power_Core_MKII, 1))
                .eut(RECIPE_LuV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Matter Manipulator Computer Core MKII"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#143")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.HSSS_Frame_Box.copy(), 1),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 2),
                    setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 18),
                    setStackSize(CasingList.HSSS_Casing.copy(), 8),

                    setStackSize(ScrewList.HSSS_Screw.copy(), 16))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 16),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 32))
                .itemOutputs(setStackSize(MatterManipulatorList.Matter_Manipulator_Computer_Core_MKII, 1))
                .eut(RECIPE_LuV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Matter Manipulator Teleporter Core MKII"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#144")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Quantium_Frame_Box.copy(), 1),
                    setStackSize(GTItemList.Emitter_LuV.copy(), 2),
                    setStackSize(GTItemList.Field_Generator_LuV.copy(), 1),
                    setStackSize(GTItemList.Quantum_Star.copy(), 4),

                    setStackSize(GTItemList.Gravitation_Engine.copy(), 4),
                    setStackSize(CasingList.HSSS_Casing.copy(), 8),
                    setStackSize(ScrewList.HSSS_Screw.copy(), 16))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 16),
                    requiredFluid(MoltenList.Molten_Quantium, 144 * 16),
                    requiredFluid(MoltenList.Molten_Duranium, 144 * 8),
                    requiredFluid(FluidList.IC2_Coolant, 1000 * 32))
                .itemOutputs(setStackSize(MatterManipulatorList.Matter_Manipulator_Teleporter_Core_MKII, 1))
                .eut(RECIPE_LuV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Matter Manipulator Lens Assembly MKII"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#145")
                .itemInputsUnsafe(
                    setStackSize(GTItemList.Red_Zircon_Lens.copy(), 2),
                    setStackSize(RingList.HSSS_Ring.copy(), 4),
                    setStackSize(GTItemList.Field_Generator_LuV.copy(), 1),
                    setStackSize(GTItemList.Electric_Motor_LuV.copy(), 2),

                    setStackSize(GTItemList.Electric_Piston_LuV.copy(), 2))
                .fluidInputs(requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 4))
                .itemOutputs(setStackSize(MatterManipulatorList.Matter_Manipulator_Lens_Assembly_MKII.copy(), 1))
                .eut(RECIPE_LuV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Matter Manipulator Power Core MKIII"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#146")
                .itemInputsUnsafe(
                    setStackSize(CasingList.Naquadah_Alloy_Casing.copy(), 8),
                    setStackSize(BatteryList.Energy_Module_Empty.copy(), 1),
                    setStackSize(CircuitList.Ultra_High_Power_IC_Chip.copy(), 8),
                    setStackSize(WireList.Superconductor_ZPM_Wire_2x.copy(), 12),

                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 2),
                    setStackSize(ScrewList.Naquadah_Alloy_Screw.copy(), 16))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 16),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 32))
                .itemOutputs(setStackSize(MatterManipulatorList.Matter_Manipulator_Power_Core_MKIII, 1))
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Matter Manipulator Computer Core MKIII"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#147")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Naquadah_Alloy_Frame_Box.copy(), 1),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 2),
                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 30),
                    setStackSize(CasingList.Naquadah_Alloy_Casing.copy(), 8),
                    setStackSize(ScrewList.Naquadah_Alloy_Screw.copy(), 16))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 32),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 64))
                .itemOutputs(setStackSize(MatterManipulatorList.Matter_Manipulator_Computer_Core_MKIII, 1))
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Matter Manipulator Teleporter Core MKIII"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#148")
                .itemInputsUnsafe(
                    setStackSize(FrameBoxList.Mysterious_Crystal_Frame_Box.copy(), 1),
                    setStackSize(GTItemList.Emitter_ZPM.copy(), 2),
                    setStackSize(GTItemList.Field_Generator_ZPM.copy(), 1),
                    setStackSize(GTItemList.Gravi_Star.copy(), 4),

                    setStackSize(GTItemList.Stable_Baryon_Containment_Unit.copy(), 8),
                    setStackSize(GTItemList.Stable_Lepton_Containment_Unit.copy(), 8),
                    setStackSize(GTItemList.Gravitation_Engine.copy(), 16),
                    setStackSize(CasingList.Trinium_Casing.copy(), 8),

                    setStackSize(ScrewList.Trinium_Screw.copy(), 16))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 16),
                    requiredFluid(MoltenList.Molten_Mysterious_Crystal, 144 * 16),
                    requiredFluid(MoltenList.Molten_Tritanium, 144 * 16),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 32))
                .itemOutputs(setStackSize(MatterManipulatorList.Matter_Manipulator_Teleporter_Core_MKIII, 1))
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Matter Manipulator Lens Assembly MKIII"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#149")
                .itemInputsUnsafe(
                    setStackSize(GTItemList.Magneto_Resonatic_Lens.copy(), 2),
                    setStackSize(RingList.Naquadah_Alloy_Ring.copy(), 4),
                    setStackSize(GTItemList.Field_Generator_ZPM.copy(), 1),
                    setStackSize(GTItemList.Electric_Piston_ZPM.copy(), 2),

                    setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 2))
                .fluidInputs(requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 16))
                .itemOutputs(setStackSize(MatterManipulatorList.Matter_Manipulator_Lens_Assembly_MKIII.copy(), 1))
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Matter Manipulator Quantum Downlink"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#150")
                .itemInputsUnsafe(
                    setStackSize(Appliedenergistics2List.ME_Quantum_Ring.copy(), 8),
                    setStackSize(Appliedenergistics2List.ME_Quantum_Link_Chamber.copy(), 1),
                    setStackSize(Appliedenergistics2List.ME_Controller.copy(), 1),
                    setStackSize(Appliedenergistics2List.Dense_Energy_Cell.copy(), 1),

                    setStackSize(Appliedenergistics2List.ME_Storage_Component_4096k.copy(), 1),
                    setStackSize(AE2FluidCraftingList.ME_Dual_Interface.copy(), 1),
                    setStackSize(GTItemList.Conveyor_Module_ZPM.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 4))
                .fluidInputs(requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 32))
                .itemOutputs(setStackSize(MatterManipulatorList.Matter_Manipulator_Quantum_Downlink, 1))
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // Energy Tunnel Manipulator Upgrade
            // NEI: Assemblyline Process [gt.recipe.fakeAssemblylineProcess]
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#151")
                .itemInputsUnsafe(
                    setStackSize(MatterManipulatorList.Blank_Manipulator_Upgrade, 1),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),
                    setStackSize(Appliedenergistics2List.ME_Dense_Smart_Cable_Fluix.copy(), 16),
                    setStackSize(Appliedenergistics2List.P2P_Tunnel_GT_EU.copy(), 4),

                    setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 1),
                    setStackSize(PlateList.Chromatic_Glass_Plate.copy(), 8),
                    setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 4),
                    setStackSize(GTBlockList.Laser_Vacuum_Pipe.copy(), 64))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 64),
                    requiredFluid(MoltenList.Molten_Cosmic_Neutronium, 144 * 32),
                    requiredFluid(FluidList.Super_Coolant, 1000 * 64 * 4))
                .itemOutputs(setStackSize(MatterManipulatorList.Energy_Tunnel_Manipulator_Upgrade, 1))
                .eut(RECIPE_UEV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Mining Drone
        {
            // "Mining Drone MK-IV (EV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#152")
                .itemInputsUnsafe(
                    setStackSize(DrillTipList.Trinium_Drill_Tip.copy(), 8),
                    setStackSize(GTItemList.Robot_Arm_EV.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_EV.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.LuV, 4),

                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_3.copy(), 32),
                    setStackSize(GalacticraftList.Heavy_Rocket_Engine.copy(), 4),
                    setStackSize(GTItemList.Sensor_EV.copy(), 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 5),
                    requiredFluid(MoltenList.Molten_Iridium, 144 * 5),
                    requiredFluid(FluidList.Drilling_Fluid, 1000 * 16))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Mining_Drone_MKIV_EV, 1))
                .eut(RECIPE_EV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mining Drone MK-V (IV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#153")
                .itemInputsUnsafe(
                    setStackSize(DrillTipList.Naquadah_Alloy_Drill_Tip.copy(), 8),
                    setStackSize(GTItemList.Robot_Arm_IV.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_IV.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),

                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_4.copy(), 32),
                    setStackSize(GalacticraftList.Heavy_Rocket_Engine.copy(), 4),
                    setStackSize(GTItemList.Sensor_IV.copy(), 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 10),
                    requiredFluid(MoltenList.Molten_Iridium, 144 * 10),
                    requiredFluid(FluidList.Drilling_Fluid, 1000 * 32))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Mining_Drone_MKV_IV, 1))
                .eut(RECIPE_IV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mining Drone MK-VI (LuV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#154")
                .itemInputsUnsafe(
                    setStackSize(DrillTipList.Naquadria_Drill_Tip.copy(), 8),
                    setStackSize(GTItemList.Robot_Arm_LuV.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_LuV.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.ZPM, 4),

                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_5.copy(), 32),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_3.copy(), 4),
                    setStackSize(GTItemList.Sensor_LuV.copy(), 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 20),
                    requiredFluid(MoltenList.Molten_Osmiridium, 144 * 10),
                    requiredFluid(FluidList.Drilling_Fluid, 1000 * 64))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Mining_Drone_MKVI_LuV, 1))
                .eut(RECIPE_LuV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mining Drone MK-VII (ZPM)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#155")
                .itemInputsUnsafe(
                    setStackSize(DrillTipList.Neutronium_Drill_Tip.copy(), 8),
                    setStackSize(GTItemList.Robot_Arm_ZPM.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_ZPM.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UV, 4),

                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_6.copy(), 32),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_3.copy(), 4),
                    setStackSize(GTItemList.Sensor_ZPM.copy(), 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 20),
                    requiredFluid(MoltenList.Molten_Osmiridium, 144 * 10),
                    requiredFluid(FluidList.Drilling_Fluid, 1000 * 128))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Mining_Drone_MKVII_ZPM, 1))
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mining Drone MK-VIII (UV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#156")
                .itemInputsUnsafe(
                    setStackSize(DrillTipList.Cosmic_Neutronium_Drill_Tip.copy(), 8),
                    setStackSize(GTItemList.Robot_Arm_UV.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UV.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 4),

                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_7.copy(), 32),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4.copy(), 4),
                    setStackSize(GTItemList.Sensor_UV.copy(), 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Indalloy_140, 144 * 20),
                    requiredFluid(MoltenList.Molten_Naquadria, 144 * 10),
                    requiredFluid(FluidList.Drilling_Fluid, 1000 * 256))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Mining_Drone_MKVIII_UV, 1))
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mining Drone MK-IX (UHV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#157")
                .itemInputsUnsafe(
                    setStackSize(DrillTipList.Infinity_Drill_Tip.copy(), 8),
                    setStackSize(GTItemList.Robot_Arm_UHV.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 4),

                    setStackSize(MiscPlateList.Heavy_Duty_Plate_Tier_8.copy(), 32),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4.copy(), 4),
                    setStackSize(GTItemList.Sensor_UHV.copy(), 8))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 20),
                    requiredFluid(MoltenList.Molten_Neutronium, 144 * 10),
                    requiredFluid(FluidList.Drilling_Fluid, 1000 * 512))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Mining_Drone_MKIX_UHV, 1))
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mining Drone MK-X (UEV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#158")
                .itemInputsUnsafe(
                    setStackSize(DrillTipList.Cosmic_Neutronium_Drill_Tip.copy(), 8),
                    setStackSize(GTItemList.Robot_Arm_UEV.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UEV.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 4),

                    setStackSize(MiscPlateList.Lightweight_Plate.copy(), 32),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4.copy(), 8),
                    setStackSize(GTItemList.Sensor_UEV.copy(), 8))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 20),
                    requiredFluid(MoltenList.Molten_Quantium, 144 * 10),
                    requiredFluid(FluidList.Drilling_Fluid, 1000 * 512))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Mining_Drone_MKX_UEV, 1))
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mining Drone MK-XI (UIV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#159")
                .itemInputsUnsafe(
                    setStackSize(DrillTipList.Cosmic_Neutronium_Drill_Tip.copy(), 8),
                    setStackSize(GTItemList.Robot_Arm_UIV.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UIV.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 4),

                    setStackSize(MiscPlateList.Lightweight_Plate.copy(), 64),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4.copy(), 16),
                    setStackSize(GTItemList.Sensor_UIV.copy(), 8))
                .fluidInputs(
                    requiredFluid(FluidList.Mutated_Living_Solder, 144 * 40),
                    requiredFluid(MoltenList.Molten_Quantium, 144 * 20),
                    requiredFluid(FluidList.Drilling_Fluid, 1000 * 512))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Mining_Drone_MKXI_UIV, 1))
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mining Drone MK-XII (UMV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#160")
                .itemInputsUnsafe(
                    setStackSize(DrillTipList.SpaceTime_Drill_Tip.copy(), 8),
                    setStackSize(GTItemList.Robot_Arm_UMV.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UMV.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.UXV, 4),

                    setStackSize(MiscPlateList.Lightweight_Plate.copy(), 128),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4.copy(), 32),
                    setStackSize(GTItemList.Sensor_UMV.copy(), 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Hypogen, 144 * 4),
                    requiredFluid(MoltenList.Molten_Celestial_Tungsten, 144 * 4),
                    requiredFluid(FluidList.Drilling_Fluid, 1000 * 512))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Mining_Drone_MKXII_UMV, 1))
                .eut(RECIPE_UMV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Mining Drone MK-XIII (UXV)"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#161")
                .itemInputsUnsafe(
                    setStackSize(DrillTipList.Eternity_Drill_Tip.copy(), 8),
                    setStackSize(GTItemList.Robot_Arm_UXV.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UXV.copy(), 2),
                    getMaterialInput(OrePrefixes.circuit, Materials.MAX, 4),

                    setStackSize(MiscPlateList.Lightweight_Plate.copy(), 256),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4.copy(), 64),
                    setStackSize(GTItemList.Sensor_UXV.copy(), 8))
                .fluidInputs(
                    requiredFluid(FluidList.Spatially_Enlarged_Fluid, 144 * 4),
                    requiredFluid(MoltenList.Molten_Universium, 144 * 4),
                    requiredFluid(FluidList.Drilling_Fluid, 1000 * 512))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Mining_Drone_MKXIII_UXV, 1))
                .eut(RECIPE_UXV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // "Raw Deep Dark Portal Block"
        ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#162")
            .itemInputsUnsafe(
                setStackSize(ExtraUtilitieList.Octuple_Compressed_Cobblestone.copy(), 1),
                setStackSize(MachineList.Teleporter.copy(), 1),
                setStackSize(AvaritiaList.Infinity_Block.copy(), 4),
                getMaterialInput(OrePrefixes.circuit, Materials.UIV, 4),

                setStackSize(CircuitList.APIC_Wafer.copy(), 32),
                setStackSize(GTItemList.Robot_Arm_UIV.copy(), 4),
                setStackSize(GTItemList.Emitter_UIV.copy(), 4),
                setStackSize(GTItemList.Sensor_UIV.copy(), 4))
            .fluidInputs(
                requiredFluid(GasList.Oganesson, 1000 * 50),
                requiredFluid(MoltenList.Molten_Infinity, 144 * 512),
                requiredFluid(MoltenList.Molten_Cheese, 1000 * 232))
            .itemOutputs(setStackSize(BlockList.Raw_Deep_Dark_Portal_Block.copy(), 1))
            .eut(RECIPE_UMV)
            .duration(180 * SECONDS)
            .addTo(AssemblyLineNormalRecipe);

        // Schematic
        {
            // "Draconic Core Schematic"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#163")
                .itemInputsUnsafe(
                    setStackSize(DraconicEvolutionList.Draconic_Core.copy(), 1),
                    setStackSize(DensePlateList.Dense_Draconium_Plate.copy(), 1),
                    setStackSize(PlateList.Ichorium_Plate.copy(), 1),
                    getMaterialInput(OrePrefixes.circuit, Materials.UHV, 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Sunnarium, 144 * 100),
                    requiredFluid(MoltenList.Molten_Void_Metal, 144 * 200))
                .itemOutputs(setStackSize(KubaTechList.Draconic_Core_Schematic, 1))
                .eut(RECIPE_UHV)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Wyvern Core Schematic"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#164")
                .itemInputsUnsafe(
                    setStackSize(DraconicEvolutionList.Draconic_Core.copy(), 4),
                    setStackSize(DensePlateList.Dense_Draconium_Plate.copy(), 1),
                    setStackSize(PlateList.Neutronium_Plate.copy(), 1),
                    getMaterialInput(OrePrefixes.circuit, Materials.UEV, 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Neutronium, 144 * 100),
                    requiredFluid(MoltenList.Molten_Void_Metal, 144 * 400))
                .itemOutputs(setStackSize(KubaTechList.Wyvern_Core_Schematic, 1))
                .eut(RECIPE_UEV)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Awakened Core Schematic"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#165")
                .itemInputsUnsafe(
                    setStackSize(DraconicEvolutionList.Wyvern_Core.copy(), 4),
                    setStackSize(DensePlateList.Dense_Awakened_Draconium_Plate.copy(), 1),
                    setStackSize(PlateList.Infinity_Plate.copy(), 1),
                    getMaterialInput(OrePrefixes.circuit, Materials.UIV, 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Infinity, 144 * 100),
                    requiredFluid(MoltenList.Molten_Void_Metal, 144 * 800))
                .itemOutputs(setStackSize(KubaTechList.Awakened_Core_Schematic, 1))
                .eut(RECIPE_UIV)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Chaotic Core Schematic"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#166")
                .itemInputsUnsafe(
                    setStackSize(DraconicEvolutionList.Awakened_Core.copy(), 8),
                    setStackSize(DensePlateList.Dense_Awakened_Draconium_Plate.copy(), 4),
                    setStackSize(PlateList.SpaceTime_Plate.copy(), 1),
                    getMaterialInput(OrePrefixes.circuit, Materials.UMV, 1))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_SpaceTime, 144 * 100),
                    requiredFluid(MoltenList.Molten_Void_Metal, 144 * 1600))
                .itemOutputs(setStackSize(KubaTechList.Chaotic_Core_Schematic, 1))
                .eut(RECIPE_UMV)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Shuttle Schematic"
            ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#167")
                .itemInputsUnsafe(
                    setStackSize(OreList.Samarium_Ore_Stone.copy(), 64),
                    setStackSize(OreList.Tartarite_Ore_Stone.copy(), 64),
                    setStackSize(OreList.Cadmium_Ore_Stone.copy(), 64),
                    setStackSize(OreList.Caesium_Ore_Stone.copy(), 64),

                    setStackSize(OreList.Lanthanum_Ore_Stone.copy(), 64),
                    setStackSize(OreList.Cerium_Ore_Stone.copy(), 64),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64),
                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 64),

                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64),
                    setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64),
                    setStackSize(GTItemList.Electric_Pump_UHV.copy(), 8),

                    setStackSize(GTItemList.Conveyor_Module_UHV.copy(), 8),
                    setStackSize(GTItemList.Robot_Arm_UHV.copy(), 8),
                    setStackSize(GTItemList.Field_Generator_UHV.copy(), 8),
                    setStackSize(GTItemList.Sensor_UHV.copy(), 8))
                .fluidInputs(
                    requiredFluid(MoltenList.Molten_Abyssal_Alloy, 144 * 64),
                    requiredFluid(MoltenList.Molten_Octiron, 144 * 64),
                    requiredFluid(MoltenList.Molten_Astral_Titanium, 144 * 64))
                .itemOutputs(setStackSize(AmunRaList.Shuttle_Schematic, 1))
                .eut(RECIPE_UEV)
                .duration(360 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);
        }

        // Stargate Part
        {
            // 2.1.0.0
            {
                // "Nano Circuit of Split Origin"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#168")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(FrameBoxList.Tritanium_Frame_Box.copy(), 8),
                        setStackSize(CircuitList.Bioware_Mainframe.copy(), 2),
                        setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 32),
                        setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 32),

                        setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 32),
                        setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 32),
                        setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 64),
                        setStackSize(CircuitList.Nano_Power_IC_Chip.copy(), 64),

                        setStackSize(WireList.Draconium_Wire_1x.copy(), 64),
                        setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 128),
                        setStackSize(FoilList.Thin_Silicone_Rubber_Sheet.copy(), 64),
                        setStackSize(FoilList.Thin_Polybenzimidazole_PBI_Sheet.copy(), 64))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Soldering_Alloy, 144 * 26),
                        requiredFluid(MoltenList.Molten_Naquadria, 144 * 32),
                        requiredFluid(FluidList.IC2_Coolant, 1000 * 20))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Nano_Circuit_of_Split_Origin, 1))
                    .eut(RECIPE_UEV)
                    .duration(400 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Plate of Split Origin"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#169")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(SingularityList.Eternal_Singularity.copy(), 1),
                        setStackSize(GTItemList.Sensor_UV.copy(), 16),
                        setStackSize(AvaritiaList.Infinity_Block.copy(), 16),
                        setStackSize(AvaritiaList.Cosmic_Neutronium_Block.copy(), 16),

                        setStackSize(BlockList.Block_of_Naquadah_Alloy.copy(), 64 * 3),
                        setStackSize(NewHorizonsCoreModList.Nano_Circuit_of_Split_Origin.copy(), 16))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Neutronium, 144 * 64 * 4),
                        requiredFluid(MoltenList.Molten_Tritanium, 144 * 64 * 4),
                        requiredFluid(MoltenList.Molten_Superconductor_Base_ZPM, 144 * 64 * 4),
                        requiredFluid(PlasmaList.Silver_Plasma, 144 * 64 * 4))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Stargate_Plate_of_Split_Origin, 1))
                    .eut(RECIPE_UHV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Chevron of Split Origin"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#170")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(GTItemList.Electric_Piston_UV.copy(), 16),
                        setStackSize(GTItemList.Electric_Motor_UV.copy(), 64),
                        setStackSize(AvaritiaList.Cosmic_Neutronium_Block.copy(), 16),
                        setStackSize(BlockList.Block_of_Naquadah_Alloy.copy(), 64),

                        setStackSize(BlockList.Block_of_Nether_Star.copy(), 16),
                        setStackSize(DensePlateList.Dense_Ardite_Plate.copy(), 24),
                        setStackSize(GemList.Exquisite_Ruby.copy(), 64),
                        setStackSize(GemList.Exquisite_Jasper.copy(), 64),

                        setStackSize(NewHorizonsCoreModList.Nano_Circuit_of_Split_Origin.copy(), 32))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Neutronium, 144 * 64),
                        requiredFluid(MoltenList.Molten_Tritanium, 144 * 64),
                        requiredFluid(MoltenList.Molten_Superconductor_Base_ZPM, 144 * 64),
                        requiredFluid(PlasmaList.Silver_Plasma, 144 * 64))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Stargate_Chevron_of_Split_Origin, 1))
                    .eut(RECIPE_UHV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Frame Part of Split Origin"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#171")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(1),

                        setStackSize(LongRodList.Long_Infinity_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Naquadah_Alloy_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Cosmic_Neutronium_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Neutronium_Rod.copy(), 64),

                        setStackSize(LongRodList.Long_Osmiridium_Rod.copy(), 64))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Neutronium, 144 * 64 * 8),
                        requiredFluid(MoltenList.Molten_Tritanium, 144 * 64 * 8),
                        requiredFluid(FluidList.Wet_Concrete, 144 * 64 * 8))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Stargate_Frame_Part_of_Split_Origin, 1))
                    .eut(RECIPE_UHV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // 2.1.2.3qf
            {
                // "Pico Circuit of Polychrome Contest"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#172")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(CircuitList.Ultra_Bio_Mutated_Circuit_Board.copy(), 1),
                        setStackSize(NewHorizonsCoreModList.Pico_Wafer.copy(), 4),
                        setStackSize(NewHorizonsCoreModList.Nano_Circuit_of_Split_Origin.copy(), 2),
                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 48),

                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 48),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 48),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 48),
                        setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 64),

                        setStackSize(FoilList.Niobium_Titanium_Foil.copy(), 16),
                        setStackSize(BoltList.Osmium_Bolt.copy(), 32),
                        setStackSize(BoltList.Neutronium_Bolt.copy(), 16),
                        setStackSize(FineWireList.Fine_Lanthanum_Wire.copy(), 64))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Soldering_Alloy, 144 * 26),
                        requiredFluid(FluidList.UU_Matter, 1000 * 8),
                        requiredFluid(MoltenList.Molten_Osmium, 144 * 8))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Pico_Circuit_of_Polychrome_Contest, 1))
                    .eut(RECIPE_UEV)
                    .duration(500 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Quantum Circuit of Polychrome Contest"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#173")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 16),
                        setStackSize(NewHorizonsCoreModList.Pico_Circuit_of_Polychrome_Contest.copy(), 2),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 64),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),

                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 64),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 64),
                        setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 64),
                        setStackSize(FoilList.Niobium_Titanium_Foil.copy(), 64),

                        setStackSize(BoltList.Indium_Bolt.copy(), 64),
                        setStackSize(WireList.Bedrockium_Wire_1x.copy(), 8),
                        setStackSize(FineWireList.Fine_Lanthanum_Wire.copy(), 64))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Soldering_Alloy, 144 * 26),
                        requiredFluid(FluidList.UU_Matter, 1000 * 24),
                        requiredFluid(MoltenList.Molten_Osmium, 144 * 16))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Quantum_Circuit_of_Polychrome_Contest, 1))
                    .eut(RECIPE_UIV)
                    .duration(1000 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Plate of Polychrome Contest"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#174")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(SingularityList.Eternal_Singularity.copy(), 1),
                        setStackSize(GTItemList.Sensor_UEV.copy(), 16),
                        setStackSize(AvaritiaList.Infinity_Block.copy(), 16),
                        setStackSize(AvaritiaList.Cosmic_Neutronium_Block.copy(), 16),

                        setStackSize(BlockList.Block_of_Naquadah_Alloy.copy(), 64 * 3),
                        setStackSize(NewHorizonsCoreModList.Quantum_Circuit_of_Polychrome_Contest.copy(), 16))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Neutronium, 144 * 64 * 4),
                        requiredFluid(MoltenList.Molten_Tritanium, 144 * 64 * 4),
                        requiredFluid(MoltenList.Molten_Superconductor_Base_UHV, 144 * 64 * 4),
                        requiredFluid(PlasmaList.Silver_Plasma, 144 * 64 * 4))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Stargate_Plate_of_Polychrome_Contest, 1))
                    .eut(RECIPE_UIV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Chevron of Polychrome Contest"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#175")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(GTItemList.Electric_Piston_UEV.copy(), 16),
                        setStackSize(GTItemList.Electric_Motor_UEV.copy(), 64),
                        setStackSize(AvaritiaList.Infinity_Block.copy(), 16),
                        setStackSize(BlockList.Block_of_Naquadah_Alloy.copy(), 64),

                        setStackSize(BlockList.Block_of_Nether_Star.copy(), 16),
                        setStackSize(DensePlateList.Dense_Ardite_Plate.copy(), 24),
                        setStackSize(GemList.Exquisite_Ruby.copy(), 64),
                        setStackSize(GemList.Exquisite_Jasper.copy(), 64),

                        setStackSize(NewHorizonsCoreModList.Quantum_Circuit_of_Polychrome_Contest.copy(), 32))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Neutronium, 144 * 64),
                        requiredFluid(MoltenList.Molten_Tritanium, 144 * 64),
                        requiredFluid(MoltenList.Molten_Superconductor_Base_UHV, 144 * 64),
                        requiredFluid(PlasmaList.Silver_Plasma, 144 * 64))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Stargate_Chevron_of_Polychrome_Contest, 1))
                    .eut(RECIPE_UIV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Frame Part of Polychrome Contest"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#176")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(2),

                        setStackSize(LongRodList.Long_Infinity_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Naquadah_Alloy_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Cosmic_Neutronium_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Neutronium_Rod.copy(), 64),

                        setStackSize(LongRodList.Long_Osmiridium_Rod.copy(), 64))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Neutronium, 144 * 64 * 8),
                        requiredFluid(MoltenList.Molten_Tritanium, 144 * 64 * 8),
                        requiredFluid(FluidList.Wet_Concrete, 144 * 64 * 8))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Stargate_Frame_Part_of_Polychrome_Contest, 1))
                    .eut(RECIPE_UIV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // 2.2.3
            {
                // "Pico Circuit of Dimensional Duplicity"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#177")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(CircuitList.Ultra_Bio_Mutated_Circuit_Board.copy(), 1),
                        setStackSize(NewHorizonsCoreModList.Pico_Wafer.copy(), 4),
                        setStackSize(NewHorizonsCoreModList.Nano_Circuit.copy(), 2),
                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 48),

                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 48),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 48),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 48),
                        setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 64),

                        setStackSize(FoilList.Niobium_Titanium_Foil.copy(), 16),
                        setStackSize(BoltList.Osmium_Bolt.copy(), 32),
                        setStackSize(BoltList.Neutronium_Bolt.copy(), 16),
                        setStackSize(FineWireList.Fine_Lanthanum_Wire.copy(), 64))
                    .fluidInputs(
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 26),
                        requiredFluid(FluidList.UU_Matter, 1000 * 8),
                        requiredFluid(MoltenList.Molten_Osmium, 144 * 8))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Pico_Circuit_of_Dimensional_Duplicity, 1))
                    .eut(RECIPE_UMV)
                    .duration(500 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Quantum Circuit of Dimensional Duplicity"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#178")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 16),
                        setStackSize(NewHorizonsCoreModList.Pico_Circuit_of_Dimensional_Duplicity.copy(), 2),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 64),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),

                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 64),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 64),
                        setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 64),
                        setStackSize(FoilList.Niobium_Titanium_Foil.copy(), 64),

                        setStackSize(BoltList.Indium_Bolt.copy(), 64),
                        setStackSize(WireList.SpaceTime_Wire_1x.copy(), 8),
                        setStackSize(FineWireList.Fine_Lanthanum_Wire.copy(), 64))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Soldering_Alloy, 144 * 26),
                        requiredFluid(FluidList.UU_Matter, 1000 * 24),
                        requiredFluid(MoltenList.Molten_Osmium, 144 * 16))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Quantum_Circuit_of_Dimensional_Duplicity, 1))
                    .eut(RECIPE_UXV)
                    .duration(1000 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Plate of Dimensional Duplicity"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#179")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(MultiMachineCasingList.Dimensional_Bridge.copy(), 64),
                        setStackSize(AvaritiaList.Infinity_Block.copy(), 64 * 3),
                        setStackSize(BlockList.Block_of_SpaceTime.copy(), 16),
                        setStackSize(NewHorizonsCoreModList.Quantum_Circuit_of_Dimensional_Duplicity.copy(), 16),

                        setStackSize(DensePlateList.Dense_SpaceTime_Plate.copy(), 16),
                        setStackSize(DensePlateList.Dense_Infinity_Plate.copy(), 16),
                        setStackSize(GTItemList.Sensor_UMV.copy(), 16),
                        setStackSize(GTItemList.Emitter_UMV.copy(), 16),

                        setStackSize(SingularityList.Eternal_Singularity.copy(), 16))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Neutronium, 1000 * 64 * 64 * 8),
                        requiredFluid(MoltenList.Molten_SpaceTime, 144 * 64 * 16),
                        requiredFluid(MoltenList.Molten_Superconductor_Base_UMV, 144 * 64 * 16),
                        requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 144 * 64 * 16))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Stargate_Plate_of_Dimensional_Duplicity, 1))
                    .eut(RECIPE_UXV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Chevron of Dimensional Duplicity"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#180")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(AvaritiaList.Infinity_Block.copy(), 64),
                        setStackSize(BlockList.Block_of_Naquadah_Alloy.copy(), 64),
                        setStackSize(MultiMachineCasingList.Dimensional_Bridge.copy(), 64 * 2),
                        setStackSize(FrameBoxList.SpaceTime_Frame_Box.copy(), 16),

                        setStackSize(FrameBoxList.Infinity_Frame_Box.copy(), 16),
                        setStackSize(GemList.Exquisite_Ruby.copy(), 16),
                        setStackSize(GemList.Exquisite_Jasper.copy(), 16),
                        setStackSize(GemList.Exquisite_Opal.copy(), 16),

                        setStackSize(GemList.Exquisite_Sapphire.copy(), 16),
                        setStackSize(DensePlateList.Dense_Osmiridium_Plate.copy(), 16),
                        setStackSize(GTItemList.Electric_Motor_UMV.copy(), 64),
                        setStackSize(GTItemList.Electric_Piston_UMV.copy(), 64),

                        setStackSize(GTItemList.Field_Generator_UMV.copy(), 16),
                        setStackSize(NewHorizonsCoreModList.Quantum_Circuit_of_Dimensional_Duplicity.copy(), 32))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Neutronium, 1000 * 64 * 64 * 8),
                        requiredFluid(MoltenList.Molten_SpaceTime, 144 * 64 * 16),
                        requiredFluid(MoltenList.Molten_Superconductor_Base_UMV, 144 * 64 * 16),
                        requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 144 * 64 * 16))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Stargate_Chevron_of_Dimensional_Duplicity, 1))
                    .eut(RECIPE_UXV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Frame Part of Dimensional Duplicity"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#181")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(3),

                        setStackSize(LongRodList.Long_Infinity_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Naquadah_Alloy_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Cosmic_Neutronium_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Neutronium_Rod.copy(), 64),

                        setStackSize(LongRodList.Long_Osmiridium_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Californium_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Quantum_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Hypogen_Rod.copy(), 64),

                        setStackSize(LongRodList.Long_Celestial_Tungsten_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Tairitsu_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Astral_Titanium_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Superconductor_Base_UMV_Rod.copy(), 64),

                        setStackSize(LongRodList.Long_Sunnarium_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Abyssal_Alloy_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Transcendent_Metal_Rod.copy(), 64))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Neutronium, 1000 * 64 * 64 * 8),
                        requiredFluid(MoltenList.Molten_SpaceTime, 144 * 64 * 17),
                        requiredFluid(MoltenList.Molten_Superconductor_Base_UMV, 144 * 64 * 16),
                        requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 144 * 64 * 16))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Stargate_Frame_Part_of_Dimensional_Duplicity, 1))
                    .eut(RECIPE_UXV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // 2.3.0
            {
                // "Stargate Plate of Harmonic Breakthrough"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#182")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(4),

                        setStackSize(MultiMachineCasingList.Dimensional_Bridge.copy(), 64),
                        setStackSize(TecTechList.Gallifreyan_Stabilisation_Field_Generator.copy(), 64),
                        setStackSize(BlockList.Block_of_Shirabon.copy(), 64 * 2),
                        setStackSize(BlockList.Block_of_SpaceTime.copy(), 64),

                        setStackSize(NewHorizonsCoreModList.Quantum_Circuit_of_Heavenly_Fire.copy(), 16),
                        setStackSize(DensePlateList.Dense_SpaceTime_Plate.copy(), 8),
                        setStackSize(DensePlateList.Dense_Universium_Plate.copy(), 8),
                        setStackSize(DensePlateList.Dense_Infinity_Plate.copy(), 8),

                        setStackSize(DensePlateList.Dense_Shirabon_Plate.copy(), 8),
                        setStackSize(GTItemList.Sensor_UXV.copy(), 16),
                        setStackSize(GTItemList.Emitter_UXV.copy(), 16),
                        setStackSize(SingularityList.Eternal_Singularity.copy(), 16),

                        setStackSize(GTItemList.Universium_Nanites.copy(), 16),
                        setStackSize(GTItemList.Black_Dwarf_Matter_Nanites.copy(), 16),
                        setStackSize(GTItemList.White_Dwarf_Matter_Nanites.copy(), 16))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Neutronium, 1000 * 64 * 64 * 8),
                        requiredFluid(MoltenList.Molten_SpaceTime, 144 * 64 * 16),
                        requiredFluid(MoltenList.Molten_Superconductor_Base_UMV, 144 * 64 * 16),
                        requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 144 * 64 * 16))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Stargate_Plate_of_Harmonic_Breakthrough, 1))
                    .eut(RECIPE_UMV)
                    .duration(125_000 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Chevron of Harmonic Breakthrough"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#183")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(4),

                        setStackSize(BlockList.Block_of_Transcendent_Metal.copy(), 64),
                        setStackSize(BlockList.Block_of_Shirabon.copy(), 64),
                        setStackSize(TecTechList.Reinforced_Spatial_Structure_Casing.copy(), 64 * 2),
                        setStackSize(FrameBoxList.SpaceTime_Frame_Box.copy(), 16),

                        setStackSize(FrameBoxList.Magnetohydrodynamically_Constrained_Star_Matter_Frame_Box.copy(), 16),
                        setStackSize(GemList.Exquisite_Ruby.copy(), 16),
                        setStackSize(GemList.Exquisite_Jasper.copy(), 16),
                        setStackSize(GemList.Exquisite_Opal.copy(), 16),

                        setStackSize(GemList.Exquisite_Sapphire.copy(), 16),
                        setStackSize(
                            DensePlateList.Dense_Magnetohydrodynamically_Constrained_Star_Matter_Plate.copy(),
                            8),
                        setStackSize(DensePlateList.Dense_Shirabon_Plate.copy(), 8),
                        setStackSize(GTItemList.Electric_Motor_UXV.copy(), 64),

                        setStackSize(GTItemList.Electric_Piston_UXV.copy(), 64),
                        setStackSize(GTItemList.Field_Generator_UXV.copy(), 16),
                        setStackSize(NewHorizonsCoreModList.Quantum_Circuit_of_Heavenly_Fire.copy(), 32))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Neutronium, 1000 * 64 * 64 * 8),
                        requiredFluid(MoltenList.Molten_SpaceTime, 144 * 64 * 16),
                        requiredFluid(MoltenList.Molten_Magnetohydrodynamically_Constrained_Star_Matter, 144 * 64 * 4),
                        requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 144 * 64 * 16))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Stargate_Chevron_of_Harmonic_Breakthrough, 1))
                    .eut(RECIPE_UMV)
                    .duration(125_000 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Frame Part of Harmonic Breakthrough"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#184")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(4),

                        setStackSize(LongRodList.Long_Infinity_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Magnetohydrodynamically_Constrained_Star_Matter_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Neutronium_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Osmiridium_Rod.copy(), 64),

                        setStackSize(LongRodList.Long_Shirabon_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Californium_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Quantum_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Hypogen_Rod.copy(), 64),

                        setStackSize(LongRodList.Long_Celestial_Tungsten_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Tairitsu_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Astral_Titanium_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Superconductor_Base_UMV_Rod.copy(), 64),

                        setStackSize(LongRodList.Long_Universium_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Abyssal_Alloy_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Transcendent_Metal_Rod.copy(), 64))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Neutronium, 1000 * 64 * 64 * 8),
                        requiredFluid(MoltenList.Molten_SpaceTime, 144 * 64 * 17),
                        requiredFluid(MoltenList.Molten_Universium, 144 * 64 * 16),
                        requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst, 144 * 64 * 16))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Stargate_Frame_Part_of_Harmonic_Breakthrough, 1))
                    .eut(RECIPE_UMV)
                    .duration(125_000 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }

            // 2.7.0
            {
                // "Pico Circuit of Heavenly Fire"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#185")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(CircuitList.Optical_Circuit_Board.copy(), 1),
                        setStackSize(NewHorizonsCoreModList.Pico_Wafer.copy(), 4),
                        getMaterialInput(OrePrefixes.circuit, Materials.UIV, 2),
                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 48),

                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 48),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 48),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 48),
                        setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 64),

                        setStackSize(FoilList.Thin_Radox_Polymer_Sheet.copy(), 16),
                        setStackSize(BoltList.Transcendent_Metal_Bolt.copy(), 32),
                        setStackSize(BoltList.Neutronium_Bolt.copy(), 16),
                        setStackSize(FineWireList.Fine_Lanthanum_Wire.copy(), 64))
                    .fluidInputs(
                        requiredFluid(FluidList.Mutated_Living_Solder, 144 * 26),
                        requiredFluid(FluidList.UU_Matter, 1000 * 8),
                        requiredFluid(MoltenList.Molten_Osmium, 144 * 8))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Pico_Circuit_of_Heavenly_Fire, 1))
                    .eut(RECIPE_UMV)
                    .duration(500 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Quantum Circuit of Heavenly Fire"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#186")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(FrameBoxList.Neutronium_Frame_Box.copy(), 16),
                        setStackSize(NewHorizonsCoreModList.Pico_Circuit_of_Heavenly_Fire.copy(), 2),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 64),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),

                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 64),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 64),
                        setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 64),
                        setStackSize(FoilList.Shirabon_Foil.copy(), 64),

                        setStackSize(BoltList.Indium_Bolt.copy(), 64),
                        setStackSize(WireList.SpaceTime_Wire_1x.copy(), 8),
                        setStackSize(FineWireList.Fine_Lanthanum_Wire.copy(), 16))
                    .fluidInputs(
                        requiredFluid(MoltenList.Molten_Soldering_Alloy, 144 * 26),
                        requiredFluid(FluidList.UU_Matter, 1000 * 24),
                        requiredFluid(MoltenList.Molten_Osmium, 144 * 16))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Quantum_Circuit_of_Heavenly_Fire, 1))
                    .eut(RECIPE_UMV)
                    .duration(1000 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Plate of Heavenly Fire"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#187")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(TecTechList.Transcendentally_Amplified_Magnetic_Confinement_Casing.copy(), 64),
                        setStackSize(TecTechList.Gallifreyan_Stabilisation_Field_Generator.copy(), 64),
                        setStackSize(TecTechList.Harmonic_Phonon_Transmission_Conduit.copy(), 32),
                        setStackSize(SuperdensePlateList.Superdense_Magmatter_Plate.copy(), 17),

                        setStackSize(SuperdensePlateList.Superdense_Universium_Plate.copy(), 8),
                        setStackSize(SuperdensePlateList.Superdense_Eternity_Plate.copy(), 8),
                        setStackSize(SuperdensePlateList.Superdense_SpaceTime_Plate.copy(), 8),
                        setStackSize(NewHorizonsCoreModList.Quantum_Circuit_of_Heavenly_Fire.copy(), 16),

                        setStackSize(GTItemList.Sensor_UXV.copy(), 16),
                        setStackSize(GTItemList.Emitter_UXV.copy(), 16),
                        setStackSize(SingularityList.Chronic_Singularity.copy(), 64),
                        setStackSize(GTItemList.Universium_Nanites.copy(), 16),

                        setStackSize(GTItemList.Black_Dwarf_Matter_Nanites.copy(), 16),
                        setStackSize(GTItemList.White_Dwarf_Matter_Nanites.copy(), 16),
                        setStackSize(GTItemList.Six_Phased_Copper_Nanites.copy(), 16))
                    .fluidInputs(
                        requiredFluid(PlasmaList.Degenerate_Quark_Gluon_Plasma, 1000 * 64 * 16),
                        requiredFluid(FluidList.Lossless_Phonon_Transfer_Medium, 1000 * 64 * 4),
                        requiredFluid(MoltenList.Molten_Superconductor_Base_UMV, 144 * 64 * 64),
                        requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Stellar_Catalyst, 1000 * 64 * 8))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Stargate_Plate_of_Heavenly_Fire, 1))
                    .eut(RECIPE_UXV)
                    .duration(125_000 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Chevron of Heavenly Fire"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#188")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(TecTechList.Reinforced_Spatial_Structure_Casing.copy(), 64),
                        setStackSize(TecTechList.Reinforced_Temporal_Structure_Casing.copy(), 64),
                        setStackSize(TecTechList.Spatially_Transcendent_Gravitational_Lens_Block.copy(), 64),
                        setStackSize(
                            SuperdensePlateList.Superdense_Magnetohydrodynamically_Constrained_Star_Matter_Plate,
                            8),

                        setStackSize(FrameBoxList.Magnetohydrodynamically_Constrained_Star_Matter_Frame_Box.copy(), 16),
                        setStackSize(GemList.Exquisite_Ruby.copy(), 64),
                        setStackSize(GemList.Exquisite_Jasper.copy(), 64),
                        setStackSize(GemList.Exquisite_Opal.copy(), 64),

                        setStackSize(GemList.Exquisite_Sapphire.copy(), 64),
                        setStackSize(DensePlateList.Dense_Osmiridium_Plate.copy(), 16),
                        setStackSize(GTItemList.Electric_Motor_UXV.copy(), 64),
                        setStackSize(GTItemList.Electric_Piston_UXV.copy(), 64),

                        setStackSize(GTItemList.Field_Generator_UXV.copy(), 16),
                        setStackSize(NewHorizonsCoreModList.Quantum_Circuit_of_Heavenly_Fire.copy(), 32))
                    .fluidInputs(
                        requiredFluid(PlasmaList.Degenerate_Quark_Gluon_Plasma, 1000 * 64 * 16),
                        requiredFluid(FluidList.Lossless_Phonon_Transfer_Medium, 1000 * 64 * 4),
                        requiredFluid(MoltenList.Molten_Magmatter, 144 * 64 * 146),
                        requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Stellar_Catalyst, 1000 * 64 * 8))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Stargate_Chevron_of_Heavenly_Fire, 1))
                    .eut(RECIPE_UXV)
                    .duration(125_000 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);

                // "Stargate Frame Part of Heavenly Fire"
                ChaosAssemblyRecipeBuilder.builder("ChaosAssemblyLine_ItemRecipe_Normal#189")
                    .itemInputsUnsafe(
                        GTUtility.getIntegratedCircuit(5),

                        setStackSize(LongRodList.Long_Infinity_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Mellion_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Eternity_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Creon_Rod.copy(), 64),

                        setStackSize(LongRodList.Long_SpaceTime_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Superconductor_Base_UMV_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Shirabon_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Hypogen_Rod.copy(), 64),

                        setStackSize(LongRodList.Long_Six_Phased_Copper_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Magnetohydrodynamically_Constrained_Star_Matter_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Proto_Halkonite_Steel_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_White_Dwarf_Matter_Rod.copy(), 64),

                        setStackSize(LongRodList.Long_Magmatter_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Black_Dwarf_Matter_Rod.copy(), 64),
                        setStackSize(LongRodList.Long_Transcendent_Metal_Rod.copy(), 64))
                    .fluidInputs(
                        requiredFluid(PlasmaList.Degenerate_Quark_Gluon_Plasma, 1000 * 64 * 16),
                        requiredFluid(FluidList.Lossless_Phonon_Transfer_Medium, 1000 * 64 * 4),
                        requiredFluid(MoltenList.Molten_Universium, 144 * 64 * 17),
                        requiredFluid(FluidList.Excited_Dimensionally_Transcendent_Stellar_Catalyst, 1000 * 64 * 8))
                    .itemOutputs(setStackSize(NewHorizonsCoreModList.Stargate_Frame_Part_of_Heavenly_Fire, 1))
                    .eut(RECIPE_UXV)
                    .duration(125_000 * SECONDS)
                    .addTo(AssemblyLineNormalRecipe);
            }
        }
    }
}
