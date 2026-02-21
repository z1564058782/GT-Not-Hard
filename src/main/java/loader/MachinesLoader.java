package loader;

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

    public static void loaderMachines() {
        ChaosMain = new Chaos(25565, "Chaos", "Chaos").getStackForm(1);
        OriginMain = new Origin(25566, "Origin", "Origin").getStackForm(1);
        SingularityMain = new Singularity(25567, "Singularity", "Singularity").getStackForm(1);
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
}
