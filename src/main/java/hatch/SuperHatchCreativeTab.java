package hatch;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import loader.SuperInputLoader;

/** The addon's hatch items belong to its own creative tab. */
public final class SuperHatchCreativeTab extends CreativeTabs {

    public static final SuperHatchCreativeTab INSTANCE = new SuperHatchCreativeTab();

    private SuperHatchCreativeTab() {
        super("gtnothard");
    }

    @Override
    public Item getTabIconItem() {
        return SuperInputLoader.superInputBusMeItem == null ? Item.getItemFromBlock(Blocks.iron_block)
            : SuperInputLoader.superInputBusMeItem;
    }

    @Override
    public ItemStack getIconItemStack() {
        return new ItemStack(getTabIconItem(), 1, 0);
    }
}
