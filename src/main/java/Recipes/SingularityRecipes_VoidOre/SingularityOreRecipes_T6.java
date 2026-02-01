package Recipes.SingularityRecipes_VoidOre;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

public class SingularityOreRecipes_T6 {

    public static final Map<String, ItemStack[]> VoidOreRecipes_T6 = new HashMap<>();

    public static void addVoidOreRecipes_T6() {
        // T6 - Proteus - Pr
        VoidOreRecipes_T6.put(
            "Pr",
            new ItemStack[] {
                // Uranium 238 Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 922), // Uraninite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 98), // Uranium 238 Ore

                // Diamond Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 865), // Graphite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 500), // Diamond Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 535), // Coal Ore

                // Molybdenum Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 882), // Wulfenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 942), // Molybdenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 48), // Molybdenum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 883), // Powellite Ore

                // Osmium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 34), // Nickel Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 83), // Osmium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 84), // Iridium Ore

                // Tungsten Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 81), // Tungsten Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 20), // Raw Silicon Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 829), // Deep Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 336), // Shadow Iron Ore

                // Quartz Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 523), // Quartzite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 904), // Barite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 516), // Certus Quartz Ore

                // Infused Gold Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 323), // Infused Gold Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 85), // Platinum Ore

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

                // Vanadium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 29), // Vanadium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 870), // Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 30), // Chrome Ore

                // Bauxite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 822), // Bauxite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 918), // Ilmenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 19), // Aluminium Ore

                // Neutronium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 129), // Neutronium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 319), // Adamantium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 324), // Naquadah Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 28), // Titanium Ore

                // Small Ore Stats
                getModItem(GregTech.ID, "gt.blockores", 1L, 836), // Saltpeter Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 35), // Copper Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 54), // Silver Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 387), // Mytryl Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 28), // Titanium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 57), // Tin Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 810), // Redstone Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 129), // Neutronium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 825), // Chromite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 841), // Tungstate Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 884), // Desh Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 90), // Bismuth Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 36), // Zinc Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 324) // Naquadah Ore
            });

        // T6 - Triton - Tr
        VoidOreRecipes_T6.put(
            "Tr",
            new ItemStack[] {
                // Tungstate Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 910), // Scheelite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 841), // Tungstate Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 6), // Lithium Ore

                // Tungsten Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 81), // Tungsten Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 20), // Raw Silicon Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 829), // Deep Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 336), // Shadow Iron Ore

                // Manganese Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 831), // Grossular Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 838), // Spessartine Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 943), // Pyrolusite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 921), // Tantalite Ore

                // Monazite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 905), // Bastnasite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 520), // Monazite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 67), // Neodymium Ore

                // Nickel Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 906), // Garnierite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 34), // Nickel Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 827), // Cobaltite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 909), // Pentlandite Ore

                // Thorium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 96), // Thorium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 98), // Uranium 238 Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 101), // Plutonium 241 Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 97), // Uranium 235 Ore

                // Neutronium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 129), // Neutronium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 319), // Adamantium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 324), // Naquadah Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 28), // Titanium Ore

                // Gold Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 870), // Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 923), // Vanadium Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore

                // Galena Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 830), // Galena Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 54), // Silver Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 89), // Lead Ore

                // Niobium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 47), // Niobium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 45), // Yttrium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 37), // Gallium Ore

                // Iridium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 34), // Nickel Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 84), // Iridium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 52), // Palladium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 331), // Mithril Ore

                // Small Ore Stats
                getModItem(GregTech.ID, "gt.blockores", 1L, 32), // Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 35), // Copper Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 54), // Silver Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 28), // Titanium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 393), // Oriharukon Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 89), // Lead Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 129), // Neutronium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 500), // Diamond Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 388), // Black Plutonium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 825), // Chromite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 841), // Tungstate Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 884) // Desh Ore
            });
    }
}
