package Recipes.SingularityRecipes_VoidDust;

import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.NewHorizonsCoreMod;
import static gregtech.api.util.GTModHandler.getModItem;

import net.minecraft.item.ItemStack;

import bartworks.system.material.WerkstoffLoader;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gtnhlanth.common.register.WerkstoffMaterialPool;

public class Vein_Dust {

    // Apatite Vein
    public static final ItemStack[] Apatite_Vein = new ItemStack[] {
        //
        Materials.Apatite.getDust(1),
        //
        Materials.Calcite.getDust(1),
        //
        Materials.Niobium.getDust(1),
        //
        Materials.Phosphate.getDust(1),
        //
        Materials.Pyrochlore.getDust(1),
        //
        Materials.TricalciumPhosphate.getDust(1) };

    // Aqua, Ignis & Amber Vein
    public static final ItemStack[] Aqua_Ignis_Amber_Vein = new ItemStack[] {
        //
        Materials.Amber.getDust(1),
        //
        Materials.Cinnabar.getDust(1),
        //
        Materials.Glowstone.getDust(1),
        //
        Materials.Redstone.getDust(1),
        //
        Materials.Sulfur.getDust(1),
        // Ignis Crystal Powder
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2541),
        // Aqua Crystal Powder
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2543), };

    // Arsenic Vein
    public static final ItemStack[] Arsenic_Vein = new ItemStack[] {
        //
        Materials.Antimony.getDust(1),
        //
        Materials.Arsenic.getDust(1),
        //
        Materials.Bismuth.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Zinc.getDust(1) };

    // Arsenopyrite & Ferberite & Loellingite & Roquesite Vein
    public static final ItemStack[] Arsenopyrite_Ferberite_Loellingite_Roquesite_Vein = new ItemStack[] {
        //
        Materials.Arsenic.getDust(1),
        //
        Materials.Copper.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Sulfur.getDust(1),
        //
        Materials.Tungsten.getDust(1),
        //
        WerkstoffLoader.Arsenopyrite.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.Ferberite.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.Loellingit.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.Roquesit.get(OrePrefixes.dust, 1) };

    // Awakened Draconium Vein
    public static final ItemStack[] Awakened_Draconium_Vein = new ItemStack[] {
        //
        Materials.Draconium.getDust(1),
        //
        Materials.DraconiumAwakened.getDust(1),
        //
        Materials.NetherStar.getDust(1) };

    // BArTiMaEuSNeK Vein
    public static final ItemStack[] BArTiMaEuSNeK_Vein = new ItemStack[] {
        //
        Materials.Boron.getDust(1),
        //
        Materials.Europium.getDust(1),
        //
        Materials.Titanium.getDust(1) };

    // Basaltic Mineral Sand Vein
    public static final ItemStack[] Basaltic_Mineral_Sand_Vein = new ItemStack[] {
        //
        Materials.Basalt.getDust(1),
        //
        Materials.FullersEarth.getDust(1),
        //
        Materials.GraniteBlack.getDust(1),
        //
        Materials.Gypsum.getDust(1),
        //
        Materials.Magnesium.getDust(1),
        //
        Materials.Magnetite.getDust(1),
        //
        Materials.SiliconDioxide.getDust(1),
        //
        WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1) };

    // Bauxite Vein
    public static final ItemStack[] Bauxite_Vein = new ItemStack[] {
        //
        Materials.Aluminium.getDust(1),
        //
        Materials.Bauxite.getDust(1),
        //
        Materials.Gallium.getDust(1),
        //
        Materials.Grossular.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Ilmenite.getDust(1),
        //
        Materials.Rutile.getDust(1),
        //
        Materials.WroughtIron.getDust(1),
        //
        WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),
        //
        WerkstoffMaterialPool.Hafnium.get(OrePrefixes.dust, 1) };

    // Beryllium Vein
    public static final ItemStack[] Beryllium_Vein = new ItemStack[] {
        //
        Materials.Beryllium.getDust(1),
        //
        Materials.Emerald.getDust(1),
        //
        Materials.Lead.getDust(1),
        //
        Materials.Thorium.getDust(1),
        //
        Materials.Uranium.getDust(1),
        //
        WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1) };

    // Bismutite & Bismuthinite Vein
    public static final ItemStack[] Bismutite_Bismuthinite_Vein = new ItemStack[] {
        //
        Materials.Antimony.getDust(1),
        //
        Materials.Bismuth.getDust(1),
        //
        Materials.Stibnite.getDust(1),
        //
        Materials.Sulfur.getDust(1),
        //
        WerkstoffLoader.Bismuthinit.get(OrePrefixes.dust, 1) };

    // Black Plutonium Vein
    public static final ItemStack[] Black_Plutonium_Vein = new ItemStack[] {
        //
        Materials.Almandine.getDust(1),
        //
        Materials.Andradite.getDust(1),
        //
        Materials.BlackPlutonium.getDust(1),
        //
        Materials.Borax.getDust(1),
        //
        Materials.GarnetRed.getDust(1),
        //
        Materials.GarnetYellow.getDust(1),
        //
        Materials.Grossular.getDust(1),
        //
        Materials.Pyrope.getDust(1),
        //
        Materials.Spessartine.getDust(1),
        //
        Materials.Uvarovite.getDust(1) };

    // Callisto Ice Vein
    public static final ItemStack[] Callisto_Ice_Vein = new ItemStack[] {
        //
        Materials.CallistoIce.getDust(1),
        //
        Materials.Topaz.getDust(1),
        //
        Materials.BlueTopaz.getDust(1),
        //
        Materials.Alduorite.getDust(1) };

    // Cassiterite Vein
    public static final ItemStack[] Cassiterite_Vein = new ItemStack[] {
        //
        Materials.Cassiterite.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Tin.getDust(1),
        //
        Materials.Zinc.getDust(1),
        //
        WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1) };

    // Certus Quartz Vein
    public static final ItemStack[] Certus_Quartz_Vein = new ItemStack[] {
        //
        Materials.Barite.getDust(1),
        //
        Materials.CertusQuartz.getDust(1),
        //
        Materials.Quartzite.getDust(1),
        //
        Materials.QuartzSand.getDust(1),
        // Charged Certus Quartz Dust
        getModItem(NewHorizonsCoreMod.ID, "item.ChargedCertusQuartzDust", 1L) };

    // Chrome Vein
    public static final ItemStack[] Chrome_Vein = new ItemStack[] {
        //
        Materials.Chrome.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Lithium.getDust(1),
        //
        Materials.Magnesium.getDust(1),
        //
        Materials.Manganese.getDust(1),
        //
        Materials.Molybdenum.getDust(1),
        //
        Materials.Silver.getDust(1),
        //
        Materials.Tungstate.getDust(1) };

    // Coal Vein
    public static final ItemStack[] Coal_Vein = new ItemStack[] {
        //
        Materials.Carbon.getDust(1),
        //
        Materials.Coal.getDust(1),
        //
        Materials.Lignite.getDust(1),
        //
        Materials.Thorium.getDust(1) };

    // Copper Vein
    public static final ItemStack[] Copper_Vein = new ItemStack[] {
        //
        Materials.Cadmium.getDust(1),
        //
        Materials.Chalcopyrite.getDust(1),
        //
        Materials.Cobalt.getDust(1),
        //
        Materials.Copper.getDust(1),
        //
        Materials.Gold.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Nickel.getDust(1),
        //
        Materials.Pyrite.getDust(1),
        //
        Materials.Sulfur.getDust(1),
        //
        Materials.Tin.getDust(1),
        //
        Materials.TricalciumPhosphate.getDust(1) };

    // Cosmic Neutronium Vein
    public static final ItemStack[] Cosmic_Neutronium_Vein = new ItemStack[] {
        //
        Materials.Bedrockium.getDust(1),
        //
        Materials.BlackPlutonium.getDust(1),
        //
        Materials.CosmicNeutronium.getDust(1),
        //
        Materials.Neutronium.getDust(1) };

    // Cryolite Vein
    public static final ItemStack[] Cryolite_Vein = new ItemStack[] {
        //
        Materials.Cryolite.getDust(1),
        //
        Materials.Galena.getDust(1),
        //
        Materials.Lead.getDust(1),
        //
        Materials.Silver.getDust(1),
        //
        Materials.Sodium.getDust(1),
        //
        Materials.Sulfur.getDust(1),
        //
        WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1) };

    // Desh Vein
    public static final ItemStack[] Desh_Vein = new ItemStack[] {
        //
        Materials.Calcium.getDust(1),
        //
        Materials.Desh.getDust(1),
        //
        Materials.Lithium.getDust(1),
        //
        Materials.Manganese.getDust(1),
        //
        Materials.Molybdenum.getDust(1),
        //
        Materials.Scheelite.getDust(1),
        //
        Materials.Silver.getDust(1),
        //
        Materials.Tungstate.getDust(1) };

    // Diamond Vein
    public static final ItemStack[] Diamond_Vein = new ItemStack[] {
        //
        Materials.Carbon.getDust(1),
        //
        Materials.Coal.getDust(1),
        //
        Materials.Diamond.getDust(1),
        //
        Materials.Graphite.getDust(1),
        //
        Materials.Lignite.getDust(1),
        //
        Materials.Thorium.getDust(1) };

    // Dilithium Vein
    public static final ItemStack[] Dilithium_Vein = new ItemStack[] {
        //
        Materials.Dilithium.getDust(1),
        //
        Materials.MysteriousCrystal.getDust(1),
        //
        Materials.Vinteum.getDust(1) };

    // Djurleite & Bornite & Wittichenite Vein
    public static final ItemStack[] Djurleite_Bornite_Wittichenite_Vein = new ItemStack[] {
        //
        Materials.Antimony.getDust(1),
        //
        Materials.Bismuth.getDust(1),
        //
        Materials.Copper.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Sulfur.getDust(1),
        //
        Materials.Tetrahedrite.getDust(1),
        //
        Materials.Zinc.getDust(1),
        //
        WerkstoffLoader.Bornite.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.Djurleit.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.Wittichenit.get(OrePrefixes.dust, 1) };

    // Dolomite Vein
    public static final ItemStack[] Dolomite_Vein = new ItemStack[] {
        //
        Materials.Andradite.getDust(1),
        //
        Materials.Dolomite.getDust(1),
        //
        Materials.GarnetYellow.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Trona.getDust(1),
        //
        Materials.Wollastonite.getDust(1) };

    // Draconium Vein
    public static final ItemStack[] Draconium_Vein = new ItemStack[] {
        //
        Materials.Diamond.getDust(1),
        //
        Materials.Draconium.getDust(1),
        //
        Materials.Electrotine.getDust(1),
        //
        Materials.Electrum.getDust(1),
        //
        Materials.Jade.getDust(1),
        //
        Materials.Redstone.getDust(1),
        //
        Materials.Vinteum.getDust(1) };

    // Electrotine Vein
    public static final ItemStack[] Electrotine_Vein = new ItemStack[] {
        //
        Materials.Alunite.getDust(1),
        //
        Materials.BandedIron.getDust(1),
        //
        Materials.Diamond.getDust(1),
        //
        Materials.Diatomite.getDust(1),
        //
        Materials.Electrotine.getDust(1),
        //
        Materials.Electrum.getDust(1),
        //
        Materials.Redstone.getDust(1),
        //
        Materials.Saltpeter.getDust(1),
        //
        Materials.Sapphire.getDust(1) };

    // Fayalite & Green Fuchsite & Red Zircon & Red Fuchsite Vein
    public static final ItemStack[] Fayalite_GreenFuchsite_RedZircon_RedFuchsite_Vein = new ItemStack[] {
        //
        Materials.Chrome.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Potassium.getDust(1),
        //
        Materials.SiliconDioxide.getDust(1),
        //
        WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.Fayalit.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.FuchsitAL.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.FuchsitCR.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.RedZircon.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1) };

    // Ferberite & Huebnerite & Loellingite Vein
    public static final ItemStack[] Ferberite_Huebnerite_Loellingite_Vein = new ItemStack[] {
        //
        Materials.Arsenic.getDust(1),
        //
        Materials.Calcium.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Manganese.getDust(1),
        //
        Materials.Molybdenum.getDust(1),
        //
        Materials.Scheelite.getDust(1),
        //
        Materials.Tungsten.getDust(1),
        //
        WerkstoffLoader.Ferberite.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.Huebnerit.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.Loellingit.get(OrePrefixes.dust, 1) };

    // Fluorspar Vein
    public static final ItemStack[] Fluorspar_Vein = new ItemStack[] {
        //
        Materials.Barite.getDust(1),
        //
        Materials.Cadmium.getDust(1),
        //
        Materials.Galena.getDust(1),
        //
        Materials.Gallium.getDust(1),
        //
        Materials.GarnetYellow.getDust(1),
        //
        Materials.Lead.getDust(1),
        //
        Materials.Silver.getDust(1),
        //
        Materials.Sulfur.getDust(1),
        //
        Materials.Zinc.getDust(1),
        //
        WerkstoffLoader.Fluorspar.get(OrePrefixes.dust, 1) };

    // Forsterite & Fayalite & Orange Descloizite & Red Descloizite Vein
    public static final ItemStack[] Forsterite_Fayalite_OrangeDescloizite_RedDescloizite_Vein = new ItemStack[] {
        //
        Materials.Copper.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Lead.getDust(1),
        //
        Materials.Magnesium.getDust(1),
        //
        Materials.SiliconDioxide.getDust(1),
        //
        Materials.Vanadium.getDust(1),
        //
        Materials.Zinc.getDust(1),
        //
        WerkstoffLoader.DescloiziteCUVO4.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.DescloiziteZNVO4.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.Fayalit.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.Forsterit.get(OrePrefixes.dust, 1) };

    // Galena Vein
    public static final ItemStack[] Galena_Vein = new ItemStack[] {
        //
        Materials.Lead.getDust(1),
        //
        Materials.Galena.getDust(1),
        //
        Materials.Silver.getDust(1),
        //
        Materials.Sulfur.getDust(1) };

    // Gold Vein
    public static final ItemStack[] Gold_Vein = new ItemStack[] {
        //
        Materials.Copper.getDust(1),
        //
        Materials.Gold.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Magnesite.getDust(1),
        //
        Materials.Nickel.getDust(1),
        //
        Materials.Vanadium.getDust(1),
        //
        Materials.VanadiumMagnetite.getDust(1) };

    // Hedenbergite & Fayalite & Orange Descloizite & Red Descloizite Vein
    public static final ItemStack[] Hedenbergite_Fayalite_OrangeDescloizite_RedDescloizite_Vein = new ItemStack[] {
        //
        Materials.Calcium.getDust(1),
        //
        Materials.Copper.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Lead.getDust(1),
        //
        Materials.SiliconDioxide.getDust(1),
        //
        Materials.Vanadium.getDust(1),
        //
        Materials.Zinc.getDust(1),
        //
        WerkstoffLoader.DescloiziteCUVO4.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.DescloiziteZNVO4.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.Hedenbergit.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.Fayalit.get(OrePrefixes.dust, 1) };

    // Ilmenite Vein
    public static final ItemStack[] Ilmenite_Vein = new ItemStack[] {
        //
        Materials.Chrome.getDust(1),
        //
        Materials.Chromite.getDust(1),
        //
        Materials.GarnetYellow.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Ilmenite.getDust(1),
        //
        Materials.Magnesium.getDust(1),
        //
        Materials.Perlite.getDust(1),
        //
        Materials.Rutile.getDust(1),
        //
        Materials.Uvarovite.getDust(1),
        //
        Materials.WroughtIron.getDust(1),
        //
        WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),
        //
        WerkstoffMaterialPool.Hafnium.get(OrePrefixes.dust, 1) };

    // Infinity Catalyst Vein
    public static final ItemStack[] Infinity_Catalyst_Vein = new ItemStack[] {
        //
        Materials.Adamantium.getDust(1),
        //
        Materials.Bedrockium.getDust(1),
        //
        Materials.InfinityCatalyst.getDust(1),
        //
        Materials.Neutronium.getDust(1) };

    // Infused Gold Vein
    public static final ItemStack[] Infused_Gold_Vein = new ItemStack[] {
        //
        Materials.Copper.getDust(1),
        //
        Materials.Gold.getDust(1),
        //
        Materials.InfusedGold.getDust(1),
        //
        Materials.Nickel.getDust(1),
        //
        WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1) };

    // Iridium Vein
    public static final ItemStack[] Iridium_Vein = new ItemStack[] {
        //
        Materials.Cobalt.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Mithril.getDust(1),
        //
        Materials.Nickel.getDust(1),
        //
        WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.IrOsLeachResidue.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.PDMetallicPowder.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1) };

    // Iron Vein
    public static final ItemStack[] Iron_Vein = new ItemStack[] {
        //
        Materials.BrownLimonite.getDust(1),
        //
        Materials.Calcite.getDust(1),
        //
        Materials.Cobalt.getDust(1),
        //
        Materials.Copper.getDust(1),
        //
        Materials.Malachite.getDust(1),
        //
        Materials.Nickel.getDust(1),
        //
        Materials.RoastedIron.getDust(1),
        //
        Materials.YellowLimonite.getDust(1) };

    // Kaolinite Vein
    public static final ItemStack[] Kaolinite_Vein = new ItemStack[] {
        //
        Materials.FullersEarth.getDust(1),
        //
        Materials.GlauconiteSand.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Kaolinite.getDust(1),
        //
        Materials.Magnesium.getDust(1),
        //
        Materials.Sodium.getDust(1),
        //
        Materials.Zeolite.getDust(1),
        //
        WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1) };

    // Lapis Vein
    public static final ItemStack[] Lapis_Vein = new ItemStack[] {
        //
        Materials.Andradite.getDust(1),
        //
        Materials.Calcite.getDust(1),
        //
        Materials.Lapis.getDust(1),
        //
        Materials.Lazurite.getDust(1),
        //
        Materials.Malachite.getDust(1),
        //
        Materials.Pyrite.getDust(1),
        //
        Materials.Sodalite.getDust(1) };

    // Ledox Vein
    public static final ItemStack[] Ledox_Vein = new ItemStack[] {
        //
        Materials.Ledox.getDust(1),
        //
        Materials.Opal.getDust(1),
        //
        Materials.Orichalcum.getDust(1),
        //
        Materials.Rubracium.getDust(1),
        //
        Materials.Tanzanite.getDust(1),
        //
        WerkstoffMaterialPool.SamariumOreConcentrate.get(OrePrefixes.dust, 1) };

    // Lignite Coal Vein
    public static final ItemStack[] Lignite_Coal_Vein = new ItemStack[] {
        //
        Materials.Coal.getDust(1),
        //
        Materials.Lignite.getDust(1),
        //
        Materials.Thorium.getDust(1) };

    // Magnesite Vein
    public static final ItemStack[] Magnesite_Vein = new ItemStack[] {
        //
        Materials.Magnesite.getDust(1),
        //
        Materials.Magnesium.getDust(1),
        //
        Materials.Opal.getDust(1),
        //
        Materials.RoastedIron.getDust(1),
        //
        Materials.Sulfur.getDust(1),
        //
        Materials.Tanzanite.getDust(1) };

    // Magnetite Vein
    public static final ItemStack[] Magnetite_Vein = new ItemStack[] {
        //
        Materials.Gold.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Magnetite.getDust(1),
        //
        Materials.Nickel.getDust(1),
        //
        Materials.Tin.getDust(1),
        //
        Materials.Vanadium.getDust(1),
        //
        Materials.VanadiumMagnetite.getDust(1) };

    // Manganese Vein
    public static final ItemStack[] Manganese_Vein = new ItemStack[] {
        //
        Materials.Calcium.getDust(1),
        //
        Materials.GarnetRed.getDust(1),
        //
        Materials.GarnetYellow.getDust(1),
        //
        Materials.Grossular.getDust(1),
        //
        Materials.Manganese.getDust(1),
        //
        Materials.Niobium.getDust(1),
        //
        Materials.Pyrolusite.getDust(1),
        //
        Materials.Spessartine.getDust(1),
        //
        Materials.Tantalite.getDust(1),
        //
        Materials.Tantalum.getDust(1) };

    // Mica Vein
    public static final ItemStack[] Mica_Vein = new ItemStack[] {
        //
        Materials.Caesium.getDust(1),
        //
        Materials.Cassiterite.getDust(1),
        //
        Materials.Kyanite.getDust(1),
        //
        Materials.Mica.getDust(1),
        //
        Materials.Pollucite.getDust(1),
        //
        Materials.Rubidium.getDust(1),
        //
        Materials.Tin.getDust(1),
        //
        WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1) };

    // Molybdenum Vein
    public static final ItemStack[] Molybdenum_Vein = new ItemStack[] {
        //
        Materials.Molybdenite.getDust(1),
        //
        Materials.Molybdenum.getDust(1),
        //
        Materials.Powellite.getDust(1),
        //
        Materials.Wulfenite.getDust(1) };

    // Monazite Vein
    public static final ItemStack[] Monazite_Vein = new ItemStack[] {
        //
        Materials.Bastnasite.getDust(1),
        //
        Materials.Monazite.getDust(1),
        //
        Materials.Neodymium.getDust(1),
        //
        Materials.RareEarth.getDust(1),
        //
        Materials.Thorium.getDust(1),
        //
        Materials.Chalcopyrite.getDust(1),
        //
        Materials.Galena.getDust(1),
        //
        Materials.NetherQuartz.getDust(1),
        //
        Materials.Yttrium.getDust(1),
        // Agardite (Cd) Dust
        getModItem(GTPlusPlus.ID, "itemDustAgarditeCd", 1),
        // Agardite (La) Dust
        getModItem(GTPlusPlus.ID, "itemDustAgarditeLa", 1),
        // Agardite (Nd) Dust
        getModItem(GTPlusPlus.ID, "itemDustAgarditeNd", 1),
        // Alburnite Dust
        getModItem(GTPlusPlus.ID, "itemDustAlburnite", 1),
        // Ancient Granite Dust
        getModItem(GTPlusPlus.ID, "itemDustAncientGranite", 1),
        // Black Metal Dust
        getModItem(GTPlusPlus.ID, "itemDustBlackMetal", 1),
        // Crocoite Dust
        getModItem(GTPlusPlus.ID, "itemDustCrocoite", 1),
        // Cryolite (F) Dust
        getModItem(GTPlusPlus.ID, "itemDustCryoliteF", 1),
        // Demicheleite (Br) Dust
        getModItem(GTPlusPlus.ID, "itemDustDemicheleiteBr", 1),
        // Florencite Dust
        getModItem(GTPlusPlus.ID, "itemDustFlorencite", 1),
        // Fluorcaphite Dust
        getModItem(GTPlusPlus.ID, "itemDustFluorcaphite", 1),
        // Gadolinite (Y) Dust
        getModItem(GTPlusPlus.ID, "itemDustGadoliniteY", 1),
        // Greenockite Dust
        getModItem(GTPlusPlus.ID, "itemDustGreenockite", 1),
        // Lanthanite (Ce) Dust
        getModItem(GTPlusPlus.ID, "itemDustLanthaniteCe", 1),
        // Lanthanite (Nd) Dust
        getModItem(GTPlusPlus.ID, "itemDustLanthaniteNd", 1),
        // Lautarite Dust
        getModItem(GTPlusPlus.ID, "itemDustLautarite", 1),
        // Lepersonnite Dust
        getModItem(GTPlusPlus.ID, "itemDustLepersonnite", 1),
        // Nichromite Dust
        getModItem(GTPlusPlus.ID, "itemDustNichromite", 1),
        // Runite Dust
        getModItem(GTPlusPlus.ID, "itemDustRunite", 1),
        // Samarskite (Y) Dust
        getModItem(GTPlusPlus.ID, "itemDustSamarskiteY", 1),
        // Yttriaite Dust
        getModItem(GTPlusPlus.ID, "itemDustYttriaite", 1),
        // Yttrialite Dust
        getModItem(GTPlusPlus.ID, "itemDustYttrialite", 1),
        // Zircon Dust
        getModItem(GTPlusPlus.ID, "itemDustZircon", 1) };

    // Mytryl Vein
    public static final ItemStack[] Mytryl_Vein = new ItemStack[] {
        //
        Materials.Ceruclase.getDust(1),
        //
        Materials.Jasper.getDust(1),
        //
        Materials.Mytryl.getDust(1),
        //
        Materials.Vulcanite.getDust(1),
        //
        Materials.Zinc.getDust(1),
        //
        WerkstoffMaterialPool.SamariumOreConcentrate.get(OrePrefixes.dust, 1) };

    // Naquadah Vein
    public static final ItemStack[] Naquadah_Vein = new ItemStack[] {
        // Naquadah Oxide Mixture Dust
        getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10054),
        // Enriched-Naquadah Oxide Mixture Dust
        getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10067),
        // Naquadria Oxide Mixture Dust
        getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10072) };

    // Naquadria Vein
    public static final ItemStack[] Naquadria_Vein = new ItemStack[] {
        //
        Materials.Trinium.getDust(1),
        // Naquadah Oxide Mixture Dust
        getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10054),
        // Enriched-Naquadah Oxide Mixture Dust
        getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10067),
        // Naquadria Oxide Mixture Dust
        getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10072) };

    // Nether Quartz Vein
    public static final ItemStack[] Nether_Quartz_Vein = new ItemStack[] {
        //
        Materials.Barite.getDust(1),
        //
        Materials.CertusQuartz.getDust(1),
        //
        Materials.NetherQuartz.getDust(1),
        //
        Materials.Quartzite.getDust(1) };

    // Nether Star Vein
    public static final ItemStack[] Nether_Star_Vein = new ItemStack[] {
        //
        Materials.Almandine.getDust(1),
        //
        Materials.Andradite.getDust(1),
        //
        Materials.GarnetRed.getDust(1),
        //
        Materials.GarnetSand.getDust(1),
        //
        Materials.GarnetYellow.getDust(1),
        //
        Materials.Grossular.getDust(1),
        //
        Materials.NetherStar.getDust(1),
        //
        Materials.Pyrope.getDust(1),
        //
        Materials.Spessartine.getDust(1),
        //
        Materials.Uvarovite.getDust(1) };

    // Neutronium Vein
    public static final ItemStack[] Neutronium_Vein = new ItemStack[] {
        //
        Materials.Adamantium.getDust(1),
        //
        Materials.Almandine.getDust(1),
        //
        Materials.Neutronium.getDust(1),
        //
        Materials.Titanium.getDust(1),
        // Naquadah Oxide Mixture Dust
        getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10054),
        // Enriched-Naquadah Oxide Mixture Dust
        getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10067) };

    // Nickel Vein
    public static final ItemStack[] Nickel_Vein = new ItemStack[] {
        //
        Materials.Cobalt.getDust(1),
        //
        Materials.Cobaltite.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Nickel.getDust(1),
        //
        Materials.Pentlandite.getDust(1),
        //
        Materials.RoastedNickel.getDust(1),
        //
        Materials.Sulfur.getDust(1),
        //
        WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1) };

    // Niobium Vein
    public static final ItemStack[] Niobium_Vein = new ItemStack[] {
        //
        Materials.Gallium.getDust(1),
        //
        Materials.Niobium.getDust(1),
        //
        Materials.Yttrium.getDust(1) };

    // Olenite & Fluor-Buergerite & Chromo-Alumino-Povondraite & Vanadio-Oxy-Dravit Vein
    public static final ItemStack[] Olenite_FluorBuergerite_ChromoAluminoPovondraite_VanadioOxyDravit_Vein = new ItemStack[] {
        //
        Materials.Boron.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.SiliconDioxide.getDust(1),
        //
        Materials.Sodium.getDust(1),
        //
        WerkstoffLoader.ChromoAluminoPovondrait.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.FluorBuergerit.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.Olenit.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.VanadioOxyDravit.get(OrePrefixes.dust, 1) };

    // Olivine Vein
    public static final ItemStack[] Olivine_Vein = new ItemStack[] {
        //
        Materials.Bentonite.getDust(1),
        //
        Materials.Calcium.getDust(1),
        //
        Materials.Glauconite.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Magnesium.getDust(1),
        //
        Materials.Magnetite.getDust(1),
        //
        Materials.Olivine.getDust(1),
        //
        Materials.Pyrope.getDust(1),
        //
        Materials.Sodium.getDust(1),
        //
        WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1) };

    // Oriharukon Vein
    public static final ItemStack[] Oriharukon_Vein = new ItemStack[] {
        //
        Materials.Mirabilite.getDust(1),
        //
        Materials.Oriharukon.getDust(1),
        //
        Materials.Tanzanite.getDust(1),
        //
        Materials.Vyroxeres.getDust(1) };

    // Osmium Vein
    public static final ItemStack[] Osmium_Vein = new ItemStack[] {
        //
        Materials.Cobalt.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Nickel.getDust(1),
        //
        WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.IrOsLeachResidue.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1) };

    // Palladium Vein
    public static final ItemStack[] Palladium_Vein = new ItemStack[] {
        //
        Materials.Chrome.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Magnesium.getDust(1),
        //
        Materials.Nickel.getDust(1),
        //
        WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.PDMetallicPowder.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),
        // Sheldonite Dust
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2828) };

    // Perditio & Ordo Vein
    public static final ItemStack[] Perditio_Ordo_Vein = new ItemStack[] {
        //
        Materials.Amber.getDust(1),
        //
        Materials.Cinnabar.getDust(1),
        //
        Materials.Glowstone.getDust(1),
        //
        Materials.Redstone.getDust(1),
        //
        Materials.Sulfur.getDust(1),
        // Perditio Crystal Powder
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2544),
        // Ordo Crystal Powder
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2545) };

    // Pitchblende Vein
    public static final ItemStack[] Pitchblende_Vein = new ItemStack[] {
        //
        Materials.Lead.getDust(1),
        //
        Materials.Pitchblende.getDust(1),
        //
        Materials.Thorium.getDust(1),
        //
        Materials.Uraninite.getDust(1),
        //
        Materials.Uranium.getDust(1),
        //
        Materials.Uranium235.getDust(1),
        // Radium 226 Dust
        getModItem(GTPlusPlus.ID, "dustRadium226", 1L) };

    // Platinum Vein
    public static final ItemStack[] Platinum_Vein = new ItemStack[] {
        //
        Materials.Nickel.getDust(1),
        //
        WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.IrOsLeachResidue.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.PDMetallicPowder.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),
        // Sheldonite Dust
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2828) };

    // Plutonium 239 Vein
    public static final ItemStack[] Plutonium239_Vein = new ItemStack[] {
        //
        Materials.Lead.getDust(1),
        //
        Materials.Plutonium.getDust(1),
        //
        Materials.Thorium.getDust(1),
        //
        Materials.Uranium.getDust(1),
        //
        Materials.Uranium235.getDust(1),
        // Radium 226 Dust
        getModItem(GTPlusPlus.ID, "dustRadium226", 1L) };

    // Prasiolite & Hedenbergite Vein
    public static final ItemStack[] Prasiolite_Hedenbergite_Vein = new ItemStack[] {
        //
        Materials.Amethyst.getDust(1),
        //
        Materials.Calcium.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Magnesium.getDust(1),
        //
        Materials.Olivine.getDust(1),
        //
        Materials.Pyrope.getDust(1),
        //
        Materials.SiliconDioxide.getDust(1),
        //
        WerkstoffLoader.Hedenbergit.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.Prasiolite.get(OrePrefixes.dust, 1) };

    // Pyrolusite Vein
    public static final ItemStack[] Pyrolusite_Vein = new ItemStack[] {
        //
        Materials.Apatite.getDust(1),
        //
        Materials.Calcite.getDust(1),
        //
        Materials.Manganese.getDust(1),
        //
        Materials.Niobium.getDust(1),
        //
        Materials.Phosphate.getDust(1),
        //
        Materials.Pyrochlore.getDust(1),
        //
        Materials.Pyrolusite.getDust(1),
        //
        Materials.Tantalite.getDust(1),
        //
        Materials.Tantalum.getDust(1),
        //
        Materials.TricalciumPhosphate.getDust(1) };

    // Quantium Vein
    public static final ItemStack[] Quantium_Vein = new ItemStack[] {
        //
        Materials.Amethyst.getDust(1),
        //
        Materials.Ardite.getDust(1),
        //
        Materials.Quantium.getDust(1),
        //
        Materials.Rutile.getDust(1) };

    // Quartz Vein
    public static final ItemStack[] Quartz_Vein = new ItemStack[] {
        //
        Materials.Barite.getDust(1),
        //
        Materials.CertusQuartz.getDust(1),
        //
        Materials.Quartzite.getDust(1) };

    // Quartzite Vein
    public static final ItemStack[] Quartzite_Vein = new ItemStack[] {
        //
        Materials.Barite.getDust(1),
        //
        Materials.CertusQuartz.getDust(1),
        //
        Materials.Quartzite.getDust(1) };

    // Rare Earth Vein
    public static final ItemStack[] Rare_Earth_Vein = new ItemStack[] {
        //
        Materials.Cadmium.getDust(1),
        //
        Materials.Caesium.getDust(1),
        //
        Materials.Lanthanum.getDust(1),
        //
        WerkstoffMaterialPool.CeriumRichMixture.get(OrePrefixes.dust, 1) };

    // Raw Tengam Vein
    public static final ItemStack[] Raw_Tengam_Vein = new ItemStack[] {
        //
        Materials.Diamond.getDust(1),
        //
        Materials.Electrotine.getDust(1),
        //
        Materials.Electrum.getDust(1),
        //
        Materials.NeodymiumMagnetic.getDust(1),
        //
        Materials.Redstone.getDust(1),
        //
        Materials.SamariumMagnetic.getDust(1),
        //
        Materials.TengamRaw.getDust(1),
        //
        WerkstoffMaterialPool.SamariumOreConcentrate.get(OrePrefixes.dust, 1) };

    // Red Garnet Vein
    public static final ItemStack[] Red_Garnet_Vein = new ItemStack[] {
        //
        Materials.Almandine.getDust(1),
        //
        Materials.Andradite.getDust(1),
        //
        Materials.Asbestos.getDust(1),
        //
        Materials.Chrysotile.getDust(1),
        //
        Materials.GarnetRed.getDust(1),
        //
        Materials.GarnetYellow.getDust(1),
        //
        Materials.Grossular.getDust(1),
        //
        Materials.Magnesium.getDust(1),
        //
        Materials.Pyrope.getDust(1),
        //
        Materials.Realgar.getDust(1),
        //
        Materials.SiliconDioxide.getDust(1),
        //
        Materials.Spessartine.getDust(1),
        //
        Materials.Uvarovite.getDust(1) };

    // Redstone Vein
    public static final ItemStack[] Redstone_Vein = new ItemStack[] {
        //
        Materials.Chrome.getDust(1),
        //
        Materials.Cinnabar.getDust(1),
        //
        Materials.GarnetRed.getDust(1),
        //
        Materials.Glowstone.getDust(1),
        //
        Materials.RareEarth.getDust(1),
        //
        Materials.Redstone.getDust(1),
        //
        Materials.Ruby.getDust(1),
        //
        Materials.Sulfur.getDust(1),
        //
        Materials.Chalcopyrite.getDust(1),
        //
        Materials.Galena.getDust(1),
        //
        Materials.NetherQuartz.getDust(1),
        //
        Materials.Yttrium.getDust(1),
        // Agardite (Cd) Dust
        getModItem(GTPlusPlus.ID, "itemDustAgarditeCd", 1),
        // Agardite (La) Dust
        getModItem(GTPlusPlus.ID, "itemDustAgarditeLa", 1),
        // Agardite (Nd) Dust
        getModItem(GTPlusPlus.ID, "itemDustAgarditeNd", 1),
        // Alburnite Dust
        getModItem(GTPlusPlus.ID, "itemDustAlburnite", 1),
        // Ancient Granite Dust
        getModItem(GTPlusPlus.ID, "itemDustAncientGranite", 1),
        // Black Metal Dust
        getModItem(GTPlusPlus.ID, "itemDustBlackMetal", 1),
        // Crocoite Dust
        getModItem(GTPlusPlus.ID, "itemDustCrocoite", 1),
        // Cryolite (F) Dust
        getModItem(GTPlusPlus.ID, "itemDustCryoliteF", 1),
        // Demicheleite (Br) Dust
        getModItem(GTPlusPlus.ID, "itemDustDemicheleiteBr", 1),
        // Florencite Dust
        getModItem(GTPlusPlus.ID, "itemDustFlorencite", 1),
        // Fluorcaphite Dust
        getModItem(GTPlusPlus.ID, "itemDustFluorcaphite", 1),
        // Gadolinite (Y) Dust
        getModItem(GTPlusPlus.ID, "itemDustGadoliniteY", 1),
        // Greenockite Dust
        getModItem(GTPlusPlus.ID, "itemDustGreenockite", 1),
        // Lanthanite (Ce) Dust
        getModItem(GTPlusPlus.ID, "itemDustLanthaniteCe", 1),
        // Lanthanite (Nd) Dust
        getModItem(GTPlusPlus.ID, "itemDustLanthaniteNd", 1),
        // Lautarite Dust
        getModItem(GTPlusPlus.ID, "itemDustLautarite", 1),
        // Lepersonnite Dust
        getModItem(GTPlusPlus.ID, "itemDustLepersonnite", 1),
        // Nichromite Dust
        getModItem(GTPlusPlus.ID, "itemDustNichromite", 1),
        // Runite Dust
        getModItem(GTPlusPlus.ID, "itemDustRunite", 1),
        // Samarskite (Y) Dust
        getModItem(GTPlusPlus.ID, "itemDustSamarskiteY", 1),
        // Yttriaite Dust
        getModItem(GTPlusPlus.ID, "itemDustYttriaite", 1),
        // Yttrialite Dust
        getModItem(GTPlusPlus.ID, "itemDustYttrialite", 1),
        // Zircon Dust
        getModItem(GTPlusPlus.ID, "itemDustZircon", 1) };

    // Rutile Vein
    public static final ItemStack[] Rutile_Vein = new ItemStack[] {
        //
        Materials.Almandine.getDust(1),
        //
        Materials.Bauxite.getDust(1),
        //
        Materials.Gallium.getDust(1),
        //
        Materials.Grossular.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.MeteoricIron.getDust(1),
        //
        Materials.Nickel.getDust(1),
        //
        Materials.Rutile.getDust(1),
        //
        Materials.Titanium.getDust(1),
        //
        WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1) };

    // Salt Vein
    public static final ItemStack[] Salt_Vein = new ItemStack[] {
        //
        Materials.Borax.getDust(1),
        //
        Materials.Caesium.getDust(1),
        //
        Materials.Lepidolite.getDust(1),
        //
        Materials.Lithium.getDust(1),
        //
        Materials.RockSalt.getDust(1),
        //
        Materials.Salt.getDust(1),
        //
        Materials.Spodumene.getDust(1),
        //
        WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1) };

    // Samarium Vein
    public static final ItemStack[] Samarium_Vein = new ItemStack[] {
        //
        Materials.Monazite.getDust(1),
        //
        Materials.Neodymium.getDust(1),
        //
        Materials.RareEarth.getDust(1),
        //
        Materials.Tartarite.getDust(1),
        //
        Materials.Chalcopyrite.getDust(1),
        //
        Materials.Galena.getDust(1),
        //
        Materials.NetherQuartz.getDust(1),
        //
        Materials.Yttrium.getDust(1),
        //
        WerkstoffMaterialPool.SamariumOreConcentrate.get(OrePrefixes.dust, 1),
        // Agardite (Cd) Dust
        getModItem(GTPlusPlus.ID, "itemDustAgarditeCd", 1),
        // Agardite (La) Dust
        getModItem(GTPlusPlus.ID, "itemDustAgarditeLa", 1),
        // Agardite (Nd) Dust
        getModItem(GTPlusPlus.ID, "itemDustAgarditeNd", 1),
        // Alburnite Dust
        getModItem(GTPlusPlus.ID, "itemDustAlburnite", 1),
        // Ancient Granite Dust
        getModItem(GTPlusPlus.ID, "itemDustAncientGranite", 1),
        // Black Metal Dust
        getModItem(GTPlusPlus.ID, "itemDustBlackMetal", 1),
        // Crocoite Dust
        getModItem(GTPlusPlus.ID, "itemDustCrocoite", 1),
        // Cryolite (F) Dust
        getModItem(GTPlusPlus.ID, "itemDustCryoliteF", 1),
        // Demicheleite (Br) Dust
        getModItem(GTPlusPlus.ID, "itemDustDemicheleiteBr", 1),
        // Florencite Dust
        getModItem(GTPlusPlus.ID, "itemDustFlorencite", 1),
        // Fluorcaphite Dust
        getModItem(GTPlusPlus.ID, "itemDustFluorcaphite", 1),
        // Gadolinite (Y) Dust
        getModItem(GTPlusPlus.ID, "itemDustGadoliniteY", 1),
        // Greenockite Dust
        getModItem(GTPlusPlus.ID, "itemDustGreenockite", 1),
        // Lanthanite (Ce) Dust
        getModItem(GTPlusPlus.ID, "itemDustLanthaniteCe", 1),
        // Lanthanite (Nd) Dust
        getModItem(GTPlusPlus.ID, "itemDustLanthaniteNd", 1),
        // Lautarite Dust
        getModItem(GTPlusPlus.ID, "itemDustLautarite", 1),
        // Lepersonnite Dust
        getModItem(GTPlusPlus.ID, "itemDustLepersonnite", 1),
        // Nichromite Dust
        getModItem(GTPlusPlus.ID, "itemDustNichromite", 1),
        // Runite Dust
        getModItem(GTPlusPlus.ID, "itemDustRunite", 1),
        // Samarskite (Y) Dust
        getModItem(GTPlusPlus.ID, "itemDustSamarskiteY", 1),
        // Yttriaite Dust
        getModItem(GTPlusPlus.ID, "itemDustYttriaite", 1),
        // Yttrialite Dust
        getModItem(GTPlusPlus.ID, "itemDustYttrialite", 1),
        // Zircon Dust
        getModItem(GTPlusPlus.ID, "itemDustZircon", 1) };

    // Sapphire Vein
    public static final ItemStack[] Sapphire_Vein = new ItemStack[] {
        //
        Materials.Almandine.getDust(1),
        //
        Materials.GarnetRed.getDust(1),
        //
        Materials.GreenSapphire.getDust(1),
        //
        Materials.Magnesium.getDust(1),
        //
        Materials.Pyrope.getDust(1),
        //
        Materials.Sapphire.getDust(1),
        //
        WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1) };

    // Soapstone Vein
    public static final ItemStack[] Soapstone_Vein = new ItemStack[] {
        //
        Materials.Cobalt.getDust(1),
        //
        Materials.Glauconite.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Nickel.getDust(1),
        //
        Materials.Pentlandite.getDust(1),
        //
        Materials.Soapstone.getDust(1),
        //
        Materials.Sodium.getDust(1),
        //
        Materials.Talc.getDust(1) };

    // Sulfur Vein
    public static final ItemStack[] Sulfur_Vein = new ItemStack[] {
        //
        Materials.Cadmium.getDust(1),
        //
        Materials.Gallium.getDust(1),
        //
        Materials.GarnetYellow.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Pyrite.getDust(1),
        //
        Materials.Sphalerite.getDust(1),
        //
        Materials.Sulfur.getDust(1),
        //
        Materials.TricalciumPhosphate.getDust(1) };

    // Terra & Aer Vein
    public static final ItemStack[] Terra_Aer_Vein = new ItemStack[] {
        //
        Materials.Amber.getDust(1),
        //
        Materials.Cinnabar.getDust(1),
        //
        Materials.Glowstone.getDust(1),
        //
        Materials.Redstone.getDust(1),
        //
        Materials.Sulfur.getDust(1),
        // Aer Crystal Powder
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2540),
        // Terra Crystal Powder
        getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2542) };

    // Tetrahedrite Vein
    public static final ItemStack[] Tetrahedrite_Vein = new ItemStack[] {
        //
        Materials.Antimony.getDust(1),
        //
        Materials.Cobalt.getDust(1),
        //
        Materials.Copper.getDust(1),
        //
        Materials.Gold.getDust(1),
        //
        Materials.Nickel.getDust(1),
        //
        Materials.Stibnite.getDust(1),
        //
        Materials.Tetrahedrite.getDust(1),
        //
        Materials.Zinc.getDust(1) };

    // Thorianite Vein
    public static final ItemStack[] Thorianite_Vein = new ItemStack[] {
        //
        Materials.Caesium.getDust(1),
        //
        Materials.Lepidolite.getDust(1),
        //
        Materials.Spodumene.getDust(1),
        //
        Materials.Lithium.getDust(1),
        //
        Materials.Thorium.getDust(1),
        //
        Materials.Uraninite.getDust(1),
        //
        Materials.Uranium.getDust(1),
        //
        Materials.Uranium235.getDust(1),
        //
        WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.Thorianit.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.Thorium232.get(OrePrefixes.dust, 1),
        // Radium 226 Dust
        getModItem(GTPlusPlus.ID, "dustRadium226", 1L) };

    // Thorium Vein
    public static final ItemStack[] Thorium_Vein = new ItemStack[] {
        //
        Materials.Lead.getDust(1),
        //
        Materials.Plutonium241.getDust(1),
        //
        Materials.Thorium.getDust(1),
        //
        Materials.Uranium.getDust(1),
        //
        Materials.Uranium235.getDust(1),
        // Radium 226 Dust
        getModItem(GTPlusPlus.ID, "dustRadium226", 1L) };

    // Tiberium Vein
    public static final ItemStack[] Tiberium_Vein = new ItemStack[] {
        //
        WerkstoffLoader.Tiberium.get(OrePrefixes.dust, 1),
        // Naquadah Oxide Mixture Dust
        getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10054),
        // Enriched-Naquadah Oxide Mixture Dust
        getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10067),
        // Naquadria Oxide Mixture Dust
        getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10072) };

    // Tin Vein
    public static final ItemStack[] Tin_Vein = new ItemStack[] {
        //
        Materials.Asbestos.getDust(1),
        //
        Materials.BandedIron.getDust(1),
        //
        Materials.CassiteriteSand.getDust(1),
        //
        Materials.Diatomite.getDust(1),
        //
        Materials.GarnetRed.getDust(1),
        //
        Materials.GarnetSand.getDust(1),
        //
        Materials.GarnetYellow.getDust(1),
        //
        Materials.Magnesium.getDust(1),
        //
        Materials.Sapphire.getDust(1),
        //
        Materials.SiliconDioxide.getDust(1),
        //
        Materials.Tin.getDust(1) };

    // Tungstate Vein
    public static final ItemStack[] Tungstate_Vein = new ItemStack[] {
        //
        Materials.Calcium.getDust(1),
        //
        Materials.Lithium.getDust(1),
        //
        Materials.Manganese.getDust(1),
        //
        Materials.Molybdenum.getDust(1),
        //
        Materials.Scheelite.getDust(1),
        //
        Materials.Tungstate.getDust(1) };

    // Tungsten Vein
    public static final ItemStack[] Tungsten_Vein = new ItemStack[] {
        //
        Materials.DeepIron.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Manganese.getDust(1),
        //
        Materials.Molybdenum.getDust(1),
        //
        Materials.ShadowIron.getDust(1),
        //
        Materials.Silicon.getDust(1),
        //
        Materials.SiliconDioxide.getDust(1),
        //
        Materials.Trinium.getDust(1),
        //
        Materials.Tungsten.getDust(1) };

    // Uranium 238 Vein
    public static final ItemStack[] Uranium238_Vein = new ItemStack[] {
        //
        Materials.Lead.getDust(1),
        //
        Materials.Thorium.getDust(1),
        //
        Materials.Uraninite.getDust(1),
        //
        Materials.Uranium.getDust(1),
        //
        Materials.Uranium235.getDust(1),
        // Radium 226 Dust
        getModItem(GTPlusPlus.ID, "dustRadium226", 1L) };

    // Vanadium Vein
    public static final ItemStack[] Vanadium_Vein = new ItemStack[] {
        //
        Materials.Chrome.getDust(1),
        //
        Materials.Copper.getDust(1),
        //
        Materials.Gold.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Magnesium.getDust(1),
        //
        Materials.Magnetite.getDust(1),
        //
        Materials.Nickel.getDust(1),
        //
        Materials.Vanadium.getDust(1) };

    // Vermiculite Vein
    public static final ItemStack[] Vermiculite_Vein = new ItemStack[] { Materials.Alunite.getDust(1),
        //
        Materials.Cadmium.getDust(1),
        //
        Materials.Cassiterite.getDust(1),
        //
        Materials.Chalcopyrite.getDust(1),
        //
        Materials.Cobalt.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Magnesium.getDust(1),
        //
        Materials.Pyrite.getDust(1),
        //
        Materials.Tin.getDust(1),
        //
        Materials.Vermiculite.getDust(1),
        //
        WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),
        //
        WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1) };
}
