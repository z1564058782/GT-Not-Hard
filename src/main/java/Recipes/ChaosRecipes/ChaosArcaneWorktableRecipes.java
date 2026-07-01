package Recipes.ChaosRecipes;

import static gregtech.api.enums.Mods.AppliedEnergistics2;
import static gregtech.api.enums.Mods.Automagy;
import static gregtech.api.enums.Mods.Backpack;
import static gregtech.api.enums.Mods.BloodArsenal;
import static gregtech.api.enums.Mods.BloodMagic;
import static gregtech.api.enums.Mods.Botania;
import static gregtech.api.enums.Mods.BuildCraftFactory;
import static gregtech.api.enums.Mods.DraconicEvolution;
import static gregtech.api.enums.Mods.ElectroMagicTools;
import static gregtech.api.enums.Mods.EnderIO;
import static gregtech.api.enums.Mods.EnderStorage;
import static gregtech.api.enums.Mods.EtFuturumRequiem;
import static gregtech.api.enums.Mods.ExtraBees;
import static gregtech.api.enums.Mods.ExtraUtilities;
import static gregtech.api.enums.Mods.Forestry;
import static gregtech.api.enums.Mods.GGFab;
import static gregtech.api.enums.Mods.Gadomancy;
import static gregtech.api.enums.Mods.GoodGenerator;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.IndustrialCraft2;
import static gregtech.api.enums.Mods.IronChests;
import static gregtech.api.enums.Mods.IronTanks;
import static gregtech.api.enums.Mods.MagicBees;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.Mods.NewHorizonsCoreMod;
import static gregtech.api.enums.Mods.OpenBlocks;
import static gregtech.api.enums.Mods.PamsHarvestCraft;
import static gregtech.api.enums.Mods.ProjectRedIllumination;
import static gregtech.api.enums.Mods.ProjectRedIntegration;
import static gregtech.api.enums.Mods.Railcraft;
import static gregtech.api.enums.Mods.TaintedMagic;
import static gregtech.api.enums.Mods.Thaumcraft;
import static gregtech.api.enums.Mods.ThaumicBases;
import static gregtech.api.enums.Mods.ThaumicEnergistics;
import static gregtech.api.enums.Mods.ThaumicHorizons;
import static gregtech.api.enums.Mods.ThaumicTinkerer;
import static gregtech.api.enums.Mods.TinkerConstruct;
import static gregtech.api.enums.Mods.TwilightForest;
import static gregtech.api.enums.Mods.Witchery;
import static gregtech.api.enums.Mods.WitchingGadgets;
import static gregtech.api.enums.TierEU.RECIPE_LV;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;
import static util.Utils.setStackSize;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import EnumList.EnumItemList.EnumMagicList.EssenceList;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.ArcaneWorktableOfChaosFrontend;

public class ChaosArcaneWorktableRecipes {

    public static final RecipeMap<RecipeMapBackend> addArcaneWorktableRecipes = RecipeMapBuilder
        .of("Chaos of Arcane Worktable")
        .maxIO(20, 1, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(126))
        .frontend(ArcaneWorktableOfChaosFrontend::new)
        .neiTransferRect(105, 40, 20, 16)
        .build();

    public static final ItemStack Air_Shard = getModItem(Thaumcraft.ID, "ItemShard", 1L, 0);
    public static final ItemStack Fire_Shard = getModItem(Thaumcraft.ID, "ItemShard", 1L, 1);
    public static final ItemStack Water_Shard = getModItem(Thaumcraft.ID, "ItemShard", 1L, 2);
    public static final ItemStack Earth_Shard = getModItem(Thaumcraft.ID, "ItemShard", 1L, 3);
    public static final ItemStack Order_Shard = getModItem(Thaumcraft.ID, "ItemShard", 1L, 4);
    public static final ItemStack Entropy_Shard = getModItem(Thaumcraft.ID, "ItemShard", 1L, 5);
    public static final ItemStack Balanced_Shard = getModItem(Thaumcraft.ID, "ItemShard", 1L, 6);

    public static final ItemStack Single_Use_File = getModItem(GGFab.ID, "gt.ggfab.d1", 1L, 0);
    public static final ItemStack Single_Use_Wrench = getModItem(GGFab.ID, "gt.ggfab.d1", 1L, 1);
    public static final ItemStack Single_Use_Crowbar = getModItem(GGFab.ID, "gt.ggfab.d1", 1L, 2);
    public static final ItemStack Single_Use_Cutter = getModItem(GGFab.ID, "gt.ggfab.d1", 1L, 3);
    public static final ItemStack Single_Use_Hammer = getModItem(GGFab.ID, "gt.ggfab.d1", 1L, 4);
    public static final ItemStack Single_Use_Mallet = getModItem(GGFab.ID, "gt.ggfab.d1", 1L, 5);
    public static final ItemStack Single_Use_Screwdriver = getModItem(GGFab.ID, "gt.ggfab.d1", 1L, 6);
    public static final ItemStack Single_Use_Saw = getModItem(GGFab.ID, "gt.ggfab.d1", 1L, 7);

    public static final ItemStack Air_Crystal_Cluster = getModItem(Thaumcraft.ID, "blockCrystal", 1L, 0);
    public static final ItemStack Fire_Crystal_Cluster = getModItem(Thaumcraft.ID, "blockCrystal", 1L, 1);
    public static final ItemStack Water_Crystal_Cluster = getModItem(Thaumcraft.ID, "blockCrystal", 1L, 2);
    public static final ItemStack Earth_Crystal_Cluster = getModItem(Thaumcraft.ID, "blockCrystal", 1L, 3);
    public static final ItemStack Order_Crystal_Cluster = getModItem(Thaumcraft.ID, "blockCrystal", 1L, 4);
    public static final ItemStack Entropy_Crystal_Cluster = getModItem(Thaumcraft.ID, "blockCrystal", 1L, 5);
    public static final ItemStack Mixed_Crystal_Cluster = getModItem(Thaumcraft.ID, "blockCrystal", 1L, 6);

