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
import static gregtech.api.metatileentity.BaseTileEntity.TOOLTIP_DELAY;
import static gregtech.api.util.GTStructureUtility.buildHatchAdder;
import static gregtech.api.util.GTUtility.validMTEList;
import static gregtech.common.misc.WirelessNetworkManager.addEUToGlobalEnergyMap;
import static gregtech.common.misc.WirelessNetworkManager.strongCheckOrAddUser;
import static gtPlusPlus.xmod.gregtech.api.metatileentity.implementations.base.GTPPMultiBlockBase.GTPPHatchElement.TTDynamo;
import static net.minecraft.util.StatCollector.translateToLocal;
import static net.minecraft.util.StatCollector.translateToLocalFormatted;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import javax.annotation.Nonnull;

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
import com.gtnewhorizons.modularui.api.drawable.IDrawable;
import com.gtnewhorizons.modularui.api.screen.ModularWindow;
import com.gtnewhorizons.modularui.api.screen.UIBuildContext;
import com.gtnewhorizons.modularui.common.widget.ButtonWidget;
import com.gtnewhorizons.modularui.common.widget.FakeSyncWidget;

import gregtech.api.GregTechAPI;
import gregtech.api.enums.Textures;
import gregtech.api.gui.modularui.GTUITextures;
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
import gregtech.api.util.OverclockCalculator;
import gregtech.api.util.shutdown.ShutDownReason;
import gregtech.api.util.shutdown.ShutDownReasonRegistry;
import gtPlusPlus.xmod.gregtech.api.metatileentity.implementations.base.GTPPMultiBlockBase;
import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import util.GTNotHardUITextures;
import util.OriginEnergy;
import util.OriginGeneratorRegistry;

public class Origin extends GTPPMultiBlockBase<Origin> implements ISurvivalConstructable, ISecondaryDescribable {

    private static final String ENERGY_PER_TICK_NBT = "origin_energy_per_tick";
    private static final BigInteger LONG_MAX = BigInteger.valueOf(Long.MAX_VALUE);
    private static final String STRUCTURE_PIECE_MAIN = "main";
    private static final int mcasingIndex = Textures.BlockIcons.getTextureIndex(
        Textures.BlockIcons.getCasingTextureForId(GTUtility.getCasingTextureIndex(GregTechAPI.sBlockCasings4, 1)));
    private static final IStructureDefinition<Origin> STRUCTURE_DEFINITION = StructureDefinition.<Origin>builder()
        .addShape(
            STRUCTURE_PIECE_MAIN,
            transpose(new String[][] { { "hhh", "hhh", "hhh" }, { "h~h", "h-h", "hhh" }, { "hhh", "hhh", "hhh" } }))
        .addElement(
            'h',
            buildHatchAdder(Origin.class)
                .atLeast(InputBus, OutputBus, InputHatch, OutputHatch, Maintenance, Dynamo.or(TTDynamo))
                .casingIndex(mcasingIndex)
                .hint(1)
                .buildAndChain(onElementPass(Origin::onCasingAdded, ofBlock(GregTechAPI.sBlockCasings4, 1))))
        .build();

    private int mCasingAmount;
    private UUID ownerUUID;
    private boolean wireless_mode;
    private BigInteger energyPerTick = BigInteger.ZERO;

    public Origin(int aID, String aName, String aNameRegional) {
        super(aID, aName, aNameRegional);
    }

    public Origin(String aName) {
        super(aName);
    }

    @Override
    public void saveNBTData(NBTTagCompound aNBT) {
        super.saveNBTData(aNBT);
        aNBT.setBoolean("wireless_mode", wireless_mode);
        aNBT.setString(ENERGY_PER_TICK_NBT, energyPerTick.toString());
    }

