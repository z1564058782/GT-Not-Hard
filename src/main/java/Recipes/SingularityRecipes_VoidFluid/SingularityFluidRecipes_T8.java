package Recipes.SingularityRecipes_VoidFluid;

import java.util.HashMap;
import java.util.Map;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import bartworks.system.material.WerkstoffLoader;
import gregtech.api.enums.Materials;

public class SingularityFluidRecipes_T8 {

    public static final Map<String, FluidStack[]> VoidFluidRecipes_T8 = new HashMap<>();

    public static void addVoidFluidRecipes_T8() {
        // T8 - BarnardC - BC
        VoidFluidRecipes_T8.put(
            "BC",
            new FluidStack[] {
                // Oilsands Vein
                Materials.OilHeavy.getFluid(1),

                // Osmium Vein
                Materials.Cobalt.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1), Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                // Tungsten Vein
                Materials.DeepIron.getMolten(1), Materials.Iron.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Molybdenum.getMolten(1), Materials.ShadowIron.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Trinium.getMolten(1), Materials.Tungsten.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Samarium Vein
                Materials.Cerium.getMolten(1), Materials.Gadolinium.getMolten(1), Materials.Holmium.getMolten(1),
                Materials.Samarium.getMolten(1), Materials.Tartarite.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Oxygen.getGas(1),

                // Mica Vein
                Materials.Aluminium.getMolten(1), Materials.Caesium.getMolten(1), Materials.Potassium.getMolten(1),
                Materials.Rubidium.getMolten(1), Materials.Silicon.getMolten(1), Materials.Tin.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Water.getFluid(1),

                Materials.Fluorine.getGas(1), Materials.Oxygen.getGas(1),

                // Black Plutonium Vein
                Materials.Aluminium.getMolten(1), Materials.BlackPlutonium.getMolten(1), Materials.Boron.getMolten(1),
                Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1), Materials.Water.getFluid(1),

                Materials.Oxygen.getGas(1),

                // Arsenic Vein
                Materials.Antimony.getMolten(1), Materials.Arsenic.getMolten(1), Materials.Bismuth.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Zinc.getMolten(1),

                // Lignite Coal Vein
                Materials.Water.getFluid(1),

                // Basaltic Mineral Sand Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Gold.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Potassium.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Water.getFluid(1),

                Materials.Fluorine.getGas(1), Materials.Oxygen.getGas(1),

                // Salt Vein
                Materials.Aluminium.getMolten(1), Materials.Boron.getMolten(1), Materials.Caesium.getMolten(1),
                Materials.Lithium.getMolten(1), Materials.Potassium.getMolten(1), Materials.Silicon.getMolten(1),

                // Void Fluid
                Materials.OilExtraHeavy.getFluid(1), FluidRegistry.getFluidStack("unknowwater", 1) });

        // T8 - BarnardE - BE
        VoidFluidRecipes_T8.put(
            "BE",
            new FluidStack[] {
                // Uranium 238 Vein
                Materials.Lead.getMolten(1), Materials.Thorium.getMolten(1), Materials.Uranium.getMolten(1),
                Materials.Uranium235.getMolten(1),

                Materials.Oxygen.getGas(1), Materials.Radon.getGas(1),

                // Molybdenum Vein
                Materials.Calcium.getMolten(1), Materials.Lead.getMolten(1), Materials.Molybdenum.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Olivine Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Potassium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1), Materials.Water.getFluid(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Tungsten Vein
                Materials.DeepIron.getMolten(1), Materials.Iron.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Molybdenum.getMolten(1), Materials.ShadowIron.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Trinium.getMolten(1), Materials.Tungsten.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Manganese Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Niobium.getMolten(1), Materials.Silicon.getMolten(1), Materials.Tantalum.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Infused Gold Vein
                Materials.Copper.getMolten(1), Materials.Gold.getMolten(1), Materials.InfusedGold.getMolten(1),
                Materials.Iridium.getMolten(1), Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1), Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                // Rare Earth Vein
                Materials.Caesium.getMolten(1), Materials.Cerium.getMolten(1), Materials.Gadolinium.getMolten(1),
                Materials.Holmium.getMolten(1), Materials.Lanthanum.getMolten(1), Materials.Samarium.getMolten(1),

                // Thorium Vein
                Materials.Lead.getMolten(1), Materials.Plutonium241.getMolten(1), Materials.Thorium.getMolten(1),
                Materials.Uranium.getMolten(1), Materials.Uranium235.getMolten(1),

                Materials.Oxygen.getGas(1), Materials.Radon.getGas(1),

                // Copper Vein
                Materials.Calcium.getMolten(1), Materials.Cobalt.getMolten(1), Materials.Copper.getMolten(1),
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Tin.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Neutronium Vein
                Materials.Adamantium.getMolten(1), Materials.Aluminium.getMolten(1), Materials.Gallium.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Naquadah.getMolten(1), Materials.NaquadahEnriched.getMolten(1),
                Materials.Neutronium.getMolten(1), Materials.Silicon.getMolten(1), Materials.Titanium.getMolten(1),
                Materials.Trinium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Nether Star Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Naquadah Vein
                Materials.Adamantium.getMolten(1), Materials.Barium.getMolten(1), Materials.Gallium.getMolten(1),
                Materials.Indium.getMolten(1), Materials.Naquadah.getMolten(1), Materials.NaquadahEnriched.getMolten(1),
                Materials.Naquadria.getMolten(1), Materials.Titanium.getMolten(1),

                // Magnetite Vein
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Tin.getMolten(1), Materials.Vanadium.getMolten(1), Materials.Oxygen.getGas(1),

                // Small Ore Stats
                // Awakened Draconium Ore
                Materials.DraconiumAwakened.getMolten(1),

                // Iron Ore
                Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1), Materials.Tin.getMolten(1),

                // Titanium Ore
                Materials.Aluminium.getMolten(1), Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Titanium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Neutronium Ore
                Materials.Neutronium.getMolten(1),

                // Black Plutonium Ore
                Materials.BlackPlutonium.getMolten(1),

                // Zinc Ore
                Materials.Gallium.getMolten(1), Materials.Tin.getMolten(1), Materials.Zinc.getMolten(1),

                // Nickel Ore
                Materials.Cobalt.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1), Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                // Naquadah Ore
                Materials.Adamantium.getMolten(1), Materials.Gallium.getMolten(1), Materials.Naquadah.getMolten(1),
                Materials.NaquadahEnriched.getMolten(1), Materials.Titanium.getMolten(1),
                Materials.Trinium.getMolten(1),

                // Void Fluid
                Materials.LiquidAir.getFluid(1) });

        // T8 - BarnardF - BF
        VoidFluidRecipes_T8.put(
            "BF",
            new FluidStack[] {
                // Diamond Vein
                Materials.Thorium.getMolten(1),

                // Tungsten Vein
                Materials.DeepIron.getMolten(1), Materials.Iron.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Molybdenum.getMolten(1), Materials.ShadowIron.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Trinium.getMolten(1), Materials.Tungsten.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Manganese Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Niobium.getMolten(1), Materials.Silicon.getMolten(1), Materials.Tantalum.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Pitchblende Vein
                Materials.Lead.getMolten(1), Materials.Thorium.getMolten(1), Materials.Uranium.getMolten(1),
                Materials.Uranium235.getMolten(1),

                Materials.Oxygen.getGas(1), Materials.Radon.getGas(1),

                // Redstone Vein
                Materials.Aluminium.getMolten(1), Materials.Chrome.getMolten(1), Materials.Glowstone.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Redstone.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Mercury.getFluid(1),

                Materials.Oxygen.getGas(1),

                // Monazite Vein
                Materials.Cerium.getMolten(1), Materials.Gadolinium.getMolten(1), Materials.Holmium.getMolten(1),
                Materials.Lanthanum.getMolten(1), Materials.Neodymium.getMolten(1), Materials.Samarium.getMolten(1),
                Materials.Thorium.getMolten(1), FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Fluorine.getGas(1), Materials.Oxygen.getGas(1),

                // Rare Earth Vein
                Materials.Caesium.getMolten(1), Materials.Cerium.getMolten(1), Materials.Gadolinium.getMolten(1),
                Materials.Holmium.getMolten(1), Materials.Lanthanum.getMolten(1), Materials.Samarium.getMolten(1),

                // Thorium Vein
                Materials.Lead.getMolten(1), Materials.Plutonium241.getMolten(1), Materials.Thorium.getMolten(1),
                Materials.Uranium.getMolten(1), Materials.Uranium235.getMolten(1),

                Materials.Oxygen.getGas(1), Materials.Radon.getGas(1),

                // Copper Vein
                Materials.Calcium.getMolten(1), Materials.Cobalt.getMolten(1), Materials.Copper.getMolten(1),
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Tin.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Vanadium Vein
                Materials.Chrome.getMolten(1), Materials.Copper.getMolten(1), Materials.Gold.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Vanadium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Neutronium Vein
                Materials.Adamantium.getMolten(1), Materials.Aluminium.getMolten(1), Materials.Gallium.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Naquadah.getMolten(1), Materials.NaquadahEnriched.getMolten(1),
                Materials.Neutronium.getMolten(1), Materials.Silicon.getMolten(1), Materials.Titanium.getMolten(1),
                Materials.Trinium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Gold Vein
                Materials.Copper.getMolten(1), Materials.Gold.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Vanadium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Beryllium Vein
                Materials.Aluminium.getMolten(1), Materials.Beryllium.getMolten(1), Materials.Lead.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Thorium.getMolten(1), Materials.Uranium.getMolten(1),

                Materials.Oxygen.getGas(1), Materials.Radon.getGas(1),

                // Red Garnet Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Realgar.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Naquadah Vein
                Materials.Adamantium.getMolten(1), Materials.Barium.getMolten(1), Materials.Gallium.getMolten(1),
                Materials.Indium.getMolten(1), Materials.Naquadah.getMolten(1), Materials.NaquadahEnriched.getMolten(1),
                Materials.Naquadria.getMolten(1), Materials.Titanium.getMolten(1),

                // Niobium Vein
                Materials.Gallium.getMolten(1), Materials.Niobium.getMolten(1), Materials.Yttrium.getMolten(1),

                // Small Ore Stats
                // Awakened Draconium Ore
                Materials.DraconiumAwakened.getMolten(1),

                // Iron Ore
                Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1), Materials.Tin.getMolten(1),

                // Titanium Ore
                Materials.Aluminium.getMolten(1), Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Titanium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Neutronium Ore
                Materials.Neutronium.getMolten(1),

                // Gold Ore
                Materials.Copper.getMolten(1), Materials.Gold.getMolten(1), Materials.Nickel.getMolten(1),

                // Black Plutonium Ore
                Materials.BlackPlutonium.getMolten(1),

                // Realgar Ore
                Materials.Realgar.getMolten(1),

                // Nickel Ore
                Materials.Cobalt.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1), Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                // Naquadah Ore
                Materials.Adamantium.getMolten(1), Materials.Gallium.getMolten(1), Materials.Naquadah.getMolten(1),
                Materials.NaquadahEnriched.getMolten(1), Materials.Titanium.getMolten(1),
                Materials.Trinium.getMolten(1),

                // Bedrockium Ore
                Materials.Bedrockium.getMolten(1),

                // Void Fluid
                Materials.Tin.getMolten(1) });

        // T8 - α Centauri Bb - CB
        VoidFluidRecipes_T8.put(
            "CB",
            new FluidStack[] {
                // Sulfur Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Gallium.getMolten(1), Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Zinc.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Manganese Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Niobium.getMolten(1), Materials.Silicon.getMolten(1), Materials.Tantalum.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Samarium Vein
                Materials.Cerium.getMolten(1), Materials.Gadolinium.getMolten(1), Materials.Holmium.getMolten(1),
                Materials.Samarium.getMolten(1), Materials.Tartarite.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Oxygen.getGas(1),

                // Pitchblende Vein
                Materials.Lead.getMolten(1), Materials.Thorium.getMolten(1), Materials.Uranium.getMolten(1),
                Materials.Uranium235.getMolten(1),

                Materials.Oxygen.getGas(1), Materials.Radon.getGas(1),

                // Quartz Vein
                Materials.Barium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Redstone Vein
                Materials.Aluminium.getMolten(1), Materials.Chrome.getMolten(1), Materials.Glowstone.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Redstone.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Mercury.getFluid(1),

                Materials.Oxygen.getGas(1),

                // Black Plutonium Vein
                Materials.Aluminium.getMolten(1), Materials.BlackPlutonium.getMolten(1), Materials.Boron.getMolten(1),
                Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1), Materials.Water.getFluid(1),

                Materials.Oxygen.getGas(1),

                // Rare Earth Vein
                Materials.Caesium.getMolten(1), Materials.Cerium.getMolten(1), Materials.Gadolinium.getMolten(1),
                Materials.Holmium.getMolten(1), Materials.Lanthanum.getMolten(1), Materials.Samarium.getMolten(1),

                // Beryllium Vein
                Materials.Aluminium.getMolten(1), Materials.Beryllium.getMolten(1), Materials.Lead.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Thorium.getMolten(1), Materials.Uranium.getMolten(1),

                Materials.Oxygen.getGas(1), Materials.Radon.getGas(1),

                // Electrotine Vein
                Materials.Aluminium.getMolten(1), Materials.Electrotine.getMolten(1), Materials.Electrum.getMolten(1),
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Potassium.getMolten(1),
                Materials.Redstone.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Nitrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Tetrahedrite Vein
                Materials.Antimony.getMolten(1), Materials.Cobalt.getMolten(1), Materials.Copper.getMolten(1),
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Zinc.getMolten(1),

                // Tin Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Tin.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Nether Quartz Vein
                Materials.Barium.getMolten(1), Materials.Silicon.getMolten(1), Materials.Oxygen.getGas(1),

                // Void Fluid
                Materials.Copper.getMolten(1) });

        // T8 - TCetiE - TE
        VoidFluidRecipes_T8.put(
            "TE",
            new FluidStack[] {
                // Oilsands Vein
                Materials.OilHeavy.getFluid(1),

                // Magnesite Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Quartz Vein
                Materials.Barium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Black Plutonium Vein
                Materials.Aluminium.getMolten(1), Materials.BlackPlutonium.getMolten(1), Materials.Boron.getMolten(1),
                Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1), Materials.Water.getFluid(1),

                Materials.Oxygen.getGas(1),

                // Ilmenite Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Titanium.getMolten(1),

                Materials.Water.getFluid(1),

                Materials.Oxygen.getGas(1),

                // Bauxite Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Gallium.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1), Materials.Titanium.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Gold Vein
                Materials.Copper.getMolten(1), Materials.Gold.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Vanadium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Kaolinite Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Potassium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1), Materials.Water.getFluid(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Nether Star Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Apatite Vein
                Materials.Calcium.getMolten(1), Materials.Niobium.getMolten(1),

                Materials.Chlorine.getGas(1), Materials.Oxygen.getGas(1),

                // Chrome Vein
                Materials.Chrome.getMolten(1), Materials.Iron.getMolten(1), Materials.Lithium.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1), Materials.Molybdenum.getMolten(1),
                Materials.Silver.getMolten(1), Materials.Tungsten.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Magnetite Vein
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Tin.getMolten(1), Materials.Vanadium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Salt Vein
                Materials.Aluminium.getMolten(1), Materials.Boron.getMolten(1), Materials.Caesium.getMolten(1),
                Materials.Lithium.getMolten(1), Materials.Potassium.getMolten(1), Materials.Silicon.getMolten(1),

                // Cassiterite Vein
                Materials.Iron.getMolten(1), Materials.Tin.getMolten(1), Materials.Zinc.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Oxygen.getGas(1),

                // Small Ore Stats
                // Awakened Draconium Ore
                Materials.DraconiumAwakened.getMolten(1),

                // Neutronium Ore
                Materials.Neutronium.getMolten(1),

                // Lapis Ore
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1),

                Materials.Chlorine.getGas(1), Materials.Oxygen.getGas(1),

                // Void Fluid
                Materials.OilExtraHeavy.getFluid(1), FluidRegistry.getFluidStack("ic2distilledwater", 1),

                Materials.Hydrogen.getGas(1) });

        // T8 - VegaB - VB
        VoidFluidRecipes_T8.put(
            "VB",
            new FluidStack[] {
                // Tungstate Vein
                Materials.Calcium.getMolten(1), Materials.Lithium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Molybdenum.getMolten(1), Materials.Silver.getMolten(1), Materials.Tungsten.getMolten(1),

                // Lapis Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1),

                Materials.Chlorine.getGas(1), Materials.Oxygen.getGas(1),

                // Pitchblende Vein
                Materials.Lead.getMolten(1), Materials.Thorium.getMolten(1), Materials.Uranium.getMolten(1),
                Materials.Uranium235.getMolten(1),

                Materials.Oxygen.getGas(1), Materials.Radon.getGas(1),

                // Redstone Vein
                Materials.Aluminium.getMolten(1), Materials.Chrome.getMolten(1), Materials.Glowstone.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Redstone.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Mercury.getFluid(1),

                Materials.Oxygen.getGas(1),

                // Infused Gold Vein
                Materials.Copper.getMolten(1), Materials.Gold.getMolten(1), Materials.InfusedGold.getMolten(1),
                Materials.Iridium.getMolten(1), Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1), Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                // Rare Earth Vein
                Materials.Caesium.getMolten(1), Materials.Cerium.getMolten(1), Materials.Gadolinium.getMolten(1),
                Materials.Holmium.getMolten(1), Materials.Lanthanum.getMolten(1), Materials.Samarium.getMolten(1),

                // Thorium Vein
                Materials.Lead.getMolten(1), Materials.Plutonium241.getMolten(1), Materials.Thorium.getMolten(1),
                Materials.Uranium.getMolten(1), Materials.Uranium235.getMolten(1),

                Materials.Oxygen.getGas(1), Materials.Radon.getGas(1),

                // Arsenic Vein
                Materials.Antimony.getMolten(1), Materials.Arsenic.getMolten(1), Materials.Bismuth.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Zinc.getMolten(1),

                // Vanadium Vein
                Materials.Chrome.getMolten(1), Materials.Copper.getMolten(1), Materials.Gold.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Vanadium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Neutronium Vein
                Materials.Adamantium.getMolten(1), Materials.Aluminium.getMolten(1), Materials.Gallium.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Naquadah.getMolten(1), Materials.NaquadahEnriched.getMolten(1),
                Materials.Neutronium.getMolten(1), Materials.Silicon.getMolten(1), Materials.Titanium.getMolten(1),
                Materials.Trinium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Gold Vein
                Materials.Copper.getMolten(1), Materials.Gold.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Vanadium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Nether Star Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Red Garnet Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Realgar.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Tetrahedrite Vein
                Materials.Antimony.getMolten(1), Materials.Cobalt.getMolten(1), Materials.Copper.getMolten(1),
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Zinc.getMolten(1),

                // Galena Vein
                Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                // Naquadah Vein
                Materials.Adamantium.getMolten(1), Materials.Barium.getMolten(1), Materials.Gallium.getMolten(1),
                Materials.Indium.getMolten(1), Materials.Naquadah.getMolten(1), Materials.NaquadahEnriched.getMolten(1),
                Materials.Naquadria.getMolten(1), Materials.Titanium.getMolten(1),

                // Niobium Vein
                Materials.Gallium.getMolten(1), Materials.Niobium.getMolten(1), Materials.Yttrium.getMolten(1),

                // Small Ore Stats
                // Awakened Draconium Ore
                Materials.DraconiumAwakened.getMolten(1),

                // Silver Ore
                Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                // Lead Ore
                Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                // Neutronium Ore
                Materials.Neutronium.getMolten(1),

                // Infinity Catalyst Ore
                Materials.InfinityCatalyst.getMolten(1),

                // Diamond Ore

                // Black Plutonium Ore
                Materials.BlackPlutonium.getMolten(1),

                // Chromite Ore
                Materials.Chrome.getMolten(1), Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Bismuth Ore
                Materials.Bismuth.getMolten(1) });
    }
}
