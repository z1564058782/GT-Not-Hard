package com.mofoga.gtnothard;

import net.minecraftforge.common.MinecraftForge;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import hatch.SuperInputBlockRenderer;

public class ClientProxy extends CommonProxy {

    // Override CommonProxy methods here, if you want a different behaviour on the client (e.g. registering renders).
    // Don't forget to call the super methods as well.

    /** 注册真实机器方块的三维渲染；专用服务器只创建 CommonProxy，不加载客户端渲染类。 */
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        // 先运行现有方块/物品注册、配置与日志流程，保留原来的生命周期顺序。
        super.preInit(event);
        // 只把等级 damage 映射为固定 MTE 纹理 ID，绘制仍由 GT 原版执行。
        SuperInputBlockRenderer.register();
        MinecraftForge.EVENT_BUS.register(new SuperHatchCreativeFilter());
    }

}
