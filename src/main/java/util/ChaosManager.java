package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

import net.minecraft.item.ItemStack;

import gregtech.api.enums.SoundResource;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.api.recipe.RecipeMap;
import gregtech.common.blocks.ItemMachines;

public class ChaosManager {

    private static final HashMap<String, RecipeMap<?>> mRecipeSaves = new HashMap<>();
    private static final HashMap<String, SoundResource> machineSounds = new HashMap<>();

    public static void addRecipeMapToChaos(String aMachineName, RecipeMap<?> aMap) {
        if (aMachineName != null && aMap != null) {
            mRecipeSaves.put(aMachineName, aMap);
        }
    }

    public static RecipeMap<?> giveRecipeMap(String aMachineName) {
        if (aMachineName != null) {
            RecipeMap<?> exactMap = mRecipeSaves.get(aMachineName);
            return exactMap != null ? exactMap : mRecipeSaves.get(machineFamily(aMachineName));
        }
        return null;
    }

    public static void addSoundResourceToChaos(String machineName, SoundResource soundResource) {
        if (machineName != null) {
            machineSounds.put(machineName, soundResource);
        }
    }

    public static SoundResource getSoundResource(String machineName) {
        if (machineName != null) {
            return machineSounds.get(machineName);
        }
        return null;
    }

    public static String getMachineName(ItemStack stack) {
        IMetaTileEntity machine = ItemMachines.getMetaTileEntity(stack);
        return machine == null ? null : machineFamily(machine.getMetaName());
    }

    public static List<RecipeMap<?>> getAvailableRecipeMaps() {
        ArrayList<RecipeMap<?>> maps = new ArrayList<>(new LinkedHashSet<>(mRecipeSaves.values()));
        maps.sort(Comparator.comparing(recipeMap -> recipeMap.unlocalizedName));
        return Collections.unmodifiableList(maps);
    }

    static String machineFamily(String metaName) {
        if (metaName == null) return null;
        int tierSeparator = metaName.lastIndexOf(".tier.");
        return tierSeparator < 0 ? metaName : metaName.substring(0, tierSeparator);
    }
}
