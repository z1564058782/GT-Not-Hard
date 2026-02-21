package Recipes.SingularityRecipes_VoidFluid;

import static util.AggregateFluidStackArray.addAggregateArray;

import java.util.HashMap;
import java.util.Map;

import net.minecraftforge.fluids.FluidStack;

public class SingularityFluidRecipes {

    public static final Map<String, FluidStack[]> VoidFluidRecipes_T0 = new HashMap<>();
    public static final Map<String, FluidStack[]> VoidFluidRecipes_T1 = new HashMap<>();
    public static final Map<String, FluidStack[]> VoidFluidRecipes_T2 = new HashMap<>();
    public static final Map<String, FluidStack[]> VoidFluidRecipes_T3 = new HashMap<>();
    public static final Map<String, FluidStack[]> VoidFluidRecipes_T4 = new HashMap<>();
    public static final Map<String, FluidStack[]> VoidFluidRecipes_T5 = new HashMap<>();
    public static final Map<String, FluidStack[]> VoidFluidRecipes_T6 = new HashMap<>();
    public static final Map<String, FluidStack[]> VoidFluidRecipes_T7 = new HashMap<>();
    public static final Map<String, FluidStack[]> VoidFluidRecipes_T8 = new HashMap<>();
    public static final Map<String, FluidStack[]> VoidFluidRecipes_T9 = new HashMap<>();

    public static void addVoidFluidRecipes_T0() {
        // T0 - Overworld - Ow
        FluidStack[] T0_Overworld_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T0.put("Ow", T0_Overworld_Fluid);

        // T0 - Nether - Ne
        FluidStack[] T0_Nether_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T0.put("Ne", T0_Nether_Fluid);

        // T0 - Twilight - TF
        FluidStack[] T0_Twilight_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T0.put("TF", T0_Twilight_Fluid);

        // T0 - TheEnd - ED
        FluidStack[] T0_TheEnd_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T0.put("ED", T0_TheEnd_Fluid);

        // T0 - EndAsteroid - EA
        FluidStack[] T0_EndAsteroid_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T0.put("EA", T0_EndAsteroid_Fluid);
    }

    public static void addVoidFluidRecipes_T1() {
        // T1 - Moon - Mo
        FluidStack[] T1_Moon_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T1.put("Mo", T1_Moon_Fluid);
    }

    public static void addVoidFluidRecipes_T2() {
        // T2 - Deimos - De
        FluidStack[] T2_Deimos_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T2.put("De", T2_Deimos_Fluid);

        // T2 - Mars - Ma
        FluidStack[] T2_Mars_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T2.put("Ma", T2_Mars_Fluid);

        // T2 - Phobos - Ph
        FluidStack[] T2_Phobos_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T2.put("Ph", T2_Phobos_Fluid);
    }

    public static void addVoidFluidRecipes_T3() {
        // T3 - Asteroids - As
        FluidStack[] T3_Asteroids_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T3.put("As", T3_Asteroids_Fluid);

        // T3 - Callisto - Ca
        FluidStack[] T3_Callisto_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T3.put("Ca", T3_Callisto_Fluid);

        // T3 - Ceres - Ce
        FluidStack[] T3_Ceres_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T3.put("Ce", T3_Ceres_Fluid);

        // T3 - Europa - Eu
        FluidStack[] T3_Europa_Fluid = addAggregateArray(
            Vein_Fluid.Magnesite_Vein,
            Vein_Fluid.Basaltic_Mineral_Sand_Vein,
            Vein_Fluid.Chrome_Vein,
            Vein_Fluid.Ledox_Vein,
            Vein_Fluid.Tin_Vein);
        VoidFluidRecipes_T3.put("Eu", T3_Europa_Fluid);

        // T3 - Ganymede - Ga
        FluidStack[] T3_Ganymede_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T3.put("Ga", T3_Ganymede_Fluid);

        // T3 - Ross128b - Rb
        FluidStack[] T3_Ross128b_Fluid = addAggregateArray(
            Vein_Fluid.Bismutite_Bismuthinite_Vein,
            Vein_Fluid.Olenite_FluorBuergerite_ChromoAluminoPovondraite_VanadioOxyDravit_Vein,
            Vein_Fluid.Arsenopyrite_Ferberite_Loellingite_Roquesite_Vein,
            Vein_Fluid.Ferberite_Huebnerite_Loellingite_Vein,
            Vein_Fluid.Djurleite_Bornite_Wittichenite_Vein,
            Vein_Fluid.Thorianite_Vein,
            Vein_Fluid.Fayalite_GreenFuchsite_RedZircon_RedFuchsite_Vein,
            Vein_Fluid.Forsterite_Fayalite_OrangeDescloizite_RedDescloizite_Vein,
            Void_Fluid.Ross128b_VoidFluid);
        VoidFluidRecipes_T3.put("Rb", T3_Ross128b_Fluid);
    }

