package util;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

public final class Utils {

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
        if (amount < 0) {
            return itemStack;
        }
        itemStack.stackSize = amount;
        return itemStack;
    }

    public static FluidStack setStackSize(FluidStack fluidStack, int amount) {
        if (fluidStack == null) return null;
        if (amount < 0) {
            return fluidStack;
        }
        fluidStack.amount = amount;
        return fluidStack;
    }

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
}
