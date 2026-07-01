package machines;

import static com.gtnewhorizon.structurelib.structure.StructureUtility.*;
import static gregtech.api.GregTechAPI.METATILEENTITIES;
import static gregtech.api.enums.HatchElement.*;
import static gregtech.api.enums.Textures.BlockIcons.*;
import static gregtech.api.metatileentity.BaseTileEntity.TOOLTIP_DELAY;
import static gregtech.api.metatileentity.implementations.MTEBasicMachine.isValidForLowGravity;
import static gregtech.api.util.GTStructureUtility.buildHatchAdder;
import static gregtech.common.misc.WirelessNetworkManager.addEUToGlobalEnergyMap;
import static gtPlusPlus.api.recipe.GTPPRecipeMaps.simpleWasherRecipes;
import static java.lang.Math.pow;
import static loader.ChaosRecipeLoader.AssemblyLineWithoutResearchRecipe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Nonnull;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;

import com.google.common.collect.ImmutableList;
import com.gtnewhorizon.structurelib.alignment.constructable.ISurvivalConstructable;
import com.gtnewhorizon.structurelib.structure.IStructureDefinition;
import com.gtnewhorizon.structurelib.structure.ISurvivalBuildEnvironment;
import com.gtnewhorizon.structurelib.structure.StructureDefinition;
import com.gtnewhorizons.modularui.api.drawable.IDrawable;
import com.gtnewhorizons.modularui.api.screen.ModularWindow;
import com.gtnewhorizons.modularui.api.screen.UIBuildContext;
import com.gtnewhorizons.modularui.common.widget.ButtonWidget;
import com.gtnewhorizons.modularui.common.widget.FakeSyncWidget;

import Recipes.ChaosRecipes.ChaosAntimatterRecipes;
import Recipes.ChaosRecipes.ChaosArcaneWorktableRecipes;
import Recipes.ChaosRecipes.ChaosBloodMagicRecipes;
import Recipes.ChaosRecipes.ChaosBotaniaRecipes;
import Recipes.ChaosRecipes.ChaosCircuitAssemblerRecipes;
import Recipes.ChaosRecipes.ChaosCrucibleRecipes;
import Recipes.ChaosRecipes.ChaosEssenceFarmRecipes;
import Recipes.ChaosRecipes.ChaosExoticRecipes;
import Recipes.ChaosRecipes.ChaosFallingTowerRecipes;
import Recipes.ChaosRecipes.ChaosOreRecipes;
import Recipes.ChaosRecipes.ChaosReplicatorRecipes;
import Recipes.ChaosRecipes.ChaosRunicMatrixRecipes;
import Recipes.ChaosRecipes.ChaosSpecialCompressRecipes;
import Recipes.ChaosRecipes.ChaosXtremeCraftingRecipes;
import Recipes.ChaosRecipes.ChaosZhuHaiRecipes;
import goodgenerator.api.recipe.GoodGeneratorRecipeMaps;
import gregtech.GTMod;
import gregtech.api.GregTechAPI;
import gregtech.api.enums.GTValues;
import gregtech.api.gui.modularui.GTUITextures;
import gregtech.api.interfaces.IHatchElement;
import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.logic.ProcessingLogic;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.implementations.MTEExtendedPowerMultiBlockBase;
import gregtech.api.metatileentity.implementations.MTEHatchInput;
import gregtech.api.metatileentity.implementations.MTEHatchInputBus;
import gregtech.api.metatileentity.implementations.MTEMultiBlockBase;
import gregtech.api.metatileentity.implementations.MTETieredMachineBlock;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMaps;
import gregtech.api.recipe.check.CheckRecipeResult;
import gregtech.api.recipe.check.CheckRecipeResultRegistry;
import gregtech.api.recipe.check.SimpleCheckRecipeResult;
import gregtech.api.recipe.metadata.CompressionTierKey;
import gregtech.api.render.TextureFactory;
import gregtech.api.util.GTRecipe;
import gregtech.api.util.GTUtility;
import gregtech.api.util.MultiblockTooltipBuilder;
import gregtech.api.util.OverclockCalculator;
import gregtech.common.blocks.ItemMachines;
import gtPlusPlus.api.recipe.GTPPRecipeMaps;
import kekztech.client.gui.KTUITextures;
import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import util.ChaosManager;

/**
 * 异常处理模式枚举
 * 定义了三种不同的异常处理方式
 */
enum TryCatchMode {
    /** 模式1：直接输出到终端（控制台） */
    CONSOLE,
    /** 模式2：统一输出到文件ChaosTryCatch.txt */
    FILE,
    /** 模式3：不进行任何显示，直接销毁（静默处理） */
    SILENT
}

/**
 * 异常处理管理器
 * 负责统一管理所有try-catch语句的异常输出行为
 */
class ExceptionHandler {

    // ==================== 开发者配置区 ====================
    // 开发者可以通过修改此变量来切换异常处理模式
    // 可选值：TryCatchMode.CONSOLE / TryCatchMode.FILE / TryCatchMode.SILENT
    private static final TryCatchMode tryCatchMode = TryCatchMode.SILENT; // 在此处修改异常处理模式
    // ====================================================

    // 文件输出路径，当tryCatchMode为FILE时使用
    private static final String LOG_FILE_PATH = "ChaosTryCatch.txt";

    /**
     * 处理异常信息
     * 根据tryCatchMode的设置，以不同的方式处理异常输出
     *
     * @param tag     异常标识标签，用于区分不同位置的异常
     * @param message 异常消息内容
     * @param e       异常对象
     */
    public static void handleException(String tag, String message, Exception e) {
        switch (tryCatchMode) {
            case CONSOLE:
                // 模式1：直接输出至终端
                GTMod.GT_FML_LOGGER.error("[Chaos] " + tag + " - " + message);
                GTMod.GT_FML_LOGGER.error("[Chaos] Stack trace: ", e);
                break;

            case FILE:
                // 模式2：统一输出到文件
                writeToFile(tag, message, e);
                break;

            case SILENT:
                // 模式3：不进行任何显示，直接销毁
                // 静默处理，不输出任何内容
                break;

            default:
                // 默认情况使用控制台输出
                GTMod.GT_FML_LOGGER.error("[Chaos] " + tag + " - " + message);
                GTMod.GT_FML_LOGGER.error("[Chaos] Stack trace: ", e);
                break;
        }
    }

