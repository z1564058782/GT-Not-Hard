package machines;

import static com.gtnewhorizon.structurelib.structure.StructureUtility.*;
import static gregtech.api.GregTechAPI.METATILEENTITIES;
import static gregtech.api.enums.HatchElement.*;
import static gregtech.api.enums.Textures.BlockIcons.*;
import static gregtech.api.metatileentity.BaseTileEntity.TOOLTIP_DELAY;
import static gregtech.api.metatileentity.implementations.MTEBasicMachine.isValidForLowGravity;
import static gregtech.api.recipe.RecipeMaps.simpleWasherRecipes;
import static gregtech.api.util.GTStructureUtility.buildHatchAdder;
import static gregtech.common.misc.WirelessNetworkManager.addEUToGlobalEnergyMap;
import static java.lang.Math.pow;
import static loader.ChaosRecipeLoader.AssemblyLineWithoutResearchRecipe;
import static net.minecraft.util.StatCollector.translateToLocal;
import static net.minecraft.util.StatCollector.translateToLocalFormatted;
import static util.MachineLocalization.sendMode;
import static util.MachineLocalization.translateMode;
import static util.MachineModeSelector.selectMode;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

import javax.annotation.Nonnull;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;

import com.gtnewhorizon.structurelib.alignment.constructable.ISurvivalConstructable;
import com.gtnewhorizon.structurelib.structure.IStructureDefinition;
import com.gtnewhorizon.structurelib.structure.ISurvivalBuildEnvironment;
import com.gtnewhorizon.structurelib.structure.StructureDefinition;
import com.gtnewhorizons.modularui.api.drawable.IDrawable;
import com.gtnewhorizons.modularui.api.screen.ModularWindow;
import com.gtnewhorizons.modularui.api.screen.UIBuildContext;
import com.gtnewhorizons.modularui.common.widget.ButtonWidget;
import com.gtnewhorizons.modularui.common.widget.FakeSyncWidget;
import com.mofoga.gtnothard.MyMod;

import Recipes.ChaosRecipes.ChaosAntimatterRecipes;
import Recipes.ChaosRecipes.ChaosArcaneWorktableRecipes;
import Recipes.ChaosRecipes.ChaosBloodMagicRecipes;
import Recipes.ChaosRecipes.ChaosBotaniaRecipes;
import Recipes.ChaosRecipes.ChaosCircuitAssemblerRecipes;
import Recipes.ChaosRecipes.ChaosCrucibleRecipes;
import Recipes.ChaosRecipes.ChaosEssenceFarmRecipes;
import Recipes.ChaosRecipes.ChaosExoticRecipes;
import Recipes.ChaosRecipes.ChaosFallingTowerRecipes;
import Recipes.ChaosRecipes.ChaosOreRecipes;
import Recipes.ChaosRecipes.ChaosReplicatorRecipes;
import Recipes.ChaosRecipes.ChaosRunicMatrixRecipes;
import Recipes.ChaosRecipes.ChaosSpecialCompressRecipes;
import Recipes.ChaosRecipes.ChaosXtremeCraftingRecipes;
import Recipes.ChaosRecipes.ChaosZhuHaiRecipes;
import goodgenerator.api.recipe.GoodGeneratorRecipeMaps;
import gregtech.GTMod;
import gregtech.api.GregTechAPI;
import gregtech.api.enums.GTValues;
import gregtech.api.gui.modularui.GTUITextures;
import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.logic.ProcessingLogic;
import gregtech.api.metatileentity.implementations.MTEExtendedPowerMultiBlockBase;
import gregtech.api.metatileentity.implementations.MTEHatchInput;
import gregtech.api.metatileentity.implementations.MTEHatchInputBus;
import gregtech.api.metatileentity.implementations.MTEMultiBlockBase;
import gregtech.api.metatileentity.implementations.MTETieredMachineBlock;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMaps;
import gregtech.api.recipe.check.CheckRecipeResult;
import gregtech.api.recipe.check.CheckRecipeResultRegistry;
import gregtech.api.recipe.check.SimpleCheckRecipeResult;
import gregtech.api.recipe.metadata.CompressionTierKey;
import gregtech.api.render.TextureFactory;
import gregtech.api.util.GTRecipe;
import gregtech.api.util.GTUtility;
import gregtech.api.util.MultiblockTooltipBuilder;
import gregtech.api.util.OverclockCalculator;
import gregtech.common.blocks.ItemMachines;
import gregtech.common.tileentities.machines.RecipeCheckReason;
import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import util.ChaosManager;
import util.ChaosRuntimeBridge;
import util.GTNotHardUITextures;
import util.MachineRecipeCatalog;

public class Chaos extends MTEExtendedPowerMultiBlockBase<Chaos> implements ISurvivalConstructable {

    public Chaos(int aID, String aName, String aNameRegional) {
        super(aID, aName, aNameRegional);
    }

    public Chaos(String aName) {
        super(aName);
    }

    protected UUID ownerUUID;
    protected boolean isRecipeProcessing = false;
    protected boolean wirelessMode = false;
    private BigInteger costEU = BigInteger.ZERO;

    private RecipeMap<?> mLastRecipeMap;
    private ItemStack lastControllerStack;
    private MTEMultiBlockBase runtimeMachine;
    private String runtimeMachineName = "";
    private int runtimeMachineMode = 0;
    private boolean machineModeAvailable = false;
    private String machineModeName = "";
    private int tTier = 0;
    private int mode = 0;
    private String specialMachineType = null;
    private boolean updateMode = false;
    private boolean downtierUEV = true;
    private boolean isMultiBlock = false;

    @Override
    public void onFirstTick(IGregTechTileEntity aBaseMetaTileEntity) {
        super.onFirstTick(aBaseMetaTileEntity);
        this.ownerUUID = aBaseMetaTileEntity.getOwnerUuid();
    }

