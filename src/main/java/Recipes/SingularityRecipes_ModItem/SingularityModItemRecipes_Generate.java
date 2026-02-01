package Recipes.SingularityRecipes_ModItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import cpw.mods.fml.common.registry.GameData;

/**
 * 统一奇点模组物品配方管理器
 * 自动收集和管理所有模组的物品
 */
public class SingularityModItemRecipes_Generate {

    // Mod映射表，key为Mod显示名，value为实际Mod ID
    private static final Map<String, String> MOD_MAPPING = new HashMap<>();

    static {
        // 初始化完整的模组映射表
        MOD_MAPPING.put("AdvancedSolarPanel", "AdvancedSolarPanel");
        MOD_MAPPING.put("AdventureBackpack", "adventurebackpack");
        MOD_MAPPING.put("AE2FluidCraft", "ae2fc");
        MOD_MAPPING.put("AE2Stuff", "ae2stuff");
        MOD_MAPPING.put("AE2WCT", "ae2wct");
        MOD_MAPPING.put("AFSU", "AFSU");
        MOD_MAPPING.put("AkashicTome", "akashictome");
        MOD_MAPPING.put("AlchemyGrate", "alchgrate");
        MOD_MAPPING.put("AmazingTrophies", "amazingtrophies");
        MOD_MAPPING.put("AppliedEnergistics2", "appliedenergistics2");
        MOD_MAPPING.put("ArchitectureCraft", "ArchitectureCraft");
        MOD_MAPPING.put("Automagy", "Automagy");
        MOD_MAPPING.put("Avaritia", "Avaritia");
        MOD_MAPPING.put("AvaritiaAddons", "avaritiaddons");
        MOD_MAPPING.put("Backpack", "Backpack");
        MOD_MAPPING.put("BartWorks", "bartworks");
        MOD_MAPPING.put("Baubles", "Baubles");
        MOD_MAPPING.put("BetterBuildersWands", "betterbuilderswands");
        MOD_MAPPING.put("BetterP2P", "betterp2p");
        MOD_MAPPING.put("BetterQuesting", "betterquesting");
        MOD_MAPPING.put("BiblioCraft", "BiblioCraft");
        MOD_MAPPING.put("BiblioWoodsBoPEdition", "BiblioWoodsBoP");
        MOD_MAPPING.put("BiblioWoodsForestryEdition", "BiblioWoodsForestry");
        MOD_MAPPING.put("BiblioWoodsNaturaEdition", "BiblioWoodsNatura");
        MOD_MAPPING.put("BinnieCore", "BinnieCore");
        MOD_MAPPING.put("BiomesOPlenty", "BiomesOPlenty");
        MOD_MAPPING.put("BloodArsenal", "BloodArsenal");
        MOD_MAPPING.put("BloodMagic", "AWWayofTime");
        MOD_MAPPING.put("Botania", "Botania");
        MOD_MAPPING.put("BotanicHorizons", "botanichorizons");
        MOD_MAPPING.put("Botany", "Botany");
        MOD_MAPPING.put("BuildCraftBuilders", "BuildCraft|Builders");
        MOD_MAPPING.put("BuildCraftCompat", "BuildCraft|Compat");
        MOD_MAPPING.put("BuildCraftCore", "BuildCraft|Core");
        MOD_MAPPING.put("BuildCraftFactory", "BuildCraft|Factory");
        MOD_MAPPING.put("BuildCraftRobotics", "BuildCraft|Robotics");
        MOD_MAPPING.put("BuildCraftSilicon", "BuildCraft|Silicon");
        MOD_MAPPING.put("BuildCraftTransport", "BuildCraft|Transport");
        MOD_MAPPING.put("CarpentersBlocks", "CarpentersBlocks");
        MOD_MAPPING.put("CatWalks", "catwalks");
        MOD_MAPPING.put("Chisel", "chisel");
        MOD_MAPPING.put("CompactKineticGenerators", "compactkineticgenerators");
        MOD_MAPPING.put("Computronics", "computronics");
        MOD_MAPPING.put("CookingForBlockheads", "cookingforblockheads");
        MOD_MAPPING.put("CropsPlusPlus", "berriespp");
        MOD_MAPPING.put("DraconicEvolution", "DraconicEvolution");
        MOD_MAPPING.put("EnderIO", "EnderIO");
        MOD_MAPPING.put("EnderStorage", "EnderStorage");
        MOD_MAPPING.put("EnderZoo", "EnderZoo");
        MOD_MAPPING.put("EnhancedLootBags", "enhancedlootbags");
        MOD_MAPPING.put("EternalSingularity", "eternalsingularity");
        MOD_MAPPING.put("EtFuturumRequiem", "etfuturum");
        MOD_MAPPING.put("ExtraBees", "ExtraBees");
        MOD_MAPPING.put("ExtraTrees", "ExtraTrees");
        MOD_MAPPING.put("ExtraUtilities", "ExtraUtilities");
        MOD_MAPPING.put("FloodLights", "FloodLights");
        MOD_MAPPING.put("ForbiddenMagic", "ForbiddenMagic");
        MOD_MAPPING.put("Forestry", "Forestry");
        MOD_MAPPING.put("ForgeMicroblocks", "ForgeMicroblock");
        MOD_MAPPING.put("Gadomancy", "gadomancy");
        MOD_MAPPING.put("GalacticraftAmunRa", "GalacticraftAmunRa");
        MOD_MAPPING.put("GalacticraftCore", "GalacticraftCore");
        MOD_MAPPING.put("GalacticraftMars", "GalacticraftMars");
        MOD_MAPPING.put("GalaxySpace", "GalaxySpace");
        MOD_MAPPING.put("Gendustry", "gendustry");
        MOD_MAPPING.put("Genetics", "Genetics");
        MOD_MAPPING.put("GGFab", "ggfab");
        MOD_MAPPING.put("GoodGenerator", "GoodGenerator");
        MOD_MAPPING.put("GraviSuite", "GraviSuite");
        MOD_MAPPING.put("GraviSuiteNEO", "gravisuiteneo");
        MOD_MAPPING.put("GregTech", "gregtech");
        MOD_MAPPING.put("GTNHIntergalactic", "gtnhintergalactic");
        MOD_MAPPING.put("GTNHLanthanides", "gtnhlanth");
        MOD_MAPPING.put("GTPlusPlus", "miscutils");
        MOD_MAPPING.put("GTPlusPlusEverglades", "ToxicEverglades");
        MOD_MAPPING.put("HardcoreEnderExpansion", "HardcoreEnderExpansion");
        MOD_MAPPING.put("HoloInventory", "holoinventory");
        MOD_MAPPING.put("IC2NuclearControl", "IC2NuclearControl");
        MOD_MAPPING.put("IguanaTweaksTinkerConstruct", "IguanaTweaksTConstruct");
        MOD_MAPPING.put("IndustrialCraft2", "IC2");
        MOD_MAPPING.put("IronChests", "IronChest");
        MOD_MAPPING.put("IronChestsMinecarts", "ironchestminecarts");
        MOD_MAPPING.put("IronTanks", "irontank");
        MOD_MAPPING.put("IronTanksMinecarts", "irontankminecarts");
        MOD_MAPPING.put("IWillFindYou", "ifu");
        MOD_MAPPING.put("JABBA", "JABBA");
        MOD_MAPPING.put("KekzTech", "kekztech");
        MOD_MAPPING.put("KubaTech", "kubatech");
        MOD_MAPPING.put("LittleTiles", "littletiles");
        MOD_MAPPING.put("LogisticsPipes", "LogisticsPipes");
        MOD_MAPPING.put("LootGames", "lootgames");
        MOD_MAPPING.put("MagicBees", "MagicBees");
        MOD_MAPPING.put("MalisisDoors", "malisisdoors");
        MOD_MAPPING.put("MatterManipulator", "matter-manipulator");
        MOD_MAPPING.put("MCFrames", "MCFrames");
        MOD_MAPPING.put("MineAndBladeBattleGear2", "battlegear2");
        MOD_MAPPING.put("Minecraft", "minecraft");
        MOD_MAPPING.put("Natura", "Natura");
        MOD_MAPPING.put("NaturesCompass", "naturescompass");
        MOD_MAPPING.put("NEIOrePlugin", "gtneioreplugin");
        MOD_MAPPING.put("NodalMechanics", "NodalMechanics");
        MOD_MAPPING.put("NotEnoughEnergistics", "neenergistics");
        MOD_MAPPING.put("OpenBlocks", "OpenBlocks");
        MOD_MAPPING.put("OpenComputers", "OpenComputers");
        MOD_MAPPING.put("OpenGlasses", "openglasses");
        MOD_MAPPING.put("OpenModularTurrets", "openmodularturrets");
        MOD_MAPPING.put("OpenPrinters", "openprinter");
        MOD_MAPPING.put("OpenSecurity", "opensecurity");
        MOD_MAPPING.put("PamsHarvestCraft", "harvestcraft");
        MOD_MAPPING.put("PamsHarvestTheNether", "harvestthenether");
        MOD_MAPPING.put("PersonalSpace", "personalspace");
        MOD_MAPPING.put("ProjectBlue", "ProjectBlue");
        MOD_MAPPING.put("QuestBook", "questbook");
        MOD_MAPPING.put("Railcraft", "Railcraft");
        MOD_MAPPING.put("RandomThings", "RandomThings");
        MOD_MAPPING.put("RemoteIO", "RIO");
        MOD_MAPPING.put("SalisArcana", "salisarcana");
        MOD_MAPPING.put("SGCraft", "SGCraft");
        MOD_MAPPING.put("SleepingBags", "sleepingbag");
        MOD_MAPPING.put("SpiceOfLife", "SpiceOfLife");
        MOD_MAPPING.put("StevesAddons", "StevesAddons");
        MOD_MAPPING.put("StevesCarts2", "StevesCarts");
        MOD_MAPPING.put("StevesFactoryManager", "StevesFactoryManager");
        MOD_MAPPING.put("StorageDrawers", "StorageDrawers");
        MOD_MAPPING.put("StructureLib", "structurelib");
        MOD_MAPPING.put("SuperSolarPanels", "supersolarpanel");
        MOD_MAPPING.put("TaintedMagic", "TaintedMagic");
        MOD_MAPPING.put("TecTech", "tectech");
        MOD_MAPPING.put("Thaumcraft", "Thaumcraft");
        MOD_MAPPING.put("ThaumcraftNEIPlugin", "thaumcraftneiplugin");
        MOD_MAPPING.put("ThaumicBases", "thaumicbases");
        MOD_MAPPING.put("ThaumicBoots", "thaumicboots");
        MOD_MAPPING.put("ThaumicEnergistics", "thaumicenergistics");
        MOD_MAPPING.put("ThaumicExploration", "ThaumicExploration");
        MOD_MAPPING.put("ThaumicHorizons", "ThaumicHorizons");
        MOD_MAPPING.put("ThaumicInsurgence", "thaumicinsurgence");
        MOD_MAPPING.put("ThaumicMachina", "ThaumicMachina");
        MOD_MAPPING.put("ThaumicTinkerer", "ThaumicTinkerer");
        MOD_MAPPING.put("TinkerConstruct", "TConstruct");
        MOD_MAPPING.put("TinkersDefence", "tinkersdefense");
        MOD_MAPPING.put("TinkersGregworks", "TGregworks");
        MOD_MAPPING.put("TinkersMechworks", "TMechworks");
        MOD_MAPPING.put("Translocator", "Translocator");
        MOD_MAPPING.put("TwilightForest", "TwilightForest");
        MOD_MAPPING.put("UniversalSingularities", "universalsingularities");
        MOD_MAPPING.put("VisualProspecting", "visualprospecting");
        MOD_MAPPING.put("WarpTheory", "WarpTheory");
        MOD_MAPPING.put("WirelessRedstoneCBEAddons", "WR-CBE|Addons");
        MOD_MAPPING.put("WirelessRedstoneCBECore", "WR-CBE|Core");
        MOD_MAPPING.put("WirelessRedstoneCBELogic", "WR-CBE|Logic");
        MOD_MAPPING.put("Witchery", "witchery");
        MOD_MAPPING.put("WitchingGadgets", "WitchingGadgets");
        MOD_MAPPING.put("ZTones", "Ztones");
    }

