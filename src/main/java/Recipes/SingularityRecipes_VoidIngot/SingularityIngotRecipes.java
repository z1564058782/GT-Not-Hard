package Recipes.SingularityRecipes_VoidIngot;

import static util.AggregateItemStackArray.addAggregateArray;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

public class SingularityIngotRecipes {

    public static final Map<String, ItemStack[]> VoidIngotRecipes_T0 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidIngotRecipes_T1 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidIngotRecipes_T2 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidIngotRecipes_T3 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidIngotRecipes_T4 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidIngotRecipes_T5 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidIngotRecipes_T6 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidIngotRecipes_T7 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidIngotRecipes_T8 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidIngotRecipes_T9 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidIngotRecipes_T10 = new HashMap<>();

    public static void addVoidIngotRecipes_T0() {
        // T0 - Overworld - Ow
        ItemStack[] T0_Overworld_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T0.put("Ow", T0_Overworld_Ingot);

        // T0 - Nether - Ne
        ItemStack[] T0_Nether_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T0.put("Ne", T0_Nether_Ingot);

        // T0 - Twilight - TF
        ItemStack[] T0_Twilight_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T0.put("TF", T0_Twilight_Ingot);

        // T0 - TheEnd - ED
        ItemStack[] T0_TheEnd_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T0.put("ED", T0_TheEnd_Ingot);

        // T0 - EndAsteroid - EA
        ItemStack[] T0_EndAsteroid_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T0.put("EA", T0_EndAsteroid_Ingot);
    }

    public static void addVoidIngotRecipes_T1() {
        // T1 - Moon - Mo
        ItemStack[] T1_Moon_Ingot = addAggregateArray(
            Vein_Ingot.Molybdenum_Vein,
            Vein_Ingot.Quartz_Vein,
            Vein_Ingot.Monazite_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Copper_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Galena_Vein,
            Vein_Ingot.Cassiterite_Vein,
            SmallOre_Ingot.Meteoric_Iron_SmallOre);
        VoidIngotRecipes_T1.put("Mo", T1_Moon_Ingot);
    }

    public static void addVoidIngotRecipes_T2() {
        // T2 - Deimos - De
        ItemStack[] T2_Deimos_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T2.put("De", T2_Deimos_Ingot);

        // T2 - Mars - Ma
        ItemStack[] T2_Mars_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T2.put("Ma", T2_Mars_Ingot);

        // T2 - Phobos - Ph
        ItemStack[] T2_Phobos_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T2.put("Ph", T2_Phobos_Ingot);
    }

    public static void addVoidIngotRecipes_T3() {
        // T3 - Asteroids - As
        ItemStack[] T3_Asteroids_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T3.put("As", T3_Asteroids_Ingot);

        // T3 - Callisto - Ca
        ItemStack[] T3_Callisto_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T3.put("Ca", T3_Callisto_Ingot);

        // T3 - Ceres - Ce
        ItemStack[] T3_Ceres_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T3.put("Ce", T3_Ceres_Ingot);

        // T3 - Europa - Eu
        ItemStack[] T3_Europa_Ingot = addAggregateArray(
            Vein_Ingot.Magnesite_Vein,
            Vein_Ingot.Basaltic_Mineral_Sand_Vein,
            Vein_Ingot.Chrome_Vein,
            Vein_Ingot.Ledox_Vein,
            Vein_Ingot.Tin_Vein);
        VoidIngotRecipes_T3.put("Eu", T3_Europa_Ingot);

        // T3 - Ganymede - Ga
        ItemStack[] T3_Ganymede_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T3.put("Ga", T3_Ganymede_Ingot);

        // T3 - Ross128b - Rb
        ItemStack[] T3_Ross128b_Ingot = addAggregateArray(
            Vein_Ingot.Bismutite_Bismuthinite_Vein,
            Vein_Ingot.Olenite_FluorBuergerite_ChromoAluminoPovondraite_VanadioOxyDravit_Vein,
            Vein_Ingot.Arsenopyrite_Ferberite_Loellingite_Roquesite_Vein,
            Vein_Ingot.Ferberite_Huebnerite_Loellingite_Vein,
            Vein_Ingot.Djurleite_Bornite_Wittichenite_Vein,
            Vein_Ingot.Thorianite_Vein,
            Vein_Ingot.Fayalite_GreenFuchsite_RedZircon_RedFuchsite_Vein,
            Vein_Ingot.Forsterite_Fayalite_OrangeDescloizite_RedDescloizite_Vein);
        VoidIngotRecipes_T3.put("Rb", T3_Ross128b_Ingot);
    }

