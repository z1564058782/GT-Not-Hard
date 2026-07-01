package Recipes.SingularityRecipes_ModItem;

import static gregtech.api.enums.Mods.AE2FluidCraft;
import static gregtech.api.enums.Mods.AE2Stuff;
import static gregtech.api.enums.Mods.AdvancedSolarPanel;
import static gregtech.api.enums.Mods.AppliedEnergistics2;
import static gregtech.api.enums.Mods.Automagy;
import static gregtech.api.enums.Mods.Avaritia;
import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.BiblioCraft;
import static gregtech.api.enums.Mods.BiblioWoodsBoPEdition;
import static gregtech.api.enums.Mods.BiblioWoodsForestryEdition;
import static gregtech.api.enums.Mods.BiblioWoodsNaturaEdition;
import static gregtech.api.enums.Mods.BloodArsenal;
import static gregtech.api.enums.Mods.BloodMagic;
import static gregtech.api.enums.Mods.Botania;
import static gregtech.api.enums.Mods.Botany;
import static gregtech.api.enums.Mods.CarpentersBlocks;
import static gregtech.api.enums.Mods.CatWalks;
import static gregtech.api.enums.Mods.Chisel;
import static gregtech.api.enums.Mods.CompactKineticGenerators;
import static gregtech.api.enums.Mods.Computronics;
import static gregtech.api.enums.Mods.CookingForBlockheads;
//import static gregtech.api.enums.Mods.CropsPlusPlus;
import static gregtech.api.enums.Mods.DraconicEvolution;
import static gregtech.api.enums.Mods.EnderIO;
import static gregtech.api.enums.Mods.EtFuturumRequiem;
import static gregtech.api.enums.Mods.EternalSingularity;
import static gregtech.api.enums.Mods.ExtraBees;
import static gregtech.api.enums.Mods.ExtraTrees;
import static gregtech.api.enums.Mods.ExtraUtilities;
import static gregtech.api.enums.Mods.ForbiddenMagic;
import static gregtech.api.enums.Mods.Forestry;
import static gregtech.api.enums.Mods.GGFab;
import static gregtech.api.enums.Mods.GTNHIntergalactic;
import static gregtech.api.enums.Mods.GTNHLanthanides;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.Gadomancy;
import static gregtech.api.enums.Mods.GalacticraftAmunRa;
import static gregtech.api.enums.Mods.GalacticraftCore;
import static gregtech.api.enums.Mods.GalacticraftMars;
import static gregtech.api.enums.Mods.GalaxySpace;
import static gregtech.api.enums.Mods.Gendustry;
import static gregtech.api.enums.Mods.Genetics;
import static gregtech.api.enums.Mods.GoodGenerator;
import static gregtech.api.enums.Mods.GraviSuite;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.HardcoreEnderExpansion;
import static gregtech.api.enums.Mods.IC2NuclearControl;
import static gregtech.api.enums.Mods.IndustrialCraft2;
import static gregtech.api.enums.Mods.KekzTech;
import static gregtech.api.enums.Mods.KubaTech;
import static gregtech.api.enums.Mods.LogisticsPipes;
import static gregtech.api.enums.Mods.LootGames;
import static gregtech.api.enums.Mods.MagicBees;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.Mods.Natura;
import static gregtech.api.enums.Mods.OpenBlocks;
import static gregtech.api.enums.Mods.OpenComputers;
import static gregtech.api.enums.Mods.OpenModularTurrets;
import static gregtech.api.enums.Mods.OpenSecurity;
import static gregtech.api.enums.Mods.PamsHarvestCraft;
import static gregtech.api.enums.Mods.PamsHarvestTheNether;
import static gregtech.api.enums.Mods.Railcraft;
import static gregtech.api.enums.Mods.RandomThings;
import static gregtech.api.enums.Mods.RemoteIO;
import static gregtech.api.enums.Mods.SGCraft;
import static gregtech.api.enums.Mods.StevesCarts2;
import static gregtech.api.enums.Mods.StevesFactoryManager;
import static gregtech.api.enums.Mods.StorageDrawers;
import static gregtech.api.enums.Mods.SuperSolarPanels;
import static gregtech.api.enums.Mods.TaintedMagic;
import static gregtech.api.enums.Mods.TecTech;
import static gregtech.api.enums.Mods.Thaumcraft;
import static gregtech.api.enums.Mods.ThaumicBases;
import static gregtech.api.enums.Mods.ThaumicEnergistics;
import static gregtech.api.enums.Mods.ThaumicExploration;
import static gregtech.api.enums.Mods.ThaumicHorizons;
import static gregtech.api.enums.Mods.ThaumicTinkerer;
import static gregtech.api.enums.Mods.TinkerConstruct;
import static gregtech.api.enums.Mods.TinkersDefence;
import static gregtech.api.enums.Mods.TinkersGregworks;
import static gregtech.api.enums.Mods.Translocator;
import static gregtech.api.enums.Mods.TwilightForest;
import static gregtech.api.enums.Mods.UniversalSingularities;
import static gregtech.api.enums.Mods.Witchery;
import static gregtech.api.enums.Mods.WitchingGadgets;
import static gregtech.api.enums.Mods.ZTones;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.OneToManyItemsFrontend_Large;

