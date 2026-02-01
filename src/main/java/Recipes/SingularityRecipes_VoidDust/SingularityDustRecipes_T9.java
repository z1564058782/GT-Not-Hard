package Recipes.SingularityRecipes_VoidDust;

import static gregtech.api.enums.Mods.BartWorks;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.NewHorizonsCoreMod;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

import bartworks.system.material.WerkstoffLoader;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gtnhlanth.common.register.WerkstoffMaterialPool;

public class SingularityDustRecipes_T9 {

    public static final Map<String, ItemStack[]> VoidDustRecipes_T9 = new HashMap<>();

    public static void addVoidDustRecipes_T9() {
        // T9 - Anubis - An
        VoidDustRecipes_T9.put(
            "An",
            new ItemStack[] {
                // Sulfur Vein
                Materials.Cadmium.getDust(1), Materials.Gallium.getDust(1), Materials.GarnetYellow.getDust(1),
                Materials.Iron.getDust(1), Materials.Pyrite.getDust(1), Materials.Sphalerite.getDust(1),
                Materials.Sulfur.getDust(1), Materials.TricalciumPhosphate.getDust(1),

                // Infinity Catalyst Vein
                Materials.Adamantium.getDust(1), Materials.Bedrockium.getDust(1), Materials.InfinityCatalyst.getDust(1),
                Materials.Neutronium.getDust(1),

                // Olivine Vein
                Materials.Bentonite.getDust(1), Materials.Calcium.getDust(1), Materials.Glauconite.getDust(1),
                Materials.Iron.getDust(1), Materials.Magnesium.getDust(1), Materials.Magnetite.getDust(1),
                Materials.Olivine.getDust(1), Materials.Pyrope.getDust(1), Materials.Sodium.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Desh Vein
                Materials.Calcium.getDust(1), Materials.Desh.getDust(1), Materials.Lithium.getDust(1),
                Materials.Manganese.getDust(1), Materials.Molybdenum.getDust(1), Materials.Scheelite.getDust(1),
                Materials.Silver.getDust(1), Materials.Tungstate.getDust(1),

                // Mica Vein
                Materials.Caesium.getDust(1), Materials.Cassiterite.getDust(1), Materials.Kyanite.getDust(1),
                Materials.Mica.getDust(1), Materials.Pollucite.getDust(1), Materials.Rubidium.getDust(1),
                Materials.Tin.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1), WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),

                // Cryolite Vein
                Materials.Cryolite.getDust(1), Materials.Galena.getDust(1), Materials.Lead.getDust(1),
                Materials.Silver.getDust(1), Materials.Sodium.getDust(1), Materials.Sulfur.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Dolomite Vein
                Materials.Andradite.getDust(1), Materials.Dolomite.getDust(1), Materials.GarnetYellow.getDust(1),
                Materials.Iron.getDust(1), Materials.Trona.getDust(1), Materials.Wollastonite.getDust(1),

                // Callisto Ice Vein
                Materials.CallistoIce.getDust(1), Materials.Topaz.getDust(1), Materials.BlueTopaz.getDust(1),
                Materials.Alduorite.getDust(1),

                // Soapstone Vein
                Materials.Cobalt.getDust(1), Materials.Glauconite.getDust(1), Materials.Iron.getDust(1),
                Materials.Nickel.getDust(1), Materials.Pentlandite.getDust(1), Materials.Soapstone.getDust(1),
                Materials.Sodium.getDust(1), Materials.Talc.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Mytryl Vein
                Materials.Ceruclase.getDust(1), Materials.Jasper.getDust(1), Materials.Mytryl.getDust(1),
                Materials.Vulcanite.getDust(1), Materials.Zinc.getDust(1),

                WerkstoffMaterialPool.SamariumOreConcentrate.get(OrePrefixes.dust, 1),

                // Rutile Vein
                Materials.Almandine.getDust(1), Materials.Bauxite.getDust(1), Materials.Gallium.getDust(1),
                Materials.Grossular.getDust(1), Materials.Iron.getDust(1), Materials.MeteoricIron.getDust(1),
                Materials.Nickel.getDust(1), Materials.Rutile.getDust(1), Materials.Titanium.getDust(1),

                WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1),

