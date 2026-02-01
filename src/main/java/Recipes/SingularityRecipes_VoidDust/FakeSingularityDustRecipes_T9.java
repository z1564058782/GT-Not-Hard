package Recipes.SingularityRecipes_VoidDust;

import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.NEIOrePlugin;
import static gregtech.api.enums.Mods.NewHorizonsCoreMod;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import bartworks.system.material.WerkstoffLoader;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import gtnhlanth.common.register.WerkstoffMaterialPool;
import util.OneToManyItemsFrontend;

public class FakeSingularityDustRecipes_T9 {

    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T9 = RecipeMapBuilder
        .of("Singularity of T9 Dust")
        .maxIO(1, 135, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend::new)
        .build();

    public static void addFakeVoidDustRecipes_T9() {
        // T9 - Anubis - An
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_An", 1L))
            .itemOutputs(
                Materials.Adamantium.getDust(1),
                Materials.Alduorite.getDust(1),
                Materials.Almandine.getDust(1),
                Materials.Andradite.getDust(1),
                Materials.Basalt.getDust(1),
                Materials.Bauxite.getDust(1),
                Materials.Bedrockium.getDust(1),
                Materials.Bentonite.getDust(1),
                Materials.BlueTopaz.getDust(1),
                Materials.Cadmium.getDust(1),
                Materials.Caesium.getDust(1),
                Materials.Calcium.getDust(1),
                Materials.CallistoIce.getDust(1),
                Materials.Cassiterite.getDust(1),
                Materials.Ceruclase.getDust(1),
                Materials.Cobalt.getDust(1),
                Materials.Cryolite.getDust(1),
                Materials.Desh.getDust(1),
                Materials.Dolomite.getDust(1),
                Materials.FullersEarth.getDust(1),
                Materials.Galena.getDust(1),
                Materials.Gallium.getDust(1),
                Materials.GarnetYellow.getDust(1),
                Materials.Glauconite.getDust(1),
                Materials.GraniteBlack.getDust(1),
                Materials.Grossular.getDust(1),
                Materials.Gypsum.getDust(1),
                Materials.InfinityCatalyst.getDust(1),
                Materials.Iron.getDust(1),
                Materials.Jasper.getDust(1),
                Materials.Kyanite.getDust(1),
                Materials.Lead.getDust(1),
                Materials.Lithium.getDust(1),
                Materials.Magnesium.getDust(1),
                Materials.Magnetite.getDust(1),
                Materials.Manganese.getDust(1),
                Materials.MeteoricIron.getDust(1),
                Materials.Mica.getDust(1),
                Materials.Molybdenum.getDust(1),
                Materials.Mytryl.getDust(1),
                Materials.Neutronium.getDust(1),
                Materials.Nickel.getDust(1),
                Materials.Olivine.getDust(1),
                Materials.Pentlandite.getDust(1),
                Materials.Pollucite.getDust(1),
                Materials.Pyrite.getDust(1),
                Materials.Pyrope.getDust(1),
                Materials.Rubidium.getDust(1),
                Materials.Rutile.getDust(1),
                Materials.Scheelite.getDust(1),
                Materials.SiliconDioxide.getDust(1),
                Materials.Silver.getDust(1),
                Materials.Soapstone.getDust(1),
                Materials.Sodium.getDust(1),
                Materials.Sphalerite.getDust(1),
                Materials.Sulfur.getDust(1),
                Materials.Talc.getDust(1),
                Materials.Tin.getDust(1),
                Materials.Titanium.getDust(1),
                Materials.Topaz.getDust(1),
                Materials.TricalciumPhosphate.getDust(1),
                Materials.Trona.getDust(1),
                Materials.Tungstate.getDust(1),
                Materials.Vulcanite.getDust(1),
                Materials.Wollastonite.getDust(1),
                Materials.Zinc.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),
                WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),

