package Recipes.SingularityRecipes_VoidGem;

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
import util.RecipesFrontend.OneToManyItemsFrontend_Small;

public class FakeSingularityGemRecipes {

    public static int NEI_ItemOutput_Size = 27;

    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes_T0 = RecipeMapBuilder
        .of("Singularity of T0 Gem")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(165))
        .frontend(OneToManyItemsFrontend_Small::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes_T1 = RecipeMapBuilder
        .of("Singularity of T1 Gem")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(165))
        .frontend(OneToManyItemsFrontend_Small::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes_T2 = RecipeMapBuilder
        .of("Singularity of T2 Gem")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(165))
        .frontend(OneToManyItemsFrontend_Small::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes_T3 = RecipeMapBuilder
        .of("Singularity of T3 Gem")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(165))
        .frontend(OneToManyItemsFrontend_Small::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes_T4 = RecipeMapBuilder
        .of("Singularity of T4 Gem")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(165))
        .frontend(OneToManyItemsFrontend_Small::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes_T5 = RecipeMapBuilder
        .of("Singularity of T5 Gem")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(165))
        .frontend(OneToManyItemsFrontend_Small::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes_T6 = RecipeMapBuilder
        .of("Singularity of T6 Gem")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(165))
        .frontend(OneToManyItemsFrontend_Small::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes_T7 = RecipeMapBuilder
        .of("Singularity of T7 Gem")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(165))
        .frontend(OneToManyItemsFrontend_Small::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes_T8 = RecipeMapBuilder
        .of("Singularity of T8 Gem")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(165))
        .frontend(OneToManyItemsFrontend_Small::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes_T9 = RecipeMapBuilder
        .of("Singularity of T9 Gem")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(165))
        .frontend(OneToManyItemsFrontend_Small::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes_T10 = RecipeMapBuilder
        .of("Singularity of T10 Gem")
        .maxIO(1, 90, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static void addFakeVoidGemRecipes_T0() {
        // T0 - Overworld - Ow
        ItemStack[] Fake_T0_Overworld_Gem = addCompressAggregateArray(
            Vein_Gem.Diamond_Vein,
            Vein_Gem.Lapis_Vein,
            Vein_Gem.Coal_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Dolomite_Vein,
            Vein_Gem.Iron_Vein,
            Vein_Gem.Lignite_Coal_Vein,
            Vein_Gem.Apatite_Vein,
            Vein_Gem.Tin_Vein,
            Vein_Gem.Salt_Vein,
            SmallOre_Gem.Diamond_SmallOre,
            SmallOre_Gem.Lapis_SmallOre,
            SmallOre_Gem.Coal_SmallOre);
        ItemStack[][] Fake_T0_Overworld_Gem_Split = addSplitAggregateArray(Fake_T0_Overworld_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T0_Overworld_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ow", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T0);
        }

        // T0 - Nether - Ne
        ItemStack[] Fake_T0_Nether_Gem = addCompressAggregateArray(
            Vein_Gem.Quartzite_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Iron_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Nether_Quartz_Vein,
            SmallOre_Gem.Certus_Quartz_SmallOre,
            SmallOre_Gem.Nether_Quartz_SmallOre);
        ItemStack[][] Fake_T0_Nether_Gem_Split = addSplitAggregateArray(Fake_T0_Nether_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T0_Nether_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ne", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T0);
        }

        // T0 - Twilight - TF
        ItemStack[] Fake_T0_Twilight_Gem = addCompressAggregateArray(
            Vein_Gem.Diamond_Vein,
            Vein_Gem.Lapis_Vein,
            Vein_Gem.Olivine_Vein,
            Vein_Gem.Terra_Aer_Vein,
            Vein_Gem.Coal_Vein,
            Vein_Gem.Sapphire_Vein,
            Vein_Gem.Perditio_Ordo_Vein,
            Vein_Gem.Iron_Vein,
            Vein_Gem.Apatite_Vein,
            Vein_Gem.Salt_Vein,
            Vein_Gem.Aqua_Ignis_Amber_Vein,
            SmallOre_Gem.Amethyst_SmallOre,
            SmallOre_Gem.Yellow_Garnet_SmallOre,
            SmallOre_Gem.Tanzanite_SmallOre,
            SmallOre_Gem.Opal_SmallOre,
            SmallOre_Gem.Ruby_SmallOre,
            SmallOre_Gem.Emerald_SmallOre,
            SmallOre_Gem.Amber_SmallOre,
            SmallOre_Gem.Blue_Topaz_SmallOre,
            SmallOre_Gem.Topaz_SmallOre,
            SmallOre_Gem.Red_Garnet_SmallOre,
            SmallOre_Gem.Green_Sapphire_SmallOre,
            SmallOre_Gem.Sapphire_SmallOre,
            SmallOre_Gem.Jasper_SmallOre,
            SmallOre_Gem.Olivine_SmallOre);
        ItemStack[][] Fake_T0_Twilight_Gem_Split = addSplitAggregateArray(Fake_T0_Twilight_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T0_Twilight_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_TF", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T0);
        }

        // T0 - TheEnd - ED
        ItemStack[] Fake_T0_TheEnd_Gem = addCompressAggregateArray(Vein_Gem.Beryllium_Vein);
        ItemStack[][] Fake_T0_TheEnd_Gem_Split = addSplitAggregateArray(Fake_T0_TheEnd_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T0_TheEnd_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_ED", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T0);
        }

        // T0 - EndAsteroid - EA
        ItemStack[] Fake_T0_EndAsteroid_Gem = addCompressAggregateArray(
            Vein_Gem.Lapis_Vein,
            Vein_Gem.Olivine_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Platinum_Vein);
        ItemStack[][] Fake_T0_EndAsteroid_Gem_Split = addSplitAggregateArray(
            Fake_T0_EndAsteroid_Gem,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T0_EndAsteroid_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_EA", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T0);
        }
    }

    public static void addFakeVoidGemRecipes_T1() {
        // T1 - Moon - Mo
        ItemStack[] Fake_T1_Moon_Gem = addCompressAggregateArray(
            Vein_Gem.Quartz_Vein,
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Ilmenite_Vein);
        ItemStack[][] Fake_T1_Moon_Gem_Split = addSplitAggregateArray(Fake_T1_Moon_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T1_Moon_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mo", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T1);
        }
    }

    public static void addFakeVoidGemRecipes_T2() {
        // T2 - Deimos - De
        ItemStack[] Fake_T2_Deimos_Gem = addCompressAggregateArray(
            Vein_Gem.Lapis_Vein,
            Vein_Gem.Draconium_Vein,
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Oriharukon_Vein,
            SmallOre_Gem.Diamond_SmallOre);
        ItemStack[][] Fake_T2_Deimos_Gem_Split = addSplitAggregateArray(Fake_T2_Deimos_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T2_Deimos_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_De", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T2);
        }

        // T2 - Mars - Ma
        ItemStack[] Fake_T2_Mars_Gem = addCompressAggregateArray(
            Vein_Gem.Quartz_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Iron_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Salt_Vein);
        ItemStack[][] Fake_T2_Mars_Gem_Split = addSplitAggregateArray(Fake_T2_Mars_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T2_Mars_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ma", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T2);
        }

        // T2 - Phobos - Ph
        ItemStack[] Fake_T2_Phobos_Gem = addCompressAggregateArray(
            Vein_Gem.Diamond_Vein,
            Vein_Gem.Quartz_Vein,
            Vein_Gem.Draconium_Vein,
            Vein_Gem.Oriharukon_Vein,
            SmallOre_Gem.Lapis_SmallOre);
        ItemStack[][] Fake_T2_Phobos_Gem_Split = addSplitAggregateArray(Fake_T2_Phobos_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T2_Phobos_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ph", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T2);
        }
    }

    public static void addFakeVoidGemRecipes_T3() {
        // T3 - Asteroids - As
        ItemStack[] Fake_T3_Asteroids_Gem = addCompressAggregateArray(
            Vein_Gem.Ilmenite_Vein,
            SmallOre_Gem.Diamond_SmallOre);
        ItemStack[][] Fake_T3_Asteroids_Gem_Split = addSplitAggregateArray(Fake_T3_Asteroids_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Asteroids_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_As", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T3);
        }

        // T3 - Callisto - Ca
        ItemStack[] Fake_T3_Callisto_Gem = addCompressAggregateArray(
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Callisto_Ice_Vein,
            Vein_Gem.Iron_Vein,
            SmallOre_Gem.Diamond_SmallOre);
        ItemStack[][] Fake_T3_Callisto_Gem_Split = addSplitAggregateArray(Fake_T3_Callisto_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Callisto_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ca", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T3);
        }

        // T3 - Ceres - Ce
        ItemStack[] Fake_T3_Ceres_Gem = addCompressAggregateArray(
            Vein_Gem.Lapis_Vein,
            Vein_Gem.Olivine_Vein,
            Vein_Gem.Iron_Vein,
            Vein_Gem.Beryllium_Vein,
            SmallOre_Gem.Diamond_SmallOre);
        ItemStack[][] Fake_T3_Ceres_Gem_Split = addSplitAggregateArray(Fake_T3_Ceres_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Ceres_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ce", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T3);
        }

        // T3 - Europa - Eu
        ItemStack[] Fake_T3_Europa_Gem = addCompressAggregateArray(
            Vein_Gem.Magnesite_Vein,
            Vein_Gem.Ledox_Vein,
            Vein_Gem.Tin_Vein);
        ItemStack[][] Fake_T3_Europa_Gem_Split = addSplitAggregateArray(Fake_T3_Europa_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Europa_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Eu", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T3);
        }

        // T3 - Ganymede - Ga
        ItemStack[] Fake_T3_Ganymede_Gem = addCompressAggregateArray(
            Vein_Gem.Diamond_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Iron_Vein,
            SmallOre_Gem.Lapis_SmallOre);
        ItemStack[][] Fake_T3_Ganymede_Gem_Split = addSplitAggregateArray(Fake_T3_Ganymede_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Ganymede_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ga", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T3);
        }

        // T3 - Ross128b - Rb
        ItemStack[] Fake_T3_Ross128b_Gem = addCompressAggregateArray(
            Vein_Gem.Bismutite_Bismuthinite_Vein,
            Vein_Gem.Olenite_FluorBuergerite_ChromoAluminoPovondraite_VanadioOxyDravit_Vein,
            Vein_Gem.Thorianite_Vein,
            Vein_Gem.Fayalite_GreenFuchsite_RedZircon_RedFuchsite_Vein,
            Vein_Gem.Forsterite_Fayalite_OrangeDescloizite_RedDescloizite_Vein);
        ItemStack[][] Fake_T3_Ross128b_Gem_Split = addSplitAggregateArray(Fake_T3_Ross128b_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T3_Ross128b_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Rb", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T3);
        }
    }

    public static void addFakeVoidGemRecipes_T4() {
        // T4 - Io - Io
        ItemStack[] Fake_T4_Io_Gem = addCompressAggregateArray(
            Vein_Gem.Quartz_Vein,
            Vein_Gem.Pyrolusite_Vein,
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Mytryl_Vein,
            Vein_Gem.Iridium_Vein,
            SmallOre_Gem.Firestone_SmallOre,
            SmallOre_Gem.Lapis_SmallOre);
        ItemStack[][] Fake_T4_Io_Gem_Split = addSplitAggregateArray(Fake_T4_Io_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T4_Io_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Io", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T4);
        }

        // T4 - Mercury - Me
        ItemStack[] Fake_T4_Mercury_Gem = addCompressAggregateArray(
            Vein_Gem.Diamond_Vein,
            Vein_Gem.Draconium_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Iron_Vein,
            Vein_Gem.Iridium_Vein);
        ItemStack[][] Fake_T4_Mercury_Gem_Split = addSplitAggregateArray(Fake_T4_Mercury_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T4_Mercury_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Me", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T4);
        }

        // T4 - Venus - Ve
        ItemStack[] Fake_T4_Venus_Gem = addCompressAggregateArray(
            Vein_Gem.Quartz_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Quantium_Vein,
            Vein_Gem.Iridium_Vein,
            SmallOre_Gem.Diamond_SmallOre,
            SmallOre_Gem.Firestone_SmallOre);
        ItemStack[][] Fake_T4_Venus_Gem_Split = addSplitAggregateArray(Fake_T4_Venus_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T4_Venus_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ve", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T4);
        }
    }

    public static void addFakeVoidGemRecipes_T5() {
        // T5 - Enceladus - En
        ItemStack[] Fake_T5_Enceladus_Gem = addCompressAggregateArray(
            Vein_Gem.Lapis_Vein,
            Vein_Gem.Osmium_Vein,
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Ledox_Vein,
            Vein_Gem.Iridium_Vein,
            SmallOre_Gem.Lapis_SmallOre);
        ItemStack[][] Fake_T5_Enceladus_Gem_Split = addSplitAggregateArray(Fake_T5_Enceladus_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T5_Enceladus_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_En", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T5);
        }

        // T5 - Miranda - Mi
        ItemStack[] Fake_T5_Miranda_Gem = addCompressAggregateArray(
            Vein_Gem.Diamond_Vein,
            Vein_Gem.Osmium_Vein,
            Vein_Gem.Draconium_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Pyrolusite_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Iridium_Vein);
        ItemStack[][] Fake_T5_Miranda_Gem_Split = addSplitAggregateArray(Fake_T5_Miranda_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T5_Miranda_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mi", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T5);
        }

        // T5 - Oberon - Ob
        ItemStack[] Fake_T5_Oberon_Gem = addCompressAggregateArray(
            Vein_Gem.Osmium_Vein,
            Vein_Gem.Iron_Vein,
            SmallOre_Gem.Diamond_SmallOre,
            SmallOre_Gem.Lapis_SmallOre);
        ItemStack[][] Fake_T5_Oberon_Gem_Split = addSplitAggregateArray(Fake_T5_Oberon_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T5_Oberon_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ob", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T5);
        }

        // T5 - Titan - Ti
        ItemStack[] Fake_T5_Titan_Gem = addCompressAggregateArray(
            Vein_Gem.Diamond_Vein,
            Vein_Gem.Osmium_Vein,
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Iridium_Vein,
            SmallOre_Gem.Diamond_SmallOre);
        ItemStack[][] Fake_T5_Titan_Gem_Split = addSplitAggregateArray(Fake_T5_Titan_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T5_Titan_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ti", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T5);
        }

        // T5 - Ross128ba - Ra
        ItemStack[] Fake_T5_Ross128ba_Gem = addCompressAggregateArray(
            Vein_Gem.Olenite_FluorBuergerite_ChromoAluminoPovondraite_VanadioOxyDravit_Vein,
            Vein_Gem.Hedenbergite_Fayalite_OrangeDescloizite_RedDescloizite_Vein,
            Vein_Gem.Prasiolite_Hedenbergite_Vein,
            Vein_Gem.BArTiMaEuSNeK_Vein,
            Vein_Gem.Tiberium_Vein,
            Vein_Gem.Fluorspar_Vein);
        ItemStack[][] Fake_T5_Ross128ba_Gem_Split = addSplitAggregateArray(Fake_T5_Ross128ba_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T5_Ross128ba_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ra", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T5);
        }
    }

    public static void addFakeVoidGemRecipes_T6() {
        // T6 - Proteus - Pr
        ItemStack[] Fake_T6_Proteus_Gem = addCompressAggregateArray(
            Vein_Gem.Diamond_Vein,
            Vein_Gem.Osmium_Vein,
            Vein_Gem.Quartz_Vein,
            Vein_Gem.Ilmenite_Vein);
        ItemStack[][] Fake_T6_Proteus_Gem_Split = addSplitAggregateArray(Fake_T6_Proteus_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T6_Proteus_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Pr", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T6);
        }

        // T6 - Triton - Tr
        ItemStack[] Fake_T6_Triton_Gem = addCompressAggregateArray(
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Iridium_Vein,
            SmallOre_Gem.Diamond_SmallOre);
        ItemStack[][] Fake_T6_Triton_Gem_Split = addSplitAggregateArray(Fake_T6_Triton_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T6_Triton_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Tr", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T6);
        }
    }

    public static void addFakeVoidGemRecipes_T7() {
        // T7 - Haumea - Ha
        ItemStack[] Fake_T7_Haumea_Gem = addCompressAggregateArray(
            Vein_Gem.Olivine_Vein,
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Nether_Star_Vein,
            Vein_Gem.Beryllium_Vein);
        ItemStack[][] Fake_T7_Haumea_Gem_Split = addSplitAggregateArray(Fake_T7_Haumea_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T7_Haumea_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ha", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T7);
        }

        // T7 - Makemake - MM
        ItemStack[] Fake_T7_Makemake_Gem = addCompressAggregateArray(
            Vein_Gem.Olivine_Vein,
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Black_Plutonium_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Red_Garnet_Vein);
        ItemStack[][] Fake_T7_Makemake_Gem_Split = addSplitAggregateArray(Fake_T7_Makemake_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T7_Makemake_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_MM", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T7);
        }

        // T7 - Pluto - Pl
        ItemStack[] Fake_T7_Pluto_Gem = addCompressAggregateArray(
            Vein_Gem.Diamond_Vein,
            Vein_Gem.Osmium_Vein,
            Vein_Gem.Black_Plutonium_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Iron_Vein,
            Vein_Gem.Beryllium_Vein);
        ItemStack[][] Fake_T7_Pluto_Gem_Split = addSplitAggregateArray(Fake_T7_Pluto_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T7_Pluto_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Pl", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T7);
        }
    }

    public static void addFakeVoidGemRecipes_T8() {
        // T8 - BarnardC - BC
        ItemStack[] Fake_T8_BarnardC_Gem = addCompressAggregateArray(
            Vein_Gem.Osmium_Vein,
            Vein_Gem.Samarium_Vein,
            Vein_Gem.Black_Plutonium_Vein,
            Vein_Gem.Lignite_Coal_Vein,
            Vein_Gem.Salt_Vein);
        ItemStack[][] Fake_T8_BarnardC_Gem_Split = addSplitAggregateArray(Fake_T8_BarnardC_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_BarnardC_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BC", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T8);
        }

        // T8 - BarnardE - BE
        ItemStack[] Fake_T8_BarnardE_Gem = addCompressAggregateArray(Vein_Gem.Olivine_Vein, Vein_Gem.Nether_Star_Vein);
        ItemStack[][] Fake_T8_BarnardE_Gem_Split = addSplitAggregateArray(Fake_T8_BarnardE_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_BarnardE_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BE", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T8);
        }

        // T8 - BarnardF - BF
        ItemStack[] Fake_T8_BarnardF_Gem = addCompressAggregateArray(
            Vein_Gem.Diamond_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Red_Garnet_Vein);
        ItemStack[][] Fake_T8_BarnardF_Gem_Split = addSplitAggregateArray(Fake_T8_BarnardF_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_BarnardF_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BF", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T8);
        }

        // T8 - α Centauri Bb - CB
        ItemStack[] Fake_T8_Centauri_Gem = addCompressAggregateArray(
            Vein_Gem.Samarium_Vein,
            Vein_Gem.Quartz_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Black_Plutonium_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Tin_Vein,
            Vein_Gem.Nether_Quartz_Vein);
        ItemStack[][] Fake_T8_Centauri_Gem_Split = addSplitAggregateArray(Fake_T8_Centauri_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_Centauri_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_CB", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T8);
        }

        // T8 - TCetiE - TE
        ItemStack[] Fake_T8_TCetiE_Gem = addCompressAggregateArray(
            Vein_Gem.Magnesite_Vein,
            Vein_Gem.Quartz_Vein,
            Vein_Gem.Black_Plutonium_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Nether_Star_Vein,
            Vein_Gem.Apatite_Vein,
            Vein_Gem.Salt_Vein,
            SmallOre_Gem.Lapis_SmallOre);
        ItemStack[][] Fake_T8_TCetiE_Gem_Split = addSplitAggregateArray(Fake_T8_TCetiE_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_TCetiE_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_TE", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T8);
        }

        // T8 - VegaB - VB
        ItemStack[] Fake_T8_VegaB_Gem = addCompressAggregateArray(
            Vein_Gem.Lapis_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Nether_Star_Vein,
            Vein_Gem.Red_Garnet_Vein,
            SmallOre_Gem.Diamond_SmallOre);
        ItemStack[][] Fake_T8_VegaB_Gem_Split = addSplitAggregateArray(Fake_T8_VegaB_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T8_VegaB_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_VB", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T8);
        }
    }

    public static void addFakeVoidGemRecipes_T9() {
        // T9 - Anubis - An
        ItemStack[] Fake_T9_Anubis_Gem = addCompressAggregateArray(
            Vein_Gem.Olivine_Vein,
            Vein_Gem.Dolomite_Vein,
            Vein_Gem.Callisto_Ice_Vein,
            Vein_Gem.Mytryl_Vein);
        ItemStack[][] Fake_T9_Anubis_Gem_Split = addSplitAggregateArray(Fake_T9_Anubis_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_Anubis_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_An", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T9);
        }

        // T9 - Horus - Ho
        ItemStack[] Fake_T9_Horus_Gem = addCompressAggregateArray(
            Vein_Gem.Magnesite_Vein,
            Vein_Gem.Certus_Quartz_Vein,
            Vein_Gem.Quartz_Vein,
            Vein_Gem.Draconium_Vein,
            Vein_Gem.Sapphire_Vein,
            Vein_Gem.Black_Plutonium_Vein,
            Vein_Gem.Mytryl_Vein,
            Vein_Gem.Nether_Star_Vein,
            Vein_Gem.Red_Garnet_Vein,
            Vein_Gem.Oriharukon_Vein,
            Vein_Gem.Quantium_Vein,
            Vein_Gem.Ledox_Vein,
            SmallOre_Gem.Amethyst_SmallOre,
            SmallOre_Gem.Red_Garnet_SmallOre,
            SmallOre_Gem.Yellow_Garnet_SmallOre,
            SmallOre_Gem.Tanzanite_SmallOre,
            SmallOre_Gem.Opal_SmallOre,
            SmallOre_Gem.Charged_Certus_Quartz_SmallOre,
            SmallOre_Gem.Ruby_SmallOre,
            SmallOre_Gem.Emerald_SmallOre,
            SmallOre_Gem.Blue_Topaz_SmallOre,
            SmallOre_Gem.Topaz_SmallOre,
            SmallOre_Gem.Certus_Quartz_SmallOre,
            SmallOre_Gem.Green_Sapphire_SmallOre,
            SmallOre_Gem.Sapphire_SmallOre,
            SmallOre_Gem.Jasper_SmallOre,
            SmallOre_Gem.Olivine_SmallOre);
        ItemStack[][] Fake_T9_Horus_Gem_Split = addSplitAggregateArray(Fake_T9_Horus_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_Horus_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ho", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T9);
        }

        // T9 - Maahes - Mh
        ItemStack[] Fake_T9_Maahes_Gem = addCompressAggregateArray(
            Vein_Gem.Callisto_Ice_Vein,
            Vein_Gem.Platinum_Vein,
            Vein_Gem.Quantium_Vein);
        ItemStack[][] Fake_T9_Maahes_Gem_Split = addSplitAggregateArray(Fake_T9_Maahes_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_Maahes_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mh", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T9);
        }

        // T9 - MehenBelt - MB
        ItemStack[] Fake_T9_MehenBelt_Gem = addCompressAggregateArray(
            Vein_Gem.Lapis_Vein,
            Vein_Gem.Awakened_Draconium_Vein,
            Vein_Gem.Olivine_Vein,
            Vein_Gem.Osmium_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Platinum_Vein,
            Vein_Gem.Iridium_Vein,
            SmallOre_Gem.Lapis_SmallOre,
            SmallOre_Gem.Olivine_SmallOre);
        ItemStack[][] Fake_T9_MehenBelt_Gem_Split = addSplitAggregateArray(Fake_T9_MehenBelt_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_MehenBelt_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_MB", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T9);
        }

        // T9 - Neper - Np
        ItemStack[] Fake_T9_Neper_Gem = addCompressAggregateArray(
            Vein_Gem.Terra_Aer_Vein,
            Vein_Gem.Certus_Quartz_Vein,
            Vein_Gem.Quartzite_Vein,
            Vein_Gem.Dilithium_Vein,
            Vein_Gem.Dolomite_Vein,
            Vein_Gem.Perditio_Ordo_Vein,
            Vein_Gem.Aqua_Ignis_Amber_Vein,
            Vein_Gem.Nether_Quartz_Vein);
        ItemStack[][] Fake_T9_Neper_Gem_Split = addSplitAggregateArray(Fake_T9_Neper_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_Neper_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Np", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T9);
        }

        // T9 - Seth - Se
        ItemStack[] Fake_T9_Seth_Gem = addCompressAggregateArray(
            Vein_Gem.Osmium_Vein,
            Vein_Gem.Samarium_Vein,
            Vein_Gem.Draconium_Vein,
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Iridium_Vein);
        ItemStack[][] Fake_T9_Seth_Gem_Split = addSplitAggregateArray(Fake_T9_Seth_Gem, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_T9_Seth_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Se", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T9);
        }
    }

    public static void addFakeVoidGemRecipes_T10() {
        // T10 - DeepDark - DD
        ItemStack[][] Fake_T10_DeepDark_Gem_Split = addSplitAggregateArray(Vein_Gem.T10_Gem, 90);
        for (ItemStack[] tempItemStacks : Fake_T10_DeepDark_Gem_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Gem Mode")
                .eut(0)
                .addTo(addFakeVoidGemRecipes_T10);
        }
    }
}
