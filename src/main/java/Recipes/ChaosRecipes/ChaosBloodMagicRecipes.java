package Recipes.ChaosRecipes;

import static gregtech.api.enums.Mods.AppliedEnergistics2;
import static gregtech.api.enums.Mods.BiomesOPlenty;
import static gregtech.api.enums.Mods.BloodArsenal;
import static gregtech.api.enums.Mods.BloodMagic;
import static gregtech.api.enums.Mods.ElectroMagicTools;
import static gregtech.api.enums.Mods.EnderZoo;
import static gregtech.api.enums.Mods.Genetics;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.IndustrialCraft2;
import static gregtech.api.enums.Mods.MagicBees;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.Mods.NewHorizonsCoreMod;
import static gregtech.api.enums.Mods.Railcraft;
import static gregtech.api.enums.Mods.Thaumcraft;
import static gregtech.api.enums.Mods.ThaumicBases;
import static gregtech.api.enums.Mods.Witchery;
import static gregtech.api.enums.TierEU.RECIPE_IV;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import net.minecraftforge.fluids.FluidRegistry;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.BloodMagicOfChaosFrontend;

public class ChaosBloodMagicRecipes {

    public static final RecipeMap<RecipeMapBackend> addBloodMagicRecipes = RecipeMapBuilder.of("Chaos of BloodMagic")
        .maxIO(11, 1, 1, 0)
        .minInputs(1, 1)
        .neiHandlerInfo(builder -> builder.setHeight(102))
        .frontend(BloodMagicOfChaosFrontend::new)
        .neiTransferRect(105, 25, 20, 16)
        .build();

    public static void addBloodMagicRecipes_test() {
        // test_1
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Minecraft.ID, "brewing_stand", 1L),