    /**
     * 处理异常信息（简化版本）
     * 根据tryCatchMode的设置，以不同的方式处理异常输出
     *
     * @param tag 异常标识标签
     * @param e   异常对象
     */
    public static void handleException(String tag, Exception e) {
        handleException(tag, e.getMessage() != null ? e.getMessage() : "Unknown error", e);
    }

    /**
     * 将异常信息写入文件
     * 采用追加写入模式，每次异常都会追加到文件末尾
     *
     * @param tag     异常标识标签
     * @param message 异常消息
     * @param e       异常对象
     */
    private static void writeToFile(String tag, String message, Exception e) {
        PrintWriter writer = null;
        try {
            // 创建File对象，指向当前工作目录下的LOG_FILE_PATH文件
            File logFile = new File(LOG_FILE_PATH);
            // 使用FileWriter的追加模式（第二个参数true表示追加）
            // 使用PrintWriter来方便地写入各种数据类型
            writer = new PrintWriter(new FileWriter(logFile, true));

            // 写入时间戳和异常分隔线
            writer.println("========== " + new java.util.Date().toString() + " ==========");
            writer.println("[Tag]: " + tag);
            writer.println("[Message]: " + message);
            writer.println(
                "[Exception Type]: " + e.getClass()
                    .getName());
            writer.println("[Stack Trace]:");
            // 写入完整的堆栈跟踪信息
            e.printStackTrace(writer);
            writer.println(); // 添加空行分隔不同的异常记录
            writer.flush(); // 确保数据被写入文件

        } catch (IOException ioException) {
            // 如果文件写入失败，回退到控制台输出
            GTMod.GT_FML_LOGGER.error("[Chaos] Failed to write exception to file: " + LOG_FILE_PATH);
            GTMod.GT_FML_LOGGER.error("[Chaos] Fallback to console output");
            GTMod.GT_FML_LOGGER.error("[Chaos] " + tag + " - " + message);
            GTMod.GT_FML_LOGGER.error("[Chaos] Stack trace: ", e);
            GTMod.GT_FML_LOGGER.error("[Chaos] File write error: ", ioException);
        } finally {
            // 确保关闭writer资源
            if (writer != null) {
                try {
                    writer.close();
                } catch (Exception closeException) {
                    // 关闭资源时的异常静默处理，避免递归
                }
            }
        }
    }
}

public class Chaos extends MTEExtendedPowerMultiBlockBase<Chaos> implements ISurvivalConstructable {

    public Chaos(int aID, String aName, String aNameRegional) {
        super(aID, aName, aNameRegional);
    }

    public Chaos(String aName) {
        super(aName);
    }

    // 机器所有者UUID
    protected UUID ownerUUID;
    // 配方处理状态标志
    protected boolean isRecipeProcessing = false;
    // 无线模式标志
    protected boolean wirelessMode = false;
    // 无线电网消耗
    private BigInteger costEU = BigInteger.ZERO;

    // 上次使用的配方映射
    private RecipeMap<?> mLastRecipeMap;
    // 上次控制器槽位物品
    private ItemStack lastControllerStack;
    // 机器电压等级
    private int tTier = 0;
    // 降频倍数
    private int mMult = 0;
    // 机器模式
    private int mode = 0;
    private String specialMachineType = null;
    // 模式更新标志
    private boolean updateMode = false;
    // UEV降频开关
    private boolean downtierUEV = true;
    // 是否为多方块机器标志
    private boolean isMultiBlock = false;

    /**
     * 首次tick回调
     * 初始化机器所有者UUID和矿石处理配方
     */
    @Override
    public void onFirstTick(IGregTechTileEntity aBaseMetaTileEntity) {
        super.onFirstTick(aBaseMetaTileEntity);
        this.ownerUUID = aBaseMetaTileEntity.getOwnerUuid();
    }

    // === NBT数据保存 ===

    /**
     * 保存NBT数据
     * 保存机器状态到NBT标签
     */
    @Override
    public void saveNBTData(NBTTagCompound aNBT) {
        super.saveNBTData(aNBT);
        try {
            aNBT.setBoolean("wirelessMode", wirelessMode);
            aNBT.setBoolean("downtierUEV", downtierUEV);
            aNBT.setInteger("mode", mode);
            if (getSpecialMachine()) {
                // 添加空值检查：只有当 specialMachineType 不为 null 且不为空字符串时才保存
                if (specialMachineType != null && !specialMachineType.trim()
                    .isEmpty()) {
                    aNBT.setString("MachineType", specialMachineType);
                } else {
                    // 如果 specialMachineType 为空，记录警告但不保存
                    ExceptionHandler.handleException(
                        "saveNBTData",
                        "specialMachineType is null or empty, skipping save",
                        new IllegalArgumentException("Empty specialMachineType"));
                }
            }
        } catch (NullPointerException e) {
            // 捕获getSpecialMachine()中可能发生的NPE，记录详细错误信息以便定位问题
            ExceptionHandler.handleException("saveNBTData", "NullPointerException - controller slot may be null", e);
            // 尝试安全地保存部分数据
            try {
                aNBT.setBoolean("wirelessMode", wirelessMode);
                aNBT.setBoolean("downtierUEV", downtierUEV);
                aNBT.setInteger("mode", mode);
                // 不尝试保存MachineType
            } catch (Exception ex) {
                ExceptionHandler.handleException("saveNBTData", "Failed to save fallback NBT data", ex);
            }
        } catch (IllegalArgumentException e) {
            // 专门捕获 IllegalArgumentException（包括空字符串错误）
            ExceptionHandler
                .handleException("saveNBTData", "IllegalArgumentException - likely empty string for MachineType", e);
            // 尝试安全地保存除MachineType外的其他数据
            try {
                aNBT.setBoolean("wirelessMode", wirelessMode);
                aNBT.setBoolean("downtierUEV", downtierUEV);
                aNBT.setInteger("mode", mode);
            } catch (Exception ex) {
                ExceptionHandler.handleException(
                    "saveNBTData",
                    "Failed to save fallback NBT data after IllegalArgumentException",
                    ex);
            }
        } catch (Exception e) {
            // 捕获其他可能的异常
            ExceptionHandler.handleException("saveNBTData", "Unexpected exception", e);
        }
    }

