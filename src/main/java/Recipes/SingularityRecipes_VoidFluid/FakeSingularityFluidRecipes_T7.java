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

public class FakeSingularityFluidRecipes_T7 {

    public static final RecipeMap<RecipeMapBackend> addFakeVoidFluidRecipes_T7 = RecipeMapBuilder
        .of("Singularity of T7 Fluid")
        .maxIO(1, 0, 0, 135)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyFluidsFrontend_Large::new)
        .build();

    public static void addFakeVoidFluidRecipes_T7() {
        // T7 - Haumea - Ha
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ha", 1L))
            .fluidOutputs(
                // Molten
                Materials.Adamantium.getMolten(1),
                Materials.Aluminium.getMolten(1),
                Materials.Barium.getMolten(1),
                Materials.Beryllium.getMolten(1),
                Materials.BlackPlutonium.getMolten(1),
                Materials.Calcium.getMolten(1),
                Materials.Cerium.getMolten(1),
                Materials.Chrome.getMolten(1),
                Materials.Copper.getMolten(1),
                Materials.Desh.getMolten(1),
                Materials.Draconium.getMolten(1),
                Materials.Gadolinium.getMolten(1),
                Materials.Gallium.getMolten(1),
                Materials.Gold.getMolten(1),
                Materials.Holmium.getMolten(1),
                Materials.Indium.getMolten(1),
                Materials.InfusedGold.getMolten(1),
                Materials.Iridium.getMolten(1),
                Materials.Iron.getMolten(1),
                Materials.Lanthanum.getMolten(1),
                Materials.Lead.getMolten(1),
                Materials.Ledox.getMolten(1),
                Materials.Lithium.getMolten(1),
                Materials.Magnesium.getMolten(1),
                Materials.Manganese.getMolten(1),
                Materials.Molybdenum.getMolten(1),
                Materials.Naquadah.getMolten(1),
                Materials.NaquadahEnriched.getMolten(1),
                Materials.Naquadria.getMolten(1),
                Materials.Neodymium.getMolten(1),
                Materials.Neutronium.getMolten(1),
                Materials.Nickel.getMolten(1),
                Materials.Oriharukon.getMolten(1),
                Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1),
                Materials.Plutonium241.getMolten(1),
                Materials.Potassium.getMolten(1),
                Materials.Quantium.getMolten(1),
                Materials.Samarium.getMolten(1),
                Materials.Silicon.getMolten(1),
                Materials.Silver.getMolten(1),
                Materials.Thorium.getMolten(1),
                Materials.Tin.getMolten(1),
                Materials.Titanium.getMolten(1),
                Materials.Trinium.getMolten(1),
                Materials.Tungsten.getMolten(1),
                Materials.Uranium.getMolten(1),
                Materials.Uranium235.getMolten(1),
                Materials.Zinc.getMolten(1),

                WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                FluidRegistry.getFluidStack("molten.zirconium", 1),

                // Fluid
                Materials.Sodium.getFluid(1),
                Materials.Water.getFluid(1),

                // Gas
                Materials.Fluorine.getGas(1),
                Materials.Hydrogen.getGas(1),
                Materials.Oxygen.getGas(1),
                Materials.Radon.getGas(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Fluid Mode")
            .eut(0)
            .addTo(addFakeVoidFluidRecipes_T7);

        // T7 - Kuiperbelt - KB
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_KB", 1L))
            .fluidOutputs(
                // Molten
                Materials.Adamantium.getMolten(1),
                Materials.Aluminium.getMolten(1),
                Materials.Antimony.getMolten(1),
                Materials.Arsenic.getMolten(1),
                Materials.Barium.getMolten(1),
                Materials.Calcium.getMolten(1),
                Materials.Chrome.getMolten(1),
                Materials.Cobalt.getMolten(1),
                Materials.Copper.getMolten(1),
                Materials.Gallium.getMolten(1),
                Materials.Gold.getMolten(1),
                Materials.Indium.getMolten(1),
                Materials.Iridium.getMolten(1),
                Materials.Iron.getMolten(1),
                Materials.Lead.getMolten(1),
                Materials.Lithium.getMolten(1),
                Materials.Magnesium.getMolten(1),
                Materials.Manganese.getMolten(1),
                Materials.Mithril.getMolten(1),
                Materials.Molybdenum.getMolten(1),
                Materials.Naquadah.getMolten(1),
                Materials.NaquadahEnriched.getMolten(1),
                Materials.Naquadria.getMolten(1),
                Materials.Neutronium.getMolten(1),
                Materials.Nickel.getMolten(1),
                Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1),
                Materials.Silicon.getMolten(1),
                Materials.Silver.getMolten(1),
                Materials.Thaumium.getMolten(1),
                Materials.Thorium.getMolten(1),
                Materials.Tin.getMolten(1),
                Materials.Titanium.getMolten(1),
                Materials.Trinium.getMolten(1),
                Materials.Tungsten.getMolten(1),
                Materials.Uranium.getMolten(1),
                Materials.Uranium235.getMolten(1),
                Materials.Zinc.getMolten(1),

                WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                FluidRegistry.getFluidStack("molten.zirconium", 1),

                // Fluid

                // Gas
                Materials.Hydrogen.getGas(1),
                Materials.Oxygen.getGas(1),
                Materials.Radon.getGas(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Fluid Mode")
            .eut(0)
            .addTo(addFakeVoidFluidRecipes_T7);

        // // T7 - Makemake - MM
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_MM", 1L))
            .fluidOutputs(
                // Molten
                Materials.Adamantium.getMolten(1),
                Materials.Aluminium.getMolten(1),
                Materials.Beryllium.getMolten(1),
                Materials.Bismuth.getMolten(1),
                Materials.BlackPlutonium.getMolten(1),
                Materials.Boron.getMolten(1),
                Materials.Calcium.getMolten(1),
                Materials.Cerium.getMolten(1),
                Materials.Chrome.getMolten(1),
                Materials.Cobalt.getMolten(1),
                Materials.Copper.getMolten(1),
                Materials.Desh.getMolten(1),
                Materials.Draconium.getMolten(1),
                Materials.Gadolinium.getMolten(1),
                Materials.Gallium.getMolten(1),
                Materials.Gold.getMolten(1),
                Materials.Holmium.getMolten(1),
                Materials.Iridium.getMolten(1),
                Materials.Iron.getMolten(1),
                Materials.Lanthanum.getMolten(1),
                Materials.Lead.getMolten(1),
                Materials.Lithium.getMolten(1),
                Materials.Magnesium.getMolten(1),
                Materials.Manganese.getMolten(1),
                Materials.Molybdenum.getMolten(1),
                Materials.Mytryl.getMolten(1),
                Materials.Naquadah.getMolten(1),
                Materials.NaquadahEnriched.getMolten(1),
                Materials.Neodymium.getMolten(1),
                Materials.Neutronium.getMolten(1),
                Materials.Nickel.getMolten(1),
                Materials.Niobium.getMolten(1),
                Materials.Oriharukon.getMolten(1),
                Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1),
                Materials.Potassium.getMolten(1),
                Materials.Quantium.getMolten(1),
                Materials.Realgar.getMolten(1),
                Materials.Samarium.getMolten(1),
                Materials.Silicon.getMolten(1),
                Materials.Silver.getMolten(1),
                Materials.Thorium.getMolten(1),
                Materials.Tin.getMolten(1),
                Materials.Titanium.getMolten(1),
                Materials.Trinium.getMolten(1),
                Materials.Tungsten.getMolten(1),
                Materials.Uranium.getMolten(1),
                Materials.Uranium235.getMolten(1),
                Materials.Vanadium.getMolten(1),
                Materials.Yttrium.getMolten(1),
                Materials.Zinc.getMolten(1),

                WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                FluidRegistry.getFluidStack("molten.zirconium", 1),

                // Fluid
                Materials.Sodium.getFluid(1),
                Materials.Water.getFluid(1),

                // Gas
                Materials.Fluorine.getGas(1),
                Materials.Hydrogen.getGas(1),
                Materials.Oxygen.getGas(1),
                Materials.Radon.getGas(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Fluid Mode")
            .eut(0)
            .addTo(addFakeVoidFluidRecipes_T7);

        // T7 - Pluto - Pl
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Pl", 1L))
            .fluidOutputs(
                // Molten
                Materials.Adamantium.getMolten(1),
                Materials.Aluminium.getMolten(1),
                Materials.Barium.getMolten(1),
                Materials.Beryllium.getMolten(1),
                Materials.BlackPlutonium.getMolten(1),
                Materials.Boron.getMolten(1),
                Materials.Calcium.getMolten(1),
                Materials.Chrome.getMolten(1),
                Materials.Cobalt.getMolten(1),
                Materials.Copper.getMolten(1),
                Materials.DeepIron.getMolten(1),
                Materials.Draconium.getMolten(1),
                Materials.Gallium.getMolten(1),
                Materials.Gold.getMolten(1),
                Materials.Indium.getMolten(1),
                Materials.Iridium.getMolten(1),
                Materials.Iron.getMolten(1),
                Materials.Lead.getMolten(1),
                Materials.Ledox.getMolten(1),
                Materials.Lithium.getMolten(1),
                Materials.Magnesium.getMolten(1),
                Materials.Manganese.getMolten(1),
                Materials.MeteoricIron.getMolten(1),
                Materials.Molybdenum.getMolten(1),
                Materials.Naquadah.getMolten(1),
                Materials.NaquadahEnriched.getMolten(1),
                Materials.Naquadria.getMolten(1),
                Materials.Neutronium.getMolten(1),
                Materials.Nickel.getMolten(1),
                Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1),
                Materials.Plutonium241.getMolten(1),
                Materials.Quantium.getMolten(1),
                Materials.ShadowIron.getMolten(1),
                Materials.Silicon.getMolten(1),
                Materials.Silver.getMolten(1),
                Materials.Thorium.getMolten(1),
                Materials.Titanium.getMolten(1),
                Materials.Trinium.getMolten(1),
                Materials.Tungsten.getMolten(1),
                Materials.Uranium.getMolten(1),
                Materials.Uranium235.getMolten(1),
                Materials.Vanadium.getMolten(1),

                WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                FluidRegistry.getFluidStack("molten.zirconium", 1),

                // Fluid
                Materials.LiquidAir.getFluid(1),
                Materials.Sodium.getFluid(1),
                Materials.Water.getFluid(1),

                // Gas
                Materials.Fluorine.getGas(1),
                Materials.Hydrogen.getGas(1),
                Materials.Nitrogen.getGas(1),
                Materials.Oxygen.getGas(1),
                Materials.Radon.getGas(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Fluid Mode")
            .eut(0)
            .addTo(addFakeVoidFluidRecipes_T7);
    }
}
