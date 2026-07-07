package Recipes.ChaosRecipes;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import java.util.*;

import EnumList.EnumItemList.EnumMaterialList.CrushedOreList;
import EnumList.EnumItemList.EnumMaterialList.DustList;
import EnumList.EnumItemList.EnumMaterialList.GemList;
import EnumList.EnumItemList.EnumMaterialList.OreList;
import EnumList.EnumItemList.EnumMaterialList.RawOreList;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.OreProcessOfChaosFrontend;

public class ChaosOreRecipes {

    private static class Ore_List {

        ItemStack[] Ore;
        ItemStack RawOre;
        ItemStack CrushedOre;
        Map<ItemStack, Integer> Product;

        public Ore_List(ItemStack[] Ore, ItemStack RawOre, ItemStack CrushedOre, Map<ItemStack, Integer> Product) {
            this.Ore = Ore;
            this.RawOre = RawOre;
            this.CrushedOre = CrushedOre;
            this.Product = Product;
        }
    }

    public static final RecipeMap<RecipeMapBackend> addFakeChaosOreRecipes = RecipeMapBuilder.of("Chaos of Ore")
        .maxIO(1, 16, 2, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(165))
        .frontend(OreProcessOfChaosFrontend::new)
        .neiTransferRect(62, 44, 20, 16)
        .build();

