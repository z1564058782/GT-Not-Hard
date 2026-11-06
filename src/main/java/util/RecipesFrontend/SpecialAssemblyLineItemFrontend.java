package util.RecipesFrontend;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ParametersAreNonnullByDefault;

import com.gtnewhorizons.modularui.api.math.Pos2d;
import com.gtnewhorizons.modularui.api.math.Size;
import com.gtnewhorizons.modularui.api.screen.ModularWindow;
import com.gtnewhorizons.modularui.common.widget.ProgressBar;

import gregtech.api.gui.modularui.GTUITextures;
import gregtech.api.recipe.BasicUIPropertiesBuilder;
import gregtech.api.recipe.NEIRecipePropertiesBuilder;
import gregtech.api.recipe.RecipeMapFrontend;
import gregtech.api.util.MethodsReturnNonnullByDefault;
import gregtech.common.gui.modularui.UIHelper;
import gregtech.nei.GTNEIDefaultHandler;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class SpecialAssemblyLineItemFrontend extends RecipeMapFrontend {

    public SpecialAssemblyLineItemFrontend(BasicUIPropertiesBuilder uiPropertiesBuilder,
        NEIRecipePropertiesBuilder neiRecipePropertiesBuilder) {
        super(
            uiPropertiesBuilder.logoPos(new Pos2d(8, 8)),
            neiRecipePropertiesBuilder.recipeBackgroundSize(new Size(170, 366)));
    }

    @Override
    public List<Pos2d> getItemInputPositions(int itemInputCount) {
        int totalCount_1 = 2;
        int xOrigin_1 = 8 + 18 * 2;
        int yOrigin_1 = 8;
        int xDirMaxCount_1 = 2;
        int yDirMaxCount_1 = 1;

        int totalCount_2 = 90;
        int xOrigin_2 = 8;
        int yOrigin_2 = 8 + 18 + 4;
        int xDirMaxCount_2 = 6;
        int yDirMaxCount_2 = 15;

        int distance = 18;
        List<Pos2d> results = new ArrayList<>();
        int count = 0;

        for (int j = 0; j < yDirMaxCount_1; ++j) {
            for (int i = 0; i < xDirMaxCount_1; ++i) {
                if (count >= totalCount_1) {
                    break;
                }

                results.add(new Pos2d(xOrigin_1 + i * distance, yOrigin_1 + j * distance));
                ++count;
            }
        }

        for (int j = 0; j < yDirMaxCount_2; ++j) {
            for (int i = 0; i < xDirMaxCount_2; ++i) {
                if (count >= totalCount_1 + totalCount_2) {
                    return results;
                }

                results.add(new Pos2d(xOrigin_2 + i * distance, yOrigin_2 + j * distance));
                ++count;
            }
        }

        return results;
    }

    public List<Pos2d> getItemOutputPositions(int itemOutputCount) {
        return UIHelper.getGridPositions(itemOutputCount, 144, 174, 1, 1);
    }

    public List<Pos2d> getFluidInputPositions(int fluidInputCount) {
        return UIHelper.getGridPositions(Math.min(fluidInputCount, 18), 8, 304, 6, 3);
    }

    public List<Pos2d> getFluidOutputPositions(int fluidOutputCount) {
        return UIHelper.getGridPositions(fluidOutputCount, 0, 0, 0, 0);
    }

    public void addProgressBar(ModularWindow.Builder builder, GTNEIDefaultHandler.NEITemplateContext ctx) {
        builder.widget(
            (new ProgressBar()).setTexture(GTUITextures.PROGRESSBAR_ARROW, 24)
                .setDirection(ProgressBar.Direction.RIGHT)
                .setProgress(ctx.progressSupplier)
                .setSynced(false, false)
                .setPos((new Pos2d(120, 175)).add(ctx.windowOffset))
                .setSize(20, 16));
    }
}
