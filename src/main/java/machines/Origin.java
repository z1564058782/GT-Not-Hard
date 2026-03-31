package machines;

import static com.gtnewhorizon.structurelib.structure.StructureUtility.ofBlock;
import static com.gtnewhorizon.structurelib.structure.StructureUtility.onElementPass;
import static com.gtnewhorizon.structurelib.structure.StructureUtility.transpose;
import static gregtech.api.enums.HatchElement.Dynamo;
import static gregtech.api.enums.HatchElement.InputBus;
import static gregtech.api.enums.HatchElement.InputHatch;
import static gregtech.api.enums.HatchElement.Maintenance;
import static gregtech.api.enums.HatchElement.OutputBus;
import static gregtech.api.enums.HatchElement.OutputHatch;
import static gregtech.api.enums.Textures.BlockIcons.OVERLAY_FRONT_ORE_FACTORY;
import static gregtech.api.enums.Textures.BlockIcons.OVERLAY_FRONT_ORE_FACTORY_ACTIVE;
import static gregtech.api.enums.Textures.BlockIcons.OVERLAY_FRONT_ORE_FACTORY_ACTIVE_GLOW;
import static gregtech.api.enums.Textures.BlockIcons.OVERLAY_FRONT_ORE_FACTORY_GLOW;
import static gregtech.api.enums.Textures.BlockIcons.casingTexturePages;
import static gregtech.api.util.GTStructureUtility.buildHatchAdder;
import static gregtech.api.util.GTUtility.validMTEList;
import static gregtech.common.misc.WirelessNetworkManager.addEUToGlobalEnergyMap;
import static gtPlusPlus.xmod.gregtech.api.metatileentity.implementations.base.GTPPMultiBlockBase.GTPPHatchElement.TTDynamo;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
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

import org.jetbrains.annotations.NotNull;

import com.gtnewhorizon.structurelib.alignment.constructable.ISurvivalConstructable;
import com.gtnewhorizon.structurelib.structure.IStructureDefinition;
import com.gtnewhorizon.structurelib.structure.ISurvivalBuildEnvironment;
import com.gtnewhorizon.structurelib.structure.StructureDefinition;

import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Acid;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Combustion;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Gas;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Magic;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Naquadah;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Nuclear;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Plasma;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Rocket;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Semifluid;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Solar;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Steam;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_UCFE;
import Recipes.OriginGeneratorRecipes.OriginGeneratorRecipes_Water;
import gregtech.api.GregTechAPI;
import gregtech.api.enums.Textures;
import gregtech.api.interfaces.ISecondaryDescribable;
import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.logic.ProcessingLogic;
import gregtech.api.metatileentity.implementations.MTEHatch;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.check.CheckRecipeResult;
import gregtech.api.recipe.check.CheckRecipeResultRegistry;
import gregtech.api.render.TextureFactory;
import gregtech.api.util.GTRecipe;
import gregtech.api.util.GTUtility;
import gregtech.api.util.MultiblockTooltipBuilder;
import gregtech.api.util.shutdown.ShutDownReasonRegistry;
import gtPlusPlus.xmod.gregtech.api.metatileentity.implementations.base.GTPPMultiBlockBase;
import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;

public class Origin extends GTPPMultiBlockBase<Origin> implements ISurvivalConstructable, ISecondaryDescribable {

    public Origin(int aID, String aName, String aNameRegional) {
        super(aID, aName, aNameRegional);
    }

    public Origin(String aName) {
        super(aName);
    }

    // 保存NBT数据
    @Override
    public void saveNBTData(NBTTagCompound aNBT) {
        super.saveNBTData(aNBT);
        aNBT.setBoolean("wireless_mode", wireless_mode);
    }

    // 加载NBT数据
    @Override
    public void loadNBTData(NBTTagCompound aNBT) {
        super.loadNBTData(aNBT);
        wireless_mode = aNBT.getBoolean("wireless_mode");
    }