    /**
     * 获取所有创造物品栏中的物品
     */
    public static List<ItemStack> getAllCreativeItems() {
        List<ItemStack> itemStacks = new ArrayList<>();

        // 在1.7.10中，使用GameData.getItemRegistry()
        for (Object temp : GameData.getItemRegistry()) {
            if (!(temp instanceof Item)) continue;
            Item item = (Item) temp;
            List<ItemStack> sub = new ArrayList<>();
            item.getSubItems(item, CreativeTabs.tabAllSearch, sub);
            itemStacks.addAll(sub);
        }

        return itemStacks;
    }

    /**
     * 根据Mod名称获取创造物品栏中的物品
     *
     * @param modDisplayName Mod的显示名称（如"AppliedEnergistics2"）
     * @return 对应Mod的物品列表
     */
    public static List<ItemStack> getCreativeItemsByMod(String modDisplayName) {
        List<ItemStack> allItems = getAllCreativeItems();
        List<ItemStack> modItems = new ArrayList<>();

        // 获取实际的Mod ID
        String actualModId = MOD_MAPPING.get(modDisplayName);
        if (actualModId == null) {
            // 如果没有映射，尝试直接使用传入的名称
            actualModId = modDisplayName.toLowerCase()
                .replace(" ", "");
        }

        for (ItemStack stack : allItems) {
            if (stack.getItem() == null) continue;

            // 获取物品的Mod ID
            String itemModId = getItemModId1710(stack);

            if (actualModId.equalsIgnoreCase(itemModId)) {
                modItems.add(stack);
            }
        }

        return modItems;
    }

