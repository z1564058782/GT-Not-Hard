package Recipes.SingularityRecipes_VoidOre;

import static gregtech.api.enums.Mods.NEIOrePlugin;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;
import static util.AggregateItemStackArray.addCompressAggregateArray;
import static util.AggregateItemStackArray.addSplitAggregateArray;

import net.minecraft.item.ItemStack;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.OneToManyItemsFrontend_Large;

public class FakeSingularityOreRecipes {

    public static int NEI_ItemOutput_Size = 90;

    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T0 = RecipeMapBuilder
        .of("Singularity of T0 Ore")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T1 = RecipeMapBuilder
        .of("Singularity of T1 Ore")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T2 = RecipeMapBuilder
        .of("Singularity of T2 Ore")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T3 = RecipeMapBuilder
        .of("Singularity of T3 Ore")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T4 = RecipeMapBuilder
        .of("Singularity of T4 Ore")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T5 = RecipeMapBuilder
        .of("Singularity of T5 Ore")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T6 = RecipeMapBuilder
        .of("Singularity of T6 Ore")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T7 = RecipeMapBuilder
        .of("Singularity of T7 Ore")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T8 = RecipeMapBuilder
        .of("Singularity of T8 Ore")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T9 = RecipeMapBuilder
        .of("Singularity of T9 Ore")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T10 = RecipeMapBuilder
        .of("Singularity of T10 Ore")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static void addFakeVoidOreRecipes_T0() {
        // T0 - Overworld - Ow
        ItemStack[] Fake_T0_Overworld_Ore = addCompressAggregateArray(
            Vein.Diamond_Vein,
            Vein.Lapis_Vein,
            Vein.Vermiculite_Vein,
            Vein.Oilsands_Vein,
            Vein.Coal_Vein,
            Vein.Manganese_Vein,
            Vein.Redstone_Vein,
            Vein.Mica_Vein,
            Vein.Dolomite_Vein,
            Vein.Copper_Vein,
            Vein.Soapstone_Vein,
            Vein.Gold_Vein,
            Vein.Kaolinite_Vein,
            Vein.Iron_Vein,
            Vein.Lignite_Coal_Vein,
            Vein.Apatite_Vein,
            Vein.Basaltic_Mineral_Sand_Vein,
            Vein.Magnetite_Vein,
            Vein.Tin_Vein,
            Vein.Salt_Vein,
            Vein.Cassiterite_Vein,
            SmallOre.Overworld_SmallOre);
        ItemStack[][] Fake_T0_Overworld_Ore_Split = addSplitAggregateArray(Fake_T0_Overworld_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T0_Overworld_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ow", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T0);
        }

        // T0 - Nether - Ne
        ItemStack[] Fake_T0_Nether_Ore = addCompressAggregateArray(
            Vein.Sulfur_Vein,
            Vein.Molybdenum_Vein,
            Vein.Manganese_Vein,
            Vein.Quartzite_Vein,
            Vein.Iron_Vein,
            Vein.Beryllium_Vein,
            Vein.Electrotine_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Nether_Quartz_Vein,
            SmallOre.Nether_SmallOre);
        ItemStack[][] Fake_T0_Nether_Ore_Split = addSplitAggregateArray(Fake_T0_Nether_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T0_Nether_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ne", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T0);
        }

        // T0 - Twilight - TF
        ItemStack[] Fake_T0_Twilight_Ore = addCompressAggregateArray(
            Vein.Diamond_Vein,
            Vein.Lapis_Vein,
            Vein.Molybdenum_Vein,
            Vein.Olivine_Vein,
            Vein.Terra_Aer_Vein,
            Vein.Coal_Vein,
            Vein.Sapphire_Vein,
            Vein.Cryolite_Vein,
            Vein.Nickel_Vein,
            Vein.Soapstone_Vein,
            Vein.Perditio_Ordo_Vein,
            Vein.Gold_Vein,
            Vein.Iron_Vein,
            Vein.Apatite_Vein,
            Vein.Magnetite_Vein,
            Vein.Salt_Vein,
            Vein.Cassiterite_Vein,
            Vein.Aqua_Ignis_Amber_Vein,
            SmallOre.Twilight_SmallOre);
        ItemStack[][] Fake_T0_Twilight_Ore_Split = addSplitAggregateArray(Fake_T0_Twilight_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T0_Twilight_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_TF", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T0);
        }

        // T0 - TheEnd - ED
        ItemStack[] Fake_T0_TheEnd_Ore = addCompressAggregateArray(
            Vein.Molybdenum_Vein,
            Vein.Nickel_Vein,
            Vein.Copper_Vein,
            Vein.Gold_Vein,
            Vein.Beryllium_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Cassiterite_Vein,
            SmallOre.TheEnd_SmallOre);
        ItemStack[][] Fake_T0_TheEnd_Ore_Split = addSplitAggregateArray(Fake_T0_TheEnd_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T0_TheEnd_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_ED", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T0);
        }

        // T0 - EndAsteroid - EA
        ItemStack[] Fake_T0_EndAsteroid_Ore = addCompressAggregateArray(
            Vein.Tungstate_Vein,
            Vein.Lapis_Vein,
            Vein.Molybdenum_Vein,
            Vein.Olivine_Vein,
            Vein.Manganese_Vein,
            Vein.Nickel_Vein,
            Vein.Copper_Vein,
            Vein.Gold_Vein,
            Vein.Beryllium_Vein,
            Vein.Platinum_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Naquadah_Vein,
            Vein.Cassiterite_Vein,
            SmallOre.EndAsteroid_SmallOre);
        ItemStack[][] Fake_T0_EndAsteroid_Ore_Split = addSplitAggregateArray(
            Fake_T0_EndAsteroid_Ore,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T0_EndAsteroid_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_EA", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T0);
        }
    }

