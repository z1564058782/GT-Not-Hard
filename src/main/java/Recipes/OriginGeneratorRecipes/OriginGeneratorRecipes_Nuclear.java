package Recipes.OriginGeneratorRecipes;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.IndustrialCraft2;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import net.minecraft.item.ItemStack;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.ItemFuelOfGeneratorFrontend;

public class OriginGeneratorRecipes_Nuclear {

    public static final RecipeMap<RecipeMapBackend> GeneratorRecipes_Nuclear = RecipeMapBuilder
        .of("Origin of Generator with Nuclear")
        .maxIO(2, 1, 0, 0)
        .minInputs(2, 0)
        .neiHandlerInfo(builder -> builder.setHeight(128))
        .frontend(ItemFuelOfGeneratorFrontend::new)
        .build();

    private static final String[] FuelBaseline = new String[] {
        // "Thorium"
        "1,000,000",
        // "Uranium"
        "20,000,000",
        // "MOX"
        "40,000,000",
        // "High Density Uranium"
        "140,000,000",
        // "High Density Plutonium"
        "70,000,000",
        // "Excited Uranium"
        "144,000,000",
        // "Excited Plutonium"
        "320,000,000",
        // "Naquadah"
        "200,000,000",
        // "Naquadria"
        "200,000,000",
        // "Tiberium"
        "50,000,000" };

    private static final int[] FuelCalorificValue = new int[] {
        // "Thorium"
        1_000_000,
        // "Uranium"
        20_000_000,
        // "MOX"
        40_000_000,
        // "High Density Uranium"
        140_000_000,
        // "High Density Plutonium"
        70_000_000,
        // "Excited Uranium"
        144_000_000,
        // "Excited Plutonium"
        320_000_000,
        // "Naquadah"
        200_000_000,
        // "Naquadria"
        200_000_000,
        // "Tiberium"
        50_000_000 };

    private static final ItemStack[] Fuel_Single = new ItemStack[] {
        // "Fuel Rod (Thorium)"
        getModItem(GregTech.ID, "gt.rodThorium", 1L),
        // "Fuel Rod (Uranium)"
        getModItem(GregTech.ID, "gt.rodUranium", 1L),
        // "Fuel Rod (Mox)"
        getModItem(GregTech.ID, "gt.rodMOX", 1L),
        // "Fuel Rod (High Density Uranium)"
        getModItem(GregTech.ID, "gt.rodHighDensityUranium", 1L),
        // "Fuel Rod (High Density Plutonium)"
        getModItem(GregTech.ID, "gt.rodHighDensityPlutonium", 1L),
        // "Fuel Rod (Excited Uranium)"
        getModItem(GregTech.ID, "gt.rodExcitedUranium", 1L),
        // "Fuel Rod (Excited Plutonium)"
        getModItem(GregTech.ID, "gt.rodExcitedPlutonium", 1L),
        // "Fuel Rod (Naquadah)"
        getModItem(GregTech.ID, "gt.rodNaquadah", 1L),
        // "Fuel Rod (Naquadria)"
        getModItem(GregTech.ID, "gt.rodNaquadria", 1L),
        // "Fuel Rod (Tiberium)"
        getModItem(GregTech.ID, "gt.rodTiberium", 1L) };

    private static final ItemStack[] Scrap_Single = new ItemStack[] {
        // "Fuel Rod (Thorium)"
        getModItem(GregTech.ID, "gt.depletedRodThorium", 1L),
        // "Fuel Rod (Uranium)"
        getModItem(GregTech.ID, "gt.depletedRodUranium", 1L),
        // "Fuel Rod (Mox)"
        getModItem(GregTech.ID, "gt.depletedRodMOX", 1L),
        // "Fuel Rod (High Density Uranium)"
        getModItem(GregTech.ID, "gt.depletedRodHighDensityUranium", 1L),
        // "Fuel Rod (High Density Plutonium)"
        getModItem(GregTech.ID, "gt.depletedRodHighDensityPlutonium", 1L),
        // "Fuel Rod (Excited Uranium)"
        getModItem(GregTech.ID, "gt.depletedRodExcitedUranium", 1L),
        // "Fuel Rod (Excited Plutonium)"
        getModItem(GregTech.ID, "gt.depletedRodExcitedPlutonium", 1L),
        // "Fuel Rod (Naquadah)"
        getModItem(GregTech.ID, "gt.depletedRodNaquadah", 1L),
        // "Fuel Rod (Naquadria)"
        getModItem(GregTech.ID, "gt.depletedRodNaquadria", 1L),
        // "Fuel Rod (Tiberium)"
        getModItem(GregTech.ID, "gt.depletedRodTiberium", 1L) };

