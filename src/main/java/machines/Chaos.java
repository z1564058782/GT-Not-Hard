package machines;

import static com.gtnewhorizon.structurelib.structure.StructureUtility.ofBlock;
import static com.gtnewhorizon.structurelib.structure.StructureUtility.onElementPass;
import static com.gtnewhorizon.structurelib.structure.StructureUtility.transpose;
import static gregtech.api.GregTechAPI.METATILEENTITIES;
import static gregtech.api.enums.HatchElement.Energy;
import static gregtech.api.enums.HatchElement.ExoticEnergy;
import static gregtech.api.enums.HatchElement.InputBus;
import static gregtech.api.enums.HatchElement.InputHatch;
import static gregtech.api.enums.HatchElement.Maintenance;
import static gregtech.api.enums.HatchElement.OutputBus;
import static gregtech.api.enums.HatchElement.OutputHatch;
import static gregtech.api.enums.Textures.BlockIcons.OVERLAY_FRONT_ORE_FACTORY;
import static gregtech.api.enums.Textures.BlockIcons.OVERLAY_FRONT_ORE_FACTORY_ACTIVE;
import static gregtech.api.enums.Textures.BlockIcons.OVERLAY_FRONT_ORE_FACTORY_ACTIVE_GLOW;
import static gregtech.api.enums.Textures.BlockIcons.OVERLAY_FRONT_ORE_FACTORY_GLOW;
import static gregtech.api.enums.Textures.BlockIcons.casingTexturePages;
import static gregtech.api.enums.Textures.BlockIcons.getCasingTextureForId;
import static gregtech.api.enums.Textures.BlockIcons.getTextureIndex;
import static gregtech.api.metatileentity.implementations.MTEBasicMachine.isValidForLowGravity;
import static gregtech.api.util.GTStructureUtility.buildHatchAdder;
import static gregtech.common.misc.WirelessNetworkManager.addEUToGlobalEnergyMap;
import static java.lang.Math.pow;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Nonnull;

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

import com.cleanroommc.modularui.drawable.DynamicDrawable;
import com.cleanroommc.modularui.drawable.UITexture;
import com.cleanroommc.modularui.screen.ModularPanel;
import com.cleanroommc.modularui.value.sync.BooleanSyncValue;
import com.cleanroommc.modularui.value.sync.PanelSyncManager;
import com.cleanroommc.modularui.widgets.ButtonWidget;
import com.cleanroommc.modularui.widgets.layout.Flow;
import com.gtnewhorizon.structurelib.alignment.constructable.ISurvivalConstructable;
import com.gtnewhorizon.structurelib.structure.IStructureDefinition;
import com.gtnewhorizon.structurelib.structure.ISurvivalBuildEnvironment;
import com.gtnewhorizon.structurelib.structure.StructureDefinition;

import Recipes.ChaosRecipes.ChaosArcaneWorktableRecipes;
import Recipes.ChaosRecipes.ChaosBloodMagicRecipes;
import Recipes.ChaosRecipes.ChaosBotaniaRecipes;
import Recipes.ChaosRecipes.ChaosCircuitAssemblerRecipes;
import Recipes.ChaosRecipes.ChaosCrucibleRecipes;
import Recipes.ChaosRecipes.ChaosEssenceFarmRecipes;
import Recipes.ChaosRecipes.ChaosExoticRecipes;
import Recipes.ChaosRecipes.ChaosRecipeMap;
import Recipes.ChaosRecipes.ChaosReplicatorRecipes;
import Recipes.ChaosRecipes.ChaosRunicMatrixRecipes;
import Recipes.ChaosRecipes.ChaosSpecialCompressRecipes;
import goodgenerator.api.recipe.GoodGeneratorRecipeMaps;
import gregtech.GTMod;
import gregtech.api.GregTechAPI;
import gregtech.api.enums.GTValues;
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
import gregtech.api.modularui2.GTGuiTextures;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMaps;
import gregtech.api.recipe.check.CheckRecipeResult;
import gregtech.api.recipe.check.CheckRecipeResultRegistry;
import gregtech.api.recipe.check.SimpleCheckRecipeResult;
import gregtech.api.recipe.metadata.CompressionTierKey;
import gregtech.api.render.TextureFactory;
import gregtech.api.structure.error.StructureError;
import gregtech.api.structure.error.StructureErrorRegistry;
import gregtech.api.util.GTRecipe;
import gregtech.api.util.GTUtility;
import gregtech.api.util.MultiblockTooltipBuilder;
import gregtech.api.util.OverclockCalculator;
import gregtech.common.blocks.ItemMachines;
import gregtech.common.gui.modularui.multiblock.base.MTEMultiBlockBaseGui;
import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import util.ChaosManager;

