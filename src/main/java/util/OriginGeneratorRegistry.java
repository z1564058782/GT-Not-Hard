package util;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Acid;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Combustion;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Gas;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Magic;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Naquadah;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Nuclear;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Plasma;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Rocket;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Semifluid;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Solar;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Steam;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_UCFE;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Water;
import cpw.mods.fml.common.registry.GameRegistry;
import gregtech.api.enums.Mods;
import gregtech.api.recipe.RecipeMap;

/** Origin's supported selectors, fuel maps and output multipliers. */
public final class OriginGeneratorRegistry {

    public static final long LV_TIER = 32;
    public static final long MV_TIER = 128;
    public static final long HV_TIER = 512;
    public static final long EV_TIER = 2_048;
    public static final long IV_TIER = 8_192;
    public static final long LUV_TIER = 32_768;
    public static final long ZPM_TIER = 131_072;
    public static final long UV_TIER = 524_288;
    public static final long UHV_TIER = 2_097_152;
    public static final long UEV_TIER = 8_388_608;
    public static final long UIV_TIER = 33_554_432;
    public static final long UMV_TIER = 134_217_728;
    public static final long UXV_TIER = 536_870_912;
    public static final long MAX_TIER = 2_147_483_640L;

    public enum GeneratorType {

        STEAM(() -> OriginGeneratorRecipes_Steam.GeneratorRecipes_Steam,
            OriginGeneratorRecipes_Steam::addGeneratorRecipes_Steam),
        SEMIFLUID(() -> OriginGeneratorRecipes_Semifluid.GeneratorRecipes_Semifluid,
            OriginGeneratorRecipes_Semifluid::addGeneratorRecipes_Semifluid),
        COMBUSTION(() -> OriginGeneratorRecipes_Combustion.GeneratorRecipes_Combustion,
            OriginGeneratorRecipes_Combustion::addGeneratorRecipes_Combustion),
        PLASMA(() -> OriginGeneratorRecipes_Plasma.GeneratorRecipes_Plasma,
            OriginGeneratorRecipes_Plasma::addGeneratorRecipes_Plasma),
        ROCKET(() -> OriginGeneratorRecipes_Rocket.GeneratorRecipes_Rocket,
            OriginGeneratorRecipes_Rocket::addGeneratorRecipes_Rocket),
        GAS(() -> OriginGeneratorRecipes_Gas.GeneratorRecipes_Gas, OriginGeneratorRecipes_Gas::addGeneratorRecipes_Gas),
        UCFE(() -> OriginGeneratorRecipes_UCFE.GeneratorRecipes_UCFE,
            OriginGeneratorRecipes_UCFE::addGeneratorRecipes_UCFE),
        MAGIC(() -> OriginGeneratorRecipes_Magic.GeneratorRecipes_Magic,
            OriginGeneratorRecipes_Magic::addGeneratorRecipes_Magic),
        NAQUADAH(() -> OriginGeneratorRecipes_Naquadah.GeneratorRecipes_Naquadah,
            OriginGeneratorRecipes_Naquadah::addGeneratorRecipes_Naquadah),
        NUCLEAR(() -> OriginGeneratorRecipes_Nuclear.GeneratorRecipes_Nuclear,
            OriginGeneratorRecipes_Nuclear::addGeneratorRecipes_Nuclear),
        ACID(() -> OriginGeneratorRecipes_Acid.GeneratorRecipes_Acid,
            OriginGeneratorRecipes_Acid::addGeneratorRecipes_Acid),
        WATER(() -> OriginGeneratorRecipes_Water.GeneratorRecipes_Water,
            OriginGeneratorRecipes_Water::addGeneratorRecipes_Water),
        SOLAR(() -> OriginGeneratorRecipes_Solar.GeneratorRecipes_Solar,
            OriginGeneratorRecipes_Solar::addGeneratorRecipes_Solar);

        private final Supplier<RecipeMap<?>> recipeMap;
        private final Runnable loader;

        GeneratorType(Supplier<RecipeMap<?>> recipeMap, Runnable loader) {
            this.recipeMap = recipeMap;
            this.loader = loader;
        }

        public RecipeMap<?> getRecipeMap() {
            return recipeMap.get();
        }
    }

    private static final Map<Integer, Definition> DEFINITIONS;
    private static final List<Integer> GENERATOR_IDS;
    private static boolean recipesRegistered;

