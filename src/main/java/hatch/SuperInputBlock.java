package hatch;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.common.blocks.BlockMachines;
import gregtech.common.blocks.MaterialMachines;
import loader.SuperInputLoader;

/**
 * 两种仓室的真实 GT 机器方块。继承原版碰撞、扳手、覆盖板、GUI、掉落、红石、机器更新和 AE 交互。
 * ItemMachines 使用等级 Meta；世界四位 metadata 只保存 GT 底座类型，完整 17 级由元实体 NBT 保存。
 */
public final class SuperInputBlock extends BlockMachines {

    /** 客户端初始化注册的渲染 ID；服务端无需加载任何客户端渲染类。 */
    public static int blockRenderId;
    /** true 是总线方块，false 是流体仓方块。 */
    private final boolean itemBus;

    /**
     * 自动通过 GTGenericBlock 注册 Block 与关联 ItemBlock，不能再额外 registerItem。
     * 
     * @param itemBus 方块类别；不会为每级额外注册世界方块或 MTE ID
     */
    public SuperInputBlock(boolean itemBus) {
        // GTGenericBlock 会调用公开的 SuperInputTierItem(Block) 构造器并登记相同注册名称。
        super(SuperInputTierItem.class, itemBus ? "superInputBusMe" : "superInputHatchMe", new MaterialMachines());
        // 必须在父构造完成后保存；物品不能在其构造期间缓存这个值。
        this.itemBus = itemBus;
        setCreativeTab(SuperHatchCreativeTab.INSTANCE);
    }

    /** @return 本方块对应的仓室类别 */
    public boolean isItemBus() {
        return itemBus;
    }

    /** @return 本方块自己的注册名，不能继承 BlockMachines 硬编码的 gt.blockmachines */
    @Override
    public String getUnlocalizedName() {
        // GTGenericBlock 在注册前已给此受保护字段赋值，父构造器动态调用时也安全。
        return mUnlocalizedName;
    }

    /** @return 映射物品 Meta 到固定 GT 样板纹理的专用渲染 ID */
    @Override
    public int getRenderType() {
        return blockRenderId;
    }

    /** 纹理由原版 GT 机器方块统一注册，不能让两个附加方块重复跑整个 GT 图标加载队列。 */
    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister aIconRegister) {
        // 所有 casing 与 ME 覆盖纹理都来自继承的原版元实体，无新增二维物品图标。
    }

    /** 创造栏和 NEI 枚举本类别的 17 个实际方块子类型。 */
    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(Item item, CreativeTabs aCreativeTab, List<ItemStack> outputSubBlocks) {
        if (aCreativeTab != null && aCreativeTab != SuperHatchCreativeTab.INSTANCE
            && aCreativeTab != CreativeTabs.tabAllSearch) return;
        // 只枚举等级数，不枚举理论分片数或全 GT MTE 注册表。
        for (int tierIndex = 0; tierIndex < SuperInputTier.tierCount; tierIndex++) {
            // ItemBlock 实例与 this 方块关联，damage 保持 0～16。
            outputSubBlocks.add(SuperInputLoader.getStack(itemBus, tierIndex, 1));
        }
    }

    /** 原版破坏流程结束时直接返回对应方块物品，避免依赖 EntityItem 事件才恢复等级。 */
    @Override
    public ArrayList<ItemStack> getDrops(World aWorld, int aX, int aY, int aZ, int aMeta, int aFortune) {
        // 父类负责覆盖板、物理库存、缓存实体和原版销毁回调，不能复制或跳过这些行为。
        ArrayList<ItemStack> drops = super.getDrops(aWorld, aX, aY, aZ, aMeta, aFortune);
        // 父类 BaseMetaTileEntity.getDrops 仍返回 GT 原生机器栈，在这里无损转换为本方块 ItemBlock。
        for (int dropIndex = 0; dropIndex < drops.size(); dropIndex++) {
            // 转换保留完整标签和数量，不相关物理库存保持原引用。
            drops.set(dropIndex, SuperInputLoader.convertMachineDrop(drops.get(dropIndex)));
        }
        // 所有掉落已是准确的方块子类型。
        return drops;
    }

    /** 创造模式中键直接读取世界元实体等级，不能返回注册样板 I。 */
    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z, EntityPlayer player) {
        // getStackForm 已返回本方块的真实等级物品；不调用有销毁副作用的 getDrops。
        TileEntity tile = world.getTileEntity(x, y, z);
        // 方块刚加载尚无实体时仅返回本类别 I 级，正常路径读取实际元实体。
        if (!(tile instanceof IGregTechTileEntity)) return SuperInputLoader.getStack(itemBus, 0, 1);
        // 本方法不保存或重建元实体。
        IGregTechTileEntity gtTile = (IGregTechTileEntity) tile;
        // 正常结构的元实体提供精确等级及正确 ItemBlock。
        return gtTile.getMetaTileEntity() == null ? SuperInputLoader.getStack(itemBus, 0, 1)
            : gtTile.getMetaTileEntity()
                .getStackForm(1);
    }

    /** @return 实际等级 Meta，供原版选取方块及信息工具使用 */
    @Override
    public int getDamageValue(World aWorld, int aX, int aY, int aZ) {
        // 用中键同一路径读取；不能把底座 metadata 或固定 MTE ID 当成等级。
        return getPickBlock(null, aWorld, aX, aY, aZ, null).getItemDamage();
    }
}
