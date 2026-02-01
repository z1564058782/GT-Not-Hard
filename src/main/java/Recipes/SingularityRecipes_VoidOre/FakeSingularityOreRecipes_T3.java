package Recipes.SingularityRecipes_VoidOre;

import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.NEIOrePlugin;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.OneToManyItemsFrontend;

public class FakeSingularityOreRecipes_T3 {

    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T3 = RecipeMapBuilder
        .of("Singularity of Void Ore T3")
        .maxIO(1, 135, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend::new)
        .build();

    public static void addFakeVoidOreRecipes_T3() {
        // T3 - Asteroids - As
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_As", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 910),
                getModItem(GregTech.ID, "gt.blockores", 1L, 841),
                getModItem(GregTech.ID, "gt.blockores", 1L, 6),
                getModItem(GregTech.ID, "gt.blockores", 1L, 918),
                getModItem(GregTech.ID, "gt.blockores", 1L, 825),
                getModItem(GregTech.ID, "gt.blockores", 1L, 842),
                getModItem(GregTech.ID, "gt.blockores", 1L, 925),
                getModItem(GregTech.ID, "gt.blockores", 1L, 822),
                getModItem(GregTech.ID, "gt.blockores", 1L, 918),
                getModItem(GregTech.ID, "gt.blockores", 1L, 19),
                getModItem(GregTech.ID, "gt.blockores", 1L, 870),
                getModItem(GregTech.ID, "gt.blockores", 1L, 923),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 840),
                getModItem(GregTech.ID, "gt.blockores", 1L, 35),
                getModItem(GregTech.ID, "gt.blockores", 1L, 945),
                getModItem(GregTech.ID, "gt.blockores", 1L, 324),
                getModItem(GregTech.ID, "gt.blockores", 1L, 326),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 28),
                getModItem(GregTech.ID, "gt.blockores", 1L, 89),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 500),
                getModItem(GregTech.ID, "gt.blockores", 1L, 825),
                getModItem(GregTech.ID, "gt.blockores", 1L, 841),
                getModItem(GregTech.ID, "gt.blockores", 1L, 34))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T3);

        // T3 - Callisto - Ca
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ca", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 910),
                getModItem(GregTech.ID, "gt.blockores", 1L, 841),
                getModItem(GregTech.ID, "gt.blockores", 1L, 6),
                getModItem(GregTech.ID, "gt.blockores", 1L, 98),
                getModItem(GregTech.ID, "gt.blockores", 1L, 100),
                getModItem(GregTech.ID, "gt.blockores", 1L, 96),
                getModItem(GregTech.ID, "gt.blockores", 1L, 905),
                getModItem(GregTech.ID, "gt.blockores", 1L, 520),
                getModItem(GregTech.ID, "gt.blockores", 1L, 67),
                getModItem(GregTech.ID, "gt.blockores", 1L, 918),
                getModItem(GregTech.ID, "gt.blockores", 1L, 825),
                getModItem(GregTech.ID, "gt.blockores", 1L, 842),
                getModItem(GregTech.ID, "gt.blockores", 1L, 925),
                getModItem(GregTech.ID, "gt.blockores", 1L, 85),
                getModItem(GregTech.ID, "gt.blockores", 1L, 30),
                getModItem(GregTech.ID, "gt.blockores", 1L, 828),
                getModItem(GregTech.ID, "gt.blockores", 1L, 52),
                getModItem(GregTech.ID, "gt.blockores", 1L, 389),
                getModItem(GregTech.ID, "gt.blockores", 1L, 507),
                getModItem(GregTech.ID, "gt.blockores", 1L, 513),
                getModItem(GregTech.ID, "gt.blockores", 1L, 485),
                getModItem(GregTech.ID, "gt.blockores", 1L, 855),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 834),
                getModItem(GregTech.ID, "gt.blockores", 1L, 35),
                getModItem(GregTech.ID, "gt.blockores", 1L, 870),
                getModItem(GregTech.ID, "gt.blockores", 1L, 923),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 930),
                getModItem(GregTech.ID, "gt.blockores", 1L, 931),
                getModItem(GregTech.ID, "gt.blockores", 1L, 917),
                getModItem(GregTech.ID, "gt.blockores", 1L, 871),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 387),
                getModItem(GregTech.ID, "gt.blockores", 1L, 28),
                getModItem(GregTech.ID, "gt.blockores", 1L, 390),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 500),
                getModItem(GregTech.ID, "gt.blockores", 1L, 825),
                getModItem(GregTech.ID, "gt.blockores", 1L, 841),
                getModItem(GregTech.ID, "gt.blockores", 1L, 884),
                getModItem(GregTech.ID, "gt.blockores", 1L, 90))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T3);

        // T3 - Ceres - Ce
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ce", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 922),
                getModItem(GregTech.ID, "gt.blockores", 1L, 98),
                getModItem(GregTech.ID, "gt.blockores", 1L, 98),
                getModItem(GregTech.ID, "gt.blockores", 1L, 100),
                getModItem(GregTech.ID, "gt.blockores", 1L, 96),
                getModItem(GregTech.ID, "gt.blockores", 1L, 524),
                getModItem(GregTech.ID, "gt.blockores", 1L, 525),
                getModItem(GregTech.ID, "gt.blockores", 1L, 526),
                getModItem(GregTech.ID, "gt.blockores", 1L, 823),
                getModItem(GregTech.ID, "gt.blockores", 1L, 882),
                getModItem(GregTech.ID, "gt.blockores", 1L, 942),
                getModItem(GregTech.ID, "gt.blockores", 1L, 48),
                getModItem(GregTech.ID, "gt.blockores", 1L, 883),
                getModItem(GregTech.ID, "gt.blockores", 1L, 927),
                getModItem(GregTech.ID, "gt.blockores", 1L, 908),
                getModItem(GregTech.ID, "gt.blockores", 1L, 505),
                getModItem(GregTech.ID, "gt.blockores", 1L, 933),
                getModItem(GregTech.ID, "gt.blockores", 1L, 831),
                getModItem(GregTech.ID, "gt.blockores", 1L, 838),
                getModItem(GregTech.ID, "gt.blockores", 1L, 943),
                getModItem(GregTech.ID, "gt.blockores", 1L, 921),
                getModItem(GregTech.ID, "gt.blockores", 1L, 85),
                getModItem(GregTech.ID, "gt.blockores", 1L, 30),
                getModItem(GregTech.ID, "gt.blockores", 1L, 828),
                getModItem(GregTech.ID, "gt.blockores", 1L, 52),
                getModItem(GregTech.ID, "gt.blockores", 1L, 855),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 834),
                getModItem(GregTech.ID, "gt.blockores", 1L, 35),
                getModItem(GregTech.ID, "gt.blockores", 1L, 877),
                getModItem(GregTech.ID, "gt.blockores", 1L, 902),
                getModItem(GregTech.ID, "gt.blockores", 1L, 933),
                getModItem(GregTech.ID, "gt.blockores", 1L, 909),
                getModItem(GregTech.ID, "gt.blockores", 1L, 930),
                getModItem(GregTech.ID, "gt.blockores", 1L, 931),
                getModItem(GregTech.ID, "gt.blockores", 1L, 917),
                getModItem(GregTech.ID, "gt.blockores", 1L, 871),
                getModItem(GregTech.ID, "gt.blockores", 1L, 8),
                getModItem(GregTech.ID, "gt.blockores", 1L, 501),
                getModItem(GregTech.ID, "gt.blockores", 1L, 96),
                getModItem(GregTech.ID, "gt.blockores", 1L, 836),
                getModItem(GregTech.ID, "gt.blockores", 1L, 948),
                getModItem(GregTech.ID, "gt.blockores", 1L, 812),
                getModItem(GregTech.ID, "gt.blockores", 1L, 911),
                getModItem(GregTech.ID, "gt.blockores", 1L, 870),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 923),
                getModItem(GregTech.ID, "gt.blockores", 1L, 28),
                getModItem(GregTech.ID, "gt.blockores", 1L, 393),
                getModItem(GregTech.ID, "gt.blockores", 1L, 89),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 500),
                getModItem(GregTech.ID, "gt.blockores", 1L, 825),
                getModItem(GregTech.ID, "gt.blockores", 1L, 841),
                getModItem(GregTech.ID, "gt.blockores", 1L, 90),
                getModItem(GregTech.ID, "gt.blockores", 1L, 34),
                getModItem(GregTech.ID, "gt.blockores", 1L, 391),
                getModItem(GregTech.ID, "gt.blockores", 1L, 324))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T3);

        // T3 - Europa - Eu
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Eu", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 908),
                getModItem(GregTech.ID, "gt.blockores", 1L, 917),
                getModItem(GregTech.ID, "gt.blockores", 1L, 22),
                getModItem(GregTech.ID, "gt.blockores", 1L, 510),
                getModItem(GregTech.ID, "gt.blockores", 1L, 935),
                getModItem(GregTech.ID, "gt.blockores", 1L, 936),
                getModItem(GregTech.ID, "gt.blockores", 1L, 928),
                getModItem(GregTech.ID, "gt.blockores", 1L, 934),
                getModItem(GregTech.ID, "gt.blockores", 1L, 30),
                getModItem(GregTech.ID, "gt.blockores", 1L, 841),
                getModItem(GregTech.ID, "gt.blockores", 1L, 48),
                getModItem(GregTech.ID, "gt.blockores", 1L, 31),
                getModItem(GregTech.ID, "gt.blockores", 1L, 390),
                getModItem(GregTech.ID, "gt.blockores", 1L, 510),
                getModItem(GregTech.ID, "gt.blockores", 1L, 966),
                getModItem(GregTech.ID, "gt.blockores", 1L, 488),
                getModItem(GregTech.ID, "gt.blockores", 1L, 937),
                getModItem(GregTech.ID, "gt.blockores", 1L, 938),
                getModItem(GregTech.ID, "gt.blockores", 1L, 946),
                getModItem(GregTech.ID, "gt.blockores", 1L, 948))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T3);

        // T3 - Ganymede - Ga
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ga", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 922),
                getModItem(GregTech.ID, "gt.blockores", 1L, 98),
                getModItem(GregTech.ID, "gt.blockores", 1L, 910),
                getModItem(GregTech.ID, "gt.blockores", 1L, 841),
                getModItem(GregTech.ID, "gt.blockores", 1L, 6),
                getModItem(GregTech.ID, "gt.blockores", 1L, 98),
                getModItem(GregTech.ID, "gt.blockores", 1L, 100),
                getModItem(GregTech.ID, "gt.blockores", 1L, 96),
                getModItem(GregTech.ID, "gt.blockores", 1L, 865),
                getModItem(GregTech.ID, "gt.blockores", 1L, 500),
                getModItem(GregTech.ID, "gt.blockores", 1L, 535),
                getModItem(GregTech.ID, "gt.blockores", 1L, 810),
                getModItem(GregTech.ID, "gt.blockores", 1L, 502),
                getModItem(GregTech.ID, "gt.blockores", 1L, 826),
                getModItem(GregTech.ID, "gt.blockores", 1L, 918),
                getModItem(GregTech.ID, "gt.blockores", 1L, 825),
                getModItem(GregTech.ID, "gt.blockores", 1L, 842),
                getModItem(GregTech.ID, "gt.blockores", 1L, 925),
                getModItem(GregTech.ID, "gt.blockores", 1L, 85),
                getModItem(GregTech.ID, "gt.blockores", 1L, 30),
                getModItem(GregTech.ID, "gt.blockores", 1L, 828),
                getModItem(GregTech.ID, "gt.blockores", 1L, 52),
                getModItem(GregTech.ID, "gt.blockores", 1L, 822),
                getModItem(GregTech.ID, "gt.blockores", 1L, 918),
                getModItem(GregTech.ID, "gt.blockores", 1L, 19),
                getModItem(GregTech.ID, "gt.blockores", 1L, 930),
                getModItem(GregTech.ID, "gt.blockores", 1L, 931),
                getModItem(GregTech.ID, "gt.blockores", 1L, 917),
                getModItem(GregTech.ID, "gt.blockores", 1L, 871),
                getModItem(GregTech.ID, "gt.blockores", 1L, 840),
                getModItem(GregTech.ID, "gt.blockores", 1L, 35),
                getModItem(GregTech.ID, "gt.blockores", 1L, 945),
                getModItem(GregTech.ID, "gt.blockores", 1L, 830),
                getModItem(GregTech.ID, "gt.blockores", 1L, 54),
                getModItem(GregTech.ID, "gt.blockores", 1L, 89),
                getModItem(GregTech.ID, "gt.blockores", 1L, 836),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 28),
                getModItem(GregTech.ID, "gt.blockores", 1L, 57),
                getModItem(GregTech.ID, "gt.blockores", 1L, 89),
                getModItem(GregTech.ID, "gt.blockores", 1L, 810),
                getModItem(GregTech.ID, "gt.blockores", 1L, 975),
                getModItem(GregTech.ID, "gt.blockores", 1L, 825),
                getModItem(GregTech.ID, "gt.blockores", 1L, 841),
                getModItem(GregTech.ID, "gt.blockores", 1L, 526),
                getModItem(GregTech.ID, "gt.blockores", 1L, 36))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T3);

        // T3 - Ross128b - Rb
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Rb", 1L))
            .itemOutputs(
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 2),
                getModItem(GregTech.ID, "gt.blockores", 1L, 945),
                getModItem(GregTech.ID, "gt.blockores", 1L, 90),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 1),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 9),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 5),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 7),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 8),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 10),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 11),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 12),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 13),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 11),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 17),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 12),
                getModItem(GregTech.ID, "gt.blockores", 1L, 910),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 16),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 14),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 15),
                getModItem(GregTech.ID, "gt.blockores", 1L, 840),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 18),
                getModItem(GregTech.ID, "gt.blockores", 1L, 922),
                getModItem(GregTech.ID, "gt.blockores", 1L, 907),
                getModItem(GregTech.ID, "gt.blockores", 1L, 920),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 23),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 28),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 19),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 29),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 24),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 23),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 27),
                getModItem(BartWorks.ID, "bw.blockores.01", 1L, 26))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T3);
    }
}
