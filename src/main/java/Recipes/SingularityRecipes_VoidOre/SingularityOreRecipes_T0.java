package Recipes.SingularityRecipes_VoidOre;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

public class SingularityOreRecipes_T0 {

    public static final Map<String, ItemStack[]> VoidOreRecipes_T0 = new HashMap<>();

    public static void addVoidOreRecipes_T0() {
        // T0 - Overworld - Ow
        VoidOreRecipes_T0.put(
            "Ow",
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

                // Vermiculite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 855), // "Chalcopyrite Ore"
                getModItem(GregTech.ID, "gt.blockores", 1L, 932), // Vermiculite
                getModItem(GregTech.ID, "gt.blockores", 1L, 824), // "Cassiterite Ore"
                getModItem(GregTech.ID, "gt.blockores", 1L, 911), // "Alunite Ore"

                // Oilsands Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 878), // "Oilsands Ore"

                // Coal Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 535), // Coal Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 538), // Lignite Coal Ore

                // Manganese Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 831), // Grossular Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 838), // Spessartine Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 943), // Pyrolusite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 921), // Tantalite Ore

                // Redstone Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 810), // Redstone Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 502), // Ruby Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 826), // Cinnabar Ore

                // Mica Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 924), // Kyanite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 901), // Mica Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 824), // Cassiterite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 919), // Pollucite Ore

                // Dolomite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 914), // Dolomite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 915), // Wollastonite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 903), // Trona Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 821), // Andradite Ore

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

                // Gold Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 870), // Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 923), // Vanadium Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore

                // Kaolinite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 929), // Kaolinite
                getModItem(GregTech.ID, "gt.blockores", 1L, 916), // Zeolite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 928), // Fullers Earth
                getModItem(GregTech.ID, "gt.blockores", 1L, 949), // Glauconite Sand

                // Iron Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 930), // Brown Limonite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 931), // Yellow Limonite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 917), // Banded Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 871), // Malachite Ore

                // Lignite Coal Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 538), // Lignite Coal Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 535), // Coal Ore

                // Apatite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 530), // Apatite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 534), // Tricalcium Phosphate Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 607), // Pyrochlore Ore

                // Basaltic Mineral Sand Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 935), // Basaltic Mineral Sand
                getModItem(GregTech.ID, "gt.blockores", 1L, 936), // Granitic Mineral Sand
                getModItem(GregTech.ID, "gt.blockores", 1L, 928), // Fullers Earth
                getModItem(GregTech.ID, "gt.blockores", 1L, 934), // Gypsum Ore

                // Magnetite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 870), // Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 32), // Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 923), // Vanadium Magnetite Ore

                // Tin Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 937), // Cassiterite Sand
                getModItem(GregTech.ID, "gt.blockores", 1L, 938), // Garnet Sand
                getModItem(GregTech.ID, "gt.blockores", 1L, 946), // Asbestos Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 948), // Diatomite Ore

                // Salt Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 944), // Rock Salt Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 817), // Salt Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 907), // Lepidolite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 920), // Spodumene Ore

                // Cassiterite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 57), // Tin Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 824), // Cassiterite Ore

                // Small Ore Stats
                getModItem(GregTech.ID, "gt.blockores", 1L, 32), // Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 35), // Copper Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 54), // Silver Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 57), // Tin Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 810), // Redstone Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 500), // Diamond Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 526), // Lapis Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 535), // Coal Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 36), // Zinc Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 34) // Nickel Ore
            });

        // T0 - Nether - Ne
        VoidOreRecipes_T0.put(
            "Ne",
            new ItemStack[] {
                // Sulfur Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 22), // Sulfur Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 834), // Pyrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 839), // Sphalerite Ore

                // Molybdenum Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 882), // Wulfenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 942), // Molybdenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 48), // Molybdenum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 883), // Powellite Ore

                // Manganese Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 831), // Grossular Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 838), // Spessartine Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 943), // Pyrolusite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 921), // Tantalite Ore

                // Quartzite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 523), // Quartzite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 904), // Barite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 516), // Certus Quartz Ore

                // Redstone Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 810), // Redstone Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 502), // Ruby Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 826), // Cinnabar Ore

                // Copper Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 855), // Chalcopyrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 32), // Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 834), // Pyrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 35), // Copper Ore

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

                // Tetrahedrite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 840), // Tetrahedrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 35), // Copper Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 945), // Stibnite Ore

                // Nether Quartz Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 522), // Nether Quartz Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 523), // Quartzite Ore

                // Small Ore Stats
                getModItem(GregTech.ID, "gt.blockores", 1L, 836), // Saltpeter Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 32), // Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 35), // Copper Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 54), // Silver Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 57), // Tin Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 89), // Lead Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 810), // Redstone Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 516), // Certus Quartz Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 22), // Sulfur Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 522), // Nether Quartz Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 90), // Bismuth Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 36), // Zinc Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 913) // Realgar Ore
            });