    public static void addFakeVoidOreRecipes_T1() {
        // T1 - Moon - Mo
        ItemStack[] Fake_T1_Moon_Ore = addCompressAggregateArray(
            Vein.Molybdenum_Vein,
            Vein.Quartzite_Vein,
            Vein.Monazite_Vein,
            Vein.Ilmenite_Vein,
            Vein.Copper_Vein,
            Vein.Bauxite_Vein,
            Vein.Galena_Vein,
            Vein.Cassiterite_Vein,
            SmallOre.Moon_SmallOre);
        ItemStack[][] Fake_T1_Moon_Ore_Split = addSplitAggregateArray(Fake_T1_Moon_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T1_Moon_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mo", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T1);
        }
    }

    public static void addFakeVoidOreRecipes_T2() {
        // T2 - Deimos - De
        ItemStack[] Fake_T2_Deimos_Ore = addCompressAggregateArray(
            Vein.Uranium238_Vein,
            Vein.Tungstate_Vein,
            Vein.Sulfur_Vein,
            Vein.Lapis_Vein,
            Vein.Draconium_Vein,
            Vein.Monazite_Vein,
            Vein.Nickel_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Oriharukon_Vein,
            Vein.Magnetite_Vein,
            SmallOre.Deimos_SmallOre);
        ItemStack[][] Fake_T2_Deimos_Ore_Split = addSplitAggregateArray(Fake_T2_Deimos_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T2_Deimos_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_De", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T2);
        }

        // T2 - Mars - Ma
        ItemStack[] Fake_T2_Mars_Ore = addCompressAggregateArray(
            Vein.Tungstate_Vein,
            Vein.Sulfur_Vein,
            Vein.Desh_Vein,
            Vein.Pitchblende_Vein,
            Vein.Quartzite_Vein,
            Vein.Redstone_Vein,
            Vein.Nickel_Vein,
            Vein.Arsenic_Vein,
            Vein.Gold_Vein,
            Vein.Iron_Vein,
            Vein.Beryllium_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Galena_Vein,
            Vein.Salt_Vein,
            SmallOre.Mars_SmallOre);
        ItemStack[][] Fake_T2_Mars_Ore_Split = addSplitAggregateArray(Fake_T2_Mars_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T2_Mars_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ma", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T2);
        }

        // T2 - Phobos - Ph
        ItemStack[] Fake_T2_Phobos_Ore = addCompressAggregateArray(
            Vein.Uranium238_Vein,
            Vein.Sulfur_Vein,
            Vein.Diamond_Vein,
            Vein.Molybdenum_Vein,
            Vein.Pitchblende_Vein,
            Vein.Quartz_Vein,
            Vein.Draconium_Vein,
            Vein.Nickel_Vein,
            Vein.Arsenic_Vein,
            Vein.Bauxite_Vein,
            Vein.Gold_Vein,
            Vein.Oriharukon_Vein,
            SmallOre.Phobos_SmallOre);
        ItemStack[][] Fake_T2_Phobos_Ore_Split = addSplitAggregateArray(Fake_T2_Phobos_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T2_Phobos_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ph", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T2);
        }
    }

