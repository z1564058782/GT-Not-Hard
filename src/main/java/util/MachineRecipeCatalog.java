package util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

import gregtech.api.recipe.RecipeMap;

public final class MachineRecipeCatalog {

    private static final String[] RECIPE_MAP_CLASSES = { "loader.ChaosRecipeLoader",
        "Recipes.ChaosRecipes.ChaosAntimatterRecipes", "Recipes.ChaosRecipes.ChaosArcaneWorktableRecipes",
        "Recipes.ChaosRecipes.ChaosBloodMagicRecipes", "Recipes.ChaosRecipes.ChaosBotaniaRecipes",
        "Recipes.ChaosRecipes.ChaosCircuitAssemblerRecipes", "Recipes.ChaosRecipes.ChaosCrucibleRecipes",
        "Recipes.ChaosRecipes.ChaosEssenceFarmRecipes", "Recipes.ChaosRecipes.ChaosExoticRecipes",
        "Recipes.ChaosRecipes.ChaosFallingTowerRecipes", "Recipes.ChaosRecipes.ChaosOreRecipes",
        "Recipes.ChaosRecipes.ChaosReplicatorRecipes", "Recipes.ChaosRecipes.ChaosRunicMatrixRecipes",
        "Recipes.ChaosRecipes.ChaosSpecialCompressRecipes", "Recipes.ChaosRecipes.ChaosXtremeCraftingRecipes",
        "Recipes.ChaosRecipes.ChaosZhuHaiRecipes",
        "Recipes.SingularityRecipes_Ecosystem.FakeSingularityEcosystemRecipes",
        "Recipes.SingularityRecipes_ModItem.FakeSingularityModItemRecipes_Show",
        "Recipes.SingularityRecipes_Pachinko.FakeSingularityPachinkoRecipes",
        "Recipes.SingularityRecipes_VoidDust.FakeSingularityDustRecipes",
        "Recipes.SingularityRecipes_VoidDust.SingularityDustRecipes_T10",
        "Recipes.SingularityRecipes_VoidFluid.FakeSingularityFluidRecipes",
        "Recipes.SingularityRecipes_VoidFluid.SingularityFluidRecipes_T10",
        "Recipes.SingularityRecipes_VoidGem.FakeSingularityGemRecipes",
        "Recipes.SingularityRecipes_VoidIngot.FakeSingularityIngotRecipes",
        "Recipes.SingularityRecipes_VoidOre.FakeSingularityOreRecipes" };

    private static boolean recipeMapClassesLoaded;

    private MachineRecipeCatalog() {}

    public static void initialize() {
        ensureRecipeMapClassesLoaded();
    }

    public static List<RecipeMap<?>> getChaosRecipeMaps() {
        ensureRecipeMapClassesLoaded();
        return collectRecipeMaps(RecipeMap.ALL_RECIPE_MAPS.values(), "Chaos of ");
    }

    public static List<RecipeMap<?>> getSingularityRecipeMaps() {
        ensureRecipeMapClassesLoaded();
        return collectRecipeMaps(RecipeMap.ALL_RECIPE_MAPS.values(), "Singularity of ");
    }

    private static synchronized void ensureRecipeMapClassesLoaded() {
        if (recipeMapClassesLoaded) {
            return;
        }
        ClassLoader classLoader = MachineRecipeCatalog.class.getClassLoader();
        for (String className : RECIPE_MAP_CLASSES) {
            try {
                Class.forName(className, true, classLoader);
            } catch (ClassNotFoundException exception) {
                throw new IllegalStateException("Missing recipe map class: " + className, exception);
            }
        }
        recipeMapClassesLoaded = true;
    }

    static List<RecipeMap<?>> collectRecipeMaps(Collection<RecipeMap<?>> registeredMaps, String prefix) {
        LinkedHashSet<RecipeMap<?>> maps = new LinkedHashSet<>();
        for (RecipeMap<?> recipeMap : registeredMaps) {
            if (recipeMap != null && recipeMap.unlocalizedName.startsWith(prefix)) {
                maps.add(recipeMap);
            }
        }
        ArrayList<RecipeMap<?>> snapshot = new ArrayList<>(maps);
        snapshot.sort(Comparator.comparing(recipeMap -> recipeMap.unlocalizedName));
        return Collections.unmodifiableList(snapshot);
    }
}
