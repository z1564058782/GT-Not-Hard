package Recipes.SingularityRecipes_VoidFluid;

import java.util.HashMap;
import java.util.Map;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import bartworks.system.material.WerkstoffLoader;
import gregtech.api.enums.Materials;

public class SingularityFluidRecipes_T3 {

    public static final Map<String, FluidStack[]> VoidFluidRecipes_T3 = new HashMap<>();

    public static void addVoidFluidRecipes_T3() {
        // T3 - Asteroids - As
        VoidFluidRecipes_T3.put(
            "As",
            new FluidStack[] {
                // Tungstate Vein
                Materials.Calcium.getMolten(1), Materials.Lithium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Molybdenum.getMolten(1), Materials.Silver.getMolten(1), Materials.Tungsten.getMolten(1),

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

                // Tetrahedrite Vein
                Materials.Antimony.getMolten(1), Materials.Cobalt.getMolten(1), Materials.Copper.getMolten(1),
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Zinc.getMolten(1),

                // Naquadah Vein
                Materials.Adamantium.getMolten(1), Materials.Barium.getMolten(1), Materials.Gallium.getMolten(1),
                Materials.Indium.getMolten(1), Materials.Naquadah.getMolten(1), Materials.NaquadahEnriched.getMolten(1),
                Materials.Naquadria.getMolten(1), Materials.Titanium.getMolten(1), Materials.Trinium.getMolten(1),

                // Small Ore Stats
                // Iron Ore
                Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1), Materials.Tin.getMolten(1),

                // Titanium Ore
                Materials.Aluminium.getMolten(1), Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Titanium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Lead Ore
                Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                // Gold Ore
                Materials.Copper.getMolten(1), Materials.Gold.getMolten(1), Materials.Nickel.getMolten(1),

                // Diamond Ore

                // Chromite Ore
                Materials.Chrome.getMolten(1), Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Tungstate Ore
                Materials.Lithium.getMolten(1), Materials.Manganese.getMolten(1), Materials.Silver.getMolten(1),
                Materials.Tungsten.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Nickel Ore
                Materials.Cobalt.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1), Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1) });

        // T3 - Callisto - Ca
        VoidFluidRecipes_T3.put(
            "Ca",
            new FluidStack[] {
                // Tungstate Vein
                Materials.Calcium.getMolten(1), Materials.Lithium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Molybdenum.getMolten(1), Materials.Silver.getMolten(1), Materials.Tungsten.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Plutonium 239 Vein
                Materials.Lead.getMolten(1), Materials.Plutonium.getMolten(1), Materials.Thorium.getMolten(1),
                Materials.Uranium.getMolten(1), Materials.Uranium235.getMolten(1),

                Materials.Radon.getGas(1),

                // Monazite Vein
                Materials.Cerium.getMolten(1), Materials.Gadolinium.getMolten(1), Materials.Holmium.getMolten(1),
                Materials.Lanthanum.getMolten(1), Materials.Neodymium.getMolten(1), Materials.Samarium.getMolten(1),
                Materials.Thorium.getMolten(1), FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Fluorine.getGas(1), Materials.Oxygen.getGas(1),

                // Ilmenite Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Titanium.getMolten(1),

                Materials.Water.getFluid(1),

                Materials.Oxygen.getGas(1),

                // Palladium Vein
                Materials.Chrome.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1), Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                // Callisto Ice Vein
                Materials.Alduorite.getMolten(1), Materials.Aluminium.getMolten(1), Materials.CallistoIce.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Water.getFluid(1),

                Materials.Fluorine.getGas(1), Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Copper Vein
                Materials.Calcium.getMolten(1), Materials.Cobalt.getMolten(1), Materials.Copper.getMolten(1),
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Tin.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Gold Vein
                Materials.Copper.getMolten(1), Materials.Gold.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Vanadium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Iron Vein
                Materials.Calcium.getMolten(1), Materials.Copper.getMolten(1), Materials.Iron.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Small Ore Stats
                // Iron Ore
                Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1), Materials.Tin.getMolten(1),

                // Mytryl Ore
                Materials.Mytryl.getMolten(1), Materials.Samarium.getMolten(1), Materials.Zinc.getMolten(1),

                // Titanium Ore
                Materials.Aluminium.getMolten(1), Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Titanium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Ledox Ore
                Materials.Ledox.getMolten(1),

                // Gold Ore
                Materials.Copper.getMolten(1), Materials.Gold.getMolten(1), Materials.Nickel.getMolten(1),

                // Diamond Ore

                // Chromite Ore
                Materials.Chrome.getMolten(1), Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Tungstate Ore
                Materials.Lithium.getMolten(1), Materials.Manganese.getMolten(1), Materials.Silver.getMolten(1),
                Materials.Tungsten.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Desh Ore
                Materials.Desh.getMolten(1),

                // Bismuth Ore
                Materials.Bismuth.getMolten(1),

                // Void Fluid
                Materials.LiquidAir.getFluid(1),

                Materials.Oxygen.getGas(1) });

        // T3 - Ceres - Ce
        VoidFluidRecipes_T3.put(
            "Ce",
            new FluidStack[] {
                // Uranium 238 Vein
                Materials.Lead.getMolten(1), Materials.Thorium.getMolten(1), Materials.Uranium.getMolten(1),
                Materials.Uranium235.getMolten(1),

                Materials.Oxygen.getGas(1), Materials.Radon.getGas(1),

                // Plutonium 239 Vein
                Materials.Lead.getMolten(1), Materials.Plutonium.getMolten(1), Materials.Thorium.getMolten(1),
                Materials.Uranium.getMolten(1), Materials.Uranium235.getMolten(1),

                Materials.Radon.getGas(1),

                // Lapis Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1),

                Materials.Chlorine.getGas(1), Materials.Oxygen.getGas(1),

                // Molybdenum Vein
                Materials.Calcium.getMolten(1), Materials.Lead.getMolten(1), Materials.Molybdenum.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Olivine Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Potassium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1), Materials.Water.getFluid(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Manganese Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Niobium.getMolten(1), Materials.Silicon.getMolten(1), Materials.Tantalum.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Palladium Vein
                Materials.Chrome.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1), Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                // Copper Vein
                Materials.Calcium.getMolten(1), Materials.Cobalt.getMolten(1), Materials.Copper.getMolten(1),
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Tin.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Soapstone Vein
                Materials.Aluminium.getMolten(1), Materials.Copper.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Nickel.getMolten(1), Materials.Potassium.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Iron Vein
                Materials.Calcium.getMolten(1), Materials.Copper.getMolten(1), Materials.Iron.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Beryllium Vein
                Materials.Aluminium.getMolten(1), Materials.Beryllium.getMolten(1), Materials.Lead.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Thorium.getMolten(1), Materials.Uranium.getMolten(1),

                Materials.Oxygen.getGas(1), Materials.Radon.getGas(1),

                // Electrotine Vein
                Materials.Aluminium.getMolten(1), Materials.Electrotine.getMolten(1), Materials.Electrum.getMolten(1),
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Potassium.getMolten(1),
                Materials.Redstone.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Nitrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Magnetite Vein
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Tin.getMolten(1), Materials.Vanadium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Small Ore Stats
                // Titanium Ore
                Materials.Aluminium.getMolten(1), Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Titanium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Oriharukon Ore
                Materials.Oriharukon.getMolten(1),

                // Lead Ore
                Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                // Gold Ore
                Materials.Copper.getMolten(1), Materials.Gold.getMolten(1), Materials.Nickel.getMolten(1),

                // Diamond Ore

                // Chromite Ore
                Materials.Chrome.getMolten(1), Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Tungstate Ore
                Materials.Lithium.getMolten(1), Materials.Manganese.getMolten(1), Materials.Silver.getMolten(1),
                Materials.Tungsten.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Bismuth Ore
                Materials.Bismuth.getMolten(1),

                // Nickel Ore
                Materials.Cobalt.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1), Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                // Quantium Ore
                Materials.Quantium.getMolten(1),

                // Naquadah Ore
                Materials.Adamantium.getMolten(1), Materials.Gallium.getMolten(1), Materials.Naquadah.getMolten(1),
                Materials.NaquadahEnriched.getMolten(1), Materials.Titanium.getMolten(1),
                Materials.Trinium.getMolten(1) });

        // T3 - Europa - Eu
        VoidFluidRecipes_T3.put(
            "Eu",
            new FluidStack[] {
                // Magnesite Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Basaltic Mineral Sand Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Gold.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Potassium.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Water.getFluid(1),

                Materials.Fluorine.getGas(1), Materials.Oxygen.getGas(1),

                // Chrome Vein
                Materials.Chrome.getMolten(1), Materials.Iron.getMolten(1), Materials.Lithium.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1), Materials.Molybdenum.getMolten(1),
                Materials.Silver.getMolten(1), Materials.Tungsten.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Ledox Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Ledox.getMolten(1),
                Materials.Orichalcum.getMolten(1), Materials.Rubracium.getMolten(1), Materials.Samarium.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Tin Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Tin.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Void Fluid
                Materials.OilExtraHeavy.getFluid(1), Materials.SaltWater.getFluid(1),
                FluidRegistry.getFluidStack("ic2distilledwater", 1) });

        // T3 - Ganymede - Ga
        VoidFluidRecipes_T3.put(
            "Ga",
            new FluidStack[] {
                // Uranium 238 Vein
                Materials.Lead.getMolten(1), Materials.Thorium.getMolten(1), Materials.Uranium.getMolten(1),
                Materials.Uranium235.getMolten(1),

                Materials.Oxygen.getGas(1), Materials.Radon.getGas(1),

                // Tungstate Vein
                Materials.Calcium.getMolten(1), Materials.Lithium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Molybdenum.getMolten(1), Materials.Silver.getMolten(1), Materials.Tungsten.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Plutonium 239 Vein
                Materials.Lead.getMolten(1), Materials.Plutonium.getMolten(1), Materials.Thorium.getMolten(1),
                Materials.Uranium.getMolten(1), Materials.Uranium235.getMolten(1),

                Materials.Radon.getGas(1),

                // Diamond Vein
                Materials.Thorium.getMolten(1),

                // Redstone Vein
                Materials.Aluminium.getMolten(1), Materials.Chrome.getMolten(1), Materials.Glowstone.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Redstone.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Mercury.getFluid(1),

                Materials.Oxygen.getGas(1),

                // Ilmenite Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Titanium.getMolten(1),

                Materials.Water.getFluid(1),

                Materials.Oxygen.getGas(1),

                // Palladium Vein
                Materials.Chrome.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1), Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                // Bauxite Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Gallium.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1), Materials.Titanium.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Iron Vein
                Materials.Calcium.getMolten(1), Materials.Copper.getMolten(1), Materials.Iron.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Tetrahedrite Vein
                Materials.Antimony.getMolten(1), Materials.Cobalt.getMolten(1), Materials.Copper.getMolten(1),
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Zinc.getMolten(1),

                // Galena Vein
                Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                // Small Ore Stats
                // Saltpeter Ore
                Materials.Potassium.getMolten(1),

                Materials.Nitrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Iron Ore
                Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1), Materials.Tin.getMolten(1),

                // Titanium Ore
                Materials.Aluminium.getMolten(1), Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Titanium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Tin Ore
                Materials.Iron.getMolten(1), Materials.Tin.getMolten(1), Materials.Zinc.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                // Lead Ore
                Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                // Redstone Ore
                Materials.Glowstone.getMolten(1), Materials.Redstone.getMolten(1),

                Materials.Mercury.getFluid(1),

                // Draconium Ore
                Materials.Draconium.getMolten(1),

                // Chromite Ore
                Materials.Chrome.getMolten(1), Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Tungstate Ore
                Materials.Lithium.getMolten(1), Materials.Manganese.getMolten(1), Materials.Silver.getMolten(1),
                Materials.Tungsten.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Lapis Ore
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1),

                Materials.Chlorine.getGas(1), Materials.Oxygen.getGas(1),

                // Zinc Ore
                Materials.Gallium.getMolten(1), Materials.Tin.getMolten(1), Materials.Zinc.getMolten(1) });

        // T3 - Ross128b - Rb
        VoidFluidRecipes_T3.put(
            "Rb",
            new FluidStack[] {
                // Bismutite & Bismuthinite Vein
                Materials.Antimony.getMolten(1), Materials.Bismuth.getMolten(1),

                Materials.CarbonDioxide.getGas(1), Materials.Oxygen.getGas(1),

                // Olenite & Fluor-Buergerite & Chromo-Alumino-Povondraite & Vanadio-Oxy-Dravit Vein
                Materials.Aluminium.getMolten(1), Materials.Boron.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnalium.getMolten(1), Materials.Magnesium.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Vanadium.getMolten(1),

                Materials.Sodium.getFluid(1),

                Materials.Fluorine.getGas(1), Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Arsenopyrite & Ferberite & Loellingite & Roquesite Vein
                Materials.Arsenic.getMolten(1), Materials.Copper.getMolten(1), Materials.Indium.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Tungsten.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Ferberite & Huebnerite & Loellingite Vein
                Materials.Arsenic.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Manganese.getMolten(1), Materials.Molybdenum.getMolten(1), Materials.Tungsten.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Djurleite & Bornite & Wittichenite Vein
                Materials.Antimony.getMolten(1), Materials.Bismuth.getMolten(1), Materials.Copper.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Zinc.getMolten(1),

                // Thorianite Vein
                Materials.Aluminium.getMolten(1), Materials.Caesium.getMolten(1), Materials.Lithium.getMolten(1),
                Materials.Potassium.getMolten(1), Materials.Thorium.getMolten(1), Materials.Uranium.getMolten(1),
                Materials.Uranium235.getMolten(1), FluidRegistry.getFluidStack("molten.thorium232", 1),

                Materials.Fluorine.getGas(1), Materials.Oxygen.getGas(1), Materials.Radon.getGas(1),

                // Fayalite & Green Fuchsite & Red Zircon & Red Fuchsite Vein
                Materials.Aluminium.getMolten(1), Materials.Chrome.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Potassium.getMolten(1), Materials.Silicon.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Forsterite & Fayalite & Orange Descloizite & Red Descloizite Vein
                Materials.Copper.getMolten(1), Materials.Iron.getMolten(1), Materials.Lead.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Silicon.getMolten(1), Materials.Vanadium.getMolten(1),
                Materials.Zinc.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Void Fluid
                Materials.Lava.getFluid(1), Materials.OilExtraHeavy.getFluid(1),
                FluidRegistry.getFluidStack("ic2distilledwater", 1),

                Materials.NatruralGas.getGas(1) });
    }
}
