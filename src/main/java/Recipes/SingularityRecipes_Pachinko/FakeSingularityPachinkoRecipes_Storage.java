package Recipes.SingularityRecipes_Pachinko;

import static gregtech.api.enums.Mods.AE2FluidCraft;
import static gregtech.api.enums.Mods.AppliedEnergistics2;
import static gregtech.api.enums.Mods.Automagy;
import static gregtech.api.enums.Mods.AvaritiaAddons;
import static gregtech.api.enums.Mods.BinnieCore;
import static gregtech.api.enums.Mods.BuildCraftFactory;
import static gregtech.api.enums.Mods.DraconicEvolution;
import static gregtech.api.enums.Mods.EnderIO;
import static gregtech.api.enums.Mods.EnderStorage;
import static gregtech.api.enums.Mods.EtFuturumRequiem;
import static gregtech.api.enums.Mods.Forestry;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.IronChests;
import static gregtech.api.enums.Mods.IronTanks;
import static gregtech.api.enums.Mods.JABBA;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.Mods.Railcraft;
import static gregtech.api.enums.Mods.StorageDrawers;
import static gregtech.api.enums.Mods.Thaumcraft;
import static gregtech.api.enums.Mods.ThaumicEnergistics;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.OneToManyItemsFrontend_Large;

public class FakeSingularityPachinkoRecipes_Storage {

