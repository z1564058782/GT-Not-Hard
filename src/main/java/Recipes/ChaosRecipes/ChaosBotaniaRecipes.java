package Recipes.ChaosRecipes;

import static gregtech.api.enums.Mods.AdvancedSolarPanel;
import static gregtech.api.enums.Mods.Botania;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.Mods.PamsHarvestCraft;
import static gregtech.api.enums.TierEU.RECIPE_IV;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.BotaniaOfChaosFrontend;

public class ChaosBotaniaRecipes {

    public static final RecipeMap<RecipeMapBackend> addBotaniaRecipes = RecipeMapBuilder.of("Chaos of Botania")
        .maxIO(11, 1, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(102))
        .frontend(BotaniaOfChaosFrontend::new)
        .neiTransferRect(105, 25, 20, 16)
        .build();

    public static void addBotaniaRecipes_test() {
        // test_1
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Minecraft.ID, "brewing_stand", 1L),

                // Crystallized Essence
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L))
            .itemOutputs(getModItem(Minecraft.ID, "brewing_stand", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // test_2
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Minecraft.ID, "brewing_stand", 1L),

                // Crystallized Essence
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L))
            .itemOutputs(getModItem(Minecraft.ID, "brewing_stand", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);
    }

    public static void addBotaniaRecipes() {
        // "Mana Pool"
        // "Manasteel Ingot"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "pool", 0L, 0),

                // Synthetic Materials
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11305))
            .itemOutputs(getModItem(Botania.ID, "manaResource", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Mana Pearl"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "pool", 0L, 0),

                // Synthetic Materials
                getModItem(Minecraft.ID, "ender_pearl", 1L))
            .itemOutputs(getModItem(Botania.ID, "manaResource", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Mana Diamond"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "pool", 0L, 0),

                // Synthetic Materials
                getModItem(Minecraft.ID, "diamond", 1L))
            .itemOutputs(getModItem(Botania.ID, "manaResource", 1L, 2))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Prismarine Shard"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "pool", 0L, 0),

                // Synthetic Materials
                getModItem(Minecraft.ID, "quartz", 1L))
            .itemOutputs(getModItem(Botania.ID, "manaResource", 1L, 10))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Mana Infused String"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "pool", 0L, 0),

                // Synthetic Materials
                getModItem(Minecraft.ID, "string", 1L))
            .itemOutputs(getModItem(Botania.ID, "manaResource", 1L, 16))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Manaweave Cloth"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "pool", 0L, 0),

                // Synthetic Materials
                getModItem(PamsHarvestCraft.ID, "wovencottonItem", 1L))
            .itemOutputs(getModItem(Botania.ID, "manaResource", 1L, 22))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Mana Powder"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "pool", 0L, 0),

                // Synthetic Materials
                getModItem(Minecraft.ID, "redstone", 1L))
            .itemOutputs(getModItem(Botania.ID, "manaResource", 1L, 23))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Tiny Potato"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "pool", 0L, 0),

                // Synthetic Materials
                getModItem(Minecraft.ID, "potato", 1L))
            .itemOutputs(getModItem(Botania.ID, "tinyPotato", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Force Relay"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "pool", 0L, 0),

                // Synthetic Materials
                getModItem(Minecraft.ID, "piston", 1L))
            .itemOutputs(getModItem(Botania.ID, "pistonRelay", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Mana in a Bottle"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "pool", 0L, 0),

                // Synthetic Materials
                getModItem(Minecraft.ID, "glass_bottle", 1L))
            .itemOutputs(getModItem(Botania.ID, "manaBottle", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Mana Quartz"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "pool", 0L, 0),

                // Synthetic Materials
                getModItem(Minecraft.ID, "quartz", 1L))
            .itemOutputs(getModItem(Botania.ID, "quartz", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // Managlass
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "pool", 0L, 0),

                // Synthetic Materials
                getModItem(Minecraft.ID, "glass", 1L))
            .itemOutputs(getModItem(Botania.ID, "manaGlass", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Block of Manasteel"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "pool", 0L, 0),

                // Synthetic Materials
                getModItem(GregTech.ID, "gt.blockmetal6", 1L, 13))
            .itemOutputs(getModItem(Botania.ID, "storage", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Block of Mana Diamond"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "pool", 0L, 0),

                // Synthetic Materials
                getModItem(Minecraft.ID, "diamond_block", 1L))
            .itemOutputs(getModItem(Botania.ID, "storage", 1L, 3))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Elven Gateway Core"
        // "Elven Quartz"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "alfheimPortal", 0L),

                // Synthetic Materials
                getModItem(Minecraft.ID, "quartz", 1L))
            .itemOutputs(getModItem(Botania.ID, "quartz", 1L, 5))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // Dreamwood
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "alfheimPortal", 0L),

                // Synthetic Materials
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 1))
            .itemOutputs(getModItem(Botania.ID, "dreamwood", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Elementium Ingot"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "alfheimPortal", 0L),

                // Synthetic Materials
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 20576))
            .itemOutputs(getModItem(Botania.ID, "manaResource", 1L, 7))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Pixie Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "alfheimPortal", 0L),

                // Synthetic Materials
                getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1L, 9))
            .itemOutputs(getModItem(Botania.ID, "manaResource", 1L, 8))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // Dragonstone
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "alfheimPortal", 0L),

                // Synthetic Materials
                new Object[] { OrePrefixes.circuit.get(Materials.IV), 1L })
            .itemOutputs(getModItem(Botania.ID, "manaResource", 1L, 9))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // Alfglass
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "alfheimPortal", 0L),

                // Synthetic Materials
                getModItem(Botania.ID, "manaGlass", 1L))
            .itemOutputs(getModItem(Botania.ID, "elfGlass", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Runic Altar"
        // "Rune of Water"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "runeAltar", 0L),

                // Synthetic Materials
                getModItem(Botania.ID, "manaResource", 1L, 23),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17306),
                getModItem(Minecraft.ID, "dye", 1L, 15),
                getModItem(Minecraft.ID, "fishing_rod", 1L),
                getModItem(Minecraft.ID, "reeds", 1L))
            .itemOutputs(getModItem(Botania.ID, "rune", 2L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Rune of Fire"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "runeAltar", 0L),

                // Synthetic Materials
                getModItem(Botania.ID, "manaResource", 1L, 23),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17306),
                getModItem(Minecraft.ID, "gunpowder", 1L),
                getModItem(Minecraft.ID, "netherbrick", 1L),
                getModItem(Minecraft.ID, "nether_wart", 1L))
            .itemOutputs(getModItem(Botania.ID, "rune", 2L, 1))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Rune of Earth"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "runeAltar", 0L),

                // Synthetic Materials
                getModItem(Botania.ID, "manaResource", 1L, 23),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17306),
                getModItem(Minecraft.ID, "brown_mushroom", 1L),
                getModItem(Minecraft.ID, "coal_block", 1L),
                getModItem(Minecraft.ID, "stone", 1L))
            .itemOutputs(getModItem(Botania.ID, "rune", 2L, 2))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Rune of Air"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "runeAltar", 0L),

                // Synthetic Materials
                getModItem(Botania.ID, "manaResource", 1L, 23),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17306),
                getModItem(Minecraft.ID, "carpet", 1L, 0),
                getModItem(Minecraft.ID, "feather", 1L),
                getModItem(Minecraft.ID, "string", 1L))
            .itemOutputs(getModItem(Botania.ID, "rune", 2L, 3))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Rune of Spring"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "runeAltar", 0L),

                // Synthetic Materials
                getModItem(Botania.ID, "rune", 1L, 0),
                getModItem(Botania.ID, "rune", 1L, 1),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17350),
                getModItem(Minecraft.ID, "sapling", 3L, 0),
                getModItem(Minecraft.ID, "wheat", 1L))
            .itemOutputs(getModItem(Botania.ID, "rune", 1L, 4))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Rune of Summer"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "runeAltar", 0L),

                // Synthetic Materials
                getModItem(Botania.ID, "rune", 1L, 2),
                getModItem(Botania.ID, "rune", 1L, 3),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17350),
                getModItem(Minecraft.ID, "melon", 1L),
                getModItem(Minecraft.ID, "sand", 2L, 0),
                getModItem(Minecraft.ID, "slime_ball", 1L))
            .itemOutputs(getModItem(Botania.ID, "rune", 1L, 5))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Rune of Autumn"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "runeAltar", 0L),

                // Synthetic Materials
                getModItem(Botania.ID, "rune", 1L, 1),
                getModItem(Botania.ID, "rune", 1L, 3),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17350),
                getModItem(Minecraft.ID, "leaves", 3L, 0),
                getModItem(Minecraft.ID, "spider_eye", 1L))
            .itemOutputs(getModItem(Botania.ID, "rune", 1L, 6))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Rune of Winter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "runeAltar", 0L),

                // Synthetic Materials
                getModItem(Botania.ID, "rune", 1L, 0),
                getModItem(Botania.ID, "rune", 1L, 2),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17350),
                getModItem(Minecraft.ID, "cake", 1L),
                getModItem(Minecraft.ID, "snow", 2L),
                getModItem(Minecraft.ID, "wool", 1L, 0))
            .itemOutputs(getModItem(Botania.ID, "rune", 1L, 7))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Rune of Mana"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "runeAltar", 0L),

                // Synthetic Materials
                getModItem(Botania.ID, "manaResource", 1L, 1),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17201),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17330),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17350))
            .itemOutputs(getModItem(Botania.ID, "rune", 1L, 8))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Rune of Lust"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "runeAltar", 0L),

                // Synthetic Materials
                getModItem(Botania.ID, "manaResource", 2L, 2),
                getModItem(Botania.ID, "rune", 1L, 3),
                getModItem(Botania.ID, "rune", 1L, 5),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17028))
            .itemOutputs(getModItem(Botania.ID, "rune", 1L, 9))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Rune of Gluttony"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "runeAltar", 0L),

                // Synthetic Materials
                getModItem(Botania.ID, "manaResource", 2L, 2),
                getModItem(Botania.ID, "rune", 1L, 1),
                getModItem(Botania.ID, "rune", 1L, 7),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17028))
            .itemOutputs(getModItem(Botania.ID, "rune", 1L, 10))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Rune of Greed"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "runeAltar", 0L),

                // Synthetic Materials
                getModItem(Botania.ID, "manaResource", 2L, 2),
                getModItem(Botania.ID, "rune", 1L, 0),
                getModItem(Botania.ID, "rune", 1L, 4),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17028))
            .itemOutputs(getModItem(Botania.ID, "rune", 1L, 11))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Rune of Sloth"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "runeAltar", 0L),

                // Synthetic Materials
                getModItem(Botania.ID, "manaResource", 2L, 2),
                getModItem(Botania.ID, "rune", 1L, 3),
                getModItem(Botania.ID, "rune", 1L, 6),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17028))
            .itemOutputs(getModItem(Botania.ID, "rune", 1L, 12))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Rune of Wrath"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "runeAltar", 0L),

                // Synthetic Materials
                getModItem(Botania.ID, "manaResource", 2L, 2),
                getModItem(Botania.ID, "rune", 1L, 2),
                getModItem(Botania.ID, "rune", 1L, 7),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17028))
            .itemOutputs(getModItem(Botania.ID, "rune", 1L, 13))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Rune of Envy"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "runeAltar", 0L),

                // Synthetic Materials
                getModItem(Botania.ID, "manaResource", 2L, 2),
                getModItem(Botania.ID, "rune", 1L, 0),
                getModItem(Botania.ID, "rune", 1L, 7),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17028))
            .itemOutputs(getModItem(Botania.ID, "rune", 1L, 14))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);

        // "Rune of Pride"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Botania.ID, "runeAltar", 0L),

                // Synthetic Materials
                getModItem(Botania.ID, "manaResource", 2L, 2),
                getModItem(Botania.ID, "rune", 1L, 1),
                getModItem(Botania.ID, "rune", 1L, 5),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17028))
            .itemOutputs(getModItem(Botania.ID, "rune", 1L, 15))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBotaniaRecipes);
    }
}