    /**
     * List<ItemStack> 转换为 ItemStack[]
     */
    public static ItemStack[] convertListToArray(List<ItemStack> itemList) {
        if (itemList == null) {
            return new ItemStack[0];
        }

        // 直接转换为数组
        ItemStack[] array = new ItemStack[itemList.size()];
        return itemList.toArray(array);
    }

    /**
     * 适用于1.7.10的获取物品所属Mod ID的方法
     */
    private static String getItemModId1710(ItemStack stack) {
        if (stack.getItem() == null) return "";

        // 方法1：通过GameData获取物品的注册名
        Item item = stack.getItem();
        String itemName = GameData.getItemRegistry()
            .getNameForObject(item);

        if (itemName != null && !itemName.isEmpty()) {
            // 1.7.10中注册名格式为 "modID:itemName"
            if (itemName.contains(":")) {
                String[] parts = itemName.split(":");
                if (parts.length >= 1) {
                    return parts[0];
                }
            }
        }

        // 方法2：通过unlocalizedName获取（备用方法）
        String unlocalizedName = item.getUnlocalizedName(stack);
        if (unlocalizedName != null) {
            // 1.7.10中unlocalizedName格式通常为 "item.modID.itemName"
            if (unlocalizedName.contains(".")) {
                String[] parts = unlocalizedName.split("\\.");
                if (parts.length >= 2 && parts[0].equals("item")) {
                    return parts[1];
                }
            }
        }

        // 方法3：尝试从OreDictionary获取信息（备用）
        int[] oreIDs = OreDictionary.getOreIDs(stack);
        if (oreIDs.length > 0) {
            for (int id : oreIDs) {
                String oreName = OreDictionary.getOreName(id);
                if (oreName != null && oreName.contains(":")) {
                    String[] parts = oreName.split(":");
                    if (parts.length >= 2) {
                        // 有时矿辞会包含Mod信息，如"ingotCopper"，但不确定Mod
                        return ""; // 矿辞通常不包含Mod信息
                    }
                }
            }
        }

        return "";
    }

