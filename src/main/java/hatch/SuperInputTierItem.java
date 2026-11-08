package hatch;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import loader.SuperInputLoader;

/**
 * 真正以 damage=0～16 区分等级的可放置物品。
 * GT 的机器物品 damage 已经表示 25568/25569，不能再将同一个字段用于等级；
 * 本物品在放置时委托 GT 原生 ItemMachines，保留权限、朝向、归属和 AE 安全处理。
 */
public final class SuperInputTierItem extends Item {

    /** true 为物品总线，false 为流体仓；两者分别注册独立物品名称。 */
    private final boolean itemBus;

    /** 构造子类型物品；GT 元实体仍由机器加载阶段单独注册。 */
    public SuperInputTierItem(boolean itemBus) {
        // 保存类别，不把它编码进等级 Meta。
        this.itemBus = itemBus;
        // 开启原版子类型，使配方和背包严格区分各级 damage。
        setHasSubtypes(true);
        // damage 是等级而非耐久。
        setMaxDamage(0);
        // 相同等级可以正常堆叠，不同等级不会合并。
        setMaxStackSize(64);
        // 使用本 Mod 独立命名，不覆盖 GT 的原版机器物品。
        setUnlocalizedName(itemBus ? "superInputBusMe" : "superInputHatchMe");
        // 图标为随交付附带的 GT 原版 ME 覆盖层资源副本。
        setTextureName(itemBus ? "gtnothard:superInputBusMe" : "gtnothard:superInputHatchMe");
        // 在创造栏展示所有等级，NEI 也可枚举这些真实子类型。
        setCreativeTab(CreativeTabs.tabRedstone);
    }

    /** @return 指定物品 Meta 是否对应已定义等级 */
    private boolean isValidTier(ItemStack stack) {
        // 非法指令或存档 damage 不得静默转换为高等级。
        return stack != null && stack.getItemDamage() >= 0 && stack.getItemDamage() < SuperInputTier.tierCount;
    }

    /** @return 明确包含罗马数字等级的显示名称 */
    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        // 无效 Meta 仍可被管理员识别，但不能放置。
        if (!isValidTier(stack)) return "Invalid Super Input (ME)";
        // 按用户指定的英文命名格式逐级生成，不依赖 34 条重复名称常量。
        return "Super Input " + (itemBus ? "Bus " : "Hatch ")
            + SuperInputTier.getTierName(stack.getItemDamage())
            + " (ME)";
    }

    /** 向创造栏/NEI 提供全部 17 个子类型。 */
    @Override
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void getSubItems(Item item, CreativeTabs tab, List stacks) {
        // 仅枚举 17 个物品；与每级理论分片数无关。
        for (int tierIndex = 0; tierIndex < SuperInputTier.tierCount; tierIndex++) {
            // 等级以真实 damage 存储；NBT 在放置前由权威 Meta 写入。
            stacks.add(new ItemStack(this, 1, tierIndex));
        }
    }

    /** 显示准确整数容量、分片数和 GT 世界机器 ID。 */
    @Override
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean advanced) {
        // 不对损坏 Meta 执行容量位移运算。
        if (!isValidTier(stack)) {
            lines.add("Invalid tier Meta: " + stack.getItemDamage());
            return;
        }
        // ItemStack.damage 是物品形态唯一权威等级，不能借伪造 NBT 升级。
        int tierIndex = stack.getItemDamage();
        // 明确片数和每片 int 上限，说明压缩表示并没有取消独立片语义。
        lines.add("Independent shards: " + SuperInputTier.getShardCount(tierIndex) + " x " + Integer.MAX_VALUE);
        // 流体容量以 mB 而非桶显示。
        lines.add(
            "Input per resource/check: " + SuperInputTier.getMaxInputAmount(tierIndex) + (itemBus ? " items" : " mB"));
        // 提示该能力需要控制器使用相应 long 配方逻辑。
        lines.add("Requires SuperInputProcessingLogic in the controller");
        // 显示逻辑 ID:Meta，实际注册名和命令见 README。
        lines.add(
            "GT MTE: " + (itemBus ? SuperInputLoader.superInputBusMeId : SuperInputLoader.superInputHatchMeId)
                + ":"
                + tierIndex);
    }

    /** 委托原版 GT 机器物品完成放置；保留完整 NBT 和精确物品数量变化。 */
    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side,
        float hitX, float hitY, float hitZ) {
        // 拒绝无效等级及空堆栈，不能消耗物品后才发现错误。
        if (!isValidTier(stack) || stack.stackSize <= 0) return false;
        // 创建 GT 原生机器物品，damage 只存固定 MTE ID。
        ItemStack machineStack = SuperInputLoader.getMachineStack(itemBus, stack.stackSize);
        // 保留覆盖板、名称等原有物品 NBT，不与调用方共享可变标签。
        NBTTagCompound machineTag = stack.hasTagCompound() ? (NBTTagCompound) stack.getTagCompound()
            .copy() : new NBTTagCompound();
        // 子类型 Meta 覆盖旧 NBT，避免 Meta I + NBT XVII 被放成高等级。
        machineTag.setInteger(SuperInputTier.tierTag, stack.getItemDamage());
        // GT 的 setInitialValuesAsNBT 会将此等级加载到世界元实体。
        machineStack.setTagCompound(machineTag);
        // 使用 GT 原版放置代码，避免复制其权限、归属、朝向和连接逻辑。
        boolean placed = machineStack.getItem()
            .onItemUse(machineStack, player, world, x, y, z, side, hitX, hitY, hitZ);
        // 完全沿用委托后的数量，创造模式和失败操作也保持原版行为。
        stack.stackSize = machineStack.stackSize;
        // 返回原版放置结果。
        return placed;
    }
}
