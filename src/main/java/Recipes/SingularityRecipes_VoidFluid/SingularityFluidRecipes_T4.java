package Recipes.SingularityRecipes_VoidFluid;

import java.util.HashMap;
import java.util.Map;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import bartworks.system.material.WerkstoffLoader;
import gregtech.api.enums.Materials;

public class SingularityFluidRecipes_T4 {

    public static final Map<String, FluidStack[]> VoidFluidRecipes_T4 = new HashMap<>();

    public static void addVoidFluidRecipes_T4() {
        // T4 - Io - Io
        VoidFluidRecipes_T4.put(
            "Io",
            new FluidStack[] {
                // Plutonium 239 Vein
                Materials.Lead.getMolten(1), Materials.Plutonium.getMolten(1), Materials.Thorium.getMolten(1),
                Materials.Uranium.getMolten(1), Materials.Uranium235.getMolten(1),

                Materials.Radon.getGas(1),

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

                // Pitchblende Vein
                Materials.Lead.getMolten(1), Materials.Thorium.getMolten(1), Materials.Uranium.getMolten(1),
                Materials.Uranium235.getMolten(1),

                Materials.Oxygen.getGas(1), Materials.Radon.getGas(1),

                // Quartz Vein
                Materials.Barium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Pyrolusite Vein
                Materials.Calcium.getMolten(1), Materials.Manganese.getMolten(1), Materials.Niobium.getMolten(1),
                Materials.Tantalum.getMolten(1),

                Materials.Chlorine.getGas(1), Materials.Oxygen.getGas(1),

                // Infused Gold Vein
                Materials.Copper.getMolten(1), Materials.Gold.getMolten(1), Materials.InfusedGold.getMolten(1),
                Materials.Iridium.getMolten(1), Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1), Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                // Monazite Vein
                Materials.Cerium.getMolten(1), Materials.Gadolinium.getMolten(1), Materials.Holmium.getMolten(1),
                Materials.Lanthanum.getMolten(1), Materials.Neodymium.getMolten(1), Materials.Samarium.getMolten(1),
                Materials.Thorium.getMolten(1), FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Fluorine.getGas(1), Materials.Oxygen.getGas(1),

                // Palladium Vein
                Materials.Chrome.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1), Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                // Mytryl Vein
                Materials.Ceruclase.getMolten(1), Materials.Mytryl.getMolten(1), Materials.Samarium.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Vulcanite.getMolten(1), Materials.Zinc.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Magnetite Vein
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Tin.getMolten(1), Materials.Vanadium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Iridium Vein
                Materials.Cobalt.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Mithril.getMolten(1), Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1), Materials.Platinum.getMolten(1), Materials.Thaumium.getMolten(1),
                WerkstoffLoader.Rhodium.getMolten(1), WerkstoffLoader.Ruthenium.getMolten(1),

                // Cassiterite Vein
                Materials.Iron.getMolten(1), Materials.Tin.getMolten(1), Materials.Zinc.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Oxygen.getGas(1),

                // Small Ore Stats
                // Saltpeter Ore
                Materials.Potassium.getMolten(1),