    private static final int mcasingIndex = Textures.BlockIcons.getTextureIndex(
        Textures.BlockIcons.getCasingTextureForId(GTUtility.getCasingTextureIndex(GregTechAPI.sBlockCasings4, 1)));

    // 定义机器结构
    private static final String STRUCTURE_PIECE_MAIN = "main";
    private static final IStructureDefinition<Origin> STRUCTURE_DEFINITION = StructureDefinition.<Origin>builder()
        .addShape(
            STRUCTURE_PIECE_MAIN,
            transpose(new String[][] { { "hhh", "hhh", "hhh" }, { "h~h", "h-h", "hhh" }, { "hhh", "hhh", "hhh" } }))
        .addElement(
            'h',
            buildHatchAdder(Origin.class)
                .atLeast(InputBus, OutputBus, InputHatch, OutputHatch, Maintenance, Dynamo.or(TTDynamo))
                .casingIndex(mcasingIndex)
                .dot(1)
                .buildAndChain(onElementPass(Origin::onCasingAdded, ofBlock(GregTechAPI.sBlockCasings4, 1))))
        .build();

    private int mCasingAmount;

    private void onCasingAdded() {
        mCasingAmount++;
    }

    @Override
    public IStructureDefinition<Origin> getStructureDefinition() {
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

    // 主机ToolTips
    @Override
    protected MultiblockTooltipBuilder createTooltip() {
        final MultiblockTooltipBuilder tt = new MultiblockTooltipBuilder();
        tt.addMachineType("Origin")
            .addInfo("Runs supplied machines as if placed in the world")
            .addInfo("Parallel quantity = 2^x")
            .addInfo("x = Number of machines in the controller")
            .addInfo("----------------------------------------------------------------")
            .addInfo("If x > 8 can use wireless mode with sneak left click controller")
            .addInfo("Energy will consume in wireless network rather than dynamo hatch")
            .addInfo("----------------------------------------------------------------")
            .addInfo("Add By: GT Not Hard")
            .beginStructureBlock(3, 3, 3, true)
            .addController("Front center")
            .addCasingInfoRange("Clean Stainless Steel Machine Casing", 4, 24, false)
            .addDynamoHatch("Any casing", 1)
            .addMaintenanceHatch("Any casing", 1)
            .addInputHatch("Any casing", 1)
            .addInputBus("Any casing", 1)
            .addOutputHatch("Any casing", 1)
            .addOutputBus("Any casing", 1)
            .toolTipFinisher();
        return tt;
    }

    // 创造自动搭建
    @Override
    public void construct(ItemStack aStack, boolean aHintsOnly) {
        buildPiece(STRUCTURE_PIECE_MAIN, aStack, aHintsOnly, 1, 1, 0);
    }

    // 生存自动搭建
    @Override
    public int survivalConstruct(ItemStack stackSize, int elementBudget, ISurvivalBuildEnvironment env) {
        if (mMachine) {
            return -1;
        }
        return survivialBuildPiece(STRUCTURE_PIECE_MAIN, stackSize, 1, 1, 0, elementBudget, env, false, true);
    }

    // 检查机器结构
    @Override
    public boolean checkMachine(IGregTechTileEntity aBaseMetaTileEntity, ItemStack aStack) {
        this.mDynamoHatches.clear();
        this.mTecTechDynamoHatches.clear();
        mCasingAmount = 0;
        return checkPiece(STRUCTURE_PIECE_MAIN, 1, 1, 0) && mCasingAmount >= 4 && checkHatches();
    }

    // 检查仓室
    private boolean checkHatches() {
        return mMaintenanceHatches.size() == 1;
    }

    @Override
    public IMetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
        return new Origin(this.mName);
    }

    // 设定机器最大效率
    @Override
    public int getMaxEfficiency(ItemStack aStack) {
        return 0;
    }

    @Override
    public boolean explodesOnComponentBreak(ItemStack aStack) {
        return false;
    }

    // 获取机器类型
    @Override
    public String getMachineType() {
        return "Origin";
    }

