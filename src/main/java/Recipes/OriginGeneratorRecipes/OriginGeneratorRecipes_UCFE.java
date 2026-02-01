package Recipes.OriginGeneratorRecipes;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import goodgenerator.items.GGMaterial;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.FluidFuelOfGeneratorFrontend;

public class OriginGeneratorRecipes_UCFE {

    public static final RecipeMap<RecipeMapBackend> GeneratorRecipes_UCFE = RecipeMapBuilder
        .of("Origin of Generator with UCFE")
        .maxIO(1, 0, 1, 1)
        .minInputs(1, 1)
        .neiHandlerInfo(builder -> builder.setHeight(128))
        .frontend(FluidFuelOfGeneratorFrontend::new)
        .build();

    private static final String[] FuelBaseline_Combustion = new String[] {
        // "Fish Oil"
        "2,000",
        // "Short Mead"
        "4,000",
        // Biomass
        "8,000",
        // "Creosote Oil"
        "8,000",
        // Oil
        "16,000",
        // "Sulfuric Light Fuel"
        "40,000",
        // Octane
        "80,000",
        // Methanol
        "84,000",
        // Ethanol
        "192,000",
        // "Light Fuel"
        "305,000",
        // "Bio Diesel"
        "320,000",
        // Butanol
        "400,000",
        // Fuel
        "480,000",
        // Ether
        "537,000",
        // Gasoline
        "576,000",
        // "Cetane-Boosted Diesel"
        "1,000,000",
        // "Ethanol Gasoline"
        "1,100,000",
        // "Jet Fuel No.3"
        "1,824,000",
        // "Jet Fuel A"
        "2,248,000",
        // "High Octane Gasoline"
        "2,500,000" };

    private static final int[] FuelCalorificValue_Combustion = new int[] {
        // "Fish Oil"
        2_000,
        // "Short Mead"
        4_000,
        // Biomass
        8_000,
        // "Creosote Oil"
        8_000,
        // Oil
        16_000,
        // "Sulfuric Light Fuel"
        40_000,
        // Octane
        80_000,
        // Methanol
        84_000,
        // Ethanol
        192_000,
        // "Light Fuel"
        305_000,
        // "Bio Diesel"
        320_000,
        // Butanol
        400_000,
        // Fuel
        480_000,
        // Ether
        537_000,
        // Gasoline
        576_000,
        // "Cetane-Boosted Diesel"
        1_000_000,
        // "Ethanol Gasoline"
        1_100_000,
        // "Jet Fuel No.3"
        1_824_000,
        // "Jet Fuel A"
        2_248_000,
        // "High Octane Gasoline"
        2_500_000 };

    private static final FluidStack[] Fuel_Combustion = new FluidStack[] {
        // "Fish Oil"
        Materials.FishOil.getFluid(1),
        // "Short Mead"
        FluidRegistry.getFluidStack("short.mead", 1),
        // Biomass
        Materials.Biomass.getFluid(1),
        // "Creosote Oil"
        Materials.Creosote.getFluid(1),
        // Oil
        Materials.Oil.getFluid(1),
        // "Sulfuric Light Fuel"
        Materials.SulfuricLightFuel.getFluid(1),
        // Octane
        Materials.Octane.getFluid(1),
        // Methanol
        Materials.Methanol.getFluid(1),
        // Ethanol
        Materials.Ethanol.getFluid(1),
        // "Light Fuel"
        Materials.LightFuel.getFluid(1),
        // "Bio Diesel"
        Materials.BioDiesel.getFluid(1),
        // Butanol
        FluidRegistry.getFluidStack("butanol", 1),
        // Fuel
        Materials.Fuel.getFluid(1),
        // Ether
        GGMaterial.ether.getFluidOrGas(1),
        // Gasoline
        Materials.GasolineRegular.getFluid(1),
        // "Cetane-Boosted Diesel"
        Materials.NitroFuel.getFluid(1),
        // "Ethanol Gasoline"
        FluidRegistry.getFluidStack("ethanol gasoline", 1),
        // "Jet Fuel No.3"
        FluidRegistry.getFluidStack("jet fuel no.3", 1),
        // "Jet Fuel A"
        FluidRegistry.getFluidStack("jet fuel a", 1),
        // "High Octane Gasoline"
        Materials.GasolinePremium.getFluid(1) };

