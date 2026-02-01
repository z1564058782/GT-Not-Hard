package Recipes.SingularityRecipes_VoidOre;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.NEIOrePlugin;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.OneToManyItemsFrontend;

public class FakeSingularityOreRecipes_T9 {

    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T9 = RecipeMapBuilder
        .of("Singularity of Void Ore T9")
        .maxIO(1, 135, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend::new)
        .build();

    public static void addFakeVoidOreRecipes_T9() {
        // T9 - Anubis - An
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_An", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 22),
                getModItem(GregTech.ID, "gt.blockores", 1L, 834),
                getModItem(GregTech.ID, "gt.blockores", 1L, 839),
                getModItem(GregTech.ID, "gt.blockores", 1L, 129),
                getModItem(GregTech.ID, "gt.blockores", 1L, 319),
                getModItem(GregTech.ID, "gt.blockores", 1L, 394),
                getModItem(GregTech.ID, "gt.blockores", 1L, 395),
                getModItem(GregTech.ID, "gt.blockores", 1L, 927),
                getModItem(GregTech.ID, "gt.blockores", 1L, 908),
                getModItem(GregTech.ID, "gt.blockores", 1L, 505),
                getModItem(GregTech.ID, "gt.blockores", 1L, 933),
                getModItem(GregTech.ID, "gt.blockores", 1L, 884),
                getModItem(GregTech.ID, "gt.blockores", 1L, 910),
                getModItem(GregTech.ID, "gt.blockores", 1L, 841),
                getModItem(GregTech.ID, "gt.blockores", 1L, 924),
                getModItem(GregTech.ID, "gt.blockores", 1L, 901),
                getModItem(GregTech.ID, "gt.blockores", 1L, 824),
                getModItem(GregTech.ID, "gt.blockores", 1L, 919),
                getModItem(GregTech.ID, "gt.blockores", 1L, 830),
                getModItem(GregTech.ID, "gt.blockores", 1L, 54),
                getModItem(GregTech.ID, "gt.blockores", 1L, 89),
                getModItem(GregTech.ID, "gt.blockores", 1L, 699),
                getModItem(GregTech.ID, "gt.blockores", 1L, 914),
                getModItem(GregTech.ID, "gt.blockores", 1L, 915),
                getModItem(GregTech.ID, "gt.blockores", 1L, 903),
                getModItem(GregTech.ID, "gt.blockores", 1L, 821),
                getModItem(GregTech.ID, "gt.blockores", 1L, 389),
                getModItem(GregTech.ID, "gt.blockores", 1L, 507),
                getModItem(GregTech.ID, "gt.blockores", 1L, 513),
                getModItem(GregTech.ID, "gt.blockores", 1L, 485),
                getModItem(GregTech.ID, "gt.blockores", 1L, 877),
                getModItem(GregTech.ID, "gt.blockores", 1L, 902),
                getModItem(GregTech.ID, "gt.blockores", 1L, 933),
                getModItem(GregTech.ID, "gt.blockores", 1L, 909),
                getModItem(GregTech.ID, "gt.blockores", 1L, 387),
                getModItem(GregTech.ID, "gt.blockores", 1L, 511),
                getModItem(GregTech.ID, "gt.blockores", 1L, 952),
                getModItem(GregTech.ID, "gt.blockores", 1L, 489),
                getModItem(GregTech.ID, "gt.blockores", 1L, 375),
                getModItem(GregTech.ID, "gt.blockores", 1L, 28),
                getModItem(GregTech.ID, "gt.blockores", 1L, 822),
                getModItem(GregTech.ID, "gt.blockores", 1L, 340),
                getModItem(GregTech.ID, "gt.blockores", 1L, 935),
                getModItem(GregTech.ID, "gt.blockores", 1L, 936),
                getModItem(GregTech.ID, "gt.blockores", 1L, 928),
                getModItem(GregTech.ID, "gt.blockores", 1L, 934),
                getModItem(GregTech.ID, "gt.blockores", 1L, 394))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T9);

        // T9 - Horus - Ho
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ho", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 908),
                getModItem(GregTech.ID, "gt.blockores", 1L, 917),
                getModItem(GregTech.ID, "gt.blockores", 1L, 22),
                getModItem(GregTech.ID, "gt.blockores", 1L, 510),
                getModItem(GregTech.ID, "gt.blockores", 1L, 516),
                getModItem(GregTech.ID, "gt.blockores", 1L, 517),
                getModItem(GregTech.ID, "gt.blockores", 1L, 939),
                getModItem(GregTech.ID, "gt.blockores", 1L, 523),
                getModItem(GregTech.ID, "gt.blockores", 1L, 904),
                getModItem(GregTech.ID, "gt.blockores", 1L, 516),
                getModItem(GregTech.ID, "gt.blockores", 1L, 975),
                getModItem(GregTech.ID, "gt.blockores", 1L, 812),
                getModItem(GregTech.ID, "gt.blockores", 1L, 537),
                getModItem(GregTech.ID, "gt.blockores", 1L, 529),
                getModItem(GregTech.ID, "gt.blockores", 1L, 820),
                getModItem(GregTech.ID, "gt.blockores", 1L, 835),
                getModItem(GregTech.ID, "gt.blockores", 1L, 503),
                getModItem(GregTech.ID, "gt.blockores", 1L, 504),
                getModItem(GregTech.ID, "gt.blockores", 1L, 388),
                getModItem(GregTech.ID, "gt.blockores", 1L, 527),
                getModItem(GregTech.ID, "gt.blockores", 1L, 528),
                getModItem(GregTech.ID, "gt.blockores", 1L, 941),
                getModItem(GregTech.ID, "gt.blockores", 1L, 129),
                getModItem(GregTech.ID, "gt.blockores", 1L, 982),
                getModItem(GregTech.ID, "gt.blockores", 1L, 388),
                getModItem(GregTech.ID, "gt.blockores", 1L, 395),
                getModItem(GregTech.ID, "gt.blockores", 1L, 387),
                getModItem(GregTech.ID, "gt.blockores", 1L, 511),
                getModItem(GregTech.ID, "gt.blockores", 1L, 952),
                getModItem(GregTech.ID, "gt.blockores", 1L, 489),
                getModItem(GregTech.ID, "gt.blockores", 1L, 938),
                getModItem(GregTech.ID, "gt.blockores", 1L, 506),
                getModItem(GregTech.ID, "gt.blockores", 1L, 527),
                getModItem(GregTech.ID, "gt.blockores", 1L, 528),
                getModItem(GregTech.ID, "gt.blockores", 1L, 527),
                getModItem(GregTech.ID, "gt.blockores", 1L, 528),
                getModItem(GregTech.ID, "gt.blockores", 1L, 912),
                getModItem(GregTech.ID, "gt.blockores", 1L, 913),
                getModItem(GregTech.ID, "gt.blockores", 1L, 393),
                getModItem(GregTech.ID, "gt.blockores", 1L, 508),
                getModItem(GregTech.ID, "gt.blockores", 1L, 951),
                getModItem(GregTech.ID, "gt.blockores", 1L, 900),
                getModItem(GregTech.ID, "gt.blockores", 1L, 391),
                getModItem(GregTech.ID, "gt.blockores", 1L, 509),
                getModItem(GregTech.ID, "gt.blockores", 1L, 375),
                getModItem(GregTech.ID, "gt.blockores", 1L, 382),
                getModItem(GregTech.ID, "gt.blockores", 1L, 390),
                getModItem(GregTech.ID, "gt.blockores", 1L, 510),
                getModItem(GregTech.ID, "gt.blockores", 1L, 966),
                getModItem(GregTech.ID, "gt.blockores", 1L, 488),
                getModItem(GregTech.ID, "gt.blockores", 1L, 509),
                getModItem(GregTech.ID, "gt.blockores", 1L, 527),
                getModItem(GregTech.ID, "gt.blockores", 1L, 528),
                getModItem(GregTech.ID, "gt.blockores", 1L, 508),
                getModItem(GregTech.ID, "gt.blockores", 1L, 512),
                getModItem(GregTech.ID, "gt.blockores", 1L, 510),
                getModItem(GregTech.ID, "gt.blockores", 1L, 517),
                getModItem(GregTech.ID, "gt.blockores", 1L, 387),
                getModItem(GregTech.ID, "gt.blockores", 1L, 502),
                getModItem(GregTech.ID, "gt.blockores", 1L, 501),
                getModItem(GregTech.ID, "gt.blockores", 1L, 513),
                getModItem(GregTech.ID, "gt.blockores", 1L, 507),
                getModItem(GregTech.ID, "gt.blockores", 1L, 516),
                getModItem(GregTech.ID, "gt.blockores", 1L, 537),
                getModItem(GregTech.ID, "gt.blockores", 1L, 504),
                getModItem(GregTech.ID, "gt.blockores", 1L, 503),
                getModItem(GregTech.ID, "gt.blockores", 1L, 511),
                getModItem(GregTech.ID, "gt.blockores", 1L, 505))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T9);

        // T9 - Maahes - Mh
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mh", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 324),
                getModItem(GregTech.ID, "gt.blockores", 1L, 326),
                getModItem(GregTech.ID, "gt.blockores", 1L, 327),
                getModItem(GregTech.ID, "gt.blockores", 1L, 868),
                getModItem(GregTech.ID, "gt.blockores", 1L, 830),
                getModItem(GregTech.ID, "gt.blockores", 1L, 54),
                getModItem(GregTech.ID, "gt.blockores", 1L, 89),
                getModItem(GregTech.ID, "gt.blockores", 1L, 699),
                getModItem(GregTech.ID, "gt.blockores", 1L, 389),
                getModItem(GregTech.ID, "gt.blockores", 1L, 507),
                getModItem(GregTech.ID, "gt.blockores", 1L, 513),
                getModItem(GregTech.ID, "gt.blockores", 1L, 485),
                getModItem(GregTech.ID, "gt.blockores", 1L, 29),
                getModItem(GregTech.ID, "gt.blockores", 1L, 870),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 30),
                getModItem(GregTech.ID, "gt.blockores", 1L, 877),
                getModItem(GregTech.ID, "gt.blockores", 1L, 902),
                getModItem(GregTech.ID, "gt.blockores", 1L, 933),
                getModItem(GregTech.ID, "gt.blockores", 1L, 909),
                getModItem(GregTech.ID, "gt.blockores", 1L, 129),
                getModItem(GregTech.ID, "gt.blockores", 1L, 319),
                getModItem(GregTech.ID, "gt.blockores", 1L, 324),
                getModItem(GregTech.ID, "gt.blockores", 1L, 28),
                getModItem(GregTech.ID, "gt.blockores", 1L, 828),
                getModItem(GregTech.ID, "gt.blockores", 1L, 52),
                getModItem(GregTech.ID, "gt.blockores", 1L, 85),
                getModItem(GregTech.ID, "gt.blockores", 1L, 84),
                getModItem(GregTech.ID, "gt.blockores", 1L, 324),
                getModItem(GregTech.ID, "gt.blockores", 1L, 326),
                getModItem(GregTech.ID, "gt.blockores", 1L, 935),
                getModItem(GregTech.ID, "gt.blockores", 1L, 936),
                getModItem(GregTech.ID, "gt.blockores", 1L, 928),
                getModItem(GregTech.ID, "gt.blockores", 1L, 934),
                getModItem(GregTech.ID, "gt.blockores", 1L, 391),
                getModItem(GregTech.ID, "gt.blockores", 1L, 509),
                getModItem(GregTech.ID, "gt.blockores", 1L, 375),
                getModItem(GregTech.ID, "gt.blockores", 1L, 382),
                getModItem(GregTech.ID, "gt.blockores", 1L, 30),
                getModItem(GregTech.ID, "gt.blockores", 1L, 841),
                getModItem(GregTech.ID, "gt.blockores", 1L, 48),
                getModItem(GregTech.ID, "gt.blockores", 1L, 31))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T9);

        // T9 - MehenBelt - MB
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_MB", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 922),
                getModItem(GregTech.ID, "gt.blockores", 1L, 98),
                getModItem(GregTech.ID, "gt.blockores", 1L, 524),
                getModItem(GregTech.ID, "gt.blockores", 1L, 525),
                getModItem(GregTech.ID, "gt.blockores", 1L, 526),
                getModItem(GregTech.ID, "gt.blockores", 1L, 823),
                getModItem(GregTech.ID, "gt.blockores", 1L, 975),
                getModItem(GregTech.ID, "gt.blockores", 1L, 976),
                getModItem(GregTech.ID, "gt.blockores", 1L, 506),
                getModItem(GregTech.ID, "gt.blockores", 1L, 927),
                getModItem(GregTech.ID, "gt.blockores", 1L, 908),
                getModItem(GregTech.ID, "gt.blockores", 1L, 505),
                getModItem(GregTech.ID, "gt.blockores", 1L, 933),
                getModItem(GregTech.ID, "gt.blockores", 1L, 34),
                getModItem(GregTech.ID, "gt.blockores", 1L, 83),
                getModItem(GregTech.ID, "gt.blockores", 1L, 84),
                getModItem(GregTech.ID, "gt.blockores", 1L, 906),
                getModItem(GregTech.ID, "gt.blockores", 1L, 34),
                getModItem(GregTech.ID, "gt.blockores", 1L, 827),
                getModItem(GregTech.ID, "gt.blockores", 1L, 909),
                getModItem(GregTech.ID, "gt.blockores", 1L, 918),
                getModItem(GregTech.ID, "gt.blockores", 1L, 825),
                getModItem(GregTech.ID, "gt.blockores", 1L, 842),
                getModItem(GregTech.ID, "gt.blockores", 1L, 925),
                getModItem(GregTech.ID, "gt.blockores", 1L, 85),
                getModItem(GregTech.ID, "gt.blockores", 1L, 30),
                getModItem(GregTech.ID, "gt.blockores", 1L, 828),
                getModItem(GregTech.ID, "gt.blockores", 1L, 52),
                getModItem(GregTech.ID, "gt.blockores", 1L, 129),
                getModItem(GregTech.ID, "gt.blockores", 1L, 319),
                getModItem(GregTech.ID, "gt.blockores", 1L, 324),
                getModItem(GregTech.ID, "gt.blockores", 1L, 28),
                getModItem(GregTech.ID, "gt.blockores", 1L, 828),
                getModItem(GregTech.ID, "gt.blockores", 1L, 52),
                getModItem(GregTech.ID, "gt.blockores", 1L, 85),
                getModItem(GregTech.ID, "gt.blockores", 1L, 84),
                getModItem(GregTech.ID, "gt.blockores", 1L, 34),
                getModItem(GregTech.ID, "gt.blockores", 1L, 84),
                getModItem(GregTech.ID, "gt.blockores", 1L, 52),
                getModItem(GregTech.ID, "gt.blockores", 1L, 331),
                getModItem(GregTech.ID, "gt.blockores", 1L, 57),
                getModItem(GregTech.ID, "gt.blockores", 1L, 824),
                getModItem(GregTech.ID, "gt.blockores", 1L, 28),
                getModItem(GregTech.ID, "gt.blockores", 1L, 57),
                getModItem(GregTech.ID, "gt.blockores", 1L, 129),
                getModItem(GregTech.ID, "gt.blockores", 1L, 825),
                getModItem(GregTech.ID, "gt.blockores", 1L, 526),
                getModItem(GregTech.ID, "gt.blockores", 1L, 34),
                getModItem(GregTech.ID, "gt.blockores", 1L, 505))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T9);

        // T9 - Neper - Np
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Np", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 81),
                getModItem(GregTech.ID, "gt.blockores", 1L, 20),
                getModItem(GregTech.ID, "gt.blockores", 1L, 829),
                getModItem(GregTech.ID, "gt.blockores", 1L, 336),
                getModItem(GregTech.ID, "gt.blockores", 1L, 542),
                getModItem(GregTech.ID, "gt.blockores", 1L, 540),
                getModItem(GregTech.ID, "gt.blockores", 1L, 514),
                getModItem(GregTech.ID, "gt.blockores", 1L, 826),
                getModItem(GregTech.ID, "gt.blockores", 1L, 516),
                getModItem(GregTech.ID, "gt.blockores", 1L, 517),
                getModItem(GregTech.ID, "gt.blockores", 1L, 939),
                getModItem(GregTech.ID, "gt.blockores", 1L, 523),
                getModItem(GregTech.ID, "gt.blockores", 1L, 904),
                getModItem(GregTech.ID, "gt.blockores", 1L, 516),
                getModItem(GregTech.ID, "gt.blockores", 1L, 515),
                getModItem(GregTech.ID, "gt.blockores", 1L, 398),
                getModItem(GregTech.ID, "gt.blockores", 1L, 529),
                getModItem(GregTech.ID, "gt.blockores", 1L, 924),
                getModItem(GregTech.ID, "gt.blockores", 1L, 901),
                getModItem(GregTech.ID, "gt.blockores", 1L, 824),
                getModItem(GregTech.ID, "gt.blockores", 1L, 919),
                getModItem(GregTech.ID, "gt.blockores", 1L, 914),
                getModItem(GregTech.ID, "gt.blockores", 1L, 915),
                getModItem(GregTech.ID, "gt.blockores", 1L, 903),
                getModItem(GregTech.ID, "gt.blockores", 1L, 821),
                getModItem(GregTech.ID, "gt.blockores", 1L, 39),
                getModItem(GregTech.ID, "gt.blockores", 1L, 90),
                getModItem(GregTech.ID, "gt.blockores", 1L, 58),
                getModItem(GregTech.ID, "gt.blockores", 1L, 544),
                getModItem(GregTech.ID, "gt.blockores", 1L, 545),
                getModItem(GregTech.ID, "gt.blockores", 1L, 514),
                getModItem(GregTech.ID, "gt.blockores", 1L, 826),
                getModItem(GregTech.ID, "gt.blockores", 1L, 929),
                getModItem(GregTech.ID, "gt.blockores", 1L, 916),
                getModItem(GregTech.ID, "gt.blockores", 1L, 928),
                getModItem(GregTech.ID, "gt.blockores", 1L, 949),
                getModItem(GregTech.ID, "gt.blockores", 1L, 543),
                getModItem(GregTech.ID, "gt.blockores", 1L, 541),
                getModItem(GregTech.ID, "gt.blockores", 1L, 514),
                getModItem(GregTech.ID, "gt.blockores", 1L, 826),
                getModItem(GregTech.ID, "gt.blockores", 1L, 522),
                getModItem(GregTech.ID, "gt.blockores", 1L, 523))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T9);

        // T9 - Seth - Se
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Se", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 34),
                getModItem(GregTech.ID, "gt.blockores", 1L, 83),
                getModItem(GregTech.ID, "gt.blockores", 1L, 84),
                getModItem(GregTech.ID, "gt.blockores", 1L, 69),
                getModItem(GregTech.ID, "gt.blockores", 1L, 67),
                getModItem(GregTech.ID, "gt.blockores", 1L, 956),
                getModItem(GregTech.ID, "gt.blockores", 1L, 975),
                getModItem(GregTech.ID, "gt.blockores", 1L, 812),
                getModItem(GregTech.ID, "gt.blockores", 1L, 537),
                getModItem(GregTech.ID, "gt.blockores", 1L, 529),
                getModItem(GregTech.ID, "gt.blockores", 1L, 905),
                getModItem(GregTech.ID, "gt.blockores", 1L, 520),
                getModItem(GregTech.ID, "gt.blockores", 1L, 67),
                getModItem(GregTech.ID, "gt.blockores", 1L, 85),
                getModItem(GregTech.ID, "gt.blockores", 1L, 30),
                getModItem(GregTech.ID, "gt.blockores", 1L, 828),
                getModItem(GregTech.ID, "gt.blockores", 1L, 52),
                getModItem(GregTech.ID, "gt.blockores", 1L, 822),
                getModItem(GregTech.ID, "gt.blockores", 1L, 918),
                getModItem(GregTech.ID, "gt.blockores", 1L, 19),
                getModItem(GregTech.ID, "gt.blockores", 1L, 870),
                getModItem(GregTech.ID, "gt.blockores", 1L, 923),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 110),
                getModItem(GregTech.ID, "gt.blockores", 1L, 812),
                getModItem(GregTech.ID, "gt.blockores", 1L, 69),
                getModItem(GregTech.ID, "gt.blockores", 1L, 870),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 923),
                getModItem(GregTech.ID, "gt.blockores", 1L, 34),
                getModItem(GregTech.ID, "gt.blockores", 1L, 84),
                getModItem(GregTech.ID, "gt.blockores", 1L, 52),
                getModItem(GregTech.ID, "gt.blockores", 1L, 331),
                getModItem(GregTech.ID, "gt.blockores", 1L, 57),
                getModItem(GregTech.ID, "gt.blockores", 1L, 824),
                getModItem(GregTech.ID, "gt.blockores", 1L, 976),
                getModItem(GregTech.ID, "gt.blockores", 1L, 975))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T9);
    }
}
