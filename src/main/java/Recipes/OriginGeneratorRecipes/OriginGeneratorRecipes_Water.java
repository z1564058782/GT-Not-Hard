package Recipes.OriginGeneratorRecipes;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import net.minecraft.item.ItemStack;

import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.FluidFuelOfGeneratorFrontend;

public class OriginGeneratorRecipes_Water {

    public static final RecipeMap<RecipeMapBackend> GeneratorRecipes_Water = RecipeMapBuilder
        .of("Origin of Generator with Water")
        .maxIO(1, 0, 1, 1)
        .minInputs(1, 1)
        .neiHandlerInfo(builder -> builder.setHeight(128))
        .frontend(FluidFuelOfGeneratorFrontend::new)
        .build();

    private static final ItemStack[] GeneratorType = new ItemStack[] {
        // "Hydro Turbine (MV)" - 17019
        getModItem(GregTech.ID, "gt.blockmachines", 0L, 17019),
        // "Hydro Turbine (HV)" - 17020
        getModItem(GregTech.ID, "gt.blockmachines", 0L, 17020),
        // "Hydro Turbine (EV)" - 17021
        getModItem(GregTech.ID, "gt.blockmachines", 0L, 17021),
        // "Hydro Turbine (IV)" - 17022
        getModItem(GregTech.ID, "gt.blockmachines", 0L, 17022),
        // "Hydro Turbine (LuV)" - 17023
        getModItem(GregTech.ID, "gt.blockmachines", 0L, 17023),
        // "Hydro Turbine (ZPM)" - 17024
        getModItem(GregTech.ID, "gt.blockmachines", 0L, 17024),
        // "Hydro Turbine (UV)" - 17025
        getModItem(GregTech.ID, "gt.blockmachines", 0L, 17025) };

    private static final String[] FuelBaseline = new String[] {
        // "Hydro Turbine (MV)" - 17019
        "128",
        // "Hydro Turbine (HV)" - 17020
        "512",
        // "Hydro Turbine (EV)" - 17021
        "2,048",
        // "Hydro Turbine (IV)" - 17022
        "8,192",
        // "Hydro Turbine (LuV)" - 17023
        "32,768",
        // "Hydro Turbine (ZPM)" - 17024
        "131,072",
        // "Hydro Turbine (UV)" - 17025
        "524,288" };

    private static final int[] FuelCalorificValue = new int[] {
        // "Hydro Turbine (MV)" - 17019
        128,
        // "Hydro Turbine (HV)" - 17020
        512,
        // "Hydro Turbine (EV)" - 17021
        2_048,
        // "Hydro Turbine (IV)" - 17022
        8_192,
        // "Hydro Turbine (LuV)" - 17023
        32_768,
        // "Hydro Turbine (ZPM)" - 17024
        131_072,
        // "Hydro Turbine (UV)" - 17025
        524_288 };

    public static void addGeneratorRecipes_Water() {
        for (int GeneratorID = 0; GeneratorID < GeneratorType.length; GeneratorID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(GeneratorType[GeneratorID])
                .fluidInputs(Materials.Water.getFluid(1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[GeneratorID])
                .eut(-FuelCalorificValue[GeneratorID])
                .addTo(GeneratorRecipes_Water);
        }
    }
}
