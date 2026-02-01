package Recipes.OriginGeneratorRecipes;

import static gregtech.api.enums.Mods.BloodMagic;
import static gregtech.api.enums.Mods.ForbiddenMagic;
import static gregtech.api.enums.Mods.GalacticraftMars;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.MagicBees;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.Mods.TaintedMagic;
import static gregtech.api.enums.Mods.Thaumcraft;
import static gregtech.api.enums.Mods.ThaumicTinkerer;
import static gregtech.api.enums.Mods.TwilightForest;
import static gregtech.api.enums.Mods.Witchery;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import net.minecraft.item.ItemStack;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.ItemFuelOfGeneratorFrontend;

public class OriginGeneratorRecipes_Magic {

    public static final RecipeMap<RecipeMapBackend> GeneratorRecipes_Magic = RecipeMapBuilder
        .of("Origin of Generator with Magic")
        .maxIO(2, 1, 0, 1)
        .minInputs(2, 0)
        .neiHandlerInfo(builder -> builder.setHeight(128))
        .frontend(ItemFuelOfGeneratorFrontend::new)
        .build();

    private static final String[] FuelBaseline = new String[] {
        // "Chipped Amber"
        "1,000",
        // "Amber Dust"
        "3,000",
        // "Amber Plate"
        "3,000",
        // "Flawed Amber"
        "3,000",
        // "Magic Tallow"
        "4,000",
        // Amber_Thaumcraft
        "6,000",
        // "Magic Wax"
        "6,000",
        // "Amnesic Wax"
        "6,000",
        // "Ironwood Ingot"
        "8,000",
        // "Ironwood Dust"
        "8,000",
        // "Ironwood Plate"
        "8,000",
        // "Bottle o' Enchanting"
        "10,000",
        // "Endereye Dust"
        "10,000",
        // "Flawless Amber"
        "12,000",
        // "Liveroot Dust"
        "16,000",
        // "Eye of Ender"
        "20,000",
        // "Knightmetal Ingot"
        "24,000",
        // Steeleaf
        "24,000",
        // "Exquisite Amber"
        "24,000",
        // "Steeleaf Plate"
        "24,000",
        // "Steeleaf Dust"
        "24,000",
        // "Knightmetal Plate"
        "24,000",
        // "Knightmetal Dust"
        "24,000",
        // Liveroots
        "32,000",
        // "Vinteum Dust"
        "32,000",
        // "Vinteum Plate"
        "32,000",
        // "Vinteum Ingot"
        "32,000",
        // "Ghast Tear"
        "50,000",
        // Vinteum
        "64,000",
        // Quicksilver
        "64,000",
        // "Terra Crystal Plate"
        "160,000",
        // "Terra Crystal Powder"
        "160,000",
        // "Aer Crystal Plate"
        "160,000",
        // "Aer Crystal Powder"
        "160,000",
        // "Aqua Crystal Plate"
        "160,000",
        // "Aqua Crystal Powder"
        "160,000",
        // "Ordo Crystal Plate"
        "240,000",
        // "Ordo Crystal Powder"
        "240,000",
        // "Ignis Crystal Plate"
        "320,000",
        // "Ignis Crystal Powder"
        "320,000",
        // "Perditio Crystal Plate"
        "320,000",
        // "Perditio Crystal Powder"
        "320,000",
        // "Air Shard"
        "320,000",
        // "Water Shard"
        "320,000",
        // "Earth Shard"
        "320,000",
        // "Order Shard"
        "480,000",
        // "Entropy Shard"
        "640,000",
        // "Fire Shard"
        "640,000",
        // "Balanced Shard"
        "720,000",
        // "Gluttony Shard"
        "720,000",
        // "Tainted Blood Shard"
        "720,000",
        // "Wrath Shard"
        "720,000",
        // "Envy Shard"
        "720,000",
        // "Taint Shard"
        "720,000",
        // "Pride Shard"
        "720,000",
        // "Lust Shard"
        "720,000",
        // "Sloth Shard"
        "720,000",
        // "Greed Shard"
        "720,000",
        // "Warped Shard"
        "720,000",
        // "Fluxed Shard"
        "720,000",
        // "Shard of Creation"
        "720,000",
        // "Nether Shard"
        "720,000",
        // "Ender Shard"
        "720,000",
        // "Void Dust"
        "1,500,000",
        // "Void Metal Ingot"
        "1,500,000",
        // "Void Plate"
        "1,500,000",
        // "Fiery Blood"
        "2,048,000",
        // "Fiery Tears"
        "2,048,000",
        // "Fiery Steel Dust"
        "2,048,000",
        // "Fiery Steel Plate"
        "2,048,000",
        // "Fiery Ingot"
        "2,048,000",
        // "Golden Apple"
        "6,400,000",
        // "Nether Star Dust"
        "50,000,000",
        // "Nether Star Plate"
        "50,000,000",
        // Beacon
        "100,000,000",
        // "Nether Star"
        "100,000,000",
        // "Ichorium Dust"
        "250,000,000",
        // "Ichorium Ingot"
        "250,000,000",
        // "Ichorium Plate"
        "250,000,000",
        // "Infinity Catalyst Plate"
        "500,000,000",
        // "Infinity Catalyst Dust"
        "500,000,000",
        // "Infinity Catalyst Ingot"
        "500,000,000",
        // "Infinity Nugget"
        "2,147,483,647",
        // "Tiny Pile of Infinity Dust"
        "2,147,483,647" };