    public static void addVoidFluidRecipes_T4() {
        // T4 - Io - Io
        FluidStack[] T4_Io_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T4.put("Io", T4_Io_Fluid);

        // T4 - Mercury - Me
        FluidStack[] T4_Mercury_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T4.put("Me", T4_Mercury_Fluid);

        // T4 - Venus - Ve
        FluidStack[] T4_Venus_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T4.put("Ve", T4_Venus_Fluid);
    }

    public static void addVoidFluidRecipes_T5() {
        // T5 - Enceladus - En
        FluidStack[] T5_Enceladus_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T5.put("En", T5_Enceladus_Fluid);

        // T5 - Miranda - Mi
        FluidStack[] T5_Miranda_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T5.put("Mi", T5_Miranda_Fluid);

        // T5 - Oberon - Ob
        FluidStack[] T5_Oberon_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T5.put("Ob", T5_Oberon_Fluid);

        // T5 - Titan - Ti
        FluidStack[] T5_Titan_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T5.put("Ti", T5_Titan_Fluid);

        // T5 - Ross128ba - Ra
        FluidStack[] T5_Ross128ba_Fluid = addAggregateArray(
            Vein_Fluid.Olenite_FluorBuergerite_ChromoAluminoPovondraite_VanadioOxyDravit_Vein,
            Vein_Fluid.Ferberite_Huebnerite_Loellingite_Vein,
            Vein_Fluid.Hedenbergite_Fayalite_OrangeDescloizite_RedDescloizite_Vein,
            Vein_Fluid.Prasiolite_Hedenbergite_Vein,
            Vein_Fluid.BArTiMaEuSNeK_Vein,
            Vein_Fluid.Tiberium_Vein,
            Vein_Fluid.Fluorspar_Vein,
            Void_Fluid.Ross128ba_VoidFluid);
        VoidFluidRecipes_T5.put("Ra", T5_Ross128ba_Fluid);
    }

    public static void addVoidFluidRecipes_T6() {
        // T6 - Proteus - Pr
        FluidStack[] T6_Proteus_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T6.put("Pr", T6_Proteus_Fluid);

        // T6 - Triton - Tr
        FluidStack[] T6_Triton_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T6.put("Tr", T6_Triton_Fluid);
    }

    public static void addVoidFluidRecipes_T7() {
        // T7 - Haumea - Ha
        FluidStack[] T7_Haumea_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T7.put("Ha", T7_Haumea_Fluid);

        // T7 - Makemake - MM
        FluidStack[] T7_Makemake_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T7.put("MM", T7_Makemake_Fluid);

        // T7 - Pluto - Pl
        FluidStack[] T7_Pluto_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T7.put("Pl", T7_Pluto_Fluid);
    }

    public static void addVoidFluidRecipes_T8() {
        // T8 - BarnardC - BC
        FluidStack[] T8_BarnardC_Fluid = addAggregateArray(
            // Oilsands Vein
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
        VoidFluidRecipes_T8.put("BC", T8_BarnardC_Fluid);

        // T8 - BarnardE - BE
        FluidStack[] T8_BarnardE_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T8.put("BE", T8_BarnardE_Fluid);

        // T8 - BarnardF - BF
        FluidStack[] T8_BarnardF_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T8.put("BF", T8_BarnardF_Fluid);

        // T8 - α Centauri Bb - CB
        FluidStack[] T8_Centauri_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T8.put("CB", T8_Centauri_Fluid);

        // T8 - TCetiE - TE
        FluidStack[] T8_TCetiE_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T8.put("TE", T8_TCetiE_Fluid);

        // T8 - VegaB - VB
        FluidStack[] T8_VegaB_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T8.put("VB", T8_VegaB_Fluid);
    }

    public static void addVoidFluidRecipes_T9() {
        // T9 - Anubis - An
        FluidStack[] T9_Anubis_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T9.put("An", T9_Anubis_Fluid);

        // T9 - Horus - Ho
        FluidStack[] T9_Horus_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T9.put("Ho", T9_Horus_Fluid);

        // T9 - Maahes - Mh
        FluidStack[] T9_Maahes_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T9.put("Mh", T9_Maahes_Fluid);

        // T9 - MehenBelt - MB
        FluidStack[] T9_MehenBelt_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T9.put("MB", T9_MehenBelt_Fluid);

        // T9 - Neper - Np
        FluidStack[] T9_Neper_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T9.put("Np", T9_Neper_Fluid);

        // T9 - Seth - Se
        FluidStack[] T9_Seth_Fluid = addAggregateArray(
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
        VoidFluidRecipes_T9.put("Se", T9_Seth_Fluid);
    }
}
