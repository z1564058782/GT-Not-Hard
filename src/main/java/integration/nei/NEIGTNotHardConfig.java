package integration.nei;

import net.minecraft.item.ItemStack;

import com.mofoga.gtnothard.Tags;

import codechicken.nei.ItemStackMap;
import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import gregtech.api.GregTechAPI;
import loader.SuperInputLoader;
import loader.SuperOutputLoader;

/** NEI discovers this entry point only when installed and calls it at its supported configuration phase. */
@SideOnly(Side.CLIENT)
public final class NEIGTNotHardConfig implements IConfigureNEI {

    @Override
    public void loadConfig() {
        for (int id : new int[] { SuperInputLoader.superInputBusMeId, SuperInputLoader.superInputHatchMeId,
            SuperOutputLoader.SUPER_OUTPUT_BUS_ME_ID }) {
            ItemStack legacy = new ItemStack(GregTechAPI.sBlockMachines, 1, id);
            legacy.setTagCompound(ItemStackMap.WILDCARD_TAG);
            API.hideItem(legacy);
        }
    }

    @Override
    public String getName() {
        return "GT Not Hard";
    }

    @Override
    public String getVersion() {
        return Tags.VERSION;
    }
}
