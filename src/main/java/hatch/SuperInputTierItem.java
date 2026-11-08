package hatch;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.GregTechAPI;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.common.blocks.ItemMachines;
import loader.SuperInputLoader;

/**
 * 真正机器方块关联的 ItemMachines，而非上一版的普通 Item。
 * 物品 damage 0～16 保存等级；进入原版 GT 放置函数前用临时堆栈转换为固定 MTE ID。
 * 世界放置、权限、归属、朝向和连接继续走 ItemMachines；随后在最终实际元实体上确认等级。
 */
public final class SuperInputTierItem extends ItemMachines {

    /**
     * Forge registerBlock 要求的公开构造器。该构造器由 GTGenericBlock 自动调用。
     * 
     * @param block 与本方块物品一一对应的 SuperInputBlock
     */
    public SuperInputTierItem(Block block) {
        // 原版 ItemMachines 构造器保留机器方块的创造栏、无耐久和子类型设置。
        super(block);
        setCreativeTab(SuperHatchCreativeTab.INSTANCE);
    }

    /** @return 从关联方块读取类别；避免方块父构造器注册物品时缓存尚未初始化的 boolean */
    private boolean isItemBus() {
        // 每个类别注册一个实际机器方块，不能根据等级 damage 猜测 MTE ID。
        return ((SuperInputBlock) field_150939_a).isItemBus();
    }

    /** @return 子类型 Meta 是否为合法等级；无效数据不得被当成 I 级放置 */
    private boolean isValidTier(ItemStack stack) {
        // 不重写 Item.getDamage：Forge ItemStack.getItemDamage 依赖它读取真实等级。
        return stack != null && stack.getItemDamage() >= 0 && stack.getItemDamage() < SuperInputTier.tierCount;
    }

