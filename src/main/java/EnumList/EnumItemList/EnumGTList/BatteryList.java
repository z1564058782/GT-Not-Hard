package EnumList.EnumItemList.EnumGTList;

import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.IndustrialCraft2;
import static gregtech.api.util.GTModHandler.getModItem;

import net.minecraft.item.ItemStack;

import util.ItemUtils;

public class BatteryList {

    // ULV Tier
    public static final ItemStack Tantalum_Capacitor_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32499);
    public static final ItemStack Tantalum_Capacitor = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32499), "{GT.ItemCharge:1000L}", null);

    // LV Tier
    public static final ItemStack Small_Battery_Hull = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32500);
    public static final ItemStack Small_Acid_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32510), "{GT.ItemCharge:18000L}", null);
    public static final ItemStack Small_Mercury_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32511), "{GT.ItemCharge:32000L}", null);
    public static final ItemStack Small_Cadmium_Battery_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32517);
    public static final ItemStack Small_Cadmium_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32517), "{GT.ItemCharge:75000L}", null);
    public static final ItemStack Small_Lithium_Battery_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32518);
    public static final ItemStack Small_Lithium_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32518), "{GT.ItemCharge:100000L}", null);
    public static final ItemStack Small_Sodium_Battery_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32519);
    public static final ItemStack Small_Sodium_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32519), "{GT.ItemCharge:50000L}", null);

    // MV Tier
    public static final ItemStack Medium_Battery_Hull = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32501);
    public static final ItemStack Medium_Acid_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32520), "{GT.ItemCharge:72000L}", null);
    public static final ItemStack Medium_Mercury_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32521), "{GT.ItemCharge:128000L}", null);
    public static final ItemStack Medium_Cadmium_Battery_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32527);
    public static final ItemStack Medium_Cadmium_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32527), "{GT.ItemCharge:300000L}", null);
    public static final ItemStack Medium_Lithium_Battery_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32528);
    public static final ItemStack Medium_Lithium_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32528), "{GT.ItemCharge:400000L}", null);
    public static final ItemStack Medium_Sodium_Battery_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32529);
    public static final ItemStack Medium_Sodium_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32529), "{GT.ItemCharge:200000L}", null);

    // HV Tier
    public static final ItemStack Large_Battery_Hull = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32502);
    public static final ItemStack Large_Acid_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32530), "{GT.ItemCharge:288000L}", null);
    public static final ItemStack Large_Mercury_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32531), "{GT.ItemCharge:512000L}", null);
    public static final ItemStack Large_Cadmium_Battery_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32537);
    public static final ItemStack Large_Cadmium_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32537), "{GT.ItemCharge:1200000L}", null);
    public static final ItemStack Large_Lithium_Battery_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32538);
    public static final ItemStack Large_Lithium_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32538), "{GT.ItemCharge:1600000L}", null);
    public static final ItemStack Large_Sodium_Battery_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32539);
    public static final ItemStack Large_Sodium_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32539), "{GT.ItemCharge:800000L}", null);
    public static final ItemStack Energy_Crystal_Empty = getModItem(IndustrialCraft2.ID, "itemBatCrystal", 1L);
    public static final ItemStack Energy_Crystal = ItemUtils
        .getItemStack(getModItem(IndustrialCraft2.ID, "itemBatCrystal", 1L), "{charge:1000000.0}", null);

    // EV Tier
    public static final ItemStack Small_Sunnarium_Battery_Hull = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32503);
    public static final ItemStack Small_Sunnarium_Battery_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32540);
    public static final ItemStack Small_Sunnarium_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32540), "{GT.ItemCharge:6400000L}", null);
    public static final ItemStack Quad_Cell_Sodium_Battery_Empty = getModItem(
        GTPlusPlus.ID,
        "MU-metaitem.01",
        1L,
        32050);
    public static final ItemStack Quad_Cell_Sodium_Battery = ItemUtils
        .getItemStack(getModItem(GTPlusPlus.ID, "MU-metaitem.01", 1L, 32050), "{GT.ItemCharge:3200000L}", null);
    public static final ItemStack Quad_Cell_Cadmium_Battery_Empty = getModItem(
        GTPlusPlus.ID,
        "MU-metaitem.01",
        1L,
        32052);
    public static final ItemStack Quad_Cell_Cadmium_Battery = ItemUtils
        .getItemStack(getModItem(GTPlusPlus.ID, "MU-metaitem.01", 1L, 32052), "{GT.ItemCharge:4800000L}", null);
    public static final ItemStack Quad_Cell_Lithium_Battery_Empty = getModItem(
        GTPlusPlus.ID,
        "MU-metaitem.01",
        1L,
        32054);
    public static final ItemStack Quad_Cell_Lithium_Battery = ItemUtils
        .getItemStack(getModItem(GTPlusPlus.ID, "MU-metaitem.01", 1L, 32054), "{GT.ItemCharge:6400000L}", null);
    public static final ItemStack Lapotron_Crystal_Empty = getModItem(IndustrialCraft2.ID, "itemBatLamaCrystal", 1L);
    public static final ItemStack Lapotron_Crystal = ItemUtils
        .getItemStack(getModItem(IndustrialCraft2.ID, "itemBatLamaCrystal", 1L), "{charge:10000000.0}", null);

    // IV Tier
    public static final ItemStack Medium_Sunnarium_Battery_Hull = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32504);
    public static final ItemStack Medium_Sunnarium_Battery_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32545);
    public static final ItemStack Medium_Sunnarium_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32545), "{GT.ItemCharge:25600000L}", null);
    public static final ItemStack Lapotronic_Energy_Orb_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32597);
    public static final ItemStack Lapotronic_Energy_Orb = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32597), "{GT.ItemCharge:100000000L}", null);

    // LuV Tier
    public static final ItemStack Large_Sunnarium_Battery_Hull = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32505);
    public static final ItemStack Large_Sunnarium_Battery_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32550);
    public static final ItemStack Large_Sunnarium_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32550), "{GT.ItemCharge:102400000L}", null);
    public static final ItemStack Lapotronic_Energy_Orb_Cluster_Empty = getModItem(
        GregTech.ID,
        "gt.metaitem.01",
        1L,
        32599);
    public static final ItemStack Lapotronic_Energy_Orb_Cluster = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32599), "{GT.ItemCharge:1000000000L}", null);

    // ZPM Tier
    public static final ItemStack Medium_Naquadria_Battery_Hull = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32506);
    public static final ItemStack Medium_Naquadria_Battery_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32555);
    public static final ItemStack Medium_Naquadria_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32555), "{GT.ItemCharge:409600000L}", null);
    public static final ItemStack Energy_Module_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32736);
    public static final ItemStack Energy_Module = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32736), "{GT.ItemCharge:10000000000L}", null);
    public static final ItemStack Zero_Point_Module = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32598), "{GT.ItemCharge:2000000000000L}", null);

    // UV Tier
    public static final ItemStack Large_Naquadria_Battery_Hull = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32507);
    public static final ItemStack Large_Naquadria_Battery_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32560);
    public static final ItemStack Large_Naquadria_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32560), "{GT.ItemCharge:1638400000L}", null);
    public static final ItemStack Energy_Cluster_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32737);
    public static final ItemStack Energy_Cluster = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32737), "{GT.ItemCharge:100000000000L}", null);
    public static final ItemStack Ultimate_Battery_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32605);
    public static final ItemStack Ultimate_Battery = ItemUtils.getItemStack(
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32605),
        "{GT.ItemCharge:9223372036854775807L}",
        null);

    // UHV Tier
    public static final ItemStack Small_Neutronium_Battery_Hull = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32561);
    public static final ItemStack Small_Neutronium_Battery_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32570);
    public static final ItemStack Small_Neutronium_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32570), "{GT.ItemCharge:6553600000L}", null);

    // UEV Tier
    public static final ItemStack Medium_Neutronium_Battery_Hull = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32562);
    public static final ItemStack Medium_Neutronium_Battery_Empty = getModItem(
        GregTech.ID,
        "gt.metaitem.01",
        1L,
        32575);
    public static final ItemStack Medium_Neutronium_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32575), "{GT.ItemCharge:26214400000L}", null);

    // UIV Tier
    public static final ItemStack Large_Neutronium_Battery_Hull = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32563);
    public static final ItemStack Large_Neutronium_Battery_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32580);
    public static final ItemStack Large_Neutronium_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32580), "{GT.ItemCharge:104857600000L}", null);

    // UMV Tier
    public static final ItemStack Medium_Plasma_Battery_Hull = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32564);
    public static final ItemStack Medium_Infinity_Battery_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32585);
    public static final ItemStack Medium_Infinity_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32585), "{GT.ItemCharge:419430400000L}", null);
    public static final ItemStack Really_Ultimate_Battery_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32609);
    public static final ItemStack Really_Ultimate_Battery = ItemUtils.getItemStack(
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32609),
        "{GT.ItemCharge:9223372036854775807L}",
        null);

    // UXV Tier
    public static final ItemStack Large_Plasma_Battery_Hull = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32565);
    public static final ItemStack Large_Infinity_Battery_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32590);
    public static final ItemStack Large_Infinity_Battery = ItemUtils
        .getItemStack(getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32590), "{GT.ItemCharge:1677721600000L}", null);
    public static final ItemStack Extremely_Ultimate_Battery_Empty = getModItem(
        GregTech.ID,
        "gt.metaitem.01",
        1L,
        32594);
    public static final ItemStack Extremely_Ultimate_Battery = ItemUtils.getItemStack(
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32594),
        "{GT.ItemCharge:9223372036854775807L}",
        null);

    // MAX Tier
    public static final ItemStack Insanely_Ultimate_Battery_Empty = getModItem(
        GregTech.ID,
        "gt.metaitem.01",
        1L,
        32145);
    public static final ItemStack Insanely_Ultimate_Battery = ItemUtils.getItemStack(
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32145),
        "{GT.ItemCharge:9223372036854775807L}",
        null);

    // Error Tier
    public static final ItemStack Mega_Ultimate_Battery_Empty = getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32146);
    public static final ItemStack Mega_Ultimate_Battery = ItemUtils.getItemStack(
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32146),
        "{GT.ItemCharge:9223372036854775807L}",
        null);

    public static final ItemStack[] Battery_List = new ItemStack[] {
        // ULV Tier
        Tantalum_Capacitor_Empty, Tantalum_Capacitor,

        // LV Tier
        Small_Battery_Hull, Small_Acid_Battery, Small_Mercury_Battery, Small_Cadmium_Battery_Empty,
        Small_Cadmium_Battery, Small_Lithium_Battery_Empty, Small_Lithium_Battery, Small_Sodium_Battery_Empty,
        Small_Sodium_Battery,

        // MV Tier
        Medium_Battery_Hull, Medium_Acid_Battery, Medium_Mercury_Battery, Medium_Cadmium_Battery_Empty,
        Medium_Cadmium_Battery, Medium_Lithium_Battery_Empty, Medium_Lithium_Battery, Medium_Sodium_Battery_Empty,
        Medium_Sodium_Battery,

        // HV Tier
        Large_Battery_Hull, Large_Acid_Battery, Large_Mercury_Battery, Large_Cadmium_Battery_Empty,
        Large_Cadmium_Battery, Large_Lithium_Battery_Empty, Large_Lithium_Battery, Large_Sodium_Battery_Empty,
        Large_Sodium_Battery, Energy_Crystal_Empty, Energy_Crystal,

        // EV Tier
        Small_Sunnarium_Battery_Hull, Small_Sunnarium_Battery_Empty, Small_Sunnarium_Battery,
        Quad_Cell_Sodium_Battery_Empty, Quad_Cell_Sodium_Battery, Quad_Cell_Cadmium_Battery_Empty,
        Quad_Cell_Cadmium_Battery, Quad_Cell_Lithium_Battery_Empty, Quad_Cell_Lithium_Battery, Lapotron_Crystal_Empty,
        Lapotron_Crystal,

        // IV Tier
        Medium_Sunnarium_Battery_Hull, Medium_Sunnarium_Battery_Empty, Medium_Sunnarium_Battery,
        Lapotronic_Energy_Orb_Empty, Lapotronic_Energy_Orb,

        // LuV Tier
        Large_Sunnarium_Battery_Hull, Large_Sunnarium_Battery_Empty, Large_Sunnarium_Battery,
        Lapotronic_Energy_Orb_Cluster_Empty, Lapotronic_Energy_Orb_Cluster,

        // ZPM Tier
        Medium_Naquadria_Battery_Hull, Medium_Naquadria_Battery_Empty, Medium_Naquadria_Battery, Energy_Module_Empty,
        Energy_Module, Zero_Point_Module,

        // UV Tier
        Large_Naquadria_Battery_Hull, Large_Naquadria_Battery_Empty, Large_Naquadria_Battery, Energy_Cluster_Empty,
        Energy_Cluster, Ultimate_Battery_Empty, Ultimate_Battery,

        // UHV Tier
        Small_Neutronium_Battery_Hull, Small_Neutronium_Battery_Empty, Small_Neutronium_Battery,

        // UEV Tier
        Medium_Neutronium_Battery_Hull, Medium_Neutronium_Battery_Empty, Medium_Neutronium_Battery,

        // UIV Tier
        Large_Neutronium_Battery_Hull, Large_Neutronium_Battery_Empty, Large_Neutronium_Battery,

        // UMV Tier
        Medium_Plasma_Battery_Hull, Medium_Infinity_Battery_Empty, Medium_Infinity_Battery,
        Really_Ultimate_Battery_Empty, Really_Ultimate_Battery,

        // UXV Tier
        Large_Plasma_Battery_Hull, Large_Infinity_Battery_Empty, Large_Infinity_Battery,
        Extremely_Ultimate_Battery_Empty, Extremely_Ultimate_Battery,

        // MAX Tier
        Insanely_Ultimate_Battery_Empty, Insanely_Ultimate_Battery,

        // Error Tier
        Mega_Ultimate_Battery_Empty, Mega_Ultimate_Battery };
}
