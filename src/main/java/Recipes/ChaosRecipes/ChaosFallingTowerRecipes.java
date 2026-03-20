package Recipes.ChaosRecipes;

import static gregtech.api.enums.Mods.AppliedEnergistics2;
import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.BiomesOPlenty;
import static gregtech.api.enums.Mods.BloodArsenal;
import static gregtech.api.enums.Mods.Botania;
import static gregtech.api.enums.Mods.Chisel;
import static gregtech.api.enums.Mods.EtFuturumRequiem;
import static gregtech.api.enums.Mods.ExtraBees;
import static gregtech.api.enums.Mods.ExtraUtilities;
import static gregtech.api.enums.Mods.Forestry;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GalacticraftAmunRa;
import static gregtech.api.enums.Mods.GalacticraftCore;
import static gregtech.api.enums.Mods.GalacticraftMars;
import static gregtech.api.enums.Mods.GalaxySpace;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.HardcoreEnderExpansion;
import static gregtech.api.enums.Mods.IndustrialCraft2;
import static gregtech.api.enums.Mods.KubaTech;
import static gregtech.api.enums.Mods.MagicBees;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.Mods.NewHorizonsCoreMod;
import static gregtech.api.enums.Mods.PamsHarvestCraft;
import static gregtech.api.enums.Mods.Railcraft;
import static gregtech.api.enums.Mods.Thaumcraft;
import static gregtech.api.enums.Mods.TwilightForest;
import static gregtech.api.enums.Mods.UniversalSingularities;
import static gregtech.api.enums.Mods.ZTones;
import static gregtech.api.enums.TierEU.RECIPE_MV;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;
import static util.Utils.setStackSize;

import net.minecraftforge.fluids.FluidRegistry;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.FallingTowerOfChaosFrontend;

public class ChaosFallingTowerRecipes {

    public static int NEI_ItemOutput_Size = 27;

    public static final RecipeMap<RecipeMapBackend> addChaosFallingTowerRecipes = RecipeMapBuilder
        .of("Chaos of Falling Tower")
        .maxIO(1, NEI_ItemOutput_Size, 1, 0)
        .minInputs(1, 1)
        .neiHandlerInfo(builder -> builder.setHeight(165))
        .frontend(FallingTowerOfChaosFrontend::new)
        .build();

