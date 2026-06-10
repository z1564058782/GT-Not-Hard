package Recipes.SingularityRecipes_VoidFluid;

import static gregtech.api.enums.Mods.NEIOrePlugin;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;
import static util.AggregateFluidStackArray.addSplitAggregateArray;
import static util.AggregateFluidStackArray.checkFluidStack;

import java.util.HashMap;
import java.util.Map;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.OneToManyFluidsFrontend_Large;

public class SingularityFluidRecipes_T10 {

    public static final Map<String, FluidStack[]> VoidFluidRecipes_T10 = new HashMap<>();

    public static int NEI_ItemOutput_Size = 90;

    public static final RecipeMap<RecipeMapBackend> addFakeVoidFluidRecipes_T10 = RecipeMapBuilder
        .of("Singularity of T10 Fluid")
        .maxIO(1, 0, 0, NEI_ItemOutput_Size)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyFluidsFrontend_Large::new)
        .neiTransferRect(81, 27, 14, 16)
        .build();

    public static final FluidStack[] T10_Fluid = new FluidStack[] {
        // NEI Page 1/18
        // 1,1-Dimethylhydrazine
        FluidRegistry.getFluidStack("1,1dimethylhydrazine", 1),

        // 1,2-Dimethylbenzene
        FluidRegistry.getFluidStack("dimethylbenzene", 1),

        // 1,3-Dimethylbenzene
        FluidRegistry.getFluidStack("1,3dimethylbenzene", 1),

        // 1,4-Butanediol
        FluidRegistry.getFluidStack("1,4-butanediol", 1),

        // 1,4-Dimethylbenzene
        FluidRegistry.getFluidStack("1,4dimethylbenzene", 1),

        // 2-Ethyl-1-Hexanol
        FluidRegistry.getFluidStack("2-ethyl-1-hexanol", 1),

        // 2-Ethylanthrahydroquinone
        FluidRegistry.getFluidStack("fluid.2ethylanthrahydroquinone", 1),

        // 2-Ethylanthraquinone
        FluidRegistry.getFluidStack("fluid.2ethylanthraquinone", 1),

        // 2-Nitrochlorobenzene
        FluidRegistry.getFluidStack("2nitrochlorobenzene", 1),

        // 3,3-Diaminobenzidine
        FluidRegistry.getFluidStack("3,3diaminobenzidine", 1),

        // 3,3-Dichlorobenzidine
        FluidRegistry.getFluidStack("3,3dichlorobenzidine", 1),

        // 4-Nitroaniline
        FluidRegistry.getFluidStack("4nitroaniline", 1),

        // Acetaldehyde
        FluidRegistry.getFluidStack("acetaldehyde", 1),

        // Acetic Acid
        FluidRegistry.getFluidStack("aceticacid", 1),

        // Acetic Anhydride
        FluidRegistry.getFluidStack("molten.aceticanhydride", 1),

        // Acetone
        FluidRegistry.getFluidStack("acetone", 1),

        // Acetylene
        FluidRegistry.getFluidStack("acetylene", 1),

        // Acid Naquadah Emulsion
        FluidRegistry.getFluidStack("acid naquadah emulsion", 1),

        // Acidic Iridium Solution
        FluidRegistry.getFluidStack("acidic iridium solution", 1),

        // Acidic Osmium Solution
        FluidRegistry.getFluidStack("acidic osmium solution", 1),

        // Acidicised 1,4-Butanediol
        FluidRegistry.getFluidStack("acidicised 1,4-butanediol", 1),

        // Activated Netherite
        FluidRegistry.getFluidStack("activatednetherite", 1),

        // Advanced Glue
        FluidRegistry.getFluidStack("advancedglue", 1),

        // Advanced Nitinol Plasma
        FluidRegistry.getFluidStack("plasma.advancednitinol", 1),

        // Aequalitas Super Critical Fluid
        FluidRegistry.getFluidStack("gaseouscustom1essentia", 1),

        // Aer Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousaeressentia", 1),

        // Air
        FluidRegistry.getFluidStack("air", 1),

        // Alcopops
        FluidRegistry.getFluidStack("potion.alcopops", 1),

        // Alienis Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousalienisessentia", 1),

        // Allyl Chloride
        FluidRegistry.getFluidStack("allylchloride", 1),

        // Almandine Froth
        FluidRegistry.getFluidStack("froth.almandineflotation", 1),

        // Aluminium Plasma
        FluidRegistry.getFluidStack("plasma.aluminium", 1),

        // Americium Plasma
        FluidRegistry.getFluidStack("plasma.americium", 1),

        // Ammonia
        FluidRegistry.getFluidStack("ammonia", 1),

        // Ammonium
        FluidRegistry.getFluidStack("molten.ammonium", 1),

        // Ammonium Bifluoride
        FluidRegistry.getFluidStack("molten.ammoniumbifluoride", 1),

        // Ammonium Chloride
        FluidRegistry.getFluidStack("ammonium chloride", 1),

        // Ammonium Nitrate Solution
        FluidRegistry.getFluidStack("ammonium nitrate solution", 1),

        // Ammonium Tetrafluoroberyllate
        FluidRegistry.getFluidStack("molten.ammoniumtetrafluoroberyllate", 1),

        // Anaerobic Oil Bacteria Fluid
        FluidRegistry.getFluidStack("pseudomonasveroniifluid", 1),

        // Aniline
        FluidRegistry.getFluidStack("aniline", 1),

        // Anthracene
        FluidRegistry.getFluidStack("fluid.anthracene", 1),

        // Anti-Knock Agent
        FluidRegistry.getFluidStack("ethyltertbutylether", 1),

        // Antimony Pentachloride
        FluidRegistry.getFluidStack("antimony pentachloride", 1),

        // Antimony Pentachloride Solution
        FluidRegistry.getFluidStack("antimony pentachloride solution", 1),

        // Antimony Pentafluoride
        FluidRegistry.getFluidStack("antimony pentafluoride", 1),

        // Antimony Pentafluoride Solution
        FluidRegistry.getFluidStack("antimony pentafluoride solution", 1),

        // Antimony Plasma
        FluidRegistry.getFluidStack("plasma.antimony", 1),

        // Antimony Trichloride Solution
        FluidRegistry.getFluidStack("antimony trichloride solution", 1),

        // Apple Juice
        FluidRegistry.getFluidStack("potion.applejuice", 1),

        // Aqua Regia
        FluidRegistry.getFluidStack("aqua regia", 1),

        // Aqua Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousaquaessentia", 1),

        // Arbor Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousarboressentia", 1),

        // Ardite Plasma
        FluidRegistry.getFluidStack("plasma.ardite", 1),

        // Argon
        FluidRegistry.getFluidStack("argon", 1),

        // Argon Plasma
        FluidRegistry.getFluidStack("plasma.argon", 1),

        // Arsenic Plasma
        FluidRegistry.getFluidStack("plasma.arsenic", 1),

        // Astral Titanium Plasma
        FluidRegistry.getFluidStack("plasma.astraltitanium", 1),

        // Astrum Super Critical Fluid
        FluidRegistry.getFluidStack("gaseouscustom4essentia", 1),

        // Atmospheric Gases
        FluidRegistry.getFluidStack("atmosphericgases", 1),

        // Auram Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousauramessentia", 1),

        // Awakened Draconium Plasma
        FluidRegistry.getFluidStack("plasma.draconiumawakened", 1),

        // Awkward Brew
        FluidRegistry.getFluidStack("potion.awkward", 1),

        // Bacteria
        FluidRegistry.getFluidStack("binnie.bacteria", 1),

        // Bacteria Vector
        FluidRegistry.getFluidStack("binnie.bacteriavector", 1),

        // Bacterial Sludge
        FluidRegistry.getFluidStack("bacterialsludge", 1),

        // Barium Plasma
        FluidRegistry.getFluidStack("plasma.barium", 1),

        // Bastnasite Rarer Earth Oxide Suspension
        FluidRegistry.getFluidStack("bastnasite rarer earth oxide suspension", 1),

        // Bauxite Slurry
        FluidRegistry.getFluidStack("bauxiteslurry", 1),

        // Bedrockium Plasma
        FluidRegistry.getFluidStack("plasma.bedrockium", 1),

        // Beer
        FluidRegistry.getFluidStack("potion.beer", 1),

        // Beer Yeast Fluid
        FluidRegistry.getFluidStack("saccharomycescerevisiaevarcerevisiaefluid", 1),

        // Benzene
        FluidRegistry.getFluidStack("benzene", 1),

        // Beryllium Fluoride
        FluidRegistry.getFluidStack("molten.berylliumfluoride", 1),

        // Beryllium Hydroxide
        FluidRegistry.getFluidStack("molten.berylliumhydroxide", 1),

        // Beryllium Plasma
        FluidRegistry.getFluidStack("plasma.beryllium", 1),

        // Bestia Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousbestiaessentia", 1),

        // Bio Diesel
        FluidRegistry.getFluidStack("biodiesel", 1),

        // Biofuel
        FluidRegistry.getFluidStack("biofuel", 1),

        // Biogas
        FluidRegistry.getFluidStack("ic2biogas", 1),

        // Biomass
        FluidRegistry.getFluidStack("biomass", 1),

        // Biomass
        FluidRegistry.getFluidStack("ic2biomass", 1),

        // Bismuth Plasma
        FluidRegistry.getFluidStack("plasma.bismuth", 1),

        // Black Dwarf Matter
        FluidRegistry.getFluidStack("blackdwarfmatter", 1),

        // Blazing Pyrotheum
        FluidRegistry.getFluidStack("pyrotheum", 1),

        // Blood
        FluidRegistry.getFluidStack("hell_blood", 1),

        // Blood
        FluidRegistry.getFluidStack("blood", 1),

        // Blue Vitriol Water Solution
        FluidRegistry.getFluidStack("solution.bluevitriol", 1),

        // Boric Acid
        FluidRegistry.getFluidStack("boricacid", 1),

        // Boron Plasma
        FluidRegistry.getFluidStack("plasma.boron", 1),

        // NEI Page 2/18
        // Boron Trichloride
        FluidRegistry.getFluidStack("boron trichloride", 1),

        // Brew
        FluidRegistry.getFluidStack("witchery:brew", 1),

        // Brew Gas
        FluidRegistry.getFluidStack("witchery:brewgas", 1),

        // Brew Liquid
        FluidRegistry.getFluidStack("witchery:brewliquid", 1),

        // Brine
        FluidRegistry.getFluidStack("molten.brine", 1),

        // Bromine
        FluidRegistry.getFluidStack("molten.bromine", 1),

        // Bromine Plasma
        FluidRegistry.getFluidStack("plasma.bromine", 1),

        // Burnt LiFBeF2ThF4UF4 Salt
        FluidRegistry.getFluidStack("fluid.burntlifbef2thf4uf4", 1),

        // Burnt LiFBeF2ZrF4U235 Salt
        FluidRegistry.getFluidStack("fluid.burntlifbef2zrf4u235", 1),

        // Burnt LiFBeF2ZrF4UF4 Salt
        FluidRegistry.getFluidStack("fluid.burntlifbef2zrf4uf4", 1),

        // Burnt Reactor Fuel I
        FluidRegistry.getFluidStack("molten.burntreactorfueli", 1),

        // Burnt Reactor Fuel II
        FluidRegistry.getFluidStack("molten.burntreactorfuelii", 1),

        // Butadiene
        FluidRegistry.getFluidStack("butadiene", 1),

        // Butane
        FluidRegistry.getFluidStack("butane", 1),

        // Butanol
        FluidRegistry.getFluidStack("butanol", 1),

        // Butene
        FluidRegistry.getFluidStack("butene", 1),

        // Butyraldehyde
        FluidRegistry.getFluidStack("butyraldehyde", 1),

        // CN3H7O3 Rocket Fuel
        FluidRegistry.getFluidStack("fluid.rocketfuelmixc", 1),

        // Cadaverine
        FluidRegistry.getFluidStack("cadaverine", 1),

        // Cadmium Plasma
        FluidRegistry.getFluidStack("plasma.cadmium", 1),

        // Caelum Super Critical Fluid
        FluidRegistry.getFluidStack("gaseouscaelumessentia", 1),

        // Caesium Plasma
        FluidRegistry.getFluidStack("plasma.caesium", 1),

        // Calcium Acetate Solution
        FluidRegistry.getFluidStack("calciumacetatesolution", 1),

        // Calcium Chloride
        FluidRegistry.getFluidStack("calcium chloride", 1),

        // Calcium Fluoride
        FluidRegistry.getFluidStack("calcium fluoride", 1),

        // Calcium Plasma
        FluidRegistry.getFluidStack("plasma.calcium", 1),

        // Californium Plasma
        FluidRegistry.getFluidStack("plasma.californium", 1),

        // Carbon Dioxide
        FluidRegistry.getFluidStack("carbondioxide", 1),

        // Carbon Disulfide
        FluidRegistry.getFluidStack("carbondisulfide", 1),

        // Carbon Monoxide
        FluidRegistry.getFluidStack("carbonmonoxide", 1),

        // Carbon Plasma
        FluidRegistry.getFluidStack("plasma.carbon", 1),

        // Cave Johnsons Grenade Juice
        FluidRegistry.getFluidStack("potion.cavejohnsonsgrenadejuice", 1),

        // Celestial Tungsten Plasma
        FluidRegistry.getFluidStack("plasma.celestialtungsten", 1),

        // Cerium Chloride Concentrate
        FluidRegistry.getFluidStack("cerium chloride concentrate", 1),

        // Cerium Extracting Nano Resin
        FluidRegistry.getFluidStack("cerium extracting nano resin", 1),

        // Cerium Plasma
        FluidRegistry.getFluidStack("plasma.cerium", 1),

        // Cetane-Boosted Diesel
        FluidRegistry.getFluidStack("nitrofuel", 1),

        // Chalcopyrite Froth
        FluidRegistry.getFluidStack("froth.copperflotation", 1),

        // Charcoal Byproducts
        FluidRegistry.getFluidStack("charcoal_byproducts", 1),

        // Chemical Black Dye
        FluidRegistry.getFluidStack("dye.chemical.dyeblack", 1),

        // Chemical Blue Dye
        FluidRegistry.getFluidStack("dye.chemical.dyeblue", 1),

        // Chemical Brown Dye
        FluidRegistry.getFluidStack("dye.chemical.dyebrown", 1),

        // Chemical Cyan Dye
        FluidRegistry.getFluidStack("dye.chemical.dyecyan", 1),

        // Chemical Gray Dye
        FluidRegistry.getFluidStack("dye.chemical.dyegray", 1),

        // Chemical Green Dye
        FluidRegistry.getFluidStack("dye.chemical.dyegreen", 1),

        // Chemical Light Blue Dye
        FluidRegistry.getFluidStack("dye.chemical.dyelightblue", 1),

        // Chemical Light Gray Dye
        FluidRegistry.getFluidStack("dye.chemical.dyelightgray", 1),

        // Chemical Lime Dye
        FluidRegistry.getFluidStack("dye.chemical.dyelime", 1),

        // Chemical Magenta Dye
        FluidRegistry.getFluidStack("dye.chemical.dyemagenta", 1),

        // Chemical Orange Dye
        FluidRegistry.getFluidStack("dye.chemical.dyeorange", 1),

        // Chemical Pink Dye
        FluidRegistry.getFluidStack("dye.chemical.dyepink", 1),

        // Chemical Purple Dye
        FluidRegistry.getFluidStack("dye.chemical.dyepurple", 1),

        // Chemical Red Dye
        FluidRegistry.getFluidStack("dye.chemical.dyered", 1),

        // Chemical White Dye
        FluidRegistry.getFluidStack("dye.chemical.dyewhite", 1),

        // Chemical Yellow Dye
        FluidRegistry.getFluidStack("dye.chemical.dyeyellow", 1),

        // Chilly Sauce
        FluidRegistry.getFluidStack("potion.chillysauce", 1),

        // Chloramine
        FluidRegistry.getFluidStack("chloramine", 1),

        // Chlorinated Rare Earth Concentrate
        FluidRegistry.getFluidStack("chlorinated rare earth concentrate", 1),

        // Chlorinated Rare Earth Diluted Solution
        FluidRegistry.getFluidStack("chlorinated rare earth diluted solution", 1),

        // Chlorinated Rare Earth Enriched Solution
        FluidRegistry.getFluidStack("chlorinated rare earth enriched solution", 1),

        // Chlorine
        FluidRegistry.getFluidStack("chlorine", 1),

        // Chlorine Plasma
        FluidRegistry.getFluidStack("plasma.chlorine", 1),

        // Chloroacetic Acid
        FluidRegistry.getFluidStack("molten.chloroaceticacid", 1),

        // Chloroacetic Mixture
        FluidRegistry.getFluidStack("molten.chloroaceticmixture", 1),

        // Chlorobenzene
        FluidRegistry.getFluidStack("chlorobenzene", 1),

        // Chloroform
        FluidRegistry.getFluidStack("chloroform", 1),

        // Chloromethane
        FluidRegistry.getFluidStack("chloromethane", 1),

        // Chocolate Milk
        FluidRegistry.getFluidStack("potion.chocolatemilk", 1),

        // Chromatic Glass Plasma
        FluidRegistry.getFluidStack("plasma.chromaticglass", 1),

        // Chrome Plasma
        FluidRegistry.getFluidStack("plasma.chrome", 1),

        // Cider
        FluidRegistry.getFluidStack("potion.cider", 1),

        // Cloud Seed
        FluidRegistry.getFluidStack("cloud_seed", 1),

        // Coal Gas
        FluidRegistry.getFluidStack("fluid.coalgas", 1),

        // Coal Tar
        FluidRegistry.getFluidStack("fluid.coaltar", 1),

        // Coal Tar Oil
        FluidRegistry.getFluidStack("fluid.coaltaroil", 1),

        // Cobalt Plasma
        FluidRegistry.getFluidStack("plasma.cobalt", 1),

        // Coffee
        FluidRegistry.getFluidStack("potion.coffee", 1),

        // Cognitio Super Critical Fluid
        FluidRegistry.getFluidStack("gaseouscognitioessentia", 1),

        // Combustion Promoter
        FluidRegistry.getFluidStack("combustionpromotor", 1),

        // Common Yeast Fluid
        FluidRegistry.getFluidStack("saccharomycescerevisiaefluid", 1),

        // Complexity Catalyst
        FluidRegistry.getFluidStack("complexitycatalyst", 1),

        // CompressedNitrogen
        FluidRegistry.getFluidStack("compressednitrogen", 1),

        // CompressedOxygen
        FluidRegistry.getFluidStack("compressedoxygen", 1),

        // Concentrated Cloud Seed
        FluidRegistry.getFluidStack("cloud_seed_concentrated", 1),

        // Concrete
        FluidRegistry.getFluidStack("concrete", 1),

        // Condensed Raw Stellar Plasma Mixture
        FluidRegistry.getFluidStack("rawstarmatter", 1),

        // Conditioned Bastnasite Mud
        FluidRegistry.getFluidStack("conditioned bastnasite mud", 1),

        // Construction Foam
        FluidRegistry.getFluidStack("ic2constructionfoam", 1),

        // Copper Plasma
        FluidRegistry.getFluidStack("plasma.copper", 1),

        // Corpus Super Critical Fluid
        FluidRegistry.getFluidStack("gaseouscorpusessentia", 1),

        // NEI Page 3/18
        // Cosmic Neutronium Plasma
        FluidRegistry.getFluidStack("plasma.cosmicneutronium", 1),

        // Cracked Radox
        FluidRegistry.getFluidStack("crackedradox", 1),

        // Creon Plasma
        FluidRegistry.getFluidStack("plasma.creon", 1),

        // Creosote Oil
        FluidRegistry.getFluidStack("creosote", 1),

        // Crushed Ice
        FluidRegistry.getFluidStack("ice", 1),

        // Curium Plasma
        FluidRegistry.getFluidStack("plasma.curium", 1),

        // Cyanoacrylate Polymer
        FluidRegistry.getFluidStack("molten.cyanoacrylatepolymer", 1),

        // Cyclohexane
        FluidRegistry.getFluidStack("cyclohexane", 1),

        // Cyclohexanone
        FluidRegistry.getFluidStack("cyclohexanone", 1),

        // Cyclopentadiene
        FluidRegistry.getFluidStack("cyclopentadiene", 1),

        // Dark Beer
        FluidRegistry.getFluidStack("potion.darkbeer", 1),

        // Dark Chocolate Milk
        FluidRegistry.getFluidStack("potion.darkchocolatemilk", 1),

        // Degassed Decontaminant-Free Water (Grade 7)
        FluidRegistry.getFluidStack("grade7purifiedwater", 1),

        // Degenerate Quark Gluon Plasma
        FluidRegistry.getFluidStack("quarkgluonplasma", 1),

        // Dense Hydrazine Fuel Mixture
        FluidRegistry.getFluidStack("fluid.rocketfuelmixd", 1),

        // Dense Steam
        FluidRegistry.getFluidStack("densesteam", 1),

        // Dense Supercritical Steam
        FluidRegistry.getFluidStack("densesupercriticalsteam", 1),

        // Dense Superheated Steam
        FluidRegistry.getFluidStack("densesuperheatedsteam", 1),

        // Desh Plasma
        FluidRegistry.getFluidStack("plasma.desh", 1),

        // Desidia Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousdesidiaessentia", 1),

        // Deuterium
        FluidRegistry.getFluidStack("deuterium", 1),

        // Deuterium Plasma
        FluidRegistry.getFluidStack("plasma.deuterium", 1),

        // Dew of the Void
        FluidRegistry.getFluidStack("ender_distillation", 1),

        // Diablo Sauce
        FluidRegistry.getFluidStack("potion.diablosauce", 1),

        // Diabolo Sauce
        FluidRegistry.getFluidStack("potion.diabolosauce", 1),

        // Diaminodiphenylmethane Mixture
        FluidRegistry.getFluidStack("diaminodiphenylmethanmixture", 1),

        // Diaminotoluene
        FluidRegistry.getFluidStack("diaminotoluene", 1),

        // Dichloroacetic Acid
        FluidRegistry.getFluidStack("molten.dichloroaceticacid", 1),

        // Dichlorobenzene
        FluidRegistry.getFluidStack("dichlorobenzene", 1),

        // Dichlorosilane
        FluidRegistry.getFluidStack("dichlorosilane", 1),

        // Diethylamine
        FluidRegistry.getFluidStack("diethylamine", 1),

        // Diluted Acetone
        FluidRegistry.getFluidStack("diluted acetone", 1),

        // Diluted Bastnasite Mud
        FluidRegistry.getFluidStack("diluted bastnasite mud", 1),

        // Diluted Hydrochloric Acid
        FluidRegistry.getFluidStack("dilutedhydrochloricacid_gt5u", 1),

        // Diluted Monazite Rare Earth Mud
        FluidRegistry.getFluidStack("diluted monazite rare earth mud", 1),

        // Diluted Monazite Sulfate
        FluidRegistry.getFluidStack("diluted monazite sulfate", 1),

        // Diluted Samarium Rare Earth Solution
        FluidRegistry.getFluidStack("diluted samarium rare earth solution", 1),

        // Diluted Sulfuric Acid
        FluidRegistry.getFluidStack("dilutedsulfuricacid", 1),

        // Diluted Xenoxene
        FluidRegistry.getFluidStack("dilutedxenoxene", 1),

        // Dimensionally Shifted Superfluid
        FluidRegistry.getFluidStack("dimensionallyshiftedsuperfluid", 1),

        // Dimensionally Transcendent Crude Catalyst
        FluidRegistry.getFluidStack("dimensionallytranscendentcrudecatalyst", 1),

        // Dimensionally Transcendent Exotic Catalyst
        FluidRegistry.getFluidStack("dimensionallytranscendentexoticcatalyst", 1),

        // Dimensionally Transcendent Prosaic Catalyst
        FluidRegistry.getFluidStack("dimensionallytranscendentprosaiccatalyst", 1),

        // Dimensionally Transcendent Residue
        FluidRegistry.getFluidStack("dimensionallytranscendentresidue", 1),

        // Dimensionally Transcendent Resplendent Catalyst
        FluidRegistry.getFluidStack("dimensionallytranscendentresplendentcatalyst", 1),

        // Dimensionally Transcendent Stellar Catalyst
        FluidRegistry.getFluidStack("dimensionallytranscendentstellarcatalyst", 1),

        // Dimethyl Terephthalate
        FluidRegistry.getFluidStack("dimethylterephthalate", 1),

        // Dimethylamine
        FluidRegistry.getFluidStack("dimethylamine", 1),

        // Dimethyldichlorosilane
        FluidRegistry.getFluidStack("dimethyldichlorosilane", 1),

        // Dinitrogen Tetroxide
        FluidRegistry.getFluidStack("dinitrogentetroxide", 1),

        // Dinitrotoluene
        FluidRegistry.getFluidStack("dinitrotoluene", 1),

        // Diphenyl Isophthalate
        FluidRegistry.getFluidStack("diphenylisophtalate", 1),

        // Diphenylmethane Diisocyanate Mixture
        FluidRegistry.getFluidStack("diphenylmethanediisocyanatemixture", 1),

        // Distilled Water
        FluidRegistry.getFluidStack("ic2distilledwater", 1),

        // Doppelkorn
        FluidRegistry.getFluidStack("potion.dkorn", 1),

        // Draconium Plasma
        FluidRegistry.getFluidStack("plasma.draconium", 1),

        // Dragon Blood
        FluidRegistry.getFluidStack("potion.dragonblood", 1),

        // Dragonblood Plasma
        FluidRegistry.getFluidStack("plasma.dragonblood", 1),

        // Drilling Fluid
        FluidRegistry.getFluidStack("liquid_drillingfluid", 1),

        // Dysprosium Chloride Concentrate
        FluidRegistry.getFluidStack("dysprosium chloride concentrate", 1),

        // Dysprosium Extracting Nano Resin
        FluidRegistry.getFluidStack("dysprosium extracting nano resin", 1),

        // Dysprosium Plasma
        FluidRegistry.getFluidStack("plasma.dysprosium", 1),

        // Electrum Super Critical Fluid
        FluidRegistry.getFluidStack("gaseouselectrumessentia", 1),

        // Empty Plasma
        FluidRegistry.getFluidStack("plasma.empty", 1),

        // Ender Goo
        FluidRegistry.getFluidStack("endergoo", 1),

        // Enriched Bacterial Sludge
        FluidRegistry.getFluidStack("enrichedbacterialsludge", 1),

        // Enriched Naquadah Goo
        FluidRegistry.getFluidStack("enriched naquadah goo", 1),

        // Enriched-Naquadah-Rich Solution
        FluidRegistry.getFluidStack("enriched-naquadah-rich solution", 1),

        // Entropic Catalyst
        FluidRegistry.getFluidStack("entropiccatalyst", 1),

        // EnzymesSollution
        FluidRegistry.getFluidStack("enzymessollution", 1),

        // Epichlorohydrin
        FluidRegistry.getFluidStack("liquid_epichlorhydrin", 1),

        // Erbium Chloride Concentrate
        FluidRegistry.getFluidStack("erbium chloride concentrate", 1),

        // Erbium Extracting Nano Resin
        FluidRegistry.getFluidStack("erbium extracting nano resin", 1),

        // Erbium Plasma
        FluidRegistry.getFluidStack("plasma.erbium", 1),

        // Ethane
        FluidRegistry.getFluidStack("ethane", 1),

        // Ethanol
        FluidRegistry.getFluidStack("bioethanol", 1),

        // Ethanol Gasoline
        FluidRegistry.getFluidStack("ethanol gasoline", 1),

        // Ethenone
        FluidRegistry.getFluidStack("ethenone", 1),

        // Ether
        FluidRegistry.getFluidStack("ether", 1),

        // Ethyl Cyanoacetate
        FluidRegistry.getFluidStack("molten.ethylcyanoacetate", 1),

        // Ethyl Cyanoacrylate (Super Glue)
        FluidRegistry.getFluidStack("molten.ethylcyanoacrylatesuperglue", 1),

        // Ethylbenzene
        FluidRegistry.getFluidStack("fluid.ethylbenzene", 1),

        // Ethylene
        FluidRegistry.getFluidStack("ethylene", 1),

        // Ethylene Glycol
        FluidRegistry.getFluidStack("ethyleneglycol", 1),

        // Ethylene Oxide
        FluidRegistry.getFluidStack("ethyleneoxide", 1),

        // Europium Chloride Concentrate
        FluidRegistry.getFluidStack("europium chloride concentrate", 1),

        // Europium Extracting Nano Resin
        FluidRegistry.getFluidStack("europium extracting nano resin", 1),

        // Europium Plasma
        FluidRegistry.getFluidStack("plasma.europium", 1),

        // Exanimis Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousexanimisessentia", 1),

        // Excited Dimensionally Transcendent Crude Catalyst
        FluidRegistry.getFluidStack("exciteddtcc", 1),

        // NEI Page 4/18
        // Excited Dimensionally Transcendent Exotic Catalyst
        FluidRegistry.getFluidStack("exciteddtec", 1),

        // Excited Dimensionally Transcendent Prosaic Catalyst
        FluidRegistry.getFluidStack("exciteddtpc", 1),

        // Excited Dimensionally Transcendent Resplendent Catalyst
        FluidRegistry.getFluidStack("exciteddtrc", 1),

        // Excited Dimensionally Transcendent Stellar Catalyst
        FluidRegistry.getFluidStack("exciteddtsc", 1),

        // Extreme-Temperature Treated Water (Grade 5)
        FluidRegistry.getFluidStack("grade5purifiedwater", 1),

        // Fabrico Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousfabricoessentia", 1),

        // Fake J?germeister
        FluidRegistry.getFluidStack("potion.njagi", 1),

        // Fames Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousfamesessentia", 1),

        // Fermentation Base
        FluidRegistry.getFluidStack("fermentation.base", 1),

        // Fermented Bacterial Sludge
        FluidRegistry.getFluidStack("fermentedbacterialsludge", 1),

        // Fermented Biomass
        FluidRegistry.getFluidStack("fermentedbiomass", 1),

        // Fermented Reedwater
        FluidRegistry.getFluidStack("potion.freed", 1),

        // Fermented Wheat
        FluidRegistry.getFluidStack("potion.fwheat", 1),

        // Fermium
        FluidRegistry.getFluidStack("molten.fermium", 1),

        // Fermium Plasma
        FluidRegistry.getFluidStack("plasma.fermium", 1),

        // Ferrocene Solution
        FluidRegistry.getFluidStack("ferrocene solution", 1),

        // Ferrocene Waste
        FluidRegistry.getFluidStack("ferrocene waste", 1),

        // Fertile Manure Slurry
        FluidRegistry.getFluidStack("fluid.fertile.manure.slurry", 1),

        // Fertiliser
        FluidRegistry.getFluidStack("fluid.fertiliser", 1),

        // Fiery Blood
        FluidRegistry.getFluidStack("fieryblood", 1),

        // Filled Cerium Extracting Nano Resin
        FluidRegistry.getFluidStack("filled cerium extracting nano resin", 1),

        // Filled Dysprosium Extracting Nano Resin
        FluidRegistry.getFluidStack("filled dysprosium extracting nano resin", 1),

        // Filled Erbium Extracting Nano Resin
        FluidRegistry.getFluidStack("filled erbium extracting nano resin", 1),

        // Filled Europium Extracting Nano Resin
        FluidRegistry.getFluidStack("filled europium extracting nano resin", 1),

        // Filled Gadolinium Extracting Nano Resin
        FluidRegistry.getFluidStack("filled gadolinium extracting nano resin", 1),

        // Filled Holmium Extracting Nano Resin
        FluidRegistry.getFluidStack("filled holmium extracting nano resin", 1),

        // Filled Lanthanum Extracting Nano Resin
        FluidRegistry.getFluidStack("filled lanthanum extracting nano resin", 1),

        // Filled Lutetium Extracting Nano Resin
        FluidRegistry.getFluidStack("filled lutetium extracting nano resin", 1),

        // Filled Neodymium Extracting Nano Resin
        FluidRegistry.getFluidStack("filled neodymium extracting nano resin", 1),

        // Filled Praseodymium Extracting Nano Resin
        FluidRegistry.getFluidStack("filled praseodymium extracting nano resin", 1),

        // Filled Promethium Extracting Nano Resin
        FluidRegistry.getFluidStack("filled promethium extracting nano resin", 1),

        // Filled Samarium Extracting Nano Resin
        FluidRegistry.getFluidStack("filled samarium extracting nano resin", 1),

        // Filled Terbium Extracting Nano Resin
        FluidRegistry.getFluidStack("filled terbium extracting nano resin", 1),

        // Filled Thulium Extracting Nano Resin
        FluidRegistry.getFluidStack("filled thulium extracting nano resin", 1),

        // Filled Ytterbium Extracting Nano Resin
        FluidRegistry.getFluidStack("filled ytterbium extracting nano resin", 1),

        // Filtered Bastnasite Mud
        FluidRegistry.getFluidStack("filtered bastnasite mud", 1),

        // Filtered Water (Grade 1)
        FluidRegistry.getFluidStack("grade1purifiedwater", 1),

        // Fire Resistant Brew
        FluidRegistry.getFluidStack("potion.fireresistance", 1),

        // Fire Water
        FluidRegistry.getFluidStack("fire_water", 1),

        // Fish Oil
        FluidRegistry.getFluidStack("fishoil", 1),

        // Fishy Brew
        FluidRegistry.getFluidStack("potion.waterbreathing", 1),

        // Flerovium Plasma
        FluidRegistry.getFluidStack("plasma.flerovium_gt5u", 1),

        // Flocculated Water (Grade 3)
        FluidRegistry.getFluidStack("grade3purifiedwater", 1),

        // Flocculation Waste Liquid
        FluidRegistry.getFluidStack("flocculationwasteliquid", 1),

        // Fluid Disease
        FluidRegistry.getFluidStack("witchery:fluiddisease", 1),

        // Fluid Spirit
        FluidRegistry.getFluidStack("witchery:fluidspirit", 1),

        // FluorecentdDNA
        FluidRegistry.getFluidStack("fluorecentddna", 1),

        // Fluorinated Uranium Hexafluoride (F-UF6)
        FluidRegistry.getFluidStack("molten.fluorinateduraniumhexafluoridefuf6", 1),

        // Fluorine
        FluidRegistry.getFluidStack("fluorine", 1),

        // Fluorine Plasma
        FluidRegistry.getFluidStack("plasma.fluorine", 1),

        // Fluorine Sparged T Salt
        FluidRegistry.getFluidStack("molten.fluorinespargedtsalt", 1),

        // Fluorine Sparged TB Salt
        FluidRegistry.getFluidStack("molten.fluorinespargedtbsalt", 1),

        // Fluorine-Rich Waste Liquid
        FluidRegistry.getFluidStack("fluorine-rich waste liquid", 1),

        // Fluoroantimonic Acid
        FluidRegistry.getFluidStack("fluoroantimonic acid", 1),

        // Fluoroform
        FluidRegistry.getFluidStack("fluoroform", 1),

        // Flux Goo
        FluidRegistry.getFluidStack("fluxgoo", 1),

        // Force Plasma
        FluidRegistry.getFluidStack("plasma.force", 1),

        // Formaldehyde
        FluidRegistry.getFluidStack("fluid.formaldehyde", 1),

        // Formic Acid
        FluidRegistry.getFluidStack("formic acid", 1),

        // Fruit Juice
        FluidRegistry.getFluidStack("juice", 1),

        // Fuel
        FluidRegistry.getFluidStack("fuel", 1),

        // Fulvic Acid
        FluidRegistry.getFluidStack("fulvic acid", 1),

        // Gadolinium Chloride Concentrate
        FluidRegistry.getFluidStack("gadolinium chloride concentrate", 1),

        // Gadolinium Extracting Nano Resin
        FluidRegistry.getFluidStack("gadolinium extracting nano resin", 1),

        // Gadolinium Plasma
        FluidRegistry.getFluidStack("plasma.gadolinium", 1),

        // Gallium Plasma
        FluidRegistry.getFluidStack("plasma.gallium", 1),

        // Gasoline
        FluidRegistry.getFluidStack("gasoline", 1),

        // Gelatin Mixture
        FluidRegistry.getFluidStack("gelatinmixture", 1),

        // Gelid Cryotheum
        FluidRegistry.getFluidStack("cryotheum", 1),

        // Gelum Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousgelumessentia", 1),

        // General Purpose Fermenting Bacteria Fluid
        FluidRegistry.getFluidStack("saccharomycesescherichiafluid", 1),

        // Generic High Proof
        FluidRegistry.getFluidStack("potion.ghp", 1),

        // Genetic Mutagen
        FluidRegistry.getFluidStack("fluid.geneticmutagen", 1),

        // Germanium Plasma
        FluidRegistry.getFluidStack("plasma.germanium", 1),

        // Glen McKenner
        FluidRegistry.getFluidStack("potion.glenmckenner", 1),

        // Gloria Super Critical Fluid
        FluidRegistry.getFluidStack("gaseouscustom5essentia", 1),

        // Glue
        FluidRegistry.getFluidStack("glue", 1),

        // Glycerol
        FluidRegistry.getFluidStack("glycerol", 1),

        // Glyceryl Trinitrate
        FluidRegistry.getFluidStack("glyceryl", 1),

        // Gold Plasma
        FluidRegistry.getFluidStack("plasma.gold", 1),

        // Golden Apple Juice
        FluidRegistry.getFluidStack("potion.goldenapplejuice", 1),

        // Golden Cider
        FluidRegistry.getFluidStack("potion.goldencider", 1),

        // Grape Juice
        FluidRegistry.getFluidStack("potion.grapejuice", 1),

        // Green Sapphire Juice
        FluidRegistry.getFluidStack("greensapphirejuice", 1),

        // Green Vitriol Water Solution
        FluidRegistry.getFluidStack("solution.greenvitriol", 1),

        // Grossular Froth
        FluidRegistry.getFluidStack("froth.grossularflotation", 1),

        // Growth Catalyst Medium
        FluidRegistry.getFluidStack("growthmediumsterilized", 1),

        // Growth Medium
        FluidRegistry.getFluidStack("binnie.growthmedium", 1),

        // Gula Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousgulaessentia", 1),

        // H8N4C2O4 Rocket Fuel
        FluidRegistry.getFluidStack("fluid.rocketfuelmixa", 1),

        // NEI Page 5/18
        // HG-1223
        FluidRegistry.getFluidStack("molten.hg1223", 1),

        // Hafnium Plasma
        FluidRegistry.getFluidStack("plasma.hafnium", 1),

        // Hafnium Tetrachloride Solution
        FluidRegistry.getFluidStack("hafnium tetrachloride solution", 1),

        // Harming Brew
        FluidRegistry.getFluidStack("potion.damage", 1),

        // Healing Brew
        FluidRegistry.getFluidStack("potion.health", 1),

        // Heated Bauxite Slurry
        FluidRegistry.getFluidStack("headedbauxiteslurry", 1),

        // Heated Fulvic Acid
        FluidRegistry.getFluidStack("heated fulvic acid", 1),

        // Heated Water
        FluidRegistry.getFluidStack("ic2hotwater", 1),

        // Heavy Fuel
        FluidRegistry.getFluidStack("liquid_heavy_fuel", 1),

        // Heavy Naquadah Fuel
        FluidRegistry.getFluidStack("heavy naquadah fuel", 1),

        // Heavy Oil
        FluidRegistry.getFluidStack("liquid_heavy_oil", 1),

        // Heavy Radox
        FluidRegistry.getFluidStack("heavyradox", 1),

        // Helium
        FluidRegistry.getFluidStack("helium", 1),

        // Helium Plasma
        FluidRegistry.getFluidStack("plasma.helium", 1),

        // Helium Sparged U Salt
        FluidRegistry.getFluidStack("molten.heliumspargedusalt", 1),

        // Helium-3
        FluidRegistry.getFluidStack("helium-3", 1),

        // Helium-3 Plasma
        FluidRegistry.getFluidStack("plasma.helium_3", 1),

        // Herba Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousherbaessentia", 1),

        // Hexachlorodisilane
        FluidRegistry.getFluidStack("hexachlorodisilane", 1),

        // Hexafluorosilicic Acid
        FluidRegistry.getFluidStack("hexafluorosilicic acid", 1),

        // High Octane Gasoline
        FluidRegistry.getFluidStack("highoctanegasoline", 1),

        // Hollow Tears
        FluidRegistry.getFluidStack("witchery:hollowtears", 1),

        // Holmium Chloride Concentrate
        FluidRegistry.getFluidStack("holmium chloride concentrate", 1),

        // Holmium Extracting Nano Resin
        FluidRegistry.getFluidStack("holmium extracting nano resin", 1),

        // Holmium Plasma
        FluidRegistry.getFluidStack("plasma.holmium", 1),

        // Holy Water
        FluidRegistry.getFluidStack("holywater", 1),

        // Honey
        FluidRegistry.getFluidStack("honey", 1),

        // Honey
        FluidRegistry.getFluidStack("for.honey", 1),

        // Hootch
        FluidRegistry.getFluidStack("hootch", 1),

        // Hops Juice
        FluidRegistry.getFluidStack("potion.hopsjuice", 1),

        // Hot Frying Oil
        FluidRegistry.getFluidStack("hotfryingoil", 1),

        // Hot Ruthenium Tetroxide Solution
        FluidRegistry.getFluidStack("hot ruthenium tetroxide solution", 1),

        // Hot Sauce
        FluidRegistry.getFluidStack("potion.hotsauce", 1),

        // Hot Super Coolant
        FluidRegistry.getFluidStack("hot super coolant", 1),

        // Humanus Super Critical Fluid
        FluidRegistry.getFluidStack("gaseoushumanusessentia", 1),

        // Hydrated Ammonium Nitrate Slurry
        FluidRegistry.getFluidStack("fluid.ammoniumnitrateslurry", 1),

        // Hydrazine
        FluidRegistry.getFluidStack("fluid.hydrazine", 1),

        // Hydrochloric Acid
        FluidRegistry.getFluidStack("hydrochloricacid_gt5u", 1),

        // Hydrofluoric Acid
        FluidRegistry.getFluidStack("hydrofluoricacid_gt5u", 1),

        // Hydrogen
        FluidRegistry.getFluidStack("hydrogen", 1),

        // Hydrogen Chloride Mix
        FluidRegistry.getFluidStack("molten.hydrogenchloridemix", 1),

        // Hydrogen Cyanide
        FluidRegistry.getFluidStack("hydrogencyanide", 1),

        // Hydrogen Peroxide
        FluidRegistry.getFluidStack("fluid.hydrogenperoxide", 1),

        // Hydrogen Plasma
        FluidRegistry.getFluidStack("plasma.hydrogen", 1),

        // Hydrogen Sulfide
        FluidRegistry.getFluidStack("liquid_hydricsulfur", 1),

        // Hydroxide
        FluidRegistry.getFluidStack("molten.hydroxide", 1),

        // Hypochlorous Acid
        FluidRegistry.getFluidStack("hypochlorousacid", 1),

        // Hypogen Plasma
        FluidRegistry.getFluidStack("plasma.hypogen", 1),

        // IC2 Coolant
        FluidRegistry.getFluidStack("ic2coolant", 1),

        // IC2 Hot Coolant
        FluidRegistry.getFluidStack("ic2hotcoolant", 1),

        // Ice Tea
        FluidRegistry.getFluidStack("potion.icetea", 1),

        // Ichorium Plasma
        FluidRegistry.getFluidStack("plasma.ichorium", 1),

        // Idun's Apple Juice
        FluidRegistry.getFluidStack("potion.idunsapplejuice", 1),

        // Ignis Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousignisessentia", 1),

        // Impure Ferrocene Mixture
        FluidRegistry.getFluidStack("impure ferrocene mixture", 1),

        // Impure Molten Salt Base
        FluidRegistry.getFluidStack("fluid.impurelifbef2", 1),

        // Indigo Dye
        FluidRegistry.getFluidStack("indigo", 1),

        // Indium Concentrate
        FluidRegistry.getFluidStack("indiumconcentrate", 1),

        // Indium Plasma
        FluidRegistry.getFluidStack("plasma.indium", 1),

        // Industrial Strength Hydrofluoric Acid
        FluidRegistry.getFluidStack("hydrofluoricacid", 1),

        // Industrial Strength Hydrogen Chloride
        FluidRegistry.getFluidStack("hydrogenchloride", 1),

        // Infernus Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousinfernusessentia", 1),

        // Infinity Plasma
        FluidRegistry.getFluidStack("plasma.infinity", 1),

        // Instrumentum Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousinstrumentumessentia", 1),

        // Invidia Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousinvidiaessentia", 1),

        // Invisible Brew
        FluidRegistry.getFluidStack("potion.invisibility", 1),

        // Iodine
        FluidRegistry.getFluidStack("iodine", 1),

        // Iodine Plasma
        FluidRegistry.getFluidStack("plasma.iodine", 1),

        // Ira Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousiraessentia", 1),

        // Iridium Plasma
        FluidRegistry.getFluidStack("plasma.iridium", 1),

        // Iron II Chloride
        FluidRegistry.getFluidStack("iron ii chloride", 1),

        // Iron III Chloride
        FluidRegistry.getFluidStack("ironiiichloride", 1),

        // Iron Plasma
        FluidRegistry.getFluidStack("plasma.iron", 1),

        // Isobutyraldehyde
        FluidRegistry.getFluidStack("isobutyraldehyde", 1),

        // Isoprene
        FluidRegistry.getFluidStack("isoprene", 1),

        // Isopropylbenzene
        FluidRegistry.getFluidStack("isopropylbenzene", 1),

        // Iter Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousiteressentia", 1),

        // Jet Fuel A
        FluidRegistry.getFluidStack("jet fuel a", 1),

        // Jet Fuel No.3
        FluidRegistry.getFluidStack("jet fuel no.3", 1),

        // Kerogen
        FluidRegistry.getFluidStack("kerogen", 1),

        // Kerosene
        FluidRegistry.getFluidStack("fluid.kerosene", 1),

        // Korn
        FluidRegistry.getFluidStack("potion.korn", 1),

        // Krypton
        FluidRegistry.getFluidStack("krypton", 1),

        // Krypton Plasma
        FluidRegistry.getFluidStack("plasma.krypton", 1),

        // LFTR Fuel 1
        FluidRegistry.getFluidStack("molten.lftrfuel1", 1),

        // LFTR Fuel 2
        FluidRegistry.getFluidStack("molten.lftrfuel2", 1),

        // LFTR Fuel 3
        FluidRegistry.getFluidStack("molten.lftrfuel3", 1),

        // LFTR Fuel Base
        FluidRegistry.getFluidStack("molten.lftrfuelbase", 1),

        // LPG
        FluidRegistry.getFluidStack("liquid_lpg", 1),

        // Lame Brew
        FluidRegistry.getFluidStack("potion.slowness", 1),

        // NEI Page 6/18
        // Lanthanum Chloride Concentrate
        FluidRegistry.getFluidStack("lanthanum chloride concentrate", 1),

        // Lanthanum Extracting Nano Resin
        FluidRegistry.getFluidStack("lanthanum extracting nano resin", 1),

        // Lanthanum Plasma
        FluidRegistry.getFluidStack("plasma.lanthanum", 1),

        // Latte
        FluidRegistry.getFluidStack("potion.latte", 1),

        // Lead Plasma
        FluidRegistry.getFluidStack("plasma.lead", 1),

        // Lead-Zinc Solution
        FluidRegistry.getFluidStack("leadzincsolution", 1),

        // Lemon Juice
        FluidRegistry.getFluidStack("potion.lemonjuice", 1),

        // Lemonade
        FluidRegistry.getFluidStack("potion.lemonade", 1),

        // Leninade
        FluidRegistry.getFluidStack("potion.leninade", 1),

        // Light Fuel
        FluidRegistry.getFluidStack("liquid_light_fuel", 1),

        // Light Naquadah Fuel
        FluidRegistry.getFluidStack("light naquadah fuel", 1),

        // Light Oil
        FluidRegistry.getFluidStack("liquid_light_oil", 1),

        // Light Radox
        FluidRegistry.getFluidStack("lightradox", 1),

        // Lightly Cracked Heavy Naquadah Fuel
        FluidRegistry.getFluidStack("lightlycrackedheavynaquadahfuel", 1),

        // Lightly Cracked Light Naquadah Fuel
        FluidRegistry.getFluidStack("lightlycrackedlightnaquadahfuel", 1),

        // Lightly Cracked Naquadah Asphalt
        FluidRegistry.getFluidStack("lightlycrackednaquadahasphalt", 1),

        // Lightly Cracked Naquadah Gas
        FluidRegistry.getFluidStack("lightlycrackednaquadahgas", 1),

        // Lightly Hydro-Cracked Butadiene
        FluidRegistry.getFluidStack("lightlyhydrocracked.butadiene", 1),

        // Lightly Hydro-Cracked Butane
        FluidRegistry.getFluidStack("lightlyhydrocracked.butane", 1),

        // Lightly Hydro-Cracked Butene
        FluidRegistry.getFluidStack("lightlyhydrocracked.butene", 1),

        // Lightly Hydro-Cracked Ethane
        FluidRegistry.getFluidStack("lightlyhydrocracked.ethane", 1),

        // Lightly Hydro-Cracked Ethylene
        FluidRegistry.getFluidStack("lightlyhydrocracked.ethylene", 1),

        // Lightly Hydro-Cracked Heavy Fuel
        FluidRegistry.getFluidStack("lightlyhydrocracked.heavyfuel", 1),

        // Lightly Hydro-Cracked Light Fuel
        FluidRegistry.getFluidStack("lightlyhydrocracked.lightfuel", 1),

        // Lightly Hydro-Cracked Naphtha
        FluidRegistry.getFluidStack("lightlyhydrocracked.naphtha", 1),

        // Lightly Hydro-Cracked Propane
        FluidRegistry.getFluidStack("lightlyhydrocracked.propane", 1),

        // Lightly Hydro-Cracked Propene
        FluidRegistry.getFluidStack("lightlyhydrocracked.propene", 1),

        // Lightly Hydro-Cracked Refinery Gas
        FluidRegistry.getFluidStack("lightlyhydrocracked.gas", 1),

        // Lightly Steam-Cracked Butadiene
        FluidRegistry.getFluidStack("lightlysteamcracked.butadiene", 1),

        // Lightly Steam-Cracked Butane
        FluidRegistry.getFluidStack("lightlysteamcracked.butane", 1),

        // Lightly Steam-Cracked Butene
        FluidRegistry.getFluidStack("lightlysteamcracked.butene", 1),

        // Lightly Steam-Cracked Ethane
        FluidRegistry.getFluidStack("lightlysteamcracked.ethane", 1),

        // Lightly Steam-Cracked Ethylene
        FluidRegistry.getFluidStack("lightlysteamcracked.ethylene", 1),

        // Lightly Steam-Cracked Heavy Fuel
        FluidRegistry.getFluidStack("lightlysteamcracked.heavyfuel", 1),

        // Lightly Steam-Cracked Light Fuel
        FluidRegistry.getFluidStack("lightlysteamcracked.lightfuel", 1),

        // Lightly Steam-Cracked Naphtha
        FluidRegistry.getFluidStack("lightlysteamcracked.naphtha", 1),

        // Lightly Steam-Cracked Propane
        FluidRegistry.getFluidStack("lightlysteamcracked.propane", 1),

        // Lightly Steam-Cracked Propene
        FluidRegistry.getFluidStack("lightlysteamcracked.propene", 1),

        // Lightly Steam-Cracked Refinery Gas
        FluidRegistry.getFluidStack("lightlysteamcracked.gas", 1),

        // Limoncello
        FluidRegistry.getFluidStack("potion.limoncello", 1),

        // Limus Super Critical Fluid
        FluidRegistry.getFluidStack("gaseouslimusessentia", 1),

        // Liquid Air
        FluidRegistry.getFluidStack("liquidair", 1),

        // Liquid Argon
        FluidRegistry.getFluidStack("liquidargon", 1),

        // Liquid Blueslime
        FluidRegistry.getFluidStack("slime.blue", 1),

        // Liquid Crystal Kevlar
        FluidRegistry.getFluidStack("liquidcrystalkevlar", 1),

        // Liquid DNA
        FluidRegistry.getFluidStack("liquiddna", 1),

        // Liquid DNA
        FluidRegistry.getFluidStack("binnie.dna.raw", 1),

        // Liquid Death
        FluidRegistry.getFluidStack("fluiddeath", 1),

        // Liquid Ender
        FluidRegistry.getFluidStack("ender", 1),

        // Liquid Glass
        FluidRegistry.getFluidStack("glass", 1),

        // Liquid Helium
        FluidRegistry.getFluidStack("liquid helium", 1),

        // Liquid Hydrogen
        FluidRegistry.getFluidStack("fluid.liquidhydrogen", 1),

        // Liquid Methane
        FluidRegistry.getFluidStack("liquidmethane", 1),

        // Liquid Nitrogen
        FluidRegistry.getFluidStack("liquidnitrogen", 1),

        // Liquid Oxygen
        FluidRegistry.getFluidStack("liquidoxygen", 1),

        // Liquid Primordial Matter
        FluidRegistry.getFluidStack("primordialmatter", 1),

        // Liquid Resin
        FluidRegistry.getFluidStack("liquidresin", 1),

        // Liquid Sodium
        FluidRegistry.getFluidStack("liquid_sodium", 1),

        // Liquid Sunshine
        FluidRegistry.getFluidStack("liquid_sunshine", 1),

        // Liquid XP
        FluidRegistry.getFluidStack("xpjuice", 1),

        // Liquified Emerald
        FluidRegistry.getFluidStack("emerald.liquid", 1),

        // Lithium Fluoride
        FluidRegistry.getFluidStack("molten.lithiumfluoride", 1),

        // Lithium Hydroxide
        FluidRegistry.getFluidStack("lithiumhydroxide", 1),

        // Lithium Peroxide
        FluidRegistry.getFluidStack("fluid.lithiumperoxide", 1),

        // Lithium Plasma
        FluidRegistry.getFluidStack("plasma.lithium", 1),

        // Lithium Tetrafluoroberyllate (LFTB)
        FluidRegistry.getFluidStack("molten.lithiumtetrafluoroberyllatelftb", 1),

        // Lossless Phonon Transfer Medium
        FluidRegistry.getFluidStack("phononmedium", 1),

        // Low Quality Naquadah Emulsion
        FluidRegistry.getFluidStack("low quality naquadah emulsion", 1),

        // Low Quality Naquadah Solution
        FluidRegistry.getFluidStack("low quality naquadah solution", 1),

        // Low Quality Naquadria Sulphate
        FluidRegistry.getFluidStack("low quality naquadria sulphate", 1),

        // Lubricant
        FluidRegistry.getFluidStack("lubricant", 1),

        // Lucrum Super Critical Fluid
        FluidRegistry.getFluidStack("gaseouslucrumessentia", 1),

        // Lutetium Chloride Concentrate
        FluidRegistry.getFluidStack("lutetium chloride concentrate", 1),

        // Lutetium Extracting Nano Resin
        FluidRegistry.getFluidStack("lutetium extracting nano resin", 1),

        // Lutetium Plasma
        FluidRegistry.getFluidStack("plasma.lutetium", 1),

        // Lux Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousluxessentia", 1),

        // Luxuria Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousluxuriaessentia", 1),

        // MTBE Reaction Mixture (Butane)
        FluidRegistry.getFluidStack("mtbereactionmixture(butane)", 1),

        // MTBE Reaction Mixture (Butene)
        FluidRegistry.getFluidStack("mtbereactionmixture(butene)", 1),

        // Machina Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousmachinaessentia", 1),

        // Magic Plasma
        FluidRegistry.getFluidStack("plasma.magic", 1),

        // Magnesium Plasma
        FluidRegistry.getFluidStack("plasma.magnesium", 1),

        // Magneto Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousmagnetoessentia", 1),

        // Manganese Plasma
        FluidRegistry.getFluidStack("plasma.manganese", 1),

        // Manure Slurry
        FluidRegistry.getFluidStack("fluid.manure.slurry", 1),

        // Mash
        FluidRegistry.getFluidStack("potion.mash", 1),

        // Mc Guffium 239
        FluidRegistry.getFluidStack("mcguffium", 1),

        // Mead
        FluidRegistry.getFluidStack("mead", 1),

        // Meat Extract
        FluidRegistry.getFluidStack("meatextract", 1),

        // Melon Juice
        FluidRegistry.getFluidStack("melonjuice", 1),

        // NEI Page 7/18
        // Mercury
        FluidRegistry.getFluidStack("mercury", 1),

        // Mercury Plasma
        FluidRegistry.getFluidStack("plasma.mercury", 1),

        // Messis Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousmessisessentia", 1),

        // Metallum Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousmetallumessentia", 1),

        // Meteoric Iron Plasma
        FluidRegistry.getFluidStack("plasma.meteoriciron", 1),

        // Methane
        FluidRegistry.getFluidStack("methane", 1),

        // Methanol
        FluidRegistry.getFluidStack("methanol", 1),

        // Methyl Acetate
        FluidRegistry.getFluidStack("methylacetate", 1),

        // Methylamine
        FluidRegistry.getFluidStack("methylamine", 1),

        // Meto Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousmetoessentia", 1),

        // Milk
        FluidRegistry.getFluidStack("milk", 1),

        // Milk
        FluidRegistry.getFluidStack("fluidmilk", 1),

        // Mineral Water
        FluidRegistry.getFluidStack("potion.mineralwater", 1),

        // Mob Essence
        FluidRegistry.getFluidStack("mobessence", 1),

        // Moderately Cracked Heavy Naquadah Fuel
        FluidRegistry.getFluidStack("moderatelycrackedheavynaquadahfuel", 1),

        // Moderately Cracked Light Naquadah Fuel
        FluidRegistry.getFluidStack("moderatelycrackedlightnaquadahfuel", 1),

        // Moderately Cracked Naquadah Asphalt
        FluidRegistry.getFluidStack("moderatelycrackednaquadahasphalt", 1),

        // Moderately Cracked Naquadah Gas
        FluidRegistry.getFluidStack("moderatelycrackednaquadahgas", 1),

        // Moderately Hydro-Cracked Butadiene
        FluidRegistry.getFluidStack("moderatelyhydrocracked.butadiene", 1),

        // Moderately Hydro-Cracked Butane
        FluidRegistry.getFluidStack("moderatelyhydrocracked.butane", 1),

        // Moderately Hydro-Cracked Butene
        FluidRegistry.getFluidStack("moderatelyhydrocracked.butene", 1),

        // Moderately Hydro-Cracked Ethane
        FluidRegistry.getFluidStack("moderatelyhydrocracked.ethane", 1),

        // Moderately Hydro-Cracked Ethylene
        FluidRegistry.getFluidStack("moderatelyhydrocracked.ethylene", 1),

        // Moderately Hydro-Cracked Heavy Fuel
        FluidRegistry.getFluidStack("moderatelyhydrocracked.heavyfuel", 1),

        // Moderately Hydro-Cracked Light Fuel
        FluidRegistry.getFluidStack("moderatelyhydrocracked.lightfuel", 1),

        // Moderately Hydro-Cracked Naphtha
        FluidRegistry.getFluidStack("moderatelyhydrocracked.naphtha", 1),

        // Moderately Hydro-Cracked Propane
        FluidRegistry.getFluidStack("moderatelyhydrocracked.propane", 1),

        // Moderately Hydro-Cracked Propene
        FluidRegistry.getFluidStack("moderatelyhydrocracked.propene", 1),

        // Moderately Hydro-Cracked Refinery Gas
        FluidRegistry.getFluidStack("moderatelyhydrocracked.gas", 1),

        // Moderately Steam-Cracked Butadiene
        FluidRegistry.getFluidStack("moderatelysteamcracked.butadiene", 1),

        // Moderately Steam-Cracked Butane
        FluidRegistry.getFluidStack("moderatelysteamcracked.butane", 1),

        // Moderately Steam-Cracked Butene
        FluidRegistry.getFluidStack("moderatelysteamcracked.butene", 1),

        // Moderately Steam-Cracked Ethane
        FluidRegistry.getFluidStack("moderatelysteamcracked.ethane", 1),

        // Moderately Steam-Cracked Ethylene
        FluidRegistry.getFluidStack("moderatelysteamcracked.ethylene", 1),

        // Moderately Steam-Cracked Heavy Fuel
        FluidRegistry.getFluidStack("moderatelysteamcracked.heavyfuel", 1),

        // Moderately Steam-Cracked Light Fuel
        FluidRegistry.getFluidStack("moderatelysteamcracked.lightfuel", 1),

        // Moderately Steam-Cracked Naphtha
        FluidRegistry.getFluidStack("moderatelysteamcracked.naphtha", 1),

        // Moderately Steam-Cracked Propane
        FluidRegistry.getFluidStack("moderatelysteamcracked.propane", 1),

        // Moderately Steam-Cracked Propene
        FluidRegistry.getFluidStack("moderatelysteamcracked.propene", 1),

        // Moderately Steam-Cracked Refinery Gas
        FluidRegistry.getFluidStack("moderatelysteamcracked.gas", 1),

        // Molten Abyssal Alloy
        FluidRegistry.getFluidStack("molten.abyssalalloy", 1),

        // Molten Adamantium
        FluidRegistry.getFluidStack("molten.adamantium", 1),

        // Molten Adamantium Alloy
        FluidRegistry.getFluidStack("molten.adamantium alloy", 1),

        // Molten Ademic Steel
        FluidRegistry.getFluidStack("molten.ademic steel", 1),

        // Molten Adluorite
        FluidRegistry.getFluidStack("molten.adluorite", 1),

        // Molten Advanced Nitinol
        FluidRegistry.getFluidStack("molten.advancednitinol", 1),

        // Molten Aeon Steel
        FluidRegistry.getFluidStack("moltenaeonsteel", 1),

        // Molten Alduorite
        FluidRegistry.getFluidStack("molten.alduorite", 1),

        // Molten Aluminium
        FluidRegistry.getFluidStack("molten.aluminium", 1),

        // Molten Aluminium Brass
        FluidRegistry.getFluidStack("molten.aluminiumbrass", 1),

        // Molten Aluminum
        FluidRegistry.getFluidStack("aluminum.molten", 1),

        // Molten Aluminum Brass
        FluidRegistry.getFluidStack("aluminumbrass.molten", 1),

        // Molten Americium
        FluidRegistry.getFluidStack("molten.americium", 1),

        // Molten Amordrine
        FluidRegistry.getFluidStack("molten.amordrine", 1),

        // Molten Ancient Granite
        FluidRegistry.getFluidStack("molten.ancientgranite", 1),

        // Molten Angmallen
        FluidRegistry.getFluidStack("molten.angmallen", 1),

        // Molten Annealed Copper
        FluidRegistry.getFluidStack("molten.annealedcopper", 1),

        // Molten Antimony
        FluidRegistry.getFluidStack("molten.antimony", 1),

        // Molten Arcanite
        FluidRegistry.getFluidStack("molten.arcanite", 1),

        // Molten Arceus Alloy 2B
        FluidRegistry.getFluidStack("molten.arceusalloy2b", 1),

        // Molten Ardite
        FluidRegistry.getFluidStack("ardite.molten", 1),

        // Molten Ardite
        FluidRegistry.getFluidStack("molten.ardite", 1),

        // Molten Aredrite
        FluidRegistry.getFluidStack("molten.aredrite", 1),

        // Molten Arsenic
        FluidRegistry.getFluidStack("molten.arsenic", 1),

        // Molten Artherium-Sn
        FluidRegistry.getFluidStack("molten.artherium-sn", 1),

        // Molten Astral Silver
        FluidRegistry.getFluidStack("molten.astralsilver", 1),

        // Molten Astral Titanium
        FluidRegistry.getFluidStack("molten.astraltitanium", 1),

        // Molten Atlarus
        FluidRegistry.getFluidStack("molten.atlarus", 1),

        // Molten Atomic Separation Catalyst
        FluidRegistry.getFluidStack("molten.atomic separation catalyst", 1),

        // Molten Attuned Tengam
        FluidRegistry.getFluidStack("molten.tengamattuned", 1),

        // Molten Awakened Draconium
        FluidRegistry.getFluidStack("molten.draconiumawakened", 1),

        // Molten BArTiMaEuSNeK
        FluidRegistry.getFluidStack("molten.bartimaeusnek", 1),

        // Molten Babbit Alloy
        FluidRegistry.getFluidStack("molten.babbitalloy", 1),

        // Molten Barium
        FluidRegistry.getFluidStack("molten.barium", 1),

        // Molten Battery Alloy
        FluidRegistry.getFluidStack("molten.batteryalloy", 1),

        // Molten Bedrockium
        FluidRegistry.getFluidStack("molten.bedrockium", 1),

        // Molten Bedrockium Ingots
        FluidRegistry.getFluidStack("molten.bedrockiumingots", 1),

        // Molten Beryllium
        FluidRegistry.getFluidStack("molten.beryllium", 1),

        // Molten Bismuth
        FluidRegistry.getFluidStack("molten.bismuth", 1),

        // Molten Bismuth Bronze
        FluidRegistry.getFluidStack("molten.bismuthbronze", 1),

        // Molten Bisphenol A
        FluidRegistry.getFluidStack("molten.bisphenol_a", 1),

        // Molten Black Bronze
        FluidRegistry.getFluidStack("molten.blackbronze", 1),

        // Molten Black Dwarf Matter
        FluidRegistry.getFluidStack("molten.blackdwarfmatter", 1),

        // Molten Black Granite
        FluidRegistry.getFluidStack("molten.graniteblack", 1),

        // Molten Black Metal
        FluidRegistry.getFluidStack("molten.blackmetal", 1),

        // Molten Black Plutonium
        FluidRegistry.getFluidStack("molten.blackplutonium", 1),

        // Molten Black Steel
        FluidRegistry.getFluidStack("molten.blacksteel", 1),

        // Molten Black Titanium
        FluidRegistry.getFluidStack("molten.blacktitanium", 1),

        // Molten Blaze
        FluidRegistry.getFluidStack("molten.blaze", 1),

        // Molten Blood Infused Iron
        FluidRegistry.getFluidStack("molten.blood_infused_iron", 1),

        // NEI Page 8/18
        // Molten Blood Infused Iron
        FluidRegistry.getFluidStack("molten.bloodinfusediron", 1),

        // Molten Blood Steel
        FluidRegistry.getFluidStack("molten.bloodsteel", 1),

        // Molten Blue Alloy
        FluidRegistry.getFluidStack("molten.bluealloy", 1),

        // Molten Blue Steel
        FluidRegistry.getFluidStack("molten.bluesteel", 1),

        // Molten Blutonium
        FluidRegistry.getFluidStack("molten.blutonium", 1),

        // Molten Boron
        FluidRegistry.getFluidStack("molten.boron", 1),

        // Molten Borosilicate Glass
        FluidRegistry.getFluidStack("molten.borosilicateglass", 1),

        // Molten Botmium
        FluidRegistry.getFluidStack("molten.botmium", 1),

        // Molten Brass
        FluidRegistry.getFluidStack("molten.brass", 1),

        // Molten Bronze
        FluidRegistry.getFluidStack("bronze.molten", 1),

        // Molten Bronze
        FluidRegistry.getFluidStack("molten.bronze", 1),

        // Molten Caesium
        FluidRegistry.getFluidStack("molten.caesium", 1),

        // Molten Calcium
        FluidRegistry.getFluidStack("molten.calcium", 1),

        // Molten Californium
        FluidRegistry.getFluidStack("molten.californium", 1),

        // Molten Callisto Ice
        FluidRegistry.getFluidStack("molten.callistoice", 1),

        // Molten Carmot
        FluidRegistry.getFluidStack("molten.carmot", 1),

        // Molten Celenegil
        FluidRegistry.getFluidStack("molten.celenegil", 1),

        // Molten Celestial Tungsten
        FluidRegistry.getFluidStack("molten.celestialtungsten", 1),

        // Molten Cerium
        FluidRegistry.getFluidStack("molten.cerium", 1),

        // Molten Cerium-doped Lutetium Aluminium Oxygen Blend
        FluidRegistry.getFluidStack("molten.cerium-doped lutetium aluminium oxygen blend", 1),

        // Molten Ceruclase
        FluidRegistry.getFluidStack("molten.ceruclase", 1),

        // Molten Cheese
        FluidRegistry.getFluidStack("molten.cheese", 1),

        // Molten Chromatic Glass
        FluidRegistry.getFluidStack("molten.chromaticglass", 1),

        // Molten Chrome
        FluidRegistry.getFluidStack("molten.chrome", 1),

        // Molten Chromium Dioxide
        FluidRegistry.getFluidStack("molten.chromiumdioxide", 1),

        // Molten Chrysotile
        FluidRegistry.getFluidStack("molten.chrysotile", 1),

        // Molten Cinobite A243
        FluidRegistry.getFluidStack("molten.cinobitea243", 1),

        // Molten Clay Compound
        FluidRegistry.getFluidStack("molten.crudesteel", 1),

        // Molten Cobalt
        FluidRegistry.getFluidStack("molten.cobalt", 1),

        // Molten Cobalt
        FluidRegistry.getFluidStack("cobalt.molten", 1),

        // Molten Cobalt Brass
        FluidRegistry.getFluidStack("molten.cobaltbrass", 1),

        // Molten Conductive Iron
        FluidRegistry.getFluidStack("molten.conductiveiron", 1),

        // Molten Copper
        FluidRegistry.getFluidStack("molten.copper", 1),

        // Molten Copper
        FluidRegistry.getFluidStack("copper.molten", 1),

        // Molten Copper(II) Sulfate
        FluidRegistry.getFluidStack("molten.copperiisulfate", 1),

        // Molten Copper(II) Sulfate Pentahydrate
        FluidRegistry.getFluidStack("molten.copperiisulfatepentahydrate", 1),

        // Molten Cosmic Neutronium
        FluidRegistry.getFluidStack("molten.cosmicneutronium", 1),

        // Molten Creon
        FluidRegistry.getFluidStack("molten.creon", 1),

        // Molten Crystalline Alloy
        FluidRegistry.getFluidStack("molten.crystallinealloy", 1),

        // Molten Crystalline Pink Slime
        FluidRegistry.getFluidStack("molten.crystallinepinkslime", 1),

        // Molten Cupronickel
        FluidRegistry.getFluidStack("molten.cupronickel", 1),

        // Molten Curium
        FluidRegistry.getFluidStack("molten.curium", 1),

        // Molten Cyanoacetic Acid
        FluidRegistry.getFluidStack("molten.cyanoaceticacid", 1),

        // Molten Dalisenite
        FluidRegistry.getFluidStack("molten.dalisenite", 1),

        // Molten Damascus Steel
        FluidRegistry.getFluidStack("molten.damascussteel", 1),

        // Molten Dark Steel
        FluidRegistry.getFluidStack("molten.darksteel", 1),

        // Molten Dark Thaumium
        FluidRegistry.getFluidStack("molten.darkthaumium", 1),

        // Molten Deep Dark Iron
        FluidRegistry.getFluidStack("molten.darkiron", 1),

        // Molten Deep Iron
        FluidRegistry.getFluidStack("molten.deepiron", 1),

        // Molten Desh
        FluidRegistry.getFluidStack("molten.desh", 1),

        // Molten Desichalkos
        FluidRegistry.getFluidStack("molten.desichalkos", 1),

        // Molten Diamond Copper
        FluidRegistry.getFluidStack("molten.diamondcopper", 1),

        // Molten Dogbearium
        FluidRegistry.getFluidStack("moltendogbearium", 1),

        // Molten Draconium
        FluidRegistry.getFluidStack("molten.draconium", 1),

        // Molten Dragonblood
        FluidRegistry.getFluidStack("molten.dragonblood", 1),

        // Molten Duralumin
        FluidRegistry.getFluidStack("molten.duralumin", 1),

        // Molten Duranium
        FluidRegistry.getFluidStack("molten.duranium", 1),

        // Molten Dysprosium
        FluidRegistry.getFluidStack("molten.dysprosium", 1),

        // Molten Eglin Steel
        FluidRegistry.getFluidStack("molten.eglinsteel", 1),

        // Molten Eglin Steel Base Compound
        FluidRegistry.getFluidStack("molten.eglinsteelbasecompound", 1),

        // Molten Electrical Steel
        FluidRegistry.getFluidStack("molten.electricalsteel", 1),

        // Molten Electrotine
        FluidRegistry.getFluidStack("molten.electrotine", 1),

        // Molten Electrum
        FluidRegistry.getFluidStack("molten.electrum", 1),

        // Molten Electrum
        FluidRegistry.getFluidStack("electrum.molten", 1),

        // Molten Elven Elementium
        FluidRegistry.getFluidStack("molten.elvenelementium", 1),

        // Molten End Steel
        FluidRegistry.getFluidStack("molten.endsteel", 1),

        // Molten Enderium
        FluidRegistry.getFluidStack("molten.enderium", 1),

        // Molten Enderium
        FluidRegistry.getFluidStack("enderium.molten", 1),

        // Molten Enderium Base
        FluidRegistry.getFluidStack("molten.enderiumbase", 1),

        // Molten Endium
        FluidRegistry.getFluidStack("molten.heeendium", 1),

        // Molten Energetic Alloy
        FluidRegistry.getFluidStack("molten.energeticalloy", 1),

        // Molten Energetic Silver
        FluidRegistry.getFluidStack("molten.energeticsilver", 1),

        // Molten Energy Crystal
        FluidRegistry.getFluidStack("molten.energycrystal", 1),

        // Molten Enhanced Galgadorian
        FluidRegistry.getFluidStack("molten.enhancedgalgadorian", 1),

        // Molten Enriched Copper
        FluidRegistry.getFluidStack("molten.enrichedcopper", 1),

        // Molten Enriched Holmium
        FluidRegistry.getFluidStack("molten.enrichedholmium", 1),

        // Molten Enriched Naquadah
        FluidRegistry.getFluidStack("molten.naquadahenriched", 1),

        // Molten Enriched Naquadah Alloy
        FluidRegistry.getFluidStack("molten.enriched naquadah alloy", 1),

        // Molten Epoxid
        FluidRegistry.getFluidStack("molten.epoxid", 1),

        // Molten Erbium
        FluidRegistry.getFluidStack("molten.erbium", 1),

        // Molten Eternity
        FluidRegistry.getFluidStack("molten.eternity", 1),

        // Molten Europium
        FluidRegistry.getFluidStack("molten.europium", 1),

        // Molten Eximite
        FluidRegistry.getFluidStack("molten.eximite", 1),

        // Molten Exo-Halkonite Steel Preparation Base
        FluidRegistry.getFluidStack("moltenexohalkonitebase", 1),

        // Molten Extremely Unstable Naquadah
        FluidRegistry.getFluidStack("molten.extremely unstable naquadah", 1),

        // Molten Fairy
        FluidRegistry.getFluidStack("molten.fairy", 1),

        // Molten Fiber-Reinforced Epoxy Resin
        FluidRegistry.getFluidStack("molten.epoxidfiberreinforced", 1),

        // Molten Fiery Steel
        FluidRegistry.getFluidStack("molten.fierysteel", 1),

        // Molten Flerovium
        FluidRegistry.getFluidStack("molten.flerovium_gt5u", 1),

        // Molten Fluxed Electrum
        FluidRegistry.getFluidStack("molten.electrumflux", 1),

        // NEI Page 9/18
        // Molten Fluxed Obsidian
        FluidRegistry.getFluidStack("molten.obsidianflux", 1),

        // Molten Force
        FluidRegistry.getFluidStack("molten.force", 1),

        // Molten Gadolinium
        FluidRegistry.getFluidStack("molten.gadolinium", 1),

        // Molten Gaia Spirit
        FluidRegistry.getFluidStack("molten.gaiaspirit", 1),

        // Molten Galgadorian
        FluidRegistry.getFluidStack("molten.galgadorian", 1),

        // Molten Gallium
        FluidRegistry.getFluidStack("molten.gallium", 1),

        // Molten Gallium Arsenide
        FluidRegistry.getFluidStack("molten.galliumarsenide", 1),

        // Molten Germanium
        FluidRegistry.getFluidStack("molten.germanium", 1),

        // Molten Glass
        FluidRegistry.getFluidStack("glass.molten", 1),

        // Molten Glass
        FluidRegistry.getFluidStack("molten.glass", 1),

        // Molten Glowstone
        FluidRegistry.getFluidStack("molten.glowstone", 1),

        // Molten Gold
        FluidRegistry.getFluidStack("molten.gold", 1),

        // Molten Gold
        FluidRegistry.getFluidStack("gold.molten", 1),

        // Molten Grisium
        FluidRegistry.getFluidStack("molten.grisium", 1),

        // Molten HS188-A
        FluidRegistry.getFluidStack("molten.hs188a", 1),

        // Molten HSLA Steel
        FluidRegistry.getFluidStack("molten.hsla", 1),

        // Molten HSS-E
        FluidRegistry.getFluidStack("molten.hsse", 1),

        // Molten HSS-G
        FluidRegistry.getFluidStack("molten.hssg", 1),

        // Molten HSS-S
        FluidRegistry.getFluidStack("molten.hsss", 1),

        // Molten Haderoth
        FluidRegistry.getFluidStack("molten.haderoth", 1),

        // Molten Hafnium
        FluidRegistry.getFluidStack("molten.hafnium", 1),

        // Molten Hastelloy-C276
        FluidRegistry.getFluidStack("molten.hastelloyc276", 1),

        // Molten Hastelloy-N
        FluidRegistry.getFluidStack("molten.hastelloyn", 1),

        // Molten Hastelloy-W
        FluidRegistry.getFluidStack("molten.hastelloyw", 1),

        // Molten Hastelloy-X
        FluidRegistry.getFluidStack("molten.hastelloyx", 1),

        // Molten HeLiCoPtEr
        FluidRegistry.getFluidStack("molten.helicopter", 1),

        // Molten Hellish Metal
        FluidRegistry.getFluidStack("molten.hellishmetal", 1),

        // Molten Hematite
        FluidRegistry.getFluidStack("molten.hematite", 1),

        // Molten Hepatizon
        FluidRegistry.getFluidStack("molten.hepatizon", 1),

        // Molten High Durability Compound Steel
        FluidRegistry.getFluidStack("molten.high durability compound steel", 1),

        // Molten Hikarium
        FluidRegistry.getFluidStack("molten.hikarium", 1),

        // Molten Holmium
        FluidRegistry.getFluidStack("molten.holmium", 1),

        // Molten Hypogen
        FluidRegistry.getFluidStack("molten.hypogen", 1),

        // Molten Ichorium
        FluidRegistry.getFluidStack("molten.ichorium", 1),

        // Molten Ignatius
        FluidRegistry.getFluidStack("molten.ignatius", 1),

        // Molten Incoloy-020
        FluidRegistry.getFluidStack("molten.incoloy020", 1),

        // Molten Incoloy-903
        FluidRegistry.getFluidStack("molten.incoloy-903", 1),

        // Molten Incoloy-DS
        FluidRegistry.getFluidStack("molten.incoloyds", 1),

        // Molten Incoloy-MA956
        FluidRegistry.getFluidStack("molten.incoloyma956", 1),

        // Molten Inconel-625
        FluidRegistry.getFluidStack("molten.inconel625", 1),

        // Molten Inconel-690
        FluidRegistry.getFluidStack("molten.inconel690", 1),

        // Molten Inconel-792
        FluidRegistry.getFluidStack("molten.inconel792", 1),

        // Molten Indalloy 140
        FluidRegistry.getFluidStack("molten.indalloy140", 1),

        // Molten Indium
        FluidRegistry.getFluidStack("molten.indium", 1),

        // Molten Indium Gallium Phosphide
        FluidRegistry.getFluidStack("molten.indiumgalliumphosphide", 1),

        // Molten Infinity
        FluidRegistry.getFluidStack("molten.infinity", 1),

        // Molten Infinity Catalyst
        FluidRegistry.getFluidStack("molten.infinitycatalyst", 1),

        // Molten Infuscolium
        FluidRegistry.getFluidStack("molten.infuscolium", 1),

        // Molten Infused Gold
        FluidRegistry.getFluidStack("molten.infusedgold", 1),

        // Molten Inolashite
        FluidRegistry.getFluidStack("molten.inolashite", 1),

        // Molten Invar
        FluidRegistry.getFluidStack("molten.invar", 1),

        // Molten Invar
        FluidRegistry.getFluidStack("invar.molten", 1),

        // Molten Iodine
        FluidRegistry.getFluidStack("molten.iodine", 1),

        // Molten Iridium
        FluidRegistry.getFluidStack("molten.iridium", 1),

        // Molten Iron
        FluidRegistry.getFluidStack("iron.molten", 1),

        // Molten Iron
        FluidRegistry.getFluidStack("molten.iron", 1),

        // Molten Ironwood
        FluidRegistry.getFluidStack("molten.ironwood", 1),

        // Molten Kalendrite
        FluidRegistry.getFluidStack("molten.kalendrite", 1),

        // Molten Kanthal
        FluidRegistry.getFluidStack("molten.kanthal", 1),

        // Molten Kevlar
        FluidRegistry.getFluidStack("molten.kevlar", 1),

        // Molten Knightmetal
        FluidRegistry.getFluidStack("molten.knightmetal", 1),

        // Molten Koboldite
        FluidRegistry.getFluidStack("molten.koboldite", 1),

        // Molten Lafium Compound
        FluidRegistry.getFluidStack("molten.lafiumcompound", 1),

        // Molten Lanthanum
        FluidRegistry.getFluidStack("molten.lanthanum", 1),

        // Molten Laurenium
        FluidRegistry.getFluidStack("molten.laurenium", 1),

        // Molten Lead
        FluidRegistry.getFluidStack("lead.molten", 1),

        // Molten Lead
        FluidRegistry.getFluidStack("molten.lead", 1),

        // Molten Ledox
        FluidRegistry.getFluidStack("molten.ledox", 1),

        // Molten Lithium
        FluidRegistry.getFluidStack("molten.lithium", 1),

        // Molten Lithium 7
        FluidRegistry.getFluidStack("molten.lithium7", 1),

        // Molten Lithium Chloride
        FluidRegistry.getFluidStack("molten.lithium chloride", 1),

        // Molten Ludicrite
        FluidRegistry.getFluidStack("molten.ludicrite", 1),

        // Molten Lumiium
        FluidRegistry.getFluidStack("molten.lumiium", 1),

        // Molten Lumium
        FluidRegistry.getFluidStack("lumium.molten", 1),

        // Molten Lumium
        FluidRegistry.getFluidStack("molten.lumium", 1),

        // Molten Lutetium
        FluidRegistry.getFluidStack("molten.lutetium", 1),

        // Molten MAR-Ce-M200 Steel
        FluidRegistry.getFluidStack("molten.mar-ce-m200 steel", 1),

        // Molten MAR-M200 Steel
        FluidRegistry.getFluidStack("molten.mar-m200 steel", 1),

        // Molten Magic
        FluidRegistry.getFluidStack("molten.magic", 1),

        // Molten Magmatter
        FluidRegistry.getFluidStack("molten.magmatter", 1),

        // Molten Magnalium
        FluidRegistry.getFluidStack("molten.magnalium", 1),

        // Molten Magnesia
        FluidRegistry.getFluidStack("molten.magnesia", 1),

        // Molten Magnesium
        FluidRegistry.getFluidStack("molten.magnesium", 1),

        // Molten Magnetic Iron
        FluidRegistry.getFluidStack("molten.ironmagnetic", 1),

        // Molten Magnetic Neodymium
        FluidRegistry.getFluidStack("molten.neodymiummagnetic", 1),

        // Molten Magnetic Samarium
        FluidRegistry.getFluidStack("molten.samariummagnetic", 1),

        // Molten Magnetic Steel
        FluidRegistry.getFluidStack("molten.steelmagnetic", 1),

        // Molten Magnetohydrodynamically Constrained Star Matter
        FluidRegistry.getFluidStack("molten.magnetohydrodynamicallyconstrainedstarmatter", 1),

        // Molten Mana Infused Metal
        FluidRegistry.getFluidStack("mithril.molten", 1),

        // Molten Manasteel
        FluidRegistry.getFluidStack("molten.manasteel", 1),

        // NEI Page 10/18
        // Molten Manganese
        FluidRegistry.getFluidStack("molten.manganese", 1),

        // Molten Manyullyn
        FluidRegistry.getFluidStack("molten.manyullyn", 1),

        // Molten Manyullyn
        FluidRegistry.getFluidStack("manyullyn.molten", 1),

        // Molten Maraging Steel 250
        FluidRegistry.getFluidStack("molten.maragingsteel250", 1),

        // Molten Maraging Steel 300
        FluidRegistry.getFluidStack("molten.maragingsteel300", 1),

        // Molten Maraging Steel 350
        FluidRegistry.getFluidStack("molten.maragingsteel350", 1),

        // Molten Mellion
        FluidRegistry.getFluidStack("molten.mellion", 1),

        // Molten Melodic Alloy
        FluidRegistry.getFluidStack("molten.melodicalloy", 1),

        // Molten Mercassium
        FluidRegistry.getFluidStack("molten.mercassium", 1),

        // Molten Metastable Oganesson
        FluidRegistry.getFluidStack("molten.metastable oganesson", 1),

        // Molten Meteoric Iron
        FluidRegistry.getFluidStack("molten.meteoriciron", 1),

        // Molten Meteoric Steel
        FluidRegistry.getFluidStack("molten.meteoricsteel", 1),

        // Molten Mithril
        FluidRegistry.getFluidStack("molten.mithril", 1),

        // Molten Molybdenum
        FluidRegistry.getFluidStack("molten.molybdenum", 1),

        // Molten Mysterious Crystal
        FluidRegistry.getFluidStack("molten.mysteriouscrystal", 1),

        // Molten Mytryl
        FluidRegistry.getFluidStack("molten.mytryl", 1),

        // Molten Naquadah
        FluidRegistry.getFluidStack("molten.naquadah", 1),

        // Molten Naquadah Alloy
        FluidRegistry.getFluidStack("molten.naquadahalloy", 1),

        // Molten Naquadria
        FluidRegistry.getFluidStack("molten.naquadria", 1),

        // Molten Neodymium
        FluidRegistry.getFluidStack("molten.neodymium", 1),

        // Molten Neptunium
        FluidRegistry.getFluidStack("molten.neptunium", 1),

        // Molten Nether Quartz
        FluidRegistry.getFluidStack("quartz.molten", 1),

        // Molten Neutronium
        FluidRegistry.getFluidStack("molten.neutronium", 1),

        // Molten Nichrome
        FluidRegistry.getFluidStack("molten.nichrome", 1),

        // Molten Nickel
        FluidRegistry.getFluidStack("nickel.molten", 1),

        // Molten Nickel
        FluidRegistry.getFluidStack("molten.nickel", 1),

        // Molten Nickel Aluminide
        FluidRegistry.getFluidStack("molten.nickelaluminide", 1),

        // Molten Nickel-Zinc Ferrite
        FluidRegistry.getFluidStack("molten.nickelzincferrite", 1),

        // Molten Niobium
        FluidRegistry.getFluidStack("molten.niobium", 1),

        // Molten Niobium Carbide
        FluidRegistry.getFluidStack("molten.niobiumcarbide", 1),

        // Molten Niobium Nitride
        FluidRegistry.getFluidStack("molten.niobiumnitride", 1),

        // Molten Niobium-Titanium
        FluidRegistry.getFluidStack("molten.niobiumtitanium", 1),

        // Molten Nitinol 60
        FluidRegistry.getFluidStack("molten.nitinol60", 1),

        // Molten Obsidian
        FluidRegistry.getFluidStack("molten.obsidian", 1),

        // Molten Obsidian
        FluidRegistry.getFluidStack("obsidian.molten", 1),

        // Molten Obzinite
        FluidRegistry.getFluidStack("molten.alumite", 1),

        // Molten Obzinite
        FluidRegistry.getFluidStack("alumite.molten", 1),

        // Molten Octiron
        FluidRegistry.getFluidStack("molten.octiron", 1),

        // Molten Orichalcum
        FluidRegistry.getFluidStack("molten.orichalcum", 1),

        // Molten Oriharukon
        FluidRegistry.getFluidStack("molten.oriharukon", 1),

        // Molten Orundum
        FluidRegistry.getFluidStack("molten.orundum", 1),

        // Molten Osmiridium
        FluidRegistry.getFluidStack("molten.osmiridium", 1),

        // Molten Osmium
        FluidRegistry.getFluidStack("molten.osmium", 1),

        // Molten Osmonium
        FluidRegistry.getFluidStack("molten.osmonium", 1),

        // Molten Oureclase
        FluidRegistry.getFluidStack("molten.oureclase", 1),

        // Molten PTMEG Elastomer
        FluidRegistry.getFluidStack("molten.ptmeg elastomer", 1),

        // Molten Palladium
        FluidRegistry.getFluidStack("molten.palladium", 1),

        // Molten Phased Gold
        FluidRegistry.getFluidStack("molten.phasedgold", 1),

        // Molten Phased Iron
        FluidRegistry.getFluidStack("molten.phasediron", 1),

        // Molten Phoenixite
        FluidRegistry.getFluidStack("molten.phoenixite", 1),

        // Molten Pig Iron
        FluidRegistry.getFluidStack("molten.pigiron", 1),

        // Molten Pikyonium 64B
        FluidRegistry.getFluidStack("molten.pikyonium64b", 1),

        // Molten Platinum
        FluidRegistry.getFluidStack("molten.platinum", 1),

        // Molten Plutonium 239
        FluidRegistry.getFluidStack("molten.plutonium", 1),

        // Molten Plutonium 241
        FluidRegistry.getFluidStack("molten.plutonium241", 1),

        // Molten Plutonium-238
        FluidRegistry.getFluidStack("molten.plutonium238", 1),

        // Molten Polonium
        FluidRegistry.getFluidStack("molten.polonium", 1),

        // Molten Polybenzimidazole
        FluidRegistry.getFluidStack("molten.polybenzimidazole", 1),

        // Molten Polycaprolactam
        FluidRegistry.getFluidStack("molten.polycaprolactam", 1),

        // Molten Polyethylene
        FluidRegistry.getFluidStack("molten.plastic", 1),

        // Molten Polyphenylene Sulfide
        FluidRegistry.getFluidStack("molten.polyphenylenesulfide", 1),

        // Molten Polystyrene
        FluidRegistry.getFluidStack("molten.polystyrene", 1),

        // Molten Polytetrafluoroethylene
        FluidRegistry.getFluidStack("molten.polytetrafluoroethylene", 1),

        // Molten Polyvinyl Chloride
        FluidRegistry.getFluidStack("molten.polyvinylchloride", 1),

        // Molten Potassium
        FluidRegistry.getFluidStack("molten.potassium", 1),

        // Molten Potassium Chlorate
        FluidRegistry.getFluidStack("molten.potassium chlorate", 1),

        // Molten Potassium Disulfate
        FluidRegistry.getFluidStack("molten.potassium disulfate", 1),

        // Molten Potassium Nitrate
        FluidRegistry.getFluidStack("molten.potassiumnitrate", 1),

        // Molten Potin
        FluidRegistry.getFluidStack("molten.potin", 1),

        // Molten Praseodymium
        FluidRegistry.getFluidStack("molten.praseodymium", 1),

        // Molten Precious Metals Alloy
        FluidRegistry.getFluidStack("molten.precious metals alloy", 1),

        // Molten Prismatic Naquadah
        FluidRegistry.getFluidStack("molten.prismaticnaquadah", 1),

        // Molten Prometheum
        FluidRegistry.getFluidStack("molten.prometheum", 1),

        // Molten Promethium
        FluidRegistry.getFluidStack("molten.promethium", 1),

        // Molten Protactinium
        FluidRegistry.getFluidStack("molten.protactinium", 1),

        // Molten Proto-Halkonite Steel Base
        FluidRegistry.getFluidStack("protohalkonitebase", 1),

        // Molten Pulsating Iron
        FluidRegistry.getFluidStack("molten.pulsatingiron", 1),

        // Molten Purified Tengam
        FluidRegistry.getFluidStack("molten.tengampurified", 1),

        // Molten Quantium
        FluidRegistry.getFluidStack("molten.quantium", 1),

        // Molten Quantum
        FluidRegistry.getFluidStack("molten.quantum", 1),

        // Molten Queen's Gold
        FluidRegistry.getFluidStack("moltenqueensgold", 1),

        // Molten Radium
        FluidRegistry.getFluidStack("molten.radium", 1),

        // Molten Radox Polymer
        FluidRegistry.getFluidStack("molten.radoxpoly", 1),

        // Molten Raw Silicon
        FluidRegistry.getFluidStack("molten.silicon", 1),

        // Molten Realgar
        FluidRegistry.getFluidStack("molten.realgar", 1),

        // Molten Red Alloy
        FluidRegistry.getFluidStack("molten.redalloy", 1),

        // Molten Red Granite
        FluidRegistry.getFluidStack("molten.granitered", 1),

        // Molten Red Steel
        FluidRegistry.getFluidStack("molten.redsteel", 1),

        // Molten Redstone
        FluidRegistry.getFluidStack("molten.redstone", 1),

        // Molten Redstone Alloy
        FluidRegistry.getFluidStack("molten.redstonealloy", 1),

        // NEI Page 11/18
        // Molten Reinforced
        FluidRegistry.getFluidStack("molten.reinforced", 1),

        // Molten Reinforced Glass
        FluidRegistry.getFluidStack("molten.reinforcedglass", 1),

        // Molten Rhenium
        FluidRegistry.getFluidStack("molten.rhenium", 1),

        // Molten Rhodium
        FluidRegistry.getFluidStack("molten.rhodium", 1),

        // Molten Rhodium-Plated Palladium
        FluidRegistry.getFluidStack("molten.rhodium-plated palladium", 1),

        // Molten Rhugnor
        FluidRegistry.getFluidStack("molten.rhugnor", 1),

        // Molten Rose Gold
        FluidRegistry.getFluidStack("molten.rosegold", 1),

        // Molten Rubber
        FluidRegistry.getFluidStack("molten.rubber", 1),

        // Molten Rubidium
        FluidRegistry.getFluidStack("molten.rubidium", 1),

        // Molten Rubracium
        FluidRegistry.getFluidStack("molten.rubracium", 1),

        // Molten Runite
        FluidRegistry.getFluidStack("molten.runite", 1),

        // Molten Ruridit
        FluidRegistry.getFluidStack("molten.ruridit", 1),

        // Molten Ruthenium
        FluidRegistry.getFluidStack("molten.ruthenium", 1),

        // Molten Samarium
        FluidRegistry.getFluidStack("molten.samarium", 1),

        // Molten Samarium(III)-Chloride
        FluidRegistry.getFluidStack("molten.samarium(iii)-chloride", 1),

        // Molten Sanguinite
        FluidRegistry.getFluidStack("molten.sanguinite", 1),

        // Molten Scandium
        FluidRegistry.getFluidStack("molten.scandium", 1),

        // Molten Selenium
        FluidRegistry.getFluidStack("molten.selenium", 1),

        // Molten Serpentine
        FluidRegistry.getFluidStack("molten.serpentine", 1),

        // Molten Shadow Iron
        FluidRegistry.getFluidStack("molten.shadowiron", 1),

        // Molten Shadow Metal
        FluidRegistry.getFluidStack("molten.shadow", 1),

        // Molten Shadow Steel
        FluidRegistry.getFluidStack("molten.shadowsteel", 1),

        // Molten Shiny
        FluidRegistry.getFluidStack("platinum.molten", 1),

        // Molten Shirabon
        FluidRegistry.getFluidStack("molten.shirabon", 1),

        // Molten Signalium
        FluidRegistry.getFluidStack("molten.signalium", 1),

        // Molten Signalum
        FluidRegistry.getFluidStack("signalum.molten", 1),

        // Molten Signalum
        FluidRegistry.getFluidStack("molten.signalum", 1),

        // Molten Silicon Carbide
        FluidRegistry.getFluidStack("molten.siliconcarbide", 1),

        // Molten Silicon Solar Grade (Poly SI)
        FluidRegistry.getFluidStack("molten.siliconsolargrade", 1),

        // Molten Silicone Rubber
        FluidRegistry.getFluidStack("molten.silicone", 1),

        // Molten Silver
        FluidRegistry.getFluidStack("molten.silver", 1),

        // Molten Silver
        FluidRegistry.getFluidStack("silver.molten", 1),

        // Molten Six-Phased Copper
        FluidRegistry.getFluidStack("molten.sixphasedcopper", 1),

        // Molten Sodium Cyanide
        FluidRegistry.getFluidStack("molten.sodiumcyanide", 1),

        // Molten Sodium Nitrate
        FluidRegistry.getFluidStack("molten.sodiumnitrate", 1),

        // Molten Soldering Alloy
        FluidRegistry.getFluidStack("molten.solderingalloy", 1),

        // Molten Soularium
        FluidRegistry.getFluidStack("molten.soularium", 1),

        // Molten SpaceTime
        FluidRegistry.getFluidStack("molten.spacetime", 1),

        // Molten Staballoy
        FluidRegistry.getFluidStack("molten.staballoy", 1),

        // Molten Stainless Steel
        FluidRegistry.getFluidStack("molten.stainlesssteel", 1),

        // Molten Starconium
        FluidRegistry.getFluidStack("molten.starconium", 1),

        // Molten Steel
        FluidRegistry.getFluidStack("molten.steel", 1),

        // Molten Steel
        FluidRegistry.getFluidStack("steel.molten", 1),

        // Molten Stellar Alloy
        FluidRegistry.getFluidStack("molten.stellaralloy", 1),

        // Molten Stellite
        FluidRegistry.getFluidStack("molten.stellite", 1),

        // Molten Sterling Silver
        FluidRegistry.getFluidStack("molten.sterlingsilver", 1),

        // Molten Strontium
        FluidRegistry.getFluidStack("molten.strontium", 1),

        // Molten Strontium Hydroxide
        FluidRegistry.getFluidStack("molten.strontiumhydroxide", 1),

        // Molten Strontium Oxide
        FluidRegistry.getFluidStack("molten.strontiumoxide", 1),

        // Molten Styrene-Butadiene Rubber
        FluidRegistry.getFluidStack("molten.styrenebutadienerubber", 1),

        // Molten Sugar
        FluidRegistry.getFluidStack("molten.sugar", 1),

        // Molten Sunnarium
        FluidRegistry.getFluidStack("molten.sunnarium", 1),

        // Molten Superconductor Base EV
        FluidRegistry.getFluidStack("molten.uraniumtriplatinid", 1),

        // Molten Superconductor Base HV
        FluidRegistry.getFluidStack("molten.titaniumonabariumdecacoppereikosaoxid", 1),

        // Molten Superconductor Base IV
        FluidRegistry.getFluidStack("molten.vanadiumtriindinid", 1),

        // Molten Superconductor Base LuV
        FluidRegistry.getFluidStack("molten.tetraindiumditindibariumtitaniumheptacoppertetrakaidekaoxid", 1),

        // Molten Superconductor Base MV
        FluidRegistry.getFluidStack("molten.pentacadmiummagnesiumhexaoxid", 1),

        // Molten Superconductor Base UEV
        FluidRegistry.getFluidStack("molten.superconductoruevbase", 1),

        // Molten Superconductor Base UHV
        FluidRegistry.getFluidStack("molten.longasssuperconductornameforuhvwire", 1),

        // Molten Superconductor Base UIV
        FluidRegistry.getFluidStack("molten.superconductoruivbase", 1),

        // Molten Superconductor Base UMV
        FluidRegistry.getFluidStack("molten.superconductorumvbase", 1),

        // Molten Superconductor Base UV
        FluidRegistry.getFluidStack("molten.longasssuperconductornameforuvwire", 1),

        // Molten Superconductor Base ZPM
        FluidRegistry.getFluidStack("molten.tetranaquadahdiindiumhexaplatiumosminid", 1),

        // Molten TPV-Alloy
        FluidRegistry.getFluidStack("molten.tpvalloy", 1),

        // Molten Tairitsu
        FluidRegistry.getFluidStack("molten.tairitsu", 1),

        // Molten Talonite
        FluidRegistry.getFluidStack("molten.talonite", 1),

        // Molten Tanmolyium Beta-C
        FluidRegistry.getFluidStack("molten.tanmolyium beta-c", 1),

        // Molten Tantalloy-60
        FluidRegistry.getFluidStack("molten.tantalloy60", 1),

        // Molten Tantalloy-61
        FluidRegistry.getFluidStack("molten.tantalloy61", 1),

        // Molten Tantalum
        FluidRegistry.getFluidStack("molten.tantalum", 1),

        // Molten Tantalum Carbide
        FluidRegistry.getFluidStack("molten.tantalumcarbide", 1),

        // Molten Tantalum Hafnium Carbide
        FluidRegistry.getFluidStack("molten.tantalum hafnium carbide", 1),

        // Molten Tar Pitch
        FluidRegistry.getFluidStack("molten.tarpitch", 1),

        // Molten Tartarite
        FluidRegistry.getFluidStack("molten.tartarite", 1),

        // Molten Technetium
        FluidRegistry.getFluidStack("molten.technetium", 1),

        // Molten Tellurium
        FluidRegistry.getFluidStack("molten.tellurium", 1),

        // Molten Terbium
        FluidRegistry.getFluidStack("molten.terbium", 1),

        // Molten Terrasteel
        FluidRegistry.getFluidStack("molten.terrasteel", 1),

        // Molten Teslatite
        FluidRegistry.getFluidStack("molten.teslatite", 1),

        // Molten Thallium
        FluidRegistry.getFluidStack("molten.thallium", 1),

        // Molten Thaumium
        FluidRegistry.getFluidStack("molten.thaumium", 1),

        // Molten Thorium
        FluidRegistry.getFluidStack("molten.thorium", 1),

        // Molten Thorium 232
        FluidRegistry.getFluidStack("molten.thorium232", 1),

        // Molten Thulium
        FluidRegistry.getFluidStack("molten.thulium", 1),

        // Molten Thyrium
        FluidRegistry.getFluidStack("molten.thyrium", 1),

        // Molten Tin
        FluidRegistry.getFluidStack("tin.molten", 1),

        // Molten Tin
        FluidRegistry.getFluidStack("molten.tin", 1),

        // Molten Tin Alloy
        FluidRegistry.getFluidStack("molten.tinalloy", 1),

        // Molten Titanium
        FluidRegistry.getFluidStack("molten.titanium", 1),

        // Molten Titansteel
        FluidRegistry.getFluidStack("molten.titansteel", 1),

        // NEI Page 12/18
        // Molten Transcendent Metal
        FluidRegistry.getFluidStack("molten.transcendentmetal", 1),

        // Molten Trinium
        FluidRegistry.getFluidStack("molten.trinium", 1),

        // Molten Trinium Naquadah Alloy
        FluidRegistry.getFluidStack("molten.triniumnaquadahalloy", 1),

        // Molten Trinium Naquadah Carbonite
        FluidRegistry.getFluidStack("molten.triniumnaquadahcarbonite", 1),

        // Molten Trinium Titanium Alloy
        FluidRegistry.getFluidStack("molten.triniumtitaniumalloy", 1),

        // Molten Tritanium
        FluidRegistry.getFluidStack("molten.tritanium", 1),

        // Molten Tumbaga
        FluidRegistry.getFluidStack("molten.tumbaga", 1),

        // Molten Tungsten
        FluidRegistry.getFluidStack("molten.tungsten", 1),

        // Molten Tungsten Titanium Carbide
        FluidRegistry.getFluidStack("molten.tungstentitaniumcarbide", 1),

        // Molten Tungstencarbide
        FluidRegistry.getFluidStack("molten.tungstencarbide", 1),

        // Molten Tungstensteel
        FluidRegistry.getFluidStack("molten.tungstensteel", 1),

        // Molten Ultimet
        FluidRegistry.getFluidStack("molten.ultimet", 1),

        // Molten Universium
        FluidRegistry.getFluidStack("molten.universium", 1),

        // Molten Unstable Ingots
        FluidRegistry.getFluidStack("molten.unstableingots", 1),

        // Molten Uranium 232
        FluidRegistry.getFluidStack("molten.uranium232", 1),

        // Molten Uranium 233
        FluidRegistry.getFluidStack("molten.uranium233", 1),

        // Molten Uranium 235
        FluidRegistry.getFluidStack("molten.uranium235", 1),

        // Molten Uranium 238
        FluidRegistry.getFluidStack("molten.uranium", 1),

        // Molten Vanadium
        FluidRegistry.getFluidStack("molten.vanadium", 1),

        // Molten Vanadium-Gallium
        FluidRegistry.getFluidStack("molten.vanadiumgallium", 1),

        // Molten Vanadiumsteel
        FluidRegistry.getFluidStack("molten.vanadiumsteel", 1),

        // Molten Vibrant Alloy
        FluidRegistry.getFluidStack("molten.vibrantalloy", 1),

        // Molten Vinteum
        FluidRegistry.getFluidStack("molten.vinteum", 1),

        // Molten Vivid Alloy
        FluidRegistry.getFluidStack("molten.vividalloy", 1),

        // Molten Void
        FluidRegistry.getFluidStack("molten.void", 1),

        // Molten Vulcanite
        FluidRegistry.getFluidStack("molten.vulcanite", 1),

        // Molten Vyroxeres
        FluidRegistry.getFluidStack("molten.vyroxeres", 1),

        // Molten Watertight Steel
        FluidRegistry.getFluidStack("molten.watertightsteel", 1),

        // Molten White Dwarf Matter
        FluidRegistry.getFluidStack("molten.whitedwarfmatter", 1),

        // Molten White Metal
        FluidRegistry.getFluidStack("molten.whitemetal", 1),

        // Molten Wood's Glass
        FluidRegistry.getFluidStack("molten.wood'sglass", 1),

        // Molten Wrought Iron
        FluidRegistry.getFluidStack("molten.wroughtiron", 1),

        // Molten Yellorium
        FluidRegistry.getFluidStack("molten.yellorium", 1),

        // Molten Ytterbium
        FluidRegistry.getFluidStack("molten.ytterbium", 1),

        // Molten Yttrium
        FluidRegistry.getFluidStack("molten.yttrium", 1),

        // Molten Yttrium Barium Cuprate
        FluidRegistry.getFluidStack("molten.yttriumbariumcuprate", 1),

        // Molten Zectium
        FluidRegistry.getFluidStack("molten.zectium", 1),

        // Molten Zeron-100
        FluidRegistry.getFluidStack("molten.zeron100", 1),

        // Molten Zinc
        FluidRegistry.getFluidStack("molten.zinc", 1),

        // Molten Zircaloy-2
        FluidRegistry.getFluidStack("molten.zircaloy-2", 1),

        // Molten Zircaloy-4
        FluidRegistry.getFluidStack("molten.zircaloy-4", 1),

        // Molten Zirconium
        FluidRegistry.getFluidStack("molten.zirconium", 1),

        // Molten Zirconium Carbide
        FluidRegistry.getFluidStack("molten.zirconiumcarbide", 1),

        // Molten Zn-Th Alloy
        FluidRegistry.getFluidStack("molten.zn-th alloy", 1),

        // Molybdenum Plasma
        FluidRegistry.getFluidStack("plasma.molybdenum", 1),

        // Monazite Froth
        FluidRegistry.getFluidStack("froth.monaziteflotation", 1),

        // Monomethylhydrazine
        FluidRegistry.getFluidStack("fluid.monomethylhydrazine", 1),

        // Mortuus Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousmortuusessentia", 1),

        // Motus Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousmotusessentia", 1),

        // Muddy Bastnasite Rare Earth Solution
        FluidRegistry.getFluidStack("muddy bastnasite rare earth solution", 1),

        // Muddy Monazite Rare Earth Solution
        FluidRegistry.getFluidStack("muddy monazite rare earth solution", 1),

        // Muddy Samarium Rare Earth Solution
        FluidRegistry.getFluidStack("muddy samarium rare earth solution", 1),

        // Mundane Brew
        FluidRegistry.getFluidStack("potion.mundane", 1),

        // Mushroom Soup
        FluidRegistry.getFluidStack("fluidmushroom", 1),

        // Mushroom Stew
        FluidRegistry.getFluidStack("mushroomstew", 1),

        // Mutagen
        FluidRegistry.getFluidStack("mutagen", 1),

        // Mutated Living Solder
        FluidRegistry.getFluidStack("molten.mutatedlivingsolder", 1),

        // N-Methyl-2-pyrrolidone
        FluidRegistry.getFluidStack("nmethylpyrolidone", 1),

        // NULL Plasma
        FluidRegistry.getFluidStack("plasma.null", 1),

        // Naphtha
        FluidRegistry.getFluidStack("liquid_naphtha", 1),

        // Naphthalene
        FluidRegistry.getFluidStack("fluid.naphthalene", 1),

        // Naphthenic Acid
        FluidRegistry.getFluidStack("naphthenicacid", 1),

        // Naquadah Asphalt
        FluidRegistry.getFluidStack("naquadah asphalt", 1),

        // Naquadah Based Liquid Fuel MkI
        FluidRegistry.getFluidStack("naquadah based liquid fuel mki", 1),

        // Naquadah Based Liquid Fuel MkI (Depleted)
        FluidRegistry.getFluidStack("naquadah based liquid fuel mki (depleted)", 1),

        // Naquadah Based Liquid Fuel MkII
        FluidRegistry.getFluidStack("naquadah based liquid fuel mkii", 1),

        // Naquadah Based Liquid Fuel MkII (Depleted)
        FluidRegistry.getFluidStack("naquadah based liquid fuel mkii (depleted)", 1),

        // Naquadah Based Liquid Fuel MkIII
        FluidRegistry.getFluidStack("naquadah based liquid fuel mkiii", 1),

        // Naquadah Based Liquid Fuel MkIII (Depleted)
        FluidRegistry.getFluidStack("naquadah based liquid fuel mkiii (depleted)", 1),

        // Naquadah Based Liquid Fuel MkIV
        FluidRegistry.getFluidStack("naquadah based liquid fuel mkiv", 1),

        // Naquadah Based Liquid Fuel MkIV (Depleted)
        FluidRegistry.getFluidStack("naquadah based liquid fuel mkiv (depleted)", 1),

        // Naquadah Based Liquid Fuel MkV
        FluidRegistry.getFluidStack("naquadah based liquid fuel mkv", 1),

        // Naquadah Based Liquid Fuel MkV (Depleted)
        FluidRegistry.getFluidStack("naquadah based liquid fuel mkv (depleted)", 1),

        // Naquadah Based Liquid Fuel MkVI
        FluidRegistry.getFluidStack("naquadah based liquid fuel mkvi", 1),

        // Naquadah Based Liquid Fuel MkVI (Depleted)
        FluidRegistry.getFluidStack("naquadah based liquid fuel mkvi (depleted)", 1),

        // Naquadah Emulsion
        FluidRegistry.getFluidStack("naquadah emulsion", 1),

        // Naquadah Gas
        FluidRegistry.getFluidStack("naquadah gas", 1),

        // Naquadah Goo
        FluidRegistry.getFluidStack("naquadah goo", 1),

        // Naquadah Plasma
        FluidRegistry.getFluidStack("plasma.naquadah", 1),

        // Naquadah Solution
        FluidRegistry.getFluidStack("naquadah solution", 1),

        // Naquadah-Adamantium Solution
        FluidRegistry.getFluidStack("naquadah-adamantium solution", 1),

        // Naquadah-Rich Solution
        FluidRegistry.getFluidStack("naquadah-rich solution", 1),

        // Naquadria Goo
        FluidRegistry.getFluidStack("naquadria goo", 1),

        // Naquadria Plasma
        FluidRegistry.getFluidStack("plasma.naquadria", 1),

        // Naquadria-Rich Solution
        FluidRegistry.getFluidStack("naquadria-rich solution", 1),

        // Natural Gas
        FluidRegistry.getFluidStack("gas_natural_gas", 1),

        // Nebrisum Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousnebrisumessentia", 1),

        // Nefarious Gas
        FluidRegistry.getFluidStack("nefariousgas", 1),

        // Nefarious Oil
        FluidRegistry.getFluidStack("nefariousoil", 1),

        // Neodymium Chloride Concentrate
        FluidRegistry.getFluidStack("neodymium chloride concentrate", 1),

        // NEI Page 13/18
        // Neodymium Extracting Nano Resin
        FluidRegistry.getFluidStack("neodymium extracting nano resin", 1),

        // Neodymium Plasma
        FluidRegistry.getFluidStack("plasma.neodymium", 1),

        // Neon
        FluidRegistry.getFluidStack("neon", 1),

        // Neon Plasma
        FluidRegistry.getFluidStack("plasma.neon", 1),

        // Neptunium Hexafluoride
        FluidRegistry.getFluidStack("neptuniumhexafluoride", 1),

        // Neptunium Plasma
        FluidRegistry.getFluidStack("plasma.neptunium", 1),

        // Nether Air
        FluidRegistry.getFluidStack("netherair", 1),

        // Nether Semifluid
        FluidRegistry.getFluidStack("nethersemifluid", 1),

        // Netherrack Froth
        FluidRegistry.getFluidStack("froth.netherrackflotation", 1),

        // Neutronium Plasma
        FluidRegistry.getFluidStack("plasma.neutronium", 1),

        // Nickel Froth
        FluidRegistry.getFluidStack("froth.nickelflotation", 1),

        // Nickel Plasma
        FluidRegistry.getFluidStack("plasma.nickel", 1),

        // Nickel Sulfate Water Solution
        FluidRegistry.getFluidStack("solution.nickelsulfate", 1),

        // Nickel Tetracarbonyl
        FluidRegistry.getFluidStack("nickeltetracarbonyl", 1),

        // Night Vision Brew
        FluidRegistry.getFluidStack("potion.nightvision", 1),

        // Niobium Plasma
        FluidRegistry.getFluidStack("plasma.niobium", 1),

        // Nitration Mixture
        FluidRegistry.getFluidStack("liquid_nitrationmixture", 1),

        // Nitric Acid
        FluidRegistry.getFluidStack("nitricacid", 1),

        // Nitric Monazite Leached Concentrate
        FluidRegistry.getFluidStack("nitric monazite leached concentrate", 1),

        // Nitric Oxide
        FluidRegistry.getFluidStack("nitricoxide", 1),

        // Nitric-Leached Monazite Mixture
        FluidRegistry.getFluidStack("nitric-leached monazite mixture", 1),

        // Nitrobenzene
        FluidRegistry.getFluidStack("nitrobenzene", 1),

        // Nitrogen
        FluidRegistry.getFluidStack("nitrogen", 1),

        // Nitrogen Dioxide
        FluidRegistry.getFluidStack("nitrogendioxide", 1),

        // Nitrogen Plasma
        FluidRegistry.getFluidStack("plasma.nitrogen", 1),

        // Nitrogen Tetroxide
        FluidRegistry.getFluidStack("fluid.nitrogentetroxide", 1),

        // Nitrogenated Bastnasite Rarer Earth Oxides
        FluidRegistry.getFluidStack("nitrogenated bastnasite rarer earth oxides", 1),

        // Nitrogenated Monazite Rare Earth Concentrate
        FluidRegistry.getFluidStack("nitrogenated monazite rare earth concentrate", 1),

        // Nitromethane
        FluidRegistry.getFluidStack("nitromethane", 1),

        // Nitrous Oxide
        FluidRegistry.getFluidStack("nitrousoxide", 1),

        // Noble Gases
        FluidRegistry.getFluidStack("noblegases", 1),

        // Notches Brew
        FluidRegistry.getFluidStack("potion.notchesbrew", 1),

        // Nuclear Waste
        FluidRegistry.getFluidStack("nuclear.waste", 1),

        // Nutrient Distillation
        FluidRegistry.getFluidStack("nutrient_distillation", 1),

        // Octane
        FluidRegistry.getFluidStack("octane", 1),

        // Oganesson
        FluidRegistry.getFluidStack("oganesson", 1),

        // Oil
        FluidRegistry.getFluidStack("oil", 1),

        // Old Man Snitches glitched Diablo Sauce
        FluidRegistry.getFluidStack("potion.diablosauce.strong", 1),

        // Ordo Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousordoessentia", 1),

        // Oriharukon Plasma
        FluidRegistry.getFluidStack("plasma.oriharukon", 1),

        // Osmium Plasma
        FluidRegistry.getFluidStack("plasma.osmium", 1),

        // Osmium Solution
        FluidRegistry.getFluidStack("osmium solution", 1),

        // Oxalic Acid
        FluidRegistry.getFluidStack("oxalic acid", 1),

        // Oxygen
        FluidRegistry.getFluidStack("oxygen", 1),

        // Oxygen Plasma
        FluidRegistry.getFluidStack("plasma.oxygen", 1),

        // Ozonated Water (Grade 2)
        FluidRegistry.getFluidStack("grade2purifiedwater", 1),

        // Ozone
        FluidRegistry.getFluidStack("ozone", 1),

        // P-507
        FluidRegistry.getFluidStack("p-507", 1),

        // Pahoehoe Lava
        FluidRegistry.getFluidStack("ic2pahoehoelava", 1),

        // Palladium Enriched Ammonia
        FluidRegistry.getFluidStack("palladium enriched ammonia", 1),

        // Palladium Plasma
        FluidRegistry.getFluidStack("plasma.palladium", 1),

        // Pannus Super Critical Fluid
        FluidRegistry.getFluidStack("gaseouspannusessentia", 1),

        // Penicillin
        FluidRegistry.getFluidStack("penicillin", 1),

        // Pentlandite Froth
        FluidRegistry.getFluidStack("froth.pentlanditeflotation", 1),

        // Perditio Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousperditioessentia", 1),

        // Perfodio Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousperfodioessentia", 1),

        // Permutatio Super Critical Fluid
        FluidRegistry.getFluidStack("gaseouspermutatioessentia", 1),

        // Phenol
        FluidRegistry.getFluidStack("phenol", 1),

        // Phosgene
        FluidRegistry.getFluidStack("phosgene", 1),

        // Phosphoric Acid
        FluidRegistry.getFluidStack("phosphoricacid_gt5u", 1),

        // Phosphorous Uranium Hexafluoride (P-UF6)
        FluidRegistry.getFluidStack("molten.phosphorousuraniumhexafluoridepuf6", 1),

        // Phosphorus Plasma
        FluidRegistry.getFluidStack("plasma.phosphorus", 1),

        // Phosphorus Trichloride
        FluidRegistry.getFluidStack("phosphorustrichloride", 1),

        // Phthalic Acid
        FluidRegistry.getFluidStack("phtalicacid", 1),

        // Pig Iron
        FluidRegistry.getFluidStack("pigiron.molten", 1),

        // Pine Oil
        FluidRegistry.getFluidStack("pineoil", 1),

        // Pirate Brew
        FluidRegistry.getFluidStack("potion.piratebrew", 1),

        // Placeholder
        FluidRegistry.getFluidStack("betterquesting.placeholder", 1),

        // Platinum Concentrate
        FluidRegistry.getFluidStack("platinum concentrate", 1),

        // Platinum Froth
        FluidRegistry.getFluidStack("froth.platinumflotation", 1),

        // Platinum Plasma
        FluidRegistry.getFluidStack("plasma.platinum", 1),

        // Plutonium 239 Plasma
        FluidRegistry.getFluidStack("plasma.plutonium", 1),

        // Plutonium 241 Plasma
        FluidRegistry.getFluidStack("plasma.plutonium241", 1),

        // Plutonium Based Liquid Fuel
        FluidRegistry.getFluidStack("plutonium based liquid fuel", 1),

        // Plutonium Based Liquid Fuel (Depleted)
        FluidRegistry.getFluidStack("plutonium based liquid fuel (depleted)", 1),

        // Plutonium Based Liquid Fuel (Excited State)
        FluidRegistry.getFluidStack("plutonium based liquid fuel (excited state)", 1),

        // Plutonium-238 Plasma
        FluidRegistry.getFluidStack("plasma.plutonium238", 1),

        // Poison
        FluidRegistry.getFluidStack("poison", 1),

        // Poisonous Brew
        FluidRegistry.getFluidStack("potion.poison", 1),

        // Pollution
        FluidRegistry.getFluidStack("pollution", 1),

        // Polonium Plasma
        FluidRegistry.getFluidStack("plasma.polonium", 1),

        // Polyaluminium Chloride
        FluidRegistry.getFluidStack("polyaluminiumchloride", 1),

        // Polymerase
        FluidRegistry.getFluidStack("polymerase", 1),

        // Polymerizing Bacteria
        FluidRegistry.getFluidStack("binnie.bacteriapoly", 1),

        // Polytetrahydrofuran
        FluidRegistry.getFluidStack("polytetrahydrofuran", 1),

        // Polyurethane
        FluidRegistry.getFluidStack("polyurethane", 1),

        // Polyurethane Resin
        FluidRegistry.getFluidStack("polyurethaneresin", 1),

        // Polyvinyl Acetate
        FluidRegistry.getFluidStack("polyvinylacetate", 1),

        // Poor Nether Waste
        FluidRegistry.getFluidStack("poornetherwaste", 1),

        // Potassium Permanganate Solution
        FluidRegistry.getFluidStack("potassium permanganate solution", 1),

        // NEI Page 14/18
        // Potassium Plasma
        FluidRegistry.getFluidStack("plasma.potassium", 1),

        // Potato Juice
        FluidRegistry.getFluidStack("potion.potatojuice", 1),

        // Potentia Super Critical Fluid
        FluidRegistry.getFluidStack("gaseouspotentiaessentia", 1),

        // Praecantatio Super Critical Fluid
        FluidRegistry.getFluidStack("gaseouspraecantatioessentia", 1),

        // Praseodymium Chloride Concentrate
        FluidRegistry.getFluidStack("praseodymium chloride concentrate", 1),

        // Praseodymium Extracting Nano Resin
        FluidRegistry.getFluidStack("praseodymium extracting nano resin", 1),

        // Praseodymium Plasma
        FluidRegistry.getFluidStack("plasma.praseodymium", 1),

        // Pressurized Water
        FluidRegistry.getFluidStack("pressurized_water", 1),

        // Primordium Super Critical Fluid
        FluidRegistry.getFluidStack("gaseouscustom3essentia", 1),

        // Prismarine Solution
        FluidRegistry.getFluidStack("prismarinesolution", 1),

        // Prismarine-Contaminated Hydrogen Peroxide
        FluidRegistry.getFluidStack("prismarinecontaminatedhydrogenperoxide", 1),

        // Prismarine-Contaminated Nitrobenzene Solution
        FluidRegistry.getFluidStack("prismarinecontaminatednitrobenzenesolution", 1),

        // Prismarine-Rich Nitrobenzene Solution
        FluidRegistry.getFluidStack("prismarinerichnitrobenzenesolution", 1),

        // Prismatic Acid
        FluidRegistry.getFluidStack("prismaticacid", 1),

        // Prismatic Gas
        FluidRegistry.getFluidStack("prismaticgas", 1),

        // Prismatic Naquadah Composite Slurry
        FluidRegistry.getFluidStack("prismaticnaquadahcompositeslurry", 1),

        // Promethium Chloride Concentrate
        FluidRegistry.getFluidStack("promethium chloride concentrate", 1),

        // Promethium Extracting Nano Resin
        FluidRegistry.getFluidStack("promethium extracting nano resin", 1),

        // Promethium Plasma
        FluidRegistry.getFluidStack("plasma.promethium", 1),

        // Propane
        FluidRegistry.getFluidStack("propane", 1),

        // Propene
        FluidRegistry.getFluidStack("propene", 1),

        // Propionic Acid
        FluidRegistry.getFluidStack("propionicacid", 1),

        // Protactinium Plasma
        FluidRegistry.getFluidStack("plasma.protactinium", 1),

        // Protein
        FluidRegistry.getFluidStack("protein", 1),

        // Protomatter
        FluidRegistry.getFluidStack("protomatter", 1),

        // Purifying Fluid
        FluidRegistry.getFluidStack("fluidpure", 1),

        // Purple Drink
        FluidRegistry.getFluidStack("potion.purpledrink", 1),

        // Putrescine
        FluidRegistry.getFluidStack("putrescine", 1),

        // Pyrope Froth
        FluidRegistry.getFluidStack("froth.pyropeflotation", 1),

        // RP-1
        FluidRegistry.getFluidStack("fluid.rp1fuel", 1),

        // Radio Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousradioessentia", 1),

        // Radium Plasma
        FluidRegistry.getFluidStack("plasma.radium", 1),

        // Radon
        FluidRegistry.getFluidStack("radon", 1),

        // Radon Plasma
        FluidRegistry.getFluidStack("plasma.radon", 1),

        // Radox Gas
        FluidRegistry.getFluidStack("radoxgas", 1),

        // Radox Polymer
        FluidRegistry.getFluidStack("radoxpoly", 1),

        // Raisin Juice
        FluidRegistry.getFluidStack("fluid.raisinjuice", 1),

        // Raw Animal Waste
        FluidRegistry.getFluidStack("fluid.raw.waste", 1),

        // Raw Bio Catalyst Medium
        FluidRegistry.getFluidStack("biomediumraw", 1),

        // Raw Gasoline
        FluidRegistry.getFluidStack("rawgasoline", 1),

        // Raw Growth Catalyst Medium
        FluidRegistry.getFluidStack("growthmediumraw", 1),

        // Raw Oil
        FluidRegistry.getFluidStack("liquid_medium_oil", 1),

        // Raw Radox
        FluidRegistry.getFluidStack("rawradox", 1),

        // Raw Silicon Plasma
        FluidRegistry.getFluidStack("plasma.silicon", 1),

        // Reactive-Ion Etching Mixture
        FluidRegistry.getFluidStack("reactive-ion etching mixture", 1),

        // Real J?germeister!
        FluidRegistry.getFluidStack("potion.jagi", 1),

        // Red Mud
        FluidRegistry.getFluidStack("redmud", 1),

        // Red Mud Slurry
        FluidRegistry.getFluidStack("mud.red.slurry", 1),

        // Redstone Froth
        FluidRegistry.getFluidStack("froth.redstoneflotation", 1),

        // Reed Water
        FluidRegistry.getFluidStack("potion.reedwater", 1),

        // Refined Glue
        FluidRegistry.getFluidStack("refinedglue", 1),

        // Refinery Gas
        FluidRegistry.getFluidStack("gas_gas", 1),

        // Regenerating Brew
        FluidRegistry.getFluidStack("potion.regen", 1),

        // Rhenium Plasma
        FluidRegistry.getFluidStack("plasma.rhenium", 1),

        // Rhodium Filter Cake Solution
        FluidRegistry.getFluidStack("rhodium filter cake solution", 1),

        // Rhodium Plasma
        FluidRegistry.getFluidStack("plasma.rhodium", 1),

        // Rhodium Salt Solution
        FluidRegistry.getFluidStack("rhodium salt solution", 1),

        // Rhodium Sulfate
        FluidRegistry.getFluidStack("rhodium sulfate", 1),

        // Rhodium Sulfate Solution
        FluidRegistry.getFluidStack("rhodium sulfate solution", 1),

        // Rhugnor Plasma
        FluidRegistry.getFluidStack("plasma.rhugnor", 1),

        // Rich Nether Waste
        FluidRegistry.getFluidStack("richnetherwaste", 1),

        // Rocket Fuel
        FluidRegistry.getFluidStack("rocket_fuel", 1),

        // Rp-1 Rocket Fuel
        FluidRegistry.getFluidStack("fluid.rocketfuelmixb", 1),

        // Rubidium Plasma
        FluidRegistry.getFluidStack("plasma.rubidium", 1),

        // Ruby Juice
        FluidRegistry.getFluidStack("rubyjuice", 1),

        // Rum
        FluidRegistry.getFluidStack("potion.rum", 1),

        // Runite Plasma
        FluidRegistry.getFluidStack("plasma.runite", 1),

        // Ruthenium Plasma
        FluidRegistry.getFluidStack("plasma.ruthenium", 1),

        // Ruthenium Tetroxide
        FluidRegistry.getFluidStack("ruthenium tetroxide", 1),

        // Ruthenium Tetroxide Solution
        FluidRegistry.getFluidStack("ruthenium tetroxide solution", 1),

        // Salt Water
        FluidRegistry.getFluidStack("saltwater", 1),

        // Salty Water
        FluidRegistry.getFluidStack("potion.saltywater", 1),

        // Samarium Chloride Concentrate
        FluidRegistry.getFluidStack("samarium chloride concentrate", 1),

        // Samarium Extracting Nano Resin
        FluidRegistry.getFluidStack("samarium extracting nano resin", 1),

        // Samarium Plasma
        FluidRegistry.getFluidStack("plasma.samarium", 1),

        // Samarium Rare Earth Mud
        FluidRegistry.getFluidStack("samarium rare earth mud", 1),

        // Sano Super Critical Fluid
        FluidRegistry.getFluidStack("gaseoussanoessentia", 1),

        // Sapphire Juice
        FluidRegistry.getFluidStack("sapphirejuice", 1),

        // Saturated Phononic Crystal Solution
        FluidRegistry.getFluidStack("phononcrystalsolution", 1),

        // Scandium Plasma
        FluidRegistry.getFluidStack("plasma.scandium", 1),

        // Scotch
        FluidRegistry.getFluidStack("potion.scotch", 1),

        // Seared Stone
        FluidRegistry.getFluidStack("stone.seared", 1),

        // Seaweed Broth
        FluidRegistry.getFluidStack("seaweedbroth", 1),

        // Seaweed Byproducts
        FluidRegistry.getFluidStack("seaweed byproducts", 1),

        // Seaweed Concentrate
        FluidRegistry.getFluidStack("seaweed concentrate", 1),

        // Seed Oil
        FluidRegistry.getFluidStack("seedoil", 1),

        // Selenious Acid
        FluidRegistry.getFluidStack("molten.seleniousacid", 1),

        // Selenium Dioxide
        FluidRegistry.getFluidStack("molten.seleniumdioxide", 1),

        // Selenium Hexafluoride
        FluidRegistry.getFluidStack("seleniumhexafluoride", 1),

        // Selenium Plasma
        FluidRegistry.getFluidStack("plasma.selenium", 1),

        // NEI Page 15/18
        // Semi-Stable Antimatter
        FluidRegistry.getFluidStack("antimatter", 1),

        // Sensus Super Critical Fluid
        FluidRegistry.getFluidStack("gaseoussensusessentia", 1),

        // Severely Cracked Heavy Naquadah Fuel
        FluidRegistry.getFluidStack("heavilycrackedheavynaquadahfuel", 1),

        // Severely Cracked Light Naquadah Fuel
        FluidRegistry.getFluidStack("heavilycrackedlightnaquadahfuel", 1),

        // Severely Cracked Naquadah Asphalt
        FluidRegistry.getFluidStack("heavilycrackednaquadahasphalt", 1),

        // Severely Cracked Naquadah Gas
        FluidRegistry.getFluidStack("heavilycrackednaquadahgas", 1),

        // Severely Hydro-Cracked Butadiene
        FluidRegistry.getFluidStack("severelyhydrocracked.butadiene", 1),

        // Severely Hydro-Cracked Butane
        FluidRegistry.getFluidStack("severelyhydrocracked.butane", 1),

        // Severely Hydro-Cracked Butene
        FluidRegistry.getFluidStack("severelyhydrocracked.butene", 1),

        // Severely Hydro-Cracked Ethane
        FluidRegistry.getFluidStack("severelyhydrocracked.ethane", 1),

        // Severely Hydro-Cracked Ethylene
        FluidRegistry.getFluidStack("severelyhydrocracked.ethylene", 1),

        // Severely Hydro-Cracked Heavy Fuel
        FluidRegistry.getFluidStack("severelyhydrocracked.heavyfuel", 1),

        // Severely Hydro-Cracked Light Fuel
        FluidRegistry.getFluidStack("severelyhydrocracked.lightfuel", 1),

        // Severely Hydro-Cracked Naphtha
        FluidRegistry.getFluidStack("severelyhydrocracked.naphtha", 1),

        // Severely Hydro-Cracked Propane
        FluidRegistry.getFluidStack("severelyhydrocracked.propane", 1),

        // Severely Hydro-Cracked Propene
        FluidRegistry.getFluidStack("severelyhydrocracked.propene", 1),

        // Severely Hydro-Cracked Refinery Gas
        FluidRegistry.getFluidStack("severelyhydrocracked.gas", 1),

        // Severely Steam-Cracked Butadiene
        FluidRegistry.getFluidStack("severelysteamcracked.butadiene", 1),

        // Severely Steam-Cracked Butane
        FluidRegistry.getFluidStack("severelysteamcracked.butane", 1),

        // Severely Steam-Cracked Butene
        FluidRegistry.getFluidStack("severelysteamcracked.butene", 1),

        // Severely Steam-Cracked Ethane
        FluidRegistry.getFluidStack("severelysteamcracked.ethane", 1),

        // Severely Steam-Cracked Ethylene
        FluidRegistry.getFluidStack("severelysteamcracked.ethylene", 1),

        // Severely Steam-Cracked Heavy Fuel
        FluidRegistry.getFluidStack("severelysteamcracked.heavyfuel", 1),

        // Severely Steam-Cracked Light Fuel
        FluidRegistry.getFluidStack("severelysteamcracked.lightfuel", 1),

        // Severely Steam-Cracked Naphtha
        FluidRegistry.getFluidStack("severelysteamcracked.naphtha", 1),

        // Severely Steam-Cracked Propane
        FluidRegistry.getFluidStack("severelysteamcracked.propane", 1),

        // Severely Steam-Cracked Propene
        FluidRegistry.getFluidStack("severelysteamcracked.propene", 1),

        // Severely Steam-Cracked Refinery Gas
        FluidRegistry.getFluidStack("severelysteamcracked.gas", 1),

        // Short Mead
        FluidRegistry.getFluidStack("short.mead", 1),

        // Silane
        FluidRegistry.getFluidStack("silane", 1),

        // Silane-Nitrogen Plasma Mixture
        FluidRegistry.getFluidStack("silane-nitrogen plasma mixture", 1),

        // Silicon Oil
        FluidRegistry.getFluidStack("siliconoil", 1),

        // Silicon Tetrachloride
        FluidRegistry.getFluidStack("silicontetrachloride", 1),

        // Silicon Tetrafluoride
        FluidRegistry.getFluidStack("silicontetrafluoride", 1),

        // Silver Plasma
        FluidRegistry.getFluidStack("plasma.silver", 1),

        // Six-Phased Copper Plasma
        FluidRegistry.getFluidStack("plasma.sixphasedcopper", 1),

        // Sluice Juice
        FluidRegistry.getFluidStack("sluicejuice", 1),

        // Sodium Fluoride
        FluidRegistry.getFluidStack("molten.sodiumfluoride", 1),

        // Sodium Formate
        FluidRegistry.getFluidStack("sodium formate", 1),

        // Sodium Persulfate
        FluidRegistry.getFluidStack("sodiumpersulfate", 1),

        // Sodium Plasma
        FluidRegistry.getFluidStack("plasma.sodium", 1),

        // Sodium Potassium
        FluidRegistry.getFluidStack("sodiumpotassium", 1),

        // Sodium Tungstate
        FluidRegistry.getFluidStack("sodium tungstate", 1),

        // Sodiumfluorosilicate
        FluidRegistry.getFluidStack("sodiumfluorosilicate", 1),

        // Solar Salt (Cold)
        FluidRegistry.getFluidStack("molten.solarsaltcold", 1),

        // Solar Salt (Hot)
        FluidRegistry.getFluidStack("molten.solarsalthot", 1),

        // Solid Acid Catalyst Mixture
        FluidRegistry.getFluidStack("molten.solidacidcatalystmixture", 1),

        // Spatially Enlarged Fluid
        FluidRegistry.getFluidStack("spatialfluid", 1),

        // Spessartine Froth
        FluidRegistry.getFluidStack("froth.spessartineflotation", 1),

        // Sphalerite Froth
        FluidRegistry.getFluidStack("froth.zincflotation", 1),

        // Spiritus Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousspiritusessentia", 1),

        // Splash Fire Resistant Brew
        FluidRegistry.getFluidStack("potion.fireresistance.splash", 1),

        // Splash Fishy Brew
        FluidRegistry.getFluidStack("potion.waterbreathing.splash", 1),

        // Splash Harming Brew
        FluidRegistry.getFluidStack("potion.damage.splash", 1),

        // Splash Healing Brew
        FluidRegistry.getFluidStack("potion.health.splash", 1),

        // Splash Invisible Brew
        FluidRegistry.getFluidStack("potion.invisibility.splash", 1),

        // Splash Lame Brew
        FluidRegistry.getFluidStack("potion.slowness.splash", 1),

        // Splash Night Vision Brew
        FluidRegistry.getFluidStack("potion.nightvision.splash", 1),

        // Splash Poisonous Brew
        FluidRegistry.getFluidStack("potion.poison.splash", 1),

        // Splash Regenerating Brew
        FluidRegistry.getFluidStack("potion.regen.splash", 1),

        // Splash Strength Brew
        FluidRegistry.getFluidStack("potion.strength.splash", 1),

        // Splash Swiftness Brew
        FluidRegistry.getFluidStack("potion.speed.splash", 1),

        // Splash Weakening Brew
        FluidRegistry.getFluidStack("potion.weakness.splash", 1),

        // Squid Ink
        FluidRegistry.getFluidStack("squidink", 1),

        // Stabilised Baryonic Matter
        FluidRegistry.getFluidStack("stablebaryonicmatter", 1),

        // Stable Molten Salt Base
        FluidRegistry.getFluidStack("molten.stablemoltensaltbase", 1),

        // Stargate Crystal Slurry
        FluidRegistry.getFluidStack("sgcrystalslurry", 1),

        // Steam
        FluidRegistry.getFluidStack("steam", 1),

        // Steam
        FluidRegistry.getFluidStack("ic2steam", 1),

        // Steam-Cracked Bastnasite Mud
        FluidRegistry.getFluidStack("steam-cracked bastnasite mud", 1),

        // Sterilized Bio Catalyst Medium
        FluidRegistry.getFluidStack("biohmediumsterilized", 1),

        // Strength Brew
        FluidRegistry.getFluidStack("potion.strength", 1),

        // Stretched Fire Resistant Brew
        FluidRegistry.getFluidStack("potion.fireresistance.long", 1),

        // Stretched Fishy Brew
        FluidRegistry.getFluidStack("potion.waterbreathing.long", 1),

        // Stretched Invisible Brew
        FluidRegistry.getFluidStack("potion.invisibility.long", 1),

        // Stretched Lame Brew
        FluidRegistry.getFluidStack("potion.slowness.long", 1),

        // Stretched Night Vision Brew
        FluidRegistry.getFluidStack("potion.nightvision.long", 1),

        // Stretched Poisonous Brew
        FluidRegistry.getFluidStack("potion.poison.long", 1),

        // Stretched Regenerating Brew
        FluidRegistry.getFluidStack("potion.regen.long", 1),

        // Stretched Splash Fire Resistant Brew
        FluidRegistry.getFluidStack("potion.fireresistance.long.splash", 1),

        // Stretched Splash Fishy Brew
        FluidRegistry.getFluidStack("potion.waterbreathing.long.splash", 1),

        // Stretched Splash Invisible Brew
        FluidRegistry.getFluidStack("potion.invisibility.long.splash", 1),

        // Stretched Splash Lame Brew
        FluidRegistry.getFluidStack("potion.slowness.long.splash", 1),

        // Stretched Splash Night Vision Brew
        FluidRegistry.getFluidStack("potion.nightvision.long.splash", 1),

        // Stretched Splash Poisonous Brew
        FluidRegistry.getFluidStack("potion.poison.long.splash", 1),

        // Stretched Splash Regenerating Brew
        FluidRegistry.getFluidStack("potion.regen.long.splash", 1),

        // Stretched Splash Strength Brew
        FluidRegistry.getFluidStack("potion.strength.long.splash", 1),

        // Stretched Splash Swiftness Brew
        FluidRegistry.getFluidStack("potion.speed.long.splash", 1),

        // Stretched Splash Weakening Brew
        FluidRegistry.getFluidStack("potion.weakness.long.splash", 1),

        // Stretched Strength Brew
        FluidRegistry.getFluidStack("potion.strength.long", 1),

        // NEI Page 16/18
        // Stretched Swiftness Brew
        FluidRegistry.getFluidStack("potion.speed.long", 1),

        // Stretched Weakening Brew
        FluidRegistry.getFluidStack("potion.weakness.long", 1),

        // Strong Harming Brew
        FluidRegistry.getFluidStack("potion.damage.strong", 1),

        // Strong Healing Brew
        FluidRegistry.getFluidStack("potion.health.strong", 1),

        // Strong Poisonous Brew
        FluidRegistry.getFluidStack("potion.poison.strong", 1),

        // Strong Regenerating Brew
        FluidRegistry.getFluidStack("potion.regen.strong", 1),

        // Strong Splash Harming Brew
        FluidRegistry.getFluidStack("potion.damage.strong.splash", 1),

        // Strong Splash Healing Brew
        FluidRegistry.getFluidStack("potion.health.strong.splash", 1),

        // Strong Splash Poisonous Brew
        FluidRegistry.getFluidStack("potion.poison.strong.splash", 1),

        // Strong Splash Regenerating Brew
        FluidRegistry.getFluidStack("potion.regen.strong.splash", 1),

        // Strong Splash Strength Brew
        FluidRegistry.getFluidStack("potion.strength.strong.splash", 1),

        // Strong Splash Swiftness Brew
        FluidRegistry.getFluidStack("potion.speed.strong.splash", 1),

        // Strong Strength Brew
        FluidRegistry.getFluidStack("potion.strength.strong", 1),

        // Strong Swiftness Brew
        FluidRegistry.getFluidStack("potion.speed.strong", 1),

        // Strontio Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousstrontioessentia", 1),

        // Strontium Plasma
        FluidRegistry.getFluidStack("plasma.strontium", 1),

        // Styrene
        FluidRegistry.getFluidStack("styrene", 1),

        // Subatomically Perfect Water (Grade 8)
        FluidRegistry.getFluidStack("grade8purifiedwater", 1),

        // Sugar Whine
        FluidRegistry.getFluidStack("potion.swhine", 1),

        // Sulfur Dichloride
        FluidRegistry.getFluidStack("sulfurdichloride", 1),

        // Sulfur Dioxide
        FluidRegistry.getFluidStack("sulfurdioxide", 1),

        // Sulfur Plasma
        FluidRegistry.getFluidStack("plasma.sulfur", 1),

        // Sulfur Trioxide
        FluidRegistry.getFluidStack("sulfurtrioxide", 1),

        // Sulfuric Acid
        FluidRegistry.getFluidStack("sulfuricacid", 1),

        // Sulfuric Apatite Mix
        FluidRegistry.getFluidStack("sulfuricapatite", 1),

        // Sulfuric Coal Tar Oil
        FluidRegistry.getFluidStack("fluid.sulfuriccoaltaroil", 1),

        // Sulfuric Gas
        FluidRegistry.getFluidStack("gas_sulfuricgas", 1),

        // Sulfuric Heavy Fuel
        FluidRegistry.getFluidStack("liquid_sulfuricheavy_fuel", 1),

        // Sulfuric Light Fuel
        FluidRegistry.getFluidStack("liquid_sufluriclight_fuel", 1),

        // Sulfuric Lithium Mix
        FluidRegistry.getFluidStack("sulfuriclithium", 1),

        // Sulfuric Naphtha
        FluidRegistry.getFluidStack("liquid_sulfuricnaphtha", 1),

        // Sulfurous Acid
        FluidRegistry.getFluidStack("sulfurousacid", 1),

        // Super Coolant
        FluidRegistry.getFluidStack("supercoolant", 1),

        // Super Heavy Radox
        FluidRegistry.getFluidStack("superheavyradox", 1),

        // Super Light Radox
        FluidRegistry.getFluidStack("superlightradox", 1),

        // Superbia Super Critical Fluid
        FluidRegistry.getFluidStack("gaseoussuperbiaessentia", 1),

        // Supercritical Steam
        FluidRegistry.getFluidStack("supercriticalsteam", 1),

        // Superheated Steam
        FluidRegistry.getFluidStack("ic2superheatedsteam", 1),

        // Sweet Coffee
        FluidRegistry.getFluidStack("potion.sweetcoffee", 1),

        // Sweet Jesus Latte
        FluidRegistry.getFluidStack("potion.sweetjesuslatte", 1),

        // Sweet Latte
        FluidRegistry.getFluidStack("potion.sweetlatte", 1),

        // Sweet Tea
        FluidRegistry.getFluidStack("potion.sweettea", 1),

        // Swiftness Brew
        FluidRegistry.getFluidStack("potion.speed", 1),

        // Tabernus Super Critical Fluid
        FluidRegistry.getFluidStack("gaseoustabernusessentia", 1),

        // Tachyon Rich Temporal Fluid
        FluidRegistry.getFluidStack("temporalfluid", 1),

        // Tantalum Plasma
        FluidRegistry.getFluidStack("plasma.tantalum", 1),

        // Tea
        FluidRegistry.getFluidStack("potion.tea", 1),

        // Technetium Hexafluoride
        FluidRegistry.getFluidStack("technetiumhexafluoride", 1),

        // Technetium Plasma
        FluidRegistry.getFluidStack("plasma.technetium", 1),

        // Tellurium Plasma
        FluidRegistry.getFluidStack("plasma.tellurium", 1),

        // Telum Super Critical Fluid
        FluidRegistry.getFluidStack("gaseoustelumessentia", 1),

        // Tempestas Super Critical Fluid
        FluidRegistry.getFluidStack("gaseoustempestasessentia", 1),

        // Tempus Super Critical Fluid
        FluidRegistry.getFluidStack("gaseoustempusessentia", 1),

        // Tenebrae Super Critical Fluid
        FluidRegistry.getFluidStack("gaseoustenebraeessentia", 1),

        // Terbium Chloride Concentrate
        FluidRegistry.getFluidStack("terbium chloride concentrate", 1),

        // Terbium Extracting Nano Resin
        FluidRegistry.getFluidStack("terbium extracting nano resin", 1),

        // Terbium Plasma
        FluidRegistry.getFluidStack("plasma.terbium", 1),

        // Terephthalic Acid
        FluidRegistry.getFluidStack("terephthalicacid", 1),

        // Terminus Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousterminusessentia", 1),

        // Terra Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousterraessentia", 1),

        // Tetrafluoroethylene
        FluidRegistry.getFluidStack("tetrafluoroethylene", 1),

        // Tetrahydrofuran
        FluidRegistry.getFluidStack("tetrahydrofuran", 1),

        // Tetranitromethane
        FluidRegistry.getFluidStack("tetranitromethane", 1),

        // Thallium Plasma
        FluidRegistry.getFluidStack("plasma.thallium", 1),

        // Thick Brew
        FluidRegistry.getFluidStack("potion.thick", 1),

        // Thionyl Chloride
        FluidRegistry.getFluidStack("thionylchloride", 1),

        // Thorium 232 Plasma
        FluidRegistry.getFluidStack("plasma.thorium232", 1),

        // Thorium Based Liquid Fuel
        FluidRegistry.getFluidStack("thorium based liquid fuel", 1),

        // Thorium Based Liquid Fuel (Depleted)
        FluidRegistry.getFluidStack("thorium based liquid fuel (depleted)", 1),

        // Thorium Based Liquid Fuel (Excited State)
        FluidRegistry.getFluidStack("thorium based liquid fuel (excited state)", 1),

        // Thorium Depleted Molten Salt (T Salt)
        FluidRegistry.getFluidStack("molten.thoriumdepletedmoltensalttsalt", 1),

        // Thorium Hexafluoride
        FluidRegistry.getFluidStack("molten.thoriumhexafluoride", 1),

        // Thorium Nitrate
        FluidRegistry.getFluidStack("thorium nitrate", 1),

        // Thorium Plasma
        FluidRegistry.getFluidStack("plasma.thorium", 1),

        // Thorium Tetrachloride
        FluidRegistry.getFluidStack("thorium tetrachloride", 1),

        // Thorium Tetrafluoride
        FluidRegistry.getFluidStack("thorium tetrafluoride", 1),

        // Thorium Tetrafluoride
        FluidRegistry.getFluidStack("molten.thoriumtetrafluoride", 1),

        // Thorium-232 Tetrafluoride
        FluidRegistry.getFluidStack("thorium-232 tetrafluoride", 1),

        // Thorium-Beryllium Depleted Molten Salt (TB Salt)
        FluidRegistry.getFluidStack("molten.thoriumberylliumdepletedmoltensalttbsalt", 1),

        // Thulium Chloride Concentrate
        FluidRegistry.getFluidStack("thulium chloride concentrate", 1),

        // Thulium Extracting Nano Resin
        FluidRegistry.getFluidStack("thulium extracting nano resin", 1),

        // Thulium Plasma
        FluidRegistry.getFluidStack("plasma.thulium", 1),

        // Tin Plasma
        FluidRegistry.getFluidStack("plasma.tin", 1),

        // Titanium Plasma
        FluidRegistry.getFluidStack("plasma.titanium", 1),

        // Titaniumtetrachloride
        FluidRegistry.getFluidStack("titaniumtetrachloride", 1),

        // Toluene
        FluidRegistry.getFluidStack("liquid_toluene", 1),

        // Toluene Diisocyanate
        FluidRegistry.getFluidStack("toluene diisocyanate", 1),

        // Toluene Tetramethyl Diisocyanate
        FluidRegistry.getFluidStack("toluene tetramethyl diisocyanate", 1),

        // Trichloroacetic Acid
        FluidRegistry.getFluidStack("molten.trichloroaceticacid", 1),

        // Trichlorosilane
        FluidRegistry.getFluidStack("trichlorosilane", 1),

        // NEI Page 17/18
        // Trimethyl Borate
        FluidRegistry.getFluidStack("trimethylborate", 1),

        // Trimethylamine
        FluidRegistry.getFluidStack("trimethylamine", 1),

        // Tritanium Plasma
        FluidRegistry.getFluidStack("plasma.tritanium", 1),

        // Tritium
        FluidRegistry.getFluidStack("tritium", 1),

        // Tritium Plasma
        FluidRegistry.getFluidStack("plasma.tritium", 1),

        // Tungsten Plasma
        FluidRegistry.getFluidStack("plasma.tungsten", 1),

        // Tungstophosphoric Acid
        FluidRegistry.getFluidStack("tungstophosphoric acid", 1),

        // Tutamen Super Critical Fluid
        FluidRegistry.getFluidStack("gaseoustutamenessentia", 1),

        // UN-18 Fertiliser
        FluidRegistry.getFluidStack("fluid.un18fertiliser", 1),

        // UN-32 Fertiliser
        FluidRegistry.getFluidStack("fluid.un32fertiliser", 1),

        // UU Amplifier
        FluidRegistry.getFluidStack("uuamplifier", 1),

        // UU-Matter
        FluidRegistry.getFluidStack("ic2uumatter", 1),

        // Ultraviolet Treated Electrically Neutral Water (Grade 6)
        FluidRegistry.getFluidStack("grade6purifiedwater", 1),

        // Unformed Fluorophlogopite
        FluidRegistry.getFluidStack("unformed fluorophlogopite", 1),

        // Unknown Liquid
        FluidRegistry.getFluidStack("unknowwater", 1),

        // Unknown Nutrient Agar
        FluidRegistry.getFluidStack("unknownnutrientagar", 1),

        // Uranium 232 Plasma
        FluidRegistry.getFluidStack("plasma.uranium232", 1),

        // Uranium 233 Plasma
        FluidRegistry.getFluidStack("plasma.uranium233", 1),

        // Uranium 235 Plasma
        FluidRegistry.getFluidStack("plasma.uranium235", 1),

        // Uranium 238 Plasma
        FluidRegistry.getFluidStack("plasma.uranium", 1),

        // Uranium Based Liquid Fuel
        FluidRegistry.getFluidStack("uranium based liquid fuel", 1),

        // Uranium Based Liquid Fuel (Depleted)
        FluidRegistry.getFluidStack("uranium based liquid fuel (depleted)", 1),

        // Uranium Based Liquid Fuel (Excited State)
        FluidRegistry.getFluidStack("uranium based liquid fuel (excited state)", 1),

        // Uranium Depleted Molten Salt (U Salt)
        FluidRegistry.getFluidStack("molten.uraniumdepletedmoltensaltusalt", 1),

        // Uranium Hexafluoride
        FluidRegistry.getFluidStack("molten.uraniumhexafluoride", 1),

        // Uranium Tetrafluoride
        FluidRegistry.getFluidStack("molten.uraniumtetrafluoride", 1),

        // Urea Mix
        FluidRegistry.getFluidStack("ureamix", 1),

        // Vacuos Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousvacuosessentia", 1),

        // Vanadium Plasma
        FluidRegistry.getFluidStack("plasma.vanadium", 1),

        // Vapor of Levity
        FluidRegistry.getFluidStack("vapor_of_levity", 1),

        // Venenum Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousvenenumessentia", 1),

        // Very Heavy Oil
        FluidRegistry.getFluidStack("liquid_extra_heavy_oil", 1),

        // Vesania Super Critical Fluid
        FluidRegistry.getFluidStack("gaseouscustom2essentia", 1),

        // Victus Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousvictusessentia", 1),

        // Vinculum Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousvinculumessentia", 1),

        // Vinegar
        FluidRegistry.getFluidStack("potion.vinegar", 1),

        // Vinyl Acetate
        FluidRegistry.getFluidStack("vinylacetate", 1),

        // Vinyl Chloride
        FluidRegistry.getFluidStack("vinylchloride", 1),

        // Vishroom Soup
        FluidRegistry.getFluidStack("fluidvishroom", 1),

        // Vitium Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousvitiumessentia", 1),

        // Vitreus Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousvitreusessentia", 1),

        // Vodka
        FluidRegistry.getFluidStack("potion.vodka", 1),

        // Volatus Super Critical Fluid
        FluidRegistry.getFluidStack("gaseousvolatusessentia", 1),

        // Wash
        FluidRegistry.getFluidStack("potion.wash", 1),

        // Waste Liquid
        FluidRegistry.getFluidStack("waste liquid", 1),

        // Water Mixed Black Dye
        FluidRegistry.getFluidStack("dye.watermixed.dyeblack", 1),

        // Water Mixed Blue Dye
        FluidRegistry.getFluidStack("dye.watermixed.dyeblue", 1),

        // Water Mixed Brown Dye
        FluidRegistry.getFluidStack("dye.watermixed.dyebrown", 1),

        // Water Mixed Cyan Dye
        FluidRegistry.getFluidStack("dye.watermixed.dyecyan", 1),

        // Water Mixed Gray Dye
        FluidRegistry.getFluidStack("dye.watermixed.dyegray", 1),

        // Water Mixed Green Dye
        FluidRegistry.getFluidStack("dye.watermixed.dyegreen", 1),

        // Water Mixed Light Blue Dye
        FluidRegistry.getFluidStack("dye.watermixed.dyelightblue", 1),

        // Water Mixed Light Gray Dye
        FluidRegistry.getFluidStack("dye.watermixed.dyelightgray", 1),

        // Water Mixed Lime Dye
        FluidRegistry.getFluidStack("dye.watermixed.dyelime", 1),

        // Water Mixed Magenta Dye
        FluidRegistry.getFluidStack("dye.watermixed.dyemagenta", 1),

        // Water Mixed Orange Dye
        FluidRegistry.getFluidStack("dye.watermixed.dyeorange", 1),

        // Water Mixed Pink Dye
        FluidRegistry.getFluidStack("dye.watermixed.dyepink", 1),

        // Water Mixed Purple Dye
        FluidRegistry.getFluidStack("dye.watermixed.dyepurple", 1),

        // Water Mixed Red Dye
        FluidRegistry.getFluidStack("dye.watermixed.dyered", 1),

        // Water Mixed White Dye
        FluidRegistry.getFluidStack("dye.watermixed.dyewhite", 1),

        // Water Mixed Yellow Dye
        FluidRegistry.getFluidStack("dye.watermixed.dyeyellow", 1),

        // Weakening Brew
        FluidRegistry.getFluidStack("potion.weakness", 1),

        // Weed-EX 9000
        FluidRegistry.getFluidStack("weedex9000", 1),

        // Wet Concrete
        FluidRegistry.getFluidStack("wet.concrete", 1),

        // Wheaty Hops Juice
        FluidRegistry.getFluidStack("potion.wheatyhopsjuice", 1),

        // Wheaty Juice
        FluidRegistry.getFluidStack("potion.wheatyjuice", 1),

        // Whine Yeast Fluid
        FluidRegistry.getFluidStack("saccharomycescerevisiaevarbayanusfluid", 1),

        // Wine
        FluidRegistry.getFluidStack("potion.wine", 1),

        // Wood Gas
        FluidRegistry.getFluidStack("woodgas", 1),

        // Wood Tar
        FluidRegistry.getFluidStack("woodtar", 1),

        // Wood Vinegar
        FluidRegistry.getFluidStack("woodvinegar", 1),

        // Xenon
        FluidRegistry.getFluidStack("xenon", 1),

        // Xenon Plasma
        FluidRegistry.getFluidStack("plasma.xenon", 1),

        // Xenoxene
        FluidRegistry.getFluidStack("xenoxene", 1),

        // Ytterbium Chloride Concentrate
        FluidRegistry.getFluidStack("ytterbium chloride concentrate", 1),

        // Ytterbium Extracting Nano Resin
        FluidRegistry.getFluidStack("ytterbium extracting nano resin", 1),

        // Ytterbium Plasma
        FluidRegistry.getFluidStack("plasma.ytterbium", 1),

        // Yttrium Plasma
        FluidRegistry.getFluidStack("plasma.yttrium", 1),

        // Zinc Plasma
        FluidRegistry.getFluidStack("plasma.zinc", 1),

        // Zirconium Plasma
        FluidRegistry.getFluidStack("plasma.zirconium", 1),

        // Zirconium Tetrachloride Solution
        FluidRegistry.getFluidStack("zirconium tetrachloride solution", 1),

        // Zirconium Tetrafluoride
        FluidRegistry.getFluidStack("zirconiumtetrafluoride", 1),

        // barnadafisarboriatorisfluid
        FluidRegistry.getFluidStack("barnadafisarboriatorisfluid", 1),

        // binnibacteriafluid
        FluidRegistry.getFluidStack("binnibacteriafluid", 1),

        // eColi Bacteria Fluid
        FluidRegistry.getFluidStack("escherichiakolifluid", 1),

        // fluid.LifeEssence
        FluidRegistry.getFluidStack("lifeessence", 1),

        // fluid.acid
        FluidRegistry.getFluidStack("acid", 1),

        // fluid.latex
        FluidRegistry.getFluidStack("latex", 1),

        // fluid.resin
        FluidRegistry.getFluidStack("resin", 1),

        // fluid.sap
        FluidRegistry.getFluidStack("sap", 1),

        // NEI Page 18/18
        // fluid.turpentine
        FluidRegistry.getFluidStack("turpentine", 1),

        // fluidBlockSludge
        FluidRegistry.getFluidStack("fluid.sludge", 1),

        // fuelgc
        FluidRegistry.getFluidStack("fuelgc", 1),

        // gamma-Butyrolactone
        FluidRegistry.getFluidStack("gammabutyrolactone", 1),

        // oilgc
        FluidRegistry.getFluidStack("oilgc", 1),

        // pH Neutralized Water (Grade 4)
        FluidRegistry.getFluidStack("grade4purifiedwater", 1),

        // redplasma
        FluidRegistry.getFluidStack("redplasma", 1),

        // sludge
        FluidRegistry.getFluidStack("sludge", 1),

        // tcetieisfucusserratusfluid
        FluidRegistry.getFluidStack("tcetieisfucusserratusfluid", 1) };

    public static final FluidStack[] T10_Fluid_Result = checkFluidStack(T10_Fluid);

    public static void addVoidFluidRecipes_T10() {
        VoidFluidRecipes_T10.put("DD", T10_Fluid_Result);
    }

    public static void addFakeVoidFluidRecipes_T10() {
        // T10 - DeepDark - DD
        FluidStack[][] Fake_T10_DeepDark_Fluid_Split = addSplitAggregateArray(T10_Fluid_Result, NEI_ItemOutput_Size);
        for (FluidStack[] tempFluidStacks : Fake_T10_DeepDark_Fluid_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(NEIOrePlugin.ID, "blockDimensionDisplay_DD", 1L))
                .fluidOutputs(tempFluidStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Singularity with Void Fluid Mode")
                .eut(0)
                .addTo(addFakeVoidFluidRecipes_T10);
        }
    }
}
