package hatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.StatCollector;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTankInfo;

import appeng.api.config.Actionable;
import appeng.api.networking.energy.IEnergyGrid;
import appeng.api.networking.security.BaseActionSource;
import appeng.api.networking.security.IActionHost;
import appeng.api.networking.security.MachineSource;
import appeng.api.storage.IMEMonitor;
import appeng.api.storage.data.IAEFluidStack;
import appeng.me.GridAccessException;
import appeng.me.helpers.AENetworkProxy;
import appeng.util.item.AEFluidStack;
import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.implementations.MTEMultiBlockBase;
import gregtech.api.recipe.check.CheckRecipeResult;
import gregtech.api.recipe.check.CheckRecipeResultRegistry;
import gregtech.api.recipe.check.SimpleCheckRecipeResult;
import gregtech.api.util.shutdown.ShutDownReasonRegistry;
import gregtech.common.tileentities.machines.MTEHatchInputME;
import io.netty.buffer.ByteBuf;
import loader.SuperInputLoader;

/**
 * 基于 GT5U 5.09.54.133 原版 ME 输入仓的大数量流体输入仓。
 *
 * <p>
 * 原版 GUI、16 个过滤槽、自动拉取、数据棒、线缆、染色、频道、Waila、观察器与 NBT
 * 直接继承完整原版实现；新增代码负责 long 快照、分片引用和准确扣料。
 * 原版控制器收集流体时按 Fluid 去重，因此必须同时接入 SuperInputProcessing。
 *
 * <p>
 * 每种流体单次最多提供 本级 long 容量的 mB，单位始终为 mB，不能将该数值当成桶数。
 * 本类不扩大 Forge 的单个 FluidStack.amount，也不改变配方的单个 int 字段。
 */
@IMetaTileEntity.SkipGenerateDescription
public class SuperInputHatchME extends MTEHatchInputME {

    /** 子类型等级索引，0 为 I 级；不改变 GT 已有 mTier 字段的含义。 */
    private int tierIndex = 0;

    /** @return 本仓室的子类型 Meta，范围 0～16 */
    public int getTierIndex() {
        return tierIndex;
    }

    /**
     * 设置子类型等级；配方处理中禁止改变容量，避免改变已建立的扣料快照。
     * 
     * @param tierIndex 子类型 Meta；越界立即拒绝，不静默升级
     */
    public void setTierIndex(int tierIndex) {
        // 配方正在使用的库存不能在结算前切换等级。
        if (processingRecipe) throw new IllegalStateException("Cannot change SuperInput tier while processing");
        // 新变量与现有 mTier 分离，保留父类变量及方法名称。
        this.tierIndex = SuperInputTier.checkTierIndex(tierIndex);
    }

    /** 保存世界中的等级和原版全部配置。 */
    @Override
    public void saveNBTData(NBTTagCompound aNBT) {
        // 先保存过滤器、网络、自动拉取等所有原版数据。
        super.saveNBTData(aNBT);
        // 子类型使用独立键，不占用 GT 的 mID 或 mTier。
        aNBT.setInteger(SuperInputTier.tierTag, tierIndex);
    }

    /** 读取世界或放置物品的等级；旧版无键的 64 片仓室迁移为 III 级。 */
    @Override
    public void loadNBTData(NBTTagCompound aNBT) {
        // 非法数据按 I 级处理，防止损坏存档静默获得最高容量。
        int savedTierIndex = aNBT.hasKey(SuperInputTier.tierTag) ? aNBT.getInteger(SuperInputTier.tierTag)
            : SuperInputTier.legacyTierIndex;
        // 不对未验证索引执行位移。
        tierIndex = savedTierIndex >= 0 && savedTierIndex < SuperInputTier.tierCount ? savedTierIndex : 0;
        // 权威等级先恢复，再读取全部原版配置；GT 捕获父类异常时等级也已存在。
        super.loadNBTData(aNBT);
    }

