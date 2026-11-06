package Recipes.SingularityRecipes_VoidDust;

import static util.AggregateItemStackArray.addAggregateArray;
import static util.AggregateItemStackArray.checkItemStack;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

import util.RegisteredResourceCatalog;

public class SingularityDustRecipes {

    public static final Map<String, ItemStack[]> VoidDustRecipes_T0 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidDustRecipes_T1 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidDustRecipes_T2 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidDustRecipes_T3 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidDustRecipes_T4 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidDustRecipes_T5 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidDustRecipes_T6 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidDustRecipes_T7 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidDustRecipes_T8 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidDustRecipes_T9 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidDustRecipes_T10 = new HashMap<>();

    public static void addVoidDustRecipes_T0() {
        // T0 - Overworld - Ow
        ItemStack[] T0_Overworld_Dust = addAggregateArray(
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
        ItemStack[] T0_Overworld_Dust_Checked = checkItemStack(T0_Overworld_Dust);
        VoidDustRecipes_T0.put("Ow", T0_Overworld_Dust_Checked);

        // T0 - Nether - Ne
        ItemStack[] T0_Nether_Dust = addAggregateArray(
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
        ItemStack[] T0_Nether_Dust_Checked = checkItemStack(T0_Nether_Dust);
        VoidDustRecipes_T0.put("Ne", T0_Nether_Dust_Checked);

        // T0 - Twilight - TF
        ItemStack[] T0_Twilight_Dust = addAggregateArray(
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
        ItemStack[] T0_Twilight_Dust_Checked = checkItemStack(T0_Twilight_Dust);
        VoidDustRecipes_T0.put("TF", T0_Twilight_Dust_Checked);

        // T0 - TheEnd - ED
        ItemStack[] T0_TheEnd_Dust = addAggregateArray(
            Vein_Dust.Wulfenite_Molybdenum_Vein,
            Vein_Dust.Garnierite_Nickel_Vein,
            Vein_Dust.Chalcopyrite_Copper_Vein,
            Vein_Dust.Tetrahedrite_Vein,
            Vein_Dust.Magnetite_Gold_Vein,
            Vein_Dust.Beryllium_Vein,
            Vein_Dust.Tin_Cassiterite_Vein,
            SmallOre_Dust.TheEnd_SmallOre);
        ItemStack[] T0_TheEnd_Dust_Checked = checkItemStack(T0_TheEnd_Dust);
        VoidDustRecipes_T0.put("ED", T0_TheEnd_Dust_Checked);

        // T0 - EndAsteroid - EA
        ItemStack[] T0_EndAsteroid_Dust = addAggregateArray(
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
        ItemStack[] T0_EndAsteroid_Dust_Checked = checkItemStack(T0_EndAsteroid_Dust);
        VoidDustRecipes_T0.put("EA", T0_EndAsteroid_Dust_Checked);

        // T0 - TheToxicEverglades - Eg
        ItemStack[] T0_TheToxicEverglades_Dust = addAggregateArray(
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
        ItemStack[] T0_TheToxicEverglades_Dust_Checked = checkItemStack(T0_TheToxicEverglades_Dust);
        VoidDustRecipes_T0.put("Eg", T0_TheToxicEverglades_Dust_Checked);
    }

    public static void addVoidDustRecipes_T1() {
        // T1 - Moon - Mo
        ItemStack[] T1_Moon_Dust = addAggregateArray(
            Vein_Dust.Wulfenite_Molybdenum_Vein,
            Vein_Dust.Quartzite_Quartz_Vein,
            Vein_Dust.Bastnasite_Monazite_Vein,
            Vein_Dust.Chalcopyrite_Copper_Vein,
            Vein_Dust.Bauxite_Vein,
            Vein_Dust.Galena_Vein,
            Vein_Dust.Ilmenite_Vein,
            Vein_Dust.Tin_Cassiterite_Vein,
            SmallOre_Dust.Moon_SmallOre);
        ItemStack[] T1_Moon_Dust_Checked = checkItemStack(T1_Moon_Dust);
        VoidDustRecipes_T1.put("Mo", T1_Moon_Dust_Checked);
    }

    public static void addVoidDustRecipes_T2() {
        // T2 - Deimos - De
        ItemStack[] T2_Deimos_Dust = addAggregateArray(
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
        ItemStack[] T2_Deimos_Dust_Checked = checkItemStack(T2_Deimos_Dust);
        VoidDustRecipes_T2.put("De", T2_Deimos_Dust_Checked);

        // T2 - Mars - Ma
        ItemStack[] T2_Mars_Dust = addAggregateArray(
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
        ItemStack[] T2_Mars_Dust_Checked = checkItemStack(T2_Mars_Dust);
        VoidDustRecipes_T2.put("Ma", T2_Mars_Dust_Checked);

        // T2 - Phobos - Ph
        ItemStack[] T2_Phobos_Dust = addAggregateArray(
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
        ItemStack[] T2_Phobos_Dust_Checked = checkItemStack(T2_Phobos_Dust);
        VoidDustRecipes_T2.put("Ph", T2_Phobos_Dust_Checked);
    }

    public static void addVoidDustRecipes_T3() {
        // T3 - Asteroids - As
        ItemStack[] T3_Asteroids_Dust = addAggregateArray(
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
        ItemStack[] T3_Asteroids_Dust_Checked = checkItemStack(T3_Asteroids_Dust);
        VoidDustRecipes_T3.put("As", T3_Asteroids_Dust_Checked);

        // T3 - Callisto - Ca
        ItemStack[] T3_Callisto_Dust = addAggregateArray(
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
        ItemStack[] T3_Callisto_Dust_Checked = checkItemStack(T3_Callisto_Dust);
        VoidDustRecipes_T3.put("Ca", T3_Callisto_Dust_Checked);

        // T3 - Ceres - Ce
        ItemStack[] T3_Ceres_Dust = addAggregateArray(
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
        ItemStack[] T3_Ceres_Dust_Checked = checkItemStack(T3_Ceres_Dust);
        VoidDustRecipes_T3.put("Ce", T3_Ceres_Dust_Checked);

        // T3 - Europa - Eu
        ItemStack[] T3_Europa_Dust = addAggregateArray(
            Vein_Dust.Magnesite_Vein,
            Vein_Dust.Basaltic_Mineral_Sand_Vein,
            Vein_Dust.Chrome_Vein,
            Vein_Dust.Ledox_Vein,
            Vein_Dust.Cassiterite_Tin_Vein);
        ItemStack[] T3_Europa_Dust_Checked = checkItemStack(T3_Europa_Dust);
        VoidDustRecipes_T3.put("Eu", T3_Europa_Dust_Checked);

        // T3 - Ganymede - Ga
        ItemStack[] T3_Ganymede_Dust = addAggregateArray(
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
        ItemStack[] T3_Ganymede_Dust_Checked = checkItemStack(T3_Ganymede_Dust);
        VoidDustRecipes_T3.put("Ga", T3_Ganymede_Dust_Checked);

        // T3 - Ross128b - Rb
        ItemStack[] T3_Ross128b_Dust = addAggregateArray(
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
        ItemStack[] T3_Ross128b_Dust_Checked = checkItemStack(T3_Ross128b_Dust);
        VoidDustRecipes_T3.put("Rb", T3_Ross128b_Dust_Checked);
    }

    public static void addVoidDustRecipes_T4() {
        // T4 - Io - Io
        ItemStack[] T4_Io_Dust = addAggregateArray(
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
        ItemStack[] T4_Io_Dust_Checked = checkItemStack(T4_Io_Dust);
        VoidDustRecipes_T4.put("Io", T4_Io_Dust_Checked);

        // T4 - Mercury - Me
        ItemStack[] T4_Mercury_Dust = addAggregateArray(
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
        ItemStack[] T4_Mercury_Dust_Checked = checkItemStack(T4_Mercury_Dust);
        VoidDustRecipes_T4.put("Me", T4_Mercury_Dust_Checked);

        // T4 - Venus - Ve
        ItemStack[] T4_Venus_Dust = addAggregateArray(
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
        ItemStack[] T4_Venus_Dust_Checked = checkItemStack(T4_Venus_Dust);
        VoidDustRecipes_T4.put("Ve", T4_Venus_Dust_Checked);
    }

    public static void addVoidDustRecipes_T5() {
        // T5 - Enceladus - En
        ItemStack[] T5_Enceladus_Dust = addAggregateArray(
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
        ItemStack[] T5_Enceladus_Dust_Checked = checkItemStack(T5_Enceladus_Dust);
        VoidDustRecipes_T5.put("En", T5_Enceladus_Dust_Checked);

        // T5 - Miranda - Mi
        ItemStack[] T5_Miranda_Dust = addAggregateArray(
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
        ItemStack[] T5_Miranda_Dust_Checked = checkItemStack(T5_Miranda_Dust);
        VoidDustRecipes_T5.put("Mi", T5_Miranda_Dust_Checked);

        // T5 - Oberon - Ob
        ItemStack[] T5_Oberon_Dust = addAggregateArray(
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
        ItemStack[] T5_Oberon_Dust_Checked = checkItemStack(T5_Oberon_Dust);
        VoidDustRecipes_T5.put("Ob", T5_Oberon_Dust_Checked);

        // T5 - Titan - Ti
        ItemStack[] T5_Titan_Dust = addAggregateArray(
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
        ItemStack[] T5_Titan_Dust_Checked = checkItemStack(T5_Titan_Dust);
        VoidDustRecipes_T5.put("Ti", T5_Titan_Dust_Checked);

        // T5 - Ross128ba - Ra
        ItemStack[] T5_Ross128ba_Dust = addAggregateArray(
            Vein_Dust.BArTiMaEuSNeK_Vein,
            Vein_Dust.Amethyst_Vein,
            Vein_Dust.Djurleite_Vein,
            Vein_Dust.Galena_Vein,
            Vein_Dust.Fayalite_Vein,
            Vein_Dust.Ferberite_Vein,
            Vein_Dust.Tiberium_Vein,
            Vein_Dust.Olenite_Vein);
        ItemStack[] T5_Ross128ba_Dust_Checked = checkItemStack(T5_Ross128ba_Dust);
        VoidDustRecipes_T5.put("Ra", T5_Ross128ba_Dust_Checked);
    }

    public static void addVoidDustRecipes_T6() {
        // T6 - Proteus - Pr
        ItemStack[] T6_Proteus_Dust = addAggregateArray(
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
        ItemStack[] T6_Proteus_Dust_Checked = checkItemStack(T6_Proteus_Dust);
        VoidDustRecipes_T6.put("Pr", T6_Proteus_Dust_Checked);

        // T6 - Triton - Tr
        ItemStack[] T6_Triton_Dust = addAggregateArray(
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
        ItemStack[] T6_Triton_Dust_Checked = checkItemStack(T6_Triton_Dust);
        VoidDustRecipes_T6.put("Tr", T6_Triton_Dust_Checked);
    }

    public static void addVoidDustRecipes_T7() {
        // T7 - Haumea - Ha
        ItemStack[] T7_Haumea_Dust = addAggregateArray(
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
        ItemStack[] T7_Haumea_Dust_Checked = checkItemStack(T7_Haumea_Dust);
        VoidDustRecipes_T7.put("Ha", T7_Haumea_Dust_Checked);

        // T7 - Kuiper Belt - KB
        ItemStack[] T7_Kuiperbelt_Dust = addAggregateArray(
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
        ItemStack[] T7_Kuiperbelt_Dust_Checked = checkItemStack(T7_Kuiperbelt_Dust);
        VoidDustRecipes_T7.put("KB", T7_Kuiperbelt_Dust_Checked);

        // T7 - Makemake - MM
        ItemStack[] T7_Makemake_Dust = addAggregateArray(
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
        ItemStack[] T7_Makemake_Dust_Checked = checkItemStack(T7_Makemake_Dust);
        VoidDustRecipes_T7.put("MM", T7_Makemake_Dust_Checked);

        // T7 - Pluto - Pl
        ItemStack[] T7_Pluto_Dust = addAggregateArray(
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
        ItemStack[] T7_Pluto_Dust_Checked = checkItemStack(T7_Pluto_Dust);
        VoidDustRecipes_T7.put("Pl", T7_Pluto_Dust_Checked);
    }

    public static void addVoidDustRecipes_T8() {
        // T8 - BarnardC - BC
        ItemStack[] T8_BarnardC_Dust = addAggregateArray(
            Vein_Dust.Tungsten_Vein,
            Vein_Dust.Kyanite_Mica_Vein,
            Vein_Dust.Black_Plutonium_Vein,
            Vein_Dust.Arsenic_Vein,
            Vein_Dust.Basaltic_Mineral_Sand_Vein,
            Vein_Dust.Rock_Salt_Salt_Vein,
            Vein_Dust.Nickel_Osmium_Vein,
            Vein_Dust.Samarium_Vein,
            Vein_Dust.Lignite_Coal_Vein);
        ItemStack[] T8_BarnardC_Dust_Checked = checkItemStack(T8_BarnardC_Dust);
        VoidDustRecipes_T8.put("BC", T8_BarnardC_Dust_Checked);

        // T8 - BarnardE - BE
        ItemStack[] T8_BarnardE_Dust = addAggregateArray(
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
        ItemStack[] T8_BarnardE_Dust_Checked = checkItemStack(T8_BarnardE_Dust);
        VoidDustRecipes_T8.put("BE", T8_BarnardE_Dust_Checked);

        // T8 - BarnardF - BF
        ItemStack[] T8_BarnardF_Dust = addAggregateArray(
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
        ItemStack[] T8_BarnardF_Dust_Checked = checkItemStack(T8_BarnardF_Dust);
        VoidDustRecipes_T8.put("BF", T8_BarnardF_Dust_Checked);

        // T8 - α Centauri Bb - CB
        ItemStack[] T8_Centauri_Dust = addAggregateArray(
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
        ItemStack[] T8_Centauri_Dust_Checked = checkItemStack(T8_Centauri_Dust);
        VoidDustRecipes_T8.put("CB", T8_Centauri_Dust_Checked);

        // T8 - TCetiE - TE
        ItemStack[] T8_TCetiE_Dust = addAggregateArray(
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
        ItemStack[] T8_TCetiE_Dust_Checked = checkItemStack(T8_TCetiE_Dust);
        VoidDustRecipes_T8.put("TE", T8_TCetiE_Dust_Checked);

        // T8 - VegaB - VB
        ItemStack[] T8_VegaB_Dust = addAggregateArray(
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
        ItemStack[] T8_VegaB_Dust_Checked = checkItemStack(T8_VegaB_Dust);
        VoidDustRecipes_T8.put("VB", T8_VegaB_Dust_Checked);
    }

    public static void addVoidDustRecipes_T9() {
        // T9 - Anubis - An
        ItemStack[] T9_Anubis_Dust = addAggregateArray(
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
        ItemStack[] T9_Anubis_Dust_Checked = checkItemStack(T9_Anubis_Dust);
        VoidDustRecipes_T9.put("An", T9_Anubis_Dust_Checked);

        // T9 - Horus - Ho
        ItemStack[] T9_Horus_Dust = addAggregateArray(
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
        ItemStack[] T9_Horus_Dust_Checked = checkItemStack(T9_Horus_Dust);
        VoidDustRecipes_T9.put("Ho", T9_Horus_Dust_Checked);

        // T9 - Maahes - Mh
        ItemStack[] T9_Maahes_Dust = addAggregateArray(
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
        ItemStack[] T9_Maahes_Dust_Checked = checkItemStack(T9_Maahes_Dust);
        VoidDustRecipes_T9.put("Mh", T9_Maahes_Dust_Checked);

        // T9 - MehenBelt - MB
        ItemStack[] T9_MehenBelt_Dust = addAggregateArray(
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
        ItemStack[] T9_MehenBelt_Dust_Checked = checkItemStack(T9_MehenBelt_Dust);
        VoidDustRecipes_T9.put("MB", T9_MehenBelt_Dust_Checked);

        // T9 - Neper - Np
        ItemStack[] T9_Neper_Dust = addAggregateArray(
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
        ItemStack[] T9_Neper_Dust_Checked = checkItemStack(T9_Neper_Dust);
        VoidDustRecipes_T9.put("Np", T9_Neper_Dust_Checked);

        // T9 - Seth - Se
        ItemStack[] T9_Seth_Dust = addAggregateArray(
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
        ItemStack[] T9_Seth_Dust_Checked = checkItemStack(T9_Seth_Dust);
        VoidDustRecipes_T9.put("Se", T9_Seth_Dust_Checked);
    }

    public static void addVoidDustRecipes_T10() {
        VoidDustRecipes_T10.put("DD", RegisteredResourceCatalog.collectDusts());
    }
}
