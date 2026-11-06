package Recipes.SingularityRecipes_VoidFluid;

import static gregtech.api.enums.Mods.NEIOrePlugin;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;
import static util.AggregateFluidStackArray.addSplitAggregateArray;

import java.util.HashMap;
import java.util.Map;

import net.minecraftforge.fluids.FluidStack;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import util.RecipesFrontend.ResourceCatalogFrontend;
import util.RegisteredResourceCatalog;

public class SingularityFluidRecipes_T10 {

    public static final Map<String, FluidStack[]> VoidFluidRecipes_T10 = new HashMap<>();

    public static final int NEI_ItemOutput_Size = ResourceCatalogFrontend.OUTPUTS_PER_PAGE;

    public static final RecipeMap<RecipeMapBackend> addFakeVoidFluidRecipes_T10 = FakeSingularityFluidRecipes.addFakeVoidFluidRecipes;

    public static void addVoidFluidRecipes_T10() {
        VoidFluidRecipes_T10.put("DD", RegisteredResourceCatalog.collectFluids());
    }

    public static void addFakeVoidFluidRecipes_T10() {
        FluidStack[] fluids = VoidFluidRecipes_T10.get("DD");
        if (fluids == null) {
            throw new IllegalStateException("Build the T10 fluid catalog before registering its NEI recipes");
        }
        for (FluidStack[] page : addSplitAggregateArray(
            RegisteredResourceCatalog.copyFluids(fluids),
            NEI_ItemOutput_Size)) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L))
                .fluidOutputs(page)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T10);
        }
    }
}
