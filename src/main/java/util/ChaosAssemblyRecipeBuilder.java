package util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gregtech.api.enums.GTValues;
import gregtech.api.interfaces.IRecipeMap;
import gregtech.api.util.GTRecipe;
import gregtech.api.util.GTRecipeBuilder;

/**
 * Delegating builder for GT Not Hard's six assembly recipe groups.
 * Required FluidStack templates are checked before copying and are never modified.
 * A missing required fluid skips the WHOLE recipe before GT can discard a null input.
 */
public final class ChaosAssemblyRecipeBuilder {

    private static final Logger LOG = LogManager.getLogger("gtnothard");
    private static final AtomicInteger SKIPPED_RECIPES = new AtomicInteger();

    private final GTRecipeBuilder delegate;
    private final String recipeId;
    private final List<String> missingFluids = new ArrayList<>();
    private int fluidInputIndex;
    private boolean submitted;

    private ChaosAssemblyRecipeBuilder(String recipeId) {
        this.recipeId = Objects.requireNonNull(recipeId, "recipeId");
        delegate = GTValues.RA.stdBuilder();
    }

    public static ChaosAssemblyRecipeBuilder builder(String recipeId) {
        return new ChaosAssemblyRecipeBuilder(recipeId);
    }

    /**
     * Accept an existing EnumFluidList constant without calling .copy() at the call site.
     * A null template is recorded as a missing requirement, not passed through to GT.
     * The defensive snapshot preserves FluidStack NBT and the requested amount, including zero.
     * A static constant that already contains null has lost its registry name: this overload
     * cannot recover it or retry its original lookup. Such a recipe is safely skipped.
     */
    public static FluidRequirement requiredFluid(FluidStack template, int amount) {
        checkAmount(amount);
        if (template == null) {
            return new FluidRequirement(null, null, amount, "template is null");
        }
        if (template.getFluid() == null) {
            return new FluidRequirement(null, null, amount, "template has no fluid");
        }
        String registryName = template.getFluid()
            .getName();
        FluidStack snapshot = template.copy();
        if (snapshot == null || snapshot.getFluid() == null) {
            return new FluidRequirement(null, registryName, amount, "template copy is invalid");
        }
        snapshot.amount = amount;
        return new FluidRequirement(snapshot, registryName, amount, null);
    }

    /**
     * Retain compatibility with earlier callers that have an explicit registry name.
     * Only this overload can resolve a fluid registered after requirement creation.
     */
    public static FluidRequirement requiredFluid(String registryName, int amount) {
        if (registryName == null || registryName.isEmpty()) {
            throw new IllegalArgumentException("Empty required fluid registry name");
        }
        checkAmount(amount);
        return new FluidRequirement(null, registryName, amount, null);
    }

    private static void checkAmount(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Negative required fluid amount: " + amount);
    }

    public ChaosAssemblyRecipeBuilder itemInputsUnsafe(ItemStack... inputs) {
        delegate.itemInputsUnsafe(inputs);
        return this;
    }

    public ChaosAssemblyRecipeBuilder fluidInputs(FluidRequirement... requirements) {
        Objects.requireNonNull(requirements, "requirements");
        FluidStack[] resolved = new FluidStack[requirements.length];
        for (int i = 0; i < requirements.length; i++) {
            FluidRequirement requirement = Objects.requireNonNull(requirements[i], "required fluid");
            int inputIndex = ++fluidInputIndex;
            FluidStack fluid = requirement.resolve();
            if (fluid == null || fluid.getFluid() == null) {
                missingFluids.add(requirement.describeMissing(inputIndex));
            } else {
                resolved[i] = fluid;
            }
        }
        // GTRecipeBuilder.fluidInputs filters out nulls, which would reduce recipe costs.
        // Once any required input fails, later setters cannot unblock this builder.
        if (missingFluids.isEmpty()) delegate.fluidInputs(resolved);
        return this;
    }

    public ChaosAssemblyRecipeBuilder itemOutputs(ItemStack... outputs) {
        delegate.itemOutputs(outputs);
        return this;
    }

    public ChaosAssemblyRecipeBuilder eut(long eut) {
        delegate.eut(eut);
        return this;
    }

    public ChaosAssemblyRecipeBuilder duration(int ticks) {
        delegate.duration(ticks);
        return this;
    }

    public Collection<GTRecipe> addTo(IRecipeMap recipeMap) {
        Objects.requireNonNull(recipeMap, "recipeMap");
        if (submitted) throw new IllegalStateException("Recipe builder already submitted: " + recipeId);
        submitted = true;
        if (!missingFluids.isEmpty()) {
            SKIPPED_RECIPES.incrementAndGet();
            LOG.warn(
                "[assembly-recipes] Skipped recipe {} (output={}): missing required fluids {}",
                recipeId,
                outputName(),
                missingFluids);
            return Collections.emptyList();
        }
        return delegate.addTo(recipeMap);
    }

    public static int getSkippedRecipeCount() {
        return SKIPPED_RECIPES.get();
    }

    private String outputName() {
        ItemStack[] outputs = delegate.getItemOutputs();
        return outputs == null || outputs.length == 0 || outputs[0] == null ? "<none>"
            : outputs[0].getUnlocalizedName();
    }

    public static final class FluidRequirement {

        private final FluidStack snapshot;
        private final String registryName;
        private final int amount;
        private final String missingReason;

        private FluidRequirement(FluidStack snapshot, String registryName, int amount, String missingReason) {
            this.snapshot = snapshot;
            this.registryName = registryName;
            this.amount = amount;
            this.missingReason = missingReason;
        }

        private FluidStack resolve() {
            if (missingReason != null) return null;
            FluidStack fluid = snapshot == null ? FluidRegistry.getFluidStack(registryName, amount) : snapshot.copy();
            if (fluid != null) fluid.amount = amount;
            return fluid;
        }

        private String describeMissing(int inputIndex) {
            String name = registryName == null ? "<unknown fluid>" : registryName;
            String reason = missingReason == null ? "lookup or defensive copy returned no valid fluid" : missingReason;
            return "input #" + inputIndex + ": " + name + " (" + amount + " mB; " + reason + ")";
        }
    }
}