    private static final int[] FuelCalorificValue = new int[] {
        // "Chipped Amber"
        1_000,
        // "Amber Dust"
        3_000,
        // "Amber Plate"
        3_000,
        // "Flawed Amber"
        3_000,
        // "Magic Tallow"
        4_000,
        // Amber_Thaumcraft
        6_000,
        // "Magic Wax"
        6_000,
        // "Amnesic Wax"
        6_000,
        // "Ironwood Ingot"
        8_000,
        // "Ironwood Dust"
        8_000,
        // "Ironwood Plate"
        8_000,
        // "Bottle o' Enchanting"
        10_000,
        // "Endereye Dust"
        10_000,
        // "Flawless Amber"
        12_000,
        // "Liveroot Dust"
        16_000,
        // "Eye of Ender"
        20_000,
        // "Knightmetal Ingot"
        24_000,
        // Steeleaf
        24_000,
        // "Exquisite Amber"
        24_000,
        // "Steeleaf Plate"
        24_000,
        // "Steeleaf Dust"
        24_000,
        // "Knightmetal Plate"
        24_000,
        // "Knightmetal Dust"
        24_000,
        // Liveroots
        32_000,
        // "Vinteum Dust"
        32_000,
        // "Vinteum Plate"
        32_000,
        // "Vinteum Ingot"
        32_000,
        // "Ghast Tear"
        50_000,
        // Vinteum
        64_000,
        // Quicksilver
        64_000,
        // "Terra Crystal Plate"
        160_000,
        // "Terra Crystal Powder"
        160_000,
        // "Aer Crystal Plate"
        160_000,
        // "Aer Crystal Powder"
        160_000,
        // "Aqua Crystal Plate"
        160_000,
        // "Aqua Crystal Powder"
        160_000,
        // "Ordo Crystal Plate"
        240_000,
        // "Ordo Crystal Powder"
        240_000,
        // "Ignis Crystal Plate"
        320_000,
        // "Ignis Crystal Powder"
        320_000,
        // "Perditio Crystal Plate"
        320_000,
        // "Perditio Crystal Powder"
        320_000,
        // "Air Shard"
        320_000,
        // "Water Shard"
        320_000,
        // "Earth Shard"
        320_000,
        // "Order Shard"
        480_000,
        // "Entropy Shard"
        640_000,
        // "Fire Shard"
        640_000,
        // "Balanced Shard"
        720_000,
        // "Gluttony Shard"
        720_000,
        // "Tainted Blood Shard"
        720_000,
        // "Wrath Shard"
        720_000,
        // "Envy Shard"
        720_000,
        // "Taint Shard"
        720_000,
        // "Pride Shard"
        720_000,
        // "Lust Shard"
        720_000,
        // "Sloth Shard"
        720_000,
        // "Greed Shard"
        720_000,
        // "Warped Shard"
        720_000,
        // "Fluxed Shard"
        720_000,
        // "Shard of Creation"
        720_000,
        // "Nether Shard"
        720_000,
        // "Ender Shard"
        720_000,
        // "Void Dust"
        1_500_000,
        // "Void Metal Ingot"
        1_500_000,
        // "Void Plate"
        1_500_000,
        // "Fiery Blood"
        2_048_000,
        // "Fiery Tears"
        2_048_000,
        // "Fiery Steel Dust"
        2_048_000,
        // "Fiery Steel Plate"
        2_048_000,
        // "Fiery Ingot"
        2_048_000,
        // "Golden Apple"
        6_400_000,
        // "Nether Star Dust"
        50_000_000,
        // "Nether Star Plate"
        50_000_000,
        // Beacon
        100_000_000,
        // "Nether Star"
        100_000_000,
        // "Ichorium Dust"
        250_000_000,
        // "Ichorium Ingot"
        250_000_000,
        // "Ichorium Plate"
        250_000_000,
        // "Infinity Catalyst Plate"
        500_000_000,
        // "Infinity Catalyst Dust"
        500_000_000,
        // "Infinity Catalyst Ingot"
        500_000_000,
        // "Infinity Nugget"
        Integer.MAX_VALUE,
        // "Tiny Pile of Infinity Dust"
        Integer.MAX_VALUE };

