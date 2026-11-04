package Recipes.SingularityRecipes_VoidDust;

import static gregtech.api.enums.Mods.NEIOrePlugin;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;
import static util.AggregateItemStackArray.addSplitAggregateArray;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import util.RecipesFrontend.ResourceCatalogFrontend;
import util.RegisteredResourceCatalog;

public class SingularityDustRecipes_T10 {

    public static final Map<String, ItemStack[]> VoidDustRecipes_T10 = new HashMap<>();

    public static final int NEI_ItemOutput_Size = ResourceCatalogFrontend.OUTPUTS_PER_PAGE;

    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T10 = FakeSingularityDustRecipes.addFakeVoidDustRecipes;

    public static void addVoidDustRecipes_T10() {
        VoidDustRecipes_T10.put("DD", RegisteredResourceCatalog.collectDusts());
    }

    public static void addFakeVoidDustRecipes_T10() {
        ItemStack[] dusts = VoidDustRecipes_T10.get("DD");
        if (dusts == null) {
            throw new IllegalStateException("Build the T10 dust catalog before registering its NEI recipes");
        }
        for (ItemStack[] page : addSplitAggregateArray(
            RegisteredResourceCatalog.copyItems(dusts),
            NEI_ItemOutput_Size)) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L))
                .itemOutputs(page)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T10);
        }
    }
}
