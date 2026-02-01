package machines;

import static Recipes.SingularityRecipes_ModItem.SingularityModItemRecipes_Generate.convertListToArray;
import static Recipes.SingularityRecipes_ModItem.SingularityModItemRecipes_Generate.getCreativeItemsByMod;
import static com.gtnewhorizon.structurelib.structure.StructureUtility.ofBlock;
import static com.gtnewhorizon.structurelib.structure.StructureUtility.onElementPass;
import static com.gtnewhorizon.structurelib.structure.StructureUtility.transpose;
import static gregtech.api.enums.HatchElement.Maintenance;
import static gregtech.api.enums.HatchElement.OutputBus;
import static gregtech.api.enums.HatchElement.OutputHatch;
import static gregtech.api.enums.Textures.BlockIcons.OVERLAY_FRONT_ORE_FACTORY;
import static gregtech.api.enums.Textures.BlockIcons.OVERLAY_FRONT_ORE_FACTORY_ACTIVE;
import static gregtech.api.enums.Textures.BlockIcons.OVERLAY_FRONT_ORE_FACTORY_ACTIVE_GLOW;
import static gregtech.api.enums.Textures.BlockIcons.OVERLAY_FRONT_ORE_FACTORY_GLOW;
import static gregtech.api.enums.Textures.BlockIcons.casingTexturePages;
import static gregtech.api.util.GTStructureUtility.buildHatchAdder;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;

import javax.annotation.Nonnull;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.FluidStack;

import com.gtnewhorizon.structurelib.alignment.constructable.ISurvivalConstructable;
import com.gtnewhorizon.structurelib.structure.IStructureDefinition;
import com.gtnewhorizon.structurelib.structure.ISurvivalBuildEnvironment;
import com.gtnewhorizon.structurelib.structure.StructureDefinition;

import Recipes.SingularityRecipes_Ecosystem.SingularityEcosystemRecipes_Comb;
import Recipes.SingularityRecipes_Ecosystem.SingularityEcosystemRecipes_Food;
import Recipes.SingularityRecipes_Ecosystem.SingularityEcosystemRecipes_TreeGrowth;
import Recipes.SingularityRecipes_Pachinko.SingularityPachinkoRecipes_GT_Cable;
import Recipes.SingularityRecipes_Pachinko.SingularityPachinkoRecipes_GT_Hatch;
import Recipes.SingularityRecipes_Pachinko.SingularityPachinkoRecipes_GT_Misc;
import Recipes.SingularityRecipes_Pachinko.SingularityPachinkoRecipes_GT_MultiBlock_1;
import Recipes.SingularityRecipes_Pachinko.SingularityPachinkoRecipes_GT_MultiBlock_2;
import Recipes.SingularityRecipes_Pachinko.SingularityPachinkoRecipes_GT_MultiBlock_3;
import Recipes.SingularityRecipes_Pachinko.SingularityPachinkoRecipes_GT_MultiBlock_4;
import Recipes.SingularityRecipes_Pachinko.SingularityPachinkoRecipes_Storage;
import Recipes.SingularityRecipes_VoidDust.SingularityDustRecipes_T0;
import Recipes.SingularityRecipes_VoidDust.SingularityDustRecipes_T1;
import Recipes.SingularityRecipes_VoidDust.SingularityDustRecipes_T10;
import Recipes.SingularityRecipes_VoidDust.SingularityDustRecipes_T2;
import Recipes.SingularityRecipes_VoidDust.SingularityDustRecipes_T3;
import Recipes.SingularityRecipes_VoidDust.SingularityDustRecipes_T4;
import Recipes.SingularityRecipes_VoidDust.SingularityDustRecipes_T5;
import Recipes.SingularityRecipes_VoidDust.SingularityDustRecipes_T6;
import Recipes.SingularityRecipes_VoidDust.SingularityDustRecipes_T7;
import Recipes.SingularityRecipes_VoidDust.SingularityDustRecipes_T8;
import Recipes.SingularityRecipes_VoidDust.SingularityDustRecipes_T9;
import Recipes.SingularityRecipes_VoidFluid.SingularityFluidRecipes_T0;
import Recipes.SingularityRecipes_VoidFluid.SingularityFluidRecipes_T1;
import Recipes.SingularityRecipes_VoidFluid.SingularityFluidRecipes_T10;
import Recipes.SingularityRecipes_VoidFluid.SingularityFluidRecipes_T2;
import Recipes.SingularityRecipes_VoidFluid.SingularityFluidRecipes_T3;
import Recipes.SingularityRecipes_VoidFluid.SingularityFluidRecipes_T4;
import Recipes.SingularityRecipes_VoidFluid.SingularityFluidRecipes_T5;
import Recipes.SingularityRecipes_VoidFluid.SingularityFluidRecipes_T6;
import Recipes.SingularityRecipes_VoidFluid.SingularityFluidRecipes_T7;
import Recipes.SingularityRecipes_VoidFluid.SingularityFluidRecipes_T8;
import Recipes.SingularityRecipes_VoidFluid.SingularityFluidRecipes_T9;
import Recipes.SingularityRecipes_VoidGem.SingularityGemRecipes;
import Recipes.SingularityRecipes_VoidIngot.SingularityIngotRecipes_T10;
import Recipes.SingularityRecipes_VoidOre.SingularityOreRecipes_T0;
import Recipes.SingularityRecipes_VoidOre.SingularityOreRecipes_T1;
import Recipes.SingularityRecipes_VoidOre.SingularityOreRecipes_T10;
import Recipes.SingularityRecipes_VoidOre.SingularityOreRecipes_T2;
import Recipes.SingularityRecipes_VoidOre.SingularityOreRecipes_T3;
import Recipes.SingularityRecipes_VoidOre.SingularityOreRecipes_T4;
import Recipes.SingularityRecipes_VoidOre.SingularityOreRecipes_T5;
import Recipes.SingularityRecipes_VoidOre.SingularityOreRecipes_T6;
import Recipes.SingularityRecipes_VoidOre.SingularityOreRecipes_T7;
import Recipes.SingularityRecipes_VoidOre.SingularityOreRecipes_T8;
import Recipes.SingularityRecipes_VoidOre.SingularityOreRecipes_T9;
import gregtech.api.GregTechAPI;
import gregtech.api.enums.Textures;
import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.metatileentity.implementations.MTEExtendedPowerMultiBlockBase;
import gregtech.api.recipe.check.CheckRecipeResult;
import gregtech.api.recipe.check.CheckRecipeResultRegistry;
import gregtech.api.render.TextureFactory;
import gregtech.api.util.GTUtility;
import gregtech.api.util.MultiblockTooltipBuilder;
import gregtech.api.util.shutdown.ShutDownReasonRegistry;
import gtneioreplugin.plugin.item.ItemDimensionDisplay;

public class Singularity extends MTEExtendedPowerMultiBlockBase<Singularity> implements ISurvivalConstructable {

    public Singularity(int aID, String aName, String aNameRegional) {
        super(aID, aName, aNameRegional);
    }

    private String mLastDimensionOverride = "None";

    public Singularity(String aName) {
        super(aName);
    }

    @Override
    public void saveNBTData(NBTTagCompound aNBT) {
        super.saveNBTData(aNBT);
        aNBT.setString("mLastDimensionOverride", this.mLastDimensionOverride);
        aNBT.setInteger("mode", mode);
        aNBT.setBoolean("mVoidFluidMode", VoidFluidMode);
    }

    @Override
    public void loadNBTData(NBTTagCompound aNBT) {
        super.loadNBTData(aNBT);
        this.mLastDimensionOverride = aNBT.getString("mLastDimensionOverride");
        this.mode = aNBT.getInteger("mode");
        this.VoidFluidMode = aNBT.getBoolean("mVoidFluidMode");
    }

