package Recipes.OriginGeneratorRecipes;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.FluidFuelOfGeneratorFrontend;

public class OriginGeneratorRecipes_Solar {

    public static final RecipeMap<RecipeMapBackend> GeneratorRecipes_Solar = RecipeMapBuilder
        .of("Origin of Generator with Solar")
        .maxIO(1, 0, 1, 1)
        .minInputs(1, 1)
        .neiHandlerInfo(builder -> builder.setHeight(128))
        .frontend(FluidFuelOfGeneratorFrontend::new)
        .build();

    private static final ItemStack[] GeneratorType_SolarPanel = new ItemStack[] {
        // "Solar Panel (LV)" - 32752
        getModItem(GregTech.ID, "gt.metaitem.01", 0L, 32752),
        // "Solar Panel (MV)" - 32753
        getModItem(GregTech.ID, "gt.metaitem.01", 0L, 32753),
        // "Solar Panel (HV)" - 32754
        getModItem(GregTech.ID, "gt.metaitem.01", 0L, 32754),
        // "Solar Panel (EV)" - 32755
        getModItem(GregTech.ID, "gt.metaitem.01", 0L, 32755),
        // "Solar Panel (IV)" - 32756
        getModItem(GregTech.ID, "gt.metaitem.01", 0L, 32756),
        // "Solar Panel (LuV)" - 32757
        getModItem(GregTech.ID, "gt.metaitem.01", 0L, 32757),
        // "Solar Panel (ZPM)" - 32758
        getModItem(GregTech.ID, "gt.metaitem.01", 0L, 32758),
        // "Solar Panel (UV)" - 32759
        getModItem(GregTech.ID, "gt.metaitem.01", 0L, 32759),
        // "Solar Panel (UHV)" - 32130
        getModItem(GregTech.ID, "gt.metaitem.01", 0L, 32130),
        // "Solar Panel (UEV)" - 32131
        getModItem(GregTech.ID, "gt.metaitem.01", 0L, 32131),
        // "Solar Panel (UIV)" - 32132
        getModItem(GregTech.ID, "gt.metaitem.01", 0L, 32132) };

    private static final String[] FuelBaseline_SolarPanel = new String[] {
        // "Solar Panel (LV)" - 32752
        "32",
        // "Solar Panel (MV)" - 32753
        "128",
        // "Solar Panel (HV)" - 32754
        "512",
        // "Solar Panel (EV)" - 32755
        "2,048",
        // "Solar Panel (IV)" - 32756
        "8,192",
        // "Solar Panel (LuV)" - 32757
        "32,768",
        // "Solar Panel (ZPM)" - 32758
        "131,072",
        // "Solar Panel (UV)" - 32759
        "524,288",
        // "Solar Panel (UHV)" - 32130
        "2,097,152",
        // "Solar Panel (UEV)" - 32131
        "8,388,608",
        // "Solar Panel (UIV)" - 32132
        "33,554,432" };

    private static final int[] FuelCalorificValue_SolarPanel = new int[] {
        // "Solar Panel (LV)" - 32752
        32,
        // "Solar Panel (MV)" - 32753
        128,
        // "Solar Panel (HV)" - 32754
        512,
        // "Solar Panel (EV)" - 32755
        2_048,
        // "Solar Panel (IV)" - 32756
        8_192,
        // "Solar Panel (LuV)" - 32757
        32_768,
        // "Solar Panel (ZPM)" - 32758
        131_072,
        // "Solar Panel (UV)" - 32759
        524_288,
        // "Solar Panel (UHV)" - 32130
        2_097_152,
        // "Solar Panel (UEV)" - 32131
        8_388_608,
        // "Solar Panel (UIV)" - 32132
        33_554_432 };

    private static final ItemStack[] GeneratorType_Solar = new ItemStack[] {
        // "Basic Solar Panel" - 2733
        getModItem(GregTech.ID, "gt.blockmachines", 0L, 2733),
        // "Advanced Solar Panel" - 2734
        getModItem(GregTech.ID, "gt.blockmachines", 0L, 2734),
        // "Advanced Solar Panel II" - 2735
        getModItem(GregTech.ID, "gt.blockmachines", 0L, 2735),
        // "Advanced Solar Panel III" - 2736
        getModItem(GregTech.ID, "gt.blockmachines", 0L, 2736),
        // "Advanced Solar Panel IV" - 2737
        getModItem(GregTech.ID, "gt.blockmachines", 0L, 2737),
        // "Elite Solar Panel" - 2738
        getModItem(GregTech.ID, "gt.blockmachines", 0L, 2738),
        // "Elite Solar Panel II" - 2739
        getModItem(GregTech.ID, "gt.blockmachines", 0L, 2739),
        // "Ultimate Solar Panel" - 2740
        getModItem(GregTech.ID, "gt.blockmachines", 0L, 2740) };

    private static final String[] FuelBaseline_Solar = new String[] {
        // "Basic Solar Panel" - 2733
        "32",
        // "Advanced Solar Panel" - 2734
        "128",
        // "Advanced Solar Panel II" - 2735
        "512",
        // "Advanced Solar Panel III" - 2736
        "2,048",
        // "Advanced Solar Panel IV" - 2737
        "8,192",
        // "Elite Solar Panel" - 2738
        "32,768",
        // "Elite Solar Panel II" - 2739
        "131,072",
        // "Ultimate Solar Panel" - 2740
        "524,288" };

    private static final int[] FuelCalorificValue_Solar = new int[] {
        // "Basic Solar Panel" - 2733
        32,
        // "Advanced Solar Panel" - 2734
        128,
        // "Advanced Solar Panel II" - 2735
        512,
        // "Advanced Solar Panel III" - 2736
        2_048,
        // "Advanced Solar Panel IV" - 2737
        8_192,
        // "Elite Solar Panel" - 2738
        32_768,
        // "Elite Solar Panel II" - 2739
        131_072,
        // "Ultimate Solar Panel" - 2740
        524_288 };

    public static void addGeneratorRecipes_Solar() {
        // "Solar Panel"
        for (int GeneratorID = 0; GeneratorID < GeneratorType_SolarPanel.length; GeneratorID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(GeneratorType_SolarPanel[GeneratorID])
                .fluidInputs(FluidRegistry.getFluidStack("air", 1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_SolarPanel[GeneratorID])
                .eut(-FuelCalorificValue_SolarPanel[GeneratorID])
                .addTo(GeneratorRecipes_Solar);
        }

        // "Solar"
        for (int GeneratorID = 0; GeneratorID < GeneratorType_Solar.length; GeneratorID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(GeneratorType_Solar[GeneratorID])
                .fluidInputs(FluidRegistry.getFluidStack("air", 1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_Solar[GeneratorID])
                .eut(-FuelCalorificValue_Solar[GeneratorID])
                .addTo(GeneratorRecipes_Solar);
        }
    }
}
