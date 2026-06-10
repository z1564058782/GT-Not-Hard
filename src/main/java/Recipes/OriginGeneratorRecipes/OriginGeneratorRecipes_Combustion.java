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

public class OriginGeneratorRecipes_Combustion {

    public static final RecipeMap<RecipeMapBackend> GeneratorRecipes_Combustion = RecipeMapBuilder
        .of("Origin of Generator with Combustion")
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

    public static void addGeneratorRecipes_Combustion() {
        ArrayList<FuelList> fuelList = new ArrayList<>();

        // "Fish Oil"
        fuelList.add(new FuelList("2,000", 2_000, 20, Materials.FishOil.getFluid(1)));

        // "Short Mead"
        fuelList.add(new FuelList("4,000", 4_000, 20, FluidRegistry.getFluidStack("short.mead", 1)));

        // Biomass
        fuelList.add(new FuelList("8,000", 8_000, 20, Materials.Biomass.getFluid(1)));

        // "Creosote Oil"
        fuelList.add(new FuelList("8,000", 8_000, 20, Materials.Creosote.getFluid(1)));

        // Oil
        fuelList.add(new FuelList("16,000", 16_000, 20, Materials.Oil.getFluid(1)));

        // "Sulfuric Light Fuel"
        fuelList.add(new FuelList("40,000", 40_000, 20, Materials.SulfuricLightFuel.getFluid(1)));

        // Octane
        fuelList.add(new FuelList("80,000", 80_000, 20, Materials.Octane.getFluid(1)));

        // Methanol
        fuelList.add(new FuelList("84,000", 84_000, 20, Materials.Methanol.getFluid(1)));

        // Ethanol
        fuelList.add(new FuelList("192,000", 192_000, 20, Materials.Ethanol.getFluid(1)));

        // "Light Fuel"
        fuelList.add(new FuelList("305,000", 305_000, 20, Materials.LightFuel.getFluid(1)));

        // "Bio Diesel"
        fuelList.add(new FuelList("320,000", 320_000, 20, Materials.BioDiesel.getFluid(1)));

        // Butanol
        fuelList.add(new FuelList("400,000", 400_000, 20, FluidRegistry.getFluidStack("butanol", 1)));

        // Fuel
        fuelList.add(new FuelList("480,000", 480_000, 20, Materials.Fuel.getFluid(1)));

        // Ether
        fuelList.add(new FuelList("537,000", 537_000, 20, GGMaterial.ether.getFluidOrGas(1)));

        // Gasoline
        fuelList.add(new FuelList("576,000", 576_000, 20, Materials.GasolineRegular.getFluid(1)));

        // "Cetane-Boosted Diesel"
        fuelList.add(new FuelList("1,000,000", 1_000_000, 20, Materials.NitroFuel.getFluid(1)));

        // "Ethanol Gasoline"
        fuelList.add(new FuelList("1,100,000", 1_100_000, 20, FluidRegistry.getFluidStack("ethanol gasoline", 1)));

        // "Jet Fuel No.3"
        fuelList.add(new FuelList("1,824,000", 1_824_000, 20, FluidRegistry.getFluidStack("jet fuel no.3", 1)));

        // "Jet Fuel A"
        fuelList.add(new FuelList("2,248,000", 2_248_000, 20, FluidRegistry.getFluidStack("jet fuel a", 1)));

        // "High Octane Gasoline"
        fuelList.add(new FuelList("2,500,000", 2_500_000, 20, Materials.GasolinePremium.getFluid(1)));

        FuelList[] fuel = fuelList.toArray(new FuelList[0]);

        for (FuelList list : fuel) {
            // "Basic Combustion Generator" - 1110
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1110))
                .fluidInputs(list.Fuel)
                .fluidOutputs(FluidRegistry.getFluidStack("ic2distilledwater", 1))
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Combustion);

            // "Advanced Combustion Generator" - 1111
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1111))
                .fluidInputs(list.Fuel)
                .fluidOutputs(FluidRegistry.getFluidStack("ic2distilledwater", 1))
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Combustion);

            // "Turbo Combustion Generator" - 1112
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1112))
                .fluidInputs(list.Fuel)
                .fluidOutputs(FluidRegistry.getFluidStack("ic2distilledwater", 1))
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Combustion);

            // "Turbo Supercharging Combustion Generator" - 1113
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1113))
                .fluidInputs(list.Fuel)
                .fluidOutputs(FluidRegistry.getFluidStack("ic2distilledwater", 1))
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Combustion);

            // "Ultimate Chemical Energy Releaser" - 1114
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1114))
                .fluidInputs(list.Fuel)
                .fluidOutputs(FluidRegistry.getFluidStack("ic2distilledwater", 1))
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Combustion);

            // "Large Combustion Engine" - 1171
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1171))
                .fluidInputs(list.Fuel)
                .fluidOutputs(FluidRegistry.getFluidStack("ic2distilledwater", 1))
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Combustion);
        }
    }
}
