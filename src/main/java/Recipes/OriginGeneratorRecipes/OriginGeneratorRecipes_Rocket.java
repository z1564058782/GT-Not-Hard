package Recipes.OriginGeneratorRecipes;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.ArrayList;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.FluidFuelOfGeneratorFrontend;

public class OriginGeneratorRecipes_Rocket {

    public static final RecipeMap<RecipeMapBackend> GeneratorRecipes_Rocket = RecipeMapBuilder
        .of("Origin of Generator with Rocket")
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

    public static void addGeneratorRecipes_Rocket() {
        ArrayList<FuelList> fuelList = new ArrayList<>();

        // "Rp-1 Rocket Fuel"
        fuelList.add(new FuelList("1,536,000", 1_536_000, 20, FluidRegistry.getFluidStack("fluid.rocketfuelmixb", 1)));

        // "Dense Hydrazine Fuel Mixture"
        fuelList.add(new FuelList("3,072,000", 3_072_000, 20, FluidRegistry.getFluidStack("fluid.rocketfuelmixd", 1)));

        // "CN3H7O3 Rocket Fuel"
        fuelList.add(new FuelList("6,144,000", 6_144_000, 20, FluidRegistry.getFluidStack("fluid.rocketfuelmixc", 1)));

        // "H8N4C2O4 Rocket Fuel"
        fuelList
            .add(new FuelList("12,588,000", 12_588_000, 20, FluidRegistry.getFluidStack("fluid.rocketfuelmixa", 1)));

        FuelList[] fuel = fuelList.toArray(new FuelList[0]);

        for (FuelList list : fuel) {
            // "Basic Rocket Engine" - 793
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 793))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Rocket);

            // "Advanced Rocket Engine" - 794
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 794))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Rocket);

            // "Turbo Rocket Engine" - 795
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 795))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Rocket);

            // "Rocketdyne F-1A Engine" - 996
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 996))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Rocket);
        }
    }
}
