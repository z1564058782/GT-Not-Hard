package Recipes;

import static gregtech.api.enums.Mods.AE2FluidCraft;
import static gregtech.api.enums.Mods.AppliedEnergistics2;
import static gregtech.api.enums.Mods.Avaritia;
import static gregtech.api.enums.Mods.AvaritiaAddons;
import static gregtech.api.enums.Mods.Computronics;
import static gregtech.api.enums.Mods.DraconicEvolution;
import static gregtech.api.enums.Mods.ElectroMagicTools;
import static gregtech.api.enums.Mods.EnderIO;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.OpenComputers;
import static gregtech.api.enums.Mods.ProjectRedFabrication;
import static gregtech.api.enums.Mods.SGCraft;
import static gregtech.api.enums.Mods.ThaumicEnergistics;
import static gregtech.api.enums.Mods.Witchery;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import gregtech.api.enums.GTValues;
import gregtech.api.enums.ItemList;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import tectech.thing.CustomItemList;
import util.OneToManyItemsFrontend;

public class FakeChaosXtremeCraftingRecipes {

    public static final RecipeMap<RecipeMapBackend> addFakeChaosXtremeCraftingRecipes = RecipeMapBuilder
        .of("Chaos of FakeChaosXtremeCraftingRecipes")
        .maxIO(1, 135, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend::new)
        .build();

