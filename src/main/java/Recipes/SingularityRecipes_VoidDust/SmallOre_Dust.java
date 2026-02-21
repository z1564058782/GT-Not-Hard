package Recipes.SingularityRecipes_VoidDust;

import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.NewHorizonsCoreMod;
import static gregtech.api.util.GTModHandler.getModItem;

import net.minecraft.item.ItemStack;

import bartworks.system.material.WerkstoffLoader;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gtnhlanth.common.register.WerkstoffMaterialPool;

public class SmallOre_Dust {

    // Amber Ore
    public static final ItemStack[] Amber_SmallOre = new ItemStack[] {
        //
        Materials.Amber.getDust(1) };

    // Amethyst Ore
    public static final ItemStack[] Amethyst_SmallOre = new ItemStack[] {
        //
        Materials.Amethyst.getDust(1) };

    // Awakened Draconium Ore
    public static final ItemStack[] Awakened_Draconium_SmallOre = new ItemStack[] {
        //
        Materials.DraconiumAwakened.getDust(1) };

    // Bedrockium Ore
    public static final ItemStack[] Bedrockium_SmallOre = new ItemStack[] {
        //
        Materials.Bedrockium.getDust(1) };

    // Bismuth Ore
    public static final ItemStack[] Bismuth_SmallOre = new ItemStack[] {
        //
        Materials.Bismuth.getDust(1) };

    // Black Plutonium Ore
    public static final ItemStack[] Black_Plutonium_SmallOre = new ItemStack[] {
        //
        Materials.BlackPlutonium.getDust(1) };

    // Blue Topaz Ore
    public static final ItemStack[] Blue_Topaz_SmallOre = new ItemStack[] {
        //
        Materials.BlueTopaz.getDust(1),
        //
        Materials.Topaz.getDust(1) };

    // Certus Quartz Ore
    public static final ItemStack[] Certus_Quartz_SmallOre = new ItemStack[] {
        //
        Materials.Barite.getDust(1),
        //
        Materials.CertusQuartz.getDust(1),
        //
        Materials.Quartzite.getDust(1) };

    // Charged Certus Quartz Ore
    public static final ItemStack[] Charged_Certus_Quartz_SmallOre = new ItemStack[] {
        //
        Materials.Barite.getDust(1),
        //
        Materials.CertusQuartz.getDust(1),
        //
        Materials.Quartzite.getDust(1),
        // Charged Certus Quartz Dust
        getModItem(NewHorizonsCoreMod.ID, "item.ChargedCertusQuartzDust", 1L) };

    // Chromite Ore
    public static final ItemStack[] Chromite_SmallOre = new ItemStack[] {
        //
        Materials.Chromite.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Magnesium.getDust(1) };

    // Coal Ore
    public static final ItemStack[] Coal_SmallOre = new ItemStack[] {
        //
        Materials.Coal.getDust(1),
        //
        Materials.Lignite.getDust(1),
        //
        Materials.Thorium.getDust(1) };

    // Copper Ore
    public static final ItemStack[] Copper_SmallOre = new ItemStack[] {
        //
        Materials.Copper.getDust(1),
        //
        Materials.Cobalt.getDust(1),
        //
        Materials.Nickel.getDust(1),
        //
        Materials.Gold.getDust(1) };

    // Deep Iron Ore
    public static final ItemStack[] Deep_Iron_SmallOre = new ItemStack[] {
        //
        Materials.DeepIron.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        Materials.Trinium.getDust(1) };

    // Desh Ore
    public static final ItemStack[] Desh_SmallOre = new ItemStack[] {
        //
        Materials.Desh.getDust(1) };

    // Diamond Ore
    public static final ItemStack[] Diamond_SmallOre = new ItemStack[] {
        //
        Materials.Diamond.getDust(1),
        //
        Materials.Graphite.getDust(1) };

    // Draconium Ore
    public static final ItemStack[] Draconium_SmallOre = new ItemStack[] {
        //
        Materials.Draconium.getDust(1) };

