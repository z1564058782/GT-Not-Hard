package Recipes.ChaosRecipes;

import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.Mods.PamsHarvestCraft;
import static gregtech.api.enums.TierEU.RECIPE_LV;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;
import static util.Utils.setStackSize;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import gregtech.api.util.GTUtility;

public class ChaosZhuHaiRecipes {

    public static final RecipeMap<RecipeMapBackend> addChaosZhuHaiFisheryRecipes = RecipeMapBuilder
        .of("Chaos of ZhuHai Fishery")
        .maxIO(1, 1, 0, 0)
        .minInputs(1, 0)
        // .disableOptimize()
        .build();

    public static void addChaosZhuHaiFisheryRecipes() {
        GTValues.RA.stdBuilder()
            .itemInputs(GTUtility.getIntegratedCircuit(1))
            .itemOutputs(setStackSize(getModItem(Minecraft.ID, "dye", 1), 8192))
            .duration(5 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(addChaosZhuHaiFisheryRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(GTUtility.getIntegratedCircuit(2))
            .itemOutputs(setStackSize(getModItem(Minecraft.ID, "fish", 1L), 8192))
            .duration(5 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(addChaosZhuHaiFisheryRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(GTUtility.getIntegratedCircuit(3))
            .itemOutputs(setStackSize(getModItem(Minecraft.ID, "leather", 1L), 8192))
            .duration(5 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(addChaosZhuHaiFisheryRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(GTUtility.getIntegratedCircuit(4))
            .itemOutputs(setStackSize(getModItem(Minecraft.ID, "bone", 1L), 8192))
            .duration(5 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(addChaosZhuHaiFisheryRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(GTUtility.getIntegratedCircuit(5))
            .itemOutputs(setStackSize(getModItem(PamsHarvestCraft.ID, "seaweedItem", 1L), 8192))
            .duration(5 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(addChaosZhuHaiFisheryRecipes);
    }
}
