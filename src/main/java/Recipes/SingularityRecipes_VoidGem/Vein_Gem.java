package Recipes.SingularityRecipes_VoidGem;

import static gregtech.api.enums.Mods.AppliedEnergistics2;
import static gregtech.api.enums.Mods.BiomesOPlenty;
import static gregtech.api.enums.Mods.Botania;
import static gregtech.api.enums.Mods.GalacticraftAmunRa;
import static gregtech.api.enums.Mods.IndustrialCraft2;
import static gregtech.api.enums.Mods.Railcraft;
import static gregtech.api.enums.Mods.Thaumcraft;
import static gregtech.api.util.GTModHandler.getModItem;

import net.minecraft.item.ItemStack;

import bartworks.system.material.WerkstoffLoader;
import goodgenerator.items.GGMaterial;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gtnhlanth.common.register.WerkstoffMaterialPool;

public class Vein_Gem {

    // Apatite Vein
    public static final ItemStack[] Apatite_Vein = new ItemStack[] {
        //
        Materials.Apatite.getGems(1),
        //
        Materials.TricalciumPhosphate.getGems(1) };

    // Aqua, Ignis & Amber Vein
    public static final ItemStack[] Aqua_Ignis_Amber_Vein = new ItemStack[] {
        //
        getModItem(Thaumcraft.ID, "ItemShard", 1L, 1),
        //
        getModItem(Thaumcraft.ID, "ItemShard", 1L, 2),
        //
        getModItem(Thaumcraft.ID, "ItemResource", 1L, 3),
        //
        getModItem(Thaumcraft.ID, "ItemResource", 1L, 6) };

    // Awakened Draconium Vein
    public static final ItemStack[] Awakened_Draconium_Vein = new ItemStack[] {
        //
        Materials.NetherStar.getGems(1) };

    // BArTiMaEuSNeK Vein
    public static final ItemStack[] BArTiMaEuSNeK_Vein = new ItemStack[] {
        //
        WerkstoffLoader.BArTiMaEuSNeK.get(OrePrefixes.gem, 1) };

    // Beryllium Vein
    public static final ItemStack[] Beryllium_Vein = new ItemStack[] {
        //
        Materials.Emerald.getGems(1) };

    // Bismutite & Bismuthinite Vein
    public static final ItemStack[] Bismutite_Bismuthinite_Vein = new ItemStack[] {
        //
        WerkstoffLoader.Bismutite.get(OrePrefixes.gem, 1) };

    // Black Plutonium Vein
    public static final ItemStack[] Black_Plutonium_Vein = new ItemStack[] {
        //
        Materials.GarnetRed.getGems(1),
        //
        Materials.GarnetYellow.getGems(1) };

    // Callisto Ice Vein
    public static final ItemStack[] Callisto_Ice_Vein = new ItemStack[] {
        //
        Materials.BlueTopaz.getGems(1),
        //
        Materials.Topaz.getGems(1) };

