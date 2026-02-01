package Recipes.SingularityRecipes_VoidIngot;

import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.Mods.NEIOrePlugin;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.OneToManyItemsFrontend;

public class FakeSingularityIngotRecipes_T0 {

    public static final RecipeMap<RecipeMapBackend> addFakeVoidIngotRecipes_T0 = RecipeMapBuilder
        .of("Singularity of T0 Ingot")
        .maxIO(1, 135, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend::new)
        .build();

    public static void addFakeVoidIngotRecipes_T0() {
        // T0 - Overworld - Ow
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ow", 1L))
            .itemOutputs(
                // "Aluminium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
                // "Arsenic Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11039),
                // "Beryllium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11008),
                // "Bismuth Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11090),
                // "Caesium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11062),
                // "Carbon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11010),
                // "Cerium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11065),
                // "Chrome Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11030),
                // "Cobalt Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11033),
                // "Copper Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
                // "Dysprosium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11073),
                // "Erbium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11075),
                // "Gadolinium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11071),
                // "Gallium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11037),
                // "Holmium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11074),
                // "Iridium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11084),
                // "Lanthanum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11064),
                // "Lead Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),
                // "Lithium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11006),
                // "Magnesium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
                // "Manganese Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11031),
                // "Neodymium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11067),
                // "Nickel Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
                // "Niobium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11047),
                // "Osmium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11083),
                // "Palladium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11052),
                // "Platinum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11085),
                // "Potassium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11025),
                // "Raw Silicon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
                // "Rubidium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11043),
                // "Samarium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11069),
                // "Silver Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11054),
                // "Tantalum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11080),
                // "Tellurium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11059),
                // "Thorium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11096),
                // "Tin Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11057),
                // "Uranium 235 Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11097),
                // "Vanadium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11029),
                // "Ytterbium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11077),
                // "Yttrium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11045),
                // "Zinc Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11036),

                // "Germanium Ingot"
                getModItem(GTPlusPlus.ID, "itemIngotGermanium", 1L),
                // "Iodine Ingot"
                getModItem(GTPlusPlus.ID, "itemIngotIodine", 1L),
                // "Runite Ingot"
                getModItem(GTPlusPlus.ID, "itemIngotRunite", 1L),

                // "Calcium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
                // "Rhodium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 78),
                // "Ruthenium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 64),
                // "Zirconium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 11007),

                // "Gold Ingot"
                getModItem(Minecraft.ID, "gold_ingot", 1L),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ingot Mode")
            .eut(0)
            .addTo(addFakeVoidIngotRecipes_T0);

        // T0 - Nether - Ne
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ne", 1L))
            .itemOutputs(
                // "Aluminium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
                // "Antimony Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11058),
                // "Arsenic Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11039),
                // "Barium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11063),
                // "Beryllium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11008),
                // "Bismuth Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11090),
                // "Caesium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11062),
                // "Carbon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11010),
                // "Cerium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11065),
                // "Chrome Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11030),
                // "Cobalt Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11033),
                // "Copper Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
                // "Dysprosium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11073),
                // "Electrum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11303),
                // "Erbium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11075),
                // "Gadolinium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11071),
                // "Gallium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11037),
                // "Holmium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11074),
                // "Lanthanum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11064),
                // "Lead Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),
                // "Magnesium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
                // "Manganese Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11031),
                // "Molybdenum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11048),
                // "Neodymium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11067),
                // "Nickel Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
                // "Niobium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11047),
                // "Potassium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11025),
                // "Raw Silicon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
                // "Samarium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11069),
                // "Silver Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11054),
                // "Tantalum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11080),
                // "Tellurium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11059),
                // "Thorium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11096),
                // "Tin Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11057),
                // "Uranium 235 Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11097),
                // "Uranium 238 Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11098),
                // "Ytterbium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11077),
                // "Yttrium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11045),
                // "Zinc Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11036),

                // "Germanium Ingot"
                getModItem(GTPlusPlus.ID, "itemIngotGermanium", 1L),
                // "Iodine Ingot"
                getModItem(GTPlusPlus.ID, "itemIngotIodine", 1L),
                // "Runite Ingot"
                getModItem(GTPlusPlus.ID, "itemIngotRunite", 1L),

                // "Calcium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
                // "Zirconium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 11007),

                // "Gold Ingot"
                getModItem(Minecraft.ID, "gold_ingot", 1L),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ingot Mode")
            .eut(0)
            .addTo(addFakeVoidIngotRecipes_T0);

        // T0 - Twilight - TF
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_TF", 1L))
            .itemOutputs(
                // "Aluminium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
                // "Arsenic Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11039),
                // "Beryllium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11008),
                // "Caesium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11062),
                // "Carbon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11010),
                // "Chrome Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11030),
                // "Cobalt Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11033),
                // "Copper Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
                // "Iridium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11084),
                // "Lead Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),
                // "Lithium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11006),
                // "Magnesium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
                // "Manganese Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11031),
                // "Molybdenum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11048),
                // "Nickel Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
                // "Niobium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11047),
                // "Osmium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11083),
                // "Palladium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11052),
                // "Platinum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11085),
                // "Potassium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11025),
                // "Raw Silicon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
                // "Silver Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11054),
                // "Thorium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11096),
                // "Tin Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11057),
                // "Vanadium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11029),
                // "Zinc Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11036),

                // "Calcium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
                // "Rhodium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 78),
                // "Ruthenium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 64),
                // "Zirconium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 11007),

                // "Gold Ingot"
                getModItem(Minecraft.ID, "gold_ingot", 1L),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ingot Mode")
            .eut(0)
            .addTo(addFakeVoidIngotRecipes_T0);

        // T0 - TheEnd - ED
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_ED", 1L))
            .itemOutputs(
                // "Aluminium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
                // "Antimony Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11058),
                // "Arsenic Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11039),
                // "Beryllium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11008),
                // "Cobalt Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11033),
                // "Copper Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
                // "Gallium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11037),
                // "Iridium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11084),
                // "Lead Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),
                // "Molybdenum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11048),
                // "Nickel Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
                // "Osmium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11083),
                // "Palladium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11052),
                // "Platinum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11085),
                // "Raw Silicon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
                // "Silver Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11054),
                // "Thorium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11096),
                // "Tin Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11057),
                // "Uranium 238 Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11098),
                // "Vanadium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11029),
                // "Zinc Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11036),

                // "Calcium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
                // "Rhodium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 78),
                // "Ruthenium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 64),
                // "Zirconium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 11007),

                // "Gold Ingot"
                getModItem(Minecraft.ID, "gold_ingot", 1L),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ingot Mode")
            .eut(0)
            .addTo(addFakeVoidIngotRecipes_T0);

        // T0 - EndAsteroid - EA
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_EA", 1L))
            .itemOutputs(
                // "Adamantium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11319),
                // "Aluminium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11019),
                // "Americium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11103),
                // "Antimony Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11058),
                // "Arsenic Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11039),
                // "Barium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11063),
                // "Beryllium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11008),
                // "Carbon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11010),
                // "Chrome Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11030),
                // "Cobalt Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11033),
                // "Copper Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11035),
                // "Enriched Naquadah Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11326),
                // "Gallium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11037),
                // "Indium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11056),
                // "Iridium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11084),
                // "Lead Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11089),
                // "Lithium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11006),
                // "Magnesium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11018),
                // "Manganese Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11031),
                // "Molybdenum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11048),
                // "Naquadah Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11324),
                // "Naquadria Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11327),
                // "Nickel Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11034),
                // "Niobium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11047),
                // "Osmium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11083),
                // "Palladium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11052),
                // "Platinum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11085),
                // "Potassium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11025),
                // "Raw Silicon Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11020),
                // "Silver Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11054),
                // "Tantalum Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11080),
                // "Thorium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11096),
                // "Tin Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11057),
                // "Titanium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11028),
                // "Trinium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11868),
                // "Tungsten Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11081),
                // "Uranium 238 Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11098),
                // "Vanadium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11029),
                // "Zinc Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 11036),

                // "Calcium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 40),
                // "Rhodium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 78),
                // "Ruthenium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 64),
                // "Zirconium Ingot"
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedingot", 1L, 11007),

                // "Gold Ingot"
                getModItem(Minecraft.ID, "gold_ingot", 1L),
                // "Iron Ingot"
                getModItem(Minecraft.ID, "iron_ingot", 1L))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ingot Mode")
            .eut(0)
            .addTo(addFakeVoidIngotRecipes_T0);

    }
}
