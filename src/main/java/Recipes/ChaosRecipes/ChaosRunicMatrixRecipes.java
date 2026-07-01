package Recipes.ChaosRecipes;

import static gregtech.api.enums.Mods.AppliedEnergistics2;
import static gregtech.api.enums.Mods.Automagy;
import static gregtech.api.enums.Mods.Avaritia;
import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.BiomesOPlenty;
import static gregtech.api.enums.Mods.BloodArsenal;
import static gregtech.api.enums.Mods.BloodMagic;
import static gregtech.api.enums.Mods.Botania;
import static gregtech.api.enums.Mods.BuildCraftFactory;
import static gregtech.api.enums.Mods.DraconicEvolution;
import static gregtech.api.enums.Mods.ElectroMagicTools;
import static gregtech.api.enums.Mods.EnderIO;
import static gregtech.api.enums.Mods.EtFuturumRequiem;
import static gregtech.api.enums.Mods.EternalSingularity;
import static gregtech.api.enums.Mods.ExtraUtilities;
import static gregtech.api.enums.Mods.ForbiddenMagic;
import static gregtech.api.enums.Mods.Forestry;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.Gadomancy;
import static gregtech.api.enums.Mods.GoodGenerator;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.IndustrialCraft2;
import static gregtech.api.enums.Mods.IronTanks;
import static gregtech.api.enums.Mods.KekzTech;
import static gregtech.api.enums.Mods.MagicBees;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.Mods.NewHorizonsCoreMod;
import static gregtech.api.enums.Mods.PamsHarvestCraft;
import static gregtech.api.enums.Mods.Railcraft;
import static gregtech.api.enums.Mods.StevesCarts2;
import static gregtech.api.enums.Mods.TaintedMagic;
import static gregtech.api.enums.Mods.Thaumcraft;
import static gregtech.api.enums.Mods.ThaumicBases;
import static gregtech.api.enums.Mods.ThaumicEnergistics;
import static gregtech.api.enums.Mods.ThaumicExploration;
import static gregtech.api.enums.Mods.ThaumicHorizons;
import static gregtech.api.enums.Mods.ThaumicInsurgence;
import static gregtech.api.enums.Mods.ThaumicTinkerer;
import static gregtech.api.enums.Mods.TinkerConstruct;
import static gregtech.api.enums.Mods.TwilightForest;
import static gregtech.api.enums.Mods.WarpTheory;
import static gregtech.api.enums.Mods.Witchery;
import static gregtech.api.enums.Mods.WitchingGadgets;
import static gregtech.api.enums.TierEU.RECIPE_IV;
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
import util.RecipesFrontend.RunicMatrixOfChaosFrontend;

public class ChaosRunicMatrixRecipes {

    public static final RecipeMap<RecipeMapBackend> addRunicMatrixRecipes = RecipeMapBuilder.of("Chaos of Runic Matrix")
        .maxIO(35, 1, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(175))
        .frontend(RunicMatrixOfChaosFrontend::new)
        .neiTransferRect(105, 64, 20, 16)
        .build();

