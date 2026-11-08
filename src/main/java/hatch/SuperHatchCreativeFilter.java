package hatch;

import java.lang.reflect.Field;
import java.util.List;

import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.GuiScreenEvent;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.ReflectionHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import loader.SuperHatchRegistration;

/** Filters GT's unconditional MTE enumeration from the creative catalogue without unregistering live machines. */
@SideOnly(Side.CLIENT)
public final class SuperHatchCreativeFilter {

    private final Field currentScroll = ReflectionHelper
        .findField(GuiContainerCreative.class, "currentScroll", "field_147067_x");
    private Field itemList;
    private Container lastContainer;
    private int lastTab = -1;
    private int lastSize = -1;
    private ItemStack lastFirst;
    private ItemStack lastEnd;

    @SubscribeEvent
    public void onGuiOpen(GuiOpenEvent event) {
        // Do not retain the previous world's player through its closed creative container.
        lastContainer = null;
        lastFirst = null;
        lastEnd = null;
        lastSize = -1;
    }

    @SubscribeEvent
    @SuppressWarnings("unchecked")
    public void onDrawCreative(GuiScreenEvent.DrawScreenEvent.Pre event) {
        if (!(event.gui instanceof GuiContainerCreative)) return;
        GuiContainerCreative gui = (GuiContainerCreative) event.gui;
        int tab = gui.func_147056_g();
        // Never inspect or alter the player's actual inventory tab.
        if (tab == CreativeTabs.tabInventory.getTabIndex()) return;
        Container container = gui.inventorySlots;
        if (itemList == null || !itemList.getDeclaringClass()
            .isInstance(container)) {
            itemList = ReflectionHelper.findField(container.getClass(), "itemList", "field_148330_a");
        }
        try {
            List<ItemStack> entries = (List<ItemStack>) itemList.get(container);
            ItemStack first = entries.isEmpty() ? null : entries.get(0);
            ItemStack end = entries.isEmpty() ? null : entries.get(entries.size() - 1);
            // Vanilla rebuilds this list on tab/search changes. Avoid rescanning it on every rendered frame.
            if (container == lastContainer && tab == lastTab
                && entries.size() == lastSize
                && first == lastFirst
                && end == lastEnd) return;
            if (SuperHatchRegistration.removeLegacyEntries(entries)) {
                currentScroll.setFloat(gui, 0);
                // Refresh only the 45 virtual catalogue slots, using the same references as vanilla scrollTo(0).
                for (int index = 0; index < 45; index++) {
                    container.putStackInSlot(index, index < entries.size() ? entries.get(index) : null);
                }
            }
            lastContainer = container;
            lastTab = tab;
            lastSize = entries.size();
            lastFirst = entries.isEmpty() ? null : entries.get(0);
            lastEnd = entries.isEmpty() ? null : entries.get(entries.size() - 1);
        } catch (IllegalAccessException exception) {
            throw new IllegalStateException("Cannot filter legacy Super ME creative entries", exception);
        }
    }
}