                // Basaltic Mineral Sand Vein
                Materials.Basalt.getDust(1), Materials.FullersEarth.getDust(1), Materials.GraniteBlack.getDust(1),
                Materials.Gypsum.getDust(1), Materials.Magnesium.getDust(1), Materials.Magnetite.getDust(1),
                Materials.SiliconDioxide.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Small Ore Stats
                // Infinity Catalyst Ore
                Materials.InfinityCatalyst.getDust(1) });

        // T9 - Horus - Ho
        VoidDustRecipes_T9.put(
            "Ho",
            new ItemStack[] {
                // Magnesite Vein
                Materials.Magnesite.getDust(1), Materials.Magnesium.getDust(1), Materials.Opal.getDust(1),
                Materials.RoastedIron.getDust(1), Materials.Sulfur.getDust(1), Materials.Tanzanite.getDust(1),

                // Certus Quartz Vein
                Materials.Barite.getDust(1), Materials.CertusQuartz.getDust(1), Materials.Quartzite.getDust(1),
                Materials.QuartzSand.getDust(1),

                getModItem(NewHorizonsCoreMod.ID, "item.ChargedCertusQuartzDust", 1L), // Charged Certus Quartz Dust

                // Quartz Vein
                Materials.Barite.getDust(1), Materials.CertusQuartz.getDust(1), Materials.Quartzite.getDust(1),

                // Draconium Vein
                Materials.Diamond.getDust(1), Materials.Draconium.getDust(1), Materials.Electrotine.getDust(1),
                Materials.Electrum.getDust(1), Materials.Jade.getDust(1), Materials.Redstone.getDust(1),
                Materials.Vinteum.getDust(1),

                // Sapphire Vein
                Materials.Almandine.getDust(1), Materials.GarnetRed.getDust(1), Materials.GreenSapphire.getDust(1),
                Materials.Magnesium.getDust(1), Materials.Pyrope.getDust(1), Materials.Sapphire.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Black Plutonium Vein
                Materials.Almandine.getDust(1), Materials.Andradite.getDust(1), Materials.BlackPlutonium.getDust(1),
                Materials.Borax.getDust(1), Materials.GarnetRed.getDust(1), Materials.GarnetYellow.getDust(1),
                Materials.Grossular.getDust(1), Materials.Pyrope.getDust(1), Materials.Spessartine.getDust(1),
                Materials.Uvarovite.getDust(1),

                // Cosmic Neutronium Vein
                Materials.Bedrockium.getDust(1), Materials.BlackPlutonium.getDust(1),
                Materials.CosmicNeutronium.getDust(1), Materials.Neutronium.getDust(1),

                // Mytryl Vein
                Materials.Ceruclase.getDust(1), Materials.Jasper.getDust(1), Materials.Mytryl.getDust(1),
                Materials.Vulcanite.getDust(1), Materials.Zinc.getDust(1),

                WerkstoffMaterialPool.SamariumOreConcentrate.get(OrePrefixes.dust, 1),

                // Nether Star Vein
                Materials.Almandine.getDust(1), Materials.Andradite.getDust(1), Materials.GarnetRed.getDust(1),
                Materials.GarnetSand.getDust(1), Materials.GarnetYellow.getDust(1), Materials.Grossular.getDust(1),
                Materials.NetherStar.getDust(1), Materials.Pyrope.getDust(1), Materials.Spessartine.getDust(1),
                Materials.Uvarovite.getDust(1),

                // Red Garnet Vein
                Materials.Almandine.getDust(1), Materials.Andradite.getDust(1), Materials.Asbestos.getDust(1),
                Materials.Chrysotile.getDust(1), Materials.GarnetRed.getDust(1), Materials.GarnetYellow.getDust(1),
                Materials.Grossular.getDust(1), Materials.Magnesium.getDust(1), Materials.Pyrope.getDust(1),
                Materials.Realgar.getDust(1), Materials.SiliconDioxide.getDust(1), Materials.Spessartine.getDust(1),
                Materials.Uvarovite.getDust(1),

                // Oriharukon Vein
                Materials.Mirabilite.getDust(1), Materials.Oriharukon.getDust(1), Materials.Tanzanite.getDust(1),
                Materials.Vyroxeres.getDust(1),

                // Quantium Vein
                Materials.Amethyst.getDust(1), Materials.Ardite.getDust(1), Materials.Quantium.getDust(1),
                Materials.Rutile.getDust(1),

                // Ledox Vein
                Materials.Ledox.getDust(1), Materials.Opal.getDust(1), Materials.Orichalcum.getDust(1),
                Materials.Rubracium.getDust(1), Materials.Tanzanite.getDust(1),

                WerkstoffMaterialPool.SamariumOreConcentrate.get(OrePrefixes.dust, 1),

                // Small Ore Stats
                // Amethyst Ore
                Materials.Amethyst.getDust(1),

                // Red Garnet Ore
                Materials.Almandine.getDust(1), Materials.GarnetRed.getDust(1), Materials.Pyrope.getDust(1),
                Materials.Spessartine.getDust(1),

                // Yellow Garnet Ore
                Materials.Andradite.getDust(1), Materials.GarnetYellow.getDust(1), Materials.Grossular.getDust(1),
                Materials.Uvarovite.getDust(1),

                // Tanzanite Ore
                Materials.Opal.getDust(1), Materials.Tanzanite.getDust(1),

                // Spinel Ore
                Materials.Jasper.getDust(1),

                // Opal Ore
                Materials.Opal.getDust(1), Materials.Tanzanite.getDust(1),

                // Charged Certus Quartz Ore
                Materials.Barite.getDust(1), Materials.CertusQuartz.getDust(1), Materials.Quartzite.getDust(1),

                getModItem(NewHorizonsCoreMod.ID, "item.ChargedCertusQuartzDust", 1L), // Charged Certus Quartz Dust

                // Mytryl Ore
                Materials.Mytryl.getDust(1), Materials.Zinc.getDust(1),

                WerkstoffMaterialPool.SamariumOreConcentrate.get(OrePrefixes.dust, 1),

                // Ruby Ore
                Materials.Chrome.getDust(1), Materials.Ruby.getDust(1), Materials.GarnetRed.getDust(1),

                // Emerald Ore
                Materials.Beryllium.getDust(1), Materials.Emerald.getDust(1),

                // Blue Topaz Ore
                Materials.BlueTopaz.getDust(1), Materials.Topaz.getDust(1),

                // Topaz Ore
                Materials.BlueTopaz.getDust(1), Materials.Topaz.getDust(1),

                // Certus Quartz Ore
                Materials.Barite.getDust(1), Materials.CertusQuartz.getDust(1), Materials.Quartzite.getDust(1),

                // Jade Ore
                Materials.Jade.getDust(1),

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

        // T9 - Maahes - Mh
        VoidDustRecipes_T9.put(
            "Mh",
            new ItemStack[] {
                // Naquadria Vein
                Materials.Trinium.getDust(1),

                getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10054), // Naquadah Oxide Mixture Dust
                getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10067), // Enriched-Naquadah Oxide Mixture Dust
                getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10072), // Naquadria Oxide Mixture Dust

                // Cryolite Vein
                Materials.Cryolite.getDust(1), Materials.Galena.getDust(1), Materials.Lead.getDust(1),
                Materials.Silver.getDust(1), Materials.Sodium.getDust(1), Materials.Sulfur.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Callisto Ice Vein
                Materials.CallistoIce.getDust(1), Materials.Topaz.getDust(1), Materials.BlueTopaz.getDust(1),
                Materials.Alduorite.getDust(1),

                // Vanadium Vein
                Materials.Chrome.getDust(1), Materials.Copper.getDust(1), Materials.Gold.getDust(1),
                Materials.Iron.getDust(1), Materials.Magnesium.getDust(1), Materials.Magnetite.getDust(1),
                Materials.Nickel.getDust(1), Materials.Vanadium.getDust(1),

                // Soapstone Vein
                Materials.Cobalt.getDust(1), Materials.Glauconite.getDust(1), Materials.Iron.getDust(1),
                Materials.Nickel.getDust(1), Materials.Pentlandite.getDust(1), Materials.Soapstone.getDust(1),
                Materials.Sodium.getDust(1), Materials.Talc.getDust(1),
                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Neutronium Vein
                Materials.Adamantium.getDust(1), Materials.Almandine.getDust(1), Materials.Neutronium.getDust(1),
                Materials.Titanium.getDust(1),

                getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10054), // Naquadah Oxide Mixture Dust
                getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10067), // Enriched-Naquadah Oxide Mixture Dust

                // Platinum Vein
                Materials.Nickel.getDust(1),

                WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.IrOsLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PDMetallicPowder.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),

                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2828), // Sheldonite Dust

                // Naquadah Vein
                getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10054), // Naquadah Oxide Mixture Dust
                getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10067), // Enriched-Naquadah Oxide Mixture Dust
                getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10072), // Naquadria Oxide Mixture Dust

                // Basaltic Mineral Sand Vein
                Materials.Basalt.getDust(1), Materials.FullersEarth.getDust(1), Materials.GraniteBlack.getDust(1),
                Materials.Gypsum.getDust(1), Materials.Magnesium.getDust(1), Materials.Magnetite.getDust(1),
                Materials.SiliconDioxide.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Quantium Vein
                Materials.Amethyst.getDust(1), Materials.Ardite.getDust(1), Materials.Quantium.getDust(1),
                Materials.Rutile.getDust(1),

                // Chrome Vein
                Materials.Chrome.getDust(1), Materials.Iron.getDust(1), Materials.Lithium.getDust(1),
                Materials.Magnesium.getDust(1), Materials.Manganese.getDust(1), Materials.Molybdenum.getDust(1),
                Materials.Silver.getDust(1), Materials.Tungstate.getDust(1) });

        // T9 - MehenBelt - MB
        VoidDustRecipes_T9.put(
            "MB",
            new ItemStack[] {
                // Uranium 238 Vein
                Materials.Lead.getDust(1), Materials.Thorium.getDust(1), Materials.Uraninite.getDust(1),
                Materials.Uranium.getDust(1), Materials.Uranium235.getDust(1),

                getModItem(GTPlusPlus.ID, "dustRadium226", 1L), // Radium 226 Dust

                // Lapis Vein
                Materials.Andradite.getDust(1), Materials.Calcite.getDust(1), Materials.Lapis.getDust(1),
                Materials.Lazurite.getDust(1), Materials.Malachite.getDust(1), Materials.Pyrite.getDust(1),
                Materials.Sodalite.getDust(1),

                // Awakened Draconium Vein
                Materials.Draconium.getDust(1), Materials.DraconiumAwakened.getDust(1), Materials.NetherStar.getDust(1),

                // Olivine Vein
                Materials.Bentonite.getDust(1), Materials.Calcium.getDust(1), Materials.Glauconite.getDust(1),
                Materials.Iron.getDust(1), Materials.Magnesium.getDust(1), Materials.Magnetite.getDust(1),
                Materials.Olivine.getDust(1), Materials.Pyrope.getDust(1), Materials.Sodium.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Osmium Vein
                Materials.Cobalt.getDust(1), Materials.Iron.getDust(1), Materials.Nickel.getDust(1),

                WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.IrOsLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),

                // Nickel Vein
                Materials.Cobalt.getDust(1), Materials.Cobaltite.getDust(1), Materials.Iron.getDust(1),
                Materials.Nickel.getDust(1), Materials.Pentlandite.getDust(1), Materials.RoastedNickel.getDust(1),
                Materials.Sulfur.getDust(1),

                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),

                // Ilmenite Vein
                Materials.Chrome.getDust(1), Materials.Chromite.getDust(1), Materials.GarnetYellow.getDust(1),
                Materials.Iron.getDust(1), Materials.Ilmenite.getDust(1), Materials.Magnesium.getDust(1),
                Materials.Perlite.getDust(1), Materials.Rutile.getDust(1), Materials.Uvarovite.getDust(1),
                Materials.WroughtIron.getDust(1),

                WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),
                WerkstoffMaterialPool.Hafnium.get(OrePrefixes.dust, 1),

                // Palladium Vein
                Materials.Chrome.getDust(1), Materials.Iron.getDust(1), Materials.Magnesium.getDust(1),
                Materials.Nickel.getDust(1),

                WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PDMetallicPowder.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),

                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2828), // Sheldonite Dust

                // Neutronium Vein
                Materials.Adamantium.getDust(1), Materials.Almandine.getDust(1), Materials.Neutronium.getDust(1),
                Materials.Titanium.getDust(1),

                getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10054), // Naquadah Oxide Mixture Dust
                getModItem(BartWorks.ID, "gt.bwMetaGenerateddust", 1L, 10067), // Enriched-Naquadah Oxide Mixture Dust

                // Platinum Vein
                Materials.Nickel.getDust(1),

                WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.IrOsLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PDMetallicPowder.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),

                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2828), // Sheldonite Dust

                // Iridium Vein
                Materials.Cobalt.getDust(1), Materials.Iron.getDust(1), Materials.Mithril.getDust(1),
                Materials.Nickel.getDust(1),

                WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.IrOsLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PDMetallicPowder.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),

                // Cassiterite Vein
                Materials.Cassiterite.getDust(1), Materials.Iron.getDust(1), Materials.Tin.getDust(1),
                Materials.Zinc.getDust(1),

                WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),

                // Small Ore Stats
                // Titanium Ore
                Materials.Almandine.getDust(1), Materials.Titanium.getDust(1),

                // Tin Ore
                Materials.Iron.getDust(1), Materials.Tin.getDust(1), Materials.Zinc.getDust(1),

                // Neutronium Ore
                Materials.Neutronium.getDust(1),

                // Chromite Ore
                Materials.Chromite.getDust(1), Materials.Iron.getDust(1), Materials.Magnesium.getDust(1),

                // Lapis Ore
                Materials.Lapis.getDust(1), Materials.Lazurite.getDust(1), Materials.Pyrite.getDust(1),
                Materials.Sodalite.getDust(1),

                // Nickel Ore
                Materials.Cobalt.getDust(1), Materials.Nickel.getDust(1), Materials.Iron.getDust(1),

                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),

                // Olivine Ore
                Materials.Magnesium.getDust(1), Materials.Olivine.getDust(1), Materials.Pyrope.getDust(1) });

        // T9 - Neper - Np
        VoidDustRecipes_T9.put(
            "Np",
            new ItemStack[] {
                // Tungsten Vein
                Materials.DeepIron.getDust(1), Materials.Iron.getDust(1), Materials.Manganese.getDust(1),
                Materials.Molybdenum.getDust(1), Materials.ShadowIron.getDust(1), Materials.Silicon.getDust(1),
                Materials.SiliconDioxide.getDust(1), Materials.Trinium.getDust(1), Materials.Tungsten.getDust(1),

                // Terra & Aer Vein
                Materials.Amber.getDust(1), Materials.Cinnabar.getDust(1), Materials.Glowstone.getDust(1),
                Materials.Redstone.getDust(1), Materials.Sulfur.getDust(1),

                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2540), // Aer Crystal Powder
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2542), // Terra Crystal Powder

                // Certus Quartz Vein
                Materials.Barite.getDust(1), Materials.CertusQuartz.getDust(1), Materials.Quartzite.getDust(1),
                Materials.QuartzSand.getDust(1),

                getModItem(NewHorizonsCoreMod.ID, "item.ChargedCertusQuartzDust", 1L), // Charged Certus Quartz Dust

                // Quartzite Vein
                Materials.Barite.getDust(1), Materials.CertusQuartz.getDust(1), Materials.Quartzite.getDust(1),

                // Dilithium Vein
                Materials.Dilithium.getDust(1), Materials.MysteriousCrystal.getDust(1), Materials.Vinteum.getDust(1),

                // Mica Vein
                Materials.Caesium.getDust(1), Materials.Cassiterite.getDust(1), Materials.Kyanite.getDust(1),
                Materials.Mica.getDust(1), Materials.Pollucite.getDust(1), Materials.Rubidium.getDust(1),
                Materials.Tin.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1), WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),

                // Dolomite Vein
                Materials.Andradite.getDust(1), Materials.Dolomite.getDust(1), Materials.GarnetYellow.getDust(1),
                Materials.Iron.getDust(1), Materials.Trona.getDust(1), Materials.Wollastonite.getDust(1),

                // Arsenic Vein
                Materials.Antimony.getDust(1), Materials.Arsenic.getDust(1), Materials.Bismuth.getDust(1),
                Materials.Iron.getDust(1), Materials.Zinc.getDust(1),

                // Perditio & Ordo Vein
                Materials.Amber.getDust(1), Materials.Cinnabar.getDust(1), Materials.Glowstone.getDust(1),
                Materials.Redstone.getDust(1), Materials.Sulfur.getDust(1),

                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2544), // Perditio Crystal Powder
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2545), // Ordo Crystal Powder

                // Kaolinite Vein
                Materials.FullersEarth.getDust(1), Materials.GlauconiteSand.getDust(1), Materials.Iron.getDust(1),
                Materials.Kaolinite.getDust(1), Materials.Magnesium.getDust(1), Materials.Sodium.getDust(1),
                Materials.Zeolite.getDust(1),

                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),

                // Aqua & Ignis Vein
                Materials.Amber.getDust(1), Materials.Cinnabar.getDust(1), Materials.Glowstone.getDust(1),
                Materials.Redstone.getDust(1), Materials.Sulfur.getDust(1),

                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2541), // Ignis Crystal Powder
                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2543), // Aqua Crystal Powder

                // Nether Quartz Vein
                Materials.Barite.getDust(1), Materials.CertusQuartz.getDust(1), Materials.NetherQuartz.getDust(1),
                Materials.Quartzite.getDust(1) });

        // T9 - Seth - Se
        VoidDustRecipes_T9.put(
            "Se",
            new ItemStack[] {
                // Osmium Vein
                Materials.Cobalt.getDust(1), Materials.Iron.getDust(1), Materials.Nickel.getDust(1),

                WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.IrOsLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),

                // Samarium Vein
                Materials.Monazite.getDust(1), Materials.Neodymium.getDust(1), Materials.RareEarth.getDust(1),
                Materials.Tartarite.getDust(1), Materials.Chalcopyrite.getDust(1), Materials.Galena.getDust(1),
                Materials.NetherQuartz.getDust(1), Materials.Yttrium.getDust(1),

                WerkstoffMaterialPool.SamariumOreConcentrate.get(OrePrefixes.dust, 1),

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

                // Palladium Vein
                Materials.Chrome.getDust(1), Materials.Iron.getDust(1), Materials.Magnesium.getDust(1),
                Materials.Nickel.getDust(1),

                WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PDMetallicPowder.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),

                getModItem(GregTech.ID, "gt.metaitem.01", 1L, 2828), // Sheldonite Dust

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

                // Raw Tengam Vein
                Materials.Diamond.getDust(1), Materials.Electrotine.getDust(1), Materials.Electrum.getDust(1),
                Materials.NeodymiumMagnetic.getDust(1), Materials.Redstone.getDust(1),
                Materials.SamariumMagnetic.getDust(1), Materials.TengamRaw.getDust(1),

                WerkstoffMaterialPool.SamariumOreConcentrate.get(OrePrefixes.dust, 1),

                // Magnetite Vein
                Materials.Gold.getDust(1), Materials.Iron.getDust(1), Materials.Magnetite.getDust(1),
                Materials.Nickel.getDust(1), Materials.Tin.getDust(1), Materials.Vanadium.getDust(1),
                Materials.VanadiumMagnetite.getDust(1),

                // Iridium Vein
                Materials.Cobalt.getDust(1), Materials.Iron.getDust(1), Materials.Mithril.getDust(1),
                Materials.Nickel.getDust(1),

                WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.IrOsLeachResidue.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PDMetallicPowder.get(OrePrefixes.dust, 1),
                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1),

                // Cassiterite Vein
                Materials.Cassiterite.getDust(1), Materials.Iron.getDust(1), Materials.Tin.getDust(1),
                Materials.Zinc.getDust(1),

                WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),

                // Small Ore Stats
                // Awakened Draconium Ore
                Materials.DraconiumAwakened.getDust(1),

                // Draconium Ore
                Materials.Draconium.getDust(1) });
    }
}
