package Recipes.SingularityRecipes_ModItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.OreDictionary;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.registry.GameData;
import gregtech.api.GregTechAPI;
import gregtech.api.enums.Mods;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.util.GTRecipe;
import util.RegisteredResourceCatalog;

/** A single registry-backed catalog shared by mod selectors, NEI and machine output. */
public class SingularityModItemRecipes_Generate {

    private static volatile Map<String, ItemStack[]> catalog;

    public static synchronized void refreshCatalog() {
        List<ItemStack> resources = collectCommonItems();
        if (FMLCommonHandler.instance()
            .getSide()
            .isClient()) {
            collectCreativeItems(resources);
        }
        Map<String, List<ItemStack>> grouped = new TreeMap<>();
        for (ItemStack stack : resources) {
            if (RegisteredResourceCatalog.isRegisteredItem(stack)) {
                grouped.computeIfAbsent(getModIdForItemStack(stack), ignored -> new ArrayList<>())
                    .add(stack);
            }
        }
        Map<String, ItemStack[]> snapshot = new TreeMap<>();
        for (Map.Entry<String, List<ItemStack>> entry : grouped.entrySet()) {
            ItemStack[] items = RegisteredResourceCatalog.normalizeItems(entry.getValue());
            if (items.length > 0) {
                snapshot.put(entry.getKey(), items);
            }
        }
        catalog = Collections.unmodifiableMap(snapshot);
    }

    private static List<ItemStack> collectCommonItems() {
        List<ItemStack> result = new ArrayList<>();
        for (Object entry : GameData.getItemRegistry()) {
            if (entry instanceof Item && !((Item) entry).getHasSubtypes()) {
                result.add(new ItemStack((Item) entry, 1, 0));
            }
        }
        for (String name : OreDictionary.getOreNames()) {
            result.addAll(OreDictionary.getOres(name));
        }
        for (RecipeMap<?> map : RecipeMap.ALL_RECIPE_MAPS.values()) {
            for (GTRecipe recipe : map.getAllRecipes()) {
                if (recipe.mInputs != null) {
                    result.addAll(Arrays.asList(recipe.mInputs));
                }
                if (recipe.mOutputs != null) {
                    result.addAll(Arrays.asList(recipe.mOutputs));
                }
            }
        }
        for (Object entry : CraftingManager.getInstance()
            .getRecipeList()) {
            if (entry instanceof IRecipe) {
                result.add(((IRecipe) entry).getRecipeOutput());
            }
        }
        for (IMetaTileEntity machine : GregTechAPI.METATILEENTITIES) {
            if (machine != null) {
                result.add(machine.getStackForm(1L));
            }
        }
        return result;
    }

    /** Creative-only metadata has no common-side registry and can only augment the client catalog. */
    private static void collectCreativeItems(List<ItemStack> result) {
        for (Object entry : GameData.getItemRegistry()) {
            if (!(entry instanceof Item)) {
                continue;
            }
            Item item = (Item) entry;
            List<ItemStack> variants = new ArrayList<>();
            try {
                item.getSubItems(item, CreativeTabs.tabAllSearch, variants);
            } catch (RuntimeException | LinkageError exception) {
                FMLLog.warning(
                    "GT Not Hard could not enumerate creative variants of %s: %s",
                    GameData.getItemRegistry()
                        .getNameForObject(item),
                    exception.toString());
                continue;
            }
            result.addAll(variants);
        }
    }

    private static Map<String, ItemStack[]> getCatalog() {
        Map<String, ItemStack[]> snapshot = catalog;
        if (snapshot == null) {
            synchronized (SingularityModItemRecipes_Generate.class) {
                if (catalog == null) {
                    refreshCatalog();
                }
                snapshot = catalog;
            }
        }
        return snapshot;
    }

    public static ItemStack[] getCreativeItemsForSelector(ItemStack selector) {
        ItemStack[] items = getCatalog().get(getModIdForItemStack(selector));
        return items == null ? new ItemStack[0] : RegisteredResourceCatalog.copyItems(items);
    }

    public static ItemStack[] getModItemSelectors() {
        List<ItemStack> selectors = new ArrayList<>();
        for (ItemStack[] items : getCatalog().values()) {
            selectors.add(items[0].copy());
        }
        return selectors.toArray(new ItemStack[0]);
    }

    public static List<ItemStack> getAllCreativeItems() {
        List<ItemStack> result = new ArrayList<>();
        for (ItemStack[] items : getCatalog().values()) {
            result.addAll(Arrays.asList(RegisteredResourceCatalog.copyItems(items)));
        }
        return result;
    }

    /** Retained for callers using a GregTech mod alias instead of the actual registry namespace. */
    public static List<ItemStack> getCreativeItemsByMod(String modName) {
        if (modName == null || modName.isEmpty()) {
            return Collections.emptyList();
        }
        String namespace = modName.toLowerCase(Locale.ROOT);
        for (Mods mod : Mods.values()) {
            if (mod.name()
                .equalsIgnoreCase(modName)) {
                namespace = mod.ID.toLowerCase(Locale.ROOT);
                break;
            }
        }
        ItemStack[] items = getCatalog().get(namespace);
        return items == null ? Collections.emptyList() : Arrays.asList(RegisteredResourceCatalog.copyItems(items));
    }

    public static ItemStack[] convertListToArray(List<ItemStack> itemList) {
        return itemList == null ? new ItemStack[0] : itemList.toArray(new ItemStack[0]);
    }

    public static Map<String, List<ItemStack>> getCreativeItemsByAllMods() {
        Map<String, List<ItemStack>> result = new TreeMap<>();
        for (Map.Entry<String, ItemStack[]> entry : getCatalog().entrySet()) {
            result.put(entry.getKey(), Arrays.asList(RegisteredResourceCatalog.copyItems(entry.getValue())));
        }
        return result;
    }

    public static String getModIdForItemStack(ItemStack stack) {
        if (!RegisteredResourceCatalog.isRegisteredItem(stack)) {
            return "";
        }
        String name = RegisteredResourceCatalog.registryName(stack);
        return name.substring(0, name.indexOf(':'))
            .toLowerCase(Locale.ROOT);
    }

    public static void printItemModInfo(ItemStack stack) {
        if (!RegisteredResourceCatalog.isRegisteredItem(stack)) {
            System.out.println("ItemStack has no registered Item");
            return;
        }
        System.out.println("Registry Name: " + RegisteredResourceCatalog.registryName(stack));
        System.out.println("Detected Mod ID: " + getModIdForItemStack(stack));
    }
}
