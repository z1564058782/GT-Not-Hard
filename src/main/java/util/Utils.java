package util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GTOreDictUnificator;

public final class Utils {

    // endregion

    // region about ItemStack
    public static boolean metaItemEqual(ItemStack a, ItemStack b) {
        if (a == null || b == null) return false;
        if (a == b) return true;
        return a.getItem() == b.getItem() && a.getItemDamage() == b.getItemDamage();
    }

    public static ItemStack[] copyItemStackArray(ItemStack... array) {
        ItemStack[] result = new ItemStack[array.length];
        for (int i = 0; i < result.length; i++) {
            if (array[i] == null) continue;
            result[i] = array[i].copy();
        }
        return result;
    }

    public static ItemStack setStackSize(ItemStack itemStack, int amount) {
        if (itemStack == null) return null;
        ItemStack copy = itemStack.copy();
        if (amount >= 0) copy.stackSize = amount;
        return copy;
    }
    // endregion

    // region About FluidStack

    public static FluidStack setStackSize(FluidStack fluidStack, int amount) {
        if (fluidStack == null) return null;
        FluidStack copy = fluidStack.copy();
        if (amount >= 0) copy.amount = amount;
        return copy;
    }

    /** Resolve an ore-unified template without truncating the requested quantity to 64. */
    public static ItemStack getMaterialInput(OrePrefixes prefix, Materials material, int amount) {
        if (amount < 0) throw new IllegalArgumentException("Negative material input amount: " + amount);
        ItemStack template = GTOreDictUnificator.get(prefix, material, 1L);
        if (template == null) {
            throw new IllegalStateException("Missing recipe material: " + prefix + "/" + material);
        }
        return setStackSize(template, amount);
    }

    // endregion

    // region Generals

    public static ItemStack[] sortNoNullArray(ItemStack... itemStacks) {
        if (itemStacks == null) return null;
        List<ItemStack> list = new ArrayList<>();
        for (int i = 0; i < itemStacks.length; i++) {
            if (itemStacks[i] == null) continue;
            list.add(itemStacks[i]);
        }
        if (list.isEmpty()) return new ItemStack[0];
        return list.toArray(new ItemStack[0]);
    }

    public static FluidStack[] sortNoNullArray(FluidStack... fluidStacks) {
        if (fluidStacks == null) return null;
        List<FluidStack> list = new ArrayList<>();
        for (int i = 0; i < fluidStacks.length; i++) {
            if (fluidStacks[i] == null) continue;
            list.add(fluidStacks[i]);
        }
        if (list.isEmpty()) return new FluidStack[0];
        return list.toArray(new FluidStack[0]);
    }

    /**
     * Return a shallow copy of the array where the {@code null} elements are removed.
     * <p>
     *
     * @param array the array
     * @param <T>   the type of elements
     * @return the array copy where the {@code null} elements are removed.
     */
    @SuppressWarnings("unchecked")
    public static <T> T[] toNonNullArray(@Nullable T @NotNull [] array, Class<T> tClass) {
        return Arrays.stream(array)
            .filter(Objects::nonNull)
            .toArray(size -> (T[]) Array.newInstance(tClass, size));
    }

    /**
     * Return a shallow copy of the array where the {@code null} elements are removed.
     *
     * @param array the array
     * @return the array copy where the {@code null} elements are removed.
     */
    @Contract("null -> null; !null -> !null")
    public static ItemStack[] toNonNullItemStackArray(@Nullable ItemStack @Nullable [] array) {
        return array != null ? toNonNullArray(array, ItemStack.class) : null;
    }

    /**
     * Return a shallow copy of the array where the {@code null} elements are removed.
     *
     * @param array the array
     * @return the array copy where the {@code null} elements are removed.
     */
    @Contract("null -> null; !null -> !null")
    public static FluidStack[] toNonNullFluidStackArray(@Nullable FluidStack @Nullable [] array) {
        return array != null ? toNonNullArray(array, FluidStack.class) : null;
    }
}
