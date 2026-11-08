package loader;

import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import gregtech.api.GregTechAPI;

/** Legacy GT machine items remain loadable, but are not player-facing catalogue entries. */
public final class SuperHatchRegistration {

    private SuperHatchRegistration() {}

    public static boolean isLegacyMachineStack(ItemStack stack) {
        if (stack == null || stack.getItem() != Item.getItemFromBlock(GregTechAPI.sBlockMachines)) return false;
        int id = stack.getItemDamage();
        return id == SuperInputLoader.superInputBusMeId || id == SuperInputLoader.superInputHatchMeId
            || id == SuperOutputLoader.SUPER_OUTPUT_BUS_ME_ID;
    }

    /** Removes only the three legacy item identities, including stacks carrying NBT. */
    public static boolean removeLegacyEntries(List<ItemStack> entries) {
        return entries.removeIf(SuperHatchRegistration::isLegacyMachineStack);
    }
}