    /**
     * 加载NBT数据
     * 从NBT标签加载机器状态
     */
    @Override
    public void loadNBTData(final NBTTagCompound aNBT) {
        super.loadNBTData(aNBT);
        // 向后兼容性处理
        if (aNBT.hasKey("mSeparate")) {
            inputSeparation = aNBT.getBoolean("mSeparate");
        }
        if (aNBT.hasKey("mUseMultiparallelMode")) {
            batchMode = aNBT.getBoolean("mUseMultiparallelMode");
        }
        if (aNBT.hasKey("MachineType")) {
            String loadedMachineType = aNBT.getString("MachineType");
            // 添加空值检查：只有非空字符串才赋值
            if (loadedMachineType != null && !loadedMachineType.trim()
                .isEmpty()) {
                specialMachineType = loadedMachineType;
            } else {
                ExceptionHandler.handleException(
                    "loadNBTData",
                    "loaded MachineType is null or empty, ignoring",
                    new IllegalArgumentException("Invalid MachineType"));
            }
        }
        // 加载基本状态
        wirelessMode = aNBT.getBoolean("wirelessMode");
        downtierUEV = aNBT.getBoolean("downtierUEV");
        mode = aNBT.getInteger("mode");
    }

    // === 机器结构和纹理 ===

    // 机器外壳纹理索引
    private static final int mcasingIndex = getTextureIndex(
        getCasingTextureForId(GTUtility.getCasingTextureIndex(GregTechAPI.sBlockCasings4, 0)));

    // 定义机器结构
    private static final String STRUCTURE_PIECE_MAIN = "main";
    private static final IStructureDefinition<Chaos> STRUCTURE_DEFINITION = StructureDefinition.<Chaos>builder()
        .addShape(
            STRUCTURE_PIECE_MAIN,
            transpose(new String[][] { { "hhh", "hhh", "hhh" }, { "h~h", "h-h", "hhh" }, { "hhh", "hhh", "hhh" } }))
        .addElement(
            'h',
            buildHatchAdder(Chaos.class)
                .atLeast(InputHatch, OutputHatch, InputBus, OutputBus, Maintenance, Energy.or(ExoticEnergy))
                .casingIndex(mcasingIndex)
                .hint(1)
                .buildAndChain(onElementPass(Chaos::onCasingAdded, ofBlock(GregTechAPI.sBlockCasings4, 0))))
        .build();

    // 外壳数量计数器
    private int mCasingAmount;

    /**
     * 外壳添加回调
     * 统计外壳数量
     */
    private void onCasingAdded() {
        mCasingAmount++;
    }

    /**
     * 获取结构定义
     */
    @Override
    public IStructureDefinition<Chaos> getStructureDefinition() {
        return STRUCTURE_DEFINITION;
    }

    /**
     * 获取机器纹理
     */
    @Override
    public ITexture[] getTexture(IGregTechTileEntity aBaseMetaTileEntity, ForgeDirection side, ForgeDirection aFacing,
        int colorIndex, boolean aActive, boolean redstoneLevel) {
        if (side == aFacing) {
            if (aActive) {
                // 激活状态纹理
                return new ITexture[] { casingTexturePages[0][mcasingIndex], TextureFactory.builder()
                    .addIcon(OVERLAY_FRONT_ORE_FACTORY_ACTIVE)
                    .extFacing()
                    .build(),
                    TextureFactory.builder()
                        .addIcon(OVERLAY_FRONT_ORE_FACTORY_ACTIVE_GLOW)
                        .extFacing()
                        .glow()
                        .build() };
            }
            // 非激活状态纹理
            return new ITexture[] { casingTexturePages[0][mcasingIndex], TextureFactory.builder()
                .addIcon(OVERLAY_FRONT_ORE_FACTORY)
                .extFacing()
                .build(),
                TextureFactory.builder()
                    .addIcon(OVERLAY_FRONT_ORE_FACTORY_GLOW)
                    .extFacing()
                    .glow()
                    .build() };
        }
        // 侧面纹理
        return new ITexture[] { casingTexturePages[0][mcasingIndex] };
    }

    /**
     * 创建工具提示
     */
    @Override
    public MultiblockTooltipBuilder createTooltip() {
        final MultiblockTooltipBuilder tt = new MultiblockTooltipBuilder();
        tt.addMachineType("Chaos")
            .addInfo("Runs supplied machines as if placed in the world")
            .addInfo("Parallel quantity = 2^x")
            .addInfo("x = Number of machines in the controller")
            .addInfo("-----------------------------------------------------------------------------")
            .addInfo("In wireless mode, the formula run time will be fixed as follows 128 ticks")
            .addInfo("and energy consume from wireless network rather than energy hatch")
            .addInfo("-----------------------------------------------------------------------------")
            .addInfo("If the machine within the controller contains multiple modes, ")
            .addInfo("sneak left click controller to switch machine mode")
            .addInfo("-----------------------------------------------------------------------------")
            .addInfo("Use Auto Workbench (LV) to crafting Xtreme Crafting recipe")
            .addInfo("Use Auto Workbench (MV) to crafting Falling Tower recipe")
            .addInfo("Use Large Essentia Smeltery to crafting Thaumcraft recipe")
            .addInfo("Use Research Completer to crafting Blood Magic & Botania & EssenceFarm recipe")
            .addInfo("-----------------------------------------------------------------------------")
            .addInfo("Add By: GT Not Hard")
            .beginStructureBlock(3, 3, 3, true)
            .addController("Front center")
            .addCasingInfoRange("Robust Tungstensteel Machine Casing", 4, 24, false)
            .addEnergyHatch("Any casing", 1)
            .addMaintenanceHatch("Any casing", 1)
            .addInputBus("Any casing", 1)
            .addInputHatch("Any casing", 1)
            .addOutputBus("Any casing", 1)
            .addOutputHatch("Any casing", 1)
            .toolTipFinisher();
        return tt;
    }

