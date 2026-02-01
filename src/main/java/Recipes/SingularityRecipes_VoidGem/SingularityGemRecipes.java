package Recipes.SingularityRecipes_VoidGem;

import static gregtech.api.enums.Mods.AppliedEnergistics2;
import static gregtech.api.enums.Mods.BiomesOPlenty;
import static gregtech.api.enums.Mods.Botania;
import static gregtech.api.enums.Mods.GalacticraftAmunRa;
import static gregtech.api.enums.Mods.IndustrialCraft2;
import static gregtech.api.enums.Mods.Railcraft;
import static gregtech.api.enums.Mods.Thaumcraft;
import static gregtech.api.util.GTModHandler.getModItem;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.ItemStack;

import bartworks.system.material.WerkstoffLoader;
import goodgenerator.items.GGMaterial;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gtnhlanth.common.register.WerkstoffMaterialPool;

public class SingularityGemRecipes {

    public static final Map<String, ItemStack[]> VoidGemRecipes = new HashMap<>();

    public static void addVoidGemRecipes() {

        // T0 - Overworld - Ow
        VoidGemRecipes.put(
            "Ow",
            new ItemStack[] {

                // Diamond Vein
                Materials.Coal.getGems(1), Materials.Diamond.getGems(1), Materials.Lignite.getGems(1),

                // Lapis Vein
                Materials.Lapis.getGems(1), Materials.Lazurite.getGems(1), Materials.Sodalite.getGems(1),

                // Vermiculite Vein

                // Oilsands Vein

                // Coal Vein
                Materials.Coal.getGems(1), Materials.Lignite.getGems(1),

                // Manganese Vein
                Materials.GarnetYellow.getGems(1), Materials.GarnetRed.getGems(1),

                // Redstone Vein
                Materials.Ruby.getGems(1),

                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3),

                // Mica Vein

                // Dolomite Vein
                Materials.GarnetYellow.getGems(1),

                // Copper Vein

                // Soapstone Vein

                // Gold Vein

                // Kaolinite Vein

                // Iron Vein
                getModItem(BiomesOPlenty.ID, "gems", 1L, 5),

                // Lignite Coal Vein
                Materials.Coal.getGems(1), Materials.Lignite.getGems(1),

                // Apatite Vein
                Materials.Apatite.getGems(1), Materials.TricalciumPhosphate.getGems(1),

                // Basaltic Mineral Sand Vein

                // Magnetite Vein

                // Tin Vein
                Materials.GarnetRed.getGems(1),

                // Salt Vein
                Materials.RockSalt.getGems(1), Materials.Salt.getGems(1), Materials.Spodumene.getGems(1),

                // Cassiterite Vein

                // Small Ore Stats
                // Iron Ore

                // Copper Ore

                // Silver Ore

                // Tin Ore

                // Redstone Ore

                // Gold Ore

                // Diamond Ore
                Materials.Diamond.getGems(1),

                // Lapis Ore
                Materials.Lapis.getGems(1),

                // Coal Ore
                Materials.Coal.getGems(1), Materials.Lignite.getGems(1)

            // Zinc Ore

            // Nickel Ore
            });

