package Recipes.SingularityRecipes_VoidGem;

import static util.AggregateItemStackArray.addAggregateArray;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

public class SingularityGemRecipes {

    public static final Map<String, ItemStack[]> VoidGemRecipes_T0 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidGemRecipes_T1 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidGemRecipes_T2 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidGemRecipes_T3 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidGemRecipes_T4 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidGemRecipes_T5 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidGemRecipes_T6 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidGemRecipes_T7 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidGemRecipes_T8 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidGemRecipes_T9 = new HashMap<>();
    public static final Map<String, ItemStack[]> VoidGemRecipes_T10 = new HashMap<>();

    public static void addVoidGemRecipes_T0() {
        // T0 - Overworld - Ow
        ItemStack[] T0_Overworld_Gem = addAggregateArray(
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
        VoidGemRecipes_T0.put("Ow", T0_Overworld_Gem);

        // T0 - Nether - Ne
        ItemStack[] T0_Nether_Gem = addAggregateArray(
            Vein_Gem.Quartzite_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Iron_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Nether_Quartz_Vein,
            SmallOre_Gem.Certus_Quartz_SmallOre,
            SmallOre_Gem.Nether_Quartz_SmallOre);
        VoidGemRecipes_T0.put("Ne", T0_Nether_Gem);

        // T0 - Twilight - TF
        ItemStack[] T0_Twilight_Gem = addAggregateArray(
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
        VoidGemRecipes_T0.put("TF", T0_Twilight_Gem);

        // T0 - TheEnd - ED
        ItemStack[] T0_TheEnd_Gem = addAggregateArray(Vein_Gem.Beryllium_Vein);
        VoidGemRecipes_T0.put("ED", T0_TheEnd_Gem);

        // T0 - EndAsteroid - EA
        ItemStack[] T0_EndAsteroid_Gem = addAggregateArray(
            Vein_Gem.Lapis_Vein,
            Vein_Gem.Olivine_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Platinum_Vein);
        VoidGemRecipes_T0.put("EA", T0_EndAsteroid_Gem);
    }

    public static void addVoidGemRecipes_T1() {
        // T1 - Moon - Mo
        ItemStack[] T1_Moon_Gem = addAggregateArray(
            Vein_Gem.Quartz_Vein,
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Ilmenite_Vein);
        VoidGemRecipes_T1.put("Mo", T1_Moon_Gem);
    }

    public static void addVoidGemRecipes_T2() {
        // T2 - Deimos - De
        ItemStack[] T2_Deimos_Gem = addAggregateArray(
            Vein_Gem.Lapis_Vein,
            Vein_Gem.Draconium_Vein,
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Oriharukon_Vein,
            SmallOre_Gem.Diamond_SmallOre);
        VoidGemRecipes_T2.put("De", T2_Deimos_Gem);

        // T2 - Mars - Ma
        ItemStack[] T2_Mars_Gem = addAggregateArray(
            Vein_Gem.Quartz_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Iron_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Salt_Vein);
        VoidGemRecipes_T2.put("Ma", T2_Mars_Gem);

        // T2 - Phobos - Ph
        ItemStack[] T2_Phobos_Gem = addAggregateArray(
            Vein_Gem.Diamond_Vein,
            Vein_Gem.Quartz_Vein,
            Vein_Gem.Draconium_Vein,
            Vein_Gem.Oriharukon_Vein,
            SmallOre_Gem.Lapis_SmallOre);
        VoidGemRecipes_T2.put("Ph", T2_Phobos_Gem);
    }

    public static void addVoidGemRecipes_T3() {
        // T3 - Asteroids - As
        ItemStack[] T3_Asteroids_Gem = addAggregateArray(Vein_Gem.Ilmenite_Vein, SmallOre_Gem.Diamond_SmallOre);
        VoidGemRecipes_T3.put("As", T3_Asteroids_Gem);

        // T3 - Callisto - Ca
        ItemStack[] T3_Callisto_Gem = addAggregateArray(
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Callisto_Ice_Vein,
            Vein_Gem.Iron_Vein,
            SmallOre_Gem.Diamond_SmallOre);
        VoidGemRecipes_T3.put("Ca", T3_Callisto_Gem);

        // T3 - Ceres - Ce
        ItemStack[] T3_Ceres_Gem = addAggregateArray(
            Vein_Gem.Lapis_Vein,
            Vein_Gem.Olivine_Vein,
            Vein_Gem.Iron_Vein,
            Vein_Gem.Beryllium_Vein,
            SmallOre_Gem.Diamond_SmallOre);
        VoidGemRecipes_T3.put("Ce", T3_Ceres_Gem);

        // T3 - Europa - Eu
        ItemStack[] T3_Europa_Gem = addAggregateArray(Vein_Gem.Magnesite_Vein, Vein_Gem.Ledox_Vein, Vein_Gem.Tin_Vein);
        VoidGemRecipes_T3.put("Eu", T3_Europa_Gem);

        // T3 - Ganymede - Ga
        ItemStack[] T3_Ganymede_Gem = addAggregateArray(
            Vein_Gem.Diamond_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Iron_Vein,
            SmallOre_Gem.Lapis_SmallOre);
        VoidGemRecipes_T3.put("Ga", T3_Ganymede_Gem);

        // T3 - Ross128b - Rb
        ItemStack[] T3_Ross128b_Gem = addAggregateArray(
            Vein_Gem.Bismutite_Bismuthinite_Vein,
            Vein_Gem.Olenite_FluorBuergerite_ChromoAluminoPovondraite_VanadioOxyDravit_Vein,
            Vein_Gem.Thorianite_Vein,
            Vein_Gem.Fayalite_GreenFuchsite_RedZircon_RedFuchsite_Vein,
            Vein_Gem.Forsterite_Fayalite_OrangeDescloizite_RedDescloizite_Vein);
        VoidGemRecipes_T3.put("Rb", T3_Ross128b_Gem);
    }

    public static void addVoidGemRecipes_T4() {
        // T4 - Io - Io
        ItemStack[] T4_Io_Gem = addAggregateArray(
            Vein_Gem.Quartz_Vein,
            Vein_Gem.Pyrolusite_Vein,
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Mytryl_Vein,
            Vein_Gem.Iridium_Vein,
            SmallOre_Gem.Firestone_SmallOre,
            SmallOre_Gem.Lapis_SmallOre);
        VoidGemRecipes_T4.put("Io", T4_Io_Gem);

        // T4 - Mercury - Me
        ItemStack[] T4_Mercury_Gem = addAggregateArray(
            Vein_Gem.Diamond_Vein,
            Vein_Gem.Draconium_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Iron_Vein,
            Vein_Gem.Iridium_Vein);
        VoidGemRecipes_T4.put("Me", T4_Mercury_Gem);

        // T4 - Venus - Ve
        ItemStack[] T4_Venus_Gem = addAggregateArray(
            Vein_Gem.Quartz_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Quantium_Vein,
            Vein_Gem.Iridium_Vein,
            SmallOre_Gem.Diamond_SmallOre,
            SmallOre_Gem.Firestone_SmallOre);
        VoidGemRecipes_T4.put("Ve", T4_Venus_Gem);
    }

    public static void addVoidGemRecipes_T5() {
        // T5 - Enceladus - En
        ItemStack[] T5_Enceladus_Gem = addAggregateArray(
            Vein_Gem.Lapis_Vein,
            Vein_Gem.Osmium_Vein,
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Ledox_Vein,
            Vein_Gem.Iridium_Vein,
            SmallOre_Gem.Lapis_SmallOre);
        VoidGemRecipes_T5.put("En", T5_Enceladus_Gem);

        // T5 - Miranda - Mi
        ItemStack[] T5_Miranda_Gem = addAggregateArray(
            Vein_Gem.Diamond_Vein,
            Vein_Gem.Osmium_Vein,
            Vein_Gem.Draconium_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Pyrolusite_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Iridium_Vein);
        VoidGemRecipes_T5.put("Mi", T5_Miranda_Gem);

        // T5 - Oberon - Ob
        ItemStack[] T5_Oberon_Gem = addAggregateArray(
            Vein_Gem.Osmium_Vein,
            Vein_Gem.Iron_Vein,
            SmallOre_Gem.Diamond_SmallOre,
            SmallOre_Gem.Lapis_SmallOre);
        VoidGemRecipes_T5.put("Ob", T5_Oberon_Gem);

        // T5 - Titan - Ti
        ItemStack[] T5_Titan_Gem = addAggregateArray(
            Vein_Gem.Diamond_Vein,
            Vein_Gem.Osmium_Vein,
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Iridium_Vein,
            SmallOre_Gem.Diamond_SmallOre);
        VoidGemRecipes_T5.put("Ti", T5_Titan_Gem);

        // T5 - Ross128ba - Ra
        ItemStack[] T5_Ross128ba_Gem = addAggregateArray(
            Vein_Gem.Olenite_FluorBuergerite_ChromoAluminoPovondraite_VanadioOxyDravit_Vein,
            Vein_Gem.Hedenbergite_Fayalite_OrangeDescloizite_RedDescloizite_Vein,
            Vein_Gem.Prasiolite_Hedenbergite_Vein,
            Vein_Gem.BArTiMaEuSNeK_Vein,
            Vein_Gem.Tiberium_Vein,
            Vein_Gem.Fluorspar_Vein);
        VoidGemRecipes_T5.put("Ra", T5_Ross128ba_Gem);
    }

    public static void addVoidGemRecipes_T6() {
        // T6 - Proteus - Pr
        ItemStack[] T6_Proteus_Gem = addAggregateArray(
            Vein_Gem.Diamond_Vein,
            Vein_Gem.Osmium_Vein,
            Vein_Gem.Quartz_Vein,
            Vein_Gem.Ilmenite_Vein);
        VoidGemRecipes_T6.put("Pr", T6_Proteus_Gem);

        // T6 - Triton - Tr
        ItemStack[] T6_Triton_Gem = addAggregateArray(
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Iridium_Vein,
            SmallOre_Gem.Diamond_SmallOre);
        VoidGemRecipes_T6.put("Tr", T6_Triton_Gem);
    }

    public static void addVoidGemRecipes_T7() {
        // T7 - Haumea - Ha
        ItemStack[] T7_Haumea_Gem = addAggregateArray(
            Vein_Gem.Olivine_Vein,
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Nether_Star_Vein,
            Vein_Gem.Beryllium_Vein);
        VoidGemRecipes_T7.put("Ha", T7_Haumea_Gem);

        // T7 - Makemake - MM
        ItemStack[] T7_Makemake_Gem = addAggregateArray(
            Vein_Gem.Olivine_Vein,
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Black_Plutonium_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Red_Garnet_Vein);
        VoidGemRecipes_T7.put("MM", T7_Makemake_Gem);

        // T7 - Pluto - Pl
        ItemStack[] T7_Pluto_Gem = addAggregateArray(
            Vein_Gem.Diamond_Vein,
            Vein_Gem.Osmium_Vein,
            Vein_Gem.Black_Plutonium_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Iron_Vein,
            Vein_Gem.Beryllium_Vein);
        VoidGemRecipes_T7.put("Pl", T7_Pluto_Gem);
    }

    public static void addVoidGemRecipes_T8() {
        // T8 - BarnardC - BC
        ItemStack[] T8_BarnardC_Gem = addAggregateArray(
            // Oilsands Vein
            Vein_Gem.Osmium_Vein,
            Vein_Gem.Samarium_Vein,
            Vein_Gem.Black_Plutonium_Vein,
            Vein_Gem.Lignite_Coal_Vein,
            Vein_Gem.Salt_Vein);
        VoidGemRecipes_T8.put("BC", T8_BarnardC_Gem);

        // T8 - BarnardE - BE
        ItemStack[] T8_BarnardE_Gem = addAggregateArray(Vein_Gem.Olivine_Vein, Vein_Gem.Nether_Star_Vein);
        VoidGemRecipes_T8.put("BE", T8_BarnardE_Gem);

        // T8 - BarnardF - BF
        ItemStack[] T8_BarnardF_Gem = addAggregateArray(
            Vein_Gem.Diamond_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Red_Garnet_Vein);
        VoidGemRecipes_T8.put("BF", T8_BarnardF_Gem);

        // T8 - α Centauri Bb - CB
        ItemStack[] T8_Centauri_Gem = addAggregateArray(
            Vein_Gem.Samarium_Vein,
            Vein_Gem.Quartz_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Black_Plutonium_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Tin_Vein,
            Vein_Gem.Nether_Quartz_Vein);
        VoidGemRecipes_T8.put("CB", T8_Centauri_Gem);

        // T8 - TCetiE - TE
        ItemStack[] T8_TCetiE_Gem = addAggregateArray(
            Vein_Gem.Magnesite_Vein,
            Vein_Gem.Quartz_Vein,
            Vein_Gem.Black_Plutonium_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Nether_Star_Vein,
            Vein_Gem.Apatite_Vein,
            Vein_Gem.Salt_Vein,
            SmallOre_Gem.Lapis_SmallOre);
        VoidGemRecipes_T8.put("TE", T8_TCetiE_Gem);

        // T8 - VegaB - VB
        ItemStack[] T8_VegaB_Gem = addAggregateArray(
            Vein_Gem.Lapis_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Nether_Star_Vein,
            Vein_Gem.Red_Garnet_Vein,
            SmallOre_Gem.Diamond_SmallOre);
        VoidGemRecipes_T8.put("VB", T8_VegaB_Gem);
    }

    public static void addVoidGemRecipes_T9() {
        // T9 - Anubis - An
        ItemStack[] T9_Anubis_Gem = addAggregateArray(
            Vein_Gem.Olivine_Vein,
            Vein_Gem.Dolomite_Vein,
            Vein_Gem.Callisto_Ice_Vein,
            Vein_Gem.Mytryl_Vein);
        VoidGemRecipes_T9.put("An", T9_Anubis_Gem);

        // T9 - Horus - Ho
        ItemStack[] T9_Horus_Gem = addAggregateArray(
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
        VoidGemRecipes_T9.put("Ho", T9_Horus_Gem);

        // T9 - Maahes - Mh
        ItemStack[] T9_Maahes_Gem = addAggregateArray(
            Vein_Gem.Callisto_Ice_Vein,
            Vein_Gem.Platinum_Vein,
            Vein_Gem.Quantium_Vein);
        VoidGemRecipes_T9.put("Mh", T9_Maahes_Gem);

        // T9 - MehenBelt - MB
        ItemStack[] T9_MehenBelt_Gem = addAggregateArray(
            Vein_Gem.Lapis_Vein,
            Vein_Gem.Awakened_Draconium_Vein,
            Vein_Gem.Olivine_Vein,
            Vein_Gem.Osmium_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Platinum_Vein,
            Vein_Gem.Iridium_Vein,
            SmallOre_Gem.Lapis_SmallOre,
            SmallOre_Gem.Olivine_SmallOre);
        VoidGemRecipes_T9.put("MB", T9_MehenBelt_Gem);

        // T9 - Neper - Np
        ItemStack[] T9_Neper_Gem = addAggregateArray(
            Vein_Gem.Terra_Aer_Vein,
            Vein_Gem.Certus_Quartz_Vein,
            Vein_Gem.Quartzite_Vein,
            Vein_Gem.Dilithium_Vein,
            Vein_Gem.Dolomite_Vein,
            Vein_Gem.Perditio_Ordo_Vein,
            Vein_Gem.Aqua_Ignis_Amber_Vein,
            Vein_Gem.Nether_Quartz_Vein);
        VoidGemRecipes_T9.put("Np", T9_Neper_Gem);

        // T9 - Seth - Se
        ItemStack[] T9_Seth_Gem = addAggregateArray(
            Vein_Gem.Osmium_Vein,
            Vein_Gem.Samarium_Vein,
            Vein_Gem.Draconium_Vein,
            Vein_Gem.Monazite_Vein,
            Vein_Gem.Iridium_Vein);
        VoidGemRecipes_T9.put("Se", T9_Seth_Gem);
    }

    public static void addVoidGemRecipes_T10() {
        // T10 - DeepDark - DD
        VoidGemRecipes_T10.put("DD", Vein_Gem.T10_Gem);
    }
}
