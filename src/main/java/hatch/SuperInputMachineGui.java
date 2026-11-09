package hatch;

import net.minecraft.util.StatCollector;

import com.cleanroommc.modularui.api.drawable.IKey;
import com.cleanroommc.modularui.api.widget.IWidget;
import com.cleanroommc.modularui.screen.ModularPanel;
import com.cleanroommc.modularui.utils.Alignment;
import com.cleanroommc.modularui.utils.Color;
import com.cleanroommc.modularui.value.sync.BooleanSyncValue;
import com.cleanroommc.modularui.value.sync.EnumSyncValue;
import com.cleanroommc.modularui.value.sync.GenericSyncValue;
import com.cleanroommc.modularui.value.sync.IntSyncValue;
import com.cleanroommc.modularui.value.sync.LongSyncValue;
import com.cleanroommc.modularui.value.sync.PanelSyncManager;
import com.cleanroommc.modularui.value.sync.StringSyncValue;
import com.cleanroommc.modularui.widgets.ListWidget;
import com.cleanroommc.modularui.widgets.TextWidget;

import gregtech.api.enums.VoidingMode;
import gregtech.api.metatileentity.implementations.MTEMultiBlockBase;
import gregtech.api.recipe.check.CheckRecipeResult;
import gregtech.api.util.shutdown.ShutDownReason;
import gregtech.api.util.shutdown.ShutDownReasonRegistry;
import gregtech.common.gui.modularui.adapter.CheckRecipeResultAdapter;
import gregtech.common.gui.modularui.adapter.ShutdownReasonAdapter;
import gregtech.common.gui.modularui.multiblock.base.MTEMultiBlockBaseGui;

/**
 * 本 Mod 专用多方块 GUI，保持 GT5U 5.09.54.133 的按钮、状态和维护同步，
 * 产物部分仅使用服务器到客户端的有界摘要。原版 GT 机器继续使用原 GUI。
 * 因父类输出显示工厂为 private，这里通过受支持的 protected 接口覆盖注册与终端构建，
 * 不修改依赖、不反射其私有字段，也不临时清空服务器的真实产物。
 *
 * @param <T> 使用本界面的 GT-Not-Hard 控制器类型
 */
public class SuperInputMachineGui<T extends MTEMultiBlockBase> extends MTEMultiBlockBaseGui<T> {

    /** 每个打开的界面独立缓存摘要，不干扰其他玩家或服务器的真实输出数组。 */
    private final SuperInputOutputSummary outputSummary = new SuperInputOutputSummary();

    /** 初始化原版 GUI 的外壳、按钮图标和关机原因映射。 */
    public SuperInputMachineGui(T multiblock) {
        // 机器实例仍由原版 GUI 管理，不修改其世界和 TileEntity 状态。
        super(multiblock);
    }

    /** 控制器可提供自己的有界产物摘要，普通调用方仍使用原有数组摘要。 */
    protected String getOutputSummaryText() {
        return outputSummary.getText(multiblock.mOutputItems, multiblock.mOutputFluids);
    }