    public static void addFakeVoidOreRecipes_T3() {
        // T3 - Asteroids - As
        ItemStack[] Fake_T3_Asteroids_Ore = addCompressAggregateArray(
            Vein.Tungstate_Vein,
            Vein.Ilmenite_Vein,
            Vein.Bauxite_Vein,
            Vein.Gold_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Naquadah_Vein,
            SmallOre.Asteroids_SmallOre);
        ItemStack[][] Fake_T3_Asteroids_Ore_Split = addSplitAggregateArray(Fake_T3_Asteroids_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Asteroids_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_As", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T3);
        }

        // T3 - Callisto - Ca
        ItemStack[] Fake_T3_Callisto_Ore = addCompressAggregateArray(
            Vein.Tungstate_Vein,
            Vein.Plutonium239_Vein,
            Vein.Monazite_Vein,
            Vein.Ilmenite_Vein,
            Vein.Palladium_Vein,
            Vein.Callisto_Ice_Vein,
            Vein.Copper_Vein,
            Vein.Gold_Vein,
            Vein.Iron_Vein,
            SmallOre.Callisto_SmallOre);
        ItemStack[][] Fake_T3_Callisto_Ore_Split = addSplitAggregateArray(Fake_T3_Callisto_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Callisto_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ca", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T3);
        }

        // T3 - Ceres - Ce
        ItemStack[] Fake_T3_Ceres_Ore = addCompressAggregateArray(
            Vein.Uranium238_Vein,
            Vein.Plutonium239_Vein,
            Vein.Lapis_Vein,
            Vein.Molybdenum_Vein,
            Vein.Olivine_Vein,
            Vein.Manganese_Vein,
            Vein.Palladium_Vein,
            Vein.Copper_Vein,
            Vein.Soapstone_Vein,
            Vein.Iron_Vein,
            Vein.Beryllium_Vein,
            Vein.Electrotine_Vein,
            Vein.Magnetite_Vein,
            SmallOre.Ceres_SmallOre);
        ItemStack[][] Fake_T3_Ceres_Ore_Split = addSplitAggregateArray(Fake_T3_Ceres_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Ceres_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ce", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T3);
        }

        // T3 - Europa - Eu
        ItemStack[] Fake_T3_Europa_Ore = addCompressAggregateArray(
            Vein.Magnesite_Vein,
            Vein.Basaltic_Mineral_Sand_Vein,
            Vein.Chrome_Vein,
            Vein.Ledox_Vein,
            Vein.Tin_Vein);
        ItemStack[][] Fake_T3_Europa_Ore_Split = addSplitAggregateArray(Fake_T3_Europa_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Europa_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Eu", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T3);
        }

        // T3 - Ganymede - Ga
        ItemStack[] Fake_T3_Ganymede_Ore = addCompressAggregateArray(
            Vein.Uranium238_Vein,
            Vein.Tungstate_Vein,
            Vein.Plutonium239_Vein,
            Vein.Diamond_Vein,
            Vein.Redstone_Vein,
            Vein.Ilmenite_Vein,
            Vein.Palladium_Vein,
            Vein.Bauxite_Vein,
            Vein.Iron_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Galena_Vein,
            SmallOre.Ganymede_SmallOre);
        ItemStack[][] Fake_T3_Ganymede_Ore_Split = addSplitAggregateArray(Fake_T3_Ganymede_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Ganymede_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ga", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T3);
        }

        // T3 - Ross128b - Rb
        ItemStack[] Fake_T3_Ross128b_Ore = addCompressAggregateArray(
            Vein.Bismutite_Bismuthinite_Vein,
            Vein.Olenite_FluorBuergerite_ChromoAluminoPovondraite_VanadioOxyDravit_Vein,
            Vein.Arsenopyrite_Ferberite_Loellingite_Roquesite_Vein,
            Vein.Ferberite_Huebnerite_Loellingite_Vein,
            Vein.Djurleite_Bornite_Wittichenite_Vein,
            Vein.Thorianite_Vein,
            Vein.Fayalite_GreenFuchsite_RedZircon_RedFuchsite_Vein,
            Vein.Forsterite_Fayalite_OrangeDescloizite_RedDescloizite_Vein);
        ItemStack[][] Fake_T3_Ross128b_Ore_Split = addSplitAggregateArray(Fake_T3_Ross128b_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Ross128b_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Rb", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T3);
        }
    }

