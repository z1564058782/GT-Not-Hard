package Recipes.SingularityRecipes_Ecosystem;

import static gregtech.api.enums.Mods.BiomesOPlenty;
import static gregtech.api.enums.Mods.Computronics;
import static gregtech.api.enums.Mods.ExtraBees;
import static gregtech.api.enums.Mods.Forestry;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.Gendustry;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.MagicBees;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.OneToManyItemsFrontend;

public class FakeSingularityEcosystemRecipes_Comb {

    public static final RecipeMap<RecipeMapBackend> addFakeEcosystemRecipes_Comb = RecipeMapBuilder
        .of("Singularity of Pachinko_Comb")
        .maxIO(1, 135, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend::new)
        .build();

    public static void addFakeEcosystemRecipes_Comb() {
        // Misc Comb
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 9399))
            .itemOutputs(
                getModItem(BiomesOPlenty.ID, "food", 1L, 9), // "Filled Honeycomb"
                getModItem(BiomesOPlenty.ID, "misc", 1L, 2), // "Empty Honeycomb"

                getModItem(GTPlusPlus.ID, "gtpp.comb", 1L, 0), // "Dragonblood Comb"
                getModItem(GTPlusPlus.ID, "gtpp.comb", 1L, 1), // "Force Comb"

                getModItem(Computronics.ID, "computronics.partsForestry", 1L, 0) // "Caustic Comb"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Ecosystem Mode")
            .eut(0)
            .addTo(addFakeEcosystemRecipes_Comb);

        // ExtraBees
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 9399))
            .itemOutputs(
                getModItem(ExtraBees.ID, "honeyComb", 1L, 3), // "Oily Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 4), // "Fossilised Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 5), // "Petroleum Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 6), // "Damp Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 7), // "Milky Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 8), // "Fruity Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 9), // "Seedy Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 10), // "Alcoholic Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 13), // "Amber Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 15), // "Iron Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 16), // "Golden Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 17), // "Copper Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 18), // "Tin Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 19), // "Silver Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 20), // "Radioactive Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 24), // "Tar Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 25), // "Latex Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 26), // "Brimstone Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 27), // "Venomous Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 30), // "Caffeinated Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 31), // "Glacial Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 32), // "Shadow Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 33), // "Leaden Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 34), // "Zinc Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 35), // "Titanium Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 36), // "Tungsten Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 37), // "Platinum Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 39), // "Emerald Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 40), // "Ruby Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 41), // "Sapphire Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 42), // "Diamond Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 59), // "Nickel Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 61), // "Unstable Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 62), // "Decomposed Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 64), // "Certus Comb"
                getModItem(ExtraBees.ID, "honeyComb", 1L, 65) // "Shimmering Comb"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Ecosystem Mode")
            .eut(0)
            .addTo(addFakeEcosystemRecipes_Comb);

        // Forestry
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 9399))
            .itemOutputs(
                getModItem(Forestry.ID, "beeCombs", 1L, 0), // "Honey Comb"
                getModItem(Forestry.ID, "beeCombs", 1L, 2), // "Simmering Comb"
                getModItem(Forestry.ID, "beeCombs", 1L, 3), // "Stringy Comb"
                getModItem(Forestry.ID, "beeCombs", 1L, 4), // "Frozen Comb"
                getModItem(Forestry.ID, "beeCombs", 1L, 5), // "Dripping Comb"
                getModItem(Forestry.ID, "beeCombs", 1L, 6), // "Silky Comb"
                getModItem(Forestry.ID, "beeCombs", 1L, 7), // "Parched Comb"
                getModItem(Forestry.ID, "beeCombs", 1L, 15), // "Mossy Comb"
                getModItem(Forestry.ID, "beeCombs", 1L, 16) // "Mellow Comb"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Ecosystem Mode")
            .eut(0)
            .addTo(addFakeEcosystemRecipes_Comb);

        // MagicBees
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 9399))
            .itemOutputs(
                getModItem(MagicBees.ID, "comb", 1L, 0), // "Mundane Comb"
                getModItem(MagicBees.ID, "comb", 1L, 1), // "Molten Comb"
                getModItem(MagicBees.ID, "comb", 1L, 2), // "Occult Comb"
                getModItem(MagicBees.ID, "comb", 1L, 3), // "Otherworldy Comb"
                getModItem(MagicBees.ID, "comb", 1L, 4), // "Transmuting Comb"
                getModItem(MagicBees.ID, "comb", 1L, 5), // "Papery Comb"
                getModItem(MagicBees.ID, "comb", 1L, 6) // "Soul Comb"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Ecosystem Mode")
            .eut(0)
            .addTo(addFakeEcosystemRecipes_Comb);

        // Gendustry
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 9399))
            .itemOutputs(
                getModItem(Gendustry.ID, "HoneyComb", 1L, 10), // "Black Colored Comb"
                getModItem(Gendustry.ID, "HoneyComb", 1L, 24), // "Orange Colored Comb"
                getModItem(Gendustry.ID, "HoneyComb", 1L, 25), // "White Colored Comb"
                getModItem(Gendustry.ID, "HoneyComb", 1L, 14), // "Blue Colored Comb"
                getModItem(Gendustry.ID, "HoneyComb", 1L, 20), // "Lime Colored Comb"
                getModItem(Gendustry.ID, "HoneyComb", 1L, 21), // "Yellow Colored Comb"
                getModItem(Gendustry.ID, "HoneyComb", 1L, 13), // "Brown Colored Comb"
                getModItem(Gendustry.ID, "HoneyComb", 1L, 17), // "Light Gray Colored Comb"
                getModItem(Gendustry.ID, "HoneyComb", 1L, 22), // "Light Blue Colored Comb"
                getModItem(Gendustry.ID, "HoneyComb", 1L, 12), // "Green Colored Comb"
                getModItem(Gendustry.ID, "HoneyComb", 1L, 18), // "Gray Colored Comb"
                getModItem(Gendustry.ID, "HoneyComb", 1L, 16), // "Cyan Colored Comb"
                getModItem(Gendustry.ID, "HoneyComb", 1L, 11), // "Red Colored Comb"
                getModItem(Gendustry.ID, "HoneyComb", 1L, 23), // "Magenta Colored Comb"
                getModItem(Gendustry.ID, "HoneyComb", 1L, 19), // "Pink Colored Comb"
                getModItem(Gendustry.ID, "HoneyComb", 1L, 15) // "Purple Colored Comb"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Ecosystem Mode")
            .eut(0)
            .addTo(addFakeEcosystemRecipes_Comb);

        // GregTech
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 9399))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.comb", 1L, 0), // "Lignite Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 1), // "Coal Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 2), // "Sticky Resin Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 3), // "Oil Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 4), // "Apatite Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 5), // "Ash Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 6), // "Coolant Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 7), // "Energy Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 8), // "Lapotron Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 9), // "Pyrotheum Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 10), // "Cryotheum Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 11), // "Red Alloy Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 12), // "Redstone Alloy Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 13), // "Conductive Iron Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 14), // "Vibrant Alloy Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 15), // "Energetic Alloy Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 16), // "Electrical Steel Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 17), // "Dark Steel Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 18), // "Pulsating Iron Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 19), // "Stainless Steel Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 20), // "Enderium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 21), // "Thaumium Dust Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 22), // "Thaumium Shard Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 23), // "Amber Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 24), // "Quicksilver Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 25), // "Salis Mundus Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 26), // "Tainted Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 27), // "Mithril Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 28), // "Astral Silver Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 29), // "Thauminite Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 30), // "Shadow Metal Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 31), // "Divided Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 32), // "Nether Star Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 33), // "Stone Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 34), // "Certus Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 35), // "Fluix Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 36), // "Redstone Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 37), // "Rare Earth Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 38), // "Lapis Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 39), // "Ruby Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 40), // "Red Garnet Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 41), // "Yellow Garnet Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 42), // "Sapphire Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 43), // "Diamond Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 44), // "Olivine Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 45), // "Emerald Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 46), // "Pyrope Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 47), // "Grossular Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 48), // "Firestone Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 49), // "Slag Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 50), // "Copper Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 51), // "Tin Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 52), // "Lead Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 53), // "Iron Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 54), // "Steel Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 55), // "Nickel Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 56), // "Zinc Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 57), // "Silver Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 58), // "Gold Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 59), // "Sulfur Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 60), // "Gallium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 61), // "Arsenic Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 62), // "Bauxite Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 63), // "Aluminium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 64), // "Manganese Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 65), // "Magnesium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 66), // "Titanium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 67), // "Chrome Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 68), // "Tungsten Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 69), // "Platinum Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 70), // "Iridium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 71), // "Molybdenum Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 72), // "Osmium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 73), // "Lithium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 74), // "Salt Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 75), // "Electrotine Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 76), // "Almandine Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 77), // "Uranium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 78), // "Plutonium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 79), // "Naquadah Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 80), // "Naquadria Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 81), // "D-o-b Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 82), // "Thorium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 83), // "Lutetium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 84), // "Americium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 85), // "Neutronium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 86), // "Naga Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 87), // "Lich Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 88), // "Hydra Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 89), // "Ur Ghast Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 90), // "Snow Queen Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 91), // "Space Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 92), // "Meteoric Iron Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 93), // "Desh Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 94), // "Ledox Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 95), // "Callisto Ice Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 96), // "Mytryl Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 97), // "Quantium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 98), // "Oriharukon Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 99) // "Mysterious Crystal Comb"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Ecosystem Mode")
            .eut(0)
            .addTo(addFakeEcosystemRecipes_Comb);

        // GregTech
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 9399))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.comb", 1L, 100), // "Black Plutonium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 101), // "Trinium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 102), // "Mercury Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 103), // "Venus Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 104), // "Moon Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 105), // "Mars Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 106), // "Jupiter Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 107), // "Saturn Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 108), // "Uranus Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 109), // "Neptune Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 110), // "Pluto Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 111), // "Haumea Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 112), // "Makemake Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 113), // "Centauri Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 114), // "Tceti Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 115), // "Barnarda Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 116), // "Vega Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 117), // "Cosmic Neutronium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 118), // "Infinity Catalyst Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 119), // "Infinity Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 120), // "End Dust Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 121), // "Ectoplasma Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 122), // "Arcane Shard Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 123), // "Stardust Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 124), // "Dragon Essence Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 125), // "Enderman Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 126), // "Silverfish Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 127), // "Endium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 128), // "Rune Type 1 Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 129), // "Rune Type 2 Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 130), // "Fire Essence Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 131), // "Cryolite Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 132), // "Helium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 133), // "Argon Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 134), // "Xenon Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 135), // "Neon Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 136), // "Krypton Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 137), // "Nitrogen Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 138), // "Oxygen Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 139), // "Hydrogen Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 140), // "Phosphorus Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 141), // "Mica Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 142), // "Seaweed Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 143), // "Walrus Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 144), // "Infused Air Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 145), // "Infused Terra Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 146), // "Infused Ignis Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 147), // "Infused Aqua Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 148), // "Infused Ordo Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 149), // "Infused Perditio Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 150), // "Fluorine Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 151), // "Bedrockium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 152), // "Nether Shard Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 153), // "Ender Shard Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 154), // "Caelestis Red Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 155), // "Caelestis Green Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 156), // "Caelestis Blue Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 157), // "Unknown Liquid Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 158), // "Essentia Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 159), // "Indium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 160), // "Blizz Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 161), // "Kevlar Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 162), // "Draconium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 163), // "Awakened Draconium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 164), // "Palladium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 165), // "Infused Gold Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 166), // "Neodymium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 167), // "Europium Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 168), // "Machinist Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 169), // "Netherite Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 170), // "Prismatic Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 171), // "Refined Rare Earth Comb"
                getModItem(GregTech.ID, "gt.comb", 1L, 172) // "Pyrite Comb"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Ecosystem Mode")
            .eut(0)
            .addTo(addFakeEcosystemRecipes_Comb);
    }
}