    @Override
    public void saveNBTData(NBTTagCompound aNBT) {
        super.saveNBTData(aNBT);
        aNBT.setBoolean("wirelessMode", wirelessMode);
        aNBT.setBoolean("downtierUEV", downtierUEV);
        aNBT.setInteger("mode", mode);
        aNBT.setString("runtimeMachineName", runtimeMachineName);
        aNBT.setInteger("runtimeMachineMode", runtimeMachineMode);
        if (getSpecialMachine() && specialMachineType != null
            && !specialMachineType.trim()
                .isEmpty()) {
            aNBT.setString("MachineType", specialMachineType);
        }
    }

    @Override
    public void loadNBTData(final NBTTagCompound aNBT) {
        super.loadNBTData(aNBT);
        // 向后兼容性处理
        if (aNBT.hasKey("mSeparate")) {
            inputSeparation = aNBT.getBoolean("mSeparate");
        }
        if (aNBT.hasKey("mUseMultiparallelMode")) {
            batchMode = aNBT.getBoolean("mUseMultiparallelMode");
        }
        if (aNBT.hasKey("MachineType")) {
            String loadedMachineType = aNBT.getString("MachineType");
            if (loadedMachineType != null && !loadedMachineType.trim()
                .isEmpty()) {
                specialMachineType = loadedMachineType;
            }
        }
        wirelessMode = aNBT.getBoolean("wirelessMode");
        downtierUEV = aNBT.getBoolean("downtierUEV");
        mode = aNBT.getInteger("mode");
        runtimeMachineName = aNBT.getString("runtimeMachineName");
        runtimeMachineMode = aNBT.getInteger("runtimeMachineMode");
    }

    private static final int mcasingIndex = getTextureIndex(
        getCasingTextureForId(GTUtility.getCasingTextureIndex(GregTechAPI.sBlockCasings4, 0)));

    private static final String STRUCTURE_PIECE_MAIN = "main";
    private static final IStructureDefinition<Chaos> STRUCTURE_DEFINITION = StructureDefinition.<Chaos>builder()
        .addShape(
            STRUCTURE_PIECE_MAIN,
            transpose(new String[][] { { "hhh", "hhh", "hhh" }, { "h~h", "h-h", "hhh" }, { "hhh", "hhh", "hhh" } }))
        .addElement(
            'h',
            buildHatchAdder(Chaos.class)
                .atLeast(InputHatch, OutputHatch, InputBus, OutputBus, Maintenance, Energy.or(ExoticEnergy))
                .casingIndex(mcasingIndex)
                .hint(1)
                .buildAndChain(onElementPass(Chaos::onCasingAdded, ofBlock(GregTechAPI.sBlockCasings4, 0))))
        .build();

    private int mCasingAmount;

    private void onCasingAdded() {
        mCasingAmount++;
    }

    @Override
    public IStructureDefinition<Chaos> getStructureDefinition() {
        return STRUCTURE_DEFINITION;
    }

    @Override
    public ITexture[] getTexture(IGregTechTileEntity aBaseMetaTileEntity, ForgeDirection side, ForgeDirection aFacing,
        int colorIndex, boolean aActive, boolean redstoneLevel) {
        if (side == aFacing) {
            if (aActive) {
                return new ITexture[] { casingTexturePages[0][mcasingIndex], TextureFactory.builder()
                    .addIcon(OVERLAY_FRONT_ORE_FACTORY_ACTIVE)
                    .extFacing()
                    .build(),
                    TextureFactory.builder()
                        .addIcon(OVERLAY_FRONT_ORE_FACTORY_ACTIVE_GLOW)
                        .extFacing()
                        .glow()
                        .build() };
            }
            return new ITexture[] { casingTexturePages[0][mcasingIndex], TextureFactory.builder()
                .addIcon(OVERLAY_FRONT_ORE_FACTORY)
                .extFacing()
                .build(),
                TextureFactory.builder()
                    .addIcon(OVERLAY_FRONT_ORE_FACTORY_GLOW)
                    .extFacing()
                    .glow()
                    .build() };
        }
        return new ITexture[] { casingTexturePages[0][mcasingIndex] };
    }

    @Override
    public MultiblockTooltipBuilder createTooltip() {
        final MultiblockTooltipBuilder tt = new MultiblockTooltipBuilder();
        tt.addMachineType(translateToLocal("gt.blockmachines.chaos.name"))
            .addInfo(translateToLocal("gtnothard.tooltip.runs_machines"))
            .addInfo(translateToLocal("gtnothard.tooltip.parallel"))
            .addInfo(translateToLocal("gtnothard.tooltip.machine_count"))
            .addSeparator()
            .addInfo(translateToLocal("gtnothard.tooltip.chaos.wireless_duration"))
            .addInfo(translateToLocal("gtnothard.tooltip.chaos.wireless_energy"))
            .addSeparator()
            .addInfo(translateToLocal("gtnothard.tooltip.chaos.multiple_modes"))
            .addInfo(translateToLocal("gtnothard.tooltip.chaos.switch_mode"))
            .addSeparator()
            .addInfo(translateToLocal("gtnothard.tooltip.chaos.xtreme"))
            .addInfo(translateToLocal("gtnothard.tooltip.chaos.falling_tower"))
            .addInfo(translateToLocal("gtnothard.tooltip.chaos.thaumcraft"))
            .addInfo(translateToLocal("gtnothard.tooltip.chaos.magic"))
            .addSeparator()
            .addInfo(translateToLocal("gtnothard.tooltip.added_by"))
            .beginStructureBlock(3, 3, 3, true)
            .addController(translateToLocal("gtnothard.structure.front_center"))
            .addCasingInfoRange(translateToLocal("gtnothard.structure.tungstensteel"), 4, 24, false)
            .addEnergyHatch(translateToLocal("gtnothard.structure.any_casing"), 1)
            .addMaintenanceHatch(translateToLocal("gtnothard.structure.any_casing"), 1)
            .addInputBus(translateToLocal("gtnothard.structure.any_casing"), 1)
            .addInputHatch(translateToLocal("gtnothard.structure.any_casing"), 1)
            .addOutputBus(translateToLocal("gtnothard.structure.any_casing"), 1)
            .addOutputHatch(translateToLocal("gtnothard.structure.any_casing"), 1)
            .toolTipFinisher();
        return tt;
    }

