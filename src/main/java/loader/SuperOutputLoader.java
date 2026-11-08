package loader;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.registry.GameRegistry;
import gregtech.api.GregTechAPI;
import gregtech.api.enums.ItemList;
import hatch.SuperOutputBusME;

/** Registers one native, placeable GT machine block; no separate flat item or client renderer is needed. */
public final class SuperOutputLoader {

    public static final int SUPER_OUTPUT_BUS_ME_ID = 25570;
    public static SuperOutputBusME superOutputBusME;

    private SuperOutputLoader() {}

    public static void registerMachines() {
        if (superOutputBusME != null) return;
        if (GregTechAPI.METATILEENTITIES[SUPER_OUTPUT_BUS_ME_ID] != null) {
            throw new IllegalStateException("Super Output Bus (ME) requires free GT MTE ID 25570");
        }
        superOutputBusME = new SuperOutputBusME(SUPER_OUTPUT_BUS_ME_ID, "superoutputbus.me", "Super Output Bus (ME)");
        GameRegistry.addShapelessRecipe(
            getStack(1),
            ItemList.Hatch_Output_Bus_ME.get(1),
            new ItemStack(Items.nether_star),
            new ItemStack(Items.ender_pearl));
    }

    public static ItemStack getStack(int amount) {
        if (superOutputBusME == null) throw new IllegalStateException("Super Output Bus (ME) is not registered");
        if (amount <= 0) throw new IllegalArgumentException("Invalid machine stack amount");
        return superOutputBusME.getStackForm(amount);
    }
}
