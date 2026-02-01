package Recipes;

import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.IndustrialCraft2;
import static gregtech.api.enums.Mods.NewHorizonsCoreMod;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import net.minecraftforge.fluids.FluidRegistry;

import gregtech.api.enums.GTValues;
import gregtech.api.gui.modularui.GTUITextures;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;

public class ChaosCircuitAssemblerRecipes {

    public static final RecipeMap<RecipeMapBackend> addChaosCircuitAssemblerRecipes = RecipeMapBuilder
        .of("Chaos of CircuitAssemblyLine")
        .maxIO(6, 1, 1, 0)
        .minInputs(1, 1)
        .progressBar(GTUITextures.PROGRESSBAR_CIRCUIT_ASSEMBLER)
        // .disableRegisterNEI()
        // .disableOptimize()
        .build();

    public static void addChaosCircuitAssemblerRecipes() {
        // Integrated Logic Circuit - 集成逻辑电路
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32760),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32736),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32745),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32743),
                getModItem(GregTech.ID, "gt.blockmachines", 2L, 1362),
                getModItem(GregTech.ID, "gt.metaitem.01", 32L, 26057))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 72))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 16L, 32701))
            .duration(120 * SECONDS)
            .eut(16)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Good Integrated Circuit - 不错的集成电路
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32758),
                getModItem(GregTech.ID, "gt.metaitem.01", 32L, 32701),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32740),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32739),
                getModItem(GregTech.ID, "gt.blockmachines", 4L, 1422),
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 26054))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 72))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32079))
            .duration(120 * SECONDS)
            .eut(24)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Good Integrated Circuit - 不错的集成电路
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32758),
                getModItem(GregTech.ID, "gt.metaitem.01", 32L, 32701),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32745),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32743),
                getModItem(GregTech.ID, "gt.blockmachines", 4L, 1422),
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 26054))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 72))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32079))
            .duration(120 * SECONDS)
            .eut(24)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Good Electronic Circuit - 优质电子电路板
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32758),
                getModItem(IndustrialCraft2.ID, "itemPartCircuit", 32L),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32743),
                getModItem(GregTech.ID, "gt.blockmachines", 2L, 1365))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 72))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 16L, 32702))
            .duration(180 * SECONDS)
            .eut(30)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Integrated Processor - 集成处理器
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32748),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32732),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32740),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32737),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32738),
                getModItem(GregTech.ID, "gt.blockmachines", 4L, 2002))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 72))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32080))
            .duration(60 * SECONDS)
            .eut(60)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Microprocessor - 微型处理器
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32748),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32732),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32745),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32741),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32742),
                getModItem(GregTech.ID, "gt.blockmachines", 4L, 1362))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 72))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32078))
            .duration(120 * SECONDS)
            .eut(60)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Integrated Processor - 集成处理器
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32748),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32732),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32745),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32741),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32742),
                getModItem(GregTech.ID, "gt.blockmachines", 4L, 2002))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 72))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32080))
            .duration(120 * SECONDS)
            .eut(60)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Processor Assembly - 处理器集群
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32748),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32080),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32707),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32737),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 8L, 2002))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 144))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 16L, 32703))
            .duration(120 * SECONDS)
            .eut(96)
            .addTo(addChaosCircuitAssemblerRecipes);

        // NAND Chip Array - NAND芯片阵列
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32758),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32728),
                getModItem(GregTech.ID, "gt.metaitem.01", 16L, 26308),
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1382))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 18))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 16L, 32081))
            .duration(90 * SECONDS)
            .eut(120)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Workstation - 工作站
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32748),
                getModItem(GregTech.ID, "gt.metaitem.01", 32L, 32703),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32739),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 8L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 16L, 1442),
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 26309))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 144))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 16L, 32704))
            .duration(120 * SECONDS)
            .eut(120)
            .addTo(addChaosCircuitAssemblerRecipes);

        // NAND Chip Array - NAND芯片阵列
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32758),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32728),
                getModItem(GregTech.ID, "gt.metaitem.01", 16L, 26308),
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1362))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 18))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 16L, 32081))
            .duration(180 * SECONDS)
            .eut(120)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Processor Assembly - 处理器集群
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32748),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32080),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32744),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 8L, 32741),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 8L, 2002))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 144))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 16L, 32703))
            .duration(240 * SECONDS)
            .eut(120)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Workstation - 工作站
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32748),
                getModItem(GregTech.ID, "gt.metaitem.01", 32L, 32703),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32743),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 8L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 16L, 1442),
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 26309))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 144))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 16L, 32704))
            .duration(240 * SECONDS)
            .eut(120)
            .addTo(addChaosCircuitAssemblerRecipes);

        // NAND Chip Array - NAND芯片阵列
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32748),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32728),
                getModItem(GregTech.ID, "gt.metaitem.01", 16L, 26308),
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1382))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 18))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 32L, 32081))
            .duration(90 * SECONDS)
            .eut(480)
            .addTo(addChaosCircuitAssemblerRecipes);

        // NAND Chip Array - NAND芯片阵列
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32748),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32728),
                getModItem(GregTech.ID, "gt.metaitem.01", 16L, 26308),
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1362))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 18))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 32L, 32081))
            .duration(180 * SECONDS)
            .eut(480)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Mainframe - 处理器主机
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(GregTech.ID, "gt.blockframes", 32L, 19),
                getModItem(GregTech.ID, "gt.metaitem.01", 32L, 32704),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 3L, 32707),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32737),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 16L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 16L, 1385))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 288))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 16L, 32705))
            .duration(480 * SECONDS)
            .eut(480)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Mainframe - 处理器主机
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(GregTech.ID, "gt.blockframes", 32L, 19),
                getModItem(GregTech.ID, "gt.metaitem.01", 32L, 32704),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 12L, 32744),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 24L, 32741),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 16L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 24L, 1385))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 288))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 16L, 32705))
            .duration(960 * SECONDS)
            .eut(480)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Microprocessor - 微型处理器
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32748),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32731),
                getModItem(GregTech.ID, "gt.blockmachines", 2L, 1362),
                getModItem(GregTech.ID, "gt.metaitem.01", 32L, 26035))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 72))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32078))
            .duration(30 * SECONDS)
            .eut(600)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Nanoprocessor - 纳米处理器
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32756),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32720),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32740),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32737),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32738),
                getModItem(GregTech.ID, "gt.blockmachines", 8L, 1442))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 72))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32082))
            .duration(60 * SECONDS)
            .eut(600)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Nanoprocessor - 纳米处理器
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32756),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32720),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 8L, 32745),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 8L, 32741),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 8L, 32742),
                getModItem(GregTech.ID, "gt.blockmachines", 8L, 1442))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 72))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32082))
            .duration(120 * SECONDS)
            .eut(600)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Nanoprocessor Assembly - 纳米处理器集群
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32756),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32082),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32707),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32737),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 8L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 16L, 1442))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 144))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32083))
            .duration(120 * SECONDS)
            .eut(600)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Elite Nanocomputer - 精英纳米电脑
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32756),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32083),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32739),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32733),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 16L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 16L, 1442))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 144))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32084))
            .duration(120 * SECONDS)
            .eut(600)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Nanoprocessor Assembly - 纳米处理器集群
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32756),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32082),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 8L, 32744),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 8L, 32741),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 8L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 16L, 1442))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 144))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32083))
            .duration(240 * SECONDS)
            .eut(600)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Elite Nanocomputer - 精英纳米电脑
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32756),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32083),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 8L, 32743),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32733),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 16L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 16L, 1442))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 144))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32084))
            .duration(240 * SECONDS)
            .eut(600)
            .addTo(addChaosCircuitAssemblerRecipes);

        // NAND Chip Array - NAND芯片阵列
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32756),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32728),
                getModItem(GregTech.ID, "gt.metaitem.01", 16L, 26308),
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1382))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 18))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 64L, 32081))
            .duration(90 * SECONDS)
            .eut(1920)
            .addTo(addChaosCircuitAssemblerRecipes);

        // NAND Chip Array - NAND芯片阵列
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32756),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32728),
                getModItem(GregTech.ID, "gt.metaitem.01", 16L, 26308),
                getModItem(GregTech.ID, "gt.blockmachines", 1L, 1362))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 18))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 64L, 32081))
            .duration(180 * SECONDS)
            .eut(1920)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Nanoprocessor Mainframe - 纳米处理器主机
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(GregTech.ID, "gt.blockframes", 32L, 19),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32084),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32707),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 8L, 32737),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 16L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 32L, 1385))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 288))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 16L, 32706))
            .duration(480 * SECONDS)
            .eut(1920)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Nanoprocessor Mainframe - 纳米处理器主机
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(GregTech.ID, "gt.blockframes", 32L, 19),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32084),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 16L, 32744),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 32L, 32741),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 16L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 32L, 1385))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 288))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.01", 16L, 32706))
            .duration(960 * SECONDS)
            .eut(1920)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Integrated Processor - 集成处理器
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32748),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32731),
                getModItem(GregTech.ID, "gt.blockmachines", 4L, 2002),
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 26345))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 72))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32080))
            .duration(30 * SECONDS)
            .eut(2400)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Quantumprocessor - 量子处理器
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32754),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32719),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32720),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 3L, 32737),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 3L, 32738),
                getModItem(GregTech.ID, "gt.blockmachines", 16L, 1642))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 72))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32085))
            .duration(60 * SECONDS)
            .eut(2400)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Quantumprocessor - 量子处理器
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32754),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32719),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32720),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 12L, 32741),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 12L, 32742),
                getModItem(GregTech.ID, "gt.blockmachines", 16L, 1642))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 72))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32085))
            .duration(120 * SECONDS)
            .eut(2400)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Quantumprocessor Assembly - 量子处理器集群
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32754),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32085),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 3L, 32707),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32737),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 24L, 1642))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 144))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32086))
            .duration(120 * SECONDS)
            .eut(2400)
            .addTo(addChaosCircuitAssemblerRecipes);
        // Master Quantumcomputer - 大型量子电脑
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32754),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32086),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32739),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32733),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 16L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 48L, 1642))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 144))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32087))
            .duration(120 * SECONDS)
            .eut(2400)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Quantumprocessor Assembly - 量子处理器集群
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32754),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32085),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 12L, 32744),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 16L, 32741),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 24L, 1642))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 144))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32086))
            .duration(240 * SECONDS)
            .eut(2400)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Master Quantumcomputer - 大型量子电脑
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32754),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32086),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 8L, 32743),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32733),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 16L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 48L, 1642))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 144))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32087))
            .duration(240 * SECONDS)
            .eut(2400)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Quantumprocessor Mainframe - 量子处理器主机
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(GregTech.ID, "gt.blockframes", 32L, 19),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32087),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 6L, 32707),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 12L, 32737),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 24L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 48L, 1385))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 288))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32088))
            .duration(480 * SECONDS)
            .eut(7680)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Quantumprocessor Mainframe - 量子处理器主机
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(GregTech.ID, "gt.blockframes", 32L, 19),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32087),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 24L, 32744),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 48L, 32741),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 24L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 48L, 1385))
            .fluidInputs(FluidRegistry.getFluidStack("molten.solderingalloy", 288))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32088))
            .duration(960 * SECONDS)
            .eut(7680)
            .addTo(addChaosCircuitAssemblerRecipes);

        // High Energy Flow Circuit - 高能量流电路
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32753),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32088),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32726),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32719),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32720),
                getModItem(GregTech.ID, "gt.blockmachines", 64L, 2425))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 288))
            .itemOutputs(getModItem(NewHorizonsCoreMod.ID, "item.HighEnergyFlowCircuit", 16L))
            .duration(1440 * SECONDS)
            .eut(7680)
            .addTo(addChaosCircuitAssemblerRecipes);

        // High Energy Flow Circuit - 高能量流电路
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32753),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32090),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32726),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32719),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32720),
                getModItem(GregTech.ID, "gt.blockmachines", 64L, 2425))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 288))
            .itemOutputs(getModItem(NewHorizonsCoreMod.ID, "item.HighEnergyFlowCircuit", 16L))
            .duration(1440 * SECONDS)
            .eut(7680)
            .addTo(addChaosCircuitAssemblerRecipes);

        // High Energy Flow Circuit - 高能量流电路
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32753),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32093),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32726),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32719),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32720),
                getModItem(GregTech.ID, "gt.blockmachines", 64L, 2425))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 288))
            .itemOutputs(getModItem(NewHorizonsCoreMod.ID, "item.HighEnergyFlowCircuit", 16L))
            .duration(1440 * SECONDS)
            .eut(7680)
            .addTo(addChaosCircuitAssemblerRecipes);

        // High Energy Flow Circuit - 高能量流电路
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32753),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32097),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32726),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32719),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32720),
                getModItem(GregTech.ID, "gt.blockmachines", 64L, 2425))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 288))
            .itemOutputs(getModItem(NewHorizonsCoreMod.ID, "item.HighEnergyFlowCircuit", 16L))
            .duration(1440 * SECONDS)
            .eut(7680)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Nanoprocessor - 纳米处理器
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32756),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32730),
                getModItem(GregTech.ID, "gt.blockmachines", 8L, 1442),
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 26085))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 72))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32082))
            .duration(30 * SECONDS)
            .eut(9600)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Crystalprocessor - 晶体处理器
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32753),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32718),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32720),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 6L, 32737),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 6L, 32738),
                getModItem(GregTech.ID, "gt.blockmachines", 8L, 1722))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 72))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32089))
            .duration(60 * SECONDS)
            .eut(9600)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Crystalprocessor Assembly - 晶体处理器集群
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32753),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32089),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 6L, 32707),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 8L, 32737),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 24L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 16L, 1722))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 144))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32096))
            .duration(120 * SECONDS)
            .eut(9600)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Ultimate Crystalcomputer - 终极晶体电脑
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32753),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32096),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32735),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 32L, 32733),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 64L, 32734),
                getModItem(GregTech.ID, "gt.blockmachines", 32L, 1722))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 144))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32090))
            .duration(240 * SECONDS)
            .eut(9600)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Quantumprocessor Mainframe - 量子处理器主机
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(GregTech.ID, "gt.blockframes", 32L, 19),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32090),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 8L, 32707),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 16L, 32737),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 32L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 16L, 2405))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 288))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32091))
            .duration(480 * SECONDS)
            .eut(30720)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Quantumprocessor - 量子处理器
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32754),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32730),
                getModItem(GregTech.ID, "gt.blockmachines", 16L, 1642),
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 26360))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 72))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32085))
            .duration(30 * SECONDS)
            .eut(38400)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Wetwareprocessor - 湿件处理器
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32715),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32718),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32720),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 8L, 32737),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 8L, 32738),
                getModItem(GregTech.ID, "gt.blockmachines", 8L, 1762))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 72))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32092))
            .duration(120 * SECONDS)
            .eut(38400)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Wetwareprocessor Assembly - 湿件处理器集群
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32750),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32092),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 8L, 32707),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 12L, 32737),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 24L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 16L, 1762))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 144))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32093))
            .duration(180 * SECONDS)
            .eut(38400)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Wetware Supercomputer - 湿件处理器超级电脑
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32750),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32093),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 8L, 32739),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 16L, 32733),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 64L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 24L, 1762))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 144))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32094))
            .duration(360 * SECONDS)
            .eut(38400)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Wetwareprocessor - 湿件处理器
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32715),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32718),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32720),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32708),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32709),
                getModItem(GregTech.ID, "gt.blockmachines", 8L, 1762))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 72))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32092))
            .duration(15 * SECONDS)
            .eut(153600)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Wetwareprocessor Assembly - 湿件处理器集群
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32750),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32092),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32706),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 3L, 32708),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 24L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 16L, 1762))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 144))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32093))
            .duration(22 * SECONDS)
            .eut(153600)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Crystalprocessor - 晶体处理器
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32753),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32717),
                getModItem(GregTech.ID, "gt.blockmachines", 8L, 1722),
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 26358))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 72))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32089))
            .duration(30 * SECONDS)
            .eut(153600)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Wetware Supercomputer - 湿件处理器超级电脑
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32750),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32093),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32710),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 16L, 32733),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 64L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 24L, 1762))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 144))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32094))
            .duration(45 * SECONDS)
            .eut(153600)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Bioprocessor - 生物处理器
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32714),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32716),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32720),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 12L, 32737),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 12L, 32738),
                getModItem(GregTech.ID, "gt.blockmachines", 16L, 1722))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 72))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32097))
            .duration(180 * SECONDS)
            .eut(153600)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Biowareprocessor Assembly - 生物处理器集群
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32746),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32097),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 12L, 32707),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 16L, 32737),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 32L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 24L, 1722))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 144))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32098))
            .duration(240 * SECONDS)
            .eut(153600)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Bioprocessor - 生物处理器
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32714),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32716),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32720),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 3L, 32708),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 3L, 32709),
                getModItem(GregTech.ID, "gt.blockmachines", 16L, 1722))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 72))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32097))
            .duration(180 * SECONDS)
            .eut(153600)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Wetwareprocessor - 湿件处理器
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32750),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32700),
                getModItem(GregTech.ID, "gt.blockmachines", 8L, 1762),
                getModItem(GregTech.ID, "gt.metaitem.01", 64L, 26982))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 144))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32092))
            .duration(30 * SECONDS)
            .eut(614400)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Biowareprocessor Assembly - 生物处理器集群
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32746),
                getModItem(GregTech.ID, "gt.metaitem.03", 32L, 32097),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 3L, 32706),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 4L, 32708),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 32L, 32735),
                getModItem(GregTech.ID, "gt.blockmachines", 24L, 1722))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 144))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32098))
            .duration(30 * SECONDS)
            .eut(614400)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Optical Processor - 光学处理器
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32703),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 2L, 32701),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 16L, 32708),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 16L, 32710),
                getModItem(GregTech.ID, "gt.blockmachines", 64L, 15470),
                getModItem(GregTech.ID, "gt.metaitem.01", 16L, 26582))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 288))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32154))
            .duration(240 * SECONDS)
            .eut(614400)
            .addTo(addChaosCircuitAssemblerRecipes);

        // Bioprocessor - 生物处理器
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32746),
                getModItem(BartWorks.ID, "gt.bwMetaGeneratedItem0", 1L, 32699),
                getModItem(GregTech.ID, "gt.blockmachines", 16L, 1722),
                getModItem(GTPlusPlus.ID, "itemBoltChromaticGlass", 64L))
            .fluidInputs(FluidRegistry.getFluidStack("molten.indalloy140", 144))
            .itemOutputs(getModItem(GregTech.ID, "gt.metaitem.03", 16L, 32097))
            .duration(45 * SECONDS)
            .eut(7864320)
            .addTo(addChaosCircuitAssemblerRecipes);
    }
}