    private static final int mcasingIndex = Textures.BlockIcons.getTextureIndex(
        Textures.BlockIcons.getCasingTextureForId(GTUtility.getCasingTextureIndex(GregTechAPI.sBlockCasings4, 2)));

    // 定义机器结构
    private static final String STRUCTURE_PIECE_MAIN = "main";
    private static final IStructureDefinition<Singularity> STRUCTURE_DEFINITION = StructureDefinition
        .<Singularity>builder()
        .addShape(
            STRUCTURE_PIECE_MAIN,
            transpose(new String[][] { { "hhh", "hhh", "hhh" }, { "h~h", "h h", "hhh" }, { "hhh", "hhh", "hhh" } }))
        .addElement(
            'h',
            buildHatchAdder(Singularity.class).atLeast(OutputHatch, OutputBus, Maintenance)
                .casingIndex(mcasingIndex)
                .dot(1)
                .buildAndChain(onElementPass(Singularity::onCasingAdded, ofBlock(GregTechAPI.sBlockCasings4, 2))))
        .build();

    private int mCasingAmount;

    private void onCasingAdded() {
        mCasingAmount++;
    }

    @Override
    public IStructureDefinition<Singularity> getStructureDefinition() {
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
        tt.addMachineType("Singularity")
            .addInfo("Runs supplied machines as if placed in the world")
            .addInfo("Parallel quantity = 2^x")
            .addInfo("x = Number of machines in the controller")
            .addInfo("You can only place 'GT NEI Ore Plugin' items in controller to get resources.")
            .addInfo("This machine can get two types of resources: Ore and Fluid.")
            .addInfo("Sneak left click controller to switch resources type.")
            .addInfo("Add By: GT Not Hard")
            .addSeparator()
            .beginStructureBlock(3, 3, 3, true)
            .addController("Front center")
            .addCasingInfoRange("Stable Titanium Machine Casing", 4, 24, false)
            .addMaintenanceHatch("Any casing", 1)
            .addOutputBus("Any casing", 1)
            .addOutputHatch("Any casing", 1)
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
        this.mMaintenanceHatches.clear();
        this.mOutputBusses.clear();
        this.mOutputHatches.clear();
        mCasingAmount = 0;
        return checkPiece(STRUCTURE_PIECE_MAIN, 1, 1, 0) && mCasingAmount >= 4 && checkHatches();
    }

    // 检查仓室
    private boolean checkHatches() {
        return mMaintenanceHatches.size() == 1;
    }