                // Synthetic Materials
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 100))
            .itemOutputs(getModItem(Minecraft.ID, "brewing_stand", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // test_2
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(Minecraft.ID, "brewing_stand", 1L),

                // Synthetic Materials
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 100))
            .itemOutputs(getModItem(Minecraft.ID, "brewing_stand", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);
    }

    public static void addBloodMagicRecipes() {
        // "Altar of GregoriusT's Blood"
        // "Life Essence"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(Minecraft.ID, "bucket", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 1_000))
            .itemOutputs(getModItem(BloodMagic.ID, "bucketLife", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Blood TNT"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(Minecraft.ID, "tnt", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 10_000))
            .itemOutputs(getModItem(BloodArsenal.ID, "blood_tnt", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Blood Infused Iron Ingot"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(Minecraft.ID, "iron_ingot", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 6_000))
            .itemOutputs(getModItem(BloodArsenal.ID, "blood_infused_iron", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Blood Frame"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(MagicBees.ID, "frameMagic", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 5_000))
            .itemOutputs(getModItem(MagicBees.ID, "item.bloodSoakedFrame", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Blood Infused Wood"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(Minecraft.ID, "log", 1L, 0))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 5_000))
            .itemOutputs(getModItem(BloodArsenal.ID, "blood_infused_wood", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Blood Stained Glass"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(Minecraft.ID, "glass", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 200))
            .itemOutputs(getModItem(BloodArsenal.ID, "blood_stained_glass", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Blood Infused Iron Block"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(Minecraft.ID, "iron_block", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 64_000))
            .itemOutputs(getModItem(BloodArsenal.ID, "blood_infused_iron_block", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Blood Infused Glowstone"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(Minecraft.ID, "glowstone", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 28_000))
            .itemOutputs(getModItem(BloodArsenal.ID, "blood_infused_glowstone", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Blood Diamond"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(GregTech.ID, "gt.metaitem.02", 1L, 30500))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 12_000))
            .itemOutputs(getModItem(BloodArsenal.ID, "blood_diamond", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Blood Infused Diamond (Active)"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(BloodArsenal.ID, "blood_infused_diamond_unactive", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 120_000))
            .itemOutputs(getModItem(BloodArsenal.ID, "blood_infused_diamond_active", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Blood Burned String"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(Witchery.ID, "ingredient", 1L, 102))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 5_000))
            .itemOutputs(getModItem(BloodArsenal.ID, "blood_burned_string", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Blank Slate"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(NewHorizonsCoreMod.ID, "item.ArcaneSlate", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 1_000))
            .itemOutputs(getModItem(BloodMagic.ID, "blankSlate", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Reinforced Slate"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "blankSlate", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 2_500))
            .itemOutputs(getModItem(BloodMagic.ID, "reinforcedSlate", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Imbued Slate"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "reinforcedSlate", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 7_500))
            .itemOutputs(getModItem(BloodMagic.ID, "imbuedSlate", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Demonic Slate"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "imbuedSlate", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 20_000))
            .itemOutputs(getModItem(BloodMagic.ID, "demonicSlate", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Ethereal Slate"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "demonicSlate", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 60_000))
            .itemOutputs(getModItem(BloodMagic.ID, "bloodMagicBaseItems", 1L, 27))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Filled Socket"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "emptySocket", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 40_000))
            .itemOutputs(getModItem(BloodMagic.ID, "bloodSocket", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Elemental Inscription Tool: Water"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 2))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 5_000))
            .itemOutputs(getModItem(BloodMagic.ID, "waterScribeTool", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Elemental Inscription Tool: Fire"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 1))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 5_000))
            .itemOutputs(getModItem(BloodMagic.ID, "fireScribeTool", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Elemental Inscription Tool: Earth"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 3))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 5_000))
            .itemOutputs(getModItem(BloodMagic.ID, "earthScribeTool", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Elemental Inscription Tool: Air"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 0))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 5_000))
            .itemOutputs(getModItem(BloodMagic.ID, "airScribeTool", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Elemental Inscription Tool: Dusk"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 5))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 5_000))
            .itemOutputs(getModItem(BloodMagic.ID, "duskScribeTool", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Elemental Inscription Tool: Dawn"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(Thaumcraft.ID, "blockCrystal", 1L, 5))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 100_000))
            .itemOutputs(getModItem(BloodMagic.ID, "dawnScribeTool", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Ender Shard"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(EnderZoo.ID, "enderFragment", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 5_000))
            .itemOutputs(getModItem(BloodMagic.ID, "bloodMagicBaseItems", 1L, 32))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Enhanced Teleposition Focus"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "telepositionFocus", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 20_000))
            .itemOutputs(getModItem(BloodMagic.ID, "enhancedTelepositionFocus", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Blood-Soaked Ichorium Block"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(GregTech.ID, "gt.blockmetal8", 1L, 13))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 50_000))
            .itemOutputs(getModItem(NewHorizonsCoreMod.ID, "tile.BloodyIchorium", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Blood-Soaked Void Block"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(ThaumicBases.ID, "voidBlock", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 10_000))
            .itemOutputs(getModItem(NewHorizonsCoreMod.ID, "tile.BloodyVoid", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Blood-Soaked Thaumium Block"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(Thaumcraft.ID, "blockCosmeticSolid", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 5_000))
            .itemOutputs(getModItem(NewHorizonsCoreMod.ID, "tile.BloodyThaumium", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Bound Diamond"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(BloodArsenal.ID, "blood_infused_diamond_active", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 10_000))
            .itemOutputs(getModItem(BloodArsenal.ID, "blood_infused_diamond_bound", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Blood Stained Block"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "Altar", 0L),

                // Synthetic Materials
                getModItem(Minecraft.ID, "sandstone", 1L, 2))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 3_500))
            .itemOutputs(getModItem(Railcraft.ID, "brick.bloodstained", 1L, 2))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Alchemic Chemistry Set"
        // Offensa
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 3),
                getModItem(BloodMagic.ID, "incendium", 2L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 2_000))
            .itemOutputs(getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 0))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // Praesidium
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 3),
                getModItem(BloodMagic.ID, "tennebrae", 2L),
                getModItem(Witchery.ID, "ingredient", 2L, 56))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 2_000))
            .itemOutputs(getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 1))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Orbis Terrae"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 3),
                getModItem(BloodMagic.ID, "terrae", 2L),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 2542))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 2_000))
            .itemOutputs(getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 2))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Strengthened Catalyst"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "simpleCatalyst", 2L),
                getModItem(BloodMagic.ID, "terrae", 2L),
                getModItem(Minecraft.ID, "dye", 1L, 15),
                getModItem(Minecraft.ID, "nether_wart", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 1_500))
            .itemOutputs(getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 3))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Concentrated Catalyst"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 3),
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 5),
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 2L, 8),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 1086))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 3_000))
            .itemOutputs(getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 4))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Fractured Bone"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(Minecraft.ID, "bone", 4L),
                getModItem(Minecraft.ID, "gunpowder", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 500))
            .itemOutputs(getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 5))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // Virtus
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 3),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 2346),
                getModItem(NewHorizonsCoreMod.ID, "item.ChargedCertusQuartzDust", 2L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 4_000))
            .itemOutputs(getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 6))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // Reductus
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 3),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 2379),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 2702))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 4_000))
            .itemOutputs(getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 7))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // Potentia
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 3),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 2367),
                getModItem(IndustrialCraft2.ID, "itemDust2", 2L, 2))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 4_000))
            .itemOutputs(getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 8))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Cracked Runic Plate"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "bloodMagicBaseAlchemyItems", 1L, 3),
                getModItem(BloodMagic.ID, "imbuedSlate", 2L),
                getModItem(BloodMagic.ID, "magicales", 2L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 2_000))
            .itemOutputs(getModItem(BloodMagic.ID, "bloodMagicBaseItems", 2L, 15))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Runic Plate"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 2L, 15),
                getModItem(BloodMagic.ID, "demonicSlate", 1L),
                getModItem(BloodMagic.ID, "terrae", 2L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 6_000))
            .itemOutputs(getModItem(BloodMagic.ID, "bloodMagicBaseItems", 1L, 16))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Imbued Runic Plate"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "aquasalus", 1L),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 2L, 16),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 1L, 27),
                getModItem(BloodMagic.ID, "incendium", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 12_000))
            .itemOutputs(getModItem(BloodMagic.ID, "bloodMagicBaseItems", 1L, 17))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Soul Runic Plate"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 1L, 17),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 1L, 27),
                getModItem(BloodMagic.ID, "bloodMagicBaseItems", 2L, 29),
                getModItem(BloodMagic.ID, "weakBloodShard", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 25_000))
            .itemOutputs(getModItem(BloodMagic.ID, "bloodMagicBaseItems", 1L, 30))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // Tenebrae
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "simpleCatalyst", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2535),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2536),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2538),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2804))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 1_000))
            .itemOutputs(getModItem(BloodMagic.ID, "tennebrae", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // Aquasalus
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "simpleCatalyst", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 2543),
                getModItem(Minecraft.ID, "dye", 1L, 0),
                getModItem(Minecraft.ID, "potion", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 1_000))
            .itemOutputs(getModItem(BloodMagic.ID, "aquasalus", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // Terrae
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 45),
                getModItem(BloodMagic.ID, "simpleCatalyst", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2804),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2935),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2936))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 1_000))
            .itemOutputs(getModItem(BloodMagic.ID, "terrae", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // Crepitous
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "simpleCatalyst", 1L),
                getModItem(BloodMagic.ID, "blankSlate", 2L),
                getModItem(Minecraft.ID, "gunpowder", 2L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 1_000))
            .itemOutputs(getModItem(BloodMagic.ID, "crepitous", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // Magicales
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "simpleCatalyst", 1L),
                getModItem(Minecraft.ID, "gunpowder", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2330),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 1),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 14))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 1_000))
            .itemOutputs(getModItem(BloodMagic.ID, "magicales", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // Incendium
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "simpleCatalyst", 1L),
                getModItem(Minecraft.ID, "blaze_powder", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 1347),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2541),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2807))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 1_000))
            .itemOutputs(getModItem(BloodMagic.ID, "incendium", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // Aether
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "simpleCatalyst", 1L),
                getModItem(ElectroMagicTools.ID, "EMTItems", 1L, 8),
                getModItem(Minecraft.ID, "feather", 2L),
                getModItem(Minecraft.ID, "ghast_tear", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 1_000))
            .itemOutputs(getModItem(BloodMagic.ID, "aether", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Large Bloodstone Brick"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "ritualStone", 4L),
                getModItem(BloodMagic.ID, "weakBloodShard", 1L))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 2_500))
            .itemOutputs(getModItem(BloodMagic.ID, "largeBloodStoneBrick", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Simple Catalyst"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(Genetics.ID, "misc", 1L, 4),
                getModItem(Minecraft.ID, "glowstone_dust", 1L),
                getModItem(Minecraft.ID, "gunpowder", 1L),
                getModItem(Minecraft.ID, "redstone", 1L),
                getModItem(Thaumcraft.ID, "ItemEssence", 1L, 0))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 500))
            .itemOutputs(getModItem(BloodMagic.ID, "simpleCatalyst", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // Crystallos
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "simpleCatalyst", 1L),
                getModItem(BiomesOPlenty.ID, "hardIce", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 3L, 2702))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 1_000))
            .itemOutputs(getModItem(BloodMagic.ID, "crystallos", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // Sanctus
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "simpleCatalyst", 1L),
                getModItem(Minecraft.ID, "glowstone_dust", 2L),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2351),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2890))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 1_000))
            .itemOutputs(getModItem(BloodMagic.ID, "sanctus", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Standard Binding Agent"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "crystallos", 1L),
                getModItem(BloodMagic.ID, "sanctus", 1L),
                getModItem(BloodMagic.ID, "weakBindingAgent", 2L),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2028))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 4_000))
            .itemOutputs(getModItem(BloodMagic.ID, "standardBindingAgent", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);

        // "Weak Binding Agent"
        GTValues.RA.stdBuilder()
            .itemInputs(
                getModItem(BloodMagic.ID, "blockWritingTable", 0L),

                // Synthetic Materials
                getModItem(BloodMagic.ID, "simpleCatalyst", 1L),
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2020),
                getModItem(GregTech.ID, "gt.metaitem.01", 2L, 2805))
            .fluidInputs(FluidRegistry.getFluidStack("lifeessence", 2_000))
            .itemOutputs(getModItem(BloodMagic.ID, "weakBindingAgent", 1L))
            .duration(SECONDS)
            .eut(RECIPE_IV)
            .addTo(addBloodMagicRecipes);
    }
}