    static {
        Map<Integer, Definition> definitions = new LinkedHashMap<>();
        add(definitions, GeneratorType.STEAM, LV_TIER, 753, 1120);
        add(definitions, GeneratorType.STEAM, MV_TIER, 754, 1121);
        add(definitions, GeneratorType.STEAM, HV_TIER, 755, 1122);
        add(definitions, GeneratorType.STEAM, IV_TIER, 1131, 1152, 32016);
        add(definitions, GeneratorType.STEAM, ZPM_TIER, 865, 866, 31076);

        add(definitions, GeneratorType.SEMIFLUID, LV_TIER, 837);
        add(definitions, GeneratorType.SEMIFLUID, MV_TIER, 838);
        add(definitions, GeneratorType.SEMIFLUID, HV_TIER, 839);
        add(definitions, GeneratorType.SEMIFLUID, EV_TIER, 993);
        add(definitions, GeneratorType.SEMIFLUID, IV_TIER, 994);
        add(definitions, GeneratorType.SEMIFLUID, ZPM_TIER, 31026);

        add(definitions, GeneratorType.COMBUSTION, LV_TIER, 1110);
        add(definitions, GeneratorType.COMBUSTION, MV_TIER, 1111);
        add(definitions, GeneratorType.COMBUSTION, HV_TIER, 1112);
        add(definitions, GeneratorType.COMBUSTION, EV_TIER, 1113);
        add(definitions, GeneratorType.COMBUSTION, IV_TIER, 1114);
        add(definitions, GeneratorType.COMBUSTION, ZPM_TIER, 1171);

        add(definitions, GeneratorType.PLASMA, EV_TIER, 1196);
        add(definitions, GeneratorType.PLASMA, IV_TIER, 1197);
        add(definitions, GeneratorType.PLASMA, LUV_TIER, 1198);
        add(definitions, GeneratorType.PLASMA, ZPM_TIER, 10752);
        add(definitions, GeneratorType.PLASMA, UV_TIER, 10753);
        add(definitions, GeneratorType.PLASMA, UEV_TIER, 1153);
        add(definitions, GeneratorType.PLASMA, UMV_TIER, 31074);

        add(definitions, GeneratorType.ROCKET, EV_TIER, 793);
        add(definitions, GeneratorType.ROCKET, IV_TIER, 794);
        add(definitions, GeneratorType.ROCKET, LUV_TIER, 795);
        add(definitions, GeneratorType.ROCKET, UV_TIER, 996);

        add(definitions, GeneratorType.GAS, LV_TIER, 1115);
        add(definitions, GeneratorType.GAS, MV_TIER, 1116);
        add(definitions, GeneratorType.GAS, HV_TIER, 1117);
        add(definitions, GeneratorType.GAS, EV_TIER, 1118);
        add(definitions, GeneratorType.GAS, IV_TIER, 1119);
        add(definitions, GeneratorType.GAS, ZPM_TIER, 13101);
        add(definitions, GeneratorType.GAS, UHV_TIER, 13102);
        add(definitions, GeneratorType.GAS, UIV_TIER, 1151);
        add(definitions, GeneratorType.GAS, UXV_TIER, 31073);

        add(definitions, GeneratorType.UCFE, MAX_TIER, 32001);

        add(definitions, GeneratorType.MAGIC, LV_TIER, 1123);
        add(definitions, GeneratorType.MAGIC, MV_TIER, 1124);
        add(definitions, GeneratorType.MAGIC, HV_TIER, 1125);
        add(definitions, GeneratorType.MAGIC, EV_TIER, 1127);
        add(definitions, GeneratorType.MAGIC, IV_TIER, 1128);
        add(definitions, GeneratorType.MAGIC, LUV_TIER, 1129);
        add(definitions, GeneratorType.MAGIC, ZPM_TIER, 1130);

        add(definitions, GeneratorType.NAQUADAH, EV_TIER, 1190);
        add(definitions, GeneratorType.NAQUADAH, IV_TIER, 1191);
        add(definitions, GeneratorType.NAQUADAH, LUV_TIER, 1192);
        add(definitions, GeneratorType.NAQUADAH, ZPM_TIER, 1188);
        add(definitions, GeneratorType.NAQUADAH, UV_TIER, 1189);
        add(definitions, GeneratorType.NAQUADAH, MAX_TIER, 12732);

        add(definitions, GeneratorType.NUCLEAR, IV_TIER, 5);

        add(definitions, GeneratorType.ACID, LV_TIER, 12793);
        add(definitions, GeneratorType.ACID, MV_TIER, 12726);
        add(definitions, GeneratorType.ACID, HV_TIER, 12727);
        add(definitions, GeneratorType.ACID, EV_TIER, 12728);

        add(definitions, GeneratorType.WATER, MV_TIER, 17019);
        add(definitions, GeneratorType.WATER, HV_TIER, 17020);
        add(definitions, GeneratorType.WATER, EV_TIER, 17021);
        add(definitions, GeneratorType.WATER, IV_TIER, 17022);
        add(definitions, GeneratorType.WATER, LUV_TIER, 17023);
        add(definitions, GeneratorType.WATER, ZPM_TIER, 17024);
        add(definitions, GeneratorType.WATER, UV_TIER, 17025);

        add(definitions, GeneratorType.SOLAR, LV_TIER, 32752, 2733);
        add(definitions, GeneratorType.SOLAR, MV_TIER, 32753, 2734);
        add(definitions, GeneratorType.SOLAR, HV_TIER, 32754, 2735);
        add(definitions, GeneratorType.SOLAR, EV_TIER, 32755, 2736);
        add(definitions, GeneratorType.SOLAR, IV_TIER, 32756, 2737);
        add(definitions, GeneratorType.SOLAR, LUV_TIER, 32757, 2738);
        add(definitions, GeneratorType.SOLAR, ZPM_TIER, 32758, 2739);
        add(definitions, GeneratorType.SOLAR, UV_TIER, 32759, 2740);
        add(definitions, GeneratorType.SOLAR, UHV_TIER, 32130);
        add(definitions, GeneratorType.SOLAR, UEV_TIER, 32131);
        add(definitions, GeneratorType.SOLAR, UIV_TIER, 32132);

        DEFINITIONS = Collections.unmodifiableMap(definitions);
        GENERATOR_IDS = Collections.unmodifiableList(new ArrayList<>(definitions.keySet()));
    }

