package EnumList.EnumListCheck;

import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;
import static util.AggregateFluidStackArray.addSplitAggregateArray;
import static util.AggregateFluidStackArray.checkFluidStack;

import net.minecraftforge.fluids.FluidStack;

import EnumList.EnumFluidList.FluidList;
import EnumList.EnumFluidList.GasList;
import EnumList.EnumFluidList.MoltenList;
import EnumList.EnumFluidList.PlasmaList;
import EnumList.EnumFluidList.PotionList;
import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.OneToManyFluidsFrontend_Huge;

public class EnumFluidListCheck {

    public static int NEI_FluidOutput_Size = 117;

    public static final RecipeMap<RecipeMapBackend> addFluidCheckRecipes = RecipeMapBuilder.of("Fluid Check")
        .maxIO(1, 0, 0, NEI_FluidOutput_Size)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(315))
        .frontend(OneToManyFluidsFrontend_Huge::new)
        .build();

    public static void addEnumFluidListCheckRecipes() {
        // FluidList
        FluidStack[] Fluid_List_Checked = checkFluidStack(FluidList.Fluid_List);
        FluidStack[][] Fluid_List_Split = addSplitAggregateArray(Fluid_List_Checked, NEI_FluidOutput_Size);
        for (FluidStack[] tempFluidStacks : Fluid_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Fluid List Check")
                .eut(0)
                .addTo(addFluidCheckRecipes);
        }

        // GasList
        FluidStack[] Gas_List_Checked = checkFluidStack(GasList.Gas_List);
        FluidStack[][] Gas_List_Split = addSplitAggregateArray(Gas_List_Checked, NEI_FluidOutput_Size);
        for (FluidStack[] tempFluidStacks : Gas_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Gas List Check")
                .eut(0)
                .addTo(addFluidCheckRecipes);
        }

        // MoltenList
        FluidStack[] Molten_List_Checked = checkFluidStack(MoltenList.Molten_List);
        FluidStack[][] Molten_List_Split = addSplitAggregateArray(Molten_List_Checked, NEI_FluidOutput_Size);
        for (FluidStack[] tempFluidStacks : Molten_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Molten List Check")
                .eut(0)
                .addTo(addFluidCheckRecipes);
        }

        // PlasmaList
        FluidStack[] Plasma_List_Checked = checkFluidStack(PlasmaList.Plasma_List);
        FluidStack[][] Plasma_List_Split = addSplitAggregateArray(Plasma_List_Checked, NEI_FluidOutput_Size);
        for (FluidStack[] tempFluidStacks : Plasma_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Plasma List Check")
                .eut(0)
                .addTo(addFluidCheckRecipes);
        }

        // PotionList
        FluidStack[] Potion_List_Checked = checkFluidStack(PotionList.Potion_List);
        FluidStack[][] Potion_List_Split = addSplitAggregateArray(Potion_List_Checked, NEI_FluidOutput_Size);
        for (FluidStack[] tempFluidStacks : Potion_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Potion List Check")
                .eut(0)
                .addTo(addFluidCheckRecipes);
        }
    }
}
