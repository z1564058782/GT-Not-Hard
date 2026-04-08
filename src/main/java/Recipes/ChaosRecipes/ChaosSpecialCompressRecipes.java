package Recipes.ChaosRecipes;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.SpecialCompressOfChaosFrontend;

public class ChaosSpecialCompressRecipes {

    public static final RecipeMap<RecipeMapBackend> SpecialCompressRecipes_HIP = RecipeMapBuilder
        .of("Chaos of Compress with HIP")
        .maxIO(1, 1, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(128))
        .frontend(SpecialCompressOfChaosFrontend::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> SpecialCompressRecipes_BHC = RecipeMapBuilder
        .of("Chaos of Compress with BHC")
        .maxIO(1, 1, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(128))
        .frontend(SpecialCompressOfChaosFrontend::new)
        .build();

    private static class CompressList {

        ItemStack InputItem;
        int Efficiency;
        int Duration;
        ItemStack OutputItem;

        public CompressList(ItemStack InputItem, int Efficiency, int Duration, ItemStack OutputItem) {
            this.InputItem = InputItem;
            this.Efficiency = Efficiency;
            this.Duration = Duration;
            this.OutputItem = OutputItem;
        }
    }

    public static void addSpecialCompressRecipes() {

        ArrayList<CompressList> compressList_HIP = new ArrayList<>();

        // "Block of Ichorium"
        compressList_HIP.add(
            new CompressList(
                // "Ichorium Ingot"
                getModItem(GregTech.ID, "gt.metaitem.01", 9L, 11978),
                491_520,
                2_400,
                getModItem(GregTech.ID, "gt.blockmetal8", 1L, 13)));

        // "Superdense Lithium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Lithium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17006),
                96,
                224,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6006)));

        // "Superdense Beryllium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Beryllium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17008),
                96,
                288,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6008)));

        // "Superdense Carbon Plate"
        compressList_HIP.add(
            new CompressList(
                // "Carbon Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17010),
                96,
                384,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6010)));

        // "Superdense Magnesium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Magnesium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17018),
                96,
                768,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6018)));

        // "Superdense Aluminium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Aluminium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17019),
                96,
                832,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6019)));

        // "Superdense Raw Silicon Plate"
        compressList_HIP.add(
            new CompressList(
                // "Raw Silicon Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17020),
                96,
                896,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6020)));

        // "Superdense Potassium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Potassium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17025),
                96,
                1_248,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6025)));

        // "Superdense Scandium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Scandium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17027),
                96,
                1_440,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6027)));

        // "Superdense Titanium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Titanium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17028),
                96,
                1_536,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6028)));

        // "Superdense Vanadium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Vanadium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17029),
                96,
                1_632,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6029)));

        // "Superdense Chrome Plate"
        compressList_HIP.add(
            new CompressList(
                // "Chrome Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17030),
                96,
                1_664,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6030)));

        // "Superdense Manganese Plate"
        compressList_HIP.add(
            new CompressList(
                // "Manganese Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17031),
                96,
                1_760,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6031)));

        // "Superdense Iron Plate"
        compressList_HIP.add(
            new CompressList(
                // "Iron Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17032),
                96,
                1_792,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6032)));

        // "Superdense Cobalt Plate"
        compressList_HIP.add(
            new CompressList(
                // "Cobalt Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17033),
                96,
                1_888,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6033)));

        // "Superdense Nickel Plate"
        compressList_HIP.add(
            new CompressList(
                // "Nickel Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17034),
                96,
                1_856,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6034)));

        // "Superdense Copper Plate"
        compressList_HIP.add(
            new CompressList(
                // "Copper Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17035),
                96,
                2_016,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6035)));

        // "Superdense Zinc Plate"
        compressList_HIP.add(
            new CompressList(
                // "Zinc Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17036),
                96,
                2_080,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6036)));

        // "Superdense Gallium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Gallium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17037),
                96,
                2_240,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6037)));

        // "Superdense Arsenic Plate"
        compressList_HIP.add(
            new CompressList(
                // "Arsenic Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17039),
                96,
                2_400,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6039)));

        // "Superdense Rubidium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Rubidium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17043),
                96,
                2_720,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6043)));

        // "Superdense Strontium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Strontium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17044),
                96,
                2_784,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6044)));

        // "Superdense Yttrium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Yttrium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17045),
                96,
                2_848,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6045)));

        // "Superdense Niobium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Niobium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17047),
                96,
                3_008,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6047)));

        // "Superdense Molybdenum Plate"
        compressList_HIP.add(
            new CompressList(
                // "Molybdenum Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17048),
                96,
                3_040,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6048)));

        // "Superdense Palladium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Palladium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17052),
                96,
                3_392,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6052)));

        // "Superdense Silver Plate"
        compressList_HIP.add(
            new CompressList(
                // "Silver Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17054),
                96,
                3_424,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6054)));

        // "Superdense Indium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Indium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17056),
                96,
                3_648,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6056)));

        // "Superdense Tin Plate"
        compressList_HIP.add(
            new CompressList(
                // "Tin Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17057),
                96,
                3_776,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6057)));

        // "Superdense Antimony Plate"
        compressList_HIP.add(
            new CompressList(
                // "Antimony Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17058),
                96,
                3_872,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6058)));

        // "Superdense Tellurium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Tellurium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17059),
                96,
                4_064,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6059)));

        // "Superdense Caesium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Caesium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17062),
                96,
                4_224,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6062)));

        // "Superdense Barium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Barium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17063),
                96,
                4_384,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6063)));

        // "Superdense Lanthanum Plate"
        compressList_HIP.add(
            new CompressList(
                // "Lanthanum Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17064),
                96,
                4_416,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6064)));

        // "Superdense Cerium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Cerium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17065),
                96,
                4_480,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6065)));

        // "Superdense Praseodymium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Praseodymium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17066),
                96,
                4_480,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6066)));

        // "Superdense Neodymium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Neodymium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17067),
                96,
                4_608,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6067)));

        // "Superdense Promethium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Promethium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17068),
                96,
                4_608,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6068)));

        // "Superdense Samarium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Samarium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17069),
                96,
                4_800,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6069)));

        // "Superdense Europium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Europium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17070),
                96,
                4_832,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6070)));

        // "Superdense Gadolinium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Gadolinium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17071),
                96,
                5_024,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6071)));

        // "Superdense Terbium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Terbium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17072),
                96,
                5_056,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6072)));

        // "Superdense Dysprosium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Dysprosium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17073),
                96,
                5_184,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6073)));

        // "Superdense Holmium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Holmium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17074),
                96,
                5_248,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6074)));

        // "Superdense Erbium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Erbium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17075),
                96,
                5_344,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6075)));

        // "Superdense Thulium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Thulium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17076),
                96,
                5_376,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6076)));

        // "Superdense Ytterbium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Ytterbium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17077),
                96,
                5_536,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6077)));

        // "Superdense Lutetium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Lutetium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17078),
                96,
                5_568,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6078)));

        // "Superdense Tantalum Plate"
        compressList_HIP.add(
            new CompressList(
                // "Tantalum Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17080),
                96,
                5_760,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6080)));

        // "Superdense Tungsten Plate"
        compressList_HIP.add(
            new CompressList(
                // "Tungsten Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17081),
                96,
                5_856,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6081)));

        // "Superdense Osmium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Osmium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17083),
                96,
                6_080,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6083)));

        // "Superdense Iridium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Iridium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17084),
                96,
                6_144,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6084)));

        // "Superdense Platinum Plate"
        compressList_HIP.add(
            new CompressList(
                // "Platinum Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17085),
                96,
                6_240,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6085)));

        // "Superdense Gold Plate"
        compressList_HIP.add(
            new CompressList(
                // "Gold Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17086),
                96,
                6_272,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6086)));

        // "Superdense Lead Plate"
        compressList_HIP.add(
            new CompressList(
                // "Lead Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17089),
                96,
                6_624,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6089)));

        // "Superdense Bismuth Plate"
        compressList_HIP.add(
            new CompressList(
                // "Bismuth Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17090),
                96,
                6_656,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6090)));

        // "Superdense Thorium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Thorium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17096),
                96,
                7_360,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6096)));

        // "Superdense Uranium 235 Plate"
        compressList_HIP.add(
            new CompressList(
                // "Uranium 235 Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17097),
                96,
                7_520,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6097)));

        // "Superdense Uranium 238 Plate"
        compressList_HIP.add(
            new CompressList(
                // "Uranium 238 Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17098),
                96,
                7_616,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6098)));

        // "Superdense Plutonium 239 Plate"
        compressList_HIP.add(
            new CompressList(
                // "Plutonium 239 Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17100),
                96,
                7_872,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6100)));

        // "Superdense Plutonium 241 Plate"
        compressList_HIP.add(
            new CompressList(
                // "Plutonium 241 Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17101),
                96,
                7_776,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6101)));

        // "Superdense Americium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Americium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17103),
                96,
                7_840,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6103)));

        // "Superdense Purified Tengam Plate"
        compressList_HIP.add(
            new CompressList(
                // "Purified Tengam Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17111),
                491_520,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6111)));

        // "Superdense Attuned Tengam Plate"
        compressList_HIP.add(
            new CompressList(
                // "Attuned Tengam Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17112),
                491_520,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6112)));

        // "Superdense Hellish Metal Plate"
        compressList_HIP.add(
            new CompressList(
                // "Hellish Metal Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17125),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6125)));

        // "Superdense Neutronium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Neutronium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17129),
                30_720,
                3_200,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6129)));

        // "Superdense Superconductor Base UIV Plate"
        compressList_HIP.add(
            new CompressList(
                // "Superconductor Base UIV Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17131),
                1_966_080,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6131)));

        // "Superdense Netherite Plate"
        compressList_HIP.add(
            new CompressList(
                // "Netherite Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17132),
                122_880,
                10_000,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6132)));

        // "Superdense Proto-Halkonite Steel Plate"
        compressList_HIP.add(
            new CompressList(
                // "Proto-Halkonite Steel Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17154),
                31_457_280,
                225,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6154)));

        // "Superdense Prismatic Naquadah Plate"
        compressList_HIP.add(
            new CompressList(
                // "Prismatic Naquadah Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17163),
                122_880,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6163)));

        // "Superdense Manasteel Plate"
        compressList_HIP.add(
            new CompressList(
                // "Manasteel Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17201),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6201)));

        // "Superdense Terrasteel Plate"
        compressList_HIP.add(
            new CompressList(
                // "Terrasteel Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17202),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6202)));

        // "Superdense Elven Elementium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Elven Elementium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17203),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6203)));

        // "Superdense Gaia Spirit Plate"
        compressList_HIP.add(
            new CompressList(
                // "Gaia Spirit Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17205),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6205)));

        // "Superdense Bronze Plate"
        compressList_HIP.add(
            new CompressList(
                // "Bronze Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17300),
                96,
                2_432,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6300)));

        // "Superdense Brass Plate"
        compressList_HIP.add(
            new CompressList(
                // "Brass Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17301),
                96,
                2_016,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6301)));

        // "Superdense Invar Plate"
        compressList_HIP.add(
            new CompressList(
                // "Invar Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17302),
                96,
                1_792,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6302)));

        // "Superdense Electrum Plate"
        compressList_HIP.add(
            new CompressList(
                // "Electrum Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17303),
                96,
                4_832,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6303)));

        // "Superdense Wrought Iron Plate"
        compressList_HIP.add(
            new CompressList(
                // "Wrought Iron Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17304),
                96,
                1_792,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6304)));

        // "Superdense Steel Plate"
        compressList_HIP.add(
            new CompressList(
                // "Steel Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17305),
                96,
                1_792,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6305)));

        // "Superdense Stainless Steel Plate"
        compressList_HIP.add(
            new CompressList(
                // "Stainless Steel Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17306),
                96,
                1_760,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6306)));

        // "Superdense Pig Iron Plate"
        compressList_HIP.add(
            new CompressList(
                // "Pig Iron Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17307),
                96,
                1_792,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6307)));

        // "Superdense Red Alloy Plate"
        compressList_HIP.add(
            new CompressList(
                // "Red Alloy Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17308),
                96,
                12_896,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6308)));

        // "Superdense Blue Alloy Plate"
        compressList_HIP.add(
            new CompressList(
                // "Blue Alloy Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17309),
                96,
                3_680,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6309)));

        // "Superdense Cupronickel Plate"
        compressList_HIP.add(
            new CompressList(
                // "Cupronickel Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17310),
                96,
                1_920,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6310)));

        // "Superdense Nichrome Plate"
        compressList_HIP.add(
            new CompressList(
                // "Nichrome Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17311),
                96,
                1_792,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6311)));

        // "Superdense Kanthal Plate"
        compressList_HIP.add(
            new CompressList(
                // "Kanthal Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17312),
                96,
                1_408,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6312)));

        // "Superdense Magnalium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Magnalium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17313),
                96,
                800,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6313)));

        // "Superdense Soldering Alloy Plate"
        compressList_HIP.add(
            new CompressList(
                // "Soldering Alloy Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17314),
                96,
                3_776,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6314)));

        // "Superdense Battery Alloy Plate"
        compressList_HIP.add(
            new CompressList(
                // "Battery Alloy Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17315),
                96,
                6_048,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6315)));

        // "Superdense Tungstensteel Plate"
        compressList_HIP.add(
            new CompressList(
                // "Tungstensteel Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17316),
                96,
                3_808,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6316)));

        // "Superdense Osmiridium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Osmiridium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17317),
                96,
                6_112,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6317)));

        // "Superdense Sunnarium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Sunnarium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17318),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6318)));

        // "Superdense Adamantium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Adamantium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17319),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6319)));

        // "Superdense Fluxed Electrum Plate"
        compressList_HIP.add(
            new CompressList(
                // "Fluxed Electrum Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17320),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6320)));

        // "Superdense Enderium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Enderium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17321),
                96,
                4_032,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6321)));

        // "Superdense Infused Gold Plate"
        compressList_HIP.add(
            new CompressList(
                // "Infused Gold Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17323),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6323)));

        // "Superdense Naquadah Plate"
        compressList_HIP.add(
            new CompressList(
                // "Naquadah Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17324),
                96,
                10_560,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6324)));

        // "Superdense Naquadah Alloy Plate"
        compressList_HIP.add(
            new CompressList(
                // "Naquadah Alloy Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17325),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6325)));

        // "Superdense Enriched Naquadah Plate"
        compressList_HIP.add(
            new CompressList(
                // "Enriched Naquadah Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17326),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6326)));

        // "Superdense Naquadria Plate"
        compressList_HIP.add(
            new CompressList(
                // "Naquadria Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17327),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6327)));

        // "Superdense Duranium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Duranium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17328),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6328)));

        // "Superdense Tritanium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Tritanium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17329),
                96,
                10_336,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6329)));

        // "Superdense Thaumium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Thaumium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17330),
                96,
                4_992,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6330)));

        // "Superdense Mithril Plate"
        compressList_HIP.add(
            new CompressList(
                // "Mithril Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17331),
                96,
                5_824,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6331)));

        // "Superdense Astral Silver Plate"
        compressList_HIP.add(
            new CompressList(
                // "Astral Silver Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17333),
                96,
                3_936,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6333)));

        // "Superdense Black Steel Plate"
        compressList_HIP.add(
            new CompressList(
                // "Black Steel Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17334),
                96,
                2_048,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6334)));

        // "Superdense Damascus Steel Plate"
        compressList_HIP.add(
            new CompressList(
                // "Damascus Steel Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17335),
                96,
                1_792,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6335)));

        // "Superdense Shadow Iron Plate"
        compressList_HIP.add(
            new CompressList(
                // "Shadow Iron Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17336),
                96,
                4_192,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6336)));

        // "Superdense Shadow Steel Plate"
        compressList_HIP.add(
            new CompressList(
                // "Shadow Steel Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17337),
                96,
                4_192,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6337)));

        // "Superdense Ironwood Plate"
        compressList_HIP.add(
            new CompressList(
                // "Ironwood Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17338),
                96,
                1_888,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6338)));

        // "Superdense Steeleaf Plate"
        compressList_HIP.add(
            new CompressList(
                // "Steeleaf Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17339),
                96,
                2_496,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6339)));

        // "Superdense Meteoric Iron Plate"
        compressList_HIP.add(
            new CompressList(
                // "Meteoric Iron Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17340),
                96,
                2_176,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6340)));

        // "Superdense Meteoric Steel Plate"
        compressList_HIP.add(
            new CompressList(
                // "Meteoric Steel Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17341),
                96,
                2_176,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6341)));

        // "Superdense Deep Dark Iron Plate"
        compressList_HIP.add(
            new CompressList(
                // "Deep Dark Iron Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17342),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6342)));

        // "Superdense Cobalt Brass Plate"
        compressList_HIP.add(
            new CompressList(
                // "Cobalt Brass Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17343),
                96,
                2_176,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6343)));

        // "Superdense Ultimet Plate"
        compressList_HIP.add(
            new CompressList(
                // "Ultimet Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17344),
                96,
                1_952,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6344)));

        // "Superdense Annealed Copper Plate"
        compressList_HIP.add(
            new CompressList(
                // "Annealed Copper Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17345),
                96,
                2_016,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6345)));

        // "Superdense Fiery Steel Plate"
        compressList_HIP.add(
            new CompressList(
                // "Fiery Steel Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17346),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6346)));

        // "Superdense Red Steel Plate"
        compressList_HIP.add(
            new CompressList(
                // "Red Steel Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17348),
                96,
                2_208,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6348)));

        // "Superdense Blue Steel Plate"
        compressList_HIP.add(
            new CompressList(
                // "Blue Steel Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17349),
                96,
                2_400,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6349)));

        // "Superdense Sterling Silver Plate"
        compressList_HIP.add(
            new CompressList(
                // "Sterling Silver Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17350),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6350)));

        // "Superdense Rose Gold Plate"
        compressList_HIP.add(
            new CompressList(
                // "Rose Gold Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17351),
                96,
                5_408,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6351)));

        // "Superdense Black Bronze Plate"
        compressList_HIP.add(
            new CompressList(
                // "Black Bronze Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17352),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6352)));

        // "Superdense Bismuth Bronze Plate"
        compressList_HIP.add(
            new CompressList(
                // "Bismuth Bronze Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17353),
                96,
                2_944,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6353)));

        // "Superdense Magnetic Iron Plate"
        compressList_HIP.add(
            new CompressList(
                // "Magnetic Iron Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17354),
                96,
                1_824,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6354)));

        // "Superdense Magnetic Steel Plate"
        compressList_HIP.add(
            new CompressList(
                // "Magnetic Steel Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17355),
                96,
                1_824,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6355)));

        // "Superdense Magnetic Neodymium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Magnetic Neodymium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17356),
                96,
                4_672,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6356)));

        // "Superdense Vanadium-Gallium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Vanadium-Gallium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17357),
                96,
                1_760,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6357)));

        // "Superdense Yttrium Barium Cuprate Plate"
        compressList_HIP.add(
            new CompressList(
                // "Yttrium Barium Cuprate Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17358),
                96,
                1_632,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6358)));

        // "Superdense Niobium Nitride Plate"
        compressList_HIP.add(
            new CompressList(
                // "Niobium Nitride Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17359),
                96,
                1_728,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6359)));

        // "Superdense Niobium-Titanium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Niobium-Titanium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17360),
                96,
                2_272,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6360)));

        // "Superdense Chromium Dioxide Plate"
        compressList_HIP.add(
            new CompressList(
                // "Chromium Dioxide Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17361),
                96,
                896,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6361)));

        // "Superdense Knightmetal Plate"
        compressList_HIP.add(
            new CompressList(
                // "Knightmetal Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17362),
                96,
                2_240,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6362)));

        // "Superdense Tin Alloy Plate"
        compressList_HIP.add(
            new CompressList(
                // "Tin Alloy Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17363),
                96,
                2_784,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6363)));

        // "Superdense Dark Steel Plate"
        compressList_HIP.add(
            new CompressList(
                // "Dark Steel Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17364),
                96,
                864,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6364)));

        // "Superdense Electrical Steel Plate"
        compressList_HIP.add(
            new CompressList(
                // "Electrical Steel Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17365),
                96,
                1_152,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6365)));

        // "Superdense Energetic Alloy Plate"
        compressList_HIP.add(
            new CompressList(
                // "Energetic Alloy Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17366),
                96,
                3_488,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6366)));

        // "Superdense Vibrant Alloy Plate"
        compressList_HIP.add(
            new CompressList(
                // "Vibrant Alloy Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17367),
                96,
                3_424,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6367)));

        // "Superdense Shadow Metal Plate"
        compressList_HIP.add(
            new CompressList(
                // "Shadow Metal Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17368),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6368)));

        // "Superdense Conductive Iron Plate"
        compressList_HIP.add(
            new CompressList(
                // "Conductive Iron Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17369),
                96,
                2_208,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6369)));

        // "Superdense Tungstencarbide Plate"
        compressList_HIP.add(
            new CompressList(
                // "Tungstencarbide Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17370),
                96,
                3_104,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6370)));

        // "Superdense Vanadiumsteel Plate"
        compressList_HIP.add(
            new CompressList(
                // "Vanadiumsteel Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17371),
                96,
                1_760,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6371)));

        // "Superdense HSS-G Plate"
        compressList_HIP.add(
            new CompressList(
                // "HSS-G Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17372),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6372)));

        // "Superdense HSS-E Plate"
        compressList_HIP.add(
            new CompressList(
                // "HSS-E Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17373),
                96,
                2_592,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6373)));

        // "Superdense HSS-S Plate"
        compressList_HIP.add(
            new CompressList(
                // "HSS-S Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17374),
                96,
                4_128,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6374)));

        // "Superdense Pulsating Iron Plate"
        compressList_HIP.add(
            new CompressList(
                // "Pulsating Iron Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17378),
                96,
                1_952,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6378)));

        // "Superdense Soularium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Soularium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17379),
                96,
                3_264,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6379)));

        // "Superdense Enderium Base Plate"
        compressList_HIP.add(
            new CompressList(
                // "Enderium Base Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17380),
                96,
                4_288,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6380)));

        // "Superdense Redstone Alloy Plate"
        compressList_HIP.add(
            new CompressList(
                // "Redstone Alloy Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17381),
                96,
                1_440,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6381)));

        // "Superdense Ardite Plate"
        compressList_HIP.add(
            new CompressList(
                // "Ardite Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17382),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6382)));

        // "Superdense Reinforced Plate"
        compressList_HIP.add(
            new CompressList(
                // "Reinforced Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17383),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6383)));

        // "Superdense Galgadorian Plate"
        compressList_HIP.add(
            new CompressList(
                // "Galgadorian Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17384),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6384)));

        // "Superdense Enhanced Galgadorian Plate"
        compressList_HIP.add(
            new CompressList(
                // "Enhanced Galgadorian Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17385),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6385)));

        // "Superdense Manyullyn Plate"
        compressList_HIP.add(
            new CompressList(
                // "Manyullyn Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17386),
                96,
                2_469,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6386)));

        // "Superdense Mytryl Plate"
        compressList_HIP.add(
            new CompressList(
                // "Mytryl Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17387),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6387)));

        // "Superdense Black Plutonium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Black Plutonium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17388),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6388)));

        // "Superdense Callisto Ice Plate"
        compressList_HIP.add(
            new CompressList(
                // "Callisto Ice Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17389),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6389)));

        // "Superdense Ledox Plate"
        compressList_HIP.add(
            new CompressList(
                // "Ledox Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17390),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6390)));

        // "Superdense Quantium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Quantium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17391),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6391)));

        // "Superdense Duralumin Plate"
        compressList_HIP.add(
            new CompressList(
                // "Duralumin Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17392),
                96,
                1_056,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6392)));

        // "Superdense Oriharukon Plate"
        compressList_HIP.add(
            new CompressList(
                // "Oriharukon Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17393),
                96,
                1_056,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6393)));

        // "Superdense Infinity Catalyst Plate"
        compressList_HIP.add(
            new CompressList(
                // "Infinity Catalyst Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17394),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6394)));

        // "Superdense Bedrockium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Bedrockium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17395),
                1_920,
                640,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6395)));

        // "Superdense Infinity Plate"
        compressList_HIP.add(
            new CompressList(
                // "Infinity Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17397),
                491_520,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6397)));

        // "Superdense Mysterious Crystal Plate"
        compressList_HIP.add(
            new CompressList(
                // "Mysterious Crystal Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17398),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6398)));

        // "Superdense Magnetic Samarium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Magnetic Samarium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17399),
                96,
                4_800,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6399)));

        // "Superdense Obzinite Plate"
        compressList_HIP.add(
            new CompressList(
                // "Obzinite Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17400),
                96,
                1_696,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6400)));

        // "Superdense End Steel Plate"
        compressList_HIP.add(
            new CompressList(
                // "End Steel Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17401),
                96,
                3_264,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6401)));

        // "Superdense Clay Compound Plate"
        compressList_HIP.add(
            new CompressList(
                // "Clay Compound Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17402),
                96,
                1_440,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6402)));

        // "Superdense Crystalline Alloy Plate"
        compressList_HIP.add(
            new CompressList(
                // "Crystalline Alloy Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17403),
                96,
                10_912,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6403)));

        // "Superdense Melodic Alloy Plate"
        compressList_HIP.add(
            new CompressList(
                // "Melodic Alloy Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17404),
                96,
                4_928,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6404)));

        // "Superdense Stellar Alloy Plate"
        compressList_HIP.add(
            new CompressList(
                // "Stellar Alloy Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17405),
                96,
                6_208,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6405)));

        // "Superdense Crystalline Pink Slime Plate"
        compressList_HIP.add(
            new CompressList(
                // "Crystalline Pink Slime Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17406),
                96,
                17_728,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6406)));

        // "Superdense Energetic Silver Plate"
        compressList_HIP.add(
            new CompressList(
                // "Energetic Silver Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17407),
                96,
                2_560,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6407)));

        // "Superdense Vivid Alloy Plate"
        compressList_HIP.add(
            new CompressList(
                // "Vivid Alloy Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17408),
                96,
                3_104,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6408)));

        // "Superdense Epoxid Sheet"
        compressList_HIP.add(
            new CompressList(
                // "Epoxid Sheet"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17470),
                96,
                192,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6470)));

        // "Superdense Silicone Rubber Sheet"
        compressList_HIP.add(
            new CompressList(
                // "Silicone Rubber Sheet"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17471),
                96,
                224,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6471)));

        // "Superdense Polycaprolactam Sheet"
        compressList_HIP.add(
            new CompressList(
                // "Polycaprolactam Sheet"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17472),
                96,
                160,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6472)));

        // "Superdense Polytetrafluoroethylene Sheet"
        compressList_HIP.add(
            new CompressList(
                // "Polytetrafluoroethylene Sheet"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17473),
                96,
                512,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6473)));

        // "Superdense Alduorite Plate"
        compressList_HIP.add(
            new CompressList(
                // "Alduorite Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17485),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6485)));

        // "Superdense Rubracium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Rubracium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17488),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6488)));

        // "Superdense Vulcanite Plate"
        compressList_HIP.add(
            new CompressList(
                // "Vulcanite Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17489),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6489)));

        // "Superdense Force Plate"
        compressList_HIP.add(
            new CompressList(
                // "Force Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17521),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6521)));

        // "Superdense Vinteum Plate"
        compressList_HIP.add(
            new CompressList(
                // "Vinteum Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17529),
                96,
                4_992,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6529)));

        // "Superdense TPV-Alloy Plate"
        compressList_HIP.add(
            new CompressList(
                // "TPV-Alloy Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17576),
                96,
                3_552,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6576)));

        // "Superdense Enriched Holmium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Enriched Holmium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17582),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6582)));

        // "Superdense Polybenzimidazole Plate"
        compressList_HIP.add(
            new CompressList(
                // "Polybenzimidazole Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17599),
                96,
                256,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6599)));

        // "Superdense Fiber-Reinforced Epoxy Resin Sheet"
        compressList_HIP.add(
            new CompressList(
                // "Fiber-Reinforced Epoxy Resin Sheet"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17610),
                96,
                192,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6610)));

        // "Superdense Nickel-Zinc Ferrite Plate"
        compressList_HIP.add(
            new CompressList(
                // "Nickel-Zinc Ferrite Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17613),
                96,
                1_056,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6613)));

        // "Superdense Polyphenylene Sulfide Plate"
        compressList_HIP.add(
            new CompressList(
                // "Polyphenylene Sulfide Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17631),
                96,
                288,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6631)));

        // "Superdense Styrene-Butadiene Rubber Sheet"
        compressList_HIP.add(
            new CompressList(
                // "Styrene-Butadiene Rubber Sheet"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17635),
                96,
                160,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6635)));

        // "Superdense Polystyrene Sheet"
        compressList_HIP.add(
            new CompressList(
                // "Polystyrene Sheet"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17636),
                96,
                192,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6636)));

        // "Superdense Polyvinyl Chloride Sheet"
        compressList_HIP.add(
            new CompressList(
                // "Polyvinyl Chloride Sheet"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17649),
                96,
                320,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6649)));

        // "Superdense Kevlar Plate"
        compressList_HIP.add(
            new CompressList(
                // "Kevlar Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17765),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6765)));

        // "Superdense Endium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Endium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17770),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6770)));

        // "Superdense Nickel Aluminide Plate"
        compressList_HIP.add(
            new CompressList(
                // "Nickel Aluminide Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17772),
                96,
                1_088,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6772)));

        // "Superdense Deep Iron Plate"
        compressList_HIP.add(
            new CompressList(
                // "Deep Iron Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17829),
                96,
                1_792,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6829)));

        // "Superdense Silicon Solar Grade (Poly SI) Plate"
        compressList_HIP.add(
            new CompressList(
                // "Silicon Solar Grade (Poly SI) Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17856),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6856)));

        // "Superdense Trinium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Trinium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17868),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6868)));

        // "Superdense Polyethylene Sheet"
        compressList_HIP.add(
            new CompressList(
                // "Polyethylene Sheet"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17874),
                96,
                128,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6874)));

        // "Superdense Rubber Sheet"
        compressList_HIP.add(
            new CompressList(
                // "Rubber Sheet"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17880),
                96,
                160,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6880)));

        // "Superdense Desh Plate"
        compressList_HIP.add(
            new CompressList(
                // "Desh Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17884),
                96,
                1_568,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6884)));

        // "Superdense Chrysotile Plate"
        compressList_HIP.add(
            new CompressList(
                // "Chrysotile Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17912),
                96,
                480,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6912)));

        // "Superdense Realgar Plate"
        compressList_HIP.add(
            new CompressList(
                // "Realgar Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17913),
                96,
                1_696,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6913)));

        // "Superdense Vyroxeres Plate"
        compressList_HIP.add(
            new CompressList(
                // "Vyroxeres Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17951),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6951)));

        // "Superdense Ceruclase Plate"
        compressList_HIP.add(
            new CompressList(
                // "Ceruclase Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17952),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6952)));

        // "Superdense Tartarite Plate"
        compressList_HIP.add(
            new CompressList(
                // "Tartarite Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17956),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6956)));

        // "Superdense Orichalcum Plate"
        compressList_HIP.add(
            new CompressList(
                // "Orichalcum Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17966),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6966)));

        // "Superdense Void Plate"
        compressList_HIP.add(
            new CompressList(
                // "Void Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17970),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6970)));

        // "Superdense Superconductor Base UEV Plate"
        compressList_HIP.add(
            new CompressList(
                // "Superconductor Base UEV Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17974),
                491_520,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6974)));

        // "Superdense Draconium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Draconium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17975),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6975)));

        // "Superdense Awakened Draconium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Awakened Draconium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17976),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6976)));

        // "Superdense Blood Infused Iron Plate"
        compressList_HIP.add(
            new CompressList(
                // "Blood Infused Iron Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17977),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6977)));

        // "Superdense Ichorium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Ichorium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17978),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6978)));

        // "Superdense Radox Polymer Plate"
        compressList_HIP.add(
            new CompressList(
                // "Radox Polymer Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17979),
                96,
                2_464,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6979)));

        // "Superdense Gallium Arsenide Plate"
        compressList_HIP.add(
            new CompressList(
                // "Gallium Arsenide Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17980),
                96,
                2_304,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6980)));

        // "Superdense Indium Gallium Phosphide Plate"
        compressList_HIP.add(
            new CompressList(
                // "Indium Gallium Phosphide Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17981),
                96,
                2_272,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6981)));

        // "Superdense Cosmic Neutronium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Cosmic Neutronium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17982),
                122_880,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6982)));

        // "Superdense Flerovium Plate"
        compressList_HIP.add(
            new CompressList(
                // "Flerovium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17984),
                96,
                9_248,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6984)));

        // "Superdense Superconductor Base UHV Plate"
        compressList_HIP.add(
            new CompressList(
                // "Superconductor Base UHV Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17985),
                122_880,
                5_792,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6985)));

        // "Superdense Superconductor Base UV Plate"
        compressList_HIP.add(
            new CompressList(
                // "Superconductor Base UV Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17986),
                30_720,
                4_480,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6986)));

        // "Superdense Superconductor Base MV Plate"
        compressList_HIP.add(
            new CompressList(
                // "Superconductor Base MV Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17987),
                96,
                1_792,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6987)));

        // "Superdense Superconductor Base HV Plate"
        compressList_HIP.add(
            new CompressList(
                // "Superconductor Base HV Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17988),
                96,
                1_760,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6988)));

        // "Superdense Superconductor Base EV Plate"
        compressList_HIP.add(
            new CompressList(
                // "Superconductor Base EV Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17989),
                96,
                6_560,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6989)));

        // "Superdense Superconductor Base IV Plate"
        compressList_HIP.add(
            new CompressList(
                // "Superconductor Base IV Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17990),
                96,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6990)));

        // "Superdense Superconductor Base LuV Plate"
        compressList_HIP.add(
            new CompressList(
                // "Superconductor Base LuV Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17991),
                96,
                1_760,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6991)));

        // "Superdense Superconductor Base ZPM Plate"
        compressList_HIP.add(
            new CompressList(
                // "Superconductor Base ZPM Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17992),
                96,
                5_824,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6992)));

        CompressList[] HIPCompress = compressList_HIP.toArray(new CompressList[0]);

        for (CompressList list : HIPCompress) {
            GTValues.RA.stdBuilder()
                .itemInputs(list.InputItem)
                .itemOutputs(list.OutputItem)
                .duration(list.Duration)
                .eut(list.Efficiency)
                .addTo(SpecialCompressRecipes_HIP);
        }

        ArrayList<CompressList> compressList_BHC = new ArrayList<>();

        // "Superdense Transcendent Metal Plate"
        compressList_BHC.add(
            new CompressList(
                // "Transcendent Metal Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17581),
                1_966_080,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6581)));

        // "Superdense Six-Phased Copper Plate"
        compressList_BHC.add(
            new CompressList(
                // "Six-Phased Copper Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17147),
                7_864_320,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6147)));

        // "Superdense Black Dwarf Matter Plate"
        compressList_BHC.add(
            new CompressList(
                // "Black Dwarf Matter Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17586),
                7_864_320,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6586)));

        // "Superdense White Dwarf Matter Plate"
        compressList_BHC.add(
            new CompressList(
                // "White Dwarf Matter Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17585),
                7_864_320,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6585)));

        // "Superdense Mellion Plate"
        compressList_BHC.add(
            new CompressList(
                // "Mellion Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17148),
                7_864_320,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6148)));

        // "Superdense Superconductor Base UMV Plate"
        compressList_BHC.add(
            new CompressList(
                // "Superconductor Base UMV Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17134),
                7_864_320,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6134)));

        // "Superdense Creon Plate"
        compressList_BHC.add(
            new CompressList(
                // "Creon Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17149),
                7_864_320,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6149)));

        // "Superdense SpaceTime Plate"
        compressList_BHC.add(
            new CompressList(
                // "SpaceTime Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17588),
                7_864_320,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6588)));

        // "Superdense Hot Proto-Halkonite Steel Plate"
        compressList_BHC.add(
            new CompressList(
                // "Hot Proto-Halkonite Steel Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17153),
                31_457_280,
                225,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6153)));

        // "Superdense Magmatter Plate"
        compressList_BHC.add(
            new CompressList(
                // "Magmatter Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17143),
                125_829_120,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6143)));

        // "Superdense Eternity Plate"
        compressList_BHC.add(
            new CompressList(
                // "Eternity Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17141),
                125_829_120,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6141)));

        // "Superdense Universium Plate"
        compressList_BHC.add(
            new CompressList(
                // "Universium Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17139),
                125_829_120,
                3_136,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6139)));

        // "Superdense Magnetohydrodynamically Constrained Star Matter Plate"
        compressList_BHC.add(
            new CompressList(
                // "Magnetohydrodynamically Constrained Star Matter Plate"
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 17583),
                503_316_480,
                90_000,
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 6583)));

        CompressList[] BHCCompress = compressList_BHC.toArray(new CompressList[0]);

        for (CompressList list : BHCCompress) {
            GTValues.RA.stdBuilder()
                .itemInputs(list.InputItem)
                .itemOutputs(list.OutputItem)
                .duration(list.Duration)
                .eut(list.Efficiency)
                .addTo(SpecialCompressRecipes_BHC);
        }
    }
}
