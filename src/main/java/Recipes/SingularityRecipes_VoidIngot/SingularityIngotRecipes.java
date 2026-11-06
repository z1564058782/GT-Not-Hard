package Recipes.SingularityRecipes_VoidIngot;

import static util.AggregateItemStackArray.addAggregateArray;
import static util.AggregateItemStackArray.checkItemStack;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

import gregtech.api.enums.OrePrefixes;
import util.RegisteredResourceCatalog;

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
        ItemStack[] T0_Overworld_Ingot_Checked = checkItemStack(T0_Overworld_Ingot);
        VoidIngotRecipes_T0.put("Ow", T0_Overworld_Ingot_Checked);

        // T0 - Nether - Ne
        ItemStack[] T0_Nether_Ingot = addAggregateArray(
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
        ItemStack[] T0_Nether_Ingot_Checked = checkItemStack(T0_Nether_Ingot);
        VoidIngotRecipes_T0.put("Ne", T0_Nether_Ingot_Checked);

        // T0 - Twilight - TF
        ItemStack[] T0_Twilight_Ingot = addAggregateArray(
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
        ItemStack[] T0_Twilight_Ingot_Checked = checkItemStack(T0_Twilight_Ingot);
        VoidIngotRecipes_T0.put("TF", T0_Twilight_Ingot_Checked);

        // T0 - TheEnd - ED
        ItemStack[] T0_TheEnd_Ingot = addAggregateArray(
            Vein_Ingot.Wulfenite_Molybdenum_Vein,
            Vein_Ingot.Garnierite_Nickel_Vein,
            Vein_Ingot.Chalcopyrite_Copper_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Magnetite_Gold_Vein,
            Vein_Ingot.Beryllium_Vein,
            Vein_Ingot.Tin_Cassiterite_Vein,
            SmallOre_Ingot.TheEnd_SmallOre);
        ItemStack[] T0_TheEnd_Ingot_Checked = checkItemStack(T0_TheEnd_Ingot);
        VoidIngotRecipes_T0.put("ED", T0_TheEnd_Ingot_Checked);

        // T0 - EndAsteroid - EA
        ItemStack[] T0_EndAsteroid_Ingot = addAggregateArray(
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
        ItemStack[] T0_EndAsteroid_Ingot_Checked = checkItemStack(T0_EndAsteroid_Ingot);
        VoidIngotRecipes_T0.put("EA", T0_EndAsteroid_Ingot_Checked);

        // T0 - TheToxicEverglades - Eg
        ItemStack[] T0_TheToxicEverglades_Ingot = addAggregateArray(
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
        ItemStack[] T0_TheToxicEverglades_Ingot_Checked = checkItemStack(T0_TheToxicEverglades_Ingot);
        VoidIngotRecipes_T0.put("Eg", T0_TheToxicEverglades_Ingot_Checked);
    }

    public static void addVoidIngotRecipes_T1() {
        // T1 - Moon - Mo
        ItemStack[] T1_Moon_Ingot = addAggregateArray(
            Vein_Ingot.Wulfenite_Molybdenum_Vein,
            Vein_Ingot.Quartzite_Quartz_Vein,
            Vein_Ingot.Bastnasite_Monazite_Vein,
            Vein_Ingot.Chalcopyrite_Copper_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Galena_Vein,
            Vein_Ingot.Ilmenite_Vein,
            Vein_Ingot.Tin_Cassiterite_Vein,
            SmallOre_Ingot.Moon_SmallOre);
        ItemStack[] T1_Moon_Ingot_Checked = checkItemStack(T1_Moon_Ingot);
        VoidIngotRecipes_T1.put("Mo", T1_Moon_Ingot_Checked);
    }

    public static void addVoidIngotRecipes_T2() {
        // T2 - Deimos - De
        ItemStack[] T2_Deimos_Ingot = addAggregateArray(
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
        ItemStack[] T2_Deimos_Ingot_Checked = checkItemStack(T2_Deimos_Ingot);
        VoidIngotRecipes_T2.put("De", T2_Deimos_Ingot_Checked);

        // T2 - Mars - Ma
        ItemStack[] T2_Mars_Ingot = addAggregateArray(
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
        ItemStack[] T2_Mars_Ingot_Checked = checkItemStack(T2_Mars_Ingot);
        VoidIngotRecipes_T2.put("Ma", T2_Mars_Ingot_Checked);

        // T2 - Phobos - Ph
        ItemStack[] T2_Phobos_Ingot = addAggregateArray(
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
        ItemStack[] T2_Phobos_Ingot_Checked = checkItemStack(T2_Phobos_Ingot);
        VoidIngotRecipes_T2.put("Ph", T2_Phobos_Ingot_Checked);
    }

    public static void addVoidIngotRecipes_T3() {
        // T3 - Asteroids - As
        ItemStack[] T3_Asteroids_Ingot = addAggregateArray(
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
        ItemStack[] T3_Asteroids_Ingot_Checked = checkItemStack(T3_Asteroids_Ingot);
        VoidIngotRecipes_T3.put("As", T3_Asteroids_Ingot_Checked);

        // T3 - Callisto - Ca
        ItemStack[] T3_Callisto_Ingot = addAggregateArray(
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
        ItemStack[] T3_Callisto_Ingot_Checked = checkItemStack(T3_Callisto_Ingot);
        VoidIngotRecipes_T3.put("Ca", T3_Callisto_Ingot_Checked);

        // T3 - Ceres - Ce
        ItemStack[] T3_Ceres_Ingot = addAggregateArray(
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
        ItemStack[] T3_Ceres_Ingot_Checked = checkItemStack(T3_Ceres_Ingot);
        VoidIngotRecipes_T3.put("Ce", T3_Ceres_Ingot_Checked);

        // T3 - Europa - Eu
        ItemStack[] T3_Europa_Ingot = addAggregateArray(
            Vein_Ingot.Magnesite_Vein,
            Vein_Ingot.Basaltic_Mineral_Sand_Vein,
            Vein_Ingot.Chrome_Vein,
            Vein_Ingot.Ledox_Vein,
            Vein_Ingot.Cassiterite_Tin_Vein);
        ItemStack[] T3_Europa_Ingot_Checked = checkItemStack(T3_Europa_Ingot);
        VoidIngotRecipes_T3.put("Eu", T3_Europa_Ingot_Checked);

        // T3 - Ganymede - Ga
        ItemStack[] T3_Ganymede_Ingot = addAggregateArray(
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
        ItemStack[] T3_Ganymede_Ingot_Checked = checkItemStack(T3_Ganymede_Ingot);
        VoidIngotRecipes_T3.put("Ga", T3_Ganymede_Ingot_Checked);

        // T3 - Ross128b - Rb
        ItemStack[] T3_Ross128b_Ingot = addAggregateArray(
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
        ItemStack[] T3_Ross128b_Ingot_Checked = checkItemStack(T3_Ross128b_Ingot);
        VoidIngotRecipes_T3.put("Rb", T3_Ross128b_Ingot_Checked);
    }

    public static void addVoidIngotRecipes_T4() {
        // T4 - Io - Io
        ItemStack[] T4_Io_Ingot = addAggregateArray(
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
        ItemStack[] T4_Io_Ingot_Checked = checkItemStack(T4_Io_Ingot);
        VoidIngotRecipes_T4.put("Io", T4_Io_Ingot_Checked);

        // T4 - Mercury - Me
        ItemStack[] T4_Mercury_Ingot = addAggregateArray(
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
        ItemStack[] T4_Mercury_Ingot_Checked = checkItemStack(T4_Mercury_Ingot);
        VoidIngotRecipes_T4.put("Me", T4_Mercury_Ingot_Checked);

        // T4 - Venus - Ve
        ItemStack[] T4_Venus_Ingot = addAggregateArray(
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
        ItemStack[] T4_Venus_Ingot_Checked = checkItemStack(T4_Venus_Ingot);
        VoidIngotRecipes_T4.put("Ve", T4_Venus_Ingot_Checked);
    }

    public static void addVoidIngotRecipes_T5() {
        // T5 - Enceladus - En
        ItemStack[] T5_Enceladus_Ingot = addAggregateArray(
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
        ItemStack[] T5_Enceladus_Ingot_Checked = checkItemStack(T5_Enceladus_Ingot);
        VoidIngotRecipes_T5.put("En", T5_Enceladus_Ingot_Checked);

        // T5 - Miranda - Mi
        ItemStack[] T5_Miranda_Ingot = addAggregateArray(
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
        ItemStack[] T5_Miranda_Ingot_Checked = checkItemStack(T5_Miranda_Ingot);
        VoidIngotRecipes_T5.put("Mi", T5_Miranda_Ingot_Checked);

        // T5 - Oberon - Ob
        ItemStack[] T5_Oberon_Ingot = addAggregateArray(
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
        ItemStack[] T5_Oberon_Ingot_Checked = checkItemStack(T5_Oberon_Ingot);
        VoidIngotRecipes_T5.put("Ob", T5_Oberon_Ingot_Checked);

        // T5 - Titan - Ti
        ItemStack[] T5_Titan_Ingot = addAggregateArray(
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
        ItemStack[] T5_Titan_Ingot_Checked = checkItemStack(T5_Titan_Ingot);
        VoidIngotRecipes_T5.put("Ti", T5_Titan_Ingot_Checked);

        // T5 - Ross128ba - Ra
        ItemStack[] T5_Ross128ba_Ingot = addAggregateArray(
            Vein_Ingot.BArTiMaEuSNeK_Vein,
            Vein_Ingot.Amethyst_Vein,
            Vein_Ingot.Djurleite_Vein,
            Vein_Ingot.Galena_Vein,
            Vein_Ingot.Fayalite_Vein,
            Vein_Ingot.Ferberite_Vein,
            Vein_Ingot.Tiberium_Vein,
            Vein_Ingot.Olenite_Vein);
        ItemStack[] T5_Ross128ba_Ingot_Checked = checkItemStack(T5_Ross128ba_Ingot);
        VoidIngotRecipes_T5.put("Ra", T5_Ross128ba_Ingot_Checked);
    }

    public static void addVoidIngotRecipes_T6() {
        // T6 - Proteus - Pr
        ItemStack[] T6_Proteus_Ingot = addAggregateArray(
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
        ItemStack[] T6_Proteus_Ingot_Checked = checkItemStack(T6_Proteus_Ingot);
        VoidIngotRecipes_T6.put("Pr", T6_Proteus_Ingot_Checked);

        // T6 - Triton - Tr
        ItemStack[] T6_Triton_Ingot = addAggregateArray(
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
        ItemStack[] T6_Triton_Ingot_Checked = checkItemStack(T6_Triton_Ingot);
        VoidIngotRecipes_T6.put("Tr", T6_Triton_Ingot_Checked);
    }

    public static void addVoidIngotRecipes_T7() {
        // T7 - Haumea - Ha
        ItemStack[] T7_Haumea_Ingot = addAggregateArray(
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
        ItemStack[] T7_Haumea_Ingot_Checked = checkItemStack(T7_Haumea_Ingot);
        VoidIngotRecipes_T7.put("Ha", T7_Haumea_Ingot_Checked);

        // T7 - Kuiper Belt - KB
        ItemStack[] T7_Kuiperbelt_Ingot = addAggregateArray(
            Vein_Ingot.Carbon_Dioxide_Vein,
            Vein_Ingot.Pitchblende_Vein,
            Vein_Ingot.Garnierite_Nickel_Vein,
            Vein_Ingot.Bauxite_Vein,
            Vein_Ingot.Tetrahedrite_Vein,
            Vein_Ingot.Naquadah_Vein,
            Vein_Ingot.Methane_Vein,
            Vein_Ingot.Uraninite_Uranium238_Vein,
            Vein_Ingot.Scheelite_Tungstate_Vein,
            Vein_Ingot.Graphite_Diamond_Vein,
            Vein_Ingot.Nickel_Osmium_Vein,
            Vein_Ingot.Platinum_Palladium_Vein,
            Vein_Ingot.Neutronium_Vein,
            Vein_Ingot.Nickel_Iridium_Vein,
            SmallOre_Ingot.Kuiperbelt_SmallOre);
        ItemStack[] T7_Kuiperbelt_Ingot_Checked = checkItemStack(T7_Kuiperbelt_Ingot);
        VoidIngotRecipes_T7.put("KB", T7_Kuiperbelt_Ingot_Checked);

        // T7 - Makemake - MM
        ItemStack[] T7_Makemake_Ingot = addAggregateArray(
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
        ItemStack[] T7_Makemake_Ingot_Checked = checkItemStack(T7_Makemake_Ingot);
        VoidIngotRecipes_T7.put("MM", T7_Makemake_Ingot_Checked);

        // T7 - Pluto - Pl
        ItemStack[] T7_Pluto_Ingot = addAggregateArray(
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
        ItemStack[] T7_Pluto_Ingot_Checked = checkItemStack(T7_Pluto_Ingot);
        VoidIngotRecipes_T7.put("Pl", T7_Pluto_Ingot_Checked);
    }

    public static void addVoidIngotRecipes_T8() {
        // T8 - BarnardC - BC
        ItemStack[] T8_BarnardC_Ingot = addAggregateArray(
            Vein_Ingot.Tungsten_Vein,
            Vein_Ingot.Kyanite_Mica_Vein,
            Vein_Ingot.Black_Plutonium_Vein,
            Vein_Ingot.Arsenic_Vein,
            Vein_Ingot.Basaltic_Mineral_Sand_Vein,
            Vein_Ingot.Rock_Salt_Salt_Vein,
            Vein_Ingot.Nickel_Osmium_Vein,
            Vein_Ingot.Samarium_Vein,
            Vein_Ingot.Lignite_Coal_Vein);
        ItemStack[] T8_BarnardC_Ingot_Checked = checkItemStack(T8_BarnardC_Ingot);
        VoidIngotRecipes_T8.put("BC", T8_BarnardC_Ingot_Checked);

        // T8 - BarnardE - BE
        ItemStack[] T8_BarnardE_Ingot = addAggregateArray(
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
        ItemStack[] T8_BarnardE_Ingot_Checked = checkItemStack(T8_BarnardE_Ingot);
        VoidIngotRecipes_T8.put("BE", T8_BarnardE_Ingot_Checked);

        // T8 - BarnardF - BF
        ItemStack[] T8_BarnardF_Ingot = addAggregateArray(
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
        ItemStack[] T8_BarnardF_Ingot_Checked = checkItemStack(T8_BarnardF_Ingot);
        VoidIngotRecipes_T8.put("BF", T8_BarnardF_Ingot_Checked);

        // T8 - α Centauri Bb - CB
        ItemStack[] T8_Centauri_Ingot = addAggregateArray(
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
        ItemStack[] T8_Centauri_Ingot_Checked = checkItemStack(T8_Centauri_Ingot);
        VoidIngotRecipes_T8.put("CB", T8_Centauri_Ingot_Checked);

        // T8 - TCetiE - TE
        ItemStack[] T8_TCetiE_Ingot = addAggregateArray(
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
        ItemStack[] T8_TCetiE_Ingot_Checked = checkItemStack(T8_TCetiE_Ingot);
        VoidIngotRecipes_T8.put("TE", T8_TCetiE_Ingot_Checked);

        // T8 - VegaB - VB
        ItemStack[] T8_VegaB_Ingot = addAggregateArray(
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
        ItemStack[] T8_VegaB_Ingot_Checked = checkItemStack(T8_VegaB_Ingot);
        VoidIngotRecipes_T8.put("VB", T8_VegaB_Ingot_Checked);
    }

    public static void addVoidIngotRecipes_T9() {
        // T9 - Anubis - An
        ItemStack[] T9_Anubis_Ingot = addAggregateArray(
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
        ItemStack[] T9_Anubis_Ingot_Checked = checkItemStack(T9_Anubis_Ingot);
        VoidIngotRecipes_T9.put("An", T9_Anubis_Ingot_Checked);

        // T9 - Horus - Ho
        ItemStack[] T9_Horus_Ingot = addAggregateArray(
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
        ItemStack[] T9_Horus_Ingot_Checked = checkItemStack(T9_Horus_Ingot);
        VoidIngotRecipes_T9.put("Ho", T9_Horus_Ingot_Checked);

        // T9 - Maahes - Mh
        ItemStack[] T9_Maahes_Ingot = addAggregateArray(
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
        ItemStack[] T9_Maahes_Ingot_Checked = checkItemStack(T9_Maahes_Ingot);
        VoidIngotRecipes_T9.put("Mh", T9_Maahes_Ingot_Checked);

        // T9 - MehenBelt - MB
        ItemStack[] T9_MehenBelt_Ingot = addAggregateArray(
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
        ItemStack[] T9_MehenBelt_Ingot_Checked = checkItemStack(T9_MehenBelt_Ingot);
        VoidIngotRecipes_T9.put("MB", T9_MehenBelt_Ingot_Checked);

        // T9 - Neper - Np
        ItemStack[] T9_Neper_Ingot = addAggregateArray(
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
        ItemStack[] T9_Neper_Ingot_Checked = checkItemStack(T9_Neper_Ingot);
        VoidIngotRecipes_T9.put("Np", T9_Neper_Ingot_Checked);

        // T9 - Seth - Se
        ItemStack[] T9_Seth_Ingot = addAggregateArray(
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
        ItemStack[] T9_Seth_Ingot_Checked = checkItemStack(T9_Seth_Ingot);
        VoidIngotRecipes_T9.put("Se", T9_Seth_Ingot_Checked);
    }

    public static void addVoidIngotRecipes_T10() {
        // T10 - DeepDark - DD
        VoidIngotRecipes_T10
            .put("DD", RegisteredResourceCatalog.collectOreItems(OrePrefixes.ingot, Vein_Ingot.T10_Ingot));
    }
}
