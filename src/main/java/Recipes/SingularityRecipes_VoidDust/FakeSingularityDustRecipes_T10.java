package Recipes.SingularityRecipes_VoidDust;

import static gregtech.api.enums.Mods.AppliedEnergistics2;
import static gregtech.api.enums.Mods.GTPlusPlus;
import static gregtech.api.enums.Mods.GalaxySpace;
import static gregtech.api.enums.Mods.GoodGenerator;
import static gregtech.api.enums.Mods.KekzTech;
import static gregtech.api.enums.Mods.NEIOrePlugin;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import com.dreammaster.gthandler.CustomItemList;

import bartworks.system.material.WerkstoffLoader;
import goodgenerator.items.GGMaterial;
import gregtech.api.enums.GTValues;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.MaterialsBotania;
import gregtech.api.enums.MaterialsGTNH;
import gregtech.api.enums.MaterialsKevlar;
import gregtech.api.enums.MaterialsOreAlum;
import gregtech.api.enums.MaterialsUEVplus;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import gtnhlanth.common.register.BotWerkstoffMaterialPool;
import gtnhlanth.common.register.WerkstoffMaterialPool;
import util.OneToManyItemsFrontend;

public class FakeSingularityDustRecipes_T10 {

    public static final RecipeMap<RecipeMapBackend> addFakeVoidDustRecipes_T10 = RecipeMapBuilder
        .of("Singularity of T10 Dust")
        .maxIO(1, 135, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend::new)
        .build();

