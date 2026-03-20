package Recipes.SingularityRecipes_Pachinko;

import static gregtech.api.enums.Mods.EnhancedLootBags;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GoodGenerator;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.IndustrialCraft2;
import static gregtech.api.enums.Mods.Railcraft;
import static gregtech.api.enums.Mods.TecTech;
import static gregtech.api.util.GTModHandler.getModItem;

import net.minecraft.item.ItemStack;

public class GT_Item {

    // Block Hull-Casing-Buffer-Fitter-Transformer
    public static final ItemStack[] Steam_Tier_Block = new ItemStack[] {
        // "Bronze Hull"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1),
        // "Bricked Bronze Hull"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2),
        // "Steel Hull"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 3),
        // "Bricked Wrought Iron Hull"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 4) };

    public static final ItemStack[] ULV_Tier_Block = new ItemStack[] {
        // "ULV Machine Hull"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10),
        // "Ultra Low Voltage Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 20),
        // "Ultra Low Voltage Locker"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 150),
        // "Ultra Low Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 160),
        // "Ultra Low Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 170),
        // "Ultra Low Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 180),
        // "Ultra Low Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 190),
        // "Ultra Low Voltage Energy Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 770),
        // "ULV Hi-Amp Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 877),
        // "Ultra Low Voltage Chest Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9230),
        // "Ultra Low Voltage Item Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9240),
        // "Ultra Low Voltage Type Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9250),
        // "Ultra Low Voltage Regulator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9270),
        // "Ultra Low Voltage Super Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9300),
        // "Ultra Low Voltage Item Distributor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9320),
        // "Ultra Low Voltage Recipe Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9330),
        // "Energy Distributor ULV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12601),
        // "Cable Diode 2A ULV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12617),
        // "Cable Diode 4A ULV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12633),
        // "Cable Diode 8A ULV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12649),
        // "Cable Diode 12A ULV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12665),
        // "Cable Diode 16A ULV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12681),
        // "ULV Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 0) };

    public static final ItemStack[] LV_Tier_Block = new ItemStack[] {
        // "LV Machine Hull"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11),
        // "Low Voltage Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 21),
        // "Low Voltage Locker"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 151),
        // "Low Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 161),
        // "Low Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 171),
        // "Low Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 181),
        // "Low Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 191),
        // "Low Voltage Battery Charger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 691),
        // "Low Voltage Energy Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 771),
        // "LV Hi-Amp Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 878),
        // "Wireless Charger MK I"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 890),
        // "Low Voltage Chest Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9231),
        // "Low Voltage Item Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9241),
        // "Low Voltage Type Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9251),
        // "Low Voltage Regulator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9271),
        // "Low Voltage Super Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9301),
        // "Low Voltage Item Distributor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9321),
        // "Low Voltage Recipe Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9331),
        // "Low Voltage Power Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12001),
        // "Low Voltage Turbo Charger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12041),
        // "Energy Distributor LV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12602),
        // "Cable Diode 2A LV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12618),
        // "Cable Diode 4A LV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12634),
        // "Cable Diode 8A LV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12650),
        // "Cable Diode 12A LV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12666),
        // "Cable Diode 16A LV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12682),
        // "Basic Tesla Transceiver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 16000),
        // "Basic Tesla Transceiver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 16005),
        // "Basic Tesla Transceiver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 16010),
        // "Basic Tesla Transceiver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 16015),
        // "LV Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 1) };

    public static final ItemStack[] MV_Tier_Block = new ItemStack[] {
        // "MV Machine Hull"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12),
        // "Medium Voltage Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 22),
        // "Medium Voltage Locker"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 152),
        // "Medium Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 162),
        // "Medium Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 172),
        // "Medium Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 182),
        // "Medium Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 192),
        // "Medium Voltage Battery Charger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 692),
        // "Medium Voltage Energy Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 772),
        // "MV Hi-Amp Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 879),
        // "Wireless Charger MK II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 891),
        // "Medium Voltage Chest Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9232),
        // "Medium Voltage Item Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9242),
        // "Medium Voltage Type Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9252),
        // "Medium Voltage Regulator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9272),
        // "Medium Voltage Super Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9302),
        // "Medium Voltage Item Distributor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9322),
        // "Medium Voltage Recipe Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9332),
        // "Medium Voltage Power Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12002),
        // "Medium Voltage Turbo Charger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12042),
        // "Energy Distributor MV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12603),
        // "Cable Diode 2A MV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12619),
        // "Cable Diode 16A MV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12683),
        // "Advanced Tesla Transceiver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 16001),
        // "Advanced Tesla Transceiver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 16006),
        // "Advanced Tesla Transceiver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 16011),
        // "Advanced Tesla Transceiver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 16016),
        // "MV Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 2) };

    public static final ItemStack[] HV_Tier_Block = new ItemStack[] {
        // "HV Machine Hull"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 13),
        // "High Voltage Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 23),
        // "High Voltage Locker"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 153),
        // "High Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 163),
        // "High Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 173),
        // "High Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 183),
        // "High Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 193),
        // "High Voltage Battery Charger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 693),
        // "High Voltage Energy Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 773),
        // "HV Hi-Amp Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 880),
        // "Wireless Charger MK III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 892),
        // "High Voltage Chest Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9233),
        // "High Voltage Item Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9243),
        // "High Voltage Type Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9253),
        // "High Voltage Regulator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9273),
        // "High Voltage Super Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9303),
        // "High Voltage Item Distributor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9323),
        // "High Voltage Recipe Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9333),
        // "High Voltage Power Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12003),
        // "High Voltage Turbo Charger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12043),
        // "Energy Distributor HV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12604),
        // "Cable Diode 2A HV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12620),
        // "Cable Diode 4A HV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12636),
        // "Cable Diode 8A HV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12652),
        // "Cable Diode 12A HV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12668),
        // "Cable Diode 16A HV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12684),
        // "Liquid Air Fluid Hatch"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12736),
        // "Epyc Tesla Transceiver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 16002),
        // "Epyc Tesla Transceiver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 16007),
        // "Epyc Tesla Transceiver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 16012),
        // "Epyc Tesla Transceiver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 16017),
        // "HV Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 3) };

    public static final ItemStack[] EV_Tier_Block = new ItemStack[] {
        // "EV Machine Hull"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 14),
        // "Extreme Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 24),
        // "Extreme Voltage Locker"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 154),
        // "Extreme Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 164),
        // "Extreme Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 174),
        // "Extreme Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 184),
        // "Extreme Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 194),
        // "Extreme Voltage Battery Charger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 694),
        // "Extreme Voltage Energy Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 774),
        // "EV Hi-Amp Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 881),
        // "Wireless Charger MK IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 893),
        // "Extreme Voltage Chest Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9234),
        // "Extreme Voltage Item Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9244),
        // "Extreme Voltage Type Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9254),
        // "Extreme Voltage Regulator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9274),
        // "Extreme Voltage Super Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9304),
        // "Extreme Voltage Item Distributor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9324),
        // "Extreme Voltage Recipe Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9334),
        // "Extreme Power Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12004),
        // "Extreme Voltage Turbo Charger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12044),
        // "Energy Distributor EV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12605),
        // "Cable Diode 2A EV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12621),
        // "Cable Diode 4A EV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12637),
        // "Cable Diode 8A EV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12653),
        // "Cable Diode 12A EV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12669),
        // "Cable Diode 16A EV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12685),
        // "Ultimate Power Tesla Transceiver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 16003),
        // "Ultimate Power Tesla Transceiver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 16008),
        // "Ultimate Power Tesla Transceiver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 16013),
        // "Ultimate Power Tesla Transceiver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 16018),
        // "EV Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 4) };

    public static final ItemStack[] IV_Tier_Block = new ItemStack[] {
        // "IV Machine Hull"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 15),
        // "Insane Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 25),
        // "Insane Voltage Locker"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 155),
        // "Insane Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 165),
        // "Insane Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 175),
        // "Insane Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 185),
        // "Insane Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 195),
        // "Insane Voltage Battery Charger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 695),
        // "Insane Voltage Energy Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 775),
        // "IV Hi-Amp Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 882),
        // "Wireless Charger MK V"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 894),
        // "Insane Voltage Chest Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9235),
        // "Insane Voltage Item Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9245),
        // "Insane Voltage Type Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9255),
        // "Insane Voltage Regulator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9275),
        // "Insane Voltage Super Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9305),
        // "Insane Voltage Item Distributor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9325),
        // "Insane Voltage Recipe Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9335),
        // "Insane Power Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12005),
        // "Insane Voltage Turbo Charger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12045),
        // "Energy Distributor IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12606),
        // "Cable Diode 2A IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12622),
        // "Cable Diode 4A IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12638),
        // "Cable Diode 8A IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12654),
        // "Cable Diode 12A IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12670),
        // "Cable Diode 16A IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12686),
        // "Insane Buck Converter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 15485),
        // "Insane Tesla Transceiver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 16004),
        // "Insane Tesla Transceiver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 16009),
        // "Insane Tesla Transceiver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 16014),
        // "Insane Tesla Transceiver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 16019),
        // "IV Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 5) };

    public static final ItemStack[] LuV_Tier_Block = new ItemStack[] {
        // "LuV Machine Hull"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 16),
        // "Ludicrous Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 26),
        // "Ludicrous Voltage Locker"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 156),
        // "Ludicrous Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 166),
        // "Ludicrous Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 176),
        // "Ludicrous Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 186),
        // "Ludicrous Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 196),
        // "Ludicrous Voltage Battery Charger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 696),
        // "Ludicrous Voltage Energy Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 776),
        // "LuV Hi-Amp Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 883),
        // "Wireless Charger MK VI"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 895),
        // "Ludicrous Voltage Chest Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9236),
        // "Ludicrous Voltage Item Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9246),
        // "Ludicrous Voltage Type Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9256),
        // "Ludicrous Voltage Regulator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9276),
        // "Ludicrous Voltage Super Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9306),
        // "Ludicrous Voltage Item Distributor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9326),
        // "Ludicrous Voltage Recipe Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9336),
        // "Ludicrous Power Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12006),
        // "Ludicrous Voltage Turbo Charger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12046),
        // "Energy Distributor LuV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12607),
        // "Cable Diode 2A LuV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12623),
        // "Cable Diode 4A LuV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12639),
        // "Cable Diode 8A LuV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12655),
        // "Cable Diode 12A LuV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12671),
        // "Cable Diode 16A LuV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12687),
        // "Ludicrous Buck Converter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 15486),
        // "LuV Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 6) };

    public static final ItemStack[] ZPM_Tier_Block = new ItemStack[] {
        // "ZPM Machine Hull"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 17),
        // "ZPM Voltage Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 27),
        // "ZPM Voltage Locker"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 157),
        // "ZPM Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 167),
        // "ZPM Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 177),
        // "ZPM Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 187),
        // "ZPM Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 197),
        // "ZPM Voltage Battery Charger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 697),
        // "ZPM Voltage Energy Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 777),
        // "ZPM Hi-Amp Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 884),
        // "Wireless Charger MK VII"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 896),
        // "ZPM Voltage Chest Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9237),
        // "ZPM Voltage Item Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9247),
        // "ZPM Voltage Type Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9257),
        // "ZPM Voltage Regulator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9277),
        // "ZPM Voltage Super Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9307),
        // "ZPM Voltage Item Distributor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9327),
        // "ZPM Voltage Recipe Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9337),
        // "ZPM Voltage Power Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12007),
        // "ZPM Voltage Turbo Charger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12047),
        // "Energy Distributor ZPM"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12608),
        // "Cable Diode 2A ZPM"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12624),
        // "Cable Diode 4A ZPM"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12640),
        // "Cable Diode 8A ZPM"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12656),
        // "Cable Diode 12A ZPM"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12672),
        // "Cable Diode 16A ZPM"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12688),
        // "ZPM Voltage Buck Converter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 15487),
        // "ZPM Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 7) };

    public static final ItemStack[] UV_Tier_Block = new ItemStack[] {
        // "UV Machine Hull"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 18),
        // "Ultimate Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 28),
        // "Ultimate Voltage Locker"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 158),
        // "Ultimate Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 168),
        // "Ultimate Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 178),
        // "Ultimate Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 188),
        // "Ultimate Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 198),
        // "Ultimate Voltage Battery Charger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 698),
        // "Ultimate Voltage Energy Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 778),
        // "UV Hi-Amp Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 885),
        // "Wireless Charger MK VIII"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 897),
        // "Ultimate Voltage Chest Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9238),
        // "Ultimate Voltage Item Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9248),
        // "Ultimate Voltage Type Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9258),
        // "Ultimate Voltage Regulator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9278),
        // "Ultimate Voltage Super Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9308),
        // "Ultimate Voltage Item Distributor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9328),
        // "Ultimate Voltage Recipe Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9338),
        // "Ultimate Power Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12008),
        // "Ultimate Voltage Turbo Charger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12048),
        // "Energy Distributor UV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12609),
        // "Cable Diode 2A UV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12625),
        // "Cable Diode 4A UV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12641),
        // "Cable Diode 8A UV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12657),
        // "Cable Diode 12A UV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12673),
        // "Cable Diode 16A UV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12689),
        // "Ultimate Power Buck Converter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 15488),
        // "UV Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 8) };

    public static final ItemStack[] UHV_Tier_Block = new ItemStack[] {
        // "UHV Machine Hull"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 19),
        // "Highly Ultimate Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11220),
        // "Highly Ultimate Voltage Locker"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 159),
        // "Highly Ultimate Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 169),
        // "Highly Ultimate Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 179),
        // "Highly Ultimate Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 189),
        // "Highly Ultimate Voltage Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 199),
        // "Highly Ultimate Voltage Battery Charger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 699),
        // "MAX Voltage Energy Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 779),
        // "Highly Ultimate Hi-Amp Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11989),
        // "Wireless Charger MK IX"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 898),
        // "Highly Ultimate Voltage Chest Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9239),
        // "Highly Ultimate Voltage Item Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9249),
        // "Highly Ultimate Voltage Type Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9259),
        // "Highly Ultimate Voltage Regulator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9279),
        // "Highly Ultimate Voltage Super Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9309),
        // "MAX Voltage Item Distributor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9329),
        // "Highly Ultimate Voltage Recipe Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9339),
        // "Highly Ultimate Power Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12009),
        // "Highly Ultimate Voltage Turbo Charger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12049),
        // "Energy Distributor UHV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12610),
        // "Cable Diode 2A UHV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12626),
        // "Cable Diode 4A UHV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12642),
        // "Cable Diode 8A UHV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12658),
        // "Cable Diode 12A UHV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12674),
        // "Cable Diode 16A UHV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12690),
        // "Highly Ultimate Buck Converter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 15489),
        // "UHV Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasings", 1L, 9) };

    public static final ItemStack[] UEV_Tier_Block = new ItemStack[] {
        // "UEV Machine Hull"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11230),
        // "Extremely Ultimate Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11221),
        // "Extremely Ultimate Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11240),
        // "Extremely Ultimate Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11250),
        // "Extremely Ultimate Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11260),
        // "Extremely Ultimate Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11270),
        // "Extremely Ultimate Battery Charger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11280),
        // "Extremely Ultimate Hi-Amp Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11910),
        // "Crafting Input Buffer (ME)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2714),
        // "Ultra High Voltage Chest Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12060),
        // "Extremely Ultimate Power Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12010),
        // "Energy Distributor UEV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12611),
        // "Cable Diode 2A UEV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12627),
        // "Cable Diode 4A UEV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12643),
        // "Cable Diode 8A UEV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12659),
        // "Cable Diode 12A UEV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12675),
        // "Cable Diode 16A UEV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12691),
        // "Extremely Ultimate Buck Converter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 15490),
        // "UEV Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 10) };

    public static final ItemStack[] UIV_Tier_Block = new ItemStack[] {
        // "UIV Machine Hull"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11231),
        // "Insanely Ultimate Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11222),
        // "Insanely Ultimate Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11241),
        // "Insanely Ultimate Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11251),
        // "Insanely Ultimate Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11261),
        // "Insanely Ultimate Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11271),
        // "Insanely Ultimate Battery Charger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11281),
        // "Insanely Ultimate Hi-Amp Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11911),
        // "Crafting Input Proxy"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2716),
        // "UIV Voltage Chest Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12061),
        // "Insanely Ultimate Power Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12011),
        // "Energy Distributor UIV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12612),
        // "Cable Diode 2A UIV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12628),
        // "Cable Diode 4A UIV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12644),
        // "Cable Diode 8A UIV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12660),
        // "Cable Diode 12A UIV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12676),
        // "Cable Diode 16A UIV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12692),
        // "Insanely Ultimate Buck Converter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 15491),
        // "UIV Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 11) };

    public static final ItemStack[] UMV_Tier_Block = new ItemStack[] {
        // "UMV Machine Hull"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11232),
        // "Mega Ultimate Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11223),
        // "Mega Ultimate Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11242),
        // "Mega Ultimate Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11252),
        // "Mega Ultimate Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11262),
        // "Mega Ultimate Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11272),
        // "Mega Ultimate Battery Charger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11282),
        // "Mega Ultimate Hi-Amp Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11912),
        // "UMV Voltage Chest Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12062),
        // "Mega Ultimate Power Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12012),
        // "Energy Distributor UMV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12613),
        // "Cable Diode 2A UMV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12629),
        // "Cable Diode 4A UMV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12645),
        // "Cable Diode 8A UMV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12661),
        // "Cable Diode 12A UMV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12677),
        // "Cable Diode 16A UMV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12693),
        // "Mega Ultimate Buck Converter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 15492),
        // "UMV Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 12) };

    public static final ItemStack[] UXV_Tier_Block = new ItemStack[] {
        // "UXV Machine Hull"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11233),
        // "Extended Mega Ultimate Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11224),
        // "Extended Mega Ultimate Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11243),
        // "Extended Mega Ultimate Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11253),
        // "Extended Mega Ultimate Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11263),
        // "Extended Mega Ultimate Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11273),
        // "Extended Mega Ultimate Battery Charger"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11283),
        // "Extended Mega Ultimate Hi-Amp Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11913),
        // "Extended Mega Ultimate Power Transformer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12013),
        // "Energy Distributor UXV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12614),
        // "Cable Diode 2A UXV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12630),
        // "Cable Diode 4A UXV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12646),
        // "Cable Diode 8A UXV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12662),
        // "Cable Diode 12A UXV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12678),
        // "Cable Diode 16A UXV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12694),
        // "Extended Mega Ultimate Buck Converter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 15493),
        // "UXV Machine Casing"
        getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 13) };

    public static final ItemStack[] MAX_Tier_Block = new ItemStack[] {
        // "MAX Machine Hull"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11234),
        // "Maximum Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11245),
        // "Maximum Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11255),
        // "Maximum Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11265),
        // "Maximum Battery Buffer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11275),
        // "Energy Distributor MAX"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12615),
        // "Cable Diode 2A MAX"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12631),
        // "Cable Diode 4A MAX"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12647),
        // "Cable Diode 8A MAX"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12663),
        // "Cable Diode 12A MAX"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12679),
        // "Cable Diode 16A MAX"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12695) };

    // Cable
    public static final ItemStack[] ULV_Tier_Cable = new ItemStack[] {
        // "1x Red Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2006),
        // "2x Red Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2007),
        // "4x Red Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2008),
        // "8x Red Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2009),
        // "12x Red Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2010),
        // "16x Red Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2011) };

    public static final ItemStack[] LV_Tier_Cable = new ItemStack[] {
        // "1x Cobalt Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1206),
        // "2x Cobalt Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1207),
        // "4x Cobalt Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1208),
        // "8x Cobalt Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1209),
        // "12x Cobalt Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1210),
        // "16x Cobalt Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1211),
        // "1x Lead Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1226),
        // "2x Lead Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1227),
        // "4x Lead Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1228),
        // "8x Lead Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1229),
        // "12x Lead Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1230),
        // "16x Lead Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1231),
        // "1x Tin Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1246),
        // "2x Tin Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1247),
        // "4x Tin Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1248),
        // "8x Tin Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1249),
        // "12x Tin Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1250),
        // "16x Tin Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1251),
        // "1x Zinc Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1266),
        // "2x Zinc Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1267),
        // "4x Zinc Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1268),
        // "8x Zinc Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1269),
        // "12x Zinc Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1270),
        // "16x Zinc Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1271),
        // "1x Soldering Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1286),
        // "2x Soldering Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1287),
        // "4x Soldering Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1288),
        // "8x Soldering Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1289),
        // "12x Soldering Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1290),
        // "16x Soldering Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1291),
        // "1x Redstone Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30651),
        // "2x Redstone Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30652),
        // "4x Redstone Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30653),
        // "8x Redstone Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30654),
        // "12x Redstone Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30655),
        // "16x Redstone Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30656) };

    public static final ItemStack[] MV_Tier_Cable = new ItemStack[] {
        // "1x Iron Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1306),
        // "2x Iron Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1307),
        // "4x Iron Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1308),
        // "8x Iron Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1309),
        // "12x Iron Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1310),
        // "16x Iron Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1311),
        // "1x Nickel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1326),
        // "2x Nickel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1327),
        // "4x Nickel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1328),
        // "8x Nickel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1329),
        // "12x Nickel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1330),
        // "16x Nickel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1331),
        // "1x Cupronickel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1346),
        // "2x Cupronickel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1347),
        // "4x Cupronickel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1348),
        // "8x Cupronickel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1349),
        // "12x Cupronickel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1350),
        // "16x Cupronickel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1351),
        // "1x Copper Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1366),
        // "2x Copper Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1367),
        // "4x Copper Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1368),
        // "8x Copper Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1369),
        // "12x Copper Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1370),
        // "16x Copper Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1371),
        // "1x Annealed Copper Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1386),
        // "2x Annealed Copper Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1387),
        // "4x Annealed Copper Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1388),
        // "8x Annealed Copper Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1389),
        // "12x Annealed Copper Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1390),
        // "16x Annealed Copper Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1391),
        // "1x Electrical Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11496),
        // "2x Electrical Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11497),
        // "4x Electrical Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11498),
        // "8x Electrical Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11499),
        // "12x Electrical Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11500),
        // "16x Electrical Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11501) };

    public static final ItemStack[] HV_Tier_Cable = new ItemStack[] {
        // "1x Kanthal Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1406),
        // "2x Kanthal Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1407),
        // "4x Kanthal Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1408),
        // "8x Kanthal Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1409),
        // "12x Kanthal Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1410),
        // "16x Kanthal Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1411),
        // "1x Gold Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1426),
        // "2x Gold Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1427),
        // "4x Gold Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1428),
        // "8x Gold Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1429),
        // "12x Gold Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1430),
        // "16x Gold Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1431),
        // "1x Electrum Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1446),
        // "2x Electrum Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1447),
        // "4x Electrum Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1448),
        // "8x Electrum Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1449),
        // "12x Electrum Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1450),
        // "16x Electrum Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1451),
        // "1x Silver Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1466),
        // "2x Silver Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1467),
        // "4x Silver Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1468),
        // "8x Silver Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1469),
        // "12x Silver Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1470),
        // "16x Silver Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1471),
        // "1x Blue Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1486),
        // "2x Blue Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1487),
        // "4x Blue Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1488),
        // "8x Blue Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1489),
        // "12x Blue Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1490),
        // "16x Blue Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1491),
        // "1x Energetic Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11516),
        // "2x Energetic Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11517),
        // "4x Energetic Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11518),
        // "8x Energetic Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11519),
        // "12x Energetic Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11510),
        // "16x Energetic Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11511) };

    public static final ItemStack[] EV_Tier_Cable = new ItemStack[] {
        // "1x Nichrome Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1506),
        // "2x Nichrome Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1507),
        // "4x Nichrome Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1508),
        // "8x Nichrome Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1509),
        // "12x Nichrome Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1510),
        // "16x Nichrome Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1511),
        // "1x Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1526),
        // "2x Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1527),
        // "4x Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1528),
        // "8x Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1529),
        // "12x Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1530),
        // "16x Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1531),
        // "1x Black Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1546),
        // "2x Black Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1547),
        // "4x Black Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1548),
        // "8x Black Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1549),
        // "12x Black Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1550),
        // "16x Black Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1551),
        // "1x Titanium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1566),
        // "2x Titanium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1567),
        // "4x Titanium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1568),
        // "8x Titanium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1569),
        // "12x Titanium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1570),
        // "16x Titanium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1571),
        // "1x Aluminium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1586),
        // "2x Aluminium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1587),
        // "4x Aluminium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1588),
        // "8x Aluminium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1589),
        // "12x Aluminium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1590),
        // "16x Aluminium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1591),
        // "1x TPV-Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1846),
        // "2x TPV-Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1847),
        // "4x TPV-Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1848),
        // "8x TPV-Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1849),
        // "12x TPV-Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1850),
        // "16x TPV-Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1851),
        // "1x Vibrant Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11536),
        // "2x Vibrant Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11537),
        // "4x Vibrant Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11538),
        // "8x Vibrant Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11539),
        // "12x Vibrant Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11540),
        // "16x Vibrant Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11541) };

    public static final ItemStack[] IV_Tier_Cable = new ItemStack[] {
        // "1x Platinum Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1646),
        // "2x Platinum Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1647),
        // "4x Platinum Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1648),
        // "8x Platinum Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1649),
        // "12x Platinum Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1650),
        // "16x Platinum Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1651),
        // "1x Tungstensteel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1666),
        // "2x Tungstensteel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1667),
        // "4x Tungstensteel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1668),
        // "8x Tungstensteel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1669),
        // "12x Tungstensteel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1670),
        // "16x Tungstensteel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1671),
        // "1x Tungsten Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1686),
        // "2x Tungsten Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1687),
        // "4x Tungsten Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1688),
        // "8x Tungsten Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1689),
        // "12x Tungsten Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1690),
        // "16x Tungsten Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1691),
        // "1x End Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1866),
        // "2x End Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1867),
        // "4x End Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1868),
        // "8x End Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1869),
        // "12x End Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1870),
        // "16x End Steel Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1871) };

    public static final ItemStack[] LuV_Tier_Cable = new ItemStack[] {
        // "1x Osmium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1626),
        // "2x Osmium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1627),
        // "4x Osmium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1628),
        // "8x Osmium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1629),
        // "12x Osmium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1630),
        // "16x Osmium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1631),
        // "1x HSS-G Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1706),
        // "2x HSS-G Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1707),
        // "4x HSS-G Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1708),
        // "8x HSS-G Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1709),
        // "12x HSS-G Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1710),
        // "16x HSS-G Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1711),
        // "1x Niobium-Titanium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1726),
        // "2x Niobium-Titanium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1727),
        // "4x Niobium-Titanium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1728),
        // "8x Niobium-Titanium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1729),
        // "12x Niobium-Titanium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1730),
        // "16x Niobium-Titanium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1731),
        // "1x Vanadium-Gallium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1746),
        // "2x Vanadium-Gallium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1747),
        // "4x Vanadium-Gallium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1748),
        // "8x Vanadium-Gallium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1749),
        // "12x Vanadium-Gallium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1750),
        // "16x Vanadium-Gallium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1751),
        // "1x Yttrium Barium Cuprate Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1766),
        // "2x Yttrium Barium Cuprate Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1767),
        // "4x Yttrium Barium Cuprate Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1768),
        // "8x Yttrium Barium Cuprate Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1769),
        // "12x Yttrium Barium Cuprate Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1770),
        // "16x Yttrium Barium Cuprate Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1771),
        // "1x Melodic Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11556),
        // "2x Melodic Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11557),
        // "4x Melodic Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11558),
        // "8x Melodic Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11559),
        // "12x Melodic Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11560),
        // "16x Melodic Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11561),
        // "1x HSS-E Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11596),
        // "2x HSS-E Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11597),
        // "4x HSS-E Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11598),
        // "8x HSS-E Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11599),
        // "12x HSS-E Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11600),
        // "16x HSS-E Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11601) };

    public static final ItemStack[] ZPM_Tier_Cable = new ItemStack[] {
        // "1x Naquadah Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1786),
        // "2x Naquadah Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1787),
        // "4x Naquadah Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1788),
        // "8x Naquadah Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1789),
        // "12x Naquadah Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1790),
        // "16x Naquadah Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1791),
        // "1x Trinium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11456),
        // "2x Trinium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11457),
        // "4x Trinium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11458),
        // "8x Trinium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11459),
        // "12x Trinium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11460),
        // "16x Trinium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11461),
        // "1x Osmiridium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11616),
        // "2x Osmiridium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11617),
        // "4x Osmiridium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11618),
        // "8x Osmiridium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11619),
        // "12x Osmiridium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11620),
        // "16x Osmiridium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11621),
        // "1x Signalium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32755),
        // "2x Signalium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32756),
        // "4x Signalium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32757),
        // "8x Signalium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32758),
        // "12x Signalium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32759),
        // "16x Signalium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32760) };

    public static final ItemStack[] UV_Tier_Cable = new ItemStack[] {
        // "1x Naquadah Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1806),
        // "2x Naquadah Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1807),
        // "4x Naquadah Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1808),
        // "8x Naquadah Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1809),
        // "12x Naquadah Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1810),
        // "16x Naquadah Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1811),
        // "1x Duranium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1826),
        // "2x Duranium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1827),
        // "4x Duranium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1828),
        // "8x Duranium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1829),
        // "12x Duranium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1830),
        // "16x Duranium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1831),
        // "1x Fluxed Electrum Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1906),
        // "2x Fluxed Electrum Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1907),
        // "4x Fluxed Electrum Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1908),
        // "8x Fluxed Electrum Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1909),
        // "12x Fluxed Electrum Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1910),
        // "16x Fluxed Electrum Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1911),
        // "1x Stellar Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11576),
        // "2x Stellar Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11577),
        // "4x Stellar Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11578),
        // "8x Stellar Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11579),
        // "12x Stellar Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11580),
        // "16x Stellar Alloy Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11581),
        // "1x Lumiium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32743),
        // "2x Lumiium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32744),
        // "4x Lumiium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32745),
        // "8x Lumiium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32746),
        // "12x Lumiium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32747),
        // "16x Lumiium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32748) };

    public static final ItemStack[] UHV_Tier_Cable = new ItemStack[] {
        // "1x Bedrockium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11316),
        // "2x Bedrockium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11317),
        // "4x Bedrockium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11318),
        // "8x Bedrockium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11319),
        // "12x Bedrockium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11320),
        // "16x Bedrockium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11321),
        // "1x HSS-S Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11476),
        // "2x HSS-S Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11477),
        // "4x HSS-S Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11478),
        // "8x HSS-S Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11479),
        // "12x HSS-S Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11480),
        // "16x HSS-S Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11481) };

    public static final ItemStack[] UEV_Tier_Cable = new ItemStack[] {
        // "1x Draconium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11336),
        // "2x Draconium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11337),
        // "4x Draconium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11338),
        // "8x Draconium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11339),
        // "12x Draconium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11340),
        // "16x Draconium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11341) };

    public static final ItemStack[] UIV_Tier_Cable = new ItemStack[] {
        // "1x Nether Star Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11356),
        // "2x Nether Star Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11357),
        // "4x Nether Star Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11358),
        // "8x Nether Star Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11359),
        // "12x Nether Star Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11360),
        // "16x Nether Star Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11361) };

    public static final ItemStack[] UMV_Tier_Cable = new ItemStack[] {
        // "1x Quantium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11376),
        // "2x Quantium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11377),
        // "4x Quantium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11378),
        // "8x Quantium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11379),
        // "12x Quantium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11380),
        // "16x Quantium Cable"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11381) };

    // Machine
    public static final ItemStack[] Steam_Tier_Machine = new ItemStack[] {
        // "Steam Oven"
        getModItem(Railcraft.ID, "machine.alpha", 1L, 3),
        // "Water Tank Siding"
        getModItem(Railcraft.ID, "machine.alpha", 1L, 14),
        // "Small Coal Boiler"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 100),
        // "Large Coal Boiler"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 101),
        // "Reinforced Lava Boiler"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 102),
        // "Steam Furnace"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 103),
        // "High Pressure Steam Furnace"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 104),
        // "Simple Solar Boiler"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 105),
        // "Steam Macerator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 106),
        // "High Pressure Steam Macerator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 107),
        // "Steam Extractor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 109),
        // "High Pressure Steam Extractor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 110),
        // "Steam Forge Hammer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 112),
        // "High Pressure Steam Forge Hammer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 113),
        // "Advanced Solar Boiler"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 114),
        // "Steam Compressor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 115),
        // "High Pressure Steam Compressor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 116),
        // "Steam Alloy Smelter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 118) };

    public static final ItemStack[] LV_Tier_Machine = new ItemStack[] {
        // "Basic Alloy Smelter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 201),
        // "Basic Assembling Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 211),
        // "Basic Bending Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 221),
        // "Basic Canning Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 231),
        // "Basic Compressor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 241),
        // "Basic Cutting Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 251),
        // "Basic Electric Furnace"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 261),
        // "Basic Extractor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 271),
        // "Basic Extruder"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 281),
        // "Basic Lathe"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 291),
        // "Basic Macerator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 301),
        // "Basic Microwave"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 311),
        // "Basic Printer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 321),
        // "Basic Recycler"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 331),
        // "Basic Scanner"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 341),
        // "Basic Wiremill"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 351),
        // "Basic Centrifuge"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 361),
        // "Basic Electrolyzer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 371),
        // "Basic Thermal Centrifuge"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 381),
        // "Basic Ore Washing Plant"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 391),
        // "Basic Packager"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 401),
        // "Basic Unpackager"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 411),
        // "Basic Chemical Reactor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 421),
        // "Basic Fluid Canner"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 431),
        // "Basic Rock Breaker"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 441),
        // "Basic Mass Fabricator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 461),
        // "Basic Amplifabricator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 471),
        // "Basic Replicator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 481),
        // "Basic Brewery"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 491),
        // "Basic Fermenter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 501),
        // "Basic Fluid Extractor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 511),
        // "Basic Fluid Solidifier"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 521),
        // "Basic Distillery"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 531),
        // "Basic Chemical Bath"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 541),
        // "Basic Polarizer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 551),
        // "Basic Electromagnetic Separator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 561),
        // "Basic Autoclave"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 571),
        // "Basic Mixer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 581),
        // "Basic Precision Laser Engraver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 591),
        // "Basic Forming Press"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 601),
        // "Basic Forge Hammer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 611),
        // "Basic Fluid Heater"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 621),
        // "Basic Slicing Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 631),
        // "Basic Sifting Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 641),
        // "Basic Arc Furnace"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 651),
        // "Basic Plasma Arc Furnace"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 661),
        // "Basic Electric Oven"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 671),
        // "Basic Miner"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 679),
        // "Basic Semifluid Generator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 837),
        // "Basic Combustion Generator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1110),
        // "Basic Gas Turbine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1115),
        // "Basic Steam Turbine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1120),
        // "Novice Magic Energy Converter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1123),
        // "Novice Magic Energy Absorber"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1127),
        // "Basic Pump"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1140),
        // "Basic Monster Repellator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1146),
        // "Basic Circuit Assembler"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1180),
        // "Advanced Seismic Prospector LV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2102),
        // "Basic Solar Panel"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2733),
        // "Basic World Accelerator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11100),
        // "Basic Crop Gene Extractor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12501),
        // "Basic Crop Replicator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12510),
        // "Basic Crop Synthesiser"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12519),
        // "Basic CropWeedPicker"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12528),
        // "Acid Generator LV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12793),
        // "Basic Electric Jukebox"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 14301),
        // "Basic Auto-Chisel"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31066),
        // "Auto Workbench (LV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31091),
        // "Crop Manager (LV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31111),
        // "Simple Washer I"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31790) };

    public static final ItemStack[] MV_Tier_Machine = new ItemStack[] {
        // "Advanced Alloy Smelter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 202),
        // "Advanced Assembling Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 212),
        // "Advanced Bending Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 222),
        // "Advanced Canning Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 232),
        // "Advanced Compressor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 242),
        // "Advanced Cutting Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 252),
        // "Advanced Electric Furnace"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 262),
        // "Advanced Extractor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 272),
        // "Advanced Extruder"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 282),
        // "Advanced Lathe"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 292),
        // "Advanced Macerator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 302),
        // "Advanced Microwave"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 312),
        // "Advanced Printer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 322),
        // "Advanced Recycler"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 332),
        // "Advanced Scanner"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 342),
        // "Advanced Wiremill"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 352),
        // "Advanced Centrifuge"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 362),
        // "Advanced Electrolyzer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 372),
        // "Advanced Thermal Centrifuge"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 382),
        // "Advanced Ore Washing Plant"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 392),
        // "Advanced Packager"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 402),
        // "Advanced Unpackager"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 412),
        // "Advanced Chemical Reactor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 422),
        // "Advanced Fluid Canner"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 432),
        // "Advanced Rock Breaker"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 442),
        // "Advanced Mass Fabricator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 462),
        // "Advanced Amplifabricator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 472),
        // "Advanced Replicator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 482),
        // "Advanced Brewery"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 492),
        // "Advanced Fermenter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 502),
        // "Advanced Fluid Extractor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 512),
        // "Advanced Fluid Solidifier"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 522),
        // "Advanced Distillery"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 532),
        // "Advanced Chemical Bath"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 542),
        // "Advanced Polarizer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 552),
        // "Advanced Electromagnetic Separator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 562),
        // "Advanced Autoclave"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 572),
        // "Advanced Mixer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 582),
        // "Advanced Precision Laser Engraver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 592),
        // "Advanced Forming Press"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 602),
        // "Advanced Forge Hammer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 612),
        // "Advanced Fluid Heater"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 622),
        // "Advanced Slicing Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 632),
        // "Advanced Sifting Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 642),
        // "Advanced Arc Furnace"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 652),
        // "Advanced Plasma Arc Furnace"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 662),
        // "Advanced Electric Oven"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 672),
        // "Good Miner"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 680),
        // "Advanced Semifluid Generator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 838),
        // "Basic Dehydrator I"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 911),
        // "Advanced Combustion Generator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1111),
        // "Advanced Gas Turbine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1116),
        // "Advanced Steam Turbine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1121),
        // "Adept Magic Energy Converter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1124),
        // "Adept Magic Energy Absorber"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1128),
        // "Good Pump"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1141),
        // "Advanced Monster Repellator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1147),
        // "Advanced Circuit Assembler"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1181),
        // "Advanced Seismic Prospector MV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2103),
        // "Advanced Solar Panel"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2734),
        // "Advanced World Accelerator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11101),
        // "Advanced Crop Gene Extractor I"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12502),
        // "Advanced Crop Replicator I"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12511),
        // "Advanced Crop Synthesiser I"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12520),
        // "Acid Generator MV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12726),
        // "Advanced Electric Jukebox"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 14302),
        // "Advanced MagLev Pylon"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 29990),
        // "Simple Washer II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31017),
        // "Advanced Auto-Chisel"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31067),
        // "Auto Workbench (MV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31092),
        // "Crop Manager (MV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31112) };

    public static final ItemStack[] HV_Tier_Machine = new ItemStack[] {
        // "Advanced Alloy Smelter II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 203),
        // "Advanced Assembling Machine II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 213),
        // "Advanced Bending Machine II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 223),
        // "Advanced Canning Machine II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 233),
        // "Advanced Compressor II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 243),
        // "Advanced Cutting Machine II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 253),
        // "Advanced Electric Furnace II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 263),
        // "Advanced Extractor II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 273),
        // "Advanced Extruder II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 283),
        // "Advanced Lathe II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 293),
        // "Universal Macerator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 303),
        // "Advanced Microwave II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 313),
        // "Advanced Printer II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 323),
        // "Advanced Recycler II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 333),
        // "Advanced Scanner II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 343),
        // "Advanced Wiremill II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 353),
        // "Turbo Centrifuge"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 363),
        // "Advanced Electrolyzer II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 373),
        // "Advanced Thermal Centrifuge II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 383),
        // "Advanced Ore Washing Plant II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 393),
        // "Advanced Packager II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 403),
        // "Advanced Unpackager II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 413),
        // "Advanced Chemical Reactor II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 423),
        // "Quick Fluid Canner"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 433),
        // "Advanced Rock Breaker II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 443),
        // "Advanced Mass Fabricator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 463),
        // "Advanced Amplifabricator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 473),
        // "Advanced Replicator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 483),
        // "Advanced Brewery II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 493),
        // "Advanced Fermenter II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 503),
        // "Advanced Fluid Extractor II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 513),
        // "Advanced Fluid Solidifier II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 523),
        // "Advanced Distillery II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 533),
        // "Advanced Chemical Bath II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 543),
        // "Advanced Polarizer II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 553),
        // "Advanced Electromagnetic Separator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 563),
        // "Advanced Autoclave II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 573),
        // "Advanced Mixer II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 583),
        // "Advanced Mixer II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 593),
        // "Advanced Forming Press II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 603),
        // "Advanced Forge Hammer II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 613),
        // "Advanced Fluid Heater II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 623),
        // "Advanced Slicing Machine II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 633),
        // "Advanced Sifting Machine II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 643),
        // "Advanced Arc Furnace II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 653),
        // "Advanced Plasma Arc Furnace II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 663),
        // "Advanced Electric Oven II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 673),
        // "Advanced Miner"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 681),
        // "Turbo Semifluid Generator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 839),
        // "Basic Dehydrator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 912),
        // "Turbo Combustion Generator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1112),
        // "Turbo Gas Turbine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1117),
        // "Turbo Steam Turbine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1122),
        // "Master Magic Energy Converter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1125),
        // "Master Magic Energy Absorber"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1129),
        // "Advanced Pump"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1142),
        // "Advanced Monster Repellator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1148),
        // "HV Microwave Energy Transmitter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1161),
        // "Lightning Rod"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1174),
        // "Advanced Circuit Assembler II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1182),
        // "Advanced Seismic Prospector HV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2104),
        // "Advanced Solar Panel II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2735),
        // "Advanced World Accelerator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11102),
        // "Advanced Crop Gene Extractor II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12503),
        // "Advanced Crop Replicator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12512),
        // "Advanced Crop Synthesiser II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12521),
        // "Bio Lab"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12699),
        // "Acid Generator HV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12727),
        // "Advanced Electric Jukebox II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 14303),
        // "Advanced MagLev Pylon II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 29991),
        // "Precision Auto-Chisel"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31068),
        // "Auto Workbench (HV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31093),
        // "Crop Manager (HV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31113),
        // "Simple Washer III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31791) };

    public static final ItemStack[] EV_Tier_Machine = new ItemStack[] {
        // "Advanced Alloy Smelter III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 204),
        // "Advanced Assembling Machine III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 214),
        // "Advanced Bending Machine III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 224),
        // "Advanced Canning Machine III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 234),
        // "Advanced Compressor III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 244),
        // "Advanced Cutting Machine III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 254),
        // "Advanced Electric Furnace III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 264),
        // "Advanced Extractor III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 274),
        // "Advanced Extruder III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 284),
        // "Advanced Lathe III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 294),
        // "Universal Pulverizer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 304),
        // "Advanced Microwave III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 314),
        // "Advanced Printer III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 324),
        // "Advanced Recycler III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 334),
        // "Advanced Scanner III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 344),
        // "Advanced Wiremill III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 354),
        // "Molecular Separator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 364),
        // "Advanced Electrolyzer III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 374),
        // "Advanced Thermal Centrifuge III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 384),
        // "Advanced Ore Washing Plant III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 394),
        // "Advanced Packager III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 404),
        // "Advanced Unpackager III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 414),
        // "Advanced Chemical Reactor III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 424),
        // "Turbo Fluid Canner"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 434),
        // "Advanced Rock Breaker III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 444),
        // "Advanced Mass Fabricator III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 464),
        // "Advanced Amplifabricator III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 474),
        // "Advanced Replicator III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 484),
        // "Advanced Brewery III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 494),
        // "Advanced Fermenter III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 504),
        // "Advanced Fluid Extractor III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 514),
        // "Advanced Fluid Solidifier III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 524),
        // "Advanced Distillery III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 534),
        // "Advanced Chemical Bath III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 544),
        // "Advanced Polarizer III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 554),
        // "Advanced Electromagnetic Separator III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 564),
        // "Advanced Autoclave III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 574),
        // "Advanced Mixer III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 584),
        // "Advanced Precision Laser Engraver III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 594),
        // "Advanced Forming Press III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 604),
        // "Advanced Forge Hammer III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 614),
        // "Advanced Fluid Heater III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 624),
        // "Advanced Slicing Machine III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 634),
        // "Advanced Sifting Machine III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 644),
        // "Advanced Arc Furnace III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 654),
        // "Advanced Plasma Arc Furnace III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 664),
        // "Advanced Electric Oven III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 674),
        // "Basic Rocket Engine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 793),
        // "Chemical Dehydrator I"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 813),
        // "Basic Geothermal Engine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 830),
        // "Turbo Semifluid Generator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 993),
        // "Turbo Supercharging Combustion Generator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1113),
        // "Turbo Gas Turbine II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1118),
        // "Grandmaster Magic Energy Absorber"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1130),
        // "Advanced Monster Repellator III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1149),
        // "EV Microwave Energy Transmitter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1162),
        // "Advanced Seismic Prospector EV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1173),
        // "Lightning Rod II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1175),
        // "Advanced Circuit Assembler III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1183),
        // "Naquadah Reactor Mark I"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1190),
        // "Plasma Generator Mark I"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1196),
        // "Advanced Solar Panel III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2736),
        // "Advanced World Accelerator III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11103),
        // "Advanced Crop Gene Extractor III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12504),
        // "Advanced Crop Replicator III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12513),
        // "Advanced Crop Synthesiser III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12522),
        // "Bio Lab"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12700),
        // "Acid Generator EV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12728),
        // "Extreme Music Mixer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 14304),
        // "Advanced MagLev Pylon III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 29992),
        // "Simple Washer IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31018),
        // "Auto Workbench (EV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31094),
        // "Crop Manager (EV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31114) };

    public static final ItemStack[] IV_Tier_Machine = new ItemStack[] {
        // "Advanced Alloy Smelter IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 205),
        // "Advanced Assembling Machine IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 215),
        // "Advanced Bending Machine IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 225),
        // "Advanced Canning Machine IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 235),
        // "Singularity Compressor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 245),
        // "Advanced Cutting Machine IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 255),
        // "Electron Excitement Processor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 265),
        // "Vacuum Extractor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 275),
        // "Advanced Extruder IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 285),
        // "Advanced Lathe IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 295),
        // "Blend-O-Matic 9001"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 305),
        // "Advanced Microwave IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 315),
        // "Advanced Printer IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 325),
        // "The Oblitterator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 335),
        // "Advanced Scanner IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 345),
        // "Advanced Wiremill IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 355),
        // "Molecular Cyclone"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 365),
        // "Molecular Disintegrator E-4908"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 375),
        // "Blaze Sweatshop T-6350"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 385),
        // "Blaze Sweatshop T-6350"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 395),
        // Boxinator
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 405),
        // Unboxinator
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 415),
        // "Advanced Chemical Reactor IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 425),
        // "Instant Fluid Canner"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 435),
        // "Cryogenic Magma Solidifier R-8200"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 445),
        // "Advanced Mass Fabricator IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 465),
        // "Advanced Amplifabricator IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 475),
        // "Advanced Replicator IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 485),
        // "Advanced Brewery IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 495),
        // "Advanced Fermenter IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 505),
        // "Advanced Fluid Extractor IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 515),
        // "Advanced Fluid Solidifier IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 525),
        // "Advanced Distillery IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 535),
        // "Advanced Chemical Bath IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 545),
        // "Advanced Polarizer IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 555),
        // "Advanced Electromagnetic Separator IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 565),
        // "Advanced Autoclave IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 575),
        // "Advanced Mixer IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 585),
        // "Advanced Precision Laser Engraver IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 595),
        // "Advanced Forming Press IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 605),
        // "Advanced Forge Hammer IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 615),
        // "Advanced Fluid Heater IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 625),
        // "Advanced Slicing Machine IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 635),
        // "Advanced Sifting Machine IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 645),
        // "Advanced Arc Furnace IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 655),
        // "Advanced Plasma Arc Furnace IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 665),
        // "Advanced Electric Oven IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 675),
        // "Advanced Rocket Engine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 794),
        // "Chemical Dehydrator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 814),
        // "Turbo Geothermal Engine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 831),
        // "Turbo Semifluid Generator III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 994),
        // "Ultimate Chemical Energy Releaser"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1114),
        // "Turbo Gas Turbine III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1119),
        // "Advanced Monster Repellator IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1150),
        // "IV Microwave Energy Transmitter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1163),
        // "Lightning Rod III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1176),
        // "Advanced Circuit Assembler IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1184),
        // "Naquadah Reactor Mark II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1191),
        // "Plasma Generator Mark II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1197),
        // "Advanced Solar Panel IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2737),
        // "Advanced World Accelerator IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11104),
        // "Advanced Crop Gene Extractor IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12505),
        // "Advanced Crop Replicator IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12514),
        // "Advanced Crop Synthesiser IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12523),
        // "Bio Lab"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12701),
        // "Duke Mix'em 3D"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 14305),
        // "Reactor Processing Unit I"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31031),
        // "Cold Trap I"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31033),
        // "Auto Workbench (IV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31095),
        // "Crop Manager (IV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31115),
        // "Simple Washer V"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31792) };

    public static final ItemStack[] LuV_Tier_Machine = new ItemStack[] {
        // "Advanced Printer V"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 326),
        // Boxinator
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 406),
        // Unboxinator
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 416),
        // "Turbo Rocket Engine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 795),
        // "Chemical Dehydrator III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 815),
        // "Vulcan Geothermal Engine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 832),
        // "Advanced Monster Repellator V"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1135),
        // "LuV Microwave Energy Transmitter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1164),
        // "Advanced Circuit Assembler V"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1185),
        // "Naquadah Reactor Mark III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1192),
        // "Plasma Generator Mark III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1198),
        // "Elite Solar Panel"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2738),
        // "Elite Alloy Smelter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10760),
        // "Elite Amplifabricator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10770),
        // "Elite Assembling Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10780),
        // "Elite Autoclave"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10790),
        // "Elite Bending Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10800),
        // "Elite Compressor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10810),
        // "Elite Cutting Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10820),
        // "Elite Distillery"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10830),
        // "Elite Electric Furnace"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10840),
        // "Elite Electrolyzer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10850),
        // "Elite Electromagnetic Separator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10860),
        // "Elite Extractor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10870),
        // "Elite Extruder"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10880),
        // "Elite Fluid Solidifier"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10890),
        // "Elite Forming Press"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10990),
        // "Elite Forge Hammer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10910),
        // "Elite Lathe"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10920),
        // "Elite Precision Laser Engraver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10930),
        // "Elite Pulverizer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10940),
        // "Elite Mass Fabricator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10950),
        // "Elite Microwave"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10960),
        // "Elite Ore Washing Plant"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10970),
        // "Elite Polarizer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10980),
        // "Elite Recycler"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10990),
        // "Elite Replicator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11000),
        // "Elite Scanner"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11010),
        // "Elite Sifting Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11020),
        // "Elite Slicing Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11028),
        // "Elite Thermal Centrifuge"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11040),
        // "Elite Wiremill"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11050),
        // "Elite Arc Furnace"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11070),
        // "Elite Centrifuge"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11080),
        // "Elite Plasma Arc Furnace"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11090),
        // "Elite World Accelerator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11105),
        // "Elite Brewery"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11120),
        // "Elite Canning Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11130),
        // "Elite Chemical Bath"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11140),
        // "Elite Chemical Bath"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11150),
        // "Elite Fermenter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11170),
        // "Elite Fluid Canner"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11180),
        // "Elite Fluid Extractor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11190),
        // "Elite Fluid Heater"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11200),
        // "Elite Mixer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11210),
        // "Cryogenic Magma Solidifier R-9200"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12080),
        // "Advanced Crop Gene Extractor V"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12506),
        // "Advanced Crop Replicator V"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12515),
        // "Advanced Crop Synthesiser V"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12524),
        // "Bio Lab"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12702),
        // "Bio Lab"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31019),
        // "Auto Workbench (LuV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31096),
        // "Crop Manager (LuV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31116) };

    public static final ItemStack[] ZPM_Tier_Machine = new ItemStack[] {
        // "Advanced Printer VI"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 327),
        // Boxinator
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 407),
        // Unboxinator
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 417),
        // "Chemical Dehydrator IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 816),
        // "Advanced Monster Repellator VI"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1136),
        // "ZPM Microwave Energy Transmitter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1165),
        // "Advanced Circuit Assembler VI"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1186),
        // "Naquadah Reactor Mark IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1188),
        // "Elite Solar Panel II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2739),
        // "Plasma Generator Mark IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10752),
        // "Elite Alloy Smelter II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10761),
        // "Elite Amplifabricator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10771),
        // "Elite Assembling Machine II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10781),
        // "Elite Autoclave II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10791),
        // "Elite Bending Machine II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10801),
        // "Elite Compressor II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10811),
        // "Elite Cutting Machine II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10821),
        // "Elite Distillery II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10831),
        // "Elite Electric Furnace II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10841),
        // "Elite Electrolyzer II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10851),
        // "Elite Electromagnetic Separator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10861),
        // "Elite Extractor II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10871),
        // "Elite Extruder II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10881),
        // "Elite Fluid Solidifier II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10891),
        // "Elite Forming Press II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10901),
        // "Elite Forming Press II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10911),
        // "Elite Forming Press II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10921),
        // "Elite Precision Laser Engraver II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10931),
        // "Elite Pulverizer II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10941),
        // "Elite Mass Fabricator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10951),
        // "Elite Microwave II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10961),
        // "Elite Microwave II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10971),
        // "Elite Polarizer II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10981),
        // "Elite Polarizer II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10991),
        // "Elite Replicator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11001),
        // "Elite Scanner II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11011),
        // "Elite Sifting Machine II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11021),
        // "Elite Slicing Machine II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11029),
        // "Elite Thermal Centrifuge II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11041),
        // "Elite Wiremill II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11051),
        // "Elite Arc Furnace II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11071),
        // "Elite Centrifuge II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11081),
        // "Elite Plasma Arc Furnace II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11091),
        // "Elite World Accelerator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11106),
        // "Elite Brewery II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11121),
        // "Elite Canning Machine II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11131),
        // "Elite Chemical Bath II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11141),
        // "Elite Chemical Reactor II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11151),
        // "Elite Fermenter II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11171),
        // "Elite Fluid Canner II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11181),
        // "Elite Fluid Extractor II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11191),
        // "Elite Fluid Heater II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11201),
        // "Elite Mixer II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11211),
        // "Cryogenic Magma Solidifier R-10200"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12081),
        // "Advanced Crop Gene Extractor VI"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12507),
        // "Advanced Crop Replicator VI"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12516),
        // "Advanced Crop Synthesiser VI"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12525),
        // "Bio Lab"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12703),
        // "Reactor Processing Unit II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31032),
        // "Cold Trap II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31034),
        // "Auto Workbench (ZPM)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31097),
        // "Crop Manager (ZPM)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31117),
        // "Simple Washer VII"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31793) };

    public static final ItemStack[] UV_Tier_Machine = new ItemStack[] {
        // "Advanced Printer VII"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 328),
        // Boxinator
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 408),
        // Unboxinator
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 418),
        // "Advanced Monster Repellator VII"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1137),
        // "UV Microwave Energy Transmitter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1166),
        // "Advanced Circuit Assembler VII"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1187),
        // "Naquadah Reactor Mark V"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1189),
        // "Ultimate Solar Panel"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2740),
        // "Industrial Apiary"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 9399),
        // "Industrial Apiary"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10753),
        // "Ultimate Alloy Integrator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10762),
        // "Ultimate Amplicreator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10772),
        // "Ultimate Assembly Constructor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10782),
        // "Ultimate Pressure Cooker"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10792),
        // "Ultimate Bending Unit"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10802),
        // "Ultimate Matter Constrictor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10812),
        // "Ultimate Object Divider"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10822),
        // "Ultimate Fraction Splitter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10832),
        // "Ultimate Atom Stimulator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10842),
        // "Ultimate Ionizer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10852),
        // "Ultimate Magnetar Separator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10862),
        // "Ultimate Extractinator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10872),
        // "Ultimate Shape Driver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10882),
        // "Ultimate Fluid Petrificator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10892),
        // "Ultimate Surface Shifter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10902),
        // "Ultimate Impact Modulator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10912),
        // "Ultimate Turn-O-Matic"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10922),
        // "Ultimate Exact Photon Cannon"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10932),
        // "Ultimate Shape Eliminator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10942),
        // "Ultimate Existence Initiator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10952),
        // "Ultimate UFO Engine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10962),
        // "Ultimate Ore Washing Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10972),
        // "Ultimate Magnetism Inducer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10982),
        // "Ultimate Scrap-O-Matic"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10992),
        // "Ultimate Elemental Composer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11002),
        // "Ultimate Electron Microscope"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11012),
        // "Ultimate Pulsation Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11022),
        // "Ultimate Quantum Slicer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11030),
        // "Ultimate Fire Cyclone"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11042),
        // "Ultimate Wire Transfigurator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11052),
        // "Ultimate Short Circuit Heater"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11072),
        // "Ultimate Molecular Tornado"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11082),
        // "Ultimate Plasma Discharge Heater"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11092),
        // "Ultimate Time Anomaly"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11107),
        // "Ultimate Brew Rusher"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11122),
        // "Ultimate Can Operator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11132),
        // "Ultimate Chemical Dunktron"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11142),
        // "Ultimate Chemical Perforer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11152),
        // "Ultimate Fermentation Hastener"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11172),
        // "Ultimate Liquid Can Actuator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11182),
        // "Ultimate Liquefying Sucker"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11192),
        // "Ultimate Heat Infuser"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11202),
        // "Ultimate Matter Organizer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11212),
        // "Cryogenic Magma Solidifier R-11200"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12082),
        // "Advanced Crop Gene Extractor VII"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12508),
        // "Advanced Crop Replicator VII"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12517),
        // "Advanced Crop Synthesiser VII"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12526),
        // "Bio Lab"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12704),
        // "Simple Washer VIII"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31020),
        // "Auto Workbench (UV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31098),
        // "Crop Manager (UV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31118) };

    public static final ItemStack[] UHV_Tier_Machine = new ItemStack[] {
        // Teleporter
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1145),
        // "Epic Alloy Integrator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10763),
        // "Epic Amplicreator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10773),
        // "Epic Assembly Constructor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10783),
        // "Epic Pressure Cooker"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10793),
        // "Epic Bending Unit"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10803),
        // "Epic Matter Constrictor"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10813),
        // "Epic Object Divider"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10823),
        // "Epic Fraction Splitter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10833),
        // "Epic Atom Stimulator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10843),
        // "Epic Ionizer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10853),
        // "Epic Magnetar Separator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10863),
        // "Epic Extractinator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10873),
        // "Epic Shape Driver"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10883),
        // "Epic Fluid Petrificator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10893),
        // "Epic Surface Shifter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10903),
        // "Epic Impact Modulator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10913),
        // "Epic Turn-O-Matic"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10923),
        // "Epic Exact Photon Cannon"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10933),
        // "Epic Shape Eliminator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10943),
        // "Epic Existence Initiator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10953),
        // "Epic UFO Engine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10963),
        // "Epic Ore Washing Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10973),
        // "Epic Magnetism Inducer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10983),
        // "Epic Scrap-O-Matic"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10993),
        // "Epic Elemental Composer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11003),
        // "Epic Electron Microscope"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11013),
        // "Epic Pulsation Filter"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11023),
        // "Epic Quantum Slicer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11033),
        // "Epic Fire Cyclone"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11043),
        // "Epic Wire Transfigurator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11053),
        // "Epic Short Circuit Heater"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11073),
        // "Epic Molecular Tornado"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11083),
        // "Epic Plasma Discharge Heater"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11093),
        // "Epic Brew Rusher"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11123),
        // "Epic Can Operator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11133),
        // "Epic Chemical Dunktron"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11143),
        // "Epic Chemical Performer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11153),
        // "Epic Fermentation Hastener"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11173),
        // "Epic Liquid Can Actuator"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11183),
        // "Epic Liquefying Sucker"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11193),
        // "Epic Heat Infuser"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11203),
        // "Epic Matter Organizer"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11213),
        // "Cryogenic Magma Solidifier R-12200"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12083),
        // "Ultimate Circuit Assembling Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12090),
        // "Advanced Crop Gene Extractor VIII"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12509),
        // "Advanced Crop Replicator VIII"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12518),
        // "Advanced Crop Synthesiser VIII"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12527),
        // "Bio Lab"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12705) };

    public static final ItemStack[] UEV_Tier_Machine = new ItemStack[] {
        // "Epic Alloy Integrator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10764),
        // "Epic Amplicreator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10774),
        // "Epic Assembly Constructor II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10784),
        // "Epic Pressure Cooker II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10794),
        // "Epic Bending Unit II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10804),
        // "Epic Matter Constrictor II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10814),
        // "Epic Object Divider II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10824),
        // "Epic Fraction Splitter II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10834),
        // "Epic Atom Stimulator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10844),
        // "Epic Ionizer II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10854),
        // "Epic Magnetar Separator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10864),
        // "Epic Extractinator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10874),
        // "Epic Shape Driver II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10884),
        // "Epic Fluid Petrificator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10894),
        // "Epic Surface Shifter II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10904),
        // "Epic Impact Modulator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10914),
        // "Epic Turn-O-Matic II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10924),
        // "Epic Exact Photon Cannon II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10934),
        // "Epic Shape Eliminator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10944),
        // "Epic Existence Initiator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10954),
        // "Epic UFO Engine II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10964),
        // "Epic Ore Washing Machine II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10974),
        // "Epic Magnetism Inducer II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10984),
        // "Epic Scrap-O-Matic II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10994),
        // "Epic Elemental Composer II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11004),
        // "Epic Electron Microscope II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11014),
        // "Epic Pulsation Filter II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11024),
        // "Epic Quantum Slicer II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11034),
        // "Epic Fire Cyclone II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11044),
        // "Epic Wire Transfigurator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11054),
        // "Epic Short Circuit Heater II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11074),
        // "Epic Molecular Tornado II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11084),
        // "Epic Plasma Discharge Heater II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11094),
        // "Epic Brew Rusher II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11124),
        // "Epic Can Operator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11134),
        // "Epic Chemical Dunktron II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11144),
        // "Epic Chemical Performer II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11154),
        // "Epic Fermentation Hastener II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11174),
        // "Epic Liquid Can Actuator II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11184),
        // "Epic Liquefying Sucker II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11194),
        // "Epic Heat Infuser II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11204),
        // "Epic Matter Organizer II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11214),
        // "Cryogenic Magma Solidifier R-13200"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12084),
        // "Ultimate Circuit Assembling Machine II"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12091),
        // "Bio Lab"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12706) };

    public static final ItemStack[] UIV_Tier_Machine = new ItemStack[] {
        // "Epic Alloy Integrator III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10765),
        // "Epic Amplicreator III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10775),
        // "Epic Assembly Constructor III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10785),
        // "Epic Pressure Cooker III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10795),
        // "Epic Bending Unit III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10805),
        // "Epic Matter Constrictor III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10815),
        // "Epic Object Divider III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10825),
        // "Epic Fraction Splitter III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10835),
        // "Epic Atom Stimulator III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10845),
        // "Epic Ionizer III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10855),
        // "Epic Magnetar Separator III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10865),
        // "Epic Extractinator III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10875),
        // "Epic Shape Driver III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10885),
        // "Epic Fluid Petrificator III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10895),
        // "Epic Surface Shifter III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10905),
        // "Epic Impact Modulator III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10915),
        // "Epic Turn-O-Matic III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10925),
        // "Epic Exact Photon Cannon III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10935),
        // "Epic Shape Eliminator III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10945),
        // "Epic Existence Initiator III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10955),
        // "Epic UFO Engine III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10965),
        // "Epic Ore Washing Machine III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10975),
        // "Epic Magnetism Inducer III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10985),
        // "Epic Scrap-O-Matic III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10995),
        // "Epic Elemental Composer III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11005),
        // "Epic Elemental Composer III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11015),
        // "Epic Pulsation Filter III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11025),
        // "Epic Quantum Slicer III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11035),
        // "Epic Fire Cyclone III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11045),
        // "Epic Wire Transfigurator III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11055),
        // "Epic Short Circuit Heater III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11075),
        // "Epic Molecular Tornado III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11085),
        // "Epic Plasma Discharge Heater III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11095),
        // "Epic Brew Rusher III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11125),
        // "Epic Can Operator III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11135),
        // "Epic Chemical Dunktron III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11145),
        // "Epic Chemical Dunktron III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11155),
        // "Epic Fermentation Hastener III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11175),
        // "Epic Liquid Can Actuator III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11185),
        // "Epic Liquefying Sucker III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11195),
        // "Epic Heat Infuser III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11205),
        // "Epic Matter Organizer III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11215),
        // "Cryogenic Magma Solidifier R-14200"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12085),
        // "Ultimate Circuit Assembling Machine III"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12092),
        // "Bio Lab"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12707) };

    public static final ItemStack[] UMV_Tier_Machine = new ItemStack[] {
        // "Epic Alloy Integrator IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10766),
        // "Epic Amplicreator IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10776),
        // "Epic Assembly Constructor IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10786),
        // "Epic Pressure Cooker IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10796),
        // "Epic Bending Unit IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10806),
        // "Epic Matter Constrictor IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10816),
        // "Epic Object Divider IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10826),
        // "Epic Fraction Splitter IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10836),
        // "Epic Atom Stimulator IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10846),
        // "Epic Ionizer IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10856),
        // "Epic Magnetar Separator IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10866),
        // "Epic Extractinator IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10876),
        // "Epic Shape Driver IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10886),
        // "Epic Fluid Petrificator IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10896),
        // "Epic Surface Shifter IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10906),
        // "Epic Impact Modulator IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10916),
        // "Epic Turn-O-Matic IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10926),
        // "Epic Exact Photon Cannon IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10936),
        // "Epic Shape Eliminator IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10946),
        // "Epic Existence Initiator IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10956),
        // "Epic UFO Engine IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10966),
        // "Epic Ore Washing Machine IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10976),
        // "Epic Magnetism Inducer IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10986),
        // "Epic Scrap-O-Matic IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10996),
        // "Epic Elemental Composer IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11006),
        // "Epic Electron Microscope IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11016),
        // "Epic Pulsation Filter IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11026),
        // "Epic Quantum Slicer IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11036),
        // "Epic Fire Cyclone IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11046),
        // "Epic Wire Transfigurator IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11056),
        // "Epic Short Circuit Heater IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11076),
        // "Epic Molecular Tornado IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11086),
        // "Epic Plasma Discharge Heater IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11096),
        // "Epic Brew Rusher IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11126),
        // "Epic Can Operator IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11136),
        // "Epic Chemical Dunktron IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11146),
        // "Epic Chemical Performer IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11156),
        // "Epic Fermentation Hastener IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11176),
        // "Epic Liquid Can Actuator IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11186),
        // "Epic Liquefying Sucker IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11196),
        // "Epic Heat Infuser IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11206),
        // "Epic Matter Organizer IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11216),
        // "Cryogenic Magma Solidifier R-15200"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12086),
        // "Ultimate Circuit Assembling Machine IV"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12093),
        // "Bio Lab"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12708) };

    public static final ItemStack[] UXV_Tier_Machine = new ItemStack[] {
        // "Ultimate Circuit Assembling Machine V"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12094) };

    public static final ItemStack[] MAX_Tier_Machine = new ItemStack[] {
        // "MAX Circuit Assembling Machine"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12096) };

    // Misc
    public static final ItemStack[] Steam_Tier_Misc = new ItemStack[] {
        // "LootBag (Steam Age)"
        getModItem(EnhancedLootBags.ID, "lootbag", 1L, 2) };

    public static final ItemStack[] ULV_Tier_Misc = new ItemStack[] {
        // "Wrap of ULV Circuits"
        getModItem(GoodGenerator.ID, "circuitWrap", 1L, 0),
        // "Tantalum Capacitor"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32499),
        // "Vacuum Tube"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32700),
        // "NAND Chip"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32075),
        // "Energy Core [ULV]"
        getModItem(GTPlusPlus.ID, "item.itemBufferCore1", 1L) };

    public static final ItemStack[] LV_Tier_Misc = new ItemStack[] {
        // "Wrap of LV Circuits"
        getModItem(GoodGenerator.ID, "circuitWrap", 1L, 1),
        // "LootBag (Tier 1 LV)"
        getModItem(EnhancedLootBags.ID, "lootbag", 1L, 4),
        // "Steam Regulator (LV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32332),
        // "LV Wireless Energy Cover"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32383),
        // "Small Cadmium Battery"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32517),
        // "Small Lithium Battery"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32518),
        // "Small Sodium Battery"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32519),
        // "Electric Motor (LV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32600),
        // "Electric Pump (LV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32610),
        // "Steam Valve (LV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32620),
        // "Conveyor Module (LV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32630),
        // "Electric Piston (LV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32640),
        // "Robot Arm (LV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32650),
        // "Fluid Regulator (LV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32660),
        // "Field Generator (LV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32670),
        // "Emitter (LV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32680),
        // "Sensor (LV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32690),
        // "Integrated Logic Circuit"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32701),
        // "Solar Panel (LV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32752),
        // Microprocessor
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32078),
        // "Overflow Valve (LV)"
        getModItem(GTPlusPlus.ID, "MU-metaitem.01", 1L, 32072),
        // "Transmission Component (LV)"
        getModItem(GTPlusPlus.ID, "MU-metaitem.01", 1L, 32142),
        // "Charge Pack [LV]"
        getModItem(GTPlusPlus.ID, "GTPP.BattPack.01.name", 1L),
        // "Energy Core [LV]"
        getModItem(GTPlusPlus.ID, "item.itemBufferCore2", 1L),
        // "LV Tesla Capacitor"
        getModItem(TecTech.ID, "item.tm.teslaCoilCapacitor", 1L, 0) };

    public static final ItemStack[] MV_Tier_Misc = new ItemStack[] {
        // "Wrap of MV Circuits"
        getModItem(GoodGenerator.ID, "circuitWrap", 1L, 2),
        // "LootBag (Tier 2 MV)"
        getModItem(EnhancedLootBags.ID, "lootbag", 1L, 5),
        // "Steam Regulator (MV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32333),
        // "MV Wireless Energy Cover"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32384),
        // "Medium Battery Hull"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32501),
        // "Medium Cadmium Battery"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32527),
        // "Medium Lithium Battery"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32528),
        // "Medium Sodium Battery"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32529),
        // "Electric Motor (MV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32601),
        // "Electric Pump (MV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32611),
        // "Steam Valve (MV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32621),
        // "Conveyor Module (MV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32631),
        // "Electric Piston (MV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32641),
        // "Robot Arm (MV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32651),
        // "Fluid Regulator (MV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32661),
        // "Field Generator (MV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32671),
        // "Emitter (MV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32681),
        // "Sensor (MV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32691),
        // "Good Electronic Circuit"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32702),
        // "Solar Panel (MV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32753),
        // "Good Integrated Circuit"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32079),
        // "Integrated Processor"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32080),
        // "Overflow Valve (MV)"
        getModItem(GTPlusPlus.ID, "MU-metaitem.01", 1L, 32073),
        // "Transmission Component (MV)"
        getModItem(GTPlusPlus.ID, "MU-metaitem.01", 1L, 32143),
        // "Charge Pack [MV]"
        getModItem(GTPlusPlus.ID, "GTPP.BattPack.02.name", 1L),
        // "Energy Core [MV]"
        getModItem(GTPlusPlus.ID, "item.itemBufferCore3", 1L),
        // "MV Tesla Capacitor"
        getModItem(TecTech.ID, "item.tm.teslaCoilCapacitor", 1L, 1) };

    public static final ItemStack[] HV_Tier_Misc = new ItemStack[] {
        // "Wrap of HV Circuits"
        getModItem(GoodGenerator.ID, "circuitWrap", 1L, 3),
        // "LootBag (Tier 3 HV)"
        getModItem(EnhancedLootBags.ID, "lootbag", 1L, 6),
        // "Advanced Circuit"
        getModItem(IndustrialCraft2.ID, "itemPartCircuitAdv", 1L),
        // "Energy Crystal"
        getModItem(IndustrialCraft2.ID, "itemBatCrystal", 1L), // "Steam Regulator (HV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32334),
        // "HV Wireless Energy Cover"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32385),
        // "Large Battery Hull"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32502),
        // "Large Cadmium Battery"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32537),
        // "Large Lithium Battery"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32538),
        // "Large Sodium Battery"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32539),
        // "Electric Motor (HV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32602),
        // "Electric Pump (HV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32612),
        // "Steam Valve (HV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32622),
        // "Conveyor Module (HV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32632),
        // "Electric Piston (HV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32642),
        // "Robot Arm (HV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32652),
        // "Fluid Regulator (HV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32662),
        // "Fluid Regulator (HV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32672),
        // "Emitter (HV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32682),
        // "Sensor (HV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32692),
        // "Processor Assembly"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32703),
        // "Solar Panel (HV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32754),
        // "Nano Processor"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32082),
        // "Overflow Valve (HV)"
        getModItem(GTPlusPlus.ID, "MU-metaitem.01", 1L, 32074),
        // "Transmission Component (HV)"
        getModItem(GTPlusPlus.ID, "MU-metaitem.01", 1L, 32144),
        // "Charge Pack [HV]"
        getModItem(GTPlusPlus.ID, "GTPP.BattPack.03.name", 1L),
        // "Energy Core [HV]"
        getModItem(GTPlusPlus.ID, "item.itemBufferCore4", 1L),
        // "HV Tesla Capacitor"
        getModItem(TecTech.ID, "item.tm.teslaCoilCapacitor", 1L, 2) };

    public static final ItemStack[] EV_Tier_Misc = new ItemStack[] {
        // "Wrap of EV Circuits"
        getModItem(GoodGenerator.ID, "circuitWrap", 1L, 4),
        // "LootBag (Tier 4 EV)"
        getModItem(EnhancedLootBags.ID, "lootbag", 1L, 7),
        // "Lapotron Crystal"
        getModItem(IndustrialCraft2.ID, "itemBatLamaCrystal", 1L),
        // "Steam Regulator (EV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32335),
        // "EV Wireless Energy Cover"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32386),
        // "Small Sunnarium Battery (Empty)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32503),
        // "Small Sunnarium Battery"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32540),
        // "Electric Motor (EV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32603),
        // "Electric Pump (EV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32613),
        // "Steam Valve (EV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32623),
        // "Conveyor Module (EV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32633),
        // "Electric Piston (EV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32643),
        // "Robot Arm (EV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32653),
        // "Fluid Regulator (EV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32663),
        // "Field Generator (EV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32673),
        // "Emitter (EV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32683),
        // "Sensor (EV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32693),
        // Workstation
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32704),
        // "Solar Panel (EV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32755),
        // "Nano Assembly"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32083),
        // "Quantum Processor"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32085),
        // "Quad Cell Sodium Battery"
        getModItem(GTPlusPlus.ID, "MU-metaitem.01", 1L, 32050),
        // "Quad Cell Cadmium Battery"
        getModItem(GTPlusPlus.ID, "MU-metaitem.01", 1L, 32052),
        // "Quad Cell Lithium Battery"
        getModItem(GTPlusPlus.ID, "MU-metaitem.01", 1L, 32054),
        // "Overflow Valve (EV)"
        getModItem(GTPlusPlus.ID, "MU-metaitem.01", 1L, 32075),
        // "Transmission Component (EV)"
        getModItem(GTPlusPlus.ID, "MU-metaitem.01", 1L, 32145),
        // "Coil Wire [EV]"
        getModItem(GTPlusPlus.ID, "itemDehydratorCoilWire", 1L, 0),
        // "Dehydrator Coil [EV]"
        getModItem(GTPlusPlus.ID, "itemDehydratorCoil", 1L, 0),
        // "Charge Pack [EV]"
        getModItem(GTPlusPlus.ID, "GTPP.BattPack.04.name", 1L),
        // "Energy Core [EV]"
        getModItem(GTPlusPlus.ID, "item.itemBufferCore5", 1L),
        // "EV Tesla Capacitor"
        getModItem(TecTech.ID, "item.tm.teslaCoilCapacitor", 1L, 3) };

    public static final ItemStack[] IV_Tier_Misc = new ItemStack[] {
        // "Wrap of IV Circuits"
        getModItem(GoodGenerator.ID, "circuitWrap", 1L, 5),
        // "LootBag (Tier 5 IV)"
        getModItem(EnhancedLootBags.ID, "lootbag", 1L, 8),
        // "Steam Regulator (IV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32336),
        // "IV Wireless Energy Cover"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32387),
        // "Medium Sunnarium Battery (Empty)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32504),
        // "Medium Sunnarium Battery"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32545),
        // "Lapotronic Energy Orb"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32597),
        // "Electric Motor (IV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32604),
        // "Electric Pump (IV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32614),
        // "Steam Valve (IV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32624),
        // "Conveyor Module (IV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32634),
        // "Electric Piston (IV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32644),
        // "Robot Arm (IV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32654),
        // "Robot Arm (IV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32664),
        // "Field Generator (IV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32674),
        // "Emitter (IV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32684),
        // "Sensor (IV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32694),
        // Mainframe
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32705),
        // "Nano Supercomputer"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32084),
        // "Quantum Assembly"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32086),
        // "Crystal Processor"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32089),
        // "Overflow Valve (IV)"
        getModItem(GTPlusPlus.ID, "MU-metaitem.01", 1L, 32076),
        // "Transmission Component (IV)"
        getModItem(GTPlusPlus.ID, "MU-metaitem.01", 1L, 32146),
        // "Coil Wire [IV]"
        getModItem(GTPlusPlus.ID, "itemDehydratorCoilWire", 1L, 1),
        // "Dehydrator Coil [IV]"
        getModItem(GTPlusPlus.ID, "itemDehydratorCoil", 1L, 1),
        // "Charge Pack [IV]"
        getModItem(GTPlusPlus.ID, "GTPP.BattPack.05.name", 1L),
        // "Energy Core [IV]"
        getModItem(GTPlusPlus.ID, "item.itemBufferCore6", 1L),
        // "IV Tesla Capacitor"
        getModItem(TecTech.ID, "item.tm.teslaCoilCapacitor", 1L, 4) };

    public static final ItemStack[] LuV_Tier_Misc = new ItemStack[] {
        // "Wrap of LuV Circuits"
        getModItem(GoodGenerator.ID, "circuitWrap", 1L, 6),
        // "LootBag (Tier 6 LuV)"
        getModItem(EnhancedLootBags.ID, "lootbag", 1L, 41),
        // "LuV Wireless Energy Cover"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32388),
        // "Large Sunnarium Battery (Empty)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32505),
        // "Large Sunnarium Battery"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32550),
        // "Lapotronic Energy Orb Cluster"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32599),
        // "Electric Motor (LuV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32606),
        // "Electric Pump (LuV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32615),
        // "Conveyor Module (LuV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32635),
        // "Electric Piston (LuV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32645),
        // "Robot Arm (LuV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32655),
        // "Fluid Regulator (LuV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32665),
        // "Field Generator (LuV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32675),
        // "Emitter (LuV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32685),
        // "Sensor (LuV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32695),
        // "Nano Mainframe"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32706),
        // "Solar Panel (LuV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32757),
        // "Quantum Supercomputer"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32087),
        // "Wetware Processor"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32092),
        // "Crystal Assembly"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32096),
        // "Transmission Component (LuV)"
        getModItem(GTPlusPlus.ID, "MU-metaitem.01", 1L, 32147),
        // "Coil Wire [LuV]"
        getModItem(GTPlusPlus.ID, "itemDehydratorCoilWire", 1L, 2),
        // "Dehydrator Coil [LuV]"
        getModItem(GTPlusPlus.ID, "itemDehydratorCoil", 1L, 2),
        // "Charge Pack [LuV]"
        getModItem(GTPlusPlus.ID, "GTPP.BattPack.06.name", 1L),
        // "Energy Core [LuV]"
        getModItem(GTPlusPlus.ID, "item.itemBufferCore7", 1L),
        // "LuV Tesla Capacitor"
        getModItem(TecTech.ID, "item.tm.teslaCoilCapacitor", 1L, 5) };

    public static final ItemStack[] ZPM_Tier_Misc = new ItemStack[] {
        // "Wrap of ZPM Circuits"
        getModItem(GoodGenerator.ID, "circuitWrap", 1L, 7),
        // "LootBag (Tier 7 ZPM)"
        getModItem(EnhancedLootBags.ID, "lootbag", 1L, 42),
        // "ZPM Wireless Energy Cover"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32389),
        // "Medium Naquadria Battery (Empty)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32506),
        // "Medium Naquadria Battery"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32555),
        // "Zero Point Module"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32598),
        // "Electric Motor (ZPM)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32607),
        // "Electric Pump (ZPM)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32616),
        // "Conveyor Module (ZPM)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32636),
        // "Electric Piston (ZPM)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32646),
        // "Robot Arm (ZPM)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32656),
        // "Fluid Regulator (ZPM)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32666),
        // "Field Generator (ZPM)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32676),
        // "Emitter (ZPM)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32686),
        // "Sensor (ZPM)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32696),
        // "Energy Module"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32736),
        // "Solar Panel (ZPM)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32758),
        // "Quantum Mainframe"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32088),
        // "Crystal Supercomputer"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32090),
        // "Wetware Assembly"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32093),
        // "Bioware Processor"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32097),
        // "Transmission Component (ZPM)"
        getModItem(GTPlusPlus.ID, "MU-metaitem.01", 1L, 32148),
        // "Coil Wire [ZPM]"
        getModItem(GTPlusPlus.ID, "itemDehydratorCoilWire", 1L, 3),
        // "Dehydrator Coil [ZPM]"
        getModItem(GTPlusPlus.ID, "itemDehydratorCoil", 1L, 3),
        // "Charge Pack [ZPM]"
        getModItem(GTPlusPlus.ID, "GTPP.BattPack.07.name", 1L),
        // "Energy Core [ZPM]"
        getModItem(GTPlusPlus.ID, "item.itemBufferCore8", 1L),
        // "ZPM Tesla Capacitor"
        getModItem(TecTech.ID, "item.tm.teslaCoilCapacitor", 1L, 6) };

    public static final ItemStack[] UV_Tier_Misc = new ItemStack[] {
        // "Wrap of UV Circuits"
        getModItem(GoodGenerator.ID, "circuitWrap", 1L, 8),
        // "LootBag (Tier 8 UV)"
        getModItem(EnhancedLootBags.ID, "lootbag", 1L, 43),
        // "UV Wireless Energy Cover"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32390),
        // "Large Naquadria Battery (Empty)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32507),
        // "Large Naquadria Battery"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32560),
        // "Ultimate Battery"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32605),
        // "Electric Motor (UV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32608),
        // "Electric Pump (UV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32617),
        // "Conveyor Module (UV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32637),
        // "Electric Piston (UV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32647),
        // "Robot Arm (UV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32657),
        // "Fluid Regulator (UV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32667),
        // "Field Generator (UV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32677),
        // "Emitter (UV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32687),
        // "Sensor (UV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32697),
        // "Energy Cluster"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32737),
        // "Solar Panel (UV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32759),
        // "Crystal Mainframe"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32091),
        // "Wetware Supercomputer"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32094),
        // "Bioware Assembly"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32098),
        // "Optical Processor"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32154),
        // "Transmission Component (UV)"
        getModItem(GTPlusPlus.ID, "MU-metaitem.01", 1L, 32149),
        // "Charge Pack [UV]"
        getModItem(GTPlusPlus.ID, "GTPP.BattPack.08.name", 1L),
        // "Energy Core [UV]"
        getModItem(GTPlusPlus.ID, "item.itemBufferCore9", 1L) };

    public static final ItemStack[] UHV_Tier_Misc = new ItemStack[] {
        // "Wrap of UHV Circuits"
        getModItem(GoodGenerator.ID, "circuitWrap", 1L, 9),
        // "LootBag (Tier 9 UHV)"
        getModItem(EnhancedLootBags.ID, "lootbag", 1L, 44),
        // "Fluid Regulator (UHV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32049),
        // "UHV Wireless Energy Cover"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32391),
        // "Small Neutronium Battery (Empty)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32561),
        // "Small Neutronium Battery"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32570),
        // "Electric Motor (UHV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32596),
        // "Electric Pump (UHV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32618),
        // "Conveyor Module (UHV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32638),
        // "Electric Piston (UHV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32648),
        // "Robot Arm (UHV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32658),
        // "Field Generator (UHV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32678),
        // "Emitter (UHV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32688),
        // "Sensor (UHV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32698),
        // "Wetware Mainframe"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32095),
        // "Bioware Supercomputer"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32099),
        // "Solar Panel (UHV)"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32130),
        // "Optical Assembly"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32155),
        // "Exotic Processor"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32166),
        // "Transmission Component (UHV)"
        getModItem(GTPlusPlus.ID, "MU-metaitem.01", 1L, 32150),
        // "Charge Pack [UHV]"
        getModItem(GTPlusPlus.ID, "GTPP.BattPack.09.name", 1L),
        // "Energy Core [UHV]"
        getModItem(GTPlusPlus.ID, "item.itemBufferCore10", 1L) };

    public static final ItemStack[] UEV_Tier_Misc = new ItemStack[] {
        // "Wrap of UEV Circuits"
        getModItem(GoodGenerator.ID, "circuitWrap", 1L, 10),
        // "Fluid Regulator (UEV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32050),
        // "UEV Wireless Energy Cover"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32392),
        // "Medium Neutronium Battery (Empty)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32562),
        // "Medium Neutronium Battery"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32575),
        // "Electric Motor (UEV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32595),
        // "Electric Pump (UEV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32619),
        // "Conveyor Module (UEV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32639),
        // "Electric Piston (UEV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32649),
        // "Robot Arm (UEV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32659),
        // "Field Generator (UEV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32679),
        // "Emitter (UEV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32689),
        // "Sensor (UEV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32699),
        // "Bioware Mainframe"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32120),
        // "Solar Panel (UEV)"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32131),
        // "Optical Supercomputer"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32156),
        // "Exotic Assembly"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32167),
        // "Cosmic Processor"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32170) };

    public static final ItemStack[] UIV_Tier_Misc = new ItemStack[] {
        // "Wrap of UIV Circuits"
        getModItem(GoodGenerator.ID, "circuitWrap", 1L, 11),
        // "Electric Motor (UIV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32017),
        // "Electric Piston (UIV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32021),
        // "Electric Pump (UIV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32025),
        // "Conveyor Module (UIV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32029),
        // "Robot Arm (UIV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32033),
        // "Emitter (UIV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32037),
        // "Sensor (UIV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32041),
        // "Field Generator (UIV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32045),
        // "Fluid Regulator (UIV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32051),
        // "UIV Wireless Energy Cover"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32393),
        // "Large Neutronium Battery (Empty)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32563),
        // "Large Neutronium Battery"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32580),
        // "Solar Panel (UIV)"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32132),
        // "Optical Mainframe"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32157),
        // "Exotic Supercomputer"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32168),
        // "Cosmic Assembly"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32171),
        // "Temporally Transcendent Processor"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32174) };

    public static final ItemStack[] UMV_Tier_Misc = new ItemStack[] {
        // "Wrap of UMV Circuits"
        getModItem(GoodGenerator.ID, "circuitWrap", 1L, 12),
        // "Electric Motor (UMV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32018),
        // "Electric Piston (UMV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32022),
        // "Electric Pump (UMV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32026),
        // "Conveyor Module (UMV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32030),
        // "Robot Arm (UMV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32034),
        // "Emitter (UMV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32038),
        // "Sensor (UMV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32042),
        // "Field Generator (UMV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32046),
        // "Fluid Regulator (UMV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32052),
        // "UMV Wireless Energy Cover"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32394),
        // "Medium Plasma Battery (Empty)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32564),
        // "Medium Infinity Battery"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32585),
        // "Really Ultimate Battery"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32609),
        // "Exotic Mainframe"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32169),
        // "Cosmic Supercomputer"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32172),
        // "Temporally Transcendent Assembly"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32175) };

    public static final ItemStack[] UXV_Tier_Misc = new ItemStack[] {
        // "Wrap of UXV Circuits"
        getModItem(GoodGenerator.ID, "circuitWrap", 1L, 13),
        // "Electric Motor (UXV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32019),
        // "Electric Piston (UXV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32023),
        // "Electric Pump (UXV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32027),
        // "Conveyor Module (UXV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32031),
        // "Robot Arm (UXV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32035),
        // "Emitter (UXV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32039),
        // "Sensor (UXV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32043),
        // "Field Generator (UXV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32047),
        // "Fluid Regulator (UXV)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32053),
        // "UXV Wireless Energy Cover"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32395),
        // "Large Plasma Battery (Empty)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32565),
        // "Large Infinity Battery"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32590),
        // "Extremely Ultimate Battery"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32594),
        // "Cosmic Mainframe"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32173),
        // "Temporally Transcendent Supercomputer"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32176) };

    public static final ItemStack[] MAX_Tier_Misc = new ItemStack[] {
        // "Wrap of MAX Circuits"
        getModItem(GoodGenerator.ID, "circuitWrap", 1L, 14),
        // "Electric Motor (MAX)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32020),
        // "Electric Piston (MAX)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32024),
        // "Electric Pump (MAX)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32028),
        // "Conveyor Module (MAX)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32032),
        // "Robot Arm (MAX)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32036),
        // "Emitter (MAX)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32040),
        // "Sensor (MAX)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32044),
        // "Field Generator (MAX)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32048),
        // "Fluid Regulator (MAX)"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32054),
        // "MAX Wireless Energy Cover"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32396),
        // "Insanely Ultimate Battery"
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32145),
        // "Temporally Transcendent Mainframe"
        getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32177) };

    // Wire
    public static final ItemStack[] ULV_Tier_Wire = new ItemStack[] {
        // "1x Red Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2000),
        // "2x Red Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2001),
        // "4x Red Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2002),
        // "8x Red Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2003),
        // "12x Red Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2004),
        // "16x Red Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2005) };

    public static final ItemStack[] LV_Tier_Wire = new ItemStack[] {
        // "1x Cobalt Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1200),
        // "2x Cobalt Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1201),
        // "4x Cobalt Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1202),
        // "8x Cobalt Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1203),
        // "12x Cobalt Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1204),
        // "16x Cobalt Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1205),
        // "1x Lead Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1220),
        // "2x Lead Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1221),
        // "4x Lead Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1222),
        // "8x Lead Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1223),
        // "12x Lead Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1224),
        // "16x Lead Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1225),
        // "1x Tin Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1240),
        // "2x Tin Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1241),
        // "4x Tin Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1242),
        // "8x Tin Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1243),
        // "12x Tin Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1244),
        // "16x Tin Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1245),
        // "1x Zinc Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1260),
        // "2x Zinc Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1261),
        // "4x Zinc Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1262),
        // "8x Zinc Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1263),
        // "12x Zinc Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1264),
        // "16x Zinc Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1265),
        // "1x Soldering Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1280),
        // "2x Soldering Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1281),
        // "4x Soldering Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1282),
        // "8x Soldering Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1283),
        // "12x Soldering Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1284),
        // "16x Soldering Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1285),
        // "1x Redstone Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30645),
        // "2x Redstone Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30646),
        // "4x Redstone Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30647),
        // "8x Redstone Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30648),
        // "12x Redstone Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30649),
        // "16x Redstone Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30650) };

    public static final ItemStack[] MV_Tier_Wire = new ItemStack[] {
        // "1x Iron Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1300),
        // "2x Iron Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1301),
        // "4x Iron Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1302),
        // "8x Iron Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1303),
        // "12x Iron Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1304),
        // "16x Iron Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1305),
        // "1x Nickel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1320),
        // "2x Nickel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1321),
        // "4x Nickel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1322),
        // "8x Nickel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1323),
        // "12x Nickel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1324),
        // "16x Nickel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1325),
        // "1x Cupronickel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1340),
        // "2x Cupronickel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1341),
        // "4x Cupronickel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1342),
        // "8x Cupronickel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1343),
        // "12x Cupronickel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1344),
        // "16x Cupronickel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1345),
        // "1x Copper Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1360),
        // "2x Copper Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1361),
        // "4x Copper Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1362),
        // "8x Copper Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1363),
        // "12x Copper Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1364),
        // "16x Copper Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1365),
        // "1x Annealed Copper Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1380),
        // "2x Annealed Copper Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1381),
        // "4x Annealed Copper Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1382),
        // "8x Annealed Copper Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1383),
        // "12x Annealed Copper Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1384),
        // "16x Annealed Copper Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1385),
        // "1x Superconductor Base MV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2200),
        // "2x Superconductor Base MV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2201),
        // "4x Superconductor Base MV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2202),
        // "8x Superconductor Base MV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2203),
        // "12x Superconductor Base MV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2204),
        // "16x Superconductor Base MV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2205),
        // "1x Superconductor MV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2320),
        // "2x Superconductor MV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2321),
        // "4x Superconductor MV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2322),
        // "8x Superconductor MV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2323),
        // "12x Superconductor MV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2324),
        // "16x Superconductor MV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2325),
        // "1x Electrical Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11490),
        // "2x Electrical Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11491),
        // "4x Electrical Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11492),
        // "8x Electrical Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11493),
        // "12x Electrical Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11494),
        // "16x Electrical Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11495) };

    public static final ItemStack[] HV_Tier_Wire = new ItemStack[] {
        // "1x Kanthal Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1400),
        // "2x Kanthal Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1401),
        // "4x Kanthal Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1402),
        // "8x Kanthal Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1403),
        // "12x Kanthal Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1404),
        // "16x Kanthal Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1405),
        // "1x Gold Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1420),
        // "2x Gold Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1421),
        // "4x Gold Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1422),
        // "8x Gold Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1423),
        // "12x Gold Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1424),
        // "16x Gold Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1425),
        // "1x Electrum Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1440),
        // "2x Electrum Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1441),
        // "4x Electrum Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1442),
        // "8x Electrum Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1443),
        // "12x Electrum Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1444),
        // "16x Electrum Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1445),
        // "1x Silver Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1460),
        // "2x Silver Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1461),
        // "4x Silver Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1462),
        // "8x Silver Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1463),
        // "12x Silver Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1464),
        // "16x Silver Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1465),
        // "1x Blue Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1480),
        // "2x Blue Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1481),
        // "4x Blue Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1482),
        // "8x Blue Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1483),
        // "12x Blue Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1484),
        // "16x Blue Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1485),
        // "1x Superconductor Base HV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2220),
        // "2x Superconductor Base HV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2221),
        // "4x Superconductor Base HV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2222),
        // "8x Superconductor Base HV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2223),
        // "12x Superconductor Base HV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2224),
        // "16x Superconductor Base HV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2225),
        // "1x Superconductor HV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2340),
        // "2x Superconductor HV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2341),
        // "4x Superconductor HV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2342),
        // "8x Superconductor HV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2343),
        // "12x Superconductor HV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2344),
        // "16x Superconductor HV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2345),
        // "1x Energetic Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11510),
        // "2x Energetic Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11511),
        // "4x Energetic Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11512),
        // "8x Energetic Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11513),
        // "12x Energetic Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11514),
        // "16x Energetic Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11515) };

    public static final ItemStack[] EV_Tier_Wire = new ItemStack[] {
        // "1x Nichrome Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1500),
        // "2x Nichrome Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1501),
        // "4x Nichrome Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1502),
        // "8x Nichrome Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1503),
        // "12x Nichrome Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1504),
        // "16x Nichrome Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1505),
        // "1x Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1520),
        // "2x Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1521),
        // "4x Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1522),
        // "8x Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1523),
        // "12x Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1524),
        // "16x Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1525),
        // "1x Black Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1540),
        // "2x Black Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1541),
        // "4x Black Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1542),
        // "8x Black Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1543),
        // "12x Black Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1544),
        // "16x Black Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1545),
        // "1x Titanium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1560),
        // "2x Titanium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1561),
        // "4x Titanium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1562),
        // "8x Titanium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1563),
        // "12x Titanium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1564),
        // "16x Titanium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1565),
        // "1x Aluminium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1580),
        // "2x Aluminium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1581),
        // "4x Aluminium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1582),
        // "8x Aluminium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1583),
        // "12x Aluminium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1584),
        // "16x Aluminium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1585),
        // "1x TPV-Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1840),
        // "2x TPV-Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1841),
        // "4x TPV-Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1842),
        // "8x TPV-Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1843),
        // "12x TPV-Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1844),
        // "16x TPV-Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1845),
        // "1x Superconductor Base EV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2240),
        // "2x Superconductor Base EV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2241),
        // "4x Superconductor Base EV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2242),
        // "8x Superconductor Base EV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2243),
        // "12x Superconductor Base EV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2244),
        // "16x Superconductor Base EV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2245),
        // "1x Superconductor EV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2360),
        // "2x Superconductor EV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2361),
        // "4x Superconductor EV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2362),
        // "8x Superconductor EV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2363),
        // "12x Superconductor EV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2364),
        // "16x Superconductor EV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2365),
        // "1x Vibrant Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11530),
        // "2x Vibrant Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11531),
        // "4x Vibrant Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11532),
        // "8x Vibrant Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11533),
        // "12x Vibrant Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11534),
        // "16x Vibrant Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11535) };

    public static final ItemStack[] IV_Tier_Wire = new ItemStack[] {
        // "1x Graphene Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1600),
        // "2x Graphene Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1601),
        // "4x Graphene Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1602),
        // "8x Graphene Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1603),
        // "12x Graphene Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1604),
        // "16x Graphene Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1605),
        // "1x Platinum Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1640),
        // "2x Platinum Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1641),
        // "4x Platinum Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1642),
        // "8x Platinum Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1643),
        // "12x Platinum Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1644),
        // "16x Platinum Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1645),
        // "1x Tungstensteel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1660),
        // "2x Tungstensteel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1661),
        // "4x Tungstensteel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1662),
        // "8x Tungstensteel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1663),
        // "12x Tungstensteel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1664),
        // "16x Tungstensteel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1665),
        // "1x Tungsten Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1680),
        // "2x Tungsten Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1681),
        // "4x Tungsten Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1682),
        // "8x Tungsten Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1683),
        // "12x Tungsten Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1684),
        // "16x Tungsten Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1685),
        // "1x End Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1860),
        // "2x End Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1861),
        // "4x End Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1862),
        // "8x End Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1863),
        // "12x End Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1864),
        // "16x End Steel Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1865),
        // "1x Superconductor Base IV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2260),
        // "2x Superconductor Base IV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2261),
        // "4x Superconductor Base IV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2262),
        // "8x Superconductor Base IV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2263),
        // "12x Superconductor Base IV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2264),
        // "16x Superconductor Base IV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2265),
        // "1x Superconductor IV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2380),
        // "2x Superconductor IV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2381),
        // "4x Superconductor IV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2382),
        // "8x Superconductor IV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2383),
        // "12x Superconductor IV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2384),
        // "16x Superconductor IV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2385) };

    public static final ItemStack[] LuV_Tier_Wire = new ItemStack[] {
        // "1x Osmium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1620),
        // "2x Osmium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1621),
        // "4x Osmium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1622),
        // "8x Osmium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1623),
        // "12x Osmium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1624),
        // "16x Osmium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1625),
        // "1x HSS-G Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1700),
        // "2x HSS-G Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1701),
        // "4x HSS-G Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1702),
        // "8x HSS-G Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1703),
        // "12x HSS-G Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1704),
        // "16x HSS-G Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1705),
        // "1x Niobium-Titanium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1720),
        // "2x Niobium-Titanium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1721),
        // "4x Niobium-Titanium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1722),
        // "8x Niobium-Titanium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1723),
        // "12x Niobium-Titanium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1724),
        // "16x Niobium-Titanium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1725),
        // "1x Vanadium-Gallium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1740),
        // "2x Vanadium-Gallium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1741),
        // "4x Vanadium-Gallium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1742),
        // "8x Vanadium-Gallium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1743),
        // "12x Vanadium-Gallium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1744),
        // "16x Vanadium-Gallium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1745),
        // "1x Yttrium Barium Cuprate Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1760),
        // "2x Yttrium Barium Cuprate Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1761),
        // "4x Yttrium Barium Cuprate Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1762),
        // "8x Yttrium Barium Cuprate Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1763),
        // "12x Yttrium Barium Cuprate Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1764),
        // "16x Yttrium Barium Cuprate Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1765),
        // "1x Superconductor Base LuV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2280),
        // "2x Superconductor Base LuV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2281),
        // "4x Superconductor Base LuV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2282),
        // "8x Superconductor Base LuV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2283),
        // "12x Superconductor Base LuV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2284),
        // "16x Superconductor Base LuV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2285),
        // "1x Superconductor LuV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2400),
        // "2x Superconductor LuV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2401),
        // "4x Superconductor LuV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2402),
        // "8x Superconductor LuV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2403),
        // "12x Superconductor LuV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2404),
        // "16x Superconductor LuV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2405),
        // "1x Melodic Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11550),
        // "2x Melodic Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11551),
        // "4x Melodic Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11552),
        // "8x Melodic Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11553),
        // "12x Melodic Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11554),
        // "16x Melodic Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11555),
        // "1x HSS-E Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11590),
        // "2x HSS-E Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11591),
        // "4x HSS-E Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11592),
        // "8x HSS-E Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11593),
        // "12x HSS-E Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11594),
        // "16x HSS-E Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11595) };

    public static final ItemStack[] ZPM_Tier_Wire = new ItemStack[] {
        // "1x Naquadah Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1780),
        // "2x Naquadah Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1781),
        // "4x Naquadah Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1782),
        // "8x Naquadah Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1783),
        // "12x Naquadah Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1784),
        // "16x Naquadah Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1785),
        // "1x Superconductor Base ZPM Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2300),
        // "2x Superconductor Base ZPM Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2301),
        // "4x Superconductor Base ZPM Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2302),
        // "8x Superconductor Base ZPM Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2303),
        // "12x Superconductor Base ZPM Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2304),
        // "16x Superconductor Base ZPM Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2305),
        // "1x Superconductor ZPM Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2420),
        // "2x Superconductor ZPM Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2421),
        // "4x Superconductor ZPM Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2422),
        // "8x Superconductor ZPM Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2423),
        // "12x Superconductor ZPM Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2424),
        // "16x Superconductor ZPM Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2425),
        // "1x Trinium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11450),
        // "2x Trinium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11451),
        // "4x Trinium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11452),
        // "8x Trinium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11453),
        // "12x Trinium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11454),
        // "16x Trinium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11455),
        // "1x Osmiridium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11610),
        // "2x Osmiridium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11611),
        // "4x Osmiridium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11612),
        // "8x Osmiridium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11613),
        // "12x Osmiridium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11614),
        // "16x Osmiridium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11615),
        // "1x Signalium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32749),
        // "2x Signalium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32750),
        // "4x Signalium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32751),
        // "8x Signalium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32752),
        // "12x Signalium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32753),
        // "16x Signalium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32754) };

    public static final ItemStack[] UV_Tier_Wire = new ItemStack[] {
        // "1x Naquadah Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1800),
        // "2x Naquadah Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1801),
        // "4x Naquadah Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1802),
        // "8x Naquadah Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1803),
        // "12x Naquadah Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1804),
        // "16x Naquadah Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1805),
        // "1x Duranium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1820),
        // "2x Duranium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1821),
        // "4x Duranium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1822),
        // "8x Duranium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1823),
        // "12x Duranium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1824),
        // "16x Duranium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1825),
        // "1x Fluxed Electrum Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1900),
        // "2x Fluxed Electrum Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1901),
        // "4x Fluxed Electrum Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1902),
        // "8x Fluxed Electrum Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1903),
        // "12x Fluxed Electrum Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1904),
        // "16x Fluxed Electrum Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 1905),
        // "1x Superconductor UV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2440),
        // "2x Superconductor UV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2441),
        // "4x Superconductor UV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2442),
        // "8x Superconductor UV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2443),
        // "12x Superconductor UV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2444),
        // "16x Superconductor UV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2445),
        // "1x Superconductor Base UV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2500),
        // "2x Superconductor Base UV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2501),
        // "4x Superconductor Base UV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2502),
        // "8x Superconductor Base UV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2503),
        // "12x Superconductor Base UV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2504),
        // "16x Superconductor Base UV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2505),
        // "1x Stellar Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11570),
        // "2x Stellar Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11571),
        // "4x Stellar Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11572),
        // "8x Stellar Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11573),
        // "12x Stellar Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11574),
        // "16x Stellar Alloy Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11575),
        // "1x Lumiium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32737),
        // "2x Lumiium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32738),
        // "4x Lumiium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32739),
        // "8x Lumiium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32740),
        // "12x Lumiium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32741),
        // "16x Lumiium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32742) };

    public static final ItemStack[] UHV_Tier_Wire = new ItemStack[] {
        // "1x Superconductor UHV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2020),
        // "2x Superconductor UHV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2021),
        // "4x Superconductor UHV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2022),
        // "8x Superconductor UHV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2023),
        // "12x Superconductor UHV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2024),
        // "16x Superconductor UHV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2025),
        // "1x Superconductor Base UHV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2520),
        // "2x Superconductor Base UHV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2521),
        // "4x Superconductor Base UHV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2522),
        // "8x Superconductor Base UHV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2523),
        // "12x Superconductor Base UHV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2524),
        // "16x Superconductor Base UHV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2525),
        // "1x Ichorium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2600),
        // "2x Ichorium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2601),
        // "4x Ichorium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2602),
        // "8x Ichorium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2603),
        // "12x Ichorium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2604),
        // "16x Ichorium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2605),
        // "1x Bedrockium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11310),
        // "2x Bedrockium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11311),
        // "4x Bedrockium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11312),
        // "8x Bedrockium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11313),
        // "12x Bedrockium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11314),
        // "16x Bedrockium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11315),
        // "1x HSS-S Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11470),
        // "2x HSS-S Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11471),
        // "4x HSS-S Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11472),
        // "8x HSS-S Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11473),
        // "12x HSS-S Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11474),
        // "16x HSS-S Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11475) };

    public static final ItemStack[] UEV_Tier_Wire = new ItemStack[] {
        // "1x Superconductor UEV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2026),
        // "2x Superconductor UEV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2027),
        // "4x Superconductor UEV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2028),
        // "8x Superconductor UEV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2029),
        // "12x Superconductor UEV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2030),
        // "16x Superconductor UEV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2031),
        // "1x Superconductor Base UEV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2032),
        // "2x Superconductor Base UEV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2033),
        // "4x Superconductor Base UEV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2034),
        // "8x Superconductor Base UEV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2035),
        // "12x Superconductor Base UEV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2036),
        // "16x Superconductor Base UEV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2037),
        // "1x Draconium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11330),
        // "2x Draconium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11331),
        // "4x Draconium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11332),
        // "8x Draconium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11333),
        // "12x Draconium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11334),
        // "16x Draconium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11335) };

    public static final ItemStack[] UIV_Tier_Wire = new ItemStack[] {
        // "1x Superconductor Base UIV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2052),
        // "2x Superconductor Base UIV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2053),
        // "4x Superconductor Base UIV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2054),
        // "8x Superconductor Base UIV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2055),
        // "12x Superconductor Base UIV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2056),
        // "16x Superconductor Base UIV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2057),
        // "1x Superconductor UIV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2081),
        // "2x Superconductor UIV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2082),
        // "4x Superconductor UIV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2083),
        // "8x Superconductor UIV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2084),
        // "12x Superconductor UIV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2085),
        // "16x Superconductor UIV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2086),
        // "1x Nether Star Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11350),
        // "2x Nether Star Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11351),
        // "4x Nether Star Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11352),
        // "8x Nether Star Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11353),
        // "12x Nether Star Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11354),
        // "16x Nether Star Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11355),
        // "1x Hypogen Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30585),
        // "2x Hypogen Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30586),
        // "4x Hypogen Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30587),
        // "8x Hypogen Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30588),
        // "12x Hypogen Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30589),
        // "16x Hypogen Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30590) };

    public static final ItemStack[] UMV_Tier_Wire = new ItemStack[] {
        // "1x Superconductor Base UMV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2072),
        // "2x Superconductor Base UMV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2073),
        // "4x Superconductor Base UMV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2074),
        // "8x Superconductor Base UMV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2075),
        // "12x Superconductor Base UMV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2076),
        // "16x Superconductor Base UMV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2077),
        // "1x Superconductor UMV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2089),
        // "2x Superconductor UMV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2090),
        // "4x Superconductor UMV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2091),
        // "8x Superconductor UMV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2092),
        // "12x Superconductor UMV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2093),
        // "16x Superconductor UMV Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2094),
        // "1x Quantium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11370),
        // "2x Quantium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11371),
        // "4x Quantium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11372),
        // "8x Quantium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11373),
        // "12x Quantium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11374),
        // "16x Quantium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11375) };

    public static final ItemStack[] UXV_Tier_Wire = new ItemStack[] {
        // "1x Black Plutonium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11390),
        // "2x Black Plutonium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11391),
        // "4x Black Plutonium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11392),
        // "8x Black Plutonium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11393),
        // "12x Black Plutonium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11394),
        // "16x Black Plutonium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11395) };

    public static final ItemStack[] MAX_Tier_Wire = new ItemStack[] {
        // "1x SpaceTime Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2606),
        // "2x SpaceTime Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2607),
        // "4x SpaceTime Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2608),
        // "8x SpaceTime Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2609),
        // "12x SpaceTime Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2610),
        // "16x SpaceTime Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 2611),
        // "1x Awakened Draconium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11410),
        // "2x Awakened Draconium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11411),
        // "4x Awakened Draconium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11412),
        // "8x Awakened Draconium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11413),
        // "12x Awakened Draconium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11414),
        // "16x Awakened Draconium Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11415),
        // "1x Infinity Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11430),
        // "2x Infinity Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11431),
        // "4x Infinity Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11432),
        // "8x Infinity Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11433),
        // "12x Infinity Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11434),
        // "16x Infinity Wire"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 11435) };

    // Hatch & Bus
    public static final ItemStack[] Steam_Tier_Hatch = new ItemStack[] {
        // "Input Bus (Steam)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31046),
        // "Output Bus (Steam)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31047),
        // "Steam Hatch"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31040) };

    public static final ItemStack[] ULV_Tier_Hatch = new ItemStack[] {
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
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 80) };

    public static final ItemStack[] LV_Tier_Hatch = new ItemStack[] {
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
        // "Super Bus (I) (LV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30022),
        // "Super Bus (O) (LV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30032) };

    public static final ItemStack[] MV_Tier_Hatch = new ItemStack[] {
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
        // "Charging Bus (MV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 886),
        // "Discharging Bus (MV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 888),
        // "Super Bus (I) (MV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30023),
        // "Super Bus (O) (MV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30033) };

    public static final ItemStack[] HV_Tier_Hatch = new ItemStack[] {
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
        // "Super Bus (I) (HV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30024),
        // "Super Bus (O) (HV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30034) };

    public static final ItemStack[] EV_Tier_Hatch = new ItemStack[] {
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
        // "Charging Bus (EV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 887),
        // "Discharging Bus (EV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 889),
        // "Super Bus (I) (EV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30025),
        // "Super Bus (O) (EV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30035) };

    public static final ItemStack[] IV_Tier_Hatch = new ItemStack[] {
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
        // "Air Intake Hatch"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 861),
        // "IV 256A Laser Target Hatch"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 15130),
        // "IV 256A Laser Source Hatch"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 15230),
        // "Super Bus (I) (IV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30026),
        // "Super Bus (O) (IV)"
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30036) };

    public static final ItemStack[] LuV_Tier_Hatch = new ItemStack[] {
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
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 10503),
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
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30037) };

    public static final ItemStack[] ZPM_Tier_Hatch = new ItemStack[] {
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
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 31070) };

    public static final ItemStack[] UV_Tier_Hatch = new ItemStack[] {
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
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 30039) };

    public static final ItemStack[] UHV_Tier_Hatch = new ItemStack[] {
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
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 32765) };

    public static final ItemStack[] UEV_Tier_Hatch = new ItemStack[] {
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
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 15285) };

    public static final ItemStack[] UIV_Tier_Hatch = new ItemStack[] {
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
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 15296) };

    public static final ItemStack[] UMV_Tier_Hatch = new ItemStack[] {
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
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 16020) };

    public static final ItemStack[] UXV_Tier_Hatch = new ItemStack[] {
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
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 16027) };

    public static final ItemStack[] MAX_Tier_Hatch = new ItemStack[] {
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
        getModItem(GregTech.ID, "gt.blockmachines", 1L, 12108) };
}
