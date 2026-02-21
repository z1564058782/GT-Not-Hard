package Recipes.SingularityRecipes_Ecosystem;

import static gregtech.api.enums.Mods.Automagy;
import static gregtech.api.enums.Mods.Avaritia;
import static gregtech.api.enums.Mods.BiomesOPlenty;
import static gregtech.api.enums.Mods.BloodArsenal;
import static gregtech.api.enums.Mods.Botania;
import static gregtech.api.enums.Mods.CropsPlusPlus;
import static gregtech.api.enums.Mods.EnderIO;
import static gregtech.api.enums.Mods.EtFuturumRequiem;
import static gregtech.api.enums.Mods.ExtraTrees;
import static gregtech.api.enums.Mods.ForbiddenMagic;
import static gregtech.api.enums.Mods.Forestry;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GalacticraftCore;
import static gregtech.api.enums.Mods.GalaxySpace;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.IndustrialCraft2;
import static gregtech.api.enums.Mods.MagicBees;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.Mods.Natura;
import static gregtech.api.enums.Mods.OpenBlocks;
import static gregtech.api.enums.Mods.PamsHarvestCraft;
import static gregtech.api.enums.Mods.PamsHarvestTheNether;
import static gregtech.api.enums.Mods.TaintedMagic;
import static gregtech.api.enums.Mods.Thaumcraft;
import static gregtech.api.enums.Mods.ThaumicExploration;
import static gregtech.api.enums.Mods.ThaumicHorizons;
import static gregtech.api.enums.Mods.TinkerConstruct;
import static gregtech.api.enums.Mods.TwilightForest;
import static gregtech.api.enums.Mods.Witchery;
import static gregtech.api.enums.Mods.WitchingGadgets;
import static gregtech.api.util.GTModHandler.getModItem;

import net.minecraft.item.ItemStack;

public class Ecosystem_Food {

    // Minecraft
    public static final ItemStack[] Minecraft_Food = new ItemStack[] {
        // Apple
        getModItem(Minecraft.ID, "apple", 1L),
        // "Mushroom Stew"
        getModItem(Minecraft.ID, "mushroom_stew", 1L),
        // Bread
        getModItem(Minecraft.ID, "bread", 1L),
        // "Raw Porkchop"
        getModItem(Minecraft.ID, "porkchop", 1L),
        // "Cooked Porkchop"
        getModItem(Minecraft.ID, "cooked_porkchop", 1L),
        // "Golden Apple"
        getModItem(Minecraft.ID, "golden_apple", 1L, 0),
        // "Golden Apple"
        getModItem(Minecraft.ID, "golden_apple", 1L, 1),
        // "Raw Cod"
        getModItem(Minecraft.ID, "fish", 1L, 0),
        // "Raw Salmon"
        getModItem(Minecraft.ID, "fish", 1L, 1),
        // Clownfish
        getModItem(Minecraft.ID, "fish", 1L, 2),
        // Pufferfish
        getModItem(Minecraft.ID, "fish", 1L, 3),
        // "Cooked Cod"
        getModItem(Minecraft.ID, "cooked_fished", 1L, 0),
        // "Cooked Salmon"
        getModItem(Minecraft.ID, "cooked_fished", 1L, 1),
        // Cake
        getModItem(Minecraft.ID, "cake", 1L),
        // Cookie
        getModItem(Minecraft.ID, "cookie", 1L),
        // "Melon Slice"
        getModItem(Minecraft.ID, "melon", 1L),
        // "Raw Beef"
        getModItem(Minecraft.ID, "beef", 1L),
        // Steak
        getModItem(Minecraft.ID, "cooked_beef", 1L),
        // "Raw Chicken"
        getModItem(Minecraft.ID, "chicken", 1L),
        // "Cooked Chicken"
        getModItem(Minecraft.ID, "cooked_chicken", 1L),
        // "Rotten Flesh"
        getModItem(Minecraft.ID, "rotten_flesh", 1L),
        // "Spider Eye"
        getModItem(Minecraft.ID, "spider_eye", 1L),
        // Carrot
        getModItem(Minecraft.ID, "carrot", 1L),
        // Potato
        getModItem(Minecraft.ID, "potato", 1L),
        // "Baked Potato"
        getModItem(Minecraft.ID, "baked_potato", 1L),
        // "Poisonous Potato"
        getModItem(Minecraft.ID, "poisonous_potato", 1L),
        // "Golden Carrot"
        getModItem(Minecraft.ID, "golden_carrot", 1L),
        // "Pumpkin Pie"
        getModItem(Minecraft.ID, "pumpkin_pie", 1L) };

    // Automagy
    public static final ItemStack[] Automagy_Food = new ItemStack[] {
        // "Vishroom Stew"
        getModItem(Automagy.ID, "foodstuff", 1L, 0) };

    // Avaritia
    public static final ItemStack[] Avaritia_Food = new ItemStack[] {
        // "Ultimate Stew"
        getModItem(Avaritia.ID, "Ultimate_Stew", 1L),
        // "Cosmic Meatballs"
        getModItem(Avaritia.ID, "Cosmic_Meatballs", 1L) };

    // Forestry
    public static final ItemStack[] Forestry_Food = new ItemStack[] {
        // Ambrosia
        getModItem(Forestry.ID, "ambrosia", 1L),
        // "Honey Pot"
        getModItem(Forestry.ID, "honeyPot", 1L),
        // "Cherry"
        getModItem(Forestry.ID, "fruits", 1L, 0),
        // "Walnut"
        getModItem(Forestry.ID, "fruits", 1L, 1),
        // "Chestnut"
        getModItem(Forestry.ID, "fruits", 1L, 2),
        // "Lemon"
        getModItem(Forestry.ID, "fruits", 1L, 3),
        // "Plum"
        getModItem(Forestry.ID, "fruits", 1L, 4),
        // "Date"
        getModItem(Forestry.ID, "fruits", 1L, 5),
        // "Papaya"
        getModItem(Forestry.ID, "fruits", 1L, 6),
        // "Honeyed Slice"
        getModItem(Forestry.ID, "honeyedSlice", 1L),
        // "Short Mead"
        getModItem(Forestry.ID, "beverage", 1L) };

    // BiomesOPlenty
    public static final ItemStack[] BiomesOPlenty_Food = new ItemStack[] {
        // Berry
        getModItem(BiomesOPlenty.ID, "food", 1L, 0),
        // "Shroom Powder"
        getModItem(BiomesOPlenty.ID, "food", 1L, 1),
        // "Wild Carrots"
        getModItem(BiomesOPlenty.ID, "food", 1L, 2),
        // Peach
        getModItem(BiomesOPlenty.ID, "food", 1L, 3),
        // "Fruit Salad"
        getModItem(BiomesOPlenty.ID, "food", 1L, 4),
        // "Veggie Salad"
        getModItem(BiomesOPlenty.ID, "food", 1L, 5),
        // "Shroom Salad"
        getModItem(BiomesOPlenty.ID, "food", 1L, 6),
        // Persimmon
        getModItem(BiomesOPlenty.ID, "food", 1L, 8),
        // "Filled Honeycomb"
        getModItem(BiomesOPlenty.ID, "food", 1L, 9),
        // Ambrosia
        getModItem(BiomesOPlenty.ID, "food", 1L, 10),
        // Turnip
        getModItem(BiomesOPlenty.ID, "food", 1L, 11),
        // Pear
        getModItem(BiomesOPlenty.ID, "food", 1L, 12),
        // "Bowl of Rice"
        getModItem(BiomesOPlenty.ID, "food", 1L, 13) };

    // BloodArsenal
    public static final ItemStack[] BloodArsenal_Food = new ItemStack[] {
        // "Blood Cake"
        getModItem(BloodArsenal.ID, "blood_cake", 1L),
        // "Blood Orange"
        getModItem(BloodArsenal.ID, "blood_orange", 1L),
        // "Blood Cookie"
        getModItem(BloodArsenal.ID, "blood_cookie", 1L),
        // "Juice and Cookies"
        getModItem(BloodArsenal.ID, "juice_and_cookies", 1L) };

    // Botania
    public static final ItemStack[] Botania_Food = new ItemStack[] {
        // "Biscuit of Totality"
        getModItem(Botania.ID, "manaCookie", 1L) };

    // EnderIO
    public static final ItemStack[] EnderIO_Food = new ItemStack[] {
        // "Enderios"
        getModItem(EnderIO.ID, "itemEnderFood", 1L, 0) };

    // ExtraTrees
    public static final ItemStack[] ExtraTrees_Food = new ItemStack[] {
        // "Crabapple"
        getModItem(ExtraTrees.ID, "food", 1L, 0),
        // "Orange"
        getModItem(ExtraTrees.ID, "food", 1L, 1),
        // "Kumquat"
        getModItem(ExtraTrees.ID, "food", 1L, 2),
        // "Lime"
        getModItem(ExtraTrees.ID, "food", 1L, 3),
        // "Wild Cherry"
        getModItem(ExtraTrees.ID, "food", 1L, 4),
        // "Sour Cherry"
        getModItem(ExtraTrees.ID, "food", 1L, 5),
        // "Black Cherry"
        getModItem(ExtraTrees.ID, "food", 1L, 6),
        // "Blackthorn"
        getModItem(ExtraTrees.ID, "food", 1L, 7),
        // "Cherry Plum"
        getModItem(ExtraTrees.ID, "food", 1L, 8),
        // "Almond"
        getModItem(ExtraTrees.ID, "food", 1L, 9),
        // "Apricot"
        getModItem(ExtraTrees.ID, "food", 1L, 10),
        // "Grapefruit"
        getModItem(ExtraTrees.ID, "food", 1L, 11),
        // "Peach"
        getModItem(ExtraTrees.ID, "food", 1L, 12),
        // "Satsuma"
        getModItem(ExtraTrees.ID, "food", 1L, 13),
        // "Buddhas Hand"
        getModItem(ExtraTrees.ID, "food", 1L, 14),
        // "Citron"
        getModItem(ExtraTrees.ID, "food", 1L, 15),
        // "Finger Lime"
        getModItem(ExtraTrees.ID, "food", 1L, 16),
        // "Key Lime"
        getModItem(ExtraTrees.ID, "food", 1L, 17),
        // "Manderin"
        getModItem(ExtraTrees.ID, "food", 1L, 18),
        // "Nectarine"
        getModItem(ExtraTrees.ID, "food", 1L, 19),
        // "Pomelo"
        getModItem(ExtraTrees.ID, "food", 1L, 20),
        // "Tangerine"
        getModItem(ExtraTrees.ID, "food", 1L, 21),
        // "Pear"
        getModItem(ExtraTrees.ID, "food", 1L, 22),
        // "Sand Pear"
        getModItem(ExtraTrees.ID, "food", 1L, 23),
        // "Hazelnut"
        getModItem(ExtraTrees.ID, "food", 1L, 24),
        // "Butternut"
        getModItem(ExtraTrees.ID, "food", 1L, 25),
        // "Beechnut"
        getModItem(ExtraTrees.ID, "food", 1L, 26),
        // "Pecan Nut"
        getModItem(ExtraTrees.ID, "food", 1L, 27),
        // "Banana"
        getModItem(ExtraTrees.ID, "food", 1L, 28),
        // "Red Banana"
        getModItem(ExtraTrees.ID, "food", 1L, 29),
        // "Plantain"
        getModItem(ExtraTrees.ID, "food", 1L, 30),
        // "Brazil Nut"
        getModItem(ExtraTrees.ID, "food", 1L, 31),
        // "Fig"
        getModItem(ExtraTrees.ID, "food", 1L, 32),
        // "Acorn"
        getModItem(ExtraTrees.ID, "food", 1L, 33),
        // "Elderberry"
        getModItem(ExtraTrees.ID, "food", 1L, 34),
        // "Olive"
        getModItem(ExtraTrees.ID, "food", 1L, 35),
        // "Gingko Nut"
        getModItem(ExtraTrees.ID, "food", 1L, 36),
        // "Coffee"
        getModItem(ExtraTrees.ID, "food", 1L, 37),
        // "Osange Orange"
        getModItem(ExtraTrees.ID, "food", 1L, 38),
        // "Clove"
        getModItem(ExtraTrees.ID, "food", 1L, 39),
        // "Papayimar"
        getModItem(ExtraTrees.ID, "food", 1L, 40),
        // "Blackcurrant"
        getModItem(ExtraTrees.ID, "food", 1L, 41),
        // "Redcurrant"
        getModItem(ExtraTrees.ID, "food", 1L, 42),
        // "Blackberry"
        getModItem(ExtraTrees.ID, "food", 1L, 43),
        // "Raspberry"
        getModItem(ExtraTrees.ID, "food", 1L, 44),
        // "Blueberry"
        getModItem(ExtraTrees.ID, "food", 1L, 45),
        // "Cranberry"
        getModItem(ExtraTrees.ID, "food", 1L, 46),
        // "Juniper"
        getModItem(ExtraTrees.ID, "food", 1L, 47),
        // "Gooseberry"
        getModItem(ExtraTrees.ID, "food", 1L, 48),
        // "Golden Raspberry"
        getModItem(ExtraTrees.ID, "food", 1L, 49),
        // "Coconut"
        getModItem(ExtraTrees.ID, "food", 1L, 50),
        // "Cashew"
        getModItem(ExtraTrees.ID, "food", 1L, 51),
        // "Avacado"
        getModItem(ExtraTrees.ID, "food", 1L, 52),
        // "Nutmeg"
        getModItem(ExtraTrees.ID, "food", 1L, 53),
        // "Allspice"
        getModItem(ExtraTrees.ID, "food", 1L, 54),
        // "Chilli"
        getModItem(ExtraTrees.ID, "food", 1L, 55),
        // "Star Anise"
        getModItem(ExtraTrees.ID, "food", 1L, 56),
        // "Mango"
        getModItem(ExtraTrees.ID, "food", 1L, 57),
        // "Starfruit"
        getModItem(ExtraTrees.ID, "food", 1L, 58),
        // "Candlenut"
        getModItem(ExtraTrees.ID, "food", 1L, 59) };