    /**
     * 创造模式自动搭建
     */
    @Override
    public void construct(ItemStack aStack, boolean aHintsOnly) {
        buildPiece(STRUCTURE_PIECE_MAIN, aStack, aHintsOnly, 1, 1, 0);
    }

    /**
     * 生存模式自动搭建
     */
    @Override
    public int survivalConstruct(ItemStack stackSize, int elementBudget, ISurvivalBuildEnvironment env) {
        if (mMachine) {
            return -1;
        }
        return survivialBuildPiece(STRUCTURE_PIECE_MAIN, stackSize, 1, 1, 0, elementBudget, env, false, true);
    }

    /**
     * 检查机器结构
     */
    @Override
    public boolean checkMachine(IGregTechTileEntity aBaseMetaTileEntity, ItemStack aStack) {
        mEnergyHatches.clear();
        mExoticEnergyHatches.clear();
        mCasingAmount = 0;
        return checkPiece(STRUCTURE_PIECE_MAIN, 1, 1, 0) && mCasingAmount >= 4 && checkHatches();
    }

    /**
     * 检查仓室
     * 确保有且仅有一个维护仓
     */
    private boolean checkHatches() {
        return mMaintenanceHatches.size() == 1;
    }

    /**
     * 创建新的元实体实例
     */
    @Override
    public IMetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
        return new Chaos(this.mName);
    }

    // === 机器属性和设置 ===

    /**
     * 获取最大效率
     */
    @Override
    public int getMaxEfficiency(ItemStack aStack) {
        return 10000;
    }

    /**
     * 获取组件损坏值
     */
    @Override
    public int getDamageToComponent(ItemStack aStack) {
        return 0;
    }

    /**
     * 检查组件损坏时是否爆炸
     */
    @Override
    public boolean explodesOnComponentBreak(ItemStack aStack) {
        return false;
    }

    /**
     * 获取允许的仓室类型列表
     */
    private List<IHatchElement<? super Chaos>> getAllowedHatches() {
        return ImmutableList.of(InputHatch, OutputHatch, InputBus, OutputBus, Maintenance, Energy, ExoticEnergy);
    }

    // === 并行计算 ===

    /**
     * 计算最大并行数
     * 基于控制器槽位中的机器数量计算：2^(机器数量)
     */
    private int getMaxParallel() {
        if (getControllerSlot() == null) {
            return 1;
        }
        if (getControllerSlot().stackSize < 31) {
            return (int) pow(2, getControllerSlot().stackSize);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    // === 配方映射处理 ===

    /**
     * 读取通常大机器配方
     * 根据控制器槽位物品获取对应的配方映射
     */
    private RecipeMap<?> fetchRecipeMap() {
        if (isCorrectMachinePart(getControllerSlot())) {
            getControllerSlot().getItemDamage();
            RecipeMap<?> RecipeMap = getMultifunctionalRecipeMap(getControllerSlot().getItemDamage());
            if (RecipeMap != null) {
                isMultiBlock = true;
                return RecipeMap;
            }
            MetaTileEntity e = (MetaTileEntity) METATILEENTITIES[getControllerSlot().getItemDamage()];
            if (e instanceof MTEMultiBlockBase mteMultiBlockBase) {
                isMultiBlock = true;
                RecipeMap = mteMultiBlockBase.getRecipeMap();
                return RecipeMap == RecipeMaps.assemblylineVisualRecipes ? AssemblyLineWithoutResearchRecipe
                    : RecipeMap;
            }
            isMultiBlock = false;
            return ChaosManager.giveRecipeMap(ChaosManager.getMachineName(getControllerSlot()));
        }
        return null;
    }

    // === 多类型机器配方列表 ===
    private static final Integer[] specialMachine = { 358, 360, 792, 850, 862, 942, 992, 995, 3006, 3008, 12735, 13001,
        15415, 31021, 31050, 32018, 32024 };

    private boolean getSpecialMachine() {
        try {
            // 获取控制器槽位物品
            ItemStack controllerSlot = getControllerSlot();
            // 空值检查：如果控制器槽位为空，返回false
            if (controllerSlot == null) {
                ExceptionHandler.handleException(
                    "getSpecialMachine",
                    "controller slot is null, returning false",
                    new NullPointerException("Controller slot null"));
                return false;
            }
            Integer machineID = controllerSlot.getItemDamage();
            List<Integer> specialMachineList = Arrays.asList(specialMachine);
            return specialMachineList.contains(machineID);
        } catch (NullPointerException e) {
            // 捕获NPE并记录详细信息以便定位
            ExceptionHandler.handleException("getSpecialMachine", "NullPointerException", e);
            return false;
        }
    }

    // 磁通量效应监视器-358
    private static final String[] Magnetic_Flux_Exhibitor_mod = { "Polarizer", "Electromagnetic Separator" };
    private static final RecipeMap<?>[] Magnetic_Flux_Exhibitor = { RecipeMaps.polarizerRecipes,
        RecipeMaps.electroMagneticSeparatorRecipes };
    // 涡轮装罐机Pro-360
    private static final String[] TurboCan_Pro_mod = { "Fluid Canner", "Canner" };
    private static final RecipeMap<?>[] TurboCan_Pro = { RecipeMaps.cannerRecipes };
    // 工业辊压机-792
    private static final String[] Industrial_Material_Press_mod = { "Forming Press", "Bending Machine" };
    private static final RecipeMap<?>[] Industrial_Material_Press = { RecipeMaps.formingPressRecipes,
        RecipeMaps.benderRecipes };
    // 工业洗矿厂-850
    private static final String[] Ore_Washing_Plant_mod = { "Ore Washer", "Simple Washer", "Chemical Bath" };
    private static final RecipeMap<?>[] Ore_Washing_Plant = { RecipeMaps.oreWasherRecipes, simpleWasherRecipes,
        RecipeMaps.chemicalBathRecipes };
    // 工业电弧炉-862
    private static final String[] High_Current_Industrial_Arc_Furnace_mod = { "Electric Arc Furnace",
        "Plasma Arc Furnace" };
    private static final RecipeMap<?>[] High_Current_Industrial_Arc_Furnace = { RecipeMaps.arcFurnaceRecipes };
    // 亚马逊仓库-942
    private static final String[] Amazon_Warehousing_Depot_mod = { "Packager", "Unpackeager" };
    private static final RecipeMap<?>[] Amazon_Warehousing_Depot = { RecipeMaps.packagerRecipes,
        RecipeMaps.unpackagerRecipes };
    // 工业切割机-992
    private static final String[] Industrial_Cutting_Factory_mod = { "Cutting", "Slicing" };
    private static final RecipeMap<?>[] Industrial_Cutting_Factory = { RecipeMaps.cutterRecipes};
    // 真空干燥炉-995
    private static final String[] Utupu_Tanuri_mod = { "Dehydrator", "Vacuum Furnace" };
    private static final RecipeMap<?>[] Utupu_Tanuri = { GTPPRecipeMaps.chemicalDehydratorNonCellRecipes,
        GTPPRecipeMaps.vacuumFurnaceRecipes };
    // "Hot Isostatic Pressurization Unit"-3006
    private static final String[] Hot_Isostatic_Pressurization_Unit_mod = { "Compressor", "HIP Compressor" };
    private static final RecipeMap<?>[] Hot_Isostatic_Pressurization_Unit = { RecipeMaps.compressorRecipes,
        ChaosSpecialCompressRecipes.SpecialCompressRecipes_HIP };
    // 黑洞压缩机-3008
    private static final String[] Pseudostable_Black_Hole_Containment_Field_mod = { "Compressor", "BHC Compressor",
        "Advanced Neutronium Compressor" };
    private static final RecipeMap<?>[] Pseudostable_Black_Hole_Containment_Field = { RecipeMaps.compressorRecipes,
        ChaosSpecialCompressRecipes.SpecialCompressRecipes_BHC, RecipeMaps.neutroniumCompressorRecipes };
    // 电路装配线-12735
    private static final String[] Circuit_Assembly_Line_mod = { "Circuit Assembly Line", "Circuit Assembly" };
    private static final RecipeMap<?>[] Circuit_Assembly_Line = {
        ChaosCircuitAssemblerRecipes.addChaosCircuitAssemblerRecipes, RecipeMaps.circuitAssemblerRecipes };
    // "Research Completer"-13001
    private static final String[] Research_Completer_mod = { "Blood Magic", "Botania", "Essence Farm" };
    private static final RecipeMap<?>[] Research_Completer = { ChaosBloodMagicRecipes.addBloodMagicRecipes,
        ChaosBotaniaRecipes.addBotaniaRecipes, ChaosEssenceFarmRecipes.addEssenceFarmRecipes };
    // "Heliofusion Exoticizer"-15415
    private static final String[] Heliofusion_Exoticizer_mod = { "Degenerate Quark Gluon", "Magmatter" };
    private static final RecipeMap<?>[] Heliofusion_Exoticizer = {
        ChaosExoticRecipes.ExoticRecipes_DegenerateQuarkGluon, ChaosExoticRecipes.ExoticRecipes_Magmatter };
    // 丹格特蒸馏厂-31021
    private static final String[] Dangote_Distillus_mod = { "Distillery", "distillation tower" };
    private static final RecipeMap<?>[] Dangote_Distillus = { RecipeMaps.distilleryRecipes,
        RecipeMaps.distillationTowerRecipes };
    // "Elemental Duplicator"-31050
    private static final String[] Elemental_Duplicator_mod = { "Replicator Item", "Replicator Fluid" };
    private static final RecipeMap<?>[] Elemental_Duplicator = { ChaosReplicatorRecipes.ReplicatorRecipes_Item,
        ChaosReplicatorRecipes.ReplicatorRecipes_Fluid };
    // 精密自动组装机MT-3662-32018
    private static final String[] Precise_Auto_Assembler_MT_3662_mod = { "Precise Assembler", "Assembler" };
    private static final RecipeMap<?>[] Precise_Auto_Assembler_MT_3662 = {
        GoodGeneratorRecipeMaps.preciseAssemblerRecipes, RecipeMaps.assemblerRecipes };
    // "Large Essentia Smeltery"-32024
    private static final String[] Large_Essentia_Smeltery_mod = { "Arcane Worktable", "Crucible", "Runic Matrix" };
    private static final RecipeMap<?>[] Large_Essentia_Smeltery = {
        ChaosArcaneWorktableRecipes.addArcaneWorktableRecipes, ChaosCrucibleRecipes.addCrucibleRecipes,
        ChaosRunicMatrixRecipes.addRunicMatrixRecipes };

    // === 用户交互 ===

    /**
     * 左键点击处理
     * 潜行左键切换机器模式
     */
    @Override
    public void onLeftclick(IGregTechTileEntity aBaseMetaTileEntity, EntityPlayer aPlayer) {
        if (getBaseMetaTileEntity() != null && aPlayer.isSneaking() && getBaseMetaTileEntity().isServerSide()) {
            // 机器模式切换
            this.mode = (this.mode + 1) % 3;
            updateMode = true;
            // 根据机器ID显示对应的模式名称
            switch (getControllerSlot().getItemDamage()) {
                case 358 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + Magnetic_Flux_Exhibitor_mod[Math.min(mode, 1)]);
                    specialMachineType = Magnetic_Flux_Exhibitor_mod[Math.min(mode, 1)];
                }
                case 360 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + TurboCan_Pro_mod[Math.min(mode, 1)]);
                    specialMachineType = TurboCan_Pro_mod[Math.min(mode, 1)];
                }
                case 792 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + Industrial_Material_Press_mod[Math.min(mode, 1)]);
                    specialMachineType = Industrial_Material_Press_mod[Math.min(mode, 1)];
                }
                case 850 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + Ore_Washing_Plant_mod[Math.min(mode, 2)]);
                    specialMachineType = Ore_Washing_Plant_mod[Math.min(mode, 2)];
                }
                case 862 -> {
                    GTUtility.sendChatToPlayer(
                        aPlayer,
                        "mode:" + High_Current_Industrial_Arc_Furnace_mod[Math.min(mode, 1)]);
                    specialMachineType = High_Current_Industrial_Arc_Furnace_mod[Math.min(mode, 1)];
                }
                case 942 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + Amazon_Warehousing_Depot_mod[Math.min(mode, 1)]);
                    specialMachineType = Amazon_Warehousing_Depot_mod[Math.min(mode, 1)];
                }
                case 992 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + Industrial_Cutting_Factory_mod[Math.min(mode, 1)]);
                    specialMachineType = Industrial_Cutting_Factory_mod[Math.min(mode, 1)];
                }
                case 995 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + Utupu_Tanuri_mod[Math.min(mode, 1)]);
                    specialMachineType = Utupu_Tanuri_mod[Math.min(mode, 1)];
                }
                case 3006 -> {
                    GTUtility
                        .sendChatToPlayer(aPlayer, "mode:" + Hot_Isostatic_Pressurization_Unit_mod[Math.min(mode, 1)]);
                    specialMachineType = Hot_Isostatic_Pressurization_Unit_mod[Math.min(mode, 1)];
                }
                case 3008 -> {
                    GTUtility.sendChatToPlayer(
                        aPlayer,
                        "mode:" + Pseudostable_Black_Hole_Containment_Field_mod[Math.min(mode, 2)]);
                    specialMachineType = Pseudostable_Black_Hole_Containment_Field_mod[Math.min(mode, 2)];
                }
                case 12735 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + Circuit_Assembly_Line_mod[Math.min(mode, 1)]);
                    specialMachineType = Circuit_Assembly_Line_mod[Math.min(mode, 1)];
                }
                case 13001 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + Research_Completer_mod[Math.min(mode, 2)]);
                    specialMachineType = Research_Completer_mod[Math.min(mode, 2)];
                }
                case 15415 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + Heliofusion_Exoticizer_mod[Math.min(mode, 1)]);
                    specialMachineType = Heliofusion_Exoticizer_mod[Math.min(mode, 1)];
                }
                case 31021 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + Dangote_Distillus_mod[Math.min(mode, 1)]);
                    specialMachineType = Dangote_Distillus_mod[Math.min(mode, 1)];
                }
                case 31050 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + Elemental_Duplicator_mod[Math.min(mode, 1)]);
                    specialMachineType = Elemental_Duplicator_mod[Math.min(mode, 1)];
                }
                case 32018 -> {
                    GTUtility
                        .sendChatToPlayer(aPlayer, "mode:" + Precise_Auto_Assembler_MT_3662_mod[Math.min(mode, 1)]);
                    specialMachineType = Precise_Auto_Assembler_MT_3662_mod[Math.min(mode, 1)];
                }
                case 32024 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + Large_Essentia_Smeltery_mod[Math.min(mode, 2)]);
                    specialMachineType = Large_Essentia_Smeltery_mod[Math.min(mode, 2)];
                }
            }
        }
        super.onLeftclick(aBaseMetaTileEntity, aPlayer);
    }

    /**
     * 读取多类型机器的配方
     * 根据机器ID和当前模式获取对应的配方映射
     */
    private RecipeMap<?> getMultifunctionalRecipeMap(int meta) {
        switch (meta) {
            case 358 -> {
                return Magnetic_Flux_Exhibitor[Math.min(mode, 1)];
            }
            case 360 -> {
                return TurboCan_Pro[Math.min(mode, 1)];
            }
            case 792 -> {
                return Industrial_Material_Press[Math.min(mode, 1)];
            }
            case 829 -> {
                return ChaosZhuHaiRecipes.addChaosZhuHaiFisheryRecipes;
            }
            case 850 -> {
                return Ore_Washing_Plant[Math.min(mode, 2)];
            }
            case 862 -> {
                return High_Current_Industrial_Arc_Furnace[Math.min(mode, 1)];
            }
            case 942 -> {
                return Amazon_Warehousing_Depot[Math.min(mode, 1)];
            }
            case 992 -> {
                return Industrial_Cutting_Factory[Math.min(mode, 1)];
            }
            case 995 -> {
                return Utupu_Tanuri[Math.min(mode, 1)];
            }
            case 1132 -> {
                return ChaosOreRecipes.addFakeChaosOreRecipes;
            }
            case 3006 -> {
                return Hot_Isostatic_Pressurization_Unit[Math.min(mode, 1)];
            }
            case 3008 -> {
                return Pseudostable_Black_Hole_Containment_Field[Math.min(mode, 2)];
            }
            case 12735 -> {
                return Circuit_Assembly_Line[Math.min(mode, 1)];
            }
            case 13001 -> {
                return Research_Completer[Math.min(mode, 2)];
            }
            case 15415 -> {
                return Heliofusion_Exoticizer[Math.min(mode, 1)];
            }
            case 31021 -> {
                return Dangote_Distillus[Math.min(mode, 1)];
            }
            case 31050 -> {
                return Elemental_Duplicator[Math.min(mode, 1)];
            }
            case 31091 -> {
                return ChaosXtremeCraftingRecipes.addChaosXtremeCraftingRecipes;
            }
            case 31092 -> {
                return ChaosFallingTowerRecipes.addChaosFallingTowerRecipes;
            }
            case 31093 -> {
                return ChaosArcaneWorktableRecipes.addArcaneWorktableRecipes;
            }
            case 32018 -> {
                return Precise_Auto_Assembler_MT_3662[Math.min(mode, 1)];
            }
            case 32024 -> {
                return Large_Essentia_Smeltery[Math.min(mode, 2)];
            }
            case 32027 -> {
                return ChaosAntimatterRecipes.AntimatterRecipes;
            }
            default -> {
                return null;
            }
        }
    }

    /**
     * 获取当前配方映射
     */
    @Override
    public RecipeMap<?> getRecipeMap() {
        return mLastRecipeMap;
    }

    /**
     * 检查是否为正确的机器部件
     * 检查物品是否是GT机器方块
     */
    @Override
    public boolean isCorrectMachinePart(ItemStack aStack) {
        return aStack != null && aStack.getUnlocalizedName()
            .startsWith("gt.blockmachines.");
    }

    // === 配方处理主逻辑 ===

    /**
     * 检查并处理配方
     * 主配方处理入口
     */
    @Override
    @NotNull
    public CheckRecipeResult checkProcessing() {
        if (!GTUtility.areStacksEqual(lastControllerStack, getControllerSlot()) || updateMode) {
            if (updateMode) updateMode = false;
            // controller slot has changed
            lastControllerStack = getControllerSlot();
            mLastRecipeMap = fetchRecipeMap();
            setTierAndMult();
        }
        if (mLastRecipeMap == null) {
            return SimpleCheckRecipeResult.ofFailure("no_machine");
        }
        if (mLockedToSingleRecipe && mSingleRecipeCheck != null) {
            if (mSingleRecipeCheck.getRecipeMap() != mLastRecipeMap) {
                return SimpleCheckRecipeResult.ofFailure("machine_mismatch");
            }
        }

        if (mLastRecipeMap != null && wirelessMode && ownerUUID != null) {
            boolean succeeded = false;
            CheckRecipeResult finalResult = CheckRecipeResultRegistry.SUCCESSFUL;

            for (int i = 0; i < 32; i++) {
                CheckRecipeResult result = wirelessModeProcessingLogic();
                if (!result.wasSuccessful()) {
                    finalResult = result;
                    break;
                }
                succeeded = true;
            }

            updateSlots();
            if (!succeeded) return finalResult;

            mEfficiency = 10000;
            mEfficiencyIncrease = 10000;
            mMaxProgresstime = 128;

            return CheckRecipeResultRegistry.SUCCESSFUL;
        }
        return super.checkProcessing();
    }

    @Override
    public void startRecipeProcessing() {
        isRecipeProcessing = true;
        super.startRecipeProcessing();
    }

    @Override
    public void endRecipeProcessing() {
        super.endRecipeProcessing();
        isRecipeProcessing = false;
    }

    // 设定无线模式配方耗电
    protected void setupWirelessProcessingPowerLogic(ProcessingLogic logic) {
        // wireless mode ignore voltage limit
        logic.setAvailableVoltage(Long.MAX_VALUE);
        logic.setAvailableAmperage(1);
        logic.setAmperageOC(false);
    }

    // 无线模式逻辑
    public CheckRecipeResult wirelessModeProcessingLogic() {
        if (!isRecipeProcessing) startRecipeProcessing();
        setupProcessingLogic(processingLogic);
        setupWirelessProcessingPowerLogic(processingLogic);

        CheckRecipeResult result = doCheckRecipe();
        if (!result.wasSuccessful()) return result;

        costEU = BigInteger.valueOf(processingLogic.getCalculatedEut())
            .multiply(BigInteger.valueOf(processingLogic.getDuration()))
            .multiply(BigInteger.valueOf(getMaxParallel()))
            .divide(BigInteger.valueOf(Integer.MAX_VALUE));

        if (!addEUToGlobalEnergyMap(ownerUUID, costEU.multiply(BigInteger.valueOf(-1)))) {
            return CheckRecipeResultRegistry.insufficientStartupPower(costEU);
        }

        mOutputItems = ArrayUtils.addAll(mOutputItems, processingLogic.getOutputItems());
        mOutputFluids = ArrayUtils.addAll(mOutputFluids, processingLogic.getOutputFluids());

        endRecipeProcessing();
        return result;
    }

    // 机器运行逻辑
    @Override
    protected ProcessingLogic createProcessingLogic() {
        return new ProcessingLogic() {

            @Nonnull
            @Override
            protected CheckRecipeResult validateRecipe(@Nonnull GTRecipe recipe) {
                if (recipe.getMetadataOrDefault(CompressionTierKey.INSTANCE, 0) > 0) {
                    return CheckRecipeResultRegistry.NO_RECIPE;
                }
                if (getBaseMetaTileEntity() != null && GTMod.gregtechproxy.mLowGravProcessing
                    && recipe.mSpecialValue == -100
                    && !isValidForLowGravity(recipe, getBaseMetaTileEntity().getWorld().provider.dimensionId)) {
                    return SimpleCheckRecipeResult.ofFailure("high_gravity");
                }
                return CheckRecipeResultRegistry.SUCCESSFUL;
            }

            // 超频设计
            @NotNull
            @Override
            protected OverclockCalculator createOverclockCalculator(@Nonnull GTRecipe recipe) {
                if (wirelessMode) {
                    return OverclockCalculator.ofNoOverclock(recipe);
                } else {
                    return super.createOverclockCalculator(recipe).enablePerfectOC()
                        .setRecipeHeat(recipe.mSpecialValue)
                        .setMachineHeat(4 * recipe.mSpecialValue)
                        .setHeatOC(true)
                        .setHeatDiscount(true)
                        .setHeatDiscountMultiplier(0.95);
                }
            }
        }.setMaxParallelSupplier(this::getMaxParallel)
            .setEuModifier(0.5F);
    }

    @Override
    protected boolean canUseControllerSlotForRecipe() {
        return false;
    }

    // 判断小机器等级或大机器电压等级
    @Override
    protected void setProcessingLogicPower(ProcessingLogic logic) {
        logic.setAvailableVoltage(
            (isMultiBlock ? getAverageInputVoltage() : GTValues.V[tTier])
                * (mLastRecipeMap != null ? mLastRecipeMap.getAmperage() : 1));
        logic.setAvailableAmperage(getMaxParallel());
        logic.setAmperageOC(true);
    }

    // 运行时电压等级与无损降频
    private void setTierAndMult() {
        // 空值检查：防止getControllerSlot()返回null导致NPE
        ItemStack controllerSlot = getControllerSlot();
        if (controllerSlot == null) {
            tTier = 0;
            mMult = 0;
            return;
        }
        IMetaTileEntity aMachine = ItemMachines.getMetaTileEntity(controllerSlot);
        if (aMachine instanceof MTETieredMachineBlock) {
            tTier = ((MTETieredMachineBlock) aMachine).mTier;
        } else {
            tTier = 0;
        }
        mMult = 0;
        if (downtierUEV && tTier > 9) {
            // Lowers down the tier by 1 to allow for bigger parallel
            tTier--;
            // Multiplies Parallels by 4x, keeping the energy cost
            mMult = 2;
        }
    }

    @Override
    public void onPostTick(IGregTechTileEntity aBaseMetaTileEntity, long aTick) {
        super.onPostTick(aBaseMetaTileEntity, aTick);
        if (mMachine && aTick % 20 == 0) {
            for (MTEHatchInputBus tInputBus : mInputBusses) {
                tInputBus.mRecipeMap = mLastRecipeMap;
            }
            for (MTEHatchInput tInputHatch : mInputHatches) {
                tInputHatch.mRecipeMap = mLastRecipeMap;
            }
        }
    }

    @Override
    public boolean supportsInputSeparation() {
        return true;
    }

    @Override
    public boolean supportsBatchMode() {
        return true;
    }

    @Override
    public boolean supportsSingleRecipeLocking() {
        return true;
    }

    @Override
    public boolean supportsVoidProtection() {
        return true;
    }

    @Override
    protected boolean supportsSlotAutomation(int aSlot) {
        return aSlot == getControllerSlotIndex();
    }

    @Override
    public void addUIWidgets(ModularWindow.Builder builder, UIBuildContext buildContext) {
        super.addUIWidgets(builder, buildContext);

        builder.widget(new ButtonWidget().setOnClick((clickData, widget) -> {
            downtierUEV = !downtierUEV;
            setTierAndMult();
        })
            .setPlayClickSound(true)
            .setBackground(() -> {
                if (downtierUEV) {
                    return new IDrawable[] { GTUITextures.BUTTON_STANDARD_PRESSED,
                        GTUITextures.OVERLAY_BUTTON_DOWN_TIERING_ON };
                } else {
                    return new IDrawable[] { GTUITextures.BUTTON_STANDARD,
                        GTUITextures.OVERLAY_BUTTON_DOWN_TIERING_OFF };
                }
            })
            .setPos(80, 91)
            .setSize(16, 16)
            .addTooltip(StatCollector.translateToLocal("GT5U.gui.button.down_tier"))
            .setTooltipShowUpDelay(TOOLTIP_DELAY))
            .widget(new FakeSyncWidget.BooleanSyncer(() -> downtierUEV, val -> downtierUEV = val));

        builder.widget(new ButtonWidget().setOnClick((clickData, widget) -> {
            wirelessMode = !wirelessMode;
            setTierAndMult();
        })
            .setPlayClickSound(true)
            .setBackground(() -> {
                if (wirelessMode) {
                    return new IDrawable[] { GTUITextures.BUTTON_STANDARD_PRESSED,
                        KTUITextures.OVERLAY_BUTTON_WIRELESS_ON };
                } else {
                    return new IDrawable[] { GTUITextures.BUTTON_STANDARD, KTUITextures.OVERLAY_BUTTON_WIRELESS_OFF };
                }
            })
            .setPos(98, 91)
            .setSize(16, 16)
            .addTooltip(StatCollector.translateToLocal("Wireless Mode"))
            .setTooltipShowUpDelay(TOOLTIP_DELAY))
            .widget(new FakeSyncWidget.BooleanSyncer(() -> wirelessMode, val -> wirelessMode = val));
    }

    @Override
    public void getWailaNBTData(EntityPlayerMP player, TileEntity tile, NBTTagCompound tag, World world, int x, int y,
        int z) {
        super.getWailaNBTData(player, tile, tag, world, x, y, z);
        try {
            // 空值检查：防止getControllerSlot()返回null
            ItemStack controllerSlot = getControllerSlot();
            if (mLastRecipeMap != null && controllerSlot != null) {
                tag.setString("Machine", controllerSlot.getDisplayName());
                if (getSpecialMachine()) {
                    tag.setString("MachineType", specialMachineType);
                }
                if (wirelessMode) {
                    DecimalFormat process = new DecimalFormat("#,###");
                    tag.setString("EnergyConsume", process.format(costEU));
                }
            } else if (controllerSlot == null) {
                ExceptionHandler.handleException(
                    "getWailaNBTData",
                    "controller slot is null",
                    new NullPointerException("Controller slot null"));
            }
        } catch (NullPointerException e) {
            // 捕获NPE并记录日志，防止影响Waila显示
            ExceptionHandler.handleException("getWailaNBTData", "NullPointerException", e);
        } catch (Exception e) {
            ExceptionHandler.handleException("getWailaNBTData", "Unexpected exception", e);
        }
    }

    @Override
    public void getWailaBody(ItemStack itemStack, List<String> currentTip, IWailaDataAccessor accessor,
        IWailaConfigHandler config) {
        super.getWailaBody(itemStack, currentTip, accessor, config);
        final NBTTagCompound tag = accessor.getNBTData();
        if (tag.hasKey("Machine")) {
            currentTip.add("Machine: " + EnumChatFormatting.YELLOW + tag.getString("Machine"));
            if (tag.hasKey("MachineType")) {
                currentTip.add("Machine type: " + EnumChatFormatting.YELLOW + tag.getString("MachineType"));
            }
            // 安全地获取并行数，防止getMaxParallel()中可能的NPE
            try {
                currentTip.add("Parallel: " + EnumChatFormatting.YELLOW + getMaxParallel());
            } catch (NullPointerException e) {
                ExceptionHandler.handleException("getWailaBody", "NullPointerException in getMaxParallel", e);
                currentTip.add("Parallel: " + EnumChatFormatting.RED + "Error");
            }
            if (tag.hasKey("EnergyConsume")) {
                currentTip.add("WirelessMode: " + EnumChatFormatting.GREEN + "True");
                currentTip.add("Energy consume: " + EnumChatFormatting.YELLOW + tag.getString("EnergyConsume"));
            } else {
                currentTip.add("WirelessMode: " + EnumChatFormatting.RED + "False");
            }
        } else {
            currentTip.add("Machine: " + EnumChatFormatting.YELLOW + "None");
        }
    }
}
