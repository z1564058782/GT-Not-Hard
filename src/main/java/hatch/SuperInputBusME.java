package hatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.StatCollector;

import appeng.api.config.Actionable;
import appeng.api.networking.energy.IEnergyGrid;
import appeng.api.storage.IMEMonitor;
import appeng.api.storage.data.IAEItemStack;
import appeng.me.GridAccessException;
import appeng.me.helpers.AENetworkProxy;
import appeng.util.item.AEItemStack;
import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.implementations.MTEMultiBlockBase;
import gregtech.api.recipe.check.CheckRecipeResult;
import gregtech.api.recipe.check.CheckRecipeResultRegistry;
import gregtech.api.recipe.check.SimpleCheckRecipeResult;
import gregtech.api.util.GTUtility;
import gregtech.api.util.shutdown.ShutDownReasonRegistry;
import gregtech.common.tileentities.machines.MTEHatchInputBusME;
import io.netty.buffer.ByteBuf;
import loader.SuperInputLoader;

/**
 * 基于 GT5U 5.09.54.133 原版 ME 输入总线的独立大数量版本。
 *
 * <p>
 * 原版的 16 个过滤槽、自动拉取、数据棒、物理电路、手动槽、染色、线缆连接、
 * AE 观察器、GUI、NBT 和 Waila 行为全部通过真实父类继承；本文件没有省略待实现的方法。
 * 新增功能只覆盖配方检查的库存快照、虚拟槽和最终扣料。
 *
 * <p>
 * 合并输入模式必须配合 SuperInputProcessing，避免原版控制器按物品类型去重时丢掉分片。
 * 每种物品单次最多提供 SuperInputTier.getMaxInputAmount(tierIndex)，AE 多余库存保留到后续检查。
 */
