package Recipes.SingularityRecipes_VoidFluid;

import java.util.HashMap;
import java.util.Map;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import bartworks.system.material.WerkstoffLoader;
import gregtech.api.enums.Materials;

public class SingularityFluidRecipes_T5 {

    public static final Map<String, FluidStack[]> VoidFluidRecipes_T5 = new HashMap<>();

    public static void addVoidFluidRecipes_T5() {
        // T5 - Enceladus - En
        VoidFluidRecipes_T5.put(
            "En",
            new FluidStack[] {
                // Uranium 238 Vein
                Materials.Lead.getMolten(1), Materials.Thorium.getMolten(1), Materials.Uranium.getMolten(1),
                Materials.Uranium235.getMolten(1),

                Materials.Oxygen.getGas(1), Materials.Radon.getGas(1),

                // Tungstate Vein
                Materials.Calcium.getMolten(1), Materials.Lithium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Molybdenum.getMolten(1), Materials.Silver.getMolten(1), Materials.Tungsten.getMolten(1),

                // Lapis Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1),

                Materials.Chlorine.getGas(1), Materials.Oxygen.getGas(1),

                // Osmium Vein
                Materials.Cobalt.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1), Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                // Monazite Vein
                Materials.Cerium.getMolten(1), Materials.Gadolinium.getMolten(1), Materials.Holmium.getMolten(1),
                Materials.Lanthanum.getMolten(1), Materials.Neodymium.getMolten(1), Materials.Samarium.getMolten(1),
                Materials.Thorium.getMolten(1), FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Fluorine.getGas(1), Materials.Oxygen.getGas(1),

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

                // Ledox Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Ledox.getMolten(1),
                Materials.Orichalcum.getMolten(1), Materials.Rubracium.getMolten(1), Materials.Samarium.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Iridium Vein
                Materials.Cobalt.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Mithril.getMolten(1), Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1), Materials.Platinum.getMolten(1), Materials.Thaumium.getMolten(1),
                WerkstoffLoader.Rhodium.getMolten(1), WerkstoffLoader.Ruthenium.getMolten(1),

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

                // Ledox Ore
                Materials.Ledox.getMolten(1),

                // Neutronium Ore
                Materials.Neutronium.getMolten(1),

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
                Materials.Gallium.getMolten(1), Materials.Tin.getMolten(1), Materials.Zinc.getMolten(1),

                // Naquadah Ore
                Materials.Adamantium.getMolten(1), Materials.Gallium.getMolten(1), Materials.Naquadah.getMolten(1),
                Materials.NaquadahEnriched.getMolten(1), Materials.Titanium.getMolten(1),
                Materials.Trinium.getMolten(1) });

        // T5 - Miranda - Mi
        VoidFluidRecipes_T5.put(
            "Mi",
            new FluidStack[] {
                // Diamond Vein
                Materials.Thorium.getMolten(1),

                // Osmium Vein
                Materials.Cobalt.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1), Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                // Desh Vein
                Materials.Calcium.getMolten(1), Materials.Desh.getMolten(1), Materials.Lithium.getMolten(1),
                Materials.Manganese.getMolten(1), Materials.Molybdenum.getMolten(1), Materials.Silver.getMolten(1),
                Materials.Tungsten.getMolten(1),

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

                // Pyrolusite Vein
                Materials.Calcium.getMolten(1), Materials.Manganese.getMolten(1), Materials.Niobium.getMolten(1),
                Materials.Tantalum.getMolten(1),

                Materials.Chlorine.getGas(1), Materials.Oxygen.getGas(1),

                // Ilmenite Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Titanium.getMolten(1),

                Materials.Water.getFluid(1),

                Materials.Oxygen.getGas(1),

                // Tetrahedrite Vein
                Materials.Antimony.getMolten(1), Materials.Cobalt.getMolten(1), Materials.Copper.getMolten(1),
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Zinc.getMolten(1),

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
                // Iron Ore
                Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1), Materials.Tin.getMolten(1),

                // Mytryl Ore
                Materials.Mytryl.getMolten(1), Materials.Samarium.getMolten(1), Materials.Zinc.getMolten(1),

                // Titanium Ore
                Materials.Aluminium.getMolten(1), Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Titanium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Gold Ore
                Materials.Copper.getMolten(1), Materials.Gold.getMolten(1), Materials.Nickel.getMolten(1),

                // Tungstate Ore
                Materials.Lithium.getMolten(1), Materials.Manganese.getMolten(1), Materials.Silver.getMolten(1),
                Materials.Tungsten.getMolten(1), Materials.Oxygen.getGas(1),

                // Desh Ore
                Materials.Desh.getMolten(1),

                // Void Fluid
                Materials.HydricSulfide.getGas(1) });

        // T5 - Oberon - Ob
        VoidFluidRecipes_T5.put(
            "Ob",
            new FluidStack[] {
                // Tungstate Vein
                Materials.Calcium.getMolten(1), Materials.Lithium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Molybdenum.getMolten(1), Materials.Silver.getMolten(1), Materials.Tungsten.getMolten(1),

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

                // Manganese Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Niobium.getMolten(1), Materials.Silicon.getMolten(1), Materials.Tantalum.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Pitchblende Vein
                Materials.Lead.getMolten(1), Materials.Thorium.getMolten(1), Materials.Uranium.getMolten(1),
                Materials.Uranium235.getMolten(1),

                Materials.Oxygen.getGas(1), Materials.Radon.getGas(1),

                // Palladium Vein
                Materials.Chrome.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1), Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                // Iron Vein
                Materials.Calcium.getMolten(1), Materials.Copper.getMolten(1), Materials.Iron.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Galena Vein
                Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                // Naquadah Vein
                Materials.Adamantium.getMolten(1), Materials.Barium.getMolten(1), Materials.Gallium.getMolten(1),
                Materials.Indium.getMolten(1), Materials.Naquadah.getMolten(1), Materials.NaquadahEnriched.getMolten(1),
                Materials.Naquadria.getMolten(1), Materials.Titanium.getMolten(1),

                // Small Ore Stats
                // Silver Ore
                Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                // Titanium Ore
                Materials.Aluminium.getMolten(1), Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Titanium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Lead Ore
                Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                // Ledox Ore
                Materials.Ledox.getMolten(1),

                // Neutronium Ore
                Materials.Neutronium.getMolten(1),

                // Diamond Ore

                // Draconium Ore
                Materials.Draconium.getMolten(1),

                // Chromite Ore
                Materials.Chrome.getMolten(1), Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Tungstate Ore
                Materials.Lithium.getMolten(1), Materials.Manganese.getMolten(1), Materials.Silver.getMolten(1),
                Materials.Tungsten.getMolten(1), Materials.Oxygen.getGas(1),

                // Lapis Ore
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Sodium.getFluid(1), Materials.Chlorine.getGas(1),
                Materials.Oxygen.getGas(1),

                // Void Fluid
                Materials.CarbonMonoxide.getGas(1) });

        // T5 - Titan - Ti
        VoidFluidRecipes_T5.put(
            "Ti",
            new FluidStack[] {
                // Diamond Vein
                Materials.Thorium.getMolten(1),

                // Molybdenum Vein
                Materials.Calcium.getMolten(1), Materials.Lead.getMolten(1), Materials.Molybdenum.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Osmium Vein
                Materials.Cobalt.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1), Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

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

                // Ilmenite Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Titanium.getMolten(1),

                Materials.Water.getFluid(1),

                Materials.Oxygen.getGas(1),

                // Arsenic Vein
                Materials.Antimony.getMolten(1), Materials.Arsenic.getMolten(1), Materials.Bismuth.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Zinc.getMolten(1),

                // Bauxite Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Gallium.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1), Materials.Titanium.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Beryllium Vein
                Materials.Aluminium.getMolten(1), Materials.Beryllium.getMolten(1), Materials.Lead.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Thorium.getMolten(1), Materials.Uranium.getMolten(1),

                Materials.Oxygen.getGas(1), Materials.Radon.getGas(1),

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

                // Iridium Vein
                Materials.Cobalt.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Mithril.getMolten(1), Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1), Materials.Platinum.getMolten(1), Materials.Thaumium.getMolten(1),
                WerkstoffLoader.Rhodium.getMolten(1), WerkstoffLoader.Ruthenium.getMolten(1),

                // Small Ore Stats
                // Iron Ore
                Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1), Materials.Tin.getMolten(1),

                // Silver Ore
                Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                // Titanium Ore
                Materials.Aluminium.getMolten(1), Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Titanium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Oriharukon Ore
                Materials.Oriharukon.getMolten(1),

                // Tin Ore
                Materials.Iron.getMolten(1), Materials.Tin.getMolten(1), Materials.Zinc.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                // Redstone Ore
                Materials.Glowstone.getMolten(1), Materials.Redstone.getMolten(1), Materials.Mercury.getFluid(1),

                // Neutronium Ore
                Materials.Neutronium.getMolten(1),

                // Diamond Ore

                // Chromite Ore
                Materials.Chrome.getMolten(1), Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Tungstate Ore
                Materials.Lithium.getMolten(1), Materials.Manganese.getMolten(1), Materials.Silver.getMolten(1),
                Materials.Tungsten.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Zinc Ore
                Materials.Gallium.getMolten(1), Materials.Tin.getMolten(1), Materials.Zinc.getMolten(1),

                // Quantium Ore
                Materials.Quantium.getMolten(1),

                // Void Fluid
                Materials.Ethane.getGas(1), Materials.Methane.getGas(1) });

        // T5 - Ross128ba - Ra
        VoidFluidRecipes_T5.put(
            "Ra",
            new FluidStack[] {
                // Olenite & Fluor-Buergerite & Chromo-Alumino-Povondraite & Vanadio-Oxy-Dravit Vein Vein
                Materials.Aluminium.getMolten(1), Materials.Boron.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnalium.getMolten(1), Materials.Magnesium.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Vanadium.getMolten(1),

                // Ferberite & Huebnerite & Loellingite Vein
                Materials.Arsenic.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Manganese.getMolten(1), Materials.Molybdenum.getMolten(1), Materials.Tungsten.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Hedenbergite & Fayalite & Orange Descloizite & Red Descloizite Vein
                Materials.Calcium.getMolten(1), Materials.Copper.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Lead.getMolten(1), Materials.Silicon.getMolten(1), Materials.Vanadium.getMolten(1),
                Materials.Zinc.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Prasiolite & Hedenbergite Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // BArTiMaEuSNeK Vein
                Materials.Boron.getMolten(1), Materials.Europium.getMolten(1), Materials.Potassium.getMolten(1),
                Materials.Titanium.getMolten(1),

                Materials.Argon.getGas(1),

                WerkstoffLoader.Neon.getFluidOrGas(1),

                // Tiberium Vein
                Materials.Adamantium.getMolten(1), Materials.Barium.getMolten(1), Materials.Gallium.getMolten(1),
                Materials.Indium.getMolten(1), Materials.Naquadah.getMolten(1), Materials.NaquadahEnriched.getMolten(1),
                Materials.Naquadria.getMolten(1), Materials.Titanium.getMolten(1),

                // Fluorspar Vein
                Materials.Aluminium.getMolten(1), Materials.Barium.getMolten(1), Materials.Calcium.getMolten(1),
                Materials.Chrome.getMolten(1), Materials.Iron.getMolten(1), Materials.Lead.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Silver.getMolten(1), Materials.Zinc.getMolten(1),

                Materials.Oxygen.getGas(1), Materials.Fluorine.getGas(1),

                // Void Fluid
                Materials.SaltWater.getFluid(1),

                Materials.Helium_3.getGas(1) });
    }
}
