package loader;

import net.minecraft.item.Item;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemLoader {

    public ItemLoader(FMLPreInitializationEvent event) {
        // preInit 注册两个具有 0～16 Meta 的可放置物品，不改变原有 register 方法。
        SuperInputLoader.registerItems();

    }

    public static void register(Item item, String name) {
        GameRegistry.registerItem(item, name);
    }
}
