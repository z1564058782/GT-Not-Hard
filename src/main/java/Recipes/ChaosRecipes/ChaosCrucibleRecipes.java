package Recipes.ChaosRecipes;

import static gregtech.api.enums.Mods.Automagy;
import static gregtech.api.enums.Mods.ElectroMagicTools;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.MagicBees;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.Mods.NewHorizonsCoreMod;
import static gregtech.api.enums.Mods.TaintedMagic;
import static gregtech.api.enums.Mods.Thaumcraft;
import static gregtech.api.enums.Mods.ThaumicBases;
import static gregtech.api.enums.Mods.ThaumicHorizons;
import static gregtech.api.enums.Mods.ThaumicInsurgence;
import static gregtech.api.enums.Mods.ThaumicTinkerer;
import static gregtech.api.enums.Mods.TinkerConstruct;
import static gregtech.api.enums.TierEU.RECIPE_IV;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;
import static util.Utils.setStackSize;

import Item.MagicItemNBT;
import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.CrucibleOfChaosFrontend;

public class ChaosCrucibleRecipes {

    public static final RecipeMap<RecipeMapBackend> addCrucibleRecipes = RecipeMapBuilder.of("Chaos of Crucible")
        .maxIO(11, 1, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(102))
        .frontend(CrucibleOfChaosFrontend::new)
        .neiTransferRect(105, 25, 20, 16)
        .build();

    public static void addCrucibleRecipes_test() {
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
            .addTo(addCrucibleRecipes);

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
            .addTo(addCrucibleRecipes);
    }

