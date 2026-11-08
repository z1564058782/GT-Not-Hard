package hatch;

import static com.gtnewhorizon.gtnhlib.util.numberformatting.NumberFormatUtil.formatNumber;
import static gregtech.api.enums.Textures.BlockIcons.OVERLAY_ME_HATCH;
import static gregtech.api.enums.Textures.BlockIcons.OVERLAY_ME_HATCH_ACTIVE;
import static net.minecraft.util.StatCollector.translateToLocalFormatted;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import org.jetbrains.annotations.NotNull;

import com.cleanroommc.modularui.factory.PosGuiData;
import com.cleanroommc.modularui.screen.ModularPanel;
import com.cleanroommc.modularui.screen.UISettings;
import com.cleanroommc.modularui.value.sync.PanelSyncManager;
import com.glodblock.github.common.item.ItemFluidVoidStorageCell;

import appeng.api.AEApi;
import appeng.api.config.Actionable;
import appeng.api.implementations.IPowerChannelState;
import appeng.api.networking.IGridNode;
import appeng.api.networking.events.MENetworkChannelsChanged;
import appeng.api.networking.events.MENetworkEventSubscribe;
import appeng.api.networking.security.BaseActionSource;
import appeng.api.networking.security.MachineSource;
import appeng.api.storage.ICellContainer;
import appeng.api.storage.IMEInventory;
import appeng.api.storage.IMEInventoryHandler;
import appeng.api.storage.ISaveProvider;
import appeng.api.storage.StorageChannel;
import appeng.api.storage.data.IAEItemStack;
import appeng.api.util.AECableType;
import appeng.api.util.DimensionalCoord;
import appeng.helpers.IPriorityHost;
import appeng.items.storage.ItemBasicStorageCell;
import appeng.items.storage.ItemVoidStorageCell;
import appeng.me.GridAccessException;
import appeng.me.helpers.AENetworkProxy;
import appeng.me.helpers.IGridProxyable;
import appeng.util.item.AEItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import gregtech.GTLoggers;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.OutputBusType;
import gregtech.api.interfaces.IMEConnectable;
import gregtech.api.interfaces.IOutputBus;
import gregtech.api.interfaces.IOutputBusTransaction;
import gregtech.api.interfaces.IOutputTransaction;
import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.implementations.MTEHatchOutputBus;
import gregtech.api.render.TextureFactory;
import gregtech.api.util.GTUtility;
import gregtech.common.tileentities.machines.outputme.base.MTEHatchOutputMEBase;
import gregtech.common.tileentities.machines.outputme.util.AECacheCounter;
import io.netty.buffer.ByteBuf;
import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;

/**
 * Placeable GT output bus with a long-count AE cache, using the same provider as Output Hatch (ME).
 * Native GT recipe fragments are merged by item identity (including NBT), never clamped to int.
 * Requires the GT5U 5.09.54.133 output transaction API used by this repository.
 */
