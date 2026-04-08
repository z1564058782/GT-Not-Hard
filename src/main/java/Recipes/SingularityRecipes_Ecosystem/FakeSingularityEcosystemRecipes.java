package Recipes.SingularityRecipes_Ecosystem;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;
import static util.AggregateItemStackArray.addCompressAggregateArray;
import static util.AggregateItemStackArray.addSplitAggregateArray;
import static util.AggregateItemStackArray.checkItemStack;

import net.minecraft.item.ItemStack;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.OneToManyItemsFrontend_Large;

public class FakeSingularityEcosystemRecipes {

    public static int NEI_ItemOutput_Size = 90;

    public static final RecipeMap<RecipeMapBackend> addFakeEcosystemRecipes_AlgaeFarm = RecipeMapBuilder
        .of("Singularity of Ecosystem AlgaeFarm")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeEcosystemRecipes_Comb = RecipeMapBuilder
        .of("Singularity of Ecosystem Comb")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeEcosystemRecipes_Food = RecipeMapBuilder
        .of("Singularity of Ecosystem Food")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeEcosystemRecipes_TreeGrowth = RecipeMapBuilder
        .of("Singularity of Ecosystem TreeGrowth")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static void addFakeEcosystemRecipes_AlgaeFarm() {
        ItemStack[] Fake_Ecosystem_AlgaeFarm_List = addCompressAggregateArray(Ecosystem_AlgaeFarm.Pure_AlgaeFarm);
        ItemStack[] Fake_Ecosystem_AlgaeFarm_List_Checked = checkItemStack(Fake_Ecosystem_AlgaeFarm_List);
        ItemStack[][] Fake_Ecosystem_AlgaeFarm_List_Split = addSplitAggregateArray(
            Fake_Ecosystem_AlgaeFarm_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_Ecosystem_AlgaeFarm_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 997))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Ecosystem Mode")
                .eut(0)
                .addTo(addFakeEcosystemRecipes_AlgaeFarm);
        }
    }

    public static void addFakeEcosystemRecipes_Comb() {
        ItemStack[] Fake_Ecosystem_Comb_List = addCompressAggregateArray(
            Ecosystem_Comb.BiomesOPlenty_Comb,
            Ecosystem_Comb.GTPlusPlus_Comb,
            Ecosystem_Comb.Computronics_Comb,
            Ecosystem_Comb.ExtraBees_Comb,
            Ecosystem_Comb.Forestry_Comb,
            Ecosystem_Comb.MagicBees_Comb,
            Ecosystem_Comb.Gendustry_Comb,
            Ecosystem_Comb.GregTech_Comb);
        ItemStack[] Fake_Ecosystem_Comb_List_Checked = checkItemStack(Fake_Ecosystem_Comb_List);
        ItemStack[][] Fake_Ecosystem_Comb_List_Split = addSplitAggregateArray(
            Fake_Ecosystem_Comb_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_Ecosystem_Comb_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 9399))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Ecosystem Mode")
                .eut(0)
                .addTo(addFakeEcosystemRecipes_Comb);
        }
    }

    public static void addFakeEcosystemRecipes_Food() {
        ItemStack[] Fake_Ecosystem_Food_List = addCompressAggregateArray(
            Ecosystem_Food.Minecraft_Food,
            Ecosystem_Food.Automagy_Food,
            Ecosystem_Food.Avaritia_Food,
            Ecosystem_Food.Forestry_Food,
            Ecosystem_Food.BiomesOPlenty_Food,
            Ecosystem_Food.BloodArsenal_Food,
            Ecosystem_Food.Botania_Food,
            Ecosystem_Food.EnderIO_Food,
            Ecosystem_Food.ExtraTrees_Food,
            Ecosystem_Food.ForbiddenMagic_Food,
            Ecosystem_Food.GalacticraftCore_Food,
            Ecosystem_Food.GalaxySpace_Food,
            Ecosystem_Food.IndustrialCraft2_Food,
            Ecosystem_Food.MagicBees_Food,
            Ecosystem_Food.Natura_Food,
            Ecosystem_Food.OpenBlocks_Food,
            Ecosystem_Food.TinkerConstruct_Food,
            Ecosystem_Food.TaintedMagic_Food,
            Ecosystem_Food.Thaumcraft_Food,
            Ecosystem_Food.ThaumicExploration_Food,
            Ecosystem_Food.ThaumicHorizons_Food,
            Ecosystem_Food.TwilightForest_Food,
            Ecosystem_Food.WitchingGadgets_Food,
            Ecosystem_Food.CropsPlusPlus_Food,
            Ecosystem_Food.EtFuturumRequiem_Food,
            Ecosystem_Food.GregTech_Food,
            Ecosystem_Food.PamsHarvestCraft_Food,
            Ecosystem_Food.PamsHarvestTheNether_Food,
            Ecosystem_Food.GTPlusPlus_Food,
            Ecosystem_Food.Witchery_Food);
        ItemStack[] Fake_Ecosystem_Food_List_Checked = checkItemStack(Fake_Ecosystem_Food_List);
        ItemStack[][] Fake_Ecosystem_Food_List_Split = addSplitAggregateArray(
            Fake_Ecosystem_Food_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_Ecosystem_Food_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 311))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Ecosystem Mode")
                .eut(0)
                .addTo(addFakeEcosystemRecipes_Food);
        }
    }

    public static void addFakeEcosystemRecipes_TreeGrowth() {
        ItemStack[] Fake_Ecosystem_TreeGrowth_List = addCompressAggregateArray(
            Ecosystem_TreeGrowth.Minecraft_TreeGrowth,
            Ecosystem_TreeGrowth.IndustrialCraft2_TreeGrowth,
            Ecosystem_TreeGrowth.TinkerConstruct_TreeGrowth,
            Ecosystem_TreeGrowth.GTPlusPlus_TreeGrowth,
            Ecosystem_TreeGrowth.TwilightForest_TreeGrowth,
            Ecosystem_TreeGrowth.GalaxySpace_TreeGrowth,
            Ecosystem_TreeGrowth.GalacticraftAmunRa_TreeGrowth,
            Ecosystem_TreeGrowth.Thaumcraft_TreeGrowth,
            Ecosystem_TreeGrowth.ThaumicBases_TreeGrowth,
            Ecosystem_TreeGrowth.TaintedMagic_TreeGrowth,
            Ecosystem_TreeGrowth.ForbiddenMagic_TreeGrowth,
            Ecosystem_TreeGrowth.Witchery_TreeGrowth,
            Ecosystem_TreeGrowth.Natura_TreeGrowth,
            Ecosystem_TreeGrowth.BiomesOPlenty_TreeGrowth,
            Ecosystem_TreeGrowth.PamsHarvestCraft_TreeGrowth,
            Ecosystem_TreeGrowth.PamsHarvestTheNether_TreeGrowth,
            Ecosystem_TreeGrowth.EtFuturumRequiem_TreeGrowth,
            Ecosystem_TreeGrowth.Forestry_TreeGrowth,
            Ecosystem_TreeGrowth.ExtraTrees_TreeGrowth);
        ItemStack[] Fake_Ecosystem_TreeGrowth_List_Checked = checkItemStack(Fake_Ecosystem_TreeGrowth_List);
        ItemStack[][] Fake_Ecosystem_TreeGrowth_List_Split = addSplitAggregateArray(
            Fake_Ecosystem_TreeGrowth_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_Ecosystem_TreeGrowth_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 836))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Ecosystem Mode")
                .eut(0)
                .addTo(addFakeEcosystemRecipes_TreeGrowth);
        }
    }
}
