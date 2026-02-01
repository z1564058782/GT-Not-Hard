package Recipes.SingularityRecipes_VoidOre;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

public class SingularityOreRecipes_T4 {

    public static final Map<String, ItemStack[]> VoidOreRecipes_T4 = new HashMap<>();

    public static void addVoidOreRecipes_T4() {
        // T4 - Io - Io
        VoidOreRecipes_T4.put(
            "Io",
            new ItemStack[] {
                // Plutonium 239 Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 98), // Uranium 238 Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 100), // Plutonium 239 Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 96), // Thorium Ore

                // Sulfur Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 22), // Sulfur Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 834), // Pyrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 839), // Sphalerite Ore

                // Manganese Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 831), // Grossular Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 838), // Spessartine Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 943), // Pyrolusite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 921), // Tantalite Ore

                // Pitchblende Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 873), // Pitchblende
                getModItem(GregTech.ID, "gt.blockores", 1L, 922), // Uraninite Ore

                // Quartz Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 523), // Quartzite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 904), // Barite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 516), // Certus Quartz Ore

                // Pyrolusite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 943), // Pyrolusite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 530), // Apatite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 921), // Tantalite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 607), // Pyrochlore Ore

                // Infused Gold Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 323), // Infused Gold Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 85), // Platinum Ore

                // Monazite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 905), // Bastnasite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 520), // Monazite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 67), // Neodymium Ore

                // Palladium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 85), // Platinum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 30), // Chrome Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 828), // Sheldonite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 52), // Palladium Ore

                // Mytryl Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 387), // Mytryl Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 511), // Jasper Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 952), // Ceruclase Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 489), // Vulcanite Ore

                // Magnetite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 870), // Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 32), // Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 923), // Vanadium Magnetite Ore

                // Iridium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 34), // Nickel Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 84), // Iridium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 52), // Palladium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 331), // Mithril Ore

                // Cassiterite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 57), // Tin Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 824), // Cassiterite Ore

                // Small Ore Stats
                getModItem(GregTech.ID, "gt.blockores", 1L, 836), // Saltpeter Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 32), // Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 54), // Silver Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 28), // Titanium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 810), // Redstone Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 825), // Chromite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 841), // Tungstate Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 340), // Meteoric Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 347), // Firestone Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 526), // Lapis Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 81), // Tungsten Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 90), // Bismuth Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 36), // Zinc Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 391), // Quantium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 324) // Naquadah Ore
            });

        // T4 - Mercury - Me
        VoidOreRecipes_T4.put(
            "Me",
            new ItemStack[] {
                // Diamond Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 865), // Graphite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 500), // Diamond Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 535), // Coal Ore

                // Molybdenum Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 882), // Wulfenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 942), // Molybdenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 48), // Molybdenum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 883), // Powellite Ore

                // Draconium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 975), // Draconium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 812), // Electrotine Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 537), // Jade Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 529), // Vinteum Ore

                // Redstone Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 810), // Redstone Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 502), // Ruby Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 826), // Cinnabar Ore

                // Ilmenite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 918), // Ilmenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 825), // Chromite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 842), // Uvarovite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 925), // Perlite Ore

                // Palladium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 85), // Platinum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 30), // Chrome Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 828), // Sheldonite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 52), // Palladium Ore

                // Arsenic Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 39), // Arsenic Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 90), // Bismuth Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 58), // Antimony Ore

                // Bauxite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 822), // Bauxite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 918), // Ilmenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 19), // Aluminium Ore

                // Iron Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 930), // Brown Limonite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 931), // Yellow Limonite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 917), // Banded Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 871), // Malachite Ore

                // Naquadah Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 324), // Naquadah Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 326), // Enriched Naquadah Ore

                // Iridium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 34), // Nickel Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 84), // Iridium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 52), // Palladium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 331), // Mithril Ore

                // Small Ore Stats
                getModItem(GregTech.ID, "gt.blockores", 1L, 28), // Titanium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 829), // Deep Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 393), // Oriharukon Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 89), // Lead Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 810), // Redstone Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 390), // Ledox Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 825), // Chromite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 841), // Tungstate Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 884), // Desh Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 90), // Bismuth Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 36), // Zinc Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 34), // Nickel Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 324) // Naquadah Ore
            });

        // T4 - Venus - Ve
        VoidOreRecipes_T4.put(
            "Ve",
            new ItemStack[] {
                // Sulfur Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 22), // Sulfur Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 834), // Pyrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 839), // Sphalerite Ore

                // Pitchblende Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 873), // Pitchblende
                getModItem(GregTech.ID, "gt.blockores", 1L, 922), // Uraninite Ore

                // Quartz Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 523), // Quartzite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 904), // Barite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 516), // Certus Quartz Ore

                // Redstone Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 810), // Redstone Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 502), // Ruby Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 826), // Cinnabar Ore

                // Monazite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 905), // Bastnasite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 520), // Monazite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 67), // Neodymium Ore

                // Nickel Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 906), // Garnierite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 34), // Nickel Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 827), // Cobaltite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 909), // Pentlandite Ore

                // Beryllium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 8), // Beryllium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 501), // Emerald Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 96), // Thorium Ore

                // Tetrahedrite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 840), // Tetrahedrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 35), // Copper Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 945), // Stibnite Ore

                // Galena Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 830), // Galena Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 54), // Silver Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 89), // Lead Ore

                // Naquadah Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 324), // Naquadah Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 326), // Enriched Naquadah Ore

                // Rutile Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 375), // Rutile Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 28), // Titanium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 822), // Bauxite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 340), // Meteoric Iron Ore

                // Quantium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 391), // Quantium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 509), // Amethyst Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 375), // Rutile Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 382), // Ardite Ore

                // Iridium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 34), // Nickel Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 84), // Iridium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 52), // Palladium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 331), // Mithril Ore

                // Cassiterite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 57), // Tin Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 824), // Cassiterite Ore

                // Small Ore Stats
                getModItem(GregTech.ID, "gt.blockores", 1L, 836), // Saltpeter Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 387), // Mytryl Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 28), // Titanium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 89), // Lead Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 500), // Diamond Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 975), // Draconium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 825), // Chromite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 841), // Tungstate Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 340), // Meteoric Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 47), // Firestone Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 81), // Tungsten Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 34), // Nickel Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 324) // Naquadah Ore
            });
    }
}
