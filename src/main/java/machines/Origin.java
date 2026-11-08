package machines;

import static com.gtnewhorizon.structurelib.structure.StructureUtility.ofBlock;
import static com.gtnewhorizon.structurelib.structure.StructureUtility.onElementPass;
import static com.gtnewhorizon.structurelib.structure.StructureUtility.transpose;
import static gregtech.api.enums.HatchElement.Dynamo;
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
import static gregtech.api.util.GTStructureUtility.buildHatchAdder;
import static gregtech.api.util.GTUtility.validMTEList;
import static gregtech.common.misc.WirelessNetworkManager.addEUToGlobalEnergyMap;
import static gtPlusPlus.xmod.gregtech.api.metatileentity.implementations.base.GTPPMultiBlockBase.GTPPHatchElement.TTDynamo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;
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
import net.minecraftforge.fluids.FluidStack;

import org.jetbrains.annotations.NotNull;

import com.cleanroommc.modularui.drawable.DynamicDrawable;
import com.cleanroommc.modularui.screen.ModularPanel;
import com.cleanroommc.modularui.value.sync.BooleanSyncValue;
import com.cleanroommc.modularui.value.sync.PanelSyncManager;
import com.cleanroommc.modularui.widgets.ButtonWidget;
import com.cleanroommc.modularui.widgets.layout.Flow;
import com.gtnewhorizon.structurelib.alignment.constructable.ISurvivalConstructable;
import com.gtnewhorizon.structurelib.structure.IStructureDefinition;
import com.gtnewhorizon.structurelib.structure.ISurvivalBuildEnvironment;
import com.gtnewhorizon.structurelib.structure.StructureDefinition;

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
import gregtech.api.GregTechAPI;
import gregtech.api.enums.Textures;
import gregtech.api.interfaces.ISecondaryDescribable;
import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.logic.ProcessingLogic;
import gregtech.api.metatileentity.implementations.MTEHatch;
import gregtech.api.modularui2.GTGuiTextures;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.check.CheckRecipeResult;
import gregtech.api.recipe.check.CheckRecipeResultRegistry;
import gregtech.api.render.TextureFactory;
import gregtech.api.structure.error.StructureError;
import gregtech.api.structure.error.StructureErrorRegistry;
import gregtech.api.util.GTRecipe;
import gregtech.api.util.GTUtility;
import gregtech.api.util.MultiblockTooltipBuilder;
import gregtech.api.util.shutdown.ShutDownReasonRegistry;
import gregtech.common.gui.modularui.multiblock.base.MTEMultiBlockBaseGui;
import gtPlusPlus.xmod.gregtech.api.metatileentity.implementations.base.GTPPMultiBlockBase;
import hatch.SuperInputMachineGui;
import hatch.SuperInputOutputSummary;
import hatch.SuperInputProcessing;
import hatch.SuperInputProcessingLogic;
import hatch.SuperOutputRouting;
import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;

public class Origin extends GTPPMultiBlockBase<Origin> implements ISurvivalConstructable, ISecondaryDescribable {

    /** Preserve every output fragment until the long ME transaction receives it. */
    @Override
    public boolean addItemOutputs(ItemStack[] outputs) {
        if (SuperOutputRouting.hasSuperOutputBus(this)) return SuperOutputRouting.addItemOutputs(this, outputs);
        return super.addItemOutputs(outputs);
    }

    /** 本 Mod 发电控制器同样使用只读输出摘要，不复制或同步逐片产物数组。 */
    private final SuperInputOutputSummary outputSummary = new SuperInputOutputSummary();

    // ========== try-catch 输出模式配置 ==========
    /**
     * try-catch 输出模式控制变量
     * 模式 0: 直接输出到终端 (System.err)
     * 模式 1: 统一输出到文件 OriginTryCatch.txt
     * 模式 2: 不进行任何显示，直接销毁
     */
    private static final int TRY_CATCH_MODE = 2; // 开发者可在此修改模式值: 0, 1, 或 2

    // 文件输出相关的静态变量
    private static BufferedWriter logWriter = null; // 文件写入缓冲流
    private static final Object logLock = new Object(); // 文件写入同步锁
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"); // 时间格式化

