package Recipes.ChaosRecipes;

import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import gregtech.api.recipe.maps.AssemblyLineFrontend;
import util.RecipesFrontend.SpecialAssemblyLineItemFrontend;

public class ChaosRecipeMap {

    public static final RecipeMap<RecipeMapBackend> AssemblyLineNormalRecipe = RecipeMapBuilder
        .of("Chaos of AssemblyLine Normal", RecipeMapBackend::new)
        .maxIO(16, 1, 4, 0)
        .minInputs(1, 0)
        .useSpecialSlot()
        .neiTransferRect(88, 8, 18, 72)
        .neiTransferRect(124, 8, 18, 72)
        .neiTransferRect(142, 26, 18, 18)
        .frontend(AssemblyLineFrontend::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> AssemblyLineItemRecipe = RecipeMapBuilder
        .of("Chaos of AssemblyLine Item", RecipeMapBackend::new)
        .maxIO(92, 1, 18, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(400))
        .neiTransferRect(120, 175, 20, 16)
        .frontend(SpecialAssemblyLineItemFrontend::new)
        .build();
}
