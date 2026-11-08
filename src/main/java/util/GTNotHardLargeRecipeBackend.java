package util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mofoga.gtnothard.config.LargeAssemblyRecipeConfig;

import gregtech.api.recipe.RecipeCategory;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBackendPropertiesBuilder;
import gregtech.api.util.GTOreDictUnificator;
import gregtech.api.util.GTRecipe;

/**
 * Bounded-memory backend for GT Not Hard's large assembly recipes, for GT 5.09.54.133.
 *
 * Retains GT's package-private matching entry point without overriding it. A single validated
 * reflective access keeps its private category registry populated without compiling the recipe trie.
 * The owner must be bound after RecipeMapBuilder.build(), before registering any recipes.
 * Never call super.compileRecipe, super.removeRecipes or super.reInit: those build the Cartesian trie.
 * Full input matching remains in GT's filterFindRecipe; voltage and caller predicates remain in FindRecipeQuery.
 */
public final class GTNotHardLargeRecipeBackend extends RecipeMapBackend {

    private static final Logger LOG = LogManager.getLogger("gtnothard");
    private static final Field PARENT_CATEGORIES_FIELD = findParentCategoriesField();

    private final List<GTRecipe> recipes = new ArrayList<>();
    private final Set<GTRecipe> registered = Collections.newSetFromMap(new IdentityHashMap<>());
    private final Map<RecipeCategory, Collection<GTRecipe>> categories = readParentCategories();
    private RecipeMap<?> owner;

    public GTNotHardLargeRecipeBackend(RecipeMapBackendPropertiesBuilder propertiesBuilder) {
        super(propertiesBuilder);
    }

    /** Call once, immediately after building the map, because GT's setRecipeMap is package-private. */
    public void bindRecipeMap(RecipeMap<?> recipeMap) {
        Objects.requireNonNull(recipeMap, "recipeMap");
        if (recipeMap.getBackend() != this) {
            throw new IllegalArgumentException("Cannot bind a recipe map belonging to another backend");
        }
        if (owner != null && owner != recipeMap) {
            throw new IllegalStateException("Backend is already bound to another recipe map");
        }
        owner = recipeMap;
    }

    @Override
    public Collection<GTRecipe> getAllRecipes() {
        return Collections.unmodifiableList(recipes);
    }

    @Override
    public Collection<GTRecipe> getRecipesByCategory(RecipeCategory category) {
        return Collections.unmodifiableCollection(categories.getOrDefault(category, Collections.emptyList()));
    }

    @Override
    public Map<RecipeCategory, Collection<GTRecipe>> getRecipeCategoryMap() {
        Map<RecipeCategory, Collection<GTRecipe>> view = new LinkedHashMap<>();
        categories.forEach((category, entries) -> view.put(category, Collections.unmodifiableCollection(entries)));
        return Collections.unmodifiableMap(view);
    }

    @Override
    public GTRecipe compileRecipe(GTRecipe recipe) {
        Objects.requireNonNull(recipe, "recipe");
        if (owner == null) {
            throw new IllegalStateException("Call bindRecipeMap after building the large assembly recipe map");
        }
        long started = System.nanoTime();
        if (LargeAssemblyRecipeConfig.logRegistration) {
            LOG.info(
                "[large-assembly] map={} register begin #{}: items={}, fluids={}, output={}",
                owner.unlocalizedName,
                recipes.size() + 1,
                recipe.mInputs.length,
                recipe.mFluidInputs.length,
                outputName(recipe));
        }
        if (recipe.getRecipeCategory() == null) recipe.setRecipeCategory(owner.getDefaultRecipeCategory());
        if (recipe.getRecipeCategory().recipeMap != owner) {
            throw new IllegalArgumentException("Recipe category belongs to a different recipe map");
        }
        recipes.add(recipe);
        registered.add(recipe);
        categories.computeIfAbsent(recipe.getRecipeCategory(), ignored -> new ArrayList<>())
            .add(recipe);

        // This inherited helper only maintains hatch input filters. It never builds the recipe trie.
        addToItemMap(recipe);
        if (LargeAssemblyRecipeConfig.logRegistration) {
            LOG.info(
                "[large-assembly] map={} register done #{} in {} us",
                owner.unlocalizedName,
                recipes.size(),
                (System.nanoTime() - started) / 1000L);
        }
        return recipe;
    }

