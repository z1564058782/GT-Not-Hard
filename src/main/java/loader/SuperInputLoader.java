package loader;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import gregtech.api.GregTechAPI;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import hatch.SuperInputBlock;
import hatch.SuperInputBusME;
import hatch.SuperInputHatchME;
import hatch.SuperInputTier;
import hatch.SuperInputTierItem;

/** 两个真实 GT 机器方块、固定 MTE ID、17 个子类型及兼容掉落的统一注册入口。 */
public final class SuperInputLoader {

    /** 用户要求保留的物品总线 MTE ID，不随等级递增。 */
    public static final int superInputBusMeId = 25568;
    /** 用户要求保留的流体仓 MTE ID。 */
    public static final int superInputHatchMeId = 25569;
    /** 总线真实方块，自动关联 ItemMachines 方块物品，17 级不额外占用 MTE ID。 */
    public static SuperInputBlock superInputBusMeBlock;
    /** 流体仓真实方块，世界元实体仍为 GT BaseMetaTileEntity。 */
    public static SuperInputBlock superInputHatchMeBlock;
    /** 真实物品注册项，damage=0～16 对应 I～XVII。 */
    public static SuperInputTierItem superInputBusMeItem;
    /** 流体仓使用独立物品注册项，避免与总线 Meta 混淆。 */
    public static SuperInputTierItem superInputHatchMeItem;
    /** 机器注册样板，只注册两个，绝不按等级创建 34 个 MTE ID。 */
    public static SuperInputBusME superInputBusMe;
    /** 流体仓注册样板。 */
    public static SuperInputHatchME superInputHatchMe;

    /** 事件总线需要一个监听实例，生产代码不进行玩家背包逐 tick 扫描。 */
    private SuperInputLoader() {}

    /** 保留已有入口名称；preInit 改为注册实际方块及其 ItemMachines，机器仍在 init 注册。 */
    public static void registerItems() {
        // 与 Mod 原有加载习惯一致，重复调用直接复用已有注册项。
        if (superInputBusMeItem != null) return;
        // GTGenericBlock 自动 registerBlock 并创建关联 ItemMachines，不能再 registerItem。
        superInputBusMeBlock = new SuperInputBlock(true);
        // 从 Forge 实际的 Block→Item 关联取得方块物品，避免出现平面物品与方块两个独立注册项。
        superInputBusMeItem = (SuperInputTierItem) Item.getItemFromBlock(superInputBusMeBlock);
        // 流体仓使用独立的真实 Block，但共享所有分片和等级处理方法。
        superInputHatchMeBlock = new SuperInputBlock(false);
        // 旧 registry 名保持一致，已有背包中的 0～16 Meta 可由同名 ItemBlock 接续读取。
        superInputHatchMeItem = (SuperInputTierItem) Item.getItemFromBlock(superInputHatchMeBlock);
        // 仅监听破坏和掉落实体生成，不创建周期任务。
        MinecraftForge.EVENT_BUS.register(new SuperInputLoader());
    }

    /** init 检查并注册两个固定机器 ID；不覆盖已有占用。 */
    public static void registerMachines() {
        // 重复初始化时保留原样板，避免触发 GT 重复 ID 注册。
        if (superInputBusMe != null) return;
        // 物品必须先于机器注册，GT 构造器可立即调用 getStackForm。
        if (superInputBusMeItem == null) throw new IllegalStateException("Register SuperInput items in preInit first");
        // 在任何注册之前一次检查两个固定 ID。
        if (GregTechAPI.METATILEENTITIES[superInputBusMeId] != null
            || GregTechAPI.METATILEENTITIES[superInputHatchMeId] != null) {
            // 不擅自换 ID；整合包存在冲突时需要解决原有占用。
            throw new IllegalStateException("SuperInput requires free GT MTE IDs 25568 and 25569");
        }
        // 继承高级 ME 总线功能，自动拉取功能保持启用。
        superInputBusMe = new SuperInputBusME(superInputBusMeId, true, "superInputBusMe", "Super Input Bus I (ME)");
        // 仓室共用相同等级规则，世界 ID 为固定 25569。
        superInputHatchMe = new SuperInputHatchME(
            superInputHatchMeId,
            true,
            "superInputHatchMe",
            "Super Input Hatch I (ME)");
        // 输出物品已可用，按等级注册生存配方。
        SuperInputRecipeLoader.registerRecipes();
    }

    /** @return 指定类别、Meta 和数量的可放置子类型物品 */
    public static ItemStack getStack(boolean itemBus, int tierIndex, long amount) {
        // 禁止非法 Meta 被位移计算截断。
        SuperInputTier.checkTierIndex(tierIndex);
        // ItemStack.stackSize 仍是 int；long 能力指输入数量，不是物品堆叠字段。
        if (amount < 0 || amount > Integer.MAX_VALUE) throw new IllegalArgumentException("Invalid item stack amount");
        // 根据类别选择唯一注册物品。
        Item item = itemBus ? superInputBusMeItem : superInputHatchMeItem;
        // 加载顺序错误立即报告，不返回空物品作为配方输出。
        if (item == null) throw new IllegalStateException("SuperInput items are not registered");
        // Meta 表示等级，不是世界 MTE ID。
        ItemStack stack = new ItemStack(item, (int) amount, tierIndex);
        // NBT 同时记录等级，便于外部工具读取和原生 GT 掉落转换。
        NBTTagCompound tag = new NBTTagCompound();
        // 子类型放置时仍会以 damage 为权威重新写入。
        tag.setInteger(SuperInputTier.tierTag, tierIndex);
        // 附加独立标签，不复用全局可变 NBT。
        stack.setTagCompound(tag);
        // 返回完整物品。
        return stack;
    }

