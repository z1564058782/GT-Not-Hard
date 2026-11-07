package loader;

import hatch.SuperInputBusME;
import hatch.SuperInputHatchME;
import net.minecraft.item.ItemStack;

import machines.Chaos;
import machines.Origin;
import machines.Singularity;
// import net.minecraft.item.ItemStack;

public class MachinesLoader {

    public static ItemStack ChaosMain;
    public static ItemStack OriginMain;
    public static ItemStack SingularityMain;

    public static gregtech.api.metatileentity.MetaTileEntity SuperInputBusME;
    public static gregtech.api.metatileentity.MetaTileEntity AdvancedSuperInputBusME;

    /** 新总线的 GT 元实体 ID；整合包已有占用时只修改这个新增常量，发布后不得随意变更。 */
    public static final int superInputBusMeId = 25568;

    /** 新流体仓的 GT 元实体 ID；必须与总线 ID 不同，且在整合包内唯一。 */
    public static final int superInputHatchMeId = 25569;

    /** 新流体仓的注册样板；使用独立字段，不重命名已有 SuperInputBusME 字段。 */
    public static gregtech.api.metatileentity.MetaTileEntity superInputHatchMe;

    /** 可供配方或其他注册器引用的大数量 ME 物品总线物品。 */
    public static ItemStack superInputBusMeStack;

    /** 可供配方或其他注册器引用的大数量 ME 流体输入仓物品。 */
    public static ItemStack superInputHatchMeStack;

    /** 注册本 Mod 的机器和新增仓室；既有变量、方法名称和旧注释均保留。 */
    public static void loaderMachines() {
        ChaosMain = new Chaos(25565, "Chaos", "Chaos").getStackForm(1);
        OriginMain = new Origin(25566, "Origin", "Origin").getStackForm(1);
        SingularityMain = new Singularity(25567, "Singularity", "Singularity").getStackForm(1);
        // 在创建任何新增元实体之前检查两个 ID，冲突时给出明确错误，不能覆盖其他 Mod 的机器。
        ensureSuperInputIdFree(superInputBusMeId);
        // 单独检查流体仓 ID，避免只成功注册总线后才发现流体仓冲突。
        ensureSuperInputIdFree(superInputHatchMeId);
        // 使用原有 SuperInputBusME 字段；true 同时保留原版高级总线的自动拉取能力。
        SuperInputBusME = new SuperInputBusME(
            superInputBusMeId,
            true,
            "superInputBusMe",
            "Super Input Bus (ME)");
        // 通过独立新增字段保存流体仓样板，同样启用原版自动拉取功能。
        superInputHatchMe = new SuperInputHatchME(
            superInputHatchMeId,
            true,
            "superInputHatchMe",
            "Super Input Hatch (ME)");
        // 取得总线的实际可放置物品，便于配方或调试工具使用。
        superInputBusMeStack = SuperInputBusME.getStackForm(1);
        // 取得流体仓的实际可放置物品。
        superInputHatchMeStack = superInputHatchMe.getStackForm(1);
        // 新增生存升级配方必须在两个输出物品都已取得之后注册。
        SuperInputRecipeLoader.registerRecipes();
        /*
         * // 注册基础版SuperInputBus(ME) - 不支持自动拉取
         * SuperInputBusME = new SuperDualInputHatchME(
         * 25568, // ID
         * "SuperDualInputHatchME",
         * StatCollector.translateToLocal("SuperDualInputHatchME"),
         * 9,
         * true
         * );
         * // 注册高级版SuperInputBus(ME) - 支持自动拉取
         * AdvancedSuperInputBusME = new SuperInputBus(
         * 25569, // ID
         * true, // autoPullAvailable
         * "gt.superinputbus.me.advanced", // 名称
         * "Advanced Super Input Bus (ME)" // 区域化名称
         * );
         */
    }

    /**
     * 在 GT 全局注册表中检查新增 ID 的范围与占用情况。
     *
     * @param metaTileId 准备分配给新增仓室的 ID
     * @throws IllegalStateException ID 超出范围或已被其他机器占用时中止加载
     */
    private static void ensureSuperInputIdFree(int metaTileId) {
        // 先检查范围，避免错误配置导致数组越界。
        if (metaTileId <= 0 || metaTileId >= gregtech.api.GregTechAPI.METATILEENTITIES.length) {
            // 提示用户修正新增常量，不让游戏继续创建无效机器。
            throw new IllegalStateException("SuperInput MetaTileEntity ID out of range: " + metaTileId);
        }
        // 已有注册项可能属于整合包内其他 Mod，不能静默覆盖。
        if (gregtech.api.GregTechAPI.METATILEENTITIES[metaTileId] != null) {
            // 明确指出冲突 ID；用户在接入文档指定位置选择空闲 ID。
            throw new IllegalStateException("SuperInput MetaTileEntity ID already occupied: " + metaTileId);
        }
    }
}
