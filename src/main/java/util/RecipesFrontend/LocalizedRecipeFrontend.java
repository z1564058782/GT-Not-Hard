package util.RecipesFrontend;

import net.minecraft.util.StatCollector;

import gregtech.api.recipe.BasicUIPropertiesBuilder;
import gregtech.api.recipe.NEIRecipePropertiesBuilder;
import gregtech.api.recipe.RecipeMapFrontend;
import gregtech.nei.RecipeDisplayInfo;

public class LocalizedRecipeFrontend extends RecipeMapFrontend {

    public LocalizedRecipeFrontend(BasicUIPropertiesBuilder uiPropertiesBuilder,
        NEIRecipePropertiesBuilder neiRecipePropertiesBuilder) {
        super(uiPropertiesBuilder, neiRecipePropertiesBuilder);
    }

    @Override
    protected void drawSpecialInfo(RecipeDisplayInfo recipeInfo) {
        String[] descriptions = recipeInfo.recipe.getNeiDesc();
        if (descriptions == null) {
            super.drawSpecialInfo(recipeInfo);
            return;
        }
        for (String description : descriptions) {
            recipeInfo.drawText(translateDescription(description));
        }
    }

    public static String translateDescription(String description) {
        String fuelPrefix = "Fuel Baseline = ";
        if (description.startsWith(fuelPrefix)) {
            return StatCollector
                .translateToLocalFormatted("gtnothard.nei.fuel_baseline", description.substring(fuelPrefix.length()));
        }
        String key = "gtnothard.nei.description." + description;
        return StatCollector.canTranslate(key) ? StatCollector.translateToLocal(key) : description;
    }
}
