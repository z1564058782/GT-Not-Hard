package Recipes.SingularityRecipes_Ecosystem;

import static gregtech.api.enums.Mods.BiomesOPlenty;
import static gregtech.api.enums.Mods.EtFuturumRequiem;
import static gregtech.api.enums.Mods.ExtraTrees;
import static gregtech.api.enums.Mods.ForbiddenMagic;
import static gregtech.api.enums.Mods.Forestry;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GalacticraftAmunRa;
import static gregtech.api.enums.Mods.GalaxySpace;
import static gregtech.api.enums.Mods.IndustrialCraft2;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.Mods.Natura;
import static gregtech.api.enums.Mods.PamsHarvestCraft;
import static gregtech.api.enums.Mods.PamsHarvestTheNether;
import static gregtech.api.enums.Mods.TaintedMagic;
import static gregtech.api.enums.Mods.Thaumcraft;
import static gregtech.api.enums.Mods.ThaumicBases;
import static gregtech.api.enums.Mods.TinkerConstruct;
import static gregtech.api.enums.Mods.TwilightForest;
import static gregtech.api.enums.Mods.Witchery;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

public class SingularityEcosystemRecipes_TreeGrowth {

    public static final Map<Integer, ItemStack[]> EcosystemRecipes_TreeGrowth = new HashMap<>();

