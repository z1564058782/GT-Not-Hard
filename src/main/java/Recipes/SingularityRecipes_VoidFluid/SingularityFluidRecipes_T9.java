package Recipes.SingularityRecipes_VoidFluid;

import java.util.HashMap;
import java.util.Map;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import bartworks.system.material.WerkstoffLoader;
import gregtech.api.enums.Materials;

public class SingularityFluidRecipes_T9 {

    public static final Map<String, FluidStack[]> VoidFluidRecipes_T9 = new HashMap<>();

    public static void addVoidFluidRecipes_T9() {
        // T9 - Anubis - An
        VoidFluidRecipes_T9.put(
            "An",
            new FluidStack[] {
                // Sulfur Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Gallium.getMolten(1), Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Zinc.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Infinity Catalyst Vein
                Materials.Adamantium.getMolten(1), Materials.Bedrockium.getMolten(1),
                Materials.InfinityCatalyst.getMolten(1), Materials.Neutronium.getMolten(1),

                // Olivine Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Potassium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1), Materials.Water.getFluid(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Desh Vein
                Materials.Calcium.getMolten(1), Materials.Desh.getMolten(1), Materials.Lithium.getMolten(1),
                Materials.Manganese.getMolten(1), Materials.Molybdenum.getMolten(1), Materials.Silver.getMolten(1),
                Materials.Tungsten.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Mica Vein
                Materials.Aluminium.getMolten(1), Materials.Caesium.getMolten(1), Materials.Potassium.getMolten(1),
                Materials.Rubidium.getMolten(1), Materials.Silicon.getMolten(1), Materials.Tin.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Water.getFluid(1),

                Materials.Fluorine.getGas(1), Materials.Oxygen.getGas(1),

                // Cryolite Vein
                Materials.Aluminium.getMolten(1), Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                Materials.Sodium.getFluid(1),

                Materials.Fluorine.getGas(1),

                // Dolomite Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1), Materials.Water.getFluid(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Callisto Ice Vein
                Materials.Alduorite.getMolten(1), Materials.Aluminium.getMolten(1), Materials.CallistoIce.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Water.getFluid(1),

                Materials.Fluorine.getGas(1), Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Soapstone Vein
                Materials.Aluminium.getMolten(1), Materials.Copper.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Nickel.getMolten(1), Materials.Potassium.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Mytryl Vein
                Materials.Ceruclase.getMolten(1), Materials.Mytryl.getMolten(1), Materials.Samarium.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Vulcanite.getMolten(1), Materials.Zinc.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Rutile Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Gallium.getMolten(1),
                Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1), Materials.MeteoricIron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1), Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1), Materials.Silicon.getMolten(1), Materials.Titanium.getMolten(1),
                WerkstoffLoader.Rhodium.getMolten(1), WerkstoffLoader.Ruthenium.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Basaltic Mineral Sand Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Gold.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Potassium.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Water.getFluid(1),

                Materials.Fluorine.getGas(1), Materials.Oxygen.getGas(1),

