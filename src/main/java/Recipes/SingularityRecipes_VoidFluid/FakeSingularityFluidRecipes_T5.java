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
import util.OneToManyFluidsFrontend;

public class FakeSingularityFluidRecipes_T5 {

    public static final RecipeMap<RecipeMapBackend> addFakeVoidFluidRecipes_T5 = RecipeMapBuilder
        .of("Singularity of T5 Fluid")
        .maxIO(1, 0, 0, 135)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyFluidsFrontend::new)
        .build();

    public static void addFakeVoidFluidRecipes_T5() {
        // T5 - Enceladus - En
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_En", 1L))
            .fluidOutputs(
                // Molten
                Materials.Adamantium.getMolten(1),
                Materials.Aluminium.getMolten(1),
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
                Materials.Ledox.getMolten(1),
                Materials.Lithium.getMolten(1),
                Materials.Magnesium.getMolten(1),
                Materials.Manganese.getMolten(1),
                Materials.Mithril.getMolten(1),
                Materials.Molybdenum.getMolten(1),
                Materials.Naquadah.getMolten(1),
                Materials.NaquadahEnriched.getMolten(1),
                Materials.Neodymium.getMolten(1),
                Materials.Neutronium.getMolten(1),
                Materials.Nickel.getMolten(1),
                Materials.Orichalcum.getMolten(1),
                Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1),
                Materials.Potassium.getMolten(1),
                Materials.Rubracium.getMolten(1),
                Materials.Samarium.getMolten(1),
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
                Materials.Vanadium.getMolten(1),
                Materials.Zinc.getMolten(1),

                WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                FluidRegistry.getFluidStack("molten.zirconium", 1),

                // Fluid
                Materials.Sodium.getFluid(1),

                // Gas
                Materials.Chlorine.getGas(1),
                Materials.Fluorine.getGas(1),
                Materials.Hydrogen.getGas(1),
                Materials.Nitrogen.getGas(1),
                Materials.Oxygen.getGas(1),
                Materials.Radon.getGas(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Fluid Mode")
            .eut(0)
            .addTo(addFakeVoidFluidRecipes_T5);

        // T5 - Miranda - Mi
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mi", 1L))
            .fluidOutputs(
                // Molten
                Materials.Aluminium.getMolten(1),
                Materials.Antimony.getMolten(1),
                Materials.Calcium.getMolten(1),
                Materials.Chrome.getMolten(1),
                Materials.Cobalt.getMolten(1),
                Materials.Copper.getMolten(1),
                Materials.Desh.getMolten(1),
                Materials.Draconium.getMolten(1),
                Materials.Electrotine.getMolten(1),
                Materials.Electrum.getMolten(1),
                Materials.Glowstone.getMolten(1),
                Materials.Gold.getMolten(1),
                Materials.Iridium.getMolten(1),
                Materials.Iron.getMolten(1),
                Materials.Lithium.getMolten(1),
                Materials.Magnesium.getMolten(1),
                Materials.Manganese.getMolten(1),
                Materials.Mithril.getMolten(1),
                Materials.Molybdenum.getMolten(1),
                Materials.Mytryl.getMolten(1),
                Materials.Nickel.getMolten(1),
                Materials.Niobium.getMolten(1),
                Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1),
                Materials.Redstone.getMolten(1),
                Materials.Samarium.getMolten(1),
                Materials.Silicon.getMolten(1),
                Materials.Silver.getMolten(1),
                Materials.Tantalum.getMolten(1),
                Materials.Thaumium.getMolten(1),
                Materials.Thorium.getMolten(1),
                Materials.Tin.getMolten(1),
                Materials.Titanium.getMolten(1),
                Materials.Tungsten.getMolten(1),
                Materials.Vinteum.getMolten(1),
                Materials.Zinc.getMolten(1),

                WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                FluidRegistry.getFluidStack("molten.zirconium", 1),

                // Fluid
                Materials.Mercury.getFluid(1),
                Materials.Sodium.getFluid(1),
                Materials.Water.getFluid(1),

                // Gas
                Materials.Chlorine.getGas(1),
                Materials.HydricSulfide.getGas(1),
                Materials.Oxygen.getGas(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Fluid Mode")
            .eut(0)
            .addTo(addFakeVoidFluidRecipes_T5);

        // T5 - Oberon - Ob
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ob", 1L))
            .fluidOutputs(
                // Molten
                Materials.Adamantium.getMolten(1),
                Materials.Aluminium.getMolten(1),
                Materials.Barium.getMolten(1),
                Materials.Calcium.getMolten(1),
                Materials.Chrome.getMolten(1),
                Materials.Cobalt.getMolten(1),
                Materials.Copper.getMolten(1),
                Materials.DeepIron.getMolten(1),
                Materials.Draconium.getMolten(1),
                Materials.Gallium.getMolten(1),
                Materials.Indium.getMolten(1),
                Materials.Iridium.getMolten(1),
                Materials.Iron.getMolten(1),
                Materials.Lead.getMolten(1),
                Materials.Ledox.getMolten(1),
                Materials.Lithium.getMolten(1),
                Materials.Magnesium.getMolten(1),
                Materials.Manganese.getMolten(1),
                Materials.Molybdenum.getMolten(1),
                Materials.Naquadah.getMolten(1),
                Materials.NaquadahEnriched.getMolten(1),
                Materials.Naquadria.getMolten(1),
                Materials.Neutronium.getMolten(1),
                Materials.Nickel.getMolten(1),
                Materials.Niobium.getMolten(1),
                Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1),
                Materials.ShadowIron.getMolten(1),
                Materials.Silicon.getMolten(1),
                Materials.Silver.getMolten(1),
                Materials.Tantalum.getMolten(1),
                Materials.Thorium.getMolten(1),
                Materials.Titanium.getMolten(1),
                Materials.Trinium.getMolten(1),
                Materials.Tungsten.getMolten(1),
                Materials.Uranium.getMolten(1),
                Materials.Uranium235.getMolten(1),

                WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                // Fluid
                Materials.Sodium.getFluid(1),

                // Gas
                Materials.CarbonMonoxide.getGas(1),
                Materials.Chlorine.getGas(1),
                Materials.Hydrogen.getGas(1),
                Materials.Oxygen.getGas(1),
                Materials.Radon.getGas(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Fluid Mode")
            .eut(0)
            .addTo(addFakeVoidFluidRecipes_T5);

        // T5 - Titan - Ti
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ti", 1L))
            .fluidOutputs(
                // Molten
                Materials.Adamantium.getMolten(1),
                Materials.Aluminium.getMolten(1),
                Materials.Antimony.getMolten(1),
                Materials.Arsenic.getMolten(1),
                Materials.Barium.getMolten(1),
                Materials.Beryllium.getMolten(1),
                Materials.Bismuth.getMolten(1),
                Materials.Calcium.getMolten(1),
                Materials.Cerium.getMolten(1),
                Materials.Chrome.getMolten(1),
                Materials.Cobalt.getMolten(1),
                Materials.Copper.getMolten(1),
                Materials.Gadolinium.getMolten(1),
                Materials.Gallium.getMolten(1),
                Materials.Glowstone.getMolten(1),
                Materials.Gold.getMolten(1),
                Materials.Holmium.getMolten(1),
                Materials.Indium.getMolten(1),
                Materials.InfusedGold.getMolten(1),
                Materials.Iridium.getMolten(1),
                Materials.Iron.getMolten(1),
                Materials.Lanthanum.getMolten(1),
                Materials.Lead.getMolten(1),
                Materials.Lithium.getMolten(1),
                Materials.Magnesium.getMolten(1),
                Materials.Manganese.getMolten(1),
                Materials.MeteoricIron.getMolten(1),
                Materials.Mithril.getMolten(1),
                Materials.Molybdenum.getMolten(1),
                Materials.Naquadah.getMolten(1),
                Materials.NaquadahEnriched.getMolten(1),
                Materials.Naquadria.getMolten(1),
                Materials.Neodymium.getMolten(1),
                Materials.Neutronium.getMolten(1),
                Materials.Nickel.getMolten(1),
                Materials.Niobium.getMolten(1),
                Materials.Oriharukon.getMolten(1),
                Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1),
                Materials.Quantium.getMolten(1),
                Materials.Redstone.getMolten(1),
                Materials.Samarium.getMolten(1),
                Materials.Silicon.getMolten(1),
                Materials.Silver.getMolten(1),
                Materials.Tantalum.getMolten(1),
                Materials.Thaumium.getMolten(1),
                Materials.Thorium.getMolten(1),
                Materials.Tin.getMolten(1),
                Materials.Titanium.getMolten(1),
                Materials.Tungsten.getMolten(1),
                Materials.Uranium.getMolten(1),
                Materials.Zinc.getMolten(1),

                WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                FluidRegistry.getFluidStack("molten.zirconium", 1),

                // Fluid
                Materials.Mercury.getFluid(1),
                Materials.Sodium.getFluid(1),
                Materials.Water.getFluid(1),

                // Gas
                Materials.Chlorine.getGas(1),
                Materials.Ethane.getGas(1),
                Materials.Fluorine.getGas(1),
                Materials.Hydrogen.getGas(1),
                Materials.Methane.getGas(1),
                Materials.Oxygen.getGas(1),
                Materials.Radon.getGas(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Fluid Mode")
            .eut(0)
            .addTo(addFakeVoidFluidRecipes_T5);

        // T5 - Ross128ba - Ra
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ra", 1L))
            .fluidOutputs(
                // Molten
                Materials.Adamantium.getMolten(1),
                Materials.Aluminium.getMolten(1),
                Materials.Arsenic.getMolten(1),
                Materials.Barium.getMolten(1),
                Materials.Boron.getMolten(1),
                Materials.Calcium.getMolten(1),
                Materials.Chrome.getMolten(1),
                Materials.Copper.getMolten(1),
                Materials.Europium.getMolten(1),
                Materials.Gallium.getMolten(1),
                Materials.Indium.getMolten(1),
                Materials.Iron.getMolten(1),
                Materials.Lead.getMolten(1),
                Materials.Magnalium.getMolten(1),
                Materials.Magnesium.getMolten(1),
                Materials.Manganese.getMolten(1),
                Materials.Molybdenum.getMolten(1),
                Materials.Naquadah.getMolten(1),
                Materials.NaquadahEnriched.getMolten(1),
                Materials.Naquadria.getMolten(1),
                Materials.Potassium.getMolten(1),
                Materials.Silicon.getMolten(1),
                Materials.Silver.getMolten(1),
                Materials.Titanium.getMolten(1),
                Materials.Tungsten.getMolten(1),
                Materials.Vanadium.getMolten(1),
                Materials.Zinc.getMolten(1),

                // Fluid
                Materials.SaltWater.getFluid(1),

                // Gas
                Materials.Argon.getGas(1),
                Materials.Fluorine.getGas(1),
                Materials.Helium_3.getGas(1),
                Materials.Oxygen.getGas(1),

                WerkstoffLoader.Neon.getFluidOrGas(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Fluid Mode")
            .eut(0)
            .addTo(addFakeVoidFluidRecipes_T5);
    }
}