    // 获取最大并行数
    private int getMaxParallel() {
        if (getControllerSlot() == null) {
            return 1;
        }
        if (getControllerSlot().stackSize < 31) {
            return (int) Math.pow(2, getControllerSlot().stackSize);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    @Override
    public boolean isCorrectMachinePart(ItemStack aStack) {
        return aStack != null;
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

    @Override
    public IMetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
        return new Singularity(this.mName);
    }

    @Override
    public void onPostTick(IGregTechTileEntity aBaseMetaTileEntity, long aTick) {
        super.onPostTick(aBaseMetaTileEntity, aTick);
    }

    private boolean VoidFluidMode = false;
    private int mode = 0;

    // 潜行左键切换虚空的类型
    @Override
    public void onLeftclick(IGregTechTileEntity aBaseMetaTileEntity, EntityPlayer aPlayer) {
        if (aPlayer.isSneaking() && getBaseMetaTileEntity().isServerSide()) {
            mode = (mode + 1) % 8;
            if (mode == 1) {
                GTUtility.sendChatToPlayer(aPlayer, "mode: Void Ore");
            } else if (mode == 2) {
                GTUtility.sendChatToPlayer(aPlayer, "mode: Void Gem");
            } else if (mode == 3) {
                GTUtility.sendChatToPlayer(aPlayer, "mode: Void Dust");
            } else if (mode == 4) {
                GTUtility.sendChatToPlayer(aPlayer, "mode: Void Fluid");
            } else if (mode == 5) {
                GTUtility.sendChatToPlayer(aPlayer, "mode: Void Ingot");
            } else if (mode == 6) {
                GTUtility.sendChatToPlayer(aPlayer, "mode: Ecosystem");
            } else if (mode == 7) {
                GTUtility.sendChatToPlayer(aPlayer, "mode: Mode Item");
            } else {
                GTUtility.sendChatToPlayer(aPlayer, "mode: Pachinko");
            }
        }
        super.onLeftclick(aBaseMetaTileEntity, aPlayer);
    }

    // 机器运行逻辑
    @Nonnull
    @Override
    public CheckRecipeResult checkProcessing() {
        mMaxProgresstime = 60;
        String dim = Optional.ofNullable(this.mInventory[1])
            .filter(s -> s.getItem() instanceof ItemDimensionDisplay)
            .map(ItemDimensionDisplay::getDimension)
            .orElse("None");
        ItemStack slot = getControllerSlot();

        // Singularity of Void Ore
        if (slot != null && mode == 1) {
            if (!Objects.equals(dim, mLastDimensionOverride)) {
                mLastDimensionOverride = dim;
            }

            ItemStack[] OreRecipes = switch (dim) {
                case "Ow", "Ne", "TF", "ED", "EA" -> SingularityOreRecipes_T0.VoidOreRecipes_T0.get(dim);
                case "Mo" -> SingularityOreRecipes_T1.VoidOreRecipes_T1.get(dim);
                case "De", "Ma", "Ph" -> SingularityOreRecipes_T2.VoidOreRecipes_T2.get(dim);
                case "As", "Ca", "Ce", "Eu", "Ga", "Rb" -> SingularityOreRecipes_T3.VoidOreRecipes_T3.get(dim);
                case "Io", "Me", "Ve" -> SingularityOreRecipes_T4.VoidOreRecipes_T4.get(dim);
                case "En", "Mi", "Ob", "Ti", "Ra" -> SingularityOreRecipes_T5.VoidOreRecipes_T5.get(dim);
                case "Pr", "Tr" -> SingularityOreRecipes_T6.VoidOreRecipes_T6.get(dim);
                case "Ha", "KB", "MM", "Pl" -> SingularityOreRecipes_T7.VoidOreRecipes_T7.get(dim);
                case "BC", "BE", "BF", "CB", "TE", "VB" -> SingularityOreRecipes_T8.VoidOreRecipes_T8.get(dim);
                case "An", "Ho", "Mh", "MB", "Np", "Se" -> SingularityOreRecipes_T9.VoidOreRecipes_T9.get(dim);
                case "DD" -> SingularityOreRecipes_T10.VoidOreRecipes_T10.get(dim);
                default -> null;
            };

            if (OreRecipes != null) {

                // 随机输出
                for (int mLoop = 0; mLoop < 64; mLoop++) {
                    Random random = new Random();
                    int index = random.nextInt(OreRecipes.length);
                    ItemStack recipeOre = OreRecipes[index];
                    recipeOre.stackSize = getMaxParallel();
                    for (int mStack = 0; mStack < 64; mStack++) {
                        addOutput(recipeOre);
                    }
                }

                // Debug全部输出
                for (ItemStack oreRecipe : OreRecipes) {
                    System.out.println(oreRecipe.getDisplayName());
                    oreRecipe.stackSize = getMaxParallel();
                    for (int mStack = 0; mStack < 128; mStack++) {
                        addOutput(oreRecipe);
                    }
                }

                return CheckRecipeResultRegistry.SUCCESSFUL;
            }
        }

        // Singularity of Void Gem
        else if (slot != null && mode == 2) {
            if (!Objects.equals(dim, mLastDimensionOverride)) {
                mLastDimensionOverride = dim;
            }

            ItemStack[] GemRecipes = SingularityGemRecipes.VoidGemRecipes.get(dim);

            if (GemRecipes != null) {
                // 随机输出
                for (int mLoop = 0; mLoop < 64; mLoop++) {
                    Random random = new Random();
                    int index = random.nextInt(GemRecipes.length);
                    ItemStack recipeGem = GemRecipes[index];
                    recipeGem.stackSize = getMaxParallel();
                    for (int mStack = 0; mStack < 64; mStack++) {
                        addOutput(recipeGem);
                    }
                }

                // Debug全部输出
                for (ItemStack gemRecipe : GemRecipes) {
                    // System.out.println(gemRecipe.getItem());
                    gemRecipe.stackSize = getMaxParallel();
                    for (int mStack = 0; mStack < 128; mStack++) {
                        addOutput(gemRecipe);
                    }
                }

                return CheckRecipeResultRegistry.SUCCESSFUL;
            }
        }

        // Singularity of Void Dust
        else if (slot != null && mode == 3) {
            if (!Objects.equals(dim, mLastDimensionOverride)) {
                mLastDimensionOverride = dim;
            }

            ItemStack[] DustRecipes = switch (dim) {
                case "Ow", "Ne", "TF", "ED", "EA" -> SingularityDustRecipes_T0.VoidDustRecipes_T0.get(dim);
                case "Mo" -> SingularityDustRecipes_T1.VoidDustRecipes_T1.get(dim);
                case "De", "Ma", "Ph" -> SingularityDustRecipes_T2.VoidDustRecipes_T2.get(dim);
                case "As", "Ca", "Ce", "Eu", "Ga", "Rb" -> SingularityDustRecipes_T3.VoidDustRecipes_T3.get(dim);
                case "Io", "Me", "Ve" -> SingularityDustRecipes_T4.VoidDustRecipes_T4.get(dim);
                case "En", "Mi", "Ob", "Ti", "Ra" -> SingularityDustRecipes_T5.VoidDustRecipes_T5.get(dim);
                case "Pr", "Tr" -> SingularityDustRecipes_T6.VoidDustRecipes_T6.get(dim);
                case "Ha", "KB", "MM", "Pl" -> SingularityDustRecipes_T7.VoidDustRecipes_T7.get(dim);
                case "BC", "BE", "BF", "CB", "TE", "VB" -> SingularityDustRecipes_T8.VoidDustRecipes_T8.get(dim);
                case "An", "Ho", "Mh", "MB", "Np", "Se" -> SingularityDustRecipes_T9.VoidDustRecipes_T9.get(dim);
                case "DD" -> SingularityDustRecipes_T10.VoidDustRecipes_T10.get(dim);
                default -> null;
            };

            if (DustRecipes != null) {
                // 随机输出
                for (int mLoop = 0; mLoop < 64; mLoop++) {
                    Random random = new Random();
                    int index = random.nextInt(DustRecipes.length);
                    ItemStack recipeDust = DustRecipes[index];
                    recipeDust.stackSize = getMaxParallel();
                    for (int mStack = 0; mStack < 64; mStack++) {
                        addOutput(recipeDust);
                    }
                }

                // Debug全部输出
                for (ItemStack dustRecipe : DustRecipes) {
                    // System.out.println(dustRecipe.getItem());
                    dustRecipe.stackSize = getMaxParallel();
                    for (int mStack = 0; mStack < 128; mStack++) {
                        addOutput(dustRecipe);
                    }
                }

                return CheckRecipeResultRegistry.SUCCESSFUL;
            }
        }

        // Singularity of Void Fluid
        else if (slot != null && mode == 4) {
            if (!Objects.equals(dim, mLastDimensionOverride)) {
                mLastDimensionOverride = dim;
            }

            FluidStack[] FluidRecipes = switch (dim) {
                case "Ow", "Ne", "TF", "ED", "EA" -> SingularityFluidRecipes_T0.VoidFluidRecipes_T0.get(dim);
                case "Mo" -> SingularityFluidRecipes_T1.VoidFluidRecipes_T1.get(dim);
                case "De", "Ma", "Ph" -> SingularityFluidRecipes_T2.VoidFluidRecipes_T2.get(dim);
                case "As", "Ca", "Ce", "Eu", "Ga", "Rb" -> SingularityFluidRecipes_T3.VoidFluidRecipes_T3.get(dim);
                case "Io", "Me", "Ve" -> SingularityFluidRecipes_T4.VoidFluidRecipes_T4.get(dim);
                case "En", "Mi", "Ob", "Ti", "Ra" -> SingularityFluidRecipes_T5.VoidFluidRecipes_T5.get(dim);
                case "Pr", "Tr" -> SingularityFluidRecipes_T6.VoidFluidRecipes_T6.get(dim);
                case "Ha", "KB", "MM", "Pl" -> SingularityFluidRecipes_T7.VoidFluidRecipes_T7.get(dim);
                case "BC", "BE", "BF", "CB", "TE", "VB" -> SingularityFluidRecipes_T8.VoidFluidRecipes_T8.get(dim);
                case "An", "Ho", "Mh", "MB", "Np", "Se" -> SingularityFluidRecipes_T9.VoidFluidRecipes_T9.get(dim);
                case "DD" -> SingularityFluidRecipes_T10.VoidFluidRecipes_T10.get(dim);
                default -> null;
            };

            if (FluidRecipes != null) {

                // 随机输出
                for (int mLoop = 0; mLoop < 64; mLoop++) {
                    Random random = new Random();
                    int Index = random.nextInt(FluidRecipes.length);
                    FluidStack recipeFluid = FluidRecipes[Index];
                    recipeFluid.amount = getMaxParallel();
                    for (int mStack = 0; mStack < 1000; mStack++) {
                        addOutput(recipeFluid);
                    }
                }

                // Debug全部输出
                for (FluidStack fluidRecipes : FluidRecipes) {
                    // System.out.println(fluidRecipes.getLocalizedName());
                    fluidRecipes.amount = getMaxParallel();
                    for (int mStack = 0; mStack < 1000; mStack++) {
                        addOutput(fluidRecipes);
                    }
                }

                return CheckRecipeResultRegistry.SUCCESSFUL;
            }
        } else if (slot != null && mode == 5) {
            if (!Objects.equals(dim, mLastDimensionOverride)) {
                mLastDimensionOverride = dim;
            }

            ItemStack[] IngotRecipes = switch (dim) {
                // case "Ow", "Ne", "TF", "ED", "EA" -> SingularityIngotRecipes_T10.VoidIngotRecipes_T10.get(dim);

                case "Mo" -> SingularityDustRecipes_T1.VoidDustRecipes_T1.get(dim);
                case "De", "Ma", "Ph" -> SingularityDustRecipes_T2.VoidDustRecipes_T2.get(dim);
                case "As", "Ca", "Ce", "Eu", "Ga", "Rb" -> SingularityDustRecipes_T3.VoidDustRecipes_T3.get(dim);
                case "Io", "Me", "Ve" -> SingularityDustRecipes_T4.VoidDustRecipes_T4.get(dim);
                case "En", "Mi", "Ob", "Ti", "Ra" -> SingularityDustRecipes_T5.VoidDustRecipes_T5.get(dim);
                case "Pr", "Tr" -> SingularityDustRecipes_T6.VoidDustRecipes_T6.get(dim);
                case "Ha", "KB", "MM", "Pl" -> SingularityDustRecipes_T7.VoidDustRecipes_T7.get(dim);
                case "BC", "BE", "BF", "CB", "TE", "VB" -> SingularityDustRecipes_T8.VoidDustRecipes_T8.get(dim);
                case "An", "Ho", "Mh", "MB", "Np", "Se" -> SingularityDustRecipes_T9.VoidDustRecipes_T9.get(dim);
                case "DD" -> SingularityIngotRecipes_T10.VoidIngotRecipes_T10.get(dim);

                default -> null;
            };

            if (IngotRecipes != null) {

                // 随机输出
                for (int mLoop = 0; mLoop < 64; mLoop++) {
                    Random random = new Random();
                    int index = random.nextInt(IngotRecipes.length);
                    ItemStack recipeIngot = IngotRecipes[index];
                    recipeIngot.stackSize = getMaxParallel();
                    for (int mStack = 0; mStack < 64; mStack++) {
                        addOutput(recipeIngot);
                    }
                }

                /*
                 * // Debug全部输出
                 * for (ItemStack ingotRecipe : IngotRecipes) {
                 * ItemStack recipeIngot = ingotRecipe
                 * .copy();
                 * System.out.println(recipeIngot.getDisplayName());
                 * recipeIngot.stackSize = getMaxParallel();
                 * for (int mStack = 0; mStack < 128; mStack++) {
                 * addOutput(recipeIngot);
                 * }
                 * }
                 */
            }
            return CheckRecipeResultRegistry.SUCCESSFUL;
        }

        // Singularity of Ecosystem
        else if (slot != null && mode == 6) {
            int machineID = getControllerSlot().getItemDamage();
            ItemStack[] EcosystemRecipes = switch (machineID) {
                // "Industrial Apiary" of Comb
                case 9399 -> SingularityEcosystemRecipes_Comb.EcosystemRecipes_Comb.get(machineID);

                // "Basic Microwave" of Food
                case 311 -> SingularityEcosystemRecipes_Food.EcosystemRecipes_Food.get(machineID);

                // "Tree Growth Simulator"
                case 836 -> SingularityEcosystemRecipes_TreeGrowth.EcosystemRecipes_TreeGrowth.get(machineID);
                default -> null;
            };

            if (EcosystemRecipes != null) {

                // 随机输出
                for (int mLoop = 0; mLoop < 64; mLoop++) {
                    Random random = new Random();
                    int index = random.nextInt(EcosystemRecipes.length);
                    ItemStack recipeEcosystem = EcosystemRecipes[index];
                    recipeEcosystem.stackSize = getMaxParallel();
                    for (int mStack = 0; mStack < 64; mStack++) {
                        addOutput(recipeEcosystem);
                    }
                }

                // Debug全部输出
                for (ItemStack ecosystemRecipes : EcosystemRecipes) {
                    System.out.println(ecosystemRecipes.getDisplayName());
                    ecosystemRecipes.stackSize = getMaxParallel();
                    for (int mStack = 0; mStack < 128; mStack++) {
                        addOutput(ecosystemRecipes);
                    }
                }
            }
            return CheckRecipeResultRegistry.SUCCESSFUL;
        }

        else if (slot != null && mode == 7) {
            String key = slot.getUnlocalizedName();
            System.out.println("DisplayName = " + slot.getDisplayName());
            System.out.println("Key = " + key);
            ItemStack[] ModItemRecipes = switch (key) {
                // AdvancedSolarPanel - Advanced Solar Panel
                case "blockAdvancedSolarPanel" -> convertListToArray(getCreativeItemsByMod("AdvancedSolarPanel"));
                // AE2FluidCraft - Certus Quartz Tank
                case "tile.certus_quartz_tank" -> convertListToArray(getCreativeItemsByMod("AE2FluidCraft"));
                // AE2Stuff - Advanced Wireless Setup Kit
                case "item.ae2stuff.AdvWirelessKit" -> convertListToArray(getCreativeItemsByMod("AE2Stuff"));
                // AppliedEnergistics2 - Quartz Glass
                case "tile.appliedenergistics2.BlockQuartzGlass" -> convertListToArray(
                    getCreativeItemsByMod("AppliedEnergistics2"));
                // Automagy - Redcrystal
                case "tile.blockRedcrystal" -> convertListToArray(getCreativeItemsByMod("Automagy"));
                // Avaritia - Compressed Crafting Table
                case "tile.compressed_workbench" -> convertListToArray(getCreativeItemsByMod("Avaritia"));

                // BartWorks - Nickel-Zinc Ferrite Block
                case "BW_Machinery_Casings.0" -> convertListToArray(getCreativeItemsByMod("BartWorks"));
                // BiblioCraft - Desk Bell
                case "tile.BiblioBell" -> convertListToArray(getCreativeItemsByMod("BiblioCraft"));
                // BiblioWoodsBoPEdition - Sacred Oak Fancy Sign
                case "SacredOakFancySign" -> convertListToArray(getCreativeItemsByMod("BiblioWoodsBoPEdition"));
                // BiblioWoodsForestryEdition - Balsa Fancy Sign
                case "BalsaFancySign" -> convertListToArray(getCreativeItemsByMod("BiblioWoodsForestryEdition"));
                // BiblioWoodsNaturaEdition - Eucalyptus Fancy Sign
                case "EucalyptusFancySign" -> convertListToArray(getCreativeItemsByMod("BiblioWoodsNaturaEdition"));
                // BloodArsenal - Blood Infused Wooden Plank
                case "tile.blood_infused_planks" -> convertListToArray(getCreativeItemsByMod("BloodArsenal"));
                // BloodMagic - Wooden Brace
                case "item.bloodMagicBaseItem.WoodBrace" -> convertListToArray(getCreativeItemsByMod("BloodMagic"));
                // Botania - Livingrock
                case "tile.livingrock0" -> convertListToArray(getCreativeItemsByMod("Botania"));
                // Botany - Soil Meter
                case "item.soilMeter" -> convertListToArray(getCreativeItemsByMod("Botany"));

                // CarpentersBlocks - Carpenter's Block
                case "tile.blockCarpentersBlock" -> convertListToArray(getCreativeItemsByMod("CarpentersBlocks"));
                // CatWalks - Steel Grate
                case "item.steel_grate" -> convertListToArray(getCreativeItemsByMod("CatWalks"));
                // Chisel - Auto Chisel
                case "tile.chisel.autoChisel" -> convertListToArray(getCreativeItemsByMod("Chisel"));
                // CompactKineticGenerators - Kinetic Gearbox Rotor (Iridium)
                case "item.compactkineticgenerators:IridiumRotor" -> convertListToArray(
                    getCreativeItemsByMod("CompactKineticGenerators"));
                // Computronics - Iron Note Block
                case "tile.computronics.ironNoteBlock" -> convertListToArray(getCreativeItemsByMod("Computronics"));
                // CookingForBlockheads - Cooking Table
                case "tile.cookingforblockheads:cookingtable" -> convertListToArray(
                    getCreativeItemsByMod("CookingForBlockheads"));
                // CropsPlusPlus - Goldfish
                case "item.foodGoldfish" -> convertListToArray(getCreativeItemsByMod("CropsPlusPlus"));

                // DraconicEvolution - Draconium Infused Obsidian
                case "tile.draconicevolution:infusedObsidian" -> convertListToArray(
                    getCreativeItemsByMod("DraconicEvolution"));

                // EnderIO - Basic Capacitor
                case "enderio.basicCapacitor" -> convertListToArray(getCreativeItemsByMod("EnderIO"));
                // EnhancedLootBags - LootBag (Basic Stone Age)
                case "tile.dungeonLight_0" -> convertListToArray(getCreativeItemsByMod("EnhancedLootBags"));
                // EternalSingularity - Eternal Singularity
                case "item.eternal.singularity" -> convertListToArray(getCreativeItemsByMod("EternalSingularity"));
                // EtFuturumRequiem - Ancient Debris
                case "tile.etfuturum.ancient_debris" -> convertListToArray(getCreativeItemsByMod("EtFuturumRequiem"));
                // ExtraBees - Mutator
                case "tile.alveary" -> convertListToArray(getCreativeItemsByMod("ExtraBees"));
                // ExtraTrees - Carpentry Hammer
                case "item.hammer" -> convertListToArray(getCreativeItemsByMod("ExtraTrees"));
                // ExtraUtilities - Slightly Larger Chest
                case "tile.extrautils:chestFull" -> convertListToArray(getCreativeItemsByMod("ExtraUtilities"));

                // ForbiddenMagic - Gluttony Shard
                case "item.GluttonyShard" -> convertListToArray(getCreativeItemsByMod("ForbiddenMagic"));
                // Forestry - Sturdy Casing
                case "item.for.sturdyMachine" -> convertListToArray(getCreativeItemsByMod("Forestry"));

                // Gadomancy - Mirrored Jar
                case "tile.BlockRemoteJar" -> convertListToArray(getCreativeItemsByMod("Gadomancy"));
                // GalacticraftAmunRa - Rocket Engine Jet
                case "tile.mothershipEngineRocketJet" -> convertListToArray(
                    getCreativeItemsByMod("GalacticraftAmunRa"));
                // GalacticraftCore - Rocket Launch Pad
                case "tile.landingPad.landingPad" -> convertListToArray(getCreativeItemsByMod("GalacticraftCore"));
                // GalacticraftMars - Hydrogen Pipe
                case "tile.hydrogenPipe" -> convertListToArray(getCreativeItemsByMod("GalacticraftMars"));
                // GalaxySpace - Solar Wind Panel
                case "tile.SolarWindPanel" -> convertListToArray(getCreativeItemsByMod("GalaxySpace"));
                // Gendustry - Item Eject Cover
                case "item.gendustry.EjectCover" -> convertListToArray(getCreativeItemsByMod("Gendustry"));
                // Genetics - Reinforced Casing
                case "item.misc" -> convertListToArray(getCreativeItemsByMod("Genetics"));
                // GGFab - Single Use File
                case "gt.ggfab.d1.0" -> convertListToArray(getCreativeItemsByMod("GGFab"));
                // GoodGenerator - Wrap of ULV Circuits
                case "item.circuitWrap.0" -> convertListToArray(getCreativeItemsByMod("GoodGenerator"));
                // GraviSuite - Superconductor Cover
                case "item.itemSuperConductorCover" -> convertListToArray(getCreativeItemsByMod("GraviSuite"));
                // GregTech - ULV Machine Casing
                case "gt.blockcasings.0" -> convertListToArray(getCreativeItemsByMod("GregTech"));
                // GTNHIntergalactic - Nanotube Spool
                case "item.nanotubeSpool" -> convertListToArray(getCreativeItemsByMod("GTNHIntergalactic"));
                // GTNHLanthanides - Shielded Accelerator Casing
                case "casing.shielded_accelerator" -> convertListToArray(getCreativeItemsByMod("GTNHLanthanides"));
                // GTPlusPlus - Integral Encasement I
                case "gtplusplus.blocktieredcasings.1.0" -> convertListToArray(getCreativeItemsByMod("GTPlusPlus"));

                // HardcoreEnderExpansion - Altar Nexus
                case "item.altarNexus" -> convertListToArray(getCreativeItemsByMod("HardcoreEnderExpansion"));

                // IC2NuclearControl - Thermal Monitor
                case "tile.blockThermalMonitor" -> convertListToArray(getCreativeItemsByMod("IC2NuclearControl"));
                // IndustrialCraft2 - Basic Machine Casing
                case "ic2.blockMachine" -> convertListToArray(getCreativeItemsByMod("IndustrialCraft2"));

                // KekzTech - YSZ Ceramic Electrolyte Unit
                case "tile.kekztech_yszceramicelectrolyteunit_block" -> convertListToArray(
                    getCreativeItemsByMod("KekzTech"));
                // KubaTech - Tea Acceptor
                case "kubablock.tea_acceptor" -> convertListToArray(getCreativeItemsByMod("KubaTech"));

                // LogisticsPipes - Basic Logistics Pipe
                case "item.PipeItemsBasicLogistics" -> convertListToArray(getCreativeItemsByMod("LogisticsPipes"));

                // MagicBees - Manasteel Grafter
                case "item.manasteelGrafter" -> convertListToArray(getCreativeItemsByMod("MagicBees"));
                // Minecraft - Stone
                case "tile.stone" -> convertListToArray(getCreativeItemsByMod("Minecraft"));

                // Natura - Green Glowshroom
                case "block.glowshroom.green" -> convertListToArray(getCreativeItemsByMod("Natura"));

                // OpenBlocks - Elevator
                case "tile.openblocks.elevator" -> convertListToArray(getCreativeItemsByMod("OpenBlocks"));
                // OpenComputers - Computer Case (Tier 1)
                case "tile.oc.case1" -> convertListToArray(getCreativeItemsByMod("OpenComputers"));
                // OpenModularTurrets - Sensor (Tier 1)
                case "item.sensorOne" -> convertListToArray(getCreativeItemsByMod("OpenModularTurrets"));
                // OpenSecurity - Magnetic Card Reader
                case "tile.magreader" -> convertListToArray(getCreativeItemsByMod("OpenSecurity"));

                // PamsHarvestCraft - Fish Trap
                case "tile.fishtrap" -> convertListToArray(getCreativeItemsByMod("PamsHarvestCraft"));
                // PamsHarvestTheNether - Ignis Fruit Sapling
                case "tile.netherSapling" -> convertListToArray(getCreativeItemsByMod("PamsHarvestTheNether"));
                // Railcraft - Block of Coal Coke
                case "tile.railcraft.cube.coke" -> convertListToArray(getCreativeItemsByMod("Railcraft"));
                // RandomThings - Void Stone
                case "item.voidStone" -> convertListToArray(getCreativeItemsByMod("RandomThings"));
                // RemoteIO - Water Reservoir
                case "tile.machine.reservoir" -> convertListToArray(getCreativeItemsByMod("RemoteIO"));

                // SGCraft - Stargate Base
                case "tile.gcewing_sg:stargateBase" -> convertListToArray(getCreativeItemsByMod("SGCraft"));
                // StevesCarts2 - Cargo Manager
                case "tile.SC2:BlockCargoManager" -> convertListToArray(getCreativeItemsByMod("StevesCarts2"));
                // StevesFactoryManager - Machine Inventory Manager
                case "tile.sfm.BlockMachineManager" -> convertListToArray(
                    getCreativeItemsByMod("StevesFactoryManager"));
                // StorageDrawers - Framing Table
                case "tile.framingTable" -> convertListToArray(getCreativeItemsByMod("StorageDrawers"));
                // SuperSolarPanels - Solar Light Splitter
                case "item.SpectralLightSplitter" -> convertListToArray(getCreativeItemsByMod("SuperSolarPanels"));

                // TaintedMagic - Warpwood Sapling
                case "tile.BlockWarpwoodSapling" -> convertListToArray(getCreativeItemsByMod("TaintedMagic"));
                // TecTech - High Power Casing
                case "gt.blockcasingsTT.0" -> convertListToArray(getCreativeItemsByMod("TecTech"));
                // Thaumcraft - Greatwood Sapling
                case "tile.blockCustomPlant.0" -> convertListToArray(getCreativeItemsByMod("Thaumcraft"));
                // ThaumicBases - Quicksilver Block
                case "tile.quicksilverBlock" -> convertListToArray(getCreativeItemsByMod("ThaumicBases"));
                // ThaumicEnergistics - Iron Gear Box
                case "thaumicenergistics.block.gear.box" -> convertListToArray(
                    getCreativeItemsByMod("ThaumicEnergistics"));
                // ThaumicExploration - White Floating Candle
                case "tile.thaumicexploration:floatCandle.0" -> convertListToArray(
                    getCreativeItemsByMod("ThaumicExploration"));
                // ThaumicHorizons - Chocolate Bar
                case "item.chocolate" -> convertListToArray(getCreativeItemsByMod("ThaumicHorizons"));
                // ThaumicTinkerer - Ichor
                case "item.kamiResource" -> convertListToArray(getCreativeItemsByMod("ThaumicTinkerer"));
                // TinkerConstruct - Slimy Sapling
                case "block.slime.sapling.bluegreen" -> convertListToArray(getCreativeItemsByMod("TinkerConstruct"));
                // TinkersDefence - Dogbearium Ingot
                case "item.DogbeariumIngot" -> convertListToArray(getCreativeItemsByMod("TinkersDefence"));
                // TinkersGregworks - Aluminium Tool Rod
                case "Aluminium" -> convertListToArray(getCreativeItemsByMod("TinkersGregworks"));
                // Translocator - Diamond Nugget
                case "item.translocator:diamondNugget" -> convertListToArray(getCreativeItemsByMod("Translocator"));
                // TwilightForest - Raven's Feather
                case "item.tfFeather" -> convertListToArray(getCreativeItemsByMod("TwilightForest"));

                // UniversalSingularities - Coal Singularity
                case "item.universalSingularities.vanilla.coal" -> convertListToArray(
                    getCreativeItemsByMod("UniversalSingularities"));

                // Witchery - Leaping Lily
                case "tile.witchery:leapinglily" -> convertListToArray(getCreativeItemsByMod("Witchery"));
                // WitchingGadgets - Spinning Wheel
                case "tile.WG_WoodenDevice.spinningWheel" -> convertListToArray(
                    getCreativeItemsByMod("WitchingGadgets"));

                // ZTones - Ztone Tile
                case "tile.ztones:stoneTile" -> convertListToArray(getCreativeItemsByMod("ZTones"));

                default -> null;
            };
            if (ModItemRecipes != null) {

                // 随机输出
                for (int mLoop = 0; mLoop < 64; mLoop++) {
                    Random random = new Random();
                    int index = random.nextInt(ModItemRecipes.length);
                    ItemStack recipeModItem = ModItemRecipes[index];
                    recipeModItem.stackSize = getMaxParallel();
                    for (int mStack = 0; mStack < 64; mStack++) {
                        addOutput(recipeModItem);
                    }
                }

                // Debug全部输出
                for (ItemStack modItemRecipes : ModItemRecipes) {
                    // System.out.println(modItemRecipes.getDisplayName());
                    modItemRecipes.stackSize = getMaxParallel();
                    for (int mStack = 0; mStack < 128; mStack++) {
                        addOutput(modItemRecipes);
                    }
                }
            }
            return CheckRecipeResultRegistry.SUCCESSFUL;
        }
        // Singularity of Pachinko
        else {
            ItemStack[] PachinkoRecipes = switch (getControllerSlot().getItemDamage()) {

                // ULV Tier: "1x Red Alloy Wire" - 2000
                // LV Tier: "1x Redstone Alloy Wire" - 30645
                // MV Tier: "1x Superconductor MV Wire" - 2320
                // HV Tier: "1x Superconductor HV Wire" - 2340
                // EV Tier: "1x Superconductor EV Wire" - 2360
                // IV Tier: "1x Superconductor IV Wire" - 2380
                // LuV Tier: "1x Superconductor LuV Wire" - 2400
                // ZPM Tier: "1x Superconductor ZPM Wire" - 2420
                // UV Tier: "1x Superconductor UV Wire" - 2440
                // UHV Tier: "1x Superconductor UHV Wire" - 2020
                // UEV Tier: "1x Superconductor UEV Wire" - 2026
                // UIV Tier: "1x Superconductor UIV Wire" - 2081
                // UMV Tier: "1x Superconductor UMV Wire" - 2089
                // UXV Tier: "1x Black Plutonium Wire" - 11390
                // MAX Tier: "1x SpaceTime Wire" - 2606
                case 2000, 30645, 2320, 2340, 2360, 2380, 2400, 2420, 2440, 2020, 2026, 2081, 2089, 11390, 2606 -> SingularityPachinkoRecipes_GT_Cable.PachinkoRecipes_GT_Cable
                    .get(getControllerSlot().getItemDamage());

                // Steam Tier: "Steam Hatch" - 31040
                // ULV Tier: "ULV Energy Hatch" - 40
                // LV Tier: "LV Energy Hatch" - 41
                // MV Tier: "MV Energy Hatch" - 42
                // HV Tier: "HV Energy Hatch" - 43
                // EV Tier: "EV Energy Hatch" - 44
                // IV Tier: "IV Energy Hatch" - 45
                // LuV Tier: "LuV Energy Hatch" - 46
                // ZPM Tier: "ZPM Energy Hatch" - 47
                // UV Tier: "UV Energy Hatch" - 48
                // UHV Tier: "UHV Energy Hatch" - 49
                // UEV Tier: "UEV Energy Hatch" - 11300
                // UIV Tier: "UIV Energy Hatch" - 11301
                // UMV Tier: "UMV Energy Hatch" - 11302
                // UXV Tier: "UXV Energy Hatch" - 11303
                // MAX Tier: "MAX Wireless Energy Hatch" - 286
                case 31040, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 11300, 11301, 11302, 11303, 286 -> SingularityPachinkoRecipes_GT_Hatch.PachinkoRecipes_GT_Hatch
                    .get(getControllerSlot().getItemDamage());

                // Steam Tier: "Bronze Hull" - 1
                // ULV Tier: "ULV Machine Hull" - 10
                // LV Tier: "LV Machine Hull" - 11
                // MV Tier: "MV Machine Hull" - 12
                // HV Tier: "HV Machine Hull" - 13
                // EV Tier: "EV Machine Hull" - 14
                // IV Tier: "IV Machine Hull" - 15
                // LuV Tier: "LuV Machine Hull" - 16
                // ZPM Tier: "ZPM Machine Hull" - 17
                // UV Tier: "UV Machine Hull" - 18
                // UHV Tier: "UHV Machine Hull" - 19
                // UEV Tier: "UEV Machine Hull" - 11230
                // UIV Tier: "UIV Machine Hull" - 11231
                // UMV Tier: "UMV Machine Hull" - 11232
                // UXV Tier: "UXV Machine Hull" - 11233
                // MAX Tier: "MAX Machine Hull" - 11234
                case 1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 11230, 11231, 11232, 11233, 11234 -> SingularityPachinkoRecipes_GT_Misc.PachinkoRecipes_GT_Misc
                    .get(getControllerSlot().getItemDamage());

                // "Bricked Blast Furnace" - 140
                // "Fluid Drilling Rig II" - 141
                // "Fluid Drilling Rig III" - 142
                // "Concrete Backfiller" - 143
                // "Advanced Concrete Backfiller" - 144
                // "Infinite Fluid Drilling Rig" - 148
                // "Fluid Drilling Rig IV" - 149
                // "PCB Factory" - 356
                // "Nano Forge" - 357
                // "Magnetic Flux Exhibitor" - 358
                case 140, 141, 142, 143, 144, 148, 149, 356, 357, 358 -> SingularityPachinkoRecipes_GT_MultiBlock_1.PachinkoRecipes_GT_MultiBlock_1
                    .get(getControllerSlot().getItemDamage());

                // "TurboCan Pro" - 360
                // "Fluid Shaper" - 366
                // "Solar Factory" - 367
                // "Industrial Precision Lathe" - 686
                // "Industrial Autoclave" - 687
                // "Nuclear Salt Processing Plant" - 749
                // "Thorium Reactor [LFTR]" - 751
                // "Industrial Centrifuge" - 790
                // "Industrial Coke Oven" - 791
                // "Industrial Material Press" - 792
                case 360, 366, 367, 686, 687, 749, 751, 790, 791, 792 -> SingularityPachinkoRecipes_GT_MultiBlock_1.PachinkoRecipes_GT_MultiBlock_1
                    .get(getControllerSlot().getItemDamage());

                // "Industrial Electrolyzer" - 796
                // "Industrial Maceration Stack" - 797
                // "Industrial Wire Factory" - 798
                // "Matter Fabrication CPU" - 799
                // "Alloy Blast Smelter" - 810
                // "Industrial Mixing Machine" - 811
                // "Power Station Control Node" - 812
                // "COMET - Compact Cyclotron" - 828
                // "Zhuhai - Fishing Port" - 829
                // "Reactor Fuel Processing Plant" - 835
                case 796, 797, 798, 799, 810, 811, 812, 828, 829, 835 -> SingularityPachinkoRecipes_GT_MultiBlock_1.PachinkoRecipes_GT_MultiBlock_1
                    .get(getControllerSlot().getItemDamage());

                // "Tree Growth Simulator" - 836
                // "Large Sifter Control Block" - 840
                // "Large Thermal Refinery" - 849
                // "Ore Washing Plant" - 850
                // "Industrial Extrusion Machine" - 859
                // "High Current Industrial Arc Furnace" - 862
                // "Solar Tower" - 863
                // "XL Turbo Steam Turbine" - 865
                // "XL Turbo HP Steam Turbine" - 866
                // "Thermal Boiler" - 875
                case 836, 840, 849, 850, 859, 862, 863, 865, 866, 875 -> SingularityPachinkoRecipes_GT_MultiBlock_1.PachinkoRecipes_GT_MultiBlock_1
                    .get(getControllerSlot().getItemDamage());

                // "Large Scale Auto-Assembler v1.01" - 876
                // "Cryogenic Freezer" - 910
                // "Amazon Warehousing Depot" - 942
                // Volcanus - 963
                // Density^2 - 964
                // "FusionTech MK IV" - 965
                // "FusionTech MK V" - 975
                // "Industrial Cutting Factory" - 992
                // Utupu-Tanuri - 995
                // "Rocketdyne F-1A Engine" - 996
                case 876, 910, 942, 963, 964, 965, 975, 992, 995, 996 -> SingularityPachinkoRecipes_GT_MultiBlock_1.PachinkoRecipes_GT_MultiBlock_1
                    .get(getControllerSlot().getItemDamage());

                // "Algae Farm" - 997
                // "ExxonMobil Chemical Plant" - 998
                case 997, 998 -> SingularityPachinkoRecipes_GT_MultiBlock_1.PachinkoRecipes_GT_MultiBlock_1
                    .get(getControllerSlot().getItemDamage());

                // "Electric Blast Furnace" - 1000
                // "Implosion Compressor" - 1001
                // "Vacuum Freezer" - 1002
                // "Multi Smelter" - 1003
                // "Dimensionally Transcendent Plasma Forge" - 1004
                // "Transcendent Plasma Mixer" - 1006
                // "Large Bronze Boiler" - 1020
                // "Large Steel Boiler" - 1021
                // "Large Titanium Boiler" - 1022
                // "Large Tungstensteel Boiler" - 1023
                case 1000, 1001, 1002, 1003, 1004, 1006, 1020, 1021, 1022, 1023 -> SingularityPachinkoRecipes_GT_MultiBlock_2.PachinkoRecipes_GT_MultiBlock_2
                    .get(getControllerSlot().getItemDamage());

                // "Distillation Tower" - 1126
                // "Large Steam Turbine" - 1131
                // "Integrated Ore Factory" - 1132
                // "Large Gas Turbine" - 1151
                // "Large HP Steam Turbine" - 1152
                // "Large Plasma Turbine" - 1153
                // "Large Heat Exchanger" - 1154
                // "Fluid Drilling Rig" - 1157
                // "Ore Drilling Plant" - 1158
                // "Pyrolyse Oven" - 1159
                case 1126, 1131, 1132, 1151, 1152, 1153, 1154, 1157, 1158, 1159 -> SingularityPachinkoRecipes_GT_MultiBlock_2.PachinkoRecipes_GT_MultiBlock_2
                    .get(getControllerSlot().getItemDamage());

                // "Oil Cracking Unit" - 1160
                // "Large Chemical Reactor" - 1169
                // "Assembly Line" - 1170
                // "Large Combustion Engine" - 1171
                // "Cleanroom Controller" - 1172
                // "Ore Drilling Plant II" - 1177
                // "Ore Drilling Plant III" - 1178
                // "Ore Drilling Plant IV" - 1179
                // "Fusion Control Computer Mark I" - 1193
                // "Fusion Control Computer Mark II" - 1194
                case 1160, 1169, 1170, 1171, 1172, 1177, 1178, 1179, 1193, 1194 -> SingularityPachinkoRecipes_GT_MultiBlock_2.PachinkoRecipes_GT_MultiBlock_2
                    .get(getControllerSlot().getItemDamage());

                // "Fusion Control Computer Mark III" - 1195
                // "Extreme Combustion Engine" - 2105
                // "Large Fluid Extractor" - 2730
                // "Matter Manipulator Quantum Uplink" - 2731
                // "Hyper-Intensity Laser Engraver" - 3004
                // "Large Electric Compressor" - 3005
                // "Hot Isostatic Pressurization Unit" - 3006
                // "Neutronium Compressor" - 3007
                // "Pseudostable Black Hole Containment Field" - 3008
                // "Dissection Apparatus" - 3010
                case 1195, 2105, 2730, 2731, 3004, 3005, 3006, 3007, 3008, 3010 -> SingularityPachinkoRecipes_GT_MultiBlock_2.PachinkoRecipes_GT_MultiBlock_2
                    .get(getControllerSlot().getItemDamage());

                // "Big Barrel Brewery" - 3011
                // "Draconic Evolution Fusion Crafter" - 5001
                // "Drone Centre" - 9400
                // "Water Purification Plant" - 9402
                case 3011, 5001, 9400, 9402 -> SingularityPachinkoRecipes_GT_MultiBlock_2.PachinkoRecipes_GT_MultiBlock_2
                    .get(getControllerSlot().getItemDamage());

                // Digester - 10500
                // "Dissolution Tank" - 10501
                // "Linear Accelerator" - 10505
                // "Source Chamber" - 10506
                // Synchrotron - 10507
                // "Target Chamber" - 10508
                // "Electric Air Filter T1" - 12020
                // "Electric Air Filter T2" - 12021
                // "Electric Air Filter T3" - 12022
                // "Manual Transformer" - 12697
                case 10500, 10501, 10505, 10506, 10507, 10508, 12020, 12021, 12022, 12697 -> SingularityPachinkoRecipes_GT_MultiBlock_3.PachinkoRecipes_GT_MultiBlock_3
                    .get(getControllerSlot().getItemDamage());

                // Windmill - 12698
                // "Bacterial Vat" - 12712
                // "Deep Earth Heating Pump" - 12729
                // "Mega Electric Blast Furnace" - 12730
                // "Mega Vacuum Freezer" - 12731
                // "Large Naquadah Reactor" - 12732
                // "Thorium High Temperature Reactor" - 12733
                // "Electric Implosion Compressor" - 12734
                // "Circuit Assembly Line" - 12735
                // "Mega Distillation Tower" - 12738
                case 12698, 12712, 12729, 12730, 12731, 12732, 12733, 12734, 12735, 12738 -> SingularityPachinkoRecipes_GT_MultiBlock_3.PachinkoRecipes_GT_MultiBlock_3
                    .get(getControllerSlot().getItemDamage());

                // "Void Miner III" - 12739
                // "Void Miner II" - 12740
                // "Void Miner I" - 12741
                // "High Temperature Gas-cooled Reactor" - 12791
                // "Extreme Industrial Greenhouse" - 12792
                // "Research Completer" - 13001
                // "Solid-Oxide Fuel Cell Mk I" - 13101
                // "Solid-Oxide Fuel Cell Mk II" - 13102
                // T.F.F.T - 13104
                // "Lapotronic Supercapacitor" - 13106
                case 12739, 12740, 12741, 12791, 12792, 13001, 13101, 13102, 13104, 13106 -> SingularityPachinkoRecipes_GT_MultiBlock_3.PachinkoRecipes_GT_MultiBlock_3
                    .get(getControllerSlot().getItemDamage());

                // "Miniature Wormhole Generator" - 13115
                // "Mega Chemical Reactor" - 13366
                // "Mega Oil Cracker" - 13367
                // "Advanced Assembly Line" - 13532
                // "Dyson Swarm Ground Unit" - 14001
                // "Planetary Gas Siphon" - 14002
                // "Space Elevator" - 14003
                // "Large Molecular Assembler" - 14101
                // "Extreme Entity Crusher" - 14201
                // "Industrial Apicultural Acclimatiser and Drone Domestication Station" - 14202
                case 13115, 13366, 13367, 13532, 14001, 14002, 14003, 14101, 14201, 14202 -> SingularityPachinkoRecipes_GT_MultiBlock_3.PachinkoRecipes_GT_MultiBlock_3
                    .get(getControllerSlot().getItemDamage());

                // "Active Transformer" - 15300
                // "Weighted Network Switch With QoS" - 15310
                // "Quantum Computer" - 15311
                // "Microwave Grinder" - 15312
                // "Data Bank" - 15313
                // "Tesla Tower" - 15314
                // "Static Network Switch With QoS" - 15315
                // "Research Station" - 15331
                // "Energy Infuser" - 15350
                // "Eye of Harmony" - 15410
                case 15300, 15310, 15311, 15312, 15313, 15314, 15315, 15331, 15350, 15410 -> SingularityPachinkoRecipes_GT_MultiBlock_3.PachinkoRecipes_GT_MultiBlock_3
                    .get(getControllerSlot().getItemDamage());

                // "Forge of the Gods" - 15411
                // "Entropic Processor" - 15750
                // "Decay Warehouse" - 15751
                // "Naquadah Fuel Refinery" - 16999
                // "Hydro Dam" - 17000
                // "Hydro Pump" - 17003
                // "Hydro Turbine" - 17019
                case 15411, 15750, 15751, 16999, 17000, 17003, 17019 -> SingularityPachinkoRecipes_GT_MultiBlock_3.PachinkoRecipes_GT_MultiBlock_3
                    .get(getControllerSlot().getItemDamage());

                // "Dangote Distillus" - 31021
                // Zyngen - 31023
                // "Large Semifluid Burner" - 31026
                // "IsaMill Grinding Machine" - 31027
                // "Flotation Cell Regulator" - 31028
                // "Sparge Tower Controller" - 31035
                // "Steam Grinder" - 31041
                // "Elemental Duplicator" - 31050
                // Boldarnator - 31065
                // "Industrial 3D Copying Machine" - 31069
                case 31021, 31023, 31026, 31027, 31028, 31035, 31041, 31050, 31065, 31069 -> SingularityPachinkoRecipes_GT_MultiBlock_4.PachinkoRecipes_GT_MultiBlock_4
                    .get(getControllerSlot().getItemDamage());

                // "Molecular Transformer" - 31072
                // "XL Turbo Gas Turbine" - 31073
                // "XL Turbo Plasma Turbine" - 31074
                // "Industrial Sledgehammer" - 31075
                // "XL Turbo SC Steam Turbine" - 31076
                // "Thermic Heating Device" - 31077
                // "Steam Squasher" - 31078
                // "Whakawhiti Wera XL" - 31079
                // "Steam Separator" - 31080
                // "Steam Purifier" - 31082
                case 31072, 31073, 31074, 31075, 31076, 31077, 31078, 31079, 31080, 31082 -> SingularityPachinkoRecipes_GT_MultiBlock_4.PachinkoRecipes_GT_MultiBlock_4
                    .get(getControllerSlot().getItemDamage());

                // "Steam Presser" - 31083
                // "Steam Blender" - 31084
                // "Water Pump" - 31085
                // "Steam Fuser" - 31086
                // "Mega Alloy Blast Smelter" - 31150
                // "Quantum Force Transformer" - 31151
                // "Universal Chemical Fuel Engine" - 32001
                // "Neutron Activator" - 32013
                // YOTTank - 32014
                // "Large Supercritical Steam Turbine" - 32016
                case 31083, 31084, 31085, 31086, 31150, 31151, 32001, 32013, 32014, 32016 -> SingularityPachinkoRecipes_GT_MultiBlock_4.PachinkoRecipes_GT_MultiBlock_4
                    .get(getControllerSlot().getItemDamage());

                // "Extreme Heat Exchanger" - 32017
                // "Precise Auto-Assembler MT-3662" - 32018
                // "Compact Fusion Computer MK-I Prototype" - 32019
                // "Compact Fusion Computer MK-II" - 32020
                // "Compact Fusion Computer MK-III" - 32021
                // "Compact Fusion Computer MK-IV Prototype" - 32022
                // "Compact Fusion Computer MK-V" - 32023
                // "Large Essentia Smeltery" - 32024
                // "Coolant Tower" - 32025
                // "Component Assembly Line" - 32026
                case 32017, 32018, 32019, 32020, 32021, 32022, 32023, 32024, 32025, 32026 -> SingularityPachinkoRecipes_GT_MultiBlock_4.PachinkoRecipes_GT_MultiBlock_4
                    .get(getControllerSlot().getItemDamage());

                // "Semi-Stable Antimatter Stabilization Sequencer" - 32027
                // "Shielded Lagrangian Annihilation Matrix" - 32028
                case 32027, 32028 -> SingularityPachinkoRecipes_GT_MultiBlock_4.PachinkoRecipes_GT_MultiBlock_4
                    .get(getControllerSlot().getItemDamage());

                // Item Storage: "Super Chest I" - 135
                // Fluid Storage: "Ultra Low Voltage Fluid Tank" - 817
                // AppliedEnergistics2 Storage: "Super Tank I" - 130
                case 135, 817, 130 -> SingularityPachinkoRecipes_Storage.PachinkoRecipes_Storage
                    .get(getControllerSlot().getItemDamage());

                default -> null;
            };

            if (PachinkoRecipes != null) {

                // 随机输出
                for (int mLoop = 0; mLoop < 4; mLoop++) {
                    Random random = new Random();
                    int index = random.nextInt(PachinkoRecipes.length);
                    ItemStack recipePachinko = PachinkoRecipes[index];
                    recipePachinko.stackSize = getMaxParallel();
                    for (int mStack = 0; mStack < 64; mStack++) {
                        addOutput(recipePachinko);
                    }
                }

                // Debug全部输出
                for (ItemStack pachinkoRecipes : PachinkoRecipes) {
                    System.out.println(pachinkoRecipes.getDisplayName());
                    pachinkoRecipes.stackSize = getMaxParallel();
                    for (int mStack = 0; mStack < 128; mStack++) {
                        addOutput(pachinkoRecipes);
                    }
                }

                return CheckRecipeResultRegistry.SUCCESSFUL;
            }
        }
        this.stopMachine(ShutDownReasonRegistry.NONE);
        return CheckRecipeResultRegistry.NO_RECIPE;
    }
}
