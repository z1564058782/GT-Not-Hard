package Recipes.SingularityRecipes_VoidGem;

import static gregtech.api.enums.Mods.AppliedEnergistics2;
import static gregtech.api.enums.Mods.BiomesOPlenty;
import static gregtech.api.enums.Mods.Botania;
import static gregtech.api.enums.Mods.GalacticraftAmunRa;
import static gregtech.api.enums.Mods.IndustrialCraft2;
import static gregtech.api.enums.Mods.NEIOrePlugin;
import static gregtech.api.enums.Mods.Railcraft;
import static gregtech.api.enums.Mods.Thaumcraft;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import bartworks.system.material.WerkstoffLoader;
import goodgenerator.items.GGMaterial;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import gtnhlanth.common.register.WerkstoffMaterialPool;
import util.OneToManyItemsFrontend;

public class FakeSingularityGemRecipes {

    public static final RecipeMap<RecipeMapBackend> addFakeVoidGemRecipes = RecipeMapBuilder.of("Singularity of Gem")
        .maxIO(1, 135, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend::new)
        .build();

    public static void addFakeVoidGemRecipes() {
        // T0 - Overworld - Ow
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ow", 1L))
            .itemOutputs(
                Materials.Apatite.getGems(1),
                Materials.Coal.getGems(1),
                Materials.Diamond.getGems(1),
                Materials.GarnetRed.getGems(1),
                Materials.GarnetYellow.getGems(1),
                Materials.Lapis.getGems(1),
                Materials.Lazurite.getGems(1),
                Materials.Lignite.getGems(1),
                Materials.RockSalt.getGems(1),
                Materials.Ruby.getGems(1),
                Materials.Salt.getGems(1),
                Materials.Sodalite.getGems(1),
                Materials.Spodumene.getGems(1),
                Materials.TricalciumPhosphate.getGems(1),

                getModItem(BiomesOPlenty.ID, "gems", 1L, 5),

                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T0 - Nether - Ne
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ne", 1L))
            .itemOutputs(
                Materials.CertusQuartz.getGems(1),
                Materials.Emerald.getGems(1),
                Materials.Quartz.getGems(1),
                Materials.Quartzite.getGems(1),

                getModItem(BiomesOPlenty.ID, "gems", 1L, 5),

                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T0 - Twilight - TF
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_TF", 1L))
            .itemOutputs(
                Materials.Amber.getGems(1),
                Materials.Amethyst.getGems(1),
                Materials.Apatite.getGems(1),
                Materials.BlueTopaz.getGems(1),
                Materials.Coal.getGems(1),
                Materials.Diamond.getGems(1),
                Materials.Emerald.getGems(1),
                Materials.GarnetRed.getGems(1),
                Materials.GarnetYellow.getGems(1),
                Materials.GreenSapphire.getGems(1),
                Materials.Jasper.getGems(1),
                Materials.Lapis.getGems(1),
                Materials.Lazurite.getGems(1),
                Materials.Lignite.getGems(1),
                Materials.Olivine.getGems(1),
                Materials.Opal.getGems(1),
                Materials.RockSalt.getGems(1),
                Materials.Ruby.getGems(1),
                Materials.Salt.getGems(1),
                Materials.Sapphire.getGems(1),
                Materials.Sodalite.getGems(1),
                Materials.Spodumene.getGems(1),
                Materials.Tanzanite.getGems(1),
                Materials.Topaz.getGems(1),
                Materials.TricalciumPhosphate.getGems(1),

                getModItem(BiomesOPlenty.ID, "gems", 1L, 5),

                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 6),

                getModItem(Thaumcraft.ID, "ItemShard", 1L, 0),
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 1),
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 2),
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 3),
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 4),
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 5))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T0 - TheEnd - ED
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_ED", 1L))
            .itemOutputs(Materials.Emerald.getGems(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T0 - EndAsteroid - EA
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_EA", 1L))
            .itemOutputs(
                Materials.Emerald.getGems(1),
                Materials.Lapis.getGems(1),
                Materials.Lazurite.getGems(1),
                Materials.Olivine.getGems(1),
                Materials.Sodalite.getGems(1),

                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T1 - Moon - Mo
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mo", 1L))
            .itemOutputs(
                Materials.CertusQuartz.getGems(1),
                Materials.GarnetYellow.getGems(1),
                Materials.Monazite.getGems(1),
                Materials.Quartzite.getGems(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T2 - Deimos - De
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_De", 1L))
            .itemOutputs(
                Materials.Diamond.getGems(1),
                Materials.Jade.getGems(1),
                Materials.Lapis.getGems(1),
                Materials.Lazurite.getGems(1),
                Materials.Monazite.getGems(1),
                Materials.Opal.getGems(1),
                Materials.Sodalite.getGems(1),
                Materials.Tanzanite.getGems(1),
                Materials.Vinteum.getGems(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T2 - Mars - Ma
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ma", 1L))
            .itemOutputs(
                Materials.CertusQuartz.getGems(1),
                Materials.Emerald.getGems(1),
                Materials.Quartzite.getGems(1),
                Materials.RockSalt.getGems(1),
                Materials.Salt.getGems(1),
                Materials.Spodumene.getGems(1),

                getModItem(BiomesOPlenty.ID, "gems", 1L, 5),

                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T2 - Phobos - Ph
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ph", 1L))
            .itemOutputs(
                Materials.CertusQuartz.getGems(1),
                Materials.Coal.getGems(1),
                Materials.Diamond.getGems(1),
                Materials.Jade.getGems(1),
                Materials.Lapis.getGems(1),
                Materials.Lignite.getGems(1),
                Materials.Opal.getGems(1),
                Materials.Quartzite.getGems(1),
                Materials.Tanzanite.getGems(1),
                Materials.Vinteum.getGems(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T3 - Asteroids - As
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_As", 1L))
            .itemOutputs(Materials.Diamond.getGems(1), Materials.GarnetYellow.getGems(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T3 - Callisto - Ca
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ca", 1L))
            .itemOutputs(
                Materials.BlueTopaz.getGems(1),
                Materials.Diamond.getGems(1),
                Materials.GarnetYellow.getGems(1),
                Materials.Monazite.getGems(1),
                Materials.Topaz.getGems(1),

                getModItem(BiomesOPlenty.ID, "gems", 1L, 5))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T3 - Ceres - Ce
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ce", 1L))
            .itemOutputs(
                Materials.Diamond.getGems(1),
                Materials.Emerald.getGems(1),
                Materials.Lapis.getGems(1),
                Materials.Lazurite.getGems(1),
                Materials.Olivine.getGems(1),
                Materials.Sodalite.getGems(1),

                getModItem(BiomesOPlenty.ID, "gems", 1L, 5))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T3 - Europa - Eu
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Eu", 1L))
            .itemOutputs(Materials.GarnetRed.getGems(1), Materials.Opal.getGems(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T3 - Ganymede - Ga
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ga", 1L))
            .itemOutputs(
                Materials.Coal.getGems(1),
                Materials.Diamond.getGems(1),
                Materials.GarnetYellow.getGems(1),
                Materials.Lapis.getGems(1),
                Materials.Lignite.getGems(1),

                getModItem(BiomesOPlenty.ID, "gems", 1L, 5),

                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T3 - Ross128b - Rb
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Rb", 1L))
            .itemOutputs(
                WerkstoffLoader.Bismutite.get(OrePrefixes.gem, 1),
                WerkstoffLoader.ChromoAluminoPovondrait.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Fayalit.get(OrePrefixes.gem, 1),
                WerkstoffLoader.FluorBuergerit.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Forsterit.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Olenit.get(OrePrefixes.gem, 1),
                WerkstoffLoader.RedZircon.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Spodumen.get(OrePrefixes.gem, 1),
                WerkstoffLoader.VanadioOxyDravit.get(OrePrefixes.gem, 1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T4 - Io - Io
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Io", 1L))
            .itemOutputs(
                Materials.Apatite.getGems(1),
                Materials.CertusQuartz.getGems(1),
                Materials.Jasper.getGems(1),
                Materials.Lapis.getGems(1),
                Materials.Monazite.getGems(1),
                Materials.Quartzite.getGems(1),
                Materials.TricalciumPhosphate.getGems(1),

                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),

                getModItem(Railcraft.ID, "firestone.raw", 1L))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T4 - Mercury - Me
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Me", 1L))
            .itemOutputs(
                Materials.Coal.getGems(1),
                Materials.Diamond.getGems(1),
                Materials.GarnetYellow.getGems(1),
                Materials.Jade.getGems(1),
                Materials.Lignite.getGems(1),
                Materials.Vinteum.getGems(1),

                getModItem(BiomesOPlenty.ID, "gems", 1L, 5),

                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),

                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T4 - Venus - Ve
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ve", 1L))
            .itemOutputs(
                Materials.Amethyst.getGems(1),
                Materials.CertusQuartz.getGems(1),
                Materials.Diamond.getGems(1),
                Materials.Emerald.getGems(1),
                Materials.Monazite.getGems(1),
                Materials.Quartzite.getGems(1),

                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),

                getModItem(Railcraft.ID, "firestone.raw", 1L),

                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T5 - Enceladus - En
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_En", 1L))
            .itemOutputs(
                Materials.Lapis.getGems(1),
                Materials.Lazurite.getGems(1),
                Materials.Monazite.getGems(1),
                Materials.Opal.getGems(1),
                Materials.Sodalite.getGems(1),

                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T5 - Miranda - Mi
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mi", 1L))
            .itemOutputs(
                Materials.Apatite.getGems(1),
                Materials.Coal.getGems(1),
                Materials.Diamond.getGems(1),
                Materials.GarnetYellow.getGems(1),
                Materials.Jade.getGems(1),
                Materials.Lignite.getGems(1),
                Materials.TricalciumPhosphate.getGems(1),
                Materials.Vinteum.getGems(1),

                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),

                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T5 - Oberon - Ob
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ob", 1L))
            .itemOutputs(
                Materials.Diamond.getGems(1),
                Materials.Lapis.getGems(1),

                getModItem(BiomesOPlenty.ID, "gems", 1L, 5),

                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T5 - Titan - Ti
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ti", 1L))
            .itemOutputs(
                Materials.Coal.getGems(1),
                Materials.Diamond.getGems(1),
                Materials.Emerald.getGems(1),
                Materials.GarnetYellow.getGems(1),
                Materials.Lignite.getGems(1),
                Materials.Monazite.getGems(1),

                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T5 - Ross128ba - Ra
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ra", 1L))
            .itemOutputs(
                Materials.Amethyst.getGems(1),
                Materials.GarnetYellow.getGems(1),
                Materials.Olivine.getGems(1),

                WerkstoffLoader.BArTiMaEuSNeK.get(OrePrefixes.gem, 1),
                WerkstoffLoader.ChromoAluminoPovondrait.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Fayalit.get(OrePrefixes.gem, 1),
                WerkstoffLoader.FluorBuergerit.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Fluorspar.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Hedenbergit.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Olenit.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Prasiolite.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Tiberium.get(OrePrefixes.gem, 1),
                WerkstoffLoader.VanadioOxyDravit.get(OrePrefixes.gem, 1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T6 - Proteus - Pr
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Pr", 1L))
            .itemOutputs(
                Materials.CertusQuartz.getGems(1),
                Materials.Coal.getGems(1),
                Materials.Diamond.getGems(1),
                Materials.GarnetYellow.getGems(1),
                Materials.Lignite.getGems(1),
                Materials.Quartzite.getGems(1),

                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T6 - Triton - Tr
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Tr", 1L))
            .itemOutputs(
                Materials.Diamond.getGems(1),
                Materials.Monazite.getGems(1),

                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T7 - Haumea - Ha
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ha", 1L))
            .itemOutputs(
                Materials.Emerald.getGems(1),
                Materials.GarnetRed.getGems(1),
                Materials.GarnetYellow.getGems(1),
                Materials.Monazite.getGems(1),
                Materials.NetherStar.getGems(1),
                Materials.Olivine.getGems(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T7 - Kuiperbelt - KB
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_KB", 1L))
            .itemOutputs(
                Materials.Coal.getGems(1),
                Materials.Diamond.getGems(1),
                Materials.Lignite.getGems(1),

                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T7 - Makemake - MM
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_MM", 1L))
            .itemOutputs(
                Materials.Emerald.getGems(1),
                Materials.GarnetRed.getGems(1),
                Materials.GarnetYellow.getGems(1),
                Materials.Monazite.getGems(1),
                Materials.Olivine.getGems(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T7 - Pluto - Pl
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Pl", 1L))
            .itemOutputs(
                Materials.Coal.getGems(1),
                Materials.Diamond.getGems(1),
                Materials.Emerald.getGems(1),
                Materials.GarnetRed.getGems(1),
                Materials.GarnetYellow.getGems(1),
                Materials.Lignite.getGems(1),

                getModItem(BiomesOPlenty.ID, "gems", 1L, 5),

                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T8 - BarnardC - BC
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BC", 1L))
            .itemOutputs(
                Materials.Coal.getGems(1),
                Materials.GarnetRed.getGems(1),
                Materials.GarnetYellow.getGems(1),
                Materials.Lignite.getGems(1),
                Materials.Monazite.getGems(1),
                Materials.RockSalt.getGems(1),
                Materials.Salt.getGems(1),
                Materials.Spodumene.getGems(1),

                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T8 - BarnardE - BE
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BE", 1L))
            .itemOutputs(
                Materials.GarnetRed.getGems(1),
                Materials.GarnetYellow.getGems(1),
                Materials.NetherStar.getGems(1),
                Materials.Olivine.getGems(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T8 - BarnardF - BF
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_BF", 1L))
            .itemOutputs(
                Materials.Coal.getGems(1),
                Materials.Diamond.getGems(1),
                Materials.Emerald.getGems(1),
                Materials.GarnetRed.getGems(1),
                Materials.GarnetYellow.getGems(1),
                Materials.Lignite.getGems(1),
                Materials.Monazite.getGems(1),

                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T8 - α Centauri Bb - CB
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_CB", 1L))
            .itemOutputs(
                Materials.CertusQuartz.getGems(1),
                Materials.Emerald.getGems(1),
                Materials.GarnetRed.getGems(1),
                Materials.GarnetYellow.getGems(1),
                Materials.Monazite.getGems(1),
                Materials.Quartz.getGems(1),
                Materials.Quartzite.getGems(1),

                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T8 - TCetiE - TE
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_TE", 1L))
            .itemOutputs(
                Materials.Apatite.getGems(1),
                Materials.CertusQuartz.getGems(1),
                Materials.GarnetRed.getGems(1),
                Materials.GarnetYellow.getGems(1),
                Materials.Lapis.getGems(1),
                Materials.NetherStar.getGems(1),
                Materials.Opal.getGems(1),
                Materials.Quartzite.getGems(1),
                Materials.RockSalt.getGems(1),
                Materials.Salt.getGems(1),
                Materials.Spodumene.getGems(1),
                Materials.TricalciumPhosphate.getGems(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T8 - VegaB - VB
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_VB", 1L))
            .itemOutputs(
                Materials.Diamond.getGems(1),
                Materials.GarnetRed.getGems(1),
                Materials.GarnetYellow.getGems(1),
                Materials.Lapis.getGems(1),
                Materials.Lazurite.getGems(1),
                Materials.NetherStar.getGems(1),
                Materials.Sodalite.getGems(1),

                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T9 - Anubis - An
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_An", 1L))
            .itemOutputs(
                Materials.BlueTopaz.getGems(1),
                Materials.GarnetYellow.getGems(1),
                Materials.Olivine.getGems(1),
                Materials.Topaz.getGems(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T9 - Horus - Ho
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ho", 1L))
            .itemOutputs(
                Materials.Amethyst.getGems(1),
                Materials.BlueTopaz.getGems(1),
                Materials.CertusQuartz.getGems(1),
                Materials.Emerald.getGems(1),
                Materials.GarnetRed.getGems(1),
                Materials.GarnetYellow.getGems(1),
                Materials.GreenSapphire.getGems(1),
                Materials.Jade.getGems(1),
                Materials.Jasper.getGems(1),
                Materials.NetherStar.getGems(1),
                Materials.Olivine.getGems(1),
                Materials.Opal.getGems(1),
                Materials.Quartzite.getGems(1),
                Materials.Ruby.getGems(1),
                Materials.Sapphire.getGems(1),
                Materials.Tanzanite.getGems(1),
                Materials.Topaz.getGems(1),
                Materials.Vinteum.getGems(1),

                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T9 - Maahes - Mh
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mh", 1L))
            .itemOutputs(
                Materials.Amethyst.getGems(1),
                Materials.BlueTopaz.getGems(1),
                Materials.Topaz.getGems(1),

                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T9 - MehenBelt - MB
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_MB", 1L))
            .itemOutputs(
                Materials.GarnetYellow.getGems(1),
                Materials.Lapis.getGems(1),
                Materials.Lazurite.getGems(1),
                Materials.NetherStar.getGems(1),
                Materials.Olivine.getGems(1),
                Materials.Sodalite.getGems(1),

                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T9 - Neper - Np
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Np", 1L))
            .itemOutputs(
                Materials.CertusQuartz.getGems(1),
                Materials.Dilithium.getGems(1),
                Materials.GarnetYellow.getGems(1),
                Materials.Quartz.getGems(1),
                Materials.Quartzite.getGems(1),

                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 1),

                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 6),
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 0),
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 1),
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 2),
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 3),
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 4),
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 5))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T9 - Seth - Se
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Se", 1L))
            .itemOutputs(
                Materials.Monazite.getGems(1),
                Materials.Jade.getGems(1),
                Materials.Vinteum.getGems(1),

                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T10 - DeepDark - DD
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L))
            .itemOutputs(
                Materials.Coal.getGems(1),
                Materials.Charcoal.getGems(1),
                Materials.Diamond.getGems(1),
                Materials.Lapis.getGems(1),
                Materials.EnderPearl.getGems(1),
                Materials.EnderEye.getGems(1),
                Materials.Emerald.getGems(1),
                Materials.NetherStar.getGems(1),
                Materials.NetherQuartz.getGems(1),

                getModItem(BiomesOPlenty.ID, "gems", 1L, 0), // Ender Amethyst
                getModItem(BiomesOPlenty.ID, "gems", 1L, 1), // Ruby
                getModItem(BiomesOPlenty.ID, "gems", 1L, 2), // Peridot
                getModItem(BiomesOPlenty.ID, "gems", 1L, 3), // Topaz
                getModItem(BiomesOPlenty.ID, "gems", 1L, 4), // Tanzanite
                getModItem(BiomesOPlenty.ID, "gems", 1L, 5), // Malachite
                getModItem(BiomesOPlenty.ID, "gems", 1L, 6), // Sapphire
                getModItem(BiomesOPlenty.ID, "gems", 1L, 7), // Amber

                getModItem(Botania.ID, "manaResource", 1L, 1), // Mana Pearl
                getModItem(Botania.ID, "manaResource", 1L, 2), // Mana Diamond
                getModItem(Botania.ID, "manaResource", 1L, 9), // Dragonstone

                getModItem(GalacticraftAmunRa.ID, "item.baseItem", 1L, 6), // Ruby

                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L), // Iridium Ore
                getModItem(IndustrialCraft2.ID, "itemPartIndustrialDiamond", 1L), // Industrial Diamond

                getModItem(Railcraft.ID, "firestone.raw", 1L), // Raw Firestore

                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3), // Quicksilver
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 6), // Amber
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 0), // Air Shard
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 1), // Fire Shard
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 2), // Water Shard
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 3), // Earth Shard
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 4), // Order Shard
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 5), // Entropy Shard

                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 1), // Charged Certus Quartz Crystal
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 7), // Fluix Crystal
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 10), // Pure Certus Quartz Crystal
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 12) // Pure Fluix Crystal
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T10 - DeepDark - DD
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L))
            .itemOutputs(
                WerkstoffLoader.Bismutite.get(OrePrefixes.gem, 1),
                WerkstoffLoader.CubicZirconia.get(OrePrefixes.gem, 1),
                WerkstoffLoader.FluorBuergerit.get(OrePrefixes.gem, 1),
                WerkstoffLoader.ChromoAluminoPovondrait.get(OrePrefixes.gem, 1),
                WerkstoffLoader.VanadioOxyDravit.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Olenit.get(OrePrefixes.gem, 1),
                WerkstoffLoader.RedZircon.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Salt.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Spodumen.get(OrePrefixes.gem, 1),
                WerkstoffLoader.RockSalt.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Fayalit.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Forsterit.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Hedenbergit.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Prasiolite.get(OrePrefixes.gem, 1),
                WerkstoffLoader.MagnetoResonaticDust.get(OrePrefixes.gem, 1),
                WerkstoffLoader.BArTiMaEuSNeK.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Tiberium.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Fluorspar.get(OrePrefixes.gem, 1),

                GGMaterial.orundum.get(OrePrefixes.gem, 1),

                WerkstoffMaterialPool.CeriumDopedLutetiumAluminiumGarnet.get(OrePrefixes.gem, 1),
                WerkstoffMaterialPool.LanthanumHexaboride.get(OrePrefixes.gem, 1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);

        // T10 - DeepDark - DD
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L))
            .itemOutputs(
                Materials.Firestone.getGems(1),
                Materials.Ruby.getGems(1),
                Materials.Sapphire.getGems(1),
                Materials.GreenSapphire.getGems(1),
                Materials.Olivine.getGems(1),
                Materials.Topaz.getGems(1),
                Materials.Tanzanite.getGems(1),
                Materials.Amethyst.getGems(1),
                Materials.Opal.getGems(1),
                Materials.Jasper.getGems(1),
                Materials.BlueTopaz.getGems(1),
                Materials.Amber.getGems(1),
                Materials.Dilithium.getGems(1),
                Materials.CertusQuartz.getGems(1),
                Materials.Forcicium.getGems(1),
                Materials.Forcillium.getGems(1),
                Materials.Monazite.getGems(1),
                Materials.Force.getGems(1),
                Materials.Quartzite.getGems(1),
                Materials.Lazurite.getGems(1),
                Materials.Sodalite.getGems(1),
                Materials.GarnetRed.getGems(1),
                Materials.GarnetYellow.getGems(1),
                Materials.Vinteum.getGems(1),
                Materials.Apatite.getGems(1),
                Materials.Niter.getGems(1),
                Materials.TricalciumPhosphate.getGems(1),
                Materials.Jade.getGems(1),
                Materials.Lignite.getGems(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Gem Mode")
            .eut(0)
            .addTo(addFakeVoidGemRecipes);
    }
}