    /** @return 用于委托 GT 原生放置的临时机器物品，damage 为固定 MTE ID */
    public static ItemStack getMachineStack(boolean itemBus, int amount) {
        // 必须使用 GT 机器方块关联物品，不能把子类型物品再次递归委托给自己。
        return new ItemStack(GregTechAPI.sBlockMachines, amount, itemBus ? superInputBusMeId : superInputHatchMeId);
    }

    /** @return 类别对应的固定 GT 元实体 ID，与等级 Meta 分开 */
    public static int getMachineId(boolean itemBus) {
        // 只注册两个 ID，I～XVII 的物品 damage 不参与本计算。
        return itemBus ? superInputBusMeId : superInputHatchMeId;
    }

    /**
     * 对原版放置完成后的最终世界实体设置等级，拒绝错误 ID 或错误仓室类别。
     * 
     * @param gtTile    世界中真实 GT 底座，不能传注册样板
     * @param itemBus   放置物品的类别
     * @param tierIndex 放置物品的权威 Meta，0～16
     */
    public static void applyPlacedTier(IGregTechTileEntity gtTile, boolean itemBus, int tierIndex) {
        // 先验证 Meta，避免所有非法值都被强行转换为 I。
        SuperInputTier.checkTierIndex(tierIndex);
        // ID 必须匹配，即使其他 Mod 在放置中替换了元实体也不能静默写入。
        if (gtTile.getMetaTileID() != getMachineId(itemBus)) {
            // 在实际放置路径中明确暴露错误，便于定位冲突。
            throw new IllegalStateException("Unexpected GT ID in placed SuperInput tile");
        }
        // 总线继承正确父类，同时保留扩展输入收集和网络代理。
        if (itemBus && gtTile.getMetaTileEntity() instanceof SuperInputBusME) {
            // 修改最终新实例，不修改全局注册样板。
            ((SuperInputBusME) gtTile.getMetaTileEntity()).setTierIndex(tierIndex);
        } else if (!itemBus && gtTile.getMetaTileEntity() instanceof SuperInputHatchME) {
            // 同样设置实际流体仓实例的等级。
            ((SuperInputHatchME) gtTile.getMetaTileEntity()).setTierIndex(tierIndex);
        } else {
            // 错误元实体类型不得伪装为一个可正常工作的 I 级仓室。
            throw new IllegalStateException("Unexpected MTE class in placed SuperInput tile");
        }
    }

    /** @return GT 原生掉落的等价子类型物品；不相关物品返回原引用 */
    public static ItemStack convertMachineDrop(ItemStack stack) {
        // 第一层只比较物品身份，绝大多数世界掉落在此直接返回。
        if (stack == null || stack.getItem() != Item.getItemFromBlock(GregTechAPI.sBlockMachines)) return stack;
        // 只转换本实现的两个固定 ID。
        int machineId = stack.getItemDamage();
        // 原版及其他 Mod 的机器不会被接触。
        if (machineId != superInputBusMeId && machineId != superInputHatchMeId) return stack;
        // 保存原生 GT 物品标签；无键的旧 64 片物品迁移为 III 级。
        NBTTagCompound tag = stack.getTagCompound();
        // 缺键与损坏索引分开处理，避免旧存档容量回退。
        int tierIndex = tag != null && tag.hasKey(SuperInputTier.tierTag) ? tag.getInteger(SuperInputTier.tierTag)
            : SuperInputTier.legacyTierIndex;
        // 损坏数据按 I 级处理。
        if (tierIndex < 0 || tierIndex >= SuperInputTier.tierCount) tierIndex = 0;
        // 真实子类型 damage 恢复为等级。
        ItemStack converted = getStack(machineId == superInputBusMeId, tierIndex, stack.stackSize);
        // 覆盖板及自定义标签必须完整保留。
        if (tag != null) converted.setTagCompound((NBTTagCompound) tag.copy());
        // 规范化迁移后等级键。
        converted.getTagCompound()
            .setInteger(SuperInputTier.tierTag, tierIndex);
        // 转换不改变数量。
        return converted;
    }

    /** 将正常方块破坏掉落规范化为子类型；不扫描世界或背包。 */
    @SubscribeEvent
    public void onHarvestDrops(HarvestDropsEvent event) {
        // 修改事件现有列表，只处理确实产生的掉落。
        for (int dropIndex = 0; dropIndex < event.drops.size(); dropIndex++) {
            // 无关物品直接返回同一个对象，避免额外分配。
            event.drops.set(dropIndex, convertMachineDrop(event.drops.get(dropIndex)));
        }
    }

    /** 补足扳手、爆炸或其他绕过 HarvestDropsEvent 的 EntityItem 掉落路径。 */
    @SubscribeEvent
    public void onEntityJoinWorld(EntityJoinWorldEvent event) {
        // 只在服务端转换物品实体，客户端使用服务器同步的物品。
        if (event.world.isRemote || !(event.entity instanceof EntityItem)) return;
        // 类型检查后安全转换。
        EntityItem entityItem = (EntityItem) event.entity;
        // 只对真实转换结果调用 setter，普通世界实体没有额外同步。
        ItemStack original = entityItem.getEntityItem();
        // 转换函数先按物品身份和两个 ID 快速拒绝。
        ItemStack converted = convertMachineDrop(original);
        // 不相关掉落维持原引用。
        if (converted != original) entityItem.setEntityItemStack(converted);
    }
}