public class SuperOutputBusME extends MTEHatchOutputBus implements IPowerChannelState, IMEConnectable, ICellContainer,
    IGridProxyable, IPriorityHost, MTEHatchOutputMEBase.Environment<IAEItemStack> {

    /** Total default cache capacity, shared by all item types; storage cells retain their native behavior. */
    public static final long DEFAULT_ITEM_CAPACITY = Long.MAX_VALUE;

    public SuperOutputBusME(int aID, String aName, String aNameRegional) {
        super(
            aID,
            aName,
            aNameRegional,
            4,
            new String[] { "Item Output for Multiblocks", "Stores directly into ME",
                "Long-count cache shared by all item types", "Change cache size by inserting a storage cell",
                "Change ME connection behavior by right-clicking with wire cutter",
                "Partition the inserted Storage Cell to filter accepted outputs",
                "Right click with screwdriver to toggle Cache Mode",
                "Shift right click with screwdriver to toggle Check Mode" },
            1);
    }

    public SuperOutputBusME(String aName, int aTier, String[] aDescription, ITexture[][][] aTextures) {
        super(aName, aTier, 1, aDescription, aTextures);
    }

    @Override
    public MetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
        return new SuperOutputBusME(mName, mTier, mDescriptionArray, mTextures);
    }

    @Override
    public ITexture[] getTexturesActive(ITexture aBaseTexture) {
        return new ITexture[] { aBaseTexture, TextureFactory.of(OVERLAY_ME_HATCH_ACTIVE) };
    }

    @Override
    public ITexture[] getTexturesInactive(ITexture aBaseTexture) {
        return new ITexture[] { aBaseTexture, TextureFactory.of(OVERLAY_ME_HATCH) };
    }

    EntityPlayer lastClickedPlayer = null;

    private final MTEHatchOutputMEBase<IAEItemStack> provider = new MTEHatchOutputMEBase<IAEItemStack>(this, 1_600) {

        {
            // Do not change GT's shared DEFAULT_CAPACITY static field to our long capacity.
            baseCapacity = DEFAULT_ITEM_CAPACITY;
            cacheCapacity = DEFAULT_ITEM_CAPACITY;
        }

        @Override
        public void addToCache(IAEItemStack stack) {
            if (stack == null || stack.getStackSize() <= 0) return;
            // AECacheCounter uses unchecked long addition, so guard live cache additions as well as legacy migration.
            if (stack.getStackSize() > Long.MAX_VALUE - getCachedAmount()) {
                throw new IllegalStateException("Super Output Bus (ME) cache would overflow long");
            }
            super.addToCache(stack);
        }
    };

    @Override
    public void onFirstTick(IGregTechTileEntity aBaseMetaTileEntity) {
        super.onFirstTick(aBaseMetaTileEntity);
        getProxy().onReady();
        provider.updateState();
    }

    @Override
    public ItemStack getVisual() {
        return ItemList.Hatch_Output_Bus_ME.get(1);
    }

    /**
     * Insert an independent long quantity; the prototype and its NBT are not modified.
     * Returns the unaccepted quantity, when full or blocked by the partition; offline output stays in the cache.
     * Simulation never changes the cache. An explicitly installed void cell keeps GT's void behavior.
     */
    public long storeItems(ItemStack prototype, long amount, boolean simulate) {
        if (amount < 0) throw new IllegalArgumentException("Negative item output amount");
        if (amount == 0 || prototype == null || prototype.getItem() == null) return amount;
        long offered = Math.min(amount, Long.MAX_VALUE - provider.getCachedAmount());
        if (offered == 0) return amount;
        ItemStack identity = prototype.copy();
        identity.stackSize = 1;
        IAEItemStack input = AEItemStack.create(identity)
            .setStackSize(offered);
        provider.storePartial(input, simulate);
        long rejected = Math.max(0L, Math.min(offered, input.getStackSize()));
        return amount - (offered - rejected);
    }

    @Override
    public boolean storePartial(ItemStack stack, boolean simulate) {
        if (stack == null || stack.stackSize <= 0) return true;
        stack.stackSize = (int) storeItems(stack, stack.stackSize, simulate);
        return stack.stackSize == 0;
    }

    @Override
    public String getLocalName() {
        return net.minecraft.util.StatCollector.translateToLocal("gt.blockmachines.superoutputbus.me.name");
    }

    @Override
    public String[] getDescription() {
        return new String[] { net.minecraft.util.StatCollector.translateToLocal("gtnothard.superoutput.desc.1"),
            net.minecraft.util.StatCollector.translateToLocal("gtnothard.superoutput.desc.2"),
            net.minecraft.util.StatCollector.translateToLocal("gtnothard.superoutput.desc.3"),
            net.minecraft.util.StatCollector.translateToLocal("gtnothard.superoutput.desc.4"),
            net.minecraft.util.StatCollector.translateToLocal("gtnothard.superoutput.desc.5") };
    }

    @Override
    public boolean isFiltered() {
        return provider.isFiltered();
    }

    @Override
    public boolean isFilteredToItem(GTUtility.ItemId id) {
        return provider.canStore(AEItemStack.create(id.getItemStack()));
    }

    @Override
    public OutputBusType getBusType() {
        if (provider.getCacheMode())
            return provider.isFiltered() ? OutputBusType.MECacheFiltered : OutputBusType.MECacheUnfiltered;
        else return provider.isFiltered() ? OutputBusType.MEFiltered : OutputBusType.MEUnfiltered;
    }

    @Override
    public IOutputBusTransaction createTransaction() {
        return new MEOutputBusTransaction();
    }

    @Override
    public IGridProxyable getIGridProxyable() {
        return this;
    }

    @Override
    public StorageChannel getChannel() {
        return StorageChannel.ITEMS;
    }

    @Override
    public ItemStack getCellStack() {
        return mInventory[0];
    }

    @Override
    public ISaveProvider getISaveProvider() {
        return this;
    }

    BaseActionSource requestSource;

    @Override
    public BaseActionSource getActionSource() {
        if (requestSource == null) requestSource = new MachineSource(this);
        return requestSource;
    }

    @Override
    public EntityPlayer getLastClickedPlayer() {
        return lastClickedPlayer;
    }

    @Override
    public IMEInventory<IAEItemStack> getNetworkInvtory() throws GridAccessException {
        return getProxy().getStorage()
            .getItemInventory();
    }

    class MEOutputBusTransaction
        implements IOutputBusTransaction, IOutputTransaction.IRecipeCheckAware, IOutputTransaction.IProtectOutputAware {

        private final AECacheCounter<GTUtility.ItemId> cache = new AECacheCounter<>();
        private final long availableSpace;
        private boolean active = true;
        private boolean allowAnyInput = false;
        private boolean isRecipeCheck = false;
        private boolean isProtectOutput = true;
        private boolean isDynamicCapacity = false;
        private IMEInventoryHandler<IAEItemStack> cell = null;

        public MEOutputBusTransaction() {
            availableSpace = provider.getPhysicalSpace();
        }

        public void setRecipeCheck(boolean isRecipeCheck) {
            this.isRecipeCheck = isRecipeCheck;
            if (isRecipeCheck && shouldCheckCell()) {
                provider.flushCachedStack();
                cell = AEApi.instance()
                    .registries()
                    .cell()
                    .getCellInventory(getCellStack().copy(), getISaveProvider(), getChannel());
            }
            updateFlags();
        }

        public void setProtectOutput(boolean isProtectOutput) {
            this.isProtectOutput = isProtectOutput;
            updateFlags();
        }

        private void updateFlags() {
            isDynamicCapacity = isRecipeCheck && isProtectOutput
                && getCheckMode()
                && (!provider.getCacheMode() || !provider.isDistribution())
                && !provider.canVoidOverflow();
            allowAnyInput = !getCheckMode() && availableSpace > 0;
            if (!isRecipeCheck) {
                allowAnyInput |= provider.getLastInputTick() == provider.getTickCounter();
            }
        }

        @Override
        public boolean needsTotalParallelData() {
            return isDynamicCapacity;
        }

        @Override
        public IOutputBus getBus() {
            return SuperOutputBusME.this;
        }

        @Override
        public boolean hasAvailableSpace() {
            return cache.getTotal() < Long.MAX_VALUE - provider.getCachedAmount()
                && (allowAnyInput || cache.getTotal() < availableSpace);
        }

        @Override
        public boolean storePartial(GTUtility.ItemId id, @NotNull ItemStack stack, long totalPerParallel,
            long perParallel) {
            if (!active) throw new IllegalStateException("Cannot add to a transaction after committing it");
            if (stack.stackSize <= 0) return false;
            long numericSpace = Long.MAX_VALUE - provider.getCachedAmount() - cache.getTotal();
            if (numericSpace <= 0) return false;

            if (isRecipeCheck) {
                if (shouldCheckCell()) {
                    IAEItemStack input = AEItemStack.create(stack);
                    input.setStackSize(Math.min(numericSpace, stack.stackSize));
                    if (isDynamicCapacity) {
                        long cellAvailableSpace = provider.getCellAvailableSpace();
                        long amount = dynamicAmount(cellAvailableSpace, totalPerParallel, perParallel, stack.stackSize);
                        if (amount <= 0) return false;
                        input.setStackSize(amount);
                    }
                    IAEItemStack rejected = cell.injectItems(input, Actionable.MODULATE, getActionSource());
                    int inserted = (int) (input.getStackSize() - (rejected == null ? 0 : rejected.getStackSize()));
                    cache.insert(id, inserted);
                    stack.stackSize -= inserted;
                    return inserted > 0;
                } else if (isDynamicCapacity) {
                    long amount = dynamicAmount(availableSpace, totalPerParallel, perParallel, stack.stackSize);
                    if (amount <= 0) return false;
                    cache.insert(id, amount);
                    stack.stackSize -= amount;
                    return amount > 0;
                }
            }

            if (!hasAvailableSpace() || !isFilteredTo(id)) {
                return false;
            }
            int inserted = (int) Math.min(Math.max(0L, numericSpace), stack.stackSize);
            if (inserted == 0) return false;
            cache.insert(id, inserted);
            stack.stackSize -= inserted;
            return true;
        }

        /** Bound before multiplying parallel weights: their product may exceed long even in a simulation. */
        private long dynamicAmount(long space, long totalPerParallel, long perParallel, int requested) {
            if (totalPerParallel <= 0 || perParallel <= 0) return 0;
            long parallels = Math.max(1L, Math.min(Integer.MAX_VALUE, space / totalPerParallel));
            long limit = Math.min(Math.max(0L, space - cache.getTotal()), requested);
            limit = Math.min(limit, Long.MAX_VALUE - provider.getCachedAmount() - cache.getTotal());
            return perParallel > limit / parallels ? limit : Math.min(limit, parallels * perParallel);
        }

        @Override
        public void complete(GTUtility.ItemId id) {
            // Do nothing
        }

        @Override
        public void commit() {
            if (!active) throw new IllegalStateException("Cannot commit a transaction twice");
            if (cache.getTotal() > Long.MAX_VALUE - provider.getCachedAmount()) {
                throw new IllegalStateException("Super Output Bus (ME) transaction would overflow long");
            }
            if (cache.getTotal() > 0) {
                cache.iterateAll(
                    (id, amount) -> {
                        provider.addToCache(
                            AEItemStack.create(id.getItemStack())
                                .setStackSize(amount));
                    });
                provider.updateLastInputTick();
                SuperOutputBusME.this.markDirty();
            }
            active = false;
        }
    }

    @Override
    public AECableType getCableConnectionType(ForgeDirection forgeDirection) {
        return isOutputFacing(forgeDirection) ? AECableType.SMART : AECableType.NONE;
    }

    @Override
    public void onFacingChange() {
        provider.updateValidGridProxySides();
    }

    @Override
    public boolean onRightclick(IGregTechTileEntity aBaseMetaTileEntity, EntityPlayer aPlayer) {
        this.lastClickedPlayer = aPlayer;
        openGui(aPlayer);
        return true;
    }

    @Override
    public void onScrewdriverRightClick(ForgeDirection side, EntityPlayer aPlayer, float aX, float aY, float aZ,
        ItemStack aTool) {
        provider.onScrewdriverRightClick(side, aPlayer, aX, aY, aZ, aTool);
    }

    @Override
    public boolean onWireCutterRightClick(ForgeDirection side, ForgeDirection wrenchingSide, EntityPlayer aPlayer,
        float aX, float aY, float aZ, ItemStack aTool) {
        return provider.onWireCutterRightClick(side, wrenchingSide, aPlayer, aX, aY, aZ, aTool);
    }

    @Override
    public boolean connectsToAllSides() {
        return provider.getAdditionalConnection();
    }

    @Override
    public void setConnectsToAllSides(boolean connects) {
        provider.setAdditionalConnection(connects);
    }

    @Override
    public AENetworkProxy getProxy() {
        return provider.getProxy();
    }

    @Override
    public boolean isPowered() {
        return getProxy() != null && getProxy().isPowered();
    }

    @Override
    public boolean isActive() {
        return getProxy() != null && getProxy().isActive();
    }

    @Override
    public boolean allowPullStack(IGregTechTileEntity aBaseMetaTileEntity, int aIndex, ForgeDirection side,
        ItemStack aStack) {
        return false;
    }

    @Override
    public boolean pushOutputInventory() {
        return false;
    }

    public boolean getCheckMode() {
        return provider.getCheckMode();
    }

    public boolean shouldCheckCell() {
        return provider.shouldCheckCell();
    }

    public boolean hasPhysicalSpace() {
        return provider.hasPhysicalSpace();
    }

    public boolean hasAvailableSpace() {
        return provider.hasAvailableSpace();
    }

    @Override
    public void onPostTick(IGregTechTileEntity aBaseMetaTileEntity, long aTick) {
        provider.onPostTick(aBaseMetaTileEntity, aTick);
        super.onPostTick(aBaseMetaTileEntity, aTick);
    }

    @Override
    public void notifyOutputSpaceChanged() {
        // The provider detected its free space grew or its cell was swapped/repartitioned; re-check a blocked recipe.
        notifyWatchers();
    }

    @Override
    public void onColorChangeServer(byte aColor) {
        provider.updateAE2ProxyColor();
    }

    @Override
    public boolean isLocked() {
        return provider.isFiltered();
    }

    @Override
    public void addAdditionalTooltipInformation(ItemStack stack, List<String> tooltip) {
        provider.addAdditionalTooltipInformation(stack, tooltip);
    }

    @Override
    public void setItemNBT(NBTTagCompound aNBT) {
        super.setItemNBT(aNBT);
        provider.setItemNBT(aNBT);
    }

    @Override
    public NBTTagCompound saveStackToNBT(IAEItemStack s) {
        NBTTagCompound tag = new NBTTagCompound();
        tag.setTag("itemStack", GTUtility.saveItem(s.getItemStack()));
        tag.setLong("size", s.getStackSize());
        return tag;
    }

    @Override
    public IAEItemStack loadStackFromNBT(NBTTagCompound t) {
        final ItemStack is = GTUtility.loadItem(t.getCompoundTag("itemStack"));
        if (is == null) return null;
        return AEItemStack.create(is)
            .setStackSize(t.getLong("size"));
    }

    @Override
    public void saveNBTData(NBTTagCompound aNBT) {
        super.saveNBTData(aNBT);
        provider.saveNBTData(aNBT);
    }

    @Override
    public void loadNBTData(NBTTagCompound aNBT) {
        super.loadNBTData(aNBT);

        NBTBase t = aNBT.getTag("cachedStack"); // legacy
        if (t instanceof NBTTagCompound) {
            provider.addToCache(
                AEApi.instance()
                    .storage()
                    .createItemStack(GTUtility.loadItem((NBTTagCompound) t)));
        }
        t = aNBT.getTag("cachedItems");
        if (t instanceof NBTTagList l) {
            for (int i = 0; i < l.tagCount(); ++i) {
                NBTTagCompound tag = l.getCompoundTagAt(i);
                if (!tag.hasKey("itemStack")) { // legacy #868
                    provider.addToCache(
                        AEApi.instance()
                            .storage()
                            .createItemStack(GTUtility.loadItem(l.getCompoundTagAt(i))));
                    continue;
                }
                NBTTagCompound tagItemStack = tag.getCompoundTag("itemStack");
                final IAEItemStack s = AEApi.instance()
                    .storage()
                    .createItemStack(GTUtility.loadItem(tagItemStack));
                if (s != null) {
                    s.setStackSize(tag.getLong("size"));
                    provider.addToCache(s);
                } else {
                    GTLoggers.GT_FML_LOGGER.warn(
                        "An error occurred while loading contents of ME Output Bus. This item has been voided: {}",
                        tagItemStack);
                }
            }
        }
        // Missing capacity denotes a fresh/legacy instance; never fall back to GT's 1600-item default.
        NBTTagCompound providerTag = (NBTTagCompound) aNBT.copy();
        providerTag.setLong("baseCapacity", DEFAULT_ITEM_CAPACITY);
        provider.loadNBTData(providerTag);
    }

    public static final String COPIED_DATA_IDENTIFIER = "superOutputBusME";

    @Override
    public String getCopiedDataIdentifier(EntityPlayer player) {
        return COPIED_DATA_IDENTIFIER;
    }

    @Override
    public NBTTagCompound getCopiedData(EntityPlayer player) {
        return provider.getCopiedData(player);
    }

    @Override
    public boolean pasteCopiedData(EntityPlayer player, NBTTagCompound nbt) {
        return provider.pasteCopiedData(player, nbt);
    }

    @Override
    public void writeToStream(ByteBuf buffer) {
        super.writeToStream(buffer);

        // Sync the hatch capacity to the client so that MM can show its exchanging preview properly
        // This is only called when the hatch is placed since it will never change over its lifetime

        provider.writeToClientPacket(buffer);
    }

    @Override
    public void readFromStream(ByteBuf buffer) {
        super.readFromStream(buffer);
        provider.readFromClientPacket(buffer);
    }

    @Override
    public boolean isGivingInformation() {
        return true;
    }

    @Override
    public void getWailaNBTData(EntityPlayerMP player, TileEntity tile, NBTTagCompound tag, World world, int x, int y,
        int z) {
        super.getWailaNBTData(player, tile, tag, world, x, y, z);
        provider.getWailaNBTData(player, tile, tag, world, x, y, z);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getWailaBody(ItemStack itemStack, List<String> ss, IWailaDataAccessor accessor,
        IWailaConfigHandler config) {
        super.getWailaBody(itemStack, ss, accessor, config);

        NBTTagCompound tag = accessor.getNBTData();

        ss.add(
            translateToLocalFormatted(
                "GT5U.waila.hatch.outputme.item_cache_capacity",
                formatNumber(tag.getLong("cacheCapacity"))));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasWailaAdvancedBody(ItemStack itemStack, IWailaDataAccessor accessor, IWailaConfigHandler config) {
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getWailaAdvancedBody(ItemStack itemStack, List<String> ss, IWailaDataAccessor accessor,
        IWailaConfigHandler config) {
        super.getWailaAdvancedBody(itemStack, ss, accessor, config);
        MTEHatchOutputMEBase.WailaHelper.getWailaAdvancedBody("item", ss, accessor);
    }

    @Override
    public String[] getInfoData() {
        return provider.getInfoData(
            getAEDiagnostics(),
            "GT5U.infodata.hatch.output_bus_me",
            (IAEItemStack s) -> s.getItem()
                .getItemStackDisplayName(s.getItemStack()));
    }

    @Override
    public boolean acceptsItemLock() {
        return false;
    }

    @Override
    public void onContentsChanged(int slot) {
        provider.onContentsChanged(slot);
    }

    @MENetworkEventSubscribe
    public void updateCell(final MENetworkChannelsChanged c) {
        provider.updateCell();
    }

    @Override
    public List<IMEInventoryHandler> getCellArray(final StorageChannel channel) {
        return provider.getCellArray(channel);
    }

    @Override
    public int getPriority() {
        return provider.getPriority();
    }

    @Override
    public void setPriority(int newValue) {
        provider.setPriority(newValue);
    }

    @Override
    public void saveChanges(IMEInventory cellInventory) {
        markDirty();
    }

    @Override
    public IGridNode getActionableNode() {
        return getProxy().getNode();
    }

    @Override
    public DimensionalCoord getLocation() {
        IGregTechTileEntity gtm = this.getBaseMetaTileEntity();
        return new DimensionalCoord(gtm.getWorld(), gtm.getXCoord(), gtm.getYCoord(), gtm.getZCoord());
    }

    @Override
    public void securityBreak() {}

    @Override
    public IGridNode getGridNode(ForgeDirection forgeDirection) {
        return getProxy().getNode();
    }

    @Override
    public void dispatchMarkDirty() {
        this.markDirty();
    }

    @Override
    public MTEHatchOutputMEBase<IAEItemStack> getProvider() {
        return provider;
    }

    @Override
    public String getEnableKey() {
        return "GT5U.hatch.item.filter.enable";
    }

    @Override
    public String getDisableKey() {
        return "GT5U.hatch.item.filter.disable";
    }

    @Override
    public ModularPanel buildUI(PosGuiData guiData, PanelSyncManager syncManager, UISettings uiSettings) {
        return new SuperOutputBusMEGui(this).build(guiData, syncManager, uiSettings);
    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack itemStack) {
        return itemStack != null && isItemCell(itemStack) && super.isItemValidForSlot(index, itemStack);
    }

    private boolean isItemCell(@NotNull ItemStack itemStack) {
        Item item = itemStack.getItem();
        return item instanceof ItemBasicStorageCell
            || item instanceof ItemVoidStorageCell && !(item instanceof ItemFluidVoidStorageCell);
    }
}