    public static void addVoidIngotRecipes_T4() {
        // T4 - Io - Io
        ItemStack[] T4_Io_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T4.put("Io", T4_Io_Ingot);

        // T4 - Mercury - Me
        ItemStack[] T4_Mercury_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T4.put("Me", T4_Mercury_Ingot);

        // T4 - Venus - Ve
        ItemStack[] T4_Venus_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T4.put("Ve", T4_Venus_Ingot);
    }

    public static void addVoidIngotRecipes_T5() {
        // T5 - Enceladus - En
        ItemStack[] T5_Enceladus_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T5.put("En", T5_Enceladus_Ingot);

        // T5 - Miranda - Mi
        ItemStack[] T5_Miranda_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T5.put("Mi", T5_Miranda_Ingot);

        // T5 - Oberon - Ob
        ItemStack[] T5_Oberon_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T5.put("Ob", T5_Oberon_Ingot);

        // T5 - Titan - Ti
        ItemStack[] T5_Titan_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T5.put("Ti", T5_Titan_Ingot);

        // T5 - Ross128ba - Ra
        ItemStack[] T5_Ross128ba_Ingot = addAggregateArray(
            Vein_Ingot.Olenite_FluorBuergerite_ChromoAluminoPovondraite_VanadioOxyDravit_Vein,
            Vein_Ingot.Ferberite_Huebnerite_Loellingite_Vein,
            Vein_Ingot.Hedenbergite_Fayalite_OrangeDescloizite_RedDescloizite_Vein,
            Vein_Ingot.Prasiolite_Hedenbergite_Vein,
            Vein_Ingot.BArTiMaEuSNeK_Vein,
            Vein_Ingot.Tiberium_Vein,
            Vein_Ingot.Fluorspar_Vein);
        VoidIngotRecipes_T5.put("Ra", T5_Ross128ba_Ingot);
    }

    public static void addVoidIngotRecipes_T6() {
        // T6 - Proteus - Pr
        ItemStack[] T6_Proteus_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T6.put("Pr", T6_Proteus_Ingot);

        // T6 - Triton - Tr
        ItemStack[] T6_Triton_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T6.put("Tr", T6_Triton_Ingot);
    }

    public static void addVoidIngotRecipes_T7() {
        // T7 - Haumea - Ha
        ItemStack[] T7_Haumea_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T7.put("Ha", T7_Haumea_Ingot);

        // T7 - Makemake - MM
        ItemStack[] T7_Makemake_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T7.put("MM", T7_Makemake_Ingot);

        // T7 - Pluto - Pl
        ItemStack[] T7_Pluto_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T7.put("Pl", T7_Pluto_Ingot);
    }

    public static void addVoidIngotRecipes_T8() {
        // T8 - BarnardC - BC
        ItemStack[] T8_BarnardC_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T8.put("BC", T8_BarnardC_Ingot);

        // T8 - BarnardE - BE
        ItemStack[] T8_BarnardE_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T8.put("BE", T8_BarnardE_Ingot);

        // T8 - BarnardF - BF
        ItemStack[] T8_BarnardF_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T8.put("BF", T8_BarnardF_Ingot);

        // T8 - α Centauri Bb - CB
        ItemStack[] T8_Centauri_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T8.put("CB", T8_Centauri_Ingot);

        // T8 - TCetiE - TE
        ItemStack[] T8_TCetiE_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T8.put("TE", T8_TCetiE_Ingot);

        // T8 - VegaB - VB
        ItemStack[] T8_VegaB_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T8.put("VB", T8_VegaB_Ingot);
    }

    public static void addVoidIngotRecipes_T9() {
        // T9 - Anubis - An
        ItemStack[] T9_Anubis_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T9.put("An", T9_Anubis_Ingot);

        // T9 - Horus - Ho
        ItemStack[] T9_Horus_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T9.put("Ho", T9_Horus_Ingot);

        // T9 - Maahes - Mh
        ItemStack[] T9_Maahes_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T9.put("Mh", T9_Maahes_Ingot);

        // T9 - MehenBelt - MB
        ItemStack[] T9_MehenBelt_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T9.put("MB", T9_MehenBelt_Ingot);

        // T9 - Neper - Np
        ItemStack[] T9_Neper_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T9.put("Np", T9_Neper_Ingot);

        // T9 - Seth - Se
        ItemStack[] T9_Seth_Ingot = addAggregateArray(
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
        VoidIngotRecipes_T9.put("Se", T9_Seth_Ingot);
    }

    public static void addVoidIngotRecipes_T10() {
        // T10 - DeepDark - DD
        VoidIngotRecipes_T10.put("DD", Vein_Ingot.T10_Ingot);
    }
}
