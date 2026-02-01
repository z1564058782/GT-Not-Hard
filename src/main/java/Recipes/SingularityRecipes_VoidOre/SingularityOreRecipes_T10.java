package Recipes.SingularityRecipes_VoidOre;

import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

public class SingularityOreRecipes_T10 {

    public static final Map<String, ItemStack[]> VoidOreRecipes_T10 = new HashMap<>();

    public static void addVoidOreRecipes_T10() {
        // T10 - DeepDark - DD
        VoidOreRecipes_T10.put(
            "DD",
            new ItemStack[] {
                // GregTech
                getModItem(GregTech.ID, "gt.blockores", 1L, 6), // Lithium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 8), // Beryllium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 18), // Magnesium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 19), // Aluminium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 20), // Raw Silicon Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 22), // Sulfur Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 27), // Scandium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 28), // Titanium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 29), // Vanadium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 30), // Chrome Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 31), // Manganese Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 32), // Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 33), // Cobalt Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 34), // Nickel Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 35), // Copper Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 36), // Zinc Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 37), // Gallium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 39), // Arsenic Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 43), // Rubidium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 44), // Strontium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 45), // Yttrium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 47), // Niobium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 48), // Molybdenum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 52), // Palladium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 54), // Silver Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 55), // Cadmium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 56), // Indium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 57), // Tin Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 58), // Antimony Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 59), // Tellurium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 62), // Caesium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 63), // Barium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 64), // Lanthanum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 65), // Cerium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 66), // Praseodymium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 67), // Neodymium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 68), // Promethium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 69), // Samarium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 70), // Europium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 71), // Gadolinium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 72), // Terbium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 73), // Dysprosium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 74), // Holmium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 75), // Erbium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 76), // Thulium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 77), // Ytterbium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 78), // Lutetium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 80), // Tantalum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 81), // Tungsten Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 83), // Osmium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 84), // Iridium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 85), // Platinum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 86), // Gold Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 89), // Lead Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 90), // Bismuth Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 96), // Thorium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 97), // Uranium 235 Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 98), // Uranium 238 Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 100), // Plutonium 239 Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 101), // Plutonium 241 Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 103), // Americium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 110), // Raw Tengam Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 129), // Neutronium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 303), // Electrum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 307), // Pig Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 319), // Adamantium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 320), // Fluxed Electrum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 323), // Infused Gold Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 324), // Naquadah Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 326), // Enriched Naquadah Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 327), // Naquadria Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 329), // Tritanium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 331), // Mithril Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 336), // Shadow Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 340), // Meteoric Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 342), // Deep Dark Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 347), // Firestone Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 368), // Shadow Metal Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 375), // Rutile Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 382), // Ardite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 386), // Manyullyn Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 387), // Mytryl Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 388), // Black Plutonium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 389), // Callisto Ice Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 390), // Ledox Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 391), // Quantium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 392), // Duralumin Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 393), // Oriharukon Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 394), // Infinity Catalyst Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 395), // Bedrockium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 398), // Mysterious Crystal Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 485), // Alduorite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 488), // Rubracium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 489), // Vulcanite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 500), // Diamond Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 501), // Emerald Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 502), // Ruby Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 503), // Sapphire Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 504), // Green Sapphire Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 505), // Olivine Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 506), // Nether Star Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 507), // Topaz Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 508), // Tanzanite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 509), // Amethyst Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 510), // Opal Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 511), // Jasper Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 512), // Spinel Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 513), // Blue Topaz Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 514), // Amber Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 515), // Dilithium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 516), // Certus Quartz Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 517), // Charged Certus Quartz Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 518), // Forcicium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 519), // Forcillium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 520), // Monazite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 521), // Force Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 522), // Nether Quartz Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 523), // Quartzite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 524), // Lazurite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 525), // Sodalite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 526), // Lapis Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 527), // Red Garnet Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 528), // Yellow Garnet Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 529), // Vinteum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 530), // Apatite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 531), // Niter Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 534), // Tricalcium Phosphate Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 535), // Coal Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 537), // Jade Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 538), // Lignite Coal Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 540), // Aer Infused Stone
                getModItem(GregTech.ID, "gt.blockores", 1L, 541), // Ignis Infused Stone
                getModItem(GregTech.ID, "gt.blockores", 1L, 542), // Terra Infused Stone
                getModItem(GregTech.ID, "gt.blockores", 1L, 543), // Aqua Infused Stone
                getModItem(GregTech.ID, "gt.blockores", 1L, 544), // Perditio Infused Stone
                getModItem(GregTech.ID, "gt.blockores", 1L, 545), // Ordo Infused Stone
                getModItem(GregTech.ID, "gt.blockores", 1L, 548), // Roasted Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 549), // Roasted Nickel Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 607), // Pyrochlore Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 699), // Cryolite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 770), // Endium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 797), // Calcium Hydride Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 810), // Redstone Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 812), // Electrotine Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 817), // Salt Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 820), // Almandine Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 821), // Andradite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 822), // Bauxite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 823), // Calcite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 824), // Cassiterite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 825), // Chromite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 826), // Cinnabar Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 827), // Cobaltite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 828), // Sheldonite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 829), // Deep Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 830), // Galena Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 831), // Grossular Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 833), // Phosphate Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 834), // Pyrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 835), // Pyrope Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 836), // Saltpeter Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 838), // Spessartine Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 839), // Sphalerite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 840), // Tetrahedrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 841), // Tungstate Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 842), // Uvarovite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 855), // Chalcopyrite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 856), // Silicon Solar Grade (Poly SI) Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 861), // Emery Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 865), // Graphite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 868), // Trinium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 870), // Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 871), // Malachite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 873), // Pitchblende
                getModItem(GregTech.ID, "gt.blockores", 1L, 877), // Soapstone Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 878), // Oilsands Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 882), // Wulfenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 883), // Powellite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 884), // Desh Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 894), // Cheese Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 900), // Mirabilite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 901), // Mica Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 902), // Talc
                getModItem(GregTech.ID, "gt.blockores", 1L, 903), // Trona Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 904), // Barite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 905), // Bastnasite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 906), // Garnierite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 907), // Lepidolite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 908), // Magnesite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 909), // Pentlandite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 910), // Scheelite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 911), // Alunite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 912), // Chrysotile Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 913), // Realgar Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 914), // Dolomite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 915), // Wollastonite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 916), // Zeolite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 917), // Banded Iron Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 918), // Ilmenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 919), // Pollucite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 920), // Spodumene Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 921), // Tantalite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 922), // Uraninite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 923), // Vanadium Magnetite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 924), // Kyanite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 925), // Perlite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 926), // Pumice Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 927), // Bentonite
                getModItem(GregTech.ID, "gt.blockores", 1L, 928), // Fullers Earth
                getModItem(GregTech.ID, "gt.blockores", 1L, 929), // Kaolinite
                getModItem(GregTech.ID, "gt.blockores", 1L, 930), // Brown Limonite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 931), // Yellow Limonite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 932), // Vermiculite
                getModItem(GregTech.ID, "gt.blockores", 1L, 933), // Glauconite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 934), // Gypsum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 935), // Basaltic Mineral Sand
                getModItem(GregTech.ID, "gt.blockores", 1L, 936), // Granitic Mineral Sand
                getModItem(GregTech.ID, "gt.blockores", 1L, 937), // Cassiterite Sand
                getModItem(GregTech.ID, "gt.blockores", 1L, 938), // Garnet Sand
                getModItem(GregTech.ID, "gt.blockores", 1L, 939), // Quartz Sand
                getModItem(GregTech.ID, "gt.blockores", 1L, 941), // Borax Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 942), // Molybdenite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 943), // Pyrolusite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 944), // Rock Salt Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 945), // Stibnite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 946), // Asbestos Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 948), // Diatomite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 949), // Glauconite Sand
                getModItem(GregTech.ID, "gt.blockores", 1L, 951), // Vyroxeres Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 952), // Ceruclase Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 956), // Tartarite Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 966), // Orichalcum Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 969), // Aluminium Fluoride Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 971), // Calcium Disilicide Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 975), // Draconium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 976), // Awakened Draconium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 978), // Ichorium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 982), // Cosmic Neutronium Ore
                getModItem(GregTech.ID, "gt.blockores", 1L, 984), // Flerovium Ore

                // BartWorks
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 1), // Bismutite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 2), // Bismuthinite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 5), // Fluor-Buergerite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 7), // Chromo-Alumino-Povondraite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 8), // Vanadio-Oxy-Dravite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 9), // Olenite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 10), // Arsenopyrite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 11), // Ferberite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 12), // Loellingite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 13), // Roquesite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 14), // Bornite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 15), // Wittichenite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 16), // Djurleite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 17), // Huebnerite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 18), // Thorianite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 19), // Red Zircon Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 23), // Fayalite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 24), // Forsterite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 25), // Hedenbergite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 26), // Red Descloizite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 27), // Orange Descloizite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 28), // Green Fuchsite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 29), // Red Fuchsite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 35), // Prasiolite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 43), // BArTiMaEuSNeK Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 47), // Platinum Metallic Powder Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 53), // Palladium Metallic Powder Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 60), // Leach Residue Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 69), // Rarest Metal Residue Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 70), // Iridium Metal Residue Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 79), // Crude Rhodium Metal Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 89), // Tiberium Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 91), // Fluorspar Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 93), // Atheneite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 94), // Temagamite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 95), // Terlinguaite Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 10023), // Orundum Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 10054), // Naquadah Oxide Mixture Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 10067), // Enriched-Naquadah Oxide Mixture Ore
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 10072), // Naquadria Oxide Mixture Ore

                // GTPlusPlus
                getModItem(GTPlusPlus.ID, "oreFluoriteF", 1L), // Fluorite (F) Ore
                getModItem(GTPlusPlus.ID, "oreKoboldite", 1L), // Koboldite Ore
                getModItem(GTPlusPlus.ID, "oreCrocoite", 1L), // Crocoite Ore
                getModItem(GTPlusPlus.ID, "oreGeikielite", 1L), // Geikielite Ore
                getModItem(GTPlusPlus.ID, "oreNichromite", 1L), // Nichromite Ore
                getModItem(GTPlusPlus.ID, "oreTitanite", 1L), // Titanite Ore
                getModItem(GTPlusPlus.ID, "oreZimbabweite", 1L), // Zimbabweite Ore
                getModItem(GTPlusPlus.ID, "oreZirconolite", 1L), // Zirconolite Ore
                getModItem(GTPlusPlus.ID, "oreGadoliniteCe", 1L), // Gadolinite (Ce) Ore
                getModItem(GTPlusPlus.ID, "oreGadoliniteY", 1L), // Gadolinite (Y) Ore
                getModItem(GTPlusPlus.ID, "oreLepersonnite", 1L), // Lepersonnite Ore
                getModItem(GTPlusPlus.ID, "oreSamarskiteY", 1L), // Samarskite (Y) Ore
                getModItem(GTPlusPlus.ID, "oreSamarskiteYb", 1L), // Samarskite (Yb) Ore
                getModItem(GTPlusPlus.ID, "oreXenotime", 1L), // Xenotime Ore
                getModItem(GTPlusPlus.ID, "oreYttriaite", 1L), // Yttriaite Ore
                getModItem(GTPlusPlus.ID, "oreYttrialite", 1L), // Yttrialite Ore
                getModItem(GTPlusPlus.ID, "oreYttrocerite", 1L), // Yttrocerite Ore
                getModItem(GTPlusPlus.ID, "oreZircon", 1L), // Zircon Ore
                getModItem(GTPlusPlus.ID, "orePolycrase", 1L), // Polycrase Ore
                getModItem(GTPlusPlus.ID, "oreZircophyllite", 1L), // Zircophyllite Ore
                getModItem(GTPlusPlus.ID, "oreZirkelite", 1L), // Zirkelite Ore
                getModItem(GTPlusPlus.ID, "oreLanthaniteLa", 1L), // Lanthanite (La) Ore
                getModItem(GTPlusPlus.ID, "oreLanthaniteCe", 1L), // Lanthanite (Ce) Ore
                getModItem(GTPlusPlus.ID, "oreLanthaniteNd", 1L), // Lanthanite (Nd) Ore
                getModItem(GTPlusPlus.ID, "oreAgarditeY", 1L), // Agardite (Y) Ore
                getModItem(GTPlusPlus.ID, "oreAgarditeCd", 1L), // Agardite (Cd) Ore
                getModItem(GTPlusPlus.ID, "oreAgarditeLa", 1L), // Agardite (La) Ore
                getModItem(GTPlusPlus.ID, "oreAgarditeNd", 1L), // Agardite (Nd) Ore
                getModItem(GTPlusPlus.ID, "oreHibonite", 1L), // Hibonite Ore
                getModItem(GTPlusPlus.ID, "oreCerite", 1L), // Cerite Ore
                getModItem(GTPlusPlus.ID, "oreFluorcaphite", 1L), // Fluorcaphite Ore
                getModItem(GTPlusPlus.ID, "oreFlorencite", 1L), // Florencite Ore
                getModItem(GTPlusPlus.ID, "oreCryoliteF", 1L), // Cryolite (F) Ore
                getModItem(GTPlusPlus.ID, "oreLautarite", 1L), // Lautarite Ore
                getModItem(GTPlusPlus.ID, "oreLafossaite", 1L), // Lafossaite Ore
                getModItem(GTPlusPlus.ID, "oreDemicheleiteBr", 1L), // Demicheleite (Br) Ore
                getModItem(GTPlusPlus.ID, "oreComancheite", 1L), // Comancheite Ore
                getModItem(GTPlusPlus.ID, "orePerroudite", 1L), // Perroudite Ore
                getModItem(GTPlusPlus.ID, "oreHoneaite", 1L), // Honeaite Ore
                getModItem(GTPlusPlus.ID, "oreAlburnite", 1L), // Alburnite Ore
                getModItem(GTPlusPlus.ID, "oreMiessiite", 1L), // Miessiite Ore
                getModItem(GTPlusPlus.ID, "oreKashinite", 1L), // Kashinite Ore
                getModItem(GTPlusPlus.ID, "oreIrarsite", 1L), // Irarsite Ore
                getModItem(GTPlusPlus.ID, "oreGreenockite", 1L), // Greenockite Ore
                getModItem(GTPlusPlus.ID, "oreRadioactiveMineralMix", 1L), // Strange Ore
                getModItem(GTPlusPlus.ID, "oreAncientGranite", 1L), // Ancient Granite Ore
                getModItem(GTPlusPlus.ID, "oreRunite", 1L), // Runite Ore
                getModItem(GTPlusPlus.ID, "oreBariteRa", 1L), // Barite (Ra) Ore
            });
    }
}