    /** GT 物品放置模式初始化；不从数据棒复制等级。 */
    @Override
    public void initDefaultModes(NBTTagCompound aNBT) {
        // 原版工具模式、过滤器和连接行为仍由父类初始化。
        super.initDefaultModes(aNBT);
        // 新子类型物品一定携带等级；旧的无 NBT 机器物品按上一版迁移。
        int savedTierIndex = aNBT != null && aNBT.hasKey(SuperInputTier.tierTag)
            ? aNBT.getInteger(SuperInputTier.tierTag)
            : SuperInputTier.legacyTierIndex;
        // 损坏索引不允许提升容量。
        tierIndex = savedTierIndex >= 0 && savedTierIndex < SuperInputTier.tierCount ? savedTierIndex : 0;
    }

    /** 所有 GT 原生掉落先保留等级，事件转换器再将物品转换为真实子类型。 */
    @Override
    public void setItemNBT(NBTTagCompound aNBT) {
        // 不省略父类可能追加的物品数据。
        super.setItemNBT(aNBT);
        // 扳手、破坏和世界掉落都能通过该键恢复相同等级。
        aNBT.setInteger(SuperInputTier.tierTag, tierIndex);
    }

    /** 复用原版空闲的自定义数据字节同步客户端等级，不创建逐 tick 扫描。 */
    @Override
    public byte getUpdateData() {
        return (byte) tierIndex;
    }

    /** 接收服务器等级同步；GT5U 目标父类的自定义数据回调为空实现。 */
    @Override
    public void onValueUpdate(byte aValue) {
        // 非法网络值不能成为数组索引或容量指数。
        if (aValue >= 0 && aValue < SuperInputTier.tierCount) tierIndex = aValue;
    }

    /** 返回本 Mod 子类型物品；其 damage 是等级，GT 方块实体 ID 保持固定。 */
    @Override
    public ItemStack getStackForm(long aAmount) {
        // 注册器提供完整可放置物品，不把等级塞进 GT 的机器 ID 字段。
        return SuperInputLoader.getStack(false, tierIndex, aAmount);
    }

    /** @return 以实际世界等级生成的名称键；不能使用始终为 I 的注册样板名称 */
    @Override
    public String getLocalNameKey() {
        // 所有 17 个键在本次资源文件中完整提供。
        return "gtnothard.superInputHatchMe.tier." + tierIndex + ".name";
    }

    /** @return GUI 的当前世界等级名称键，修复 CommonMetaTileEntity 默认读取全局样板的 I 级名称 */
    @Override
    public String getInventoryName() {
        // 注册样板只有一个，但每个实际元实体可以拥有不同等级。
        return getLocalNameKey();
    }

    /** 完整区块描述包携带等级；单靠变化事件无法覆盖玩家首次观察已有高等级仓室的情况。 */
    @Override
    public void writeToStream(ByteBuf data) {
        // 原版发送朝向、活动状态和覆盖板等数据，必须按原序保留。
        super.writeToStream(data);
        // 0～16 一个字节即可表达，不增加周期性网络扫描。
        data.writeByte(tierIndex);
    }

    /** 客户端先由 GT 创建正确 MTE，再从同一描述包接收实际等级。 */
    @Override
    public void readFromStream(ByteBuf data) {
        // 先消费原版部分，不能破坏 GT 的网络格式。
        super.readFromStream(data);
        // 本版客户端和服务端必须同步更新；旧包缺少字节时保持现有等级。
        if (data.isReadable()) onValueUpdate(data.readByte());
    }

    /** 本轮每一种流体的快照；按 Fluid 去重以保持原版控制器的资源识别规则。 */
    private final List<SuperInputAmountHelper.Snapshot<FluidStack>> recipeFluidSnapshots = new ArrayList<>();

    /** 持有每种流体的唯一识别视图；完整扣料由压缩 long 账本处理。 */
    private final List<FluidStack> virtualFluidInputs = new ArrayList<>();

