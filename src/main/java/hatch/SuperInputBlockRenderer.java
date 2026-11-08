package hatch;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.world.IBlockAccess;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import gregtech.common.render.GTRendererBlock;
import loader.SuperInputLoader;

/** 只映射背包 damage，全部机器外壳与 ME 覆盖层交给 GT 原版三维方块渲染器。 */
@SideOnly(Side.CLIENT)
public final class SuperInputBlockRenderer implements ISimpleBlockRenderingHandler {

    /** GT 现有渲染实现，既不复制其顶点代码也不加载二维平面图标。 */
    private final GTRendererBlock renderer = new GTRendererBlock();

    /** 客户端 preInit 注册一次；CommonProxy 和专用服务器均不引用本类。 */
    public static void register() {
        // 客户端代理重复调用也不能创建重复渲染 ID。
        if (SuperInputBlock.blockRenderId != 0) return;
        // 为两类真实方块分配共用的渲染 ID。
        SuperInputBlock.blockRenderId = RenderingRegistry.getNextAvailableRenderId();
        // 方块只需要一个映射处理器，与 17 个等级数量无关。
        RenderingRegistry.registerBlockHandler(new SuperInputBlockRenderer());
    }

    /** 在物品栏中以对应固定 GT ID 的原版机器纹理绘制完整立方体。 */
    @Override
    public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderBlocks) {
        // metadata 是 0～16 等级，GT 原渲染函数的参数却是 MTE ID，必须显式转换。
        boolean itemBus = ((SuperInputBlock) block).isItemBus();
        // 同一类别各级使用原版相同外壳/ME 覆盖层，名称和容量由各自 Meta 区分。
        renderer.renderInventoryBlock(block, SuperInputLoader.getMachineId(itemBus), modelId, renderBlocks);
    }

    /** 世界渲染直接读取真实 GT 实体纹理、朝向、染色和覆盖板。 */
    @Override
    public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId,
        RenderBlocks renderBlocks) {
        // 真实方块继承 BlockMachines，满足原版渲染器对类型和实体的要求。
        return renderer.renderWorldBlock(world, x, y, z, block, modelId, renderBlocks);
    }

    /** @return true，使物品栏、手持与掉落都沿用三维机器方块模型 */
    @Override
    public boolean shouldRender3DInInventory(int modelId) {
        return true;
    }

    /** @return 由客户端注册器分配的映射渲染 ID */
    @Override
    public int getRenderId() {
        return SuperInputBlock.blockRenderId;
    }
}
