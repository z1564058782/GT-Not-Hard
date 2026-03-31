package machines;

import static com.gtnewhorizon.structurelib.structure.StructureUtility.*;
import static gregtech.api.GregTechAPI.METATILEENTITIES;
import static gregtech.api.enums.HatchElement.*;
import static gregtech.api.enums.Textures.BlockIcons.*;
import static gregtech.api.metatileentity.BaseTileEntity.TOOLTIP_DELAY;
import static gregtech.api.metatileentity.implementations.MTEBasicMachine.isValidForLowGravity;
import static gregtech.api.util.GTStructureUtility.buildHatchAdder;
import static gregtech.common.misc.WirelessNetworkManager.addEUToGlobalEnergyMap;
import static gtPlusPlus.api.recipe.GTPPRecipeMaps.simpleWasherRecipes;
import static java.lang.Math.pow;
import static loader.ChaosRecipeLoader.AssemblyLineWithoutResearchRecipe;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Nonnull;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;

import com.google.common.collect.ImmutableList;
import com.gtnewhorizon.structurelib.alignment.constructable.ISurvivalConstructable;
import com.gtnewhorizon.structurelib.structure.IStructureDefinition;
import com.gtnewhorizon.structurelib.structure.ISurvivalBuildEnvironment;
import com.gtnewhorizon.structurelib.structure.StructureDefinition;
import com.gtnewhorizons.modularui.api.drawable.IDrawable;
import com.gtnewhorizons.modularui.api.screen.ModularWindow;
import com.gtnewhorizons.modularui.api.screen.UIBuildContext;
import com.gtnewhorizons.modularui.common.widget.ButtonWidget;
import com.gtnewhorizons.modularui.common.widget.FakeSyncWidget;

import Recipes.ChaosRecipes.ChaosAntimatterRecipes;
import Recipes.ChaosRecipes.ChaosCircuitAssemblerRecipes;
import Recipes.ChaosRecipes.ChaosExoticRecipes;
import Recipes.ChaosRecipes.ChaosFallingTowerRecipes;
import Recipes.ChaosRecipes.ChaosOreRecipes;
import Recipes.ChaosRecipes.ChaosReplicatorRecipes;
import Recipes.ChaosRecipes.ChaosXtremeCraftingRecipes;
import Recipes.ChaosRecipes.ChaosZhuHaiRecipes;
import goodgenerator.api.recipe.GoodGeneratorRecipeMaps;
import gregtech.GTMod;
import gregtech.api.GregTechAPI;
import gregtech.api.enums.GTValues;
import gregtech.api.gui.modularui.GTUITextures;
import gregtech.api.interfaces.IHatchElement;
import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.logic.ProcessingLogic;
import gregtech.api.metatileentity.MetaTileEntity;
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
import gtPlusPlus.api.recipe.GTPPRecipeMaps;
import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import util.ChaosManager;

public class Chaos extends MTEExtendedPowerMultiBlockBase<Chaos> implements ISurvivalConstructable {

    public Chaos(int aID, String aName, String aNameRegional) {
        super(aID, aName, aNameRegional);
    }

    public Chaos(String aName) {
        super(aName);
    }

    // 机器所有者UUID
    protected UUID ownerUUID;
    // 配方处理状态标志
    protected boolean isRecipeProcessing = false;
    // 无线模式标志
    protected boolean wirelessMode = false;
    // 无线电网消耗
    private BigInteger costEU = BigInteger.ZERO;

    // 上次使用的配方映射
    private RecipeMap<?> mLastRecipeMap;
    // 上次控制器槽位物品
    private ItemStack lastControllerStack;
    // 机器电压等级
    private int tTier = 0;
    // 降频倍数
    private int mMult = 0;
    // 机器模式
    private int mode = 0;
    private String specialMachineType = null;
    // 模式更新标志
    private boolean updateMode = false;
    // UEV降频开关
    private boolean downtierUEV = true;
    // 是否为多方块机器标志
    private boolean isMultiBlock = false;