                Materials.Nitrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Iron Ore
                Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1), Materials.Tin.getMolten(1),

                // Silver Ore
                Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                // Titanium Ore
                Materials.Aluminium.getMolten(1), Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Titanium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Redstone Ore
                Materials.Glowstone.getMolten(1), Materials.Redstone.getMolten(1),

                Materials.Mercury.getFluid(1),

                // Chromite Ore
                Materials.Chrome.getMolten(1), Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Tungstate Ore
                Materials.Lithium.getMolten(1), Materials.Manganese.getMolten(1), Materials.Silver.getMolten(1),
                Materials.Tungsten.getMolten(1), Materials.Oxygen.getGas(1),

                // Meteoric Iron Ore
                Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.MeteoricIron.getMolten(1), Materials.Osmium.getMolten(1), Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                // Firestone Ore

                // Lapis Ore
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1),

                Materials.Chlorine.getGas(1), Materials.Oxygen.getGas(1),

                // Tungsten Ore
                Materials.Manganese.getMolten(1), Materials.Molybdenum.getMolten(1), Materials.Tungsten.getMolten(1),

                // Bismuth Ore
                Materials.Bismuth.getMolten(1),

                // Zinc Ore
                Materials.Gallium.getMolten(1), Materials.Tin.getMolten(1), Materials.Zinc.getMolten(1),

                // Quantium Ore
                Materials.Quantium.getMolten(1),

                // Naquadah Ore
                Materials.Adamantium.getMolten(1), Materials.Gallium.getMolten(1), Materials.Naquadah.getMolten(1),
                Materials.NaquadahEnriched.getMolten(1), Materials.Titanium.getMolten(1),
                Materials.Trinium.getMolten(1),

                // Void Fluid
                Materials.Lead.getMolten(1),

                Materials.SulfuricAcid.getFluid(1),

                Materials.CarbonDioxide.getGas(1) });

        // T4 - Mercury - Me
        VoidFluidRecipes_T4.put(
            "Me",
            new FluidStack[] {
                // Diamond Vein
                Materials.Thorium.getMolten(1),

                // Molybdenum Vein
                Materials.Calcium.getMolten(1), Materials.Lead.getMolten(1), Materials.Molybdenum.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Draconium Vein
                Materials.Aluminium.getMolten(1), Materials.Draconium.getMolten(1), Materials.Electrotine.getMolten(1),
                Materials.Electrum.getMolten(1), Materials.Iron.getMolten(1), Materials.Redstone.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Thaumium.getMolten(1), Materials.Vinteum.getMolten(1),

                Materials.Sodium.getFluid(1),

                Materials.Oxygen.getGas(1),

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

                // Arsenic Vein
                Materials.Antimony.getMolten(1), Materials.Arsenic.getMolten(1), Materials.Bismuth.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Zinc.getMolten(1),

                // Bauxite Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Gallium.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1), Materials.Titanium.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Iron Vein
                Materials.Calcium.getMolten(1), Materials.Copper.getMolten(1), Materials.Iron.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Naquadah Vein
                Materials.Adamantium.getMolten(1), Materials.Barium.getMolten(1), Materials.Gallium.getMolten(1),
                Materials.Indium.getMolten(1), Materials.Naquadah.getMolten(1), Materials.NaquadahEnriched.getMolten(1),
                Materials.Naquadria.getMolten(1), Materials.Titanium.getMolten(1), Materials.Trinium.getMolten(1),

                // Iridium Vein
                Materials.Cobalt.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Mithril.getMolten(1), Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1), Materials.Platinum.getMolten(1), Materials.Thaumium.getMolten(1),
                WerkstoffLoader.Rhodium.getMolten(1), WerkstoffLoader.Ruthenium.getMolten(1),

                // Small Ore Stats
                // Titanium Ore
                Materials.Aluminium.getMolten(1), Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Titanium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Deep Iron Ore
                Materials.DeepIron.getMolten(1), Materials.Iron.getMolten(1), Materials.Trinium.getMolten(1),

                // Oriharukon Ore
                Materials.Oriharukon.getMolten(1),

                // Lead Ore
                Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                // Redstone Ore
                Materials.Glowstone.getMolten(1), Materials.Redstone.getMolten(1),

                Materials.Mercury.getFluid(1),

                // Ledox Ore
                Materials.Ledox.getMolten(1),

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
                Materials.Iron.getMolten(1),

                Materials.Helium_3.getGas(1) });

        // T4 - Venus - Ve
        VoidFluidRecipes_T4.put(
            "Ve",
            new FluidStack[] {
                // Sulfur Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Gallium.getMolten(1), Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Zinc.getMolten(1),

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

                // Monazite Vein
                Materials.Cerium.getMolten(1), Materials.Gadolinium.getMolten(1), Materials.Holmium.getMolten(1),
                Materials.Lanthanum.getMolten(1), Materials.Neodymium.getMolten(1), Materials.Samarium.getMolten(1),
                Materials.Thorium.getMolten(1), FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Fluorine.getGas(1), Materials.Oxygen.getGas(1),

                // Nickel Vein
                Materials.Arsenic.getMolten(1), Materials.Cobalt.getMolten(1), Materials.Iridium.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1), Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Beryllium Vein
                Materials.Aluminium.getMolten(1), Materials.Beryllium.getMolten(1), Materials.Lead.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Thorium.getMolten(1), Materials.Uranium.getMolten(1),

                Materials.Oxygen.getGas(1), Materials.Radon.getGas(1),

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

                // Rutile Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Gallium.getMolten(1),
                Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1), Materials.MeteoricIron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1), Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1), Materials.Silicon.getMolten(1), Materials.Titanium.getMolten(1),

                WerkstoffLoader.Rhodium.getMolten(1), WerkstoffLoader.Ruthenium.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Quantium Vein
                Materials.Ardite.getMolten(1), Materials.Iron.getMolten(1), Materials.Quantium.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Titanium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Iridium Vein
                Materials.Cobalt.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Mithril.getMolten(1), Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1), Materials.Platinum.getMolten(1), Materials.Thaumium.getMolten(1),
                WerkstoffLoader.Rhodium.getMolten(1), WerkstoffLoader.Ruthenium.getMolten(1),

                // Cassiterite Vein
                Materials.Iron.getMolten(1), Materials.Tin.getMolten(1), Materials.Zinc.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Oxygen.getGas(1),

                // Small Ore Stats
                // Saltpeter Ore
                Materials.Potassium.getMolten(1),

                Materials.Nitrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Mytryl Ore
                Materials.Mytryl.getMolten(1), Materials.Samarium.getMolten(1), Materials.Zinc.getMolten(1),

                // Titanium Ore
                Materials.Aluminium.getMolten(1), Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Titanium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Lead Ore
                Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                // Gold Ore
                Materials.Copper.getMolten(1), Materials.Gold.getMolten(1), Materials.Nickel.getMolten(1),

                // Diamond Ore

                // Draconium Ore
                Materials.Draconium.getMolten(1),

                // Chromite Ore
                Materials.Chrome.getMolten(1), Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Tungstate Ore
                Materials.Lithium.getMolten(1), Materials.Manganese.getMolten(1), Materials.Silver.getMolten(1),
                Materials.Tungsten.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Meteoric Iron Ore
                Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.MeteoricIron.getMolten(1), Materials.Osmium.getMolten(1), Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                // Firestone Ore

                // Tungsten Ore
                Materials.Manganese.getMolten(1), Materials.Molybdenum.getMolten(1), Materials.Tungsten.getMolten(1),

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
                Materials.Lead.getMolten(1),

                Materials.SulfuricAcid.getFluid(1),

                Materials.CarbonDioxide.getGas(1) });
    }
}
