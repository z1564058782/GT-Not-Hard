package Recipes.OriginGeneratorRecipes;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.enums.MaterialsKevlar;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.FluidFuelOfGeneratorFrontend;

public class OriginGeneratorRecipes_Semifluid {

    public static final RecipeMap<RecipeMapBackend> GeneratorRecipes_Semifluid = RecipeMapBuilder
        .of("Origin of Generator with Semifluid")
        .maxIO(1, 0, 1, 1)
        .minInputs(1, 1)
        .neiHandlerInfo(builder -> builder.setHeight(128))
        .frontend(FluidFuelOfGeneratorFrontend::new)
        .build();

    private static final String[] FuelBaseline = new String[] {
        // "Seed Oil"
        "4,000",
        // "Fish Oil"
        "4,000",
        // "Raw Animal Waste"
        "12,000",
        // "Coal Tar"
        "16,000",
        // Biomass
        "16,000",
        // "Manure Slurry"
        "24,000",
        // "Coal Tar Oil"
        "32,000",
        // "Fertile Manure Slurry"
        "32,000",
        // "Light Oil"
        "40,000",
        // Oil
        "40,000",
        // "Creosote Oil"
        "48,000",
        // "Raw Oil"
        "60,000",
        // "Heavy Oil"
        "60,000",
        // "Sulfuric Coal Tar Oil"
        "64,000",
        // "Sulfuric Heavy Fuel"
        "80,000",
        // "Very Heavy Oil"
        "90,000",
        // "Naphthenic Acid"
        "160,000",
        // Glycerol
        "328,000",
        // "Heavy Fuel"
        "360,000",
        // "Nefarious Oil"
        "572,000" };

    private static final int[] FuelCalorificValue = new int[] {
        // "Seed Oil"
        4_000,
        // "Fish Oil"
        4_000,
        // "Raw Animal Waste"
        12_000,
        // "Coal Tar"
        16_000,
        // Biomass
        16_000,
        // "Manure Slurry"
        24_000,
        // "Coal Tar Oil"
        32_000,
        // "Fertile Manure Slurry"
        32_000,
        // "Light Oil"
        40_000,
        // Oil
        40_000,
        // "Creosote Oil"
        48_000,
        // "Raw Oil"
        60_000,
        // "Heavy Oil"
        60_000,
        // "Sulfuric Coal Tar Oil"
        64_000,
        // "Sulfuric Heavy Fuel"
        80_000,
        // "Very Heavy Oil"
        90_000,
        // "Naphthenic Acid"
        160_000,
        // Glycerol
        328_000,
        // "Heavy Fuel"
        360_000,
        // "Nefarious Oil"
        572_000 };

    private static final FluidStack[] Fuel = new FluidStack[] {
        // "Seed Oil"
        Materials.SeedOil.getFluid(1),
        // "Fish Oil"
        Materials.FishOil.getFluid(1),
        // "Raw Animal Waste"
        FluidRegistry.getFluidStack("fluid.raw.waste", 1),
        // "Coal Tar"
        FluidRegistry.getFluidStack("fluid.coaltar", 1),
        // Biomass
        Materials.Biomass.getFluid(1),
        // "Manure Slurry"
        FluidRegistry.getFluidStack("fluid.manure.slurry", 1),
        // "Coal Tar Oil"
        FluidRegistry.getFluidStack("fluid.coaltaroil", 1),
        // "Fertile Manure Slurry"
        FluidRegistry.getFluidStack("fluid.fertile.manure.slurry", 1),
        // "Light Oil"
        Materials.OilLight.getFluid(1),
        // Oil
        Materials.Oil.getFluid(1),
        // "Creosote Oil"
        Materials.Creosote.getFluid(1),
        // "Raw Oil"
        Materials.OilMedium.getFluid(1),
        // "Heavy Oil"
        Materials.OilHeavy.getFluid(1),
        // "Sulfuric Coal Tar Oil"
        FluidRegistry.getFluidStack("fluid.sulfuriccoaltaroil", 1),
        // "Sulfuric Heavy Fuel"
        Materials.SulfuricHeavyFuel.getFluid(1),
        // "Very Heavy Oil"
        Materials.OilExtraHeavy.getFluid(1),
        // "Naphthenic Acid"
        MaterialsKevlar.NaphthenicAcid.getFluid(1),
        // Glycerol
        FluidRegistry.getFluidStack("glycerol", 1),
        // "Heavy Fuel"
        Materials.HeavyFuel.getFluid(1),
        // "Nefarious Oil"
        FluidRegistry.getFluidStack("nefariousoil", 1) };

    public static void addGeneratorRecipes_Semifluid() {
        // "Basic Semifluid Generator" - 837
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 837))
                .fluidInputs(Fuel[FuelID])
                .fluidOutputs(FluidRegistry.getFluidStack("ic2distilledwater", 1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Semifluid);
        }

        // "Advanced Semifluid Generator" - 838
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 838))
                .fluidInputs(Fuel[FuelID])
                .fluidOutputs(FluidRegistry.getFluidStack("ic2distilledwater", 1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Semifluid);
        }

        // "Turbo Semifluid Generator" - 839
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 839))
                .fluidInputs(Fuel[FuelID])
                .fluidOutputs(FluidRegistry.getFluidStack("ic2distilledwater", 1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Semifluid);
        }

        // "Turbo Semifluid Generator II" - 993
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 993))
                .fluidInputs(Fuel[FuelID])
                .fluidOutputs(FluidRegistry.getFluidStack("ic2distilledwater", 1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Semifluid);
        }

        // "Turbo Semifluid Generator III" - 994
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 994))
                .fluidInputs(Fuel[FuelID])
                .fluidOutputs(FluidRegistry.getFluidStack("ic2distilledwater", 1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Semifluid);
        }

        // "Large Semifluid Burner" - 31026
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 31026))
                .fluidInputs(Fuel[FuelID])
                .fluidOutputs(FluidRegistry.getFluidStack("ic2distilledwater", 1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Semifluid);
        }
    }
}
