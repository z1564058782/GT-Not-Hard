package util.RecipesFrontend;

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
public class OreProcessOfChaosFrontend extends RecipeMapFrontend {

    public OreProcessOfChaosFrontend(BasicUIPropertiesBuilder uiPropertiesBuilder,
        NEIRecipePropertiesBuilder neiRecipePropertiesBuilder) {
        super(
            uiPropertiesBuilder.logoPos(new Pos2d(8, 8)),
            neiRecipePropertiesBuilder.recipeBackgroundSize(new Size(170, 100)));
    }

    @Override
    public List<Pos2d> getItemInputPositions(int itemInputCount) {
        return UIHelper.getGridPositions(itemInputCount, 30, 30, 1, 1);
    }

    public List<Pos2d> getItemOutputPositions(int itemOutputCount) {
        return UIHelper.getGridPositions(Math.min(itemOutputCount, 16), 90, 16, 4, 4);
    }

    public List<Pos2d> getFluidInputPositions(int fluidInputCount) {
        return UIHelper.getGridPositions(fluidInputCount, 20, 55, 2, 1);
    }

    public List<Pos2d> getFluidOutputPositions(int fluidOutputCount) {
        return UIHelper.getGridPositions(fluidOutputCount, 0, 0, 0, 0);
    }

    public void addProgressBar(ModularWindow.Builder builder, Supplier<Float> progressSupplier, Pos2d windowOffset) {
        builder.widget(
            (new ProgressBar()).setTexture(GTUITextures.PROGRESSBAR_ARROW, 24)
                .setDirection(ProgressBar.Direction.RIGHT)
                .setProgress(progressSupplier)
                .setSynced(false, false)
                .setPos((new Pos2d(62, 44)).add(windowOffset))
                .setSize(20, 16));
    }
}