    public static final ItemStack Amber = getModItem(Thaumcraft.ID, "ItemResource", 1L, 6);
    public static final ItemStack Awakened_Draconium_Ingot = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11976);
    public static final ItemStack Ichorium_Ingot = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11978);
    public static final ItemStack Infinity_Ingot = getModItem(Avaritia.ID, "Resource", 1L, 6);

    public static final ItemStack Air_Shard = getModItem(Thaumcraft.ID, "ItemShard", 1L, 0);
    public static final ItemStack Fire_Shard = getModItem(Thaumcraft.ID, "ItemShard", 1L, 1);
    public static final ItemStack Water_Shard = getModItem(Thaumcraft.ID, "ItemShard", 1L, 2);
    public static final ItemStack Earth_Shard = getModItem(Thaumcraft.ID, "ItemShard", 1L, 3);
    public static final ItemStack Order_Shard = getModItem(Thaumcraft.ID, "ItemShard", 1L, 4);
    public static final ItemStack Entropy_Shard = getModItem(Thaumcraft.ID, "ItemShard", 1L, 5);
    public static final ItemStack Balanced_Shard = getModItem(Thaumcraft.ID, "ItemShard", 1L, 6);

    public static final ItemStack Air_Crystal_Cluster = getModItem(Thaumcraft.ID, "blockCrystal", 1L, 0);
    public static final ItemStack Fire_Crystal_Cluster = getModItem(Thaumcraft.ID, "blockCrystal", 1L, 1);
    public static final ItemStack Water_Crystal_Cluster = getModItem(Thaumcraft.ID, "blockCrystal", 1L, 2);
    public static final ItemStack Earth_Crystal_Cluster = getModItem(Thaumcraft.ID, "blockCrystal", 1L, 3);
    public static final ItemStack Order_Crystal_Cluster = getModItem(Thaumcraft.ID, "blockCrystal", 1L, 4);
    public static final ItemStack Entropy_Crystal_Cluster = getModItem(Thaumcraft.ID, "blockCrystal", 1L, 5);
    public static final ItemStack Mixed_Crystal_Cluster = getModItem(Thaumcraft.ID, "blockCrystal", 1L, 6);

    public static void addRunicMatrixRecipes_test() {
        // test_1
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
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
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
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
            .addTo(addRunicMatrixRecipes);

        // test_2
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
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
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
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
            .addTo(addRunicMatrixRecipes);
    }

    public static void addRunicMatrixRecipes_1() {
        // Automagy
        // "Essentia Locus"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Automagy.ID, "crystalBrain", 1L, 2),
                getModItem(Minecraft.ID, "water_bucket", 1L),
                getModItem(Thaumcraft.ID, "ItemGoggles", 1L),
                getModItem(Thaumcraft.ID, "ItemResonator", 1L),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 8),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 32),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 24),
                setStackSize(EssenceList.Crystallized_Essence_Sensus, 16),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 8),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 8))
            .itemOutputs(getModItem(Automagy.ID, "blockEssentiaLocus", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // Avaritia
        // "Akashic Records"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Avaritia.ID, "big_pearl", 2L),
                getModItem(Gadomancy.ID, "BlockKnowledgeBook", 2L),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17397),
                getModItem(TaintedMagic.ID, "ItemFocusMeteorology", 1L),
                getModItem(TaintedMagic.ID, "ItemFocusTime", 1L),
                getModItem(Thaumcraft.ID, "ItemEldritchObject", 1L, 1),
                getModItem(Thaumcraft.ID, "ItemThaumonomicon", 1L, 0),
                getModItem(ThaumicBases.ID, "knoseFragment", 8L, 6),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 512),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 128),
                setStackSize(EssenceList.Crystallized_Essence_Terminus, 128),
                setStackSize(EssenceList.Crystallized_Essence_Sensus, 96),
                setStackSize(EssenceList.Crystallized_Essence_Luxuria, 96),
                setStackSize(EssenceList.Crystallized_Essence_Tempus, 64))
            .itemOutputs(getModItem(Avaritia.ID, "Akashic_Record", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Extremely Primordial Pearl"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Thaumcraft.ID, "ItemEldritchObject", 8L, 3),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 64),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 64),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 64),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 64),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 64),
                setStackSize(EssenceList.Crystallized_Essence_Aer, 64),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 64),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 64),
                setStackSize(EssenceList.Crystallized_Essence_Terminus, 32))
            .itemOutputs(getModItem(Avaritia.ID, "big_pearl", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // Botania
        // "Shard of Laputa XX"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Botania.ID, "manaResource", 4, 4),
                getModItem(Botania.ID, "manaResource", 1, 14),
                getModItem(Botania.ID, "rune", 1L, 2),
                getModItem(Botania.ID, "rune", 1L, 3),
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30500),
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30510),
                setStackSize(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11319), 10),
                setStackSize(getModItem(NewHorizonsCoreMod.ID, "item.EngravedQuantumChip", 1L), 80),
                setStackSize(getModItem(Thaumcraft.ID, "blockCrystal", 1L, 0), 204),
                setStackSize(Awakened_Draconium_Ingot, 10),
                // Runic Item 10-19
                setStackSize(Ichorium_Ingot, 10),
                setStackSize(Infinity_Ingot, 8),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 6208),
                setStackSize(EssenceList.Crystallized_Essence_Iter, 4608),
                setStackSize(EssenceList.Crystallized_Essence_Tempestas, 1584),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 1536))
            .itemOutputs(getModItem(Botania.ID, "laputaShard", 1L, 19))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Botanical Brewery"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Botania.ID, "livingrock0Slab", 6L, 0),
                getModItem(Botania.ID, "manaGlass", 4L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(NewHorizonsCoreMod.ID, "item.EngravedQuantumChip", 2L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Machina, 32),
                setStackSize(EssenceList.Crystallized_Essence_Humanus, 16),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 16))
            .itemOutputs(getModItem(Botania.ID, "brewery", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Gaia Pylon"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Botania.ID, "manaResource", 2L, 9),
                getModItem(Botania.ID, "pylon", 1L, 0),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17324),
                getModItem(NewHorizonsCoreMod.ID, "item.EngravedManyullynCrystalChip", 4L),
                getModItem(Thaumcraft.ID, "WandCap", 2L, 7),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 64),
                setStackSize(EssenceList.Crystallized_Essence_Vinculum, 64),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 64),
                setStackSize(EssenceList.Crystallized_Essence_Tenebrae, 64),
                setStackSize(EssenceList.Crystallized_Essence_Vitreus, 64))
            .itemOutputs(getModItem(Botania.ID, "pylon", 1L, 2))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Elven Gateway Core"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Botania.ID, "alchemyCatalyst", 1L),
                getModItem(Botania.ID, "livingwood", 4L, 5),
                getModItem(Minecraft.ID, "glowstone", 2L),
                getModItem(NewHorizonsCoreMod.ID, "item.QuantumCrystal"),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17202),
                getModItem(Thaumcraft.ID, "blockMetalDevice", 4L, 9),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Iter, 64),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 64),
                setStackSize(EssenceList.Crystallized_Essence_Herba, 64),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 64),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 32))
            .itemOutputs(getModItem(Botania.ID, "alfheimPortal", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Terrestrial Agglomeration Plate"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Botania.ID, "livingrock", 2L, 0),
                getModItem(Botania.ID, "rune", 1L, 0),
                getModItem(Botania.ID, "rune", 1L, 1),
                getModItem(Botania.ID, "rune", 1L, 2),
                getModItem(Botania.ID, "rune", 1L, 3),
                getModItem(Botania.ID, "rune", 1L, 4),
                getModItem(Botania.ID, "rune", 1L, 5),
                getModItem(Botania.ID, "rune", 1L, 6),
                getModItem(Botania.ID, "rune", 1L, 7),
                getModItem(Botania.ID, "rune", 1L, 8),
                // Runic Item 10-19
                getModItem(Botania.ID, "rune", 1L, 9),
                getModItem(Botania.ID, "rune", 1L, 10),
                getModItem(Botania.ID, "rune", 1L, 11),
                getModItem(Botania.ID, "rune", 1L, 12),
                getModItem(Botania.ID, "rune", 1L, 13),
                getModItem(Botania.ID, "rune", 1L, 14),
                getModItem(Botania.ID, "rune", 1L, 15),
                getModItem(Botania.ID, "runeAltar", 1L),
                getModItem(Botania.ID, "storage", 2L, 0),
                getModItem(Minecraft.ID, "lapis_block", 2L),
                // Runic Item 20-24
                getModItem(NewHorizonsCoreMod.ID, "item.EngravedDiamondCrystalChip", 2L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 64),
                setStackSize(EssenceList.Crystallized_Essence_Lucrum, 64),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Fabrico, 32),
                setStackSize(EssenceList.Crystallized_Essence_Auram, 16))
            .itemOutputs(getModItem(Botania.ID, "terraPlate", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Runic Altar"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Botania.ID, "livingrock", 2L, 0),
                getModItem(Botania.ID, "manaResource", 2L, 0),
                getModItem(Botania.ID, "manaResource", 2L, 1),
                getModItem(Botania.ID, "manaResource", 2L, 10),
                getModItem(Thaumcraft.ID, "blockStoneDevice", 1L, 2),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Herba, 64),
                setStackSize(EssenceList.Crystallized_Essence_Fabrico, 64),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Auram, 16))
            .itemOutputs(getModItem(Botania.ID, "runeAltar", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // BloodArsenal
        // "Blood Infused Diamond Block"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(BloodArsenal.ID, "blood_infused_diamond_bound", 9L),
                getModItem(Botania.ID, "storage", 1L, 3),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 64),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 48),
                setStackSize(EssenceList.Crystallized_Essence_Ira, 32),
                setStackSize(EssenceList.Crystallized_Essence_Victus, 24),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 16),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 16))
            .itemOutputs(getModItem(BloodArsenal.ID, "blood_infused_diamond_block", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Amorphic Catalyst"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(BloodMagic.ID, "aether", 1L),
                getModItem(BloodMagic.ID, "aquasalus", 1L),
                getModItem(BloodMagic.ID, "crepitous", 1L),
                getModItem(BloodMagic.ID, "crystallos", 1L),
                getModItem(BloodMagic.ID, "incendium", 1L),
                getModItem(BloodMagic.ID, "magicales", 1L),
                getModItem(BloodMagic.ID, "reinforcedSlate", 1L),
                getModItem(BloodMagic.ID, "sanctus", 1L),
                getModItem(BloodMagic.ID, "simpleCatalyst", 1L),
                getModItem(BloodMagic.ID, "tennebrae", 1L),
                // Runic Item 10-19
                getModItem(BloodMagic.ID, "terrae", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
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
            .itemOutputs(getModItem(BloodArsenal.ID, "amorphic_catalyst", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // BloodMagic
        // "Rune of Augmented Capacity"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(BloodArsenal.ID, "blood_stone", 1L, 1),
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 4L, 8),
                getModItem(BloodMagic.ID, "imbuedSlate", 4L),
                getModItem(BuildCraftFactory.ID, "tankBlock", 2L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 32),
                setStackSize(EssenceList.Crystallized_Essence_Lucrum, 24),
                setStackSize(EssenceList.Crystallized_Essence_Fames, 18),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 12),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 8),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 4))
            .itemOutputs(getModItem(BloodMagic.ID, "AlchemicalWizardrybloodRune", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Rune of Dislocation"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(BloodArsenal.ID, "blood_stone", 1L, 1),
                getModItem(BloodMagic.ID, "aquasalus", 4L),
                getModItem(BloodMagic.ID, "imbuedSlate", 4L),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 32613),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 32),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 24),
                setStackSize(EssenceList.Crystallized_Essence_Motus, 18),
                setStackSize(EssenceList.Crystallized_Essence_Tempus, 12),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 8),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 4))
            .itemOutputs(getModItem(BloodMagic.ID, "AlchemicalWizardrybloodRune", 1L, 2))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Efficiency Rune"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(BloodArsenal.ID, "blood_stone", 3L, 3),
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 2L, 8),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 2L, 1),
                getModItem(BloodMagic.ID, "demonicSlate", 4L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 32),
                setStackSize(EssenceList.Crystallized_Essence_Victus, 24),
                setStackSize(EssenceList.Crystallized_Essence_Motus, 16),
                setStackSize(EssenceList.Crystallized_Essence_Lucrum, 8),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 4))
            .itemOutputs(getModItem(BloodMagic.ID, "AlchemicalWizardrybloodRune", 1L, 3))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Rune of Superior Capacity"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(BloodArsenal.ID, "blood_stone", 3L, 3),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 2L, 24),
                getModItem(BloodMagic.ID, "demonicSlate", 2L),
                getModItem(BloodMagic.ID, "magicales", 4L),
                getModItem(IronTanks.ID, "diamondTank", 2L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 48),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 32),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 24),
                setStackSize(EssenceList.Crystallized_Essence_Lucrum, 16),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 8),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 4))
            .itemOutputs(getModItem(BloodMagic.ID, "AlchemicalWizardrybloodRune", 1L, 4))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Rune of Acceleration"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(BloodArsenal.ID, "blood_stone", 3L, 4),
                getModItem(BloodMagic.ID, "AlchemicalWizardrybloodRune", 1L, 2),
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 2L, 8),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 2L, 24),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 2L, 27),
                getModItem(BloodMagic.ID, "speedRune", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 32614),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 64),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 48),
                setStackSize(EssenceList.Crystallized_Essence_Motus, 32),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 24),
                setStackSize(EssenceList.Crystallized_Essence_Tempus, 16),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 8),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 4))
            .itemOutputs(getModItem(BloodMagic.ID, "AlchemicalWizardrybloodRune", 1L, 5))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Rune of Quickness"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(BloodArsenal.ID, "blood_stone", 3L, 4),
                getModItem(BloodMagic.ID, "aether", 1L),
                getModItem(BloodMagic.ID, "AlchemicalWizardrybloodRune", 2L, 5),
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 8),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 2L, 24),
                getModItem(BloodMagic.ID, "speedRune", 2L),
                getModItem(GregTech.ID, "gt.blockmachines", 2L, 11105),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 96),
                setStackSize(EssenceList.Crystallized_Essence_Motus, 64),
                setStackSize(EssenceList.Crystallized_Essence_Machina, 48),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Tempus, 32),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 16),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 8))
            .itemOutputs(getModItem(BloodMagic.ID, "AlchemicalWizardrybloodRune", 1L, 6))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Speed Rune"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(BloodMagic.ID, "aether", 2L),
                getModItem(BloodMagic.ID, "AlchemicalWizardrybloodRune", 1L, 0),
                getModItem(BloodMagic.ID, "reinforcedSlate", 4L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Motus, 24),
                setStackSize(EssenceList.Crystallized_Essence_Volatus, 24),
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 18),
                setStackSize(EssenceList.Crystallized_Essence_Aer, 12),
                setStackSize(EssenceList.Crystallized_Essence_Fames, 4))
            .itemOutputs(getModItem(BloodMagic.ID, "speedRune", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Rune of Sacrifice"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(BloodArsenal.ID, "blood_stone", 1L, 1),
                getModItem(BloodMagic.ID, "imbuedSlate", 4L),
                getModItem(BloodMagic.ID, "incendium", 2L),
                getModItem(BloodMagic.ID, "tennebrae", 2L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Fames, 24),
                setStackSize(EssenceList.Crystallized_Essence_Infernus, 24),
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 18),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 12),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 4))
            .itemOutputs(getModItem(BloodMagic.ID, "runeOfSacrifice", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Rune of Self-Sacrifice"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(BloodArsenal.ID, "blood_stone", 1L, 1),
                getModItem(BloodMagic.ID, "imbuedSlate", 4L),
                getModItem(BloodMagic.ID, "sanctus", 2L),
                getModItem(BloodMagic.ID, "tennebrae", 2L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Fames, 24),
                setStackSize(EssenceList.Crystallized_Essence_Infernus, 24),
                setStackSize(EssenceList.Crystallized_Essence_Lucrum, 18),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 12),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 4))
            .itemOutputs(getModItem(BloodMagic.ID, "runeOfSelfSacrifice", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Ritual Stone"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(BloodMagic.ID, "imperfectRitualStone", 1L),
                getModItem(BloodMagic.ID, "reinforcedSlate", 2L),
                getModItem(BloodMagic.ID, "terrae", 2L),
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 2L, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 12),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 9),
                setStackSize(EssenceList.Crystallized_Essence_Tenebrae, 6),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 3),
                setStackSize(EssenceList.Crystallized_Essence_Aer, 2))
            .itemOutputs(getModItem(BloodMagic.ID, "ritualStone", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Master Ritual Stone"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(BloodArsenal.ID, "blood_stone", 4L, 1),
                getModItem(BloodMagic.ID, "ritualStone", 1L),
                getModItem(BloodMagic.ID, "terrae", 2L),
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 2L, 0),
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 2L, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 36),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 24),
                setStackSize(EssenceList.Crystallized_Essence_Tenebrae, 16),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 16),
                setStackSize(EssenceList.Crystallized_Essence_Aer, 8),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 8))
            .itemOutputs(getModItem(BloodMagic.ID, "masterStone", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Soul Armor Forge"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(BloodArsenal.ID, "blood_stone", 4L, 2),
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 2L, 3),
                getModItem(BloodMagic.ID, "bloodSocket", 4L),
                getModItem(BloodMagic.ID, "magicales", 2L),
                getModItem(TinkerConstruct.ID, "ToolForgeBlock", 1L, 6),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Tutamen, 64),
                setStackSize(EssenceList.Crystallized_Essence_Metallum, 40),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Auram, 24),
                setStackSize(EssenceList.Crystallized_Essence_Tenebrae, 16),
                setStackSize(EssenceList.Crystallized_Essence_Exanimis, 8))
            .itemOutputs(getModItem(BloodMagic.ID, "armourForge", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Alchemic Chemistry Set"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(BloodMagic.ID, "blankSlate", 6L),
                getModItem(GregTech.ID, "gt.metaitem.01", 6L, 30694),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Fabrico, 24),
                setStackSize(EssenceList.Crystallized_Essence_Instrumentum, 24),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 18),
                setStackSize(EssenceList.Crystallized_Essence_Victus, 12),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 12))
            .itemOutputs(getModItem(BloodMagic.ID, "blockWritingTable", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Arcane Plinth"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(BloodArsenal.ID, "blood_infused_iron_block", 4L),
                getModItem(BloodMagic.ID, "blockPedestal", 1L),
                getModItem(BloodMagic.ID, "weakBloodShard", 4L),
                getModItem(Witchery.ID, "ingredient", 4L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Metallum, 64),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 48),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 32),
                setStackSize(EssenceList.Crystallized_Essence_Tenebrae, 24),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 16),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 8))
            .itemOutputs(getModItem(BloodMagic.ID, "blockPlinth", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Crystal Cluster"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(BloodArsenal.ID, "blood_stone", 1L, 4),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 5L, 28),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 5L, 29),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 72),
                setStackSize(EssenceList.Crystallized_Essence_Victus, 64),
                setStackSize(EssenceList.Crystallized_Essence_Spiritus, 64),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Tenebrae, 32),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 16),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 16))
            .itemOutputs(getModItem(BloodMagic.ID, "blockCrystal", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // DraconicEvolution
        // "Dezil's Marshmallow"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(NewHorizonsCoreMod.ID, "item.Marshmallow", 1L),
                getModItem(PamsHarvestCraft.ID, "beefwellingtonItem", 1L),
                getModItem(PamsHarvestCraft.ID, "deluxechickencurryItem", 1L),
                getModItem(PamsHarvestCraft.ID, "epicbaconItem", 1L),
                getModItem(PamsHarvestCraft.ID, "heartybreakfastItem", 1L),
                getModItem(PamsHarvestCraft.ID, "meatfeastpizzaItem", 1L),
                getModItem(PamsHarvestCraft.ID, "sausageinbreadItem", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 32),
                setStackSize(EssenceList.Crystallized_Essence_Sano, 28),
                setStackSize(EssenceList.Crystallized_Essence_Superbia, 24),
                setStackSize(EssenceList.Crystallized_Essence_Iter, 20),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 16),
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 12))
            .itemOutputs(getModItem(DraconicEvolution.ID, "dezilsMarshmallow", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // ElectroMagicTools
        // "Industrial Wand Charging Station"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 485),
                getModItem(GregTech.ID, "gt.metaitem.02", 2L, 30500),
                getModItem(IndustrialCraft2.ID, "itemPartIridium", 2L),
                getModItem(Thaumcraft.ID, "blockCrystal", 2L, 6),
                getModItem(Thaumcraft.ID, "blockJar", 1L, 0),
                getModItem(Thaumcraft.ID, "blockStoneDevice", 1L, 5),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Lucrum, 64),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 48),
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 48),
                setStackSize(EssenceList.Crystallized_Essence_Fabrico, 48),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 16))
            .itemOutputs(getModItem(ElectroMagicTools.ID, "EMTMachines", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Ethereal Processor"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 262),
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 302),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17330),
                getModItem(Thaumcraft.ID, "blockMetalDevice", 2L, 9),
                getModItem(Thaumcraft.ID, "blockStoneDevice", 1L, 0),
                getModItem(Thaumcraft.ID, "blockWoodenDevice", 2L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 28),
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 24),
                setStackSize(EssenceList.Crystallized_Essence_Machina, 16),
                setStackSize(EssenceList.Crystallized_Essence_Fabrico, 16),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 8))
            .itemOutputs(getModItem(ElectroMagicTools.ID, "EMTMachines", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Potentia Generator"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 22),
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 837),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 32601),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 32681),
                getModItem(IndustrialCraft2.ID, "blockElectric", 2L, 7),
                getModItem(IndustrialCraft2.ID, "blockMachine", 1L, 12),
                getModItem(Minecraft.ID, "hopper", 2L),
                getModItem(Thaumcraft.ID, "blockJar", 1L, 0),
                getModItem(Thaumcraft.ID, "FocusTrade", 1L),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 48),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Metallum, 32),
                setStackSize(EssenceList.Crystallized_Essence_Machina, 16))
            .itemOutputs(getModItem(ElectroMagicTools.ID, "EssentiaGenerators", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Lucrum Generator"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(ElectroMagicTools.ID, "EssentiaGenerators", 1L, 0),
                getModItem(Minecraft.ID, "gold_block", 12L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Lucrum, 256),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 128),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Nebrisum, 16))
            .itemOutputs(getModItem(ElectroMagicTools.ID, "EssentiaGenerators", 1L, 5))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // EtFuturumRequiem
        // "Totem of Undying"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(EnderIO.ID, "itemFrankenSkull", 1L, 5),
                getModItem(GregTech.ID, "gt.metaitem.01", 3L, 17323),
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30501),
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30504),
                getModItem(StevesCarts2.ID, "BlockMetalStorage", 2L, 2),
                getModItem(ThaumicBases.ID, "oldGold", 4L),
                getModItem(TinkerConstruct.ID, "heartCanister", 1L, 5),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Sano, 200),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 200),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 150),
                setStackSize(EssenceList.Crystallized_Essence_Lucrum, 150),
                setStackSize(EssenceList.Crystallized_Essence_Exanimis, 100))
            .itemOutputs(getModItem(EtFuturumRequiem.ID, "totem_of_undying", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // ExtraUtilities
        // "Portal to The Deep Dark"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(EternalSingularity.ID, "eternal_singularity", 4L),
                getModItem(GregTech.ID, "gt.blockreinforced", 1L, 12),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 32045),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 512),
                setStackSize(EssenceList.Crystallized_Essence_Tempus, 512),
                setStackSize(EssenceList.Crystallized_Essence_Luxuria, 512),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 512),
                setStackSize(EssenceList.Crystallized_Essence_Terminus, 512),
                setStackSize(EssenceList.Crystallized_Essence_Gula, 512),
                setStackSize(EssenceList.Crystallized_Essence_Superbia, 512))
            .itemOutputs(getModItem(ExtraUtilities.ID, "dark_portal", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Portal to The Last Millenium"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(ExtraUtilities.ID, "decorativeBlock1", 4L, 2),
                getModItem(ExtraUtilities.ID, "decorativeBlock1", 4L, 14),
                getModItem(Minecraft.ID, "clock", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 75),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 75),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 75),
                setStackSize(EssenceList.Crystallized_Essence_Sensus, 25),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 25))
            .itemOutputs(getModItem(ExtraUtilities.ID, "dark_portal", 1L, 2))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Angel Ring"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Avaritia.ID, "big_pearl", 1L),
                getModItem(ExtraUtilities.ID, "angelBlock", 2L),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 27329),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 28084),
                getModItem(GTPlusPlus.ID, "magicfeather", 2L),
                getModItem(Minecraft.ID, "nether_star", 2L),
                getModItem(NewHorizonsCoreMod.ID, "item.EngravedGoldChip", 2L),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 15),
                getModItem(TinkerConstruct.ID, "travelWings", 1L),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 200),
                setStackSize(EssenceList.Crystallized_Essence_Volatus, 200),
                setStackSize(EssenceList.Crystallized_Essence_Tempestas, 200),
                setStackSize(EssenceList.Crystallized_Essence_Nebrisum, 200),
                setStackSize(EssenceList.Crystallized_Essence_Motus, 200),
                setStackSize(EssenceList.Crystallized_Essence_Terminus, 200))
            .itemOutputs(getModItem(ExtraUtilities.ID, "angelRing", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // ForbiddenMagic
        // "Eldritch Blood Orb"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(BloodArsenal.ID, "transparent_orb", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17970),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 32724),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32726),
                getModItem(Thaumcraft.ID, "blockCrystal", 2L, 6),
                getModItem(Thaumcraft.ID, "ItemEldritchObject", 2L, 0),
                getModItem(Thaumcraft.ID, "ItemEldritchObject", 1L, 3),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 64),
                setStackSize(EssenceList.Crystallized_Essence_Victus, 64),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 48),
                setStackSize(EssenceList.Crystallized_Essence_Tenebrae, 32),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 16),
                setStackSize(EssenceList.Crystallized_Essence_Vitreus, 8))
            .itemOutputs(getModItem(ForbiddenMagic.ID, "EldritchOrb", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // Forestry
        // "Proven Grafter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Forestry.ID, "grafter", 1L),
                getModItem(Forestry.ID, "pollen", 1L, 0),
                getModItem(Forestry.ID, "pollen", 1L, 1),
                getModItem(Minecraft.ID, "sapling", 1L, 0),
                getModItem(Minecraft.ID, "sapling", 1L, 1),
                getModItem(Minecraft.ID, "sapling", 1L, 2),
                getModItem(Minecraft.ID, "sapling", 1L, 3),
                getModItem(Minecraft.ID, "sapling", 1L, 4),
                getModItem(Minecraft.ID, "sapling", 1L, 5),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Instrumentum, 25),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 25),
                setStackSize(EssenceList.Crystallized_Essence_Metallum, 20),
                setStackSize(EssenceList.Crystallized_Essence_Arbor, 10))
            .itemOutputs(getModItem(Forestry.ID, "grafterProven", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // Gadomancy
        // "Node Manipulator"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 22970),
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 2L, 3),
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 2L, 11),
                getModItem(Thaumcraft.ID, "blockCrystal", 2L, 6),
                getModItem(Thaumcraft.ID, "blockStoneDevice", 1L, 5),
                getModItem(Thaumcraft.ID, "blockStoneDevice", 1L, 10),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 0),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 1),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 15),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Auram, 64),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 48),
                setStackSize(EssenceList.Crystallized_Essence_Machina, 48),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 24),
                setStackSize(EssenceList.Crystallized_Essence_Tenebrae, 16),
                setStackSize(EssenceList.Crystallized_Essence_Motus, 8))
            .itemOutputs(getModItem(Gadomancy.ID, "BlockNodeManipulator", 1L, 5))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Element of Darkness"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 0),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 14),
                getModItem(Thaumcraft.ID, "ItemResource", 4L, 16),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 17),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0))
            .itemOutputs(getModItem(Gadomancy.ID, "ItemElement", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // GoodGenerator
        // "Essentia Output Hatch"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GoodGenerator.ID, "magicCasing", 0),
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 63),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32611),
                getModItem(Thaumcraft.ID, "blockJar", 1L, 0),
                getModItem(Thaumcraft.ID, "blockTube", 1L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 128),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 64),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 32))
            .itemOutputs(getModItem(GoodGenerator.ID, "essentiaOutputHatch", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Essentia Output Hatch (ME)"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GoodGenerator.ID, "essentiaOutputHatch", 1L, 0),
                getModItem(Thaumcraft.ID, "blockEssentiaReservoir", 1L, 0),
                getModItem(ThaumicEnergistics.ID, "thaumicenergistics.block.essentia.provider", 1L),
                getModItem(ThaumicTinkerer.ID, "interface", 1L),
                getModItem(WitchingGadgets.ID, "WG_MetalDevice", 1L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 256),
                setStackSize(EssenceList.Crystallized_Essence_Machina, 256),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 256),
                setStackSize(EssenceList.Crystallized_Essence_Strontio, 256))
            .itemOutputs(getModItem(GoodGenerator.ID, "essentiaOutputHatch_ME", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Novice Essentia Diffusion Cell"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.blockframes", 1L, 330),
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 5150),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17365),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32613),
                getModItem(Thaumcraft.ID, "blockCosmeticOpaque", 1L, 2),
                getModItem(Thaumcraft.ID, "blockTube", 1L, 4),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 32),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 32),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 16))
            .itemOutputs(getModItem(GoodGenerator.ID, "essentiaCell", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Adept Essentia Diffusion Cell"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GoodGenerator.ID, "essentiaCell", 1L, 0),
                getModItem(GregTech.ID, "gt.180k_Space_Coolantcell", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17084),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 26101),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32614),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32725),
                getModItem(Thaumcraft.ID, "blockMetalDevice", 1L, 3),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 64),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 64),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 32))
            .itemOutputs(getModItem(GoodGenerator.ID, "essentiaCell", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Master Essentia Diffusion Cell"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GoodGenerator.ID, "essentiaCell", 1L, 1),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32615),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32674),
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 20978),
                getModItem(IndustrialCraft2.ID, "blockMachine2", 1L, 14),
                getModItem(Thaumcraft.ID, "blockJar", 1L, 0),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 14),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 128),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 128),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 64))
            .itemOutputs(getModItem(GoodGenerator.ID, "essentiaCell", 1L, 2))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Grandmaster Essentia Diffusion Cell"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(BartWorks.ID, "BW_GlasBlocks", 1L, 4),
                getModItem(GoodGenerator.ID, "essentiaCell", 1L, 2),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17405),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 28070),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 31004),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32685),
                Air_Shard,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 256),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 256),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 128))
            .itemOutputs(getModItem(GoodGenerator.ID, "essentiaCell", 1L, 3))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // GregTech
        // "Block of Ichorium"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 4),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 1L, 28),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 1L, 29),
                getModItem(BloodMagic.ID, "standardBindingAgent", 1L),
                getModItem(NewHorizonsCoreMod.ID, "tile.Mytryl", 1L),
                getModItem(ThaumicTinkerer.ID, "kamiResource", 2L, 0),
                setStackSize(Ichorium_Ingot, 2),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Victus, 64),
                setStackSize(EssenceList.Crystallized_Essence_Fames, 48),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Infernus, 24),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 16),
                setStackSize(EssenceList.Crystallized_Essence_Superbia, 16),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 8))
            .itemOutputs(getModItem(GregTech.ID, "gt.blockmetal8", 1L, 13))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Block of Hellish Metal"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(BartWorks.ID, "bw.werkstoffblocks.01", 1L, 78),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 2),
                getModItem(ThaumicTinkerer.ID, "kamiResource", 2L, 6),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 8))
            .itemOutputs(getModItem(GregTech.ID, "gt.blockmetal9", 1L, 12))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Novice Magic Energy Converter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 11),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17019),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17330),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 32691),
                getModItem(Minecraft.ID, "beacon", 1L),
                new Object[] { OrePrefixes.circuit.get(Materials.MV), 2L },
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 32),
                setStackSize(EssenceList.Crystallized_Essence_Machina, 32),
                setStackSize(EssenceList.Crystallized_Essence_Electrum, 16))
            .itemOutputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1123))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Adept Magic Energy Converter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 18309),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 18330),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 32692),
                getModItem(Minecraft.ID, "beacon", 1L),
                new Object[] { OrePrefixes.circuit.get(Materials.HV), 2L },
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 64),
                setStackSize(EssenceList.Crystallized_Essence_Machina, 64),
                setStackSize(EssenceList.Crystallized_Essence_Electrum, 32))
            .itemOutputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1124))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Master Magic Energy Converter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 13),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 22028),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 22330),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 32671),
                getModItem(Minecraft.ID, "beacon", 1L),
                new Object[] { OrePrefixes.circuit.get(Materials.EV), 2L },
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 128),
                setStackSize(EssenceList.Crystallized_Essence_Machina, 128),
                setStackSize(EssenceList.Crystallized_Essence_Electrum, 64))
            .itemOutputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1125))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Novice Magic Energy Absorber"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 11),
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1123),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17330),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 32691),
                new Object[] { OrePrefixes.circuit.get(Materials.MV), 2L },
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 32),
                setStackSize(EssenceList.Crystallized_Essence_Machina, 32),
                setStackSize(EssenceList.Crystallized_Essence_Instrumentum, 32),
                setStackSize(EssenceList.Crystallized_Essence_Electrum, 16),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 16),
                setStackSize(EssenceList.Crystallized_Essence_Strontio, 4))
            .itemOutputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1127))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Adept Magic Energy Absorber"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12),
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1124),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17330),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 32692),
                new Object[] { OrePrefixes.circuit.get(Materials.HV), 2L },
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 64),
                setStackSize(EssenceList.Crystallized_Essence_Machina, 64),
                setStackSize(EssenceList.Crystallized_Essence_Instrumentum, 64),
                setStackSize(EssenceList.Crystallized_Essence_Electrum, 32),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 32),
                setStackSize(EssenceList.Crystallized_Essence_Strontio, 8))
            .itemOutputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1128))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Master Magic Energy Absorber"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 13),
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1124),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17970),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 32671),
                new Object[] { OrePrefixes.circuit.get(Materials.EV), 2L },
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 128),
                setStackSize(EssenceList.Crystallized_Essence_Machina, 128),
                setStackSize(EssenceList.Crystallized_Essence_Instrumentum, 128),
                setStackSize(EssenceList.Crystallized_Essence_Electrum, 64),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 64),
                setStackSize(EssenceList.Crystallized_Essence_Strontio, 16))
            .itemOutputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1129))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Grandmaster Magic Energy Absorber"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14),
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1125),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17316),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17970),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32672),
                new Object[] { OrePrefixes.circuit.get(Materials.IV), 2L },
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 256),
                setStackSize(EssenceList.Crystallized_Essence_Machina, 256),
                setStackSize(EssenceList.Crystallized_Essence_Instrumentum, 256),
                setStackSize(EssenceList.Crystallized_Essence_Electrum, 128),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 128),
                setStackSize(EssenceList.Crystallized_Essence_Strontio, 64))
            .itemOutputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1130))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Large Essentia Smeltery"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Automagy.ID, "blockBoiler", 1L),
                getModItem(Automagy.ID, "blockEssentiaLocus", 1L),
                getModItem(GregTech.ID, "gt.blockcasings3", 1L, 15),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32644),
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 31346),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 1),
                getModItem(Thaumcraft.ID, "blockMetalDevice", 1L, 3),
                getModItem(ThaumicBases.ID, "advAlchFurnace", 1L),
                getModItem(ThaumicBases.ID, "nodeLinker", 1L),
                getModItem(ThaumicTinkerer.ID, "brightNitor", 1L),
                // Runic Item 10-19
                new Object[] { OrePrefixes.circuit.get(Materials.IV), 4L },
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 256),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 256),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 256),
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 256),
                setStackSize(EssenceList.Crystallized_Essence_Lucrum, 256),
                setStackSize(EssenceList.Crystallized_Essence_Electrum, 256))
            .itemOutputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32024))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // MagicBees
        // "Essence of Scornful Oblivion"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(MagicBees.ID, "miscResources", 3L, 17),
                getModItem(Minecraft.ID, "dragon_egg", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 100),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 100),
                setStackSize(EssenceList.Crystallized_Essence_Lucrum, 75),
                setStackSize(EssenceList.Crystallized_Essence_Bestia, 75))
            .itemOutputs(getModItem(MagicBees.ID, "miscResources", 1L, 11))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Dimensional Singularity"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(MagicBees.ID, "propolis", 3L, 0),
                getModItem(Minecraft.ID, "ender_eye", 3L),
                getModItem(Minecraft.ID, "gold_block", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 24),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 24),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 16),
                setStackSize(EssenceList.Crystallized_Essence_Tenebrae, 16))
            .itemOutputs(getModItem(MagicBees.ID, "miscResources", 1L, 17))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Magic Apiary"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Forestry.ID, "apiculture", 1L, 0),
                getModItem(MagicBees.ID, "pollen", 1L, 0),
                getModItem(MagicBees.ID, "pollen", 1L, 1),
                getModItem(MagicBees.ID, "wax", 1L, 0),
                getModItem(MagicBees.ID, "wax", 1L, 1),
                getModItem(MagicBees.ID, "wax", 1L, 2),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 75),
                setStackSize(EssenceList.Crystallized_Essence_Sano, 75),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 50),
                setStackSize(EssenceList.Crystallized_Essence_Lucrum, 50),
                setStackSize(EssenceList.Crystallized_Essence_Exanimis, 25),
                setStackSize(EssenceList.Crystallized_Essence_Herba, 20))
            .itemOutputs(getModItem(MagicBees.ID, "magicApiary", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // Minecraft
        // "Dragon Egg"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(MagicBees.ID, "miscResources", 8L, 6),
                getModItem(MagicBees.ID, "miscResources", 1L, 7),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 64),
                setStackSize(EssenceList.Crystallized_Essence_Bestia, 56),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 48),
                setStackSize(EssenceList.Crystallized_Essence_Victus, 48))
            .itemOutputs(getModItem(Minecraft.ID, "dragon_egg", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // Beacon
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Minecraft.ID, "diamond_block", 1L),
                getModItem(Minecraft.ID, "glass", 4L),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17804),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 24506),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 64),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 64),
                setStackSize(EssenceList.Crystallized_Essence_Lux, 64),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 64),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 64),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 64))
            .itemOutputs(getModItem(Minecraft.ID, "beacon", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);
    }

    public static void addRunicMatrixRecipes_2() {
        // TaintedMagic
        // "Shard of Creation"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Minecraft.ID, "nether_star", 1L),
                getModItem(NewHorizonsCoreMod.ID, "item.VoidEssence", 2L),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 0),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 1),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 2),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 3),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 4),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 5),
                getModItem(Thaumcraft.ID, "blockCrystal", 2L, 6),
                getModItem(Thaumcraft.ID, "ItemEldritchObject", 2L, 3),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 64),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 64),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 64),
                setStackSize(EssenceList.Crystallized_Essence_Auram, 64),
                setStackSize(EssenceList.Crystallized_Essence_Tenebrae, 64))
            .itemOutputs(getModItem(TaintedMagic.ID, "ItemMaterial", 2L, 5))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // Thaumcraft
        // "Traveling Trunk"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17306),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 27306),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 28306),
                getModItem(Thaumcraft.ID, "blockChestHungry", 1L),
                getModItem(Thaumcraft.ID, "blockWoodenDevice", 2L, 6),
                getModItem(Thaumcraft.ID, "ItemGolemPlacer", 1L, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 32),
                setStackSize(EssenceList.Crystallized_Essence_Iter, 16),
                setStackSize(EssenceList.Crystallized_Essence_Motus, 16),
                setStackSize(EssenceList.Crystallized_Essence_Spiritus, 16))
            .itemOutputs(getModItem(Thaumcraft.ID, "TrunkSpawner", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Sword of the Zephyr"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29500),
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29528),
                getModItem(Thaumcraft.ID, "blockMagicalLog", 1L, 0),
                getModItem(Thaumcraft.ID, "blockMagicalLog", 1L, 1),
                getModItem(Thaumcraft.ID, "ItemSwordThaumium", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 20),
                setStackSize(EssenceList.Crystallized_Essence_Motus, 20),
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 20),
                setStackSize(EssenceList.Crystallized_Essence_Telum, 20))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemSwordElemental", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Obsidian Totem"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 4L, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 16),
                setStackSize(EssenceList.Crystallized_Essence_Tenebrae, 16),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 16))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockCosmeticSolid", 4L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Crimson Rites"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Minecraft.ID, "ender_eye", 42L),
                getModItem(TaintedMagic.ID, "ItemCrystalDagger", 1L),
                getModItem(TaintedMagic.ID, "ItemMaterial", 2L, 7),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 15),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 16),
                getModItem(Thaumcraft.ID, "ItemResource", 4L, 17),
                getModItem(Thaumcraft.ID, "ItemThaumonomicon", 1L, 0),
                getModItem(ThaumicBases.ID, "knoseFragment", 4L, 6),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 64),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 32),
                setStackSize(EssenceList.Crystallized_Essence_Infernus, 16))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemEldritchObject", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Eldritch Eye"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Minecraft.ID, "ender_eye", 2L),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17086),
                getModItem(StevesCarts2.ID, "ModuleComponents", 1L, 45),
                getModItem(Thaumcraft.ID, "ItemResource", 4L, 17),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 64),
                setStackSize(EssenceList.Crystallized_Essence_Iter, 32),
                setStackSize(EssenceList.Crystallized_Essence_Tenebrae, 32),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 32))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemEldritchObject", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Sanity Checker"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 27330),
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29500),
                getModItem(Thaumcraft.ID, "blockMirror", 1L, 0),
                getModItem(Thaumcraft.ID, "ItemThaumometer", 1L),
                getModItem(Thaumcraft.ID, "ItemZombieBrain", 2L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Sensus, 24),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 16),
                setStackSize(EssenceList.Crystallized_Essence_Sano, 16))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemSanityChecker", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Magic Mirror"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17086),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17367),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 27330),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 10),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Iter, 32),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 24),
                setStackSize(EssenceList.Crystallized_Essence_Tenebrae, 16),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 8))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockMirror", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Essentia Mirror"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17080),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17305),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 27330),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 10),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Iter, 32),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 24),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 16),
                setStackSize(EssenceList.Crystallized_Essence_Vitreus, 8))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockMirror", 1L, 6))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Essentia Reservoir"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17970),
                getModItem(Thaumcraft.ID, "blockJar", 4L, 0),
                getModItem(Thaumcraft.ID, "blockTube", 1L, 4),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 16),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 16),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 16),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 16))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockEssentiaReservoir", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Flux Scrubber"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(NewHorizonsCoreMod.ID, "item.SteelBars", 2L),
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 2L, 7),
                getModItem(Thaumcraft.ID, "blockTube", 1L, 0),
                getModItem(Thaumcraft.ID, "blockTube", 1L, 1),
                getModItem(Thaumcraft.ID, "blockWoodenDevice", 1L, 0),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 8),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 25),
                setStackSize(EssenceList.Crystallized_Essence_Aer, 20),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 15),
                setStackSize(EssenceList.Crystallized_Essence_Vinculum, 10),
                setStackSize(EssenceList.Crystallized_Essence_Vitium, 5))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockStoneDevice", 1L, 14))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Recharge Pedestal"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17086),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 29500),
                getModItem(Thaumcraft.ID, "blockStoneDevice", 1L, 1),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 15),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 20),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 15),
                setStackSize(EssenceList.Crystallized_Essence_Auram, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockStoneDevice", 1L, 5))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Runed Tablet"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Automagy.ID, "crystalBrain", 1L, 3),
                getModItem(DraconicEvolution.ID, "infoTablet", 1L),
                getModItem(Thaumcraft.ID, "ItemEldritchObject", 2L, 0),
                getModItem(Thaumcraft.ID, "ItemResource", 4L, 17),
                getModItem(ThaumicExploration.ID, "pureZombieBrain", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 128),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 64),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 64),
                setStackSize(EssenceList.Crystallized_Essence_Iter, 32),
                setStackSize(EssenceList.Crystallized_Essence_Tenebrae, 32),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 32))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemEldritchObject", 1L, 2))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Primordial Pearl"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 0),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 1),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 2),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 3),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 4),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 5),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 6),
                getModItem(WitchingGadgets.ID, "item.WG_Material", 1L, 12),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 384),
                setStackSize(EssenceList.Crystallized_Essence_Aer, 64),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 64),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 64),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 64),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 64),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 64))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemEldritchObject", 1L, 3))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Primordial Pearl"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(NewHorizonsCoreMod.ID, "item.PrimordialPearlFragment", 1L),
                getModItem(Thaumcraft.ID, "ItemEldritchObject", 4L, 0),
                getModItem(ThaumicTinkerer.ID, "kamiResource", 2L, 6),
                getModItem(ThaumicTinkerer.ID, "kamiResource", 2L, 7),
                getModItem(TwilightForest.ID, "tile.TFAuroraBrick", 4L),
                Ichorium_Ingot,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 256),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 256),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 256),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 256),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 256),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 256),
                setStackSize(EssenceList.Crystallized_Essence_Auram, 64),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 64),
                setStackSize(EssenceList.Crystallized_Essence_Vitium, 64))
            .itemOutputs(getModItem(Thaumcraft.ID, "ItemEldritchObject", 1L, 3))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Advanced Node Stabilizer"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Minecraft.ID, "glowstone", 2L),
                getModItem(Minecraft.ID, "redstone_block", 4L),
                getModItem(Thaumcraft.ID, "blockStoneDevice", 1L, 9),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 0),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Auram, 32),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 32),
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 32),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 32))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockStoneDevice", 1L, 10))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // ThaumicBases
        // "Overchanting Table"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Minecraft.ID, "enchanting_table", 1L),
                getModItem(GregTech.ID, "gt.blockmetal7", 2L, 4),
                getModItem(ThaumicBases.ID, "blockSalisMundus", 1L),
                getModItem(ThaumicBases.ID, "crystalBlock", 1L, 0),
                getModItem(ThaumicBases.ID, "crystalBlock", 1L, 1),
                getModItem(ThaumicBases.ID, "crystalBlock", 1L, 2),
                getModItem(ThaumicBases.ID, "crystalBlock", 1L, 3),
                getModItem(ThaumicBases.ID, "crystalBlock", 1L, 4),
                getModItem(ThaumicBases.ID, "crystalBlock", 1L, 5),
                getModItem(ThaumicBases.ID, "crystalBlock", 2L, 6),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
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
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Machina, 32),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 32))
            .itemOutputs(getModItem(ThaumicBases.ID, "overchanter", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Thaumium Alchemical Furnace"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.blockmetal7", 2L, 4),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 22305),
                getModItem(Railcraft.ID, "machine.beta", 1L, 4),
                getModItem(Thaumcraft.ID, "blockMetalDevice", 1L, 0),
                getModItem(Thaumcraft.ID, "blockStoneDevice", 1L, 0),
                getModItem(ThaumicBases.ID, "crystalBlock", 1L, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 48),
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 32),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 24),
                setStackSize(EssenceList.Crystallized_Essence_Machina, 16),
                setStackSize(EssenceList.Crystallized_Essence_Metallum, 16))
            .itemOutputs(getModItem(ThaumicBases.ID, "advAlchFurnace", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // ThaumicEnergistics
        // "Essentia Provider"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(AppliedEnergistics2.ID, "tile.BlockInterface", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17330),
                getModItem(Thaumcraft.ID, "blockCrystal", 2L, 2),
                getModItem(Thaumcraft.ID, "blockTube", 2L, 3),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 14),
                getModItem(ThaumicEnergistics.ID, "material", 1L, 0),
                getModItem(ThaumicEnergistics.ID, "material", 1L, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Machina, 64),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 48),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 32),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 24),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 16),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 8),
                setStackSize(EssenceList.Crystallized_Essence_Lucrum, 4))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "thaumicenergistics.block.essentia.provider", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Arcane Assembler"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(AppliedEnergistics2.ID, "tile.BlockMolecularAssembler", 1L),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 0),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 1),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 2),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 3),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 4),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 5),
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 6),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Fabrico, 64),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 48),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Auram, 16),
                setStackSize(EssenceList.Crystallized_Essence_Lucrum, 16),
                setStackSize(EssenceList.Crystallized_Essence_Vitreus, 16),
                setStackSize(EssenceList.Crystallized_Essence_Metallum, 8))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "thaumicenergistics.block.arcane.assembler", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Infusion Provider"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Thaumcraft.ID, "blockCrystal", 2L, 0),
                getModItem(Thaumcraft.ID, "blockMirror", 2L, 6),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 14),
                getModItem(ThaumicEnergistics.ID, "material", 1L, 0),
                getModItem(ThaumicEnergistics.ID, "material", 1L, 1),
                getModItem(ThaumicEnergistics.ID, "part.base", 1L, 0),
                getModItem(ThaumicEnergistics.ID, "part.base", 1L, 3),
                getModItem(ThaumicEnergistics.ID, "thaumicenergistics.block.essentia.provider", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Machina, 64),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 48),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 24),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 16),
                setStackSize(EssenceList.Crystallized_Essence_Spiritus, 8))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "thaumicenergistics.block.infusion.provider", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Advanced Infusion Provider"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 2L, 24),
                getModItem(AppliedEnergistics2.ID, "tile.BlockCraftingUnit", 1L, 0),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32686),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32696),
                getModItem(Thaumcraft.ID, "ItemResource", 4L, 15),
                getModItem(ThaumicEnergistics.ID, "material", 2L, 0),
                getModItem(ThaumicEnergistics.ID, "thaumicenergistics.block.infusion.provider", 1L),
                getModItem(ThaumicInsurgence.ID, "infusionIntercepter", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Machina, 64),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 64),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 64),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 64),
                setStackSize(EssenceList.Crystallized_Essence_Lucrum, 64))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "thaumicenergistics.block.advanced.infusion.provider", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Thaumometric Essentia Cell"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Gadomancy.ID, "BlockEssentiaCompressor", 4L),
                getModItem(Gadomancy.ID, "BlockNodeManipulator", 4L, 5),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 32045),
                getModItem(TaintedMagic.ID, "ItemFocusEldritch", 4L),
                getModItem(ThaumicEnergistics.ID, "storage.essentia", 1L, 10),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 2000),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 2000),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 2000),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 2000),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 2000),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 2000))
            .itemOutputs(getModItem(ThaumicEnergistics.ID, "storage.essentia", 1L, 4))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // ThaumicInsurgence
        // "Infusion Intercepter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Thaumcraft.ID, "blockMetalDevice", 4L, 1),
                getModItem(Thaumcraft.ID, "blockMetalDevice", 5L, 9),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 100),
                setStackSize(EssenceList.Crystallized_Essence_Fames, 100),
                setStackSize(EssenceList.Crystallized_Essence_Instrumentum, 75),
                setStackSize(EssenceList.Crystallized_Essence_Vinculum, 50),
                setStackSize(EssenceList.Crystallized_Essence_Machina, 50),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 25))
            .itemOutputs(getModItem(ThaumicInsurgence.ID, "infusionIntercepter", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // ThaumicTinkerer
        // Ichor
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Minecraft.ID, "ender_eye", 1L),
                getModItem(Minecraft.ID, "nether_star", 1L),
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29500),
                getModItem(ThaumicTinkerer.ID, "kamiResource", 1L, 6),
                getModItem(ThaumicTinkerer.ID, "kamiResource", 1L, 7),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Spiritus, 64),
                setStackSize(EssenceList.Crystallized_Essence_Humanus, 32),
                setStackSize(EssenceList.Crystallized_Essence_Lux, 32),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 16),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 16))
            .itemOutputs(getModItem(ThaumicTinkerer.ID, "kamiResource", 2L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Osmotic Enchanter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Minecraft.ID, "enchanting_table", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17330),
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 4L, 0),
                getModItem(ThaumicTinkerer.ID, "spellCloth", 4L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 64),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 64),
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 64),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 64),
                setStackSize(EssenceList.Crystallized_Essence_Auram, 64),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 64))
            .itemOutputs(getModItem(ThaumicTinkerer.ID, "enchanter", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Thaumic Restorer"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.blockmetal7", 1L, 4),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17032),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17086),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17330),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17500),
                getModItem(NewHorizonsCoreMod.ID, "item.ReinforcedGlassPlate", 2L),
                getModItem(PamsHarvestCraft.ID, "hardenedleatherItem", 1L),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 7),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Fabrico, 32),
                setStackSize(EssenceList.Crystallized_Essence_Instrumentum, 32),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 16),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 16),
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 8))
            .itemOutputs(getModItem(ThaumicTinkerer.ID, "repairer", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // TinkerConstruct
        // "Miniature Red Heart"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Minecraft.ID, "apple", 1L),
                getModItem(Minecraft.ID, "golden_apple", 1L, 0),
                getModItem(TinkerConstruct.ID, "jerky", 1L, 0),
                getModItem(TinkerConstruct.ID, "jerky", 1L, 1),
                getModItem(TinkerConstruct.ID, "jerky", 1L, 2),
                getModItem(TinkerConstruct.ID, "jerky", 1L, 3),
                getModItem(TinkerConstruct.ID, "jerky", 1L, 4),
                getModItem(TinkerConstruct.ID, "jerky", 1L, 5),
                getModItem(TinkerConstruct.ID, "jerky", 1L, 6),
                getModItem(TinkerConstruct.ID, "jerky", 1L, 7),
                // Runic Item 10-19
                getModItem(TinkerConstruct.ID, "materials", 1L, 8),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Sano, 50),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 35),
                setStackSize(EssenceList.Crystallized_Essence_Lucrum, 35),
                setStackSize(EssenceList.Crystallized_Essence_Exanimis, 25))
            .itemOutputs(getModItem(TinkerConstruct.ID, "heartCanister", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Miniature Yellow Heart"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Minecraft.ID, "golden_apple", 1L, 0),
                getModItem(TinkerConstruct.ID, "heartCanister", 5L, 1),
                getModItem(TinkerConstruct.ID, "materials", 5L, 8),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Sano, 100),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 100),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 70),
                setStackSize(EssenceList.Crystallized_Essence_Lucrum, 70),
                setStackSize(EssenceList.Crystallized_Essence_Exanimis, 50))
            .itemOutputs(getModItem(TinkerConstruct.ID, "heartCanister", 1L, 3))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Miniature Green Heart"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(TinkerConstruct.ID, "diamondApple", 1L, 0),
                getModItem(TinkerConstruct.ID, "heartCanister", 5L, 1),
                getModItem(TinkerConstruct.ID, "materials", 5L, 8),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Sano, 200),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 200),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 150),
                setStackSize(EssenceList.Crystallized_Essence_Lucrum, 150),
                setStackSize(EssenceList.Crystallized_Essence_Exanimis, 100))
            .itemOutputs(getModItem(TinkerConstruct.ID, "heartCanister", 1L, 5))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Ball of Moss"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(BiomesOPlenty.ID, "moss", 2L),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 2542),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 15),
                getModItem(TwilightForest.ID, "tile.TFPlant", 2L, 3),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Instrumentum, 35),
                setStackSize(EssenceList.Crystallized_Essence_Sano, 30),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 25))
            .itemOutputs(getModItem(TinkerConstruct.ID, "materials", 1L, 6))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Lava Crystal"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Minecraft.ID, "blaze_rod", 2L),
                getModItem(Minecraft.ID, "fire_charge", 3L),
                getModItem(Minecraft.ID, "lava_bucket", 2L),
                getModItem(Thaumcraft.ID, "ItemShard", 2L, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 35),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 25),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 25),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 20))
            .itemOutputs(getModItem(TinkerConstruct.ID, "materials", 1L, 7))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Silky Jewel"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29500),
                getModItem(TinkerConstruct.ID, "materials", 1L, 25),
                Air_Shard,
                Earth_Shard,
                Order_Shard,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 35),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 35),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 20),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 20),
                setStackSize(EssenceList.Crystallized_Essence_Vitreus, 20))
            .itemOutputs(getModItem(TinkerConstruct.ID, "materials", 1L, 26))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // WarpTheory
        // "Pure Tear"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 2L, 10),
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 2L, 11),
                getModItem(Minecraft.ID, "ghast_tear", 2L),
                getModItem(Minecraft.ID, "nether_star", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 24500),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 14),
                Ichorium_Ingot,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 32),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 16),
                setStackSize(EssenceList.Crystallized_Essence_Sano, 16))
            .itemOutputs(getModItem(WarpTheory.ID, "item.warptheory.cleanser", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Purification Talisman"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17086),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 27330),
                getModItem(GregTech.ID, "gt.metaitem.02", 2L, 29500),
                getModItem(Thaumcraft.ID, "ItemBaubleBlanks", 1L, 0),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 14),
                getModItem(WarpTheory.ID, "item.warptheory.cleanser", 2L, 0),
                setStackSize(Ichorium_Ingot, 2),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 64),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 64),
                setStackSize(EssenceList.Crystallized_Essence_Auram, 32),
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 32),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 32))
            .itemOutputs(getModItem(WarpTheory.ID, "item.warptheory.amulet", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // WitchingGadgets
        // "Essentia Pump"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 32611),
                getModItem(Thaumcraft.ID, "blockWoodenDevice", 4L, 0),
                getModItem(Thaumcraft.ID, "blockTube", 1L, 4),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Iter, 64),
                setStackSize(EssenceList.Crystallized_Essence_Motus, 32),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 16))
            .itemOutputs(getModItem(WitchingGadgets.ID, "WG_MetalDevice", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // Jar
        // "Void Jar"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17533),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17804),
                getModItem(Minecraft.ID, "blaze_powder", 1L),
                getModItem(Thaumcraft.ID, "blockJar", 1L, 0),
                getModItem(Thaumcraft.ID, "ItemNugget", 1L, 5),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 7),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 7),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 7),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 7))
            .itemOutputs(getModItem(Thaumcraft.ID, "blockJar", 1L, 3))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Oblivion Jar"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(ExtraUtilities.ID, "trashcan", 1L, 1),
                getModItem(Thaumcraft.ID, "blockChestHungry", 1L),
                getModItem(Thaumcraft.ID, "blockCosmeticOpaque", 6L, 2),
                getModItem(Thaumcraft.ID, "blockCrystal", 4L, 5),
                getModItem(Thaumcraft.ID, "blockJar", 1L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 32),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 24),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 16),
                setStackSize(EssenceList.Crystallized_Essence_Fames, 14),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 12),
                setStackSize(EssenceList.Crystallized_Essence_Tenebrae, 8))
            .itemOutputs(getModItem(ThaumicExploration.ID, "trashJar", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Thaumium Reinforced Jar"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.blockframes", 1L, 28),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 22330),
                getModItem(Minecraft.ID, "glass_pane", 4L),
                getModItem(Thaumcraft.ID, "blockJar", 1L, 0),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 15),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Tutamen, 64),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 32),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 32),
                setStackSize(EssenceList.Crystallized_Essence_Lucrum, 16),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 16),
                setStackSize(EssenceList.Crystallized_Essence_Aer, 8))
            .itemOutputs(getModItem(KekzTech.ID, "kekztech_thaumiumreinforcedjar_block", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Thaumium Reinforced Void Jar"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17533),
                getModItem(IndustrialCraft2.ID, "itemDensePlates", 1L, 7),
                getModItem(KekzTech.ID, "kekztech_thaumiumreinforcedjar_block", 1L, 0),
                getModItem(Minecraft.ID, "blaze_powder", 1L),
                getModItem(Thaumcraft.ID, "ItemNugget", 1L, 5),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 14),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 14),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 14),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 14))
            .itemOutputs(getModItem(KekzTech.ID, "kekztech_thaumiumreinforcedjar_block", 1L, 3))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Ichor Jar"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17500),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 29317),
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30500),
                getModItem(Minecraft.ID, "glass_pane", 4L),
                getModItem(Thaumcraft.ID, "blockJar", 1L, 0),
                getModItem(ThaumicTinkerer.ID, "kamiResource", 1L, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Tutamen, 256),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 128),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 128),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 128),
                setStackSize(EssenceList.Crystallized_Essence_Lucrum, 64),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 64),
                setStackSize(EssenceList.Crystallized_Essence_Aer, 32))
            .itemOutputs(getModItem(KekzTech.ID, "kekztech_ichorjar_block", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Ichor Void Jar"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17533),
                getModItem(IndustrialCraft2.ID, "itemDensePlates", 1L, 7),
                getModItem(KekzTech.ID, "kekztech_ichorjar_block", 1L, 0),
                getModItem(Minecraft.ID, "blaze_powder", 1L),
                getModItem(Thaumcraft.ID, "ItemNugget", 1L, 5),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 14),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 14),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 14),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 14))
            .itemOutputs(getModItem(KekzTech.ID, "kekztech_ichorjar_block", 1L, 3))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // Wand Focus
        // "Wand Focus: Explosion"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(IndustrialCraft2.ID, "itemToolMiningLaser", 1L),
                getModItem(Minecraft.ID, "firework_charge", 2L),
                getModItem(Minecraft.ID, "tnt", 1L),
                getModItem(NewHorizonsCoreMod.ID, "item.ReinforcedGlassLense", 2L),
                getModItem(Thaumcraft.ID, "FocusHellbat", 1L),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 0),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 1),
                getModItem(Thaumcraft.ID, "PrimalArrow", 2L, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 64),
                setStackSize(EssenceList.Crystallized_Essence_Motus, 48),
                setStackSize(EssenceList.Crystallized_Essence_Telum, 32),
                setStackSize(EssenceList.Crystallized_Essence_Mortuus, 24),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 16),
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 16))
            .itemOutputs(getModItem(ElectroMagicTools.ID, "ExplosionFocus", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Shield"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.blockreinforced", 4L, 3),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17383),
                getModItem(IndustrialCraft2.ID, "itemPartAlloy", 2L),
                getModItem(NewHorizonsCoreMod.ID, "item.ReinforcedGlassPlate", 2L),
                getModItem(Thaumcraft.ID, "FocusPortableHole", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Tutamen, 40),
                setStackSize(EssenceList.Crystallized_Essence_Aer, 32),
                setStackSize(EssenceList.Crystallized_Essence_Vinculum, 24),
                setStackSize(EssenceList.Crystallized_Essence_Victus, 16),
                setStackSize(EssenceList.Crystallized_Essence_Vitreus, 16),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 8))
            .itemOutputs(getModItem(ElectroMagicTools.ID, "ShieldFocus", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Charging"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 22),
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1460),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 32601),
                getModItem(GregTech.ID, "gt.metaitem.02", 2L, 20330),
                getModItem(GregTech.ID, "gt.metaitem.02", 2L, 21330),
                getModItem(IndustrialCraft2.ID, "itemBatCrystal", 1L),
                getModItem(Thaumcraft.ID, "blockCrystal", 2L, 6),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 48),
                setStackSize(EssenceList.Crystallized_Essence_Machina, 32),
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 24),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 16),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 8))
            .itemOutputs(getModItem(ElectroMagicTools.ID, "ChargingFocus", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Wand Charging"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(ElectroMagicTools.ID, "ChargingFocus", 1L),
                getModItem(ElectroMagicTools.ID, "EMTMachines", 1L, 0),
                getModItem(GregTech.ID, "gt.blockmachines", 2L, 1660),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17970),
                getModItem(GregTech.ID, "gt.metaitem.02", 2L, 20970),
                getModItem(IndustrialCraft2.ID, "itemBatLamaCrystal", 1L),
                getModItem(IndustrialCraft2.ID, "itemPartIridium", 2L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Lucrum, 64),
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 48),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 48),
                setStackSize(EssenceList.Crystallized_Essence_Fabrico, 32),
                setStackSize(EssenceList.Crystallized_Essence_Auram, 32),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 16),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 8))
            .itemOutputs(getModItem(ElectroMagicTools.ID, "WandChargingFocus", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Energy Ball Focus"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.blockmachines", 4L, 1461),
                getModItem(IndustrialCraft2.ID, "blockMachine2", 1L),
                getModItem(IndustrialCraft2.ID, "itemBatCrystal", 3L),
                getModItem(Thaumcraft.ID, "FocusShock", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 30),
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 24),
                setStackSize(EssenceList.Crystallized_Essence_Victus, 12),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 6))
            .itemOutputs(getModItem(ElectroMagicTools.ID, "EnergyBallFocus", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Maintenance"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(ElectroMagicTools.ID, "ChargingFocus", 1L),
                getModItem(ElectroMagicTools.ID, "EMTItems", 1L, 9),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32764),
                Air_Shard,
                Fire_Shard,
                Water_Shard,
                Earth_Shard,
                Order_Shard,
                Entropy_Shard,
                Balanced_Shard,
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Instrumentum, 64),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 64),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 48),
                setStackSize(EssenceList.Crystallized_Essence_Fabrico, 32),
                setStackSize(EssenceList.Crystallized_Essence_Machina, 32),
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 32))
            .itemOutputs(getModItem(ElectroMagicTools.ID, "MaintenanceFocus", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Blink"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(ForbiddenMagic.ID, "NetherShard", 4L, 5),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 32724),
                getModItem(Thaumcraft.ID, "FocusPortableHole", 1L),
                getModItem(ThaumicTinkerer.ID, "kamiResource", 2L, 7),
                getModItem(Witchery.ID, "ingredient", 2L, 92),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Iter, 32),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Desidia, 16),
                setStackSize(EssenceList.Crystallized_Essence_Infernus, 16),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 8),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 8))
            .itemOutputs(getModItem(ForbiddenMagic.ID, "BlinkFocus", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Tainted Storm"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(ForbiddenMagic.ID, "NetherShard", 2L, 2),
                getModItem(TaintedMagic.ID, "ItemMaterial", 4L, 4),
                getModItem(Thaumcraft.ID, "FocusPech", 1L),
                getModItem(Thaumcraft.ID, "ItemBottleTaint", 2L),
                getModItem(Thaumcraft.ID, "ItemResource", 3L, 11),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 12),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 72),
                setStackSize(EssenceList.Crystallized_Essence_Limus, 72),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 72),
                setStackSize(EssenceList.Crystallized_Essence_Vitium, 72),
                setStackSize(EssenceList.Crystallized_Essence_Aer, 64),
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 32))
            .itemOutputs(getModItem(TaintedMagic.ID, "ItemFocusTaint", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Dark Matter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17368),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17970),
                getModItem(TaintedMagic.ID, "ItemMaterial", 5L, 5),
                getModItem(Thaumcraft.ID, "FocusPortableHole", 1L),
                getModItem(Thaumcraft.ID, "ItemEldritchObject", 2L, 0),
                getModItem(Thaumcraft.ID, "ItemResource", 4L, 15),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 84),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 72),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 64),
                setStackSize(EssenceList.Crystallized_Essence_Tenebrae, 64),
                setStackSize(EssenceList.Crystallized_Essence_Ira, 32),
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 16))
            .itemOutputs(getModItem(TaintedMagic.ID, "ItemFocusEldritch", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Meteorology"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(NewHorizonsCoreMod.ID, "item.VoidEssence", 4L),
                getModItem(TaintedMagic.ID, "ItemMaterial", 1L, 5),
                getModItem(Thaumcraft.ID, "FocusFrost", 1L),
                getModItem(Thaumcraft.ID, "FocusShock", 1L),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 14),
                setStackSize(Water_Crystal_Cluster, 4),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 84),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 72),
                setStackSize(EssenceList.Crystallized_Essence_Tempestas, 64),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 48),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Volatus, 24),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 16))
            .itemOutputs(getModItem(TaintedMagic.ID, "ItemFocusMeteorology", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Time"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Minecraft.ID, "clock", 4L),
                getModItem(NewHorizonsCoreMod.ID, "item.VoidEssence", 4L),
                getModItem(TaintedMagic.ID, "ItemMaterial", 1L, 5),
                getModItem(Thaumcraft.ID, "FocusPortableHole", 1L),
                setStackSize(Air_Crystal_Cluster, 4),
                Mixed_Crystal_Cluster,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 84),
                setStackSize(EssenceList.Crystallized_Essence_Lux, 72),
                setStackSize(EssenceList.Crystallized_Essence_Tenebrae, 64),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 48),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Tempus, 24),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 16))
            .itemOutputs(getModItem(TaintedMagic.ID, "ItemFocusTime", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Mage's Mace"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.blockmetal8", 1L, 15),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 17086),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17522),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 23368),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 27368),
                getModItem(TaintedMagic.ID, "ItemShadowmetalSword", 1L),
                setStackSize(Entropy_Crystal_Cluster, 2),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Telum, 64),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 48),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Metallum, 16),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 8))
            .itemOutputs(getModItem(TaintedMagic.ID, "ItemFocusMageMace", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Tainted Shockwave"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(IndustrialCraft2.ID, "blockITNT", 4L),
                getModItem(TaintedMagic.ID, "ItemFocusTaint", 1L),
                getModItem(Thaumcraft.ID, "ItemBottleTaint", 4L),
                getModItem(Thaumcraft.ID, "ItemResource", 2, 11),
                getModItem(Thaumcraft.ID, "ItemResource", 2, 15),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Vitium, 84),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 80),
                setStackSize(EssenceList.Crystallized_Essence_Telum, 72),
                setStackSize(EssenceList.Crystallized_Essence_Motus, 64),
                setStackSize(EssenceList.Crystallized_Essence_Aer, 48),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 32))
            .itemOutputs(getModItem(TaintedMagic.ID, "ItemFocusTaintedBlast", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Nine Hells"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Botania.ID, "quartz", 2L, 4),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 24347),
                setStackSize(Air_Crystal_Cluster, 2),
                setStackSize(Fire_Crystal_Cluster, 2),
                setStackSize(Entropy_Crystal_Cluster, 2),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 40),
                setStackSize(EssenceList.Crystallized_Essence_Aer, 30),
                setStackSize(EssenceList.Crystallized_Essence_Bestia, 20),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 10),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 5))
            .itemOutputs(getModItem(Thaumcraft.ID, "FocusHellbat", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Portable Hole"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Botania.ID, "quartz", 2L, 1),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 24532),
                setStackSize(Air_Crystal_Cluster, 2),
                setStackSize(Earth_Crystal_Cluster, 2),
                setStackSize(Entropy_Crystal_Cluster, 2),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 40),
                setStackSize(EssenceList.Crystallized_Essence_Iter, 30),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 20),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 10),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 5))
            .itemOutputs(getModItem(Thaumcraft.ID, "FocusPortableHole", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Warding"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Botania.ID, "quartz", 2L, 1),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 24506),
                getModItem(Thaumcraft.ID, "ItemResource", 2, 3),
                setStackSize(Earth_Crystal_Cluster, 2),
                setStackSize(Order_Crystal_Cluster, 2),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 25),
                setStackSize(EssenceList.Crystallized_Essence_Tutamen, 25),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 15),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 10))
            .itemOutputs(getModItem(Thaumcraft.ID, "FocusWarding", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Containment"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Minecraft.ID, "iron_bars", 2L),
                getModItem(Minecraft.ID, "web", 2L),
                getModItem(Thaumcraft.ID, "FocusPortableHole", 1L),
                setStackSize(Amber, 4),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 32),
                setStackSize(EssenceList.Crystallized_Essence_Vinculum, 32),
                setStackSize(EssenceList.Crystallized_Essence_Iter, 8))
            .itemOutputs(getModItem(ThaumicHorizons.ID, "focusContainment", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Liquefaction"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Minecraft.ID, "diamond", 1L),
                getModItem(Thaumcraft.ID, "FocusExcavation", 1L),
                getModItem(Thaumcraft.ID, "FocusFire", 1L),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 14),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 12),
                setStackSize(EssenceList.Crystallized_Essence_Metallum, 8),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 4))
            .itemOutputs(getModItem(ThaumicHorizons.ID, "focusLiquefaction", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Disintegration"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Thaumcraft.ID, "FocusExcavation", 1L),
                getModItem(Thaumcraft.ID, "ItemBucketDeath", 2L),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 0),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 15),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Vitreus, 32),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 24),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 16))
            .itemOutputs(getModItem(ThaumicHorizons.ID, "focusDisintegration", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Animation"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Thaumcraft.ID, "ItemEldritchObject", 1L, 3),
                getModItem(Thaumcraft.ID, "ItemGolemCore", 2L, 100),
                getModItem(Thaumcraft.ID, "ItemGolemUpgrade", 1L, 0),
                getModItem(Thaumcraft.ID, "ItemGolemUpgrade", 1L, 1),
                getModItem(Thaumcraft.ID, "ItemGolemUpgrade", 1L, 2),
                getModItem(Thaumcraft.ID, "ItemGolemUpgrade", 1L, 3),
                getModItem(Thaumcraft.ID, "ItemGolemUpgrade", 1L, 4),
                getModItem(Thaumcraft.ID, "ItemGolemUpgrade", 1L, 5),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Humanus, 64),
                setStackSize(EssenceList.Crystallized_Essence_Motus, 64),
                setStackSize(EssenceList.Crystallized_Essence_Spiritus, 64),
                setStackSize(EssenceList.Crystallized_Essence_Fabrico, 64))
            .itemOutputs(getModItem(ThaumicHorizons.ID, "focusAnimation", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Telekinesis"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17355),
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17522),
                getModItem(ThaumicTinkerer.ID, "focusFlight", 1L),
                setStackSize(Air_Crystal_Cluster, 2),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Motus, 32),
                setStackSize(EssenceList.Crystallized_Essence_Aer, 24),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 24),
                setStackSize(EssenceList.Crystallized_Essence_Lucrum, 16))
            .itemOutputs(getModItem(ThaumicTinkerer.ID, "focusTelekinesis", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Dislocation"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 4L, 17522),
                getModItem(GregTech.ID, "gt.metaitem.02", 2L, 29500),
                getModItem(GregTech.ID, "gt.metaitem.02", 2L, 29514),
                getModItem(Thaumcraft.ID, "FocusTrade", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 64),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Tenebrae, 32),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 32),
                setStackSize(EssenceList.Crystallized_Essence_Vitium, 16),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 16))
            .itemOutputs(getModItem(ThaumicTinkerer.ID, "focusDislocation", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Mending"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 17351),
                getModItem(Minecraft.ID, "golden_apple", 1L),
                getModItem(Minecraft.ID, "golden_carrot", 1L),
                getModItem(Thaumcraft.ID, "ItemResource", 4L, 14),
                getModItem(Thaumcraft.ID, "FocusPech", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Spiritus, 32),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Sano, 24),
                setStackSize(EssenceList.Crystallized_Essence_Victus, 24))
            .itemOutputs(getModItem(ThaumicTinkerer.ID, "focusHeal", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Celestial Recall"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30500),
                getModItem(ThaumicTinkerer.ID, "focusEnderChest", 1L),
                getModItem(ThaumicTinkerer.ID, "kamiResource", 1L, 0),
                getModItem(ThaumicTinkerer.ID, "skyPearl", 2L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Iter, 128),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 96),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 64),
                setStackSize(EssenceList.Crystallized_Essence_Volatus, 48),
                setStackSize(EssenceList.Crystallized_Essence_Aer, 32))
            .itemOutputs(getModItem(ThaumicTinkerer.ID, "focusRecall", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Uprising"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(ElectroMagicTools.ID, "EMTItems", 2L, 7),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 2532),
                getModItem(GregTech.ID, "gt.metaitem.02", 2L, 21330),
                getModItem(Thaumcraft.ID, "ItemSwordElemental", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 48),
                setStackSize(EssenceList.Crystallized_Essence_Motus, 32),
                setStackSize(EssenceList.Crystallized_Essence_Iter, 24),
                setStackSize(EssenceList.Crystallized_Essence_Volatus, 24))
            .itemOutputs(getModItem(ThaumicTinkerer.ID, "focusFlight", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Experience Drain"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 24532),
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29500),
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29501),
                getModItem(Minecraft.ID, "experience_bottle", 1L),
                getModItem(ThaumicTinkerer.ID, "enchanter", 1L),
                getModItem(ThaumicTinkerer.ID, "xpTalisman", 1L),
                Ichorium_Ingot,
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Auram, 64),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 64),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 64),
                setStackSize(EssenceList.Crystallized_Essence_Vitium, 32))
            .itemOutputs(getModItem(ThaumicTinkerer.ID, "focusXPDrain", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Distortion"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 2L, 3),
                getModItem(Thaumcraft.ID, "ItemResource", 2L, 10),
                getModItem(ThaumicTinkerer.ID, "focusFlight", 1L),
                setStackSize(Order_Crystal_Cluster, 2),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 32),
                setStackSize(EssenceList.Crystallized_Essence_Tutamen, 32),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 24),
                setStackSize(EssenceList.Crystallized_Essence_Auram, 24),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 16))
            .itemOutputs(getModItem(ThaumicTinkerer.ID, "focusDeflect", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Shadowbeam"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 28978),
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29500),
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29501),
                getModItem(Thaumcraft.ID, "FocusExcavation", 1L),
                getModItem(Thaumcraft.ID, "FocusShock", 1L),
                getModItem(Thaumcraft.ID, "PrimalArrow", 2L, 2),
                getModItem(ThaumicTinkerer.ID, "focusDeflect", 1L),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 64),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 64),
                setStackSize(EssenceList.Crystallized_Essence_Telum, 64),
                setStackSize(EssenceList.Crystallized_Essence_Tenebrae, 64),
                setStackSize(EssenceList.Crystallized_Essence_Tempestas, 32))
            .itemOutputs(getModItem(ThaumicTinkerer.ID, "focusShadowbeam", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Activation"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 24545),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32680),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32690),
                setStackSize(Order_Crystal_Cluster, 4),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Motus, 32),
                setStackSize(EssenceList.Crystallized_Essence_Vitreus, 32),
                setStackSize(EssenceList.Crystallized_Essence_Iter, 16),
                setStackSize(EssenceList.Crystallized_Essence_Sensus, 16))
            .itemOutputs(getModItem(ThaumicBases.ID, "fociActivation", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Liquid Drain"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(ExtraUtilities.ID, "trashcan", 1L, 1),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 24543),
                getModItem(IronTanks.ID, "ironTank", 1L),
                getModItem(Minecraft.ID, "bucket", 1L),
                getModItem(Thaumcraft.ID, "blockJar", 1L, 3),
                setStackSize(Water_Crystal_Cluster, 4),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 32),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 16))
            .itemOutputs(getModItem(ThaumicBases.ID, "fociDrain", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Experience"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 24501),
                getModItem(GregTech.ID, "gt.metaitem.02", 2L, 29501),
                getModItem(Thaumcraft.ID, "FocusExcavation", 1L),
                setStackSize(Earth_Crystal_Cluster, 4),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Lucrum, 32),
                setStackSize(EssenceList.Crystallized_Essence_Vitreus, 32),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 16),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 16))
            .itemOutputs(getModItem(ThaumicBases.ID, "fociExperience", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Wand Focus: Flux Scrubber"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 24533),
                getModItem(Thaumcraft.ID, "blockCustomPlant", 1L, 1),
                getModItem(Thaumcraft.ID, "blockCustomPlant", 1L, 4),
                getModItem(Thaumcraft.ID, "blockStoneDevice", 1L, 14),
                setStackSize(Mixed_Crystal_Cluster, 4),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Vitium, 32),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 32),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 16),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 16),
                setStackSize(EssenceList.Crystallized_Essence_Sano, 16))
            .itemOutputs(getModItem(ThaumicBases.ID, "fociFlux", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);

        // "Bottomless Pouch"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Runic Item 0-9
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30500),
                getModItem(Thaumcraft.ID, "blockJar", 1L, 3),
                getModItem(Thaumcraft.ID, "FocusPortableHole", 1L),
                getModItem(Thaumcraft.ID, "FocusPouch", 1L),
                getModItem(Thaumcraft.ID, "TrunkSpawner", 1L, 0),
                getModItem(ThaumicTinkerer.ID, "kamiResource", 4L, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 10-19
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Runic Item 20-24
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 64),
                setStackSize(EssenceList.Crystallized_Essence_Aer, 64),
                setStackSize(EssenceList.Crystallized_Essence_Humanus, 48),
                setStackSize(EssenceList.Crystallized_Essence_Pannus, 48),
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 48))
            .itemOutputs(getModItem(ThaumicTinkerer.ID, "ichorPouch", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addRunicMatrixRecipes);
        /*
         * //
         * GTValues.RA.stdBuilder()
         * .itemInputs(
         * // Runic Item 0-9
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
         * // Runic Item 10-19
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
         * // Runic Item 20-24
         * new ItemStack(Blocks.air, 0),
         * new ItemStack(Blocks.air, 0),
         * new ItemStack(Blocks.air, 0),
         * new ItemStack(Blocks.air, 0),
         * new ItemStack(Blocks.air, 0),
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
         * .itemOutputs(getModItem(.ID, "", 1L))
         * .duration(SECONDS)
         * .eut(RECIPE_IV)
         * .addTo(addRunicMatrixRecipes);
         */
    }
}
