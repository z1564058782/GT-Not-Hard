package Recipes.SingularityRecipes_Pachinko;

import static util.AggregateItemStackArray.addAggregateArray;
import static util.AggregateItemStackArray.checkItemStack;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

public class SingularityPachinkoRecipes {

    public static final Map<Integer, ItemStack[]> PachinkoRecipes_GT_Item = new HashMap<>();
    public static final Map<Integer, ItemStack[]> PachinkoRecipes_GT_Machine = new HashMap<>();
    public static final Map<Integer, ItemStack[]> PachinkoRecipes_Storage = new HashMap<>();

    public static void addPachinkoRecipes_GT_Item() {
        // Steam Tier
        // "Bronze Hull" - 1
        ItemStack[] Steam_Tier = addAggregateArray(
            GT_Item.Steam_Tier_Block,
            GT_Item.Steam_Tier_Hatch,
            GT_Item.Steam_Tier_Machine,
            GT_Item.Steam_Tier_Misc);
        ItemStack[] Steam_Tier_Checked = checkItemStack(Steam_Tier);
        PachinkoRecipes_GT_Item.put(1, Steam_Tier_Checked);

        // ULV Tier
        // "ULV Machine Hull" - 10
        ItemStack[] ULV_Tier = addAggregateArray(
            GT_Item.ULV_Tier_Block,
            GT_Item.ULV_Tier_Cable,
            GT_Item.ULV_Tier_Hatch,
            GT_Item.ULV_Tier_Misc,
            GT_Item.ULV_Tier_Wire);
        ItemStack[] ULV_Tier_Checked = checkItemStack(ULV_Tier);
        PachinkoRecipes_GT_Item.put(10, ULV_Tier_Checked);

        // LV Tier
        // "LV Machine Hull" - 11
        ItemStack[] LV_Tier = addAggregateArray(
            GT_Item.LV_Tier_Block,
            GT_Item.LV_Tier_Cable,
            GT_Item.LV_Tier_Hatch,
            GT_Item.LV_Tier_Machine,
            GT_Item.LV_Tier_Misc,
            GT_Item.LV_Tier_Wire);
        ItemStack[] LV_Tier_Checked = checkItemStack(LV_Tier);
        PachinkoRecipes_GT_Item.put(11, LV_Tier_Checked);

        // MV Tier
        // "MV Machine Hull" - 12
        ItemStack[] MV_Tier = addAggregateArray(
            GT_Item.MV_Tier_Block,
            GT_Item.MV_Tier_Cable,
            GT_Item.MV_Tier_Hatch,
            GT_Item.MV_Tier_Machine,
            GT_Item.MV_Tier_Misc,
            GT_Item.MV_Tier_Wire);
        ItemStack[] MV_Tier_Checked = checkItemStack(MV_Tier);
        PachinkoRecipes_GT_Item.put(12, MV_Tier_Checked);

        // HV Tier
        // "HV Machine Hull" - 13
        ItemStack[] HV_Tier = addAggregateArray(
            GT_Item.HV_Tier_Block,
            GT_Item.HV_Tier_Cable,
            GT_Item.HV_Tier_Hatch,
            GT_Item.HV_Tier_Machine,
            GT_Item.HV_Tier_Misc,
            GT_Item.HV_Tier_Wire);
        ItemStack[] HV_Tier_Checked = checkItemStack(HV_Tier);
        PachinkoRecipes_GT_Item.put(13, HV_Tier_Checked);

        // EV Tier
        // "EV Machine Hull" - 14
        ItemStack[] EV_Tier = addAggregateArray(
            GT_Item.EV_Tier_Block,
            GT_Item.EV_Tier_Cable,
            GT_Item.EV_Tier_Hatch,
            GT_Item.EV_Tier_Machine,
            GT_Item.EV_Tier_Misc,
            GT_Item.EV_Tier_Wire);
        ItemStack[] EV_Tier_Checked = checkItemStack(EV_Tier);
        PachinkoRecipes_GT_Item.put(14, EV_Tier_Checked);

        // IV Tier
        // "IV Machine Hull" - 15
        ItemStack[] IV_Tier = addAggregateArray(
            GT_Item.IV_Tier_Block,
            GT_Item.IV_Tier_Cable,
            GT_Item.IV_Tier_Hatch,
            GT_Item.IV_Tier_Machine,
            GT_Item.IV_Tier_Misc,
            GT_Item.IV_Tier_Wire);
        ItemStack[] IV_Tier_Checked = checkItemStack(IV_Tier);
        PachinkoRecipes_GT_Item.put(15, IV_Tier_Checked);

        // LuV Tier
        // "LuV Machine Hull" - 16
        ItemStack[] LuV_Tier = addAggregateArray(
            GT_Item.LuV_Tier_Block,
            GT_Item.LuV_Tier_Cable,
            GT_Item.LuV_Tier_Hatch,
            GT_Item.LuV_Tier_Machine,
            GT_Item.LuV_Tier_Misc,
            GT_Item.LuV_Tier_Wire);
        ItemStack[] LuV_Tier_Checked = checkItemStack(LuV_Tier);
        PachinkoRecipes_GT_Item.put(16, LuV_Tier_Checked);

        // ZPM Tier
        // "ZPM Machine Hull" - 17
        ItemStack[] ZPM_Tier = addAggregateArray(
            GT_Item.ZPM_Tier_Block,
            GT_Item.ZPM_Tier_Cable,
            GT_Item.ZPM_Tier_Hatch,
            GT_Item.ZPM_Tier_Machine,
            GT_Item.ZPM_Tier_Misc,
            GT_Item.ZPM_Tier_Wire);
        ItemStack[] ZPM_Tier_Checked = checkItemStack(ZPM_Tier);
        PachinkoRecipes_GT_Item.put(17, ZPM_Tier_Checked);

        // UV Tier
        // "UV Machine Hull" - 18
        ItemStack[] UV_Tier = addAggregateArray(
            GT_Item.UV_Tier_Block,
            GT_Item.UV_Tier_Cable,
            GT_Item.UV_Tier_Hatch,
            GT_Item.UV_Tier_Machine,
            GT_Item.UV_Tier_Misc,
            GT_Item.UV_Tier_Wire);
        ItemStack[] UV_Tier_Checked = checkItemStack(UV_Tier);
        PachinkoRecipes_GT_Item.put(18, UV_Tier_Checked);

        // UHV Tier
        // "UHV Machine Hull" - 19
        ItemStack[] UHV_Tier = addAggregateArray(
            GT_Item.UHV_Tier_Block,
            GT_Item.UHV_Tier_Cable,
            GT_Item.UHV_Tier_Hatch,
            GT_Item.UHV_Tier_Machine,
            GT_Item.UHV_Tier_Misc,
            GT_Item.UHV_Tier_Wire);
        ItemStack[] UHV_Tier_Checked = checkItemStack(UHV_Tier);
        PachinkoRecipes_GT_Item.put(19, UHV_Tier_Checked);

        // UEV Tier
        // "UEV Machine Hull" - 11230
        ItemStack[] UEV_Tier = addAggregateArray(
            GT_Item.UEV_Tier_Block,
            GT_Item.UEV_Tier_Cable,
            GT_Item.UEV_Tier_Hatch,
            GT_Item.UEV_Tier_Machine,
            GT_Item.UEV_Tier_Misc,
            GT_Item.UEV_Tier_Wire);
        ItemStack[] UEV_Tier_Checked = checkItemStack(UEV_Tier);
        PachinkoRecipes_GT_Item.put(11230, UEV_Tier_Checked);

        // UIV Tier
        // "UIV Machine Hull" - 11231
        ItemStack[] UIV_Tier = addAggregateArray(
            GT_Item.UIV_Tier_Block,
            GT_Item.UIV_Tier_Cable,
            GT_Item.UIV_Tier_Hatch,
            GT_Item.UIV_Tier_Machine,
            GT_Item.UIV_Tier_Misc,
            GT_Item.UIV_Tier_Wire);
        ItemStack[] UIV_Tier_Checked = checkItemStack(UIV_Tier);
        PachinkoRecipes_GT_Item.put(11231, UIV_Tier_Checked);

        // UMV Tier
        // "UMV Machine Hull" - 11232
        ItemStack[] UMV_Tier = addAggregateArray(
            GT_Item.UMV_Tier_Block,
            GT_Item.UMV_Tier_Cable,
            GT_Item.UMV_Tier_Hatch,
            GT_Item.UMV_Tier_Machine,
            GT_Item.UMV_Tier_Misc,
            GT_Item.UMV_Tier_Wire);
        ItemStack[] UMV_Tier_Checked = checkItemStack(UMV_Tier);
        PachinkoRecipes_GT_Item.put(11232, UMV_Tier_Checked);

        // UXV Tier
        // "UXV Machine Hull" - 11233
        ItemStack[] UXV_Tier = addAggregateArray(
            GT_Item.UXV_Tier_Block,
            GT_Item.UXV_Tier_Hatch,
            GT_Item.UXV_Tier_Machine,
            GT_Item.UXV_Tier_Misc,
            GT_Item.UXV_Tier_Wire);
        ItemStack[] UXV_Tier_Checked = checkItemStack(UXV_Tier);
        PachinkoRecipes_GT_Item.put(11233, UXV_Tier_Checked);

        // MAX Tier
        // "1x SpaceTime Wire" - 2606
        ItemStack[] MAX_Tier = addAggregateArray(
            GT_Item.MAX_Tier_Block,
            GT_Item.MAX_Tier_Hatch,
            GT_Item.MAX_Tier_Machine,
            GT_Item.MAX_Tier_Misc,
            GT_Item.MAX_Tier_Wire);
        ItemStack[] MAX_Tier_Checked = checkItemStack(MAX_Tier);
        PachinkoRecipes_GT_Item.put(2606, MAX_Tier_Checked);
    }