    // Emerald Ore
    public static final ItemStack[] Emerald_SmallOre = new ItemStack[] {
        //
        Materials.Beryllium.getDust(1),
        //
        Materials.Emerald.getDust(1),
        //
        WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1) };

    // Firestone Ore
    public static final ItemStack[] Firestone_SmallOre = new ItemStack[] {
        //
        Materials.Firestone.getDust(1) };

    // Green Sapphire Ore
    public static final ItemStack[] Green_Sapphire_SmallOre = new ItemStack[] {
        //
        Materials.GreenSapphire.getDust(1),
        //
        Materials.Sapphire.getDust(1),
        //
        WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1) };

    // Gold Ore
    public static final ItemStack[] Gold_SmallOre = new ItemStack[] {
        //
        Materials.Copper.getDust(1),
        //
        Materials.Gold.getDust(1),
        //
        Materials.Nickel.getDust(1) };

    // Infinity Catalyst Ore
    public static final ItemStack[] Infinity_Catalyst_SmallOre = new ItemStack[] {
        //
        Materials.InfinityCatalyst.getDust(1) };

    // Iron Ore
    public static final ItemStack[] Iron_SmallOre = new ItemStack[] {
        //
        Materials.Iron.getDust(1),
        //
        Materials.Nickel.getDust(1),
        //
        Materials.Tin.getDust(1) };

    // Jade Ore
    public static final ItemStack[] Jade_SmallOre = new ItemStack[] {
        //
        Materials.Jade.getDust(1) };

    // Jasper Ore
    public static final ItemStack[] Jasper_SmallOre = new ItemStack[] {
        //
        Materials.Jasper.getDust(1) };

    // Lapis Ore
    public static final ItemStack[] Lapis_SmallOre = new ItemStack[] {
        //
        Materials.Lapis.getDust(1),
        //
        Materials.Lazurite.getDust(1),
        //
        Materials.Pyrite.getDust(1),
        //
        Materials.Sodalite.getDust(1) };

    // Lead Ore
    public static final ItemStack[] Lead_SmallOre = new ItemStack[] {
        //
        Materials.Lead.getDust(1),
        //
        Materials.Silver.getDust(1),
        //
        Materials.Sulfur.getDust(1) };

    // Ledox Ore
    public static final ItemStack[] Ledox_SmallOre = new ItemStack[] {
        //
        Materials.Ledox.getDust(1) };

    // Meteoric Iron Ore
    public static final ItemStack[] Meteoric_Iron_SmallOre = new ItemStack[] {
        //
        Materials.Iron.getDust(1),
        //
        Materials.MeteoricIron.getDust(1),
        //
        Materials.Nickel.getDust(1) };

    // Mytryl Ore
    public static final ItemStack[] Mytryl_SmallOre = new ItemStack[] {
        //
        Materials.Mytryl.getDust(1),
        //
        Materials.Zinc.getDust(1),
        //
        WerkstoffMaterialPool.SamariumOreConcentrate.get(OrePrefixes.dust, 1) };

    // Naquadah Ore
    public static final ItemStack[] Naquadah_SmallOre = new ItemStack[] {
        // Naquadah Oxide Mixture Dust
        getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10054),
        // Enriched-Naquadah Oxide Mixture Dust
        getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10067) };

    // Nether Quartz Ore
    public static final ItemStack[] Nether_Quartz_SmallOre = new ItemStack[] {
        //
        Materials.NetherQuartz.getDust(1) };

    // Neutronium Ore
    public static final ItemStack[] Neutronium_SmallOre = new ItemStack[] {
        //
        Materials.Neutronium.getDust(1) };

    // Nickel Ore
    public static final ItemStack[] Nickel_SmallOre = new ItemStack[] {
        //
        Materials.Cobalt.getDust(1),
        //
        Materials.Nickel.getDust(1),
        //
        Materials.Iron.getDust(1),
        //
        WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1) };

    // Olivine Ore
    public static final ItemStack[] Olivine_SmallOre = new ItemStack[] {
        //
        Materials.Magnesium.getDust(1),
        //
        Materials.Olivine.getDust(1),
        //
        Materials.Pyrope.getDust(1) };

    // Opal Ore
    public static final ItemStack[] Opal_SmallOre = new ItemStack[] {
        //
        Materials.Opal.getDust(1),
        //
        Materials.Tanzanite.getDust(1) };

    // Oriharukon Ore
    public static final ItemStack[] Oriharukon_SmallOre = new ItemStack[] {
        //
        Materials.Oriharukon.getDust(1) };

    // Quantium Ore
    public static final ItemStack[] Quantium_SmallOre = new ItemStack[] {
        //
        Materials.Quantium.getDust(1) };

    // Realgar Ore
    public static final ItemStack[] Realgar_SmallOre = new ItemStack[] {
        //
        Materials.Realgar.getDust(1) };

    // Redstone Ore
    public static final ItemStack[] Redstone_SmallOre = new ItemStack[] {
        //
        Materials.Cinnabar.getDust(1),
        //
        Materials.Glowstone.getDust(1),
        //
        Materials.RareEarth.getDust(1),
        //
        Materials.Redstone.getDust(1),
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

    // Red Garnet Ore
    public static final ItemStack[] Red_Garnet_SmallOre = new ItemStack[] {
        //
        Materials.Almandine.getDust(1),
        //
        Materials.GarnetRed.getDust(1),
        //
        Materials.Pyrope.getDust(1),
        //
        Materials.Spessartine.getDust(1) };

    // Ruby Ore
    public static final ItemStack[] Ruby_SmallOre = new ItemStack[] {
        //
        Materials.Chrome.getDust(1),
        //
        Materials.Ruby.getDust(1),
        //
        Materials.GarnetRed.getDust(1) };

    // Saltpeter Ore
    public static final ItemStack[] Saltpeter_SmallOre = new ItemStack[] {
        //
        Materials.Saltpeter.getDust(1) };

    // Sapphire Ore
    public static final ItemStack[] Sapphire_SmallOre = new ItemStack[] {
        //
        Materials.GreenSapphire.getDust(1),
        //
        Materials.Sapphire.getDust(1),
        //
        WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1) };

    // Silver Ore
    public static final ItemStack[] Silver_SmallOre = new ItemStack[] {
        //
        Materials.Lead.getDust(1),
        //
        Materials.Silver.getDust(1),
        //
        Materials.Sulfur.getDust(1) };

    // Spinel Ore
    public static final ItemStack[] Spinel_SmallOre = new ItemStack[] {
        //
        Materials.Jasper.getDust(1) };

    // Sulfur Ore
    public static final ItemStack[] Sulfur_SmallOre = new ItemStack[] {
        //
        Materials.Sulfur.getDust(1) };

    // Tanzanite Ore
    public static final ItemStack[] Tanzanite_SmallOre = new ItemStack[] {
        //
        Materials.Opal.getDust(1),
        //
        Materials.Tanzanite.getDust(1) };

    // Tin Ore
    public static final ItemStack[] Tin_SmallOre = new ItemStack[] {
        //
        Materials.Iron.getDust(1),
        //
        Materials.Tin.getDust(1),
        //
        Materials.Zinc.getDust(1) };

    // Titanium Ore
    public static final ItemStack[] Titanium_SmallOre = new ItemStack[] {
        //
        Materials.Almandine.getDust(1),
        //
        Materials.Titanium.getDust(1) };

    // Topaz Ore
    public static final ItemStack[] Topaz_SmallOre = new ItemStack[] {
        //
        Materials.BlueTopaz.getDust(1),
        //
        Materials.Topaz.getDust(1) };

    // Tungstate Ore
    public static final ItemStack[] Tungstate_SmallOre = new ItemStack[] {
        //
        Materials.Lithium.getDust(1),
        //
        Materials.Manganese.getDust(1),
        //
        Materials.Silver.getDust(1),
        //
        Materials.Tungstate.getDust(1) };

    // Tungsten Ore
    public static final ItemStack[] Tungsten_SmallOre = new ItemStack[] {
        //
        Materials.Manganese.getDust(1),
        //
        Materials.Molybdenum.getDust(1),
        //
        Materials.Tungsten.getDust(1) };

    // Yellow Garnet Ore
    public static final ItemStack[] Yellow_Garnet_SmallOre = new ItemStack[] {
        //
        Materials.Andradite.getDust(1),
        //
        Materials.GarnetYellow.getDust(1),
        //
        Materials.Grossular.getDust(1),
        //
        Materials.Uvarovite.getDust(1) };

    // Zinc Ore
    public static final ItemStack[] Zinc_SmallOre = new ItemStack[] {
        //
        Materials.Gallium.getDust(1),
        //
        Materials.Tin.getDust(1),
        //
        Materials.Zinc.getDust(1) };
}