        // T0 - Twilight - TF
        VoidOreRecipes_T0.put(
            "TF",
            new ItemStack[] {
                // Diamond Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 865), // Graphite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 500), // Diamond Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 535), // Coal Ore

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

                // Terra & Aer Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 542), // Terra Infused Stone
                getModItem(GregTech.ID, "gt.blockores", 1L, 540), // Aer Infused Stone
                getModItem(GregTech.ID, "gt.blockores", 1L, 514), // Amber Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 826), // Cinnabar Ore

                // Coal Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 535), // Coal Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 538), // Lignite Coal Ore

                // Sapphire Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 820), // Almandine Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 835), // Pyrope Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 503), // Sapphire Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 504), // Green Sapphire Ore

                // Cryolite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 830), // Galena Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 54), // Silver Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 89), // Lead Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 699), // Cryolite Ore

                // Nickel Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 906), // Garnierite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 34), // Nickel Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 827), // Cobaltite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 909), // Pentlandite Ore

                // Soapstone Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 877), // Soapstone Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 902), // Talc
                getModItem(GregTech.ID, "gt.blockores", 1L, 933), // Glauconite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 909), // Pentlandite Ore

                // Perditio & Ordo Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 544), // Perditio Infused Stone
                getModItem(GregTech.ID, "gt.blockores", 1L, 545), // Ordo Infused Stone
                getModItem(GregTech.ID, "gt.blockores", 1L, 514), // Amber Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 826), // Cinnabar Ore

                // Gold Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 870), // Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 923), // Vanadium Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore

                // Iron Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 930), // Brown Limonite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 931), // Yellow Limonite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 917), // Banded Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 871), // Malachite Ore

                // Apatite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 530), // Apatite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 534), // Tricalcium Phosphate Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 607), // Pyrochlore Ore

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

                // Aqua & Ignis Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 543), // Aqua Infused Stone
                getModItem(GregTech.ID, "gt.blockores", 1L, 541), // Ignis Infused Stone
                getModItem(GregTech.ID, "gt.blockores", 1L, 514), // Amber Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 826), // Cinnabar Ore

                // Small Ore Stats
                getModItem(GregTech.ID, "gt.blockores", 1L, 509), // Amethyst Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 528), // Yellow Garnet Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 508), // Tanzanite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 836), // Saltpeter Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 512), // Spinel Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 510), // Opal Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 502), // Ruby Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 89), // Lead Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 501), // Emerald Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 514), // Amber Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 513), // Blue Topaz Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 507), // Topaz Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 537), // Jade Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 527), // Red Garnet Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 504), // Green Sapphire Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 503), // Sapphire Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 511), // Jasper Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 505) // Olivine Ore
            });

        // T0 - TheEnd - ED
        VoidOreRecipes_T0.put(
            "ED",
            new ItemStack[] {
                // Molybdenum Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 882), // Wulfenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 942), // Molybdenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 48), // Molybdenum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 883), // Powellite Ore

                // Nickel Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 906), // Garnierite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 34), // Nickel Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 827), // Cobaltite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 909), // Pentlandite Ore

                // Copper Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 855), // Chalcopyrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 32), // Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 834), // Pyrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 35), // Copper Ore

                // Gold Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 870), // Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 923), // Vanadium Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore

                // Beryllium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 8), // Beryllium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 501), // Emerald Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 96), // Thorium Ore

                // Tetrahedrite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 840), // Tetrahedrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 35), // Copper Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 945), // Stibnite Ore

                // Cassiterite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 57), // Tin Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 824), // Cassiterite Ore

                // Small Ore Stats
                getModItem(GregTech.ID, "gt.blockores", 1L, 32), // Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 35), // Copper Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 54), // Silver Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 57), // Tin Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 89), // Lead Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 36), // Zinc Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 34) // Nickel Ore
            });

        // T0 - EndAsteroid - EA
        VoidOreRecipes_T0.put(
            "EA",
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

                // Nickel Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 906), // Garnierite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 34), // Nickel Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 827), // Cobaltite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 909), // Pentlandite Ore

                // Copper Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 855), // Chalcopyrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 32), // Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 834), // Pyrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 35), // Copper Ore

                // Gold Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 870), // Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 923), // Vanadium Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore

                // Beryllium Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 8), // Beryllium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 501), // Emerald Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 96), // Thorium Ore

                // Platinum Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 828), // Sheldonite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 52), // Palladium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 85), // Platinum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 84), // Iridium Ore

                // Tetrahedrite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 840), // Tetrahedrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 35), // Copper Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 945), // Stibnite Ore

                // Naquadah Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 324), // Naquadah Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 326), // Enriched Naquadah Ore

                // Cassiterite Vein
                getModItem(GregTech.ID, "gt.blockores", 1L, 57), // Tin Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 824), // Cassiterite Ore

                // Small Ore Stats
                getModItem(GregTech.ID, "gt.blockores", 1L, 54), // Silver Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 57), // Tin Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 89), // Lead Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 36), // Zinc Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 34) // Nickel Ore
            });
    }
}