    /**
     * 首次tick回调
     * 初始化机器所有者UUID和矿石处理配方
     */
    @Override
    public void onFirstTick(IGregTechTileEntity aBaseMetaTileEntity) {
        super.onFirstTick(aBaseMetaTileEntity);
        this.ownerUUID = aBaseMetaTileEntity.getOwnerUuid();
    }

    // === NBT数据保存 ===

    /**
     * 保存NBT数据
     * 保存机器状态到NBT标签
     */
    @Override
    public void saveNBTData(NBTTagCompound aNBT) {
        super.saveNBTData(aNBT);
        aNBT.setBoolean("wirelessMode", wirelessMode);
        aNBT.setBoolean("downtierUEV", downtierUEV);
        aNBT.setInteger("mode", mode);
        if (getSpecialMachine()) {
            aNBT.setString("MachineType", specialMachineType);
        }
    }

    /**
     * 加载NBT数据
     * 从NBT标签加载机器状态
     */
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
            specialMachineType = aNBT.getString("MachineType");
        }
        // 加载基本状态
        wirelessMode = aNBT.getBoolean("wirelessMode");
        downtierUEV = aNBT.getBoolean("downtierUEV");
        mode = aNBT.getInteger("mode");
    }

    // === 机器结构和纹理 ===

    // 机器外壳纹理索引
    private static final int mcasingIndex = getTextureIndex(
        getCasingTextureForId(GTUtility.getCasingTextureIndex(GregTechAPI.sBlockCasings4, 0)));

    // 定义机器结构
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
                .dot(1)
                .buildAndChain(onElementPass(Chaos::onCasingAdded, ofBlock(GregTechAPI.sBlockCasings4, 0))))
        .build();

    // 外壳数量计数器
    private int mCasingAmount;

    /**
     * 外壳添加回调
     * 统计外壳数量
     */
    private void onCasingAdded() {
        mCasingAmount++;
    }

    /**
     * 获取结构定义
     */
    @Override
    public IStructureDefinition<Chaos> getStructureDefinition() {
        return STRUCTURE_DEFINITION;
    }

    /**
     * 获取机器纹理
     */
    @Override
    public ITexture[] getTexture(IGregTechTileEntity aBaseMetaTileEntity, ForgeDirection side, ForgeDirection aFacing,
        int colorIndex, boolean aActive, boolean redstoneLevel) {
        if (side == aFacing) {
            if (aActive) {
                // 激活状态纹理
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
            // 非激活状态纹理
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
        // 侧面纹理
        return new ITexture[] { casingTexturePages[0][mcasingIndex] };
    }

    /**
     * 创建工具提示
     */
    @Override
    public MultiblockTooltipBuilder createTooltip() {
        final MultiblockTooltipBuilder tt = new MultiblockTooltipBuilder();
        tt.addMachineType("Chaos")
            .addInfo("Runs supplied machines as if placed in the world")
            .addInfo("Parallel quantity = 2^x")
            .addInfo("x = Number of machines in the controller")
            .addInfo("-------------------------------------------------------------------------")
            .addInfo("If x > 16 the machine will force the wireless mode to be turned on")
            .addInfo("In wireless mode, the formula run time will be fixed as follows 128 ticks")
            .addInfo("and energy consume from wireless network rather than energy hatch")
            .addInfo("-------------------------------------------------------------------------")
            .addInfo("If the machine within the controller contains multiple modes, ")
            .addInfo("sneak left click controller to switch machine mode")
            .addInfo("-------------------------------------------------------------------------")
            .addInfo("Use Auto Workbench (LV) to crafting Xtreme Crafting recipe")
            .addInfo("Use Auto Workbench (MV) to crafting Falling Tower recipe")
            .addInfo("-------------------------------------------------------------------------")
            .addInfo("Add By: GT Not Hard")
            .beginStructureBlock(3, 3, 3, true)
            .addController("Front center")
            .addCasingInfoRange("Robust Tungstensteel Machine Casing", 4, 24, false)
            .addEnergyHatch("Any casing", 1)
            .addMaintenanceHatch("Any casing", 1)
            .addInputBus("Any casing", 1)
            .addInputHatch("Any casing", 1)
            .addOutputBus("Any casing", 1)
            .addOutputHatch("Any casing", 1)
            .toolTipFinisher();
        return tt;
    }

    /**
     * 创造模式自动搭建
     */
    @Override
    public void construct(ItemStack aStack, boolean aHintsOnly) {
        buildPiece(STRUCTURE_PIECE_MAIN, aStack, aHintsOnly, 1, 1, 0);
    }

    /**
     * 生存模式自动搭建
     */
    @Override
    public int survivalConstruct(ItemStack stackSize, int elementBudget, ISurvivalBuildEnvironment env) {
        if (mMachine) {
            return -1;
        }
        return survivialBuildPiece(STRUCTURE_PIECE_MAIN, stackSize, 1, 1, 0, elementBudget, env, false, true);
    }

    /**
     * 检查机器结构
     */
    @Override
    public boolean checkMachine(IGregTechTileEntity aBaseMetaTileEntity, ItemStack aStack) {
        mEnergyHatches.clear();
        mExoticEnergyHatches.clear();
        mCasingAmount = 0;
        return checkPiece(STRUCTURE_PIECE_MAIN, 1, 1, 0) && mCasingAmount >= 4 && checkHatches();
    }

    /**
     * 检查仓室
     * 确保有且仅有一个维护仓
     */
    private boolean checkHatches() {
        return mMaintenanceHatches.size() == 1;
    }

    /**
     * 创建新的元实体实例
     */
    @Override
    public IMetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
        return new Chaos(this.mName);
    }

    // === 机器属性和设置 ===

    /**
     * 获取最大效率
     */
    @Override
    public int getMaxEfficiency(ItemStack aStack) {
        return 10000;
    }

    /**
     * 获取组件损坏值
     */
    @Override
    public int getDamageToComponent(ItemStack aStack) {
        return 0;
    }

    /**
     * 检查组件损坏时是否爆炸
     */
    @Override
    public boolean explodesOnComponentBreak(ItemStack aStack) {
        return false;
    }

    /**
     * 获取允许的仓室类型列表
     */
    private List<IHatchElement<? super Chaos>> getAllowedHatches() {
        return ImmutableList.of(InputHatch, OutputHatch, InputBus, OutputBus, Maintenance, Energy, ExoticEnergy);
    }

    // === 并行计算 ===

    /**
     * 计算最大并行数
     * 基于控制器槽位中的机器数量计算：2^(机器数量)
     */
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

    // === 配方映射处理 ===

    /**
     * 读取通常大机器配方
     * 根据控制器槽位物品获取对应的配方映射
     */
    private RecipeMap<?> fetchRecipeMap() {
        if (isCorrectMachinePart(getControllerSlot())) {
            getControllerSlot().getItemDamage();
            RecipeMap<?> RecipeMap = getMultifunctionalRecipeMap(getControllerSlot().getItemDamage());
            if (RecipeMap != null) {
                isMultiBlock = true;
                return RecipeMap;
            }
            MetaTileEntity e = (MetaTileEntity) METATILEENTITIES[getControllerSlot().getItemDamage()];
            if (e instanceof MTEMultiBlockBase mteMultiBlockBase) {
                isMultiBlock = true;
                RecipeMap = mteMultiBlockBase.getRecipeMap();
                return RecipeMap == RecipeMaps.assemblylineVisualRecipes ? AssemblyLineWithoutResearchRecipe
                    : RecipeMap;
            }
            isMultiBlock = false;
            return ChaosManager.giveRecipeMap(ChaosManager.getMachineName(getControllerSlot()));
        }
        return null;
    }

    // === 多类型机器配方列表 ===
    private static final Integer[] specialMachine = { 358, 360, 792, 850, 862, 942, 992, 995, 3008, 12735, 15415, 31021,
        31050, 32018 };

    private boolean getSpecialMachine() {
        Integer machineID = getControllerSlot().getItemDamage();
        List<Integer> specialMachineList = Arrays.asList(specialMachine);
        return specialMachineList.contains(machineID);
    }

    // 磁通量效应监视器-358
    private static final String[] Magnetic_Flux_Exhibitor_mod = { "Polarizer", "Electromagnetic Separator" };
    private static final RecipeMap<?>[] Magnetic_Flux_Exhibitor = { RecipeMaps.polarizerRecipes,
        RecipeMaps.electroMagneticSeparatorRecipes };
    // 涡轮装罐机Pro-360
    private static final String[] TurboCan_Pro_mod = { "Fluid Canner", "Canner" };
    private static final RecipeMap<?>[] TurboCan_Pro = { RecipeMaps.fluidCannerRecipes, RecipeMaps.cannerRecipes };
    // 工业辊压机-792
    private static final String[] Industrial_Material_Press_mod = { "Forming Press", "Bending Machine" };
    private static final RecipeMap<?>[] Industrial_Material_Press = { RecipeMaps.formingPressRecipes,
        RecipeMaps.benderRecipes };
    // 工业洗矿厂-850
    private static final String[] Ore_Washing_Plant_mod = { "Ore Washer", "Simple Washer", "Chemical Bath" };
    private static final RecipeMap<?>[] Ore_Washing_Plant = { RecipeMaps.oreWasherRecipes, simpleWasherRecipes,
        RecipeMaps.chemicalBathRecipes };
    // 工业电弧炉-862
    private static final String[] High_Current_Industrial_Arc_Furnace_mod = { "Electric Arc Furnace",
        "Plasma Arc Furnace" };
    private static final RecipeMap<?>[] High_Current_Industrial_Arc_Furnace = { RecipeMaps.arcFurnaceRecipes,
        RecipeMaps.plasmaArcFurnaceRecipes };
    // 亚马逊仓库-942
    private static final String[] Amazon_Warehousing_Depot_mod = { "Packager", "Unpackeager" };
    private static final RecipeMap<?>[] Amazon_Warehousing_Depot = { RecipeMaps.packagerRecipes,
        RecipeMaps.unpackagerRecipes };
    // 工业切割机-992
    private static final String[] Industrial_Cutting_Factory_mod = { "Cutting", "Slicing" };
    private static final RecipeMap<?>[] Industrial_Cutting_Factory = { RecipeMaps.cutterRecipes,
        RecipeMaps.slicerRecipes };
    // 真空干燥炉-995
    private static final String[] Utupu_Tanuri_mod = { "Dehydrator", "Vacuum Furnace" };
    private static final RecipeMap<?>[] Utupu_Tanuri = { GTPPRecipeMaps.chemicalDehydratorNonCellRecipes,
        GTPPRecipeMaps.vacuumFurnaceRecipes };
    // 黑洞压缩机-3008
    private static final String[] Pseudostable_Black_Hole_Containment_Field_mod = { "Compressor",
        "Advanced Neutronium Compressor" };
    private static final RecipeMap<?>[] Pseudostable_Black_Hole_Containment_Field = { RecipeMaps.compressorRecipes,
        RecipeMaps.neutroniumCompressorRecipes };
    // 电路装配线-12735
    private static final String[] Circuit_Assembly_Line_mod = { "Circuit Assembly Line", "Circuit Assembly" };
    private static final RecipeMap<?>[] Circuit_Assembly_Line = {
        ChaosCircuitAssemblerRecipes.addChaosCircuitAssemblerRecipes, RecipeMaps.circuitAssemblerRecipes };
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

    // === 用户交互 ===

    /**
     * 左键点击处理
     * 潜行左键切换机器模式
     */
    @Override
    public void onLeftclick(IGregTechTileEntity aBaseMetaTileEntity, EntityPlayer aPlayer) {
        if (getBaseMetaTileEntity() != null && aPlayer.isSneaking() && getBaseMetaTileEntity().isServerSide()) {
            // 机器模式切换
            this.mode = (this.mode + 1) % 3;
            updateMode = true;
            // 根据机器ID显示对应的模式名称
            switch (getControllerSlot().getItemDamage()) {
                case 358 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + Magnetic_Flux_Exhibitor_mod[Math.min(mode, 1)]);
                    specialMachineType = Magnetic_Flux_Exhibitor_mod[Math.min(mode, 1)];
                }
                case 360 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + TurboCan_Pro_mod[Math.min(mode, 1)]);
                    specialMachineType = TurboCan_Pro_mod[Math.min(mode, 1)];
                }
                case 792 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + Industrial_Material_Press_mod[Math.min(mode, 1)]);
                    specialMachineType = Industrial_Material_Press_mod[Math.min(mode, 1)];
                }
                case 850 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + Ore_Washing_Plant_mod[Math.min(mode, 2)]);
                    specialMachineType = Ore_Washing_Plant_mod[Math.min(mode, 2)];
                }
                case 862 -> {
                    GTUtility.sendChatToPlayer(
                        aPlayer,
                        "mode:" + High_Current_Industrial_Arc_Furnace_mod[Math.min(mode, 1)]);
                    specialMachineType = High_Current_Industrial_Arc_Furnace_mod[Math.min(mode, 1)];
                }
                case 942 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + Amazon_Warehousing_Depot_mod[Math.min(mode, 1)]);
                    specialMachineType = Amazon_Warehousing_Depot_mod[Math.min(mode, 1)];
                }
                case 992 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + Industrial_Cutting_Factory_mod[Math.min(mode, 1)]);
                    specialMachineType = Industrial_Cutting_Factory_mod[Math.min(mode, 1)];
                }
                case 995 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + Utupu_Tanuri_mod[Math.min(mode, 1)]);
                    specialMachineType = Utupu_Tanuri_mod[Math.min(mode, 1)];
                }
                case 3008 -> {
                    GTUtility.sendChatToPlayer(
                        aPlayer,
                        "mode:" + Pseudostable_Black_Hole_Containment_Field_mod[Math.min(mode, 1)]);
                    specialMachineType = Pseudostable_Black_Hole_Containment_Field_mod[Math.min(mode, 1)];
                }
                case 12735 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + Circuit_Assembly_Line_mod[Math.min(mode, 1)]);
                    specialMachineType = Circuit_Assembly_Line_mod[Math.min(mode, 1)];
                }
                case 15415 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + Heliofusion_Exoticizer_mod[Math.min(mode, 1)]);
                    specialMachineType = Heliofusion_Exoticizer_mod[Math.min(mode, 1)];
                }
                case 31021 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + Dangote_Distillus_mod[Math.min(mode, 1)]);
                    specialMachineType = Dangote_Distillus_mod[Math.min(mode, 1)];
                }
                case 31050 -> {
                    GTUtility.sendChatToPlayer(aPlayer, "mode:" + Elemental_Duplicator_mod[Math.min(mode, 1)]);
                    specialMachineType = Elemental_Duplicator_mod[Math.min(mode, 1)];
                }
                case 32018 -> {
                    GTUtility
                        .sendChatToPlayer(aPlayer, "mode:" + Precise_Auto_Assembler_MT_3662_mod[Math.min(mode, 1)]);
                    specialMachineType = Precise_Auto_Assembler_MT_3662_mod[Math.min(mode, 1)];
                }
            }
        }
        super.onLeftclick(aBaseMetaTileEntity, aPlayer);
    }

    /**
     * 读取多类型机器的配方
     * 根据机器ID和当前模式获取对应的配方映射
     */
    private RecipeMap<?> getMultifunctionalRecipeMap(int meta) {
        switch (meta) {
            case 358 -> {
                return Magnetic_Flux_Exhibitor[Math.min(mode, 1)];
            }
            case 360 -> {
                return TurboCan_Pro[Math.min(mode, 1)];
            }
            case 792 -> {
                return Industrial_Material_Press[Math.min(mode, 1)];
            }
            case 829 -> {
                return ChaosZhuHaiRecipes.addChaosZhuHaiFisheryRecipes;
            }
            case 850 -> {
                return Ore_Washing_Plant[Math.min(mode, 2)];
            }
            case 862 -> {
                return High_Current_Industrial_Arc_Furnace[Math.min(mode, 1)];
            }
            case 942 -> {
                return Amazon_Warehousing_Depot[Math.min(mode, 1)];
            }
            case 992 -> {
                return Industrial_Cutting_Factory[Math.min(mode, 1)];
            }
            case 995 -> {
                return Utupu_Tanuri[Math.min(mode, 1)];
            }
            case 1132 -> {
                return ChaosOreRecipes.addFakeChaosOreRecipes;
            }
            case 3008 -> {
                return Pseudostable_Black_Hole_Containment_Field[Math.min(mode, 1)];
            }
            case 12735 -> {
                return Circuit_Assembly_Line[Math.min(mode, 1)];
            }
            case 15415 -> {
                return Heliofusion_Exoticizer[Math.min(mode, 1)];
            }
            case 31021 -> {
                return Dangote_Distillus[Math.min(mode, 1)];
            }
            case 31050 -> {
                return Elemental_Duplicator[Math.min(mode, 1)];
            }
            case 31091 -> {
                return ChaosXtremeCraftingRecipes.addChaosXtremeCraftingRecipes;
            }
            case 31092 -> {
                return ChaosFallingTowerRecipes.addChaosFallingTowerRecipes;
            }
            case 32018 -> {
                return Precise_Auto_Assembler_MT_3662[Math.min(mode, 1)];
            }
            case 32027 -> {
                return ChaosAntimatterRecipes.AntimatterRecipes;
            }
            default -> {
                return null;
            }
        }
    }

    /**
     * 获取当前配方映射
     */
    @Override
    public RecipeMap<?> getRecipeMap() {
        return mLastRecipeMap;
    }

    /**
     * 检查是否为正确的机器部件
     * 检查物品是否是GT机器方块
     */
    @Override
    public boolean isCorrectMachinePart(ItemStack aStack) {
        return aStack != null && aStack.getUnlocalizedName()
            .startsWith("gt.blockmachines.");
    }

    // === 配方处理主逻辑 ===

    /**
     * 检查并处理配方
     * 主配方处理入口
     */
    @Override
    @NotNull
    public CheckRecipeResult checkProcessing() {
        if (!GTUtility.areStacksEqual(lastControllerStack, getControllerSlot()) || updateMode) {
            if (updateMode) updateMode = false;
            // controller slot has changed
            lastControllerStack = getControllerSlot();
            mLastRecipeMap = fetchRecipeMap();
            setTierAndMult();
        }
        if (mLastRecipeMap == null) {
            return SimpleCheckRecipeResult.ofFailure("no_machine");
        }
        if (mLockedToSingleRecipe && mSingleRecipeCheck != null) {
            if (mSingleRecipeCheck.getRecipeMap() != mLastRecipeMap) {
                return SimpleCheckRecipeResult.ofFailure("machine_mismatch");
            }
        }

        // 控制方块中机器数量大于16自动开启无线电网模式
        wirelessMode = getControllerSlot().stackSize > 16;
        if (mLastRecipeMap != null && wirelessMode && ownerUUID != null) {
            boolean succeeded = false;
            CheckRecipeResult finalResult = CheckRecipeResultRegistry.SUCCESSFUL;

            for (int i = 0; i < 1024; i++) {
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

            return CheckRecipeResultRegistry.SUCCESSFUL;
        }
        return super.checkProcessing();
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

    // 设定无线模式配方耗电
    protected void setupWirelessProcessingPowerLogic(ProcessingLogic logic) {
        // wireless mode ignore voltage limit
        logic.setAvailableVoltage(Long.MAX_VALUE);
        logic.setAvailableAmperage(1);
        logic.setAmperageOC(false);
    }

    // 无线模式逻辑
    public CheckRecipeResult wirelessModeProcessingLogic() {
        if (!isRecipeProcessing) startRecipeProcessing();
        setupProcessingLogic(processingLogic);
        setupWirelessProcessingPowerLogic(processingLogic);

        CheckRecipeResult result = doCheckRecipe();
        if (!result.wasSuccessful()) return result;

        costEU = BigInteger.valueOf(processingLogic.getCalculatedEut())
            .multiply(BigInteger.valueOf(processingLogic.getDuration()))
            .multiply(BigInteger.valueOf(getMaxParallel()))
            .divide(BigInteger.valueOf(1_000_000));

        if (!addEUToGlobalEnergyMap(ownerUUID, costEU.multiply(BigInteger.valueOf(-1)))) {
            return CheckRecipeResultRegistry.insufficientStartupPower(costEU);
        }

        mOutputItems = ArrayUtils.addAll(mOutputItems, processingLogic.getOutputItems());
        mOutputFluids = ArrayUtils.addAll(mOutputFluids, processingLogic.getOutputFluids());

        endRecipeProcessing();
        return result;
    }

    // 机器运行逻辑
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

            // 超频设计
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

    // 判断小机器等级或大机器电压等级
    @Override
    protected void setProcessingLogicPower(ProcessingLogic logic) {
        logic.setAvailableVoltage(
            (isMultiBlock ? getAverageInputVoltage() : GTValues.V[tTier])
                * (mLastRecipeMap != null ? mLastRecipeMap.getAmperage() : 1));
        logic.setAvailableAmperage(getMaxParallel());
        logic.setAmperageOC(true);
    }

    // 运行时电压等级与无损降频
    private void setTierAndMult() {
        IMetaTileEntity aMachine = ItemMachines.getMetaTileEntity(getControllerSlot());
        if (aMachine instanceof MTETieredMachineBlock) {
            tTier = ((MTETieredMachineBlock) aMachine).mTier;
        } else {
            tTier = 0;
        }
        mMult = 0;
        if (downtierUEV && tTier > 9) {
            // Lowers down the tier by 1 to allow for bigger parallel
            tTier--;
            // Multiplies Parallels by 4x, keeping the energy cost
            mMult = 2;
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
    public void addUIWidgets(ModularWindow.Builder builder, UIBuildContext buildContext) {
        super.addUIWidgets(builder, buildContext);

        builder.widget(new ButtonWidget().setOnClick((clickData, widget) -> {
            downtierUEV = !downtierUEV;
            setTierAndMult();
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
            .addTooltip(StatCollector.translateToLocal("GT5U.gui.button.down_tier"))
            .setTooltipShowUpDelay(TOOLTIP_DELAY))
            .widget(new FakeSyncWidget.BooleanSyncer(() -> downtierUEV, val -> downtierUEV = val));
    }

    @Override
    public void getWailaNBTData(EntityPlayerMP player, TileEntity tile, NBTTagCompound tag, World world, int x, int y,
        int z) {
        super.getWailaNBTData(player, tile, tag, world, x, y, z);
        if (mLastRecipeMap != null && getControllerSlot() != null) {
            tag.setString("Machine", getControllerSlot().getDisplayName());
            if (getSpecialMachine()) {
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
            currentTip.add("Machine: " + EnumChatFormatting.YELLOW + tag.getString("Machine"));
            if (tag.hasKey("MachineType")) {
                currentTip.add("Machine type: " + EnumChatFormatting.YELLOW + tag.getString("MachineType"));
            }
            currentTip.add("Parallel: " + EnumChatFormatting.YELLOW + getMaxParallel());
            if (tag.hasKey("EnergyConsume")) {
                currentTip.add("WirelessMode: " + EnumChatFormatting.GREEN + "True");
                currentTip.add("Energy consume: " + EnumChatFormatting.YELLOW + tag.getString("EnergyConsume"));
            } else {
                currentTip.add("WirelessMode: " + EnumChatFormatting.RED + "False");
            }
        } else {
            currentTip.add("Machine: " + EnumChatFormatting.YELLOW + "None");
        }
    }
}
