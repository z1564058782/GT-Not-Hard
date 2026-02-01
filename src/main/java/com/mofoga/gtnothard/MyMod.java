package com.mofoga.gtnothard;

import static loader.MachinesLoader.loaderMachines;

import net.minecraft.command.CommandHandler;
import net.minecraftforge.common.MinecraftForge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Recipes.ChaosCircuitAssemblerRecipes;
import Recipes.ChaosXtremeCraftingRecipes;
import Recipes.ChaosZhuHaiRecipes;
import Recipes.FakeChaosXtremeCraftingRecipes;
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
import Recipes.SingularityDebugRecipes;
import Recipes.SingularityRecipes_Ecosystem.FakeSingularityEcosystemRecipes_Comb;
import Recipes.SingularityRecipes_Ecosystem.FakeSingularityEcosystemRecipes_Food;
import Recipes.SingularityRecipes_Ecosystem.FakeSingularityEcosystemRecipes_TreeGrowth;
import Recipes.SingularityRecipes_Ecosystem.SingularityEcosystemRecipes_Comb;
import Recipes.SingularityRecipes_Ecosystem.SingularityEcosystemRecipes_Food;
import Recipes.SingularityRecipes_Ecosystem.SingularityEcosystemRecipes_TreeGrowth;
import Recipes.SingularityRecipes_ModItem.FakeSingularityModItemRecipes_Show;
import Recipes.SingularityRecipes_Pachinko.FakeSingularityPachinkoRecipes_GT_Cable;
import Recipes.SingularityRecipes_Pachinko.FakeSingularityPachinkoRecipes_GT_Hatch;
import Recipes.SingularityRecipes_Pachinko.FakeSingularityPachinkoRecipes_GT_Misc;
import Recipes.SingularityRecipes_Pachinko.FakeSingularityPachinkoRecipes_GT_MultiBlock_1;
import Recipes.SingularityRecipes_Pachinko.FakeSingularityPachinkoRecipes_GT_MultiBlock_2;
import Recipes.SingularityRecipes_Pachinko.FakeSingularityPachinkoRecipes_GT_MultiBlock_3;
import Recipes.SingularityRecipes_Pachinko.FakeSingularityPachinkoRecipes_GT_MultiBlock_4;
import Recipes.SingularityRecipes_Pachinko.FakeSingularityPachinkoRecipes_Storage;
import Recipes.SingularityRecipes_Pachinko.SingularityPachinkoRecipes_GT_Cable;
import Recipes.SingularityRecipes_Pachinko.SingularityPachinkoRecipes_GT_Hatch;
import Recipes.SingularityRecipes_Pachinko.SingularityPachinkoRecipes_GT_Misc;
import Recipes.SingularityRecipes_Pachinko.SingularityPachinkoRecipes_GT_MultiBlock_1;
import Recipes.SingularityRecipes_Pachinko.SingularityPachinkoRecipes_GT_MultiBlock_2;
import Recipes.SingularityRecipes_Pachinko.SingularityPachinkoRecipes_GT_MultiBlock_3;
import Recipes.SingularityRecipes_Pachinko.SingularityPachinkoRecipes_GT_MultiBlock_4;
import Recipes.SingularityRecipes_Pachinko.SingularityPachinkoRecipes_Storage;
import Recipes.SingularityRecipes_VoidDust.FakeSingularityDustRecipes_T0;
import Recipes.SingularityRecipes_VoidDust.FakeSingularityDustRecipes_T1;
import Recipes.SingularityRecipes_VoidDust.FakeSingularityDustRecipes_T10;
import Recipes.SingularityRecipes_VoidDust.FakeSingularityDustRecipes_T2;
import Recipes.SingularityRecipes_VoidDust.FakeSingularityDustRecipes_T3;
import Recipes.SingularityRecipes_VoidDust.FakeSingularityDustRecipes_T4;
import Recipes.SingularityRecipes_VoidDust.FakeSingularityDustRecipes_T5;
import Recipes.SingularityRecipes_VoidDust.FakeSingularityDustRecipes_T6;
import Recipes.SingularityRecipes_VoidDust.FakeSingularityDustRecipes_T7;
import Recipes.SingularityRecipes_VoidDust.FakeSingularityDustRecipes_T8;
import Recipes.SingularityRecipes_VoidDust.FakeSingularityDustRecipes_T9;
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
import Recipes.SingularityRecipes_VoidFluid.FakeSingularityFluidRecipes_T0;
import Recipes.SingularityRecipes_VoidFluid.FakeSingularityFluidRecipes_T1;
import Recipes.SingularityRecipes_VoidFluid.FakeSingularityFluidRecipes_T10;
import Recipes.SingularityRecipes_VoidFluid.FakeSingularityFluidRecipes_T2;
import Recipes.SingularityRecipes_VoidFluid.FakeSingularityFluidRecipes_T3;
import Recipes.SingularityRecipes_VoidFluid.FakeSingularityFluidRecipes_T4;
import Recipes.SingularityRecipes_VoidFluid.FakeSingularityFluidRecipes_T5;
import Recipes.SingularityRecipes_VoidFluid.FakeSingularityFluidRecipes_T6;
import Recipes.SingularityRecipes_VoidFluid.FakeSingularityFluidRecipes_T7;
import Recipes.SingularityRecipes_VoidFluid.FakeSingularityFluidRecipes_T8;
import Recipes.SingularityRecipes_VoidFluid.FakeSingularityFluidRecipes_T9;
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
import Recipes.SingularityRecipes_VoidGem.FakeSingularityGemRecipes;
import Recipes.SingularityRecipes_VoidGem.SingularityGemRecipes;
import Recipes.SingularityRecipes_VoidIngot.FakeSingularityIngotRecipes_T0;
import Recipes.SingularityRecipes_VoidIngot.SingularityIngotRecipes_T0;
import Recipes.SingularityRecipes_VoidIngot.SingularityIngotRecipes_T1;
import Recipes.SingularityRecipes_VoidIngot.SingularityIngotRecipes_T10;
import Recipes.SingularityRecipes_VoidOre.FakeSingularityOreRecipes_T0;
import Recipes.SingularityRecipes_VoidOre.FakeSingularityOreRecipes_T1;
import Recipes.SingularityRecipes_VoidOre.FakeSingularityOreRecipes_T10;
import Recipes.SingularityRecipes_VoidOre.FakeSingularityOreRecipes_T2;
import Recipes.SingularityRecipes_VoidOre.FakeSingularityOreRecipes_T3;
import Recipes.SingularityRecipes_VoidOre.FakeSingularityOreRecipes_T4;
import Recipes.SingularityRecipes_VoidOre.FakeSingularityOreRecipes_T5;
import Recipes.SingularityRecipes_VoidOre.FakeSingularityOreRecipes_T6;
import Recipes.SingularityRecipes_VoidOre.FakeSingularityOreRecipes_T7;
import Recipes.SingularityRecipes_VoidOre.FakeSingularityOreRecipes_T8;
import Recipes.SingularityRecipes_VoidOre.FakeSingularityOreRecipes_T9;
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
import Tools.FluidExporter;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLLoadCompleteEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import loader.AssemblyLineWithoutResearchRecipePool;
import loader.CraftingLoader;

