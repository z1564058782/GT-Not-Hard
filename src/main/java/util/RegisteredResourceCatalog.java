package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreDictionary;

import cpw.mods.fml.common.registry.GameData;
import gregtech.api.enums.OrePrefixes;

/** Collects resource templates only after the pack has finished registering its resources. */
public final class RegisteredResourceCatalog {

    private RegisteredResourceCatalog() {}

    public static ItemStack[] collectDusts() {
        return collectOreItems(OrePrefixes.dust);
    }

    public static ItemStack[] collectOreItems(OrePrefixes prefix, ItemStack... legacyResources) {
        String[] names = OreDictionary.getOreNames();
        Arrays.sort(names);
        List<ItemStack> resources = new ArrayList<>();
        for (String name : names) {
            if (OrePrefixes.getOrePrefix(name) != prefix) {
                continue;
            }
            resources.addAll(OreDictionary.getOres(name));
        }
        if (legacyResources != null) {
            resources.addAll(Arrays.asList(legacyResources));
        }
        return normalizeItems(resources);
    }

    public static FluidStack[] collectFluids() {
        List<FluidStack> fluids = new ArrayList<>();
        for (Map.Entry<String, Fluid> entry : new TreeMap<>(FluidRegistry.getRegisteredFluids()).entrySet()) {
            Fluid fluid = entry.getValue();
            if (fluid != null && !entry.getKey()
                .isEmpty()) {
                fluids.add(new FluidStack(fluid, 1));
            }
        }
        return fluids.toArray(new FluidStack[0]);
    }

    public static ItemStack[] normalizeItems(List<ItemStack> items) {
        List<ItemStack> validItems = new ArrayList<>();
        for (ItemStack stack : items) {
            if (!isRegisteredItem(stack) || stack.getItemDamage() == OreDictionary.WILDCARD_VALUE) {
                continue;
            }
            validItems.add(stack);
        }
        ItemStack[] result = copyItems(
            AggregateItemStackArray.addCompressAggregateArray(validItems.toArray(new ItemStack[0])));
        for (ItemStack stack : result) {
            stack.stackSize = 1;
        }
        Arrays.sort(
            result,
            Comparator.comparing(RegisteredResourceCatalog::registryName)
                .thenComparingInt(ItemStack::getItemDamage)
                .thenComparing(stack -> String.valueOf(stack.getTagCompound())));
        return result;
    }

    public static boolean isRegisteredItem(ItemStack stack) {
        if (stack == null || stack.getItem() == null) {
            return false;
        }
        String name = registryName(stack);
        return name != null && name.indexOf(':') > 0;
    }

    public static String registryName(ItemStack stack) {
        return GameData.getItemRegistry()
            .getNameForObject(stack.getItem());
    }

    public static ItemStack[] copyItems(ItemStack[] templates) {
        ItemStack[] result = new ItemStack[templates.length];
        for (int i = 0; i < templates.length; i++) {
            result[i] = templates[i].copy();
        }
        return result;
    }

    public static FluidStack[] copyFluids(FluidStack[] templates) {
        FluidStack[] result = new FluidStack[templates.length];
        for (int i = 0; i < templates.length; i++) {
            result[i] = templates[i].copy();
        }
        return result;
    }
}
