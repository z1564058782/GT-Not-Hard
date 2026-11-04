package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class AggregateItemStackArray {

    public static ItemStack[] addAggregateArray(ItemStack[]... arrays) {
        List<ItemStack> result = new ArrayList<>();
        if (arrays != null) {
            for (ItemStack[] array : arrays) {
                if (array != null) {
                    result.addAll(Arrays.asList(array));
                }
            }
        }
        return result.toArray(new ItemStack[0]);
    }

    public static ItemStack[] addCompressAggregateArray(ItemStack[]... arrays) {
        Map<ItemKey, ItemStack> unique = new LinkedHashMap<>();
        for (ItemStack stack : checkItemStack(addAggregateArray(arrays))) {
            unique.putIfAbsent(new ItemKey(stack), stack);
        }
        return unique.values()
            .toArray(new ItemStack[0]);
    }

    public static ItemStack[][] addSplitAggregateArray(ItemStack[] sourceArray, int splitLength) {
        if (sourceArray == null || sourceArray.length == 0) {
            return new ItemStack[0][];
        }
        if (splitLength <= 0) {
            return new ItemStack[][] { sourceArray };
        }
        int pageCount = (sourceArray.length - 1) / splitLength + 1;
        ItemStack[][] result = new ItemStack[pageCount][];
        for (int i = 0; i < pageCount; i++) {
            int start = i * splitLength;
            result[i] = Arrays.copyOfRange(sourceArray, start, Math.min(start + splitLength, sourceArray.length));
        }
        return result;
    }

    /** Missing resources are omitted, never replaced with an unrelated output. */
    public static ItemStack[] checkItemStack(ItemStack[] itemStacks) {
        List<ItemStack> result = new ArrayList<>();
        if (itemStacks != null) {
            for (ItemStack stack : itemStacks) {
                if (stack != null && stack.getItem() != null) {
                    result.add(stack);
                }
            }
        }
        return result.toArray(new ItemStack[0]);
    }

    private static final class ItemKey {

        private final Item item;
        private final int metadata;
        private final NBTTagCompound tag;

        private ItemKey(ItemStack stack) {
            item = stack.getItem();
            metadata = stack.getItemDamage();
            tag = stack.getTagCompound() == null ? null
                : (NBTTagCompound) stack.getTagCompound()
                    .copy();
        }

        @Override
        public boolean equals(Object other) {
            if (!(other instanceof ItemKey)) {
                return false;
            }
            ItemKey key = (ItemKey) other;
            return item == key.item && metadata == key.metadata && Objects.equals(tag, key.tag);
        }

        @Override
        public int hashCode() {
            return Objects.hash(System.identityHashCode(item), metadata, tag);
        }
    }
}