    public static void addArcaneWorktableRecipes_test() {
        // test_1
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L))
            .itemOutputs(getModItem(Minecraft.ID, "brewing_stand", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // test_2
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L))
            .itemOutputs(getModItem(Minecraft.ID, "brewing_stand", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);
    }

    public static void addArcaneWorktableRecipes() {
        // Automagy
        // "Aqueous Admixture"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Automagy.ID, "shardSliver", 2L, 2),
                getModItem(Minecraft.ID, "clay_ball", 1L),
                getModItem(Minecraft.ID, "dye", 1L, 0),
                getModItem(Minecraft.ID, "slime_ball", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 1))
            .itemOutputs(getModItem(Automagy.ID, "glyph", 2L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Alchemical Boiler"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(BuildCraftFactory.ID, "tankBlock", 1L),
                getModItem(EtFuturumRequiem.ID, "blast_furnace", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17330),
                getModItem(Railcraft.ID, "machine.beta", 1L, 4),
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 4L, 6),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 20),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 25),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20))
            .itemOutputs(getModItem(Automagy.ID, "blockBoiler", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Amplified Redcrystal"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Automagy.ID, "blockRedcrystal", 1L),
                getModItem(Automagy.ID, "shardSliver", 8L, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 10))
            .itemOutputs(getModItem(Automagy.ID, "blockRedcrystalAmp", 2L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Dense Redcrystal"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Automagy.ID, "blockRedcrystal", 4L),
                getModItem(Automagy.ID, "shardSliver", 2L, 3),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 23542),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 10))
            .itemOutputs(getModItem(Automagy.ID, "blockRedcrystalDense", 2L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Dim Redcrystal"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Automagy.ID, "blockRedcrystal", 1L),
                getModItem(Automagy.ID, "shardSliver", 8L, 5),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 10))
            .itemOutputs(getModItem(Automagy.ID, "blockRedcrystalDim", 2L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Sliver of Air"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                Air_Shard,
                Single_Use_Hammer,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 5),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 10))
            .itemOutputs(getModItem(Automagy.ID, "shardSliver", 4L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Sliver of Fire"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                Fire_Shard,
                Single_Use_Hammer,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 5),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 10))
            .itemOutputs(getModItem(Automagy.ID, "shardSliver", 4L, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Sliver of Water"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                Water_Shard,
                Single_Use_Hammer,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 5),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 10))
            .itemOutputs(getModItem(Automagy.ID, "shardSliver", 4L, 2))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Sliver of Earth"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                Earth_Shard,
                Single_Use_Hammer,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 5),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 10))
            .itemOutputs(getModItem(Automagy.ID, "shardSliver", 4L, 3))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Sliver of Order"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                Order_Shard,
                Single_Use_Hammer,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 10))
            .itemOutputs(getModItem(Automagy.ID, "shardSliver", 4L, 4))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Sliver of Entropy"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                Entropy_Shard,
                Single_Use_Hammer,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 5))
            .itemOutputs(getModItem(Automagy.ID, "shardSliver", 4L, 5))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Remote Comparator"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Automagy.ID, "blockRedcrystal", 1L),
                getModItem(ProjectRedIntegration.ID, "projectred.integration.gate", 1L, 26),
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 2L, 6),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 15),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 15))
            .itemOutputs(getModItem(Automagy.ID, "blockRemoteComparator", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Resonating Redcrystal"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 4L, 11),
                getModItem(Automagy.ID, "blockRedcrystal", 1L),
                getModItem(Automagy.ID, "shardSliver", 4L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5))
            .itemOutputs(getModItem(Automagy.ID, "blockRedcrystalRes", 2L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Mercurial Redcrystal"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Automagy.ID, "blockRedcrystal", 2L),
                getModItem(Automagy.ID, "blockRedcrystalRes", 1L),
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 2L, 6),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3),
                getModItem(Thaumcraft.ID, "ItemResource", 3L, 10),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 20),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 25),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 10))
            .itemOutputs(getModItem(Automagy.ID, "blockRedcrystalMerc", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Thirsty Tank"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Automagy.ID, "avaricePearl", 1L, 0),
                getModItem(Minecraft.ID, "glass", 3L),
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 4L, 6),
                setStackSize(Water_Shard, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 16),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 4),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 4))
            .itemOutputs(getModItem(Automagy.ID, "blockThirstyTank", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Glyph of the Void"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Automagy.ID, "glyph", 3L, 0),
                getModItem(Minecraft.ID, "blaze_powder", 1L),
                getModItem(Minecraft.ID, "obsidian", 1L),
                getModItem(Thaumcraft.ID, "blockCosmeticSlabStone", 1L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 3),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 10))
            .itemOutputs(getModItem(Automagy.ID, "glyph", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Glyph of Consumption"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Automagy.ID, "glyph", 4L, 0),
                getModItem(Minecraft.ID, "blaze_powder", 1L),
                getModItem(Thaumcraft.ID, "blockCosmeticSlabStone", 1L, 0),
                setStackSize(Entropy_Shard, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 3),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 15))
            .itemOutputs(getModItem(Automagy.ID, "glyph", 1L, 2))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Glyph of Siphoning"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Automagy.ID, "glyph", 4L, 0),
                getModItem(Minecraft.ID, "hopper", 1L),
                getModItem(Thaumcraft.ID, "blockCosmeticSlabStone", 1L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 3),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 2),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 2))
            .itemOutputs(getModItem(Automagy.ID, "glyph", 1L, 3))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Glyph of Envy"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Automagy.ID, "avaricePearl", 1L, 0),
                getModItem(Automagy.ID, "glyph", 3L, 0),
                getModItem(Thaumcraft.ID, "blockCosmeticSlabStone", 1L, 0),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 5),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 3))
            .itemOutputs(getModItem(Automagy.ID, "glyph", 1L, 4))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Glyph of Temperance"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Automagy.ID, "glyph", 3L, 0),
                getModItem(Minecraft.ID, "redstone", 4L),
                getModItem(Thaumcraft.ID, "blockCosmeticSlabStone", 1L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 3),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10))
            .itemOutputs(getModItem(Automagy.ID, "glyph", 1L, 5))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Glyph of Preservation"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Automagy.ID, "glyph", 4L, 0),
                getModItem(Minecraft.ID, "slime_ball", 1L),
                getModItem(Thaumcraft.ID, "blockCosmeticSlabStone", 1L, 0),
                Order_Shard,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 3),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5))
            .itemOutputs(getModItem(Automagy.ID, "glyph", 1L, 6))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Glyph of the Guzzler"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Automagy.ID, "glyph", 4L, 0),
                getModItem(Automagy.ID, "horizontal", 1L, 0),
                getModItem(Minecraft.ID, "potion", 1L, 8226),
                getModItem(Minecraft.ID, "speckled_melon", 1L),
                getModItem(Thaumcraft.ID, "blockCosmeticSlabStone", 1L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 5),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 3),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 5))
            .itemOutputs(getModItem(Automagy.ID, "glyph", 1L, 7))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Glyph of the Reservoir"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Automagy.ID, "glyph", 3L, 0),
                getModItem(Minecraft.ID, "bucket", 2L),
                getModItem(Minecraft.ID, "ender_pearl", 1L),
                getModItem(Thaumcraft.ID, "blockCosmeticSlabStone", 1L, 0),
                Water_Shard,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 3),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 16),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 3))
            .itemOutputs(getModItem(Automagy.ID, "glyph", 1L, 8))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Glyph of the Bovine"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Automagy.ID, "crystalEntityEye", 1L),
                getModItem(Automagy.ID, "glyph", 3L, 0),
                getModItem(Minecraft.ID, "leather", 2L),
                getModItem(Minecraft.ID, "milk_bucket", 1L),
                getModItem(Thaumcraft.ID, "blockCosmeticSlabStone", 1L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 15),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 3))
            .itemOutputs(getModItem(Automagy.ID, "glyph", 1L, 9))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Botania
        // "Glimmering Livingwood"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Botania.ID, "livingwood", 4L, 0),
                getModItem(Minecraft.ID, "emerald", 1L),
                getModItem(TwilightForest.ID, "item.steeleafIngot", 4L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 25),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 50),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 50))
            .itemOutputs(getModItem(Botania.ID, "livingwood", 4L, 5))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Alchemy Catalyst"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Botania.ID, "livingrock", 4L, 0),
                getModItem(Botania.ID, "manaResource", 1L, 0),
                getModItem(Botania.ID, "manaResource", 1L, 1),
                getModItem(Minecraft.ID, "brewing_stand", 2L),
                getModItem(Thaumcraft.ID, "blockMetalDevice", 1L, 9),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 20),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 40))
            .itemOutputs(getModItem(Botania.ID, "alchemyCatalyst", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Conjuration Catalyst"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Botania.ID, "alchemyCatalyst", 1L),
                getModItem(Botania.ID, "livingrock", 4L, 0),
                getModItem(Botania.ID, "manaResource", 2L, 8),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17202),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 50),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 150))
            .itemOutputs(getModItem(Botania.ID, "conjurationCatalyst", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Mana Pylon"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Botania.ID, "storage", 2L, 0),
                getModItem(Botania.ID, "storage", 1L, 3),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17086),
                setStackSize(Water_Shard, 4),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 20),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20))
            .itemOutputs(getModItem(Botania.ID, "pylon", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Natura Pylon"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Botania.ID, "pylon", 1L, 0),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17202),
                getModItem(TwilightForest.ID, "item.steeleafIngot", 2L),
                setStackSize(Earth_Shard, 4),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 50),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 100))
            .itemOutputs(getModItem(Botania.ID, "pylon", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Alfglass Flask"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Botania.ID, "elfGlass", 7L),
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 23471),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 25))
            .itemOutputs(getModItem(Botania.ID, "vial", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // BloodArsenal
        // "Soul Compacter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(BloodArsenal.ID, "blood_infused_diamond_bound", 2L),
                getModItem(BloodArsenal.ID, "blood_infused_iron_block", 2L),
                getModItem(BloodArsenal.ID, "blood_infused_wood", 3L),
                getModItem(BloodMagic.ID, "masterStone", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32644),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 75),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 75),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 75),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 75),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 75),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 75))
            .itemOutputs(getModItem(BloodArsenal.ID, "compacter", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Life Imbued Helmet"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Thaumcraft.ID, "ItemHelmetThaumium", 1L),
                getModItem(TinkerConstruct.ID, "heavyPlate", 5L, 251),
                Single_Use_Hammer,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 30),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 30))
            .itemOutputs(getModItem(BloodArsenal.ID, "life_imbued_helmet", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Life Imbued Chestplate"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Thaumcraft.ID, "ItemChestplateThaumium", 1L),
                getModItem(TinkerConstruct.ID, "heavyPlate", 7L, 251),
                Single_Use_Hammer,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 60),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 60),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 60),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 60))
            .itemOutputs(getModItem(BloodArsenal.ID, "life_imbued_chestplate", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Life Imbued Leggings"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Thaumcraft.ID, "ItemLeggingsThaumium", 1L),
                getModItem(TinkerConstruct.ID, "heavyPlate", 7L, 251),
                Single_Use_Hammer,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 45),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 45),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 45),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 45))
            .itemOutputs(getModItem(BloodArsenal.ID, "life_imbued_leggings", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Life Imbued Boots"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Thaumcraft.ID, "ItemBootsThaumium", 1L),
                getModItem(TinkerConstruct.ID, "heavyPlate", 4L, 251),
                Single_Use_Hammer,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 30),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 30))
            .itemOutputs(getModItem(BloodArsenal.ID, "life_imbued_boots", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Transparent Orb"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(BloodArsenal.ID, "blood_burned_string", 2L),
                getModItem(BloodArsenal.ID, "blood_lamp", 1L),
                getModItem(BloodArsenal.ID, "blood_stained_glass", 4L),
                getModItem(BloodMagic.ID, "divinationSigil", 1L),
                getModItem(BloodMagic.ID, "transcendentBloodOrb", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 175),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 175),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 175),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 175),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 175),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 175))
            .itemOutputs(getModItem(BloodArsenal.ID, "transparent_orb", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // BloodMagic
        // "Altar of GregoriusT's Blood"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(EnderIO.ID, "itemMaterial", 2L, 5),
                getModItem(ExtraUtilities.ID, "cobblestone_compressed", 2L, 1),
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 2L, 7),
                getModItem(Thaumcraft.ID, "blockMetalDevice", 1L, 0),
                getModItem(Thaumcraft.ID, "blockStoneDevice", 1L, 0),
                getModItem(Witchery.ID, "ingredient", 1L, 10),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 20),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 20),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 20))
            .itemOutputs(getModItem(BloodMagic.ID, "Altar", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Sacrificial Knife"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Botania.ID, "enderDagger", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17019),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 23305),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 27305),
                getModItem(TinkerConstruct.ID, "strangeFood", 2L, 1),
                Single_Use_Screwdriver,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 10),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 20))
            .itemOutputs(getModItem(BloodMagic.ID, "sacrificialKnife", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Imperfect Ritual Stone"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(BloodArsenal.ID, "blood_stone", 1L, 0),
                getModItem(BloodMagic.ID, "blankSlate", 4L),
                getModItem(Minecraft.ID, "obsidian", 4L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 1),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 8),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 6))
            .itemOutputs(getModItem(BloodMagic.ID, "imperfectRitualStone", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Ritual Stone"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(BloodMagic.ID, "demonicSlate", 3L),
                getModItem(BloodMagic.ID, "imperfectRitualStone", 1L),
                getModItem(BloodMagic.ID, "terrae", 1L),
                getModItem(Minecraft.ID, "obsidian", 4L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 3),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 24),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 18))
            .itemOutputs(getModItem(BloodMagic.ID, "ritualStone", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Empty Core"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(BloodMagic.ID, "simpleCatalyst", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17306),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17351),
                getModItem(Thaumcraft.ID, "blockCosmeticOpaque", 4L, 2),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 15),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 15),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 15),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 15))
            .itemOutputs(getModItem(BloodMagic.ID, "bloodMagicBaseItems", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Blood Letter's Pack"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(BuildCraftFactory.ID, "tankBlock", 1L),
                getModItem(BloodMagic.ID, "reinforcedSlate", 6L),
                getModItem(BloodMagic.ID, "sacrificialKnife", 1L),
                getModItem(Thaumcraft.ID, "ItemChestplateThaumium", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 15),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 15),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 30),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 30))
            .itemOutputs(getModItem(BloodMagic.ID, "itemBloodPack", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Empty Socket"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 4L, 25),
                getModItem(BloodMagic.ID, "weakBloodShard", 4L),
                getModItem(NewHorizonsCoreMod.ID, "tile.DiamondFrameBox", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 50),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 50),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 50),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 50))
            .itemOutputs(getModItem(BloodMagic.ID, "emptySocket", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Arcane Pedestal"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(BloodMagic.ID, "AlchemicalWizardrybloodRune", 2L, 0),
                getModItem(BloodMagic.ID, "largeBloodStoneBrick", 2L),
                getModItem(BloodMagic.ID, "weakBloodShard", 4L),
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 2L, 7),
                getModItem(Thaumcraft.ID, "blockStoneDevice", 1L, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 30),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 30))
            .itemOutputs(getModItem(BloodMagic.ID, "blockPedestal", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Alchemic Calcinator"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 4),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 2L, 15),
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 2L, 7),
                getModItem(Thaumcraft.ID, "blockCosmeticOpaque", 3L, 2),
                getModItem(Witchery.ID, "cauldron", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 50),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 50),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 50),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 50))
            .itemOutputs(getModItem(BloodMagic.ID, "blockAlchemicCalcinator", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Alchemic Router"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 4),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 3L, 0),
                getModItem(BloodMagic.ID, "reinforcedSlate", 2L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 15),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 15))
            .itemOutputs(getModItem(BloodMagic.ID, "itemAttunedCrystal", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Alchemic Cleanser"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 4L, 3),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 4L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 15),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 15),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 15))
            .itemOutputs(getModItem(BloodMagic.ID, "itemDestinationClearer", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Alchemic Segmenter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 4),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 3L, 0),
                getModItem(BloodMagic.ID, "mundanePowerCatalyst", 1L),
                getModItem(Witchery.ID, "chalkheart", 2L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 15),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 15))
            .itemOutputs(getModItem(BloodMagic.ID, "itemTankSegmenter", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Crystal Belljar"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 4),
                getModItem(Thaumcraft.ID, "blockCosmeticOpaque", 5L, 2),
                getModItem(Minecraft.ID, "light_weighted_pressure_plate", 1L),
                getModItem(Minecraft.ID, "wooden_pressure_plate", 2L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 20),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20))
            .itemOutputs(getModItem(BloodMagic.ID, "blockCrystalBelljar", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Alchemy Relay"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 4),
                getModItem(BloodMagic.ID, "imbuedSlate", 4L),
                getModItem(BloodArsenal.ID, "blood_burned_string", 4L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 25),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 25))
            .itemOutputs(getModItem(BloodMagic.ID, "blockReagentConduit", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Glyph of Rigid Stability"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(BloodArsenal.ID, "blood_stone", 1L, 4),
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 2L, 1),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 2L, 17),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 1L, 30),
                getModItem(BloodMagic.ID, "crepitous", 2L),
                getModItem(BloodMagic.ID, "magicales", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 20),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 20),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 20))
            .itemOutputs(getModItem(BloodMagic.ID, "blockStabilityGlyph", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Glyph of the Adept Enchanter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(BloodArsenal.ID, "blood_stone", 1L, 4),
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 2L, 0),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 2L, 17),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 1L, 28),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 1L, 30),
                getModItem(BloodMagic.ID, "magicales", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 30),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 30),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 30),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 30))
            .itemOutputs(getModItem(BloodMagic.ID, "blockEnchantmentGlyph", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Glyph of Arcane Potential"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(BloodArsenal.ID, "blood_stone", 1L, 4),
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 2L, 6),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 2L, 17),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 1L, 29),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 1L, 30),
                getModItem(BloodMagic.ID, "magicales", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 30),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 30),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 30),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 30))
            .itemOutputs(getModItem(BloodMagic.ID, "blockEnchantmentGlyph", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // DraconicEvolution
        // Disenchanter
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.blockgem1", 2L, 2),
                getModItem(GregTech.ID, "gt.blockmetal7", 2L, 4),
                getModItem(IndustrialCraft2.ID, "itemDensePlates", 1L, 7),
                getModItem(Minecraft.ID, "enchanted_book", 2L),
                getModItem(Minecraft.ID, "enchanting_table", 1L),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 7),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 75),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 75),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 75),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 75),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 75),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 75))
            .itemOutputs(getModItem(DraconicEvolution.ID, "dissEnchanter", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // ElectroMagicTools
        // "Duct Tape"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(ElectroMagicTools.ID, "EMTItems", 1L, 9),
                getModItem(Minecraft.ID, "feather", 8L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 5),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5))
            .itemOutputs(getModItem(ElectroMagicTools.ID, "EMTItems", 2L, 7))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // EnderStorage
        // "Ender Chest"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17506),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 22321),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32684),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32694),
                getModItem(IronChests.ID, "BlockIronChest", 1L, 6),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 100),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 100),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 100),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 100))
            .itemOutputs(getModItem(EnderStorage.ID, "enderChest", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Ender Tank"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 22321),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32684),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32694),
                getModItem(GregTech.ID, "gt.metaitem.02", 4L, 22801),
                getModItem(IronTanks.ID, "obsidianTank", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 100),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 100),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 100),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 100),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 100))
            .itemOutputs(getModItem(EnderStorage.ID, "enderChest", 1L, 4096))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Ender Pouch"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Backpack.ID, "backpack", 1L, 200),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 22321),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32684),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32694),
                getModItem(GregTech.ID, "gt.metaitem.02", 4L, 30500),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 100),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 100),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 100),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 100),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 100),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 100))
            .itemOutputs(getModItem(EnderStorage.ID, "enderPouch", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // ExtraBees
        // "Healing Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Forestry.ID, "frameImpregnated", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 2805),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 27032),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 4),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 4),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 4),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 4),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 4),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 4))
            .itemOutputs(getModItem(ExtraBees.ID, "hiveFrame.clay", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Chocolate Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Forestry.ID, "frameImpregnated", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 27032),
                getModItem(Minecraft.ID, "sugar", 2L),
                getModItem(PamsHarvestCraft.ID, "cocoapowderItem", 2L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 4),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 4),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 4),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 4),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 4),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 4))
            .itemOutputs(getModItem(ExtraBees.ID, "hiveFrame.cocoa", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Restraint Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Forestry.ID, "frameImpregnated", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 27305),
                getModItem(Minecraft.ID, "iron_bars", 4L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 8),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 8),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 8),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 8),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 8),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 8))
            .itemOutputs(getModItem(ExtraBees.ID, "hiveFrame.cage", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Soul Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(ExtraBees.ID, "hiveFrame.cage", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 27019),
                getModItem(Minecraft.ID, "soul_sand", 4L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 16),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 16),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 16),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 16),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 16),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 16))
            .itemOutputs(getModItem(ExtraBees.ID, "hiveFrame.soul", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // ExtraUtilities
        // "Carved 'Eminence' Stone"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17330),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17532),
                getModItem(ProjectRedIllumination.ID, "projectred.illumination.lamp", 1L, 18),
                getModItem(ProjectRedIllumination.ID, "projectred.illumination.lamp", 1L, 26),
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 1L, 7),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 50),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 50),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 50),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 50))
            .itemOutputs(getModItem(ExtraUtilities.ID, "decorativeBlock1", 2L, 14))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Magical Wood"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17330),
                getModItem(Minecraft.ID, "bookshelf", 1L),
                getModItem(Thaumcraft.ID, "blockMagicalLog", 2L, 0),
                getModItem(Thaumcraft.ID, "blockMagicalLog", 2L, 1),
                getModItem(TwilightForest.ID, "item.carminite", 2L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 10),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 10),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 10))
            .itemOutputs(getModItem(ExtraUtilities.ID, "decorativeBlock1", 4L, 8))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Angel Block"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Automagy.ID, "blockRunedObsidian", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17540),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 29351),
                getModItem(IndustrialCraft2.ID, "itemDensePlates", 2L, 7),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 50))
            .itemOutputs(getModItem(ExtraUtilities.ID, "angelBlock", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Forestry
        // "Proven Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Forestry.ID, "frameImpregnated", 1L),
                getModItem(Forestry.ID, "honeydew", 1L),
                getModItem(Forestry.ID, "propolis", 1L, 0),
                getModItem(Forestry.ID, "propolis", 1L, 3),
                getModItem(Forestry.ID, "royalJelly", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 27305),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 15),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 15),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 15),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 15))
            .itemOutputs(getModItem(Forestry.ID, "frameProven", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // GoodGenerator
        // "Essentia Filter Casing"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 11),
                getModItem(GregTech.ID, "gt.blockmachines", 2L, 5221),
                getModItem(GregTech.ID, "gt.metaitem.02", 2L, 21970),
                getModItem(Thaumcraft.ID, "blockStoneDevice", 1L, 14),
                getModItem(Thaumcraft.ID, "blockTube", 2L, 3),
                getModItem(ThaumicBases.ID, "thauminiteBlock", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 70),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 70),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 70),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 70),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 70),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 70))
            .itemOutputs(getModItem(GoodGenerator.ID, "essentiaFilterCasing", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Magic Casing"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.02", 2L, 18330),
                getModItem(IndustrialCraft2.ID, "blockAlloyGlass", 2L),
                getModItem(IndustrialCraft2.ID, "blockMachine", 1L, 12),
                getModItem(Thaumcraft.ID, "ItemResource", 4L, 14),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 50))
            .itemOutputs(getModItem(GoodGenerator.ID, "magicCasing", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Gadomancy
        // "Book of Knowledge"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Gadomancy.ID, "ItemAuraCore", 1L, 5),
                getModItem(Minecraft.ID, "bookshelf", 2L),
                getModItem(Thaumcraft.ID, "blockMetalDevice", 2L, 12),
                getModItem(Thaumcraft.ID, "ItemGoggles", 1L),
                getModItem(Thaumcraft.ID, "ItemInkwell", 2L),
                getModItem(Thaumcraft.ID, "ItemThaumonomicon", 1L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 35),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 75),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 35))
            .itemOutputs(getModItem(Gadomancy.ID, "BlockKnowledgeBook", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Essentia Condenser"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Gadomancy.ID, "ItemAuraCore", 1L, 3),
                getModItem(Gadomancy.ID, "ItemElement", 1L, 0),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 4),
                getModItem(Thaumcraft.ID, "blockMagicalLog", 2L, 0),
                getModItem(Thaumcraft.ID, "blockTube", 4L, 6),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 180),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 100),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 120),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 200),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 160),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 140))
            .itemOutputs(getModItem(Gadomancy.ID, "BlockEssentiaCompressor", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // GregTech
        // "Ichorium Ingot"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11317),
                getModItem(GregTech.ID, "gt.metaitem.02", 2L, 29500),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 16),
                getModItem(ThaumicTinkerer.ID, "kamiResource", 4L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 128),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 128),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 128),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 128),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 128),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 128))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11978))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Magical Machine Casing"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.blockframes", 1L, 330),
                getModItem(GregTech.ID, "gt.metaitem.01", 6L, 17330),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 14),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 8),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 8),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 8))
            .itemOutputs(getModItem(GregTech.ID, "gt.blockcasings8", 1L, 8))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Research Completer"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.blockcasings8", 1L, 8),
                getModItem(Thaumcraft.ID, "blockCosmeticOpaque", 3L, 2),
                getModItem(Thaumcraft.ID, "blockStoneDevice", 1L, 5),
                new Object[] { OrePrefixes.circuit.get(Materials.MV), 4L },
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 50),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 50),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 50),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 50))
            .itemOutputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 13001))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // MagicBees
        // "Sanguis Artus"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(MagicBees.ID, "item.bloodSoakedFrame", 1L),
                getModItem(BloodMagic.ID, "imbuedSlate", 4L),
                getModItem(BloodMagic.ID, "bucketLife", 4L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 50),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 50),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 50),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 50))
            .itemOutputs(getModItem(MagicBees.ID, "item.bloodFrame", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Maddening Frame of Frenzy"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(MagicBees.ID, "item.bloodSoakedFrame", 1L),
                getModItem(BloodMagic.ID, "imbuedSlate", 4L),
                getModItem(Thaumcraft.ID, "ItemResource", 4L, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 50),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 50),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 50),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 50))
            .itemOutputs(getModItem(MagicBees.ID, "item.frenziedFrame", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Magic Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Forestry.ID, "frameImpregnated", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 27305),
                getModItem(MagicBees.ID, "wax", 1L, 0),
                getModItem(MagicBees.ID, "wax", 1L, 1),
                getModItem(MagicBees.ID, "wax", 1L, 2),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 7),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 8),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 8),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 8),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 8),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 8),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 8))
            .itemOutputs(getModItem(MagicBees.ID, "frameMagic", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Gentle Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 27019),
                getModItem(MagicBees.ID, "frameMagic", 1L),
                getModItem(MagicBees.ID, "miscResources", 1L, 7),
                getModItem(MagicBees.ID, "miscResources", 3L, 18),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 16),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 16),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 16),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 16),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 16),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 16))
            .itemOutputs(getModItem(MagicBees.ID, "frameGentle", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Resilient Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 27019),
                getModItem(MagicBees.ID, "frameMagic", 1L),
                getModItem(MagicBees.ID, "miscResources", 1L, 10),
                getModItem(MagicBees.ID, "miscResources", 3L, 22),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 16),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 16),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 16),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 16),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 16),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 16))
            .itemOutputs(getModItem(MagicBees.ID, "frameResilient", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Necrotic Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 27019),
                getModItem(MagicBees.ID, "frameMagic", 1L),
                getModItem(MagicBees.ID, "miscResources", 1L, 8),
                getModItem(MagicBees.ID, "miscResources", 3L, 23),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 16),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 16),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 16),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 16),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 16),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 16))
            .itemOutputs(getModItem(MagicBees.ID, "frameNecrotic", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Metabolic Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 27019),
                getModItem(MagicBees.ID, "frameMagic", 1L),
                getModItem(MagicBees.ID, "miscResources", 1L, 12),
                getModItem(MagicBees.ID, "miscResources", 3L, 20),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 16),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 16),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 16),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 16),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 16),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 16))
            .itemOutputs(getModItem(MagicBees.ID, "frameMetabolic", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Temporal Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 27019),
                getModItem(MagicBees.ID, "frameMagic", 1L),
                getModItem(MagicBees.ID, "miscResources", 1L, 9),
                getModItem(MagicBees.ID, "miscResources", 3L, 21),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 16),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 16),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 16),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 16),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 16),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 16))
            .itemOutputs(getModItem(MagicBees.ID, "frameTemporal", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Oblivion Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 27306),
                getModItem(MagicBees.ID, "frameMagic", 1L),
                getModItem(MagicBees.ID, "miscResources", 1L, 11),
                getModItem(MagicBees.ID, "miscResources", 3L, 19),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 32),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 32),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 32),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 32),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 32),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 32))
            .itemOutputs(getModItem(MagicBees.ID, "frameOblivion", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Thaumium Scoop"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 6L, 23330),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 7),
                Single_Use_Cutter,
                Single_Use_Hammer,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 10),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10))
            .itemOutputs(getModItem(MagicBees.ID, "item.thaumiumScoop", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Void Scoop"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 6L, 23970),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 7),
                Single_Use_Cutter,
                Single_Use_Hammer,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 20),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20))
            .itemOutputs(getModItem(MagicBees.ID, "item.voidScoop", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Thaumium Grafter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 23330),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17330),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 2),
                Single_Use_Hammer,
                Single_Use_File,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 15),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 15))
            .itemOutputs(getModItem(MagicBees.ID, "item.thaumiumGrafter", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Void Grafter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 23970),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17970),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 16),
                Single_Use_Hammer,
                Single_Use_File,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 30),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 30))
            .itemOutputs(getModItem(MagicBees.ID, "item.voidGrafter", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Enchanted Earth"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(MagicBees.ID, "miscResources", 1L, 7),
                getModItem(Minecraft.ID, "dirt", 4L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 10),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10))
            .itemOutputs(getModItem(MagicBees.ID, "magicbees.enchantedEarth", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Minecraft
        // "Enchantment Table"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(IndustrialCraft2.ID, "itemDensePlates", 1L, 7),
                getModItem(Minecraft.ID, "bookshelf", 1L),
                getModItem(Minecraft.ID, "carpet", 1L, 14),
                getModItem(Minecraft.ID, "diamond", 4L),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 0),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 45),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 45),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 45),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 45),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 45),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 45))
            .itemOutputs(getModItem(Minecraft.ID, "enchanting_table", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Brewing Stand"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 23019),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 27019),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 28019),
                getModItem(GregTech.ID, "gt.metaitem.02", 2L, 22801),
                getModItem(Minecraft.ID, "cauldron", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 20),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 20),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 20))
            .itemOutputs(getModItem(Minecraft.ID, "brewing_stand", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // OpenBlocks
        // "Auto Enchantment Table"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17308),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17526),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 27019),
                getModItem(Minecraft.ID, "book", 1L),
                getModItem(Minecraft.ID, "enchanting_table", 1),
                getModItem(Minecraft.ID, "redstone_block", 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 75),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 75),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 75),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 75))
            .itemOutputs(getModItem(OpenBlocks.ID, "autoenchantmenttable", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // TaintedMagic
        // "Shadowmetal Sword"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17368),
                getModItem(Minecraft.ID, "stick", 1L),
                Single_Use_File,
                Single_Use_Hammer,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 30),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 45))
            .itemOutputs(getModItem(TaintedMagic.ID, "ItemShadowmetalSword", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Thaumic Alloy"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17330),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17368),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17970),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 6),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 75),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 75))
            .itemOutputs(getModItem(TaintedMagic.ID, "ItemMaterial", 1L, 6))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Crystal Dagger"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Forestry.ID, "oakStick", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 27330),
                getModItem(Thaumcraft.ID, "blockTube", 1L, 7),
                Single_Use_Screwdriver,
                Single_Use_Wrench,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 50),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 100),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 100),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 50),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 100))
            .itemOutputs(getModItem(TaintedMagic.ID, "ItemCrystalDagger", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Thaumcraft
        // "Golem Upgrade: Air"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Minecraft.ID, "gold_nugget", 4L),
                getModItem(Thaumcraft.ID, "ItemNugget", 2L, 5),
                getModItem(Thaumcraft.ID, "ItemNugget", 2L, 6),
                Air_Crystal_Cluster,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemGolemUpgrade", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Golem Upgrade: Earth"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Minecraft.ID, "gold_nugget", 4L),
                getModItem(Thaumcraft.ID, "ItemNugget", 2L, 5),
                getModItem(Thaumcraft.ID, "ItemNugget", 2L, 6),
                Earth_Crystal_Cluster,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemGolemUpgrade", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Golem Upgrade: Fire"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Minecraft.ID, "gold_nugget", 4L),
                getModItem(Thaumcraft.ID, "ItemNugget", 2L, 5),
                getModItem(Thaumcraft.ID, "ItemNugget", 2L, 6),
                Fire_Crystal_Cluster,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemGolemUpgrade", 1L, 2))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Golem Upgrade: Water"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Minecraft.ID, "gold_nugget", 4L),
                getModItem(Thaumcraft.ID, "ItemNugget", 2L, 5),
                getModItem(Thaumcraft.ID, "ItemNugget", 2L, 6),
                Water_Crystal_Cluster,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemGolemUpgrade", 1L, 3))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Golem Upgrade: Order"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Minecraft.ID, "gold_nugget", 4L),
                getModItem(Thaumcraft.ID, "ItemNugget", 2L, 5),
                getModItem(Thaumcraft.ID, "ItemNugget", 2L, 6),
                Order_Crystal_Cluster,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemGolemUpgrade", 1L, 4))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Golem Upgrade: Entropy"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Minecraft.ID, "gold_nugget", 4L),
                getModItem(Thaumcraft.ID, "ItemNugget", 2L, 5),
                getModItem(Thaumcraft.ID, "ItemNugget", 2L, 6),
                Entropy_Crystal_Cluster,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 15))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemGolemUpgrade", 1L, 5))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Crusted Stone"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Minecraft.ID, "mossy_cobblestone", 4L),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 6),
                getModItem(Thaumcraft.ID, "ItemResource", 4L, 14),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 50),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 50))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockCosmeticSolid", 4L, 14))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Glowing Crusted Stone"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Minecraft.ID, "glowstone_dust", 4L),
                getModItem(Thaumcraft.ID, "ItemResource", 4L, 1),
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 1L, 14),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 25),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 25),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 25),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 25))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockEldritch", 3L, 4))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Ancient Stone"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 6L, 6),
                getModItem(Thaumcraft.ID, "blockEldritch", 2L, 4),
                getModItem(Thaumcraft.ID, "ItemEldritchObject", 1L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 6),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 6),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 12))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockCosmeticSolid", 6L, 11))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Essentia Resonator"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 23330),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 27330),
                getModItem(Minecraft.ID, "stick", 1L),
                getModItem(Thaumcraft.ID, "ItemNugget", 1L, 5),
                Single_Use_File,
                Single_Use_Screwdriver,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 8),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 8))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemResonator", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Node Stabilizer"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Botania.ID, "quartzTypeLavender", 2L, 0),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17330),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32640),
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 24086),
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 2L, 7),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 35),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 35),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 25))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockStoneDevice", 1L, 9))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Air Crystal Cluster"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(Air_Shard, 7),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 10),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 5),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 5))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockCrystal", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Fire Crystal Cluster"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(Fire_Shard, 7),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 5),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 10),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 5))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockCrystal", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Water Crystal Cluster"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(Water_Shard, 7),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 5),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 5),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 5))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockCrystal", 1L, 2))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Earth Crystal Cluster"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(Earth_Shard, 7),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 5),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 5),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 5))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockCrystal", 1L, 3))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Order Crystal Cluster"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(Order_Shard, 7),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 5),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 5),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 5))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockCrystal", 1L, 4))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Entropy Crystal Cluster"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(Entropy_Shard, 7),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 5),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 5),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 10))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockCrystal", 1L, 5))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Mixed Crystal Cluster"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                Air_Shard,
                Fire_Shard,
                Water_Shard,
                Earth_Shard,
                Order_Shard,
                Entropy_Shard,
                setStackSize(Balanced_Shard, 3),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 10),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 10),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 10))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockCrystal", 1L, 6))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Alchemical Furnace"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(EtFuturumRequiem.ID, "blast_furnace", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17330),
                getModItem(Railcraft.ID, "machine.beta", 1L, 3),
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 4L, 7),
                getModItem(Thaumcraft.ID, "blockMetalDevice", 1L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockStoneDevice", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Arcane Pedestal"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 7L, 6),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 20))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockStoneDevice", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Runic Matrix"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Minecraft.ID, "ender_eye", 1L),
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 4L, 7),
                getModItem(Thaumcraft.ID, "blockCrystal", 4L, 6),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 40),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 40),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 40),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 40),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 40),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 40))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockStoneDevice", 1L, 2))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Crucible
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 5L, 17330),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 27032),
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29514),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 14),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 2),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 2),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 2))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockMetalDevice", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Arcane Alembic"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.blockmachines", 2L, 5132),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17330),
                getModItem(Railcraft.ID, "machine.beta", 1L, 3),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 8),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 5),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 10))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockMetalDevice", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Alchemical Construct"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.blockmetal7", 1L, 4),
                getModItem(Thaumcraft.ID, "blockTube", 4L, 0),
                getModItem(Thaumcraft.ID, "blockTube", 2L, 1),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 8),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 5),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockMetalDevice", 1L, 9))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Advanced Alchemical Construct"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17970),
                getModItem(Thaumcraft.ID, "blockMetalDevice", 4L, 9),
                getModItem(Thaumcraft.ID, "ItemEldritchObject", 1L, 3),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 32),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 32),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 32),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 32))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockMetalDevice", 4L, 3))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Mnemonic Matrix"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17330),
                getModItem(GregTech.ID, "gt.metaitem.02", 4L, 29514),
                getModItem(Thaumcraft.ID, "ItemZombieBrain", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 10),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockMetalDevice", 1L, 12))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Essentia Tube"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 5131),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 27330),
                getModItem(Minecraft.ID, "gold_nugget", 2L),
                getModItem(Thaumcraft.ID, "ItemNugget", 2L, 5),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 8),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 8))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockTube", 4L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Essentia Valve"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17880),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 27330),
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 20330),
                getModItem(Minecraft.ID, "lever", 1L),
                getModItem(Thaumcraft.ID, "blockTube", 1L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 8),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 8))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockTube", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Alchemical Centrifuge"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 27330),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32641),
                getModItem(Thaumcraft.ID, "blockMetalDevice", 1L, 1),
                getModItem(Thaumcraft.ID, "blockMetalDevice", 1L, 9),
                getModItem(Thaumcraft.ID, "blockTube", 2L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 16),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 32),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 16))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockTube", 1L, 2))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Filtered Essentia Tube"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 27330),
                getModItem(Thaumcraft.ID, "blockTube", 1L, 0),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 8),
                Single_Use_File,
                Single_Use_Screwdriver,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 16),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 16))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockTube", 1L, 3))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Essentia Buffer"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 27330),
                getModItem(Thaumcraft.ID, "blockTube", 2L, 0),
                getModItem(Thaumcraft.ID, "blockTube", 1L, 1),
                getModItem(Thaumcraft.ID, "blockTube", 1L, 5),
                getModItem(Thaumcraft.ID, "ItemEssence", 4L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockTube", 4L, 4))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Restricted Essentia Tube"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 28880),
                getModItem(Thaumcraft.ID, "blockTube", 1L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 16),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 16))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockTube", 1L, 5))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Directional Essentia Tube"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 27330),
                getModItem(Minecraft.ID, "dye", 1L, 4),
                getModItem(Thaumcraft.ID, "blockTube", 1L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 8),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 16),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 8))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockTube", 1L, 6))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Essentia Crystallizer"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17330),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 27330),
                getModItem(Minecraft.ID, "dispenser", 1L),
                getModItem(Thaumcraft.ID, "blockCrystal", 2L, 6),
                getModItem(Thaumcraft.ID, "blockMetalDevice", 1L, 9),
                getModItem(Thaumcraft.ID, "blockTube", 1L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 20),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 15))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockTube", 1L, 7))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Enchanted Fabric"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Minecraft.ID, "string", 6L),
                getModItem(PamsHarvestCraft.ID, "wovencottonItem", 3L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 5),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 5),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 5))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemResource", 1L, 7))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Vis Filter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17086),
                getModItem(GregTech.ID, "gt.metaitem.02", 4L, 23086),
                getModItem(Thaumcraft.ID, "blockWoodenDevice", 3L, 7),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemResource", 3L, 8))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Mirrored Glass"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.98", 4L, 3),
                getModItem(Minecraft.ID, "glass_pane", 1L),
                getModItem(Thaumcraft.ID, "ItemResource", 4L, 3),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 30),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 30))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemResource", 1L, 10))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Arcane Bellows"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Backpack.ID, "tannedLeather", 2L),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32640),
                getModItem(Thaumcraft.ID, "blockCosmeticSlabWood", 4L, 0),
                setStackSize(Air_Shard, 2),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockWoodenDevice", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Mundane Amulet"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 27086),
                getModItem(GregTech.ID, "gt.metaitem.02", 5L, 19086),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 6),
                Single_Use_Screwdriver,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemBaubleBlanks", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Primal Charm"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 28351),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 0),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 1),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 2),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 3),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 4),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 5),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 6),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 50),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 50),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 50),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 50))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemResource", 1L, 15))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Obsidian Tile"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Minecraft.ID, "obsidian", 4L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 4),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 4))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockCosmeticSolid", 4L, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Paving Stone of Travel"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17540),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17542),
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 1L, 7),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 12),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 12),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 12))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockCosmeticSolid", 4L, 2))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Paving Stone of Warding"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17541),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17545),
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 1L, 7),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 12),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 12),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 12))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockCosmeticSolid", 4L, 3))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Mundane Belt"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 27086),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 28086),
                getModItem(PamsHarvestCraft.ID, "hardenedleatherItem", 2L),
                Single_Use_Screwdriver,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemBaubleBlanks", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Focus Pouch"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 26086),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 28086),
                getModItem(PamsHarvestCraft.ID, "hardenedleatherItem", 5L),
                getModItem(Thaumcraft.ID, "ItemBaubleBlanks", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 20))
            .itemOutputs(getModItem(Thaumcraft.ID, "FocusPouch", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Item Grate"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 2000),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 27305),
                getModItem(NewHorizonsCoreMod.ID, "item.AluminiumBars", 1L),
                getModItem(NewHorizonsCoreMod.ID, "item.SteelBars", 2L),
                Single_Use_Screwdriver,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockMetalDevice", 1L, 5))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Hungry Chest"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 27330),
                getModItem(Minecraft.ID, "chest", 1L),
                getModItem(Thaumcraft.ID, "blockMetalDevice", 1L, 5),
                getModItem(Thaumcraft.ID, "ItemZombieBrain", 2L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 10),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 5))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockChestHungry", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Arcane Stone Block"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Minecraft.ID, "stone", 64L),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 6),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 8),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 8),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 8),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 8),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 8),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 8))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockCosmeticSolid", 64L, 6))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Warded Glass"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17330),
                getModItem(Minecraft.ID, "glass", 4L),
                getModItem(Thaumcraft.ID, "blockWoodenDevice", 2L, 6),
                getModItem(Thaumcraft.ID, "FocusWarding"),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 10),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 10),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 10))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockCosmeticOpaque", 4L, 2))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "White Tallow Candle"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Minecraft.ID, "string", 1L),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 4),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 3),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 3),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 1),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 1))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockCandle", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Goggles of Revealing"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 23086),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 27086),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 28086),
                getModItem(PamsHarvestCraft.ID, "hardenedleatherItem", 2L),
                getModItem(Thaumcraft.ID, "ItemThaumometer", 2L),
                Single_Use_Screwdriver,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 30),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 30),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 30),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 30))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemGoggles", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Golem Animation Core"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17330),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17522),
                getModItem(Minecraft.ID, "brick", 2L),
                getModItem(Minecraft.ID, "netherbrick", 2L),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemGolemCore", 1L, 100))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Thaumonomicon
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Minecraft.ID, "gold_nugget", 4L),
                getModItem(Minecraft.ID, "writable_book", 1L),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 7),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 9),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 14),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 2),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 2),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 2))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemThaumonomicon", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // ThaumicBases
        // "Ancient Gold Block"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Minecraft.ID, "gold_block", 8L),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 5),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 5))
            .itemOutputs(getModItem(ThaumicBases.ID, "oldGold", 8L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Thaumium Anvil"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.blockmetal7", 5L, 4),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17330),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 27330),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 50),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 50),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 50),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 50))
            .itemOutputs(getModItem(ThaumicBases.ID, "thaumicAnvil", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // ThaumicEnergistics
        // "Diffusion Core"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 44),
                getModItem(Thaumcraft.ID, "blockCrystal", 2L, 5),
                getModItem(Thaumcraft.ID, "ItemResource", 4L, 3),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 6),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 20),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 20))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "material", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Coalescence Core"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 43),
                getModItem(Thaumcraft.ID, "blockCrystal", 2L, 4),
                getModItem(Thaumcraft.ID, "ItemResource", 4L, 3),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 6),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "material", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Essentia Level Emitter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1L, 280),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 14),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "part.base", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Essentia Vibration Chamber"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(AppliedEnergistics2.ID, "tile.BlockVibrationChamber", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17544),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17545),
                getModItem(Thaumcraft.ID, "blockJar", 1L, 0),
                getModItem(ThaumicEnergistics.ID, "material", 2L, 0),
                getModItem(ThaumicEnergistics.ID, "part.base", 1L, 4),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 35),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 35),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 35),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 35))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "thaumicenergistics.block.essentia.vibration.chamber", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Essentia Terminal"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 22),
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 23),
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1L, 380),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17543),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 8),
                getModItem(ThaumicEnergistics.ID, "material", 1L, 0),
                getModItem(ThaumicEnergistics.ID, "material", 1L, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 25),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 25),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 25),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 25))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "part.base", 1L, 4))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Essentia Import Bus"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1L, 240),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17545),
                getModItem(Thaumcraft.ID, "blockCosmeticOpaque", 2L, 2),
                getModItem(Thaumcraft.ID, "blockJar", 2L, 0),
                getModItem(Thaumcraft.ID, "blockTube", 1L, 3),
                getModItem(ThaumicEnergistics.ID, "material", 1L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 15),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 15))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "part.base", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Essentia Export Bus"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1L, 260),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17545),
                getModItem(Thaumcraft.ID, "blockCosmeticOpaque", 2L, 2),
                getModItem(Thaumcraft.ID, "blockJar", 2L, 0),
                getModItem(Thaumcraft.ID, "blockTube", 1L, 3),
                getModItem(ThaumicEnergistics.ID, "material", 1L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 15),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 15))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "part.base", 1L, 3))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Essentia Storage Bus"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1L, 220),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17543),
                getModItem(Thaumcraft.ID, "blockJar", 2L, 0),
                getModItem(Thaumcraft.ID, "blockTube", 1L, 3),
                getModItem(ThaumicEnergistics.ID, "material", 1L, 0),
                getModItem(ThaumicEnergistics.ID, "material", 1L, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 20),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "part.base", 1L, 2))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "1k ME Essentia Storage Component"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(NewHorizonsCoreMod.ID, "item.EngineeringProcessorEssentiaPulsatingCore"),
                getModItem(Thaumcraft.ID, "ItemResource", 4L, 14),
                new Object[] { OrePrefixes.circuit.get(Materials.ULV), 4L },
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 10),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "storage.component", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "4k ME Essentia Storage Component"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(NewHorizonsCoreMod.ID, "item.EngineeringProcessorEssentiaPulsatingCore"),
                getModItem(ThaumicEnergistics.ID, "storage.component", 4L, 0),
                new Object[] { OrePrefixes.circuit.get(Materials.LV), 4L },
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 20),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "storage.component", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "16k ME Essentia Storage Component"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(NewHorizonsCoreMod.ID, "item.EngineeringProcessorEssentiaPulsatingCore"),
                getModItem(ThaumicEnergistics.ID, "storage.component", 4L, 1),
                new Object[] { OrePrefixes.circuit.get(Materials.MV), 4L },
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 30),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 30))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "storage.component", 1L, 2))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "64k ME Essentia Storage Component"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(NewHorizonsCoreMod.ID, "item.EngineeringProcessorEssentiaPulsatingCore"),
                getModItem(ThaumicEnergistics.ID, "storage.component", 4L, 2),
                new Object[] { OrePrefixes.circuit.get(Materials.HV), 4L },
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 40),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 40),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 40))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "storage.component", 1L, 3))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "256k ME Essentia Storage Component"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(NewHorizonsCoreMod.ID, "item.EngineeringProcessorEssentiaPulsatingCore"),
                getModItem(ThaumicEnergistics.ID, "storage.component", 4L, 3),
                new Object[] { OrePrefixes.circuit.get(Materials.EV), 4L },
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 50),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 50))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "storage.component", 1L, 5))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "1024k ME Essentia Storage Component"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(NewHorizonsCoreMod.ID, "item.EngineeringProcessorEssentiaPulsatingCore"),
                getModItem(ThaumicEnergistics.ID, "storage.component", 4L, 5),
                new Object[] { OrePrefixes.circuit.get(Materials.IV), 4L },
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 60),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 60),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 60))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "storage.component", 1L, 6))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "4096k ME Essentia Storage Component"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(NewHorizonsCoreMod.ID, "item.EngineeringProcessorEssentiaPulsatingCore"),
                getModItem(ThaumicEnergistics.ID, "storage.component", 4L, 6),
                new Object[] { OrePrefixes.circuit.get(Materials.LuV), 4L },
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 70),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 70),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 70))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "storage.component", 1L, 7))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "16384k ME Essentia Storage Component"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(NewHorizonsCoreMod.ID, "item.EngineeringProcessorEssentiaPulsatingCore"),
                getModItem(ThaumicEnergistics.ID, "storage.component", 4L, 7),
                new Object[] { OrePrefixes.circuit.get(Materials.UV), 4L },
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 80),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 80),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 80))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "storage.component", 1L, 8))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "ME Essentia Storage Housing"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 3L, 17330),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17541),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17542),
                getModItem(Thaumcraft.ID, "blockCosmeticOpaque", 2L, 2),
                getModItem(TinkerConstruct.ID, "GlassPane", 1, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 10),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "storage.casing", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "1k ME Essentia Storage Cell"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(ThaumicEnergistics.ID, "storage.casing", 1L),
                getModItem(ThaumicEnergistics.ID, "storage.component", 1L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 5),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "storage.essentia", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "4k ME Essentia Storage Cell"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(ThaumicEnergistics.ID, "storage.casing", 1L),
                getModItem(ThaumicEnergistics.ID, "storage.component", 1L, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 15),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 15))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "storage.essentia", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "16k ME Essentia Storage Cell"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(ThaumicEnergistics.ID, "storage.casing", 1L),
                getModItem(ThaumicEnergistics.ID, "storage.component", 1L, 2),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 25),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 25),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 25))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "storage.essentia", 1L, 2))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "64k ME Essentia Storage Cell"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(ThaumicEnergistics.ID, "storage.casing", 1L),
                getModItem(ThaumicEnergistics.ID, "storage.component", 1L, 3),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 35),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 35),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 35))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "storage.essentia", 1L, 3))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "256k ME Essentia Storage Cell"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(ThaumicEnergistics.ID, "storage.casing", 1L),
                getModItem(ThaumicEnergistics.ID, "storage.component", 1L, 5),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 45),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 45),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 45))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "storage.essentia", 1L, 5))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "1024k ME Essentia Storage Cell"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(ThaumicEnergistics.ID, "storage.casing", 1L),
                getModItem(ThaumicEnergistics.ID, "storage.component", 1L, 6),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 55),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 55),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 55))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "storage.essentia", 1L, 6))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "4096k ME Essentia Storage Cell"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(ThaumicEnergistics.ID, "storage.casing", 1L),
                getModItem(ThaumicEnergistics.ID, "storage.component", 1L, 7),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 65),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 65),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 65))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "storage.essentia", 1L, 7))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "16384k ME Essentia Storage Cell"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(ThaumicEnergistics.ID, "storage.casing", 1L),
                getModItem(ThaumicEnergistics.ID, "storage.component", 1L, 8),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 75),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 75),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 75))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "storage.essentia", 1L, 8))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Essentia Cell Workbench"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(AppliedEnergistics2.ID, "tile.BlockCellWorkbench", 1L),
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 22),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17545),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 27542),
                getModItem(ThaumicEnergistics.ID, "storage.component", 1L, 0),
                Single_Use_Screwdriver,
                Single_Use_Wrench,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "thaumicenergistics.block.essentia.cell.workbench", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Vis Relay Interface"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1L, 440),
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1L, 460),
                getModItem(GregTech.ID, "gt.metaitem.01", 3L, 17545),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 27542),
                getModItem(Thaumcraft.ID, "blockCrystal", 2L, 6),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 20),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 20),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 20))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "part.base", 1L, 6))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Knowledge Core"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 23),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17543),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17545),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 6),
                getModItem(Thaumcraft.ID, "ItemZombieBrain", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 10),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "knowledge.core", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Knowledge Inscriber"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiPart", 1L, 400),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17330),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17544),
                getModItem(Thaumcraft.ID, "ItemThaumonomicon", 1L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 20),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 20),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 20))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "thaumicenergistics.block.knowledge.inscriber", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // ThaumicHorizons
        // "Planar Conduit"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17533),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17970),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 15),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 75),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 75),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 75),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 75),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 75),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 75))
            .itemOutputs(getModItem(ThaumicHorizons.ID, "planarConduit", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // ThaumicTinkerer
        // "Transvector Interface"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.blockmachines", 2L, 5133),
                getModItem(GregTech.ID, "gt.blockmachines", 2L, 5613),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32670),
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 4L, 6),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 16),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 32),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 32))
            .itemOutputs(getModItem(ThaumicTinkerer.ID, "interface", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Dynamism Tablet"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17303),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17330),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17351),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 27330),
                getModItem(Thaumcraft.ID, "ItemGolemCore", 1L, 100),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 35),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20))
            .itemOutputs(getModItem(ThaumicTinkerer.ID, "animationTablet", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Ichorcloth
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 29317),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 29970),
                getModItem(GregTech.ID, "gt.metaitem.02", 2L, 29500),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 7),
                getModItem(ThaumicTinkerer.ID, "kamiResource", 2L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 125),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 125),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 125),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 125),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 125),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 125))
            .itemOutputs(getModItem(ThaumicTinkerer.ID, "kamiResource", 2L, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Transvector Dislocator"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17532),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 27330),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 10),
                getModItem(ThaumicTinkerer.ID, "interface", 1L),
                new Object[] { OrePrefixes.circuit.get(Materials.LV), 2L },
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 24),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 48),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 48))
            .itemOutputs(getModItem(ThaumicTinkerer.ID, "dislocator", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // TinkerConstruct
        // "Silky Cloth"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 29086),
                getModItem(Minecraft.ID, "string", 4L),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 7),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 30),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 15),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 25),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 10))
            .itemOutputs(getModItem(TinkerConstruct.ID, "materials", 1L, 25))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Red Heart Canister"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Minecraft.ID, "golden_apple", 1L, 0),
                getModItem(TinkerConstruct.ID, "heartCanister", 1L, 0),
                getModItem(TinkerConstruct.ID, "heartCanister", 1L, 1),
                getModItem(TinkerConstruct.ID, "materials", 1L, 8),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 50),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 50),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 50),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 50))
            .itemOutputs(getModItem(TinkerConstruct.ID, "heartCanister", 1L, 2))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Yellow Heart Canister"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Minecraft.ID, "golden_apple", 2L, 1),
                getModItem(TinkerConstruct.ID, "heartCanister", 1L, 0),
                getModItem(TinkerConstruct.ID, "heartCanister", 1L, 3),
                getModItem(TinkerConstruct.ID, "materials", 2L, 8),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 100),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 100),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 100),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 100),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 100),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 100))
            .itemOutputs(getModItem(TinkerConstruct.ID, "heartCanister", 1L, 4))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Green Heart Canister"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(TinkerConstruct.ID, "diamondApple", 3L, 0),
                getModItem(TinkerConstruct.ID, "heartCanister", 1L, 0),
                getModItem(TinkerConstruct.ID, "heartCanister", 1L, 5),
                getModItem(TinkerConstruct.ID, "materials", 4L, 8),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 200),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 200),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 200),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 200),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 200),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 200))
            .itemOutputs(getModItem(TinkerConstruct.ID, "heartCanister", 1L, 6))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Witchery
        // "Attuned Stone"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Botania.ID, "manaResource", 1L, 2),
                getModItem(Minecraft.ID, "lava_bucket", 1L),
                getModItem(Witchery.ID, "ingredient", 1L, 34),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 30),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 30))
            .itemOutputs(getModItem(Witchery.ID, "ingredient", 1L, 10))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Candelabra
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17032),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 23032),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 23330),
                getModItem(Thaumcraft.ID, "blockCandle", 3L, 0),
                getModItem(Witchery.ID, "ingredient", 1L, 10),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5))
            .itemOutputs(getModItem(Witchery.ID, "ingredient", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Chalice
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 3L, 17086),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 29086),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 29330),
                getModItem(Minecraft.ID, "gold_ingot", 1L),
                getModItem(Witchery.ID, "ingredient", 1L, 10),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 10),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5))
            .itemOutputs(getModItem(Witchery.ID, "ingredient", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Fume Filter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17330),
                getModItem(Minecraft.ID, "glass_pane", 6L),
                getModItem(Witchery.ID, "ingredient", 1L, 10),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 16),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 16),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 16))
            .itemOutputs(getModItem(Witchery.ID, "ingredient", 1L, 73))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Kettle
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17305),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 27330),
                getModItem(Minecraft.ID, "cauldron", 1L),
                getModItem(NewHorizonsCoreMod.ID, "item.SteelBars", 1L),
                getModItem(Witchery.ID, "ingredient", 1L, 10),
                Single_Use_Hammer,
                Single_Use_Screwdriver,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 40),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 40),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 40),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 40))
            .itemOutputs(getModItem(Witchery.ID, "kettle", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Spinning Wheel"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 23306),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 27306),
                getModItem(Minecraft.ID, "item_frame", 3L),
                getModItem(Witchery.ID, "ingredient", 1L, 10),
                Single_Use_Screwdriver,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 60),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 60),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 60),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 60))
            .itemOutputs(getModItem(Witchery.ID, "spinningwheel", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Distillery
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(EtFuturumRequiem.ID, "blast_furnace", 1L),
                getModItem(GregTech.ID, "gt.blockmachines", 2L, 5141),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 22330),
                getModItem(Witchery.ID, "cauldron", 1L),
                getModItem(Witchery.ID, "ingredient", 1L, 10),
                getModItem(Witchery.ID, "ingredient", 2L, 27),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 80),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 80),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 80),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 80),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 80))
            .itemOutputs(getModItem(Witchery.ID, "distilleryidle", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Witch's Cauldron"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Thaumcraft.ID, "blockMetalDevice", 1L, 0),
                getModItem(Witchery.ID, "ingredient", 1L, 153),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 2),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 2),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 2))
            .itemOutputs(getModItem(Witchery.ID, "cauldron", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Ritual Chalk"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Witchery.ID, "ingredient", 2L, 17),
                getModItem(Witchery.ID, "ingredient", 6L, 18),
                getModItem(Witchery.ID, "ingredient", 1L, 37),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 50),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 25),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 25))
            .itemOutputs(getModItem(Witchery.ID, "chalkritual", 2L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Circle Talisman"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 23086),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 27086),
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30500),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 50))
            .itemOutputs(getModItem(Witchery.ID, "circletalisman", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Altar
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 1L, 6),
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 4L, 7),
                getModItem(Witchery.ID, "ingredient", 1L, 31),
                getModItem(Witchery.ID, "ingredient", 1L, 32),
                getModItem(Witchery.ID, "witchlog", 2L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20))
            .itemOutputs(getModItem(Witchery.ID, "altar", 2L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Arthana
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 27330),
                getModItem(Minecraft.ID, "emerald", 1L),
                getModItem(TinkerConstruct.ID, "handGuard", 2L, 16),
                getModItem(TinkerConstruct.ID, "knifeBlade", 1L, 202),
                getModItem(TinkerConstruct.ID, "toolRod", 1L, 6),
                Single_Use_Hammer,
                Single_Use_Screwdriver,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 15))
            .itemOutputs(getModItem(Witchery.ID, "arthana", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Fume Funnel"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.blockmetal6", 2L, 13),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17330),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17811),
                getModItem(Minecraft.ID, "lava_bucket", 1L),
                getModItem(NewHorizonsCoreMod.ID, "item.SteelBars", 2L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 30),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 30))
            .itemOutputs(getModItem(Witchery.ID, "fumefunnel", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // WitchingGadgets
        // "Spinning Wheel"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 23889),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 27305),
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 20330),
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 22889),
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 31889),
                getModItem(Thaumcraft.ID, "blockTable", 3L, 0),
                Single_Use_Screwdriver,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10))
            .itemOutputs(getModItem(WitchingGadgets.ID, "WG_WoodenDevice", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Jar
        // "Warded Jar"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17880),
                getModItem(Minecraft.ID, "glass_pane", 7L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 2))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockJar", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Wand Focus
        // "Wand Focus: Crafting"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 2L, 11),
                getModItem(Thaumcraft.ID, "blockCrystal", 2L, 3),
                getModItem(Thaumcraft.ID, "blockCrystal", 2L, 4),
                getModItem(Thaumcraft.ID, "blockTable", 1L, 15),
                setStackSize(Balanced_Shard, 2),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 20),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 40),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 50),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 30))
            .itemOutputs(getModItem(Automagy.ID, "focusCrafting", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Wand Focus: Kris-tmas"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 2702),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 2728),
                getModItem(Minecraft.ID, "pumpkin", 4L),
                getModItem(Thaumcraft.ID, "FocusFrost", 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 25),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 25),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 25))
            .itemOutputs(getModItem(ElectroMagicTools.ID, "ChristmasFocus", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Wand Focus: Vis Shard"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(TaintedMagic.ID, "ItemMaterial", 2L, 3),
                getModItem(TaintedMagic.ID, "ItemMaterial", 2L, 4),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3),
                setStackSize(EssenceList.Ethereal_Essence_Aer, 2),
                setStackSize(Mixed_Crystal_Cluster, 2),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 50),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 50))
            .itemOutputs(getModItem(TaintedMagic.ID, "ItemFocusVisShard", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Wand Focus: Fire"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Botania.ID, "quartz", 4L, 2),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 24502),
                setStackSize(Fire_Crystal_Cluster, 4),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 20))
            .itemOutputs(getModItem(Thaumcraft.ID, "FocusFire", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Wand Focus: Shock"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Botania.ID, "quartz", 4L, 6),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 24528),
                setStackSize(Air_Crystal_Cluster, 4),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 20))
            .itemOutputs(getModItem(Thaumcraft.ID, "FocusShock", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Wand Focus: Frost"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Botania.ID, "quartz", 4L, 1),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 24500),
                setStackSize(Water_Crystal_Cluster, 4),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 20))
            .itemOutputs(getModItem(Thaumcraft.ID, "FocusFrost", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Wand Focus: Equal Trade"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Botania.ID, "quartz", 4L, 3),
                getModItem(NewHorizonsCoreMod.ID, "item.ReinforcedGlassLense", 1L),
                setStackSize(Mixed_Crystal_Cluster, 4),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 20),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 30),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 30))
            .itemOutputs(getModItem(Thaumcraft.ID, "FocusTrade", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Wand Focus: Excavation"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Botania.ID, "quartz", 4L, 6),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 24501),
                setStackSize(Earth_Crystal_Cluster, 4),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 20))
            .itemOutputs(getModItem(Thaumcraft.ID, "FocusExcavation", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Wand Focus: Primal"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30500),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 15),
                Air_Crystal_Cluster,
                Fire_Crystal_Cluster,
                Water_Crystal_Cluster,
                Earth_Crystal_Cluster,
                Order_Crystal_Cluster,
                Entropy_Crystal_Cluster,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 75),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 75),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 75),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 75),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 75),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 75))
            .itemOutputs(getModItem(Thaumcraft.ID, "FocusPrimal", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Wand Focus: Ender Rift"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17321),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17506),
                getModItem(Thaumcraft.ID, "blockMirror", 1, 0),
                getModItem(Thaumcraft.ID, "FocusPortableHole", 1),
                getModItem(Thaumcraft.ID, "ItemResource", 4L, 14),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 50),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 50))
            .itemOutputs(getModItem(ThaumicTinkerer.ID, "focusEnderChest", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Wand Focus: Efreet's Flame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                getModItem(Minecraft.ID, "furnace", 1L),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 1),
                getModItem(Thaumcraft.ID, "ItemResource", 4L, 14),
                getModItem(Thaumcraft.ID, "FocusExcavation", 1L),
                getModItem(Thaumcraft.ID, "FocusFire", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 8),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 16),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 12),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 12))
            .itemOutputs(getModItem(ThaumicTinkerer.ID, "focusSmelt", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);
        /*
         * //
         * GTValues.RA.stdBuilder()
         * .itemInputs(
         * // Arcane Worktable Item 0-9
         * new ItemStack(Blocks.air, 0),
         * new ItemStack(Blocks.air, 0),
         * new ItemStack(Blocks.air, 0),
         * new ItemStack(Blocks.air, 0),
         * new ItemStack(Blocks.air, 0),
         * new ItemStack(Blocks.air, 0),
         * new ItemStack(Blocks.air, 0),
         * new ItemStack(Blocks.air, 0),
         * new ItemStack(Blocks.air, 0),
         * new ItemStack(Blocks.air, 0),
         * // Crystallized Essence
         * setStackSize(MagicItemNBT.Crystallized_Essence_Aer, ),
         * setStackSize(MagicItemNBT.Crystallized_Essence_Terra, ),
         * setStackSize(MagicItemNBT.Crystallized_Essence_Ignis, ),
         * setStackSize(MagicItemNBT.Crystallized_Essence_Aqua, ),
         * setStackSize(MagicItemNBT.Crystallized_Essence_Ordo, ),
         * setStackSize(MagicItemNBT.Crystallized_Essence_Perditio, ))
         * .itemOutputs(getModItem(.ID, "", 1L))
         * .duration(SECONDS)
         * .eut(RECIPE_LV)
         * .addTo(addArcaneWorktableRecipes);
         */
    }
}