                WerkstoffMaterialPool.SamariumOreConcentrate.get(OrePrefixes.dust, 1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Dust Mode")
            .eut(0)
            .addTo(addFakeVoidDustRecipes_T9);

        // T9 - Horus - Ho
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Ho", 1L))
            .itemOutputs(
                Materials.Almandine.getDust(1),
                Materials.Amethyst.getDust(1),
                Materials.Andradite.getDust(1),
                Materials.Ardite.getDust(1),
                Materials.Asbestos.getDust(1),
                Materials.Barite.getDust(1),
                Materials.Bedrockium.getDust(1),
                Materials.Beryllium.getDust(1),
                Materials.BlackPlutonium.getDust(1),
                Materials.BlueTopaz.getDust(1),
                Materials.Borax.getDust(1),
                Materials.CertusQuartz.getDust(1),
                Materials.Ceruclase.getDust(1),
                Materials.Chrome.getDust(1),
                Materials.Chrysotile.getDust(1),
                Materials.CosmicNeutronium.getDust(1),
                Materials.Diamond.getDust(1),
                Materials.Draconium.getDust(1),
                Materials.Electrotine.getDust(1),
                Materials.Electrum.getDust(1),
                Materials.Emerald.getDust(1),
                Materials.GarnetRed.getDust(1),
                Materials.GarnetSand.getDust(1),
                Materials.GarnetYellow.getDust(1),
                Materials.GreenSapphire.getDust(1),
                Materials.Grossular.getDust(1),
                Materials.Jade.getDust(1),
                Materials.Jasper.getDust(1),
                Materials.Ledox.getDust(1),
                Materials.Magnesite.getDust(1),
                Materials.Magnesium.getDust(1),
                Materials.Mirabilite.getDust(1),
                Materials.Mytryl.getDust(1),
                Materials.NetherStar.getDust(1),
                Materials.Neutronium.getDust(1),
                Materials.Olivine.getDust(1),
                Materials.Opal.getDust(1),
                Materials.Orichalcum.getDust(1),
                Materials.Oriharukon.getDust(1),
                Materials.Pyrope.getDust(1),
                Materials.Quantium.getDust(1),
                Materials.Quartzite.getDust(1),
                Materials.QuartzSand.getDust(1),
                Materials.Realgar.getDust(1),
                Materials.Redstone.getDust(1),
                Materials.RoastedIron.getDust(1),
                Materials.Rubracium.getDust(1),
                Materials.Ruby.getDust(1),
                Materials.Rutile.getDust(1),
                Materials.Sapphire.getDust(1),
                Materials.SiliconDioxide.getDust(1),
                Materials.Spessartine.getDust(1),
                Materials.Sulfur.getDust(1),
                Materials.Tanzanite.getDust(1),
                Materials.Topaz.getDust(1),
                Materials.Uvarovite.getDust(1),
                Materials.Vinteum.getDust(1),
                Materials.Vulcanite.getDust(1),
                Materials.Vyroxeres.getDust(1),
                Materials.Zinc.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                WerkstoffMaterialPool.SamariumOreConcentrate.get(OrePrefixes.dust, 1),

                getModItem(NewHorizonsCoreMod.ID, "item.ChargedCertusQuartzDust", 1L) // Charged Certus Quartz Dust
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Dust Mode")
            .eut(0)
            .addTo(addFakeVoidDustRecipes_T9);

        // T9 - Maahes - Mh
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Mh", 1L))
            .itemOutputs(
                Materials.Adamantium.getDust(1),
                Materials.Alduorite.getDust(1),
                Materials.Almandine.getDust(1),
                Materials.Amethyst.getDust(1),
                Materials.Ardite.getDust(1),
                Materials.Basalt.getDust(1),
                Materials.BlueTopaz.getDust(1),
                Materials.CallistoIce.getDust(1),
                Materials.Chrome.getDust(1),
                Materials.Cobalt.getDust(1),
                Materials.Copper.getDust(1),
                Materials.Cryolite.getDust(1),
                Materials.FullersEarth.getDust(1),
                Materials.Galena.getDust(1),
                Materials.Glauconite.getDust(1),
                Materials.Gold.getDust(1),
                Materials.GraniteBlack.getDust(1),
                Materials.Gypsum.getDust(1),
                Materials.Iron.getDust(1),
                Materials.Lead.getDust(1),
                Materials.Lithium.getDust(1),
                Materials.Magnesium.getDust(1),
                Materials.Magnetite.getDust(1),
                Materials.Manganese.getDust(1),
                Materials.Molybdenum.getDust(1),
                Materials.Neutronium.getDust(1),
                Materials.Nickel.getDust(1),
                Materials.Pentlandite.getDust(1),
                Materials.Quantium.getDust(1),
                Materials.Rutile.getDust(1),
                Materials.SiliconDioxide.getDust(1),
                Materials.Silver.getDust(1),
                Materials.Soapstone.getDust(1),
                Materials.Sodium.getDust(1),
                Materials.Sulfur.getDust(1),
                Materials.Talc.getDust(1),
                Materials.Titanium.getDust(1),
                Materials.Topaz.getDust(1),
                Materials.Trinium.getDust(1),
                Materials.Tungstate.getDust(1),
                Materials.Vanadium.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),
                WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.IrOsLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PDMetallicPowder.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),

                getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10054), // Naquadah Oxide Mixture Dust
                getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10067), // Enriched-Naquadah Oxide Mixture Dust
                getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10072), // Naquadria Oxide Mixture Dust

                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2828) // Sheldonite Dust
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Dust Mode")
            .eut(0)
            .addTo(addFakeVoidDustRecipes_T9);

        // T9 - MehenBelt - MB
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_MB", 1L))
            .itemOutputs(
                Materials.Adamantium.getDust(1),
                Materials.Almandine.getDust(1),
                Materials.Andradite.getDust(1),
                Materials.Bentonite.getDust(1),
                Materials.Calcite.getDust(1),
                Materials.Calcium.getDust(1),
                Materials.Cassiterite.getDust(1),
                Materials.Chrome.getDust(1),
                Materials.Chromite.getDust(1),
                Materials.Cobalt.getDust(1),
                Materials.Cobaltite.getDust(1),
                Materials.Draconium.getDust(1),
                Materials.DraconiumAwakened.getDust(1),
                Materials.GarnetYellow.getDust(1),
                Materials.Glauconite.getDust(1),
                Materials.Ilmenite.getDust(1),
                Materials.Iron.getDust(1),
                Materials.Lapis.getDust(1),
                Materials.Lazurite.getDust(1),
                Materials.Lead.getDust(1),
                Materials.Magnesium.getDust(1),
                Materials.Magnetite.getDust(1),
                Materials.Malachite.getDust(1),
                Materials.Mithril.getDust(1),
                Materials.NetherStar.getDust(1),
                Materials.Neutronium.getDust(1),
                Materials.Nickel.getDust(1),
                Materials.Olivine.getDust(1),
                Materials.Pentlandite.getDust(1),
                Materials.Perlite.getDust(1),
                Materials.Pyrite.getDust(1),
                Materials.Pyrope.getDust(1),
                Materials.RoastedNickel.getDust(1),
                Materials.Rutile.getDust(1),
                Materials.Sodalite.getDust(1),
                Materials.Sodium.getDust(1),
                Materials.Sulfur.getDust(1),
                Materials.Thorium.getDust(1),
                Materials.Tin.getDust(1),
                Materials.Titanium.getDust(1),
                Materials.Uraninite.getDust(1),
                Materials.Uranium.getDust(1),
                Materials.Uranium235.getDust(1),
                Materials.Uvarovite.getDust(1),
                Materials.WroughtIron.getDust(1),
                Materials.Zinc.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),
                WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.IrOsLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PDMetallicPowder.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),
                WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),

                WerkstoffMaterialPool.Hafnium.get(OrePrefixes.dust, 1),

                getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10054), // Naquadah Oxide Mixture Dust
                getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10067), // Enriched-Naquadah Oxide Mixture Dust

                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2828), // Sheldonite Dust

                getModItem(GTPlusPlus.ID, "dustRadium226", 1L) // Radium 226 Dust
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Dust Mode")
            .eut(0)
            .addTo(addFakeVoidDustRecipes_T9);

        // T9 - Neper - Np
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Np", 1L))
            .itemOutputs(
                Materials.Amber.getDust(1),
                Materials.Andradite.getDust(1),
                Materials.Antimony.getDust(1),
                Materials.Arsenic.getDust(1),
                Materials.Barite.getDust(1),
                Materials.Bismuth.getDust(1),
                Materials.Caesium.getDust(1),
                Materials.Cassiterite.getDust(1),
                Materials.CertusQuartz.getDust(1),
                Materials.Cinnabar.getDust(1),
                Materials.DeepIron.getDust(1),
                Materials.Dilithium.getDust(1),
                Materials.Dolomite.getDust(1),
                Materials.FullersEarth.getDust(1),
                Materials.GarnetYellow.getDust(1),
                Materials.GlauconiteSand.getDust(1),
                Materials.Glowstone.getDust(1),
                Materials.Iron.getDust(1),
                Materials.Kaolinite.getDust(1),
                Materials.Kyanite.getDust(1),
                Materials.Magnesium.getDust(1),
                Materials.Manganese.getDust(1),
                Materials.Mica.getDust(1),
                Materials.Molybdenum.getDust(1),
                Materials.MysteriousCrystal.getDust(1),
                Materials.NetherQuartz.getDust(1),
                Materials.Pollucite.getDust(1),
                Materials.Quartzite.getDust(1),
                Materials.QuartzSand.getDust(1),
                Materials.Redstone.getDust(1),
                Materials.Rubidium.getDust(1),
                Materials.ShadowIron.getDust(1),
                Materials.Silicon.getDust(1),
                Materials.SiliconDioxide.getDust(1),
                Materials.Sodium.getDust(1),
                Materials.Sulfur.getDust(1),
                Materials.Tin.getDust(1),
                Materials.Trinium.getDust(1),
                Materials.Trona.getDust(1),
                Materials.Tungsten.getDust(1),
                Materials.Vinteum.getDust(1),
                Materials.Wollastonite.getDust(1),
                Materials.Zeolite.getDust(1),
                Materials.Zinc.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),
                WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),

                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2540), // Aer Crystal Powder
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2541), // Ignis Crystal Powder
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2542), // Terra Crystal Powder
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2543), // Aqua Crystal Powder
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2544), // Perditio Crystal Powder
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2545), // Ordo Crystal Powder

                getModItem(NewHorizonsCoreMod.ID, "item.ChargedCertusQuartzDust", 1L) // Charged Certus Quartz Dust
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Dust Mode")
            .eut(0)
            .addTo(addFakeVoidDustRecipes_T9);

        // T9 - Seth - Se
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_Se", 1L))
            .itemOutputs(
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2828), // Sheldonite Dust

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

                Materials.Aluminium.getDust(1),
                Materials.Bastnasite.getDust(1),
                Materials.Bauxite.getDust(1),
                Materials.Cassiterite.getDust(1),
                Materials.Chalcopyrite.getDust(1),
                Materials.Chrome.getDust(1),
                Materials.Cobalt.getDust(1),
                Materials.Copper.getDust(1),
                Materials.Diamond.getDust(1),
                Materials.Draconium.getDust(1),
                Materials.DraconiumAwakened.getDust(1),
                Materials.Electrotine.getDust(1),
                Materials.Electrum.getDust(1),
                Materials.Galena.getDust(1),
                Materials.Gallium.getDust(1),
                Materials.Gold.getDust(1),
                Materials.Grossular.getDust(1),
                Materials.Ilmenite.getDust(1),
                Materials.Iron.getDust(1),
                Materials.Jade.getDust(1),
                Materials.Magnesite.getDust(1),
                Materials.Magnesium.getDust(1),
                Materials.Magnetite.getDust(1),
                Materials.Mithril.getDust(1),
                Materials.Monazite.getDust(1),
                Materials.Neodymium.getDust(1),
                Materials.NeodymiumMagnetic.getDust(1),
                Materials.NetherQuartz.getDust(1),
                Materials.Nickel.getDust(1),
                Materials.RareEarth.getDust(1),
                Materials.Redstone.getDust(1),
                Materials.Rutile.getDust(1),
                Materials.SamariumMagnetic.getDust(1),
                Materials.Tartarite.getDust(1),
                Materials.TengamRaw.getDust(1),
                Materials.Thorium.getDust(1),
                Materials.Tin.getDust(1),
                Materials.Vanadium.getDust(1),
                Materials.VanadiumMagnetite.getDust(1),
                Materials.Vinteum.getDust(1),
                Materials.WroughtIron.getDust(1),
                Materials.Yttrium.getDust(1),
                Materials.Zinc.getDust(1),

                WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.IrOsLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PDMetallicPowder.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),
                WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),

                WerkstoffMaterialPool.Hafnium.get(OrePrefixes.dust, 1),
                WerkstoffMaterialPool.SamariumOreConcentrate.get(OrePrefixes.dust, 1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Dust Mode")
            .eut(0)
            .addTo(addFakeVoidDustRecipes_T9);
    }
}