    public static void addFakeVoidDustRecipes_T10() {
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L))
            .itemOutputs(
                // GalaxySpace
                getModItem(GalaxySpace.ID, "item.GlowstoneDusts", 1L, 0), // Ceres Glowstone Dust
                getModItem(GalaxySpace.ID, "item.GlowstoneDusts", 1L, 1), // Io Glowstone Dust
                getModItem(GalaxySpace.ID, "item.GlowstoneDusts", 1L, 2), // Enceladus Glowstone Dust
                getModItem(GalaxySpace.ID, "item.GlowstoneDusts", 1L, 3), // Proteus Glowstone Dust
                getModItem(GalaxySpace.ID, "item.GlowstoneDusts", 1L, 4), // Pluto Glowstone Dust

                // GoodGenerator
                getModItem(GoodGenerator.ID, "aluminumNitride", 1L), // Aluminium Nitride Dust
                getModItem(GoodGenerator.ID, "specialCeramics", 1L), // Special Ceramics Dust

                // IndustrialCraft2
                ItemList.IC2_Energium_Dust.get(1),

                // AppliedEnergistics2
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 8), // Fluix Dust
                getModItem(AppliedEnergistics2.ID, "item.ItemMultiMaterial", 1L, 45) // Sky Stone Dust
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Dust Mode")
            .eut(0)
            .addTo(addFakeVoidDustRecipes_T10);

        // BartWorks
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L))
            .itemOutputs(
                WerkstoffLoader.Bismutite.get(OrePrefixes.dust, 1), // Bismutite
                WerkstoffLoader.Bismuthinit.get(OrePrefixes.dust, 1), // Bismuthinite
                WerkstoffLoader.Zirconium.get(OrePrefixes.dust, 1), // Zirconium
                WerkstoffLoader.CubicZirconia.get(OrePrefixes.dust, 1), // Cubic Zirconia
                WerkstoffLoader.FluorBuergerit.get(OrePrefixes.dust, 1), // Fluor-Buergerite
                WerkstoffLoader.YttriumOxide.get(OrePrefixes.dust, 1), // Yttrium Oxide
                WerkstoffLoader.ChromoAluminoPovondrait.get(OrePrefixes.dust, 1), // Chromo-Alumino-Povondraite
                WerkstoffLoader.VanadioOxyDravit.get(OrePrefixes.dust, 1), // Vanadio-Oxy-Dravite
                WerkstoffLoader.Olenit.get(OrePrefixes.dust, 1), // Olenite
                WerkstoffLoader.Arsenopyrite.get(OrePrefixes.dust, 1), // Arsenopyrite
                WerkstoffLoader.Ferberite.get(OrePrefixes.dust, 1), // Ferberite
                WerkstoffLoader.Loellingit.get(OrePrefixes.dust, 1), // Loellingite
                WerkstoffLoader.Roquesit.get(OrePrefixes.dust, 1), // Roquesite
                WerkstoffLoader.Bornite.get(OrePrefixes.dust, 1), // Bornite
                WerkstoffLoader.Wittichenit.get(OrePrefixes.dust, 1), // Wittichenite
                WerkstoffLoader.Djurleit.get(OrePrefixes.dust, 1), // Djurleite
                WerkstoffLoader.Huebnerit.get(OrePrefixes.dust, 1), // Huebnerite
                WerkstoffLoader.Thorianit.get(OrePrefixes.dust, 1), // Thorianite
                WerkstoffLoader.RedZircon.get(OrePrefixes.dust, 1), // Red Zircon
                WerkstoffLoader.Fayalit.get(OrePrefixes.dust, 1), // Fayalite
                WerkstoffLoader.Forsterit.get(OrePrefixes.dust, 1), // Forsterite
                WerkstoffLoader.Hedenbergit.get(OrePrefixes.dust, 1), // Hedenbergite
                WerkstoffLoader.DescloiziteZNVO4.get(OrePrefixes.dust, 1), // Red Descloizite
                WerkstoffLoader.DescloiziteCUVO4.get(OrePrefixes.dust, 1), // Orange Descloizite
                WerkstoffLoader.FuchsitAL.get(OrePrefixes.dust, 1), // Green Fuchsite
                WerkstoffLoader.FuchsitCR.get(OrePrefixes.dust, 1), // Red Fuchsite
                WerkstoffLoader.Thorium232.get(OrePrefixes.dust, 1), // Thorium 232
                WerkstoffLoader.BismuthTellurite.get(OrePrefixes.dust, 1), // Bismuth Telluride
                WerkstoffLoader.Tellurium.get(OrePrefixes.dust, 1), // Tellurium
                WerkstoffLoader.BismuthHydroBorat.get(OrePrefixes.dust, 1), // Dibismuthhydroborat
                WerkstoffLoader.ArInGaPhoBiBoTe.get(OrePrefixes.dust, 1), // Circuit Compound MK3
                WerkstoffLoader.Prasiolite.get(OrePrefixes.dust, 1), // Prasiolite
                WerkstoffLoader.MagnetoResonaticDust.get(OrePrefixes.dust, 1), // Magneto Resonatic
                WerkstoffLoader.Californium.get(OrePrefixes.dust, 1), // Californium
                WerkstoffLoader.BArTiMaEuSNeK.get(OrePrefixes.dust, 1), // BArTiMaEuSNeK
                WerkstoffLoader.PTSaltCrude.get(OrePrefixes.dust, 1), // Platinum Salt
                WerkstoffLoader.PTSaltRefined.get(OrePrefixes.dust, 1), // Refined Platinum Salt
                WerkstoffLoader.PTMetallicPowder.get(OrePrefixes.dust, 1), // Platinum Metallic Powder
                WerkstoffLoader.PTResidue.get(OrePrefixes.dust, 1), // Platinum Residue
                WerkstoffLoader.PTRawPowder.get(OrePrefixes.dust, 1), // Reprecipitated Platinum
                WerkstoffLoader.PDMetallicPowder.get(OrePrefixes.dust, 1), // Palladium Metallic Powder
                WerkstoffLoader.PDRawPowder.get(OrePrefixes.dust, 1), // Reprecipitated Palladium
                WerkstoffLoader.PDSalt.get(OrePrefixes.dust, 1), // Palladium Salt
                WerkstoffLoader.Sodiumsulfate.get(OrePrefixes.dust, 1), // Sodium Sulfate
                WerkstoffLoader.PotassiumDisulfate.get(OrePrefixes.dust, 1), // Potassium Disulfate
                WerkstoffLoader.LeachResidue.get(OrePrefixes.dust, 1), // Leach Residue
                WerkstoffLoader.CalciumChloride.get(OrePrefixes.dust, 1), // Calcium Chloride
                WerkstoffLoader.Ruthenium.get(OrePrefixes.dust, 1), // Ruthenium
                WerkstoffLoader.SodiumRuthenate.get(OrePrefixes.dust, 1), // Sodium Ruthenate
                WerkstoffLoader.RutheniumTetroxide.get(OrePrefixes.dust, 1), // Ruthenium Tetroxide
                WerkstoffLoader.IrOsLeachResidue.get(OrePrefixes.dust, 1), // Rarest Metal Residue
                WerkstoffLoader.IrLeachResidue.get(OrePrefixes.dust, 1), // Iridium Metal Residue
                WerkstoffLoader.PGSDResidue.get(OrePrefixes.dust, 1), // Sludge Dust Residue
                WerkstoffLoader.IridiumDioxide.get(OrePrefixes.dust, 1), // Iridium Dioxide
                WerkstoffLoader.IridiumChloride.get(OrePrefixes.dust, 1), // Iridium Chloride
                WerkstoffLoader.PGSDResidue2.get(OrePrefixes.dust, 1), // Metallic Sludge Dust Residue
                WerkstoffLoader.Rhodium.get(OrePrefixes.dust, 1), // Rhodium
                WerkstoffLoader.CrudeRhMetall.get(OrePrefixes.dust, 1), // Crude Rhodium Metal
                WerkstoffLoader.RHSalt.get(OrePrefixes.dust, 1), // Rhodium Salt
                WerkstoffLoader.SodiumNitrate.get(OrePrefixes.dust, 1), // Sodium Nitrate
                WerkstoffLoader.RHNitrate.get(OrePrefixes.dust, 1), // Rhodium Nitrate
                WerkstoffLoader.ZincSulfate.get(OrePrefixes.dust, 1), // Zinc Sulfate
                WerkstoffLoader.RhFilterCake.get(OrePrefixes.dust, 1), // Rhodium Filter Cake
                WerkstoffLoader.ReRh.get(OrePrefixes.dust, 1), // Reprecipitated Rhodium
                WerkstoffLoader.LuVTierMaterial.get(OrePrefixes.dust, 1), // Rhodium-Plated Palladium
                WerkstoffLoader.Tiberium.get(OrePrefixes.dust, 1), // Tiberium
                WerkstoffLoader.Ruridit.get(OrePrefixes.dust, 1), // Ruridit
                WerkstoffLoader.Fluorspar.get(OrePrefixes.dust, 1), // Fluorspar
                WerkstoffLoader.HDCS.get(OrePrefixes.dust, 1), // High Durability Compound Steel
                WerkstoffLoader.Atheneite.get(OrePrefixes.dust, 1), // Atheneite
                WerkstoffLoader.Temagamite.get(OrePrefixes.dust, 1), // Temagamite
                WerkstoffLoader.Terlinguaite.get(OrePrefixes.dust, 1), // Terlinguaite
                WerkstoffLoader.AdemicSteel.get(OrePrefixes.dust, 1), // Ademic Steel
                WerkstoffLoader.RawAdemicSteel.get(OrePrefixes.dust, 1), // Raw Ademic Steel
                WerkstoffLoader.Potassiumfluorosilicate.get(OrePrefixes.dust, 1), // Potassiumfluorosilicate
                WerkstoffLoader.PotassiumCarbonate.get(OrePrefixes.dust, 1), // Potassium Carbonate
                WerkstoffLoader.RawFluorophlogopite.get(OrePrefixes.dust, 1), // Raw Fluorophlogopite
                WerkstoffLoader.Fluorophlogopite.get(OrePrefixes.dust, 1) // Fluorophlogopite
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Dust Mode")
            .eut(0)
            .addTo(addFakeVoidDustRecipes_T10);

        // BartWorks
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L))
            .itemOutputs(
                GGMaterial.graphiteUraniumMixture.get(OrePrefixes.dust, 1), // Graphite-Uranium Mixture Dust
                GGMaterial.uraniumCarbideThoriumMixture.get(OrePrefixes.dust, 1), // Uranium Carbide-Thorium Mixture
                GGMaterial.plutoniumOxideUraniumMixture.get(OrePrefixes.dust, 1), // Plutonium Oxide-Uranium Mixture
                GGMaterial.vanadiumPentoxide.get(OrePrefixes.dust, 1), // Vanadium Pentoxide
                GGMaterial.thoriumOxalate.get(OrePrefixes.dust, 1), // Thorium Oxalate
                GGMaterial.thoriumHydroxide.get(OrePrefixes.dust, 1), // Thorium Hydroxide
                GGMaterial.sodiumOxalate.get(OrePrefixes.dust, 1), // Sodium Oxalate
                GGMaterial.orundum.get(OrePrefixes.dust, 1), // Orundum
                GGMaterial.atomicSeparationCatalyst.get(OrePrefixes.dust, 1), // Atomic Separation Catalyst
                GGMaterial.extremelyUnstableNaquadah.get(OrePrefixes.dust, 1), // Extremely Unstable Naquadah
                GGMaterial.radioactiveSludge.get(OrePrefixes.dust, 1), // Radioactive Sludge
                GGMaterial.zincChloride.get(OrePrefixes.dust, 1), // Zinc Chloride
                GGMaterial.zincThoriumAlloy.get(OrePrefixes.dust, 1), // Zn-Th Alloy
                GGMaterial.naquadahEarth.get(OrePrefixes.dust, 1), // Naquadah Oxide Mixture
                GGMaterial.titaniumTrifluoride.get(OrePrefixes.dust, 1), // Titanium Trifluoride
                GGMaterial.galliumHydroxide.get(OrePrefixes.dust, 1), // Gallium Hydroxide
                GGMaterial.naquadahine.get(OrePrefixes.dust, 1), // Naquadahine
                GGMaterial.adamantine.get(OrePrefixes.dust, 1), // Adamantine
                GGMaterial.enrichedNaquadahEarth.get(OrePrefixes.dust, 1), // Enriched-Naquadah Oxide Mixture
                GGMaterial.triniumSulphate.get(OrePrefixes.dust, 1), // Trinium Sulphate
                GGMaterial.concentratedEnrichedNaquadahSludge.get(OrePrefixes.dust, 1), // Concentrated
                                                                                        // Enriched-Naquadah Sludge
                GGMaterial.enrichedNaquadahSulphate.get(OrePrefixes.dust, 1), // Enriched-Naquadah Sulphate
                GGMaterial.naquadriaEarth.get(OrePrefixes.dust, 1), // Naquadria Oxide Mixture
                GGMaterial.indiumPhosphate.get(OrePrefixes.dust, 1), // Indium Phosphate
                GGMaterial.lowQualityNaquadriaPhosphate.get(OrePrefixes.dust, 1), // Low Quality Naquadria Phosphate
                GGMaterial.lowQualityNaquadriaSulphate.get(OrePrefixes.dust, 1), // Low Quality Naquadria Sulphate
                GGMaterial.naquadriaSulphate.get(OrePrefixes.dust, 1), // Naquadria Sulphate
                GGMaterial.zircaloy4.get(OrePrefixes.dust, 1), // Zircaloy-4
                GGMaterial.zircaloy2.get(OrePrefixes.dust, 1), // Zircaloy-2
                GGMaterial.incoloy903.get(OrePrefixes.dust, 1), // Incoloy-903
                GGMaterial.adamantiumAlloy.get(OrePrefixes.dust, 1), // Adamantium Alloy
                GGMaterial.ferrocene.get(OrePrefixes.dust, 1), // Ferrocene
                GGMaterial.marM200.get(OrePrefixes.dust, 1), // MAR-M200 Steel
                GGMaterial.marCeM200.get(OrePrefixes.dust, 1), // MAR-Ce-M200 Steel
                GGMaterial.lithiumChloride.get(OrePrefixes.dust, 1), // Lithium Chloride
                GGMaterial.signalium.get(OrePrefixes.dust, 1), // Signalium
                GGMaterial.lumiinessence.get(OrePrefixes.dust, 1), // Lumiinessence
                GGMaterial.lumiium.get(OrePrefixes.dust, 1), // Lumiium
                GGMaterial.artheriumSn.get(OrePrefixes.dust, 1), // Artherium-Sn
                GGMaterial.titaniumBetaC.get(OrePrefixes.dust, 1), // Tanmolyium Beta-C
                GGMaterial.dalisenite.get(OrePrefixes.dust, 1), // Dalisenite
                GGMaterial.hikarium.get(OrePrefixes.dust, 1), // Hikarium
                GGMaterial.tairitsu.get(OrePrefixes.dust, 1), // Tairitsu
                GGMaterial.magnesiumSulphate.get(OrePrefixes.dust, 1), // Magnesium Sulphate
                GGMaterial.preciousMetalAlloy.get(OrePrefixes.dust, 1), // Precious Metals Alloy
                GGMaterial.enrichedNaquadahAlloy.get(OrePrefixes.dust, 1), // Enriched Naquadah Alloy
                GGMaterial.metastableOganesson.get(OrePrefixes.dust, 1), // Metastable Oganesson
                GGMaterial.shirabon.get(OrePrefixes.dust, 1), // Shirabon
                GGMaterial.inertNaquadah.get(OrePrefixes.dust, 1), // Inert Naquadah
                GGMaterial.inertEnrichedNaquadah.get(OrePrefixes.dust, 1), // Inert Enriched Naquadah
                GGMaterial.inertNaquadria.get(OrePrefixes.dust, 1) // Inert Naquadria
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Dust Mode")
            .eut(0)
            .addTo(addFakeVoidDustRecipes_T10);

        // BartWorks
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L))
            .itemOutputs(
                WerkstoffMaterialPool.Hafnium.get(OrePrefixes.dust, 1), // Hafnium
                WerkstoffMaterialPool.LowPurityHafnium.get(OrePrefixes.dust, 1), // Low-Purity Hafnium
                WerkstoffMaterialPool.Hafnia.get(OrePrefixes.dust, 1), // Hafnia
                WerkstoffMaterialPool.HafniumTetrachloride.get(OrePrefixes.dust, 1), // Hafnium Tetrachloride
                WerkstoffMaterialPool.HafniumIodide.get(OrePrefixes.dust, 1), // Hafnium Iodide
                WerkstoffMaterialPool.HafniumRunoff.get(OrePrefixes.dust, 1), // Hafnium Runoff
                WerkstoffMaterialPool.Zirconium.get(OrePrefixes.dust, 1), // Zirconium
                WerkstoffMaterialPool.Zirconia.get(OrePrefixes.dust, 1), // Zirconia
                WerkstoffMaterialPool.ZirconiumTetrachloride.get(OrePrefixes.dust, 1), // Zirconium Tetrachloride
                WerkstoffMaterialPool.HafniaZirconiaBlend.get(OrePrefixes.dust, 1), // Hafnia-Zirconia Blend
                WerkstoffMaterialPool.Iodine.get(OrePrefixes.dust, 1), // Iodine
                WerkstoffMaterialPool.MonaziteSulfate.get(OrePrefixes.dust, 1), // Monazite Sulfate
                WerkstoffMaterialPool.AcidicMonazitePowder.get(OrePrefixes.dust, 1), // Acidic Monazite Powder
                WerkstoffMaterialPool.MonaziteRareEarthFiltrate.get(OrePrefixes.dust, 1), // Monazite Rare Earth
                                                                                          // Filtrate
                WerkstoffMaterialPool.NeutralizedMonaziteRareEarthFiltrate.get(OrePrefixes.dust, 1), // Neutralized
                                                                                                     // Monazite Rare
                                                                                                     // Earth Filtrate
                WerkstoffMaterialPool.MonaziteRareEarthHydroxideConcentrate.get(OrePrefixes.dust, 1), // Monazite Rare
                                                                                                      // Earth Hydroxide
                                                                                                      // Concentrate
                WerkstoffMaterialPool.DriedMonaziteRareEarthConcentrate.get(OrePrefixes.dust, 1), // Dried Monazite Rare
                                                                                                  // Earth Concentrate
                WerkstoffMaterialPool.CeriumDioxide.get(OrePrefixes.dust, 1), // Cerium Dioxide
                WerkstoffMaterialPool.CeriumChloride.get(OrePrefixes.dust, 1), // Cerium Chloride
                WerkstoffMaterialPool.CeriumOxalate.get(OrePrefixes.dust, 1), // Cerium Oxalate
                WerkstoffMaterialPool.CeriumIIIOxide.get(OrePrefixes.dust, 1), // Cerium (III) Oxide
                WerkstoffMaterialPool.CeriumRichMixture.get(OrePrefixes.dust, 1), // Cerium-Rich Mixture
                WerkstoffMaterialPool.CooledMonaziteRareEarthConcentrate.get(OrePrefixes.dust, 1), // Cooled Monazite
                                                                                                   // Rare Earth
                                                                                                   // Concentrate
                WerkstoffMaterialPool.MonaziteRarerEarthSediment.get(OrePrefixes.dust, 1), // MonaziteRarer Earth
                                                                                           // Sediment
                WerkstoffMaterialPool.MonaziteHeterogenousHalogenicRareEarthMixture.get(OrePrefixes.dust, 1), // Heterogenous
                                                                                                              // Halogenic
                                                                                                              // Monazite
                                                                                                              // Rare
                                                                                                              // Earth
                                                                                                              // Mixture
                WerkstoffMaterialPool.SaturatedMonaziteRareEarthMixture.get(OrePrefixes.dust, 1), // Saturated Monazite
                                                                                                  // Rare Earth
                WerkstoffMaterialPool.SamaricResidue.get(OrePrefixes.dust, 1), // Samaric Residue
                WerkstoffMaterialPool.AmmoniumNitrate.get(OrePrefixes.dust, 1), // Ammonium Nitrate Solution
                WerkstoffMaterialPool.ThoriumPhosphateCake.get(OrePrefixes.dust, 1), // Thorium-Phosphate Cake
                WerkstoffMaterialPool.ThoriumPhosphateConcentrate.get(OrePrefixes.dust, 1), // Thorium-Phosphate
                                                                                            // Concentrate
                WerkstoffMaterialPool.UraniumFiltrate.get(OrePrefixes.dust, 1), // Uranium Filtrate
                WerkstoffMaterialPool.NeutralizedUraniumFiltrate.get(OrePrefixes.dust, 1), // Neutralized Uranium
                                                                                           // Filtrate
                WerkstoffMaterialPool.SeaweedAsh.get(OrePrefixes.dust, 1), // Seaweed Ash
                WerkstoffMaterialPool.PotassiumPermanganate.get(OrePrefixes.dust, 1), // Potassium Permanganate
                WerkstoffMaterialPool.EuropiumOxide.get(OrePrefixes.dust, 1), // Europium Oxide
                WerkstoffMaterialPool.EuropiumSulfide.get(OrePrefixes.dust, 1), // Europium Sulfide
                WerkstoffMaterialPool.UnknownBlend.get(OrePrefixes.dust, 1), // UnknownBlend
                WerkstoffMaterialPool.EuropiumIIIOxide.get(OrePrefixes.dust, 1), // Europium III Oxide
                WerkstoffMaterialPool.BastnasiteRareEarthOxidePowder.get(OrePrefixes.dust, 1), // Bastnasite Rare Earth
                                                                                               // Oxides
                WerkstoffMaterialPool.LeachedBastnasiteRareEarthOxides.get(OrePrefixes.dust, 1), // Acid-Leached
                                                                                                 // Bastnasite Rare
                                                                                                 // Earth Oxides
                WerkstoffMaterialPool.Gangue.get(OrePrefixes.dust, 1), // Gangue
                WerkstoffMaterialPool.RoastedRareEarthOxides.get(OrePrefixes.dust, 1), // Roasted Rare Earth Oxides
                WerkstoffMaterialPool.WetRareEarthOxides.get(OrePrefixes.dust, 1), // Wet Rare Earth Oxides
                WerkstoffMaterialPool.CeriumOxidisedRareEarthOxides.get(OrePrefixes.dust, 1), // Cerium-Oxidised Rare
                                                                                              // Earth Oxides
                WerkstoffMaterialPool.BastnasiteRarerEarthOxides.get(OrePrefixes.dust, 1), // Bastnasite Rarer Earth
                                                                                           // Oxides
                WerkstoffMaterialPool.SamaricRareEarthConcentrate.get(OrePrefixes.dust, 1), // Samaric Rare Earth
                                                                                            // Concentrate
                WerkstoffMaterialPool.NeodymicRareEarthConcentrate.get(OrePrefixes.dust, 1), // Neodymium Rare Earth
                                                                                             // Concentrate
                WerkstoffMaterialPool.LanthaniumChloride.get(OrePrefixes.dust, 1), // Lanthanium Chloride
                WerkstoffMaterialPool.NeodymiumOxide.get(OrePrefixes.dust, 1), // Neodymium Oxide
                WerkstoffMaterialPool.FluorinatedSamaricConcentrate.get(OrePrefixes.dust, 1), // Fluorinated Samaric
                                                                                              // Concentrate
                WerkstoffMaterialPool.CalciumFluoride.get(OrePrefixes.dust, 1), // Calcium Fluoride
                WerkstoffMaterialPool.SamariumTerbiumMixture.get(OrePrefixes.dust, 1), // Samarium-Terbium Mixture
                WerkstoffMaterialPool.NitratedSamariumTerbiumMixture.get(OrePrefixes.dust, 1), // Nitrogenize
                                                                                               // Samarium-Terbium
                                                                                               // Mixture
                WerkstoffMaterialPool.TerbiumNitrate.get(OrePrefixes.dust, 1), // Terbium Nitrate
                WerkstoffMaterialPool.SamariumOreConcentrate.get(OrePrefixes.dust, 1), // Samarium Ore Concentrate
                WerkstoffMaterialPool.DephosphatedSamariumConcentrate.get(OrePrefixes.dust, 1), // Dephosphated Samarium
                                                                                                // Concentrate
                WerkstoffMaterialPool.MoTeOCatalyst.get(OrePrefixes.dust, 1), // Tellurium-Molybdenum-Oxide Catalyst
                WerkstoffMaterialPool.TelluriumIVOxide.get(OrePrefixes.dust, 1), // Tellurium (IV) Oxide
                WerkstoffMaterialPool.MolybdenumIVOxide.get(OrePrefixes.dust, 1), // Molybdenum (IV) Oxide
                WerkstoffMaterialPool.Polytetrahydrofuran.get(OrePrefixes.dust, 1), // Polytetrahydrofuran
                WerkstoffMaterialPool.PTMEGElastomer.get(OrePrefixes.dust, 1), // PTMEG Elastomer
                WerkstoffMaterialPool.PotassiumChlorate.get(OrePrefixes.dust, 1), // Potassium Chlorate
                WerkstoffMaterialPool.MolybdenumTrioxide.get(OrePrefixes.dust, 1), // Molybdenum Trioxide
                WerkstoffMaterialPool.SamariumOxalate.get(OrePrefixes.dust, 1), // Samarium(III) Oxalate
                WerkstoffMaterialPool.SamariumChloride.get(OrePrefixes.dust, 1), // Samarium(III)-Chloride
                WerkstoffMaterialPool.SamariumChlorideSodiumChlorideBlend.get(OrePrefixes.dust, 1), // Samarium
                                                                                                    // Chloride-Sodium
                                                                                                    // Chloride Blend
                WerkstoffMaterialPool.ImpureLanthanumChloride.get(OrePrefixes.dust, 1), // Impure Lanthanum Chloride
                WerkstoffMaterialPool.SamariumOxide.get(OrePrefixes.dust, 1), // Samarium Oxide
                WerkstoffMaterialPool.RarestEarthResidue.get(OrePrefixes.dust, 1), // Rarest Earth Residue
                WerkstoffMaterialPool.LanthanumOreConcentrate.get(OrePrefixes.dust, 1), // Lanthanum Ore Concentrate
                WerkstoffMaterialPool.PraseodymiumOreConcentrate.get(OrePrefixes.dust, 1), // Praseodymium Ore
                                                                                           // Concentrate
                WerkstoffMaterialPool.NeodymiumOreConcentrate.get(OrePrefixes.dust, 1), // Neodymium Ore Concentrate
                WerkstoffMaterialPool.PromethiumOreConcentrate.get(OrePrefixes.dust, 1), // Promethium Ore Concentrate
                WerkstoffMaterialPool.EuropiumOreConcentrate.get(OrePrefixes.dust, 1), // Europium Ore Concentrate
                WerkstoffMaterialPool.GadoliniumOreConcentrate.get(OrePrefixes.dust, 1), // Gadolinium Ore Concentrate
                WerkstoffMaterialPool.TerbiumOreConcentrate.get(OrePrefixes.dust, 1), // Terbium Ore Concentrate
                WerkstoffMaterialPool.DysprosiumOreConcentrate.get(OrePrefixes.dust, 1), // Dysprosium Ore Concentrate
                WerkstoffMaterialPool.HolmiumOreConcentrate.get(OrePrefixes.dust, 1), // Holmium Ore Concentrate
                WerkstoffMaterialPool.ErbiumOreConcentrate.get(OrePrefixes.dust, 1), // Erbium Ore Concentrate
                WerkstoffMaterialPool.ThuliumOreConcentrate.get(OrePrefixes.dust, 1), // Thulium Ore Concentrate
                WerkstoffMaterialPool.YtterbiumOreConcentrate.get(OrePrefixes.dust, 1), // Ytterbium Ore Concentrate
                WerkstoffMaterialPool.LutetiumOreConcentrate.get(OrePrefixes.dust, 1), // Lutetium Ore Concentrate
                WerkstoffMaterialPool.CeriumDopedLutetiumAluminiumOxygenBlend.get(OrePrefixes.dust, 1), // Cerium-doped
                                                                                                        // Lutetium
                                                                                                        // Aluminium
                                                                                                        // Oxygen Blend
                WerkstoffMaterialPool.Permalloy.get(OrePrefixes.dust, 1), // Permalloy
                WerkstoffMaterialPool.MuMetal.get(OrePrefixes.dust, 1), // Mu-metal
                WerkstoffMaterialPool.Thorium234.get(OrePrefixes.dust, 1), // Thorium 234
                WerkstoffMaterialPool.SiliconNitride.get(OrePrefixes.dust, 1), // Silicon Nitride
                WerkstoffMaterialPool.BoronTrioxide.get(OrePrefixes.dust, 1), // Boron Trioxide
                WerkstoffMaterialPool.LanthanumHexaboride.get(OrePrefixes.dust, 1), // Lanthanum Hexaboride
                WerkstoffMaterialPool.LanthanumOxide.get(OrePrefixes.dust, 1), // Lanthanum Oxide

                BotWerkstoffMaterialPool.TungsticAcid.get(OrePrefixes.dust, 1), // Tungstic Acid
                BotWerkstoffMaterialPool.TungstenTrioxide.get(OrePrefixes.dust, 1), // Tungsten Trioxide
                BotWerkstoffMaterialPool.AmmoniumNitrate.get(OrePrefixes.dust, 1), // Ammonium Nitrate

                WerkstoffLoader.HafniumCarbide.get(OrePrefixes.dust, 1), // Hafnium Carbide
                WerkstoffLoader.TantalumCarbideHafniumCarbideMixture.get(OrePrefixes.dust, 1), // Tantalum Carbide /
                                                                                               // Hafnium Carbide
                                                                                               // Mixture
                WerkstoffLoader.TantalumHafniumCarbide.get(OrePrefixes.dust, 1) // Tantalum Hafnium Carbide
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Dust Mode")
            .eut(0)
            .addTo(addFakeVoidDustRecipes_T10);

        // GT: New Horizons
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L))
            .itemOutputs(
                CustomItemList.MakeMakeStoneDust.get(1),
                CustomItemList.PotassiumHydroxideDust.get(1),
                CustomItemList.LapotronDust.get(1),
                CustomItemList.TitanStoneDust.get(1),
                CustomItemList.TritonStoneDust.get(1),
                CustomItemList.PlutoIceDust.get(1),
                CustomItemList.TCetiEStoneDust.get(1),
                CustomItemList.IoStoneDust.get(1),
                CustomItemList.EnceladusIceDust.get(1),
                CustomItemList.GanymedeStoneDust.get(1),
                CustomItemList.CentauriASurfaceDust.get(1),
                CustomItemList.MarsStoneDust.get(1),
                CustomItemList.AsteroidsStoneDust.get(1),
                CustomItemList.ChargedCertusQuartzDust.get(1),
                CustomItemList.MercuryStoneDust.get(1),
                CustomItemList.BarnardaEStoneDust.get(1),
                CustomItemList.HaumeaStoneDust.get(1),
                CustomItemList.DeimosStoneDust.get(1),
                CustomItemList.VenusStoneDust.get(1),
                CustomItemList.OberonStoneDust.get(1),
                CustomItemList.CokeOvenBrickDust.get(1),
                CustomItemList.VegaBStoneDust.get(1),
                CustomItemList.MirandaStoneDust.get(1),
                CustomItemList.ProteusStoneDust.get(1),
                CustomItemList.AdvancedCokeOvenBrickDust.get(1),
                CustomItemList.BarnardaFStoneDust.get(1),
                CustomItemList.CeresStoneDust.get(1),
                CustomItemList.EnceladusStoneDust.get(1),
                CustomItemList.PhobosStoneDust.get(1),
                CustomItemList.PlutoStoneDust.get(1),
                CustomItemList.RawNeutronium.get(1),
                CustomItemList.EuropaStoneDust.get(1),
                CustomItemList.StargateCrystalDust.get(1),
                CustomItemList.CentauriAStoneDust.get(1),
                CustomItemList.MercuryCoreDust.get(1),
                CustomItemList.CallistoStoneDust.get(1),
                CustomItemList.MoonStoneDust.get(1),
                CustomItemList.EuropaIceDust.get(1),
                CustomItemList.StargateDustAncients.get(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Dust Mode")
            .eut(0)
            .addTo(addFakeVoidDustRecipes_T10);

        // GregTech
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L))
            .itemOutputs(
                Materials.Lithium.getDust(1),
                Materials.Beryllium.getDust(1),
                Materials.Boron.getDust(1),
                Materials.Carbon.getDust(1),
                Materials.Sodium.getDust(1),
                Materials.Magnesium.getDust(1),
                Materials.Aluminium.getDust(1),
                Materials.Silicone.getDust(1),
                Materials.Phosphorus.getDust(1),
                Materials.Sulfur.getDust(1),
                Materials.Potassium.getDust(1),
                Materials.Calcium.getDust(1),
                Materials.Scandium.getDust(1),
                Materials.Titanium.getDust(1),
                Materials.Vanadium.getDust(1),
                Materials.Chrome.getDust(1),
                Materials.Manganese.getDust(1),
                Materials.Iron.getDust(1),
                Materials.Cobalt.getDust(1),
                Materials.Nickel.getDust(1),
                Materials.Copper.getDust(1),
                Materials.Zinc.getDust(1),
                Materials.Gallium.getDust(1),
                Materials.Arsenic.getDust(1),
                Materials.Rubidium.getDust(1),
                Materials.Strontium.getDust(1),
                Materials.Yttrium.getDust(1),
                Materials.Niobium.getDust(1),
                Materials.Molybdenum.getDust(1),
                Materials.Palladium.getDust(1),
                Materials.Silver.getDust(1),
                Materials.Cadmium.getDust(1),
                Materials.Indium.getDust(1),
                Materials.Tin.getDust(1),
                Materials.Antimony.getDust(1),
                Materials.Tellurium.getDust(1),
                Materials.Caesium.getDust(1),
                Materials.Barium.getDust(1),
                Materials.Lanthanum.getDust(1),
                Materials.Cerium.getDust(1),
                Materials.Praseodymium.getDust(1),
                Materials.Neodymium.getDust(1),
                Materials.Promethium.getDust(1),
                Materials.Samarium.getDust(1),
                Materials.Europium.getDust(1),
                Materials.Gadolinium.getDust(1),
                Materials.Terbium.getDust(1),
                Materials.Dysprosium.getDust(1),
                Materials.Holmium.getDust(1),
                Materials.Erbium.getDust(1),
                Materials.Thulium.getDust(1),
                Materials.Ytterbium.getDust(1),
                Materials.Lutetium.getDust(1),
                Materials.Tantalum.getDust(1),
                Materials.Tungsten.getDust(1),
                Materials.Osmium.getDust(1),
                Materials.Iridium.getDust(1),
                Materials.Platinum.getDust(1),
                Materials.Gold.getDust(1),
                Materials.Lead.getDust(1),
                Materials.Bismuth.getDust(1),
                Materials.Thorium.getDust(1),
                Materials.Uranium235.getDust(1),
                Materials.Uranium.getDust(1),
                Materials.Plutonium.getDust(1),
                Materials.Plutonium241.getDust(1),
                Materials.Americium.getDust(1),
                Materials.TengamRaw.getDust(1),
                Materials.TengamPurified.getDust(1),
                Materials.TengamAttuned.getDust(1),
                Materials.Neutronium.getDust(1),
                Materials.SuperconductorUIVBase.getDust(1),
                Materials.SuperconductorUMVBase.getDust(1),
                MaterialsUEVplus.Universium.getDust(1),
                MaterialsUEVplus.Eternity.getDust(1),
                MaterialsUEVplus.MagMatter.getDust(1),
                MaterialsUEVplus.SixPhasedCopper.getDust(1),
                MaterialsUEVplus.Mellion.getDust(1),
                MaterialsUEVplus.Creon.getDust(1),
                MaterialsBotania.Manasteel.getDust(1),
                MaterialsBotania.Terrasteel.getDust(1),
                MaterialsBotania.ElvenElementium.getDust(1),
                MaterialsBotania.Livingrock.getDust(1),
                MaterialsBotania.GaiaSpirit.getDust(1),
                MaterialsBotania.Livingwood.getDust(1),
                MaterialsBotania.Dreamwood.getDust(1),
                MaterialsBotania.ManaDiamond.getDust(1),
                MaterialsBotania.BotaniaDragonstone.getDust(1),
                Materials.PlatinumGroupSludge.getDust(1),
                Materials.Stone.getDust(1),
                Materials.Bronze.getDust(1),
                Materials.Brass.getDust(1),
                Materials.Invar.getDust(1),
                Materials.Electrum.getDust(1),
                Materials.WroughtIron.getDust(1),
                Materials.Steel.getDust(1),
                Materials.StainlessSteel.getDust(1),
                Materials.PigIron.getDust(1),
                Materials.RedAlloy.getDust(1),
                Materials.BlueAlloy.getDust(1),
                Materials.Cupronickel.getDust(1),
                Materials.Nichrome.getDust(1),
                Materials.Kanthal.getDust(1),
                Materials.Magnalium.getDust(1),
                Materials.SolderingAlloy.getDust(1),
                Materials.BatteryAlloy.getDust(1),
                Materials.TungstenSteel.getDust(1),
                Materials.Osmiridium.getDust(1),
                Materials.Sunnarium.getDust(1),
                Materials.Adamantium.getDust(1),
                Materials.ElectrumFlux.getDust(1),
                Materials.Enderium.getDust(1),
                Materials.InfusedGold.getDust(1),
                Materials.Naquadah.getDust(1),
                Materials.NaquadahAlloy.getDust(1),
                Materials.NaquadahEnriched.getDust(1),
                Materials.Naquadria.getDust(1),
                Materials.Duranium.getDust(1),
                Materials.Tritanium.getDust(1),
                Materials.Thaumium.getDust(1),
                Materials.Mithril.getDust(1),
                Materials.AstralSilver.getDust(1),
                Materials.BlackSteel.getDust(1),
                Materials.DamascusSteel.getDust(1),
                Materials.ShadowIron.getDust(1),
                Materials.ShadowSteel.getDust(1),
                Materials.IronWood.getDust(1),
                Materials.Steeleaf.getDust(1),
                Materials.MeteoricIron.getDust(1),
                Materials.MeteoricSteel.getDust(1),
                Materials.DarkIron.getDust(1),
                Materials.CobaltBrass.getDust(1),
                Materials.Ultimet.getDust(1),
                Materials.AnnealedCopper.getDust(1),
                Materials.FierySteel.getDust(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Dust Mode")
            .eut(0)
            .addTo(addFakeVoidDustRecipes_T10);

        // GregTech
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L))
            .itemOutputs(
                Materials.Firestone.getDust(1),
                Materials.RedSteel.getDust(1),
                Materials.BlueSteel.getDust(1),
                Materials.SterlingSilver.getDust(1),
                Materials.RoseGold.getDust(1),
                Materials.BlackBronze.getDust(1),
                Materials.BismuthBronze.getDust(1),
                Materials.IronMagnetic.getDust(1),
                Materials.SteelMagnetic.getDust(1),
                Materials.NeodymiumMagnetic.getDust(1),
                Materials.VanadiumGallium.getDust(1),
                Materials.YttriumBariumCuprate.getDust(1),
                Materials.NiobiumNitride.getDust(1),
                Materials.NiobiumTitanium.getDust(1),
                Materials.ChromiumDioxide.getDust(1),
                Materials.Knightmetal.getDust(1),
                Materials.TinAlloy.getDust(1),
                Materials.DarkSteel.getDust(1),
                Materials.ElectricalSteel.getDust(1),
                Materials.EnergeticAlloy.getDust(1),
                Materials.VibrantAlloy.getDust(1),
                Materials.Shadow.getDust(1),
                Materials.ConductiveIron.getDust(1),
                Materials.TungstenCarbide.getDust(1),
                Materials.VanadiumSteel.getDust(1),
                Materials.HSSG.getDust(1),
                Materials.HSSE.getDust(1),
                Materials.HSSS.getDust(1),
                Materials.Rutile.getDust(1),
                Materials.Magnesiumchloride.getDust(1),
                Materials.PulsatingIron.getDust(1),
                Materials.Soularium.getDust(1),
                Materials.EnderiumBase.getDust(1),
                Materials.RedstoneAlloy.getDust(1),
                Materials.Ardite.getDust(1),
                Materials.Reinforced.getDust(1),
                Materials.Galgadorian.getDust(1),
                Materials.EnhancedGalgadorian.getDust(1),
                Materials.Manyullyn.getDust(1),
                Materials.Mytryl.getDust(1),
                Materials.BlackPlutonium.getDust(1),
                Materials.CallistoIce.getDust(1),
                Materials.Ledox.getDust(1),
                Materials.Quantium.getDust(1),
                Materials.Duralumin.getDust(1),
                Materials.Oriharukon.getDust(1),
                Materials.InfinityCatalyst.getDust(1),
                Materials.Bedrockium.getDust(1),
                Materials.Unstable.getDust(1),
                Materials.Infinity.getDust(1),
                Materials.MysteriousCrystal.getDust(1),
                Materials.SamariumMagnetic.getDust(1),
                Materials.Alumite.getDust(1),
                Materials.EndSteel.getDust(1),
                Materials.CrudeSteel.getDust(1),
                Materials.CrystallineAlloy.getDust(1),
                Materials.MelodicAlloy.getDust(1),
                Materials.StellarAlloy.getDust(1),
                Materials.CrystallinePinkSlime.getDust(1),
                Materials.EnergeticSilver.getDust(1),
                Materials.VividAlloy.getDust(1),
                MaterialsOreAlum.SluiceSand.getDust(1),
                MaterialsOreAlum.BauxiteSlag.getDust(1),
                MaterialsOreAlum.IlmeniteSlag.getDust(1),
                Materials.Alduorite.getDust(1),
                Materials.Rubracium.getDust(1),
                Materials.Vulcanite.getDust(1),
                Materials.Diamond.getDust(1),
                Materials.Emerald.getDust(1),
                Materials.Ruby.getDust(1),
                Materials.Sapphire.getDust(1),
                Materials.GreenSapphire.getDust(1),
                Materials.Olivine.getDust(1),
                Materials.NetherStar.getDust(1),
                Materials.Topaz.getDust(1),
                Materials.Tanzanite.getDust(1),
                Materials.Amethyst.getDust(1),
                Materials.Opal.getDust(1),
                Materials.Jasper.getDust(1),
                Materials.FoolsRuby.getDust(1),
                Materials.BlueTopaz.getDust(1),
                Materials.Amber.getDust(1),
                Materials.Dilithium.getDust(1),
                Materials.CertusQuartz.getDust(1),
                Materials.Forcicium.getDust(1),
                Materials.Forcillium.getDust(1),
                Materials.Monazite.getDust(1),
                Materials.Force.getDust(1),
                Materials.NetherQuartz.getDust(1),
                Materials.Quartzite.getDust(1),
                Materials.Lazurite.getDust(1),
                Materials.Sodalite.getDust(1),
                Materials.Lapis.getDust(1),
                Materials.GarnetRed.getDust(1),
                Materials.GarnetYellow.getDust(1),
                Materials.Vinteum.getDust(1),
                Materials.Apatite.getDust(1),
                Materials.Niter.getDust(1),
                Materials.EnderPearl.getDust(1),
                Materials.EnderEye.getDust(1),
                Materials.TricalciumPhosphate.getDust(1),
                Materials.Coal.getDust(1),
                Materials.Charcoal.getDust(1),
                Materials.Jade.getDust(1),
                Materials.Lignite.getDust(1),
                Materials.RoastedCopper.getDust(1),
                Materials.RoastedAntimony.getDust(1),
                Materials.RoastedIron.getDust(1),
                Materials.RoastedNickel.getDust(1),
                Materials.RoastedZinc.getDust(1),
                Materials.RoastedCobalt.getDust(1),
                Materials.RoastedArsenic.getDust(1),
                Materials.RoastedLead.getDust(1),
                Materials.ActivatedCarbon.getDust(1),
                Materials.PreActivatedCarbon.getDust(1),
                Materials.DirtyActivatedCarbon.getDust(1),
                Materials.TPV.getDust(1),
                MaterialsUEVplus.TranscendentMetal.getDust(1),
                Materials.EnrichedHolmium.getDust(1),
                MaterialsUEVplus.WhiteDwarfMatter.getDust(1),
                MaterialsUEVplus.BlackDwarfMatter.getDust(1),
                MaterialsUEVplus.SpaceTime.getDust(1),
                Materials.PotassiumNitrade.getDust(1),
                Materials.ChromiumTrioxide.getDust(1),
                Materials.Potassiumdichromate.getDust(1),
                Materials.Polybenzimidazole.getDust(1),
                Materials.Pyrochlore.getDust(1),
                Materials.BorosilicateGlass.getDust(1),
                Materials.FerriteMixture.getDust(1),
                Materials.NickelZincFerrite.getDust(1),
                Materials.Massicot.getDust(1),
                Materials.ArsenicTrioxide.getDust(1),
                Materials.CobaltOxide.getDust(1),
                Materials.Zincite.getDust(1),
                Materials.AntimonyTrioxide.getDust(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Dust Mode")
            .eut(0)
            .addTo(addFakeVoidDustRecipes_T10);

        // GregTech
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L))
            .itemOutputs(
                Materials.CupricOxide.getDust(1),
                Materials.Ferrosilite.getDust(1),
                Materials.Magnesia.getDust(1),
                Materials.Quicklime.getDust(1),
                Materials.Potash.getDust(1),
                Materials.SodaAsh.getDust(1),
                Materials.Brick.getDust(1),
                Materials.Fireclay.getDust(1),
                Materials.SodiumBisulfate.getDust(1),
                Materials.PolyphenyleneSulfide.getDust(1),
                Materials.RawStyreneButadieneRubber.getDust(1),
                Materials.PhosphorousPentoxide.getDust(1),
                Materials.MetalMixture.getDust(1),
                Materials.SodiumHydroxide.getDust(1),
                Materials.SodiumCarbonate.getDust(1),
                Materials.SodiumAluminate.getDust(1),
                WerkstoffLoader.Alumina.get(OrePrefixes.dust, 1),
                Materials.Aluminiumhydroxide.getDust(1),
                Materials.Cryolite.getDust(1),
                Materials.SodiumSulfide.getDust(1),
                Materials.SodiumOxide.getDust(1),
                MaterialsKevlar.SodiumMethoxide.getDust(1),
                MaterialsKevlar.SodiumHydride.getDust(1),
                MaterialsKevlar.Triphenylphosphene.getDust(1),
                MaterialsKevlar.RhodiumChloride.getDust(1),
                MaterialsKevlar.SodiumBorohydride.getDust(1),
                MaterialsKevlar.OrganorhodiumCatalyst.getDust(1),
                MaterialsKevlar.CobaltIINitrate.getDust(1),
                MaterialsKevlar.CobaltIIAcetate.getDust(1),
                MaterialsKevlar.CobaltIIHydroxide.getDust(1),
                MaterialsKevlar.CobaltIINaphthenate.getDust(1),
                MaterialsKevlar.Kevlar.getDust(1),
                MaterialsKevlar.BismuthIIIOxide.getDust(1),
                Materials.HeeEndium.getDust(1),
                MaterialsKevlar.RaneyNickelActivated.getDust(1),
                MaterialsKevlar.NickelAluminide.getDust(1),
                MaterialsKevlar.IIButinIIVdiol.getDust(1),
                MaterialsKevlar.CalciumCarbide.getDust(1),
                MaterialsKevlar.ParaPhenylenediamine.getDust(1),
                MaterialsKevlar.TerephthaloylChloride.getDust(1),
                MaterialsKevlar.Pentaerythritol.getDust(1),
                MaterialsKevlar.KevlarCatalyst.getDust(1),
                MaterialsKevlar.DiphenylmethaneDiisocyanate.getDust(1),
                Materials.Calciumhydride.getDust(1),
                Materials.Flint.getDust(1),
                Materials.Obsidian.getDust(1),
                Materials.Clay.getDust(1),
                Materials.Netherrack.getDust(1),
                Materials.Endstone.getDust(1),
                Materials.Electrotine.getDust(1),
                Materials.Bluestone.getDust(1),
                Materials.NetherBrick.getDust(1),
                Materials.HydratedCoal.getDust(1),
                Materials.Graphene.getDust(1),
                Materials.Almandine.getDust(1),
                Materials.Andradite.getDust(1),
                Materials.Bauxite.getDust(1),
                Materials.Calcite.getDust(1),
                Materials.Cassiterite.getDust(1),
                Materials.Chromite.getDust(1),
                Materials.Cinnabar.getDust(1),
                Materials.Cobaltite.getDust(1),
                Materials.Cooperite.getDust(1),
                Materials.DeepIron.getDust(1),
                Materials.Galena.getDust(1),
                Materials.Grossular.getDust(1),
                Materials.LiveRoot.getDust(1),
                Materials.Phosphate.getDust(1),
                Materials.Pyrite.getDust(1),
                Materials.Pyrope.getDust(1),
                Materials.Saltpeter.getDust(1),
                Materials.SiliconDioxide.getDust(1),
                Materials.Spessartine.getDust(1),
                Materials.Sphalerite.getDust(1),
                Materials.Tetrahedrite.getDust(1),
                Materials.Tungstate.getDust(1),
                Materials.Uvarovite.getDust(1),
                Materials.Pyrotheum.getDust(1),
                Materials.Basalt.getDust(1),
                Materials.Marble.getDust(1),
                Materials.Redrock.getDust(1),
                Materials.PotassiumFeldspar.getDust(1),
                Materials.Biotite.getDust(1),
                Materials.GraniteBlack.getDust(1),
                Materials.GraniteRed.getDust(1),
                Materials.Blizz.getDust(1),
                Materials.CobaltHexahydrate.getDust(1),
                Materials.ConstructionFoam.getDust(1),
                Materials.Chalcopyrite.getDust(1),
                Materials.SiliconSG.getDust(1),
                Materials.CrudeOil.getDust(1),
                Materials.Emery.getDust(1),
                MaterialsGTNH.Epidote.getDust(1),
                Materials.Graphite.getDust(1),
                Materials.Greenstone.getDust(1),
                Materials.Trinium.getDust(1),
                Materials.Magnetite.getDust(1),
                Materials.Malachite.getDust(1),
                Materials.Migmatite.getDust(1),
                Materials.Siltstone.getDust(1),
                Materials.Soapstone.getDust(1),
                Materials.Oilsands.getDust(1),
                Materials.Wulfenite.getDust(1),
                Materials.Powellite.getDust(1),
                Materials.Desh.getDust(1),
                Materials.Glass.getDust(1),
                Materials.RawRubber.getDust(1),
                Materials.Cryotheum.getDust(1),
                Materials.Mirabilite.getDust(1),
                Materials.Mica.getDust(1),
                Materials.Trona.getDust(1),
                Materials.Barite.getDust(1),
                Materials.Bastnasite.getDust(1),
                Materials.Garnierite.getDust(1),
                Materials.Lepidolite.getDust(1),
                Materials.Magnesite.getDust(1),
                Materials.Pentlandite.getDust(1),
                Materials.Scheelite.getDust(1),
                Materials.Alunite.getDust(1),
                Materials.Chrysotile.getDust(1),
                Materials.Realgar.getDust(1),
                Materials.Dolomite.getDust(1),
                Materials.Wollastonite.getDust(1),
                Materials.Zeolite.getDust(1),
                Materials.BandedIron.getDust(1),
                Materials.Ilmenite.getDust(1),
                Materials.Pollucite.getDust(1),
                Materials.Spodumene.getDust(1),
                Materials.Tantalite.getDust(1),
                Materials.Uraninite.getDust(1),
                Materials.VanadiumMagnetite.getDust(1),
                Materials.Kyanite.getDust(1),
                Materials.Perlite.getDust(1),
                Materials.Pumice.getDust(1),
                Materials.BrownLimonite.getDust(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Dust Mode")
            .eut(0)
            .addTo(addFakeVoidDustRecipes_T10);

        // GregTech
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L))
            .itemOutputs(
                Materials.YellowLimonite.getDust(1),
                Materials.Glauconite.getDust(1),
                Materials.Gypsum.getDust(1),
                Materials.Borax.getDust(1),
                Materials.Molybdenite.getDust(1),
                Materials.Pyrolusite.getDust(1),
                Materials.Stibnite.getDust(1),
                Materials.Asbestos.getDust(1),
                Materials.Concrete.getDust(1),
                Materials.Diatomite.getDust(1),
                Materials.Vyroxeres.getDust(1),
                Materials.Ceruclase.getDust(1),
                Materials.Tartarite.getDust(1),
                Materials.Orichalcum.getDust(1),
                Materials.AluminiumFluoride.getDust(1),
                Materials.Void.getDust(1),
                Materials.CalciumDisilicide.getDust(1),
                Materials.SuperconductorUEVBase.getDust(1),
                Materials.Draconium.getDust(1),
                Materials.DraconiumAwakened.getDust(1),
                Materials.BloodInfusedIron.getDust(1),
                Materials.Ichorium.getDust(1),
                Materials.RadoxPolymer.getDust(1),
                Materials.GalliumArsenide.getDust(1),
                Materials.IndiumGalliumPhosphide.getDust(1),
                Materials.CosmicNeutronium.getDust(1),
                Materials.Flerovium.getDust(1),
                Materials.Longasssuperconductornameforuhvwire.getDust(1),
                Materials.Longasssuperconductornameforuvwire.getDust(1),
                Materials.Pentacadmiummagnesiumhexaoxid.getDust(1),
                Materials.Titaniumonabariumdecacoppereikosaoxid.getDust(1),
                Materials.Uraniumtriplatinid.getDust(1),
                Materials.Vanadiumtriindinid.getDust(1),
                Materials.Tetraindiumditindibariumtitaniumheptacoppertetrakaidekaoxid.getDust(1),
                Materials.Tetranaquadahdiindiumhexaplatiumosminid.getDust(1))
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Dust Mode")
            .eut(0)
            .addTo(addFakeVoidDustRecipes_T10);

        // KekzTech
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L))
            .itemOutputs(
                getModItem(KekzTech.ID, "kekztech_crafting_item", 1, 9), // YSZ Ceramic Dust
                getModItem(KekzTech.ID, "kekztech_crafting_item", 1, 10), // GDC Ceramic Dust
                getModItem(KekzTech.ID, "kekztech_crafting_item", 1, 11), // Yttria Dust
                getModItem(KekzTech.ID, "kekztech_crafting_item", 1, 12), // Zirconia Dust
                getModItem(KekzTech.ID, "kekztech_crafting_item", 1, 13) // Ceria Dust
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Dust Mode")
            .eut(0)
            .addTo(addFakeVoidDustRecipes_T10);

        // GTPlusPlus
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L))
            .itemOutputs(
                getModItem(GTPlusPlus.ID, "itemDustMixTumbaga", 1), // Tumbaga Mix Dust
                getModItem(GTPlusPlus.ID, "itemDustSelenium", 1), // Selenium Dust
                getModItem(GTPlusPlus.ID, "itemDustIodine", 1), // Iodine Dust
                getModItem(GTPlusPlus.ID, "itemDustRhenium", 1), // Rhenium Dust
                getModItem(GTPlusPlus.ID, "itemDustThallium", 1), // Thallium Dust
                getModItem(GTPlusPlus.ID, "itemDustGermanium", 1), // Germanium Dust
                getModItem(GTPlusPlus.ID, "itemDustPolonium", 1), // Polonium Dust
                getModItem(GTPlusPlus.ID, "itemDustRadium", 1), // Radium Dust
                getModItem(GTPlusPlus.ID, "itemDustProtactinium", 1), // Protactinium Dust
                getModItem(GTPlusPlus.ID, "itemDustCurium", 1), // Curium Dust
                getModItem(GTPlusPlus.ID, "itemDustNeptunium", 1), // Neptunium Dust
                getModItem(GTPlusPlus.ID, "itemDustFermium", 1), // Fermium Dust
                getModItem(GTPlusPlus.ID, "itemDustLithium7", 1), // Lithium 7 Dust
                getModItem(GTPlusPlus.ID, "itemDustUranium232", 1), // Uranium 232 Dust
                getModItem(GTPlusPlus.ID, "itemDustUranium233", 1), // Uranium 233 Dust
                getModItem(GTPlusPlus.ID, "itemDustPlutonium238", 1), // Plutonium 238 Dust
                getModItem(GTPlusPlus.ID, "itemDustAdvancedNitinol", 1), // Advanced Nitinol Dust
                getModItem(GTPlusPlus.ID, "itemDustAstralTitanium", 1), // Astral Titanium Dust
                getModItem(GTPlusPlus.ID, "itemDustCelestialTungsten", 1), // Celestial Tungsten Dust
                getModItem(GTPlusPlus.ID, "itemDustHypogen", 1), // Hypogen Dust
                getModItem(GTPlusPlus.ID, "itemDustChromaticGlass", 1), // Chromatic Glass Dust
                getModItem(GTPlusPlus.ID, "itemDustBlackMetal", 1), // Black Metal Dust
                getModItem(GTPlusPlus.ID, "itemDustWhiteMetal", 1), // White Metal Dust
                getModItem(GTPlusPlus.ID, "itemDustAncientGranite", 1), // Ancient Granite Dust
                getModItem(GTPlusPlus.ID, "itemDustRunite", 1), // Runite Dust
                getModItem(GTPlusPlus.ID, "itemDustDragonblood", 1), // Dragon Metal Dust
                getModItem(GTPlusPlus.ID, "itemDustPotassiumNitrate", 1), // Potassium Nitrate Dust
                getModItem(GTPlusPlus.ID, "itemDustSodiumNitrate", 1), // Sodium Nitrate Dust
                getModItem(GTPlusPlus.ID, "itemDustStrontiumOxide", 1), // Strontium Oxide Dust
                getModItem(GTPlusPlus.ID, "itemDustStrontiumHydroxide", 1), // Strontium Hydroxide Dust
                getModItem(GTPlusPlus.ID, "itemDustCyanoaceticAcid", 1), // Cyanoacetic Acid Dust
                getModItem(GTPlusPlus.ID, "itemDustSodiumCyanide", 1), // Sodium Cyanide Dust
                getModItem(GTPlusPlus.ID, "itemDustCopperIISulfate", 1), // Copper II Sulfate Dust
                getModItem(GTPlusPlus.ID, "itemDustCopperIISulfatePentahydrate", 1), // Copper II Sulfate Pentahydrate
                                                                                     // Dust
                getModItem(GTPlusPlus.ID, "itemDustSiliconCarbide", 1), // Silicon Carbide Dust
                getModItem(GTPlusPlus.ID, "itemDustZirconiumCarbide", 1), // Zirconium Carbide Dust
                getModItem(GTPlusPlus.ID, "itemDustTantalumCarbide", 1), // Tantalum Carbide Dust
                getModItem(GTPlusPlus.ID, "itemDustNiobiumCarbide", 1), // Niobium Carbide Dust
                getModItem(GTPlusPlus.ID, "itemDustTungstenTitaniumCarbide", 1), // Tungsten Titanium Carbide Dust
                getModItem(GTPlusPlus.ID, "itemDustAmmoniumBifluoride", 1), // Ammonium Bifluoride Dust
                getModItem(GTPlusPlus.ID, "itemDustBerylliumHydroxide", 1), // Beryllium Hydroxide Dust
                getModItem(GTPlusPlus.ID, "itemDustBerylliumFluoride", 1), // Beryllium Fluoride Dust
                getModItem(GTPlusPlus.ID, "itemDustLithiumFluoride", 1), // Lithium Fluoride Dust
                getModItem(GTPlusPlus.ID, "itemDustThoriumTetrafluoride", 1), // Thorium Tetrafluoride Dust
                getModItem(GTPlusPlus.ID, "itemDustThoriumHexafluoride", 1), // Thorium Hexafluoride Dust
                getModItem(GTPlusPlus.ID, "itemDustUraniumTetrafluoride", 1), // Uranium Tetrafluoride Dust
                getModItem(GTPlusPlus.ID, "itemDustUraniumHexafluoride", 1), // Uranium Hexafluoride Dust
                getModItem(GTPlusPlus.ID, "itemDustZirconiumTetrafluoride", 1), // Zirconium Tetrafluoride Dust
                getModItem(GTPlusPlus.ID, "itemDustNeptuniumHexafluoride", 1), // Neptunium Hexafluoride Dust
                getModItem(GTPlusPlus.ID, "itemDustTechnetiumHexafluoride", 1), // Technetium Hexafluoride Dust
                getModItem(GTPlusPlus.ID, "itemDustSeleniumHexafluoride", 1), // Selenium Hexafluoride Dust
                getModItem(GTPlusPlus.ID, "itemDustLFTRFuel1", 1), // LFTR Fuel 1 Dust
                getModItem(GTPlusPlus.ID, "itemDustLFTRFuel2", 1), // LFTR Fuel 2 Dust
                getModItem(GTPlusPlus.ID, "itemDustLFTRFuel3", 1), // LFTR Fuel 3 Dust
                getModItem(GTPlusPlus.ID, "itemDustEnergyCrystal", 1), // Energy Crystal Dust
                getModItem(GTPlusPlus.ID, "itemDustBloodSteel", 1), // Blood Steel Dust
                getModItem(GTPlusPlus.ID, "itemDustZeron100", 1), // Zeron-100 Dust
                getModItem(GTPlusPlus.ID, "itemDustTumbaga", 1), // Tumbaga Dust
                getModItem(GTPlusPlus.ID, "itemDustPotin", 1), // Potin Dust
                getModItem(GTPlusPlus.ID, "itemDustStaballoy", 1), // Staballoy Dust
                getModItem(GTPlusPlus.ID, "itemDustTantalloy60", 1), // Tantalloy-60 Dust
                getModItem(GTPlusPlus.ID, "itemDustTantalloy61", 1), // Tantalloy-61 Dust
                getModItem(GTPlusPlus.ID, "itemDustInconel625", 1), // Inconel-625 Dust
                getModItem(GTPlusPlus.ID, "itemDustInconel690", 1), // Inconel-690 Dust
                getModItem(GTPlusPlus.ID, "itemDustInconel792", 1), // Inconel-792 Dust
                getModItem(GTPlusPlus.ID, "itemDustEglinSteelBaseCompound", 1), // Eglin Steel Base Compound Dust
                getModItem(GTPlusPlus.ID, "itemDustEglinSteel", 1), // Eglin Steel Dust
                getModItem(GTPlusPlus.ID, "itemDustMaragingSteel250", 1), // Maraging Steel 250 Dust
                getModItem(GTPlusPlus.ID, "itemDustMaragingSteel300", 1), // Maraging Steel 300 Dust
                getModItem(GTPlusPlus.ID, "itemDustMaragingSteel350", 1), // Maraging Steel 350 Dust
                getModItem(GTPlusPlus.ID, "itemDustWatertightSteel", 1), // Watertight Steel Dust
                getModItem(GTPlusPlus.ID, "itemDustNitinol60", 1), // Nitinol 60 Dust
                getModItem(GTPlusPlus.ID, "itemDustStellite", 1), // Stellite Dust
                getModItem(GTPlusPlus.ID, "itemDustTalonite", 1), // Talonite Dust
                getModItem(GTPlusPlus.ID, "itemDustHastelloyW", 1), // Hastelloy-W Dust
                getModItem(GTPlusPlus.ID, "itemDustHastelloyX", 1), // Hastelloy-X Dust
                getModItem(GTPlusPlus.ID, "itemDustHastelloyC276", 1), // Hastelloy-C276 Dust
                getModItem(GTPlusPlus.ID, "itemDustHastelloyN", 1), // Hastelloy-N Dust
                getModItem(GTPlusPlus.ID, "itemDustIncoloy020", 1), // Incoloy-020 Dust
                getModItem(GTPlusPlus.ID, "itemDustIncoloyDS", 1), // Incoloy-DS Dust
                getModItem(GTPlusPlus.ID, "itemDustIncoloyMA956", 1), // Incoloy-MA956 Dust
                getModItem(GTPlusPlus.ID, "itemDustGrisium", 1), // Grisium Dust
                getModItem(GTPlusPlus.ID, "itemDustHG1223", 1), // HG-1223 Dust
                getModItem(GTPlusPlus.ID, "itemDustTriniumTitaniumAlloy", 1), // Trinium Titanium Alloy Dust
                getModItem(GTPlusPlus.ID, "itemDustTriniumNaquadahAlloy", 1), // Trinium Naquadah Alloy Dust
                getModItem(GTPlusPlus.ID, "itemDustTriniumNaquadahCarbonite", 1), // Trinium Naquadah Carbonite Dust
                getModItem(GTPlusPlus.ID, "itemDustArceusAlloy2B", 1), // Arceus Alloy 2B Dust
                getModItem(GTPlusPlus.ID, "itemDustHeLiCoPtEr", 1), // HeLiCoPtEr Dust
                getModItem(GTPlusPlus.ID, "itemDustLafiumCompound", 1), // Lafium Compound Dust
                getModItem(GTPlusPlus.ID, "itemDustCinobiteA243", 1), // Cinobite A243 Dust
                getModItem(GTPlusPlus.ID, "itemDustPikyonium64B", 1), // Pikyonium 64B Dust
                getModItem(GTPlusPlus.ID, "itemDustAbyssalAlloy", 1), // Abyssal Alloy Dust
                getModItem(GTPlusPlus.ID, "itemDustLaurenium", 1), // Laurenium Dust
                getModItem(GTPlusPlus.ID, "itemDustBotmium", 1), // Botmium Dust
                getModItem(GTPlusPlus.ID, "itemDustHS188A", 1), // HS-188A Dust
                getModItem(GTPlusPlus.ID, "itemDustTitansteel", 1), // Titansteel Dust
                getModItem(GTPlusPlus.ID, "itemDustArcanite", 1), // Arcanite Dust
                getModItem(GTPlusPlus.ID, "itemDustOctiron", 1), // Octiron Dust
                getModItem(GTPlusPlus.ID, "itemDustBabbitAlloy", 1), // Babbit Alloy Dust
                getModItem(GTPlusPlus.ID, "itemDustBlackTitanium", 1), // Black Titanium Dust
                getModItem(GTPlusPlus.ID, "itemDustIndalloy140", 1), // Indalloy 140 Dust
                getModItem(GTPlusPlus.ID, "itemDustRhugnor", 1), // Rhugnor Dust
                getModItem(GTPlusPlus.ID, "itemDustQuantum", 1), // Quantum Dust
                getModItem(GTPlusPlus.ID, "itemDustFluoriteF", 1), // Fluorite (F) Dust
                getModItem(GTPlusPlus.ID, "itemDustKoboldite", 1), // Koboldite Dust
                getModItem(GTPlusPlus.ID, "itemDustCrocoite", 1), // Crocoite Dust
                getModItem(GTPlusPlus.ID, "itemDustGeikielite", 1), // Geikielite Dust
                getModItem(GTPlusPlus.ID, "itemDustNichromite", 1), // Nichromite Dust
                getModItem(GTPlusPlus.ID, "itemDustTitanite", 1), // Titanite Dust
                getModItem(GTPlusPlus.ID, "itemDustZimbabweite", 1), // Zimbabweite Dust
                getModItem(GTPlusPlus.ID, "itemDustZirconolite", 1), // Zirconolite Dust
                getModItem(GTPlusPlus.ID, "itemDustGadoliniteCe", 1), // Gadolinite (Ce) Dust
                getModItem(GTPlusPlus.ID, "itemDustGadoliniteY", 1), // Gadolinite (Y) Dust
                getModItem(GTPlusPlus.ID, "itemDustLepersonnite", 1), // Lepersonnite Dust
                getModItem(GTPlusPlus.ID, "itemDustSamarskiteY", 1), // Samarskite (Y) Dust
                getModItem(GTPlusPlus.ID, "itemDustSamarskiteYb", 1), // Samarskite (Yb) Dust
                getModItem(GTPlusPlus.ID, "itemDustXenotime", 1), // Xenotime Dust
                getModItem(GTPlusPlus.ID, "itemDustYttriaite", 1), // Yttriaite Dust
                getModItem(GTPlusPlus.ID, "itemDustYttrialite", 1), // Yttrialite Dust
                getModItem(GTPlusPlus.ID, "itemDustYttrocerite", 1), // Yttrocerite Dust
                getModItem(GTPlusPlus.ID, "itemDustZircon", 1), // Zircon Dust
                getModItem(GTPlusPlus.ID, "itemDustPolycrase", 1), // Polycrase Dust
                getModItem(GTPlusPlus.ID, "itemDustZircophyllite", 1), // Zircophyllite Dust
                getModItem(GTPlusPlus.ID, "itemDustZirkelite", 1), // Zirkelite Dust
                getModItem(GTPlusPlus.ID, "itemDustLanthaniteLa", 1), // Lanthanite (La) Dust
                getModItem(GTPlusPlus.ID, "itemDustLanthaniteCe", 1), // Lanthanite (Ce) Dust
                getModItem(GTPlusPlus.ID, "itemDustLanthaniteNd", 1), // Lanthanite (Nd) Dust
                getModItem(GTPlusPlus.ID, "itemDustAgarditeY", 1), // Agardite (Y) Dust
                getModItem(GTPlusPlus.ID, "itemDustAgarditeCd", 1), // Agardite (Cd) Dust
                getModItem(GTPlusPlus.ID, "itemDustAgarditeLa", 1), // Agardite (La) Dust
                getModItem(GTPlusPlus.ID, "itemDustAgarditeNd", 1), // Agardite (Nd) Dust
                getModItem(GTPlusPlus.ID, "itemDustHibonite", 1), // Hibonite Dust
                getModItem(GTPlusPlus.ID, "itemDustCerite", 1), // Cerite Dust
                getModItem(GTPlusPlus.ID, "itemDustFluorcaphite", 1), // Fluorcaphite Dust
                getModItem(GTPlusPlus.ID, "itemDustFlorencite", 1) // Florencite Dust
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Dust Mode")
            .eut(0)
            .addTo(addFakeVoidDustRecipes_T10);

        // GTPlusPlus
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L))
            .itemOutputs(
                getModItem(GTPlusPlus.ID, "itemDustCryoliteF", 1), // Cryolite (F) Dust
                getModItem(GTPlusPlus.ID, "itemDustLautarite", 1), // Lautarite Dust
                getModItem(GTPlusPlus.ID, "itemDustLafossaite", 1), // Lafossaite Dust
                getModItem(GTPlusPlus.ID, "itemDustDemicheleiteBr", 1), // Demicheleite (Br) Dust
                getModItem(GTPlusPlus.ID, "itemDustComancheite", 1), // Comancheite Dust
                getModItem(GTPlusPlus.ID, "itemDustPerroudite", 1), // Perroudite Dust
                getModItem(GTPlusPlus.ID, "itemDustHoneaite", 1), // Honeaite Dust
                getModItem(GTPlusPlus.ID, "itemDustAlburnite", 1), // Alburnite Dust
                getModItem(GTPlusPlus.ID, "itemDustMiessiite", 1), // Miessiite Dust

                getModItem(GTPlusPlus.ID, "itemDustKashinite", 1), // Kashinite Dust
                getModItem(GTPlusPlus.ID, "itemDustIrarsite", 1), // Irarsite Dust
                getModItem(GTPlusPlus.ID, "itemDustGreenockite", 1), // Greenockite Dust
                getModItem(GTPlusPlus.ID, "itemDustBariteRa", 1), // Barite (Ra) Dust
                getModItem(GTPlusPlus.ID, "itemDustRadioactiveMineralMix", 1), // Strange Dust
                getModItem(GTPlusPlus.ID, "itemDustInfusedAir", 1), // Infused Air Dust
                getModItem(GTPlusPlus.ID, "itemDustInfusedFire", 1), // Infused Fire Dust
                getModItem(GTPlusPlus.ID, "itemDustInfusedEarth", 1), // Infused Earth Dust
                getModItem(GTPlusPlus.ID, "itemDustInfusedWater", 1), // Infused Water Dust

                getModItem(GTPlusPlus.ID, "itemDustWood'sGlass", 1), // Wood's Glass Dust
                getModItem(GTPlusPlus.ID, "itemDustLithiumCarbonate", 1), // Lithium Carbonate Dust
                getModItem(GTPlusPlus.ID, "itemDustLithiumPeroxide", 1), // Lithium Peroxide Dust
                getModItem(GTPlusPlus.ID, "itemDustLithiumHydroxide", 1), // Lithium Hydroxide Dust
                getModItem(GTPlusPlus.ID, "itemDustCalciumHydroxide", 1), // Hydrated Lime Dust
                getModItem(GTPlusPlus.ID, "itemDustCalciumCarbonate", 1), // Calcium Carbonate Dust
                getModItem(GTPlusPlus.ID, "itemDustGypsum", 1), // Calcium Sulfate (Gypsum) Dust
                getModItem(GTPlusPlus.ID, "itemDustLi2CO3CaOH2", 1), // Li2CO3 + Ca(OH)2 Compound Dust
                getModItem(GTPlusPlus.ID, "itemDustSodiumFluoride", 1), // Sodium Fluoride Dust

                getModItem(GTPlusPlus.ID, "itemDustLi2BeF4", 1), // Li2BeF4 Fuel Compound Dust
                getModItem(GTPlusPlus.ID, "itemDustZrCl4", 1), // ZrCl4 Dust
                getModItem(GTPlusPlus.ID, "itemDustCookedZrCl4", 1), // Cooked ZrCl4 Dust
                getModItem(GTPlusPlus.ID, "itemDustUN18Fertiliser", 1), // UN-18 Fertiliser Dust
                getModItem(GTPlusPlus.ID, "itemDustUN32Fertiliser", 1), // UN-32 Fertiliser Dust
                getModItem(GTPlusPlus.ID, "itemDustDecayedRadium226", 1), // Decayed Radium 226 Dust
                getModItem(GTPlusPlus.ID, "itemDustPhthalicAnhydride", 1), // Phthalic Anhydride Dust
                getModItem(GTPlusPlus.ID, "itemDustLithiumHydroperoxide", 1), // Lithium Hydroperoxide Dust
                getModItem(GTPlusPlus.ID, "itemDustFormaldehydeCatalyst", 1), // Formaldehyde Catalyst Dust

                getModItem(GTPlusPlus.ID, "itemDustAmmoniumNitrate", 1), // Ammonium Nitrate Dust
                getModItem(GTPlusPlus.ID, "itemDustManureByproducts", 1), // Manure Byproducts Dust
                getModItem(GTPlusPlus.ID, "itemDustOrganicFertilizer", 1), // Organic Fertilizer Dust
                getModItem(GTPlusPlus.ID, "itemDustDirt", 1) // Dirt Dust
            )
            .fake()
            .duration(3 * SECONDS)
            .setNEIDesc("Singularity with Dust Mode")
            .eut(0)
            .addTo(addFakeVoidDustRecipes_T10);
    }
}