    /**
     * 固定依赖版本的状态注册在此完整保留，仅取消 itemOutput / fluidOutput 两个原始列表。
     * 不调用父实现，否则其列表构造器会在打开旧版大输出存档时先完整复制和编解码全部 NBT。
     * 保留下来的变量、键名、按钮回调及原有 Widget Specific 注释不作重命名。
     */
    @Override
    protected void registerSyncValues(PanelSyncManager syncManager) {
        // 结构错误使用原版列表，产物列表不在其中。
        syncManager.syncValue("structureErrors", multiblock.getStructureErrorsSyncer());
        // 保留结构/维护错误位。
        syncManager
            .syncValue("errorID", new IntSyncValue(multiblock::getErrorDisplayID, multiblock::setErrorDisplayID));
        // 保留原版活动状态同步。
        syncManager.syncValue(
            "machineActive",
            new BooleanSyncValue(baseMetaTileEntity::isActive, baseMetaTileEntity::setActive));

        // 同步扳手维护状态。
        syncManager
            .syncValue("wrench", new BooleanSyncValue(() -> multiblock.mWrench, val -> multiblock.mWrench = val));
        // 同步螺丝刀维护状态。
        syncManager.syncValue(
            "screwdriver",
            new BooleanSyncValue(() -> multiblock.mScrewdriver, val -> multiblock.mScrewdriver = val));
        // 同步软锤维护状态。
        syncManager.syncValue(
            "softMallet",
            new BooleanSyncValue(() -> multiblock.mSoftMallet, val -> multiblock.mSoftMallet = val));
        // 同步硬锤维护状态。
        syncManager.syncValue(
            "hardHammer",
            new BooleanSyncValue(() -> multiblock.mHardHammer, val -> multiblock.mHardHammer = val));
        // 同步电烙铁维护状态。
        syncManager.syncValue(
            "solderingTool",
            new BooleanSyncValue(() -> multiblock.mSolderingTool, val -> multiblock.mSolderingTool = val));
        // 同步撬棍维护状态。
        syncManager
            .syncValue("crowbar", new BooleanSyncValue(() -> multiblock.mCrowbar, val -> multiblock.mCrowbar = val));
        // 同步结构完整状态。
        syncManager
            .syncValue("machine", new BooleanSyncValue(() -> multiblock.mMachine, val -> multiblock.mMachine = val));

        // 保留累计运行时间。
        syncManager
            .syncValue("totalRunTime", new LongSyncValue(multiblock::getTotalRunTime, multiblock::setTotalRunTime));
        // 保留最后运行时刻。
        syncManager.syncValue(
            "lastWorkingTick",
            new LongSyncValue(multiblock::getLastWorkingTick, multiblock::setLastWorkingTick));
        // 关机标志同时由电源按钮读取；保留原版允许客户端请求更新的权限。
        BooleanSyncValue wasShutDown = new BooleanSyncValue(
            baseMetaTileEntity::wasShutdown,
            baseMetaTileEntity::setShutdownStatus).allowC2S();
        // 关机状态仍允许原版电源按钮更改。
        syncManager.syncValue("wasShutdown", wasShutDown);

        // 从累计运行 tick 差计算秒数；没有 setter，显示不能改写机器时钟。
        LongSyncValue shutdownDurationSyncer = new LongSyncValue(
            () -> (multiblock.getTotalRunTime() - multiblock.getLastWorkingTick()) / 20);
        // 保留关机持续时间。
        syncManager.syncValue("shutdownDuration", shutdownDurationSyncer);

        // 原版关机原因适配器只传输原因数据，电源回调仍可清除最后一次原因。
        GenericSyncValue<ShutDownReason, ?> shutdownReasonSyncer = GenericSyncValue.builder(ShutDownReason.class)
            .getter(baseMetaTileEntity::getLastShutDownReason)
            .setter(baseMetaTileEntity::setShutDownReason)
            .adapter(new ShutdownReasonAdapter())
            .build()
            .allowC2S();
        // 注册保留下来的关机原因，不与下方只读产物摘要共用同步值。
        syncManager.syncValue("shutdownReason", shutdownReasonSyncer);

        // 保留本地化关机文字。
        syncManager.syncValue(
            "shutdownDisplayString",
            new StringSyncValue(
                () -> baseMetaTileEntity.getLastShutDownReason()
                    .getDisplayString()));
        // 保留关机图标所需键。
        syncManager.syncValue(
            "shutdownReasonKey",
            new StringSyncValue(
                () -> baseMetaTileEntity.getLastShutDownReason()
                    .getKey()));
        // 配方成功/失败结果仍由原版适配器同步。
        syncManager.syncValue(
            "checkRecipeResult",
            GenericSyncValue.builder(CheckRecipeResult.class)
                .getter(multiblock::getCheckRecipeResult)
                .setter(multiblock::setCheckRecipeResult)
                .adapter(new CheckRecipeResultAdapter())
                .build());
        // 不注册逐片流体列表，摘要不包含流体 NBT，也没有客户端回发。
        // 进度只同步整数，不触发产物重建。
        syncManager.syncValue(
            "progressTime",
            new IntSyncValue(() -> multiblock.mProgresstime, val -> multiblock.mProgresstime = val));

        // 保存本次配方总 tick 数；终端仅在绘制文字时读取它。
        IntSyncValue maxProgressTimeSyncer = new IntSyncValue(
            () -> multiblock.mMaxProgresstime,
            val -> multiblock.mMaxProgresstime = val);
        // 保留原版时长值；没有输出 DynamicSyncHandler 监听它。
        syncManager.syncValue("maxProgressTime", maxProgressTimeSyncer);

        // 唯一产物同步是有界只读文本，原版机器的 GUI 注册不受影响。
        // 注册本界面的只读产物摘要。
        syncManager.syncValue("superInputOutputSummary", new StringSyncValue(this::getOutputSummaryText));

        // Widget Specific
        // 原电源开关回调保持不变，bool 是玩家请求的工作状态。
        BooleanSyncValue powerSwitchSyncer = new BooleanSyncValue(multiblock::isAllowedToWork, bool -> {
            // 控制器暂时禁止操作电源时，不执行状态变更。
            if (isPowerSwitchDisabled()) return;
            // 开启请求委托机器原生逻辑。
            if (bool) multiblock.enableWorking();
            else {
                // 运行中只禁用后续工作，当前配方的产物继续保留。
                if (multiblock.maxProgresstime() > 0) {
                    // 更新工作许可，不操作任何输入或输出数组。
                    multiblock.disableWorking();
                    // 按原版规则记录手动关机。
                    wasShutDown.setValue(true);
                    // 手动关机不展示额外故障原因。
                    shutdownReasonSyncer.setValue(ShutDownReasonRegistry.NONE);
                    // 空闲时委托原版停止方法收尾。
                } else multiblock.stopMachine(ShutDownReasonRegistry.NONE);
            }
        }).allowC2S();
        // 电源按钮保持原生启停语义。
        syncManager.syncValue("powerSwitch", powerSwitchSyncer);

        // 结构刷新倒计时与按钮保持两个原始同步键。
        IntSyncValue structureUpdateSyncer = new IntSyncValue(
            multiblock::getStructureUpdateTime,
            multiblock::setStructureUpdateTime).allowC2S();
        // val 为刷新请求，只在 true 时把倒计时设为原版的一个 tick。
        BooleanSyncValue structureUpdateButtonSyncer = new BooleanSyncValue(
            () -> structureUpdateSyncer.getValue() > -20,
            val -> { if (val) structureUpdateSyncer.setValue(1); }).allowC2S();
        // 保留结构刷新倒计时。
        syncManager.syncValue("structureUpdate", structureUpdateSyncer);
        // 保留结构刷新按钮。
        syncManager.syncValue("structureUpdateButton", structureUpdateButtonSyncer);

        // 配方锁依旧调用控制器 setter，压缩输入的消费由处理逻辑负责。
        BooleanSyncValue recipeLockSyncer = new BooleanSyncValue(
            multiblock::isRecipeLockingEnabled,
            multiblock::setRecipeLocking).allowC2S();
        // 保留配方锁交互。
        syncManager.syncValue("recipeLock", recipeLockSyncer);

        // 批处理请求沿用机器原生状态，输出预算独立于此按钮。
        BooleanSyncValue batchModeSyncer = new BooleanSyncValue(
            multiblock::isBatchModeEnabled,
            multiblock::setBatchMode).allowC2S();
        // 保留批处理开关。
        syncManager.syncValue("batchMode", batchModeSyncer);

        // 模式索引继续由控制器校验，不由摘要解释。
        IntSyncValue machineModeSyncer = new IntSyncValue(multiblock::getMachineMode, multiblock::setMachineMode)
            .allowC2S();
        // 保留机器模式切换。
        syncManager.syncValue("machineMode", machineModeSyncer);

        // 输入分离设置仍通过原来的 getter/setter 同步。
        BooleanSyncValue inputSeparationSyncer = new BooleanSyncValue(
            multiblock::isInputSeparationEnabled,
            multiblock::setInputSeparation).allowC2S();
        // 保留输入分离开关。
        syncManager.syncValue("inputSeparation", inputSeparationSyncer);

        // 保留枚举式输出保护设置，摘要省略条目不会触发销毁模式。
        EnumSyncValue<VoidingMode, ?> voidExcessSyncer = new EnumSyncValue<>(
            VoidingMode.class,
            multiblock::getVoidingMode,
            multiblock::setVoidingMode).allowC2S();
        // 保留输出保护/销毁模式。
        syncManager.syncValue("voidExcess", voidExcessSyncer);

        // 维护按钮只需要问题总数，不需要为维护文本增加动态同步列表。
        IntSyncValue maintSyncer = new IntSyncValue(() -> {
            // 沿用原版局部变量名；缺少一种维护工具对应一个问题。
            int maintIsuses = 0;
            // 检查撬棍维护是否完成。
            maintIsuses += multiblock.mCrowbar ? 0 : 1;
            // 检查硬锤维护是否完成。
            maintIsuses += multiblock.mHardHammer ? 0 : 1;
            // 检查螺丝刀维护是否完成。
            maintIsuses += multiblock.mScrewdriver ? 0 : 1;
            // 检查软锤维护是否完成。
            maintIsuses += multiblock.mSoftMallet ? 0 : 1;
            // 检查电烙铁维护是否完成。
            maintIsuses += multiblock.mSolderingTool ? 0 : 1;
            // 检查扳手维护是否完成。
            maintIsuses += multiblock.mWrench ? 0 : 1;
            // 仅返回显示计数，不更改任何维护标志。
            return maintIsuses;
        });

        // 保留维护问题计数。
        syncManager.syncValue("maintCount", maintSyncer);

        // 静音设置继续保留原来的客户端按钮权限。
        BooleanSyncValue mufflerSyncer = new BooleanSyncValue(multiblock::isMuffled, multiblock::setMuffled).allowC2S();
        // 保留静音开关。
        syncManager.syncValue("mufflerSyncer", mufflerSyncer);
    }