    public static void addPachinkoRecipes_GT_Machine() {
        // "Bricked Blast Furnace" - 140
        PachinkoRecipes_GT_Machine.put(140, GT_Machine.Bricked_Blast_Furnace);

        // "Fluid Drilling Rig II" - 141
        PachinkoRecipes_GT_Machine.put(141, GT_Machine.Fluid_Drilling_RigII);

        // "Fluid Drilling Rig III" - 142
        PachinkoRecipes_GT_Machine.put(142, GT_Machine.Fluid_Drilling_RigIII);

        // "Concrete Backfiller" - 143
        PachinkoRecipes_GT_Machine.put(143, GT_Machine.Concrete_Backfiller);

        // "Advanced Concrete Backfiller" - 144
        PachinkoRecipes_GT_Machine.put(144, GT_Machine.Advanced_Concrete_Backfiller);

        // "Infinite Fluid Drilling Rig" - 148
        PachinkoRecipes_GT_Machine.put(148, GT_Machine.Infinite_Fluid_Drilling_Rig);

        // "Fluid Drilling Rig IV" - 149
        PachinkoRecipes_GT_Machine.put(149, GT_Machine.Fluid_Drilling_RigIV);

        // "PCB Factory" - 356
        ItemStack[] PCB_Factory_Machine = addAggregateArray(GT_Machine.PCB_Factory, GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(356, PCB_Factory_Machine);

        // "Nano Forge" - 357
        PachinkoRecipes_GT_Machine.put(357, GT_Machine.Nano_Forge);

        // "Magnetic Flux Exhibitor" - 358
        ItemStack[] Magnetic_Flux_Exhibitor_Machine = addAggregateArray(
            GT_Machine.Magnetic_Flux_Exhibitor,
            GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(358, Magnetic_Flux_Exhibitor_Machine);

        // "TurboCan Pro" - 360
        PachinkoRecipes_GT_Machine.put(360, GT_Machine.TurboCan_Pro);

        // "Fluid Shaper" - 366
        ItemStack[] Fluid_Shaper_Machine = addAggregateArray(GT_Machine.Fluid_Shaper, GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(366, Fluid_Shaper_Machine);

        // "Solar Factory" - 367
        ItemStack[] Solar_Factory_Machine = addAggregateArray(GT_Machine.Solar_Factory, GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(367, Solar_Factory_Machine);

        // "Industrial Precision Lathe" - 686
        ItemStack[] Industrial_Precision_Lathe_Machine = addAggregateArray(
            GT_Machine.Industrial_Precision_Lathe,
            GT_Machine.Glass_Block,
            GT_Machine.Item_Pipe_Casing);
        PachinkoRecipes_GT_Machine.put(686, Industrial_Precision_Lathe_Machine);

        // "Industrial Autoclave" - 687
        ItemStack[] Industrial_Autoclave_Machine = addAggregateArray(
            GT_Machine.Industrial_Autoclave,
            GT_Machine.Coil_Block,
            GT_Machine.Glass_Block,
            GT_Machine.Item_Pipe_Casing);
        PachinkoRecipes_GT_Machine.put(687, Industrial_Autoclave_Machine);

        // "Nuclear Salt Processing Plant" - 749
        PachinkoRecipes_GT_Machine.put(749, GT_Machine.Nuclear_Salt_Processing_Plant);

        // "Thorium Reactor [LFTR]" - 751
        PachinkoRecipes_GT_Machine.put(751, GT_Machine.Thorium_Reactor_LFTR);

        // "Industrial Centrifuge" - 790
        PachinkoRecipes_GT_Machine.put(790, GT_Machine.Industrial_Centrifuge);

        // "Industrial Coke Oven" - 791
        PachinkoRecipes_GT_Machine.put(791, GT_Machine.Industrial_Coke_Oven);

        // "Industrial Material Press" - 792
        PachinkoRecipes_GT_Machine.put(792, GT_Machine.Industrial_Material_Press);

        // "Industrial Electrolyzer" - 796
        PachinkoRecipes_GT_Machine.put(796, GT_Machine.Industrial_Electrolyzer);

        // "Industrial Maceration Stack" - 797
        PachinkoRecipes_GT_Machine.put(797, GT_Machine.Industrial_Maceration_Stack);

        // "Industrial Wire Factory" - 798
        PachinkoRecipes_GT_Machine.put(798, GT_Machine.Industrial_Wire_Factory);

        // "Matter Fabrication CPU" - 799
        PachinkoRecipes_GT_Machine.put(799, GT_Machine.Matter_Fabrication_CPU);

        // "Alloy Blast Smelter" - 810
        PachinkoRecipes_GT_Machine.put(810, GT_Machine.Alloy_Blast_Smelter);

        // "Industrial Mixing Machine" - 811
        PachinkoRecipes_GT_Machine.put(811, GT_Machine.Industrial_Mixing_Machine);

        // "Power Station Control Node" - 812
        PachinkoRecipes_GT_Machine.put(812, GT_Machine.Power_Station_Control_Node);

        // "COMET - Compact Cyclotron" - 828
        PachinkoRecipes_GT_Machine.put(828, GT_Machine.COMET_Compact_Cyclotron);

        // "Zhuhai - Fishing Port" - 829
        PachinkoRecipes_GT_Machine.put(829, GT_Machine.Zhuhai_Fishing_Port);

        // "Reactor Fuel Processing Plant" - 835
        PachinkoRecipes_GT_Machine.put(835, GT_Machine.Reactor_Fuel_Processing_Plant);

        // "Tree Growth Simulator" - 836
        PachinkoRecipes_GT_Machine.put(836, GT_Machine.Tree_Growth_Simulator);

        // "Large Sifter Control Block" - 840
        PachinkoRecipes_GT_Machine.put(840, GT_Machine.Large_Sifter_Control_Block);

        // "Large Thermal Refinery" - 849
        PachinkoRecipes_GT_Machine.put(849, GT_Machine.Large_Thermal_Refinery);

        // "Ore Washing Plant" - 850
        PachinkoRecipes_GT_Machine.put(850, GT_Machine.Ore_Washing_Plant);

        // "Industrial Extrusion Machine" - 859
        PachinkoRecipes_GT_Machine.put(859, GT_Machine.Industrial_Extrusion_Machine);

        // "High Current Industrial Arc Furnace" - 862
        PachinkoRecipes_GT_Machine.put(862, GT_Machine.High_Current_Industrial_Arc_Furnace);

        // "Solar Tower" - 863
        PachinkoRecipes_GT_Machine.put(863, GT_Machine.Solar_Tower);

        // "XL Turbo Steam Turbine" - 865
        PachinkoRecipes_GT_Machine.put(865, GT_Machine.XL_Turbo_Steam_Turbine);

        // "XL Turbo HP Steam Turbine" - 866
        PachinkoRecipes_GT_Machine.put(866, GT_Machine.XL_Turbo_HP_Steam_Turbine);

        // "Thermal Boiler" - 875
        PachinkoRecipes_GT_Machine.put(875, GT_Machine.Thermal_Boiler);

        // "Large Scale Auto-Assembler v1.01" - 876
        PachinkoRecipes_GT_Machine.put(876, GT_Machine.Large_Scale_Auto_Assembler);

        // "Cryogenic Freezer" - 910
        PachinkoRecipes_GT_Machine.put(910, GT_Machine.Cryogenic_Freezer);

        // "Amazon Warehousing Depot" - 942
        PachinkoRecipes_GT_Machine.put(942, GT_Machine.Amazon_Warehousing_Depot);

        // Volcanus - 963
        ItemStack[] Volcanus_Machine = addAggregateArray(GT_Machine.Volcanus, GT_Machine.Coil_Block);
        PachinkoRecipes_GT_Machine.put(963, Volcanus_Machine);

        // Density^2 - 964
        PachinkoRecipes_GT_Machine.put(964, GT_Machine.Density);

        // "FusionTech MK IV" - 965
        PachinkoRecipes_GT_Machine.put(965, GT_Machine.FusionTech_MKIV);

        // "FusionTech MK V" - 975
        PachinkoRecipes_GT_Machine.put(975, GT_Machine.FusionTech_MKV);

        // "Industrial Cutting Factory" - 992
        PachinkoRecipes_GT_Machine.put(992, GT_Machine.Industrial_Cutting_Factory);

        // Utupu-Tanuri - 995
        ItemStack[] Utupu_Tanuri_Machine = addAggregateArray(GT_Machine.Utupu_Tanuri, GT_Machine.Coil_Block);
        PachinkoRecipes_GT_Machine.put(995, Utupu_Tanuri_Machine);

        // "Rocketdyne F-1A Engine" - 996
        PachinkoRecipes_GT_Machine.put(996, GT_Machine.Rocketdyne_F1A_Engine);

        // "Algae Farm" - 997
        ItemStack[] Algae_Farm_Machine = addAggregateArray(GT_Machine.Algae_Farm, GT_Machine.Machine_Casing);
        PachinkoRecipes_GT_Machine.put(997, Algae_Farm_Machine);

        // "ExxonMobil Chemical Plant" - 998
        ItemStack[] ExxonMobil_Chemical_Plant_Machine = addAggregateArray(
            GT_Machine.ExxonMobil_Chemical_Plant,
            GT_Machine.Coil_Block,
            GT_Machine.Machine_Casing);
        PachinkoRecipes_GT_Machine.put(998, ExxonMobil_Chemical_Plant_Machine);

        // "Electric Blast Furnace" - 1000
        ItemStack[] Electric_Blast_Furnace_Machine = addAggregateArray(
            GT_Machine.Electric_Blast_Furnace,
            GT_Machine.Coil_Block);
        PachinkoRecipes_GT_Machine.put(1000, Electric_Blast_Furnace_Machine);

        // "Implosion Compressor" - 1001
        PachinkoRecipes_GT_Machine.put(1001, GT_Machine.Implosion_Compressor);

        // "Vacuum Freezer" - 1002
        PachinkoRecipes_GT_Machine.put(1002, GT_Machine.Vacuum_Freezer);

        // "Multi Smelter" - 1003
        ItemStack[] Multi_Smelter_Machine = addAggregateArray(GT_Machine.Multi_Smelter, GT_Machine.Coil_Block);
        PachinkoRecipes_GT_Machine.put(1003, Multi_Smelter_Machine);

        // "Dimensionally Transcendent Plasma Forge" - 1004
        ItemStack[] Dimensionally_Transcendent_Plasma_Forge_Machine = addAggregateArray(
            GT_Machine.Dimensionally_Transcendent_Plasma_Forge,
            GT_Machine.Coil_Block);
        PachinkoRecipes_GT_Machine.put(1004, Dimensionally_Transcendent_Plasma_Forge_Machine);

        // "Transcendent Plasma Mixer" - 1006
        PachinkoRecipes_GT_Machine.put(1006, GT_Machine.Transcendent_Plasma_Mixer);

        // "Large Bronze Boiler" - 1020
        PachinkoRecipes_GT_Machine.put(1020, GT_Machine.Large_Bronze_Boiler);

        // "Large Steel Boiler" - 1021
        PachinkoRecipes_GT_Machine.put(1021, GT_Machine.Large_Steel_Boiler);

        // "Large Titanium Boiler" - 1022
        PachinkoRecipes_GT_Machine.put(1022, GT_Machine.Large_Titanium_Boiler);

        // "Large Tungstensteel Boiler" - 1023
        PachinkoRecipes_GT_Machine.put(1023, GT_Machine.Large_Tungstensteel_Boiler);

        // "Distillation Tower" - 1126
        PachinkoRecipes_GT_Machine.put(1126, GT_Machine.Distillation_Tower);

        // "Large Steam Turbine" - 1131
        PachinkoRecipes_GT_Machine.put(1131, GT_Machine.Large_Steam_Turbine);

        // "Integrated Ore Factory" - 1132
        ItemStack[] Integrated_Ore_Factory_Machine = addAggregateArray(
            GT_Machine.Integrated_Ore_Factory,
            GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(1132, Integrated_Ore_Factory_Machine);

        // "Large Gas Turbine" - 1151
        PachinkoRecipes_GT_Machine.put(1151, GT_Machine.Large_Gas_Turbine);

        // "Large HP Steam Turbine" - 1152
        PachinkoRecipes_GT_Machine.put(1152, GT_Machine.Large_HP_Steam_Turbine);

        // "Large Plasma Turbine" - 1153
        PachinkoRecipes_GT_Machine.put(1153, GT_Machine.Large_Plasma_Turbine);

        // "Large Heat Exchanger" - 1154
        PachinkoRecipes_GT_Machine.put(1154, GT_Machine.Large_Heat_Exchanger);

        // "Fluid Drilling Rig" - 1157
        PachinkoRecipes_GT_Machine.put(1157, GT_Machine.Fluid_Drilling_Rig);

        // "Ore Drilling Plant" - 1158
        PachinkoRecipes_GT_Machine.put(1158, GT_Machine.Ore_Drilling_Plant);

        // "Pyrolyse Oven" - 1159
        ItemStack[] Pyrolyse_Oven_Machine = addAggregateArray(GT_Machine.Pyrolyse_Oven, GT_Machine.Coil_Block);
        PachinkoRecipes_GT_Machine.put(1159, Pyrolyse_Oven_Machine);

        // "Oil Cracking Unit" - 1160
        ItemStack[] Oil_Cracking_Unit_Machine = addAggregateArray(GT_Machine.Oil_Cracking_Unit, GT_Machine.Coil_Block);
        PachinkoRecipes_GT_Machine.put(1160, Oil_Cracking_Unit_Machine);

        // "Large Chemical Reactor" - 1169
        PachinkoRecipes_GT_Machine.put(1169, GT_Machine.Large_Chemical_Reactor);

        // "Assembly Line" - 1170
        ItemStack[] Assembly_Line_Machine = addAggregateArray(GT_Machine.Assembly_Line, GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(1170, Assembly_Line_Machine);

        // "Large Combustion Engine" - 1171
        PachinkoRecipes_GT_Machine.put(1171, GT_Machine.Large_Combustion_Engine);

        // "Cleanroom Controller" - 1172
        PachinkoRecipes_GT_Machine.put(1172, GT_Machine.Cleanroom);

        // "Ore Drilling Plant II" - 1177
        PachinkoRecipes_GT_Machine.put(1177, GT_Machine.Ore_Drilling_Plant_II);

        // "Ore Drilling Plant III" - 1178
        PachinkoRecipes_GT_Machine.put(1178, GT_Machine.Ore_Drilling_Plant_III);

        // "Ore Drilling Plant IV" - 1179
        PachinkoRecipes_GT_Machine.put(1179, GT_Machine.Ore_Drilling_Plant_IV);

        // "Fusion Control Computer Mark I" - 1193
        PachinkoRecipes_GT_Machine.put(1193, GT_Machine.Fusion_Control_Computer_MarkI);

        // "Fusion Control Computer Mark II" - 1194
        PachinkoRecipes_GT_Machine.put(1194, GT_Machine.Fusion_Control_Computer_MarkII);

        // "Fusion Control Computer Mark III" - 1195
        PachinkoRecipes_GT_Machine.put(1195, GT_Machine.Fusion_Control_Computer_MarkIII);

        // "Extreme Combustion Engine" - 2105
        PachinkoRecipes_GT_Machine.put(2105, GT_Machine.Extreme_Combustion_Engine);

        // "Large Fluid Extractor" - 2730
        ItemStack[] Large_Fluid_Extractor_Machine = addAggregateArray(
            GT_Machine.Large_Fluid_Extractor,
            GT_Machine.Coil_Block,
            GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(2730, Large_Fluid_Extractor_Machine);

        // "Matter Manipulator Quantum Uplink" - 2731
        PachinkoRecipes_GT_Machine.put(2731, GT_Machine.Matter_Manipulator_Quantum_Uplink);

        // "Hyper-Intensity Laser Engraver" - 3004
        ItemStack[] Hyper_Intensity_Laser_Engraver_Machine = addAggregateArray(
            GT_Machine.Hyper_Intensity_Laser_Engraver,
            GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(3004, Hyper_Intensity_Laser_Engraver_Machine);

        // "Large Electric Compressor" - 3005
        ItemStack[] Large_Electric_Compressor_Machine = addAggregateArray(
            GT_Machine.Large_Electric_Compressor,
            GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(3005, Large_Electric_Compressor_Machine);

        // "Hot Isostatic Pressurization Unit" - 3006
        ItemStack[] Hot_Isostatic_Pressurization_Unit_Machine = addAggregateArray(
            GT_Machine.Hot_Isostatic_Pressurization_Unit,
            GT_Machine.Coil_Block,
            GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(3006, Hot_Isostatic_Pressurization_Unit_Machine);

        // "Neutronium Compressor" - 3007
        ItemStack[] Neutronium_Compressor_Machine = addAggregateArray(
            GT_Machine.Neutronium_Compressor,
            GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(3007, Neutronium_Compressor_Machine);

        // "Pseudostable Black Hole Containment Field" - 3008
        PachinkoRecipes_GT_Machine.put(3008, GT_Machine.Pseudostable_Black_Hole_Containment_Field);

        // "Dissection Apparatus" - 3010
        ItemStack[] Dissection_Apparatus_Machine = addAggregateArray(
            GT_Machine.Dissection_Apparatus,
            GT_Machine.Glass_Block,
            GT_Machine.Item_Pipe_Casing);
        PachinkoRecipes_GT_Machine.put(3010, Dissection_Apparatus_Machine);

        // "Big Barrel Brewery" - 3011
        ItemStack[] Big_Barrel_Brewery_Machine = addAggregateArray(
            GT_Machine.Big_Barrel_Brewery,
            GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(3011, Big_Barrel_Brewery_Machine);

        // "Draconic Evolution Fusion Crafter" - 5001
        PachinkoRecipes_GT_Machine.put(5001, GT_Machine.Draconic_Evolution_Fusion_Crafter);

        // "Drone Centre" - 9400
        ItemStack[] Drone_Centre_Machine = addAggregateArray(GT_Machine.Drone_Centre, GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(9400, Drone_Centre_Machine);

        // "Water Purification Plant" - 9402
        PachinkoRecipes_GT_Machine.put(9402, GT_Machine.Water_Purification_Plant);

        // Digester - 10500
        ItemStack[] Digester_Machine = addAggregateArray(GT_Machine.Digester, GT_Machine.Coil_Block);
        PachinkoRecipes_GT_Machine.put(10500, Digester_Machine);

        // "Dissolution Tank" - 10501
        ItemStack[] Dissolution_Tank_Machine = addAggregateArray(GT_Machine.Dissolution_Tank, GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(10501, Dissolution_Tank_Machine);

        // "Linear Accelerator" - 10505
        ItemStack[] Linear_Accelerator_Machine = addAggregateArray(
            GT_Machine.Linear_Accelerator,
            GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(10505, Linear_Accelerator_Machine);

        // "Source Chamber" - 10506
        PachinkoRecipes_GT_Machine.put(10506, GT_Machine.Source_Chamber);

        // Synchrotron - 10507
        ItemStack[] Synchrotron_Machine = addAggregateArray(GT_Machine.Synchrotron, GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(10507, Synchrotron_Machine);

        // "Target Chamber" - 10508
        PachinkoRecipes_GT_Machine.put(10508, GT_Machine.Target_Chamber);

        // "Electric Air Filter T1" - 12020
        PachinkoRecipes_GT_Machine.put(12020, GT_Machine.Electric_Air_Filter_T1);

        // "Electric Air Filter T2" - 12021
        PachinkoRecipes_GT_Machine.put(12021, GT_Machine.Electric_Air_Filter_T2);

        // "Electric Air Filter T3" - 12022
        PachinkoRecipes_GT_Machine.put(12022, GT_Machine.Electric_Air_Filter_T3);

        // "Manual Transformer" - 12697
        PachinkoRecipes_GT_Machine.put(12697, GT_Machine.Manual_Transformer);

        // Windmill - 12698
        PachinkoRecipes_GT_Machine.put(12698, GT_Machine.Windmill);

        // "Bacterial Vat" - 12712
        ItemStack[] Bacterial_Vat_Machine = addAggregateArray(GT_Machine.Bacterial_Vat, GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(12712, Bacterial_Vat_Machine);

        // "Deep Earth Heating Pump" - 12729
        PachinkoRecipes_GT_Machine.put(12729, GT_Machine.Deep_Earth_Heating_Pump);

        // "Mega Electric Blast Furnace" - 12730
        ItemStack[] Mega_Electric_Blast_Furnace_Machine = addAggregateArray(
            GT_Machine.Mega_Electric_Blast_Furnace,
            GT_Machine.Coil_Block,
            GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(12730, Mega_Electric_Blast_Furnace_Machine);

        // "Mega Vacuum Freezer" - 12731
        PachinkoRecipes_GT_Machine.put(12731, GT_Machine.Mega_Vacuum_Freezer);

        // "Large Naquadah Reactor" - 12732
        PachinkoRecipes_GT_Machine.put(12732, GT_Machine.Large_Naquadah_Reactor);

        // "Thorium High Temperature Reactor" - 12733
        PachinkoRecipes_GT_Machine.put(12733, GT_Machine.Thorium_High_Temperature_Reactor);

        // "Electric Implosion Compressor" - 12734
        PachinkoRecipes_GT_Machine.put(12734, GT_Machine.Electric_Implosion_Compressor);

        // "Circuit Assembly Line" - 12735
        ItemStack[] Circuit_Assembly_Line_Machine = addAggregateArray(
            GT_Machine.Circuit_Assembly_Line,
            GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(12735, Circuit_Assembly_Line_Machine);

        // "Mega Distillation Tower" - 12738
        PachinkoRecipes_GT_Machine.put(12738, GT_Machine.Mega_Distillation_Tower);

        // "Void Miner III" - 12739
        PachinkoRecipes_GT_Machine.put(12739, GT_Machine.Void_Miner_III);

        // "Void Miner II" - 12740
        PachinkoRecipes_GT_Machine.put(12740, GT_Machine.Void_Miner_II);

        // "Void Miner I" - 12741
        PachinkoRecipes_GT_Machine.put(12741, GT_Machine.Void_Miner_I);

        // "High Temperature Gas-cooled Reactor" - 12791
        PachinkoRecipes_GT_Machine.put(12791, GT_Machine.High_Temperature_Gas_Cooled_Reactor);

        // "Extreme Industrial Greenhouse" - 12792
        ItemStack[] Extreme_Industrial_Greenhouse_Machine = addAggregateArray(
            GT_Machine.Extreme_Industrial_Greenhouse,
            GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(12792, Extreme_Industrial_Greenhouse_Machine);

        // "Research Completer" - 13001
        PachinkoRecipes_GT_Machine.put(13001, GT_Machine.Research_Completer);

        // "Solid-Oxide Fuel Cell Mk I" - 13101
        PachinkoRecipes_GT_Machine.put(13101, GT_Machine.Solid_Oxide_Fuel_Cell_MkI);

        // "Solid-Oxide Fuel Cell Mk II" - 13102
        PachinkoRecipes_GT_Machine.put(13102, GT_Machine.Solid_Oxide_Fuel_Cell_MkII);

        // T.F.F.T - 13104
        ItemStack[] TFFT_Machine = addAggregateArray(GT_Machine.TFFT, GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(13104, TFFT_Machine);

        // "Lapotronic Supercapacitor" - 13106
        ItemStack[] Lapotronic_Supercapacitor_Machine = addAggregateArray(
            GT_Machine.Lapotronic_Supercapacitor,
            GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(13106, Lapotronic_Supercapacitor_Machine);

        // "Miniature Wormhole Generator" - 13115
        ItemStack[] Miniature_Wormhole_Generator_Machine = addAggregateArray(
            GT_Machine.Miniature_Wormhole_Generator,
            GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(13115, Miniature_Wormhole_Generator_Machine);

        // "Mega Chemical Reactor" - 13366
        ItemStack[] Mega_Chemical_Reactor_Machine = addAggregateArray(
            GT_Machine.Mega_Chemical_Reactor,
            GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(13366, Mega_Chemical_Reactor_Machine);

        // "Mega Oil Cracker" - 13367
        ItemStack[] Mega_Oil_Cracker_Machine = addAggregateArray(
            GT_Machine.Mega_Oil_Cracker,
            GT_Machine.Coil_Block,
            GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(13367, Mega_Oil_Cracker_Machine);

        // "Advanced Assembly Line" - 13532
        ItemStack[] _Machine = addAggregateArray(GT_Machine.Advanced_Assembly_Line, GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(13532, _Machine);

        // "Dyson Swarm Ground Unit" - 14001
        PachinkoRecipes_GT_Machine.put(14001, GT_Machine.Dyson_Swarm_Ground_Unit);

        // "Planetary Gas Siphon" - 14002
        PachinkoRecipes_GT_Machine.put(14002, GT_Machine.Planetary_Gas_Siphon);

        // "Space Elevator" - 14003
        PachinkoRecipes_GT_Machine.put(14003, GT_Machine.Space_Elevator);

        // "Large Molecular Assembler" - 14101
        PachinkoRecipes_GT_Machine.put(14101, GT_Machine.Large_Molecular_Assembler);

        // "Extreme Entity Crusher" - 14201
        ItemStack[] Extreme_Entity_Crusher_Machine = addAggregateArray(
            GT_Machine.Extreme_Entity_Crusher,
            GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(14201, Extreme_Entity_Crusher_Machine);

        // "Industrial Apicultural Acclimatiser and Drone Domestication Station" - 14202
        ItemStack[] Industrial_Apicultural_Acclimatiser_and_Drone_Domestication_Station_Machine = addAggregateArray(
            GT_Machine.Industrial_Apicultural_Acclimatiser_and_Drone_Domestication_Station,
            GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine
            .put(14202, Industrial_Apicultural_Acclimatiser_and_Drone_Domestication_Station_Machine);

        // "Active Transformer" - 15300
        PachinkoRecipes_GT_Machine.put(15300, GT_Machine.Active_Transformer);

        // "Weighted Network Switch With QoS" - 15310
        PachinkoRecipes_GT_Machine.put(15310, GT_Machine.Weighted_Network_Switch_With_QoS);

        // "Quantum Computer" - 15311
        PachinkoRecipes_GT_Machine.put(15311, GT_Machine.Quantum_Computer);

        // "Microwave Grinder" - 15312
        PachinkoRecipes_GT_Machine.put(15312, GT_Machine.Microwave_Grinder);

        // "Data Bank" - 15313
        PachinkoRecipes_GT_Machine.put(15313, GT_Machine.Data_Bank);

        // "Tesla Tower" - 15314
        PachinkoRecipes_GT_Machine.put(15314, GT_Machine.Tesla_Tower);

        // "Static Network Switch With QoS" - 15315
        PachinkoRecipes_GT_Machine.put(15315, GT_Machine.Static_Network_Switch_With_QoS);

        // "Research Station" - 15331
        PachinkoRecipes_GT_Machine.put(15331, GT_Machine.Research_Station);

        // "Energy Infuser" - 15350
        PachinkoRecipes_GT_Machine.put(15350, GT_Machine.Energy_Infuser);

        // "Eye of Harmony" - 15410
        PachinkoRecipes_GT_Machine.put(15410, GT_Machine.Eye_of_Harmony);

        // "Forge of the Gods" - 15411
        PachinkoRecipes_GT_Machine.put(15411, GT_Machine.Forge_of_the_Gods);

        // "Entropic Processor" - 15750
        PachinkoRecipes_GT_Machine.put(15750, GT_Machine.Entropic_Processor);

        // "Decay Warehouse" - 15751
        PachinkoRecipes_GT_Machine.put(15751, GT_Machine.Decay_Warehouse);

        // "Naquadah Fuel Refinery" - 16999
        PachinkoRecipes_GT_Machine.put(16999, GT_Machine.Naquadah_Fuel_Refinery);

        // "Hydro Dam" - 17000
        PachinkoRecipes_GT_Machine.put(17000, GT_Machine.Hydro_Dam);

        // "Hydro Pump" - 17003
        PachinkoRecipes_GT_Machine.put(17003, GT_Machine.Hydro_Pump);

        // "Hydro Turbine" - 17019
        PachinkoRecipes_GT_Machine.put(17019, GT_Machine.Hydro_Turbine);

        // "Dangote Distillus" - 31021
        PachinkoRecipes_GT_Machine.put(31021, GT_Machine.Dangote_Distillus);

        // Zyngen - 31023
        ItemStack[] Zyngen_Machine = addAggregateArray(GT_Machine.Zyngen, GT_Machine.Coil_Block);
        PachinkoRecipes_GT_Machine.put(31023, Zyngen_Machine);

        // "Large Semifluid Burner" - 31026
        PachinkoRecipes_GT_Machine.put(31026, GT_Machine.Large_Semifluid_Burner);

        // "IsaMill Grinding Machine" - 31027
        PachinkoRecipes_GT_Machine.put(31027, GT_Machine.IsaMill_Grinding_Machine);

        // "Flotation Cell Regulator" - 31028
        PachinkoRecipes_GT_Machine.put(31028, GT_Machine.Flotation_Cell_Regulator);

        // "Sparge Tower Controller" - 31035
        PachinkoRecipes_GT_Machine.put(31035, GT_Machine.Sparge_Tower_Controller);

        // "Steam Grinder" - 31041
        PachinkoRecipes_GT_Machine.put(31041, GT_Machine.Steam_Grinder);

        // "Elemental Duplicator" - 31050
        PachinkoRecipes_GT_Machine.put(31050, GT_Machine.Elemental_Duplicator);

        // Boldarnator - 31065
        PachinkoRecipes_GT_Machine.put(31065, GT_Machine.Boldarnator);

        // "Industrial 3D Copying Machine" - 31069
        PachinkoRecipes_GT_Machine.put(31069, GT_Machine.Industrial_3D_Copying_Machine);

        // "Molecular Transformer" - 31072
        PachinkoRecipes_GT_Machine.put(31072, GT_Machine.Molecular_Transformer);

        // "XL Turbo Gas Turbine" - 31073
        PachinkoRecipes_GT_Machine.put(31073, GT_Machine.XL_Turbo_Gas_Turbine);

        // "XL Turbo Plasma Turbine" - 31074
        PachinkoRecipes_GT_Machine.put(31074, GT_Machine.XL_Turbo_Plasma_Turbine);

        // "Industrial Sledgehammer" - 31075
        PachinkoRecipes_GT_Machine.put(31075, GT_Machine.Industrial_Sledgehammer);

        // "XL Turbo SC Steam Turbine" - 31076
        PachinkoRecipes_GT_Machine.put(31076, GT_Machine.XL_Turbo_SC_Steam_Turbine);

        // "Thermic Heating Device" - 31077
        PachinkoRecipes_GT_Machine.put(31077, GT_Machine.Thermic_Heating_Device);

        // "Steam Squasher" - 31078
        PachinkoRecipes_GT_Machine.put(31078, GT_Machine.Steam_Squasher);

        // "Whakawhiti Wera XL" - 31079
        PachinkoRecipes_GT_Machine.put(31079, GT_Machine.Whakawhiti_Wera_XL);

        // "Steam Separator" - 31080
        PachinkoRecipes_GT_Machine.put(31080, GT_Machine.Steam_Separator);

        // "Steam Purifier" - 31082
        PachinkoRecipes_GT_Machine.put(31082, GT_Machine.Steam_Purifier);

        // "Steam Presser" - 31083
        PachinkoRecipes_GT_Machine.put(31083, GT_Machine.Steam_Presser);

        // "Steam Blender" - 31084
        PachinkoRecipes_GT_Machine.put(31084, GT_Machine.Steam_Blender);

        // "Water Pump" - 31085
        PachinkoRecipes_GT_Machine.put(31085, GT_Machine.Water_Pump);

        // "Steam Fuser" - 31086
        ItemStack[] Steam_Fuser_Machine = addAggregateArray(GT_Machine.Steam_Fuser, GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(31086, Steam_Fuser_Machine);

        // "Mega Alloy Blast Smelter" - 31150
        ItemStack[] Mega_Alloy_Blast_Smelter_Machine = addAggregateArray(
            GT_Machine.Mega_Alloy_Blast_Smelter,
            GT_Machine.Coil_Block,
            GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(31150, Mega_Alloy_Blast_Smelter_Machine);

        // "Quantum Force Transformer" - 31151
        PachinkoRecipes_GT_Machine.put(31151, GT_Machine.Quantum_Force_Transformer);

        // "Universal Chemical Fuel Engine" - 32001
        PachinkoRecipes_GT_Machine.put(32001, GT_Machine.Universal_Chemical_Fuel_Engine);

        // "Neutron Activator" - 32013
        ItemStack[] Neutron_Activator_Machine = addAggregateArray(GT_Machine.Neutron_Activator, GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(32013, Neutron_Activator_Machine);

        // YOTTank - 32014
        ItemStack[] YOTTank_Machine = addAggregateArray(GT_Machine.YOTTank, GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(32014, YOTTank_Machine);

        // "Large Supercritical Steam Turbine" - 32016
        PachinkoRecipes_GT_Machine.put(32016, GT_Machine.Large_Supercritical_Steam_Turbine);

        // "Extreme Heat Exchanger" - 32017
        ItemStack[] Extreme_Heat_Exchanger_Machine = addAggregateArray(
            GT_Machine.Extreme_Heat_Exchanger,
            GT_Machine.Coil_Block,
            GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(32017, Extreme_Heat_Exchanger_Machine);

        // "Precise Auto-Assembler MT-3662" - 32018
        ItemStack[] Precise_Auto_Assembler_MT3662_Machine = addAggregateArray(
            GT_Machine.Precise_Auto_Assembler_MT3662,
            GT_Machine.Glass_Block,
            GT_Machine.Machine_Casing);
        PachinkoRecipes_GT_Machine.put(32018, Precise_Auto_Assembler_MT3662_Machine);

        // "Compact Fusion Computer MK-I Prototype" - 32019
        PachinkoRecipes_GT_Machine.put(32019, GT_Machine.Compact_Fusion_Computer_MKI_Prototype);

        // "Compact Fusion Computer MK-II" - 32020
        PachinkoRecipes_GT_Machine.put(32020, GT_Machine.Compact_Fusion_Computer_MKII);

        // "Compact Fusion Computer MK-III" - 32021
        PachinkoRecipes_GT_Machine.put(32021, GT_Machine.Compact_Fusion_Computer_MKIII);

        // "Compact Fusion Computer MK-IV Prototype" - 32022
        PachinkoRecipes_GT_Machine.put(32022, GT_Machine.Compact_Fusion_Computer_MKIV_Prototype);

        // "Compact Fusion Computer MK-V" - 32023
        PachinkoRecipes_GT_Machine.put(32023, GT_Machine.Compact_Fusion_Computer_MKV);

        // "Large Essentia Smeltery" - 32024
        PachinkoRecipes_GT_Machine.put(32024, GT_Machine.Large_Essentia_Smeltery);

        // "Coolant Tower" - 32025
        PachinkoRecipes_GT_Machine.put(32025, GT_Machine.Coolant_Tower);

        // "Component Assembly Line" - 32026
        ItemStack[] Component_Assembly_Line_Machine = addAggregateArray(
            GT_Machine.Component_Assembly_Line,
            GT_Machine.Glass_Block);
        PachinkoRecipes_GT_Machine.put(32026, Component_Assembly_Line_Machine);

        // "Semi-Stable Antimatter Stabilization Sequencer" - 32027
        PachinkoRecipes_GT_Machine.put(32027, GT_Machine.Semi_Stable_Antimatter_Stabilization_Sequencer);

        // "Shielded Lagrangian Annihilation Matrix" - 32028
        PachinkoRecipes_GT_Machine.put(32028, GT_Machine.Shielded_Lagrangian_Annihilation_Matrix);
    }

    public static void addPachinkoRecipes_Storage() {
        // Item Storage
        // "Super Chest I" - 135
        PachinkoRecipes_Storage.put(135, Storage.Item_Storage);

        // Fluid Storage
        // "Ultra Low Voltage Fluid Tank" - 817
        PachinkoRecipes_Storage.put(817, Storage.Fluid_Storage);

        // AppliedEnergistics2 Storage
        // "Super Tank I" - 130
        PachinkoRecipes_Storage.put(130, Storage.Fluid_Storage);
    }
}
