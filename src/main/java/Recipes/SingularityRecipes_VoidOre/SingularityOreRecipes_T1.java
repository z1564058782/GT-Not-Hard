package Recipes.SingularityRecipes_VoidOre;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

public class SingularityOreRecipes_T1 {

    public static final Map<String, ItemStack[]> VoidOreRecipes_T1 = new HashMap<>();

    public static void addVoidOreRecipes_T1() {
        // T1 - Moon - Mo
        VoidOreRecipes_T1.put(
            "Mo",
            new ItemStack[] {
                // Molybdenum Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 882), // Wulfenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 942), // Molybdenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 48), // Molybdenum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 883), // Powellite Ore

                // Quartz Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 523), // Quartzite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 904), // Barite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 516), // Certus Quartz Ore

                // Monazite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 905), // Bastnasite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 520), // Monazite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 67), // Neodymium Ore

                // Ilmenite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 918), // Ilmenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 825), // Chromite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 842), // Uvarovite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 925), // Perlite Ore

                // Copper Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 855), // Chalcopyrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 32), // Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 834), // Pyrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 35), // Copper Ore

                // Bauxite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 822), // Bauxite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 918), // Ilmenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 19), // Aluminium Ore

                // Galena Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 830), // Galena Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 54), // Silver Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 89), // Lead Ore

                // Cassiterite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 57), // Tin Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 824), // Cassiterite Ore

                // Small Ore Stats
                getModItem(GregTech.ID, "gt.blockores", 1L, 340) // Meteoric Iron Ore
            });
    }
}