public class FakeSingularityModItemRecipes_Show {

    public static final RecipeMap<RecipeMapBackend> addFakeModItemRecipes_Show = RecipeMapBuilder
        .of("Singularity of Mod Item")
        .maxIO(1, 135, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static void addFakeModItemRecipes_Show() {
        // "Debug Power Generator" - 15498
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15498))
            .itemOutputs(
                // AdvancedSolarPanel - Advanced Solar Panel
                getModItem(AdvancedSolarPanel.ID, "BlockAdvSolarPanel", 1L, 0),
                // AE2FluidCraft - Certus Quartz Tank
                getModItem(AE2FluidCraft.ID, "certus_quartz_tank", 1L),
                // AE2Stuff - Advanced Wireless Setup Kit
                getModItem(AE2Stuff.ID, "AdvWirelessKit", 1L),
                // AppliedEnergistics2 - Quartz Glass
                getModItem(AppliedEnergistics2.ID, "tile.BlockQuartzGlass", 1L),
                // Automagy - Redcrystal
                getModItem(Automagy.ID, "blockRedcrystal", 1L),
                // Avaritia - Compressed Crafting Table
                getModItem(Avaritia.ID, "Double_Craft", 1L),

                // BartWorks - Nickel-Zinc Ferrite Block
                getModItem(BartWorks.ID, "BW_Machinery_Casings", 1L, 0),
                // BiblioCraft - Desk Bell
                getModItem(BiblioCraft.ID, "BiblioBell", 1L),
                // BiblioWoodsBoPEdition - Sacred Oak Fancy Sign
                getModItem(BiblioWoodsBoPEdition.ID, "BiblioWoodFancySign", 1L, 0),
                // BiblioWoodsForestryEdition - Balsa Fancy Sign
                getModItem(BiblioWoodsForestryEdition.ID, "BiblioWoodFancySign", 1L, 1),
                // BiblioWoodsNaturaEdition - Eucalyptus Fancy Sign
                getModItem(BiblioWoodsNaturaEdition.ID, "BiblioWoodFancySign", 1L, 2),
                // BloodArsenal - Blood Infused Wooden Plank
                getModItem(BloodArsenal.ID, "blood_infused_planks", 1L),
                // BloodMagic - Wooden Brace
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 1L, 3),
                // Botania - Livingrock
                getModItem(Botania.ID, "livingrock", 1L, 0),
                // Botany - Soil Meter
                getModItem(Botany.ID, "soilMeter", 1L),

                // CarpentersBlocks - Carpenter's Block
                getModItem(CarpentersBlocks.ID, "blockCarpentersBlock", 1L),
                // CatWalks - Steel Grate
                getModItem(CatWalks.ID, "steelgrate", 1L),
                // Chisel - Auto Chisel
                getModItem(Chisel.ID, "autoChisel", 1L),
                // CompactKineticGenerators - Kinetic Gearbox Rotor (Iridium)
                getModItem(CompactKineticGenerators.ID, "IridiumRotor", 1L),
                // Computronics - Iron Note Block
                getModItem(Computronics.ID, "computronics.ironNoteBlock", 1L),
                // CookingForBlockheads - Cooking Table
                getModItem(CookingForBlockheads.ID, "cookingtable", 1L),
                // CropsPlusPlus - Goldfish
                //getModItem(CropsPlusPlus.ID, "foodGoldfish", 1L),

