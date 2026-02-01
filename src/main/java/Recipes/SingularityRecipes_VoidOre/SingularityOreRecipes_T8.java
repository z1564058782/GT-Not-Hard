package Recipes.SingularityRecipes_VoidOre;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

public class SingularityOreRecipes_T8 {

    public static final Map<String, ItemStack[]> VoidOreRecipes_T8 = new HashMap<>();

    public static void addVoidOreRecipes_T8() {
        // T8 - BarnardC - BC
        VoidOreRecipes_T8.put(
            "BC",
            new ItemStack[] {
                // Oilsands Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 878), // Oilsands Ore

                // Osmium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 34), // Nickel Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 83), // Osmium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 84), // Iridium Ore

                // Tungsten Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 81), // Tungsten Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 20), // Raw Silicon Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 829), // Deep Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 336), // Shadow Iron Ore

                // Samarium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 69), // Samarium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 67), // Neodymium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 956), // Tartarite Ore

                // Mica Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 924), // Kyanite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 901), // Mica Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 824), // Cassiterite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 919), // Pollucite Ore

                // Black Plutonium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 388), // Black Plutonium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 527), // Red Garnet Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 528), // Yellow Garnet Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 941), // Borax Ore

                // Arsenic Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 39), // Arsenic Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 90), // Bismuth Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 58), // Antimony Ore

                // Lignite Coal Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 538), // Lignite Coal Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 535), // Coal Ore

                // Basaltic Mineral Sand Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 935), // Basaltic Mineral Sand
                getModItem(GregTech.ID, "gt.blockores", 1L, 936), // Granitic Mineral Sand
                getModItem(GregTech.ID, "gt.blockores", 1L, 928), // Fullers Earth
                getModItem(GregTech.ID, "gt.blockores", 1L, 934), // Gypsum Ore

                // Salt Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 944), // Rock Salt Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 817), // Salt Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 907), // Lepidolite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 920) // Spodumene Ore
            });

        // T8 - BarnardE - BE
        VoidOreRecipes_T8.put(
            "BE",
            new ItemStack[] {
                // Uranium 238 Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 922), // Uraninite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 98), // Uranium 238 Ore

                // Molybdenum Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 882), // Wulfenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 942), // Molybdenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 48), // Molybdenum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 883), // Powellite Ore

                // Olivine Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 927), // Bentonite
                getModItem(GregTech.ID, "gt.blockores", 1L, 908), // Magnesite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 505), // Olivine Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 933), // Glauconite Ore

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

                // Infused Gold Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 323), // Infused Gold Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 85), // Platinum Ore

                // Rare Earth Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 55), // Cadmium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 62), // Caesium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 64), // Lanthanum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 65), // Cerium Ore

                // Thorium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 96), // Thorium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 98), // Uranium 238 Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 101), // Plutonium 241 Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 97), // Uranium 235 Ore

                // Copper Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 855), // Chalcopyrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 32), // Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 834), // Pyrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 35), // Copper Ore

                // Neutronium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 129), // Neutronium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 319), // Adamantium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 324), // Naquadah Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 28), // Titanium Ore

                // Nether Star Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 938), // Garnet Sand
                getModItem(GregTech.ID, "gt.blockores", 1L, 506), // Nether Star Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 527), // Red Garnet Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 528), // Yellow Garnet Ore

                // Naquadah Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 324), // Naquadah Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 326), // Enriched Naquadah Ore

                // Magnetite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 870), // Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 32), // Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 923), // Vanadium Magnetite Ore

                // Small Ore Stats
                getModItem(GregTech.ID, "gt.blockores", 1L, 976), // Awakened Draconium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 32), // Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 28), // Titanium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 129), // Neutronium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 388), // Black Plutonium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 36), // Zinc Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 34), // Nickel Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 324) // Naquadah Ore
            });

        // T8 - BarnardF - BF
        VoidOreRecipes_T8.put(
            "BF",
            new ItemStack[] {
                // Diamond Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 865), // Graphite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 500), // Diamond Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 535), // Coal Ore

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

                // Pitchblende Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 873), // Pitchblende
                getModItem(GregTech.ID, "gt.blockores", 1L, 922), // Uraninite Ore

                // Redstone Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 810), // Redstone Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 502), // Ruby Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 826), // Cinnabar Ore

                // Monazite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 905), // Bastnasite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 520), // Monazite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 67), // Neodymium Ore

                // Rare Earth Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 55), // Cadmium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 62), // Caesium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 64), // Lanthanum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 65), // Cerium Ore

                // Thorium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 96), // Thorium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 98), // Uranium 238 Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 101), // Plutonium 241 Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 97), // Uranium 235 Ore

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

                // Neutronium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 129), // Neutronium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 319), // Adamantium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 324), // Naquadah Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 28), // Titanium Ore

                // Gold Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 870), // Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 923), // Vanadium Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore

                // Beryllium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 8), // Beryllium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 501), // Emerald Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 96), // Thorium Ore

                // Red Garnet Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 527), // Red Garnet Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 528), // Yellow Garnet Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 912), // Chrysotile Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 913), // Realgar Ore

                // Naquadah Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 324), // Naquadah Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 326), // Enriched Naquadah Ore

                // Niobium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 47), // Niobium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 45), // Yttrium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 37), // Gallium Ore

                // Small Ore Stats
                getModItem(GregTech.ID, "gt.blockores", 1L, 976), // Awakened Draconium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 32), // Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 28), // Titanium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 129), // Neutronium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 388), // Black Plutonium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 913), // Realgar Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 34), // Nickel Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 324), // Naquadah Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 395) // Bedrockium Ore
            });

        // T8 - α Centauri Bb - CB
        VoidOreRecipes_T8.put(
            "CB",
            new ItemStack[] {
                // Sulfur Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 22), // Sulfur Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 834), // Pyrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 839), // Sphalerite Ore

                // Manganese Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 831), // Grossular Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 838), // Spessartine Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 943), // Pyrolusite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 921), // Tantalite Ore

                // Samarium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 69), // Samarium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 67), // Neodymium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 956), // Tartarite Ore

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

                // Black Plutonium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 388), // Black Plutonium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 527), // Red Garnet Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 528), // Yellow Garnet Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 941), // Borax Ore

                // Rare Earth Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 55), // Cadmium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 62), // Caesium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 64), // Lanthanum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 65), // Cerium Ore

                // Beryllium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 8), // Beryllium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 501), // Emerald Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 96), // Thorium Ore

                // Electrotine Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 836), // Saltpeter Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 948), // Diatomite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 812), // Electrotine Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 911), // Alunite Ore

                // Tetrahedrite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 840), // Tetrahedrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 35), // Copper Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 945), // Stibnite Ore

                // Tin Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 937), // Cassiterite Sand
                getModItem(GregTech.ID, "gt.blockores", 1L, 938), // Garnet Sand
                getModItem(GregTech.ID, "gt.blockores", 1L, 946), // Asbestos Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 948), // Diatomite Ore

                // Nether Quartz Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 522), // Nether Quartz Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 523) // Quartzite Ore
            });

        // T8 - TCetiE - TE
        VoidOreRecipes_T8.put(
            "TE",
            new ItemStack[] {
                // Oilsands Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 878), // Oilsands Ore

                // Magnesite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 908), // Magnesite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 917), // Banded Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 22), // Sulfur Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 510), // Opal Ore

                // Quartz Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 523), // Quartzite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 904), // Barite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 516), // Certus Quartz Ore

                // Black Plutonium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 388), // Black Plutonium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 527), // Red Garnet Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 528), // Yellow Garnet Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 941), // Borax Ore

                // Ilmenite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 918), // Ilmenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 825), // Chromite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 842), // Uvarovite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 925), // Perlite Ore

                // Bauxite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 822), // Bauxite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 918), // Ilmenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 19), // Aluminium Ore

                // Gold Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 870), // Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 923), // Vanadium Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore

                // Kaolinite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 929), // Kaolinite
                getModItem(GregTech.ID, "gt.blockores", 1L, 916), // Zeolite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 928), // Fullers Earth
                getModItem(GregTech.ID, "gt.blockores", 1L, 949), // Glauconite Sand

                // Nether Star Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 938), // Garnet Sand
                getModItem(GregTech.ID, "gt.blockores", 1L, 506), // Nether Star Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 527), // Red Garnet Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 528), // Yellow Garnet Ore

                // Apatite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 530), // Apatite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 534), // Tricalcium Phosphate Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 607), // Pyrochlore Ore

                // Chrome Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 30), // Chrome Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 841), // Tungstate Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 48), // Molybdenum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 31), // Manganese Ore

                // Magnetite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 870), // Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 32), // Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 923), // Vanadium Magnetite Ore

                // Salt Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 944), // Rock Salt Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 817), // Salt Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 907), // Lepidolite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 920), // Spodumene Ore

                // Cassiterite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 57), // Tin Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 824), // Cassiterite Ore

                // Small Ore Stats
                getModItem(GregTech.ID, "gt.blockores", 1L, 976), // Awakened Draconium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 129), // Neutronium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 526) // Lapis Ore
            });

        // T8 - VegaB - VB
        VoidOreRecipes_T8.put(
            "VB",
            new ItemStack[] {
                // Tungstate Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 910), // Scheelite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 841), // Tungstate Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 6), // Lithium Ore

                // Lapis Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 524), // Lazurite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 525), // Sodalite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 526), // Lapis Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 823), // Calcite Ore

                // Pitchblende Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 873), // Pitchblende
                getModItem(GregTech.ID, "gt.blockores", 1L, 922), // Uraninite Ore

                // Redstone Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 810), // Redstone Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 502), // Ruby Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 826), // Cinnabar Ore

                // Infused Gold Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 323), // Infused Gold Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 85), // Platinum Ore

                // Rare Earth Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 55), // Cadmium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 62), // Caesium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 64), // Lanthanum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 65), // Cerium Ore

                // Thorium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 96), // Thorium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 98), // Uranium 238 Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 101), // Plutonium 241 Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 97), // Uranium 235 Ore

                // Arsenic Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 39), // Arsenic Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 90), // Bismuth Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 58), // Antimony Ore

                // Vanadium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 29), // Vanadium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 870), // Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 30), // Chrome Ore

                // Neutronium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 129), // Neutronium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 319), // Adamantium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 324), // Naquadah Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 28), // Titanium Ore

                // Gold Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 870), // Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 923), // Vanadium Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore

                // Nether Star Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 938), // Garnet Sand
                getModItem(GregTech.ID, "gt.blockores", 1L, 506), // Nether Star Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 527), // Red Garnet Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 528), // Yellow Garnet Ore

                // Red Garnet Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 527), // Red Garnet Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 528), // Yellow Garnet Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 912), // Chrysotile Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 913), // Realgar Ore

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

                // Niobium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 47), // Niobium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 45), // Yttrium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 37), // Gallium Ore

                // Small Ore Stats
                getModItem(GregTech.ID, "gt.blockores", 1L, 976), // Awakened Draconium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 54), // Silver Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 89), // Lead Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 129), // Neutronium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 394), // Infinity Catalyst Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 500), // Diamond Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 388), // Black Plutonium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 825), // Chromite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 90) // Bismuth Ore
            });
    }
}
