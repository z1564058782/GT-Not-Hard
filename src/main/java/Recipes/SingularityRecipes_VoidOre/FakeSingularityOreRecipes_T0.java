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

public class FakeSingularityOreRecipes_T0 {

    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T0 = RecipeMapBuilder
        .of("Singularity of Void Ore T0")
        .maxIO(1, 135, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend::new)
        .build();

    public static void addFakeVoidOreRecipes_T0() {
        // T0 - Overworld - Ow
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ow", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 865),
                getModItem(GregTech.ID, "gt.blockores", 1L, 500),
                getModItem(GregTech.ID, "gt.blockores", 1L, 535),
                getModItem(GregTech.ID, "gt.blockores", 1L, 524),
                getModItem(GregTech.ID, "gt.blockores", 1L, 525),
                getModItem(GregTech.ID, "gt.blockores", 1L, 526),
                getModItem(GregTech.ID, "gt.blockores", 1L, 823),
                getModItem(GregTech.ID, "gt.blockores", 1L, 855),
                getModItem(GregTech.ID, "gt.blockores", 1L, 932),
                getModItem(GregTech.ID, "gt.blockores", 1L, 824),
                getModItem(GregTech.ID, "gt.blockores", 1L, 911),
                getModItem(GregTech.ID, "gt.blockores", 1L, 878),
                getModItem(GregTech.ID, "gt.blockores", 1L, 535),
                getModItem(GregTech.ID, "gt.blockores", 1L, 538),
                getModItem(GregTech.ID, "gt.blockores", 1L, 831),
                getModItem(GregTech.ID, "gt.blockores", 1L, 838),
                getModItem(GregTech.ID, "gt.blockores", 1L, 943),
                getModItem(GregTech.ID, "gt.blockores", 1L, 921),
                getModItem(GregTech.ID, "gt.blockores", 1L, 810),
                getModItem(GregTech.ID, "gt.blockores", 1L, 502),
                getModItem(GregTech.ID, "gt.blockores", 1L, 826),
                getModItem(GregTech.ID, "gt.blockores", 1L, 924),
                getModItem(GregTech.ID, "gt.blockores", 1L, 901),
                getModItem(GregTech.ID, "gt.blockores", 1L, 824),
                getModItem(GregTech.ID, "gt.blockores", 1L, 919),
                getModItem(GregTech.ID, "gt.blockores", 1L, 914),
                getModItem(GregTech.ID, "gt.blockores", 1L, 915),
                getModItem(GregTech.ID, "gt.blockores", 1L, 903),
                getModItem(GregTech.ID, "gt.blockores", 1L, 821),
                getModItem(GregTech.ID, "gt.blockores", 1L, 855),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 834),
                getModItem(GregTech.ID, "gt.blockores", 1L, 35),
                getModItem(GregTech.ID, "gt.blockores", 1L, 877),
                getModItem(GregTech.ID, "gt.blockores", 1L, 902),
                getModItem(GregTech.ID, "gt.blockores", 1L, 933),
                getModItem(GregTech.ID, "gt.blockores", 1L, 909),
                getModItem(GregTech.ID, "gt.blockores", 1L, 870),
                getModItem(GregTech.ID, "gt.blockores", 1L, 923),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 929),
                getModItem(GregTech.ID, "gt.blockores", 1L, 916),
                getModItem(GregTech.ID, "gt.blockores", 1L, 928),
                getModItem(GregTech.ID, "gt.blockores", 1L, 949),
                getModItem(GregTech.ID, "gt.blockores", 1L, 930),
                getModItem(GregTech.ID, "gt.blockores", 1L, 931),
                getModItem(GregTech.ID, "gt.blockores", 1L, 917),
                getModItem(GregTech.ID, "gt.blockores", 1L, 871),
                getModItem(GregTech.ID, "gt.blockores", 1L, 538),
                getModItem(GregTech.ID, "gt.blockores", 1L, 535),
                getModItem(GregTech.ID, "gt.blockores", 1L, 530),
                getModItem(GregTech.ID, "gt.blockores", 1L, 534),
                getModItem(GregTech.ID, "gt.blockores", 1L, 607),
                getModItem(GregTech.ID, "gt.blockores", 1L, 935),
                getModItem(GregTech.ID, "gt.blockores", 1L, 936),
                getModItem(GregTech.ID, "gt.blockores", 1L, 928),
                getModItem(GregTech.ID, "gt.blockores", 1L, 934),
                getModItem(GregTech.ID, "gt.blockores", 1L, 870),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 923),
                getModItem(GregTech.ID, "gt.blockores", 1L, 937),
                getModItem(GregTech.ID, "gt.blockores", 1L, 938),
                getModItem(GregTech.ID, "gt.blockores", 1L, 946),
                getModItem(GregTech.ID, "gt.blockores", 1L, 948),
                getModItem(GregTech.ID, "gt.blockores", 1L, 944),
                getModItem(GregTech.ID, "gt.blockores", 1L, 817),
                getModItem(GregTech.ID, "gt.blockores", 1L, 907),
                getModItem(GregTech.ID, "gt.blockores", 1L, 920),
                getModItem(GregTech.ID, "gt.blockores", 1L, 57),
                getModItem(GregTech.ID, "gt.blockores", 1L, 824),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 35),
                getModItem(GregTech.ID, "gt.blockores", 1L, 54),
                getModItem(GregTech.ID, "gt.blockores", 1L, 57),
                getModItem(GregTech.ID, "gt.blockores", 1L, 810),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 500),
                getModItem(GregTech.ID, "gt.blockores", 1L, 526),
                getModItem(GregTech.ID, "gt.blockores", 1L, 535),
                getModItem(GregTech.ID, "gt.blockores", 1L, 36),
                getModItem(GregTech.ID, "gt.blockores", 1L, 34))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T0);

        // T0 - Nether - Ne
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ne", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 22),
                getModItem(GregTech.ID, "gt.blockores", 1L, 834),
                getModItem(GregTech.ID, "gt.blockores", 1L, 839),
                getModItem(GregTech.ID, "gt.blockores", 1L, 882),
                getModItem(GregTech.ID, "gt.blockores", 1L, 942),
                getModItem(GregTech.ID, "gt.blockores", 1L, 48),
                getModItem(GregTech.ID, "gt.blockores", 1L, 883),
                getModItem(GregTech.ID, "gt.blockores", 1L, 831),
                getModItem(GregTech.ID, "gt.blockores", 1L, 838),
                getModItem(GregTech.ID, "gt.blockores", 1L, 943),
                getModItem(GregTech.ID, "gt.blockores", 1L, 921),
                getModItem(GregTech.ID, "gt.blockores", 1L, 523),
                getModItem(GregTech.ID, "gt.blockores", 1L, 904),
                getModItem(GregTech.ID, "gt.blockores", 1L, 516),
                getModItem(GregTech.ID, "gt.blockores", 1L, 810),
                getModItem(GregTech.ID, "gt.blockores", 1L, 502),
                getModItem(GregTech.ID, "gt.blockores", 1L, 826),
                getModItem(GregTech.ID, "gt.blockores", 1L, 855),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 834),
                getModItem(GregTech.ID, "gt.blockores", 1L, 35),
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
                getModItem(GregTech.ID, "gt.blockores", 1L, 840),
                getModItem(GregTech.ID, "gt.blockores", 1L, 35),
                getModItem(GregTech.ID, "gt.blockores", 1L, 945),
                getModItem(GregTech.ID, "gt.blockores", 1L, 522),
                getModItem(GregTech.ID, "gt.blockores", 1L, 523),
                getModItem(GregTech.ID, "gt.blockores", 1L, 836),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 35),
                getModItem(GregTech.ID, "gt.blockores", 1L, 54),
                getModItem(GregTech.ID, "gt.blockores", 1L, 57),
                getModItem(GregTech.ID, "gt.blockores", 1L, 89),
                getModItem(GregTech.ID, "gt.blockores", 1L, 810),
                getModItem(GregTech.ID, "gt.blockores", 1L, 516),
                getModItem(GregTech.ID, "gt.blockores", 1L, 22),
                getModItem(GregTech.ID, "gt.blockores", 1L, 522),
                getModItem(GregTech.ID, "gt.blockores", 1L, 90),
                getModItem(GregTech.ID, "gt.blockores", 1L, 36),
                getModItem(GregTech.ID, "gt.blockores", 1L, 913))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T0);

        // T0 - Twilight - TF
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_TF", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 865),
                getModItem(GregTech.ID, "gt.blockores", 1L, 500),
                getModItem(GregTech.ID, "gt.blockores", 1L, 535),
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
                getModItem(GregTech.ID, "gt.blockores", 1L, 542),
                getModItem(GregTech.ID, "gt.blockores", 1L, 540),
                getModItem(GregTech.ID, "gt.blockores", 1L, 514),
                getModItem(GregTech.ID, "gt.blockores", 1L, 826),
                getModItem(GregTech.ID, "gt.blockores", 1L, 535),
                getModItem(GregTech.ID, "gt.blockores", 1L, 538),
                getModItem(GregTech.ID, "gt.blockores", 1L, 820),
                getModItem(GregTech.ID, "gt.blockores", 1L, 835),
                getModItem(GregTech.ID, "gt.blockores", 1L, 503),
                getModItem(GregTech.ID, "gt.blockores", 1L, 504),
                getModItem(GregTech.ID, "gt.blockores", 1L, 830),
                getModItem(GregTech.ID, "gt.blockores", 1L, 54),
                getModItem(GregTech.ID, "gt.blockores", 1L, 89),
                getModItem(GregTech.ID, "gt.blockores", 1L, 699),
                getModItem(GregTech.ID, "gt.blockores", 1L, 906),
                getModItem(GregTech.ID, "gt.blockores", 1L, 34),
                getModItem(GregTech.ID, "gt.blockores", 1L, 827),
                getModItem(GregTech.ID, "gt.blockores", 1L, 909),
                getModItem(GregTech.ID, "gt.blockores", 1L, 877),
                getModItem(GregTech.ID, "gt.blockores", 1L, 902),
                getModItem(GregTech.ID, "gt.blockores", 1L, 933),
                getModItem(GregTech.ID, "gt.blockores", 1L, 909),
                getModItem(GregTech.ID, "gt.blockores", 1L, 544),
                getModItem(GregTech.ID, "gt.blockores", 1L, 545),
                getModItem(GregTech.ID, "gt.blockores", 1L, 514),
                getModItem(GregTech.ID, "gt.blockores", 1L, 826),
                getModItem(GregTech.ID, "gt.blockores", 1L, 870),
                getModItem(GregTech.ID, "gt.blockores", 1L, 923),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 930),
                getModItem(GregTech.ID, "gt.blockores", 1L, 931),
                getModItem(GregTech.ID, "gt.blockores", 1L, 917),
                getModItem(GregTech.ID, "gt.blockores", 1L, 871),
                getModItem(GregTech.ID, "gt.blockores", 1L, 530),
                getModItem(GregTech.ID, "gt.blockores", 1L, 534),
                getModItem(GregTech.ID, "gt.blockores", 1L, 607),
                getModItem(GregTech.ID, "gt.blockores", 1L, 870),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 923),
                getModItem(GregTech.ID, "gt.blockores", 1L, 944),
                getModItem(GregTech.ID, "gt.blockores", 1L, 817),
                getModItem(GregTech.ID, "gt.blockores", 1L, 907),
                getModItem(GregTech.ID, "gt.blockores", 1L, 920),
                getModItem(GregTech.ID, "gt.blockores", 1L, 57),
                getModItem(GregTech.ID, "gt.blockores", 1L, 824),
                getModItem(GregTech.ID, "gt.blockores", 1L, 543),
                getModItem(GregTech.ID, "gt.blockores", 1L, 541),
                getModItem(GregTech.ID, "gt.blockores", 1L, 514),
                getModItem(GregTech.ID, "gt.blockores", 1L, 826),
                getModItem(GregTech.ID, "gt.blockores", 1L, 509),
                getModItem(GregTech.ID, "gt.blockores", 1L, 528),
                getModItem(GregTech.ID, "gt.blockores", 1L, 508),
                getModItem(GregTech.ID, "gt.blockores", 1L, 836),
                getModItem(GregTech.ID, "gt.blockores", 1L, 512),
                getModItem(GregTech.ID, "gt.blockores", 1L, 510),
                getModItem(GregTech.ID, "gt.blockores", 1L, 502),
                getModItem(GregTech.ID, "gt.blockores", 1L, 89),
                getModItem(GregTech.ID, "gt.blockores", 1L, 501),
                getModItem(GregTech.ID, "gt.blockores", 1L, 514),
                getModItem(GregTech.ID, "gt.blockores", 1L, 513),
                getModItem(GregTech.ID, "gt.blockores", 1L, 507),
                getModItem(GregTech.ID, "gt.blockores", 1L, 537),
                getModItem(GregTech.ID, "gt.blockores", 1L, 527),
                getModItem(GregTech.ID, "gt.blockores", 1L, 504),
                getModItem(GregTech.ID, "gt.blockores", 1L, 503),
                getModItem(GregTech.ID, "gt.blockores", 1L, 511),
                getModItem(GregTech.ID, "gt.blockores", 1L, 505))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T0);

        // T0 - TheEnd - ED
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_ED", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 882),
                getModItem(GregTech.ID, "gt.blockores", 1L, 942),
                getModItem(GregTech.ID, "gt.blockores", 1L, 48),
                getModItem(GregTech.ID, "gt.blockores", 1L, 883),
                getModItem(GregTech.ID, "gt.blockores", 1L, 906),
                getModItem(GregTech.ID, "gt.blockores", 1L, 34),
                getModItem(GregTech.ID, "gt.blockores", 1L, 827),
                getModItem(GregTech.ID, "gt.blockores", 1L, 909),
                getModItem(GregTech.ID, "gt.blockores", 1L, 855),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 834),
                getModItem(GregTech.ID, "gt.blockores", 1L, 35),
                getModItem(GregTech.ID, "gt.blockores", 1L, 870),
                getModItem(GregTech.ID, "gt.blockores", 1L, 923),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 8),
                getModItem(GregTech.ID, "gt.blockores", 1L, 501),
                getModItem(GregTech.ID, "gt.blockores", 1L, 96),
                getModItem(GregTech.ID, "gt.blockores", 1L, 840),
                getModItem(GregTech.ID, "gt.blockores", 1L, 35),
                getModItem(GregTech.ID, "gt.blockores", 1L, 945),
                getModItem(GregTech.ID, "gt.blockores", 1L, 57),
                getModItem(GregTech.ID, "gt.blockores", 1L, 824),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 35),
                getModItem(GregTech.ID, "gt.blockores", 1L, 54),
                getModItem(GregTech.ID, "gt.blockores", 1L, 57),
                getModItem(GregTech.ID, "gt.blockores", 1L, 89),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 36),
                getModItem(GregTech.ID, "gt.blockores", 1L, 34))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T0);

        // T0 - EndAsteroid - EA
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_EA", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 910),
                getModItem(GregTech.ID, "gt.blockores", 1L, 841),
                getModItem(GregTech.ID, "gt.blockores", 1L, 6),
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
                getModItem(GregTech.ID, "gt.blockores", 1L, 906),
                getModItem(GregTech.ID, "gt.blockores", 1L, 34),
                getModItem(GregTech.ID, "gt.blockores", 1L, 827),
                getModItem(GregTech.ID, "gt.blockores", 1L, 909),
                getModItem(GregTech.ID, "gt.blockores", 1L, 855),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 834),
                getModItem(GregTech.ID, "gt.blockores", 1L, 35),
                getModItem(GregTech.ID, "gt.blockores", 1L, 870),
                getModItem(GregTech.ID, "gt.blockores", 1L, 923),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 8),
                getModItem(GregTech.ID, "gt.blockores", 1L, 501),
                getModItem(GregTech.ID, "gt.blockores", 1L, 96),
                getModItem(GregTech.ID, "gt.blockores", 1L, 828),
                getModItem(GregTech.ID, "gt.blockores", 1L, 52),
                getModItem(GregTech.ID, "gt.blockores", 1L, 85),
                getModItem(GregTech.ID, "gt.blockores", 1L, 84),
                getModItem(GregTech.ID, "gt.blockores", 1L, 840),
                getModItem(GregTech.ID, "gt.blockores", 1L, 35),
                getModItem(GregTech.ID, "gt.blockores", 1L, 945),
                getModItem(GregTech.ID, "gt.blockores", 1L, 324),
                getModItem(GregTech.ID, "gt.blockores", 1L, 326),
                getModItem(GregTech.ID, "gt.blockores", 1L, 57),
                getModItem(GregTech.ID, "gt.blockores", 1L, 824),
                getModItem(GregTech.ID, "gt.blockores", 1L, 54),
                getModItem(GregTech.ID, "gt.blockores", 1L, 57),
                getModItem(GregTech.ID, "gt.blockores", 1L, 89),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 36),
                getModItem(GregTech.ID, "gt.blockores", 1L, 34))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T0);
    }
}