    public static void addCrucibleRecipes() {
        // Automagy
        // "Crystalline Brain: Air"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "ItemZombieBrain", 1L),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Vitreus, 10),
                setStackSize(MagicItemNBT.Crystallized_Essence_Aer, 8))
            .itemOutputs(getModItem(Automagy.ID, "crystalBrain", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Crystalline Brain: Fire"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "ItemZombieBrain", 1L),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Vitreus, 10),
                setStackSize(MagicItemNBT.Crystallized_Essence_Ignis, 8))
            .itemOutputs(getModItem(Automagy.ID, "crystalBrain", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Crystalline Brain: Water"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "ItemZombieBrain", 1L),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Vitreus, 10),
                setStackSize(MagicItemNBT.Crystallized_Essence_Aqua, 8))
            .itemOutputs(getModItem(Automagy.ID, "crystalBrain", 1L, 2))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Crystalline Brain: Earth"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "ItemZombieBrain", 1L),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Vitreus, 10),
                setStackSize(MagicItemNBT.Crystallized_Essence_Terra, 8))
            .itemOutputs(getModItem(Automagy.ID, "crystalBrain", 1L, 3))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Crystalline Brain: Order"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "ItemZombieBrain", 1L),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Vitreus, 10),
                setStackSize(MagicItemNBT.Crystallized_Essence_Ordo, 8))
            .itemOutputs(getModItem(Automagy.ID, "crystalBrain", 1L, 4))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Crystalline Brain: Entropy"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "ItemZombieBrain", 1L),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Vitreus, 10),
                setStackSize(MagicItemNBT.Crystallized_Essence_Perditio, 8))
            .itemOutputs(getModItem(Automagy.ID, "crystalBrain", 1L, 5))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Avarice Pearl"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Minecraft.ID, "ender_pearl", 1L),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Lucrum, 5))
            .itemOutputs(getModItem(Automagy.ID, "avaricePearl", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // ElectroMagicTools
        // "Ignis Generator"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(ElectroMagicTools.ID, "EssentiaGenerators", 1L, 0),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Ignis, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Permutatio, 8),
                setStackSize(MagicItemNBT.Crystallized_Essence_Praecantatio, 8))
            .itemOutputs(getModItem(ElectroMagicTools.ID, "EssentiaGenerators", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Auram Generator"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(ElectroMagicTools.ID, "EssentiaGenerators", 1L, 0),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Auram, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Permutatio, 8),
                setStackSize(MagicItemNBT.Crystallized_Essence_Praecantatio, 8))
            .itemOutputs(getModItem(ElectroMagicTools.ID, "EssentiaGenerators", 1L, 2))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Arbor Generator"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(ElectroMagicTools.ID, "EssentiaGenerators", 1L, 0),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Arbor, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Permutatio, 8),
                setStackSize(MagicItemNBT.Crystallized_Essence_Praecantatio, 8))
            .itemOutputs(getModItem(ElectroMagicTools.ID, "EssentiaGenerators", 1L, 3))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Aer Generator"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(ElectroMagicTools.ID, "EssentiaGenerators", 1L, 0),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Aer, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Permutatio, 8),
                setStackSize(MagicItemNBT.Crystallized_Essence_Praecantatio, 8))
            .itemOutputs(getModItem(ElectroMagicTools.ID, "EssentiaGenerators", 1L, 4))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // MagicBees
        // "Concentrated Compound"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8530),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Messis, 6),
                setStackSize(MagicItemNBT.Crystallized_Essence_Vitreus, 3))
            .itemOutputs(getModItem(MagicBees.ID, "miscResources", 1L, 2))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Essence of False Life"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Minecraft.ID, "red_flower", 1L, 0),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Metallum, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Permutatio, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Herba, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Terra, 16))
            .itemOutputs(getModItem(MagicBees.ID, "miscResources", 1L, 7))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Essence of a Shallow Grave"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Minecraft.ID, "rotten_flesh", 1L),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Mortuus, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Perditio, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Spiritus, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Exanimis, 16))
            .itemOutputs(getModItem(MagicBees.ID, "miscResources", 1L, 8))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Essence of Lost Time"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Minecraft.ID, "clock", 1L),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Ordo, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Vacuos, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Vinculum, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Tempus, 16))
            .itemOutputs(getModItem(MagicBees.ID, "miscResources", 1L, 9))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Essence of Everlasting Durability"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Minecraft.ID, "iron_chestplate", 1L),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Tutamen, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Praecantatio, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Metallum, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Fabrico, 16))
            .itemOutputs(getModItem(MagicBees.ID, "miscResources", 1L, 10))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Essence of Fickle Permanence"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(MagicBees.ID, "propolis", 1L, 0),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Perditio, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Permutatio, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Limus, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Potentia, 16))
            .itemOutputs(getModItem(MagicBees.ID, "miscResources", 1L, 12))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // NewHorizonsCoreMod
        // "Void Essence"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 16),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Alienis, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Vacuos, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Tenebrae, 16))
            .itemOutputs(getModItem(NewHorizonsCoreMod.ID, "item.VoidEssence", 2L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Warped Shard"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 6),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Alienis, 8),
                setStackSize(MagicItemNBT.Crystallized_Essence_Praecantatio, 8),
                setStackSize(MagicItemNBT.Crystallized_Essence_Permutatio, 8))
            .itemOutputs(getModItem(TaintedMagic.ID, "ItemMaterial", 1L, 3))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Fluxed Shard"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 6),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Vitium, 8),
                setStackSize(MagicItemNBT.Crystallized_Essence_Praecantatio, 8),
                setStackSize(MagicItemNBT.Crystallized_Essence_Permutatio, 8))
            .itemOutputs(getModItem(TaintedMagic.ID, "ItemMaterial", 1L, 4))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // Thaumcraft
        // "Wood Golem"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "blockMagicalLog", 1L, 0),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Humanus, 14),
                setStackSize(MagicItemNBT.Crystallized_Essence_Motus, 14),
                setStackSize(MagicItemNBT.Crystallized_Essence_Spiritus, 14))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemGolemPlacer", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Balanced Shard"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 14),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Praecantatio, 2),
                setStackSize(MagicItemNBT.Crystallized_Essence_Ordo, 1))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemShard", 1L, 6))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Ethereal Bloom"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "blockCustomPlant", 1L, 2),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Praecantatio, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Herba, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Sano, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Vitium, 8))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockCustomPlant", 1L, 4))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Liquid Death"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Minecraft.ID, "bucket", 1L),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Mortuus, 32),
                setStackSize(MagicItemNBT.Crystallized_Essence_Venenum, 32),
                setStackSize(MagicItemNBT.Crystallized_Essence_Perditio, 32))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemBucketDeath", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Bottled Taint"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(MagicItemNBT.Phial_of_Essentia_Vitium, 1),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Vitium, 8),
                setStackSize(MagicItemNBT.Crystallized_Essence_Praecantatio, 8))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemBottleTaint", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Sanitizing Soap"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 1L, 5),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Alienis, 20),
                setStackSize(MagicItemNBT.Crystallized_Essence_Cognitio, 20),
                setStackSize(MagicItemNBT.Crystallized_Essence_Sano, 20),
                setStackSize(MagicItemNBT.Crystallized_Essence_Ordo, 20))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemSanitySoap", 2L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Magic Tallow"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2877),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Corpus, 4),
                setStackSize(MagicItemNBT.Crystallized_Essence_Praecantatio, 2),
                setStackSize(MagicItemNBT.Crystallized_Essence_Mortuus, 2))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemResource", 1L, 4))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // Nitor
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Minecraft.ID, "glowstone_dust", 1L),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Ignis, 4),
                setStackSize(MagicItemNBT.Crystallized_Essence_Lux, 4),
                setStackSize(MagicItemNBT.Crystallized_Essence_Potentia, 4))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemResource", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // Alumentum
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2535),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Ignis, 6),
                setStackSize(MagicItemNBT.Crystallized_Essence_Potentia, 6),
                setStackSize(MagicItemNBT.Crystallized_Essence_Perditio, 3))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemResource", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Purifying Bath Salts"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 14),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Sano, 10),
                setStackSize(MagicItemNBT.Crystallized_Essence_Cognitio, 10),
                setStackSize(MagicItemNBT.Crystallized_Essence_Auram, 10),
                setStackSize(MagicItemNBT.Crystallized_Essence_Ordo, 10))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemBathSalts", 2L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Void Seed"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Minecraft.ID, "wheat_seeds", 1L),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Alienis, 8),
                setStackSize(MagicItemNBT.Crystallized_Essence_Tenebrae, 8),
                setStackSize(MagicItemNBT.Crystallized_Essence_Vacuos, 8))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemResource", 1L, 17))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Void Metal Ingot"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 17),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Metallum, 16))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemResource", 1L, 16))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // ThaumicBases
        // "Air Crystal Block"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 0),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Fabrico, 2),
                setStackSize(MagicItemNBT.Crystallized_Essence_Aer, 3),
                setStackSize(MagicItemNBT.Crystallized_Essence_Terra, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Ignis, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Aqua, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Ordo, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Perditio, 1))
            .itemOutputs(getModItem(ThaumicBases.ID, "crystalBlock", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Fire Crystal Block"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 1),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Fabrico, 2),
                setStackSize(MagicItemNBT.Crystallized_Essence_Aer, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Terra, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Ignis, 3),
                setStackSize(MagicItemNBT.Crystallized_Essence_Aqua, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Ordo, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Perditio, 1))
            .itemOutputs(getModItem(ThaumicBases.ID, "crystalBlock", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Water Crystal Block"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 2),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Fabrico, 2),
                setStackSize(MagicItemNBT.Crystallized_Essence_Aer, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Terra, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Ignis, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Aqua, 3),
                setStackSize(MagicItemNBT.Crystallized_Essence_Ordo, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Perditio, 1))
            .itemOutputs(getModItem(ThaumicBases.ID, "crystalBlock", 1L, 2))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Earth Crystal Block"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 3),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Fabrico, 2),
                setStackSize(MagicItemNBT.Crystallized_Essence_Aer, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Terra, 3),
                setStackSize(MagicItemNBT.Crystallized_Essence_Ignis, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Aqua, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Ordo, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Perditio, 1))
            .itemOutputs(getModItem(ThaumicBases.ID, "crystalBlock", 1L, 3))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Order Crystal Block"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 4),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Fabrico, 2),
                setStackSize(MagicItemNBT.Crystallized_Essence_Aer, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Terra, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Ignis, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Aqua, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Ordo, 3),
                setStackSize(MagicItemNBT.Crystallized_Essence_Perditio, 1))
            .itemOutputs(getModItem(ThaumicBases.ID, "crystalBlock", 1L, 4))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Entropy Crystal Block"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 5),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Fabrico, 2),
                setStackSize(MagicItemNBT.Crystallized_Essence_Aer, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Terra, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Ignis, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Aqua, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Ordo, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Perditio, 3))
            .itemOutputs(getModItem(ThaumicBases.ID, "crystalBlock", 1L, 5))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Mixed Crystal Block"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 6),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Fabrico, 2),
                setStackSize(MagicItemNBT.Crystallized_Essence_Aer, 2),
                setStackSize(MagicItemNBT.Crystallized_Essence_Terra, 2),
                setStackSize(MagicItemNBT.Crystallized_Essence_Ignis, 2),
                setStackSize(MagicItemNBT.Crystallized_Essence_Aqua, 2),
                setStackSize(MagicItemNBT.Crystallized_Essence_Ordo, 2),
                setStackSize(MagicItemNBT.Crystallized_Essence_Perditio, 2))
            .itemOutputs(getModItem(ThaumicBases.ID, "crystalBlock", 1L, 6))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Tainted Crystal Block"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 0),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Vitium, 2),
                setStackSize(MagicItemNBT.Crystallized_Essence_Fabrico, 2),
                setStackSize(MagicItemNBT.Crystallized_Essence_Aer, 3),
                setStackSize(MagicItemNBT.Crystallized_Essence_Terra, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Ignis, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Aqua, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Ordo, 1),
                setStackSize(MagicItemNBT.Crystallized_Essence_Perditio, 1))
            .itemOutputs(getModItem(ThaumicBases.ID, "crystalBlock", 1L, 7))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // ThaumicHorizons
        // "Golem Animation Powder"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 14),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Humanus, 4),
                setStackSize(MagicItemNBT.Crystallized_Essence_Spiritus, 4),
                setStackSize(MagicItemNBT.Crystallized_Essence_Motus, 4))
            .itemOutputs(getModItem(ThaumicHorizons.ID, "golemPowder", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // ThaumicInsurgence
        // "Trosma Sláintíochta Soap"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "ItemSanitySoap", 1L),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Ordo, 32),
                setStackSize(MagicItemNBT.Crystallized_Essence_Sano, 16))
            .itemOutputs(getModItem(ThaumicInsurgence.ID, "item.ItemSanitySoapAlpha", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Alastor's Soap"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(ThaumicInsurgence.ID, "item.ItemSanitySoapAlpha", 1L),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Permutatio, 32),
                setStackSize(MagicItemNBT.Crystallized_Essence_Sano, 32),
                setStackSize(MagicItemNBT.Crystallized_Essence_Alienis, 16))
            .itemOutputs(getModItem(ThaumicInsurgence.ID, "item.ItemSanitySoapBeta", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // ThaumicTinkerer
        // "Hyperenergetic Nitor"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 1),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Potentia, 32),
                setStackSize(MagicItemNBT.Crystallized_Essence_Lux, 32),
                setStackSize(MagicItemNBT.Crystallized_Essence_Ignis, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Aer, 16))
            .itemOutputs(getModItem(ThaumicTinkerer.ID, "brightNitor", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // "Spellbinding Cloth"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 7),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Perditio, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Praecantatio, 16),
                setStackSize(MagicItemNBT.Crystallized_Essence_Permutatio, 8),
                setStackSize(MagicItemNBT.Crystallized_Essence_Alienis, 8))
            .itemOutputs(getModItem(ThaumicTinkerer.ID, "spellCloth", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        // TinkerConstruct
        // "Necrotic Bone"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Minecraft.ID, "bone", 1L),

                // Crystallized Essence
                setStackSize(MagicItemNBT.Crystallized_Essence_Mortuus, 30),
                setStackSize(MagicItemNBT.Crystallized_Essence_Exanimis, 20),
                setStackSize(MagicItemNBT.Crystallized_Essence_Infernus, 20),
                setStackSize(MagicItemNBT.Crystallized_Essence_Spiritus, 20),
                setStackSize(MagicItemNBT.Crystallized_Essence_Venenum, 20),
                setStackSize(MagicItemNBT.Crystallized_Essence_Corpus, 5))
            .itemOutputs(getModItem(TinkerConstruct.ID, "materials", 1L, 8))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addCrucibleRecipes);

        /*
         * //
         * GTValues.RA.stdBuilder()
         * .itemInputs(
         * getModItem(.ID, "", 1L),
         * // Crystallized Essence
         * setStackSize(MagicItemNBT.Crystallized_Essence_),
         * setStackSize(MagicItemNBT.Crystallized_Essence_),
         * setStackSize(MagicItemNBT.Crystallized_Essence_),
         * setStackSize(MagicItemNBT.Crystallized_Essence_),
         * setStackSize(MagicItemNBT.Crystallized_Essence_),
         * setStackSize(MagicItemNBT.Crystallized_Essence_),
         * setStackSize(MagicItemNBT.Crystallized_Essence_),
         * setStackSize(MagicItemNBT.Crystallized_Essence_),
         * setStackSize(MagicItemNBT.Crystallized_Essence_),
         * setStackSize(MagicItemNBT.Crystallized_Essence_))
         * .itemOutputs(getModItem(.ID, "", 1L, ))
         * .duration(SECONDS)
         * .eut(RECIPE_IV)
         * .addTo(addCrucibleRecipes);
         */
    }
}