    public static void addFakeChaosXtremeCraftingRecipes() {
        // "Auto Workbench (LV)" - 31091
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31091))
            .itemOutputs(
                getModItem(Witchery.ID, "infinityegg", 1L), // "Infinity Egg"
                getModItem(Avaritia.ID, "Resource", 1L, 6), // 无尽之锭
                getModItem(AvaritiaAddons.ID, "InfinityChest", 1L), // 无尽箱子
                getModItem(AppliedEnergistics2.ID, "item.ItemExtremeStorageCell.Quantum", 1L), // ME量子存储元件
                getModItem(AppliedEnergistics2.ID, "tile.BlockCreativeEnergyCell", 1L), // 中子能源元件
                getModItem(AppliedEnergistics2.ID, "tile.BlockSingularityCraftingStorage", 1L, 0), // 奇点合成存储器
                getModItem(AE2FluidCraft.ID, "fluid_storage.quantum", 1L, 1), // ME量子流体存储元件
                getModItem(AE2FluidCraft.ID, "fluid_storage.infinity.water", 1L, 1), // ME无限水流体存储元件
                getModItem(ThaumicEnergistics.ID, "storage.essentia", 1L, 9), // ME源质量子存储元件
                getModItem(EnderIO.ID, "blockCapBank", 1L, 0), // 混沌电容库
                getModItem(Computronics.ID, "computronics.ocSpecialParts", 1L, 0), // 创造模式内存
                getModItem(OpenComputers.ID, "item", 1L, 103), // T3加速处理器(APU)
                getModItem(OpenComputers.ID, "item", 1L, 90), // T3微控制器外壳
                getModItem(OpenComputers.ID, "item", 1L, 91), // T3无人机外壳
                getModItem(ProjectRedFabrication.ID, "projectred.fabrication.icchip", 1L, 1), // 创造模式IC芯片
                getModItem(DraconicEvolution.ID, "draconiumFluxCapacitor", 1L, 0), // 双足飞龙通量电容器
                getModItem(DraconicEvolution.ID, "draconiumFluxCapacitor", 1L, 1), // 龙之通量电容器
                getModItem(DraconicEvolution.ID, "reactorCraftingPart", 1L, 1), // 反应堆稳定器转子
                getModItem(DraconicEvolution.ID, "reactorCraftingPart", 1L, 2), // 反应堆稳定器外转子
                getModItem(DraconicEvolution.ID, "reactorCraftingPart", 1L, 3), // 反应堆稳定器转子总成
                getModItem(DraconicEvolution.ID, "reactorCraftingPart", 1L, 4), // 反应堆稳定器聚能环
                getModItem(DraconicEvolution.ID, "reactorCraftingPart", 1L, 0), // 反应堆稳定器支架
                getModItem(DraconicEvolution.ID, "reactorStabilizer", 1L), // 反应堆稳定器
                getModItem(DraconicEvolution.ID, "teleporterMKI", 1L), // 错位宝石
                getModItem(DraconicEvolution.ID, "teleporterMKII", 1L), // 高级错位宝石
                getModItem(DraconicEvolution.ID, "teleporterStand", 1L), // 错位宝石底座
                getModItem(DraconicEvolution.ID, "dislocatorReceptacle", 1L), // 错位容器
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32752), // 太阳能覆盖板(LV)
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32753), // 太阳能覆盖板(MV)
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32754), // 太阳能覆盖板(HV)
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32755), // 太阳能覆盖板(EV)
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32756), // 太阳能覆盖板(IV)
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32757), // 太阳能覆盖板(LuV)
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32758), // 太阳能覆盖板(ZPM)
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 32759), // 太阳能覆盖板(UV)
                getModItem(SGCraft.ID, "sgChevronUpgrade", 1L), // 星门导标升级
                getModItem(SGCraft.ID, "sgIrisBlade", 1L), // 星门虹膜叶片
                getModItem(SGCraft.ID, "sgIrisUpgrade", 1L), // 星门虹膜升级
                getModItem(SGCraft.ID, "ic2Capacitor", 1L), // 吊炸天电容
                getModItem(SGCraft.ID, "stargateRing", 1L, 0), // 星门外环方块
                getModItem(SGCraft.ID, "stargateRing", 1L, 1), // 星门导标方块
                getModItem(SGCraft.ID, "stargateBase", 1L), // 星门底座方块
                getModItem(SGCraft.ID, "rfPowerUnit", 1L), // RF星门能量单元
                getModItem(SGCraft.ID, "ocInterface", 1L), // 星门OC接口
                getModItem(SGCraft.ID, "stargateController", 1L) // 星门控制器
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Show Chaos of Xtreme Crafting Recipes")
            .eut(0)
            .addTo(addFakeChaosXtremeCraftingRecipes);

        // "Auto Workbench (LV)" - 31091
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31091))
            .itemOutputs(
                // 1A Wireless Energy Hatch
                ItemList.Wireless_Hatch_Energy_ULV.get(1),
                ItemList.Wireless_Hatch_Energy_LV.get(1),
                ItemList.Wireless_Hatch_Energy_MV.get(1),
                ItemList.Wireless_Hatch_Energy_HV.get(1),
                ItemList.Wireless_Hatch_Energy_EV.get(1),
                ItemList.Wireless_Hatch_Energy_IV.get(1),
                ItemList.Wireless_Hatch_Energy_LuV.get(1),
                ItemList.Wireless_Hatch_Energy_ZPM.get(1),
                ItemList.Wireless_Hatch_Energy_UV.get(1),
                ItemList.Wireless_Hatch_Energy_UHV.get(1),
                ItemList.Wireless_Hatch_Energy_UEV.get(1),
                ItemList.Wireless_Hatch_Energy_UIV.get(1),
                ItemList.Wireless_Hatch_Energy_UMV.get(1),
                ItemList.Wireless_Hatch_Energy_UXV.get(1),

                // 4A Wireless Energy Hatch
                CustomItemList.eM_energyWirelessMulti4_EV.get(1),
                CustomItemList.eM_energyWirelessMulti4_IV.get(1),
                CustomItemList.eM_energyWirelessMulti4_LuV.get(1),
                CustomItemList.eM_energyWirelessMulti4_ZPM.get(1),
                CustomItemList.eM_energyWirelessMulti4_UV.get(1),
                CustomItemList.eM_energyWirelessMulti4_UHV.get(1),
                CustomItemList.eM_energyWirelessMulti4_UEV.get(1),
                CustomItemList.eM_energyWirelessMulti4_UIV.get(1),
                CustomItemList.eM_energyWirelessMulti4_UMV.get(1),
                CustomItemList.eM_energyWirelessMulti4_UXV.get(1),

                // 16A Wireless Energy Hatch
                CustomItemList.eM_energyWirelessMulti16_EV.get(1),
                CustomItemList.eM_energyWirelessMulti16_IV.get(1),
                CustomItemList.eM_energyWirelessMulti16_LuV.get(1),
                CustomItemList.eM_energyWirelessMulti16_ZPM.get(1),
                CustomItemList.eM_energyWirelessMulti16_UV.get(1),
                CustomItemList.eM_energyWirelessMulti16_UHV.get(1),
                CustomItemList.eM_energyWirelessMulti16_UEV.get(1),
                CustomItemList.eM_energyWirelessMulti16_UIV.get(1),
                CustomItemList.eM_energyWirelessMulti16_UMV.get(1),
                CustomItemList.eM_energyWirelessMulti16_UXV.get(1),

                // 64A Wireless Energy Hatch
                CustomItemList.eM_energyWirelessMulti64_EV.get(1),
                CustomItemList.eM_energyWirelessMulti64_IV.get(1),
                CustomItemList.eM_energyWirelessMulti64_LuV.get(1),
                CustomItemList.eM_energyWirelessMulti64_ZPM.get(1),
                CustomItemList.eM_energyWirelessMulti64_UV.get(1),
                CustomItemList.eM_energyWirelessMulti64_UHV.get(1),
                CustomItemList.eM_energyWirelessMulti64_UEV.get(1),
                CustomItemList.eM_energyWirelessMulti64_UIV.get(1),
                CustomItemList.eM_energyWirelessMulti64_UMV.get(1),
                CustomItemList.eM_energyWirelessMulti64_UXV.get(1),

                // UXV High Ampere Wireless Energy Hatch
                CustomItemList.eM_energyWirelessTunnel1_UXV.get(1),
                CustomItemList.eM_energyWirelessTunnel2_UXV.get(1),
                CustomItemList.eM_energyWirelessTunnel3_UXV.get(1),
                CustomItemList.eM_energyWirelessTunnel4_UXV.get(1),
                CustomItemList.eM_energyWirelessTunnel5_UXV.get(1),
                CustomItemList.eM_energyWirelessTunnel6_UXV.get(1),
                CustomItemList.eM_energyWirelessTunnel7_UXV.get(1),
                CustomItemList.eM_energyWirelessTunnel8_UXV.get(1),
                CustomItemList.eM_energyWirelessTunnel9_UXV.get(1),

                // Wireless Energy Dynamo
                ItemList.Wireless_Dynamo_Energy_ULV.get(1),
                ItemList.Wireless_Dynamo_Energy_LV.get(1),
                ItemList.Wireless_Dynamo_Energy_MV.get(1),
                ItemList.Wireless_Dynamo_Energy_HV.get(1),
                ItemList.Wireless_Dynamo_Energy_EV.get(1),
                ItemList.Wireless_Dynamo_Energy_IV.get(1),
                ItemList.Wireless_Dynamo_Energy_LuV.get(1),
                ItemList.Wireless_Dynamo_Energy_ZPM.get(1),
                ItemList.Wireless_Dynamo_Energy_UV.get(1),
                ItemList.Wireless_Dynamo_Energy_UHV.get(1),
                ItemList.Wireless_Dynamo_Energy_UEV.get(1),
                ItemList.Wireless_Dynamo_Energy_UIV.get(1),
                ItemList.Wireless_Dynamo_Energy_UMV.get(1),
                ItemList.Wireless_Dynamo_Energy_UXV.get(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Show Chaos of Xtreme Crafting Recipes")
            .eut(0)
            .addTo(addFakeChaosXtremeCraftingRecipes);

        // "Auto Workbench (LV)" - 31091
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31091))
            .itemOutputs(
                // Electro-Magic Tools Solar-Base
                getModItem(ElectroMagicTools.ID, "EMTSolars", 1L, 0),
                getModItem(ElectroMagicTools.ID, "EMTSolars", 1L, 1),
                getModItem(ElectroMagicTools.ID, "EMTSolars", 1L, 2),
                getModItem(ElectroMagicTools.ID, "EMTSolars3", 1L, 0),
                getModItem(ElectroMagicTools.ID, "EMTSolars3", 1L, 7),
                getModItem(ElectroMagicTools.ID, "EMTSolars3", 1L, 14),
                getModItem(ElectroMagicTools.ID, "EMTSolars4", 1L, 5),
                getModItem(ElectroMagicTools.ID, "EMTSolars4", 1L, 12),

                // 地注魔太阳能
                getModItem(ElectroMagicTools.ID, "EMTSolars2", 1L, 2),
                getModItem(ElectroMagicTools.ID, "EMTSolars2", 1L, 3),
                getModItem(ElectroMagicTools.ID, "EMTSolars2", 1L, 4),
                getModItem(ElectroMagicTools.ID, "EMTSolars3", 1L, 4),
                getModItem(ElectroMagicTools.ID, "EMTSolars3", 1L, 11),
                getModItem(ElectroMagicTools.ID, "EMTSolars4", 1L, 2),
                getModItem(ElectroMagicTools.ID, "EMTSolars4", 1L, 9),
                getModItem(ElectroMagicTools.ID, "EMTSolars5", 1L, 0),

                // 水注魔太阳能
                getModItem(ElectroMagicTools.ID, "EMTSolars", 1L, 4),
                getModItem(ElectroMagicTools.ID, "EMTSolars", 1L, 5),
                getModItem(ElectroMagicTools.ID, "EMTSolars3", 1L, 5),
                getModItem(ElectroMagicTools.ID, "EMTSolars3", 1L, 12),
                getModItem(ElectroMagicTools.ID, "EMTSolars4", 1L, 3),
                getModItem(ElectroMagicTools.ID, "EMTSolars4", 1L, 10),
                getModItem(ElectroMagicTools.ID, "EMTSolars5", 1L, 1),

                // 火注魔太阳能
                getModItem(ElectroMagicTools.ID, "EMTSolars", 1L, 12),
                getModItem(ElectroMagicTools.ID, "EMTSolars", 1L, 13),
                getModItem(ElectroMagicTools.ID, "EMTSolars", 1L, 14),
                getModItem(ElectroMagicTools.ID, "EMTSolars3", 1L, 6),
                getModItem(ElectroMagicTools.ID, "EMTSolars3", 1L, 13),
                getModItem(ElectroMagicTools.ID, "EMTSolars4", 1L, 4),
                getModItem(ElectroMagicTools.ID, "EMTSolars4", 1L, 11),
                getModItem(ElectroMagicTools.ID, "EMTSolars5", 1L, 2),

                // 风注魔太阳能
                getModItem(ElectroMagicTools.ID, "EMTSolars2", 1L, 0),
                getModItem(ElectroMagicTools.ID, "EMTSolars2", 1L, 1),
                getModItem(ElectroMagicTools.ID, "EMTSolars3", 1L, 3),
                getModItem(ElectroMagicTools.ID, "EMTSolars3", 1L, 10),
                getModItem(ElectroMagicTools.ID, "EMTSolars4", 1L, 1),
                getModItem(ElectroMagicTools.ID, "EMTSolars4", 1L, 8),
                getModItem(ElectroMagicTools.ID, "EMTSolars4", 1L, 15),

                // 秩序注魔太阳能
                getModItem(ElectroMagicTools.ID, "EMTSolars", 1L, 10),
                getModItem(ElectroMagicTools.ID, "EMTSolars", 1L, 11),
                getModItem(ElectroMagicTools.ID, "EMTSolars3", 1L, 1),
                getModItem(ElectroMagicTools.ID, "EMTSolars3", 1L, 8),
                getModItem(ElectroMagicTools.ID, "EMTSolars3", 1L, 15),
                getModItem(ElectroMagicTools.ID, "EMTSolars4", 1L, 6),
                getModItem(ElectroMagicTools.ID, "EMTSolars4", 1L, 13),

                // 混沌注魔太阳能
                getModItem(ElectroMagicTools.ID, "EMTSolars", 1L, 6),
                getModItem(ElectroMagicTools.ID, "EMTSolars", 1L, 7),
                getModItem(ElectroMagicTools.ID, "EMTSolars", 1L, 8),
                getModItem(ElectroMagicTools.ID, "EMTSolars3", 1L, 2),
                getModItem(ElectroMagicTools.ID, "EMTSolars3", 1L, 9),
                getModItem(ElectroMagicTools.ID, "EMTSolars4", 1L, 0),
                getModItem(ElectroMagicTools.ID, "EMTSolars4", 1L, 7),
                getModItem(ElectroMagicTools.ID, "EMTSolars4", 1L, 14))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Show Chaos of Xtreme Crafting Recipes")
            .eut(0)
            .addTo(addFakeChaosXtremeCraftingRecipes);
    }
}