    @Override
    public void construct(ItemStack aStack, boolean aHintsOnly) {
        buildPiece(STRUCTURE_PIECE_MAIN, aStack, aHintsOnly, 1, 1, 0);
    }

    @Override
    public int survivalConstruct(ItemStack stackSize, int elementBudget, ISurvivalBuildEnvironment env) {
        if (mMachine) {
            return -1;
        }
        return survivialBuildPiece(STRUCTURE_PIECE_MAIN, stackSize, 1, 1, 0, elementBudget, env, false, true);
    }

    @Override
    public boolean checkMachine(IGregTechTileEntity aBaseMetaTileEntity, ItemStack aStack) {
        mEnergyHatches.clear();
        mExoticEnergyHatches.clear();
        mCasingAmount = 0;
        return checkPiece(STRUCTURE_PIECE_MAIN, 1, 1, 0) && mCasingAmount >= 4 && checkHatches();
    }

    private boolean checkHatches() {
        return mMaintenanceHatches.size() == 1;
    }

    @Override
    public IMetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
        return new Chaos(this.mName);
    }

    @Override
    public int getMaxEfficiency(ItemStack aStack) {
        return 10000;
    }

    @Override
    public int getDamageToComponent(ItemStack aStack) {
        return 0;
    }

    @Override
    public boolean explodesOnComponentBreak(ItemStack aStack) {
        return false;
    }

    private int getMaxParallel() {
        if (getControllerSlot() == null) {
            return 1;
        }
        if (getControllerSlot().stackSize < 31) {
            return (int) pow(2, getControllerSlot().stackSize);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    private RecipeMap<?> fetchRecipeMap() {
        ItemStack controller = getControllerSlot();
        isMultiBlock = false;
        runtimeMachine = null;
        if (!isCorrectMachinePart(controller)) return null;
        RecipeMap<?> recipeMap = getMultifunctionalRecipeMap(controller.getItemDamage());
        if (recipeMap != null) {
            isMultiBlock = true;
            return recipeMap;
        }
        IMetaTileEntity machine = ItemMachines.getMetaTileEntity(controller);
        if (machine instanceof MTEMultiBlockBase multiblock) {
            isMultiBlock = true;
            if (ChaosRuntimeBridge.supports(multiblock)) {
                try {
                    runtimeMachine = ChaosRuntimeBridge.create(multiblock, this);
                    if (runtimeMachine != null) {
                        if (!machine.getMetaName()
                            .equals(runtimeMachineName)) {
                            runtimeMachineName = machine.getMetaName();
                            runtimeMachineMode = runtimeMachine.getMachineMode();
                        }
                        if (ChaosRuntimeBridge.supportsMachineModeSwitch(runtimeMachine)) {
                            ChaosRuntimeBridge.setMachineMode(this, runtimeMachine, runtimeMachineMode);
                            runtimeMachineMode = runtimeMachine.getMachineMode();
                        }
                    }
                } catch (ReflectiveOperationException | RuntimeException exception) {
                    runtimeMachine = null;
                    MyMod.LOG.warn("Cannot create Chaos runtime bridge for " + machine.getMetaName(), exception);
                }
            }
            return replacementRecipeMap(
                runtimeMachine == null ? multiblock.getRecipeMap() : runtimeMachine.getRecipeMap());
        }
        return ChaosManager.giveRecipeMap(ChaosManager.getMachineName(controller));
    }

    private void refreshMachine() {
        if (!GTUtility.areStacksEqual(lastControllerStack, getControllerSlot()) || updateMode) {
            updateMode = false;
            lastControllerStack = getControllerSlot() == null ? null : getControllerSlot().copy();
            mLastRecipeMap = fetchRecipeMap();
            setMachineTier();
        }
    }

    private boolean hasMachineModes() {
        refreshMachine();
        machineModeAvailable = mLastRecipeMap != null && getSpecialMachine()
            || runtimeMachine != null && ChaosRuntimeBridge.supportsMachineModeSwitch(runtimeMachine);
        return machineModeAvailable;
    }

    private String getSelectedMachineModeName() {
        if (!hasMachineModes()) return "";
        if (runtimeMachine != null) {
            return runtimeMachine.getMachineModeName();
        }
        return specialMachineType == null ? "" : translateMode(specialMachineType);
    }

    private void switchMachineMode(EntityPlayer player) {
        refreshMachine();
        if (runtimeMachine != null && ChaosRuntimeBridge.supportsMachineModeSwitch(runtimeMachine)) {
            try {
                runtimeMachineMode = ChaosRuntimeBridge.switchMachineMode(this, runtimeMachine);
                mLastRecipeMap = replacementRecipeMap(runtimeMachine.getRecipeMap());
                setSingleRecipeCheck(null);
                markDirty();
                scheduleRecipeCheck(RecipeCheckReason.IMMEDIATE);
            } catch (ReflectiveOperationException | RuntimeException exception) {
                MyMod.LOG.warn("Cannot switch Chaos runtime mode for " + runtimeMachine.getMetaName(), exception);
            }
            return;
        }
        if (mLastRecipeMap != null && getSpecialMachine()) {
            switchSpecialMachineMode(player);
            setSingleRecipeCheck(null);
            markDirty();
            scheduleRecipeCheck(RecipeCheckReason.IMMEDIATE);
        }
    }

    private static final Integer[] specialMachine = { 358, 360, 792, 850, 862, 942, 992, 995, 3006, 3008, 12735, 13001,
        15415, 31021, 31050, 32018, 32024 };

    private boolean getSpecialMachine() {
        ItemStack controllerSlot = getControllerSlot();
        return controllerSlot != null && Arrays.asList(specialMachine)
            .contains(controllerSlot.getItemDamage());
    }

    // 磁通量效应监视器-358
    private static final String[] Magnetic_Flux_Exhibitor_mod = { "Polarizer", "Electromagnetic Separator" };
    private static final RecipeMap<?>[] Magnetic_Flux_Exhibitor = { RecipeMaps.polarizerRecipes,
        RecipeMaps.electroMagneticSeparatorRecipes };
    // 涡轮装罐机Pro-360
    private static final String[] TurboCan_Pro_mod = { "Canner" };
    private static final RecipeMap<?>[] TurboCan_Pro = { RecipeMaps.cannerRecipes };
    // 工业辊压机-792
    private static final String[] Industrial_Material_Press_mod = { "Forming Press", "Bending Machine" };
    private static final RecipeMap<?>[] Industrial_Material_Press = { RecipeMaps.formingPressRecipes,
        RecipeMaps.benderRecipes };
    // 工业洗矿厂-850
    private static final String[] Ore_Washing_Plant_mod = { "Ore Washer", "Simple Washer", "Chemical Bath" };
    private static final RecipeMap<?>[] Ore_Washing_Plant = { RecipeMaps.oreWasherRecipes, simpleWasherRecipes,
        RecipeMaps.chemicalBathRecipes };
    // 工业电弧炉-862
    private static final String[] High_Current_Industrial_Arc_Furnace_mod = { "Arc Furnace" };
    private static final RecipeMap<?>[] High_Current_Industrial_Arc_Furnace = { RecipeMaps.arcFurnaceRecipes };
    // 亚马逊仓库-942
    private static final String[] Amazon_Warehousing_Depot_mod = { "Packager", "Unpackeager" };
    private static final RecipeMap<?>[] Amazon_Warehousing_Depot = { RecipeMaps.packagerRecipes,
        RecipeMaps.unpackagerRecipes };
    // 工业切割机-992
    private static final String[] Industrial_Cutting_Factory_mod = { "Cutting" };
    private static final RecipeMap<?>[] Industrial_Cutting_Factory = { RecipeMaps.cutterRecipes };
    // 真空干燥炉-995
    private static final String[] Utupu_Tanuri_mod = { "Dehydrator", "Vacuum Furnace" };
    private static final RecipeMap<?>[] Utupu_Tanuri = { RecipeMaps.chemicalDehydratorNonCellRecipes,
        RecipeMaps.vacuumFurnaceRecipes };
    // "Hot Isostatic Pressurization Unit"-3006
    private static final String[] Hot_Isostatic_Pressurization_Unit_mod = { "Compressor", "HIP Compressor" };
    private static final RecipeMap<?>[] Hot_Isostatic_Pressurization_Unit = { RecipeMaps.compressorRecipes,
        ChaosSpecialCompressRecipes.SpecialCompressRecipes_HIP };
    // 黑洞压缩机-3008
    private static final String[] Pseudostable_Black_Hole_Containment_Field_mod = { "Compressor", "BHC Compressor",
        "Advanced Neutronium Compressor" };
    private static final RecipeMap<?>[] Pseudostable_Black_Hole_Containment_Field = { RecipeMaps.compressorRecipes,
        ChaosSpecialCompressRecipes.SpecialCompressRecipes_BHC, RecipeMaps.neutroniumCompressorRecipes };
    // 电路装配线-12735
    private static final String[] Circuit_Assembly_Line_mod = { "Circuit Assembly Line", "Circuit Assembly" };
    private static final RecipeMap<?>[] Circuit_Assembly_Line = {
        ChaosCircuitAssemblerRecipes.addChaosCircuitAssemblerRecipes, RecipeMaps.circuitAssemblerRecipes };
    // "Research Completer"-13001
    private static final String[] Research_Completer_mod = { "Blood Magic", "Botania", "Essence Farm" };
    private static final RecipeMap<?>[] Research_Completer = { ChaosBloodMagicRecipes.addBloodMagicRecipes,
        ChaosBotaniaRecipes.addBotaniaRecipes, ChaosEssenceFarmRecipes.addEssenceFarmRecipes };
    // "Heliofusion Exoticizer"-15415
    private static final String[] Heliofusion_Exoticizer_mod = { "Degenerate Quark Gluon", "Magmatter" };
    private static final RecipeMap<?>[] Heliofusion_Exoticizer = {
        ChaosExoticRecipes.ExoticRecipes_DegenerateQuarkGluon, ChaosExoticRecipes.ExoticRecipes_Magmatter };
    // 丹格特蒸馏厂-31021
    private static final String[] Dangote_Distillus_mod = { "Distillery", "distillation tower" };
    private static final RecipeMap<?>[] Dangote_Distillus = { RecipeMaps.distilleryRecipes,
        RecipeMaps.distillationTowerRecipes };
    // "Elemental Duplicator"-31050
    private static final String[] Elemental_Duplicator_mod = { "Replicator Item", "Replicator Fluid" };
    private static final RecipeMap<?>[] Elemental_Duplicator = { ChaosReplicatorRecipes.ReplicatorRecipes_Item,
        ChaosReplicatorRecipes.ReplicatorRecipes_Fluid };
    // 精密自动组装机MT-3662-32018
    private static final String[] Precise_Auto_Assembler_MT_3662_mod = { "Precise Assembler", "Assembler" };
    private static final RecipeMap<?>[] Precise_Auto_Assembler_MT_3662 = {
        GoodGeneratorRecipeMaps.preciseAssemblerRecipes, RecipeMaps.assemblerRecipes };
    // "Large Essentia Smeltery"-32024
    private static final String[] Large_Essentia_Smeltery_mod = { "Arcane Worktable", "Crucible", "Runic Matrix" };
    private static final RecipeMap<?>[] Large_Essentia_Smeltery = {
        ChaosArcaneWorktableRecipes.addArcaneWorktableRecipes, ChaosCrucibleRecipes.addCrucibleRecipes,
        ChaosRunicMatrixRecipes.addRunicMatrixRecipes };

    @Override
    public void onLeftclick(IGregTechTileEntity aBaseMetaTileEntity, EntityPlayer aPlayer) {
        if (getBaseMetaTileEntity() != null && getControllerSlot() != null
            && aPlayer.isSneaking()
            && getBaseMetaTileEntity().isServerSide()) {
            switchMachineMode(aPlayer);
        }
        super.onLeftclick(aBaseMetaTileEntity, aPlayer);
    }

    private void switchSpecialMachineMode(EntityPlayer aPlayer) {
        this.mode = (this.mode + 1) % 3;
        updateMode = true;
        switch (getControllerSlot().getItemDamage()) {
            case 358 -> {
                sendMode(aPlayer, selectMode(Magnetic_Flux_Exhibitor_mod, mode));
                specialMachineType = selectMode(Magnetic_Flux_Exhibitor_mod, mode);
            }
            case 360 -> {
                sendMode(aPlayer, selectMode(TurboCan_Pro_mod, mode));
                specialMachineType = selectMode(TurboCan_Pro_mod, mode);
            }
            case 792 -> {
                sendMode(aPlayer, selectMode(Industrial_Material_Press_mod, mode));
                specialMachineType = selectMode(Industrial_Material_Press_mod, mode);
            }
            case 850 -> {
                sendMode(aPlayer, selectMode(Ore_Washing_Plant_mod, mode));
                specialMachineType = selectMode(Ore_Washing_Plant_mod, mode);
            }
            case 862 -> {
                sendMode(aPlayer, selectMode(High_Current_Industrial_Arc_Furnace_mod, mode));
                specialMachineType = selectMode(High_Current_Industrial_Arc_Furnace_mod, mode);
            }
            case 942 -> {
                sendMode(aPlayer, selectMode(Amazon_Warehousing_Depot_mod, mode));
                specialMachineType = selectMode(Amazon_Warehousing_Depot_mod, mode);
            }
            case 992 -> {
                sendMode(aPlayer, selectMode(Industrial_Cutting_Factory_mod, mode));
                specialMachineType = selectMode(Industrial_Cutting_Factory_mod, mode);
            }
            case 995 -> {
                sendMode(aPlayer, selectMode(Utupu_Tanuri_mod, mode));
                specialMachineType = selectMode(Utupu_Tanuri_mod, mode);
            }
            case 3006 -> {
                sendMode(aPlayer, selectMode(Hot_Isostatic_Pressurization_Unit_mod, mode));
                specialMachineType = selectMode(Hot_Isostatic_Pressurization_Unit_mod, mode);
            }
            case 3008 -> {
                sendMode(aPlayer, selectMode(Pseudostable_Black_Hole_Containment_Field_mod, mode));
                specialMachineType = selectMode(Pseudostable_Black_Hole_Containment_Field_mod, mode);
            }
            case 12735 -> {
                sendMode(aPlayer, selectMode(Circuit_Assembly_Line_mod, mode));
                specialMachineType = selectMode(Circuit_Assembly_Line_mod, mode);
            }
            case 13001 -> {
                sendMode(aPlayer, selectMode(Research_Completer_mod, mode));
                specialMachineType = selectMode(Research_Completer_mod, mode);
            }
            case 15415 -> {
                sendMode(aPlayer, selectMode(Heliofusion_Exoticizer_mod, mode));
                specialMachineType = selectMode(Heliofusion_Exoticizer_mod, mode);
            }
            case 31021 -> {
                sendMode(aPlayer, selectMode(Dangote_Distillus_mod, mode));
                specialMachineType = selectMode(Dangote_Distillus_mod, mode);
            }
            case 31050 -> {
                sendMode(aPlayer, selectMode(Elemental_Duplicator_mod, mode));
                specialMachineType = selectMode(Elemental_Duplicator_mod, mode);
            }
            case 32018 -> {
                sendMode(aPlayer, selectMode(Precise_Auto_Assembler_MT_3662_mod, mode));
                specialMachineType = selectMode(Precise_Auto_Assembler_MT_3662_mod, mode);
            }
            case 32024 -> {
                sendMode(aPlayer, selectMode(Large_Essentia_Smeltery_mod, mode));
                specialMachineType = selectMode(Large_Essentia_Smeltery_mod, mode);
            }
        }
    }

    private RecipeMap<?> getMultifunctionalRecipeMap(int meta) {
        switch (meta) {
            case 358 -> {
                return selectMode(Magnetic_Flux_Exhibitor, mode);
            }
            case 360 -> {
                return selectMode(TurboCan_Pro, mode);
            }
            case 792 -> {
                return selectMode(Industrial_Material_Press, mode);
            }
            case 829 -> {
                return ChaosZhuHaiRecipes.addChaosZhuHaiFisheryRecipes;
            }
            case 850 -> {
                return selectMode(Ore_Washing_Plant, mode);
            }
            case 862 -> {
                return selectMode(High_Current_Industrial_Arc_Furnace, mode);
            }
            case 942 -> {
                return selectMode(Amazon_Warehousing_Depot, mode);
            }
            case 992 -> {
                return selectMode(Industrial_Cutting_Factory, mode);
            }
            case 995 -> {
                return selectMode(Utupu_Tanuri, mode);
            }
            case 1132 -> {
                return ChaosOreRecipes.addFakeChaosOreRecipes;
            }
            case 3006 -> {
                return selectMode(Hot_Isostatic_Pressurization_Unit, mode);
            }
            case 3008 -> {
                return selectMode(Pseudostable_Black_Hole_Containment_Field, mode);
            }
            case 12735 -> {
                return selectMode(Circuit_Assembly_Line, mode);
            }
            case 13001 -> {
                return selectMode(Research_Completer, mode);
            }
            case 15415 -> {
                return selectMode(Heliofusion_Exoticizer, mode);
            }
            case 31021 -> {
                return selectMode(Dangote_Distillus, mode);
            }
            case 31050 -> {
                return selectMode(Elemental_Duplicator, mode);
            }
            case 31091 -> {
                return ChaosXtremeCraftingRecipes.addChaosXtremeCraftingRecipes;
            }
            case 31092 -> {
                return ChaosFallingTowerRecipes.addChaosFallingTowerRecipes;
            }
            case 31093 -> {
                return ChaosArcaneWorktableRecipes.addArcaneWorktableRecipes;
            }
            case 32018 -> {
                return selectMode(Precise_Auto_Assembler_MT_3662, mode);
            }
            case 32024 -> {
                return selectMode(Large_Essentia_Smeltery, mode);
            }
            case 32027 -> {
                return ChaosAntimatterRecipes.AntimatterRecipes;
            }
            default -> {
                return null;
            }
        }
    }

    @Override
    public RecipeMap<?> getRecipeMap() {
        return mLastRecipeMap;
    }

    @Override
    public @NotNull Collection<RecipeMap<?>> getAvailableRecipeMaps() {
        LinkedHashSet<RecipeMap<?>> maps = new LinkedHashSet<>(MachineRecipeCatalog.getChaosRecipeMaps());
        maps.addAll(ChaosManager.getAvailableRecipeMaps());
        for (IMetaTileEntity machine : METATILEENTITIES) {
            if (!(machine instanceof MTEMultiBlockBase multiblock) || !isSupportedMachine(machine)) continue;
            try {
                for (RecipeMap<?> recipeMap : multiblock.getAvailableRecipeMaps()) {
                    if (recipeMap != null) maps.add(replacementRecipeMap(recipeMap));
                }
            } catch (RuntimeException exception) {
                MyMod.LOG.warn("Cannot enumerate Chaos recipes for " + machine.getMetaName(), exception);
            }
        }
        return Collections.unmodifiableList(new ArrayList<>(maps));
    }

    private static RecipeMap<?> replacementRecipeMap(RecipeMap<?> recipeMap) {
        return recipeMap == RecipeMaps.assemblylineVisualRecipes ? AssemblyLineWithoutResearchRecipe : recipeMap;
    }

    private static boolean isSupportedMachine(IMetaTileEntity machine) {
        return machine != null && !(machine instanceof Chaos)
            && !(machine instanceof Origin)
            && !(machine instanceof Singularity);
    }

    @Override
    public boolean isCorrectMachinePart(ItemStack aStack) {
        return isSupportedMachine(ItemMachines.getMetaTileEntity(aStack));
    }

    @Override
    @NotNull
    public CheckRecipeResult checkProcessing() {
        refreshMachine();
        if (runtimeMachine != null) {
            try {
                return ChaosRuntimeBridge.checkProcessing(this, runtimeMachine, getMaxParallel());
            } catch (ReflectiveOperationException | RuntimeException exception) {
                MyMod.LOG.warn(
                    "Chaos runtime bridge failed for "
                        + (getControllerSlot() == null ? "unknown" : getControllerSlot().getDisplayName()),
                    exception);
                runtimeMachine = null;
            }
        }

        if (mLastRecipeMap == null) {
            return SimpleCheckRecipeResult.ofFailure("no_machine");
        }
        if (mLockedToSingleRecipe && mSingleRecipeCheck != null) {
            if (mSingleRecipeCheck.getRecipeMap() != mLastRecipeMap) {
                return SimpleCheckRecipeResult.ofFailure("machine_mismatch");
            }
        }

        if (mLastRecipeMap != null && wirelessMode && ownerUUID != null) {
            boolean succeeded = false;
            CheckRecipeResult finalResult = CheckRecipeResultRegistry.SUCCESSFUL;

            for (int i = 0; i < 32; i++) {
                CheckRecipeResult result = wirelessModeProcessingLogic();
                if (!result.wasSuccessful()) {
                    finalResult = result;
                    break;
                }
                succeeded = true;
            }

            updateSlots();
            if (!succeeded) return finalResult;

            mEfficiency = 10000;
            mEfficiencyIncrease = 10000;
            mMaxProgresstime = 128;
            mMaxProgresstime = scaleProcessingTime(mMaxProgresstime, getMaxParallel());

            return CheckRecipeResultRegistry.SUCCESSFUL;
        }
        CheckRecipeResult result = super.checkProcessing();
        if (result.wasSuccessful()) {
            mMaxProgresstime = scaleProcessingTime(mMaxProgresstime, getMaxParallel());
        }
        return result;
    }

    private static int scaleProcessingTime(int processingTime, int machineCount) {
        if (processingTime <= 1 || machineCount <= 1) {
            return Math.max(1, processingTime);
        }
        return (int) Math.max(1L, ((long) processingTime + machineCount - 1L) / machineCount);
    }

    @Override
    public boolean onRunningTick(ItemStack aStack) {
        boolean result = super.onRunningTick(aStack);
        if (!result || runtimeMachine == null || !ChaosRuntimeBridge.isCustomRunningTick(runtimeMachine)) {
            return result;
        }
        try {
            ChaosRuntimeBridge.syncToDelegate(this, runtimeMachine);
            boolean delegatedResult = ChaosRuntimeBridge.invokeCustomRunningTick(this, runtimeMachine, aStack);
            ChaosRuntimeBridge.syncFromDelegate(runtimeMachine, this);
            return delegatedResult && result;
        } catch (ReflectiveOperationException | RuntimeException exception) {
            MyMod.LOG.warn(
                "Chaos runtime tick bridge failed for " + (aStack == null ? "unknown" : aStack.getDisplayName()),
                exception);
            runtimeMachine = null;
            return result;
        }
    }

    @Override
    public void startRecipeProcessing() {
        isRecipeProcessing = true;
        super.startRecipeProcessing();
    }

    @Override
    public void endRecipeProcessing() {
        super.endRecipeProcessing();
        isRecipeProcessing = false;
    }

    protected void setupWirelessProcessingPowerLogic(ProcessingLogic logic) {
        // wireless mode ignore voltage limit
        logic.setAvailableVoltage(Long.MAX_VALUE);
        logic.setAvailableAmperage(1);
        logic.setAmperageOC(false);
    }

    public CheckRecipeResult wirelessModeProcessingLogic() {
        if (!isRecipeProcessing) startRecipeProcessing();
        setupProcessingLogic(processingLogic);
        setupWirelessProcessingPowerLogic(processingLogic);

        CheckRecipeResult result = doCheckRecipe();
        if (!result.wasSuccessful()) return result;

        costEU = BigInteger.valueOf(processingLogic.getCalculatedEut())
            .multiply(BigInteger.valueOf(processingLogic.getDuration()))
            .multiply(BigInteger.valueOf(getMaxParallel()))
            .divide(BigInteger.valueOf(Integer.MAX_VALUE));

        if (!addEUToGlobalEnergyMap(ownerUUID, costEU.multiply(BigInteger.valueOf(-1)))) {
            return CheckRecipeResultRegistry.insufficientStartupPower(costEU);
        }

        mOutputItems = ArrayUtils.addAll(mOutputItems, processingLogic.getOutputItems());
        mOutputFluids = ArrayUtils.addAll(mOutputFluids, processingLogic.getOutputFluids());

        endRecipeProcessing();
        return result;
    }

    @Override
    protected ProcessingLogic createProcessingLogic() {
        return new ProcessingLogic() {

            @Nonnull
            @Override
            protected CheckRecipeResult validateRecipe(@Nonnull GTRecipe recipe) {
                if (recipe.getMetadataOrDefault(CompressionTierKey.INSTANCE, 0) > 0) {
                    return CheckRecipeResultRegistry.NO_RECIPE;
                }
                if (getBaseMetaTileEntity() != null && GTMod.gregtechproxy.mLowGravProcessing
                    && recipe.mSpecialValue == -100
                    && !isValidForLowGravity(recipe, getBaseMetaTileEntity().getWorld().provider.dimensionId)) {
                    return SimpleCheckRecipeResult.ofFailure("high_gravity");
                }
                return CheckRecipeResultRegistry.SUCCESSFUL;
            }

            @NotNull
            @Override
            protected OverclockCalculator createOverclockCalculator(@Nonnull GTRecipe recipe) {
                if (wirelessMode) {
                    return OverclockCalculator.ofNoOverclock(recipe);
                } else {
                    return super.createOverclockCalculator(recipe).enablePerfectOC()
                        .setRecipeHeat(recipe.mSpecialValue)
                        .setMachineHeat(4 * recipe.mSpecialValue)
                        .setHeatOC(true)
                        .setHeatDiscount(true)
                        .setHeatDiscountMultiplier(0.95);
                }
            }
        }.setMaxParallelSupplier(this::getMaxParallel)
            .setEuModifier(0.5F);
    }

    @Override
    protected boolean canUseControllerSlotForRecipe() {
        return false;
    }

    @Override
    protected void setProcessingLogicPower(ProcessingLogic logic) {
        logic.setAvailableVoltage(
            (isMultiBlock ? getAverageInputVoltage() : GTValues.V[tTier])
                * (mLastRecipeMap != null ? mLastRecipeMap.getAmperage() : 1));
        logic.setAvailableAmperage(getMaxParallel());
        logic.setAmperageOC(true);
    }

    private void setMachineTier() {
        ItemStack controllerSlot = getControllerSlot();
        if (controllerSlot == null) {
            tTier = 0;
            return;
        }
        IMetaTileEntity aMachine = ItemMachines.getMetaTileEntity(controllerSlot);
        if (aMachine instanceof MTETieredMachineBlock) {
            tTier = ((MTETieredMachineBlock) aMachine).mTier;
        } else {
            tTier = 0;
        }
        if (downtierUEV && tTier > 9) {
            tTier--;
        }
    }

    @Override
    public void onPostTick(IGregTechTileEntity aBaseMetaTileEntity, long aTick) {
        super.onPostTick(aBaseMetaTileEntity, aTick);
        if (mMachine && aTick % 20 == 0) {
            for (MTEHatchInputBus tInputBus : mInputBusses) {
                tInputBus.mRecipeMap = mLastRecipeMap;
            }
            for (MTEHatchInput tInputHatch : mInputHatches) {
                tInputHatch.mRecipeMap = mLastRecipeMap;
            }
        }
    }

    @Override
    public boolean supportsInputSeparation() {
        return true;
    }

    @Override
    public boolean supportsBatchMode() {
        return true;
    }

    @Override
    public boolean supportsSingleRecipeLocking() {
        return true;
    }

    @Override
    public boolean supportsVoidProtection() {
        return true;
    }

    @Override
    protected boolean supportsSlotAutomation(int aSlot) {
        return aSlot == getControllerSlotIndex();
    }

    @Override
    protected boolean useMui2() {
        // Keep the MUI1 wireless and down-tier controls instead of GTNH 2.9's default MUI2.
        return false;
    }

    @Override
    public void addUIWidgets(ModularWindow.Builder builder, UIBuildContext buildContext) {
        super.addUIWidgets(builder, buildContext);

        builder.widget(new ButtonWidget().setOnClick((clickData, widget) -> {
            downtierUEV = !downtierUEV;
            setMachineTier();
        })
            .setPlayClickSound(true)
            .setBackground(() -> {
                if (downtierUEV) {
                    return new IDrawable[] { GTUITextures.BUTTON_STANDARD_PRESSED,
                        GTUITextures.OVERLAY_BUTTON_DOWN_TIERING_ON };
                } else {
                    return new IDrawable[] { GTUITextures.BUTTON_STANDARD,
                        GTUITextures.OVERLAY_BUTTON_DOWN_TIERING_OFF };
                }
            })
            .setPos(80, 91)
            .setSize(16, 16)
            .addTooltip(translateToLocal("GT5U.gui.button.down_tier"))
            .setTooltipShowUpDelay(TOOLTIP_DELAY))
            .widget(new FakeSyncWidget.BooleanSyncer(() -> downtierUEV, val -> downtierUEV = val));

        builder.widget(new ButtonWidget().setOnClick((clickData, widget) -> {
            wirelessMode = !wirelessMode;
            setMachineTier();
        })
            .setPlayClickSound(true)
            .setBackground(() -> {
                if (wirelessMode) {
                    return new IDrawable[] { GTUITextures.BUTTON_STANDARD_PRESSED,
                        GTNotHardUITextures.OVERLAY_BUTTON_WIRELESS_ON };
                } else {
                    return new IDrawable[] { GTUITextures.BUTTON_STANDARD,
                        GTNotHardUITextures.OVERLAY_BUTTON_WIRELESS_OFF };
                }
            })
            .setPos(98, 91)
            .setSize(16, 16)
            .addTooltip(translateToLocal("gtnothard.gui.wireless_mode"))
            .setTooltipShowUpDelay(TOOLTIP_DELAY))
            .widget(new FakeSyncWidget.BooleanSyncer(() -> wirelessMode, val -> wirelessMode = val));

        builder.widget(new ButtonWidget().setOnClick((clickData, widget) -> {
            if (!widget.isClient()) {
                switchMachineMode(buildContext.getPlayer());
            }
        })
            .setPlayClickSound(true)
            .setBackground(GTUITextures.BUTTON_STANDARD, GTUITextures.OVERLAY_BUTTON_MACHINEMODE_DEFAULT)
            .setPos(116, 91)
            .setSize(16, 16)
            .setEnabled(widget -> machineModeAvailable)
            .addTooltip(translateToLocal("GT5U.gui.button.mode_switch"))
            .dynamicTooltip(
                () -> machineModeName.isEmpty() ? Collections.emptyList() : Arrays.asList(machineModeName.split("\n")))
            .setUpdateTooltipEveryTick(true)
            .setTooltipShowUpDelay(TOOLTIP_DELAY))
            .widget(new FakeSyncWidget.BooleanSyncer(this::hasMachineModes, val -> machineModeAvailable = val))
            .widget(new FakeSyncWidget.StringSyncer(this::getSelectedMachineModeName, val -> machineModeName = val));
    }

    @Override
    public void getWailaNBTData(EntityPlayerMP player, TileEntity tile, NBTTagCompound tag, World world, int x, int y,
        int z) {
        super.getWailaNBTData(player, tile, tag, world, x, y, z);
        ItemStack controllerSlot = getControllerSlot();
        if ((mLastRecipeMap != null || runtimeMachine != null) && controllerSlot != null) {
            tag.setString("Machine", controllerSlot.getDisplayName());
            if (getSpecialMachine() && specialMachineType != null
                && !specialMachineType.trim()
                    .isEmpty()) {
                tag.setString("MachineType", specialMachineType);
            }
            if (wirelessMode) {
                DecimalFormat process = new DecimalFormat("#,###");
                tag.setString("EnergyConsume", process.format(costEU));
            }
        }
    }

    @Override
    public void getWailaBody(ItemStack itemStack, List<String> currentTip, IWailaDataAccessor accessor,
        IWailaConfigHandler config) {
        super.getWailaBody(itemStack, currentTip, accessor, config);
        final NBTTagCompound tag = accessor.getNBTData();
        if (tag.hasKey("Machine")) {
            currentTip.add(
                translateToLocalFormatted(
                    "gtnothard.waila.machine",
                    EnumChatFormatting.YELLOW + tag.getString("Machine")));
            if (tag.hasKey("MachineType")) {
                currentTip.add(
                    translateToLocalFormatted(
                        "gtnothard.waila.machine_type",
                        EnumChatFormatting.YELLOW + translateMode(tag.getString("MachineType"))));
            }
            currentTip.add(
                translateToLocalFormatted(
                    "gtnothard.waila.parallel",
                    EnumChatFormatting.YELLOW.toString() + getMaxParallel()));
            if (tag.hasKey("EnergyConsume")) {
                currentTip.add(
                    translateToLocalFormatted(
                        "gtnothard.waila.wireless",
                        EnumChatFormatting.GREEN + translateToLocal("gtnothard.state.enabled")));
                currentTip.add(
                    translateToLocalFormatted(
                        "gtnothard.waila.energy_consumed",
                        EnumChatFormatting.YELLOW + tag.getString("EnergyConsume")));
            } else {
                currentTip.add(
                    translateToLocalFormatted(
                        "gtnothard.waila.wireless",
                        EnumChatFormatting.RED + translateToLocal("gtnothard.state.disabled")));
            }
        } else {
            currentTip.add(
                translateToLocalFormatted(
                    "gtnothard.waila.machine",
                    EnumChatFormatting.YELLOW + translateToLocal("gtnothard.state.none")));
        }
    }
}