        // T0 - Nether - Ne
        VoidGemRecipes.put(
            "Ne",
            new ItemStack[] {
                // Sulfur Vein

                // Molybdenum Vein

                // Manganese Vein

                // Quartzite Vein
                Materials.CertusQuartz.getGems(1), Materials.Quartzite.getGems(1),

                // Redstone Vein
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3),

                // Copper Vein

                // Iron Vein
                getModItem(BiomesOPlenty.ID, "gems", 1L, 5),

                // Beryllium Vein
                Materials.Emerald.getGems(1),

                // Electrotine Vein

                // Tetrahedrite Vein

                // Nether Quartz Vein
                Materials.CertusQuartz.getGems(1), Materials.Quartz.getGems(1), Materials.Quartzite.getGems(1),

                // Small Ore Stats
                // Saltpeter Ore

                // Iron Ore

                // Copper Ore

                // Silver Ore

                // Tin Ore

                // Lead Ore

                // Redstone Ore

                // Certus Quartz Ore
                Materials.CertusQuartz.getGems(1),

                // Sulfur Ore

                // Nether Quartz Ore
                Materials.Quartz.getGems(1)

            // Bismuth Ore

            // Zinc Ore

            // Realgar Ore
            });

        // T0 - Twilight - TF
        VoidGemRecipes.put(
            "TF",
            new ItemStack[] {
                // Diamond Vein
                Materials.Coal.getGems(1), Materials.Diamond.getGems(1), Materials.Lignite.getGems(1),

                // Lapis Vein
                Materials.Lapis.getGems(1), Materials.Lazurite.getGems(1), Materials.Sodalite.getGems(1),

                // Molybdenum Vein

                // Olivine Vein
                Materials.Olivine.getGems(1),

                // Terra & Aer Vein
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 0), getModItem(Thaumcraft.ID, "ItemShard", 1L, 3),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3), getModItem(Thaumcraft.ID, "ItemResource", 1L, 6),

                // Coal Vein
                Materials.Coal.getGems(1), Materials.Lignite.getGems(1),

                // Sapphire Vein
                Materials.GreenSapphire.getGems(1), Materials.Sapphire.getGems(1),

                // Cryolite Vein

                // Nickel Vein

                // Soapstone Vein

                // Perditio & Ordo Vein
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 4), getModItem(Thaumcraft.ID, "ItemShard", 1L, 5),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3), getModItem(Thaumcraft.ID, "ItemResource", 1L, 6),

                // Gold Vein

                // Iron Vein
                getModItem(BiomesOPlenty.ID, "gems", 1L, 5),

                // Apatite Vein
                Materials.Apatite.getGems(1), Materials.TricalciumPhosphate.getGems(1),

                // Magnetite Vein

                // Salt Vein
                Materials.RockSalt.getGems(1), Materials.Salt.getGems(1), Materials.Spodumene.getGems(1),

                // Cassiterite Vein

                // Aqua & Ignis Vein
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 1), getModItem(Thaumcraft.ID, "ItemShard", 1L, 2),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3), getModItem(Thaumcraft.ID, "ItemResource", 1L, 6),

                // Small Ore Stats
                // Amethyst Ore
                Materials.Amethyst.getGems(1),

                // Yellow Garnet Ore
                Materials.GarnetYellow.getGems(1),

                // Tanzanite Ore
                Materials.Tanzanite.getGems(1),

                // Saltpeter Ore

                // Spinel Ore

                // Opal Ore
                Materials.Opal.getGems(1),

                // Ruby Ore
                Materials.Ruby.getGems(1),

                // Lead Ore

                // Emerald Ore
                Materials.Emerald.getGems(1),

                // Amber Ore
                Materials.Amber.getGems(1),

                // Blue Topaz Ore
                Materials.BlueTopaz.getGems(1),

                // Topaz Ore
                Materials.Topaz.getGems(1),

                // Jade Ore

                // Red Garnet Ore
                Materials.GarnetRed.getGems(1),

                // Green Sapphire Ore
                Materials.GreenSapphire.getGems(1),

                // Sapphire Ore
                Materials.Sapphire.getGems(1),

                // Jasper Ore
                Materials.Jasper.getGems(1),

                // Olivine Ore
                Materials.Olivine.getGems(1) });

        // T0 - TheEnd - ED
        VoidGemRecipes.put(
            "ED",
            new ItemStack[] {
                // Molybdenum Vein

                // Nickel Vein

                // Copper Vein

                // Gold Vein

                // Beryllium Vein
                Materials.Emerald.getGems(1)

            // Tetrahedrite Vein

            // Cassiterite Vein

            // Small Ore Stats
            // Iron Ore

            // Copper Ore

            // Silver Ore

            // Tin Ore

            // Lead Ore

            // Gold Ore

            // Zinc Ore

            // Nickel Ore

            });

        // T0 - EndAsteroid - EA
        VoidGemRecipes.put(
            "EA",
            new ItemStack[] {
                // Tungstate Vein

                // Lapis Vein
                Materials.Lapis.getGems(1), Materials.Lazurite.getGems(1), Materials.Sodalite.getGems(1),

                // Molybdenum Vein

                // Olivine Vein
                Materials.Olivine.getGems(1),

                // Manganese Vein

                // Nickel Vein

                // Copper Vein

                // Gold Vein

                // Beryllium Vein
                Materials.Emerald.getGems(1),

                // Platinum Vein
                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L)

            // Tetrahedrite Vein

            // Naquadah Vein

            // Cassiterite Vein

            // Small Ore Stats
            // Silver Ore

            // Tin Ore

            // Lead Ore

            // Gold Ore

            // Zinc Ore

            // Nickel Ore
            });

        // T1 - Moon - Mo
        VoidGemRecipes.put(
            "Mo",
            new ItemStack[] {
                // Molybdenum Vein

                // Quartz Vein
                Materials.CertusQuartz.getGems(1), Materials.Quartzite.getGems(1),

                // Monazite Vein
                Materials.Monazite.getGems(1),

                // Ilmenite Vein
                Materials.GarnetYellow.getGems(1)

            // Copper Vein

            // Bauxite Vein

            // Galena Vein

            // Cassiterite Vein

            // Small Ore Stats
            // Meteoric Iron Ore
            });

        // T2 - Deimos - De
        VoidGemRecipes.put(
            "De",
            new ItemStack[] {
                // Uranium 238 Vein

                // Tungstate Vein

                // Sulfur Vein

                // Lapis Vein
                Materials.Lapis.getGems(1), Materials.Lazurite.getGems(1), Materials.Sodalite.getGems(1),

                // Draconium Vein
                Materials.Jade.getGems(1), Materials.Vinteum.getGems(1),

                // Monazite Vein
                Materials.Monazite.getGems(1),

                // Nickel Vein

                // Tetrahedrite Vein

                // Oriharukon Vein
                Materials.Opal.getGems(1), Materials.Tanzanite.getGems(1),

                // Magnetite Vein

                // Small Ore Stats
                // Saltpeter Ore

                // Titanium Ore

                // Tin Ore

                // Lead Ore

                // Diamond Ore
                Materials.Diamond.getGems(1)

            // Draconium Ore

            // Chromite Ore

            // Tungstate Ore

            // Meteoric Iron Ore

            // Desh Ore

            // Nickel Ore
            });

        // T2 - Mars - Ma
        VoidGemRecipes.put(
            "Ma",
            new ItemStack[] {
                // Tungstate Vein

                // Sulfur Vein

                // Desh Vein

                // Pitchblende Vein

                // Quartz Vein
                Materials.CertusQuartz.getGems(1), Materials.Quartzite.getGems(1),

                // Redstone Vein
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3),

                // Nickel Vein

                // Arsenic Vein

                // Gold Vein

                // Iron Vein
                getModItem(BiomesOPlenty.ID, "gems", 1L, 5),

                // Beryllium Vein
                Materials.Emerald.getGems(1),

                // Tetrahedrite Vein

                // Galena Vein

                // Salt Vein
                Materials.RockSalt.getGems(1), Materials.Salt.getGems(1), Materials.Spodumene.getGems(1)

            // Small Ore Stats
            // Saltpeter Ore

            // Iron Ore

            // Copper Ore

            // Titanium Ore

            // Oriharukon Ore

            // Tin Ore

            // Lead Ore

            // Redstone Ore

            // Gold Ore

            // Chromite Ore

            // Tungstate Ore

            // Meteoric Iron Ore

            // Bismuth Ore

            // Zinc Ore

            // Nickel Ore
            });

        // T2 - Phobos - Ph
        VoidGemRecipes.put(
            "Ph",
            new ItemStack[] {
                // Uranium 238 Vein

                // Sulfur Vein

                // Diamond Vein
                Materials.Coal.getGems(1), Materials.Diamond.getGems(1), Materials.Lignite.getGems(1),

                // Molybdenum Vein

                // Pitchblende Vein

                // Quartz Vein
                Materials.CertusQuartz.getGems(1), Materials.Quartzite.getGems(1),

                // Draconium Vein
                Materials.Jade.getGems(1), Materials.Vinteum.getGems(1),

                // Nickel Vein

                // Arsenic Vein

                // Bauxite Vein

                // Gold Vein

                // Oriharukon Vein
                Materials.Opal.getGems(1), Materials.Tanzanite.getGems(1),

                // Small Ore Stats
                // Iron Ore

                // Copper Ore

                // Titanium Ore

                // Gold Ore

                // Draconium Ore

                // Chromite Ore

                // Tungstate Ore

                // Meteoric Iron Ore

                // Lapis Ore
                Materials.Lapis.getGems(1)

            // Desh Ore
            });

        // T3 - Asteroids - As
        VoidGemRecipes.put(
            "As",
            new ItemStack[] {
                // Tungstate Vein

                // Ilmenite Vein
                Materials.GarnetYellow.getGems(1),

                // Bauxite Vein

                // Gold Vein

                // Tetrahedrite Vein

                // Naquadah Vein

                // Small Ore Stats
                // Iron Ore

                // Titanium Ore

                // Lead Ore

                // Gold Ore

                // Diamond Ore
                Materials.Diamond.getGems(1)

            // Chromite Ore

            // Tungstate Ore

            // Nickel Ore
            });

        // T3 - Callisto - Ca
        VoidGemRecipes.put(
            "Ca",
            new ItemStack[] {
                // Tungstate Vein

                // Plutonium 239 Vein

                // Monazite Vein
                Materials.Monazite.getGems(1),

                // Ilmenite Vein
                Materials.GarnetYellow.getGems(1),

                // Palladium Vein

                // Callisto Ice Vein
                Materials.BlueTopaz.getGems(1), Materials.Topaz.getGems(1),

                // Copper Vein

                // Gold Vein

                // Iron Vein
                getModItem(BiomesOPlenty.ID, "gems", 1L, 5),

                // Small Ore Stats
                // Iron Ore

                // Mytryl Ore

                // Titanium Ore

                // Ledox Ore

                // Gold Ore

                // Diamond Ore
                Materials.Diamond.getGems(1)

            // Chromite Ore

            // Tungstate Ore

            // Desh Ore

            // Bismuth Ore
            });

        // T3 - Ceres - Ce
        VoidGemRecipes.put(
            "Ce",
            new ItemStack[] {
                // Uranium 238 Vein

                // Plutonium 239 Vein

                // Lapis Vein
                Materials.Lapis.getGems(1), Materials.Lazurite.getGems(1), Materials.Sodalite.getGems(1),

                // Molybdenum Vein

                // Olivine Vein
                Materials.Olivine.getGems(1),

                // Manganese Vein

                // Palladium Vein

                // Copper Vein

                // Soapstone Vein

                // Iron Vein
                getModItem(BiomesOPlenty.ID, "gems", 1L, 5),

                // Beryllium Vein
                Materials.Emerald.getGems(1),

                // Electrotine Vein

                // Magnetite Vein

                // Small Ore Stats
                // Titanium Ore

                // Oriharukon Ore

                // Lead Ore

                // Gold Ore

                // Diamond Ore
                Materials.Diamond.getGems(1)

            // Chromite Ore

            // Tungstate Ore

            // Bismuth Ore

            // Nickel Ore

            // Quantium Ore

            // Naquadah Ore
            });

        // T3 - Europa - Eu
        VoidGemRecipes.put(
            "Eu",
            new ItemStack[] {
                // Magnesite Vein
                Materials.Opal.getGems(1),

                // Basaltic Mineral Sand Vein

                // Chrome Vein

                // Ledox Vein
                Materials.Opal.getGems(1),

                // Tin Vein
                Materials.GarnetRed.getGems(1) });

        // T3 - Ganymede - Ga
        VoidGemRecipes.put(
            "Ga",
            new ItemStack[] {
                // Uranium 238 Vein

                // Tungstate Vein

                // Plutonium 239 Vein

                // Diamond Vein
                Materials.Coal.getGems(1), Materials.Diamond.getGems(1), Materials.Lignite.getGems(1),

                // Redstone Vein
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3),

                // Ilmenite Vein
                Materials.GarnetYellow.getGems(1),

                // Palladium Vein

                // Bauxite Vein

                // Iron Vein
                getModItem(BiomesOPlenty.ID, "gems", 1L, 5),

                // Tetrahedrite Vein

                // Galena Vein

                // Small Ore Stats
                // Saltpeter Ore

                // Iron Ore

                // Titanium Ore

                // Tin Ore

                // Lead Ore

                // Redstone Ore

                // Draconium Ore

                // Chromite Ore

                // Tungstate Ore

                // Lapis Ore
                Materials.Lapis.getGems(1)

            // Zinc Ore
            });

        // T3 - Ross128b - Rb
        VoidGemRecipes.put(
            "Rb",
            new ItemStack[] {
                // Bismutite & Bismuthinite Vein
                WerkstoffLoader.Bismutite.get(OrePrefixes.gem, 1),

                // Olenite & Fluor-Buergerite & Chromo-Alumino-Povondraite & Vanadio-Oxy-Dravit Vein
                WerkstoffLoader.ChromoAluminoPovondrait.get(OrePrefixes.gem, 1),
                WerkstoffLoader.FluorBuergerit.get(OrePrefixes.gem, 1), WerkstoffLoader.Olenit.get(OrePrefixes.gem, 1),
                WerkstoffLoader.VanadioOxyDravit.get(OrePrefixes.gem, 1),

                // Arsenopyrite & Ferberite & Loellingite & Roquesite Vein

                // Ferberite & Huebnerite & Loellingite Vein

                // Djurleite & Bornite & Wittichenite Vein

                // Thorianite Vein
                WerkstoffLoader.Spodumen.get(OrePrefixes.gem, 1),

                // Fayalite & Green Fuchsite & Red Zircon & Red Fuchsite Vein
                WerkstoffLoader.Fayalit.get(OrePrefixes.gem, 1), WerkstoffLoader.RedZircon.get(OrePrefixes.gem, 1),

                // Forsterite & Fayalite & Orange Descloizite & Red Descloizite Vein
                WerkstoffLoader.Fayalit.get(OrePrefixes.gem, 1), WerkstoffLoader.Forsterit.get(OrePrefixes.gem, 1) });

        // T4 - Io - Io
        VoidGemRecipes.put(
            "Io",
            new ItemStack[] {
                // Plutonium 239 Vein

                // Sulfur Vein

                // Manganese Vein

                // Pitchblende Vein

                // Quartz Vein
                Materials.CertusQuartz.getGems(1), Materials.Quartzite.getGems(1),

                // Pyrolusite Vein
                Materials.Apatite.getGems(1), Materials.TricalciumPhosphate.getGems(1),

                // Infused Gold Vein

                // Monazite Vein
                Materials.Monazite.getGems(1),

                // Palladium Vein

                // Mytryl Vein
                Materials.Jasper.getGems(1),

                // Magnetite Vein

                // Iridium Vein
                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),

                // Cassiterite Vein

                // Small Ore Stats
                // Saltpeter Ore

                // Iron Ore

                // Silver Ore

                // Titanium Ore

                // Redstone Ore

                // Chromite Ore

                // Tungstate Ore

                // Meteoric Iron Ore

                // Firestone Ore
                getModItem(Railcraft.ID, "firestone.raw", 1L),

                // Lapis Ore
                Materials.Lapis.getGems(1)

            // Tungsten Ore

            // Bismuth Ore

            // Zinc Ore

            // Quantium Ore

            // Naquadah Ore
            });

        // T4 - Mercury - Me
        VoidGemRecipes.put(
            "Me",
            new ItemStack[] {
                // Diamond Vein
                Materials.Coal.getGems(1), Materials.Diamond.getGems(1), Materials.Lignite.getGems(1),

                // Molybdenum Vein

                // Draconium Vein
                Materials.Jade.getGems(1), Materials.Vinteum.getGems(1),

                // Redstone Vein
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3),

                // Ilmenite Vein
                Materials.GarnetYellow.getGems(1),

                // Palladium Vein

                // Arsenic Vein

                // Bauxite Vein

                // Iron Vein
                getModItem(BiomesOPlenty.ID, "gems", 1L, 5),

                // Naquadah Vein

                // Iridium Vein
                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L)

            // Small Ore Stats
            // Titanium Ore

            // Deep Iron Ore

            // Oriharukon Ore

            // Lead Ore

            // Redstone Ore

            // Ledox Ore

            // Chromite Ore

            // Tungstate Ore

            // Desh Ore

            // Bismuth Ore

            // Zinc Ore

            // Nickel Ore

            // Naquadah Ore
            });

        // T4 - Venus - Ve
        VoidGemRecipes.put(
            "Ve",
            new ItemStack[] {
                // Sulfur Vein

                // Pitchblende Vein

                // Quartz Vein
                Materials.CertusQuartz.getGems(1), Materials.Quartzite.getGems(1),

                // Redstone Vein
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3),

                // Monazite Vein
                Materials.Monazite.getGems(1),

                // Nickel Vein

                // Beryllium Vein
                Materials.Emerald.getGems(1),

                // Tetrahedrite Vein

                // Galena Vein

                // Naquadah Vein

                // Rutile Vein

                // Quantium Vein
                Materials.Amethyst.getGems(1),

                // Iridium Vein
                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),

                // Cassiterite Vein

                // Small Ore Stats
                // Saltpeter Ore

                // Mytryl Ore

                // Titanium Ore

                // Lead Ore

                // Gold Ore

                // Diamond Ore
                Materials.Diamond.getGems(1),
                // Draconium Ore

                // Chromite Ore

                // Tungstate Ore

                // Meteoric Iron Ore

                // Firestone Ore
                getModItem(Railcraft.ID, "firestone.raw", 1L)

            // Tungsten Ore

            // Nickel Ore

            // Naquadah Ore
            });

        // T5 - Enceladus - En
        VoidGemRecipes.put(
            "En",
            new ItemStack[] {
                // Uranium 238 Vein

                // Tungstate Vein

                // Lapis Vein
                Materials.Lapis.getGems(1), Materials.Lazurite.getGems(1), Materials.Sodalite.getGems(1),

                // Osmium Vein
                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),

                // Monazite Vein
                Materials.Monazite.getGems(1),

                // Copper Vein

                // Vanadium Vein

                // Ledox Vein
                Materials.Opal.getGems(1),

                // Iridium Vein
                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),

                // Small Ore Stats
                // Saltpeter Ore

                // Iron Ore

                // Silver Ore

                // Titanium Ore

                // Ledox Ore

                // Neutronium Ore

                // Chromite Ore

                // Tungstate Ore

                // Lapis Ore
                Materials.Lapis.getGems(1)

            // Zinc Ore

            // Naquadah Ore
            });

        // T5 - Miranda - Mi
        VoidGemRecipes.put(
            "Mi",
            new ItemStack[] {
                // Diamond Vein
                Materials.Coal.getGems(1), Materials.Diamond.getGems(1), Materials.Lignite.getGems(1),

                // Osmium Vein
                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),

                // Desh Vein

                // Draconium Vein
                Materials.Jade.getGems(1), Materials.Vinteum.getGems(1),

                // Redstone Vein
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3),

                // Pyrolusite Vein
                Materials.Apatite.getGems(1), Materials.TricalciumPhosphate.getGems(1),

                // Ilmenite Vein
                Materials.GarnetYellow.getGems(1),

                // Tetrahedrite Vein

                // Iridium Vein
                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L)

            // Cassiterite Vein

            // Small Ore Stats
            // Iron Ore

            // Mytryl Ore

            // Titanium Ore

            // Gold Ore

            // Tungstate Ore

            // Desh Ore
            });

        // T5 - Oberon - Ob
        VoidGemRecipes.put(
            "Ob",
            new ItemStack[] {
                // Tungstate Vein

                // Osmium Vein
                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),

                // Tungsten Vein

                // Manganese Vein

                // Pitchblende Vein

                // Palladium Vein

                // Iron Vein
                getModItem(BiomesOPlenty.ID, "gems", 1L, 5),

                // Galena Vein

                // Naquadah Vein

                // Small Ore Stats
                // Silver Ore

                // Titanium Ore

                // Lead Ore

                // Ledox Ore

                // Neutronium Ore

                // Diamond Ore
                Materials.Diamond.getGems(1),

                // Draconium Ore

                // Chromite Ore

                // Tungstate Ore

                // Lapis Ore
                Materials.Lapis.getGems(1) });

        // T5 - Titan - Ti
        VoidGemRecipes.put(
            "Ti",
            new ItemStack[] {
                // Diamond Vein
                Materials.Coal.getGems(1), Materials.Diamond.getGems(1), Materials.Lignite.getGems(1),

                // Molybdenum Vein

                // Osmium Vein
                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),

                // Manganese Vein

                // Infused Gold Vein

                // Monazite Vein
                Materials.Monazite.getGems(1),

                // Nickel Vein

                // Ilmenite Vein
                Materials.GarnetYellow.getGems(1),

                // Arsenic Vein

                // Bauxite Vein

                // Beryllium Vein
                Materials.Emerald.getGems(1),

                // Naquadah Vein

                // Rutile Vein

                // Iridium Vein
                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),

                // Small Ore Stats
                // Iron Ore

                // Silver Ore

                // Titanium Ore

                // Oriharukon Ore

                // Tin Ore

                // Redstone Ore

                // Neutronium Ore

                // Diamond Ore
                Materials.Diamond.getGems(1)

            // Chromite Ore

            // Tungstate Ore

            // Zinc Ore

            // Quantium Ore
            });

        // T5 - Ross128ba - Ra
        VoidGemRecipes.put(
            "Ra",
            new ItemStack[] {
                // Olenite & Fluor-Buergerite & Chromo-Alumino-Povondraite & Vanadio-Oxy-Dravit Vein Vein
                WerkstoffLoader.ChromoAluminoPovondrait.get(OrePrefixes.gem, 1),
                WerkstoffLoader.FluorBuergerit.get(OrePrefixes.gem, 1), WerkstoffLoader.Olenit.get(OrePrefixes.gem, 1),
                WerkstoffLoader.VanadioOxyDravit.get(OrePrefixes.gem, 1),

                // Ferberite & Huebnerite & Loellingite Vein

                // Hedenbergite & Fayalite & Orange Descloizite & Red Descloizite Vein
                WerkstoffLoader.Hedenbergit.get(OrePrefixes.gem, 1), WerkstoffLoader.Fayalit.get(OrePrefixes.gem, 1),

                // Prasiolite & Hedenbergite Vein
                Materials.Amethyst.getGems(1), Materials.Olivine.getGems(1),
                WerkstoffLoader.Hedenbergit.get(OrePrefixes.gem, 1), WerkstoffLoader.Prasiolite.get(OrePrefixes.gem, 1),

                // BArTiMaEuSNeK Vein
                WerkstoffLoader.BArTiMaEuSNeK.get(OrePrefixes.gem, 1),

                // Tiberium Vein
                WerkstoffLoader.Tiberium.get(OrePrefixes.gem, 1),

                // Fluorspar Vein
                Materials.GarnetYellow.getGems(1), WerkstoffLoader.Fluorspar.get(OrePrefixes.gem, 1) });

        // T6 - Proteus - Pr
        VoidGemRecipes.put(
            "Pr",
            new ItemStack[] {
                // Uranium 238 Vein

                // Diamond Vein
                Materials.Coal.getGems(1), Materials.Diamond.getGems(1), Materials.Lignite.getGems(1),

                // Molybdenum Vein

                // Osmium Vein
                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),

                // Tungsten Vein

                // Quartz Vein
                Materials.CertusQuartz.getGems(1), Materials.Quartzite.getGems(1),

                // Infused Gold Vein

                // Ilmenite Vein
                Materials.GarnetYellow.getGems(1)

            // Copper Vein

            // Vanadium Vein

            // Bauxite Vein

            // Neutronium Vein

            // Small Ore Stats
            // Saltpeter Ore

            // Copper Ore

            // Silver Ore

            // Mytryl Ore

            // Titanium Ore

            // Tin Ore

            // Redstone Ore

            // Neutronium Ore

            // Chromite Ore

            // Tungstate Ore

            // Desh Ore

            // Bismuth Ore

            // Zinc Ore

            // Naquadah Ore
            });

        // T6 - Triton - Tr
        VoidGemRecipes.put(
            "Tr",
            new ItemStack[] {
                // Tungstate Vein

                // Tungsten Vein

                // Manganese Vein

                // Monazite Vein
                Materials.Monazite.getGems(1),

                // Nickel Vein

                // Thorium Vein

                // Neutronium Vein

                // Gold Vein

                // Galena Vein

                // Niobium Vein

                // Iridium Vein
                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),

                // Small Ore Stats
                // Iron Ore

                // Copper Ore

                // Silver Ore

                // Titanium Ore

                // Oriharukon Ore

                // Lead Ore

                // Neutronium Ore

                // Diamond Ore
                Materials.Diamond.getGems(1)

            // Black Plutonium Ore

            // Chromite Ore

            // Tungstate Ore

            // Desh Ore
            });

        // T7 - Haumea - Ha
        VoidGemRecipes.put(
            "Ha",
            new ItemStack[] {
                // Uranium 238 Vein

                // Tungstate Vein

                // Olivine Vein
                Materials.Olivine.getGems(1),

                // Pitchblende Vein

                // Infused Gold Vein

                // Monazite Vein
                Materials.Monazite.getGems(1),

                // Thorium Vein

                // Bauxite Vein

                // Neutronium Vein

                // Nether Star Vein
                Materials.GarnetRed.getGems(1), Materials.GarnetYellow.getGems(1), Materials.NetherStar.getGems(1),

                // Beryllium Vein
                Materials.Emerald.getGems(1)

            // Naquadah Vein

            // Small Ore Stats
            // Iron Ore

            // Titanium Ore

            // Oriharukon Ore

            // Ledox Ore

            // Neutronium Ore

            // Black Plutonium Ore

            // Draconium Ore

            // Chromite Ore

            // Desh Ore

            // Zinc Ore

            // Quantium Ore
            });

        // T7 - Kuiperbelt - KB
        VoidGemRecipes.put(
            "KB",
            new ItemStack[] {
                // Uranium 238 Vein

                // Tungstate Vein

                // Diamond Vein
                Materials.Coal.getGems(1), Materials.Diamond.getGems(1), Materials.Lignite.getGems(1),

                // Osmium Vein
                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),

                // Pitchblende Vein

                // Nickel Vein

                // Palladium Vein

                // Bauxite Vein

                // Neutronium Vein

                // Tetrahedrite Vein

                // Naquadah Vein

                // Iridium Vein
                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),

                // Small Ore Stats
                // Iron Ore

                // Titanium Ore

                // Lead Ore

                // Neutronium Ore

                // Gold Ore

                // Diamond Ore
                Materials.Diamond.getGems(1)

            // Chromite Ore

            // Tungstate Ore

            // Nickel Ore

            // Naquadah Ore
            });

        // T7 - Makemake - MM
        VoidGemRecipes.put(
            "MM",
            new ItemStack[] {
                // Uranium 238 Vein

                // Tungstate Vein

                // Olivine Vein
                Materials.Olivine.getGems(1),

                // Pitchblende Vein

                // Monazite Vein
                Materials.Monazite.getGems(1),

                // Black Plutonium Vein
                Materials.GarnetRed.getGems(1), Materials.GarnetYellow.getGems(1),

                // Vanadium Vein

                // Bauxite Vein

                // Neutronium Vein

                // Beryllium Vein
                Materials.Emerald.getGems(1),

                // Red Garnet Vein
                Materials.GarnetRed.getGems(1), Materials.GarnetYellow.getGems(1)

            // Niobium Vein

            // Magnetite Vein

            // Small Ore Stats
            // Mytryl Ore

            // Titanium Ore

            // Oriharukon Ore

            // Lead Ore

            // Neutronium Ore

            // Black Plutonium Ore

            // Draconium Ore

            // Chromite Ore

            // Desh Ore

            // Bismuth Ore

            // Nickel Ore

            // Quantium Ore
            });

        // T7 - Pluto - Pl
        VoidGemRecipes.put(
            "Pl",
            new ItemStack[] {
                // Tungstate Vein

                // Diamond Vein
                Materials.Coal.getGems(1), Materials.Diamond.getGems(1), Materials.Lignite.getGems(1),

                // Molybdenum Vein

                // Osmium Vein
                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),

                // Tungsten Vein

                // Black Plutonium Vein
                Materials.GarnetRed.getGems(1), Materials.GarnetYellow.getGems(1),

                // Ilmenite Vein
                Materials.GarnetYellow.getGems(1),

                // Palladium Vein

                // Thorium Vein

                // Bauxite Vein

                // Neutronium Vein

                // Gold Vein

                // Iron Vein
                getModItem(BiomesOPlenty.ID, "gems", 1L, 5),

                // Beryllium Vein
                Materials.Emerald.getGems(1)

            // Naquadah Vein

            // Small Ore Stats
            // Silver Ore

            // Titanium Ore

            // Lead Ore

            // Ledox Ore

            // Neutronium Ore

            // Gold Ore

            // Black Plutonium Ore

            // Draconium Ore

            // Chromite Ore

            // Tungstate Ore

            // Meteoric Iron Ore

            // Nickel Ore

            // Quantium Ore

            // Naquadah Ore
            });

        // T8 - BarnardC - BC
        VoidGemRecipes.put(
            "BC",
            new ItemStack[] {
                // Oilsands Vein

                // Osmium Vein
                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),

                // Tungsten Vein

                // Samarium Vein
                Materials.Monazite.getGems(1),

                // Mica Vein

                // Black Plutonium Vein
                Materials.GarnetRed.getGems(1), Materials.GarnetYellow.getGems(1),

                // Arsenic Vein

                // Lignite Coal Vein
                Materials.Coal.getGems(1), Materials.Lignite.getGems(1),

                // Basaltic Mineral Sand Vein

                // Salt Vein
                Materials.RockSalt.getGems(1), Materials.Salt.getGems(1), Materials.Spodumene.getGems(1) });

        // T8 - BarnardE - BE
        VoidGemRecipes.put(
            "BE",
            new ItemStack[] {
                // Uranium 238 Vein

                // Molybdenum Vein

                // Olivine Vein
                Materials.Olivine.getGems(1),

                // Tungsten Vein

                // Manganese Vein

                // Infused Gold Vein

                // Rare Earth Vein

                // Thorium Vein

                // Copper Vein

                // Neutronium Vein

                // Nether Star Vein
                Materials.GarnetRed.getGems(1), Materials.GarnetYellow.getGems(1), Materials.NetherStar.getGems(1)

            // Naquadah Vein

            // Magnetite Vein

            // Small Ore Stats
            // Awakened Draconium Ore

            // Iron Ore

            // Titanium Ore

            // Neutronium Ore

            // Black Plutonium Ore

            // Zinc Ore

            // Nickel Ore

            // Naquadah Ore
            });

        // T8 - BarnardF - BF
        VoidGemRecipes.put(
            "BF",
            new ItemStack[] {
                // Diamond Vein
                Materials.Coal.getGems(1), Materials.Diamond.getGems(1), Materials.Lignite.getGems(1),

                // Tungsten Vein

                // Manganese Vein

                // Pitchblende Vein

                // Redstone Vein
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3),

                // Monazite Vein
                Materials.Monazite.getGems(1),

                // Rare Earth Vein

                // Thorium Vein

                // Copper Vein

                // Vanadium Vein

                // Neutronium Vein

                // Gold Vein

                // Beryllium Vein
                Materials.Emerald.getGems(1),

                // Red Garnet Vein
                Materials.GarnetRed.getGems(1), Materials.GarnetYellow.getGems(1)

            // Naquadah Vein

            // Niobium Vein

            // Small Ore Stats
            // Awakened Draconium Ore

            // Iron Ore

            // Titanium Ore

            // Neutronium Ore

            // Gold Ore

            // Black Plutonium Ore

            // Realgar Ore

            // Nickel Ore

            // Naquadah Ore

            // Bedrockium Ore
            });

        // T8 - α Centauri Bb - CB
        VoidGemRecipes.put(
            "CB",
            new ItemStack[] {
                // Sulfur Vein

                // Manganese Vein

                // Samarium Vein
                Materials.Monazite.getGems(1),

                // Pitchblende Vein

                // Quartz Vein
                Materials.CertusQuartz.getGems(1), Materials.Quartzite.getGems(1),

                // Redstone Vein
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3),

                // Black Plutonium Vein
                Materials.GarnetRed.getGems(1), Materials.GarnetYellow.getGems(1),

                // Rare Earth Vein

                // Beryllium Vein
                Materials.Emerald.getGems(1),

                // Electrotine Vein

                // Tetrahedrite Vein

                // Tin Vein
                Materials.GarnetRed.getGems(1),

                // Nether Quartz Vein
                Materials.CertusQuartz.getGems(1), Materials.Quartz.getGems(1), Materials.Quartzite.getGems(1) });

        // T8 - TCetiE - TE
        VoidGemRecipes.put(
            "TE",
            new ItemStack[] {
                // Oilsands Vein

                // Magnesite Vein
                Materials.Opal.getGems(1),

                // Quartz Vein
                Materials.CertusQuartz.getGems(1), Materials.Quartzite.getGems(1),

                // Black Plutonium Vein
                Materials.GarnetRed.getGems(1), Materials.GarnetYellow.getGems(1),

                // Ilmenite Vein
                Materials.GarnetYellow.getGems(1),

                // Bauxite Vein

                // Gold Vein

                // Kaolinite Vein

                // Nether Star Vein
                Materials.GarnetRed.getGems(1), Materials.GarnetYellow.getGems(1), Materials.NetherStar.getGems(1),

                // Apatite Vein
                Materials.Apatite.getGems(1), Materials.TricalciumPhosphate.getGems(1),

                // Chrome Vein

                // Magnetite Vein

                // Salt Vein
                Materials.RockSalt.getGems(1), Materials.Salt.getGems(1), Materials.Spodumene.getGems(1),

                // Cassiterite Vein

                // Small Ore Stats
                // Awakened Draconium Ore

                // Neutronium Ore

                // Lapis Ore
                Materials.Lapis.getGems(1) });

        // T8 - VegaB - VB
        VoidGemRecipes.put(
            "VB",
            new ItemStack[] {
                // Tungstate Vein

                // Lapis Vein
                Materials.Lapis.getGems(1), Materials.Lazurite.getGems(1), Materials.Sodalite.getGems(1),

                // Pitchblende Vein

                // Redstone Vein
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3),

                // Infused Gold Vein

                // Rare Earth Vein

                // Thorium Vein

                // Arsenic Vein

                // Vanadium Vein

                // Neutronium Vein

                // Gold Vein

                // Nether Star Vein
                Materials.GarnetRed.getGems(1), Materials.GarnetYellow.getGems(1), Materials.NetherStar.getGems(1),

                // Red Garnet Vein
                Materials.GarnetRed.getGems(1), Materials.GarnetYellow.getGems(1),

                // Tetrahedrite Vein

                // Galena Vein

                // Naquadah Vein

                // Niobium Vein

                // Small Ore Stats
                // Awakened Draconium Ore

                // Silver Ore

                // Lead Ore

                // Neutronium Ore

                // Infinity Catalyst Ore

                // Diamond Ore
                Materials.Diamond.getGems(1)

            // Black Plutonium Ore

            // Chromite Ore

            // Bismuth Ore
            });

        // T9 - Anubis - An
        VoidGemRecipes.put(
            "An",
            new ItemStack[] {
                // Sulfur Vein

                // Infinity Catalyst Vein

                // Olivine Vein
                Materials.Olivine.getGems(1),

                // Desh Vein

                // Mica Vein

                // Cryolite Vein

                // Dolomite Vein
                Materials.GarnetYellow.getGems(1),

                // Callisto Ice Vein
                Materials.BlueTopaz.getGems(1), Materials.Topaz.getGems(1),

                // Soapstone Vein

                // Mytryl Vein
                Materials.Jasper.getGems(1)

            // Rutile Vein

            // Basaltic Mineral Sand Vein

            // Small Ore Stats
            // Infinity Catalyst Ore
            });

        // T9 - Horus - Ho
        VoidGemRecipes.put(
            "Ho",
            new ItemStack[] {
                // Magnesite Vein
                Materials.Opal.getGems(1),

                // Certus Quartz Vein
                Materials.CertusQuartz.getGems(1), Materials.Quartzite.getGems(1),
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 1),

                // Quartz Vein
                Materials.CertusQuartz.getGems(1), Materials.Quartzite.getGems(1),

                // Draconium Vein
                Materials.Jade.getGems(1), Materials.Vinteum.getGems(1),

                // Sapphire Vein
                Materials.GreenSapphire.getGems(1), Materials.Sapphire.getGems(1),

                // Black Plutonium Vein
                Materials.GarnetRed.getGems(1), Materials.GarnetYellow.getGems(1),

                // Cosmic Neutronium Vein

                // Mytryl Vein
                Materials.Jasper.getGems(1),

                // Nether Star Vein
                Materials.GarnetRed.getGems(1), Materials.GarnetYellow.getGems(1), Materials.NetherStar.getGems(1),

                // Red Garnet Vein
                Materials.GarnetRed.getGems(1), Materials.GarnetYellow.getGems(1),

                // Oriharukon Vein
                Materials.Opal.getGems(1), Materials.Tanzanite.getGems(1),

                // Quantium Vein
                Materials.Amethyst.getGems(1),

                // Ledox Vein
                Materials.Opal.getGems(1),

                // Small Ore Stats
                // Amethyst Ore
                Materials.Amethyst.getGems(1),

                // Red Garnet Ore
                Materials.GarnetRed.getGems(1),

                // Yellow Garnet Ore
                Materials.GarnetYellow.getGems(1),

                // Tanzanite Ore
                Materials.Tanzanite.getGems(1),

                // Spinel Ore

                // Opal Ore
                Materials.Opal.getGems(1),

                // Charged Certus Quartz Ore
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 1),

                // Mytryl Ore

                // Ruby Ore
                Materials.Ruby.getGems(1),

                // Emerald Ore
                Materials.Emerald.getGems(1),

                // Blue Topaz Ore
                Materials.BlueTopaz.getGems(1),

                // Topaz Ore
                Materials.Topaz.getGems(1),

                // Certus Quartz Ore
                Materials.CertusQuartz.getGems(1),

                // Jade Ore

                // Green Sapphire Ore
                Materials.GreenSapphire.getGems(1),

                // Sapphire Ore
                Materials.Sapphire.getGems(1),

                // Jasper Ore
                Materials.Jasper.getGems(1),

                // Olivine Ore
                Materials.Olivine.getGems(1) });

        // T9 - Maahes - Mh
        VoidGemRecipes.put(
            "Mh",
            new ItemStack[] {
                // Naquadria Vein

                // Cryolite Vein

                // Callisto Ice Vein
                Materials.BlueTopaz.getGems(1), Materials.Topaz.getGems(1),

                // Vanadium Vein

                // Soapstone Vein

                // Neutronium Vein

                // Platinum Vein
                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),

                // Naquadah Vein

                // Basaltic Mineral Sand Vein

                // Quantium Vein
                Materials.Amethyst.getGems(1)

            // Chrome Vein
            });

        // T9 - MehenBelt - MB
        VoidGemRecipes.put(
            "MB",
            new ItemStack[] {
                // Uranium 238 Vein

                // Lapis Vein
                Materials.Lapis.getGems(1), Materials.Lazurite.getGems(1), Materials.Sodalite.getGems(1),

                // Awakened Draconium Vein
                Materials.NetherStar.getGems(1),

                // Olivine Vein
                Materials.Olivine.getGems(1),

                // Osmium Vein
                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),

                // Nickel Vein

                // Ilmenite Vein
                Materials.GarnetYellow.getGems(1),

                // Palladium Vein

                // Neutronium Vein

                // Platinum Vein
                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),

                // Iridium Vein
                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),

                // Cassiterite Vein

                // Small Ore Stats
                // Titanium Ore

                // Tin Ore

                // Neutronium Ore

                // Chromite Ore

                // Lapis Ore
                Materials.Lapis.getGems(1),

                // Nickel Ore

                // Olivine Ore
                Materials.Olivine.getGems(1) });

        // T9 - Neper - Np
        VoidGemRecipes.put(
            "Np",
            new ItemStack[] {
                // Tungsten Vein

                // Terra & Aer Vein
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 0), getModItem(Thaumcraft.ID, "ItemShard", 1L, 3),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3), getModItem(Thaumcraft.ID, "ItemResource", 1L, 6),

                // Certus Quartz Vein
                Materials.CertusQuartz.getGems(1), Materials.Quartzite.getGems(1),
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 1),

                // Quartzite Vein
                Materials.CertusQuartz.getGems(1), Materials.Quartzite.getGems(1),

                // Dilithium Vein
                Materials.Dilithium.getGems(1),

                // Mica Vein

                // Dolomite Vein
                Materials.GarnetYellow.getGems(1),

                // Arsenic Vein

                // Perditio & Ordo Vein
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 4), getModItem(Thaumcraft.ID, "ItemShard", 1L, 5),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3), getModItem(Thaumcraft.ID, "ItemResource", 1L, 6),

                // Kaolinite Vein

                // Aqua & Ignis Vein
                getModItem(Thaumcraft.ID, "ItemShard", 1L, 1), getModItem(Thaumcraft.ID, "ItemShard", 1L, 2),
                getModItem(Thaumcraft.ID, "ItemResource", 1L, 3), getModItem(Thaumcraft.ID, "ItemResource", 1L, 6),

                // Nether Quartz Vein
                Materials.CertusQuartz.getGems(1), Materials.Quartz.getGems(1), Materials.Quartzite.getGems(1) });

        // T9 - Seth - Se
        VoidGemRecipes.put(
            "Se",
            new ItemStack[] {
                // Osmium Vein
                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L),

                // Samarium Vein
                Materials.Monazite.getGems(1),

                // Draconium Vein
                Materials.Jade.getGems(1), Materials.Vinteum.getGems(1),

                // Monazite Vein
                Materials.Monazite.getGems(1),

                // Palladium Vein

                // Bauxite Vein

                // Gold Vein

                // Raw Tengam Vein

                // Magnetite Vein

                // Iridium Vein
                getModItem(IndustrialCraft2.ID, "itemOreIridium", 1L)

            // Cassiterite Vein

            // Small Ore Stats
            // Awakened Draconium Ore

            // Draconium Ore
            });

        // T10 - DeepDark - DD
        VoidGemRecipes.put(
            "DD",
            new ItemStack[] { Materials.Coal.getGems(1), Materials.Charcoal.getGems(1), Materials.Diamond.getGems(1),
                Materials.Lapis.getGems(1), Materials.EnderPearl.getGems(1), Materials.EnderEye.getGems(1),
                Materials.Emerald.getGems(1), Materials.NetherStar.getGems(1), Materials.NetherQuartz.getGems(1),
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
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 12), // Pure Fluix Crystal

                WerkstoffLoader.Bismutite.get(OrePrefixes.gem, 1),
                WerkstoffLoader.CubicZirconia.get(OrePrefixes.gem, 1),
                WerkstoffLoader.FluorBuergerit.get(OrePrefixes.gem, 1),
                WerkstoffLoader.ChromoAluminoPovondrait.get(OrePrefixes.gem, 1),
                WerkstoffLoader.VanadioOxyDravit.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Olenit.get(OrePrefixes.gem, 1), WerkstoffLoader.RedZircon.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Salt.get(OrePrefixes.gem, 1), WerkstoffLoader.Spodumen.get(OrePrefixes.gem, 1),
                WerkstoffLoader.RockSalt.get(OrePrefixes.gem, 1), WerkstoffLoader.Fayalit.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Forsterit.get(OrePrefixes.gem, 1), WerkstoffLoader.Hedenbergit.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Prasiolite.get(OrePrefixes.gem, 1),
                WerkstoffLoader.MagnetoResonaticDust.get(OrePrefixes.gem, 1),
                WerkstoffLoader.BArTiMaEuSNeK.get(OrePrefixes.gem, 1), WerkstoffLoader.Tiberium.get(OrePrefixes.gem, 1),
                WerkstoffLoader.Fluorspar.get(OrePrefixes.gem, 1), GGMaterial.orundum.get(OrePrefixes.gem, 1),
                WerkstoffMaterialPool.CeriumDopedLutetiumAluminiumGarnet.get(OrePrefixes.gem, 1),
                WerkstoffMaterialPool.LanthanumHexaboride.get(OrePrefixes.gem, 1),

                Materials.Firestone.getGems(1), Materials.Ruby.getGems(1), Materials.Sapphire.getGems(1),
                Materials.GreenSapphire.getGems(1), Materials.Olivine.getGems(1), Materials.Topaz.getGems(1),
                Materials.Tanzanite.getGems(1), Materials.Amethyst.getGems(1), Materials.Opal.getGems(1),
                Materials.Jasper.getGems(1), Materials.BlueTopaz.getGems(1), Materials.Amber.getGems(1),
                Materials.Dilithium.getGems(1), Materials.CertusQuartz.getGems(1), Materials.Forcicium.getGems(1),
                Materials.Forcillium.getGems(1), Materials.Monazite.getGems(1), Materials.Force.getGems(1),
                Materials.Quartzite.getGems(1), Materials.Lazurite.getGems(1), Materials.Sodalite.getGems(1),
                Materials.GarnetRed.getGems(1), Materials.GarnetYellow.getGems(1), Materials.Vinteum.getGems(1),
                Materials.Apatite.getGems(1), Materials.Niter.getGems(1), Materials.TricalciumPhosphate.getGems(1),
                Materials.Jade.getGems(1), Materials.Lignite.getGems(1) });
    }
}
