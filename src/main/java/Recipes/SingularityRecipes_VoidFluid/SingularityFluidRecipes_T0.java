package Recipes.SingularityRecipes_VoidFluid;

import java.util.HashMap;
import java.util.Map;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import bartworks.system.material.WerkstoffLoader;
import gregtech.api.enums.Materials;

public class SingularityFluidRecipes_T0 {

    public static final Map<String, FluidStack[]> VoidFluidRecipes_T0 = new HashMap<>();

    public static void addVoidFluidRecipes_T0() {
        // T0 - Overworld - Ow
        VoidFluidRecipes_T0.put(
            "Ow",
            new FluidStack[] {
                // Diamond Vein
                Materials.Thorium.getMolten(1),

                // Lapis Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1),

                Materials.Chlorine.getGas(1), Materials.Oxygen.getGas(1),

                // Vermiculite Vein
                Materials.Aluminium.getMolten(1), Materials.Cobalt.getMolten(1), Materials.Copper.getMolten(1),
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1),
                Materials.Potassium.getMolten(1), Materials.Silicon.getMolten(1), Materials.Tin.getMolten(1),

                Materials.Water.getFluid(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Oilsands Vein
                Materials.OilHeavy.getFluid(1),

                // Coal Vein
                Materials.Water.getFluid(1),

                // Manganese Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Niobium.getMolten(1), Materials.Silicon.getMolten(1), Materials.Tantalum.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Redstone Vein
                Materials.Aluminium.getMolten(1), Materials.Chrome.getMolten(1), Materials.Glowstone.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Redstone.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Mercury.getFluid(1),

                Materials.Oxygen.getGas(1),

                // Mica Vein
                Materials.Aluminium.getMolten(1), Materials.Caesium.getMolten(1), Materials.Potassium.getMolten(1),
                Materials.Rubidium.getMolten(1), Materials.Silicon.getMolten(1), Materials.Tin.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Water.getFluid(1),

                Materials.Fluorine.getGas(1), Materials.Oxygen.getGas(1),

                // Dolomite Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1), Materials.Water.getFluid(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

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

                // Gold Vein
                Materials.Copper.getMolten(1), Materials.Gold.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Vanadium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Kaolinite Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Potassium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1), Materials.Water.getFluid(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Iron Vein
                Materials.Calcium.getMolten(1), Materials.Copper.getMolten(1), Materials.Iron.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Lignite Coal Vein
                Materials.Water.getFluid(1),

                // Apatite Vein
                Materials.Calcium.getMolten(1), Materials.Niobium.getMolten(1),

                Materials.Chlorine.getGas(1), Materials.Oxygen.getGas(1),

                // Basaltic Mineral Sand Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Gold.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Potassium.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Water.getFluid(1),

                Materials.Fluorine.getGas(1), Materials.Oxygen.getGas(1),

                // Magnetite Vein
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Tin.getMolten(1), Materials.Vanadium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Tin Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Tin.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Salt Vein
                Materials.Aluminium.getMolten(1), Materials.Boron.getMolten(1), Materials.Caesium.getMolten(1),
                Materials.Lithium.getMolten(1), Materials.Potassium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1), Materials.Water.getFluid(1),

                Materials.Chlorine.getGas(1), Materials.Fluorine.getGas(1),

                // Cassiterite Vein
                Materials.Iron.getMolten(1), Materials.Tin.getMolten(1), Materials.Zinc.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Oxygen.getGas(1),

                // Small Ore Stats
                // Iron Ore
                Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1), Materials.Tin.getMolten(1),

                // Copper Ore
                Materials.Cobalt.getMolten(1), Materials.Copper.getMolten(1), Materials.Gold.getMolten(1),
                Materials.Nickel.getMolten(1),

                // Silver Ore
                Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                // Tin Ore
                Materials.Iron.getMolten(1), Materials.Tin.getMolten(1), Materials.Zinc.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                // Redstone Ore
                Materials.Glowstone.getMolten(1), Materials.Redstone.getMolten(1),

                Materials.Mercury.getFluid(1),

                // Gold Ore
                Materials.Copper.getMolten(1), Materials.Gold.getMolten(1), Materials.Nickel.getMolten(1),

                // Diamond Ore

                // Lapis Ore
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1),