    // 获取最大并行数
    @Override
    public int getMaxParallelRecipes() {
        if (getControllerSlot() == null) {
            return 1;
        }
        if (getControllerSlot().stackSize < 31) {
            return (int) Math.pow(2, getControllerSlot().stackSize);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    private static final long LV_Tier = 32;
    private static final long MV_Tier = 128;
    private static final long HV_Tier = 512;
    private static final long EV_Tier = 2_048;
    private static final long IV_Tier = 8_192;
    private static final long LuV_Tier = 32_768;
    private static final long ZPM_Tier = 131_072;
    private static final long UV_Tier = 524_288;
    private static final long UHV_Tier = 2_097_152;
    private static final long UEV_Tier = 8_388_608;
    private static final long UIV_Tier = 33_554_432;
    private static final long UMV_Tier = 134_217_728;
    private static final long UXV_Tier = 536_870_912;
    private static final long MAX_Tier = 2_147_483_640;

    // 根据发电机等级设定发电机基础输出
    @Override
    protected void setEnergyUsage(ProcessingLogic processingLogic) {
        int generatorId = getControllerSlot().getItemDamage();
        if (getControllerSlot().getItem() != null) {
            switch (generatorId) {
                // "Advanced Boiler [LV]" - 753
                // "Basic Semifluid Generator" - 837
                // "Basic Combustion Generator" - 1110
                // "Basic Gas Turbine" - 1115
                // "Basic Steam Turbine" - 1120
                // "Novice Magic Energy Converter" - 1123
                // "Basic Solar Panel" - 2733
                // "Acid Generator LV" - 12793
                // "Solar Panel (LV)" - 32752
                case 753, 837, 1110, 1115, 1120, 1123, 2733, 12793, 32752 -> lEUt = -processingLogic.getCalculatedEut()
                    * LV_Tier;

                // "Advanced Boiler [MV]" - 754
                // "Advanced Semifluid Generator" - 838
                // "Advanced Combustion Generator" - 1111
                // "Advanced Gas Turbine" - 1116
                // "Advanced Steam Turbine" - 1121
                // "Adept Magic Energy Converter" - 1124
                // "Advanced Solar Panel" - 2734
                // "Acid Generator MV" - 12726
                // "Hydro Turbine (MV)" - 17019
                // "Solar Panel (MV)" - 32753
                case 754, 838, 1111, 1116, 1121, 1124, 2734, 12726, 17019, 32753 -> lEUt = -processingLogic
                    .getCalculatedEut() * MV_Tier;

                // "Advanced Boiler [HV]" - 755
                // "Turbo Semifluid Generator" - 839
                // "Turbo Combustion Generator" - 1112
                // "Turbo Gas Turbine" - 1117
                // "Turbo Steam Turbine" - 1122
                // "Master Magic Energy Converter" - 1125
                // "Advanced Solar Panel II" - 2735
                // "Acid Generator HV" - 12727
                // "Hydro Turbine (HV)" - 17020
                // "Solar Panel (HV)" - 32754
                case 755, 839, 1112, 1117, 1122, 1125, 2735, 12727, 17020, 32754 -> lEUt = -processingLogic
                    .getCalculatedEut() * HV_Tier;

                // "Basic Rocket Engine" - 793
                // "Turbo Semifluid Generator II" - 993
                // "Turbo Supercharging Combustion Generator" - 1113
                // "Turbo Gas Turbine II" - 1118
                // "Novice Magic Energy Absorber" - 1127
                // "Naquadah Reactor Mark I" - 1190
                // "Plasma Generator Mark I" - 1196
                // "Advanced Solar Panel III" - 2736
                // "Acid Generator EV" - 12728
                // "Hydro Turbine (EV)" - 17021
                // "Solar Panel (EV)" - 32755
                case 793, 993, 1113, 1118, 1127, 1190, 1196, 2736, 12728, 17021, 32755 -> lEUt = -processingLogic
                    .getCalculatedEut() * EV_Tier;

                // "Nuclear Reactor" - 5
                // "Advanced Rocket Engine" - 794
                // "Turbo Semifluid Generator III" - 994
                // "Ultimate Chemical Energy Releaser" - 1114
                // "Turbo Gas Turbine III" - 1119
                // "Adept Magic Energy Absorber" - 1128
                // "Large Steam Turbine" - 1131
                // "Large HP Steam Turbine" - 1152
                // "Naquadah Reactor Mark II" - 1191
                // "Plasma Generator Mark II" - 1197
                // "Advanced Solar Panel IV" - 2737
                // "Hydro Turbine (IV)" - 17022
                // "Large Supercritical Steam Turbine" - 32016
                // "Solar Panel (IV)" - 32756
                case 5, 794, 994, 1114, 1119, 1128, 1131, 1152, 1191, 1197, 2737, 17022, 32016, 32756 -> lEUt = -processingLogic
                    .getCalculatedEut() * IV_Tier;

                // "Turbo Rocket Engine" - 795
                // "Master Magic Energy Absorber" - 1129
                // "Naquadah Reactor Mark III" - 1192
                // "Plasma Generator Mark III" - 1198
                // "Elite Solar Panel" - 2738
                // "Hydro Turbine (LuV)" - 17023
                // "Solar Panel (LuV)" - 32757
                case 795, 1129, 1192, 1198, 2738, 17023, 32757 -> lEUt = -processingLogic.getCalculatedEut() * LuV_Tier;

                // "XL Turbo Steam Turbine" - 865
                // "XL Turbo HP Steam Turbine" - 866
                // "Grandmaster Magic Energy Absorber" - 1130
                // "Large Combustion Engine" - 1171
                // "Naquadah Reactor Mark IV" - 1188
                // "Elite Solar Panel II" - 2739
                // "Plasma Generator Mark IV" - 10752
                // "Solid-Oxide Fuel Cell Mk I" - 13101
                // "Hydro Turbine (ZPM)" - 17024
                // "Large Semifluid Burner" - 31026
                // "XL Turbo SC Steam Turbine" - 31076
                // "Solar Panel (ZPM)" - 32758
                case 865, 866, 1130, 1171, 1188, 2739, 10752, 13101, 17024, 31026, 31076, 32758 -> lEUt = -processingLogic
                    .getCalculatedEut() * ZPM_Tier;

                // "Rocketdyne F-1A Engine" - 996
                // "Naquadah Reactor Mark V" - 1189
                // "Ultimate Solar Panel" - 2740
                // "Ultimate Pocket Sun" - 10753
                // "Hydro Turbine (UV)" - 17025
                // "Solar Panel (UV)" - 32759
                case 996, 1189, 2740, 10753, 17025, 32759 -> lEUt = -processingLogic.getCalculatedEut() * UV_Tier;

                // "Solid-Oxide Fuel Cell Mk II" - 13102
                // "Solar Panel (UHV)" - 32130
                case 13102, 32130 -> lEUt = -processingLogic.getCalculatedEut() * UHV_Tier;

                // "Large Plasma Turbine" - 1153
                // "Solar Panel (UEV)" - 32131
                case 1153, 32131 -> lEUt = -processingLogic.getCalculatedEut() * UEV_Tier;

                // "Large Gas Turbine" - 1151
                // "Solar Panel (UIV)" - 32132
                case 1151, 32132 -> lEUt = -processingLogic.getCalculatedEut() * UIV_Tier;

                // "XL Turbo Plasma Turbine" - 31074
                case 31074 -> lEUt = -processingLogic.getCalculatedEut() * UMV_Tier;

                // "XL Turbo Gas Turbine" - 31073
                case 31073 -> lEUt = -processingLogic.getCalculatedEut() * UXV_Tier;

                // "Large Naquadah Reactor" - 12732
                // "Universal Chemical Fuel Engine" - 32001
                case 12732, 32001 -> lEUt = -processingLogic.getCalculatedEut() * MAX_Tier;

                default -> lEUt = 0;
            }
        }
    }

    private BigInteger powers = BigInteger.ZERO;

    @Override
    public boolean onRunningTick(ItemStack aStack) {
        if (this.lEUt > 0) {
            return addEnergyOutputMultipleDynamos(powers, true, 0);
        }
        if (this.lEUt < 0) {
            if (!drainEnergyInput(getActualEnergyUsage())) {
                stopMachine(ShutDownReasonRegistry.POWER_LOSS);
                return false;
            }
        }
        return true;
    }

    // 动力仓能量判断
    public boolean addEnergyOutputMultipleDynamos(BigInteger aEU, boolean aAllowMixedVoltageDynamos, int i) {
        if (aEU.compareTo(BigInteger.ZERO) <= 0) {
            return false; // 没有能量需要输出
        }

        long totalInjected = 0;
        BigInteger remaining = aEU;

        for (MTEHatch aDynamo : validMTEList(mAllDynamoHatches)) {
            if (remaining.compareTo(BigInteger.ZERO) <= 0) {
                break; // 已经输出所有能量
            }

            long voltage = aDynamo.maxEUOutput();
            long maxAmps = aDynamo.maxAmperesOut();

            // 计算该动力仓可以接收的最大能量（基于输出能力）
            long maxEnergyPerTick = voltage * maxAmps;

            // 计算这次tick可以注入多少能量
            BigInteger maxInject = BigInteger.valueOf(maxEnergyPerTick);
            if (remaining.compareTo(maxInject) < 0) {
                maxInject = remaining;
            }

            // 转换为安培和余数
            long amps = maxInject.divide(BigInteger.valueOf(voltage))
                .longValue();
            long remainder = maxInject.mod(BigInteger.valueOf(voltage))
                .longValue();

            // 限制不超过最大安培
            amps = Math.min(amps, maxAmps);

            // 向动力仓注入能量
            long injected = 0;
            if (amps > 0) {
                injected += amps * voltage;
                // 这里需要调用实际的能量注入方法
                if (aDynamo.getBaseMetaTileEntity() != null) {
                    aDynamo.getBaseMetaTileEntity()
                        .increaseStoredEnergyUnits(amps * voltage, false);
                }
            }

            if (remainder > 0 && amps < maxAmps) {
                injected += remainder;
                if (aDynamo.getBaseMetaTileEntity() != null) {
                    aDynamo.getBaseMetaTileEntity()
                        .increaseStoredEnergyUnits(remainder, false);
                }
            }

            totalInjected += injected;
            remaining = remaining.subtract(BigInteger.valueOf(injected));
        }

        System.out.println("Injected " + totalInjected + " EU into dynamos");
        return totalInjected > 0;
    }

    @Override
    protected ProcessingLogic createProcessingLogic() {
        return new ProcessingLogic() {

            @Nonnull
            @Override
            protected CheckRecipeResult validateRecipe(@Nonnull GTRecipe recipe) {
                int power = -recipe.mEUt;
                if (power < 0) {
                    return CheckRecipeResultRegistry.NO_RECIPE;
                }
                mMaxProgresstime = recipe.mDuration;
                powers = BigInteger.valueOf(lEUt)
                    .multiply(BigInteger.valueOf(mMaxProgresstime))
                    .multiply(BigInteger.valueOf(getMaxParallelRecipes()));
                if (wireless_mode) {
                    if (!addEUToGlobalEnergyMap(ownerUUID, powers.multiply(BigInteger.valueOf(20)))) {
                        return CheckRecipeResultRegistry
                            .insufficientStartupPower(powers.multiply(BigInteger.valueOf(20)));
                    }
                }
                return CheckRecipeResultRegistry.GENERATING;
            }
        };
    }

    @Override
    public RecipeMap<?> getRecipeMap() {
        ItemStack itemStack = getControllerSlot();
        // if (itemStack == null) return null;
        if (itemStack.getItem() != null) {
            int GeneratorID = getControllerSlot().getItemDamage();
            switch (GeneratorID) {
                // Steam Small Generator
                // "Advanced Boiler [LV]" - 753
                // "Advanced Boiler [MV]" - 754
                // "Advanced Boiler [HV]" - 755
                // "Basic Steam Turbine" - 1120
                // "Advanced Steam Turbine" - 1121
                // "Turbo Steam Turbine" - 1122
                case 753, 754, 755, 1120, 1121, 1122 -> {
                    return OriginGeneratorRecipes_Steam.GeneratorRecipes_Steam;
                }

                // Steam Large Turbine
                // "Large Steam Turbine" - 1131
                // "Large HP Steam Turbine" - 1152
                // "Large Supercritical Steam Turbine" - 32016
                case 1131, 1152, 32016 -> {
                    return OriginGeneratorRecipes_Steam.GeneratorRecipes_Steam;
                }

                // Steam XL Turbine
                // "XL Turbo Steam Turbine" - 865
                // "XL Turbo HP Steam Turbine" - 866
                // "XL Turbo SC Steam Turbine" - 31076
                case 865, 866, 31076 -> {
                    return OriginGeneratorRecipes_Steam.GeneratorRecipes_Steam;
                }

                // Semifluid Generator
                // "Basic Semifluid Generator" - 837
                // "Advanced Semifluid Generator" - 838
                // "Turbo Semifluid Generator" - 839
                // "Turbo Semifluid Generator II" - 993
                // "Turbo Semifluid Generator III" - 994
                // "Large Semifluid Burner" - 31026
                case 837, 838, 839, 993, 994, 31026 -> {
                    return OriginGeneratorRecipes_Semifluid.GeneratorRecipes_Semifluid;
                }

                // Combustion Generator
                // "Basic Combustion Generator" - 1110
                // "Advanced Combustion Generator" - 1111
                // "Turbo Combustion Generator" - 1112
                // "Turbo Supercharging Combustion Generator" - 1113
                // "Ultimate Chemical Energy Releaser" - 1114
                // "Large Combustion Engine" - 1171
                case 1110, 1111, 1112, 1113, 1114, 1171 -> {
                    return OriginGeneratorRecipes_Combustion.GeneratorRecipes_Combustion;
                }

                // Plasma Generator
                // "Plasma Generator Mark I" - 1196
                // "Plasma Generator Mark II" - 1197
                // "Plasma Generator Mark III" - 1198
                // "Plasma Generator Mark IV" - 10752
                // "Ultimate Pocket Sun" - 10753
                // "Large Plasma Turbine" - 1153
                // "XL Turbo Plasma Turbine" - 31074
                case 1196, 1197, 1198, 10752, 10753, 1153, 31074 -> {
                    return OriginGeneratorRecipes_Plasma.GeneratorRecipes_Plasma;
                }

                // "Basic Rocket Engine" - 793
                // "Advanced Rocket Engine" - 794
                // "Turbo Rocket Engine" - 795
                // "Rocketdyne F-1A Engine" - 996
                case 793, 794, 795, 996 -> {
                    return OriginGeneratorRecipes_Rocket.GeneratorRecipes_Rocket;
                }

                // "Basic Gas Turbine" - 1115
                // "Advanced Gas Turbine" - 1116
                // "Turbo Gas Turbine" - 1117
                // "Turbo Gas Turbine II" - 1118
                // "Turbo Gas Turbine III" - 1119
                // "Solid-Oxide Fuel Cell Mk I" - 13101
                // "Solid-Oxide Fuel Cell Mk II" - 13102
                // "Large Gas Turbine" - 1151
                // "XL Turbo Gas Turbine" - 31073
                case 1115, 1116, 1117, 1118, 1119, 13101, 13102, 1151, 31073 -> {
                    return OriginGeneratorRecipes_Gas.GeneratorRecipes_Gas;
                }

                // "Novice Magic Energy Converter" - 1123
                // "Adept Magic Energy Converter" - 1124
                // "Master Magic Energy Converter" - 1125
                // "Novice Magic Energy Absorber" - 1127
                // "Adept Magic Energy Absorber" - 1128
                // "Master Magic Energy Absorber" - 1129
                // "Grandmaster Magic Energy Absorber" - 1130
                case 1123, 1124, 1125, 1127, 1128, 1129, 1130 -> {
                    return OriginGeneratorRecipes_Magic.GeneratorRecipes_Magic;
                }

                // "Naquadah Reactor Mark I" - 1190
                // "Naquadah Reactor Mark II" - 1191
                // "Naquadah Reactor Mark III" - 1192
                // "Naquadah Reactor Mark IV" - 1188
                // "Naquadah Reactor Mark V" - 1189
                // "Large Naquadah Reactor" - 12732
                case 1190, 1191, 1192, 1188, 1189, 12732 -> {
                    return OriginGeneratorRecipes_Naquadah.GeneratorRecipes_Naquadah;
                }

                // "Acid Generator LV" - 12793
                // "Acid Generator MV" - 12726
                // "Acid Generator HV" - 12727
                // "Acid Generator EV" - 12728
                case 12793, 12726, 12727, 12728 -> {
                    return OriginGeneratorRecipes_Acid.GeneratorRecipes_Acid;
                }

                // "Hydro Turbine (MV)" - 17019
                // "Hydro Turbine (HV)" - 17020
                // "Hydro Turbine (EV)" - 17021
                // "Hydro Turbine (IV)" - 17022
                // "Hydro Turbine (LuV)" - 17023
                // "Hydro Turbine (ZPM)" - 17024
                // "Hydro Turbine (UV)" - 17025
                case 17019, 17020, 17021, 17022, 17023, 17024, 17025 -> {
                    return OriginGeneratorRecipes_Water.GeneratorRecipes_Water;
                }

                // "Solar Panel (LV)" - 32752
                // "Solar Panel (MV)" - 32753
                // "Solar Panel (HV)" - 32754
                // "Solar Panel (EV)" - 32755
                // "Solar Panel (IV)" - 32756
                // "Solar Panel (LuV)" - 32757
                // "Solar Panel (ZPM)" - 32758
                // "Solar Panel (UV)" - 32759
                // "Solar Panel (UHV)" - 32130
                // "Solar Panel (UEV)" - 32131
                // "Solar Panel (UIV)" - 32132
                case 32752, 32753, 32754, 32755, 32756, 32757, 32758, 32759, 32130, 32131, 32132 -> {
                    return OriginGeneratorRecipes_Solar.GeneratorRecipes_Solar;
                }

                // "Basic Solar Panel" - 2733
                // "Advanced Solar Panel" - 2734
                // "Advanced Solar Panel II" - 2735
                // "Advanced Solar Panel III" - 2736
                // "Advanced Solar Panel IV" - 2737
                // "Elite Solar Panel" - 2738
                // "Elite Solar Panel II" - 2739
                // "Ultimate Solar Panel" - 2740
                case 2733, 2734, 2735, 2736, 2737, 2738, 2739, 2740 -> {
                    return OriginGeneratorRecipes_Solar.GeneratorRecipes_Solar;
                }

                // "Universal Chemical Fuel Engine" - 32001
                case 32001 -> {
                    return OriginGeneratorRecipes_UCFE.GeneratorRecipes_UCFE;
                }

                // "Nuclear Reactor" - 5
                case 5 -> {
                    return OriginGeneratorRecipes_Nuclear.GeneratorRecipes_Nuclear;
                }

                default -> {
                    return null;
                }
            }
        }
        return null;
    }

    @Override
    public @NotNull Collection<RecipeMap<?>> getAvailableRecipeMaps() {
        ArrayList<RecipeMap<?>> recipeMaps = new ArrayList<>();
        recipeMaps.add(OriginGeneratorRecipes_Steam.GeneratorRecipes_Steam);
        recipeMaps.add(OriginGeneratorRecipes_Semifluid.GeneratorRecipes_Semifluid);
        recipeMaps.add(OriginGeneratorRecipes_Combustion.GeneratorRecipes_Combustion);
        recipeMaps.add(OriginGeneratorRecipes_Plasma.GeneratorRecipes_Plasma);
        recipeMaps.add(OriginGeneratorRecipes_Rocket.GeneratorRecipes_Rocket);
        recipeMaps.add(OriginGeneratorRecipes_Gas.GeneratorRecipes_Gas);
        recipeMaps.add(OriginGeneratorRecipes_UCFE.GeneratorRecipes_UCFE);
        recipeMaps.add(OriginGeneratorRecipes_Magic.GeneratorRecipes_Magic);
        recipeMaps.add(OriginGeneratorRecipes_Naquadah.GeneratorRecipes_Naquadah);
        recipeMaps.add(OriginGeneratorRecipes_Nuclear.GeneratorRecipes_Nuclear);
        recipeMaps.add(OriginGeneratorRecipes_Acid.GeneratorRecipes_Acid);
        recipeMaps.add(OriginGeneratorRecipes_Water.GeneratorRecipes_Water);
        recipeMaps.add(OriginGeneratorRecipes_Solar.GeneratorRecipes_Solar);
        return recipeMaps;
    }

    private UUID ownerUUID;

    @Override
    public void onFirstTick(IGregTechTileEntity aBaseMetaTileEntity) {
        super.onFirstTick(aBaseMetaTileEntity);
        this.ownerUUID = aBaseMetaTileEntity.getOwnerUuid();
    }

    private boolean wireless_mode = false;

    // 开启无线电网条件
    protected boolean canUseWireless() {
        if (getControllerSlot().getItemDamage() == 11430) {
            return true;
        } else if (getControllerSlot().stackSize >= 8) {
            return true;
        } else {
            return false;
        }
    }

    // 开启无线电网模式
    @Override
    public void onLeftclick(IGregTechTileEntity aBaseMetaTileEntity, EntityPlayer aPlayer) {
        if (aPlayer.isSneaking() && getBaseMetaTileEntity().isServerSide()) {
            if (canUseWireless()) {
                if (wireless_mode) {
                    wireless_mode = false;
                    GTUtility.sendChatToPlayer(aPlayer, "mode: no_wireless_mode");
                } else {
                    wireless_mode = true;
                    GTUtility.sendChatToPlayer(aPlayer, "mode: wireless_mode");
                }
            } else {
                wireless_mode = false;
                GTUtility.sendChatToPlayer(aPlayer, "mode: no_wireless_mode");
            }
        }
        super.onLeftclick(aBaseMetaTileEntity, aPlayer);
    }

    @Override
    public void getWailaNBTData(EntityPlayerMP player, TileEntity tile, NBTTagCompound tag, World world, int x, int y,
        int z) {
        super.getWailaNBTData(player, tile, tag, world, x, y, z);
        if (getControllerSlot() != null) {
            tag.setString("Machine", getControllerSlot().getDisplayName());
            if (wireless_mode) {
                DecimalFormat process = new DecimalFormat("#,###");
                tag.setString("EnergyGenerate", process.format(powers));
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
            currentTip.add("Parallel: " + EnumChatFormatting.YELLOW + getMaxParallelRecipes());
            if (tag.hasKey("EnergyGenerate")) {
                currentTip.add("WirelessMode: " + EnumChatFormatting.GREEN + "True");
                currentTip.add("Energy Generate: " + EnumChatFormatting.YELLOW + tag.getString("EnergyGenerate"));
            } else {
                currentTip.add("WirelessMode: " + EnumChatFormatting.RED + "False");
            }
        } else {
            currentTip.add("Machine: " + EnumChatFormatting.YELLOW + "None");
        }
    }
}
