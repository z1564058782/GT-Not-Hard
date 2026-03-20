package Recipes.ChaosRecipes;

import static gregtech.api.enums.Mods.AppliedEnergistics2;
import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.BiomesOPlenty;
import static gregtech.api.enums.Mods.DraconicEvolution;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.IndustrialCraft2;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.Mods.ProjectRedCore;
import static gregtech.api.enums.Mods.Railcraft;
import static gregtech.api.enums.Mods.Thaumcraft;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.OreProcessOfChaosFrontend;

public class ChaosOreRecipes {

    private static class OreList {

        ItemStack[] Ore;
        ItemStack RawOre;
        ItemStack CrushedOre;
        Map<ItemStack, Integer> Product;

        public OreList(ItemStack[] Ore, ItemStack RawOre, ItemStack CrushedOre, Map<ItemStack, Integer> Product) {
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
        .build();

    public static void addChaosOreRecipes() {
        ArrayList<OreList> Ore_List = new ArrayList<>();

        // "Bismutite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 1) },
                // "Raw Bismutite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 1),
                // "Crushed Bismutite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 1),
                new HashMap<>() {

                    {
                        // "Bismutite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 1), 6);
                        // Bismutite
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 1), 3);
                        // "Exquisite Bismutite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemExquisite", 1L, 1), 1);
                        // "Flawless Bismutite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawless", 1L, 1), 1);
                        // "Flawed Bismutite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 1), 1);
                        // "Chipped Bismutite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 1), 1);
                        // "Bismuth Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2090), 7);
                    }
                }));

        // "Bismuthinite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 2) },
                // "Raw Bismuthinite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 2),
                // "Crushed Bismuthinite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 2),
                new HashMap<>() {

                    {
                        // "Bismuthinite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 2), 6);
                        // "Bismuth Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2090), 4);
                        // "Sulfur Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2022), 4);
                    }
                }));

        // "Fluor-Buergerite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 5) },
                // "Raw Fluor-Buergerite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 5),
                // "Crushed Fluor-Buergerite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 5),
                new HashMap<>() {

                    {
                        // "Fluor-Buergerite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 5), 6);
                        // Fluor-Buergerite
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 5), 3);
                        // "Exquisite Fluor-Buergerite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemExquisite", 1L, 5), 1);
                        // "Flawless Fluor-Buergerite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawless", 1L, 5), 1);
                        // "Flawed Fluor-Buergerite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 5), 1);
                        // "Chipped Fluor-Buergerite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 5), 1);
                        // "Boron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2009), 3);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 1);
                        // "Silicon Dioxide Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2837), 1);
                        // "Sodium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2017), 3);
                    }
                }));

        // "Chromo-Alumino-Povondraite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 7) },
                // "Raw Chromo-Alumino-Povondraite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 7),
                // "Crushed Chromo-Alumino-Povondraite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 7),
                new HashMap<>() {

                    {
                        // "Chromo-Alumino-Povondraite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 7), 6);
                        // Chromo-Alumino-Povondraite
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 7), 3);
                        // "Exquisite Chromo-Alumino-Povondraite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemExquisite", 1L, 7), 1);
                        // "Flawless Chromo-Alumino-Povondraite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawless", 1L, 7), 1);
                        // "Flawed Chromo-Alumino-Povondraite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 7), 1);
                        // "Chipped Chromo-Alumino-Povondraite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 7), 1);
                        // "Boron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2009), 3);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 1);
                        // "Silicon Dioxide Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2837), 1);
                        // "Sodium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2017), 3);
                    }
                }));

        // "Vanadio-Oxy-Dravite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 8) },
                // "Raw Vanadio-Oxy-Dravite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 8),
                // "Crushed Vanadio-Oxy-Dravite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 8),
                new HashMap<>() {

                    {
                        // "Vanadio-Oxy-Dravite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 8), 6);
                        // Vanadio-Oxy-Dravite
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 8), 3);
                        // "Exquisite Vanadio-Oxy-Dravite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemExquisite", 1L, 8), 1);
                        // "Flawless Vanadio-Oxy-Dravite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawless", 1L, 8), 1);
                        // "Flawed Vanadio-Oxy-Dravite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 8), 1);
                        // "Chipped Vanadio-Oxy-Dravite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 8), 1);
                        // "Boron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2009), 3);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 1);
                        // "Silicon Dioxide Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2837), 1);
                        // "Sodium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2017), 3);
                    }
                }));

        // "Olenite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 9) },
                // "Raw Olenite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 9),
                // "Crushed Olenite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 9),
                new HashMap<>() {

                    {
                        // "Olenite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 9), 6);
                        // Olenite
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 9), 3);
                        // "Exquisite Olenite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemExquisite", 1L, 9), 1);
                        // "Flawless Olenite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawless", 1L, 9), 1);
                        // "Flawed Olenite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 9), 1);
                        // "Chipped Olenite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 9), 1);
                        // "Boron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2009), 3);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 1);
                        // "Silicon Dioxide Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2837), 1);
                        // "Sodium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2017), 3);
                    }
                }));

        // "Arsenopyrite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 10) },
                // "Raw Arsenopyrite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 10),
                // "Crushed Arsenopyrite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 10),
                new HashMap<>() {

                    {
                        // "Arsenopyrite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10), 7);
                        // "Arsenic Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2039), 3);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 2);
                        // "Sulfur Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2022), 4);
                    }
                }));

        // "Ferberite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 11) },
                // "Raw Ferberite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 11),
                // "Crushed Ferberite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 11),
                new HashMap<>() {

                    {
                        // "Ferberite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 11), 7);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 5);
                        // "Tungsten Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2081), 4);
                    }
                }));

        // "Loellingite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 12) },
                // "Raw Loellingite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 12),
                // "Crushed Loellingite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 12),
                new HashMap<>() {

                    {
                        // "Loellingite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 12), 7);
                        // "Arsenic Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2039), 4);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 5);
                    }
                }));

        // "Roquesite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 13) },
                // "Raw Roquesite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 13),
                // "Crushed Roquesite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 13),
                new HashMap<>() {

                    {
                        // "Roquesite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 13), 6);
                        // "Copper Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2035), 4);
                        // "Sulfur Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2022), 5);
                    }
                }));

        // "Bornite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 14) },
                // "Raw Bornite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 14),
                // "Crushed Bornite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 14),
                new HashMap<>() {

                    {
                        // "Bornite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 14), 7);
                        // "Copper Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2035), 4);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 5);
                        // "Sulfur Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2022), 1);
                    }
                }));

        // "Wittichenite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 15) },
                // "Raw Wittichenite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 15),
                // "Crushed Wittichenite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 15),
                new HashMap<>() {

                    {
                        // "Wittichenite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 15), 6);
                        // "Bismuth Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2090), 4);
                        // "Copper Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2035), 4);
                        // "Sulfur Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2022), 1);
                    }
                }));

        // "Djurleite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 16) },
                // "Raw Djurleite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 16),
                // "Crushed Djurleite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 16),
                new HashMap<>() {

                    {
                        // "Djurleite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 16), 6);
                        // "Copper Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2035), 8);
                        // "Sulfur Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2022), 1);
                    }
                }));

        // "Huebnerite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 17) },
                // "Raw Huebnerite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 17),
                // "Crushed Huebnerite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 17),
                new HashMap<>() {

                    {
                        // "Huebnerite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 17), 7);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 1);
                        // "Manganese Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2031), 4);
                        // "Tungsten Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2081), 4);
                    }
                }));

        // "Thorianite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 18) },
                // "Raw Thorianite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 18),
                // "Crushed Thorianite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 18),
                new HashMap<>() {

                    {
                        // "Thorianite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 18), 9);
                        // "Thorium 232 Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 30), 1);
                        // "Thorium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2096), 10);
                    }
                }));

        // "Red Zircon Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 19) },
                // "Raw Red Zircon Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 19),
                // "Crushed Thorianite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 19),
                new HashMap<>() {

                    {
                        // "Red Zircon Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 19), 6);
                        // "Zirconium Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 3), 3);
                        // "Red Zircon"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 19), 3);
                        // "Exquisite Red Zircon"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemExquisite", 1L, 19), 1);
                        // "Flawless Red Zircon"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawless", 1L, 19), 1);
                        // "Flawed Red Zircon"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 19), 1);
                        // "Chipped Red Zircon"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 19), 1);
                        // "Silicon Dioxide Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2837), 4);
                    }
                }));

        // "Fayalite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 23) },
                // "Raw Fayalite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 23),
                // "Crushed Fayalite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 23),
                new HashMap<>() {

                    {
                        // "Fayalite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 23), 7);
                        // Fayalite
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 23), 3);
                        // "Exquisite Fayalite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemExquisite", 1L, 23), 1);
                        // "Flawless Fayalite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawless", 1L, 23), 1);
                        // "Flawed Fayalite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 23), 1);
                        // "Chipped Fayalite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 23), 1);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 4);
                        // "Silicon Dioxide Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2837), 4);
                    }
                }));

        // "Forsterite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 24) },
                // "Raw Forsterite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 24),
                // "Crushed Forsterite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 24),
                new HashMap<>() {

                    {
                        // "Forsterite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 24), 6);
                        // Forsterite
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 24), 3);
                        // "Exquisite Forsterite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemExquisite", 1L, 24), 1);
                        // "Flawless Forsterite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawless", 1L, 24), 1);
                        // "Flawed Forsterite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 24), 1);
                        // "Chipped Forsterite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 24), 1);
                        // "Magnesium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2018), 3);
                        // "Silicon Dioxide Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2837), 4);
                    }
                }));

        // "Hedenbergite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 25) },
                // "Raw Hedenbergite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 25),
                // "Crushed Hedenbergite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 25),
                new HashMap<>() {

                    {
                        // "Hedenbergite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 25), 7);
                        // Hedenbergite
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 25), 3);
                        // "Exquisite Hedenbergite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemExquisite", 1L, 25), 1);
                        // "Flawless Hedenbergite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawless", 1L, 25), 1);
                        // "Flawed Hedenbergite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 25), 1);
                        // "Chipped Hedenbergite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 25), 1);
                        // "Calcium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2026), 3);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 4);
                        // "Silicon Dioxide Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2837), 1);
                    }
                }));

        // "Red Descloizite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 26) },
                // "Raw Red Descloizite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 26),
                // "Crushed Red Descloizite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 26),
                new HashMap<>() {

                    {
                        // "Red Descloizite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 26), 6);
                        // "Lead Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2089), 4);
                        // "Copper Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2035), 4);
                        // "Vanadium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2029), 1);
                    }
                }));

        // "Orange Descloizite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 27) },
                // "Raw Orange Descloizite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 27),
                // "Crushed Orange Descloizite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 27),
                new HashMap<>() {

                    {
                        // "Orange Descloizite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 27), 6);
                        // "Lead Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2089), 4);
                        // "Vanadium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2029), 1);
                        // "Zinc Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2036), 4);
                    }
                }));

        // "Green Fuchsite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 28) },
                // "Raw Green Fuchsite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 28),
                // "Crushed Green Fuchsite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 28),
                new HashMap<>() {

                    {
                        // "Green Fuchsite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 28), 6);
                        // "Alumina Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2697), 3);
                        // "Potassium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2025), 4);
                        // "Silicon Dioxide Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2837), 1);
                    }
                }));

        // "Red Fuchsite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 29) },
                // "Raw Red Fuchsite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 29),
                // "Crushed Red Fuchsite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 29),
                new HashMap<>() {

                    {
                        // "Red Fuchsite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 29), 7);
                        // "Chrome Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2030), 3);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 1);
                        // "Potassium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2025), 4);
                        // "Silicon Dioxide Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2837), 1);
                    }
                }));

        // "Prasiolite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 35) },
                // "Raw Prasiolite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 35),
                // "Crushed Prasiolite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 35),
                new HashMap<>() {

                    {
                        // "Prasiolite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 35), 13);
                        // Prasiolite
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 35), 3);
                        // "Exquisite Prasiolite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemExquisite", 1L, 35), 1);
                        // "Flawless Prasiolite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawless", 1L, 35), 1);
                        // "Flawed Prasiolite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 35), 1);
                        // "Chipped Prasiolite"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 35), 1);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 1);
                    }
                }));

        // "BArTiMaEuSNeK Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 43) },
                // "Raw BArTiMaEuSNeK Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 43),
                // "Crushed BArTiMaEuSNeK Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 43),
                new HashMap<>() {

                    {
                        // "BArTiMaEuSNeK Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 43), 6);
                        // BArTiMaEuSNeK
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 43), 3);
                        // "Exquisite BArTiMaEuSNeK"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemExquisite", 1L, 43), 1);
                        // "Flawless BArTiMaEuSNeK"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawless", 1L, 43), 1);
                        // "Flawed BArTiMaEuSNeK"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 43), 1);
                        // "Chipped BArTiMaEuSNeK"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 43), 1);
                        // "Boron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2009), 3);
                        // "Europium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2070), 1);
                        // "Titanium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2028), 3);
                    }
                }));

        // "Platinum Metallic Powder Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 47) },
                // "Raw Platinum Metallic Powder Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 47),
                // "Crushed Platinum Metallic Powder Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 47),
                new HashMap<>() {

                    {
                        // "Platinum Metallic Powder Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 47), 15);
                    }
                }));

        // "Palladium Metallic Powder Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 53) },
                // "Raw Palladium Metallic Powder Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 53),
                // "Crushed Palladium Metallic Powder Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 53),
                new HashMap<>() {

                    {
                        // "Palladium Metallic Powder Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 53), 14);
                    }
                }));

        // "Leach Residue Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 60) },
                // "Raw Leach Residue Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 60),
                // "Crushed Leach Residue Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 60),
                new HashMap<>() {

                    {
                        // "Leach Residue Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 60), 14);
                    }
                }));

        // "Rarest Metal Residue Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 69) },
                // "Raw Rarest Metal Residue Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 69),
                // "Crushed Rarest Metal Residue Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 69),
                new HashMap<>() {

                    {
                        // "Rarest Metal Residue Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 69), 14);
                    }
                }));

        // "Iridium Metal Residue Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 70) },
                // "Raw Iridium Metal Residue Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 70),
                // "Crushed Iridium Metal Residue Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 70),
                new HashMap<>() {

                    {
                        // "Iridium Metal Residue Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 70), 14);
                    }
                }));

        // "Crude Rhodium Metal Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 79) },
                // "Raw Crude Rhodium Metal Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 79),
                // "Crushed Crude Rhodium Metal Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 79),
                new HashMap<>() {

                    {
                        // "Crude Rhodium Metal Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 79), 14);
                    }
                }));

        // "Tiberium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 89) },
                // "Raw Tiberium Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 89),
                // "Crushed Tiberium Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 89),
                new HashMap<>() {

                    {
                        // "Tiberium Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 89), 13);
                        // Tiberium
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 89), 3);
                        // "Exquisite Tiberium"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemExquisite", 1L, 89), 1);
                        // "Flawless Tiberium"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawless", 1L, 89), 1);
                        // "Flawed Tiberium"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 89), 1);
                        // "Chipped Tiberium"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 89), 1);
                    }
                }));

        // "Fluorspar Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 91) },
                // "Raw Fluorspar Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 91),
                // "Crushed Fluorspar Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 91),
                new HashMap<>() {

                    {
                        // "Fluorspar Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 91), 13);
                        // Fluorspar
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 91), 3);
                        // "Exquisite Fluorspar"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemExquisite", 1L, 91), 1);
                        // "Flawless Fluorspar"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawless", 1L, 91), 1);
                        // "Flawed Fluorspar"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 91), 1);
                        // "Chipped Fluorspar"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 91), 1);
                    }
                }));

        // "Atheneite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 93) },
                // "Raw Atheneite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 93),
                // "Crushed Atheneite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 93),
                new HashMap<>() {

                    {
                        // "Atheneite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 93), 14);
                    }
                }));

        // "Temagamite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 94) },
                // "Raw Temagamite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 94),
                // "Crushed Temagamite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 94),
                new HashMap<>() {

                    {
                        // "Temagamite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 94), 14);
                    }
                }));

        // "Terlinguaite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 95) },
                // "Raw Terlinguaite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 95),
                // "Crushed Terlinguaite Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 95),
                new HashMap<>() {

                    {
                        // "Terlinguaite Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 95), 14);
                    }
                }));

        // "Orundum Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 10023) },
                // "Raw Orundum Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 10023),
                // "Crushed Orundum Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 10023),
                new HashMap<>() {

                    {
                        // "Orundum Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10023), 13);
                        // Orundum
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 10023), 3);
                        // "Exquisite Orundum"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemExquisite", 1L, 10023), 1);
                        // "Flawless Orundum"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawless", 1L, 10023), 1);
                        // "Flawed Orundum"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 10023), 1);
                        // "Chipped Orundum"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 10023), 1);
                    }
                }));

        // "Naquadah Oxide Mixture Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 10054) },
                // "Raw Naquadah Oxide Mixture Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 10054),
                // "Crushed Naquadah Oxide Mixture Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 10054),
                new HashMap<>() {

                    {
                        // "Naquadah Oxide Mixture Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10054), 14);
                    }
                }));

        // "Enriched-Naquadah Oxide Mixture Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 10067) },
                // "Raw Enriched-Naquadah Oxide Mixture Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 10067),
                // "Crushed Enriched-Naquadah Oxide Mixture Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 10067),
                new HashMap<>() {

                    {
                        // "Enriched-Naquadah Oxide Mixture Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10067), 14);
                    }
                }));

        // "Naquadria Oxide Mixture Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(BartWorks.ID, "bw.blockores.01", 1L, 10072) },
                // "Raw Naquadria Oxide Mixture Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedrawOre", 1L, 10072),
                // "Crushed Naquadria Oxide Mixture Ore"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedcrushed", 1L, 10072),
                new HashMap<>() {

                    {
                        // "Naquadria Oxide Mixture Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10072), 14);
                    }
                }));

        // "Lithium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 6),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1006),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2006),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3006),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4006),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5006),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6006) },
                // "Raw Lithium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5006),
                // "Crushed Lithium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5006),
                new HashMap<>() {

                    {
                        // "Lithium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2006), 14);
                    }
                }));

        // "Beryllium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 8),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1008),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2008),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3008),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4008),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5008),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6008) },
                // "Raw Beryllium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5008),
                // "Crushed Beryllium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5008),
                new HashMap<>() {

                    {
                        // "Beryllium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2008), 5);
                        // "Emerald Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2501), 7);
                        // Emerald
                        put(getModItem(Minecraft.ID, "emerald", 1L), 2);
                    }
                }));

        // "Magnesium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 18),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1018),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2018),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3018),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4018),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5018),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6018) },
                // "Raw Magnesium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5018),
                // "Crushed Magnesium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5018),
                new HashMap<>() {

                    {
                        // "Magnesium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2018), 5);
                        // "Olivine Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2505), 7);
                        // Olivine
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8505), 2);
                    }
                }));

        // "Aluminium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 19),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1019),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2019),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3019),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4019),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5019),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6019) },
                // "Raw Aluminium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5019),
                // "Crushed Aluminium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5019),
                new HashMap<>() {

                    {
                        // "Aluminium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2019), 5);
                        // "Bauxite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2822), 9);
                    }
                }));

        // "Raw Silicon Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 20),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1020),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2020),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3020),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4020),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5020),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6020) },
                // "Raw Raw Silicon Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5020),
                // "Crushed Raw Silicon Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5020),
                new HashMap<>() {

                    {
                        // "Raw Silicon Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2020), 5);
                        // "Silicon Dioxide Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2837), 9);
                    }
                }));

        // "Sulfur Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 22),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1022),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2022),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3022),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4022),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5022),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6022) },
                // "Raw Sulfur Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5022),
                // "Crushed Sulfur Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5022),
                new HashMap<>() {

                    {
                        // "Sulfur Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2022), 14);
                    }
                }));

        // "Scandium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 27),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1027),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2027),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3027),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4027),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5027),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6027) },
                // "Raw Scandium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5027),
                // "Crushed Scandium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5027),
                new HashMap<>() {

                    {
                        // "Scandium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2027), 14);
                    }
                }));

        // "Titanium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 28),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1028),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2028),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3028),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4028),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5028),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6028) },
                // "Raw Titanium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5028),
                // "Raw Titanium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5028),
                new HashMap<>() {

                    {
                        // "Titanium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2028), 5);
                        // "Almandine Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2820), 9);
                    }
                }));

        // "Vanadium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 29),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1029),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2029),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3029),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4029),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5029),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6029) },
                // "Raw Vanadium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5029),
                // "Crushed Vanadium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5029),
                new HashMap<>() {

                    {
                        // "Vanadium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2029), 14);
                    }
                }));

        // "Chrome Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 30),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1030),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2030),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3030),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4030),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5030),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6030) },
                // "Raw Chrome Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5030),
                // "Crushed Chrome Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5030),
                new HashMap<>() {

                    {
                        // "Chrome Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2030), 5);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 6);
                        // "Magnesium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2018), 4);
                    }
                }));

        // "Manganese Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 31),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1031),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2031),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3031),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4031),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5031),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6031) },
                // "Raw Manganese Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5031),
                // "Crushed Manganese Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5031),
                new HashMap<>() {

                    {
                        // "Manganese Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2031), 5);
                        // "Chrome Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2030), 5);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 5);
                    }
                }));

        // "Iron Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1032),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2032),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3032),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4032),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5032),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6032) },
                // "Raw Iron Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5032),
                // "Crushed Iron Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5032),
                new HashMap<>() {

                    {
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 5);
                        // "Nickel Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2034), 7);
                        // "Tin Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2057), 4);
                    }
                }));

        // "Cobalt Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 33),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1033),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2033),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3033),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4033),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5033),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6033) },
                // "Raw Cobalt Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5033),
                // "Crushed Cobalt Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5033),
                new HashMap<>() {

                    {
                        // "Cobalt Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2033), 6);
                        // "Cobaltite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2827), 9);
                    }
                }));

        // "Nickel Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 34),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1034),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2034),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3034),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4034),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5034),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6034) },
                // "Raw Nickel Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5034),
                // "Crushed Nickel Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5034),
                new HashMap<>() {

                    {
                        // "Nickel Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2034), 7);
                        // "Cobalt Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2033), 5);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 2);
                        // "Platinum Metallic Powder Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 47), 4);
                    }
                }));

        // "Copper Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 35),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1035),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2035),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3035),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4035),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5035),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6035) },
                // "Raw Copper Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5035),
                // "Crushed Copper Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5035),
                new HashMap<>() {

                    {
                        // "Copper Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2035), 6);
                        // "Nickel Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2034), 1);
                        // "Cobalt Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2033), 5);
                        // "Gold Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2086), 4);
                    }
                }));

        // "Zinc Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 36),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1036),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2036),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3036),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4036),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5036),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6036) },
                // "Raw Zinc Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5036),
                // "Crushed Zinc Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5036),
                new HashMap<>() {

                    {
                        // "Zinc Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2036), 6);
                        // "Tin Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2057), 5);
                        // "Gallium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2037), 4);
                    }
                }));

        // "Gallium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 37),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1037),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2037),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3037),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4037),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5037),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6037) },
                // "Raw Gallium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5037),
                // "Crushed Gallium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5037),
                new HashMap<>() {

                    {
                        // "Gallium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2037), 14);
                    }
                }));

        // "Arsenic Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 39),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1039),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2039),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3039),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4039),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5039),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6039) },
                // "Raw Arsenic Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5039),
                // "Crushed Arsenic Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5039),
                new HashMap<>() {

                    {
                        // "Arsenic Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2039), 14);
                    }
                }));

        // "Rubidium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 43),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1043),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2043),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3043),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4043),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5043),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6043) },
                // "Raw Rubidium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5043),
                // "Crushed Rubidium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5043),
                new HashMap<>() {

                    {
                        // "Rubidium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2043), 14);
                    }
                }));

        // "Strontium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 44),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1044),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2044),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3044),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4044),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5044),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6044) },
                // "Raw Strontium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5044),
                // "Crushed Strontium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5044),
                new HashMap<>() {

                    {
                        // "Strontium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2044), 14);
                    }
                }));

        // "Yttrium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 45),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1045),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2045),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3045),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4045),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5045),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6045) },
                // "Raw Yttrium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5045),
                // "Crushed Yttrium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5045),
                new HashMap<>() {

                    {
                        // "Yttrium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2045), 14);
                    }
                }));

        // "Niobium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 47),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1047),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2047),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3047),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4047),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5047),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6047) },
                // "Raw Niobium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5047),
                // "Crushed Niobium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5047),
                new HashMap<>() {

                    {
                        // "Niobium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2047), 14);
                    }
                }));

        // "Molybdenum Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 48),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1048),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2048),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3048),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4048),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5048),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6048) },
                // "Raw Molybdenum Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5048),
                // "Crushed Molybdenum Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5048),
                new HashMap<>() {

                    {
                        // "Molybdenum Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2048), 14);
                    }
                }));

        // "Palladium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 52),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1052),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2052),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3052),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4052),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5052),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6052) },
                // "Raw Palladium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5052),
                // "Crushed Palladium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5052),
                new HashMap<>() {

                    {
                        // "Palladium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2052), 10);
                    }
                }));

        // "Silver Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 54),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1054),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2054),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3054),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4054),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5054),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6054) },
                // "Raw Silver Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5054),
                // "Crushed Silver Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5054),
                new HashMap<>() {

                    {
                        // "Silver Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2054), 6);
                        // "Sulfur Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2022), 4);
                        // "Lead Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2089), 5);
                    }
                }));

        // "Cadmium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 55),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1055),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2055),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3055),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4055),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5055),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6055) },
                // "Raw Cadmium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5055),
                // "Crushed Cadmium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5055),
                new HashMap<>() {

                    {
                        // "Cadmium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2055), 14);
                    }
                }));

        // "Indium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 56),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1056),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2056),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3056),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4056),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5056),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6056) },
                // "Raw Indium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5056),
                // "Crushed Indium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5056),
                new HashMap<>() {

                    {
                        // "Indium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2056), 14);
                    }
                }));

        // "Tin Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 57),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1057),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2057),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3057),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4057),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5057),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6057) },
                // "Raw Tin Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5057),
                // "Crushed Tin Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5057),
                new HashMap<>() {

                    {
                        // "Tin Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2057), 7);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 6);
                        // "Zinc Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2036), 6);
                        // "Zirconium Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 3), 4);
                    }
                }));

        // "Antimony Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 58),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1058),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2058),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3058),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4058),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5058),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6058) },
                // "Raw Antimony Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5058),
                // "Crushed Antimony Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5058),
                new HashMap<>() {

                    {
                        // "Antimony Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2058), 6);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 5);
                        // "Zinc Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2036), 6);
                    }
                }));

        // "Tellurium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 59),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1059),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2059),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3059),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4059),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5059),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6059) },
                // "Raw Tellurium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5059),
                // "Crushed Tellurium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5059),
                new HashMap<>() {

                    {
                        // "Tellurium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2059), 14);
                    }
                }));

        // "Caesium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 62),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1062),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2062),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3062),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4062),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5062),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6062) },
                // "Raw Caesium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5062),
                // "Crushed Caesium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5062),
                new HashMap<>() {

                    {
                        // "Caesium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2062), 14);
                    }
                }));

        // "Barium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 63),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1063),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2063),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3063),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4063),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5063),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6063) },
                // "Raw Barium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5063),
                // "Crushed Barium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5063),
                new HashMap<>() {

                    {
                        // "Barium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2063), 14);
                    }
                }));

        // "Lanthanum Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 64),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1064),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2064),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3064),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4064),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5064),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6064) },
                // "Raw Lanthanum Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5064),
                // "Crushed Lanthanum Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5064),
                new HashMap<>() {

                    {
                        // "Lanthanum Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2064), 14);
                    }
                }));

        // "Cerium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 65),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1065),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2065),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3065),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4065),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5065),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6065) },
                // "Raw Cerium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5065),
                // "Crushed Cerium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5065),
                new HashMap<>() {

                    {
                        // "Cerium-Rich Mixture Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 11029), 32);
                    }
                }));

        // "Praseodymium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 66),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1066),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2066),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3066),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4066),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5066),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6066) },
                // "Raw Praseodymium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5066),
                // "Crushed Praseodymium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5066),
                new HashMap<>() {

                    {
                        // "Praseodymium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2066), 14);
                    }
                }));

        // "Neodymium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 67),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1067),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2067),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3067),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4067),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5067),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6067) },
                // "Raw Neodymium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5067),
                // "Crushed Neodymium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5067),
                new HashMap<>() {

                    {
                        // "Neodymium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2067), 5);
                        // "Monazite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2520), 3);
                        // "Rare Earth"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2891), 4);
                        // Monazite
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8520), 2);
                    }
                }));

        // "Promethium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 68),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1068),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2068),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3068),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4068),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5068),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6068) },
                // "Raw Promethium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5068),
                // "Crushed Promethium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5068),
                new HashMap<>() {

                    {
                        // "Promethium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2068), 14);
                    }
                }));

        // "Samarium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 69),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1069),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2069),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3069),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4069),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5069),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6069) },
                // "Raw Samarium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5069),
                // "Crushed Samarium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5069),
                new HashMap<>() {

                    {
                        // "Samarium Ore Concentrate Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 11128), 32);
                    }
                }));

        // "Europium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 70),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1070),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2070),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3070),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4070),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5070),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6070) },
                // "Raw Europium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5070),
                // "Crushed Europium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5070),
                new HashMap<>() {

                    {
                        // "Europium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2070), 14);
                    }
                }));

        // "Gadolinium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 71),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1071),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2071),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3071),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4071),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5071),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6071) },
                // "Raw Gadolinium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5071),
                // "Crushed Gadolinium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5071),
                new HashMap<>() {

                    {
                        // "Gadolinium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2071), 14);
                    }
                }));

        // "Terbium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 72),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1072),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2072),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3072),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4072),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5072),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6072) },
                // "Raw Terbium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5072),
                // "Crushed Terbium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5072),
                new HashMap<>() {

                    {
                        // "Terbium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2072), 14);
                    }
                }));

        // "Dysprosium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 73),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1073),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2073),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3073),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4073),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5073),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6073) },
                // "Raw Dysprosium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5073),
                // "Crushed Dysprosium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5073),
                new HashMap<>() {

                    {
                        // "Dysprosium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2073), 14);
                    }
                }));

        // "Holmium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 74),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1074),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2074),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3074),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4074),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5074),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6074) },
                // "Raw Holmium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5074),
                // "Crushed Holmium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5074),
                new HashMap<>() {

                    {
                        // "Holmium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2074), 14);
                    }
                }));

        // "Erbium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 75),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1075),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2075),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3075),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4075),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5075),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6075) },
                // "Raw Erbium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5075),
                // "Crushed Erbium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5075),
                new HashMap<>() {

                    {
                        // "Erbium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2075), 14);
                    }
                }));

        // "Thulium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 76),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1076),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2076),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3076),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4076),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5076),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6076) },
                // "Raw Thulium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5076),
                // "Crushed Thulium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5076),
                new HashMap<>() {

                    {
                        // "Thulium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2076), 14);
                    }
                }));

        // "Ytterbium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 77),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1077),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2077),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3077),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4077),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5077),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6077) },
                // "Raw Ytterbium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5077),
                // "Crushed Ytterbium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5077),
                new HashMap<>() {

                    {
                        // "Ytterbium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2077), 14);
                    }
                }));

        // "Lutetium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 78),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1078),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2078),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3078),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4078),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5078),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6078) },
                // "Raw Lutetium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5078),
                // "Crushed Lutetium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5078),
                new HashMap<>() {

                    {
                        // "Lutetium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2078), 14);
                    }
                }));

        // "Tantalum Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 80),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1080),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2080),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3080),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4080),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5080),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6080) },
                // "Raw Tantalum Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5080),
                // "Crushed Tantalum Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5080),
                new HashMap<>() {

                    {
                        // "Tantalum Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2080), 14);
                    }
                }));

        // "Tungsten Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 81),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1081),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2081),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3081),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4081),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5081),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6081) },
                // "Raw Tungsten Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5081),
                // "Crushed Tungsten Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5081),
                new HashMap<>() {

                    {
                        // "Tungsten Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2081), 5);
                        // "Manganese Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2031), 5);
                        // "Molybdenum Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2048), 4);
                    }
                }));

        // "Osmium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 83),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1083),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2083),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3083),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4083),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5083),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6083) },
                // "Raw Osmium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5083),
                // "Crushed Osmium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5083),
                new HashMap<>() {

                    {
                        // "Osmium Dust"
                        put(getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L), 2);
                        // "Iridium Metal Residue Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 70), 5);
                        // "Rarest Metal Residue Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 69), 4);
                    }
                }));

        // "Iridium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 84),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1084),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2084),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3084),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4084),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5084),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6084) },
                // "Raw Iridium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5084),
                // "Crushed Iridium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5084),
                new HashMap<>() {

                    {
                        // "Iridium Metal Residue Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 70), 4);
                        // "Platinum Metallic Powder Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 47), 10);
                        // "Rarest Metal Residue Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 69), 3);
                        // "Osmium Dust"
                        put(getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L), 5);
                    }
                }));

        // "Platinum Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 85),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1085),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2085),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3085),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4085),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5085),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6085) },
                // "Raw Platinum Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5085),
                // "Crushed Platinum Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5085),
                new HashMap<>() {

                    {
                        // "Iridium Metal Residue Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 70), 3);
                        // "Platinum Metallic Powder Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 47), 8);
                        // "Nickel Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2034), 5);
                    }
                }));

        // "Gold Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1086),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2086),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3086),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4086),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5086),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6086) },
                // "Raw Gold Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5086),
                // "Crushed Gold Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5086),
                new HashMap<>() {

                    {
                        // "Copper Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2035), 6);
                        // "Gold Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2086), 6);
                        // "Nickel Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2034), 4);
                    }
                }));

        // "Lead Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 89),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1089),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2089),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3089),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4089),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5089),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6089) },
                // "Raw Lead Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5089),
                // "Crushed Lead Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5089),
                new HashMap<>() {

                    {
                        // "Lead Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2089), 5);
                        // "Silver Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2054), 6);
                        // "Sulfur Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2022), 4);
                    }
                }));

        // "Bismuth Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 90),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1090),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2090),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3090),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4090),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5090),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6090) },
                // "Raw Bismuth Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5090),
                // "Crushed Bismuth Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5090),
                new HashMap<>() {

                    {
                        // "Bismuth Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2090), 14);
                    }
                }));

        // "Thorium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 96),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1096),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2096),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3096),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4096),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5096),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6096) },
                // "Raw Thorium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5096),
                // "Crushed Thorium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5096),
                new HashMap<>() {

                    {
                        // "Lead Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2089), 5);
                        // "Thorium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2096), 6);
                        // "Uranium 238 Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2098), 6);
                        // "Radium 226 Dust"
                        put(getModItem(GTPlusPlus.ID, "dustRadium226", 1L), 4);
                    }
                }));

        // "Uranium 235 Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 97),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1097),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2097),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3097),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4097),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5097),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6097) },
                // "Raw Uranium 235 Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5097),
                // "Crushed Uranium 235 Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5097),
                new HashMap<>() {

                    {
                        // "Uranium 235 Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2097), 14);
                    }
                }));

        // "Uranium 238 Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 98),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1098),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2098),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3098),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4098),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5098),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6098) },
                // "Raw Uranium 238 Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5098),
                // "Crushed Uranium 238 Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5098),
                new HashMap<>() {

                    {
                        // "Lead Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2089), 6);
                        // "Thorium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2096), 1);
                        // "Uranium 235 Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2097), 3);
                        // "Uranium 238 Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2098), 5);
                        // "Radium 226 Dust"
                        put(getModItem(GTPlusPlus.ID, "dustRadium226", 1L), 4);
                    }
                }));

        // "Plutonium 239 Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 100),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1100),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2100),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3100),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4100),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5100),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6100) },
                // "Raw Plutonium 239 Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5100),
                // "Crushed Plutonium 239 Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5100),
                new HashMap<>() {

                    {
                        // "Lead Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2089), 4);
                        // "Plutonium 239 Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2100), 5);
                        // "Uranium 238 Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2098), 5);
                    }
                }));

        // "Plutonium 241 Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 101),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1101),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2101),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3101),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4101),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5101),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6101) },
                // "Raw Plutonium 241 Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5101),
                // "Crushed Plutonium 241 Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5101),
                new HashMap<>() {

                    {
                        // "Plutonium 241 Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2101), 14);
                    }
                }));

        // "Americium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 103),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1103),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2103),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3103),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4103),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5103),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6103) },
                // "Raw Americium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5103),
                // "Crushed Americium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5103),
                new HashMap<>() {

                    {
                        // "Americium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2103), 14);
                    }
                }));

        // "Raw Tengam Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 110),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1110),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2110),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3110),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4110),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5110),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6110) },
                // "Raw Raw Tengam Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5110),
                // "Crushed Raw Tengam Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5110),
                new HashMap<>() {

                    {
                        // "Raw Tengam Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2110), 5);
                        // "Magnetic Neodymium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2356), 5);
                        // "Magnetic Samarium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2399), 4);
                    }
                }));

        // "Neutronium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 129),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1129),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2129),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3129),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4129),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5129),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6129) },
                // "Raw Neutronium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5129),
                // "Crushed Neutronium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5129),
                new HashMap<>() {

                    {
                        // "Neutronium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2129), 14);
                    }
                }));

        // "Electrum Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 303),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1303),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2303),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3303),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4303),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5303),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6303) },
                // "Raw Electrum Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5303),
                // "Crushed Electrum Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5303),
                new HashMap<>() {

                    {
                        // "Electrum Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2303), 5);
                        // "Gold Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2086), 6);
                        // "Silver Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2054), 4);
                    }
                }));

        // "Pig Iron Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 307),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1307),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2307),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3307),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4307),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5307),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6307) },
                // "Raw Pig Iron Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5307),
                // "Crushed Pig Iron Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5307),
                new HashMap<>() {

                    {
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 9);
                        // "Nickel Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2034), 1);
                        // "Tin Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2057), 1);
                    }
                }));

        // "Adamantium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 319),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1319),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2319),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3319),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4319),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5319),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6319) },
                // "Raw Adamantium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5319),
                // "Crushed Adamantium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5319),
                new HashMap<>() {

                    {
                        // "Adamantium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2319), 14);
                    }
                }));

        // "Fluxed Electrum Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 320),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1320),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2320),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3320),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4320),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5320),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6320) },
                // "Raw Fluxed Electrum Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5320),
                // "Crushed Fluxed Electrum Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5320),
                new HashMap<>() {

                    {
                        // "Fluxed Electrum Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2320), 14);
                    }
                }));

        // "Infused Gold Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 323),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1323),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2323),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3323),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4323),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5323),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6323) },
                // "Raw Infused Gold Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5323),
                // "Crushed Infused Gold Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5323),
                new HashMap<>() {

                    {
                        // "Gold Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2086), 10);
                        // "Infused Gold Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2323), 5);
                    }
                }));

        // "Naquadah Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 324),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1324),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2324),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3324),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4324),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5324),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6324) },
                // "Raw Naquadah Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5324),
                // "Crushed Naquadah Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5324),
                new HashMap<>() {

                    {
                        // "Enriched-Naquadah Oxide Mixture Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10067), 22);
                        // "Naquadah Oxide Mixture Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10054), 10);
                    }
                }));

        // "Enriched Naquadah Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 326),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1326),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2326),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3326),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4326),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5326),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6326) },
                // "Raw Enriched Naquadah Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5326),
                // "Crushed Enriched Naquadah Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5326),
                new HashMap<>() {

                    {
                        // "Enriched-Naquadah Oxide Mixture Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10067), 8);
                        // "Naquadah Oxide Mixture Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10054), 12);
                        // "Naquadria Oxide Mixture Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10072), 10);
                    }
                }));

        // "Naquadria Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 327),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1327),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2327),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3327),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4327),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5327),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6327) },
                // "Raw Naquadria Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5327),
                // "Crushed Naquadria Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5327),
                new HashMap<>() {

                    {
                        // "Naquadria Oxide Mixture Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10072), 32);
                    }
                }));

        // "Tritanium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 329),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1329),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2329),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3329),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4329),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5329),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6329) },
                // "Raw Tritanium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5329),
                // "Crushed Tritanium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5329),
                new HashMap<>() {

                    {
                        // "Tritanium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2329), 14);
                    }
                }));

        // "Mithril Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 331),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1331),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2331),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3331),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4331),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5331),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6331) },
                // "Raw Mithril Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5331),
                // "Crushed Mithril Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5331),
                new HashMap<>() {

                    {
                        // "Platinum Metallic Powder Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 47), 18);
                        // "Mithril Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2331), 6);
                    }
                }));

        // "Shadow Iron Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 336),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1336),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2336),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3336),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4336),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5336),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6336) },
                // "Raw Shadow Iron Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5336),
                // "Crushed Shadow Iron Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5336),
                new HashMap<>() {

                    {
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 9);
                        // "Shadow Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2336), 5);
                    }
                }));

        // "Meteoric Iron Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 340),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1340),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2340),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3340),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4340),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5340),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6340) },
                // "Raw Meteoric Iron Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5340),
                // "Crushed Meteoric Iron Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5340),
                new HashMap<>() {

                    {
                        // "Iridium Metal Residue Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 70), 1);
                        // "Platinum Metallic Powder Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 47), 2);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 5);
                        // "Meteoric Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2340), 5);
                        // "Nickel Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2034), 4);
                    }
                }));

        // "Deep Dark Iron Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 342),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1342),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2342),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3342),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4342),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5342),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6342) },
                // "Raw Deep Dark Iron Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5342),
                // "Crushed Deep Dark Iron Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5342),
                new HashMap<>() {

                    {
                        // "Deep Dark Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2342), 5);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 9);
                    }
                }));

        // "Firestone Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 347),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1347),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2347),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3347),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4347),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5347),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6347) },
                // "Raw Firestone Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5347),
                // "Crushed Firestone Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5347),
                new HashMap<>() {

                    {
                        // "Firestone Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2347), 12);
                        // "Raw Firestone"
                        put(getModItem(Railcraft.ID, "firestone.raw", 1L), 7);
                    }
                }));

        // "Shadow Metal Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 368),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1368),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2368),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3368),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4368),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5368),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6368) },
                // "Raw Shadow Metal Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5368),
                // "Crushed Shadow Metal Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5368),
                new HashMap<>() {

                    {
                        // "Shadow Metal Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2368), 14);
                    }
                }));

        // "Rutile Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 375),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1375),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2375),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3375),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4375),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5375),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6375) },
                // "Raw Rutile Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5375),
                // "Crushed Rutile Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5375),
                new HashMap<>() {

                    {
                        // "Rutile Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2375), 14);
                    }
                }));

        // "Ardite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 382),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1382),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2382),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3382),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4382),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5382),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6382) },
                // "Raw Ardite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5382),
                // "Crushed Ardite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5382),
                new HashMap<>() {

                    {
                        // "Ardite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2382), 14);
                    }
                }));

        // "Manyullyn Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 386),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1386),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2386),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3386),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4386),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5386),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6386) },
                // "Raw Manyullyn Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5386),
                // "Crushed Manyullyn Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5386),
                new HashMap<>() {

                    {
                        // "Manyullyn Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2386), 14);
                    }
                }));

        // "Mytryl Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 387),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1387),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2387),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3387),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4387),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5387),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6387) },
                // "Raw Mytryl Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5387),
                // "Crushed Mytryl Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5387),
                new HashMap<>() {

                    {
                        // "Samarium Ore Concentrate Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 11128), 10);
                        // "Mytryl Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2387), 5);
                        // "Zinc Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2036), 5);
                    }
                }));

        // "Black Plutonium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 388),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1388),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2388),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3388),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4388),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5388),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6388) },
                // "Raw Black Plutonium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5388),
                // "Crushed Black Plutonium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5388),
                new HashMap<>() {

                    {
                        // "Black Plutonium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2388), 14);
                    }
                }));

        // "Callisto Ice Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 389),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1389),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2389),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3389),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4389),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5389),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6389) },
                // "Raw Callisto Ice Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5389),
                // "Crushed Callisto Ice Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5389),
                new HashMap<>() {

                    {
                        // "Callisto Ice Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2389), 14);
                    }
                }));

        // "Ledox Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 390),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1390),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2390),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3390),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4390),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5390),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6390) },
                // "Raw Ledox Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5390),
                // "Crushed Ledox Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5390),
                new HashMap<>() {

                    {
                        // "Ledox Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2390), 14);
                    }
                }));

        // "Quantium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 391),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1391),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2391),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3391),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4391),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5391),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6391) },
                // "Raw Quantium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5391),
                // "Crushed Quantium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5391),
                new HashMap<>() {

                    {
                        // "Quantium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2391), 14);
                    }
                }));

        // "Duralumin Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 392),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1392),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2392),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3392),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4392),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5392),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6392) },
                // "Raw Duralumin Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5392),
                // "Crushed Duralumin Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5392),
                new HashMap<>() {

                    {
                        // "Duralumin Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2392), 14);
                    }
                }));

        // "Oriharukon Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 393),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1393),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2393),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3393),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4393),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5393),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6393) },
                // "Raw Oriharukon Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5393),
                // "Crushed Oriharukon Ore"
                getModItem(GregTech.ID, "gt.metaitem.031", 1L, 5393),
                new HashMap<>() {

                    {
                        // "Oriharukon Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2393), 14);
                    }
                }));

        // "Infinity Catalyst Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 394),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1394),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2394),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3394),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4394),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5394),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6394) },
                // "Raw Infinity Catalyst Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5394),
                // "Crushed Infinity Catalyst Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5394),
                new HashMap<>() {

                    {
                        // "Infinity Catalyst Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2394), 14);
                    }
                }));

        // "Bedrockium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 395),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1395),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2395),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3395),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4395),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5395),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6395) },
                // "Raw Bedrockium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5395),
                // "Crushed Bedrockium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5395),
                new HashMap<>() {

                    {
                        // "Bedrockium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2395), 14);
                    }
                }));

        // "Mysterious Crystal Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 398),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1398),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2398),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3398),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4398),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5398),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6398) },
                // "Raw Mysterious Crystal Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5398),
                // "Crushed Mysterious Crystal Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5398),
                new HashMap<>() {

                    {
                        // "Mysterious Crystal Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2398), 14);
                    }
                }));

        // "Alduorite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 485),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1485),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2485),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3485),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4485),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5485),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6485) },
                // "Raw Alduorite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5485),
                // "Crushed Alduorite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5485),
                new HashMap<>() {

                    {
                        // "Alduorite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2485), 14);
                    }
                }));

        // "Rubracium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 488),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1488),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2488),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3488),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4488),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5488),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6488) },
                // "Raw Rubracium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5488),
                // "Crushed Rubracium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5488),
                new HashMap<>() {

                    {
                        // "Samarium Ore Concentrate Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 11128), 18);
                        // "Rubracium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2488), 5);
                    }
                }));

        // "Vulcanite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 489),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1489),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2489),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3489),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4489),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5489),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6489) },
                // "Raw Vulcanite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5489),
                // "Crushed Vulcanite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5489),
                new HashMap<>() {

                    {
                        // "Vulcanite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2489), 14);
                    }
                }));

        // "Diamond Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 500),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1500),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2500),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3500),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4500),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5500),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6500) },
                // "Raw Diamond Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5500),
                // "Crushed Diamond Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5500),
                new HashMap<>() {

                    {
                        // Diamond
                        put(getModItem(Minecraft.ID, "diamond", 1L), 1);
                        // "Diamond Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2500), 6);
                        // "Graphite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2865), 9);
                        // "Exquisite Diamond"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30500), 1);
                        // "Flawless Diamond"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29500), 1);
                        // "Flawed Diamond"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28500), 1);
                        // "Chipped Diamond"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27500), 1);
                    }
                }));

        // "Emerald Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 501),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1501),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2501),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3501),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4501),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5501),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6501) },
                // "Raw Emerald Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5501),
                // "Crushed Emerald Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5501),
                new HashMap<>() {

                    {
                        // Emerald
                        put(getModItem(Minecraft.ID, "emerald", 1L), 1);
                        // "Alumina Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2697), 3);
                        // "Beryllium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2008), 5);
                        // "Emerald Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2501), 6);
                        // "Exquisite Emerald"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30501), 1);
                        // "Flawless Emerald"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29501), 1);
                        // "Flawed Emerald"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28501), 1);
                        // "Chipped Emerald"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27501), 1);
                    }
                }));

        // "Ruby Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 502),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1502),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2502),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3502),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4502),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5502),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6502) },
                // "Raw Ruby Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5502),
                // "Crushed Ruby Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5502),
                new HashMap<>() {

                    {
                        // "Chrome Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2030), 5);
                        // "Red Garnet Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2527), 4);
                        // "Ruby Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2502), 6);
                        // Ruby
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8502), 1);
                        // "Exquisite Ruby"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30502), 1);
                        // "Flawless Ruby"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29502), 1);
                        // "Flawed Ruby"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28502), 1);
                        // "Chipped Ruby"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27502), 1);
                    }
                }));

        // "Sapphire Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 503),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1503),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2503),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3503),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4503),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5503),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6503) },
                // "Raw Sapphire Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5503),
                // "Crushed Sapphire Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5503),
                new HashMap<>() {

                    {
                        // "Alumina Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2697), 5);
                        // "Green Sapphire Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2504), 4);
                        // "Sapphire Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2503), 6);
                        // Sapphire
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8503), 1);
                        // "Exquisite Sapphire"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30503), 1);
                        // "Flawless Sapphire"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29503), 1);
                        // "Flawed Sapphire"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28503), 1);
                        // "Chipped Sapphire"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27503), 1);
                    }
                }));

        // "Green Sapphire Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 504),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1504),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2504),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3504),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4504),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5504),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6504) },
                // "Raw Green Sapphire Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5504),
                // "Crushed Green Sapphire Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5504),
                new HashMap<>() {

                    {
                        // "Alumina Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2697), 5);
                        // "Green Sapphire Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2504), 6);
                        // "Sapphire Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2503), 4);
                        // "Green Sapphire"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8504), 1);
                        // "Exquisite Green Sapphire"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30504), 1);
                        // "Flawless Green Sapphire"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29504), 1);
                        // "Flawed Green Sapphire"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28504), 1);
                        // "Chipped Green Sapphire"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27504), 1);
                    }
                }));

        // "Olivine Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 505),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1505),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2505),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3505),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4505),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5505),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6505) },
                // "Raw Olivine Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5505),
                // "Crushed Olivine Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5505),
                new HashMap<>() {

                    {
                        // "Magnesium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2018), 4);
                        // "Olivine Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2505), 6);
                        // "Pyrope Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2835), 5);
                        // Olivine
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8505), 1);
                        // "Exquisite Olivine"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30505), 1);
                        // "Flawless Olivine"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29505), 1);
                        // "Flawed Olivine"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28505), 1);
                        // "Chipped Olivine"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27505), 1);
                    }
                }));

        // "Nether Star Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 506),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1506),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2506),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3506),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4506),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5506),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6506) },
                // "Raw Nether Star Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5506),
                // "Crushed Nether Star Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5506),
                new HashMap<>() {

                    {
                        // "Nether Star Dust"
                        put(getModItem(Minecraft.ID, "nether_star", 1L), 7);
                        // "Nether Star Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2506), 13);
                    }
                }));

        // "Topaz Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 507),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1507),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2507),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3507),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4507),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5507),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6507) },
                // "Raw Topaz Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5507),
                // "Crushed Topaz Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5507),
                new HashMap<>() {

                    {
                        // "Blue Topaz Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2513), 7);
                        // "Topaz Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2507), 6);
                        // "Blue Topaz"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8513), 2);
                        // Topaz
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8507), 1);
                        // "Exquisite Topaz"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30507), 1);
                        // "Flawless Topaz"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29507), 1);
                        // "Flawed Topaz"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28507), 1);
                        // "Chipped Topaz"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27507), 1);
                    }
                }));

        // "Tanzanite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 508),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1508),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2508),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3508),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4508),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5508),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6508) },
                // "Raw Tanzanite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5508),
                // "Crushed Tanzanite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5508),
                new HashMap<>() {

                    {
                        // "Opal Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2510), 7);
                        // "Tanzanite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2508), 6);
                        // Opal
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8510), 2);
                        // Tanzanite
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8508), 1);
                        // "Exquisite Tanzanite"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30508), 1);
                        // "Flawless Tanzanite"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29508), 1);
                        // "Flawed Tanzanite"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28508), 1);
                        // "Chipped Tanzanite"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27508), 1);
                    }
                }));

        // "Amethyst Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 509),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1509),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2509),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3509),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4509),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5509),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6509) },
                // "Raw Amethyst Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5509),
                // "Crushed Amethyst Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5509),
                new HashMap<>() {

                    {
                        // "Amethyst Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2509), 13);
                        // Amethyst
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8509), 3);
                        // "Exquisite Amethyst"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30509), 1);
                        // "Flawless Amethyst"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29509), 1);
                        // "Flawed Amethyst"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28509), 1);
                        // "Chipped Amethyst"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27509), 1);
                    }
                }));

        // "Opal Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 510),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1510),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2510),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3510),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4510),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5510),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6510) },
                // "Raw Opal Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5510),
                // "Crushed Opal Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5510),
                new HashMap<>() {

                    {
                        // "Opal Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2510), 6);
                        // "Tanzanite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2508), 7);
                        // Opal
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8510), 1);
                        // Tanzanite
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8508), 2);
                        // "Exquisite Opal"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30510), 1);
                        // "Flawless Opal"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29510), 1);
                        // "Flawed Opal"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28510), 1);
                        // "Chipped Opal"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27510), 1);
                    }
                }));

        // "Jasper Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 511),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1511),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2511),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3511),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4511),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5511),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6511) },
                // "Raw Jasper Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5511),
                // "Crushed Jasper Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5511),
                new HashMap<>() {

                    {
                        // "Jasper Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2511), 13);
                        // Jasper
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8511), 3);
                        // "Exquisite Jasper"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30511), 1);
                        // "Flawless Jasper"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29511), 1);
                        // "Flawed Jasper"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28511), 1);
                        // "Chipped Jasper"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27511), 1);
                    }
                }));

        // "Spinel Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 512),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1512),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2512),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3512),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4512),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5512),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6512) },
                // "Raw Spinel Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5512),
                // "Crushed Spinel Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5512),
                new HashMap<>() {

                    {
                        // "Jasper Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2511), 7);
                        // "Spinel Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2512), 6);
                        // Jasper
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8511), 2);
                        // Spinel
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8512), 1);
                        // "Exquisite Spinel"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30512), 1);
                        // "Flawless Spinel"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29512), 1);
                        // "Flawed Spinel"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28512), 1);
                        // "Chipped Spinel"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27512), 1);
                    }
                }));

        // "Blue Topaz Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 513),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1513),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2513),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3513),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4513),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5513),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6513) },
                // "Raw Blue Topaz Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5513),
                // "Crushed Blue Topaz Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5513),
                new HashMap<>() {

                    {
                        // "Blue Topaz Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2513), 6);
                        // "Topaz Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2507), 7);
                        // "Blue Topaz"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8513), 1);
                        // Topaz
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8507), 2);
                        // "Exquisite Blue Topaz"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30513), 1);
                        // "Flawless Blue Topaz"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29513), 1);
                        // "Flawed Blue Topaz"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28513), 1);
                        // "Chipped Blue Topaz"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27513), 1);
                    }
                }));

        // "Amber Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 514),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1514),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2514),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3514),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4514),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5514),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6514) },
                // "Raw Amber Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5514),
                // "Crushed Amber Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5514),
                new HashMap<>() {

                    {
                        // "Amber Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2514), 26);
                        // Amber
                        put(getModItem(Thaumcraft.ID, "ItemResource", 1L, 6), 6);
                        // "Exquisite Amber"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30514), 2);
                        // "Flawless Amber"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29514), 2);
                        // "Flawed Amber"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28514), 2);
                        // "Chipped Amber"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27514), 2);
                    }
                }));

        // "Dilithium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 515),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1515),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2515),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3515),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4515),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5515),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6515) },
                // "Raw Dilithium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5515),
                // "Crushed Dilithium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5515),
                new HashMap<>() {

                    {
                        // "Dilithium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2515), 13);
                        // Dilithium
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8515), 7);
                    }
                }));

        // "Certus Quartz Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 516),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1516),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2516),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3516),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4516),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5516),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6516) },
                // "Raw Certus Quartz Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5516),
                // "Crushed Certus Quartz Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5516),
                new HashMap<>() {

                    {
                        // "Barite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2904), 8);
                        // "Barium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2063), 2);
                        // "Certus Quartz"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8516), 10);
                        // "Certus Quartz Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2516), 12);
                        // Quartzite
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8523), 4);
                        // "Quartzite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2523), 6);
                    }
                }));

        // "Charged Certus Quartz Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 517),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1517),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2517),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3517),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4517),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5517),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6517) },
                // "Raw Charged Certus Quartz Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5517),
                // "Crushed Charged Certus Quartz Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5517),
                new HashMap<>() {

                    {
                        // "Charged Certus Quartz Crystal"
                        put(getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 1), 10);
                        // "Barite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2904), 2);
                        // "Certus Quartz"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8516), 4);
                        // "Certus Quartz Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2516), 6);
                        // Quartzite
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8523), 6);
                    }
                }));

        // "Forcicium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 518),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1518),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2518),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3518),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4518),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5518),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6518) },
                // "Raw Forcicium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5518),
                // "Crushed Forcicium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5518),
                new HashMap<>() {

                    {
                        // Forcicium
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8518), 5);
                        // "Forcicium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2518), 7);
                        // "Neodymium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2067), 4);
                        // "Rare Earth"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2891), 1);
                        // "Thorium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2096), 5);
                    }
                }));

        // "Forcillium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 519),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1519),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2519),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3519),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4519),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5519),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6519) },
                // "Raw Forcillium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5519),
                // "Crushed Forcillium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5519),
                new HashMap<>() {

                    {
                        // Forcillium
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8519), 5);
                        // "Forcillium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2519), 7);
                        // "Neodymium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2067), 4);
                        // "Rare Earth"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2891), 1);
                        // "Thorium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2096), 5);
                    }
                }));

        // "Monazite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 520),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1520),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2520),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3520),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4520),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5520),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6520) },
                // "Raw Monazite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5520),
                // "Crushed Monazite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5520),
                new HashMap<>() {

                    {
                        // Monazite
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8520), 40);
                        // "Monazite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2520), 56);
                        // "Neodymium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2067), 32);
                        // "Rare Earth"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2891), 8);
                        // "Thorium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2096), 40);
                    }
                }));

        // "Force Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 521),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1521),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2521),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3521),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4521),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5521),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6521) },
                // "Raw Force Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5521),
                // "Crushed Force Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5521),
                new HashMap<>() {

                    {
                        // Force
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8521), 7);
                        // "Force Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2521), 13);
                    }
                }));

        // "Nether Quartz Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 522),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1522),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2522),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3522),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4522),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5522),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6522) },
                // "Raw Nether Quartz Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5522),
                // "Crushed Nether Quartz Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5522),
                new HashMap<>() {

                    {
                        // "Nether Quartz"
                        put(getModItem(Minecraft.ID, "quartz", 1L), 10);
                        // "Nether Quartz Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2522), 12);
                        // "Netherrack Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2807), 18);
                    }
                }));

        // "Quartzite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 523),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1523),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2523),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3523),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4523),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5523),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6523) },
                // "Raw Quartzite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5523),
                // "Crushed Quartzite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5523),
                new HashMap<>() {

                    {
                        // "Barite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2904), 4);
                        // "Certus Quartz"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8516), 2);
                        // "Certus Quartz Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2516), 4);
                        // Quartzite
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8523), 5);
                        // "Quartzite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2523), 6);
                    }
                }));

        // "Lazurite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 524),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1524),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2524),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3524),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4524),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5524),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6524) },
                // "Raw Lazurite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5524),
                // "Crushed Lazurite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5524),
                new HashMap<>() {

                    {
                        // "Lapis Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2526), 24);
                        // Lazurite
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8524), 30);
                        // "Lazurite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2524), 36);
                        // Sodalite
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8525), 12);
                        // "Sodalite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2525), 18);
                    }
                }));

        // "Sodalite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 525),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1525),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2525),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3525),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4525),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5525),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6525) },
                // "Raw Sodalite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5525),
                // "Crushed Sodalite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5525),
                new HashMap<>() {

                    {
                        // "Lapis Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2526), 24);
                        // Lazurite
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8524), 12);
                        // "Lazurite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2524), 18);
                        // Sodalite
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8525), 30);
                        // "Sodalite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2525), 36);
                    }
                }));

        // "Lapis Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 526),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1526),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2526),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3526),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4526),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5526),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6526) },
                // "Raw Lapis Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5526),
                // "Crushed Lapis Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5526),
                new HashMap<>() {

                    {
                        // "Lapis Lazuli"
                        put(getModItem(Minecraft.ID, "dye", 1L, 4), 30);
                        // "Lapis Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2526), 36);
                        // Lazurite
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8524), 12);
                        // "Lazurite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2524), 18);
                        // "Pyrite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2834), 6);
                        // "Sodalite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2525), 18);
                    }
                }));

        // "Red Garnet Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 527),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1527),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2527),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3527),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4527),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5527),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6527) },
                // "Raw Red Garnet Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5527),
                // "Crushed Red Garnet Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5527),
                new HashMap<>() {

                    {
                        // "Almandine Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2820), 1);
                        // "Pyrope Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2835), 3);
                        // "Red Garnet Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2527), 6);
                        // "Spessartine Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2838), 5);
                        // "Red Garnet"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8527), 3);
                        // "Exquisite Red Garnet"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30527), 1);
                        // "Flawless Red Garnet"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29527), 1);
                        // "Flawed Red Garnet"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28527), 1);
                        // "Chipped Red Garnet"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27527), 1);
                    }
                }));

        // "Yellow Garnet Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 528),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1528),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2528),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3528),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4528),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5528),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6528) },
                // "Raw Yellow Garnet Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5528),
                // "Crushed Yellow Garnet Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5528),
                new HashMap<>() {

                    {
                        // "Andradite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2821), 5);
                        // "Grossular Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2831), 3);
                        // "Uvarovite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2842), 1);
                        // "Yellow Garnet Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2528), 6);
                        // "Yellow Garnet"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8528), 3);
                        // "Exquisite Yellow Garnet"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30528), 1);
                        // "Flawless Yellow Garnet"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29528), 1);
                        // "Flawed Yellow Garnet"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28528), 1);
                        // "Chipped Yellow Garnet"
                        put(getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27528), 1);
                    }
                }));

        // "Vinteum Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 529),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1529),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2529),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3529),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4529),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5529),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6529) },
                // "Raw Vinteum Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5529),
                // "Crushed Vinteum Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5529),
                new HashMap<>() {

                    {
                        // Vinteum
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8529), 7);
                        // "Vinteum Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2529), 13);
                    }
                }));

        // "Apatite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 530),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1530),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2530),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3530),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4530),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5530),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6530) },
                // "Raw Apatite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5530),
                // "Crushed Apatite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5530),
                new HashMap<>() {

                    {
                        // Apatite
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8530), 20);
                        // "Apatite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2530), 24);
                        // "Phosphate Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2833), 12);
                        // "Pyrochlore Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2607), 4);
                        // "Tricalcium Phosphate"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8534), 8);
                        // "Tricalcium Phosphate Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2534), 12);
                    }
                }));

        // "Niter Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 531),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1531),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2531),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3531),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4531),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5531),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6531) },
                // "Raw Niter Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5531),
                // "Crushed Niter Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5531),
                new HashMap<>() {

                    {
                        // Niter
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8531), 5);
                        // "Niter Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2531), 6);
                        // "Saltpeter Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2836), 9);
                    }
                }));

        // "Tricalcium Phosphate Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 534),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1534),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2534),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3534),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4534),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5534),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6534) },
                // "Raw Tricalcium Phosphate Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5534),
                // "Crushed Tricalcium Phosphate Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5534),
                new HashMap<>() {

                    {
                        // Apatite
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8530), 6);
                        // "Apatite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2530), 9);
                        // "Phosphate Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2833), 9);
                        // "Pyrochlore Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2607), 3);
                        // "Tricalcium Phosphate"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8534), 15);
                        // "Tricalcium Phosphate Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2534), 18);
                    }
                }));

        // "Coal Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 535),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1535),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2535),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3535),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4535),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5535),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6535) },
                // "Raw Coal Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5535),
                // "Crushed Coal Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5535),
                new HashMap<>() {

                    {
                        // Coal
                        put(getModItem(Minecraft.ID, "coal", 1L, 0), 10);
                        // "Coal Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2535), 12);
                        // "Lignite Coal"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8538), 4);
                        // "Lignite Coal Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2538), 6);
                        // "Thorium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2096), 8);
                    }
                }));

        // "Jade Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 537),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1537),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2537),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3537),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4537),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5537),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6537) },
                // "Raw Jade Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5537),
                // "Crushed Jade Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5537),
                new HashMap<>() {

                    {
                        // Jade
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8537), 7);
                        // "Jade Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2537), 12);
                    }
                }));

        // "Lignite Coal Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 538),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1538),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2538),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3538),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4538),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5538),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6538) },
                // "Raw Lignite Coal Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5538),
                // "Crushed Lignite Coal Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5538),
                new HashMap<>() {

                    {
                        // Coal
                        put(getModItem(Minecraft.ID, "coal", 1L, 0), 2);
                        // "Coal Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2535), 7);
                        // "Lignite Coal"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8538), 5);
                        // "Lignite Coal Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2538), 6);
                    }
                }));

        // "Aer Infused Stone"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 540),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1540),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2540),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3540),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4540),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5540),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6540) },
                // "Raw Aer Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5540),
                // "Crushed Aer Crystals"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5540),
                new HashMap<>() {

                    {
                        // "Aer Crystal Powder"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2540), 26);
                        // "Air Shard"
                        put(getModItem(Thaumcraft.ID, "ItemShard", 1L, 0), 14);
                    }
                }));

        // "Ignis Infused Stone"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 541),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1541),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2541),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3541),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4541),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5541),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6541) },
                // "Raw Ignis Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5541),
                // "Crushed Ignis Crystals"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5541),
                new HashMap<>() {

                    {
                        // "Ignis Crystal Powder"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2541), 26);
                        // "Fire Shard"
                        put(getModItem(Thaumcraft.ID, "ItemShard", 1L, 1), 14);
                    }
                }));

        // "Terra Infused Stone"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 542),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1542),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2542),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3542),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4542),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5542),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6542) },
                // "Raw Terra Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5542),
                // "Crushed Terra Crystals"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5542),
                new HashMap<>() {

                    {
                        // "Terra Crystal Powder"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2542), 26);
                        // "Earth Shard"
                        put(getModItem(Thaumcraft.ID, "ItemShard", 1L, 3), 14);
                    }
                }));

        // "Aqua Infused Stone"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 543),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1543),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2543),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3543),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4543),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5543),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6543) },
                // "Raw Aqua Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5543),
                // "Crushed Aqua Crystals"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5543),
                new HashMap<>() {

                    {
                        // "Aqua Crystal Powder"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2543), 26);
                        // "Water Shard"
                        put(getModItem(Thaumcraft.ID, "ItemShard", 1L, 2), 14);
                    }
                }));

        // "Perditio Infused Stone"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 544),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1544),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2544),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3544),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4544),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5544),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6544) },
                // "Raw Perditio Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5544),
                // "Crushed Perditio Crystals"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5544),
                new HashMap<>() {

                    {
                        // "Perditio Crystal Powder"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2544), 26);
                        // "Entropy Shard"
                        put(getModItem(Thaumcraft.ID, "ItemShard", 1L, 5), 14);
                    }
                }));

        // "Ordo Infused Stone"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 545),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1545),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2545),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3545),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4545),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5545),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6545) },
                // "Raw Ordo Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5545),
                // "Crushed Ordo Crystals"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5545),
                new HashMap<>() {

                    {
                        // "Ordo Crystal Powder"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2545), 26);
                        // "Order Shard"
                        put(getModItem(Thaumcraft.ID, "ItemShard", 1L, 4), 14);
                    }
                }));

        // "Roasted Iron Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 548),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1548),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2548),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3548),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4548),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5548),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6548) },
                // "Raw Roasted Iron Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5548),
                // "Crushed Roasted Iron Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5548),
                new HashMap<>() {

                    {
                        // "Roasted Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2548), 13);
                    }
                }));

        // "Roasted Nickel Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 549),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1549),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2549),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3549),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4549),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5549),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6549) },
                // "Raw Roasted Nickel Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5549),
                // "Crushed Roasted Nickel Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5549),
                new HashMap<>() {

                    {
                        // "Nickel Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2034), 10);
                        // "Roasted Nickel Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2549), 5);
                    }
                }));

        // "Pyrochlore Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 607),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1607),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2607),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3607),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4607),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5607),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6607) },
                // "Raw Pyrochlore Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5607),
                // "Crushed Pyrochlore Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5607),
                new HashMap<>() {

                    {
                        // Apatite
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8530), 2);
                        // "Apatite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2530), 3);
                        // "Calcite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2823), 3);
                        // "Niobium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2047), 1);
                        // "Pyrochlore Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2607), 5);
                    }
                }));

        // "Cryolite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 699),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1699),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2699),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3699),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4699),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5699),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6699) },
                // "Raw Cryolite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5699),
                // "Crushed Cryolite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5699),
                new HashMap<>() {

                    {
                        // "Alumina Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2697), 20);
                        // "Cryolite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2699), 20);
                        // "Sodium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2017), 16);
                    }
                }));

        // "Endium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 770),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1770),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2770),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3770),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4770),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5770),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6770) },
                // "Raw Endium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5770),
                // "Crushed Endium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5770),
                new HashMap<>() {

                    {
                        // "Endium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2770), 14);
                    }
                }));

        // "Calcium Hydride Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 797),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1797),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2797),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3797),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4797),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5797),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6797) },
                // "Raw Calcium Hydride Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5797),
                // "Crushed Calcium Hydride Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5797),
                new HashMap<>() {

                    {
                        // "Calcium Hydride Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2797), 14);
                    }
                }));

        // "Redstone Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 810),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1810),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2810),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3810),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4810),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5810),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6810) },
                // "Raw Redstone Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5810),
                // "Crushed Redstone Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5810),
                new HashMap<>() {

                    {
                        // "Glowstone Dust"
                        put(getModItem(Minecraft.ID, "glowstone_dust", 1L), 5);
                        // "Redstone Dust"
                        put(getModItem(Minecraft.ID, "redstone", 1L), 20);
                        // "Cinnabar Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2826), 25);
                        // "Rare Earth"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2891), 15);
                    }
                }));

        // "Electrotine Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 812),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1812),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2812),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3812),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4812),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5812),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6812) },
                // "Raw Electrotine Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5812),
                // "Crushed Electrotine Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5812),
                new HashMap<>() {

                    {
                        // "Redstone Dust"
                        put(getModItem(Minecraft.ID, "redstone", 1L), 25);
                        // "Diamond Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2500), 5);
                        // "Electrum Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2303), 15);
                        // Electrotine
                        put(getModItem(ProjectRedCore.ID, "projectred.core.part", 1L, 56), 25);
                    }
                }));

        // "Salt Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 817),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1817),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2817),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3817),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4817),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5817),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6817) },
                // "Raw Salt Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5817),
                // "Crushed Salt Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5817),
                new HashMap<>() {

                    {
                        // "Rock Salt"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 22), 4);
                        // Salt
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 20), 2);
                        // "Exquisite Salt"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemExquisite", 1L, 20), 2);
                        // "Flawless Salt"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawless", 1L, 20), 2);
                        // "Flawed Salt"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 20), 2);
                        // "Chipped Salt"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 20), 2);
                        // "Borax Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2941), 8);
                        // "Rock Salt"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2944), 6);
                        // Salt
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2817), 12);
                    }
                }));

        // "Almandine Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 820),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1820),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2820),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3820),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4820),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5820),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6820) },
                // "Raw Almandine Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5820),
                // "Crushed Almandine Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5820),
                new HashMap<>() {

                    {
                        // "Almandine Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2820), 5);
                        // "Alumina Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2697), 4);
                        // "Red Garnet"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8527), 2);
                        // "Red Garnet Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2527), 3);
                    }
                }));

        // "Andradite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 821),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1821),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2821),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3821),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4821),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5821),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6821) },
                // "Raw Andradite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5821),
                // "Crushed Andradite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5821),
                new HashMap<>() {

                    {
                        // "Andradite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2821), 6);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 5);
                        // "Yellow Garnet"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8528), 2);
                        // "Yellow Garnet Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2528), 3);
                    }
                }));

        // "Bauxite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 822),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1822),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2822),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3822),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4822),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5822),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6822) },
                // "Raw Bauxite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5822),
                // "Crushed Bauxite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5822),
                new HashMap<>() {

                    {
                        // "Bauxite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2822), 5);
                        // "Gallium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2037), 1);
                        // "Grossular Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2831), 5);
                        // "Rutile Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2375), 4);
                    }
                }));

        // "Calcite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 823),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1823),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2823),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3823),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4823),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5823),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6823) },
                // "Raw Calcite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5823),
                // "Crushed Calcite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5823),
                new HashMap<>() {

                    {
                        // "Andradite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2821), 5);
                        // "Calcite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2823), 5);
                        // "Malachite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2871), 4);
                    }
                }));

        // "Cassiterite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 824),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1824),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2824),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3824),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4824),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5824),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6824) },
                // "Raw Cassiterite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5824),
                // "Crushed Cassiterite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5824),
                new HashMap<>() {

                    {
                        // "Zirconium Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 3), 8);
                        // "Cassiterite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2824), 12);
                        // "Tin Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2057), 20);
                    }
                }));

        // "Chromite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 825),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1825),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2825),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3825),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4825),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5825),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6825) },
                // "Raw Chromite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5825),
                // "Crushed Chromite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5825),
                new HashMap<>() {

                    {
                        // "Chromite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2825), 6);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 6);
                        // "Magnesium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2018), 4);
                    }
                }));

        // "Cinnabar Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 826),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1826),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2826),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3826),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4826),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5826),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6826) },
                // "Raw Cinnabar Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5826),
                // "Crushed Cinnabar Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5826),
                new HashMap<>() {

                    {
                        // "Glowstone Dust"
                        put(getModItem(Minecraft.ID, "glowstone_dust", 1L), 1);
                        // "Redstone Dust"
                        put(getModItem(Minecraft.ID, "redstone", 1L), 5);
                        // "Cinnabar Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2826), 6);
                        // "Sulfur Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2022), 3);
                        // Amber
                        put(getModItem(Thaumcraft.ID, "ItemResource", 1L, 3), 8);
                    }
                }));

        // "Cobaltite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 827),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1827),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2827),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3827),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4827),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5827),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6827) },
                // "Raw Cobaltite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5827),
                // "Crushed Cobaltite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5827),
                new HashMap<>() {

                    {
                        // "Cobalt Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2033), 9);
                        // "Cobaltite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2827), 6);
                    }
                }));

        // "Sheldonite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 828),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1828),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2828),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3828),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4828),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5828),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6828) },
                // "Raw Sheldonite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5828),
                // "Crushed Sheldonite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5828),
                new HashMap<>() {

                    {
                        // "Iridium Metal Residue Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 70), 1);
                        // "Palladium Metallic Powder Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 53), 20);
                        // "Nickel Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2034), 4);
                        // "Sheldonite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2828), 6);
                    }
                }));

        // "Deep Iron Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 829),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1829),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2829),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3829),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4829),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5829),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6829) },
                // "Raw Deep Iron Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5829),
                // "Crushed Deep Iron Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5829),
                new HashMap<>() {

                    {
                        // "Deep Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2829), 5);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 4);
                        // "Trinium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2868), 5);
                    }
                }));

        // "Galena Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 830),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1830),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2830),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3830),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4830),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5830),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6830) },
                // "Raw Galena Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5830),
                // "Crushed Galena Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5830),
                new HashMap<>() {

                    {
                        // "Galena Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2830), 5);
                        // "Lead Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2089), 1);
                        // "Silver Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2054), 4);
                        // "Sulfur Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2022), 5);
                    }
                }));

        // "Grossular Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 831),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1831),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2831),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3831),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4831),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5831),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6831) },
                // "Raw Grossular Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5831),
                // "Crushed Grossular Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5831),
                new HashMap<>() {

                    {
                        // "Calcium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2026), 4);
                        // "Grossular Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2831), 5);
                        // "Yellow Garnet"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8528), 2);
                        // "Yellow Garnet Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2528), 3);
                    }
                }));

        // "Phosphate Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 833),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1833),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2833),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3833),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4833),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5833),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6833) },
                // "Raw Phosphate Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5833),
                // "Crushed Phosphate Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5833),
                new HashMap<>() {

                    {
                        // "Phosphate Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2833), 5);
                        // "Phosphate Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2021), 9);
                    }
                }));

        // "Pyrite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 834),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1834),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2834),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3834),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4834),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5834),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6834) },
                // "Raw Pyrite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5834),
                // "Crushed Pyrite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5834),
                new HashMap<>() {

                    {
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 2);
                        // "Pyrite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2834), 6);
                        // "Sulfur Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2022), 5);
                        // "Tricalcium Phosphate Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2534), 3);
                    }
                }));

        // "Pyrope Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 835),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1835),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2835),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3835),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4835),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5835),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6835) },
                // "Raw Pyrope Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5835),
                // "Crushed Pyrope Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5835),
                new HashMap<>() {

                    {
                        // "Magnesium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2018), 4);
                        // "Red Garnet"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8527), 2);
                        // "Red Garnet Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2527), 3);
                        // "Pyrope Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2835), 5);
                    }
                }));

        // "Saltpeter Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 836),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1836),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2836),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3836),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4836),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5836),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6836) },
                // "Raw Saltpeter Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5836),
                // "Crushed Saltpeter Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5836),
                new HashMap<>() {

                    {
                        // "Saltpeter Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2836), 56);
                    }
                }));

        // "Spessartine Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 838),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1838),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2838),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3838),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4838),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5838),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6838) },
                // "Raw Spessartine Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5838),
                // "Crushed Spessartine Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5838),
                new HashMap<>() {

                    {
                        // "Manganese Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2031), 4);
                        // "Red Garnet"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8527), 2);
                        // "Red Garnet Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2527), 3);
                        // "Spessartine Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2838), 5);
                    }
                }));

        // "Sphalerite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 839),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1839),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2839),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3839),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4839),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5839),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6839) },
                // "Raw Sphalerite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5839),
                // "Crushed Sphalerite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5839),
                new HashMap<>() {

                    {
                        // "Cadmium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2055), 3);
                        // "Gallium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2037), 1);
                        // "Sphalerite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2839), 5);
                        // "Yellow Garnet"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8528), 2);
                        // "Yellow Garnet Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2528), 3);
                        // "Zinc Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2036), 1);
                    }
                }));

        // "Tetrahedrite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 840),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1840),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2840),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3840),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4840),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5840),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6840) },
                // "Raw Tetrahedrite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5840),
                // "Crushed Tetrahedrite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5840),
                new HashMap<>() {

                    {
                        // "Antimony Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2058), 5);
                        // "Tetrahedrite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2840), 6);
                        // "Zinc Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2036), 4);
                    }
                }));

        // "Tungstate Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 841),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1841),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2841),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3841),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4841),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5841),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6841) },
                // "Raw Tungstate Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5841),
                // "Crushed Tungstate Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5841),
                new HashMap<>() {

                    {
                        // "Lithium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2006), 2);
                        // "Manganese Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2031), 10);
                        // "Silver Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2054), 8);
                        // "Tungstate Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2841), 10);
                    }
                }));

        // "Uvarovite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 842),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1842),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2842),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3842),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4842),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5842),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6842) },
                // "Raw Uvarovite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5842),
                // "Crushed Uvarovite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5842),
                new HashMap<>() {

                    {
                        // "Chrome Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2030), 4);
                        // "Uvarovite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2842), 5);
                        // "Yellow Garnet"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8528), 2);
                        // "Yellow Garnet Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2528), 3);
                    }
                }));

        // "Chalcopyrite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 855),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1855),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2855),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3855),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4855),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5855),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6855) },
                // "Raw Chalcopyrite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5855),
                // "Crushed Chalcopyrite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5855),
                new HashMap<>() {

                    {
                        // "Cadmium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2055), 11);
                        // "Chalcopyrite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2855), 5);
                        // "Cobalt Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2033), 4);
                        // "Gold Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2086), 1);
                        // "Pyrite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2834), 5);
                    }
                }));

        // "Silicon Solar Grade (Poly SI) Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 856),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1856),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2856),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3856),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4856),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5856),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6856) },
                // "Raw Silicon Solar Grade (Poly SI) Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5856),
                // "Crushed Silicon Solar Grade (Poly SI) Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5856),
                new HashMap<>() {

                    {
                        // "Silicon Solar Grade (Poly SI) Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2856), 14);
                    }
                }));

        // "Emery Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 861),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1861),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2861),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3861),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4861),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5861),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6861) },
                // "Raw Emery Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5861),
                // "Crushed Emery Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5861),
                new HashMap<>() {

                    {
                        // "Emery Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2861), 14);
                    }
                }));

        // "Graphite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 865),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1865),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2865),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3865),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4865),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5865),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6865) },
                // "Raw Graphite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5865),
                // "Crushed Graphite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5865),
                new HashMap<>() {

                    {
                        // "Carbon Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2865), 9);
                        // "Graphite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2865), 5);
                    }
                }));

        // "Trinium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 868),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1868),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2868),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3868),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4868),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5868),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6868) },
                // "Raw Trinium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5868),
                // "Crushed Trinium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5868),
                new HashMap<>() {

                    {
                        // "Trinium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2868), 14);
                    }
                }));

        // "Magnetite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 870),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1870),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2870),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3870),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4870),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5870),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6870) },
                // "Raw Magnetite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5870),
                // "Crushed Magnetite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5870),
                new HashMap<>() {

                    {
                        // "Gold Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2086), 6);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 5);
                        // "Magnetite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2870), 6);
                    }
                }));

        // "Malachite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 871),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1871),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2871),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3871),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4871),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5871),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6871) },
                // "Raw Malachite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5871),
                // "Crushed Malachite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5871),
                new HashMap<>() {

                    {
                        // Malachite
                        put(getModItem(BiomesOPlenty.ID, "gems", 1L, 5), 5);
                        // "Brown Limonite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2930), 3);
                        // "Calcite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2823), 1);
                        // "Copper Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2035), 6);
                        // "Malachite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2871), 6);
                    }
                }));

        // "Pitchblende"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 873),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1873),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2873),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3873),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4873),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5873),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6873),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 16873),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 17873),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 18873),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 19873),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 20873),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 21873),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 22873) },
                // "Raw Pitchblende Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5873),
                // "Ground Pitchblende"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5873),
                new HashMap<>() {

                    {
                        // "Lead Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2089), 2);
                        // "Pitchblende"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2873), 6);
                        // "Thorium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2096), 5);
                        // "Uranium 238 Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2098), 3);
                        // "Radium 226 Dust"
                        put(getModItem(GTPlusPlus.ID, "dustRadium226", 1L), 4);
                    }
                }));

        // "Soapstone Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 877),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1877),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2877),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3877),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4877),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5877),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6877) },
                // "Raw Soapstone Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5877),
                // "Crushed Soapstone Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5877),
                new HashMap<>() {

                    {
                        // "Soapstone Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2877), 14);
                    }
                }));

        // "Wulfenite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 882),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1882),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2882),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3882),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4882),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5882),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6882) },
                // "Raw Wulfenite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5882),
                // "Crushed Wulfenite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5882),
                new HashMap<>() {

                    {
                        // "Wulfenite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2882), 14);
                    }
                }));

        // "Powellite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 883),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1883),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2883),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3883),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4883),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5883),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6883) },
                // "Raw Powellite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5883),
                // "Crushed Powellite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5883),
                new HashMap<>() {

                    {
                        // "Powellite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2883), 14);
                    }
                }));

        // "Desh Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 884),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1884),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2884),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3884),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4884),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5884),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6884) },
                // "Raw Desh Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5884),
                // "Crushed Desh Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5884),
                new HashMap<>() {

                    {
                        // "Desh Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2884), 14);
                    }
                }));

        // "Cheese Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 894),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1894),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2894),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3894),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4894),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5894),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6894) },
                // "Raw Cheese Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5894),
                // "Crushed Cheese Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5894),
                new HashMap<>() {

                    {
                        // "Cheese Powder"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2894), 14);
                    }
                }));

        // "Mirabilite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 900),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1900),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2900),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3900),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4900),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5900),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6900) },
                // "Raw Mirabilite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5900),
                // "Crushed Mirabilite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5900),
                new HashMap<>() {

                    {
                        // "Mirabilite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2900), 14);
                    }
                }));

        // "Mica Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 901),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1901),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2901),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3901),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4901),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5901),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6901) },
                // "Raw Mica Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5901),
                // "Crushed Mica Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5901),
                new HashMap<>() {

                    {
                        // "Mica Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2901), 14);
                    }
                }));

        // "Talc"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 902),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1902),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2902),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3902),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4902),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5902),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6902) },
                // "Raw Talc Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5902),
                // "Ground Talc"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5902),
                new HashMap<>() {

                    {
                        // "Talc"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2902), 14);
                    }
                }));

        // "Trona Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 903),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1903),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2903),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3903),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4903),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5903),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6903) },
                // "Raw Trona Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5903),
                // "Crushed Trona Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5903),
                new HashMap<>() {

                    {
                        // "Trona Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2903), 14);
                    }
                }));

        // "Barite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 904),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1904),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2904),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3904),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4904),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5904),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6904) },
                // "Raw Barite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5904),
                // "Crushed Barite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5904),
                new HashMap<>() {

                    {
                        // "Barite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2904), 14);
                    }
                }));

        // "Bastnasite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 905),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1905),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2905),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3905),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4905),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5905),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6905) },
                // "Raw Bastnasite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5905),
                // "Crushed Bastnasite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5905),
                new HashMap<>() {

                    {
                        // "Bastnasite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2905), 6);
                        // "Neodymium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2067), 6);
                        // "Rare Earth"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2891), 4);
                    }
                }));

        // "Garnierite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 906),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1906),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2906),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3906),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4906),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5906),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6906) },
                // "Raw Garnierite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5906),
                // "Crushed Garnierite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5906),
                new HashMap<>() {

                    {
                        // "Garnierite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2906), 5);
                        // "Nickel Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2034), 10);
                    }
                }));

        // "Lepidolite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 907),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1907),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2907),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3907),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4907),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5907),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6907) },
                // "Raw Lepidolite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5907),
                // "Crushed Lepidolite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5907),
                new HashMap<>() {

                    {
                        // "Caesium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2062), 4);
                        // "Lepidolite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2907), 5);
                        // "Lithium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2006), 5);
                    }
                }));

        // "Magnesite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 908),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1908),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2908),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3908),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4908),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5908),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6908) },
                // "Raw Magnesite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5908),
                // "Crushed Magnesite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5908),
                new HashMap<>() {

                    {
                        // "Magnesite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2908), 5);
                        // "Magnesium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2018), 9);
                    }
                }));

        // "Pentlandite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 909),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1909),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2909),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3909),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4909),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5909),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6909) },
                // "Raw Pentlandite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5909),
                // "Crushed Pentlandite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5909),
                new HashMap<>() {

                    {
                        // "Cobalt Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2033), 2);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 6);
                        // "Pentlandite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2909), 6);
                        // "Sulfur Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2022), 3);
                    }
                }));

        // "Scheelite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 910),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1910),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2910),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3910),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4910),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5910),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6910) },
                // "Raw Scheelite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5910),
                // "Crushed Scheelite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5910),
                new HashMap<>() {

                    {
                        // "Calcium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2026), 1);
                        // "Manganese Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2031), 5);
                        // "Molybdenum Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2048), 3);
                        // "Scheelite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2910), 5);
                    }
                }));

        // "Alunite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 911),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1911),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2911),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3911),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4911),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5911),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6911) },
                // "Raw Alunite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5911),
                // "Crushed Alunite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5911),
                new HashMap<>() {

                    {
                        // "Alunite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2911), 14);
                    }
                }));

        // "Chrysotile Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 912),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1912),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2912),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3912),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4912),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5912),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6912) },
                // "Raw Chrysotile Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5912),
                // "Crushed Chrysotile Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5912),
                new HashMap<>() {

                    {
                        // "Asbestos Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2946), 5);
                        // "Chrysotile Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2912), 5);
                        // "Magnesium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2018), 1);
                        // "Silicon Dioxide Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2837), 3);
                    }
                }));

        // "Realgar Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 913),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1913),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2913),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3913),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4913),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5913),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6913) },
                // "Raw Realgar Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5913),
                // "Crushed Realgar Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5913),
                new HashMap<>() {

                    {
                        // "Realgar Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2913), 14);
                    }
                }));

        // "Dolomite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 914),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1914),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2914),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3914),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4914),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5914),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6914) },
                // "Raw Dolomite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5914),
                // "Crushed Dolomite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5914),
                new HashMap<>() {

                    {
                        // "Dolomite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2914), 14);
                    }
                }));

        // "Wollastonite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 915),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1915),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2915),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3915),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4915),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5915),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6915) },
                // "Raw Wollastonite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5915),
                // "Crushed Wollastonite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5915),
                new HashMap<>() {

                    {
                        // "Wollastonite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2915), 14);
                    }
                }));

        // "Zeolite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 916),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1916),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2916),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3916),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4916),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5916),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6916) },
                // "Raw Zeolite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5916),
                // "Crushed Zeolite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5916),
                new HashMap<>() {

                    {
                        // "Zeolite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2916), 14);
                    }
                }));

        // "Banded Iron Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 917),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1917),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2917),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3917),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4917),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5917),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6917) },
                // "Raw Banded Iron Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5917),
                // "Crushed Banded Iron Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5917),
                new HashMap<>() {

                    {
                        // "Banded Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2917), 15);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 1);
                    }
                }));

        // "Ilmenite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 918),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1918),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2918),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3918),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4918),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5918),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6918) },
                // "Raw Ilmenite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5918),
                // "Crushed Ilmenite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5918),
                new HashMap<>() {

                    {
                        // "Hafnium Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 11000), 2);
                        // "Zirconium Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 3), 2);
                        // "Ilmenite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2918), 6);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 7);
                        // "Rutile Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2375), 4);
                        // "Wrought Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2304), 1);
                    }
                }));

        // "Pollucite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 919),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1919),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2919),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3919),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4919),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5919),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6919) },
                // "Raw Pollucite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5919),
                // "Crushed Pollucite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5919),
                new HashMap<>() {

                    {
                        // "Alumina Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2697), 3);
                        // "Caesium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2062), 5);
                        // "Pollucite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2919), 5);
                        // "Rubidium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2043), 1);
                    }
                }));

        // "Spodumene Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 920),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1920),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2920),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3920),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4920),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5920),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6920) },
                // "Raw Spodumene Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5920),
                // "Crushed Spodumene Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5920),
                new HashMap<>() {

                    {
                        // Spodumene
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 21), 3);
                        // "Exquisite Spodumene"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemExquisite", 1L, 21), 1);
                        // "Flawless Spodumene"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawless", 1L, 21), 1);
                        // "Flawed Spodumene"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 21), 1);
                        // "Chipped Spodumene"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 21), 1);
                        // "Alumina Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2697), 5);
                        // "Lithium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2006), 4);
                        // "Spodumene Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2920), 6);
                    }
                }));

        // "Tantalite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 921),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1921),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2921),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3921),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4921),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5921),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6921) },
                // "Raw Tantalite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5921),
                // "Crushed Tantalite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5921),
                new HashMap<>() {

                    {
                        // "Manganese Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2031), 5);
                        // "Niobium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2047), 3);
                        // "Tantalite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2921), 5);
                        // "Tantalum Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2080), 2);
                    }
                }));

        // "Uraninite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 922),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1922),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2922),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3922),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4922),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5922),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6922) },
                // "Raw Uraninite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5922),
                // "Crushed Uraninite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5922),
                new HashMap<>() {

                    {
                        // "Thorium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2096), 3);
                        // "Uraninite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2922), 6);
                        // "Uranium 235 Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2097), 1);
                        // "Uranium 238 Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2098), 6);
                        // "Radium 226 Dust"
                        put(getModItem(GTPlusPlus.ID, "dustRadium226", 1L), 4);
                    }
                }));

        // "Vanadium Magnetite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 923),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1923),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2923),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3923),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4923),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5923),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6923) },
                // "Raw Vanadium Magnetite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5923),
                // "Crushed Vanadium Magnetite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5923),
                new HashMap<>() {

                    {
                        // "Gold Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2086), 1);
                        // "Magnetite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2870), 5);
                        // "Vanadium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2029), 4);
                        // "Vanadium Magnetite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2923), 6);
                    }
                }));

        // "Kyanite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 924),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1924),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2924),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3924),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4924),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5924),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6924) },
                // "Raw Kyanite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5924),
                // "Crushed Kyanite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5924),
                new HashMap<>() {

                    {
                        // "Kyanite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2924), 14);
                    }
                }));

        // "Perlite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 925),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1925),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2925),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3925),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4925),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5925),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6925) },
                // "Raw Perlite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5925),
                // "Crushed Perlite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5925),
                new HashMap<>() {

                    {
                        // "Perlite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2925), 14);
                    }
                }));

        // "Pumice Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 926),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1926),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2926),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3926),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4926),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5926),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6926) },
                // "Raw Pumice Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5926),
                // "Crushed Pumice Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5926),
                new HashMap<>() {

                    {
                        // "Pumice Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2926), 14);
                    }
                }));

        // "Bentonite"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 927),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1927),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2927),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3927),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4927),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5927),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6927) },
                // "Raw Bentonite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5927),
                // "Ground Bentonite"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5927),
                new HashMap<>() {

                    {
                        // "Alumina Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2697), 5);
                        // "Bentonite"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2927), 5);
                        // "Calcium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2026), 3);
                        // "Magnesium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2018), 1);
                    }
                }));

        // "Fullers Earth"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 928),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1928),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2928),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3928),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4928),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5928),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6928) },
                // "Raw Fullers Earth Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5928),
                // "Ground Fullers Earth"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5928),
                new HashMap<>() {

                    {
                        // "Alumina Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2697), 5);
                        // "Fullers Earth"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2928), 5);
                        // "Magnesium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2018), 1);
                        // "Silicon Dioxide Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2837), 3);
                    }
                }));

        // "Kaolinite"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 929),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1929),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2929),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3929),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4929),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5929),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6929) },
                // "Raw Kaolinite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5929),
                // "Ground Kaolinite"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5929),
                new HashMap<>() {

                    {
                        // "Kaolinite"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2929), 14);
                    }
                }));

        // "Brown Limonite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 930),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1930),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2930),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3930),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4930),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5930),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6930) },
                // "Raw Brown Limonite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5930),
                // "Crushed Brown Limonite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5930),
                new HashMap<>() {

                    {
                        // Malachite
                        put(getModItem(BiomesOPlenty.ID, "gems", 1L, 5), 2);
                        // "Brown Limonite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2930), 6);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 1);
                        // "Malachite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2871), 3);
                        // "Yellow Limonite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2931), 4);
                    }
                }));

        // "Yellow Limonite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 931),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1931),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2931),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3931),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4931),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5931),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6931) },
                // "Raw Yellow Limonite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5931),
                // "Crushed Yellow Limonite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5931),
                new HashMap<>() {

                    {
                        // "Brown Limonite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2930), 3);
                        // "Cobalt Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2033), 1);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 1);
                        // "Nickel Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2034), 6);
                        // "Yellow Limonite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2931), 6);
                    }
                }));

        // "Vermiculite"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 932),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1932),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2932),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3932),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4932),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5932),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6932) },
                // "Raw Vermiculite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5932),
                // "Ground Vermiculite"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5932),
                new HashMap<>() {

                    {
                        // "Alumina Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2697), 3);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 6);
                        // "Magnesium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2018), 1);
                        // "Vermiculite"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2932), 6);
                    }
                }));

        // "Glauconite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 933),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1933),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2933),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3933),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4933),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5933),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6933) },
                // "Raw Glauconite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5933),
                // "Crushed Glauconite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5933),
                new HashMap<>() {

                    {
                        // "Alumina Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2697), 3);
                        // "Glauconite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2933), 6);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 2);
                        // "Sodium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2017), 5);
                    }
                }));

        // "Gypsum Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 934),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1934),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2934),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3934),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4934),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5934),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6934) },
                // "Raw Gypsum Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5934),
                // "Crushed Gypsum Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5934),
                new HashMap<>() {

                    {
                        // "Gypsum Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2934), 14);
                    }
                }));

        // "Basaltic Mineral Sand"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 935),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1935),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2935),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3935),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4935),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5935),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6935) },
                // "Raw Basaltic Mineral Sand Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5935),
                // "Ground Basaltic Mineral Sand"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5935),
                new HashMap<>() {

                    {
                        // "Basalt Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2844), 5);
                        // "Basaltic Mineral Sand"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2935), 6);
                        // "Gold Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2086), 1);
                        // "Magnetite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2870), 4);
                    }
                }));

        // "Granitic Mineral Sand"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 936),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1936),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2936),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3936),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4936),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5936),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6936) },
                // "Raw Granitic Mineral Sand Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5936),
                // "Ground Granitic Mineral Sand"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5936),
                new HashMap<>() {

                    {
                        // "Black Granite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2849), 5);
                        // "Gold Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2086), 1);
                        // "Granitic Mineral Sand"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2936), 6);
                        // "Magnetite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2870), 4);
                    }
                }));

        // "Cassiterite Sand"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 937),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1937),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2937),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3937),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4937),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5937),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6937) },
                // "Raw Cassiterite Sand Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5937),
                // "Ground Cassiterite Sand"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5937),
                new HashMap<>() {

                    {
                        // "Cassiterite Sand"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2937), 10);
                        // "Tin Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2057), 18);
                    }
                }));

        // "Garnet Sand"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 938),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1938),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2938),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3938),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4938),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5938),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6938) },
                // "Raw Garnet Sand Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5938),
                // "Ground Garnet Sand"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5938),
                new HashMap<>() {

                    {
                        // "Garnet Sand"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2938), 5);
                        // "Red Garnet"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8527), 2);
                        // "Red Garnet Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2527), 3);
                        // "Yellow Garnet Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2528), 4);
                    }
                }));

        // "Quartz Sand"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 939),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1939),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2939),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3939),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4939),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5939),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6939) },
                // "Raw Quartz Sand Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5939),
                // "Ground Quartz Sand"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5939),
                new HashMap<>() {

                    {
                        // "Barite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2904), 1);
                        // "Certus Quartz"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8516), 2);
                        // "Certus Quartz Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2516), 3);
                        // "Quartz Sand"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2939), 5);
                        // "Quartzite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2523), 3);
                    }
                }));

        // "Borax Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 941),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1941),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2941),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3941),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4941),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5941),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6941) },
                // "Raw Borax Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5941),
                // "Crushed Borax Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5941),
                new HashMap<>() {

                    {
                        // "Borax Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2941), 14);
                    }
                }));

        // "Molybdenite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 942),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1942),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2942),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3942),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4942),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5942),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6942) },
                // "Raw Molybdenite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5942),
                // "Crushed Molybdenite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5942),
                new HashMap<>() {

                    {
                        // "Molybdenite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2942), 5);
                        // "Molybdenum Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2048), 9);
                    }
                }));

        // "Pyrolusite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 943),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1943),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2943),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3943),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4943),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5943),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6943) },
                // "Raw Pyrolusite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5943),
                // "Crushed Pyrolusite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5943),
                new HashMap<>() {

                    {
                        // "Manganese Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2031), 6);
                        // "Niobium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2047), 1);
                        // "Pyrolusite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2943), 5);
                        // "Tantalite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2921), 3);
                    }
                }));

        // "Rock Salt Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 944),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1944),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2944),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3944),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4944),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5944),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6944) },
                // "Raw Rock Salt Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5944),
                // "Crushed Rock Salt Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5944),
                new HashMap<>() {

                    {
                        // Salt
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 20), 4);
                        // "Rock Salt"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 22), 2);
                        // "Exquisite Rock Salt"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemExquisite", 1L, 22), 2);
                        // "Flawless Rock Salt"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawless", 1L, 22), 2);
                        // "Flawed Rock Salt"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 22), 2);
                        // "Chipped Rock Salt"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 22), 2);
                        // "Borax Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2941), 8);
                        // "Rock Salt"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2944), 12);
                        // Salt
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2817), 6);
                    }
                }));

        // "Stibnite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 945),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1945),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2945),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3945),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4945),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5945),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6945) },
                // "Raw Stibnite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5945),
                // "Crushed Stibnite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5945),
                new HashMap<>() {

                    {
                        // "Antimony Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2058), 9);
                        // "Stibnite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2945), 5);
                    }
                }));

        // "Asbestos Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 946),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1946),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2946),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3946),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4946),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5946),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6946) },
                // "Raw Asbestos Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5946),
                // "Crushed Asbestos Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5946),
                new HashMap<>() {

                    {
                        // "Asbestos Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2946), 10);
                        // "Magnesium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2018), 1);
                        // "Silicon Dioxide Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2837), 3);
                    }
                }));

        // "Diatomite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 948),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1948),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2948),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3948),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4948),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5948),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6948) },
                // "Raw Diatomite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5948),
                // "Crushed Diatomite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5948),
                new HashMap<>() {

                    {
                        // "Banded Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2917), 5);
                        // "Diatomite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2948), 5);
                        // "Sapphire Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2503), 4);
                    }
                }));

        // "Glauconite Sand"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 949),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1949),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2949),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3949),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4949),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5949),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6949) },
                // "Raw Glauconite Sand Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5949),
                // "Ground Glauconite Sand"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5949),
                new HashMap<>() {

                    {
                        // "Alumina Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2697), 3);
                        // "Glauconite Sand"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2949), 6);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 2);
                        // "Sodium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2017), 5);
                    }
                }));

        // "Vyroxeres Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 951),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1951),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2951),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3951),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4951),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5951),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6951) },
                // "Raw Vyroxeres Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5951),
                // "Crushed Vyroxeres Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5951),
                new HashMap<>() {

                    {
                        // "Vyroxeres Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2951), 14);
                    }
                }));

        // "Ceruclase Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 952),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1952),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2952),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3952),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4952),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5952),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6952) },
                // "Raw Ceruclase Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5952),
                // "Crushed Ceruclase Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5952),
                new HashMap<>() {

                    {
                        // "Ceruclase Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2952), 14);
                    }
                }));

        // "Tartarite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 956),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1956),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2956),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3956),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4956),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5956),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6956) },
                // "Raw Tartarite Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5956),
                // "Raw Tartarite Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5956),
                new HashMap<>() {

                    {
                        // "Tartarite Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2956), 14);
                    }
                }));

        // "Orichalcum Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 966),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1966),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2966),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3966),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4966),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5966),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6966) },
                // "Raw Orichalcum Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5966),
                // "Crushed Orichalcum Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5966),
                new HashMap<>() {

                    {
                        // "Orichalcum Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2966), 14);
                    }
                }));

        // "Aluminium Fluoride Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 969),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1969),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2969),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3969),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4969),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5969),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6969) },
                // "Raw Aluminium Fluoride Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5969),
                // "Crushed Aluminium Fluoride Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5969),
                new HashMap<>() {

                    {
                        // "Aluminium Fluoride Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2969), 14);
                    }
                }));

        // "Calcium Disilicide Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 971),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1971),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2971),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3971),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4971),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5971),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6971) },
                // "Raw Calcium Disilicide Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5971),
                // "Crushed Calcium Disilicide Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5971),
                new HashMap<>() {

                    {
                        // "Calcium Disilicide Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2971), 14);
                    }
                }));

        // "Draconium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 975),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1975),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2975),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3975),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4975),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5975),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6975) },
                // "Raw Draconium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5975),
                // "Crushed Draconium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5975),
                new HashMap<>() {

                    {
                        // "Draconium Dust"
                        put(getModItem(DraconicEvolution.ID, "draconiumDust", 1L), 14);
                    }
                }));

        // "Awakened Draconium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 976),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1976),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2976),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3976),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4976),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5976),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6976) },
                // "Raw Awakened Draconium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5976),
                // "Crushed Awakened Draconium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5976),
                new HashMap<>() {

                    {
                        // "Awakened Draconium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2976), 14);
                    }
                }));

        // "Ichorium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 978),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1978),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2978),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3978),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4978),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5978),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6978) },
                // "Raw Ichorium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5978),
                // "Crushed Ichorium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5978),
                new HashMap<>() {

                    {
                        // "Ichorium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2978), 14);
                    }
                }));

        // "Cosmic Neutronium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 982),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1982),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2982),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3982),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4982),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5982),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6982) },
                // "Raw Cosmic Neutronium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5982),
                // "Crushed Cosmic Neutronium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5982),
                new HashMap<>() {

                    {
                        // "Cosmic Neutronium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2982), 14);
                    }
                }));

        // "Flerovium Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GregTech.ID, "gt.blockores", 1L, 984),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 1984),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 2984),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 3984),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 4984),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 5984),
                    getModItem(GregTech.ID, "gt.blockores", 1L, 6984) },
                // "Raw Flerovium Ore"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 5984),
                // "Crushed Flerovium Ore"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 5984),
                new HashMap<>() {

                    {
                        // "Flerovium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2984), 14);
                    }
                }));

        // "Fluorite (F) Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreFluoriteF", 1L) },
                // "Raw Fluorite (F) Ore"
                getModItem(GTPlusPlus.ID, "oreRawFluoriteF", 1L),
                // "Crushed Fluorite (F) Ore"
                getModItem(GTPlusPlus.ID, "crushedFluoriteF", 1L),
                new HashMap<>() {

                    {
                        // "Fluorite (F) Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustFluoriteF", 1L), 14);
                    }
                }));

        // "Koboldite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreKoboldite", 1L) },
                // "Raw Koboldite Ore"
                getModItem(GTPlusPlus.ID, "oreRawKoboldite", 1L),
                // "Crushed Koboldite Ore"
                getModItem(GTPlusPlus.ID, "crushedKoboldite", 1L),
                new HashMap<>() {

                    {
                        // "Nickel Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2034), 4);
                        // "Thaumium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2330), 1);
                        // "Koboldite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustKoboldite", 1L), 4);
                    }
                }));

        // "Crocoite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreCrocoite", 1L) },
                // "Raw Crocoite Ore"
                getModItem(GTPlusPlus.ID, "oreRawCrocoite", 1L),
                // "Crushed Crocoite Ore"
                getModItem(GTPlusPlus.ID, "crushedCrocoite", 1L),
                new HashMap<>() {

                    {
                        // "Chrome Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2030), 1);
                        // "Lead Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2089), 4);
                        // "Crocoite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustCrocoite", 1L), 4);
                    }
                }));

        // "Geikielite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreGeikielite", 1L) },
                // "Raw Geikielite Ore"
                getModItem(GTPlusPlus.ID, "oreRawGeikielite", 1L),
                // "Crushed Geikielite Ore"
                getModItem(GTPlusPlus.ID, "crushedGeikielite", 1L),
                new HashMap<>() {

                    {
                        // "Magnesium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2018), 4);
                        // "Titanium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2028), 1);
                        // "Geikielite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustGeikielite", 1L), 4);
                    }
                }));

        // "Nichromite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreNichromite", 1L) },
                // "Raw Nichromite Ore"
                getModItem(GTPlusPlus.ID, "oreRawNichromite", 1L),
                // "Crushed Nichromite Ore"
                getModItem(GTPlusPlus.ID, "crushedNichromite", 1L),
                new HashMap<>() {

                    {
                        // "Cobalt Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2033), 1);
                        // "Nickel Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2034), 4);
                        // "Nichromite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustNichromite", 1L), 4);
                    }
                }));

        // "Titanite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreTitanite", 1L) },
                // "Raw Titanite Ore"
                getModItem(GTPlusPlus.ID, "oreRawTitanite", 1L),
                // "Crushed Titanite Ore"
                getModItem(GTPlusPlus.ID, "crushedTitanite", 1L),
                new HashMap<>() {

                    {
                        // "Calcium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2026), 4);
                        // "Titanium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2028), 1);
                        // "Titanite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustTitanite", 1L), 4);
                    }
                }));

        // "Zimbabweite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreZimbabweite", 1L) },
                // "Raw Zimbabweite Ore"
                getModItem(GTPlusPlus.ID, "oreRawZimbabweite", 1L),
                // "Crushed Zimbabweite Ore"
                getModItem(GTPlusPlus.ID, "crushedZimbabweite", 1L),
                new HashMap<>() {

                    {
                        // "Calcium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2026), 4);
                        // "Lead Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2089), 1);
                        // "Zimbabweite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustZimbabweite", 1L), 4);
                    }
                }));

        // "Zirconolite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreZirconolite", 1L) },
                // "Raw Zirconolite Ore"
                getModItem(GTPlusPlus.ID, "oreRawZirconolite", 1L),
                // "Crushed Zirconolite Ore"
                getModItem(GTPlusPlus.ID, "crushedZirconolite", 1L),
                new HashMap<>() {

                    {
                        // "Zirconium Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 3), 1);
                        // "Calcium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2026), 4);
                        // "Zirconolite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustZirconolite", 1L), 4);
                    }
                }));

        // "Gadolinite (Ce) Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreGadoliniteCe", 1L) },
                // "Raw Gadolinite (Ce) Ore"
                getModItem(GTPlusPlus.ID, "oreRawGadoliniteCe", 1L),
                // "Crushed Gadolinite (Ce) Ore"
                getModItem(GTPlusPlus.ID, "crushedGadoliniteCe", 1L),
                new HashMap<>() {

                    {
                        // "Cerium-Rich Mixture Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 11029), 8);
                        // "Erbium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2075), 1);
                        // "Gadolinite (Ce) Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustGadoliniteCe", 1L), 4);
                    }
                }));

        // "Gadolinite (Y) Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreGadoliniteY", 1L) },
                // "Raw Gadolinite (Y) Ore"
                getModItem(GTPlusPlus.ID, "oreRawGadoliniteY", 1L),
                // "Crushed Gadolinite (Y) Ore"
                getModItem(GTPlusPlus.ID, "crushedGadoliniteY", 1L),
                new HashMap<>() {

                    {
                        // "Cerium-Rich Mixture Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 11029), 8);
                        // "Erbium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2075), 1);
                        // "Gadolinite (Y) Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustGadoliniteY", 1L), 4);
                    }
                }));

        // "Lepersonnite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreLepersonnite", 1L) },
                // "Raw Lepersonnite Ore"
                getModItem(GTPlusPlus.ID, "oreRawLepersonnite", 1L),
                // "Crushed Lepersonnite Ore"
                getModItem(GTPlusPlus.ID, "crushedLepersonnite", 1L),
                new HashMap<>() {

                    {
                        // "Calcium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2026), 4);
                        // "Ytterbium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2077), 1);
                        // "Lepersonnite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustLepersonnite", 1L), 4);
                    }
                }));

        // "Samarskite (Y) Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreSamarskiteY", 1L) },
                // "Raw Samarskite (Y) Ore"
                getModItem(GTPlusPlus.ID, "oreRawSamarskiteY", 1L),
                // "Crushed Samarskite (Y) Ore"
                getModItem(GTPlusPlus.ID, "crushedSamarskiteY", 1L),
                new HashMap<>() {

                    {
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 1);
                        // "Yttrium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2045), 4);
                        // "Samarskite (Y) Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustSamarskiteY", 1L), 4);
                    }
                }));

        // "Samarskite (Yb) Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreSamarskiteYb", 1L) },
                // "Raw Samarskite (Yb) Ore"
                getModItem(GTPlusPlus.ID, "oreRawSamarskiteYb", 1L),
                // "Crushed Samarskite (Yb) Ore"
                getModItem(GTPlusPlus.ID, "crushedSamarskiteYb", 1L),
                new HashMap<>() {

                    {
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 1);
                        // "Ytterbium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2077), 4);
                        // "Samarskite (Yb) Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustSamarskiteYb", 1L), 4);
                    }
                }));

        // "Xenotime Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreXenotime", 1L) },
                // "Raw Xenotime Ore"
                getModItem(GTPlusPlus.ID, "oreRawXenotime", 1L),
                // "Crushed Xenotime Ore"
                getModItem(GTPlusPlus.ID, "crushedXenotime", 1L),
                new HashMap<>() {

                    {
                        // "Ytterbium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2077), 1);
                        // "Yttrium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2045), 4);
                        // "Xenotime Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustXenotime", 1L), 4);
                    }
                }));

        // "Yttriaite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreYttriaite", 1L) },
                // "Raw Yttriaite Ore"
                getModItem(GTPlusPlus.ID, "oreRawYttriaite", 1L),
                // "Crushed Yttriaite Ore"
                getModItem(GTPlusPlus.ID, "crushedYttriaite", 1L),
                new HashMap<>() {

                    {
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 1);
                        // "Yttrium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2045), 4);
                        // "Yttriaite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustYttriaite", 1L), 4);
                    }
                }));

        // "Yttrialite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreYttrialite", 1L) },
                // "Raw Yttrialite Ore"
                getModItem(GTPlusPlus.ID, "oreRawYttrialite", 1L),
                // "Crushed Yttrialite Ore"
                getModItem(GTPlusPlus.ID, "crushedYttrialite", 1L),
                new HashMap<>() {

                    {
                        // "Thorium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2096), 1);
                        // "Yttrium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2045), 4);
                        // "Yttrialite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustYttrialite", 1L), 4);
                    }
                }));

        // "Yttrocerite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreYttrocerite", 1L) },
                // "Raw Yttrocerite Ore"
                getModItem(GTPlusPlus.ID, "oreRawYttrocerite", 1L),
                // "Crushed Yttrocerite Ore"
                getModItem(GTPlusPlus.ID, "crushedYttrocerite", 1L),
                new HashMap<>() {

                    {
                        // "Cerium-Rich Mixture Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 11029), 8);
                        // "Calcium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2026), 1);
                        // "Yttrocerite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustYttrocerite", 1L), 4);
                    }
                }));

        // "Zircon Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreZircon", 1L) },
                // "Raw Zircon Ore"
                getModItem(GTPlusPlus.ID, "oreRawZircon", 1L),
                // "Crushed Zircon Ore"
                getModItem(GTPlusPlus.ID, "crushedZircon", 1L),
                new HashMap<>() {

                    {
                        // "Zirconium Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 3), 4);
                        // "Raw Silicon Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2020), 1);
                        // "Zircon Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustZircon", 1L), 4);
                    }
                }));

        // "Polycrase Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "orePolycrase", 1L) },
                // "Raw Polycrase Ore"
                getModItem(GTPlusPlus.ID, "oreRawPolycrase", 1L),
                // "Crushed Polycrase Ore"
                getModItem(GTPlusPlus.ID, "crushedPolycrase", 1L),
                new HashMap<>() {

                    {
                        // "Calcium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2026), 1);
                        // "Yttrium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2045), 4);
                        // "Polycrase Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustPolycrase", 1L), 4);
                    }
                }));

        // "Zircophyllite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreZircophyllite", 1L) },
                // "Raw Zircophyllite Ore"
                getModItem(GTPlusPlus.ID, "oreRawZircophyllite", 1L),
                // "Crushed Zircophyllite Ore"
                getModItem(GTPlusPlus.ID, "crushedZircophyllite", 1L),
                new HashMap<>() {

                    {
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 1);
                        // "Manganese Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2031), 4);
                        // "Zircophyllite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustZircophyllite", 1L), 4);
                    }
                }));

        // "Zirkelite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreZirkelite", 1L) },
                // "Raw Zirkelite Ore"
                getModItem(GTPlusPlus.ID, "oreRawZirkelite", 1L),
                // "Crushed Zirkelite Ore"
                getModItem(GTPlusPlus.ID, "crushedZirkelite", 1L),
                new HashMap<>() {

                    {
                        // "Calcium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2026), 4);
                        // "Thorium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2096), 1);
                        // "Zirkelite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustZirkelite", 1L), 4);
                    }
                }));

        // "Lanthanite (La) Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreLanthaniteLa", 1L) },
                // "Raw Lanthanite (La) Ore"
                getModItem(GTPlusPlus.ID, "oreRawLanthaniteLa", 1L),
                // "Crushed Lanthanite (La) Ore"
                getModItem(GTPlusPlus.ID, "crushedLanthaniteLa", 1L),
                new HashMap<>() {

                    {
                        // "Calcium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2026), 1);
                        // "Lanthanum Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2064), 4);
                        // "Lanthanite (La) Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustLanthaniteLa", 1L), 4);
                    }
                }));

        // "Lanthanite (Ce) Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreLanthaniteCe", 1L) },
                // "Raw Lanthanite (Ce) Ore"
                getModItem(GTPlusPlus.ID, "oreRawLanthaniteCe", 1L),
                // "Crushed Lanthanite (Ce) Ore"
                getModItem(GTPlusPlus.ID, "crushedLanthaniteCe", 1L),
                new HashMap<>() {

                    {
                        // "Cerium-Rich Mixture Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 11029), 8);
                        // "Calcium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2026), 1);
                        // "Lanthanite (Ce) Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustLanthaniteCe", 1L), 4);
                    }
                }));

        // "Lanthanite (Nd) Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreLanthaniteNd", 1L) },
                // "Raw Lanthanite (Nd) Ore"
                getModItem(GTPlusPlus.ID, "oreRawLanthaniteNd", 1L),
                // "Crushed Lanthanite (Nd) Ore"
                getModItem(GTPlusPlus.ID, "crushedLanthaniteNd", 1L),
                new HashMap<>() {

                    {
                        // "Calcium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2026), 1);
                        // "Neodymium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2067), 4);
                        // "Lanthanite (Nd) Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustLanthaniteNd", 1L), 4);
                    }
                }));

        // "Agardite (Y) Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreAgarditeY", 1L) },
                // "Raw Agardite (Y) Ore"
                getModItem(GTPlusPlus.ID, "oreRawAgarditeY", 1L),
                // "Crushed Agardite (Y) Ore"
                getModItem(GTPlusPlus.ID, "crushedAgarditeY", 1L),
                new HashMap<>() {

                    {
                        // "Calcium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2026), 1);
                        // "Yttrium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2045), 4);
                        // "Agardite (Y) Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustAgarditeY", 1L), 4);
                    }
                }));

        // "Agardite (Cd) Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreAgarditeCd", 1L) },
                // "Raw Agardite (Cd) Ore"
                getModItem(GTPlusPlus.ID, "oreRawAgarditeCd", 1L),
                // "Crushed Agardite (Cd) Ore"
                getModItem(GTPlusPlus.ID, "crushedAgarditeCd", 1L),
                new HashMap<>() {

                    {
                        // "Calcium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2026), 4);
                        // "Copper Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2035), 1);
                        // "Agardite (Cd) Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustAgarditeCd", 1L), 4);
                    }
                }));

        // "Agardite (La) Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreAgarditeLa", 1L) },
                // "Raw Agardite (La) Ore"
                getModItem(GTPlusPlus.ID, "oreRawAgarditeLa", 1L),
                // "Agardite (La) Ore"
                getModItem(GTPlusPlus.ID, "crushedAgarditeLa", 1L),
                new HashMap<>() {

                    {
                        // "Calcium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2026), 1);
                        // "Lanthanum Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2064), 4);
                        // "Agardite (La) Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustAgarditeLa", 1L), 4);
                    }
                }));

        // "Agardite (Nd) Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreAgarditeNd", 1L) },
                // "Raw Agardite (Nd) Ore"
                getModItem(GTPlusPlus.ID, "oreRawAgarditeNd", 1L),
                // "Crushed Agardite (Nd) Ore"
                getModItem(GTPlusPlus.ID, "crushedAgarditeNd", 1L),
                new HashMap<>() {

                    {
                        // "Calcium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2026), 1);
                        // "Neodymium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2067), 4);
                        // "Agardite (Nd) Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustAgarditeNd", 1L), 4);
                    }
                }));

        // "Hibonite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreHibonite", 1L) },
                // "Raw Hibonite Ore"
                getModItem(GTPlusPlus.ID, "oreRawHibonite", 1L),
                // "Crushed Hibonite Ore"
                getModItem(GTPlusPlus.ID, "crushedHibonite", 1L),
                new HashMap<>() {

                    {
                        // "Cerium-Rich Mixture Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 11029), 2);
                        // "Calcium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2026), 4);
                        // "Hibonite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustHibonite", 1L), 4);
                    }
                }));

        // "Cerite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreCerite", 1L) },
                // "Raw Cerite Ore"
                getModItem(GTPlusPlus.ID, "oreRawCerite", 1L),
                // "Crushed Cerite Ore"
                getModItem(GTPlusPlus.ID, "crushedCerite", 1L),
                new HashMap<>() {

                    {
                        // "Cerium-Rich Mixture Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 11029), 8);
                        // "Lanthanum Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2064), 1);
                        // "Cerite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustCerite", 1L), 4);
                    }
                }));

        // "Fluorcaphite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreFluorcaphite", 1L) },
                // "Raw Fluorcaphite Ore"
                getModItem(GTPlusPlus.ID, "oreRawFluorcaphite", 1L),
                // "Crushed Fluorcaphite Ore"
                getModItem(GTPlusPlus.ID, "crushedFluorcaphite", 1L),
                new HashMap<>() {

                    {
                        // "Cerium-Rich Mixture Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 11029), 2);
                        // "Calcium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2026), 4);
                        // "Fluorcaphite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustFluorcaphite", 1L), 4);
                    }
                }));

        // "Florencite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreFlorencite", 1L) },
                // "Raw Florencite Ore"
                getModItem(GTPlusPlus.ID, "oreRawFlorencite", 1L),
                // "Crushed Florencite Ore"
                getModItem(GTPlusPlus.ID, "crushedFlorencite", 1L),
                new HashMap<>() {

                    {
                        // "Samarium Ore Concentrate Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 11128), 8);
                        // "Aluminium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2019), 1);
                        // "Florencite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustFlorencite", 1L), 4);
                    }
                }));

        // "Cryolite (F) Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreCryoliteF", 1L) },
                // "Raw Cryolite (F) Ore"
                getModItem(GTPlusPlus.ID, "oreRawCryoliteF", 1L),
                // "Crushed Cryolite (F) Ore"
                getModItem(GTPlusPlus.ID, "crushedCryoliteF", 1L),
                new HashMap<>() {

                    {
                        // "Aluminium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2019), 1);
                        // "Cryolite (F) Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustCryoliteF", 1L), 4);
                    }
                }));

        // "Lautarite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreLautarite", 1L) },
                // "Raw Lautarite Ore"
                getModItem(GTPlusPlus.ID, "oreRawLautarite", 1L),
                // "Crushed Lautarite Ore"
                getModItem(GTPlusPlus.ID, "crushedLautarite", 1L),
                new HashMap<>() {

                    {
                        // "Iodine Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 11012), 1);
                        // "Calcium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2026), 4);
                        // "Lautarite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustLautarite", 1L), 4);
                    }
                }));

        // "Lafossaite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreLafossaite", 1L) },
                // "Raw Lafossaite Ore"
                getModItem(GTPlusPlus.ID, "oreRawLafossaite", 1L),
                // "Crushed Lafossaite Ore"
                getModItem(GTPlusPlus.ID, "crushedLafossaite", 1L),
                new HashMap<>() {

                    {
                        // "Lafossaite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustLafossaite", 1L), 4);
                        // "Thallium Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustThallium", 1L), 1);
                    }
                }));

        // "Demicheleite (Br) Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreDemicheleiteBr", 1L) },
                // "Raw Demicheleite (Br) Ore"
                getModItem(GTPlusPlus.ID, "oreRawDemicheleiteBr", 1L),
                // "Crushed Demicheleite (Br) Ore"
                getModItem(GTPlusPlus.ID, "crushedDemicheleiteBr", 1L),
                new HashMap<>() {

                    {
                        // "Bismuth Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2090), 4);
                        // "Demicheleite (Br) Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustDemicheleiteBr", 1L), 4);
                    }
                }));

        // "Comancheite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreComancheite", 1L) },
                // "Raw Comancheite Ore"
                getModItem(GTPlusPlus.ID, "oreRawComancheite", 1L),
                // "Crushed Comancheite Ore"
                getModItem(GTPlusPlus.ID, "crushedComancheite", 1L),
                new HashMap<>() {

                    {
                        // "Comancheite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustComancheite", 1L), 4);
                    }
                }));

        // "Perroudite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "orePerroudite", 1L) },
                // "Raw Perroudite Ore"
                getModItem(GTPlusPlus.ID, "oreRawPerroudite", 1L),
                // "Crushed Perroudite Ore"
                getModItem(GTPlusPlus.ID, "crushedPerroudite", 1L),
                new HashMap<>() {

                    {
                        // "Iodine Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 11012), 1);
                        // "Silver Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2054), 4);
                        // "Perroudite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustPerroudite", 1L), 4);
                    }
                }));

        // "Honeaite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreHoneaite", 1L) },
                // "Raw Honeaite Ore"
                getModItem(GTPlusPlus.ID, "oreRawHoneaite", 1L),
                // "Crushed Honeaite Ore"
                getModItem(GTPlusPlus.ID, "crushedHoneaite", 1L),
                new HashMap<>() {

                    {
                        // "Gold Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2086), 4);
                        // "Honeaite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustHoneaite", 1L), 4);
                        // "Thallium Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustThallium", 1L), 1);
                    }
                }));

        // "Alburnite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreAlburnite", 1L) },
                // "Raw Alburnite Ore"
                getModItem(GTPlusPlus.ID, "oreRawAlburnite", 1L),
                // "Crushed Alburnite Ore"
                getModItem(GTPlusPlus.ID, "crushedAlburnite", 1L),
                new HashMap<>() {

                    {
                        // "Gold Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2086), 4);
                        // "Alburnite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustAlburnite", 1L), 4);
                        // "Germanium Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustGermanium", 1L), 1);
                    }
                }));

        // "Miessiite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreMiessiite", 1L) },
                // "Raw Miessiite Ore"
                getModItem(GTPlusPlus.ID, "oreRawMiessiite", 1L),
                // "Crushed Miessiite Ore"
                getModItem(GTPlusPlus.ID, "crushedMiessiite", 1L),
                new HashMap<>() {

                    {
                        // "Palladium Metallic Powder Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 53), 16);
                        // "Tellurium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2059), 1);
                        // "Miessiite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustMiessiite", 1L), 4);
                    }
                }));

        // "Kashinite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreKashinite", 1L) },
                // "Raw Kashinite Ore"
                getModItem(GTPlusPlus.ID, "oreRawKashinite", 1L),
                // "Crushed Kashinite Ore"
                getModItem(GTPlusPlus.ID, "crushedKashinite", 1L),
                new HashMap<>() {

                    {
                        // "Crude Rhodium Metal Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 79), 2);
                        // "Iridium Metal Residue Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 70), 4);
                        // "Kashinite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustKashinite", 1L), 4);
                    }
                }));

        // "Irarsite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreIrarsite", 1L) },
                // "Raw Irarsite Ore"
                getModItem(GTPlusPlus.ID, "oreRawIrarsite", 1L),
                // "Crushed Irarsite Ore"
                getModItem(GTPlusPlus.ID, "crushedIrarsite", 1L),
                new HashMap<>() {

                    {
                        // "Iridium Metal Residue Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 70), 4);
                        // "Leach Residue Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 60), 2);
                        // "Irarsite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustIrarsite", 1L), 4);
                    }
                }));

        // "Greenockite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreGreenockite", 1L) },
                // "Raw Greenockite Ore"
                getModItem(GTPlusPlus.ID, "oreRawGreenockite", 1L),
                // "Crushed Greenockite Ore"
                getModItem(GTPlusPlus.ID, "crushedGreenockite", 1L),
                new HashMap<>() {

                    {
                        // "Greenockite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustGreenockite", 1L), 4);
                    }
                }));

        // "Strange Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreRadioactiveMineralMix", 1L) },
                // "Raw Strange Ore"
                getModItem(GTPlusPlus.ID, "oreRawRadioactiveMineralMix", 1L),
                // "Crushed Strange Ore"
                getModItem(GTPlusPlus.ID, "crushedRadioactiveMineralMix", 1L),
                new HashMap<>() {

                    {
                        // "Uranium 235 Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2097), 1);
                        // "Radioactive Mineral Mix Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustRadioactiveMineralMix", 1L), 4);
                        // "Radium Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustRadium", 1L), 4);
                    }
                }));

        // "Ancient Granite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreAncientGranite", 1L) },
                // "Raw Ancient Granite Ore"
                getModItem(GTPlusPlus.ID, "oreRawAncientGranite", 1L),
                // "Crushed Ancient Granite Ore"
                getModItem(GTPlusPlus.ID, "crushedAncientGranite", 1L),
                new HashMap<>() {

                    {
                        // "Calcium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2026), 1);
                        // "Iron Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032), 4);
                        // "Ancient Granite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustAncientGranite", 1L), 4);
                    }
                }));

        // "Runite Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreRunite", 1L) },
                // "Raw Runite Ore"
                getModItem(GTPlusPlus.ID, "oreRawRunite", 1L),
                // "Crushed Runite Ore"
                getModItem(GTPlusPlus.ID, "crushedRunite", 1L),
                new HashMap<>() {

                    {
                        // "Runite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustRunite", 1L), 9);
                    }
                }));

        // "Rare Earth (I) Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreRareEarthI", 1L) },
                // "Raw Rare Earth (I) Ore"
                getModItem(GTPlusPlus.ID, "oreRawRareEarthI", 1L),
                // "Crushed Rare Earth (I) Ore"
                getModItem(GTPlusPlus.ID, "crushedRareEarthI", 1L),
                new HashMap<>() {

                    {
                        // "Nether Quartz Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2522), 4);
                        // "Yttrium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2045), 1);
                        // "Rare Earth (I) Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustRareEarthI", 1L), 4);
                    }
                }));

        // "Rare Earth (II) Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreRareEarthII", 1L) },
                // "Raw Rare Earth (II) Ore"
                getModItem(GTPlusPlus.ID, "oreRawRareEarthII", 1L),
                // "Crushed Rare Earth (II) Ore"
                getModItem(GTPlusPlus.ID, "crushedRareEarthII", 1L),
                new HashMap<>() {

                    {
                        // "Neodymium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2067), 1);
                        // "Rare Earth (II) Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustRareEarthII", 1L), 4);
                        // "Runite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustRunite", 1L), 4);
                    }
                }));

        // "Rare Earth (III) Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreRareEarthIII", 1L) },
                // "Raw Rare Earth (III) Ore"
                getModItem(GTPlusPlus.ID, "oreRawRareEarthIII", 1L),
                // "Crushed Rare Earth (III) Ore"
                getModItem(GTPlusPlus.ID, "crushedRareEarthIII", 1L),
                new HashMap<>() {

                    {
                        // "Cerium-Rich Mixture Dust"
                        put(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 11029), 8);
                        // "Erbium Dust"
                        put(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2075), 1);
                        // "Rare Earth (III) Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustRareEarthIII", 1L), 4);
                    }
                }));

        // "Barite (Ra) Ore"
        Ore_List.add(
            new OreList(
                new ItemStack[] { getModItem(GTPlusPlus.ID, "oreBariteRa", 1L) },
                // "Raw Barite (Ra) Ore"
                getModItem(GTPlusPlus.ID, "oreRawBariteRa", 1L),
                // "Crushed Barite (Ra) Ore"
                getModItem(GTPlusPlus.ID, "crushedBariteRa", 1L),
                new HashMap<>() {

                    {
                        // "Barite (Ra) Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustBariteRa", 1L), 4);
                        // "Runite Dust"
                        put(getModItem(GTPlusPlus.ID, "itemDustRunite", 1L), 1);
                    }
                }));

        // 遍历所有矿石列表
        for (OreList oreEntry : Ore_List) {
            // 安全检查：防止oreEntry为null
            if (oreEntry == null) {
                System.err.println("【警告】检测到null的OreList条目，跳过处理");
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