    private OriginGeneratorRegistry() {}

    private static void add(Map<Integer, Definition> definitions, GeneratorType type, long tier, int... ids) {
        for (int id : ids) {
            if (definitions.put(id, new Definition(id, type, tier)) != null) {
                throw new IllegalStateException("Duplicate Origin generator ID: " + id);
            }
        }
    }

    public static Definition getDefinition(int generatorId) {
        return DEFINITIONS.get(generatorId);
    }

    public static Definition getDefinition(ItemStack selector) {
        if (selector == null || selector.getItem() == null || selector.stackSize <= 0) {
            return null;
        }
        Definition definition = getDefinition(selector.getItemDamage());
        return definition != null && definition.matches(selector) ? definition : null;
    }

    public static RecipeMap<?> getRecipeMap(int generatorId) {
        Definition definition = getDefinition(generatorId);
        return definition == null ? null : definition.getRecipeMap();
    }

    public static RecipeMap<?> getRecipeMap(ItemStack selector) {
        Definition definition = getDefinition(selector);
        return definition == null ? null : definition.getRecipeMap();
    }

    public static long getEnergyTier(int generatorId) {
        Definition definition = getDefinition(generatorId);
        return definition == null ? 0 : definition.energyTier;
    }

    public static boolean isSupported(int generatorId) {
        return DEFINITIONS.containsKey(generatorId);
    }

    public static List<Integer> getGeneratorIds() {
        return GENERATOR_IDS;
    }

    public static List<RecipeMap<?>> getAvailableRecipeMaps() {
        return RecipeMapsHolder.MAPS;
    }

    private static final class RecipeMapsHolder {

        private static final List<RecipeMap<?>> MAPS = createMaps();

        private static List<RecipeMap<?>> createMaps() {
            List<RecipeMap<?>> maps = new ArrayList<>();
            for (GeneratorType type : GeneratorType.values()) {
                maps.add(type.getRecipeMap());
            }
            return Collections.unmodifiableList(maps);
        }
    }

    public static synchronized void registerRecipes() {
        if (recipesRegistered) {
            return;
        }
        for (GeneratorType type : GeneratorType.values()) {
            type.loader.run();
        }
        recipesRegistered = true;
    }

    public static int getParallelMultiplier(int machineCount) {
        if (machineCount <= 0) {
            return 1;
        }
        return machineCount >= 31 ? Integer.MAX_VALUE : 1 << machineCount;
    }

    public static BigInteger calculateEnergyPerTick(int generatorId, long recipeEUt, int machineCount) {
        if (recipeEUt >= 0 || machineCount <= 0) {
            return BigInteger.ZERO;
        }
        return OriginEnergy.calculate(recipeEUt, getEnergyTier(generatorId), getParallelMultiplier(machineCount));
    }

    public static final class Definition {

        private final int generatorId;
        private final GeneratorType type;
        private final long energyTier;
        private final String modId;
        private final String registryName;

        private Definition(int generatorId, GeneratorType type, long energyTier) {
            this.generatorId = generatorId;
            this.type = type;
            this.energyTier = energyTier;
            if (type == GeneratorType.NUCLEAR) {
                modId = Mods.IndustrialCraft2.ID;
                registryName = "blockGenerator";
            } else {
                modId = Mods.GregTech.ID;
                registryName = generatorId >= 32752 && generatorId <= 32759 ? "gt.metaitem.01"
                    : generatorId >= 32130 && generatorId <= 32132 ? "gt.metaitem.03" : "gt.blockmachines";
            }
        }

        public int getGeneratorId() {
            return generatorId;
        }

        public GeneratorType getType() {
            return type;
        }

        public RecipeMap<?> getRecipeMap() {
            return type.getRecipeMap();
        }

        public long getEnergyTier() {
            return energyTier;
        }

        public String getModId() {
            return modId;
        }

        public String getRegistryName() {
            return registryName;
        }

        public boolean matches(ItemStack stack) {
            Item expected = GameRegistry.findItem(modId, registryName);
            return expected != null && stack != null
                && stack.getItem() == expected
                && stack.getItemDamage() == generatorId;
        }
    }
}
