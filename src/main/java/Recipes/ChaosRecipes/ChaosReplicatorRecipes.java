package Recipes.ChaosRecipes;

import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.TierEU.RECIPE_LV;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import net.minecraftforge.fluids.FluidRegistry;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.FluidReplicatorOfChaosFrontend;
import util.RecipesFrontend.ItemReplicatorOfChaosFrontend;

public class ChaosReplicatorRecipes {

    public static final RecipeMap<RecipeMapBackend> ReplicatorRecipes_Item = RecipeMapBuilder
        .of("Chaos of Replicator with Item")
        .maxIO(1, 1, 1, 0)
        .minInputs(1, 1)
        .neiHandlerInfo(builder -> builder.setHeight(128))
        .frontend(ItemReplicatorOfChaosFrontend::new)
        .neiTransferRect(90, 10, 20, 16)
        .build();

    public static final RecipeMap<RecipeMapBackend> ReplicatorRecipes_Fluid = RecipeMapBuilder
        .of("Chaos of Replicator with Fluid")
        .maxIO(1, 0, 1, 1)
        .minInputs(1, 1)
        .neiHandlerInfo(builder -> builder.setHeight(128))
        .frontend(FluidReplicatorOfChaosFrontend::new)
        .neiTransferRect(90, 10, 20, 16)
        .build();

