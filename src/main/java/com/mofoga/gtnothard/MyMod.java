package com.mofoga.gtnothard;

import static loader.MachinesLoader.loaderMachines;

import net.minecraft.command.CommandHandler;
import net.minecraftforge.common.MinecraftForge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Recipes.ChaosRecipes.ChaosAntimatterRecipes;
import Recipes.ChaosRecipes.ChaosCircuitAssemblerRecipes;
import Recipes.ChaosRecipes.ChaosExoticRecipes;
import Recipes.ChaosRecipes.ChaosFallingTowerRecipes;
import Recipes.ChaosRecipes.ChaosOreRecipes;
import Recipes.ChaosRecipes.ChaosReplicatorRecipes;
import Recipes.ChaosRecipes.ChaosSpecialCompressRecipes;
import Recipes.ChaosRecipes.ChaosXtremeCraftingRecipes;
import Recipes.ChaosRecipes.ChaosZhuHaiRecipes;
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
import Recipes.SingularityRecipes_Ecosystem.FakeSingularityEcosystemRecipes;
import Recipes.SingularityRecipes_Ecosystem.SingularityEcosystemRecipes;
import Recipes.SingularityRecipes_ModItem.FakeSingularityModItemRecipes_Show;
import Recipes.SingularityRecipes_Pachinko.FakeSingularityPachinkoRecipes;
import Recipes.SingularityRecipes_Pachinko.SingularityPachinkoRecipes;
import Recipes.SingularityRecipes_VoidDust.FakeSingularityDustRecipes;
import Recipes.SingularityRecipes_VoidDust.SingularityDustRecipes;
import Recipes.SingularityRecipes_VoidDust.SingularityDustRecipes_T10;
import Recipes.SingularityRecipes_VoidFluid.FakeSingularityFluidRecipes;
import Recipes.SingularityRecipes_VoidFluid.SingularityFluidRecipes;
import Recipes.SingularityRecipes_VoidFluid.SingularityFluidRecipes_T10;
import Recipes.SingularityRecipes_VoidGem.FakeSingularityGemRecipes;
import Recipes.SingularityRecipes_VoidGem.SingularityGemRecipes;
import Recipes.SingularityRecipes_VoidIngot.FakeSingularityIngotRecipes;
import Recipes.SingularityRecipes_VoidIngot.SingularityIngotRecipes;
import Recipes.SingularityRecipes_VoidOre.FakeSingularityOreRecipes;
import Recipes.SingularityRecipes_VoidOre.SingularityOreRecipes;
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

        // Chaos Recipes
        ChaosReplicatorRecipes.addReplicatorRecipes_Item();
        ChaosReplicatorRecipes.addReplicatorRecipes_Fluid();
        ChaosExoticRecipes.addExoticRecipes_DegenerateQuarkGluon();
        ChaosExoticRecipes.addExoticRecipes_Magmatter();
        ChaosAntimatterRecipes.addAntimatterRecipes();
        ChaosFallingTowerRecipes.addChaosFallingTowerRecipes();
        ChaosOreRecipes.addChaosOreRecipes();
        ChaosSpecialCompressRecipes.addSpecialCompressRecipes();

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
        SingularityOreRecipes.addVoidOreRecipes_T0();
        FakeSingularityOreRecipes.addFakeVoidOreRecipes_T0();
        SingularityOreRecipes.addVoidOreRecipes_T1();
        FakeSingularityOreRecipes.addFakeVoidOreRecipes_T1();
        SingularityOreRecipes.addVoidOreRecipes_T2();
        FakeSingularityOreRecipes.addFakeVoidOreRecipes_T2();
        SingularityOreRecipes.addVoidOreRecipes_T3();
        FakeSingularityOreRecipes.addFakeVoidOreRecipes_T3();
        SingularityOreRecipes.addVoidOreRecipes_T4();
        FakeSingularityOreRecipes.addFakeVoidOreRecipes_T4();
        SingularityOreRecipes.addVoidOreRecipes_T5();
        FakeSingularityOreRecipes.addFakeVoidOreRecipes_T5();
        SingularityOreRecipes.addVoidOreRecipes_T6();
        FakeSingularityOreRecipes.addFakeVoidOreRecipes_T6();
        SingularityOreRecipes.addVoidOreRecipes_T7();
        FakeSingularityOreRecipes.addFakeVoidOreRecipes_T7();
        SingularityOreRecipes.addVoidOreRecipes_T8();
        FakeSingularityOreRecipes.addFakeVoidOreRecipes_T8();
        SingularityOreRecipes.addVoidOreRecipes_T9();
        FakeSingularityOreRecipes.addFakeVoidOreRecipes_T9();
        SingularityOreRecipes.addVoidOreRecipes_T10();
        FakeSingularityOreRecipes.addFakeVoidOreRecipes_T10();

        // Singularity of Void Gem
        SingularityGemRecipes.addVoidGemRecipes_T0();
        FakeSingularityGemRecipes.addFakeVoidGemRecipes_T0();
        SingularityGemRecipes.addVoidGemRecipes_T1();
        FakeSingularityGemRecipes.addFakeVoidGemRecipes_T1();
        SingularityGemRecipes.addVoidGemRecipes_T2();
        FakeSingularityGemRecipes.addFakeVoidGemRecipes_T2();
        SingularityGemRecipes.addVoidGemRecipes_T3();
        FakeSingularityGemRecipes.addFakeVoidGemRecipes_T3();
        SingularityGemRecipes.addVoidGemRecipes_T4();
        FakeSingularityGemRecipes.addFakeVoidGemRecipes_T4();
        SingularityGemRecipes.addVoidGemRecipes_T5();
        FakeSingularityGemRecipes.addFakeVoidGemRecipes_T5();
        SingularityGemRecipes.addVoidGemRecipes_T6();
        FakeSingularityGemRecipes.addFakeVoidGemRecipes_T6();
        SingularityGemRecipes.addVoidGemRecipes_T7();
        FakeSingularityGemRecipes.addFakeVoidGemRecipes_T7();
        SingularityGemRecipes.addVoidGemRecipes_T8();
        FakeSingularityGemRecipes.addFakeVoidGemRecipes_T8();
        SingularityGemRecipes.addVoidGemRecipes_T9();
        FakeSingularityGemRecipes.addFakeVoidGemRecipes_T9();
        SingularityGemRecipes.addVoidGemRecipes_T10();
        FakeSingularityGemRecipes.addFakeVoidGemRecipes_T10();

        // Singularity of Void Dust
        SingularityDustRecipes.addVoidDustRecipes_T0();
        FakeSingularityDustRecipes.addFakeVoidDustRecipes_T0();
        SingularityDustRecipes.addVoidDustRecipes_T1();
        FakeSingularityDustRecipes.addFakeVoidDustRecipes_T1();
        SingularityDustRecipes.addVoidDustRecipes_T2();
        FakeSingularityDustRecipes.addFakeVoidDustRecipes_T2();
        SingularityDustRecipes.addVoidDustRecipes_T3();
        FakeSingularityDustRecipes.addFakeVoidDustRecipes_T3();
        SingularityDustRecipes.addVoidDustRecipes_T4();
        FakeSingularityDustRecipes.addFakeVoidDustRecipes_T4();
        SingularityDustRecipes.addVoidDustRecipes_T5();
        FakeSingularityDustRecipes.addFakeVoidDustRecipes_T5();
        SingularityDustRecipes.addVoidDustRecipes_T6();
        FakeSingularityDustRecipes.addFakeVoidDustRecipes_T6();
        SingularityDustRecipes.addVoidDustRecipes_T7();
        FakeSingularityDustRecipes.addFakeVoidDustRecipes_T7();
        SingularityDustRecipes.addVoidDustRecipes_T8();
        FakeSingularityDustRecipes.addFakeVoidDustRecipes_T8();
        SingularityDustRecipes.addVoidDustRecipes_T9();
        FakeSingularityDustRecipes.addFakeVoidDustRecipes_T9();

        // Singularity of Void Fluid
        SingularityFluidRecipes.addVoidFluidRecipes_T0();
        FakeSingularityFluidRecipes.addFakeVoidFluidRecipes_T0();
        SingularityFluidRecipes.addVoidFluidRecipes_T1();
        FakeSingularityFluidRecipes.addFakeVoidFluidRecipes_T1();
        SingularityFluidRecipes.addVoidFluidRecipes_T2();
        FakeSingularityFluidRecipes.addFakeVoidFluidRecipes_T2();
        SingularityFluidRecipes.addVoidFluidRecipes_T3();
        FakeSingularityFluidRecipes.addFakeVoidFluidRecipes_T3();
        SingularityFluidRecipes.addVoidFluidRecipes_T4();
        FakeSingularityFluidRecipes.addFakeVoidFluidRecipes_T4();
        SingularityFluidRecipes.addVoidFluidRecipes_T5();
        FakeSingularityFluidRecipes.addFakeVoidFluidRecipes_T5();
        SingularityFluidRecipes.addVoidFluidRecipes_T6();
        FakeSingularityFluidRecipes.addFakeVoidFluidRecipes_T6();
        SingularityFluidRecipes.addVoidFluidRecipes_T7();
        FakeSingularityFluidRecipes.addFakeVoidFluidRecipes_T7();
        SingularityFluidRecipes.addVoidFluidRecipes_T8();
        FakeSingularityFluidRecipes.addFakeVoidFluidRecipes_T8();
        SingularityFluidRecipes.addVoidFluidRecipes_T9();
        FakeSingularityFluidRecipes.addFakeVoidFluidRecipes_T9();
        SingularityFluidRecipes_T10.addVoidFluidRecipes_T10();
        SingularityFluidRecipes_T10.addFakeVoidFluidRecipes_T10();

        // Singularity of Void Ingot
        SingularityIngotRecipes.addVoidIngotRecipes_T0();
        FakeSingularityIngotRecipes.addFakeVoidIngotRecipes_T0();
        SingularityIngotRecipes.addVoidIngotRecipes_T1();
        FakeSingularityIngotRecipes.addFakeVoidIngotRecipes_T1();
        SingularityIngotRecipes.addVoidIngotRecipes_T2();
        FakeSingularityIngotRecipes.addFakeVoidIngotRecipes_T2();
        SingularityIngotRecipes.addVoidIngotRecipes_T3();
        FakeSingularityIngotRecipes.addFakeVoidIngotRecipes_T3();
        SingularityIngotRecipes.addVoidIngotRecipes_T4();
        FakeSingularityIngotRecipes.addFakeVoidIngotRecipes_T4();
        SingularityIngotRecipes.addVoidIngotRecipes_T5();
        FakeSingularityIngotRecipes.addFakeVoidIngotRecipes_T5();
        SingularityIngotRecipes.addVoidIngotRecipes_T6();
        FakeSingularityIngotRecipes.addFakeVoidIngotRecipes_T6();
        SingularityIngotRecipes.addVoidIngotRecipes_T7();
        FakeSingularityIngotRecipes.addFakeVoidIngotRecipes_T7();
        SingularityIngotRecipes.addVoidIngotRecipes_T8();
        FakeSingularityIngotRecipes.addFakeVoidIngotRecipes_T8();
        SingularityIngotRecipes.addVoidIngotRecipes_T9();
        FakeSingularityIngotRecipes.addFakeVoidIngotRecipes_T9();
        SingularityIngotRecipes.addVoidIngotRecipes_T10();
        FakeSingularityIngotRecipes.addFakeVoidIngotRecipes_T10();

        // Singularity of Ecosystem
        SingularityEcosystemRecipes.addEcosystemRecipes_AlgaeFarm();
        FakeSingularityEcosystemRecipes.addFakeEcosystemRecipes_AlgaeFarm();
        SingularityEcosystemRecipes.addEcosystemRecipes_Comb();
        FakeSingularityEcosystemRecipes.addFakeEcosystemRecipes_Comb();
        SingularityEcosystemRecipes.addEcosystemRecipes_Food();
        FakeSingularityEcosystemRecipes.addFakeEcosystemRecipes_Food();
        SingularityEcosystemRecipes.addEcosystemRecipes_TreeGrowth();
        FakeSingularityEcosystemRecipes.addFakeEcosystemRecipes_TreeGrowth();

        // Singularity of Pachinko
        SingularityPachinkoRecipes.addPachinkoRecipes_GT_Item();
        FakeSingularityPachinkoRecipes.addFakePachinkoRecipes_GT_Item();
        SingularityPachinkoRecipes.addPachinkoRecipes_GT_Machine();
        FakeSingularityPachinkoRecipes.addFakePachinkoRecipes_GT_Machine();
        SingularityPachinkoRecipes.addPachinkoRecipes_Storage();
        FakeSingularityPachinkoRecipes.addFakePachinkoRecipes_Storage();

        ChaosZhuHaiRecipes.addChaosZhuHaiFisheryRecipes();
        ChaosXtremeCraftingRecipes.addChaosXtremeCraftingRecipes();

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
        SingularityDustRecipes_T10.addFakeVoidDustRecipes_T10();
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