                // Small Ore Stats
                // Infinity Catalyst Ore
                Materials.InfinityCatalyst.getMolten(1) });

        // T9 - Horus - Ho
        VoidFluidRecipes_T9.put(
            "Ho",
            new FluidStack[] {
                // Magnesite Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Certus Quartz Vein
                Materials.Barium.getMolten(1), Materials.Silicon.getMolten(1), Materials.Tin.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Quartz Vein
                Materials.Barium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Draconium Vein
                Materials.Aluminium.getMolten(1), Materials.Draconium.getMolten(1), Materials.Electrotine.getMolten(1),
                Materials.Electrum.getMolten(1), Materials.Iron.getMolten(1), Materials.Redstone.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Thaumium.getMolten(1), Materials.Vinteum.getMolten(1),

                Materials.Sodium.getFluid(1),

                Materials.Oxygen.getGas(1),

                // Sapphire Vein
                Materials.Aluminium.getMolten(1), Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1),
                Materials.Manganese.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Black Plutonium Vein
                Materials.Aluminium.getMolten(1), Materials.BlackPlutonium.getMolten(1), Materials.Boron.getMolten(1),
                Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1), Materials.Water.getFluid(1),

                Materials.Oxygen.getGas(1),

                // Cosmic Neutronium Vein
                Materials.Bedrockium.getMolten(1), Materials.BlackPlutonium.getMolten(1),
                Materials.CosmicNeutronium.getMolten(1), Materials.Neutronium.getMolten(1),

                // Mytryl Vein
                Materials.Ceruclase.getMolten(1), Materials.Mytryl.getMolten(1), Materials.Samarium.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Vulcanite.getMolten(1), Materials.Zinc.getMolten(1),

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

                // Oriharukon Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Oriharukon.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Vyroxeres.getMolten(1),

                Materials.Sodium.getFluid(1), Materials.Water.getFluid(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Quantium Vein
                Materials.Ardite.getMolten(1), Materials.Iron.getMolten(1), Materials.Quantium.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Titanium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Ledox Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Ledox.getMolten(1),
                Materials.Orichalcum.getMolten(1), Materials.Rubracium.getMolten(1), Materials.Samarium.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Small Ore Stats
                // Amethyst Ore
                Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Red Garnet Ore
                Materials.Aluminium.getMolten(1), Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1),
                Materials.Manganese.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Yellow Garnet Ore
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Chrome.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Tanzanite Ore
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Spinel Ore
                Materials.Aluminium.getMolten(1), Materials.Magnesium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Opal Ore
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Charged Certus Quartz Ore
                Materials.Barium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Mytryl Ore
                Materials.Mytryl.getMolten(1), Materials.Samarium.getMolten(1), Materials.Zinc.getMolten(1),

                // Ruby Ore
                Materials.Aluminium.getMolten(1), Materials.Chrome.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Emerald Ore
                Materials.Aluminium.getMolten(1), Materials.Beryllium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Blue Topaz Ore
                Materials.Aluminium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Fluorine.getGas(1), Materials.Oxygen.getGas(1),

                // Topaz Ore
                Materials.Aluminium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Hydrogen.getGas(1), Materials.Fluorine.getGas(1), Materials.Oxygen.getGas(1),

                // Certus Quartz Ore
                Materials.Barium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Jade Ore
                Materials.Aluminium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1),

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

        // T9 - Maahes - Mh
        VoidFluidRecipes_T9.put(
            "Mh",
            new FluidStack[] {
                // Naquadria Vein
                Materials.Adamantium.getMolten(1), Materials.Barium.getMolten(1), Materials.Gallium.getMolten(1),
                Materials.Indium.getMolten(1), Materials.Naquadah.getMolten(1), Materials.NaquadahEnriched.getMolten(1),
                Materials.Naquadria.getMolten(1), Materials.Titanium.getMolten(1),

                // Cryolite Vein
                Materials.Aluminium.getMolten(1), Materials.Lead.getMolten(1), Materials.Silver.getMolten(1),

                Materials.Sodium.getFluid(1),

                Materials.Fluorine.getGas(1),

                // Callisto Ice Vein
                Materials.Alduorite.getMolten(1), Materials.Aluminium.getMolten(1), Materials.CallistoIce.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Water.getFluid(1),

                Materials.Fluorine.getGas(1), Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Vanadium Vein
                Materials.Chrome.getMolten(1), Materials.Copper.getMolten(1), Materials.Gold.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Nickel.getMolten(1),
                Materials.Vanadium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Soapstone Vein
                Materials.Aluminium.getMolten(1), Materials.Copper.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Nickel.getMolten(1), Materials.Potassium.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Neutronium Vein
                Materials.Adamantium.getMolten(1), Materials.Aluminium.getMolten(1), Materials.Gallium.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Naquadah.getMolten(1), Materials.NaquadahEnriched.getMolten(1),
                Materials.Neutronium.getMolten(1), Materials.Silicon.getMolten(1), Materials.Titanium.getMolten(1),
                Materials.Trinium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Platinum Vein
                Materials.Iridium.getMolten(1), Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1), Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                // Naquadah Vein
                Materials.Adamantium.getMolten(1), Materials.Barium.getMolten(1), Materials.Gallium.getMolten(1),
                Materials.Indium.getMolten(1), Materials.Naquadah.getMolten(1), Materials.NaquadahEnriched.getMolten(1),
                Materials.Naquadria.getMolten(1), Materials.Titanium.getMolten(1), Materials.Trinium.getMolten(1),

                // Basaltic Mineral Sand Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Gold.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1), Materials.Potassium.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Water.getFluid(1),

                Materials.Fluorine.getGas(1), Materials.Oxygen.getGas(1),

                // Quantium Vein
                Materials.Ardite.getMolten(1), Materials.Iron.getMolten(1), Materials.Quantium.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Titanium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Chrome Vein
                Materials.Chrome.getMolten(1), Materials.Iron.getMolten(1), Materials.Lithium.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Manganese.getMolten(1), Materials.Molybdenum.getMolten(1),
                Materials.Silver.getMolten(1), Materials.Tungsten.getMolten(1), Materials.Oxygen.getGas(1) });

        // T9 - MehenBelt - MB
        VoidFluidRecipes_T9.put(
            "MB",
            new FluidStack[] {
                // Uranium 238 Vein
                Materials.Lead.getMolten(1), Materials.Thorium.getMolten(1), Materials.Uranium.getMolten(1),
                Materials.Uranium235.getMolten(1),

                Materials.Oxygen.getGas(1), Materials.Radon.getGas(1),

                // Lapis Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1),

                Materials.Chlorine.getGas(1), Materials.Oxygen.getGas(1),

                // Awakened Draconium Vein
                Materials.Draconium.getMolten(1), Materials.DraconiumAwakened.getMolten(1),

                // Olivine Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Potassium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1), Materials.Water.getFluid(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Osmium Vein
                Materials.Cobalt.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1), Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

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

                // Palladium Vein
                Materials.Chrome.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1), Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                // Neutronium Vein
                Materials.Adamantium.getMolten(1), Materials.Aluminium.getMolten(1), Materials.Gallium.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Naquadah.getMolten(1), Materials.NaquadahEnriched.getMolten(1),
                Materials.Neutronium.getMolten(1), Materials.Silicon.getMolten(1), Materials.Titanium.getMolten(1),
                Materials.Trinium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Platinum Vein
                Materials.Iridium.getMolten(1), Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1),
                Materials.Palladium.getMolten(1), Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

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
                // Titanium Ore
                Materials.Aluminium.getMolten(1), Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Titanium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Tin Ore
                Materials.Iron.getMolten(1), Materials.Tin.getMolten(1), Materials.Zinc.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                // Neutronium Ore
                Materials.Neutronium.getMolten(1),

                // Chromite Ore
                Materials.Chrome.getMolten(1), Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Lapis Ore
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1),

                Materials.Chlorine.getGas(1), Materials.Oxygen.getGas(1),

                // Nickel Ore
                Materials.Cobalt.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1), Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                // Olivine Ore
                Materials.Aluminium.getMolten(1), Materials.Iron.getMolten(1), Materials.Magnesium.getMolten(1),
                Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1) });

        // T9 - Neper - Np
        VoidFluidRecipes_T9.put(
            "Np",
            new FluidStack[] {
                // Tungsten Vein
                Materials.DeepIron.getMolten(1), Materials.Iron.getMolten(1), Materials.Manganese.getMolten(1),
                Materials.Molybdenum.getMolten(1), Materials.ShadowIron.getMolten(1), Materials.Silicon.getMolten(1),
                Materials.Trinium.getMolten(1), Materials.Tungsten.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Terra & Aer Vein
                Materials.Glowstone.getMolten(1), Materials.Redstone.getMolten(1),

                Materials.Mercury.getFluid(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Certus Quartz Vein
                Materials.Barium.getMolten(1), Materials.Silicon.getMolten(1), Materials.Tin.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Quartzite Vein
                Materials.Barium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Dilithium Vein
                Materials.MysteriousCrystal.getMolten(1), Materials.Thaumium.getMolten(1),
                Materials.Vinteum.getMolten(1),

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

                // Arsenic Vein
                Materials.Antimony.getMolten(1), Materials.Arsenic.getMolten(1), Materials.Bismuth.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Zinc.getMolten(1),

                // Perditio & Ordo Vein
                Materials.Glowstone.getMolten(1), Materials.Redstone.getMolten(1),

                Materials.Mercury.getFluid(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Kaolinite Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Magnesium.getMolten(1), Materials.Potassium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Sodium.getFluid(1), Materials.Water.getFluid(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Aqua & Ignis Vein
                Materials.Glowstone.getMolten(1), Materials.Redstone.getMolten(1),

                Materials.Mercury.getFluid(1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Nether Quartz Vein
                Materials.Barium.getMolten(1), Materials.Silicon.getMolten(1),

                Materials.Oxygen.getGas(1) });

        // T9 - Seth - Se
        VoidFluidRecipes_T9.put(
            "Se",
            new FluidStack[] {
                // Osmium Vein
                Materials.Cobalt.getMolten(1), Materials.Iridium.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Osmium.getMolten(1), Materials.Palladium.getMolten(1),
                Materials.Platinum.getMolten(1), WerkstoffLoader.Rhodium.getMolten(1),
                WerkstoffLoader.Ruthenium.getMolten(1),

                // Samarium Vein
                Materials.Cerium.getMolten(1), Materials.Gadolinium.getMolten(1), Materials.Holmium.getMolten(1),
                Materials.Samarium.getMolten(1), Materials.Tartarite.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Oxygen.getGas(1),

                // Draconium Vein
                Materials.Aluminium.getMolten(1), Materials.Draconium.getMolten(1), Materials.Electrotine.getMolten(1),
                Materials.Electrum.getMolten(1), Materials.Iron.getMolten(1), Materials.Redstone.getMolten(1),
                Materials.Silicon.getMolten(1), Materials.Thaumium.getMolten(1), Materials.Vinteum.getMolten(1),

                Materials.Sodium.getFluid(1),

                Materials.Oxygen.getGas(1),

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

                // Bauxite Vein
                Materials.Aluminium.getMolten(1), Materials.Calcium.getMolten(1), Materials.Gallium.getMolten(1),
                Materials.Iron.getMolten(1), Materials.Silicon.getMolten(1), Materials.Titanium.getMolten(1),
                FluidRegistry.getFluidStack("molten.zirconium", 1),

                Materials.Hydrogen.getGas(1), Materials.Oxygen.getGas(1),

                // Gold Vein
                Materials.Copper.getMolten(1), Materials.Gold.getMolten(1), Materials.Iron.getMolten(1),
                Materials.Nickel.getMolten(1), Materials.Vanadium.getMolten(1),

                Materials.Oxygen.getGas(1),

                // Raw Tengam Vein
                Materials.Electrotine.getMolten(1), Materials.Electrum.getMolten(1), Materials.Redstone.getMolten(1),
                Materials.Samarium.getMolten(1), Materials.Neodymium.getMolten(1),
                Materials.TengamPurified.getMolten(1),

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
                // Awakened Draconium Ore
                Materials.DraconiumAwakened.getMolten(1),

                // Draconium Ore
                Materials.Draconium.getMolten(1) });
    }
}