    public static void addReplicatorRecipes_Item() {
        // "Lithium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2006))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 10))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2006))
            .duration(256 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Beryllium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2008))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 13))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2008))
            .duration(333 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Boron Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2009))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 15))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2009))
            .duration(384 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Carbon Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2010))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 19))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2010))
            .duration(486 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Sodium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2017))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 40))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2017))
            .duration(1024 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Magnesium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2018))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 45))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2018))
            .duration(1152 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Aluminium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2019))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 49))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2019))
            .duration(1254 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Raw Silicon Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2020))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 54))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2020))
            .duration(1382 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Phosphorus Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2021))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 59))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2021))
            .duration(1510 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Sulfur Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2022))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 64))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2022))
            .duration(1638 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Potassium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2025))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 81))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2025))
            .duration(2074 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Calcium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2026))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 83))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2026))
            .duration(2125 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Scandium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2027))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 96))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2027))
            .duration(2458 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Titanium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2028))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 104))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2028))
            .duration(2662 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Desh Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2884))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 106))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2884))
            .duration(2714 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Vanadium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2029))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 111))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2029))
            .duration(2842 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Chrome Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2030))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 114))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2030))
            .duration(2918 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Manganese Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2031))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 122))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2031))
            .duration(3123 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Iron Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2032))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 125))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2032))
            .duration(3200 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Nickel Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2034))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 130))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2034))
            .duration(3328 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Cobalt Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2033))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 133))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2033))
            .duration(3405 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Copper Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2035))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 144))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2035))
            .duration(3686 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Zinc Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2036))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 149))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2036))
            .duration(3814 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Meteoric Iron Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2340))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 158))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2340))
            .duration(4045 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Gallium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2037))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 163))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2037))
            .duration(4173 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Arsenic Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2039))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 177))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2039))
            .duration(4531 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Rubidium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2043))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 206))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2043))
            .duration(5274 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Strontium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2044))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 212))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2044))
            .duration(5427 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Yttrium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2045))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 218))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2045))
            .duration(5581 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Zirconium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 0L, 3))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 224))
            .itemOutputs(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 0L, 3))
            .duration(5734 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Niobium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2047))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 233))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2047))
            .duration(5965 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Molybdenum Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2048))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 236))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2048))
            .duration(6042 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Neutronium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2129))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 251))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2129))
            .duration(6426 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Ruthenium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 0L, 64))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 254))
            .itemOutputs(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 64))
            .duration(6502 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Rhodium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 0L, 78))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 260))
            .itemOutputs(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 78))
            .duration(6656 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Palladium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2052))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 269))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2052))
            .duration(6886 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Silver Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2054))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 272))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2054))
            .duration(6963 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Cadmium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2055))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 287))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2055))
            .duration(7347 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Indium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2056))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 293))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2056))
            .duration(7501 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Tin Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2057))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 306))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2057))
            .duration(7834 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Antimony Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2058))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 315))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2058))
            .duration(8064 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Tellurium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2059))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 334))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2059))
            .duration(8550 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Iodine Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 0L, 11012))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 334))
            .itemOutputs(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 11012))
            .duration(8550 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Caesium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2062))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 350))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2062))
            .duration(8960 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Barium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2063))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 366))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2063))
            .duration(9370 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Barium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2064))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 369))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2064))
            .duration(9446 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Cerium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2065))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 376))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2065))
            .duration(9626 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Praseodymium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2066))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 376))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2066))
            .duration(9626 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Neodymium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2067))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 389))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2067))
            .duration(9958 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Promethium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2068))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 389))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2068))
            .duration(9958 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Samarium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2069))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 408))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2069))
            .duration(10_445 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Europium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2070))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 411))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2070))
            .duration(10_522 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Gadolinium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2071))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 431))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2071))
            .duration(11_034 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Terbium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2072))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 434))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2072))
            .duration(11_110 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Dysprosium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2073))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 448))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2073))
            .duration(11_469 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Holmium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2074))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 454))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2074))
            .duration(11_622 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Erbium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2075))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 464))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2075))
            .duration(11_878 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Thulium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2076))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 468))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2076))
            .duration(11_981 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Ytterbium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2077))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 484))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2077))
            .duration(12_390 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Lutetium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2078))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 488))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2078))
            .duration(12_493 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Hafnium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 0L, 11000))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 501))
            .itemOutputs(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 0L, 11000))
            .duration(12_826 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Tantalum Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2080))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 508))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2080))
            .duration(13_005 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Tungsten Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2081))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 518))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2081))
            .duration(13_261 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Osmium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2083))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 542))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2083))
            .duration(13_875 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Iridium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2084))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 549))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2084))
            .duration(14_054 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Platinum Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2085))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 559))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2085))
            .duration(14_310 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Gold Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2086))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 563))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2086))
            .duration(14_413 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Oriharukon Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2393))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 580))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2393))
            .duration(14_878 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Lead Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2089))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 601))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2089))
            .duration(15_386 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Bismuth Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2090))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 604))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2090))
            .duration(15_462 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Thorium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2096))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 682))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2096))
            .duration(17_459 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Uranium 238 Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2098))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 711))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2098))
            .duration(18_202 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Americium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2103))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 736))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2103))
            .duration(18_842 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Plutonium 239 Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2100))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 739))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2100))
            .duration(18_918 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Californium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 0L, 39))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 757))
            .itemOutputs(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 39))
            .duration(19_379 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Flerovium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2984))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 897))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2984))
            .duration(22_963 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Tritanium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2329))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 1025))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2329))
            .duration(26_240 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Tiberium Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 0L, 89))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 1037))
            .itemOutputs(getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 89))
            .duration(26_547 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);

        // "Naquadah Dust"
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 2324))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 1052))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2324))
            .duration(26_931 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Item);
    }

    public static void addReplicatorRecipes_Fluid() {
        // Hydrogen
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 30001))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 1))
            .fluidOutputs(FluidRegistry.getFluidStack("hydrogen", 1000))
            .duration(26 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Fluid);

        // Helium
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 30004))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 5))
            .fluidOutputs(FluidRegistry.getFluidStack("helium", 1000))
            .duration(128 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Fluid);

        // Nitrogen
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 30012))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 23))
            .fluidOutputs(FluidRegistry.getFluidStack("nitrogen", 1000))
            .duration(589 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Fluid);

        // Oxygen
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 30013))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 27))
            .fluidOutputs(FluidRegistry.getFluidStack("oxygen", 1000))
            .duration(691 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Fluid);

        // Fluorine
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 30014))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 32))
            .fluidOutputs(FluidRegistry.getFluidStack("fluorine", 1000))
            .duration(819 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Fluid);

        // Neon
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(BartWorks.ID, "gt.bwMetaGeneratedcell", 0L, 41))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 36))
            .fluidOutputs(FluidRegistry.getFluidStack("neon", 1000))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Fluid);

        // Chlorine
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 30023))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 71))
            .fluidOutputs(FluidRegistry.getFluidStack("chlorine", 1000))
            .duration(1818 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Fluid);

        // Argon
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 30024))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 83))
            .fluidOutputs(FluidRegistry.getFluidStack("argon", 1000))
            .duration(2125 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Fluid);

        // Krypton
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(BartWorks.ID, "gt.bwMetaGeneratedcell", 0L, 42))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 203))
            .fluidOutputs(FluidRegistry.getFluidStack("krypton", 1000))
            .duration(5197 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Fluid);

        // Xenon
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(BartWorks.ID, "gt.bwMetaGeneratedcell", 0L, 37))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 347))
            .fluidOutputs(FluidRegistry.getFluidStack("xenon", 1000))
            .duration(8883 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Fluid);

        // Mercury
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 30087))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 577))
            .fluidOutputs(FluidRegistry.getFluidStack("mercury", 1000))
            .duration(14_771 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Fluid);

        // Radon
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 0L, 30093))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 647))
            .fluidOutputs(FluidRegistry.getFluidStack("radon", 1000))
            .duration(16_563 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Fluid);

        // Oganesson
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(BartWorks.ID, "gt.bwMetaGeneratedcell", 0L, 38))
            .fluidInputs(FluidRegistry.getFluidStack("ic2uumatter", 916))
            .fluidOutputs(FluidRegistry.getFluidStack("oganesson", 1000))
            .duration(23_450 * SECONDS)
            .eut(RECIPE_LV)
            .addTo(ReplicatorRecipes_Fluid);
    }
}
