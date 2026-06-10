package Recipes.OriginGeneratorRecipes;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.ArrayList;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import goodgenerator.items.GGMaterial;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.FluidFuelOfGeneratorFrontend;

public class OriginGeneratorRecipes_UCFE {

    public static final RecipeMap<RecipeMapBackend> GeneratorRecipes_UCFE = RecipeMapBuilder
        .of("Origin of Generator with UCFE")
        .maxIO(1, 0, 1, 1)
        .minInputs(1, 1)
        .neiHandlerInfo(builder -> builder.setHeight(128))
        .frontend(FluidFuelOfGeneratorFrontend::new)
        .neiTransferRect(90, 10, 20, 16)
        .build();

    private static class FuelList {

        String FuelBaseline;
        int FuelCalorificValue;
        int Duration;
        FluidStack Fuel;

        public FuelList(String FuelBaseline, int FuelCalorificValue, int Duration, FluidStack Fuel) {
            this.FuelBaseline = FuelBaseline;
            this.FuelCalorificValue = FuelCalorificValue;
            this.Duration = Duration;
            this.Fuel = Fuel;
        }
    }

    public static void addGeneratorRecipes_UCFE() {
        ArrayList<FuelList> fuelList_Combustion = new ArrayList<>();

        // "Fish Oil"
        fuelList_Combustion.add(new FuelList("2,000", 2_000, 20, Materials.FishOil.getFluid(1)));

        // "Short Mead"
        fuelList_Combustion.add(new FuelList("4,000", 4_000, 20, FluidRegistry.getFluidStack("short.mead", 1)));

        // Biomass
        fuelList_Combustion.add(new FuelList("8,000", 8_000, 20, Materials.Biomass.getFluid(1)));

        // "Creosote Oil"
        fuelList_Combustion.add(new FuelList("8,000", 8_000, 20, Materials.Creosote.getFluid(1)));

        // Oil
        fuelList_Combustion.add(new FuelList("16,000", 16_000, 20, Materials.Oil.getFluid(1)));

        // "Sulfuric Light Fuel"
        fuelList_Combustion.add(new FuelList("40,000", 40_000, 20, Materials.SulfuricLightFuel.getFluid(1)));

        // Octane
        fuelList_Combustion.add(new FuelList("80,000", 80_000, 20, Materials.Octane.getFluid(1)));

        // Methanol
        fuelList_Combustion.add(new FuelList("84,000", 84_000, 20, Materials.Methanol.getFluid(1)));

        // Ethanol
        fuelList_Combustion.add(new FuelList("192,000", 192_000, 20, Materials.Ethanol.getFluid(1)));

        // "Light Fuel"
        fuelList_Combustion.add(new FuelList("305,000", 305_000, 20, Materials.LightFuel.getFluid(1)));

        // "Bio Diesel"
        fuelList_Combustion.add(new FuelList("320,000", 320_000, 20, Materials.BioDiesel.getFluid(1)));

        // Butanol
        fuelList_Combustion.add(new FuelList("400,000", 400_000, 20, FluidRegistry.getFluidStack("butanol", 1)));

        // Fuel
        fuelList_Combustion.add(new FuelList("480,000", 480_000, 20, Materials.Fuel.getFluid(1)));

        // Ether
        fuelList_Combustion.add(new FuelList("537,000", 537_000, 20, GGMaterial.ether.getFluidOrGas(1)));

        // Gasoline
        fuelList_Combustion.add(new FuelList("576,000", 576_000, 20, Materials.GasolineRegular.getFluid(1)));

        // "Cetane-Boosted Diesel"
        fuelList_Combustion.add(new FuelList("1,000,000", 1_000_000, 20, Materials.NitroFuel.getFluid(1)));

        // "Ethanol Gasoline"
        fuelList_Combustion
            .add(new FuelList("1,100,000", 1_100_000, 20, FluidRegistry.getFluidStack("ethanol gasoline", 1)));

        // "Jet Fuel No.3"
        fuelList_Combustion
            .add(new FuelList("1,824,000", 1_824_000, 20, FluidRegistry.getFluidStack("jet fuel no.3", 1)));

        // "Jet Fuel A"
        fuelList_Combustion.add(new FuelList("2,248,000", 2_248_000, 20, FluidRegistry.getFluidStack("jet fuel a", 1)));

        // "High Octane Gasoline"
        fuelList_Combustion.add(new FuelList("2,500,000", 2_500_000, 20, Materials.GasolinePremium.getFluid(1)));

        FuelList[] fuel_Combustion = fuelList_Combustion.toArray(new FuelList[0]);

        // "Universal Chemical Fuel Engine" - 32001
        for (FuelList list : fuel_Combustion) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 32001))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_UCFE);
        }

        ArrayList<FuelList> fuelList_Gas = new ArrayList<>();

        // Hydrogen
        fuelList_Gas.add(new FuelList("20,000", 20_000, 20, Materials.Hydrogen.getGas(1)));

        // "Natural Gas"
        fuelList_Gas.add(new FuelList("20,000", 20_000, 20, FluidRegistry.getFluidStack("gas_natural_gas", 1)));

        // "Carbon Monoxide"
        fuelList_Gas.add(new FuelList("24,000", 24_000, 20, Materials.CarbonMonoxide.getGas(1)));

        // "Wood Gas"
        fuelList_Gas.add(new FuelList("24,000", 24_000, 20, Materials.WoodGas.getGas(1)));

        // "Sulfuric Gas"
        fuelList_Gas.add(new FuelList("25,000", 25_000, 20, Materials.SulfuricGas.getGas(1)));

        // Biogas
        fuelList_Gas.add(new FuelList("40,000", 40_000, 20, FluidRegistry.getFluidStack("ic2biogas", 1)));

        // "Sulfuric Naphtha"
        fuelList_Gas.add(new FuelList("40,000", 40_000, 20, Materials.SulfuricNaphtha.getFluid(1)));

        // Cyclopentadiene
        fuelList_Gas.add(new FuelList("70,000", 70_000, 20, GGMaterial.cyclopentadiene.getFluidOrGas(1)));

        // "Coal Gas"
        fuelList_Gas.add(new FuelList("96,000", 96_000, 20, FluidRegistry.getFluidStack("fluid.coalgas", 1)));

        // Methane
        fuelList_Gas.add(new FuelList("104,000", 104_000, 20, Materials.Methane.getGas(1)));

        // Ethylene
        fuelList_Gas.add(new FuelList("128,000", 128_000, 20, Materials.Ethylene.getGas(1)));

        // "Refinery Gas"
        fuelList_Gas.add(new FuelList("160,000", 160_000, 20, FluidRegistry.getFluidStack("gas_gas", 1)));

        // Ethane
        fuelList_Gas.add(new FuelList("168,000", 168_000, 20, Materials.Ethane.getGas(1)));

        // Propene
        fuelList_Gas.add(new FuelList("192,000", 192_000, 20, Materials.Propene.getGas(1)));

        // Butadiene
        fuelList_Gas.add(new FuelList("206,000", 206_000, 20, Materials.Butadiene.getGas(1)));

        // Naphtha
        fuelList_Gas.add(new FuelList("220,000", 220_000, 20, Materials.Naphtha.getFluid(1)));

        // Propane
        fuelList_Gas.add(new FuelList("232,000", 232_000, 20, Materials.Propane.getGas(1)));

        // "Rocket Fuel"
        fuelList_Gas.add(new FuelList("250,000", 250_000, 20, FluidRegistry.getFluidStack("rocket_fuel", 1)));

        // Butene
        fuelList_Gas.add(new FuelList("256,000", 256_000, 20, Materials.Butene.getGas(1)));

        // Phenol
        fuelList_Gas.add(new FuelList("288,000", 288_000, 20, Materials.Phenol.getFluid(1)));

        // Butane
        fuelList_Gas.add(new FuelList("296,000", 296_000, 20, Materials.Butane.getGas(1)));

        // LPG
        fuelList_Gas.add(new FuelList("320,000", 320_000, 20, Materials.LPG.getFluid(1)));

        // Toluene
        fuelList_Gas.add(new FuelList("328,000", 328_000, 20, Materials.Toluene.getFluid(1)));

        // Benzene
        fuelList_Gas.add(new FuelList("369,000", 369_000, 20, Materials.Benzene.getFluid(1)));

        // Ether
        fuelList_Gas.add(new FuelList("537,000", 537_000, 20, GGMaterial.ether.getFluidOrGas(1)));

        // "Naquadah Gas"
        fuelList_Gas.add(new FuelList("1,024,000", 1_024_000, 20, GGMaterial.naquadahGas.getFluidOrGas(1)));

        // "Nefarious Gas"
        fuelList_Gas.add(new FuelList("1,200,000", 1_200_000, 20, FluidRegistry.getFluidStack("nefariousgas", 1)));

        // Nitrobenzene
        fuelList_Gas.add(new FuelList("1,600,000", 1_600_000, 20, FluidRegistry.getFluidStack("nitrobenzene", 1)));

        FuelList[] fuel_Gas = fuelList_Gas.toArray(new FuelList[0]);

        // "Universal Chemical Fuel Engine" - 32001
        for (FuelList list : fuel_Gas) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 32001))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_UCFE);
        }

        ArrayList<FuelList> fuelList_Rocket = new ArrayList<>();

        // "Rp-1 Rocket Fuel"
        fuelList_Rocket
            .add(new FuelList("1,536,000", 1_536_000, 20, FluidRegistry.getFluidStack("fluid.rocketfuelmixb", 1)));

        // "Dense Hydrazine Fuel Mixture"
        fuelList_Rocket
            .add(new FuelList("3,072,000", 3_072_000, 20, FluidRegistry.getFluidStack("fluid.rocketfuelmixd", 1)));

        // "CN3H7O3 Rocket Fuel"
        fuelList_Rocket
            .add(new FuelList("6,144,000", 6_144_000, 20, FluidRegistry.getFluidStack("fluid.rocketfuelmixc", 1)));

        // "H8N4C2O4 Rocket Fuel"
        fuelList_Rocket
            .add(new FuelList("12,588,000", 12_588_000, 20, FluidRegistry.getFluidStack("fluid.rocketfuelmixa", 1)));

        FuelList[] fuel_Rocket = fuelList_Rocket.toArray(new FuelList[0]);

        // "Universal Chemical Fuel Engine" - 32001
        for (FuelList list : fuel_Rocket) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 32001))
                .fluidInputs(list.Fuel)
                .duration(list.Duration)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_UCFE);
        }
    }
}