    /** 模拟阶段发生网络错误时记录故障，结束阶段由控制器停机显示。 */
    private boolean snapshotFailed = false;

    /**
     * 在机器加载阶段注册流体仓，参数名称保持原版构造器约定。
     *
     * @param aID               未占用的 GT MetaTileEntity ID
     * @param autoPullAvailable 是否启用原版高级仓的自动拉取功能
     * @param aName             唯一内部名称
     * @param aNameRegional     注册时的后备显示名称
     */
    public SuperInputHatchME(int aID, boolean autoPullAvailable, String aName, String aNameRegional) {
        // 使用原版等级、真实库存、网络节点和 GT 注册流程。
        super(aID, autoPullAvailable, aName, aNameRegional);
    }

    /**
     * 创建放置后的流体仓实例，不重复注册 ID。
     *
     * @param aName             内部名称
     * @param autoPullAvailable 自动拉取能力
     * @param aTier             原版仓室等级
     * @param aDescription      原版描述数组
     * @param aTextures         原版纹理数组
     */
    public SuperInputHatchME(String aName, boolean autoPullAvailable, int aTier, String[] aDescription,
        ITexture[][][] aTextures) {
        // 所有既有变量名称和父类构造参数保持不变。
        super(aName, autoPullAvailable, aTier, aDescription, aTextures);
    }