    public static void addChaosFallingTowerRecipes() {
        GTValues.RA.stdBuilder()
            .itemInputs(
                // Melon
                getModItem(Minecraft.ID, "melon_block", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 123_456))
            .itemOutputs(
                // "White Stained Glass"
                setStackSize(getModItem(Minecraft.ID, "stained_glass", 1L, 0), 161),
                // "Orange Stained Glass"
                setStackSize(getModItem(Minecraft.ID, "stained_glass", 1L, 1), 161),
                // "Magenta Stained Glass"
                setStackSize(getModItem(Minecraft.ID, "stained_glass", 1L, 2), 161),
                // "Light Blue Stained Glass"
                setStackSize(getModItem(Minecraft.ID, "stained_glass", 1L, 3), 161),
                // "Yellow Stained Glass"
                setStackSize(getModItem(Minecraft.ID, "stained_glass", 1L, 4), 161),
                // "Lime Stained Glass"
                setStackSize(getModItem(Minecraft.ID, "stained_glass", 1L, 5), 161),
                // "Pink Stained Glass"
                setStackSize(getModItem(Minecraft.ID, "stained_glass", 1L, 6), 161),
                // "Gray Stained Glass"
                setStackSize(getModItem(Minecraft.ID, "stained_glass", 1L, 7), 161),
                // "Light Gray Stained Glass"
                setStackSize(getModItem(Minecraft.ID, "stained_glass", 1L, 8), 161),
                // "Cyan Stained Glass"
                setStackSize(getModItem(Minecraft.ID, "stained_glass", 1L, 9), 161),
                // "Purple Stained Glass"
                setStackSize(getModItem(Minecraft.ID, "stained_glass", 1L, 10), 161),
                // "Blue Stained Glass"
                setStackSize(getModItem(Minecraft.ID, "stained_glass", 1L, 11), 161),
                // "Brown Stained Glass"
                setStackSize(getModItem(Minecraft.ID, "stained_glass", 1L, 12), 161),
                // "Green Stained Glass"
                setStackSize(getModItem(Minecraft.ID, "stained_glass", 1L, 13), 161),
                // "Red Stained Glass"
                setStackSize(getModItem(Minecraft.ID, "stained_glass", 1L, 14), 161),
                // "Black Stained Glass"
                setStackSize(getModItem(Minecraft.ID, "stained_glass", 1L, 15), 161))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Amethyst Cluster"
                getModItem(EtFuturumRequiem.ID, "amethyst_cluster_2", 1L, 6))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 234_567))
            .itemOutputs(
                // "Amethyst Block"
                setStackSize(getModItem(EtFuturumRequiem.ID, "amethyst_block", 1L), 8242),
                // Calcite
                setStackSize(getModItem(EtFuturumRequiem.ID, "calcite", 1L), 7808),
                // Deepslate
                setStackSize(getModItem(EtFuturumRequiem.ID, "deepslate", 1L), 6941),
                // Blackstone
                setStackSize(getModItem(EtFuturumRequiem.ID, "blackstone", 1L, 0), 6941),
                // "Bone Block"
                setStackSize(getModItem(EtFuturumRequiem.ID, "bone", 1L), 3471),
                // "Ender Amethyst Ore"
                setStackSize(getModItem(BiomesOPlenty.ID, "gemOre", 1L, 0), 2169),
                // "Gilded Blackstone"
                setStackSize(getModItem(EtFuturumRequiem.ID, "gilded_blackstone", 1L), 1736),
                // "Infested Cobblestone"
                setStackSize(getModItem(Minecraft.ID, "monster_egg", 1L, 1), 868),
                // Tuff
                setStackSize(getModItem(EtFuturumRequiem.ID, "tuff", 1L, 0), 9543))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Blue Ice"
                getModItem(EtFuturumRequiem.ID, "blue_ice", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 275_000))
            .itemOutputs(
                // Ice
                setStackSize(getModItem(Minecraft.ID, "ice", 1L), 6838),
                // "Packed Ice"
                setStackSize(getModItem(Minecraft.ID, "packed_ice", 1L), 6458),
                // "Hardened Ice"
                setStackSize(getModItem(BiomesOPlenty.ID, "hardIce", 1L), 6078),
                // "Blue Ice"
                setStackSize(getModItem(EtFuturumRequiem.ID, "blue_ice", 1L), 5698),
                // Snow
                setStackSize(getModItem(Minecraft.ID, "snow", 1L), 3799),
                // "Magma Block"
                setStackSize(getModItem(EtFuturumRequiem.ID, "magma", 1L), 7218))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Emitter (LV)"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32680))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 300_000))
            .itemOutputs(
                // "Copper Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3035), 3507),
                // "Cassiterite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3824), 1228),
                // "Tantalite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3921), 1053),
                // "Mica Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3901), 1053),
                // "Calcite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3823), 1053),
                // "Vanadium Magnetite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3923), 1053),
                // "Salt Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3817), 877),
                // "Rock Salt Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3944), 877),
                // "Sphalerite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3839), 877),
                // "Silver Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3054), 877),
                // "Gold Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3086), 877),
                // "Lead Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3089), 702),
                // "Asbestos Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3946), 351),
                // "Soapstone Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3877), 351),
                // "Tin Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3057), 351),
                // "Nickel Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3034), 264),
                // "Iron Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3032), 88),
                // "Black Granite"
                setStackSize(getModItem(GregTech.ID, "gt.blockgranites", 1L, 0), 3387))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Sensor (LV)"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32690))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 300_000))
            .itemOutputs(
                // "Oilsands Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3878), 2629),
                // "Cinnabar Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3826), 2629),
                // "Silver Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3054), 1972),
                // "Calcite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3823), 1753),
                // "Vanadium Magnetite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3923), 1753),
                // "Redstone Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3810), 1753),
                // "Copper Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3035), 1643),
                // "Lepidolite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3907), 1534),
                // "Sphalerite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3839), 1534),
                // "Nickel Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3034), 1205),
                // "Mica Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3901), 1096),
                // "Asbestos Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3946), 1096),
                // "Pollucite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3919), 548),
                // "Salt Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3817), 439),
                // "Rock Salt Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3944), 439),
                // "Black Granite"
                setStackSize(getModItem(GregTech.ID, "gt.blockgranites", 1L, 0), 4509))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Exquisite Diamond"
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30500))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 420_000))
            .itemOutputs(
                // "Graphite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3865), 5153),
                // "Coal Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3535), 2062),
                // "Diamond Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3500), 516),
                // "Black Granite"
                setStackSize(getModItem(GregTech.ID, "gt.blockgranites", 1L, 0), 2577))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "End Stone"
                getModItem(Minecraft.ID, "end_stone", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 500_000))
            .itemOutputs(
                // "End Powder Ore"
                setStackSize(getModItem(HardcoreEnderExpansion.ID, "end_powder_ore", 1L), 783),
                // "Stardust Ore"
                setStackSize(getModItem(HardcoreEnderExpansion.ID, "stardust_ore", 1L), 392),
                // "Igneous Rock Ore"
                setStackSize(getModItem(HardcoreEnderExpansion.ID, "igneous_rock_ore", 1L), 392),
                // "Endium Ore"
                setStackSize(getModItem(HardcoreEnderExpansion.ID, "endium_ore", 1L), 392),
                // "Instability Orb Ore"
                setStackSize(getModItem(HardcoreEnderExpansion.ID, "instability_orb_ore", 1L), 8),
                // "Black Granite"
                setStackSize(getModItem(Minecraft.ID, "end_stone", 1L), 6218))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Firestone Lens"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 24347))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 500_000))
            .itemOutputs(
                // "Diamond Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3500), 732),
                // "Emerald Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3501), 366),
                // "Ruby Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3502), 366),
                // "Lapis Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3526), 366),
                // "Lazurite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3524), 366),
                // "Sapphire Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3503), 183),
                // "Green Sapphire Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3504), 183),
                // "Olivine Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3505), 183),
                // "Topaz Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3507), 183),
                // "Tanzanite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3508), 183),
                // "Amethyst Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3509), 183),
                // "Opal Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3510), 183),
                // "Jasper Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3511), 183),
                // "Blue Topaz Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3513), 183),
                // "Red Garnet Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3527), 183),
                // "Yellow Garnet Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3528), 183),
                // "Jade Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3537), 183),
                // "Vinteum Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3529), 183),
                // "Nether Star Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3506), 8),
                // "Black Granite"
                setStackSize(getModItem(GregTech.ID, "gt.blockgranites", 1L, 0), 3600))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Sensor (HV)"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32692))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 500_000))
            .itemOutputs(
                // "Bastnasite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3905), 1058),
                // "Molybdenum Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3048), 740),
                // "Desh Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3884), 635),
                // "Chromite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3825), 529),
                // "Pyrochlore Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3607), 529),
                // "Neodymium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3067), 529),
                // "Barite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3904), 529),
                // "Thorium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3096), 529),
                // "Uraninite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3922), 529),
                // Pitchblende
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3873), 529),
                // "Draconium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3975), 529),
                // "Electrotine Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3812), 529),
                // "Oriharukon Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3393), 529),
                // "Arsenic Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3039), 529),
                // "Bismuth Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3090), 529),
                // "Antimony Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3058), 529),
                // "Antimony Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3520), 318),
                // "Uranium 238 Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3098), 318),
                // "Certus Quartz Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3516), 265),
                // "Meteoric Iron Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3340), 106))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Heavy Duty Alloy Ingot T1"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32462))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 500_000))
            .itemOutputs(
                // "Moon Rock"
                setStackSize(getModItem(GalacticraftCore.ID, "tile.moonBlock", 1L, 4), 30674),
                // "Moon Dirt"
                setStackSize(getModItem(GalacticraftCore.ID, "tile.moonBlock", 1L, 3), 3609),
                // "Moon Turf"
                setStackSize(getModItem(GalacticraftCore.ID, "tile.moonBlock", 1L, 5), 1805))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Maddening Frame of Frenzy"
                getModItem(MagicBees.ID, "item.frenziedFrame", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 500_666))
            .itemOutputs(
                // "Honey Block"
                setStackSize(getModItem(EtFuturumRequiem.ID, "honey_block", 1L), 232),
                // "Hive Block"
                setStackSize(getModItem(BiomesOPlenty.ID, "hive", 1L, 1), 221),
                // "Water Hive"
                setStackSize(getModItem(ExtraBees.ID, "hive", 1L, 0), 93),
                // "Rock Hive"
                setStackSize(getModItem(ExtraBees.ID, "hive", 1L, 1), 93),
                // "Forest Hive"
                setStackSize(getModItem(Forestry.ID, "beehives", 1L, 1), 93),
                // "Marble Hive"
                setStackSize(getModItem(ExtraBees.ID, "hive", 1L, 3), 93),
                // "Tropical Hive"
                setStackSize(getModItem(Forestry.ID, "beehives", 1L, 4), 93),
                // "Modest Hive"
                setStackSize(getModItem(Forestry.ID, "beehives", 1L, 3), 93),
                // "Meadows Hive"
                setStackSize(getModItem(Forestry.ID, "beehives", 1L, 2), 70),
                // "Marshy Hive"
                setStackSize(getModItem(Forestry.ID, "beehives", 1L, 7), 70),
                // "Wintry Hive"
                setStackSize(getModItem(Forestry.ID, "beehives", 1L, 6), 70),
                // "Nether Hive"
                setStackSize(getModItem(ExtraBees.ID, "hive", 1L, 2), 58),
                // "Resonating Hive"
                setStackSize(getModItem(MagicBees.ID, "hive", 1L, 2), 47),
                // "Curious Hive"
                setStackSize(getModItem(MagicBees.ID, "hive", 1L, 0), 47),
                // "Unusual Hive"
                setStackSize(getModItem(MagicBees.ID, "hive", 1L, 1), 47),
                // Beehive
                setStackSize(getModItem(PamsHarvestCraft.ID, "beehive", 1L), 354))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Amorphic Catalyst"
                getModItem(BloodArsenal.ID, "amorphic_catalyst", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 600_000))
            .itemOutputs(
                // "Metamorphic Mountain Stone"
                setStackSize(getModItem(Botania.ID, "biomeStoneA", 1L, 2), 4772),
                // "Metamorphic Fungal Stone"
                setStackSize(getModItem(Botania.ID, "biomeStoneA", 1L, 3), 4772),
                // "Metamorphic Forest Stone"
                setStackSize(getModItem(Botania.ID, "biomeStoneA", 1L, 0), 4772),
                // "Metamorphic Plains Stone"
                setStackSize(getModItem(Botania.ID, "biomeStoneA", 1L, 1), 4772),
                // "Metamorphic Swamp Stone"
                setStackSize(getModItem(Botania.ID, "biomeStoneA", 1L, 4), 4772),
                // "Metamorphic Desert Stone"
                setStackSize(getModItem(Botania.ID, "biomeStoneA", 1L, 5), 4772),
                // "Metamorphic Taiga Stone"
                setStackSize(getModItem(Botania.ID, "biomeStoneA", 1L, 6), 4772),
                // "Metamorphic Mesa Stone"
                setStackSize(getModItem(Botania.ID, "biomeStoneA", 1L, 7), 4772),
                // Quicksand
                setStackSize(getModItem(BiomesOPlenty.ID, "mud", 1L, 1), 9543))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Field Generator (LV)"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32670))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 600_000))
            .itemOutputs(
                // "Oilsands Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3878), 2099),
                // "Copper Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3035), 2099),
                // "Redstone Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3810), 2099),
                // "Lapis Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3526), 2099),
                // "Mica Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3901), 1679),
                // "Calcite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3823), 1679),
                // "Lepidolite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3907), 1679),
                // "Salt Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3817), 1679),
                // "Rock Salt Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3944), 1679),
                // "Sphalerite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3839), 1679),
                // "Nickel Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3034), 1679),
                // "Cinnabar Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3826), 1679),
                // "Cassiterite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3824), 1679),
                // "Apatite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3530), 1679),
                // "Ruby Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3502), 1679),
                // "Silver Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3054), 1679),
                // "Asbestos Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3946), 1259),
                // "Vanadium Magnetite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3923), 1259),
                // "Lazurite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3524), 1259),
                // "Sodalite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3525), 1259),
                // "Pollucite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3919), 840),
                // "Garnet Sand"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3938), 840),
                // "Gypsum Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3934), 840))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Sky Stone Block Chest"
                getModItem(AppliedEnergistics2.ID, "tile.BlockSkyChest", 1L, 1))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 600_002))
            .itemOutputs(
                // "Sky Stone"
                setStackSize(getModItem(AppliedEnergistics2.ID, "tile.BlockSkyStone", 1L, 0), 8634),
                // "Sky Stone Block"
                setStackSize(getModItem(AppliedEnergistics2.ID, "tile.BlockSkyStone", 1L, 1), 8180),
                // "Colored Glowstone (Black Frequency)"
                setStackSize(getModItem(ExtraUtilities.ID, "color_lightgem", 1L, 15), 7271),
                // "Colored Obsidian (Black Frequency)"
                setStackSize(getModItem(ExtraUtilities.ID, "color_obsidian", 1L, 15), 7271),
                // Grimstone
                setStackSize(getModItem(Chisel.ID, "grimstone", 1L, 14), 3636),
                // "Charged Certus Quartz Ore"
                setStackSize(getModItem(AppliedEnergistics2.ID, "tile.OreQuartzCharged", 1L), 2273),
                // "Basalt Cobblestone"
                setStackSize(getModItem(GalacticraftAmunRa.ID, "tile.baseBlockRock", 1L, 0), 909),
                // "Futura Block"
                setStackSize(getModItem(Chisel.ID, "futura", 1L, 2), 9543))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // Cheese
                getModItem(PamsHarvestCraft.ID, "cheeseItem", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 650_000))
            .itemOutputs(
                // "Cassiterite Sand"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5937), 821),
                // "Cassiterite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5824), 821),
                // "Garnet Sand"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5938), 821),
                // "Basaltic Mineral Sand"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5935), 821),
                // "Granitic Mineral Sand"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5936), 821),
                // "Fullers Earth"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5928), 821),
                // "Gypsum Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5934), 821),
                // "Tin Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5057), 411),
                // "Asbestos Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5946), 411),
                // "Diatomite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5948), 411),
                // "Cheese Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5894), 411),
                // "Mica Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5901), 411),
                // "Moon Dirt"
                setStackSize(getModItem(GalacticraftCore.ID, "tile.moonBlock", 1L, 3), 3900),
                // "Quarried Stone"
                setStackSize(getModItem(Railcraft.ID, "cube", 1L, 7), 3900))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Nether Star"
                getModItem(Minecraft.ID, "nether_star", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 750_000))
            .itemOutputs(
                // "Copper Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3035), 1078),
                // "Salt Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3817), 719),
                // "Rock Salt Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3944), 719),
                // "Rutile Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3375), 360),
                // "Tungstate Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3841), 360),
                // "Mica Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3901), 216),
                // "Asbestos Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3946), 72),
                // "Soapstone Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3877), 72))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Heavy Duty Alloy Ingot T2"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32463))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 750_000))
            .itemOutputs(
                // "Deimos Subsurface Block"
                setStackSize(getModItem(GalaxySpace.ID, "deimosblocks", 1L, 1), 11428),
                // "Mars Stone"
                setStackSize(getModItem(GalacticraftMars.ID, "tile.mars", 1L, 9), 10225),
                // "Phobos Stone"
                setStackSize(getModItem(GalaxySpace.ID, "phobosblocks", 1L, 2), 10225),
                // "Mars Sub-Surface Rock"
                setStackSize(getModItem(GalacticraftMars.ID, "tile.mars", 1L, 6), 1203),
                // "Phobos Subsurface Block"
                setStackSize(getModItem(GalaxySpace.ID, "phobosblocks", 1L, 1), 1203),
                // "Mars Surface Rock"
                setStackSize(getModItem(GalacticraftMars.ID, "tile.mars", 1L, 5), 602),
                // "Phobos Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "phobosblocks", 1L, 0), 602),
                // "Deimos Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "deimosblocks", 1L, 0), 602))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // TNT
                getModItem(Minecraft.ID, "tnt", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 775_000))
            .itemOutputs(
                // Marble
                setStackSize(getModItem(GregTech.ID, "gt.blockstones", 1L, 0), 9022),
                // Basalt
                setStackSize(getModItem(GregTech.ID, "gt.blockstones", 1L, 8), 9022),
                // "Black Granite"
                setStackSize(getModItem(GregTech.ID, "gt.blockgranites", 1L, 0), 9022),
                // "Red Granite"
                setStackSize(getModItem(GregTech.ID, "gt.blockgranites", 1L, 8), 9022))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Sanitizing Soap"
                getModItem(Thaumcraft.ID, "ItemSanitySoap", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 800_000))
            .itemOutputs(
                // "Cinnabar Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5826), 3900),
                // "Amber Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5514), 2340),
                // "Aer Infused Stone"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5540), 1170),
                // "Ignis Infused Stone"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5541), 1170),
                // "Aqua Infused Stone"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5543), 1170),
                // "Terra Infused Stone"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5542), 1170),
                // "Ordo Infused Stone"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5545), 1170),
                // "Perditio Infused Stone"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5544), 1170),
                // "Vinteum Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5529), 156),
                // "Shadow Iron Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5536), 156),
                // "Infused Gold Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5323), 156),
                // "Shadow Metal Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5368), 156),
                // "Quarried Stone"
                setStackSize(getModItem(Railcraft.ID, "cube", 1L, 7), 1716))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // Honeycomb
                getModItem(EtFuturumRequiem.ID, "honeycomb", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 800_050))
            .itemOutputs(
                // "Honey Block"
                setStackSize(getModItem(EtFuturumRequiem.ID, "honey_block", 1L), 6379),
                // "Honey Block"
                setStackSize(getModItem(BiomesOPlenty.ID, "honeyBlock", 1L), 6043),
                // "Honeycomb Block"
                setStackSize(getModItem(EtFuturumRequiem.ID, "honeycomb_block", 1L), 5707),
                // "Filled Honeycomb Block"
                setStackSize(getModItem(BiomesOPlenty.ID, "hive", 1L, 3), 5372),
                // "Honeycomb Block"
                setStackSize(getModItem(BiomesOPlenty.ID, "hive", 1L, 0), 5372),
                // "Empty Honeycomb Block"
                setStackSize(getModItem(BiomesOPlenty.ID, "hive", 1L, 2), 7218))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Heavy Duty Alloy Ingot T3"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32464))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 1_000_000))
            .itemOutputs(
                // "Uvarovite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5842), 3595),
                // "Callisto Ice Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5389), 3595),
                // "Nickel Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5034), 2876),
                // "Chromite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5825), 2157),
                // "Platinum Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5085), 1870),
                // "Topaz Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5507), 1438),
                // "Blue Topaz Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5513), 1438),
                // "Chrome Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5030), 1438),
                // "Iridium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5084), 1438),
                // "Ledox Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5390), 1438),
                // "Tungstate Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5841), 1295),
                // "Scheelite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5910), 1295),
                // "Palladium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5052), 1007),
                // "Lithium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5006), 863),
                // "Alduorite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5485), 288),
                // "Uranium 238 Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5098), 288),
                // "Plutonium 239 Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5100), 29),
                // "Callisto Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "callistoblocks", 1L, 0), 9744))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Field Generator (HV)"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32672))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 1_000_000))
            .itemOutputs(
                // "Apatite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 4530), 3979),
                // "Tricalcium Phosphate Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 4534), 3979),
                // "Pyrochlore Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 4607), 2653),
                // "Tantalite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 4921), 2653),
                // "Mars Cobblestone"
                setStackSize(getModItem(GalacticraftMars.ID, "tile.mars", 1L, 4), 3316),
                // "Phobos Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "phobosblocks", 1L, 0), 3316),
                // "Deimos Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "deimosblocks", 1L, 0), 3316),
                // "Asteroid Rock"
                setStackSize(getModItem(GalacticraftMars.ID, "tile.asteroidsBlock", 1L, 0), 3316))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Heavy Duty Plate"
                getModItem(GalacticraftMars.ID, "item.itemBasicAsteroids", 1L, 0))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 1_000_000))
            .itemOutputs(
                // "Ceres Subsurface Block"
                setStackSize(getModItem(GalaxySpace.ID, "ceresblocks", 1L, 1), 6857),
                // "Callisto Subsurface Block"
                setStackSize(getModItem(GalaxySpace.ID, "callistoblocks", 1L, 1), 6857),
                // "Europa Ice"
                setStackSize(getModItem(GalaxySpace.ID, "europagrunt", 1L, 1), 6857),
                // "Ganymede Subsurface Block"
                setStackSize(getModItem(GalaxySpace.ID, "ganymedeblocks", 1L, 1), 6857),
                // "Asteroid Rock"
                setStackSize(getModItem(GalacticraftMars.ID, "tile.asteroidsBlock", 1L, 0), 2310),
                // "Asteroid Rock"
                setStackSize(getModItem(GalacticraftMars.ID, "tile.asteroidsBlock", 1L, 1), 2310),
                // "Asteroid Rock"
                setStackSize(getModItem(GalacticraftMars.ID, "tile.asteroidsBlock", 1L, 2), 2310),
                // "Ceres Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "ceresblocks", 1L, 0), 361),
                // "Callisto Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "callistoblocks", 1L, 0), 361),
                // "Europa Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "europagrunt", 1L, 0), 361),
                // "Ganymede Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "ganymedeblocks", 1L, 0), 361),
                // "Dense Ice"
                setStackSize(getModItem(GalacticraftMars.ID, "tile.denseIce", 1L), 289))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Advanced Replicator"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 482))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 1_200_000))
            .itemOutputs(
                // "Nether Quartz Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 1522), 2105),
                // "Tetrahedrite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 1840), 1755),
                // "Sulfur Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 1022), 1404),
                // "Sphalerite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 1839), 1404),
                // "Thorium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 1096), 1404),
                // "Beryllium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 1008), 1404),
                // "Copper Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 1035), 1404),
                // "Redstone Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 1810), 1404),
                // "Certus Quartz Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 1516), 1404),
                // "Iron Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 1032), 1053),
                // "Chalcopyrite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 1855), 1053),
                // "Pyrite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 1834), 1053),
                // "Stibnite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 1945), 1053),
                // "Tantalite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 1921), 1053),
                // "Pyrolusite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 1943), 1053),
                // "Quartzite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 1523), 1053),
                // "Barite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 1904), 1053),
                // "Ruby Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 1502), 1053),
                // "Cinnabar Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 1826), 983),
                // "Emerald Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 1501), 702),
                // "Grossular Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 1831), 702),
                // "Spessartine Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 1838), 702),
                // "Firestone Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 1347), 281))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Field Generator (IV)"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32674))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 1_500_000))
            .itemOutputs(
                // "Meteoric Iron Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3340), 2710),
                // "Naquadah Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3324), 2168),
                // "Neodymium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3067), 1626),
                // "Monazite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3520), 1626),
                // "Deep Iron Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3829), 1084),
                // "Quantium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3391), 1084),
                // "Ardite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3382), 1084),
                // "Draconium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3975), 1084),
                // "Enriched Naquadah Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3326), 542),
                // "Adamantium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 3319), 542),
                // "Black Granite"
                setStackSize(getModItem(GregTech.ID, "gt.blockgranites", 1L, 0), 5269))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Advanced Assembling Machine III"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 214))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 2_000_000))
            .itemOutputs(
                // "Galena Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2830), 1437),
                // "Lead Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2089), 719),
                // "Silver Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2054), 719),
                // "Cryolite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2699), 719))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Emitter (HV)"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32682))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 2_000_000))
            .itemOutputs(
                // "Bauxite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5822), 3764),
                // "Ilmenite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5918), 2689),
                // "Bastnasite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5905), 2151),
                // "Aluminium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5019), 1613),
                // "Uvarovite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5842), 1613),
                // "Neodymium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5067), 1613),
                // "Monazite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5520), 1613),
                // "Meteoric Iron Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5340), 1613),
                // "Chromite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5825), 1076),
                // "Perlite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5925), 1076))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Advanced Mass Fabricator IV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 465))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 2_500_000))
            .itemOutputs(
                // "Thorium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2096), 3221),
                // "Uranium 238 Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2098), 1289),
                // "Uraninite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2922), 1289),
                // Pitchblende
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2873), 1289),
                // "Uranium 235 Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2097), 537),
                // "Plutonium 239 Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2100), 537),
                // "Plutonium 241 Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2101), 22))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Advanced Circuit Assembler II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1182))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 3_250_000))
            .itemOutputs(
                // "Pentlandite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2909), 1611),
                // "Magnetite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2870), 1482),
                // "Tetrahedrite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2840), 1482),
                // "Copper Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2035), 1224),
                // "Chalcopyrite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2855), 1095),
                // "Vanadium Magnetite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2923), 967),
                // "Gold Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2086), 967),
                // "Pyrite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2834), 967),
                // "Stibnite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2945), 967),
                // "Beryllium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2008), 838),
                // "Garnierite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2906), 838),
                // "Nickel Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2034), 838),
                // "Cobaltite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2827), 838),
                // "Iron Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2032), 773),
                // "Grossular Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2831), 709),
                // "Spessartine Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2838), 709),
                // Bentonite
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2927), 709),
                // "Magnesite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2908), 709),

                // "Olivine Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2505), 709),
                // "Thorium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2096), 645),
                // "Pyrolusite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2943), 580),
                // "Tantalite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2921), 580),
                // "Glauconite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2933), 580),
                // "Emerald Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2501), 516),
                // "Wulfenite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2882), 323),
                // "Molybdenite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2942), 323),
                // "Molybdenum Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2048), 323),
                // "Powellite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2883), 323),
                // "Lithium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2006), 323),
                // "Iridium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2084), 323),
                // "Platinum Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2085), 323),
                // "Palladium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2052), 323),
                // "Scheelite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2910), 258),
                // "Tungstate Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2841), 258),
                // "Naquadah Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2324), 194),
                // "Enriched Naquadah Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2326), 65),
                // "End Stone"
                setStackSize(getModItem(Minecraft.ID, "end_stone", 1L), 1857))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Soul Sand"
                getModItem(Minecraft.ID, "soul_sand", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 5_000_000))
            .itemOutputs(
                // "Soul Sand"
                setStackSize(getModItem(Minecraft.ID, "soul_sand", 1L), 18817))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Unstable Ingot Singularity"
                getModItem(UniversalSingularities.ID, "universal.extraUtilities.singularity", 1L, 0))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 5_000_200))
            .itemOutputs(
                // "Lapis Caelestis Albus (White)"
                setStackSize(getModItem(ExtraUtilities.ID, "greenscreen", 1L, 0), 2246),
                // "Lapis Caelestis Aurantiacus (Orange)"
                setStackSize(getModItem(ExtraUtilities.ID, "greenscreen", 1L, 1), 2246),
                // "Lapis Caelestis Purpura Amethystinus (Magenta)"
                setStackSize(getModItem(ExtraUtilities.ID, "greenscreen", 1L, 2), 2246),
                // "Lapis Caelestis Caesicius (Light Blue)"
                setStackSize(getModItem(ExtraUtilities.ID, "greenscreen", 1L, 3), 2246),
                // "Lapis Caelestis Flavus (Yellow)"
                setStackSize(getModItem(ExtraUtilities.ID, "greenscreen", 1L, 4), 2246),
                // "Lapis Caelestis Viridis (Green)"
                setStackSize(getModItem(ExtraUtilities.ID, "greenscreen", 1L, 5), 2246),
                // "Lapis Caelestis Roseus (Pink)"
                setStackSize(getModItem(ExtraUtilities.ID, "greenscreen", 1L, 6), 2246),
                // "Lapis Caelestis Cinereus (Gray)"
                setStackSize(getModItem(ExtraUtilities.ID, "greenscreen", 1L, 7), 2246),
                // "Lapis Caelestis Lux Cinereus (Light Gray)"
                setStackSize(getModItem(ExtraUtilities.ID, "greenscreen", 1L, 8), 2246),
                // "Lapis Caelestis Callainus (Cyan)"
                setStackSize(getModItem(ExtraUtilities.ID, "greenscreen", 1L, 9), 2246),
                // "Lapis Caelestis Purpura (Purple)"
                setStackSize(getModItem(ExtraUtilities.ID, "greenscreen", 1L, 10), 2246),
                // "Lapis Caelestis Caeruleus (Blue)"
                setStackSize(getModItem(ExtraUtilities.ID, "greenscreen", 1L, 11), 2246),
                // "Lapis Caelestis Fuscus (Brown)"
                setStackSize(getModItem(ExtraUtilities.ID, "greenscreen", 1L, 12), 2246),
                // "Lapis Caelestis Paphiae Myrti (Dark Green)"
                setStackSize(getModItem(ExtraUtilities.ID, "greenscreen", 1L, 13), 2246),
                // "Lapis Caelestis Rufus (Red)"
                setStackSize(getModItem(ExtraUtilities.ID, "greenscreen", 1L, 14), 2246),
                // "Lapis Caelestis Nox (Black)"
                setStackSize(getModItem(ExtraUtilities.ID, "greenscreen", 1L, 15), 2246),
                // "Lave ⑫"
                setStackSize(getModItem(ZTones.ID, "tile.laveBlock", 1L, 12), 1123),
                // "Castle Roof Tile"
                setStackSize(getModItem(TwilightForest.ID, "tile.CastleBrick", 1L, 3), 1123),
                // "Dark Ethereal Glass"
                setStackSize(getModItem(ExtraUtilities.ID, "etherealglass", 1L, 2), 9543))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Advanced Mass Fabricator II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 463))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 6_000_000))
            .itemOutputs(
                // "Bauxite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5822), 5436),
                // "Ilmenite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5918), 4228),
                // "Bastnasite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5905), 3423),
                // "Galena Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 6830), 3423),
                // "Neodymium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5067), 3020),
                // "Tungstate Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 6841), 3020),
                // "Scheelite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 6910), 3020),
                // "Uraninite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 6922), 3020),
                // Pitchblende
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 6873), 3020),
                // "Meteoric Iron Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2340), 3020),
                // "Monazite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5520), 2618),
                // "Monazite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 6098), 2618),
                // "Aluminium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5019), 2215),
                // "Uvarovite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5842), 2215),
                // "Desh Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 6884), 2014),
                // "Sphalerite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 6839), 1812),
                // "Cinnabar Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 6826), 1812),
                // "Nickel Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 6034), 1812),
                // "Chromite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 6825), 1410),
                // "Perlite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5925), 1410),
                // "Silver Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 6054), 1410),
                // "Lead Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 6089), 1410),
                // "Cobaltite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 6827), 1410),
                // "Arsenic Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 6039), 1410),
                // "Oriharukon Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 6393), 1410))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // Pufferfish
                getModItem(Minecraft.ID, "fish", 1L, 3))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 6_666_666))
            .itemOutputs(
                // "Saltpeter Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 6836), 7527),
                // "Salt Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 6817), 2823),
                // "Rock Salt Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 6944), 2823),
                // "Basaltic Mineral Sand"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 6935), 941),
                // "Granitic Mineral Sand"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 6939), 941),
                // Basalt
                setStackSize(getModItem(Botania.ID, "stone", 1L, 1), 3764))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Blood TNT"
                getModItem(BloodArsenal.ID, "blood_tnt", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 6_667_666))
            .itemOutputs(
                // "Industrial TNT"
                setStackSize(getModItem(IndustrialCraft2.ID, "blockITNT", 1L), 4839),
                // "Blood TNT"
                setStackSize(getModItem(BloodArsenal.ID, "blood_tnt", 1L), 4301),
                // TNT
                setStackSize(getModItem(Minecraft.ID, "tnt", 1L), 4301),
                // "Redstone Lamp"
                setStackSize(getModItem(Minecraft.ID, "redstone_lamp", 1L), 1613),
                // "Redstone Block"
                setStackSize(getModItem(Chisel.ID, "redstone_block", 1L, 14), 3764))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Fusion Coil Block"
                getModItem(GregTech.ID, "gt.blockcasings4", 1L, 7))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 6_669_666))
            .itemOutputs(
                // "Soul Sand"
                setStackSize(getModItem(Minecraft.ID, "soul_sand", 1L), 3),
                // "Soul Soil"
                setStackSize(getModItem(EtFuturumRequiem.ID, "soul_soil", 1L), 3),
                // Obsidian
                setStackSize(getModItem(Minecraft.ID, "obsidian", 1L), 3),
                // "Magma Block"
                setStackSize(getModItem(EtFuturumRequiem.ID, "magma", 1L), 3),
                // "Magma Block"
                setStackSize(getModItem(GregTech.ID, "gt.blockgranites", 1L, 8), 2),
                // "Black Granite"
                setStackSize(getModItem(GregTech.ID, "gt.blockgranites", 1L, 0), 2),
                // "Nether Block"
                setStackSize(getModItem(Railcraft.ID, "brick.nether", 1L, 2), 2),
                // "Nether Bricks"
                setStackSize(getModItem(Minecraft.ID, "nether_brick", 1L), 2),
                // "Cracked Nether Bricks"
                setStackSize(getModItem(EtFuturumRequiem.ID, "red_netherbrick", 1L, 1), 1),
                // "Red Nether Bricks"
                setStackSize(getModItem(EtFuturumRequiem.ID, "red_netherbrick", 1L, 0), 1),
                // "Crying Obsidian"
                setStackSize(getModItem(EtFuturumRequiem.ID, "crying_obsidian", 1L), 1),
                // "Ancient Debris"
                setStackSize(getModItem(EtFuturumRequiem.ID, "ancient_debris", 1L), 1),
                // Netherrack
                setStackSize(getModItem(Minecraft.ID, "netherrack", 1L), 162))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Heavy Duty Plate Tier 4"
                getModItem(NewHorizonsCoreMod.ID, "item.HeavyDutyPlateTier4", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 7_500_000))
            .itemOutputs(
                // "Venus Subsurface Block"
                setStackSize(getModItem(GalaxySpace.ID, "venusblocks", 1L, 1), 11428),
                // "Io Stone"
                setStackSize(getModItem(GalaxySpace.ID, "ioblocks", 1L, 2), 10827),
                // "Mercury Core"
                setStackSize(getModItem(GalaxySpace.ID, "mercuryblocks", 1L, 2), 10225),
                // "Mercury Subsurface Block"
                setStackSize(getModItem(GalaxySpace.ID, "mercuryblocks", 1L, 1), 1203),
                // "Io Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "ioblocks", 1L, 0), 602),
                // "Io Ash"
                setStackSize(getModItem(GalaxySpace.ID, "ioblocks", 1L, 1), 602),
                // "Mercury Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "mercuryblocks", 1L, 0), 602),
                // "Venus Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "venusblocks", 1L, 0), 602))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Netherite Scrap"
                getModItem(EtFuturumRequiem.ID, "netherite_scrap", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 9_876_543))
            .itemOutputs(
                // "Nether Block"
                setStackSize(getModItem(Railcraft.ID, "brick.nether", 1L, 2), 9198),
                // "Nether Bricks"
                setStackSize(getModItem(Minecraft.ID, "nether_brick", 1L), 7359),
                // "Cracked Nether Bricks"
                setStackSize(getModItem(EtFuturumRequiem.ID, "red_netherbrick", 1L, 1), 4599),
                // "Red Nether Bricks"
                setStackSize(getModItem(EtFuturumRequiem.ID, "red_netherbrick", 1L, 0), 4599),
                // "Soul Soil"
                setStackSize(getModItem(EtFuturumRequiem.ID, "soul_soil", 1L), 4599),
                // "Soul Sand"
                setStackSize(getModItem(Minecraft.ID, "soul_sand", 1L), 4599),
                // "Compressed Netherrack"
                setStackSize(getModItem(GTPlusPlus.ID, "blockCompressedObsidian", 1L, 11), 1840),
                // "Double Compressed Netherrack"
                setStackSize(getModItem(GTPlusPlus.ID, "blockCompressedObsidian", 1L, 12), 920),
                // "Triple Compressed Netherrack"
                setStackSize(getModItem(GTPlusPlus.ID, "blockCompressedObsidian", 1L, 13), 460),
                // Netherrack
                setStackSize(getModItem(Minecraft.ID, "netherrack", 1L), 9543))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // Boxinator
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 406))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 10_000_000))
            .itemOutputs(
                // "Bismutite Ore"
                setStackSize(getModItem(BartWorks.ID, "bw.blockores.01", 1L, 1), 1474),
                // "Fluor-Buergerite Ore"
                setStackSize(getModItem(BartWorks.ID, "bw.blockores.01", 1L, 5), 1474),
                // "Orange Descloizite Ore"
                setStackSize(getModItem(BartWorks.ID, "bw.blockores.01", 1L, 27), 1474),
                // "Red Descloizite Ore"
                setStackSize(getModItem(BartWorks.ID, "bw.blockores.01", 1L, 26), 1474),
                // "Fluor-Buergerite Ore"
                setStackSize(getModItem(BartWorks.ID, "bw.blockores.01", 1L, 5), 1474),
                // "Fayalite Ore"
                setStackSize(getModItem(BartWorks.ID, "bw.blockores.01", 1L, 23), 1474),
                // "Forsterite Ore"
                setStackSize(getModItem(BartWorks.ID, "bw.blockores.01", 1L, 24), 1474),
                // "Red Fuchsite Ore"
                setStackSize(getModItem(BartWorks.ID, "bw.blockores.01", 1L, 29), 1474),
                // "Green Fuchsite Ore"
                setStackSize(getModItem(BartWorks.ID, "bw.blockores.01", 1L, 28), 1474),
                // "Djurleite Ore"
                setStackSize(getModItem(BartWorks.ID, "bw.blockores.01", 1L, 16), 1474),
                // "Bornite Ore"
                setStackSize(getModItem(BartWorks.ID, "bw.blockores.01", 1L, 14), 1474),
                // "Wittichenite Ore"
                setStackSize(getModItem(BartWorks.ID, "bw.blockores.01", 1L, 15), 1474),
                // "Chromo-Alumino-Povondraite Ore"
                setStackSize(getModItem(BartWorks.ID, "bw.blockores.01", 1L, 7), 1474),
                // "Vanadio-Oxy-Dravite Ore"
                setStackSize(getModItem(BartWorks.ID, "bw.blockores.01", 1L, 8), 1474),
                // "Olenite Ore"
                setStackSize(getModItem(BartWorks.ID, "bw.blockores.01", 1L, 9), 1474),
                // "Red Zircon Ore"
                setStackSize(getModItem(BartWorks.ID, "bw.blockores.01", 1L, 19), 1474),
                // "Hedenbergite Ore"
                setStackSize(getModItem(BartWorks.ID, "bw.blockores.01", 1L, 25), 1474),
                // "Prasiolite Ore"
                setStackSize(getModItem(BartWorks.ID, "bw.blockores.01", 1L, 35), 1474))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Heavy Duty Plate Tier 5"
                getModItem(NewHorizonsCoreMod.ID, "item.HeavyDutyPlateTier5", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 10_000_000))
            .itemOutputs(
                // "Enceladus Subsurface Block"
                setStackSize(getModItem(GalaxySpace.ID, "enceladusblocks", 1L, 1), 7669),
                // "Oberon Stone"
                setStackSize(getModItem(GalaxySpace.ID, "oberonblocks", 1L, 2), 7669),
                // "Miranda Stone"
                setStackSize(getModItem(GalaxySpace.ID, "mirandablocks", 1L, 2), 7669),
                // "Titan Stone"
                setStackSize(getModItem(GalaxySpace.ID, "titanblocks", 1L, 2), 6767),
                // "Titan Subsurface Block"
                setStackSize(getModItem(GalaxySpace.ID, "titanblocks", 1L, 1), 903),
                // "Packed Ice"
                setStackSize(getModItem(Minecraft.ID, "packed_ice", 1L), 903),
                // "Enceladus Ice"
                setStackSize(getModItem(GalaxySpace.ID, "enceladusblocks", 1L, 3), 903),
                // "Oberon Subsurface Block"
                setStackSize(getModItem(GalaxySpace.ID, "oberonblocks", 1L, 1), 903),
                // "Miranda Subsurface Block"
                setStackSize(getModItem(GalaxySpace.ID, "mirandablocks", 1L, 1), 903),
                // "Titan Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "titanblocks", 1L, 0), 452),
                // "Enceladus Snow"
                setStackSize(getModItem(GalaxySpace.ID, "enceladusblocks", 1L, 0), 452),
                // "Oberon Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "oberonblocks", 1L, 0), 452),
                // "Miranda Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "mirandablocks", 1L, 0), 452))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Advanced Scanner IV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 345))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 12_500_000))
            .itemOutputs(
                // "Crude Rhodium Metal Ore"
                setStackSize(getModItem(BartWorks.ID, "bw.blockores.01", 1L, 79), 3005),
                // "Leach Residue Ore"
                setStackSize(getModItem(BartWorks.ID, "bw.blockores.01", 1L, 60), 3005),
                // "Platinum Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2085), 2254),
                // "Rarest Metal Residue Ore"
                setStackSize(getModItem(BartWorks.ID, "bw.blockores.01", 1L, 69), 1503),
                // "Iridium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2084), 1127),
                // "Palladium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2052), 1127),
                // "Osmium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2083), 752))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Heavy Duty Plate Tier 6"
                getModItem(NewHorizonsCoreMod.ID, "item.HeavyDutyPlateTier6", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 15_000_000))
            .itemOutputs(
                // "Triton Stone"
                setStackSize(getModItem(GalaxySpace.ID, "tritonblocks", 1L, 2), 15337),
                // "Proteus Stone"
                setStackSize(getModItem(GalaxySpace.ID, "proteusblocks", 1L, 2), 15337),
                // "Triton Subsurface Block"
                setStackSize(getModItem(GalaxySpace.ID, "tritonblocks", 1L, 1), 1805),
                // "Proteus Subsurface Block"
                setStackSize(getModItem(GalaxySpace.ID, "proteusblocks", 1L, 1), 1805),
                // "Triton Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "tritonblocks", 1L, 0), 903),
                // "Proteus Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "proteusblocks", 1L, 0), 903))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Crystal Mainframe"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32091))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 25_000_000))
            .itemOutputs(
                // "Tiberium Ore"
                setStackSize(getModItem(BartWorks.ID, "bw.blockores.01", 1L, 89), 7841),
                // "Naquadah Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2324), 5881),
                // "Enriched Naquadah Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2326), 3921),
                // "Naquadria Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2327), 1177))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Heavy Duty Plate Tier 7"
                getModItem(NewHorizonsCoreMod.ID, "item.HeavyDutyPlateTier7", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 30_000_000))
            .itemOutputs(
                // "Haumea Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "haumeablocks", 1L), 12029),
                // "Makemake Subsurface Block"
                setStackSize(getModItem(GalaxySpace.ID, "makemakegrunt", 1L, 1), 11428),
                // "Pluto Stone"
                setStackSize(getModItem(GalaxySpace.ID, "plutoblocks", 1L, 5), 10105),
                // "Pluto Subsurface Ice"
                setStackSize(getModItem(GalaxySpace.ID, "plutoblocks", 1L, 4), 1203),
                // "Makemake Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "makemakegrunt", 1L, 0), 602),
                // "Pluto Surface Ice"
                setStackSize(getModItem(GalaxySpace.ID, "plutoblocks", 1L, 0), 181),
                // "Pluto Surface Ice"
                setStackSize(getModItem(GalaxySpace.ID, "plutoblocks", 1L, 1), 181),
                // "Pluto Surface Ice"
                setStackSize(getModItem(GalaxySpace.ID, "plutoblocks", 1L, 2), 181),
                // "Pluto Surface Ice"
                setStackSize(getModItem(GalaxySpace.ID, "plutoblocks", 1L, 3), 181))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Elite Recycler"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10990))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 44_000_000))
            .itemOutputs(
                // "Mysterious Crystal Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2398), 7527),
                // "Osmium Ore"
                setStackSize(getModItem(GalaxySpace.ID, "enceladusblocks", 1L, 0), 11290))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Elven Gateway Core"
                getModItem(Botania.ID, "alfheimPortal", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 50_000_000))
            .itemOutputs(
                // "Block of Sunny Quartz"
                setStackSize(getModItem(Botania.ID, "quartzTypeSunny", 1L, 0), 4990),
                // "Block of Blaze Quartz"
                setStackSize(getModItem(Botania.ID, "quartzTypeBlaze", 1L, 0), 4990),
                // "Block of Redquartz"
                setStackSize(getModItem(Botania.ID, "quartzTypeRed", 1L, 0), 4990),
                // "Block of Smokey Quartz"
                setStackSize(getModItem(Botania.ID, "quartzTypeDark", 1L, 0), 4990),
                // "Block of Lavender Quartz"
                setStackSize(getModItem(Botania.ID, "quartzTypeLavender", 1L, 0), 4990),
                // "Smooth Quartz"
                setStackSize(getModItem(EtFuturumRequiem.ID, "smooth_quartz", 1L), 3992),
                // "Block of Mana Quartz"
                setStackSize(getModItem(Botania.ID, "quartzTypeMana", 1L, 0), 3743),
                // "Certus Quartz Block"
                setStackSize(getModItem(AppliedEnergistics2.ID, "tile.BlockQuartz", 1L), 2994),
                // "Block of Elven Quartz"
                setStackSize(getModItem(Botania.ID, "quartzTypeElf", 1L, 0), 2495),
                // Livingwood
                setStackSize(getModItem(Botania.ID, "livingwood", 1L, 0), 4772),
                // Livingrock
                setStackSize(getModItem(Botania.ID, "livingrock", 1L, 0), 4772))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Wetware Supercomputer"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32094))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 50_000_000))
            .itemOutputs(
                // "Galena Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2830), 4864),
                // "Galena Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2089), 3040),
                // "Silver Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2054), 2432),
                // "Sphalerite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2839), 2432),
                // "Indium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2056), 4))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Heavy Duty Plate Tier 8"
                getModItem(NewHorizonsCoreMod.ID, "item.HeavyDutyPlateTier8", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 50_000_000))
            .itemOutputs(
                // "Barnarda E Subsurface Block"
                setStackSize(getModItem(GalaxySpace.ID, "barnardaEsubgrunt", 1L), 6696),
                // "Barnarda F Subsurface Block"
                setStackSize(getModItem(GalaxySpace.ID, "barnardaFsubgrunt", 1L), 6696),
                // "Vega B Subsurface Block"
                setStackSize(getModItem(GalaxySpace.ID, "vegabsubgrunt", 1L), 6696),
                // "α Centauri Bb Subsurface Block"
                setStackSize(getModItem(GalaxySpace.ID, "acentauribbsubgrunt", 1L), 6696),
                // "T Ceti E Stone Block"
                setStackSize(getModItem(GalaxySpace.ID, "tcetieblocks", 1L, 2), 5991),
                // "Barnarda C Dirt"
                setStackSize(getModItem(GalaxySpace.ID, "barnardaCdirt", 1L), 705),
                // "T Ceti E Subsurface Block"
                setStackSize(getModItem(GalaxySpace.ID, "tcetieblocks", 1L, 1), 705),
                // "Barnarda E Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "barnardaEgrunt", 1L), 353),
                // "Barnarda F Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "barnardaFgrunt", 1L), 353),
                // "Vega B Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "vegabgrunt", 1L), 353),
                // "T Ceti E Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "tcetieblocks", 1L, 0), 353),
                // "α Centauri Bb Surface Block"
                setStackSize(getModItem(GalaxySpace.ID, "acentauribbgrunt", 1L), 353),
                // "Barnarda C Grass"
                setStackSize(getModItem(GalaxySpace.ID, "barnardaCgrass", 1L), 141))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Advanced Circuit Assembler VI"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1186))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 80_000_000))
            .itemOutputs(
                // "Electrum Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2303), 624),
                // "Aluminium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2019), 624),
                // "Titanium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2028), 624),
                // "Tungsten Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2081), 624),
                // "Neodymium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2067), 624),
                // "Chrome Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2030), 624),
                // "Beryllium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2008), 624),
                // "Manganese Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2031), 624),
                // "Gallium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2037), 624),
                // "Yttrium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2045), 624),
                // "Niobium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2047), 624),
                // "Strontium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2044), 624),
                // "Cadmium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2055), 624),
                // "Tellurium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2059), 624),
                // "Barium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2063), 624),
                // "Cerium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2065), 624),
                // "Praseodymium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2066), 624),
                // "Promethium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2068), 624),
                // "Terbium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2072), 624),
                // "Dysprosium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2073), 624),
                // "Erbium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2075), 624),
                // "Thulium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2076), 624),
                // "Tantalum Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2080), 624),
                // "Ytterbium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2077), 624),
                // "Gadolinium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2071), 624),
                // "Holmium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2074), 624),
                // "Caesium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2062), 624),
                // "Scandium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2027), 624),
                // "Tiberium Ore"
                setStackSize(getModItem(BartWorks.ID, "bw.blockores.01", 1L, 89), 624),
                // "Lutetium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2078), 468),
                // "Samarium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2069), 156),
                // "Lanthanum Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2064), 63),
                // "Indium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2056), 32),
                // "Europium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2070), 32))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Bloody Ichorium Fusion Casing"
                getModItem(KubaTech.ID, "defc.casing", 1L, 8))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 90_000_000))
            .itemOutputs(
                // "Diamond Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2500), 5531),
                // "Emerald Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2501), 5531),
                // "Ruby Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2502), 5531),
                // "Sapphire Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2503), 5531),
                // "Green Sapphire Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2504), 5531),
                // "Olivine Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2505), 5531),
                // "Topaz Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2507), 5531),
                // "Tanzanite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2508), 5531),
                // "Amethyst Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2509), 5531),
                // "Opal Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2510), 5531),
                // "Jasper Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2511), 5531),
                // "Blue Topaz Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2513), 5531),
                // "Red Garnet Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2527), 5531),
                // "Yellow Garnet Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2528), 5531),
                // "Jade Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2537), 5531),
                // "Vinteum Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2529), 5531),
                // "Lapis Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2526), 5531),
                // "Lazurite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2524), 5531),
                // "Mysterious Crystal Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2398), 5531),
                // "Ignis Infused Stone"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2541), 5531),
                // "Aer Infused Stone"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2540), 5531),
                // "Aer Infused Stone"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2543), 5531),
                // "Terra Infused Stone"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2542), 5531),
                // "Terra Infused Stone"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2545), 5531),
                // "Perditio Infused Stone"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2544), 5531),
                // "Nether Star Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2506), 5531))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Elite Mass Fabricator II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10951))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 100_000_000))
            .itemOutputs(
                // "Deep Iron Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2829), 6983),
                // "Naquadah Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2324), 5819),
                // "Black Plutonium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2388), 4655),
                // "Yttrium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2045), 3492),
                // "Gallium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2037), 3492),
                // "Enriched Naquadah Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2326), 3492),
                // "Niobium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2047), 3492),
                // "Borax Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2941), 3492),
                // "Naquadria Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2327), 2328),
                // "Uranium 238 Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2098), 2328),
                // "Plutonium 239 Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2100), 2328),
                // "Mysterious Crystal Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2398), 1164),
                // "Uranium 235 Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2097), 1164),
                // "Plutonium 241 Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2101), 1164),
                // "Samarium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2069), 1164),
                // "Nether Star Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2506), 466),
                // "Neutronium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2129), 466),
                // "Cosmic Neutronium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2982), 233))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Advanced Crop Synthesiser VII"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12526))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 100_000_000))
            .itemOutputs(
                // "Enriched Naquadah Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2326), 3839),
                // "Black Plutonium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2388), 3490),
                // "Naquadah Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2324), 3490),
                // "Lutetium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2078), 3490),
                // "Infinity Catalyst Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2394), 3490),
                // "Naquadria Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2327), 2792),
                // "Neutronium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2129), 1745),
                // "Europium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2070), 1745),
                // "Europium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2982), 698),
                // "Fluxed Electrum Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2320), 698),
                // "Americium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2103), 698),
                // "Indium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 2056), 349))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Shard of Laputa"
                getModItem(Botania.ID, "laputaShard", 1L, 19))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 1_000_000_001))
            .itemOutputs(
                // Azulejo
                setStackSize(getModItem(Botania.ID, "customBrick", 1L, 4), 147),
                // "Sea Lantern"
                setStackSize(getModItem(Botania.ID, "seaLamp", 1L), 131),
                // "Prismarine Bricks"
                setStackSize(getModItem(Botania.ID, "prismarine", 1L, 1), 131),
                // "Dark Prismarine"
                setStackSize(getModItem(Botania.ID, "prismarine", 1L, 2), 131),
                // "Glimmering Livingwood"
                setStackSize(getModItem(Botania.ID, "livingwood", 1L, 5), 98),
                // "Block of Manasteel"
                setStackSize(getModItem(Botania.ID, "storage", 1L, 0), 82),
                // "Mana Pearl Block"
                setStackSize(getModItem(NewHorizonsCoreMod.ID, "tile.ManaPearl", 1L), 66),
                // "Mana Powder Block"
                setStackSize(getModItem(NewHorizonsCoreMod.ID, "tile.ManaPowder", 1L), 66),
                // "Block of Elementium"
                setStackSize(getModItem(Botania.ID, "storage", 1L, 2), 17),
                // "Pixie Dust Block"
                setStackSize(getModItem(NewHorizonsCoreMod.ID, "tile.PixieDust", 1L), 17),
                // "Gaia Spirit Block"
                setStackSize(getModItem(NewHorizonsCoreMod.ID, "tile.Gaia", 1L), 4),
                // Prismarine
                setStackSize(getModItem(Botania.ID, "prismarine", 1L, 0), 884))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Ion Thruster Jet"
                getModItem(GalacticraftAmunRa.ID, "tile.machines2", 1L, 1))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 1_000_000_001))
            .itemOutputs(
                // "Salt Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 5817), 16935),
                // "Salt Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 817), 1856),
                // "Raw Tengam Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 110), 26))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);

        GTValues.RA.stdBuilder()
            .itemInputs(
                // "Space Mining Module MK-III"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 14009))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 1_000_000_001))
            .itemOutputs(
                // "Awakened Draconium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 976), 8914),
                // "Neodymium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 67), 4457),
                // "Samarium Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 69), 2675),
                // "Nether Star Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 506), 2229),
                // "Tartarite Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 956), 535),
                // "Raw Tengam Ore"
                setStackSize(getModItem(GregTech.ID, "gt.blockores", 1L, 110), 9))
            .duration(3 * SECONDS)
            .eut(RECIPE_MV)
            .addTo(addChaosFallingTowerRecipes);
    }
}
