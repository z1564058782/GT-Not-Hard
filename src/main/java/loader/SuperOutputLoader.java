package loader;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import gregtech.api.GregTechAPI;
import gregtech.api.enums.ItemList;
import hatch.SuperOutputBlock;
import hatch.SuperOutputBusME;
import hatch.SuperOutputItem;

/** Registers the addon-owned block/item while keeping the existing world MTE ID. */
public final class SuperOutputLoader {

    public static final int SUPER_OUTPUT_BUS_ME_ID = 25570;
    public static SuperOutputBusME superOutputBusME;
    public static SuperOutputBlock superOutputBusMeBlock;
    public static SuperOutputItem superOutputBusMeItem;

    private SuperOutputLoader() {}

    public static void registerItems() {
        if (superOutputBusMeItem != null) return;
        superOutputBusMeBlock = new SuperOutputBlock();
        superOutputBusMeItem = (SuperOutputItem) Item.getItemFromBlock(superOutputBusMeBlock);
        MinecraftForge.EVENT_BUS.register(new SuperOutputLoader());
    }

    public static void registerMachines() {
        if (superOutputBusME != null) return;
        if (superOutputBusMeItem == null)
            throw new IllegalStateException("Register SuperOutput items in preInit first");
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
        if (superOutputBusMeItem == null)
            throw new IllegalStateException("Super Output Bus (ME) item is not registered");
        if (amount <= 0) throw new IllegalArgumentException("Invalid machine stack amount");
        return new ItemStack(superOutputBusMeItem, amount, 0);
    }

    public static ItemStack getMachineStack(int amount) {
        return new ItemStack(GregTechAPI.sBlockMachines, amount, SUPER_OUTPUT_BUS_ME_ID);
    }

    /** Keep all native covers, custom tags and stack quantity when converting legacy drops. */
    public static ItemStack convertMachineDrop(ItemStack stack) {
        if (stack == null || stack.getItem() != Item.getItemFromBlock(GregTechAPI.sBlockMachines)
            || stack.getItemDamage() != SUPER_OUTPUT_BUS_ME_ID) return stack;
        ItemStack converted = getStack(stack.stackSize);
        if (stack.hasTagCompound()) converted.setTagCompound(
            (NBTTagCompound) stack.getTagCompound()
                .copy());
        return converted;
    }

    @SubscribeEvent
    public void onHarvestDrops(HarvestDropsEvent event) {
        for (int index = 0; index < event.drops.size(); index++) {
            event.drops.set(index, convertMachineDrop(event.drops.get(index)));
        }
    }

    @SubscribeEvent
    public void onEntityJoinWorld(EntityJoinWorldEvent event) {
        if (event.world.isRemote || !(event.entity instanceof EntityItem)) return;
        EntityItem entity = (EntityItem) event.entity;
        ItemStack original = entity.getEntityItem();
        ItemStack converted = convertMachineDrop(original);
        if (converted != original) entity.setEntityItemStack(converted);
    }
}