    private static final String[] FuelBaseline_Gas = new String[] {
        // Hydrogen
        "20,000",
        // "Natural Gas"
        "20,000",
        // "Carbon Monoxide"
        "24,000",
        // "Wood Gas"
        "24,000",
        // "Sulfuric Gas"
        "25,000",
        // Biogas
        "40,000",
        // "Sulfuric Naphtha"
        "40,000",
        // Cyclopentadiene
        "70,000",
        // "Coal Gas"
        "96,000",
        // Methane
        "104,000",
        // Ethylene
        "128,000",
        // "Refinery Gas"
        "160,000",
        // Ethane
        "168,000",
        // Propene
        "192,000",
        // Butadiene
        "206,000",
        // Naphtha
        "220,000",
        // Propane
        "232,000",
        // "Rocket Fuel"
        "250,000",
        // Butene
        "256,000",
        // Phenol
        "288,000",
        // Butane
        "296,000",
        // LPG
        "320,000",
        // Toluene
        "328,000",
        // Benzene
        "369,000",
        // Ether
        "537,000",
        // "Naquadah Gas"
        "1,024,000",
        // "Nefarious Gas"
        "1,200,000",
        // Nitrobenzene
        "1,600,000" };

    private static final int[] FuelCalorificValue_Gas = new int[] {
        // Hydrogen
        20_000,
        // "Natural Gas"
        20_000,
        // "Carbon Monoxide"
        24_000,
        // "Wood Gas"
        24_000,
        // "Sulfuric Gas"
        25_000,
        // Biogas
        40_000,
        // "Sulfuric Naphtha"
        40_000,
        // Cyclopentadiene
        70_000,
        // "Coal Gas"
        96_000,
        // Methane
        104_000,
        // Ethylene
        128_000,
        // "Refinery Gas"
        160_000,
        // Ethane
        168_000,
        // Propene
        192_000,
        // Butadiene
        206_000,
        // Naphtha
        220_000,
        // Propane
        232_000,
        // "Rocket Fuel"
        250_000,
        // Butene
        256_000,
        // Phenol
        288_000,
        // Butane
        296_000,
        // LPG
        320_000,
        // Toluene
        328_000,
        // Benzene
        369_000,
        // Ether
        537_000,
        // "Naquadah Gas"
        1_024_000,
        // "Nefarious Gas"
        1_200_000,
        // Nitrobenzene
        1_600_000 };

