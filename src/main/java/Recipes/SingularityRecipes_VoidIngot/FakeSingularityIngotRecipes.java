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

public class FakeSingularityIngotRecipes {

    public static int NEI_ItemOutput_Size = 90;

    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes_T0 = RecipeMapBuilder
        .of("Singularity of T0 Ingot")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes_T1 = RecipeMapBuilder
        .of("Singularity of T1 Ingot")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes_T2 = RecipeMapBuilder
        .of("Singularity of T2 Ingot")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes_T3 = RecipeMapBuilder
        .of("Singularity of T3 Ingot")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes_T4 = RecipeMapBuilder
        .of("Singularity of T4 Ingot")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes_T5 = RecipeMapBuilder
        .of("Singularity of T5 Ingot")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes_T6 = RecipeMapBuilder
        .of("Singularity of T6 Ingot")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes_T7 = RecipeMapBuilder
        .of("Singularity of T7 Ingot")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes_T8 = RecipeMapBuilder
        .of("Singularity of T8 Ingot")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes_T9 = RecipeMapBuilder
        .of("Singularity of T9 Ingot")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes_T10 = RecipeMapBuilder
        .of("Singularity of T10 Ingot")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static void addFakeVoidIngotRecipes_T0() {
        // T0 - Overworld - Ow
        ItemStack[] Fake_T0_Overworld_Ingot = addCompressAggregateArray(
            Vein_Ingot.Diamond_Vein,
            Vein_Ingot.Lapis_Vein,
            Vein_Ingot.Vermiculite_Vein,
            // Oilsands Vein
            Vein_Ingot.Coal_Vein,
            Vein_Ingot.Manganese_Vein,
            Vein_Ingot.Redstone_Vein,
            Vein_Ingot.Mica_Vein,
            Vein_Ingot.Dolomite_Vein,
            Vein_Ingot.Copper_Vein,
            Vein_Ingot.Soapstone_Vein,
            Vein_Ingot.Gold_Vein,
            Vein_Ingot.Kaolinite_Vein,
            Vein_Ingot.Iron_Vein,
            Vein_Ingot.Lignite_Coal_Vein,
            Vein_Ingot.Apatite_Vein,
            Vein_Ingot.Basaltic_Mineral_Sand_Vein,
            Vein_Ingot.Magnetite_Vein,
            Vein_Ingot.Tin_Vein,
            Vein_Ingot.Salt_Vein,
            Vein_Ingot.Cassiterite_Vein,
            SmallOre_Ingot.Iron_SmallOre,
            SmallOre_Ingot.Copper_SmallOre,
            SmallOre_Ingot.Silver_SmallOre,
            SmallOre_Ingot.Tin_SmallOre,
            SmallOre_Ingot.Redstone_SmallOre,
            SmallOre_Ingot.Gold_SmallOre,
            // Diamond Ore
            SmallOre_Ingot.Lapis_SmallOre,
            SmallOre_Ingot.Coal_SmallOre,
            SmallOre_Ingot.Zinc_SmallOre,
            SmallOre_Ingot.Nickel_SmallOre);
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
            Vein_Ingot.Sulfur_Vein,
            Vein_Ingot.Molybdenum_Vein,
            Vein_Ingot.Manganese_Vein,
            Vein_Ingot.Quartzite_Vein,
            Vein_Ingot.Redstone_Vein,
            Vein_Ingot.Copper_Vein,
            Vein_Ingot.Iron_Vein,
            Vein_Ingot.Beryllium_Vein,
            Vein_Ingot.Electrotine_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Nether_Quartz_Vein,
            SmallOre_Ingot.Saltpeter_SmallOre,
            SmallOre_Ingot.Iron_SmallOre,
            SmallOre_Ingot.Copper_SmallOre,
            SmallOre_Ingot.Silver_SmallOre,
            SmallOre_Ingot.Tin_SmallOre,
            SmallOre_Ingot.Lead_SmallOre,
            SmallOre_Ingot.Redstone_SmallOre,
            SmallOre_Ingot.Certus_Quartz_SmallOre,
            // Sulfur Ore
            SmallOre_Ingot.Nether_Quartz_SmallOre,
            SmallOre_Ingot.Bismuth_SmallOre,
            SmallOre_Ingot.Zinc_SmallOre,
            SmallOre_Ingot.Realgar_SmallOre);
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
            Vein_Ingot.Diamond_Vein,
            Vein_Ingot.Lapis_Vein,
            Vein_Ingot.Molybdenum_Vein,
            Vein_Ingot.Olivine_Vein,
            // Terra & Aer Vein
            Vein_Ingot.Coal_Vein,
            Vein_Ingot.Sapphire_Vein,
            Vein_Ingot.Cryolite_Vein,
            Vein_Ingot.Nickel_Vein,
            Vein_Ingot.Soapstone_Vein,
            // Perditio & Ordo Vein
            Vein_Ingot.Gold_Vein,
            Vein_Ingot.Iron_Vein,
            Vein_Ingot.Apatite_Vein,
            Vein_Ingot.Magnetite_Vein,
            Vein_Ingot.Salt_Vein,
            Vein_Ingot.Cassiterite_Vein,
            // Aqua, Ignis & Amber Vein
            SmallOre_Ingot.Amethyst_SmallOre,
            SmallOre_Ingot.Yellow_Garnet_SmallOre,
            SmallOre_Ingot.Tanzanite_SmallOre,
            SmallOre_Ingot.Saltpeter_SmallOre,
            SmallOre_Ingot.Spinel_SmallOre,
            SmallOre_Ingot.Opal_SmallOre,
            SmallOre_Ingot.Ruby_SmallOre,
            SmallOre_Ingot.Lead_SmallOre,
            SmallOre_Ingot.Emerald_SmallOre,
            // Amber Ore
            SmallOre_Ingot.Blue_Topaz_SmallOre,
            SmallOre_Ingot.Topaz_SmallOre,
            SmallOre_Ingot.Jade_SmallOre,
            SmallOre_Ingot.Red_Garnet_SmallOre,
            SmallOre_Ingot.Green_Sapphire_SmallOre,
            SmallOre_Ingot.Sapphire_SmallOre,
            SmallOre_Ingot.Jasper_SmallOre,
            SmallOre_Ingot.Olivine_SmallOre);
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
            Vein_Ingot.Molybdenum_Vein,
            Vein_Ingot.Nickel_Vein,
            Vein_Ingot.Copper_Vein,
            Vein_Ingot.Gold_Vein,
            Vein_Ingot.Beryllium_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Cassiterite_Vein,
            SmallOre_Ingot.Iron_SmallOre,
            SmallOre_Ingot.Copper_SmallOre,
            SmallOre_Ingot.Silver_SmallOre,
            SmallOre_Ingot.Tin_SmallOre,
            SmallOre_Ingot.Lead_SmallOre,
            SmallOre_Ingot.Gold_SmallOre,
            SmallOre_Ingot.Zinc_SmallOre,
            SmallOre_Ingot.Nickel_SmallOre);
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
            Vein_Ingot.Tungstate_Vein,
            Vein_Ingot.Lapis_Vein,
            Vein_Ingot.Molybdenum_Vein,
            Vein_Ingot.Olivine_Vein,
            Vein_Ingot.Manganese_Vein,
            Vein_Ingot.Nickel_Vein,
            Vein_Ingot.Copper_Vein,
            Vein_Ingot.Gold_Vein,
            Vein_Ingot.Beryllium_Vein,
            Vein_Ingot.Platinum_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Naquadah_Vein,
            Vein_Ingot.Cassiterite_Vein,
            SmallOre_Ingot.Silver_SmallOre,
            SmallOre_Ingot.Tin_SmallOre,
            SmallOre_Ingot.Lead_SmallOre,
            SmallOre_Ingot.Gold_SmallOre,
            SmallOre_Ingot.Zinc_SmallOre,
            SmallOre_Ingot.Nickel_SmallOre);
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
    }

    public static void addFakeVoidIngotRecipes_T1() {
        // T1 - Moon - Mo
        ItemStack[] Fake_T1_Moon_Ingot = addCompressAggregateArray(
            Vein_Ingot.Molybdenum_Vein,
            Vein_Ingot.Quartz_Vein,
            Vein_Ingot.Monazite_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Copper_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Galena_Vein,
            Vein_Ingot.Cassiterite_Vein,
            SmallOre_Ingot.Meteoric_Iron_SmallOre);
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
            Vein_Ingot.Uranium238_Vein,
            Vein_Ingot.Tungstate_Vein,
            Vein_Ingot.Sulfur_Vein,
            Vein_Ingot.Lapis_Vein,
            Vein_Ingot.Draconium_Vein,
            Vein_Ingot.Monazite_Vein,
            Vein_Ingot.Nickel_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Oriharukon_Vein,
            Vein_Ingot.Magnetite_Vein,
            SmallOre_Ingot.Saltpeter_SmallOre,
            SmallOre_Ingot.Titanium_SmallOre,
            SmallOre_Ingot.Tin_SmallOre,
            SmallOre_Ingot.Lead_SmallOre,
            // Diamond Ore
            SmallOre_Ingot.Draconium_SmallOre,
            SmallOre_Ingot.Chromite_SmallOre,
            SmallOre_Ingot.Tungstate_SmallOre,
            SmallOre_Ingot.Meteoric_Iron_SmallOre,
            SmallOre_Ingot.Desh_SmallOre,
            SmallOre_Ingot.Nickel_SmallOre);
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
            Vein_Ingot.Tungstate_Vein,
            Vein_Ingot.Sulfur_Vein,
            Vein_Ingot.Desh_Vein,
            Vein_Ingot.Pitchblende_Vein,
            Vein_Ingot.Quartz_Vein,
            Vein_Ingot.Redstone_Vein,
            Vein_Ingot.Nickel_Vein,
            Vein_Ingot.Arsenic_Vein,
            Vein_Ingot.Gold_Vein,
            Vein_Ingot.Iron_Vein,
            Vein_Ingot.Beryllium_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Galena_Vein,
            Vein_Ingot.Salt_Vein,
            SmallOre_Ingot.Saltpeter_SmallOre,
            SmallOre_Ingot.Iron_SmallOre,
            SmallOre_Ingot.Copper_SmallOre,
            SmallOre_Ingot.Titanium_SmallOre,
            SmallOre_Ingot.Oriharukon_SmallOre,
            SmallOre_Ingot.Tin_SmallOre,
            SmallOre_Ingot.Lead_SmallOre,
            SmallOre_Ingot.Redstone_SmallOre,
            SmallOre_Ingot.Gold_SmallOre,
            SmallOre_Ingot.Chromite_SmallOre,
            SmallOre_Ingot.Tungstate_SmallOre,
            SmallOre_Ingot.Meteoric_Iron_SmallOre,
            SmallOre_Ingot.Bismuth_SmallOre,
            SmallOre_Ingot.Zinc_SmallOre,
            SmallOre_Ingot.Nickel_SmallOre);
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
            Vein_Ingot.Uranium238_Vein,
            Vein_Ingot.Sulfur_Vein,
            Vein_Ingot.Diamond_Vein,
            Vein_Ingot.Molybdenum_Vein,
            Vein_Ingot.Pitchblende_Vein,
            Vein_Ingot.Quartz_Vein,
            Vein_Ingot.Draconium_Vein,
            Vein_Ingot.Nickel_Vein,
            Vein_Ingot.Arsenic_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Gold_Vein,
            Vein_Ingot.Oriharukon_Vein,
            SmallOre_Ingot.Iron_SmallOre,
            SmallOre_Ingot.Copper_SmallOre,
            SmallOre_Ingot.Titanium_SmallOre,
            SmallOre_Ingot.Gold_SmallOre,
            SmallOre_Ingot.Draconium_SmallOre,
            SmallOre_Ingot.Chromite_SmallOre,
            SmallOre_Ingot.Tungstate_SmallOre,
            SmallOre_Ingot.Meteoric_Iron_SmallOre,
            SmallOre_Ingot.Lapis_SmallOre,
            SmallOre_Ingot.Desh_SmallOre);
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
            Vein_Ingot.Tungstate_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Gold_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Naquadah_Vein,
            SmallOre_Ingot.Iron_SmallOre,
            SmallOre_Ingot.Titanium_SmallOre,
            SmallOre_Ingot.Lead_SmallOre,
            SmallOre_Ingot.Gold_SmallOre,
            // Diamond Ore
            SmallOre_Ingot.Chromite_SmallOre,
            SmallOre_Ingot.Tungstate_SmallOre,
            SmallOre_Ingot.Nickel_SmallOre);
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
            Vein_Ingot.Tungstate_Vein,
            Vein_Ingot.Plutonium239_Vein,
            Vein_Ingot.Monazite_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Palladium_Vein,
            Vein_Ingot.Callisto_Ice_Vein,
            Vein_Ingot.Copper_Vein,
            Vein_Ingot.Gold_Vein,
            Vein_Ingot.Iron_Vein,
            SmallOre_Ingot.Iron_SmallOre,
            SmallOre_Ingot.Mytryl_SmallOre,
            SmallOre_Ingot.Titanium_SmallOre,
            SmallOre_Ingot.Ledox_SmallOre,
            SmallOre_Ingot.Gold_SmallOre,
            // Diamond Ore
            SmallOre_Ingot.Chromite_SmallOre,
            SmallOre_Ingot.Tungstate_SmallOre,
            SmallOre_Ingot.Desh_SmallOre,
            SmallOre_Ingot.Bismuth_SmallOre);
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
            Vein_Ingot.Uranium238_Vein,
            Vein_Ingot.Plutonium239_Vein,
            Vein_Ingot.Lapis_Vein,
            Vein_Ingot.Molybdenum_Vein,
            Vein_Ingot.Olivine_Vein,
            Vein_Ingot.Manganese_Vein,
            Vein_Ingot.Palladium_Vein,
            Vein_Ingot.Copper_Vein,
            Vein_Ingot.Soapstone_Vein,
            Vein_Ingot.Iron_Vein,
            Vein_Ingot.Beryllium_Vein,
            Vein_Ingot.Electrotine_Vein,
            Vein_Ingot.Magnetite_Vein,
            SmallOre_Ingot.Titanium_SmallOre,
            SmallOre_Ingot.Oriharukon_SmallOre,
            SmallOre_Ingot.Lead_SmallOre,
            SmallOre_Ingot.Gold_SmallOre,
            // Diamond Ore
            SmallOre_Ingot.Chromite_SmallOre,
            SmallOre_Ingot.Tungstate_SmallOre,
            SmallOre_Ingot.Bismuth_SmallOre,
            SmallOre_Ingot.Nickel_SmallOre,
            SmallOre_Ingot.Quantium_SmallOre,
            SmallOre_Ingot.Naquadah_SmallOre);
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
            Vein_Ingot.Tin_Vein);
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
            Vein_Ingot.Uranium238_Vein,
            Vein_Ingot.Tungstate_Vein,
            Vein_Ingot.Plutonium239_Vein,
            Vein_Ingot.Diamond_Vein,
            Vein_Ingot.Redstone_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Palladium_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Iron_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Galena_Vein,
            SmallOre_Ingot.Saltpeter_SmallOre,
            SmallOre_Ingot.Iron_SmallOre,
            SmallOre_Ingot.Titanium_SmallOre,
            SmallOre_Ingot.Tin_SmallOre,
            SmallOre_Ingot.Lead_SmallOre,
            SmallOre_Ingot.Redstone_SmallOre,
            SmallOre_Ingot.Draconium_SmallOre,
            SmallOre_Ingot.Chromite_SmallOre,
            SmallOre_Ingot.Tungstate_SmallOre,
            SmallOre_Ingot.Lapis_SmallOre,
            SmallOre_Ingot.Zinc_SmallOre);
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
            Vein_Ingot.Bismutite_Bismuthinite_Vein,
            Vein_Ingot.Olenite_FluorBuergerite_ChromoAluminoPovondraite_VanadioOxyDravit_Vein,
            Vein_Ingot.Arsenopyrite_Ferberite_Loellingite_Roquesite_Vein,
            Vein_Ingot.Ferberite_Huebnerite_Loellingite_Vein,
            Vein_Ingot.Djurleite_Bornite_Wittichenite_Vein,
            Vein_Ingot.Thorianite_Vein,
            Vein_Ingot.Fayalite_GreenFuchsite_RedZircon_RedFuchsite_Vein,
            Vein_Ingot.Forsterite_Fayalite_OrangeDescloizite_RedDescloizite_Vein);
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
            Vein_Ingot.Plutonium239_Vein,
            Vein_Ingot.Sulfur_Vein,
            Vein_Ingot.Manganese_Vein,
            Vein_Ingot.Pitchblende_Vein,
            Vein_Ingot.Quartz_Vein,
            Vein_Ingot.Pyrolusite_Vein,
            Vein_Ingot.Infused_Gold_Vein,
            Vein_Ingot.Monazite_Vein,
            Vein_Ingot.Palladium_Vein,
            Vein_Ingot.Mytryl_Vein,
            Vein_Ingot.Magnetite_Vein,
            Vein_Ingot.Iridium_Vein,
            Vein_Ingot.Cassiterite_Vein,
            SmallOre_Ingot.Saltpeter_SmallOre,
            SmallOre_Ingot.Iron_SmallOre,
            SmallOre_Ingot.Silver_SmallOre,
            SmallOre_Ingot.Titanium_SmallOre,
            SmallOre_Ingot.Redstone_SmallOre,
            SmallOre_Ingot.Chromite_SmallOre,
            SmallOre_Ingot.Tungstate_SmallOre,
            SmallOre_Ingot.Meteoric_Iron_SmallOre,
            // Firestone Ore
            SmallOre_Ingot.Lapis_SmallOre,
            SmallOre_Ingot.Tungsten_SmallOre,
            SmallOre_Ingot.Bismuth_SmallOre,
            SmallOre_Ingot.Zinc_SmallOre,
            SmallOre_Ingot.Quantium_SmallOre,
            SmallOre_Ingot.Naquadah_SmallOre);
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
            Vein_Ingot.Diamond_Vein,
            Vein_Ingot.Molybdenum_Vein,
            Vein_Ingot.Draconium_Vein,
            Vein_Ingot.Redstone_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Palladium_Vein,
            Vein_Ingot.Arsenic_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Iron_Vein,
            Vein_Ingot.Naquadah_Vein,
            Vein_Ingot.Iridium_Vein,
            SmallOre_Ingot.Titanium_SmallOre,
            SmallOre_Ingot.Deep_Iron_SmallOre,
            SmallOre_Ingot.Oriharukon_SmallOre,
            SmallOre_Ingot.Lead_SmallOre,
            SmallOre_Ingot.Redstone_SmallOre,
            SmallOre_Ingot.Ledox_SmallOre,
            SmallOre_Ingot.Chromite_SmallOre,
            SmallOre_Ingot.Tungstate_SmallOre,
            SmallOre_Ingot.Desh_SmallOre,
            SmallOre_Ingot.Bismuth_SmallOre,
            SmallOre_Ingot.Zinc_SmallOre,
            SmallOre_Ingot.Nickel_SmallOre,
            SmallOre_Ingot.Naquadah_SmallOre);
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
            Vein_Ingot.Sulfur_Vein,
            Vein_Ingot.Pitchblende_Vein,
            Vein_Ingot.Quartz_Vein,
            Vein_Ingot.Redstone_Vein,
            Vein_Ingot.Monazite_Vein,
            Vein_Ingot.Nickel_Vein,
            Vein_Ingot.Beryllium_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Galena_Vein,
            Vein_Ingot.Naquadah_Vein,
            Vein_Ingot.Rutile_Vein,
            Vein_Ingot.Quantium_Vein,
            Vein_Ingot.Iridium_Vein,
            Vein_Ingot.Cassiterite_Vein,
            SmallOre_Ingot.Saltpeter_SmallOre,
            SmallOre_Ingot.Mytryl_SmallOre,
            SmallOre_Ingot.Titanium_SmallOre,
            SmallOre_Ingot.Lead_SmallOre,
            SmallOre_Ingot.Gold_SmallOre,
            // Diamond Ore
            SmallOre_Ingot.Draconium_SmallOre,
            SmallOre_Ingot.Chromite_SmallOre,
            SmallOre_Ingot.Tungstate_SmallOre,
            SmallOre_Ingot.Meteoric_Iron_SmallOre,
            // Firestone Ore
            SmallOre_Ingot.Tungsten_SmallOre,
            SmallOre_Ingot.Nickel_SmallOre,
            SmallOre_Ingot.Naquadah_SmallOre);
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
            Vein_Ingot.Uranium238_Vein,
            Vein_Ingot.Tungstate_Vein,
            Vein_Ingot.Lapis_Vein,
            Vein_Ingot.Osmium_Vein,
            Vein_Ingot.Monazite_Vein,
            Vein_Ingot.Copper_Vein,
            Vein_Ingot.Vanadium_Vein,
            Vein_Ingot.Ledox_Vein,
            Vein_Ingot.Iridium_Vein,
            SmallOre_Ingot.Saltpeter_SmallOre,
            SmallOre_Ingot.Iron_SmallOre,
            SmallOre_Ingot.Silver_SmallOre,
            SmallOre_Ingot.Titanium_SmallOre,
            SmallOre_Ingot.Ledox_SmallOre,
            SmallOre_Ingot.Neutronium_SmallOre,
            SmallOre_Ingot.Chromite_SmallOre,
            SmallOre_Ingot.Tungstate_SmallOre,
            SmallOre_Ingot.Lapis_SmallOre,
            SmallOre_Ingot.Zinc_SmallOre,
            SmallOre_Ingot.Naquadah_SmallOre);
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
            Vein_Ingot.Diamond_Vein,
            Vein_Ingot.Osmium_Vein,
            Vein_Ingot.Desh_Vein,
            Vein_Ingot.Draconium_Vein,
            Vein_Ingot.Redstone_Vein,
            Vein_Ingot.Pyrolusite_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Iridium_Vein,
            Vein_Ingot.Cassiterite_Vein,
            SmallOre_Ingot.Iron_SmallOre,
            SmallOre_Ingot.Mytryl_SmallOre,
            SmallOre_Ingot.Titanium_SmallOre,
            SmallOre_Ingot.Gold_SmallOre,
            SmallOre_Ingot.Tungstate_SmallOre,
            SmallOre_Ingot.Desh_SmallOre);
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
            Vein_Ingot.Tungstate_Vein,
            Vein_Ingot.Osmium_Vein,
            Vein_Ingot.Tungsten_Vein,
            Vein_Ingot.Manganese_Vein,
            Vein_Ingot.Pitchblende_Vein,
            Vein_Ingot.Palladium_Vein,
            Vein_Ingot.Iron_Vein,
            Vein_Ingot.Galena_Vein,
            Vein_Ingot.Naquadah_Vein,
            SmallOre_Ingot.Silver_SmallOre,
            SmallOre_Ingot.Titanium_SmallOre,
            SmallOre_Ingot.Lead_SmallOre,
            SmallOre_Ingot.Ledox_SmallOre,
            SmallOre_Ingot.Neutronium_SmallOre,
            // Diamond Ore
            SmallOre_Ingot.Draconium_SmallOre,
            SmallOre_Ingot.Chromite_SmallOre,
            SmallOre_Ingot.Tungstate_SmallOre,
            SmallOre_Ingot.Lapis_SmallOre);
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
            Vein_Ingot.Diamond_Vein,
            Vein_Ingot.Molybdenum_Vein,
            Vein_Ingot.Osmium_Vein,
            Vein_Ingot.Manganese_Vein,
            Vein_Ingot.Infused_Gold_Vein,
            Vein_Ingot.Monazite_Vein,
            Vein_Ingot.Nickel_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Arsenic_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Beryllium_Vein,
            Vein_Ingot.Naquadah_Vein,
            Vein_Ingot.Rutile_Vein,
            Vein_Ingot.Iridium_Vein,
            SmallOre_Ingot.Iron_SmallOre,
            SmallOre_Ingot.Silver_SmallOre,
            SmallOre_Ingot.Titanium_SmallOre,
            SmallOre_Ingot.Oriharukon_SmallOre,
            SmallOre_Ingot.Tin_SmallOre,
            SmallOre_Ingot.Redstone_SmallOre,
            SmallOre_Ingot.Neutronium_SmallOre,
            // Diamond Ore
            SmallOre_Ingot.Chromite_SmallOre,
            SmallOre_Ingot.Tungstate_SmallOre,
            SmallOre_Ingot.Zinc_SmallOre,
            SmallOre_Ingot.Quantium_SmallOre);
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
            Vein_Ingot.Olenite_FluorBuergerite_ChromoAluminoPovondraite_VanadioOxyDravit_Vein,
            Vein_Ingot.Ferberite_Huebnerite_Loellingite_Vein,
            Vein_Ingot.Hedenbergite_Fayalite_OrangeDescloizite_RedDescloizite_Vein,
            Vein_Ingot.Prasiolite_Hedenbergite_Vein,
            Vein_Ingot.BArTiMaEuSNeK_Vein,
            Vein_Ingot.Tiberium_Vein,
            Vein_Ingot.Fluorspar_Vein);
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
            Vein_Ingot.Uranium238_Vein,
            Vein_Ingot.Diamond_Vein,
            Vein_Ingot.Molybdenum_Vein,
            Vein_Ingot.Osmium_Vein,
            Vein_Ingot.Tungsten_Vein,
            Vein_Ingot.Quartz_Vein,
            Vein_Ingot.Infused_Gold_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Copper_Vein,
            Vein_Ingot.Vanadium_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Neutronium_Vein,
            SmallOre_Ingot.Saltpeter_SmallOre,
            SmallOre_Ingot.Copper_SmallOre,
            SmallOre_Ingot.Silver_SmallOre,
            SmallOre_Ingot.Mytryl_SmallOre,
            SmallOre_Ingot.Titanium_SmallOre,
            SmallOre_Ingot.Tin_SmallOre,
            SmallOre_Ingot.Redstone_SmallOre,
            SmallOre_Ingot.Neutronium_SmallOre,
            SmallOre_Ingot.Chromite_SmallOre,
            SmallOre_Ingot.Tungstate_SmallOre,
            SmallOre_Ingot.Desh_SmallOre,
            SmallOre_Ingot.Bismuth_SmallOre,
            SmallOre_Ingot.Zinc_SmallOre,
            SmallOre_Ingot.Naquadah_SmallOre);
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
            Vein_Ingot.Tungstate_Vein,
            Vein_Ingot.Tungsten_Vein,
            Vein_Ingot.Manganese_Vein,
            Vein_Ingot.Monazite_Vein,
            Vein_Ingot.Nickel_Vein,
            Vein_Ingot.Thorium_Vein,
            Vein_Ingot.Neutronium_Vein,
            Vein_Ingot.Gold_Vein,
            Vein_Ingot.Galena_Vein,
            Vein_Ingot.Niobium_Vein,
            Vein_Ingot.Iridium_Vein,
            SmallOre_Ingot.Iron_SmallOre,
            SmallOre_Ingot.Copper_SmallOre,
            SmallOre_Ingot.Silver_SmallOre,
            SmallOre_Ingot.Titanium_SmallOre,
            SmallOre_Ingot.Oriharukon_SmallOre,
            SmallOre_Ingot.Lead_SmallOre,
            SmallOre_Ingot.Neutronium_SmallOre,
            // Diamond Ore
            SmallOre_Ingot.Black_Plutonium_SmallOre,
            SmallOre_Ingot.Chromite_SmallOre,
            SmallOre_Ingot.Tungstate_SmallOre,
            SmallOre_Ingot.Desh_SmallOre);
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
            Vein_Ingot.Uranium238_Vein,
            Vein_Ingot.Tungstate_Vein,
            Vein_Ingot.Olivine_Vein,
            Vein_Ingot.Pitchblende_Vein,
            Vein_Ingot.Infused_Gold_Vein,
            Vein_Ingot.Monazite_Vein,
            Vein_Ingot.Thorium_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Neutronium_Vein,
            Vein_Ingot.Nether_Star_Vein,
            Vein_Ingot.Beryllium_Vein,
            Vein_Ingot.Naquadah_Vein,
            SmallOre_Ingot.Iron_SmallOre,
            SmallOre_Ingot.Titanium_SmallOre,
            SmallOre_Ingot.Oriharukon_SmallOre,
            SmallOre_Ingot.Ledox_SmallOre,
            SmallOre_Ingot.Neutronium_SmallOre,
            SmallOre_Ingot.Black_Plutonium_SmallOre,
            SmallOre_Ingot.Draconium_SmallOre,
            SmallOre_Ingot.Chromite_SmallOre,
            SmallOre_Ingot.Desh_SmallOre,
            SmallOre_Ingot.Zinc_SmallOre,
            SmallOre_Ingot.Quantium_SmallOre);
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

        // T7 - Makemake - MM
        ItemStack[] Fake_T7_Makemake_Ingot = addCompressAggregateArray(
            Vein_Ingot.Uranium238_Vein,
            Vein_Ingot.Tungstate_Vein,
            Vein_Ingot.Olivine_Vein,
            Vein_Ingot.Pitchblende_Vein,
            Vein_Ingot.Monazite_Vein,
            Vein_Ingot.Black_Plutonium_Vein,
            Vein_Ingot.Vanadium_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Neutronium_Vein,
            Vein_Ingot.Beryllium_Vein,
            Vein_Ingot.Red_Garnet_Vein,
            Vein_Ingot.Niobium_Vein,
            Vein_Ingot.Magnetite_Vein,
            SmallOre_Ingot.Mytryl_SmallOre,
            SmallOre_Ingot.Titanium_SmallOre,
            SmallOre_Ingot.Oriharukon_SmallOre,
            SmallOre_Ingot.Lead_SmallOre,
            SmallOre_Ingot.Neutronium_SmallOre,
            SmallOre_Ingot.Black_Plutonium_SmallOre,
            SmallOre_Ingot.Draconium_SmallOre,
            SmallOre_Ingot.Chromite_SmallOre,
            SmallOre_Ingot.Desh_SmallOre,
            SmallOre_Ingot.Bismuth_SmallOre,
            SmallOre_Ingot.Nickel_SmallOre,
            SmallOre_Ingot.Quantium_SmallOre);
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
            Vein_Ingot.Tungstate_Vein,
            Vein_Ingot.Diamond_Vein,
            Vein_Ingot.Molybdenum_Vein,
            Vein_Ingot.Osmium_Vein,
            Vein_Ingot.Tungsten_Vein,
            Vein_Ingot.Black_Plutonium_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Palladium_Vein,
            Vein_Ingot.Thorium_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Neutronium_Vein,
            Vein_Ingot.Gold_Vein,
            Vein_Ingot.Iron_Vein,
            Vein_Ingot.Beryllium_Vein,
            Vein_Ingot.Naquadah_Vein,
            SmallOre_Ingot.Silver_SmallOre,
            SmallOre_Ingot.Titanium_SmallOre,
            SmallOre_Ingot.Lead_SmallOre,
            SmallOre_Ingot.Ledox_SmallOre,
            SmallOre_Ingot.Neutronium_SmallOre,
            SmallOre_Ingot.Gold_SmallOre,
            SmallOre_Ingot.Black_Plutonium_SmallOre,
            SmallOre_Ingot.Draconium_SmallOre,
            SmallOre_Ingot.Chromite_SmallOre,
            SmallOre_Ingot.Tungstate_SmallOre,
            SmallOre_Ingot.Meteoric_Iron_SmallOre,
            SmallOre_Ingot.Nickel_SmallOre,
            SmallOre_Ingot.Quantium_SmallOre,
            SmallOre_Ingot.Naquadah_SmallOre);
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
            // Oilsands Vein
            Vein_Ingot.Osmium_Vein,
            Vein_Ingot.Tungsten_Vein,
            Vein_Ingot.Samarium_Vein,
            Vein_Ingot.Mica_Vein,
            Vein_Ingot.Black_Plutonium_Vein,
            Vein_Ingot.Arsenic_Vein,
            Vein_Ingot.Lignite_Coal_Vein,
            Vein_Ingot.Basaltic_Mineral_Sand_Vein,
            Vein_Ingot.Salt_Vein);
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
            Vein_Ingot.Uranium238_Vein,
            Vein_Ingot.Molybdenum_Vein,
            Vein_Ingot.Olivine_Vein,
            Vein_Ingot.Tungsten_Vein,
            Vein_Ingot.Manganese_Vein,
            Vein_Ingot.Infused_Gold_Vein,
            Vein_Ingot.Rare_Earth_Vein,
            Vein_Ingot.Thorium_Vein,
            Vein_Ingot.Copper_Vein,
            Vein_Ingot.Neutronium_Vein,
            Vein_Ingot.Nether_Star_Vein,
            Vein_Ingot.Naquadah_Vein,
            Vein_Ingot.Magnetite_Vein,
            SmallOre_Ingot.Awakened_Draconium_SmallOre,
            SmallOre_Ingot.Iron_SmallOre,
            SmallOre_Ingot.Titanium_SmallOre,
            SmallOre_Ingot.Neutronium_SmallOre,
            SmallOre_Ingot.Black_Plutonium_SmallOre,
            SmallOre_Ingot.Zinc_SmallOre,
            SmallOre_Ingot.Nickel_SmallOre,
            SmallOre_Ingot.Naquadah_SmallOre);
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
            Vein_Ingot.Diamond_Vein,
            Vein_Ingot.Tungsten_Vein,
            Vein_Ingot.Manganese_Vein,
            Vein_Ingot.Pitchblende_Vein,
            Vein_Ingot.Redstone_Vein,
            Vein_Ingot.Monazite_Vein,
            Vein_Ingot.Rare_Earth_Vein,
            Vein_Ingot.Thorium_Vein,
            Vein_Ingot.Copper_Vein,
            Vein_Ingot.Vanadium_Vein,
            Vein_Ingot.Neutronium_Vein,
            Vein_Ingot.Gold_Vein,
            Vein_Ingot.Beryllium_Vein,
            Vein_Ingot.Red_Garnet_Vein,
            Vein_Ingot.Naquadah_Vein,
            Vein_Ingot.Niobium_Vein,
            SmallOre_Ingot.Awakened_Draconium_SmallOre,
            SmallOre_Ingot.Iron_SmallOre,
            SmallOre_Ingot.Titanium_SmallOre,
            SmallOre_Ingot.Neutronium_SmallOre,
            SmallOre_Ingot.Gold_SmallOre,
            SmallOre_Ingot.Black_Plutonium_SmallOre,
            SmallOre_Ingot.Realgar_SmallOre,
            SmallOre_Ingot.Nickel_SmallOre,
            SmallOre_Ingot.Naquadah_SmallOre,
            SmallOre_Ingot.Bedrockium_SmallOre);
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
            Vein_Ingot.Sulfur_Vein,
            Vein_Ingot.Manganese_Vein,
            Vein_Ingot.Samarium_Vein,
            Vein_Ingot.Pitchblende_Vein,
            Vein_Ingot.Quartz_Vein,
            Vein_Ingot.Redstone_Vein,
            Vein_Ingot.Black_Plutonium_Vein,
            Vein_Ingot.Rare_Earth_Vein,
            Vein_Ingot.Beryllium_Vein,
            Vein_Ingot.Electrotine_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Tin_Vein,
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
            // Oilsands Vein
            Vein_Ingot.Magnesite_Vein,
            Vein_Ingot.Quartz_Vein,
            Vein_Ingot.Black_Plutonium_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Gold_Vein,
            Vein_Ingot.Kaolinite_Vein,
            Vein_Ingot.Nether_Star_Vein,
            Vein_Ingot.Apatite_Vein,
            Vein_Ingot.Chrome_Vein,
            Vein_Ingot.Magnetite_Vein,
            Vein_Ingot.Salt_Vein,
            Vein_Ingot.Cassiterite_Vein,
            SmallOre_Ingot.Awakened_Draconium_SmallOre,
            SmallOre_Ingot.Neutronium_SmallOre,
            SmallOre_Ingot.Lapis_SmallOre);
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
            Vein_Ingot.Tungstate_Vein,
            Vein_Ingot.Lapis_Vein,
            Vein_Ingot.Pitchblende_Vein,
            Vein_Ingot.Redstone_Vein,
            Vein_Ingot.Infused_Gold_Vein,
            Vein_Ingot.Rare_Earth_Vein,
            Vein_Ingot.Thorium_Vein,
            Vein_Ingot.Arsenic_Vein,
            Vein_Ingot.Vanadium_Vein,
            Vein_Ingot.Neutronium_Vein,
            Vein_Ingot.Gold_Vein,
            Vein_Ingot.Nether_Star_Vein,
            Vein_Ingot.Red_Garnet_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Galena_Vein,
            Vein_Ingot.Naquadah_Vein,
            Vein_Ingot.Niobium_Vein,
            SmallOre_Ingot.Awakened_Draconium_SmallOre,
            SmallOre_Ingot.Silver_SmallOre,
            SmallOre_Ingot.Lead_SmallOre,
            SmallOre_Ingot.Neutronium_SmallOre,
            SmallOre_Ingot.Infinity_Catalyst_SmallOre,
            // Diamond Ore
            SmallOre_Ingot.Black_Plutonium_SmallOre,
            SmallOre_Ingot.Chromite_SmallOre,
            SmallOre_Ingot.Bismuth_SmallOre);
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
            Vein_Ingot.Sulfur_Vein,
            Vein_Ingot.Infinity_Catalyst_Vein,
            Vein_Ingot.Olivine_Vein,
            Vein_Ingot.Desh_Vein,
            Vein_Ingot.Mica_Vein,
            Vein_Ingot.Cryolite_Vein,
            Vein_Ingot.Dolomite_Vein,
            Vein_Ingot.Callisto_Ice_Vein,
            Vein_Ingot.Soapstone_Vein,
            Vein_Ingot.Mytryl_Vein,
            Vein_Ingot.Rutile_Vein,
            Vein_Ingot.Basaltic_Mineral_Sand_Vein,
            SmallOre_Ingot.Infinity_Catalyst_SmallOre);
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
            Vein_Ingot.Certus_Quartz_Vein,
            Vein_Ingot.Quartz_Vein,
            Vein_Ingot.Draconium_Vein,
            Vein_Ingot.Sapphire_Vein,
            Vein_Ingot.Black_Plutonium_Vein,
            Vein_Ingot.Cosmic_Neutronium_Vein,
            Vein_Ingot.Mytryl_Vein,
            Vein_Ingot.Nether_Star_Vein,
            Vein_Ingot.Red_Garnet_Vein,
            Vein_Ingot.Oriharukon_Vein,
            Vein_Ingot.Quantium_Vein,
            Vein_Ingot.Ledox_Vein,
            SmallOre_Ingot.Amethyst_SmallOre,
            SmallOre_Ingot.Red_Garnet_SmallOre,
            SmallOre_Ingot.Yellow_Garnet_SmallOre,
            SmallOre_Ingot.Tanzanite_SmallOre,
            SmallOre_Ingot.Spinel_SmallOre,
            SmallOre_Ingot.Opal_SmallOre,
            SmallOre_Ingot.Charged_Certus_Quartz_SmallOre,
            SmallOre_Ingot.Mytryl_SmallOre,
            SmallOre_Ingot.Ruby_SmallOre,
            SmallOre_Ingot.Emerald_SmallOre,
            SmallOre_Ingot.Blue_Topaz_SmallOre,
            SmallOre_Ingot.Topaz_SmallOre,
            SmallOre_Ingot.Certus_Quartz_SmallOre,
            SmallOre_Ingot.Jade_SmallOre,
            SmallOre_Ingot.Green_Sapphire_SmallOre,
            SmallOre_Ingot.Sapphire_SmallOre,
            SmallOre_Ingot.Jasper_SmallOre,
            SmallOre_Ingot.Olivine_SmallOre);
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
            Vein_Ingot.Naquadria_Vein,
            Vein_Ingot.Cryolite_Vein,
            Vein_Ingot.Callisto_Ice_Vein,
            Vein_Ingot.Vanadium_Vein,
            Vein_Ingot.Soapstone_Vein,
            Vein_Ingot.Neutronium_Vein,
            Vein_Ingot.Platinum_Vein,
            Vein_Ingot.Naquadria_Vein,
            Vein_Ingot.Basaltic_Mineral_Sand_Vein,
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
            Vein_Ingot.Uranium238_Vein,
            Vein_Ingot.Lapis_Vein,
            Vein_Ingot.Awakened_Draconium_Vein,
            Vein_Ingot.Olivine_Vein,
            Vein_Ingot.Osmium_Vein,
            Vein_Ingot.Nickel_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Palladium_Vein,
            Vein_Ingot.Neutronium_Vein,
            Vein_Ingot.Platinum_Vein,
            Vein_Ingot.Iridium_Vein,
            Vein_Ingot.Cassiterite_Vein,
            SmallOre_Ingot.Titanium_SmallOre,
            SmallOre_Ingot.Tin_SmallOre,
            SmallOre_Ingot.Neutronium_SmallOre,
            SmallOre_Ingot.Chromite_SmallOre,
            SmallOre_Ingot.Lapis_SmallOre,
            SmallOre_Ingot.Nickel_SmallOre,
            SmallOre_Ingot.Olivine_SmallOre);
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
            // Terra & Aer Vein
            Vein_Ingot.Certus_Quartz_Vein,
            Vein_Ingot.Quartzite_Vein,
            Vein_Ingot.Dilithium_Vein,
            Vein_Ingot.Mica_Vein,
            Vein_Ingot.Dolomite_Vein,
            Vein_Ingot.Arsenic_Vein,
            // Perditio & Ordo Vein
            Vein_Ingot.Kaolinite_Vein,
            // Aqua, Ignis & Amber Vein
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
            Vein_Ingot.Osmium_Vein,
            Vein_Ingot.Samarium_Vein,
            Vein_Ingot.Draconium_Vein,
            Vein_Ingot.Monazite_Vein,
            Vein_Ingot.Palladium_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Gold_Vein,
            Vein_Ingot.Raw_Tengam_Vein,
            Vein_Ingot.Magnetite_Vein,
            Vein_Ingot.Iridium_Vein,
            Vein_Ingot.Cassiterite_Vein,
            SmallOre_Ingot.Awakened_Draconium_SmallOre,
            SmallOre_Ingot.Draconium_SmallOre);
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
        ItemStack[] Fake_T10_Ingot_Checked = checkItemStack(Vein_Ingot.T10_Ingot);
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
