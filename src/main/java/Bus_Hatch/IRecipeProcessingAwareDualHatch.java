package Bus_Hatch;

import gregtech.api.metatileentity.implementations.MTEMultiBlockBase;
import gregtech.api.recipe.check.CheckRecipeResult;
import gregtech.common.tileentities.machines.IDualInputHatch;

/*
 * future GT Multiblock might check IDualInputHatch for 'instanceof IRecipeProcessingAwareHatch', so do not
 * implement in case it's called twice
 */
/* IRecipeProcessingAwareHatch, */
public interface IRecipeProcessingAwareDualHatch extends IDualInputHatch {

    void startRecipeProcessing();

    CheckRecipeResult endRecipeProcessing(MTEMultiBlockBase controller);

    void trunOffME();

    void trunONME();
}
