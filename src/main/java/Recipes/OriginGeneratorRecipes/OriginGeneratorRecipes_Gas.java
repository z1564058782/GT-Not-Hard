package Recipes.OriginGeneratorRecipes;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.ArrayList;

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
        .neiTransferRect(90, 10, 20, 16)
        .build();

    private static class FuelList {

        String FuelBaseline;
        int FuelCalorificValue;
        int Duration;
        FluidStack Fuel;

        public FuelList(String FuelBaseline, int FuelCalorificValue, int Duration, FluidStack Fuel) {
            this.FuelBaseline = FuelBaseline;
            this.FuelCalorificValue = FuelCalorificValue;
            this.Duration = Duration;
            this.Fuel = Fuel;
        }
    }

    public static void addGeneratorRecipes_Gas() {
        ArrayList<FuelList> fuelList = new ArrayList<>();

        // Hydrogen
        fuelList.add(new FuelList("20,000", 20_000, 20, Materials.Hydrogen.getGas(1)));

        // "Natural Gas"
        fuelList.add(new FuelList("20,000", 20_000, 20, FluidRegistry.getFluidStack("gas_natural_gas", 1)));

        // "Carbon Monoxide"
        fuelList.add(new FuelList("24,000", 24_000, 20, Materials.CarbonMonoxide.getGas(1)));

        // "Wood Gas"
        fuelList.add(new FuelList("24,000", 24_000, 20, Materials.WoodGas.getGas(1)));

        // "Sulfuric Gas"
        fuelList.add(new FuelList("25,000", 25_000, 20, Materials.SulfuricGas.getGas(1)));

        // Biogas
        fuelList.add(new FuelList("40,000", 40_000, 20, FluidRegistry.getFluidStack("ic2biogas", 1)));

        // "Sulfuric Naphtha"
        fuelList.add(new FuelList("40,000", 40_000, 20, Materials.SulfuricNaphtha.getFluid(1)));

        // Cyclopentadiene
        fuelList.add(new FuelList("70,000", 70_000, 20, GGMaterial.cyclopentadiene.getFluidOrGas(1)));

        // "Coal Gas"
        fuelList.add(new FuelList("96,000", 96_000, 20, FluidRegistry.getFluidStack("fluid.coalgas", 1)));

        // Methane
        fuelList.add(new FuelList("104,000", 104_000, 20, Materials.Methane.getGas(1)));

        // Ethylene
        fuelList.add(new FuelList("128,000", 128_000, 20, Materials.Ethylene.getGas(1)));

        // "Refinery Gas"
        fuelList.add(new FuelList("160,000", 160_000, 20, FluidRegistry.getFluidStack("gas_gas", 1)));

        // Ethane
        fuelList.add(new FuelList("168,000", 168_000, 20, Materials.Ethane.getGas(1)));

        // Propene
        fuelList.add(new FuelList("192,000", 192_000, 20, Materials.Propene.getGas(1)));

        // Butadiene
        fuelList.add(new FuelList("206,000", 206_000, 20, Materials.Butadiene.getGas(1)));

        // Naphtha
        fuelList.add(new FuelList("220,000", 220_000, 20, Materials.Naphtha.getFluid(1)));

        // Propane
        fuelList.add(new FuelList("232,000", 232_000, 20, Materials.Propane.getGas(1)));

        // "Rocket Fuel"
        fuelList.add(new FuelList("250,000", 250_000, 20, FluidRegistry.getFluidStack("rocket_fuel", 1)));

        // Butene
        fuelList.add(new FuelList("256,000", 256_000, 20, Materials.Butene.getGas(1)));

        // Phenol
        fuelList.add(new FuelList("288,000", 288_000, 20, Materials.Phenol.getFluid(1)));

        // Butane
        fuelList.add(new FuelList("296,000", 296_000, 20, Materials.Butane.getGas(1)));

        // LPG
        fuelList.add(new FuelList("320,000", 320_000, 20, Materials.LPG.getFluid(1)));

        // Toluene
        fuelList.add(new FuelList("328,000", 328_000, 20, Materials.Toluene.getFluid(1)));

        // Benzene
        fuelList.add(new FuelList("369,000", 369_000, 20, Materials.Benzene.getFluid(1)));

        // Ether
        fuelList.add(new FuelList("537,000", 537_000, 20, GGMaterial.ether.getFluidOrGas(1)));

        // "Naquadah Gas"
        fuelList.add(new FuelList("1,024,000", 1_024_000, 20, GGMaterial.naquadahGas.getFluidOrGas(1)));

        // "Nefarious Gas"
        fuelList.add(new FuelList("1,200,000", 1_200_000, 20, FluidRegistry.getFluidStack("nefariousgas", 1)));

        // Nitrobenzene
        fuelList.add(new FuelList("1,600,000", 1_600_000, 20, FluidRegistry.getFluidStack("nitrobenzene", 1)));

        FuelList[] fuel = fuelList.toArray(new FuelList[0]);

        for (FuelList list : fuel) {
            // "Basic Gas Turbine" - 1115
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1115))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Gas);

            // "Advanced Gas Turbine" - 1116
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1116))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Gas);

            // "Turbo Gas Turbine" - 1117
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1117))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Gas);

            // "Turbo Gas Turbine II" - 1118
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1118))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Gas);

            // "Turbo Gas Turbine III" - 1119
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1119))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Gas);

            // "Solid-Oxide Fuel Cell Mk I" - 13101
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 13101))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Gas);

            // "Solid-Oxide Fuel Cell Mk II" - 13102
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 13102))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Gas);

            // "Large Gas Turbine" - 1151
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1151))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Gas);

            // "XL Turbo Gas Turbine" - 31073
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 31073))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Gas);
        }
    }
}
