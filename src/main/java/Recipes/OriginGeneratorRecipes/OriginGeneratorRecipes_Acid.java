package Recipes.OriginGeneratorRecipes;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.ArrayList;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import bartworks.system.material.WerkstoffLoader;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.FluidFuelOfGeneratorFrontend;

public class OriginGeneratorRecipes_Acid {

    public static final RecipeMap<RecipeMapBackend> GeneratorRecipes_Acid = RecipeMapBuilder
        .of("Origin of Generator with Acid")
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

    public static void addGeneratorRecipes_Acid() {
        ArrayList<FuelList> fuelList = new ArrayList<>();

        // "Diluted Sulfuric Acid"
        fuelList.add(new FuelList("9,000", 9_000, 20, Materials.DilutedSulfuricAcid.getFluid(1)));

        // "Molten Redstone"
        fuelList.add(new FuelList("10,000", 10_000, 20, Materials.Redstone.getMolten(1)));

        // "Acetic Acid"
        fuelList.add(new FuelList("11,000", 11_000, 20, Materials.AceticAcid.getFluid(1)));

        // "Diluted Hydrochloric Acid"
        fuelList.add(new FuelList("14,000", 14_000, 20, Materials.DilutedHydrochloricAcid.getFluid(1)));

        // "Sulfuric Acid"
        fuelList.add(new FuelList("18,000", 18_000, 20, Materials.SulfuricAcid.getFluid(1)));

        // "Nitric Acid"
        fuelList.add(new FuelList("24,000", 24_000, 20, Materials.NitricAcid.getFluid(1)));

        // "Hydrochloric Acid"
        fuelList.add(new FuelList("28,000", 28_000, 20, FluidRegistry.getFluidStack("hydrochloricacid_gt5u", 1)));

        // "Hypochlorous Acid"
        fuelList.add(new FuelList("30,000", 30_000, 20, Materials.HypochlorousAcid.getFluid(1)));

        // Mercury
        fuelList.add(new FuelList("32,000", 32_000, 20, Materials.Mercury.getFluid(1)));

        // "Phosphoric Acid"
        fuelList.add(new FuelList("36,000", 36_000, 20, Materials.PhosphoricAcid.getFluid(1)));

        // "Hydrofluoric Acid"
        fuelList.add(new FuelList("40,000", 40_000, 20, FluidRegistry.getFluidStack("hydrofluoricacid", 1)));

        // "Formic Acid"
        fuelList.add(new FuelList("40,000", 40_000, 20, WerkstoffLoader.FormicAcid.getFluidOrGas(1)));

        FuelList[] fuel = fuelList.toArray(new FuelList[0]);

        for (FuelList list : fuel) {
            // "Acid Generator LV" - 12793
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 12793))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Acid);

            // "Acid Generator MV" - 12726
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 12726))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Acid);

            // "Acid Generator HV" - 12727
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 12727))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Acid);

            // "Acid Generator EV" - 12728
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 12728))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Acid);
        }
    }
}
