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

public class FakeSingularityOreRecipes_T2 {

    public static final RecipeMap<RecipeMapBackend> addFakeVoidOreRecipes_T2 = RecipeMapBuilder
        .of("Singularity of Void Ore T2")
        .maxIO(1, 135, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend::new)
        .build();

    public static void addFakeVoidOreRecipes_T2() {
        // T2 - Deimos - De
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_De", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 922),
                getModItem(GregTech.ID, "gt.blockores", 1L, 98),
                getModItem(GregTech.ID, "gt.blockores", 1L, 910),
                getModItem(GregTech.ID, "gt.blockores", 1L, 841),
                getModItem(GregTech.ID, "gt.blockores", 1L, 6),
                getModItem(GregTech.ID, "gt.blockores", 1L, 22),
                getModItem(GregTech.ID, "gt.blockores", 1L, 834),
                getModItem(GregTech.ID, "gt.blockores", 1L, 839),
                getModItem(GregTech.ID, "gt.blockores", 1L, 524),
                getModItem(GregTech.ID, "gt.blockores", 1L, 525),
                getModItem(GregTech.ID, "gt.blockores", 1L, 526),
                getModItem(GregTech.ID, "gt.blockores", 1L, 823),
                getModItem(GregTech.ID, "gt.blockores", 1L, 975),
                getModItem(GregTech.ID, "gt.blockores", 1L, 812),
                getModItem(GregTech.ID, "gt.blockores", 1L, 537),
                getModItem(GregTech.ID, "gt.blockores", 1L, 529),
                getModItem(GregTech.ID, "gt.blockores", 1L, 905),
                getModItem(GregTech.ID, "gt.blockores", 1L, 520),
                getModItem(GregTech.ID, "gt.blockores", 1L, 67),
                getModItem(GregTech.ID, "gt.blockores", 1L, 906),
                getModItem(GregTech.ID, "gt.blockores", 1L, 34),
                getModItem(GregTech.ID, "gt.blockores", 1L, 827),
                getModItem(GregTech.ID, "gt.blockores", 1L, 909),
                getModItem(GregTech.ID, "gt.blockores", 1L, 840),
                getModItem(GregTech.ID, "gt.blockores", 1L, 35),
                getModItem(GregTech.ID, "gt.blockores", 1L, 945),
                getModItem(GregTech.ID, "gt.blockores", 1L, 393),
                getModItem(GregTech.ID, "gt.blockores", 1L, 508),
                getModItem(GregTech.ID, "gt.blockores", 1L, 951),
                getModItem(GregTech.ID, "gt.blockores", 1L, 900),
                getModItem(GregTech.ID, "gt.blockores", 1L, 870),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 923),
                getModItem(GregTech.ID, "gt.blockores", 1L, 836),
                getModItem(GregTech.ID, "gt.blockores", 1L, 28),
                getModItem(GregTech.ID, "gt.blockores", 1L, 57),
                getModItem(GregTech.ID, "gt.blockores", 1L, 89),
                getModItem(GregTech.ID, "gt.blockores", 1L, 500),
                getModItem(GregTech.ID, "gt.blockores", 1L, 975),
                getModItem(GregTech.ID, "gt.blockores", 1L, 825),
                getModItem(GregTech.ID, "gt.blockores", 1L, 841),
                getModItem(GregTech.ID, "gt.blockores", 1L, 340),
                getModItem(GregTech.ID, "gt.blockores", 1L, 884),
                getModItem(GregTech.ID, "gt.blockores", 1L, 34))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T2);

        // T2 - Mars - Ma
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ma", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 910),
                getModItem(GregTech.ID, "gt.blockores", 1L, 841),
                getModItem(GregTech.ID, "gt.blockores", 1L, 6),
                getModItem(GregTech.ID, "gt.blockores", 1L, 22),
                getModItem(GregTech.ID, "gt.blockores", 1L, 834),
                getModItem(GregTech.ID, "gt.blockores", 1L, 839),
                getModItem(GregTech.ID, "gt.blockores", 1L, 884),
                getModItem(GregTech.ID, "gt.blockores", 1L, 910),
                getModItem(GregTech.ID, "gt.blockores", 1L, 841),
                getModItem(GregTech.ID, "gt.blockores", 1L, 873),
                getModItem(GregTech.ID, "gt.blockores", 1L, 922),
                getModItem(GregTech.ID, "gt.blockores", 1L, 523),
                getModItem(GregTech.ID, "gt.blockores", 1L, 904),
                getModItem(GregTech.ID, "gt.blockores", 1L, 516),
                getModItem(GregTech.ID, "gt.blockores", 1L, 810),
                getModItem(GregTech.ID, "gt.blockores", 1L, 502),
                getModItem(GregTech.ID, "gt.blockores", 1L, 826),
                getModItem(GregTech.ID, "gt.blockores", 1L, 906),
                getModItem(GregTech.ID, "gt.blockores", 1L, 34),
                getModItem(GregTech.ID, "gt.blockores", 1L, 827),
                getModItem(GregTech.ID, "gt.blockores", 1L, 909),
                getModItem(GregTech.ID, "gt.blockores", 1L, 39),
                getModItem(GregTech.ID, "gt.blockores", 1L, 90),
                getModItem(GregTech.ID, "gt.blockores", 1L, 58),
                getModItem(GregTech.ID, "gt.blockores", 1L, 870),
                getModItem(GregTech.ID, "gt.blockores", 1L, 923),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 930),
                getModItem(GregTech.ID, "gt.blockores", 1L, 931),
                getModItem(GregTech.ID, "gt.blockores", 1L, 917),
                getModItem(GregTech.ID, "gt.blockores", 1L, 871),
                getModItem(GregTech.ID, "gt.blockores", 1L, 8),
                getModItem(GregTech.ID, "gt.blockores", 1L, 501),
                getModItem(GregTech.ID, "gt.blockores", 1L, 96),
                getModItem(GregTech.ID, "gt.blockores", 1L, 840),
                getModItem(GregTech.ID, "gt.blockores", 1L, 35),
                getModItem(GregTech.ID, "gt.blockores", 1L, 945),
                getModItem(GregTech.ID, "gt.blockores", 1L, 830),
                getModItem(GregTech.ID, "gt.blockores", 1L, 54),
                getModItem(GregTech.ID, "gt.blockores", 1L, 89),
                getModItem(GregTech.ID, "gt.blockores", 1L, 944),
                getModItem(GregTech.ID, "gt.blockores", 1L, 817),
                getModItem(GregTech.ID, "gt.blockores", 1L, 907),
                getModItem(GregTech.ID, "gt.blockores", 1L, 920),
                getModItem(GregTech.ID, "gt.blockores", 1L, 836),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 35),
                getModItem(GregTech.ID, "gt.blockores", 1L, 28),
                getModItem(GregTech.ID, "gt.blockores", 1L, 393),
                getModItem(GregTech.ID, "gt.blockores", 1L, 57),
                getModItem(GregTech.ID, "gt.blockores", 1L, 89),
                getModItem(GregTech.ID, "gt.blockores", 1L, 810),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 825),
                getModItem(GregTech.ID, "gt.blockores", 1L, 841),
                getModItem(GregTech.ID, "gt.blockores", 1L, 340),
                getModItem(GregTech.ID, "gt.blockores", 1L, 90),
                getModItem(GregTech.ID, "gt.blockores", 1L, 36),
                getModItem(GregTech.ID, "gt.blockores", 1L, 34))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T2);

        // T2 - Phobos - Ph
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ph", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.blockores", 1L, 922),
                getModItem(GregTech.ID, "gt.blockores", 1L, 98),
                getModItem(GregTech.ID, "gt.blockores", 1L, 22),
                getModItem(GregTech.ID, "gt.blockores", 1L, 834),
                getModItem(GregTech.ID, "gt.blockores", 1L, 839),
                getModItem(GregTech.ID, "gt.blockores", 1L, 865),
                getModItem(GregTech.ID, "gt.blockores", 1L, 500),
                getModItem(GregTech.ID, "gt.blockores", 1L, 535),
                getModItem(GregTech.ID, "gt.blockores", 1L, 882),
                getModItem(GregTech.ID, "gt.blockores", 1L, 942),
                getModItem(GregTech.ID, "gt.blockores", 1L, 48),
                getModItem(GregTech.ID, "gt.blockores", 1L, 883),
                getModItem(GregTech.ID, "gt.blockores", 1L, 873),
                getModItem(GregTech.ID, "gt.blockores", 1L, 922),
                getModItem(GregTech.ID, "gt.blockores", 1L, 523),
                getModItem(GregTech.ID, "gt.blockores", 1L, 904),
                getModItem(GregTech.ID, "gt.blockores", 1L, 516),
                getModItem(GregTech.ID, "gt.blockores", 1L, 975),
                getModItem(GregTech.ID, "gt.blockores", 1L, 812),
                getModItem(GregTech.ID, "gt.blockores", 1L, 537),
                getModItem(GregTech.ID, "gt.blockores", 1L, 529),
                getModItem(GregTech.ID, "gt.blockores", 1L, 906),
                getModItem(GregTech.ID, "gt.blockores", 1L, 34),
                getModItem(GregTech.ID, "gt.blockores", 1L, 827),
                getModItem(GregTech.ID, "gt.blockores", 1L, 909),
                getModItem(GregTech.ID, "gt.blockores", 1L, 39),
                getModItem(GregTech.ID, "gt.blockores", 1L, 90),
                getModItem(GregTech.ID, "gt.blockores", 1L, 58),
                getModItem(GregTech.ID, "gt.blockores", 1L, 822),
                getModItem(GregTech.ID, "gt.blockores", 1L, 918),
                getModItem(GregTech.ID, "gt.blockores", 1L, 19),
                getModItem(GregTech.ID, "gt.blockores", 1L, 870),
                getModItem(GregTech.ID, "gt.blockores", 1L, 923),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 393),
                getModItem(GregTech.ID, "gt.blockores", 1L, 508),
                getModItem(GregTech.ID, "gt.blockores", 1L, 951),
                getModItem(GregTech.ID, "gt.blockores", 1L, 900),
                getModItem(GregTech.ID, "gt.blockores", 1L, 32),
                getModItem(GregTech.ID, "gt.blockores", 1L, 35),
                getModItem(GregTech.ID, "gt.blockores", 1L, 28),
                getModItem(GregTech.ID, "gt.blockores", 1L, 86),
                getModItem(GregTech.ID, "gt.blockores", 1L, 975),
                getModItem(GregTech.ID, "gt.blockores", 1L, 825),
                getModItem(GregTech.ID, "gt.blockores", 1L, 841),
                getModItem(GregTech.ID, "gt.blockores", 1L, 340),
                getModItem(GregTech.ID, "gt.blockores", 1L, 526),
                getModItem(GregTech.ID, "gt.blockores", 1L, 884))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Void Ore Mode")
            .eut(0)
            .addTo(addFakeVoidOreRecipes_T2);
    }
}
