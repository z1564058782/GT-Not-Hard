package Recipes.SingularityRecipes_Pachinko;

import static gregtech.api.enums.Mods.EnhancedLootBags;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GoodGenerator;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.IndustrialCraft2;
import static gregtech.api.enums.Mods.Railcraft;
import static gregtech.api.enums.Mods.TecTech;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

public class SingularityPachinkoRecipes_GT_Misc {

    public static final Map<Integer, ItemStack[]> PachinkoRecipes_GT_Misc = new HashMap<>();

    public static void addPachinkoRecipes_GT_Misc() {

        // Steam Tier
        // "Bronze Hull" - 1
        PachinkoRecipes_GT_Misc.put(
            1,
            new ItemStack[] {
                // "Steam Oven"
                getModItem(Railcraft.ID, "machine.alpha", 1L, 3),
                // "Water Tank Siding"
                getModItem(Railcraft.ID, "machine.alpha", 1L, 14),
                // "LootBag (Steam Age)"
                getModItem(EnhancedLootBags.ID, "lootbag", 1L, 2),
                // "Bronze Hull"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1),
                // "Bricked Bronze Hull"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 2),
                // "Steel Hull"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 3),
                // "Bricked Wrought Iron Hull"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 4) });

        // ULV Tier
        // "ULV Machine Hull" - 10
        PachinkoRecipes_GT_Misc.put(
            40,
            new ItemStack[] {
                // "Wrap of ULV Circuits"
                getModItem(GoodGenerator.ID, "circuitWrap", 1L, 0),
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
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 0),
                // "Tantalum Capacitor"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32499),
                // "Vacuum Tube"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32700),
                // "NAND Chip"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32075),
                // "Energy Core [ULV]"
                getModItem(GTPlusPlus.ID, "item.itemBufferCore1", 1L) });

        // LV Tier
        // "LV Machine Hull" - 11
        PachinkoRecipes_GT_Misc.put(
            11,
            new ItemStack[] {
                // "Wrap of LV Circuits"
                getModItem(GoodGenerator.ID, "circuitWrap", 1L, 1),
                // "LootBag (Tier 1 LV)"
                getModItem(EnhancedLootBags.ID, "lootbag", 1L, 4),
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
                // "Basic Semifluid Generator"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 837),
                // "LV Hi-Amp Transformer"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 878),
                // "Wireless Charger MK I"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 890),
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
                // "Basic Monster Repellator"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1146),
                // "Basic Solar Panel"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 2733),
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
                // "Basic World Accelerator"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 11100),
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
                // "Acid Generator LV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12793),
                // "Basic Tesla Transceiver"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 16000),
                // "Basic Tesla Transceiver"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 16005),
                // "Basic Tesla Transceiver"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 16010),
                // "Basic Tesla Transceiver"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 16015),
                // "LV Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 1),
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
                getModItem(TecTech.ID, "item.tm.teslaCoilCapacitor", 1L, 0) });

        // MV Tier
        // "MV Machine Hull" - 12
        PachinkoRecipes_GT_Misc.put(
            12,
            new ItemStack[] {
                // "Wrap of MV Circuits"
                getModItem(GoodGenerator.ID, "circuitWrap", 1L, 2),
                // "LootBag (Tier 2 MV)"
                getModItem(EnhancedLootBags.ID, "lootbag", 1L, 5),
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
                // "Advanced Semifluid Generator"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 838),
                // "MV Hi-Amp Transformer"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 879),
                // "Wireless Charger MK II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 891),
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
                // "Advanced Monster Repellator"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1147),
                // "Advanced Solar Panel"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 2734),
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
                // "Advanced World Accelerator"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 11101),
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
                // "Acid Generator MV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12726),
                // "Advanced Tesla Transceiver"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 16001),
                // "Advanced Tesla Transceiver"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 16006),
                // "Advanced Tesla Transceiver"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 16011),
                // "Advanced Tesla Transceiver"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 16016),
                // "Advanced MagLev Pylon"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 29990),
                // "MV Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 2),
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
                getModItem(TecTech.ID, "item.tm.teslaCoilCapacitor", 1L, 1) });

        // HV Tier
        // "HV Machine Hull" - 13
        PachinkoRecipes_GT_Misc.put(
            13,
            new ItemStack[] {
                // "Wrap of HV Circuits"
                getModItem(GoodGenerator.ID, "circuitWrap", 1L, 3),
                // "LootBag (Tier 3 HV)"
                getModItem(EnhancedLootBags.ID, "lootbag", 1L, 6),
                // "Advanced Circuit"
                getModItem(IndustrialCraft2.ID, "itemPartCircuitAdv", 1L),
                // "Energy Crystal"
                getModItem(IndustrialCraft2.ID, "itemBatCrystal", 1L),
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
                // "Turbo Semifluid Generator"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 839),
                // "HV Hi-Amp Transformer"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 880),
                // "Wireless Charger MK III"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 892),
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
                // "Advanced Monster Repellator II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1148),
                // "HV Microwave Energy Transmitter"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1161),
                // "Lightning Rod"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1174),
                // "Advanced Solar Panel II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 2735),
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
                // "Advanced World Accelerator II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 11102),
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
                // "Acid Generator HV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12727),
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
                // "Advanced MagLev Pylon II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 29991),
                // "HV Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 3),
                // "Steam Regulator (HV)"
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
                getModItem(TecTech.ID, "item.tm.teslaCoilCapacitor", 1L, 2) });

        // EV Tier
        // "EV Machine Hull" - 14
        PachinkoRecipes_GT_Misc.put(
            14,
            new ItemStack[] {
                // "Wrap of EV Circuits"
                getModItem(GoodGenerator.ID, "circuitWrap", 1L, 4),
                // "LootBag (Tier 4 EV)"
                getModItem(EnhancedLootBags.ID, "lootbag", 1L, 7),
                // "Lapotron Crystal"
                getModItem(IndustrialCraft2.ID, "itemBatLamaCrystal", 1L),
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
                // "Basic Rocket Engine"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 793),
                // "EV Hi-Amp Transformer"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 881),
                // "Wireless Charger MK IV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 893),
                // "Smog Device"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 951),
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
                // "Lightning Rod II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1175),
                // "Naquadah Reactor Mark I"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1190),
                // "Plasma Generator Mark I"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1196),
                // "Advanced Solar Panel III"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 2736),
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
                // "Advanced World Accelerator III"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 11103),
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
                // "Acid Generator EV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12728),
                // "Ultimate Power Tesla Transceiver"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 16003),
                // "Ultimate Power Tesla Transceiver"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 16008),
                // "Ultimate Power Tesla Transceiver"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 16013),
                // "Ultimate Power Tesla Transceiver"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 16018),
                // "Advanced MagLev Pylon III"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 29992),
                // "EV Machine Casing"
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 4),
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
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32083),
                // "Quantum Processor"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32085),
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
                getModItem(TecTech.ID, "item.tm.teslaCoilCapacitor", 1L, 3) });

