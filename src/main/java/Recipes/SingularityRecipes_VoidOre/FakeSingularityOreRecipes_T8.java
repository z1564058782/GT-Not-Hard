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

public class FakeSingularityOreRecipes_T8 {

    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T8 = RecipeMapBuilder
        .of("Singularity of Void Ore T8")
        .maxIO(1, 135, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend::new)
        .build();

    public static void addFakeVoidOreRecipes_T8() {
        // T8 - BarnardC - BC
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BC", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 878),
                getModItem(GregTech.ID, "gt.blockores", 1L, 34),
                getModItem(GregTech.ID, "gt.blockores", 1L, 83),
                getModItem(GregTech.ID, "gt.blockores", 1L, 84),
                getModItem(GregTech.ID, "gt.blockores", 1L, 81),
                getModItem(GregTech.ID, "gt.blockores", 1L, 20),
                getModItem(GregTech.ID, "gt.blockores", 1L, 829),
                getModItem(GregTech.ID, "gt.blockores", 1L, 336),
                getModItem(GregTech.ID, "gt.blockores", 1L, 69),
                getModItem(GregTech.ID, "gt.blockores", 1L, 67),
                getModItem(GregTech.ID, "gt.blockores", 1L, 956),
                getModItem(GregTech.ID, "gt.blockores", 1L, 924),
                getModItem(GregTech.ID, "gt.blockores", 1L, 901),
                getModItem(GregTech.ID, "gt.blockores", 1L, 824),
                getModItem(GregTech.ID, "gt.blockores", 1L, 919),
                getModItem(GregTech.ID, "gt.blockores", 1L, 388),
                getModItem(GregTech.ID, "gt.blockores", 1L, 527),
                getModItem(GregTech.ID, "gt.blockores", 1L, 528),
                getModItem(GregTech.ID, "gt.blockores", 1L, 941),
                getModItem(GregTech.ID, "gt.blockores", 1L, 39),
                getModItem(GregTech.ID, "gt.blockores", 1L, 90),
                getModItem(GregTech.ID, "gt.blockores", 1L, 58),
                getModItem(GregTech.ID, "gt.blockores", 1L, 538),
                getModItem(GregTech.ID, "gt.blockores", 1L, 535),
                getModItem(GregTech.ID, "gt.blockores", 1L, 935),
                getModItem(GregTech.ID, "gt.blockores", 1L, 936),
                getModItem(GregTech.ID, "gt.blockores", 1L, 928),
                getModItem(GregTech.ID, "gt.blockores", 1L, 934),
                getModItem(GregTech.ID, "gt.blockores", 1L, 944),
                getModItem(GregTech.ID, "gt.blockores", 1L, 817),
                getModItem(GregTech.ID, "gt.blockores", 1L, 907),
                getModItem(GregTech.ID, "gt.blockores", 1L, 920))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T8);

        // T8 - BarnardE - BE
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BE", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 922),
                getModItem(GregTech.ID, "gt.blockores", 1L, 98),
                getModItem(GregTech.ID, "gt.blockores", 1L, 882),
                getModItem(GregTech.ID, "gt.blockores", 1L, 942),
                getModItem(GregTech.ID, "gt.blockores", 1L, 48),
                getModItem(GregTech.ID, "gt.blockores", 1L, 883),
                getModItem(GregTech.ID, "gt.blockores", 1L, 927),
                getModItem(GregTech.ID, "gt.blockores", 1L, 908),
                getModItem(GregTech.ID, "gt.blockores", 1L, 505),
                getModItem(GregTech.ID, "gt.blockores", 1L, 933),
                getModItem(GregTech.ID, "gt.blockores", 1L, 81),
                getModItem(GregTech.ID, "gt.blockores", 1L, 20),
                getModItem(GregTech.ID, "gt.blockores", 1L, 829),
                getModItem(GregTech.ID, "gt.blockores", 1L, 336),
                getModItem(GregTech.ID, "gt.blockores", 1L, 831),
                getModItem(GregTech.ID, "gt.blockores", 1L, 838),
                getModItem(GregTech.ID, "gt.blockores", 1L, 943),
                getModItem(GregTech.ID, "gt.blockores", 1L, 921),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 323),
                getModItem(GregTech.ID, "gt.blockores", 1L, 85),
                getModItem(GregTech.ID, "gt.blockores", 1L, 55),
                getModItem(GregTech.ID, "gt.blockores", 1L, 62),
                getModItem(GregTech.ID, "gt.blockores", 1L, 64),
                getModItem(GregTech.ID, "gt.blockores", 1L, 65),
                getModItem(GregTech.ID, "gt.blockores", 1L, 96),
                getModItem(GregTech.ID, "gt.blockores", 1L, 98),
                getModItem(GregTech.ID, "gt.blockores", 1L, 101),
                getModItem(GregTech.ID, "gt.blockores", 1L, 97),
                getModItem(GregTech.ID, "gt.blockores", 1L, 855),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 834),
                getModItem(GregTech.ID, "gt.blockores", 1L, 35),
                getModItem(GregTech.ID, "gt.blockores", 1L, 129),
                getModItem(GregTech.ID, "gt.blockores", 1L, 319),
                getModItem(GregTech.ID, "gt.blockores", 1L, 324),
                getModItem(GregTech.ID, "gt.blockores", 1L, 28),
                getModItem(GregTech.ID, "gt.blockores", 1L, 938),
                getModItem(GregTech.ID, "gt.blockores", 1L, 506),
                getModItem(GregTech.ID, "gt.blockores", 1L, 527),
                getModItem(GregTech.ID, "gt.blockores", 1L, 528),
                getModItem(GregTech.ID, "gt.blockores", 1L, 324),
                getModItem(GregTech.ID, "gt.blockores", 1L, 326),
                getModItem(GregTech.ID, "gt.blockores", 1L, 870),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 923),
                getModItem(GregTech.ID, "gt.blockores", 1L, 976),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 28),
                getModItem(GregTech.ID, "gt.blockores", 1L, 129),
                getModItem(GregTech.ID, "gt.blockores", 1L, 388),
                getModItem(GregTech.ID, "gt.blockores", 1L, 36),
                getModItem(GregTech.ID, "gt.blockores", 1L, 34),
                getModItem(GregTech.ID, "gt.blockores", 1L, 324))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T8);

        // T8 - BarnardF - BF
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BF", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 865),
                getModItem(GregTech.ID, "gt.blockores", 1L, 500),
                getModItem(GregTech.ID, "gt.blockores", 1L, 535),
                getModItem(GregTech.ID, "gt.blockores", 1L, 81),
                getModItem(GregTech.ID, "gt.blockores", 1L, 20),
                getModItem(GregTech.ID, "gt.blockores", 1L, 829),
                getModItem(GregTech.ID, "gt.blockores", 1L, 336),
                getModItem(GregTech.ID, "gt.blockores", 1L, 831),
                getModItem(GregTech.ID, "gt.blockores", 1L, 838),
                getModItem(GregTech.ID, "gt.blockores", 1L, 943),
                getModItem(GregTech.ID, "gt.blockores", 1L, 921),
                getModItem(GregTech.ID, "gt.blockores", 1L, 873),
                getModItem(GregTech.ID, "gt.blockores", 1L, 922),
                getModItem(GregTech.ID, "gt.blockores", 1L, 810),
                getModItem(GregTech.ID, "gt.blockores", 1L, 502),
                getModItem(GregTech.ID, "gt.blockores", 1L, 826),
                getModItem(GregTech.ID, "gt.blockores", 1L, 905),
                getModItem(GregTech.ID, "gt.blockores", 1L, 520),
                getModItem(GregTech.ID, "gt.blockores", 1L, 67),
                getModItem(GregTech.ID, "gt.blockores", 1L, 55),
                getModItem(GregTech.ID, "gt.blockores", 1L, 62),
                getModItem(GregTech.ID, "gt.blockores", 1L, 64),
                getModItem(GregTech.ID, "gt.blockores", 1L, 65),
                getModItem(GregTech.ID, "gt.blockores", 1L, 96),
                getModItem(GregTech.ID, "gt.blockores", 1L, 98),
                getModItem(GregTech.ID, "gt.blockores", 1L, 101),
                getModItem(GregTech.ID, "gt.blockores", 1L, 97),
                getModItem(GregTech.ID, "gt.blockores", 1L, 855),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 834),
                getModItem(GregTech.ID, "gt.blockores", 1L, 35),
                getModItem(GregTech.ID, "gt.blockores", 1L, 29),
                getModItem(GregTech.ID, "gt.blockores", 1L, 870),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 30),
                getModItem(GregTech.ID, "gt.blockores", 1L, 129),
                getModItem(GregTech.ID, "gt.blockores", 1L, 319),
                getModItem(GregTech.ID, "gt.blockores", 1L, 324),
                getModItem(GregTech.ID, "gt.blockores", 1L, 28),
                getModItem(GregTech.ID, "gt.blockores", 1L, 870),
                getModItem(GregTech.ID, "gt.blockores", 1L, 923),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 8),
                getModItem(GregTech.ID, "gt.blockores", 1L, 501),
                getModItem(GregTech.ID, "gt.blockores", 1L, 96),
                getModItem(GregTech.ID, "gt.blockores", 1L, 527),
                getModItem(GregTech.ID, "gt.blockores", 1L, 528),
                getModItem(GregTech.ID, "gt.blockores", 1L, 912),
                getModItem(GregTech.ID, "gt.blockores", 1L, 913),
                getModItem(GregTech.ID, "gt.blockores", 1L, 324),
                getModItem(GregTech.ID, "gt.blockores", 1L, 326),
                getModItem(GregTech.ID, "gt.blockores", 1L, 47),
                getModItem(GregTech.ID, "gt.blockores", 1L, 45),
                getModItem(GregTech.ID, "gt.blockores", 1L, 37),
                getModItem(GregTech.ID, "gt.blockores", 1L, 976),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 28),
                getModItem(GregTech.ID, "gt.blockores", 1L, 129),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 388),
                getModItem(GregTech.ID, "gt.blockores", 1L, 913),
                getModItem(GregTech.ID, "gt.blockores", 1L, 34),
                getModItem(GregTech.ID, "gt.blockores", 1L, 324),
                getModItem(GregTech.ID, "gt.blockores", 1L, 395))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T8);

        // T8 - α Centauri Bb - CB
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_CB", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 22),
                getModItem(GregTech.ID, "gt.blockores", 1L, 834),
                getModItem(GregTech.ID, "gt.blockores", 1L, 839),
                getModItem(GregTech.ID, "gt.blockores", 1L, 831),
                getModItem(GregTech.ID, "gt.blockores", 1L, 838),
                getModItem(GregTech.ID, "gt.blockores", 1L, 943),
                getModItem(GregTech.ID, "gt.blockores", 1L, 921),
                getModItem(GregTech.ID, "gt.blockores", 1L, 69),
                getModItem(GregTech.ID, "gt.blockores", 1L, 67),
                getModItem(GregTech.ID, "gt.blockores", 1L, 956),
                getModItem(GregTech.ID, "gt.blockores", 1L, 873),
                getModItem(GregTech.ID, "gt.blockores", 1L, 922),
                getModItem(GregTech.ID, "gt.blockores", 1L, 523),
                getModItem(GregTech.ID, "gt.blockores", 1L, 904),
                getModItem(GregTech.ID, "gt.blockores", 1L, 516),
                getModItem(GregTech.ID, "gt.blockores", 1L, 810),
                getModItem(GregTech.ID, "gt.blockores", 1L, 502),
                getModItem(GregTech.ID, "gt.blockores", 1L, 826),
                getModItem(GregTech.ID, "gt.blockores", 1L, 388),
                getModItem(GregTech.ID, "gt.blockores", 1L, 527),
                getModItem(GregTech.ID, "gt.blockores", 1L, 528),
                getModItem(GregTech.ID, "gt.blockores", 1L, 941),
                getModItem(GregTech.ID, "gt.blockores", 1L, 55),
                getModItem(GregTech.ID, "gt.blockores", 1L, 62),
                getModItem(GregTech.ID, "gt.blockores", 1L, 64),
                getModItem(GregTech.ID, "gt.blockores", 1L, 65),
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
                getModItem(GregTech.ID, "gt.blockores", 1L, 937),
                getModItem(GregTech.ID, "gt.blockores", 1L, 938),
                getModItem(GregTech.ID, "gt.blockores", 1L, 946),
                getModItem(GregTech.ID, "gt.blockores", 1L, 948),
                getModItem(GregTech.ID, "gt.blockores", 1L, 522),
                getModItem(GregTech.ID, "gt.blockores", 1L, 523))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T8);

        // T8 - TCetiE - TE
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_TE", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 878),
                getModItem(GregTech.ID, "gt.blockores", 1L, 908),
                getModItem(GregTech.ID, "gt.blockores", 1L, 917),
                getModItem(GregTech.ID, "gt.blockores", 1L, 22),
                getModItem(GregTech.ID, "gt.blockores", 1L, 510),
                getModItem(GregTech.ID, "gt.blockores", 1L, 523),
                getModItem(GregTech.ID, "gt.blockores", 1L, 904),
                getModItem(GregTech.ID, "gt.blockores", 1L, 516),
                getModItem(GregTech.ID, "gt.blockores", 1L, 388),
                getModItem(GregTech.ID, "gt.blockores", 1L, 527),
                getModItem(GregTech.ID, "gt.blockores", 1L, 528),
                getModItem(GregTech.ID, "gt.blockores", 1L, 941),
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
                getModItem(GregTech.ID, "gt.blockores", 1L, 929),
                getModItem(GregTech.ID, "gt.blockores", 1L, 916),
                getModItem(GregTech.ID, "gt.blockores", 1L, 928),
                getModItem(GregTech.ID, "gt.blockores", 1L, 949),
                getModItem(GregTech.ID, "gt.blockores", 1L, 938),
                getModItem(GregTech.ID, "gt.blockores", 1L, 506),
                getModItem(GregTech.ID, "gt.blockores", 1L, 527),
                getModItem(GregTech.ID, "gt.blockores", 1L, 528),
                getModItem(GregTech.ID, "gt.blockores", 1L, 530),
                getModItem(GregTech.ID, "gt.blockores", 1L, 534),
                getModItem(GregTech.ID, "gt.blockores", 1L, 607),
                getModItem(GregTech.ID, "gt.blockores", 1L, 30),
                getModItem(GregTech.ID, "gt.blockores", 1L, 841),
                getModItem(GregTech.ID, "gt.blockores", 1L, 48),
                getModItem(GregTech.ID, "gt.blockores", 1L, 31),
                getModItem(GregTech.ID, "gt.blockores", 1L, 870),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 923),
                getModItem(GregTech.ID, "gt.blockores", 1L, 944),
                getModItem(GregTech.ID, "gt.blockores", 1L, 817),
                getModItem(GregTech.ID, "gt.blockores", 1L, 907),
                getModItem(GregTech.ID, "gt.blockores", 1L, 920),
                getModItem(GregTech.ID, "gt.blockores", 1L, 57),
                getModItem(GregTech.ID, "gt.blockores", 1L, 824),
                getModItem(GregTech.ID, "gt.blockores", 1L, 976),
                getModItem(GregTech.ID, "gt.blockores", 1L, 129),
                getModItem(GregTech.ID, "gt.blockores", 1L, 526))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T8);

        // T8 - VegaB - VB
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_VB", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 910),
                getModItem(GregTech.ID, "gt.blockores", 1L, 841),
                getModItem(GregTech.ID, "gt.blockores", 1L, 6),
                getModItem(GregTech.ID, "gt.blockores", 1L, 524),
                getModItem(GregTech.ID, "gt.blockores", 1L, 525),
                getModItem(GregTech.ID, "gt.blockores", 1L, 526),
                getModItem(GregTech.ID, "gt.blockores", 1L, 823),
                getModItem(GregTech.ID, "gt.blockores", 1L, 873),
                getModItem(GregTech.ID, "gt.blockores", 1L, 922),
                getModItem(GregTech.ID, "gt.blockores", 1L, 810),
                getModItem(GregTech.ID, "gt.blockores", 1L, 502),
                getModItem(GregTech.ID, "gt.blockores", 1L, 826),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 323),
                getModItem(GregTech.ID, "gt.blockores", 1L, 85),
                getModItem(GregTech.ID, "gt.blockores", 1L, 55),
                getModItem(GregTech.ID, "gt.blockores", 1L, 62),
                getModItem(GregTech.ID, "gt.blockores", 1L, 64),
                getModItem(GregTech.ID, "gt.blockores", 1L, 65),
                getModItem(GregTech.ID, "gt.blockores", 1L, 96),
                getModItem(GregTech.ID, "gt.blockores", 1L, 98),
                getModItem(GregTech.ID, "gt.blockores", 1L, 101),
                getModItem(GregTech.ID, "gt.blockores", 1L, 97),
                getModItem(GregTech.ID, "gt.blockores", 1L, 39),
                getModItem(GregTech.ID, "gt.blockores", 1L, 90),
                getModItem(GregTech.ID, "gt.blockores", 1L, 58),
                getModItem(GregTech.ID, "gt.blockores", 1L, 29),
                getModItem(GregTech.ID, "gt.blockores", 1L, 870),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 30),
                getModItem(GregTech.ID, "gt.blockores", 1L, 129),
                getModItem(GregTech.ID, "gt.blockores", 1L, 319),
                getModItem(GregTech.ID, "gt.blockores", 1L, 324),
                getModItem(GregTech.ID, "gt.blockores", 1L, 28),
                getModItem(GregTech.ID, "gt.blockores", 1L, 870),
                getModItem(GregTech.ID, "gt.blockores", 1L, 923),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 938),
                getModItem(GregTech.ID, "gt.blockores", 1L, 506),
                getModItem(GregTech.ID, "gt.blockores", 1L, 527),
                getModItem(GregTech.ID, "gt.blockores", 1L, 528),
                getModItem(GregTech.ID, "gt.blockores", 1L, 527),
                getModItem(GregTech.ID, "gt.blockores", 1L, 528),
                getModItem(GregTech.ID, "gt.blockores", 1L, 912),
                getModItem(GregTech.ID, "gt.blockores", 1L, 913),
                getModItem(GregTech.ID, "gt.blockores", 1L, 840),
                getModItem(GregTech.ID, "gt.blockores", 1L, 35),
                getModItem(GregTech.ID, "gt.blockores", 1L, 945),
                getModItem(GregTech.ID, "gt.blockores", 1L, 830),
                getModItem(GregTech.ID, "gt.blockores", 1L, 54),
                getModItem(GregTech.ID, "gt.blockores", 1L, 89),
                getModItem(GregTech.ID, "gt.blockores", 1L, 324),
                getModItem(GregTech.ID, "gt.blockores", 1L, 326),
                getModItem(GregTech.ID, "gt.blockores", 1L, 47),
                getModItem(GregTech.ID, "gt.blockores", 1L, 45),
                getModItem(GregTech.ID, "gt.blockores", 1L, 37),
                getModItem(GregTech.ID, "gt.blockores", 1L, 976),
                getModItem(GregTech.ID, "gt.blockores", 1L, 54),
                getModItem(GregTech.ID, "gt.blockores", 1L, 89),
                getModItem(GregTech.ID, "gt.blockores", 1L, 129),
                getModItem(GregTech.ID, "gt.blockores", 1L, 394),
                getModItem(GregTech.ID, "gt.blockores", 1L, 500),
                getModItem(GregTech.ID, "gt.blockores", 1L, 388),
                getModItem(GregTech.ID, "gt.blockores", 1L, 825),
                getModItem(GregTech.ID, "gt.blockores", 1L, 90))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T8);
    }
}