    /**
     * 获取所有已注册的Mod物品（按Mod分组）
     */
    public static Map<String, List<ItemStack>> getCreativeItemsByAllMods() {
        Map<String, List<ItemStack>> modItemsMap = new HashMap<>();
        List<ItemStack> allItems = getAllCreativeItems();

        for (ItemStack stack : allItems) {
            if (stack.getItem() == null) continue;

            String modId = getItemModId1710(stack);
            if (!modId.isEmpty()) {
                // 查找对应的显示名称
                String displayName = getDisplayNameByModId(modId);

                modItemsMap.computeIfAbsent(displayName, k -> new ArrayList<>())
                    .add(stack);
            }
        }

        return modItemsMap;
    }

    /**
     * 根据Mod ID获取显示名称
     */
    private static String getDisplayNameByModId(String modId) {
        // 先查找映射表中的显示名称
        for (Map.Entry<String, String> entry : MOD_MAPPING.entrySet()) {
            if (entry.getValue()
                .equalsIgnoreCase(modId)) {
                return entry.getKey();
            }
        }

        // 如果没有找到映射，返回Mod ID（首字母大写）
        if (modId != null && !modId.isEmpty()) {
            return modId.substring(0, 1)
                .toUpperCase() + modId.substring(1);
        }

        return "Unknown";
    }

    /**
     * 调试方法：打印物品的Mod信息
     */
    public static void printItemModInfo(ItemStack stack) {
        if (stack.getItem() == null) {
            System.out.println("ItemStack has null Item");
            return;
        }

        Item item = stack.getItem();
        String itemName = GameData.getItemRegistry()
            .getNameForObject(item);
        String unlocalizedName = item.getUnlocalizedName(stack);

        System.out.println("Item: " + stack.getDisplayName());
        System.out.println("  Registry Name: " + itemName);
        System.out.println("  Unlocalized Name: " + unlocalizedName);
        System.out.println("  Detected Mod ID: " + getItemModId1710(stack));
    }

    /**
     * 获取特定物品的Mod ID（直接方法）
     */
    public static String getModIdForItemStack(ItemStack stack) {
        return getItemModId1710(stack);
    }
}