    /**
     * 静态初始化块，用于在模式1时初始化文件写入器
     */
    static {
        if (TRY_CATCH_MODE == 1) {
            try {
                // 获取日志文件对象，位于当前工作目录
                File logFile = new File("OriginTryCatch.txt");
                // 如果文件不存在则创建新文件，如果存在则追加写入
                logWriter = new BufferedWriter(new FileWriter(logFile, true));
                // 写入文件头分隔线，标识新的会话开始
                logWriter.write(
                    "========== Origin Try-Catch Log Started at " + dateFormat.format(new Date()) + " ==========");
                logWriter.newLine();
                logWriter.flush();
            } catch (IOException e) {
                // 如果文件写入初始化失败，降级到模式0输出到终端
                System.err.println("[Origin] Failed to initialize log file, falling back to console output mode");
                System.err.println("[Origin] Error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    /**
     * 统一的异常处理方法
     * 根据 TRY_CATCH_MODE 的值决定如何输出异常信息
     *
     * @param className  调用异常的类名/标识
     * @param methodName 调用异常的方法名
     * @param e          捕获的异常对象
     */
    private static void handleException(String className, String methodName, Exception e) {
        // 根据配置的模式进行不同的处理
        switch (TRY_CATCH_MODE) {
            case 0: // 模式0: 直接输出到终端
                System.err.println("[" + className + "] Exception in " + methodName + ": " + e.getMessage());
                e.printStackTrace();
                break;

            case 1: // 模式1: 统一输出到文件 OriginTryCatch.txt
                synchronized (logLock) {
                    try {
                        // 如果写入器为空，尝试重新初始化
                        if (logWriter == null) {
                            File logFile = new File("OriginTryCatch.txt");
                            logWriter = new BufferedWriter(new FileWriter(logFile, true));
                        }

                        // 获取当前时间戳
                        String timestamp = dateFormat.format(new Date());
                        // 获取异常的堆栈跟踪信息
                        StringWriter sw = new StringWriter();
                        e.printStackTrace(new PrintWriter(sw));
                        String stackTrace = sw.toString();

                        // 写入异常信息到文件
                        logWriter.write(
                            "[" + timestamp
                                + "] ["
                                + className
                                + "] Exception in "
                                + methodName
                                + ": "
                                + e.getMessage());
                        logWriter.newLine();
                        logWriter.write("[" + timestamp + "] Stack Trace:");
                        logWriter.newLine();
                        logWriter.write(stackTrace);
                        logWriter.newLine();
                        logWriter.write("[" + timestamp + "] ----------------------------------------");
                        logWriter.newLine();
                        logWriter.flush();
                    } catch (IOException ioException) {
                        // 如果写入文件失败，降级到模式0输出到终端
                        System.err.println(
                            "[" + className + "] Failed to write exception to file, falling back to console output");
                        System.err.println("[" + className + "] Exception in " + methodName + ": " + e.getMessage());
                        e.printStackTrace();
                    }
                }
                break;

            case 2: // 模式2: 不进行任何显示，直接销毁（什么都不做）
                // 异常信息被静默销毁，不进行任何输出
                break;

            default: // 默认情况，使用模式0的行为
                System.err.println("[" + className + "] Exception in " + methodName + ": " + e.getMessage());
                e.printStackTrace();
                break;
        }
    }

    /**
     * 带额外消息的异常处理方法
     *
     * @param className         调用异常的类名/标识
     * @param methodName        调用异常的方法名
     * @param additionalMessage 附加消息
     * @param e                 捕获的异常对象
     */
    private static void handleException(String className, String methodName, String additionalMessage, Exception e) {
        switch (TRY_CATCH_MODE) {
            case 0: // 模式0: 直接输出到终端
                System.err.println(
                    "[" + className
                        + "] Exception in "
                        + methodName
                        + ": "
                        + additionalMessage
                        + " - "
                        + e.getMessage());
                e.printStackTrace();
                break;

            case 1: // 模式1: 统一输出到文件
                synchronized (logLock) {
                    try {
                        if (logWriter == null) {
                            File logFile = new File("OriginTryCatch.txt");
                            logWriter = new BufferedWriter(new FileWriter(logFile, true));
                        }

                        String timestamp = dateFormat.format(new Date());
                        StringWriter sw = new StringWriter();
                        e.printStackTrace(new PrintWriter(sw));
                        String stackTrace = sw.toString();

                        logWriter.write(
                            "[" + timestamp
                                + "] ["
                                + className
                                + "] Exception in "
                                + methodName
                                + ": "
                                + additionalMessage
                                + " - "
                                + e.getMessage());
                        logWriter.newLine();
                        logWriter.write("[" + timestamp + "] Stack Trace:");
                        logWriter.newLine();
                        logWriter.write(stackTrace);
                        logWriter.newLine();
                        logWriter.write("[" + timestamp + "] ----------------------------------------");
                        logWriter.newLine();
                        logWriter.flush();
                    } catch (IOException ioException) {
                        System.err.println(
                            "[" + className + "] Failed to write exception to file: " + ioException.getMessage());
                    }
                }
                break;

            case 2: // 模式2: 不进行任何显示，直接销毁
                // 静默处理
                break;

            default:
                System.err.println("[" + className + "] Exception in " + methodName + ": " + e.getMessage());
                e.printStackTrace();
                break;
        }
    }

    /**
     * 关闭日志文件写入器的方法
     * 应在程序关闭时调用，确保所有缓冲数据被写入文件
     */
    public static void closeLogWriter() {
        if (TRY_CATCH_MODE == 1 && logWriter != null) {
            synchronized (logLock) {
                try {
                    logWriter.write(
                        "========== Origin Try-Catch Log Ended at " + dateFormat.format(new Date()) + " ==========");
                    logWriter.newLine();
                    logWriter.flush();
                    logWriter.close();
                } catch (IOException e) {
                    System.err.println("[Origin] Failed to close log writer: " + e.getMessage());
                }
            }
        }
    }
    // ========== try-catch 输出模式配置结束 ==========

    // 添加性能监控变量
    private long lastTickTime = 0;
    private int tickCount = 0;
    private long totalProcessingTime = 0;

    public Origin(int aID, String aName, String aNameRegional) {
        super(aID, aName, aNameRegional);
    }

    public Origin(String aName) {
        super(aName);
    }

    // ========== 主机插槽缓存相关全局变量与工具方法 ==========

    /**
     * 缓存的主机插槽物品栈。
     * 用于替代各处频繁调用的 getControllerSlot()，避免在客户端/服务端反复访问主机插槽导致性能问题。
     * 该值由 updateControllerSlotCache() 统一更新，并持久化到 NBT。
     */
    private ItemStack controllerSlot = null;

    /**
     * 缓存的主机物品 meta 值（即 getItemDamage() 的返回值）。
     * 用于替代各处频繁调用的 getControllerSlot().getItemDamage()。
     * 该值由 updateControllerSlotCache() 统一更新，并持久化到 NBT。
     */
    private int MachineID = -1;

    /**
     * 缓存的主机物品显示名称（即 getDisplayName() 的返回值）。
     * 用于替代各处频繁调用的 getControllerSlot().getDisplayName()，并用于 RunningMode 的显示。
     * 该值由 updateControllerSlotCache() 统一更新，并持久化到 NBT。
     */
    private String machineName = null;

    /**
     * 统一更新主机插槽缓存的方法。
     * 该方法从 getControllerSlot() 读取当前主机插槽物品，并同步更新 controllerSlot、MachineID、machineName 三个全局变量。
     * 当检测到主机插槽内容发生变化时，会写入 NBT 以便持久化。
     * 由于该方法在多个位置被调用（不同位置调用频率不同），因此内部做了空值保护与变化检测，保证不会影响机器正常运转。
     */
    private void updateControllerSlotCache() {
        try {
            // 从主机插槽读取当前物品栈
            ItemStack currentSlot = getControllerSlot();

            // 空值保护：如果当前插槽为空，则将缓存值统一清空
            if (currentSlot == null || currentSlot.getItem() == null) {
                // 仅当缓存之前不为空时才进行清空与写 NBT，避免频繁写入
                if (controllerSlot != null || MachineID != -1 || machineName != null) {
                    controllerSlot = null;
                    MachineID = -1;
                    machineName = null;
                    // 将变化写入 NBT 持久化
                    NBTTagCompound aNBT = new NBTTagCompound();
                    saveNBTData(aNBT);
                }
                return;
            }

            // 读取当前物品的 meta 值与显示名称
            int currentMachineID = currentSlot.getItemDamage();
            String currentMachineName = currentSlot.getDisplayName();

            // 判断主机插槽内容是否发生变化（meta 值或显示名称变化都视为变化）
            boolean changed = controllerSlot == null || MachineID != currentMachineID
                || machineName == null
                || !machineName.equals(currentMachineName);

            // 更新缓存值
            controllerSlot = currentSlot;
            MachineID = currentMachineID;
            machineName = currentMachineName;

            // 当发生变化时，写入 NBT 持久化
            if (changed) {
                NBTTagCompound aNBT = new NBTTagCompound();
                saveNBTData(aNBT);
            }
        } catch (Exception e) {
            handleException("Origin", "updateControllerSlotCache", e);
        }
    }

    /**
     * 获取缓存的主机物品 meta 值。
     * 若缓存值无效（-1），会尝试先刷新一次缓存。
     *
     * @return 主机物品的 meta 值，无效时返回 -1
     */
    private int getMachineID() {
        try {
            // 当缓存无效时，尝试刷新缓存
            if (MachineID == -1) {
                updateControllerSlotCache();
            }
            return MachineID;
        } catch (Exception e) {
            handleException("Origin", "getMachineID", e);
            return -1;
        }
    }

    /**
     * 获取缓存的主机物品显示名称。
     * 若缓存值无效（null），会尝试先刷新一次缓存。
     *
     * @return 主机物品的显示名称，无效时返回 null
     */
    private String getMachineName() {
        try {
            // 当缓存无效时，尝试刷新缓存
            if (machineName == null) {
                updateControllerSlotCache();
            }
            return machineName;
        } catch (Exception e) {
            handleException("Origin", "getMachineName", e);
            return null;
        }
    }

    // ========== 主机插槽缓存相关全局变量与工具方法结束 ==========

    // 保存NBT数据
    @Override
    public void saveNBTData(NBTTagCompound aNBT) {
        super.saveNBTData(aNBT);
        aNBT.setBoolean("wireless_mode", wireless_mode);
        // 保存主机插槽缓存物品栈
        if (controllerSlot != null) {
            NBTTagCompound controllerSlotTag = new NBTTagCompound();
            controllerSlot.writeToNBT(controllerSlotTag);
            aNBT.setTag("controllerSlot", controllerSlotTag);
        } else {
            aNBT.removeTag("controllerSlot");
        }
        // 保存主机物品 meta 值
        aNBT.setInteger("MachineID", MachineID);
        // 保存主机物品显示名称
        if (machineName != null) {
            aNBT.setString("machineName", machineName);
        } else {
            aNBT.removeTag("machineName");
        }
    }

    // 加载NBT数据
    @Override
    public void loadNBTData(NBTTagCompound aNBT) {
        super.loadNBTData(aNBT);
        wireless_mode = aNBT.getBoolean("wireless_mode");
        // 加载主机插槽缓存物品栈
        if (aNBT.hasKey("controllerSlot")) {
            controllerSlot = ItemStack.loadItemStackFromNBT(aNBT.getCompoundTag("controllerSlot"));
        } else {
            controllerSlot = null;
        }
        // 加载主机物品 meta 值
        MachineID = aNBT.getInteger("MachineID");
        // 加载主机物品显示名称
        if (aNBT.hasKey("machineName")) {
            machineName = aNBT.getString("machineName");
        } else {
            machineName = null;
        }
    }

    private static final int mcasingIndex = Textures.BlockIcons.getTextureIndex(
        Textures.BlockIcons.getCasingTextureForId(GTUtility.getCasingTextureIndex(GregTechAPI.sBlockCasings4, 1)));

    // 定义机器结构
    private static final String STRUCTURE_PIECE_MAIN = "main";
    private static final IStructureDefinition<Origin> STRUCTURE_DEFINITION = StructureDefinition.<Origin>builder()
        .addShape(
            STRUCTURE_PIECE_MAIN,
            transpose(new String[][] { { "hhh", "hhh", "hhh" }, { "h~h", "h-h", "hhh" }, { "hhh", "hhh", "hhh" } }))
        .addElement(
            'h',
            buildHatchAdder(Origin.class)
                .atLeast(InputBus, OutputBus, InputHatch, OutputHatch, Maintenance, Dynamo.or(TTDynamo))
                .casingIndex(mcasingIndex)
                .hint(1)
                .buildAndChain(onElementPass(Origin::onCasingAdded, ofBlock(GregTechAPI.sBlockCasings4, 1))))
        .build();

    private int mCasingAmount;

    private void onCasingAdded() {
        mCasingAmount++;
    }

    @Override
    public IStructureDefinition<Origin> getStructureDefinition() {
        return STRUCTURE_DEFINITION;
    }

    @Override
    public ITexture[] getTexture(IGregTechTileEntity aBaseMetaTileEntity, ForgeDirection side, ForgeDirection aFacing,
        int colorIndex, boolean aActive, boolean redstoneLevel) {
        if (side == aFacing) {
            if (aActive) {
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
        return new ITexture[] { casingTexturePages[0][mcasingIndex] };
    }

    // 主机ToolTips
    @Override
    protected MultiblockTooltipBuilder createTooltip() {
        final MultiblockTooltipBuilder tt = new MultiblockTooltipBuilder();
        tt.addMachineType("Origin")
            .addInfo("Runs supplied machines as if placed in the world")
            .addInfo("Parallel quantity = 2^x")
            .addInfo("x = Number of machines in the controller")
            .addInfo("----------------------------------------------------------------")
            .addInfo("If x > 8 can use wireless mode with sneak left click controller")
            .addInfo("Energy will consume in wireless network rather than dynamo hatch")
            .addInfo("----------------------------------------------------------------")
            .addInfo("Add By: GT Not Hard")
            .beginStructureBlock(3, 3, 3, true)
            .addController("Front center")
            .addCasingInfoRange("Clean Stainless Steel Machine Casing", 4, 24, false)
            .addDynamoHatch("Any casing", 1)
            .addMaintenanceHatch("Any casing", 1)
            .addInputHatch("Any casing", 1)
            .addInputBus("Any casing", 1)
            .addOutputHatch("Any casing", 1)
            .addOutputBus("Any casing", 1)
            .toolTipFinisher();
        return tt;
    }

    // 创造自动搭建
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

    @Override
    public void checkMachine(IGregTechTileEntity aBaseMetaTileEntity, ItemStack aStack, List<StructureError> errors) {
        if (errors == null) {
            return;
        }
        this.mDynamoHatches.clear();
        this.mTecTechDynamoHatches.clear();
        mCasingAmount = 0;
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        if (endTime - startTime > 100) {
            handleException("Origin", "checkMachine", "checkMachine took " + (endTime - startTime) + " ms", null);
        }
        // 结构检查完成后刷新主机插槽缓存，保证后续运行使用最新主机数据
        updateControllerSlotCache();

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

    // 检查仓室
    private boolean checkHatches() {
        try {
            return mMaintenanceHatches.size() == 1;
        } catch (Exception e) {
            handleException("Origin", "checkHatches", e);
            return false;
        }
    }

    @Override
    public IMetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
        return new Origin(this.mName);
    }

    // 设定机器最大效率
    @Override
    public int getMaxEfficiency(ItemStack aStack) {
        return 0;
    }

    // 获取机器类型
    @Override
    public String getMachineType() {
        return "Origin";
    }

    /**
     * 重写机器模式名称获取方法。
     * 父类默认实现返回 "unknown mode"，导致 GUI 中 RunningMode 显示为 unknown mode。
     * 此处改为返回由 getControllerSlot() 缓存得到的主机名称 machineName，为空时返回 "None"。
     *
     * @return 机器模式显示名称，即主机物品的显示名称
     */
    @Override
    public String getMachineModeName() {
        try {
            // 刷新主机插槽缓存，保证 machineName 为最新值
            updateControllerSlotCache();
            // 如果缓存的主机名称为空，返回 None，避免显示为 unknown mode
            if (machineName == null || machineName.isEmpty()) {
                return "None";
            }
            return machineName;
        } catch (Exception e) {
            handleException("Origin", "getMachineModeName", e);
            return "None";
        }
    }

    // 添加缓存变量，减少重复计算
    private int cachedMaxParallel = -1;
    private long lastParallelCacheTime = 0;
    private static final long PARALLEL_CACHE_DURATION = 20; // 缓存20 ticks

    // 获取最大并行数
    @Override
    public int getMaxParallelRecipes() {
        try {
            // 检查是否是客户端线程，如果是客户端且没有有效的控制器槽位，直接返回缓存值或默认值
            // 这样可以避免客户端频繁访问null导致的性能问题
            if (getBaseMetaTileEntity() != null && getBaseMetaTileEntity().getWorld() != null) {
                if (getBaseMetaTileEntity().getWorld().isRemote) { // 客户端
                    // 如果缓存有效，直接返回缓存值
                    if (cachedMaxParallel != -1 && (System.currentTimeMillis() - lastParallelCacheTime) < 500) {
                        return cachedMaxParallel;
                    }
                }
            }

            // 刷新主机插槽缓存，保证 controllerSlot 为最新值
            updateControllerSlotCache();

            // 服务器端或客户端有有效数据时正常计算
            if (controllerSlot == null) {
                // 只在服务器端输出调试信息，避免客户端刷屏
                if (getBaseMetaTileEntity() != null && !getBaseMetaTileEntity().getWorld().isRemote) {
                    handleException("Origin", "getMaxParallelRecipes", "controllerSlot is null, returning 1", null);
                }
                return 1;
            }

            if (controllerSlot.getItem() == null) {
                if (getBaseMetaTileEntity() != null && !getBaseMetaTileEntity().getWorld().isRemote) {
                    handleException(
                        "Origin",
                        "getMaxParallelRecipes",
                        "controllerSlot item is null, returning 1",
                        null);
                }
                return 1;
            }

            int result;
            if (controllerSlot.stackSize < 31) {
                result = (int) Math.pow(2, controllerSlot.stackSize);
                // 只在服务器端输出调试信息
                if (getBaseMetaTileEntity() != null && !getBaseMetaTileEntity().getWorld().isRemote) {
                    handleException(
                        "Origin",
                        "getMaxParallelRecipes",
                        "stackSize=" + controllerSlot.stackSize + ", parallel=" + result,
                        null);
                }
                // 添加并行数过大的警告
                if (result > 10000) {
                    handleException(
                        "Origin",
                        "getMaxParallelRecipes",
                        "Warning: Very high parallel count: " + result
                            + " (stackSize: "
                            + controllerSlot.stackSize
                            + ")",
                        null);
                }
            } else {
                result = Integer.MAX_VALUE;
                if (getBaseMetaTileEntity() != null && !getBaseMetaTileEntity().getWorld().isRemote) {
                    handleException(
                        "Origin",
                        "getMaxParallelRecipes",
                        "stackSize >= 31, returning Integer.MAX_VALUE",
                        null);
                }
            }

            // 更新缓存
            cachedMaxParallel = result;
            lastParallelCacheTime = System.currentTimeMillis();

            return result;
        } catch (Exception e) {
            handleException("Origin", "getMaxParallelRecipes", e);
            return 1;
        }
    }

    private static final long LV_Tier = 32;
    private static final long MV_Tier = 128;
    private static final long HV_Tier = 512;
    private static final long EV_Tier = 2_048;
    private static final long IV_Tier = 8_192;
    private static final long LuV_Tier = 32_768;
    private static final long ZPM_Tier = 131_072;
    private static final long UV_Tier = 524_288;
    private static final long UHV_Tier = 2_097_152;
    private static final long UEV_Tier = 8_388_608;
    private static final long UIV_Tier = 33_554_432;
    private static final long UMV_Tier = 134_217_728;
    private static final long UXV_Tier = 536_870_912;
    private static final long MAX_Tier = 2_147_483_640;

    // 添加一个重载方法，用于没有 ProcessingLogic 参数的情况
    protected void setEnergyUsage() {
        try {
            // 创建一个临时的 ProcessingLogic 实例来获取计算值
            ProcessingLogic tempLogic = new ProcessingLogic();
            setEnergyUsage(tempLogic);
        } catch (Exception e) {
            handleException("Origin", "setEnergyUsage (no args)", e);
            lEUt = 0;
        }
    }

    // 根据发电机等级设定发电机基础输出
    @Override
    protected void setEnergyUsage(ProcessingLogic processingLogic) {
        try {
            // 只在服务器端输出详细日志
            boolean isServer = getBaseMetaTileEntity() != null && !getBaseMetaTileEntity().getWorld().isRemote;

            if (isServer) {
                handleException("Origin", "setEnergyUsage", "========== setEnergyUsage START ==========", null);
            }

            // 添加 processingLogic 空值检查
            if (processingLogic == null) {
                if (isServer) {
                    handleException(
                        "Origin",
                        "setEnergyUsage",
                        "processingLogic is null, creating temporary instance",
                        null);
                }
                processingLogic = new ProcessingLogic();
            }

            // 刷新主机插槽缓存，保证 controllerSlot 与 MachineID 为最新值
            updateControllerSlotCache();

            if (controllerSlot == null) {
                if (isServer) {
                    handleException("Origin", "setEnergyUsage", "Controller slot is NULL in setEnergyUsage", null);
                }
                lEUt = 0;
                return;
            }
            if (controllerSlot.getItem() == null) {
                if (isServer) {
                    handleException("Origin", "setEnergyUsage", "Controller slot item is NULL in setEnergyUsage", null);
                }
                lEUt = 0;
                return;
            }

            int generatorId = getMachineID();
            int stackSize = controllerSlot.stackSize;
            long calculatedEut = processingLogic.getCalculatedEut();

            if (isServer) {
                handleException("Origin", "setEnergyUsage", "Generator ID: " + generatorId, null);
                handleException("Origin", "setEnergyUsage", "Stack Size: " + stackSize, null);
                handleException("Origin", "setEnergyUsage", "Calculated EUt: " + calculatedEut, null);
            }

            if (controllerSlot.getItem() != null) {
                switch (generatorId) {
                    case 753, 837, 1110, 1115, 1120, 1123, 2733, 12793, 32752 -> {
                        lEUt = -processingLogic.getCalculatedEut() * LV_Tier;
                        if (isServer) {
                            handleException("Origin", "setEnergyUsage", "LV Tier - lEUt set to: " + lEUt, null);
                        }
                    }
                    case 754, 838, 1111, 1116, 1121, 1124, 2734, 12726, 17019, 32753 -> {
                        lEUt = -processingLogic.getCalculatedEut() * MV_Tier;
                        if (isServer) {
                            handleException("Origin", "setEnergyUsage", "MV Tier - lEUt set to: " + lEUt, null);
                        }
                    }
                    case 755, 839, 1112, 1117, 1122, 1125, 2735, 12727, 17020, 32754 -> {
                        lEUt = -processingLogic.getCalculatedEut() * HV_Tier;
                        if (isServer) {
                            handleException("Origin", "setEnergyUsage", "HV Tier - lEUt set to: " + lEUt, null);
                        }
                    }
                    case 793, 993, 1113, 1118, 1127, 1190, 1196, 2736, 12728, 17021, 32755 -> {
                        lEUt = -processingLogic.getCalculatedEut() * EV_Tier;
                        if (isServer) {
                            handleException("Origin", "setEnergyUsage", "EV Tier - lEUt set to: " + lEUt, null);
                        }
                    }
                    case 5, 794, 994, 1114, 1119, 1128, 1131, 1152, 1191, 1197, 2737, 17022, 32016, 32756 -> {
                        lEUt = -processingLogic.getCalculatedEut() * IV_Tier;
                        if (isServer) {
                            handleException("Origin", "setEnergyUsage", "IV Tier - lEUt set to: " + lEUt, null);
                        }
                    }
                    case 795, 1129, 1192, 1198, 2738, 17023, 32757 -> {
                        lEUt = -processingLogic.getCalculatedEut() * LuV_Tier;
                        if (isServer) {
                            handleException("Origin", "setEnergyUsage", "LuV Tier - lEUt set to: " + lEUt, null);
                        }
                    }
                    case 865, 866, 1130, 1171, 1188, 2739, 10752, 13101, 17024, 31026, 31076, 32758 -> {
                        lEUt = -processingLogic.getCalculatedEut() * ZPM_Tier;
                        if (isServer) {
                            handleException("Origin", "setEnergyUsage", "ZPM Tier - lEUt set to: " + lEUt, null);
                        }
                    }
                    case 996, 1189, 2740, 10753, 17025, 32759 -> {
                        lEUt = -processingLogic.getCalculatedEut() * UV_Tier;
                        if (isServer) {
                            handleException("Origin", "setEnergyUsage", "UV Tier - lEUt set to: " + lEUt, null);
                        }
                    }
                    case 13102, 32130 -> {
                        lEUt = -processingLogic.getCalculatedEut() * UHV_Tier;
                        if (isServer) {
                            handleException("Origin", "setEnergyUsage", "UHV Tier - lEUt set to: " + lEUt, null);
                        }
                    }
                    case 1153, 32131 -> {
                        lEUt = -processingLogic.getCalculatedEut() * UEV_Tier;
                        if (isServer) {
                            handleException("Origin", "setEnergyUsage", "UEV Tier - lEUt set to: " + lEUt, null);
                        }
                    }
                    case 1151, 32132 -> {
                        lEUt = -processingLogic.getCalculatedEut() * UIV_Tier;
                        if (isServer) {
                            handleException("Origin", "setEnergyUsage", "UIV Tier - lEUt set to: " + lEUt, null);
                        }
                    }
                    case 31074 -> {
                        lEUt = -processingLogic.getCalculatedEut() * UMV_Tier;
                        if (isServer) {
                            handleException("Origin", "setEnergyUsage", "UMV Tier - lEUt set to: " + lEUt, null);
                        }
                    }
                    case 31073 -> {
                        lEUt = -processingLogic.getCalculatedEut() * UXV_Tier;
                        if (isServer) {
                            handleException("Origin", "setEnergyUsage", "UXV Tier - lEUt set to: " + lEUt, null);
                        }
                    }
                    case 12732, 32001 -> {
                        lEUt = -processingLogic.getCalculatedEut() * MAX_Tier;
                        if (isServer) {
                            handleException("Origin", "setEnergyUsage", "MAX Tier - lEUt set to: " + lEUt, null);
                        }
                    }
                    default -> {
                        lEUt = 0;
                        if (isServer) {
                            handleException(
                                "Origin",
                                "setEnergyUsage",
                                "Unknown Generator ID: " + generatorId + " - lEUt set to 0",
                                null);
                        }
                    }
                }
            }

            if (isServer) {
                handleException("Origin", "setEnergyUsage", "Final lEUt value: " + lEUt, null);
                handleException("Origin", "setEnergyUsage", "========== setEnergyUsage END ==========", null);
            }

        } catch (Exception e) {
            handleException("Origin", "setEnergyUsage", e);
            lEUt = 0;
        }
    }

    private BigInteger powers = BigInteger.ZERO;

    @Override
    public boolean onRunningTick(ItemStack aStack) {
        try {
            long startTime = System.currentTimeMillis();

            if (this.lEUt > 0) {
                // 确保 powers 值已经正确计算
                if (powers.compareTo(BigInteger.ZERO) == 0 && this.mMaxProgresstime > 0) {
                    // 重新计算 powers 值
                    long eutValue = this.lEUt;
                    int recipeDuration = this.mMaxProgresstime;
                    int maxParallel = getMaxParallelRecipes();
                    powers = BigInteger.valueOf(eutValue)
                        .multiply(BigInteger.valueOf(recipeDuration))
                        .multiply(BigInteger.valueOf(maxParallel));
                    handleException("Origin", "onRunningTick", "Recalculated powers: " + powers, null);
                }

                // 判断是否为无线模式
                if (wireless_mode) {
                    // 无线模式：将能量注入无线电网
                    if (powers.compareTo(BigInteger.ZERO) > 0) {
                        // 获取每 tick 的能量输出量
                        long energyPerTick = powers.longValue();

                        // 检查是否成功注入无线电网
                        boolean injected = addEUToGlobalEnergyMap(ownerUUID, BigInteger.valueOf(energyPerTick));

                        if (!injected) {
                            // 如果注入失败，记录警告
                            handleException(
                                "Origin",
                                "onRunningTick",
                                "Failed to inject " + energyPerTick + " EU into wireless network!",
                                null);
                        } else {
                            if (energyPerTick > 1000000000L) {
                                handleException(
                                    "Origin",
                                    "onRunningTick",
                                    "Wireless mode: Injected " + energyPerTick + " EU into wireless network",
                                    null);
                            }
                        }

                        long endTime = System.currentTimeMillis();
                        if (endTime - startTime > 50) {
                            handleException(
                                "Origin",
                                "onRunningTick",
                                "onRunningTick (wireless energy output) took " + (endTime - startTime) + " ms",
                                null);
                        }
                        return injected;
                    }
                } else {
                    // 非无线模式：向动力仓输出能量
                    boolean result = addEnergyOutputMultipleDynamos(powers, true, 0);
                    long endTime = System.currentTimeMillis();
                    if (endTime - startTime > 50) {
                        handleException(
                            "Origin",
                            "onRunningTick",
                            "onRunningTick (energy output) took " + (endTime - startTime) + " ms",
                            null);
                    }
                    return result;
                }
            }

            if (this.lEUt < 0) {
                if (!drainEnergyInput(getActualEnergyUsage())) {
                    stopMachine(ShutDownReasonRegistry.POWER_LOSS);
                    return false;
                }
            }

            long endTime = System.currentTimeMillis();
            if (endTime - startTime > 50) {
                handleException("Origin", "onRunningTick", "onRunningTick took " + (endTime - startTime) + " ms", null);
            }
            return true;
        } catch (Exception e) {
            handleException("Origin", "onRunningTick", e);
            return false;
        }
    }

    // 动力仓能量判断
    public boolean addEnergyOutputMultipleDynamos(BigInteger aEU, boolean aAllowMixedVoltageDynamos, int i) {
        try {
            if (aEU.compareTo(BigInteger.ZERO) <= 0) {
                return false; // 没有能量需要输出
            }

            long totalInjected = 0;
            BigInteger remaining = aEU;

            // 添加调试信息，记录能量输出大小
            if (aEU.compareTo(BigInteger.valueOf(1000000000L)) > 0) {
                handleException(
                    "Origin",
                    "addEnergyOutputMultipleDynamos",
                    "Large energy output: " + aEU + " EU",
                    null);
            }

            for (MTEHatch aDynamo : validMTEList(mAllDynamoHatches)) {
                if (remaining.compareTo(BigInteger.ZERO) <= 0) {
                    break; // 已经输出所有能量
                }

                long voltage = aDynamo.maxEUOutput();
                long maxAmps = aDynamo.maxAmperesOut();

                // 计算该动力仓可以接收的最大能量（基于输出能力）
                long maxEnergyPerTick = voltage * maxAmps;

                // 计算这次tick可以注入多少能量
                BigInteger maxInject = BigInteger.valueOf(maxEnergyPerTick);
                if (remaining.compareTo(maxInject) < 0) {
                    maxInject = remaining;
                }

                // 转换为安培和余数
                long amps = maxInject.divide(BigInteger.valueOf(voltage))
                    .longValue();
                long remainder = maxInject.mod(BigInteger.valueOf(voltage))
                    .longValue();

                // 限制不超过最大安培
                amps = Math.min(amps, maxAmps);

                // 向动力仓注入能量
                long injected = 0;
                if (amps > 0) {
                    injected += amps * voltage;
                    // 这里需要调用实际的能量注入方法
                    if (aDynamo.getBaseMetaTileEntity() != null) {
                        aDynamo.getBaseMetaTileEntity()
                            .increaseStoredEnergyUnits(amps * voltage, false);
                    }
                }

                if (remainder > 0 && amps < maxAmps) {
                    injected += remainder;
                    if (aDynamo.getBaseMetaTileEntity() != null) {
                        aDynamo.getBaseMetaTileEntity()
                            .increaseStoredEnergyUnits(remainder, false);
                    }
                }

                totalInjected += injected;
                remaining = remaining.subtract(BigInteger.valueOf(injected));
            }

            if (totalInjected > 0 && totalInjected < aEU.longValue()) {
                handleException(
                    "Origin",
                    "addEnergyOutputMultipleDynamos",
                    "Injected " + totalInjected + " EU into dynamos out of " + aEU + " EU",
                    null);
            }
            return totalInjected > 0;
        } catch (Exception e) {
            handleException("Origin", "addEnergyOutputMultipleDynamos", e);
            return false;
        }
    }

    @Override
    protected ProcessingLogic createProcessingLogic() {
        try {
            // 保留本控制器全部自定义验证/超频，仅扩展压缩 long 输入的匹配和扣料。
            return new SuperInputProcessingLogic() {

                // 添加一个标志位，用于跟踪是否已经计算过能量
                private boolean energyCalculated = false;

                @Nonnull
                @Override
                protected CheckRecipeResult validateRecipe(@Nonnull GTRecipe recipe) {
                    long startTime = System.currentTimeMillis();

                    try {
                        handleException("Origin", "validateRecipe", "========== validateRecipe START ==========", null);
                        handleException(
                            "Origin",
                            "validateRecipe",
                            "Recipe: mEUt=" + recipe.mEUt + ", mDuration=" + recipe.mDuration,
                            null);

                        int power = -recipe.mEUt;
                        if (power < 0) {
                            handleException("Origin", "validateRecipe", "Recipe power < 0, returning NO_RECIPE", null);
                            return CheckRecipeResultRegistry.NO_RECIPE;
                        }

                        // 获取最大并行数
                        int maxParallel = getMaxParallelRecipes();
                        int recipeDuration = recipe.mDuration;

                        handleException(
                            "Origin",
                            "validateRecipe",
                            "Recipe duration: " + recipeDuration + ", maxParallel: " + maxParallel,
                            null);

                        // 临时设置进度时间
                        mMaxProgresstime = recipeDuration;

                        // 关键修复：通过调用父类的 setEnergyUsage 来确保能量被正确计算
                        // 但需要先临时设置一个 ProcessingLogic 实例
                        setEnergyUsage(this);

                        // 获取计算后的 lEUt 值
                        long eutValue = lEUt;

                        handleException("Origin", "validateRecipe", "After setEnergyUsage - lEUt: " + eutValue, null);

                        // 计算 powers
                        if (eutValue != 0) {
                            powers = BigInteger.valueOf(eutValue)
                                .multiply(BigInteger.valueOf(recipeDuration))
                                .multiply(BigInteger.valueOf(maxParallel));
                            handleException("Origin", "validateRecipe", "Calculated powers: " + powers, null);
                        } else {
                            handleException(
                                "Origin",
                                "validateRecipe",
                                "WARNING: lEUt is still 0, powers will be 0",
                                null);
                            powers = BigInteger.ZERO;
                        }

                        // 处理无线模式
                        if (wireless_mode && powers.compareTo(BigInteger.ZERO) > 0) {
                            handleException(
                                "Origin",
                                "validateRecipe",
                                "Wireless mode enabled, checking energy network",
                                null);
                            BigInteger requiredEnergy = powers.multiply(BigInteger.valueOf(20));
                            handleException(
                                "Origin",
                                "validateRecipe",
                                "Required energy for 20 ticks: " + requiredEnergy,
                                null);
                            if (!addEUToGlobalEnergyMap(ownerUUID, requiredEnergy)) {
                                handleException(
                                    "Origin",
                                    "validateRecipe",
                                    "Insufficient energy in wireless network!",
                                    null);
                                return CheckRecipeResultRegistry.insufficientStartupPower(requiredEnergy);
                            }
                            handleException("Origin", "validateRecipe", "Energy check passed", null);
                        }

                        long endTime = System.currentTimeMillis();
                        if (endTime - startTime > 100) {
                            handleException(
                                "Origin",
                                "validateRecipe",
                                "validateRecipe took " + (endTime - startTime) + " ms",
                                null);
                        }

                        handleException(
                            "Origin",
                            "validateRecipe",
                            "========== validateRecipe END (SUCCESS) ==========",
                            null);
                        return CheckRecipeResultRegistry.GENERATING;

                    } catch (Exception e) {
                        handleException(
                            "Origin",
                            "validateRecipe",
                            "========== validateRecipe EXCEPTION ==========",
                            null);
                        handleException(
                            "Origin",
                            "validateRecipe",
                            "Exception in validateRecipe: " + e.getMessage(),
                            null);
                        e.printStackTrace();
                        handleException("Origin", "validateRecipe", "Recipe info at time of exception:", null);
                        try {
                            handleException("Origin", "validateRecipe", "- recipe.mEUt: " + recipe.mEUt, null);
                            handleException(
                                "Origin",
                                "validateRecipe",
                                "- recipe.mDuration: " + recipe.mDuration,
                                null);
                            handleException("Origin", "validateRecipe", "- lEUt: " + lEUt, null);
                            handleException("Origin", "validateRecipe", "- wireless_mode: " + wireless_mode, null);
                            handleException("Origin", "validateRecipe", "- ownerUUID: " + ownerUUID, null);
                            handleException(
                                "Origin",
                                "validateRecipe",
                                "- getMaxParallelRecipes(): " + getMaxParallelRecipes(),
                                null);
                        } catch (Exception ex) {
                            handleException(
                                "Origin",
                                "validateRecipe",
                                "Failed to get debug info: " + ex.getMessage(),
                                null);
                        }
                        handleException(
                            "Origin",
                            "validateRecipe",
                            "================================================",
                            null);
                        return CheckRecipeResultRegistry.NO_RECIPE;
                    }
                }
            };
        } catch (Exception e) {
            handleException("Origin", "createProcessingLogic", e);
            // 异常回退也必须保留 long 库存安全校验，不能退回 int 成本缓存。
            return new SuperInputProcessingLogic().setMaxParallelSupplier(this::getMaxParallelRecipes);
        }
    }

    @Override
    public RecipeMap<?> getRecipeMap() {
        try {
            // 刷新主机插槽缓存，保证 MachineID 为最新值
            updateControllerSlotCache();

            if (controllerSlot == null || controllerSlot.getItem() == null) {
                return null;
            }

            int GeneratorID = getMachineID();
            switch (GeneratorID) {
                // Steam Small Generator
                // "Advanced Boiler [LV]" - 753
                // "Advanced Boiler [MV]" - 754
                // "Advanced Boiler [HV]" - 755
                // "Basic Steam Turbine" - 1120
                // "Advanced Steam Turbine" - 1121
                // "Turbo Steam Turbine" - 1122
                case 753, 754, 755, 1120, 1121, 1122 -> {
                    return OriginGeneratorRecipes_Steam.GeneratorRecipes_Steam;
                }

                // Steam Large Turbine
                // "Large Steam Turbine" - 1131
                // "Large HP Steam Turbine" - 1152
                // "Large Supercritical Steam Turbine" - 32016
                case 1131, 1152, 32016 -> {
                    return OriginGeneratorRecipes_Steam.GeneratorRecipes_Steam;
                }

                // Steam XL Turbine
                // "XL Turbo Steam Turbine" - 865
                // "XL Turbo HP Steam Turbine" - 866
                // "XL Turbo SC Steam Turbine" - 31076
                case 865, 866, 31076 -> {
                    return OriginGeneratorRecipes_Steam.GeneratorRecipes_Steam;
                }

                // Semifluid Generator
                // "Basic Semifluid Generator" - 837
                // "Advanced Semifluid Generator" - 838
                // "Turbo Semifluid Generator" - 839
                // "Turbo Semifluid Generator II" - 993
                // "Turbo Semifluid Generator III" - 994
                // "Large Semifluid Burner" - 31026
                case 837, 838, 839, 993, 994, 31026 -> {
                    return OriginGeneratorRecipes_Semifluid.GeneratorRecipes_Semifluid;
                }

                // Combustion Generator
                // "Basic Combustion Generator" - 1110
                // "Advanced Combustion Generator" - 1111
                // "Turbo Combustion Generator" - 1112
                // "Turbo Supercharging Combustion Generator" - 1113
                // "Ultimate Chemical Energy Releaser" - 1114
                // "Large Combustion Engine" - 1171
                case 1110, 1111, 1112, 1113, 1114, 1171 -> {
                    return OriginGeneratorRecipes_Combustion.GeneratorRecipes_Combustion;
                }

                // Plasma Generator
                // "Plasma Generator Mark I" - 1196
                // "Plasma Generator Mark II" - 1197
                // "Plasma Generator Mark III" - 1198
                // "Plasma Generator Mark IV" - 10752
                // "Ultimate Pocket Sun" - 10753
                // "Large Plasma Turbine" - 1153
                // "XL Turbo Plasma Turbine" - 31074
                case 1196, 1197, 1198, 10752, 10753, 1153, 31074 -> {
                    return OriginGeneratorRecipes_Plasma.GeneratorRecipes_Plasma;
                }

                // "Basic Rocket Engine" - 793
                // "Advanced Rocket Engine" - 794
                // "Turbo Rocket Engine" - 795
                // "Rocketdyne F-1A Engine" - 996
                case 793, 794, 795, 996 -> {
                    return OriginGeneratorRecipes_Rocket.GeneratorRecipes_Rocket;
                }

                // "Basic Gas Turbine" - 1115
                // "Advanced Gas Turbine" - 1116
                // "Turbo Gas Turbine" - 1117
                // "Turbo Gas Turbine II" - 1118
                // "Turbo Gas Turbine III" - 1119
                // "Solid-Oxide Fuel Cell Mk I" - 13101
                // "Solid-Oxide Fuel Cell Mk II" - 13102
                // "Large Gas Turbine" - 1151
                // "XL Turbo Gas Turbine" - 31073
                case 1115, 1116, 1117, 1118, 1119, 13101, 13102, 1151, 31073 -> {
                    return OriginGeneratorRecipes_Gas.GeneratorRecipes_Gas;
                }

                // "Novice Magic Energy Converter" - 1123
                // "Adept Magic Energy Converter" - 1124
                // "Master Magic Energy Converter" - 1125
                // "Novice Magic Energy Absorber" - 1127
                // "Adept Magic Energy Absorber" - 1128
                // "Master Magic Energy Absorber" - 1129
                // "Grandmaster Magic Energy Absorber" - 1130
                case 1123, 1124, 1125, 1127, 1128, 1129, 1130 -> {
                    return OriginGeneratorRecipes_Magic.GeneratorRecipes_Magic;
                }

                // "Naquadah Reactor Mark I" - 1190
                // "Naquadah Reactor Mark II" - 1191
                // "Naquadah Reactor Mark III" - 1192
                // "Naquadah Reactor Mark IV" - 1188
                // "Naquadah Reactor Mark V" - 1189
                // "Large Naquadah Reactor" - 12732
                case 1190, 1191, 1192, 1188, 1189, 12732 -> {
                    return OriginGeneratorRecipes_Naquadah.GeneratorRecipes_Naquadah;
                }

                // "Acid Generator LV" - 12793
                // "Acid Generator MV" - 12726
                // "Acid Generator HV" - 12727
                // "Acid Generator EV" - 12728
                case 12793, 12726, 12727, 12728 -> {
                    return OriginGeneratorRecipes_Acid.GeneratorRecipes_Acid;
                }

                // "Hydro Turbine (MV)" - 17019
                // "Hydro Turbine (HV)" - 17020
                // "Hydro Turbine (EV)" - 17021
                // "Hydro Turbine (IV)" - 17022
                // "Hydro Turbine (LuV)" - 17023
                // "Hydro Turbine (ZPM)" - 17024
                // "Hydro Turbine (UV)" - 17025
                case 17019, 17020, 17021, 17022, 17023, 17024, 17025 -> {
                    return OriginGeneratorRecipes_Water.GeneratorRecipes_Water;
                }

                // "Solar Panel (LV)" - 32752
                // "Solar Panel (MV)" - 32753
                // "Solar Panel (HV)" - 32754
                // "Solar Panel (EV)" - 32755
                // "Solar Panel (IV)" - 32756
                // "Solar Panel (LuV)" - 32757
                // "Solar Panel (ZPM)" - 32758
                // "Solar Panel (UV)" - 32759
                // "Solar Panel (UHV)" - 32130
                // "Solar Panel (UEV)" - 32131
                // "Solar Panel (UIV)" - 32132
                case 32752, 32753, 32754, 32755, 32756, 32757, 32758, 32759, 32130, 32131, 32132 -> {
                    return OriginGeneratorRecipes_Solar.GeneratorRecipes_Solar;
                }

                // "Basic Solar Panel" - 2733
                // "Advanced Solar Panel" - 2734
                // "Advanced Solar Panel II" - 2735
                // "Advanced Solar Panel III" - 2736
                // "Advanced Solar Panel IV" - 2737
                // "Elite Solar Panel" - 2738
                // "Elite Solar Panel II" - 2739
                // "Ultimate Solar Panel" - 2740
                case 2733, 2734, 2735, 2736, 2737, 2738, 2739, 2740 -> {
                    return OriginGeneratorRecipes_Solar.GeneratorRecipes_Solar;
                }

                // "Universal Chemical Fuel Engine" - 32001
                case 32001 -> {
                    return OriginGeneratorRecipes_UCFE.GeneratorRecipes_UCFE;
                }

                // "Nuclear Reactor" - 5
                case 5 -> {
                    return OriginGeneratorRecipes_Nuclear.GeneratorRecipes_Nuclear;
                }

                default -> {
                    return null;
                }
            }
        } catch (Exception e) {
            handleException("Origin", "getRecipeMap", e);
            return null;
        }
    }

    @Override
    public @NotNull Collection<RecipeMap<?>> getAvailableRecipeMaps() {
        try {
            ArrayList<RecipeMap<?>> recipeMaps = new ArrayList<>();
            recipeMaps.add(OriginGeneratorRecipes_Steam.GeneratorRecipes_Steam);
            recipeMaps.add(OriginGeneratorRecipes_Semifluid.GeneratorRecipes_Semifluid);
            recipeMaps.add(OriginGeneratorRecipes_Combustion.GeneratorRecipes_Combustion);
            recipeMaps.add(OriginGeneratorRecipes_Plasma.GeneratorRecipes_Plasma);
            recipeMaps.add(OriginGeneratorRecipes_Rocket.GeneratorRecipes_Rocket);
            recipeMaps.add(OriginGeneratorRecipes_Gas.GeneratorRecipes_Gas);
            recipeMaps.add(OriginGeneratorRecipes_UCFE.GeneratorRecipes_UCFE);
            recipeMaps.add(OriginGeneratorRecipes_Magic.GeneratorRecipes_Magic);
            recipeMaps.add(OriginGeneratorRecipes_Naquadah.GeneratorRecipes_Naquadah);
            recipeMaps.add(OriginGeneratorRecipes_Nuclear.GeneratorRecipes_Nuclear);
            recipeMaps.add(OriginGeneratorRecipes_Acid.GeneratorRecipes_Acid);
            recipeMaps.add(OriginGeneratorRecipes_Water.GeneratorRecipes_Water);
            recipeMaps.add(OriginGeneratorRecipes_Solar.GeneratorRecipes_Solar);
            return recipeMaps;
        } catch (Exception e) {
            handleException("Origin", "getAvailableRecipeMaps", e);
            return new ArrayList<>();
        }
    }

    private UUID ownerUUID;

    @Override
    public void onFirstTick(IGregTechTileEntity aBaseMetaTileEntity) {
        try {
            super.onFirstTick(aBaseMetaTileEntity);
            this.ownerUUID = aBaseMetaTileEntity.getOwnerUuid();
            // 首次 tick 时刷新主机插槽缓存，保证初始状态正确
            updateControllerSlotCache();
        } catch (Exception e) {
            handleException("Origin", "onFirstTick", e);
        }
    }

    private boolean wireless_mode = false;

    @Override
    public boolean supportsMachineModeSwitch() {
        return true;
    }

    @Override
    public void setMachineMode(int mode) {
        super.setMachineMode(mode);
        wireless_mode = mode == 1;
    }

    @Override
    protected @NotNull MTEMultiBlockBaseGui<?> getGui() {
        // 本 Mod 的 Origin 同样可能产生大量副产物，只为它接入安全摘要 GUI。
        return new SuperInputMachineGui<>(this) {

            @Override
            protected void registerSyncValues(PanelSyncManager syncManager) {
                super.registerSyncValues(syncManager);

                syncManager.syncValue(
                    "wirelessModeToggle",
                    new BooleanSyncValue(() -> wireless_mode, enabled -> wireless_mode = enabled).allowC2S());
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
        };
    }

    @Override
    public void getWailaNBTData(EntityPlayerMP player, TileEntity tile, NBTTagCompound tag, World world, int x, int y,
        int z) {
        try {
            super.getWailaNBTData(player, tile, tag, world, x, y, z);
            // 响应中保留机器状态，但产物改为有字节上限的 long 数量摘要。
            outputSummary.writeWailaSummary(tag, mOutputItems, mOutputFluids);
            // 只在服务器端添加NBT数据，客户端从NBT读取
            if (!world.isRemote) {
                // 刷新主机插槽缓存，保证 machineName 为最新值
                updateControllerSlotCache();
                // 始终写入 Machine 键，为空时写入 None，避免客户端因缺失键而误判
                if (machineName != null && !machineName.isEmpty()) {
                    tag.setString("Machine", machineName);
                } else {
                    tag.setString("Machine", "None");
                }
                // 无线模式下额外写入能量输出信息
                if (wireless_mode) {
                    DecimalFormat process = new DecimalFormat("#,###");
                    tag.setString("EnergyGenerate", process.format(powers));
                }
            }
        } catch (Exception e) {
            handleException("Origin", "getWailaNBTData", e);
        }
    }

    @Override
    public void getWailaBody(ItemStack itemStack, List<String> currentTip, IWailaDataAccessor accessor,
        IWailaConfigHandler config) {
        try {
            super.getWailaBody(itemStack, currentTip, accessor, config);
            // 客户端仅显示摘要，不把输出列表或 NBT 回传给服务器。
            SuperInputOutputSummary.appendWailaSummary(currentTip, accessor.getNBTData());
            final NBTTagCompound tag = accessor.getNBTData();
            // RunningMode 显示名称改为读取缓存的 machineName（由主机物品 getDisplayName() 得到）
            if (tag.hasKey("Machine")) {
                currentTip.add("Machine: " + EnumChatFormatting.YELLOW + tag.getString("Machine"));
                if (tag.hasKey("EnergyGenerate")) {
                    currentTip.add("WirelessMode: " + EnumChatFormatting.GREEN + "True");
                    currentTip.add("Energy Generate: " + EnumChatFormatting.YELLOW + tag.getString("EnergyGenerate"));
                } else {
                    currentTip.add("WirelessMode: " + EnumChatFormatting.RED + "False");
                }
            } else {
                currentTip.add("Machine: " + EnumChatFormatting.YELLOW + "None");
            }
        } catch (Exception e) {
            handleException("Origin", "getWailaBody", e);
        }
    }

    /**
     * 收集同一颜色组的压缩物品账本，避免原版 ME 去重只保留一个 int 数量。
     * 
     * @param color 当前颜色组，empty 表示全部颜色
     * @return 普通库存与每种 ME 资源的可扣料原始视图
     */
    @Override
    public ArrayList<ItemStack> getStoredInputsForColor(Optional<Byte> color) {
        // 普通输入保持原行为；SuperInput 输入改用完整资源组来源选择。
        return SuperInputProcessing.collectItemInputs(this, color, super.getStoredInputsForColor(color));
    }

    /**
     * 收集同一颜色组的压缩流体账本，真实数量由 SuperInputProcessingLogic 处理。
     * 
     * @param color 当前颜色组
     * @return 普通储罐与 ME 流体视图的原引用
     */
    @Override
    public ArrayList<FluidStack> getStoredFluidsForColor(Optional<Byte> color) {
        // 不复制堆栈，以便配方消耗回写到待结算快照。
        return SuperInputProcessing.collectFluidInputs(this, color, super.getStoredFluidsForColor(color));
    }
}