    public static void addFakeVoidOreRecipes_T4() {
        // T4 - Io - Io
        ItemStack[] Fake_T4_Io_Ore = addCompressAggregateArray(
            Vein.Plutonium239_Vein,
            Vein.Sulfur_Vein,
            Vein.Manganese_Vein,
            Vein.Pitchblende_Vein,
            Vein.Quartzite_Vein,
            Vein.Pyrolusite_Vein,
            Vein.Infused_Gold_Vein,
            Vein.Monazite_Vein,
            Vein.Palladium_Vein,
            Vein.Mytryl_Vein,
            Vein.Magnetite_Vein,
            Vein.Iridium_Vein,
            Vein.Cassiterite_Vein,
            SmallOre.Io_SmallOre);
        ItemStack[][] Fake_T4_Io_Ore_Split = addSplitAggregateArray(Fake_T4_Io_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T4_Io_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Io", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T4);
        }

        // T4 - Mercury - Me
        ItemStack[] Fake_T4_Mercury_Ore = addCompressAggregateArray(
            Vein.Diamond_Vein,
            Vein.Molybdenum_Vein,
            Vein.Draconium_Vein,
            Vein.Redstone_Vein,
            Vein.Ilmenite_Vein,
            Vein.Palladium_Vein,
            Vein.Arsenic_Vein,
            Vein.Bauxite_Vein,
            Vein.Iron_Vein,
            Vein.Naquadah_Vein,
            Vein.Iridium_Vein,
            SmallOre.Mercury_SmallOre);
        ItemStack[][] Fake_T4_Mercury_Ore_Split = addSplitAggregateArray(Fake_T4_Mercury_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T4_Mercury_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Me", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T4);
        }

        // T4 - Venus - Ve
        ItemStack[] Fake_T4_Venus_Ore = addCompressAggregateArray(
            Vein.Sulfur_Vein,
            Vein.Pitchblende_Vein,
            Vein.Quartz_Vein,
            Vein.Redstone_Vein,
            Vein.Monazite_Vein,
            Vein.Nickel_Vein,
            Vein.Beryllium_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Galena_Vein,
            Vein.Naquadah_Vein,
            Vein.Rutile_Vein,
            Vein.Quantium_Vein,
            Vein.Iridium_Vein,
            Vein.Cassiterite_Vein,
            SmallOre.Venus_SmallOre);
        ItemStack[][] Fake_T4_Venus_Ore_Split = addSplitAggregateArray(Fake_T4_Venus_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T4_Venus_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ve", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T4);
        }
    }