    /**
     * 构造普通文本终端，保留运行、维护、结构错误、配方失败及进度信息。
     * 不创建父类的输出 DynamicSyncHandler，因此客户端接收摘要后没有回发路径。
     */
    @Override
    protected ListWidget<IWidget, ?> createTerminalTextWidget(PanelSyncManager syncManager, ModularPanel parent) {
        // 启动结构检查状态仍使用原始键名。
        IntSyncValue startupCheckSyncer = new IntSyncValue(multiblock::getmStartUpCheck);
        // 运行模式名称继续使用控制器原本的名称方法。
        StringSyncValue machineModeSyncer = new StringSyncValue(multiblock::getMachineModeName);
        // 这两个键在父类也是终端构建期间注册，不重复注册到其他面板。
        syncManager.syncValue("startupCheck", startupCheckSyncer);
        // 模式切换按钮继续与同一个服务端状态关联。
        syncManager.syncValue("machineModeName", machineModeSyncer);
        // 唯一产物同步值没有 allowC2S，也没有写服务器数组的 setter。
        StringSyncValue summarySyncer = syncManager.findSyncHandler("superInputOutputSummary", StringSyncValue.class);
        // 从原有同步值读取进度，不为每个产物重新注册监听器。
        IntSyncValue progressSyncer = syncManager.findSyncHandler("progressTime", IntSyncValue.class);
        // 保留原时长状态，支持无线固定 128 ticks 和普通处理时长。
        IntSyncValue maxProgressTimeSyncer = syncManager.findSyncHandler("maxProgressTime", IntSyncValue.class);
        // 普通 ListWidget 仅绘制文本，不包含动态输出列表或堆栈 NBT。
        return new ListWidget<>().fullWidth()
            .crossAxisAlignment(Alignment.CrossAxis.START)
            // 模式文本沿用控制器和原语言资源。
            .childIf(
                multiblock.supportsMachineModeSwitch(),
                () -> IKey
                    .dynamic(
                        () -> StatCollector
                            .translateToLocalFormatted("gt.interact.desc.mb.mode", machineModeSyncer.getStringValue()))
                    .asWidget()
                    .marginBottom(2)
                    .fullWidth())
            // 首次结构检查仍正常提示。
            .child(
                IKey.lang("GT5U.multiblock.startup")
                    .color(Color.WHITE.main)
                    .asWidget()
                    .textAlign(Alignment.CenterLeft)
                    .setEnabledIf(widget -> startupCheckSyncer.getValue() > 0)
                    .marginBottom(2)
                    .fullWidth())
            // 原版运行提示使用同步后的机器状态。
            .childIf(
                multiblock.hasRunningText(),
                () -> new TextWidget<>(StatCollector.translateToLocalFormatted("gt.interact.desc.mb.running"))
                    .color(Color.WHITE.main)
                    .setEnabledIf(widget -> multiblock.getErrorDisplayID() == 0 && baseMetaTileEntity.isActive())
                    .marginBottom(2)
                    .fullWidth())
            // 复用受支持的父类状态部件，不复制其按钮和结构错误交互。
            .child(createShutdownDurationWidget(syncManager))
            // 保留详细关机原因。
            .child(createShutdownReasonWidget(syncManager))
            // 结构错误仍可点击定位。
            .child(createStructureErrorWidget(syncManager))
            // 配方失败信息取自原来的只读同步结果。
            .child(
                IKey.dynamic(
                    () -> multiblock.getCheckRecipeResult()
                        .getDisplayString())
                    .asWidget()
                    .fullWidth()
                    .marginBottom(2)
                    .setEnabledIf(widget -> multiblock.shouldDisplayCheckRecipeResult()))
            // 只在真实运行时显示 tick 进度，避免空闲时出现 0 / 0。
            .child(
                IKey.dynamic(() -> progressSyncer.getValue() + " / " + maxProgressTimeSyncer.getValue() + " ticks")
                    .asWidget()
                    .fullWidth()
                    .marginBottom(2)
                    .setEnabledIf(widget -> multiblock.showRecipeTextInGUI() && maxProgressTimeSyncer.getValue() > 0))
            // 摘要显示开关仍尊重控制器原本的 GUI 配方文本设置。
            .child(
                IKey.lang("gtnothard.superInput.outputSummary")
                    .asWidget()
                    .fullWidth()
                    .marginBottom(2)
                    .setEnabledIf(
                        widget -> multiblock.showRecipeTextInGUI() && !summarySyncer.getStringValue()
                            .isEmpty()))
            // 数量已按 long 汇总；名称和数量只是只读文本，不建立产物槽或回写监听器。
            .child(
                IKey.dynamic(summarySyncer::getStringValue)
                    .asWidget()
                    .fullWidth()
                    .marginBottom(2)
                    .setEnabledIf(
                        widget -> multiblock.showRecipeTextInGUI() && !summarySyncer.getStringValue()
                            .isEmpty()));
    }
}
