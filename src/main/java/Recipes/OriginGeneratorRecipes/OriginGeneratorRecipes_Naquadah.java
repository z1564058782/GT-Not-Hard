package Recipes.OriginGeneratorRecipes;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import net.minecraftforge.fluids.FluidStack;

import goodgenerator.items.GGMaterial;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.FluidFuelOfGeneratorFrontend;

public class OriginGeneratorRecipes_Naquadah {

    public static final RecipeMap<RecipeMapBackend> GeneratorRecipes_Naquadah = RecipeMapBuilder
        .of("Origin of Generator with Naquadah")
        .maxIO(1, 0, 1, 1)
        .minInputs(1, 1)
        .neiHandlerInfo(builder -> builder.setHeight(128))
        .frontend(FluidFuelOfGeneratorFrontend::new)
        .build();

    private static final String[] FuelBaseline = new String[] {
        // "Molten Enriched Naquadah"
        "500,000,000",
        // "Molten Naquadria"
        "2,000,000,000",
        // "Thorium Based Liquid Fuel (Excited State)"
        "1,100,000",
        // "Uranium Based Liquid Fuel (Excited State)"
        "1,296,000",
        // "Plutonium Based Liquid Fuel (Excited State)"
        "4,860,000",
        // "Naquadah Based Liquid Fuel MkI"
        "58,500,000",
        // "Naquadah Based Liquid Fuel MkII"
        "161,000,000",
        // "Naquadah Based Liquid Fuel MkIII"
        "760,880,000" };

    private static final int[] FuelCalorificValue = new int[] {
        // "Molten Enriched Naquadah"
        500_000_000,
        // "Molten Naquadria"
        2_000_000_000,
        // "Thorium Based Liquid Fuel (Excited State)"
        1_100_000,
        // "Uranium Based Liquid Fuel (Excited State)"
        1_296_000,
        // "Plutonium Based Liquid Fuel (Excited State)"
        4_860_000,
        // "Naquadah Based Liquid Fuel MkI"
        58_500_000,
        // "Naquadah Based Liquid Fuel MkII"
        161_000_000,
        // "Naquadah Based Liquid Fuel MkIII"
        760_880_000 };

    private static final FluidStack[] Fuel = new FluidStack[] {
        // "Molten Enriched Naquadah"
        Materials.NaquadahEnriched.getMolten(1),
        // "Molten Naquadria"
        Materials.Naquadria.getMolten(1),
        // "Thorium Based Liquid Fuel (Excited State)"
        GGMaterial.thoriumBasedLiquidFuelExcited.getFluidOrGas(1),
        // "Uranium Based Liquid Fuel (Excited State)"
        GGMaterial.uraniumBasedLiquidFuelExcited.getFluidOrGas(1),
        // "Plutonium Based Liquid Fuel (Excited State)"
        GGMaterial.plutoniumBasedLiquidFuelExcited.getFluidOrGas(1),
        // "Naquadah Based Liquid Fuel MkI"
        GGMaterial.naquadahBasedFuelMkI.getFluidOrGas(1),
        // "Naquadah Based Liquid Fuel MkII"
        GGMaterial.naquadahBasedFuelMkII.getFluidOrGas(1),
        // "Naquadah Based Liquid Fuel MkIII"
        GGMaterial.naquadahBasedFuelMkIII.getFluidOrGas(1) };

    private static final FluidStack[] Scrap = new FluidStack[] {
        // "Molten Enriched Naquadah"
        Materials.Naquadah.getMolten(1),
        // "Molten Naquadria"
        Materials.NaquadahEnriched.getMolten(1),
        // "Thorium Based Liquid Fuel (Excited State)"
        GGMaterial.thoriumBasedLiquidFuelDepleted.getFluidOrGas(1),
        // "Uranium Based Liquid Fuel (Excited State)"
        GGMaterial.uraniumBasedLiquidFuelDepleted.getFluidOrGas(1),
        // "Plutonium Based Liquid Fuel (Excited State)"
        GGMaterial.plutoniumBasedLiquidFuelDepleted.getFluidOrGas(1),
        // "Naquadah Based Liquid Fuel MkI"
        GGMaterial.naquadahBasedFuelMkIDepleted.getFluidOrGas(1),
        // "Naquadah Based Liquid Fuel MkII"
        GGMaterial.naquadahBasedFuelMkIIDepleted.getFluidOrGas(1),
        // "Naquadah Based Liquid Fuel MkIII"
        GGMaterial.naquadahBasedFuelMkIIIDepleted.getFluidOrGas(1) };

    private static final String[] FuelBaseline_Special = new String[] {
        // "Naquadah Based Liquid Fuel MkIV"
        "8,854,000",
        // "Naquadah Based Liquid Fuel MkV"
        "63,932,160",
        // "Naquadah Based Liquid Fuel MkVI"
        "496,670,848" };

