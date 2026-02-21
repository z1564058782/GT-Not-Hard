package Recipes.ChaosRecipes;

import static gregtech.api.enums.TierEU.RECIPE_UXV;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import gtPlusPlus.core.material.MaterialsElements;
import gtnhlanth.common.register.WerkstoffMaterialPool;
import util.RecipesFrontend.ExoticOfChaosFrontend;

public class ChaosExoticRecipes {

    public static final RecipeMap<RecipeMapBackend> ExoticRecipes_DegenerateQuarkGluon = RecipeMapBuilder
        .of("Chaos of Exotic with DegenerateQuarkGluon")
        .maxIO(1, 0, 2, 1)
        .minInputs(1, 1)
        .neiHandlerInfo(builder -> builder.setHeight(128))
        .frontend(ExoticOfChaosFrontend::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> ExoticRecipes_Magmatter = RecipeMapBuilder
        .of("Chaos of Exotic with Magmatter")
        .maxIO(1, 0, 2, 1)
        .minInputs(1, 2)
        .neiHandlerInfo(builder -> builder.setHeight(128))
        .frontend(ExoticOfChaosFrontend::new)
        .build();

    public static void addExoticRecipes_DegenerateQuarkGluon() {
        final ItemStack[] DegenerateQuarkGluon_Item = new ItemStack[] {
            // GT materials
            // "Aluminium Dust"
            Materials.Aluminium.getDust(1),
            // "Americium Dust"
            Materials.Americium.getDust(1),
            // "Antimony Dust"
            Materials.Antimony.getDust(1),
            // "Ardite Dust"
            Materials.Ardite.getDust(1),
            // "Arsenic Dust"
            Materials.Arsenic.getDust(1),
            // "Barium Dust"
            Materials.Barium.getDust(1),
            // "Beryllium Dust"
            Materials.Beryllium.getDust(1),
            // "Caesium Dust"
            Materials.Caesium.getDust(1),
            // "Calcium Dust"
            Materials.Calcium.getDust(1),
            // "Cadmium Dust"
            Materials.Cadmium.getDust(1),
            // "Carbon Dust"
            Materials.Carbon.getDust(1),
            // "Cerium Dust"
            Materials.Cerium.getDust(1),
            // "Cobalt Dust"
            Materials.Cobalt.getDust(1),
            // "Copper Dust"
            Materials.Copper.getDust(1),
            // "Desh Dust"
            Materials.Desh.getDust(1),
            // "Dysprosium Dust"
            Materials.Dysprosium.getDust(1),
            // "Erbium Dust"
            Materials.Erbium.getDust(1),
            // "Europium Dust"
            Materials.Europium.getDust(1),
            // "Gadolinium Dust"
            Materials.Gadolinium.getDust(1),
            // "Gallium Dust"
            Materials.Gallium.getDust(1),
            // "Gold Dust"
            Materials.Gold.getDust(1),
            // "Holmium Dust"
            Materials.Holmium.getDust(1),
            // "Indium Dust"
            Materials.Indium.getDust(1),
            // "Iron Dust"
            Materials.Iron.getDust(1),
            // "Lanthanum Dust"
            Materials.Lanthanum.getDust(1),
            // "Lithium Dust"
            Materials.Lithium.getDust(1),
            // "Lutetium Dust"
            Materials.Lutetium.getDust(1),
            // "Magnesium Dust"
            Materials.Magnesium.getDust(1),
            // "Manganese Dust"
            Materials.Manganese.getDust(1),
            // "Meteoric Iron Dust"
            Materials.MeteoricIron.getDust(1),
            // "Molybdenum Dust"
            Materials.Molybdenum.getDust(1),
            // "Neodymium Dust"
            Materials.Neodymium.getDust(1),
            // "Nickel Dust"
            Materials.Nickel.getDust(1),
            // "Niobium Dust"
            Materials.Niobium.getDust(1),
            // "Oriharukon Dust"
            Materials.Oriharukon.getDust(1),
            // "Palladium Dust"
            Materials.Palladium.getDust(1),
            // "Phosphorus Dust"
            Materials.Phosphorus.getDust(1),
            // "Potassium Dust"
            Materials.Potassium.getDust(1),
            // "Praseodymium Dust"
            Materials.Praseodymium.getDust(1),
            // "Promethium Dust"
            Materials.Promethium.getDust(1),
            // "Rubidium Dust"
            Materials.Rubidium.getDust(1),
            // "Samarium Dust"
            Materials.Samarium.getDust(1),
            // "Raw Silicon Dust"
            Materials.Silicon.getDust(1),
            // "Silver Dust"
            Materials.Silver.getDust(1),
            // "Sodium Dust"
            Materials.Sodium.getDust(1),
            // "Strontium Dust"
            Materials.Strontium.getDust(1),
            // "Sulfur Dust"
            Materials.Sulfur.getDust(1),
            // "Tantalum Dust"
            Materials.Tantalum.getDust(1),
            // "Tellurium Dust"
            Materials.Tellurium.getDust(1),
            // "Terbium Dust"
            Materials.Terbium.getDust(1),
            // "Thulium Dust"
            Materials.Thulium.getDust(1),
            // "Tin Dust"
            Materials.Tin.getDust(1),
            // "Titanium Dust"
            Materials.Titanium.getDust(1),
            // "Tungsten Dust"
            Materials.Tungsten.getDust(1),
            // "Uranium 235 Dust"
            Materials.Uranium235.getDust(1),
            // "Uranium 238 Dust"
            Materials.Uranium.getDust(1),
            // "Vanadium Dust"
            Materials.Vanadium.getDust(1),
            // "Ytterbium Dust"
            Materials.Ytterbium.getDust(1),
            // "Yttrium Dust"
            Materials.Yttrium.getDust(1),
            // "Zinc Dust"
            Materials.Zinc.getDust(1),

            // GT++ materials
            // "Zirconium Dust"
            MaterialsElements.getInstance().ZIRCONIUM.getDust(1),
            // "Thorium 232 Dust"
            MaterialsElements.getInstance().THORIUM232.getDust(1),
            // "Germanium Dust"
            MaterialsElements.getInstance().GERMANIUM.getDust(1),
            // "Thallium Dust"
            MaterialsElements.getInstance().THALLIUM.getDust(1),
            // "Ruthenium Dust"
            MaterialsElements.getInstance().RUTHENIUM.getDust(1),
            // "Rhenium Dust"
            MaterialsElements.getInstance().RHENIUM.getDust(1),
            // "Rhodium Dust"
            MaterialsElements.getInstance().RHODIUM.getDust(1),
            // "Hafnium Dust"
            MaterialsElements.getInstance().HAFNIUM.getDust(1),
            // "Curium Dust"
            MaterialsElements.getInstance().CURIUM.getDust(1),

            // Lanthanides Material
            // "Iodine Dust"
            WerkstoffMaterialPool.Iodine.get(OrePrefixes.dust, 1) };

        final FluidStack[] DegenerateQuarkGluon_Fluid = new FluidStack[] {
            // Radon
            Materials.Radon.getGas(15),
            // Argon
            Materials.Argon.getGas(3),
            // Helium
            Materials.Helium.getGas(15),
            // Tritium
            Materials.Tritium.getGas(39),
            // Nitrogen
            Materials.Nitrogen.getGas(5),
            // Deuterium
            Materials.Deuterium.getGas(8),
            // Fluorine
            Materials.Fluorine.getGas(20),
            // Mercury
            Materials.Mercury.getFluid(28),
            // Hydrogen
            Materials.Hydrogen.getGas(39),
            // Chlorine
            Materials.Chlorine.getGas(8) };

        for (ItemStack inputItem : DegenerateQuarkGluon_Item) {
            for (FluidStack inputFluid : DegenerateQuarkGluon_Fluid) {
                GTValues.RA.stdBuilder()
                    .itemInputs(inputItem)
                    .fluidInputs(inputFluid)
                    .fluidOutputs(FluidRegistry.getFluidStack("quarkgluonplasma", 1000))
                    .duration(40 * SECONDS)
                    .eut(RECIPE_UXV)
                    .addTo(ExoticRecipes_DegenerateQuarkGluon);
            }
        }
    }

    public static void addExoticRecipes_Magmatter() {
        final ItemStack[] Magmatter_Item = new ItemStack[] {
            // GT materials
            // "Cosmic Neutronium Dust"
            Materials.CosmicNeutronium.getDust(1),
            // "Draconium Dust"
            Materials.Draconium.getDust(1),
            // "Awakened Draconium Dust"
            Materials.DraconiumAwakened.getDust(1),
            // "Ichorium Dust"
            Materials.Ichorium.getDust(1),
            // "Neutronium Dust"
            Materials.Neutronium.getDust(1),
            // "Flerovium Dust"
            Materials.Flerovium.getDust(1),
            // "Bedrockium Dust"
            Materials.Bedrockium.getDust(1),
            // "Infinity Dust"
            Materials.Infinity.getDust(1),
            // "Tritanium Dust"
            Materials.Tritanium.getDust(1),

            // GT++ materials
            // "Celestial Tungsten Dust"
            MaterialsElements.STANDALONE.CELESTIAL_TUNGSTEN.getDust(1),
            // "Hypogen Dust"
            MaterialsElements.STANDALONE.HYPOGEN.getDust(1),
            // "Rhugnor Dust"
            MaterialsElements.STANDALONE.RHUGNOR.getDust(1),
            // "Chromatic Glass Dust"
            MaterialsElements.STANDALONE.CHRONOMATIC_GLASS.getDust(1),
            // "Dragonblood Dust"
            MaterialsElements.STANDALONE.DRAGON_METAL.getDust(1) };

        for (ItemStack inputItem : Magmatter_Item) {
            GTValues.RA.stdBuilder()
                .itemInputs(inputItem)
                .fluidInputs(
                    // Spatially Enlarged Fluid
                    FluidRegistry.getFluidStack("spatialfluid", 10),
                    // Tachyon Rich Temporal Fluid
                    FluidRegistry.getFluidStack("temporalfluid", 1))
                .fluidOutputs(
                    // Molten Magmatter
                    FluidRegistry.getFluidStack("molten.magmatter", 576))
                .duration(40 * SECONDS)
                .eut(RECIPE_UXV)
                .addTo(ExoticRecipes_Magmatter);
        }
    }
}