    // ForbiddenMagic
    public static final ItemStack[] ForbiddenMagic_Food = new ItemStack[] {
        // "Thaumic Cake"
        getModItem(ForbiddenMagic.ID, "ArcaneCake", 1L),
        // "Gluttony Shard"
        getModItem(ForbiddenMagic.ID, "GluttonyShard", 1L),
        // "Tainted Fruit"
        getModItem(ForbiddenMagic.ID, "TaintFruit", 1L) };

    // GalacticraftCore
    public static final ItemStack[] GalacticraftCore_Food = new ItemStack[] {
        // "Cheese Curd"
        getModItem(GalacticraftCore.ID, "item.cheeseCurd", 1L) };

    // GalaxySpace
    public static final ItemStack[] GalaxySpace_Food = new ItemStack[] {
        // "Unknown Fruits"
        getModItem(GalaxySpace.ID, "item.BarnardaCStrawberry", 1L) };

    // IndustrialCraft2
    public static final ItemStack[] IndustrialCraft2_Food = new ItemStack[] {
        // "Terra Wart"
        getModItem(IndustrialCraft2.ID, "itemTerraWart", 1L) };

    // MagicBees
    public static final ItemStack[] MagicBees_Food = new ItemStack[] {
        // "Handful of Jelly Babies"
        getModItem(MagicBees.ID, "jellyBabies", 1L) };

    // Natura
    public static final ItemStack[] Natura_Food = new ItemStack[] {
        // "Cactus Juice"
        getModItem(Natura.ID, "waterdrop", 1L),
        // "Saguaro Fruit"
        getModItem(Natura.ID, "saguaro.fruit", 1L),
        // "Raspberry"
        getModItem(Natura.ID, "berry", 1L, 0),
        // "Blueberry"
        getModItem(Natura.ID, "berry", 1L, 1),
        // "Blackberry"
        getModItem(Natura.ID, "berry", 1L, 2),
        // "Maloberry"
        getModItem(Natura.ID, "berry", 1L, 3),
        // "Blightberry"
        getModItem(Natura.ID, "berry.nether", 1L, 0),
        // "Duskberry"
        getModItem(Natura.ID, "berry.nether", 1L, 1),
        // "Skyberry"
        getModItem(Natura.ID, "berry.nether", 1L, 2),
        // "Stingberry"
        getModItem(Natura.ID, "berry.nether", 1L, 3),
        // "Berry Medley"
        getModItem(Natura.ID, "berryMedley", 1L, 0),
        // "Potash Apple"
        getModItem(Natura.ID, "Natura.netherfood", 1L, 0),
        // "Glowshroom Stew"
        getModItem(Natura.ID, "natura.stewbowl", 1L),
        // "Raw Imphide"
        getModItem(Natura.ID, "impmeat", 1L, 0),
        // "Cooked Imphide"
        getModItem(Natura.ID, "impmeat", 1L, 1), };

    // OpenBlocks
    public static final ItemStack[] OpenBlocks_Food = new ItemStack[] {
        // "Tasty Clay"
        getModItem(OpenBlocks.ID, "tastyClay", 1L) };

    // TinkerConstruct
    public static final ItemStack[] TinkerConstruct_Food = new ItemStack[] {
        // "Golden Head"
        getModItem(TinkerConstruct.ID, "goldHead", 1L, 0),
        // "Gelatinous Slime"
        getModItem(TinkerConstruct.ID, "strangeFood", 1L, 0),
        // "Coagulated Blood"
        getModItem(TinkerConstruct.ID, "strangeFood", 1L, 1),
        // "Bacon"
        getModItem(TinkerConstruct.ID, "strangeFood", 1L, 2),
        // "Jeweled Apple"
        getModItem(TinkerConstruct.ID, "diamondApple", 1L),
        // "Beef Jerky"
        getModItem(TinkerConstruct.ID, "jerky", 1L, 0),
        // "Chicken Jerky"
        getModItem(TinkerConstruct.ID, "jerky", 1L, 1),
        // "Bacon Jerky"
        getModItem(TinkerConstruct.ID, "jerky", 1L, 2),
        // "Mutton Jerky"
        getModItem(TinkerConstruct.ID, "jerky", 1L, 3),
        // "Fish Jerky"
        getModItem(TinkerConstruct.ID, "jerky", 1L, 4),
        // "Monster Jerky"
        getModItem(TinkerConstruct.ID, "jerky", 1L, 5),
        // "Gelatinous Slime Drop"
        getModItem(TinkerConstruct.ID, "jerky", 1L, 6),
        // "Coagulated Blood Drop"
        getModItem(TinkerConstruct.ID, "jerky", 1L, 7), };

    // TaintedMagic
    public static final ItemStack[] TaintedMagic_Food = new ItemStack[] {
        // "Magic Funguar"
        getModItem(TaintedMagic.ID, "ItemMagicFunguar", 1L) };

    // Thaumcraft
    public static final ItemStack[] Thaumcraft_Food = new ItemStack[] {
        // "Mana Bean"
        getModItem(Thaumcraft.ID, "ItemManaBean", 1L, 0),
        // "Chicken Nugget"
        getModItem(Thaumcraft.ID, "ItemNuggetChicken", 1L),
        // "Beef Nugget"
        getModItem(Thaumcraft.ID, "ItemNuggetBeef", 1L),
        // "Pork Nugget"
        getModItem(Thaumcraft.ID, "ItemNuggetPork", 1L),
        // "Fish Nugget"
        getModItem(Thaumcraft.ID, "ItemNuggetFish", 1L),
        // "Triple Meat Treat"
        getModItem(Thaumcraft.ID, "TripleMeatTreat", 1L),
        // "Zombie Brain"
        getModItem(Thaumcraft.ID, "ItemZombieBrain", 1L) };

    // ThaumicExploration
    public static final ItemStack[] ThaumicExploration_Food = new ItemStack[] {
        // Taintberry
        getModItem(ThaumicExploration.ID, "taintBerry", 1L) };

    // ThaumicHorizons
    public static final ItemStack[] ThaumicHorizons_Food = new ItemStack[] {
        // "Chocolate Bar"
        getModItem(ThaumicHorizons.ID, "barChocolate", 1L),
        // "Chocolate Ice Cream"
        getModItem(ThaumicHorizons.ID, "iceCream", 1L),
        // "Unidentifiable Meat"
        getModItem(ThaumicHorizons.ID, "meatTH", 1L),
        // "Unidentifiable Cooked Meat"
        getModItem(ThaumicHorizons.ID, "meatCookedTH", 1L),
        // "Unidentifiable Meat Nugget"
        getModItem(ThaumicHorizons.ID, "meatNuggetTH", 1L) };

    // TwilightForest
    public static final ItemStack[] TwilightForest_Food = new ItemStack[] {
        // "Raw Venison"
        getModItem(TwilightForest.ID, "item.venisonRaw", 1L),
        // "Venison Steak"
        getModItem(TwilightForest.ID, "item.venisonCooked", 1L),
        // "Hydra Chop"
        getModItem(TwilightForest.ID, "item.hydraChop", 1L),
        // "Raw Meef"
        getModItem(TwilightForest.ID, "item.meefRaw", 1L),
        // "Meef Steak"
        getModItem(TwilightForest.ID, "item.meefSteak", 1L),
        // "Meef Stroganoff"
        getModItem(TwilightForest.ID, "item.meefStroganoff", 1L),
        // "Maze Wafer"
        getModItem(TwilightForest.ID, "item.mazeWafer", 1L),
        // "Experiment 115"
        getModItem(TwilightForest.ID, "item.experiment115", 1L) };

    // WitchingGadgets
    public static final ItemStack[] WitchingGadgets_Food = new ItemStack[] {
        // Sweetwart
        getModItem(WitchingGadgets.ID, "item.WG_MagicFood", 1L, 0),
        // Nethercake
        getModItem(WitchingGadgets.ID, "item.WG_MagicFood", 1L, 1),
        // "Brain Jerky"
        getModItem(WitchingGadgets.ID, "item.WG_MagicFood", 1L, 2) };

    // CropsPlusPlus
    public static final ItemStack[] CropsPlusPlus_Food = new ItemStack[] {
        // Goldfish
        getModItem(CropsPlusPlus.ID, "foodGoldfish", 1L),
        // Huckleberry
        getModItem(CropsPlusPlus.ID, "foodBerries", 1L, 0),
        // "Sugar Beet"
        getModItem(CropsPlusPlus.ID, "foodBerries", 1L, 1) };

    // EtFuturumRequiem
    public static final ItemStack[] EtFuturumRequiem_Food = new ItemStack[] {
        // "Raw Rabbit"
        getModItem(EtFuturumRequiem.ID, "rabbit_raw", 1L),
        // "Cooked Rabbit"
        getModItem(EtFuturumRequiem.ID, "rabbit_cooked", 1L),
        // "Rabbit Stew"
        getModItem(EtFuturumRequiem.ID, "rabbit_stew", 1L),
        // "Beetroot"
        getModItem(EtFuturumRequiem.ID, "beetroot", 1L),
        // "Beetroot Soup"
        getModItem(EtFuturumRequiem.ID, "beetroot_soup", 1L),
        // "Chorus Fruit"
        getModItem(EtFuturumRequiem.ID, "chorus_fruit", 1L),
        // "Suspicious Stew"
        getModItem(EtFuturumRequiem.ID, "suspicious_stew", 1L),
        // "Sweet Berries"
        getModItem(EtFuturumRequiem.ID, "sweet_berries", 1L),
        // "Glow Berries"
        getModItem(EtFuturumRequiem.ID, "glow_berries_item", 1L) };