    @Override
    public void removeRecipes(Collection<? extends GTRecipe> recipesToRemove) {
        // Copy first, so getAllRecipes() can itself be passed as the removal collection.
        Set<GTRecipe> removed = Collections.newSetFromMap(new IdentityHashMap<>());
        removed.addAll(recipesToRemove);
        recipes.removeIf(removed::contains);
        rebuildMetadata(false);
    }

    @Override
    public void removeRecipe(GTRecipe recipe) {
        removeRecipes(Collections.singleton(recipe));
    }

    @Override
    public void clearRecipes() {
        recipes.clear();
        registered.clear();
        categories.clear();
        // Also clears the parent's category registry, filters, cache and empty trie.
        super.clearRecipes();
    }

    @Override
    public void reInit() {
        rebuildMetadata(true);
    }

    private void rebuildMetadata(boolean reUnificate) {
        super.clearRecipes();
        registered.clear();
        categories.clear();
        for (GTRecipe recipe : recipes) {
            if (reUnificate) {
                // Same unsafe unification as GT's reInit: retain quantities above 64 and zero-count tools.
                GTOreDictUnificator.setStackArray(true, true, recipe.mInputs);
                GTOreDictUnificator.setStackArray(true, true, recipe.mOutputs);
            }
            registered.add(recipe);
            categories.computeIfAbsent(recipe.getRecipeCategory(), ignored -> new ArrayList<>())
                .add(recipe);
            addToItemMap(recipe);
        }
    }

    @Override
    protected Stream<GTRecipe> lookupCandidateStream(ItemStack[] items, FluidStack[] fluids) {
        // Linear scan is intentional. Memory is O(recipes + input-filter entries), not a product
        // of material alternatives. No physical slot order or mandatory sample/circuit key is assumed.
        return recipes.stream();
    }

    @Override
    protected boolean filterFindRecipe(GTRecipe recipe, ItemStack[] items, FluidStack[] fluids, ItemStack specialSlot,
        boolean dontCheckStackSizes) {
        // The inherited full candidate pipeline also checks caller-supplied cached recipes here.
        // Reject stale caches before delegating quantities, substitutions, NBT and special slots to GT.
        return registered.contains(recipe)
            && super.filterFindRecipe(recipe, items, fluids, specialSlot, dontCheckStackSizes);
    }

    @Override
    protected void cache(ItemStack[] items, FluidStack[] fluids, GTRecipe recipe) {
        // No backend hash cache. Machines may still pass a registered cachedRecipe to the query.
    }

    private static Field findParentCategoriesField() {
        try {
            Field field = RecipeMapBackend.class.getDeclaredField("recipesByCategory");
            if (!Map.class.isAssignableFrom(field.getType())) {
                throw new IllegalStateException("Unexpected type for RecipeMapBackend.recipesByCategory");
            }
            field.setAccessible(true);
            return field;
        } catch (ReflectiveOperationException | RuntimeException error) {
            throw new IllegalStateException(
                "GT Not Hard large recipe backend requires GT 5.09.54.133's recipesByCategory field; "
                    + "recheck compatibility after upgrading GT",
                error);
        }
    }

    @SuppressWarnings("unchecked")
    private Map<RecipeCategory, Collection<GTRecipe>> readParentCategories() {
        try {
            Object value = PARENT_CATEGORIES_FIELD.get(this);
            if (!(value instanceof Map)) {
                throw new IllegalStateException("RecipeMapBackend category registry is not initialized");
            }
            // Read the existing container. Do not replace the field or change GT's classes.
            return (Map<RecipeCategory, Collection<GTRecipe>>) value;
        } catch (IllegalAccessException error) {
            throw new IllegalStateException("Cannot access GT's category registry for large recipes", error);
        }
    }

    private static String outputName(GTRecipe recipe) {
        return recipe.mOutputs.length == 0 || recipe.mOutputs[0] == null ? "<none>"
            : recipe.mOutputs[0].getUnlocalizedName();
    }
}
