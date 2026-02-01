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

public class SingularityDustRecipes_T1 {

    public static final Map<String, ItemStack[]> VoidDustRecipes_T1 = new HashMap<>();

    public static void addVoidDustRecipes_T1() {
        // T1 - Moon - Mo
        VoidDustRecipes_T1.put(
            "Mo",
            new ItemStack[] {
                // Molybdenum Vein
                Materials.Molybdenite.getDust(1), Materials.Molybdenum.getDust(1), Materials.Powellite.getDust(1),
                Materials.Wulfenite.getDust(1),

                // Quartz Vein
                Materials.Barite.getDust(1), Materials.CertusQuartz.getDust(1), Materials.Quartzite.getDust(1),

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

                // Ilmenite Vein
                Materials.Chrome.getDust(1), Materials.Chromite.getDust(1), Materials.GarnetYellow.getDust(1),
                Materials.Iron.getDust(1), Materials.Ilmenite.getDust(1), Materials.Magnesium.getDust(1),
                Materials.Perlite.getDust(1), Materials.Rutile.getDust(1), Materials.Uvarovite.getDust(1),
                Materials.WroughtIron.getDust(1),

                WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),

                WerkstoffMaterialPool.Hafnium.get(OrePrefixes.dust, 1),

                // Copper Vein
                Materials.Cadmium.getDust(1), Materials.Chalcopyrite.getDust(1), Materials.Cobalt.getDust(1),
                Materials.Copper.getDust(1), Materials.Gold.getDust(1), Materials.Iron.getDust(1),
                Materials.Nickel.getDust(1), Materials.Pyrite.getDust(1), Materials.Sulfur.getDust(1),
                Materials.Tin.getDust(1), Materials.TricalciumPhosphate.getDust(1),

                // Bauxite Vein
                Materials.Aluminium.getDust(1), Materials.Bauxite.getDust(1), Materials.Gallium.getDust(1),
                Materials.Grossular.getDust(1), Materials.Iron.getDust(1), Materials.Ilmenite.getDust(1),
                Materials.Rutile.getDust(1), Materials.WroughtIron.getDust(1),

                WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),

                WerkstoffMaterialPool.Hafnium.get(OrePrefixes.dust, 1),

                // Galena Vein
                Materials.Lead.getDust(1), Materials.Galena.getDust(1), Materials.Silver.getDust(1),
                Materials.Sulfur.getDust(1),

                // Cassiterite Vein
                Materials.Cassiterite.getDust(1), Materials.Iron.getDust(1), Materials.Tin.getDust(1),
                Materials.Zinc.getDust(1),

                WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1),

                // Small Ore Stats
                // Meteoric Iron Ore
                Materials.Iron.getDust(1), Materials.MeteoricIron.getDust(1), Materials.Nickel.getDust(1),

                WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1) });
    }
}
