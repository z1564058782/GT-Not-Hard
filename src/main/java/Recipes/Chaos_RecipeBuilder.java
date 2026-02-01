package Recipes;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.recipe.RecipeMap;
import gregtech.api.util.GTRecipe;

public class Chaos_RecipeBuilder {

    public static Chaos_RecipeBuilder builder() {
        return new Chaos_RecipeBuilder();
    }

    private ItemStack[] inputItems = new ItemStack[0];
    private ItemStack[] outputItems = new ItemStack[0];
    private FluidStack[] inputFluids = new FluidStack[0];
    private FluidStack[] outputFluids = new FluidStack[0];
    private int[] outputChance;
    private int eut = 0;
    private int duration = 0;
    private int specialValue = 0;

    public Chaos_RecipeBuilder() {}

    public Chaos_RecipeBuilder itemInputs(ItemStack... inputItems) {
        if (inputItems != null && inputItems.length > 0) {
            this.inputItems = inputItems;
        }
        return this;
    }

    public Chaos_RecipeBuilder itemOutputs(ItemStack... outputItems) {
        if (outputItems != null && outputItems.length > 0) {
            this.outputItems = outputItems;
        }
        return this;
    }

    public Chaos_RecipeBuilder fluidInputs(FluidStack... inputFluids) {
        if (inputFluids != null && inputFluids.length > 0) {
            this.inputFluids = inputFluids;
        }
        return this;
    }

    public Chaos_RecipeBuilder fluidOutputs(FluidStack... outputFluids) {
        if (outputFluids != null && outputFluids.length > 0) {
            this.outputFluids = outputFluids;
        }
        return this;
    }

    public Chaos_RecipeBuilder outputChances(int... outputChance) {
        this.outputChance = outputChance;
        return this;
    }

    public Chaos_RecipeBuilder eut(int eut) {
        this.eut = eut;
        return this;
    }

    public Chaos_RecipeBuilder eut(long eut) {
        this.eut = (int) eut;
        return this;
    }

    public Chaos_RecipeBuilder duration(int duration) {
        this.duration = duration;
        return this;
    }

    public Chaos_RecipeBuilder specialValue(int specialValue) {
        this.specialValue = specialValue;
        return this;
    }

    public Chaos_RecipeBuilder noOptimize() {
        return this;
    }

    public Chaos_RecipeBuilder addTo(RecipeMap<?> recipeMap) {
        GTRecipe tempRecipe = new GTRecipe(
            false,
            inputItems,
            outputItems,
            null,
            outputChance,
            inputFluids,
            outputFluids,
            duration,
            eut,
            specialValue);

        tempRecipe.mInputs = inputItems.clone();
        tempRecipe.mOutputs = outputItems.clone();

        recipeMap.add(tempRecipe);
        return this;
    }
}