    public static void addFakeVoidOreRecipes_T5() {
        // T5 - Enceladus - En
        ItemStack[] Fake_T5_Enceladus_Ore = addCompressAggregateArray(
            Vein.Uranium238_Vein,
            Vein.Tungstate_Vein,
            Vein.Lapis_Vein,
            Vein.Osmium_Vein,
            Vein.Monazite_Vein,
            Vein.Copper_Vein,
            Vein.Vanadium_Vein,
            Vein.Ledox_Vein,
            Vein.Iridium_Vein,
            SmallOre.Enceladus_SmallOre);
        ItemStack[][] Fake_T5_Enceladus_Ore_Split = addSplitAggregateArray(Fake_T5_Enceladus_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T5_Enceladus_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_En", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T5);
        }

        // T5 - Miranda - Mi
        ItemStack[] Fake_T5_Miranda_Ore = addCompressAggregateArray(
            Vein.Diamond_Vein,
            Vein.Osmium_Vein,
            Vein.Desh_Vein,
            Vein.Draconium_Vein,
            Vein.Redstone_Vein,
            Vein.Pyrolusite_Vein,
            Vein.Ilmenite_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Iridium_Vein,
            Vein.Cassiterite_Vein,
            SmallOre.Miranda_SmallOre);
        ItemStack[][] Fake_T5_Miranda_Ore_Split = addSplitAggregateArray(Fake_T5_Miranda_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T5_Miranda_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mi", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T5);
        }

        // T5 - Oberon - Ob
        ItemStack[] Fake_T5_Oberon_Ore = addCompressAggregateArray(
            Vein.Tungstate_Vein,
            Vein.Osmium_Vein,
            Vein.Tungsten_Vein,
            Vein.Manganese_Vein,
            Vein.Pitchblende_Vein,
            Vein.Palladium_Vein,
            Vein.Iron_Vein,
            Vein.Galena_Vein,
            Vein.Naquadah_Vein,
            SmallOre.Oberon_SmallOre);
        ItemStack[][] Fake_T5_Oberon_Ore_Split = addSplitAggregateArray(Fake_T5_Oberon_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T5_Oberon_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ob", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T5);
        }

        // T5 - Titan - Ti
        ItemStack[] Fake_T5_Titan_Ore = addCompressAggregateArray(
            Vein.Diamond_Vein,
            Vein.Molybdenum_Vein,
            Vein.Osmium_Vein,
            Vein.Manganese_Vein,
            Vein.Infused_Gold_Vein,
            Vein.Monazite_Vein,
            Vein.Nickel_Vein,
            Vein.Ilmenite_Vein,
            Vein.Arsenic_Vein,
            Vein.Bauxite_Vein,
            Vein.Beryllium_Vein,
            Vein.Naquadah_Vein,
            Vein.Rutile_Vein,
            Vein.Iridium_Vein,
            SmallOre.Titan_SmallOre);
        ItemStack[][] Fake_T5_Titan_Ore_Split = addSplitAggregateArray(Fake_T5_Titan_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T5_Titan_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ti", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T5);
        }

        // T5 - Ross128ba - Ra
        ItemStack[] Fake_T5_Ross128ba_Ore = addCompressAggregateArray(
            Vein.Olenite_FluorBuergerite_ChromoAluminoPovondraite_VanadioOxyDravit_Vein,
            Vein.Ferberite_Huebnerite_Loellingite_Vein,
            Vein.Hedenbergite_Fayalite_OrangeDescloizite_RedDescloizite_Vein,
            Vein.Prasiolite_Hedenbergite_Vein,
            Vein.BArTiMaEuSNeK_Vein,
            Vein.Tiberium_Vein,
            Vein.Fluorspar_Vein);
        ItemStack[][] Fake_T5_Ross128ba_Ore_Split = addSplitAggregateArray(Fake_T5_Ross128ba_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T5_Ross128ba_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ra", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T5);
        }
    }

    public static void addFakeVoidOreRecipes_T6() {
        // T6 - Proteus - Pr
        ItemStack[] Fake_T6_Proteus_Ore = addCompressAggregateArray(
            Vein.Uranium238_Vein,
            Vein.Diamond_Vein,
            Vein.Molybdenum_Vein,
            Vein.Osmium_Vein,
            Vein.Tungsten_Vein,
            Vein.Quartz_Vein,
            Vein.Infused_Gold_Vein,
            Vein.Ilmenite_Vein,
            Vein.Copper_Vein,
            Vein.Vanadium_Vein,
            Vein.Bauxite_Vein,
            Vein.Neutronium_Vein,
            SmallOre.Proteus_SmallOre);
        ItemStack[][] Fake_T6_Proteus_Ore_Split = addSplitAggregateArray(Fake_T6_Proteus_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T6_Proteus_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Pr", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T6);
        }

        // T6 - Triton - Tr
        ItemStack[] Fake_T6_Triton_Ore = addCompressAggregateArray(
            Vein.Tungstate_Vein,
            Vein.Tungsten_Vein,
            Vein.Manganese_Vein,
            Vein.Monazite_Vein,
            Vein.Nickel_Vein,
            Vein.Thorium_Vein,
            Vein.Neutronium_Vein,
            Vein.Gold_Vein,
            Vein.Galena_Vein,
            Vein.Niobium_Vein,
            Vein.Iridium_Vein,
            SmallOre.Triton_SmallOre);
        ItemStack[][] Fake_T6_Triton_Ore_Split = addSplitAggregateArray(Fake_T6_Triton_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T6_Triton_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Tr", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T6);
        }
    }