public class Chaos extends MTEExtendedPowerMultiBlockBase<Chaos> implements ISurvivalConstructable {

    // 模式 0：控制台；模式 1：追加到文件；模式 2：静默
    private static final int TRY_CATCH_MODE = 2;
    private static final String LOG_FILE_PATH = "ChaosTryCatch.txt";
    private static final Object LOG_LOCK = new Object();

    /**
     * 处理异常信息
     * 根据 TRY_CATCH_MODE 的设置，以不同的方式处理异常输出
     *
     * @param tag     异常标识标签，用于区分不同位置的异常
     * @param message 异常消息内容
     * @param e       异常对象；普通状态提示可传 null
     */
    private static void handleException(String tag, String message, Exception e) {
        switch (TRY_CATCH_MODE) {
            case 0:
                logToConsole(tag, message, e);
                break;

            case 1:
                writeToFile(tag, message, e);
                break;

            case 2:
                break;

            default:
                logToConsole(tag, message, e);
                break;
        }
    }

    private static void logToConsole(String tag, String message, Exception e) {
        System.err.println("[Chaos] " + tag + " - " + message);
        if (e != null) {
            e.printStackTrace();
        }
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
        synchronized (LOG_LOCK) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE_PATH, true))) {
                writer.write("========== " + new java.util.Date() + " ==========");
                writer.newLine();
                writer.write("[Tag]: " + tag);
                writer.newLine();
                writer.write("[Message]: " + message);
                writer.newLine();
                if (e != null) {
                    writer.write(
                        "[Exception Type]: " + e.getClass()
                            .getName());
                    writer.newLine();
                    writer.write("[Stack Trace]:");
                    writer.newLine();
                    StringWriter stackTrace = new StringWriter();
                    e.printStackTrace(new PrintWriter(stackTrace));
                    writer.write(stackTrace.toString());
                }
                writer.newLine();
            } catch (IOException ioException) {
                System.err
                    .println("[Chaos] Failed to write exception to " + LOG_FILE_PATH + "; falling back to console");
                logToConsole(tag, message, e);
                ioException.printStackTrace();
            }
        }
    }

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
    // 机器模式
    private int mode = 0;
    private String specialMachineType = null;
    // 模式更新标志
    private boolean updateMode = false;
    // 是否为多方块机器标志
    private boolean isMultiBlock = false;

    /**
     * 当前控制器槽位缓存
     * 用于替代各处频繁调用 getControllerSlot() 的读取动作，
     * 该变量会在 checkProcessing()、onPostTick()、refreshRecipeMap()、
     * setMachineMode()、GUI/Waila 等原有触发点按原有频率刷新，
     * 从而避免影响机器正常运转。
     */
    private ItemStack controllerSlot = null;

    /**
     * 当前控制器槽位物品的 meta 值缓存
     * 对应原先各处的 getControllerSlot().getItemDamage()，
     * 当 controllerSlot 为空时固定为 -1，表示无有效机器 ID。
     */
    private int machineID = -1;

    /**
     * 当前控制器槽位物品的显示名称缓存
     * 对应 getControllerSlot().getDisplayName()，
     * 用于在非模式化机器时作为 RunningMode 显示文本，
     * 当 controllerSlot 为空时固定为 null。
     */
    private String machineName = null;

    /**
     * 刷新控制器槽位缓存
     * 从 getControllerSlot() 读取当前控制器槽位物品并保存到 controllerSlot，
     * 同时同步更新 machineID 与 machineName。
     * 该方法只负责刷新缓存，不改变调用方的业务逻辑。
     */
    private void refreshControllerSlotCache() {
        // 读取当前控制器槽位，可能为 null
        ItemStack currentControllerSlot = getControllerSlot();
        // 更新全局缓存变量
        controllerSlot = currentControllerSlot;
        // 当槽位存在时读取 meta 值与显示名称，否则置为默认值
        if (currentControllerSlot != null) {
            machineID = currentControllerSlot.getItemDamage();
            machineName = currentControllerSlot.getDisplayName();
        } else {
            machineID = -1;
            machineName = null;
        }
    }

    /**
     * 刷新控制器槽位缓存并返回当前槽位
     * 用于那些既需要刷新缓存、又需要立即使用槽位引用的原有逻辑。
     *
     * @return 当前控制器槽位物品，可能为 null
     */
    private ItemStack refreshControllerSlotCacheAndGet() {
        // 先刷新缓存
        refreshControllerSlotCache();
        // 返回刷新后的槽位引用
        return controllerSlot;
    }

    /**
     * 首次tick回调
     * 初始化机器所有者UUID和矿石处理配方
     */
    @Override
    public void onFirstTick(IGregTechTileEntity aBaseMetaTileEntity) {
        super.onFirstTick(aBaseMetaTileEntity);
        this.ownerUUID = aBaseMetaTileEntity.getOwnerUuid();
        // 首次tick时同步一次控制器槽位缓存，保证后续逻辑可直接使用全局变量
        refreshControllerSlotCache();
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
            aNBT.setInteger("mode", mode);
            // 保存控制器槽位缓存与机器ID缓存，保证读档后全局变量可用
            if (controllerSlot != null) {
                NBTTagCompound controllerSlotTag = new NBTTagCompound();
                controllerSlot.writeToNBT(controllerSlotTag);
                aNBT.setTag("controllerSlot", controllerSlotTag);
            }
            aNBT.setInteger("machineID", machineID);
            // 保存机器名称缓存，保证读档后 RunningMode 可正常显示
            if (machineName != null) {
                aNBT.setString("machineName", machineName);
            }
            if (getSpecialMachine()) {
                // 添加空值检查：只有当 specialMachineType 不为 null 且不为空字符串时才保存
                if (specialMachineType != null && !specialMachineType.trim()
                    .isEmpty()) {
                    aNBT.setString("MachineType", specialMachineType);
                } else {
                    // 如果 specialMachineType 为空，记录警告但不保存
                    handleException("saveNBTData", "specialMachineType is null or empty, skipping save", null);
                }
            }
        } catch (NullPointerException e) {
            // 捕获getSpecialMachine()中可能发生的NPE，记录详细错误信息以便定位问题
            handleException("saveNBTData", "NullPointerException - controller slot may be null", e);
            // 尝试安全地保存部分数据
            try {
                aNBT.setBoolean("wirelessMode", wirelessMode);
                aNBT.setInteger("mode", mode);
                if (controllerSlot != null) {
                    NBTTagCompound controllerSlotTag = new NBTTagCompound();
                    controllerSlot.writeToNBT(controllerSlotTag);
                    aNBT.setTag("controllerSlot", controllerSlotTag);
                }
                aNBT.setInteger("machineID", machineID);
                if (machineName != null) {
                    aNBT.setString("machineName", machineName);
                }
                // 不尝试保存MachineType
            } catch (Exception ex) {
                handleException("saveNBTData", "Failed to save fallback NBT data", ex);
            }
        } catch (IllegalArgumentException e) {
            // 专门捕获 IllegalArgumentException（包括空字符串错误）
            handleException("saveNBTData", "IllegalArgumentException - likely empty string for MachineType", e);
            // 尝试安全地保存除MachineType外的其他数据
            try {
                aNBT.setBoolean("wirelessMode", wirelessMode);
                aNBT.setInteger("mode", mode);
                if (controllerSlot != null) {
                    NBTTagCompound controllerSlotTag = new NBTTagCompound();
                    controllerSlot.writeToNBT(controllerSlotTag);
                    aNBT.setTag("controllerSlot", controllerSlotTag);
                }
                aNBT.setInteger("machineID", machineID);
                if (machineName != null) {
                    aNBT.setString("machineName", machineName);
                }
            } catch (Exception ex) {
                handleException("saveNBTData", "Failed to save fallback NBT data after IllegalArgumentException", ex);
            }
        } catch (Exception e) {
            // 捕获其他可能的异常
            handleException("saveNBTData", "Unexpected exception", e);
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
                handleException("loadNBTData", "loaded MachineType is null or empty, ignoring", null);
            }
        }
        // 加载基本状态
        wirelessMode = aNBT.getBoolean("wirelessMode");
        mode = aNBT.getInteger("mode");
        // 加载控制器槽位缓存与机器ID缓存
        if (aNBT.hasKey("controllerSlot")) {
            try {
                controllerSlot = ItemStack.loadItemStackFromNBT(aNBT.getCompoundTag("controllerSlot"));
            } catch (Exception e) {
                handleException("loadNBTData", "Failed to load controllerSlot from NBT", e);
                controllerSlot = null;
            }
        }
        if (aNBT.hasKey("machineID")) {
            machineID = aNBT.getInteger("machineID");
        }
        // 加载机器名称缓存
        if (aNBT.hasKey("machineName")) {
            machineName = aNBT.getString("machineName");
        }
        // 若缓存缺失但实际控制器槽位存在，则从实际槽位补齐缓存，保证兼容旧存档
        if (controllerSlot == null) {
            refreshControllerSlotCache();
        }
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
        return survivalBuildPiece(STRUCTURE_PIECE_MAIN, stackSize, 1, 1, 0, elementBudget, env, false, true);
    }

    /**
     * 检查机器结构
     */
    @Override
    public void checkMachine(IGregTechTileEntity aBaseMetaTileEntity, ItemStack aStack, List<StructureError> errors) {
        if (errors == null) {
            return;
        }

        this.mMaintenanceHatches.clear();
        this.mInputBusses.clear();
        this.mInputHatches.clear();
        this.mOutputBusses.clear();
        this.mOutputHatches.clear();
        this.mEnergyHatches.clear();
        this.mExoticEnergyHatches.clear();
        mCasingAmount = 0;

        boolean isMainStructureValid = checkPiece(STRUCTURE_PIECE_MAIN, 1, 1, 0, errors);

        if (!isMainStructureValid) {
            return;
        }

        if (mCasingAmount < 4) {
            errors.add(StructureErrorRegistry.UNKNOWN_STRUCTURE_ERROR);
            return;
        }

        if (mMaintenanceHatches.size() != 1) {
            errors.add(StructureErrorRegistry.UNKNOWN_STRUCTURE_ERROR);
        }
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

    // === 并行计算 ===
    /**
     * 计算最大并行数
     * 基于控制器槽位中的机器数量计算：2^(机器数量)
     */
    private int getMaxParallel() {
        // 使用全局控制器槽位缓存，避免重复调用 getControllerSlot()
        if (controllerSlot == null) {
            return 1;
        }
        if (controllerSlot.stackSize < 31 && !wirelessMode) {
            return (int) pow(2, controllerSlot.stackSize);
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
        // 先刷新控制器槽位缓存，保证 controllerSlot 与 machineID 为最新值
        refreshControllerSlotCache();
        if (isCorrectMachinePart(controllerSlot)) {
            machineID = controllerSlot.getItemDamage();
            RecipeMap<?> RecipeMap = getMultifunctionalRecipeMap(machineID);
            if (RecipeMap != null) {
                isMultiBlock = true;
                return RecipeMap;
            }
            MetaTileEntity e = (MetaTileEntity) METATILEENTITIES[machineID];
            if (e instanceof MTEMultiBlockBase mteMultiBlockBase) {
                isMultiBlock = true;
                RecipeMap = mteMultiBlockBase.getRecipeMap();
                return RecipeMap;
            }
            isMultiBlock = false;
            return ChaosManager.giveRecipeMap(ChaosManager.getMachineName(controllerSlot));
        }
        return null;
    }

    // === 多类型机器配方列表 ===
    private static final Integer[] specialMachine = { 358, 995, 3006, 3008, 12735, 13532, 15513, 15548, 15550, 31021,
        32018 };

    private boolean getSpecialMachine() {
        try {
            // 刷新控制器槽位缓存，保证 controllerSlot 与 machineID 为最新值
            refreshControllerSlotCache();
            // 空值检查：如果控制器槽位为空，返回false
            if (controllerSlot == null) {
                handleException("getSpecialMachine", "controller slot is null, returning false", null);
                return false;
            }
            Integer machineIDValue = machineID;
            List<Integer> specialMachineList = Arrays.asList(specialMachine);
            return specialMachineList.contains(machineIDValue);
        } catch (NullPointerException e) {
            // 捕获NPE并记录详细信息以便定位
            handleException("getSpecialMachine", "NullPointerException", e);
            return false;
        }
    }

    // Original Machine Recipes
    // "Magnetic Flux Exhibitor"-358
    private static final String[] Magnetic_Flux_Exhibitor_Mode = { "Polarizer", "Electromagnetic Separator" };
    private static final RecipeMap<?>[] Magnetic_Flux_Exhibitor_Mode_Recipes = { RecipeMaps.polarizerRecipes,
        RecipeMaps.electroMagneticSeparatorRecipes };
    private static final UITexture[] Magnetic_Flux_Exhibitor_Mode_Icons = {
        GTGuiTextures.OVERLAY_BUTTON_MACHINEMODE_POLARIZER, GTGuiTextures.OVERLAY_BUTTON_MACHINEMODE_SEPARATOR };
    // Utupu-Tanuri-995
    private static final String[] Utupu_Tanuri_Mode = { "Dehydrator", "Vacuum Furnace" };
    private static final RecipeMap<?>[] Utupu_Tanuri_Mode_Recipes = { RecipeMaps.chemicalDehydratorNonCellRecipes,
        RecipeMaps.vacuumFurnaceRecipes };
    private static final UITexture[] Utupu_Tanuri_Mode_Icons = { GTGuiTextures.OVERLAY_BUTTON_MACHINEMODE_LPF_FLUID,
        GTGuiTextures.OVERLAY_BUTTON_MACHINEMODE_STEAM };
    // "Hot Isostatic Pressurization Unit"-3006
    private static final String[] Hot_Isostatic_Pressurization_Unit_Mode = { "Compressor", "HIP Compressor" };
    private static final RecipeMap<?>[] Hot_Isostatic_Pressurization_Unit_Mode_Recipes = { RecipeMaps.compressorRecipes,
        ChaosSpecialCompressRecipes.SpecialCompressRecipes_HIP };
    private static final UITexture[] Hot_Isostatic_Pressurization_Unit_Mode_Icons = {
        GTGuiTextures.OVERLAY_BUTTON_ASSEMBLER_MODE, GTGuiTextures.OVERLAY_BUTTON_PRECISE_MODE };
    // "Pseudostable Black Hole Containment Field"-3008
    private static final String[] Pseudostable_Black_Hole_Containment_Field_Mode = { "BHC Compressor",
        "Advanced Neutronium Compressor" };
    private static final RecipeMap<?>[] Pseudostable_Black_Hole_Containment_Field_Mode_Recipes = {
        ChaosSpecialCompressRecipes.SpecialCompressRecipes_BHC, RecipeMaps.neutroniumCompressorRecipes };
    private static final UITexture[] Pseudostable_Black_Hole_Containment_Field_Mode_Icons = {
        GTGuiTextures.OVERLAY_BUTTON_ASSEMBLER_MODE, GTGuiTextures.OVERLAY_BUTTON_PRECISE_MODE };
    // "Circuit Assembly Line"-12735
    private static final String[] Circuit_Assembly_Line_Mode = { "Circuit Assembly Line", "Circuit Assembly" };
    private static final RecipeMap<?>[] Circuit_Assembly_Line_Mode_Recipes = {
        ChaosCircuitAssemblerRecipes.addChaosCircuitAssemblerRecipes, RecipeMaps.circuitAssemblerRecipes };
    private static final UITexture[] Circuit_Assembly_Line_Mode_Icons = { GTGuiTextures.OVERLAY_BUTTON_ASSEMBLER_MODE,
        GTGuiTextures.OVERLAY_BUTTON_PRECISE_MODE };
    // "Advanced Assembly Line"-13532
    private static final String[] Advanced_Assembly_Line_Mode = { "Item Assembly Line", "Fluid Assembly Line" };
    private static final RecipeMap<?>[] Advanced_Assembly_Line_Mode_Recipes = { ChaosRecipeMap.AssemblyLineItemRecipe,
        RecipeMaps.circuitAssemblerRecipes };
    private static final UITexture[] Advanced_Assembly_Line_Mode_Icons = { GTGuiTextures.OVERLAY_BUTTON_ASSEMBLER_MODE,
        GTGuiTextures.OVERLAY_BUTTON_PRECISE_MODE };
    // "Amazon Warehousing Depot"-15513
    private static final String[] Amazon_Warehousing_Depot_Mode = { "Packager", "Unpackeager" };
    private static final RecipeMap<?>[] Amazon_Warehousing_Depot_Mode_Recipes = { RecipeMaps.packagerRecipes,
        RecipeMaps.unpackagerRecipes };
    private static final UITexture[] Amazon_Warehousing_Depot_Mode_Icons = {
        GTGuiTextures.OVERLAY_BUTTON_MACHINEMODE_PACKAGER, GTGuiTextures.OVERLAY_BUTTON_MACHINEMODE_UNPACKAGER };
    // "Industrial Arc Furnace"-15548
    private static final String[] Industrial_Arc_Furnace_Mode = { "Normal", "Ore" };
    private static final RecipeMap<?>[] Industrial_Arc_Furnace_Mode_Recipes = { RecipeMaps.arcFurnaceRecipes,
        RecipeMaps.furnaceRecipes };
    private static final UITexture[] Industrial_Arc_Furnace_Mode_Icons = { GTGuiTextures.OVERLAY_BUTTON_MACHINEMODE_ARC,
        GTGuiTextures.TT_OVERLAY_BUTTON_FURNACE_MODE };
    // "Ore Washing Plant"-15550
    private static final String[] Ore_Washing_Plant_Mode = { "Ore Washer", "Simple Washer" };
    private static final RecipeMap<?>[] Ore_Washing_Plant_Mode_Recipes = { RecipeMaps.oreWasherRecipes,
        RecipeMaps.simpleWasherRecipes };
    private static final UITexture[] Ore_Washing_Plant_Mode_Icons = {
        GTGuiTextures.OVERLAY_BUTTON_MACHINEMODE_WASHPLANT, GTGuiTextures.OVERLAY_BUTTON_MACHINEMODE_SIMPLEWASHER };
    // "Dangote Distillus"-31021
    private static final String[] Dangote_Distillus_Mode = { "Distillery", "Distillation Tower" };
    private static final RecipeMap<?>[] Dangote_Distillus_Mode_Recipes = { RecipeMaps.distilleryRecipes,
        RecipeMaps.distillationTowerRecipes };
    private static final UITexture[] Dangote_Distillus_Mode_Icons = {
        GTGuiTextures.OVERLAY_BUTTON_MACHINEMODE_DISTILLING,
        GTGuiTextures.OVERLAY_BUTTON_MACHINEMODE_DISTILLATION_TOWER };
    // "Precise Auto-Assembler MT-3662"-32018
    private static final String[] Precise_Auto_Assembler_MT_3662_Mode = { "Precise Assembler", "Assembler" };
    private static final RecipeMap<?>[] Precise_Auto_Assembler_MT_3662_Mode_Recipes = {
        GoodGeneratorRecipeMaps.preciseAssemblerRecipes, RecipeMaps.assemblerRecipes };
    private static final UITexture[] Precise_Auto_Assembler_MT_3662_Mode_Icons = {
        GTGuiTextures.OVERLAY_BUTTON_PRECISE_MODE, GTGuiTextures.OVERLAY_BUTTON_ASSEMBLER_MODE };

    // Non-original Machine Recipes
    // "Research Completer"-13001
    private static final String[] Research_Completer_mod = { "Blood Magic", "Botania", "Essence Farm" };
    private static final RecipeMap<?>[] Research_Completer = { ChaosBloodMagicRecipes.addBloodMagicRecipes,
        ChaosBotaniaRecipes.addBotaniaRecipes, ChaosEssenceFarmRecipes.addEssenceFarmRecipes };
    // "Heliofusion Exoticizer"-15415
    private static final String[] Heliofusion_Exoticizer_mod = { "Degenerate Quark Gluon", "Magmatter" };
    private static final RecipeMap<?>[] Heliofusion_Exoticizer = {
        ChaosExoticRecipes.ExoticRecipes_DegenerateQuarkGluon, ChaosExoticRecipes.ExoticRecipes_Magmatter };
    // "Elemental Duplicator"-31050
    private static final String[] Elemental_Duplicator_mod = { "Replicator Item", "Replicator Fluid" };
    private static final RecipeMap<?>[] Elemental_Duplicator = { ChaosReplicatorRecipes.ReplicatorRecipes_Item,
        ChaosReplicatorRecipes.ReplicatorRecipes_Fluid };
    // "Large Essentia Smeltery"-32024
    private static final String[] Large_Essentia_Smeltery_mod = { "Arcane Worktable", "Crucible", "Runic Matrix" };
    private static final RecipeMap<?>[] Large_Essentia_Smeltery = {
        ChaosArcaneWorktableRecipes.addArcaneWorktableRecipes, ChaosCrucibleRecipes.addCrucibleRecipes,
        ChaosRunicMatrixRecipes.addRunicMatrixRecipes };

    /**
     * 读取多类型机器的配方
     * 根据机器ID和当前模式获取对应的配方映射
     */
    private RecipeMap<?> getMultifunctionalRecipeMap(int meta) {
        switch (meta) {
            case 358 -> {
                return Magnetic_Flux_Exhibitor_Mode_Recipes[Math.min(mode, 1)];
            }
            case 995 -> {
                return Utupu_Tanuri_Mode_Recipes[Math.min(mode, 1)];
            }
            case 3006 -> {
                return Hot_Isostatic_Pressurization_Unit_Mode_Recipes[Math.min(mode, 1)];
            }
            case 3008 -> {
                return Pseudostable_Black_Hole_Containment_Field_Mode_Recipes[Math.min(mode, 1)];
            }
            case 12735 -> {
                return Circuit_Assembly_Line_Mode_Recipes[Math.min(mode, 1)];
            }
            case 13532 -> {
                return Advanced_Assembly_Line_Mode_Recipes[Math.min(mode, 1)];
            }
            case 15513 -> {
                return Amazon_Warehousing_Depot_Mode_Recipes[Math.min(mode, 1)];
            }
            case 15548 -> {
                return Industrial_Arc_Furnace_Mode_Recipes[Math.min(mode, 1)];
            }
            case 15550 -> {
                return Ore_Washing_Plant_Mode_Recipes[Math.min(mode, 1)];
            }
            case 31021 -> {
                return Dangote_Distillus_Mode_Recipes[Math.min(mode, 1)];
            }
            case 32018 -> {
                return Precise_Auto_Assembler_MT_3662_Mode_Recipes[Math.min(mode, 1)];
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
        // 按原有频率在配方检查入口刷新控制器槽位缓存
        refreshControllerSlotCache();
        if (!GTUtility.areStacksEqual(lastControllerStack, controllerSlot) || updateMode) {
            if (updateMode) updateMode = false;
            // controller slot has changed
            lastControllerStack = controllerSlot;
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
        // 按原有频率在电压等级计算入口刷新控制器槽位缓存
        refreshControllerSlotCache();
        // 空值检查：防止 controllerSlot 为 null 导致 NPE
        if (controllerSlot == null) {
            tTier = 0;
            return;
        }
        IMetaTileEntity aMachine = ItemMachines.getMetaTileEntity(controllerSlot);
        if (aMachine instanceof MTETieredMachineBlock) {
            tTier = ((MTETieredMachineBlock) aMachine).mTier;
        } else {
            tTier = 0;
        }
    }

    @Override
    public void onPostTick(IGregTechTileEntity aBaseMetaTileEntity, long aTick) {
        super.onPostTick(aBaseMetaTileEntity, aTick);
        if (mMachine && aTick % 20 == 0) {
            // 按原有频率每20tick刷新一次控制器槽位缓存
            refreshControllerSlotCache();
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

    protected UITexture[] getModeIcons() {
        // 按原有频率在获取模式图标入口刷新控制器槽位缓存
        refreshControllerSlotCache();
        // 空值检查：控制器槽位为空时无法获取机器 ID，直接返回空数组，避免 NPE
        if (controllerSlot == null) {
            return new UITexture[0];
        }
        switch (machineID) {
            case 358 -> {
                return Magnetic_Flux_Exhibitor_Mode_Icons;
            }
            case 995 -> {
                return Utupu_Tanuri_Mode_Icons;
            }
            case 3006 -> {
                return Hot_Isostatic_Pressurization_Unit_Mode_Icons;
            }
            case 3008 -> {
                return Pseudostable_Black_Hole_Containment_Field_Mode_Icons;
            }
            case 12735 -> {
                return Circuit_Assembly_Line_Mode_Icons;
            }
            case 13532 -> {
                return Advanced_Assembly_Line_Mode_Icons;
            }
            case 15513 -> {
                return Amazon_Warehousing_Depot_Mode_Icons;
            }
            case 15548 -> {
                return Industrial_Arc_Furnace_Mode_Icons;
            }
            case 15550 -> {
                return Ore_Washing_Plant_Mode_Icons;
            }
            case 31021 -> {
                return Dangote_Distillus_Mode_Icons;
            }
            case 32018 -> {
                return Precise_Auto_Assembler_MT_3662_Mode_Icons;
            }
            default -> {
                // 关键修复：默认分支返回空数组而非 null，
                // 避免普通单模式机器在构建 GUI 时因 withMachineModeIcons(null) 导致界面无法打开
                return new UITexture[0];
            }
        }
    }

    @Override
    public boolean supportsMachineModeSwitch() {
        return true;
    }

    @Override
    public int getMachineMode() {
        return mode;
    }

    /**
     * 刷新配方映射缓存
     * 根据当前控制器槽位与当前模式重新计算 mLastRecipeMap，
     * 并将其同步到所有输入总线与输入仓的 mRecipeMap，
     * 使模式切换后无需重放控制器槽位物品即可立即生效
     */
    private void refreshRecipeMap() {
        // 先刷新控制器槽位缓存
        refreshControllerSlotCache();
        // 控制器槽位为空时无法计算配方映射，保持原状态
        if (controllerSlot == null) {
            return;
        }
        // 更新上次控制器槽位记录，避免 checkProcessing() 因物品相同而跳过刷新
        lastControllerStack = controllerSlot;
        // 重新计算配方映射
        mLastRecipeMap = fetchRecipeMap();
        // 重新计算电压等级与降频倍数
        setTierAndMult();
        // 同步配方映射到所有输入总线
        for (MTEHatchInputBus tInputBus : mInputBusses) {
            tInputBus.mRecipeMap = mLastRecipeMap;
        }
        // 同步配方映射到所有输入仓
        for (MTEHatchInput tInputHatch : mInputHatches) {
            tInputHatch.mRecipeMap = mLastRecipeMap;
        }
    }

    @Override
    public void setMachineMode(int newMode) {
        // 先获取图标数组并判空，避免 getModeIcons() 返回空数组时访问 length 出错
        UITexture[] modeIcons = getModeIcons();
        // 关键防护：即使 getModeIcons() 意外返回 null 也不会崩溃
        if (modeIcons == null || modeIcons.length == 0) {
            return;
        }
        if (newMode < 0 || newMode >= modeIcons.length) {
            return;
        }

        // 模式未发生变化时无需刷新配方映射
        if (mode == newMode) {
            return;
        }

        mode = newMode;
        // 标记模式已更新，促使 checkProcessing() 重新读取配方映射
        updateMode = true;
        // 立即刷新一次配方映射与输入总线/输入仓的配方映射，保证界面与运行状态同步
        refreshRecipeMap();
        super.setMachineMode(newMode);
    }

    @Override
    public int nextMachineMode() {
        // 先获取图标数组并判空，避免对空数组取模或访问 length 出错
        UITexture[] modeIcons = getModeIcons();
        // 关键防护：即使 getModeIcons() 意外返回 null 也不会崩溃
        if (modeIcons == null || modeIcons.length == 0) {
            return mode;
        }
        return (mode + 1) % modeIcons.length;
    }

    @Override
    public String getMachineModeKey() {
        // 按原有频率在获取机器模式键入口刷新控制器槽位缓存
        refreshControllerSlotCache();
        // 空值检查：控制器槽位为空时无法获取机器 ID，直接返回 null
        if (controllerSlot == null) {
            return null;
        }
        switch (machineID) {
            case 358 -> {
                return Magnetic_Flux_Exhibitor_Mode[Math.min(mode, 1)];
            }
            case 995 -> {
                return Utupu_Tanuri_Mode[Math.min(mode, 1)];
            }
            case 3006 -> {
                return Hot_Isostatic_Pressurization_Unit_Mode[Math.min(mode, 1)];
            }
            case 3008 -> {
                return Pseudostable_Black_Hole_Containment_Field_Mode[Math.min(mode, 1)];
            }
            case 12735 -> {
                return Circuit_Assembly_Line_Mode[Math.min(mode, 1)];
            }
            case 13532 -> {
                return Advanced_Assembly_Line_Mode[Math.min(mode, 1)];
            }
            case 15513 -> {
                return Amazon_Warehousing_Depot_Mode[Math.min(mode, 1)];
            }
            case 15548 -> {
                return Industrial_Arc_Furnace_Mode[Math.min(mode, 1)];
            }
            case 15550 -> {
                return Ore_Washing_Plant_Mode[Math.min(mode, 1)];
            }
            case 31021 -> {
                return Dangote_Distillus_Mode[Math.min(mode, 1)];
            }
            case 32018 -> {
                return Precise_Auto_Assembler_MT_3662_Mode[Math.min(mode, 1)];
            }
            default -> {
                // 关键修复：对于非模式化机器，RunningMode 显示控制器槽位物品的显示名称，
                // 若 machineName 为空则返回 null，避免界面显示为 null
                if (machineName != null && !machineName.trim()
                    .isEmpty()) {
                    return machineName;
                }
                return null;
            }
        }
    }

    @Override
    protected @NotNull MTEMultiBlockBaseGui<?> getGui() {
        return new MTEMultiBlockBaseGui<>(this) {

            @Override
            protected void registerSyncValues(PanelSyncManager syncManager) {
                super.registerSyncValues(syncManager);

                syncManager.syncValue(
                    "wirelessModeToggle",
                    new BooleanSyncValue(() -> wirelessMode, enabled -> wirelessMode = enabled).allowC2S());
            }

            @Override
            protected Flow createLeftPanelGapRow(ModularPanel parent, PanelSyncManager syncManager) {

                BooleanSyncValue wireless = syncManager.findSyncHandler("wirelessModeToggle", BooleanSyncValue.class);

                return super.createLeftPanelGapRow(parent, syncManager).child(
                    new ButtonWidget<>().size(18, 18)
                        .playClickSound(true)
                        .overlay(
                            new DynamicDrawable(
                                () -> wireless.getBoolValue() ? GTGuiTextures.OVERLAY_BUTTON_WIRELESS_ON
                                    : GTGuiTextures.OVERLAY_BUTTON_WIRELESS_OFF))
                        .onMousePressed(data -> {
                            wireless.setBoolValue(!wireless.getBoolValue());
                            return true;
                        })
                        .tooltipBuilder(tooltip -> {
                            tooltip.setAutoUpdate(true);
                            tooltip.addLine(
                                StatCollector
                                    .translateToLocal("Wireless_Mode_" + (wireless.getBoolValue() ? "ON" : "OFF")));
                        }));
            }
        }.withMachineModeIcons(getModeIcons());
    }

    @Override
    public void getWailaNBTData(EntityPlayerMP player, TileEntity tile, NBTTagCompound tag, World world, int x, int y,
        int z) {
        super.getWailaNBTData(player, tile, tag, world, x, y, z);
        try {
            // 按原有频率在 Waila 数据入口刷新控制器槽位缓存
            refreshControllerSlotCache();
            // 空值检查：防止 controllerSlot 为 null
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
                handleException("getWailaNBTData", "controller slot is null", null);
            }
        } catch (NullPointerException e) {
            // 捕获NPE并记录日志，防止影响Waila显示
            handleException("getWailaNBTData", "NullPointerException", e);
        } catch (Exception e) {
            handleException("getWailaNBTData", "Unexpected exception", e);
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
                handleException("getWailaBody", "NullPointerException in getMaxParallel", e);
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