    /** @return 本类实例，确保方块放置后仍具有大数量功能 */
    @Override
    public MetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
        // 复制原版名称、能力、等级与纹理字段。
        return new SuperInputHatchME(mName, autoPullAvailable, mTier, mDescriptionArray, mTextures);
    }

    /** @return 本 Mod 的独立仓室名称 */
    @Override
    public String getLocalName() {
        // 本地化键不占用 GT 原版键。
        return "Super Input Hatch " + SuperInputTier.getTierName(tierIndex) + " (ME)";
    }

    /** @return 原版完整提示加上本轮输入上限与适配要求 */
    @Override
    public String[] getDescription() {
        // 使用新列表追加说明，不修改父类数组或原有注释。
        List<String> description = new ArrayList<>();
        // 保留原版全部工具操作、耗能和频道说明。
        Collections.addAll(description, super.getDescription());
        // 上限以 mB 计量。
        description.add(
            StatCollector.translateToLocalFormatted(
                "gtnothard.superInputMe.limit",
                SuperInputTier.getMaxInputAmount(tierIndex)));
        // 提示需使用完整分片收集器。
        description.add(StatCollector.translateToLocal("gtnothard.superInputMe.controller"));
        // GT 描述接口接收字符串数组。
        return description.toArray(new String[0]);
    }

    /**
     * 创建本轮流体影子库存，不提前提取真实流体。
     * 嵌套开始回调继续使用原快照，以免重新填满已被消耗的分片。
     */
    @Override
    public void startRecipeProcessing() {
        // 防止嵌套或重复开始覆盖已有消耗记录。
        if (processingRecipe) return;
        // 必须在启用缓存状态之前读取实际网络可用性。
        cachedActivity = isAllowedToWork();
        // 后续查询切换为本轮分片视图。
        processingRecipe = true;
        // 不复用上轮快照和初始数量。
        recipeFluidSnapshots.clear();
        // 不向控制器返回上轮流体引用。
        virtualFluidInputs.clear();
        // 清除上轮故障。
        snapshotFailed = false;
        // 只清除父类显示用缓存，过滤器配置保持原样。
        clearExtractedStacks();
        // 关闭、无频道或断电时不提供网络库存。
        if (!cachedActivity) return;
        // 原版按 Fluid 去重，重复过滤槽不能重复暴露相同流体。
        Set<Fluid> configuredFluids = new HashSet<>();
        try {
            // 一轮检查只获取一次流体监视器。
            IMEMonitor<IAEFluidStack> fluidInventory = getProxy().getStorage()
                .getFluidInventory();
            // 按原版配置槽顺序处理。
            for (Slot slot : slots) {
                // 空槽不参与检查。
                if (slot == null) continue;
                // 仅第一个同类型配置产生库存快照。
                if (!configuredFluids.add(slot.config.getFluid())) continue;
                // 从配置复制流体身份与 NBT。
                IAEFluidStack request = AEFluidStack.create(slot.config);
                // 请求本轮 long 上限，避免原版 2.1G 请求限制。
                request.setStackSize(SuperInputTier.getMaxInputAmount(tierIndex));
                // 模拟提取经过 AE 的可提取性和权限检查，但不扣真实库存。
                IAEFluidStack result = fluidInventory
                    .extractItems(request, Actionable.SIMULATE, getSuperRequestSource());
                // 没有可用流体时不创建任何分片。
                if (result == null || result.getStackSize() <= 0) continue;
                // 从 long 数量直接构造分片，避免 getFluidStack 的 int 截断。
                SuperInputAmountHelper.Snapshot<FluidStack> snapshot = SuperInputAmountHelper
                    .forFluids(slot.config, result.getStackSize(), tierIndex);
                // 保存结算所需的原型、初始量和分片。
                recipeFluidSnapshots.add(snapshot);
                // 返回控制器的分片与快照必须共享对象。
                virtualFluidInputs.addAll(snapshot.getStacks());
                // 原版 GUI 显示 int 识别视图，完整数量由 long 配方逻辑读取。
                slot.extracted = snapshot.getStacks()
                    .get(0);
                // 保留父类 int 字段的显示语义，本类结算不使用该值。
                slot.extractedAmount = slot.extracted.amount;
            }
        } catch (GridAccessException exception) {
            // 网格异常时清空所有部分创建的快照。
            recipeFluidSnapshots.clear();
            // 不允许控制器使用部分结果。
            virtualFluidInputs.clear();
            // 同步清除 GUI 的模拟库存缓存。
            clearExtractedStacks();
            // 结束阶段必须向控制器返回提取失败。
            snapshotFailed = true;
        }
    }

    /**
     * 返回本轮所有流体分片；非配方期间沿用原版配置查询语义。
     *
     * @return 包含原始分片引用的新数组，不能复制其中的 FluidStack
     */
    @Override
    public FluidStack[] getStoredFluids() {
        // 常规配置检查和 GUI 查询仍使用原版方法。
        if (!processingRecipe) return super.getStoredFluids();
        // 禁用或离线时不能暴露分片。
        if (!cachedActivity) return new FluidStack[0];
        // 只复制数组结构，元素仍是可被配方减少数量的原对象。
        return virtualFluidInputs.toArray(new FluidStack[0]);
    }

    /**
     * 检查期间为 UNKNOWN 方向返回分片储罐信息，继续禁止管道抽取。
     *
     * @param side 查询方向，控制器使用 UNKNOWN
     * @return 每片最多 int 上限的储罐信息
     */
    @Override
    public FluidTankInfo[] getTankInfo(ForgeDirection side) {
        // 非配方查询保留原版权限和模拟读取行为。
        if (!processingRecipe) return super.getTankInfo(side);
        // 只有控制器方向可以查看本轮输入视图。
        if (side != ForgeDirection.UNKNOWN || !cachedActivity) return new FluidTankInfo[0];
        // 为每一个分片创建一个对应信息条目。
        FluidTankInfo[] tankInfos = new FluidTankInfo[virtualFluidInputs.size()];
        // 储罐信息仅用于查询，真正配方消耗使用 getStoredFluids 中的对象。
        for (int fluidIndex = 0; fluidIndex < tankInfos.length; fluidIndex++) {
            // 容量是单片容量，不能把 long 总量强转成 int。
            tankInfos[fluidIndex] = new FluidTankInfo(virtualFluidInputs.get(fluidIndex), Integer.MAX_VALUE);
        }
        // 返回当前分片视图。
        return tankInfos;
    }

    /**
     * 按指定流体从本轮多个分片中抽取，供使用旧 drain 接口的控制器调用。
     *
     * @param side    仅允许 UNKNOWN 控制器方向
     * @param fluid   请求的流体身份和 NBT
     * @param amount  单次接口仍接收 int mB，支持在同轮多次调用
     * @param doDrain true 修改分片，false 只计算可用量
     * @return 实际抽取的流体，类型不存在或请求非法时返回 null
     */
    @Override
    public FluidStack drain(ForgeDirection side, FluidStack fluid, int amount, boolean doDrain) {
        // 非配方期间仍由父类直接向 AE 进行带能源计费的提取。
        if (!processingRecipe) return super.drain(side, fluid, amount, doDrain);
        // 不允许实体管道、负数量、空流体或停用仓室访问影子库存。
        if (side != ForgeDirection.UNKNOWN || fluid == null || amount < 0 || !cachedActivity) return null;
        // 初始剩余请求量受接口 int 限制，减法不会超过这个范围。
        int remainingAmount = amount;
        // 记录是否至少存在一个同类型分片，以支持原版零数量存在检查。
        boolean matchingFluid = false;
        // 可从多个分片依次抽取，跨越单片边界。
        for (FluidStack storedFluid : virtualFluidInputs) {
            // 连续 drain 调用前先同步上次 int 减量，完整剩余量仍留在 long 账本。
            ((SuperInputAmountHelper.FluidView) storedFluid).snapshot.getRemainingAmount();
            // FluidStack.isFluidEqual 保留 Forge 的流体和 NBT 比较规则。
            if (!fluid.isFluidEqual(storedFluid)) continue;
            // 同类型分片存在，零数量请求也可以返回合法的零数量流体。
            matchingFluid = true;
            // 每片最多贡献其当前剩余量。
            int drainedAmount = Math.min(remainingAmount, Math.max(0, storedFluid.amount));
            // 模拟抽取不修改对象，真实抽取减少原引用以便结束阶段结算。
            if (doDrain) storedFluid.amount -= drainedAmount;
            // 继续处理尚未满足的请求。
            remainingAmount -= drainedAmount;
            // 请求已满足时不再访问后续分片。
            if (remainingAmount == 0) break;
        }
        // 没有相同流体时沿用原版 null 返回语义。
        if (!matchingFluid) return null;
        // 复制请求原型，避免将影子库存对象交给旧接口调用方任意修改。
        FluidStack drainedFluid = fluid.copy();
        // 返回所有分片合计实际提供的数量。
        drainedFluid.amount = amount - remainingAmount;
        // 单次返回值仍是 Forge 的合法 int FluidStack。
        return drainedFluid;
    }

    /** @return 本轮按资源分组的只读快照列表，供同包收集器使用 */
    List<SuperInputAmountHelper.Snapshot<FluidStack>> getRecipeFluidSnapshots() {
        // 不允许外部删除结算记录。
        return Collections.unmodifiableList(recipeFluidSnapshots);
    }

    /**
     * 复用父类的 requestSource 字段，解决原版 getRequestSource 为 private 的访问限制。
     *
     * @return 与原版拥有相同安全主体的 AE 请求来源
     */
    private BaseActionSource getSuperRequestSource() {
        // 惰性创建来源，注册样板对象尚未放置时不会提前获取世界实体。
        if (requestSource == null) requestSource = new MachineSource((IActionHost) getBaseMetaTileEntity());
        // 后续模拟和真实提取共用同一来源。
        return requestSource;
    }

    /**
     * 使用 long 差额和原版 poweredExtraction 对本轮真实流体消耗进行结算。
     *
     * @param controller 发起检查的控制器
     * @return 成功或可持续显示的原版提取失败结果
     */
    @Override
    public CheckRecipeResult endRecipeProcessing(MTEMultiBlockBase controller) {
        // 第二次结束没有待结算快照，必须直接成功且不重复扣料。
        if (!processingRecipe) return CheckRecipeResultRegistry.SUCCESSFUL;
        try {
            // 先计算并验证所有流体差额，再开始任何真实提取。
            long[] consumedAmounts = new long[recipeFluidSnapshots.size()];
            // 无消耗时不需要 AE 能量或网络访问。
            boolean hasConsumption = false;
            // 每种流体独立验证剩余量。
            for (int snapshotIndex = 0; snapshotIndex < recipeFluidSnapshots.size(); snapshotIndex++) {
                // 减量求和全程使用 long。
                consumedAmounts[snapshotIndex] = recipeFluidSnapshots.get(snapshotIndex)
                    .getConsumedAmount();
                // 记录本轮是否至少有一种流体被消耗。
                hasConsumption |= consumedAmounts[snapshotIndex] > 0;
            }
            // 模拟阶段失败时不能伪装成没有消耗的正常检查。
            if (snapshotFailed) return failExtraction(controller);
            // 无配方、工具流体或零消耗检查直接结束。
            if (!hasConsumption) return CheckRecipeResultRegistry.SUCCESSFUL;
            // 使用原版 AE 节点，不占用额外频道。
            AENetworkProxy proxy = getProxy();
            // 兼容原版记录的 onFirstTick 调用较晚情况。
            if (!proxy.isReady()) proxy.onReady();
            // 获取当前网络流体存储，真实提取时 AE 再次验证权限。
            IMEMonitor<IAEFluidStack> fluidInventory = proxy.getStorage()
                .getFluidInventory();
            // poweredExtraction 使用这个能源网格计费。
            IEnergyGrid energy = proxy.getEnergy();
            // 依次扣除每种流体的真实差额。
            for (int snapshotIndex = 0; snapshotIndex < recipeFluidSnapshots.size(); snapshotIndex++) {
                // long 请求允许单种流体在同次检查中消耗超过 2.1G mB。
                long toExtract = consumedAmounts[snapshotIndex];
                // 没有消耗的流体不触发能源计费或网络提取。
                if (toExtract <= 0) continue;
                // 使用快照身份和 NBT，不能依赖可能已改变的过滤器配置。
                IAEFluidStack request = AEFluidStack.create(
                    recipeFluidSnapshots.get(snapshotIndex)
                        .getPrototype());
                // 不能将差额转回 int。
                request.setStackSize(toExtract);
                // 与原版保持相同的带能源计费提取行为。
                boolean extracted = SuperInputNetworkExtraction
                    .extract(energy, fluidInventory, request, getSuperRequestSource());
                // 返回不足、空返回或能量不足都会令控制器停机。
                if (!extracted) return failExtraction(controller);
            }
            // 每种流体均准确扣除时本轮结算成功。
            return CheckRecipeResultRegistry.SUCCESSFUL;
        } catch (GridAccessException | IllegalStateException exception) {
            // 断网或分片越界都沿用原版错误处理。
            return failExtraction(controller);
        } finally {
            // 所有退出路径都恢复非配方状态。
            processingRecipe = false;
            // 删除旧结算记录，保证重复结束不会重复提取。
            recipeFluidSnapshots.clear();
            // 释放过期分片，下一轮重新模拟当前网络库存。
            virtualFluidInputs.clear();
            // 错误不跨检查周期保留。
            snapshotFailed = false;
        }
    }

    /**
     * 停止机器并返回 GT 原版的流体仓提取失败结果。
     *
     * @param controller 需要停止的控制器
     * @return 持续显示的失败结果
     */
    private CheckRecipeResult failExtraction(MTEMultiBlockBase controller) {
        // 阻止库存竞争、能量不足或断网后继续正常产出。
        controller.stopMachine(ShutDownReasonRegistry.CRITICAL_NONE);
        // 使用已存在的 GT 消息键。
        return SimpleCheckRecipeResult.ofFailurePersistOnShutdown("stocking_hatch_fail_extraction");
    }
}