    public static void addFakeVoidOreRecipes_T7() {
        // T7 - Haumea - Ha
        ItemStack[] Fake_T7_Haumea_Ore = addCompressAggregateArray(
            Vein.Uranium238_Vein,
            Vein.Tungstate_Vein,
            Vein.Olivine_Vein,
            Vein.Pitchblende_Vein,
            Vein.Infused_Gold_Vein,
            Vein.Monazite_Vein,
            Vein.Thorium_Vein,
            Vein.Bauxite_Vein,
            Vein.Neutronium_Vein,
            Vein.Nether_Star_Vein,
            Vein.Beryllium_Vein,
            Vein.Naquadah_Vein,
            SmallOre.Haumea_SmallOre);
        ItemStack[][] Fake_T7_Haumea_Ore_Split = addSplitAggregateArray(Fake_T7_Haumea_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T7_Haumea_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ha", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T7);
        }

        // T7 - Makemake - MM
        ItemStack[] Fake_T7_Makemake_Ore = addCompressAggregateArray(
            Vein.Uranium238_Vein,
            Vein.Tungstate_Vein,
            Vein.Olivine_Vein,
            Vein.Pitchblende_Vein,
            Vein.Monazite_Vein,
            Vein.Black_Plutonium_Vein,
            Vein.Vanadium_Vein,
            Vein.Bauxite_Vein,
            Vein.Neutronium_Vein,
            Vein.Beryllium_Vein,
            Vein.Red_Garnet_Vein,
            Vein.Niobium_Vein,
            Vein.Magnetite_Vein,
            SmallOre.Makemake_SmallOre);
        ItemStack[][] Fake_T7_Makemake_Ore_Split = addSplitAggregateArray(Fake_T7_Makemake_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T7_Makemake_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_MM", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T7);
        }

        // T7 - Pluto - Pl
        ItemStack[] Fake_T7_Pluto_Ore = addCompressAggregateArray(
            Vein.Tungstate_Vein,
            Vein.Diamond_Vein,
            Vein.Molybdenum_Vein,
            Vein.Osmium_Vein,
            Vein.Tungsten_Vein,
            Vein.Black_Plutonium_Vein,
            Vein.Ilmenite_Vein,
            Vein.Palladium_Vein,
            Vein.Thorium_Vein,
            Vein.Bauxite_Vein,
            Vein.Neutronium_Vein,
            Vein.Gold_Vein,
            Vein.Iron_Vein,
            Vein.Beryllium_Vein,
            Vein.Naquadah_Vein,
            SmallOre.Pluto_SmallOre);
        ItemStack[][] Fake_T7_Pluto_Ore_Split = addSplitAggregateArray(Fake_T7_Pluto_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T7_Pluto_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Pl", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T7);
        }
    }

