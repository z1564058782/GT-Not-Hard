package Recipes.OriginGeneratorRecipes;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.ArrayList;

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

    public static void addGeneratorRecipes_Semifluid() {
        ArrayList<FuelList> fuelList = new ArrayList<>();

        // "Seed Oil"
        fuelList.add(new FuelList("4,000", 4_000, 20, Materials.SeedOil.getFluid(1)));

        // "Fish Oil"
        fuelList.add(new FuelList("4,000", 4_000, 20, Materials.FishOil.getFluid(1)));

        // "Raw Animal Waste"
        fuelList.add(new FuelList("12,000", 12_000, 20, FluidRegistry.getFluidStack("fluid.raw.waste", 1)));

        // "Coal Tar"
        fuelList.add(new FuelList("16,000", 16_000, 20, FluidRegistry.getFluidStack("fluid.coaltar", 1)));

        // Biomass
        fuelList.add(new FuelList("16,000", 16_000, 20, Materials.Biomass.getFluid(1)));

        // "Manure Slurry"
        fuelList.add(new FuelList("24,000", 24_000, 20, FluidRegistry.getFluidStack("fluid.manure.slurry", 1)));

        // "Coal Tar Oil"
        fuelList.add(new FuelList("32,000", 32_000, 20, FluidRegistry.getFluidStack("fluid.coaltaroil", 1)));

        // "Fertile Manure Slurry"
        fuelList.add(new FuelList("32,000", 32_000, 20, FluidRegistry.getFluidStack("fluid.fertile.manure.slurry", 1)));

        // "Light Oil"
        fuelList.add(new FuelList("40,000", 40_000, 20, Materials.OilLight.getFluid(1)));

        // Oil
        fuelList.add(new FuelList("40,000", 40_000, 20, Materials.Oil.getFluid(1)));

        // "Creosote Oil"
        fuelList.add(new FuelList("48,000", 48_000, 20, Materials.Creosote.getFluid(1)));

        // "Raw Oil"
        fuelList.add(new FuelList("60,000", 60_000, 20, Materials.OilMedium.getFluid(1)));

        // "Heavy Oil"
        fuelList.add(new FuelList("60,000", 60_000, 20, Materials.OilHeavy.getFluid(1)));

        // "Sulfuric Coal Tar Oil"
        fuelList.add(new FuelList("64,000", 64_000, 20, FluidRegistry.getFluidStack("fluid.sulfuriccoaltaroil", 1)));

        // "Sulfuric Heavy Fuel"
        fuelList.add(new FuelList("80,000", 80_000, 20, Materials.SulfuricHeavyFuel.getFluid(1)));

        // "Very Heavy Oil"
        fuelList.add(new FuelList("90,000", 90_000, 20, Materials.OilExtraHeavy.getFluid(1)));

        // "Naphthenic Acid"
        fuelList.add(new FuelList("160,000", 160_000, 20, MaterialsKevlar.NaphthenicAcid.getFluid(1)));

        // Glycerol
        fuelList.add(new FuelList("328,000", 328_000, 20, FluidRegistry.getFluidStack("glycerol", 1)));

        // "Heavy Fuel"
        fuelList.add(new FuelList("360,000", 360_000, 20, Materials.HeavyFuel.getFluid(1)));

        // "Nefarious Oil"
        fuelList.add(new FuelList("572,000", 572_000, 20, FluidRegistry.getFluidStack("nefariousoil", 1)));

        FuelList[] fuel = fuelList.toArray(new FuelList[0]);

        for (FuelList list : fuel) {
            // "Basic Semifluid Generator" - 837
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 837))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Semifluid);

            // "Advanced Semifluid Generator" - 838
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 838))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Semifluid);

            // "Turbo Semifluid Generator" - 839
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 839))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Semifluid);

            // "Turbo Semifluid Generator II" - 993
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 993))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Semifluid);

            // "Turbo Semifluid Generator III" - 994
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 994))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Semifluid);

            // "Large Semifluid Burner" - 31026
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 31026))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Semifluid);
        }
    }
}
