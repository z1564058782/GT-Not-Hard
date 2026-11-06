package Recipes.SingularityRecipes_VoidIngot;

import static gregtech.api.enums.Mods.NEIOrePlugin;
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
import util.RegisteredResourceCatalog;

public class FakeSingularityIngotRecipes {

    public static int NEI_ItemOutput_Size = util.RecipesFrontend.ResourceCatalogFrontend.OUTPUTS_PER_PAGE;

    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes = RecipeMapBuilder
        .of("Singularity of Void Ingot")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(util.RecipesFrontend.ResourceCatalogFrontend.HANDLER_HEIGHT))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes_T0 = addFakeVoidIngotRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes_T1 = addFakeVoidIngotRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes_T2 = addFakeVoidIngotRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes_T3 = addFakeVoidIngotRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes_T4 = addFakeVoidIngotRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes_T5 = addFakeVoidIngotRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes_T6 = addFakeVoidIngotRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes_T7 = addFakeVoidIngotRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes_T8 = addFakeVoidIngotRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes_T9 = addFakeVoidIngotRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes_T10 = addFakeVoidIngotRecipes;

    public static void addFakeVoidIngotRecipes_T0() {
        // T0 - Overworld - Ow
        ItemStack[] Fake_T0_Overworld_Ingot = addCompressAggregateArray(
            Vein_Ingot.Chalcopyrite_Vermiculite_Vein,
            Vein_Ingot.Grossular_Manganese_Vein,
            Vein_Ingot.Redstone_Vein,
            Vein_Ingot.Kyanite_Mica_Vein,
            Vein_Ingot.Chalcopyrite_Copper_Vein,
            Vein_Ingot.Brown_Limonite_Iron_Vein,
            Vein_Ingot.Apatite_Vein,
            Vein_Ingot.Basaltic_Mineral_Sand_Vein,
            Vein_Ingot.Magnetite_Vein,
            Vein_Ingot.Cassiterite_Tin_Vein,
            Vein_Ingot.Rock_Salt_Salt_Vein,
            Vein_Ingot.Graphite_Diamond_Vein,
            Vein_Ingot.Lazurite_Lapis_Vein,
            Vein_Ingot.Coal_Vein,
            Vein_Ingot.Dolomite_Vein,
            Vein_Ingot.Soapstone_Vein,
            Vein_Ingot.Magnetite_Gold_Vein,
            Vein_Ingot.Kaolinite_Vein,
            Vein_Ingot.Lignite_Coal_Vein,
            Vein_Ingot.Tin_Cassiterite_Vein,
            SmallOre_Ingot.Overworld_SmallOre);
        ItemStack[] Fake_T0_Overworld_Ingot_Checked = checkItemStack(Fake_T0_Overworld_Ingot);
        ItemStack[][] Fake_T0_Overworld_Ingot_Split = addSplitAggregateArray(
            Fake_T0_Overworld_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T0_Overworld_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ow", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T0);
        }

        // T0 - Nether - Ne
        ItemStack[] Fake_T0_Nether_Ingot = addCompressAggregateArray(
            Vein_Ingot.Wulfenite_Molybdenum_Vein,
            Vein_Ingot.Grossular_Manganese_Vein,
            Vein_Ingot.Redstone_Vein,
            Vein_Ingot.Chalcopyrite_Copper_Vein,
            Vein_Ingot.Brown_Limonite_Iron_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Sulfur_Vein,
            Vein_Ingot.Quartzite_Vein,
            Vein_Ingot.Beryllium_Vein,
            Vein_Ingot.Saltpeter_Electrotine_Vein,
            Vein_Ingot.Nether_Quartz_Vein,
            SmallOre_Ingot.Nether_SmallOre);
        ItemStack[] Fake_T0_Nether_Ingot_Checked = checkItemStack(Fake_T0_Nether_Ingot);
        ItemStack[][] Fake_T0_Nether_Ingot_Split = addSplitAggregateArray(
            Fake_T0_Nether_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T0_Nether_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ne", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T0);
        }

        // T0 - Twilight - TF
        ItemStack[] Fake_T0_Twilight_Ingot = addCompressAggregateArray(
            Vein_Ingot.Wulfenite_Molybdenum_Vein,
            Vein_Ingot.Garnierite_Nickel_Vein,
            Vein_Ingot.Brown_Limonite_Iron_Vein,
            Vein_Ingot.Apatite_Vein,
            Vein_Ingot.Magnetite_Vein,
            Vein_Ingot.Rock_Salt_Salt_Vein,
            Vein_Ingot.Graphite_Diamond_Vein,
            Vein_Ingot.Lazurite_Lapis_Vein,
            Vein_Ingot.Bentonite_Olivine_Vein,
            Vein_Ingot.Terra_Aer_Vein,
            Vein_Ingot.Coal_Vein,
            Vein_Ingot.Almandine_Sapphire_Vein,
            Vein_Ingot.Galena_Cryolite_Vein,
            Vein_Ingot.Soapstone_Vein,
            Vein_Ingot.Perditio_Ordo_Vein,
            Vein_Ingot.Magnetite_Gold_Vein,
            Vein_Ingot.Tin_Cassiterite_Vein,
            Vein_Ingot.Aqua_Ignis_Amber_Vein,
            SmallOre_Ingot.Twilight_SmallOre);
        ItemStack[] Fake_T0_Twilight_Ingot_Checked = checkItemStack(Fake_T0_Twilight_Ingot);
        ItemStack[][] Fake_T0_Twilight_Ingot_Split = addSplitAggregateArray(
            Fake_T0_Twilight_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T0_Twilight_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_TF", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T0);
        }

        // T0 - TheEnd - ED
        ItemStack[] Fake_T0_TheEnd_Ingot = addCompressAggregateArray(
            Vein_Ingot.Wulfenite_Molybdenum_Vein,
            Vein_Ingot.Garnierite_Nickel_Vein,
            Vein_Ingot.Chalcopyrite_Copper_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Magnetite_Gold_Vein,
            Vein_Ingot.Beryllium_Vein,
            Vein_Ingot.Tin_Cassiterite_Vein,
            SmallOre_Ingot.TheEnd_SmallOre);
        ItemStack[] Fake_T0_TheEnd_Ingot_Checked = checkItemStack(Fake_T0_TheEnd_Ingot);
        ItemStack[][] Fake_T0_TheEnd_Ingot_Split = addSplitAggregateArray(
            Fake_T0_TheEnd_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T0_TheEnd_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_ED", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T0);
        }

        // T0 - EndAsteroid - EA
        ItemStack[] Fake_T0_EndAsteroid_Ingot = addCompressAggregateArray(
            Vein_Ingot.Wulfenite_Molybdenum_Vein,
            Vein_Ingot.Grossular_Manganese_Vein,
            Vein_Ingot.Garnierite_Nickel_Vein,
            Vein_Ingot.Chalcopyrite_Copper_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Naquadah_Vein,
            Vein_Ingot.Scheelite_Tungstate_Vein,
            Vein_Ingot.Lazurite_Lapis_Vein,
            Vein_Ingot.Bentonite_Olivine_Vein,
            Vein_Ingot.Magnetite_Gold_Vein,
            Vein_Ingot.Beryllium_Vein,
            Vein_Ingot.Sheldonite_Platinum_Vein,
            Vein_Ingot.Tin_Cassiterite_Vein,
            SmallOre_Ingot.EndAsteroid_SmallOre);
        ItemStack[] Fake_T0_EndAsteroid_Ingot_Checked = checkItemStack(Fake_T0_EndAsteroid_Ingot);
        ItemStack[][] Fake_T0_EndAsteroid_Ingot_Split = addSplitAggregateArray(
            Fake_T0_EndAsteroid_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T0_EndAsteroid_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_EA", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T0);
        }

        // T0 - TheToxicEverglades - Eg
        ItemStack[] Fake_T0_TheToxicEverglades_Ingot = addCompressAggregateArray(
            Vein_Ingot.Agardite_Nd_Vein,
            Vein_Ingot.Agardite_Cd_Vein,
            Vein_Ingot.Iron_Vein,
            Vein_Ingot.Xenotime_Vein,
            Vein_Ingot.Hibonite_Vein,
            Vein_Ingot.Geikielite_Vein,
            Vein_Ingot.Cerite_Vein,
            Vein_Ingot.Lanthanite_Ce_Vein,
            Vein_Ingot.Titanite_Vein,
            Vein_Ingot.Honeaite_Vein,
            Vein_Ingot.Demicheleite_Br_Vein,
            Vein_Ingot.Fluorcaphite_Vein,
            Vein_Ingot.Cryolite_F_Vein,
            Vein_Ingot.Fluorite_F_Vein,
            Vein_Ingot.Gadolinite_Ce_Vein,
            Vein_Ingot.Runite_Vein,
            Vein_Ingot.Yttrocerite_Vein,
            Vein_Ingot.Florencite_Vein);
        ItemStack[] Fake_T0_TheToxicEverglades_Ingot_Checked = checkItemStack(Fake_T0_TheToxicEverglades_Ingot);
        ItemStack[][] Fake_T0_TheToxicEverglades_Ingot_Split = addSplitAggregateArray(
            Fake_T0_TheToxicEverglades_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T0_TheToxicEverglades_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Eg", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T0);
        }
    }

    public static void addFakeVoidIngotRecipes_T1() {
        // T1 - Moon - Mo
        ItemStack[] Fake_T1_Moon_Ingot = addCompressAggregateArray(
            Vein_Ingot.Wulfenite_Molybdenum_Vein,
            Vein_Ingot.Quartzite_Quartz_Vein,
            Vein_Ingot.Bastnasite_Monazite_Vein,
            Vein_Ingot.Chalcopyrite_Copper_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Galena_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Tin_Cassiterite_Vein,
            SmallOre_Ingot.Moon_SmallOre);
        ItemStack[] Fake_T1_Moon_Ingot_Checked = checkItemStack(Fake_T1_Moon_Ingot);
        ItemStack[][] Fake_T1_Moon_Ingot_Split = addSplitAggregateArray(
            Fake_T1_Moon_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T1_Moon_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mo", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T1);
        }
    }

    public static void addFakeVoidIngotRecipes_T2() {
        // T2 - Deimos - De
        ItemStack[] Fake_T2_Deimos_Ingot = addCompressAggregateArray(
            Vein_Ingot.Bastnasite_Monazite_Vein,
            Vein_Ingot.Garnierite_Nickel_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Oriharukon_Vein,
            Vein_Ingot.Magnetite_Vein,
            Vein_Ingot.Uraninite_Uranium238_Vein,
            Vein_Ingot.Scheelite_Tungstate_Vein,
            Vein_Ingot.Sulfur_Vein,
            Vein_Ingot.Lazurite_Lapis_Vein,
            Vein_Ingot.Draconium_Vein,
            SmallOre_Ingot.Deimos_SmallOre);
        ItemStack[] Fake_T2_Deimos_Ingot_Checked = checkItemStack(Fake_T2_Deimos_Ingot);
        ItemStack[][] Fake_T2_Deimos_Ingot_Split = addSplitAggregateArray(
            Fake_T2_Deimos_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T2_Deimos_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_De", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T2);
        }

        // T2 - Mars - Ma
        ItemStack[] Fake_T2_Mars_Ingot = addCompressAggregateArray(
            Vein_Ingot.Pitchblende_Vein,
            Vein_Ingot.Quartzite_Quartz_Vein,
            Vein_Ingot.Redstone_Vein,
            Vein_Ingot.Garnierite_Nickel_Vein,
            Vein_Ingot.Arsenic_Vein,
            Vein_Ingot.Brown_Limonite_Iron_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Galena_Vein,
            Vein_Ingot.Rock_Salt_Salt_Vein,
            Vein_Ingot.Scheelite_Tungstate_Vein,
            Vein_Ingot.Sulfur_Vein,
            Vein_Ingot.Desh_Vein,
            Vein_Ingot.Magnetite_Gold_Vein,
            SmallOre_Ingot.Mars_SmallOre);
        ItemStack[] Fake_T2_Mars_Ingot_Checked = checkItemStack(Fake_T2_Mars_Ingot);
        ItemStack[][] Fake_T2_Mars_Ingot_Split = addSplitAggregateArray(
            Fake_T2_Mars_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T2_Mars_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ma", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T2);
        }

        // T2 - Phobos - Ph
        ItemStack[] Fake_T2_Phobos_Ingot = addCompressAggregateArray(
            Vein_Ingot.Wulfenite_Molybdenum_Vein,
            Vein_Ingot.Pitchblende_Vein,
            Vein_Ingot.Quartzite_Quartz_Vein,
            Vein_Ingot.Garnierite_Nickel_Vein,
            Vein_Ingot.Arsenic_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Oriharukon_Vein,
            Vein_Ingot.Uraninite_Uranium238_Vein,
            Vein_Ingot.Sulfur_Vein,
            Vein_Ingot.Graphite_Diamond_Vein,
            Vein_Ingot.Draconium_Vein,
            Vein_Ingot.Magnetite_Gold_Vein,
            SmallOre_Ingot.Phobos_SmallOre);
        ItemStack[] Fake_T2_Phobos_Ingot_Checked = checkItemStack(Fake_T2_Phobos_Ingot);
        ItemStack[][] Fake_T2_Phobos_Ingot_Split = addSplitAggregateArray(
            Fake_T2_Phobos_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T2_Phobos_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ph", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T2);
        }
    }

    public static void addFakeVoidIngotRecipes_T3() {
        // T3 - Asteroids - As
        ItemStack[] Fake_T3_Asteroids_Ingot = addCompressAggregateArray(
            Vein_Ingot.Carbon_Dioxide_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Naquadah_Vein,
            Vein_Ingot.Methane_Vein,
            Vein_Ingot.Scheelite_Tungstate_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Platinum_Palladium_Vein,
            Vein_Ingot.Magnetite_Gold_Vein,
            Vein_Ingot.Sheldonite_Platinum_Vein,
            SmallOre_Ingot.Asteroids_SmallOre);
        ItemStack[] Fake_T3_Asteroids_Ingot_Checked = checkItemStack(Fake_T3_Asteroids_Ingot);
        ItemStack[][] Fake_T3_Asteroids_Ingot_Split = addSplitAggregateArray(
            Fake_T3_Asteroids_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Asteroids_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_As", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T3);
        }

        // T3 - Callisto - Ca
        ItemStack[] Fake_T3_Callisto_Ingot = addCompressAggregateArray(
            Vein_Ingot.Uranium238_Plutonium239_Vein,
            Vein_Ingot.Bastnasite_Monazite_Vein,
            Vein_Ingot.Chalcopyrite_Copper_Vein,
            Vein_Ingot.Brown_Limonite_Iron_Vein,
            Vein_Ingot.Scheelite_Tungstate_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Platinum_Palladium_Vein,
            Vein_Ingot.Callisto_Ice_Vein,
            Vein_Ingot.Magnetite_Gold_Vein,
            SmallOre_Ingot.Callisto_SmallOre);
        ItemStack[] Fake_T3_Callisto_Ingot_Checked = checkItemStack(Fake_T3_Callisto_Ingot);
        ItemStack[][] Fake_T3_Callisto_Ingot_Split = addSplitAggregateArray(
            Fake_T3_Callisto_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Callisto_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ca", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T3);
        }

        // T3 - Ceres - Ce
        ItemStack[] Fake_T3_Ceres_Ingot = addCompressAggregateArray(
            Vein_Ingot.Uranium238_Plutonium239_Vein,
            Vein_Ingot.Wulfenite_Molybdenum_Vein,
            Vein_Ingot.Grossular_Manganese_Vein,
            Vein_Ingot.Chalcopyrite_Copper_Vein,
            Vein_Ingot.Brown_Limonite_Iron_Vein,
            Vein_Ingot.Magnetite_Vein,
            Vein_Ingot.Uraninite_Uranium238_Vein,
            Vein_Ingot.Lazurite_Lapis_Vein,
            Vein_Ingot.Bentonite_Olivine_Vein,
            Vein_Ingot.Platinum_Palladium_Vein,
            Vein_Ingot.Soapstone_Vein,
            Vein_Ingot.Beryllium_Vein,
            Vein_Ingot.Saltpeter_Electrotine_Vein,
            SmallOre_Ingot.Ceres_SmallOre);
        ItemStack[] Fake_T3_Ceres_Ingot_Checked = checkItemStack(Fake_T3_Ceres_Ingot);
        ItemStack[][] Fake_T3_Ceres_Ingot_Split = addSplitAggregateArray(
            Fake_T3_Ceres_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Ceres_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ce", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T3);
        }

        // T3 - Europa - Eu
        ItemStack[] Fake_T3_Europa_Ingot = addCompressAggregateArray(
            Vein_Ingot.Magnesite_Vein,
            Vein_Ingot.Basaltic_Mineral_Sand_Vein,
            Vein_Ingot.Chrome_Vein,
            Vein_Ingot.Ledox_Vein,
            Vein_Ingot.Cassiterite_Tin_Vein);
        ItemStack[] Fake_T3_Europa_Ingot_Checked = checkItemStack(Fake_T3_Europa_Ingot);
        ItemStack[][] Fake_T3_Europa_Ingot_Split = addSplitAggregateArray(
            Fake_T3_Europa_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Europa_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Eu", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T3);
        }

        // T3 - Ganymede - Ga
        ItemStack[] Fake_T3_Ganymede_Ingot = addCompressAggregateArray(
            Vein_Ingot.Uranium238_Plutonium239_Vein,
            Vein_Ingot.Redstone_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Brown_Limonite_Iron_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Galena_Vein,
            Vein_Ingot.Uraninite_Uranium238_Vein,
            Vein_Ingot.Scheelite_Tungstate_Vein,
            Vein_Ingot.Graphite_Diamond_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Platinum_Palladium_Vein,
            SmallOre_Ingot.Ganymede_SmallOre);
        ItemStack[] Fake_T3_Ganymede_Ingot_Checked = checkItemStack(Fake_T3_Ganymede_Ingot);
        ItemStack[][] Fake_T3_Ganymede_Ingot_Split = addSplitAggregateArray(
            Fake_T3_Ganymede_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Ganymede_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ga", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T3);
        }

        // T3 - Ross128b - Rb
        ItemStack[] Fake_T3_Ross128b_Ingot = addCompressAggregateArray(
            Vein_Ingot.Arsenopyrite_Vein,
            Vein_Ingot.Hedenbergite_Vein,
            Vein_Ingot.Olenite_Vein,
            Vein_Ingot.Forsterite_Vein,
            Vein_Ingot.Djurleite_Vein,
            Vein_Ingot.Thorianite_Vein,
            Vein_Ingot.Graphite_Vein,
            Vein_Ingot.Fayalite_Vein,
            Vein_Ingot.Ferberite_Vein,
            Vein_Ingot.Bismutite_Vein);
        ItemStack[] Fake_T3_Ross128b_Ingot_Checked = checkItemStack(Fake_T3_Ross128b_Ingot);
        ItemStack[][] Fake_T3_Ross128b_Ingot_Split = addSplitAggregateArray(
            Fake_T3_Ross128b_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Ross128b_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Rb", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T3);
        }
    }

    public static void addFakeVoidIngotRecipes_T4() {
        // T4 - Io - Io
        ItemStack[] Fake_T4_Io_Ingot = addCompressAggregateArray(
            Vein_Ingot.Uranium238_Plutonium239_Vein,
            Vein_Ingot.Grossular_Manganese_Vein,
            Vein_Ingot.Pitchblende_Vein,
            Vein_Ingot.Quartzite_Quartz_Vein,
            Vein_Ingot.Pyrolusite_Vein,
            Vein_Ingot.Gold_Infused_Gold_Vein,
            Vein_Ingot.Bastnasite_Monazite_Vein,
            Vein_Ingot.Magnetite_Vein,
            Vein_Ingot.Sulfur_Vein,
            Vein_Ingot.Platinum_Palladium_Vein,
            Vein_Ingot.Mytryl_Vein,
            Vein_Ingot.Nickel_Iridium_Vein,
            Vein_Ingot.Tin_Cassiterite_Vein,
            SmallOre_Ingot.Io_SmallOre);
        ItemStack[] Fake_T4_Io_Ingot_Checked = checkItemStack(Fake_T4_Io_Ingot);
        ItemStack[][] Fake_T4_Io_Ingot_Split = addSplitAggregateArray(Fake_T4_Io_Ingot_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T4_Io_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Io", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T4);
        }

        // T4 - Mercury - Me
        ItemStack[] Fake_T4_Mercury_Ingot = addCompressAggregateArray(
            Vein_Ingot.Wulfenite_Molybdenum_Vein,
            Vein_Ingot.Redstone_Vein,
            Vein_Ingot.Arsenic_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Brown_Limonite_Iron_Vein,
            Vein_Ingot.Naquadah_Vein,
            Vein_Ingot.Graphite_Diamond_Vein,
            Vein_Ingot.Draconium_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Platinum_Palladium_Vein,
            Vein_Ingot.Nickel_Iridium_Vein,
            SmallOre_Ingot.Mercury_SmallOre);
        ItemStack[] Fake_T4_Mercury_Ingot_Checked = checkItemStack(Fake_T4_Mercury_Ingot);
        ItemStack[][] Fake_T4_Mercury_Ingot_Split = addSplitAggregateArray(
            Fake_T4_Mercury_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T4_Mercury_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Me", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T4);
        }

        // T4 - Venus - Ve
        ItemStack[] Fake_T4_Venus_Ingot = addCompressAggregateArray(
            Vein_Ingot.Pitchblende_Vein,
            Vein_Ingot.Quartzite_Quartz_Vein,
            Vein_Ingot.Redstone_Vein,
            Vein_Ingot.Bastnasite_Monazite_Vein,
            Vein_Ingot.Garnierite_Nickel_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Galena_Vein,
            Vein_Ingot.Naquadah_Vein,
            Vein_Ingot.Sulfur_Vein,
            Vein_Ingot.Beryllium_Vein,
            Vein_Ingot.Rutile_Vein,
            Vein_Ingot.Quantium_Vein,
            Vein_Ingot.Nickel_Iridium_Vein,
            Vein_Ingot.Tin_Cassiterite_Vein,
            SmallOre_Ingot.Venus_SmallOre);
        ItemStack[] Fake_T4_Venus_Ingot_Checked = checkItemStack(Fake_T4_Venus_Ingot);
        ItemStack[][] Fake_T4_Venus_Ingot_Split = addSplitAggregateArray(
            Fake_T4_Venus_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T4_Venus_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ve", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T4);
        }
    }

    public static void addFakeVoidIngotRecipes_T5() {
        // T5 - Enceladus - En
        ItemStack[] Fake_T5_Enceladus_Ingot = addCompressAggregateArray(
            Vein_Ingot.Bastnasite_Monazite_Vein,
            Vein_Ingot.Chalcopyrite_Copper_Vein,
            Vein_Ingot.Ledox_Vein,
            Vein_Ingot.Uraninite_Uranium238_Vein,
            Vein_Ingot.Scheelite_Tungstate_Vein,
            Vein_Ingot.Lazurite_Lapis_Vein,
            Vein_Ingot.Nickel_Osmium_Vein,
            Vein_Ingot.Vanadium_Vein,
            Vein_Ingot.Nickel_Iridium_Vein,
            SmallOre_Ingot.Enceladus_SmallOre);
        ItemStack[] Fake_T5_Enceladus_Ingot_Checked = checkItemStack(Fake_T5_Enceladus_Ingot);
        ItemStack[][] Fake_T5_Enceladus_Ingot_Split = addSplitAggregateArray(
            Fake_T5_Enceladus_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T5_Enceladus_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_En", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T5);
        }

        // T5 - Miranda - Mi
        ItemStack[] Fake_T5_Miranda_Ingot = addCompressAggregateArray(
            Vein_Ingot.Redstone_Vein,
            Vein_Ingot.Pyrolusite_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Graphite_Diamond_Vein,
            Vein_Ingot.Nickel_Osmium_Vein,
            Vein_Ingot.Desh_Vein,
            Vein_Ingot.Draconium_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Nickel_Iridium_Vein,
            Vein_Ingot.Tin_Cassiterite_Vein,
            SmallOre_Ingot.Miranda_SmallOre);
        ItemStack[] Fake_T5_Miranda_Ingot_Checked = checkItemStack(Fake_T5_Miranda_Ingot);
        ItemStack[][] Fake_T5_Miranda_Ingot_Split = addSplitAggregateArray(
            Fake_T5_Miranda_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T5_Miranda_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mi", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T5);
        }

        // T5 - Oberon - Ob
        ItemStack[] Fake_T5_Oberon_Ingot = addCompressAggregateArray(
            Vein_Ingot.Tungsten_Vein,
            Vein_Ingot.Grossular_Manganese_Vein,
            Vein_Ingot.Pitchblende_Vein,
            Vein_Ingot.Brown_Limonite_Iron_Vein,
            Vein_Ingot.Galena_Vein,
            Vein_Ingot.Naquadah_Vein,
            Vein_Ingot.Scheelite_Tungstate_Vein,
            Vein_Ingot.Nickel_Osmium_Vein,
            Vein_Ingot.Platinum_Palladium_Vein,
            SmallOre_Ingot.Oberon_SmallOre);
        ItemStack[] Fake_T5_Oberon_Ingot_Checked = checkItemStack(Fake_T5_Oberon_Ingot);
        ItemStack[][] Fake_T5_Oberon_Ingot_Split = addSplitAggregateArray(
            Fake_T5_Oberon_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T5_Oberon_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ob", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T5);
        }

        // T5 - Titan - Ti
        ItemStack[] Fake_T5_Titan_Ingot = addCompressAggregateArray(
            Vein_Ingot.Wulfenite_Molybdenum_Vein,
            Vein_Ingot.Grossular_Manganese_Vein,
            Vein_Ingot.Gold_Infused_Gold_Vein,
            Vein_Ingot.Bastnasite_Monazite_Vein,
            Vein_Ingot.Garnierite_Nickel_Vein,
            Vein_Ingot.Arsenic_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Naquadah_Vein,
            Vein_Ingot.Graphite_Diamond_Vein,
            Vein_Ingot.Nickel_Osmium_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Beryllium_Vein,
            Vein_Ingot.Rutile_Vein,
            Vein_Ingot.Nickel_Iridium_Vein,
            SmallOre_Ingot.Titan_SmallOre);
        ItemStack[] Fake_T5_Titan_Ingot_Checked = checkItemStack(Fake_T5_Titan_Ingot);
        ItemStack[][] Fake_T5_Titan_Ingot_Split = addSplitAggregateArray(
            Fake_T5_Titan_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T5_Titan_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ti", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T5);
        }

        // T5 - Ross128ba - Ra
        ItemStack[] Fake_T5_Ross128ba_Ingot = addCompressAggregateArray(
            Vein_Ingot.BArTiMaEuSNeK_Vein,
            Vein_Ingot.Amethyst_Vein,
            Vein_Ingot.Djurleite_Vein,
            Vein_Ingot.Galena_Vein,
            Vein_Ingot.Fayalite_Vein,
            Vein_Ingot.Ferberite_Vein,
            Vein_Ingot.Tiberium_Vein,
            Vein_Ingot.Olenite_Vein);
        ItemStack[] Fake_T5_Ross128ba_Ingot_Checked = checkItemStack(Fake_T5_Ross128ba_Ingot);
        ItemStack[][] Fake_T5_Ross128ba_Ingot_Split = addSplitAggregateArray(
            Fake_T5_Ross128ba_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T5_Ross128ba_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ra", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T5);
        }
    }

    public static void addFakeVoidIngotRecipes_T6() {
        // T6 - Proteus - Pr
        ItemStack[] Fake_T6_Proteus_Ingot = addCompressAggregateArray(
            Vein_Ingot.Wulfenite_Molybdenum_Vein,
            Vein_Ingot.Tungsten_Vein,
            Vein_Ingot.Quartzite_Quartz_Vein,
            Vein_Ingot.Gold_Infused_Gold_Vein,
            Vein_Ingot.Chalcopyrite_Copper_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Uraninite_Uranium238_Vein,
            Vein_Ingot.Graphite_Diamond_Vein,
            Vein_Ingot.Nickel_Osmium_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Vanadium_Vein,
            Vein_Ingot.Neutronium_Vein,
            SmallOre_Ingot.Proteus_SmallOre);
        ItemStack[] Fake_T6_Proteus_Ingot_Checked = checkItemStack(Fake_T6_Proteus_Ingot);
        ItemStack[][] Fake_T6_Proteus_Ingot_Split = addSplitAggregateArray(
            Fake_T6_Proteus_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T6_Proteus_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Pr", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T6);
        }

        // T6 - Triton - Tr
        ItemStack[] Fake_T6_Triton_Ingot = addCompressAggregateArray(
            Vein_Ingot.Tungsten_Vein,
            Vein_Ingot.Grossular_Manganese_Vein,
            Vein_Ingot.Bastnasite_Monazite_Vein,
            Vein_Ingot.Garnierite_Nickel_Vein,
            Vein_Ingot.Galena_Vein,
            Vein_Ingot.Niobium_Vein,
            Vein_Ingot.Scheelite_Tungstate_Vein,
            Vein_Ingot.Thorium_Vein,
            Vein_Ingot.Neutronium_Vein,
            Vein_Ingot.Magnetite_Gold_Vein,
            Vein_Ingot.Nickel_Iridium_Vein,
            SmallOre_Ingot.Triton_SmallOre);
        ItemStack[] Fake_T6_Triton_Ingot_Checked = checkItemStack(Fake_T6_Triton_Ingot);
        ItemStack[][] Fake_T6_Triton_Ingot_Split = addSplitAggregateArray(
            Fake_T6_Triton_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T6_Triton_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Tr", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T6);
        }
    }

    public static void addFakeVoidIngotRecipes_T7() {
        // T7 - Haumea - Ha
        ItemStack[] Fake_T7_Haumea_Ingot = addCompressAggregateArray(
            Vein_Ingot.Pitchblende_Vein,
            Vein_Ingot.Gold_Infused_Gold_Vein,
            Vein_Ingot.Bastnasite_Monazite_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Garnet_Sand_Nether_Star_Vein,
            Vein_Ingot.Naquadah_Vein,
            Vein_Ingot.Uraninite_Uranium238_Vein,
            Vein_Ingot.Scheelite_Tungstate_Vein,
            Vein_Ingot.Bentonite_Olivine_Vein,
            Vein_Ingot.Thorium_Vein,
            Vein_Ingot.Neutronium_Vein,
            Vein_Ingot.Beryllium_Vein,
            SmallOre_Ingot.Haumea_SmallOre);
        ItemStack[] Fake_T7_Haumea_Ingot_Checked = checkItemStack(Fake_T7_Haumea_Ingot);
        ItemStack[][] Fake_T7_Haumea_Ingot_Split = addSplitAggregateArray(
            Fake_T7_Haumea_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T7_Haumea_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ha", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T7);
        }

        // T7 - Kuiper Belt - KB
        ItemStack[] Fake_T7_Kuiperbelt_Ingot = addCompressAggregateArray(
            Vein_Ingot.Pitchblende_Vein,
            Vein_Ingot.Gold_Infused_Gold_Vein,
            Vein_Ingot.Bastnasite_Monazite_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Garnet_Sand_Nether_Star_Vein,
            Vein_Ingot.Naquadah_Vein,
            Vein_Ingot.Uraninite_Uranium238_Vein,
            Vein_Ingot.Scheelite_Tungstate_Vein,
            Vein_Ingot.Bentonite_Olivine_Vein,
            Vein_Ingot.Thorium_Vein,
            Vein_Ingot.Neutronium_Vein,
            Vein_Ingot.Beryllium_Vein,
            SmallOre_Ingot.Kuiperbelt_SmallOre);
        ItemStack[] Fake_T7_Kuiperbelt_Ingot_Checked = checkItemStack(Fake_T7_Kuiperbelt_Ingot);
        ItemStack[][] Fake_T7_Kuiperbelt_Ingot_Split = addSplitAggregateArray(
            Fake_T7_Kuiperbelt_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T7_Kuiperbelt_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_KB", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T7);
        }

        // T7 - Makemake - MM
        ItemStack[] Fake_T7_Makemake_Ingot = addCompressAggregateArray(
            Vein_Ingot.Pitchblende_Vein,
            Vein_Ingot.Bastnasite_Monazite_Vein,
            Vein_Ingot.Black_Plutonium_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Red_Garnet_Vein,
            Vein_Ingot.Niobium_Vein,
            Vein_Ingot.Magnetite_Vein,
            Vein_Ingot.Uraninite_Uranium238_Vein,
            Vein_Ingot.Scheelite_Tungstate_Vein,
            Vein_Ingot.Bentonite_Olivine_Vein,
            Vein_Ingot.Vanadium_Vein,
            Vein_Ingot.Neutronium_Vein,
            Vein_Ingot.Beryllium_Vein,
            SmallOre_Ingot.Makemake_SmallOre);
        ItemStack[] Fake_T7_Makemake_Ingot_Checked = checkItemStack(Fake_T7_Makemake_Ingot);
        ItemStack[][] Fake_T7_Makemake_Ingot_Split = addSplitAggregateArray(
            Fake_T7_Makemake_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T7_Makemake_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_MM", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T7);
        }

        // T7 - Pluto - Pl
        ItemStack[] Fake_T7_Pluto_Ingot = addCompressAggregateArray(
            Vein_Ingot.Wulfenite_Molybdenum_Vein,
            Vein_Ingot.Tungsten_Vein,
            Vein_Ingot.Black_Plutonium_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Brown_Limonite_Iron_Vein,
            Vein_Ingot.Naquadah_Vein,
            Vein_Ingot.Scheelite_Tungstate_Vein,
            Vein_Ingot.Graphite_Diamond_Vein,
            Vein_Ingot.Nickel_Osmium_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Platinum_Palladium_Vein,
            Vein_Ingot.Thorium_Vein,
            Vein_Ingot.Neutronium_Vein,
            Vein_Ingot.Magnetite_Gold_Vein,
            Vein_Ingot.Beryllium_Vein,
            SmallOre_Ingot.Pluto_SmallOre);
        ItemStack[] Fake_T7_Pluto_Ingot_Checked = checkItemStack(Fake_T7_Pluto_Ingot);
        ItemStack[][] Fake_T7_Pluto_Ingot_Split = addSplitAggregateArray(
            Fake_T7_Pluto_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T7_Pluto_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Pl", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T7);
        }
    }

    public static void addFakeVoidIngotRecipes_T8() {
        // T8 - BarnardC - BC
        ItemStack[] Fake_T8_BarnardC_Ingot = addCompressAggregateArray(
            Vein_Ingot.Tungsten_Vein,
            Vein_Ingot.Kyanite_Mica_Vein,
            Vein_Ingot.Black_Plutonium_Vein,
            Vein_Ingot.Arsenic_Vein,
            Vein_Ingot.Basaltic_Mineral_Sand_Vein,
            Vein_Ingot.Rock_Salt_Salt_Vein,
            Vein_Ingot.Nickel_Osmium_Vein,
            Vein_Ingot.Samarium_Vein,
            Vein_Ingot.Lignite_Coal_Vein);
        ItemStack[] Fake_T8_BarnardC_Ingot_Checked = checkItemStack(Fake_T8_BarnardC_Ingot);
        ItemStack[][] Fake_T8_BarnardC_Ingot_Split = addSplitAggregateArray(
            Fake_T8_BarnardC_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_BarnardC_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BC", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T8);
        }

        // T8 - BarnardE - BE
        ItemStack[] Fake_T8_BarnardE_Ingot = addCompressAggregateArray(
            Vein_Ingot.Wulfenite_Molybdenum_Vein,
            Vein_Ingot.Tungsten_Vein,
            Vein_Ingot.Grossular_Manganese_Vein,
            Vein_Ingot.Gold_Infused_Gold_Vein,
            Vein_Ingot.Chalcopyrite_Copper_Vein,
            Vein_Ingot.Garnet_Sand_Nether_Star_Vein,
            Vein_Ingot.Naquadah_Vein,
            Vein_Ingot.Magnetite_Vein,
            Vein_Ingot.Uraninite_Uranium238_Vein,
            Vein_Ingot.Bentonite_Olivine_Vein,
            Vein_Ingot.Cadmium_Rare_Earth_Vein,
            Vein_Ingot.Thorium_Vein,
            Vein_Ingot.Neutronium_Vein,
            SmallOre_Ingot.BarnardE_SmallOre);
        ItemStack[] Fake_T8_BarnardE_Ingot_Checked = checkItemStack(Fake_T8_BarnardE_Ingot);
        ItemStack[][] Fake_T8_BarnardE_Ingot_Split = addSplitAggregateArray(
            Fake_T8_BarnardE_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_BarnardE_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BE", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T8);
        }

        // T8 - BarnardF - BF
        ItemStack[] Fake_T8_BarnardF_Ingot = addCompressAggregateArray(
            Vein_Ingot.Tungsten_Vein,
            Vein_Ingot.Grossular_Manganese_Vein,
            Vein_Ingot.Pitchblende_Vein,
            Vein_Ingot.Redstone_Vein,
            Vein_Ingot.Bastnasite_Monazite_Vein,
            Vein_Ingot.Chalcopyrite_Copper_Vein,
            Vein_Ingot.Red_Garnet_Vein,
            Vein_Ingot.Naquadah_Vein,
            Vein_Ingot.Niobium_Vein,
            Vein_Ingot.Graphite_Diamond_Vein,
            Vein_Ingot.Cadmium_Rare_Earth_Vein,
            Vein_Ingot.Thorium_Vein,
            Vein_Ingot.Vanadium_Vein,
            Vein_Ingot.Neutronium_Vein,
            Vein_Ingot.Magnetite_Gold_Vein,
            Vein_Ingot.Beryllium_Vein,
            SmallOre_Ingot.BarnardF_SmallOre);
        ItemStack[] Fake_T8_BarnardF_Ingot_Checked = checkItemStack(Fake_T8_BarnardF_Ingot);
        ItemStack[][] Fake_T8_BarnardF_Ingot_Split = addSplitAggregateArray(
            Fake_T8_BarnardF_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_BarnardF_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BF", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T8);
        }

        // T8 - α Centauri Bb - CB
        ItemStack[] Fake_T8_Centauri_Ingot = addCompressAggregateArray(
            Vein_Ingot.Grossular_Manganese_Vein,
            Vein_Ingot.Pitchblende_Vein,
            Vein_Ingot.Quartzite_Quartz_Vein,
            Vein_Ingot.Redstone_Vein,
            Vein_Ingot.Black_Plutonium_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Cassiterite_Tin_Vein,
            Vein_Ingot.Sulfur_Vein,
            Vein_Ingot.Samarium_Vein,
            Vein_Ingot.Cadmium_Rare_Earth_Vein,
            Vein_Ingot.Beryllium_Vein,
            Vein_Ingot.Saltpeter_Electrotine_Vein,
            Vein_Ingot.Nether_Quartz_Vein);
        ItemStack[] Fake_T8_Centauri_Ingot_Checked = checkItemStack(Fake_T8_Centauri_Ingot);
        ItemStack[][] Fake_T8_Centauri_Ingot_Split = addSplitAggregateArray(
            Fake_T8_Centauri_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_Centauri_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_CB", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T8);
        }

        // T8 - TCetiE - TE
        ItemStack[] Fake_T8_TCetiE_Ingot = addCompressAggregateArray(
            Vein_Ingot.Magnesite_Vein,
            Vein_Ingot.Quartzite_Quartz_Vein,
            Vein_Ingot.Black_Plutonium_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Garnet_Sand_Nether_Star_Vein,
            Vein_Ingot.Apatite_Vein,
            Vein_Ingot.Magnetite_Vein,
            Vein_Ingot.Rock_Salt_Salt_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Magnetite_Gold_Vein,
            Vein_Ingot.Kaolinite_Vein,
            Vein_Ingot.Chrome_Vein,
            Vein_Ingot.Tin_Cassiterite_Vein,
            SmallOre_Ingot.TCetiE_SmallOre);
        ItemStack[] Fake_T8_TCetiE_Ingot_Checked = checkItemStack(Fake_T8_TCetiE_Ingot);
        ItemStack[][] Fake_T8_TCetiE_Ingot_Split = addSplitAggregateArray(
            Fake_T8_TCetiE_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_TCetiE_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_TE", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T8);
        }

        // T8 - VegaB - VB
        ItemStack[] Fake_T8_VegaB_Ingot = addCompressAggregateArray(
            Vein_Ingot.Pitchblende_Vein,
            Vein_Ingot.Redstone_Vein,
            Vein_Ingot.Gold_Infused_Gold_Vein,
            Vein_Ingot.Arsenic_Vein,
            Vein_Ingot.Garnet_Sand_Nether_Star_Vein,
            Vein_Ingot.Red_Garnet_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Galena_Vein,
            Vein_Ingot.Naquadah_Vein,
            Vein_Ingot.Niobium_Vein,
            Vein_Ingot.Scheelite_Tungstate_Vein,
            Vein_Ingot.Lazurite_Lapis_Vein,
            Vein_Ingot.Cadmium_Rare_Earth_Vein,
            Vein_Ingot.Thorium_Vein,
            Vein_Ingot.Vanadium_Vein,
            Vein_Ingot.Neutronium_Vein,
            Vein_Ingot.Magnetite_Gold_Vein,
            SmallOre_Ingot.VegaB_SmallOre);
        ItemStack[] Fake_T8_VegaB_Ingot_Checked = checkItemStack(Fake_T8_VegaB_Ingot);
        ItemStack[][] Fake_T8_VegaB_Ingot_Split = addSplitAggregateArray(
            Fake_T8_VegaB_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_VegaB_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_VB", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T8);
        }
    }

    public static void addFakeVoidIngotRecipes_T9() {
        // T9 - Anubis - An
        ItemStack[] Fake_T9_Anubis_Ingot = addCompressAggregateArray(
            Vein_Ingot.Neutronium_Infinity_Catalyst_Vein,
            Vein_Ingot.Kyanite_Mica_Vein,
            Vein_Ingot.Basaltic_Mineral_Sand_Vein,
            Vein_Ingot.Sulfur_Vein,
            Vein_Ingot.Bentonite_Olivine_Vein,
            Vein_Ingot.Desh_Vein,
            Vein_Ingot.Galena_Cryolite_Vein,
            Vein_Ingot.Dolomite_Vein,
            Vein_Ingot.Callisto_Ice_Vein,
            Vein_Ingot.Soapstone_Vein,
            Vein_Ingot.Mytryl_Vein,
            Vein_Ingot.Rutile_Vein,
            SmallOre_Ingot.Anubis_SmallOre);
        ItemStack[] Fake_T9_Anubis_Ingot_Checked = checkItemStack(Fake_T9_Anubis_Ingot);
        ItemStack[][] Fake_T9_Anubis_Ingot_Split = addSplitAggregateArray(
            Fake_T9_Anubis_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_Anubis_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_An", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T9);
        }

        // T9 - Horus - Ho
        ItemStack[] Fake_T9_Horus_Ingot = addCompressAggregateArray(
            Vein_Ingot.Magnesite_Vein,
            Vein_Ingot.Quartzite_Quartz_Vein,
            Vein_Ingot.Black_Plutonium_Vein,
            Vein_Ingot.Neutronium_Cosmic_Neutronium_Vein,
            Vein_Ingot.Garnet_Sand_Nether_Star_Vein,
            Vein_Ingot.Red_Garnet_Vein,
            Vein_Ingot.Oriharukon_Vein,
            Vein_Ingot.Ledox_Vein,
            Vein_Ingot.Certus_Quartz_Vein,
            Vein_Ingot.Draconium_Vein,
            Vein_Ingot.Almandine_Sapphire_Vein,
            Vein_Ingot.Mytryl_Vein,
            Vein_Ingot.Quantium_Vein,
            SmallOre_Ingot.Horus_SmallOre);
        ItemStack[] Fake_T9_Horus_Ingot_Checked = checkItemStack(Fake_T9_Horus_Ingot);
        ItemStack[][] Fake_T9_Horus_Ingot_Split = addSplitAggregateArray(
            Fake_T9_Horus_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_Horus_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ho", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T9);
        }

        // T9 - Maahes - Mh
        ItemStack[] Fake_T9_Maahes_Ingot = addCompressAggregateArray(
            Vein_Ingot.Naquadah_Vein,
            Vein_Ingot.Basaltic_Mineral_Sand_Vein,
            Vein_Ingot.Naquadah_Naquadria_Vein,
            Vein_Ingot.Galena_Cryolite_Vein,
            Vein_Ingot.Callisto_Ice_Vein,
            Vein_Ingot.Vanadium_Vein,
            Vein_Ingot.Soapstone_Vein,
            Vein_Ingot.Neutronium_Vein,
            Vein_Ingot.Sheldonite_Platinum_Vein,
            Vein_Ingot.Quantium_Vein,
            Vein_Ingot.Chrome_Vein);
        ItemStack[] Fake_T9_Maahes_Ingot_Checked = checkItemStack(Fake_T9_Maahes_Ingot);
        ItemStack[][] Fake_T9_Maahes_Ingot_Split = addSplitAggregateArray(
            Fake_T9_Maahes_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_Maahes_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mh", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T9);
        }

        // T9 - MehenBelt - MB
        ItemStack[] Fake_T9_MehenBelt_Ingot = addCompressAggregateArray(
            Vein_Ingot.Draconium_Awakened_Draconium_Vein,
            Vein_Ingot.Garnierite_Nickel_Vein,
            Vein_Ingot.Uraninite_Uranium238_Vein,
            Vein_Ingot.Lazurite_Lapis_Vein,
            Vein_Ingot.Bentonite_Olivine_Vein,
            Vein_Ingot.Nickel_Osmium_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Platinum_Palladium_Vein,
            Vein_Ingot.Neutronium_Vein,
            Vein_Ingot.Sheldonite_Platinum_Vein,
            Vein_Ingot.Nickel_Iridium_Vein,
            Vein_Ingot.Tin_Cassiterite_Vein,
            SmallOre_Ingot.MehenBelt_SmallOre);
        ItemStack[] Fake_T9_MehenBelt_Ingot_Checked = checkItemStack(Fake_T9_MehenBelt_Ingot);
        ItemStack[][] Fake_T9_MehenBelt_Ingot_Split = addSplitAggregateArray(
            Fake_T9_MehenBelt_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_MehenBelt_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_MB", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T9);
        }

        // T9 - Neper - Np
        ItemStack[] Fake_T9_Neper_Ingot = addCompressAggregateArray(
            Vein_Ingot.Tungsten_Vein,
            Vein_Ingot.Dilithium_Vein,
            Vein_Ingot.Kyanite_Mica_Vein,
            Vein_Ingot.Arsenic_Vein,
            Vein_Ingot.Terra_Aer_Vein,
            Vein_Ingot.Certus_Quartz_Vein,
            Vein_Ingot.Quartzite_Vein,
            Vein_Ingot.Dolomite_Vein,
            Vein_Ingot.Perditio_Ordo_Vein,
            Vein_Ingot.Kaolinite_Vein,
            Vein_Ingot.Aqua_Ignis_Amber_Vein,
            Vein_Ingot.Nether_Quartz_Vein);
        ItemStack[] Fake_T9_Neper_Ingot_Checked = checkItemStack(Fake_T9_Neper_Ingot);
        ItemStack[][] Fake_T9_Neper_Ingot_Split = addSplitAggregateArray(
            Fake_T9_Neper_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_Neper_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Np", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T9);
        }

        // T9 - Seth - Se
        ItemStack[] Fake_T9_Seth_Ingot = addCompressAggregateArray(
            Vein_Ingot.Bastnasite_Monazite_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Raw_Tengam_Vein,
            Vein_Ingot.Magnetite_Vein,
            Vein_Ingot.Nickel_Osmium_Vein,
            Vein_Ingot.Samarium_Vein,
            Vein_Ingot.Draconium_Vein,
            Vein_Ingot.Platinum_Palladium_Vein,
            Vein_Ingot.Magnetite_Gold_Vein,
            Vein_Ingot.Nickel_Iridium_Vein,
            Vein_Ingot.Tin_Cassiterite_Vein,
            SmallOre_Ingot.Seth_SmallOre);
        ItemStack[] Fake_T9_Seth_Ingot_Checked = checkItemStack(Fake_T9_Seth_Ingot);
        ItemStack[][] Fake_T9_Seth_Ingot_Split = addSplitAggregateArray(
            Fake_T9_Seth_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_Seth_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Se", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T9);
        }
    }

    public static void addFakeVoidIngotRecipes_T10() {
        // T10 - DeepDark - DD
        ItemStack[] resources = SingularityIngotRecipes.VoidIngotRecipes_T10.get("DD");
        if (resources == null) {
            throw new IllegalStateException("Build the T10 ingot catalog before registering its NEI recipes");
        }
        ItemStack[] Fake_T10_Ingot_Checked = RegisteredResourceCatalog.copyItems(resources);
        ItemStack[][] Fake_T10_DeepDark_Ingot_Split = addSplitAggregateArray(
            Fake_T10_Ingot_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T10_DeepDark_Ingot_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ingot Mode")
                .eut(0)
                .addTo(addFakeVoidIngotRecipes_T10);
        }
    }
}
