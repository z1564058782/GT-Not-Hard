package Tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class NEIConverter {

    // Mod映射关系
    private static final Map<String, String> MOD_MAPPING = new HashMap<>();

    static {
        // 初始化映射关系
        MOD_MAPPING.put("ae2fc", "AE2FluidCraft");
        MOD_MAPPING.put("AFSU", "AFSU");
        MOD_MAPPING.put("adventurebackpack", "AdventureBackpack");
        MOD_MAPPING.put("akashictome", "AkashicTome");
        MOD_MAPPING.put("alchgrate", "AlchemyGrate");
        MOD_MAPPING.put("amazingtrophies", "AmazingTrophies");
        MOD_MAPPING.put("angelica", "Angelica");
        MOD_MAPPING.put("angermod", "AngerMod");
        MOD_MAPPING.put("AppleCore", "AppleCore");
        MOD_MAPPING.put("appliedenergistics2", "AppliedEnergistics2");
        MOD_MAPPING.put("ArchitectureCraft", "ArchitectureCraft");
        MOD_MAPPING.put("asielib", "AsieLib");
        MOD_MAPPING.put("Avaritia", "Avaritia");
        MOD_MAPPING.put("avaritiaddons", "AvaritiaAddons");
        MOD_MAPPING.put("battlegear2", "MineAndBladeBattleGear2");
        MOD_MAPPING.put("backhand", "Backhand");
        MOD_MAPPING.put("Baubles", "Baubles");
        MOD_MAPPING.put("beebetteratbees", "BeeBetterAtBees");
        MOD_MAPPING.put("BetterAchievements", "BetterAchievements");
        MOD_MAPPING.put("betterbuilderswands", "BetterBuildersWands");
        MOD_MAPPING.put("bettercrashes", "BetterCrashes");
        MOD_MAPPING.put("betterloadingscreen", "BetterLoadingScreen");
        MOD_MAPPING.put("betterp2p", "BetterP2P");
        MOD_MAPPING.put("betterquesting", "BetterQuesting");
        MOD_MAPPING.put("BinnieCore", "BinnieCore");
        MOD_MAPPING.put("Botany", "Botany");
        MOD_MAPPING.put("ExtraBees", "ExtraBees");
        MOD_MAPPING.put("ExtraTrees", "ExtraTrees");
        MOD_MAPPING.put("Genetics", "Genetics");
        MOD_MAPPING.put("blocklimiter", "BlockLimiter");
        MOD_MAPPING.put("blockrenderer6343", "BlockRenderer6343");
        MOD_MAPPING.put("BloodArsenal", "BloodArsenal");
        MOD_MAPPING.put("AWWayofTime", "BloodMagic");
        MOD_MAPPING.put("Botania", "Botania");
        MOD_MAPPING.put("botanichorizons", "BotanicHorizons");
        MOD_MAPPING.put("BrandonsCore", "BrandonsCore");
        MOD_MAPPING.put("BuildCraft|Core", "BuildCraftCore");
        MOD_MAPPING.put("BuildCraft|Builders", "BuildCraftBuilders");
        MOD_MAPPING.put("BuildCraft|Factory", "BuildCraftFactory");
        MOD_MAPPING.put("BuildCraft|Robotics", "BuildCraftRobotics");
        MOD_MAPPING.put("BuildCraft|Silicon", "BuildCraftSilicon");
        MOD_MAPPING.put("BuildCraft|Transport", "BuildCraftTransport");
        MOD_MAPPING.put("BuildCraft|Compat", "BuildCraftCompat");
        MOD_MAPPING.put("OilTweak", "BuildCraftOilTweak");
        MOD_MAPPING.put("CarpentersBlocks", "CarpentersBlocks");
        MOD_MAPPING.put("catwalks", "CatWalks");
        MOD_MAPPING.put("chisel", "Chisel");
        MOD_MAPPING.put("chiseltones", "ChiselTones");
        MOD_MAPPING.put("CodeChickenCore", "CodeChickenCore");
        MOD_MAPPING.put("computronics", "Computronics");
        MOD_MAPPING.put("controlling", "Controlling");
        MOD_MAPPING.put("cookingforblockheads", "CookingForBlockheads");
        MOD_MAPPING.put("coretweaks", "CoreTweaks");
        MOD_MAPPING.put("MineTweaker3", "CraftTweaker");
        MOD_MAPPING.put("creativecore", "CreativeCore");
        MOD_MAPPING.put("croploadcore", "CropLoadCore");
        MOD_MAPPING.put("berriespp", "CropsPlusPlus");
        MOD_MAPPING.put("custommainmenu", "CustomMainMenu");
        MOD_MAPPING.put("darkerer", "Darkerer");
        MOD_MAPPING.put("defaultkeys", "DefaultConfigs");
        MOD_MAPPING.put("defaultserverlist", "DefaultServerList");
        MOD_MAPPING.put("defaultworldgenerator", "DefaultWorldGenerator");
        MOD_MAPPING.put("DraconicEvolution", "DraconicEvolution");
        MOD_MAPPING.put("DummyCore", "DummyCore");
        MOD_MAPPING.put("duradisplay", "DuraDisplay");
        MOD_MAPPING.put("EMT", "ElectroMagicTools");
        MOD_MAPPING.put("endercore", "EnderCore");
        MOD_MAPPING.put("EnderIO", "EnderIO");
        MOD_MAPPING.put("EnderStorage", "EnderStorage");
        MOD_MAPPING.put("EnderZoo", "EnderZoo");
        MOD_MAPPING.put("enhancedlootbags", "EnhancedLootBags");
        MOD_MAPPING.put("etfuturum", "EtFuturumRequiem");
        MOD_MAPPING.put("eternalsingularity", "EternalSingularity");
        MOD_MAPPING.put("findit", "FindIt");
        MOD_MAPPING.put("FloodLights", "FloodLights");
        MOD_MAPPING.put("ForbiddenMagic", "ForbiddenMagic");
        MOD_MAPPING.put("Forestry", "Forestry");
        MOD_MAPPING.put("ForgeMicroblock", "ForgeMicroblocks");
        MOD_MAPPING.put("ForgeRelocation", "ForgeRelocation");
        MOD_MAPPING.put("forgelin", "Forgelin");
        MOD_MAPPING.put("gregtech", "GregTech");
        MOD_MAPPING.put("bartworks", "BartWorks");
        MOD_MAPPING.put("detravscannermod", "DetravScannerMod");
        MOD_MAPPING.put("galacticgreg", "GalactiGreg");
        MOD_MAPPING.put("ggfab", "GGFab");
        MOD_MAPPING.put("GoodGenerator", "GoodGenerator");
        MOD_MAPPING.put("gtnhlanth", "GTNHLanthanides");
        MOD_MAPPING.put("miscutils", "GTPlusPlus");
        MOD_MAPPING.put("ToxicEverglades", "GTPlusPlusEverglades");
        MOD_MAPPING.put("kekztech", "KekzTech");
        MOD_MAPPING.put("kubatech", "KubaTech");
        MOD_MAPPING.put("gtneioreplugin", "NEIOrePlugin");
        MOD_MAPPING.put("tectech", "TecTech");
        MOD_MAPPING.put("gtnhintergalactic", "GTNHIntergalactic");
        MOD_MAPPING.put("gtnhtcwands", "GTNHTCWands");
        MOD_MAPPING.put("gtnhlib", "GTNHLib");
        MOD_MAPPING.put("gadomancy", "Gadomancy");
        MOD_MAPPING.put("GalacticraftCore", "GalacticraftCore");
        MOD_MAPPING.put("GalacticraftMars", "GalacticraftMars");
        MOD_MAPPING.put("GalaxySpace", "GalaxySpace");
        MOD_MAPPING.put("gravisuiteneo", "GraviSuiteNEO");
        MOD_MAPPING.put("HardcoreEnderExpansion", "HardcoreEnderExpansion");
        MOD_MAPPING.put("HelpFixer", "HelpFixer");
        MOD_MAPPING.put("hodgepodge", "HodgePodge");
        MOD_MAPPING.put("holoinventory", "HoloInventory");
        MOD_MAPPING.put("hydroenergy", "HydroEnergy");
        MOD_MAPPING.put("ifu", "IWillFindYou");
        MOD_MAPPING.put("IguanaTweaksTConstruct", "IguanaTweaksTinkerConstruct");
        MOD_MAPPING.put("InGameInfoXML", "InGameInfoXML");
        MOD_MAPPING.put("InfernalMobs", "InfernalMobs");
        MOD_MAPPING.put("bogosorter", "InventoryBogoSorter");
        MOD_MAPPING.put("ironchestminecarts", "IronChestsMinecarts");
        MOD_MAPPING.put("irontankminecarts", "IronTanksMinecarts");
        MOD_MAPPING.put("irontank", "IronTanks");
        MOD_MAPPING.put("JABBA", "JABBA");
        MOD_MAPPING.put("littletiles", "LittleTiles");
        MOD_MAPPING.put("LogisticsPipes", "LogisticsPipes");
        MOD_MAPPING.put("lootgames", "LootGames");
        MOD_MAPPING.put("LunatriusCore", "LunatriusCore");
        MOD_MAPPING.put("MagicBees", "MagicBees");
        MOD_MAPPING.put("malisisdoors", "MalisisDoors");
        MOD_MAPPING.put("Mantle", "Mantle");
        MOD_MAPPING.put("matter-manipulator", "MatterManipulator");
        MOD_MAPPING.put("Backpack", "Backpack");
        MOD_MAPPING.put("GTTweaker", "MintetweakerGT5Addon");
        MOD_MAPPING.put("mobsinfo", "MobsInfo");
        MOD_MAPPING.put("modtweaker2", "ModTweaker");
        MOD_MAPPING.put("modularui", "ModularUI");
        MOD_MAPPING.put("modularui2", "ModularUI2");
        MOD_MAPPING.put("MrTJPCoreMod", "MrTJPCore");
        MOD_MAPPING.put("neiintegration", "NEIIntegration");
        MOD_MAPPING.put("Natura", "Natura");
        MOD_MAPPING.put("naturescompass", "NaturesCompass");
        MOD_MAPPING.put("navigator", "Navigator");
        MOD_MAPPING.put("netherportalfix", "NetherPortalFix");
        MOD_MAPPING.put("dreamcraft", "NewHorizonsCoreMod");
        MOD_MAPPING.put("NodalMechanics", "NodalMechanics");
        MOD_MAPPING.put("neenergistics", "NotEnoughEnergistics");
        MOD_MAPPING.put("neid", "NotEnoughIDs");
        MOD_MAPPING.put("NotEnoughItems", "NotEnoughItems");
        MOD_MAPPING.put("IC2NuclearControl", "IC2NuclearControl");
        MOD_MAPPING.put("nutrition", "Nutrition");
        MOD_MAPPING.put("openglasses", "OpenGlasses");
        MOD_MAPPING.put("OpenBlocks", "OpenBlocks");
        MOD_MAPPING.put("OpenComputers", "OpenComputers");
        MOD_MAPPING.put("OpenMods", "OpenModsLib");
        MOD_MAPPING.put("openmodularturrets", "OpenModularTurrets");
        MOD_MAPPING.put("openprinter", "OpenPrinters");
        MOD_MAPPING.put("opensecurity", "OpenSecurity");
        MOD_MAPPING.put("Opis", "Opis");
        MOD_MAPPING.put("overloadedarmorbar", "OverloadedArmorBar");
        MOD_MAPPING.put("personalspace", "PersonalSpace");
        MOD_MAPPING.put("PlayerAPI", "PlayerAPI");
        MOD_MAPPING.put("postea", "Postea");
        MOD_MAPPING.put("ProjectBlue", "ProjectBlue");
        MOD_MAPPING.put("ProjRed|Core", "ProjectRedCore");
        MOD_MAPPING.put("ProjRed|Expansion", "ProjectRedExpansion");
        MOD_MAPPING.put("ProjRed|Exploration", "ProjectRedExploration");
        MOD_MAPPING.put("ProjRed|Fabrication", "ProjectRedFabrication");
        MOD_MAPPING.put("ProjRed|Illumination", "ProjectRedIllumination");
        MOD_MAPPING.put("ProjRed|Integration", "ProjectRedIntegration");
        MOD_MAPPING.put("ProjRed|Transmission", "ProjectRedTransmission");
        MOD_MAPPING.put("ProjRed|Transportation", "ProjectRedTransportation");
        MOD_MAPPING.put("Railcraft", "Railcraft");
        MOD_MAPPING.put("RandomThings", "RandomThings");
        MOD_MAPPING.put("RWG", "RWG");
        MOD_MAPPING.put("RIO", "RemoteIO");
        MOD_MAPPING.put("Roguelike", "RoguelikeDungeons");
        MOD_MAPPING.put("StevesCarts", "StevesCarts2");
        MOD_MAPPING.put("SGCraft", "SGCraft");
        MOD_MAPPING.put("salisarcana", "SalisArcana");
        MOD_MAPPING.put("Schematica", "Schematica");
        MOD_MAPPING.put("serverutilities", "ServerUtilities");
        MOD_MAPPING.put("sharewhereiam", "ShareWhereIAm");
        MOD_MAPPING.put("sleepingbag", "SleepingBags");
        MOD_MAPPING.put("SpecialMobs", "SpecialMobs");
        MOD_MAPPING.put("SpiceOfLife", "SpiceOfLife");
        MOD_MAPPING.put("StevesFactoryManager", "StevesFactoryManager");
        MOD_MAPPING.put("StevesAddons", "StevesAddons");
        MOD_MAPPING.put("StorageDrawers", "StorageDrawers");
        MOD_MAPPING.put("structurecompat", "StructureCompat");
        MOD_MAPPING.put("structurelib", "StructureLib");
        MOD_MAPPING.put("SuperTic", "SuperTiC");
        MOD_MAPPING.put("tcneiadditions", "TCNEIAdditions");
        MOD_MAPPING.put("tcnodetracker", "TCNodeTracker");
        MOD_MAPPING.put("txloader", "TXLoader");
        MOD_MAPPING.put("TaintedMagic", "TaintedMagic");
        MOD_MAPPING.put("ThaumcraftMobAspects", "ThaumcraftMobAspects");
        MOD_MAPPING.put("thaumicbases", "ThaumicBases");
        MOD_MAPPING.put("thaumicboots", "ThaumicBoots");
        MOD_MAPPING.put("thaumicenergistics", "ThaumicEnergistics");
        MOD_MAPPING.put("ThaumicHorizons", "ThaumicHorizons");
        MOD_MAPPING.put("ThaumicTinkerer", "ThaumicTinkerer");
        MOD_MAPPING.put("ThaumicExploration", "ThaumicExploration");
        MOD_MAPPING.put("TiCTooltips", "TiCTooltips");
        MOD_MAPPING.put("tinkersdefense", "TinkersDefence");
        MOD_MAPPING.put("TConstruct", "TinkerConstruct");
        MOD_MAPPING.put("TMechworks", "TinkersMechworks");
        MOD_MAPPING.put("TML", "TooMuchLoot");
        MOD_MAPPING.put("torohealthmod", "ToroHealth");
        MOD_MAPPING.put("Translocator", "Translocator");
        MOD_MAPPING.put("universalsingularities", "UniversalSingularities");
        MOD_MAPPING.put("visualprospecting", "VisualProspecting");
        MOD_MAPPING.put("wailaplugins", "WailaPlugins");
        MOD_MAPPING.put("WailaHarvestability", "WailaHarvestability");
        MOD_MAPPING.put("wanionlib", "WanionLib");
        MOD_MAPPING.put("WarpTheory", "WarpTheory");
        MOD_MAPPING.put("ae2wct", "AE2WCT");
        MOD_MAPPING.put("WR-CBE|Core", "WirelessRedstoneCBECore");
        MOD_MAPPING.put("WR-CBE|Addons", "WirelessRedstoneCBEAddons");
        MOD_MAPPING.put("WR-CBE|Logic", "WirelessRedstoneCBELogic");
        MOD_MAPPING.put("WitcheryExtras", "WitcheryExtras");
        MOD_MAPPING.put("WitchingGadgets", "WitchingGadgets");
        MOD_MAPPING.put("YAMCore", "YAMCore");
        MOD_MAPPING.put("ae2stuff", "AE2Stuff");
        MOD_MAPPING.put("GalacticraftAmunRa", "GalacticraftAmunRa");
        MOD_MAPPING.put("bdlib", "BDLib");
        MOD_MAPPING.put("gendustry", "Gendustry");
        MOD_MAPPING.put("harvestcraft", "PamsHarvestCraft");
        MOD_MAPPING.put("IronChest", "IronChests");
        MOD_MAPPING.put("lwjgl3ify", "LWJGL3ify");
        MOD_MAPPING.put("neicustomdiagram", "NEICustomDiagrams");
        MOD_MAPPING.put("NEIAddons", "NEIAddons");
        MOD_MAPPING.put("oauth", "OAuth");
        MOD_MAPPING.put("supersolarpanel", "SuperSolarPanels");
        MOD_MAPPING.put("ThaumcraftResearchTweaks", "ThaumcraftResearchTweaks");
        MOD_MAPPING.put("thaumicinsurgence", "ThaumicInsurgence");
        MOD_MAPPING.put("TwilightForest", "TwilightForest");
        MOD_MAPPING.put("Waila", "Waila");
        MOD_MAPPING.put("AdvancedSolarPanel", "AdvancedSolarPanel");
        MOD_MAPPING.put("archaicfix", "ArchaicFix");
        MOD_MAPPING.put("Automagy", "Automagy");
        MOD_MAPPING.put("BiblioCraft", "BiblioCraft");
        MOD_MAPPING.put("BiblioWoodsBoP", "BiblioWoodsBoPEdition");
        MOD_MAPPING.put("BiblioWoodsForestry", "BiblioWoodsForestryEdition");
        MOD_MAPPING.put("BiblioWoodsNatura", "BiblioWoodsNaturaEdition");
        MOD_MAPPING.put("BiomesOPlenty", "BiomesOPlenty");
        MOD_MAPPING.put("bugtorch", "BugTorch");
        MOD_MAPPING.put("CoFHCore", "COFHCore");
        MOD_MAPPING.put("compactkineticgenerators", "CompactKineticGenerators");
        MOD_MAPPING.put("craftpresence", "CraftPresence");
        MOD_MAPPING.put("ExtraUtilities", "ExtraUtilities");
        MOD_MAPPING.put("GraviSuite", "GraviSuite");
        MOD_MAPPING.put("HungerOverhaul", "HungerOverhaul");
        MOD_MAPPING.put("Ic2Nei", "IC2CropPlugin");
        MOD_MAPPING.put("IC2", "IndustrialCraft2");
        MOD_MAPPING.put("journeymap", "JourneyMap");
        MOD_MAPPING.put("Morpheus", "Morpheus");
        MOD_MAPPING.put("harvestthenether", "PamsHarvestTheNether");
        MOD_MAPPING.put("tc4tweak", "TC4Tweaks");
        MOD_MAPPING.put("thaumcraftneiplugin", "ThaumcraftNEIPlugin");
        MOD_MAPPING.put("Thaumcraft", "Thaumcraft");
        MOD_MAPPING.put("ThaumicMachina", "ThaumicMachina");
        MOD_MAPPING.put("TGregworks", "TinkersGregworks");
        MOD_MAPPING.put("unilib", "UniLib");
        MOD_MAPPING.put("unimixins", "UniMixins");
        MOD_MAPPING.put("witchery", "Witchery");
        MOD_MAPPING.put("Ztones", "ZTones");
        MOD_MAPPING.put("minecraft", "Minecraft");
        MOD_MAPPING.put("Aroma1997Core", "Aroma1997Core");
        MOD_MAPPING.put("extracells", "ExtraCells2");
        MOD_MAPPING.put("MCFrames", "MCFrames");
        MOD_MAPPING.put("Metallurgy", "Metallurgy");
        MOD_MAPPING.put("questbook", "QuestBook");
        MOD_MAPPING.put("RotaryCraft", "RotaryCraft");
        MOD_MAPPING.put("TravellersGear", "TravellersGear");
        MOD_MAPPING.put("UndergroundBiomes", "UndergroundBiomes");
    }

    /**
     * 获取Mod的ID常量名
     */
    private static String getModIDConstant(String modID) {
        return MOD_MAPPING.getOrDefault(modID, modID) + ".ID";
    }

    /**
     * 处理一行CSV数据
     */
    private static String processLine(String line) {
        String[] parts = line.split(",");
        if (parts.length < 5) {
            return "";
        }

        // 提取字段
        String itemName = parts[0];
        // String itemID = parts[1]; // 不需要使用
        String itemMeta = parts[2];
        // String hasNBT = parts[3]; // 不需要使用
        String displayName = parts[4];

        // 解析Item Name获取modID和itemID
        String[] itemNameParts = itemName.split(":");
        if (itemNameParts.length != 2) {
            return "";
        }

        String modID = itemNameParts[0];
        String itemID = itemNameParts[1];

        // 构建注释
        String comment;
        if (displayName.contains("\"")) {
            // 如果包含引号，则使用单引号
            comment = "// '" + displayName + "'";
        } else {
            comment = "// \"" + displayName + "\"";
        }

        // 构建getModItem方法调用
        StringBuilder result = new StringBuilder();
        result.append(comment)
            .append("\n");

        if ("0".equals(itemMeta)) {
            result.append("getModItem(")
                .append(getModIDConstant(modID))
                .append(", \"")
                .append(itemID)
                .append("\", 1L),");
        } else {
            result.append("getModItem(")
                .append(getModIDConstant(modID))
                .append(", \"")
                .append(itemID)
                .append("\", 1L, ")
                .append(itemMeta)
                .append("),");
        }

        return result.toString();
    }

    /**
     * 从资源目录读取文件
     */
    private static BufferedReader getResourceReader(String resourcePath) throws IOException {
        // 尝试从类路径获取资源
        ClassLoader classLoader = NEIConverter.class.getClassLoader();
        URL resourceUrl = classLoader.getResource(resourcePath);

        if (resourceUrl != null) {
            // 从资源目录读取
            return new BufferedReader(new InputStreamReader(resourceUrl.openStream(), StandardCharsets.UTF_8));
        } else {
            // 尝试从文件系统读取
            return Files.newBufferedReader(Paths.get(resourcePath), StandardCharsets.UTF_8);
        }
    }

    /**
     * 转换整个CSV文件
     */
    public static void convertCSV(String inputPath, String outputPath) {
        // 检查是否为资源路径（不以盘符开头且不是绝对路径）
        boolean isResourcePath = !inputPath.matches("^[a-zA-Z]:.*") && !Paths.get(inputPath)
            .isAbsolute();

        try (BufferedReader reader = isResourcePath ? getResourceReader(inputPath)
            : Files.newBufferedReader(Paths.get(inputPath), StandardCharsets.UTF_8)) {

            // 如果未指定输出路径，则自动生成
            if (outputPath == null || outputPath.isEmpty()) {
                String fileName = new File(inputPath).getName();
                String baseName = fileName.substring(0, fileName.lastIndexOf('.'));
                String projectRoot = System.getProperty("user.dir");
                outputPath = projectRoot + File.separator + "output" + File.separator + baseName + "_converted.txt";

                // 确保输出目录存在
                File outputDir = new File(projectRoot + File.separator + "output");
                if (!outputDir.exists()) {
                    outputDir.mkdirs();
                }
            }

            try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputPath), StandardCharsets.UTF_8)) {

                String line;
                boolean isFirstLine = true;
                int count = 0;

                while ((line = reader.readLine()) != null) {
                    // 跳过第一行（标题行）
                    if (isFirstLine) {
                        isFirstLine = false;
                        continue;
                    }

                    String convertedLine = processLine(line);
                    if (!convertedLine.isEmpty()) {
                        writer.write(convertedLine);
                        writer.newLine();
                        count++;
                    }
                }

                System.out.println("转换完成！共处理 " + count + " 行数据。");
                System.out.println("输出文件: " + outputPath);

            }

        } catch (IOException e) {
            System.err.println("文件处理出错: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 主方法 - 支持资源目录和文件系统路径
     */
    public static void main(String[] args) {
        // 方式1：使用资源目录路径（推荐）
        String inputPath = "Tools_InputFile/itempanel_280_Ingot.csv";

        // 方式2：使用相对路径（相对于项目根目录）
        // String inputPath = "src/main/resources/Tools_InputFile/itempanel_280_Ingot.csv";

        // 方式3：使用绝对路径
        // String inputPath = "C:/YourProject/src/main/resources/Tools_InputFile/itempanel_280_Ingot.csv";

        // 输出路径（留空则自动生成到项目根目录的output文件夹）
        String outputPath = "src/main/resources/Tools_OutputFile/itempanel_280_Ingot_converted.txt";

        System.out.println("=== NEI CSV转换工具 ===");
        System.out.println("输入文件: " + inputPath);

        if (outputPath.isEmpty()) {
            System.out.println("输出文件: 自动生成到项目根目录的output文件夹");
        } else {
            System.out.println("输出文件: " + outputPath);
        }

        // 显示当前工作目录，帮助调试
        System.out.println("当前工作目录: " + System.getProperty("user.dir"));

        convertCSV(inputPath, outputPath);

        System.out.println("程序执行完毕！");
    }
}
