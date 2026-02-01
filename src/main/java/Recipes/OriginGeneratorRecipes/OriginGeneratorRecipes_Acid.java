package Recipes.OriginGeneratorRecipes;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import bartworks.system.material.WerkstoffLoader;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.FluidFuelOfGeneratorFrontend;

public class OriginGeneratorRecipes_Acid {

    public static final RecipeMap<RecipeMapBackend> GeneratorRecipes_Acid = RecipeMapBuilder
        .of("Origin of Generator with Acid")
        .maxIO(1, 0, 1, 1)
        .minInputs(1, 1)
        .neiHandlerInfo(builder -> builder.setHeight(128))
        .frontend(FluidFuelOfGeneratorFrontend::new)
        .build();

    private static final String[] FuelBaseline = new String[] {
        // "Diluted Sulfuric Acid"
        "9,000",
        // "Molten Redstone"
        "10,000",
        // "Acetic Acid"
        "11,000",
        // "Diluted Hydrochloric Acid"
        "14,000",
        // "Sulfuric Acid"
        "18,000",
        // "Nitric Acid"
        "24,000",
        // "Hydrochloric Acid"
        "28,000",
        // "Hypochlorous Acid"
        "30,000",
        // Mercury
        "32,000",
        // "Phosphoric Acid"
        "36,000",
        // "Hydrofluoric Acid"
        "40,000",
        // "Formic Acid"
        "40,000" };

    private static final int[] FuelCalorificValue = new int[] {
        // "Diluted Sulfuric Acid"
        9_000,
        // "Molten Redstone"
        10_000,
        // "Acetic Acid"
        11_000,
        // "Diluted Hydrochloric Acid"
        14_000,
        // "Sulfuric Acid"
        18_000,
        // "Nitric Acid"
        24_000,
        // "Hydrochloric Acid"
        28_000,
        // "Hypochlorous Acid"
        30_000,
        // Mercury
        32_000,
        // "Phosphoric Acid"
        36_000,
        // "Hydrofluoric Acid"
        40_000,
        // "Formic Acid"
        40_000 };

    private static final FluidStack[] Fuel = new FluidStack[] {
        // "Diluted Sulfuric Acid"
        Materials.DilutedSulfuricAcid.getFluid(1),
        // "Molten Redstone"
        Materials.Redstone.getMolten(1),
        // "Acetic Acid"
        Materials.AceticAcid.getFluid(1),
        // "Diluted Hydrochloric Acid"
        Materials.DilutedHydrochloricAcid.getFluid(1),
        // "Sulfuric Acid"
        Materials.SulfuricAcid.getFluid(1),
        // "Nitric Acid"
        Materials.NitricAcid.getFluid(1),
        // "Hydrochloric Acid"
        FluidRegistry.getFluidStack("hydrochloricacid_gt5u", 1),
        // "Hypochlorous Acid"
        Materials.HypochlorousAcid.getFluid(1),
        // Mercury
        Materials.Mercury.getFluid(1),
        // "Phosphoric Acid"
        Materials.PhosphoricAcid.getFluid(1),
        // "Hydrofluoric Acid"
        FluidRegistry.getFluidStack("hydrofluoricacid", 1),
        // "Formic Acid"
        WerkstoffLoader.FormicAcid.getFluidOrGas(1) };

    public static void addGeneratorRecipes_Acid() {
        // "Acid Generator LV" - 12793
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 12793))
                .fluidInputs(Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Acid);
        }

        // "Acid Generator MV" - 12726
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 12726))
                .fluidInputs(Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Acid);
        }

        // "Acid Generator HV" - 12727
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 12727))
                .fluidInputs(Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Acid);
        }

        // "Acid Generator EV" - 12728
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 12727))
                .fluidInputs(Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Acid);
        }
    }
}
