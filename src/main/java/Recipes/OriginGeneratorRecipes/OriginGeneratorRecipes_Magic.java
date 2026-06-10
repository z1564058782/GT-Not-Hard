package Recipes.OriginGeneratorRecipes;

import static gregtech.api.enums.Mods.Avaritia;
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

import java.util.ArrayList;

import net.minecraft.item.ItemStack;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.ItemFuelOfGeneratorFrontend;

public class OriginGeneratorRecipes_Magic {

    public static final RecipeMap<RecipeMapBackend> GeneratorRecipes_Magic = RecipeMapBuilder
        .of("Origin of Generator with Magic")
        .maxIO(2, 1, 0, 0)
        .minInputs(2, 0)
        .neiHandlerInfo(builder -> builder.setHeight(128))
        .frontend(ItemFuelOfGeneratorFrontend::new)
        .neiTransferRect(90, 10, 20, 16)
        .build();

    private static class FuelList {

        String FuelBaseline;
        int FuelCalorificValue;
        int Duration;
        ItemStack Fuel;

        public FuelList(String FuelBaseline, int FuelCalorificValue, int Duration, ItemStack Fuel) {
            this.FuelBaseline = FuelBaseline;
            this.FuelCalorificValue = FuelCalorificValue;
            this.Duration = Duration;
            this.Fuel = Fuel;
        }
    }

    private static class FuelList_BloodMagic {

        String FuelBaseline;
        int FuelCalorificValue;
        int Duration;
        ItemStack Fuel;
        ItemStack Scrap;

        public FuelList_BloodMagic(String FuelBaseline, int FuelCalorificValue, int Duration, ItemStack Fuel,
            ItemStack Scrap) {
            this.FuelBaseline = FuelBaseline;
            this.FuelCalorificValue = FuelCalorificValue;
            this.Duration = Duration;
            this.Fuel = Fuel;
            this.Scrap = Scrap;
        }
    }

    public static void addGeneratorRecipes_Magic() {
        ArrayList<FuelList> fuelList = new ArrayList<>();

        // "Chipped Amber"
        fuelList.add(new FuelList("1,000", 1_000, 20, getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27514)));

