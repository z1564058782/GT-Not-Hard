package hatch;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.GregTechAPI;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.common.blocks.ItemMachines;
import loader.SuperOutputLoader;

/** Damage 0 is the addon block item; only temporary GT call arguments use MTE ID 25570. */
public final class SuperOutputItem extends ItemMachines {

    public SuperOutputItem(Block block) {
        super(block);
        setCreativeTab(SuperHatchCreativeTab.INSTANCE);
    }

    private boolean isValid(ItemStack stack) {
        return stack != null && stack.getItemDamage() == 0;
    }

    private ItemStack machineStack(ItemStack stack) {
        ItemStack machine = SuperOutputLoader.getMachineStack(stack.stackSize);
        if (stack.hasTagCompound()) machine.setTagCompound(
            (NBTTagCompound) stack.getTagCompound()
                .copy());
        return machine;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return "tile.gtnothard.superOutputBusMe";
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        return net.minecraft.util.StatCollector.translateToLocal(getUnlocalizedName(stack) + ".name");
    }

    @Override
    public int getMetadata(int damage) {
        IMetaTileEntity sample = GregTechAPI.METATILEENTITIES[SuperOutputLoader.SUPER_OUTPUT_BUS_ME_ID];
        return sample == null ? 0 : sample.getTileEntityBaseType();
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List<String> lines, boolean advanced) {
        if (isValid(stack)) super.addInformation(machineStack(stack), player, lines, advanced);
    }

    @Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int slot, boolean inHand) {
        // ItemMachines interprets damage as an MTE ID; this item is not a portable chest or tank.
    }

    @Override
    public void onCreated(ItemStack stack, World world, EntityPlayer player) {
        IMetaTileEntity sample = GregTechAPI.METATILEENTITIES[SuperOutputLoader.SUPER_OUTPUT_BUS_ME_ID];
        if (isValid(stack) && sample != null) sample.onCreated(stack, world, player);
    }

    @Override
    public FluidStack getFluid(ItemStack stack) {
        return null;
    }

    @Override
    public int getCapacity(ItemStack stack) {
        return 0;
    }

    @Override
    public int fill(ItemStack stack, FluidStack fluid, boolean doFill) {
        return 0;
    }

    @Override
    public FluidStack drain(ItemStack stack, int amount, boolean doDrain) {
        return null;
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side,
        float hitX, float hitY, float hitZ) {
        return isValid(stack) && stack.stackSize > 0
            && super.onItemUse(stack, player, world, x, y, z, side, hitX, hitY, hitZ);
    }

    @Override
    public boolean placeBlockAt(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side,
        float hitX, float hitY, float hitZ, int meta) {
        return isValid(stack)
            && super.placeBlockAt(machineStack(stack), player, world, x, y, z, side, hitX, hitY, hitZ, meta);
    }
}