    private static final ItemStack[] Fuel_Dual = new ItemStack[] {
        // "Dual Fuel Rod (Thorium)"
        getModItem(GregTech.ID, "gt.rodThorium2", 1L),
        // "Dual Fuel Rod (Uranium)"
        getModItem(GregTech.ID, "gt.rodUranium2", 1L),
        // "Dual Fuel Rod (Mox)"
        getModItem(GregTech.ID, "gt.rodMOX2", 1L),
        // "Dual Fuel Rod (High Density Uranium)"
        getModItem(GregTech.ID, "gt.rodHighDensityUranium2", 1L),
        // "Dual Fuel Rod (High Density Plutonium)"
        getModItem(GregTech.ID, "gt.rodHighDensityPlutonium2", 1L),
        // "Dual Fuel Rod (Excited Uranium)"
        getModItem(GregTech.ID, "gt.rodExcitedUranium2", 1L),
        // "Dual Fuel Rod (Excited Plutonium)"
        getModItem(GregTech.ID, "gt.rodExcitedPlutonium2", 1L),
        // "Dual Fuel Rod (Naquadah)"
        getModItem(GregTech.ID, "gt.rodNaquadah2", 1L),
        // "Dual Fuel Rod (Naquadria)"
        getModItem(GregTech.ID, "gt.rodNaquadria2", 1L),
        // "Dual Fuel Rod (Tiberium)"
        getModItem(GregTech.ID, "gt.rodTiberium2", 1L) };

    private static final ItemStack[] Scrap_Dual = new ItemStack[] {
        // "Dual Fuel Rod (Thorium)"
        getModItem(GregTech.ID, "gt.depletedRodThorium2", 1L),
        // "Dual Fuel Rod (Uranium)"
        getModItem(GregTech.ID, "gt.depletedRodUranium2", 1L),
        // "Dual Fuel Rod (Mox)"
        getModItem(GregTech.ID, "gt.depletedRodMOX2", 1L),
        // "Dual Fuel Rod (High Density Uranium)"
        getModItem(GregTech.ID, "gt.depletedRodHighDensityUranium2", 1L),
        // "Dual Fuel Rod (High Density Plutonium)"
        getModItem(GregTech.ID, "gt.depletedRodHighDensityPlutonium2", 1L),
        // "Dual Fuel Rod (Excited Uranium)"
        getModItem(GregTech.ID, "gt.depletedRodExcitedUranium2", 1L),
        // "Dual Fuel Rod (Excited Plutonium)"
        getModItem(GregTech.ID, "gt.depletedRodExcitedPlutonium2", 1L),
        // "Dual Fuel Rod (Naquadah)"
        getModItem(GregTech.ID, "gt.depletedRodNaquadah2", 1L),
        // "Dual Fuel Rod (Naquadria)"
        getModItem(GregTech.ID, "gt.depletedRodNaquadria2", 1L),
        // "Dual Fuel Rod (Tiberium)"
        getModItem(GregTech.ID, "gt.depletedRodTiberium2", 1L) };