    // GregTech
    public static final ItemStack[] GregTech_Food = new ItemStack[] {
        // "Purple Drink"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32100),
        // "Grape Juice"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32101),
        // "Wine"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32102),
        // "Vinegar"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32103),
        // "Potato Juice"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32104),
        // "Vodka"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32105),
        // "Leninade"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32106),
        // "Mineral Water"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32107),
        // "Reed Water"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32109),
        // "Rum"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32110),
        // "Pirate Brew"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32111),
        // "Hops Juice"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32112),
        // "Dark Beer"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32113),
        // "Dragon Blood"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32114),
        // "Wheaty Juice"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32115),
        // "Scotch"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32116),
        // "Glen McKenner"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32117),
        // "Wheaty Hops Juice"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32118),
        // "Beer"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32119),
        // "Chilly Sauce"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32120),
        // "Hot Sauce"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32121),
        // "Diabolo Sauce"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32122),
        // "Diablo Sauce"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32123),
        // "Apple Juice"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32125),
        // "Cider"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32126),
        // "Golden Apple Juice"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32127),
        // "Golden Cider"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32128),
        // "Idun's Apple Juice"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32129),
        // "Notches Brew"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32130),
        // "Lemon Juice"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32131),
        // "Limoncello"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32132),
        // "Lemonade"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32133),
        // "Alcopops"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32134),
        // "Cave Johnsons Grenade Juice"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32135),
        // "Milk"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32136),
        // "Holy Water"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32137),
        // "Chocolate Coin"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32010),
        // "Coffee"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32000),
        // "Sweet Coffee"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32001),
        // "Latte"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32002),
        // "Sweet Latte"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32003),
        // "Sweet Jesus Latte"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32004),
        // "Dark Chocolate Milk"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32005),
        // "Chocolate Milk"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32006),
        // "Tea"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32007),
        // "Sweet Tea"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32008),
        // "Ice Tea"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32009),
        // "Potato on a Stick"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32200),
        // "Roasted Potato on a Stick"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32201),
        // "Potato Strips"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32202),
        // "Fries"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32203),
        // "Fries"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32204),
        // "Potato Chips (Raw)"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32205),
        // "Potato Chips"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32206),
        // "Chili Chips"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32207),
        // "Bag of Potato Chips"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32208),
        // "Bag of Chili Chips"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32209),
        // "Chum"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32210),
        // "Chum on a Stick"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32211),
        // "Sugary Dough"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32212),
        // "Chocolate Dough"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32213),
        // "Cookie shaped Dough"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32214),
        // "Buns"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32220),
        // "Veggieburger"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32221),
        // "Cheeseburger"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32222),
        // "Hamburger"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32223),
        // "Chumburger"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32224),
        // "Breads"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32230),
        // "Veggie Sandwich"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32231),
        // "Cheese Sandwich"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32232),
        // "Bacon Sandwich"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32233),
        // "Steak Sandwich"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32234),
        // "Baguettes"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32240),
        // "Large Veggie Sandwich"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32241),
        // "Large Cheese Sandwich"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32242),
        // "Large Bacon Sandwich"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32243),
        // "Large Steak Sandwich"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32244),
        // "Raw Veggie Pizza"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32250),
        // "Raw Cheese Pizza"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32251),
        // "Raw Mince Meat Pizza"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32252),
        // "Veggie Pizza"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32260),
        // "Cheese Pizza"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32261),
        // "Mince Meat Pizza"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32262),
        // "Chilly Pepper"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32550),
        // "Lemon"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32551),
        // "Tomato"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32552),
        // "Max Tomato"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32553),
        // "Grapes"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32554),
        // "Onion"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32555),
        // "Cucumber"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32556),
        // "Cheese"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32558),
        // "Dough"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32559),
        // "Flattened Dough"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32560),
        // "Dough"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32561),
        // "Dough"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32562),
        // "Dough"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32563),
        // "Bun"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32564),
        // "Baguette"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32565),
        // "Sliced Bread"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32566),
        // "Sliced Bun"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32567),
        // "Sliced Baguette"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32568),
        // "Cake Bottom"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32569),
        // "Baked Cake Bottom"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32570),
        // "Lemon Slice"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32571),
        // "Tomato Slice"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32572),
        // "Onion Slice"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32573),
        // "Cucumber Slice"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32574),
        // "Cheese Slice"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 32576) };

    // PamsHarvestCraft
    public static final ItemStack[] PamsHarvestCraft_Food = new ItemStack[] {
        // "Carrot Cake"
        getModItem(PamsHarvestCraft.ID, "pamcarrotCake", 1L),
        // "Cheese Cake"
        getModItem(PamsHarvestCraft.ID, "pamcheeseCake", 1L),
        // "Cherry Cheese Cake"
        getModItem(PamsHarvestCraft.ID, "pamcherrycheeseCake", 1L),
        // "Pineapple Upside Down Cake"
        getModItem(PamsHarvestCraft.ID, "pampineappleupsidedownCake", 1L),
        // "Chocolate Sprinkles Cake"
        getModItem(PamsHarvestCraft.ID, "pamchocolatesprinkleCake", 1L),
        // "Red Velvet Cake"
        getModItem(PamsHarvestCraft.ID, "pamredvelvetCake", 1L),
        // "Lamington"
        getModItem(PamsHarvestCraft.ID, "pamlamingtonCake", 1L),
        // "Pavlova"
        getModItem(PamsHarvestCraft.ID, "pampavlovaCake", 1L),
        // "Holiday Cake"
        getModItem(PamsHarvestCraft.ID, "pamholidayCake", 1L),
        // "Pumpkin Cheese Cake"
        getModItem(PamsHarvestCraft.ID, "pampumpkincheeseCake", 1L),
        // "Honey"
        getModItem(PamsHarvestCraft.ID, "honeyItem", 1L),
        // "Raw Mutton"
        getModItem(PamsHarvestCraft.ID, "muttonrawItem", 1L),
        // "Cooked Mutton"
        getModItem(PamsHarvestCraft.ID, "muttoncookedItem", 1L),
        // "Raw Calamari"
        getModItem(PamsHarvestCraft.ID, "calamarirawItem", 1L),
        // "Cooked Calamari"
        getModItem(PamsHarvestCraft.ID, "calamaricookedItem", 1L),
        // "Sunflower Seeds"
        getModItem(PamsHarvestCraft.ID, "sunflowerseedsItem", 1L),
        // "Blackberry"
        getModItem(PamsHarvestCraft.ID, "blackberryItem", 1L),
        // "Blueberry"
        getModItem(PamsHarvestCraft.ID, "blueberryItem", 1L),
        // "Candleberry"
        getModItem(PamsHarvestCraft.ID, "candleberryItem", 1L),
        // "Raspberry"
        getModItem(PamsHarvestCraft.ID, "raspberryItem", 1L),
        // "Strawberry"
        getModItem(PamsHarvestCraft.ID, "strawberryItem", 1L),
        // "Grape"
        getModItem(PamsHarvestCraft.ID, "grapeItem", 1L),
        // "Cactus Fruit"
        getModItem(PamsHarvestCraft.ID, "cactusfruitItem", 1L),
        // "Asparagus"
        getModItem(PamsHarvestCraft.ID, "asparagusItem", 1L),
        // "Barley"
        getModItem(PamsHarvestCraft.ID, "barleyItem", 1L),
        // "Oats"
        getModItem(PamsHarvestCraft.ID, "oatsItem", 1L),
        // "Rye"
        getModItem(PamsHarvestCraft.ID, "ryeItem", 1L),
        // "Corn"
        getModItem(PamsHarvestCraft.ID, "cornItem", 1L),
        // "Bamboo Shoot"
        getModItem(PamsHarvestCraft.ID, "bambooshootItem", 1L),
        // "Cantaloupe"
        getModItem(PamsHarvestCraft.ID, "cantaloupeItem", 1L),
        // "Cucumber"
        getModItem(PamsHarvestCraft.ID, "cucumberItem", 1L),
        // "Winter Squash"
        getModItem(PamsHarvestCraft.ID, "wintersquashItem", 1L),
        // "Zucchini"
        getModItem(PamsHarvestCraft.ID, "zucchiniItem", 1L),
        // "Beet"
        getModItem(PamsHarvestCraft.ID, "beetItem", 1L),
        // "Onion"
        getModItem(PamsHarvestCraft.ID, "onionItem", 1L),
        // "Parsnip"
        getModItem(PamsHarvestCraft.ID, "parsnipItem", 1L),
        // "Peanut"
        getModItem(PamsHarvestCraft.ID, "peanutItem", 1L),
        // "Radish"
        getModItem(PamsHarvestCraft.ID, "radishItem", 1L),
        // "Rutabaga"
        getModItem(PamsHarvestCraft.ID, "rutabagaItem", 1L),
        // "Sweet Potato"
        getModItem(PamsHarvestCraft.ID, "sweetpotatoItem", 1L),
        // "Turnip"
        getModItem(PamsHarvestCraft.ID, "turnipItem", 1L),
        // "Rhubarb"
        getModItem(PamsHarvestCraft.ID, "rhubarbItem", 1L),
        // "Celery"
        getModItem(PamsHarvestCraft.ID, "celeryItem", 1L),
        // "Garlic"
        getModItem(PamsHarvestCraft.ID, "garlicItem", 1L),
        // "Ginger"
        getModItem(PamsHarvestCraft.ID, "gingerItem", 1L),
        // "Spice Leaf"
        getModItem(PamsHarvestCraft.ID, "spiceleafItem", 1L),
        // "Edible Root"
        getModItem(PamsHarvestCraft.ID, "ediblerootItem", 1L),
        // "Tea Leaf"
        getModItem(PamsHarvestCraft.ID, "tealeafItem", 1L),
        // "Coffee Beans"
        getModItem(PamsHarvestCraft.ID, "coffeebeanItem", 1L),
        // "Mustard Seeds"
        getModItem(PamsHarvestCraft.ID, "mustardseedsItem", 1L),
        // "Broccoli"
        getModItem(PamsHarvestCraft.ID, "broccoliItem", 1L),
        // "Cauliflower"
        getModItem(PamsHarvestCraft.ID, "cauliflowerItem", 1L),
        // "Leek"
        getModItem(PamsHarvestCraft.ID, "leekItem", 1L),
        // "Lettuce"
        getModItem(PamsHarvestCraft.ID, "lettuceItem", 1L),
        // "Scallion"
        getModItem(PamsHarvestCraft.ID, "scallionItem", 1L),
        // "Artichoke"
        getModItem(PamsHarvestCraft.ID, "artichokeItem", 1L),
        // "Brussel Sprout"
        getModItem(PamsHarvestCraft.ID, "brusselsproutItem", 1L),
        // "Cabbage"
        getModItem(PamsHarvestCraft.ID, "cabbageItem", 1L),
        // "Spinach"
        getModItem(PamsHarvestCraft.ID, "spinachItem", 1L),
        // "White Mushroom"
        getModItem(PamsHarvestCraft.ID, "whitemushroomItem", 1L),
        // "Beans"
        getModItem(PamsHarvestCraft.ID, "beanItem", 1L),
        // "Soybean"
        getModItem(PamsHarvestCraft.ID, "soybeanItem", 1L),
        // "Bellpepper"
        getModItem(PamsHarvestCraft.ID, "bellpepperItem", 1L),
        // "Chili Pepper"
        getModItem(PamsHarvestCraft.ID, "chilipepperItem", 1L),
        // "Eggplant"
        getModItem(PamsHarvestCraft.ID, "eggplantItem", 1L),
        // "Okra"
        getModItem(PamsHarvestCraft.ID, "okraItem", 1L),
        // "Peas"
        getModItem(PamsHarvestCraft.ID, "peasItem", 1L),
        // "Tomato"
        getModItem(PamsHarvestCraft.ID, "tomatoItem", 1L),
        // "Pineapple"
        getModItem(PamsHarvestCraft.ID, "pineappleItem", 1L),
        // "Kiwi"
        getModItem(PamsHarvestCraft.ID, "kiwiItem", 1L),
        // "Sesame Seeds"
        getModItem(PamsHarvestCraft.ID, "sesameseedsItem", 1L),
        // "Curry Leaf"
        getModItem(PamsHarvestCraft.ID, "curryleafItem", 1L),
        // "Cranberry"
        getModItem(PamsHarvestCraft.ID, "cranberryItem", 1L),
        // "Rice"
        getModItem(PamsHarvestCraft.ID, "riceItem", 1L),
        // "Seaweed"
        getModItem(PamsHarvestCraft.ID, "seaweedItem", 1L),
        // "Water Chestnut"
        getModItem(PamsHarvestCraft.ID, "waterchestnutItem", 1L),
        // "Almond"
        getModItem(PamsHarvestCraft.ID, "almondItem", 1L),
        // "Apricot"
        getModItem(PamsHarvestCraft.ID, "apricotItem", 1L),
        // "Avocado"
        getModItem(PamsHarvestCraft.ID, "avocadoItem", 1L),
        // "Banana"
        getModItem(PamsHarvestCraft.ID, "bananaItem", 1L),
        // "Cashew"
        getModItem(PamsHarvestCraft.ID, "cashewItem", 1L),
        // "Cherry"
        getModItem(PamsHarvestCraft.ID, "cherryItem", 1L),
        // "Chestnut"
        getModItem(PamsHarvestCraft.ID, "chestnutItem", 1L),
        // "Cinnamon"
        getModItem(PamsHarvestCraft.ID, "cinnamonItem", 1L),
        // "Coconut"
        getModItem(PamsHarvestCraft.ID, "coconutItem", 1L),
        // "Date"
        getModItem(PamsHarvestCraft.ID, "dateItem", 1L),
        // "Dragonfruit"
        getModItem(PamsHarvestCraft.ID, "dragonfruitItem", 1L),
        // "Durian"
        getModItem(PamsHarvestCraft.ID, "durianItem", 1L),
        // "Fig"
        getModItem(PamsHarvestCraft.ID, "figItem", 1L),
        // "Grapefruit"
        getModItem(PamsHarvestCraft.ID, "grapefruitItem", 1L),
        // "Lemon"
        getModItem(PamsHarvestCraft.ID, "lemonItem", 1L),
        // "Lime"
        getModItem(PamsHarvestCraft.ID, "limeItem", 1L),
        // "Maple Syrup"
        getModItem(PamsHarvestCraft.ID, "maplesyrupItem", 1L),
        // "Mango"
        getModItem(PamsHarvestCraft.ID, "mangoItem", 1L),
        // "Nutmeg"
        getModItem(PamsHarvestCraft.ID, "nutmegItem", 1L),
        // "Olive"
        getModItem(PamsHarvestCraft.ID, "oliveItem", 1L),
        // "Orange"
        getModItem(PamsHarvestCraft.ID, "orangeItem", 1L),
        // "Papaya"
        getModItem(PamsHarvestCraft.ID, "papayaItem", 1L),
        // "Peach"
        getModItem(PamsHarvestCraft.ID, "peachItem", 1L),
        // "Pear"
        getModItem(PamsHarvestCraft.ID, "pearItem", 1L),
        // "Pecan"
        getModItem(PamsHarvestCraft.ID, "pecanItem", 1L),
        // "Peppercorn"
        getModItem(PamsHarvestCraft.ID, "peppercornItem", 1L),
        // "Persimmon"
        getModItem(PamsHarvestCraft.ID, "persimmonItem", 1L),
        // "Pistachio"
        getModItem(PamsHarvestCraft.ID, "pistachioItem", 1L),
        // "Plum"
        getModItem(PamsHarvestCraft.ID, "plumItem", 1L),
        // "Pomegranate"
        getModItem(PamsHarvestCraft.ID, "pomegranateItem", 1L),
        // "Starfruit"
        getModItem(PamsHarvestCraft.ID, "starfruitItem", 1L),
        // "Vanilla Bean"
        getModItem(PamsHarvestCraft.ID, "vanillabeanItem", 1L),
        // "Walnut"
        getModItem(PamsHarvestCraft.ID, "walnutItem", 1L),
        // "Gooseberry"
        getModItem(PamsHarvestCraft.ID, "gooseberryItem", 1L),
        // "Grilled Asparagus"
        getModItem(PamsHarvestCraft.ID, "grilledasparagusItem", 1L),
        // "Baked Sweet Potato"
        getModItem(PamsHarvestCraft.ID, "bakedsweetpotatoItem", 1L),
        // "Cup of Tea"
        getModItem(PamsHarvestCraft.ID, "teaItem", 1L),
        // "Cup of Coffee"
        getModItem(PamsHarvestCraft.ID, "coffeeItem", 1L),
        // "Popcorn"
        getModItem(PamsHarvestCraft.ID, "popcornItem", 1L),
        // "Grilled Eggplant"
        getModItem(PamsHarvestCraft.ID, "grilledeggplantItem", 1L),
        // "Raisins"
        getModItem(PamsHarvestCraft.ID, "raisinsItem", 1L),
        // "Rice Cake"
        getModItem(PamsHarvestCraft.ID, "ricecakeItem", 1L),
        // "Toasted Coconut"
        getModItem(PamsHarvestCraft.ID, "toastedcoconutItem", 1L),
        // "Toast"
        getModItem(PamsHarvestCraft.ID, "toastItem", 1L),
        // "Cheese"
        getModItem(PamsHarvestCraft.ID, "cheeseItem", 1L),
        // "Ice Cream"
        getModItem(PamsHarvestCraft.ID, "icecreamItem", 1L),
        // "Grilled Cheese"
        getModItem(PamsHarvestCraft.ID, "grilledcheeseItem", 1L),
        // "Apple Juice"
        getModItem(PamsHarvestCraft.ID, "applejuiceItem", 1L),
        // "Apple Sauce"
        getModItem(PamsHarvestCraft.ID, "applesauceItem", 1L),
        // "Apple Pie"
        getModItem(PamsHarvestCraft.ID, "applepieItem", 1L),
        // "Caramel Apple"
        getModItem(PamsHarvestCraft.ID, "caramelappleItem", 1L),
        // "Pumpkin Bread"
        getModItem(PamsHarvestCraft.ID, "pumpkinbreadItem", 1L),
        // "Roasted Pumpkin Seeds"
        getModItem(PamsHarvestCraft.ID, "roastedpumpkinseedsItem", 1L),
        // "Pumpkin Soup"
        getModItem(PamsHarvestCraft.ID, "pumpkinsoupItem", 1L),
        // "Melon Juice"
        getModItem(PamsHarvestCraft.ID, "melonjuiceItem", 1L),
        // "Melon Smoothie"
        getModItem(PamsHarvestCraft.ID, "melonsmoothieItem", 1L),
        // "Carrot Juice"
        getModItem(PamsHarvestCraft.ID, "carrotjuiceItem", 1L),
        // "Carrot Soup"
        getModItem(PamsHarvestCraft.ID, "carrotsoupItem", 1L),
        // "Glazed Carrots"
        getModItem(PamsHarvestCraft.ID, "glazedcarrotsItem", 1L),
        // "Buttered Potato"
        getModItem(PamsHarvestCraft.ID, "butteredpotatoItem", 1L),
        // "Loaded Baked Potato"
        getModItem(PamsHarvestCraft.ID, "loadedbakedpotatoItem", 1L),
        // "Mashed Potatoes"
        getModItem(PamsHarvestCraft.ID, "mashedpotatoesItem", 1L),
        // "Potato Salad"
        getModItem(PamsHarvestCraft.ID, "potatosaladItem", 1L),
        // "Potato Soup"
        getModItem(PamsHarvestCraft.ID, "potatosoupItem", 1L),
        // "Fries"
        getModItem(PamsHarvestCraft.ID, "friesItem", 1L),
        // "Grilled Mushroom"
        getModItem(PamsHarvestCraft.ID, "grilledmushroomItem", 1L),
        // "Stuffed Mushroom"
        getModItem(PamsHarvestCraft.ID, "stuffedmushroomItem", 1L),
        // "Chicken Sandwich"
        getModItem(PamsHarvestCraft.ID, "chickensandwichItem", 1L),
        // "Chicken Noodle Soup"
        getModItem(PamsHarvestCraft.ID, "chickennoodlesoupItem", 1L),
        // "Chicken Pot Pie"
        getModItem(PamsHarvestCraft.ID, "chickenpotpieItem", 1L),
        // "Breaded Porkchop"
        getModItem(PamsHarvestCraft.ID, "breadedporkchopItem", 1L),
        // "Hotdog"
        getModItem(PamsHarvestCraft.ID, "hotdogItem", 1L),
        // "Baked Ham"
        getModItem(PamsHarvestCraft.ID, "bakedhamItem", 1L),
        // "Hamburger"
        getModItem(PamsHarvestCraft.ID, "hamburgerItem", 1L),
        // "Cheeseburger"
        getModItem(PamsHarvestCraft.ID, "cheeseburgerItem", 1L),
        // "Bacon Cheeseburger"
        getModItem(PamsHarvestCraft.ID, "baconcheeseburgerItem", 1L),
        // "Pot Roast"
        getModItem(PamsHarvestCraft.ID, "potroastItem", 1L),
        // "Fish Sandwich"
        getModItem(PamsHarvestCraft.ID, "fishsandwichItem", 1L),
        // "Fish Sticks"
        getModItem(PamsHarvestCraft.ID, "fishsticksItem", 1L),
        // "Fish and Chips"
        getModItem(PamsHarvestCraft.ID, "fishandchipsItem", 1L),
        // "Fried Egg"
        getModItem(PamsHarvestCraft.ID, "friedeggItem", 1L),
        // "Scrambled Egg"
        getModItem(PamsHarvestCraft.ID, "scrambledeggItem", 1L),
        // "Boiled Egg"
        getModItem(PamsHarvestCraft.ID, "boiledeggItem", 1L),
        // "Egg Salad"
        getModItem(PamsHarvestCraft.ID, "eggsaladItem", 1L),
        // "Caramel"
        getModItem(PamsHarvestCraft.ID, "caramelItem", 1L),
        // "Taffy"
        getModItem(PamsHarvestCraft.ID, "taffyItem", 1L),
        // "Spider Eye Soup"
        getModItem(PamsHarvestCraft.ID, "spidereyesoupItem", 1L),
        // "Zombie Jerky"
        getModItem(PamsHarvestCraft.ID, "zombiejerkyItem", 1L),
        // "Chocolate Bar"
        getModItem(PamsHarvestCraft.ID, "chocolatebarItem", 1L),
        // "Hot Chocolate"
        getModItem(PamsHarvestCraft.ID, "hotchocolateItem", 1L),
        // "Chocolate Ice Cream"
        getModItem(PamsHarvestCraft.ID, "chocolateicecreamItem", 1L),
        // "Vegetable Soup"
        getModItem(PamsHarvestCraft.ID, "vegetablesoupItem", 1L),
        // "Stock"
        getModItem(PamsHarvestCraft.ID, "stockItem", 1L),
        // "Fruit Salad"
        getModItem(PamsHarvestCraft.ID, "fruitsaladItem", 1L),
        // "Spaghetti"
        getModItem(PamsHarvestCraft.ID, "spagettiItem", 1L),
        // "Spaghetti and Meatballs"
        getModItem(PamsHarvestCraft.ID, "spagettiandmeatballsItem", 1L),
        // "Tomato Soup"
        getModItem(PamsHarvestCraft.ID, "tomatosoupItem", 1L),
        // "Chicken Parmesan"
        getModItem(PamsHarvestCraft.ID, "chickenparmasanItem", 1L),
        // "Pizza"
        getModItem(PamsHarvestCraft.ID, "pizzaItem", 1L),
        // "Spring Salad"
        getModItem(PamsHarvestCraft.ID, "springsaladItem", 1L),
        // "Pork Lettuce Wrap"
        getModItem(PamsHarvestCraft.ID, "porklettucewrapItem", 1L),
        // "Fish Lettuce Wrap"
        getModItem(PamsHarvestCraft.ID, "fishlettucewrapItem", 1L),
        // "BLT"
        getModItem(PamsHarvestCraft.ID, "bltItem", 1L),
        // "Leafy Chicken Sandwich"
        getModItem(PamsHarvestCraft.ID, "leafychickensandwichItem", 1L),
        // "Leafy Fish Sandwich"
        getModItem(PamsHarvestCraft.ID, "leafyfishsandwichItem", 1L),
        // "Deluxe Cheeseburger"
        getModItem(PamsHarvestCraft.ID, "deluxecheeseburgerItem", 1L),
        // "Delighted Meal"
        getModItem(PamsHarvestCraft.ID, "delightedmealItem", 1L),
        // "Onion Soup"
        getModItem(PamsHarvestCraft.ID, "onionsoupItem", 1L),
        // "Potato Cakes"
        getModItem(PamsHarvestCraft.ID, "potatocakesItem", 1L),
        // "Hash"
        getModItem(PamsHarvestCraft.ID, "hashItem", 1L),
        // "Braised Onions"
        getModItem(PamsHarvestCraft.ID, "braisedonionsItem", 1L),
        // "Hearty Breakfast"
        getModItem(PamsHarvestCraft.ID, "heartybreakfastItem", 1L),
        // "Corn on the Cob"
        getModItem(PamsHarvestCraft.ID, "cornonthecobItem", 1L),
        // "Cornbread"
        getModItem(PamsHarvestCraft.ID, "cornbreadItem", 1L),
        // "Tortilla"
        getModItem(PamsHarvestCraft.ID, "tortillaItem", 1L),
        // "Nachoes"
        getModItem(PamsHarvestCraft.ID, "nachoesItem", 1L),
        // "Taco"
        getModItem(PamsHarvestCraft.ID, "tacoItem", 1L),
        // "Fish Taco"
        getModItem(PamsHarvestCraft.ID, "fishtacoItem", 1L),
        // "Creamed Corn"
        getModItem(PamsHarvestCraft.ID, "creamedcornItem", 1L),
        // "Strawberry Smoothie"
        getModItem(PamsHarvestCraft.ID, "strawberrysmoothieItem", 1L),
        // "Strawberry Pie"
        getModItem(PamsHarvestCraft.ID, "strawberrypieItem", 1L),
        // "Strawberry Salad"
        getModItem(PamsHarvestCraft.ID, "strawberrysaladItem", 1L),
        // "Strawberry Juice"
        getModItem(PamsHarvestCraft.ID, "strawberryjuiceItem", 1L),
        // "Chocolate Strawberry"
        getModItem(PamsHarvestCraft.ID, "chocolatestrawberryItem", 1L),
        // "Peanut Butter"
        getModItem(PamsHarvestCraft.ID, "peanutbutterItem", 1L),
        // "Trail Mix"
        getModItem(PamsHarvestCraft.ID, "trailmixItem", 1L),
        // "PB&J"
        getModItem(PamsHarvestCraft.ID, "pbandjItem", 1L),
        // "Peanut Butter Cookies"
        getModItem(PamsHarvestCraft.ID, "peanutbuttercookiesItem", 1L),
        // "Grape Juice"
        getModItem(PamsHarvestCraft.ID, "grapejuiceItem", 1L),
        // "Grape Jelly"
        getModItem(PamsHarvestCraft.ID, "grapejellyItem", 1L),
        // "Grape Salad"
        getModItem(PamsHarvestCraft.ID, "grapesaladItem", 1L),
        // "Raisin Cookies"
        getModItem(PamsHarvestCraft.ID, "raisincookiesItem", 1L),
        // "Pickles"
        getModItem(PamsHarvestCraft.ID, "picklesItem", 1L),
        // "Cucumber Salad"
        getModItem(PamsHarvestCraft.ID, "cucumbersaladItem", 1L),
        // "Cucumber Soup"
        getModItem(PamsHarvestCraft.ID, "cucumbersoupItem", 1L),
        // "Vegetarian Lettuce Wrap"
        getModItem(PamsHarvestCraft.ID, "vegetarianlettucewrapItem", 1L),
        // "Marinated Cucumbers"
        getModItem(PamsHarvestCraft.ID, "marinatedcucumbersItem", 1L),
        // "Rice Soup"
        getModItem(PamsHarvestCraft.ID, "ricesoupItem", 1L),
        // "Fried Rice"
        getModItem(PamsHarvestCraft.ID, "friedriceItem", 1L),
        // "Mushroom Risotto"
        getModItem(PamsHarvestCraft.ID, "mushroomrisottoItem", 1L),
        // "Curry Rice"
        getModItem(PamsHarvestCraft.ID, "curryItem", 1L),
        // "Rainbow Curry"
        getModItem(PamsHarvestCraft.ID, "rainbowcurryItem", 1L),
        // "Refried Beans"
        getModItem(PamsHarvestCraft.ID, "refriedbeansItem", 1L),
        // "Baked Beans"
        getModItem(PamsHarvestCraft.ID, "bakedbeansItem", 1L),
        // "Beans and Rice"
        getModItem(PamsHarvestCraft.ID, "beansandriceItem", 1L),
        // "Chili"
        getModItem(PamsHarvestCraft.ID, "chiliItem", 1L),
        // "Bean Burrito"
        getModItem(PamsHarvestCraft.ID, "beanburritoItem", 1L),
        // "Stuffed Pepper"
        getModItem(PamsHarvestCraft.ID, "stuffedpepperItem", 1L),
        // "Veggie Stirfry"
        getModItem(PamsHarvestCraft.ID, "veggiestirfryItem", 1L),
        // "Grilled Skewer"
        getModItem(PamsHarvestCraft.ID, "grilledskewersItem", 1L),
        // "Supreme Pizza"
        getModItem(PamsHarvestCraft.ID, "supremepizzaItem", 1L),
        // "Omelet"
        getModItem(PamsHarvestCraft.ID, "omeletItem", 1L),
        // "Hot Wings"
        getModItem(PamsHarvestCraft.ID, "hotwingsItem", 1L),
        // "Chili Poppers"
        getModItem(PamsHarvestCraft.ID, "chilipoppersItem", 1L),
        // "Extreme Chili"
        getModItem(PamsHarvestCraft.ID, "extremechiliItem", 1L),
        // "Chili Chocolate"
        getModItem(PamsHarvestCraft.ID, "chilichocolateItem", 1L),
        // "Lemonade"
        getModItem(PamsHarvestCraft.ID, "lemonaideItem", 1L),
        // "Lemon Bar"
        getModItem(PamsHarvestCraft.ID, "lemonbarItem", 1L),
        // "Fish Dinner"
        getModItem(PamsHarvestCraft.ID, "fishdinnerItem", 1L),
        // "Lemon Smoothie"
        getModItem(PamsHarvestCraft.ID, "lemonsmoothieItem", 1L),
        // "Lemon Meringue"
        getModItem(PamsHarvestCraft.ID, "lemonmeringueItem", 1L),
        // "Candied Lemon"
        getModItem(PamsHarvestCraft.ID, "candiedlemonItem", 1L),
        // "Lemon Chicken"
        getModItem(PamsHarvestCraft.ID, "lemonchickenItem", 1L),
        // "Blueberry Smoothie"
        getModItem(PamsHarvestCraft.ID, "blueberrysmoothieItem", 1L),
        // "Blueberry Pie"
        getModItem(PamsHarvestCraft.ID, "blueberrypieItem", 1L),
        // "Blueberry Muffin"
        getModItem(PamsHarvestCraft.ID, "blueberrymuffinItem", 1L),
        // "Blueberry Juice"
        getModItem(PamsHarvestCraft.ID, "blueberryjuiceItem", 1L),
        // "Pancakes"
        getModItem(PamsHarvestCraft.ID, "pancakesItem", 1L),
        // "Blueberry Pancakes"
        getModItem(PamsHarvestCraft.ID, "blueberrypancakesItem", 1L),
        // "Cherry Juice"
        getModItem(PamsHarvestCraft.ID, "cherryjuiceItem", 1L),
        // "Cherry Pie"
        getModItem(PamsHarvestCraft.ID, "cherrypieItem", 1L),
        // "Chocolate Cherry"
        getModItem(PamsHarvestCraft.ID, "chocolatecherryItem", 1L),
        // "Cherry Smoothie"
        getModItem(PamsHarvestCraft.ID, "cherrysmoothieItem", 1L),
        // "Stuffed Eggplant"
        getModItem(PamsHarvestCraft.ID, "stuffedeggplantItem", 1L),
        // "Eggplant Parm"
        getModItem(PamsHarvestCraft.ID, "eggplantparmItem", 1L),
        // "Raspberry Iced Tea"
        getModItem(PamsHarvestCraft.ID, "raspberryicedteaItem", 1L),
        // "Chai Tea"
        getModItem(PamsHarvestCraft.ID, "chaiteaItem", 1L),
        // "Espresso"
        getModItem(PamsHarvestCraft.ID, "espressoItem", 1L),
        // "Coffee con Leche"
        getModItem(PamsHarvestCraft.ID, "coffeeconlecheItem", 1L),
        // "Mocha Ice Cream"
        getModItem(PamsHarvestCraft.ID, "mochaicecreamItem", 1L),
        // "Pickled Beets"
        getModItem(PamsHarvestCraft.ID, "pickledbeetsItem", 1L),
        // "Beet Salad"
        getModItem(PamsHarvestCraft.ID, "beetsaladItem", 1L),
        // "Beet Soup"
        getModItem(PamsHarvestCraft.ID, "beetsoupItem", 1L),
        // "Baked Beets"
        getModItem(PamsHarvestCraft.ID, "bakedbeetsItem", 1L),
        // "Broccoli Mac"
        getModItem(PamsHarvestCraft.ID, "broccolimacItem", 1L),
        // "Broccoli n Dip"
        getModItem(PamsHarvestCraft.ID, "broccolindipItem", 1L),
        // "Creamed Broccoli Soup"
        getModItem(PamsHarvestCraft.ID, "creamedbroccolisoupItem", 1L),
        // "Sweet Potato Pie"
        getModItem(PamsHarvestCraft.ID, "sweetpotatopieItem", 1L),
        // "Candied Sweet Potatoes"
        getModItem(PamsHarvestCraft.ID, "candiedsweetpotatoesItem", 1L),
        // "Mashed Sweet Potatoes"
        getModItem(PamsHarvestCraft.ID, "mashedsweetpotatoesItem", 1L),
        // "Steamed Peas"
        getModItem(PamsHarvestCraft.ID, "steamedpeasItem", 1L),
        // "Split Pea Soup"
        getModItem(PamsHarvestCraft.ID, "splitpeasoupItem", 1L),
        // "Pineapple Ham"
        getModItem(PamsHarvestCraft.ID, "pineapplehamItem", 1L),
        // "Pineapple Yogurt"
        getModItem(PamsHarvestCraft.ID, "pineappleyogurtItem", 1L),
        // "Turnip Soup"
        getModItem(PamsHarvestCraft.ID, "turnipsoupItem", 1L),
        // "Roasted Root Veggie Medley"
        getModItem(PamsHarvestCraft.ID, "roastedrootveggiemedleyItem", 1L),
        // "Baked Turnips"
        getModItem(PamsHarvestCraft.ID, "bakedturnipsItem", 1L),
        // "Ginger Bread"
        getModItem(PamsHarvestCraft.ID, "gingerbreadItem", 1L),
        // "Ginger Snaps"
        getModItem(PamsHarvestCraft.ID, "gingersnapsItem", 1L),
        // "Candied Ginger"
        getModItem(PamsHarvestCraft.ID, "candiedgingerItem", 1L),
        // "Soft Pretzel and Mustard"
        getModItem(PamsHarvestCraft.ID, "softpretzelandmustardItem", 1L),
        // "Spicy Mustard Pork"
        getModItem(PamsHarvestCraft.ID, "spicymustardporkItem", 1L),
        // "Spicy Greens"
        getModItem(PamsHarvestCraft.ID, "spicygreensItem", 1L),
        // "Garlic Bread"
        getModItem(PamsHarvestCraft.ID, "garlicbreadItem", 1L),
        // "Garlic Mashed Potatoes"
        getModItem(PamsHarvestCraft.ID, "garlicmashedpotatoesItem", 1L),
        // "Garlic Chicken"
        getModItem(PamsHarvestCraft.ID, "garlicchickenItem", 1L),
        // "Summer Radish Salad"
        getModItem(PamsHarvestCraft.ID, "summerradishsaladItem", 1L),
        // "Summer Squash with Radish"
        getModItem(PamsHarvestCraft.ID, "summersquashwithradishItem", 1L),
        // "Celery and Peanut Butter"
        getModItem(PamsHarvestCraft.ID, "celeryandpeanutbutterItem", 1L),
        // "Chicken Celery Casserole"
        getModItem(PamsHarvestCraft.ID, "chickencelerycasseroleItem", 1L),
        // "Peas and Celery"
        getModItem(PamsHarvestCraft.ID, "peasandceleryItem", 1L),
        // "Celery Soup"
        getModItem(PamsHarvestCraft.ID, "celerysoupItem", 1L),
        // "Zucchini Bread"
        getModItem(PamsHarvestCraft.ID, "zucchinibreadItem", 1L),
        // "Zucchini Fries"
        getModItem(PamsHarvestCraft.ID, "zucchinifriesItem", 1L),
        // "Zesty Zucchini"
        getModItem(PamsHarvestCraft.ID, "zestyzucchiniItem", 1L),
        // "Zucchini Bake"
        getModItem(PamsHarvestCraft.ID, "zucchinibakeItem", 1L),
        // "Asparagus Quiche"
        getModItem(PamsHarvestCraft.ID, "asparagusquicheItem", 1L),
        // "Asparagus Soup"
        getModItem(PamsHarvestCraft.ID, "asparagussoupItem", 1L),
        // "Walnut Raisin Bread"
        getModItem(PamsHarvestCraft.ID, "walnutraisinbreadItem", 1L),
        // "Candied Walnuts"
        getModItem(PamsHarvestCraft.ID, "candiedwalnutsItem", 1L),
        // "Brownie"
        getModItem(PamsHarvestCraft.ID, "brownieItem", 1L),
        // "Papaya Juice"
        getModItem(PamsHarvestCraft.ID, "papayajuiceItem", 1L),
        // "Papaya Smoothie"
        getModItem(PamsHarvestCraft.ID, "papayasmoothieItem", 1L),
        // "Papaya Yogurt"
        getModItem(PamsHarvestCraft.ID, "papayayogurtItem", 1L),
        // "Starfruit Juice"
        getModItem(PamsHarvestCraft.ID, "starfruitjuiceItem", 1L),
        // "Starfruit Smoothie"
        getModItem(PamsHarvestCraft.ID, "starfruitsmoothieItem", 1L),
        // "Starfruit Yogurt"
        getModItem(PamsHarvestCraft.ID, "starfruityogurtItem", 1L),
        // "Guacamole"
        getModItem(PamsHarvestCraft.ID, "guacamoleItem", 1L),
        // "Cream of Avocado Soup"
        getModItem(PamsHarvestCraft.ID, "creamofavocadosoupItem", 1L),
        // "Avocado Burrito"
        getModItem(PamsHarvestCraft.ID, "avocadoburritoItem", 1L),
        // "Poached Pear"
        getModItem(PamsHarvestCraft.ID, "poachedpearItem", 1L),
        // "Fruit Crumble"
        getModItem(PamsHarvestCraft.ID, "fruitcrumbleItem", 1L),
        // "Pear Yogurt"
        getModItem(PamsHarvestCraft.ID, "pearyogurtItem", 1L),
        // "Plum Yogurt"
        getModItem(PamsHarvestCraft.ID, "plumyogurtItem", 1L),
        // "Banana Split"
        getModItem(PamsHarvestCraft.ID, "bananasplitItem", 1L),
        // "Banana Nut Bread"
        getModItem(PamsHarvestCraft.ID, "banananutbreadItem", 1L),
        // "Banana Smoothie"
        getModItem(PamsHarvestCraft.ID, "bananasmoothieItem", 1L),
        // "Banana Yogurt"
        getModItem(PamsHarvestCraft.ID, "bananayogurtItem", 1L),
        // "Coconut Milk"
        getModItem(PamsHarvestCraft.ID, "coconutmilkItem", 1L),
        // "Chicken Curry"
        getModItem(PamsHarvestCraft.ID, "chickencurryItem", 1L),
        // "Coconut Shrimp"
        getModItem(PamsHarvestCraft.ID, "coconutshrimpItem", 1L),
        // "Coconut Yogurt"
        getModItem(PamsHarvestCraft.ID, "coconutyogurtItem", 1L),
        // "Orange Juice"
        getModItem(PamsHarvestCraft.ID, "orangejuiceItem", 1L),
        // "Orange Chicken"
        getModItem(PamsHarvestCraft.ID, "orangechickenItem", 1L),
        // "Orange Smoothie"
        getModItem(PamsHarvestCraft.ID, "orangesmoothieItem", 1L),
        // "Orange Yogurt"
        getModItem(PamsHarvestCraft.ID, "orangeyogurtItem", 1L),
        // "Peach Juice"
        getModItem(PamsHarvestCraft.ID, "peachjuiceItem", 1L),
        // "Peach Cobbler"
        getModItem(PamsHarvestCraft.ID, "peachcobblerItem", 1L),
        // "Peach Smoothie"
        getModItem(PamsHarvestCraft.ID, "peachsmoothieItem", 1L),
        // "Peach Yogurt"
        getModItem(PamsHarvestCraft.ID, "peachyogurtItem", 1L),
        // "Lime Juice"
        getModItem(PamsHarvestCraft.ID, "limejuiceItem", 1L),
        // "Keylime Pie"
        getModItem(PamsHarvestCraft.ID, "keylimepieItem", 1L),
        // "Lime Smoothie"
        getModItem(PamsHarvestCraft.ID, "limesmoothieItem", 1L),
        // "Lime Yogurt"
        getModItem(PamsHarvestCraft.ID, "limeyogurtItem", 1L),
        // "Mango Juice"
        getModItem(PamsHarvestCraft.ID, "mangojuiceItem", 1L),
        // "Mango Smoothie"
        getModItem(PamsHarvestCraft.ID, "mangosmoothieItem", 1L),
        // "Mango Yogurt"
        getModItem(PamsHarvestCraft.ID, "mangoyogurtItem", 1L),
        // "Pomegranate Juice"
        getModItem(PamsHarvestCraft.ID, "pomegranatejuiceItem", 1L),
        // "Pomegranate Smoothie"
        getModItem(PamsHarvestCraft.ID, "pomegranatesmoothieItem", 1L),
        // "Pomegranate Yogurt"
        getModItem(PamsHarvestCraft.ID, "pomegranateyogurtItem", 1L),
        // "Vanilla Yogurt"
        getModItem(PamsHarvestCraft.ID, "vanillayogurtItem", 1L),
        // "Cinnamon Roll"
        getModItem(PamsHarvestCraft.ID, "cinnamonrollItem", 1L),
        // "French Toast"
        getModItem(PamsHarvestCraft.ID, "frenchtoastItem", 1L),
        // "Marshmellows"
        getModItem(PamsHarvestCraft.ID, "marshmellowsItem", 1L),
        // "Donut"
        getModItem(PamsHarvestCraft.ID, "donutItem", 1L),
        // "Chocolate Donut"
        getModItem(PamsHarvestCraft.ID, "chocolatedonutItem", 1L),
        // "Powdered Donut"
        getModItem(PamsHarvestCraft.ID, "powdereddonutItem", 1L),
        // "Jelly Donut"
        getModItem(PamsHarvestCraft.ID, "jellydonutItem", 1L),
        // "Frosted Donut"
        getModItem(PamsHarvestCraft.ID, "frosteddonutItem", 1L),
        // "Cactus Soup"
        getModItem(PamsHarvestCraft.ID, "cactussoupItem", 1L),
        // "Waffles"
        getModItem(PamsHarvestCraft.ID, "wafflesItem", 1L),
        // "Seed Soup"
        getModItem(PamsHarvestCraft.ID, "seedsoupItem", 1L),
        // "Soft Pretzel"
        getModItem(PamsHarvestCraft.ID, "softpretzelItem", 1L),
        // "Jellybeans"
        getModItem(PamsHarvestCraft.ID, "jellybeansItem", 1L),
        // "Biscuit"
        getModItem(PamsHarvestCraft.ID, "biscuitItem", 1L),
        // "Cream Cookie"
        getModItem(PamsHarvestCraft.ID, "creamcookieItem", 1L),
        // "Jaffa"
        getModItem(PamsHarvestCraft.ID, "jaffaItem", 1L),
        // "Fried Chicken"
        getModItem(PamsHarvestCraft.ID, "friedchickenItem", 1L),
        // "Footlong"
        getModItem(PamsHarvestCraft.ID, "footlongItem", 1L),
        // "Blueberry Yogurt"
        getModItem(PamsHarvestCraft.ID, "blueberryyogurtItem", 1L),
        // "Lemon Yogurt"
        getModItem(PamsHarvestCraft.ID, "lemonyogurtItem", 1L),
        // "Cherry Yogurt"
        getModItem(PamsHarvestCraft.ID, "cherryyogurtItem", 1L),
        // "Strawberry Yogurt"
        getModItem(PamsHarvestCraft.ID, "strawberryyogurtItem", 1L),
        // "Grape Yogurt"
        getModItem(PamsHarvestCraft.ID, "grapeyogurtItem", 1L),
        // "Chocolate Yogurt"
        getModItem(PamsHarvestCraft.ID, "chocolateyogurtItem", 1L),
        // "Blackberry Juice"
        getModItem(PamsHarvestCraft.ID, "blackberryjuiceItem", 1L),
        // "Blackberry Cobbler"
        getModItem(PamsHarvestCraft.ID, "blackberrycobblerItem", 1L),
        // "Blackberry Smoothie"
        getModItem(PamsHarvestCraft.ID, "blackberrysmoothieItem", 1L),
        // "Blackberry Yogurt"
        getModItem(PamsHarvestCraft.ID, "blackberryyogurtItem", 1L),
        // "Chocolate Milk"
        getModItem(PamsHarvestCraft.ID, "chocolatemilkItem", 1L),
        // "Pumpkin Yogurt"
        getModItem(PamsHarvestCraft.ID, "pumpkinyogurtItem", 1L),
        // "Raspberry Juice"
        getModItem(PamsHarvestCraft.ID, "raspberryjuiceItem", 1L),
        // "Raspberry Pie"
        getModItem(PamsHarvestCraft.ID, "raspberrypieItem", 1L),
        // "Raspberry Smoothie"
        getModItem(PamsHarvestCraft.ID, "raspberrysmoothieItem", 1L),
        // "Raspberry Yogurt"
        getModItem(PamsHarvestCraft.ID, "raspberryyogurtItem", 1L),
        // "Cinnamon Sugar Donut"
        getModItem(PamsHarvestCraft.ID, "cinnamonsugardonutItem", 1L),
        // "Melon Yogurt"
        getModItem(PamsHarvestCraft.ID, "melonyogurtItem", 1L),
        // "Kiwi Juice"
        getModItem(PamsHarvestCraft.ID, "kiwijuiceItem", 1L),
        // "Kiwi Smoothie"
        getModItem(PamsHarvestCraft.ID, "kiwismoothieItem", 1L),
        // "Kiwi Yogurt"
        getModItem(PamsHarvestCraft.ID, "kiwiyogurtItem", 1L),
        // "Plain Yogurt"
        getModItem(PamsHarvestCraft.ID, "plainyogurtItem", 1L),
        // "Apple Yogurt"
        getModItem(PamsHarvestCraft.ID, "appleyogurtItem", 1L),
        // "Salted Sunflower Seeds"
        getModItem(PamsHarvestCraft.ID, "saltedsunflowerseedsItem", 1L),
        // "Sunflower Wheat Rolls"
        getModItem(PamsHarvestCraft.ID, "sunflowerwheatrollsItem", 1L),
        // "Sunflower Broccoli Salad"
        getModItem(PamsHarvestCraft.ID, "sunflowerbroccolisaladItem", 1L),
        // "Cranberry Juice"
        getModItem(PamsHarvestCraft.ID, "cranberryjuiceItem", 1L),
        // "Cranberry Sauce"
        getModItem(PamsHarvestCraft.ID, "cranberrysauceItem", 1L),
        // "Cranberry Bar"
        getModItem(PamsHarvestCraft.ID, "cranberrybarItem", 1L),
        // "Peppermint"
        getModItem(PamsHarvestCraft.ID, "peppermintItem", 1L),
        // "Cactus Fruit Juice"
        getModItem(PamsHarvestCraft.ID, "cactusfruitjuiceItem", 1L),
        // "Baklava"
        getModItem(PamsHarvestCraft.ID, "baklavaItem", 1L),
        // "Gummy Bears"
        getModItem(PamsHarvestCraft.ID, "gummybearsItem", 1L),
        // "Bacon Mushroom Burger"
        getModItem(PamsHarvestCraft.ID, "baconmushroomburgerItem", 1L),
        // "Fruit Punch"
        getModItem(PamsHarvestCraft.ID, "fruitpunchItem", 1L),
        // "Meaty Stew"
        getModItem(PamsHarvestCraft.ID, "meatystewItem", 1L),
        // "Mixed Salad"
        getModItem(PamsHarvestCraft.ID, "mixedsaladItem", 1L),
        // "Pinacolada"
        getModItem(PamsHarvestCraft.ID, "pinacoladaItem", 1L),
        // "Shepherd's Pie"
        getModItem(PamsHarvestCraft.ID, "shepardspieItem", 1L),
        // "Egg Nog"
        getModItem(PamsHarvestCraft.ID, "eggnogItem", 1L),
        // "Custard"
        getModItem(PamsHarvestCraft.ID, "custardItem", 1L),
        // "Sushi"
        getModItem(PamsHarvestCraft.ID, "sushiItem", 1L),
        // "Garden Soup"
        getModItem(PamsHarvestCraft.ID, "gardensoupItem", 1L),
        // "Apple Jelly"
        getModItem(PamsHarvestCraft.ID, "applejellyItem", 1L),
        // "Apple Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "applejellysandwichItem", 1L),
        // "Blackberry Jelly"
        getModItem(PamsHarvestCraft.ID, "blackberryjellyItem", 1L),
        // "Blackberry Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "blackberryjellysandwichItem", 1L),
        // "Blueberry Jelly"
        getModItem(PamsHarvestCraft.ID, "blueberryjellyItem", 1L),
        // "Blueberry Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "blueberryjellysandwichItem", 1L),
        // "Cherry Jelly"
        getModItem(PamsHarvestCraft.ID, "cherryjellyItem", 1L),
        // "Cherry Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "cherryjellysandwichItem", 1L),
        // "Cranberry Jelly"
        getModItem(PamsHarvestCraft.ID, "cranberryjellyItem", 1L),
        // "Cranberry Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "cranberryjellysandwichItem", 1L),
        // "Kiwi Jelly"
        getModItem(PamsHarvestCraft.ID, "kiwijellyItem", 1L),
        // "Kiwi Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "kiwijellysandwichItem", 1L),
        // "Lemon Jelly"
        getModItem(PamsHarvestCraft.ID, "lemonjellyItem", 1L),
        // "Lemon Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "lemonjellysandwichItem", 1L),
        // "Lime Jelly"
        getModItem(PamsHarvestCraft.ID, "limejellyItem", 1L),
        // "Lime Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "limejellysandwichItem", 1L),
        // "Mango Jelly"
        getModItem(PamsHarvestCraft.ID, "mangojellyItem", 1L),
        // "Mango Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "mangojellysandwichItem", 1L),
        // "Orange Jelly"
        getModItem(PamsHarvestCraft.ID, "orangejellyItem", 1L),
        // "Orange Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "orangejellysandwichItem", 1L),
        // "Papaya Jelly"
        getModItem(PamsHarvestCraft.ID, "papayajellyItem", 1L),
        // "Papaya Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "papayajellysandwichItem", 1L),
        // "Peach Jelly"
        getModItem(PamsHarvestCraft.ID, "peachjellyItem", 1L),
        // "Peach Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "peachjellysandwichItem", 1L),
        // "Pomegranate Jelly"
        getModItem(PamsHarvestCraft.ID, "pomegranatejellyItem", 1L),
        // "Pomegranate Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "pomegranatejellysandwichItem", 1L),
        // "Raspberry Jelly"
        getModItem(PamsHarvestCraft.ID, "raspberryjellyItem", 1L),
        // "Raspberry Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "raspberryjellysandwichItem", 1L),
        // "Starfruit Jelly"
        getModItem(PamsHarvestCraft.ID, "starfruitjellyItem", 1L),
        // "Starfruit Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "starfruitjellysandwichItem", 1L),
        // "Strawberry Jelly"
        getModItem(PamsHarvestCraft.ID, "strawberryjellyItem", 1L),
        // "Strawberry Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "strawberryjellysandwichItem", 1L),
        // "Watermelon Jelly"
        getModItem(PamsHarvestCraft.ID, "watermelonjellyItem", 1L),
        // "Watermelon Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "watermelonjellysandwichItem", 1L),
        // "Cherry Soda"
        getModItem(PamsHarvestCraft.ID, "cherrysodaItem", 1L),
        // "Cola Soda"
        getModItem(PamsHarvestCraft.ID, "colasodaItem", 1L),
        // "Ginger Ale"
        getModItem(PamsHarvestCraft.ID, "gingersodaItem", 1L),
        // "Grape Soda"
        getModItem(PamsHarvestCraft.ID, "grapesodaItem", 1L),
        // "Lemon-Lime Soda"
        getModItem(PamsHarvestCraft.ID, "lemonlimesodaItem", 1L),
        // "Orange Soda"
        getModItem(PamsHarvestCraft.ID, "orangesodaItem", 1L),
        // "Root Beer"
        getModItem(PamsHarvestCraft.ID, "rootbeersodaItem", 1L),
        // "Strawberry Soda"
        getModItem(PamsHarvestCraft.ID, "strawberrysodaItem", 1L),
        // "Caramel Ice Cream"
        getModItem(PamsHarvestCraft.ID, "caramelicecreamItem", 1L),
        // "Mint Chocolate Chip Ice Cream"
        getModItem(PamsHarvestCraft.ID, "mintchocolatechipicemcreamItem", 1L),
        // "Strawberry Ice Cream"
        getModItem(PamsHarvestCraft.ID, "strawberryicecreamItem", 1L),
        // "Vanilla Ice Cream"
        getModItem(PamsHarvestCraft.ID, "vanillaicecreamItem", 1L),
        // "Ginger Chicken"
        getModItem(PamsHarvestCraft.ID, "gingerchickenItem", 1L),
        // "Old World Veggie Soup"
        getModItem(PamsHarvestCraft.ID, "oldworldveggiesoupItem", 1L),
        // "Spice Bun"
        getModItem(PamsHarvestCraft.ID, "spicebunItem", 1L),
        // "Gingered Rhubarb Tart"
        getModItem(PamsHarvestCraft.ID, "gingeredrhubarbtartItem", 1L),
        // "Lamb Barley Soup"
        getModItem(PamsHarvestCraft.ID, "lambbarleysoupItem", 1L),
        // "Honey Lemon Lamb"
        getModItem(PamsHarvestCraft.ID, "honeylemonlambItem", 1L),
        // "Pumpkin Oat Scones"
        getModItem(PamsHarvestCraft.ID, "pumpkinoatsconesItem", 1L),
        // "Beef Jerky"
        getModItem(PamsHarvestCraft.ID, "beefjerkyItem", 1L),
        // "Plum Juice"
        getModItem(PamsHarvestCraft.ID, "plumjuiceItem", 1L),
        // "Pear Juice"
        getModItem(PamsHarvestCraft.ID, "pearjuiceItem", 1L),
        // "Oven Roasted Cauliflower"
        getModItem(PamsHarvestCraft.ID, "ovenroastedcauliflowerItem", 1L),
        // "Leek Bacon Soup"
        getModItem(PamsHarvestCraft.ID, "leekbaconsoupItem", 1L),
        // "Herb Butter Parsnips"
        getModItem(PamsHarvestCraft.ID, "herbbutterparsnipsItem", 1L),
        // "Scallion Baked Potato"
        getModItem(PamsHarvestCraft.ID, "scallionbakedpotatoItem", 1L),
        // "Soy Milk"
        getModItem(PamsHarvestCraft.ID, "soymilkItem", 1L),
        // "Firm Tofu"
        getModItem(PamsHarvestCraft.ID, "firmtofuItem", 1L),
        // "Silken Tofu"
        getModItem(PamsHarvestCraft.ID, "silkentofuItem", 1L),
        // "Bamboo Steamed Rice"
        getModItem(PamsHarvestCraft.ID, "bamboosteamedriceItem", 1L),
        // "Roasted Chestnut"
        getModItem(PamsHarvestCraft.ID, "roastedchestnutItem", 1L),
        // "Sweet Potato Souffle"
        getModItem(PamsHarvestCraft.ID, "sweetpotatosouffleItem", 1L),
        // "Cashew Chicken"
        getModItem(PamsHarvestCraft.ID, "cashewchickenItem", 1L),
        // "Apricot Juice"
        getModItem(PamsHarvestCraft.ID, "apricotjuiceItem", 1L),
        // "Apricot Yogurt"
        getModItem(PamsHarvestCraft.ID, "apricotyogurtItem", 1L),
        // "Apricot Glazed Pork"
        getModItem(PamsHarvestCraft.ID, "apricotglazedporkItem", 1L),
        // "Apricot Jelly"
        getModItem(PamsHarvestCraft.ID, "apricotjellyItem", 1L),
        // "Apricot Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "apricotjellysandwichItem", 1L),
        // "Apricot Smoothie"
        getModItem(PamsHarvestCraft.ID, "apricotsmoothieItem", 1L),
        // "Fig Bar"
        getModItem(PamsHarvestCraft.ID, "figbarItem", 1L),
        // "Fig Jelly"
        getModItem(PamsHarvestCraft.ID, "figjellyItem", 1L),
        // "Fig Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "figjellysandwichItem", 1L),
        // "Fig Smoothie"
        getModItem(PamsHarvestCraft.ID, "figsmoothieItem", 1L),
        // "Fig Yogurt"
        getModItem(PamsHarvestCraft.ID, "figyogurtItem", 1L),
        // "Fig Juice"
        getModItem(PamsHarvestCraft.ID, "figjuiceItem", 1L),
        // "Grapefruit Juice"
        getModItem(PamsHarvestCraft.ID, "grapefruitjuiceItem", 1L),
        // "Grapefruit Jelly"
        getModItem(PamsHarvestCraft.ID, "grapefruitjellyItem", 1L),
        // "Grapefruit Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "grapefruitjellysandwichItem", 1L),
        // "Grapefruit Smoothie"
        getModItem(PamsHarvestCraft.ID, "grapefruitsmoothieItem", 1L),
        // "Grapefruit Yogurt"
        getModItem(PamsHarvestCraft.ID, "grapefruityogurtItem", 1L),
        // "Grapefruit Soda"
        getModItem(PamsHarvestCraft.ID, "grapefruitsodaItem", 1L),
        // "Citrus Salad"
        getModItem(PamsHarvestCraft.ID, "citrussaladItem", 1L),
        // "Pecan Pie"
        getModItem(PamsHarvestCraft.ID, "pecanpieItem", 1L),
        // "Pralines"
        getModItem(PamsHarvestCraft.ID, "pralinesItem", 1L),
        // "Persimmon Juice"
        getModItem(PamsHarvestCraft.ID, "persimmonjuiceItem", 1L),
        // "Persimmon Yogurt"
        getModItem(PamsHarvestCraft.ID, "persimmonyogurtItem", 1L),
        // "Persimmon Smoothie"
        getModItem(PamsHarvestCraft.ID, "persimmonsmoothieItem", 1L),
        // "Persimmon Jelly"
        getModItem(PamsHarvestCraft.ID, "persimmonjellyItem", 1L),
        // "Persimmon Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "persimmonjellysandwichItem", 1L),
        // "Pistachio Baked Salmon"
        getModItem(PamsHarvestCraft.ID, "pistachiobakedsalmonItem", 1L),
        // "Bacon Wrapped Dates"
        getModItem(PamsHarvestCraft.ID, "baconwrappeddatesItem", 1L),
        // "Date Nut Bread"
        getModItem(PamsHarvestCraft.ID, "datenutbreadItem", 1L),
        // "Maple Syrup Pancakes"
        getModItem(PamsHarvestCraft.ID, "maplesyruppancakesItem", 1L),
        // "Maple Syrup Waffles"
        getModItem(PamsHarvestCraft.ID, "maplesyrupwafflesItem", 1L),
        // "Maple Sausage"
        getModItem(PamsHarvestCraft.ID, "maplesausageItem", 1L),
        // "Maple Oatmeal"
        getModItem(PamsHarvestCraft.ID, "mapleoatmealItem", 1L),
        // "Peaches and Cream Oatmeal"
        getModItem(PamsHarvestCraft.ID, "peachesandcreamoatmealItem", 1L),
        // "Cinnamon Apple Oatmeal"
        getModItem(PamsHarvestCraft.ID, "cinnamonappleoatmealItem", 1L),
        // "Maple Candied Bacon"
        getModItem(PamsHarvestCraft.ID, "maplecandiedbaconItem", 1L),
        // "Toast Sandwich"
        getModItem(PamsHarvestCraft.ID, "toastsandwichItem", 1L),
        // "Potato and Cheese Pirogi"
        getModItem(PamsHarvestCraft.ID, "potatoandcheesepirogiItem", 1L),
        // "Zeppole"
        getModItem(PamsHarvestCraft.ID, "zeppoleItem", 1L),
        // "Sausage in Bread"
        getModItem(PamsHarvestCraft.ID, "sausageinbreadItem", 1L),
        // "Chocolate Caramel Fudge"
        getModItem(PamsHarvestCraft.ID, "chocolatecaramelfudgeItem", 1L),
        // "Lavender Shortbread"
        getModItem(PamsHarvestCraft.ID, "lavendershortbreadItem", 1L),
        // "Beef Wellington"
        getModItem(PamsHarvestCraft.ID, "beefwellingtonItem", 1L),
        // "Epic Bacon"
        getModItem(PamsHarvestCraft.ID, "epicbaconItem", 1L),
        // "Manjuu"
        getModItem(PamsHarvestCraft.ID, "manjuuItem", 1L),
        // "Chicken Gumbo"
        getModItem(PamsHarvestCraft.ID, "chickengumboItem", 1L),
        // "General Tso's Chicken"
        getModItem(PamsHarvestCraft.ID, "generaltsochickenItem", 1L),
        // "California Roll"
        getModItem(PamsHarvestCraft.ID, "californiarollItem", 1L),
        // "Futo Maki"
        getModItem(PamsHarvestCraft.ID, "futomakiItem", 1L),
        // "Beans on Toast"
        getModItem(PamsHarvestCraft.ID, "beansontoastItem", 1L),
        // "Vegemite"
        getModItem(PamsHarvestCraft.ID, "vegemiteItem", 1L),
        // "Honeycomb Chocolate Bar"
        getModItem(PamsHarvestCraft.ID, "honeycombchocolatebarItem", 1L),
        // "Cherry Coconut Chocolate Bar"
        getModItem(PamsHarvestCraft.ID, "cherrycoconutchocolatebarItem", 1L),
        // "Fairy Bread"
        getModItem(PamsHarvestCraft.ID, "fairybreadItem", 1L),
        // "Tim Tam"
        getModItem(PamsHarvestCraft.ID, "timtamItem", 1L),
        // "Meat Pie"
        getModItem(PamsHarvestCraft.ID, "meatpieItem", 1L),
        // "Chiko Roll"
        getModItem(PamsHarvestCraft.ID, "chikorollItem", 1L),
        // "Damper"
        getModItem(PamsHarvestCraft.ID, "damperItem", 1L),
        // "Beet Burger"
        getModItem(PamsHarvestCraft.ID, "beetburgerItem", 1L),
        // "Gherkin"
        getModItem(PamsHarvestCraft.ID, "gherkinItem", 1L),
        // "McPam"
        getModItem(PamsHarvestCraft.ID, "mcpamItem", 1L),
        // "Ceasar Salad"
        getModItem(PamsHarvestCraft.ID, "ceasarsaladItem", 1L),
        // "Chaos Cookie"
        getModItem(PamsHarvestCraft.ID, "chaoscookieItem", 1L),
        // "Chocolate Bacon"
        getModItem(PamsHarvestCraft.ID, "chocolatebaconItem", 1L),
        // "Lamb Kebab"
        getModItem(PamsHarvestCraft.ID, "lambkebabItem", 1L),
        // "Nutella"
        getModItem(PamsHarvestCraft.ID, "nutellaItem", 1L),
        // "Snickers Bar"
        getModItem(PamsHarvestCraft.ID, "snickersbarItem", 1L),
        // "Spinach Pie"
        getModItem(PamsHarvestCraft.ID, "spinachpieItem", 1L),
        // "Steamed Spinach"
        getModItem(PamsHarvestCraft.ID, "steamedspinachItem", 1L),
        // "Vegemite on Toast"
        getModItem(PamsHarvestCraft.ID, "vegemiteontoastItem", 1L),
        // "Raw Anchovy"
        getModItem(PamsHarvestCraft.ID, "anchovyrawItem", 1L),
        // "Raw Bass"
        getModItem(PamsHarvestCraft.ID, "bassrawItem", 1L),
        // "Raw Carp"
        getModItem(PamsHarvestCraft.ID, "carprawItem", 1L),
        // "Raw Catfish"
        getModItem(PamsHarvestCraft.ID, "catfishrawItem", 1L),
        // "Raw Charr"
        getModItem(PamsHarvestCraft.ID, "charrrawItem", 1L),
        // "Raw Clam"
        getModItem(PamsHarvestCraft.ID, "clamrawItem", 1L),
        // "Raw Crab"
        getModItem(PamsHarvestCraft.ID, "crabrawItem", 1L),
        // "Raw Crayfish"
        getModItem(PamsHarvestCraft.ID, "crayfishrawItem", 1L),
        // "Raw Eel"
        getModItem(PamsHarvestCraft.ID, "eelrawItem", 1L),
        // "Raw Frog"
        getModItem(PamsHarvestCraft.ID, "frograwItem", 1L),
        // "Raw Grouper"
        getModItem(PamsHarvestCraft.ID, "grouperrawItem", 1L),
        // "Raw Herring"
        getModItem(PamsHarvestCraft.ID, "herringrawItem", 1L),
        // "Raw Jellyfish"
        getModItem(PamsHarvestCraft.ID, "jellyfishrawItem", 1L),
        // "Raw Mudfish"
        getModItem(PamsHarvestCraft.ID, "mudfishrawItem", 1L),
        // "Raw Octopus"
        getModItem(PamsHarvestCraft.ID, "octopusrawItem", 1L),
        // "Raw Perch"
        getModItem(PamsHarvestCraft.ID, "perchrawItem", 1L),
        // "Raw Scallop"
        getModItem(PamsHarvestCraft.ID, "scalloprawItem", 1L),
        // "Raw Shrimp"
        getModItem(PamsHarvestCraft.ID, "shrimprawItem", 1L),
        // "Raw Snail"
        getModItem(PamsHarvestCraft.ID, "snailrawItem", 1L),
        // "Raw Snapper"
        getModItem(PamsHarvestCraft.ID, "snapperrawItem", 1L),
        // "Raw Tilapia"
        getModItem(PamsHarvestCraft.ID, "tilapiarawItem", 1L),
        // "Raw Trout"
        getModItem(PamsHarvestCraft.ID, "troutrawItem", 1L),
        // "Raw Tuna"
        getModItem(PamsHarvestCraft.ID, "tunarawItem", 1L),
        // "Raw Turtle"
        getModItem(PamsHarvestCraft.ID, "turtlerawItem", 1L),
        // "Raw Walleye"
        getModItem(PamsHarvestCraft.ID, "walleyerawItem", 1L),
        // "Cooked Clam"
        getModItem(PamsHarvestCraft.ID, "clamcookedItem", 1L),
        // "Cooked Crab"
        getModItem(PamsHarvestCraft.ID, "crabcookedItem", 1L),
        // "Cooked Crayfish"
        getModItem(PamsHarvestCraft.ID, "crayfishcookedItem", 1L),
        // "Cooked Frog Legs"
        getModItem(PamsHarvestCraft.ID, "frogcookedItem", 1L),
        // "Cooked Octopus"
        getModItem(PamsHarvestCraft.ID, "octopuscookedItem", 1L),
        // "Cooked Scallop"
        getModItem(PamsHarvestCraft.ID, "scallopcookedItem", 1L),
        // "Cooked Shrimp"
        getModItem(PamsHarvestCraft.ID, "shrimpcookedItem", 1L),
        // "Cooked Snail"
        getModItem(PamsHarvestCraft.ID, "snailcookedItem", 1L),
        // "Cooked Turtle"
        getModItem(PamsHarvestCraft.ID, "turtlecookedItem", 1L),
        // "Apple Cider"
        getModItem(PamsHarvestCraft.ID, "appleciderItem", 1L),
        // "Bangers and Mash"
        getModItem(PamsHarvestCraft.ID, "bangersandmashItem", 1L),
        // "Battered Sausage"
        getModItem(PamsHarvestCraft.ID, "batteredsausageItem", 1L),
        // "Chorizo"
        getModItem(PamsHarvestCraft.ID, "chorizoItem", 1L),
        // "Coleslaw"
        getModItem(PamsHarvestCraft.ID, "coleslawItem", 1L),
        // "Energy Drink"
        getModItem(PamsHarvestCraft.ID, "energydrinkItem", 1L),
        // "Fried Onions"
        getModItem(PamsHarvestCraft.ID, "friedonionsItem", 1L),
        // "Meat Feast Pizza"
        getModItem(PamsHarvestCraft.ID, "meatfeastpizzaItem", 1L),
        // "Mince Pie"
        getModItem(PamsHarvestCraft.ID, "mincepieItem", 1L),
        // "Onion Hamburger"
        getModItem(PamsHarvestCraft.ID, "onionhamburgerItem", 1L),
        // "Pepperoni"
        getModItem(PamsHarvestCraft.ID, "pepperoniItem", 1L),
        // "Pickled Onions"
        getModItem(PamsHarvestCraft.ID, "pickledonionsItem", 1L),
        // "Pork Sausage"
        getModItem(PamsHarvestCraft.ID, "porksausageItem", 1L),
        // "Raspberry Trifle"
        getModItem(PamsHarvestCraft.ID, "raspberrytrifleItem", 1L),
        // "Pumpkin Muffin"
        getModItem(PamsHarvestCraft.ID, "pumpkinmuffinItem", 1L),
        // "Suadero"
        getModItem(PamsHarvestCraft.ID, "suaderoItem", 1L),
        // "Random Taco"
        getModItem(PamsHarvestCraft.ID, "randomtacoItem", 1L),
        // "Raw Turkey"
        getModItem(PamsHarvestCraft.ID, "turkeyrawItem", 1L),
        // "Cooked Turkey"
        getModItem(PamsHarvestCraft.ID, "turkeycookedItem", 1L),
        // "Raw Rabbit"
        getModItem(PamsHarvestCraft.ID, "rabbitrawItem", 1L),
        // "Cooked Rabbit"
        getModItem(PamsHarvestCraft.ID, "rabbitcookedItem", 1L),
        // "Raw Venison"
        getModItem(PamsHarvestCraft.ID, "venisonrawItem", 1L),
        // "Cooked Venison"
        getModItem(PamsHarvestCraft.ID, "venisoncookedItem", 1L),
        // "Strawberry Milkshake"
        getModItem(PamsHarvestCraft.ID, "strawberrymilkshakeItem", 1L),
        // "Chocolate Milkshake"
        getModItem(PamsHarvestCraft.ID, "chocolatemilkshakeItem", 1L),
        // "Banana Milkshake"
        getModItem(PamsHarvestCraft.ID, "bananamilkshakeItem", 1L),
        // "Cornflakes"
        getModItem(PamsHarvestCraft.ID, "cornflakesItem", 1L),
        // "Coleslaw Burger"
        getModItem(PamsHarvestCraft.ID, "coleslawburgerItem", 1L),
        // "Roast Chicken"
        getModItem(PamsHarvestCraft.ID, "roastchickenItem", 1L),
        // "Roast Potatoes"
        getModItem(PamsHarvestCraft.ID, "roastpotatoesItem", 1L),
        // "Sunday Roast"
        getModItem(PamsHarvestCraft.ID, "sundayroastItem", 1L),
        // "BBQ Pulled Pork"
        getModItem(PamsHarvestCraft.ID, "bbqpulledporkItem", 1L),
        // "Lamb with Mint Sauce"
        getModItem(PamsHarvestCraft.ID, "lambwithmintsauceItem", 1L),
        // "Steak and Chips"
        getModItem(PamsHarvestCraft.ID, "steakandchipsItem", 1L),
        // "Cherry Ice Cream"
        getModItem(PamsHarvestCraft.ID, "cherryicecreamItem", 1L),
        // "Pistachio Ice Cream"
        getModItem(PamsHarvestCraft.ID, "pistachioicecreamItem", 1L),
        // "Neapolitan Ice Cream"
        getModItem(PamsHarvestCraft.ID, "neapolitanicecreamItem", 1L),
        // "Spumoni Ice Cream"
        getModItem(PamsHarvestCraft.ID, "spumoniicecreamItem", 1L),
        // "Almond Butter"
        getModItem(PamsHarvestCraft.ID, "almondbutterItem", 1L),
        // "Cashew Butter"
        getModItem(PamsHarvestCraft.ID, "cashewbutterItem", 1L),
        // "Chestnut Butter"
        getModItem(PamsHarvestCraft.ID, "chestnutbutterItem", 1L),
        // "Cornish Pasty"
        getModItem(PamsHarvestCraft.ID, "cornishpastyItem", 1L),
        // "Cottage Pie"
        getModItem(PamsHarvestCraft.ID, "cottagepieItem", 1L),
        // "Croissant"
        getModItem(PamsHarvestCraft.ID, "croissantItem", 1L),
        // "Dim Sum"
        getModItem(PamsHarvestCraft.ID, "dimsumItem", 1L),
        // "Fried Pecan Okra"
        getModItem(PamsHarvestCraft.ID, "friedpecanokraItem", 1L),
        // "Gooseberry Jelly"
        getModItem(PamsHarvestCraft.ID, "gooseberryjellyItem", 1L),
        // "Gooseberry Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "gooseberryjellysandwichItem", 1L),
        // "Gooseberry Milkshake"
        getModItem(PamsHarvestCraft.ID, "gooseberrymilkshakeItem", 1L),
        // "Gooseberry Pie"
        getModItem(PamsHarvestCraft.ID, "gooseberrypieItem", 1L),
        // "Gooseberry Smoothie"
        getModItem(PamsHarvestCraft.ID, "gooseberrysmoothieItem", 1L),
        // "Gooseberry Yogurt"
        getModItem(PamsHarvestCraft.ID, "gooseberryyogurtItem", 1L),
        // "Green Heart Fish"
        getModItem(PamsHarvestCraft.ID, "greenheartfishItem", 1L),
        // "Ham & Sweet Pickle Sandwich"
        getModItem(PamsHarvestCraft.ID, "hamsweetpicklesandwichItem", 1L),
        // "Hushpuppies"
        getModItem(PamsHarvestCraft.ID, "hushpuppiesItem", 1L),
        // "Kimchi"
        getModItem(PamsHarvestCraft.ID, "kimchiItem", 1L),
        // "Mochi"
        getModItem(PamsHarvestCraft.ID, "mochiItem", 1L),
        // "Museli"
        getModItem(PamsHarvestCraft.ID, "museliItem", 1L),
        // "Naan"
        getModItem(PamsHarvestCraft.ID, "naanItem", 1L),
        // "Okra Chips"
        getModItem(PamsHarvestCraft.ID, "okrachipsItem", 1L),
        // "Okra Creole"
        getModItem(PamsHarvestCraft.ID, "okracreoleItem", 1L),
        // "Pistachio Butter"
        getModItem(PamsHarvestCraft.ID, "pistachiobutterItem", 1L),
        // "Ploughman's Lunch"
        getModItem(PamsHarvestCraft.ID, "ploughmanslunchItem", 1L),
        // "Pork Lo Mein"
        getModItem(PamsHarvestCraft.ID, "porklomeinItem", 1L),
        // "Salmon Patties"
        getModItem(PamsHarvestCraft.ID, "salmonpattiesItem", 1L),
        // "Sausage"
        getModItem(PamsHarvestCraft.ID, "sausageItem", 1L),
        // "Sausage Roll"
        getModItem(PamsHarvestCraft.ID, "sausagerollItem", 1L),
        // "Sesame Ball"
        getModItem(PamsHarvestCraft.ID, "sesameballItem", 1L),
        // "Sesame Snaps"
        getModItem(PamsHarvestCraft.ID, "sesamesnapsItem", 1L),
        // "Shrimp Pork Okra Hushpuppies"
        getModItem(PamsHarvestCraft.ID, "shrimpokrahushpuppiesItem", 1L),
        // "Sweet Pickle"
        getModItem(PamsHarvestCraft.ID, "sweetpickleItem", 1L),
        // "Veggie Strips"
        getModItem(PamsHarvestCraft.ID, "veggiestripsItem", 1L),
        // "Vindaloo"
        getModItem(PamsHarvestCraft.ID, "vindalooItem", 1L),
        // "Apple Smoothie"
        getModItem(PamsHarvestCraft.ID, "applesmoothieItem", 1L),
        // "Coconut Smoothie"
        getModItem(PamsHarvestCraft.ID, "coconutsmoothieItem", 1L),
        // "Cranberry Smoothie"
        getModItem(PamsHarvestCraft.ID, "cranberrysmoothieItem", 1L),
        // "Cranberry Yogurt"
        getModItem(PamsHarvestCraft.ID, "cranberryyogurtItem", 1L),
        // "Grape Smoothie"
        getModItem(PamsHarvestCraft.ID, "grapesmoothieItem", 1L),
        // "Pear Smoothie"
        getModItem(PamsHarvestCraft.ID, "pearsmoothieItem", 1L),
        // "Pear Jelly"
        getModItem(PamsHarvestCraft.ID, "pearjellyItem", 1L),
        // "Pear Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "pearjellysandwichItem", 1L),
        // "Plum Smoothie"
        getModItem(PamsHarvestCraft.ID, "plumsmoothieItem", 1L),
        // "Plum Jelly"
        getModItem(PamsHarvestCraft.ID, "plumjellyItem", 1L),
        // "Plum Jelly Sandwich"
        getModItem(PamsHarvestCraft.ID, "plumjellysandwichItem", 1L),
        // "Honey Sandwich"
        getModItem(PamsHarvestCraft.ID, "honeysandwichItem", 1L),
        // "Cheese on Toast"
        getModItem(PamsHarvestCraft.ID, "cheeseontoastItem", 1L),
        // "Tuna Potato"
        getModItem(PamsHarvestCraft.ID, "tunapotatoItem", 1L),
        // "Chocolate Roll"
        getModItem(PamsHarvestCraft.ID, "chocolaterollItem", 1L),
        // "Jam Roll"
        getModItem(PamsHarvestCraft.ID, "jamrollItem", 1L),
        // "Coconut Cream"
        getModItem(PamsHarvestCraft.ID, "coconutcreamItem", 1L),
        // "Cracker"
        getModItem(PamsHarvestCraft.ID, "crackerItem", 1L),
        // "Paneer"
        getModItem(PamsHarvestCraft.ID, "paneerItem", 1L),
        // "Deluxe Chicken Curry"
        getModItem(PamsHarvestCraft.ID, "deluxechickencurryItem", 1L),
        // "Gravy"
        getModItem(PamsHarvestCraft.ID, "gravyItem", 1L),
        // "Mango Chutney"
        getModItem(PamsHarvestCraft.ID, "mangochutneyItem", 1L),
        // "Marzipan"
        getModItem(PamsHarvestCraft.ID, "marzipanItem", 1L),
        // "Paneer Tikka Masala"
        getModItem(PamsHarvestCraft.ID, "paneertikkamasalaItem", 1L),
        // "Pea and Ham Soup"
        getModItem(PamsHarvestCraft.ID, "peaandhamsoupItem", 1L),
        // "Potato and Leek Soup"
        getModItem(PamsHarvestCraft.ID, "potatoandleeksoupItem", 1L),
        // "Yorkshire Pudding"
        getModItem(PamsHarvestCraft.ID, "yorkshirepuddingItem", 1L),
        // "Toad in the Hole"
        getModItem(PamsHarvestCraft.ID, "toadintheholeItem", 1L),
        // "Banana Juice"
        getModItem(PamsHarvestCraft.ID, "bananajuiceItem", 1L),
        // "Gooseberry Juice"
        getModItem(PamsHarvestCraft.ID, "gooseberryjuiceItem", 1L) };

    // PamsHarvestTheNether
    public static final ItemStack[] PamsHarvestTheNether_Food = new ItemStack[] {
        // "Ignis Fruit"
        getModItem(PamsHarvestTheNether.ID, "ignisfruitItem", 1L),
        // "Blood Leaf"
        getModItem(PamsHarvestTheNether.ID, "bloodleafItem", 1L),
        // "Flesh Root"
        getModItem(PamsHarvestTheNether.ID, "fleshrootItem", 1L),
        // "Marrow Berry"
        getModItem(PamsHarvestTheNether.ID, "marrowberryItem", 1L) };

    // GTPlusPlus
    public static final ItemStack[] GTPlusPlus_Food = new ItemStack[] {
        // "Raw Human Meat"
        getModItem(GTPlusPlus.ID, "item.BasicMetaFood", 1L, 0),
        // "Cooked Human Meat"
        getModItem(GTPlusPlus.ID, "item.BasicMetaFood", 1L, 1),
        // "Raw Horse Meat"
        getModItem(GTPlusPlus.ID, "item.BasicMetaFood", 1L, 2),
        // "Cooked Horse Meat"
        getModItem(GTPlusPlus.ID, "item.BasicMetaFood", 1L, 3),
        // "Raw Wolf Meat"
        getModItem(GTPlusPlus.ID, "item.BasicMetaFood", 1L, 4),
        // "Cooked Wolf Meat"
        getModItem(GTPlusPlus.ID, "item.BasicMetaFood", 1L, 5),
        // "Raw Ocelot Meat"
        getModItem(GTPlusPlus.ID, "item.BasicMetaFood", 1L, 6),
        // "Cooked Ocelot Meat"
        getModItem(GTPlusPlus.ID, "item.BasicMetaFood", 1L, 7),
        // "Blaze Flesh"
        getModItem(GTPlusPlus.ID, "item.BasicMetaFood", 1L, 8) };

    // Witchery
    public static final ItemStack[] Witchery_Food = new ItemStack[] {
        // "Meaty Stew"
        getModItem(Witchery.ID, "stew", 1L),
        // "Raw Meaty Stew"
        getModItem(Witchery.ID, "stewraw", 1L) };
}
