package Recipes.ChaosRecipes;

import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.TierEU.RECIPE_LV;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;
import static util.Utils.setStackSize;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import EnumList.EnumItemList.EcosystemList.PamsHarvestCraftList;
import EnumList.EnumItemList.EnumGTList.GTBlockList;
import EnumList.EnumItemList.EnumGTList.GTItemList;
import EnumList.EnumItemList.EnumGTList.MultiMachineCasingList;
import EnumList.EnumItemList.EnumGTList.MultiMachineControllerList;
import EnumList.EnumItemList.EnumGTList.PipeList;
import EnumList.EnumItemList.EnumGTList.ToolList;
import EnumList.EnumItemList.EnumGTList.WireList;
import EnumList.EnumItemList.EnumMagicList.EssenceList;
import EnumList.EnumItemList.EnumMaterialList.BlockList;
import EnumList.EnumItemList.EnumMaterialList.BoltList;
import EnumList.EnumItemList.EnumMaterialList.CasingList;
import EnumList.EnumItemList.EnumMaterialList.DensePlateList;
import EnumList.EnumItemList.EnumMaterialList.FineWireList;
import EnumList.EnumItemList.EnumMaterialList.FoilList;
import EnumList.EnumItemList.EnumMaterialList.FrameBoxList;
import EnumList.EnumItemList.EnumMaterialList.LongRodList;
import EnumList.EnumItemList.EnumMaterialList.PlateList;
import EnumList.EnumItemList.EnumMaterialList.RingList;
import EnumList.EnumItemList.EnumMaterialList.RodList;
import EnumList.EnumItemList.EnumMaterialList.RotorList;
import EnumList.EnumItemList.EnumMaterialList.ScrewList;
import EnumList.EnumItemList.EnumMaterialList.SmallGearList;
import EnumList.EnumItemList.EnumMaterialList.SmallSpringList;
import EnumList.EnumItemList.EnumMaterialList.SpringList;
import EnumList.EnumItemList.EnumModList.Appliedenergistics2List;
import EnumList.EnumItemList.EnumModList.AutomagyList;
import EnumList.EnumItemList.EnumModList.BackpackList;
import EnumList.EnumItemList.EnumModList.BloodMagicList;
import EnumList.EnumItemList.EnumModList.BotaniaList;
import EnumList.EnumItemList.EnumModList.BuildCraftList;
import EnumList.EnumItemList.EnumModList.ElectroMagicToolsList;
import EnumList.EnumItemList.EnumModList.EnderIOList;
import EnumList.EnumItemList.EnumModList.EnderStorageList;
import EnumList.EnumItemList.EnumModList.EtFuturumRequiemList;
import EnumList.EnumItemList.EnumModList.ExtraBeesList;
import EnumList.EnumItemList.EnumModList.ExtraUtilitieList;
import EnumList.EnumItemList.EnumModList.ForestryList;
import EnumList.EnumItemList.EnumModList.GadomancyList;
import EnumList.EnumItemList.EnumModList.GoodGeneratorList;
import EnumList.EnumItemList.EnumModList.IronChestTankList;
import EnumList.EnumItemList.EnumModList.MagicBeesList;
import EnumList.EnumItemList.EnumModList.MinecraftList;
import EnumList.EnumItemList.EnumModList.NewHorizonsCoreModList;
import EnumList.EnumItemList.EnumModList.ProjectList;
import EnumList.EnumItemList.EnumModList.RailcraftList;
import EnumList.EnumItemList.EnumModList.TaintedMagicList;
import EnumList.EnumItemList.EnumModList.ThaumcraftList;
import EnumList.EnumItemList.EnumModList.ThaumicBasesList;
import EnumList.EnumItemList.EnumModList.ThaumicEnergisticsList;
import EnumList.EnumItemList.EnumModList.ThaumicHorizonsList;
import EnumList.EnumItemList.EnumModList.ThaumicTinkererList;
import EnumList.EnumItemList.EnumModList.TwilightForestList;
import EnumList.EnumItemList.EnumModList.WitcheryList;
import EnumList.EnumItemList.EnumOreProductList.DustList;
import EnumList.EnumItemList.EnumOreProductList.GemList;
import EnumList.EnumItemList.EnumOreProductList.IngotList;
import EnumList.EnumItemList.EnumTinkerConstructList.TinkerConstructList;
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
                setStackSize(AutomagyList.Sliver_of_Water, 2),
                setStackSize(MinecraftList.Clay_Ball, 1),
                setStackSize(MinecraftList.Slimeball, 1),
                setStackSize(MinecraftList.Ink_Sac, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 1))
            .itemOutputs(setStackSize(AutomagyList.Aqueous_Admixture, 2))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Alchemical Boiler"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BuildCraftList.Tank, 1),
                setStackSize(EtFuturumRequiemList.Blast_Furnace, 1),
                setStackSize(PlateList.Thaumium_Plate, 2),
                setStackSize(RailcraftList.High_Pressure_Boiler_Tank, 1),
                setStackSize(ThaumcraftList.Arcane_Stone_Bricks, 4),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 20),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 25),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20))
            .itemOutputs(AutomagyList.Alchemical_Boiler)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Amplified Redcrystal"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(AutomagyList.Redcrystal, 1),
                setStackSize(AutomagyList.Sliver_of_Fire, 1),
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
            .itemOutputs(setStackSize(AutomagyList.Amplified_Redcrystal, 2))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Dense Redcrystal"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(AutomagyList.Redcrystal, 4),
                setStackSize(AutomagyList.Sliver_of_Earth, 2),
                setStackSize(RodList.Terra_Rod, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 10))
            .itemOutputs(setStackSize(AutomagyList.Dense_Redcrystal, 2))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Dim Redcrystal"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(AutomagyList.Redcrystal, 1),
                setStackSize(AutomagyList.Sliver_of_Entropy, 8),
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
            .itemOutputs(setStackSize(AutomagyList.Dim_Redcrystal, 2))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Sliver of Air"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumcraftList.Air_Shard, 1),
                setStackSize(ToolList.Single_Use_Hammer, 1),
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
            .itemOutputs(setStackSize(AutomagyList.Sliver_of_Air, 4))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Sliver of Fire"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumcraftList.Fire_Shard, 1),
                setStackSize(ToolList.Single_Use_Hammer, 1),
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
            .itemOutputs(setStackSize(AutomagyList.Sliver_of_Fire, 4))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Sliver of Water"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumcraftList.Water_Shard, 1),
                setStackSize(ToolList.Single_Use_Hammer, 1),
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
            .itemOutputs(setStackSize(AutomagyList.Sliver_of_Water, 4))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Sliver of Earth"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumcraftList.Earth_Shard, 1),
                setStackSize(ToolList.Single_Use_Hammer, 1),
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
            .itemOutputs(setStackSize(AutomagyList.Sliver_of_Earth, 4))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Sliver of Order"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumcraftList.Order_Shard, 1),
                setStackSize(ToolList.Single_Use_Hammer, 1),
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
            .itemOutputs(setStackSize(AutomagyList.Sliver_of_Order, 4))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Sliver of Entropy"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumcraftList.Entropy_Shard, 1),
                setStackSize(ToolList.Single_Use_Hammer, 1),
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
            .itemOutputs(setStackSize(AutomagyList.Sliver_of_Entropy, 4))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Remote Comparator"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(AutomagyList.Redcrystal, 3),
                setStackSize(ProjectList.Comparator, 1),
                setStackSize(ThaumcraftList.Arcane_Stone_Block, 2),
                setStackSize(ThaumcraftList.Air_Crystal_Cluster, 1),
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
            .itemOutputs(AutomagyList.Remote_Comparator)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Resonating Redcrystal"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(Appliedenergistics2List.Pure_Nether_Quartz_Crystal, 4),
                setStackSize(AutomagyList.Redcrystal, 1),
                setStackSize(AutomagyList.Sliver_of_Air, 4),
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
            .itemOutputs(setStackSize(AutomagyList.Resonating_Redcrystal, 2))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Mercurial Redcrystal"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(AutomagyList.Redcrystal, 2),
                setStackSize(AutomagyList.Resonating_Redcrystal, 1),
                setStackSize(ThaumcraftList.Arcane_Stone_Block, 2),
                setStackSize(ThaumcraftList.Mirrored_Glass, 3),
                setStackSize(ThaumcraftList.Quicksilver, 1),
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
            .itemOutputs(AutomagyList.Mercurial_Redcrystal)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Thirsty Tank"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(AutomagyList.Avarice_Pearl, 1),
                setStackSize(MinecraftList.Glass, 3),
                setStackSize(ThaumcraftList.Arcane_Stone_Block, 4),
                setStackSize(ThaumcraftList.Water_Shard, 1),
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
            .itemOutputs(AutomagyList.Thirsty_Tank)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Glyph of the Void"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(AutomagyList.Aqueous_Admixture, 3),
                setStackSize(MinecraftList.Blaze_Powder, 1),
                setStackSize(MinecraftList.Obsidian, 1),
                setStackSize(ThaumcraftList.Arcane_Stone_Slab, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 3),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 10))
            .itemOutputs(AutomagyList.Glyph_of_the_Void)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Glyph of Consumption"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(AutomagyList.Aqueous_Admixture, 4),
                setStackSize(MinecraftList.Blaze_Powder, 1),
                setStackSize(ThaumcraftList.Arcane_Stone_Slab, 1),
                setStackSize(ThaumcraftList.Entropy_Shard, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 3),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 15))
            .itemOutputs(AutomagyList.Glyph_of_Consumption)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Glyph of Siphoning"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(AutomagyList.Aqueous_Admixture, 4),
                setStackSize(MinecraftList.Hopper, 1),
                setStackSize(ThaumcraftList.Arcane_Stone_Slab, 1),
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
            .itemOutputs(AutomagyList.Glyph_of_Siphoning)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Glyph of Envy"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(AutomagyList.Avarice_Pearl, 1),
                setStackSize(AutomagyList.Aqueous_Admixture, 3),
                setStackSize(ThaumcraftList.Arcane_Stone_Slab, 1),
                setStackSize(ThaumcraftList.Quicksilver, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 5),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 3))
            .itemOutputs(AutomagyList.Glyph_of_Envy)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Glyph of Temperance"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(AutomagyList.Aqueous_Admixture, 3),
                setStackSize(MinecraftList.Redstone_Dust, 4),
                setStackSize(ThaumcraftList.Arcane_Stone_Slab, 1),
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
            .itemOutputs(AutomagyList.Glyph_of_Temperance)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Glyph of Preservation"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(AutomagyList.Aqueous_Admixture, 4),
                setStackSize(MinecraftList.Slimeball, 1),
                setStackSize(ThaumcraftList.Arcane_Stone_Slab, 1),
                setStackSize(ThaumcraftList.Order_Shard, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 3),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5))
            .itemOutputs(AutomagyList.Glyph_of_Preservation)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Glyph of the Guzzler"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(AutomagyList.Aqueous_Admixture, 4),
                setStackSize(AutomagyList.Shattered_Avarice_Pearl, 1),
                getModItem(Minecraft.ID, "potion", 1L, 8226),
                setStackSize(MinecraftList.Glistering_Melon, 1),
                setStackSize(ThaumcraftList.Arcane_Stone_Slab, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 5),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 3),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 5))
            .itemOutputs(AutomagyList.Glyph_of_the_Guzzler)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Glyph of the Reservoir"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(AutomagyList.Aqueous_Admixture, 3),
                setStackSize(MinecraftList.Bucket, 2),
                setStackSize(MinecraftList.Ender_Pearl, 1),
                setStackSize(ThaumcraftList.Arcane_Stone_Slab, 1),
                setStackSize(ThaumcraftList.Water_Shard, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 3),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 16),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 3))
            .itemOutputs(AutomagyList.Glyph_of_the_Reservoir)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Glyph of the Bovine"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(AutomagyList.Aqueous_Admixture, 3),
                setStackSize(AutomagyList.Oculo_Anima, 1),
                setStackSize(MinecraftList.Leather, 2),
                setStackSize(MinecraftList.Milk, 1),
                setStackSize(ThaumcraftList.Arcane_Stone_Slab, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 15),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 3))
            .itemOutputs(AutomagyList.Glyph_of_the_Bovine)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Botania
        // "Glimmering Livingwood"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BotaniaList.Livingwood, 4),
                setStackSize(MinecraftList.Emerald, 1),
                setStackSize(TwilightForestList.Steeleaf, 4),
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
            .itemOutputs(setStackSize(BotaniaList.Glimmering_Livingwood, 4))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Alchemy Catalyst"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BotaniaList.Livingrock, 4),
                setStackSize(BotaniaList.Mana_Pearl, 1),
                setStackSize(IngotList.Manasteel_Ingot, 1),
                setStackSize(MinecraftList.Brewing_Stand, 2),
                setStackSize(ThaumcraftList.Alchemical_Construct, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 20),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 40))
            .itemOutputs(BotaniaList.Alchemy_Catalyst)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Conjuration Catalyst"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BotaniaList.Alchemy_Catalyst, 1),
                setStackSize(BotaniaList.Livingrock, 4),
                setStackSize(BotaniaList.Pixie_Dust, 2),
                setStackSize(PlateList.Terrasteel_Plate, 2),
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
            .itemOutputs(BotaniaList.Conjuration_Catalyst)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Mana Pylon"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BotaniaList.Block_of_Mana_Diamond, 1),
                setStackSize(BotaniaList.Block_of_Manasteel, 2),
                setStackSize(PlateList.Gold_Plate, 2),
                setStackSize(ThaumcraftList.Water_Shard, 4),
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
            .itemOutputs(BotaniaList.Mana_Pylon)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Natura Pylon"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BotaniaList.Mana_Pylon, 1),
                setStackSize(PlateList.Terrasteel_Plate, 2),
                setStackSize(TwilightForestList.Steeleaf, 2),
                setStackSize(ThaumcraftList.Earth_Shard, 4),
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
            .itemOutputs(BotaniaList.Natura_Pylon)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // BloodArsenal
        // "Transparent Orb"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BloodMagicList.Blood_Burned_String, 2),
                setStackSize(BloodMagicList.Blood_Lamp, 1),
                setStackSize(BloodMagicList.Blood_Stained_Glass, 4),
                setStackSize(BloodMagicList.Divination_Sigil, 1),
                setStackSize(BloodMagicList.Transcendent_Blood_Orb, 1),
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
            .itemOutputs(BloodMagicList.Transparent_Orb)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // BloodMagic
        // "Altar of GregoriusT's Blood"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(EnderIOList.Pulsating_Crystal, 2),
                setStackSize(ExtraUtilitieList.Double_Compressed_Cobblestone, 2),
                setStackSize(ThaumcraftList.Alchemical_Furnace, 1),
                setStackSize(ThaumcraftList.Arcane_Stone_Bricks, 2),
                setStackSize(ThaumcraftList.Crucible, 1),
                setStackSize(WitcheryList.Attuned_Stone, 1),
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
            .itemOutputs(BloodMagicList.Altar_of_GregoriusTs_Blood)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Sacrificial Knife"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BotaniaList.Soulscribe, 1),
                setStackSize(PlateList.Aluminium_Plate, 2),
                setStackSize(RodList.Steel_Rod, 1),
                setStackSize(ScrewList.Steel_Screw, 2),
                setStackSize(TinkerConstructList.Coagulated_Blood, 2),
                setStackSize(ToolList.Single_Use_Screwdriver, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 10),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 20))
            .itemOutputs(BloodMagicList.Sacrificial_Knife)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Imperfect Ritual Stone"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BloodMagicList.Blank_Blood_Stone, 1),
                setStackSize(BloodMagicList.Blank_Slate, 4),
                setStackSize(MinecraftList.Obsidian, 4),
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
            .itemOutputs(BloodMagicList.Imperfect_Ritual_Stone)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Ritual Stone"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BloodMagicList.Demonic_Slate, 3),
                setStackSize(BloodMagicList.Imperfect_Ritual_Stone, 1),
                setStackSize(BloodMagicList.Terrae, 1),
                setStackSize(MinecraftList.Obsidian, 4),
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
            .itemOutputs(BloodMagicList.Ritual_Stone)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Empty Core"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BloodMagicList.Simple_Catalyst, 1),
                setStackSize(PlateList.Rose_Gold_Plate, 2),
                setStackSize(PlateList.Stainless_Steel_Plate, 2),
                setStackSize(ThaumcraftList.Warded_Glass, 4),
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
            .itemOutputs(BloodMagicList.Empty_Core)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Empty Socket"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BloodMagicList.Obsidian_Brace, 4),
                setStackSize(BloodMagicList.Weak_Blood_Shard, 4),
                setStackSize(FrameBoxList.Diamond_Frame_Box, 1),
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
            .itemOutputs(BloodMagicList.Empty_Socket)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // ElectroMagicTools
        // "Feather Mesh"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ElectroMagicToolsList.Duct_Tape, 1),
                setStackSize(MinecraftList.Feather, 8),
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
            .itemOutputs(ElectroMagicToolsList.Feather_Mesh)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // EnderStorage
        // "Ender Chest"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(DensePlateList.Dense_Enderium_Plate, 2),
                setStackSize(GTItemList.Emitter_IV, 1),
                setStackSize(GTItemList.Sensor_IV, 1),
                setStackSize(IronChestTankList.Obsidian_Chest, 1),
                setStackSize(PlateList.Nether_Star_Plate, 4),
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
            .itemOutputs(EnderStorageList.Advanced_Ender_Chest)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Ender Tank"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(DensePlateList.Dense_Enderium_Plate, 2),
                setStackSize(GTItemList.Emitter_IV, 1),
                setStackSize(GTItemList.Sensor_IV, 1),
                setStackSize(IronChestTankList.Obsidian_Tank, 1),
                setStackSize(LongRodList.Long_Blaze_Rod, 4),
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
            .itemOutputs(EnderStorageList.Advanced_Ender_Tank)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Ender Pouch"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BackpackList.Big_Backpack, 1),
                setStackSize(DensePlateList.Dense_Enderium_Plate, 2),
                setStackSize(GTItemList.Emitter_IV, 1),
                setStackSize(GTItemList.Sensor_IV, 1),
                setStackSize(GemList.Exquisite_Diamond, 4),
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
            .itemOutputs(EnderStorageList.Ender_Pouch)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // ExtraBees
        // "Healing Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(DustList.Clay_Dust, 4),
                setStackSize(ForestryList.Impregnated_Frame, 1),
                setStackSize(ScrewList.Iron_Screw, 4),
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
            .itemOutputs(ExtraBeesList.Healing_Frame)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Chocolate Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(DustList.Cocoa_Powder, 2),
                setStackSize(ForestryList.Impregnated_Frame, 1),
                setStackSize(MinecraftList.Sugar, 2),
                setStackSize(ScrewList.Iron_Screw, 4),
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
            .itemOutputs(ExtraBeesList.Chocolate_Frame)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Restraint Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ForestryList.Impregnated_Frame, 1),
                setStackSize(MinecraftList.Iron_Bars, 4),
                setStackSize(ScrewList.Steel_Screw, 4),
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
            .itemOutputs(ExtraBeesList.Restraint_Frame)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Soul Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ExtraBeesList.Restraint_Frame, 1),
                setStackSize(MinecraftList.Soul_Sand, 4),
                setStackSize(ScrewList.Aluminium_Screw, 4),
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
            .itemOutputs(ExtraBeesList.Soul_Frame)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // ExtraUtilities
        // "Carved 'Eminence' Stone"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(PlateList.Enderpearl_Plate, 2),
                setStackSize(PlateList.Thulium_Plate, 4),
                setStackSize(ProjectList.Inverted_Magenta_Lamp, 1),
                setStackSize(ProjectList.Inverted_Purple_Lamp, 1),
                setStackSize(ThaumcraftList.Arcane_Stone_Bricks, 1),
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
            .itemOutputs(setStackSize(ExtraUtilitieList.Carved_Eminence_Stone, 2))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Magical Wood"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(PlateList.Thaumium_Plate, 2),
                setStackSize(MinecraftList.Bookshelf, 1),
                setStackSize(ThaumcraftList.Greatwood_Log, 2),
                setStackSize(ThaumcraftList.Silverwood_Log, 2),
                setStackSize(TwilightForestList.Carminite, 2),
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
            .itemOutputs(setStackSize(ExtraUtilitieList.Magical_Wood, 4))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Angel Block"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(AutomagyList.Runed_Obsidian, 1),
                setStackSize(DensePlateList.Dense_Obsidian_Plate, 2),
                setStackSize(FoilList.Rose_Gold_Foil, 2),
                setStackSize(PlateList.Aer_Crystal_Plate, 4),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 50))
            .itemOutputs(ExtraUtilitieList.Angel_Block)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Forestry
        // "Proven Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ForestryList.Honeydew, 1),
                setStackSize(ForestryList.Impregnated_Frame, 1),
                setStackSize(ForestryList.Propolis, 1),
                setStackSize(ForestryList.Royal_Jelly, 1),
                setStackSize(ForestryList.Silky_Propolis, 1),
                setStackSize(ScrewList.Steel_Screw, 4),
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
            .itemOutputs(ForestryList.Proven_Frame)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // GoodGenerator
        // "Essentia Filter Casing"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BlockList.Thauminite_Block, 1),
                setStackSize(MultiMachineCasingList.Filter_Machine_Casing, 1),
                setStackSize(PipeList.Small_Nether_Star_Fluid_Pipe, 2),
                setStackSize(RotorList.Void_Metal_Rotor, 2),
                setStackSize(ThaumcraftList.Filtered_Essentia_Tube, 2),
                setStackSize(ThaumcraftList.Flux_Scrubber, 1),
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
            .itemOutputs(GoodGeneratorList.Essentia_Filter_Casing)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Magic Casing"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(CasingList.Thaumium_Casing, 2),
                setStackSize(GTBlockList.Machine_Hull_HV, 1),
                setStackSize(MinecraftList.Glass, 2),
                setStackSize(ThaumcraftList.Salis_Mundus, 4),
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
            .itemOutputs(GoodGeneratorList.Magic_Casing)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Gadomancy
        // "Essentia Condenser"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(GadomancyList.Aura_Core_Aqua, 1),
                setStackSize(GadomancyList.Element_of_Darkness, 1),
                setStackSize(ThaumcraftList.Directional_Essentia_Tube, 4),
                setStackSize(ThaumcraftList.Greatwood_Log, 2),
                setStackSize(ThaumcraftList.Order_Crystal_Cluster, 1),
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
            .itemOutputs(GadomancyList.Essentia_Condenser)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // GregTech
        // "Ichorium Ingot"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(GemList.Flawless_Diamond, 2),
                setStackSize(IngotList.Osmiridium_Ingot, 1),
                setStackSize(IngotList.Void_Metal_Ingot, 2),
                setStackSize(ThaumicTinkererList.Ichor, 4),
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
            .itemOutputs(IngotList.Ichorium_Ingot)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Magical Machine Casing"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(FrameBoxList.Thaumium_Frame_Box, 1),
                setStackSize(PlateList.Thaumium_Plate, 6),
                setStackSize(ThaumcraftList.Salis_Mundus, 2),
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
            .itemOutputs(MultiMachineCasingList.Magical_Machine_Casing)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Research Completer"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(MultiMachineCasingList.Magical_Machine_Casing, 1),
                setStackSize(ThaumcraftList.Wand_Recharge_Pedestal, 1),
                setStackSize(ThaumcraftList.Warded_Glass, 3),
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
            .itemOutputs(MultiMachineControllerList.Research_Completer)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // MagicBees
        // "Sanguis Artus"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BloodMagicList.Bucket_of_Life, 4),
                setStackSize(BloodMagicList.Imbued_Slate, 4),
                setStackSize(MagicBeesList.Blood_Frame, 1),
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
            .itemOutputs(MagicBeesList.Sanguis_Artus)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Maddening Frame of Frenzy"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BloodMagicList.Imbued_Slate, 4),
                setStackSize(MagicBeesList.Blood_Frame, 1),
                setStackSize(ThaumcraftList.Nitor, 4),
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
            .itemOutputs(MagicBeesList.Maddening_Frame_of_Frenzy)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Magic Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ForestryList.Impregnated_Frame, 1),
                setStackSize(MagicBeesList.Amnesic_Wax, 1),
                setStackSize(MagicBeesList.Magic_Wax, 1),
                setStackSize(MagicBeesList.Soulful_Wax, 1),
                setStackSize(ScrewList.Steel_Screw, 4),
                setStackSize(ThaumcraftList.Enchanted_Fabric, 1),
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
            .itemOutputs(MagicBeesList.Magic_Frame)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Gentle Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(MagicBeesList.Air_Infused_Dust, 3),
                setStackSize(MagicBeesList.Essence_of_False_Life, 1),
                setStackSize(MagicBeesList.Magic_Frame, 1),
                setStackSize(ScrewList.Aluminium_Screw, 4),
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
            .itemOutputs(MagicBeesList.Gentle_Frame)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Resilient Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(MagicBeesList.Essence_of_Everlasting_Durability, 1),
                setStackSize(MagicBeesList.Magic_Frame, 1),
                setStackSize(MagicBeesList.Order_Infused_Dust, 3),
                setStackSize(ScrewList.Aluminium_Screw, 4),
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
            .itemOutputs(MagicBeesList.Resilient_Frame)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Necrotic Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(MagicBeesList.Chaos_Infused_Dust, 3),
                setStackSize(MagicBeesList.Essence_of_a_Shallow_Grave, 1),
                setStackSize(MagicBeesList.Magic_Frame, 1),
                setStackSize(ScrewList.Aluminium_Screw, 4),
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
            .itemOutputs(MagicBeesList.Necrotic_Frame)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Metabolic Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(MagicBeesList.Essence_of_Fickle_Permanence, 1),
                setStackSize(MagicBeesList.Fire_Infused_Dust, 3),
                setStackSize(MagicBeesList.Magic_Frame, 1),
                setStackSize(ScrewList.Aluminium_Screw, 4),
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
            .itemOutputs(MagicBeesList.Metabolic_Frame)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Temporal Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(MagicBeesList.Earth_Infused_Dust, 3),
                setStackSize(MagicBeesList.Essence_of_Lost_Time, 1),
                setStackSize(MagicBeesList.Magic_Frame, 1),
                setStackSize(ScrewList.Aluminium_Screw, 4),
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
            .itemOutputs(MagicBeesList.Temporal_Frame)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Oblivion Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(MagicBeesList.Essence_of_Scornful_Oblivion, 1),
                setStackSize(MagicBeesList.Magic_Frame, 1),
                setStackSize(MagicBeesList.Water_Infused_Dust, 3),
                setStackSize(ScrewList.Stainless_Steel_Screw, 4),
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
            .itemOutputs(MagicBeesList.Oblivion_Frame)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Thaumium Scoop"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(RodList.Thaumium_Rod, 6),
                setStackSize(ThaumcraftList.Enchanted_Fabric, 1),
                setStackSize(ToolList.Single_Use_Cutter, 1),
                setStackSize(ToolList.Single_Use_Hammer, 1),
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
            .itemOutputs(MagicBeesList.Thaumium_Scoop)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Void Scoop"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(RodList.Void_Metal_Rod, 6),
                setStackSize(ThaumcraftList.Enchanted_Fabric, 1),
                setStackSize(ToolList.Single_Use_Cutter, 1),
                setStackSize(ToolList.Single_Use_Hammer, 1),
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
            .itemOutputs(MagicBeesList.Void_Scoop)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Thaumium Grafter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(IngotList.Thaumium_Ingot, 1),
                setStackSize(PlateList.Thaumium_Plate, 1),
                setStackSize(RodList.Thaumium_Rod, 2),
                setStackSize(ToolList.Single_Use_Hammer, 1),
                setStackSize(ToolList.Single_Use_File, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 15),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 15))
            .itemOutputs(MagicBeesList.Thaumium_Grafter)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Void Grafter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(IngotList.Void_Metal_Ingot, 1),
                setStackSize(PlateList.Void_Metal_Plate, 1),
                setStackSize(RodList.Void_Metal_Rod, 2),
                setStackSize(ToolList.Single_Use_Hammer, 1),
                setStackSize(ToolList.Single_Use_File, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 30),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 30))
            .itemOutputs(MagicBeesList.Void_Grafter)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Minecraft
        // "Brewing Stand"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(LongRodList.Long_Blaze_Rod, 2),
                setStackSize(RingList.Aluminium_Ring, 2),
                setStackSize(RodList.Aluminium_Rod, 2),
                setStackSize(ScrewList.Aluminium_Screw, 2),
                setStackSize(MinecraftList.Cauldron, 1),
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
            .itemOutputs(MinecraftList.Brewing_Stand)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // TaintedMagic
        // "Shadowmetal Sword"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(PlateList.Shadow_Metal_Plate, 2),
                setStackSize(MinecraftList.Stick, 1),
                setStackSize(ToolList.Single_Use_File, 1),
                setStackSize(ToolList.Single_Use_Hammer, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 30),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 45))
            .itemOutputs(TaintedMagicList.Shadowmetal_Sword)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Thaumic Alloy"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(PlateList.Shadow_Metal_Plate, 2),
                setStackSize(PlateList.Thaumium_Plate, 2),
                setStackSize(PlateList.Void_Metal_Plate, 4),
                setStackSize(ThaumcraftList.Mixed_Crystal_Cluster, 1),
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
            .itemOutputs(TaintedMagicList.Thaumic_Alloy)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Thaumcraft
        // "Golem Upgrade: Air"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(IngotList.Gold_Ingot, 4),
                setStackSize(IngotList.Thaumium_Ingot, 2),
                setStackSize(ThaumcraftList.Quicksilver, 2),
                setStackSize(ThaumcraftList.Air_Crystal_Cluster, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5))
            .itemOutputs(setStackSize(ThaumcraftList.Golem_Upgrade_Air, 9))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Golem Upgrade: Earth"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(IngotList.Gold_Ingot, 4),
                setStackSize(IngotList.Thaumium_Ingot, 2),
                setStackSize(ThaumcraftList.Quicksilver, 2),
                setStackSize(ThaumcraftList.Earth_Crystal_Cluster, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5))
            .itemOutputs(setStackSize(ThaumcraftList.Golem_Upgrade_Earth, 9))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Golem Upgrade: Fire"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(IngotList.Gold_Ingot, 4),
                setStackSize(IngotList.Thaumium_Ingot, 2),
                setStackSize(ThaumcraftList.Quicksilver, 2),
                setStackSize(ThaumcraftList.Fire_Crystal_Cluster, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5))
            .itemOutputs(setStackSize(ThaumcraftList.Golem_Upgrade_Fire, 9))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Golem Upgrade: Water"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(IngotList.Gold_Ingot, 4),
                setStackSize(IngotList.Thaumium_Ingot, 2),
                setStackSize(ThaumcraftList.Quicksilver, 2),
                setStackSize(ThaumcraftList.Water_Crystal_Cluster, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5))
            .itemOutputs(setStackSize(ThaumcraftList.Golem_Upgrade_Water, 9))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Golem Upgrade: Order"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(IngotList.Gold_Ingot, 4),
                setStackSize(IngotList.Thaumium_Ingot, 2),
                setStackSize(ThaumcraftList.Quicksilver, 2),
                setStackSize(ThaumcraftList.Order_Crystal_Cluster, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20))
            .itemOutputs(setStackSize(ThaumcraftList.Golem_Upgrade_Order, 9))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Golem Upgrade: Entropy"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(IngotList.Gold_Ingot, 4),
                setStackSize(IngotList.Thaumium_Ingot, 2),
                setStackSize(ThaumcraftList.Quicksilver, 2),
                setStackSize(ThaumcraftList.Entropy_Crystal_Cluster, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 15))
            .itemOutputs(setStackSize(ThaumcraftList.Golem_Upgrade_Entropy, 9))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Crusted Stone"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(MinecraftList.Mossy_Cobblestone, 4),
                setStackSize(ThaumcraftList.Mixed_Crystal_Cluster, 1),
                setStackSize(ThaumcraftList.Salis_Mundus, 4),
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
            .itemOutputs(setStackSize(ThaumcraftList.Crusted_Stone, 4))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Glowing Crusted Stone"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(MinecraftList.Glowstone_Dust, 4),
                setStackSize(ThaumcraftList.Nitor, 4),
                setStackSize(ThaumcraftList.Crusted_Stone, 1),
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
            .itemOutputs(setStackSize(ThaumcraftList.Glowing_Crusted_Stone, 3))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Ancient Stone"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumcraftList.Arcane_Stone_Block, 6),
                setStackSize(ThaumcraftList.Glowing_Crusted_Stone, 2),
                setStackSize(ThaumcraftList.Eldritch_Eye, 1),
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
            .itemOutputs(setStackSize(ThaumcraftList.Ancient_Stone, 6))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Essentia Resonator"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(RodList.Thaumium_Rod, 2),
                setStackSize(ScrewList.Thaumium_Screw, 2),
                setStackSize(MinecraftList.Stick, 1),
                setStackSize(ThaumcraftList.Quicksilver_Drop, 1),
                setStackSize(ToolList.Single_Use_File, 1),
                setStackSize(ToolList.Single_Use_Screwdriver, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 8),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 8))
            .itemOutputs(ThaumcraftList.Essentia_Resonator)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Node Stabilizer"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BotaniaList.Block_of_Lavender_Quartz, 2),
                setStackSize(GTItemList.Electric_Piston_LV, 1),
                setStackSize(SpringList.Gold_Spring, 1),
                setStackSize(PlateList.Thaumium_Plate, 2),
                setStackSize(ThaumcraftList.Arcane_Stone_Bricks, 2),
                setStackSize(ThaumcraftList.Nitor, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 35),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 35),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 25))
            .itemOutputs(ThaumcraftList.Node_Stabilizer)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Air Crystal Cluster"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumcraftList.Air_Shard, 7),
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
            .itemOutputs(ThaumcraftList.Air_Crystal_Cluster)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Fire Crystal Cluster"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumcraftList.Fire_Shard, 7),
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
            .itemOutputs(ThaumcraftList.Fire_Crystal_Cluster)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Water Crystal Cluster"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumcraftList.Water_Shard, 7),
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
            .itemOutputs(ThaumcraftList.Water_Crystal_Cluster)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Earth Crystal Cluster"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumcraftList.Earth_Shard, 7),
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
            .itemOutputs(ThaumcraftList.Earth_Crystal_Cluster)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Order Crystal Cluster"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumcraftList.Order_Shard, 7),
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
            .itemOutputs(ThaumcraftList.Order_Crystal_Cluster)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Entropy Crystal Cluster"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumcraftList.Entropy_Shard, 7),
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
            .itemOutputs(ThaumcraftList.Entropy_Crystal_Cluster)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Mixed Crystal Cluster"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumcraftList.Air_Shard, 1),
                setStackSize(ThaumcraftList.Fire_Shard, 1),
                setStackSize(ThaumcraftList.Water_Shard, 1),
                setStackSize(ThaumcraftList.Earth_Shard, 1),
                setStackSize(ThaumcraftList.Order_Shard, 1),
                setStackSize(ThaumcraftList.Entropy_Shard, 1),
                setStackSize(ThaumcraftList.Balanced_Shard, 3),
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
            .itemOutputs(ThaumcraftList.Mixed_Crystal_Cluster)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Alchemical Furnace"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(EtFuturumRequiemList.Blast_Furnace, 1),
                setStackSize(PlateList.Thaumium_Plate, 2),
                setStackSize(RailcraftList.Low_Pressure_Boiler_Tank, 1),
                setStackSize(ThaumcraftList.Arcane_Stone_Bricks, 4),
                setStackSize(ThaumcraftList.Crucible, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5))
            .itemOutputs(ThaumcraftList.Alchemical_Furnace)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Arcane Pedestal"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumcraftList.Arcane_Stone_Block, 7),
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
            .itemOutputs(ThaumcraftList.Arcane_Pedestal)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Runic Matrix"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(MinecraftList.Eye_of_Ender, 1),
                setStackSize(ThaumcraftList.Arcane_Stone_Bricks, 4),
                setStackSize(ThaumcraftList.Mixed_Crystal_Cluster, 4),
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
            .itemOutputs(ThaumcraftList.Runic_Matrix)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Crucible
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(MinecraftList.Cauldron, 1),
                setStackSize(ThaumcraftList.Salis_Mundus, 3),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
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
            .itemOutputs(ThaumcraftList.Crucible)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Arcane Alembic"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(PlateList.Thaumium_Plate, 4),
                setStackSize(PipeList.Steel_Fluid_Pipe, 2),
                setStackSize(RailcraftList.Low_Pressure_Boiler_Tank, 1),
                setStackSize(ThaumcraftList.Vis_Filter, 2),
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
            .itemOutputs(ThaumcraftList.Arcane_Alembic)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Alchemical Construct"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BlockList.Block_of_Thaumium, 1),
                setStackSize(ThaumcraftList.Essentia_Tube, 4),
                setStackSize(ThaumcraftList.Essentia_Valve, 2),
                setStackSize(ThaumcraftList.Vis_Filter, 2),
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
            .itemOutputs(ThaumcraftList.Alchemical_Construct)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Advanced Alchemical Construct"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(PlateList.Void_Metal_Plate, 4),
                setStackSize(ThaumcraftList.Alchemical_Construct, 4),
                setStackSize(ThaumcraftList.Primordial_Pearl, 1),
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
            .itemOutputs(setStackSize(ThaumcraftList.Advanced_Alchemical_Construct, 4))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Essentia Tube"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(IngotList.Gold_Ingot, 2),
                setStackSize(PipeList.Small_Steel_Fluid_Pipe, 9),
                setStackSize(ScrewList.Thaumium_Screw, 36),
                setStackSize(ThaumcraftList.Quicksilver, 2),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 8),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 8))
            .itemOutputs(setStackSize(ThaumcraftList.Essentia_Tube, 36))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Essentia Valve"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(PlateList.Rubber_Sheet, 1),
                setStackSize(ScrewList.Thaumium_Screw, 2),
                setStackSize(SmallGearList.Small_Thaumium_Gear, 1),
                setStackSize(MinecraftList.Lever, 1),
                setStackSize(ThaumcraftList.Essentia_Tube, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 8),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 8))
            .itemOutputs(ThaumcraftList.Essentia_Valve)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Alchemical Centrifuge"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(GTItemList.Electric_Piston_MV, 1),
                setStackSize(ScrewList.Thaumium_Screw, 4),
                setStackSize(ThaumcraftList.Alchemical_Construct, 1),
                setStackSize(ThaumcraftList.Arcane_Alembic, 1),
                setStackSize(ThaumcraftList.Essentia_Tube, 2),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 16),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 32),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 16))
            .itemOutputs(ThaumcraftList.Alchemical_Centrifuge)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Filtered Essentia Tube"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ScrewList.Thaumium_Screw, 2),
                setStackSize(ThaumcraftList.Essentia_Tube, 1),
                setStackSize(ThaumcraftList.Vis_Filter, 2),
                setStackSize(ToolList.Single_Use_File, 1),
                setStackSize(ToolList.Single_Use_Screwdriver, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 16),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 16))
            .itemOutputs(ThaumcraftList.Filtered_Essentia_Tube)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Essentia Buffer"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ScrewList.Thaumium_Screw, 1),
                setStackSize(ThaumcraftList.Essentia_Tube, 2),
                setStackSize(ThaumcraftList.Essentia_Valve, 1),
                setStackSize(ThaumcraftList.Glass_Phial, 4),
                setStackSize(ThaumcraftList.Restricted_Essentia_Tube, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20))
            .itemOutputs(setStackSize(ThaumcraftList.Essentia_Buffer, 4))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Restricted Essentia Tube"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(RingList.Rubber_Ring, 2),
                setStackSize(ThaumcraftList.Essentia_Tube, 1),
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
            .itemOutputs(ThaumcraftList.Restricted_Essentia_Tube)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Directional Essentia Tube"
        GTValues.RA.stdBuilder()
            .itemInputs(
                setStackSize(ScrewList.Thaumium_Screw, 1),
                setStackSize(GemList.Lapis_Lazuli, 1),
                setStackSize(ThaumcraftList.Essentia_Tube, 1),
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
            .itemOutputs(ThaumcraftList.Directional_Essentia_Tube)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Enchanted Fabric"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(MinecraftList.String, 6),
                setStackSize(PamsHarvestCraftList.Woven_Cotton, 3),
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
            .itemOutputs(ThaumcraftList.Enchanted_Fabric)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Vis Filter"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(PlateList.Gold_Plate, 2),
                setStackSize(SmallSpringList.Small_Gold_Spring, 4),
                setStackSize(ThaumcraftList.Silverwood_Planks, 3),
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
            .itemOutputs(ThaumcraftList.Vis_Filter)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Mirrored Glass"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(MinecraftList.Ender_Pearl, 16),
                setStackSize(MinecraftList.Glass_Pane, 1),
                setStackSize(ThaumcraftList.Quicksilver, 4),
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
            .itemOutputs(ThaumcraftList.Mirrored_Glass)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Arcane Bellows"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BackpackList.Tanned_Leather, 2),
                setStackSize(GTItemList.Electric_Piston_LV, 1),
                setStackSize(ThaumcraftList.Greatwood_Slab, 4),
                setStackSize(ThaumcraftList.Air_Shard, 2),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10))
            .itemOutputs(ThaumcraftList.Arcane_Bellows)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Mundane Amulet"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(FineWireList.Fine_Gold_Wire, 5),
                setStackSize(ScrewList.Gold_Screw, 2),
                setStackSize(ThaumcraftList.Mixed_Crystal_Cluster, 1),
                setStackSize(ToolList.Single_Use_Screwdriver, 1),
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
            .itemOutputs(ThaumcraftList.Mundane_Amulet)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Primal Charm"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(RingList.Rose_Gold_Ring, 2),
                setStackSize(ThaumcraftList.Air_Crystal_Cluster, 1),
                setStackSize(ThaumcraftList.Earth_Crystal_Cluster, 1),
                setStackSize(ThaumcraftList.Entropy_Crystal_Cluster, 1),
                setStackSize(ThaumcraftList.Fire_Crystal_Cluster, 1),
                setStackSize(ThaumcraftList.Mixed_Crystal_Cluster, 1),
                setStackSize(ThaumcraftList.Order_Crystal_Cluster, 1),
                setStackSize(ThaumcraftList.Water_Crystal_Cluster, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 50),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 50),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 50),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 50))
            .itemOutputs(ThaumcraftList.Primal_Charm)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Obsidian Tile"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(MinecraftList.Obsidian, 4),
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
            .itemOutputs(setStackSize(ThaumcraftList.Obsidian_Tile, 4))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Paving Stone of Travel"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(PlateList.Aer_Crystal_Plate, 4),
                setStackSize(PlateList.Terra_Crystal_Plate, 4),
                setStackSize(ThaumcraftList.Arcane_Stone_Bricks, 1),
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
            .itemOutputs(setStackSize(ThaumcraftList.Paving_Stone_of_Travel, 4))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Paving Stone of Warding"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(PlateList.Ignis_Crystal_Plate, 4),
                setStackSize(PlateList.Ordo_Crystal_Plate, 4),
                setStackSize(ThaumcraftList.Arcane_Stone_Bricks, 1),
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
            .itemOutputs(setStackSize(ThaumcraftList.Paving_Stone_of_Warding, 4))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Mundane Belt"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(PamsHarvestCraftList.Hardened_Leather, 3),
                setStackSize(RingList.Gold_Ring, 1),
                setStackSize(ScrewList.Gold_Screw, 4),
                setStackSize(ToolList.Single_Use_Screwdriver, 1),
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
            .itemOutputs(ThaumcraftList.Mundane_Belt)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Focus Pouch"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BoltList.Gold_Bolt, 2),
                setStackSize(PamsHarvestCraftList.Hardened_Leather, 5),
                setStackSize(RingList.Gold_Ring, 1),
                setStackSize(ThaumcraftList.Mundane_Belt, 1),
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
            .itemOutputs(ThaumcraftList.Focus_Pouch)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Item Grate"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ScrewList.Steel_Screw, 4),
                setStackSize(WireList.Red_Alloy_Wire_1x, 1),
                setStackSize(NewHorizonsCoreModList.Steel_Bars, 2),
                setStackSize(NewHorizonsCoreModList.Aluminium_Bars, 1),
                setStackSize(ToolList.Single_Use_Screwdriver, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5))
            .itemOutputs(ThaumcraftList.Item_Grate)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Hungry Chest"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ScrewList.Thaumium_Screw, 4),
                setStackSize(MinecraftList.Chest, 1),
                setStackSize(ThaumcraftList.Item_Grate, 1),
                setStackSize(ThaumcraftList.Zombie_Brain, 2),
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
            .itemOutputs(ThaumcraftList.Hungry_Chest)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Arcane Stone Block"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(MinecraftList.Stone, 64),
                setStackSize(ThaumcraftList.Mixed_Crystal_Cluster, 1),
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
            .itemOutputs(setStackSize(ThaumcraftList.Arcane_Stone_Block, 64))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Warded Glass"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(PlateList.Thaumium_Plate, 2),
                setStackSize(MinecraftList.Glass, 4),
                setStackSize(ThaumcraftList.Greatwood_Planks, 2),
                setStackSize(ThaumcraftList.Wand_Focus_Warding, 1),
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
            .itemOutputs(setStackSize(ThaumcraftList.Warded_Glass, 4))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "White Tallow Candle"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(MinecraftList.String, 1),
                setStackSize(ThaumcraftList.Magic_Tallow, 2),
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
            .itemOutputs(ThaumcraftList.White_Tallow_Candle)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Goggles of Revealing"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(RingList.Gold_Ring, 2),
                setStackSize(RodList.Gold_Rod, 1),
                setStackSize(ScrewList.Gold_Screw, 1),
                setStackSize(PamsHarvestCraftList.Hardened_Leather, 2),
                setStackSize(ThaumcraftList.Thaumometer, 2),
                setStackSize(ToolList.Single_Use_Screwdriver, 1),
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
            .itemOutputs(ThaumcraftList.Goggles_of_Revealing)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Golem Animation Core"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(PlateList.Nether_Quartz_Plate, 2),
                setStackSize(PlateList.Thaumium_Plate, 2),
                setStackSize(MinecraftList.Brick, 2),
                setStackSize(MinecraftList.Nether_Brick, 2),
                setStackSize(ThaumcraftList.Nitor, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 5),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 5))
            .itemOutputs(ThaumcraftList.Golem_Animation_Core)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // ThaumicBases
        // "Ancient Gold Block"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BlockList.Block_of_Gold, 8),
                setStackSize(ThaumcraftList.Entropy_Crystal_Cluster, 1),
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
            .itemOutputs(setStackSize(BlockList.Ancient_Gold_Block, 8))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Thaumium Anvil"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BlockList.Block_of_Thaumium, 5),
                setStackSize(PlateList.Thaumium_Plate, 2),
                setStackSize(ScrewList.Thaumium_Screw, 2),
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
            .itemOutputs(ThaumicBasesList.Thaumium_Anvil)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // ThaumicEnergistics
        // "Diffusion Core"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(Appliedenergistics2List.Annihilation_Core, 1),
                setStackSize(GemList.Amber, 2),
                setStackSize(ThaumcraftList.Entropy_Crystal_Cluster, 2),
                setStackSize(ThaumcraftList.Quicksilver, 4),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 20),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 20))
            .itemOutputs(ThaumicEnergisticsList.Diffusion_Core)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Coalescence Core"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(Appliedenergistics2List.Formation_Core, 1),
                setStackSize(GemList.Amber, 2),
                setStackSize(ThaumcraftList.Order_Crystal_Cluster, 2),
                setStackSize(ThaumcraftList.Quicksilver, 4),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20))
            .itemOutputs(ThaumicEnergisticsList.Coalescence_Core)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Essentia Vibration Chamber"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(Appliedenergistics2List.ME_Terminal, 1),
                setStackSize(Appliedenergistics2List.Vibration_Chamber, 1),
                setStackSize(PlateList.Ordo_Crystal_Plate, 2),
                setStackSize(PlateList.Perditio_Crystal_Plate, 2),
                setStackSize(ThaumcraftList.Warded_Jar, 1),
                setStackSize(ThaumicEnergisticsList.Diffusion_Core, 2),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 35),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 35),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 35),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 35))
            .itemOutputs(ThaumicEnergisticsList.Essentia_Vibration_Chamber)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Essentia Import Bus"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(Appliedenergistics2List.ME_Import_Bus, 1),
                setStackSize(PlateList.Ordo_Crystal_Plate, 2),
                setStackSize(ThaumcraftList.Filtered_Essentia_Tube, 1),
                setStackSize(ThaumcraftList.Warded_Glass, 2),
                setStackSize(ThaumcraftList.Warded_Jar, 2),
                setStackSize(ThaumicEnergisticsList.Diffusion_Core, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 15),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 15))
            .itemOutputs(ThaumicEnergisticsList.Essentia_Import_Bus)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Essentia Export Bus"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(Appliedenergistics2List.ME_Export_Bus, 1),
                setStackSize(PlateList.Ordo_Crystal_Plate, 2),
                setStackSize(ThaumcraftList.Filtered_Essentia_Tube, 1),
                setStackSize(ThaumcraftList.Warded_Glass, 2),
                setStackSize(ThaumcraftList.Warded_Jar, 2),
                setStackSize(ThaumicEnergisticsList.Coalescence_Core, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 15),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 15),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 15))
            .itemOutputs(ThaumicEnergisticsList.Essentia_Export_Bus)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Essentia Storage Bus"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(Appliedenergistics2List.ME_Storage_Bus, 1),
                setStackSize(PlateList.Aqua_Crystal_Plate, 2),
                setStackSize(ThaumcraftList.Filtered_Essentia_Tube, 2),
                setStackSize(ThaumcraftList.Warded_Jar, 2),
                setStackSize(ThaumicEnergisticsList.Coalescence_Core, 1),
                setStackSize(ThaumicEnergisticsList.Diffusion_Core, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 20),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20))
            .itemOutputs(ThaumicEnergisticsList.Essentia_Storage_Bus)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "1k ME Essentia Storage Component"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(NewHorizonsCoreModList.Essentia_Processor_Tier_I, 1),
                setStackSize(ThaumcraftList.Salis_Mundus, 4),
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
            .itemOutputs(ThaumicEnergisticsList.ME_Essentia_Storage_Component_1k)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "4k ME Essentia Storage Component"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(NewHorizonsCoreModList.Essentia_Processor_Tier_I, 1),
                setStackSize(ThaumicEnergisticsList.ME_Essentia_Storage_Component_1k, 4),
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
            .itemOutputs(ThaumicEnergisticsList.ME_Essentia_Storage_Component_4k)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "16k ME Essentia Storage Component"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(NewHorizonsCoreModList.Essentia_Processor_Tier_I, 1),
                setStackSize(ThaumicEnergisticsList.ME_Essentia_Storage_Component_4k, 4),
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
            .itemOutputs(ThaumicEnergisticsList.ME_Essentia_Storage_Component_16k)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "64k ME Essentia Storage Component"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(NewHorizonsCoreModList.Essentia_Processor_Tier_I, 1),
                setStackSize(ThaumicEnergisticsList.ME_Essentia_Storage_Component_16k, 4),
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
            .itemOutputs(ThaumicEnergisticsList.ME_Essentia_Storage_Component_64k)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "256k ME Essentia Storage Component"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(NewHorizonsCoreModList.Essentia_Processor_Tier_I, 1),
                setStackSize(ThaumicEnergisticsList.ME_Essentia_Storage_Component_64k, 4),
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
            .itemOutputs(ThaumicEnergisticsList.ME_Essentia_Storage_Component_256k)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "1024k ME Essentia Storage Component"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(NewHorizonsCoreModList.Essentia_Processor_Tier_I, 1),
                setStackSize(ThaumicEnergisticsList.ME_Essentia_Storage_Component_256k, 4),
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
            .itemOutputs(ThaumicEnergisticsList.ME_Essentia_Storage_Component_1024k)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "4096k ME Essentia Storage Component"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(NewHorizonsCoreModList.Essentia_Processor_Tier_I, 1),
                setStackSize(ThaumicEnergisticsList.ME_Essentia_Storage_Component_1024k, 4),
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
            .itemOutputs(ThaumicEnergisticsList.ME_Essentia_Storage_Component_4096k)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "16384k ME Essentia Storage Component"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(NewHorizonsCoreModList.Essentia_Processor_Tier_I, 1),
                setStackSize(ThaumicEnergisticsList.ME_Essentia_Storage_Component_4096k, 4),
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
            .itemOutputs(ThaumicEnergisticsList.ME_Essentia_Storage_Component_16384k)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "ME Essentia Storage Housing"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(MinecraftList.Glass_Pane, 1),
                setStackSize(PlateList.Ignis_Crystal_Plate, 1),
                setStackSize(PlateList.Terra_Crystal_Plate, 2),
                setStackSize(PlateList.Thaumium_Plate, 3),
                setStackSize(ThaumcraftList.Warded_Glass, 2),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 10),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 10),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 10))
            .itemOutputs(ThaumicEnergisticsList.ME_Essentia_Storage_Housing)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "1k ME Essentia Storage Cell"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumicEnergisticsList.ME_Essentia_Storage_Housing, 1),
                setStackSize(ThaumicEnergisticsList.ME_Essentia_Storage_Component_1k, 1),
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
            .itemOutputs(ThaumicEnergisticsList.ME_Essentia_Storage_Cell_1k)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "4k ME Essentia Storage Cell"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumicEnergisticsList.ME_Essentia_Storage_Housing, 1),
                setStackSize(ThaumicEnergisticsList.ME_Essentia_Storage_Component_4k, 1),
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
            .itemOutputs(ThaumicEnergisticsList.ME_Essentia_Storage_Cell_4k)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "16k ME Essentia Storage Cell"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumicEnergisticsList.ME_Essentia_Storage_Housing, 1),
                setStackSize(ThaumicEnergisticsList.ME_Essentia_Storage_Component_16k, 1),
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
            .itemOutputs(ThaumicEnergisticsList.ME_Essentia_Storage_Cell_16k)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "64k ME Essentia Storage Cell"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumicEnergisticsList.ME_Essentia_Storage_Housing, 1),
                setStackSize(ThaumicEnergisticsList.ME_Essentia_Storage_Component_64k, 1),
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
            .itemOutputs(ThaumicEnergisticsList.ME_Essentia_Storage_Cell_64k)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "256k ME Essentia Storage Cell"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumicEnergisticsList.ME_Essentia_Storage_Housing, 1),
                setStackSize(ThaumicEnergisticsList.ME_Essentia_Storage_Component_256k, 1),
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
            .itemOutputs(ThaumicEnergisticsList.ME_Essentia_Storage_Cell_256k)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "1024k ME Essentia Storage Cell"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumicEnergisticsList.ME_Essentia_Storage_Housing, 1),
                setStackSize(ThaumicEnergisticsList.ME_Essentia_Storage_Component_1024k, 1),
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
            .itemOutputs(ThaumicEnergisticsList.ME_Essentia_Storage_Cell_1024k)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "4096k ME Essentia Storage Cell"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumicEnergisticsList.ME_Essentia_Storage_Housing, 1),
                setStackSize(ThaumicEnergisticsList.ME_Essentia_Storage_Component_4096k, 1),
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
            .itemOutputs(ThaumicEnergisticsList.ME_Essentia_Storage_Cell_4096k)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "16384k ME Essentia Storage Cell"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumicEnergisticsList.ME_Essentia_Storage_Housing, 1),
                setStackSize(ThaumicEnergisticsList.ME_Essentia_Storage_Component_16384k, 1),
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
            .itemOutputs(ThaumicEnergisticsList.ME_Essentia_Storage_Cell_16384k)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Vis Relay Interface"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(Appliedenergistics2List.ME_Interface, 1),
                setStackSize(Appliedenergistics2List.P2P_Tunnel_ME, 1),
                setStackSize(PlateList.Ordo_Crystal_Plate, 3),
                setStackSize(ScrewList.Terra_Screw, 2),
                setStackSize(ThaumcraftList.Mixed_Crystal_Cluster, 2),
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
            .itemOutputs(ThaumicEnergisticsList.Vis_Relay_Interface)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // ThaumicHorizons
        // "Planar Conduit"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(PlateList.Endereye_Plate, 4),
                setStackSize(PlateList.Void_Metal_Plate, 4),
                setStackSize(ThaumcraftList.Primal_Charm, 1),
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
            .itemOutputs(ThaumicHorizonsList.Planar_Conduit)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // ThaumicTinkerer
        // "Transvector Interface"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(GTItemList.Field_Generator_LV, 1),
                setStackSize(PipeList.Large_Electrum_Item_Pipe, 2),
                setStackSize(PipeList.Large_Steel_Fluid_Pipe, 2),
                setStackSize(ThaumcraftList.Arcane_Stone_Block, 4),
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
            .itemOutputs(ThaumicTinkererList.Transvector_Interface)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Dynamism Tablet"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(PlateList.Electrum_Plate, 2),
                setStackSize(PlateList.Rose_Gold_Plate, 2),
                setStackSize(PlateList.Thaumium_Plate, 2),
                setStackSize(ScrewList.Thaumium_Screw, 2),
                setStackSize(ThaumcraftList.Golem_Animation_Core, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 35),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 30),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20))
            .itemOutputs(ThaumicTinkererList.Dynamism_Tablet)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Ichorcloth
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(FoilList.Osmiridium_Foil, 1),
                setStackSize(FoilList.Void_Metal_Foil, 2),
                setStackSize(GemList.Flawless_Diamond, 2),
                setStackSize(ThaumcraftList.Enchanted_Fabric, 2),
                setStackSize(ThaumicTinkererList.Ichor, 2),
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
            .itemOutputs(setStackSize(ThaumicTinkererList.Ichorcloth, 2))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Transvector Dislocator"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(PlateList.Enderpearl_Plate, 2),
                setStackSize(ScrewList.Thaumium_Screw, 2),
                setStackSize(ThaumcraftList.Mirrored_Glass, 2),
                setStackSize(ThaumicTinkererList.Transvector_Interface, 1),
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
            .itemOutputs(ThaumicTinkererList.Transvector_Dislocator)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // TinkerConstruct
        // "Silky Cloth"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(FoilList.Gold_Foil, 4),
                setStackSize(MinecraftList.String, 4),
                setStackSize(ThaumcraftList.Enchanted_Fabric, 1),
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
            .itemOutputs(TinkerConstructList.Silky_Cloth)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Red Heart Canister"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(MinecraftList.Golden_Apple, 1),
                setStackSize(TinkerConstructList.Empty_Canister, 1),
                setStackSize(TinkerConstructList.Miniature_Red_Heart, 1),
                setStackSize(TinkerConstructList.Necrotic_Bone, 1),
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
            .itemOutputs(TinkerConstructList.Red_Heart_Canister)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Yellow Heart Canister"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(MinecraftList.Golden_Apple_Enchanting, 2),
                setStackSize(TinkerConstructList.Empty_Canister, 1),
                setStackSize(TinkerConstructList.Miniature_Yellow_Heart, 1),
                setStackSize(TinkerConstructList.Necrotic_Bone, 2),
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
            .itemOutputs(TinkerConstructList.Yellow_Heart_Canister)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Green Heart Canister"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(TinkerConstructList.Empty_Canister, 1),
                setStackSize(TinkerConstructList.Jeweled_Apple, 3),
                setStackSize(TinkerConstructList.Miniature_Green_Heart, 1),
                setStackSize(TinkerConstructList.Necrotic_Bone, 4),
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
            .itemOutputs(TinkerConstructList.Green_Heart_Canister)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Witchery
        // "Attuned Stone"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BotaniaList.Mana_Diamond, 1),
                setStackSize(MinecraftList.Lava_Bucket, 1),
                setStackSize(WitcheryList.Whiff_of_Magic, 1),
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
            .itemOutputs(WitcheryList.Attuned_Stone)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Ritual Chalk"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(WitcheryList.Gypsum, 2),
                setStackSize(WitcheryList.Tear_of_the_Goddess, 1),
                setStackSize(WitcheryList.Wood_Ash, 6),
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
            .itemOutputs(setStackSize(WitcheryList.Ritual_Chalk, 2))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Circle Talisman"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(GemList.Exquisite_Diamond, 1),
                setStackSize(RodList.Gold_Rod, 4),
                setStackSize(ScrewList.Gold_Screw, 4),
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
            .itemOutputs(WitcheryList.Circle_Talisman)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Altar
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(ThaumcraftList.Arcane_Stone_Block, 1),
                setStackSize(ThaumcraftList.Arcane_Stone_Bricks, 4),
                setStackSize(WitcheryList.Breath_of_the_Goddess, 1),
                setStackSize(WitcheryList.Exhale_of_the_Horned_One, 1),
                setStackSize(WitcheryList.Rowan_Wood, 2),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Terra, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 20),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 20))
            .itemOutputs(setStackSize(WitcheryList.Altar, 2))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Jar
        // "Warded Jar"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(MinecraftList.Glass_Pane, 7),
                setStackSize(PlateList.Rubber_Sheet, 1),
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
            .itemOutputs(ThaumcraftList.Warded_Jar)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // Wand Focus
        // "Wand Focus: Crafting"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(Appliedenergistics2List.Pure_Nether_Quartz_Crystal, 2),
                setStackSize(ThaumcraftList.Arcane_Worktable, 1),
                setStackSize(ThaumcraftList.Balanced_Shard, 2),
                setStackSize(ThaumcraftList.Earth_Crystal_Cluster, 2),
                setStackSize(ThaumcraftList.Order_Crystal_Cluster, 2),
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
            .itemOutputs(AutomagyList.Wand_Focus_Crafting)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Wand Focus: Kris-tmas"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(DustList.Crushed_Ice, 2),
                setStackSize(DustList.Snow_Powder, 2),
                setStackSize(MinecraftList.Pumpkin, 4),
                setStackSize(ThaumcraftList.Wand_Focus_Frost, 1),
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
            .itemOutputs(ElectroMagicToolsList.Wand_Focus_Kris_tmas)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Wand Focus: Vis Shard"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(EssenceList.Ethereal_Essence_Aer, 2),
                setStackSize(TaintedMagicList.Fluxed_Shard, 2),
                setStackSize(TaintedMagicList.Warped_Shard, 2),
                setStackSize(ThaumcraftList.Mixed_Crystal_Cluster, 2),
                setStackSize(ThaumcraftList.Quicksilver, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 50),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 50),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 50))
            .itemOutputs(TaintedMagicList.Wand_Focus_Vis_Shard)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Wand Focus: Fire"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BotaniaList.Blaze_Quartz, 4),
                setStackSize(GTItemList.Ruby_Lens, 1),
                setStackSize(ThaumcraftList.Fire_Crystal_Cluster, 4),
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
            .itemOutputs(ThaumcraftList.Wand_Focus_Fire)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Wand Focus: Shock"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BotaniaList.Sunny_Quartz, 4),
                setStackSize(GTItemList.Yellow_Garnet_Lens, 1),
                setStackSize(ThaumcraftList.Air_Crystal_Cluster, 4),
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
            .itemOutputs(ThaumcraftList.Wand_Focus_Shock)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Wand Focus: Frost"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BotaniaList.Mana_Quartz, 4),
                setStackSize(GTItemList.Diamond_Lens, 1),
                setStackSize(ThaumcraftList.Water_Crystal_Cluster, 4),
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
            .itemOutputs(ThaumcraftList.Wand_Focus_Frost)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Wand Focus: Equal Trade"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BotaniaList.Lavender_Quartz, 4),
                setStackSize(GTItemList.Reinforced_Glass_Lens, 1),
                setStackSize(ThaumcraftList.Mixed_Crystal_Cluster, 4),
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
            .itemOutputs(ThaumcraftList.Wand_Focus_Equal_Trade)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Wand Focus: Excavation"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(BotaniaList.Sunny_Quartz, 4),
                setStackSize(GTItemList.Emerald_Lens, 1),
                setStackSize(ThaumcraftList.Earth_Crystal_Cluster, 4),
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
            .itemOutputs(ThaumcraftList.Wand_Focus_Excavation)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Wand Focus: Primal"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(GemList.Exquisite_Diamond, 2),
                setStackSize(ThaumcraftList.Primal_Charm, 1),
                setStackSize(ThaumcraftList.Air_Crystal_Cluster, 1),
                setStackSize(ThaumcraftList.Earth_Crystal_Cluster, 1),
                setStackSize(ThaumcraftList.Entropy_Crystal_Cluster, 1),
                setStackSize(ThaumcraftList.Fire_Crystal_Cluster, 1),
                setStackSize(ThaumcraftList.Order_Crystal_Cluster, 1),
                setStackSize(ThaumcraftList.Water_Crystal_Cluster, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Aer, 75),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 75),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 75),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 75),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 75),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 75))
            .itemOutputs(ThaumcraftList.Wand_Focus_Primal)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Wand Focus: Ender Rift"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(PlateList.Enderium_Plate, 2),
                setStackSize(PlateList.Nether_Star_Plate, 1),
                setStackSize(ThaumcraftList.Magic_Mirror, 1),
                setStackSize(ThaumcraftList.Salis_Mundus, 4),
                setStackSize(ThaumcraftList.Wand_Focus_Portable_Hole, 1),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),
                new ItemStack(Blocks.air, 0),

                // Crystallized Essence
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 50),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 50))
            .itemOutputs(ThaumicTinkererList.Wand_Focus_Ender_Rift)
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addArcaneWorktableRecipes);

        // "Wand Focus: Efreet's Flame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Arcane Worktable Item 0-9
                setStackSize(MinecraftList.Furnace, 1),
                setStackSize(ThaumcraftList.Nitor, 2),
                setStackSize(ThaumcraftList.Salis_Mundus, 4),
                setStackSize(ThaumcraftList.Wand_Focus_Excavation, 1),
                setStackSize(ThaumcraftList.Wand_Focus_Fire, 1),
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
            .itemOutputs(ThaumicTinkererList.Wand_Focus_Efreets_Flame)
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
