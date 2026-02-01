package Recipes.SingularityRecipes_VoidDust;

import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.NEIOrePlugin;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import bartworks.system.material.WerkstoffLoader;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.OneToManyItemsFrontend;

public class FakeSingularityDustRecipes_T0 {

    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T0 = RecipeMapBuilder
        .of("Singularity of T0 Dust")
        .maxIO(1, 135, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend::new)
        .build();

    public static void addFakeVoidDustRecipes_T0() {
        // T0 - Overworld - Ow
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ow", 1L))
            .itemOutputs(
                getModItem(GTPlusPlus.ID, "itemDustAgarditeCd", 1), // Agardite (Cd) Dust
                getModItem(GTPlusPlus.ID, "itemDustAgarditeLa", 1), // Agardite (La) Dust
                getModItem(GTPlusPlus.ID, "itemDustAgarditeNd", 1), // Agardite (Nd) Dust
                getModItem(GTPlusPlus.ID, "itemDustAlburnite", 1), // Alburnite Dust
                getModItem(GTPlusPlus.ID, "itemDustAncientGranite", 1), // Ancient Granite Dust
                getModItem(GTPlusPlus.ID, "itemDustBlackMetal", 1), // Black Metal Dust
                getModItem(GTPlusPlus.ID, "itemDustCrocoite", 1), // Crocoite Dust
                getModItem(GTPlusPlus.ID, "itemDustCryoliteF", 1), // Cryolite (F) Dust
                getModItem(GTPlusPlus.ID, "itemDustDemicheleiteBr", 1), // Demicheleite (Br) Dust
                getModItem(GTPlusPlus.ID, "itemDustFlorencite", 1), // Florencite Dust
                getModItem(GTPlusPlus.ID, "itemDustFluorcaphite", 1), // Fluorcaphite Dust
                getModItem(GTPlusPlus.ID, "itemDustGadoliniteY", 1), // Gadolinite (Y) Dust
                getModItem(GTPlusPlus.ID, "itemDustGreenockite", 1), // Greenockite Dust
                getModItem(GTPlusPlus.ID, "itemDustLanthaniteCe", 1), // Lanthanite (Ce) Dust
                getModItem(GTPlusPlus.ID, "itemDustLanthaniteNd", 1), // Lanthanite (Nd) Dust
                getModItem(GTPlusPlus.ID, "itemDustLautarite", 1), // Lautarite Dust
                getModItem(GTPlusPlus.ID, "itemDustLepersonnite", 1), // Lepersonnite Dust
                getModItem(GTPlusPlus.ID, "itemDustNichromite", 1), // Nichromite Dust
                getModItem(GTPlusPlus.ID, "itemDustRunite", 1), // Runite Dust
                getModItem(GTPlusPlus.ID, "itemDustSamarskiteY", 1), // Samarskite (Y) Dust
                getModItem(GTPlusPlus.ID, "itemDustYttriaite", 1), // Yttriaite Dust
                getModItem(GTPlusPlus.ID, "itemDustYttrialite", 1), // Yttrialite Dust
                getModItem(GTPlusPlus.ID, "itemDustZircon", 1), // Zircon Dust

                Materials.Alunite.getDust(1),
                Materials.Andradite.getDust(1),
                Materials.Apatite.getDust(1),
                Materials.Asbestos.getDust(1),
                Materials.BandedIron.getDust(1),
                Materials.Basalt.getDust(1),
                Materials.Borax.getDust(1),
                Materials.BrownLimonite.getDust(1),
                Materials.Cadmium.getDust(1),
                Materials.Caesium.getDust(1),
                Materials.Calcite.getDust(1),
                Materials.Calcium.getDust(1),
                Materials.Carbon.getDust(1),
                Materials.Cassiterite.getDust(1),
                Materials.CassiteriteSand.getDust(1),
                Materials.Chalcopyrite.getDust(1),
                Materials.Chrome.getDust(1),
                Materials.Cinnabar.getDust(1),
                Materials.Coal.getDust(1),
                Materials.Cobalt.getDust(1),
                Materials.Copper.getDust(1),
                Materials.Diamond.getDust(1),
                Materials.Diatomite.getDust(1),
                Materials.Dolomite.getDust(1),
                Materials.FullersEarth.getDust(1),
                Materials.Galena.getDust(1),
                Materials.Gallium.getDust(1),
                Materials.GarnetRed.getDust(1),
                Materials.GarnetSand.getDust(1),
                Materials.GarnetYellow.getDust(1),
                Materials.Glauconite.getDust(1),
                Materials.GlauconiteSand.getDust(1),
                Materials.Glowstone.getDust(1),
                Materials.Gold.getDust(1),
                Materials.GraniteBlack.getDust(1),
                Materials.Graphite.getDust(1),
                Materials.Grossular.getDust(1),
                Materials.Gypsum.getDust(1),
                Materials.Iron.getDust(1),
                Materials.Kaolinite.getDust(1),
                Materials.Kyanite.getDust(1),
                Materials.Lapis.getDust(1),
                Materials.Lazurite.getDust(1),
                Materials.Lead.getDust(1),
                Materials.Lepidolite.getDust(1),
                Materials.Lignite.getDust(1),
                Materials.Lithium.getDust(1),
                Materials.Magnesite.getDust(1),
                Materials.Magnesium.getDust(1),
                Materials.Magnetite.getDust(1),
                Materials.Malachite.getDust(1),
                Materials.Manganese.getDust(1),
                Materials.Mica.getDust(1),
                Materials.NetherQuartz.getDust(1),
                Materials.Nickel.getDust(1),
                Materials.Niobium.getDust(1),
                Materials.Pentlandite.getDust(1),
                Materials.Phosphate.getDust(1),
                Materials.Pollucite.getDust(1),
                Materials.Pyrite.getDust(1),
                Materials.Pyrochlore.getDust(1),
                Materials.RareEarth.getDust(1),
                Materials.Redstone.getDust(1),
                Materials.RoastedIron.getDust(1),
                Materials.RockSalt.getDust(1),
                Materials.Rubidium.getDust(1),
                Materials.Ruby.getDust(1),
                Materials.Salt.getDust(1),
                Materials.Sapphire.getDust(1),
                Materials.SiliconDioxide.getDust(1),
                Materials.Silver.getDust(1),
                Materials.Soapstone.getDust(1),
                Materials.Sodalite.getDust(1),
                Materials.Sodium.getDust(1),
                Materials.Spessartine.getDust(1),
                Materials.Spodumene.getDust(1),
                Materials.Sulfur.getDust(1),
                Materials.Talc.getDust(1),
                Materials.Tantalite.getDust(1),
                Materials.Tantalum.getDust(1),
                Materials.Thorium.getDust(1),
                Materials.Tin.getDust(1),
                Materials.TricalciumPhosphate.getDust(1),
                Materials.Trona.getDust(1),
                Materials.Vanadium.getDust(1),
                Materials.VanadiumMagnetite.getDust(1),
                Materials.Vermiculite.getDust(1),
                Materials.Wollastonite.getDust(1),
                Materials.YellowLimonite.getDust(1),
                Materials.Yttrium.getDust(1),
                Materials.Zeolite.getDust(1),
                Materials.Zinc.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),
                WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Dust Mode")
            .eut(0)
            .addTo(addFakeVoidDustRecipes_T0);

        // T0 - Nether - Ne
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ne", 1L))
            .itemOutputs(
                getModItem(GTPlusPlus.ID, "itemDustAgarditeCd", 1), // Agardite (Cd) Dust
                getModItem(GTPlusPlus.ID, "itemDustAgarditeLa", 1), // Agardite (La) Dust
                getModItem(GTPlusPlus.ID, "itemDustAgarditeNd", 1), // Agardite (Nd) Dust
                getModItem(GTPlusPlus.ID, "itemDustAlburnite", 1), // Alburnite Dust
                getModItem(GTPlusPlus.ID, "itemDustAncientGranite", 1), // Ancient Granite Dust
                getModItem(GTPlusPlus.ID, "itemDustBlackMetal", 1), // Black Metal Dust
                getModItem(GTPlusPlus.ID, "itemDustCrocoite", 1), // Crocoite Dust
                getModItem(GTPlusPlus.ID, "itemDustCryoliteF", 1), // Cryolite (F) Dust
                getModItem(GTPlusPlus.ID, "itemDustDemicheleiteBr", 1), // Demicheleite (Br) Dust
                getModItem(GTPlusPlus.ID, "itemDustFlorencite", 1), // Florencite Dust
                getModItem(GTPlusPlus.ID, "itemDustFluorcaphite", 1), // Fluorcaphite Dust
                getModItem(GTPlusPlus.ID, "itemDustGadoliniteY", 1), // Gadolinite (Y) Dust
                getModItem(GTPlusPlus.ID, "itemDustGreenockite", 1), // Greenockite Dust
                getModItem(GTPlusPlus.ID, "itemDustLanthaniteCe", 1), // Lanthanite (Ce) Dust
                getModItem(GTPlusPlus.ID, "itemDustLanthaniteNd", 1), // Lanthanite (Nd) Dust
                getModItem(GTPlusPlus.ID, "itemDustLautarite", 1), // Lautarite Dust
                getModItem(GTPlusPlus.ID, "itemDustLepersonnite", 1), // Lepersonnite Dust
                getModItem(GTPlusPlus.ID, "itemDustNichromite", 1), // Nichromite Dust
                getModItem(GTPlusPlus.ID, "itemDustRunite", 1), // Runite Dust
                getModItem(GTPlusPlus.ID, "itemDustSamarskiteY", 1), // Samarskite (Y) Dust
                getModItem(GTPlusPlus.ID, "itemDustYttriaite", 1), // Yttriaite Dust
                getModItem(GTPlusPlus.ID, "itemDustYttrialite", 1), // Yttrialite Dust
                getModItem(GTPlusPlus.ID, "itemDustZircon", 1), // Zircon Dust

                Materials.Alunite.getDust(1),
                Materials.Antimony.getDust(1),
                Materials.BandedIron.getDust(1),
                Materials.Barite.getDust(1),
                Materials.Beryllium.getDust(1),
                Materials.Bismuth.getDust(1),
                Materials.BrownLimonite.getDust(1),
                Materials.Cadmium.getDust(1),
                Materials.Calcite.getDust(1),
                Materials.Calcium.getDust(1),
                Materials.CertusQuartz.getDust(1),
                Materials.Chalcopyrite.getDust(1),
                Materials.Chrome.getDust(1),
                Materials.Cinnabar.getDust(1),
                Materials.Cobalt.getDust(1),
                Materials.Copper.getDust(1),
                Materials.Diamond.getDust(1),
                Materials.Diatomite.getDust(1),
                Materials.Electrotine.getDust(1),
                Materials.Electrum.getDust(1),
                Materials.Emerald.getDust(1),
                Materials.Galena.getDust(1),
                Materials.Gallium.getDust(1),
                Materials.GarnetRed.getDust(1),
                Materials.GarnetYellow.getDust(1),
                Materials.Glowstone.getDust(1),
                Materials.Gold.getDust(1),
                Materials.Grossular.getDust(1),
                Materials.Iron.getDust(1),
                Materials.Lead.getDust(1),
                Materials.Malachite.getDust(1),
                Materials.Manganese.getDust(1),
                Materials.Molybdenite.getDust(1),
                Materials.Molybdenum.getDust(1),
                Materials.NetherQuartz.getDust(1),
                Materials.Nickel.getDust(1),
                Materials.Niobium.getDust(1),
                Materials.Powellite.getDust(1),
                Materials.Pyrite.getDust(1),
                Materials.Pyrolusite.getDust(1),
                Materials.Quartzite.getDust(1),
                Materials.RareEarth.getDust(1),
                Materials.Realgar.getDust(1),
                Materials.Redstone.getDust(1),
                Materials.RoastedIron.getDust(1),
                Materials.Ruby.getDust(1),
                Materials.Saltpeter.getDust(1),
                Materials.Sapphire.getDust(1),
                Materials.Silver.getDust(1),
                Materials.Spessartine.getDust(1),
                Materials.Sphalerite.getDust(1),
                Materials.Stibnite.getDust(1),
                Materials.Sulfur.getDust(1),
                Materials.Tantalite.getDust(1),
                Materials.Tantalum.getDust(1),
                Materials.Tetrahedrite.getDust(1),
                Materials.Thorium.getDust(1),
                Materials.Tin.getDust(1),
                Materials.TricalciumPhosphate.getDust(1),
                Materials.Uranium.getDust(1),
                Materials.Wulfenite.getDust(1),
                Materials.YellowLimonite.getDust(1),
                Materials.Yttrium.getDust(1),
                Materials.Zinc.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Dust Mode")
            .eut(0)
            .addTo(addFakeVoidDustRecipes_T0);

        // T0 - Twilight - TF
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_TF", 1L))
            .itemOutputs(
                Materials.Almandine.getDust(1),
                Materials.Amber.getDust(1),
                Materials.Amethyst.getDust(1),
                Materials.Andradite.getDust(1),
                Materials.Apatite.getDust(1),
                Materials.Bentonite.getDust(1),
                Materials.Beryllium.getDust(1),
                Materials.BlueTopaz.getDust(1),
                Materials.Borax.getDust(1),
                Materials.BrownLimonite.getDust(1),
                Materials.Caesium.getDust(1),
                Materials.Calcite.getDust(1),
                Materials.Calcium.getDust(1),
                Materials.Carbon.getDust(1),
                Materials.Cassiterite.getDust(1),
                Materials.Chrome.getDust(1),
                Materials.Cinnabar.getDust(1),
                Materials.Coal.getDust(1),
                Materials.Cobalt.getDust(1),
                Materials.Cobaltite.getDust(1),
                Materials.Copper.getDust(1),
                Materials.Cryolite.getDust(1),
                Materials.Diamond.getDust(1),
                Materials.Emerald.getDust(1),
                Materials.Galena.getDust(1),
                Materials.GarnetRed.getDust(1),
                Materials.GarnetYellow.getDust(1),
                Materials.Glauconite.getDust(1),
                Materials.Glowstone.getDust(1),
                Materials.Gold.getDust(1),
                Materials.Graphite.getDust(1),
                Materials.GreenSapphire.getDust(1),
                Materials.Grossular.getDust(1),
                Materials.Iron.getDust(1),
                Materials.Jade.getDust(1),
                Materials.Jasper.getDust(1),
                Materials.Lapis.getDust(1),
                Materials.Lazurite.getDust(1),
                Materials.Lead.getDust(1),
                Materials.Lepidolite.getDust(1),
                Materials.Lignite.getDust(1),
                Materials.Lithium.getDust(1),
                Materials.Magnesite.getDust(1),
                Materials.Magnesium.getDust(1),
                Materials.Magnetite.getDust(1),
                Materials.Malachite.getDust(1),
                Materials.Molybdenite.getDust(1),
                Materials.Molybdenum.getDust(1),
                Materials.Nickel.getDust(1),
                Materials.Niobium.getDust(1),
                Materials.Olivine.getDust(1),
                Materials.Opal.getDust(1),
                Materials.Pentlandite.getDust(1),
                Materials.Phosphate.getDust(1),
                Materials.Powellite.getDust(1),
                Materials.Pyrite.getDust(1),
                Materials.Pyrochlore.getDust(1),
                Materials.Pyrope.getDust(1),
                Materials.Redstone.getDust(1),
                Materials.RoastedIron.getDust(1),
                Materials.RoastedNickel.getDust(1),
                Materials.RockSalt.getDust(1),
                Materials.Ruby.getDust(1),
                Materials.Salt.getDust(1),
                Materials.Saltpeter.getDust(1),
                Materials.Sapphire.getDust(1),
                Materials.Silver.getDust(1),
                Materials.Soapstone.getDust(1),
                Materials.Sodalite.getDust(1),
                Materials.Sodium.getDust(1),
                Materials.Spessartine.getDust(1),
                Materials.Spodumene.getDust(1),
                Materials.Sulfur.getDust(1),
                Materials.Talc.getDust(1),
                Materials.Tanzanite.getDust(1),
                Materials.Thorium.getDust(1),
                Materials.Tin.getDust(1),
                Materials.Topaz.getDust(1),
                Materials.TricalciumPhosphate.getDust(1),
                Materials.Uvarovite.getDust(1),
                Materials.Vanadium.getDust(1),
                Materials.VanadiumMagnetite.getDust(1),
                Materials.Wulfenite.getDust(1),
                Materials.YellowLimonite.getDust(1),
                Materials.Zinc.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),
                WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),

                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2540), // Aer Crystal Powder
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2541), // Ignis Crystal Powder
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2542), // Terra Crystal Powder
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2543), // Aqua Crystal Powder
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2544), // Perditio Crystal Powder
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2545) // Ordo Crystal Powder
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Dust Mode")
            .eut(0)
            .addTo(addFakeVoidDustRecipes_T0);

        // T0 - TheEnd - ED
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_ED", 1L))
            .itemOutputs(
                Materials.Antimony.getDust(1),
                Materials.Beryllium.getDust(1),
                Materials.Cadmium.getDust(1),
                Materials.Cassiterite.getDust(1),
                Materials.Chalcopyrite.getDust(1),
                Materials.Cobalt.getDust(1),
                Materials.Cobaltite.getDust(1),
                Materials.Copper.getDust(1),
                Materials.Emerald.getDust(1),
                Materials.Gallium.getDust(1),
                Materials.Gold.getDust(1),
                Materials.Iron.getDust(1),
                Materials.Lead.getDust(1),
                Materials.Magnesite.getDust(1),
                Materials.Molybdenite.getDust(1),
                Materials.Molybdenum.getDust(1),
                Materials.Nickel.getDust(1),
                Materials.Pentlandite.getDust(1),
                Materials.Powellite.getDust(1),
                Materials.Pyrite.getDust(1),
                Materials.RoastedNickel.getDust(1),
                Materials.Silver.getDust(1),
                Materials.Stibnite.getDust(1),
                Materials.Sulfur.getDust(1),
                Materials.Tetrahedrite.getDust(1),
                Materials.Thorium.getDust(1),
                Materials.Tin.getDust(1),
                Materials.TricalciumPhosphate.getDust(1),
                Materials.Uranium.getDust(1),
                Materials.Vanadium.getDust(1),
                Materials.VanadiumMagnetite.getDust(1),
                Materials.Wulfenite.getDust(1),
                Materials.Zinc.getDust(1),

                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),
                WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Dust Mode")
            .eut(0)
            .addTo(addFakeVoidDustRecipes_T0);

        // T0 - EndAsteroid - EA
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_EA", 1L))
            .itemOutputs(
                Materials.Andradite.getDust(1),
                Materials.Antimony.getDust(1),
                Materials.Beryllium.getDust(1),
                Materials.Bentonite.getDust(1),
                Materials.Cadmium.getDust(1),
                Materials.Calcite.getDust(1),
                Materials.Calcium.getDust(1),
                Materials.Cassiterite.getDust(1),
                Materials.Chalcopyrite.getDust(1),
                Materials.Cobalt.getDust(1),
                Materials.Cobaltite.getDust(1),
                Materials.Copper.getDust(1),
                Materials.Emerald.getDust(1),
                Materials.Gallium.getDust(1),
                Materials.GarnetRed.getDust(1),
                Materials.GarnetYellow.getDust(1),
                Materials.Glauconite.getDust(1),
                Materials.Gold.getDust(1),
                Materials.Grossular.getDust(1),
                Materials.Iron.getDust(1),
                Materials.Lapis.getDust(1),
                Materials.Lazurite.getDust(1),
                Materials.Lead.getDust(1),
                Materials.Lithium.getDust(1),
                Materials.Magnesium.getDust(1),
                Materials.Magnetite.getDust(1),
                Materials.Malachite.getDust(1),
                Materials.Manganese.getDust(1),
                Materials.Magnesite.getDust(1),
                Materials.Molybdenite.getDust(1),
                Materials.Molybdenum.getDust(1),
                Materials.Nickel.getDust(1),
                Materials.Niobium.getDust(1),
                Materials.Olivine.getDust(1),
                Materials.Pentlandite.getDust(1),
                Materials.Powellite.getDust(1),
                Materials.Pyrite.getDust(1),
                Materials.Pyrolusite.getDust(1),
                Materials.Pyrope.getDust(1),
                Materials.RoastedNickel.getDust(1),
                Materials.Scheelite.getDust(1),
                Materials.Silver.getDust(1),
                Materials.Sodalite.getDust(1),
                Materials.Sodium.getDust(1),
                Materials.Spessartine.getDust(1),
                Materials.Stibnite.getDust(1),
                Materials.Sulfur.getDust(1),
                Materials.Tantalite.getDust(1),
                Materials.Tantalum.getDust(1),
                Materials.Tetrahedrite.getDust(1),
                Materials.Thorium.getDust(1),
                Materials.Tin.getDust(1),
                Materials.TricalciumPhosphate.getDust(1),
                Materials.Tungstate.getDust(1),
                Materials.Uranium.getDust(1),
                Materials.Vanadium.getDust(1),
                Materials.VanadiumMagnetite.getDust(1),
                Materials.Wulfenite.getDust(1),
                Materials.Zinc.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),
                WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.IrOsLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PDMetallicPowder.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),
                WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),

                getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10054), // Naquadah Oxide Mixture Dust
                getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10067), // Enriched-Naquadah Oxide Mixture Dust
                getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10072), // Naquadria Oxide Mixture Dust

                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2828) // Sheldonite Dust

            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Dust Mode")
            .eut(0)
            .addTo(addFakeVoidDustRecipes_T0);
    }
}