        // IV Tier
        // "IV Machine Hull" - 15
        PachinkoRecipes_GT_Misc.put(
            15,
            new ItemStack[] {
                // "Wrap of IV Circuits"
                getModItem(GoodGenerator.ID, "circuitWrap", 1L, 5),
                // "LootBag (Tier 5 IV)"
                getModItem(EnhancedLootBags.ID, "lootbag", 1L, 8),
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
                // "Advanced Rocket Engine"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 794),
                // "IV Hi-Amp Transformer"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 882),
                // "Wireless Charger MK V"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 894),
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
                // "Naquadah Reactor Mark II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1191),
                // "Plasma Generator Mark II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1197),
                // "Advanced Solar Panel IV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 2737),
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
                // "Advanced World Accelerator IV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 11104),
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
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 5),
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
                getModItem(TecTech.ID, "item.tm.teslaCoilCapacitor", 1L, 4) });

        // LuV Tier
        // "LuV Machine Hull" - 16
        PachinkoRecipes_GT_Misc.put(
            16,
            new ItemStack[] {
                // "Wrap of LuV Circuits"
                getModItem(GoodGenerator.ID, "circuitWrap", 1L, 6),
                // "LootBag (Tier 6 LuV)"
                getModItem(EnhancedLootBags.ID, "lootbag", 1L, 41),
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
                // "Turbo Rocket Engine"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 795),
                // "LuV Hi-Amp Transformer"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 883),
                // "Wireless Charger MK VI"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 895),
                // "Advanced Monster Repellator V"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1135),
                // "LuV Microwave Energy Transmitter"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1164),
                // "Naquadah Reactor Mark III"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1192),
                // "Plasma Generator Mark III"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1198),
                // "Elite Solar Panel"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 2738),
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
                // "Elite World Accelerator"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 11105),
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
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 6),
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
                getModItem(TecTech.ID, "item.tm.teslaCoilCapacitor", 1L, 5) });

        // ZPM Tier
        // "ZPM Machine Hull" - 17
        PachinkoRecipes_GT_Misc.put(
            17,
            new ItemStack[] {
                // "Wrap of ZPM Circuits"
                getModItem(GoodGenerator.ID, "circuitWrap", 1L, 7),
                // "LootBag (Tier 7 ZPM)"
                getModItem(EnhancedLootBags.ID, "lootbag", 1L, 42),
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
                // "Advanced Monster Repellator VI"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1136),
                // "ZPM Microwave Energy Transmitter"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1165),
                // "Naquadah Reactor Mark IV"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1188),
                // "Elite Solar Panel II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 2739),
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
                // "ZPM Voltage Recipe Filter"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10752),
                // "Elite World Accelerator II"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 11106),
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
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 7),
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
                getModItem(TecTech.ID, "item.tm.teslaCoilCapacitor", 1L, 6) });

        // UV Tier
        // "UV Machine Hull" - 18
        PachinkoRecipes_GT_Misc.put(
            18,
            new ItemStack[] {
                // "Wrap of UV Circuits"
                getModItem(GoodGenerator.ID, "circuitWrap", 1L, 8),
                // "LootBag (Tier 8 UV)"
                getModItem(EnhancedLootBags.ID, "lootbag", 1L, 43),
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
                // "Advanced Monster Repellator VII"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1137),
                // "UV Microwave Energy Transmitter"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1166),
                // "Naquadah Reactor Mark V"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1186),
                // "Ultimate Solar Panel"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 2740),
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
                // "Ultimate Pocket Sun"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 10753),
                // "Ultimate Time Anomaly"
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 11107),
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
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 8),
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
                getModItem(GTPlusPlus.ID, "item.itemBufferCore9", 1L) });

        // UHV Tier
        // "UHV Machine Hull" - 19
        PachinkoRecipes_GT_Misc.put(
            19,
            new ItemStack[] {
                // "Wrap of UHV Circuits"
                getModItem(GoodGenerator.ID, "circuitWrap", 1L, 9),
                // "LootBag (Tier 9 UHV)"
                getModItem(EnhancedLootBags.ID, "lootbag", 1L, 44),
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
                // Teleporter
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1145),
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
                getModItem(GregTech.ID, "gt.blockcasings", 1L, 9),
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
                getModItem(GTPlusPlus.ID, "item.itemBufferCore10", 1L) });

        // UEV Tier
        // "UEV Machine Hull" - 11230
        PachinkoRecipes_GT_Misc.put(
            11230,
            new ItemStack[] {
                // "Wrap of UEV Circuits"
                getModItem(GoodGenerator.ID, "circuitWrap", 1L, 10),
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
                getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 10),
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
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32170) });

        // UIV Tier
        // "UIV Machine Hull" - 11231
        PachinkoRecipes_GT_Misc.put(
            11231,
            new ItemStack[] {
                // "Wrap of UIV Circuits"
                getModItem(GoodGenerator.ID, "circuitWrap", 1L, 11),
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
                getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 11),
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
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32174) });

        // UMV Tier
        // "UMV Machine Hull" - 11232
        PachinkoRecipes_GT_Misc.put(
            11232,
            new ItemStack[] {
                // "Wrap of UMV Circuits"
                getModItem(GoodGenerator.ID, "circuitWrap", 1L, 12),
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
                getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 12),
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
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32175) });

        // UXV Tier
        // "UXV Machine Hull" - 11233
        PachinkoRecipes_GT_Misc.put(
            11233,
            new ItemStack[] {
                // "Wrap of UXV Circuits"
                getModItem(GoodGenerator.ID, "circuitWrap", 1L, 13),
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
                getModItem(GregTech.ID, "gt.blockcasingsNH", 1L, 13),
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
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32365),
                // "Large Plasma Battery (Empty)"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32565),
                // "Large Infinity Battery"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32590),
                // "Extremely Ultimate Battery"
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32594),
                // "Cosmic Mainframe"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32173),
                // "Temporally Transcendent Supercomputer"
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32176) });

        // MAX Tier
        // "MAX Machine Hull" - 11234
        PachinkoRecipes_GT_Misc.put(
            11234,
            new ItemStack[] {
                // "Wrap of UXV Circuits"
                getModItem(GoodGenerator.ID, "circuitWrap", 1L, 13),
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
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 12695),
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
                getModItem(GregTech.ID, "gt.metaitem.03", 1L, 32177) });
    }
}
