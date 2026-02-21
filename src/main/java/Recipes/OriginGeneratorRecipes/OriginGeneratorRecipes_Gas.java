package Recipes.OriginGeneratorRecipes;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import goodgenerator.items.GGMaterial;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.FluidFuelOfGeneratorFrontend;

public class OriginGeneratorRecipes_Gas {

    public static final RecipeMap<RecipeMapBackend> GeneratorRecipes_Gas = RecipeMapBuilder
        .of("Origin of Generator with Gas")
        .maxIO(1, 0, 1, 1)
        .minInputs(1, 1)
        .neiHandlerInfo(builder -> builder.setHeight(128))
        .frontend(FluidFuelOfGeneratorFrontend::new)
        .build();

    private static final String[] FuelBaseline = new String[] {
        // Hydrogen
        "20,000",
        // "Natural Gas"
        "20,000",
        // "Carbon Monoxide"
        "24,000",
        // "Wood Gas"
        "24,000",
        // "Sulfuric Gas"
        "25,000",
        // Biogas
        "40,000",
        // "Sulfuric Naphtha"
        "40,000",
        // Cyclopentadiene
        "70,000",
        // "Coal Gas"
        "96,000",
        // Methane
        "104,000",
        // Ethylene
        "128,000",
        // "Refinery Gas"
        "160,000",
        // Ethane
        "168,000",
        // Propene
        "192,000",
        // Butadiene
        "206,000",
        // Naphtha
        "220,000",
        // Propane
        "232,000",
        // "Rocket Fuel"
        "250,000",
        // Butene
        "256,000",
        // Phenol
        "288,000",
        // Butane
        "296,000",
        // LPG
        "320,000",
        // Toluene
        "328,000",
        // Benzene
        "369,000",
        // Ether
        "537,000",
        // "Naquadah Gas"
        "1,024,000",
        // "Nefarious Gas"
        "1,200,000",
        // Nitrobenzene
        "1,600,000" };

    private static final int[] FuelCalorificValue = new int[] {
        // Hydrogen
        20_000,
        // "Natural Gas"
        20_000,
        // "Carbon Monoxide"
        24_000,
        // "Wood Gas"
        24_000,
        // "Sulfuric Gas"
        25_000,
        // Biogas
        40_000,
        // "Sulfuric Naphtha"
        40_000,
        // Cyclopentadiene
        70_000,
        // "Coal Gas"
        96_000,
        // Methane
        104_000,
        // Ethylene
        128_000,
        // "Refinery Gas"
        160_000,
        // Ethane
        168_000,
        // Propene
        192_000,
        // Butadiene
        206_000,
        // Naphtha
        220_000,
        // Propane
        232_000,
        // "Rocket Fuel"
        250_000,
        // Butene
        256_000,
        // Phenol
        288_000,
        // Butane
        296_000,
        // LPG
        320_000,
        // Toluene
        328_000,
        // Benzene
        369_000,
        // Ether
        537_000,
        // "Naquadah Gas"
        1_024_000,
        // "Nefarious Gas"
        1_200_000,
        // Nitrobenzene
        1_600_000 };

    private static final FluidStack[] Fuel = new FluidStack[] {
        // Hydrogen
        Materials.Hydrogen.getGas(1),
        // "Natural Gas"
        FluidRegistry.getFluidStack("gas_natural_gas", 1),
        // "Carbon Monoxide"
        Materials.CarbonMonoxide.getGas(1),
        // "Wood Gas"
        Materials.WoodGas.getGas(1),
        // "Sulfuric Gas"
        Materials.SulfuricGas.getGas(1),
        // Biogas
        FluidRegistry.getFluidStack("ic2biogas", 1),
        // "Sulfuric Naphtha"
        Materials.SulfuricNaphtha.getFluid(1),
        // Cyclopentadiene
        GGMaterial.cyclopentadiene.getFluidOrGas(1),
        // "Coal Gas"
        FluidRegistry.getFluidStack("fluid.coalgas", 1),
        // Methane
        Materials.Methane.getGas(1),
        // Ethylene
        Materials.Ethylene.getGas(1),
        // "Refinery Gas"
        FluidRegistry.getFluidStack("gas_gas", 1),
        // Ethane
        Materials.Ethane.getGas(1),
        // Propene
        Materials.Propene.getGas(1),
        // Butadiene
        Materials.Butadiene.getGas(1),
        // Naphtha
        Materials.Naphtha.getFluid(1),
        // Propane
        Materials.Propane.getGas(1),
        // "Rocket Fuel"
        FluidRegistry.getFluidStack("rocket_fuel", 1),
        // Butene
        Materials.Butene.getGas(1),
        // Phenol
        Materials.Phenol.getFluid(1),
        // Butane
        Materials.Butane.getGas(1),
        // LPG
        Materials.LPG.getFluid(1),
        // Toluene
        Materials.Toluene.getFluid(1),
        // Benzene
        Materials.Benzene.getFluid(1),
        // Ether
        GGMaterial.ether.getFluidOrGas(1),
        // "Naquadah Gas"
        GGMaterial.naquadahGas.getFluidOrGas(1),
        // "Nefarious Gas"
        FluidRegistry.getFluidStack("nefariousgas", 1),
        // Nitrobenzene
        FluidRegistry.getFluidStack("nitrobenzene", 1) };

    public static void addGeneratorRecipes_Gas() {
        // "Basic Gas Turbine" - 1115
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1115))
                .fluidInputs(Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Gas);
        }

        // "Advanced Gas Turbine" - 1116
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1116))
                .fluidInputs(Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Gas);
        }

        // "Turbo Gas Turbine" - 1117
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1117))
                .fluidInputs(Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Gas);
        }

        // "Turbo Gas Turbine II" - 1118
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1118))
                .fluidInputs(Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Gas);
        }

        // "Turbo Gas Turbine III" - 1119
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1119))
                .fluidInputs(Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Gas);
        }

        // "Solid-Oxide Fuel Cell Mk I" - 13101
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 13101))
                .fluidInputs(Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Gas);
        }

        // "Solid-Oxide Fuel Cell Mk II" - 13102
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 13102))
                .fluidInputs(Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Gas);
        }

        // "Large Gas Turbine" - 1151
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1151))
                .fluidInputs(Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Gas);
        }

        // "XL Turbo Gas Turbine" - 31073
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 31073))
                .fluidInputs(Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Gas);
        }
    }
}
