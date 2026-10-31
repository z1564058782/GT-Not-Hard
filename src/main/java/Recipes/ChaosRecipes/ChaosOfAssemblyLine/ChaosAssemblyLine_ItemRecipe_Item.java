package Recipes.ChaosRecipes.ChaosOfAssemblyLine;

import static Recipes.ChaosRecipes.ChaosRecipeMap.AssemblyLineItemRecipe;
import static Recipes.ChaosRecipes.ChaosRecipeMap.AssemblyLineNormalRecipe;
import static gregtech.api.enums.TierEU.RECIPE_EV;
import static gregtech.api.enums.TierEU.RECIPE_HV;
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
import EnumList.EnumItemList.EnumGTList.CircuitList;
import EnumList.EnumItemList.EnumGTList.GTBlockList;
import EnumList.EnumItemList.EnumGTList.GTItemList;
import EnumList.EnumItemList.EnumGTList.GTPPList;
import EnumList.EnumItemList.EnumGTList.HatchList;
import EnumList.EnumItemList.EnumGTList.MachineList;
import EnumList.EnumItemList.EnumGTList.MultiMachineCasingList;
import EnumList.EnumItemList.EnumGTList.MultiMachineControllerList;
import EnumList.EnumItemList.EnumGTList.WireList;
import EnumList.EnumItemList.EnumMaterialList.BlockList;
import EnumList.EnumItemList.EnumMaterialList.FoilList;
import EnumList.EnumItemList.EnumMiscList.SingularityList;
import EnumList.EnumItemList.EnumModList.AE2FluidCraftingList;
import EnumList.EnumItemList.EnumModList.AmunRaList;
import EnumList.EnumItemList.EnumModList.Appliedenergistics2List;
import EnumList.EnumItemList.EnumModList.DraconicEvolutionList;
import EnumList.EnumItemList.EnumModList.GTNHIntergalacticList;
import EnumList.EnumItemList.EnumModList.GalacticraftList;
import EnumList.EnumItemList.EnumModList.GoodGeneratorList;
import EnumList.EnumItemList.EnumModList.KubaTechList;
import EnumList.EnumItemList.EnumModList.MatterManipulatorList;
import EnumList.EnumItemList.EnumModList.MinecraftList;
import EnumList.EnumItemList.EnumModList.NewHorizonsCoreModList;
import EnumList.EnumItemList.EnumModList.OpenComputersList;
import EnumList.EnumItemList.EnumModList.TecTechList;
import EnumList.EnumItemList.EnumOreProductList.DustList;
import EnumList.EnumItemList.EnumOreProductList.GemList;
import EnumList.EnumItemList.EnumOreProductList.IngotList;
import EnumList.EnumItemList.EnumOreProductList.OreList;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GTOreDictUnificator;
import gregtech.api.util.GTUtility;

public class ChaosAssemblyLine_ItemRecipe_Item {

    public static void addChaosAssemblyLine_ItemRecipe_Item() {
        // "Advanced Radiation Proof Plate"
        GTValues.RA.stdBuilder()
            .itemInputs(
                GTUtility.getIntegratedCircuit(0),
                setStackSize(GoodGeneratorList.Advanced_Radiation_Proof_Plate.copy(), 0),

                setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 4),
                setStackSize(IngotList.Indalloy_140_Ingot.copy(), 8),
                setStackSize(IngotList.Iridium_Ingot.copy(), 64 * 2 + 16),
                setStackSize(IngotList.Lead_Ingot.copy(), 17),
                setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 20),