    private static final FluidStack[] Fuel_Gas = new FluidStack[] {
        // Hydrogen
        Materials.Hydrogen.getGas(1),
        // "Natural Gas"
        FluidRegistry.getFluidStack("gas_natural_gas", 1),
        // "Carbon Monoxide"
        Materials.CarbonMonoxide.getGas(1),
        // "Wood Gas"
        Materials.WoodGas.getGas(1),
        // "Sulfuric Gas"
        Materials.SulfuricGas.getGas(1),
        // Biogas
        FluidRegistry.getFluidStack("ic2biogas", 1),
        // "Sulfuric Naphtha"
        Materials.SulfuricNaphtha.getFluid(1),
        // Cyclopentadiene
        GGMaterial.cyclopentadiene.getFluidOrGas(1),
        // "Coal Gas"
        FluidRegistry.getFluidStack("fluid.coalgas", 1),
        // Methane
        Materials.Methane.getGas(1),
        // Ethylene
        Materials.Ethylene.getGas(1),
        // "Refinery Gas"
        FluidRegistry.getFluidStack("gas_gas", 1),
        // Ethane
        Materials.Ethane.getGas(1),
        // Propene
        Materials.Propene.getGas(1),
        // Butadiene
        Materials.Butadiene.getGas(1),
        // Naphtha
        Materials.Naphtha.getFluid(1),
        // Propane
        Materials.Propane.getGas(1),
        // "Rocket Fuel"
        FluidRegistry.getFluidStack("rocket_fuel", 1),
        // Butene
        Materials.Butene.getGas(1),
        // Phenol
        Materials.Phenol.getFluid(1),
        // Butane
        Materials.Butane.getGas(1),
        // LPG
        Materials.LPG.getFluid(1),
        // Toluene
        Materials.Toluene.getFluid(1),
        // Benzene
        Materials.Benzene.getFluid(1),
        // Ether
        GGMaterial.ether.getFluidOrGas(1),
        // "Naquadah Gas"
        GGMaterial.naquadahGas.getFluidOrGas(1),
        // "Nefarious Gas"
        FluidRegistry.getFluidStack("nefariousgas", 1),
        // Nitrobenzene
        FluidRegistry.getFluidStack("nitrobenzene", 1) };

    private static final String[] FuelBaseline_Rocket = new String[] {
        // "Rp-1 Rocket Fuel"
        "1,536,000",
        // "Dense Hydrazine Fuel Mixture"
        "3,072,000",
        // "CN3H7O3 Rocket Fuel"
        "6,144,000",
        // "H8N4C2O4 Rocket Fuel"
        "12,588,000" };

    private static final int[] FuelCalorificValue_Rocket = new int[] {
        // "Rp-1 Rocket Fuel"
        1_536_000,
        // "Dense Hydrazine Fuel Mixture"
        3_072_000,
        // "CN3H7O3 Rocket Fuel"
        6_144_000,
        // "H8N4C2O4 Rocket Fuel"
        12_588_000 };

    private static final FluidStack[] Fuel_Rocket = new FluidStack[] {
        // "Rp-1 Rocket Fuel"
        FluidRegistry.getFluidStack("fluid.rocketfuelmixb", 1),
        // "Dense Hydrazine Fuel Mixture"
        FluidRegistry.getFluidStack("fluid.rocketfuelmixd", 1),
        // "CN3H7O3 Rocket Fuel"
        FluidRegistry.getFluidStack("fluid.rocketfuelmixc", 1),
        // "H8N4C2O4 Rocket Fuel"
        FluidRegistry.getFluidStack("fluid.rocketfuelmixa", 1) };

    public static void addGeneratorRecipes_UCFE() {
        // "Universal Chemical Fuel Engine" - 32001
        for (int FuelID = 0; FuelID < Fuel_Combustion.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1171))
                .fluidInputs(Fuel_Combustion[FuelID])
                .fluidOutputs(FluidRegistry.getFluidStack("ic2distilledwater", 1))
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_Combustion[FuelID])
                .eut(-FuelCalorificValue_Combustion[FuelID])
                .addTo(GeneratorRecipes_UCFE);
        }

        // "Universal Chemical Fuel Engine" - 32001
        for (int FuelID = 0; FuelID < Fuel_Gas.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 32001))
                .fluidInputs(Fuel_Gas[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_Gas[FuelID])
                .eut(-FuelCalorificValue_Gas[FuelID])
                .addTo(GeneratorRecipes_UCFE);
        }

        // "Universal Chemical Fuel Engine" - 32001
        for (int FuelID = 0; FuelID < Fuel_Rocket.length; FuelID++) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 32001))
                .fluidInputs(Fuel_Rocket[FuelID])
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + FuelBaseline_Rocket[FuelID])
                .eut(-FuelCalorificValue_Rocket[FuelID])
                .addTo(GeneratorRecipes_UCFE);
        }
    }
}