                Materials.Chlorine.getGas(1), Materials.Oxygen.getGas(1),

                // Coal Ore
                Materials.Water.getFluid(1),

                // Zinc Ore
                Materials.Gallium.getMolten(1), Materials.Tin.getMolten(1), Materials.Zinc.getMolten(1),

                // Nickel Ore
                Materials.Cobalt.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1), Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                // Void Fluid
                Materials.Oil.getFluid(1), Materials.OilHeavy.getFluid(1), Materials.OilLight.getFluid(1),
                Materials.OilMedium.getFluid(1),

                Materials.NatruralGas.getGas(1) });

        // T0 - Nether - Ne
        VoidFluidRecipes_T0.put(
            "Ne",
            new FluidStack[] {
                // Sulfur Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Gallium.getMolten(1), Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Zinc.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Molybdenum Vein
                Materials.Calcium.getMolten(1), Materials.Lead.getMolten(1), Materials.Molybdenum.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Manganese Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Niobium.getMolten(1), Materials.Silicon.getMolten(1), Materials.Tantalum.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Quartzite Vein
                Materials.Barium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Redstone Vein
                Materials.Aluminium.getMolten(1), Materials.Chrome.getMolten(1), Materials.Glowstone.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Redstone.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Mercury.getFluid(1),

                Materials.Oxygen.getGas(1),

                // Copper Vein
                Materials.Calcium.getMolten(1), Materials.Cobalt.getMolten(1), Materials.Copper.getMolten(1),
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Tin.getMolten(1),

                Materials.Oxygen.getGas(1),

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

                // Tetrahedrite Vein
                Materials.Antimony.getMolten(1), Materials.Cobalt.getMolten(1), Materials.Copper.getMolten(1),
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Zinc.getMolten(1),

                // Nether Quartz Vein
                Materials.Barium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Small Ore Stats
                // Saltpeter Ore
                Materials.Potassium.getMolten(1),

                Materials.Nitrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Iron Ore
                Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1), Materials.Tin.getMolten(1),

                // Copper Ore
                Materials.Cobalt.getMolten(1), Materials.Copper.getMolten(1), Materials.Gold.getMolten(1),
                Materials.Nickel.getMolten(1),

                // Silver Ore
                Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                // Tin Ore
                Materials.Iron.getMolten(1), Materials.Tin.getMolten(1), Materials.Zinc.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                // Lead Ore
                Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                // Redstone Ore
                Materials.Glowstone.getMolten(1), Materials.Redstone.getMolten(1),

                Materials.Mercury.getFluid(1),

                // Certus Quartz Ore
                Materials.Barium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Sulfur Ore

                // Nether Quartz Ore
                Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Bismuth Ore
                Materials.Bismuth.getMolten(1),

                // Zinc Ore
                Materials.Gallium.getMolten(1), Materials.Tin.getMolten(1), Materials.Zinc.getMolten(1),

                // Realgar Ore
                Materials.Arsenic.getMolten(1), Materials.Realgar.getMolten(1),

                // Void Fluid
                Materials.Lava.getFluid(1) });

        // T0 - Twilight - TF
        VoidFluidRecipes_T0.put(
            "TF",
            new FluidStack[] {
                // Diamond Vein
                Materials.Thorium.getMolten(1),

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

                // Terra & Aer Vein
                Materials.Glowstone.getMolten(1), Materials.Redstone.getMolten(1),

                Materials.Mercury.getFluid(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Coal Vein
                Materials.Water.getFluid(1),

                // Sapphire Vein
                Materials.Aluminium.getMolten(1), Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1),
                Materials.Manganese.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Cryolite Vein
                Materials.Aluminium.getMolten(1), Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                Materials.Sodium.getFluid(1),

                Materials.Fluorine.getGas(1),

                // Nickel Vein
                Materials.Arsenic.getMolten(1), Materials.Cobalt.getMolten(1), Materials.Iridium.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1), Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Soapstone Vein
                Materials.Aluminium.getMolten(1), Materials.Copper.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Nickel.getMolten(1), Materials.Potassium.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Perditio & Ordo Vein
                Materials.Glowstone.getMolten(1), Materials.Redstone.getMolten(1),

                Materials.Mercury.getFluid(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Gold Vein
                Materials.Copper.getMolten(1), Materials.Gold.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Vanadium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Iron Vein
                Materials.Calcium.getMolten(1), Materials.Copper.getMolten(1), Materials.Iron.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Apatite Vein
                Materials.Calcium.getMolten(1), Materials.Niobium.getMolten(1),

                Materials.Chlorine.getGas(1), Materials.Oxygen.getGas(1),

                // Magnetite Vein
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Tin.getMolten(1), Materials.Vanadium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Salt Vein
                Materials.Aluminium.getMolten(1), Materials.Boron.getMolten(1), Materials.Caesium.getMolten(1),
                Materials.Lithium.getMolten(1), Materials.Potassium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1), Materials.Water.getFluid(1),

                Materials.Chlorine.getGas(1), Materials.Fluorine.getGas(1),

                // Cassiterite Vein
                Materials.Iron.getMolten(1), Materials.Tin.getMolten(1), Materials.Zinc.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Oxygen.getGas(1),

                // Aqua & Ignis Vein
                Materials.Glowstone.getMolten(1), Materials.Redstone.getMolten(1),

                Materials.Mercury.getFluid(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Small Ore Stats
                // Amethyst Ore
                Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Yellow Garnet Ore
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Tanzanite Ore
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Saltpeter Ore
                Materials.Potassium.getMolten(1),

                Materials.Nitrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Spinel Ore
                Materials.Aluminium.getMolten(1), Materials.Magnesium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Opal Ore
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Ruby Ore
                Materials.Aluminium.getMolten(1), Materials.Chrome.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Lead Ore
                Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                // Emerald Ore
                Materials.Aluminium.getMolten(1), Materials.Beryllium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Amber Ore
                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Blue Topaz Ore
                Materials.Aluminium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Fluorine.getGas(1), Materials.Oxygen.getGas(1),

                // Topaz Ore
                Materials.Aluminium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Fluorine.getGas(1), Materials.Oxygen.getGas(1),

                // Jade Ore
                Materials.Aluminium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1),

                Materials.Oxygen.getGas(1),

                // Red Garnet Ore
                Materials.Aluminium.getMolten(1), Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1),
                Materials.Manganese.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Green Sapphire Ore
                Materials.Aluminium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Sapphire Ore
                Materials.Aluminium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Jasper Ore
                Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Olivine Ore
                Materials.Aluminium.getMolten(1), Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1) });

        // T0 - TheEnd - ED
        VoidFluidRecipes_T0.put(
            "ED",
            new FluidStack[] {
                // Molybdenum Vein
                Materials.Calcium.getMolten(1), Materials.Lead.getMolten(1), Materials.Molybdenum.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Nickel Vein
                Materials.Arsenic.getMolten(1), Materials.Cobalt.getMolten(1), Materials.Iridium.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1), Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Copper Vein
                Materials.Calcium.getMolten(1), Materials.Cobalt.getMolten(1), Materials.Copper.getMolten(1),
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Tin.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Gold Vein
                Materials.Copper.getMolten(1), Materials.Gold.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Vanadium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Beryllium Vein
                Materials.Aluminium.getMolten(1), Materials.Beryllium.getMolten(1), Materials.Lead.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Thorium.getMolten(1), Materials.Uranium.getMolten(1),

                Materials.Oxygen.getGas(1), Materials.Radon.getGas(1),

                // Tetrahedrite Vein
                Materials.Antimony.getMolten(1), Materials.Cobalt.getMolten(1), Materials.Copper.getMolten(1),
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Zinc.getMolten(1),

                // Cassiterite Vein
                Materials.Iron.getMolten(1), Materials.Tin.getMolten(1), Materials.Zinc.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Oxygen.getGas(1),

                // Small Ore Stats
                // Iron Ore
                Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1), Materials.Tin.getMolten(1),

                // Copper Ore
                Materials.Cobalt.getMolten(1), Materials.Copper.getMolten(1), Materials.Gold.getMolten(1),
                Materials.Nickel.getMolten(1),

                // Silver Ore
                Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                // Tin Ore
                Materials.Iron.getMolten(1), Materials.Tin.getMolten(1), Materials.Zinc.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                // Lead Ore
                Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                // Gold Ore
                Materials.Copper.getMolten(1), Materials.Gold.getMolten(1), Materials.Nickel.getMolten(1),

                // Zinc Ore
                Materials.Gallium.getMolten(1), Materials.Tin.getMolten(1), Materials.Zinc.getMolten(1),

                // Nickel Ore
                Materials.Cobalt.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1), Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1) });

        // T0 - EndAsteroid - EA
        VoidFluidRecipes_T0.put(
            "EA",
            new FluidStack[] {
                // Tungstate Vein
                Materials.Calcium.getMolten(1), Materials.Lithium.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Molybdenum.getMolten(1), Materials.Silver.getMolten(1), Materials.Tungsten.getMolten(1),

                Materials.Oxygen.getGas(1),

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

                // Nickel Vein
                Materials.Arsenic.getMolten(1), Materials.Cobalt.getMolten(1), Materials.Iridium.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1), Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Copper Vein
                Materials.Calcium.getMolten(1), Materials.Cobalt.getMolten(1), Materials.Copper.getMolten(1),
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Tin.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Gold Vein
                Materials.Copper.getMolten(1), Materials.Gold.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Vanadium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Beryllium Vein
                Materials.Aluminium.getMolten(1), Materials.Beryllium.getMolten(1), Materials.Lead.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Thorium.getMolten(1), Materials.Uranium.getMolten(1),

                Materials.Oxygen.getGas(1), Materials.Radon.getGas(1),

                // Platinum Vein
                Materials.Iridium.getMolten(1), Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1), Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                // Tetrahedrite Vein
                Materials.Antimony.getMolten(1), Materials.Cobalt.getMolten(1), Materials.Copper.getMolten(1),
                Materials.Gold.getMolten(1), Materials.Iron.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Zinc.getMolten(1),

                // Naquadah Vein
                Materials.Adamantium.getMolten(1), Materials.Barium.getMolten(1), Materials.Gallium.getMolten(1),
                Materials.Indium.getMolten(1), Materials.Naquadah.getMolten(1), Materials.NaquadahEnriched.getMolten(1),
                Materials.Naquadria.getMolten(1), Materials.Titanium.getMolten(1), Materials.Trinium.getMolten(1),

                // Cassiterite Vein
                Materials.Iron.getMolten(1), Materials.Tin.getMolten(1), Materials.Zinc.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Oxygen.getGas(1),
                // Small Ore Stats
                // Silver Ore
                Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                // Tin Ore
                Materials.Iron.getMolten(1), Materials.Tin.getMolten(1), Materials.Zinc.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                // Lead Ore
                Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                // Gold Ore
                Materials.Copper.getMolten(1), Materials.Gold.getMolten(1), Materials.Nickel.getMolten(1),

                // Zinc Ore
                Materials.Gallium.getMolten(1), Materials.Tin.getMolten(1), Materials.Zinc.getMolten(1),

                // Nickel Ore
                Materials.Cobalt.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1), Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1) });
    }
}