        // "Amber Dust"
        fuelList.add(new FuelList("3,000", 3_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2514)));

        // "Amber Plate"
        fuelList.add(new FuelList("3,000", 3_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17514)));

        // "Flawed Amber"
        fuelList.add(new FuelList("3,000", 3_000, 20, getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28514)));

        // "Magic Tallow"
        fuelList.add(new FuelList("4,000", 4_000, 20, getModItem(Thaumcraft.ID, "ItemResource", 1L, 4)));

        // Amber_Thaumcraft
        fuelList.add(new FuelList("6,000", 6_000, 20, getModItem(Thaumcraft.ID, "ItemResource", 1L, 6)));

        // "Magic Wax"
        fuelList.add(new FuelList("6,000", 6_000, 20, getModItem(MagicBees.ID, "wax", 1L, 0)));

        // "Amnesic Wax"
        fuelList.add(new FuelList("6,000", 6_000, 20, getModItem(MagicBees.ID, "wax", 1L, 2)));

        // "Ironwood Ingot"
        fuelList.add(new FuelList("8,000", 8_000, 20, getModItem(TwilightForest.ID, "item.ironwoodIngot", 1L)));

        // "Ironwood Dust"
        fuelList.add(new FuelList("8,000", 8_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2338)));

        // "Ironwood Plate"
        fuelList.add(new FuelList("8,000", 8_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17338)));

        // "Bottle o' Enchanting"
        fuelList.add(new FuelList("10,000", 10_000, 20, getModItem(Minecraft.ID, "experience_bottle", 1L)));

        // "Endereye Dust"
        fuelList.add(new FuelList("10,000", 10_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2533)));

        // "Flawless Amber"
        fuelList.add(new FuelList("12,000", 12_000, 20, getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29514)));

        // "Liveroot Dust"
        fuelList.add(new FuelList("16,000", 16_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2832)));

        // "Eye of Ender"
        fuelList.add(new FuelList("20,000", 20_000, 20, getModItem(Minecraft.ID, "ender_eye", 1L)));

        // "Knightmetal Ingot"
        fuelList.add(new FuelList("24,000", 24_000, 20, getModItem(TwilightForest.ID, "item.knightMetal", 1L)));

        // Steeleaf
        fuelList.add(new FuelList("24,000", 24_000, 20, getModItem(TwilightForest.ID, "item.steeleafIngot", 1L)));

        // "Exquisite Amber"
        fuelList.add(new FuelList("24,000", 24_000, 20, getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30514)));

        // "Steeleaf Plate"
        fuelList.add(new FuelList("24,000", 24_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17339)));

        // "Steeleaf Dust"
        fuelList.add(new FuelList("24,000", 24_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2339)));

        // "Knightmetal Plate"
        fuelList.add(new FuelList("24,000", 24_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17362)));

        // "Knightmetal Dust"
        fuelList.add(new FuelList("24,000", 24_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2362)));

        // Liveroots
        fuelList.add(new FuelList("32,000", 32_000, 20, getModItem(TwilightForest.ID, "tile.TFRoots", 1L, 1)));

        // "Vinteum Dust"
        fuelList.add(new FuelList("32,000", 32_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2529)));

        // "Vinteum Plate"
        fuelList.add(new FuelList("32,000", 32_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17529)));

        // "Vinteum Ingot"
        fuelList.add(new FuelList("32,000", 32_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11529)));

        // "Ghast Tear"
        fuelList.add(new FuelList("50,000", 50_000, 20, getModItem(Minecraft.ID, "ghast_tear", 1L)));

        // Vinteum
        fuelList.add(new FuelList("64,000", 64_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8529)));

        // Quicksilver
        fuelList.add(new FuelList("64,000", 64_000, 20, getModItem(Thaumcraft.ID, "ItemResource", 1L, 3)));

        // "Terra Crystal Plate"
        fuelList.add(new FuelList("160,000", 160_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17542)));

        // "Terra Crystal Powder"
        fuelList.add(new FuelList("160,000", 160_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2542)));

        // "Aer Crystal Plate"
        fuelList.add(new FuelList("160,000", 160_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17540)));

        // "Aer Crystal Powder"
        fuelList.add(new FuelList("160,000", 160_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2540)));

        // "Aqua Crystal Plate"
        fuelList.add(new FuelList("160,000", 160_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17543)));

        // "Aqua Crystal Powder"
        fuelList.add(new FuelList("160,000", 160_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2543)));

        // "Ordo Crystal Plate"
        fuelList.add(new FuelList("240,000", 240_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17545)));

        // "Ordo Crystal Powder"
        fuelList.add(new FuelList("240,000", 240_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2545)));

        // "Ignis Crystal Plate"
        fuelList.add(new FuelList("320,000", 320_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17541)));

        // "Ignis Crystal Powder"
        fuelList.add(new FuelList("320,000", 320_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2541)));

        // "Perditio Crystal Plate"
        fuelList.add(new FuelList("320,000", 320_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17544)));

        // "Perditio Crystal Powder"
        fuelList.add(new FuelList("320,000", 320_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2544)));

        // "Air Shard"
        fuelList.add(new FuelList("320,000", 320_000, 20, getModItem(Thaumcraft.ID, "ItemShard", 1L, 0)));

        // "Water Shard"
        fuelList.add(new FuelList("320,000", 320_000, 20, getModItem(Thaumcraft.ID, "ItemShard", 1L, 2)));

        // "Earth Shard"
        fuelList.add(new FuelList("320,000", 320_000, 20, getModItem(Thaumcraft.ID, "ItemShard", 1L, 3)));

        // "Order Shard"
        fuelList.add(new FuelList("480,000", 480_000, 20, getModItem(Thaumcraft.ID, "ItemShard", 1L, 4)));

        // "Entropy Shard"
        fuelList.add(new FuelList("640,000", 640_000, 20, getModItem(Thaumcraft.ID, "ItemShard", 1L, 5)));

        // "Fire Shard"
        fuelList.add(new FuelList("640,000", 640_000, 20, getModItem(Thaumcraft.ID, "ItemShard", 1L, 1)));

        // "Balanced Shard"
        fuelList.add(new FuelList("720,000", 720_000, 20, getModItem(Thaumcraft.ID, "ItemShard", 1L, 6)));

        // "Gluttony Shard"
        fuelList.add(new FuelList("720,000", 720_000, 20, getModItem(ForbiddenMagic.ID, "GluttonyShard", 1L)));

        // "Tainted Blood Shard"
        fuelList.add(new FuelList("720,000", 720_000, 20, getModItem(ForbiddenMagic.ID, "FMResource", 1L, 3)));

        // "Wrath Shard"
        fuelList.add(new FuelList("720,000", 720_000, 20, getModItem(ForbiddenMagic.ID, "NetherShard", 1L, 0)));

        // "Envy Shard"
        fuelList.add(new FuelList("720,000", 720_000, 20, getModItem(ForbiddenMagic.ID, "NetherShard", 1L, 1)));

        // "Taint Shard"
        fuelList.add(new FuelList("720,000", 720_000, 20, getModItem(ForbiddenMagic.ID, "NetherShard", 1L, 2)));

        // "Pride Shard"
        fuelList.add(new FuelList("720,000", 720_000, 20, getModItem(ForbiddenMagic.ID, "NetherShard", 1L, 3)));

        // "Lust Shard"
        fuelList.add(new FuelList("720,000", 720_000, 20, getModItem(ForbiddenMagic.ID, "NetherShard", 1L, 4)));

        // "Sloth Shard"
        fuelList.add(new FuelList("720,000", 720_000, 20, getModItem(ForbiddenMagic.ID, "NetherShard", 1L, 5)));

        // "Greed Shard"
        fuelList.add(new FuelList("720,000", 720_000, 20, getModItem(ForbiddenMagic.ID, "NetherShard", 1L, 6)));

        // "Warped Shard"
        fuelList.add(new FuelList("720,000", 720_000, 20, getModItem(TaintedMagic.ID, "ItemMaterial", 1L, 3)));

        // "Fluxed Shard"
        fuelList.add(new FuelList("720,000", 720_000, 20, getModItem(TaintedMagic.ID, "ItemMaterial", 1L, 4)));

        // "Shard of Creation"
        fuelList.add(new FuelList("720,000", 720_000, 20, getModItem(TaintedMagic.ID, "ItemMaterial", 1L, 5)));

        // "Nether Shard"
        fuelList.add(new FuelList("720,000", 720_000, 20, getModItem(ThaumicTinkerer.ID, "kamiResource", 1L, 6)));

        // "Ender Shard"
        fuelList.add(new FuelList("720,000", 720_000, 20, getModItem(ThaumicTinkerer.ID, "kamiResource", 1L, 7)));

        // "Void Dust"
        fuelList.add(new FuelList("1,500,000", 1_500_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2970)));

        // "Void Metal Ingot"
        fuelList.add(new FuelList("1,500,000", 1_500_000, 20, getModItem(Thaumcraft.ID, "ItemResource", 1L, 16)));

        // "Void Plate"
        fuelList.add(new FuelList("1,500,000", 1_500_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17970)));

        // "Fiery Blood"
        fuelList.add(new FuelList("2,048,000", 2_048_000, 20, getModItem(TwilightForest.ID, "item.fieryBlood", 1L)));

        // "Fiery Tears"
        fuelList.add(new FuelList("2,048,000", 2_048_000, 20, getModItem(TwilightForest.ID, "item.fieryTears", 1L)));

        // "Fiery Steel Dust"
        fuelList.add(new FuelList("2,048,000", 2_048_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2346)));

        // "Fiery Steel Plate"
        fuelList.add(new FuelList("2,048,000", 2_048_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17346)));

        // "Fiery Ingot"
        fuelList.add(new FuelList("2,048,000", 2_048_000, 20, getModItem(TwilightForest.ID, "item.fieryIngot", 1L)));

        // "Golden Apple"
        fuelList.add(new FuelList("6,400,000", 6_400_000, 20, getModItem(Minecraft.ID, "golden_apple", 1L, 1)));

        // "Nether Star Dust"
        fuelList.add(new FuelList("50,000,000", 50_000_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2506)));

        // "Nether Star Plate"
        fuelList.add(new FuelList("50,000,000", 50_000_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17506)));

        // Beacon
        fuelList.add(new FuelList("100,000,000", 100_000_000, 20, getModItem(Minecraft.ID, "beacon", 1L)));

        // "Nether Star"
        fuelList.add(new FuelList("100,000,000", 100_000_000, 20, getModItem(Minecraft.ID, "nether_star", 1L)));

        // "Ichorium Dust"
        fuelList.add(new FuelList("250,000,000", 250_000_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2978)));

        // "Ichorium Ingot"
        fuelList
            .add(new FuelList("250,000,000", 250_000_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11978)));

        // "Ichorium Plate"
        fuelList
            .add(new FuelList("250,000,000", 250_000_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17978)));

        // "Infinity Catalyst Plate"
        fuelList
            .add(new FuelList("500,000,000", 500_000_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17394)));

        // "Infinity Catalyst Dust"
        fuelList.add(new FuelList("500,000,000", 500_000_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2394)));

        // "Infinity Catalyst Ingot"
        fuelList
            .add(new FuelList("500,000,000", 500_000_000, 20, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11394)));

        // "Infinity Plate"
        fuelList
            .add(new FuelList("536,870,912", 536_870_912, 200, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17397)));

        // "Infinity Ingot"
        fuelList.add(new FuelList("536,870,912", 536_870_912, 200, getModItem(Avaritia.ID, "Resource", 1L, 6)));

        // "Infinity Dust"
        fuelList
            .add(new FuelList("536,870,912", 536_870_912, 200, getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2397)));

        FuelList[] fuel = fuelList.toArray(new FuelList[0]);

        for (FuelList list : fuel) {
            // "Novice Magic Energy Converter" - 1123
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1123), list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Magic);

            // "Adept Magic Energy Converter" - 1124
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1124), list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Magic);

            // "Master Magic Energy Converter" - 1125
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1125), list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Magic);

            // "Novice Magic Energy Absorber" - 1127
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1127), list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Magic);

            // "Adept Magic Energy Absorber" - 1128
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1128), list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Magic);

            // "Master Magic Energy Absorber" - 1129
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1129), list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Magic);

            // "Grandmaster Magic Energy Absorber" - 1130
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1130), list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Magic);
        }

        ArrayList<FuelList_BloodMagic> fuelList_BloodMagic = new ArrayList<>();

        // "Ethereal Slate"
        fuelList_BloodMagic.add(
            new FuelList_BloodMagic(
                "20,000,000",
                20_000_000,
                20,
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 1L, 27),
                getModItem(BloodMagic.ID, "demonicSlate", 1L)));

        // "Demonic Slate"
        fuelList_BloodMagic.add(
            new FuelList_BloodMagic(
                "8,000,000",
                8_000_000,
                20,
                getModItem(BloodMagic.ID, "demonicSlate", 1L),
                getModItem(BloodMagic.ID, "imbuedSlate", 1L)));

        // "Imbued Slate"
        fuelList_BloodMagic.add(
            new FuelList_BloodMagic(
                "1,000,000",
                1_000_000,
                20,
                getModItem(BloodMagic.ID, "imbuedSlate", 1L),
                getModItem(BloodMagic.ID, "reinforcedSlate", 1L)));

        // "Reinforced Slate"
        fuelList_BloodMagic.add(
            new FuelList_BloodMagic(
                "400,000",
                400_000,
                20,
                getModItem(BloodMagic.ID, "reinforcedSlate", 1L),
                getModItem(BloodMagic.ID, "blankSlate", 1L)));

        FuelList_BloodMagic[] fuel_BloodMagic = fuelList_BloodMagic.toArray(new FuelList_BloodMagic[0]);

        for (FuelList_BloodMagic list : fuel_BloodMagic) {
            // "Novice Magic Energy Converter" - 1123
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1123), list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Magic);

            // "Adept Magic Energy Converter" - 1124
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1124), list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Magic);

            // "Master Magic Energy Converter" - 1125
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1125), list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Magic);

            // "Novice Magic Energy Absorber" - 1127
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1127), list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Magic);

            // "Adept Magic Energy Absorber" - 1128
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1128), list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Magic);

            // "Master Magic Energy Absorber" - 1129
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1129), list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Magic);

            // "Grandmaster Magic Energy Absorber" - 1130
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1130), list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Magic);
        }

        ArrayList<FuelList> fuelList_Egg = new ArrayList<>();

        // "Dragon Egg"
        fuelList_Egg.add(new FuelList("1,000,000,000", 1_000_000_000, 20, getModItem(Minecraft.ID, "dragon_egg", 0L)));

        // "Creeper Egg"
        fuelList_Egg.add(
            new FuelList("1,500,000,000", 1_500_000_000, 20, getModItem(GalacticraftMars.ID, "tile.creeperEgg", 0L)));

        // "Infinity Egg"
        fuelList_Egg
            .add(new FuelList("2,147,483,647", Integer.MAX_VALUE, 20, getModItem(Witchery.ID, "infinityegg", 0L)));

        FuelList[] fuel_Egg = fuelList_Egg.toArray(new FuelList[0]);

        for (FuelList list : fuel_Egg) {
            // "Novice Magic Energy Converter" - 1123
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1123), list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Magic);

            // "Adept Magic Energy Converter" - 1124
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1124), list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Magic);

            // "Master Magic Energy Converter" - 1125
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1125), list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Magic);

            // "Novice Magic Energy Absorber" - 1127
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1127), list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Magic);

            // "Adept Magic Energy Absorber" - 1128
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1128), list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Magic);

            // "Master Magic Energy Absorber" - 1129
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1129), list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Magic);

            // "Grandmaster Magic Energy Absorber" - 1130
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1130), list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Magic);
        }
    }
}
