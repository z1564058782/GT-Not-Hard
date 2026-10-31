package EnumList.EnumListCheck;

import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;
import static util.AggregateItemStackArray.addSplitAggregateArray;
import static util.AggregateItemStackArray.checkItemStack;

import net.minecraft.item.ItemStack;

import EnumList.EnumItemList.EnumGTList.BatteryList;
import EnumList.EnumItemList.EnumGTList.CableList;
import EnumList.EnumItemList.EnumGTList.CircuitList;
import EnumList.EnumItemList.EnumGTList.GTBlockList;
import EnumList.EnumItemList.EnumGTList.GTItemList;
import EnumList.EnumItemList.EnumGTList.GTPPList;
import EnumList.EnumItemList.EnumGTList.HatchList;
import EnumList.EnumItemList.EnumGTList.MachineList;
import EnumList.EnumItemList.EnumGTList.MultiMachineCasingList;
import EnumList.EnumItemList.EnumGTList.MultiMachineControllerList;
import EnumList.EnumItemList.EnumGTList.PipeList;
import EnumList.EnumItemList.EnumGTList.ToolList;
import EnumList.EnumItemList.EnumGTList.WireList;
import EnumList.EnumItemList.EnumMagicList.EssenceList;
import EnumList.EnumItemList.EnumMaterialList.BlockList;
import EnumList.EnumItemList.EnumMaterialList.BoltList;
import EnumList.EnumItemList.EnumMaterialList.CasingList;
import EnumList.EnumItemList.EnumMaterialList.DensePlateList;
import EnumList.EnumItemList.EnumMaterialList.DoublePlateList;
import EnumList.EnumItemList.EnumMaterialList.DrillTipList;
import EnumList.EnumItemList.EnumMaterialList.FineWireList;
import EnumList.EnumItemList.EnumMaterialList.FoilList;
import EnumList.EnumItemList.EnumMaterialList.FrameBoxList;
import EnumList.EnumItemList.EnumMaterialList.GearList;
import EnumList.EnumItemList.EnumMaterialList.LongRodList;
import EnumList.EnumItemList.EnumMaterialList.MiscPlateList;
import EnumList.EnumItemList.EnumMaterialList.PlateList;
import EnumList.EnumItemList.EnumMaterialList.QuadruplePlateList;
import EnumList.EnumItemList.EnumMaterialList.QuintuplePlateList;
import EnumList.EnumItemList.EnumMaterialList.RingList;
import EnumList.EnumItemList.EnumMaterialList.RodList;
import EnumList.EnumItemList.EnumMaterialList.RotorList;
import EnumList.EnumItemList.EnumMaterialList.RoundList;
import EnumList.EnumItemList.EnumMaterialList.ScrewList;
import EnumList.EnumItemList.EnumMaterialList.SmallGearList;
import EnumList.EnumItemList.EnumMaterialList.SmallSpringList;
import EnumList.EnumItemList.EnumMaterialList.SpringList;
import EnumList.EnumItemList.EnumMaterialList.SuperdensePlateList;
import EnumList.EnumItemList.EnumMaterialList.TriplePlateList;
import EnumList.EnumItemList.EnumMaterialList.TurbineBladeList;
import EnumList.EnumItemList.EnumMiscList.CoinList;
import EnumList.EnumItemList.EnumMiscList.SingularityList;
import EnumList.EnumItemList.EnumModList.AE2FluidCraftingList;
import EnumList.EnumItemList.EnumModList.AmunRaList;
import EnumList.EnumItemList.EnumModList.Appliedenergistics2List;
import EnumList.EnumItemList.EnumModList.AutomagyList;
import EnumList.EnumItemList.EnumModList.AvaritiaList;
import EnumList.EnumItemList.EnumModList.BackpackList;
import EnumList.EnumItemList.EnumModList.BloodMagicList;
import EnumList.EnumItemList.EnumModList.BotaniaList;
import EnumList.EnumItemList.EnumModList.BuildCraftList;
import EnumList.EnumItemList.EnumModList.DraconicEvolutionList;
import EnumList.EnumItemList.EnumModList.ElectroMagicToolsList;
import EnumList.EnumItemList.EnumModList.EnderIOList;
import EnumList.EnumItemList.EnumModList.EnderStorageList;
import EnumList.EnumItemList.EnumModList.EtFuturumRequiemList;
import EnumList.EnumItemList.EnumModList.ExtraBeesList;
import EnumList.EnumItemList.EnumModList.ExtraTreesList;
import EnumList.EnumItemList.EnumModList.ExtraUtilitieList;
import EnumList.EnumItemList.EnumModList.ForestryList;
import EnumList.EnumItemList.EnumModList.GTNHIntergalacticList;
import EnumList.EnumItemList.EnumModList.GTNHLanthanidesList;
import EnumList.EnumItemList.EnumModList.GadomancyList;
import EnumList.EnumItemList.EnumModList.GalacticraftList;
import EnumList.EnumItemList.EnumModList.GalaxySpaceList;
import EnumList.EnumItemList.EnumModList.GoodGeneratorList;
import EnumList.EnumItemList.EnumModList.IronChestTankList;
import EnumList.EnumItemList.EnumModList.KekzTechList;
import EnumList.EnumItemList.EnumModList.KubaTechList;
import EnumList.EnumItemList.EnumModList.MagicBeesList;
import EnumList.EnumItemList.EnumModList.MinecraftList;
import EnumList.EnumItemList.EnumModList.NewHorizonsCoreModList;
import EnumList.EnumItemList.EnumModList.OpenBlocksList;
import EnumList.EnumItemList.EnumModList.OpenComputersList;
import EnumList.EnumItemList.EnumModList.ProjectList;
import EnumList.EnumItemList.EnumModList.RailcraftList;
import EnumList.EnumItemList.EnumModList.SolarPanelsList;
import EnumList.EnumItemList.EnumModList.TaintedMagicList;
import EnumList.EnumItemList.EnumModList.TecTechList;
import EnumList.EnumItemList.EnumModList.ThaumcraftList;
import EnumList.EnumItemList.EnumModList.ThaumicBasesList;
import EnumList.EnumItemList.EnumModList.ThaumicHorizonsList;
import EnumList.EnumItemList.EnumModList.ThaumicTinkererList;
import EnumList.EnumItemList.EnumModList.TwilightForestList;
import EnumList.EnumItemList.EnumModList.WitcheryList;
import EnumList.EnumItemList.EnumOreProductList.CrushedOreList;
import EnumList.EnumItemList.EnumOreProductList.DustList;
import EnumList.EnumItemList.EnumOreProductList.GemList;
import EnumList.EnumItemList.EnumOreProductList.IngotList;
import EnumList.EnumItemList.EnumOreProductList.OreList;
import EnumList.EnumItemList.EnumOreProductList.RawOreList;
import EnumList.EnumItemList.EnumTinkerConstructList.TinkerConstructList;
import EnumList.EnumItemList.EnumTinkerConstructList.TinkersGregworksArrowHeadList;
import EnumList.EnumItemList.EnumTinkerConstructList.TinkersGregworksAxeHeadList;
import EnumList.EnumItemList.EnumTinkerConstructList.TinkersGregworksBindingList;
import EnumList.EnumItemList.EnumTinkerConstructList.TinkersGregworksBowList;
import EnumList.EnumItemList.EnumTinkerConstructList.TinkersGregworksChiselHeadList;
import EnumList.EnumItemList.EnumTinkerConstructList.TinkersGregworksCrossbarList;
import EnumList.EnumItemList.EnumTinkerConstructList.TinkersGregworksCrossbowList;
import EnumList.EnumItemList.EnumTinkerConstructList.TinkersGregworksGuardList;
import EnumList.EnumItemList.EnumTinkerConstructList.TinkersGregworksKnifeList;
import EnumList.EnumItemList.EnumTinkerConstructList.TinkersGregworksLargePlateList;
import EnumList.EnumItemList.EnumTinkerConstructList.TinkersGregworksPanList;
import EnumList.EnumItemList.EnumTinkerConstructList.TinkersGregworksPickaxeHeadList;
import EnumList.EnumItemList.EnumTinkerConstructList.TinkersGregworksRodList;
import EnumList.EnumItemList.EnumTinkerConstructList.TinkersGregworksScytheHeadList;
import EnumList.EnumItemList.EnumTinkerConstructList.TinkersGregworksShardList;
import EnumList.EnumItemList.EnumTinkerConstructList.TinkersGregworksShovelHeadList;
import EnumList.EnumItemList.EnumTinkerConstructList.TinkersGregworksShurikenList;
import EnumList.EnumItemList.EnumTinkerConstructList.TinkersGregworksSignHeadList;
import EnumList.EnumItemList.EnumTinkerConstructList.TinkersGregworksSwordList;
import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.OneToManyItemsFrontend_Huge;

