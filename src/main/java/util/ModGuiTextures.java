package util;

import com.gtnewhorizons.modularui.api.drawable.IDrawable;
import com.gtnewhorizons.modularui.api.drawable.UITexture;

import gregtech.api.enums.Mods;

/**
 * GTNH 2.9.0 适配说明：
 * <p>
 * 从 GTNH 2.9.0（GT5-Unofficial 5.09.54.x）开始，KekzTech 已被整体并入 GT5-Unofficial，
 * 原来的 {@code kekztech.client.gui.KTUITextures} 类被删除，但贴图资源仍然保留在 GT5 的
 * {@code assets/kekztech/textures/gui/overlay_button/} 目录下。
 * <p>
 * 因此这里用 ModularUI 1 的 {@link UITexture} 重新指向同一批资源文件，保持按钮外观不变。
 * 供 {@code machines.Chaos} 与 {@code machines.Origin} 的无线模式按钮共用。
 */
public final class ModGuiTextures {

    private static final String OVERLAY_BUTTON_DIR = "gui/overlay_button/";

    /** 无线模式按钮：开启状态 */
    public static final IDrawable OVERLAY_BUTTON_WIRELESS_ON = UITexture
        .fullImage(Mods.ModIDs.KEKZ_TECH, OVERLAY_BUTTON_DIR + "wireless_on");

    /** 无线模式按钮：关闭状态 */
    public static final IDrawable OVERLAY_BUTTON_WIRELESS_OFF = UITexture
        .fullImage(Mods.ModIDs.KEKZ_TECH, OVERLAY_BUTTON_DIR + "wireless_off");

    private ModGuiTextures() {}
}
