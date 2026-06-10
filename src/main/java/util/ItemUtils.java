package util;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.enums.Mods;
import gregtech.api.util.GTModHandler;

public class ItemUtils {

    public static NBTTagCompound writeItemStackToNBT(ItemStack stack) {
        NBTTagCompound compound = new NBTTagCompound();

        stack.writeToNBT(compound);
        compound.setInteger("IntCount", stack.stackSize);

        return compound;
    }

    public static ItemStack readItemStackFromNBT(NBTTagCompound compound) {
        ItemStack stack = ItemStack.loadItemStackFromNBT(compound);

        if (stack == null) return null;

        if (compound.hasKey("IntCount")) stack.stackSize = compound.getInteger("IntCount");

        return stack;
    }

    public static ItemStack getItemStack(ItemStack baseStack, String aNBTString, ItemStack aReplacement) {
        if (baseStack == null) return aReplacement;
        try {
            baseStack.stackTagCompound = (NBTTagCompound) JsonToNBT.func_150315_a(aNBTString);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return baseStack;
    }

    public static ItemStack getItemStack(String aModID, String aItem, long aAmount, int aMeta, String aNBTString) {
        ItemStack s = GTModHandler.getModItem(aModID, aItem, aAmount, aMeta);
        try {
            s.stackTagCompound = (NBTTagCompound) JsonToNBT.func_150315_a(aNBTString);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return s;
    }

    public static ItemStack getItemStack(String aModID, String aItem, long aAmount, int aMeta, String aNBTString,
        ItemStack aReplacement) {
        ItemStack itemStack = GTModHandler.getModItem(aModID, aItem, aAmount, aMeta);
        if (itemStack == null) return aReplacement;
        try {
            itemStack.stackTagCompound = (NBTTagCompound) JsonToNBT.func_150315_a(aNBTString);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return itemStack;
    }

    public static FluidStack getFluidFromItemFluidDisplay(ItemStack stack) {
        if (stack == null || !stack.hasTagCompound()) {
            return null;
        }

        NBTTagCompound nbt = stack.getTagCompound();
        if (nbt == null) {
            return null;
        }

        Fluid tFluid = FluidRegistry.getFluid(stack.getItemDamage());
        if (tFluid == null) return null;
        long fluidAmount = nbt.getLong("mFluidDisplayAmount");

        return new FluidStack(tFluid, (int) fluidAmount);
    }

    public static ItemStack getSpecialFlower(String typeName, int amount) {
        ItemStack stack = GTModHandler.getModItem(Mods.Botania.ID, "specialFlower", amount);
        if (stack == null) return null;

        NBTTagCompound tag = stack.getTagCompound();
        if (tag == null) {
            tag = new NBTTagCompound();
            stack.setTagCompound(tag);
        }

        tag.setString("type", typeName);
        return stack;
    }

    public static ItemStack getSpecialFlower(String typeName) {
        ItemStack stack = GTModHandler.getModItem(Mods.Botania.ID, "specialFlower", 1);
        if (stack == null) return null;

        NBTTagCompound tag = stack.getTagCompound();
        if (tag == null) {
            tag = new NBTTagCompound();
            stack.setTagCompound(tag);
        }

        tag.setString("type", typeName);
        return stack;
    }
}
