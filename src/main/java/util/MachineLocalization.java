package util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.StatCollector;

public final class MachineLocalization {

    private MachineLocalization() {}

    public static String translateMode(String mode) {
        if (mode == null || mode.isEmpty()) {
            return StatCollector.translateToLocal("gtnothard.state.none");
        }
        String key = "gtnothard.mode." + mode;
        return StatCollector.canTranslate(key) ? StatCollector.translateToLocal(key) : mode;
    }

    public static void sendMode(EntityPlayer player, String mode) {
        // Translate on the receiving client, not in the server's language.
        player.addChatMessage(
            new ChatComponentTranslation(
                "gtnothard.chat.mode",
                new ChatComponentTranslation("gtnothard.mode." + mode)));
    }
}
