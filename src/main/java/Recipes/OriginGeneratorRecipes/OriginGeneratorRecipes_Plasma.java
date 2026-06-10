package Recipes.OriginGeneratorRecipes;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import java.util.ArrayList;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import bartworks.system.material.WerkstoffLoader;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.enums.MaterialsUEVplus;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.FluidFuelOfGeneratorFrontend;

public class OriginGeneratorRecipes_Plasma {

    public static final RecipeMap<RecipeMapBackend> GeneratorRecipes_Plasma = RecipeMapBuilder
        .of("Origin of Generator with Plasma")
        .maxIO(1, 0, 1, 1)
        .minInputs(1, 1)
        .neiHandlerInfo(builder -> builder.setHeight(128))
        .frontend(FluidFuelOfGeneratorFrontend::new)
        .neiTransferRect(90, 10, 20, 16)
        .build();

    private static class FuelList {

        String FuelBaseline;
        int FuelCalorificValue;
        FluidStack Fuel;
        FluidStack Scrap;

        public FuelList(String FuelBaseline, int FuelCalorificValue, FluidStack Fuel, FluidStack Scrap) {
            this.FuelBaseline = FuelBaseline;
            this.FuelCalorificValue = FuelCalorificValue;
            this.Fuel = Fuel;
            this.Scrap = Scrap;
        }
    }

