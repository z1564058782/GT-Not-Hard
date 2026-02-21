package Recipes.OriginGeneratorRecipes;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import net.minecraftforge.fluids.FluidRegistry;

import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.FluidFuelOfGeneratorFrontend;

public class OriginGeneratorRecipes_Steam {

    public static final RecipeMap<RecipeMapBackend> GeneratorRecipes_Steam = RecipeMapBuilder
        .of("Origin of Generator with Steam")
        .maxIO(1, 0, 1, 1)
        .minInputs(1, 1)
        .neiHandlerInfo(builder -> builder.setHeight(128))
        .frontend(FluidFuelOfGeneratorFrontend::new)
        .build();

    public static void addGeneratorRecipes_Steam() {
        // Small
        {
            // "Advanced Boiler [LV]" - 753
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 753))
                .fluidInputs(Materials.Steam.getGas(1))
                .fluidOutputs(Materials.Water.getFluid(1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = 500")
                .eut(-500)
                .addTo(GeneratorRecipes_Steam);

            // "Advanced Boiler [MV]" - 754
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 754))
                .fluidInputs(Materials.Steam.getGas(1))
                .fluidOutputs(Materials.Water.getFluid(1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = 500")
                .eut(-500)
                .addTo(GeneratorRecipes_Steam);

            // "Advanced Boiler [HV]" - 755
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 755))
                .fluidInputs(Materials.Steam.getGas(1))
                .fluidOutputs(Materials.Water.getFluid(1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = 500")
                .eut(-500)
                .addTo(GeneratorRecipes_Steam);

            // "Basic Steam Turbine" - 1120
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1120))
                .fluidInputs(Materials.Steam.getGas(1))
                .fluidOutputs(Materials.Water.getFluid(1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = 1,000")
                .eut(-1_000)
                .addTo(GeneratorRecipes_Steam);

            // "Advanced Steam Turbine" - 1121
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1121))
                .fluidInputs(Materials.Steam.getGas(1))
                .fluidOutputs(Materials.Water.getFluid(1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = 1,000")
                .eut(-1_000)
                .addTo(GeneratorRecipes_Steam);

            // "Turbo Steam Turbine" - 1122
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1122))
                .fluidInputs(Materials.Steam.getGas(1))
                .fluidOutputs(Materials.Water.getFluid(1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = 1,000")
                .eut(-1_000)
                .addTo(GeneratorRecipes_Steam);
        }

        // Large
        {
            // "Large Steam Turbine" - 1131
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1131))
                .fluidInputs(Materials.Steam.getGas(1))
                .fluidOutputs(Materials.Water.getFluid(1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = 1,000")
                .eut(-1_000)
                .addTo(GeneratorRecipes_Steam);

            // "Large HP Steam Turbine" - 1152
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1152))
                .fluidInputs(FluidRegistry.getFluidStack("ic2superheatedsteam", 1))
                .fluidOutputs(Materials.Steam.getGas(1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = 8,192")
                .eut(-8_192)
                .addTo(GeneratorRecipes_Steam);

            // "Large Supercritical Steam Turbine" - 32016
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 32016))
                .fluidInputs(Materials.DenseSupercriticalSteam.getGas(1))
                .fluidOutputs(FluidRegistry.getFluidStack("ic2superheatedsteam", 1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = 131,072")
                .eut(-131_072)
                .addTo(GeneratorRecipes_Steam);
        }

        // XL
        {
            // "XL Turbo Steam Turbine" - 865
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 865))
                .fluidInputs(Materials.Steam.getGas(1))
                .fluidOutputs(Materials.Water.getFluid(1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = 1,000")
                .eut(-1_000)
                .addTo(GeneratorRecipes_Steam);

            // "XL Turbo HP Steam Turbine" - 866
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 866))
                .fluidInputs(FluidRegistry.getFluidStack("ic2superheatedsteam", 1))
                .fluidOutputs(Materials.Steam.getGas(1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = 8,192")
                .eut(-8_192)
                .addTo(GeneratorRecipes_Steam);

            // "XL Turbo SC Steam Turbine" - 31076
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 31076))
                .fluidInputs(Materials.DenseSupercriticalSteam.getGas(1))
                .fluidOutputs(FluidRegistry.getFluidStack("ic2superheatedsteam", 1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = 131,072")
                .eut(-131_072)
                .addTo(GeneratorRecipes_Steam);
        }
    }
}