public class EnumItemListCheck {

    public static int NEI_ItemOutput_Size = 117;

    public static final RecipeMap<RecipeMapBackend> addItemCheckRecipes = RecipeMapBuilder.of("Item Check")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(315))
        .frontend(OneToManyItemsFrontend_Huge::new)
        .build();

    public static void addEnumGTListCheckRecipes() {
        // BatteryList
        ItemStack[] Battery_List_Checked = checkItemStack(BatteryList.Battery_List);
        ItemStack[][] Battery_List_Split = addSplitAggregateArray(Battery_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Battery_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Battery List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // CableList
        ItemStack[] Cable_List_Checked = checkItemStack(CableList.Cable_List);
        ItemStack[][] Cable_List_Split = addSplitAggregateArray(Cable_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Cable_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Cable List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // CircuitList
        ItemStack[] Circuit_List_Checked = checkItemStack(CircuitList.Circuit_List);
        ItemStack[][] Circuit_List_Split = addSplitAggregateArray(Circuit_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Circuit_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Circuit List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // GTBlockList
        ItemStack[] GTBlock_List_Checked = checkItemStack(GTBlockList.GTBlock_List);
        ItemStack[][] GTBlock_List_Split = addSplitAggregateArray(GTBlock_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : GTBlock_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug GT Block List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // GTItemList
        ItemStack[] GTItem_List_Checked = checkItemStack(GTItemList.GTItem_List);
        ItemStack[][] GTItem_List_Split = addSplitAggregateArray(GTItem_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : GTItem_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug GT Item List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // GTPPList
        ItemStack[] GTPP_List_Checked = checkItemStack(GTPPList.GTPP_List);
        ItemStack[][] GTPP_List_Split = addSplitAggregateArray(GTPP_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : GTPP_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug GTPP List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // HatchList
        ItemStack[] Hatch_List_Checked = checkItemStack(HatchList.Hatch_List);
        ItemStack[][] Hatch_List_Split = addSplitAggregateArray(Hatch_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Hatch_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Hatch List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // MachineList
        ItemStack[] Machine_List_Checked = checkItemStack(MachineList.Machine_List);
        ItemStack[][] Machine_List_Split = addSplitAggregateArray(Machine_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Machine_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Machine List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // MultiMachineCasingList
        ItemStack[] MultiMachineCasing_List_Checked = checkItemStack(MultiMachineCasingList.MultiMachineCasing_List);
        ItemStack[][] MultiMachineCasing_List_Split = addSplitAggregateArray(
            MultiMachineCasing_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : MultiMachineCasing_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Multi Machine Casing List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // MultiMachineControllerList
        ItemStack[] MultiMachineController_List_Checked = checkItemStack(
            MultiMachineControllerList.MultiMachineController_List);
        ItemStack[][] MultiMachineController_List_Split = addSplitAggregateArray(
            MultiMachineController_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : MultiMachineController_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Multi Machine Controller List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // PipeList
        ItemStack[] Pipe_List_Checked = checkItemStack(PipeList.Pipe_List);
        ItemStack[][] Pipe_List_Split = addSplitAggregateArray(Pipe_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Pipe_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Pipe List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // ToolList
        ItemStack[] Tool_List_Checked = checkItemStack(ToolList.Tool_List);
        ItemStack[][] Tool_List_Split = addSplitAggregateArray(Tool_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Tool_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Tool List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // WireList
        ItemStack[] Wire_List_Checked = checkItemStack(WireList.Wire_List);
        ItemStack[][] Wire_List_Split = addSplitAggregateArray(Wire_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Wire_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Wire List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }
    }

    public static void addEnumMagicListCheckRecipes() {
        // Thaumcraft:ItemEssence
        ItemStack[] Phial_of_Essentia_Checked = checkItemStack(EssenceList.Phial_of_Essentia_List);
        ItemStack[][] Phial_of_Essentia_Split = addSplitAggregateArray(Phial_of_Essentia_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Phial_of_Essentia_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Phial of Essentia Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // Thaumcraft:ItemEssence
        ItemStack[] Ethereal_Essence_Checked = checkItemStack(EssenceList.Ethereal_Essence_List);
        ItemStack[][] Ethereal_Essence_Split = addSplitAggregateArray(Ethereal_Essence_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Ethereal_Essence_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Ethereal Essence Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // Thaumcraft:ItemEssence
        ItemStack[] Crystallized_Essence_Checked = checkItemStack(EssenceList.Crystallized_Essence_List);
        ItemStack[][] Crystallized_Essence_Split = addSplitAggregateArray(
            Crystallized_Essence_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Crystallized_Essence_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Crystallized Essence Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }
    }

    public static void addEnumMaterialListCheckRecipes() {
        // BlockList
        ItemStack[] Block_List_Checked = checkItemStack(BlockList.Block_List);
        ItemStack[][] Block_List_Split = addSplitAggregateArray(Block_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Block_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Block List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // BoltList
        ItemStack[] Bolt_List_Checked = checkItemStack(BoltList.Bolt_List);
        ItemStack[][] Bolt_List_Split = addSplitAggregateArray(Bolt_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Bolt_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Bolt List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // CasingList
        ItemStack[] Casing_List_Checked = checkItemStack(CasingList.Casing_List);
        ItemStack[][] Casing_List_Split = addSplitAggregateArray(Casing_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Casing_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Casing List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // DensePlateList
        ItemStack[] DensePlate_List_Checked = checkItemStack(DensePlateList.DensePlate_List);
        ItemStack[][] DensePlate_List_Split = addSplitAggregateArray(DensePlate_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : DensePlate_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Dense Plate List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // DoublePlateList
        ItemStack[] DoublePlate_List_Checked = checkItemStack(DoublePlateList.DoublePlate_List);
        ItemStack[][] DoublePlate_List_Split = addSplitAggregateArray(DoublePlate_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : DoublePlate_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Double Plate List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // DrillTipList
        ItemStack[] DrillTip_List_Checked = checkItemStack(DrillTipList.DrillTip_List);
        ItemStack[][] DrillTip_List_Split = addSplitAggregateArray(DrillTip_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : DrillTip_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Drill Tip List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // FineWireList
        ItemStack[] FineWire_List_Checked = checkItemStack(FineWireList.FineWire_List);
        ItemStack[][] FineWire_List_Split = addSplitAggregateArray(FineWire_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : FineWire_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Fine Wire List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // FoilList
        ItemStack[] Foil_List_Checked = checkItemStack(FoilList.Foil_List);
        ItemStack[][] Foil_List_Split = addSplitAggregateArray(Foil_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Foil_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Foil List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // FrameBoxList
        ItemStack[] FrameBox_List_Checked = checkItemStack(FrameBoxList.FrameBox_List);
        ItemStack[][] FrameBox_List_Split = addSplitAggregateArray(FrameBox_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : FrameBox_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Frame Box List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // GearList
        ItemStack[] Gear_List_Checked = checkItemStack(GearList.Gear_List);
        ItemStack[][] Gear_List_Split = addSplitAggregateArray(Gear_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Gear_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Gear List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // LongRodList
        ItemStack[] LongRod_List_Checked = checkItemStack(LongRodList.LongRod_List);
        ItemStack[][] LongRod_List_Split = addSplitAggregateArray(LongRod_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : LongRod_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Long Rod List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // MiscPlateList
        ItemStack[] MiscPlate_List_Checked = checkItemStack(MiscPlateList.MiscPlate_List);
        ItemStack[][] MiscPlate_List_Split = addSplitAggregateArray(MiscPlate_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : MiscPlate_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Misc Plate List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // PlateList
        ItemStack[] Plate_List_Checked = checkItemStack(PlateList.Plate_List);
        ItemStack[][] Plate_List_Split = addSplitAggregateArray(Plate_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Plate_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Plate List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // QuadruplePlateList
        ItemStack[] QuadruplePlate_List_Checked = checkItemStack(QuadruplePlateList.QuadruplePlate_List);
        ItemStack[][] QuadruplePlate_List_Split = addSplitAggregateArray(
            QuadruplePlate_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : QuadruplePlate_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Quadruple Plate List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // QuintuplePlateList
        ItemStack[] QuintuplePlate_List_Checked = checkItemStack(QuintuplePlateList.QuintuplePlate_List);
        ItemStack[][] QuintuplePlate_List_Split = addSplitAggregateArray(
            QuintuplePlate_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : QuintuplePlate_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Quintuple Plate List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // RingList
        ItemStack[] Ring_List_Checked = checkItemStack(RingList.Ring_List);
        ItemStack[][] Ring_List_Split = addSplitAggregateArray(Ring_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Ring_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Ring List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // RodList
        ItemStack[] Rod_List_Checked = checkItemStack(RodList.Rod_List);
        ItemStack[][] Rod_List_Split = addSplitAggregateArray(Rod_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Rod_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Rod List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // RotorList
        ItemStack[] Rotor_List_Checked = checkItemStack(RotorList.Rotor_List);
        ItemStack[][] Rotor_List_Split = addSplitAggregateArray(Rotor_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Rotor_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Rotor List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // RoundList
        ItemStack[] Round_List_Checked = checkItemStack(RoundList.Round_List);
        ItemStack[][] Round_List_Split = addSplitAggregateArray(Round_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Round_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Round List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // ScrewList
        ItemStack[] Screw_List_Checked = checkItemStack(ScrewList.Screw_List);
        ItemStack[][] Screw_List_Split = addSplitAggregateArray(Screw_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Screw_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Screw List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // SmallGearList
        ItemStack[] SmallGear_List_Checked = checkItemStack(SmallGearList.SmallGear_List);
        ItemStack[][] SmallGear_List_Split = addSplitAggregateArray(SmallGear_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : SmallGear_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Small Gear List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // SmallSpringList
        ItemStack[] SmallSpring_List_Checked = checkItemStack(SmallSpringList.SmallSpring_List);
        ItemStack[][] SmallSpring_List_Split = addSplitAggregateArray(SmallSpring_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : SmallSpring_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Small Spring List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // SpringList
        ItemStack[] Spring_List_Checked = checkItemStack(SpringList.Spring_List);
        ItemStack[][] Spring_List_Split = addSplitAggregateArray(Spring_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Spring_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Spring List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // SuperdensePlateList
        ItemStack[] SuperdensePlate_List_Checked = checkItemStack(SuperdensePlateList.SuperdensePlate_List);
        ItemStack[][] SuperdensePlate_List_Split = addSplitAggregateArray(
            SuperdensePlate_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : SuperdensePlate_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Superdense Plate List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TriplePlateList
        ItemStack[] TriplePlate_List_Checked = checkItemStack(TriplePlateList.TriplePlate_List);
        ItemStack[][] TriplePlate_List_Split = addSplitAggregateArray(TriplePlate_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TriplePlate_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Triple Plate List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TurbineBladeList
        ItemStack[] TurbineBlade_List_Checked = checkItemStack(TurbineBladeList.TurbineBlade_List);
        ItemStack[][] TurbineBlade_List_Split = addSplitAggregateArray(TurbineBlade_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TurbineBlade_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Turbine Blade List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }
    }

    public static void addEnumMiscListCheckRecipes() {
        // CoinList
        ItemStack[] Coin_List_Checked = checkItemStack(CoinList.Coin_List);
        ItemStack[][] Coin_List_Split = addSplitAggregateArray(Coin_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Coin_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Coin List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // SingularityList
        ItemStack[] Singularity_List_Checked = checkItemStack(SingularityList.Singularity_List);
        ItemStack[][] Singularity_List_Split = addSplitAggregateArray(Singularity_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Singularity_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Singularity List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }
    }

    public static void addEnumModListCheckRecipes() {
        // AE2FluidCraftingList
        ItemStack[] AE2FluidCrafting_List_Checked = checkItemStack(AE2FluidCraftingList.AE2FluidCrafting_List);
        ItemStack[][] AE2FluidCrafting_List_Split = addSplitAggregateArray(
            AE2FluidCrafting_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : AE2FluidCrafting_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug AE2 Fluid Crafting List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // AmunRaList
        ItemStack[] AmunRa_List_Checked = checkItemStack(AmunRaList.AmunRa_List);
        ItemStack[][] AmunRa_List_Split = addSplitAggregateArray(AmunRa_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : AmunRa_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // Appliedenergistics2List
        ItemStack[] Appliedenergistics2_List_Checked = checkItemStack(Appliedenergistics2List.Appliedenergistics2_List);
        ItemStack[][] Appliedenergistics2_List_Split = addSplitAggregateArray(
            Appliedenergistics2_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Appliedenergistics2_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // AutomagyList
        ItemStack[] Automagy_List_Checked = checkItemStack(AutomagyList.Automagy_List);
        ItemStack[][] Automagy_List_Split = addSplitAggregateArray(Automagy_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Automagy_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // AvaritiaList
        ItemStack[] Avaritia_List_Checked = checkItemStack(AvaritiaList.Avaritia_List);
        ItemStack[][] Avaritia_List_Split = addSplitAggregateArray(Avaritia_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Avaritia_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // BackpackList
        ItemStack[] Backpack_List_Checked = checkItemStack(BackpackList.Backpack_List);
        ItemStack[][] Backpack_List_Split = addSplitAggregateArray(Backpack_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Backpack_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // BloodMagicList
        ItemStack[] BloodMagic_List_Checked = checkItemStack(BloodMagicList.BloodMagic_List);
        ItemStack[][] BloodMagic_List_Split = addSplitAggregateArray(BloodMagic_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : BloodMagic_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // BotaniaList
        ItemStack[] Botania_List_Checked = checkItemStack(BotaniaList.Botania_List);
        ItemStack[][] Botania_List_Split = addSplitAggregateArray(Botania_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Botania_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // BuildCraftList
        ItemStack[] BuildCraft_List_Checked = checkItemStack(BuildCraftList.BuildCraft_List);
        ItemStack[][] BuildCraft_List_Split = addSplitAggregateArray(BuildCraft_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : BuildCraft_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // DraconicEvolutionList
        ItemStack[] DraconicEvolution_List_Checked = checkItemStack(DraconicEvolutionList.DraconicEvolution_List);
        ItemStack[][] DraconicEvolution_List_Split = addSplitAggregateArray(
            DraconicEvolution_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : DraconicEvolution_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // ElectroMagicToolsList
        ItemStack[] ElectroMagicTools_List_Checked = checkItemStack(ElectroMagicToolsList.ElectroMagicTools_List);
        ItemStack[][] ElectroMagicTools_List_Split = addSplitAggregateArray(
            ElectroMagicTools_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : ElectroMagicTools_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // EnderIOList
        ItemStack[] EnderIO_List_Checked = checkItemStack(EnderIOList.EnderIO_List);
        ItemStack[][] EnderIO_List_Split = addSplitAggregateArray(EnderIO_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : EnderIO_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // EnderStorageList
        ItemStack[] EnderStorage_List_Checked = checkItemStack(EnderStorageList.EnderStorage_List);
        ItemStack[][] EnderStorage_List_Split = addSplitAggregateArray(EnderStorage_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : EnderStorage_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // EtFuturumRequiemList
        ItemStack[] EtFuturumRequiem_List_Checked = checkItemStack(EtFuturumRequiemList.EtFuturumRequiem_List);
        ItemStack[][] EtFuturumRequiem_List_Split = addSplitAggregateArray(
            EtFuturumRequiem_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : EtFuturumRequiem_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // ExtraBeesList
        ItemStack[] ExtraBees_List_Checked = checkItemStack(ExtraBeesList.ExtraBees_List);
        ItemStack[][] ExtraBees_List_Split = addSplitAggregateArray(ExtraBees_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : ExtraBees_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // ExtraTreesList
        ItemStack[] ExtraTrees_List_Checked = checkItemStack(ExtraTreesList.ExtraTrees_List);
        ItemStack[][] ExtraTrees_List_Split = addSplitAggregateArray(ExtraTrees_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : ExtraTrees_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // ExtraUtilitieList
        ItemStack[] ExtraUtilitie_List_Checked = checkItemStack(ExtraUtilitieList.ExtraUtilitie_List);
        ItemStack[][] ExtraUtilitie_List_Split = addSplitAggregateArray(
            ExtraUtilitie_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : ExtraUtilitie_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // ForestryList
        ItemStack[] Forestry_List_Checked = checkItemStack(ForestryList.Forestry_List);
        ItemStack[][] Forestry_List_Split = addSplitAggregateArray(Forestry_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Forestry_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // GadomancyList
        ItemStack[] Gadomancy_List_Checked = checkItemStack(GadomancyList.Gadomancy_List);
        ItemStack[][] Gadomancy_List_Split = addSplitAggregateArray(Gadomancy_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Gadomancy_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // GalacticraftList
        ItemStack[] Galacticraft_List_Checked = checkItemStack(GalacticraftList.Galacticraft_List);
        ItemStack[][] Galacticraft_List_Split = addSplitAggregateArray(Galacticraft_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Galacticraft_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // GalaxySpaceList
        ItemStack[] GalaxySpace_List_Checked = checkItemStack(GalaxySpaceList.GalaxySpace_List);
        ItemStack[][] GalaxySpace_List_Split = addSplitAggregateArray(GalaxySpace_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : GalaxySpace_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // GoodGeneratorList
        ItemStack[] GoodGenerator_List_Checked = checkItemStack(GoodGeneratorList.GoodGenerator_List);
        ItemStack[][] GoodGenerator_List_Split = addSplitAggregateArray(
            GoodGenerator_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : GoodGenerator_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // GTNHIntergalacticList
        ItemStack[] GTNHIntergalactic_List_Checked = checkItemStack(GTNHIntergalacticList.GTNHIntergalactic_List);
        ItemStack[][] GTNHIntergalactic_List_Split = addSplitAggregateArray(
            GTNHIntergalactic_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : GTNHIntergalactic_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // GTNHLanthanidesList
        ItemStack[] GTNHLanthanides_List_Checked = checkItemStack(GTNHLanthanidesList.GTNHLanthanides_List);
        ItemStack[][] GTNHLanthanides_List_Split = addSplitAggregateArray(
            GTNHLanthanides_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : GTNHLanthanides_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // IronChestTankList
        ItemStack[] IronChestTank_List_Checked = checkItemStack(IronChestTankList.IronChestTank_List);
        ItemStack[][] IronChestTank_List_Split = addSplitAggregateArray(
            IronChestTank_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : IronChestTank_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // KekzTechList
        ItemStack[] KekzTech_List_Checked = checkItemStack(KekzTechList.KekzTech_List);
        ItemStack[][] KekzTech_List_Split = addSplitAggregateArray(KekzTech_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : KekzTech_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // KubaTechList
        ItemStack[] KubaTech_List_Checked = checkItemStack(KubaTechList.KubaTech_List);
        ItemStack[][] KubaTech_List_Split = addSplitAggregateArray(KubaTech_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : KubaTech_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug KubaTech List Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // MagicBeesList
        ItemStack[] MagicBees_List_Checked = checkItemStack(MagicBeesList.MagicBees_List);
        ItemStack[][] MagicBees_List_Split = addSplitAggregateArray(MagicBees_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : MagicBees_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // MinecraftList
        ItemStack[] Minecraft_List_Checked = checkItemStack(MinecraftList.Minecraft_List);
        ItemStack[][] Minecraft_List_Split = addSplitAggregateArray(Minecraft_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Minecraft_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // NewHorizonsCoreModList
        ItemStack[] NewHorizonsCoreMod_List_Checked = checkItemStack(NewHorizonsCoreModList.NewHorizonsCoreMod_List);
        ItemStack[][] NewHorizonsCoreMod_List_Split = addSplitAggregateArray(
            NewHorizonsCoreMod_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : NewHorizonsCoreMod_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // OpenBlocksList
        ItemStack[] OpenBlocks_List_Checked = checkItemStack(OpenBlocksList.OpenBlocks_List);
        ItemStack[][] OpenBlocks_List_Split = addSplitAggregateArray(OpenBlocks_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : OpenBlocks_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // OpenComputersList
        ItemStack[] OpenComputers_List_Checked = checkItemStack(OpenComputersList.OpenComputers_List);
        ItemStack[][] OpenComputers_List_Split = addSplitAggregateArray(
            OpenComputers_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : OpenComputers_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // ProjectList
        ItemStack[] Project_List_Checked = checkItemStack(ProjectList.Project_List);
        ItemStack[][] Project_List_Split = addSplitAggregateArray(Project_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Project_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // RailcraftList
        ItemStack[] Railcraft_List_Checked = checkItemStack(RailcraftList.Railcraft_List);
        ItemStack[][] Railcraft_List_Split = addSplitAggregateArray(Railcraft_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Railcraft_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // SolarPanelsList
        ItemStack[] SolarPanels_List_Checked = checkItemStack(SolarPanelsList.SolarPanels_List);
        ItemStack[][] SolarPanels_List_Split = addSplitAggregateArray(SolarPanels_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : SolarPanels_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TaintedMagicList
        ItemStack[] TaintedMagic_List_Checked = checkItemStack(TaintedMagicList.TaintedMagic_List);
        ItemStack[][] TaintedMagic_List_Split = addSplitAggregateArray(TaintedMagic_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TaintedMagic_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TecTechList
        ItemStack[] TecTech_List_Checked = checkItemStack(TecTechList.TecTech_List);
        ItemStack[][] TecTech_List_Split = addSplitAggregateArray(TecTech_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TecTech_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // ThaumcraftList
        ItemStack[] Thaumcraft_List_Checked = checkItemStack(ThaumcraftList.Thaumcraft_List);
        ItemStack[][] Thaumcraft_List_Split = addSplitAggregateArray(Thaumcraft_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Thaumcraft_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // ThaumicBasesList
        ItemStack[] ThaumicBases_List_Checked = checkItemStack(ThaumicBasesList.ThaumicBases_List);
        ItemStack[][] ThaumicBases_List_Split = addSplitAggregateArray(ThaumicBases_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : ThaumicBases_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // ThaumicHorizonsList
        ItemStack[] ThaumicHorizons_List_Checked = checkItemStack(ThaumicHorizonsList.ThaumicHorizons_List);
        ItemStack[][] ThaumicHorizons_List_Split = addSplitAggregateArray(
            ThaumicHorizons_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : ThaumicHorizons_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // ThaumicTinkererList
        ItemStack[] ThaumicTinkerer_List_Checked = checkItemStack(ThaumicTinkererList.ThaumicTinkerer_List);
        ItemStack[][] ThaumicTinkerer_List_Split = addSplitAggregateArray(
            ThaumicTinkerer_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : ThaumicTinkerer_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TwilightForestList
        ItemStack[] TwilightForest_List_Checked = checkItemStack(TwilightForestList.TwilightForest_List);
        ItemStack[][] TwilightForest_List_Split = addSplitAggregateArray(
            TwilightForest_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TwilightForest_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // WitcheryList
        ItemStack[] Witchery_List_Checked = checkItemStack(WitcheryList.Witchery_List);
        ItemStack[][] Witchery_List_Split = addSplitAggregateArray(Witchery_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Witchery_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }
    }

    public static void addEnumOreProductListCheckRecipes() {
        // CrushedOreList
        ItemStack[] CrushedOre_List_Checked = checkItemStack(CrushedOreList.CrushedOre_List);
        ItemStack[][] CrushedOre_List_Split = addSplitAggregateArray(CrushedOre_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : CrushedOre_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // DustList
        ItemStack[] Dust_List_Checked = checkItemStack(DustList.Dust_List);
        ItemStack[][] Dust_List_Split = addSplitAggregateArray(Dust_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Dust_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // GemList
        ItemStack[] Gem_List_Checked = checkItemStack(GemList.Gem_List);
        ItemStack[][] Gem_List_Split = addSplitAggregateArray(Gem_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Gem_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // IngotList
        ItemStack[] Ingot_List_Checked = checkItemStack(IngotList.Ingot_List);
        ItemStack[][] Ingot_List_Split = addSplitAggregateArray(Ingot_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Ingot_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // OreList
        ItemStack[] Ore_List_Checked = checkItemStack(OreList.Ore_List);
        ItemStack[][] Ore_List_Split = addSplitAggregateArray(Ore_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Ore_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // RawOreList
        ItemStack[] RawOre_List_Checked = checkItemStack(RawOreList.RawOre_List);
        ItemStack[][] RawOre_List_Split = addSplitAggregateArray(RawOre_List_Checked, NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : RawOre_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }
    }

    public static void addEnumTinkerConstructListCheckRecipes() {
        // TinkerConstructList
        ItemStack[] TinkerConstruct_List_Checked = checkItemStack(TinkerConstructList.TinkerConstruct_List);
        ItemStack[][] TinkerConstruct_List_Split = addSplitAggregateArray(
            TinkerConstruct_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TinkerConstruct_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TinkersGregworksArrowHeadList
        ItemStack[] TinkersGregworks_ArrowHead_List_Checked = checkItemStack(
            TinkersGregworksArrowHeadList.TinkersGregworks_ArrowHead_List);
        ItemStack[][] TinkersGregworks_ArrowHead_List_Split = addSplitAggregateArray(
            TinkersGregworks_ArrowHead_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TinkersGregworks_ArrowHead_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TinkersGregworksAxeHeadList
        ItemStack[] TinkersGregworks_AxeHead_List_Checked = checkItemStack(
            TinkersGregworksAxeHeadList.TinkersGregworks_AxeHead_List);
        ItemStack[][] TinkersGregworks_AxeHead_List_Split = addSplitAggregateArray(
            TinkersGregworks_AxeHead_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TinkersGregworks_AxeHead_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TinkersGregworksBindingList
        ItemStack[] TinkersGregworks_Binding_List_Checked = checkItemStack(
            TinkersGregworksBindingList.TinkersGregworks_Binding_List);
        ItemStack[][] TinkersGregworks_Binding_List_Split = addSplitAggregateArray(
            TinkersGregworks_Binding_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TinkersGregworks_Binding_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TinkersGregworksBowList
        ItemStack[] TinkersGregworks_Bow_List_Checked = checkItemStack(
            TinkersGregworksBowList.TinkersGregworks_Bow_List);
        ItemStack[][] TinkersGregworks_Bow_List_Split = addSplitAggregateArray(
            TinkersGregworks_Bow_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TinkersGregworks_Bow_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TinkersGregworksChiselHeadList
        ItemStack[] TinkersGregworks_ChiselHead_List_Checked = checkItemStack(
            TinkersGregworksChiselHeadList.TinkersGregworks_ChiselHead_List);
        ItemStack[][] TinkersGregworks_ChiselHead_List_Split = addSplitAggregateArray(
            TinkersGregworks_ChiselHead_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TinkersGregworks_ChiselHead_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TinkersGregworksCrossbarList
        ItemStack[] TinkersGregworks_Crossbar_List_Checked = checkItemStack(
            TinkersGregworksCrossbarList.TinkersGregworks_Crossbar_List);
        ItemStack[][] TinkersGregworks_Crossbar_List_Split = addSplitAggregateArray(
            TinkersGregworks_Crossbar_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TinkersGregworks_Crossbar_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TinkersGregworksCrossbowList
        ItemStack[] TinkersGregworks_Crossbow_List_Checked = checkItemStack(
            TinkersGregworksCrossbowList.TinkersGregworks_Crossbow_List);
        ItemStack[][] TinkersGregworks_Crossbow_List_Split = addSplitAggregateArray(
            TinkersGregworks_Crossbow_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TinkersGregworks_Crossbow_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TinkersGregworksGuardList
        ItemStack[] TinkersGregworks_Guard_List_Checked = checkItemStack(
            TinkersGregworksGuardList.TinkersGregworks_Guard_List);
        ItemStack[][] TinkersGregworks_Guard_List_Split = addSplitAggregateArray(
            TinkersGregworks_Guard_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TinkersGregworks_Guard_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TinkersGregworksKnifeList
        ItemStack[] TinkersGregworks_Knife_List_Checked = checkItemStack(
            TinkersGregworksKnifeList.TinkersGregworks_Knife_List);
        ItemStack[][] TinkersGregworks_Knife_List_Split = addSplitAggregateArray(
            TinkersGregworks_Knife_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TinkersGregworks_Knife_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TinkersGregworksLargePlateList
        ItemStack[] TinkersGregworks_LargePlate_List_Checked = checkItemStack(
            TinkersGregworksLargePlateList.TinkersGregworks_LargePlate_List);
        ItemStack[][] TinkersGregworks_LargePlate_List_Split = addSplitAggregateArray(
            TinkersGregworks_LargePlate_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TinkersGregworks_LargePlate_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TinkersGregworksPanList
        ItemStack[] TinkersGregworks_Pan_List_Checked = checkItemStack(
            TinkersGregworksPanList.TinkersGregworks_Pan_List);
        ItemStack[][] TinkersGregworks_Pan_List_Split = addSplitAggregateArray(
            TinkersGregworks_Pan_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TinkersGregworks_Pan_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TinkersGregworksPickaxeHeadList
        ItemStack[] TinkersGregworks_PickaxeHead_List_Checked = checkItemStack(
            TinkersGregworksPickaxeHeadList.TinkersGregworks_PickaxeHead_List);
        ItemStack[][] TinkersGregworks_PickaxeHead_List_Split = addSplitAggregateArray(
            TinkersGregworks_PickaxeHead_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TinkersGregworks_PickaxeHead_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TinkersGregworksRodList
        ItemStack[] TinkersGregworks_Rod_List_Checked = checkItemStack(
            TinkersGregworksRodList.TinkersGregworks_Rod_List);
        ItemStack[][] TinkersGregworks_Rod_List_Split = addSplitAggregateArray(
            TinkersGregworks_Rod_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TinkersGregworks_Rod_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TinkersGregworksScytheHeadList
        ItemStack[] TinkersGregworks_ScytheHead_List_Checked = checkItemStack(
            TinkersGregworksScytheHeadList.TinkersGregworks_ScytheHead_List);
        ItemStack[][] TinkersGregworks_ScytheHead_List_Split = addSplitAggregateArray(
            TinkersGregworks_ScytheHead_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TinkersGregworks_ScytheHead_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TinkersGregworksShardList
        ItemStack[] TinkersGregworks_Shard_List_Checked = checkItemStack(
            TinkersGregworksShardList.TinkersGregworks_Shard_List);
        ItemStack[][] TinkersGregworks_Shard_List_Split = addSplitAggregateArray(
            TinkersGregworks_Shard_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TinkersGregworks_Shard_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TinkersGregworksShovelHeadList
        ItemStack[] TinkersGregworks_ShovelHead_List_Checked = checkItemStack(
            TinkersGregworksShovelHeadList.TinkersGregworks_ShovelHead_List);
        ItemStack[][] TinkersGregworks_ShovelHead_List_Split = addSplitAggregateArray(
            TinkersGregworks_ShovelHead_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TinkersGregworks_ShovelHead_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TinkersGregworksShurikenList
        ItemStack[] TinkersGregworks_Shuriken_List_Checked = checkItemStack(
            TinkersGregworksShurikenList.TinkersGregworks_Shuriken_List);
        ItemStack[][] TinkersGregworks_Shuriken_List_Split = addSplitAggregateArray(
            TinkersGregworks_Shuriken_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TinkersGregworks_Shuriken_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TinkersGregworksSignHeadList
        ItemStack[] TinkersGregworks_SignHead_List_Checked = checkItemStack(
            TinkersGregworksSignHeadList.TinkersGregworks_SignHead_List);
        ItemStack[][] TinkersGregworks_SignHead_List_Split = addSplitAggregateArray(
            TinkersGregworks_SignHead_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TinkersGregworks_SignHead_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }

        // TinkersGregworksSwordList
        ItemStack[] TinkersGregworks_Sword_List_Checked = checkItemStack(
            TinkersGregworksSwordList.TinkersGregworks_Sword_List);
        ItemStack[][] TinkersGregworks_Sword_List_Split = addSplitAggregateArray(
            TinkersGregworks_Sword_List_Checked,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : TinkersGregworks_Sword_List_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item Check")
                .eut(0)
                .addTo(addItemCheckRecipes);
        }
    }
}
