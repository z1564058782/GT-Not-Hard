package Recipes.SingularityRecipes_VoidFluid;

import static gregtech.api.enums.Mods.NEIOrePlugin;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import net.minecraftforge.fluids.FluidRegistry;

import bartworks.system.material.WerkstoffLoader;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.OneToManyFluidsFrontend_Large;

public class FakeSingularityFluidRecipes_T1 {

    public static final RecipeMap<RecipeMapBackend> addFakeVoidFluidRecipes_T1 = RecipeMapBuilder
        .of("Singularity of T1 Fluid")
        .maxIO(1, 0, 0, 135)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyFluidsFrontend_Large::new)
        .build();

    public static void addFakeVoidFluidRecipes_T1() {
        // T1 - Moon - Mo
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mo", 1L))
            .fluidOutputs(
                // Molten
                Materials.Aluminium.getMolten(1),
                Materials.Barium.getMolten(1),
                Materials.Calcium.getMolten(1),
                Materials.Cerium.getMolten(1),
                Materials.Chrome.getMolten(1),
                Materials.Cobalt.getMolten(1),
                Materials.Copper.getMolten(1),
                Materials.Gadolinium.getMolten(1),
                Materials.Gallium.getMolten(1),
                Materials.Gold.getMolten(1),
                Materials.Holmium.getMolten(1),
                Materials.Iridium.getMolten(1),
                Materials.Iron.getMolten(1),
                Materials.Lanthanum.getMolten(1),
                Materials.Lead.getMolten(1),
                Materials.Magnesium.getMolten(1),
                Materials.MeteoricIron.getMolten(1),
                Materials.Molybdenum.getMolten(1),
                Materials.Neodymium.getMolten(1),
                Materials.Nickel.getMolten(1),
                Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1),
                Materials.Samarium.getMolten(1),
                Materials.Silicon.getMolten(1),
                Materials.Silver.getMolten(1),
                Materials.Thorium.getMolten(1),
                Materials.Tin.getMolten(1),
                Materials.Titanium.getMolten(1),
                Materials.Zinc.getMolten(1),

                WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                FluidRegistry.getFluidStack("molten.zirconium", 1),

                // Fluid
                Materials.SaltWater.getFluid(1),
                Materials.Water.getFluid(1),

                // Gas
                Materials.Fluorine.getGas(1),
                Materials.Helium_3.getGas(1),
                Materials.Hydrogen.getGas(1),
                Materials.Oxygen.getGas(1)

            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Fluid Mode")
            .eut(0)
            .addTo(addFakeVoidFluidRecipes_T1);
    }
}