    private static final ItemStack[] Fuel = new ItemStack[] {
        // "Chipped Amber"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27514),
        // "Amber Dust"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2514),
        // "Amber Plate"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17514),
        // "Flawed Amber"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28514),
        // "Magic Tallow"
        getModItem(Thaumcraft.ID, "ItemResource", 1L, 4),
        // Amber_Thaumcraft
        getModItem(Thaumcraft.ID, "ItemResource", 1L, 6),
        // "Magic Wax"
        getModItem(MagicBees.ID, "wax", 1L, 0),
        // "Amnesic Wax"
        getModItem(MagicBees.ID, "wax", 1L, 2),
        // "Ironwood Ingot"
        getModItem(TwilightForest.ID, "item.ironwoodIngot", 1L),
        // "Ironwood Dust"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2338),
        // "Ironwood Plate"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17338),
        // "Bottle o' Enchanting"
        getModItem(Minecraft.ID, "experience_bottle", 1L),
        // "Endereye Dust"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2533),
        // "Flawless Amber"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29514),
        // "Liveroot Dust"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2832),
        // "Eye of Ender"
        getModItem(Minecraft.ID, "ender_eye", 1L),
        // "Knightmetal Ingot"
        getModItem(TwilightForest.ID, "item.knightMetal", 1L),
        // Steeleaf
        getModItem(TwilightForest.ID, "item.steeleafIngot", 1L),
        // "Exquisite Amber"
        getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30514),
        // "Steeleaf Plate"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17339),
        // "Steeleaf Dust"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2339),
        // "Knightmetal Plate"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17362),
        // "Knightmetal Dust"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2362),
        // Liveroots
        getModItem(TwilightForest.ID, "tile.TFRoots", 1L, 1),
        // "Vinteum Dust"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2529),
        // "Vinteum Plate"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17529),
        // "Vinteum Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11529),
        // "Ghast Tear"
        getModItem(Minecraft.ID, "ghast_tear", 1L),
        // Vinteum
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8529),
        // Quicksilver
        getModItem(Thaumcraft.ID, "ItemResource", 1L, 3),
        // "Terra Crystal Plate"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17542),
        // "Terra Crystal Powder"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2542),
        // "Aer Crystal Plate"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17540),
        // "Aer Crystal Powder"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2540),
        // "Aqua Crystal Plate"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17543),
        // "Aqua Crystal Powder"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2543),
        // "Ordo Crystal Plate"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17545),
        // "Ordo Crystal Powder"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2545),
        // "Ignis Crystal Plate"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17541),
        // "Ignis Crystal Powder"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2541),
        // "Perditio Crystal Plate"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17544),
        // "Perditio Crystal Powder"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2544),
        // "Air Shard"
        getModItem(Thaumcraft.ID, "ItemShard", 1L, 0),
        // "Water Shard"
        getModItem(Thaumcraft.ID, "ItemShard", 1L, 2),
        // "Earth Shard"
        getModItem(Thaumcraft.ID, "ItemShard", 1L, 3),
        // "Order Shard"
        getModItem(Thaumcraft.ID, "ItemShard", 1L, 4),
        // "Entropy Shard"
        getModItem(Thaumcraft.ID, "ItemShard", 1L, 5),
        // "Fire Shard"
        getModItem(Thaumcraft.ID, "ItemShard", 1L, 1),
        // "Balanced Shard"
        getModItem(Thaumcraft.ID, "ItemShard", 1L, 6),
        // "Gluttony Shard"
        getModItem(ForbiddenMagic.ID, "GluttonyShard", 1L),
        // "Tainted Blood Shard"
        getModItem(ForbiddenMagic.ID, "FMResource", 1L, 3),
        // "Wrath Shard"
        getModItem(ForbiddenMagic.ID, "NetherShard", 1L, 0),
        // "Envy Shard"
        getModItem(ForbiddenMagic.ID, "NetherShard", 1L, 1),
        // "Taint Shard"
        getModItem(ForbiddenMagic.ID, "NetherShard", 1L, 2),
        // "Pride Shard"
        getModItem(ForbiddenMagic.ID, "NetherShard", 1L, 3),
        // "Lust Shard"
        getModItem(ForbiddenMagic.ID, "NetherShard", 1L, 4),
        // "Sloth Shard"
        getModItem(ForbiddenMagic.ID, "NetherShard", 1L, 5),
        // "Greed Shard"
        getModItem(ForbiddenMagic.ID, "NetherShard", 1L, 6),
        // "Warped Shard"
        getModItem(TaintedMagic.ID, "ItemMaterial", 1L, 3),
        // "Fluxed Shard"
        getModItem(TaintedMagic.ID, "ItemMaterial", 1L, 4),
        // "Shard of Creation"
        getModItem(TaintedMagic.ID, "ItemMaterial", 1L, 5),
        // "Nether Shard"
        getModItem(ThaumicTinkerer.ID, "kamiResource", 1L, 6),
        // "Ender Shard"
        getModItem(ThaumicTinkerer.ID, "kamiResource", 1L, 7),
        // "Void Dust"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2970),
        // "Void Metal Ingot"
        getModItem(Thaumcraft.ID, "ItemResource", 1L, 16),
        // "Void Plate"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17970),
        // "Fiery Blood"
        getModItem(TwilightForest.ID, "item.fieryBlood", 1L),
        // "Fiery Tears"
        getModItem(TwilightForest.ID, "item.fieryTears", 1L),
        // "Fiery Steel Dust"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2346),
        // "Fiery Steel Plate"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17346),
        // "Fiery Ingot"
        getModItem(TwilightForest.ID, "item.fieryIngot", 1L),
        // "Golden Apple"
        getModItem(Minecraft.ID, "golden_apple", 1L, 1),
        // "Nether Star Dust"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2506),
        // "Nether Star Plate"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17506),
        // Beacon
        getModItem(Minecraft.ID, "beacon", 1L),
        // "Nether Star"
        getModItem(Minecraft.ID, "nether_star", 1L),
        // "Ichorium Dust"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2978),
        // "Ichorium Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11978),
        // "Ichorium Plate"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17978),
        // "Infinity Catalyst Plate"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17394),
        // "Infinity Catalyst Dust"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2394),
        // "Infinity Catalyst Ingot"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11394),
        // "Infinity Nugget"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 9397),
        // "Tiny Pile of Infinity Dust"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 397) };

    private static final String[] FuelBaseline_BloodMagic = new String[] {
        // "Ethereal Slate"
        "20,000,000",
        // "Demonic Slate"
        "8,000,000",
        // "Imbued Slate"
        "1,000,000",
        // "Reinforced Slate"
        "400,000" };

    private static final int[] FuelCalorificValue_BloodMagic = new int[] {
        // "Ethereal Slate"
        20_000_000,
        // "Demonic Slate"
        8_000_000,
        // "Imbued Slate"
        1_000_000,
        // "Reinforced Slate"
        400_000 };

    private static final ItemStack[] Fuel_BloodMagic = new ItemStack[] {
        // "Ethereal Slate"
        getModItem(BloodMagic.ID, "bloodMagicBaseItems", 1L, 27),
        // "Demonic Slate"
        getModItem(BloodMagic.ID, "demonicSlate", 1L),
        // "Imbued Slate"
        getModItem(BloodMagic.ID, "imbuedSlate", 1L),
        // "Reinforced Slate"
        getModItem(BloodMagic.ID, "reinforcedSlate", 1L) };

    private static final ItemStack[] Scrap_BloodMagic = new ItemStack[] {
        // "Ethereal Slate"
        getModItem(BloodMagic.ID, "demonicSlate", 1L),
        // "Demonic Slate"
        getModItem(BloodMagic.ID, "imbuedSlate", 1L),
        // "Imbued Slate"
        getModItem(BloodMagic.ID, "reinforcedSlate", 1L),
        // "Reinforced Slate"
        getModItem(BloodMagic.ID, "blankSlate", 1L) };

    private static final String[] FuelBaseline_Egg = new String[] {
        // "Dragon Egg"
        "1,000,000,000",
        // "Creeper Egg"
        "1,500,000,000",
        // "Infinity Egg"
        "2,147,483,647" };

    private static final int[] FuelCalorificValue_Egg = new int[] {
        // "Dragon Egg"
        1_000_000_000,
        // "Creeper Egg"
        1_500_000_000,
        // "Infinity Egg"
        Integer.MAX_VALUE };

    private static final ItemStack[] Fuel_Egg = new ItemStack[] {
        // "Dragon Egg"
        getModItem(Minecraft.ID, "dragon_egg", 0L),
        // "Creeper Egg"
        getModItem(GalacticraftMars.ID, "tile.creeperEgg", 0L),
        // "Infinity Egg"
        getModItem(Witchery.ID, "infinityegg", 0L), };

    public static void addGeneratorRecipes_Magic() {
        // "Novice Magic Energy Converter" - 1123
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1123), Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Magic);
        }

        for (int FuelID = 0; FuelID < Fuel_BloodMagic.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1123), Fuel_BloodMagic[FuelID])
                .itemOutputs(Scrap_BloodMagic[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_BloodMagic[FuelID])
                .eut(-FuelCalorificValue_BloodMagic[FuelID])
                .addTo(GeneratorRecipes_Magic);
        }

        for (int FuelID = 0; FuelID < Fuel_Egg.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1123), Fuel_Egg[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_Egg[FuelID])
                .eut(-FuelCalorificValue_Egg[FuelID])
                .addTo(GeneratorRecipes_Magic);
        }

        // "Adept Magic Energy Converter" - 1124
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1124), Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Magic);
        }

        for (int FuelID = 0; FuelID < Fuel_BloodMagic.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1124), Fuel_BloodMagic[FuelID])
                .itemOutputs(Scrap_BloodMagic[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_BloodMagic[FuelID])
                .eut(-FuelCalorificValue_BloodMagic[FuelID])
                .addTo(GeneratorRecipes_Magic);
        }

        for (int FuelID = 0; FuelID < Fuel_Egg.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1123), Fuel_Egg[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_Egg[FuelID])
                .eut(-FuelCalorificValue_Egg[FuelID])
                .addTo(GeneratorRecipes_Magic);
        }

        // "Master Magic Energy Converter" - 1125
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1125), Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Magic);
        }

        for (int FuelID = 0; FuelID < Fuel_BloodMagic.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1125), Fuel_BloodMagic[FuelID])
                .itemOutputs(Scrap_BloodMagic[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_BloodMagic[FuelID])
                .eut(-FuelCalorificValue_BloodMagic[FuelID])
                .addTo(GeneratorRecipes_Magic);
        }

        for (int FuelID = 0; FuelID < Fuel_Egg.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1123), Fuel_Egg[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_Egg[FuelID])
                .eut(-FuelCalorificValue_Egg[FuelID])
                .addTo(GeneratorRecipes_Magic);
        }

        // "Novice Magic Energy Absorber" - 1127
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1127), Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Magic);
        }

        for (int FuelID = 0; FuelID < Fuel_BloodMagic.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1127), Fuel_BloodMagic[FuelID])
                .itemOutputs(Scrap_BloodMagic[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_BloodMagic[FuelID])
                .eut(-FuelCalorificValue_BloodMagic[FuelID])
                .addTo(GeneratorRecipes_Magic);
        }

        for (int FuelID = 0; FuelID < Fuel_Egg.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1123), Fuel_Egg[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_Egg[FuelID])
                .eut(-FuelCalorificValue_Egg[FuelID])
                .addTo(GeneratorRecipes_Magic);
        }

        // "Adept Magic Energy Absorber" - 1128
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1128), Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Magic);
        }

        for (int FuelID = 0; FuelID < Fuel_BloodMagic.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1128), Fuel_BloodMagic[FuelID])
                .itemOutputs(Scrap_BloodMagic[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_BloodMagic[FuelID])
                .eut(-FuelCalorificValue_BloodMagic[FuelID])
                .addTo(GeneratorRecipes_Magic);
        }

        for (int FuelID = 0; FuelID < Fuel_Egg.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1123), Fuel_Egg[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_Egg[FuelID])
                .eut(-FuelCalorificValue_Egg[FuelID])
                .addTo(GeneratorRecipes_Magic);
        }

        // "Master Magic Energy Absorber" - 1129
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1129), Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Magic);
        }

        for (int FuelID = 0; FuelID < Fuel_BloodMagic.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1129), Fuel_BloodMagic[FuelID])
                .itemOutputs(Scrap_BloodMagic[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_BloodMagic[FuelID])
                .eut(-FuelCalorificValue_BloodMagic[FuelID])
                .addTo(GeneratorRecipes_Magic);
        }

        for (int FuelID = 0; FuelID < Fuel_Egg.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1123), Fuel_Egg[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_Egg[FuelID])
                .eut(-FuelCalorificValue_Egg[FuelID])
                .addTo(GeneratorRecipes_Magic);
        }

        // "Grandmaster Magic Energy Absorber" - 1130
        for (int FuelID = 0; FuelID < Fuel.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1130), Fuel[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline[FuelID])
                .eut(-FuelCalorificValue[FuelID])
                .addTo(GeneratorRecipes_Magic);
        }

        for (int FuelID = 0; FuelID < Fuel_BloodMagic.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1130), Fuel_BloodMagic[FuelID])
                .itemOutputs(Scrap_BloodMagic[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_BloodMagic[FuelID])
                .eut(-FuelCalorificValue_BloodMagic[FuelID])
                .addTo(GeneratorRecipes_Magic);
        }

        for (int FuelID = 0; FuelID < Fuel_Egg.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1123), Fuel_Egg[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_Egg[FuelID])
                .eut(-FuelCalorificValue_Egg[FuelID])
                .addTo(GeneratorRecipes_Magic);
        }
    }
}
