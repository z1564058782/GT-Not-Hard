package Recipes.OriginGeneratorRecipes;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

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
        .build();

    private static final String[] FuelBaseline = new String[] {
        // "Rp-1 Rocket Fuel"
        "1,536,000",
        // "Dense Hydrazine Fuel Mixture"
        "3,072,000",
        // "CN3H7O3 Rocket Fuel"
        "6,144,000",
        // "H8N4C2O4 Rocket Fuel"
        "12,588,000" };

    private static final int[] FuelCalorificValue = new int[] {
        // "Rp-1 Rocket Fuel"
        1_536_000,
        // "Dense Hydrazine Fuel Mixture"
        3_072_000,
        // "CN3H7O3 Rocket Fuel"
        6_144_000,
        // "H8N4C2O4 Rocket Fuel"
        12_588_000 };

    private static final FluidStack[] Fuel = new FluidStack[] {
        // "Rp-1 Rocket Fuel"
        FluidRegistry.getFluidStack("fluid.rocketfuelmixb", 1),
        // "Dense Hydrazine Fuel Mixture"
        FluidRegistry.getFluidStack("fluid.rocketfuelmixd", 1),
        // "CN3H7O3 Rocket Fuel"
        FluidRegistry.getFluidStack("fluid.rocketfuelmixc", 1),
        // "H8N4C2O4 Rocket Fuel"
        FluidRegistry.getFluidStack("fluid.rocketfuelmixa", 1) };

    public static void addGeneratorRecipes_Rocket() {
        // "Basic Rocket Engine" - 793
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 793))
                .fluidInputs(Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Rocket);
        }

        // "Advanced Rocket Engine" - 794
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 794))
                .fluidInputs(Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Rocket);
        }

        // "Turbo Rocket Engine" - 795
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 795))
                .fluidInputs(Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Rocket);
        }

        // "Rocketdyne F-1A Engine" - 996
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 996))
                .fluidInputs(Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Rocket);
        }
    }
}
