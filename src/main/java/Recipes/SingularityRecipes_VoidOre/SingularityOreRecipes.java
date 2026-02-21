package Recipes.SingularityRecipes_VoidOre;

import static util.AggregateItemStackArray.addAggregateArray;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

public class SingularityOreRecipes {

    public static final Map<String, ItemStack[]> VoidOreRecipes_T0 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidOreRecipes_T1 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidOreRecipes_T2 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidOreRecipes_T3 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidOreRecipes_T4 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidOreRecipes_T5 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidOreRecipes_T6 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidOreRecipes_T7 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidOreRecipes_T8 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidOreRecipes_T9 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidOreRecipes_T10 = new HashMap<>();

    public static void addVoidOreRecipes_T0() {
        // T0 - Overworld - Ow
        ItemStack[] T0_Overworld_Ingot = addAggregateArray(
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
        VoidOreRecipes_T0.put("Ow", T0_Overworld_Ingot);

        // T0 - Nether - Ne
        ItemStack[] T0_Nether_Ingot = addAggregateArray(
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
        VoidOreRecipes_T0.put("Ne", T0_Nether_Ingot);

        // T0 - Twilight - TF
        ItemStack[] T0_Twilight_Ingot = addAggregateArray(
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
        VoidOreRecipes_T0.put("TF", T0_Twilight_Ingot);

        // T0 - TheEnd - ED
        ItemStack[] T0_TheEnd_Ingot = addAggregateArray(
            Vein.Molybdenum_Vein,
            Vein.Nickel_Vein,
            Vein.Copper_Vein,
            Vein.Gold_Vein,
            Vein.Beryllium_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Cassiterite_Vein,
            SmallOre.TheEnd_SmallOre);
        VoidOreRecipes_T0.put("ED", T0_TheEnd_Ingot);

        // T0 - EndAsteroid - EA
        ItemStack[] T0_EndAsteroid_Ingot = addAggregateArray(
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
        VoidOreRecipes_T0.put("EA", T0_EndAsteroid_Ingot);
    }

    public static void addVoidOreRecipes_T1() {
        // T1 - Moon - Mo
        ItemStack[] T1_Moon_Ingot = addAggregateArray(
            Vein.Molybdenum_Vein,
            Vein.Quartzite_Vein,
            Vein.Monazite_Vein,
            Vein.Ilmenite_Vein,
            Vein.Copper_Vein,
            Vein.Bauxite_Vein,
            Vein.Galena_Vein,
            Vein.Cassiterite_Vein,
            SmallOre.Moon_SmallOre);
        VoidOreRecipes_T1.put("Mo", T1_Moon_Ingot);
    }

    public static void addVoidOreRecipes_T2() {
        // T2 - Deimos - De
        ItemStack[] T2_Deimos_Ingot = addAggregateArray(
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
        VoidOreRecipes_T2.put("De", T2_Deimos_Ingot);

        // T2 - Mars - Ma
        ItemStack[] T2_Mars_Ingot = addAggregateArray(
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
        VoidOreRecipes_T2.put("Ma", T2_Mars_Ingot);

        // T2 - Phobos - Ph
        ItemStack[] T2_Phobos_Ingot = addAggregateArray(
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
        VoidOreRecipes_T2.put("Ph", T2_Phobos_Ingot);
    }

    public static void addVoidOreRecipes_T3() {
        // T3 - Asteroids - As
        ItemStack[] T3_Asteroids_Ingot = addAggregateArray(
            Vein.Tungstate_Vein,
            Vein.Ilmenite_Vein,
            Vein.Bauxite_Vein,
            Vein.Gold_Vein,
            Vein.Tetrahedrite_Vein,
            Vein.Naquadah_Vein,
            SmallOre.Asteroids_SmallOre);
        VoidOreRecipes_T3.put("As", T3_Asteroids_Ingot);

        // T3 - Callisto - Ca
        ItemStack[] T3_Callisto_Ingot = addAggregateArray(
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
        VoidOreRecipes_T3.put("Ca", T3_Callisto_Ingot);

        // T3 - Ceres - Ce
        ItemStack[] T3_Ceres_Ingot = addAggregateArray(
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
        VoidOreRecipes_T3.put("Ce", T3_Ceres_Ingot);

        // T3 - Europa - Eu
        ItemStack[] T3_Europa_Ingot = addAggregateArray(
            Vein.Magnesite_Vein,
            Vein.Basaltic_Mineral_Sand_Vein,
            Vein.Chrome_Vein,
            Vein.Ledox_Vein,
            Vein.Tin_Vein);
        VoidOreRecipes_T3.put("Eu", T3_Europa_Ingot);

        // T3 - Ganymede - Ga
        ItemStack[] T3_Ganymede_Ingot = addAggregateArray(
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
        VoidOreRecipes_T3.put("Ga", T3_Ganymede_Ingot);

        // T3 - Ross128b - Rb
        ItemStack[] T3_Ross128b_Ingot = addAggregateArray(
            Vein.Bismutite_Bismuthinite_Vein,
            Vein.Olenite_FluorBuergerite_ChromoAluminoPovondraite_VanadioOxyDravit_Vein,
            Vein.Arsenopyrite_Ferberite_Loellingite_Roquesite_Vein,
            Vein.Ferberite_Huebnerite_Loellingite_Vein,
            Vein.Djurleite_Bornite_Wittichenite_Vein,
            Vein.Thorianite_Vein,
            Vein.Fayalite_GreenFuchsite_RedZircon_RedFuchsite_Vein,
            Vein.Forsterite_Fayalite_OrangeDescloizite_RedDescloizite_Vein);
        VoidOreRecipes_T3.put("Rb", T3_Ross128b_Ingot);
    }

    public static void addVoidOreRecipes_T4() {
        // T4 - Io - Io
        ItemStack[] T4_Io_Ingot = addAggregateArray(
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
        VoidOreRecipes_T4.put("Io", T4_Io_Ingot);

        // T4 - Mercury - Me
        ItemStack[] T4_Mercury_Ingot = addAggregateArray(
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
        VoidOreRecipes_T4.put("Me", T4_Mercury_Ingot);

        // T4 - Venus - Ve
        ItemStack[] T4_Venus_Ingot = addAggregateArray(
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
        VoidOreRecipes_T4.put("Ve", T4_Venus_Ingot);
    }

    public static void addVoidOreRecipes_T5() {
        // T5 - Enceladus - En
        ItemStack[] T5_Enceladus_Ingot = addAggregateArray(
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
        VoidOreRecipes_T5.put("En", T5_Enceladus_Ingot);

        // T5 - Miranda - Mi
        ItemStack[] T5_Miranda_Ingot = addAggregateArray(
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
        VoidOreRecipes_T5.put("Mi", T5_Miranda_Ingot);

        // T5 - Oberon - Ob
        ItemStack[] T5_Oberon_Ingot = addAggregateArray(
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
        VoidOreRecipes_T5.put("Ob", T5_Oberon_Ingot);

        // T5 - Titan - Ti
        ItemStack[] T5_Titan_Ingot = addAggregateArray(
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
        VoidOreRecipes_T5.put("Ti", T5_Titan_Ingot);

        // T5 - Ross128ba - Ra
        ItemStack[] T5_Ross128ba_Ingot = addAggregateArray(
            Vein.Olenite_FluorBuergerite_ChromoAluminoPovondraite_VanadioOxyDravit_Vein,
            Vein.Ferberite_Huebnerite_Loellingite_Vein,
            Vein.Hedenbergite_Fayalite_OrangeDescloizite_RedDescloizite_Vein,
            Vein.Prasiolite_Hedenbergite_Vein,
            Vein.BArTiMaEuSNeK_Vein,
            Vein.Tiberium_Vein,
            Vein.Fluorspar_Vein);
        VoidOreRecipes_T5.put("Ra", T5_Ross128ba_Ingot);
    }

    public static void addVoidOreRecipes_T6() {
        // T6 - Proteus - Pr
        ItemStack[] T6_Proteus_Ingot = addAggregateArray(
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
        VoidOreRecipes_T6.put("Pr", T6_Proteus_Ingot);

        // T6 - Triton - Tr
        ItemStack[] T6_Triton_Ingot = addAggregateArray(
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
        VoidOreRecipes_T6.put("Tr", T6_Triton_Ingot);
    }

    public static void addVoidOreRecipes_T7() {
        // T7 - Haumea - Ha
        ItemStack[] T7_Haumea_Ingot = addAggregateArray(
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
        VoidOreRecipes_T7.put("Ha", T7_Haumea_Ingot);

        // T7 - Makemake - MM
        ItemStack[] T7_Makemake_Ingot = addAggregateArray(
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
        VoidOreRecipes_T7.put("MM", T7_Makemake_Ingot);

        // T7 - Pluto - Pl
        ItemStack[] T7_Pluto_Ingot = addAggregateArray(
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
        VoidOreRecipes_T7.put("Pl", T7_Pluto_Ingot);
    }

    public static void addVoidOreRecipes_T8() {
        // T8 - BarnardC - BC
        ItemStack[] T8_BarnardC_Ingot = addAggregateArray(
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
        VoidOreRecipes_T8.put("BC", T8_BarnardC_Ingot);

        // T8 - BarnardE - BE
        ItemStack[] T8_BarnardE_Ingot = addAggregateArray(
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
        VoidOreRecipes_T8.put("BE", T8_BarnardE_Ingot);

        // T8 - BarnardF - BF
        ItemStack[] T8_BarnardF_Ingot = addAggregateArray(
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
        VoidOreRecipes_T8.put("BF", T8_BarnardF_Ingot);

        // T8 - α Centauri Bb - CB
        ItemStack[] T8_Centauri_Ingot = addAggregateArray(
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
        VoidOreRecipes_T8.put("CB", T8_Centauri_Ingot);

        // T8 - TCetiE - TE
        ItemStack[] T8_TCetiE_Ingot = addAggregateArray(
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
        VoidOreRecipes_T8.put("TE", T8_TCetiE_Ingot);

        // T8 - VegaB - VB
        ItemStack[] T8_VegaB_Ingot = addAggregateArray(
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
        VoidOreRecipes_T8.put("VB", T8_VegaB_Ingot);
    }

    public static void addVoidOreRecipes_T9() {
        // T9 - Anubis - An
        ItemStack[] T9_Anubis_Ingot = addAggregateArray(
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
        VoidOreRecipes_T9.put("An", T9_Anubis_Ingot);

        // T9 - Horus - Ho
        ItemStack[] T9_Horus_Ingot = addAggregateArray(
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
        VoidOreRecipes_T9.put("Ho", T9_Horus_Ingot);

        // T9 - Maahes - Mh
        ItemStack[] T9_Maahes_Ingot = addAggregateArray(
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
        VoidOreRecipes_T9.put("Mh", T9_Maahes_Ingot);

        // T9 - MehenBelt - MB
        ItemStack[] T9_MehenBelt_Ingot = addAggregateArray(
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
        VoidOreRecipes_T9.put("MB", T9_MehenBelt_Ingot);

        // T9 - Neper - Np
        ItemStack[] T9_Neper_Ingot = addAggregateArray(
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
        VoidOreRecipes_T9.put("Np", T9_Neper_Ingot);

        // T9 - Seth - Se
        ItemStack[] T9_Seth_Ingot = addAggregateArray(
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
        VoidOreRecipes_T9.put("Se", T9_Seth_Ingot);
    }

    public static void addVoidOreRecipes_T10() {
        // T10 - DeepDark - DD
        VoidOreRecipes_T10.put("DD", Vein.T10_Ore);
    }
}