                // DraconicEvolution - Draconium Infused Obsidian
                getModItem(DraconicEvolution.ID, "infusedObsidian", 1L),

                // EnderIO - Basic Capacitor
                getModItem(EnderIO.ID, "itemBasicCapacitor", 1L, 0),
                // EnhancedLootBags - Dungeon Lamp
                getModItem(LootGames.ID, "LootGamesDungeonLight", 1L, 0),
                // EternalSingularity - Eternal Singularity
                getModItem(EternalSingularity.ID, "eternal_singularity", 1L),
                // EtFuturumRequiem - Ancient Debris
                getModItem(EtFuturumRequiem.ID, "ancient_debris", 1L),
                // ExtraBees - Mutator
                getModItem(ExtraBees.ID, "alveary", 1L, 0),
                // ExtraTrees - Carpentry Hammer
                getModItem(ExtraTrees.ID, "hammer", 1L),
                // ExtraUtilities - Slightly Larger Chest
                getModItem(ExtraUtilities.ID, "chestFull", 1L),

                // ForbiddenMagic - Gluttony Shard
                getModItem(ForbiddenMagic.ID, "GluttonyShard", 1L),
                // Forestry - Sturdy Casing
                getModItem(Forestry.ID, "sturdyMachine", 1L),
                // Gadomancy - Mirrored Jar
                getModItem(Gadomancy.ID, "BlockRemoteJar", 1L),
                // GalacticraftAmunRa - Rocket Engine Jet
                getModItem(GalacticraftAmunRa.ID, "tile.machines2", 1L, 0),
                // GalacticraftCore - Rocket Launch Pad
                getModItem(GalacticraftCore.ID, "tile.landingPad", 1L, 0),
                // GalacticraftMars - Hydrogen Pipe
                getModItem(GalacticraftMars.ID, "tile.hydrogenPipe", 1L),
                // GalaxySpace - Solar Wind Panel
                getModItem(GalaxySpace.ID, "solarwindpanel", 1L),
                // Gendustry - Item Eject Cover
                getModItem(Gendustry.ID, "EjectCover", 1L),
                // Genetics - Reinforced Casing
                getModItem(Genetics.ID, "misc", 1L, 0),
                // GGFab - Single Use File
                getModItem(GGFab.ID, "gt.ggfab.d1", 1L, 0),
                // GoodGenerator - Wrap of ULV Circuits
                getModItem(GoodGenerator.ID, "circuitWrap", 1L, 0),
                // GraviSuite - Superconductor Cover
                getModItem(GraviSuite.ID, "itemSimpleItem", 1L, 0),
                // GregTech - ULV Machine Casing
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 0),
                // GTNHIntergalactic - Nanotube Spool
                getModItem(GTNHIntergalactic.ID, "item.SpaceElevatorParts", 1L, 0),
                // GTNHLanthanides - Shielded Accelerator Casing
                getModItem(GTNHLanthanides.ID, "casing.shielded_accelerator", 1L),
                // GTPlusPlus - Integral Encasement I
                getModItem(GTPlusPlus.ID, "gtplusplus.blocktieredcasings.1", 1L, 0),

                // HardcoreEnderExpansion - Altar Nexus
                getModItem(HardcoreEnderExpansion.ID, "altar_nexus", 1L),

                // IC2NuclearControl - Thermal Monitor
                getModItem(IC2NuclearControl.ID, "blockNuclearControlMain", 1L, 0),
                // IndustrialCraft2 - Basic Machine Casing
                getModItem(IndustrialCraft2.ID, "blockMachine", 1L, 0),

                // KekzTech - YSZ Ceramic Electrolyte Unit
                getModItem(KekzTech.ID, "kekztech_yszceramicelectrolyteunit_block", 1L),
                // KubaTech - Tea Acceptor
                getModItem(KubaTech.ID, "kubablocks", 1L, 0),

                // LogisticsPipes - Basic Logistics Pipe
                getModItem(LogisticsPipes.ID, "item.PipeItemsBasicLogistics", 1L),

                // MagicBees - Manasteel Grafter
                getModItem(MagicBees.ID, "item.manasteelGrafter", 1L),
                // Minecraft - Stone
                getModItem(Minecraft.ID, "stone", 1L),

                // Natura - Green Glowshroom
                getModItem(Natura.ID, "Glowshroom", 1L, 0),

                // OpenBlocks - Elevator
                getModItem(OpenBlocks.ID, "elevator", 1L, 0),
                // OpenComputers - Computer Case (Tier 1)
                getModItem(OpenComputers.ID, "case1", 1L, 0),
                // OpenModularTurrets - Sensor (Tier 1)
                getModItem(OpenModularTurrets.ID, "sensorTierOneItem", 1L),
                // OpenSecurity - Magnetic Card Reader
                getModItem(OpenSecurity.ID, "magreader", 1L),

                // PamsHarvestCraft - Fish Trap
                getModItem(PamsHarvestCraft.ID, "fishtrap", 1L),
                // PamsHarvestTheNether - Ignis Fruit Sapling
                getModItem(PamsHarvestTheNether.ID, "netherSapling", 1L),

                // Railcraft - Block of Coal Coke
                getModItem(Railcraft.ID, "cube", 1L, 0),
                // RandomThings - Void Stone
                getModItem(RandomThings.ID, "voidStone", 1L),
                // RemoteIO - Water Reservoir
                getModItem(RemoteIO.ID, "tile.machine", 1L, 0),

                // SGCraft - Stargate Base
                getModItem(SGCraft.ID, "stargateBase", 1L),
                // StevesCarts2 - Cargo Manager
                getModItem(StevesCarts2.ID, "BlockCargoManager", 1L, 0),
                // StevesFactoryManager - Machine Inventory Manager
                getModItem(StevesFactoryManager.ID, "BlockMachineManagerName", 1L),
                // StorageDrawers - Framing Table
                getModItem(StorageDrawers.ID, "framingTable", 1L),
                // SuperSolarPanels - Solar Light Splitter
                getModItem(SuperSolarPanels.ID, "solarsplitter", 1L),

                // TaintedMagic - Warpwood Sapling
                getModItem(TaintedMagic.ID, "BlockWarpwoodSapling", 1L),
                // TecTech - High Power Casing
                getModItem(TecTech.ID, "gt.blockcasingsTT", 1L, 0),
                // Thaumcraft - Greatwood Sapling
                getModItem(Thaumcraft.ID, "blockCustomPlant", 1L, 0),
                // ThaumicBases - Quicksilver Block
                getModItem(ThaumicBases.ID, "quicksilverBlock", 1L),
                // ThaumicEnergistics - Iron Gear Box
                getModItem(ThaumicEnergistics.ID, "thaumicenergistics.block.gear.box", 1L),
                // ThaumicExploration - White Floating Candle
                getModItem(ThaumicExploration.ID, "floatCandle", 1L, 0),
                // ThaumicHorizons - Chocolate Bar
                getModItem(ThaumicHorizons.ID, "barChocolate", 1L),
                // ThaumicTinkerer - Ichor
                getModItem(ThaumicTinkerer.ID, "kamiResource", 1L, 0),
                // TinkerConstruct - Slimy Sapling
                getModItem(TinkerConstruct.ID, "slime.sapling", 1L, 0),
                // TinkersDefence - Dogbearium Ingot
                getModItem(TinkersDefence.ID, "DogbeariumIngot", 1L),
                // TinkersGregworks - Aluminium Tool Rod
                getModItem(TinkersGregworks.ID, "tGregToolPartToolRod", 1L, 1500),
                // Translocator - Diamond Nugget
                getModItem(Translocator.ID, "diamondNugget", 1L),
                // TwilightForest - Raven's Feather
                getModItem(TwilightForest.ID, "item.tfFeather", 1L),

                // UniversalSingularities - Coal Singularity
                getModItem(UniversalSingularities.ID, "universal.vanilla.singularity", 1L, 0),

                // Witchery - Leaping Lily
                getModItem(Witchery.ID, "leapinglily", 1L),
                // WitchingGadgets - Spinning Wheel
                getModItem(WitchingGadgets.ID, "WG_WoodenDevice", 1L, 0),

                // ZTones - Ztone Tile
                getModItem(ZTones.ID, "stoneTile", 1L, 0))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Mod Mode")
            .eut(0)
            .addTo(addFakeModItemRecipes_Show);
    }
}
