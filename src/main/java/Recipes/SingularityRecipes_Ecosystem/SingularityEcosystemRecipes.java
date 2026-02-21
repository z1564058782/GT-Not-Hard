package Recipes.SingularityRecipes_Ecosystem;

import static util.AggregateItemStackArray.addAggregateArray;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

public class SingularityEcosystemRecipes {

    public static final Map<Integer, ItemStack[]> EcosystemRecipes_AlgaeFarm = new HashMap<>();
    public static final Map<Integer, ItemStack[]> EcosystemRecipes_Comb = new HashMap<>();
    public static final Map<Integer, ItemStack[]> EcosystemRecipes_Food = new HashMap<>();
    public static final Map<Integer, ItemStack[]> EcosystemRecipes_TreeGrowth = new HashMap<>();

    public static void addEcosystemRecipes_AlgaeFarm() {
        ItemStack[] Ecosystem_AlgaeFarm_List = addAggregateArray(Ecosystem_AlgaeFarm.Pure_AlgaeFarm);
        EcosystemRecipes_AlgaeFarm.put(997, Ecosystem_AlgaeFarm_List);
    }

    public static void addEcosystemRecipes_Comb() {
        ItemStack[] Ecosystem_Comb_List = addAggregateArray(
            Ecosystem_Comb.BiomesOPlenty_Comb,
            Ecosystem_Comb.GTPlusPlus_Comb,
            Ecosystem_Comb.Computronics_Comb,
            Ecosystem_Comb.ExtraBees_Comb,
            Ecosystem_Comb.Forestry_Comb,
            Ecosystem_Comb.MagicBees_Comb,
            Ecosystem_Comb.Gendustry_Comb,
            Ecosystem_Comb.GregTech_Comb);
        EcosystemRecipes_Comb.put(9399, Ecosystem_Comb_List);
    }

    public static void addEcosystemRecipes_Food() {
        ItemStack[] Ecosystem_Food_List = addAggregateArray(
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
        EcosystemRecipes_Food.put(311, Ecosystem_Food_List);
    }

    public static void addEcosystemRecipes_TreeGrowth() {
        ItemStack[] Ecosystem_TreeGrowth_List = addAggregateArray(
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
        EcosystemRecipes_TreeGrowth.put(836, Ecosystem_TreeGrowth_List);
    }
}