    public static void addEcosystemRecipes_TreeGrowth() {
        EcosystemRecipes_TreeGrowth.put(
            836,
            new ItemStack[] {
                // "Oak Sapling"
                getModItem(Minecraft.ID, "log", 1L, 0), // "Oak Log"
                getModItem(Minecraft.ID, "sapling", 1L, 0), // "Oak Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 0), // "Oak Leaves"
                getModItem(Minecraft.ID, "apple", 1L), // Apple

                // "Spruce Sapling"
                getModItem(Minecraft.ID, "log", 1L, 1), // "Spruce Log"
                getModItem(Minecraft.ID, "sapling", 1L, 1), // "Spruce Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 1), // "Spruce Leaves"

                // "Birch Sapling"
                getModItem(Minecraft.ID, "log", 1L, 2), // "Birch Log"
                getModItem(Minecraft.ID, "sapling", 1L, 2), // "Birch Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 2), // "Birch Leaves"

                // "Jungle Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(Minecraft.ID, "sapling", 1L, 3), // "Jungle Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(Minecraft.ID, "dye", 1L, 3), // "Cocoa Beans"

                // "Acacia Sapling"
                getModItem(Minecraft.ID, "log2", 1L, 0), // "Acacia Log"
                getModItem(Minecraft.ID, "sapling", 1L, 4), // "Acacia Sapling"
                getModItem(Minecraft.ID, "leaves2", 1L, 0), // "Acacia Leaves"

                // "Dark Oak Sapling"
                getModItem(Minecraft.ID, "log2", 1L, 1), // "Dark Oak Log"
                getModItem(Minecraft.ID, "sapling", 1L, 5), // "Dark Oak Sapling"
                getModItem(Minecraft.ID, "leaves2", 1L, 1), // "Dark Oak Leaves"
                getModItem(Minecraft.ID, "apple", 1L), // Apple

                // Brown Mushroom
                getModItem(Minecraft.ID, "brown_mushroom_block", 1L), //
                getModItem(Minecraft.ID, "brown_mushroom", 1L), //
                getModItem(EtFuturumRequiem.ID, "brown_mushroom", 1L), //

                // Red Mushroom
                getModItem(Minecraft.ID, "red_mushroom_block", 1L), //
                getModItem(Minecraft.ID, "red_mushroom", 1L), //
                getModItem(EtFuturumRequiem.ID, "red_mushroom", 1L), //

                // "Rubber Tree Sapling"
                getModItem(IndustrialCraft2.ID, "blockRubWood", 1L), // "Rubber Wood"
                getModItem(IndustrialCraft2.ID, "blockRubSapling", 1L), // "Rubber Tree Sapling"
                getModItem(IndustrialCraft2.ID, "blockRubLeaves", 1L), // "Rubber Tree Leaves"
                getModItem(IndustrialCraft2.ID, "itemHarz", 1L), // "Sticky Resin"

                // "Slimy Sapling"
                getModItem(TinkerConstruct.ID, "slime.gel", 1L, 1), // "Congealed Green Slime"
                getModItem(TinkerConstruct.ID, "slime.sapling", 1L, 0), // "Slimy Sapling"
                getModItem(TinkerConstruct.ID, "slime.leaves", 1L, 0), // "Slimy Leaves"
                getModItem(TinkerConstruct.ID, "strangeFood", 1L, 0), // "Gelatinous Slime"

                // "Rainforest Oak Sapling"
                getModItem(GTPlusPlus.ID, "blockRainforestOakLog", 1L), // "Rainforest Oak"
                getModItem(GTPlusPlus.ID, "blockRainforestOakSapling", 1L), // "Rainforest Oak
                // Sapling"
                getModItem(GTPlusPlus.ID, "blockRainforestOakLeaves", 1L), // "Oak Leaves"
                getModItem(Minecraft.ID, "apple", 1L), // Apple

                // "Pine Sapling"
                getModItem(GTPlusPlus.ID, "blockPineLogLog", 1L), // "Pine Log"
                getModItem(GTPlusPlus.ID, "blockPineSapling", 1L), // "Pine Sapling"
                getModItem(GTPlusPlus.ID, "blockPineLeaves", 1L), // "Pine Leaves"
                getModItem(GTPlusPlus.ID, "item.BasicAgrichemItem", 1L, 24), // Pinecone

                // "Sickly Twilight Oak Sapling"
                getModItem(TwilightForest.ID, "tile.TFLog", 1L, 0), // "Twilight Oak Wood"
                getModItem(TwilightForest.ID, "tile.TFSapling", 1L, 0), // "Sickly Twilight Oak
                // Sapling"
                getModItem(TwilightForest.ID, "tile.TFLeaves", 1L, 0), // "Twilight Oak Leaves"

                // "Canopy Tree Sapling"
                getModItem(TwilightForest.ID, "tile.TFLog", 1L, 1), // "Canopy Tree Wood"
                getModItem(TwilightForest.ID, "tile.TFSapling", 1L, 1), // "Canopy Tree Sapling"
                getModItem(TwilightForest.ID, "tile.TFLeaves", 1L, 1), // "Canopy Tree Leaves"

                // "Twilight Mangrove Sapling"
                getModItem(TwilightForest.ID, "tile.TFLog", 1L, 2), // "Mangrove Wood"
                getModItem(TwilightForest.ID, "tile.TFSapling", 1L, 2), // "Twilight Mangrove
                // Sapling"
                getModItem(TwilightForest.ID, "tile.TFLeaves", 1L, 2), // "Mangrove Leaves"

                // "Darkwood Sapling"
                getModItem(TwilightForest.ID, "tile.TFLog", 1L, 3), // "Darkwood Wood"
                getModItem(TwilightForest.ID, "tile.TFSapling", 1L, 3), // "Darkwood Sapling"
                getModItem(TwilightForest.ID, "tile.DarkLeaves", 1L), // "Darkwood Leaves"

                // "Robust Twilight Oak Sapling"
                getModItem(TwilightForest.ID, "tile.TFLog", 1L, 0), // "Twilight Oak Wood"
                getModItem(TwilightForest.ID, "tile.TFSapling", 1L, 4), // "Robust Twilight Oak
                // Sapling"
                getModItem(TwilightForest.ID, "tile.TFLeaves", 1L, 0), // "Twilight Oak Leaves"

                // "Tree of Time Sapling"
                getModItem(TwilightForest.ID, "tile.TFMagicLog", 1L, 0), // Timewood
                getModItem(TwilightForest.ID, "tile.TFSapling", 1L, 5), // "Tree of Time Sapling"
                getModItem(TwilightForest.ID, "tile.TFMagicLeaves", 1L, 0), // "Timewood Leaves"

                // "Tree of Transformation Sapling"
                getModItem(TwilightForest.ID, "tile.TFMagicLog", 1L, 1), // Transwood
                getModItem(TwilightForest.ID, "tile.TFSapling", 1L, 6), // "Tree of Transformation
                // Sapling"
                getModItem(TwilightForest.ID, "tile.TFMagicLeaves", 1L, 1), // "Leaves of
                // Transformation"

                // "Sorting Tree Sapling"
                getModItem(TwilightForest.ID, "tile.TFMagicLog", 1L, 3), // Sortingwood
                getModItem(TwilightForest.ID, "tile.TFSapling", 1L, 8), // "Tree of Time Sapling"
                getModItem(TwilightForest.ID, "tile.TFMagicLeaves", 1L, 3), // "Sorting Leaves"

                // "Rainbow Oak Sapling"
                getModItem(TwilightForest.ID, "tile.TFLog", 1L, 0), // "Twilight Oak Wood"
                getModItem(TwilightForest.ID, "tile.TFSapling", 1L, 9), // "Rainbow Oak Sapling"
                getModItem(TwilightForest.ID, "tile.TFLeaves", 1L, 3), // "Rainbow Oak Leaves"

                // Thorns
                getModItem(TwilightForest.ID, "tile.TFThorns", 1L, 0), // Thorns
                getModItem(TwilightForest.ID, "tile.TFThorns", 1L, 1), // "Green Thorns"
                getModItem(TwilightForest.ID, "tile.TFLeaves3", 1L, 0), // "Thorn Leaves"
                getModItem(TwilightForest.ID, "tile.TFThornRose", 1L), // "Thorn Rose"

                // "Magic Beans"
                getModItem(TwilightForest.ID, "tile.HugeStalk", 1L), // "Huge Stalk"
                getModItem(TwilightForest.ID, "item.magicBeans", 1L), // "Magic Beans"
                getModItem(TwilightForest.ID, "tile.TFLeaves3", 1L, 1), // "Beanstalk Leaves"

                // "Barnarda C Sapling"
                getModItem(GalaxySpace.ID, "barnardaClog", 1L), // "Barnarda C Wood"
                getModItem(GalaxySpace.ID, "barnardaCsapling", 1L), // "Barnarda C Sapling"
                getModItem(GalaxySpace.ID, "barnardaCleaves", 1L), // "Barnarda C Leaves"

                // "Virilig Sapling"
                getModItem(GalacticraftAmunRa.ID, "tile.log1", 1L, 0), // "Virilig Log"
                getModItem(GalacticraftAmunRa.ID, "tile.saplings", 1L, 0), // "Virilig Sapling"
                getModItem(GalacticraftAmunRa.ID, "tile.null", 1L, 0), // "Virilig Leaf"

                // "Lumipod Sapling"
                getModItem(GalacticraftAmunRa.ID, "tile.wood1", 1L, 0), // "Lumipod Bark"
                getModItem(GalacticraftAmunRa.ID, "tile.saplings", 1L, 1), // "Lumipod Sapling"
                getModItem(GalacticraftAmunRa.ID, "tile.wood1", 1L, 1), // "Lumipod Pulp"

                // "Greatwood Sapling"
                getModItem(Thaumcraft.ID, "blockMagicalLog", 1L, 0), // "Greatwood Log"
                getModItem(Thaumcraft.ID, "blockCustomPlant", 1L, 0), // "Greatwood Sapling"
                getModItem(Thaumcraft.ID, "blockMagicalLeaves", 1L, 0), // "Greatwood Leaves"

                // "Silverwood Sapling"
                getModItem(Thaumcraft.ID, "blockMagicalLog", 1L, 1), // "Silverwood Log"
                getModItem(Thaumcraft.ID, "blockCustomPlant", 1L, 1), // "Silverwood Sapling"
                getModItem(Thaumcraft.ID, "blockMagicalLeaves", 1L, 1), // "Silverwood Leaves"

                // "Golden Oak Sapling"
                getModItem(Minecraft.ID, "log", 1L, 0), // "Oak Log"
                getModItem(ThaumicBases.ID, "genLeaves", 1L, 0), // "Golden Oak Leaves"
                getModItem(Thaumcraft.ID, "blockMagicalLeaves", 1L, 0), // "Greatwood Leaves"

                // "Peaceful Sapling"
                getModItem(ThaumicBases.ID, "genLogs", 1L, 0), // "Peaceful Wood"
                getModItem(ThaumicBases.ID, "goldenOakSapling", 1L, 1), // "Peaceful Sapling"
                getModItem(ThaumicBases.ID, "genLeaves", 1L, 1), // "Peaceful Leaves"

                // "Nether Sapling"
                getModItem(ThaumicBases.ID, "genLogs", 1L, 1), // "Nether Wood"
                getModItem(ThaumicBases.ID, "goldenOakSapling", 1L, 2), // "Nether Sapling"
                getModItem(ThaumicBases.ID, "genLeaves", 1L, 2), // "Nether Leaves"

                // "Ender Sapling"
                getModItem(ThaumicBases.ID, "genLogs", 1L, 2), // "Ender Wood"
                getModItem(ThaumicBases.ID, "goldenOakSapling", 1L, 3), // "Ender Sapling"
                getModItem(ThaumicBases.ID, "genLeaves", 1L, 3), // "Ender Leaves"

                // "Warpwood Sapling"
                getModItem(TaintedMagic.ID, "BlockWarpwoodLog", 1L), // Warpwood
                getModItem(TaintedMagic.ID, "BlockWarpwoodSapling", 1L), // "Warpwood Sapling"
                getModItem(TaintedMagic.ID, "BlockWarpwoodLeaves", 1L), // "Warped Leaves"

                // "Tainted Sapling"
                getModItem(ForbiddenMagic.ID, "TaintLog", 1L), // "Tainted Log"
                getModItem(ForbiddenMagic.ID, "TaintSapling", 1L), // "Tainted Sapling"
                getModItem(ForbiddenMagic.ID, "TaintLeaves", 1L), // "Tainted Leaves"
                getModItem(ForbiddenMagic.ID, "TaintFruit", 1L), // "Tainted Fruit"

                // "Rowan Sapling"
                getModItem(Witchery.ID, "witchlog", 1L, 0), // "Rowan Wood"
                getModItem(Witchery.ID, "witchsapling", 1L, 0), // "Rowan Sapling"
                getModItem(Witchery.ID, "witchleaves", 1L, 0), // "Rowan Leaves"
                getModItem(Witchery.ID, "ingredient", 1L), // "Rowan Berries"

                // "Alder Sapling"
                getModItem(Witchery.ID, "witchlog", 1L, 1), // "Alder Wood"
                getModItem(Witchery.ID, "witchsapling", 1L, 1), // "Alder Sapling"
                getModItem(Witchery.ID, "witchleaves", 1L, 1), // "Alder Leaves"

                // "Hawthorn Sapling"
                getModItem(Witchery.ID, "witchlog", 1L, 2), // "Hawthorn Wood"
                getModItem(Witchery.ID, "witchsapling", 1L, 2), // "Hawthorn Sapling"
                getModItem(Witchery.ID, "witchleaves", 1L, 2), // "Hawthorn Leaves"

                // "Redwood Sapling"
                getModItem(Natura.ID, "redwood", 1L, 1), // Redwood
                getModItem(Natura.ID, "florasapling", 1L, 0), // "Redwood Sapling"
                getModItem(Natura.ID, "floraleaves", 1L, 0), // "Redwood Leaves"
                getModItem(Natura.ID, "redwood", 1L, 0), // "Redwood Bark"

                // "Eucalyptus Sapling"
                getModItem(Natura.ID, "tree", 1L, 0), // "Eucalyptus Wood"
                getModItem(Natura.ID, "florasapling", 1L, 1), // "Eucalyptus Sapling"
                getModItem(Natura.ID, "floraleaves", 1L, 1), // "Eucalyptus Leaves"

                // "Hopseed Sapling"
                getModItem(Natura.ID, "tree", 1L, 3), // "Hopseed Wood"
                getModItem(Natura.ID, "florasapling", 1L, 2), // "Hopseed Sapling"
                getModItem(Natura.ID, "floraleaves", 1L, 2), // "Hopseed Leaves"

                // "Sakura Sapling"
                getModItem(Natura.ID, "tree", 1L, 1), // "Sakura Wood"
                getModItem(Natura.ID, "florasapling", 1L, 3), // "Sakura Sapling"
                getModItem(Natura.ID, "floraleavesnocolor", 1L, 0), // "Sakura Leaves"

                // "Ghostwood Sapling"
                getModItem(Natura.ID, "tree", 1L, 2), // Ghostwood
                getModItem(Natura.ID, "florasapling", 1L, 4), // "Ghostwood Sapling"
                getModItem(Natura.ID, "floraleavesnocolor", 1L, 1), // "Ghostwood Leaves"

                // "Blood Sapling"
                getModItem(Natura.ID, "bloodwood", 1L, 0), // Bloodwood
                getModItem(Natura.ID, "florasapling", 1L, 5), // "Blood Sapling"
                getModItem(Natura.ID, "floraleavesnocolor", 1L, 2), // Bloodleaves
                getModItem(Minecraft.ID, "redstone", 1L), // redstone

                // "Darkwood Sapling"
                getModItem(Natura.ID, "Dark Tree", 1L, 0), // Darkwood
                getModItem(Natura.ID, "florasapling", 1L, 6), // "Darkwood Sapling"
                getModItem(Natura.ID, "Dark Leaves", 1L, 0), // "Darkwood Leaves"
                getModItem(Natura.ID, "Natura.netherfood", 1L, 0), // "Potash Apple"

                // "Fusewood Sapling"
                getModItem(Natura.ID, "Dark Tree", 1L, 1), // Fusewood
                getModItem(Natura.ID, "florasapling", 1L, 7), // "Fusewood Sapling"
                getModItem(Natura.ID, "Dark Leaves", 1L, 3), // "Fusewood Leaves"

                // "Maple Sapling"
                getModItem(Natura.ID, "Rare Tree", 1L, 0), // "Maple Wood"
                getModItem(Natura.ID, "Rare Sapling", 1L, 0), // "Maple Sapling"
                getModItem(Natura.ID, "Rare Leaves", 1L, 0), // "Maple Leaves"

                // "Silverbell Sapling"
                getModItem(Natura.ID, "Rare Tree", 1L, 1), // "Silverbell Wood"
                getModItem(Natura.ID, "Rare Sapling", 1L, 1), // "Silverbell Sapling"
                getModItem(Natura.ID, "Rare Leaves", 1L, 1), // "Silverbell Leaves"

                // "Amaranth Sapling"
                getModItem(Natura.ID, "Rare Tree", 1L, 2), // "Amaranth Wood"
                getModItem(Natura.ID, "Rare Sapling", 1L, 2), // "Amaranth Sapling"
                getModItem(Natura.ID, "Rare Leaves", 1L, 2), // "Amaranth Leaves"

                // "Tigerwood Sapling"
                getModItem(Natura.ID, "Rare Tree", 1L, 3), // "Tiger Wood"
                getModItem(Natura.ID, "Rare Sapling", 1L, 3), // "Tigerwood Sapling"
                getModItem(Natura.ID, "Rare Leaves", 1L, 3), // "Tiger Leaves"

                // "Willow Sapling"
                getModItem(Natura.ID, "willow", 1L, 0), // "Willow Wood"
                getModItem(Natura.ID, "Rare Sapling", 1L, 4), // "Willow Sapling"
                getModItem(Natura.ID, "floraleavesnocolor", 1L, 3), // "Willow Leaves"

                // "Green Glowshroom"
                getModItem(Natura.ID, "greenGlowshroom", 1L), // "Green Glowshroom"
                getModItem(Natura.ID, "Glowshroom", 1L, 0), // "Green Glowshroom"

                // "Purple Glowshroom"
                getModItem(Natura.ID, "purpleGlowshroom", 1L), // "Purple Glowshroom"
                getModItem(Natura.ID, "Glowshroom", 1L, 1), // "Purple Glowshroom"

                // "Blue Glowshroom"
                getModItem(Natura.ID, "blueGlowshroom", 1L), // "Blue Glowshroom"
                getModItem(Natura.ID, "Glowshroom", 1L, 2), // "Blue Glowshroom"

                // "Apple Sapling"
                getModItem(Minecraft.ID, "log", 1L, 0), // "Oak Log"
                getModItem(BiomesOPlenty.ID, "saplings", 1L, 0), // "Apple Sapling"
                getModItem(BiomesOPlenty.ID, "appleLeaves", 1L, 0), // "Apple Leaves"
                getModItem(Minecraft.ID, "apple", 1L), // Apple

                // "Yellow Autumn Sapling"
                getModItem(Minecraft.ID, "log", 1L, 2), // "Birch Log"
                getModItem(BiomesOPlenty.ID, "saplings", 1L, 1), // "Yellow Autumn Sapling"
                getModItem(BiomesOPlenty.ID, "leaves1", 1L, 0), // "Yellow Autumn Leaves"
                getModItem(BiomesOPlenty.ID, "food", 1L, 8), // Persimmon

                // "Bamboo Sapling"
                getModItem(BiomesOPlenty.ID, "bamboo", 1L), // Bamboo
                getModItem(BiomesOPlenty.ID, "saplings", 1L, 2), // "Bamboo Sapling"
                getModItem(BiomesOPlenty.ID, "leaves1", 1L, 9), // "Bamboo Leaves"

                // "Magic Sapling"
                getModItem(BiomesOPlenty.ID, "logs2", 1L, 1), // "Magic Wood"
                getModItem(BiomesOPlenty.ID, "saplings", 1L, 3), // "Magic Sapling"
                getModItem(BiomesOPlenty.ID, "leaves1", 1L, 2), // "Magic Leaves"

                // "Dark Sapling"
                getModItem(BiomesOPlenty.ID, "logs1", 1L, 2), // "Dark Wood"
                getModItem(BiomesOPlenty.ID, "saplings", 1L, 4), // "Dark Sapling"
                getModItem(BiomesOPlenty.ID, "leaves1", 1L, 3), // "Dark Leaves"

                // "Dying Sapling"
                getModItem(Minecraft.ID, "log", 1L, 0), // "Oak Log"
                getModItem(BiomesOPlenty.ID, "saplings", 1L, 5), // "Dying Sapling"
                getModItem(BiomesOPlenty.ID, "leaves2", 1L, 0), // "Dying Leaves"
                getModItem(BiomesOPlenty.ID, "food", 1L, 8), // Persimmon

                // "Fir Sapling"
                getModItem(BiomesOPlenty.ID, "logs1", 1L, 3), // "Fir Wood"
                getModItem(BiomesOPlenty.ID, "saplings", 1L, 6), // "Fir Sapling"
                getModItem(BiomesOPlenty.ID, "leaves2", 1L, 1), // "Fir Leaves"
                getModItem(BiomesOPlenty.ID, "misc", 1L, 13), // Pinecone

                // "Ethereal Sapling"
                getModItem(BiomesOPlenty.ID, "logs2", 1L, 0), // "Ethereal Wood"
                getModItem(BiomesOPlenty.ID, "saplings", 1L, 7), // "Ethereal Sapling"
                getModItem(BiomesOPlenty.ID, "leaves2", 1L, 2), // "Ethereal Leaves"

                // "Orange Autumn Sapling"
                getModItem(Minecraft.ID, "log2", 1L, 1), // "Dark Oak Log"
                getModItem(BiomesOPlenty.ID, "saplings", 1L, 8), // "Orange Autumn Sapling"
                getModItem(BiomesOPlenty.ID, "leaves2", 1L, 3), // "Orange Autumn Leaves"

                // "Origin Sapling"
                getModItem(Minecraft.ID, "log", 1L, 0), // "Oak Log"
                getModItem(BiomesOPlenty.ID, "saplings", 1L, 9), // "Origin Sapling"
                getModItem(BiomesOPlenty.ID, "leaves3", 1L, 0), // "Origin Leaves"
                getModItem(BiomesOPlenty.ID, "food", 1L, 8), // Persimmon

                // "Pink Cherry Sapling"
                getModItem(BiomesOPlenty.ID, "logs1", 1L, 1), // "Cherry Wood"
                getModItem(BiomesOPlenty.ID, "saplings", 1L, 10), // "Pink Cherry Sapling"
                getModItem(BiomesOPlenty.ID, "leaves3", 1L, 1), // "Pink Cherry Leaves"

                // "Maple Sapling"
                getModItem(Minecraft.ID, "log", 1L, 0), // "Oak Log"
                getModItem(BiomesOPlenty.ID, "saplings", 1L, 11), // "Maple Sapling"
                getModItem(BiomesOPlenty.ID, "leaves3", 1L, 2), // "Maple Leaves"

                // "White Cherry Sapling"
                getModItem(BiomesOPlenty.ID, "logs1", 1L, 1), // "Cherry Wood"
                getModItem(BiomesOPlenty.ID, "saplings", 1L, 12), // "White Cherry Sapling"
                getModItem(BiomesOPlenty.ID, "leaves3", 1L, 3), // "White Cherry Leaves"

                // "Hellbark Sapling"
                getModItem(BiomesOPlenty.ID, "logs4", 1L, 1), // "Hellbark Wood"
                getModItem(BiomesOPlenty.ID, "saplings", 1L, 13), // "Hellbark Sapling"
                getModItem(BiomesOPlenty.ID, "leaves4", 1L, 0), // "Hellbark Leaves"
                getModItem(BiomesOPlenty.ID, "food", 1L, 8), // Persimmon

                // "Jacaranda Sapling"
                getModItem(BiomesOPlenty.ID, "logs4", 1L, 2), // "Jacaranda Wood"
                getModItem(BiomesOPlenty.ID, "saplings", 1L, 14), // "Jacaranda Sapling"
                getModItem(BiomesOPlenty.ID, "leaves4", 1L, 1), // "Jacaranda Leaves"

                // "Persimmon Sapling"
                getModItem(Minecraft.ID, "log", 1L, 0), // "Oak Log"
                getModItem(BiomesOPlenty.ID, "saplings", 1L, 15), // "Persimmon Sapling"
                getModItem(BiomesOPlenty.ID, "persimmonLeaves", 1L, 0), // "Persimmon Leaves"
                getModItem(BiomesOPlenty.ID, "food", 1L, 8), // Persimmon

                // "Sacred Oak Sapling"
                getModItem(BiomesOPlenty.ID, "logs1", 1L, 0), // "Sacred Oak Wood"
                getModItem(BiomesOPlenty.ID, "colorizedSaplings", 1L, 0), // "Sacred Oak Sapling"
                getModItem(BiomesOPlenty.ID, "colorizedLeaves1", 1L, 0), // "Sacred Oak Leaves"

                // "Mangrove Sapling"
                getModItem(BiomesOPlenty.ID, "logs2", 1L, 2), // "Mangrove Wood"
                getModItem(BiomesOPlenty.ID, "colorizedSaplings", 1L, 1), // "Mangrove Sapling"
                getModItem(BiomesOPlenty.ID, "colorizedLeaves1", 1L, 1), // "Mangrove Leaves"

                // "Palm Sapling"
                getModItem(BiomesOPlenty.ID, "logs2", 1L, 3), // "Palm Wood"
                getModItem(BiomesOPlenty.ID, "colorizedSaplings", 1L, 2), // "Palm Sapling"
                getModItem(BiomesOPlenty.ID, "colorizedLeaves1", 1L, 2), // "Palm Leaves"

                // "Redwood Sapling"
                getModItem(BiomesOPlenty.ID, "logs3", 1L, 0), // "Redwood Wood"
                getModItem(BiomesOPlenty.ID, "colorizedSaplings", 1L, 3), // "Redwood Sapling"
                getModItem(BiomesOPlenty.ID, "colorizedLeaves1", 1L, 3), // "Redwood Leaves"

                // "Willow Sapling"
                getModItem(BiomesOPlenty.ID, "logs3", 1L, 1), // "Willow Wood"
                getModItem(BiomesOPlenty.ID, "colorizedSaplings", 1L, 4), // "Willow Sapling"
                getModItem(BiomesOPlenty.ID, "colorizedLeaves2", 1L, 0), // "Willow Leaves"

                // "Pine Sapling"
                getModItem(BiomesOPlenty.ID, "logs4", 1L, 0), // "Pine Wood"
                getModItem(BiomesOPlenty.ID, "colorizedSaplings", 1L, 5), // "Pine Sapling"
                getModItem(BiomesOPlenty.ID, "colorizedLeaves2", 1L, 1), // "Pine Leaves"

                // "Mahogany Sapling"
                getModItem(BiomesOPlenty.ID, "logs4", 1L, 3), // "Mahogany Wood"
                getModItem(BiomesOPlenty.ID, "colorizedSaplings", 1L, 6), // "Mahogany Sapling"
                getModItem(BiomesOPlenty.ID, "colorizedLeaves2", 1L, 2), // "Mahogany Leaves"

                // "Flowering Oak Sapling"
                getModItem(Minecraft.ID, "log", 1L, 0), // "Oak Log"
                getModItem(BiomesOPlenty.ID, "colorizedSaplings", 1L, 7), // "Flowering Oak Sapling"
                getModItem(BiomesOPlenty.ID, "colorizedLeaves2", 1L, 3), // "Flowering Oak Leaves"

                // Poppy
                getModItem(BiomesOPlenty.ID, "logs3", 1L, 3), // "Giant Flower Stem"
                getModItem(Minecraft.ID, "red_flower", 1L, 0), // Poppy
                getModItem(BiomesOPlenty.ID, "petals", 1L, 0), // "Giant Red Flower"

                // Dandelion
                getModItem(BiomesOPlenty.ID, "logs3", 1L, 3), // "Giant Flower Stem"
                getModItem(Minecraft.ID, "yellow_flower", 1L, 0), // Dandelion
                getModItem(BiomesOPlenty.ID, "petals", 1L, 1), // "Giant Yellow Flower"

                // "Apple Sapling"
                getModItem(Minecraft.ID, "log", 1L, 0), // "Oak Log"
                getModItem(PamsHarvestCraft.ID, "pamappleSapling", 1L), // "Apple Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 0), // "Oak Leaves"
                getModItem(Minecraft.ID, "apple", 1L), // Apple

                // "Almond Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pamalmondSapling", 1L), // "Almond Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "almondItem", 1L), // Almond

                // "Apricot Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pamapricotSapling", 1L), // "Apricot Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "apricotItem", 1L), // Apricot

                // "Avocado Sapling"
                getModItem(Minecraft.ID, "log", 1L, 0), // "Oak Log"
                getModItem(PamsHarvestCraft.ID, "pamavocadoSapling", 1L), // "Avocado Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 0), // "Oak Leaves"
                getModItem(PamsHarvestCraft.ID, "avocadoItem", 1L), // Avocado

                // "Banana Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pambananaSapling", 1L), // "Banana Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "bananaItem", 1L), // Banana

                // "Cashew Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pamcashewSapling", 1L), // "Cashew Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "cashewItem", 1L), // Cashew

                // "Cherry Sapling"
                getModItem(Minecraft.ID, "log", 1L, 0), // "Oak Log"
                getModItem(PamsHarvestCraft.ID, "pamcherrySapling", 1L), // "Cherry Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 0), // "Oak Leaves"
                getModItem(PamsHarvestCraft.ID, "cherryItem", 1L), // Cherry

                // "Chestnut Sapling"
                getModItem(Minecraft.ID, "log", 1L, 0), // "Oak Log"
                getModItem(PamsHarvestCraft.ID, "pamchestnutSapling", 1L), // "Chestnut Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 0), // "Oak Leaves"
                getModItem(PamsHarvestCraft.ID, "chestnutItem", 1L), // Chestnut

                // "Cinnamon Sapling"
                getModItem(PamsHarvestCraft.ID, "pamCinnamon", 1L), // "Cinnamon Wood"
                getModItem(PamsHarvestCraft.ID, "pamcinnamonSapling", 1L), // "Cinnamon Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "cinnamonItem", 1L), // Cinnamon

                // "Coconut Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pamcoconutSapling", 1L), // "Coconut Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "coconutItem", 1L), // Coconut

                // "Date Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pamdateSapling", 1L), // "Date Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "dateItem", 1L), // Date

                // "Dragonfruit Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pamdragonfruitSapling", 1L), // "Dragonfruit
                // Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "dragonfruitItem", 1L), // Dragonfruit

                // "Durian Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pamdurianSapling", 1L), // "Durian Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "durianItem", 1L), // Durian

                // "Fig Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pamfigSapling", 1L), // "Fig Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "figItem", 1L), // Fig

                // "Grapefruit Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pamgrapefruitSapling", 1L), // "Grapefruit Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "grapefruitItem", 1L), // Grapefruit

                // "Lemon Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pamlemonSapling", 1L), // "Lemon Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "lemonItem", 1L), // Lemon

                // "Lime Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pamlimeSapling", 1L), // "Lime Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "limeItem", 1L), // Lime

                // "Maple Sapling"
                getModItem(PamsHarvestCraft.ID, "pamMaple", 1L, 3), // "Maple Wood"
                getModItem(PamsHarvestCraft.ID, "pammapleSapling", 1L), // "Maple Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 1), // "Spruce Leaves"
                getModItem(PamsHarvestCraft.ID, "maplesyrupItem", 1L), // "Maple Syrup"

                // "Mango Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pammangoSapling", 1L), // "Mango Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "mangoItem", 1L), // Mango

                // "Nutmeg Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pamnutmegSapling", 1L), // "Nutmeg Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "nutmegItem", 1L), // Nutmeg

                // "Olive Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pamoliveSapling", 1L), // "Olive Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "oliveItem", 1L), // Olive

                // "Orange Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pamorangeSapling", 1L), // "Orange Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "orangeItem", 1L), // Orange

                // "Papaya Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pampapayaSapling", 1L), // "Papaya Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "papayaItem", 1L), // Papaya

                // "Paperbark Sapling"
                getModItem(PamsHarvestCraft.ID, "pamPaperbark", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pampaperbarkSapling", 1L), // "Paperbark Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(Minecraft.ID, "paper", 1L), // Paper

                // "Peach Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pampeachSapling", 1L), // "Peach Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "peachItem", 1L), // Peach

                // "Pear Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pampearSapling", 1L), // "Pear Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "pearItem", 1L), // Pear

                // "Pecan Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pampecanSapling", 1L), // "Pecan Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "pecanItem", 1L), // Pecan

                // "Peppercorn Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pampeppercornSapling", 1L), // "Peppercorn Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "peppercornItem", 1L), // Peppercorn

                // "Persimmon Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pampersimmonSapling", 1L), // "Persimmon Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "persimmonItem", 1L), // Persimmon

                // "Pistachio Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pampistachioSapling", 1L), // "Pistachio Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "pistachioItem", 1L), // Pistachio

                // "Plum Sapling"
                getModItem(Minecraft.ID, "log", 1L, 0), // "Oak Log"
                getModItem(PamsHarvestCraft.ID, "pamplumSapling", 1L), // "Plum Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 0), // "Oak Leaves"
                getModItem(PamsHarvestCraft.ID, "plumItem", 1L), // Plum

                // "Pomegranate Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pampomegranateSapling", 1L), // "Pomegranate
                // Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "pomegranateItem", 1L), // Pomegranate

                // "Starfruit Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pamstarfruitSapling", 1L), // "Starfruit Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "starfruitItem", 1L), // Starfruit

                // "Vanilla Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pamvanillabeanSapling", 1L), // "Vanilla Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "vanillabeanItem", 1L), // "Vanilla Bean"

                // "Walnut Sapling"
                getModItem(Minecraft.ID, "log", 1L, 0), // "Oak Log"
                getModItem(PamsHarvestCraft.ID, "pamwalnutSapling", 1L), // "Walnut Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 0), // "Oak Leaves"
                getModItem(PamsHarvestCraft.ID, "walnutItem", 1L), // Walnut

                // "Gooseberry Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(PamsHarvestCraft.ID, "pamgooseberrySapling", 1L), // "Gooseberry Sapling"
                getModItem(Minecraft.ID, "leaves", 1L, 3), // "Jungle Leaves"
                getModItem(PamsHarvestCraft.ID, "gooseberryItem", 1L), // Gooseberry

                // "Ignis Fruit Sapling"
                getModItem(PamsHarvestTheNether.ID, "netherLog", 1L), // "Nether Log"
                getModItem(PamsHarvestTheNether.ID, "netherSapling", 1L), // "Ignis Fruit Sapling"
                getModItem(PamsHarvestTheNether.ID, "netherLeaves", 1L), // "Nether Leaves"
                getModItem(PamsHarvestTheNether.ID, "ignisfruitItem", 1L), // "Ignis Fruit"

                // "Cherry Sapling"
                getModItem(EtFuturumRequiem.ID, "cherry_log", 1L, 0), // "Cherry Log"
                getModItem(EtFuturumRequiem.ID, "sapling", 1L, 1), // "Cherry Sapling"
                getModItem(EtFuturumRequiem.ID, "leaves", 1L, 1), // "Cherry Leaves"
                getModItem(PamsHarvestCraft.ID, "cherryItem", 1L), // Cherry

                // "Chorus Flower"
                getModItem(EtFuturumRequiem.ID, "chorus_plant", 1L), // "Chorus Plant"
                getModItem(EtFuturumRequiem.ID, "chorus_flower", 1L), // "Chorus Flower"
                getModItem(EtFuturumRequiem.ID, "chorus_fruit", 1L), // "Chorus Fruit"

                // "Apple Oak Sapling"
                getModItem(Minecraft.ID, "log", 1L, 0), // "Oak Log"
                getModItem(Minecraft.ID, "apple", 1L), // Apple

                // "Dark Oak Sapling"
                getModItem(Minecraft.ID, "log2", 1L, 1), // "Dark Oak Log"

                // "Silver Birch Sapling"
                getModItem(Minecraft.ID, "log", 1L, 2), // "Birch Log"

                // "Silver Lime Sapling"
                getModItem(Forestry.ID, "logs", 1L, 3), // "Lime Wood"

                // "Common Walnut Sapling"
                getModItem(Forestry.ID, "logs", 1L, 13), // "Walnut Wood"
                getModItem(Forestry.ID, "fruits", 1L, 1), // Walnut

                // "Sweet Chestnut Sapling"
                getModItem(Forestry.ID, "logs", 1L, 4), // "Chestnut Wood"
                getModItem(Forestry.ID, "fruits", 1L, 2), // Chestnut

                // "Hill Cherry Sapling"
                getModItem(Forestry.ID, "logs", 1L, 15), // "Cherry Wood"
                getModItem(Forestry.ID, "fruits", 1L, 0), // Cherry

                // "Lemon Sapling"
                getModItem(Forestry.ID, "logs", 1L, 23), // "Citrus Wood"
                getModItem(Forestry.ID, "fruits", 1L, 3), // Lemon

                // "Plum Sapling"
                getModItem(Forestry.ID, "logs", 1L, 21), // "Plum Wood"
                getModItem(Forestry.ID, "fruits", 1L, 4), // Plum

                // "Sugar Maple Sapling"
                getModItem(Forestry.ID, "logs", 1L, 22), // "Maple Wood"

                // "Red Spruce Sapling"
                getModItem(Minecraft.ID, "log", 1L, 1), // "Spruce Log"

                // "Mundane Larch Sapling"
                getModItem(Forestry.ID, "logs", 1L, 0), // "Larch Wood"

                // "Bull Pine Sapling"
                getModItem(Forestry.ID, "logs", 1L, 20), // "Pine Wood"

                // "Coast Sequoia Sapling"
                getModItem(Forestry.ID, "logs", 1L, 7), // "Sequoia Wood"

                // "Giant Sequoia Sapling"
                getModItem(Forestry.ID, "logs", 1L, 24), // "Giant Sequoia Sapling"

                // "Jungle Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"

                // "Teak Sapling"
                getModItem(Forestry.ID, "logs", 1L, 1), // "Teak Wood"

                // "Ipe Sapling"
                getModItem(Forestry.ID, "logs", 1L, 25), // "Ipe Wood"

                // "Kapok Sapling"
                getModItem(Forestry.ID, "logs", 1L, 8), // "Kapok Wood"

                // "Myrtle Ebony Sapling"
                getModItem(Forestry.ID, "logs", 1L, 9), // "Ebony Wood"

                // "Zebrawood Sapling"
                getModItem(Forestry.ID, "logs", 1L, 28), // "Zebrawood Wood"

                // "Yellow Meranti Sapling"
                getModItem(Forestry.ID, "logs", 1L, 10), // "Mahogany Wood"

                // "Acacia Sapling"
                getModItem(Minecraft.ID, "log2", 1L, 0), // "Acacia Log"

                // "Desert Acacia Sapling"
                getModItem(Forestry.ID, "logs", 1L, 2), // "Desert Acacia Wood"

                // "Padauk Sapling"
                getModItem(Forestry.ID, "logs", 1L, 26), // "Padauk Wood"

                // "Balsa Sapling"
                getModItem(Forestry.ID, "logs", 1L, 11), // "Balsa Wood"

                // "Cocobolo Sapling"
                getModItem(Forestry.ID, "logs", 1L, 27), // "Cocobolo Wood"

                // "Wenge Sapling"
                getModItem(Forestry.ID, "logs", 1L, 5), // "Wenge Wood"

                // "Grandidier's Baobab Sapling"
                getModItem(Forestry.ID, "logs", 1L, 6), // "Baobab Wood"

                // "Blue Mahoe Sapling"
                getModItem(Forestry.ID, "logs", 1L, 16), // "Mahoe Wood"

                // "White Willow Sapling"
                getModItem(Forestry.ID, "logs", 1L, 12), // "Willow Wood"

                // "Sipiri Sapling"
                getModItem(Forestry.ID, "logs", 1L, 14), // "Greenheart Wood"

                // "Papaya Sapling"
                getModItem(Forestry.ID, "logs", 1L, 19), // "Papaya Wood"

                // "Date Palm Sapling"
                getModItem(Forestry.ID, "logs", 1L, 18), // "Palm Wood"

                // "White Poplar Sapling"
                getModItem(Forestry.ID, "logs", 1L, 17), // "Poplar Wood"

                // "Orchard Apple Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 0), // "Apple Wood"
                getModItem(Minecraft.ID, "apple", 1L), // Apple

                // "Sweet Crabapple Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 0), // "Apple Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 0), // Crabapple

                // "Blackthorn Sapling"
                getModItem(Forestry.ID, "logs", 1L, 21), // "Plum Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 7), // Blackthorn

                // "Cherry Plum Sapling"
                getModItem(Forestry.ID, "logs", 1L, 21), // "Plum Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 8), // "Cherry Plum"

                // "Peach Sapling"
                getModItem(Forestry.ID, "logs", 1L, 21), // "Plum Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 12), // Peach

                // "Nectarine Sapling"
                getModItem(Forestry.ID, "logs", 1L, 21), // "Plum Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 19), // Nectarine

                // "Apricot Sapling"
                getModItem(Forestry.ID, "logs", 1L, 21), // "Plum Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 10), // Apricot

                // "Almond Sapling"
                getModItem(Forestry.ID, "logs", 1L, 21), // "Plum Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 9), // Almond

                // "Wild Cherry Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 3), // "Cherry Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 4), // Almond

                // "Sour Cherry Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 3), // "Cherry Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 5), // "Sour Cherry"

                // "Black Cherry Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 3), // "Cherry Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 6), // "Black Cherry"

                // "Orange Sapling"
                getModItem(Forestry.ID, "logs", 1L, 23), // "Citrus Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 1), // Orange

                // "Manderine Sapling"
                getModItem(Forestry.ID, "logs", 1L, 23), // "Citrus Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 18), // Manderin

                // "Satsuma Sapling"
                getModItem(Forestry.ID, "logs", 1L, 23), // "Citrus Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 13), // Satsuma

                // "Tangerine Sapling"
                getModItem(Forestry.ID, "logs", 1L, 23), // "Citrus Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 21), // Tangerine

                // "Lime Sapling"
                getModItem(Forestry.ID, "logs", 1L, 23), // "Citrus Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 3), // Lime

                // "Key Lime Sapling"
                getModItem(Forestry.ID, "logs", 1L, 23), // "Citrus Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 17), // "Key Lime"

                // "Finger Lime Sapling"
                getModItem(Forestry.ID, "logs", 1L, 23), // "Citrus Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 16), // "Finger Lime"

                // "Pomelo Sapling"
                getModItem(Forestry.ID, "logs", 1L, 23), // "Citrus Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 20), // Pomelo

                // "Grapefruit Sapling"
                getModItem(Forestry.ID, "logs", 1L, 23), // "Citrus Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 11), // Grapefruit

                // "Kumquat Sapling"
                getModItem(Forestry.ID, "logs", 1L, 23), // "Citrus Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 2), // Kumquat

                // "Citron Sapling"
                getModItem(Forestry.ID, "logs", 1L, 23), // "Citrus Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 15), // Citron

                // "Buddha's Hand Sapling"
                getModItem(Forestry.ID, "logs", 1L, 23), // "Citrus Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 14), // "Buddhas Hand"

                // "Banana Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 11), // "Banana Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 28), // Banana

                // "Red Banana Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 11), // "Banana Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 29), // "Red Banana"

                // "Plantain Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 11), // "Banana Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 30), // Plantain

                // "Butternut Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 2), // "Butternut Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 25), // Butternut

                // "Common Rowan Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 5), // "Rowan Wood"

                // "Western Hemlock Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 5), // "Rowan Wood"

                // "Common Ash Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 7), // "Ash Wood"
                getModItem(Minecraft.ID, "apple", 1L), // Apple

                // "Common Alder Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 8), // "Alder Wood"
                getModItem(Minecraft.ID, "apple", 1L), // Apple

                // "Common Beech Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 9), // "Beech Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 26), // Beechnut

                // "Copper Beech Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 9), // "Beech Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 26), // Beechnut

                // "Aspen Sapling"
                getModItem(Forestry.ID, "logs", 1L, 17), // "Poplar Wood"
                getModItem(Minecraft.ID, "apple", 1L), // Apple

                // "Common Yew Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 12), // "Yew Wood"

                // "Lawson Cypress Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 13), // "Cypress Wood"

                // "Douglas-fir Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 14), // "Fir Wood"

                // "Common Hazel Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 15), // "Hazel Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 24), // Hazelnut

                // "Sycamore Fig Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 1), // "Fig Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 32), // Fig

                // "Whitebeam Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 4), // "Whitebeam Wood"
                getModItem(Minecraft.ID, "apple", 1L), // Apple

                // "Common Hawthorn Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 10), // "Hawthorn Wood"

                // "Pecan Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 16), // "Hickory Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 27), // "Pecan Nut"

                // "Common Elm Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 17), // "Elm Wood"
                getModItem(Minecraft.ID, "apple", 1L), // Apple

                // "Elderberry Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 16), // "Hickory Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 34), // Elderberry

                // "Common Holly Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 19), // "Holly Wood"
                getModItem(Minecraft.ID, "apple", 1L), // Apple

                // "Common Hornbeam Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 20), // "Hornbeam Wood"

                // "Great Sallow Sapling"
                getModItem(Forestry.ID, "logs", 1L, 12), // "Willow Wood"
                getModItem(Minecraft.ID, "apple", 1L), // Apple

                // "Acorn Oak Sapling"
                getModItem(Minecraft.ID, "log", 1L, 0), // "Oak Log"
                getModItem(ExtraTrees.ID, "food", 1L, 33), // Acorn

                // "Silver Fir Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 14), // "Fir Wood"

                // "Great Cedar Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 21), // "Cedar Wood"

                // "Olive Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 22), // "Olive Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 35), // Olive

                // "Red Maple Sapling"
                getModItem(Forestry.ID, "logs", 1L, 22), // "Maple Wood"
                getModItem(Minecraft.ID, "apple", 1L), // Apple

                // "Balsam Fir Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 14), // "Fir Wood"

                // "Loblolly Pine Sapling"
                getModItem(Forestry.ID, "logs", 1L, 20), // "Pine Wood"

                // "Sweetgum Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 23), // "Sweetgum Wood"

                // "Black Locust Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 24), // "Locust Wood"

                // "Cultivated Pear Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 25), // "Pear Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 22), // Pear

                // "Osange-Orange Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 26), // "Maclura Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 38), // "Osange Orange"

                // "Old Fustic Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 26), // "Maclura Wood"

                // "Brazilwood Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 27), // "Brazilwood Wood"

                // "Logwood Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 28), // "Logwood Wood"

                // "Rosewood Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 29), // "Rosewood Wood"

                // "Purpleheart Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 30), // "Purpleheart Wood"

                // "Iroko Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 31), // "Iroko Wood"

                // "Ginkgo Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 32), // "Gingko Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 36), // "Gingko Nut"

                // "Brazil Nut Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(ExtraTrees.ID, "food", 1L, 31), // "Brazil Nut"

                // "Rose Gum Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 33), // "Eucalyptus Wood"

                // "Swamp Gum Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 34), // "Eucalyptus Wood"

                // "Boxwood Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 35), // "Box Wood"
                getModItem(Minecraft.ID, "apple", 1L), // Apple

                // "Clove Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 36), // "Syzgium Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 39), // Clove

                // "Coffee Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(ExtraTrees.ID, "food", 1L, 37), // Coffee

                // "Monkey Puzzle Sapling"
                getModItem(Forestry.ID, "logs", 1L, 20), // "Pine Wood"

                // "Rainbow Gum Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 37), // "Eucalyptus Wood"

                // "Pink Ivory Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 39), // "Pink Ivory Wood"

                // "Blackcurrant Sapling"
                getModItem(ExtraTrees.ID, "food", 1L, 41), // Blackcurrant

                // "Redcurrant Sapling"
                getModItem(ExtraTrees.ID, "food", 1L, 42), // Redcurrant

                // "Blackberry Sapling"
                getModItem(ExtraTrees.ID, "food", 1L, 43), // Blackberry

                // "Raspberry Sapling"
                getModItem(ExtraTrees.ID, "food", 1L, 44), // Raspberry

                // "Blueberry Sapling"
                getModItem(ExtraTrees.ID, "food", 1L, 45), // Blueberry

                // "Cranberry Sapling"
                getModItem(ExtraTrees.ID, "food", 1L, 46), // Cranberry

                // "Juniper Sapling"
                getModItem(ExtraTrees.ID, "food", 1L, 47), // Juniper

                // "Gooseberry Sapling"
                getModItem(ExtraTrees.ID, "food", 1L, 48), // Gooseberry

                // "Golden Raspberry Sapling"
                getModItem(ExtraTrees.ID, "food", 1L, 49), // "Golden Raspberry"

                // "Cinnamon Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 38), // "Cinnamon Wood"

                // "Coconut Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(ExtraTrees.ID, "food", 1L, 50), // Coconut

                // "Cashew Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(ExtraTrees.ID, "food", 1L, 51), // Cashew

                // "Avacado Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(ExtraTrees.ID, "food", 1L, 52), // Avacado

                // "Nutmeg Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(ExtraTrees.ID, "food", 1L, 53), // Nutmeg

                // "Allspice Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(ExtraTrees.ID, "food", 1L, 54), // Allspice

                // "Chilli Pepper Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(ExtraTrees.ID, "food", 1L, 55), // Chilli

                // "Star Anise Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(ExtraTrees.ID, "food", 1L, 56), // "Star Anise"

                // "Mango Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(ExtraTrees.ID, "food", 1L, 57), // Mango

                // "Starfruit Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(ExtraTrees.ID, "food", 1L, 58), // Starfruit

                // "Candlenut Sapling"
                getModItem(Minecraft.ID, "log", 1L, 3), // "Jungle Log"
                getModItem(ExtraTrees.ID, "food", 1L, 59), // Candlenut

                // "Dwarf Hazel Sapling"
                getModItem(ExtraTrees.ID, "log", 1L, 15), // "Hazel Wood"
                getModItem(ExtraTrees.ID, "food", 1L, 24) // Hazelnut
            });
    }
}