@Mod(modid = MyMod.MODID, version = Tags.VERSION, name = "GT Not Hard", acceptedMinecraftVersions = "[1.7.10]")
public class MyMod {

    public static final String MODID = "gtnothard";
    public static final Logger LOG = LogManager.getLogger(MODID);

    @SidedProxy(clientSide = "com.mofoga.gtnothard.ClientProxy", serverSide = "com.mofoga.gtnothard.CommonProxy")
    public static CommonProxy proxy;
    /*
     * static {
     * setDebugEnabled(true);
     * }
     */

    @Mod.EventHandler
    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {

        proxy.preInit(event);
        // new MachinesLoader();
    }

    @Mod.EventHandler
    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        MinecraftForge.EVENT_BUS.register(this);
        FMLCommonHandler.instance()
            .bus()
            .register(this);
        loaderMachines();
        new CraftingLoader();
        // new MachinesLoader();
    }

    @Mod.EventHandler
    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
        SingularityDebugRecipes.addVoidDebugRecipes();

        // OriginGeneratorRecipes
        OriginGeneratorRecipes_Steam.addGeneratorRecipes_Steam();
        OriginGeneratorRecipes_Semifluid.addGeneratorRecipes_Semifluid();
        OriginGeneratorRecipes_Combustion.addGeneratorRecipes_Combustion();
        OriginGeneratorRecipes_Plasma.addGeneratorRecipes_Plasma();
        OriginGeneratorRecipes_Rocket.addGeneratorRecipes_Rocket();
        OriginGeneratorRecipes_Gas.addGeneratorRecipes_Gas();
        OriginGeneratorRecipes_UCFE.addGeneratorRecipes_UCFE();
        OriginGeneratorRecipes_Magic.addGeneratorRecipes_Magic();
        OriginGeneratorRecipes_Nuclear.addGeneratorRecipes_Nuclear();
        OriginGeneratorRecipes_Naquadah.addGeneratorRecipes_Naquadah();
        OriginGeneratorRecipes_Acid.addGeneratorRecipes_Acid();
        OriginGeneratorRecipes_Water.addGeneratorRecipes_Water();
        OriginGeneratorRecipes_Solar.addGeneratorRecipes_Solar();

        // Singularity of Void Ore
        SingularityOreRecipes_T0.addVoidOreRecipes_T0();
        FakeSingularityOreRecipes_T0.addFakeVoidOreRecipes_T0();
        SingularityOreRecipes_T1.addVoidOreRecipes_T1();
        FakeSingularityOreRecipes_T1.addFakeVoidOreRecipes_T1();
        SingularityOreRecipes_T2.addVoidOreRecipes_T2();
        FakeSingularityOreRecipes_T2.addFakeVoidOreRecipes_T2();
        SingularityOreRecipes_T3.addVoidOreRecipes_T3();
        FakeSingularityOreRecipes_T3.addFakeVoidOreRecipes_T3();
        SingularityOreRecipes_T4.addVoidOreRecipes_T4();
        FakeSingularityOreRecipes_T4.addFakeVoidOreRecipes_T4();
        SingularityOreRecipes_T5.addVoidOreRecipes_T5();
        FakeSingularityOreRecipes_T5.addFakeVoidOreRecipes_T5();
        SingularityOreRecipes_T6.addVoidOreRecipes_T6();
        FakeSingularityOreRecipes_T6.addFakeVoidOreRecipes_T6();
        SingularityOreRecipes_T7.addVoidOreRecipes_T7();
        FakeSingularityOreRecipes_T7.addFakeVoidOreRecipes_T7();
        SingularityOreRecipes_T8.addVoidOreRecipes_T8();
        FakeSingularityOreRecipes_T8.addFakeVoidOreRecipes_T8();
        SingularityOreRecipes_T9.addVoidOreRecipes_T9();
        FakeSingularityOreRecipes_T9.addFakeVoidOreRecipes_T9();
        SingularityOreRecipes_T10.addVoidOreRecipes_T10();
        FakeSingularityOreRecipes_T10.addFakeVoidOreRecipes_T10();

        // Singularity of Void Gem
        SingularityGemRecipes.addVoidGemRecipes();
        FakeSingularityGemRecipes.addFakeVoidGemRecipes();

        // Singularity of Void Dust
        SingularityDustRecipes_T0.addVoidDustRecipes_T0();
        FakeSingularityDustRecipes_T0.addFakeVoidDustRecipes_T0();
        SingularityDustRecipes_T1.addVoidDustRecipes_T1();
        FakeSingularityDustRecipes_T1.addFakeVoidDustRecipes_T1();
        SingularityDustRecipes_T2.addVoidDustRecipes_T2();
        FakeSingularityDustRecipes_T2.addFakeVoidDustRecipes_T2();
        SingularityDustRecipes_T3.addVoidDustRecipes_T3();
        FakeSingularityDustRecipes_T3.addFakeVoidDustRecipes_T3();
        SingularityDustRecipes_T4.addVoidDustRecipes_T4();
        FakeSingularityDustRecipes_T4.addFakeVoidDustRecipes_T4();
        SingularityDustRecipes_T5.addVoidDustRecipes_T5();
        FakeSingularityDustRecipes_T5.addFakeVoidDustRecipes_T5();
        SingularityDustRecipes_T6.addVoidDustRecipes_T6();
        FakeSingularityDustRecipes_T6.addFakeVoidDustRecipes_T6();
        SingularityDustRecipes_T7.addVoidDustRecipes_T7();
        FakeSingularityDustRecipes_T7.addFakeVoidDustRecipes_T7();
        SingularityDustRecipes_T8.addVoidDustRecipes_T8();
        FakeSingularityDustRecipes_T8.addFakeVoidDustRecipes_T8();
        SingularityDustRecipes_T9.addVoidDustRecipes_T9();
        FakeSingularityDustRecipes_T9.addFakeVoidDustRecipes_T9();

        // Singularity of Void Fluid
        SingularityFluidRecipes_T0.addVoidFluidRecipes_T0();
        FakeSingularityFluidRecipes_T0.addFakeVoidFluidRecipes_T0();
        SingularityFluidRecipes_T1.addVoidFluidRecipes_T1();
        FakeSingularityFluidRecipes_T1.addFakeVoidFluidRecipes_T1();
        SingularityFluidRecipes_T2.addVoidFluidRecipes_T2();
        FakeSingularityFluidRecipes_T2.addFakeVoidFluidRecipes_T2();
        SingularityFluidRecipes_T3.addVoidFluidRecipes_T3();
        FakeSingularityFluidRecipes_T3.addFakeVoidFluidRecipes_T3();
        SingularityFluidRecipes_T4.addVoidFluidRecipes_T4();
        FakeSingularityFluidRecipes_T4.addFakeVoidFluidRecipes_T4();
        SingularityFluidRecipes_T5.addVoidFluidRecipes_T5();
        FakeSingularityFluidRecipes_T5.addFakeVoidFluidRecipes_T5();
        SingularityFluidRecipes_T6.addVoidFluidRecipes_T6();
        FakeSingularityFluidRecipes_T6.addFakeVoidFluidRecipes_T6();
        SingularityFluidRecipes_T7.addVoidFluidRecipes_T7();
        FakeSingularityFluidRecipes_T7.addFakeVoidFluidRecipes_T7();
        SingularityFluidRecipes_T8.addVoidFluidRecipes_T8();
        FakeSingularityFluidRecipes_T8.addFakeVoidFluidRecipes_T8();
        SingularityFluidRecipes_T9.addVoidFluidRecipes_T9();
        FakeSingularityFluidRecipes_T9.addFakeVoidFluidRecipes_T9();
        SingularityFluidRecipes_T10.addVoidFluidRecipes_T10();
        FakeSingularityFluidRecipes_T10.addFakeVoidFluidRecipes_T10();

        // Singularity of Void Ingot
        SingularityIngotRecipes_T0.addVoidIngotRecipes_T0();
        FakeSingularityIngotRecipes_T0.addFakeVoidIngotRecipes_T0();
        SingularityIngotRecipes_T1.addVoidIngotRecipes_T1();
        SingularityIngotRecipes_T10.addVoidIngotRecipes_T10();

        SingularityEcosystemRecipes_Comb.addEcosystemRecipes_Comb();
        FakeSingularityEcosystemRecipes_Comb.addFakeEcosystemRecipes_Comb();
        SingularityEcosystemRecipes_Food.addEcosystemRecipes_Food();
        FakeSingularityEcosystemRecipes_Food.addFakeEcosystemRecipes_Food();
        SingularityEcosystemRecipes_TreeGrowth.addEcosystemRecipes_TreeGrowth();
        FakeSingularityEcosystemRecipes_TreeGrowth.addFakeEcosystemRecipes_TreeGrowth();
        SingularityPachinkoRecipes_GT_Cable.addPachinkoRecipes_GT_Cable();
        FakeSingularityPachinkoRecipes_GT_Cable.addFakePachinkoRecipes_GT_Cable();
        SingularityPachinkoRecipes_GT_Hatch.addPachinkoRecipes_GT_Hatch();
        FakeSingularityPachinkoRecipes_GT_Hatch.addFakePachinkoRecipes_GT_Hatch();
        SingularityPachinkoRecipes_GT_Misc.addPachinkoRecipes_GT_Misc();
        FakeSingularityPachinkoRecipes_GT_Misc.addFakePachinkoRecipes_GT_Misc();
        SingularityPachinkoRecipes_GT_MultiBlock_1.addPachinkoRecipes_GT_MultiBlock_1();
        FakeSingularityPachinkoRecipes_GT_MultiBlock_1.addFakePachinkoRecipes_GT_MultiBlock_1();
        SingularityPachinkoRecipes_GT_MultiBlock_2.addPachinkoRecipes_GT_MultiBlock_2();
        FakeSingularityPachinkoRecipes_GT_MultiBlock_2.addFakePachinkoRecipes_GT_MultiBlock_2();
        SingularityPachinkoRecipes_GT_MultiBlock_3.addPachinkoRecipes_GT_MultiBlock_3();
        FakeSingularityPachinkoRecipes_GT_MultiBlock_3.addFakePachinkoRecipes_GT_MultiBlock_3();
        SingularityPachinkoRecipes_GT_MultiBlock_4.addPachinkoRecipes_GT_MultiBlock_4();
        FakeSingularityPachinkoRecipes_GT_MultiBlock_4.addFakePachinkoRecipes_GT_MultiBlock_4();
        SingularityPachinkoRecipes_Storage.addPachinkoRecipes_Storage();
        FakeSingularityPachinkoRecipes_Storage.addFakePachinkoRecipes_Storage();
        ChaosZhuHaiRecipes.addChaosZhuHaiFisheryRecipes();
        ChaosXtremeCraftingRecipes.addChaosXtremeCraftingRecipes();
        FakeChaosXtremeCraftingRecipes.addFakeChaosXtremeCraftingRecipes();

        FMLCommonHandler.instance()
            .bus()
            .register(new CommandHandler());
    }

    @Mod.EventHandler
    public void completeInit(FMLLoadCompleteEvent event) {
        AssemblyLineWithoutResearchRecipePool assemblyLineWithoutResearchRecipePool = new AssemblyLineWithoutResearchRecipePool();
        assemblyLineWithoutResearchRecipePool.loadRecipes();
        ChaosCircuitAssemblerRecipes.addChaosCircuitAssemblerRecipes();
        SingularityDustRecipes_T10.addVoidDustRecipes_T10();
        FakeSingularityDustRecipes_T10.addFakeVoidDustRecipes_T10();
        FakeSingularityModItemRecipes_Show.addFakeModItemRecipes_Show();
    }

    @Mod.EventHandler
    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {
        FluidExporter.registerCommand(event);
        proxy.serverStarting(event);
        // FakeSingularityModItemRecipes_Show.addFakeModItemRecipes_Show();
    }
}
