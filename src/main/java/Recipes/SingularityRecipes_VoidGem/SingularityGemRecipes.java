package Recipes.SingularityRecipes_VoidGem;

import static util.AggregateItemStackArray.addAggregateArray;
import static util.AggregateItemStackArray.checkItemStack;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

import gregtech.api.enums.OrePrefixes;
import util.RegisteredResourceCatalog;

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
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Brown_Limonite_Iron_Vein,
            Vein_Gem.Apatite_Vein,
            Vein_Gem.Rock_Salt_Salt_Vein,
            Vein_Gem.Graphite_Diamond_Vein,
            Vein_Gem.Lazurite_Lapis_Vein,
            Vein_Gem.Coal_Vein,
            Vein_Gem.Dolomite_Vein,
            Vein_Gem.Lignite_Coal_Vein,
            SmallOre_Gem.Overworld_SmallOre);
        ItemStack[] T0_Overworld_Gem_Checked = checkItemStack(T0_Overworld_Gem);
        VoidGemRecipes_T0.put("Ow", T0_Overworld_Gem_Checked);

        // T0 - Nether - Ne
        ItemStack[] T0_Nether_Gem = addAggregateArray(
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Brown_Limonite_Iron_Vein,
            Vein_Gem.Sulfur_Vein,
            Vein_Gem.Quartzite_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Nether_Quartz_Vein,
            SmallOre_Gem.Nether_SmallOre);
        ItemStack[] T0_Nether_Gem_Checked = checkItemStack(T0_Nether_Gem);
        VoidGemRecipes_T0.put("Ne", T0_Nether_Gem_Checked);

        // T0 - Twilight - TF
        ItemStack[] T0_Twilight_Gem = addAggregateArray(
            Vein_Gem.Brown_Limonite_Iron_Vein,
            Vein_Gem.Apatite_Vein,
            Vein_Gem.Rock_Salt_Salt_Vein,
            Vein_Gem.Graphite_Diamond_Vein,
            Vein_Gem.Lazurite_Lapis_Vein,
            Vein_Gem.Bentonite_Olivine_Vein,
            Vein_Gem.Terra_Aer_Vein,
            Vein_Gem.Coal_Vein,
            Vein_Gem.Almandine_Sapphire_Vein,
            Vein_Gem.Perditio_Ordo_Vein,
            Vein_Gem.Aqua_Ignis_Amber_Vein,
            SmallOre_Gem.Twilight_SmallOre);
        ItemStack[] T0_Twilight_Gem_Checked = checkItemStack(T0_Twilight_Gem);
        VoidGemRecipes_T0.put("TF", T0_Twilight_Gem_Checked);

        // T0 - TheEnd - ED
        ItemStack[] T0_TheEnd_Gem = addAggregateArray(Vein_Gem.Beryllium_Vein);
        ItemStack[] T0_TheEnd_Gem_Checked = checkItemStack(T0_TheEnd_Gem);
        VoidGemRecipes_T0.put("ED", T0_TheEnd_Gem_Checked);

        // T0 - EndAsteroid - EA
        ItemStack[] T0_EndAsteroid_Gem = addAggregateArray(
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Lazurite_Lapis_Vein,
            Vein_Gem.Bentonite_Olivine_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Sheldonite_Platinum_Vein);
        ItemStack[] T0_EndAsteroid_Gem_Checked = checkItemStack(T0_EndAsteroid_Gem);
        VoidGemRecipes_T0.put("EA", T0_EndAsteroid_Gem_Checked);

        // T0 - TheToxicEverglades - Eg
        ItemStack[] T0_TheToxicEverglades_Gem = addAggregateArray(
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Lazurite_Lapis_Vein,
            Vein_Gem.Bentonite_Olivine_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Sheldonite_Platinum_Vein);
        ItemStack[] T0_TheToxicEverglades_Gem_Checked = checkItemStack(T0_TheToxicEverglades_Gem);
        VoidGemRecipes_T0.put("Eg", T0_TheToxicEverglades_Gem_Checked);
    }

    public static void addVoidGemRecipes_T1() {
        // T1 - Moon - Mo
        ItemStack[] T1_Moon_Gem = addAggregateArray(
            Vein_Gem.Quartzite_Quartz_Vein,
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Ilmenite_Vein);
        ItemStack[] T1_Moon_Gem_Checked = checkItemStack(T1_Moon_Gem);
        VoidGemRecipes_T1.put("Mo", T1_Moon_Gem_Checked);
    }

    public static void addVoidGemRecipes_T2() {
        // T2 - Deimos - De
        ItemStack[] T2_Deimos_Gem = addAggregateArray(
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Oriharukon_Vein,
            Vein_Gem.Sulfur_Vein,
            Vein_Gem.Lazurite_Lapis_Vein,
            Vein_Gem.Draconium_Vein,
            SmallOre_Gem.Deimos_SmallOre);
        ItemStack[] T2_Deimos_Gem_Checked = checkItemStack(T2_Deimos_Gem);
        VoidGemRecipes_T2.put("De", T2_Deimos_Gem_Checked);

        // T2 - Mars - Ma
        ItemStack[] T2_Mars_Gem = addAggregateArray(
            Vein_Gem.Quartzite_Quartz_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Brown_Limonite_Iron_Vein,
            Vein_Gem.Rock_Salt_Salt_Vein,
            Vein_Gem.Sulfur_Vein);
        ItemStack[] T2_Mars_Gem_Checked = checkItemStack(T2_Mars_Gem);
        VoidGemRecipes_T2.put("Ma", T2_Mars_Gem_Checked);

        // T2 - Phobos - Ph
        ItemStack[] T2_Phobos_Gem = addAggregateArray(
            Vein_Gem.Quartzite_Quartz_Vein,
            Vein_Gem.Oriharukon_Vein,
            Vein_Gem.Sulfur_Vein,
            Vein_Gem.Graphite_Diamond_Vein,
            Vein_Gem.Draconium_Vein,
            SmallOre_Gem.Phobos_SmallOre);
        ItemStack[] T2_Phobos_Gem_Checked = checkItemStack(T2_Phobos_Gem);
        VoidGemRecipes_T2.put("Ph", T2_Phobos_Gem_Checked);
    }

    public static void addVoidGemRecipes_T3() {
        // T3 - Asteroids - As
        ItemStack[] T3_Asteroids_Gem = addAggregateArray(
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Platinum_Palladium_Vein,
            Vein_Gem.Sheldonite_Platinum_Vein,
            SmallOre_Gem.Asteroids_SmallOre);
        ItemStack[] T3_Asteroids_Gem_Checked = checkItemStack(T3_Asteroids_Gem);
        VoidGemRecipes_T3.put("As", T3_Asteroids_Gem_Checked);

        // T3 - Callisto - Ca
        ItemStack[] T3_Callisto_Gem = addAggregateArray(
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Brown_Limonite_Iron_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Platinum_Palladium_Vein,
            Vein_Gem.Callisto_Ice_Vein,
            SmallOre_Gem.Callisto_SmallOre);
        ItemStack[] T3_Callisto_Gem_Checked = checkItemStack(T3_Callisto_Gem);
        VoidGemRecipes_T3.put("Ca", T3_Callisto_Gem_Checked);

        // T3 - Ceres - Ce
        ItemStack[] T3_Ceres_Gem = addAggregateArray(
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Brown_Limonite_Iron_Vein,
            Vein_Gem.Lazurite_Lapis_Vein,
            Vein_Gem.Bentonite_Olivine_Vein,
            Vein_Gem.Platinum_Palladium_Vein,
            Vein_Gem.Beryllium_Vein,
            SmallOre_Gem.Ceres_SmallOre);
        ItemStack[] T3_Ceres_Gem_Checked = checkItemStack(T3_Ceres_Gem);
        VoidGemRecipes_T3.put("Ce", T3_Ceres_Gem_Checked);

        // T3 - Europa - Eu
        ItemStack[] T3_Europa_Gem = addAggregateArray(Vein_Gem.Magnesite_Vein, Vein_Gem.Ledox_Vein);
        ItemStack[] T3_Europa_Gem_Checked = checkItemStack(T3_Europa_Gem);
        VoidGemRecipes_T3.put("Eu", T3_Europa_Gem_Checked);

        // T3 - Ganymede - Ga
        ItemStack[] T3_Ganymede_Gem = addAggregateArray(
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Brown_Limonite_Iron_Vein,
            Vein_Gem.Graphite_Diamond_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Platinum_Palladium_Vein,
            SmallOre_Gem.Ganymede_SmallOre);
        ItemStack[] T3_Ganymede_Gem_Checked = checkItemStack(T3_Ganymede_Gem);
        VoidGemRecipes_T3.put("Ga", T3_Ganymede_Gem_Checked);

        // T3 - Ross128b - Rb
        ItemStack[] T3_Ross128b_Gem = addAggregateArray(
            Vein_Gem.Hedenbergite_Vein,
            Vein_Gem.Olenite_Vein,
            Vein_Gem.Forsterite_Vein,
            Vein_Gem.Thorianite_Vein,
            Vein_Gem.Graphite_Vein,
            Vein_Gem.Fayalite_Vein,
            Vein_Gem.Bismutite_Vein);
        ItemStack[] T3_Ross128b_Gem_Checked = checkItemStack(T3_Ross128b_Gem);
        VoidGemRecipes_T3.put("Rb", T3_Ross128b_Gem_Checked);
    }

    public static void addVoidGemRecipes_T4() {
        // T4 - Io - Io
        ItemStack[] T4_Io_Gem = addAggregateArray(
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Quartzite_Quartz_Vein,
            Vein_Gem.Pyrolusite_Vein,
            Vein_Gem.Gold_Infused_Gold_Vein,
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Sulfur_Vein,
            Vein_Gem.Platinum_Palladium_Vein,
            Vein_Gem.Mytryl_Vein,
            Vein_Gem.Nickel_Iridium_Vein,
            SmallOre_Gem.Io_SmallOre);
        ItemStack[] T4_Io_Gem_Checked = checkItemStack(T4_Io_Gem);
        VoidGemRecipes_T4.put("Io", T4_Io_Gem_Checked);

        // T4 - Mercury - Me
        ItemStack[] T4_Mercury_Gem = addAggregateArray(
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Brown_Limonite_Iron_Vein,
            Vein_Gem.Graphite_Diamond_Vein,
            Vein_Gem.Draconium_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Platinum_Palladium_Vein,
            Vein_Gem.Nickel_Iridium_Vein);
        ItemStack[] T4_Mercury_Gem_Checked = checkItemStack(T4_Mercury_Gem);
        VoidGemRecipes_T4.put("Me", T4_Mercury_Gem_Checked);

        // T4 - Venus - Ve
        ItemStack[] T4_Venus_Gem = addAggregateArray(
            Vein_Gem.Quartzite_Quartz_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Sulfur_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Quantium_Vein,
            Vein_Gem.Nickel_Iridium_Vein,
            SmallOre_Gem.Venus_SmallOre);
        ItemStack[] T4_Venus_Gem_Checked = checkItemStack(T4_Venus_Gem);
        VoidGemRecipes_T4.put("Ve", T4_Venus_Gem_Checked);
    }

    public static void addVoidGemRecipes_T5() {
        // T5 - Enceladus - En
        ItemStack[] T5_Enceladus_Gem = addAggregateArray(
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Ledox_Vein,
            Vein_Gem.Lazurite_Lapis_Vein,
            Vein_Gem.Nickel_Osmium_Vein,
            Vein_Gem.Nickel_Iridium_Vein,
            SmallOre_Gem.Enceladus_SmallOre);
        ItemStack[] T5_Enceladus_Gem_Checked = checkItemStack(T5_Enceladus_Gem);
        VoidGemRecipes_T5.put("En", T5_Enceladus_Gem_Checked);

        // T5 - Miranda - Mi
        ItemStack[] T5_Miranda_Gem = addAggregateArray(
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Pyrolusite_Vein,
            Vein_Gem.Graphite_Diamond_Vein,
            Vein_Gem.Nickel_Osmium_Vein,
            Vein_Gem.Draconium_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Nickel_Iridium_Vein);
        ItemStack[] T5_Miranda_Gem_Checked = checkItemStack(T5_Miranda_Gem);
        VoidGemRecipes_T5.put("Mi", T5_Miranda_Gem_Checked);

        // T5 - Oberon - Ob
        ItemStack[] T5_Oberon_Gem = addAggregateArray(
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Brown_Limonite_Iron_Vein,
            Vein_Gem.Nickel_Osmium_Vein,
            Vein_Gem.Platinum_Palladium_Vein,
            SmallOre_Gem.Oberon_SmallOre);
        ItemStack[] T5_Oberon_Gem_Checked = checkItemStack(T5_Oberon_Gem);
        VoidGemRecipes_T5.put("Ob", T5_Oberon_Gem_Checked);

        // T5 - Titan - Ti
        ItemStack[] T5_Titan_Gem = addAggregateArray(
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Gold_Infused_Gold_Vein,
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Graphite_Diamond_Vein,
            Vein_Gem.Nickel_Osmium_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Nickel_Iridium_Vein,
            SmallOre_Gem.Titan_SmallOre);
        ItemStack[] T5_Titan_Gem_Checked = checkItemStack(T5_Titan_Gem);
        VoidGemRecipes_T5.put("Ti", T5_Titan_Gem_Checked);

        // T5 - Ross128ba - Ra
        ItemStack[] T5_Ross128ba_Gem = addAggregateArray(
            Vein_Gem.BArTiMaEuSNeK_Vein,
            Vein_Gem.Amethyst_Vein,
            Vein_Gem.Fayalite_Vein,
            Vein_Gem.Tiberium_Vein,
            Vein_Gem.Olenite_Vein);
        ItemStack[] T5_Ross128ba_Gem_Checked = checkItemStack(T5_Ross128ba_Gem);
        VoidGemRecipes_T5.put("Ra", T5_Ross128ba_Gem_Checked);
    }

    public static void addVoidGemRecipes_T6() {
        // T6 - Proteus - Pr
        ItemStack[] T6_Proteus_Gem = addAggregateArray(
            Vein_Gem.Quartzite_Quartz_Vein,
            Vein_Gem.Gold_Infused_Gold_Vein,
            Vein_Gem.Graphite_Diamond_Vein,
            Vein_Gem.Nickel_Osmium_Vein,
            Vein_Gem.Ilmenite_Vein);
        ItemStack[] T6_Proteus_Gem_Checked = checkItemStack(T6_Proteus_Gem);
        VoidGemRecipes_T6.put("Pr", T6_Proteus_Gem_Checked);

        // T6 - Triton - Tr
        ItemStack[] T6_Triton_Gem = addAggregateArray(
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Nickel_Iridium_Vein,
            SmallOre_Gem.Triton_SmallOre);
        ItemStack[] T6_Triton_Gem_Checked = checkItemStack(T6_Triton_Gem);
        VoidGemRecipes_T6.put("Tr", T6_Triton_Gem_Checked);
    }

    public static void addVoidGemRecipes_T7() {
        // T7 - Haumea - Ha
        ItemStack[] T7_Haumea_Gem = addAggregateArray(
            Vein_Gem.Gold_Infused_Gold_Vein,
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Garnet_Sand_Nether_Star_Vein,
            Vein_Gem.Bentonite_Olivine_Vein,
            Vein_Gem.Beryllium_Vein);
        ItemStack[] T7_Haumea_Gem_Checked = checkItemStack(T7_Haumea_Gem);
        VoidGemRecipes_T7.put("Ha", T7_Haumea_Gem_Checked);

        // T7 - Kuiper Belt - KB
        ItemStack[] T7_Kuiperbelt_Gem = addAggregateArray(
            Vein_Gem.Graphite_Diamond_Vein,
            Vein_Gem.Nickel_Osmium_Vein,
            Vein_Gem.Platinum_Palladium_Vein,
            Vein_Gem.Nickel_Iridium_Vein,
            SmallOre_Gem.Kuiperbelt_SmallOre);
        ItemStack[] T7_Kuiperbelt_Gem_Checked = checkItemStack(T7_Kuiperbelt_Gem);
        VoidGemRecipes_T7.put("KB", T7_Kuiperbelt_Gem_Checked);

        // T7 - Makemake - MM
        ItemStack[] T7_Makemake_Gem = addAggregateArray(
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Black_Plutonium_Vein,
            Vein_Gem.Red_Garnet_Vein,
            Vein_Gem.Bentonite_Olivine_Vein,
            Vein_Gem.Beryllium_Vein);
        ItemStack[] T7_Makemake_Gem_Checked = checkItemStack(T7_Makemake_Gem);
        VoidGemRecipes_T7.put("MM", T7_Makemake_Gem_Checked);

        // T7 - Pluto - Pl
        ItemStack[] T7_Pluto_Gem = addAggregateArray(
            Vein_Gem.Black_Plutonium_Vein,
            Vein_Gem.Brown_Limonite_Iron_Vein,
            Vein_Gem.Graphite_Diamond_Vein,
            Vein_Gem.Nickel_Osmium_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Platinum_Palladium_Vein,
            Vein_Gem.Beryllium_Vein);
        ItemStack[] T7_Pluto_Gem_Checked = checkItemStack(T7_Pluto_Gem);
        VoidGemRecipes_T7.put("Pl", T7_Pluto_Gem_Checked);
    }

    public static void addVoidGemRecipes_T8() {
        // T8 - BarnardC - BC
        ItemStack[] T8_BarnardC_Gem = addAggregateArray(
            Vein_Gem.Black_Plutonium_Vein,
            Vein_Gem.Rock_Salt_Salt_Vein,
            Vein_Gem.Nickel_Osmium_Vein,
            Vein_Gem.Samarium_Vein,
            Vein_Gem.Lignite_Coal_Vein);
        ItemStack[] T8_BarnardC_Gem_Checked = checkItemStack(T8_BarnardC_Gem);
        VoidGemRecipes_T8.put("BC", T8_BarnardC_Gem_Checked);

        // T8 - BarnardE - BE
        ItemStack[] T8_BarnardE_Gem = addAggregateArray(
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Gold_Infused_Gold_Vein,
            Vein_Gem.Garnet_Sand_Nether_Star_Vein,
            Vein_Gem.Bentonite_Olivine_Vein);
        ItemStack[] T8_BarnardE_Gem_Checked = checkItemStack(T8_BarnardE_Gem);
        VoidGemRecipes_T8.put("BE", T8_BarnardE_Gem_Checked);

        // T8 - BarnardF - BF
        ItemStack[] T8_BarnardF_Gem = addAggregateArray(
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Red_Garnet_Vein,
            Vein_Gem.Graphite_Diamond_Vein,
            Vein_Gem.Beryllium_Vein);
        ItemStack[] T8_BarnardF_Gem_Checked = checkItemStack(T8_BarnardF_Gem);
        VoidGemRecipes_T8.put("BF", T8_BarnardF_Gem_Checked);

        // T8 - α Centauri Bb - CB
        ItemStack[] T8_Centauri_Gem = addAggregateArray(
            Vein_Gem.Grossular_Manganese_Vein,
            Vein_Gem.Quartzite_Quartz_Vein,
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Black_Plutonium_Vein,
            Vein_Gem.Sulfur_Vein,
            Vein_Gem.Samarium_Vein,
            Vein_Gem.Beryllium_Vein,
            Vein_Gem.Nether_Quartz_Vein);
        ItemStack[] T8_Centauri_Gem_Checked = checkItemStack(T8_Centauri_Gem);
        VoidGemRecipes_T8.put("CB", T8_Centauri_Gem_Checked);

        // T8 - TCetiE - TE
        ItemStack[] T8_TCetiE_Gem = addAggregateArray(
            Vein_Gem.Magnesite_Vein,
            Vein_Gem.Quartzite_Quartz_Vein,
            Vein_Gem.Black_Plutonium_Vein,
            Vein_Gem.Garnet_Sand_Nether_Star_Vein,
            Vein_Gem.Apatite_Vein,
            Vein_Gem.Rock_Salt_Salt_Vein,
            Vein_Gem.Ilmenite_Vein,
            SmallOre_Gem.TCetiE_SmallOre);
        ItemStack[] T8_TCetiE_Gem_Checked = checkItemStack(T8_TCetiE_Gem);
        VoidGemRecipes_T8.put("TE", T8_TCetiE_Gem_Checked);

        // T8 - VegaB - VB
        ItemStack[] T8_VegaB_Gem = addAggregateArray(
            Vein_Gem.Redstone_Vein,
            Vein_Gem.Gold_Infused_Gold_Vein,
            Vein_Gem.Garnet_Sand_Nether_Star_Vein,
            Vein_Gem.Red_Garnet_Vein,
            Vein_Gem.Lazurite_Lapis_Vein,
            SmallOre_Gem.VegaB_SmallOre);
        ItemStack[] T8_VegaB_Gem_Checked = checkItemStack(T8_VegaB_Gem);
        VoidGemRecipes_T8.put("VB", T8_VegaB_Gem_Checked);
    }

    public static void addVoidGemRecipes_T9() {
        // T9 - Anubis - An
        ItemStack[] T9_Anubis_Gem = addAggregateArray(
            Vein_Gem.Sulfur_Vein,
            Vein_Gem.Bentonite_Olivine_Vein,
            Vein_Gem.Dolomite_Vein,
            Vein_Gem.Callisto_Ice_Vein,
            Vein_Gem.Mytryl_Vein);
        ItemStack[] T9_Anubis_Gem_Checked = checkItemStack(T9_Anubis_Gem);
        VoidGemRecipes_T9.put("An", T9_Anubis_Gem_Checked);

        // T9 - Horus - Ho
        ItemStack[] T9_Horus_Gem = addAggregateArray(
            Vein_Gem.Magnesite_Vein,
            Vein_Gem.Quartzite_Quartz_Vein,
            Vein_Gem.Black_Plutonium_Vein,
            Vein_Gem.Garnet_Sand_Nether_Star_Vein,
            Vein_Gem.Red_Garnet_Vein,
            Vein_Gem.Oriharukon_Vein,
            Vein_Gem.Ledox_Vein,
            Vein_Gem.Certus_Quartz_Vein,
            Vein_Gem.Draconium_Vein,
            Vein_Gem.Almandine_Sapphire_Vein,
            Vein_Gem.Mytryl_Vein,
            Vein_Gem.Quantium_Vein,
            SmallOre_Gem.Horus_SmallOre);
        ItemStack[] T9_Horus_Gem_Checked = checkItemStack(T9_Horus_Gem);
        VoidGemRecipes_T9.put("Ho", T9_Horus_Gem_Checked);

        // T9 - Maahes - Mh
        ItemStack[] T9_Maahes_Gem = addAggregateArray(
            Vein_Gem.Callisto_Ice_Vein,
            Vein_Gem.Sheldonite_Platinum_Vein,
            Vein_Gem.Quantium_Vein);
        ItemStack[] T9_Maahes_Gem_Checked = checkItemStack(T9_Maahes_Gem);
        VoidGemRecipes_T9.put("Mh", T9_Maahes_Gem_Checked);

        // T9 - MehenBelt - MB
        ItemStack[] T9_MehenBelt_Gem = addAggregateArray(
            Vein_Gem.Draconium_Awakened_Draconium_Vein,
            Vein_Gem.Lazurite_Lapis_Vein,
            Vein_Gem.Bentonite_Olivine_Vein,
            Vein_Gem.Nickel_Osmium_Vein,
            Vein_Gem.Ilmenite_Vein,
            Vein_Gem.Platinum_Palladium_Vein,
            Vein_Gem.Sheldonite_Platinum_Vein,
            Vein_Gem.Nickel_Iridium_Vein,
            SmallOre_Gem.MehenBelt_SmallOre);
        ItemStack[] T9_MehenBelt_Gem_Checked = checkItemStack(T9_MehenBelt_Gem);
        VoidGemRecipes_T9.put("MB", T9_MehenBelt_Gem_Checked);

        // T9 - Neper - Np
        ItemStack[] T9_Neper_Gem = addAggregateArray(
            Vein_Gem.Dilithium_Vein,
            Vein_Gem.Terra_Aer_Vein,
            Vein_Gem.Certus_Quartz_Vein,
            Vein_Gem.Quartzite_Vein,
            Vein_Gem.Dolomite_Vein,
            Vein_Gem.Perditio_Ordo_Vein,
            Vein_Gem.Aqua_Ignis_Amber_Vein,
            Vein_Gem.Nether_Quartz_Vein);
        ItemStack[] T9_Neper_Gem_Checked = checkItemStack(T9_Neper_Gem);
        VoidGemRecipes_T9.put("Np", T9_Neper_Gem_Checked);

        // T9 - Seth - Se
        ItemStack[] T9_Seth_Gem = addAggregateArray(
            Vein_Gem.Bastnasite_Monazite_Vein,
            Vein_Gem.Nickel_Osmium_Vein,
            Vein_Gem.Samarium_Vein,
            Vein_Gem.Draconium_Vein,
            Vein_Gem.Platinum_Palladium_Vein,
            Vein_Gem.Nickel_Iridium_Vein);
        ItemStack[] T9_Seth_Gem_Checked = checkItemStack(T9_Seth_Gem);
        VoidGemRecipes_T9.put("Se", T9_Seth_Gem_Checked);
    }

    public static void addVoidGemRecipes_T10() {
        // T10 - DeepDark - DD
        VoidGemRecipes_T10.put("DD", RegisteredResourceCatalog.collectOreItems(OrePrefixes.gem, Vein_Gem.T10_Gem));
    }
}
