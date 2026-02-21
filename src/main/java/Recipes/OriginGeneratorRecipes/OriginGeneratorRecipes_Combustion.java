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

public class OriginGeneratorRecipes_Combustion {

    public static final RecipeMap<RecipeMapBackend> GeneratorRecipes_Combustion = RecipeMapBuilder
        .of("Origin of Generator with Combustion")
        .maxIO(1, 0, 1, 1)
        .minInputs(1, 1)
        .neiHandlerInfo(builder -> builder.setHeight(128))
        .frontend(FluidFuelOfGeneratorFrontend::new)
        .build();

    private static final String[] FuelBaseline = new String[] {
        // "Fish Oil"
        "2,000",
        // "Short Mead"
        "4,000",
        // Biomass
        "8,000",
        // "Creosote Oil"
        "8,000",
        // Oil
        "16,000",
        // "Sulfuric Light Fuel"
        "40,000",
        // Octane
        "80,000",
        // Methanol
        "84,000",
        // Ethanol
        "192,000",
        // "Light Fuel"
        "305,000",
        // "Bio Diesel"
        "320,000",
        // Butanol
        "400,000",
        // Fuel
        "480,000",
        // Ether
        "537,000",
        // Gasoline
        "576,000",
        // "Cetane-Boosted Diesel"
        "1,000,000",
        // "Ethanol Gasoline"
        "1,100,000",
        // "Jet Fuel No.3"
        "1,824,000",
        // "Jet Fuel A"
        "2,248,000",
        // "High Octane Gasoline"
        "2,500,000" };

    private static final int[] FuelCalorificValue = new int[] {
        // "Fish Oil"
        2_000,
        // "Short Mead"
        4_000,
        // Biomass
        8_000,
        // "Creosote Oil"
        8_000,
        // Oil
        16_000,
        // "Sulfuric Light Fuel"
        40_000,
        // Octane
        80_000,
        // Methanol
        84_000,
        // Ethanol
        192_000,
        // "Light Fuel"
        305_000,
        // "Bio Diesel"
        320_000,
        // Butanol
        400_000,
        // Fuel
        480_000,
        // Ether
        537_000,
        // Gasoline
        576_000,
        // "Cetane-Boosted Diesel"
        1_000_000,
        // "Ethanol Gasoline"
        1_100_000,
        // "Jet Fuel No.3"
        1_824_000,
        // "Jet Fuel A"
        2_248_000,
        // "High Octane Gasoline"
        2_500_000 };

    private static final FluidStack[] Fuel = new FluidStack[] {
        // "Fish Oil"
        Materials.FishOil.getFluid(1),
        // "Short Mead"
        FluidRegistry.getFluidStack("short.mead", 1),
        // Biomass
        Materials.Biomass.getFluid(1),
        // "Creosote Oil"
        Materials.Creosote.getFluid(1),
        // Oil
        Materials.Oil.getFluid(1),
        // "Sulfuric Light Fuel"
        Materials.SulfuricLightFuel.getFluid(1),
        // Octane
        Materials.Octane.getFluid(1),
        // Methanol
        Materials.Methanol.getFluid(1),
        // Ethanol
        Materials.Ethanol.getFluid(1),
        // "Light Fuel"
        Materials.LightFuel.getFluid(1),
        // "Bio Diesel"
        Materials.BioDiesel.getFluid(1),
        // Butanol
        FluidRegistry.getFluidStack("butanol", 1),
        // Fuel
        Materials.Fuel.getFluid(1),
        // Ether
        GGMaterial.ether.getFluidOrGas(1),
        // Gasoline
        Materials.GasolineRegular.getFluid(1),
        // "Cetane-Boosted Diesel"
        Materials.NitroFuel.getFluid(1),
        // "Ethanol Gasoline"
        FluidRegistry.getFluidStack("ethanol gasoline", 1),
        // "Jet Fuel No.3"
        FluidRegistry.getFluidStack("jet fuel no.3", 1),
        // "Jet Fuel A"
        FluidRegistry.getFluidStack("jet fuel a", 1),
        // "High Octane Gasoline"
        Materials.GasolinePremium.getFluid(1) };

    public static void addGeneratorRecipes_Combustion() {
        // "Basic Combustion Generator" - 1110
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1110))
                .fluidInputs(Fuel[FuelID])
                .fluidOutputs(FluidRegistry.getFluidStack("ic2distilledwater", 1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Combustion);
        }

        // "Advanced Combustion Generator" - 1111
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1111))
                .fluidInputs(Fuel[FuelID])
                .fluidOutputs(FluidRegistry.getFluidStack("ic2distilledwater", 1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Combustion);
        }

        // "Turbo Combustion Generator" - 1112
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1112))
                .fluidInputs(Fuel[FuelID])
                .fluidOutputs(FluidRegistry.getFluidStack("ic2distilledwater", 1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Combustion);
        }

        // "Turbo Supercharging Combustion Generator" - 1113
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1113))
                .fluidInputs(Fuel[FuelID])
                .fluidOutputs(FluidRegistry.getFluidStack("ic2distilledwater", 1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Combustion);
        }

        // "Ultimate Chemical Energy Releaser" - 1114
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1114))
                .fluidInputs(Fuel[FuelID])
                .fluidOutputs(FluidRegistry.getFluidStack("ic2distilledwater", 1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Combustion);
        }

        // "Large Combustion Engine" - 1171
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1171))
                .fluidInputs(Fuel[FuelID])
                .fluidOutputs(FluidRegistry.getFluidStack("ic2distilledwater", 1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Combustion);
        }
    }
}