    // Certus Quartz Vein
    public static final ItemStack[] Certus_Quartz_Vein = new ItemStack[] {
        //
        Materials.CertusQuartz.getGems(1),
        //
        Materials.Quartzite.getGems(1),
        //
        getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 1) };

    // Coal Vein
    public static final ItemStack[] Coal_Vein = new ItemStack[] {
        //
        Materials.Coal.getGems(1),
        //
        Materials.Lignite.getGems(1) };

    // Diamond Vein
    public static final ItemStack[] Diamond_Vein = new ItemStack[] {
        //
        Materials.Coal.getGems(1),
        //
        Materials.Diamond.getGems(1),
        //
        Materials.Lignite.getGems(1) };

    // Dilithium Vein
    public static final ItemStack[] Dilithium_Vein = new ItemStack[] {
        //
        Materials.Dilithium.getGems(1) };

    // Dolomite Vein
    public static final ItemStack[] Dolomite_Vein = new ItemStack[] {
        //
        Materials.GarnetYellow.getGems(1) };

    // Draconium Vein
    public static final ItemStack[] Draconium_Vein = new ItemStack[] {
        //
        Materials.Jade.getGems(1),
        //
        Materials.Vinteum.getGems(1) };

    // Fayalite & Green Fuchsite & Red Zircon & Red Fuchsite Vein
    public static final ItemStack[] Fayalite_GreenFuchsite_RedZircon_RedFuchsite_Vein = new ItemStack[] {
        //
        WerkstoffLoader.Fayalit.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.RedZircon.get(OrePrefixes.gem, 1) };

    // Fluorspar Vein
    public static final ItemStack[] Fluorspar_Vein = new ItemStack[] {
        //
        Materials.GarnetYellow.getGems(1),
        //
        WerkstoffLoader.Fluorspar.get(OrePrefixes.gem, 1) };

    // Forsterite & Fayalite & Orange Descloizite & Red Descloizite Vein
    public static final ItemStack[] Forsterite_Fayalite_OrangeDescloizite_RedDescloizite_Vein = new ItemStack[] {
        //
        WerkstoffLoader.Fayalit.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.Forsterit.get(OrePrefixes.gem, 1) };

    // Hedenbergite & Fayalite & Orange Descloizite & Red Descloizite Vein
    public static final ItemStack[] Hedenbergite_Fayalite_OrangeDescloizite_RedDescloizite_Vein = new ItemStack[] {
        //
        WerkstoffLoader.Hedenbergit.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.Fayalit.get(OrePrefixes.gem, 1) };

    // Ilmenite Vein
    public static final ItemStack[] Ilmenite_Vein = new ItemStack[] {
        //
        Materials.GarnetYellow.getGems(1) };

    // Iridium Vein
    public static final ItemStack[] Iridium_Vein = new ItemStack[] {
        //
        getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L) };

    // Iron Vein
    public static final ItemStack[] Iron_Vein = new ItemStack[] {
        //
        getModItem(BiomesOPlenty.ID, "gems", 1L, 5) };

    // Lapis Vein
    public static final ItemStack[] Lapis_Vein = new ItemStack[] {
        //
        Materials.Lapis.getGems(1),
        //
        Materials.Lazurite.getGems(1),
        //
        Materials.Sodalite.getGems(1) };

    // Ledox Vein
    public static final ItemStack[] Ledox_Vein = new ItemStack[] {
        //
        Materials.Opal.getGems(1) };

    // Lignite Coal Vein
    public static final ItemStack[] Lignite_Coal_Vein = new ItemStack[] {
        //
        Materials.Coal.getGems(1),
        //
        Materials.Lignite.getGems(1) };

    // Magnesite Vein
    public static final ItemStack[] Magnesite_Vein = new ItemStack[] {
        //
        Materials.Opal.getGems(1) };

    // Monazite Vein
    public static final ItemStack[] Monazite_Vein = new ItemStack[] {
        //
        Materials.Monazite.getGems(1) };

    // Mytryl Vein
    public static final ItemStack[] Mytryl_Vein = new ItemStack[] {
        //
        Materials.Jasper.getGems(1) };

    // Nether Quartz Vein
    public static final ItemStack[] Nether_Quartz_Vein = new ItemStack[] {
        //
        Materials.CertusQuartz.getGems(1),
        //
        Materials.Quartz.getGems(1),
        //
        Materials.Quartzite.getGems(1) };

    // Nether Star Vein
    public static final ItemStack[] Nether_Star_Vein = new ItemStack[] {
        //
        Materials.GarnetRed.getGems(1),
        //
        Materials.GarnetYellow.getGems(1),
        //
        Materials.NetherStar.getGems(1) };

    // Olenite & Fluor-Buergerite & Chromo-Alumino-Povondraite & Vanadio-Oxy-Dravit Vein
    public static final ItemStack[] Olenite_FluorBuergerite_ChromoAluminoPovondraite_VanadioOxyDravit_Vein = new ItemStack[] {
        //
        WerkstoffLoader.ChromoAluminoPovondrait.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.FluorBuergerit.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.Olenit.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.VanadioOxyDravit.get(OrePrefixes.gem, 1) };

    // Olivine Vein
    public static final ItemStack[] Olivine_Vein = new ItemStack[] {
        //
        Materials.Olivine.getGems(1) };

    // Oriharukon Vein
    public static final ItemStack[] Oriharukon_Vein = new ItemStack[] {
        //
        Materials.Opal.getGems(1),
        //
        Materials.Tanzanite.getGems(1) };

    // Osmium Vein
    public static final ItemStack[] Osmium_Vein = new ItemStack[] {
        //
        getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L) };

    // Perditio & Ordo Vein
    public static final ItemStack[] Perditio_Ordo_Vein = new ItemStack[] {
        //
        getModItem(Thaumcraft.ID, "ItemShard", 1L, 4),
        //
        getModItem(Thaumcraft.ID, "ItemShard", 1L, 5),
        //
        getModItem(Thaumcraft.ID, "ItemResource", 1L, 3),
        //
        getModItem(Thaumcraft.ID, "ItemResource", 1L, 6) };

    // Platinum Vein
    public static final ItemStack[] Platinum_Vein = new ItemStack[] {
        //
        getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L) };

    // Prasiolite & Hedenbergite Vein
    public static final ItemStack[] Prasiolite_Hedenbergite_Vein = new ItemStack[] {
        //
        Materials.Amethyst.getGems(1),
        //
        Materials.Olivine.getGems(1),
        //
        WerkstoffLoader.Hedenbergit.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.Prasiolite.get(OrePrefixes.gem, 1) };

    // Pyrolusite Vein
    public static final ItemStack[] Pyrolusite_Vein = new ItemStack[] {
        //
        Materials.Apatite.getGems(1),
        //
        Materials.TricalciumPhosphate.getGems(1) };

    // Quantium Vein
    public static final ItemStack[] Quantium_Vein = new ItemStack[] {
        //
        Materials.Amethyst.getGems(1) };

    // Quartz Vein
    public static final ItemStack[] Quartz_Vein = new ItemStack[] {
        //
        Materials.CertusQuartz.getGems(1),
        //
        Materials.Quartzite.getGems(1) };

    // Quartzite Vein
    public static final ItemStack[] Quartzite_Vein = new ItemStack[] {
        //
        Materials.CertusQuartz.getGems(1),
        //
        Materials.Quartzite.getGems(1) };

    // Red Garnet Vein
    public static final ItemStack[] Red_Garnet_Vein = new ItemStack[] {
        //
        Materials.GarnetRed.getGems(1),
        //
        Materials.GarnetYellow.getGems(1) };

    // Redstone Vein
    public static final ItemStack[] Redstone_Vein = new ItemStack[] {
        //
        getModItem(Thaumcraft.ID, "ItemResource", 1L, 3) };

    // Salt Vein
    public static final ItemStack[] Salt_Vein = new ItemStack[] {
        //
        Materials.RockSalt.getGems(1),
        //
        Materials.Salt.getGems(1),
        //
        Materials.Spodumene.getGems(1) };

    // Samarium Vein
    public static final ItemStack[] Samarium_Vein = new ItemStack[] {
        //
        Materials.Monazite.getGems(1) };

    // Sapphire Vein
    public static final ItemStack[] Sapphire_Vein = new ItemStack[] {
        //
        Materials.GreenSapphire.getGems(1),
        //
        Materials.Sapphire.getGems(1) };

    // Terra & Aer Vein
    public static final ItemStack[] Terra_Aer_Vein = new ItemStack[] {
        //
        getModItem(Thaumcraft.ID, "ItemShard", 1L, 0),
        //
        getModItem(Thaumcraft.ID, "ItemShard", 1L, 3),
        //
        getModItem(Thaumcraft.ID, "ItemResource", 1L, 3),
        //
        getModItem(Thaumcraft.ID, "ItemResource", 1L, 6) };

    // Thorianite Vein
    public static final ItemStack[] Thorianite_Vein = new ItemStack[] {
        //
        WerkstoffLoader.Spodumen.get(OrePrefixes.gem, 1) };

    // Tiberium Vein
    public static final ItemStack[] Tiberium_Vein = new ItemStack[] {
        //
        WerkstoffLoader.Tiberium.get(OrePrefixes.gem, 1) };

    // Tin Vein
    public static final ItemStack[] Tin_Vein = new ItemStack[] {
        //
        Materials.GarnetRed.getGems(1) };

    public static final ItemStack[] T10_Gem = new ItemStack[] {
        // Charged Certus Quartz Crystal
        getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 1),
        // Fluix Crystal
        getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 7),
        // Pure Certus Quartz Crystal
        getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 10),
        // Pure Fluix Crystal
        getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 12),

        // Ender Amethyst
        getModItem(BiomesOPlenty.ID, "gems", 1L, 0),
        // Ruby
        getModItem(BiomesOPlenty.ID, "gems", 1L, 1),
        // Peridot
        getModItem(BiomesOPlenty.ID, "gems", 1L, 2),
        // Topaz
        getModItem(BiomesOPlenty.ID, "gems", 1L, 3),
        // Tanzanite
        getModItem(BiomesOPlenty.ID, "gems", 1L, 4),
        // Malachite
        getModItem(BiomesOPlenty.ID, "gems", 1L, 5),
        // Sapphire
        getModItem(BiomesOPlenty.ID, "gems", 1L, 6),
        // Amber
        getModItem(BiomesOPlenty.ID, "gems", 1L, 7),

        // Mana Pearl
        getModItem(Botania.ID, "manaResource", 1L, 1),
        // Mana Diamond
        getModItem(Botania.ID, "manaResource", 1L, 2),
        // Dragonstone
        getModItem(Botania.ID, "manaResource", 1L, 9),

        // Ruby
        getModItem(GalacticraftAmunRa.ID, "item.baseItem", 1L, 6),

        // Iridium Ore
        getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),
        // Industrial Diamond
        getModItem(IndustrialCraft2.ID, "itemPartIndustrialDiamond", 1L),

        // Raw Firestore
        getModItem(Railcraft.ID, "firestone.raw", 1L),

        // Quicksilver
        getModItem(Thaumcraft.ID, "ItemResource", 1L, 3),
        // Amber
        getModItem(Thaumcraft.ID, "ItemResource", 1L, 6),
        // Air Shard
        getModItem(Thaumcraft.ID, "ItemShard", 1L, 0),
        // Fire Shard
        getModItem(Thaumcraft.ID, "ItemShard", 1L, 1),
        // Water Shard
        getModItem(Thaumcraft.ID, "ItemShard", 1L, 2),
        // Earth Shard
        getModItem(Thaumcraft.ID, "ItemShard", 1L, 3),
        // Order Shard
        getModItem(Thaumcraft.ID, "ItemShard", 1L, 4),
        // Entropy Shard
        getModItem(Thaumcraft.ID, "ItemShard", 1L, 5),

        //
        GGMaterial.orundum.get(OrePrefixes.gem, 1),

        //
        Materials.Amethyst.getGems(1),
        //
        Materials.Amber.getGems(1),
        //
        Materials.Apatite.getGems(1),
        //
        Materials.BlueTopaz.getGems(1),
        //
        Materials.CertusQuartz.getGems(1),
        //
        Materials.Charcoal.getGems(1),
        //
        Materials.Coal.getGems(1),
        //
        Materials.Diamond.getGems(1),
        //
        Materials.Dilithium.getGems(1),
        //
        Materials.Emerald.getGems(1),
        //
        Materials.EnderEye.getGems(1),
        //
        Materials.EnderPearl.getGems(1),
        //
        Materials.Firestone.getGems(1),
        //
        Materials.Force.getGems(1),
        //
        Materials.Forcicium.getGems(1),
        //
        Materials.Forcillium.getGems(1),
        //
        Materials.GarnetRed.getGems(1),
        //
        Materials.GarnetYellow.getGems(1),
        //
        Materials.GreenSapphire.getGems(1),
        //
        Materials.Jade.getGems(1),
        //
        Materials.Jasper.getGems(1),
        //
        Materials.Lapis.getGems(1),
        //
        Materials.Lazurite.getGems(1),
        //
        Materials.Lignite.getGems(1),
        //
        Materials.Monazite.getGems(1),
        //
        Materials.NetherStar.getGems(1),
        //
        Materials.NetherQuartz.getGems(1),
        //
        Materials.Niter.getGems(1),
        //
        Materials.Olivine.getGems(1),
        //
        Materials.Opal.getGems(1),
        //
        Materials.Quartzite.getGems(1),
        //
        Materials.Ruby.getGems(1),
        //
        Materials.Sapphire.getGems(1),
        //
        Materials.Sodalite.getGems(1),
        //
        Materials.Tanzanite.getGems(1),
        //
        Materials.Topaz.getGems(1),
        //
        Materials.TricalciumPhosphate.getGems(1),
        //
        Materials.Vinteum.getGems(1),

        //
        WerkstoffLoader.Bismutite.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.CubicZirconia.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.FluorBuergerit.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.ChromoAluminoPovondrait.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.VanadioOxyDravit.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.Olenit.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.RedZircon.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.Salt.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.Spodumen.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.RockSalt.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.Fayalit.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.Forsterit.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.Hedenbergit.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.Prasiolite.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.MagnetoResonaticDust.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.BArTiMaEuSNeK.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.Tiberium.get(OrePrefixes.gem, 1),
        //
        WerkstoffLoader.Fluorspar.get(OrePrefixes.gem, 1),
        //
        WerkstoffMaterialPool.CeriumDopedLutetiumAluminiumGarnet.get(OrePrefixes.gem, 1),
        //
        WerkstoffMaterialPool.LanthanumHexaboride.get(OrePrefixes.gem, 1) };
}