    private static final int[] FuelCalorificValue_Special = new int[] {
        // "Naquadah Based Liquid Fuel MkIV"
        8_854_000,
        // "Naquadah Based Liquid Fuel MkV"
        63_932_160,
        // "Naquadah Based Liquid Fuel MkVI"
        496_670_848 };

    private static final FluidStack[] Fuel_Special = new FluidStack[] {
        // "Naquadah Based Liquid Fuel MkIV"
        GGMaterial.naquadahBasedFuelMkIV.getFluidOrGas(1),
        // "Naquadah Based Liquid Fuel MkV"
        GGMaterial.naquadahBasedFuelMkV.getFluidOrGas(1),
        // "Naquadah Based Liquid Fuel MkVI"
        GGMaterial.naquadahBasedFuelMkVI.getFluidOrGas(1) };

    private static final FluidStack[] Scrap_Special = new FluidStack[] {
        // "Naquadah Based Liquid Fuel MkIV"
        GGMaterial.naquadahBasedFuelMkIVDepleted.getFluidOrGas(1),
        // "Naquadah Based Liquid Fuel MkV"
        GGMaterial.naquadahBasedFuelMkVDepleted.getFluidOrGas(1),
        // "Naquadah Based Liquid Fuel MkVI"
        GGMaterial.naquadahBasedFuelMkVIDepleted.getFluidOrGas(1) };

    public static void addGeneratorRecipes_Naquadah() {
        // "Naquadah Reactor Mark I" - 1190
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1190))
                .fluidInputs(Fuel[FuelID])
                .fluidOutputs(Scrap[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Naquadah);
        }

        for (int FuelID = 0; FuelID < Fuel_Special.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1190))
                .fluidInputs(Fuel_Special[FuelID])
                .fluidOutputs(Scrap_Special[FuelID])
                .duration(SECONDS * 50)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_Special[FuelID])
                .eut(-FuelCalorificValue_Special[FuelID])
                .addTo(GeneratorRecipes_Naquadah);
        }

        // "Naquadah Reactor Mark II" - 1191
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1191))
                .fluidInputs(Fuel[FuelID])
                .fluidOutputs(Scrap[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Naquadah);
        }

        for (int FuelID = 0; FuelID < Fuel_Special.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1191))
                .fluidInputs(Fuel_Special[FuelID])
                .fluidOutputs(Scrap_Special[FuelID])
                .duration(SECONDS * 50)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_Special[FuelID])
                .eut(-FuelCalorificValue_Special[FuelID])
                .addTo(GeneratorRecipes_Naquadah);
        }

        // "Naquadah Reactor Mark III" - 1192
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1192))
                .fluidInputs(Fuel[FuelID])
                .fluidOutputs(Scrap[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Naquadah);
        }

        for (int FuelID = 0; FuelID < Fuel_Special.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1192))
                .fluidInputs(Fuel_Special[FuelID])
                .fluidOutputs(Scrap_Special[FuelID])
                .duration(SECONDS * 50)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_Special[FuelID])
                .eut(-FuelCalorificValue_Special[FuelID])
                .addTo(GeneratorRecipes_Naquadah);
        }

        // "Naquadah Reactor Mark IV" - 1188
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1188))
                .fluidInputs(Fuel[FuelID])
                .fluidOutputs(Scrap[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Naquadah);
        }

        for (int FuelID = 0; FuelID < Fuel_Special.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1188))
                .fluidInputs(Fuel_Special[FuelID])
                .fluidOutputs(Scrap_Special[FuelID])
                .duration(SECONDS * 50)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_Special[FuelID])
                .eut(-FuelCalorificValue_Special[FuelID])
                .addTo(GeneratorRecipes_Naquadah);
        }

        // "Naquadah Reactor Mark V" - 1189
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1189))
                .fluidInputs(Fuel[FuelID])
                .fluidOutputs(Scrap[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Naquadah);
        }

        for (int FuelID = 0; FuelID < Fuel_Special.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1189))
                .fluidInputs(Fuel_Special[FuelID])
                .fluidOutputs(Scrap_Special[FuelID])
                .duration(SECONDS * 50)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_Special[FuelID])
                .eut(-FuelCalorificValue_Special[FuelID])
                .addTo(GeneratorRecipes_Naquadah);
        }

        // "Large Naquadah Reactor" - 12732
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 12732))
                .fluidInputs(Fuel[FuelID])
                .fluidOutputs(Scrap[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Naquadah);
        }

        for (int FuelID = 0; FuelID < Fuel_Special.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 12732))
                .fluidInputs(Fuel_Special[FuelID])
                .fluidOutputs(Scrap_Special[FuelID])
                .duration(SECONDS * 50)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_Special[FuelID])
                .eut(-FuelCalorificValue_Special[FuelID])
                .addTo(GeneratorRecipes_Naquadah);
        }
    }
}
