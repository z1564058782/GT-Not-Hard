package Recipes.SingularityRecipes_ModItem;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;
import static util.AggregateItemStackArray.addSplitAggregateArray;
import static util.RecipesFrontend.ResourceCatalogFrontend.OUTPUTS_PER_PAGE;

import net.minecraft.item.ItemStack;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.OneToManyItemsFrontend_Large;
import util.RecipesFrontend.ResourceCatalogFrontend;

public class FakeSingularityModItemRecipes_Show {

    public static final RecipeMap<RecipeMapBackend> addFakeModItemRecipes_Show = RecipeMapBuilder
        .of("Singularity of Mod Item")
        .maxIO(1, OUTPUTS_PER_PAGE, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(ResourceCatalogFrontend.HANDLER_HEIGHT))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static void addFakeModItemRecipes_Show() {
        SingularityModItemRecipes_Generate.refreshCatalog();
        addFakeModItemRecipes_Show.getBackend()
            .clearRecipes();
        for (ItemStack[] page : addSplitAggregateArray(
            SingularityModItemRecipes_Generate.getModItemSelectors(),
            OUTPUTS_PER_PAGE)) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15498))
                .itemOutputs(page)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Mod Mode")
                .eut(0)
                .addTo(addFakeModItemRecipes_Show);
        }
    }
}