    private static final ItemStack[] Fuel_Quad = new ItemStack[] {
        // "Quad Fuel Rod (Thorium)"
        getModItem(GregTech.ID, "gt.rodThorium4", 1L),
        // "Quad Fuel Rod (Uranium)"
        getModItem(GregTech.ID, "gt.rodUranium4", 1L),
        // "Quad Fuel Rod (Mox)"
        getModItem(GregTech.ID, "gt.rodMOX4", 1L),
        // "Quad Fuel Rod (High Density Uranium)"
        getModItem(GregTech.ID, "gt.rodHighDensityUranium4", 1L),
        // "Quad Fuel Rod (High Density Plutonium)"
        getModItem(GregTech.ID, "gt.rodHighDensityPlutonium4", 1L),
        // "Quad Fuel Rod (Excited Uranium)"
        getModItem(GregTech.ID, "gt.rodExcitedUranium4", 1L),
        // "Quad Fuel Rod (Excited Plutonium)"
        getModItem(GregTech.ID, "gt.rodExcitedPlutonium4", 1L),
        // "Quad Fuel Rod (Naquadah)"
        getModItem(GregTech.ID, "gt.rodNaquadah4", 1L),
        // "Quad Fuel Rod (Naquadria)"
        getModItem(GregTech.ID, "gt.rodNaquadria4", 1L),
        // "Quad Fuel Rod (Tiberium)"
        getModItem(GregTech.ID, "gt.rodTiberium4", 1L) };

    private static final ItemStack[] Scrap_Quad = new ItemStack[] {
        // "Quad Fuel Rod (Thorium)"
        getModItem(GregTech.ID, "gt.depletedRodThorium4", 1L),
        // "Quad Fuel Rod (Uranium)"
        getModItem(GregTech.ID, "gt.depletedRodUranium4", 1L),
        // "Quad Fuel Rod (Mox)"
        getModItem(GregTech.ID, "gt.depletedRodMOX4", 1L),
        // "Quad Fuel Rod (High Density Uranium)"
        getModItem(GregTech.ID, "gt.depletedRodHighDensityUranium4", 1L),
        // "Quad Fuel Rod (High Density Plutonium)"
        getModItem(GregTech.ID, "gt.depletedRodHighDensityPlutonium4", 1L),
        // "Quad Fuel Rod (Excited Uranium)"
        getModItem(GregTech.ID, "gt.depletedRodExcitedUranium4", 1L),
        // "Quad Fuel Rod (Excited Plutonium)"
        getModItem(GregTech.ID, "gt.depletedRodExcitedPlutonium4", 1L),
        // "Quad Fuel Rod (Naquadah)"
        getModItem(GregTech.ID, "gt.depletedRodNaquadah4", 1L),
        // "Quad Fuel Rod (Naquadria)"
        getModItem(GregTech.ID, "gt.depletedRodNaquadria4", 1L),
        // "Quad Fuel Rod (Tiberium)"
        getModItem(GregTech.ID, "gt.depletedRodTiberium4", 1L) };

    public static void addGeneratorRecipes_Nuclear() {
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(IndustrialCraft2.ID, "blockGenerator", 0L, 5),
                getModItem(GregTech.ID, "gt.rodNaquadah32", 1L))
            .itemOutputs(getModItem(GregTech.ID, "gt.depletedRodNaquadah32", 1L))
            .duration(SECONDS)
            .setNEIDesc("Fuel Baseline = 200,000,000")
            .eut(-200_000_000 * 10)
            .addTo(GeneratorRecipes_Nuclear);

        for (int FuelID = 0; FuelID < Fuel_Single.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(IndustrialCraft2.ID, "blockGenerator", 0L, 5), Fuel_Single[FuelID])
                .itemOutputs(Scrap_Single[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Nuclear);
        }

        for (int FuelID = 0; FuelID < Fuel_Dual.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(IndustrialCraft2.ID, "blockGenerator", 0L, 5), Fuel_Dual[FuelID])
                .itemOutputs(Scrap_Dual[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID] * 2)
                .addTo(GeneratorRecipes_Nuclear);
        }

        for (int FuelID = 0; FuelID < Fuel_Quad.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(IndustrialCraft2.ID, "blockGenerator", 0L, 5), Fuel_Quad[FuelID])
                .itemOutputs(Scrap_Quad[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID] * 4)
                .addTo(GeneratorRecipes_Nuclear);
        }
    }
}
