package Recipes.SingularityRecipes_VoidDust;

import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

import bartworks.system.material.WerkstoffLoader;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gtnhlanth.common.register.WerkstoffMaterialPool;

public class SingularityDustRecipes_T2 {

    public static final Map<String, ItemStack[]> VoidDustRecipes_T2 = new HashMap<>();

    public static void addVoidDustRecipes_T2() {
        // T2 - Deimos - De
        VoidDustRecipes_T2.put(
            "De",
            new ItemStack[] {
                // Uranium 238 Vein
                Materials.Lead.getDust(1), Materials.Thorium.getDust(1), Materials.Uraninite.getDust(1),
                Materials.Uranium.getDust(1), Materials.Uranium235.getDust(1),

                getModItem(GTPlusPlus.ID, "dustRadium226", 1L), // Radium 226 Dust

                // Tungstate Vein
                Materials.Calcium.getDust(1), Materials.Lithium.getDust(1), Materials.Manganese.getDust(1),
                Materials.Molybdenum.getDust(1), Materials.Scheelite.getDust(1), Materials.Tungstate.getDust(1),

                // Sulfur Vein
                Materials.Cadmium.getDust(1), Materials.Gallium.getDust(1), Materials.GarnetYellow.getDust(1),
                Materials.Iron.getDust(1), Materials.Pyrite.getDust(1), Materials.Sphalerite.getDust(1),
                Materials.Sulfur.getDust(1), Materials.TricalciumPhosphate.getDust(1),

                // Lapis Vein
                Materials.Andradite.getDust(1), Materials.Calcite.getDust(1), Materials.Lapis.getDust(1),
                Materials.Lazurite.getDust(1), Materials.Malachite.getDust(1), Materials.Pyrite.getDust(1),
                Materials.Sodalite.getDust(1),

                // Draconium Vein
                Materials.Diamond.getDust(1), Materials.Draconium.getDust(1), Materials.Electrotine.getDust(1),
                Materials.Electrum.getDust(1), Materials.Jade.getDust(1), Materials.Redstone.getDust(1),
                Materials.Vinteum.getDust(1),

                // Monazite Vein
                Materials.Bastnasite.getDust(1), Materials.Monazite.getDust(1), Materials.Neodymium.getDust(1),
                Materials.RareEarth.getDust(1), Materials.Thorium.getDust(1), Materials.Chalcopyrite.getDust(1),
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

                // Nickel Vein
                Materials.Cobalt.getDust(1), Materials.Cobaltite.getDust(1), Materials.Iron.getDust(1),
                Materials.Nickel.getDust(1), Materials.Pentlandite.getDust(1), Materials.RoastedNickel.getDust(1),
                Materials.Sulfur.getDust(1),

                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),

                // Tetrahedrite Vein
                Materials.Antimony.getDust(1), Materials.Cobalt.getDust(1), Materials.Copper.getDust(1),
                Materials.Gold.getDust(1), Materials.Nickel.getDust(1), Materials.Stibnite.getDust(1),
                Materials.Tetrahedrite.getDust(1), Materials.Zinc.getDust(1),

                // Oriharukon Vein
                Materials.Mirabilite.getDust(1), Materials.Oriharukon.getDust(1), Materials.Tanzanite.getDust(1),
                Materials.Vyroxeres.getDust(1),

                // Magnetite Vein
                Materials.Gold.getDust(1), Materials.Iron.getDust(1), Materials.Magnetite.getDust(1),
                Materials.Nickel.getDust(1), Materials.Tin.getDust(1), Materials.Vanadium.getDust(1),
                Materials.VanadiumMagnetite.getDust(1),

                // Small Ore Stats
                // Saltpeter Ore
                Materials.Saltpeter.getDust(1),

                // Titanium Ore
                Materials.Almandine.getDust(1), Materials.Titanium.getDust(1),

                // Tin Ore
                Materials.Iron.getDust(1), Materials.Tin.getDust(1), Materials.Zinc.getDust(1),

                // Lead Ore
                Materials.Lead.getDust(1), Materials.Silver.getDust(1), Materials.Sulfur.getDust(1),

                // Diamond Ore
                Materials.Diamond.getDust(1), Materials.Graphite.getDust(1),

                // Draconium Ore
                Materials.Draconium.getDust(1),

                // Chromite Ore
                Materials.Chromite.getDust(1), Materials.Iron.getDust(1), Materials.Magnesium.getDust(1),

                // Tungstate Ore
                Materials.Lithium.getDust(1), Materials.Manganese.getDust(1), Materials.Silver.getDust(1),
                Materials.Tungstate.getDust(1),

                // Meteoric Iron Ore
                Materials.Iron.getDust(1), Materials.MeteoricIron.getDust(1), Materials.Nickel.getDust(1),

                WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1),

                // Desh Ore
                Materials.Desh.getDust(1),

                // Nickel Ore
                Materials.Cobalt.getDust(1), Materials.Nickel.getDust(1), Materials.Iron.getDust(1),

                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1) });

        // T2 - Mars - Ma
        VoidDustRecipes_T2.put(
            "Ma",
            new ItemStack[] {
                // Tungstate Vein
                Materials.Calcium.getDust(1), Materials.Lithium.getDust(1), Materials.Manganese.getDust(1),
                Materials.Molybdenum.getDust(1), Materials.Scheelite.getDust(1), Materials.Tungstate.getDust(1),

                // Sulfur Vein
                Materials.Cadmium.getDust(1), Materials.Gallium.getDust(1), Materials.GarnetYellow.getDust(1),
                Materials.Iron.getDust(1), Materials.Pyrite.getDust(1), Materials.Sphalerite.getDust(1),
                Materials.Sulfur.getDust(1), Materials.TricalciumPhosphate.getDust(1),

                // Desh Vein
                Materials.Calcium.getDust(1), Materials.Desh.getDust(1), Materials.Lithium.getDust(1),
                Materials.Manganese.getDust(1), Materials.Molybdenum.getDust(1), Materials.Scheelite.getDust(1),
                Materials.Silver.getDust(1), Materials.Tungstate.getDust(1),

                // Pitchblende Vein
                Materials.Lead.getDust(1), Materials.Pitchblende.getDust(1), Materials.Thorium.getDust(1),
                Materials.Uraninite.getDust(1), Materials.Uranium.getDust(1), Materials.Uranium235.getDust(1),

                getModItem(GTPlusPlus.ID, "dustRadium226", 1L), // Radium 226 Dust

                // Quartz Vein
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

                // Nickel Vein
                Materials.Cobalt.getDust(1), Materials.Cobaltite.getDust(1), Materials.Iron.getDust(1),
                Materials.Nickel.getDust(1), Materials.Pentlandite.getDust(1), Materials.RoastedNickel.getDust(1),
                Materials.Sulfur.getDust(1),

                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),

                // Arsenic Vein
                Materials.Antimony.getDust(1), Materials.Arsenic.getDust(1), Materials.Bismuth.getDust(1),
                Materials.Iron.getDust(1), Materials.Zinc.getDust(1),

                // Gold Vein
                Materials.Copper.getDust(1), Materials.Gold.getDust(1), Materials.Iron.getDust(1),
                Materials.Magnesite.getDust(1), Materials.Nickel.getDust(1), Materials.Vanadium.getDust(1),
                Materials.VanadiumMagnetite.getDust(1),

                // Iron Vein
                Materials.BrownLimonite.getDust(1), Materials.Calcite.getDust(1), Materials.Cobalt.getDust(1),
                Materials.Copper.getDust(1), Materials.Malachite.getDust(1), Materials.Nickel.getDust(1),
                Materials.RoastedIron.getDust(1), Materials.YellowLimonite.getDust(1),

                // Beryllium Vein
                Materials.Beryllium.getDust(1), Materials.Emerald.getDust(1), Materials.Lead.getDust(1),
                Materials.Thorium.getDust(1), Materials.Uranium.getDust(1),

                // Tetrahedrite Vein
                Materials.Antimony.getDust(1), Materials.Cobalt.getDust(1), Materials.Copper.getDust(1),
                Materials.Gold.getDust(1), Materials.Nickel.getDust(1), Materials.Stibnite.getDust(1),
                Materials.Tetrahedrite.getDust(1), Materials.Zinc.getDust(1),

                // Galena Vein
                Materials.Lead.getDust(1), Materials.Galena.getDust(1), Materials.Silver.getDust(1),
                Materials.Sulfur.getDust(1),

                // Salt Vein
                Materials.Borax.getDust(1), Materials.Caesium.getDust(1), Materials.Lepidolite.getDust(1),
                Materials.Lithium.getDust(1), Materials.RockSalt.getDust(1), Materials.Salt.getDust(1),
                Materials.Spodumene.getDust(1), WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Small Ore Stats
                // Saltpeter Ore
                Materials.Saltpeter.getDust(1),

                // Iron Ore
                Materials.Iron.getDust(1), Materials.Nickel.getDust(1), Materials.Tin.getDust(1),

                // Copper Ore
                Materials.Copper.getDust(1), Materials.Cobalt.getDust(1), Materials.Nickel.getDust(1),
                Materials.Gold.getDust(1),

                // Titanium Ore
                Materials.Almandine.getDust(1), Materials.Titanium.getDust(1),

                // Oriharukon Ore
                Materials.Oriharukon.getDust(1),

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

                // Gold Ore
                Materials.Copper.getDust(1), Materials.Gold.getDust(1), Materials.Nickel.getDust(1),

                // Chromite Ore
                Materials.Chromite.getDust(1), Materials.Iron.getDust(1), Materials.Magnesium.getDust(1),

                // Tungstate Ore
                Materials.Lithium.getDust(1), Materials.Manganese.getDust(1), Materials.Silver.getDust(1),
                Materials.Tungstate.getDust(1),

                // Meteoric Iron Ore
                Materials.Iron.getDust(1), Materials.MeteoricIron.getDust(1), Materials.Nickel.getDust(1),

                WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1),

                // Bismuth Ore
                Materials.Bismuth.getDust(1),

                // Zinc Ore
                Materials.Gallium.getDust(1), Materials.Tin.getDust(1), Materials.Zinc.getDust(1),

                // Nickel Ore
                Materials.Cobalt.getDust(1), Materials.Nickel.getDust(1), Materials.Iron.getDust(1),

                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1) });

        // T2 - Phobos - Ph
        VoidDustRecipes_T2.put(
            "Ph",
            new ItemStack[] {
                // Uranium 238 Vein
                Materials.Lead.getDust(1), Materials.Thorium.getDust(1), Materials.Uraninite.getDust(1),
                Materials.Uranium.getDust(1), Materials.Uranium235.getDust(1),

                getModItem(GTPlusPlus.ID, "dustRadium226", 1L), // Radium 226 Dust

                // Sulfur Vein
                Materials.Cadmium.getDust(1), Materials.Gallium.getDust(1), Materials.GarnetYellow.getDust(1),
                Materials.Iron.getDust(1), Materials.Pyrite.getDust(1), Materials.Sphalerite.getDust(1),
                Materials.Sulfur.getDust(1), Materials.TricalciumPhosphate.getDust(1),

                // Diamond Vein
                Materials.Carbon.getDust(1), Materials.Coal.getDust(1), Materials.Diamond.getDust(1),
                Materials.Graphite.getDust(1), Materials.Lignite.getDust(1), Materials.Thorium.getDust(1),

                // Molybdenum Vein
                Materials.Molybdenite.getDust(1), Materials.Molybdenum.getDust(1), Materials.Powellite.getDust(1),
                Materials.Wulfenite.getDust(1),

                // Pitchblende Vein
                Materials.Lead.getDust(1), Materials.Pitchblende.getDust(1), Materials.Thorium.getDust(1),
                Materials.Uraninite.getDust(1), Materials.Uranium.getDust(1), Materials.Uranium235.getDust(1),

                getModItem(GTPlusPlus.ID, "dustRadium226", 1L), // Radium 226 Dust

                // Quartz Vein
                Materials.Barite.getDust(1), Materials.CertusQuartz.getDust(1), Materials.Quartzite.getDust(1),

                // Draconium Vein
                Materials.Diamond.getDust(1), Materials.Draconium.getDust(1), Materials.Electrotine.getDust(1),
                Materials.Electrum.getDust(1), Materials.Jade.getDust(1), Materials.Redstone.getDust(1),
                Materials.Vinteum.getDust(1),

                // Nickel Vein
                Materials.Cobalt.getDust(1), Materials.Cobaltite.getDust(1), Materials.Iron.getDust(1),
                Materials.Nickel.getDust(1), Materials.Pentlandite.getDust(1), Materials.RoastedNickel.getDust(1),
                Materials.Sulfur.getDust(1),

                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),

                // Arsenic Vein
                Materials.Antimony.getDust(1), Materials.Arsenic.getDust(1), Materials.Bismuth.getDust(1),
                Materials.Iron.getDust(1), Materials.Zinc.getDust(1),

                // Bauxite Vein
                Materials.Aluminium.getDust(1), Materials.Bauxite.getDust(1), Materials.Gallium.getDust(1),
                Materials.Grossular.getDust(1), Materials.Iron.getDust(1), Materials.Ilmenite.getDust(1),
                Materials.Rutile.getDust(1), Materials.WroughtIron.getDust(1),

                WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),

                WerkstoffMaterialPool.Hafnium.get(OrePrefixes.dust, 1),

                // Gold Vein
                Materials.Copper.getDust(1), Materials.Gold.getDust(1), Materials.Iron.getDust(1),
                Materials.Magnesite.getDust(1), Materials.Nickel.getDust(1), Materials.Vanadium.getDust(1),
                Materials.VanadiumMagnetite.getDust(1),

                // Oriharukon Vein
                Materials.Mirabilite.getDust(1), Materials.Oriharukon.getDust(1), Materials.Tanzanite.getDust(1),
                Materials.Vyroxeres.getDust(1),

                // Small Ore Stats
                // Iron Ore
                Materials.Iron.getDust(1), Materials.Nickel.getDust(1), Materials.Tin.getDust(1),

                // Copper Ore
                Materials.Copper.getDust(1), Materials.Cobalt.getDust(1), Materials.Nickel.getDust(1),
                Materials.Gold.getDust(1),

                // Titanium Ore
                Materials.Almandine.getDust(1), Materials.Titanium.getDust(1),

                // Gold Ore
                Materials.Copper.getDust(1), Materials.Gold.getDust(1), Materials.Nickel.getDust(1),

                // Draconium Ore
                Materials.Draconium.getDust(1),

                // Chromite Ore
                Materials.Chromite.getDust(1), Materials.Iron.getDust(1), Materials.Magnesium.getDust(1),

                // Tungstate Ore
                Materials.Lithium.getDust(1), Materials.Manganese.getDust(1), Materials.Silver.getDust(1),
                Materials.Tungstate.getDust(1),

                // Meteoric Iron Ore
                Materials.Iron.getDust(1), Materials.MeteoricIron.getDust(1), Materials.Nickel.getDust(1),

                WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1),

                // Lapis Ore
                Materials.Lapis.getDust(1), Materials.Lazurite.getDust(1), Materials.Pyrite.getDust(1),
                Materials.Sodalite.getDust(1),

                // Desh Ore
                Materials.Desh.getDust(1) });
    }
}
