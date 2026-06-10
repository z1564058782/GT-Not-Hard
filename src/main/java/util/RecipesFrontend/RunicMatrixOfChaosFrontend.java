package util.RecipesFrontend;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

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

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class RunicMatrixOfChaosFrontend extends RecipeMapFrontend {

    public RunicMatrixOfChaosFrontend(BasicUIPropertiesBuilder uiPropertiesBuilder,
        NEIRecipePropertiesBuilder neiRecipePropertiesBuilder) {
        super(
            uiPropertiesBuilder.logoPos(new Pos2d(150, 8)),
            neiRecipePropertiesBuilder.recipeBackgroundSize(new Size(170, 140)));
    }

    @Override
    public List<Pos2d> getItemInputPositions(int itemInputCount) {
        int totalCount_1 = 25;
        int xOrigin_1 = 8;
        int yOrigin_1 = 8;
        int xDirMaxCount_1 = 5;
        int yDirMaxCount_1 = 5;

        int totalCount_2 = 10;
        int xOrigin_2 = 8;
        int yOrigin_2 = 102;
        int xDirMaxCount_2 = 5;
        int yDirMaxCount_2 = 2;

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
        return UIHelper.getGridPositions(itemOutputCount, 130, 64, 1, 1);
    }

    public List<Pos2d> getFluidInputPositions(int fluidInputCount) {
        return UIHelper.getGridPositions(fluidInputCount, 0, 0, 0, 0);
    }

    public List<Pos2d> getFluidOutputPositions(int fluidOutputCount) {
        return UIHelper.getGridPositions(fluidOutputCount, 0, 0, 0, 0);
    }

    public void addProgressBar(ModularWindow.Builder builder, Supplier<Float> progressSupplier, Pos2d windowOffset) {
        builder.widget(
            (new ProgressBar()).setTexture(GTUITextures.PROGRESSBAR_ARROW, 16)
                .setDirection(ProgressBar.Direction.RIGHT)
                .setProgress(progressSupplier)
                .setSynced(false, false)
                .setPos((new Pos2d(105, 64)).add(windowOffset))
                .setSize(20, 16));
    }
}