    public static void addFakeVoidOreRecipes_T8() {
        // T8 - BarnardC - BC
        ItemStack[] Fake_T8_BarnardC_Ore = addCompressAggregateArray(
            Vein.Oilsands_Vein,
            Vein.Osmium_Vein,
            Vein.Tungsten_Vein,
            Vein.Samarium_Vein,
            Vein.Mica_Vein,
            Vein.Black_Plutonium_Vein,
            Vein.Arsenic_Vein,
            Vein.Lignite_Coal_Vein,
            Vein.Basaltic_Mineral_Sand_Vein,
            Vein.Salt_Vein);
        ItemStack[][] Fake_T8_BarnardC_Ore_Split = addSplitAggregateArray(Fake_T8_BarnardC_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_BarnardC_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BC", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T8);
        }

        // T8 - BarnardE - BE
        ItemStack[] Fake_T8_BarnardE_Ore = addCompressAggregateArray(
            Vein.Uranium238_Vein,
            Vein.Molybdenum_Vein,
            Vein.Olivine_Vein,
            Vein.Tungsten_Vein,
            Vein.Manganese_Vein,
            Vein.Infused_Gold_Vein,
            Vein.Rare_Earth_Vein,
            Vein.Thorium_Vein,
            Vein.Copper_Vein,
            Vein.Neutronium_Vein,
            Vein.Nether_Star_Vein,
            Vein.Naquadah_Vein,
            Vein.Magnetite_Vein,
            SmallOre.BarnardE_SmallOre);
        ItemStack[][] Fake_T8_BarnardE_Ore_Split = addSplitAggregateArray(Fake_T8_BarnardE_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_BarnardE_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BE", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T8);
        }

        // T8 - BarnardF - BF
        ItemStack[] Fake_T8_BarnardF_Ore = addCompressAggregateArray(
            Vein.Diamond_Vein,
            Vein.Tungsten_Vein,
            Vein.Manganese_Vein,
            Vein.Pitchblende_Vein,
            Vein.Redstone_Vein,
            Vein.Monazite_Vein,
            Vein.Rare_Earth_Vein,
            Vein.Thorium_Vein,
            Vein.Copper_Vein,
            Vein.Vanadium_Vein,
            Vein.Neutronium_Vein,
            Vein.Gold_Vein,
            Vein.Beryllium_Vein,
            Vein.Red_Garnet_Vein,
            Vein.Naquadah_Vein,
            Vein.Niobium_Vein,
            SmallOre.BarnardF_SmallOre);
        ItemStack[][] Fake_T8_BarnardF_Ore_Split = addSplitAggregateArray(Fake_T8_BarnardF_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_BarnardF_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BF", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T8);
        }

        // T8 - α Centauri Bb - CB
        ItemStack[] Fake_T8_Centauri_Ore = addCompressAggregateArray(
            Vein.Sulfur_Vein,
            Vein.Manganese_Vein,
            Vein.Samarium_Vein,
            Vein.Pitchblende_Vein,
            Vein.Quartz_Vein,
            Vein.Redstone_Vein,
            Vein.Black_Plutonium_Vein,
            Vein.Rare_Earth_Vein,
            Vein.Beryllium_Vein,
            Vein.Electrotine_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Tin_Vein,
            Vein.Nether_Quartz_Vein);
        ItemStack[][] Fake_T8_Centauri_Ore_Split = addSplitAggregateArray(Fake_T8_Centauri_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_Centauri_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_CB", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T8);
        }

        // T8 - TCetiE - TE
        ItemStack[] Fake_T8_TCetiE_Ore = addCompressAggregateArray(
            Vein.Oilsands_Vein,
            Vein.Magnesite_Vein,
            Vein.Quartz_Vein,
            Vein.Black_Plutonium_Vein,
            Vein.Ilmenite_Vein,
            Vein.Bauxite_Vein,
            Vein.Gold_Vein,
            Vein.Kaolinite_Vein,
            Vein.Nether_Star_Vein,
            Vein.Apatite_Vein,
            Vein.Chrome_Vein,
            Vein.Magnetite_Vein,
            Vein.Salt_Vein,
            Vein.Cassiterite_Vein,
            SmallOre.TCetiE_SmallOre);
        ItemStack[][] Fake_T8_TCetiE_Ore_Split = addSplitAggregateArray(Fake_T8_TCetiE_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_TCetiE_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_TE", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T8);
        }

        // T8 - VegaB - VB
        ItemStack[] Fake_T8_VegaB_Ore = addCompressAggregateArray(
            Vein.Tungstate_Vein,
            Vein.Lapis_Vein,
            Vein.Pitchblende_Vein,
            Vein.Redstone_Vein,
            Vein.Infused_Gold_Vein,
            Vein.Rare_Earth_Vein,
            Vein.Thorium_Vein,
            Vein.Arsenic_Vein,
            Vein.Vanadium_Vein,
            Vein.Neutronium_Vein,
            Vein.Gold_Vein,
            Vein.Nether_Star_Vein,
            Vein.Red_Garnet_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Galena_Vein,
            Vein.Naquadah_Vein,
            Vein.Niobium_Vein,
            SmallOre.VegaB_SmallOre);
        ItemStack[][] Fake_T8_VegaB_Ore_Split = addSplitAggregateArray(Fake_T8_VegaB_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_VegaB_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_VB", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T8);
        }
    }

