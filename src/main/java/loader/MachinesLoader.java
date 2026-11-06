package loader;

import net.minecraft.item.ItemStack;

import machines.Chaos;
import machines.Origin;
import machines.Singularity;

public class MachinesLoader {

    public static ItemStack ChaosMain;
    public static ItemStack OriginMain;
    public static ItemStack SingularityMain;

    public static void loaderMachines() {
        ChaosMain = new Chaos(25565, "Chaos", "Chaos").getStackForm(1);
        OriginMain = new Origin(25566, "Origin", "Origin").getStackForm(1);
        SingularityMain = new Singularity(25567, "Singularity", "Singularity").getStackForm(1);
    }
}
