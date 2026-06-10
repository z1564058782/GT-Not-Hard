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

public class FakeSingularityDustRecipes {

    public static int NEI_ItemOutput_Size = 90;

    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T0 = RecipeMapBuilder
        .of("Singularity of T0 Dust")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T1 = RecipeMapBuilder
        .of("Singularity of T1 Dust")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T2 = RecipeMapBuilder
        .of("Singularity of T2 Dust")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T3 = RecipeMapBuilder
        .of("Singularity of T3 Dust")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T4 = RecipeMapBuilder
        .of("Singularity of T4 Dust")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T5 = RecipeMapBuilder
        .of("Singularity of T5 Dust")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T6 = RecipeMapBuilder
        .of("Singularity of T6 Dust")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T7 = RecipeMapBuilder
        .of("Singularity of T7 Dust")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T8 = RecipeMapBuilder
        .of("Singularity of T8 Dust")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T9 = RecipeMapBuilder
        .of("Singularity of T9 Dust")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static void addFakeVoidDustRecipes_T0() {
        // T0 - Overworld - Ow
        ItemStack[] Fake_T0_Overworld_Dust = addCompressAggregateArray(
            Vein_Dust.Diamond_Vein,
            Vein_Dust.Lapis_Vein,
            Vein_Dust.Vermiculite_Vein,
            Vein_Dust.Coal_Vein,
            Vein_Dust.Manganese_Vein,
            Vein_Dust.Redstone_Vein,
            Vein_Dust.Mica_Vein,
            Vein_Dust.Dolomite_Vein,
            Vein_Dust.Copper_Vein,
            Vein_Dust.Soapstone_Vein,
            Vein_Dust.Gold_Vein,
            Vein_Dust.Kaolinite_Vein,
            Vein_Dust.Iron_Vein,
            Vein_Dust.Lignite_Coal_Vein,
            Vein_Dust.Apatite_Vein,
            Vein_Dust.Basaltic_Mineral_Sand_Vein,
            Vein_Dust.Magnetite_Vein,
            Vein_Dust.Tin_Vein,
            Vein_Dust.Salt_Vein,
            Vein_Dust.Cassiterite_Vein,
            SmallOre_Dust.Iron_SmallOre,
            SmallOre_Dust.Copper_SmallOre,
            SmallOre_Dust.Silver_SmallOre,
            SmallOre_Dust.Tin_SmallOre,
            SmallOre_Dust.Redstone_SmallOre,
            SmallOre_Dust.Gold_SmallOre,
            SmallOre_Dust.Diamond_SmallOre,
            SmallOre_Dust.Lapis_SmallOre,
            SmallOre_Dust.Coal_SmallOre,
            SmallOre_Dust.Zinc_SmallOre,
            SmallOre_Dust.Nickel_SmallOre);
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
            Vein_Dust.Sulfur_Vein,
            Vein_Dust.Molybdenum_Vein,
            Vein_Dust.Manganese_Vein,
            Vein_Dust.Quartzite_Vein,
            Vein_Dust.Redstone_Vein,
            Vein_Dust.Copper_Vein,
            Vein_Dust.Iron_Vein,
            Vein_Dust.Beryllium_Vein,
            Vein_Dust.Electrotine_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Nether_Quartz_Vein,
            SmallOre_Dust.Saltpeter_SmallOre,
            SmallOre_Dust.Iron_SmallOre,
            SmallOre_Dust.Copper_SmallOre,
            SmallOre_Dust.Silver_SmallOre,
            SmallOre_Dust.Tin_SmallOre,
            SmallOre_Dust.Lead_SmallOre,
            SmallOre_Dust.Redstone_SmallOre,
            SmallOre_Dust.Certus_Quartz_SmallOre,
            SmallOre_Dust.Sulfur_SmallOre,
            SmallOre_Dust.Nether_Quartz_SmallOre,
            SmallOre_Dust.Bismuth_SmallOre,
            SmallOre_Dust.Zinc_SmallOre,
            SmallOre_Dust.Realgar_SmallOre);
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
            Vein_Dust.Diamond_Vein,
            Vein_Dust.Lapis_Vein,
            Vein_Dust.Molybdenum_Vein,
            Vein_Dust.Olivine_Vein,
            Vein_Dust.Terra_Aer_Vein,
            Vein_Dust.Coal_Vein,
            Vein_Dust.Sapphire_Vein,
            Vein_Dust.Cryolite_Vein,
            Vein_Dust.Nickel_Vein,
            Vein_Dust.Soapstone_Vein,
            Vein_Dust.Perditio_Ordo_Vein,
            Vein_Dust.Gold_Vein,
            Vein_Dust.Iron_Vein,
            Vein_Dust.Apatite_Vein,
            Vein_Dust.Magnetite_Vein,
            Vein_Dust.Salt_Vein,
            Vein_Dust.Cassiterite_Vein,
            Vein_Dust.Aqua_Ignis_Amber_Vein,
            SmallOre_Dust.Amethyst_SmallOre,
            SmallOre_Dust.Yellow_Garnet_SmallOre,
            SmallOre_Dust.Tanzanite_SmallOre,
            SmallOre_Dust.Saltpeter_SmallOre,
            SmallOre_Dust.Spinel_SmallOre,
            SmallOre_Dust.Opal_SmallOre,
            SmallOre_Dust.Ruby_SmallOre,
            SmallOre_Dust.Lead_SmallOre,
            SmallOre_Dust.Emerald_SmallOre,
            SmallOre_Dust.Amber_SmallOre,
            SmallOre_Dust.Blue_Topaz_SmallOre,
            SmallOre_Dust.Topaz_SmallOre,
            SmallOre_Dust.Jade_SmallOre,
            SmallOre_Dust.Red_Garnet_SmallOre,
            SmallOre_Dust.Green_Sapphire_SmallOre,
            SmallOre_Dust.Sapphire_SmallOre,
            SmallOre_Dust.Jasper_SmallOre,
            SmallOre_Dust.Olivine_SmallOre);
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
            Vein_Dust.Molybdenum_Vein,
            Vein_Dust.Nickel_Vein,
            Vein_Dust.Copper_Vein,
            Vein_Dust.Gold_Vein,
            Vein_Dust.Beryllium_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Cassiterite_Vein,
            SmallOre_Dust.Iron_SmallOre,
            SmallOre_Dust.Copper_SmallOre,
            SmallOre_Dust.Silver_SmallOre,
            SmallOre_Dust.Tin_SmallOre,
            SmallOre_Dust.Lead_SmallOre,
            SmallOre_Dust.Gold_SmallOre,
            SmallOre_Dust.Zinc_SmallOre,
            SmallOre_Dust.Nickel_SmallOre);
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
            Vein_Dust.Tungstate_Vein,
            Vein_Dust.Lapis_Vein,
            Vein_Dust.Molybdenum_Vein,
            Vein_Dust.Olivine_Vein,
            Vein_Dust.Manganese_Vein,
            Vein_Dust.Nickel_Vein,
            Vein_Dust.Copper_Vein,
            Vein_Dust.Gold_Vein,
            Vein_Dust.Beryllium_Vein,
            Vein_Dust.Platinum_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Naquadah_Vein,
            Vein_Dust.Cassiterite_Vein,
            SmallOre_Dust.Silver_SmallOre,
            SmallOre_Dust.Tin_SmallOre,
            SmallOre_Dust.Lead_SmallOre,
            SmallOre_Dust.Gold_SmallOre,
            SmallOre_Dust.Zinc_SmallOre,
            SmallOre_Dust.Nickel_SmallOre);
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
    }

    public static void addFakeVoidDustRecipes_T1() {
        // T1 - Moon - Mo
        ItemStack[] Fake_T1_Moon_Dust = addCompressAggregateArray(
            Vein_Dust.Molybdenum_Vein,
            Vein_Dust.Quartz_Vein,
            Vein_Dust.Monazite_Vein,
            Vein_Dust.Ilmenite_Vein,
            Vein_Dust.Copper_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Galena_Vein,
            Vein_Dust.Cassiterite_Vein,
            SmallOre_Dust.Meteoric_Iron_SmallOre);
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
            Vein_Dust.Uranium238_Vein,
            Vein_Dust.Tungstate_Vein,
            Vein_Dust.Sulfur_Vein,
            Vein_Dust.Lapis_Vein,
            Vein_Dust.Draconium_Vein,
            Vein_Dust.Monazite_Vein,
            Vein_Dust.Nickel_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Oriharukon_Vein,
            Vein_Dust.Magnetite_Vein,
            SmallOre_Dust.Saltpeter_SmallOre,
            SmallOre_Dust.Titanium_SmallOre,
            SmallOre_Dust.Tin_SmallOre,
            SmallOre_Dust.Lead_SmallOre,
            SmallOre_Dust.Diamond_SmallOre,
            SmallOre_Dust.Draconium_SmallOre,
            SmallOre_Dust.Chromite_SmallOre,
            SmallOre_Dust.Tungstate_SmallOre,
            SmallOre_Dust.Meteoric_Iron_SmallOre,
            SmallOre_Dust.Desh_SmallOre,
            SmallOre_Dust.Nickel_SmallOre);
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
            Vein_Dust.Tungstate_Vein,
            Vein_Dust.Sulfur_Vein,
            Vein_Dust.Desh_Vein,
            Vein_Dust.Pitchblende_Vein,
            Vein_Dust.Quartz_Vein,
            Vein_Dust.Redstone_Vein,
            Vein_Dust.Nickel_Vein,
            Vein_Dust.Arsenic_Vein,
            Vein_Dust.Gold_Vein,
            Vein_Dust.Iron_Vein,
            Vein_Dust.Beryllium_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Galena_Vein,
            Vein_Dust.Salt_Vein,
            SmallOre_Dust.Saltpeter_SmallOre,
            SmallOre_Dust.Iron_SmallOre,
            SmallOre_Dust.Copper_SmallOre,
            SmallOre_Dust.Titanium_SmallOre,
            SmallOre_Dust.Oriharukon_SmallOre,
            SmallOre_Dust.Tin_SmallOre,
            SmallOre_Dust.Lead_SmallOre,
            SmallOre_Dust.Redstone_SmallOre,
            SmallOre_Dust.Gold_SmallOre,
            SmallOre_Dust.Chromite_SmallOre,
            SmallOre_Dust.Tungstate_SmallOre,
            SmallOre_Dust.Meteoric_Iron_SmallOre,
            SmallOre_Dust.Bismuth_SmallOre,
            SmallOre_Dust.Zinc_SmallOre,
            SmallOre_Dust.Nickel_SmallOre);
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
            Vein_Dust.Uranium238_Vein,
            Vein_Dust.Sulfur_Vein,
            Vein_Dust.Diamond_Vein,
            Vein_Dust.Molybdenum_Vein,
            Vein_Dust.Pitchblende_Vein,
            Vein_Dust.Quartz_Vein,
            Vein_Dust.Draconium_Vein,
            Vein_Dust.Nickel_Vein,
            Vein_Dust.Arsenic_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Gold_Vein,
            Vein_Dust.Oriharukon_Vein,
            SmallOre_Dust.Iron_SmallOre,
            SmallOre_Dust.Copper_SmallOre,
            SmallOre_Dust.Titanium_SmallOre,
            SmallOre_Dust.Gold_SmallOre,
            SmallOre_Dust.Draconium_SmallOre,
            SmallOre_Dust.Chromite_SmallOre,
            SmallOre_Dust.Tungstate_SmallOre,
            SmallOre_Dust.Meteoric_Iron_SmallOre,
            SmallOre_Dust.Lapis_SmallOre,
            SmallOre_Dust.Desh_SmallOre);
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
            Vein_Dust.Tungstate_Vein,
            Vein_Dust.Ilmenite_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Gold_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Naquadah_Vein,
            SmallOre_Dust.Iron_SmallOre,
            SmallOre_Dust.Titanium_SmallOre,
            SmallOre_Dust.Lead_SmallOre,
            SmallOre_Dust.Gold_SmallOre,
            SmallOre_Dust.Diamond_SmallOre,
            SmallOre_Dust.Chromite_SmallOre,
            SmallOre_Dust.Tungstate_SmallOre,
            SmallOre_Dust.Nickel_SmallOre);
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
            Vein_Dust.Tungstate_Vein,
            Vein_Dust.Plutonium239_Vein,
            Vein_Dust.Monazite_Vein,
            Vein_Dust.Ilmenite_Vein,
            Vein_Dust.Palladium_Vein,
            Vein_Dust.Callisto_Ice_Vein,
            Vein_Dust.Copper_Vein,
            Vein_Dust.Gold_Vein,
            Vein_Dust.Iron_Vein,
            SmallOre_Dust.Iron_SmallOre,
            SmallOre_Dust.Mytryl_SmallOre,
            SmallOre_Dust.Titanium_SmallOre,
            SmallOre_Dust.Ledox_SmallOre,
            SmallOre_Dust.Gold_SmallOre,
            SmallOre_Dust.Diamond_SmallOre,
            SmallOre_Dust.Chromite_SmallOre,
            SmallOre_Dust.Tungstate_SmallOre,
            SmallOre_Dust.Desh_SmallOre,
            SmallOre_Dust.Bismuth_SmallOre);
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
            Vein_Dust.Uranium238_Vein,
            Vein_Dust.Plutonium239_Vein,
            Vein_Dust.Lapis_Vein,
            Vein_Dust.Molybdenum_Vein,
            Vein_Dust.Olivine_Vein,
            Vein_Dust.Manganese_Vein,
            Vein_Dust.Palladium_Vein,
            Vein_Dust.Copper_Vein,
            Vein_Dust.Soapstone_Vein,
            Vein_Dust.Iron_Vein,
            Vein_Dust.Beryllium_Vein,
            Vein_Dust.Electrotine_Vein,
            Vein_Dust.Magnetite_Vein,
            SmallOre_Dust.Titanium_SmallOre,
            SmallOre_Dust.Oriharukon_SmallOre,
            SmallOre_Dust.Lead_SmallOre,
            SmallOre_Dust.Gold_SmallOre,
            SmallOre_Dust.Diamond_SmallOre,
            SmallOre_Dust.Chromite_SmallOre,
            SmallOre_Dust.Tungstate_SmallOre,
            SmallOre_Dust.Bismuth_SmallOre,
            SmallOre_Dust.Nickel_SmallOre,
            SmallOre_Dust.Quantium_SmallOre,
            SmallOre_Dust.Naquadah_SmallOre);
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
            Vein_Dust.Tin_Vein);
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
            Vein_Dust.Uranium238_Vein,
            Vein_Dust.Tungstate_Vein,
            Vein_Dust.Plutonium239_Vein,
            Vein_Dust.Diamond_Vein,
            Vein_Dust.Redstone_Vein,
            Vein_Dust.Ilmenite_Vein,
            Vein_Dust.Palladium_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Iron_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Galena_Vein,
            SmallOre_Dust.Saltpeter_SmallOre,
            SmallOre_Dust.Iron_SmallOre,
            SmallOre_Dust.Titanium_SmallOre,
            SmallOre_Dust.Tin_SmallOre,
            SmallOre_Dust.Lead_SmallOre,
            SmallOre_Dust.Redstone_SmallOre,
            SmallOre_Dust.Draconium_SmallOre,
            SmallOre_Dust.Chromite_SmallOre,
            SmallOre_Dust.Tungstate_SmallOre,
            SmallOre_Dust.Lapis_SmallOre,
            SmallOre_Dust.Zinc_SmallOre);
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
            Vein_Dust.Bismutite_Bismuthinite_Vein,
            Vein_Dust.Olenite_FluorBuergerite_ChromoAluminoPovondraite_VanadioOxyDravit_Vein,
            Vein_Dust.Arsenopyrite_Ferberite_Loellingite_Roquesite_Vein,
            Vein_Dust.Ferberite_Huebnerite_Loellingite_Vein,
            Vein_Dust.Djurleite_Bornite_Wittichenite_Vein,
            Vein_Dust.Thorianite_Vein,
            Vein_Dust.Fayalite_GreenFuchsite_RedZircon_RedFuchsite_Vein,
            Vein_Dust.Forsterite_Fayalite_OrangeDescloizite_RedDescloizite_Vein);
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
            Vein_Dust.Plutonium239_Vein,
            Vein_Dust.Sulfur_Vein,
            Vein_Dust.Manganese_Vein,
            Vein_Dust.Pitchblende_Vein,
            Vein_Dust.Quartz_Vein,
            Vein_Dust.Pyrolusite_Vein,
            Vein_Dust.Infused_Gold_Vein,
            Vein_Dust.Monazite_Vein,
            Vein_Dust.Palladium_Vein,
            Vein_Dust.Mytryl_Vein,
            Vein_Dust.Magnetite_Vein,
            Vein_Dust.Iridium_Vein,
            Vein_Dust.Cassiterite_Vein,
            SmallOre_Dust.Saltpeter_SmallOre,
            SmallOre_Dust.Iron_SmallOre,
            SmallOre_Dust.Silver_SmallOre,
            SmallOre_Dust.Titanium_SmallOre,
            SmallOre_Dust.Redstone_SmallOre,
            SmallOre_Dust.Chromite_SmallOre,
            SmallOre_Dust.Tungstate_SmallOre,
            SmallOre_Dust.Meteoric_Iron_SmallOre,
            SmallOre_Dust.Firestone_SmallOre,
            SmallOre_Dust.Lapis_SmallOre,
            SmallOre_Dust.Tungsten_SmallOre,
            SmallOre_Dust.Bismuth_SmallOre,
            SmallOre_Dust.Zinc_SmallOre,
            SmallOre_Dust.Quantium_SmallOre,
            SmallOre_Dust.Naquadah_SmallOre);
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
            Vein_Dust.Diamond_Vein,
            Vein_Dust.Molybdenum_Vein,
            Vein_Dust.Draconium_Vein,
            Vein_Dust.Redstone_Vein,
            Vein_Dust.Ilmenite_Vein,
            Vein_Dust.Palladium_Vein,
            Vein_Dust.Arsenic_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Iron_Vein,
            Vein_Dust.Naquadah_Vein,
            Vein_Dust.Iridium_Vein,
            SmallOre_Dust.Titanium_SmallOre,
            SmallOre_Dust.Deep_Iron_SmallOre,
            SmallOre_Dust.Oriharukon_SmallOre,
            SmallOre_Dust.Lead_SmallOre,
            SmallOre_Dust.Redstone_SmallOre,
            SmallOre_Dust.Ledox_SmallOre,
            SmallOre_Dust.Chromite_SmallOre,
            SmallOre_Dust.Tungstate_SmallOre,
            SmallOre_Dust.Desh_SmallOre,
            SmallOre_Dust.Bismuth_SmallOre,
            SmallOre_Dust.Zinc_SmallOre,
            SmallOre_Dust.Nickel_SmallOre,
            SmallOre_Dust.Naquadah_SmallOre);
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
            Vein_Dust.Sulfur_Vein,
            Vein_Dust.Pitchblende_Vein,
            Vein_Dust.Quartz_Vein,
            Vein_Dust.Redstone_Vein,
            Vein_Dust.Monazite_Vein,
            Vein_Dust.Nickel_Vein,
            Vein_Dust.Beryllium_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Galena_Vein,
            Vein_Dust.Naquadah_Vein,
            Vein_Dust.Rutile_Vein,
            Vein_Dust.Quantium_Vein,
            Vein_Dust.Iridium_Vein,
            Vein_Dust.Cassiterite_Vein,
            SmallOre_Dust.Saltpeter_SmallOre,
            SmallOre_Dust.Mytryl_SmallOre,
            SmallOre_Dust.Titanium_SmallOre,
            SmallOre_Dust.Lead_SmallOre,
            SmallOre_Dust.Gold_SmallOre,
            SmallOre_Dust.Diamond_SmallOre,
            SmallOre_Dust.Draconium_SmallOre,
            SmallOre_Dust.Chromite_SmallOre,
            SmallOre_Dust.Tungstate_SmallOre,
            SmallOre_Dust.Meteoric_Iron_SmallOre,
            SmallOre_Dust.Firestone_SmallOre,
            SmallOre_Dust.Tungsten_SmallOre,
            SmallOre_Dust.Nickel_SmallOre,
            SmallOre_Dust.Naquadah_SmallOre);
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
            Vein_Dust.Uranium238_Vein,
            Vein_Dust.Tungstate_Vein,
            Vein_Dust.Lapis_Vein,
            Vein_Dust.Osmium_Vein,
            Vein_Dust.Monazite_Vein,
            Vein_Dust.Copper_Vein,
            Vein_Dust.Vanadium_Vein,
            Vein_Dust.Ledox_Vein,
            Vein_Dust.Iridium_Vein,
            SmallOre_Dust.Saltpeter_SmallOre,
            SmallOre_Dust.Iron_SmallOre,
            SmallOre_Dust.Silver_SmallOre,
            SmallOre_Dust.Titanium_SmallOre,
            SmallOre_Dust.Ledox_SmallOre,
            SmallOre_Dust.Neutronium_SmallOre,
            SmallOre_Dust.Chromite_SmallOre,
            SmallOre_Dust.Tungstate_SmallOre,
            SmallOre_Dust.Lapis_SmallOre,
            SmallOre_Dust.Zinc_SmallOre,
            SmallOre_Dust.Naquadah_SmallOre);
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
            Vein_Dust.Diamond_Vein,
            Vein_Dust.Osmium_Vein,
            Vein_Dust.Desh_Vein,
            Vein_Dust.Draconium_Vein,
            Vein_Dust.Redstone_Vein,
            Vein_Dust.Pyrolusite_Vein,
            Vein_Dust.Ilmenite_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Iridium_Vein,
            Vein_Dust.Cassiterite_Vein,
            SmallOre_Dust.Iron_SmallOre,
            SmallOre_Dust.Mytryl_SmallOre,
            SmallOre_Dust.Titanium_SmallOre,
            SmallOre_Dust.Gold_SmallOre,
            SmallOre_Dust.Tungstate_SmallOre,
            SmallOre_Dust.Desh_SmallOre);
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
            Vein_Dust.Tungstate_Vein,
            Vein_Dust.Osmium_Vein,
            Vein_Dust.Tungsten_Vein,
            Vein_Dust.Manganese_Vein,
            Vein_Dust.Pitchblende_Vein,
            Vein_Dust.Palladium_Vein,
            Vein_Dust.Iron_Vein,
            Vein_Dust.Galena_Vein,
            Vein_Dust.Naquadah_Vein,
            SmallOre_Dust.Silver_SmallOre,
            SmallOre_Dust.Titanium_SmallOre,
            SmallOre_Dust.Lead_SmallOre,
            SmallOre_Dust.Ledox_SmallOre,
            SmallOre_Dust.Neutronium_SmallOre,
            SmallOre_Dust.Diamond_SmallOre,
            SmallOre_Dust.Draconium_SmallOre,
            SmallOre_Dust.Chromite_SmallOre,
            SmallOre_Dust.Tungstate_SmallOre,
            SmallOre_Dust.Lapis_SmallOre);
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
            Vein_Dust.Diamond_Vein,
            Vein_Dust.Molybdenum_Vein,
            Vein_Dust.Osmium_Vein,
            Vein_Dust.Manganese_Vein,
            Vein_Dust.Infused_Gold_Vein,
            Vein_Dust.Monazite_Vein,
            Vein_Dust.Nickel_Vein,
            Vein_Dust.Ilmenite_Vein,
            Vein_Dust.Arsenic_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Beryllium_Vein,
            Vein_Dust.Naquadah_Vein,
            Vein_Dust.Rutile_Vein,
            Vein_Dust.Iridium_Vein,
            SmallOre_Dust.Iron_SmallOre,
            SmallOre_Dust.Silver_SmallOre,
            SmallOre_Dust.Titanium_SmallOre,
            SmallOre_Dust.Oriharukon_SmallOre,
            SmallOre_Dust.Tin_SmallOre,
            SmallOre_Dust.Redstone_SmallOre,
            SmallOre_Dust.Neutronium_SmallOre,
            SmallOre_Dust.Diamond_SmallOre,
            SmallOre_Dust.Chromite_SmallOre,
            SmallOre_Dust.Tungstate_SmallOre,
            SmallOre_Dust.Zinc_SmallOre,
            SmallOre_Dust.Quantium_SmallOre);
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
            Vein_Dust.Olenite_FluorBuergerite_ChromoAluminoPovondraite_VanadioOxyDravit_Vein,
            Vein_Dust.Ferberite_Huebnerite_Loellingite_Vein,
            Vein_Dust.Hedenbergite_Fayalite_OrangeDescloizite_RedDescloizite_Vein,
            Vein_Dust.Prasiolite_Hedenbergite_Vein,
            Vein_Dust.BArTiMaEuSNeK_Vein,
            Vein_Dust.Tiberium_Vein,
            Vein_Dust.Fluorspar_Vein);
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
            Vein_Dust.Uranium238_Vein,
            Vein_Dust.Diamond_Vein,
            Vein_Dust.Molybdenum_Vein,
            Vein_Dust.Osmium_Vein,
            Vein_Dust.Tungsten_Vein,
            Vein_Dust.Quartz_Vein,
            Vein_Dust.Infused_Gold_Vein,
            Vein_Dust.Ilmenite_Vein,
            Vein_Dust.Copper_Vein,
            Vein_Dust.Vanadium_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Neutronium_Vein,
            SmallOre_Dust.Saltpeter_SmallOre,
            SmallOre_Dust.Copper_SmallOre,
            SmallOre_Dust.Silver_SmallOre,
            SmallOre_Dust.Mytryl_SmallOre,
            SmallOre_Dust.Titanium_SmallOre,
            SmallOre_Dust.Tin_SmallOre,
            SmallOre_Dust.Redstone_SmallOre,
            SmallOre_Dust.Neutronium_SmallOre,
            SmallOre_Dust.Chromite_SmallOre,
            SmallOre_Dust.Tungstate_SmallOre,
            SmallOre_Dust.Desh_SmallOre,
            SmallOre_Dust.Bismuth_SmallOre,
            SmallOre_Dust.Zinc_SmallOre,
            SmallOre_Dust.Naquadah_SmallOre);
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
            Vein_Dust.Tungstate_Vein,
            Vein_Dust.Tungsten_Vein,
            Vein_Dust.Manganese_Vein,
            Vein_Dust.Monazite_Vein,
            Vein_Dust.Nickel_Vein,
            Vein_Dust.Thorium_Vein,
            Vein_Dust.Neutronium_Vein,
            Vein_Dust.Gold_Vein,
            Vein_Dust.Galena_Vein,
            Vein_Dust.Niobium_Vein,
            Vein_Dust.Iridium_Vein,
            SmallOre_Dust.Iron_SmallOre,
            SmallOre_Dust.Copper_SmallOre,
            SmallOre_Dust.Silver_SmallOre,
            SmallOre_Dust.Titanium_SmallOre,
            SmallOre_Dust.Oriharukon_SmallOre,
            SmallOre_Dust.Lead_SmallOre,
            SmallOre_Dust.Neutronium_SmallOre,
            SmallOre_Dust.Diamond_SmallOre,
            SmallOre_Dust.Black_Plutonium_SmallOre,
            SmallOre_Dust.Chromite_SmallOre,
            SmallOre_Dust.Tungstate_SmallOre,
            SmallOre_Dust.Desh_SmallOre);
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
            Vein_Dust.Uranium238_Vein,
            Vein_Dust.Tungstate_Vein,
            Vein_Dust.Olivine_Vein,
            Vein_Dust.Pitchblende_Vein,
            Vein_Dust.Infused_Gold_Vein,
            Vein_Dust.Monazite_Vein,
            Vein_Dust.Thorium_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Neutronium_Vein,
            Vein_Dust.Nether_Star_Vein,
            Vein_Dust.Beryllium_Vein,
            Vein_Dust.Naquadah_Vein,
            SmallOre_Dust.Iron_SmallOre,
            SmallOre_Dust.Titanium_SmallOre,
            SmallOre_Dust.Oriharukon_SmallOre,
            SmallOre_Dust.Ledox_SmallOre,
            SmallOre_Dust.Neutronium_SmallOre,
            SmallOre_Dust.Black_Plutonium_SmallOre,
            SmallOre_Dust.Draconium_SmallOre,
            SmallOre_Dust.Chromite_SmallOre,
            SmallOre_Dust.Desh_SmallOre,
            SmallOre_Dust.Zinc_SmallOre,
            SmallOre_Dust.Quantium_SmallOre);
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

        // T7 - Makemake - MM
        ItemStack[] Fake_T7_Makemake_Dust = addCompressAggregateArray(
            Vein_Dust.Uranium238_Vein,
            Vein_Dust.Tungstate_Vein,
            Vein_Dust.Olivine_Vein,
            Vein_Dust.Pitchblende_Vein,
            Vein_Dust.Monazite_Vein,
            Vein_Dust.Black_Plutonium_Vein,
            Vein_Dust.Vanadium_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Neutronium_Vein,
            Vein_Dust.Beryllium_Vein,
            Vein_Dust.Red_Garnet_Vein,
            Vein_Dust.Niobium_Vein,
            Vein_Dust.Magnetite_Vein,
            SmallOre_Dust.Mytryl_SmallOre,
            SmallOre_Dust.Titanium_SmallOre,
            SmallOre_Dust.Oriharukon_SmallOre,
            SmallOre_Dust.Lead_SmallOre,
            SmallOre_Dust.Neutronium_SmallOre,
            SmallOre_Dust.Black_Plutonium_SmallOre,
            SmallOre_Dust.Draconium_SmallOre,
            SmallOre_Dust.Chromite_SmallOre,
            SmallOre_Dust.Desh_SmallOre,
            SmallOre_Dust.Bismuth_SmallOre,
            SmallOre_Dust.Nickel_SmallOre,
            SmallOre_Dust.Quantium_SmallOre);
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
            Vein_Dust.Tungstate_Vein,
            Vein_Dust.Diamond_Vein,
            Vein_Dust.Molybdenum_Vein,
            Vein_Dust.Osmium_Vein,
            Vein_Dust.Tungsten_Vein,
            Vein_Dust.Black_Plutonium_Vein,
            Vein_Dust.Ilmenite_Vein,
            Vein_Dust.Palladium_Vein,
            Vein_Dust.Thorium_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Neutronium_Vein,
            Vein_Dust.Gold_Vein,
            Vein_Dust.Iron_Vein,
            Vein_Dust.Beryllium_Vein,
            Vein_Dust.Naquadah_Vein,
            SmallOre_Dust.Silver_SmallOre,
            SmallOre_Dust.Titanium_SmallOre,
            SmallOre_Dust.Lead_SmallOre,
            SmallOre_Dust.Ledox_SmallOre,
            SmallOre_Dust.Neutronium_SmallOre,
            SmallOre_Dust.Gold_SmallOre,
            SmallOre_Dust.Black_Plutonium_SmallOre,
            SmallOre_Dust.Draconium_SmallOre,
            SmallOre_Dust.Chromite_SmallOre,
            SmallOre_Dust.Tungstate_SmallOre,
            SmallOre_Dust.Meteoric_Iron_SmallOre,
            SmallOre_Dust.Nickel_SmallOre,
            SmallOre_Dust.Quantium_SmallOre,
            SmallOre_Dust.Naquadah_SmallOre);
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
            Vein_Dust.Osmium_Vein,
            Vein_Dust.Tungsten_Vein,
            Vein_Dust.Samarium_Vein,
            Vein_Dust.Mica_Vein,
            Vein_Dust.Black_Plutonium_Vein,
            Vein_Dust.Arsenic_Vein,
            Vein_Dust.Lignite_Coal_Vein,
            Vein_Dust.Basaltic_Mineral_Sand_Vein,
            Vein_Dust.Salt_Vein);
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
            Vein_Dust.Uranium238_Vein,
            Vein_Dust.Molybdenum_Vein,
            Vein_Dust.Olivine_Vein,
            Vein_Dust.Tungsten_Vein,
            Vein_Dust.Manganese_Vein,
            Vein_Dust.Infused_Gold_Vein,
            Vein_Dust.Rare_Earth_Vein,
            Vein_Dust.Thorium_Vein,
            Vein_Dust.Copper_Vein,
            Vein_Dust.Neutronium_Vein,
            Vein_Dust.Nether_Star_Vein,
            Vein_Dust.Naquadah_Vein,
            Vein_Dust.Magnetite_Vein,
            SmallOre_Dust.Awakened_Draconium_SmallOre,
            SmallOre_Dust.Iron_SmallOre,
            SmallOre_Dust.Titanium_SmallOre,
            SmallOre_Dust.Neutronium_SmallOre,
            SmallOre_Dust.Black_Plutonium_SmallOre,
            SmallOre_Dust.Zinc_SmallOre,
            SmallOre_Dust.Nickel_SmallOre,
            SmallOre_Dust.Naquadah_SmallOre);
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
            Vein_Dust.Diamond_Vein,
            Vein_Dust.Tungsten_Vein,
            Vein_Dust.Manganese_Vein,
            Vein_Dust.Pitchblende_Vein,
            Vein_Dust.Redstone_Vein,
            Vein_Dust.Monazite_Vein,
            Vein_Dust.Rare_Earth_Vein,
            Vein_Dust.Thorium_Vein,
            Vein_Dust.Copper_Vein,
            Vein_Dust.Vanadium_Vein,
            Vein_Dust.Neutronium_Vein,
            Vein_Dust.Gold_Vein,
            Vein_Dust.Beryllium_Vein,
            Vein_Dust.Red_Garnet_Vein,
            Vein_Dust.Naquadah_Vein,
            Vein_Dust.Niobium_Vein,
            SmallOre_Dust.Awakened_Draconium_SmallOre,
            SmallOre_Dust.Iron_SmallOre,
            SmallOre_Dust.Titanium_SmallOre,
            SmallOre_Dust.Neutronium_SmallOre,
            SmallOre_Dust.Gold_SmallOre,
            SmallOre_Dust.Black_Plutonium_SmallOre,
            SmallOre_Dust.Realgar_SmallOre,
            SmallOre_Dust.Nickel_SmallOre,
            SmallOre_Dust.Naquadah_SmallOre,
            SmallOre_Dust.Bedrockium_SmallOre);
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
            Vein_Dust.Sulfur_Vein,
            Vein_Dust.Manganese_Vein,
            Vein_Dust.Samarium_Vein,
            Vein_Dust.Pitchblende_Vein,
            Vein_Dust.Quartz_Vein,
            Vein_Dust.Redstone_Vein,
            Vein_Dust.Black_Plutonium_Vein,
            Vein_Dust.Rare_Earth_Vein,
            Vein_Dust.Beryllium_Vein,
            Vein_Dust.Electrotine_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Tin_Vein,
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
            Vein_Dust.Quartz_Vein,
            Vein_Dust.Black_Plutonium_Vein,
            Vein_Dust.Ilmenite_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Gold_Vein,
            Vein_Dust.Kaolinite_Vein,
            Vein_Dust.Nether_Star_Vein,
            Vein_Dust.Apatite_Vein,
            Vein_Dust.Chrome_Vein,
            Vein_Dust.Magnetite_Vein,
            Vein_Dust.Salt_Vein,
            Vein_Dust.Cassiterite_Vein,
            SmallOre_Dust.Awakened_Draconium_SmallOre,
            SmallOre_Dust.Neutronium_SmallOre,
            SmallOre_Dust.Lapis_SmallOre);
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
            Vein_Dust.Tungstate_Vein,
            Vein_Dust.Lapis_Vein,
            Vein_Dust.Pitchblende_Vein,
            Vein_Dust.Redstone_Vein,
            Vein_Dust.Infused_Gold_Vein,
            Vein_Dust.Rare_Earth_Vein,
            Vein_Dust.Thorium_Vein,
            Vein_Dust.Arsenic_Vein,
            Vein_Dust.Vanadium_Vein,
            Vein_Dust.Neutronium_Vein,
            Vein_Dust.Gold_Vein,
            Vein_Dust.Nether_Star_Vein,
            Vein_Dust.Red_Garnet_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Galena_Vein,
            Vein_Dust.Naquadah_Vein,
            Vein_Dust.Niobium_Vein,
            SmallOre_Dust.Awakened_Draconium_SmallOre,
            SmallOre_Dust.Silver_SmallOre,
            SmallOre_Dust.Lead_SmallOre,
            SmallOre_Dust.Neutronium_SmallOre,
            SmallOre_Dust.Infinity_Catalyst_SmallOre,
            SmallOre_Dust.Diamond_SmallOre,
            SmallOre_Dust.Black_Plutonium_SmallOre,
            SmallOre_Dust.Chromite_SmallOre,
            SmallOre_Dust.Bismuth_SmallOre);
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
            Vein_Dust.Sulfur_Vein,
            Vein_Dust.Infinity_Catalyst_Vein,
            Vein_Dust.Olivine_Vein,
            Vein_Dust.Desh_Vein,
            Vein_Dust.Mica_Vein,
            Vein_Dust.Cryolite_Vein,
            Vein_Dust.Dolomite_Vein,
            Vein_Dust.Callisto_Ice_Vein,
            Vein_Dust.Soapstone_Vein,
            Vein_Dust.Mytryl_Vein,
            Vein_Dust.Rutile_Vein,
            Vein_Dust.Basaltic_Mineral_Sand_Vein,
            SmallOre_Dust.Infinity_Catalyst_SmallOre);
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
            Vein_Dust.Certus_Quartz_Vein,
            Vein_Dust.Quartz_Vein,
            Vein_Dust.Draconium_Vein,
            Vein_Dust.Sapphire_Vein,
            Vein_Dust.Black_Plutonium_Vein,
            Vein_Dust.Cosmic_Neutronium_Vein,
            Vein_Dust.Mytryl_Vein,
            Vein_Dust.Nether_Star_Vein,
            Vein_Dust.Red_Garnet_Vein,
            Vein_Dust.Oriharukon_Vein,
            Vein_Dust.Quantium_Vein,
            Vein_Dust.Ledox_Vein,
            SmallOre_Dust.Amethyst_SmallOre,
            SmallOre_Dust.Red_Garnet_SmallOre,
            SmallOre_Dust.Yellow_Garnet_SmallOre,
            SmallOre_Dust.Tanzanite_SmallOre,
            SmallOre_Dust.Spinel_SmallOre,
            SmallOre_Dust.Opal_SmallOre,
            SmallOre_Dust.Charged_Certus_Quartz_SmallOre,
            SmallOre_Dust.Mytryl_SmallOre,
            SmallOre_Dust.Ruby_SmallOre,
            SmallOre_Dust.Emerald_SmallOre,
            SmallOre_Dust.Blue_Topaz_SmallOre,
            SmallOre_Dust.Topaz_SmallOre,
            SmallOre_Dust.Certus_Quartz_SmallOre,
            SmallOre_Dust.Jade_SmallOre,
            SmallOre_Dust.Green_Sapphire_SmallOre,
            SmallOre_Dust.Sapphire_SmallOre,
            SmallOre_Dust.Jasper_SmallOre,
            SmallOre_Dust.Olivine_SmallOre);
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
            Vein_Dust.Naquadria_Vein,
            Vein_Dust.Cryolite_Vein,
            Vein_Dust.Callisto_Ice_Vein,
            Vein_Dust.Vanadium_Vein,
            Vein_Dust.Soapstone_Vein,
            Vein_Dust.Neutronium_Vein,
            Vein_Dust.Platinum_Vein,
            Vein_Dust.Naquadria_Vein,
            Vein_Dust.Basaltic_Mineral_Sand_Vein,
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
            Vein_Dust.Uranium238_Vein,
            Vein_Dust.Lapis_Vein,
            Vein_Dust.Awakened_Draconium_Vein,
            Vein_Dust.Olivine_Vein,
            Vein_Dust.Osmium_Vein,
            Vein_Dust.Nickel_Vein,
            Vein_Dust.Ilmenite_Vein,
            Vein_Dust.Palladium_Vein,
            Vein_Dust.Neutronium_Vein,
            Vein_Dust.Platinum_Vein,
            Vein_Dust.Iridium_Vein,
            Vein_Dust.Cassiterite_Vein,
            SmallOre_Dust.Titanium_SmallOre,
            SmallOre_Dust.Tin_SmallOre,
            SmallOre_Dust.Neutronium_SmallOre,
            SmallOre_Dust.Chromite_SmallOre,
            SmallOre_Dust.Lapis_SmallOre,
            SmallOre_Dust.Nickel_SmallOre,
            SmallOre_Dust.Olivine_SmallOre);
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
            Vein_Dust.Terra_Aer_Vein,
            Vein_Dust.Certus_Quartz_Vein,
            Vein_Dust.Quartzite_Vein,
            Vein_Dust.Dilithium_Vein,
            Vein_Dust.Mica_Vein,
            Vein_Dust.Dolomite_Vein,
            Vein_Dust.Arsenic_Vein,
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
            Vein_Dust.Osmium_Vein,
            Vein_Dust.Samarium_Vein,
            Vein_Dust.Draconium_Vein,
            Vein_Dust.Monazite_Vein,
            Vein_Dust.Palladium_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Gold_Vein,
            Vein_Dust.Raw_Tengam_Vein,
            Vein_Dust.Magnetite_Vein,
            Vein_Dust.Iridium_Vein,
            Vein_Dust.Cassiterite_Vein,
            SmallOre_Dust.Awakened_Draconium_SmallOre,
            SmallOre_Dust.Draconium_SmallOre);
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
}
