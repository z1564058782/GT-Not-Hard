package Recipes.SingularityRecipes_VoidDust;

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

public class FakeSingularityDustRecipes {

    public static int NEI_ItemOutput_Size = util.RecipesFrontend.ResourceCatalogFrontend.OUTPUTS_PER_PAGE;

    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes = RecipeMapBuilder
        .of("Singularity of Void Dust")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(util.RecipesFrontend.ResourceCatalogFrontend.HANDLER_HEIGHT))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T0 = addFakeVoidDustRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T1 = addFakeVoidDustRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T2 = addFakeVoidDustRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T3 = addFakeVoidDustRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T4 = addFakeVoidDustRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T5 = addFakeVoidDustRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T6 = addFakeVoidDustRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T7 = addFakeVoidDustRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T8 = addFakeVoidDustRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T9 = addFakeVoidDustRecipes;
    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T10 = addFakeVoidDustRecipes;

    public static void addFakeVoidDustRecipes_T0() {
        // T0 - Overworld - Ow
        ItemStack[] Fake_T0_Overworld_Dust = addCompressAggregateArray(
            Vein_Dust.Chalcopyrite_Vermiculite_Vein,
            Vein_Dust.Grossular_Manganese_Vein,
            Vein_Dust.Redstone_Vein,
            Vein_Dust.Kyanite_Mica_Vein,
            Vein_Dust.Chalcopyrite_Copper_Vein,
            Vein_Dust.Brown_Limonite_Iron_Vein,
            Vein_Dust.Apatite_Vein,
            Vein_Dust.Basaltic_Mineral_Sand_Vein,
            Vein_Dust.Magnetite_Vein,
            Vein_Dust.Cassiterite_Tin_Vein,
            Vein_Dust.Rock_Salt_Salt_Vein,
            Vein_Dust.Graphite_Diamond_Vein,
            Vein_Dust.Lazurite_Lapis_Vein,
            Vein_Dust.Coal_Vein,
            Vein_Dust.Dolomite_Vein,
            Vein_Dust.Soapstone_Vein,
            Vein_Dust.Magnetite_Gold_Vein,
            Vein_Dust.Kaolinite_Vein,
            Vein_Dust.Lignite_Coal_Vein,
            Vein_Dust.Tin_Cassiterite_Vein,
            SmallOre_Dust.Overworld_SmallOre);
        ItemStack[] Fake_T0_Overworld_Dust_Checked = checkItemStack(Fake_T0_Overworld_Dust);
        ItemStack[][] Fake_T0_Overworld_Dust_Split = addSplitAggregateArray(
            Fake_T0_Overworld_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T0_Overworld_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ow", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T0);
        }

        // T0 - Nether - Ne
        ItemStack[] Fake_T0_Nether_Dust = addCompressAggregateArray(
            Vein_Dust.Wulfenite_Molybdenum_Vein,
            Vein_Dust.Grossular_Manganese_Vein,
            Vein_Dust.Redstone_Vein,
            Vein_Dust.Chalcopyrite_Copper_Vein,
            Vein_Dust.Brown_Limonite_Iron_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Sulfur_Vein,
            Vein_Dust.Quartzite_Vein,
            Vein_Dust.Beryllium_Vein,
            Vein_Dust.Saltpeter_Electrotine_Vein,
            Vein_Dust.Nether_Quartz_Vein,
            SmallOre_Dust.Nether_SmallOre);
        ItemStack[] Fake_T0_Nether_Dust_Checked = checkItemStack(Fake_T0_Nether_Dust);
        ItemStack[][] Fake_T0_Nether_Dust_Split = addSplitAggregateArray(
            Fake_T0_Nether_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T0_Nether_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ne", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T0);
        }

        // T0 - Twilight - TF
        ItemStack[] Fake_T0_Twilight_Dust = addCompressAggregateArray(
            Vein_Dust.Wulfenite_Molybdenum_Vein,
            Vein_Dust.Garnierite_Nickel_Vein,
            Vein_Dust.Brown_Limonite_Iron_Vein,
            Vein_Dust.Apatite_Vein,
            Vein_Dust.Magnetite_Vein,
            Vein_Dust.Rock_Salt_Salt_Vein,
            Vein_Dust.Graphite_Diamond_Vein,
            Vein_Dust.Lazurite_Lapis_Vein,
            Vein_Dust.Bentonite_Olivine_Vein,
            Vein_Dust.Terra_Aer_Vein,
            Vein_Dust.Coal_Vein,
            Vein_Dust.Almandine_Sapphire_Vein,
            Vein_Dust.Galena_Cryolite_Vein,
            Vein_Dust.Soapstone_Vein,
            Vein_Dust.Perditio_Ordo_Vein,
            Vein_Dust.Magnetite_Gold_Vein,
            Vein_Dust.Tin_Cassiterite_Vein,
            Vein_Dust.Aqua_Ignis_Amber_Vein,
            SmallOre_Dust.Twilight_SmallOre);
        ItemStack[] Fake_T0_Twilight_Dust_Checked = checkItemStack(Fake_T0_Twilight_Dust);
        ItemStack[][] Fake_T0_Twilight_Dust_Split = addSplitAggregateArray(
            Fake_T0_Twilight_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T0_Twilight_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_TF", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T0);
        }

        // T0 - TheEnd - ED
        ItemStack[] Fake_T0_TheEnd_Dust = addCompressAggregateArray(
            Vein_Dust.Wulfenite_Molybdenum_Vein,
            Vein_Dust.Garnierite_Nickel_Vein,
            Vein_Dust.Chalcopyrite_Copper_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Magnetite_Gold_Vein,
            Vein_Dust.Beryllium_Vein,
            Vein_Dust.Tin_Cassiterite_Vein,
            SmallOre_Dust.TheEnd_SmallOre);
        ItemStack[] Fake_T0_TheEnd_Dust_Checked = checkItemStack(Fake_T0_TheEnd_Dust);
        ItemStack[][] Fake_T0_TheEnd_Dust_Split = addSplitAggregateArray(
            Fake_T0_TheEnd_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T0_TheEnd_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_ED", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T0);
        }

        // T0 - EndAsteroid - EA
        ItemStack[] Fake_T0_EndAsteroid_Dust = addCompressAggregateArray(
            Vein_Dust.Wulfenite_Molybdenum_Vein,
            Vein_Dust.Grossular_Manganese_Vein,
            Vein_Dust.Garnierite_Nickel_Vein,
            Vein_Dust.Chalcopyrite_Copper_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Naquadah_Vein,
            Vein_Dust.Scheelite_Tungstate_Vein,
            Vein_Dust.Lazurite_Lapis_Vein,
            Vein_Dust.Bentonite_Olivine_Vein,
            Vein_Dust.Magnetite_Gold_Vein,
            Vein_Dust.Beryllium_Vein,
            Vein_Dust.Sheldonite_Platinum_Vein,
            Vein_Dust.Tin_Cassiterite_Vein,
            SmallOre_Dust.EndAsteroid_SmallOre);
        ItemStack[] Fake_T0_EndAsteroid_Dust_Checked = checkItemStack(Fake_T0_EndAsteroid_Dust);
        ItemStack[][] Fake_T0_EndAsteroid_Dust_Split = addSplitAggregateArray(
            Fake_T0_EndAsteroid_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T0_EndAsteroid_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_EA", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T0);
        }

        // T0 - TheToxicEverglades - Eg
        ItemStack[] Fake_T0_TheToxicEverglades_Dust = addCompressAggregateArray(
            Vein_Dust.Agardite_Nd_Vein,
            Vein_Dust.Agardite_Cd_Vein,
            Vein_Dust.Iron_Vein,
            Vein_Dust.Xenotime_Vein,
            Vein_Dust.Hibonite_Vein,
            Vein_Dust.Geikielite_Vein,
            Vein_Dust.Cerite_Vein,
            Vein_Dust.Lanthanite_Ce_Vein,
            Vein_Dust.Titanite_Vein,
            Vein_Dust.Honeaite_Vein,
            Vein_Dust.Demicheleite_Br_Vein,
            Vein_Dust.Fluorcaphite_Vein,
            Vein_Dust.Cryolite_F_Vein,
            Vein_Dust.Fluorite_F_Vein,
            Vein_Dust.Gadolinite_Ce_Vein,
            Vein_Dust.Runite_Vein,
            Vein_Dust.Yttrocerite_Vein,
            Vein_Dust.Florencite_Vein);
        ItemStack[] Fake_T0_TheToxicEverglades_Dust_Checked = checkItemStack(Fake_T0_TheToxicEverglades_Dust);
        ItemStack[][] Fake_T0_TheToxicEverglades_Dust_Split = addSplitAggregateArray(
            Fake_T0_TheToxicEverglades_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T0_TheToxicEverglades_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Eg", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T0);
        }
    }

    public static void addFakeVoidDustRecipes_T1() {
        // T1 - Moon - Mo
        ItemStack[] Fake_T1_Moon_Dust = addCompressAggregateArray(
            Vein_Dust.Wulfenite_Molybdenum_Vein,
            Vein_Dust.Quartzite_Quartz_Vein,
            Vein_Dust.Bastnasite_Monazite_Vein,
            Vein_Dust.Chalcopyrite_Copper_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Galena_Vein,
            Vein_Dust.Ilmenite_Vein,
            Vein_Dust.Tin_Cassiterite_Vein,
            SmallOre_Dust.Moon_SmallOre);
        ItemStack[] Fake_T1_Moon_Dust_Checked = checkItemStack(Fake_T1_Moon_Dust);
        ItemStack[][] Fake_T1_Moon_Dust_Split = addSplitAggregateArray(Fake_T1_Moon_Dust_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T1_Moon_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mo", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T1);
        }
    }

    public static void addFakeVoidDustRecipes_T2() {
        // T2 - Deimos - De
        ItemStack[] Fake_T2_Deimos_Dust = addCompressAggregateArray(
            Vein_Dust.Bastnasite_Monazite_Vein,
            Vein_Dust.Garnierite_Nickel_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Oriharukon_Vein,
            Vein_Dust.Magnetite_Vein,
            Vein_Dust.Uraninite_Uranium238_Vein,
            Vein_Dust.Scheelite_Tungstate_Vein,
            Vein_Dust.Sulfur_Vein,
            Vein_Dust.Lazurite_Lapis_Vein,
            Vein_Dust.Draconium_Vein,
            SmallOre_Dust.Deimos_SmallOre);
        ItemStack[] Fake_T2_Deimos_Dust_Checked = checkItemStack(Fake_T2_Deimos_Dust);
        ItemStack[][] Fake_T2_Deimos_Dust_Split = addSplitAggregateArray(
            Fake_T2_Deimos_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T2_Deimos_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_De", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T2);
        }

        // T2 - Mars - Ma
        ItemStack[] Fake_T2_Mars_Dust = addCompressAggregateArray(
            Vein_Dust.Pitchblende_Vein,
            Vein_Dust.Quartzite_Quartz_Vein,
            Vein_Dust.Redstone_Vein,
            Vein_Dust.Garnierite_Nickel_Vein,
            Vein_Dust.Arsenic_Vein,
            Vein_Dust.Brown_Limonite_Iron_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Galena_Vein,
            Vein_Dust.Rock_Salt_Salt_Vein,
            Vein_Dust.Scheelite_Tungstate_Vein,
            Vein_Dust.Sulfur_Vein,
            Vein_Dust.Desh_Vein,
            Vein_Dust.Magnetite_Gold_Vein,
            SmallOre_Dust.Mars_SmallOre);
        ItemStack[] Fake_T2_Mars_Dust_Checked = checkItemStack(Fake_T2_Mars_Dust);
        ItemStack[][] Fake_T2_Mars_Dust_Split = addSplitAggregateArray(Fake_T2_Mars_Dust_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T2_Mars_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ma", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T2);
        }

        // T2 - Phobos - Ph
        ItemStack[] Fake_T2_Phobos_Dust = addCompressAggregateArray(
            Vein_Dust.Wulfenite_Molybdenum_Vein,
            Vein_Dust.Pitchblende_Vein,
            Vein_Dust.Quartzite_Quartz_Vein,
            Vein_Dust.Garnierite_Nickel_Vein,
            Vein_Dust.Arsenic_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Oriharukon_Vein,
            Vein_Dust.Uraninite_Uranium238_Vein,
            Vein_Dust.Sulfur_Vein,
            Vein_Dust.Graphite_Diamond_Vein,
            Vein_Dust.Draconium_Vein,
            Vein_Dust.Magnetite_Gold_Vein,
            SmallOre_Dust.Phobos_SmallOre);
        ItemStack[] Fake_T2_Phobos_Dust_Checked = checkItemStack(Fake_T2_Phobos_Dust);
        ItemStack[][] Fake_T2_Phobos_Dust_Split = addSplitAggregateArray(
            Fake_T2_Phobos_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T2_Phobos_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ph", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T2);
        }
    }

    public static void addFakeVoidDustRecipes_T3() {
        // T3 - Asteroids - As
        ItemStack[] Fake_T3_Asteroids_Dust = addCompressAggregateArray(
            Vein_Dust.Carbon_Dioxide_Vein,
            Vein_Dust.Sulfur_Dioxide_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Naquadah_Vein,
            Vein_Dust.Methane_Vein,
            Vein_Dust.Scheelite_Tungstate_Vein,
            Vein_Dust.Ilmenite_Vein,
            Vein_Dust.Platinum_Palladium_Vein,
            Vein_Dust.Magnetite_Gold_Vein,
            Vein_Dust.Sheldonite_Platinum_Vein,
            SmallOre_Dust.Asteroids_SmallOre);
        ItemStack[] Fake_T3_Asteroids_Dust_Checked = checkItemStack(Fake_T3_Asteroids_Dust);
        ItemStack[][] Fake_T3_Asteroids_Dust_Split = addSplitAggregateArray(
            Fake_T3_Asteroids_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Asteroids_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_As", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T3);
        }

        // T3 - Callisto - Ca
        ItemStack[] Fake_T3_Callisto_Dust = addCompressAggregateArray(
            Vein_Dust.Uranium238_Plutonium239_Vein,
            Vein_Dust.Bastnasite_Monazite_Vein,
            Vein_Dust.Chalcopyrite_Copper_Vein,
            Vein_Dust.Brown_Limonite_Iron_Vein,
            Vein_Dust.Scheelite_Tungstate_Vein,
            Vein_Dust.Ilmenite_Vein,
            Vein_Dust.Platinum_Palladium_Vein,
            Vein_Dust.Callisto_Ice_Vein,
            Vein_Dust.Magnetite_Gold_Vein,
            SmallOre_Dust.Callisto_SmallOre);
        ItemStack[] Fake_T3_Callisto_Dust_Checked = checkItemStack(Fake_T3_Callisto_Dust);
        ItemStack[][] Fake_T3_Callisto_Dust_Split = addSplitAggregateArray(
            Fake_T3_Callisto_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Callisto_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ca", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T3);
        }

        // T3 - Ceres - Ce
        ItemStack[] Fake_T3_Ceres_Dust = addCompressAggregateArray(
            Vein_Dust.Uranium238_Plutonium239_Vein,
            Vein_Dust.Wulfenite_Molybdenum_Vein,
            Vein_Dust.Grossular_Manganese_Vein,
            Vein_Dust.Chalcopyrite_Copper_Vein,
            Vein_Dust.Brown_Limonite_Iron_Vein,
            Vein_Dust.Magnetite_Vein,
            Vein_Dust.Uraninite_Uranium238_Vein,
            Vein_Dust.Lazurite_Lapis_Vein,
            Vein_Dust.Bentonite_Olivine_Vein,
            Vein_Dust.Platinum_Palladium_Vein,
            Vein_Dust.Soapstone_Vein,
            Vein_Dust.Beryllium_Vein,
            Vein_Dust.Saltpeter_Electrotine_Vein,
            SmallOre_Dust.Ceres_SmallOre);
        ItemStack[] Fake_T3_Ceres_Dust_Checked = checkItemStack(Fake_T3_Ceres_Dust);
        ItemStack[][] Fake_T3_Ceres_Dust_Split = addSplitAggregateArray(
            Fake_T3_Ceres_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Ceres_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ce", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T3);
        }

        // T3 - Europa - Eu
        ItemStack[] Fake_T3_Europa_Dust = addCompressAggregateArray(
            Vein_Dust.Magnesite_Vein,
            Vein_Dust.Basaltic_Mineral_Sand_Vein,
            Vein_Dust.Chrome_Vein,
            Vein_Dust.Ledox_Vein,
            Vein_Dust.Cassiterite_Tin_Vein);
        ItemStack[] Fake_T3_Europa_Dust_Checked = checkItemStack(Fake_T3_Europa_Dust);
        ItemStack[][] Fake_T3_Europa_Dust_Split = addSplitAggregateArray(
            Fake_T3_Europa_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Europa_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Eu", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T3);
        }

        // T3 - Ganymede - Ga
        ItemStack[] Fake_T3_Ganymede_Dust = addCompressAggregateArray(
            Vein_Dust.Uranium238_Plutonium239_Vein,
            Vein_Dust.Redstone_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Brown_Limonite_Iron_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Galena_Vein,
            Vein_Dust.Uraninite_Uranium238_Vein,
            Vein_Dust.Scheelite_Tungstate_Vein,
            Vein_Dust.Graphite_Diamond_Vein,
            Vein_Dust.Ilmenite_Vein,
            Vein_Dust.Platinum_Palladium_Vein,
            SmallOre_Dust.Ganymede_SmallOre);
        ItemStack[] Fake_T3_Ganymede_Dust_Checked = checkItemStack(Fake_T3_Ganymede_Dust);
        ItemStack[][] Fake_T3_Ganymede_Dust_Split = addSplitAggregateArray(
            Fake_T3_Ganymede_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Ganymede_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ga", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T3);
        }

        // T3 - Ross128b - Rb
        ItemStack[] Fake_T3_Ross128b_Dust = addCompressAggregateArray(
            Vein_Dust.Arsenopyrite_Vein,
            Vein_Dust.Hedenbergite_Vein,
            Vein_Dust.Olenite_Vein,
            Vein_Dust.Forsterite_Vein,
            Vein_Dust.Djurleite_Vein,
            Vein_Dust.Thorianite_Vein,
            Vein_Dust.Graphite_Vein,
            Vein_Dust.Fayalite_Vein,
            Vein_Dust.Ferberite_Vein,
            Vein_Dust.Bismutite_Vein);
        ItemStack[] Fake_T3_Ross128b_Dust_Checked = checkItemStack(Fake_T3_Ross128b_Dust);
        ItemStack[][] Fake_T3_Ross128b_Dust_Split = addSplitAggregateArray(
            Fake_T3_Ross128b_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Ross128b_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Rb", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T3);
        }
    }

    public static void addFakeVoidDustRecipes_T4() {
        // T4 - Io - Io
        ItemStack[] Fake_T4_Io_Dust = addCompressAggregateArray(
            Vein_Dust.Uranium238_Plutonium239_Vein,
            Vein_Dust.Grossular_Manganese_Vein,
            Vein_Dust.Pitchblende_Vein,
            Vein_Dust.Quartzite_Quartz_Vein,
            Vein_Dust.Pyrolusite_Vein,
            Vein_Dust.Gold_Infused_Gold_Vein,
            Vein_Dust.Bastnasite_Monazite_Vein,
            Vein_Dust.Magnetite_Vein,
            Vein_Dust.Sulfur_Vein,
            Vein_Dust.Platinum_Palladium_Vein,
            Vein_Dust.Mytryl_Vein,
            Vein_Dust.Nickel_Iridium_Vein,
            Vein_Dust.Tin_Cassiterite_Vein,
            SmallOre_Dust.Io_SmallOre);
        ItemStack[] Fake_T4_Io_Dust_Checked = checkItemStack(Fake_T4_Io_Dust);
        ItemStack[][] Fake_T4_Io_Dust_Split = addSplitAggregateArray(Fake_T4_Io_Dust_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T4_Io_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Io", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T4);
        }

        // T4 - Mercury - Me
        ItemStack[] Fake_T4_Mercury_Dust = addCompressAggregateArray(
            Vein_Dust.Wulfenite_Molybdenum_Vein,
            Vein_Dust.Redstone_Vein,
            Vein_Dust.Arsenic_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Brown_Limonite_Iron_Vein,
            Vein_Dust.Naquadah_Vein,
            Vein_Dust.Graphite_Diamond_Vein,
            Vein_Dust.Draconium_Vein,
            Vein_Dust.Ilmenite_Vein,
            Vein_Dust.Platinum_Palladium_Vein,
            Vein_Dust.Nickel_Iridium_Vein,
            SmallOre_Dust.Mercury_SmallOre);
        ItemStack[] Fake_T4_Mercury_Dust_Checked = checkItemStack(Fake_T4_Mercury_Dust);
        ItemStack[][] Fake_T4_Mercury_Dust_Split = addSplitAggregateArray(
            Fake_T4_Mercury_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T4_Mercury_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Me", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T4);
        }

        // T4 - Venus - Ve
        ItemStack[] Fake_T4_Venus_Dust = addCompressAggregateArray(
            Vein_Dust.Pitchblende_Vein,
            Vein_Dust.Quartzite_Quartz_Vein,
            Vein_Dust.Redstone_Vein,
            Vein_Dust.Bastnasite_Monazite_Vein,
            Vein_Dust.Garnierite_Nickel_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Galena_Vein,
            Vein_Dust.Naquadah_Vein,
            Vein_Dust.Sulfur_Vein,
            Vein_Dust.Beryllium_Vein,
            Vein_Dust.Rutile_Vein,
            Vein_Dust.Quantium_Vein,
            Vein_Dust.Nickel_Iridium_Vein,
            Vein_Dust.Tin_Cassiterite_Vein,
            SmallOre_Dust.Venus_SmallOre);
        ItemStack[] Fake_T4_Venus_Dust_Checked = checkItemStack(Fake_T4_Venus_Dust);
        ItemStack[][] Fake_T4_Venus_Dust_Split = addSplitAggregateArray(
            Fake_T4_Venus_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T4_Venus_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ve", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T4);
        }
    }

    public static void addFakeVoidDustRecipes_T5() {
        // T5 - Enceladus - En
        ItemStack[] Fake_T5_Enceladus_Dust = addCompressAggregateArray(
            Vein_Dust.Bastnasite_Monazite_Vein,
            Vein_Dust.Chalcopyrite_Copper_Vein,
            Vein_Dust.Ledox_Vein,
            Vein_Dust.Uraninite_Uranium238_Vein,
            Vein_Dust.Scheelite_Tungstate_Vein,
            Vein_Dust.Lazurite_Lapis_Vein,
            Vein_Dust.Nickel_Osmium_Vein,
            Vein_Dust.Vanadium_Vein,
            Vein_Dust.Nickel_Iridium_Vein,
            SmallOre_Dust.Enceladus_SmallOre);
        ItemStack[] Fake_T5_Enceladus_Dust_Checked = checkItemStack(Fake_T5_Enceladus_Dust);
        ItemStack[][] Fake_T5_Enceladus_Dust_Split = addSplitAggregateArray(
            Fake_T5_Enceladus_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T5_Enceladus_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_En", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T5);
        }

        // T5 - Miranda - Mi
        ItemStack[] Fake_T5_Miranda_Dust = addCompressAggregateArray(
            Vein_Dust.Redstone_Vein,
            Vein_Dust.Pyrolusite_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Graphite_Diamond_Vein,
            Vein_Dust.Nickel_Osmium_Vein,
            Vein_Dust.Desh_Vein,
            Vein_Dust.Draconium_Vein,
            Vein_Dust.Ilmenite_Vein,
            Vein_Dust.Nickel_Iridium_Vein,
            Vein_Dust.Tin_Cassiterite_Vein,
            SmallOre_Dust.Miranda_SmallOre);
        ItemStack[] Fake_T5_Miranda_Dust_Checked = checkItemStack(Fake_T5_Miranda_Dust);
        ItemStack[][] Fake_T5_Miranda_Dust_Split = addSplitAggregateArray(
            Fake_T5_Miranda_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T5_Miranda_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mi", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T5);
        }

        // T5 - Oberon - Ob
        ItemStack[] Fake_T5_Oberon_Dust = addCompressAggregateArray(
            Vein_Dust.Tungsten_Vein,
            Vein_Dust.Grossular_Manganese_Vein,
            Vein_Dust.Pitchblende_Vein,
            Vein_Dust.Brown_Limonite_Iron_Vein,
            Vein_Dust.Galena_Vein,
            Vein_Dust.Naquadah_Vein,
            Vein_Dust.Scheelite_Tungstate_Vein,
            Vein_Dust.Nickel_Osmium_Vein,
            Vein_Dust.Platinum_Palladium_Vein,
            SmallOre_Dust.Oberon_SmallOre);
        ItemStack[] Fake_T5_Oberon_Dust_Checked = checkItemStack(Fake_T5_Oberon_Dust);
        ItemStack[][] Fake_T5_Oberon_Dust_Split = addSplitAggregateArray(
            Fake_T5_Oberon_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T5_Oberon_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ob", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T5);
        }

        // T5 - Titan - Ti
        ItemStack[] Fake_T5_Titan_Dust = addCompressAggregateArray(
            Vein_Dust.Wulfenite_Molybdenum_Vein,
            Vein_Dust.Grossular_Manganese_Vein,
            Vein_Dust.Gold_Infused_Gold_Vein,
            Vein_Dust.Bastnasite_Monazite_Vein,
            Vein_Dust.Garnierite_Nickel_Vein,
            Vein_Dust.Arsenic_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Naquadah_Vein,
            Vein_Dust.Graphite_Diamond_Vein,
            Vein_Dust.Nickel_Osmium_Vein,
            Vein_Dust.Ilmenite_Vein,
            Vein_Dust.Beryllium_Vein,
            Vein_Dust.Rutile_Vein,
            Vein_Dust.Nickel_Iridium_Vein,
            SmallOre_Dust.Titan_SmallOre);
        ItemStack[] Fake_T5_Titan_Dust_Checked = checkItemStack(Fake_T5_Titan_Dust);
        ItemStack[][] Fake_T5_Titan_Dust_Split = addSplitAggregateArray(
            Fake_T5_Titan_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T5_Titan_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ti", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T5);
        }

        // T5 - Ross128ba - Ra
        ItemStack[] Fake_T5_Ross128ba_Dust = addCompressAggregateArray(
            Vein_Dust.BArTiMaEuSNeK_Vein,
            Vein_Dust.Amethyst_Vein,
            Vein_Dust.Djurleite_Vein,
            Vein_Dust.Galena_Vein,
            Vein_Dust.Fayalite_Vein,
            Vein_Dust.Ferberite_Vein,
            Vein_Dust.Tiberium_Vein,
            Vein_Dust.Olenite_Vein);
        ItemStack[] Fake_T5_Ross128ba_Dust_Checked = checkItemStack(Fake_T5_Ross128ba_Dust);
        ItemStack[][] Fake_T5_Ross128ba_Dust_Split = addSplitAggregateArray(
            Fake_T5_Ross128ba_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T5_Ross128ba_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ra", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T5);
        }
    }

    public static void addFakeVoidDustRecipes_T6() {
        // T6 - Proteus - Pr
        ItemStack[] Fake_T6_Proteus_Dust = addCompressAggregateArray(
            Vein_Dust.Wulfenite_Molybdenum_Vein,
            Vein_Dust.Tungsten_Vein,
            Vein_Dust.Quartzite_Quartz_Vein,
            Vein_Dust.Gold_Infused_Gold_Vein,
            Vein_Dust.Chalcopyrite_Copper_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Uraninite_Uranium238_Vein,
            Vein_Dust.Graphite_Diamond_Vein,
            Vein_Dust.Nickel_Osmium_Vein,
            Vein_Dust.Ilmenite_Vein,
            Vein_Dust.Vanadium_Vein,
            Vein_Dust.Neutronium_Vein,
            SmallOre_Dust.Proteus_SmallOre);
        ItemStack[] Fake_T6_Proteus_Dust_Checked = checkItemStack(Fake_T6_Proteus_Dust);
        ItemStack[][] Fake_T6_Proteus_Dust_Split = addSplitAggregateArray(
            Fake_T6_Proteus_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T6_Proteus_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Pr", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T6);
        }

        // T6 - Triton - Tr
        ItemStack[] Fake_T6_Triton_Dust = addCompressAggregateArray(
            Vein_Dust.Tungsten_Vein,
            Vein_Dust.Grossular_Manganese_Vein,
            Vein_Dust.Bastnasite_Monazite_Vein,
            Vein_Dust.Garnierite_Nickel_Vein,
            Vein_Dust.Galena_Vein,
            Vein_Dust.Niobium_Vein,
            Vein_Dust.Scheelite_Tungstate_Vein,
            Vein_Dust.Thorium_Vein,
            Vein_Dust.Neutronium_Vein,
            Vein_Dust.Magnetite_Gold_Vein,
            Vein_Dust.Nickel_Iridium_Vein,
            SmallOre_Dust.Triton_SmallOre);
        ItemStack[] Fake_T6_Triton_Dust_Checked = checkItemStack(Fake_T6_Triton_Dust);
        ItemStack[][] Fake_T6_Triton_Dust_Split = addSplitAggregateArray(
            Fake_T6_Triton_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T6_Triton_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Tr", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T6);
        }
    }

    public static void addFakeVoidDustRecipes_T7() {
        // T7 - Haumea - Ha
        ItemStack[] Fake_T7_Haumea_Dust = addCompressAggregateArray(
            Vein_Dust.Pitchblende_Vein,
            Vein_Dust.Gold_Infused_Gold_Vein,
            Vein_Dust.Bastnasite_Monazite_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Garnet_Sand_Nether_Star_Vein,
            Vein_Dust.Naquadah_Vein,
            Vein_Dust.Uraninite_Uranium238_Vein,
            Vein_Dust.Scheelite_Tungstate_Vein,
            Vein_Dust.Bentonite_Olivine_Vein,
            Vein_Dust.Thorium_Vein,
            Vein_Dust.Neutronium_Vein,
            Vein_Dust.Beryllium_Vein,
            SmallOre_Dust.Haumea_SmallOre);
        ItemStack[] Fake_T7_Haumea_Dust_Checked = checkItemStack(Fake_T7_Haumea_Dust);
        ItemStack[][] Fake_T7_Haumea_Dust_Split = addSplitAggregateArray(
            Fake_T7_Haumea_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T7_Haumea_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ha", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T7);
        }

        // T7 - Kuiper Belt - KB
        ItemStack[] Fake_T7_Kuiperbelt_Dust = addCompressAggregateArray(
            Vein_Dust.Carbon_Dioxide_Vein,
            Vein_Dust.Pitchblende_Vein,
            Vein_Dust.Garnierite_Nickel_Vein,
            Vein_Dust.Sulfur_Dioxide_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Naquadah_Vein,
            Vein_Dust.Methane_Vein,
            Vein_Dust.Uraninite_Uranium238_Vein,
            Vein_Dust.Scheelite_Tungstate_Vein,
            Vein_Dust.Graphite_Diamond_Vein,
            Vein_Dust.Nickel_Osmium_Vein,
            Vein_Dust.Platinum_Palladium_Vein,
            Vein_Dust.Neutronium_Vein,
            Vein_Dust.Nickel_Iridium_Vein,
            SmallOre_Dust.Kuiperbelt_SmallOre);
        ItemStack[] Fake_T7_Kuiperbelt_Dust_Checked = checkItemStack(Fake_T7_Kuiperbelt_Dust);
        ItemStack[][] Fake_T7_Kuiperbelt_Dust_Split = addSplitAggregateArray(
            Fake_T7_Kuiperbelt_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T7_Kuiperbelt_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_KB", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T7);
        }

        // T7 - Makemake - MM
        ItemStack[] Fake_T7_Makemake_Dust = addCompressAggregateArray(
            Vein_Dust.Pitchblende_Vein,
            Vein_Dust.Bastnasite_Monazite_Vein,
            Vein_Dust.Black_Plutonium_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Red_Garnet_Vein,
            Vein_Dust.Niobium_Vein,
            Vein_Dust.Magnetite_Vein,
            Vein_Dust.Uraninite_Uranium238_Vein,
            Vein_Dust.Scheelite_Tungstate_Vein,
            Vein_Dust.Bentonite_Olivine_Vein,
            Vein_Dust.Vanadium_Vein,
            Vein_Dust.Neutronium_Vein,
            Vein_Dust.Beryllium_Vein,
            SmallOre_Dust.Makemake_SmallOre);
        ItemStack[] Fake_T7_Makemake_Dust_Checked = checkItemStack(Fake_T7_Makemake_Dust);
        ItemStack[][] Fake_T7_Makemake_Dust_Split = addSplitAggregateArray(
            Fake_T7_Makemake_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T7_Makemake_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_MM", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T7);
        }

        // T7 - Pluto - Pl
        ItemStack[] Fake_T7_Pluto_Dust = addCompressAggregateArray(
            Vein_Dust.Wulfenite_Molybdenum_Vein,
            Vein_Dust.Tungsten_Vein,
            Vein_Dust.Black_Plutonium_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Brown_Limonite_Iron_Vein,
            Vein_Dust.Naquadah_Vein,
            Vein_Dust.Scheelite_Tungstate_Vein,
            Vein_Dust.Graphite_Diamond_Vein,
            Vein_Dust.Nickel_Osmium_Vein,
            Vein_Dust.Ilmenite_Vein,
            Vein_Dust.Platinum_Palladium_Vein,
            Vein_Dust.Thorium_Vein,
            Vein_Dust.Neutronium_Vein,
            Vein_Dust.Magnetite_Gold_Vein,
            Vein_Dust.Beryllium_Vein,
            SmallOre_Dust.Pluto_SmallOre);
        ItemStack[] Fake_T7_Pluto_Dust_Checked = checkItemStack(Fake_T7_Pluto_Dust);
        ItemStack[][] Fake_T7_Pluto_Dust_Split = addSplitAggregateArray(
            Fake_T7_Pluto_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T7_Pluto_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Pl", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T7);
        }
    }

    public static void addFakeVoidDustRecipes_T8() {
        // T8 - BarnardC - BC
        ItemStack[] Fake_T8_BarnardC_Dust = addCompressAggregateArray(
            Vein_Dust.Tungsten_Vein,
            Vein_Dust.Kyanite_Mica_Vein,
            Vein_Dust.Black_Plutonium_Vein,
            Vein_Dust.Arsenic_Vein,
            Vein_Dust.Basaltic_Mineral_Sand_Vein,
            Vein_Dust.Rock_Salt_Salt_Vein,
            Vein_Dust.Nickel_Osmium_Vein,
            Vein_Dust.Samarium_Vein,
            Vein_Dust.Lignite_Coal_Vein);
        ItemStack[] Fake_T8_BarnardC_Dust_Checked = checkItemStack(Fake_T8_BarnardC_Dust);
        ItemStack[][] Fake_T8_BarnardC_Dust_Split = addSplitAggregateArray(
            Fake_T8_BarnardC_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_BarnardC_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BC", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T8);
        }

        // T8 - BarnardE - BE
        ItemStack[] Fake_T8_BarnardE_Dust = addCompressAggregateArray(
            Vein_Dust.Wulfenite_Molybdenum_Vein,
            Vein_Dust.Tungsten_Vein,
            Vein_Dust.Grossular_Manganese_Vein,
            Vein_Dust.Gold_Infused_Gold_Vein,
            Vein_Dust.Chalcopyrite_Copper_Vein,
            Vein_Dust.Garnet_Sand_Nether_Star_Vein,
            Vein_Dust.Naquadah_Vein,
            Vein_Dust.Magnetite_Vein,
            Vein_Dust.Uraninite_Uranium238_Vein,
            Vein_Dust.Bentonite_Olivine_Vein,
            Vein_Dust.Cadmium_Rare_Earth_Vein,
            Vein_Dust.Thorium_Vein,
            Vein_Dust.Neutronium_Vein,
            SmallOre_Dust.BarnardE_SmallOre);
        ItemStack[] Fake_T8_BarnardE_Dust_Checked = checkItemStack(Fake_T8_BarnardE_Dust);
        ItemStack[][] Fake_T8_BarnardE_Dust_Split = addSplitAggregateArray(
            Fake_T8_BarnardE_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_BarnardE_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BE", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T8);
        }

        // T8 - BarnardF - BF
        ItemStack[] Fake_T8_BarnardF_Dust = addCompressAggregateArray(
            Vein_Dust.Tungsten_Vein,
            Vein_Dust.Grossular_Manganese_Vein,
            Vein_Dust.Pitchblende_Vein,
            Vein_Dust.Redstone_Vein,
            Vein_Dust.Bastnasite_Monazite_Vein,
            Vein_Dust.Chalcopyrite_Copper_Vein,
            Vein_Dust.Red_Garnet_Vein,
            Vein_Dust.Naquadah_Vein,
            Vein_Dust.Niobium_Vein,
            Vein_Dust.Graphite_Diamond_Vein,
            Vein_Dust.Cadmium_Rare_Earth_Vein,
            Vein_Dust.Thorium_Vein,
            Vein_Dust.Vanadium_Vein,
            Vein_Dust.Neutronium_Vein,
            Vein_Dust.Magnetite_Gold_Vein,
            Vein_Dust.Beryllium_Vein,
            SmallOre_Dust.BarnardF_SmallOre);
        ItemStack[] Fake_T8_BarnardF_Dust_Checked = checkItemStack(Fake_T8_BarnardF_Dust);
        ItemStack[][] Fake_T8_BarnardF_Dust_Split = addSplitAggregateArray(
            Fake_T8_BarnardF_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_BarnardF_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BF", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T8);
        }

        // T8 - α Centauri Bb - CB
        ItemStack[] Fake_T8_Centauri_Dust = addCompressAggregateArray(
            Vein_Dust.Grossular_Manganese_Vein,
            Vein_Dust.Pitchblende_Vein,
            Vein_Dust.Quartzite_Quartz_Vein,
            Vein_Dust.Redstone_Vein,
            Vein_Dust.Black_Plutonium_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Cassiterite_Tin_Vein,
            Vein_Dust.Sulfur_Vein,
            Vein_Dust.Samarium_Vein,
            Vein_Dust.Cadmium_Rare_Earth_Vein,
            Vein_Dust.Beryllium_Vein,
            Vein_Dust.Saltpeter_Electrotine_Vein,
            Vein_Dust.Nether_Quartz_Vein);
        ItemStack[] Fake_T8_Centauri_Dust_Checked = checkItemStack(Fake_T8_Centauri_Dust);
        ItemStack[][] Fake_T8_Centauri_Dust_Split = addSplitAggregateArray(
            Fake_T8_Centauri_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_Centauri_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_CB", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T8);
        }

        // T8 - TCetiE - TE
        ItemStack[] Fake_T8_TCetiE_Dust = addCompressAggregateArray(
            Vein_Dust.Magnesite_Vein,
            Vein_Dust.Quartzite_Quartz_Vein,
            Vein_Dust.Black_Plutonium_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Garnet_Sand_Nether_Star_Vein,
            Vein_Dust.Apatite_Vein,
            Vein_Dust.Magnetite_Vein,
            Vein_Dust.Rock_Salt_Salt_Vein,
            Vein_Dust.Ilmenite_Vein,
            Vein_Dust.Magnetite_Gold_Vein,
            Vein_Dust.Kaolinite_Vein,
            Vein_Dust.Chrome_Vein,
            Vein_Dust.Tin_Cassiterite_Vein,
            SmallOre_Dust.TCetiE_SmallOre);
        ItemStack[] Fake_T8_TCetiE_Dust_Checked = checkItemStack(Fake_T8_TCetiE_Dust);
        ItemStack[][] Fake_T8_TCetiE_Dust_Split = addSplitAggregateArray(
            Fake_T8_TCetiE_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_TCetiE_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_TE", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T8);
        }

        // T8 - VegaB - VB
        ItemStack[] Fake_T8_VegaB_Dust = addCompressAggregateArray(
            Vein_Dust.Pitchblende_Vein,
            Vein_Dust.Redstone_Vein,
            Vein_Dust.Gold_Infused_Gold_Vein,
            Vein_Dust.Arsenic_Vein,
            Vein_Dust.Garnet_Sand_Nether_Star_Vein,
            Vein_Dust.Red_Garnet_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Galena_Vein,
            Vein_Dust.Naquadah_Vein,
            Vein_Dust.Niobium_Vein,
            Vein_Dust.Scheelite_Tungstate_Vein,
            Vein_Dust.Lazurite_Lapis_Vein,
            Vein_Dust.Cadmium_Rare_Earth_Vein,
            Vein_Dust.Thorium_Vein,
            Vein_Dust.Vanadium_Vein,
            Vein_Dust.Neutronium_Vein,
            Vein_Dust.Magnetite_Gold_Vein,
            SmallOre_Dust.VegaB_SmallOre);
        ItemStack[] Fake_T8_VegaB_Dust_Checked = checkItemStack(Fake_T8_VegaB_Dust);
        ItemStack[][] Fake_T8_VegaB_Dust_Split = addSplitAggregateArray(
            Fake_T8_VegaB_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_VegaB_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_VB", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T8);
        }
    }

    public static void addFakeVoidDustRecipes_T9() {
        // T9 - Anubis - An
        ItemStack[] Fake_T9_Anubis_Dust = addCompressAggregateArray(
            Vein_Dust.Neutronium_Infinity_Catalyst_Vein,
            Vein_Dust.Kyanite_Mica_Vein,
            Vein_Dust.Basaltic_Mineral_Sand_Vein,
            Vein_Dust.Sulfur_Vein,
            Vein_Dust.Bentonite_Olivine_Vein,
            Vein_Dust.Desh_Vein,
            Vein_Dust.Galena_Cryolite_Vein,
            Vein_Dust.Dolomite_Vein,
            Vein_Dust.Callisto_Ice_Vein,
            Vein_Dust.Soapstone_Vein,
            Vein_Dust.Mytryl_Vein,
            Vein_Dust.Rutile_Vein,
            SmallOre_Dust.Anubis_SmallOre);
        ItemStack[] Fake_T9_Anubis_Dust_Checked = checkItemStack(Fake_T9_Anubis_Dust);
        ItemStack[][] Fake_T9_Anubis_Dust_Split = addSplitAggregateArray(
            Fake_T9_Anubis_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_Anubis_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_An", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T9);
        }

        // T9 - Horus - Ho
        ItemStack[] Fake_T9_Horus_Dust = addCompressAggregateArray(
            Vein_Dust.Magnesite_Vein,
            Vein_Dust.Quartzite_Quartz_Vein,
            Vein_Dust.Black_Plutonium_Vein,
            Vein_Dust.Neutronium_Cosmic_Neutronium_Vein,
            Vein_Dust.Garnet_Sand_Nether_Star_Vein,
            Vein_Dust.Red_Garnet_Vein,
            Vein_Dust.Oriharukon_Vein,
            Vein_Dust.Ledox_Vein,
            Vein_Dust.Certus_Quartz_Vein,
            Vein_Dust.Draconium_Vein,
            Vein_Dust.Almandine_Sapphire_Vein,
            Vein_Dust.Mytryl_Vein,
            Vein_Dust.Quantium_Vein,
            SmallOre_Dust.Horus_SmallOre);
        ItemStack[] Fake_T9_Horus_Dust_Checked = checkItemStack(Fake_T9_Horus_Dust);
        ItemStack[][] Fake_T9_Horus_Dust_Split = addSplitAggregateArray(
            Fake_T9_Horus_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_Horus_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ho", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T9);
        }

        // T9 - Maahes - Mh
        ItemStack[] Fake_T9_Maahes_Dust = addCompressAggregateArray(
            Vein_Dust.Naquadah_Vein,
            Vein_Dust.Basaltic_Mineral_Sand_Vein,
            Vein_Dust.Naquadah_Naquadria_Vein,
            Vein_Dust.Galena_Cryolite_Vein,
            Vein_Dust.Callisto_Ice_Vein,
            Vein_Dust.Vanadium_Vein,
            Vein_Dust.Soapstone_Vein,
            Vein_Dust.Neutronium_Vein,
            Vein_Dust.Sheldonite_Platinum_Vein,
            Vein_Dust.Quantium_Vein,
            Vein_Dust.Chrome_Vein);
        ItemStack[] Fake_T9_Maahes_Dust_Checked = checkItemStack(Fake_T9_Maahes_Dust);
        ItemStack[][] Fake_T9_Maahes_Dust_Split = addSplitAggregateArray(
            Fake_T9_Maahes_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_Maahes_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mh", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T9);
        }

        // T9 - MehenBelt - MB
        ItemStack[] Fake_T9_MehenBelt_Dust = addCompressAggregateArray(
            Vein_Dust.Draconium_Awakened_Draconium_Vein,
            Vein_Dust.Garnierite_Nickel_Vein,
            Vein_Dust.Uraninite_Uranium238_Vein,
            Vein_Dust.Lazurite_Lapis_Vein,
            Vein_Dust.Bentonite_Olivine_Vein,
            Vein_Dust.Nickel_Osmium_Vein,
            Vein_Dust.Ilmenite_Vein,
            Vein_Dust.Platinum_Palladium_Vein,
            Vein_Dust.Neutronium_Vein,
            Vein_Dust.Sheldonite_Platinum_Vein,
            Vein_Dust.Nickel_Iridium_Vein,
            Vein_Dust.Tin_Cassiterite_Vein,
            SmallOre_Dust.MehenBelt_SmallOre);
        ItemStack[] Fake_T9_MehenBelt_Dust_Checked = checkItemStack(Fake_T9_MehenBelt_Dust);
        ItemStack[][] Fake_T9_MehenBelt_Dust_Split = addSplitAggregateArray(
            Fake_T9_MehenBelt_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_MehenBelt_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_MB", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T9);
        }

        // T9 - Neper - Np
        ItemStack[] Fake_T9_Neper_Dust = addCompressAggregateArray(
            Vein_Dust.Tungsten_Vein,
            Vein_Dust.Dilithium_Vein,
            Vein_Dust.Kyanite_Mica_Vein,
            Vein_Dust.Arsenic_Vein,
            Vein_Dust.Terra_Aer_Vein,
            Vein_Dust.Certus_Quartz_Vein,
            Vein_Dust.Quartzite_Vein,
            Vein_Dust.Dolomite_Vein,
            Vein_Dust.Perditio_Ordo_Vein,
            Vein_Dust.Kaolinite_Vein,
            Vein_Dust.Aqua_Ignis_Amber_Vein,
            Vein_Dust.Nether_Quartz_Vein);
        ItemStack[] Fake_T9_Neper_Dust_Checked = checkItemStack(Fake_T9_Neper_Dust);
        ItemStack[][] Fake_T9_Neper_Dust_Split = addSplitAggregateArray(
            Fake_T9_Neper_Dust_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_Neper_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Np", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T9);
        }

        // T9 - Seth - Se
        ItemStack[] Fake_T9_Seth_Dust = addCompressAggregateArray(
            Vein_Dust.Bastnasite_Monazite_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Raw_Tengam_Vein,
            Vein_Dust.Magnetite_Vein,
            Vein_Dust.Nickel_Osmium_Vein,
            Vein_Dust.Samarium_Vein,
            Vein_Dust.Draconium_Vein,
            Vein_Dust.Platinum_Palladium_Vein,
            Vein_Dust.Magnetite_Gold_Vein,
            Vein_Dust.Nickel_Iridium_Vein,
            Vein_Dust.Tin_Cassiterite_Vein,
            SmallOre_Dust.Seth_SmallOre);
        ItemStack[] Fake_T9_Seth_Dust_Checked = checkItemStack(Fake_T9_Seth_Dust);
        ItemStack[][] Fake_T9_Seth_Dust_Split = addSplitAggregateArray(Fake_T9_Seth_Dust_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_Seth_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Se", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T9);
        }
    }

    public static void addFakeVoidDustRecipes_T10() {
        ItemStack[] dusts = SingularityDustRecipes.VoidDustRecipes_T10.get("DD");
        if (dusts == null) {
            throw new IllegalStateException("Build the T10 dust catalog before registering its NEI recipes");
        }
        ItemStack[][] Fake_T10_DeepDark_Dust_Split = addSplitAggregateArray(
            RegisteredResourceCatalog.copyItems(dusts),
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T10_DeepDark_Dust_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Dust Mode")
                .eut(0)
                .addTo(addFakeVoidDustRecipes_T10);
        }
    }
}
