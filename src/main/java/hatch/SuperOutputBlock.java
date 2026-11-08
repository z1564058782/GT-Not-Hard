package hatch;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.common.blocks.BlockMachines;
import gregtech.common.blocks.MaterialMachines;
import loader.SuperOutputLoader;

/** A real addon-owned machine block, using the same placement and rendering path as Super Input. */
public final class SuperOutputBlock extends BlockMachines {

    public SuperOutputBlock() {
        super(SuperOutputItem.class, "superOutputBusMe", new MaterialMachines());
        setCreativeTab(SuperHatchCreativeTab.INSTANCE);
    }

    @Override
    public String getUnlocalizedName() {
        return mUnlocalizedName;
    }

    @Override
    public int getRenderType() {
        return SuperInputBlock.blockRenderId;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister icons) {
        // The original GT machine block registers all MTE textures once.
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(Item item, CreativeTabs tab, List<ItemStack> stacks) {
        if (tab == null || tab == SuperHatchCreativeTab.INSTANCE || tab == CreativeTabs.tabAllSearch) {
            stacks.add(SuperOutputLoader.getStack(1));
        }
    }

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int meta, int fortune) {
        ArrayList<ItemStack> drops = super.getDrops(world, x, y, z, meta, fortune);
        for (int index = 0; index < drops.size(); index++) {
            drops.set(index, SuperOutputLoader.convertMachineDrop(drops.get(index)));
        }
        return drops;
    }

    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z, EntityPlayer player) {
        TileEntity tile = world.getTileEntity(x, y, z);
        if (tile instanceof IGregTechTileEntity) {
            IGregTechTileEntity gtTile = (IGregTechTileEntity) tile;
            if (gtTile.getMetaTileEntity() instanceof SuperOutputBusME) {
                return gtTile.getMetaTileEntity()
                    .getStackForm(1);
            }
        }
        return SuperOutputLoader.getStack(1);
    }

    @Override
    public int getDamageValue(World world, int x, int y, int z) {
        return 0;
    }
}
