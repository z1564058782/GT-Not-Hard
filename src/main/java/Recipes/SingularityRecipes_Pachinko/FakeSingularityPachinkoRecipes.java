package Recipes.SingularityRecipes_Pachinko;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;
import static util.AggregateItemStackArray.addCompressAggregateArray;
import static util.AggregateItemStackArray.addSplitAggregateArray;
import static util.AggregateItemStackArray.checkItemStack;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.OneToManyItemsFrontend_Large;
import util.RecipesFrontend.OneToManyItemsFrontend_Small;

public class FakeSingularityPachinkoRecipes {

    public static int NEI_ItemOutput_Size_Small = 27;
    public static int NEI_ItemOutput_Size_Large = 90;

    public static final RecipeMap<RecipeMapBackend> addFakePachinkoRecipes_GT_Item = RecipeMapBuilder
        .of("Singularity of Pachinko_GT_Item")
        .maxIO(1, NEI_ItemOutput_Size_Large, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakePachinkoRecipes_GT_Machine = RecipeMapBuilder
        .of("Singularity of Pachinko_GT_Machine")
        .maxIO(1, NEI_ItemOutput_Size_Small, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(165))
        .frontend(OneToManyItemsFrontend_Small::new)
        .build();

    public static final RecipeMap<RecipeMapBackend> addFakePachinkoRecipes_Storage = RecipeMapBuilder
        .of("Singularity of Pachinko_Storage")
        .maxIO(1, NEI_ItemOutput_Size_Large, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static void addFakePachinkoRecipes_GT_Item() {
        // Steam Tier
        // "Bronze Hull" - 1
        ItemStack[] Fake_Steam_Tier = addCompressAggregateArray(
            GT_Item.Steam_Tier_Block,
            GT_Item.Steam_Tier_Hatch,
            GT_Item.Steam_Tier_Machine,
            GT_Item.Steam_Tier_Misc);
        ItemStack[][] Fake_Steam_Tier_Split = addSplitAggregateArray(
            checkItemStack(Fake_Steam_Tier),
            NEI_ItemOutput_Size_Large);
        for (ItemStack[] tempItemStacks : Fake_Steam_Tier_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Pachinko Mode")
                .eut(0)
                .addTo(addFakePachinkoRecipes_GT_Item);
        }

        // ULV Tier
        // "ULV Machine Hull" - 10
        ItemStack[] Fake_ULV_Tier = addCompressAggregateArray(
            GT_Item.ULV_Tier_Block,
            GT_Item.ULV_Tier_Cable,
            GT_Item.ULV_Tier_Hatch,
            GT_Item.ULV_Tier_Misc,
            GT_Item.ULV_Tier_Wire);
        ItemStack[][] Fake_ULV_Tier_Split = addSplitAggregateArray(
            checkItemStack(Fake_ULV_Tier),
            NEI_ItemOutput_Size_Large);
        for (ItemStack[] tempItemStacks : Fake_ULV_Tier_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 10))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Pachinko Mode")
                .eut(0)
                .addTo(addFakePachinkoRecipes_GT_Item);
        }

        // LV Tier
        // "LV Machine Hull" - 11
        ItemStack[] Fake_LV_Tier = addCompressAggregateArray(
            GT_Item.LV_Tier_Block,
            GT_Item.LV_Tier_Cable,
            GT_Item.LV_Tier_Hatch,
            GT_Item.LV_Tier_Machine,
            GT_Item.LV_Tier_Misc,
            GT_Item.LV_Tier_Wire);
        ItemStack[][] Fake_LV_Tier_Split = addSplitAggregateArray(
            checkItemStack(Fake_LV_Tier),
            NEI_ItemOutput_Size_Large);
        for (ItemStack[] tempItemStacks : Fake_LV_Tier_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 11))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Pachinko Mode")
                .eut(0)
                .addTo(addFakePachinkoRecipes_GT_Item);
        }

        // MV Tier
        // "MV Machine Hull" - 12
        ItemStack[] Fake_MV_Tier = addCompressAggregateArray(
            GT_Item.MV_Tier_Block,
            GT_Item.MV_Tier_Cable,
            GT_Item.MV_Tier_Hatch,
            GT_Item.MV_Tier_Machine,
            GT_Item.MV_Tier_Misc,
            GT_Item.MV_Tier_Wire);
        ItemStack[][] Fake_MV_Tier_Split = addSplitAggregateArray(
            checkItemStack(Fake_MV_Tier),
            NEI_ItemOutput_Size_Large);
        for (ItemStack[] tempItemStacks : Fake_MV_Tier_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Pachinko Mode")
                .eut(0)
                .addTo(addFakePachinkoRecipes_GT_Item);
        }

        // HV Tier
        // "HV Machine Hull" - 13
        ItemStack[] Fake_HV_Tier = addCompressAggregateArray(
            GT_Item.HV_Tier_Block,
            GT_Item.HV_Tier_Cable,
            GT_Item.HV_Tier_Hatch,
            GT_Item.HV_Tier_Machine,
            GT_Item.HV_Tier_Misc,
            GT_Item.HV_Tier_Wire);
        ItemStack[][] Fake_HV_Tier_Split = addSplitAggregateArray(
            checkItemStack(Fake_HV_Tier),
            NEI_ItemOutput_Size_Large);
        for (ItemStack[] tempItemStacks : Fake_HV_Tier_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 13))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Pachinko Mode")
                .eut(0)
                .addTo(addFakePachinkoRecipes_GT_Item);
        }

        // EV Tier
        // "EV Machine Hull" - 14
        ItemStack[] Fake_EV_Tier = addCompressAggregateArray(
            GT_Item.EV_Tier_Block,
            GT_Item.EV_Tier_Cable,
            GT_Item.EV_Tier_Hatch,
            GT_Item.EV_Tier_Machine,
            GT_Item.EV_Tier_Misc,
            GT_Item.EV_Tier_Wire);
        ItemStack[][] Fake_EV_Tier_Split = addSplitAggregateArray(
            checkItemStack(Fake_EV_Tier),
            NEI_ItemOutput_Size_Large);
        for (ItemStack[] tempItemStacks : Fake_EV_Tier_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 14))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Pachinko Mode")
                .eut(0)
                .addTo(addFakePachinkoRecipes_GT_Item);
        }

        // IV Tier
        // "IV Machine Hull" - 15
        ItemStack[] Fake_IV_Tier = addCompressAggregateArray(
            GT_Item.IV_Tier_Block,
            GT_Item.IV_Tier_Cable,
            GT_Item.IV_Tier_Hatch,
            GT_Item.IV_Tier_Machine,
            GT_Item.IV_Tier_Misc,
            GT_Item.IV_Tier_Wire);
        ItemStack[][] Fake_IV_Tier_Split = addSplitAggregateArray(
            checkItemStack(Fake_IV_Tier),
            NEI_ItemOutput_Size_Large);
        for (ItemStack[] tempItemStacks : Fake_IV_Tier_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Pachinko Mode")
                .eut(0)
                .addTo(addFakePachinkoRecipes_GT_Item);
        }

        // LuV Tier
        // "LuV Machine Hull" - 16
        ItemStack[] Fake_LuV_Tier = addCompressAggregateArray(
            GT_Item.LuV_Tier_Block,
            GT_Item.LuV_Tier_Cable,
            GT_Item.LuV_Tier_Hatch,
            GT_Item.LuV_Tier_Machine,
            GT_Item.LuV_Tier_Misc,
            GT_Item.LuV_Tier_Wire);
        ItemStack[][] Fake_LuV_Tier_Split = addSplitAggregateArray(
            checkItemStack(Fake_LuV_Tier),
            NEI_ItemOutput_Size_Large);
        for (ItemStack[] tempItemStacks : Fake_LuV_Tier_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 16))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Pachinko Mode")
                .eut(0)
                .addTo(addFakePachinkoRecipes_GT_Item);
        }

        // ZPM Tier
        // "ZPM Machine Hull" - 17
        ItemStack[] Fake_ZPM_Tier = addCompressAggregateArray(
            GT_Item.ZPM_Tier_Block,
            GT_Item.ZPM_Tier_Cable,
            GT_Item.ZPM_Tier_Hatch,
            GT_Item.ZPM_Tier_Machine,
            GT_Item.ZPM_Tier_Misc,
            GT_Item.ZPM_Tier_Wire);
        ItemStack[][] Fake_ZPM_Tier_Split = addSplitAggregateArray(
            checkItemStack(Fake_ZPM_Tier),
            NEI_ItemOutput_Size_Large);
        for (ItemStack[] tempItemStacks : Fake_ZPM_Tier_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 17))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Pachinko Mode")
                .eut(0)
                .addTo(addFakePachinkoRecipes_GT_Item);
        }

        // UV Tier
        // "UV Machine Hull" - 18
        ItemStack[] Fake_UV_Tier = addCompressAggregateArray(
            GT_Item.UV_Tier_Block,
            GT_Item.UV_Tier_Cable,
            GT_Item.UV_Tier_Hatch,
            GT_Item.UV_Tier_Machine,
            GT_Item.UV_Tier_Misc,
            GT_Item.UV_Tier_Wire);
        ItemStack[][] Fake_UV_Tier_Split = addSplitAggregateArray(
            checkItemStack(Fake_UV_Tier),
            NEI_ItemOutput_Size_Large);
        for (ItemStack[] tempItemStacks : Fake_UV_Tier_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 18))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Pachinko Mode")
                .eut(0)
                .addTo(addFakePachinkoRecipes_GT_Item);
        }

        // UHV Tier
        // "UHV Machine Hull" - 19
        ItemStack[] Fake_UHV_Tier = addCompressAggregateArray(
            GT_Item.UHV_Tier_Block,
            GT_Item.UHV_Tier_Cable,
            GT_Item.UHV_Tier_Hatch,
            GT_Item.UHV_Tier_Machine,
            GT_Item.UHV_Tier_Misc,
            GT_Item.UHV_Tier_Wire);
        ItemStack[][] Fake_UHV_Tier_Split = addSplitAggregateArray(
            checkItemStack(Fake_UHV_Tier),
            NEI_ItemOutput_Size_Large);
        for (ItemStack[] tempItemStacks : Fake_UHV_Tier_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 19))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Pachinko Mode")
                .eut(0)
                .addTo(addFakePachinkoRecipes_GT_Item);
        }

        // UEV Tier
        // "UEV Machine Hull" - 11230
        ItemStack[] Fake_UEV_Tier = addCompressAggregateArray(
            GT_Item.UEV_Tier_Block,
            GT_Item.UEV_Tier_Cable,
            GT_Item.UEV_Tier_Hatch,
            GT_Item.UEV_Tier_Machine,
            GT_Item.UEV_Tier_Misc,
            GT_Item.UEV_Tier_Wire);
        ItemStack[][] Fake_UEV_Tier_Split = addSplitAggregateArray(
            checkItemStack(Fake_UEV_Tier),
            NEI_ItemOutput_Size_Large);
        for (ItemStack[] tempItemStacks : Fake_UEV_Tier_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 11230))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Pachinko Mode")
                .eut(0)
                .addTo(addFakePachinkoRecipes_GT_Item);
        }

        // UIV Tier
        // "UIV Machine Hull" - 11231
        ItemStack[] Fake_UIV_Tier = addCompressAggregateArray(
            GT_Item.UIV_Tier_Block,
            GT_Item.UIV_Tier_Cable,
            GT_Item.UIV_Tier_Hatch,
            GT_Item.UIV_Tier_Machine,
            GT_Item.UIV_Tier_Misc,
            GT_Item.UIV_Tier_Wire);
        ItemStack[][] Fake_UIV_Tier_Split = addSplitAggregateArray(
            checkItemStack(Fake_UIV_Tier),
            NEI_ItemOutput_Size_Large);
        for (ItemStack[] tempItemStacks : Fake_UIV_Tier_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 11231))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Pachinko Mode")
                .eut(0)
                .addTo(addFakePachinkoRecipes_GT_Item);
        }

        // UMV Tier
        // "UMV Machine Hull" - 11232
        ItemStack[] Fake_UMV_Tier = addCompressAggregateArray(
            GT_Item.UMV_Tier_Block,
            GT_Item.UMV_Tier_Cable,
            GT_Item.UMV_Tier_Hatch,
            GT_Item.UMV_Tier_Machine,
            GT_Item.UMV_Tier_Misc,
            GT_Item.UMV_Tier_Wire);
        ItemStack[][] Fake_UMV_Tier_Split = addSplitAggregateArray(
            checkItemStack(Fake_UMV_Tier),
            NEI_ItemOutput_Size_Large);
        for (ItemStack[] tempItemStacks : Fake_UMV_Tier_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 11232))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Pachinko Mode")
                .eut(0)
                .addTo(addFakePachinkoRecipes_GT_Item);
        }

        // UXV Tier
        // "UXV Machine Hull" - 11233
        ItemStack[] Fake_UXV_Tier = addCompressAggregateArray(
            GT_Item.UXV_Tier_Block,
            GT_Item.UXV_Tier_Hatch,
            GT_Item.UXV_Tier_Machine,
            GT_Item.UXV_Tier_Misc,
            GT_Item.UXV_Tier_Wire);
        ItemStack[][] Fake_UXV_Tier_Split = addSplitAggregateArray(
            checkItemStack(Fake_UXV_Tier),
            NEI_ItemOutput_Size_Large);
        for (ItemStack[] tempItemStacks : Fake_UXV_Tier_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 11233))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Pachinko Mode")
                .eut(0)
                .addTo(addFakePachinkoRecipes_GT_Item);
        }

        // MAX Tier
        // "1x SpaceTime Wire" - 2606
        ItemStack[] Fake_MAX_Tier = addCompressAggregateArray(
            GT_Item.MAX_Tier_Block,
            GT_Item.MAX_Tier_Hatch,
            GT_Item.MAX_Tier_Machine,
            GT_Item.MAX_Tier_Misc,
            GT_Item.MAX_Tier_Wire);
        ItemStack[][] Fake_MAX_Tier_Split = addSplitAggregateArray(
            checkItemStack(Fake_MAX_Tier),
            NEI_ItemOutput_Size_Large);
        for (ItemStack[] tempItemStacks : Fake_MAX_Tier_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 2606))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Pachinko Mode")
                .eut(0)
                .addTo(addFakePachinkoRecipes_GT_Item);
        }
    }

    public static void addFakePachinkoRecipes_GT_Machine() {
        Map<ItemStack, ItemStack[]> PachinkoRecipes_GT_Machine = new HashMap<>();

        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 140), GT_Machine.Bricked_Blast_Furnace);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 141), GT_Machine.Fluid_Drilling_RigII);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 142), GT_Machine.Fluid_Drilling_RigIII);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 143), GT_Machine.Concrete_Backfiller);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 144), GT_Machine.Advanced_Concrete_Backfiller);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 148), GT_Machine.Infinite_Fluid_Drilling_Rig);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 149), GT_Machine.Fluid_Drilling_RigIV);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 356), GT_Machine.PCB_Factory);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 357), GT_Machine.Nano_Forge);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 358), GT_Machine.Magnetic_Flux_Exhibitor);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 360), GT_Machine.TurboCan_Pro);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 366), GT_Machine.Fluid_Shaper);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 367), GT_Machine.Solar_Factory);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 686), GT_Machine.Industrial_Precision_Lathe);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 687), GT_Machine.Industrial_Autoclave);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 749), GT_Machine.Nuclear_Salt_Processing_Plant);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 751), GT_Machine.Thorium_Reactor_LFTR);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 790), GT_Machine.Industrial_Centrifuge);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 791), GT_Machine.Industrial_Coke_Oven);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 792), GT_Machine.Industrial_Material_Press);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 796), GT_Machine.Industrial_Electrolyzer);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 797), GT_Machine.Industrial_Maceration_Stack);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 798), GT_Machine.Industrial_Wire_Factory);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 799), GT_Machine.Matter_Fabrication_CPU);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 810), GT_Machine.Alloy_Blast_Smelter);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 811), GT_Machine.Industrial_Mixing_Machine);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 812), GT_Machine.Power_Station_Control_Node);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 828), GT_Machine.COMET_Compact_Cyclotron);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 829), GT_Machine.Zhuhai_Fishing_Port);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 835), GT_Machine.Reactor_Fuel_Processing_Plant);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 836), GT_Machine.Tree_Growth_Simulator);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 840), GT_Machine.Large_Sifter_Control_Block);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 849), GT_Machine.Large_Thermal_Refinery);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 850), GT_Machine.Ore_Washing_Plant);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 859), GT_Machine.Industrial_Extrusion_Machine);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 862), GT_Machine.High_Current_Industrial_Arc_Furnace);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 863), GT_Machine.Solar_Tower);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 865), GT_Machine.XL_Turbo_Steam_Turbine);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 866), GT_Machine.XL_Turbo_HP_Steam_Turbine);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 875), GT_Machine.Thermal_Boiler);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 876), GT_Machine.Large_Scale_Auto_Assembler);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 910), GT_Machine.Cryogenic_Freezer);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 942), GT_Machine.Amazon_Warehousing_Depot);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 963), GT_Machine.Volcanus);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 964), GT_Machine.Density);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 965), GT_Machine.FusionTech_MKIV);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 975), GT_Machine.FusionTech_MKV);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 992), GT_Machine.Industrial_Cutting_Factory);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 995), GT_Machine.Utupu_Tanuri);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 996), GT_Machine.Rocketdyne_F1A_Engine);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 997), GT_Machine.Algae_Farm);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 998), GT_Machine.ExxonMobil_Chemical_Plant);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1000), GT_Machine.Electric_Blast_Furnace);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1001), GT_Machine.Implosion_Compressor);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1002), GT_Machine.Vacuum_Freezer);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1003), GT_Machine.Multi_Smelter);
        PachinkoRecipes_GT_Machine.put(
            getModItem(GregTech.ID, "gt.blockmachines", 1L, 1004),
            GT_Machine.Dimensionally_Transcendent_Plasma_Forge);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1006), GT_Machine.Transcendent_Plasma_Mixer);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1020), GT_Machine.Large_Bronze_Boiler);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1021), GT_Machine.Large_Steel_Boiler);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1022), GT_Machine.Large_Titanium_Boiler);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1023), GT_Machine.Large_Tungstensteel_Boiler);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1126), GT_Machine.Distillation_Tower);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1131), GT_Machine.Large_Steam_Turbine);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1132), GT_Machine.Integrated_Ore_Factory);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1151), GT_Machine.Large_Gas_Turbine);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1152), GT_Machine.Large_HP_Steam_Turbine);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1153), GT_Machine.Large_Plasma_Turbine);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1154), GT_Machine.Large_Heat_Exchanger);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1157), GT_Machine.Fluid_Drilling_Rig);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1158), GT_Machine.Ore_Drilling_Plant);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1159), GT_Machine.Pyrolyse_Oven);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1160), GT_Machine.Oil_Cracking_Unit);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1169), GT_Machine.Large_Chemical_Reactor);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1170), GT_Machine.Assembly_Line);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1171), GT_Machine.Large_Combustion_Engine);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1172), GT_Machine.Cleanroom);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1177), GT_Machine.Ore_Drilling_Plant_II);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1178), GT_Machine.Ore_Drilling_Plant_III);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1179), GT_Machine.Ore_Drilling_Plant_IV);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1193), GT_Machine.Fusion_Control_Computer_MarkI);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1194), GT_Machine.Fusion_Control_Computer_MarkII);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 1195), GT_Machine.Fusion_Control_Computer_MarkIII);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 2105), GT_Machine.Extreme_Combustion_Engine);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 2730), GT_Machine.Large_Fluid_Extractor);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 2731), GT_Machine.Matter_Manipulator_Quantum_Uplink);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 3004), GT_Machine.Hyper_Intensity_Laser_Engraver);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 3005), GT_Machine.Large_Electric_Compressor);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 3006), GT_Machine.Hot_Isostatic_Pressurization_Unit);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 3007), GT_Machine.Neutronium_Compressor);
        PachinkoRecipes_GT_Machine.put(
            getModItem(GregTech.ID, "gt.blockmachines", 1L, 3008),
            GT_Machine.Pseudostable_Black_Hole_Containment_Field);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 3010), GT_Machine.Dissection_Apparatus);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 3011), GT_Machine.Big_Barrel_Brewery);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 5001), GT_Machine.Draconic_Evolution_Fusion_Crafter);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 9400), GT_Machine.Drone_Centre);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 10500), GT_Machine.Digester);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 10501), GT_Machine.Dissolution_Tank);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 10505), GT_Machine.Linear_Accelerator);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 10506), GT_Machine.Source_Chamber);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 10507), GT_Machine.Synchrotron);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 10508), GT_Machine.Target_Chamber);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12020), GT_Machine.Electric_Air_Filter_T1);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12021), GT_Machine.Electric_Air_Filter_T2);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12022), GT_Machine.Electric_Air_Filter_T3);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12697), GT_Machine.Manual_Transformer);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12698), GT_Machine.Windmill);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12712), GT_Machine.Bacterial_Vat);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12729), GT_Machine.Deep_Earth_Heating_Pump);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12730), GT_Machine.Mega_Electric_Blast_Furnace);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12731), GT_Machine.Mega_Vacuum_Freezer);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12732), GT_Machine.Large_Naquadah_Reactor);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12733), GT_Machine.Thorium_High_Temperature_Reactor);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12734), GT_Machine.Electric_Implosion_Compressor);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12735), GT_Machine.Circuit_Assembly_Line);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12738), GT_Machine.Mega_Distillation_Tower);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12739), GT_Machine.Void_Miner_III);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12740), GT_Machine.Void_Miner_II);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12741), GT_Machine.Void_Miner_I);
        PachinkoRecipes_GT_Machine.put(
            getModItem(GregTech.ID, "gt.blockmachines", 1L, 12791),
            GT_Machine.High_Temperature_Gas_Cooled_Reactor);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 12792), GT_Machine.Extreme_Industrial_Greenhouse);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 13001), GT_Machine.Research_Completer);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 13101), GT_Machine.Solid_Oxide_Fuel_Cell_MkI);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 13102), GT_Machine.Solid_Oxide_Fuel_Cell_MkII);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 13104), GT_Machine.TFFT);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 13106), GT_Machine.Lapotronic_Supercapacitor);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 13115), GT_Machine.Miniature_Wormhole_Generator);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 13366), GT_Machine.Mega_Chemical_Reactor);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 13367), GT_Machine.Mega_Oil_Cracker);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 13532), GT_Machine.Advanced_Assembly_Line);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 14001), GT_Machine.Dyson_Swarm_Ground_Unit);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 14002), GT_Machine.Planetary_Gas_Siphon);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 14003), GT_Machine.Space_Elevator);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 14101), GT_Machine.Large_Molecular_Assembler);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 14201), GT_Machine.Extreme_Entity_Crusher);
        PachinkoRecipes_GT_Machine.put(
            getModItem(GregTech.ID, "gt.blockmachines", 1L, 14202),
            GT_Machine.Industrial_Apicultural_Acclimatiser_and_Drone_Domestication_Station);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15300), GT_Machine.Active_Transformer);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15310), GT_Machine.Weighted_Network_Switch_With_QoS);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15311), GT_Machine.Quantum_Computer);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15312), GT_Machine.Microwave_Grinder);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15313), GT_Machine.Data_Bank);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15314), GT_Machine.Tesla_Tower);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15315), GT_Machine.Static_Network_Switch_With_QoS);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15331), GT_Machine.Research_Station);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15350), GT_Machine.Energy_Infuser);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15750), GT_Machine.Entropic_Processor);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15751), GT_Machine.Decay_Warehouse);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 16999), GT_Machine.Naquadah_Fuel_Refinery);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 17000), GT_Machine.Hydro_Dam);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 17003), GT_Machine.Hydro_Pump);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 17019), GT_Machine.Hydro_Turbine);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31021), GT_Machine.Dangote_Distillus);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31023), GT_Machine.Zyngen);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31026), GT_Machine.Large_Semifluid_Burner);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31027), GT_Machine.IsaMill_Grinding_Machine);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31028), GT_Machine.Flotation_Cell_Regulator);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31035), GT_Machine.Sparge_Tower_Controller);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31041), GT_Machine.Steam_Grinder);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31050), GT_Machine.Elemental_Duplicator);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31065), GT_Machine.Boldarnator);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31069), GT_Machine.Industrial_3D_Copying_Machine);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31072), GT_Machine.Molecular_Transformer);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31073), GT_Machine.XL_Turbo_Gas_Turbine);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31074), GT_Machine.XL_Turbo_Plasma_Turbine);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31075), GT_Machine.Industrial_Sledgehammer);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31076), GT_Machine.XL_Turbo_SC_Steam_Turbine);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31077), GT_Machine.Thermic_Heating_Device);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31078), GT_Machine.Steam_Squasher);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31079), GT_Machine.Whakawhiti_Wera_XL);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31080), GT_Machine.Steam_Separator);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31082), GT_Machine.Steam_Purifier);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31083), GT_Machine.Steam_Presser);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31084), GT_Machine.Steam_Blender);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31085), GT_Machine.Water_Pump);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31086), GT_Machine.Steam_Fuser);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31150), GT_Machine.Mega_Alloy_Blast_Smelter);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 31151), GT_Machine.Quantum_Force_Transformer);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32001), GT_Machine.Universal_Chemical_Fuel_Engine);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32013), GT_Machine.Neutron_Activator);
        PachinkoRecipes_GT_Machine.put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32014), GT_Machine.YOTTank);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32016), GT_Machine.Large_Supercritical_Steam_Turbine);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32017), GT_Machine.Extreme_Heat_Exchanger);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32018), GT_Machine.Precise_Auto_Assembler_MT3662);
        PachinkoRecipes_GT_Machine.put(
            getModItem(GregTech.ID, "gt.blockmachines", 1L, 32019),
            GT_Machine.Compact_Fusion_Computer_MKI_Prototype);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32020), GT_Machine.Compact_Fusion_Computer_MKII);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32021), GT_Machine.Compact_Fusion_Computer_MKIII);
        PachinkoRecipes_GT_Machine.put(
            getModItem(GregTech.ID, "gt.blockmachines", 1L, 32022),
            GT_Machine.Compact_Fusion_Computer_MKIV_Prototype);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32023), GT_Machine.Compact_Fusion_Computer_MKV);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32024), GT_Machine.Large_Essentia_Smeltery);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32025), GT_Machine.Coolant_Tower);
        PachinkoRecipes_GT_Machine
            .put(getModItem(GregTech.ID, "gt.blockmachines", 1L, 32026), GT_Machine.Component_Assembly_Line);
        PachinkoRecipes_GT_Machine.put(
            getModItem(GregTech.ID, "gt.blockmachines", 1L, 32027),
            GT_Machine.Semi_Stable_Antimatter_Stabilization_Sequencer);
        PachinkoRecipes_GT_Machine.put(
            getModItem(GregTech.ID, "gt.blockmachines", 1L, 32028),
            GT_Machine.Shielded_Lagrangian_Annihilation_Matrix);

        for (Map.Entry<ItemStack, ItemStack[]> Temp : PachinkoRecipes_GT_Machine.entrySet()) {
            GTValues.RA.stdBuilder()
                .itemInputs(Temp.getKey())
                .itemOutputs(Temp.getValue())
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Pachinko Mode")
                .eut(0)
                .addTo(addFakePachinkoRecipes_GT_Machine);
        }

        // "Water Purification Plant" - 9402
        ItemStack[][] Water_Purification_Plant_Split = addSplitAggregateArray(
            GT_Machine.Water_Purification_Plant,
            NEI_ItemOutput_Size_Small);
        for (ItemStack[] tempItemStacks : Water_Purification_Plant_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 9402))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Pachinko Mode")
                .eut(0)
                .addTo(addFakePachinkoRecipes_GT_Machine);
        }

        // "Eye of Harmony" - 15410
        ItemStack[][] Eye_of_Harmony_Split = addSplitAggregateArray(
            GT_Machine.Eye_of_Harmony,
            NEI_ItemOutput_Size_Small);
        for (ItemStack[] tempItemStacks : Eye_of_Harmony_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15410))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Pachinko Mode")
                .eut(0)
                .addTo(addFakePachinkoRecipes_GT_Machine);
        }

        // "Forge of the Gods" - 15411
        ItemStack[][] Forge_of_the_Gods_Split = addSplitAggregateArray(
            GT_Machine.Forge_of_the_Gods,
            NEI_ItemOutput_Size_Small);
        for (ItemStack[] tempItemStacks : Forge_of_the_Gods_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 15411))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Pachinko Mode")
                .eut(0)
                .addTo(addFakePachinkoRecipes_GT_Machine);
        }
    }

    public static void addFakePachinkoRecipes_Storage() {
        // Item Storage
        // "Super Chest I" - 135
        ItemStack[][] Fake_Item_Storage_Split = addSplitAggregateArray(Storage.Item_Storage, NEI_ItemOutput_Size_Large);
        for (ItemStack[] tempItemStacks : Fake_Item_Storage_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 135))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Pachinko Mode")
                .eut(0)
                .addTo(addFakePachinkoRecipes_Storage);
        }

        // Fluid Storage
        // "Ultra Low Voltage Fluid Tank" - 817
        ItemStack[][] Fake_Fluid_Storage_Split = addSplitAggregateArray(
            Storage.Fluid_Storage,
            NEI_ItemOutput_Size_Large);
        for (ItemStack[] tempItemStacks : Fake_Fluid_Storage_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 817))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Pachinko Mode")
                .eut(0)
                .addTo(addFakePachinkoRecipes_Storage);
        }

        // AppliedEnergistics2 Storage
        // "Super Tank I" - 130
        ItemStack[][] Fake_AppliedEnergistics2_Storage_Split = addSplitAggregateArray(
            Storage.AppliedEnergistics2_Storage,
            NEI_ItemOutput_Size_Large);
        for (ItemStack[] tempItemStacks : Fake_AppliedEnergistics2_Storage_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(GregTech.ID, "gt.blockmachines", 1L, 130))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Pachinko Mode")
                .eut(0)
                .addTo(addFakePachinkoRecipes_Storage);
        }
    }
}
