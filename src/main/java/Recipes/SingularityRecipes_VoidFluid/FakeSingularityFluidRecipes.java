package Recipes.SingularityRecipes_VoidFluid;

import static gregtech.api.enums.Mods.NEIOrePlugin;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;
import static util.AggregateFluidStackArray.addCompressAggregateArray;
import static util.AggregateFluidStackArray.addSplitAggregateArray;

import net.minecraftforge.fluids.FluidStack;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.OneToManyFluidsFrontend_Large;

public class FakeSingularityFluidRecipes {

    public static int NEI_ItemOutput_Size = 90;

    public static final RecipeMap<RecipeMapBackend> addFakeVoidFluidRecipes_T0 = RecipeMapBuilder
        .of("Singularity of T0 Fluid")
        .maxIO(1, 0, 0, NEI_ItemOutput_Size)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyFluidsFrontend_Large::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidFluidRecipes_T1 = RecipeMapBuilder
        .of("Singularity of T1 Fluid")
        .maxIO(1, 0, 0, NEI_ItemOutput_Size)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyFluidsFrontend_Large::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidFluidRecipes_T2 = RecipeMapBuilder
        .of("Singularity of T2 Fluid")
        .maxIO(1, 0, 0, NEI_ItemOutput_Size)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyFluidsFrontend_Large::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidFluidRecipes_T3 = RecipeMapBuilder
        .of("Singularity of T3 Fluid")
        .maxIO(1, 0, 0, NEI_ItemOutput_Size)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyFluidsFrontend_Large::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidFluidRecipes_T4 = RecipeMapBuilder
        .of("Singularity of T4 Fluid")
        .maxIO(1, 0, 0, NEI_ItemOutput_Size)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyFluidsFrontend_Large::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidFluidRecipes_T5 = RecipeMapBuilder
        .of("Singularity of T5 Fluid")
        .maxIO(1, 0, 0, NEI_ItemOutput_Size)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyFluidsFrontend_Large::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidFluidRecipes_T6 = RecipeMapBuilder
        .of("Singularity of T6 Fluid")
        .maxIO(1, 0, 0, NEI_ItemOutput_Size)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyFluidsFrontend_Large::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidFluidRecipes_T7 = RecipeMapBuilder
        .of("Singularity of T7 Fluid")
        .maxIO(1, 0, 0, NEI_ItemOutput_Size)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyFluidsFrontend_Large::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidFluidRecipes_T8 = RecipeMapBuilder
        .of("Singularity of T8 Fluid")
        .maxIO(1, 0, 0, NEI_ItemOutput_Size)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyFluidsFrontend_Large::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakeVoidFluidRecipes_T9 = RecipeMapBuilder
        .of("Singularity of T9 Fluid")
        .maxIO(1, 0, 0, NEI_ItemOutput_Size)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyFluidsFrontend_Large::new)
        .build();

    public static void addFakeVoidFluidRecipes_T0() {
        // T0 - Overworld - Ow
        FluidStack[] Fake_T0_Overworld_Fluid = addCompressAggregateArray(
            Vein_Fluid.Diamond_Vein,
            Vein_Fluid.Lapis_Vein,
            Vein_Fluid.Vermiculite_Vein,
            Vein_Fluid.Oilsands_Vein,
            Vein_Fluid.Coal_Vein,
            Vein_Fluid.Manganese_Vein,
            Vein_Fluid.Redstone_Vein,
            Vein_Fluid.Mica_Vein,
            Vein_Fluid.Dolomite_Vein,
            Vein_Fluid.Copper_Vein,
            Vein_Fluid.Soapstone_Vein,
            Vein_Fluid.Gold_Vein,
            Vein_Fluid.Kaolinite_Vein,
            Vein_Fluid.Iron_Vein,
            Vein_Fluid.Lignite_Coal_Vein,
            Vein_Fluid.Apatite_Vein,
            Vein_Fluid.Basaltic_Mineral_Sand_Vein,
            Vein_Fluid.Magnetite_Vein,
            Vein_Fluid.Tin_Vein,
            Vein_Fluid.Salt_Vein,
            Vein_Fluid.Cassiterite_Vein,
            SmallOre_Fluid.Iron_SmallOre,
            SmallOre_Fluid.Copper_SmallOre,
            SmallOre_Fluid.Silver_SmallOre,
            SmallOre_Fluid.Tin_SmallOre,
            SmallOre_Fluid.Redstone_SmallOre,
            SmallOre_Fluid.Gold_SmallOre,
            SmallOre_Fluid.Lapis_SmallOre,
            SmallOre_Fluid.Coal_SmallOre,
            SmallOre_Fluid.Zinc_SmallOre,
            SmallOre_Fluid.Nickel_SmallOre,
            Void_Fluid.Overworld_VoidFluid);
        FluidStack[][] Fake_T0_Overworld_Fluid_Split = addSplitAggregateArray(
            Fake_T0_Overworld_Fluid,
            NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T0_Overworld_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ow", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T0);
        }

        // T0 - Nether - Ne
        FluidStack[] Fake_T0_Nether_Fluid = addCompressAggregateArray(
            Vein_Fluid.Sulfur_Vein,
            Vein_Fluid.Molybdenum_Vein,
            Vein_Fluid.Manganese_Vein,
            Vein_Fluid.Quartzite_Vein,
            Vein_Fluid.Redstone_Vein,
            Vein_Fluid.Copper_Vein,
            Vein_Fluid.Iron_Vein,
            Vein_Fluid.Beryllium_Vein,
            Vein_Fluid.Electrotine_Vein,
            Vein_Fluid.Tetrahedrite_Vein,
            Vein_Fluid.Nether_Quartz_Vein,
            SmallOre_Fluid.Saltpeter_SmallOre,
            SmallOre_Fluid.Iron_SmallOre,
            SmallOre_Fluid.Copper_SmallOre,
            SmallOre_Fluid.Silver_SmallOre,
            SmallOre_Fluid.Tin_SmallOre,
            SmallOre_Fluid.Lead_SmallOre,
            SmallOre_Fluid.Redstone_SmallOre,
            SmallOre_Fluid.Certus_Quartz_SmallOre,
            SmallOre_Fluid.Nether_Quartz_SmallOre,
            SmallOre_Fluid.Bismuth_SmallOre,
            SmallOre_Fluid.Zinc_SmallOre,
            SmallOre_Fluid.Realgar_SmallOre,
            Void_Fluid.Nether_VoidFluid);
        FluidStack[][] Fake_T0_Nether_Fluid_Split = addSplitAggregateArray(Fake_T0_Nether_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T0_Nether_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ne", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T0);
        }

        // T0 - Twilight - TF
        FluidStack[] Fake_T0_Twilight_Fluid = addCompressAggregateArray(
            Vein_Fluid.Diamond_Vein,
            Vein_Fluid.Lapis_Vein,
            Vein_Fluid.Molybdenum_Vein,
            Vein_Fluid.Olivine_Vein,
            Vein_Fluid.Terra_Aer_Vein,
            Vein_Fluid.Coal_Vein,
            Vein_Fluid.Sapphire_Vein,
            Vein_Fluid.Cryolite_Vein,
            Vein_Fluid.Nickel_Vein,
            Vein_Fluid.Soapstone_Vein,
            Vein_Fluid.Perditio_Ordo_Vein,
            Vein_Fluid.Gold_Vein,
            Vein_Fluid.Iron_Vein,
            Vein_Fluid.Apatite_Vein,
            Vein_Fluid.Magnetite_Vein,
            Vein_Fluid.Salt_Vein,
            Vein_Fluid.Cassiterite_Vein,
            Vein_Fluid.Aqua_Ignis_Amber_Vein,
            SmallOre_Fluid.Amethyst_SmallOre,
            SmallOre_Fluid.Yellow_Garnet_SmallOre,
            SmallOre_Fluid.Tanzanite_SmallOre,
            SmallOre_Fluid.Saltpeter_SmallOre,
            SmallOre_Fluid.Spinel_SmallOre,
            SmallOre_Fluid.Opal_SmallOre,
            SmallOre_Fluid.Ruby_SmallOre,
            SmallOre_Fluid.Lead_SmallOre,
            SmallOre_Fluid.Emerald_SmallOre,
            SmallOre_Fluid.Amber_SmallOre,
            SmallOre_Fluid.Blue_Topaz_SmallOre,
            SmallOre_Fluid.Topaz_SmallOre,
            SmallOre_Fluid.Jade_SmallOre,
            SmallOre_Fluid.Red_Garnet_SmallOre,
            SmallOre_Fluid.Green_Sapphire_SmallOre,
            SmallOre_Fluid.Sapphire_SmallOre,
            SmallOre_Fluid.Jasper_SmallOre,
            SmallOre_Fluid.Olivine_SmallOre);
        FluidStack[][] Fake_T0_Twilight_Fluid_Split = addSplitAggregateArray(
            Fake_T0_Twilight_Fluid,
            NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T0_Twilight_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_TF", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T0);
        }

        // T0 - TheEnd - ED
        FluidStack[] Fake_T0_TheEnd_Fluid = addCompressAggregateArray(
            Vein_Fluid.Molybdenum_Vein,
            Vein_Fluid.Nickel_Vein,
            Vein_Fluid.Copper_Vein,
            Vein_Fluid.Gold_Vein,
            Vein_Fluid.Beryllium_Vein,
            Vein_Fluid.Tetrahedrite_Vein,
            Vein_Fluid.Cassiterite_Vein,
            SmallOre_Fluid.Iron_SmallOre,
            SmallOre_Fluid.Copper_SmallOre,
            SmallOre_Fluid.Silver_SmallOre,
            SmallOre_Fluid.Tin_SmallOre,
            SmallOre_Fluid.Lead_SmallOre,
            SmallOre_Fluid.Gold_SmallOre,
            SmallOre_Fluid.Zinc_SmallOre,
            SmallOre_Fluid.Nickel_SmallOre);
        FluidStack[][] Fake_T0_TheEnd_Fluid_Split = addSplitAggregateArray(Fake_T0_TheEnd_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T0_TheEnd_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_ED", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T0);
        }

        // T0 - EndAsteroid - EA
        FluidStack[] Fake_T0_EndAsteroid_Fluid = addCompressAggregateArray(
            Vein_Fluid.Tungstate_Vein,
            Vein_Fluid.Lapis_Vein,
            Vein_Fluid.Molybdenum_Vein,
            Vein_Fluid.Olivine_Vein,
            Vein_Fluid.Manganese_Vein,
            Vein_Fluid.Nickel_Vein,
            Vein_Fluid.Copper_Vein,
            Vein_Fluid.Gold_Vein,
            Vein_Fluid.Beryllium_Vein,
            Vein_Fluid.Platinum_Vein,
            Vein_Fluid.Tetrahedrite_Vein,
            Vein_Fluid.Naquadah_Vein,
            Vein_Fluid.Cassiterite_Vein,
            SmallOre_Fluid.Silver_SmallOre,
            SmallOre_Fluid.Tin_SmallOre,
            SmallOre_Fluid.Lead_SmallOre,
            SmallOre_Fluid.Gold_SmallOre,
            SmallOre_Fluid.Zinc_SmallOre,
            SmallOre_Fluid.Nickel_SmallOre);
        FluidStack[][] Fake_T0_EndAsteroid_Fluid_Split = addSplitAggregateArray(
            Fake_T0_EndAsteroid_Fluid,
            NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T0_EndAsteroid_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_EA", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T0);
        }
    }

    public static void addFakeVoidFluidRecipes_T1() {
        // T1 - Moon - Mo
        FluidStack[] Fake_T1_Moon_Fluid = addCompressAggregateArray(
            Vein_Fluid.Molybdenum_Vein,
            Vein_Fluid.Quartz_Vein,
            Vein_Fluid.Monazite_Vein,
            Vein_Fluid.Ilmenite_Vein,
            Vein_Fluid.Copper_Vein,
            Vein_Fluid.Bauxite_Vein,
            Vein_Fluid.Galena_Vein,
            Vein_Fluid.Cassiterite_Vein,
            SmallOre_Fluid.Meteoric_Iron_SmallOre,
            Void_Fluid.Moon_VoidFluid);
        FluidStack[][] Fake_T1_Moon_Fluid_Split = addSplitAggregateArray(Fake_T1_Moon_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T1_Moon_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mo", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T1);
        }
    }

    public static void addFakeVoidFluidRecipes_T2() {
        // T2 - Deimos - De
        FluidStack[] Fake_T2_Deimos_Fluid = addCompressAggregateArray(
            Vein_Fluid.Uranium238_Vein,
            Vein_Fluid.Tungstate_Vein,
            Vein_Fluid.Sulfur_Vein,
            Vein_Fluid.Lapis_Vein,
            Vein_Fluid.Draconium_Vein,
            Vein_Fluid.Monazite_Vein,
            Vein_Fluid.Nickel_Vein,
            Vein_Fluid.Tetrahedrite_Vein,
            Vein_Fluid.Oriharukon_Vein,
            Vein_Fluid.Magnetite_Vein,
            SmallOre_Fluid.Saltpeter_SmallOre,
            SmallOre_Fluid.Titanium_SmallOre,
            SmallOre_Fluid.Tin_SmallOre,
            SmallOre_Fluid.Lead_SmallOre,
            SmallOre_Fluid.Draconium_SmallOre,
            SmallOre_Fluid.Chromite_SmallOre,
            SmallOre_Fluid.Tungstate_SmallOre,
            SmallOre_Fluid.Meteoric_Iron_SmallOre,
            SmallOre_Fluid.Desh_SmallOre,
            SmallOre_Fluid.Nickel_SmallOre);
        FluidStack[][] Fake_T2_Deimos_Fluid_Split = addSplitAggregateArray(Fake_T2_Deimos_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T2_Deimos_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_De", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T2);
        }

        // T2 - Mars - Ma
        FluidStack[] Fake_T2_Mars_Fluid = addCompressAggregateArray(
            Vein_Fluid.Tungstate_Vein,
            Vein_Fluid.Sulfur_Vein,
            Vein_Fluid.Desh_Vein,
            Vein_Fluid.Pitchblende_Vein,
            Vein_Fluid.Quartz_Vein,
            Vein_Fluid.Redstone_Vein,
            Vein_Fluid.Nickel_Vein,
            Vein_Fluid.Arsenic_Vein,
            Vein_Fluid.Gold_Vein,
            Vein_Fluid.Iron_Vein,
            Vein_Fluid.Beryllium_Vein,
            Vein_Fluid.Tetrahedrite_Vein,
            Vein_Fluid.Galena_Vein,
            Vein_Fluid.Salt_Vein,
            SmallOre_Fluid.Saltpeter_SmallOre,
            SmallOre_Fluid.Iron_SmallOre,
            SmallOre_Fluid.Copper_SmallOre,
            SmallOre_Fluid.Titanium_SmallOre,
            SmallOre_Fluid.Oriharukon_SmallOre,
            SmallOre_Fluid.Tin_SmallOre,
            SmallOre_Fluid.Lead_SmallOre,
            SmallOre_Fluid.Redstone_SmallOre,
            SmallOre_Fluid.Gold_SmallOre,
            SmallOre_Fluid.Chromite_SmallOre,
            SmallOre_Fluid.Tungstate_SmallOre,
            SmallOre_Fluid.Meteoric_Iron_SmallOre,
            SmallOre_Fluid.Bismuth_SmallOre,
            SmallOre_Fluid.Zinc_SmallOre,
            SmallOre_Fluid.Nickel_SmallOre,
            Void_Fluid.Mars_VoidFluid);
        FluidStack[][] Fake_T2_Mars_Fluid_Split = addSplitAggregateArray(Fake_T2_Mars_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T2_Mars_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ma", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T2);
        }

        // T2 - Phobos - Ph
        FluidStack[] Fake_T2_Phobos_Fluid = addCompressAggregateArray(
            Vein_Fluid.Uranium238_Vein,
            Vein_Fluid.Sulfur_Vein,
            Vein_Fluid.Diamond_Vein,
            Vein_Fluid.Molybdenum_Vein,
            Vein_Fluid.Pitchblende_Vein,
            Vein_Fluid.Quartz_Vein,
            Vein_Fluid.Draconium_Vein,
            Vein_Fluid.Nickel_Vein,
            Vein_Fluid.Arsenic_Vein,
            Vein_Fluid.Bauxite_Vein,
            Vein_Fluid.Gold_Vein,
            Vein_Fluid.Oriharukon_Vein,
            SmallOre_Fluid.Iron_SmallOre,
            SmallOre_Fluid.Copper_SmallOre,
            SmallOre_Fluid.Titanium_SmallOre,
            SmallOre_Fluid.Gold_SmallOre,
            SmallOre_Fluid.Draconium_SmallOre,
            SmallOre_Fluid.Chromite_SmallOre,
            SmallOre_Fluid.Tungstate_SmallOre,
            SmallOre_Fluid.Meteoric_Iron_SmallOre,
            SmallOre_Fluid.Lapis_SmallOre,
            SmallOre_Fluid.Desh_SmallOre);
        FluidStack[][] Fake_T2_Phobos_Fluid_Split = addSplitAggregateArray(Fake_T2_Phobos_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T2_Phobos_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ph", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T2);
        }
    }

    public static void addFakeVoidFluidRecipes_T3() {
        // T3 - Asteroids - As
        FluidStack[] Fake_T3_Asteroids_Fluid = addCompressAggregateArray(
            Vein_Fluid.Tungstate_Vein,
            Vein_Fluid.Ilmenite_Vein,
            Vein_Fluid.Bauxite_Vein,
            Vein_Fluid.Gold_Vein,
            Vein_Fluid.Tetrahedrite_Vein,
            Vein_Fluid.Naquadah_Vein,
            SmallOre_Fluid.Iron_SmallOre,
            SmallOre_Fluid.Titanium_SmallOre,
            SmallOre_Fluid.Lead_SmallOre,
            SmallOre_Fluid.Gold_SmallOre,
            SmallOre_Fluid.Chromite_SmallOre,
            SmallOre_Fluid.Tungstate_SmallOre,
            SmallOre_Fluid.Nickel_SmallOre);
        FluidStack[][] Fake_T3_Asteroids_Fluid_Split = addSplitAggregateArray(
            Fake_T3_Asteroids_Fluid,
            NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T3_Asteroids_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_As", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T3);
        }

        // T3 - Callisto - Ca
        FluidStack[] Fake_T3_Callisto_Fluid = addCompressAggregateArray(
            Vein_Fluid.Tungstate_Vein,
            Vein_Fluid.Plutonium239_Vein,
            Vein_Fluid.Monazite_Vein,
            Vein_Fluid.Ilmenite_Vein,
            Vein_Fluid.Palladium_Vein,
            Vein_Fluid.Callisto_Ice_Vein,
            Vein_Fluid.Copper_Vein,
            Vein_Fluid.Gold_Vein,
            Vein_Fluid.Iron_Vein,
            SmallOre_Fluid.Iron_SmallOre,
            SmallOre_Fluid.Mytryl_SmallOre,
            SmallOre_Fluid.Titanium_SmallOre,
            SmallOre_Fluid.Ledox_SmallOre,
            SmallOre_Fluid.Gold_SmallOre,
            SmallOre_Fluid.Chromite_SmallOre,
            SmallOre_Fluid.Tungstate_SmallOre,
            SmallOre_Fluid.Desh_SmallOre,
            SmallOre_Fluid.Bismuth_SmallOre,
            Void_Fluid.Callisto_VoidFluid);
        FluidStack[][] Fake_T3_Callisto_Fluid_Split = addSplitAggregateArray(
            Fake_T3_Callisto_Fluid,
            NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T3_Callisto_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ca", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T3);
        }

        // T3 - Ceres - Ce
        FluidStack[] Fake_T3_Ceres_Fluid = addCompressAggregateArray(
            Vein_Fluid.Uranium238_Vein,
            Vein_Fluid.Plutonium239_Vein,
            Vein_Fluid.Lapis_Vein,
            Vein_Fluid.Molybdenum_Vein,
            Vein_Fluid.Olivine_Vein,
            Vein_Fluid.Manganese_Vein,
            Vein_Fluid.Palladium_Vein,
            Vein_Fluid.Copper_Vein,
            Vein_Fluid.Soapstone_Vein,
            Vein_Fluid.Iron_Vein,
            Vein_Fluid.Beryllium_Vein,
            Vein_Fluid.Electrotine_Vein,
            Vein_Fluid.Magnetite_Vein,
            SmallOre_Fluid.Titanium_SmallOre,
            SmallOre_Fluid.Oriharukon_SmallOre,
            SmallOre_Fluid.Lead_SmallOre,
            SmallOre_Fluid.Gold_SmallOre,
            SmallOre_Fluid.Chromite_SmallOre,
            SmallOre_Fluid.Tungstate_SmallOre,
            SmallOre_Fluid.Bismuth_SmallOre,
            SmallOre_Fluid.Nickel_SmallOre,
            SmallOre_Fluid.Quantium_SmallOre,
            SmallOre_Fluid.Naquadah_SmallOre,
            Void_Fluid.Ceres_VoidFluid);
        FluidStack[][] Fake_T3_Ceres_Fluid_Split = addSplitAggregateArray(Fake_T3_Ceres_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T3_Ceres_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ce", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T3);
        }

        // T3 - Europa - Eu
        FluidStack[] Fake_T3_Europa_Fluid = addCompressAggregateArray(
            Vein_Fluid.Magnesite_Vein,
            Vein_Fluid.Basaltic_Mineral_Sand_Vein,
            Vein_Fluid.Chrome_Vein,
            Vein_Fluid.Ledox_Vein,
            Vein_Fluid.Tin_Vein);
        FluidStack[][] Fake_T3_Europa_Fluid_Split = addSplitAggregateArray(Fake_T3_Europa_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T3_Europa_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Eu", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T3);
        }

        // T3 - Ganymede - Ga
        FluidStack[] Fake_T3_Ganymede_Fluid = addCompressAggregateArray(
            Vein_Fluid.Uranium238_Vein,
            Vein_Fluid.Tungstate_Vein,
            Vein_Fluid.Plutonium239_Vein,
            Vein_Fluid.Diamond_Vein,
            Vein_Fluid.Redstone_Vein,
            Vein_Fluid.Ilmenite_Vein,
            Vein_Fluid.Palladium_Vein,
            Vein_Fluid.Bauxite_Vein,
            Vein_Fluid.Iron_Vein,
            Vein_Fluid.Tetrahedrite_Vein,
            Vein_Fluid.Galena_Vein,
            SmallOre_Fluid.Saltpeter_SmallOre,
            SmallOre_Fluid.Iron_SmallOre,
            SmallOre_Fluid.Titanium_SmallOre,
            SmallOre_Fluid.Tin_SmallOre,
            SmallOre_Fluid.Lead_SmallOre,
            SmallOre_Fluid.Redstone_SmallOre,
            SmallOre_Fluid.Draconium_SmallOre,
            SmallOre_Fluid.Chromite_SmallOre,
            SmallOre_Fluid.Tungstate_SmallOre,
            SmallOre_Fluid.Lapis_SmallOre,
            SmallOre_Fluid.Zinc_SmallOre);
        FluidStack[][] Fake_T3_Ganymede_Fluid_Split = addSplitAggregateArray(
            Fake_T3_Ganymede_Fluid,
            NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T3_Ganymede_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ga", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T3);
        }

        // T3 - Ross128b - Rb
        FluidStack[] Fake_T3_Ross128b_Fluid = addCompressAggregateArray(
            Vein_Fluid.Bismutite_Bismuthinite_Vein,
            Vein_Fluid.Olenite_FluorBuergerite_ChromoAluminoPovondraite_VanadioOxyDravit_Vein,
            Vein_Fluid.Arsenopyrite_Ferberite_Loellingite_Roquesite_Vein,
            Vein_Fluid.Ferberite_Huebnerite_Loellingite_Vein,
            Vein_Fluid.Djurleite_Bornite_Wittichenite_Vein,
            Vein_Fluid.Thorianite_Vein,
            Vein_Fluid.Fayalite_GreenFuchsite_RedZircon_RedFuchsite_Vein,
            Vein_Fluid.Forsterite_Fayalite_OrangeDescloizite_RedDescloizite_Vein,
            Void_Fluid.Ross128b_VoidFluid);
        FluidStack[][] Fake_T3_Ross128b_Fluid_Split = addSplitAggregateArray(
            Fake_T3_Ross128b_Fluid,
            NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T3_Ross128b_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Rb", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T3);
        }
    }

    public static void addFakeVoidFluidRecipes_T4() {
        // T4 - Io - Io
        FluidStack[] Fake_T4_Io_Fluid = addCompressAggregateArray(
            Vein_Fluid.Plutonium239_Vein,
            Vein_Fluid.Sulfur_Vein,
            Vein_Fluid.Manganese_Vein,
            Vein_Fluid.Pitchblende_Vein,
            Vein_Fluid.Quartz_Vein,
            Vein_Fluid.Pyrolusite_Vein,
            Vein_Fluid.Infused_Gold_Vein,
            Vein_Fluid.Monazite_Vein,
            Vein_Fluid.Palladium_Vein,
            Vein_Fluid.Mytryl_Vein,
            Vein_Fluid.Magnetite_Vein,
            Vein_Fluid.Iridium_Vein,
            Vein_Fluid.Cassiterite_Vein,
            SmallOre_Fluid.Saltpeter_SmallOre,
            SmallOre_Fluid.Iron_SmallOre,
            SmallOre_Fluid.Silver_SmallOre,
            SmallOre_Fluid.Titanium_SmallOre,
            SmallOre_Fluid.Redstone_SmallOre,
            SmallOre_Fluid.Chromite_SmallOre,
            SmallOre_Fluid.Tungstate_SmallOre,
            SmallOre_Fluid.Meteoric_Iron_SmallOre,
            SmallOre_Fluid.Lapis_SmallOre,
            SmallOre_Fluid.Tungsten_SmallOre,
            SmallOre_Fluid.Bismuth_SmallOre,
            SmallOre_Fluid.Zinc_SmallOre,
            SmallOre_Fluid.Quantium_SmallOre,
            SmallOre_Fluid.Naquadah_SmallOre,
            Void_Fluid.Io_VoidFluid);
        FluidStack[][] Fake_T4_Io_Fluid_Split = addSplitAggregateArray(Fake_T4_Io_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T4_Io_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Io", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T4);
        }

        // T4 - Mercury - Me
        FluidStack[] Fake_T4_Mercury_Fluid = addCompressAggregateArray(
            Vein_Fluid.Diamond_Vein,
            Vein_Fluid.Molybdenum_Vein,
            Vein_Fluid.Draconium_Vein,
            Vein_Fluid.Redstone_Vein,
            Vein_Fluid.Ilmenite_Vein,
            Vein_Fluid.Palladium_Vein,
            Vein_Fluid.Arsenic_Vein,
            Vein_Fluid.Bauxite_Vein,
            Vein_Fluid.Iron_Vein,
            Vein_Fluid.Naquadah_Vein,
            Vein_Fluid.Iridium_Vein,
            SmallOre_Fluid.Titanium_SmallOre,
            SmallOre_Fluid.Deep_Iron_SmallOre,
            SmallOre_Fluid.Oriharukon_SmallOre,
            SmallOre_Fluid.Lead_SmallOre,
            SmallOre_Fluid.Redstone_SmallOre,
            SmallOre_Fluid.Ledox_SmallOre,
            SmallOre_Fluid.Chromite_SmallOre,
            SmallOre_Fluid.Tungstate_SmallOre,
            SmallOre_Fluid.Desh_SmallOre,
            SmallOre_Fluid.Bismuth_SmallOre,
            SmallOre_Fluid.Zinc_SmallOre,
            SmallOre_Fluid.Nickel_SmallOre,
            SmallOre_Fluid.Naquadah_SmallOre,
            Void_Fluid.Mercury_VoidFluid);
        FluidStack[][] Fake_T4_Mercury_Fluid_Split = addSplitAggregateArray(Fake_T4_Mercury_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T4_Mercury_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Me", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T4);
        }

        // T4 - Venus - Ve
        FluidStack[] Fake_T4_Venus_Fluid = addCompressAggregateArray(
            Vein_Fluid.Sulfur_Vein,
            Vein_Fluid.Pitchblende_Vein,
            Vein_Fluid.Quartz_Vein,
            Vein_Fluid.Redstone_Vein,
            Vein_Fluid.Monazite_Vein,
            Vein_Fluid.Nickel_Vein,
            Vein_Fluid.Beryllium_Vein,
            Vein_Fluid.Tetrahedrite_Vein,
            Vein_Fluid.Galena_Vein,
            Vein_Fluid.Naquadah_Vein,
            Vein_Fluid.Rutile_Vein,
            Vein_Fluid.Quantium_Vein,
            Vein_Fluid.Iridium_Vein,
            Vein_Fluid.Cassiterite_Vein,
            SmallOre_Fluid.Saltpeter_SmallOre,
            SmallOre_Fluid.Mytryl_SmallOre,
            SmallOre_Fluid.Titanium_SmallOre,
            SmallOre_Fluid.Lead_SmallOre,
            SmallOre_Fluid.Gold_SmallOre,
            SmallOre_Fluid.Draconium_SmallOre,
            SmallOre_Fluid.Chromite_SmallOre,
            SmallOre_Fluid.Tungstate_SmallOre,
            SmallOre_Fluid.Meteoric_Iron_SmallOre,
            SmallOre_Fluid.Tungsten_SmallOre,
            SmallOre_Fluid.Nickel_SmallOre,
            SmallOre_Fluid.Naquadah_SmallOre,
            Void_Fluid.Venus_VoidFluid);
        FluidStack[][] Fake_T4_Venus_Fluid_Split = addSplitAggregateArray(Fake_T4_Venus_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T4_Venus_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ve", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T4);
        }
    }

    public static void addFakeVoidFluidRecipes_T5() {
        // T5 - Enceladus - En
        FluidStack[] Fake_T5_Enceladus_Fluid = addCompressAggregateArray(
            Vein_Fluid.Uranium238_Vein,
            Vein_Fluid.Tungstate_Vein,
            Vein_Fluid.Lapis_Vein,
            Vein_Fluid.Osmium_Vein,
            Vein_Fluid.Monazite_Vein,
            Vein_Fluid.Copper_Vein,
            Vein_Fluid.Vanadium_Vein,
            Vein_Fluid.Ledox_Vein,
            Vein_Fluid.Iridium_Vein,
            SmallOre_Fluid.Saltpeter_SmallOre,
            SmallOre_Fluid.Iron_SmallOre,
            SmallOre_Fluid.Silver_SmallOre,
            SmallOre_Fluid.Titanium_SmallOre,
            SmallOre_Fluid.Ledox_SmallOre,
            SmallOre_Fluid.Neutronium_SmallOre,
            SmallOre_Fluid.Chromite_SmallOre,
            SmallOre_Fluid.Tungstate_SmallOre,
            SmallOre_Fluid.Lapis_SmallOre,
            SmallOre_Fluid.Zinc_SmallOre,
            SmallOre_Fluid.Naquadah_SmallOre);
        FluidStack[][] Fake_T5_Enceladus_Fluid_Split = addSplitAggregateArray(
            Fake_T5_Enceladus_Fluid,
            NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T5_Enceladus_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_En", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T5);
        }

        // T5 - Miranda - Mi
        FluidStack[] Fake_T5_Miranda_Fluid = addCompressAggregateArray(
            Vein_Fluid.Diamond_Vein,
            Vein_Fluid.Osmium_Vein,
            Vein_Fluid.Desh_Vein,
            Vein_Fluid.Draconium_Vein,
            Vein_Fluid.Redstone_Vein,
            Vein_Fluid.Pyrolusite_Vein,
            Vein_Fluid.Ilmenite_Vein,
            Vein_Fluid.Tetrahedrite_Vein,
            Vein_Fluid.Iridium_Vein,
            Vein_Fluid.Cassiterite_Vein,
            SmallOre_Fluid.Iron_SmallOre,
            SmallOre_Fluid.Mytryl_SmallOre,
            SmallOre_Fluid.Titanium_SmallOre,
            SmallOre_Fluid.Gold_SmallOre,
            SmallOre_Fluid.Tungstate_SmallOre,
            SmallOre_Fluid.Desh_SmallOre,
            Void_Fluid.Miranda_VoidFluid);
        FluidStack[][] Fake_T5_Miranda_Fluid_Split = addSplitAggregateArray(Fake_T5_Miranda_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T5_Miranda_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mi", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T5);
        }

        // T5 - Oberon - Ob
        FluidStack[] Fake_T5_Oberon_Fluid = addCompressAggregateArray(
            Vein_Fluid.Tungstate_Vein,
            Vein_Fluid.Osmium_Vein,
            Vein_Fluid.Tungsten_Vein,
            Vein_Fluid.Manganese_Vein,
            Vein_Fluid.Pitchblende_Vein,
            Vein_Fluid.Palladium_Vein,
            Vein_Fluid.Iron_Vein,
            Vein_Fluid.Galena_Vein,
            Vein_Fluid.Naquadah_Vein,
            SmallOre_Fluid.Silver_SmallOre,
            SmallOre_Fluid.Titanium_SmallOre,
            SmallOre_Fluid.Lead_SmallOre,
            SmallOre_Fluid.Ledox_SmallOre,
            SmallOre_Fluid.Neutronium_SmallOre,
            SmallOre_Fluid.Draconium_SmallOre,
            SmallOre_Fluid.Chromite_SmallOre,
            SmallOre_Fluid.Tungstate_SmallOre,
            SmallOre_Fluid.Lapis_SmallOre,
            Void_Fluid.Oberon_VoidFluid);
        FluidStack[][] Fake_T5_Oberon_Fluid_Split = addSplitAggregateArray(Fake_T5_Oberon_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T5_Oberon_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ob", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T5);
        }

        // T5 - Titan - Ti
        FluidStack[] Fake_T5_Titan_Fluid = addCompressAggregateArray(
            Vein_Fluid.Diamond_Vein,
            Vein_Fluid.Molybdenum_Vein,
            Vein_Fluid.Osmium_Vein,
            Vein_Fluid.Manganese_Vein,
            Vein_Fluid.Infused_Gold_Vein,
            Vein_Fluid.Monazite_Vein,
            Vein_Fluid.Nickel_Vein,
            Vein_Fluid.Ilmenite_Vein,
            Vein_Fluid.Arsenic_Vein,
            Vein_Fluid.Bauxite_Vein,
            Vein_Fluid.Beryllium_Vein,
            Vein_Fluid.Naquadah_Vein,
            Vein_Fluid.Rutile_Vein,
            Vein_Fluid.Iridium_Vein,
            SmallOre_Fluid.Iron_SmallOre,
            SmallOre_Fluid.Silver_SmallOre,
            SmallOre_Fluid.Titanium_SmallOre,
            SmallOre_Fluid.Oriharukon_SmallOre,
            SmallOre_Fluid.Tin_SmallOre,
            SmallOre_Fluid.Redstone_SmallOre,
            SmallOre_Fluid.Neutronium_SmallOre,
            SmallOre_Fluid.Chromite_SmallOre,
            SmallOre_Fluid.Tungstate_SmallOre,
            SmallOre_Fluid.Zinc_SmallOre,
            SmallOre_Fluid.Quantium_SmallOre,
            Void_Fluid.Titan_VoidFluid);
        FluidStack[][] Fake_T5_Titan_Fluid_Split = addSplitAggregateArray(Fake_T5_Titan_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T5_Titan_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ti", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T5);
        }

        // T5 - Ross128ba - Ra
        FluidStack[] Fake_T5_Ross128ba_Fluid = addCompressAggregateArray(
            Vein_Fluid.Olenite_FluorBuergerite_ChromoAluminoPovondraite_VanadioOxyDravit_Vein,
            Vein_Fluid.Ferberite_Huebnerite_Loellingite_Vein,
            Vein_Fluid.Hedenbergite_Fayalite_OrangeDescloizite_RedDescloizite_Vein,
            Vein_Fluid.Prasiolite_Hedenbergite_Vein,
            Vein_Fluid.BArTiMaEuSNeK_Vein,
            Vein_Fluid.Tiberium_Vein,
            Vein_Fluid.Fluorspar_Vein,
            Void_Fluid.Ross128ba_VoidFluid);
        FluidStack[][] Fake_T5_Ross128ba_Fluid_Split = addSplitAggregateArray(
            Fake_T5_Ross128ba_Fluid,
            NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T5_Ross128ba_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ra", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T5);
        }
    }

    public static void addFakeVoidFluidRecipes_T6() {
        // T6 - Proteus - Pr
        FluidStack[] Fake_T6_Proteus_Fluid = addCompressAggregateArray(
            Vein_Fluid.Uranium238_Vein,
            Vein_Fluid.Diamond_Vein,
            Vein_Fluid.Molybdenum_Vein,
            Vein_Fluid.Osmium_Vein,
            Vein_Fluid.Tungsten_Vein,
            Vein_Fluid.Quartz_Vein,
            Vein_Fluid.Infused_Gold_Vein,
            Vein_Fluid.Ilmenite_Vein,
            Vein_Fluid.Copper_Vein,
            Vein_Fluid.Vanadium_Vein,
            Vein_Fluid.Bauxite_Vein,
            Vein_Fluid.Neutronium_Vein,
            SmallOre_Fluid.Saltpeter_SmallOre,
            SmallOre_Fluid.Copper_SmallOre,
            SmallOre_Fluid.Silver_SmallOre,
            SmallOre_Fluid.Mytryl_SmallOre,
            SmallOre_Fluid.Titanium_SmallOre,
            SmallOre_Fluid.Tin_SmallOre,
            SmallOre_Fluid.Redstone_SmallOre,
            SmallOre_Fluid.Neutronium_SmallOre,
            SmallOre_Fluid.Chromite_SmallOre,
            SmallOre_Fluid.Tungstate_SmallOre,
            SmallOre_Fluid.Desh_SmallOre,
            SmallOre_Fluid.Bismuth_SmallOre,
            SmallOre_Fluid.Zinc_SmallOre,
            SmallOre_Fluid.Naquadah_SmallOre,
            Void_Fluid.Proteus_VoidFluid);
        FluidStack[][] Fake_T6_Proteus_Fluid_Split = addSplitAggregateArray(Fake_T6_Proteus_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T6_Proteus_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Pr", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T6);
        }

        // T6 - Triton - Tr
        FluidStack[] Fake_T6_Triton_Fluid = addCompressAggregateArray(
            Vein_Fluid.Tungstate_Vein,
            Vein_Fluid.Tungsten_Vein,
            Vein_Fluid.Manganese_Vein,
            Vein_Fluid.Monazite_Vein,
            Vein_Fluid.Nickel_Vein,
            Vein_Fluid.Thorium_Vein,
            Vein_Fluid.Neutronium_Vein,
            Vein_Fluid.Gold_Vein,
            Vein_Fluid.Galena_Vein,
            Vein_Fluid.Niobium_Vein,
            Vein_Fluid.Iridium_Vein,
            SmallOre_Fluid.Iron_SmallOre,
            SmallOre_Fluid.Copper_SmallOre,
            SmallOre_Fluid.Silver_SmallOre,
            SmallOre_Fluid.Titanium_SmallOre,
            SmallOre_Fluid.Oriharukon_SmallOre,
            SmallOre_Fluid.Lead_SmallOre,
            SmallOre_Fluid.Neutronium_SmallOre,
            SmallOre_Fluid.Black_Plutonium_SmallOre,
            SmallOre_Fluid.Chromite_SmallOre,
            SmallOre_Fluid.Tungstate_SmallOre,
            SmallOre_Fluid.Desh_SmallOre,
            Void_Fluid.Triton_VoidFluid);
        FluidStack[][] Fake_T6_Triton_Fluid_Split = addSplitAggregateArray(Fake_T6_Triton_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T6_Triton_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Tr", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T6);
        }
    }

    public static void addFakeVoidFluidRecipes_T7() {
        // T7 - Haumea - Ha
        FluidStack[] Fake_T7_Haumea_Fluid = addCompressAggregateArray(
            Vein_Fluid.Uranium238_Vein,
            Vein_Fluid.Tungstate_Vein,
            Vein_Fluid.Olivine_Vein,
            Vein_Fluid.Pitchblende_Vein,
            Vein_Fluid.Infused_Gold_Vein,
            Vein_Fluid.Monazite_Vein,
            Vein_Fluid.Thorium_Vein,
            Vein_Fluid.Bauxite_Vein,
            Vein_Fluid.Neutronium_Vein,
            Vein_Fluid.Nether_Star_Vein,
            Vein_Fluid.Beryllium_Vein,
            Vein_Fluid.Naquadah_Vein,
            SmallOre_Fluid.Iron_SmallOre,
            SmallOre_Fluid.Titanium_SmallOre,
            SmallOre_Fluid.Oriharukon_SmallOre,
            SmallOre_Fluid.Ledox_SmallOre,
            SmallOre_Fluid.Neutronium_SmallOre,
            SmallOre_Fluid.Black_Plutonium_SmallOre,
            SmallOre_Fluid.Draconium_SmallOre,
            SmallOre_Fluid.Chromite_SmallOre,
            SmallOre_Fluid.Desh_SmallOre,
            SmallOre_Fluid.Zinc_SmallOre,
            SmallOre_Fluid.Quantium_SmallOre);
        FluidStack[][] Fake_T7_Haumea_Fluid_Split = addSplitAggregateArray(Fake_T7_Haumea_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T7_Haumea_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ha", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T7);
        }

        // T7 - Makemake - MM
        FluidStack[] Fake_T7_Makemake_Fluid = addCompressAggregateArray(
            Vein_Fluid.Uranium238_Vein,
            Vein_Fluid.Tungstate_Vein,
            Vein_Fluid.Olivine_Vein,
            Vein_Fluid.Pitchblende_Vein,
            Vein_Fluid.Monazite_Vein,
            Vein_Fluid.Black_Plutonium_Vein,
            Vein_Fluid.Vanadium_Vein,
            Vein_Fluid.Bauxite_Vein,
            Vein_Fluid.Neutronium_Vein,
            Vein_Fluid.Beryllium_Vein,
            Vein_Fluid.Red_Garnet_Vein,
            Vein_Fluid.Niobium_Vein,
            Vein_Fluid.Magnetite_Vein,
            SmallOre_Fluid.Mytryl_SmallOre,
            SmallOre_Fluid.Titanium_SmallOre,
            SmallOre_Fluid.Oriharukon_SmallOre,
            SmallOre_Fluid.Lead_SmallOre,
            SmallOre_Fluid.Neutronium_SmallOre,
            SmallOre_Fluid.Black_Plutonium_SmallOre,
            SmallOre_Fluid.Draconium_SmallOre,
            SmallOre_Fluid.Chromite_SmallOre,
            SmallOre_Fluid.Desh_SmallOre,
            SmallOre_Fluid.Bismuth_SmallOre,
            SmallOre_Fluid.Nickel_SmallOre,
            SmallOre_Fluid.Quantium_SmallOre,
            Void_Fluid.Makemake_VoidFluid);
        FluidStack[][] Fake_T7_Makemake_Fluid_Split = addSplitAggregateArray(
            Fake_T7_Makemake_Fluid,
            NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T7_Makemake_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_MM", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T7);
        }

        // T7 - Pluto - Pl
        FluidStack[] Fake_T7_Pluto_Fluid = addCompressAggregateArray(
            Vein_Fluid.Tungstate_Vein,
            Vein_Fluid.Diamond_Vein,
            Vein_Fluid.Molybdenum_Vein,
            Vein_Fluid.Osmium_Vein,
            Vein_Fluid.Tungsten_Vein,
            Vein_Fluid.Black_Plutonium_Vein,
            Vein_Fluid.Ilmenite_Vein,
            Vein_Fluid.Palladium_Vein,
            Vein_Fluid.Thorium_Vein,
            Vein_Fluid.Bauxite_Vein,
            Vein_Fluid.Neutronium_Vein,
            Vein_Fluid.Gold_Vein,
            Vein_Fluid.Iron_Vein,
            Vein_Fluid.Beryllium_Vein,
            Vein_Fluid.Naquadah_Vein,
            SmallOre_Fluid.Silver_SmallOre,
            SmallOre_Fluid.Titanium_SmallOre,
            SmallOre_Fluid.Lead_SmallOre,
            SmallOre_Fluid.Ledox_SmallOre,
            SmallOre_Fluid.Neutronium_SmallOre,
            SmallOre_Fluid.Gold_SmallOre,
            SmallOre_Fluid.Black_Plutonium_SmallOre,
            SmallOre_Fluid.Draconium_SmallOre,
            SmallOre_Fluid.Chromite_SmallOre,
            SmallOre_Fluid.Tungstate_SmallOre,
            SmallOre_Fluid.Meteoric_Iron_SmallOre,
            SmallOre_Fluid.Nickel_SmallOre,
            SmallOre_Fluid.Quantium_SmallOre,
            SmallOre_Fluid.Naquadah_SmallOre,
            Void_Fluid.Pluto_VoidFluid);
        FluidStack[][] Fake_T7_Pluto_Fluid_Split = addSplitAggregateArray(Fake_T7_Pluto_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T7_Pluto_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Pl", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T7);
        }
    }

    public static void addFakeVoidFluidRecipes_T8() {
        // T8 - BarnardC - BC
        FluidStack[] Fake_T8_BarnardC_Fluid = addCompressAggregateArray(
            Vein_Fluid.Oilsands_Vein,
            Vein_Fluid.Osmium_Vein,
            Vein_Fluid.Tungsten_Vein,
            Vein_Fluid.Samarium_Vein,
            Vein_Fluid.Mica_Vein,
            Vein_Fluid.Black_Plutonium_Vein,
            Vein_Fluid.Arsenic_Vein,
            Vein_Fluid.Lignite_Coal_Vein,
            Vein_Fluid.Basaltic_Mineral_Sand_Vein,
            Vein_Fluid.Salt_Vein,
            Void_Fluid.BarnardC_VoidFluid);
        FluidStack[][] Fake_T8_BarnardC_Fluid_Split = addSplitAggregateArray(
            Fake_T8_BarnardC_Fluid,
            NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T8_BarnardC_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BC", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T8);
        }

        // T8 - BarnardE - BE
        FluidStack[] Fake_T8_BarnardE_Fluid = addCompressAggregateArray(
            Vein_Fluid.Uranium238_Vein,
            Vein_Fluid.Molybdenum_Vein,
            Vein_Fluid.Olivine_Vein,
            Vein_Fluid.Tungsten_Vein,
            Vein_Fluid.Manganese_Vein,
            Vein_Fluid.Infused_Gold_Vein,
            Vein_Fluid.Rare_Earth_Vein,
            Vein_Fluid.Thorium_Vein,
            Vein_Fluid.Copper_Vein,
            Vein_Fluid.Neutronium_Vein,
            Vein_Fluid.Nether_Star_Vein,
            Vein_Fluid.Naquadah_Vein,
            Vein_Fluid.Magnetite_Vein,
            SmallOre_Fluid.Awakened_Draconium_SmallOre,
            SmallOre_Fluid.Iron_SmallOre,
            SmallOre_Fluid.Titanium_SmallOre,
            SmallOre_Fluid.Neutronium_SmallOre,
            SmallOre_Fluid.Black_Plutonium_SmallOre,
            SmallOre_Fluid.Zinc_SmallOre,
            SmallOre_Fluid.Nickel_SmallOre,
            SmallOre_Fluid.Naquadah_SmallOre,
            Void_Fluid.BarnardE_VoidFluid);
        FluidStack[][] Fake_T8_BarnardE_Fluid_Split = addSplitAggregateArray(
            Fake_T8_BarnardE_Fluid,
            NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T8_BarnardE_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BE", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T8);
        }

        // T8 - BarnardF - BF
        FluidStack[] Fake_T8_BarnardF_Fluid = addCompressAggregateArray(
            Vein_Fluid.Diamond_Vein,
            Vein_Fluid.Tungsten_Vein,
            Vein_Fluid.Manganese_Vein,
            Vein_Fluid.Pitchblende_Vein,
            Vein_Fluid.Redstone_Vein,
            Vein_Fluid.Monazite_Vein,
            Vein_Fluid.Rare_Earth_Vein,
            Vein_Fluid.Thorium_Vein,
            Vein_Fluid.Copper_Vein,
            Vein_Fluid.Vanadium_Vein,
            Vein_Fluid.Neutronium_Vein,
            Vein_Fluid.Gold_Vein,
            Vein_Fluid.Beryllium_Vein,
            Vein_Fluid.Red_Garnet_Vein,
            Vein_Fluid.Naquadah_Vein,
            Vein_Fluid.Niobium_Vein,
            SmallOre_Fluid.Awakened_Draconium_SmallOre,
            SmallOre_Fluid.Iron_SmallOre,
            SmallOre_Fluid.Titanium_SmallOre,
            SmallOre_Fluid.Neutronium_SmallOre,
            SmallOre_Fluid.Gold_SmallOre,
            SmallOre_Fluid.Black_Plutonium_SmallOre,
            SmallOre_Fluid.Realgar_SmallOre,
            SmallOre_Fluid.Nickel_SmallOre,
            SmallOre_Fluid.Naquadah_SmallOre,
            SmallOre_Fluid.Bedrockium_SmallOre,
            Void_Fluid.BarnardF_VoidFluid);
        FluidStack[][] Fake_T8_BarnardF_Fluid_Split = addSplitAggregateArray(
            Fake_T8_BarnardF_Fluid,
            NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T8_BarnardF_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BF", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T8);
        }

        // T8 - α Centauri Bb - CB
        FluidStack[] Fake_T8_Centauri_Fluid = addCompressAggregateArray(
            Vein_Fluid.Sulfur_Vein,
            Vein_Fluid.Manganese_Vein,
            Vein_Fluid.Samarium_Vein,
            Vein_Fluid.Pitchblende_Vein,
            Vein_Fluid.Quartz_Vein,
            Vein_Fluid.Redstone_Vein,
            Vein_Fluid.Black_Plutonium_Vein,
            Vein_Fluid.Rare_Earth_Vein,
            Vein_Fluid.Beryllium_Vein,
            Vein_Fluid.Electrotine_Vein,
            Vein_Fluid.Tetrahedrite_Vein,
            Vein_Fluid.Tin_Vein,
            Vein_Fluid.Nether_Quartz_Vein,
            Void_Fluid.Centauri_VoidFluid);
        FluidStack[][] Fake_T8_Centauri_Fluid_Split = addSplitAggregateArray(
            Fake_T8_Centauri_Fluid,
            NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T8_Centauri_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_CB", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T8);
        }

        // T8 - TCetiE - TE
        FluidStack[] Fake_T8_TCetiE_Fluid = addCompressAggregateArray(
            Vein_Fluid.Oilsands_Vein,
            Vein_Fluid.Magnesite_Vein,
            Vein_Fluid.Quartz_Vein,
            Vein_Fluid.Black_Plutonium_Vein,
            Vein_Fluid.Ilmenite_Vein,
            Vein_Fluid.Bauxite_Vein,
            Vein_Fluid.Gold_Vein,
            Vein_Fluid.Kaolinite_Vein,
            Vein_Fluid.Nether_Star_Vein,
            Vein_Fluid.Apatite_Vein,
            Vein_Fluid.Chrome_Vein,
            Vein_Fluid.Magnetite_Vein,
            Vein_Fluid.Salt_Vein,
            Vein_Fluid.Cassiterite_Vein,
            SmallOre_Fluid.Awakened_Draconium_SmallOre,
            SmallOre_Fluid.Neutronium_SmallOre,
            SmallOre_Fluid.Lapis_SmallOre,
            Void_Fluid.TCetiE_VoidFluid);
        FluidStack[][] Fake_T8_TCetiE_Fluid_Split = addSplitAggregateArray(Fake_T8_TCetiE_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T8_TCetiE_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_TE", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T8);
        }

        // T8 - VegaB - VB
        FluidStack[] Fake_T8_VegaB_Fluid = addCompressAggregateArray(
            Vein_Fluid.Tungstate_Vein,
            Vein_Fluid.Lapis_Vein,
            Vein_Fluid.Pitchblende_Vein,
            Vein_Fluid.Redstone_Vein,
            Vein_Fluid.Infused_Gold_Vein,
            Vein_Fluid.Rare_Earth_Vein,
            Vein_Fluid.Thorium_Vein,
            Vein_Fluid.Arsenic_Vein,
            Vein_Fluid.Vanadium_Vein,
            Vein_Fluid.Neutronium_Vein,
            Vein_Fluid.Gold_Vein,
            Vein_Fluid.Nether_Star_Vein,
            Vein_Fluid.Red_Garnet_Vein,
            Vein_Fluid.Tetrahedrite_Vein,
            Vein_Fluid.Galena_Vein,
            Vein_Fluid.Naquadah_Vein,
            Vein_Fluid.Niobium_Vein,
            SmallOre_Fluid.Awakened_Draconium_SmallOre,
            SmallOre_Fluid.Silver_SmallOre,
            SmallOre_Fluid.Lead_SmallOre,
            SmallOre_Fluid.Neutronium_SmallOre,
            SmallOre_Fluid.Infinity_Catalyst_SmallOre,
            SmallOre_Fluid.Black_Plutonium_SmallOre,
            SmallOre_Fluid.Chromite_SmallOre,
            SmallOre_Fluid.Bismuth_SmallOre);
        FluidStack[][] Fake_T8_VegaB_Fluid_Split = addSplitAggregateArray(Fake_T8_VegaB_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T8_VegaB_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_VB", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T8);
        }
    }

    public static void addFakeVoidFluidRecipes_T9() {
        // T9 - Anubis - An
        FluidStack[] Fake_T9_Anubis_Fluid = addCompressAggregateArray(
            Vein_Fluid.Sulfur_Vein,
            Vein_Fluid.Infinity_Catalyst_Vein,
            Vein_Fluid.Olivine_Vein,
            Vein_Fluid.Desh_Vein,
            Vein_Fluid.Mica_Vein,
            Vein_Fluid.Cryolite_Vein,
            Vein_Fluid.Dolomite_Vein,
            Vein_Fluid.Callisto_Ice_Vein,
            Vein_Fluid.Soapstone_Vein,
            Vein_Fluid.Mytryl_Vein,
            Vein_Fluid.Rutile_Vein,
            Vein_Fluid.Basaltic_Mineral_Sand_Vein,
            SmallOre_Fluid.Infinity_Catalyst_SmallOre);
        FluidStack[][] Fake_T9_Anubis_Fluid_Split = addSplitAggregateArray(Fake_T9_Anubis_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T9_Anubis_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_An", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T9);
        }

        // T9 - Horus - Ho
        FluidStack[] Fake_T9_Horus_Fluid = addCompressAggregateArray(
            Vein_Fluid.Magnesite_Vein,
            Vein_Fluid.Certus_Quartz_Vein,
            Vein_Fluid.Quartz_Vein,
            Vein_Fluid.Draconium_Vein,
            Vein_Fluid.Sapphire_Vein,
            Vein_Fluid.Black_Plutonium_Vein,
            Vein_Fluid.Cosmic_Neutronium_Vein,
            Vein_Fluid.Mytryl_Vein,
            Vein_Fluid.Nether_Star_Vein,
            Vein_Fluid.Red_Garnet_Vein,
            Vein_Fluid.Oriharukon_Vein,
            Vein_Fluid.Quantium_Vein,
            Vein_Fluid.Ledox_Vein,
            SmallOre_Fluid.Amethyst_SmallOre,
            SmallOre_Fluid.Red_Garnet_SmallOre,
            SmallOre_Fluid.Yellow_Garnet_SmallOre,
            SmallOre_Fluid.Tanzanite_SmallOre,
            SmallOre_Fluid.Spinel_SmallOre,
            SmallOre_Fluid.Opal_SmallOre,
            SmallOre_Fluid.Charged_Certus_Quartz_SmallOre,
            SmallOre_Fluid.Mytryl_SmallOre,
            SmallOre_Fluid.Ruby_SmallOre,
            SmallOre_Fluid.Emerald_SmallOre,
            SmallOre_Fluid.Blue_Topaz_SmallOre,
            SmallOre_Fluid.Topaz_SmallOre,
            SmallOre_Fluid.Certus_Quartz_SmallOre,
            SmallOre_Fluid.Jade_SmallOre,
            SmallOre_Fluid.Green_Sapphire_SmallOre,
            SmallOre_Fluid.Sapphire_SmallOre,
            SmallOre_Fluid.Jasper_SmallOre,
            SmallOre_Fluid.Olivine_SmallOre);
        FluidStack[][] Fake_T9_Horus_Fluid_Split = addSplitAggregateArray(Fake_T9_Horus_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T9_Horus_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ho", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T9);
        }

        // T9 - Maahes - Mh
        FluidStack[] Fake_T9_Maahes_Fluid = addCompressAggregateArray(
            Vein_Fluid.Naquadria_Vein,
            Vein_Fluid.Cryolite_Vein,
            Vein_Fluid.Callisto_Ice_Vein,
            Vein_Fluid.Vanadium_Vein,
            Vein_Fluid.Soapstone_Vein,
            Vein_Fluid.Neutronium_Vein,
            Vein_Fluid.Platinum_Vein,
            Vein_Fluid.Naquadria_Vein,
            Vein_Fluid.Basaltic_Mineral_Sand_Vein,
            Vein_Fluid.Quantium_Vein,
            Vein_Fluid.Chrome_Vein);
        FluidStack[][] Fake_T9_Maahes_Fluid_Split = addSplitAggregateArray(Fake_T9_Maahes_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T9_Maahes_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mh", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T9);
        }

        // T9 - MehenBelt - MB
        FluidStack[] Fake_T9_MehenBelt_Fluid = addCompressAggregateArray(
            Vein_Fluid.Uranium238_Vein,
            Vein_Fluid.Lapis_Vein,
            Vein_Fluid.Awakened_Draconium_Vein,
            Vein_Fluid.Olivine_Vein,
            Vein_Fluid.Osmium_Vein,
            Vein_Fluid.Nickel_Vein,
            Vein_Fluid.Ilmenite_Vein,
            Vein_Fluid.Palladium_Vein,
            Vein_Fluid.Neutronium_Vein,
            Vein_Fluid.Platinum_Vein,
            Vein_Fluid.Iridium_Vein,
            Vein_Fluid.Cassiterite_Vein,
            SmallOre_Fluid.Titanium_SmallOre,
            SmallOre_Fluid.Tin_SmallOre,
            SmallOre_Fluid.Neutronium_SmallOre,
            SmallOre_Fluid.Chromite_SmallOre,
            SmallOre_Fluid.Lapis_SmallOre,
            SmallOre_Fluid.Nickel_SmallOre,
            SmallOre_Fluid.Olivine_SmallOre);
        FluidStack[][] Fake_T9_MehenBelt_Fluid_Split = addSplitAggregateArray(
            Fake_T9_MehenBelt_Fluid,
            NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T9_MehenBelt_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_MB", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T9);
        }

        // T9 - Neper - Np
        FluidStack[] Fake_T9_Neper_Fluid = addCompressAggregateArray(
            Vein_Fluid.Tungsten_Vein,
            Vein_Fluid.Terra_Aer_Vein,
            Vein_Fluid.Certus_Quartz_Vein,
            Vein_Fluid.Quartzite_Vein,
            Vein_Fluid.Dilithium_Vein,
            Vein_Fluid.Mica_Vein,
            Vein_Fluid.Dolomite_Vein,
            Vein_Fluid.Arsenic_Vein,
            Vein_Fluid.Perditio_Ordo_Vein,
            Vein_Fluid.Kaolinite_Vein,
            Vein_Fluid.Aqua_Ignis_Amber_Vein,
            Vein_Fluid.Nether_Quartz_Vein);
        FluidStack[][] Fake_T9_Neper_Fluid_Split = addSplitAggregateArray(Fake_T9_Neper_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T9_Neper_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Np", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T9);
        }

        // T9 - Seth - Se
        FluidStack[] Fake_T9_Seth_Fluid = addCompressAggregateArray(
            Vein_Fluid.Osmium_Vein,
            Vein_Fluid.Samarium_Vein,
            Vein_Fluid.Draconium_Vein,
            Vein_Fluid.Monazite_Vein,
            Vein_Fluid.Palladium_Vein,
            Vein_Fluid.Bauxite_Vein,
            Vein_Fluid.Gold_Vein,
            Vein_Fluid.Raw_Tengam_Vein,
            Vein_Fluid.Magnetite_Vein,
            Vein_Fluid.Iridium_Vein,
            Vein_Fluid.Cassiterite_Vein,
            SmallOre_Fluid.Awakened_Draconium_SmallOre,
            SmallOre_Fluid.Draconium_SmallOre);
        FluidStack[][] Fake_T9_Seth_Fluid_Split = addSplitAggregateArray(Fake_T9_Seth_Fluid, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T9_Seth_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Se", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T9);
        }
    }
}