    public static final RecipeMap<RecipeMapBackend> addFakePachinkoRecipes_Storage = RecipeMapBuilder
        .of("Singularity of Pachinko_Storage")
        .maxIO(1, 135, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static void addFakePachinkoRecipes_Storage() {
        // Item Storage
        // "Super Chest I" - 135
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 135))
            .itemOutputs(
                getModItem(AppliedEnergistics2.ID, "tile.BlockSkyChest", 1L, 0), // "Sky Stone Chest"
                getModItem(AppliedEnergistics2.ID, "tile.BlockSkyChest", 1L, 1), // "Sky Stone Block Chest"

                getModItem(Automagy.ID, "blockGreedyChest", 1L), // "Greedy Chest"
                getModItem(Automagy.ID, "blockEagerChest", 1L), // "Eager Chest"
                getModItem(Automagy.ID, "blockTenaciousChest", 1L), // "Tenacious Chest"

                getModItem(AvaritiaAddons.ID, "CompressedChest", 1L), // "Compressed Chest"
                getModItem(AvaritiaAddons.ID, "InfinityChest", 1L), // "Infinity Chest"

                getModItem(BinnieCore.ID, "storage", 1L, 0), // Compartment
                getModItem(BinnieCore.ID, "storage", 1L, 1), // "Copper Compartment"
                getModItem(BinnieCore.ID, "storage", 1L, 2), // "Bronze Compartment"
                getModItem(BinnieCore.ID, "storage", 1L, 3), // "Iron Compartment"
                getModItem(BinnieCore.ID, "storage", 1L, 4), // "Gold Compartment"
                getModItem(BinnieCore.ID, "storage", 1L, 5), // "Diamond Compartment"

                getModItem(DraconicEvolution.ID, "draconiumChest", 1L), // "Draconic Chest"

                getModItem(EnderStorage.ID, "enderChest", 1L, 0), // "Ender Chest"
                getModItem(EnderStorage.ID, "enderChest", 1L, 4096), // "Ender Tank"

                getModItem(EtFuturumRequiem.ID, "shulker_box", 1L), // "Shulker Box"
                getModItem(EtFuturumRequiem.ID, "barrel", 1L), // Barrel
                getModItem(EtFuturumRequiem.ID, "iron_barrel", 1L), // "Iron Barrel"
                getModItem(EtFuturumRequiem.ID, "gold_barrel", 1L), // "Gold Barrel"
                getModItem(EtFuturumRequiem.ID, "diamond_barrel", 1L), // "Diamond Barrel"
                getModItem(EtFuturumRequiem.ID, "copper_barrel", 1L), // "Copper Barrel"
                getModItem(EtFuturumRequiem.ID, "silver_barrel", 1L), // "Silver Barrel"
                getModItem(EtFuturumRequiem.ID, "steel_barrel", 1L), // "Steel Barrel"
                getModItem(EtFuturumRequiem.ID, "obsidian_barrel", 1L), // "Obsidian Barrel"
                getModItem(EtFuturumRequiem.ID, "darksteel_barrel", 1L), // "Dark Steel Barrel"
                getModItem(EtFuturumRequiem.ID, "netherite_barrel", 1L), // "Netherite Barrel"

                getModItem(Forestry.ID, "apicultureChest", 1L, 0), // "Apiarist's Chest"
                getModItem(Forestry.ID, "arboriculture", 1L, 0), // "Arborist's Chest"
                getModItem(Forestry.ID, "lepidopterology", 1L, 0), // "Lepidopterist's Chest"

                getModItem(GregTech.ID, "gt.blockmachines", 1L, 125), // "Quantum Chest I"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 126), // "Quantum Chest II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 127), // "Quantum Chest III"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 128), // "Quantum Chest IV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 129), // "Quantum Chest V"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 135), // "Super Chest I"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 136), // "Super Chest II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 137), // "Super Chest III"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 138), // "Super Chest IV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 139), // "Super Chest V"

                getModItem(IronChests.ID, "BlockIronChest", 1L, 0), // "Iron Chest"
                getModItem(IronChests.ID, "BlockIronChest", 1L, 1), // "Gold Chest"
                getModItem(IronChests.ID, "BlockIronChest", 1L, 2), // "Diamond Chest"
                getModItem(IronChests.ID, "BlockIronChest", 1L, 3), // "Copper Chest"
                getModItem(IronChests.ID, "BlockIronChest", 1L, 4), // "Steel Chest"
                getModItem(IronChests.ID, "BlockIronChest", 1L, 5), // "Crystal Chest"
                getModItem(IronChests.ID, "BlockIronChest", 1L, 6), // "Obsidian Chest"
                getModItem(IronChests.ID, "BlockIronChest", 1L, 7), // "DirtChest 9000!"
                getModItem(IronChests.ID, "BlockIronChest", 1L, 9), // "Dark Steel Chest"

                getModItem(JABBA.ID, "barrel", 1L), // "Better Barrel"
                getModItem(JABBA.ID, "upgradeStructural", 1L, 0), // "Structural MK I (Oak Planks)"
                getModItem(JABBA.ID, "upgradeStructural", 1L, 1), // "Structural MK II (Copper Plate)"
                getModItem(JABBA.ID, "upgradeStructural", 1L, 2), // "Structural MK III (Iron Plate)"
                getModItem(JABBA.ID, "upgradeStructural", 1L, 3), // "Structural MK IV (Bronze Plate)"
                getModItem(JABBA.ID, "upgradeStructural", 1L, 4), // "Structural MK V (Steel Plate)"
                getModItem(JABBA.ID, "upgradeStructural", 1L, 5), // "Structural MK VI (Aluminium Plate)"
                getModItem(JABBA.ID, "upgradeStructural", 1L, 6), // "Structural MK VII (Stainless Steel Plate)"
                getModItem(JABBA.ID, "upgradeStructural", 1L, 7), // "Structural MK VIII (Titanium Plate)"
                getModItem(JABBA.ID, "upgradeStructural", 1L, 8), // "Structural MK IX (Tungstensteel Plate)"
                getModItem(JABBA.ID, "upgradeStructural", 1L, 9), // "Structural MK X (Chrome Plate)"
                getModItem(JABBA.ID, "upgradeStructural", 1L, 10), // "Structural MK XI (Iridium Plate)"
                getModItem(JABBA.ID, "upgradeStructural", 1L, 11), // "Structural MK XII (Osmium Plate)"
                getModItem(JABBA.ID, "upgradeStructural", 1L, 12), // "Structural MK XIII (Neutronium Plate)"
                getModItem(JABBA.ID, "upgradeStructural", 1L, 13), // "Structural MK XIV (Black Plutonium Plate)"
                getModItem(JABBA.ID, "upgradeCore", 1L, 0), // "Storage upgrade"
                getModItem(JABBA.ID, "upgradeCore", 1L, 1), // "BSpace upgrade"
                getModItem(JABBA.ID, "upgradeCore", 1L, 2), // "Redstone upgrade"
                getModItem(JABBA.ID, "upgradeCore", 1L, 3), // "Hopper upgrade"
                getModItem(JABBA.ID, "upgradeCore", 1L, 4), // "Storage upgrade x3"
                getModItem(JABBA.ID, "upgradeCore", 1L, 5), // "Storage upgrade x9"
                getModItem(JABBA.ID, "upgradeCore", 1L, 6), // "Storage upgrade x27"
                getModItem(JABBA.ID, "upgradeCore", 1L, 7), // "Void upgrade"
                getModItem(JABBA.ID, "upgradeCore", 1L, 8), // "Storage upgrade x81"
                getModItem(JABBA.ID, "upgradeCore", 1L, 9), // "Storage upgrade x243"
                getModItem(JABBA.ID, "upgradeCore", 1L, 10), // "Creative upgrade"
                getModItem(JABBA.ID, "upgradeCore", 1L, 11), // "Storage upgrade x729"
                getModItem(JABBA.ID, "upgradeCore", 1L, 12), // "Storage upgrade x2187"
                getModItem(JABBA.ID, "upgradeCore", 1L, 13), // "Storage upgrade x6561"
                getModItem(JABBA.ID, "upgradeSide", 1L, 0), // Sticker
                getModItem(JABBA.ID, "upgradeSide", 1L, 1), // "Hopper facade"
                getModItem(JABBA.ID, "upgradeSide", 1L, 2), // "Redstone facade"

                getModItem(Minecraft.ID, "chest", 1L), // Chest
                getModItem(Minecraft.ID, "ender_chest", 1L), // "Personal Ender Chest"
                getModItem(Minecraft.ID, "trapped_chest", 1L), // "Trapped Chest"

                getModItem(Railcraft.ID, "machine.beta", 1L, 11), // "Void Chest"

                getModItem(StorageDrawers.ID, "fullDrawers1", 1L, 0), // "Oak Drawer"
                getModItem(StorageDrawers.ID, "fullDrawers2", 1L, 0), // "Oak Drawers 1x2"
                getModItem(StorageDrawers.ID, "fullDrawers4", 1L, 0), // "Oak Drawers 2x2"
                getModItem(StorageDrawers.ID, "halfDrawers2", 1L, 0), // "Compact Oak Drawers 1x2"
                getModItem(StorageDrawers.ID, "halfDrawers4", 1L, 0), // "Compact Oak Drawers 2x2"
                getModItem(StorageDrawers.ID, "controller", 1L), // "Drawer Controller"
                getModItem(StorageDrawers.ID, "controllerSlave", 1L), // "Controller Slave"
                getModItem(StorageDrawers.ID, "trim", 1L, 0), // "Oak Trim"
                getModItem(StorageDrawers.ID, "framingTable", 1L), // "Framing Table"
                getModItem(StorageDrawers.ID, "fullCustom1", 1L), // "Framed Drawer"
                getModItem(StorageDrawers.ID, "fullCustom2", 1L), // "Framed Drawers 1x2"
                getModItem(StorageDrawers.ID, "fullCustom4", 1L), // "Framed Drawers 2x2"
                getModItem(StorageDrawers.ID, "halfCustom2", 1L), // "Framed Drawers 1x2"
                getModItem(StorageDrawers.ID, "halfCustom4", 1L), // "Framed Drawers 2x2"
                getModItem(StorageDrawers.ID, "upgradeTemplate", 1L), // "Upgrade Template"
                getModItem(StorageDrawers.ID, "upgrade", 1L, 2), // "Storage Upgrade (II)"
                getModItem(StorageDrawers.ID, "upgrade", 1L, 3), // "Storage Upgrade (III)"
                getModItem(StorageDrawers.ID, "upgrade", 1L, 4), // "Storage Upgrade (IV)"
                getModItem(StorageDrawers.ID, "upgrade", 1L, 5), // "Storage Upgrade (V)"
                getModItem(StorageDrawers.ID, "upgrade", 1L, 6), // "Storage Upgrade (VI)"
                getModItem(StorageDrawers.ID, "upgrade", 1L, 7), // "Storage Upgrade (VII)"
                getModItem(StorageDrawers.ID, "upgrade", 1L, 8), // "Storage Upgrade (VIII)"
                getModItem(StorageDrawers.ID, "upgradeStatus", 1L, 1), // "Status Upgrade (I)"
                getModItem(StorageDrawers.ID, "upgradeStatus", 1L, 2), // "Status Upgrade (II)"
                getModItem(StorageDrawers.ID, "upgradeVoid", 1L), // "Void Upgrade"
                getModItem(StorageDrawers.ID, "upgradeCreative", 1L, 0), // "Creative Storage Upgrade"
                getModItem(StorageDrawers.ID, "upgradeCreative", 1L, 1), // "Creative Vending Upgrade"
                getModItem(StorageDrawers.ID, "upgradeRedstone", 1L, 0), // "Redstone Upgrade"
                getModItem(StorageDrawers.ID, "upgradeRedstone", 1L, 1), // "Redstone Max Upgrade"
                getModItem(StorageDrawers.ID, "upgradeRedstone", 1L, 2), // "Redstone Min Upgrade"
                getModItem(StorageDrawers.ID, "upgradeDowngrade", 1L), // "Storage Downgrade"

                getModItem(Thaumcraft.ID, "blockChestHungry", 1L) // "Hungry Chest"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_Storage);

        // Fluid Storage
        // "Ultra Low Voltage Fluid Tank" - 817
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 817))
            .itemOutputs(
                getModItem(AE2FluidCraft.ID, "certus_quartz_tank", 1L), // "Certus Quartz Tank"

                getModItem(Automagy.ID, "blockThirstyTank", 1L), // "Thirsty Tank"

                getModItem(BuildCraftFactory.ID, "tankBlock", 1L), // Tank

                getModItem(EnderIO.ID, "blockTank", 1L, 0), // "Fluid Tank"
                getModItem(EnderIO.ID, "blockTank", 1L, 1), // "Pressurized Fluid Tank"

                getModItem(GregTech.ID, "gt.blockmachines", 1L, 120), // "Quantum Tank I"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 121), // "Quantum Tank II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 122), // "Quantum Tank III"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 123), // "Quantum Tank IV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 124), // "Quantum Tank V"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 130), // "Super Tank I"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 131), // "Super Tank II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 132), // "Super Tank III"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 133), // "Super Tank IV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 134), // "Super Tank V"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 817), // "Ultra Low Voltage Fluid Tank"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 818), // "Low Voltage Fluid Tank"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 819), // "Medium Voltage Fluid Tank"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 820), // "High Voltage Fluid Tank"

                getModItem(GTPlusPlus.ID, "blockInfiniteFluidTank", 1L), // "Infinite Fluid Tank"

                getModItem(IronTanks.ID, "ironTank", 1L), // "Iron Tank"
                getModItem(IronTanks.ID, "goldTank", 1L), // "Gold Tank"
                getModItem(IronTanks.ID, "diamondTank", 1L), // "Diamond Tank"
                getModItem(IronTanks.ID, "obsidianTank", 1L), // "Obsidian Tank"
                getModItem(IronTanks.ID, "emeraldTank", 1L), // "Aluminium Tank"
                getModItem(IronTanks.ID, "copperTank", 1L), // "Copper Tank"
                getModItem(IronTanks.ID, "silverTank", 1L), // "Steel Tank"
                getModItem(IronTanks.ID, "stainlesssteelTank", 1L), // "Stainless Steel Tank"
                getModItem(IronTanks.ID, "titaniumTank", 1L), // "Titanium Tank"
                getModItem(IronTanks.ID, "tungstensteelTank", 1L), // "Tungstensteel Tank"

                getModItem(Railcraft.ID, "machine.beta", 1L, 0), // "Iron Tank Wall"
                getModItem(Railcraft.ID, "machine.beta", 1L, 1), // "Iron Tank Gauge"
                getModItem(Railcraft.ID, "machine.beta", 1L, 2), // "Iron Tank Valve"
                getModItem(Railcraft.ID, "machine.beta", 1L, 13), // "Steel Tank Wall"
                getModItem(Railcraft.ID, "machine.beta", 1L, 14), // "Steel Tank Gauge"
                getModItem(Railcraft.ID, "machine.beta", 1L, 15), // "Steel Tank Valve"
                getModItem(Railcraft.ID, "machine.zeta", 1L, 0), // "Aluminium Tank Wall"
                getModItem(Railcraft.ID, "machine.zeta", 1L, 1), // "Aluminium Tank Gauge"
                getModItem(Railcraft.ID, "machine.zeta", 1L, 2), // "Aluminium Tank Valve"
                getModItem(Railcraft.ID, "machine.zeta", 1L, 3), // "Stainless Steel Tank Wall"
                getModItem(Railcraft.ID, "machine.zeta", 1L, 4), // "Stainless Steel Tank Gauge"
                getModItem(Railcraft.ID, "machine.zeta", 1L, 5), // "Stainless Steel Tank Valve"
                getModItem(Railcraft.ID, "machine.zeta", 1L, 6), // "Titanium Tank Wall"
                getModItem(Railcraft.ID, "machine.zeta", 1L, 7), // "Titanium Tank Gauge"
                getModItem(Railcraft.ID, "machine.zeta", 1L, 8), // "Titanium Tank Valve"
                getModItem(Railcraft.ID, "machine.zeta", 1L, 9), // "Tungstensteel Tank Wall"
                getModItem(Railcraft.ID, "machine.zeta", 1L, 10), // "Tungstensteel Tank Gauge"
                getModItem(Railcraft.ID, "machine.zeta", 1L, 11), // "Tungstensteel Tank Valve"
                getModItem(Railcraft.ID, "machine.zeta", 1L, 12), // "Palladium Tank Wall"
                getModItem(Railcraft.ID, "machine.zeta", 1L, 13), // "Palladium Tank Gauge"
                getModItem(Railcraft.ID, "machine.zeta", 1L, 14), // "Palladium Tank Valve"
                getModItem(Railcraft.ID, "machine.eta", 1L, 0), // "Iridium Tank Wall"
                getModItem(Railcraft.ID, "machine.eta", 1L, 1), // "Iridium Tank Gauge"
                getModItem(Railcraft.ID, "machine.eta", 1L, 2), // "Iridium Tank Valve"
                getModItem(Railcraft.ID, "machine.eta", 1L, 3), // "Osmium Tank Wall"
                getModItem(Railcraft.ID, "machine.eta", 1L, 4), // "Osmium Tank Gauge"
                getModItem(Railcraft.ID, "machine.eta", 1L, 5), // "Osmium Tank Valve"
                getModItem(Railcraft.ID, "machine.eta", 1L, 6), // "Neutronium Tank Wall"
                getModItem(Railcraft.ID, "machine.eta", 1L, 7), // "Neutronium Tank Gauge"
                getModItem(Railcraft.ID, "machine.eta", 1L, 8) // "Neutronium Tank Valve"
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_Storage);

        // AppliedEnergistics2 Storage
        // "Super Tank I" - 130
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 130))
            .itemOutputs(
                // "1k ME Fluid Storage Cell"
                getModItem(AE2FluidCraft.ID, "fluid_storage1", 1L),
                // "4k ME Fluid Storage Cell"
                getModItem(AE2FluidCraft.ID, "fluid_storage4", 1L),
                // "16k ME Fluid Storage Cell"
                getModItem(AE2FluidCraft.ID, "fluid_storage16", 1L),
                // "64k ME Fluid Storage Cell"
                getModItem(AE2FluidCraft.ID, "fluid_storage64", 1L),
                // "256k ME Fluid Storage Cell"
                getModItem(AE2FluidCraft.ID, "fluid_storage256", 1L),
                // "1024k ME Fluid Storage Cell"
                getModItem(AE2FluidCraft.ID, "fluid_storage1024", 1L),
                // "4096k ME Fluid Storage Cell"
                getModItem(AE2FluidCraft.ID, "fluid_storage4096", 1L),
                // "16384k ME Fluid Storage Cell"
                getModItem(AE2FluidCraft.ID, "fluid_storage16384", 1L),
                // "1k ME Multi-Fluid Storage Cell"
                getModItem(AE2FluidCraft.ID, "multi_fluid_storage1", 1L),
                // "4k ME Multi-Fluid Storage Cell"
                getModItem(AE2FluidCraft.ID, "multi_fluid_storage4", 1L),
                // "16k ME Multi-Fluid Storage Cell"
                getModItem(AE2FluidCraft.ID, "multi_fluid_storage16", 1L),
                // "64k ME Multi-Fluid Storage Cell"
                getModItem(AE2FluidCraft.ID, "multi_fluid_storage64", 1L),
                // "256k ME Multi-Fluid Storage Cell"
                getModItem(AE2FluidCraft.ID, "multi_fluid_storage256", 1L),
                // "1024k ME Multi-Fluid Storage Cell"
                getModItem(AE2FluidCraft.ID, "multi_fluid_storage1024", 1L),
                // "4096k ME Multi-Fluid Storage Cell"
                getModItem(AE2FluidCraft.ID, "multi_fluid_storage4096", 1L),
                // "16384k ME Multi-Fluid Storage Cell"
                getModItem(AE2FluidCraft.ID, "multi_fluid_storage16384", 1L),
                // "ME Fluid Quantum Storage Cell"
                getModItem(AE2FluidCraft.ID, "fluid_storage.quantum", 1L),
                // "ME Fluid Digital Singularity Storage Cell"
                getModItem(AE2FluidCraft.ID, "fluid_storage.singularity", 1L),
                // "ME Fluid Artificial Universe Storage Cell"
                getModItem(AE2FluidCraft.ID, "fluid_storage.Universe", 1L),
                // "ME Fluid Void Cell"
                getModItem(AE2FluidCraft.ID, "fluid_storage.void", 1L),
                // "Creative ME Fluid Storage Cell"
                getModItem(AE2FluidCraft.ID, "creative_fluid_storage", 1L),
                // "ME Fluid Infinity Water Storage Cell"
                getModItem(AE2FluidCraft.ID, "fluid_storage.infinity.water", 1L),

                // "Creative ME Storage Cell"
                getModItem(AppliedEnergistics2.ID, "item.ItemCreativeStorageCell", 1L),
                // "Void ME Storage Cell"
                getModItem(AppliedEnergistics2.ID, "item.ItemVoidStorageCell", 1L),
                // "1k ME Storage Cell"
                getModItem(AppliedEnergistics2.ID, "item.ItemBasicStorageCell.1k", 1L),
                // "4k ME Storage Cell"
                getModItem(AppliedEnergistics2.ID, "item.ItemBasicStorageCell.4k", 1L),
                // "16k ME Storage Cell"
                getModItem(AppliedEnergistics2.ID, "item.ItemBasicStorageCell.16k", 1L),
                // "64k ME Storage Cell"
                getModItem(AppliedEnergistics2.ID, "item.ItemBasicStorageCell.64k", 1L),
                // "256k ME Storage Cell"
                getModItem(AppliedEnergistics2.ID, "item.ItemAdvancedStorageCell.256k", 1L),
                // "1024k ME Storage Cell"
                getModItem(AppliedEnergistics2.ID, "item.ItemAdvancedStorageCell.1024k", 1L),
                // "4096k ME Storage Cell"
                getModItem(AppliedEnergistics2.ID, "item.ItemAdvancedStorageCell.4096k", 1L),
                // "16384k ME Storage Cell"
                getModItem(AppliedEnergistics2.ID, "item.ItemAdvancedStorageCell.16384k", 1L),
                // "Block Container ME Storage Cell"
                getModItem(AppliedEnergistics2.ID, "item.ItemExtremeStorageCell.Container", 1L),
                // "Quantum ME Storage Cell"
                getModItem(AppliedEnergistics2.ID, "item.ItemExtremeStorageCell.Quantum", 1L),
                // "Digital Singularity ME Storage Cell"
                getModItem(AppliedEnergistics2.ID, "item.ItemExtremeStorageCell.Singularity", 1L),
                // "Artificial Universe ME Storage Cell"
                getModItem(AppliedEnergistics2.ID, "item.ItemExtremeStorageCell.Universe", 1L),
                // "2³ Spatial Storage Cell"
                getModItem(AppliedEnergistics2.ID, "item.ItemSpatialStorageCell.2Cubed", 1L),
                // "16³ Spatial Storage Cell"
                getModItem(AppliedEnergistics2.ID, "item.ItemSpatialStorageCell.16Cubed", 1L),
                // "128³ Spatial Storage Cell"
                getModItem(AppliedEnergistics2.ID, "item.ItemSpatialStorageCell.128Cubed", 1L),

                // "1k ME Essentia Storage Cell"
                getModItem(ThaumicEnergistics.ID, "storage.essentia", 1L, 0),
                // "4k ME Essentia Storage Cell"
                getModItem(ThaumicEnergistics.ID, "storage.essentia", 1L, 1),
                // "16k ME Essentia Storage Cell"
                getModItem(ThaumicEnergistics.ID, "storage.essentia", 1L, 2),
                // "64k ME Essentia Storage Cell"
                getModItem(ThaumicEnergistics.ID, "storage.essentia", 1L, 3),
                // "Thaumometric Essentia Cell"
                getModItem(ThaumicEnergistics.ID, "storage.essentia", 1L, 4),
                // "256k ME Essentia Storage Cell"
                getModItem(ThaumicEnergistics.ID, "storage.essentia", 1L, 5),
                // "1024k ME Essentia Storage Cell"
                getModItem(ThaumicEnergistics.ID, "storage.essentia", 1L, 6),
                // "4096k ME Essentia Storage Cell"
                getModItem(ThaumicEnergistics.ID, "storage.essentia", 1L, 7),
                // "16384k ME Essentia Storage Cell"
                getModItem(ThaumicEnergistics.ID, "storage.essentia", 1L, 8),
                // "ME Essentia Quantum Storage Cell"
                getModItem(ThaumicEnergistics.ID, "storage.essentia", 1L, 9),
                // "ME Essentia Digital Singularity Storage Cell"
                getModItem(ThaumicEnergistics.ID, "storage.essentia", 1L, 10))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Pachinko Mode")
            .eut(0)
            .addTo(addFakePachinkoRecipes_Storage);
    }
}