    public static void addFakeVoidOreRecipes_T9() {
        // T9 - Anubis - An
        ItemStack[] Fake_T9_Anubis_Ore = addCompressAggregateArray(
            Vein.Sulfur_Vein,
            Vein.Infinity_Catalyst_Vein,
            Vein.Olivine_Vein,
            Vein.Desh_Vein,
            Vein.Mica_Vein,
            Vein.Cryolite_Vein,
            Vein.Dolomite_Vein,
            Vein.Callisto_Ice_Vein,
            Vein.Soapstone_Vein,
            Vein.Mytryl_Vein,
            Vein.Rutile_Vein,
            Vein.Basaltic_Mineral_Sand_Vein,
            SmallOre.Anubis_SmallOre);
        ItemStack[][] Fake_T9_Anubis_Ore_Split = addSplitAggregateArray(Fake_T9_Anubis_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_Anubis_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_An", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T9);
        }

        // T9 - Horus - Ho
        ItemStack[] Fake_T9_Horus_Ore = addCompressAggregateArray(
            Vein.Magnesite_Vein,
            Vein.Certus_Quartz_Vein,
            Vein.Quartz_Vein,
            Vein.Draconium_Vein,
            Vein.Sapphire_Vein,
            Vein.Black_Plutonium_Vein,
            Vein.Cosmic_Neutronium_Vein,
            Vein.Mytryl_Vein,
            Vein.Nether_Star_Vein,
            Vein.Red_Garnet_Vein,
            Vein.Oriharukon_Vein,
            Vein.Quantium_Vein,
            Vein.Ledox_Vein,
            SmallOre.Horus_SmallOre);
        ItemStack[][] Fake_T9_Horus_Ore_Split = addSplitAggregateArray(Fake_T9_Horus_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_Horus_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ho", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T9);
        }

        // T9 - Maahes - Mh
        ItemStack[] Fake_T9_Maahes_Ore = addCompressAggregateArray(
            Vein.Naquadria_Vein,
            Vein.Cryolite_Vein,
            Vein.Callisto_Ice_Vein,
            Vein.Vanadium_Vein,
            Vein.Soapstone_Vein,
            Vein.Neutronium_Vein,
            Vein.Platinum_Vein,
            Vein.Naquadria_Vein,
            Vein.Basaltic_Mineral_Sand_Vein,
            Vein.Quantium_Vein,
            Vein.Chrome_Vein);
        ItemStack[][] Fake_T9_Maahes_Ore_Split = addSplitAggregateArray(Fake_T9_Maahes_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_Maahes_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mh", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T9);
        }

        // T9 - MehenBelt - MB
        ItemStack[] Fake_T9_MehenBelt_Ore = addCompressAggregateArray(
            Vein.Uranium238_Vein,
            Vein.Lapis_Vein,
            Vein.Awakened_Draconium_Vein,
            Vein.Olivine_Vein,
            Vein.Osmium_Vein,
            Vein.Nickel_Vein,
            Vein.Ilmenite_Vein,
            Vein.Palladium_Vein,
            Vein.Neutronium_Vein,
            Vein.Platinum_Vein,
            Vein.Iridium_Vein,
            Vein.Cassiterite_Vein,
            SmallOre.MehenBelt_SmallOre);
        ItemStack[][] Fake_T9_MehenBelt_Ore_Split = addSplitAggregateArray(Fake_T9_MehenBelt_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_MehenBelt_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_MB", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T9);
        }

        // T9 - Neper - Np
        ItemStack[] Fake_T9_Neper_Ore = addCompressAggregateArray(
            Vein.Tungsten_Vein,
            Vein.Terra_Aer_Vein,
            Vein.Certus_Quartz_Vein,
            Vein.Quartzite_Vein,
            Vein.Dilithium_Vein,
            Vein.Mica_Vein,
            Vein.Dolomite_Vein,
            Vein.Arsenic_Vein,
            Vein.Perditio_Ordo_Vein,
            Vein.Kaolinite_Vein,
            Vein.Aqua_Ignis_Amber_Vein,
            Vein.Nether_Quartz_Vein);
        ItemStack[][] Fake_T9_Neper_Ore_Split = addSplitAggregateArray(Fake_T9_Neper_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_Neper_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Np", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T9);
        }

        // T9 - Seth - Se
        ItemStack[] Fake_T9_Seth_Ore = addCompressAggregateArray(
            Vein.Osmium_Vein,
            Vein.Samarium_Vein,
            Vein.Draconium_Vein,
            Vein.Monazite_Vein,
            Vein.Palladium_Vein,
            Vein.Bauxite_Vein,
            Vein.Gold_Vein,
            Vein.Raw_Tengam_Vein,
            Vein.Magnetite_Vein,
            Vein.Iridium_Vein,
            Vein.Cassiterite_Vein,
            SmallOre.Seth_SmallOre);
        ItemStack[][] Fake_T9_Seth_Ore_Split = addSplitAggregateArray(Fake_T9_Seth_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_Seth_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Se", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T9);
        }
    }

    public static void addFakeVoidOreRecipes_T10() {
        // T10 - DeepDark - DD
        ItemStack[][] Fake_T10_DeepDark_Ore_Split = addSplitAggregateArray(Vein.T10_Ore, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T10_DeepDark_Ore_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Ore Mode")
                .eut(0)
                .addTo(addFakeVoidOreRecipes_T10);
        }
    }
}
