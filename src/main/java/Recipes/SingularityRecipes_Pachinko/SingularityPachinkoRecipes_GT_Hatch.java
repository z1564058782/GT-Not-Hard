package Recipes.SingularityRecipes_Pachinko;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

public class SingularityPachinkoRecipes_GT_Hatch {

    public static final Map<Integer, ItemStack[]> PachinkoRecipes_GT_Hatch = new HashMap<>();

    public static void addPachinkoRecipes_GT_Hatch() {
        // Steam Tier
        // "Steam Hatch" - 31040
        PachinkoRecipes_GT_Hatch.put(
            31040,
            new ItemStack[] {
                // "Input Bus (Steam)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31046),
                // "Output Bus (Steam)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31047),
                // "Steam Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31040) });

        // ULV Tier
        // "ULV Energy Hatch" - 40
        PachinkoRecipes_GT_Hatch.put(
            40,
            new ItemStack[] {
                // "ULV Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30),
                // "ULV Dynamo Hatch [Buffered]"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 899),
                // "ULV Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 40),
                // "ULV Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 206),
                // "Input Hatch (ULV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 50),
                // "Output Hatch (ULV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 60),
                // "Output Hatch (ULV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 70),
                // "Output Bus (ULV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 80) });

        // LV Tier
        // "LV Energy Hatch" - 41
        PachinkoRecipes_GT_Hatch.put(
            41,
            new ItemStack[] {
                // "LV Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31),
                // "LV Dynamo Hatch [Buffered]"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 900),
                // "LV Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 41),
                // "LV Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 207),
                // "Input Hatch (LV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 51),
                // "Output Hatch (LV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 61),
                // "Input Bus (LV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 71),
                // "Output Bus (LV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 81),
                // "Muffler Hatch (LV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 91),
                // "Advanced Muffler Hatch (LV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30001),
                // "Super Bus (I) (LV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30022),
                // "Super Bus (O) (LV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30032) });

        // MV Tier
        // "MV Energy Hatch" - 42
        PachinkoRecipes_GT_Hatch.put(
            42,
            new ItemStack[] {
                // "MV Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32),
                // "MV Dynamo Hatch [Buffered]"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 901),
                // "MV Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 42),
                // "MV Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 208),
                // "Input Hatch (MV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 52),
                // "Output Hatch (MV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 62),
                // "Input Bus (MV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 72),
                // "Output Bus (MV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 82),
                // "Muffler Hatch (MV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 92),
                // "Advanced Muffler Hatch (MV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30002),
                // "Charging Bus (MV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 886),
                // "Discharging Bus (MV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 888),
                // "Super Bus (I) (MV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30023),
                // "Super Bus (O) (MV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30033) });

        // HV Tier
        // "HV Energy Hatch" - 43
        PachinkoRecipes_GT_Hatch.put(
            43,
            new ItemStack[] {
                // "HV Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 33),
                // "HV Dynamo Hatch [Buffered]"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 902),
                // "HV Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 43),
                // "HV Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 209),
                // "Input Hatch (HV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 53),
                // "Output Hatch (HV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 63),
                // "Input Bus (HV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 73),
                // "Stocking Input Bus (ME)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 2718),
                // "Output Bus (HV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 83),
                // "Muffler Hatch (HV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 93),
                // "Advanced Muffler Hatch (HV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30003),
                // "Super Bus (I) (HV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30024),
                // "Super Bus (O) (HV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30034) });

        // EV Tier
        // "EV Energy Hatch" - 44
        PachinkoRecipes_GT_Hatch.put(
            44,
            new ItemStack[] {
                // "EV Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 34),
                // "EV Dynamo Hatch [Buffered]"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 903),
                // "EV 4A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15209),
                // "EV 16A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15219),
                // "EV 64A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15229),
                // "EV Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 44),
                // "EV Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 216),
                // "EV 4A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15065),
                // "EV 16A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15066),
                // "EV 64A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15067),
                // "EV 4A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15109),
                // "EV 16A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15119),
                // "EV 64A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15129),
                // "Input Hatch (EV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 54),
                // "Quadruple Input Hatch (EV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 200),
                // "Output Hatch (EV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 64),
                // "Input Bus (EV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 74),
                // "Output Bus (EV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 84),
                // "Muffler Hatch (EV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 94),
                // "Advanced Muffler Hatch (EV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30004),
                // "Charging Bus (EV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 887),
                // "Discharging Bus (EV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 889),
                // "Super Bus (I) (EV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30025),
                // "Super Bus (O) (EV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30035) });

        // IV Tier
        // "IV Energy Hatch" - 45
        PachinkoRecipes_GT_Hatch.put(
            45,
            new ItemStack[] {
                // "IV Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 35),
                // "IV 4A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15200),
                // "IV 16A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15210),
                // "IV 64A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15220),
                // "IV Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 45),
                // "IV Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 217),
                // "IV 4A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15068),
                // "IV 16A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15069),
                // "IV 64A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15070),
                // "IV 4A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15100),
                // "IV 16A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15110),
                // "IV 64A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15120),
                // "Input Hatch (IV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 55),
                // "Quadruple Input Hatch (IV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 710),
                // "Output Hatch (IV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 65),
                // "Input Bus (IV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 75),
                // "Output Bus (IV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 85),
                // "Muffler Hatch (IV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 95),
                // "Advanced Muffler Hatch (IV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30005),
                // "Air Intake Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 861),
                // "IV 256A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15130),
                // "IV 256A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15230),
                // "Super Bus (I) (IV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30026),
                // "Super Bus (O) (IV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30036) });

        // LuV Tier
        // "LuV Energy Hatch" - 46
        PachinkoRecipes_GT_Hatch.put(
            46,
            new ItemStack[] {
                // "LuV Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 36),
                // "LuV Dynamo Hatch [Buffered]"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 905),
                // "LuV 4A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15201),
                // "LuV 16A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15211),
                // "LuV 64A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15221),
                // "LuV Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 46),
                // "LuV Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 218),
                // "LuV 4A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15071),
                // "LuV 16A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15072),
                // "LuV 16A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15073),
                // "LuV 4A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15101),
                // "LuV 16A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15111),
                // "LuV 64A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15121),
                // "Input Hatch (LuV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 56),
                // "Quadruple Input Hatch (LuV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 711),
                // "LuV Beamline Input Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10513),
                // "Output Hatch (LuV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 66),
                // "LuV Beamline Output Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10504),
                // "Input Bus (LuV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 76),
                // "Advanced Stocking Input Bus (ME)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 2711),
                // "Crafting Input Bus (ME)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 2715),
                // "Output Bus (LuV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 86),
                // "Muffler Hatch (LuV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 96),
                // "Advanced Muffler Hatch (LuV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30006),
                // "LuV 256A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15131),
                // "LuV 1,024A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15141),
                // "LuV 256A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15231),
                // "LuV 1,024A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15241),
                // "Super Bus (I) (LuV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30027),
                // "Super Bus (O) (LuV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30037) });

        // ZPM Tier
        // "ZPM Energy Hatch" - 47
        PachinkoRecipes_GT_Hatch.put(
            47,
            new ItemStack[] {
                // "ZPM Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 37),
                // "ZPM Dynamo Hatch [Buffered]"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 906),
                // "ZPM 4A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15202),
                // "ZPM 16A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15212),
                // "ZPM 64A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15222),
                // "ZPM Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 47),
                // "ZPM Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 219),
                // "ZPM 4A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15074),
                // "ZPM 4A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15075),
                // "ZPM 64A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15076),
                // "ZPM 4A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15102),
                // "ZPM 16A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15112),
                // "ZPM 64A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15122),
                // "ZPM 64A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 57),
                // "Quadruple Input Hatch (ZPM)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 712),
                // "Output Hatch (ZPM)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 67),
                // "Input Bus (ZPM)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 77),
                // "Output Bus (ZPM)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 87),
                // "Muffler Hatch (ZPM)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 97),
                // "Advanced Muffler Hatch (ZPM)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30007),
                // "ZPM 256A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15132),
                // "ZPM 1,024A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15142),
                // "ZPM 4,096A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15152),
                // "ZPM 256A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15232),
                // "ZPM 1,024A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15242),
                // "ZPM 4,096A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15252),
                // "Super Bus (I) (ZPM)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30028),
                // "Super Bus (O) (ZPM)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30038),
                // "Extreme Air Intake Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 31070) });

        // UV Tier
        // "UV Energy Hatch" - 48
        PachinkoRecipes_GT_Hatch.put(
            48,
            new ItemStack[] {
                // "UV Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 38),
                // "UV Dynamo Hatch [Buffered]"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 907),
                // "UV 4A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15203),
                // "UV 16A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15213),
                // "UV 64A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15223),
                // "UV Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 48),
                // "UV Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 227),
                // "UV 4A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15077),
                // "UV 16A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15078),
                // "UV 64A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15079),
                // "UV 4A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15103),
                // "UV 16A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15113),
                // "UV 64A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15123),
                // "Input Hatch (UV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 58),
                // "Quadruple Input Hatch (UV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 713),
                // "Stocking Input Hatch (ME)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 2717),
                // "Output Hatch (UV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 68),
                // "Input Bus (UV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 78),
                // "Output Bus (UV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 88),
                // "Muffler Hatch (UV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 98),
                // "Advanced Muffler Hatch (UV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30008),
                // "UV 256A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15133),
                // "UV 1,024A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15143),
                // "UV 4,096A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15153),
                // "UV 16,384A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15163),
                // "UV 256A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15233),
                // "UV 1,024A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15243),
                // "UV 4,096A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15253),
                // "UV 16,384A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15263),
                // "Super Bus (I) (UV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30029),
                // "Super Bus (O) (UV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30039) });

        // UHV Tier
        // "UHV Energy Hatch" - 49
        PachinkoRecipes_GT_Hatch.put(
            49,
            new ItemStack[] {
                // "UHV Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 39),
                // "UHV Dynamo Hatch [Buffered]"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 908),
                // "UHV 4A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15204),
                // "UHV 16A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15214),
                // "UHV 64A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15224),
                // "UHV Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 49),
                // "UHV Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 229),
                // "UHV 4A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15080),
                // "UHV 16A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15081),
                // "UHV 64A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15082),
                // "UHV 4A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15104),
                // "UHV 16A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15114),
                // "UHV 64A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15124),
                // "Input Hatch (UHV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 59),
                // "Quadruple Input Hatch (UHV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 714),
                // "Advanced Stocking Input Hatch (ME)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 2712),
                // "Output Hatch (UHV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 69),
                // "Input Bus (UHV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 79),
                // "Output Bus (UHV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 89),
                // "Muffler Hatch (UHV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 99),
                // "Advanced Muffler Hatch (UHV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30009),
                // "UHV 256A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15134),
                // "UHV 1,024A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15144),
                // "UHV 4,096A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15154),
                // "UHV 16,384A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15164),
                // "UHV 65,536A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15174),
                // "UHV 256A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15234),
                // "UHV 1,024A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15244),
                // "UHV 4,096A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15254),
                // "UHV 16,384A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15264),
                // "UHV 65,536A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15274),
                // "Super Bus (I) (UHV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30030),
                // "Super Bus (O) (UHV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 30040),
                // "Atmospheric Intake Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 32765) });

        // UEV Tier
        // "UEV Energy Hatch" - 11300
        PachinkoRecipes_GT_Hatch.put(
            11300,
            new ItemStack[] {
                // "UEV Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 11290),
                // "UEV 4A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15205),
                // "UEV 16A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15215),
                // "UEV 64A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15225),
                // "UEV Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 266),
                // "UEV Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 11300),
                // "UEV 4A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15083),
                // "UEV 16A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15084),
                // "UEV 64A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15085),
                // "UEV 4A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15105),
                // "UEV 16A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15115),
                // "UEV 64A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15125),
                // "Quadruple Input Hatch (UEV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 715),
                // "Input Hatch (UEV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12097),
                // "Output Hatch (UEV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12103),
                // "UEV 256A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15135),
                // "UEV 1,024A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15145),
                // "UEV 4,096A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15155),
                // "UEV 16,384A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15165),
                // "UEV 65,536A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15175),
                // "UEV 262,144A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15185),
                // "UEV 256A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15235),
                // "UEV 1,024A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15245),
                // "UEV 4,096A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15255),
                // "UEV 16,384A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15265),
                // "UEV 65,536A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15275),
                // "UEV 262,144A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15285) });

        // UIV Tier
        // "UIV Energy Hatch" - 11301
        PachinkoRecipes_GT_Hatch.put(
            11301,
            new ItemStack[] {
                // "UIV Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 11291),
                // "UIV 4A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15206),
                // "UIV 16A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15216),
                // "UIV 64A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15226),
                // "UIV Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 267),
                // "UIV Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 11301),
                // "UIV 4A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15086),
                // "UIV 16A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15087),
                // "UIV 64A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15088),
                // "UIV 4A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15106),
                // "UIV 16A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15116),
                // "UIV 64A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15126),
                // "Quadruple Input Hatch (UIV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 716),
                // "Input Hatch (UIV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12098),
                // "Output Hatch (UIV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12104),
                // "UIV 256A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15136),
                // "UIV 1,024A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15146),
                // "UIV 4,096A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15156),
                // "UIV 16,384A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15166),
                // "UIV 65,536A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15176),
                // "UIV 262,144A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15186),
                // "UIV 1,048,576A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15196),
                // "UIV 256A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15236),
                // "UIV 1,024A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15246),
                // "UIV 4,096A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15256),
                // "UIV 16,384A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15266),
                // "UIV 65,536A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15276),
                // "UIV 262,144A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15286),
                // "UIV 1,048,576A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15296) });

        // UMV Tier
        // "UMV Energy Hatch" - 11302
        PachinkoRecipes_GT_Hatch.put(
            11302,
            new ItemStack[] {
                // "UMV Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 11292),
                // "UMV 4A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15207),
                // "UMV 16A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15217),
                // "UMV 64A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15227),
                // "UMV Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 268),
                // "UMV Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 11302),
                // "UMV 4A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15089),
                // "UMV 16A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15090),
                // "UMV 64A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15091),
                // "UMV 4A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15107),
                // "UMV 16A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15117),
                // "UMV 64A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15127),
                // "Quadruple Input Hatch (UMV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 717),
                // "Input Hatch (UMV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12099),
                // "Output Hatch (UMV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12105),
                // "UMV 256A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15137),
                // "UMV 1,024A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15147),
                // "UMV 4,096A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15157),
                // "UMV 16,384A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15167),
                // "UMV 65,536A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15177),
                // "UMV 262,144A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15187),
                // "UMV 1,048,576A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15197),
                // "UMV 4,194,304A/t Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 16023),
                // "UMV 256A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15237),
                // "UMV 1,024A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15247),
                // "UMV 4,096A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15257),
                // "UMV 16,384A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15267),
                // "UMV 65,536A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15277),
                // "UMV 262,144A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15287),
                // "UMV 1,048,576A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15297),
                // "UMV 4,194,304A/t Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 16020) });

        // UXV Tier
        // "UXV Energy Hatch" - 11303
        PachinkoRecipes_GT_Hatch.put(
            11303,
            new ItemStack[] {
                // "UXV Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 11293),
                // "UXV 4A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15208),
                // "UXV 16A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15218),
                // "UXV 64A Dynamo Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15228),
                // "UXV Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 269),
                // "UXV Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 11303),
                // "UXV 4A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15092),
                // "UXV 16A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15093),
                // "UXV 64A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15094),
                // "UXV 4A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15108),
                // "UXV 16A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15118),
                // "UXV 64A Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15128),
                // "UXV 256A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15500),
                // "UXV 1,024A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15501),
                // "UXV 4,096A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15502),
                // "UXV 16,384A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15503),
                // "UXV 65,536A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15504),
                // "UXV 262,144A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15505),
                // "UXV 1,048,576A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15506),
                // "Quadruple Input Hatch (UXV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 718),
                // "Input Hatch (UXV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12100),
                // "Output Hatch (UXV)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12106),
                // "UXV 256A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15138),
                // "UXV 1,024A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15148),
                // "UXV 4,096A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15158),
                // "UXV 16,384A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15168),
                // "UXV 65,536A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15178),
                // "UXV 262,144A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15188),
                // "UXV 1,048,576A Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15198),
                // "Legendary Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15199),
                // "Legendary Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15299),
                // "UXV 4,194,304A/t Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 16024),
                // "UXV 16,777,216A/t Laser Target Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 16025),
                // "UXV 256A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15238),
                // "UXV 1,024A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15248),
                // "UXV 4,096A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15258),
                // "UXV 16,384A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15268),
                // "UXV 65,536A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15278),
                // "UXV 262,144A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15288),
                // "UXV 1,048,576A Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15298),
                // "UXV 4,194,304A/t Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 16021),
                // "UXV 16,777,216A/t Laser Source Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 16022),
                // "UXV 4,194,304A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 16026),
                // "UXV 16,777,216A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 16027) });

        // MAX Tier
        // "MAX Wireless Energy Hatch" - 286
        PachinkoRecipes_GT_Hatch.put(
            286,
            new ItemStack[] {
                // "MAX Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 286),
                // "MAX 4A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15095),
                // "MAX 16A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15096),
                // "MAX 64A Wireless Energy Hatch"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 15097),
                // "Input Hatch (MAX)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12102),
                // "Output Hatch (MAX)"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12108) });
    }
}