@IMetaTileEntity.SkipGenerateDescription
public class SuperInputBusME extends MTEHatchInputBusME {

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
        return SuperInputLoader.getStack(true, tierIndex, aAmount);
    }

    /** @return 以实际世界等级生成的名称键；不能使用始终为 I 的注册样板名称 */
    @Override
    public String getLocalNameKey() {
        // 所有 17 个键在本次资源文件中完整提供。
        return "gtnothard.superInputBusMe.tier." + tierIndex + ".name";
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

    /** 每一种不同物品在本轮检查中的快照，配置重复时只记录一次。 */
    private final List<SuperInputAmountHelper.Snapshot<ItemStack>> recipeItemSnapshots = new ArrayList<>();

    /** 每种资源一个虚拟识别槽；完整分片用区间压缩，不按片数分配对象。 */
    private final List<ItemStack> virtualItemInputs = new ArrayList<>();

    /** 最近一次检查开始时是否发生网格访问错误；结束时必须报告给控制器。 */
    private boolean snapshotFailed = false;

    /**
     * 在机器加载阶段注册总线，参数名称与原版构造器保持一致。
     *
     * @param aID               未占用的 GregTech MetaTileEntity ID
     * @param autoPullAvailable 是否启用原版高级总线的自动拉取配置功能
     * @param aName             唯一内部名称
     * @param aNameRegional     注册时的后备显示名称
     */
    public SuperInputBusME(int aID, boolean autoPullAvailable, String aName, String aNameRegional) {
        // 由原版构造器完成 GT 注册和真实两个物理槽的初始化。
        super(aID, autoPullAvailable, aName, aNameRegional);
    }

    /**
     * 创建已放置方块的实例，参数名称与原版克隆构造器保持一致。
     *
     * @param aName             内部名称
     * @param autoPullAvailable 自动拉取能力
     * @param aTier             原版总线等级
     * @param aDescription      原版描述数组
     * @param aTextures         原版纹理数组
     */
    public SuperInputBusME(String aName, boolean autoPullAvailable, int aTier, String[] aDescription,
        ITexture[][][] aTextures) {
        // 保留等级、纹理和原版行为，不创建新的注册项。
        super(aName, autoPullAvailable, aTier, aDescription, aTextures);
    }

    /** @return 本类实例，避免放置后被父类克隆回普通 ME 总线 */
    @Override
    public MetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
        // 使用继承字段原名创建同类型实例。
        return new SuperInputBusME(mName, autoPullAvailable, mTier, mDescriptionArray, mTextures);
    }

    /** @return 本 Mod 的独立本地化名称，不改变原版总线名称 */
    @Override
    public String getLocalName() {
        // 注册名称不依赖父类的通用名称生成注解。
        return "Super Input Bus " + SuperInputTier.getTierName(tierIndex) + " (ME)";
    }

    /** @return 原版完整描述加上大数量能力及适配要求 */
    @Override
    public String[] getDescription() {
        // 保留原版关于频道、耗能、配置和工具操作的所有描述。
        List<String> description = new ArrayList<>();
        // 加入原版描述，原版文本本身不作修改。
        Collections.addAll(description, super.getDescription());
        // 显示本轮输入视图的准确上限。
        description.add(
            StatCollector.translateToLocalFormatted(
                "gtnothard.superInputMe.limit",
                SuperInputTier.getMaxInputAmount(tierIndex)));
        // 提示合并输入模式需要控制器适配。
        description.add(StatCollector.translateToLocal("gtnothard.superInputMe.controller"));
        // 原版物品提示系统使用 String 数组。
        return description.toArray(new String[0]);
    }

    /**
     * 开始一次检查，只模拟提取；真正库存留到 endRecipeProcessing 扣除。
     * 重复开始不会重建已经被配方减少过的分片。
     */
    @Override
    public void startRecipeProcessing() {
        // 嵌套开始属于同一检查，重建会让已经消耗的数量重新出现。
        if (processingRecipe) return;
        // 必须在设置 processingRecipe 之前读取实际网络和工作状态。
        cachedActivity = isAllowedToWork();
        // 标记后续 getStackInSlot 返回配方使用的虚拟槽。
        processingRecipe = true;
        // 本轮从干净状态开始，旧分片不能进入新检查。
        recipeItemSnapshots.clear();
        // 清空上一轮展开的引用。
        virtualItemInputs.clear();
        // 只有本轮失败才应导致结束阶段报错。
        snapshotFailed = false;
        // 清理父类仅供 GUI 使用的 int 库存，不修改过滤器配置。
        clearExtractedStacks();
        // 禁用、断电或缺少频道时不向控制器暴露物品。
        if (!cachedActivity) return;
        // 同一种物品和 NBT 的多个过滤槽不能重复申报库存。
        Set<GTUtility.ItemId> configuredItems = new HashSet<>();
        try {
            // 单轮复用同一个网络物品监视器。
            IMEMonitor<IAEItemStack> itemInventory = getProxy().getStorage()
                .getItemInventory();
            // 保持原版 16 个过滤槽的遍历顺序。
            for (Slot slot : slots) {
                // 没有配置的槽不产生快照。
                if (slot == null) continue;
                // ItemId 包含物品、元数据和 NBT，用于过滤器内部去重。
                GTUtility.ItemId itemId = GTUtility.ItemId.createNoCopy(slot.config);
                // 重复过滤器不再模拟提取或创建第二套影子库存。
                if (!configuredItems.add(itemId)) continue;
                // 使用 long 请求本轮上限，不能沿用原版 Integer.MAX_VALUE 请求。
                IAEItemStack request = slot.createAEStack(SuperInputTier.getMaxInputAmount(tierIndex));
                // SIMULATE 不转移物品，权限检查仍由 AE 完成。
                IAEItemStack result = itemInventory.extractItems(request, Actionable.SIMULATE, getRequestSource());
                // 不存在或无法提取的物品不参与配方。
                if (result == null || result.getStackSize() <= 0) continue;
                // 直接读取 AE 的 long 数量，不通过 getItemStack 的 int 数量中转。
                SuperInputAmountHelper.Snapshot<ItemStack> snapshot = SuperInputAmountHelper
                    .forItems(slot.config, result.getStackSize(), tierIndex);
                // 保存资源身份和初始数量，结束阶段据此结算。
                recipeItemSnapshots.add(snapshot);
                // 只加入这一资源的唯一识别视图，输入分离模式也不展开理论片数。
                virtualItemInputs.addAll(snapshot.getStacks());
                // 原版 GUI 显示一个 int 识别视图，完整数量由 long 配方逻辑读取。
                slot.extracted = snapshot.getStacks()
                    .get(0);
                // 保留父类 int 显示字段的意义；本类扣料不使用这个字段。
                slot.extractedAmount = slot.extracted.stackSize;
            }
        } catch (GridAccessException exception) {
            // 发生网络错误时不能留下部分可用、部分失效的快照。
            recipeItemSnapshots.clear();
            // 同时清理控制器可读取的展开列表。
            virtualItemInputs.clear();
            // 清理原版显示，避免把上一次模拟结果误认为仍可用。
            clearExtractedStacks();
            // 将故障交给结束阶段报告和停机。
            snapshotFailed = true;
        }
    }

    /** @return 检查期间的分片数加两个物理槽，其他时间保留原版槽位布局 */
    @Override
    public int getSizeInventory() {
        // GUI 操作需要原版槽号，配方检查才启用动态虚拟槽。
        return processingRecipe ? virtualItemInputs.size() + 2 : super.getSizeInventory();
    }

    /**
     * 返回虚拟分片本身，使 GT 的减量操作直接作用于待结算快照。
     *
     * @param slotIndex 原版或配方检查使用的槽号
     * @return 对应堆栈引用，越界时返回 null
     */
    @Override
    public ItemStack getStackInSlot(int slotIndex) {
        // GUI 和常规物品交互沿用原版的物理槽映射。
        if (!processingRecipe) return super.getStackInSlot(slotIndex);
        // 拒绝非法槽号。
        if (slotIndex < 0 || slotIndex >= getSizeInventory()) return null;
        // 虚拟区末尾依次放电路槽和手动槽，沿用原版反向收集时的优先顺序。
        int virtualSlotOffset = virtualItemInputs.size();
        // 工作开关不影响真实物理槽的读取。
        if (slotIndex == virtualSlotOffset + getCircuitSlot()) return mInventory[getCircuitSlot()];
        // 手动槽实际保存在 mInventory[1]，不能按虚拟槽号索引真实数组。
        if (slotIndex == virtualSlotOffset + getManualSlot()) return mInventory[getManualSlot()];
        // 虚拟区只在本轮允许工作时可读取。
        if (!cachedActivity) return null;
        // 接收旧 int 调用方上一次减量并刷新视图，使连续旧接口调用可以跨片。
        SuperInputAmountHelper.getItemSnapshot(virtualItemInputs.get(slotIndex))
            .getRemainingAmount();
        // 返回同一个可扣料对象，不构造理论分片数组。
        return virtualItemInputs.get(slotIndex);
    }

    /**
     * 支持通过库存接口减少虚拟槽数量，避免父类按虚拟索引访问仅有两个元素的真实数组。
     *
     * @param aIndex  要提取的槽号
     * @param aAmount 本次最多提取的 int 数量
     * @return 实际提取堆栈，非法请求返回 null
     */
    @Override
    public ItemStack decrStackSize(int aIndex, int aAmount) {
        // 非配方期间沿用原版物理库存操作。
        if (!processingRecipe) return super.decrStackSize(aIndex, aAmount);
        // 虚拟库存也不接受负数或零数量的提取。
        if (aAmount <= 0) return null;
        // getStackInSlot 已经负责虚拟槽、物理槽和边界映射。
        ItemStack stack = getStackInSlot(aIndex);
        // 空槽或零数量分片无法提供物品。
        if (stack == null || stack.stackSize <= 0) return null;
        // 单次接口返回值仍受 int 限制，但可以分多次减少不同分片。
        int extractedAmount = Math.min(aAmount, stack.stackSize);
        // 返回独立物品，避免调用方继续修改影子库存引用。
        ItemStack extracted = stack.copy();
        // 显式设置实际取出的数量。
        extracted.stackSize = extractedAmount;
        // 减少原对象；零数量分片也保留引用，以便最终结算。
        stack.stackSize -= extractedAmount;
        // 返回本次提取结果。
        return extracted;
    }

    /** @return 本轮每种物品的完整快照，供同包的控制器收集器读取 */
    List<SuperInputAmountHelper.Snapshot<ItemStack>> getRecipeItemSnapshots() {
        // 暴露只读列表，不能让收集器移除结算条目。
        return Collections.unmodifiableList(recipeItemSnapshots);
    }

    /**
     * 按 long 差额从 ME 真正扣料，并沿用原版 AE 能源检查。
     *
     * @param controller 发起本轮检查的控制器
     * @return 成功或原版可识别的持续性提取失败结果
     */
    @Override
    public CheckRecipeResult endRecipeProcessing(MTEMultiBlockBase controller) {
        // GT-Not-Hard 的部分路径会重复调用结束，第二次必须无副作用。
        if (!processingRecipe) return CheckRecipeResultRegistry.SUCCESSFUL;
        try {
            // 预先取得所有差额；尚未开始扣料时先发现任何非法分片。
            long[] consumedAmounts = new long[recipeItemSnapshots.size()];
            // 记录是否真的需要访问 AE 和消耗 AE 能源。
            boolean hasConsumption = false;
            // 每种资源按它自己的初始数量计算差额。
            for (int snapshotIndex = 0; snapshotIndex < recipeItemSnapshots.size(); snapshotIndex++) {
                // 从压缩账本校验并读取 long 差额，不逐片遍历。
                consumedAmounts[snapshotIndex] = recipeItemSnapshots.get(snapshotIndex)
                    .getConsumedAmount();
                // 零消耗的检查无需访问 AE。
                hasConsumption |= consumedAmounts[snapshotIndex] > 0;
            }
            // 模拟阶段出现网络错误时必须停止机器。
            if (snapshotFailed) return failExtraction(controller);
            // 没有消耗时允许离线结束，避免无配方检查也报提取失败。
            if (!hasConsumption) return CheckRecipeResultRegistry.SUCCESSFUL;
            // 复用原版网络代理，不创建第二个频道节点。
            AENetworkProxy proxy = getProxy();
            // 沿用原版对 onFirstTick 晚于结束回调的兼容处理。
            if (!proxy.isReady()) proxy.onReady();
            // 获取物品监视器，实际提取仍经过 AE 权限检查。
            IMEMonitor<IAEItemStack> itemInventory = proxy.getStorage()
                .getItemInventory();
            // poweredExtraction 同时验证并扣除 AE 能量。
            IEnergyGrid energy = proxy.getEnergy();
            // 所有差额均已验证后，逐种物品执行真实提取。
            for (int snapshotIndex = 0; snapshotIndex < recipeItemSnapshots.size(); snapshotIndex++) {
                // 每种物品的消耗可能超过 Integer.MAX_VALUE。
                long toExtract = consumedAmounts[snapshotIndex];
                // 未被配方消耗的物品不生成提取请求。
                if (toExtract <= 0) continue;
                // 使用快照中的原型，不能使用可能已被修改的 GUI 过滤器。
                IAEItemStack request = AEItemStack.create(
                    recipeItemSnapshots.get(snapshotIndex)
                        .getPrototype());
                // 设置完整 long 差额。
                request.setStackSize(toExtract);
                // 与原版相同地使用带能源计费的提取接口。
                boolean extracted = SuperInputNetworkExtraction
                    .extract(energy, itemInventory, request, getRequestSource());
                // 必须比较实际数量和请求差额，不能将返回数量与自身比较。
                if (!extracted) return failExtraction(controller);
            }
            // 所有物品均准确扣除后，结束本轮检查。
            return CheckRecipeResultRegistry.SUCCESSFUL;
        } catch (GridAccessException | IllegalStateException exception) {
            // 网络失联或非法剩余数量均禁止继续运行配方。
            return failExtraction(controller);
        } finally {
            // 任何成功、失败或提前返回路径都必须退出配方状态。
            processingRecipe = false;
            // 清空快照使重复结束绝不重复扣料，也不持有过期堆栈。
            recipeItemSnapshots.clear();
            // 释放所有展开引用，下一轮重新查询 AE。
            virtualItemInputs.clear();
            // 清除本轮错误标记，避免影响下一次正常开始。
            snapshotFailed = false;
        }
    }

    /**
     * 使用原版停机原因和原版失败提示，保持控制器的故障显示兼容。
     *
     * @param controller 需要停止的控制器
     * @return 持续显示到停机后的提取失败结果
     */
    private CheckRecipeResult failExtraction(MTEMultiBlockBase controller) {
        // 阻止库存不足、断网或 AE 能量不足时继续正常运行。
        controller.stopMachine(ShutDownReasonRegistry.CRITICAL_NONE);
        // 复用 GT 自带本地化消息，不依赖额外注册配方结果类型。
        return SimpleCheckRecipeResult.ofFailurePersistOnShutdown("stocking_bus_fail_extraction");
    }
}
