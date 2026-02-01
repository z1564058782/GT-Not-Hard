package Recipes.SingularityRecipes_VoidOre;

import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

public class SingularityOreRecipes_T3 {

    public static final Map<String, ItemStack[]> VoidOreRecipes_T3 = new HashMap<>();

    public static void addVoidOreRecipes_T3() {
        // T3 - Asteroids - As
        VoidOreRecipes_T3.put(
            "As",
            new ItemStack[] {
                // Tungstate Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 910), // Scheelite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 841), // Tungstate Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 6), // Lithium Ore

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

                // Tetrahedrite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 840), // Tetrahedrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 35), // Copper Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 945), // Stibnite Ore

                // Naquadah Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 324), // Naquadah Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 326), // Enriched Naquadah Ore

                // Small Ore Stats
                getModItem(GregTech.ID, "gt.blockores", 1L, 32), // Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 28), // Titanium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 89), // Lead Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 500), // Diamond Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 825), // Chromite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 841), // Tungstate Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 34) // Nickel Ore
            });

        // T3 - Callisto - Ca
        VoidOreRecipes_T3.put(
            "Ca",
            new ItemStack[] {
                // Tungstate Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 910), // Scheelite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 841), // Tungstate Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 6), // Lithium Ore

                // Plutonium 239 Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 98), // Uranium 238 Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 100), // Plutonium 239 Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 96), // Thorium Ore

                // Monazite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 905), // Bastnasite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 520), // Monazite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 67), // Neodymium Ore

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

                // Callisto Ice Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 389), // Callisto Ice Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 507), // Topaz Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 513), // Blue Topaz Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 485), // Alduorite Ore

                // Copper Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 855), // Chalcopyrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 32), // Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 834), // Pyrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 35), // Copper Ore

                // Gold Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 870), // Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 923), // Vanadium Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore

                // Iron Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 930), // Brown Limonite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 931), // Yellow Limonite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 917), // Banded Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 871), // Malachite Ore

                // Small Ore Stats
                getModItem(GregTech.ID, "gt.blockores", 1L, 32), // Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 387), // Mytryl Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 28), // Titanium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 390), // Ledox Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 500), // Diamond Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 825), // Chromite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 841), // Tungstate Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 884), // Desh Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 90) // Bismuth Ore
            });

        // T3 - Ceres - Ce
        VoidOreRecipes_T3.put(
            "Ce",
            new ItemStack[] {

                // Uranium 238 Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 922), // Uraninite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 98), // Uranium 238 Ore

                // Plutonium 239 Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 98), // Uranium 238 Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 100), // Plutonium 239 Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 96), // Thorium Ore

                // Lapis Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 524), // Lazurite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 525), // Sodalite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 526), // Lapis Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 823), // Calcite Ore

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

                // Manganese Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 831), // Grossular Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 838), // Spessartine Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 943), // Pyrolusite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 921), // Tantalite Ore

                // Palladium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 85), // Platinum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 30), // Chrome Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 828), // Sheldonite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 52), // Palladium Ore

                // Copper Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 855), // Chalcopyrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 32), // Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 834), // Pyrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 35), // Copper Ore

                // Soapstone Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 877), // Soapstone Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 902), // Talc
                getModItem(GregTech.ID, "gt.blockores", 1L, 933), // Glauconite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 909), // Pentlandite Ore

                // Iron Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 930), // Brown Limonite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 931), // Yellow Limonite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 917), // Banded Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 871), // Malachite Ore

                // Beryllium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 8), // Beryllium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 501), // Emerald Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 96), // Thorium Ore

                // Electrotine Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 836), // Saltpeter Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 948), // Diatomite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 812), // Electrotine Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 911), // Alunite Ore

                // Magnetite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 870), // Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 32), // Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 923), // Vanadium Magnetite Ore

                // Small Ore Stats
                getModItem(GregTech.ID, "gt.blockores", 1L, 28), // Titanium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 393), // Oriharukon Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 89), // Lead Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 500), // Diamond Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 825), // Chromite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 841), // Tungstate Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 90), // Bismuth Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 34), // Nickel Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 391), // Quantium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 324), // Naquadah Ore
            });

        // T3 - Europa - Eu
        VoidOreRecipes_T3.put(
            "Eu",
            new ItemStack[] {
                // Magnesite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 908), // Magnesite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 917), // Banded Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 22), // Sulfur Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 510), // Opal Ore

                // Basaltic Mineral Sand Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 935), // Basaltic Mineral Sand
                getModItem(GregTech.ID, "gt.blockores", 1L, 936), // Granitic Mineral Sand
                getModItem(GregTech.ID, "gt.blockores", 1L, 928), // Fullers Earth
                getModItem(GregTech.ID, "gt.blockores", 1L, 934), // Gypsum Ore

                // Chrome Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 30), // Chrome Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 841), // Tungstate Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 48), // Molybdenum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 31), // Manganese Ore

                // Ledox Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 390), // Ledox Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 510), // Opal Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 966), // Orichalcum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 488), // Rubracium Ore

                // Tin Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 937), // Cassiterite Sand
                getModItem(GregTech.ID, "gt.blockores", 1L, 938), // Garnet Sand
                getModItem(GregTech.ID, "gt.blockores", 1L, 946), // Asbestos Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 948) // Diatomite Ore
            });

        // T3 - Ganymede - Ga
        VoidOreRecipes_T3.put(
            "Ga",
            new ItemStack[] {
                // Uranium 238 Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 922), // Uraninite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 98), // Uranium 238 Ore

                // Tungstate Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 910), // Scheelite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 841), // Tungstate Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 6), // Lithium Ore

                // Plutonium 239 Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 98), // Uranium 238 Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 100), // Plutonium 239 Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 96), // Thorium Ore

                // Diamond Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 865), // Graphite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 500), // Diamond Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 535), // Coal Ore

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

                // Bauxite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 822), // Bauxite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 918), // Ilmenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 19), // Aluminium Ore

                // Iron Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 930), // Brown Limonite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 931), // Yellow Limonite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 917), // Banded Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 871), // Malachite Ore

                // Tetrahedrite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 840), // Tetrahedrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 35), // Copper Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 945), // Stibnite Ore

                // Galena Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 830), // Galena Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 54), // Silver Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 89), // Lead Ore

                // Small Ore Stats
                getModItem(GregTech.ID, "gt.blockores", 1L, 836), // Saltpeter Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 32), // Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 28), // Titanium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 57), // Tin Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 89), // Lead Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 810), // Redstone Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 975), // Draconium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 825), // Chromite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 841), // Tungstate Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 526), // Lapis Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 36) // Zinc Ore
            });

        // T3 - Ross128b - Rb
        VoidOreRecipes_T3.put(
            "Rb",
            new ItemStack[] {
                // Bismutite & Bismuthinite Vein
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 2), // Bismuthinite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 945), // Stibnite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 90), // Bismuth Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 1), // Bismutite Ore

                // Olenite & Fluor-Buergerite & Chromo-Alumino-Povondraite & Vanadio-Oxy-Dravit Vein
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 9), // Olenite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 5), // Fluor-Buergerite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 7), // Chromo-Alumino-Povondraite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 8), // Vanadio-Oxy-Dravite Ore

                // Arsenopyrite & Ferberite & Loellingite & Roquesite Vein
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 10), // Arsenopyrite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 11), // Ferberite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 12), // Loellingite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 13), // Roquesite Ore

                // Ferberite & Huebnerite & Loellingite Vein
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 11), // Ferberite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 17), // Huebnerite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 12), // Loellingite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 910), // Scheelite Ore

                // Djurleite & Bornite & Wittichenite Vein
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 16), // Djurleite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 14), // Bornite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 15), // Wittichenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 840), // Tetrahedrite Ore

                // Thorianite Vein
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 18), // Thorianite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 922), // Uraninite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 907), // Lepidolite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 920), // Spodumene Ore

                // Fayalite & Green Fuchsite & Red Zircon & Red Fuchsite Vein
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 23), // Fayalite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 28), // Green Fuchsite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 19), // Red Zircon Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 29), // Red Fuchsite Ore

                // Forsterite & Fayalite & Orange Descloizite & Red Descloizite Vein
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 24), // Forsterite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 23), // Fayalite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 27), // Orange Descloizite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 26), // Red Descloizite Ore
            });
    }
}