    public static void addGeneratorRecipes_Plasma() {

        ArrayList<FuelList> fuelList = new ArrayList<>();

        // "Carbon Plasma"
        fuelList.add(
            new FuelList(
                "12,288,000",
                12_288_000,
                FluidRegistry.getFluidStack("plasma.carbon", 1),
                Materials.DenseSupercriticalSteam.getGas(1)));

        // "Hydrogen Plasma"
        fuelList.add(
            new FuelList(
                "20,480,000",
                20_480_000,
                FluidRegistry.getFluidStack("plasma.hydrogen", 1),
                Materials.Hydrogen.getGas(1)));

        // "Bedrockium Plasma"
        fuelList.add(
            new FuelList(
                "20,480,000",
                20_480_000,
                FluidRegistry.getFluidStack("plasma.bedrockium", 1),
                Materials.Bedrockium.getMolten(1)));

        // "Phosphorus Plasma"
        fuelList.add(
            new FuelList(
                "30,720,000",
                30_720_000,
                FluidRegistry.getFluidStack("plasma.phosphorus", 1),
                Materials.DenseSupercriticalSteam.getGas(1)));

        // "Deuterium Plasma"
        fuelList.add(
            new FuelList(
                "40,960,000",
                40_960_000,
                FluidRegistry.getFluidStack("plasma.deuterium", 1),
                Materials.Deuterium.getGas(1)));

        // "Desh Plasma"
        fuelList.add(
            new FuelList(
                "50,176,000",
                50_176_000,
                FluidRegistry.getFluidStack("plasma.desh", 1),
                Materials.Desh.getMolten(1)));

        // "Tritium Plasma"
        fuelList.add(
            new FuelList(
                "61,440,000",
                61_440_000,
                FluidRegistry.getFluidStack("plasma.tritium", 1),
                Materials.Tritium.getGas(1)));

        // "Helium-3 Plasma"
        fuelList.add(
            new FuelList(
                "61,440,000",
                61_440_000,
                FluidRegistry.getFluidStack("plasma.helium_3", 1),
                Materials.Helium_3.getGas(1)));

        // "Meteoric Iron Plasma"
        fuelList.add(
            new FuelList(
                "69,632,000",
                69_632_000,
                FluidRegistry.getFluidStack("plasma.meteoriciron", 1),
                Materials.MeteoricIron.getMolten(1)));

        // "Germanium Plasma"
        fuelList.add(
            new FuelList(
                "74,752,000",
                74_752_000,
                FluidRegistry.getFluidStack("plasma.germanium", 1),
                FluidRegistry.getFluidStack("molten.germanium", 1)));

        // "Selenium Plasma"
        fuelList.add(
            new FuelList(
                "80,896,000",
                80_896_000,
                FluidRegistry.getFluidStack("plasma.selenium", 1),
                FluidRegistry.getFluidStack("molten.selenium", 1)));

        // "Helium Plasma"
        fuelList.add(
            new FuelList(
                "81,920,000",
                81_920_000,
                FluidRegistry.getFluidStack("plasma.helium", 1),
                Materials.Helium.getGas(1)));

        // "Advanced Nitinol Plasma"
        fuelList.add(
            new FuelList(
                "93,184,000",
                93_184_000,
                FluidRegistry.getFluidStack("plasma.advancednitinol", 1),
                FluidRegistry.getFluidStack("molten.advancednitinol", 1)));

        // "Chromatic Glass Plasma"
        fuelList.add(
            new FuelList(
                "93,184,000",
                93_184_000,
                FluidRegistry.getFluidStack("plasma.chromaticglass", 1),
                FluidRegistry.getFluidStack("molten.chromaticglass", 1)));

        // "Cosmic Neutronium Plasma"
        fuelList.add(
            new FuelList(
                "100,352,000",
                100_352_000,
                Materials.CosmicNeutronium.getPlasma(1),
                Materials.CosmicNeutronium.getMolten(1)));

        // "Ichorium Plasma"
        fuelList.add(
            new FuelList("100,352,000", 100_352_000, Materials.Ichorium.getPlasma(1), Materials.Ichorium.getMolten(1)));

        // "Lithium Plasma"
        fuelList.add(
            new FuelList("100,352,000", 100_352_000, Materials.Lithium.getPlasma(1), Materials.Lithium.getMolten(1)));

        // "Ardite Plasma"
        fuelList.add(
            new FuelList("100,352,000", 100_352_000, Materials.Ardite.getPlasma(1), Materials.Ardite.getMolten(1)));

        // "Naquadria Plasma"
        fuelList.add(
            new FuelList(
                "100,352,000",
                100_352_000,
                Materials.Naquadria.getPlasma(1),
                Materials.Naquadria.getMolten(1)));

        // "Awakened Draconium Plasma"
        fuelList.add(
            new FuelList(
                "100,352,000",
                100_352_000,
                Materials.DraconiumAwakened.getPlasma(1),
                Materials.DraconiumAwakened.getMolten(1)));

        // "Six-Phased Copper Plasma"
        fuelList.add(
            new FuelList(
                "100,352,000",
                100_352_000,
                MaterialsUEVplus.SixPhasedCopper.getPlasma(1),
                MaterialsUEVplus.SixPhasedCopper.getMolten(1)));

        // "Draconium Plasma"
        fuelList.add(
            new FuelList(
                "100,352,000",
                100_352_000,
                Materials.Draconium.getPlasma(1),
                Materials.Draconium.getMolten(1)));

        // "Infinity Plasma"
        fuelList.add(
            new FuelList("100,352,000", 100_352_000, Materials.Infinity.getPlasma(1), Materials.Infinity.getMolten(1)));

        // "Neutronium Plasma"
        fuelList.add(
            new FuelList(
                "102,400,000",
                102_400_000,
                FluidRegistry.getFluidStack("plasma.neutronium", 1),
                Materials.Neutronium.getMolten(1)));

        // "Beryllium Plasma"
        fuelList.add(
            new FuelList(
                "110,592,000",
                110_592_000,
                FluidRegistry.getFluidStack("plasma.beryllium", 1),
                Materials.Beryllium.getMolten(1)));

        // "Boron Plasma"
        fuelList
            .add(new FuelList("112,640,000", 112_640_000, Materials.Boron.getPlasma(1), Materials.Boron.getMolten(1)));

        // "Nitrogen Plasma"
        fuelList.add(
            new FuelList("129,024,000", 129_024_000, Materials.Nitrogen.getPlasma(1), Materials.Nitrogen.getGas(1)));

        // "Iodine Plasma"
        fuelList.add(
            new FuelList(
                "130,048,000",
                130_048_000,
                FluidRegistry.getFluidStack("plasma.iodine", 1),
                FluidRegistry.getFluidStack("molten.iodine", 1)));

        // "Tellurium Plasma"
        fuelList.add(
            new FuelList(
                "130,048,000",
                130_048_000,
                FluidRegistry.getFluidStack("plasma.tellurium", 1),
                Materials.Tellurium.getMolten(1)));

        // "Oxygen Plasma"
        fuelList
            .add(new FuelList("131,072,000", 131_072_000, Materials.Oxygen.getPlasma(1), Materials.Oxygen.getGas(1)));

        // "Fluorine Plasma"
        fuelList.add(
            new FuelList(
                "147,456,000",
                147_456_000,
                FluidRegistry.getFluidStack("plasma.fluorine", 1),
                Materials.Fluorine.getGas(1)));

        // "Sodium Plasma"
        fuelList.add(
            new FuelList(
                "148,684,000",
                148_684_000,
                FluidRegistry.getFluidStack("plasma.sodium", 1),
                Materials.Sodium.getFluid(1)));

        // "Tin Plasma"
        fuelList.add(new FuelList("150,000,000", 150_000_000, Materials.Tin.getPlasma(1), Materials.Tin.getMolten(1)));

        // "Magnesium Plasma"
        fuelList.add(
            new FuelList(
                "152,371,000",
                152_371_000,
                FluidRegistry.getFluidStack("plasma.magnesium", 1),
                Materials.Magnesium.getMolten(1)));

        // "Aluminium Plasma"
        fuelList.add(
            new FuelList(
                "159,744,000",
                159_744_000,
                FluidRegistry.getFluidStack("plasma.aluminium", 1),
                Materials.Aluminium.getMolten(1)));

        // "Dysprosium Plasma"
        fuelList.add(
            new FuelList(
                "165,888,000",
                165_888_000,
                FluidRegistry.getFluidStack("plasma.dysprosium", 1),
                Materials.Dysprosium.getMolten(1)));

        // "Sulfur Plasma"
        fuelList.add(
            new FuelList(
                "170,393,000",
                170_393_000,
                Materials.Sulfur.getPlasma(1),
                Materials.DenseSupercriticalSteam.getGas(1)));

        // "Chlorine Plasma"
        fuelList.add(
            new FuelList(
                "172,032,000",
                172_032_000,
                FluidRegistry.getFluidStack("plasma.chlorine", 1),
                Materials.Chlorine.getGas(1)));

        // "Force Plasma"
        fuelList.add(
            new FuelList(
                "180,000,000",
                180_000_000,
                FluidRegistry.getFluidStack("plasma.force", 1),
                FluidRegistry.getFluidStack("molten.force", 1)));

        // "Potassium Plasma"
        fuelList.add(
            new FuelList(
                "183,705,000",
                183_705_000,
                FluidRegistry.getFluidStack("plasma.potassium", 1),
                Materials.Potassium.getMolten(1)));

        // "Calcium Plasma"
        fuelList.add(
            new FuelList(
                "188,416,000",
                188_416_000,
                Materials.Calcium.getPlasma(1),
                WerkstoffLoader.Calcium.getMolten(1)));

        // "Argon Plasma"
        fuelList.add(
            new FuelList(
                "188,416,000",
                188_416_000,
                FluidRegistry.getFluidStack("plasma.argon", 1),
                Materials.Argon.getGas(1)));

        // "Rhenium Plasma"
        fuelList.add(
            new FuelList(
                "190,464,000",
                190_464_000,
                FluidRegistry.getFluidStack("plasma.rhenium", 1),
                FluidRegistry.getFluidStack("molten.rhenium", 1)));

        // "Scandium Plasma"
        fuelList.add(
            new FuelList(
                "193,536,000",
                193_536_000,
                FluidRegistry.getFluidStack("plasma.scandium", 1),
                Materials.Scandium.getMolten(1)));

        // "Titanium Plasma"
        fuelList.add(
            new FuelList("196,608,000", 196_608_000, Materials.Titanium.getPlasma(1), Materials.Titanium.getMolten(1)));

        // "Vanadium Plasma"
        fuelList.add(
            new FuelList(
                "198,451,000",
                198_451_000,
                FluidRegistry.getFluidStack("plasma.vanadium", 1),
                Materials.Vanadium.getMolten(1)));

        // "Chrome Plasma"
        fuelList.add(
            new FuelList(
                "202,342,000",
                202_342_000,
                FluidRegistry.getFluidStack("plasma.chrome", 1),
                Materials.Chrome.getMolten(1)));

        // "Manganese Plasma"
        fuelList.add(
            new FuelList(
                "202,752,000",
                202_752_000,
                FluidRegistry.getFluidStack("plasma.manganese", 1),
                Materials.Manganese.getMolten(1)));

        // "Dragonblood Plasma"
        fuelList.add(
            new FuelList(
                "205,824,000",
                205_824_000,
                FluidRegistry.getFluidStack("plasma.dragonblood", 1),
                FluidRegistry.getFluidStack("molten.dragonblood", 1)));

        // "Oriharukon Plasma"
        fuelList.add(
            new FuelList(
                "205,824,000",
                205_824_000,
                FluidRegistry.getFluidStack("plasma.oriharukon", 1),
                Materials.Oriharukon.getMolten(1)));

        // "Iron Plasma"
        fuelList
            .add(new FuelList("206,438,000", 206_438_000, Materials.Iron.getPlasma(1), Materials.Iron.getMolten(1)));

        // "Thallium Plasma"
        fuelList.add(
            new FuelList(
                "208,896,000",
                208_896_000,
                FluidRegistry.getFluidStack("plasma.thallium", 1),
                FluidRegistry.getFluidStack("molten.thallium", 1)));

        // "Nickel Plasma"
        fuelList.add(
            new FuelList("213,811,000", 213_811_000, Materials.Nickel.getPlasma(1), Materials.Nickel.getMolten(1)));

        // "Polonium Plasma"
        fuelList.add(
            new FuelList(
                "214,016,000",
                214_016_000,
                FluidRegistry.getFluidStack("plasma.polonium", 1),
                FluidRegistry.getFluidStack("molten.polonium", 1)));

        // "Cobalt Plasma"
        fuelList.add(
            new FuelList(
                "217,497,000",
                217_497_000,
                FluidRegistry.getFluidStack("plasma.cobalt", 1),
                Materials.Cobalt.getMolten(1)));

        // "Copper Plasma"
        fuelList.add(
            new FuelList("219,340,000", 219_340_000, Materials.Copper.getMolten(1), Materials.Copper.getMolten(1)));

        // "Zinc Plasma"
        fuelList
            .add(new FuelList("226,304,000", 226_304_000, Materials.Zinc.getPlasma(1), Materials.Zinc.getMolten(1)));

        // "Gallium Plasma"
        fuelList.add(
            new FuelList(
                "229,376,000",
                229_376_000,
                FluidRegistry.getFluidStack("plasma.gallium", 1),
                Materials.Gallium.getMolten(1)));

        // "Arsenic Plasma"
        fuelList.add(
            new FuelList(
                "230,400,000",
                230_400_000,
                FluidRegistry.getFluidStack("plasma.arsenic", 1),
                Materials.Arsenic.getMolten(1)));

        // "Radium Plasma"
        fuelList.add(
            new FuelList(
                "231,424,000",
                231_424_000,
                FluidRegistry.getFluidStack("plasma.radium", 1),
                FluidRegistry.getFluidStack("molten.radium", 1)));

        // "Protactinium Plasma"
        fuelList.add(
            new FuelList(
                "236,544,000",
                236_544_000,
                FluidRegistry.getFluidStack("plasma.protactinium", 1),
                FluidRegistry.getFluidStack("molten.protactinium", 1)));

        // "Uranium 232 Plasma"
        fuelList.add(
            new FuelList(
                "237,568,000",
                237_568_000,
                FluidRegistry.getFluidStack("plasma.uranium232", 1),
                FluidRegistry.getFluidStack("molten.uranium232", 1)));

        // "Uranium 233 Plasma"
        fuelList.add(
            new FuelList(
                "238,592,000",
                238_592_000,
                FluidRegistry.getFluidStack("plasma.uranium233", 1),
                FluidRegistry.getFluidStack("molten.uranium233", 1)));

        // "Neptunium Plasma"
        fuelList.add(
            new FuelList(
                "242,688,000",
                242_688_000,
                FluidRegistry.getFluidStack("plasma.neptunium", 1),
                Materials.Bedrockium.getMolten(1)));

        // "Plutonium-238 Plasma"
        fuelList.add(
            new FuelList(
                "243,712,000",
                243_712_000,
                FluidRegistry.getFluidStack("plasma.plutonium238", 1),
                FluidRegistry.getFluidStack("molten.plutonium238", 1)));

        // "Rubidium Plasma"
        fuelList.add(
            new FuelList(
                "243,712,000",
                243_712_000,
                FluidRegistry.getFluidStack("plasma.rubidium", 1),
                Materials.Rubidium.getMolten(1)));

        // "Strontium Plasma"
        fuelList.add(
            new FuelList(
                "249,446,000",
                249_446_000,
                FluidRegistry.getFluidStack("plasma.strontium", 1),
                Materials.Strontium.getMolten(1)));

        // "Curium Plasma"
        fuelList.add(
            new FuelList(
                "252,928,000",
                252_928_000,
                FluidRegistry.getFluidStack("plasma.curium", 1),
                FluidRegistry.getFluidStack("molten.curium", 1)));

        // "Yttrium Plasma"
        fuelList.add(
            new FuelList(
                "255,180,000",
                255_180_000,
                FluidRegistry.getFluidStack("plasma.yttrium", 1),
                Materials.Yttrium.getMolten(1)));

        // "Fermium Plasma"
        fuelList.add(
            new FuelList(
                "263,168,000",
                263_168_000,
                FluidRegistry.getFluidStack("plasma.fermium", 1),
                FluidRegistry.getFluidStack("molten.fermium", 1)));

        // "Niobium Plasma"
        fuelList.add(
            new FuelList("269,516,000", 269_516_000, Materials.Niobium.getPlasma(1), Materials.Niobium.getMolten(1)));

        // "Molybdenum Plasma"
        fuelList.add(
            new FuelList(
                "272,384,000",
                272_384_000,
                FluidRegistry.getFluidStack("plasma.molybdenum", 1),
                Materials.Molybdenum.getMolten(1)));

        // "Palladium Plasma"
        fuelList.add(
            new FuelList(
                "282,214,000",
                282_214_000,
                FluidRegistry.getFluidStack("plasma.palladium", 1),
                Materials.Palladium.getMolten(1)));

        // "Silver Plasma"
        fuelList.add(
            new FuelList("282,685,000", 282_685_000, Materials.Silver.getPlasma(1), Materials.Silver.getMolten(1)));

        // "Astral Titanium Plasma"
        fuelList.add(
            new FuelList(
                "284,672,000",
                284_672_000,
                FluidRegistry.getFluidStack("plasma.astraltitanium", 1),
                FluidRegistry.getFluidStack("molten.astraltitanium", 1)));

        // "Cadmium Plasma"
        fuelList.add(
            new FuelList(
                "293,601,000",
                293_601_000,
                FluidRegistry.getFluidStack("plasma.cadmium", 1),
                Materials.DenseSupercriticalSteam.getGas(1)));

        // "Flerovium Plasma"
        fuelList.add(
            new FuelList(
                "295,936,000",
                295_936_000,
                Materials.Flerovium.getPlasma(1),
                Materials.Flerovium.getMolten(1)));

        // "Indium Plasma"
        fuelList.add(
            new FuelList(
                "296,509,000",
                296_509_000,
                FluidRegistry.getFluidStack("plasma.indium", 1),
                Materials.Indium.getMolten(1)));

        // "Antimony Plasma"
        fuelList.add(
            new FuelList(
                "309,760,000",
                309_760_000,
                FluidRegistry.getFluidStack("plasma.antimony", 1),
                Materials.Antimony.getMolten(1)));

        // "Tritanium Plasma"
        fuelList.add(
            new FuelList(
                "330,752,000",
                330_752_000,
                FluidRegistry.getFluidStack("plasma.tritanium", 1),
                Materials.Tritanium.getMolten(1)));

        // "Caesium Plasma"
        fuelList.add(
            new FuelList(
                "332,513,000",
                332_513_000,
                FluidRegistry.getFluidStack("plasma.caesium", 1),
                Materials.Caesium.getMolten(1)));

        // "Rhugnor Plasma"
        fuelList.add(
            new FuelList(
                "333,824,000",
                333_824_000,
                FluidRegistry.getFluidStack("plasma.rhugnor", 1),
                FluidRegistry.getFluidStack("molten.rhugnor", 1)));

        // "Naquadah Plasma"
        fuelList.add(
            new FuelList(
                "337,920,000",
                337_920_000,
                FluidRegistry.getFluidStack("plasma.naquadah", 1),
                Materials.Naquadah.getMolten(1)));

        // "Barium Plasma"
        fuelList.add(
            new FuelList(
                "342,302,000",
                342_302_000,
                FluidRegistry.getFluidStack("plasma.barium", 1),
                Materials.Barium.getMolten(1)));

        // "Lanthanum Plasma"
        fuelList.add(
            new FuelList(
                "344,801,000",
                344_801_000,
                FluidRegistry.getFluidStack("plasma.lanthanum", 1),
                Materials.Lanthanum.getMolten(1)));

        // "Cerium Plasma"
        fuelList.add(
            new FuelList(
                "346,931,000",
                346_931_000,
                FluidRegistry.getFluidStack("plasma.cerium", 1),
                Materials.Cerium.getMolten(1)));

        // "Praseodymium Plasma"
        fuelList.add(
            new FuelList(
                "346,931,000",
                346_931_000,
                FluidRegistry.getFluidStack("plasma.praseodymium", 1),
                Materials.Praseodymium.getMolten(1)));

        // "Promethium Plasma"
        fuelList.add(
            new FuelList(
                "347,996,000",
                347_996_000,
                FluidRegistry.getFluidStack("plasma.promethium", 1),
                Materials.Promethium.getMolten(1)));

        // "Neodymium Plasma"
        fuelList.add(
            new FuelList(
                "347,996,000",
                347_996_000,
                FluidRegistry.getFluidStack("plasma.neodymium", 1),
                Materials.Neodymium.getMolten(1)));

        // "Runite Plasma"
        fuelList.add(
            new FuelList(
                "350,000,000",
                350_000_000,
                FluidRegistry.getFluidStack("plasma.runite", 1),
                FluidRegistry.getFluidStack("molten.runite", 1)));

        // "Samarium Plasma"
        fuelList.add(
            new FuelList(
                "353,280,000",
                353_280_000,
                FluidRegistry.getFluidStack("plasma.samarium", 1),
                Materials.Samarium.getMolten(1)));

        // "Europium Plasma"
        fuelList.add(
            new FuelList(
                "355,635,000",
                355_635_000,
                FluidRegistry.getFluidStack("plasma.europium", 1),
                Materials.Europium.getMolten(1)));

        // "Gadolinium Plasma"
        fuelList.add(
            new FuelList(
                "366,551,000",
                366_551_000,
                FluidRegistry.getFluidStack("plasma.gadolinium", 1),
                Materials.Gadolinium.getMolten(1)));

        // "Terbium Plasma"
        fuelList.add(
            new FuelList(
                "368,885,000",
                368_885_000,
                FluidRegistry.getFluidStack("plasma.terbium", 1),
                Materials.Terbium.getMolten(1)));

        // "Holmium Plasma"
        fuelList.add(
            new FuelList(
                "376,176,000",
                376_176_000,
                FluidRegistry.getFluidStack("plasma.holmium", 1),
                Materials.Holmium.getMolten(1)));

        // "Erbium Plasma"
        fuelList.add(
            new FuelList(
                "376,217,000",
                376_217_000,
                FluidRegistry.getFluidStack("plasma.erbium", 1),
                Materials.Erbium.getMolten(1)));

        // "Thulium Plasma"
        fuelList.add(
            new FuelList(
                "378,470,000",
                378_470_000,
                FluidRegistry.getFluidStack("plasma.thulium", 1),
                Materials.Thulium.getMolten(1)));

        // "Ytterbium Plasma"
        fuelList.add(
            new FuelList(
                "379,695,000",
                379_695_000,
                FluidRegistry.getFluidStack("plasma.ytterbium", 1),
                Materials.Ytterbium.getMolten(1)));

        // "Lutetium Plasma"
        fuelList.add(
            new FuelList(
                "381,296,000",
                381_296_000,
                FluidRegistry.getFluidStack("plasma.lutetium", 1),
                Materials.Lutetium.getMolten(1)));

        // "Tantalum Plasma"
        fuelList.add(
            new FuelList(
                "384,000,000",
                384_000_000,
                FluidRegistry.getFluidStack("plasma.tantalum", 1),
                Materials.Tantalum.getMolten(1)));

        // "Tungsten Plasma"
        fuelList.add(
            new FuelList(
                "384,778,000",
                384_778_000,
                FluidRegistry.getFluidStack("plasma.tungsten", 1),
                Materials.Tungsten.getMolten(1)));

        // "Gold Plasma"
        fuelList.add(
            new FuelList(
                "401,408,000",
                401_408_000,
                FluidRegistry.getFluidStack("plasma.gold", 1),
                Materials.Gold.getMolten(1)));

        // "Mercury Plasma"
        fuelList.add(
            new FuelList(
                "409,600,000",
                409_600_000,
                FluidRegistry.getFluidStack("plasma.mercury", 1),
                Materials.Mercury.getFluid(1)));

        // "Lead Plasma"
        fuelList
            .add(new FuelList("423,936,000", 423_936_000, Materials.Lead.getPlasma(1), Materials.Lead.getMolten(1)));

        // "Bismuth Plasma"
        fuelList.add(
            new FuelList("425,984,000", 425_984_000, Materials.Bismuth.getPlasma(1), Materials.Bismuth.getMolten(1)));

        // "Radon Plasma"
        fuelList.add(new FuelList("450,560,000", 450_560_000, Materials.Radon.getPlasma(1), Materials.Radon.getGas(1)));

        // "Thorium Plasma"
        fuelList.add(
            new FuelList("471,040,000", 471_040_000, Materials.Thorium.getPlasma(1), Materials.Thorium.getMolten(1)));

        // "Uranium 235 Plasma"
        fuelList.add(
            new FuelList(
                "481,280,000",
                481_280_000,
                FluidRegistry.getFluidStack("plasma.uranium235", 1),
                Materials.Uranium235.getMolten(1)));

        // "Uranium 238 Plasma"
        fuelList.add(
            new FuelList(
                "487,424,000",
                487_424_000,
                FluidRegistry.getFluidStack("plasma.uranium", 1),
                Materials.Uranium.getMolten(1)));

        // "Plutonium 241 Plasma"
        fuelList.add(
            new FuelList(
                "497,664,000",
                497_664_000,
                Materials.Plutonium241.getPlasma(1),
                Materials.Plutonium241.getMolten(1)));

        // "Americium Plasma"
        fuelList.add(
            new FuelList(
                "501,760,000",
                501_760_000,
                Materials.Americium.getPlasma(1),
                Materials.Americium.getMolten(1)));

        // "Hypogen Plasma"
        fuelList.add(
            new FuelList(
                "502,784,000",
                502_784_000,
                FluidRegistry.getFluidStack("plasma.hypogen", 1),
                FluidRegistry.getFluidStack("molten.hypogen", 1)));

        // "Plutonium 239 Plasma"
        fuelList.add(
            new FuelList(
                "503,808,000",
                503_808_000,
                FluidRegistry.getFluidStack("plasma.plutonium", 1),
                Materials.Plutonium.getMolten(1)));

        // "Celestial Tungsten Plasma"
        fuelList.add(
            new FuelList(
                "720,000,000",
                720_000_000,
                FluidRegistry.getFluidStack("plasma.celestialtungsten", 1),
                FluidRegistry.getFluidStack("molten.celestialtungsten", 1)));

        FuelList[] fuel = fuelList.toArray(new FuelList[0]);

        for (FuelList list : fuel) {
            // "Plasma Generator Mark I" - 1196
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1196))
                .fluidInputs(list.Fuel)
                .fluidOutputs(list.Scrap)
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Plasma);

            // "Plasma Generator Mark II" - 1197
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1197))
                .fluidInputs(list.Fuel)
                .fluidOutputs(list.Scrap)
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Plasma);

            // "Plasma Generator Mark III" - 1198
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1198))
                .fluidInputs(list.Fuel)
                .fluidOutputs(list.Scrap)
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Plasma);

            // "Plasma Generator Mark IV" - 10752
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 10752))
                .fluidInputs(list.Fuel)
                .fluidOutputs(list.Scrap)
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Plasma);

            // "Ultimate Pocket Sun" - 10753
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 10753))
                .fluidInputs(list.Fuel)
                .fluidOutputs(list.Scrap)
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Plasma);

            // "Large Plasma Turbine" - 1153
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 1153))
                .fluidInputs(list.Fuel)
                .fluidOutputs(list.Scrap)
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Plasma);

            // "XL Turbo Plasma Turbine" - 31074
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 0L, 31074))
                .fluidInputs(list.Fuel)
                .fluidOutputs(list.Scrap)
                .duration(SECONDS)
                .setNEIDesc("Fuel Baseline = " + list.FuelBaseline)
                .eut(-list.FuelCalorificValue)
                .addTo(GeneratorRecipes_Plasma);
        }
    }
}