    /** @return 物品堆栈按等级显示的完整名称 */
    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        // 无效物品仍能识别，但不允许放入世界。
        if (!isValidTier(stack)) return "Invalid Super Input (ME)";
        // 物品元数据是等级，不能交给父类按 MTE ID 查询全局样板。
        return "Super Input " + (isItemBus() ? "Bus " : "Hatch ")
            + SuperInputTier.getTierName(stack.getItemDamage())
            + " (ME)";
    }

    /** @return 每种方块与等级各自的名称键，避免父类把 Meta 0 解释为空 MTE */
    @Override
    public String getUnlocalizedName(ItemStack stack) {
        // 名称的等级后缀保留真实 damage，不覆盖为 25568/25569。
        return "tile.gtnothard." + (isItemBus() ? "superInputBusMe" : "superInputHatchMe")
            + "."
            + stack.getItemDamage();
    }

    /** @return 世界方块 metadata 使用 GT 底座类型；等级保存在实体 NBT，不能把 XVII 的 16 写进四位元数据 */
    @Override
    public int getMetadata(int damage) {
        // GT 元实体只在 init 后存在；preInit 查询时用普通机器底座默认值。
        IMetaTileEntity sample = GregTechAPI.METATILEENTITIES[SuperInputLoader.getMachineId(isItemBus())];
        // 即使物品为 XVII，世界 meta 也保持合法的 GT 底座类型。
        return sample == null ? 0 : sample.getTileEntityBaseType();
    }

    /** 完整列出原版提示，并用当前物品等级替换容量，绝不临时修改全局样板等级。 */
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List<String> lines, boolean advanced) {
        // 无效 Meta 不访问等级表。
        if (!isValidTier(stack)) {
            lines.add("Invalid tier Meta: " + stack.getItemDamage());
            return;
        }
        // 只在提示生成时创建临时原生机器栈，让原版正确读取固定 MTE ID，而非误读等级 Meta。
        ItemStack machineStack = SuperInputLoader.getMachineStack(isItemBus(), stack.stackSize);
        // 原生提示还读取染色、覆盖板及升级标签，必须完整保留；这里只读标签，不作修改。
        machineStack.setTagCompound(stack.getTagCompound());
        // 记录新增提示起点，不能修改其他调用方已经加入的文字。
        int descriptionStart = lines.size();
        // 原版处理完整工具提示、覆盖板、染色和额外元实体提示。
        super.addInformation(machineStack, player, lines, advanced);
        // 全局样板为 I 级，定位本扩展唯一的容量文本再替换为物品的真实等级。
        String sampleLimit = StatCollector
            .translateToLocalFormatted("gtnothard.superInputMe.limit", SuperInputTier.getMaxInputAmount(0));
        // 本地化单位及原有提示格式均由资源文件保留。
        String actualLimit = StatCollector.translateToLocalFormatted(
            "gtnothard.superInputMe.limit",
            SuperInputTier.getMaxInputAmount(stack.getItemDamage()));
        // 不依赖原版提示行数，避免覆盖工具说明或其他 Mod 加入的文字。
        for (int descriptionIndex = descriptionStart; descriptionIndex < lines.size(); descriptionIndex++) {
            // 只有容量行需要按等级更换，其他原版行原样保留。
            if (sampleLimit.equals(lines.get(descriptionIndex))) lines.set(descriptionIndex, actualLimit);
        }
        // 明确逻辑分片数量，最高级也不分配巨量 GUI 槽。
        lines.add(
            "Independent shards: " + SuperInputTier.getShardCount(stack.getItemDamage()) + " x " + Integer.MAX_VALUE);
        // 展示固定 MTE ID 与物品等级的对应关系。
        lines.add("GT MTE: " + SuperInputLoader.getMachineId(isItemBus()) + ":" + stack.getItemDamage());
    }

    /** 输入仓/总线的背包形态没有周期行为；避免父类将等级 0～16 当作其他机器 ID。 */
    @Override
    public void onUpdate(ItemStack aStack, World aWorld, Entity aPlayer, int aTimer, boolean aIsInHand) {
        // ItemMachines 的唯一周期扩展用于 SuperChest/SuperTank 负重效果，本仓室不属于这两类。
        // ItemBlock 的此回调本身为空，无需创建临时堆栈或执行背包逐 tick 扫描。
    }

    /** 合成回调使用本类别固定样板，不能将等级 Meta 当成原版机器编号。 */
    @Override
    public void onCreated(ItemStack aStack, World aWorld, EntityPlayer aPlayer) {
        // 非法 Meta 不能触发任何其他 GT 机器的回调。
        if (!isValidTier(aStack)) return;
        // 只读取本类别注册样板，不改变其等级。
        IMetaTileEntity sample = GregTechAPI.METATILEENTITIES[SuperInputLoader.getMachineId(isItemBus())];
        // 传递真实子类型物品，供原版元实体使用其正常的合成通知。
        if (sample != null) sample.onCreated(aStack, aWorld, aPlayer);
    }

    /** @return null；ME 输入仓方块物品不是可携带流体的储罐物品 */
    @Override
    public FluidStack getFluid(ItemStack container) {
        // 防止 ItemMachines 按等级 Meta 误读取其他储罐机器的 NBT。
        return null;
    }

    /** @return 0；本接口表示物品容器容量，与已放置仓室的 long 网络输入能力无关 */
    @Override
    public int getCapacity(ItemStack container) {
        // 不把逻辑分片总量缩窄成 int，也不读取无关 MTE 的容量。
        return 0;
    }

    /** @return 0；背包中的 ME 仓室不接受容器灌注 */
    @Override
    public int fill(ItemStack container, FluidStack resource, boolean doFill) {
        // 保持 ME 输入与实体储液容器的原有区别，不写入任何流体 NBT。
        return 0;
    }

    /** @return null；不从仓室方块物品抽取流体 */
    @Override
    public FluidStack drain(ItemStack container, int maxDrain, boolean doDrain) {
        // 网络流体提取只发生在已放置元实体的配方结算路径。
        return null;
    }

    /** 仍由原版 ItemBlock.onItemUse 负责放置位置、权限和扣除物品；此处仅提前拒绝无效等级。 */
    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side,
        float hitX, float hitY, float hitZ) {
        // 不允许无效 Meta 经原版创建错误底座。
        if (!isValidTier(stack) || stack.stackSize <= 0) return false;
        // 在父类中动态分派到下方 placeBlockAt，是真实方块放置，不再委托另一普通 Item。
        return super.onItemUse(stack, player, world, x, y, z, side, hitX, hitY, hitZ);
    }

    /**
     * 在原版 GT 创建实际 BaseMetaTileEntity 后固定等级。
     * 
     * @param aStack 当前方块物品，damage 为真实等级
     * @param aMeta  ItemBlock 传入的 GT 底座 meta，原版 ItemMachines 自行决定实际底座类型
     * @return 方块和等级均完成设置才成功
     */
    @Override
    public boolean placeBlockAt(ItemStack aStack, EntityPlayer aPlayer, World aWorld, int aX, int aY, int aZ,
        int ordinalSide, float hitX, float hitY, float hitZ, int aMeta) {
        // 即使第三方绕过 onItemUse 直接调用，也必须拒绝非法 Meta。
        if (!isValidTier(aStack)) return false;
        // 在任何 GT 复制/初始化前固定真实等级，NBT 不得覆盖低等级物品的 Meta。
        int tierIndex = aStack.getItemDamage();
        // 原生放置代码读取机器 ID，因此为其构造仅用于调用的 GT 堆栈。
        ItemStack machineStack = SuperInputLoader.getMachineStack(isItemBus(), aStack.stackSize);
        // 覆盖板、染色、自定义标签都深复制保留，不共享调用方的可变 NBT。
        NBTTagCompound machineTag = aStack.hasTagCompound() ? (NBTTagCompound) aStack.getTagCompound()
            .copy() : new NBTTagCompound();
        // 原生加载 NBT 与 initDefaultModes 两个阶段均能读取同一权威等级。
        machineTag.setInteger(SuperInputTier.tierTag, tierIndex);
        // 临时堆栈承载完整的世界初始化标签。
        machineStack.setTagCompound(machineTag);
        // this.field_150939_a 为真实 SuperInputBlock，因此原版 GT 放置的是本方块，而非原版样板方块。
        boolean placed = super.placeBlockAt(
            machineStack,
            aPlayer,
            aWorld,
            aX,
            aY,
            aZ,
            ordinalSide,
            hitX,
            hitY,
            hitZ,
            aMeta);
        // 原版拒绝放置时不得继续操作其他方块实体。
        if (!placed) return false;
        // 必须读取世界中最终的实体，不能只修改注册样板或初始化前的克隆。
        TileEntity tile = aWorld.getTileEntity(aX, aY, aZ);
        // GT 放置流程应创建 IGregTechTileEntity，错误环境必须明确报错而非默默变 I。
        if (!(tile instanceof IGregTechTileEntity))
            throw new IllegalStateException("Missing SuperInput GT tile after placement");
        // 获取真实元实体并确认固定 ID 与类别。
        IGregTechTileEntity gtTile = (IGregTechTileEntity) tile;
        // 不能在第三方替换的其他机器上写入等级。
        SuperInputLoader.applyPlacedTier(gtTile, isItemBus(), tierIndex);
        // 服务端立即保存并发出完整描述包；客户端本地预测同样使用准确等级。
        tile.markDirty();
        // 新增 writeToStream/readFromStream 携带等级，首次观察区块也能收到准确名称/容量。
        if (!aWorld.isRemote) aWorld.markBlockForUpdate(aX, aY, aZ);
        // 数量由外层原版 ItemBlock.onItemUse 统一扣除，这里不能再扣一次。
        return true;
    }
}
