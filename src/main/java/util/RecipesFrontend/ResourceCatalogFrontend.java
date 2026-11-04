package util.RecipesFrontend;

import java.util.Comparator;
import java.util.List;

import net.minecraft.item.ItemStack;

import com.gtnewhorizons.modularui.api.math.Pos2d;
import com.gtnewhorizons.modularui.api.math.Size;

import codechicken.nei.recipe.HandlerInfo;
import gregtech.api.recipe.BasicUIPropertiesBuilder;
import gregtech.api.recipe.NEIRecipeProperties;
import gregtech.api.recipe.NEIRecipePropertiesBuilder;
import gregtech.api.util.GTRecipe;
import gregtech.common.gui.modularui.UIHelper;
import gregtech.nei.RecipeDisplayInfo;

public class ResourceCatalogFrontend extends LocalizedRecipeFrontend {

    public static final int OUTPUTS_PER_PAGE = 27;
    public static final int OUTPUTS_PER_SCROLL_PAGE = 135;
    public static final int HANDLER_HEIGHT = 140;

    public static List<Pos2d> outputPositions(int count) {
        // GT also requests positions for a map's maximum I/O while registering every NEI handler.
        // The preferred page size is not a rendering limit: older maps may still declare 90/135 outputs.
        int rows = count <= 0 ? 0 : (count - 1) / 9 + 1;
        return UIHelper.getGridPositions(count, 7, 44, 9, rows);
    }

    public ResourceCatalogFrontend(BasicUIPropertiesBuilder uiPropertiesBuilder,
        NEIRecipePropertiesBuilder neiRecipePropertiesBuilder) {
        super(
            uiPropertiesBuilder,
            neiRecipePropertiesBuilder.recipeComparator(
                Comparator.comparing(ResourceCatalogFrontend::selectorName)
                    .thenComparingInt(ResourceCatalogFrontend::selectorMetadata)));
    }

    @Override
    protected NEIRecipePropertiesBuilder modifyNEIProperties(NEIRecipePropertiesBuilder builder) {
        builder = super.modifyNEIProperties(builder);
        int outputCount = Math.max(uiProperties.maxItemOutputs, uiProperties.maxFluidOutputs);
        if (outputCount <= OUTPUTS_PER_PAGE) {
            return builder;
        }

        NEIRecipeProperties existing = builder.build();
        int rows = (outputCount - 1) / 9 + 1;
        int height = Math.max(existing.recipeBackgroundSize.height, 44 + rows * 18 + 2);
        return builder.recipeBackgroundSize(new Size(existing.recipeBackgroundSize.width, height))
            .handlerInfoCreator(handler -> {
                HandlerInfo.Builder configured = existing.handlerInfoCreator == null ? handler
                    : existing.handlerInfoCreator.apply(handler);
                return configured.setHeight(
                    Math.max(
                        configured.build()
                            .getHeight(),
                        height + 40));
            });
    }

    @Override
    public void drawDescription(RecipeDisplayInfo recipeInfo) {
        // Catalog pages are previews, not energy-consuming processing recipes.
        drawSpecialInfo(recipeInfo);
    }

    private static String selectorName(GTRecipe recipe) {
        ItemStack selector = recipe.mInputs.length == 0 ? null : recipe.mInputs[0];
        return selector == null ? "" : selector.getUnlocalizedName();
    }

    private static int selectorMetadata(GTRecipe recipe) {
        ItemStack selector = recipe.mInputs.length == 0 ? null : recipe.mInputs[0];
        return selector == null ? 0 : selector.getItemDamage();
    }
}