    public static void addChaosOreRecipes() {
        ArrayList<Ore_List> ore_List = new ArrayList<>();

        // "Bismutite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {OreList.Bismutite_Ore},
                RawOreList.Raw_Bismutite_Ore,
                CrushedOreList.Crushed_Bismutite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Bismutite_Dust, 6);
                        put(GemList.Bismutite, 3);
                        put(GemList.Exquisite_Bismutite, 1);
                        put(GemList.Flawless_Bismutite, 1);
                        put(GemList.Flawed_Bismutite, 1);
                        put(GemList.Chipped_Bismutite, 1);
                        put(DustList.Bismuth_Dust, 7);
                    }
                }));

        // "Bismuthinite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Bismuthinite_Ore },
                RawOreList.Raw_Bismuthinite_Ore,
                CrushedOreList.Crushed_Bismuthinite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Bismuthinite_Dust, 6);
                        put(DustList.Bismuth_Dust, 4);
                        put(DustList.Sulfur_Dust, 4);
                    }
                }));

        // "Fluor-Buergerite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Fluor_Buergerite_Ore },
                RawOreList.Raw_Fluor_Buergerite_Ore,
                CrushedOreList.Crushed_Fluor_Buergerite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Fluor_Buergerite_Dust, 6);
                        put(GemList.Fluor_Buergerite, 3);
                        put(GemList.Exquisite_Fluor_Buergerite, 1);
                        put(GemList.Flawless_Fluor_Buergerite, 1);
                        put(GemList.Flawed_Fluor_Buergerite, 1);
                        put(GemList.Chipped_Fluor_Buergerite, 1);
                        put(DustList.Boron_Dust, 3);
                        put(DustList.Iron_Dust, 1);
                        put(DustList.Silicon_Dioxide_Dust, 1);
                        put(DustList.Sodium_Dust, 3);
                    }
                }));

        // "Chromo-Alumino-Povondraite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Chromo_Alumino_Povondraite_Ore },
                RawOreList.Raw_Chromo_Alumino_Povondraite_Ore,
                CrushedOreList.Crushed_Chromo_Alumino_Povondraite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Chromo_Alumino_Povondraite_Dust, 6);
                        put(GemList.Chromo_Alumino_Povondraite, 3);
                        put(GemList.Exquisite_Chromo_Alumino_Povondraite, 1);
                        put(GemList.Flawless_Chromo_Alumino_Povondraite, 1);
                        put(GemList.Flawed_Chromo_Alumino_Povondraite, 1);
                        put(GemList.Chipped_Chromo_Alumino_Povondraite, 1);
                        put(DustList.Boron_Dust, 3);
                        put(DustList.Iron_Dust, 1);
                        put(DustList.Silicon_Dioxide_Dust, 1);
                        put(DustList.Sodium_Dust, 3);
                    }
                }));

        // "Vanadio-Oxy-Dravite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Vanadio_Oxy_Dravite_Ore },
                RawOreList.Raw_Vanadio_Oxy_Dravite_Ore,
                CrushedOreList.Crushed_Vanadio_Oxy_Dravite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Vanadio_Oxy_Dravite_Dust, 6);
                        put(GemList.Vanadio_Oxy_Dravite, 3);
                        put(GemList.Exquisite_Vanadio_Oxy_Dravite, 1);
                        put(GemList.Flawless_Vanadio_Oxy_Dravite, 1);
                        put(GemList.Flawed_Vanadio_Oxy_Dravite, 1);
                        put(GemList.Chipped_Vanadio_Oxy_Dravite, 1);
                        put(DustList.Boron_Dust, 3);
                        put(DustList.Iron_Dust, 1);
                        put(DustList.Silicon_Dioxide_Dust, 1);
                        put(DustList.Sodium_Dust, 3);
                    }
                }));

        // "Olenite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Olenite_Ore },
                RawOreList.Raw_Olenite_Ore,
                CrushedOreList.Crushed_Olenite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Olenite_Dust, 6);
                        put(GemList.Olenite, 3);
                        put(GemList.Exquisite_Olenite, 1);
                        put(GemList.Flawless_Olenite, 1);
                        put(GemList.Flawed_Olenite, 1);
                        put(GemList.Chipped_Olenite, 1);
                        put(DustList.Boron_Dust, 3);
                        put(DustList.Iron_Dust, 1);
                        put(DustList.Silicon_Dioxide_Dust, 1);
                        put(DustList.Sodium_Dust, 3);
                    }
                }));

        // "Arsenopyrite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Arsenopyrite_Ore },
                RawOreList.Raw_Arsenopyrite_Ore,
                CrushedOreList.Crushed_Arsenopyrite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Arsenopyrite_Dust, 7);
                        put(DustList.Arsenic_Dust, 3);
                        put(DustList.Iron_Dust, 2);
                        put(DustList.Sulfur_Dust, 4);
                    }
                }));

        // "Ferberite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Ferberite_Ore },
                RawOreList.Raw_Ferberite_Ore,
                CrushedOreList.Crushed_Ferberite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Ferberite_Dust, 7);
                        put(DustList.Iron_Dust, 5);
                        put(DustList.Tungsten_Dust, 4);
                    }
                }));

        // "Loellingite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Loellingite_Ore },
                RawOreList.Raw_Loellingite_Ore,
                CrushedOreList.Crushed_Loellingite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Loellingite_Dust, 7);
                        put(DustList.Arsenic_Dust, 4);
                        put(DustList.Iron_Dust, 5);
                    }
                }));

        // "Roquesite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Roquesite_Ore },
                RawOreList.Raw_Roquesite_Ore,
                CrushedOreList.Crushed_Roquesite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Roquesite_Dust, 6);
                        put(DustList.Copper_Dust, 4);
                        put(DustList.Sulfur_Dust, 5);
                    }
                }));

        // "Bornite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Bornite_Ore },
                RawOreList.Raw_Bornite_Ore,
                CrushedOreList.Crushed_Bornite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Bornite_Dust, 7);
                        put(DustList.Copper_Dust, 4);
                        put(DustList.Iron_Dust, 5);
                        put(DustList.Sulfur_Dust, 1);
                    }
                }));

        // "Wittichenite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Wittichenite_Ore },
                RawOreList.Raw_Wittichenite_Ore,
                CrushedOreList.Crushed_Wittichenite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Wittichenite_Dust, 6);
                        put(DustList.Bismuth_Dust, 4);
                        put(DustList.Copper_Dust, 4);
                        put(DustList.Sulfur_Dust, 1);
                    }
                }));

        // "Djurleite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Djurleite_Ore },
                RawOreList.Raw_Djurleite_Ore,
                CrushedOreList.Crushed_Djurleite_Ore,
                new HashMap<>() {

                    {
                        // "Djurleite Dust"
                        put(DustList.Djurleite_Dust, 6);
                        put(DustList.Copper_Dust, 8);
                        put(DustList.Sulfur_Dust, 1);
                    }
                }));

        // "Huebnerite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Huebnerite_Ore },
                RawOreList.Raw_Huebnerite_Ore,
                CrushedOreList.Crushed_Huebnerite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Huebnerite_Dust, 7);
                        put(DustList.Iron_Dust, 1);
                        put(DustList.Manganese_Dust, 4);
                        put(DustList.Tungsten_Dust, 4);
                    }
                }));

        // "Thorianite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Thorianite_Ore },
                RawOreList.Raw_Thorianite_Ore,
                CrushedOreList.Crushed_Thorianite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Thorianite_Dust, 9);
                        put(DustList.Thorium_232_Dust, 1);
                        put(DustList.Thorium_Dust, 10);
                    }
                }));

        // "Red Zircon Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Red_Zircon_Ore },
                RawOreList.Raw_Red_Zircon_Ore,
                CrushedOreList.Crushed_Red_Zircon_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Red_Zircon_Dust, 6);
                        put(DustList.Zirconium_Dust, 3);
                        put(GemList.Red_Zircon, 3);
                        put(GemList.Exquisite_Red_Zircon, 1);
                        put(GemList.Flawless_Red_Zircon, 1);
                        put(GemList.Flawed_Red_Zircon, 1);
                        put(GemList.Chipped_Red_Zircon, 1);
                        put(DustList.Silicon_Dioxide_Dust, 4);
                    }
                }));

        // "Fayalite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Fayalite_Ore },
                RawOreList.Raw_Fayalite_Ore,
                CrushedOreList.Crushed_Fayalite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Fayalite_Dust, 7);
                        put(GemList.Fayalite, 3);
                        put(GemList.Exquisite_Fayalite, 1);
                        put(GemList.Flawless_Fayalite, 1);
                        put(GemList.Flawed_Fayalite, 1);
                        put(GemList.Chipped_Fayalite, 1);
                        put(DustList.Iron_Dust, 4);
                        put(DustList.Silicon_Dioxide_Dust, 4);
                    }
                }));

        // "Forsterite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Forsterite_Ore },
                RawOreList.Raw_Forsterite_Ore,
                CrushedOreList.Crushed_Forsterite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Forsterite_Dust, 6);
                        put(GemList.Forsterite, 3);
                        put(GemList.Exquisite_Forsterite, 1);
                        put(GemList.Flawless_Forsterite, 1);
                        put(GemList.Flawed_Forsterite, 1);
                        put(GemList.Chipped_Forsterite, 1);
                        put(DustList.Magnesium_Dust, 3);
                        put(DustList.Silicon_Dioxide_Dust, 4);
                    }
                }));

        // "Hedenbergite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Hedenbergite_Ore },
                RawOreList.Raw_Hedenbergite_Ore,
                CrushedOreList.Crushed_Hedenbergite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Hedenbergite_Dust, 7);
                        put(GemList.Hedenbergite, 3);
                        put(GemList.Exquisite_Hedenbergite, 1);
                        put(GemList.Flawless_Hedenbergite, 1);
                        put(GemList.Flawed_Hedenbergite, 1);
                        put(GemList.Chipped_Hedenbergite, 1);
                        put(DustList.Calcium_Dust, 3);
                        put(DustList.Iron_Dust, 4);
                        put(DustList.Silicon_Dioxide_Dust, 1);
                    }
                }));

        // "Red Descloizite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Red_Descloizite_Ore },
                RawOreList.Raw_Red_Descloizite_Ore,
                CrushedOreList.Crushed_Red_Descloizite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Red_Descloizite_Dust, 6);
                        put(DustList.Lead_Dust, 4);
                        put(DustList.Copper_Dust, 4);
                        put(DustList.Vanadium_Dust, 1);
                    }
                }));

        // "Orange Descloizite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Orange_Descloizite_Ore },
                RawOreList.Raw_Orange_Descloizite_Ore,
                CrushedOreList.Crushed_Orange_Descloizite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Orange_Descloizite_Dust, 6);
                        put(DustList.Lead_Dust, 4);
                        put(DustList.Vanadium_Dust, 1);
                        put(DustList.Zinc_Dust, 4);
                    }
                }));

        // "Green Fuchsite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Green_Fuchsite_Ore },
                RawOreList.Raw_Green_Fuchsite_Ore,
                CrushedOreList.Crushed_Green_Fuchsite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Green_Fuchsite_Dust, 6);
                        put(DustList.Alumina_Dust, 3);
                        put(DustList.Potassium_Dust, 4);
                        put(DustList.Silicon_Dioxide_Dust, 1);
                    }
                }));

        // "Red Fuchsite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Red_Fuchsite_Ore },
                RawOreList.Raw_Red_Fuchsite_Ore,
                CrushedOreList.Crushed_Red_Fuchsite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Red_Fuchsite_Dust, 7);
                        put(DustList.Chrome_Dust, 3);
                        put(DustList.Iron_Dust, 1);
                        put(DustList.Potassium_Dust, 4);
                        put(DustList.Silicon_Dioxide_Dust, 1);
                    }
                }));

        // "Prasiolite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Prasiolite_Ore },
                RawOreList.Raw_Prasiolite_Ore,
                CrushedOreList.Crushed_Prasiolite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Prasiolite_Dust, 13);
                        put(GemList.Prasiolite, 3);
                        put(GemList.Exquisite_Prasiolite, 1);
                        put(GemList.Flawless_Prasiolite, 1);
                        put(GemList.Flawed_Prasiolite, 1);
                        put(GemList.Chipped_Prasiolite, 1);
                        put(DustList.Iron_Dust, 1);
                    }
                }));

        // "BArTiMaEuSNeK Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.BArTiMaEuSNeK_Ore },
                RawOreList.Raw_BArTiMaEuSNeK_Ore,
                CrushedOreList.Crushed_BArTiMaEuSNeK_Ore,
                new HashMap<>() {
                    {
                        put(DustList.BArTiMaEuSNeK_Dust, 6);
                        put(GemList.BArTiMaEuSNeK, 3);
                        put(GemList.Exquisite_BArTiMaEuSNeK, 1);
                        put(GemList.Flawless_BArTiMaEuSNeK, 1);
                        put(GemList.Flawed_BArTiMaEuSNeK, 1);
                        put(GemList.Chipped_BArTiMaEuSNeK, 1);
                        put(DustList.Boron_Dust, 3);
                        put(DustList.Europium_Dust, 1);
                        put(DustList.Titanium_Dust, 3);
                    }
                }));

        // "Platinum Metallic Powder Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Platinum_Metallic_Powder_Ore },
                RawOreList.Raw_Platinum_Metallic_Powder_Ore,
                CrushedOreList.Crushed_Platinum_Metallic_Powder_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Platinum_Metallic_Powder_Dust, 15);
                    }
                }));

        // "Palladium Metallic Powder Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Palladium_Metallic_Powder_Ore },
                RawOreList.Raw_Palladium_Metallic_Powder_Ore,
                CrushedOreList.Crushed_Palladium_Metallic_Powder_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Palladium_Metallic_Powder_Dust, 14);
                    }
                }));

        // "Leach Residue Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Leach_Residue_Ore },
                RawOreList.Raw_Leach_Residue_Ore,
                CrushedOreList.Crushed_Leach_Residue_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Leach_Residue_Dust, 14);
                    }
                }));

        // "Rarest Metal Residue Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Rarest_Metal_Residue_Ore },
                RawOreList.Raw_Rarest_Metal_Residue_Ore,
                CrushedOreList.Crushed_Rarest_Metal_Residue_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Rarest_Metal_Residue_Dust, 14);
                    }
                }));

        // "Iridium Metal Residue Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Iridium_Metal_Residue_Ore },
                RawOreList.Raw_Iridium_Metal_Residue_Ore,
                CrushedOreList.Crushed_Iridium_Metal_Residue_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Iridium_Metal_Residue_Dust, 14);
                    }
                }));

        // "Crude Rhodium Metal Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Crude_Rhodium_Metal_Ore },
                RawOreList.Raw_Crude_Rhodium_Metal_Ore,
                CrushedOreList.Crushed_Crude_Rhodium_Metal_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Crude_Rhodium_Metal_Dust, 14);
                    }
                }));

        // "Tiberium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Tiberium_Ore },
                RawOreList.Raw_Tiberium_Ore,
                CrushedOreList.Crushed_Tiberium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Tiberium_Dust, 13);
                        put(GemList.Tiberium, 3);
                        put(GemList.Exquisite_Tiberium, 1);
                        put(GemList.Flawless_Tiberium, 1);
                        put(GemList.Flawed_Tiberium, 1);
                        put(GemList.Chipped_Tiberium, 1);
                    }
                }));

        // "Fluorspar Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Fluorspar_Ore },
                RawOreList.Raw_Fluorspar_Ore,
                CrushedOreList.Crushed_Fluorspar_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Fluorspar_Dust, 13);
                        put(GemList.Fluorspar, 3);
                        put(GemList.Exquisite_Fluorspar, 1);
                        put(GemList.Flawless_Fluorspar, 1);
                        put(GemList.Flawed_Fluorspar, 1);
                        put(GemList.Chipped_Fluorspar, 1);
                    }
                }));

        // "Atheneite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Atheneite_Ore },
                RawOreList.Raw_Atheneite_Ore,
                CrushedOreList.Crushed_Atheneite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Atheneite_Dust, 14);
                    }
                }));

        // "Temagamite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Temagamite_Ore },
                RawOreList.Raw_Temagamite_Ore,
                CrushedOreList.Crushed_Temagamite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Temagamite_Dust, 14);
                    }
                }));

        // "Terlinguaite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Terlinguaite_Ore },
                RawOreList.Raw_Terlinguaite_Ore,
                CrushedOreList.Crushed_Terlinguaite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Terlinguaite_Dust, 14);
                    }
                }));

        // "Orundum Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Orundum_Ore },
                RawOreList.Raw_Orundum_Ore,
                CrushedOreList.Crushed_Orundum_Ore,
                new HashMap<>() {

                    {
                        put(DustList.Orundum_Dust, 13);
                        put(GemList.Orundum, 3);
                        put(GemList.Exquisite_Orundum, 1);
                        put(GemList.Flawless_Orundum, 1);
                        put(GemList.Flawed_Orundum, 1);
                        put(GemList.Chipped_Orundum, 1);
                    }
                }));

        // "Naquadah Oxide Mixture Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Naquadah_Oxide_Mixture_Ore },
                RawOreList.Raw_Naquadah_Oxide_Mixture_Ore,
                CrushedOreList.Crushed_Naquadah_Oxide_Mixture_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Naquadah_Oxide_Mixture_Dust, 14);
                    }
                }));

        // "Enriched-Naquadah Oxide Mixture Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Enriched_Naquadah_Oxide_Mixture_Ore },
                RawOreList.Raw_Enriched_Naquadah_Oxide_Mixture_Ore,
                CrushedOreList.Crushed_Enriched_Naquadah_Oxide_Mixture,
                new HashMap<>() {
                    {
                        put(DustList.Enriched_Naquadah_Oxide_Mixture_Dust, 14);
                    }
                }));

        // "Naquadria Oxide Mixture Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Naquadria_Oxide_Mixture_Ore },
                RawOreList.Raw_Naquadria_Oxide_Mixture_Ore,
                CrushedOreList.Crushed_Naquadria_Oxide_Mixture_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Naquadria_Oxide_Mixture_Dust, 14);
                    }
                }));

        // "Lithium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Lithium_Ore_Stone,
                    OreList.Lithium_Ore_Netherrack,
                    OreList.Lithium_Ore_EndStone
                },
                RawOreList.Raw_Lithium_Ore,
                CrushedOreList.Crushed_Lithium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Lithium_Dust, 14);
                    }
                }));

        // "Beryllium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Beryllium_Ore_Stone,
                    OreList.Beryllium_Ore_Netherrack,
                    OreList.Beryllium_Ore_EndStone },
                RawOreList.Raw_Beryllium_Ore,
                CrushedOreList.Crushed_Beryllium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Beryllium_Dust, 5);
                        put(DustList.Emerald_Dust, 7);
                        put(GemList.Emerald, 2);
                    }
                }));

        // "Magnesium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Magnesium_Ore_Stone,
                    OreList.Magnesium_Ore_Netherrack,
                    OreList.Magnesium_Ore_EndStone },
                RawOreList.Raw_Magnesium_Ore,
                CrushedOreList.Crushed_Magnesium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Magnesium_Dust, 5);
                        put(DustList.Olivine_Dust, 7);
                        put(GemList.Olivine, 2);
                    }
                }));

        // "Aluminium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Aluminium_Ore_Stone,
                    OreList.Aluminium_Ore_Netherrack,
                    OreList.Aluminium_Ore_EndStone },
                RawOreList.Raw_Aluminium_Ore,
                CrushedOreList.Crushed_Aluminium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Aluminium_Dust, 5);
                        put(DustList.Bauxite_Dust, 9);
                    }
                }));

        // "Raw Silicon Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Raw_Silicon_Ore_Stone,
                    OreList.Raw_Silicon_Ore_Netherrack,
                    OreList.Raw_Silicon_Ore_EndStone },
                RawOreList.Raw_Raw_Silicon_Ore,
                CrushedOreList.Crushed_Raw_Silicon_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Raw_Silicon_Dust, 14);
                    }
                }));

        // "Sulfur Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Sulfur_Ore_Stone,
                    OreList.Sulfur_Ore_Netherrack,
                    OreList.Sulfur_Ore_EndStone },
                RawOreList.Raw_Sulfur_Ore,
                CrushedOreList.Crushed_Sulfur_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Sulfur_Dust, 14);
                    }
                }));

        // "Scandium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Scandium_Ore_Stone,
                    OreList.Scandium_Ore_Netherrack,
                    OreList.Scandium_Ore_EndStone },
                RawOreList.Raw_Scandium_Ore,
                CrushedOreList.Crushed_Scandium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Scandium_Dust, 14);
                    }
                }));

        // "Titanium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Titanium_Ore_Stone,
                    OreList.Titanium_Ore_Netherrack,
                    OreList.Titanium_Ore_EndStone },
                RawOreList.Raw_Titanium_Ore,
                CrushedOreList.Crushed_Titanium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Titanium_Dust, 5);
                        put(DustList.Almandine_Dust, 9);
                    }
                }));

        // "Vanadium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Vanadium_Ore_Stone,
                    OreList.Vanadium_Ore_Netherrack,
                    OreList.Vanadium_Ore_EndStone },
                RawOreList.Raw_Vanadium_Ore,
                CrushedOreList.Crushed_Vanadium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Vanadium_Dust, 14);
                    }
                }));

        // "Chrome Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Chrome_Ore_Stone,
                    OreList.Chrome_Ore_Netherrack,
                    OreList.Chrome_Ore_EndStone },
                RawOreList.Raw_Chrome_Ore,
                CrushedOreList.Crushed_Chrome_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Chrome_Dust, 5);
                        put(DustList.Iron_Dust, 6);
                        put(DustList.Magnesium_Dust, 4);
                    }
                }));

        // "Manganese Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Manganese_Ore_Stone,
                    OreList.Manganese_Ore_Netherrack,
                    OreList.Manganese_Ore_EndStone },
                RawOreList.Raw_Manganese_Ore,
                CrushedOreList.Crushed_Manganese_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Manganese_Dust, 5);
                        put(DustList.Chrome_Dust, 5);
                        put(DustList.Iron_Dust, 5);
                    }
                }));

        // "Iron Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Iron_Ore_Stone,
                    OreList.Iron_Ore_Netherrack,
                    OreList.Iron_Ore_EndStone },
                RawOreList.Raw_Iron_Ore,
                CrushedOreList.Crushed_Iron_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Iron_Dust, 5);
                        put(DustList.Nickel_Dust, 7);
                        put(DustList.Tin_Dust, 4);
                    }
                }));

        // "Cobalt Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Cobalt_Ore_Stone,
                    OreList.Cobalt_Ore_Netherrack,
                    OreList.Cobalt_Ore_EndStone },
                RawOreList.Raw_Cobalt_Ore,
                CrushedOreList.Crushed_Cobalt_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Cobalt_Dust, 6);
                        put(DustList.Cobaltite_Dust, 9);
                    }
                }));

        // "Nickel Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Nickel_Ore_Stone,
                    OreList.Nickel_Ore_Netherrack,
                    OreList.Nickel_Ore_EndStone },
                RawOreList.Raw_Nickel_Ore,
                CrushedOreList.Crushed_Nickel_Ore,
                new HashMap<>() {

                    {
                        put(DustList.Nickel_Dust, 7);
                        put(DustList.Cobalt_Dust, 5);
                        put(DustList.Iron_Dust, 2);
                        put(DustList.Platinum_Metallic_Powder_Dust, 4);
                    }
                }));

        // "Copper Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Copper_Ore_Stone,
                    OreList.Copper_Ore_Netherrack,
                    OreList.Copper_Ore_EndStone },
                RawOreList.Raw_Copper_Ore,
                CrushedOreList.Crushed_Copper_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Copper_Dust, 6);
                        put(DustList.Nickel_Dust, 1);
                        put(DustList.Cobalt_Dust, 5);
                        put(DustList.Gold_Dust, 4);
                    }
                }));

        // "Zinc Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Zinc_Ore_Stone,
                    OreList.Zinc_Ore_Netherrack,
                    OreList.Zinc_Ore_EndStone },
                RawOreList.Raw_Zinc_Ore,
                CrushedOreList.Crushed_Zinc_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Zinc_Dust, 6);
                        put(DustList.Tin_Dust, 5);
                        put(DustList.Gallium_Dust, 4);
                    }
                }));

        // "Gallium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Gallium_Ore_Stone,
                    OreList.Gallium_Ore_Netherrack,
                    OreList.Gallium_Ore_EndStone },
                RawOreList.Raw_Gallium_Ore,
                CrushedOreList.Crushed_Gallium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Gallium_Dust, 14);
                    }
                }));

        // "Arsenic Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Arsenic_Ore_Stone,
                    OreList.Arsenic_Ore_Netherrack,
                    OreList.Arsenic_Ore_EndStone },
                RawOreList.Raw_Arsenic_Ore,
                CrushedOreList.Crushed_Arsenic_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Arsenic_Dust, 14);
                    }
                }));

        // "Rubidium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Rubidium_Ore_Stone,
                    OreList.Rubidium_Ore_Netherrack,
                    OreList.Rubidium_Ore_EndStone },
                RawOreList.Raw_Rubidium_Ore,
                CrushedOreList.Crushed_Rubidium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Rubidium_Dust, 14);
                    }
                }));

        // "Strontium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Strontium_Ore_Stone,
                    OreList.Strontium_Ore_Netherrack,
                    OreList.Strontium_Ore_EndStone },
                RawOreList.Raw_Strontium_Ore,
                CrushedOreList.Crushed_Strontium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Strontium_Dust, 14);
                    }
                }));

        // "Yttrium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Yttrium_Ore_Stone,
                    OreList.Yttrium_Ore_Netherrack,
                    OreList.Yttrium_Ore_EndStone },
                RawOreList.Raw_Yttrium_Ore,
                CrushedOreList.Crushed_Yttrium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Yttrium_Dust, 14);
                    }
                }));

        // "Niobium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Niobium_Ore_Stone,
                    OreList.Niobium_Ore_Netherrack,
                    OreList.Niobium_Ore_EndStone },
                RawOreList.Raw_Niobium_Ore,
                CrushedOreList.Crushed_Niobium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Niobium_Dust, 14);
                    }
                }));

        // "Molybdenum Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Molybdenum_Ore_Stone,
                    OreList.Molybdenum_Ore_Netherrack,
                    OreList.Molybdenum_Ore_EndStone },
                RawOreList.Raw_Molybdenum_Ore,
                CrushedOreList.Crushed_Molybdenum_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Molybdenum_Dust, 14);
                    }
                }));

        // "Palladium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Palladium_Ore_Stone,
                    OreList.Palladium_Ore_Netherrack,
                    OreList.Palladium_Ore_EndStone },
                RawOreList.Raw_Palladium_Ore,
                CrushedOreList.Crushed_Palladium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Palladium_Metallic_Powder_Dust, 20);
                    }
                }));

        // "Silver Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Silver_Ore_Stone,
                    OreList.Silver_Ore_Netherrack,
                    OreList.Silver_Ore_EndStone },
                RawOreList.Raw_Silver_Ore,
                CrushedOreList.Crushed_Silver_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Silver_Dust, 6);
                        put(DustList.Sulfur_Dust, 4);
                        put(DustList.Lead_Dust, 5);
                    }
                }));

        // "Cadmium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Cadmium_Ore_Stone,
                    OreList.Cadmium_Ore_Netherrack,
                    OreList.Cadmium_Ore_EndStone },
                RawOreList.Raw_Cadmium_Ore,
                CrushedOreList.Crushed_Cadmium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Cadmium_Dust, 14);
                    }
                }));

        // "Indium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Indium_Ore_Stone,
                    OreList.Indium_Ore_Netherrack,
                    OreList.Indium_Ore_EndStone },
                RawOreList.Raw_Indium_Ore,
                CrushedOreList.Crushed_Indium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Indium_Dust, 14);
                    }
                }));

        // "Tin Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Tin_Ore_Stone,
                    OreList.Tin_Ore_Netherrack,
                    OreList.Tin_Ore_EndStone },
                RawOreList.Raw_Tin_Ore,
                CrushedOreList.Crushed_Tin_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Tin_Dust, 7);
                        put(DustList.Iron_Dust, 6);
                        put(DustList.Zinc_Dust, 6);
                        put(DustList.Zirconium_Dust, 4);
                    }
                }));

        // "Antimony Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Antimony_Ore_Stone,
                    OreList.Antimony_Ore_Netherrack,
                    OreList.Antimony_Ore_EndStone },
                RawOreList.Raw_Antimony_Ore,
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5058),
                new HashMap<>() {
                    {
                        put(DustList.Antimony_Dust, 6);
                        put(DustList.Iron_Dust, 5);
                        put(DustList.Zinc_Dust, 6);
                    }
                }));

        // "Tellurium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Tellurium_Ore_Stone,
                    OreList.Tellurium_Ore_Netherrack,
                    OreList.Tellurium_Ore_EndStone },
                RawOreList.Raw_Tellurium_Ore,
                CrushedOreList.Crushed_Tellurium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Tellurium_Dust, 14);
                    }
                }));

        // "Caesium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Caesium_Ore_Stone,
                    OreList.Caesium_Ore_Netherrack,
                    OreList.Caesium_Ore_EndStone },
                RawOreList.Raw_Caesium_Ore,
                CrushedOreList.Crushed_Caesium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Caesium_Dust, 14);
                    }
                }));

        // "Barium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Barium_Ore_Stone,
                    OreList.Barium_Ore_Netherrack,
                    OreList.Barium_Ore_EndStone },
                RawOreList.Raw_Barium_Ore,
                CrushedOreList.Crushed_Barium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Barium_Dust, 14);
                    }
                }));

        // "Lanthanum Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Lanthanum_Ore_Stone,
                    OreList.Lanthanum_Ore_Netherrack,
                    OreList.Lanthanum_Ore_EndStone },
                RawOreList.Raw_Lanthanum_Ore,
                CrushedOreList.Crushed_Lanthanum_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Lanthanum_Dust, 14);
                    }
                }));

        // "Cerium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Cerium_Ore_Stone,
                    OreList.Cerium_Ore_Netherrack,
                    OreList.Cerium_Ore_EndStone },
                RawOreList.Raw_Cerium_Ore,
                CrushedOreList.Crushed_Cerium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Cerium_Rich_Mixture_Dust, 32);
                    }
                }));

        // "Praseodymium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Praseodymium_Ore_Stone,
                    OreList.Praseodymium_Ore_Netherrack,
                    OreList.Praseodymium_Ore_EndStone },
                RawOreList.Raw_Praseodymium_Ore,
                CrushedOreList.Crushed_Praseodymium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Praseodymium_Dust, 14);
                    }
                }));

        // "Neodymium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Neodymium_Ore_Stone,
                    OreList.Neodymium_Ore_Netherrack,
                    OreList.Neodymium_Ore_EndStone },
                RawOreList.Raw_Neodymium_Ore,
                CrushedOreList.Crushed_Neodymium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Neodymium_Dust, 5);
                        put(DustList.Monazite_Dust, 3);
                        put(DustList.Rare_Earth, 4);
                        put(GemList.Monazite, 2);
                    }
                }));

        // "Promethium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Promethium_Ore_Stone,
                    OreList.Promethium_Ore_Netherrack,
                    OreList.Promethium_Ore_EndStone },
                RawOreList.Raw_Promethium_Ore,
                CrushedOreList.Crushed_Promethium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Promethium_Dust, 14);
                    }
                }));

        // "Samarium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Samarium_Ore_Stone,
                    OreList.Samarium_Ore_Netherrack,
                    OreList.Samarium_Ore_EndStone },
                RawOreList.Raw_Samarium_Ore,
                CrushedOreList.Crushed_Samarium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Samarium_Ore_Concentrate_Dust, 32);
                    }
                }));

        // "Europium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Europium_Ore_Stone,
                    OreList.Europium_Ore_Netherrack,
                    OreList.Europium_Ore_EndStone },
                RawOreList.Raw_Europium_Ore,
                CrushedOreList.Crushed_Europium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Europium_Dust, 14);
                    }
                }));

        // "Gadolinium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Gadolinium_Ore_Stone,
                    OreList.Gadolinium_Ore_Netherrack,
                    OreList.Gadolinium_Ore_EndStone },
                RawOreList.Raw_Gadolinium_Ore,
                CrushedOreList.Crushed_Gadolinium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Gadolinium_Dust, 14);
                    }
                }));

        // "Terbium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Terbium_Ore_Stone,
                    OreList.Terbium_Ore_Netherrack,
                    OreList.Terbium_Ore_EndStone },
                RawOreList.Raw_Terbium_Ore,
                CrushedOreList.Crushed_Terbium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Terbium_Dust, 14);
                    }
                }));

        // "Dysprosium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Dysprosium_Ore_Stone,
                    OreList.Dysprosium_Ore_Netherrack,
                    OreList.Dysprosium_Ore_EndStone },
                RawOreList.Raw_Dysprosium_Ore,
                CrushedOreList.Crushed_Dysprosium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Dysprosium_Dust, 14);
                    }
                }));

        // "Holmium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Holmium_Ore_Stone,
                    OreList.Holmium_Ore_Netherrack,
                    OreList.Holmium_Ore_EndStone },
                RawOreList.Raw_Holmium_Ore,
                CrushedOreList.Crushed_Holmium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Holmium_Dust, 14);
                    }
                }));

        // "Erbium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Erbium_Ore_Stone,
                    OreList.Erbium_Ore_Netherrack,
                    OreList.Erbium_Ore_EndStone },
                RawOreList.Raw_Erbium_Ore,
                CrushedOreList.Crushed_Erbium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Erbium_Dust, 14);
                    }
                }));

        // "Thulium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Thulium_Ore_Stone,
                    OreList.Thulium_Ore_Netherrack,
                    OreList.Thulium_Ore_EndStone },
                RawOreList.Raw_Thulium_Ore,
                CrushedOreList.Crushed_Thulium_Ore,
                new HashMap<>() {

                    {
                        put(DustList.Thulium_Dust, 14);
                    }
                }));

        // "Ytterbium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Ytterbium_Ore_Stone,
                    OreList.Ytterbium_Ore_Netherrack,
                    OreList.Ytterbium_Ore_EndStone },
                RawOreList.Raw_Ytterbium_Ore,
                CrushedOreList.Crushed_Ytterbium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Ytterbium_Dust, 14);
                    }
                }));

        // "Lutetium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Lutetium_Ore_Stone,
                    OreList.Lutetium_Ore_Netherrack,
                    OreList.Lutetium_Ore_EndStone },
                RawOreList.Raw_Lutetium_Ore,
                CrushedOreList.Crushed_Lutetium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Lutetium_Dust, 14);
                    }
                }));

        // "Tantalum Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Tantalum_Ore_Stone,
                    OreList.Tantalum_Ore_Netherrack,
                    OreList.Tantalum_Ore_EndStone },
                RawOreList.Raw_Tantalum_Ore,
                CrushedOreList.Crushed_Tantalum_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Tantalum_Dust, 14);
                    }
                }));

        // "Tungsten Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Tungsten_Ore_Stone,
                    OreList.Tungsten_Ore_Netherrack,
                    OreList.Tungsten_Ore_EndStone },
                RawOreList.Raw_Tungsten_Ore,
                CrushedOreList.Crushed_Tungsten_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Tungsten_Dust, 5);
                        put(DustList.Manganese_Dust, 5);
                        put(DustList.Molybdenum_Dust, 4);
                    }
                }));

        // "Osmium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Osmium_Ore_Stone,
                    OreList.Osmium_Ore_Netherrack,
                    OreList.Osmium_Ore_EndStone },
                RawOreList.Raw_Osmium_Ore,
                CrushedOreList.Crushed_Osmium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Iridium_Metal_Residue_Dust, 12);
                        put(DustList.Rarest_Metal_Residue_Dust, 8);
                    }
                }));

        // "Iridium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Iridium_Ore_Stone,
                    OreList.Iridium_Ore_Netherrack,
                    OreList.Iridium_Ore_EndStone },
                RawOreList.Raw_Iridium_Ore,
                CrushedOreList.Crushed_Iridium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Iridium_Metal_Residue_Dust, 13);
                        put(DustList.Platinum_Metallic_Powder_Dust, 10);
                        put(DustList.Rarest_Metal_Residue_Dust, 6);
                    }
                }));

        // "Platinum Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Platinum_Ore_Stone,
                    OreList.Platinum_Ore_Netherrack,
                    OreList.Platinum_Ore_EndStone },
                RawOreList.Raw_Platinum_Ore,
                CrushedOreList.Crushed_Platinum_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Iridium_Metal_Residue_Dust, 6);
                        put(DustList.Platinum_Metallic_Powder_Dust, 8);
                        put(DustList.Nickel_Dust, 5);
                    }
                }));

        // "Gold Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Gold_Ore_Stone,
                    OreList.Gold_Ore_Netherrack,
                    OreList.Gold_Ore_EndStone },
                RawOreList.Raw_Gold_Ore,
                CrushedOreList.Crushed_Gold_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Copper_Dust, 6);
                        put(DustList.Gold_Dust, 6);
                        put(DustList.Nickel_Dust, 4);
                    }
                }));

        // "Lead Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Lead_Ore_Stone,
                    OreList.Lead_Ore_Netherrack,
                    OreList.Lead_Ore_EndStone },
                RawOreList.Raw_Lead_Ore,
                CrushedOreList.Crushed_Lead_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Lead_Dust, 5);
                        put(DustList.Silver_Dust, 6);
                        put(DustList.Sulfur_Dust, 4);
                    }
                }));

        // "Bismuth Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Bismuth_Ore_Stone,
                    OreList.Bismuth_Ore_Netherrack,
                    OreList.Bismuth_Ore_EndStone },
                RawOreList.Raw_Bismuth_Ore,
                CrushedOreList.Crushed_Bismuth_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Bismuth_Dust, 14);
                    }
                }));

        // "Thorium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Thorium_Ore_Stone,
                    OreList.Thorium_Ore_Netherrack,
                    OreList.Thorium_Ore_EndStone },
                RawOreList.Raw_Thorium_Ore,
                CrushedOreList.Crushed_Thorium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Lead_Dust, 5);
                        put(DustList.Thorium_Dust, 6);
                        put(DustList.Uranium_238_Dust, 6);
                        put(DustList.Radium_226_Dust, 4);
                    }
                }));

        // "Uranium 235 Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Uranium_235_Ore_Stone,
                    OreList.Uranium_235_Ore_Netherrack,
                    OreList.Uranium_235_Ore_EndStone },
                RawOreList.Raw_Uranium_235_Ore,
                CrushedOreList.Crushed_Uranium_235_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Uranium_235_Dust, 14);
                    }
                }));

        // "Uranium 238 Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Uranium_238_Ore_Stone,
                    OreList.Uranium_238_Ore_Netherrack,
                    OreList.Uranium_238_Ore_EndStone },
                RawOreList.Raw_Uranium_238_Ore,
                CrushedOreList.Crushed_Uranium_238_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Lead_Dust, 6);
                        put(DustList.Thorium_Dust, 1);
                        put(DustList.Uranium_235_Dust, 3);
                        put(DustList.Uranium_238_Dust, 5);
                        put(DustList.Radium_226_Dust, 4);
                    }
                }));

        // "Plutonium 239 Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Plutonium_239_Ore_Stone,
                    OreList.Plutonium_239_Ore_Netherrack,
                    OreList.Plutonium_239_Ore_EndStone },
                RawOreList.Raw_Plutonium_239_Ore,
                CrushedOreList.Crushed_Plutonium_239_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Lead_Dust, 4);
                        put(DustList.Plutonium_239_Dust, 5);
                        put(DustList.Uranium_238_Dust, 5);
                    }
                }));

        // "Plutonium 241 Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Plutonium_241_Ore_Stone,
                    OreList.Plutonium_241_Ore_Netherrack,
                    OreList.Plutonium_241_Ore_EndStone },
                RawOreList.Raw_Plutonium_241_Ore,
                CrushedOreList.Crushed_Plutonium_241_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Plutonium_241_Dust, 14);
                    }
                }));

        // "Americium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Americium_Ore_Stone,
                    OreList.Americium_Ore_Netherrack,
                    OreList.Americium_Ore_EndStone },
                RawOreList.Raw_Americium_Ore,
                CrushedOreList.Crushed_Americium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Americium_Dust, 14);
                    }
                }));

        // "Raw Tengam Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Raw_Tengam_Ore_Stone,
                    OreList.Raw_Tengam_Ore_Netherrack,
                    OreList.Raw_Tengam_Ore_EndStone },
                RawOreList.Raw_Raw_Tengam_Ore,
                CrushedOreList.Crushed_Raw_Tengam_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Raw_Tengam_Dust, 5);
                        put(DustList.Magnetic_Neodymium_Dust, 5);
                        put(DustList.Magnetic_Samarium_Dust, 4);
                    }
                }));

        // "Neutronium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Neutronium_Ore_Stone,
                    OreList.Neutronium_Ore_Netherrack,
                    OreList.Neutronium_Ore_EndStone },
                RawOreList.Raw_Neutronium_Ore,
                CrushedOreList.Crushed_Neutronium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Neutronium_Dust, 14);
                    }
                }));

        // "Electrum Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Electrum_Ore_Stone,
                    OreList.Electrum_Ore_Netherrack,
                    OreList.Electrum_Ore_EndStone },
                RawOreList.Raw_Electrum_Ore,
                CrushedOreList.Crushed_Electrum_Ore,
                new HashMap<>() {

                    {
                        put(DustList.Electrum_Dust, 5);
                        put(DustList.Gold_Dust, 6);
                        put(DustList.Silver_Dust, 4);
                    }
                }));

        // "Pig Iron Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Pig_Iron_Ore_Stone,
                    OreList.Pig_Iron_Ore_Netherrack,
                    OreList.Pig_Iron_Ore_EndStone },
                RawOreList.Raw_Pig_Iron_Ore,
                CrushedOreList.Crushed_Pig_Iron_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Iron_Dust, 11);
                        put(DustList.Nickel_Dust, 1);
                        put(DustList.Tin_Dust, 1);
                    }
                }));

        // "Adamantium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Adamantium_Ore_Stone,
                    OreList.Adamantium_Ore_Netherrack,
                    OreList.Adamantium_Ore_EndStone },
                RawOreList.Raw_Adamantium_Ore,
                CrushedOreList.Crushed_Adamantium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Adamantium_Dust, 14);
                    }
                }));

        // "Fluxed Electrum Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Fluxed_Electrum_Ore_Stone,
                    OreList.Fluxed_Electrum_Ore_Netherrack,
                    OreList.Fluxed_Electrum_Ore_EndStone },
                RawOreList.Raw_Fluxed_Electrum_Ore,
                CrushedOreList.Crushed_Fluxed_Electrum_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Fluxed_Electrum_Dust, 14);
                    }
                }));

        // "Infused Gold Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Infused_Gold_Ore_Stone,
                    OreList.Infused_Gold_Ore_Netherrack,
                    OreList.Infused_Gold_Ore_EndStone },
                RawOreList.Raw_Infused_Gold_Ore,
                CrushedOreList.Crushed_Infused_Gold_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Gold_Dust, 10);
                        put(DustList.Infused_Gold_Dust, 5);
                    }
                }));

        // "Naquadah Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Naquadah_Ore_Stone,
                    OreList.Naquadah_Ore_Netherrack,
                    OreList.Naquadah_Ore_EndStone },
                RawOreList.Raw_Naquadah_Ore,
                CrushedOreList.Crushed_Naquadah_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Enriched_Naquadah_Oxide_Mixture_Dust, 22);
                        put(DustList.Naquadah_Oxide_Mixture_Dust, 10);
                    }
                }));

        // "Enriched Naquadah Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Enriched_Naquadah_Ore_Stone,
                    OreList.Enriched_Naquadah_Ore_Netherrack,
                    OreList.Enriched_Naquadah_Ore_EndStone },
                RawOreList.Raw_Enriched_Naquadah_Ore,
                CrushedOreList.Crushed_Enriched_Naquadah_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Enriched_Naquadah_Oxide_Mixture_Dust, 8);
                        put(DustList.Naquadah_Oxide_Mixture_Dust, 12);
                        put(DustList.Naquadria_Oxide_Mixture_Dust, 10);
                    }
                }));

        // "Naquadria Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Naquadria_Ore_Stone,
                    OreList.Naquadria_Ore_Netherrack,
                    OreList.Naquadria_Ore_EndStone },
                RawOreList.Raw_Naquadria_Ore,
                CrushedOreList.Crushed_Naquadria_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Naquadria_Oxide_Mixture_Dust, 32);
                    }
                }));

        // "Tritanium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Tritanium_Ore_Stone,
                    OreList.Tritanium_Ore_Netherrack,
                    OreList.Tritanium_Ore_EndStone },
                RawOreList.Raw_Tritanium_Ore,
                CrushedOreList.Crushed_Tritanium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Tritanium_Dust, 14);
                    }
                }));

        // "Mithril Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Mithril_Ore_Stone,
                    OreList.Mithril_Ore_Netherrack,
                    OreList.Mithril_Ore_EndStone },
                RawOreList.Raw_Mithril_Ore,
                CrushedOreList.Crushed_Mithril_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Platinum_Metallic_Powder_Dust, 18);
                        put(DustList.Mithril_Dust, 6);
                    }
                }));

        // "Shadow Iron Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Shadow_Iron_Ore_Stone,
                    OreList.Shadow_Iron_Ore_Netherrack,
                    OreList.Shadow_Iron_Ore_EndStone },
                RawOreList.Raw_Shadow_Iron_Ore,
                CrushedOreList.Crushed_Shadow_Iron_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Iron_Dust, 9);
                        put(DustList.Shadow_Iron_Dust, 5);
                    }
                }));

        // "Meteoric Iron Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Meteoric_Iron_Ore_Stone,
                    OreList.Meteoric_Iron_Ore_Netherrack,
                    OreList.Meteoric_Iron_Ore_EndStone },
                RawOreList.Raw_Meteoric_Iron_Ore,
                CrushedOreList.Crushed_Meteoric_Iron_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Iridium_Metal_Residue_Dust, 1);
                        put(DustList.Platinum_Metallic_Powder_Dust, 2);
                        put(DustList.Iron_Dust, 5);
                        put(DustList.Meteoric_Iron_Dust, 5);
                        put(DustList.Nickel_Dust, 4);
                    }
                }));

        // "Deep Dark Iron Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Deep_Dark_Iron_Ore_Stone,
                    OreList.Deep_Dark_Iron_Ore_Netherrack,
                    OreList.Deep_Dark_Iron_Ore_EndStone },
                RawOreList.Raw_Deep_Dark_Iron_Ore,
                CrushedOreList.Crushed_Deep_Dark_Iron_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Deep_Dark_Iron_Dust, 5);
                        put(DustList.Iron_Dust, 9);
                    }
                }));

        // "Firestone Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Firestone_Ore_Stone,
                    OreList.Firestone_Ore_Netherrack,
                    OreList.Firestone_Ore_EndStone },
                RawOreList.Raw_Firestone_Ore,
                CrushedOreList.Crushed_Firestone_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Firestone_Dust, 12);
                        put(GemList.Raw_Firestone, 7);
                    }
                }));

        // "Shadow Metal Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Shadow_Metal_Ore_Stone,
                    OreList.Shadow_Metal_Ore_Netherrack,
                    OreList.Shadow_Metal_Ore_EndStone },
                RawOreList.Raw_Shadow_Metal_Ore,
                CrushedOreList.Crushed_Shadow_Metal_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Shadow_Metal_Dust, 14);
                    }
                }));

        // "Rutile Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Rutile_Ore_Stone,
                    OreList.Rutile_Ore_Netherrack,
                    OreList.Rutile_Ore_EndStone },
                RawOreList.Raw_Rutile_Ore,
                CrushedOreList.Crushed_Rutile_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Rutile_Dust, 14);
                    }
                }));

        // "Ardite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Ardite_Ore_Stone,
                    OreList.Ardite_Ore_Netherrack,
                    OreList.Ardite_Ore_EndStone },
                RawOreList.Raw_Ardite_Ore,
                CrushedOreList.Crushed_Ardite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Ardite_Dust, 14);
                    }
                }));

        // "Manyullyn Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Manyullyn_Ore_Stone,
                    OreList.Manyullyn_Ore_Netherrack,
                    OreList.Manyullyn_Ore_EndStone },
                RawOreList.Raw_Manyullyn_Ore,
                CrushedOreList.Crushed_Manyullyn_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Manyullyn_Dust, 14);
                    }
                }));

        // "Mytryl Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Mytryl_Ore_Stone,
                    OreList.Mytryl_Ore_Netherrack,
                    OreList.Mytryl_Ore_EndStone },
                RawOreList.Raw_Mytryl_Ore,
                CrushedOreList.Crushed_Mytryl_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Samarium_Ore_Concentrate_Dust, 10);
                        put(DustList.Mytryl_Dust, 5);
                        put(DustList.Zinc_Dust, 5);
                    }
                }));

        // "Black Plutonium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Black_Plutonium_Ore_Stone,
                    OreList.Black_Plutonium_Ore_Netherrack,
                    OreList.Black_Plutonium_Ore_EndStone },
                RawOreList.Raw_Black_Plutonium_Ore,
                CrushedOreList.Crushed_Black_Plutonium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Black_Plutonium_Dust, 14);
                    }
                }));

        // "Callisto Ice Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Callisto_Ice_Ore_Stone,
                    OreList.Callisto_Ice_Ore_Netherrack,
                    OreList.Callisto_Ice_Ore_EndStone },
                RawOreList.Raw_Callisto_Ice_Ore,
                CrushedOreList.Crushed_Callisto_Ice_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Callisto_Ice_Dust, 14);
                    }
                }));

        // "Ledox Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Ledox_Ore_Stone,
                    OreList.Ledox_Ore_Netherrack,
                    OreList.Ledox_Ore_EndStone },
                RawOreList.Raw_Ledox_Ore,
                CrushedOreList.Crushed_Ledox_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Ledox_Dust, 14);
                    }
                }));

        // "Quantium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Quantium_Ore_Stone,
                    OreList.Quantium_Ore_Netherrack,
                    OreList.Quantium_Ore_EndStone },
                RawOreList.Raw_Quantium_Ore,
                CrushedOreList.Crushed_Quantium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Quantium_Dust, 14);
                    }
                }));

        // "Duralumin Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Duralumin_Ore_Stone,
                    OreList.Duralumin_Ore_Netherrack,
                    OreList.Duralumin_Ore_EndStone },
                RawOreList.Raw_Duralumin_Ore,
                CrushedOreList.Crushed_Duralumin_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Duralumin_Dust, 14);
                    }
                }));

        // "Oriharukon Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Oriharukon_Ore_Stone,
                    OreList.Oriharukon_Ore_Netherrack,
                    OreList.Oriharukon_Ore_EndStone },
                RawOreList.Raw_Oriharukon_Ore,
                CrushedOreList.Crushed_Oriharukon_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Oriharukon_Dust, 14);
                    }
                }));

        // "Infinity Catalyst Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Infinity_Catalyst_Ore_Stone,
                    OreList.Infinity_Catalyst_Ore_Netherrack,
                    OreList.Infinity_Catalyst_Ore_EndStone },
                RawOreList.Raw_Infinity_Catalyst_Ore,
                CrushedOreList.Crushed_Infinity_Catalyst_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Infinity_Catalyst_Dust, 14);
                    }
                }));

        // "Bedrockium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Bedrockium_Ore_Stone,
                    OreList.Bedrockium_Ore_Netherrack,
                    OreList.Bedrockium_Ore_EndStone },
                RawOreList.Raw_Bedrockium_Ore,
                CrushedOreList.Crushed_Bedrockium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Bedrockium_Dust, 14);
                    }
                }));

        // "Mysterious Crystal Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Mysterious_Crystal_Ore_Stone,
                    OreList.Mysterious_Crystal_Ore_Netherrack,
                    OreList.Mysterious_Crystal_Ore_EndStone },
                RawOreList.Raw_Mysterious_Crystal_Ore,
                CrushedOreList.Crushed_Mysterious_Crystal_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Mysterious_Crystal_Dust, 14);
                    }
                }));

        // "Alduorite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Alduorite_Ore_Stone,
                    OreList.Alduorite_Ore_Netherrack,
                    OreList.Alduorite_Ore_EndStone },
                RawOreList.Raw_Alduorite_Ore,
                CrushedOreList.Crushed_Alduorite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Alduorite_Dust, 14);
                    }
                }));

        // "Rubracium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Rubracium_Ore_Stone,
                    OreList.Rubracium_Ore_Netherrack,
                    OreList.Rubracium_Ore_EndStone },
                RawOreList.Raw_Rubracium_Ore,
                CrushedOreList.Crushed_Rubracium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Samarium_Ore_Concentrate_Dust, 18);
                        put(DustList.Rubracium_Dust, 5);
                    }
                }));

        // "Vulcanite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Vulcanite_Ore_Stone,
                    OreList.Vulcanite_Ore_Netherrack,
                    OreList.Vulcanite_Ore_EndStone },
                RawOreList.Raw_Vulcanite_Ore,
                CrushedOreList.Crushed_Vulcanite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Vulcanite_Dust, 14);
                    }
                }));

        // "Diamond Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Diamond_Ore_Stone,
                    OreList.Diamond_Ore_Netherrack,
                    OreList.Diamond_Ore_EndStone },
                RawOreList.Raw_Diamond_Ore,
                CrushedOreList.Crushed_Diamond_Ore,
                new HashMap<>() {

                    {
                        // Diamond
                        put(GemList.Diamond, 1);
                        put(DustList.Diamond_Dust, 6);
                        put(DustList.Graphite_Dust, 9);
                        put(GemList.Exquisite_Diamond, 1);
                        put(GemList.Flawless_Diamond, 1);
                        put(GemList.Flawed_Diamond, 1);
                        put(GemList.Chipped_Diamond, 1);
                    }
                }));

        // "Emerald Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Emerald_Ore_Stone,
                    OreList.Emerald_Ore_Netherrack,
                    OreList.Emerald_Ore_EndStone },
                RawOreList.Raw_Emerald_Ore,
                CrushedOreList.Crushed_Emerald_Ore,
                new HashMap<>() {

                    {
                        // Emerald
                        put(GemList.Emerald, 1);
                        put(DustList.Alumina_Dust, 3);
                        put(DustList.Beryllium_Dust, 5);
                        put(DustList.Emerald_Dust, 6);
                        put(GemList.Exquisite_Emerald, 1);
                        put(GemList.Flawless_Emerald, 1);
                        put(GemList.Flawed_Emerald, 1);
                        put(GemList.Chipped_Emerald, 1);
                    }
                }));

        // "Ruby Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Ruby_Ore_Stone,
                    OreList.Ruby_Ore_Netherrack,
                    OreList.Ruby_Ore_EndStone },
                RawOreList.Raw_Ruby_Ore,
                CrushedOreList.Crushed_Ruby_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Chrome_Dust, 5);
                        put(DustList.Red_Garnet_Dust, 4);
                        put(DustList.Ruby_Dust, 6);
                        put(GemList.Ruby, 1);
                        put(GemList.Exquisite_Ruby, 1);
                        put(GemList.Flawless_Ruby, 1);
                        put(GemList.Flawed_Ruby, 1);
                        put(GemList.Chipped_Ruby, 1);
                    }
                }));

        // "Sapphire Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Sapphire_Ore_Stone,
                    OreList.Sapphire_Ore_Netherrack,
                    OreList.Sapphire_Ore_EndStone },
                RawOreList.Raw_Sapphire_Ore,
                CrushedOreList.Crushed_Sapphire_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Alumina_Dust, 5);
                        put(DustList.Green_Sapphire_Dust, 4);
                        put(DustList.Sapphire_Dust, 6);
                        put(GemList.Sapphire, 1);
                        put(GemList.Exquisite_Sapphire, 1);
                        put(GemList.Flawless_Sapphire, 1);
                        put(GemList.Flawed_Sapphire, 1);
                        put(GemList.Chipped_Sapphire, 1);
                    }
                }));

        // "Green Sapphire Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Green_Sapphire_Ore_Stone,
                    OreList.Green_Sapphire_Ore_Netherrack,
                    OreList.Green_Sapphire_Ore_EndStone },
                RawOreList.Raw_Green_Sapphire_Ore,
                CrushedOreList.Crushed_Green_Sapphire_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Alumina_Dust, 5);
                        put(DustList.Green_Sapphire_Dust, 6);
                        put(DustList.Sapphire_Dust, 4);
                        put(GemList.Green_Sapphire, 1);
                        put(GemList.Exquisite_Green_Sapphire, 1);
                        put(GemList.Flawless_Green_Sapphire, 1);
                        put(GemList.Flawed_Green_Sapphire, 1);
                        put(GemList.Chipped_Green_Sapphire, 1);
                    }
                }));

        // "Olivine Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Olivine_Ore_Stone,
                    OreList.Olivine_Ore_Netherrack,
                    OreList.Olivine_Ore_EndStone },
                RawOreList.Raw_Olivine_Ore,
                CrushedOreList.Crushed_Olivine_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Magnesium_Dust, 4);
                        put(DustList.Olivine_Dust, 6);
                        put(DustList.Pyrope_Dust, 5);
                        put(GemList.Olivine, 1);
                        put(GemList.Exquisite_Olivine, 1);
                        put(GemList.Flawless_Olivine, 1);
                        put(GemList.Flawed_Olivine, 1);
                        put(GemList.Chipped_Olivine, 1);
                    }
                }));

        // "Nether Star Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Nether_Star_Ore_Stone,
                    OreList.Nether_Star_Ore_Netherrack,
                    OreList.Nether_Star_Ore_EndStone },
                RawOreList.Raw_Nether_Star_Ore,
                CrushedOreList.Crushed_Nether_Star_Ore,
                new HashMap<>() {
                    {
                        put(GemList.Nether_Star, 7);
                        put(DustList.Nether_Star_Dust, 13);
                    }
                }));

        // "Topaz Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Topaz_Ore_Stone,
                    OreList.Topaz_Ore_Netherrack,
                    OreList.Topaz_Ore_EndStone },
                RawOreList.Raw_Topaz_Ore,
                CrushedOreList.Crushed_Topaz_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Blue_Topaz_Dust, 7);
                        put(DustList.Topaz_Dust, 6);
                        put(GemList.Blue_Topaz, 2);
                        put(GemList.Topaz, 1);
                        put(GemList.Exquisite_Topaz, 1);
                        put(GemList.Flawless_Topaz, 1);
                        put(GemList.Flawed_Topaz, 1);
                        put(GemList.Chipped_Topaz, 1);
                    }
                }));

        // "Tanzanite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Tanzanite_Ore_Stone,
                    OreList.Tanzanite_Ore_Netherrack,
                    OreList.Tanzanite_Ore_EndStone },
                RawOreList.Raw_Tanzanite_Ore,
                CrushedOreList.Crushed_Tanzanite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Opal_Dust, 7);
                        put(DustList.Tanzanite_Dust, 6);
                        put(GemList.Opal, 2);
                        put(GemList.Tanzanite, 1);
                        put(GemList.Exquisite_Tanzanite, 1);
                        put(GemList.Flawless_Tanzanite, 1);
                        put(GemList.Flawed_Tanzanite, 1);
                        put(GemList.Chipped_Tanzanite, 1);
                    }
                }));

        // "Amethyst Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Amethyst_Ore_Stone,
                    OreList.Amethyst_Ore_Netherrack,
                    OreList.Amethyst_Ore_EndStone },
                RawOreList.Raw_Amethyst_Ore,
                CrushedOreList.Crushed_Amethyst_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Amethyst_Dust, 13);
                        put(GemList.Amethyst, 3);
                        put(GemList.Exquisite_Amethyst, 1);
                        put(GemList.Flawless_Amethyst, 1);
                        put(GemList.Flawed_Amethyst, 1);
                        put(GemList.Chipped_Amethyst, 1);
                    }
                }));

        // "Opal Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Opal_Ore_Stone,
                    OreList.Opal_Ore_Netherrack,
                    OreList.Opal_Ore_EndStone },
                RawOreList.Raw_Opal_Ore,
                CrushedOreList.Crushed_Opal_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Opal_Dust, 6);
                        put(DustList.Tanzanite_Dust, 7);
                        put(GemList.Opal, 1);
                        put(GemList.Tanzanite, 2);
                        put(GemList.Exquisite_Opal, 1);
                        put(GemList.Flawless_Opal, 1);
                        put(GemList.Flawed_Opal, 1);
                        put(GemList.Chipped_Opal, 1);
                    }
                }));

        // "Jasper Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Jasper_Ore_Stone,
                    OreList.Jasper_Ore_Netherrack,
                    OreList.Jasper_Ore_EndStone },
                RawOreList.Raw_Jasper_Ore,
                CrushedOreList.Crushed_Jasper_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Jasper_Dust, 13);
                        put(GemList.Jasper, 3);
                        put(GemList.Exquisite_Jasper, 1);
                        put(GemList.Flawless_Jasper, 1);
                        put(GemList.Flawed_Jasper, 1);
                        put(GemList.Chipped_Jasper, 1);
                    }
                }));

        // "Spinel Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Spinel_Ore_Stone,
                    OreList.Spinel_Ore_Netherrack,
                    OreList.Spinel_Ore_EndStone },
                RawOreList.Raw_Spinel_Ore,
                CrushedOreList.Crushed_Spinel_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Jasper_Dust, 7);
                        put(DustList.Spinel_Dust, 6);
                        put(GemList.Jasper, 2);
                        put(GemList.Spinel, 1);
                        put(GemList.Exquisite_Spinel, 1);
                        put(GemList.Flawless_Spinel, 1);
                        put(GemList.Flawed_Spinel, 1);
                        put(GemList.Chipped_Spinel, 1);
                    }
                }));

        // "Blue Topaz Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Blue_Topaz_Ore_Stone,
                    OreList.Blue_Topaz_Ore_Netherrack,
                    OreList.Blue_Topaz_Ore_EndStone },
                RawOreList.Raw_Blue_Topaz_Ore,
                CrushedOreList.Crushed_Blue_Topaz_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Blue_Topaz_Dust, 6);
                        put(DustList.Topaz_Dust, 7);
                        put(GemList.Blue_Topaz, 1);
                        put(GemList.Topaz, 2);
                        put(GemList.Exquisite_Blue_Topaz, 1);
                        put(GemList.Flawless_Blue_Topaz, 1);
                        put(GemList.Flawed_Blue_Topaz, 1);
                        put(GemList.Chipped_Blue_Topaz, 1);
                    }
                }));

        // "Amber Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Amber_Ore_Stone,
                    OreList.Amber_Ore_Netherrack,
                    OreList.Amber_Ore_EndStone },
                RawOreList.Raw_Amber_Ore,
                CrushedOreList.Crushed_Amber_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Amber_Dust, 26);
                        put(GemList.Amber, 6);
                        put(GemList.Exquisite_Amber, 2);
                        put(GemList.Flawless_Amber, 2);
                        put(GemList.Flawed_Amber, 2);
                        put(GemList.Chipped_Amber, 2);
                    }
                }));

        // "Dilithium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Dilithium_Ore_Stone,
                    OreList.Dilithium_Ore_Netherrack,
                    OreList.Dilithium_Ore_EndStone },
                RawOreList.Raw_Dilithium_Ore,
                CrushedOreList.Crushed_Dilithium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Dilithium_Dust, 13);
                        put(GemList.Dilithium, 7);
                    }
                }));

        // "Certus Quartz Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Certus_Quartz_Ore_Stone,
                    OreList.Certus_Quartz_Ore_Netherrack,
                    OreList.Certus_Quartz_Ore_EndStone },
                RawOreList.Raw_Certus_Quartz_Ore,
                CrushedOreList.Crushed_Certus_Quartz_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Barite_Dust, 8);
                        put(DustList.Barium_Dust, 2);
                        put(GemList.Certus_Quartz, 10);
                        put(DustList.Certus_Quartz_Dust, 12);
                        put(GemList.Quartzite, 4);
                        put(DustList.Quartzite_Dust, 6);
                    }
                }));

        // "Charged Certus Quartz Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Charged_Certus_Quartz_Ore_Stone,
                    OreList.Charged_Certus_Quartz_Ore_Netherrack,
                    OreList.Charged_Certus_Quartz_Ore_EndStone },
                RawOreList.Raw_Charged_Certus_Quartz_Ore,
                CrushedOreList.Crushed_Charged_Certus_Quartz_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Barite_Dust, 2);
                        put(DustList.Certus_Quartz_Dust, 6);
                        put(DustList.Charged_Certus_Quartz_Dust, 12);
                        put(DustList.Quartzite_Dust, 6);
                        put(GemList.Certus_Quartz, 4);
                        put(GemList.Charged_Certus_Quartz_Crystal, 10);
                    }
                }));

        // "Forcicium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Forcicium_Ore_Stone,
                    OreList.Forcicium_Ore_Netherrack,
                    OreList.Forcicium_Ore_EndStone },
                RawOreList.Raw_Forcicium_Ore,
                CrushedOreList.Crushed_Forcicium_Ore,
                new HashMap<>() {
                    {
                        put(GemList.Forcicium, 5);
                        put(DustList.Forcicium_Dust, 7);
                        put(DustList.Neodymium_Dust, 4);
                        put(DustList.Rare_Earth, 1);
                        put(DustList.Thorium_Dust, 5);
                    }
                }));

        // "Forcillium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Forcillium_Ore_Stone,
                    OreList.Forcillium_Ore_Netherrack,
                    OreList.Forcillium_Ore_EndStone },
                RawOreList.Raw_Forcillium_Ore,
                CrushedOreList.Crushed_Forcillium_Ore,
                new HashMap<>() {
                    {
                        put(GemList.Forcillium, 5);
                        put(DustList.Forcillium_Dust, 7);
                        put(DustList.Neodymium_Dust, 4);
                        put(DustList.Rare_Earth, 1);
                        put(DustList.Thorium_Dust, 5);
                    }
                }));

        // "Monazite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Monazite_Ore_Stone,
                    OreList.Monazite_Ore_Netherrack,
                    OreList.Monazite_Ore_EndStone },
                RawOreList.Raw_Monazite_Ore,
                CrushedOreList.Crushed_Monazite_Ore,
                new HashMap<>() {
                    {
                        put(GemList.Monazite, 40);
                        put(DustList.Monazite_Dust, 56);
                        put(DustList.Neodymium_Dust, 32);
                        put(DustList.Rare_Earth, 8);
                        put(DustList.Thorium_Dust, 40);
                    }
                }));

        // "Force Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Force_Ore_Stone,
                    OreList.Force_Ore_Netherrack,
                    OreList.Force_Ore_EndStone },
                RawOreList.Raw_Force_Ore,
                CrushedOreList.Crushed_Force_Ore,
                new HashMap<>() {
                    {
                        put(GemList.Force, 7);
                        put(DustList.Force_Dust, 13);
                    }
                }));

        // "Nether Quartz Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Nether_Quartz_Ore_Stone,
                    OreList.Nether_Quartz_Ore_Netherrack,
                    OreList.Nether_Quartz_Ore_EndStone },
                RawOreList.Raw_Nether_Quartz_Ore,
                CrushedOreList.Crushed_Nether_Quartz_Ore,
                new HashMap<>() {
                    {
                        put(GemList.Nether_Quartz, 10);
                        put(DustList.Nether_Quartz_Dust, 12);
                        put(DustList.Netherrack_Dust, 18);
                    }
                }));

        // "Quartzite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Quartzite_Ore_Stone,
                    OreList.Quartzite_Ore_Netherrack,
                    OreList.Quartzite_Ore_EndStone },
                RawOreList.Raw_Quartzite_Ore,
                CrushedOreList.Crushed_Quartzite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Barite_Dust, 4);
                        put(GemList.Certus_Quartz, 2);
                        put(DustList.Certus_Quartz_Dust, 4);
                        put(GemList.Quartzite, 5);
                        put(DustList.Quartzite_Dust, 6);
                    }
                }));

        // "Lazurite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Lazurite_Ore_Stone,
                    OreList.Lazurite_Ore_Netherrack,
                    OreList.Lazurite_Ore_EndStone },
                RawOreList.Raw_Lazurite_Ore,
                CrushedOreList.Crushed_Lazurite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Lapis_Dust, 24);
                        put(GemList.Lazurite, 30);
                        put(DustList.Lazurite_Dust, 36);
                        put(GemList.Sodalite, 12);
                        put(DustList.Sodalite_Dust, 18);
                    }
                }));

        // "Sodalite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Sodalite_Ore_Stone,
                    OreList.Sodalite_Ore_Netherrack,
                    OreList.Sodalite_Ore_EndStone },
                RawOreList.Raw_Sodalite_Ore,
                CrushedOreList.Crushed_Sodalite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Lapis_Dust, 24);
                        put(GemList.Lazurite, 12);
                        put(DustList.Lazurite_Dust, 18);
                        put(GemList.Sodalite, 30);
                        put(DustList.Sodalite_Dust, 36);
                    }
                }));

        // "Lapis Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Lapis_Ore_Stone,
                    OreList.Lapis_Ore_Netherrack,
                    OreList.Lapis_Ore_EndStone },
                RawOreList.Raw_Lapis_Ore,
                CrushedOreList.Crushed_Lapis_Ore,
                new HashMap<>() {
                    {
                        put(GemList.Lapis_Lazuli, 30);
                        put(DustList.Lapis_Dust, 36);
                        put(GemList.Lazurite, 12);
                        put(DustList.Lazurite_Dust, 18);
                        put(DustList.Pyrite_Dust, 6);
                        put(DustList.Sodalite_Dust, 18);
                    }
                }));

        // "Red Garnet Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Red_Garnet_Ore_Stone,
                    OreList.Red_Garnet_Ore_Netherrack,
                    OreList.Red_Garnet_Ore_EndStone },
                RawOreList.Raw_Red_Garnet_Ore,
                CrushedOreList.Crushed_Red_Garnet_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Almandine_Dust, 1);
                        put(DustList.Pyrope_Dust, 3);
                        put(DustList.Red_Garnet_Dust, 6);
                        put(DustList.Spessartine_Dust, 5);
                        put(GemList.Red_Garnet, 3);
                        put(GemList.Exquisite_Red_Garnet, 1);
                        put(GemList.Flawless_Red_Garnet, 1);
                        put(GemList.Flawed_Red_Garnet, 1);
                        put(GemList.Chipped_Red_Garnet, 1);
                    }
                }));

        // "Yellow Garnet Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Yellow_Garnet_Ore_Stone,
                    OreList.Yellow_Garnet_Ore_Netherrack,
                    OreList.Yellow_Garnet_Ore_EndStone },
                RawOreList.Raw_Yellow_Garnet_Ore,
                CrushedOreList.Crushed_Yellow_Garnet_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Andradite_Dust, 5);
                        put(DustList.Grossular_Dust, 3);
                        put(DustList.Uvarovite_Dust, 1);
                        put(DustList.Yellow_Garnet_Dust, 6);
                        put(GemList.Yellow_Garnet, 3);
                        put(GemList.Exquisite_Yellow_Garnet, 1);
                        put(GemList.Flawless_Yellow_Garnet, 1);
                        put(GemList.Flawed_Yellow_Garnet, 1);
                        put(GemList.Chipped_Yellow_Garnet, 1);
                    }
                }));

        // "Vinteum Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Vinteum_Ore_Stone,
                    OreList.Vinteum_Ore_Netherrack,
                    OreList.Vinteum_Ore_EndStone },
                RawOreList.Raw_Vinteum_Ore,
                CrushedOreList.Crushed_Vinteum_Ore,
                new HashMap<>() {
                    {
                        put(GemList.Vinteum, 7);
                        put(DustList.Vinteum_Dust, 13);
                    }
                }));

        // "Apatite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Apatite_Ore_Stone,
                    OreList.Apatite_Ore_Netherrack,
                    OreList.Apatite_Ore_EndStone },
                RawOreList.Raw_Apatite_Ore,
                CrushedOreList.Crushed_Apatite_Ore,
                new HashMap<>() {
                    {
                        put(GemList.Apatite, 20);
                        put(DustList.Apatite_Dust, 24);
                        put(DustList.Phosphate_Dust, 12);
                        put(DustList.Pyrochlore_Dust, 4);
                        put(GemList.Tricalcium_Phosphate, 8);
                        put(DustList.Tricalcium_Phosphate_Dust, 12);
                    }
                }));

        // "Niter Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Niter_Ore_Stone,
                    OreList.Niter_Ore_Netherrack,
                    OreList.Niter_Ore_EndStone },
                RawOreList.Raw_Niter_Ore,
                CrushedOreList.Crushed_Niter_Ore,
                new HashMap<>() {
                    {
                        put(GemList.Niter, 5);
                        put(DustList.Niter_Dust, 6);
                        put(DustList.Saltpeter_Dust, 9);
                    }
                }));

        // "Tricalcium Phosphate Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Tricalcium_Phosphate_Ore_Stone,
                    OreList.Tricalcium_Phosphate_Ore_Netherrack,
                    OreList.Tricalcium_Phosphate_Ore_EndStone },
                RawOreList.Raw_Tricalcium_Phosphate_Ore,
                CrushedOreList.Crushed_Tricalcium_Phosphate_Ore,
                new HashMap<>() {
                    {
                        put(GemList.Apatite, 6);
                        put(DustList.Apatite_Dust, 9);
                        put(DustList.Phosphate_Dust, 9);
                        put(DustList.Pyrochlore_Dust, 3);
                        put(GemList.Tricalcium_Phosphate, 15);
                        put(DustList.Tricalcium_Phosphate_Dust, 18);
                    }
                }));

        // "Coal Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Coal_Ore_Stone,
                    OreList.Coal_Ore_Netherrack,
                    OreList.Coal_Ore_EndStone },
                RawOreList.Raw_Coal_Ore,
                CrushedOreList.Crushed_Coal_Ore,
                new HashMap<>() {
                    {
                        put(GemList.Coal, 10);
                        put(DustList.Coal_Dust, 12);
                        put(GemList.Lignite_Coal, 4);
                        put(DustList.Lignite_Coal_Dust, 6);
                        put(DustList.Thorium_Dust, 8);
                    }
                }));

        // "Jade Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Jade_Ore_Stone,
                    OreList.Jade_Ore_Netherrack,
                    OreList.Jade_Ore_EndStone },
                RawOreList.Raw_Jade_Ore,
                CrushedOreList.Crushed_Jade_Ore,
                new HashMap<>() {
                    {
                        put(GemList.Jade, 7);
                        put(DustList.Jade_Dust, 12);
                    }
                }));

        // "Lignite Coal Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Lignite_Coal_Ore_Stone,
                    OreList.Lignite_Coal_Ore_Netherrack,
                    OreList.Lignite_Coal_Ore_EndStone },
                RawOreList.Raw_Lignite_Coal_Ore,
                CrushedOreList.Crushed_Lignite_Coal_Ore,
                new HashMap<>() {
                    {
                        put(GemList.Coal, 2);
                        put(DustList.Coal_Dust, 7);
                        put(GemList.Lignite_Coal, 5);
                        put(DustList.Lignite_Coal_Dust, 6);
                    }
                }));

        // "Aer Infused Stone"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Aer_Infused_Stone_Stone,
                    OreList.Aer_Infused_Stone_Netherrack,
                    OreList.Aer_Infused_Stone_EndStone },
                RawOreList.Raw_Aer_Ore,
                CrushedOreList.Crushed_Aer_Crystals,
                new HashMap<>() {
                    {
                        put(DustList.Aer_Crystal_Powder, 26);
                        put(GemList.Air_Shard, 14);
                    }
                }));

        // "Ignis Infused Stone"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Ignis_Infused_Stone_Stone,
                    OreList.Ignis_Infused_Stone_Netherrack,
                    OreList.Ignis_Infused_Stone_EndStone },
                RawOreList.Raw_Ignis_Ore,
                CrushedOreList.Crushed_Ignis_Crystals,
                new HashMap<>() {
                    {
                        put(DustList.Ignis_Crystal_Powder, 26);
                        put(GemList.Fire_Shard, 14);
                    }
                }));

        // "Terra Infused Stone"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Terra_Infused_Stone_Stone,
                    OreList.Terra_Infused_Stone_Netherrack,
                    OreList.Terra_Infused_Stone_EndStone },
                RawOreList.Raw_Terra_Ore,
                CrushedOreList.Crushed_Terra_Crystals,
                new HashMap<>() {
                    {
                        put(DustList.Terra_Crystal_Powder, 26);
                        put(GemList.Earth_Shard, 14);
                    }
                }));

        // "Aqua Infused Stone"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Aqua_Infused_Stone_Stone,
                    OreList.Aqua_Infused_Stone_Netherrack,
                    OreList.Aqua_Infused_Stone_EndStone },
                RawOreList.Raw_Aqua_Ore,
                CrushedOreList.Crushed_Aqua_Crystals,
                new HashMap<>() {
                    {
                        put(DustList.Aqua_Crystal_Powder, 26);
                        put(GemList.Water_Shard, 14);
                    }
                }));

        // "Perditio Infused Stone"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Perditio_Infused_Stone_Stone,
                    OreList.Perditio_Infused_Stone_Netherrack,
                    OreList.Perditio_Infused_Stone_EndStone },
                RawOreList.Raw_Perditio_Ore,
                CrushedOreList.Crushed_Perditio_Crystals,
                new HashMap<>() {
                    {
                        put(DustList.Perditio_Crystal_Powder, 26);
                        put(GemList.Entropy_Shard, 14);
                    }
                }));

        // "Ordo Infused Stone"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Ordo_Infused_Stone_Stone,
                    OreList.Ordo_Infused_Stone_Netherrack,
                    OreList.Ordo_Infused_Stone_EndStone },
                RawOreList.Raw_Ordo_Ore,
                CrushedOreList.Crushed_Ordo_Crystals,
                new HashMap<>() {
                    {
                        put(DustList.Ordo_Crystal_Powder, 26);
                        put(GemList.Order_Shard, 14);
                    }
                }));

        // "Roasted Iron Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Roasted_Iron_Ore_Stone,
                    OreList.Roasted_Iron_Ore_Netherrack,
                    OreList.Roasted_Iron_Ore_EndStone },
                RawOreList.Raw_Roasted_Iron_Ore,
                CrushedOreList.Crushed_Roasted_Iron_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Roasted_Iron_Dust, 13);
                    }
                }));

        // "Roasted Nickel Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Roasted_Nickel_Ore_Stone,
                    OreList.Roasted_Nickel_Ore_Netherrack,
                    OreList.Roasted_Nickel_Ore_EndStone },
                RawOreList.Raw_Roasted_Nickel_Ore,
                CrushedOreList.Crushed_Roasted_Nickel_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Nickel_Dust, 10);
                        put(DustList.Roasted_Nickel_Dust, 5);
                    }
                }));

        // "Pyrochlore Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Pyrochlore_Ore_Stone,
                    OreList.Pyrochlore_Ore_Netherrack,
                    OreList.Pyrochlore_Ore_EndStone },
                RawOreList.Raw_Pyrochlore_Ore,
                CrushedOreList.Crushed_Pyrochlore_Ore,
                new HashMap<>() {
                    {
                        put(GemList.Apatite, 2);
                        put(DustList.Apatite_Dust, 3);
                        put(DustList.Calcite_Dust, 3);
                        put(DustList.Niobium_Dust, 1);
                        put(DustList.Pyrochlore_Dust, 5);
                    }
                }));

        // "Cryolite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Cryolite_Ore_Stone,
                    OreList.Cryolite_Ore_Netherrack,
                    OreList.Cryolite_Ore_EndStone },
                RawOreList.Raw_Cryolite_Ore,
                CrushedOreList.Crushed_Cryolite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Alumina_Dust, 20);
                        put(DustList.Cryolite_Dust, 20);
                        put(DustList.Sodium_Dust, 16);
                    }
                }));

        // "Endium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Endium_Ore_Stone,
                    OreList.Endium_Ore_Netherrack,
                    OreList.Endium_Ore_EndStone },
                RawOreList.Raw_Endium_Ore,
                CrushedOreList.Crushed_Endium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Endium_Dust, 14);
                    }
                }));

        // "Calcium Hydride Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Calcium_Hydride_Ore_Stone,
                    OreList.Calcium_Hydride_Ore_Netherrack,
                    OreList.Calcium_Hydride_Ore_EndStone },
                RawOreList.Raw_Calcium_Hydride_Ore,
                CrushedOreList.Crushed_Calcium_Hydride_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Calcium_Hydride_Dust, 14);
                    }
                }));

        // "Redstone Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Redstone_Ore_Stone,
                    OreList.Redstone_Ore_Netherrack,
                    OreList.Redstone_Ore_EndStone },
                RawOreList.Raw_Redstone_Ore,
                CrushedOreList.Crushed_Redstone_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Glowstone_Dust, 5);
                        put(DustList.Redstone_Dust, 20);
                        put(DustList.Cinnabar_Dust, 25);
                        put(DustList.Rare_Earth, 15);
                    }
                }));

        // "Electrotine Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Electrotine_Ore_Stone,
                    OreList.Electrotine_Ore_Netherrack,
                    OreList.Electrotine_Ore_EndStone },
                RawOreList.Raw_Electrotine_Ore,
                CrushedOreList.Crushed_Electrotine_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Redstone_Dust, 25);
                        put(DustList.Diamond_Dust, 5);
                        put(DustList.Electrum_Dust, 15);
                        put(DustList.Electrotine, 25);
                    }
                }));

        // "Salt Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Salt_Ore_Stone,
                    OreList.Salt_Ore_Netherrack,
                    OreList.Salt_Ore_EndStone },
                RawOreList.Raw_Salt_Ore,
                CrushedOreList.Crushed_Salt_Ore,
                new HashMap<>() {
                    {
                        put(GemList.Rock_Salt, 4);
                        put(GemList.Salt, 2);
                        put(GemList.Exquisite_Salt, 2);
                        put(GemList.Flawless_Salt, 2);
                        put(GemList.Flawed_Salt, 2);
                        put(GemList.Chipped_Salt, 2);
                        put(DustList.Borax_Dust, 8);
                        put(DustList.Rock_Salt, 6);
                        put(DustList.Salt, 12);
                    }
                }));

        // "Almandine Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Almandine_Ore_Stone,
                    OreList.Almandine_Ore_Netherrack,
                    OreList.Almandine_Ore_EndStone },
                RawOreList.Raw_Almandine_Ore,
                CrushedOreList.Crushed_Almandine_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Almandine_Dust, 5);
                        put(DustList.Alumina_Dust, 4);
                        put(GemList.Red_Garnet, 2);
                        put(DustList.Red_Garnet_Dust, 3);
                    }
                }));

        // "Andradite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Andradite_Ore_Stone,
                    OreList.Andradite_Ore_Netherrack,
                    OreList.Andradite_Ore_EndStone },
                RawOreList.Raw_Andradite_Ore,
                CrushedOreList.Crushed_Andradite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Andradite_Dust, 6);
                        put(DustList.Iron_Dust, 5);
                        put(GemList.Yellow_Garnet, 2);
                        put(DustList.Yellow_Garnet_Dust, 3);
                    }
                }));

        // "Bauxite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Bauxite_Ore_Stone,
                    OreList.Bauxite_Ore_Netherrack,
                    OreList.Bauxite_Ore_EndStone },
                RawOreList.Raw_Bauxite_Ore,
                CrushedOreList.Crushed_Bauxite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Bauxite_Dust, 5);
                        put(DustList.Gallium_Dust, 1);
                        put(DustList.Grossular_Dust, 5);
                        put(DustList.Rutile_Dust, 4);
                    }
                }));

        // "Calcite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Calcite_Ore_Stone,
                    OreList.Calcite_Ore_Netherrack,
                    OreList.Calcite_Ore_EndStone },
                RawOreList.Raw_Calcite_Ore,
                CrushedOreList.Crushed_Calcite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Andradite_Dust, 5);
                        put(DustList.Calcite_Dust, 5);
                        put(DustList.Malachite_Dust, 4);
                    }
                }));

        // "Cassiterite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Cassiterite_Ore_Stone,
                    OreList.Cassiterite_Ore_Netherrack,
                    OreList.Cassiterite_Ore_EndStone },
                RawOreList.Raw_Cassiterite_Ore,
                CrushedOreList.Crushed_Cassiterite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Zirconium_Dust, 8);
                        put(DustList.Cassiterite_Dust, 12);
                        put(DustList.Tin_Dust, 20);
                    }
                }));

        // "Chromite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Chromite_Ore_Stone,
                    OreList.Chromite_Ore_Netherrack,
                    OreList.Chromite_Ore_EndStone },
                RawOreList.Raw_Chromite_Ore,
                CrushedOreList.Crushed_Chromite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Chromite_Dust, 6);
                        put(DustList.Iron_Dust, 6);
                        put(DustList.Magnesium_Dust, 4);
                    }
                }));

        // "Cinnabar Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Cinnabar_Ore_Stone,
                    OreList.Cinnabar_Ore_Netherrack,
                    OreList.Cinnabar_Ore_EndStone },
                RawOreList.Raw_Cinnabar_Ore,
                CrushedOreList.Crushed_Cinnabar_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Glowstone_Dust, 1);
                        put(DustList.Redstone_Dust, 5);
                        put(DustList.Cinnabar_Dust, 6);
                        put(DustList.Sulfur_Dust, 3);
                        put(GemList.Amber, 8);
                    }
                }));

        // "Cobaltite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Cobaltite_Ore_Stone,
                    OreList.Cobaltite_Ore_Netherrack,
                    OreList.Cobaltite_Ore_EndStone },
                RawOreList.Raw_Cobaltite_Ore,
                CrushedOreList.Crushed_Cobaltite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Cobalt_Dust, 9);
                        put(DustList.Cobaltite_Dust, 6);
                    }
                }));

        // "Sheldonite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Sheldonite_Ore_Stone,
                    OreList.Sheldonite_Ore_Netherrack,
                    OreList.Sheldonite_Ore_EndStone },
                RawOreList.Raw_Sheldonite_Ore,
                CrushedOreList.Crushed_Sheldonite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Iridium_Metal_Residue_Dust, 1);
                        put(DustList.Palladium_Metallic_Powder_Dust, 20);
                        put(DustList.Nickel_Dust, 4);
                        put(DustList.Sheldonite_Dust, 6);
                    }
                }));

        // "Deep Iron Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Deep_Iron_Ore_Stone,
                    OreList.Deep_Iron_Ore_Netherrack,
                    OreList.Deep_Iron_Ore_EndStone },
                RawOreList.Raw_Deep_Iron_Ore,
                CrushedOreList.Crushed_Deep_Iron_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Deep_Iron_Dust, 5);
                        put(DustList.Iron_Dust, 4);
                        put(DustList.Trinium_Dust, 5);
                    }
                }));

        // "Galena Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Galena_Ore_Stone,
                    OreList.Galena_Ore_Netherrack,
                    OreList.Galena_Ore_EndStone },
                RawOreList.Raw_Galena_Ore,
                CrushedOreList.Crushed_Galena_Ore,
                new HashMap<>() {

                    {
                        put(DustList.Galena_Dust, 5);
                        put(DustList.Lead_Dust, 1);
                        put(DustList.Silver_Dust, 4);
                        put(DustList.Sulfur_Dust, 5);
                    }
                }));

        // "Grossular Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Grossular_Ore_Stone,
                    OreList.Grossular_Ore_Netherrack,
                    OreList.Grossular_Ore_EndStone },
                RawOreList.Raw_Grossular_Ore,
                CrushedOreList.Crushed_Grossular_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Calcium_Dust, 4);
                        put(DustList.Grossular_Dust, 5);
                        put(GemList.Yellow_Garnet, 2);
                        put(DustList.Yellow_Garnet_Dust, 3);
                    }
                }));

        // "Phosphate Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Phosphate_Ore_Stone,
                    OreList.Phosphate_Ore_Netherrack,
                    OreList.Phosphate_Ore_EndStone },
                RawOreList.Raw_Phosphate_Ore,
                CrushedOreList.Crushed_Phosphate_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Phosphate_Dust, 5);
                        put(DustList.Phosphorus_Dust, 9);
                    }
                }));

        // "Pyrite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Pyrite_Ore_Stone,
                    OreList.Pyrite_Ore_Netherrack,
                    OreList.Pyrite_Ore_EndStone },
                RawOreList.Raw_Pyrite_Ore,
                CrushedOreList.Crushed_Pyrite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Iron_Dust, 2);
                        put(DustList.Pyrite_Dust, 6);
                        put(DustList.Sulfur_Dust, 5);
                        put(DustList.Tricalcium_Phosphate_Dust, 3);
                    }
                }));

        // "Pyrope Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Pyrope_Ore_Stone,
                    OreList.Pyrope_Ore_Netherrack,
                    OreList.Pyrope_Ore_EndStone },
                RawOreList.Raw_Pyrope_Ore,
                CrushedOreList.Crushed_Pyrope_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Magnesium_Dust, 4);
                        put(GemList.Red_Garnet, 2);
                        put(DustList.Red_Garnet_Dust, 3);
                        put(DustList.Pyrope_Dust, 5);
                    }
                }));

        // "Saltpeter Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Saltpeter_Ore_Stone,
                    OreList.Saltpeter_Ore_Netherrack,
                    OreList.Saltpeter_Ore_EndStone },
                RawOreList.Raw_Saltpeter_Ore,
                CrushedOreList.Crushed_Saltpeter_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Saltpeter_Dust, 56);
                    }
                }));

        // "Spessartine Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Spessartine_Ore_Stone,
                    OreList.Spessartine_Ore_Netherrack,
                    OreList.Spessartine_Ore_EndStone },
                RawOreList.Raw_Spessartine_Ore,
                CrushedOreList.Crushed_Spessartine_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Manganese_Dust, 4);
                        put(GemList.Red_Garnet, 2);
                        put(DustList.Red_Garnet_Dust, 3);
                        put(DustList.Spessartine_Dust, 5);
                    }
                }));

        // "Sphalerite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Sphalerite_Ore_Stone,
                    OreList.Sphalerite_Ore_Netherrack,
                    OreList.Sphalerite_Ore_EndStone },
                RawOreList.Raw_Sphalerite_Ore,
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5839),
                new HashMap<>() {
                    {
                        put(DustList.Cadmium_Dust, 3);
                        put(DustList.Gallium_Dust, 1);
                        put(DustList.Sphalerite_Dust, 5);
                        put(GemList.Yellow_Garnet, 2);
                        put(DustList.Yellow_Garnet_Dust, 3);
                        put(DustList.Zinc_Dust, 1);
                    }
                }));

        // "Tetrahedrite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Tetrahedrite_Ore_Stone,
                    OreList.Tetrahedrite_Ore_Netherrack,
                    OreList.Tetrahedrite_Ore_EndStone },
                RawOreList.Raw_Tetrahedrite_Ore,
                CrushedOreList.Crushed_Tetrahedrite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Antimony_Dust, 5);
                        put(DustList.Tetrahedrite_Dust, 6);
                        put(DustList.Zinc_Dust, 4);
                    }
                }));

        // "Tungstate Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Tungstate_Ore_Stone,
                    OreList.Tungstate_Ore_Netherrack,
                    OreList.Tungstate_Ore_EndStone },
                RawOreList.Raw_Tungstate_Ore,
                CrushedOreList.Crushed_Tungstate_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Lithium_Dust, 2);
                        put(DustList.Manganese_Dust, 10);
                        put(DustList.Silver_Dust, 8);
                        put(DustList.Tungstate_Dust, 10);
                    }
                }));

        // "Uvarovite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Uvarovite_Ore_Stone,
                    OreList.Uvarovite_Ore_Netherrack,
                    OreList.Uvarovite_Ore_EndStone },
                RawOreList.Raw_Uvarovite_Ore,
                CrushedOreList.Crushed_Uvarovite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Chrome_Dust, 4);
                        put(DustList.Uvarovite_Dust, 5);
                        put(GemList.Yellow_Garnet, 2);
                        put(DustList.Yellow_Garnet_Dust, 3);
                    }
                }));

        // "Chalcopyrite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Chalcopyrite_Ore_Stone,
                    OreList.Chalcopyrite_Ore_Netherrack,
                    OreList.Chalcopyrite_Ore_EndStone },
                RawOreList.Raw_Chalcopyrite_Ore,
                CrushedOreList.Crushed_Chalcopyrite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Cadmium_Dust, 11);
                        put(DustList.Chalcopyrite_Dust, 5);
                        put(DustList.Cobalt_Dust, 4);
                        put(DustList.Gold_Dust, 1);
                        put(DustList.Pyrite_Dust, 5);
                    }
                }));

        // "Silicon Solar Grade (Poly SI) Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Silicon_Solar_Grade_Poly_SI_Ore_Stone,
                    OreList.Silicon_Solar_Grade_Poly_SI_Ore_Netherrack,
                    OreList.Silicon_Solar_Grade_Poly_SI_Ore_EndStone },
                RawOreList.Raw_Silicon_Solar_Grade_Poly_SI_Ore,
                CrushedOreList.Crushed_Silicon_Solar_Grade_Poly_SI_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Silicon_Solar_Grade_Poly_SI_Dust, 14);
                    }
                }));

        // "Emery Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Emery_Ore_Stone,
                    OreList.Emery_Ore_Netherrack,
                    OreList.Emery_Ore_EndStone },
                RawOreList.Raw_Emery_Ore,
                CrushedOreList.Crushed_Emery_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Emery_Dust, 14);
                    }
                }));

        // "Graphite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Graphite_Ore_Stone,
                    OreList.Graphite_Ore_Netherrack,
                    OreList.Graphite_Ore_EndStone },
                RawOreList.Raw_Graphite_Ore,
                CrushedOreList.Crushed_Graphite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Carbon_Dust, 9);
                        put(DustList.Graphite_Dust, 5);
                    }
                }));

        // "Trinium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Trinium_Ore_Stone,
                    OreList.Trinium_Ore_Netherrack,
                    OreList.Trinium_Ore_EndStone },
                RawOreList.Raw_Trinium_Ore,
                CrushedOreList.Crushed_Trinium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Trinium_Dust, 14);
                    }
                }));

        // "Magnetite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Magnetite_Ore_Stone,
                    OreList.Magnetite_Ore_Netherrack,
                    OreList.Magnetite_Ore_EndStone },
                RawOreList.Raw_Magnetite_Ore,
                CrushedOreList.Crushed_Magnetite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Gold_Dust, 6);
                        put(DustList.Iron_Dust, 5);
                        put(DustList.Magnetite_Dust, 6);
                    }
                }));

        // "Malachite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Malachite_Ore_Stone,
                    OreList.Malachite_Ore_Netherrack,
                    OreList.Malachite_Ore_EndStone },
                RawOreList.Raw_Malachite_Ore,
                CrushedOreList.Crushed_Malachite_Ore,
                new HashMap<>() {
                    {
                        put(GemList.Malachite, 5);
                        put(DustList.Brown_Limonite_Dust, 3);
                        put(DustList.Calcite_Dust, 1);
                        put(DustList.Copper_Dust, 6);
                        put(DustList.Malachite_Dust, 6);
                    }
                }));

        // "Pitchblende"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Pitchblende_Stone,
                    OreList.Pitchblende_Netherrack,
                    OreList.Pitchblende_EndStone },
                RawOreList.Raw_Pitchblende_Ore,
                CrushedOreList.Ground_Pitchblende,
                new HashMap<>() {
                    {
                        put(DustList.Lead_Dust, 2);
                        put(DustList.Pitchblende, 6);
                        put(DustList.Thorium_Dust, 5);
                        put(DustList.Uranium_238_Dust, 3);
                        put(DustList.Radium_226_Dust, 4);
                    }
                }));

        // "Soapstone Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Soapstone_Ore_Stone,
                    OreList.Soapstone_Ore_Netherrack,
                    OreList.Soapstone_Ore_EndStone },
                RawOreList.Raw_Soapstone_Ore,
                CrushedOreList.Crushed_Soapstone_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Soapstone_Dust, 14);
                    }
                }));

        // "Wulfenite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Wulfenite_Ore_Stone,
                    OreList.Wulfenite_Ore_Netherrack,
                    OreList.Wulfenite_Ore_EndStone },
                RawOreList.Raw_Wulfenite_Ore,
                CrushedOreList.Crushed_Wulfenite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Wulfenite_Dust, 14);
                    }
                }));

        // "Powellite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Powellite_Ore_Stone,
                    OreList.Powellite_Ore_Netherrack,
                    OreList.Powellite_Ore_EndStone },
                RawOreList.Raw_Powellite_Ore,
                CrushedOreList.Crushed_Powellite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Powellite_Dust, 14);
                    }
                }));

        // "Desh Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Desh_Ore_Stone,
                    OreList.Desh_Ore_Netherrack,
                    OreList.Desh_Ore_EndStone },
                RawOreList.Raw_Desh_Ore,
                CrushedOreList.Crushed_Desh_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Desh_Dust, 14);
                    }
                }));

        // "Cheese Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Cheese_Ore_Stone,
                    OreList.Cheese_Ore_Netherrack,
                    OreList.Cheese_Ore_EndStone },
                RawOreList.Raw_Cheese_Ore,
                CrushedOreList.Crushed_Cheese_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Cheese_Powder, 14);
                    }
                }));

        // "Mirabilite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Mirabilite_Ore_Stone,
                    OreList.Mirabilite_Ore_Netherrack,
                    OreList.Mirabilite_Ore_EndStone },
                RawOreList.Raw_Mirabilite_Ore,
                CrushedOreList.Crushed_Mirabilite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Mirabilite_Dust, 14);
                    }
                }));

        // "Mica Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Mica_Ore_Stone,
                    OreList.Mica_Ore_Netherrack,
                    OreList.Mica_Ore_EndStone },
                RawOreList.Raw_Mica_Ore,
                CrushedOreList.Crushed_Mica_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Mica_Dust, 14);
                    }
                }));

        // "Talc"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Talc_Stone,
                    OreList.Talc_Netherrack,
                    OreList.Talc_EndStone },
                RawOreList.Raw_Talc_Ore,
                CrushedOreList.Ground_Talc,
                new HashMap<>() {
                    {
                        put(DustList.Talc, 14);
                    }
                }));

        // "Trona Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Trona_Ore_Stone,
                    OreList.Trona_Ore_Netherrack,
                    OreList.Trona_Ore_EndStone },
                RawOreList.Raw_Trona_Ore,
                CrushedOreList.Crushed_Trona_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Trona_Dust, 14);
                    }
                }));

        // "Barite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Barite_Ore_Stone,
                    OreList.Barite_Ore_Netherrack,
                    OreList.Barite_Ore_EndStone },
                RawOreList.Raw_Barite_Ore,
                CrushedOreList.Crushed_Barite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Barite_Dust, 14);
                    }
                }));

        // "Bastnasite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Bastnasite_Ore_Stone,
                    OreList.Bastnasite_Ore_Netherrack,
                    OreList.Bastnasite_Ore_EndStone },
                RawOreList.Raw_Bastnasite_Ore,
                CrushedOreList.Crushed_Bastnasite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Bastnasite_Dust, 6);
                        put(DustList.Neodymium_Dust, 6);
                        put(DustList.Rare_Earth, 4);
                    }
                }));

        // "Garnierite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Garnierite_Ore_Stone,
                    OreList.Garnierite_Ore_Netherrack,
                    OreList.Garnierite_Ore_EndStone },
                RawOreList.Raw_Garnierite_Ore,
                CrushedOreList.Crushed_Garnierite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Garnierite_Dust, 5);
                        put(DustList.Nickel_Dust, 10);
                    }
                }));

        // "Lepidolite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Lepidolite_Ore_Stone,
                    OreList.Lepidolite_Ore_Netherrack,
                    OreList.Lepidolite_Ore_EndStone },
                RawOreList.Raw_Lepidolite_Ore,
                CrushedOreList.Crushed_Lepidolite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Caesium_Dust, 4);
                        put(DustList.Lepidolite_Dust, 5);
                        put(DustList.Lithium_Dust, 5);
                    }
                }));

        // "Magnesite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Magnesite_Ore_Stone,
                    OreList.Magnesite_Ore_Netherrack,
                    OreList.Magnesite_Ore_EndStone },
                RawOreList.Raw_Magnesite_Ore,
                CrushedOreList.Crushed_Magnesite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Magnesite_Dust, 5);
                        put(DustList.Magnesium_Dust, 9);
                    }
                }));

        // "Pentlandite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Pentlandite_Ore_Stone,
                    OreList.Pentlandite_Ore_Netherrack,
                    OreList.Pentlandite_Ore_EndStone },
                RawOreList.Raw_Pentlandite_Ore,
                CrushedOreList.Crushed_Pentlandite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Cobalt_Dust, 2);
                        put(DustList.Iron_Dust, 6);
                        put(DustList.Pentlandite_Dust, 6);
                        put(DustList.Sulfur_Dust, 3);
                    }
                }));

        // "Scheelite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Scheelite_Ore_Stone,
                    OreList.Scheelite_Ore_Netherrack,
                    OreList.Scheelite_Ore_EndStone },
                RawOreList.Raw_Scheelite_Ore,
                CrushedOreList.Crushed_Scheelite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Calcium_Dust, 1);
                        put(DustList.Manganese_Dust, 5);
                        put(DustList.Molybdenum_Dust, 3);
                        put(DustList.Scheelite_Dust, 5);
                    }
                }));

        // "Alunite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Alunite_Ore_Stone,
                    OreList.Alunite_Ore_Netherrack,
                    OreList.Alunite_Ore_EndStone },
                RawOreList.Raw_Alunite_Ore,
                CrushedOreList.Crushed_Alunite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Alunite_Dust, 14);
                    }
                }));

        // "Chrysotile Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Chrysotile_Ore_Stone,
                    OreList.Chrysotile_Ore_Netherrack,
                    OreList.Chrysotile_Ore_EndStone },
                RawOreList.Raw_Chrysotile_Ore,
                CrushedOreList.Crushed_Chrysotile_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Asbestos_Dust, 5);
                        put(DustList.Chrysotile_Dust, 5);
                        put(DustList.Magnesium_Dust, 1);
                        put(DustList.Silicon_Dioxide_Dust, 3);
                    }
                }));

        // "Realgar Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Realgar_Ore_Stone,
                    OreList.Realgar_Ore_Netherrack,
                    OreList.Realgar_Ore_EndStone },
                RawOreList.Raw_Realgar_Ore,
                CrushedOreList.Crushed_Realgar_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Realgar_Dust, 14);
                    }
                }));

        // "Dolomite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Dolomite_Ore_Stone,
                    OreList.Dolomite_Ore_Netherrack,
                    OreList.Dolomite_Ore_EndStone },
                RawOreList.Raw_Dolomite_Ore,
                CrushedOreList.Crushed_Dolomite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Dolomite_Dust, 14);
                    }
                }));

        // "Wollastonite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Wollastonite_Ore_Stone,
                    OreList.Wollastonite_Ore_Netherrack,
                    OreList.Wollastonite_Ore_EndStone },
                RawOreList.Raw_Wollastonite_Ore,
                CrushedOreList.Crushed_Wollastonite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Wollastonite_Dust, 14);
                    }
                }));

        // "Zeolite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Zeolite_Ore_Stone,
                    OreList.Zeolite_Ore_Netherrack,
                    OreList.Zeolite_Ore_EndStone },
                RawOreList.Raw_Zeolite_Ore,
                CrushedOreList.Crushed_Zeolite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Zeolite_Dust, 14);
                    }
                }));

        // "Banded Iron Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Banded_Iron_Ore_Stone,
                    OreList.Banded_Iron_Ore_Netherrack,
                    OreList.Banded_Iron_Ore_EndStone },
                RawOreList.Raw_Banded_Iron_Ore,
                CrushedOreList.Crushed_Banded_Iron_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Banded_Iron_Dust, 15);
                        put(DustList.Iron_Dust, 1);
                    }
                }));

        // "Ilmenite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Ilmenite_Ore_Stone,
                    OreList.Ilmenite_Ore_Netherrack,
                    OreList.Ilmenite_Ore_EndStone },
                RawOreList.Raw_Ilmenite_Ore,
                CrushedOreList.Crushed_Ilmenite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Hafnium_Dust, 2);
                        put(DustList.Zirconium_Dust, 2);
                        put(DustList.Ilmenite_Dust, 6);
                        put(DustList.Iron_Dust, 7);
                        put(DustList.Rutile_Dust, 4);
                    }
                }));

        // "Pollucite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Pollucite_Ore_Stone,
                    OreList.Pollucite_Ore_Netherrack,
                    OreList.Pollucite_Ore_EndStone },
                RawOreList.Raw_Pollucite_Ore,
                CrushedOreList.Crushed_Pollucite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Alumina_Dust, 3);
                        put(DustList.Caesium_Dust, 5);
                        put(DustList.Pollucite_Dust, 5);
                        put(DustList.Rubidium_Dust, 1);
                    }
                }));

        // "Spodumene Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Spodumene_Ore_Stone,
                    OreList.Spodumene_Ore_Netherrack,
                    OreList.Spodumene_Ore_EndStone },
                RawOreList.Raw_Spodumene_Ore,
                CrushedOreList.Crushed_Spodumene_Ore,
                new HashMap<>() {
                    {
                        put(GemList.Spodumene, 3);
                        put(GemList.Exquisite_Spodumene, 1);
                        put(GemList.Flawless_Spodumene, 1);
                        put(GemList.Flawed_Spodumene, 1);
                        put(GemList.Chipped_Spodumene, 1);
                        put(DustList.Alumina_Dust, 5);
                        put(DustList.Lithium_Dust, 4);
                        put(DustList.Spodumene_Dust, 6);
                    }
                }));

        // "Tantalite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Tantalite_Ore_Stone,
                    OreList.Tantalite_Ore_Netherrack,
                    OreList.Tantalite_Ore_EndStone },
                RawOreList.Raw_Tantalite_Ore,
                CrushedOreList.Crushed_Tantalite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Manganese_Dust, 5);
                        put(DustList.Niobium_Dust, 3);
                        put(DustList.Tantalite_Dust, 5);
                        put(DustList.Tantalum_Dust, 2);
                    }
                }));

        // "Uraninite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Uraninite_Ore_Stone,
                    OreList.Uraninite_Ore_Netherrack,
                    OreList.Uraninite_Ore_EndStone },
                RawOreList.Raw_Uraninite_Ore,
                CrushedOreList.Crushed_Uraninite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Thorium_Dust, 3);
                        put(DustList.Uraninite_Dust, 6);
                        put(DustList.Uranium_235_Dust, 1);
                        put(DustList.Uranium_238_Dust, 6);
                        put(DustList.Radium_226_Dust, 4);
                    }
                }));

        // "Vanadium Magnetite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Vanadium_Magnetite_Ore_Stone,
                    OreList.Vanadium_Magnetite_Ore_Netherrack,
                    OreList.Vanadium_Magnetite_Ore_EndStone },
                RawOreList.Raw_Vanadium_Magnetite_Ore,
                CrushedOreList.Crushed_Vanadium_Magnetite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Gold_Dust, 1);
                        put(DustList.Magnesite_Dust, 5);
                        put(DustList.Vanadium_Dust, 4);
                        put(DustList.Vanadium_Magnetite_Dust, 6);
                    }
                }));

        // "Kyanite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Kyanite_Ore_Stone,
                    OreList.Kyanite_Ore_Netherrack,
                    OreList.Kyanite_Ore_EndStone },
                RawOreList.Raw_Kyanite_Ore,
                CrushedOreList.Crushed_Kyanite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Kyanite_Dust, 14);
                    }
                }));

        // "Perlite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Perlite_Ore_Stone,
                    OreList.Perlite_Ore_Netherrack,
                    OreList.Perlite_Ore_EndStone },
                RawOreList.Raw_Perlite_Ore,
                CrushedOreList.Crushed_Perlite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Perlite_Dust, 14);
                    }
                }));

        // "Pumice Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Pumice_Ore_Stone,
                    OreList.Pumice_Ore_Netherrack,
                    OreList.Pumice_Ore_EndStone },
                RawOreList.Raw_Pumice_Ore,
                CrushedOreList.Crushed_Pumice_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Pumice_Dust, 14);
                    }
                }));

        // "Bentonite"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Bentonite_Stone,
                    OreList.Bentonite_Netherrack,
                    OreList.Bentonite_EndStone },
                RawOreList.Raw_Bentonite_Ore,
                CrushedOreList.Ground_Bentonite,
                new HashMap<>() {
                    {
                        put(DustList.Alumina_Dust, 5);
                        put(DustList.Bentonite, 5);
                        put(DustList.Calcium_Dust, 3);
                        put(DustList.Magnesium_Dust, 1);
                    }
                }));

        // "Fullers Earth"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Fullers_Earth_Stone,
                    OreList.Fullers_Earth_Netherrack,
                    OreList.Fullers_Earth_EndStone },
                RawOreList.Raw_Fullers_Earth_Ore,
                CrushedOreList.Ground_Fullers_Earth,
                new HashMap<>() {
                    {
                        put(DustList.Alumina_Dust, 5);
                        put(DustList.Fullers_Earth, 5);
                        put(DustList.Magnesium_Dust, 1);
                        put(DustList.Silicon_Dioxide_Dust, 3);
                    }
                }));

        // "Kaolinite"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Kaolinite_Stone,
                    OreList.Kaolinite_Netherrack,
                    OreList.Kaolinite_EndStone },
                RawOreList.Raw_Kaolinite_Ore,
                CrushedOreList.Ground_Kaolinite,
                new HashMap<>() {
                    {
                        put(DustList.Kaolinite, 14);
                    }
                }));

        // "Brown Limonite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Brown_Limonite_Ore_Stone,
                    OreList.Brown_Limonite_Ore_Netherrack,
                    OreList.Brown_Limonite_Ore_EndStone },
                RawOreList.Raw_Brown_Limonite_Ore,
                CrushedOreList.Crushed_Brown_Limonite_Ore,
                new HashMap<>() {
                    {
                        put(GemList.Malachite, 2);
                        put(DustList.Brown_Limonite_Dust, 6);
                        put(DustList.Iron_Dust, 1);
                        put(DustList.Malachite_Dust, 3);
                        put(DustList.Yellow_Limonite_Dust, 4);
                    }
                }));

        // "Yellow Limonite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Yellow_Limonite_Ore_Stone,
                    OreList.Yellow_Limonite_Ore_Netherrack,
                    OreList.Yellow_Limonite_Ore_EndStone },
                RawOreList.Raw_Yellow_Limonite_Ore,
                CrushedOreList.Crushed_Yellow_Limonite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Brown_Limonite_Dust, 3);
                        put(DustList.Cobalt_Dust, 1);
                        put(DustList.Iron_Dust, 1);
                        put(DustList.Nickel_Dust, 6);
                        put(DustList.Yellow_Limonite_Dust, 6);
                    }
                }));

        // "Vermiculite"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Vermiculite_Stone,
                    OreList.Vermiculite_Netherrack,
                    OreList.Vermiculite_EndStone },
                RawOreList.Raw_Vermiculite_Ore,
                CrushedOreList.Ground_Vermiculite,
                new HashMap<>() {
                    {
                        put(DustList.Alumina_Dust, 3);
                        put(DustList.Iron_Dust, 6);
                        put(DustList.Magnesium_Dust, 1);
                        put(DustList.Vermiculite, 6);
                    }
                }));

        // "Glauconite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Glauconite_Ore_Stone,
                    OreList.Glauconite_Ore_Netherrack,
                    OreList.Glauconite_Ore_EndStone },
                RawOreList.Raw_Glauconite_Ore,
                CrushedOreList.Crushed_Glauconite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Alumina_Dust, 3);
                        put(DustList.Glauconite_Dust, 6);
                        put(DustList.Iron_Dust, 2);
                        put(DustList.Sodium_Dust, 5);
                    }
                }));

        // "Gypsum Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Gypsum_Ore_Stone,
                    OreList.Gypsum_Ore_Netherrack,
                    OreList.Gypsum_Ore_EndStone },
                RawOreList.Raw_Gypsum_Ore,
                CrushedOreList.Crushed_Gypsum_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Gypsum_Dust, 14);
                    }
                }));

        // "Basaltic Mineral Sand"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Basaltic_Mineral_Sand_Stone,
                    OreList.Basaltic_Mineral_Sand_Netherrack,
                    OreList.Basaltic_Mineral_Sand_EndStone },
                RawOreList.Raw_Basaltic_Mineral_Sand_Ore,
                CrushedOreList.Ground_Basaltic_Mineral_Sand,
                new HashMap<>() {
                    {
                        put(DustList.Basalt_Dust, 5);
                        put(DustList.Basaltic_Mineral_Sand, 6);
                        put(DustList.Gold_Dust, 1);
                        put(DustList.Magnetite_Dust, 4);
                    }
                }));

        // "Granitic Mineral Sand"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Granitic_Mineral_Sand_Stone,
                    OreList.Granitic_Mineral_Sand_Netherrack,
                    OreList.Granitic_Mineral_Sand_EndStone },
                RawOreList.Raw_Granitic_Mineral_Sand_Ore,
                CrushedOreList.Ground_Granitic_Mineral_Sand,
                new HashMap<>() {
                    {
                        put(DustList.Black_Granite_Dust, 5);
                        put(DustList.Gold_Dust, 1);
                        put(DustList.Granitic_Mineral_Sand, 6);
                        put(DustList.Magnetite_Dust, 4);
                    }
                }));

        // "Cassiterite Sand"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Cassiterite_Sand_Stone,
                    OreList.Cassiterite_Sand_Netherrack,
                    OreList.Cassiterite_Sand_EndStone },
                RawOreList.Raw_Cassiterite_Sand_Ore,
                CrushedOreList.Ground_Cassiterite_Sand,
                new HashMap<>() {
                    {
                        put(DustList.Cassiterite_Sand, 10);
                        put(DustList.Tin_Dust, 18);
                    }
                }));

        // "Garnet Sand"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Garnet_Sand_Stone,
                    OreList.Garnet_Sand_Netherrack,
                    OreList.Garnet_Sand_EndStone },
                // "Raw Garnet Sand Ore"
                RawOreList.Raw_Garnet_Sand_Ore,
                // "Ground Garnet Sand"
                CrushedOreList.Ground_Garnet_Sand,
                new HashMap<>() {

                    {
                        // "Garnet Sand"
                        put(DustList.Garnet_Sand, 5);
                        // "Red Garnet"
                        put(GemList.Red_Garnet, 2);
                        // "Red Garnet Dust"
                        put(DustList.Red_Garnet_Dust, 3);
                        // "Yellow Garnet Dust"
                        put(DustList.Yellow_Garnet_Dust, 4);
                    }
                }));

        // "Quartz Sand"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Quartz_Sand_Stone,
                    OreList.Quartz_Sand_Netherrack,
                    OreList.Quartz_Sand_EndStone },
                RawOreList.Raw_Quartz_Sand_Ore,
                CrushedOreList.Ground_Quartz_Sand,
                new HashMap<>() {
                    {
                        put(DustList.Barite_Dust, 1);
                        put(GemList.Certus_Quartz, 2);
                        put(DustList.Certus_Quartz_Dust, 3);
                        put(DustList.Quartz_Sand, 5);
                        put(DustList.Quartzite_Dust, 3);
                    }
                }));

        // "Borax Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Borax_Ore_Stone,
                    OreList.Borax_Ore_Netherrack,
                    OreList.Borax_Ore_EndStone },
                RawOreList.Raw_Borax_Ore,
                CrushedOreList.Crushed_Borax_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Borax_Dust, 14);
                    }
                }));

        // "Molybdenite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Molybdenite_Ore_Stone,
                    OreList.Molybdenite_Ore_Netherrack,
                    OreList.Molybdenite_Ore_EndStone },
                RawOreList.Raw_Molybdenite_Ore,
                CrushedOreList.Crushed_Molybdenite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Molybdenite_Dust, 5);
                        put(DustList.Molybdenum_Dust, 9);
                    }
                }));

        // "Pyrolusite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Pyrolusite_Ore_Stone,
                    OreList.Pyrolusite_Ore_Netherrack,
                    OreList.Pyrolusite_Ore_EndStone },
                RawOreList.Raw_Pyrolusite_Ore,
                CrushedOreList.Crushed_Pyrolusite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Manganese_Dust, 6);
                        put(DustList.Niobium_Dust, 1);
                        put(DustList.Pyrolusite_Dust, 5);
                        put(DustList.Tantalite_Dust, 3);
                    }
                }));

        // "Rock Salt Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Rock_Salt_Ore_Stone,
                    OreList.Rock_Salt_Ore_Netherrack,
                    OreList.Rock_Salt_Ore_EndStone },
                RawOreList.Raw_Rock_Salt_Ore,
                CrushedOreList.Crushed_Rock_Salt_Ore,
                new HashMap<>() {

                    {
                        put(GemList.Salt, 4);
                        put(GemList.Rock_Salt, 2);
                        put(GemList.Exquisite_Rock_Salt, 2);
                        put(GemList.Flawless_Rock_Salt, 2);
                        put(GemList.Flawed_Rock_Salt, 2);
                        put(GemList.Chipped_Rock_Salt, 2);
                        put(DustList.Borax_Dust, 8);
                        put(DustList.Rock_Salt, 12);
                        put(DustList.Salt, 6);
                    }
                }));

        // "Stibnite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Stibnite_Ore_Stone,
                    OreList.Stibnite_Ore_Netherrack,
                    OreList.Stibnite_Ore_EndStone },
                RawOreList.Raw_Stibnite_Ore,
                CrushedOreList.Crushed_Stibnite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Antimony_Dust, 9);
                        put(DustList.Stibnite_Dust, 5);
                    }
                }));

        // "Asbestos Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Asbestos_Ore_Stone,
                    OreList.Asbestos_Ore_Netherrack,
                    OreList.Asbestos_Ore_EndStone },
                RawOreList.Raw_Asbestos_Ore,
                CrushedOreList.Crushed_Asbestos_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Asbestos_Dust, 10);
                        put(DustList.Magnesium_Dust, 1);
                        put(DustList.Silicon_Dioxide_Dust, 3);
                    }
                }));

        // "Diatomite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Diatomite_Ore_Stone,
                    OreList.Diatomite_Ore_Netherrack,
                    OreList.Diatomite_Ore_EndStone },
                RawOreList.Raw_Diatomite_Ore,
                CrushedOreList.Crushed_Diatomite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Banded_Iron_Dust, 5);
                        put(DustList.Diatomite_Dust, 5);
                        put(DustList.Sapphire_Dust, 4);
                    }
                }));

        // "Glauconite Sand"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Glauconite_Sand_Stone,
                    OreList.Glauconite_Sand_Netherrack,
                    OreList.Glauconite_Sand_EndStone },
                RawOreList.Raw_Glauconite_Sand_Ore,
                CrushedOreList.Ground_Glauconite_Sand,
                new HashMap<>() {
                    {
                        put(DustList.Alumina_Dust, 3);
                        put(DustList.Glauconite_Sand, 6);
                        put(DustList.Iron_Dust, 2);
                        put(DustList.Sodium_Dust, 5);
                    }
                }));

        // "Vyroxeres Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Vyroxeres_Ore_Stone,
                    OreList.Vyroxeres_Ore_Netherrack,
                    OreList.Vyroxeres_Ore_EndStone },
                RawOreList.Raw_Vyroxeres_Ore,
                CrushedOreList.Crushed_Vyroxeres_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Vyroxeres_Dust, 14);
                    }
                }));

        // "Ceruclase Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Ceruclase_Ore_Stone,
                    OreList.Ceruclase_Ore_Netherrack,
                    OreList.Ceruclase_Ore_EndStone },
                RawOreList.Raw_Ceruclase_Ore,
                CrushedOreList.Crushed_Ceruclase_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Ceruclase_Dust, 14);
                    }
                }));

        // "Tartarite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Tartarite_Ore_Stone,
                    OreList.Tartarite_Ore_Netherrack,
                    OreList.Tartarite_Ore_EndStone },
                RawOreList.Raw_Tartarite_Ore,
                CrushedOreList.Crushed_Tartarite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Tartarite_Dust, 14);
                    }
                }));

        // "Orichalcum Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Orichalcum_Ore_Stone,
                    OreList.Orichalcum_Ore_Netherrack,
                    OreList.Orichalcum_Ore_EndStone },
                RawOreList.Raw_Orichalcum_Ore,
                CrushedOreList.Crushed_Orichalcum_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Orichalcum_Dust, 14);
                    }
                }));

        // "Aluminium Fluoride Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Aluminium_Fluoride_Ore_Stone,
                    OreList.Aluminium_Fluoride_Ore_Netherrack,
                    OreList.Aluminium_Fluoride_Ore_EndStone },
                RawOreList.Raw_Aluminium_Fluoride_Ore,
                CrushedOreList.Crushed_Aluminium_Fluoride_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Aluminium_Fluoride_Dust, 14);
                    }
                }));

        // "Calcium Disilicide Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Calcium_Disilicide_Ore_Stone,
                    OreList.Calcium_Disilicide_Ore_Netherrack,
                    OreList.Calcium_Disilicide_Ore_EndStone },
                RawOreList.Raw_Calcium_Disilicide_Ore,
                CrushedOreList.Crushed_Calcium_Disilicide_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Calcium_Disilicide_Dust, 14);
                    }
                }));

        // "Draconium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Draconium_Ore_Stone,
                    OreList.Draconium_Ore_Netherrack,
                    OreList.Draconium_Ore_EndStone },
                RawOreList.Raw_Draconium_Ore,
                CrushedOreList.Crushed_Draconium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Draconium_Dust, 14);
                    }
                }));

        // "Awakened Draconium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Awakened_Draconium_Ore_Stone,
                    OreList.Awakened_Draconium_Ore_Netherrack,
                    OreList.Awakened_Draconium_Ore_EndStone },
                RawOreList.Raw_Awakened_Draconium_Ore,
                CrushedOreList.Crushed_Awakened_Draconium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Awakened_Draconium_Dust, 14);
                    }
                }));

        // "Ichorium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Ichorium_Ore_Stone,
                    OreList.Ichorium_Ore_Netherrack,
                    OreList.Ichorium_Ore_EndStone },
                RawOreList.Raw_Ichorium_Ore,
                CrushedOreList.Crushed_Ichorium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Ichorium_Dust, 14);
                    }
                }));

        // "Cosmic Neutronium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Cosmic_Neutronium_Ore_Stone,
                    OreList.Cosmic_Neutronium_Ore_Netherrack,
                    OreList.Cosmic_Neutronium_Ore_EndStone },
                RawOreList.Raw_Cosmic_Neutronium_Ore,
                CrushedOreList.Crushed_Cosmic_Neutronium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Cosmic_Neutronium_Dust, 14);
                    }
                }));

        // "Flerovium Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] {
                    OreList.Flerovium_Ore_Stone,
                    OreList.Flerovium_Ore_Netherrack,
                    OreList.Flerovium_Ore_EndStone },
                RawOreList.Raw_Flerovium_Ore,
                CrushedOreList.Crushed_Flerovium_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Flerovium_Dust, 14);
                    }
                }));

        // "Fluorite (F) Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Fluorite_F_Ore },
                RawOreList.Raw_Fluorite_F_Ore,
                CrushedOreList.Crushed_Fluorite_F_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Fluorite_F_Dust, 14);
                    }
                }));

        // "Koboldite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Koboldite_Ore },
                RawOreList.Raw_Koboldite_Ore,
                CrushedOreList.Crushed_Koboldite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Nickel_Dust, 4);
                        put(DustList.Thaumium_Dust, 1);
                        put(DustList.Koboldite_Dust, 4);
                    }
                }));

        // "Crocoite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Crocoite_Ore },
                RawOreList.Raw_Crocoite_Ore,
                CrushedOreList.Crushed_Crocoite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Chrome_Dust, 1);
                        put(DustList.Lead_Dust, 4);
                        put(DustList.Crocoite_Dust, 4);
                    }
                }));

        // "Geikielite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Geikielite_Ore },
                RawOreList.Raw_Geikielite_Ore,
                CrushedOreList.Crushed_Geikielite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Magnesium_Dust, 4);
                        put(DustList.Titanium_Dust, 1);
                        put(DustList.Geikielite_Dust, 4);
                    }
                }));

        // "Nichromite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Nichromite_Ore },
                RawOreList.Raw_Nichromite_Ore,
                CrushedOreList.Crushed_Nichromite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Cobalt_Dust, 1);
                        put(DustList.Nickel_Dust, 4);
                        put(DustList.Nichromite_Dust, 4);
                    }
                }));

        // "Titanite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Titanite_Ore },
                RawOreList.Raw_Titanite_Ore,
                CrushedOreList.Crushed_Titanite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Calcium_Dust, 4);
                        put(DustList.Titanium_Dust, 1);
                        put(DustList.Titanite_Dust, 4);
                    }
                }));

        // "Zimbabweite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Zimbabweite_Ore },
                RawOreList.Raw_Zimbabweite_Ore,
                CrushedOreList.Crushed_Zimbabweite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Calcium_Dust, 4);
                        put(DustList.Lead_Dust, 1);
                        put(DustList.Zimbabweite_Dust, 4);
                    }
                }));

        // "Zirconolite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Zirconolite_Ore },
                RawOreList.Raw_Zirconolite_Ore,
                CrushedOreList.Crushed_Zirconolite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Zirconium_Dust, 1);
                        put(DustList.Calcium_Dust, 4);
                        put(DustList.Zirconolite_Dust, 4);
                    }
                }));

        // "Gadolinite (Ce) Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Gadolinite_Ce_Ore },
                RawOreList.Raw_Gadolinite_Ce_Ore,
                CrushedOreList.Crushed_Gadolinite_Ce_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Cerium_Rich_Mixture_Dust, 8);
                        put(DustList.Erbium_Dust, 1);
                        put(DustList.Gadolinite_Ce_Dust, 4);
                    }
                }));

        // "Gadolinite (Y) Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Gadolinite_Y_Ore },
                RawOreList.Raw_Gadolinite_Y_Ore,
                CrushedOreList.Crushed_Gadolinite_Y_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Cerium_Rich_Mixture_Dust, 8);
                        put(DustList.Erbium_Dust, 1);
                        put(DustList.Gadolinite_Y_Dust, 4);
                    }
                }));

        // "Lepersonnite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Lepersonnite_Ore },
                RawOreList.Raw_Lepersonnite_Ore,
                CrushedOreList.Crushed_Lepersonnite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Calcium_Dust, 4);
                        put(DustList.Ytterbium_Dust, 1);
                        put(DustList.Lepersonnite_Dust, 4);
                    }
                }));

        // "Samarskite (Y) Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Samarskite_Y_Ore },
                RawOreList.Raw_Samarskite_Y_Ore,
                CrushedOreList.Crushed_Samarskite_Y_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Iron_Dust, 1);
                        put(DustList.Yttrium_Dust, 4);
                        put(DustList.Samarskite_Y_Dust, 4);
                    }
                }));

        // "Samarskite (Yb) Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Samarskite_Yb_Ore },
                RawOreList.Raw_Samarskite_Yb_Ore,
                CrushedOreList.Crushed_Samarskite_Yb_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Iron_Dust, 1);
                        put(DustList.Ytterbium_Dust, 4);
                        put(DustList.Samarskite_Yb_Dust, 4);
                    }
                }));

        // "Xenotime Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Xenotime_Ore },
                RawOreList.Raw_Xenotime_Ore,
                CrushedOreList.Crushed_Xenotime_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Ytterbium_Dust, 1);
                        put(DustList.Yttrium_Dust, 4);
                        put(DustList.Xenotime_Dust, 4);
                    }
                }));

        // "Yttriaite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Yttriaite_Ore },
                RawOreList.Raw_Yttriaite_Ore,
                CrushedOreList.Crushed_Yttriaite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Iron_Dust, 1);
                        put(DustList.Yttrium_Dust, 4);
                        put(DustList.Yttriaite_Dust, 4);
                    }
                }));

        // "Yttrialite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Yttrialite_Ore },
                RawOreList.Raw_Yttrialite_Ore,
                CrushedOreList.Crushed_Yttrialite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Thorium_Dust, 1);
                        put(DustList.Yttrium_Dust, 4);
                        put(DustList.Yttrialite_Dust, 4);
                    }
                }));

        // "Yttrocerite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Yttrocerite_Ore },
                RawOreList.Raw_Yttrocerite_Ore,
                CrushedOreList.Crushed_Yttrocerite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Cerium_Rich_Mixture_Dust, 8);
                        put(DustList.Calcium_Dust, 1);
                        put(DustList.Yttrocerite_Dust, 4);
                    }
                }));

        // "Zircon Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Zircon_Ore },
                RawOreList.Raw_Zircon_Ore,
                CrushedOreList.Crushed_Zircon_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Zirconium_Dust, 4);
                        put(DustList.Raw_Silicon_Dust, 1);
                        put(DustList.Zircon_Dust, 4);
                    }
                }));

        // "Polycrase Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Polycrase_Ore },
                RawOreList.Raw_Polycrase_Ore,
                CrushedOreList.Crushed_Polycrase_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Calcium_Dust, 1);
                        put(DustList.Yttrium_Dust, 4);
                        put(DustList.Polycrase_Dust, 4);
                    }
                }));

        // "Zircophyllite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Zircophyllite_Ore },
                RawOreList.Raw_Zircophyllite_Ore,
                CrushedOreList.Crushed_Zircophyllite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Iron_Dust, 1);
                        put(DustList.Manganese_Dust, 4);
                        put(DustList.Zircophyllite_Dust, 4);
                    }
                }));

        // "Zirkelite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Zirkelite_Ore },
                RawOreList.Raw_Zirkelite_Ore,
                CrushedOreList.Crushed_Zirkelite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Calcium_Dust, 4);
                        put(DustList.Thorium_Dust, 1);
                        put(DustList.Zirkelite_Dust, 4);
                    }
                }));

        // "Lanthanite (La) Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Lanthanite_La_Ore },
                RawOreList.Raw_Lanthanite_La_Ore,
                CrushedOreList.Crushed_Lanthanite_La_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Calcium_Dust, 1);
                        put(DustList.Lanthanum_Dust, 4);
                        put(DustList.Lanthanite_La_Dust, 4);
                    }
                }));

        // "Lanthanite (Ce) Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Lanthanite_Ce_Ore },
                RawOreList.Raw_Lanthanite_Ce_Ore,
                CrushedOreList.Crushed_Lanthanite_Ce_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Cerium_Rich_Mixture_Dust, 8);
                        put(DustList.Calcium_Dust, 1);
                        put(DustList.Lanthanite_Ce_Dust, 4);
                    }
                }));

        // "Lanthanite (Nd) Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Lanthanite_Nd_Ore },
                RawOreList.Raw_Lanthanite_Nd_Ore,
                CrushedOreList.Crushed_Lanthanite_Nd_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Calcium_Dust, 1);
                        put(DustList.Neodymium_Dust, 4);
                        put(DustList.Lanthanite_Nd_Dust, 4);
                    }
                }));

        // "Agardite (Y) Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Agardite_Y_Ore },
                RawOreList.Raw_Agardite_Y_Ore,
                CrushedOreList.Crushed_Agardite_Y_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Calcium_Dust, 1);
                        put(DustList.Yttrium_Dust, 4);
                        put(DustList.Agardite_Y_Dust, 4);
                    }
                }));

        // "Agardite (Cd) Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Agardite_Cd_Ore },
                RawOreList.Raw_Agardite_Cd_Ore,
                CrushedOreList.Crushed_Agardite_Cd_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Calcium_Dust, 4);
                        put(DustList.Copper_Dust, 1);
                        put(DustList.Agardite_Cd_Dust, 4);
                    }
                }));

        // "Agardite (La) Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Agardite_La_Ore },
                RawOreList.Raw_Agardite_La_Ore,
                CrushedOreList.Crushed_Agardite_La_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Calcium_Dust, 1);
                        put(DustList.Lanthanum_Dust, 4);
                        put(DustList.Agardite_La_Dust, 4);
                    }
                }));

        // "Agardite (Nd) Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Agardite_Nd_Ore },
                RawOreList.Raw_Agardite_Nd_Ore,
                CrushedOreList.Crushed_Agardite_Nd_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Calcium_Dust, 1);
                        put(DustList.Neodymium_Dust, 4);
                        put(DustList.Agardite_Nd_Dust, 4);
                    }
                }));

        // "Hibonite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Hibonite_Ore },
                RawOreList.Raw_Hibonite_Ore,
                CrushedOreList.Crushed_Hibonite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Cerium_Rich_Mixture_Dust, 2);
                        put(DustList.Calcium_Dust, 4);
                        put(DustList.Hibonite_Dust, 4);
                    }
                }));

        // "Cerite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Cerite_Ore },
                RawOreList.Raw_Cerite_Ore,
                CrushedOreList.Crushed_Cerite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Cerium_Rich_Mixture_Dust, 8);
                        put(DustList.Lanthanum_Dust, 1);
                        put(DustList.Cerite_Dust, 4);
                    }
                }));

        // "Fluorcaphite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Fluorcaphite_Ore },
                RawOreList.Raw_Fluorcaphite_Ore,
                CrushedOreList.Crushed_Fluorcaphite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Cerium_Rich_Mixture_Dust, 2);
                        put(DustList.Calcium_Dust, 4);
                        put(DustList.Fluorcaphite_Dust, 4);
                    }
                }));

        // "Florencite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Florencite_Ore },
                RawOreList.Raw_Florencite_Ore,
                CrushedOreList.Crushed_Florencite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Samarium_Ore_Concentrate_Dust, 8);
                        put(DustList.Aluminium_Dust, 1);
                        put(DustList.Florencite_Dust, 4);
                    }
                }));

        // "Cryolite (F) Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Cryolite_F_Ore },
                RawOreList.Raw_Cryolite_F_Ore,
                CrushedOreList.Crushed_Cryolite_F_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Aluminium_Dust, 1);
                        put(DustList.Cryolite_F_Dust, 4);
                    }
                }));

        // "Lautarite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Lautarite_Ore },
                RawOreList.Raw_Lautarite_Ore,
                CrushedOreList.Crushed_Lautarite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Iodine_Dust_BartWorks, 1);
                        put(DustList.Calcium_Dust, 4);
                        put(DustList.Lautarite_Dust, 4);
                    }
                }));

        // "Lafossaite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Lafossaite_Ore },
                RawOreList.Raw_Lafossaite_Ore,
                CrushedOreList.Crushed_Lafossaite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Lafossaite_Dust, 4);
                        put(DustList.Thallium_Dust, 1);
                    }
                }));

        // "Demicheleite (Br) Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Demicheleite_Br_Ore },
                RawOreList.Raw_Demicheleite_Br_Ore,
                CrushedOreList.Crushed_Demicheleite_Br_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Bismuth_Dust, 4);
                        put(DustList.Demicheleite_Br_Dust, 4);
                    }
                }));

        // "Comancheite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Comancheite_Ore },
                RawOreList.Raw_Comancheite_Ore,
                CrushedOreList.Crushed_Comancheite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Comancheite_Dust, 4);
                    }
                }));

        // "Perroudite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Perroudite_Ore },
                RawOreList.Raw_Perroudite_Ore,
                CrushedOreList.Crushed_Perroudite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Silver_Dust, 2);
                        put(DustList.Sulfur_Dust, 6);
                        put(DustList.Perroudite_Dust, 5);
                    }
                }));

        // "Honeaite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Honeaite_Ore },
                RawOreList.Raw_Honeaite_Ore,
                CrushedOreList.Crushed_Honeaite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Gold_Dust, 4);
                        put(DustList.Honeaite_Dust, 4);
                        put(DustList.Thallium_Dust, 1);
                    }
                }));

        // "Alburnite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Alburnite_Ore },
                RawOreList.Raw_Alburnite_Ore,
                CrushedOreList.Crushed_Alburnite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Gold_Dust, 4);
                        put(DustList.Alburnite_Dust, 4);
                        put(DustList.Germanium_Dust, 1);
                    }
                }));

        // "Miessiite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Miessiite_Ore },
                RawOreList.Raw_Miessiite_Ore,
                CrushedOreList.Crushed_Miessiite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Palladium_Metallic_Powder_Dust, 16);
                        put(DustList.Tellurium_Dust, 1);
                        put(DustList.Miessiite_Dust, 4);
                    }
                }));

        // "Kashinite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Kashinite_Ore },
                RawOreList.Raw_Kashinite_Ore,
                CrushedOreList.Crushed_Kashinite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Crude_Rhodium_Metal_Dust, 2);
                        put(DustList.Iridium_Metal_Residue_Dust, 4);
                        put(DustList.Kashinite_Dust, 4);
                    }
                }));

        // "Irarsite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Irarsite_Ore },
                RawOreList.Raw_Irarsite_Ore,
                CrushedOreList.Crushed_Irarsite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Iridium_Metal_Residue_Dust, 4);
                        put(DustList.Leach_Residue_Dust, 2);
                        put(DustList.Irarsite_Dust, 4);
                    }
                }));

        // "Greenockite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Greenockite_Ore },
                RawOreList.Raw_Greenockite_Ore,
                CrushedOreList.Crushed_Greenockite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Greenockite_Dust, 4);
                    }
                }));

        // "Strange Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Strange_Ore },
                RawOreList.Raw_Strange_Ore,
                CrushedOreList.Crushed_Strange_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Uranium_235_Dust, 1);
                        put(DustList.Radioactive_Mineral_Mix_Dust, 4);
                        put(DustList.Radium_Dust, 4);
                    }
                }));

        // "Ancient Granite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Ancient_Granite_Ore },
                RawOreList.Raw_Ancient_Granite_Ore,
                CrushedOreList.Crushed_Ancient_Granite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Calcium_Dust, 1);
                        put(DustList.Iron_Dust, 4);
                        put(DustList.Ancient_Granite_Dust, 4);
                    }
                }));

        // "Runite Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Runite_Ore },
                RawOreList.Raw_Runite_Ore,
                CrushedOreList.Crushed_Runite_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Runite_Dust, 9);
                    }
                }));

        // "Rare Earth (I) Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Rare_Earth_I_Ore },
                RawOreList.Raw_Rare_Earth_I_Ore,
                CrushedOreList.Crushed_Rare_Earth_I_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Nether_Quartz_Dust, 4);
                        put(DustList.Yttrium_Dust, 1);
                        put(DustList.Rare_Earth_I_Dust, 4);
                    }
                }));

        // "Rare Earth (II) Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Rare_Earth_II_Ore },
                RawOreList.Raw_Rare_Earth_II_Ore,
                CrushedOreList.Crushed_Rare_Earth_II_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Neodymium_Dust, 1);
                        put(DustList.Rare_Earth_II_Dust, 4);
                        put(DustList.Runite_Dust, 4);
                    }
                }));

        // "Rare Earth (III) Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Rare_Earth_III_Ore },
                RawOreList.Raw_Rare_Earth_III_Ore,
                CrushedOreList.Crushed_Rare_Earth_III_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Cerium_Rich_Mixture_Dust, 8);
                        put(DustList.Erbium_Dust, 1);
                        put(DustList.Rare_Earth_III_Dust, 4);
                    }
                }));

        // "Barite (Ra) Ore"
        ore_List.add(
            new Ore_List(
                new ItemStack[] { OreList.Barite_Ra_Ore },
                RawOreList.Raw_Barite_Ra_Ore,
                CrushedOreList.Crushed_Barite_Ra_Ore,
                new HashMap<>() {
                    {
                        put(DustList.Barite_Ra_Dust, 5);
                        put(DustList.Radium_Dust, 6);
                        put(DustList.Sulfur_Dust, 2);
                    }
                }));

        // 遍历所有矿石列表
        for (Ore_List oreEntry : ore_List) {
            // 安全检查：防止oreEntry为null
            if (oreEntry == null) {
                System.err.println("【警告】检测到null的Ore_List条目，跳过处理");
                continue;
            }

            ItemStack[] oreArray = oreEntry.Ore;
            Map<ItemStack, Integer> products = oreEntry.Product;

            // 安全检查：确保矿石数组和产物映射不为空
            if (oreArray == null || oreArray.length == 0 || products == null || products.isEmpty()) {
                System.err.println("【警告】矿石条目数据不完整，跳过处理");
                continue;
            }

            // 创建输出数组
            List<ItemStack> outputList_Ore = new ArrayList<>();
            for (Map.Entry<ItemStack, Integer> entry : products.entrySet()) {
                try {
                    ItemStack out = entry.getKey()
                        .copy();
                    out.stackSize = entry.getValue() * 64;
                    outputList_Ore.add(out);
                } catch (Exception e) {
                    // 捕获单个产物复制时的异常
                    System.err.println("【错误】在处理矿石输出产物时出错！");
                    System.err.println("错误产物: " + entry.getKey());
                    System.err.println("错误详情: " + e.getMessage());
                }
            }

            List<ItemStack> outputList_RawOre = new ArrayList<>();
            for (Map.Entry<ItemStack, Integer> entry : products.entrySet()) {
                try {
                    ItemStack out = entry.getKey()
                        .copy();
                    out.stackSize = entry.getValue() * 16;
                    outputList_RawOre.add(out);
                } catch (Exception e) {
                    // 捕获单个粗矿产物复制时的异常
                    System.err.println("【错误】在处理粗矿输出产物时出错！");
                    System.err.println("错误产物: " + entry.getKey());
                    System.err.println("错误详情: " + e.getMessage());
                }
            }

            List<ItemStack> outputList_CrushedOre = new ArrayList<>();
            for (Map.Entry<ItemStack, Integer> entry : products.entrySet()) {
                try {
                    ItemStack out = entry.getKey()
                        .copy();
                    out.stackSize = entry.getValue() * 8;
                    outputList_CrushedOre.add(out);
                } catch (Exception e) {
                    // 捕获单个碎矿产物复制时的异常
                    System.err.println("【错误】在处理碎矿输出产物时出错！");
                    System.err.println("错误产物: " + entry.getKey());
                    System.err.println("错误详情: " + e.getMessage());
                }
            }

            // 为每种矿石添加配方
            for (ItemStack ore : oreArray) {
                if (ore == null) continue;

                ItemStack input = ore.copy();
                input.stackSize = 1;
                try {
                    GTValues.RA.stdBuilder()
                        .itemInputs(input)
                        .fluidInputs(
                            FluidRegistry.getFluidStack("lubricant", 4),
                            FluidRegistry.getFluidStack("ic2distilledwater", 4))
                        .itemOutputs(outputList_Ore.toArray(new ItemStack[0]))
                        .duration(SECONDS)
                        .eut(8)
                        .addTo(addFakeChaosOreRecipes);
                } catch (Exception e) {
                    // 捕获单个矿石配方添加时的异常
                    System.err.println("【错误】添加矿石配方时出错！");
                    System.err.println("错误矿石: " + ore);
                    System.err.println("错误详情: " + e.getMessage());
                }
            }

            // 添加粗矿配方
            try {
                if (oreEntry.RawOre != null) {
                    GTValues.RA.stdBuilder()
                        .itemInputs(oreEntry.RawOre)
                        .fluidInputs(
                            FluidRegistry.getFluidStack("lubricant", 2),
                            FluidRegistry.getFluidStack("ic2distilledwater", 2))
                        .itemOutputs(outputList_RawOre.toArray(new ItemStack[0]))
                        .duration(SECONDS)
                        .eut(8)
                        .addTo(addFakeChaosOreRecipes);
                } else {
                    System.err.println("【警告】粗矿ItemStack为null，跳过粗矿配方添加");
                }
            } catch (Exception e) {
                // 捕获粗矿配方添加时的异常
                System.err.println("【错误】添加粗矿配方时出错！");
                System.err.println("错误详情: " + e.getMessage());
            }

            // 添加碎矿配方
            try {
                if (oreEntry.CrushedOre != null) {
                    GTValues.RA.stdBuilder()
                        .itemInputs(oreEntry.CrushedOre)
                        .fluidInputs(
                            FluidRegistry.getFluidStack("lubricant", 1),
                            FluidRegistry.getFluidStack("ic2distilledwater", 1))
                        .itemOutputs(outputList_CrushedOre.toArray(new ItemStack[0]))
                        .duration(SECONDS)
                        .eut(8)
                        .addTo(addFakeChaosOreRecipes);
                } else {
                    System.err.println("【警告】碎矿ItemStack为null，跳过碎矿配方添加");
                }
            } catch (Exception e) {
                // 捕获碎矿配方添加时的异常
                System.err.println("【错误】添加碎矿配方时出错！");
                System.err.println("错误详情: " + e.getMessage());
            }
        }
    }
}