                setStackSize(IngotList.Osmiridium_Ingot.copy(), 4),
                setStackSize(IngotList.Trinium_Ingot.copy(), 4),
                setStackSize(IngotList.Tungstencarbide_Ingot.copy(), 1),
                setStackSize(IngotList.Vibrant_Alloy_Ingot.copy(), 4))
            .fluidInputs(setStackSize(FluidList.Prismatic_Naquadah_Composite_Slurry.copy(), 1000 * 2))
            .itemOutputs(GoodGeneratorList.Advanced_Radiation_Proof_Plate)
            .eut(RECIPE_ZPM)
            .duration(50 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // "Carbon Nanites"
        GTValues.RA.stdBuilder()
            .itemInputs(
                GTUtility.getIntegratedCircuit(0),
                setStackSize(GTItemList.Carbon_Nanites, 0),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 48),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 64),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 64 * 2),

                setStackSize(CircuitList.Stemcells.copy(), 32),

                setStackSize(IngotList.Americium_Ingot.copy(), 64 * 36),
                setStackSize(IngotList.Carbon_Ingot.copy(), 64),
                setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 13 + 32),
                setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 + 32),
                setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 8 + 16),

                setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 11 + 16),
                setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 14 + 16))
            .fluidInputs(
                setStackSize(FluidList.Lubricant.copy(), 1000 * (64 * 2 + 32)),
                setStackSize(FluidList.UU_Matter.copy(), 1000 * 10))
            .itemOutputs(GTItemList.Carbon_Nanites)
            .eut(RECIPE_UV)
            .duration(50 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // Charge Pack
        {
            // "Containment Unit I"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTPPList.Containment_Unit_I, 0),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 64),
                    setStackSize(IngotList.Hastelloy_N_Ingot.copy(), 16),
                    setStackSize(IngotList.Inconel_625_Ingot.copy(), 32),
                    setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 16),
                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 64 * 4),

                    setStackSize(IngotList.Zeron_100_Ingot.copy(), 8))
                .itemOutputs(GTPPList.Containment_Unit_I)
                .eut(RECIPE_LuV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Proton Cell Empty"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GTPPList.Proton_Cell_Empty, 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),

                    setStackSize(GTItemList.Stable_Baryon_Containment_Unit.copy(), 16),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 64),
                    setStackSize(IngotList.Energy_Crystal_Ingot.copy(), 16),
                    setStackSize(IngotList.Hastelloy_N_Ingot.copy(), 48),
                    setStackSize(IngotList.Inconel_625_Ingot.copy(), 33),
                    setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 32),

                    setStackSize(IngotList.Trinium_Naquadah_Carbonite_Ingot.copy(), 1),
                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Zeron_100_Ingot.copy(), 40))
                .itemOutputs(GTPPList.Proton_Cell_Empty)
                .eut(RECIPE_LuV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Proton Cell"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    GTUtility.getIntegratedCircuit(2),
                    setStackSize(GTPPList.Proton_Cell_Empty, 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),

                    setStackSize(GTItemList.Stable_Baryon_Containment_Unit.copy(), 16),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 64),
                    setStackSize(IngotList.Energy_Crystal_Ingot.copy(), 16),
                    setStackSize(IngotList.Hastelloy_N_Ingot.copy(), 48),
                    setStackSize(IngotList.Inconel_625_Ingot.copy(), 33),
                    setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 32),

                    setStackSize(IngotList.Trinium_Naquadah_Carbonite_Ingot.copy(), 1),
                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Zeron_100_Ingot.copy(), 40))
                .itemOutputs(GTPPList.Proton_Cell)
                .eut(RECIPE_LuV)
                .duration(240 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Charge Pack [LuV] Empty"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GTPPList.Charge_Pack_LuV_Empty, 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 12),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 8),

                    setStackSize(GemList.Nether_Star.copy(), 1),

                    setStackSize(GTItemList.Stable_Baryon_Containment_Unit.copy(), 32),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 64 * 3),
                    setStackSize(IngotList.Arcanite_Ingot.copy(), 16),
                    setStackSize(IngotList.Energy_Crystal_Ingot.copy(), 48),
                    setStackSize(IngotList.Hastelloy_N_Ingot.copy(), 64 + 36),
                    setStackSize(IngotList.HSSS_Ingot.copy(), 4),

                    setStackSize(IngotList.Inconel_625_Ingot.copy(), 64 + 18),
                    setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 64),
                    setStackSize(IngotList.Nichrome_Ingot.copy(), 64 * 3),
                    setStackSize(IngotList.Trinium_Naquadah_Carbonite_Ingot.copy(), 2),
                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 64 * 16),

                    setStackSize(IngotList.Zeron_100_Ingot.copy(), 64 + 42))
                .fluidInputs(setStackSize(GasList.Radon.copy(), 1000 + 250))
                .itemOutputs(GTPPList.Charge_Pack_LuV_Empty)
                .eut(RECIPE_LuV)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Charge Pack [LuV]"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),
                    setStackSize(GTPPList.Charge_Pack_LuV_Empty, 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 12),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 8),

                    setStackSize(GemList.Nether_Star.copy(), 1),

                    setStackSize(GTItemList.Stable_Baryon_Containment_Unit.copy(), 32),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 64 * 3),
                    setStackSize(IngotList.Arcanite_Ingot.copy(), 16),
                    setStackSize(IngotList.Energy_Crystal_Ingot.copy(), 48),
                    setStackSize(IngotList.Hastelloy_N_Ingot.copy(), 64 + 36),
                    setStackSize(IngotList.HSSS_Ingot.copy(), 4),

                    setStackSize(IngotList.Inconel_625_Ingot.copy(), 64 + 18),
                    setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 64),
                    setStackSize(IngotList.Nichrome_Ingot.copy(), 64 * 3),
                    setStackSize(IngotList.Trinium_Naquadah_Carbonite_Ingot.copy(), 2),
                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 64 * 16),

                    setStackSize(IngotList.Zeron_100_Ingot.copy(), 64 + 42))
                .fluidInputs(setStackSize(GasList.Radon.copy(), 1000 + 250))
                .itemOutputs(GTPPList.Charge_Pack_LuV)
                .eut(RECIPE_LuV)
                .duration(360 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Containment Unit II"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTPPList.Containment_Unit_II, 0),

                    setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 16),
                    setStackSize(IngotList.Energy_Crystal_Ingot.copy(), 16),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 8),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 64),

                    setStackSize(IngotList.Zeron_100_Ingot.copy(), 32))
                .itemOutputs(GTPPList.Containment_Unit_II)
                .eut(RECIPE_ZPM)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Electron Cell Empty"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GTPPList.Electron_Cell_Empty, 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 8),

                    setStackSize(GTItemList.Stable_Lepton_Containment_Unit.copy(), 16),

                    setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 1),
                    setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 32),
                    setStackSize(IngotList.Energy_Crystal_Ingot.copy(), 48),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 40),

                    setStackSize(IngotList.Platinum_Ingot.copy(), 64),
                    setStackSize(IngotList.Trinium_Naquadah_Carbonite_Ingot.copy(), 16),
                    setStackSize(IngotList.Zeron_100_Ingot.copy(), 34))
                .itemOutputs(GTPPList.Electron_Cell_Empty)
                .eut(RECIPE_ZPM)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Electron Cell"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),
                    setStackSize(GTPPList.Electron_Cell_Empty, 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 8),

                    setStackSize(GTItemList.Stable_Lepton_Containment_Unit.copy(), 16),

                    setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 1),
                    setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 32),
                    setStackSize(IngotList.Energy_Crystal_Ingot.copy(), 48),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 40),

                    setStackSize(IngotList.Platinum_Ingot.copy(), 64),
                    setStackSize(IngotList.Trinium_Naquadah_Carbonite_Ingot.copy(), 16),
                    setStackSize(IngotList.Zeron_100_Ingot.copy(), 34))
                .itemOutputs(GTPPList.Electron_Cell)
                .eut(RECIPE_ZPM)
                .duration(240 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Charge Pack [ZPM] Empty"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GTPPList.Charge_Pack_ZPM_Empty, 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 24),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 24),

                    setStackSize(GemList.Nether_Star.copy(), 6),

                    setStackSize(GTItemList.Stable_Lepton_Containment_Unit.copy(), 32),

                    setStackSize(IngotList.Arcanite_Ingot.copy(), 32),
                    setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 2),
                    setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 64),
                    setStackSize(IngotList.Energy_Crystal_Ingot.copy(), 64 + 36),
                    setStackSize(IngotList.Gallium_Ingot.copy(), 64 * 3),

                    setStackSize(IngotList.HSSS_Ingot.copy(), 24),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 24),
                    setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 32),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 4),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 64 * 16),

                    setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 64 * 2 + 2),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 64 + 48),
                    setStackSize(IngotList.Trinium_Naquadah_Carbonite_Ingot.copy(), 64),
                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 24),

                    setStackSize(IngotList.Zeron_100_Ingot.copy(), 64 + 4))
                .fluidInputs(
                    setStackSize(FluidList.Lubricant.copy(), 1000),
                    setStackSize(GasList.Radon.copy(), 1000 * 8 + 500))
                .itemOutputs(GTPPList.Charge_Pack_ZPM_Empty)
                .eut(RECIPE_ZPM)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Charge Pack [ZPM]"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),
                    setStackSize(GTPPList.Charge_Pack_ZPM_Empty, 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 24),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 24),

                    setStackSize(GemList.Nether_Star.copy(), 6),

                    setStackSize(GTItemList.Stable_Lepton_Containment_Unit.copy(), 32),

                    setStackSize(IngotList.Arcanite_Ingot.copy(), 32),
                    setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 2),
                    setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 64),
                    setStackSize(IngotList.Energy_Crystal_Ingot.copy(), 64 + 36),
                    setStackSize(IngotList.Gallium_Ingot.copy(), 64 * 3),

                    setStackSize(IngotList.HSSS_Ingot.copy(), 24),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 24),
                    setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 32),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 4),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 64 * 16),

                    setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 64 * 2 + 2),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 64 + 48),
                    setStackSize(IngotList.Trinium_Naquadah_Carbonite_Ingot.copy(), 64),
                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 24),

                    setStackSize(IngotList.Zeron_100_Ingot.copy(), 64 + 4))
                .fluidInputs(
                    setStackSize(FluidList.Lubricant.copy(), 1000),
                    setStackSize(GasList.Radon.copy(), 1000 * 8 + 500))
                .itemOutputs(GTPPList.Charge_Pack_ZPM)
                .eut(RECIPE_ZPM)
                .duration(360 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Advanced Containment Unit"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTPPList.Advanced_Containment_Unit, 0),

                    setStackSize(IngotList.Advanced_Nitinol_Ingot.copy(), 8),
                    setStackSize(IngotList.Duranium_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 32),
                    setStackSize(IngotList.Titansteel_Ingot.copy(), 16),
                    setStackSize(IngotList.Trinium_Naquadah_Carbonite_Ingot.copy(), 16),

                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64))
                .itemOutputs(GTPPList.Advanced_Containment_Unit)
                .eut(RECIPE_UV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Quark Entanglement Empty"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GTPPList.Quark_Entanglement_Empty, 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 8),
                    setStackSize(GTItemList.Stable_Meson_Containment_Unit.copy(), 16),
                    setStackSize(IngotList.Advanced_Nitinol_Ingot.copy(), 40),
                    setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 16),
                    setStackSize(IngotList.Duranium_Ingot.copy(), 64 * 8),

                    setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 33),
                    setStackSize(IngotList.Titansteel_Ingot.copy(), 33),
                    setStackSize(IngotList.Trinium_Naquadah_Carbonite_Ingot.copy(), 48),
                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64))
                .itemOutputs(GTPPList.Quark_Entanglement_Empty)
                .eut(RECIPE_UV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Quark Entanglement"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),
                    setStackSize(GTPPList.Quark_Entanglement_Empty, 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 8),
                    setStackSize(GTItemList.Stable_Meson_Containment_Unit.copy(), 16),
                    setStackSize(IngotList.Advanced_Nitinol_Ingot.copy(), 40),
                    setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 16),
                    setStackSize(IngotList.Duranium_Ingot.copy(), 64 * 8),

                    setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 33),
                    setStackSize(IngotList.Titansteel_Ingot.copy(), 33),
                    setStackSize(IngotList.Trinium_Naquadah_Carbonite_Ingot.copy(), 48),
                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64))
                .itemOutputs(GTPPList.Quark_Entanglement)
                .eut(RECIPE_UV)
                .duration(240 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Charge Pack [UV] Empty"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GTPPList.Charge_Pack_UV_Empty, 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 24),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 24),

                    setStackSize(GemList.Nether_Star.copy(), 10),

                    setStackSize(GTItemList.Stable_Meson_Containment_Unit.copy(), 32),

                    setStackSize(IngotList.Advanced_Nitinol_Ingot.copy(), 64 + 56),
                    setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 64),
                    setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 32),
                    setStackSize(IngotList.Duranium_Ingot.copy(), 64 * 16),
                    setStackSize(IngotList.Europium_Ingot.copy(), 64 * 2),

                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 48),
                    setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 32),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 4),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 44),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 16),

                    setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 64 + 2),
                    setStackSize(IngotList.Titansteel_Ingot.copy(), 64 + 4),
                    setStackSize(IngotList.Trinium_Ingot.copy(), 64 * 3),
                    setStackSize(IngotList.Trinium_Naquadah_Carbonite_Ingot.copy(), 64 + 36),
                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64 * 5),

                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 64 * 3))
                .fluidInputs(
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 3),
                    setStackSize(GasList.Radon.copy(), 1000 * 12 + 500))
                .itemOutputs(GTPPList.Charge_Pack_UV_Empty)
                .eut(RECIPE_UV)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Charge Pack [UV]"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),
                    setStackSize(GTPPList.Charge_Pack_UV_Empty, 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 24),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 24),

                    setStackSize(GemList.Nether_Star.copy(), 10),

                    setStackSize(GTItemList.Stable_Meson_Containment_Unit.copy(), 32),

                    setStackSize(IngotList.Advanced_Nitinol_Ingot.copy(), 64 + 56),
                    setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 64),
                    setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 32),
                    setStackSize(IngotList.Duranium_Ingot.copy(), 64 * 16),
                    setStackSize(IngotList.Europium_Ingot.copy(), 64 * 2),

                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 48),
                    setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 32),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 4),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 44),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 16),

                    setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 64 + 2),
                    setStackSize(IngotList.Titansteel_Ingot.copy(), 64 + 4),
                    setStackSize(IngotList.Trinium_Ingot.copy(), 64 * 3),
                    setStackSize(IngotList.Trinium_Naquadah_Carbonite_Ingot.copy(), 64 + 36),
                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64 * 5),

                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 64 * 3))
                .fluidInputs(
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 3),
                    setStackSize(GasList.Radon.copy(), 1000 * 12 + 500))
                .itemOutputs(GTPPList.Charge_Pack_UV)
                .eut(RECIPE_UV)
                .duration(360 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Exotic Containment Unit Empty"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GTPPList.Exotic_Containment_Unit_Empty, 0),

                    setStackSize(IngotList.Abyssal_Alloy_Ingot.copy(), 8),
                    setStackSize(IngotList.Advanced_Nitinol_Ingot.copy(), 16),
                    setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 16),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 64),
                    setStackSize(IngotList.Octiron_Ingot.copy(), 16),

                    setStackSize(IngotList.Titansteel_Ingot.copy(), 16),

                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 6))
                .itemOutputs(GTPPList.Exotic_Containment_Unit_Empty)
                .eut(RECIPE_UHV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Exotic Containment Unit"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),
                    setStackSize(GTPPList.Exotic_Containment_Unit_Empty, 0),

                    setStackSize(IngotList.Abyssal_Alloy_Ingot.copy(), 8),
                    setStackSize(IngotList.Advanced_Nitinol_Ingot.copy(), 16),
                    setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 16),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 64),
                    setStackSize(IngotList.Octiron_Ingot.copy(), 16),

                    setStackSize(IngotList.Titansteel_Ingot.copy(), 16),

                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 6))
                .itemOutputs(GTPPList.Exotic_Containment_Unit)
                .eut(RECIPE_UHV)
                .duration(240 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Graviton Anomaly"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTPPList.Graviton_Anomaly, 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 8),

                    setStackSize(GTItemList.Stable_Boson_Containment_Unit.copy(), 2),

                    setStackSize(IngotList.Abyssal_Alloy_Ingot.copy(), 40),
                    setStackSize(IngotList.Advanced_Nitinol_Ingot.copy(), 16),
                    setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 48),
                    setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 1),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 64),

                    setStackSize(IngotList.Octiron_Ingot.copy(), 32),
                    setStackSize(IngotList.Titansteel_Ingot.copy(), 33),

                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 14))
                .itemOutputs(GTPPList.Graviton_Anomaly)
                .eut(RECIPE_UHV)
                .duration(120 * SECONDS)
                .addTo(AssemblyLineNormalRecipe);

            // "Charge Pack [UHV] Empty"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(GTPPList.Charge_Pack_UHV_Empty, 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 24),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 24),

                    setStackSize(GemList.Nether_Star.copy(), 18),

                    setStackSize(GTItemList.Stable_Boson_Containment_Unit.copy(), 4),

                    setStackSize(IngotList.Abyssal_Alloy_Ingot.copy(), 64 + 58),
                    setStackSize(IngotList.Advanced_Nitinol_Ingot.copy(), 32),
                    setStackSize(IngotList.Americium_Ingot.copy(), 64 * 3 + 48),
                    setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 64 + 36),
                    setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 2),

                    setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 32),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 52),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 8),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 + 24),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 64 * 6),

                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 4 + 17),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 + 40),
                    setStackSize(IngotList.Octiron_Ingot.copy(), 64),
                    setStackSize(IngotList.Titansteel_Ingot.copy(), 64 * 2 + 2),

                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 28))
                .fluidInputs(
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 40),
                    setStackSize(GasList.Radon.copy(), 1000 * 22 + 500))
                .itemOutputs(GTPPList.Charge_Pack_UHV_Empty)
                .eut(RECIPE_UHV)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Charge Pack [UHV]"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),
                    setStackSize(GTPPList.Charge_Pack_UHV_Empty, 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 24),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 24),

                    setStackSize(GemList.Nether_Star.copy(), 18),

                    setStackSize(GTItemList.Stable_Boson_Containment_Unit.copy(), 4),

                    setStackSize(IngotList.Abyssal_Alloy_Ingot.copy(), 64 + 58),
                    setStackSize(IngotList.Advanced_Nitinol_Ingot.copy(), 32),
                    setStackSize(IngotList.Americium_Ingot.copy(), 64 * 3 + 48),
                    setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 64 + 36),
                    setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 2),

                    setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 32),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 52),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 8),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 + 24),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 64 * 6),

                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 4 + 17),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 + 40),
                    setStackSize(IngotList.Octiron_Ingot.copy(), 64),
                    setStackSize(IngotList.Titansteel_Ingot.copy(), 64 * 2 + 2),

                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 28))
                .fluidInputs(
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 40),
                    setStackSize(GasList.Radon.copy(), 1000 * 22 + 500))
                .itemOutputs(GTPPList.Charge_Pack_UHV)
                .eut(RECIPE_UHV)
                .duration(360 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // Circuit
        {
            // "Bio Processing Unit"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(CircuitList.Bio_Processing_Unit.copy(), 0),

                    setStackSize(CircuitList.Biocells.copy(), 16),
                    setStackSize(CircuitList.Ultra_Bio_Mutated_Circuit_Board.copy(), 1),
                    setStackSize(GTItemList.Reinforced_Glass_Tube.copy(), 16),

                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 8),
                    setStackSize(IngotList.HSSS_Ingot.copy(), 4),
                    setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 8),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 16))
                .fluidInputs(
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 2),
                    setStackSize(FluidList.Sterilized_Bio_Catalyst_Medium.copy(), 500),
                    setStackSize(FluidList.UU_Matter.copy(), 500))
                .itemOutputs(CircuitList.Bio_Processing_Unit)
                .eut(RECIPE_UHV)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Neuro Processing Unit"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(CircuitList.Neuro_Processing_Unit.copy(), 0),

                    setStackSize(CircuitList.Extreme_Wetware_Lifesupport_Circuit_Board.copy(), 1),
                    setStackSize(CircuitList.Stemcells.copy(), 16),

                    setStackSize(GTItemList.Reinforced_Glass_Tube.copy(), 16),

                    setStackSize(IngotList.Enriched_Naquadah_Ingot.copy(), 2),
                    setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 4),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 16),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 4))
                .fluidInputs(
                    setStackSize(FluidList.Growth_Catalyst_Medium.copy(), 250),
                    setStackSize(FluidList.UU_Matter.copy(), 250),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000))
                .itemOutputs(CircuitList.Neuro_Processing_Unit)
                .eut(RECIPE_ZPM)
                .duration(30 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Wetware Mainframe"
            {
                final ItemStack[] superConductor = new ItemStack[] {
                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 64),
                    setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 32),
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 16),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 8),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 4),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 2) };

                for (int superConductor_Tier = 0; superConductor_Tier < 6; superConductor_Tier++) {
                    GTValues.RA.stdBuilder()
                        .itemInputs(
                            GTUtility.getIntegratedCircuit(superConductor_Tier + 1),
                            setStackSize(CircuitList.Wetware_Mainframe.copy(), 0),

                            superConductor[superConductor_Tier],

                            setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 16),
                            setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 16),
                            setStackSize(CircuitList.Advanced_SMD_Inductor.copy(), 16),
                            setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 16),
                            setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 16),

                            setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 48),
                            setStackSize(CircuitList.Wetware_Supercomputer.copy(), 2),

                            setStackSize(IngotList.Indalloy_140_Ingot.copy(), 20),
                            setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 16),
                            setStackSize(IngotList.Tritanium_Ingot.copy(), 4))
                        .fluidInputs(
                            setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 10),
                            setStackSize(GasList.Radon.copy(), 1000 * 2 + 500))
                        .itemOutputs(CircuitList.Wetware_Mainframe)
                        .eut(RECIPE_UV)
                        .duration(100 * SECONDS)
                        .addTo(AssemblyLineItemRecipe);
                }

                for (int superConductor_Tier = 0; superConductor_Tier < 6; superConductor_Tier++) {
                    GTValues.RA.stdBuilder()
                        .itemInputs(
                            GTUtility.getIntegratedCircuit(superConductor_Tier + 7),
                            setStackSize(CircuitList.Wetware_Mainframe.copy(), 0),

                            superConductor[superConductor_Tier],

                            setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 4),
                            setStackSize(CircuitList.Optical_SMD_Diode.copy(), 4),
                            setStackSize(CircuitList.Optical_SMD_Inductor.copy(), 4),
                            setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 4),
                            setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 4),

                            setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 48),
                            setStackSize(CircuitList.Wetware_Supercomputer.copy(), 2),

                            setStackSize(IngotList.Indalloy_140_Ingot.copy(), 20),
                            setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 16),
                            setStackSize(IngotList.Tritanium_Ingot.copy(), 4))
                        .fluidInputs(
                            setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 10),
                            setStackSize(GasList.Radon.copy(), 1000 * 2 + 500))
                        .itemOutputs(CircuitList.Wetware_Mainframe)
                        .eut(RECIPE_UV)
                        .duration(100 * SECONDS)
                        .addTo(AssemblyLineItemRecipe);
                }
            }

            // "Bioware SuperComputer"
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
                    GTValues.RA.stdBuilder()
                        .itemInputs(
                            GTUtility.getIntegratedCircuit(Circuit_Parts_Tier + 1),
                            setStackSize(CircuitList.Bioware_Supercomputer.copy(), 0),

                            Capacitor[Circuit_Parts_Tier],
                            Diode[Circuit_Parts_Tier],
                            Resistor[Circuit_Parts_Tier],
                            Transistor[Circuit_Parts_Tier],

                            setStackSize(CircuitList.Bioware_Assembly.copy(), 2),
                            setStackSize(CircuitList.NOR_Memory_Chip.copy(), 32),
                            setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 64),
                            setStackSize(CircuitList.Ultra_Bio_Mutated_Circuit_Board.copy(), 2),

                            setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 4),
                            setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 16))
                        .fluidInputs(
                            setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 10),
                            setStackSize(FluidList.Sterilized_Bio_Catalyst_Medium.copy(), 144 * 10),
                            setStackSize(FluidList.Super_Coolant.copy(), 1000 * 10))
                        .itemOutputs(CircuitList.Bioware_Supercomputer)
                        .eut(RECIPE_UV)
                        .duration(200 * SECONDS)
                        .addTo(AssemblyLineItemRecipe);
                }
            }

            // "Bio Mainframe"
            {
                final ItemStack[] superConductor = new ItemStack[] {
                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64),
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 32),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 16),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 8) };

                for (int superConductor_Tier = 0; superConductor_Tier < 4; superConductor_Tier++) {
                    GTValues.RA.stdBuilder()
                        .itemInputs(
                            GTUtility.getIntegratedCircuit(superConductor_Tier + 1),
                            setStackSize(CircuitList.Bioware_Mainframe.copy(), 0),

                            superConductor[superConductor_Tier],

                            setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 24),
                            setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 24),
                            setStackSize(CircuitList.Advanced_SMD_Inductor.copy(), 24),
                            setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 24),
                            setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 24),

                            setStackSize(CircuitList.Bioware_Supercomputer.copy(), 2),
                            setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 64),

                            setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 16),
                            setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 16),
                            setStackSize(IngotList.Tritanium_Ingot.copy(), 8))
                        .fluidInputs(
                            setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 20),
                            setStackSize(FluidList.Sterilized_Bio_Catalyst_Medium.copy(), 144 * 20),
                            setStackSize(FluidList.Super_Coolant.copy(), 1000 * 20))
                        .itemOutputs(CircuitList.Bioware_Mainframe)
                        .eut(RECIPE_UHV)
                        .duration(300 * SECONDS)
                        .addTo(AssemblyLineItemRecipe);
                }

                for (int superConductor_Tier = 0; superConductor_Tier < 4; superConductor_Tier++) {
                    GTValues.RA.stdBuilder()
                        .itemInputs(
                            GTUtility.getIntegratedCircuit(superConductor_Tier + 5),
                            setStackSize(CircuitList.Bioware_Mainframe.copy(), 0),

                            superConductor[superConductor_Tier],

                            setStackSize(CircuitList.Bioware_Supercomputer.copy(), 2),
                            setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 6),
                            setStackSize(CircuitList.Optical_SMD_Diode.copy(), 6),
                            setStackSize(CircuitList.Optical_SMD_Inductor.copy(), 6),
                            setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 6),

                            setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 6),
                            setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 64),

                            setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 16),
                            setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 16),
                            setStackSize(IngotList.Tritanium_Ingot.copy(), 8))
                        .fluidInputs(
                            setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 20),
                            setStackSize(FluidList.Sterilized_Bio_Catalyst_Medium.copy(), 144 * 20),
                            setStackSize(FluidList.Super_Coolant.copy(), 1000 * 20))
                        .itemOutputs(CircuitList.Bioware_Mainframe)
                        .eut(RECIPE_UHV)
                        .duration(300 * SECONDS)
                        .addTo(AssemblyLineItemRecipe);
                }
            }

            // "Optical Assembly"
            {
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(CircuitList.Optical_Assembly.copy(), 0),

                        setStackSize(CircuitList.NOR_Memory_Chip.copy(), 32),
                        setStackSize(CircuitList.Optical_Circuit_Board.copy(), 1),
                        setStackSize(CircuitList.Optical_Processor.copy(), 4),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 20),
                        setStackSize(CircuitList.Optical_SMD_Inductor.copy(), 16),

                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 20),
                        setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 64),

                        setStackSize(IngotList.Lumiium_Ingot.copy(), 3),
                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 16))
                    .fluidInputs(
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 10),
                        setStackSize(FluidList.Super_Coolant.copy(), 1000 * 10),
                        setStackSize(GasList.Oganesson.copy(), 500),
                        setStackSize(PlasmaList.Radon_Plasma.copy(), 144 * 10))
                    .itemOutputs(CircuitList.Optical_Assembly)
                    .eut(RECIPE_UHV)
                    .duration(20 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);
            }

            // "Optical Computer"
            {
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(CircuitList.Optical_Supercomputer.copy(), 0),

                        setStackSize(CircuitList.ASoC_Chip.copy(), 32),
                        setStackSize(CircuitList.NOR_Memory_Chip.copy(), 64),
                        setStackSize(CircuitList.Optical_Assembly.copy(), 4),
                        setStackSize(CircuitList.Optical_Circuit_Board.copy(), 2),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 24),

                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 24),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 24),
                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 24),

                        setStackSize(IngotList.Lumiium_Ingot.copy(), 4),
                        setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 16),
                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 16))
                    .fluidInputs(
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 20),
                        setStackSize(FluidList.Super_Coolant.copy(), 1000 * 20),
                        setStackSize(GasList.Oganesson.copy(), 1000),
                        setStackSize(PlasmaList.Radon_Plasma.copy(), 144 * 20))
                    .itemOutputs(CircuitList.Optical_Supercomputer)
                    .eut(RECIPE_UHV)
                    .duration(200 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);
            }

            // "Optical Mainframe"
            {
                final ItemStack[] superConductor = new ItemStack[] {
                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 32),
                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 16) };

                for (int superConductor_Tier = 0; superConductor_Tier < 3; superConductor_Tier++) {
                    GTValues.RA.stdBuilder()
                        .itemInputs(
                            GTUtility.getIntegratedCircuit(superConductor_Tier + 1),
                            setStackSize(CircuitList.Optical_Mainframe.copy(), 0),

                            superConductor[superConductor_Tier],

                            setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 32),
                            setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 32),
                            setStackSize(CircuitList.Advanced_SMD_Inductor.copy(), 32),
                            setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 32),
                            setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 32),

                            setStackSize(CircuitList.ASoC_Chip.copy(), 64),
                            setStackSize(CircuitList.Optical_Supercomputer.copy(), 4),

                            setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 32),
                            setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 32),
                            setStackSize(IngotList.Tritanium_Ingot.copy(), 16))
                        .fluidInputs(
                            setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 40),
                            setStackSize(FluidList.Super_Coolant.copy(), 1000 * 40),
                            setStackSize(GasList.Oganesson.copy(), 1000 * 2),
                            setStackSize(PlasmaList.Radon_Plasma.copy(), 144 * 40))
                        .itemOutputs(CircuitList.Optical_Mainframe)
                        .eut(RECIPE_UEV)
                        .duration(300 * SECONDS)
                        .addTo(AssemblyLineItemRecipe);
                }
            }

            // Special Circuit
            {
                // "Nano Circuit"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Nano_Circuit.copy(), 0),

                        setStackSize(CircuitList.Bioware_Mainframe.copy(), 2),
                        setStackSize(CircuitList.Nano_Power_IC_Chip.copy(), 64),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 32),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 32),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 32),

                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 32),
                        setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 64),

                        setStackSize(IngotList.Draconium_Ingot.copy(), 32),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 28),
                        setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 16),
                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 16),
                        setStackSize(IngotList.Tritanium_Ingot.copy(), 16),

                        setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 2))
                    .fluidInputs(
                        setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 20),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 26))
                    .itemOutputs(NewHorizonsCoreModList.Nano_Circuit)
                    .eut(RECIPE_UIV)
                    .duration(400 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Pico Circuit"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Pico_Circuit.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 2),

                        setStackSize(CircuitList.Optical_Circuit_Board.copy(), 1),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 48),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 48),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 48),
                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 48),

                        setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 64),

                        setStackSize(IngotList.Lanthanum_Ingot.copy(), 8),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 2),
                        setStackSize(IngotList.Osmium_Ingot.copy(), 8),
                        setStackSize(IngotList.Radox_Polymer_Bar.copy(), 4),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 4))
                    .fluidInputs(
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 26),
                        setStackSize(FluidList.UU_Matter.copy(), 1000 * 8))
                    .itemOutputs(NewHorizonsCoreModList.Pico_Circuit)
                    .eut(RECIPE_UMV)
                    .duration(500 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Quantum Circuit"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Quantum_Circuit.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 2),

                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 64),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 64),
                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 64),
                        setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 64),

                        setStackSize(IngotList.Indium_Ingot.copy(), 8),
                        setStackSize(IngotList.Lanthanum_Ingot.copy(), 2),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 32),
                        setStackSize(IngotList.Osmium_Ingot.copy(), 16),
                        setStackSize(IngotList.Shirabon_Ingot.copy(), 16),

                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 4))
                    .fluidInputs(
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 26),
                        setStackSize(FluidList.UU_Matter.copy(), 1000 * 24))
                    .itemOutputs(NewHorizonsCoreModList.Quantum_Circuit)
                    .eut(RECIPE_UMV)
                    .duration(1000 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);
            }
        }

        // Drone
        {
            // "Drone (Level 2)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTItemList.Drone_Level_2.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 32),

                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 8),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 2),

                    setStackSize(GemList.Nether_Star.copy(), 20),

                    setStackSize(GTItemList.Wireless_Needs_Maintenance_Cover.copy(), 1),

                    setStackSize(IngotList.Europium_Ingot.copy(), 64 + 48),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 1),
                    setStackSize(IngotList.Gallium_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.HSSS_Ingot.copy(), 48),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 48),

                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 12),
                    setStackSize(IngotList.Mysterious_Crystal_Ingot.copy(), 12),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 2 + 52),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 16),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 16),

                    setStackSize(IngotList.Osmium_Ingot.copy(), 8),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 64 * 3 + 32),
                    setStackSize(IngotList.Trinium_Ingot.copy(), 64 * 3),
                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64 + 48),
                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 48),

                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_3.copy(), 4))
                .fluidInputs(
                    setStackSize(FluidList.CN3H7O3_Rocket_Fuel.copy(), 1000 * 4),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 16),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 5),
                    setStackSize(GasList.Radon.copy(), 1000 * 27))
                .itemOutputs(setStackSize(GTItemList.Drone_Level_2.copy(), 4))
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Drone (Level 3)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTItemList.Drone_Level_3.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 64 + 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 64 * 5 + 48),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 64 * 4),

                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64 * 2),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 32),
                    setStackSize(CircuitList.HPIC_Wafer.copy(), 64 * 16),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 6 + 28),

                    setStackSize(GTItemList.Wireless_Needs_Maintenance_Cover.copy(), 1),

                    setStackSize(HatchList.Auto_Taping_Maintenance_Hatch.copy(), 16),

                    setStackSize(IngotList.Americium_Ingot.copy(), 64 * 63),
                    setStackSize(IngotList.Europium_Ingot.copy(), 64 * 36),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 60 + 40),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 2 + 16),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 * 3 + 8),

                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 36 + 8),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 72 + 24),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 27 + 44),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Trinium_Ingot.copy(), 64 * 48),

                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64 * 32))
                .fluidInputs(
                    setStackSize(FluidList.Ethyl_Cyanoacrylate_Super_Glue.copy(), 1000 * 2),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 64 * 2),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * (64 * 11 + 24)),
                    setStackSize(GasList.Radon.copy(), 1000 * (64 * 9 + 16)))
                .itemOutputs(GTItemList.Drone_Level_3)
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Drone Remote Interface"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTItemList.Drone_Remote_Interface.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 64 * 3 + 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 64 * 5 + 48),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 64 * 4),

                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64 * 2),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 32),
                    setStackSize(CircuitList.HPIC_Wafer.copy(), 64 * 16),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 10 + 44),

                    setStackSize(GTItemList.Computer_Monitor_Cover.copy(), 4),
                    setStackSize(GTItemList.Data_Orb.copy(), 4),
                    setStackSize(GTItemList.Wireless_Needs_Maintenance_Cover.copy(), 1),

                    setStackSize(HatchList.Auto_Taping_Maintenance_Hatch.copy(), 16),

                    setStackSize(IngotList.Americium_Ingot.copy(), 64 * 63),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 10),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 9 + 32),
                    setStackSize(IngotList.Europium_Ingot.copy(), 64 * 36),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 32),

                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 96 + 8),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 3 + 32),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 * 5 + 8),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 36 + 8),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 92 + 16),

                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 72 + 12),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Trinium_Ingot.copy(), 64 * 48),
                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64 * 32))
                .fluidInputs(
                    setStackSize(FluidList.Ethyl_Cyanoacrylate_Super_Glue.copy(), 1000 * 66),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 64 * 2),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * (64 * 13 + 24)),
                    setStackSize(GasList.Radon.copy(), 1000 * (64 * 14 + 36)))
                .itemOutputs(GTItemList.Drone_Remote_Interface)
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Drone (Level 4)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTItemList.Drone_Level_4.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 64 + 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 64 * 4 + 48),

                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 32),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 16),
                    setStackSize(CircuitList.UHPIC_Wafer.copy(), 64 * 2),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 18 + 40),

                    setStackSize(GTNHIntergalacticList.Space_Elevator_Motor_MKIII.copy(), 64),

                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 25 + 56),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 22 + 28),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 76),
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 1),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 49),

                    setStackSize(IngotList.Infinity_Ingot.copy(), 32),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 * 4 + 48),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 49),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 117 + 16),

                    setStackSize(SingularityList.Eternal_Singularity.copy(), 1),

                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 2))
                .fluidInputs(
                    setStackSize(FluidList.Excited_Dimensionally_Transcendent_Crude_Catalyst.copy(), 1000 * 8),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 32),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * (64 * 4 + 48)),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 + 24)),
                    setStackSize(GasList.Radon.copy(), 1000 * (64 * 13 + 18)))
                .itemOutputs(GTItemList.Drone_Level_4)
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // Dyson
        {
            // "Corona-Resistant Drone Case"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTNHIntergalacticList.Corona_Resistant_Drone_Case.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 20),

                    setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 32),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 32),
                    setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 32),
                    setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 32),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 4),

                    setStackSize(CircuitList.High_Power_IC_Chip.copy(), 64 * 4),
                    setStackSize(CircuitList.Multilayer_Fiber_Reinforced_Circuit_Board.copy(), 4),

                    setStackSize(GemList.Nether_Star.copy(), 16),

                    setStackSize(GTItemList.Gravitation_Engine.copy(), 4),

                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 8),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 18),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 20),
                    setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64),

                    setStackSize(IngotList.Infinity_Ingot.copy(), 34),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 32),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 32),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 36),

                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 8),

                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4.copy(), 1),

                    setStackSize(OpenComputersList.Drone_Case_Tier3.copy(), 4),
                    setStackSize(OpenComputersList.Navigation_Upgrade.copy(), 64))
                .fluidInputs(
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 4),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 41),
                    setStackSize(GasList.Radon.copy(), 1000 * 24),
                    setStackSize(PlasmaList.Xenon_Plasma.copy(), 1000))
                .itemOutputs(GTNHIntergalacticList.Corona_Resistant_Drone_Case)
                .eut(RECIPE_UHV)
                .duration(5 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Magnetically Shielded Femtocontroller"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTNHIntergalacticList.Magnetically_Shielded_Femtocontroller.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 2),

                    setStackSize(CircuitList.Optically_Perfected_CPU.copy(), 1),

                    setStackSize(GemList.Nether_Star.copy(), 16),

                    setStackSize(GTItemList.Energised_Tesseract.copy(), 1),

                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 8),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 18),
                    setStackSize(IngotList.Enriched_Naquadah_Alloy_Ingot.copy(), 1),
                    setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64),

                    setStackSize(IngotList.Infinity_Ingot.copy(), 34),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 32),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 39),

                    setStackSize(OpenComputersList.Microcontroller_Case_Tier3.copy(), 4),

                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 4))
                .fluidInputs(
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 4),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 41),
                    setStackSize(GasList.Radon.copy(), 1000 * 24))
                .itemOutputs(GTNHIntergalacticList.Magnetically_Shielded_Femtocontroller)
                .eut(RECIPE_UHV)
                .duration(5 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Dyson Swarm Module"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTNHIntergalacticList.Dyson_Swarm_Module.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 56),

                    setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 32),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 32),
                    setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 32),
                    setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 32),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 4),

                    setStackSize(CircuitList.Femto_Power_IC_Chip.copy(), 4),
                    setStackSize(CircuitList.High_Power_IC_Chip.copy(), 64 * 4),
                    setStackSize(CircuitList.Multilayer_Fiber_Reinforced_Circuit_Board.copy(), 4),
                    setStackSize(CircuitList.Optically_Perfected_CPU.copy(), 1),

                    setStackSize(DustList.Enriched_Naquadah_Dust.copy(), 64 * 6),
                    setStackSize(DustList.Tiberium_Dust.copy(), 64 * 8),

                    setStackSize(FoilList.Naquarite_Universal_Insulator_Foil.copy(), 4),

                    setStackSize(GemList.Nether_Star.copy(), 40),

                    setStackSize(GTItemList.Energised_Tesseract.copy(), 1),
                    setStackSize(GTItemList.Gravitation_Engine.copy(), 4),

                    setStackSize(GTNHIntergalacticList.Hyperfine_TrNq_Radioisomer_Pellet.copy(), 1),
                    setStackSize(GTNHIntergalacticList.Ultra_Durable_Solar_Sail.copy(), 4),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 32),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 16),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 36),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 24),

                    setStackSize(IngotList.HSSG_Ingot.copy(), 32),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 4),
                    setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 + 4),
                    setStackSize(IngotList.Iridium_Ingot.copy(), 64 * 13 + 32),

                    setStackSize(IngotList.Lead_Ingot.copy(), 64 * 5),
                    setStackSize(IngotList.Maraging_Steel_350_Ingot.copy(), 16),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 3),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64),
                    setStackSize(IngotList.Niobium_Carbide_Ingot.copy(), 16),

                    setStackSize(IngotList.Nitinol_60_Ingot.copy(), 8),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 24),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 64 * 2 + 40),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 + 11),
                    setStackSize(IngotList.Steel_Ingot.copy(), 32),

                    setStackSize(IngotList.Titanium_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 8),
                    setStackSize(IngotList.Trinium_Ingot.copy(), 24),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 64 * 30),

                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4.copy(), 1),

                    setStackSize(OpenComputersList.Drone_Case_Tier3.copy(), 4),
                    setStackSize(OpenComputersList.Microcontroller_Case_Tier3.copy(), 4),
                    setStackSize(OpenComputersList.Navigation_Upgrade.copy(), 64),

                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 4))
                .fluidInputs(
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000),
                    setStackSize(FluidList.Gelid_Cryotheum.copy(), 1000 * 16),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 8),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 3 + 18)),
                    setStackSize(FluidList.Prismatic_Naquadah_Composite_Slurry.copy(), 1000 * 12),

                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 16),
                    setStackSize(GasList.Radon.copy(), 1000 * 48),
                    setStackSize(PlasmaList.Xenon_Plasma.copy(), 1000))
                .itemOutputs(setStackSize(GTNHIntergalacticList.Dyson_Swarm_Module.copy(), 64))
                .eut(RECIPE_UHV)
                .duration(5 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // Electromagnet
        {
            // "Steel Electromagnet"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTItemList.Steel_Electromagnet.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 32),

                    setStackSize(GemList.Nether_Star.copy(), 12),

                    setStackSize(IngotList.Cobalt_Ingot.copy(), 16),
                    setStackSize(IngotList.Gallium_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.HSSS_Ingot.copy(), 48),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 48),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 16),

                    setStackSize(IngotList.Magnetic_Steel_Ingot.copy(), 4),
                    setStackSize(IngotList.Nickel_Zinc_Ferrite_Ingot.copy(), 32),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 64 * 3),
                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 16),
                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 48),

                    setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 64))
                .fluidInputs(
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 8),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 2),
                    setStackSize(GasList.Radon.copy(), 1000 * 17))
                .itemOutputs(GTItemList.Steel_Electromagnet)
                .eut(RECIPE_LuV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Neodymium Electromagnet"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTItemList.Neodymium_Electromagnet.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 32),

                    setStackSize(GemList.Nether_Star.copy(), 20),

                    setStackSize(IngotList.Cobalt_Ingot.copy(), 32),
                    setStackSize(IngotList.Europium_Ingot.copy(), 64 * 4 + 32),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Magnetic_Neodymium_Ingot.copy(), 4),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 16),

                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 + 56),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 48),
                    setStackSize(IngotList.Trinium_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64 * 4),

                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 64 * 2))
                .fluidInputs(
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 16),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 6),
                    setStackSize(GasList.Radon.copy(), 1000 * 25))
                .itemOutputs(GTItemList.Neodymium_Electromagnet)
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Samarium Electromagnet"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTItemList.Samarium_Electromagnet.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 32),

                    setStackSize(GemList.Nether_Star.copy(), 39),

                    setStackSize(IngotList.Americium_Ingot.copy(), 64 * 7 + 32),
                    setStackSize(IngotList.Cobalt_Ingot.copy(), 48),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 + 16),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 3 + 40),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 40),

                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 2 + 48),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 8 + 34),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 4 + 16),

                    setStackSize(WireList.Superconductor_UV_Wire_1x.copy(), 64 * 4))
                .fluidInputs(
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 32),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * (64 + 16)),
                    setStackSize(GasList.Radon.copy(), 1000 * 45))
                .itemOutputs(GTItemList.Samarium_Electromagnet)
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Tengam Electromagnet"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTItemList.Tengam_Electromagnet.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 32),

                    setStackSize(GemList.Nether_Star.copy(), 64 + 8),

                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 8),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 2 + 48),
                    setStackSize(IngotList.Cobalt_Ingot.copy(), 64),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 3 + 24),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 8),

                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 5 + 4),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 48),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 5 + 20),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 12 + 16),
                    setStackSize(IngotList.Tritanium_Ingot.copy(), 64),

                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 8))
                .fluidInputs(
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 64),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 32),
                    setStackSize(GasList.Radon.copy(), 1000 * (64 + 36)))
                .itemOutputs(GTItemList.Tengam_Electromagnet)
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // "Empty Quark Release Catalyst Housing"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GTItemList.Empty_Quark_Release_Catalyst_Housing.copy(), 0),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 24),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 16),

                setStackSize(GemList.Nether_Star.copy(), 64 + 8),

                setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 32),
                setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 4 + 40),
                setStackSize(IngotList.Draconium_Ingot.copy(), 64 + 24),
                setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64 * 4),
                setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 2 + 56),

                setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 2 + 56),
                setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 2 + 34),
                setStackSize(IngotList.Tritanium_Ingot.copy(), 64 + 40))
            .fluidInputs(
                setStackSize(FluidList.Lubricant.copy(), 1000 * 16),
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 2 + 34)),
                setStackSize(GasList.Radon.copy(), 1000 * (64 + 44)))
            .itemOutputs(GTItemList.Empty_Quark_Release_Catalyst_Housing.copy())
            .eut(RECIPE_UIV)
            .duration(60 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // Energy Orb & Ultimate Battery
        {
            // "Engraved Lapotron Chip"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.HV, 2),

                    setStackSize(DustList.Redstone_Dust.copy(), 10),

                    setStackSize(GemList.Lapis_Lazuli.copy(), 12),
                    setStackSize(GemList.Ruby.copy(), 8),

                    setStackSize(IngotList.Vibrant_Alloy_Ingot.copy(), 2))
                .itemOutputs(setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 3))
                .eut(RECIPE_HV)
                .duration(45 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Lapotronic Energy Orb Cluster"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(BatteryList.Lapotronic_Energy_Orb_Cluster_Empty.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),

                    setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 8),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 8),
                    setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 8),
                    setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 8),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64),

                    setStackSize(CircuitList.High_Power_IC_Chip.copy(), 64),
                    setStackSize(CircuitList.Multilayer_Fiber_Reinforced_Circuit_Board.copy(), 1),

                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 5),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 16),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 8))
                .itemOutputs(BatteryList.Lapotronic_Energy_Orb_Cluster_Empty)
                .eut(RECIPE_ZPM)
                .duration(50 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Lapotronic Energy Orb Cluster"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),
                    setStackSize(BatteryList.Lapotronic_Energy_Orb_Cluster_Empty.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),

                    setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 8),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 8),
                    setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 8),
                    setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 8),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64),

                    setStackSize(CircuitList.High_Power_IC_Chip.copy(), 64),
                    setStackSize(CircuitList.Multilayer_Fiber_Reinforced_Circuit_Board.copy(), 1),

                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 5),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 16),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 8))
                .itemOutputs(BatteryList.Lapotronic_Energy_Orb_Cluster)
                .eut(RECIPE_ZPM)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Energy Module"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(BatteryList.Energy_Module_Empty.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 12),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 32),

                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 8),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 2),

                    setStackSize(GemList.Nether_Star.copy(), 12),

                    setStackSize(IngotList.Europium_Ingot.copy(), 16),
                    setStackSize(IngotList.Gallium_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.HSSS_Ingot.copy(), 48),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 4),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 8),

                    setStackSize(IngotList.Naquadah_Ingot.copy(), 16),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 64 * 3 + 32),
                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 48))
                .fluidInputs(
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 16),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 2),
                    setStackSize(GasList.Radon.copy(), 1000 * 17))
                .itemOutputs(BatteryList.Energy_Module_Empty)
                .eut(RECIPE_ZPM)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Energy Module"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),
                    setStackSize(BatteryList.Energy_Module_Empty.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 12),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 32),

                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 8),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 2),

                    setStackSize(GemList.Nether_Star.copy(), 12),

                    setStackSize(IngotList.Europium_Ingot.copy(), 16),
                    setStackSize(IngotList.Gallium_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.HSSS_Ingot.copy(), 48),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 4),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 8),

                    setStackSize(IngotList.Naquadah_Ingot.copy(), 16),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 64 * 3 + 32),
                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 48))
                .fluidInputs(
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 16),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 2),
                    setStackSize(GasList.Radon.copy(), 1000 * 17))
                .itemOutputs(BatteryList.Energy_Module)
                .eut(RECIPE_ZPM)
                .duration(200 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Energy Cluster"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(BatteryList.Energy_Cluster_Empty.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 12),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 32),

                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 16),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 4),
                    setStackSize(CircuitList.HPIC_Wafer.copy(), 64 * 2),

                    setStackSize(GemList.Nether_Star.copy(), 20),

                    setStackSize(IngotList.Europium_Ingot.copy(), 64 * 4 + 32),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 52),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 8),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 + 40),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 32),

                    setStackSize(IngotList.Trinium_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64 * 4))
                .fluidInputs(
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 16),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 6),
                    setStackSize(GasList.Radon.copy(), 1000 * 25))
                .itemOutputs(BatteryList.Energy_Cluster_Empty)
                .eut(RECIPE_UV)
                .duration(100 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Energy Cluster"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),
                    setStackSize(BatteryList.Energy_Cluster_Empty.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 12),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 32),

                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 16),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 4),
                    setStackSize(CircuitList.HPIC_Wafer.copy(), 64 * 2),

                    setStackSize(GemList.Nether_Star.copy(), 20),

                    setStackSize(IngotList.Europium_Ingot.copy(), 64 * 4 + 32),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 52),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 8),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 + 40),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 32),

                    setStackSize(IngotList.Trinium_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64 * 4))
                .fluidInputs(
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 16),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 6),
                    setStackSize(GasList.Radon.copy(), 1000 * 25))
                .itemOutputs(BatteryList.Energy_Cluster)
                .eut(RECIPE_UV)
                .duration(200 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Ultimate Battery"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(BatteryList.Ultimate_Battery_Empty.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 12),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 32),

                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 32),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 8),
                    setStackSize(CircuitList.HPIC_Wafer.copy(), 64 * 2),

                    setStackSize(GemList.Nether_Star.copy(), 36),

                    setStackSize(IngotList.Americium_Ingot.copy(), 64 * 7 + 16),
                    setStackSize(IngotList.Europium_Ingot.copy(), 64),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 3 + 60),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 16),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 2 + 48),

                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 8 + 34),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 3 + 16),

                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 32))
                .fluidInputs(
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 16),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * (64 + 16)),
                    setStackSize(GasList.Radon.copy(), 1000 * 45))
                .itemOutputs(BatteryList.Ultimate_Battery_Empty)
                .eut(RECIPE_UV)
                .duration(150 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Ultimate Battery"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),
                    setStackSize(BatteryList.Ultimate_Battery_Empty.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 12),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 32),

                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 32),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 8),
                    setStackSize(CircuitList.HPIC_Wafer.copy(), 64 * 2),

                    setStackSize(GemList.Nether_Star.copy(), 36),

                    setStackSize(IngotList.Americium_Ingot.copy(), 64 * 7 + 16),
                    setStackSize(IngotList.Europium_Ingot.copy(), 64),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 3 + 60),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 16),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 2 + 48),

                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 8 + 34),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 3 + 16),

                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 32))
                .fluidInputs(
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 16),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * (64 + 16)),
                    setStackSize(GasList.Radon.copy(), 1000 * 45))
                .itemOutputs(BatteryList.Ultimate_Battery)
                .eut(RECIPE_UV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Really Ultimate Battery"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(BatteryList.Really_Ultimate_Battery_Empty.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 12),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 32),

                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 32),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 16),
                    setStackSize(CircuitList.UHPIC_Wafer.copy(), 64 * 2),

                    setStackSize(GemList.Nether_Star.copy(), 64 + 8),

                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 2 + 48),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 2 + 24),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 5 + 4),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 32),

                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 6 + 4),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 14 + 16),

                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 2))
                .fluidInputs(
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 32),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 32),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 32),
                    setStackSize(GasList.Radon.copy(), 1000 * (64 + 26)))
                .itemOutputs(BatteryList.Really_Ultimate_Battery_Empty)
                .eut(RECIPE_UHV)
                .duration(200 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Really Ultimate Battery"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),
                    setStackSize(BatteryList.Really_Ultimate_Battery_Empty.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 12),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 32),

                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 32),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 16),
                    setStackSize(CircuitList.UHPIC_Wafer.copy(), 64 * 2),

                    setStackSize(GemList.Nether_Star.copy(), 64 + 8),

                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 2 + 48),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 2 + 24),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 5 + 4),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 32),

                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 6 + 4),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 14 + 16),

                    setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 2))
                .fluidInputs(
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 32),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 32),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 32),
                    setStackSize(GasList.Radon.copy(), 1000 * (64 + 26)))
                .itemOutputs(BatteryList.Really_Ultimate_Battery)
                .eut(RECIPE_UHV)
                .duration(400 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Extremely Ultimate Battery"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(BatteryList.Extremely_Ultimate_Battery_Empty.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 12),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 32),

                    setStackSize(CircuitList.ASoC_Wafer.copy(), 64),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 32),
                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),
                    setStackSize(CircuitList.PPIC_Wafer.copy(), 64 * 2),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 2 + 16),

                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 64 * 2 + 48),
                    setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64 * 10),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 4 + 32),

                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 4 + 32),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 7 + 2),
                    setStackSize(IngotList.Tritanium_Ingot.copy(), 64 * 2),

                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 4))
                .fluidInputs(
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 32),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 6 + 4)),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64),
                    setStackSize(GasList.Radon.copy(), 1000 * (64 * 3 + 24)))
                .itemOutputs(BatteryList.Extremely_Ultimate_Battery_Empty)
                .eut(RECIPE_UEV)
                .duration(250 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Extremely Ultimate Battery"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),
                    setStackSize(BatteryList.Extremely_Ultimate_Battery_Empty.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 12),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 32),

                    setStackSize(CircuitList.ASoC_Wafer.copy(), 64),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 32),
                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),
                    setStackSize(CircuitList.PPIC_Wafer.copy(), 64 * 2),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 2 + 16),

                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 64 * 2 + 48),
                    setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64 * 10),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 4 + 32),

                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 4 + 32),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 7 + 2),
                    setStackSize(IngotList.Tritanium_Ingot.copy(), 64 * 2),

                    setStackSize(WireList.Superconductor_UEV_Wire_1x.copy(), 64 * 4))
                .fluidInputs(
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 32),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 6 + 4)),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64),
                    setStackSize(GasList.Radon.copy(), 1000 * (64 * 3 + 24)))
                .itemOutputs(BatteryList.Extremely_Ultimate_Battery)
                .eut(RECIPE_UEV)
                .duration(500 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Insanely Ultimate Battery"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(BatteryList.Insanely_Ultimate_Battery_Empty.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 12),

                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 64),
                    setStackSize(CircuitList.Living_Crystal_Chip.copy(), 64),
                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),
                    setStackSize(CircuitList.Optical_SMD_Inductor.copy(), 32),
                    setStackSize(CircuitList.QPIC_Wafer.copy(), 64 * 2),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 18 + 32),

                    setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 * 3 + 8),
                    setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 64 * 2),

                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 10),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 2),

                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 4 + 16),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 8))
                .fluidInputs(
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 32),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 7 + 4)),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64 * 2))
                .itemOutputs(BatteryList.Insanely_Ultimate_Battery_Empty)
                .eut(RECIPE_UIV)
                .duration(300 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Insanely Ultimate Battery"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),
                    setStackSize(BatteryList.Insanely_Ultimate_Battery_Empty.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 12),

                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 64),
                    setStackSize(CircuitList.Living_Crystal_Chip.copy(), 64),
                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),
                    setStackSize(CircuitList.Optical_SMD_Inductor.copy(), 32),
                    setStackSize(CircuitList.QPIC_Wafer.copy(), 64 * 2),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 18 + 32),

                    setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 * 3 + 8),
                    setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 64 * 2),

                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 10),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 2),

                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 4 + 16),
                    setStackSize(WireList.Superconductor_UIV_Wire_1x.copy(), 64 * 8))
                .fluidInputs(
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 32),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 7 + 4)),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64 * 2))
                .itemOutputs(BatteryList.Insanely_Ultimate_Battery)
                .eut(RECIPE_UIV)
                .duration(600 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Mega Ultimate Battery"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(1),
                    setStackSize(BatteryList.Mega_Ultimate_Battery_Empty.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 12),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 32),

                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 128),
                    setStackSize(CircuitList.FPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Living_Bio_Chip.copy(), 64),
                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),
                    setStackSize(CircuitList.Optical_SMD_Inductor.copy(), 64),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 20),

                    setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 * 7 + 8),
                    setStackSize(IngotList.Dragonblood_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 64 * 11 + 8),

                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 + 16),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 2 + 48),
                    setStackSize(IngotList.Quantum_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 4 + 16),
                    setStackSize(IngotList.Titansteel_Ingot.copy(), 64 * 2),

                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 64 * 64))
                .fluidInputs(
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 32),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 9 + 4)),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64 * 4))
                .itemOutputs(BatteryList.Mega_Ultimate_Battery_Empty)
                .eut(RECIPE_UMV)
                .duration(360 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Mega Ultimate Battery"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(2),
                    setStackSize(BatteryList.Mega_Ultimate_Battery_Empty.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 12),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 32),

                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 128),
                    setStackSize(CircuitList.FPIC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Living_Bio_Chip.copy(), 64),
                    setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64),
                    setStackSize(CircuitList.Optical_SMD_Inductor.copy(), 64),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 20),

                    setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 * 7 + 8),
                    setStackSize(IngotList.Dragonblood_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 64 * 11 + 8),

                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 + 16),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 2 + 48),
                    setStackSize(IngotList.Quantum_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 4 + 16),
                    setStackSize(IngotList.Titansteel_Ingot.copy(), 64 * 2),

                    setStackSize(WireList.Superconductor_UMV_Wire_1x.copy(), 64 * 64))
                .fluidInputs(
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 32),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 9 + 4)),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64 * 4))
                .itemOutputs(BatteryList.Mega_Ultimate_Battery)
                .eut(RECIPE_UMV)
                .duration(720 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // Fluid Storage Core
        {
            // "Fluid Storage Core T3"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T3.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),

                    setStackSize(GTItemList.Electric_Pump_HV.copy(), 12),
                    setStackSize(GTItemList.Electric_Pump_IV.copy(), 1),
                    setStackSize(GTItemList.Field_Generator_EV.copy(), 1),

                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 16),
                    setStackSize(IngotList.Osmium_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Polycaprolactam_PCL_Bar.copy(), 8),
                    setStackSize(IngotList.Rhodium_Plated_Palladium_Ingot.copy(), 8),
                    setStackSize(IngotList.Stainless_Steel_Ingot.copy(), 36),

                    setStackSize(IngotList.Steel_Ingot.copy(), 52),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 8))
                .fluidInputs(setStackSize(FluidList.Lubricant.copy(), 1000 * 4))
                .itemOutputs(GoodGeneratorList.Fluid_Storage_Core_T3)
                .eut(RECIPE_LuV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Fluid Storage Core T4"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T4.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 16),

                    setStackSize(GTItemList.Electric_Pump_EV.copy(), 8),
                    setStackSize(GTItemList.Electric_Pump_HV.copy(), 16),
                    setStackSize(GTItemList.Electric_Pump_IV.copy(), 4),
                    setStackSize(GTItemList.Field_Generator_EV.copy(), 4),

                    setStackSize(IngotList.Europium_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Rhodium_Plated_Palladium_Ingot.copy(), 32),
                    setStackSize(IngotList.Steel_Ingot.copy(), 64 * 3 + 16),
                    setStackSize(IngotList.Styrene_Butadiene_Rubber_SBR_Bar.copy(), 16),

                    setStackSize(IngotList.Titanium_Ingot.copy(), 36),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 64 * 6 + 32))
                .fluidInputs(setStackSize(FluidList.Lubricant.copy(), 1000 * 16))
                .itemOutputs(GoodGeneratorList.Fluid_Storage_Core_T4)
                .eut(RECIPE_ZPM)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Fluid Storage Core T5"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T5.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 64 * 2),

                    setStackSize(GemList.Nether_Star.copy(), 48),

                    setStackSize(GTItemList.Electric_Pump_HV.copy(), 64),
                    setStackSize(GTItemList.Electric_Pump_IV.copy(), 8),

                    setStackSize(IngotList.Draconium_Ingot.copy(), 16),
                    setStackSize(IngotList.Enderium_Ingot.copy(), 48),
                    setStackSize(IngotList.Gallium_Ingot.copy(), 64 * 24),
                    setStackSize(IngotList.HSSS_Ingot.copy(), 64 * 5 + 8),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 3 + 16),

                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 40),
                    setStackSize(IngotList.Mysterious_Crystal_Ingot.copy(), 36),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 16),
                    setStackSize(IngotList.Osmium_Ingot.copy(), 64),

                    setStackSize(IngotList.Polycaprolactam_PCL_Bar.copy(), 64 + 56),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 64 * 16),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 8),
                    setStackSize(IngotList.Steel_Ingot.copy(), 64 * 13),
                    setStackSize(IngotList.Titanium_Ingot.copy(), 64 * 12 + 2),

                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 64 * 3 + 16))
                .fluidInputs(
                    setStackSize(FluidList.Lubricant.copy(), 1000 * (64 + 12)),
                    setStackSize(GasList.Radon.copy(), 1000 * (64 + 4)))
                .itemOutputs(GoodGeneratorList.Fluid_Storage_Core_T5)
                .eut(RECIPE_UV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Fluid Storage Core T6"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T6.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 64),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 64 * 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 64 * 2),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 2 + 32),

                    setStackSize(GTItemList.Electric_Piston_IV.copy(), 64 * 2),
                    setStackSize(GTItemList.Electric_Pump_HV.copy(), 64),

                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 64 * 2 + 16),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 16),
                    setStackSize(IngotList.Enderium_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Europium_Ingot.copy(), 64 * 38 + 32),
                    setStackSize(IngotList.HSSS_Ingot.copy(), 64 + 56),

                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 13 + 16),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 2 + 52),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 + 24),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 16),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 64 + 32),

                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 16),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Polytetrafluoroethylene_PTFE_Bar.copy(), 64 * 2),

                    setStackSize(IngotList.Ruridit_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 40),
                    setStackSize(IngotList.Steel_Ingot.copy(), 64 * 13),
                    setStackSize(IngotList.Titanium_Ingot.copy(), 2),
                    setStackSize(IngotList.Trinium_Ingot.copy(), 64 * 48),

                    setStackSize(IngotList.Tungsten_Ingot.copy(), 64),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64 * 34),
                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 16))
                .fluidInputs(
                    setStackSize(FluidList.Lubricant.copy(), 1000 * (64 * 2 + 12)),
                    setStackSize(GasList.Radon.copy(), 1000 * (64 * 3 + 8)))
                .itemOutputs(GoodGeneratorList.Fluid_Storage_Core_T6)
                .eut(RECIPE_UHV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Fluid Storage Core T7"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T7.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 64 * 2 + 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 64 * 2 + 2),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 64 * 8),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 5),

                    setStackSize(GTItemList.Electric_Pump_HV.copy(), 64 * 4),

                    setStackSize(IngotList.Americium_Ingot.copy(), 64 * 22 + 32),
                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 64 * 2 + 16),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 2 + 12),

                    setStackSize(IngotList.Crystal_Matrix_Ingot.copy(), 20),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 64 * 2 + 32),
                    setStackSize(IngotList.Enderium_Ingot.copy(), 64 * 3 + 48),
                    setStackSize(IngotList.Europium_Ingot.copy(), 64 * 80),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 2),

                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 34),
                    setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 48),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 * 3 + 36),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 37 + 12),

                    setStackSize(IngotList.Naquadah_Ingot.copy(), 64 * 3),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 6 + 48),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 10 + 8),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Osmium_Ingot.copy(), 8),

                    setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 2),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 2 + 21),
                    setStackSize(IngotList.Steel_Ingot.copy(), 64 * 52),
                    setStackSize(IngotList.Trinium_Ingot.copy(), 64 * 96),
                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64 * 69))
                .fluidInputs(
                    setStackSize(FluidList.Lubricant.copy(), 1000 * (64 * 3 + 60)),
                    setStackSize(GasList.Radon.copy(), 1000 * (64 * 6 + 16)))
                .itemOutputs(GoodGeneratorList.Fluid_Storage_Core_T7)
                .eut(RECIPE_UEV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Fluid Storage Core T8"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T8.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 64 * 4 + 8),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 64 * 4 + 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 64 * 16),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 10),

                    setStackSize(GTItemList.Electric_Pump_HV.copy(), 64 * 4),

                    setStackSize(IngotList.Americium_Ingot.copy(), 64 * 51),
                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 64 * 2 + 16),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 4 + 24),

                    setStackSize(IngotList.Crystal_Matrix_Ingot.copy(), 40),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Enderium_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.Europium_Ingot.copy(), 64 * 154),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 4),

                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 71 + 56),
                    setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 40),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 3),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 * 7 + 8),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 72 + 24),

                    setStackSize(IngotList.Naquadah_Ingot.copy(), 64 * 7 + 32),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 15 + 34),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 27 + 54),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 64 * 16),
                    setStackSize(IngotList.Osmium_Ingot.copy(), 16),

                    setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 4),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 12 + 32),
                    setStackSize(IngotList.Steel_Ingot.copy(), 64 * 52),
                    setStackSize(IngotList.Trinium_Ingot.copy(), 64 * 192),
                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64 * 136))
                .fluidInputs(
                    setStackSize(FluidList.Lubricant.copy(), 1000 * (64 * 3)),
                    setStackSize(GasList.Radon.copy(), 1000 * (64 * 71 + 16)))
                .itemOutputs(GoodGeneratorList.Fluid_Storage_Core_T8)
                .eut(RECIPE_UIV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Fluid Storage Core T9"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T9.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 40),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 64 * 2 + 4),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 2 + 16),

                    setStackSize(GTItemList.Electric_Pump_HV.copy(), 64 * 4),

                    setStackSize(IngotList.Americium_Ingot.copy(), 64 * 81 + 16),
                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 5),
                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 8 + 56),

                    setStackSize(IngotList.Crystal_Matrix_Ingot.copy(), 40),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 4),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 37 + 50),
                    setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 40),

                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 7 + 20),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 * 3 + 40),
                    setStackSize(IngotList.Mysterious_Crystal_Ingot.copy(), 48),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 18 + 40),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 64 + 32),

                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 54 + 48),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 41 + 32),
                    setStackSize(IngotList.Osmium_Ingot.copy(), 16),
                    setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 4),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 11 + 32),

                    setStackSize(IngotList.Steel_Ingot.copy(), 64 * 52),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 10))
                .fluidInputs(
                    setStackSize(FluidList.Lubricant.copy(), 1000 * (64 * 9 + 32)),
                    setStackSize(GasList.Radon.copy(), 1000 * (64 * 2 + 52)))
                .itemOutputs(GoodGeneratorList.Fluid_Storage_Core_T9)
                .eut(RECIPE_UMV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Fluid Storage Core T10"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GoodGeneratorList.Fluid_Storage_Core_T10.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 64 + 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 64 + 20),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 64 * 4 + 24),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 2 + 4),

                    setStackSize(GTItemList.Electric_Pump_HV.copy(), 64 * 4),

                    setStackSize(IngotList.Americium_Ingot.copy(), 64 * 157 + 2),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 18 + 40),

                    setStackSize(IngotList.Crystal_Matrix_Ingot.copy(), 64 + 16),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 64 * 5),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 8),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 67 + 38),
                    setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64 + 56),

                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 12 + 56),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 * 6 + 26),
                    setStackSize(IngotList.Mysterious_Crystal_Ingot.copy(), 64 + 38),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 38 + 16),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 64 * 3 + 12),

                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 104 + 19),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 66),
                    setStackSize(IngotList.Osmium_Ingot.copy(), 32),
                    setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 8),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 4 + 56),

                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 23 + 4),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 8),
                    setStackSize(IngotList.Steel_Ingot.copy(), 64 * 52),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 30))
                .fluidInputs(
                    setStackSize(FluidList.Lubricant.copy(), 1000 * (64 * 16 + 44)),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 4 + 32)),
                    setStackSize(GasList.Radon.copy(), 1000 * (64 * 6)))
                .itemOutputs(GoodGeneratorList.Fluid_Storage_Core_T10)
                .eut(RECIPE_UXV)
                .duration(20 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // "Gravitation Engine"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(GTItemList.Gravitation_Engine.copy(), 0),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.EV, 8),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.HV, 16),

                setStackSize(CircuitList.Power_IC_Chip.copy(), 2),
                setStackSize(CircuitList.SMD_Inductor.copy(), 8),

                setStackSize(GemList.Diamond.copy(), 6),
                setStackSize(GemList.Lapis_Lazuli.copy(), 16),

                setStackSize(IngotList.Aluminium_Ingot.copy(), 64 + 8),
                setStackSize(IngotList.Bronze_Ingot.copy(), 32),
                setStackSize(IngotList.Callisto_Ice_Ingot.copy(), 2),
                setStackSize(IngotList.Copper_Ingot.copy(), 64 * 5 + 16),
                setStackSize(IngotList.Gold_Ingot.copy(), 10),

                setStackSize(IngotList.Iron_Ingot.copy(), 36),
                setStackSize(IngotList.Lead_Ingot.copy(), 36),
                setStackSize(IngotList.Magnetic_Steel_Ingot.copy(), 6),
                setStackSize(IngotList.Polyethylene_PE_Bar.copy(), 8),
                setStackSize(IngotList.Polytetrafluoroethylene_PTFE_Bar.copy(), 2),

                setStackSize(IngotList.Silver_Ingot.copy(), 40),
                setStackSize(IngotList.Stainless_Steel_Ingot.copy(), 3),
                setStackSize(IngotList.Tin_Ingot.copy(), 46),
                setStackSize(IngotList.Tungsten_Ingot.copy(), 3),
                setStackSize(IngotList.Tungstensteel_Ingot.copy(), 8),

                setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 1),

                setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 24))
            .itemOutputs(GTItemList.Gravitation_Engine)
            .eut(RECIPE_HV)
            .duration(5 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // GT Part Items
        {
            // LuV
            {
                // "Electric Motor (LuV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Motor_LuV.copy(), 0),

                        setStackSize(IngotList.HSSS_Ingot.copy(), 2),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 1),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 1),
                        setStackSize(IngotList.Ruridit_Ingot.copy(), 16),
                        setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 1))
                    .fluidInputs(setStackSize(FluidList.Lubricant.copy(), 250))
                    .itemOutputs(GTItemList.Electric_Motor_LuV)
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Electric Pump (LuV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Pump_LuV.copy(), 0),

                        setStackSize(IngotList.HSSS_Ingot.copy(), 15),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 2),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 1),
                        setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 2),
                        setStackSize(IngotList.Ruridit_Ingot.copy(), 16),

                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 1),
                        setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 2))
                    .fluidInputs(setStackSize(FluidList.Lubricant.copy(), 500))
                    .itemOutputs(GTItemList.Electric_Pump_LuV)
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Conveyor Module (LuV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Conveyor_Module_LuV.copy(), 0),

                        setStackSize(IngotList.HSSS_Ingot.copy(), 11),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 3),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 2),
                        setStackSize(IngotList.Ruridit_Ingot.copy(), 32),
                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 10),
                        setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 3))
                    .fluidInputs(setStackSize(FluidList.Lubricant.copy(), 750))
                    .itemOutputs(GTItemList.Conveyor_Module_LuV)
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Electric Piston (LuV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Piston_LuV.copy(), 0),

                        setStackSize(IngotList.HSSS_Ingot.copy(), 21),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 2),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 1),
                        setStackSize(IngotList.Ruridit_Ingot.copy(), 16),
                        setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 3))
                    .fluidInputs(setStackSize(FluidList.Lubricant.copy(), 500))
                    .itemOutputs(GTItemList.Electric_Piston_LuV)
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Robot Arm (LuV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Robot_Arm_LuV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.EV, 8),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 2),

                        setStackSize(IngotList.HSSS_Ingot.copy(), 36),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 8),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 3),
                        setStackSize(IngotList.Ruridit_Ingot.copy(), 48),
                        setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 8))
                    .fluidInputs(setStackSize(FluidList.Lubricant.copy(), 1000 + 250))
                    .itemOutputs(GTItemList.Robot_Arm_LuV)
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Field Generator (LuV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Field_Generator_LuV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 16),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),

                        setStackSize(GemList.Nether_Star.copy(), 6),

                        setStackSize(IngotList.Gallium_Ingot.copy(), 64 * 3),
                        setStackSize(IngotList.HSSS_Ingot.copy(), 24),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 24),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 4),
                        setStackSize(IngotList.Ruridit_Ingot.copy(), 64 + 48),

                        setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 24))
                    .fluidInputs(
                        setStackSize(FluidList.Lubricant.copy(), 1000),
                        setStackSize(GasList.Radon.copy(), 1000 * 8 + 500))
                    .itemOutputs(GTItemList.Field_Generator_LuV)
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Emitter (LuV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Emitter_LuV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),

                        setStackSize(GemList.Nether_Star.copy(), 1),

                        setStackSize(IngotList.Gallium_Ingot.copy(), 48),
                        setStackSize(IngotList.HSSS_Ingot.copy(), 4),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 5),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 1),
                        setStackSize(IngotList.Ruridit_Ingot.copy(), 20),

                        setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 5))
                    .fluidInputs(
                        setStackSize(FluidList.Lubricant.copy(), 250),
                        setStackSize(GasList.Radon.copy(), 1000 + 250))
                    .itemOutputs(GTItemList.Emitter_LuV)
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Sensor (LuV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Sensor_LuV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),

                        setStackSize(GemList.Nether_Star.copy(), 1),

                        setStackSize(IngotList.Gallium_Ingot.copy(), 48),
                        setStackSize(IngotList.HSSS_Ingot.copy(), 4),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 5),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 1),
                        setStackSize(IngotList.Ruridit_Ingot.copy(), 24),

                        setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 5))
                    .fluidInputs(
                        setStackSize(FluidList.Lubricant.copy(), 250),
                        setStackSize(GasList.Radon.copy(), 1000 + 250))
                    .itemOutputs(GTItemList.Sensor_LuV)
                    .eut(RECIPE_IV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);
            }

            // ZPM
            {
                // "Electric Motor (ZPM)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Motor_ZPM.copy(), 0),

                        setStackSize(IngotList.Europium_Ingot.copy(), 24),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 2),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 1),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 7),
                        setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 4))
                    .fluidInputs(setStackSize(FluidList.Lubricant.copy(), 750))
                    .itemOutputs(GTItemList.Electric_Motor_ZPM)
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Electric Pump (ZPM)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 0),

                        setStackSize(IngotList.Enderium_Ingot.copy(), 6),
                        setStackSize(IngotList.Europium_Ingot.copy(), 24),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 4),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 1),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 20),

                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 2),
                        setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 8))
                    .fluidInputs(setStackSize(FluidList.Lubricant.copy(), 1000 + 500))
                    .itemOutputs(GTItemList.Electric_Pump_ZPM)
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Conveyor Module (ZPM)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Conveyor_Module_ZPM.copy(), 0),

                        setStackSize(IngotList.Europium_Ingot.copy(), 48),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 6),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 2),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 21),
                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 20),
                        setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 12))
                    .fluidInputs(setStackSize(FluidList.Lubricant.copy(), 1000 * 2 + 250))
                    .itemOutputs(GTItemList.Conveyor_Module_ZPM)
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Electric Piston (ZPM)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Piston_ZPM.copy(), 0),

                        setStackSize(IngotList.Europium_Ingot.copy(), 24),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 4),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 1),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 26),
                        setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 12))
                    .fluidInputs(setStackSize(FluidList.Lubricant.copy(), 1000 + 500))
                    .itemOutputs(GTItemList.Electric_Piston_ZPM)
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Robot Arm (ZPM)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Robot_Arm_ZPM.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 8),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 2),

                        setStackSize(IngotList.Europium_Ingot.copy(), 64 + 8),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 16),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 3),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 51),
                        setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 32))
                    .fluidInputs(setStackSize(FluidList.Lubricant.copy(), 1000 * 3 + 750))
                    .itemOutputs(GTItemList.Robot_Arm_ZPM)
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Field Generator (ZPM)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Field_Generator_ZPM.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 16),

                        setStackSize(GemList.Nether_Star.copy(), 10),

                        setStackSize(IngotList.Europium_Ingot.copy(), 64 * 2),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 48),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 4),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 44),
                        setStackSize(IngotList.Osmiridium_Ingot.copy(), 16),

                        setStackSize(IngotList.Trinium_Ingot.copy(), 64 * 3),
                        setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64 * 2))
                    .fluidInputs(
                        setStackSize(FluidList.Lubricant.copy(), 1000 * 3),
                        setStackSize(GasList.Radon.copy(), 1000 * 12 + 500))
                    .itemOutputs(GTItemList.Field_Generator_ZPM)
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Emitter (ZPM)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Emitter_ZPM.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),

                        setStackSize(GemList.Nether_Star.copy(), 2),

                        setStackSize(IngotList.Europium_Ingot.copy(), 24),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 10),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 1),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 9),
                        setStackSize(IngotList.Osmiridium_Ingot.copy(), 4),

                        setStackSize(IngotList.Trinium_Ingot.copy(), 48),
                        setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 28))
                    .fluidInputs(
                        setStackSize(FluidList.Lubricant.copy(), 750),
                        setStackSize(GasList.Radon.copy(), 1000 * 2 + 500))
                    .itemOutputs(GTItemList.Emitter_ZPM)
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Sensor (ZPM)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Sensor_ZPM.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),

                        setStackSize(GemList.Nether_Star.copy(), 2),

                        setStackSize(IngotList.Europium_Ingot.copy(), 24),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 10),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 1),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 9),
                        setStackSize(IngotList.Osmiridium_Ingot.copy(), 8),

                        setStackSize(IngotList.Trinium_Ingot.copy(), 48),
                        setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 18))
                    .fluidInputs(
                        setStackSize(FluidList.Lubricant.copy(), 750),
                        setStackSize(GasList.Radon.copy(), 1000 * 2 + 500))
                    .itemOutputs(GTItemList.Sensor_ZPM)
                    .eut(RECIPE_LuV)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);
            }

            // UV
            {
                // "Electric Motor (UV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Motor_UV.copy(), 0),

                        setStackSize(IngotList.Americium_Ingot.copy(), 48),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 9),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 2),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 4),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 9),

                        setStackSize(IngotList.Neutronium_Ingot.copy(), 9))
                    .fluidInputs(setStackSize(FluidList.Lubricant.copy(), 1000 * 2))
                    .itemOutputs(GTItemList.Electric_Motor_UV)
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Electric Pump (UV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Pump_UV.copy(), 0),

                        setStackSize(IngotList.Americium_Ingot.copy(), 48),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 18),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 2),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 8),
                        setStackSize(IngotList.Naquadah_Ingot.copy(), 12),

                        setStackSize(IngotList.Naquadria_Ingot.copy(), 18),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 22),
                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 4))
                    .fluidInputs(setStackSize(FluidList.Lubricant.copy(), 1000 * 4))
                    .itemOutputs(GTItemList.Electric_Pump_UV)
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Conveyor Module (UV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Conveyor_Module_UV.copy(), 0),

                        setStackSize(IngotList.Americium_Ingot.copy(), 64 + 32),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 27),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 4),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 12),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 27),

                        setStackSize(IngotList.Neutronium_Ingot.copy(), 25),
                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 40))
                    .fluidInputs(setStackSize(FluidList.Lubricant.copy(), 1000 * 6))
                    .itemOutputs(GTItemList.Conveyor_Module_UV)
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Electric Piston (UV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Piston_UV.copy(), 0),

                        setStackSize(IngotList.Americium_Ingot.copy(), 48),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 18),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 2),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 12),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 18),

                        setStackSize(IngotList.Neutronium_Ingot.copy(), 28))
                    .fluidInputs(setStackSize(FluidList.Lubricant.copy(), 1000 * 4))
                    .itemOutputs(GTItemList.Electric_Piston_UV)
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Robot Arm (UV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Robot_Arm_UV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 8),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 2),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),

                        setStackSize(IngotList.Americium_Ingot.copy(), 64 * 2 + 16),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 52),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 6),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 32),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 45),

                        setStackSize(IngotList.Neutronium_Ingot.copy(), 57))
                    .fluidInputs(setStackSize(FluidList.Lubricant.copy(), 1000 * 10))
                    .itemOutputs(GTItemList.Robot_Arm_UV)
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Field Generator (UV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Field_Generator_UV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 16),

                        setStackSize(GemList.Nether_Star.copy(), 18),

                        setStackSize(IngotList.Americium_Ingot.copy(), 64 * 3 + 48),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 52),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 8),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 + 24),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 4 + 17),

                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 + 40))
                    .fluidInputs(
                        setStackSize(FluidList.Lubricant.copy(), 1000 * 40),
                        setStackSize(GasList.Radon.copy(), 1000 * 22 + 500))
                    .itemOutputs(GTItemList.Field_Generator_UV)
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Emitter (UV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Emitter_UV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),

                        setStackSize(GemList.Nether_Star.copy(), 4),

                        setStackSize(IngotList.Americium_Ingot.copy(), 48),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 25),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 2),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 18),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 64 + 2),

                        setStackSize(IngotList.Neutronium_Ingot.copy(), 23))
                    .fluidInputs(
                        setStackSize(FluidList.Lubricant.copy(), 1000 * 10),
                        setStackSize(GasList.Radon.copy(), 1000 * 5))
                    .itemOutputs(GTItemList.Emitter_UV)
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Sensor (UV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Sensor_UV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),

                        setStackSize(GemList.Nether_Star.copy(), 4),

                        setStackSize(IngotList.Americium_Ingot.copy(), 48),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 25),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 2),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 18),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 64 + 2),

                        setStackSize(IngotList.Neutronium_Ingot.copy(), 27))
                    .fluidInputs(
                        setStackSize(FluidList.Lubricant.copy(), 1000 * 10),
                        setStackSize(GasList.Radon.copy(), 1000 * 5))
                    .itemOutputs(GTItemList.Sensor_UV)
                    .eut(RECIPE_ZPM)
                    .duration(30 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);
            }

            // UHV
            {
                // "Electric Motor (UHV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Motor_UHV.copy(), 0),

                        setStackSize(IngotList.Bedrockium_Ingot.copy(), 4),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 11),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 18),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 4),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 18),

                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64))
                    .fluidInputs(setStackSize(FluidList.Lubricant.copy(), 1000 * 4))
                    .itemOutputs(GTItemList.Electric_Motor_UHV)
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Electric Pump (UHV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Pump_UHV.copy(), 0),

                        setStackSize(IngotList.Bedrockium_Ingot.copy(), 8),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 36),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 39),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 4),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 39),

                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 + 12),
                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 8))
                    .fluidInputs(setStackSize(FluidList.Lubricant.copy(), 1000 * 8))
                    .itemOutputs(GTItemList.Electric_Pump_UHV)
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Conveyor Module (UHV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Conveyor_Module_UHV.copy(), 0),

                        setStackSize(IngotList.Bedrockium_Ingot.copy(), 12),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 28),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 54),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 8),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 54),

                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 2),
                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 40))
                    .fluidInputs(setStackSize(FluidList.Lubricant.copy(), 1000 * 12))
                    .itemOutputs(GTItemList.Conveyor_Module_UHV)
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Electric Piston (UHV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Piston_UHV.copy(), 0),

                        setStackSize(IngotList.Bedrockium_Ingot.copy(), 8),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 43),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 39),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 4),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 39),

                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64))
                    .fluidInputs(setStackSize(FluidList.Lubricant.copy(), 1000 * 8))
                    .itemOutputs(GTItemList.Electric_Piston_UHV)
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Robot Arm (UHV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Robot_Arm_UHV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 2),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 8),

                        setStackSize(IngotList.Bedrockium_Ingot.copy(), 28),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 + 23),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 26),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 12),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 64 + 26),

                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 3))
                    .fluidInputs(setStackSize(FluidList.Lubricant.copy(), 1000 * 20))
                    .itemOutputs(GTItemList.Robot_Arm_UHV)
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Field Generator (UHV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Field_Generator_UHV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 16),

                        setStackSize(GemList.Nether_Star.copy(), 36),

                        setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 + 24),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 + 12),
                        setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 4),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 2 + 34),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 16),

                        setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 2 + 34),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 6 + 8))
                    .fluidInputs(
                        setStackSize(FluidList.Lubricant.copy(), 1000 * 16),
                        setStackSize(GasList.Radon.copy(), 1000 * 45))
                    .itemOutputs(GTItemList.Field_Generator_UHV)
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Emitter (UHV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Emitter_UHV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),

                        setStackSize(GemList.Nether_Star.copy(), 8),

                        setStackSize(IngotList.Bedrockium_Ingot.copy(), 18),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 17),
                        setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 39),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 4),

                        setStackSize(IngotList.Naquadria_Ingot.copy(), 39),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 + 16))
                    .fluidInputs(
                        setStackSize(FluidList.Lubricant.copy(), 1000 * 4),
                        setStackSize(GasList.Radon.copy(), 1000 * 10))
                    .itemOutputs(GTItemList.Emitter_UHV)
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Sensor (UHV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Sensor_UHV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),

                        setStackSize(GemList.Nether_Star.copy(), 8),

                        setStackSize(IngotList.Bedrockium_Ingot.copy(), 18),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 21),
                        setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 39),
                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 4),

                        setStackSize(IngotList.Naquadria_Ingot.copy(), 39),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 + 16))
                    .fluidInputs(
                        setStackSize(FluidList.Lubricant.copy(), 1000 * 4),
                        setStackSize(GasList.Radon.copy(), 1000 * 10))
                    .itemOutputs(GTItemList.Sensor_UHV)
                    .eut(RECIPE_UV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);
            }

            // UEV
            {
                // "Electric Motor (UEV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Motor_UEV.copy(), 0),

                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 8),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64),
                        setStackSize(IngotList.Draconium_Ingot.copy(), 4),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 24),
                        setStackSize(IngotList.Quantium_Ingot.copy(), 18))
                    .fluidInputs(
                        setStackSize(FluidList.Lubricant.copy(), 1000 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 18))
                    .itemOutputs(GTItemList.Electric_Motor_UEV)
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Electric Pump (UEV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Pump_UEV.copy(), 0),

                        setStackSize(GemList.Nether_Star.copy(), 12),

                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 8),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64),
                        setStackSize(IngotList.Draconium_Ingot.copy(), 8),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 50),
                        setStackSize(IngotList.Quantium_Ingot.copy(), 39),

                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 16))
                    .fluidInputs(
                        setStackSize(FluidList.Lubricant.copy(), 1000 * 8),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 36))
                    .itemOutputs(GTItemList.Electric_Pump_UEV)
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Conveyor Module (UEV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Conveyor_Module_UEV.copy(), 0),

                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 16),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 2),
                        setStackSize(IngotList.Draconium_Ingot.copy(), 12),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 56),
                        setStackSize(IngotList.Quantium_Ingot.copy(), 54),

                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 2))
                    .fluidInputs(
                        setStackSize(FluidList.Lubricant.copy(), 1000 * 12),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 54))
                    .itemOutputs(GTItemList.Conveyor_Module_UEV)
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Electric Piston (UEV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Piston_UEV.copy(), 0),

                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 8),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64),
                        setStackSize(IngotList.Draconium_Ingot.copy(), 12),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 56),
                        setStackSize(IngotList.Quantium_Ingot.copy(), 39))
                    .fluidInputs(
                        setStackSize(FluidList.Lubricant.copy(), 1000 * 8),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 36))
                    .itemOutputs(GTItemList.Electric_Piston_UEV)
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Robot Arm (UEV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Robot_Arm_UEV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 2),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 8),

                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 24),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 3),
                        setStackSize(IngotList.Draconium_Ingot.copy(), 32),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 64 + 62),
                        setStackSize(IngotList.Quantium_Ingot.copy(), 64 + 26))
                    .fluidInputs(
                        setStackSize(FluidList.Lubricant.copy(), 1000 * 20),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 + 26)))
                    .itemOutputs(GTItemList.Robot_Arm_UEV)
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Field Generator (UEV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Field_Generator_UEV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 16),

                        setStackSize(GemList.Nether_Star.copy(), 64 + 8),

                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 32),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 4),
                        setStackSize(IngotList.Draconium_Ingot.copy(), 64 + 24),
                        setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64 * 4),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 2 + 16),

                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 2 + 16),
                        setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 2 + 34),
                        setStackSize(IngotList.Tritanium_Ingot.copy(), 64))
                    .fluidInputs(
                        setStackSize(FluidList.Lubricant.copy(), 1000 * 16),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 2 + 34)),
                        setStackSize(GasList.Radon.copy(), 1000 * (64 + 44)))
                    .itemOutputs(GTItemList.Field_Generator_UEV)
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Emitter (UEV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Emitter_UEV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),

                        setStackSize(GemList.Nether_Star.copy(), 16),

                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 8),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64),
                        setStackSize(IngotList.Draconium_Ingot.copy(), 18),
                        setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 34),

                        setStackSize(IngotList.Neutronium_Ingot.copy(), 32),
                        setStackSize(IngotList.Quantium_Ingot.copy(), 36))
                    .fluidInputs(
                        setStackSize(FluidList.Lubricant.copy(), 1000 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 36),
                        setStackSize(GasList.Radon.copy(), 1000 * 24))
                    .itemOutputs(GTItemList.Emitter_UEV)
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Sensor (UEV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Sensor_UEV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),

                        setStackSize(GemList.Nether_Star.copy(), 16),

                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 8),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64),
                        setStackSize(IngotList.Draconium_Ingot.copy(), 18),
                        setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 34),

                        setStackSize(IngotList.Neutronium_Ingot.copy(), 32),
                        setStackSize(IngotList.Quantium_Ingot.copy(), 39))
                    .fluidInputs(
                        setStackSize(FluidList.Lubricant.copy(), 1000 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 36),
                        setStackSize(GasList.Radon.copy(), 1000 * 24))
                    .itemOutputs(GTItemList.Sensor_UEV)
                    .eut(RECIPE_UHV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);
            }

            // UIV
            {
                // "Electric Motor (UIV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Motor_UIV.copy(), 0),

                        setStackSize(GemList.Nether_Star.copy(), 4),

                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 16),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 4),
                        setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 22))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 18))
                    .itemOutputs(GTItemList.Electric_Motor_UIV)
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Electric Pump (UIV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Pump_UIV.copy(), 0),

                        setStackSize(GemList.Nether_Star.copy(), 8),

                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 16),
                        setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 12),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 8),
                        setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64),
                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 16),

                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 48))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 8),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 36))
                    .itemOutputs(GTItemList.Electric_Pump_UIV)
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Conveyor Module (UIV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Conveyor_Module_UIV.copy(), 0),

                        setStackSize(GemList.Nether_Star.copy(), 12),
                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 32),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 12),
                        setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 2),
                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 + 16),

                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 56))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 12),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 54))
                    .itemOutputs(GTItemList.Conveyor_Module_UIV)
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Electric Piston (UIV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Piston_UIV.copy(), 0),

                        setStackSize(GemList.Nether_Star.copy(), 12),

                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 16),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 8),
                        setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 52))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 8),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 36))
                    .itemOutputs(GTItemList.Electric_Piston_UIV)
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Robot Arm (UIV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Robot_Arm_UIV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 2),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 8),

                        setStackSize(GemList.Nether_Star.copy(), 32),

                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 48),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 20),
                        setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 3),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 + 54))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 20),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 + 26)))
                    .itemOutputs(GTItemList.Robot_Arm_UIV)
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Field Generator (UIV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Field_Generator_UIV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 16),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 9 + 16),
                        setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 64),
                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 36),
                        setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 64),

                        setStackSize(IngotList.Infinity_Ingot.copy(), 36),
                        setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 64),
                        setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 64),
                        setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 5),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 2 + 8))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 16),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 2 + 34)))
                    .itemOutputs(GTItemList.Field_Generator_UIV)
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Emitter (UIV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Emitter_UIV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 2),

                        setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 16),
                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 16),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 8),
                        setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 16),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 8),

                        setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 16),
                        setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 16),
                        setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 32))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 36))
                    .itemOutputs(GTItemList.Emitter_UIV)
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Sensor (UIV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Sensor_UIV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 2 + 18),

                        setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 16),
                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 16),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 8),
                        setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 16),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 8),

                        setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 16),
                        setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 16),
                        setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 32))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 36))
                    .itemOutputs(GTItemList.Sensor_UIV)
                    .eut(RECIPE_UEV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);
            }

            // UMV
            {
                // "Electric Motor (UMV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Motor_UMV.copy(), 0),

                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 32),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 4),
                        setStackSize(IngotList.Hypogen_Ingot.copy(), 64 + 4),
                        setStackSize(IngotList.Quantium_Ingot.copy(), 4),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 22))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 18))
                    .itemOutputs(GTItemList.Electric_Motor_UMV)
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Electric Pump (UMV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Pump_UMV.copy(), 0),

                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 32),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 8),
                        setStackSize(IngotList.Hypogen_Ingot.copy(), 64 + 8),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 12),
                        setStackSize(IngotList.Quantium_Ingot.copy(), 8),

                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 16),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 48))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 8),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 36))
                    .itemOutputs(GTItemList.Electric_Pump_UMV)
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Conveyor Module (UMV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Conveyor_Module_UMV.copy(), 0),

                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 12),
                        setStackSize(IngotList.Hypogen_Ingot.copy(), 64 * 2 + 12),
                        setStackSize(IngotList.Quantium_Ingot.copy(), 12),
                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 + 16),

                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 56))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 12),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 54))
                    .itemOutputs(GTItemList.Conveyor_Module_UMV)
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Electric Piston (UMV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Piston_UMV.copy(), 0),

                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 32),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 8),
                        setStackSize(IngotList.Hypogen_Ingot.copy(), 64 + 8),
                        setStackSize(IngotList.Quantium_Ingot.copy(), 12),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 54))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 8),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 36))
                    .itemOutputs(GTItemList.Electric_Piston_UMV)
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Robot Arm (UMV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Robot_Arm_UMV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 2),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 8),

                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 + 32),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 20),
                        setStackSize(IngotList.Hypogen_Ingot.copy(), 64 * 3 + 20),
                        setStackSize(IngotList.Quantium_Ingot.copy(), 32),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 + 56))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 20),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 + 36)))
                    .itemOutputs(GTItemList.Robot_Arm_UMV)
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Field Generator (UMV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Field_Generator_UMV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 16),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 10),

                        setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 64),
                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 2),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 + 36),
                        setStackSize(IngotList.Hypogen_Ingot.copy(), 64 * 5 + 36),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 40),

                        setStackSize(IngotList.Quantium_Ingot.copy(), 64 + 24),
                        setStackSize(IngotList.Quantum_Ingot.copy(), 64),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 2 + 8),
                        setStackSize(IngotList.Titansteel_Ingot.copy(), 64))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 16),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 2 + 34)))
                    .itemOutputs(GTItemList.Field_Generator_UMV)
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Emitter (UMV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Emitter_UMV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 4),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 2),

                        setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 16),
                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 32),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 24),
                        setStackSize(IngotList.Hypogen_Ingot.copy(), 64 + 8),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 8),
                        setStackSize(IngotList.Quantium_Ingot.copy(), 18),
                        setStackSize(IngotList.Quantum_Ingot.copy(), 16),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 32),
                        setStackSize(IngotList.Titansteel_Ingot.copy(), 16))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 36))
                    .itemOutputs(GTItemList.Emitter_UMV)
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Sensor (UMV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Sensor_UMV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 4),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 2),
                        setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 16),
                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 32),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 24),
                        setStackSize(IngotList.Hypogen_Ingot.copy(), 64 + 8),

                        setStackSize(IngotList.Infinity_Ingot.copy(), 8),
                        setStackSize(IngotList.Quantium_Ingot.copy(), 18),
                        setStackSize(IngotList.Quantum_Ingot.copy(), 16),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 32),
                        setStackSize(IngotList.Titansteel_Ingot.copy(), 16))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 36))
                    .itemOutputs(GTItemList.Sensor_UMV)
                    .eut(RECIPE_UIV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);
            }

            // UXV
            {
                // "Electric Motor (UXV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Motor_UXV.copy(), 0),

                        setStackSize(GTItemList.Energised_Tesseract.copy(), 1),
                        setStackSize(GTItemList.Neutronium_Nanites.copy(), 4),

                        setStackSize(IngotList.Magmatter_Ingot.copy(), 16),
                        setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(), 42),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 12),
                        setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 16),
                        setStackSize(IngotList.Universium_Ingot.copy(), 34))
                    .fluidInputs(setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 8))
                    .itemOutputs(GTItemList.Electric_Motor_UXV)
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Electric Pump (UXV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Pump_UXV.copy(), 0),

                        setStackSize(GTItemList.Energised_Tesseract.copy(), 1),
                        setStackSize(GTItemList.Neutronium_Nanites.copy(), 8),

                        setStackSize(IngotList.Kevlar_Ingot.copy(), 16),
                        setStackSize(IngotList.Magmatter_Ingot.copy(), 36),
                        setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(), 64 + 8),
                        setStackSize(IngotList.Radox_Polymer_Bar.copy(), 16),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 36),

                        setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 16),
                        setStackSize(IngotList.Universium_Ingot.copy(), 52))
                    .fluidInputs(setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 16))
                    .itemOutputs(GTItemList.Electric_Pump_UXV)
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Conveyor Module (UXV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Conveyor_Module_UXV.copy(), 0),

                        setStackSize(GTItemList.Energised_Tesseract.copy(), 2),
                        setStackSize(GTItemList.Neutronium_Nanites.copy(), 12),

                        setStackSize(IngotList.Kevlar_Ingot.copy(), 64 + 16),
                        setStackSize(IngotList.Magmatter_Ingot.copy(), 32),
                        setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(), 64 + 36),
                        setStackSize(IngotList.Radox_Polymer_Bar.copy(), 64 + 16),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 32),

                        setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 32),
                        setStackSize(IngotList.Universium_Ingot.copy(), 64 + 24))
                    .fluidInputs(setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 24))
                    .itemOutputs(GTItemList.Conveyor_Module_UXV)
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Electric Piston (UXV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Electric_Piston_UXV.copy(), 0),

                        setStackSize(GTItemList.Energised_Tesseract.copy(), 1),
                        setStackSize(GTItemList.Neutronium_Nanites.copy(), 8),
                        setStackSize(IngotList.Magmatter_Ingot.copy(), 28),
                        setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(), 64 + 14),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 32),
                        setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 16),
                        setStackSize(IngotList.Universium_Ingot.copy(), 52))
                    .fluidInputs(setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 16))
                    .itemOutputs(GTItemList.Electric_Piston_UXV)
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Robot Arm (UXV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Robot_Arm_UXV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 2),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 8),

                        setStackSize(GTItemList.Energised_Tesseract.copy(), 3),
                        setStackSize(GTItemList.Neutronium_Nanites.copy(), 24),
                        setStackSize(IngotList.Magmatter_Ingot.copy(), 64 + 10),
                        setStackSize(
                            IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(),
                            64 * 2 + 60),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 + 20),

                        setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 48),
                        setStackSize(IngotList.Universium_Ingot.copy(), 64 * 2 + 10))
                    .fluidInputs(setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 40))
                    .itemOutputs(GTItemList.Robot_Arm_UXV)
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Field Generator (UXV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Field_Generator_UXV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.MAX, 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 16),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 128),

                        setStackSize(GTItemList.Energised_Tesseract.copy(), 16),
                        setStackSize(GTItemList.Neutronium_Nanites.copy(), 60),

                        setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 8),
                        setStackSize(IngotList.Magmatter_Ingot.copy(), 64 * 2 + 16),
                        setStackSize(
                            IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(),
                            64 * 4 + 60),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 4 + 20),
                        setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 64 + 16),

                        setStackSize(IngotList.Universium_Ingot.copy(), 64 * 4 + 50))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 32),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 7 + 52)))
                    .itemOutputs(GTItemList.Field_Generator_UXV)
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Emitter (UXV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Emitter_UXV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 4),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 16),
                        setStackSize(GTItemList.Energised_Tesseract.copy(), 1),
                        setStackSize(GTItemList.Neutronium_Nanites.copy(), 12),

                        setStackSize(IngotList.Infinity_Ingot.copy(), 64),
                        setStackSize(IngotList.Magmatter_Ingot.copy(), 32),
                        setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(), 64 + 8),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 60),
                        setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 16),

                        setStackSize(IngotList.Universium_Ingot.copy(), 64 + 4))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 8),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 100))
                    .itemOutputs(GTItemList.Emitter_UXV)
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Sensor (UXV)"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(GTItemList.Sensor_UXV.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 4),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 16),
                        setStackSize(GTItemList.Energised_Tesseract.copy(), 1),
                        setStackSize(GTItemList.Neutronium_Nanites.copy(), 12),

                        setStackSize(IngotList.Infinity_Ingot.copy(), 64),
                        setStackSize(IngotList.Magmatter_Ingot.copy(), 32),
                        setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(), 64 + 8),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 60),
                        setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 16),

                        setStackSize(IngotList.Universium_Ingot.copy(), 64 + 4))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * 8),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 100))
                    .itemOutputs(GTItemList.Sensor_UXV)
                    .eut(RECIPE_UMV)
                    .duration(50 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);
            }
        }

        // Heavy Duty Alloy Ingot
        {
            // "Heavy Duty Alloy Ingot T1"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(IngotList.Heavy_Duty_Alloy_Ingot_T1.copy(), 0),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 6),
                    setStackSize(IngotList.Bronze_Ingot.copy(), 6),
                    setStackSize(IngotList.Stainless_Steel_Ingot.copy(), 1),
                    setStackSize(IngotList.Steel_Ingot.copy(), 6))
                .itemOutputs(setStackSize(IngotList.Heavy_Duty_Alloy_Ingot_T1.copy(), 2))
                .eut(RECIPE_HV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Heavy Duty Alloy Ingot T2"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(IngotList.Heavy_Duty_Alloy_Ingot_T2.copy(), 0),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 6),
                    setStackSize(IngotList.Bronze_Ingot.copy(), 6),
                    setStackSize(IngotList.Meteoric_Iron_Ingot.copy(), 4),
                    setStackSize(IngotList.Stainless_Steel_Ingot.copy(), 1),
                    setStackSize(IngotList.Steel_Ingot.copy(), 6),

                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 1))
                .itemOutputs(setStackSize(IngotList.Heavy_Duty_Alloy_Ingot_T2.copy(), 2))
                .eut(RECIPE_EV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Heavy Duty Alloy Ingot T2"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(IngotList.Heavy_Duty_Alloy_Ingot_T3.copy(), 0),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 6),
                    setStackSize(IngotList.Bronze_Ingot.copy(), 6),
                    setStackSize(IngotList.Desh_Ingot.copy(), 8),
                    setStackSize(IngotList.Meteoric_Iron_Ingot.copy(), 4),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 1),

                    setStackSize(IngotList.Stainless_Steel_Ingot.copy(), 1),
                    setStackSize(IngotList.Steel_Ingot.copy(), 6),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 1))
                .itemOutputs(setStackSize(IngotList.Heavy_Duty_Alloy_Ingot_T3.copy(), 2))
                .eut(RECIPE_IV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Heavy Duty Alloy Ingot T4"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Alloy_Ingot_T4.copy(), 0),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 12),
                    setStackSize(IngotList.Bronze_Ingot.copy(), 12),
                    setStackSize(IngotList.Callisto_Ice_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Desh_Ingot.copy(), 16),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 1),

                    setStackSize(IngotList.Ledox_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Meteoric_Iron_Ingot.copy(), 8),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 2),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 2),
                    setStackSize(IngotList.Stainless_Steel_Ingot.copy(), 2),

                    setStackSize(IngotList.Steel_Ingot.copy(), 12),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 2))
                .fluidInputs(setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 12))
                .itemOutputs(setStackSize(NewHorizonsCoreModList.Heavy_Duty_Alloy_Ingot_T4.copy(), 4))
                .eut(RECIPE_LuV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Heavy Duty Alloy Ingot T5"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Alloy_Ingot_T5.copy(), 0),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 12),
                    setStackSize(IngotList.Bronze_Ingot.copy(), 12),
                    setStackSize(IngotList.Callisto_Ice_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Desh_Ingot.copy(), 16),
                    setStackSize(IngotList.Europium_Ingot.copy(), 4),

                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 3),
                    setStackSize(IngotList.Ledox_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Meteoric_Iron_Ingot.copy(), 8),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 2),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 + 32),

                    setStackSize(IngotList.Ruridit_Ingot.copy(), 2),
                    setStackSize(IngotList.Stainless_Steel_Ingot.copy(), 2),
                    setStackSize(IngotList.Steel_Ingot.copy(), 12),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 2))
                .fluidInputs(setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 12))
                .itemOutputs(setStackSize(NewHorizonsCoreModList.Heavy_Duty_Alloy_Ingot_T5.copy(), 4))
                .eut(RECIPE_ZPM)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Heavy Duty Alloy Ingot T6"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Alloy_Ingot_T6.copy(), 0),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 12),
                    setStackSize(IngotList.Bronze_Ingot.copy(), 12),
                    setStackSize(IngotList.Callisto_Ice_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Desh_Ingot.copy(), 16),
                    setStackSize(IngotList.Europium_Ingot.copy(), 4),

                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 7),
                    setStackSize(IngotList.Lead_Ingot.copy(), 60),
                    setStackSize(IngotList.Ledox_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Meteoric_Iron_Ingot.copy(), 8),
                    setStackSize(IngotList.Oriharukon_Ingot.copy(), 60),

                    setStackSize(IngotList.Platinum_Ingot.copy(), 2),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 2),
                    setStackSize(IngotList.Stainless_Steel_Ingot.copy(), 2),
                    setStackSize(IngotList.Steel_Ingot.copy(), 12),

                    setStackSize(IngotList.Tritanium_Ingot.copy(), 4),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 2))
                .fluidInputs(setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 32))
                .itemOutputs(setStackSize(NewHorizonsCoreModList.Heavy_Duty_Alloy_Ingot_T6.copy(), 4))
                .eut(RECIPE_UV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Heavy Duty Alloy Ingot T7"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Alloy_Ingot_T7.copy(), 0),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 12),
                    setStackSize(IngotList.Bronze_Ingot.copy(), 12),
                    setStackSize(IngotList.Callisto_Ice_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Desh_Ingot.copy(), 16),
                    setStackSize(IngotList.Europium_Ingot.copy(), 4),

                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 15),
                    setStackSize(IngotList.Lead_Ingot.copy(), 60),
                    setStackSize(IngotList.Ledox_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Meteoric_Iron_Ingot.copy(), 8),
                    setStackSize(IngotList.Mysterious_Crystal_Ingot.copy(), 64 * 2 + 16),

                    setStackSize(IngotList.Neutronium_Ingot.copy(), 5),
                    setStackSize(IngotList.Oriharukon_Ingot.copy(), 60),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 2),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 2),

                    setStackSize(IngotList.Stainless_Steel_Ingot.copy(), 2),
                    setStackSize(IngotList.Steel_Ingot.copy(), 12),
                    setStackSize(IngotList.Tritanium_Ingot.copy(), 4),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 2))
                .fluidInputs(setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 32))
                .itemOutputs(setStackSize(NewHorizonsCoreModList.Heavy_Duty_Alloy_Ingot_T7.copy(), 4))
                .eut(RECIPE_UHV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Heavy Duty Alloy Ingot T8"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Alloy_Ingot_T8.copy(), 0),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 12),
                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 64 * 2 + 46),
                    setStackSize(IngotList.Bronze_Ingot.copy(), 12),
                    setStackSize(IngotList.Callisto_Ice_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Desh_Ingot.copy(), 16),

                    setStackSize(IngotList.Europium_Ingot.copy(), 4),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 31),
                    setStackSize(IngotList.Lead_Ingot.copy(), 60),
                    setStackSize(IngotList.Ledox_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Meteoric_Iron_Ingot.copy(), 8),

                    setStackSize(IngotList.Mysterious_Crystal_Ingot.copy(), 64 * 2 + 16),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 5),
                    setStackSize(IngotList.Oriharukon_Ingot.copy(), 60),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 2),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 + 32),

                    setStackSize(IngotList.Ruridit_Ingot.copy(), 2),
                    setStackSize(IngotList.Stainless_Steel_Ingot.copy(), 2),
                    setStackSize(IngotList.Steel_Ingot.copy(), 12),
                    setStackSize(IngotList.Tritanium_Ingot.copy(), 4),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 2))
                .fluidInputs(setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 32))
                .itemOutputs(setStackSize(NewHorizonsCoreModList.Heavy_Duty_Alloy_Ingot_T8.copy(), 4))
                .eut(RECIPE_UEV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Lightweight Alloy Ingot"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(NewHorizonsCoreModList.Lightweight_Alloy_Ingot.copy(), 0),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 12),
                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 64 * 2 + 46),
                    setStackSize(IngotList.Bronze_Ingot.copy(), 12),
                    setStackSize(IngotList.Callisto_Ice_Ingot.copy(), 64 + 8),
                    setStackSize(IngotList.Desh_Ingot.copy(), 16),

                    setStackSize(IngotList.Europium_Ingot.copy(), 4),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 31),
                    setStackSize(IngotList.Kevlar_Ingot.copy(), 56),
                    setStackSize(IngotList.Lead_Ingot.copy(), 60),
                    setStackSize(IngotList.Ledox_Ingot.copy(), 64 + 8),

                    setStackSize(IngotList.Meteoric_Iron_Ingot.copy(), 8),
                    setStackSize(IngotList.Mysterious_Crystal_Ingot.copy(), 64 * 2 + 16),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 11),
                    setStackSize(IngotList.Oriharukon_Ingot.copy(), 60),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 2),

                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 16),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 2),
                    setStackSize(IngotList.Stainless_Steel_Ingot.copy(), 2),
                    setStackSize(IngotList.Steel_Ingot.copy(), 12),

                    setStackSize(IngotList.Tritanium_Ingot.copy(), 4),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 2))
                .fluidInputs(setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 32))
                .itemOutputs(setStackSize(NewHorizonsCoreModList.Lightweight_Alloy_Ingot.copy(), 4))
                .eut(RECIPE_UEV)
                .duration(15 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // Matter Manipulator
        {
            // "Matter Manipulator Power Core MKII"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(MatterManipulatorList.Matter_Manipulator_Power_Core_MKII.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 6),

                    setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 8),
                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 8),
                    setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 8),
                    setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 8),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64),

                    setStackSize(CircuitList.High_Power_IC_Chip.copy(), 64 + 4),
                    setStackSize(CircuitList.Multilayer_Fiber_Reinforced_Circuit_Board.copy(), 1),

                    setStackSize(IngotList.HSSS_Ingot.copy(), 6),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 13),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 16),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 8),

                    setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 12))
                .fluidInputs(setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 16))
                .itemOutputs(MatterManipulatorList.Matter_Manipulator_Power_Core_MKII)
                .eut(RECIPE_LuV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Matter Manipulator Computer Core MKII"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(MatterManipulatorList.Matter_Manipulator_Computer_Core_MKII.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 2),

                    setStackSize(IngotList.HSSS_Ingot.copy(), 8),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 16),

                    setStackSize(WireList.Superconductor_LuV_Wire_1x.copy(), 18))
                .fluidInputs(setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 32))
                .itemOutputs(MatterManipulatorList.Matter_Manipulator_Computer_Core_MKII)
                .eut(RECIPE_LuV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Matter Manipulator Teleporter Core MKII"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(MatterManipulatorList.Matter_Manipulator_Teleporter_Core_MKII.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 24),

                    setStackSize(GemList.Nether_Star.copy(), 12),

                    setStackSize(GTItemList.Gravitation_Engine.copy(), 4),

                    setStackSize(IngotList.Duranium_Ingot.copy(), 8),
                    setStackSize(IngotList.Gallium_Ingot.copy(), 64 * 4 + 32),
                    setStackSize(IngotList.HSSS_Ingot.copy(), 38),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 48),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 6),

                    setStackSize(IngotList.Quantium_Ingot.copy(), 18),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 64 * 2 + 24),
                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 34))
                .fluidInputs(
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 32),
                    setStackSize(FluidList.Lubricant.copy(), 1000 + 500),
                    setStackSize(GasList.Radon.copy(), 1000 * 14))
                .itemOutputs(setStackSize(MatterManipulatorList.Matter_Manipulator_Teleporter_Core_MKII, 1))
                .eut(RECIPE_LuV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Matter Manipulator Lens Assembly MKII"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(MatterManipulatorList.Matter_Manipulator_Lens_Assembly_MKII.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),

                    setStackSize(GemList.Nether_Star.copy(), 6),

                    setStackSize(GTItemList.Red_Zircon_Lens.copy(), 2),

                    setStackSize(IngotList.Gallium_Ingot.copy(), 64 * 3),
                    setStackSize(IngotList.HSSS_Ingot.copy(), 64 + 7),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 34),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 8),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 64 * 2 + 48),

                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 32))
                .fluidInputs(
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 2 + 500),
                    setStackSize(GasList.Radon.copy(), 1000 * 8 + 500))
                .itemOutputs(MatterManipulatorList.Matter_Manipulator_Lens_Assembly_MKII.copy())
                .eut(RECIPE_LuV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Matter Manipulator Power Core MKIII"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(MatterManipulatorList.Matter_Manipulator_Power_Core_MKIII.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 14),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 32),

                    setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 8),
                    setStackSize(CircuitList.ASoC_Wafer.copy(), 64 * 2),
                    setStackSize(CircuitList.Engraved_Lapotron_Chip.copy(), 64 * 2),
                    setStackSize(CircuitList.Ultra_High_Power_IC_Chip.copy(), 8),

                    setStackSize(GemList.Nether_Star.copy(), 12),

                    setStackSize(IngotList.Europium_Ingot.copy(), 16),
                    setStackSize(IngotList.Gallium_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.HSSS_Ingot.copy(), 48),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 20),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 8),

                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 6),
                    setStackSize(IngotList.Naquadah_Ingot.copy(), 16),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 64 * 3 + 32),
                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 48),

                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 24))
                .fluidInputs(
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 16),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 2),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 32),
                    setStackSize(GasList.Radon.copy(), 1000 * 17))
                .itemOutputs(MatterManipulatorList.Matter_Manipulator_Power_Core_MKIII)
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Matter Manipulator Computer Core MKIII"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(MatterManipulatorList.Matter_Manipulator_Computer_Core_MKIII.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 2),

                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 32),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 8),

                    setStackSize(WireList.Superconductor_ZPM_Wire_1x.copy(), 30))
                .fluidInputs(setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64))
                .itemOutputs(MatterManipulatorList.Matter_Manipulator_Computer_Core_MKIII)
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Matter Manipulator Teleporter Core MKIII"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(MatterManipulatorList.Matter_Manipulator_Teleporter_Core_MKIII.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 24),

                    setStackSize(GemList.Nether_Star.copy(), 18),

                    setStackSize(GTItemList.Gravitation_Engine.copy(), 16),
                    setStackSize(GTItemList.Stable_Baryon_Containment_Unit.copy(), 8),
                    setStackSize(GTItemList.Stable_Lepton_Containment_Unit.copy(), 8),

                    setStackSize(IngotList.Europium_Ingot.copy(), 64 * 2 + 48),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 20),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 6),
                    setStackSize(IngotList.Mysterious_Crystal_Ingot.copy(), 18),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 62),

                    setStackSize(IngotList.Neutronium_Ingot.copy(), 8),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 24),
                    setStackSize(IngotList.Trinium_Ingot.copy(), 64 * 4 + 38),
                    setStackSize(IngotList.Tritanium_Ingot.copy(), 16),
                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64 * 2 + 56))
                .fluidInputs(
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 4 + 500),
                    setStackSize(FluidList.Super_Coolant.copy(), 1000 * 32),
                    setStackSize(GasList.Radon.copy(), 1000 * 22 + 500))
                .itemOutputs(MatterManipulatorList.Matter_Manipulator_Teleporter_Core_MKIII)
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Matter Manipulator Lens Assembly MKIII"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(MatterManipulatorList.Matter_Manipulator_Lens_Assembly_MKIII.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 16),

                    setStackSize(GemList.Nether_Star.copy(), 10),

                    setStackSize(GTItemList.Magneto_Resonatic_Lens.copy(), 2),

                    setStackSize(IngotList.Europium_Ingot.copy(), 64 * 3 + 8),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 + 10),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 7),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 + 40),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 16),

                    setStackSize(IngotList.Trinium_Ingot.copy(), 64 * 3),
                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64 * 2 + 28))
                .fluidInputs(
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 6 + 750),
                    setStackSize(GasList.Radon.copy(), 1000 * 12 + 500))
                .itemOutputs(MatterManipulatorList.Matter_Manipulator_Lens_Assembly_MKIII)
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Matter Manipulator Quantum Downlink"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(MatterManipulatorList.Matter_Manipulator_Quantum_Downlink.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 4),

                    setStackSize(Appliedenergistics2List.ME_Quantum_Ring.copy(), 8),
                    setStackSize(Appliedenergistics2List.ME_Quantum_Link_Chamber.copy(), 1),
                    setStackSize(Appliedenergistics2List.ME_Controller.copy(), 1),
                    setStackSize(Appliedenergistics2List.Dense_Energy_Cell.copy(), 1),
                    setStackSize(Appliedenergistics2List.ME_Storage_Component_4096k.copy(), 1),

                    setStackSize(AE2FluidCraftingList.ME_Dual_Interface.copy(), 1),

                    setStackSize(GTItemList.Conveyor_Module_ZPM.copy(), 2),
                    setStackSize(GTItemList.Electric_Pump_ZPM.copy(), 2),

                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 32))
                .itemOutputs(MatterManipulatorList.Matter_Manipulator_Quantum_Downlink)
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Energy Tunnel Manipulator Upgrade"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(MatterManipulatorList.Energy_Tunnel_Manipulator_Upgrade.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 4),

                    setStackSize(Appliedenergistics2List.ME_Dense_Smart_Cable_Fluix.copy(), 16),
                    setStackSize(Appliedenergistics2List.P2P_Tunnel_GT_EU.copy(), 4),

                    setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 4),

                    setStackSize(GTBlockList.Laser_Vacuum_Pipe.copy(), 64),

                    setStackSize(IngotList.Chromatic_Glass_Ingot.copy(), 8),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 32),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64),

                    setStackSize(MatterManipulatorList.Blank_Manipulator_Upgrade, 1),

                    setStackSize(MultiMachineControllerList.Active_Transformer.copy(), 1))
                .fluidInputs(setStackSize(FluidList.Super_Coolant.copy(), 1000 * 64 * 4))
                .itemOutputs(MatterManipulatorList.Energy_Tunnel_Manipulator_Upgrade)
                .eut(RECIPE_UEV)
                .duration(10 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // Mining Drone
        {
            // "Mining Drone MK-IV (EV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTNHIntergalacticList.Mining_Drone_MKIV_EV.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 4),

                    setStackSize(GalacticraftList.Heavy_Rocket_Engine.copy(), 4),

                    setStackSize(GTItemList.Field_Generator_EV.copy(), 2),
                    setStackSize(GTItemList.Robot_Arm_EV.copy(), 8),
                    setStackSize(GTItemList.Sensor_EV.copy(), 8),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Bronze_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Desh_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 5),
                    setStackSize(IngotList.Iridium_Ingot.copy(), 5),

                    setStackSize(IngotList.Meteoric_Iron_Ingot.copy(), 64),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 16),
                    setStackSize(IngotList.Stainless_Steel_Ingot.copy(), 16),
                    setStackSize(IngotList.Steel_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Trinium_Ingot.copy(), 32),

                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 16))
                .fluidInputs(setStackSize(FluidList.Drilling_Fluid.copy(), 1000 * 16))
                .itemOutputs(GTNHIntergalacticList.Mining_Drone_MKIV_EV)
                .eut(RECIPE_EV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Mining Drone MK-V (IV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTNHIntergalacticList.Mining_Drone_MKV_IV.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 4),

                    setStackSize(GalacticraftList.Heavy_Rocket_Engine.copy(), 4),

                    setStackSize(GTItemList.Field_Generator_IV.copy(), 2),
                    setStackSize(GTItemList.Robot_Arm_IV.copy(), 8),
                    setStackSize(GTItemList.Sensor_IV.copy(), 8),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Bronze_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Callisto_Ice_Ingot.copy(), 64 * 9),
                    setStackSize(IngotList.Desh_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 18),

                    setStackSize(IngotList.Iridium_Ingot.copy(), 10),
                    setStackSize(IngotList.Ledox_Ingot.copy(), 64 * 9),
                    setStackSize(IngotList.Meteoric_Iron_Ingot.copy(), 8),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 32),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 16),

                    setStackSize(IngotList.Ruridit_Ingot.copy(), 16),
                    setStackSize(IngotList.Stainless_Steel_Ingot.copy(), 16),
                    setStackSize(IngotList.Steel_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 16))
                .fluidInputs(
                    setStackSize(FluidList.Drilling_Fluid.copy(), 1000 * 32),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * (64 + 32)))
                .itemOutputs(GTNHIntergalacticList.Mining_Drone_MKV_IV)
                .eut(RECIPE_IV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Mining Drone MK-VI (LuV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTNHIntergalacticList.Mining_Drone_MKVI_LuV.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 12),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 64 + 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.EV, 64),

                    setStackSize(GemList.Nether_Star.copy(), 20),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Bronze_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Callisto_Ice_Ingot.copy(), 64 * 9),
                    setStackSize(IngotList.Desh_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Europium_Ingot.copy(), 32),

                    setStackSize(IngotList.Gallium_Ingot.copy(), 64 * 12),
                    setStackSize(IngotList.HSSS_Ingot.copy(), 64 * 5 + 48),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 3 + 4),
                    setStackSize(IngotList.Ledox_Ingot.copy(), 64 * 9),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 40),

                    setStackSize(IngotList.Meteoric_Iron_Ingot.copy(), 64),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 32),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 10),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 16),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 12),

                    setStackSize(IngotList.Ruridit_Ingot.copy(), 64 * 12 + 48),
                    setStackSize(IngotList.Stainless_Steel_Ingot.copy(), 16),
                    setStackSize(IngotList.Steel_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 16),
                    setStackSize(IngotList.Yttrium_Barium_Cuprate_Ingot.copy(), 64 * 2 + 24),

                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_3.copy(), 4))
                .fluidInputs(
                    setStackSize(FluidList.Drilling_Fluid.copy(), 1000 * 64),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * (64 + 32)),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 14),
                    setStackSize(GasList.Radon.copy(), 1000 * 27))
                .itemOutputs(GTNHIntergalacticList.Mining_Drone_MKVI_LuV)
                .eut(RECIPE_LuV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Mining Drone MK-VII (ZPM)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTNHIntergalacticList.Mining_Drone_MKVII_ZPM.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 12),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 64 + 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.IV, 64),

                    setStackSize(GemList.Nether_Star.copy(), 36),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Bronze_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Callisto_Ice_Ingot.copy(), 64 * 9),
                    setStackSize(IngotList.Desh_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Europium_Ingot.copy(), 64 * 16 + 32),

                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 7 + 60),
                    setStackSize(IngotList.Lead_Ingot.copy(), 64 * 7 + 32),
                    setStackSize(IngotList.Ledox_Ingot.copy(), 64 * 9),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 40),
                    setStackSize(IngotList.Meteoric_Iron_Ingot.copy(), 64),

                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 8 + 56),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 32),
                    setStackSize(IngotList.Oriharukon_Ingot.copy(), 64 * 7 + 32),
                    setStackSize(IngotList.Osmiridium_Ingot.copy(), 64 + 42),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 16),

                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 12),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 16),
                    setStackSize(IngotList.Stainless_Steel_Ingot.copy(), 16),
                    setStackSize(IngotList.Steel_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Trinium_Ingot.copy(), 64 * 12),

                    setStackSize(IngotList.Tritanium_Ingot.copy(), 32),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 16),
                    setStackSize(IngotList.Vanadium_Gallium_Ingot.copy(), 64 * 10 + 16),

                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_3.copy(), 4))
                .fluidInputs(
                    setStackSize(FluidList.Drilling_Fluid.copy(), 1000 * (64 * 2)),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * (64 * 4)),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * 42),
                    setStackSize(GasList.Radon.copy(), 1000 * 45))
                .itemOutputs(GTNHIntergalacticList.Mining_Drone_MKVII_ZPM)
                .eut(RECIPE_ZPM)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Mining Drone MK-VIII (UV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTNHIntergalacticList.Mining_Drone_MKVIII_UV.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 12),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 64 + 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.LuV, 64),

                    setStackSize(GemList.Nether_Star.copy(), 64 + 4),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 64 * 32),
                    setStackSize(IngotList.Bronze_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Callisto_Ice_Ingot.copy(), 64 * 9),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 32),
                    setStackSize(IngotList.Desh_Ingot.copy(), 64 * 2),

                    setStackSize(IngotList.Europium_Ingot.copy(), 32),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 15 + 28),
                    setStackSize(IngotList.Lead_Ingot.copy(), 64 * 7 + 32),
                    setStackSize(IngotList.Ledox_Ingot.copy(), 64 * 9),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 + 16),

                    setStackSize(IngotList.Meteoric_Iron_Ingot.copy(), 64),
                    setStackSize(IngotList.Mysterious_Crystal_Ingot.copy(), 64 * 18),
                    setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 9),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 22 + 36),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 28 + 48),

                    setStackSize(IngotList.Oriharukon_Ingot.copy(), 64 * 7 + 32),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 16),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 12),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 16),
                    setStackSize(IngotList.Stainless_Steel_Ingot.copy(), 16),

                    setStackSize(IngotList.Steel_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Tritanium_Ingot.copy(), 32),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 16),

                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4.copy(), 4))
                .fluidInputs(
                    setStackSize(FluidList.Drilling_Fluid.copy(), 1000 * (64 * 4)),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * (64 * 4)),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * (64 * 3 + 48)),
                    setStackSize(GasList.Radon.copy(), 1000 * 64))
                .itemOutputs(GTNHIntergalacticList.Mining_Drone_MKVIII_UV)
                .eut(RECIPE_UV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Mining Drone MK-IX (UHV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTNHIntergalacticList.Mining_Drone_MKIX_UHV.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 12),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 64 * 4 + 48),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 64),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 2 + 8),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 8 + 32),
                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 64 * 21 + 48),
                    setStackSize(IngotList.Bronze_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Callisto_Ice_Ingot.copy(), 64 * 9),

                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 16),
                    setStackSize(IngotList.Desh_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Europium_Ingot.copy(), 32),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 16),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 25 + 4),

                    setStackSize(IngotList.Infinity_Ingot.copy(), 32),
                    setStackSize(IngotList.Lead_Ingot.copy(), 64 * 7 + 32),
                    setStackSize(IngotList.Ledox_Ingot.copy(), 64 * 9),
                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 * 2 + 32),
                    setStackSize(IngotList.Meteoric_Iron_Ingot.copy(), 64),

                    setStackSize(IngotList.Mysterious_Crystal_Ingot.copy(), 64 * 18),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 22 + 12),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 58 + 26),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 16),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 10),

                    setStackSize(IngotList.Ruridit_Ingot.copy(), 16),
                    setStackSize(IngotList.Stainless_Steel_Ingot.copy(), 16),
                    setStackSize(IngotList.Steel_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Tritanium_Ingot.copy(), 32),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 16),

                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4.copy(), 4))
                .fluidInputs(
                    setStackSize(FluidList.Drilling_Fluid.copy(), 1000 * (64 * 4)),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * (64 * 4)),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * (64 * 3 + 4)),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 20),
                    setStackSize(GasList.Radon.copy(), 1000 * (64 + 46)))
                .itemOutputs(GTNHIntergalacticList.Mining_Drone_MKIX_UHV)
                .eut(RECIPE_UHV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Mining Drone MK-X (UEV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTNHIntergalacticList.Mining_Drone_MKX_UEV.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 12),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 64 + 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 64),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 4 + 16),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 5),
                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 64 * 21 + 48),
                    setStackSize(IngotList.Bronze_Ingot.copy(), 64 + 32),
                    setStackSize(IngotList.Callisto_Ice_Ingot.copy(), 64 * 9),

                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 33 + 32),
                    setStackSize(IngotList.Desh_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Draconium_Ingot.copy(), 64 * 9),
                    setStackSize(IngotList.Europium_Ingot.copy(), 32),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 3 + 56),

                    setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64 * 16),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 24 + 32),
                    setStackSize(IngotList.Kevlar_Ingot.copy(), 64 * 7),
                    setStackSize(IngotList.Lead_Ingot.copy(), 64 * 7 + 32),
                    setStackSize(IngotList.Ledox_Ingot.copy(), 64 * 9),

                    setStackSize(IngotList.Meteoric_Iron_Ingot.copy(), 64),
                    setStackSize(IngotList.Mysterious_Crystal_Ingot.copy(), 64 * 18),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 9 + 56),
                    setStackSize(IngotList.Oriharukon_Ingot.copy(), 64 * 7 + 32),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 16),

                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 33 + 22),
                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 64 * 2),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 16),
                    setStackSize(IngotList.Stainless_Steel_Ingot.copy(), 16),
                    setStackSize(IngotList.Steel_Ingot.copy(), 64 + 32),

                    setStackSize(IngotList.Tritanium_Ingot.copy(), 64 * 2 + 32),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 16),

                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4.copy(), 8))
                .fluidInputs(
                    setStackSize(FluidList.Drilling_Fluid.copy(), 1000 * (64 * 8)),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * (64 * 4)),
                    setStackSize(FluidList.Lubricant.copy(), 1000 * (64 * 3 + 32)),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 21 + 8)),
                    setStackSize(GasList.Radon.copy(), 1000 * (64 * 5 + 24)))
                .itemOutputs(GTNHIntergalacticList.Mining_Drone_MKX_UEV)
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Mining Drone MK-XI (UIV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTNHIntergalacticList.Mining_Drone_MKXI_UIV.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 12),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 64 + 48),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 64),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 44),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 64 * 3),
                    setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 10),
                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 64 * 43 + 32),
                    setStackSize(IngotList.Bronze_Ingot.copy(), 64 * 3),

                    setStackSize(IngotList.Callisto_Ice_Ingot.copy(), 64 * 18),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 * 4 + 40),
                    setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 32),
                    setStackSize(IngotList.Desh_Ingot.copy(), 64 * 4),

                    setStackSize(IngotList.Europium_Ingot.copy(), 64),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 7 + 48),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 2 + 8),
                    setStackSize(IngotList.Kevlar_Ingot.copy(), 64 * 14),
                    setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 64 * 4),

                    setStackSize(IngotList.Lead_Ingot.copy(), 64 * 15),
                    setStackSize(IngotList.Ledox_Ingot.copy(), 64 * 18),
                    setStackSize(IngotList.Meteoric_Iron_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Mysterious_Crystal_Ingot.copy(), 64 * 36),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 2 + 48),

                    setStackSize(IngotList.Oriharukon_Ingot.copy(), 64 * 15),
                    setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 32),
                    setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 42),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 24 + 20),

                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 64 * 4),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 32),
                    setStackSize(IngotList.Stainless_Steel_Ingot.copy(), 32),
                    setStackSize(IngotList.Steel_Ingot.copy(), 64 * 3),
                    setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 23),

                    setStackSize(IngotList.Tritanium_Ingot.copy(), 64),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 32),

                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4.copy(), 16))
                .fluidInputs(
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * (64 * 3 + 32)),
                    setStackSize(FluidList.Drilling_Fluid.copy(), 1000 * (64 * 8)),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * (64 * 8)),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 21 + 28)))
                .itemOutputs(GTNHIntergalacticList.Mining_Drone_MKXI_UIV)
                .eut(RECIPE_UEV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Mining Drone MK-XII (UMV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTNHIntergalacticList.Mining_Drone_MKXII_UMV.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 12),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 64 + 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 64),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 36),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 20),
                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 64 * 87),
                    setStackSize(IngotList.Bronze_Ingot.copy(), 64 * 6),

                    setStackSize(IngotList.Callisto_Ice_Ingot.copy(), 64 * 36),
                    setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 * 8 + 44),
                    setStackSize(IngotList.Desh_Ingot.copy(), 64 * 8),
                    setStackSize(IngotList.Europium_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Hypogen_Ingot.copy(), 64 * 46 + 44),

                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 15 + 32),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 2 + 16),
                    setStackSize(IngotList.Kevlar_Ingot.copy(), 64 * 28),
                    setStackSize(IngotList.Lead_Ingot.copy(), 64 * 30),
                    setStackSize(IngotList.Ledox_Ingot.copy(), 64 * 36),

                    setStackSize(IngotList.Meteoric_Iron_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Mysterious_Crystal_Ingot.copy(), 64 * 72),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 5 + 32),
                    setStackSize(IngotList.Oriharukon_Ingot.copy(), 64 * 30),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 64),

                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 57),
                    setStackSize(IngotList.Quantum_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 64 * 8),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 64),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 23 + 48),

                    setStackSize(IngotList.Stainless_Steel_Ingot.copy(), 64),
                    setStackSize(IngotList.Steel_Ingot.copy(), 64 * 6),
                    setStackSize(IngotList.Titansteel_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Tritanium_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 64),

                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4.copy(), 32))
                .fluidInputs(
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * (64 * 3 + 32)),
                    setStackSize(FluidList.Drilling_Fluid.copy(), 1000 * (64 * 8)),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * (64 * 16)),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 22 + 4)))
                .itemOutputs(GTNHIntergalacticList.Mining_Drone_MKXII_UMV)
                .eut(RECIPE_UMV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Mining Drone MK-XIII (UXV)"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(GTNHIntergalacticList.Mining_Drone_MKXIII_UXV.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.MAX, 12),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 64 + 16),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 64),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 392),

                    setStackSize(GTItemList.Energised_Tesseract.copy(), 64),
                    setStackSize(GTItemList.Neutronium_Nanites.copy(), 64 * 6 + 24),

                    setStackSize(IngotList.Aluminium_Ingot.copy(), 64 * 12),
                    setStackSize(IngotList.Black_Plutonium_Ingot.copy(), 64 * 174),
                    setStackSize(IngotList.Bronze_Ingot.copy(), 64 * 12),
                    setStackSize(IngotList.Callisto_Ice_Ingot.copy(), 64 * 72),
                    setStackSize(IngotList.Desh_Ingot.copy(), 64 * 16),

                    setStackSize(IngotList.Eternity_Ingot.copy(), 32),
                    setStackSize(IngotList.Europium_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 31),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 24),
                    setStackSize(IngotList.Kevlar_Ingot.copy(), 64 * 56),

                    setStackSize(IngotList.Lead_Ingot.copy(), 64 * 60),
                    setStackSize(IngotList.Ledox_Ingot.copy(), 64 * 72),
                    setStackSize(IngotList.Magmatter_Ingot.copy(), 64 * 17 + 48),
                    setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(), 64 * 42 + 24),
                    setStackSize(IngotList.Meteoric_Iron_Ingot.copy(), 64 * 8),

                    setStackSize(IngotList.Mysterious_Crystal_Ingot.copy(), 64 * 144),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 11),
                    setStackSize(IngotList.Oriharukon_Ingot.copy(), 64 * 60),
                    setStackSize(IngotList.Platinum_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 96),

                    setStackSize(IngotList.Radox_Polymer_Bar.copy(), 64 * 16),
                    setStackSize(IngotList.Ruridit_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 26 + 40),
                    setStackSize(IngotList.Stainless_Steel_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Steel_Ingot.copy(), 64 * 12),

                    setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 64 * 10 + 32),
                    setStackSize(IngotList.Tritanium_Ingot.copy(), 64 * 4),
                    setStackSize(IngotList.Tungstensteel_Ingot.copy(), 64 * 2),
                    setStackSize(IngotList.Universium_Ingot.copy(), 64 * 35 + 24),

                    setStackSize(NewHorizonsCoreModList.Heavy_Duty_Rocket_Engine_Tier_4.copy(), 64))
                .fluidInputs(
                    setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * (64 * 7)),
                    setStackSize(FluidList.Drilling_Fluid.copy(), 1000 * (64 * 8)),
                    setStackSize(FluidList.IC2_Coolant.copy(), 1000 * (64 * 32)),
                    setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 28 + 8)),
                    setStackSize(FluidList.Spatially_Enlarged_Fluid.copy(), 144 * 4))
                .itemOutputs(GTNHIntergalacticList.Mining_Drone_MKXIII_UXV)
                .eut(RECIPE_UXV)
                .duration(60 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // "Raw Deep Dark Portal Block"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(BlockList.Raw_Deep_Dark_Portal_Block.copy(), 0),

                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 44),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 16),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 32),

                setStackSize(CircuitList.APIC_Wafer.copy(), 32),

                setStackSize(GemList.Nether_Star.copy(), 64 * 19 + 8),

                setStackSize(IngotList.Arceus_Alloy_2B_Ingot.copy(), 64 * 2),
                setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 5),
                setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 * 2 + 16),
                setStackSize(IngotList.Cinobite_A243_Ingot.copy(), 64 * 2),
                setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 9 + 36),

                setStackSize(IngotList.Lafium_Compound_Ingot.copy(), 64 * 2),
                setStackSize(IngotList.Pikyonium_64B_Ingot.copy(), 64 * 2),
                setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64 * 20),
                setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 11 + 24),

                setStackSize(MachineList.Teleporter.copy(), 1),

                setStackSize(MinecraftList.Cobblestone.copy(), 64 * 672605))
            .fluidInputs(
                setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * (64 + 48)),
                setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 10 + 8)),
                setStackSize(GasList.Oganesson.copy(), 1000 * 50),
                setStackSize(MoltenList.Molten_Cheese.copy(), 1000 * (64 * 3 + 48)))
            .itemOutputs(BlockList.Raw_Deep_Dark_Portal_Block)
            .eut(RECIPE_UMV)
            .duration(180 * SECONDS)
            .addTo(AssemblyLineItemRecipe);

        // Schematic
        {
            // "Draconic Core Schematic"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(KubaTechList.Draconic_Core_Schematic.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 1),

                    setStackSize(DraconicEvolutionList.Draconic_Core.copy(), 1),

                    setStackSize(IngotList.Draconium_Ingot.copy(), 9),
                    setStackSize(IngotList.Ichorium_Ingot.copy(), 1),
                    setStackSize(IngotList.Sunnarium_Ingot.copy(), 64 + 36),
                    setStackSize(IngotList.Void_Metal_Ingot.copy(), 64 * 3 + 8))
                .itemOutputs(KubaTechList.Draconic_Core_Schematic)
                .eut(RECIPE_UHV)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Wyvern Core Schematic"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(KubaTechList.Wyvern_Core_Schematic.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 1),

                    setStackSize(DraconicEvolutionList.Draconic_Core.copy(), 4),

                    setStackSize(IngotList.Draconium_Ingot.copy(), 9),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 1),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 + 36),
                    setStackSize(IngotList.Void_Metal_Ingot.copy(), 64 * 6 + 16))
                .itemOutputs(KubaTechList.Wyvern_Core_Schematic)
                .eut(RECIPE_UEV)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Awakened Core Schematic"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(KubaTechList.Awakened_Core_Schematic.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 1),

                    setStackSize(DraconicEvolutionList.Wyvern_Core.copy(), 4),

                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 9),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 1),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64 + 36),
                    setStackSize(IngotList.Void_Metal_Ingot.copy(), 64 * 12 + 32))
                .itemOutputs(KubaTechList.Awakened_Core_Schematic)
                .eut(RECIPE_UIV)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Chaotic Core Schematic"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(KubaTechList.Chaotic_Core_Schematic.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 1),

                    setStackSize(DraconicEvolutionList.Awakened_Core.copy(), 8),

                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 36),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 1),
                    setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 + 36),
                    setStackSize(IngotList.Void_Metal_Ingot.copy(), 64 * 25))
                .itemOutputs(KubaTechList.Chaotic_Core_Schematic)
                .eut(RECIPE_UMV)
                .duration(180 * SECONDS)
                .addTo(AssemblyLineItemRecipe);

            // "Shuttle Schematic"
            GTValues.RA.stdBuilder()
                .itemInputs(
                    GTUtility.getIntegratedCircuit(0),
                    setStackSize(AmunRaList.Shuttle_Schematic.copy(), 0),

                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UHV, 64 * 2 + 48),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 32),
                    GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 64),

                    setStackSize(GemList.Nether_Star.copy(), 64 * 5 + 32),

                    setStackSize(IngotList.Abyssal_Alloy_Ingot.copy(), 64),
                    setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 64),
                    setStackSize(IngotList.Awakened_Draconium_Ingot.copy(), 64),
                    setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 28 + 16),
                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 30 + 40),

                    setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64),
                    setStackSize(IngotList.Fluxed_Electrum_Ingot.copy(), 64 * 40),
                    setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 48),
                    setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64),
                    setStackSize(IngotList.Infinity_Ingot.copy(), 64),

                    setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 * 5 + 32),
                    setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 48),
                    setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 88 + 32),
                    setStackSize(IngotList.Octiron_Ingot.copy(), 64),
                    setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 41),

                    setStackSize(OreList.Cadmium_Ore_Stone.copy(), 64),
                    setStackSize(OreList.Caesium_Ore_Stone.copy(), 64),
                    setStackSize(OreList.Cerium_Ore_Stone.copy(), 64),
                    setStackSize(OreList.Lanthanum_Ore_Stone.copy(), 64),
                    setStackSize(OreList.Samarium_Ore_Stone.copy(), 64),

                    setStackSize(OreList.Tartarite_Ore_Stone.copy(), 64))
                .fluidInputs(
                    setStackSize(FluidList.Lubricant.copy(), 1000 * (64 * 6 + 32)),
                    setStackSize(GasList.Radon.copy(), 1000 * (64 * 6 + 56)))
                .itemOutputs(AmunRaList.Shuttle_Schematic)
                .eut(RECIPE_UEV)
                .duration(360 * SECONDS)
                .addTo(AssemblyLineItemRecipe);
        }

        // Stargate Part
        {
            // 2.1.0.0
            {
                // "Nano Circuit of Split Origin"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Nano_Circuit_of_Split_Origin.copy(), 0),

                        setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 32),
                        setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 32),
                        setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 32),
                        setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 32),
                        setStackSize(CircuitList.Bioware_Mainframe.copy(), 2),

                        setStackSize(CircuitList.Nano_Power_IC_Chip.copy(), 64),
                        setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 64),

                        setStackSize(IngotList.Draconium_Ingot.copy(), 32),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 32),
                        setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 16),
                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 16),
                        setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 26),

                        setStackSize(IngotList.Tritanium_Ingot.copy(), 16),

                        setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 2))
                    .fluidInputs(setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 20))
                    .itemOutputs(NewHorizonsCoreModList.Nano_Circuit_of_Split_Origin)
                    .eut(RECIPE_UEV)
                    .duration(400 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Stargate Plate of Split Origin"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Stargate_Plate_of_Split_Origin.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UV, 64),

                        setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 64 * 8),
                        setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64 * 8),
                        setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 64 * 8),
                        setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 64 * 8),
                        setStackSize(CircuitList.Bioware_Mainframe.copy(), 32),

                        setStackSize(CircuitList.Nano_Power_IC_Chip.copy(), 64 * 16),
                        setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 64 * 16),

                        setStackSize(GemList.Nether_Star.copy(), 64),

                        setStackSize(IngotList.Americium_Ingot.copy(), 64 * 12),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 2 + 16),
                        setStackSize(IngotList.Draconium_Ingot.copy(), 64 * 8),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 4 + 16),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 2 + 16),

                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 32),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 31 + 32),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 24 + 32),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 10 + 48),
                        setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 64 * 4),

                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 4),
                        setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 64 * 6 + 32),
                        setStackSize(IngotList.Superconductor_Base_ZPM_Ingot.copy(), 64 * 4),
                        setStackSize(IngotList.Tritanium_Ingot.copy(), 64 * 8),

                        setStackSize(SingularityList.Eternal_Singularity.copy(), 1),

                        setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 32))
                    .fluidInputs(
                        setStackSize(FluidList.IC2_Coolant.copy(), 1000 * (64 * 5)),
                        setStackSize(FluidList.Lubricant.copy(), 1000 * (64 * 2 + 32)),
                        setStackSize(GasList.Radon.copy(), 1000 * (64 + 16)),
                        setStackSize(PlasmaList.Silver_Plasma.copy(), 144 * (64 * 4)))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Plate_of_Split_Origin)
                    .eut(RECIPE_UHV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Stargate Chevron of Split Origin"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Stargate_Chevron_of_Split_Origin.copy(), 0),

                        setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 64 * 16),
                        setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64 * 16),
                        setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 64 * 16),
                        setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 64 * 16),
                        setStackSize(CircuitList.Bioware_Mainframe.copy(), 64),

                        setStackSize(CircuitList.Nano_Power_IC_Chip.copy(), 64 * 32),
                        setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 64 * 32),

                        setStackSize(GemList.Exquisite_Jasper.copy(), 64),
                        setStackSize(GemList.Exquisite_Ruby.copy(), 64),
                        setStackSize(GemList.Nether_Star.copy(), 64 * 2 + 16),

                        setStackSize(IngotList.Americium_Ingot.copy(), 64 * 60),
                        setStackSize(IngotList.Ardite_Ingot.copy(), 64 * 3 + 24),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 2 + 16),
                        setStackSize(IngotList.Draconium_Ingot.copy(), 64 * 16),
                        setStackSize(IngotList.Indalloy_140_Ingot.copy(), 64 * 13 + 32),

                        setStackSize(IngotList.Magnetic_Samarium_Ingot.copy(), 64 * 2 + 32),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 16),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 29 + 32),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 17),
                        setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 64 * 8),

                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 8),
                        setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 64 * 13),
                        setStackSize(IngotList.Superconductor_Base_ZPM_Ingot.copy(), 64),
                        setStackSize(IngotList.Tritanium_Ingot.copy(), 64 * 9),

                        setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 64))
                    .fluidInputs(
                        setStackSize(FluidList.IC2_Coolant.copy(), 1000 * (64 * 10)),
                        setStackSize(FluidList.Lubricant.copy(), 1000 * (64 * 66)),
                        setStackSize(PlasmaList.Silver_Plasma.copy(), 144 * 64))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Chevron_of_Split_Origin)
                    .eut(RECIPE_UHV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Stargate Frame Part of Split Origin"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Stargate_Frame_Part_of_Split_Origin.copy(), 0),

                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 64),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 9),
                        setStackSize(IngotList.Osmiridium_Ingot.copy(), 64),

                        setStackSize(IngotList.Tritanium_Ingot.copy(), 64 * 8))
                    .fluidInputs(setStackSize(FluidList.Wet_Concrete.copy(), 144 * 64 * 8))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Frame_Part_of_Split_Origin)
                    .eut(RECIPE_UHV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);
            }

            // 2.1.2.3qf
            {
                // "Pico Circuit of Polychrome Contest"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Pico_Circuit_of_Polychrome_Contest.copy(), 0),

                        setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 64),
                        setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64),
                        setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 64),
                        setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 64),
                        setStackSize(CircuitList.Bioware_Mainframe.copy(), 4),

                        setStackSize(CircuitList.Nano_Power_IC_Chip.copy(), 64 * 2),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 48),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 48),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 48),
                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 48),

                        setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 64),
                        setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 64 * 2),
                        setStackSize(CircuitList.Ultra_Bio_Mutated_Circuit_Board.copy(), 1),

                        setStackSize(IngotList.Draconium_Ingot.copy(), 64),
                        setStackSize(IngotList.Lanthanum_Ingot.copy(), 8),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 64),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 2),
                        setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 4),

                        setStackSize(IngotList.Osmium_Ingot.copy(), 12),
                        setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 32),
                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 32),
                        setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 64 + 14),
                        setStackSize(IngotList.Tritanium_Ingot.copy(), 32),

                        setStackSize(NewHorizonsCoreModList.Pico_Wafer.copy(), 4),

                        setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 4))
                    .fluidInputs(
                        setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 40),
                        setStackSize(FluidList.UU_Matter.copy(), 1000 * 8))
                    .itemOutputs(NewHorizonsCoreModList.Pico_Circuit_of_Polychrome_Contest)
                    .eut(RECIPE_UEV)
                    .duration(500 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Quantum Circuit of Polychrome Contest"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Quantum_Circuit_of_Polychrome_Contest.copy(), 0),

                        setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 64 * 2),
                        setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64 * 2),
                        setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 64 * 2),
                        setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 64 * 2),
                        setStackSize(CircuitList.Bioware_Mainframe.copy(), 8),

                        setStackSize(CircuitList.Nano_Power_IC_Chip.copy(), 64 * 4),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 64 * 2 + 32),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64 * 2 + 32),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 64 * 2 + 32),
                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 64 * 2 + 32),

                        setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 64 * 2),
                        setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 64),
                        setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 64 * 4),
                        setStackSize(CircuitList.Ultra_Bio_Mutated_Circuit_Board.copy(), 2),

                        setStackSize(IngotList.Bedrockium_Ingot.copy(), 4),
                        setStackSize(IngotList.Draconium_Ingot.copy(), 64 * 2),
                        setStackSize(IngotList.Indium_Ingot.copy(), 8),
                        setStackSize(IngotList.Lanthanum_Ingot.copy(), 24),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 2),

                        setStackSize(IngotList.Neutronium_Ingot.copy(), 36),
                        setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 24),
                        setStackSize(IngotList.Osmium_Ingot.copy(), 40),
                        setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 64),
                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64),

                        setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 64 * 2 + 54),
                        setStackSize(IngotList.Tritanium_Ingot.copy(), 64),

                        setStackSize(NewHorizonsCoreModList.Pico_Wafer.copy(), 8),

                        setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 8))
                    .fluidInputs(
                        setStackSize(FluidList.IC2_Coolant.copy(), 1000 * (64 + 16)),
                        setStackSize(FluidList.UU_Matter.copy(), 1000 * 40))
                    .itemOutputs(NewHorizonsCoreModList.Quantum_Circuit_of_Polychrome_Contest)
                    .eut(RECIPE_UIV)
                    .duration(1000 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Stargate Plate of Polychrome Contest"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Stargate_Plate_of_Polychrome_Contest.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UEV, 64),

                        setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 64 * 32),
                        setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64 * 32),
                        setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 64 * 32),
                        setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 64 * 32),
                        setStackSize(CircuitList.Bioware_Mainframe.copy(), 64 * 2),

                        setStackSize(CircuitList.Nano_Power_IC_Chip.copy(), 64 * 64),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 64 * 40),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64 * 40),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 64 * 40),
                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 64 * 40),

                        setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 64 * 32),
                        setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 64 * 16),
                        setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 64 * 64),
                        setStackSize(CircuitList.Ultra_Bio_Mutated_Circuit_Board.copy(), 32),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 4),

                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 2),
                        setStackSize(IngotList.Bedrockium_Ingot.copy(), 64),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 18 + 16),
                        setStackSize(IngotList.Draconium_Ingot.copy(), 64 * 36 + 32),
                        setStackSize(IngotList.Indium_Ingot.copy(), 64 * 2),

                        setStackSize(IngotList.Infinity_Catalyst_Ingot.copy(), 64 * 16),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 10 + 48),
                        setStackSize(IngotList.Lanthanum_Ingot.copy(), 64 * 6),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 27),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 32),

                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 21),
                        setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 64 * 6),
                        setStackSize(IngotList.Osmium_Ingot.copy(), 64 * 10),
                        setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 64 * 16),
                        setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 9 + 48),

                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 16),
                        setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 64 * 45 + 32),
                        setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 64 * 4),
                        setStackSize(IngotList.Tritanium_Ingot.copy(), 64 * 20),

                        setStackSize(NewHorizonsCoreModList.Pico_Wafer.copy(), 64 * 2),

                        setStackSize(SingularityList.Eternal_Singularity.copy(), 1),

                        setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 128))
                    .fluidInputs(
                        setStackSize(FluidList.IC2_Coolant.copy(), 1000 * (64 * 20)),
                        setStackSize(FluidList.Lubricant.copy(), 1000 * 64),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 9)),
                        setStackSize(FluidList.UU_Matter.copy(), 1000 * (64 * 10)),
                        setStackSize(GasList.Radon.copy(), 1000 * (64 * 6)),
                        setStackSize(PlasmaList.Silver_Plasma.copy(), 144 * 64 * 4))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Plate_of_Polychrome_Contest)
                    .eut(RECIPE_UIV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Stargate Chevron of Polychrome Contest"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Stargate_Chevron_of_Polychrome_Contest.copy(), 0),

                        setStackSize(CircuitList.Advanced_SMD_Capacitor.copy(), 64 * 64),
                        setStackSize(CircuitList.Advanced_SMD_Diode.copy(), 64 * 64),
                        setStackSize(CircuitList.Advanced_SMD_Resistor.copy(), 64 * 64),
                        setStackSize(CircuitList.Advanced_SMD_Transistor.copy(), 64 * 64),
                        setStackSize(CircuitList.Bioware_Mainframe.copy(), 64 * 4),

                        setStackSize(CircuitList.Nano_Power_IC_Chip.copy(), 64 * 128),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 64 * 80),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64 * 80),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 64 * 80),
                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 64 * 80),

                        setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 64 * 64),
                        setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 64 * 32),
                        setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 64 * 128),
                        setStackSize(CircuitList.Ultra_Bio_Mutated_Circuit_Board.copy(), 64),

                        setStackSize(GemList.Exquisite_Jasper.copy(), 64),
                        setStackSize(GemList.Exquisite_Ruby.copy(), 64),
                        setStackSize(GemList.Nether_Star.copy(), 64 * 2 + 16),

                        setStackSize(IngotList.Ardite_Ingot.copy(), 64 * 3 + 24),
                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 10),
                        setStackSize(IngotList.Bedrockium_Ingot.copy(), 64 * 2),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64 * 80),
                        setStackSize(IngotList.Draconium_Ingot.copy(), 64 * 71),

                        setStackSize(IngotList.Indium_Ingot.copy(), 64 * 4),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 40 + 16),
                        setStackSize(IngotList.Lanthanum_Ingot.copy(), 64 * 12),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 9),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 64),

                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 19),
                        setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 64 * 12),
                        setStackSize(IngotList.Osmium_Ingot.copy(), 64 * 20),
                        setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 64 * 32),
                        setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 27 + 48),

                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 32),
                        setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 64 * 91),
                        setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 64),
                        setStackSize(IngotList.Tritanium_Ingot.copy(), 64 * 33),

                        setStackSize(NewHorizonsCoreModList.Pico_Wafer.copy(), 64 * 4),

                        setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 256))
                    .fluidInputs(
                        setStackSize(FluidList.IC2_Coolant.copy(), 1000 * (64 * 40)),
                        setStackSize(FluidList.Lubricant.copy(), 1000 * (64 * 6)),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 27)),
                        setStackSize(FluidList.UU_Matter.copy(), 1000 * (64 * 20)),
                        setStackSize(PlasmaList.Silver_Plasma.copy(), 144 * 64))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Chevron_of_Polychrome_Contest)
                    .eut(RECIPE_UIV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Stargate Frame Part of Polychrome Contest"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Stargate_Frame_Part_of_Polychrome_Contest.copy(), 0),

                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 64),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 9),
                        setStackSize(IngotList.Osmiridium_Ingot.copy(), 64),

                        setStackSize(IngotList.Tritanium_Ingot.copy(), 64 * 8))
                    .fluidInputs(setStackSize(FluidList.Wet_Concrete.copy(), 144 * 64 * 8))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Frame_Part_of_Polychrome_Contest)
                    .eut(RECIPE_UIV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);
            }

            // 2.2.3
            {
                // "Pico Circuit of Dimensional Duplicity"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Pico_Circuit_of_Dimensional_Duplicity.copy(), 0),

                        setStackSize(CircuitList.Bioware_Mainframe.copy(), 4),
                        setStackSize(CircuitList.Nano_Power_IC_Chip.copy(), 64 * 2),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 64 + 48),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64 + 48),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 64 + 48),

                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 64 + 48),
                        setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 64),
                        setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 64 * 2),
                        setStackSize(CircuitList.Ultra_Bio_Mutated_Circuit_Board.copy(), 1),

                        setStackSize(IngotList.Draconium_Ingot.copy(), 64),
                        setStackSize(IngotList.Lanthanum_Ingot.copy(), 8),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 56),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 2),
                        setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 4),

                        setStackSize(IngotList.Osmium_Ingot.copy(), 12),
                        setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 32),
                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 32),
                        setStackSize(IngotList.Tritanium_Ingot.copy(), 32),

                        setStackSize(NewHorizonsCoreModList.Pico_Wafer.copy(), 4),

                        setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 4))
                    .fluidInputs(
                        setStackSize(FluidList.IC2_Coolant.copy(), 1000 * 40),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 + 14)),
                        setStackSize(FluidList.UU_Matter.copy(), 1000 * 8))
                    .itemOutputs(NewHorizonsCoreModList.Pico_Circuit_of_Dimensional_Duplicity)
                    .eut(RECIPE_UMV)
                    .duration(500 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Quantum Circuit of Dimensional Duplicity"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Quantum_Circuit_of_Dimensional_Duplicity.copy(), 0),

                        setStackSize(CircuitList.Bioware_Mainframe.copy(), 8),
                        setStackSize(CircuitList.Nano_Power_IC_Chip.copy(), 64 * 4),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 64 * 4 + 32),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64 * 4 + 32),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 64 * 4 + 32),

                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 64 * 4 + 32),
                        setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 64 * 2),
                        setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 64),
                        setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 64 * 4),
                        setStackSize(CircuitList.Ultra_Bio_Mutated_Circuit_Board.copy(), 2),

                        setStackSize(IngotList.Draconium_Ingot.copy(), 64 * 2),
                        setStackSize(IngotList.Indium_Ingot.copy(), 8),
                        setStackSize(IngotList.Lanthanum_Ingot.copy(), 24),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 64 + 48),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 36),

                        setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 24),
                        setStackSize(IngotList.Osmium_Ingot.copy(), 40),
                        setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 64),
                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64),
                        setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 26),

                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 4),
                        setStackSize(IngotList.Tritanium_Ingot.copy(), 64),

                        setStackSize(NewHorizonsCoreModList.Pico_Wafer.copy(), 8),

                        setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 8))
                    .fluidInputs(
                        setStackSize(FluidList.IC2_Coolant.copy(), 1000 * (64 + 16)),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 2 + 28)),
                        setStackSize(FluidList.UU_Matter.copy(), 1000 * 40))
                    .itemOutputs(NewHorizonsCoreModList.Quantum_Circuit_of_Dimensional_Duplicity)
                    .eut(RECIPE_UXV)
                    .duration(1000 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Stargate Plate of Dimensional Duplicity"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Stargate_Plate_of_Dimensional_Duplicity.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 64 * 2),

                        setStackSize(CircuitList.Bioware_Mainframe.copy(), 64 * 2),
                        setStackSize(CircuitList.Nano_Power_IC_Chip.copy(), 64 * 64),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 64 * 72),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64 * 72),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 64 * 72),

                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 64 * 72),
                        setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 64 * 32),
                        setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 64 * 16),
                        setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 64 * 64),
                        setStackSize(CircuitList.Ultra_Bio_Mutated_Circuit_Board.copy(), 32),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 64),

                        setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 64 * 8),
                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 16),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 * 12),
                        setStackSize(IngotList.Draconium_Ingot.copy(), 64 * 32),
                        setStackSize(IngotList.Hypogen_Ingot.copy(), 64 * 68),

                        setStackSize(IngotList.Indium_Ingot.copy(), 64 * 2),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 35 + 16),
                        setStackSize(IngotList.Lanthanum_Ingot.copy(), 64 * 6),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 28),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 3609),

                        setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 64 * 6),
                        setStackSize(IngotList.Osmium_Ingot.copy(), 64 * 10),
                        setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 64 * 16),
                        setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 9),
                        setStackSize(IngotList.Quantum_Ingot.copy(), 64 * 8),

                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 16),
                        setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 64 * 6 + 32),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 37 + 32),
                        setStackSize(IngotList.Superconductor_Base_UMV_Ingot.copy(), 64 * 16),
                        setStackSize(IngotList.Titansteel_Ingot.copy(), 64 * 6),

                        setStackSize(IngotList.Tritanium_Ingot.copy(), 64 * 16),

                        setStackSize(MultiMachineCasingList.Dimensional_Bridge.copy(), 64),

                        setStackSize(NewHorizonsCoreModList.Pico_Wafer.copy(), 64 * 2),

                        setStackSize(SingularityList.Eternal_Singularity.copy(), 16),

                        setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 128))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * (64 * 2)),
                        setStackSize(
                            FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(),
                            144 * (64 * 16)),
                        setStackSize(FluidList.IC2_Coolant.copy(), 1000 * (64 * 20)),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 57)),
                        setStackSize(FluidList.UU_Matter.copy(), 1000 * (64 * 10)))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Plate_of_Dimensional_Duplicity)
                    .eut(RECIPE_UXV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Stargate Chevron of Dimensional Duplicity"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Stargate_Chevron_of_Dimensional_Duplicity.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 64),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UMV, 64 * 4),

                        setStackSize(CircuitList.Bioware_Mainframe.copy(), 64 * 4),
                        setStackSize(CircuitList.Nano_Power_IC_Chip.copy(), 64 * 128),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 64 * 144),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64 * 144),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 64 * 144),

                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 64 * 144),
                        setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 64 * 64),
                        setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 64 * 32),
                        setStackSize(CircuitList.Random_Access_Memory_Chip.copy(), 64 * 128),
                        setStackSize(CircuitList.Ultra_Bio_Mutated_Circuit_Board.copy(), 64),

                        setStackSize(GemList.Exquisite_Jasper.copy(), 16),
                        setStackSize(GemList.Exquisite_Opal.copy(), 16),
                        setStackSize(GemList.Exquisite_Ruby.copy(), 16),
                        setStackSize(GemList.Exquisite_Sapphire.copy(), 16),
                        setStackSize(GemList.Nether_Star.copy(), 64 * 160),

                        setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 64 * 16),
                        setStackSize(IngotList.Attuned_Tengam_Ingot.copy(), 64 * 96),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64 * 37),
                        setStackSize(IngotList.Draconium_Ingot.copy(), 64 * 64),
                        setStackSize(IngotList.Hypogen_Ingot.copy(), 64 * 229),

                        setStackSize(IngotList.Indium_Ingot.copy(), 64 * 4),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 19 + 32),
                        setStackSize(IngotList.Lanthanum_Ingot.copy(), 64 * 12),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64 * 9),
                        setStackSize(IngotList.Naquadria_Ingot.copy(), 64 * 56),

                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 3618),
                        setStackSize(IngotList.Niobium_Titanium_Ingot.copy(), 64 * 12),
                        setStackSize(IngotList.Osmiridium_Ingot.copy(), 64 * 2 + 16),
                        setStackSize(IngotList.Osmium_Ingot.copy(), 64 * 20),
                        setStackSize(IngotList.Polybenzimidazole_PBI_Bar.copy(), 64 * 32),

                        setStackSize(IngotList.Quantium_Ingot.copy(), 64 * 38),
                        setStackSize(IngotList.Quantum_Ingot.copy(), 64 * 16),
                        setStackSize(IngotList.Silicone_Rubber_Bar.copy(), 64 * 32),
                        setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 64 * 13),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 128 + 32),

                        setStackSize(IngotList.Superconductor_Base_UMV_Ingot.copy(), 64 * 16),
                        setStackSize(IngotList.Titansteel_Ingot.copy(), 64 * 16),
                        setStackSize(IngotList.Tritanium_Ingot.copy(), 64 * 32),

                        setStackSize(MultiMachineCasingList.Dimensional_Bridge.copy(), 64 * 2),

                        setStackSize(NewHorizonsCoreModList.Pico_Wafer.copy(), 64 * 4),

                        setStackSize(WireList.Superconductor_UHV_Wire_1x.copy(), 64 * 256))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * (64 * 16)),
                        setStackSize(
                            FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(),
                            144 * 64 * 16),
                        setStackSize(FluidList.IC2_Coolant.copy(), 1000 * (64 * 40)),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 172 + 32)),
                        setStackSize(FluidList.UU_Matter.copy(), 1000 * (64 * 20)))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Chevron_of_Dimensional_Duplicity)
                    .eut(RECIPE_UXV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Stargate Frame Part of Dimensional Duplicity"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Stargate_Frame_Part_of_Dimensional_Duplicity.copy(), 0),

                        setStackSize(IngotList.Abyssal_Alloy_Ingot.copy(), 64),
                        setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 64),
                        setStackSize(IngotList.Californium_Ingot.copy(), 64),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64),
                        setStackSize(IngotList.Cosmic_Neutronium_Ingot.copy(), 64),

                        setStackSize(IngotList.Hypogen_Ingot.copy(), 64),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 64),
                        setStackSize(IngotList.Naquadah_Alloy_Ingot.copy(), 64),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 3601),
                        setStackSize(IngotList.Osmiridium_Ingot.copy(), 64),

                        setStackSize(IngotList.Quantum_Ingot.copy(), 64),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 17),
                        setStackSize(IngotList.Sunnarium_Ingot.copy(), 64),
                        setStackSize(IngotList.Superconductor_Base_UMV_Ingot.copy(), 64 * 17),
                        setStackSize(IngotList.Tairitsu_Ingot.copy(), 64),

                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64))
                    .fluidInputs(
                        setStackSize(
                            FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(),
                            144 * 64 * 16))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Frame_Part_of_Dimensional_Duplicity)
                    .eut(RECIPE_UXV)
                    .duration(3600 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);
            }

            // 2.3.0
            {
                // "Stargate Plate of Harmonic Breakthrough"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Stargate_Plate_of_Harmonic_Breakthrough.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 64 * 2),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 64 * 2),

                        setStackSize(CircuitList.Optical_Circuit_Board.copy(), 64),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 64 * 80),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64 * 80),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 64 * 80),
                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 64 * 80),
                        setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 64 * 64),
                        setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 64 * 32),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 512),

                        setStackSize(GTItemList.Black_Dwarf_Matter_Nanites.copy(), 16),
                        setStackSize(GTItemList.Energised_Tesseract.copy(), 32),
                        setStackSize(GTItemList.Neutronium_Nanites.copy(), 64 * 6),
                        setStackSize(GTItemList.Universium_Nanites.copy(), 16),
                        setStackSize(GTItemList.White_Dwarf_Matter_Nanites.copy(), 16),

                        setStackSize(IngotList.Indium_Ingot.copy(), 64 * 4),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 33 + 8),
                        setStackSize(IngotList.Lanthanum_Ingot.copy(), 64 * 9),
                        setStackSize(IngotList.Magmatter_Ingot.copy(), 64 * 16),
                        setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(), 64 * 38),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 3618),
                        setStackSize(IngotList.Osmium_Ingot.copy(), 64 * 16),
                        setStackSize(IngotList.Radox_Polymer_Bar.copy(), 64 * 4),
                        setStackSize(IngotList.Shirabon_Ingot.copy(), 64 * 27 + 8),
                        setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 64 * 13),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 58 + 8),
                        setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 64 * 24),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 4),
                        setStackSize(IngotList.Universium_Ingot.copy(), 64 * 35 + 8),

                        setStackSize(MultiMachineCasingList.Dimensional_Bridge.copy(), 64),
                        setStackSize(NewHorizonsCoreModList.Pico_Wafer.copy(), 64 * 4),
                        setStackSize(SingularityList.Eternal_Singularity.copy(), 16),
                        setStackSize(TecTechList.Gallifreyan_Stabilisation_Field_Generator.copy(), 64))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * (64 * 4)),
                        setStackSize(
                            FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(),
                            144 * (64 * 16)),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 63)),
                        setStackSize(FluidList.UU_Matter.copy(), 1000 * (64 * 10)))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Plate_of_Harmonic_Breakthrough)
                    .eut(RECIPE_UMV)
                    .duration(125_000 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Stargate Chevron of Harmonic Breakthrough"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Stargate_Chevron_of_Harmonic_Breakthrough.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.MAX, 64),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 64 * 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 64 * 2),

                        setStackSize(CircuitList.Optical_Circuit_Board.copy(), 64),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 64 * 80),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64 * 80),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 64 * 80),
                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 64 * 80),
                        setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 64 * 64),
                        setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 64 * 32),

                        setStackSize(GemList.Exquisite_Jasper.copy(), 16),
                        setStackSize(GemList.Exquisite_Opal.copy(), 16),
                        setStackSize(GemList.Exquisite_Ruby.copy(), 16),
                        setStackSize(GemList.Exquisite_Sapphire.copy(), 16),
                        setStackSize(GemList.Nether_Star.copy(), 64 * 2048),

                        setStackSize(GTItemList.Energised_Tesseract.copy(), 64 * 6),
                        setStackSize(GTItemList.Neutronium_Nanites.copy(), 64 * 27),

                        setStackSize(IngotList.Indium_Ingot.copy(), 64 * 4),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 128),
                        setStackSize(IngotList.Lanthanum_Ingot.copy(), 64 * 9),
                        setStackSize(IngotList.Magmatter_Ingot.copy(), 64 * 80),
                        setStackSize(
                            IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(),
                            64 * 146 + 8),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 3618),
                        setStackSize(IngotList.Osmium_Ingot.copy(), 64 * 16),
                        setStackSize(IngotList.Radox_Polymer_Bar.copy(), 64 * 4),
                        setStackSize(IngotList.Shirabon_Ingot.copy(), 64 * 18 + 8),
                        setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 64 * 13),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 131 + 32),
                        setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 64 * 68),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 13),
                        setStackSize(IngotList.Universium_Ingot.copy(), 64 * 162 + 32),

                        setStackSize(NewHorizonsCoreModList.Pico_Wafer.copy(), 64 * 4),

                        setStackSize(TecTechList.Reinforced_Spatial_Structure_Casing.copy(), 64 * 2))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * (64 * 20)),
                        setStackSize(
                            FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(),
                            144 * 64 * 16),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 151)),
                        setStackSize(FluidList.UU_Matter.copy(), 1000 * (64 * 20)))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Chevron_of_Harmonic_Breakthrough)
                    .eut(RECIPE_UMV)
                    .duration(125_000 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Stargate Frame Part of Harmonic Breakthrough"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Stargate_Frame_Part_of_Harmonic_Breakthrough.copy(), 0),

                        setStackSize(IngotList.Abyssal_Alloy_Ingot.copy(), 64),
                        setStackSize(IngotList.Astral_Titanium_Ingot.copy(), 64),
                        setStackSize(IngotList.Californium_Ingot.copy(), 64),
                        setStackSize(IngotList.Celestial_Tungsten_Ingot.copy(), 64),
                        setStackSize(IngotList.Hypogen_Ingot.copy(), 64),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 64),
                        setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(), 64),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 3601),
                        setStackSize(IngotList.Osmiridium_Ingot.copy(), 64),
                        setStackSize(IngotList.Quantum_Ingot.copy(), 64),
                        setStackSize(IngotList.Shirabon_Ingot.copy(), 64),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 17),
                        setStackSize(IngotList.Superconductor_Base_UMV_Ingot.copy(), 64),
                        setStackSize(IngotList.Tairitsu_Ingot.copy(), 64),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64),
                        setStackSize(IngotList.Universium_Ingot.copy(), 64 * 17))
                    .fluidInputs(
                        setStackSize(
                            FluidList.Excited_Dimensionally_Transcendent_Exotic_Catalyst.copy(),
                            144 * 64 * 16))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Frame_Part_of_Harmonic_Breakthrough)
                    .eut(RECIPE_UMV)
                    .duration(125_000 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);
            }

            // 2.7.0
            {
                // "Pico Circuit of Heavenly Fire"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Pico_Circuit_of_Heavenly_Fire.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 2),

                        setStackSize(CircuitList.Optical_Circuit_Board.copy(), 1),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 48),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 48),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 48),
                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 48),

                        setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 64),

                        setStackSize(IngotList.Lanthanum_Ingot.copy(), 8),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 2),
                        setStackSize(IngotList.Osmium_Ingot.copy(), 8),
                        setStackSize(IngotList.Radox_Polymer_Bar.copy(), 4),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 4),

                        setStackSize(NewHorizonsCoreModList.Pico_Wafer.copy(), 4))
                    .fluidInputs(
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 26),
                        setStackSize(FluidList.UU_Matter.copy(), 1000 * 8))
                    .itemOutputs(NewHorizonsCoreModList.Pico_Circuit_of_Heavenly_Fire)
                    .eut(RECIPE_UMV)
                    .duration(500 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Quantum Circuit of Heavenly Fire"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Quantum_Circuit_of_Heavenly_Fire.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 4),

                        setStackSize(CircuitList.Optical_Circuit_Board.copy(), 2),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 64 * 2 + 32),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64 * 2 + 32),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 64 * 2 + 32),
                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 64 * 2 + 32),

                        setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 64 * 2),
                        setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 64),

                        setStackSize(IngotList.Indium_Ingot.copy(), 8),
                        setStackSize(IngotList.Lanthanum_Ingot.copy(), 18),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 36),
                        setStackSize(IngotList.Osmium_Ingot.copy(), 32),
                        setStackSize(IngotList.Radox_Polymer_Bar.copy(), 8),

                        setStackSize(IngotList.Shirabon_Ingot.copy(), 16),
                        setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 26),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 4),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 8),

                        setStackSize(NewHorizonsCoreModList.Pico_Wafer.copy(), 8))
                    .fluidInputs(
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * 52),
                        setStackSize(FluidList.UU_Matter.copy(), 1000 * 40))
                    .itemOutputs(NewHorizonsCoreModList.Quantum_Circuit_of_Heavenly_Fire)
                    .eut(RECIPE_UMV)
                    .duration(1000 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Stargate Plate of Heavenly Fire"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Stargate_Plate_of_Heavenly_Fire.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 64 * 2),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 64),

                        setStackSize(CircuitList.Optical_Circuit_Board.copy(), 32),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 64 * 40),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64 * 40),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 64 * 40),
                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 64 * 40),
                        setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 64 * 32),
                        setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 64 * 16),

                        setStackSize(GemList.Nether_Star.copy(), 64 * 512),

                        setStackSize(GTItemList.Black_Dwarf_Matter_Nanites.copy(), 16),
                        setStackSize(GTItemList.Energised_Tesseract.copy(), 32),
                        setStackSize(GTItemList.Neutronium_Nanites.copy(), 64 * 6),
                        setStackSize(GTItemList.Six_Phased_Copper_Nanites.copy(), 16),
                        setStackSize(GTItemList.Universium_Nanites.copy(), 16),

                        setStackSize(GTItemList.White_Dwarf_Matter_Nanites.copy(), 16),

                        setStackSize(IngotList.Eternity_Ingot.copy(), 64 * 8),
                        setStackSize(IngotList.Indium_Ingot.copy(), 64 * 2),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 32),
                        setStackSize(IngotList.Lanthanum_Ingot.copy(), 64 * 4 + 32),
                        setStackSize(IngotList.Magmatter_Ingot.copy(), 64 * 33),
                        setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(), 64 * 38),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 9),
                        setStackSize(IngotList.Osmium_Ingot.copy(), 64 * 8),
                        setStackSize(IngotList.Radox_Polymer_Bar.copy(), 64 * 2),
                        setStackSize(IngotList.Shirabon_Ingot.copy(), 64 * 4),
                        setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 64 * 6 + 32),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 39),
                        setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 64 * 72),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 2),
                        setStackSize(IngotList.Universium_Ingot.copy(), 64 * 42),

                        setStackSize(NewHorizonsCoreModList.Pico_Wafer.copy(), 64 * 2),

                        setStackSize(SingularityList.Chronic_Singularity.copy(), 64),

                        setStackSize(TecTechList.Gallifreyan_Stabilisation_Field_Generator.copy(), 64),
                        setStackSize(TecTechList.Harmonic_Phonon_Transmission_Conduit.copy(), 32),
                        setStackSize(TecTechList.Transcendentally_Amplified_Magnetic_Confinement_Casing.copy(), 64))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * (64 * 4)),
                        setStackSize(
                            FluidList.Excited_Dimensionally_Transcendent_Stellar_Catalyst.copy(),
                            1000 * 64 * 8),
                        setStackSize(FluidList.Lossless_Phonon_Transfer_Medium.copy(), 1000 * 64 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 63)),
                        setStackSize(FluidList.UU_Matter.copy(), 1000 * (64 * 10)),
                        setStackSize(PlasmaList.Degenerate_Quark_Gluon_Plasma.copy(), 1000 * 64 * 16))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Plate_of_Heavenly_Fire)
                    .eut(RECIPE_UXV)
                    .duration(125_000 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Stargate Chevron of Heavenly Fire"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Stargate_Chevron_of_Heavenly_Fire.copy(), 0),

                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.MAX, 64),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UXV, 64 * 4),
                        GTOreDictUnificator.get(OrePrefixes.circuit, Materials.UIV, 64 * 2),

                        setStackSize(CircuitList.Optical_Circuit_Board.copy(), 64),
                        setStackSize(CircuitList.Optical_SMD_Capacitor.copy(), 64 * 80),
                        setStackSize(CircuitList.Optical_SMD_Diode.copy(), 64 * 80),
                        setStackSize(CircuitList.Optical_SMD_Resistor.copy(), 64 * 80),
                        setStackSize(CircuitList.Optical_SMD_Transistor.copy(), 64 * 80),
                        setStackSize(CircuitList.Piko_Power_IC_Chip.copy(), 64 * 64),
                        setStackSize(CircuitList.Quantum_Power_IC_Chip.copy(), 64 * 32),

                        setStackSize(GemList.Exquisite_Jasper.copy(), 64),
                        setStackSize(GemList.Exquisite_Opal.copy(), 64),
                        setStackSize(GemList.Exquisite_Ruby.copy(), 64),
                        setStackSize(GemList.Exquisite_Sapphire.copy(), 64),
                        setStackSize(GemList.Nether_Star.copy(), 64 * 2048),

                        setStackSize(GTItemList.Energised_Tesseract.copy(), 64 * 6),
                        setStackSize(GTItemList.Neutronium_Nanites.copy(), 64 * 27),
                        setStackSize(IngotList.Indium_Ingot.copy(), 64 * 48),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 64 * 128),
                        setStackSize(IngotList.Lanthanum_Ingot.copy(), 64 * 9),
                        setStackSize(IngotList.Magmatter_Ingot.copy(), 64 * 226),
                        setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(), 64 * 149),
                        setStackSize(IngotList.Neutronium_Ingot.copy(), 64 * 18),
                        setStackSize(IngotList.Osmiridium_Ingot.copy(), 64 * 2 + 16),
                        setStackSize(IngotList.Osmium_Ingot.copy(), 64 * 16),
                        setStackSize(IngotList.Radox_Polymer_Bar.copy(), 64 * 4),
                        setStackSize(IngotList.Shirabon_Ingot.copy(), 64 * 8),
                        setStackSize(IngotList.Soldering_Alloy_Ingot.copy(), 64 * 13),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 64 * 115),
                        setStackSize(IngotList.Superconductor_Base_UHV_Ingot.copy(), 64 * 68),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64 * 4),
                        setStackSize(IngotList.Universium_Ingot.copy(), 64 * 162 + 32),

                        setStackSize(NewHorizonsCoreModList.Pico_Wafer.copy(), 64 * 4),

                        setStackSize(TecTechList.Reinforced_Spatial_Structure_Casing.copy(), 64),
                        setStackSize(TecTechList.Reinforced_Temporal_Structure_Casing.copy(), 64),
                        setStackSize(TecTechList.Spatially_Transcendent_Gravitational_Lens_Block.copy(), 64))
                    .fluidInputs(
                        setStackSize(FluidList.Dimensionally_Shifted_Superfluid.copy(), 1000 * (64 * 20)),
                        setStackSize(
                            FluidList.Excited_Dimensionally_Transcendent_Stellar_Catalyst.copy(),
                            1000 * 64 * 8),
                        setStackSize(FluidList.Lossless_Phonon_Transfer_Medium.copy(), 1000 * 64 * 4),
                        setStackSize(FluidList.Mutated_Living_Solder.copy(), 144 * (64 * 151)),
                        setStackSize(FluidList.UU_Matter.copy(), 1000 * (64 * 20)),
                        setStackSize(PlasmaList.Degenerate_Quark_Gluon_Plasma.copy(), 1000 * 64 * 16))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Chevron_of_Heavenly_Fire)
                    .eut(RECIPE_UXV)
                    .duration(125_000 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);

                // "Stargate Frame Part of Heavenly Fire"
                GTValues.RA.stdBuilder()
                    .itemInputs(
                        setStackSize(NewHorizonsCoreModList.Stargate_Frame_Part_of_Heavenly_Fire.copy(), 0),

                        setStackSize(IngotList.Black_Dwarf_Matter_Ingot.copy(), 64),
                        setStackSize(IngotList.Creon_Ingot.copy(), 64),
                        setStackSize(IngotList.Eternity_Ingot.copy(), 64),
                        setStackSize(IngotList.Hypogen_Ingot.copy(), 64),
                        setStackSize(IngotList.Infinity_Ingot.copy(), 64),
                        setStackSize(IngotList.Magmatter_Ingot.copy(), 64),
                        setStackSize(IngotList.Magnetohydrodynamically_Constrained_Star_Matter_Ingot.copy(), 64),
                        setStackSize(IngotList.Mellion_Ingot.copy(), 64),
                        setStackSize(IngotList.Proto_Halkonite_Steel_Ingot.copy(), 64),
                        setStackSize(IngotList.Shirabon_Ingot.copy(), 64),
                        setStackSize(IngotList.Six_Phased_Copper_Ingot.copy(), 64),
                        setStackSize(IngotList.SpaceTime_Ingot.copy(), 64),
                        setStackSize(IngotList.Superconductor_Base_UMV_Ingot.copy(), 64),
                        setStackSize(IngotList.Transcendent_Metal_Ingot.copy(), 64),
                        setStackSize(IngotList.Universium_Ingot.copy(), 64 * 17),
                        setStackSize(IngotList.White_Dwarf_Matter_Ingot.copy(), 64))
                    .fluidInputs(
                        setStackSize(
                            FluidList.Excited_Dimensionally_Transcendent_Stellar_Catalyst.copy(),
                            1000 * 64 * 8),
                        setStackSize(FluidList.Lossless_Phonon_Transfer_Medium.copy(), 1000 * 64 * 4),
                        setStackSize(PlasmaList.Degenerate_Quark_Gluon_Plasma.copy(), 1000 * 64 * 16))
                    .itemOutputs(NewHorizonsCoreModList.Stargate_Frame_Part_of_Heavenly_Fire)
                    .eut(RECIPE_UXV)
                    .duration(125_000 * SECONDS)
                    .addTo(AssemblyLineItemRecipe);
            }
        }
    }
}
