package util;

import java.util.List;
import java.util.function.Supplier;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.util.StatCollector;

import com.gtnewhorizons.modularui.api.math.Pos2d;
import com.gtnewhorizons.modularui.api.math.Size;
import com.gtnewhorizons.modularui.api.screen.ModularWindow;
import com.gtnewhorizons.modularui.common.widget.ProgressBar;

import codechicken.nei.PositionedStack;
import gregtech.api.gui.modularui.GTUITextures;
import gregtech.api.recipe.BasicUIPropertiesBuilder;
import gregtech.api.recipe.NEIRecipePropertiesBuilder;
import gregtech.api.recipe.RecipeMapFrontend;
import gregtech.api.util.MethodsReturnNonnullByDefault;
import gregtech.common.gui.modularui.UIHelper;
import gregtech.nei.GTNEIDefaultHandler;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class OneToManyFluidsFrontend extends RecipeMapFrontend {

    public OneToManyFluidsFrontend(BasicUIPropertiesBuilder uiPropertiesBuilder,
        NEIRecipePropertiesBuilder neiRecipePropertiesBuilder) {
        super(
            uiPropertiesBuilder.logoPos(new Pos2d(8, 8)),
            neiRecipePropertiesBuilder.recipeBackgroundSize(new Size(170, 315)));
    }

    @Override
    public List<Pos2d> getItemInputPositions(int itemInputCount) {
        return UIHelper.getGridPositions(itemInputCount, 79, 8, 1, 1);
    }

    public List<Pos2d> getItemOutputPositions(int itemOutputCount) {
        return UIHelper.getGridPositions(itemOutputCount, 0, 0, 0, 0);
    }

    public List<Pos2d> getFluidInputPositions(int fluidInputCount) {
        return UIHelper.getGridPositions(fluidInputCount, 0, 0, 0, 0);
    }

    public List<Pos2d> getFluidOutputPositions(int fluidOutputCount) {
        return UIHelper.getGridPositions(Math.min(fluidOutputCount, 135), 7, 44, 9, 15);
    }

    public void drawNEIOverlays(GTNEIDefaultHandler.CachedDefaultRecipe neiCachedRecipe) {
        for (PositionedStack stack : neiCachedRecipe.mInputs) {
            this.drawNEIOverlayText(StatCollector.translateToLocal("NC"), stack);
        }
    }

    public void addProgressBar(ModularWindow.Builder builder, Supplier<Float> progressSupplier, Pos2d windowOffset) {
        builder.widget(
            (new ProgressBar()).setTexture(GTUITextures.PROGRESSBAR_HAMMER, 16)
                .setDirection(ProgressBar.Direction.DOWN)
                .setProgress(progressSupplier)
                .setSynced(false, false)
                .setPos((new Pos2d(81, 27)).add(windowOffset))
                .setSize(14, 16));
    }
}
