package EnumList.EnumItemList.EnumOreProductList;

import static gregtech.api.enums.Mods.AppliedEnergistics2;
import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.BiomesOPlenty;
import static gregtech.api.enums.Mods.Botania;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.IndustrialCraft2;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.Mods.NewHorizonsCoreMod;
import static gregtech.api.enums.Mods.ProjectRedCore;
import static gregtech.api.enums.Mods.Railcraft;
import static gregtech.api.enums.Mods.Thaumcraft;
import static gregtech.api.util.GTModHandler.getModItem;

import net.minecraft.item.ItemStack;

public class GemList {

    public static final ItemStack Iridium = getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L);

    public static final ItemStack Coal = getModItem(Minecraft.ID, "coal", 1L);
    public static final ItemStack Charcoal = getModItem(Minecraft.ID, "coal", 1L, 1);
    public static final ItemStack Diamond = getModItem(Minecraft.ID, "diamond", 1L);
    public static final ItemStack Lapis_Lazuli = getModItem(Minecraft.ID, "dye", 1L, 4);
    public static final ItemStack Ender_Pearl = getModItem(Minecraft.ID, "ender_pearl", 1L);
    public static final ItemStack Eye_of_Ender = getModItem(Minecraft.ID, "ender_eye", 1L);
    public static final ItemStack Emerald = getModItem(Minecraft.ID, "emerald", 1L);
    public static final ItemStack Nether_Star = getModItem(Minecraft.ID, "nether_star", 1L);
    public static final ItemStack Nether_Quartz = getModItem(Minecraft.ID, "quartz", 1L);
    public static final ItemStack Ender_Amethyst = getModItem(BiomesOPlenty.ID, "gems", 1L);
    public static final ItemStack Peridot_BOP = getModItem(BiomesOPlenty.ID, "gems", 1L, 2);
    public static final ItemStack Malachite = getModItem(BiomesOPlenty.ID, "gems", 1L, 5);
    public static final ItemStack Mana_Diamond = getModItem(Botania.ID, "manaResource", 1L, 2);
    public static final ItemStack Dragonstone = getModItem(Botania.ID, "manaResource", 1L, 9);
    public static final ItemStack Peridot_PR = getModItem(ProjectRedCore.ID, "projectred.core.part", 1L, 39);
    public static final ItemStack Raw_Firestone = getModItem(Railcraft.ID, "firestone.raw", 1L);
    public static final ItemStack Quicksilver = getModItem(Thaumcraft.ID, "ItemResource", 1L, 3);
    public static final ItemStack Amber = getModItem(Thaumcraft.ID, "ItemResource", 1L, 6);
    public static final ItemStack Air_Shard = getModItem(Thaumcraft.ID, "ItemShard", 1L);
    public static final ItemStack Fire_Shard = getModItem(Thaumcraft.ID, "ItemShard", 1L, 1);
    public static final ItemStack Water_Shard = getModItem(Thaumcraft.ID, "ItemShard", 1L, 2);
    public static final ItemStack Earth_Shard = getModItem(Thaumcraft.ID, "ItemShard", 1L, 3);
    public static final ItemStack Order_Shard = getModItem(Thaumcraft.ID, "ItemShard", 1L, 4);
    public static final ItemStack Entropy_Shard = getModItem(Thaumcraft.ID, "ItemShard", 1L, 5);
    public static final ItemStack Charged_Certus_Quartz_Crystal = getModItem(
        AppliedEnergistics2.ID,
        "item.ItemMultiMaterial",
        1L,
        1);
    public static final ItemStack Fluix_Crystal = getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 7);
    public static final ItemStack Bismutite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 1);
    public static final ItemStack Cubic_Zirconia = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 4);
    public static final ItemStack Fluor_Buergerite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 5);
    public static final ItemStack Chromo_Alumino_Povondraite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 7);
    public static final ItemStack Vanadio_Oxy_Dravite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 8);
    public static final ItemStack Olenite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 9);
    public static final ItemStack Red_Zircon = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 19);
    public static final ItemStack Salt = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 20);
    public static final ItemStack Spodumene = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 21);
    public static final ItemStack Rock_Salt = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 22);
    public static final ItemStack Fayalite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 23);
    public static final ItemStack Forsterite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 24);
    public static final ItemStack Hedenbergite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 25);
    public static final ItemStack Prasiolite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 35);
    public static final ItemStack Magneto_Resonatic = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 36);
    public static final ItemStack BArTiMaEuSNeK = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 43);
    public static final ItemStack Tiberium = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 89);
    public static final ItemStack Fluorspar = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 91);
    public static final ItemStack Orundum = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 10023);
    public static final ItemStack Cerium_doped_Lutetium_Aluminium_Garnet_CeLuAG = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgem",
        1L,
        11499);
    public static final ItemStack Lanthanum_Hexaboride = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgem", 1L, 11358);
    public static final ItemStack Exquisite_Probable_Crystal = getModItem(
        NewHorizonsCoreMod.ID,
        "MysteriousCrystalGemExquisite",
        1L);
    public static final ItemStack Exquisite_Chromatic_Crystal = getModItem(
        NewHorizonsCoreMod.ID,
        "ChromaticGemExquisite",
        1L);
    public static final ItemStack Exquisite_Mana_Diamond = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30208);
    public static final ItemStack Exquisite_Dragonstone = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30209);
    public static final ItemStack Exquisite_Diamond = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30500);
    public static final ItemStack Exquisite_Emerald = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30501);
    public static final ItemStack Exquisite_Ruby = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30502);
    public static final ItemStack Exquisite_Sapphire = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30503);
    public static final ItemStack Exquisite_Green_Sapphire = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30504);
    public static final ItemStack Exquisite_Olivine = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30505);
    public static final ItemStack Exquisite_Topaz = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30507);
    public static final ItemStack Exquisite_Tanzanite = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30508);
    public static final ItemStack Exquisite_Amethyst = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30509);
    public static final ItemStack Exquisite_Opal = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30510);
    public static final ItemStack Exquisite_Jasper = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30511);
    public static final ItemStack Exquisite_Spinel = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30512);
    public static final ItemStack Exquisite_Blue_Topaz = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30513);
    public static final ItemStack Exquisite_Amber = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30514);
    public static final ItemStack Exquisite_Red_Garnet = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30527);
    public static final ItemStack Exquisite_Yellow_Garnet = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30528);
    public static final ItemStack Exquisite_Glass_Crystal = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30890);
    public static final ItemStack Flawless_Unknown_Crystal = getModItem(
        NewHorizonsCoreMod.ID,
        "MysteriousCrystalGemFlawless",
        1L);
    public static final ItemStack Flawless_Chromatic_Crystal = getModItem(
        NewHorizonsCoreMod.ID,
        "ChromaticGemFlawless",
        1L);
    public static final ItemStack Flawless_Mana_Diamond = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29208);
    public static final ItemStack Flawless_Dragonstone = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29209);
    public static final ItemStack Flawless_Diamond = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29500);
    public static final ItemStack Flawless_Emerald = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29501);
    public static final ItemStack Flawless_Ruby = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29502);
    public static final ItemStack Flawless_Sapphire = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29503);
    public static final ItemStack Flawless_Green_Sapphire = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29504);
    public static final ItemStack Flawless_Olivine = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29505);
    public static final ItemStack Flawless_Topaz = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29507);
    public static final ItemStack Flawless_Tanzanite = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29508);
    public static final ItemStack Flawless_Amethyst = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29509);
    public static final ItemStack Flawless_Opal = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29510);
    public static final ItemStack Flawless_Jasper = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29511);
    public static final ItemStack Flawless_Spinel = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29512);
    public static final ItemStack Flawless_Blue_Topaz = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29513);
    public static final ItemStack Flawless_Amber = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29514);
    public static final ItemStack Flawless_Red_Garnet = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29527);
    public static final ItemStack Flawless_Yellow_Garnet = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29528);
    public static final ItemStack Flawless_Glass_Crystal = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 29890);
    public static final ItemStack Chromatic_Crystal = getModItem(NewHorizonsCoreMod.ID, "ChromaticGem", 1L);
    public static final ItemStack Graviton_Shard = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8150);
    public static final ItemStack Ruby = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8502);
    public static final ItemStack Sapphire = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8503);
    public static final ItemStack Green_Sapphire = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8504);
    public static final ItemStack Olivine = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8505);
    public static final ItemStack Topaz = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8507);
    public static final ItemStack Tanzanite = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8508);
    public static final ItemStack Amethyst = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8509);
    public static final ItemStack Opal = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8510);
    public static final ItemStack Jasper = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8511);
    public static final ItemStack Spinel = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8512);
    public static final ItemStack Blue_Topaz = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8513);
    public static final ItemStack Dilithium = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8515);
    public static final ItemStack Certus_Quartz = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8516);
    public static final ItemStack Forcicium = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8518);
    public static final ItemStack Forcillium = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8519);
    public static final ItemStack Monazite = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8520);
    public static final ItemStack Force = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8521);
    public static final ItemStack Quartzite = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8523);
    public static final ItemStack Lazurite = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8524);
    public static final ItemStack Sodalite = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8525);
    public static final ItemStack Red_Garnet = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8527);
    public static final ItemStack Yellow_Garnet = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8528);
    public static final ItemStack Vinteum = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8529);
    public static final ItemStack Apatite = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8530);
    public static final ItemStack Niter = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8531);
    public static final ItemStack Tricalcium_Phosphate = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8534);
    public static final ItemStack Jade = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8537);
    public static final ItemStack Lignite_Coal = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8538);
    public static final ItemStack Glass_Crystal = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 8890);
    public static final ItemStack Chipped_Mana_Diamond = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27208);
    public static final ItemStack Chipped_Dragonstone = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27209);
    public static final ItemStack Chipped_Diamond = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27500);
    public static final ItemStack Chipped_Emerald = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27501);
    public static final ItemStack Chipped_Ruby = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27502);
    public static final ItemStack Chipped_Sapphire = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27503);
    public static final ItemStack Chipped_Green_Sapphire = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27504);
    public static final ItemStack Chipped_Olivine = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27505);
    public static final ItemStack Chipped_Topaz = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27507);
    public static final ItemStack Chipped_Tanzanite = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27508);
    public static final ItemStack Chipped_Amethyst = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27509);
    public static final ItemStack Chipped_Opal = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27510);
    public static final ItemStack Chipped_Jasper = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27511);
    public static final ItemStack Chipped_Spinel = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27512);
    public static final ItemStack Chipped_Blue_Topaz = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27513);
    public static final ItemStack Chipped_Amber = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27514);
    public static final ItemStack Chipped_Red_Garnet = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27527);
    public static final ItemStack Chipped_Yellow_Garnet = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27528);
    public static final ItemStack Chipped_Glass_Crystal = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 27890);
    public static final ItemStack Flawed_Mana_Diamond = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28208);
    public static final ItemStack Flawed_Dragonstone = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28209);
    public static final ItemStack Flawed_Diamond = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28500);
    public static final ItemStack Flawed_Emerald = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28501);
    public static final ItemStack Flawed_Ruby = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28502);
    public static final ItemStack Flawed_Sapphire = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28503);
    public static final ItemStack Flawed_Green_Sapphire = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28504);
    public static final ItemStack Flawed_Olivine = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28505);
    public static final ItemStack Flawed_Topaz = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28507);
    public static final ItemStack Flawed_Tanzanite = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28508);
    public static final ItemStack Flawed_Amethyst = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28509);
    public static final ItemStack Flawed_Opal = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28510);
    public static final ItemStack Flawed_Jasper = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28511);
    public static final ItemStack Flawed_Spinel = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28512);
    public static final ItemStack Flawed_Blue_Topaz = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28513);
    public static final ItemStack Flawed_Amber = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28514);
    public static final ItemStack Flawed_Red_Garnet = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28527);
    public static final ItemStack Flawed_Yellow_Garnet = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28528);
    public static final ItemStack Flawed_Glass_Crystal = getModItem(GregTech.ID, "gt.metaitem.02", 1L, 28890);

    public static final ItemStack Exquisite_Bismutite = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemExquisite",
        1L,
        1);
    public static final ItemStack Flawless_Bismutite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawless", 1L, 1);
    public static final ItemStack Flawed_Bismutite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 1);
    public static final ItemStack Chipped_Bismutite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 1);
    public static final ItemStack Exquisite_Fluor_Buergerite = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemExquisite",
        1L,
        5);
    public static final ItemStack Flawless_Fluor_Buergerite = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemFlawless",
        1L,
        5);
    public static final ItemStack Flawed_Fluor_Buergerite = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemFlawed",
        1L,
        5);
    public static final ItemStack Chipped_Fluor_Buergerite = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemChipped",
        1L,
        5);
    public static final ItemStack Exquisite_Chromo_Alumino_Povondraite = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemExquisite",
        1L,
        7);
    public static final ItemStack Flawless_Chromo_Alumino_Povondraite = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemFlawless",
        1L,
        7);
    public static final ItemStack Flawed_Chromo_Alumino_Povondraite = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemFlawed",
        1L,
        7);
    public static final ItemStack Chipped_Chromo_Alumino_Povondraite = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemChipped",
        1L,
        7);
    public static final ItemStack Exquisite_Vanadio_Oxy_Dravite = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemExquisite",
        1L,
        8);
    public static final ItemStack Flawless_Vanadio_Oxy_Dravite = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemFlawless",
        1L,
        8);
    public static final ItemStack Flawed_Vanadio_Oxy_Dravite = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemFlawed",
        1L,
        8);
    public static final ItemStack Chipped_Vanadio_Oxy_Dravite = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemChipped",
        1L,
        8);
    public static final ItemStack Exquisite_Olenite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemExquisite", 1L, 9);
    public static final ItemStack Flawless_Olenite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawless", 1L, 9);
    public static final ItemStack Flawed_Olenite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 9);
    public static final ItemStack Chipped_Olenite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 9);
    public static final ItemStack Exquisite_Red_Zircon = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemExquisite",
        1L,
        19);
    public static final ItemStack Flawless_Red_Zircon = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemFlawless",
        1L,
        19);
    public static final ItemStack Flawed_Red_Zircon = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 19);
    public static final ItemStack Chipped_Red_Zircon = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 19);
    public static final ItemStack Exquisite_Fayalite = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemExquisite",
        1L,
        23);
    public static final ItemStack Flawless_Fayalite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawless", 1L, 23);
    public static final ItemStack Flawed_Fayalite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 23);
    public static final ItemStack Chipped_Fayalite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 23);
    public static final ItemStack Exquisite_Forsterite = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemExquisite",
        1L,
        24);
    public static final ItemStack Flawless_Forsterite = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemFlawless",
        1L,
        24);
    public static final ItemStack Flawed_Forsterite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 24);
    public static final ItemStack Chipped_Forsterite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 24);
    public static final ItemStack Exquisite_Hedenbergite = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemExquisite",
        1L,
        25);
    public static final ItemStack Flawless_Hedenbergite = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemFlawless",
        1L,
        25);
    public static final ItemStack Flawed_Hedenbergite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 25);
    public static final ItemStack Chipped_Hedenbergite = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemChipped",
        1L,
        25);
    public static final ItemStack Exquisite_Prasiolite = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemExquisite",
        1L,
        35);
    public static final ItemStack Flawless_Prasiolite = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemFlawless",
        1L,
        35);
    public static final ItemStack Flawed_Prasiolite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 35);
    public static final ItemStack Chipped_Prasiolite = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 35);
    public static final ItemStack Exquisite_BArTiMaEuSNeK = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemExquisite",
        1L,
        43);
    public static final ItemStack Flawless_BArTiMaEuSNeK = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemFlawless",
        1L,
        43);
    public static final ItemStack Flawed_BArTiMaEuSNeK = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemFlawed",
        1L,
        43);
    public static final ItemStack Chipped_BArTiMaEuSNeK = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemChipped",
        1L,
        43);
    public static final ItemStack Exquisite_Tiberium = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemExquisite",
        1L,
        89);
    public static final ItemStack Flawless_Tiberium = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawless", 1L, 89);
    public static final ItemStack Flawed_Tiberium = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 89);
    public static final ItemStack Chipped_Tiberium = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 89);
    public static final ItemStack Exquisite_Fluorspar = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemExquisite",
        1L,
        91);
    public static final ItemStack Flawless_Fluorspar = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemFlawless",
        1L,
        91);
    public static final ItemStack Flawed_Fluorspar = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 91);
    public static final ItemStack Chipped_Fluorspar = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 91);
    public static final ItemStack Exquisite_Orundum = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemExquisite",
        1L,
        10023);
    public static final ItemStack Flawless_Orundum = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemFlawless",
        1L,
        10023);
    public static final ItemStack Flawed_Orundum = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 10023);
    public static final ItemStack Chipped_Orundum = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 10023);
    public static final ItemStack Exquisite_Salt = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemExquisite", 1L, 20);
    public static final ItemStack Flawless_Salt = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawless", 1L, 20);
    public static final ItemStack Flawed_Salt = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 20);
    public static final ItemStack Chipped_Salt = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 20);
    public static final ItemStack Exquisite_Spodumene = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemExquisite",
        1L,
        21);
    public static final ItemStack Flawless_Spodumene = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemFlawless",
        1L,
        21);
    public static final ItemStack Flawed_Spodumene = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 21);
    public static final ItemStack Chipped_Spodumene = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 21);
    public static final ItemStack Exquisite_Rock_Salt = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemExquisite",
        1L,
        22);
    public static final ItemStack Flawless_Rock_Salt = getModItem(
        BartWorks.ID,
        "gt.bwMetaGeneratedgemFlawless",
        1L,
        22);
    public static final ItemStack Flawed_Rock_Salt = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemFlawed", 1L, 22);
    public static final ItemStack Chipped_Rock_Salt = getModItem(BartWorks.ID, "gt.bwMetaGeneratedgemChipped", 1L, 22);
    // public static final ItemStack Exquisite_ = ;
    // public static final ItemStack Flawless_ = ;
    // public static final ItemStack Flawed_ = ;
    // public static final ItemStack Chipped_ = ;

    public static final ItemStack[] Gem_List = new ItemStack[] { Iridium, Coal, Charcoal, Diamond, Lapis_Lazuli,
        Ender_Pearl, Eye_of_Ender, Emerald, Nether_Star, Nether_Quartz, Ender_Amethyst, Peridot_BOP, Malachite,
        Mana_Diamond, Dragonstone, Peridot_PR, Raw_Firestone, Quicksilver, Amber, Air_Shard, Fire_Shard, Water_Shard,
        Earth_Shard, Order_Shard, Entropy_Shard, Charged_Certus_Quartz_Crystal, Fluix_Crystal, Bismutite,
        Cubic_Zirconia, Fluor_Buergerite, Chromo_Alumino_Povondraite, Vanadio_Oxy_Dravite, Olenite, Red_Zircon, Salt,
        Spodumene, Rock_Salt, Fayalite, Forsterite, Hedenbergite, Prasiolite, Magneto_Resonatic, BArTiMaEuSNeK,
        Tiberium, Fluorspar, Orundum, Cerium_doped_Lutetium_Aluminium_Garnet_CeLuAG, Lanthanum_Hexaboride,
        Exquisite_Probable_Crystal, Exquisite_Chromatic_Crystal, Exquisite_Mana_Diamond, Exquisite_Dragonstone,
        Exquisite_Diamond, Exquisite_Emerald, Exquisite_Ruby, Exquisite_Sapphire, Exquisite_Green_Sapphire,
        Exquisite_Olivine, Exquisite_Topaz, Exquisite_Tanzanite, Exquisite_Amethyst, Exquisite_Opal, Exquisite_Jasper,
        Exquisite_Spinel, Exquisite_Blue_Topaz, Exquisite_Amber, Exquisite_Red_Garnet, Exquisite_Yellow_Garnet,
        Exquisite_Glass_Crystal, Flawless_Unknown_Crystal, Flawless_Chromatic_Crystal, Flawless_Mana_Diamond,
        Flawless_Dragonstone, Flawless_Diamond, Flawless_Emerald, Flawless_Ruby, Flawless_Sapphire,
        Flawless_Green_Sapphire, Flawless_Olivine, Flawless_Topaz, Flawless_Tanzanite, Flawless_Amethyst, Flawless_Opal,
        Flawless_Jasper, Flawless_Spinel, Flawless_Blue_Topaz, Flawless_Amber, Flawless_Red_Garnet,
        Flawless_Yellow_Garnet, Flawless_Glass_Crystal, Chromatic_Crystal, Graviton_Shard, Ruby, Sapphire,
        Green_Sapphire, Olivine, Topaz, Tanzanite, Amethyst, Opal, Jasper, Spinel, Blue_Topaz, Dilithium, Certus_Quartz,
        Forcicium, Forcillium, Monazite, Force, Quartzite, Lazurite, Sodalite, Red_Garnet, Yellow_Garnet, Vinteum,
        Apatite, Niter, Tricalcium_Phosphate, Jade, Lignite_Coal, Glass_Crystal, Chipped_Mana_Diamond,
        Chipped_Dragonstone, Chipped_Diamond, Chipped_Emerald, Chipped_Ruby, Chipped_Sapphire, Chipped_Green_Sapphire,
        Chipped_Olivine, Chipped_Topaz, Chipped_Tanzanite, Chipped_Amethyst, Chipped_Opal, Chipped_Jasper,
        Chipped_Spinel, Chipped_Blue_Topaz, Chipped_Amber, Chipped_Red_Garnet, Chipped_Yellow_Garnet,
        Chipped_Glass_Crystal, Flawed_Mana_Diamond, Flawed_Dragonstone, Flawed_Diamond, Flawed_Emerald, Flawed_Ruby,
        Flawed_Sapphire, Flawed_Green_Sapphire, Flawed_Olivine, Flawed_Topaz, Flawed_Tanzanite, Flawed_Amethyst,
        Flawed_Opal, Flawed_Jasper, Flawed_Spinel, Flawed_Blue_Topaz, Flawed_Amber, Flawed_Red_Garnet,
        Flawed_Yellow_Garnet, Flawed_Glass_Crystal, Exquisite_Bismutite, Flawless_Bismutite, Flawed_Bismutite,
        Chipped_Bismutite, Exquisite_Fluor_Buergerite, Flawless_Fluor_Buergerite, Flawed_Fluor_Buergerite,
        Chipped_Fluor_Buergerite, Exquisite_Chromo_Alumino_Povondraite, Flawless_Chromo_Alumino_Povondraite,
        Flawed_Chromo_Alumino_Povondraite, Chipped_Chromo_Alumino_Povondraite, Exquisite_Vanadio_Oxy_Dravite,
        Flawless_Vanadio_Oxy_Dravite, Flawed_Vanadio_Oxy_Dravite, Chipped_Vanadio_Oxy_Dravite, Exquisite_Olenite,
        Flawless_Olenite, Flawed_Olenite, Chipped_Olenite, Exquisite_Red_Zircon, Flawless_Red_Zircon, Flawed_Red_Zircon,
        Chipped_Red_Zircon, Exquisite_Fayalite, Flawless_Fayalite, Flawed_Fayalite, Chipped_Fayalite,
        Exquisite_Forsterite, Flawless_Forsterite, Flawed_Forsterite, Chipped_Forsterite, Exquisite_Hedenbergite,
        Flawless_Hedenbergite, Flawed_Hedenbergite, Chipped_Hedenbergite, Exquisite_Prasiolite, Flawless_Prasiolite,
        Flawed_Prasiolite, Chipped_Prasiolite, Exquisite_BArTiMaEuSNeK, Flawless_BArTiMaEuSNeK, Flawed_BArTiMaEuSNeK,
        Chipped_BArTiMaEuSNeK, Exquisite_Tiberium, Flawless_Tiberium, Flawed_Tiberium, Chipped_Tiberium,
        Exquisite_Fluorspar, Flawless_Fluorspar, Flawed_Fluorspar, Chipped_Fluorspar, Exquisite_Orundum,
        Flawless_Orundum, Flawed_Orundum, Chipped_Orundum, Exquisite_Salt, Flawless_Salt, Flawed_Salt, Chipped_Salt,
        Exquisite_Spodumene, Flawless_Spodumene, Flawed_Spodumene, Chipped_Spodumene, Exquisite_Rock_Salt,
        Flawless_Rock_Salt, Flawed_Rock_Salt, Chipped_Rock_Salt };
}
