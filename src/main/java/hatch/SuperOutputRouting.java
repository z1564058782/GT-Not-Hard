package hatch;

import java.util.Collections;
import java.util.List;

import net.minecraft.item.ItemStack;

import gregtech.api.interfaces.IOutputBus;
import gregtech.api.metatileentity.implementations.MTEMultiBlockBase;
import gregtech.api.util.ItemEjectionHelper;

/**
 * Keep int-sized recipe fragments separate until they reach the output transactions.
 * GT5U 5.09.54.133's ejectItems(list, 1) otherwise combines equal items into a long histogram,
 * then clamps that histogram to int before the ME bus sees it.
 */
public final class SuperOutputRouting {

    private SuperOutputRouting() {}

    /** Opt in only when this structure actually has our long-count output bus. */
    public static boolean hasSuperOutputBus(MTEMultiBlockBase controller) {
        for (IOutputBus bus : controller.getOutputBusses()) {
            if (bus instanceof SuperOutputBusME) return true;
        }
        return false;
    }

    public static boolean addItemOutputs(MTEMultiBlockBase controller, ItemStack[] outputs) {
        return ejectItems(controller.getOutputBusses(), controller.protectsExcessItem(), outputs);
    }

    /**
     * Reuse one set of native transactions for the entire completion, including filtered and ordinary buses.
     * Each singleton is already int-sized, so the native histogram cannot truncate it. Commit exactly once:
     * cell free-space reservations and cache accounting must be shared across all fragments.
     * The controller's original output stacks and their NBT remain untouched.
     */
    public static boolean ejectItems(List<IOutputBus> buses, boolean protectItems, ItemStack[] outputs) {
        if (outputs == null || outputs.length == 0) return true;
        ItemEjectionHelper helper = new ItemEjectionHelper(buses, protectItems);
        boolean allEjected = true;
        for (ItemStack output : outputs) {
            if (output == null || output.stackSize <= 0) continue;
            if (helper.ejectItems(Collections.singletonList(output), 1) != 1) allEjected = false;
        }
        helper.commit();
        return allEjected;
    }
}
