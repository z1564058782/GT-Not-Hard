package Recipes.SingularityRecipes_VoidDust;

import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

import bartworks.system.material.WerkstoffLoader;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;

public class SingularityDustRecipes_T0 {

    public static final Map<String, ItemStack[]> VoidDustRecipes_T0 = new HashMap<>();

    public static void addVoidDustRecipes_T0() {
        // T0 - Overworld - Ow
        VoidDustRecipes_T0.put(
            "Ow",
            new ItemStack[] {
                // Diamond Vein
                Materials.Carbon.getDust(1), Materials.Coal.getDust(1), Materials.Diamond.getDust(1),
                Materials.Graphite.getDust(1), Materials.Lignite.getDust(1), Materials.Thorium.getDust(1),

                // Lapis Vein
                Materials.Andradite.getDust(1), Materials.Calcite.getDust(1), Materials.Lapis.getDust(1),
                Materials.Lazurite.getDust(1), Materials.Malachite.getDust(1), Materials.Pyrite.getDust(1),
                Materials.Sodalite.getDust(1),

                // Vermiculite Vein
                Materials.Alunite.getDust(1), Materials.Cadmium.getDust(1), Materials.Cassiterite.getDust(1),
                Materials.Chalcopyrite.getDust(1), Materials.Cobalt.getDust(1), Materials.Iron.getDust(1),
                Materials.Magnesium.getDust(1), Materials.Pyrite.getDust(1), Materials.Tin.getDust(1),
                Materials.Vermiculite.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1), WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),

                // Oilsands Vein

                // Coal VeinVein
                Materials.Carbon.getDust(1), Materials.Coal.getDust(1), Materials.Lignite.getDust(1),
                Materials.Thorium.getDust(1),

                // Manganese Vein
                Materials.Calcium.getDust(1), Materials.GarnetRed.getDust(1), Materials.GarnetYellow.getDust(1),
                Materials.Grossular.getDust(1), Materials.Manganese.getDust(1), Materials.Niobium.getDust(1),
                Materials.Spessartine.getDust(1), Materials.Tantalite.getDust(1), Materials.Tantalum.getDust(1),

                // Redstone Vein
                Materials.Chrome.getDust(1), Materials.Cinnabar.getDust(1), Materials.GarnetRed.getDust(1),
                Materials.Glowstone.getDust(1), Materials.RareEarth.getDust(1), Materials.Redstone.getDust(1),
                Materials.Ruby.getDust(1), Materials.Sulfur.getDust(1), Materials.Chalcopyrite.getDust(1),
                Materials.Galena.getDust(1), Materials.NetherQuartz.getDust(1), Materials.Yttrium.getDust(1),
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

                // Mica Vein
                Materials.Caesium.getDust(1), Materials.Cassiterite.getDust(1), Materials.Kyanite.getDust(1),
                Materials.Mica.getDust(1), Materials.Pollucite.getDust(1), Materials.Rubidium.getDust(1),
                Materials.Tin.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1), WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),

                // Dolomite Vein
                Materials.Andradite.getDust(1), Materials.Dolomite.getDust(1), Materials.GarnetYellow.getDust(1),
                Materials.Iron.getDust(1), Materials.Trona.getDust(1), Materials.Wollastonite.getDust(1),

                // Copper Vein
                Materials.Cadmium.getDust(1), Materials.Chalcopyrite.getDust(1), Materials.Cobalt.getDust(1),
                Materials.Copper.getDust(1), Materials.Gold.getDust(1), Materials.Iron.getDust(1),
                Materials.Nickel.getDust(1), Materials.Pyrite.getDust(1), Materials.Sulfur.getDust(1),
                Materials.Tin.getDust(1), Materials.TricalciumPhosphate.getDust(1),

                // Soapstone Vein
                Materials.Cobalt.getDust(1), Materials.Glauconite.getDust(1), Materials.Iron.getDust(1),
                Materials.Nickel.getDust(1), Materials.Pentlandite.getDust(1), Materials.Soapstone.getDust(1),
                Materials.Sodium.getDust(1), Materials.Talc.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Gold Vein
                Materials.Copper.getDust(1), Materials.Gold.getDust(1), Materials.Iron.getDust(1),
                Materials.Magnesite.getDust(1), Materials.Nickel.getDust(1), Materials.Vanadium.getDust(1),
                Materials.VanadiumMagnetite.getDust(1),

                // Kaolinite Vein
                Materials.FullersEarth.getDust(1), Materials.GlauconiteSand.getDust(1), Materials.Iron.getDust(1),
                Materials.Kaolinite.getDust(1), Materials.Magnesium.getDust(1), Materials.Sodium.getDust(1),
                Materials.Zeolite.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Iron Vein
                Materials.BrownLimonite.getDust(1), Materials.Calcite.getDust(1), Materials.Cobalt.getDust(1),
                Materials.Copper.getDust(1), Materials.Malachite.getDust(1), Materials.Nickel.getDust(1),
                Materials.RoastedIron.getDust(1), Materials.YellowLimonite.getDust(1),

                // Lignite Coal Vein
                Materials.Coal.getDust(1), Materials.Lignite.getDust(1), Materials.Thorium.getDust(1),

                // Apatite Vein
                Materials.Apatite.getDust(1), Materials.Calcite.getDust(1), Materials.Niobium.getDust(1),
                Materials.Phosphate.getDust(1), Materials.Pyrochlore.getDust(1),
                Materials.TricalciumPhosphate.getDust(1),

                // Basaltic Mineral Sand Vein
                Materials.Basalt.getDust(1), Materials.FullersEarth.getDust(1), Materials.GraniteBlack.getDust(1),
                Materials.Gypsum.getDust(1), Materials.Magnesium.getDust(1), Materials.Magnetite.getDust(1),
                Materials.SiliconDioxide.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Magnetite Vein
                Materials.Gold.getDust(1), Materials.Iron.getDust(1), Materials.Magnetite.getDust(1),
                Materials.Nickel.getDust(1), Materials.Tin.getDust(1), Materials.Vanadium.getDust(1),
                Materials.VanadiumMagnetite.getDust(1),

                // Tin Vein
                Materials.Asbestos.getDust(1), Materials.BandedIron.getDust(1), Materials.CassiteriteSand.getDust(1),
                Materials.Diatomite.getDust(1), Materials.GarnetRed.getDust(1), Materials.GarnetSand.getDust(1),
                Materials.GarnetYellow.getDust(1), Materials.Magnesium.getDust(1), Materials.Sapphire.getDust(1),
                Materials.SiliconDioxide.getDust(1), Materials.Tin.getDust(1),

                // Salt Vein
                Materials.Borax.getDust(1), Materials.Caesium.getDust(1), Materials.Lepidolite.getDust(1),
                Materials.Lithium.getDust(1), Materials.RockSalt.getDust(1), Materials.Salt.getDust(1),
                Materials.Spodumene.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Cassiterite Vein
                Materials.Cassiterite.getDust(1), Materials.Iron.getDust(1), Materials.Tin.getDust(1),
                Materials.Zinc.getDust(1),

                WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),

                // Small Ore Stats
                // Iron Ore
                Materials.Iron.getDust(1), Materials.Nickel.getDust(1), Materials.Tin.getDust(1),

                // Copper Ore
                Materials.Cobalt.getDust(1), Materials.Copper.getDust(1), Materials.Gold.getDust(1),
                Materials.Nickel.getDust(1),

                // Silver Ore
                Materials.Lead.getDust(1), Materials.Silver.getDust(1), Materials.Sulfur.getDust(1),

                // Tin Ore
                Materials.Iron.getDust(1), Materials.Tin.getDust(1), Materials.Zinc.getDust(1),

                WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),

                // Redstone Ore
                Materials.Cinnabar.getDust(1), Materials.Glowstone.getDust(1), Materials.RareEarth.getDust(1),
                Materials.Redstone.getDust(1), Materials.Chalcopyrite.getDust(1), Materials.Galena.getDust(1),
                Materials.NetherQuartz.getDust(1), Materials.Yttrium.getDust(1),
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

                // Gold Ore
                Materials.Copper.getDust(1), Materials.Gold.getDust(1), Materials.Nickel.getDust(1),

                // Diamond Ore
                Materials.Diamond.getDust(1), Materials.Graphite.getDust(1),

                // Lapis Ore
                Materials.Lapis.getDust(1), Materials.Lazurite.getDust(1), Materials.Pyrite.getDust(1),
                Materials.Sodalite.getDust(1),

                // Coal Ore
                Materials.Coal.getDust(1), Materials.Lignite.getDust(1), Materials.Thorium.getDust(1),

                // Zinc Ore
                Materials.Gallium.getDust(1), Materials.Tin.getDust(1), Materials.Zinc.getDust(1),

                // Nickel Ore
                Materials.Cobalt.getDust(1), Materials.Nickel.getDust(1), Materials.Iron.getDust(1),

                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1) });

        // T0 - Nether - Ne
        VoidDustRecipes_T0.put(
            "Ne",
            new ItemStack[] {
                // Sulfur Vein
                Materials.Cadmium.getDust(1), Materials.Gallium.getDust(1), Materials.GarnetYellow.getDust(1),
                Materials.Iron.getDust(1), Materials.Pyrite.getDust(1), Materials.Sphalerite.getDust(1),
                Materials.Sulfur.getDust(1), Materials.TricalciumPhosphate.getDust(1),

                // Molybdenum Vein
                Materials.Molybdenite.getDust(1), Materials.Molybdenum.getDust(1), Materials.Powellite.getDust(1),
                Materials.Wulfenite.getDust(1),

                // Manganese Vein
                Materials.Calcium.getDust(1), Materials.GarnetRed.getDust(1), Materials.GarnetYellow.getDust(1),
                Materials.Grossular.getDust(1), Materials.Manganese.getDust(1), Materials.Niobium.getDust(1),
                Materials.Pyrolusite.getDust(1), Materials.Spessartine.getDust(1), Materials.Tantalite.getDust(1),
                Materials.Tantalum.getDust(1),

                // Quartzite Vein
                Materials.Barite.getDust(1), Materials.CertusQuartz.getDust(1), Materials.Quartzite.getDust(1),

                // Redstone Vein
                Materials.Chrome.getDust(1), Materials.Cinnabar.getDust(1), Materials.GarnetRed.getDust(1),
                Materials.Glowstone.getDust(1), Materials.RareEarth.getDust(1), Materials.Redstone.getDust(1),
                Materials.Ruby.getDust(1), Materials.Sulfur.getDust(1), Materials.Chalcopyrite.getDust(1),
                Materials.Galena.getDust(1), Materials.NetherQuartz.getDust(1), Materials.Yttrium.getDust(1),
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

                // Copper Vein
                Materials.Cadmium.getDust(1), Materials.Chalcopyrite.getDust(1), Materials.Cobalt.getDust(1),
                Materials.Copper.getDust(1), Materials.Gold.getDust(1), Materials.Iron.getDust(1),
                Materials.Nickel.getDust(1), Materials.Pyrite.getDust(1), Materials.Sulfur.getDust(1),
                Materials.Tin.getDust(1), Materials.TricalciumPhosphate.getDust(1),

                // Iron Vein
                Materials.BrownLimonite.getDust(1), Materials.Calcite.getDust(1), Materials.Cobalt.getDust(1),
                Materials.Copper.getDust(1), Materials.Malachite.getDust(1), Materials.Nickel.getDust(1),
                Materials.RoastedIron.getDust(1), Materials.YellowLimonite.getDust(1),

                // Beryllium Vein
                Materials.Beryllium.getDust(1), Materials.Emerald.getDust(1), Materials.Lead.getDust(1),
                Materials.Thorium.getDust(1), Materials.Uranium.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Electrotine Vein
                Materials.Alunite.getDust(1), Materials.BandedIron.getDust(1), Materials.Diamond.getDust(1),
                Materials.Diatomite.getDust(1), Materials.Electrotine.getDust(1), Materials.Electrum.getDust(1),
                Materials.Redstone.getDust(1), Materials.Saltpeter.getDust(1), Materials.Sapphire.getDust(1),

                // Tetrahedrite Vein
                Materials.Antimony.getDust(1), Materials.Cobalt.getDust(1), Materials.Copper.getDust(1),
                Materials.Gold.getDust(1), Materials.Nickel.getDust(1), Materials.Stibnite.getDust(1),
                Materials.Tetrahedrite.getDust(1), Materials.Zinc.getDust(1),

                // Nether Quartz Vein
                Materials.Barite.getDust(1), Materials.CertusQuartz.getDust(1), Materials.NetherQuartz.getDust(1),
                Materials.Quartzite.getDust(1),

                // Small Ore Stats
                // Saltpeter Ore
                Materials.Saltpeter.getDust(1),

                // Iron Ore
                Materials.Iron.getDust(1), Materials.Nickel.getDust(1), Materials.Tin.getDust(1),

                // Copper Ore
                Materials.Copper.getDust(1), Materials.Cobalt.getDust(1), Materials.Nickel.getDust(1),
                Materials.Gold.getDust(1),

                // Silver Ore
                Materials.Lead.getDust(1), Materials.Silver.getDust(1), Materials.Sulfur.getDust(1),

                // Tin Ore
                Materials.Iron.getDust(1), Materials.Tin.getDust(1), Materials.Zinc.getDust(1),

                // Lead Ore
                Materials.Lead.getDust(1), Materials.Silver.getDust(1), Materials.Sulfur.getDust(1),

                // Redstone Ore
                Materials.Cinnabar.getDust(1), Materials.Glowstone.getDust(1), Materials.RareEarth.getDust(1),
                Materials.Redstone.getDust(1), Materials.Chalcopyrite.getDust(1), Materials.Galena.getDust(1),
                Materials.NetherQuartz.getDust(1), Materials.Yttrium.getDust(1),
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

                // Certus Quartz Ore
                Materials.Barite.getDust(1), Materials.CertusQuartz.getDust(1), Materials.Quartzite.getDust(1),

                // Sulfur Ore
                Materials.Sulfur.getDust(1),

                // Nether Quartz Ore
                Materials.NetherQuartz.getDust(1),

                // Bismuth Ore
                Materials.Bismuth.getDust(1),

                // Zinc Ore
                Materials.Gallium.getDust(1), Materials.Tin.getDust(1), Materials.Zinc.getDust(1),

                // Realgar Ore
                Materials.Realgar.getDust(1) });

        // T0 - Twilight - TF
        VoidDustRecipes_T0.put(
            "TF",
            new ItemStack[] {
                // Diamond Vein
                Materials.Carbon.getDust(1), Materials.Coal.getDust(1), Materials.Diamond.getDust(1),
                Materials.Graphite.getDust(1), Materials.Lignite.getDust(1), Materials.Thorium.getDust(1),

                // Lapis Vein
                Materials.Andradite.getDust(1), Materials.Calcite.getDust(1), Materials.Lapis.getDust(1),
                Materials.Lazurite.getDust(1), Materials.Malachite.getDust(1), Materials.Pyrite.getDust(1),
                Materials.Sodalite.getDust(1),

                // Molybdenum Vein
                Materials.Molybdenite.getDust(1), Materials.Molybdenum.getDust(1), Materials.Powellite.getDust(1),
                Materials.Wulfenite.getDust(1),

                // Olivine Vein
                Materials.Bentonite.getDust(1), Materials.Calcium.getDust(1), Materials.Glauconite.getDust(1),
                Materials.Iron.getDust(1), Materials.Magnesium.getDust(1), Materials.Magnetite.getDust(1),
                Materials.Olivine.getDust(1), Materials.Pyrope.getDust(1), Materials.Sodium.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Terra & Aer Vein
                Materials.Amber.getDust(1), Materials.Cinnabar.getDust(1), Materials.Glowstone.getDust(1),
                Materials.Redstone.getDust(1), Materials.Sulfur.getDust(1),

                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2540), // Aer Crystal Powder
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2542), // Terra Crystal Powder

                // Coal Vein
                Materials.Carbon.getDust(1), Materials.Coal.getDust(1), Materials.Lignite.getDust(1),
                Materials.Thorium.getDust(1),

                // Sapphire Vein
                Materials.Almandine.getDust(1), Materials.GarnetRed.getDust(1), Materials.GreenSapphire.getDust(1),
                Materials.Magnesium.getDust(1), Materials.Pyrope.getDust(1), Materials.Sapphire.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Cryolite Vein
                Materials.Cryolite.getDust(1), Materials.Galena.getDust(1), Materials.Lead.getDust(1),
                Materials.Silver.getDust(1), Materials.Sodium.getDust(1), Materials.Sulfur.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Nickel Vein
                Materials.Cobalt.getDust(1), Materials.Cobaltite.getDust(1), Materials.Iron.getDust(1),
                Materials.Nickel.getDust(1), Materials.Pentlandite.getDust(1), Materials.RoastedNickel.getDust(1),
                Materials.Sulfur.getDust(1),

                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),

                // Soapstone Vein
                Materials.Cobalt.getDust(1), Materials.Glauconite.getDust(1), Materials.Iron.getDust(1),
                Materials.Nickel.getDust(1), Materials.Pentlandite.getDust(1), Materials.Soapstone.getDust(1),
                Materials.Sodium.getDust(1), Materials.Talc.getDust(1),

                // Perditio & Ordo Vein
                Materials.Amber.getDust(1), Materials.Cinnabar.getDust(1), Materials.Glowstone.getDust(1),
                Materials.Redstone.getDust(1), Materials.Sulfur.getDust(1),

                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2544), // Perditio Crystal Powder
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2545), // Ordo Crystal Powder

                // Gold Vein
                Materials.Copper.getDust(1), Materials.Gold.getDust(1), Materials.Iron.getDust(1),
                Materials.Magnesite.getDust(1), Materials.Nickel.getDust(1), Materials.Vanadium.getDust(1),
                Materials.VanadiumMagnetite.getDust(1),

                // Iron Vein
                Materials.BrownLimonite.getDust(1), Materials.Calcite.getDust(1), Materials.Cobalt.getDust(1),
                Materials.Copper.getDust(1), Materials.Malachite.getDust(1), Materials.Nickel.getDust(1),
                Materials.RoastedIron.getDust(1), Materials.YellowLimonite.getDust(1),

                // Apatite Vein
                Materials.Apatite.getDust(1), Materials.Calcite.getDust(1), Materials.Niobium.getDust(1),
                Materials.Phosphate.getDust(1), Materials.Pyrochlore.getDust(1),
                Materials.TricalciumPhosphate.getDust(1),

                // Magnetite Vein
                Materials.Gold.getDust(1), Materials.Iron.getDust(1), Materials.Magnetite.getDust(1),
                Materials.Nickel.getDust(1), Materials.Tin.getDust(1), Materials.Vanadium.getDust(1),
                Materials.VanadiumMagnetite.getDust(1),

                // Salt Vein
                Materials.Borax.getDust(1), Materials.Caesium.getDust(1), Materials.Lepidolite.getDust(1),
                Materials.Lithium.getDust(1), Materials.RockSalt.getDust(1), Materials.Salt.getDust(1),
                Materials.Spodumene.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Cassiterite Vein
                Materials.Cassiterite.getDust(1), Materials.Iron.getDust(1), Materials.Tin.getDust(1),
                Materials.Zinc.getDust(1),

                WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),

                // Aqua & Ignis Vein
                Materials.Amber.getDust(1), Materials.Cinnabar.getDust(1), Materials.Glowstone.getDust(1),
                Materials.Redstone.getDust(1), Materials.Sulfur.getDust(1),

                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2541), // Ignis Crystal Powder
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2543), // Aqua Crystal Powder

                // Small Ore Stats
                // Amethyst Ore
                Materials.Amethyst.getDust(1),

                // Yellow Garnet Ore
                Materials.Andradite.getDust(1), Materials.GarnetYellow.getDust(1), Materials.Grossular.getDust(1),
                Materials.Uvarovite.getDust(1),

                // Tanzanite Ore
                Materials.Opal.getDust(1), Materials.Tanzanite.getDust(1),

                // Saltpeter Ore
                Materials.Saltpeter.getDust(1),

                // Spinel Ore
                Materials.Jasper.getDust(1),

                // Opal Ore
                Materials.Opal.getDust(1), Materials.Tanzanite.getDust(1),

                // Ruby Ore
                Materials.Chrome.getDust(1), Materials.Ruby.getDust(1), Materials.GarnetRed.getDust(1),

                // Lead Ore
                Materials.Lead.getDust(1), Materials.Silver.getDust(1), Materials.Sulfur.getDust(1),

                // Emerald Ore
                Materials.Beryllium.getDust(1), Materials.Emerald.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Amber Ore
                Materials.Amber.getDust(1),

                // Blue Topaz Ore
                Materials.BlueTopaz.getDust(1), Materials.Topaz.getDust(1),

                // Topaz Ore
                Materials.BlueTopaz.getDust(1), Materials.Topaz.getDust(1),

                // Jade Ore
                Materials.Jade.getDust(1),

                // Red Garnet Ore
                Materials.Almandine.getDust(1), Materials.GarnetRed.getDust(1), Materials.Pyrope.getDust(1),
                Materials.Spessartine.getDust(1),

                // Green Sapphire Ore
                Materials.GreenSapphire.getDust(1), Materials.Sapphire.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Sapphire Ore
                Materials.GreenSapphire.getDust(1), Materials.Sapphire.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Jasper Ore
                Materials.Jasper.getDust(1),

                // Olivine Ore
                Materials.Magnesium.getDust(1), Materials.Olivine.getDust(1), Materials.Pyrope.getDust(1) });

        // T0 - TheEnd - ED
        VoidDustRecipes_T0.put(
            "ED",
            new ItemStack[] {
                // Molybdenum Vein
                Materials.Molybdenite.getDust(1), Materials.Molybdenum.getDust(1), Materials.Powellite.getDust(1),
                Materials.Wulfenite.getDust(1),

                // Nickel Vein
                Materials.Cobalt.getDust(1), Materials.Cobaltite.getDust(1), Materials.Iron.getDust(1),
                Materials.Nickel.getDust(1), Materials.Pentlandite.getDust(1), Materials.RoastedNickel.getDust(1),
                Materials.Sulfur.getDust(1),

                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),

                // Copper Vein
                Materials.Cadmium.getDust(1), Materials.Chalcopyrite.getDust(1), Materials.Cobalt.getDust(1),
                Materials.Copper.getDust(1), Materials.Gold.getDust(1), Materials.Iron.getDust(1),
                Materials.Nickel.getDust(1), Materials.Pyrite.getDust(1), Materials.Sulfur.getDust(1),
                Materials.Tin.getDust(1), Materials.TricalciumPhosphate.getDust(1),

                // Gold Vein
                Materials.Copper.getDust(1), Materials.Gold.getDust(1), Materials.Iron.getDust(1),
                Materials.Magnesite.getDust(1), Materials.Nickel.getDust(1), Materials.Vanadium.getDust(1),
                Materials.VanadiumMagnetite.getDust(1),

                // Beryllium Vein
                Materials.Beryllium.getDust(1), Materials.Emerald.getDust(1), Materials.Lead.getDust(1),
                Materials.Thorium.getDust(1), Materials.Uranium.getDust(1),

                // Tetrahedrite Vein
                Materials.Antimony.getDust(1), Materials.Cobalt.getDust(1), Materials.Copper.getDust(1),
                Materials.Gold.getDust(1), Materials.Nickel.getDust(1), Materials.Stibnite.getDust(1),
                Materials.Tetrahedrite.getDust(1), Materials.Zinc.getDust(1),

                // Cassiterite Vein
                Materials.Cassiterite.getDust(1), Materials.Iron.getDust(1), Materials.Tin.getDust(1),
                Materials.Zinc.getDust(1),

                WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),

                // Small Ore Stats
                // Iron Ore
                Materials.Iron.getDust(1), Materials.Nickel.getDust(1), Materials.Tin.getDust(1),

                // Copper Ore
                Materials.Copper.getDust(1), Materials.Cobalt.getDust(1), Materials.Nickel.getDust(1),
                Materials.Gold.getDust(1),

                // Silver Ore
                Materials.Lead.getDust(1), Materials.Silver.getDust(1), Materials.Sulfur.getDust(1),

                // Tin Ore
                Materials.Iron.getDust(1), Materials.Tin.getDust(1), Materials.Zinc.getDust(1),

                // Lead Ore
                Materials.Lead.getDust(1), Materials.Silver.getDust(1), Materials.Sulfur.getDust(1),

                // Gold Ore
                Materials.Copper.getDust(1), Materials.Gold.getDust(1), Materials.Nickel.getDust(1),

                // Zinc Ore
                Materials.Gallium.getDust(1), Materials.Tin.getDust(1), Materials.Zinc.getDust(1),

                // Nickel Ore
                Materials.Cobalt.getDust(1), Materials.Nickel.getDust(1), Materials.Iron.getDust(1),

                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1) });

        // T0 - EndAsteroid - EA
        VoidDustRecipes_T0.put(
            "EA",
            new ItemStack[] {
                // Tungstate Vein
                Materials.Calcium.getDust(1), Materials.Lithium.getDust(1), Materials.Manganese.getDust(1),
                Materials.Molybdenum.getDust(1), Materials.Scheelite.getDust(1), Materials.Tungstate.getDust(1),

                // Lapis Vein
                Materials.Andradite.getDust(1), Materials.Calcite.getDust(1), Materials.Lapis.getDust(1),
                Materials.Lazurite.getDust(1), Materials.Malachite.getDust(1), Materials.Pyrite.getDust(1),
                Materials.Sodalite.getDust(1),

                // Molybdenum Vein
                Materials.Molybdenite.getDust(1), Materials.Molybdenum.getDust(1), Materials.Powellite.getDust(1),
                Materials.Wulfenite.getDust(1),

                // Olivine Vein
                Materials.Bentonite.getDust(1), Materials.Calcium.getDust(1), Materials.Glauconite.getDust(1),
                Materials.Iron.getDust(1), Materials.Magnesium.getDust(1), Materials.Magnetite.getDust(1),
                Materials.Olivine.getDust(1), Materials.Pyrope.getDust(1), Materials.Sodium.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Manganese Vein
                Materials.Calcium.getDust(1), Materials.GarnetRed.getDust(1), Materials.GarnetYellow.getDust(1),
                Materials.Grossular.getDust(1), Materials.Manganese.getDust(1), Materials.Niobium.getDust(1),
                Materials.Pyrolusite.getDust(1), Materials.Spessartine.getDust(1), Materials.Tantalite.getDust(1),
                Materials.Tantalum.getDust(1),

                // Nickel Vein
                Materials.Cobalt.getDust(1), Materials.Cobaltite.getDust(1), Materials.Iron.getDust(1),
                Materials.Nickel.getDust(1), Materials.Pentlandite.getDust(1), Materials.RoastedNickel.getDust(1),
                Materials.Sulfur.getDust(1),

                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),

                // Copper Vein
                Materials.Cadmium.getDust(1), Materials.Chalcopyrite.getDust(1), Materials.Cobalt.getDust(1),
                Materials.Copper.getDust(1), Materials.Gold.getDust(1), Materials.Iron.getDust(1),
                Materials.Nickel.getDust(1), Materials.Pyrite.getDust(1), Materials.Sulfur.getDust(1),
                Materials.Tin.getDust(1), Materials.TricalciumPhosphate.getDust(1),

                // Gold Vein
                Materials.Copper.getDust(1), Materials.Gold.getDust(1), Materials.Iron.getDust(1),
                Materials.Magnesite.getDust(1), Materials.Nickel.getDust(1), Materials.Vanadium.getDust(1),
                Materials.VanadiumMagnetite.getDust(1),

                // Beryllium Vein
                Materials.Beryllium.getDust(1), Materials.Emerald.getDust(1), Materials.Lead.getDust(1),
                Materials.Thorium.getDust(1), Materials.Uranium.getDust(1),

                // Platinum Vein
                Materials.Nickel.getDust(1),

                WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.IrOsLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PDMetallicPowder.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),

                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2828), // Sheldonite Dust

                // Tetrahedrite Vein
                Materials.Antimony.getDust(1), Materials.Cobalt.getDust(1), Materials.Copper.getDust(1),
                Materials.Gold.getDust(1), Materials.Nickel.getDust(1), Materials.Stibnite.getDust(1),
                Materials.Tetrahedrite.getDust(1), Materials.Zinc.getDust(1),

                // Naquadah Vein
                getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10054), // Naquadah Oxide Mixture Dust
                getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10067), // Enriched-Naquadah Oxide Mixture Dust
                getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10072), // Naquadria Oxide Mixture Dust

                // Cassiterite Vein
                Materials.Cassiterite.getDust(1), Materials.Iron.getDust(1), Materials.Tin.getDust(1),
                Materials.Zinc.getDust(1),

                WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),

                // Small Ore Stats
                // Silver Ore
                Materials.Lead.getDust(1), Materials.Silver.getDust(1), Materials.Sulfur.getDust(1),

                // Tin Ore
                Materials.Iron.getDust(1), Materials.Tin.getDust(1), Materials.Zinc.getDust(1),

                // Lead Ore
                Materials.Lead.getDust(1), Materials.Silver.getDust(1), Materials.Sulfur.getDust(1),

                // Gold Ore
                Materials.Copper.getDust(1), Materials.Gold.getDust(1), Materials.Nickel.getDust(1),

                // Zinc Ore
                Materials.Gallium.getDust(1), Materials.Tin.getDust(1), Materials.Zinc.getDust(1),

                // Nickel Ore
                Materials.Cobalt.getDust(1), Materials.Nickel.getDust(1), Materials.Iron.getDust(1),

                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1) });
    }
}