    @Override
    public void loadNBTData(NBTTagCompound aNBT) {
        super.loadNBTData(aNBT);
        wireless_mode = aNBT.getBoolean("wireless_mode");
        // Legacy mEUt already stores tier-scaled output; do not multiply it again.
        energyPerTick = OriginEnergy.restore(
            aNBT.hasKey(ENERGY_PER_TICK_NBT) ? aNBT.getString(ENERGY_PER_TICK_NBT) : null,
            lEUt,
            mMaxProgresstime > 0);
        lEUt = energyPerTick.min(LONG_MAX)
            .longValue();
    }

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
            return new ITexture[] { casingTexturePages[0][mcasingIndex], TextureFactory.builder()
                .addIcon(aActive ? OVERLAY_FRONT_ORE_FACTORY_ACTIVE : OVERLAY_FRONT_ORE_FACTORY)
                .extFacing()
                .build(),
                TextureFactory.builder()
                    .addIcon(aActive ? OVERLAY_FRONT_ORE_FACTORY_ACTIVE_GLOW : OVERLAY_FRONT_ORE_FACTORY_GLOW)
                    .extFacing()
                    .glow()
                    .build() };
        }
        return new ITexture[] { casingTexturePages[0][mcasingIndex] };
    }

    @Override
    protected MultiblockTooltipBuilder createTooltip() {
        return new MultiblockTooltipBuilder().addMachineType(translateToLocal("gt.blockmachines.origin.name"))
            .addInfo(translateToLocal("gtnothard.tooltip.runs_machines"))
            .addInfo(translateToLocal("gtnothard.tooltip.parallel"))
            .addInfo(translateToLocal("gtnothard.tooltip.machine_count"))
            .addSeparator()
            .addInfo(translateToLocal("gtnothard.tooltip.origin.wireless_button"))
            .addInfo(translateToLocal("gtnothard.tooltip.origin.wireless_energy"))
            .addSeparator()
            .addInfo(translateToLocal("gtnothard.tooltip.added_by"))
            .beginStructureBlock(3, 3, 3, true)
            .addController(translateToLocal("gtnothard.structure.front_center"))
            .addCasingInfoRange(translateToLocal("gtnothard.structure.stainless_steel"), 4, 24, false)
            .addDynamoHatch(translateToLocal("gtnothard.structure.any_casing"), 1)
            .addMaintenanceHatch(translateToLocal("gtnothard.structure.any_casing"), 1)
            .addInputHatch(translateToLocal("gtnothard.structure.any_casing"), 1)
            .addInputBus(translateToLocal("gtnothard.structure.any_casing"), 1)
            .addOutputHatch(translateToLocal("gtnothard.structure.any_casing"), 1)
            .addOutputBus(translateToLocal("gtnothard.structure.any_casing"), 1)
            .toolTipFinisher();
    }

    @Override
    public void construct(ItemStack aStack, boolean aHintsOnly) {
        buildPiece(STRUCTURE_PIECE_MAIN, aStack, aHintsOnly, 1, 1, 0);
    }

    @Override
    public int survivalConstruct(ItemStack stackSize, int elementBudget, ISurvivalBuildEnvironment env) {
        return mMachine ? -1
            : survivialBuildPiece(STRUCTURE_PIECE_MAIN, stackSize, 1, 1, 0, elementBudget, env, false, true);
    }

    @Override
    public boolean checkMachine(IGregTechTileEntity aBaseMetaTileEntity, ItemStack aStack) {
        mDynamoHatches.clear();
        mTecTechDynamoHatches.clear();
        mCasingAmount = 0;
        return checkPiece(STRUCTURE_PIECE_MAIN, 1, 1, 0) && mCasingAmount >= 4 && mMaintenanceHatches.size() == 1;
    }

    @Override
    public IMetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
        return new Origin(mName);
    }

    @Override
    public int getMaxEfficiency(ItemStack aStack) {
        return 10_000;
    }

    @Override
    public boolean explodesOnComponentBreak(ItemStack aStack) {
        return false;
    }

    @Override
    public String getMachineType() {
        return "Origin";
    }

    @Override
    public int getMaxParallelRecipes() {
        ItemStack selector = getControllerSlot();
        return OriginGeneratorRegistry.getParallelMultiplier(selector == null ? 0 : selector.stackSize);
    }

    @Override
    public boolean supportsBatchMode() {
        return false;
    }

    @Override
    protected void setupProcessingLogic(ProcessingLogic logic) {
        super.setupProcessingLogic(logic);
        // One fuel recipe per cycle; controller count amplifies energy, not fuel consumption.
        logic.setMaxParallel(1)
            .setMaxParallelSupplier(() -> 1)
            .setBatchSize(1);
    }

    @Override
    protected void setProcessingLogicPower(ProcessingLogic logic) {
        logic.setAvailableVoltage(Long.MAX_VALUE)
            .setAvailableAmperage(1)
            .setAmperageOC(false);
    }

    @Override
    protected void setEnergyUsage(ProcessingLogic logic) {
        ItemStack selector = getControllerSlot();
        OriginGeneratorRegistry.Definition definition = OriginGeneratorRegistry.getDefinition(selector);
        energyPerTick = definition == null ? BigInteger.ZERO
            : OriginGeneratorRegistry
                .calculateEnergyPerTick(definition.getGeneratorId(), logic.getCalculatedEut(), selector.stackSize);
        // The base class uses a long only for status/damage. Wireless output keeps full precision.
        lEUt = energyPerTick.min(LONG_MAX)
            .longValue();
    }

    @Override
    protected ProcessingLogic createProcessingLogic() {
        return new ProcessingLogic() {

            @Nonnull
            @Override
            protected CheckRecipeResult validateRecipe(@Nonnull GTRecipe recipe) {
                ItemStack selector = getControllerSlot();
                OriginGeneratorRegistry.Definition definition = OriginGeneratorRegistry.getDefinition(selector);
                if (definition == null || recipe.mEUt >= 0
                    || recipe.mDuration <= 0
                    || recipe.mInputs.length == 0
                    || recipe.mInputs[0] == null
                    || recipe.mInputs[0].getItem() != selector.getItem()
                    || recipe.mInputs[0].getItemDamage() != selector.getItemDamage()) {
                    return CheckRecipeResultRegistry.NO_RECIPE;
                }
                return CheckRecipeResultRegistry.GENERATING;
            }

            @Nonnull
            @Override
            protected OverclockCalculator createOverclockCalculator(@Nonnull GTRecipe recipe) {
                return OverclockCalculator.ofNoOverclock(recipe)
                    .setEUt(Long.MAX_VALUE);
            }
        };
    }

    @Override
    public boolean onRunningTick(ItemStack aStack) {
        if (energyPerTick.signum() <= 0) {
            stopMachine(ShutDownReasonRegistry.POWER_LOSS);
            return false;
        }
        if (wireless_mode) {
            return ownerUUID != null && addEUToGlobalEnergyMap(ownerUUID, energyPerTick);
        }
        return addEnergyOutputMultipleDynamos(energyPerTick, true, 0);
    }

    public boolean addEnergyOutputMultipleDynamos(BigInteger energy, boolean allowMixedVoltage, int ignored) {
        if (energy.signum() <= 0) {
            return false;
        }
        BigInteger remaining = energy;
        for (MTEHatch dynamo : validMTEList(mAllDynamoHatches)) {
            IGregTechTileEntity tile = dynamo.getBaseMetaTileEntity();
            long voltage = dynamo.maxEUOutput();
            long amps = dynamo.maxAmperesOut();
            if (tile == null || voltage <= 0 || amps <= 0) {
                continue;
            }
            long storedBefore = tile.getStoredEU();
            BigInteger inject = OriginEnergy
                .limitDynamoInjection(remaining, voltage, amps, storedBefore, tile.getEUCapacity());
            if (inject.signum() <= 0) {
                continue;
            }
            tile.increaseStoredEnergyUnits(inject.longValue(), false);
            long actualInjected = Math.max(0, tile.getStoredEU() - storedBefore);
            remaining = remaining.subtract(BigInteger.valueOf(actualInjected));
            if (remaining.signum() <= 0) {
                break;
            }
        }
        return remaining.compareTo(energy) < 0;
    }

    @Override
    public void stopMachine(@NotNull ShutDownReason reason) {
        energyPerTick = BigInteger.ZERO;
        super.stopMachine(reason);
    }

    @Override
    public RecipeMap<?> getRecipeMap() {
        return OriginGeneratorRegistry.getRecipeMap(getControllerSlot());
    }

    @Override
    public @NotNull Collection<RecipeMap<?>> getAvailableRecipeMaps() {
        return OriginGeneratorRegistry.getAvailableRecipeMaps();
    }

    @Override
    public void onFirstTick(IGregTechTileEntity aBaseMetaTileEntity) {
        super.onFirstTick(aBaseMetaTileEntity);
        ownerUUID = aBaseMetaTileEntity.getOwnerUuid();
        if (aBaseMetaTileEntity.isServerSide() && ownerUUID != null) {
            strongCheckOrAddUser(ownerUUID);
        }
    }

    @Override
    protected boolean useMui2() {
        return false;
    }

    @Override
    public void addUIWidgets(ModularWindow.Builder builder, UIBuildContext buildContext) {
        super.addUIWidgets(builder, buildContext);
        builder.widget(
            new ButtonWidget().setOnClick((clickData, widget) -> { wireless_mode = !wireless_mode; })
                .setPlayClickSound(true)
                .setBackground(
                    () -> wireless_mode
                        ? new IDrawable[] { GTUITextures.BUTTON_STANDARD_PRESSED,
                            GTNotHardUITextures.OVERLAY_BUTTON_WIRELESS_ON }
                        : new IDrawable[] { GTUITextures.BUTTON_STANDARD,
                            GTNotHardUITextures.OVERLAY_BUTTON_WIRELESS_OFF })
                .setPos(80, 91)
                .setSize(16, 16)
                .addTooltip(translateToLocal("gtnothard.gui.wireless_mode"))
                .setTooltipShowUpDelay(TOOLTIP_DELAY))
            .widget(new FakeSyncWidget.BooleanSyncer(() -> wireless_mode, val -> wireless_mode = val));
    }

    @Override
    public void getWailaNBTData(EntityPlayerMP player, TileEntity tile, NBTTagCompound tag, World world, int x, int y,
        int z) {
        super.getWailaNBTData(player, tile, tag, world, x, y, z);
        if (!world.isRemote && getControllerSlot() != null) {
            // Avoid the base class's long multiplication overflowing when output is near Long.MAX_VALUE.
            if (getBaseMetaTileEntity().isActive()) {
                tag.setLong(
                    "energyUsage",
                    -energyPerTick.min(LONG_MAX)
                        .longValue());
            }
            tag.setString("Machine", getControllerSlot().getDisplayName());
            if (wireless_mode) {
                tag.setString("EnergyGenerate", new DecimalFormat("#,###").format(energyPerTick));
            }
        }
    }

    @Override
    public void getWailaBody(ItemStack itemStack, List<String> currentTip, IWailaDataAccessor accessor,
        IWailaConfigHandler config) {
        super.getWailaBody(itemStack, currentTip, accessor, config);
        NBTTagCompound tag = accessor.getNBTData();
        if (tag.hasKey("Machine")) {
            currentTip.add(
                translateToLocalFormatted(
                    "gtnothard.waila.machine",
                    EnumChatFormatting.YELLOW + tag.getString("Machine")));
            currentTip.add(
                translateToLocalFormatted(
                    "gtnothard.waila.wireless",
                    tag.hasKey("EnergyGenerate")
                        ? EnumChatFormatting.GREEN + translateToLocal("gtnothard.state.enabled")
                        : EnumChatFormatting.RED + translateToLocal("gtnothard.state.disabled")));
            if (tag.hasKey("EnergyGenerate")) {
                currentTip.add(
                    translateToLocalFormatted(
                        "gtnothard.waila.energy_generated",
                        EnumChatFormatting.YELLOW + tag.getString("EnergyGenerate")));
            }
        } else {
            currentTip.add(
                translateToLocalFormatted(
                    "gtnothard.waila.machine",
                    EnumChatFormatting.YELLOW + translateToLocal("gtnothard.state.none")));
        }
    }
}
