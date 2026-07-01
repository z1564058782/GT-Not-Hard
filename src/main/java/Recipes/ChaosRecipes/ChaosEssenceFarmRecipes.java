package Recipes.ChaosRecipes;

import static gregtech.api.enums.Mods.GregTech;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.enums.TierEU.RECIPE_LV;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;
import static util.Utils.setStackSize;

import EnumList.EnumItemList.EnumMagicList.EssenceList;
import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import gregtech.api.util.GTUtility;
import util.RecipesFrontend.EssenceFarmOfChaosFrontend;

public class ChaosEssenceFarmRecipes {

    public static final RecipeMap<RecipeMapBackend> addEssenceFarmRecipes = RecipeMapBuilder.of("Chaos of Essence Farm")
        .maxIO(2, 25, 0, 0)
        .minInputs(2, 0)
        .neiHandlerInfo(builder -> builder.setHeight(148))
        .frontend(EssenceFarmOfChaosFrontend::new)
        .neiTransferRect(48, 46, 20, 16)
        .build();

    public static void addEssenceFarmRecipes_test() {
        // test_1
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(Minecraft.ID, "brewing_stand", 1L), GTUtility.getIntegratedCircuit(1))
            .itemOutputs(
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addEssenceFarmRecipes);

        // test_2
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(Minecraft.ID, "brewing_stand", 1L), GTUtility.getIntegratedCircuit(2))
            .itemOutputs(
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L),
                getModItem(Minecraft.ID, "brewing_stand", 1L))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addEssenceFarmRecipes);
    }

    public static void addEssenceFarmRecipes() {
        // Phial_of_Essentia_1
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(Minecraft.ID, "quartz_block", 16L, 0), GTUtility.getIntegratedCircuit(1))
            .itemOutputs(
                setStackSize(EssenceList.Phial_of_Essentia_Aer, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Terra, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Ignis, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Aqua, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Ordo, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Perditio, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Vacuos, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Lux, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Tempestas, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Motus, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Gelum, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Vitreus, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Victus, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Venenum, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Potentia, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Permutatio, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Metallum, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Mortuus, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Volatus, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Tenebrae, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Spiritus, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Sano, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Iter, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addEssenceFarmRecipes);

        // Phial_of_Essentia_2
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(Minecraft.ID, "quartz_block", 16L, 0), GTUtility.getIntegratedCircuit(2))
            .itemOutputs(
                setStackSize(EssenceList.Phial_of_Essentia_Alienis, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Praecantatio, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Auram, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Vitium, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Limus, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Herba, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Arbor, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Bestia, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Corpus, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Exanimis, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Cognitio, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Sensus, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Humanus, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Messis, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Perfodio, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Instrumentum, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Meto, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Telum, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Tutamen, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Fames, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Lucrum, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Fabrico, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Pannus, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addEssenceFarmRecipes);

        // Phial_of_Essentia_3
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(Minecraft.ID, "quartz_block", 16L, 0), GTUtility.getIntegratedCircuit(3))
            .itemOutputs(
                setStackSize(EssenceList.Phial_of_Essentia_Machina, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Vinculum, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Strontio, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Nebrisum, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Electrum, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Magneto, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Radio, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Aequalitas, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Vesania, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Primordium, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Astrum, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Gloria, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Terminus, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Luxuria, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Infernus, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Superbia, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Gula, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Invidia, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Desidia, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Ira, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Tempus, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Caelum, 1),
                setStackSize(EssenceList.Phial_of_Essentia_Tabernus, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addEssenceFarmRecipes);

        // Ethereal_Essence_1
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(Minecraft.ID, "quartz", 16L), GTUtility.getIntegratedCircuit(1))
            .itemOutputs(
                setStackSize(EssenceList.Ethereal_Essence_Aer, 1),
                setStackSize(EssenceList.Ethereal_Essence_Terra, 1),
                setStackSize(EssenceList.Ethereal_Essence_Ignis, 1),
                setStackSize(EssenceList.Ethereal_Essence_Aqua, 1),
                setStackSize(EssenceList.Ethereal_Essence_Ordo, 1),
                setStackSize(EssenceList.Ethereal_Essence_Perditio, 1),
                setStackSize(EssenceList.Ethereal_Essence_Vacuos, 1),
                setStackSize(EssenceList.Ethereal_Essence_Lux, 1),
                setStackSize(EssenceList.Ethereal_Essence_Tempestas, 1),
                setStackSize(EssenceList.Ethereal_Essence_Motus, 1),
                setStackSize(EssenceList.Ethereal_Essence_Gelum, 1),
                setStackSize(EssenceList.Ethereal_Essence_Vitreus, 1),
                setStackSize(EssenceList.Ethereal_Essence_Victus, 1),
                setStackSize(EssenceList.Ethereal_Essence_Venenum, 1),
                setStackSize(EssenceList.Ethereal_Essence_Potentia, 1),
                setStackSize(EssenceList.Ethereal_Essence_Permutatio, 1),
                setStackSize(EssenceList.Ethereal_Essence_Metallum, 1),
                setStackSize(EssenceList.Ethereal_Essence_Mortuus, 1),
                setStackSize(EssenceList.Ethereal_Essence_Volatus, 1),
                setStackSize(EssenceList.Ethereal_Essence_Tenebrae, 1),
                setStackSize(EssenceList.Ethereal_Essence_Spiritus, 1),
                setStackSize(EssenceList.Ethereal_Essence_Sano, 1),
                setStackSize(EssenceList.Ethereal_Essence_Iter, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addEssenceFarmRecipes);

        // Ethereal_Essence_2
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(Minecraft.ID, "quartz", 16L), GTUtility.getIntegratedCircuit(2))
            .itemOutputs(
                setStackSize(EssenceList.Ethereal_Essence_Alienis, 1),
                setStackSize(EssenceList.Ethereal_Essence_Praecantatio, 1),
                setStackSize(EssenceList.Ethereal_Essence_Auram, 1),
                setStackSize(EssenceList.Ethereal_Essence_Vitium, 1),
                setStackSize(EssenceList.Ethereal_Essence_Limus, 1),
                setStackSize(EssenceList.Ethereal_Essence_Herba, 1),
                setStackSize(EssenceList.Ethereal_Essence_Arbor, 1),
                setStackSize(EssenceList.Ethereal_Essence_Bestia, 1),
                setStackSize(EssenceList.Ethereal_Essence_Corpus, 1),
                setStackSize(EssenceList.Ethereal_Essence_Exanimis, 1),
                setStackSize(EssenceList.Ethereal_Essence_Cognitio, 1),
                setStackSize(EssenceList.Ethereal_Essence_Sensus, 1),
                setStackSize(EssenceList.Ethereal_Essence_Humanus, 1),
                setStackSize(EssenceList.Ethereal_Essence_Messis, 1),
                setStackSize(EssenceList.Ethereal_Essence_Perfodio, 1),
                setStackSize(EssenceList.Ethereal_Essence_Instrumentum, 1),
                setStackSize(EssenceList.Ethereal_Essence_Meto, 1),
                setStackSize(EssenceList.Ethereal_Essence_Telum, 1),
                setStackSize(EssenceList.Ethereal_Essence_Tutamen, 1),
                setStackSize(EssenceList.Ethereal_Essence_Fames, 1),
                setStackSize(EssenceList.Ethereal_Essence_Lucrum, 1),
                setStackSize(EssenceList.Ethereal_Essence_Fabrico, 1),
                setStackSize(EssenceList.Ethereal_Essence_Pannus, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addEssenceFarmRecipes);

        // Ethereal_Essence_3
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(Minecraft.ID, "quartz", 16L), GTUtility.getIntegratedCircuit(3))
            .itemOutputs(
                setStackSize(EssenceList.Ethereal_Essence_Machina, 1),
                setStackSize(EssenceList.Ethereal_Essence_Vinculum, 1),
                setStackSize(EssenceList.Ethereal_Essence_Strontio, 1),
                setStackSize(EssenceList.Ethereal_Essence_Nebrisum, 1),
                setStackSize(EssenceList.Ethereal_Essence_Electrum, 1),
                setStackSize(EssenceList.Ethereal_Essence_Magneto, 1),
                setStackSize(EssenceList.Ethereal_Essence_Radio, 1),
                setStackSize(EssenceList.Ethereal_Essence_Aequalitas, 1),
                setStackSize(EssenceList.Ethereal_Essence_Vesania, 1),
                setStackSize(EssenceList.Ethereal_Essence_Primordium, 1),
                setStackSize(EssenceList.Ethereal_Essence_Astrum, 1),
                setStackSize(EssenceList.Ethereal_Essence_Gloria, 1),
                setStackSize(EssenceList.Ethereal_Essence_Terminus, 1),
                setStackSize(EssenceList.Ethereal_Essence_Luxuria, 1),
                setStackSize(EssenceList.Ethereal_Essence_Infernus, 1),
                setStackSize(EssenceList.Ethereal_Essence_Superbia, 1),
                setStackSize(EssenceList.Ethereal_Essence_Gula, 1),
                setStackSize(EssenceList.Ethereal_Essence_Invidia, 1),
                setStackSize(EssenceList.Ethereal_Essence_Desidia, 1),
                setStackSize(EssenceList.Ethereal_Essence_Ira, 1),
                setStackSize(EssenceList.Ethereal_Essence_Tempus, 1),
                setStackSize(EssenceList.Ethereal_Essence_Caelum, 1),
                setStackSize(EssenceList.Ethereal_Essence_Tabernus, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addEssenceFarmRecipes);

        // Crystallized_Essence_1
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 16L, 2522), GTUtility.getIntegratedCircuit(1))
            .itemOutputs(
                setStackSize(EssenceList.Crystallized_Essence_Aer, 1),
                setStackSize(EssenceList.Crystallized_Essence_Terra, 1),
                setStackSize(EssenceList.Crystallized_Essence_Ignis, 1),
                setStackSize(EssenceList.Crystallized_Essence_Aqua, 1),
                setStackSize(EssenceList.Crystallized_Essence_Ordo, 1),
                setStackSize(EssenceList.Crystallized_Essence_Perditio, 1),
                setStackSize(EssenceList.Crystallized_Essence_Vacuos, 1),
                setStackSize(EssenceList.Crystallized_Essence_Lux, 1),
                setStackSize(EssenceList.Crystallized_Essence_Tempestas, 1),
                setStackSize(EssenceList.Crystallized_Essence_Motus, 1),
                setStackSize(EssenceList.Crystallized_Essence_Gelum, 1),
                setStackSize(EssenceList.Crystallized_Essence_Vitreus, 1),
                setStackSize(EssenceList.Crystallized_Essence_Victus, 1),
                setStackSize(EssenceList.Crystallized_Essence_Venenum, 1),
                setStackSize(EssenceList.Crystallized_Essence_Potentia, 1),
                setStackSize(EssenceList.Crystallized_Essence_Permutatio, 1),
                setStackSize(EssenceList.Crystallized_Essence_Metallum, 1),
                setStackSize(EssenceList.Crystallized_Essence_Mortuus, 1),
                setStackSize(EssenceList.Crystallized_Essence_Volatus, 1),
                setStackSize(EssenceList.Crystallized_Essence_Tenebrae, 1),
                setStackSize(EssenceList.Crystallized_Essence_Spiritus, 1),
                setStackSize(EssenceList.Crystallized_Essence_Sano, 1),
                setStackSize(EssenceList.Crystallized_Essence_Iter, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addEssenceFarmRecipes);

        // Crystallized_Essence_2
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 16L, 2522), GTUtility.getIntegratedCircuit(2))
            .itemOutputs(
                setStackSize(EssenceList.Crystallized_Essence_Alienis, 1),
                setStackSize(EssenceList.Crystallized_Essence_Praecantatio, 1),
                setStackSize(EssenceList.Crystallized_Essence_Auram, 1),
                setStackSize(EssenceList.Crystallized_Essence_Vitium, 1),
                setStackSize(EssenceList.Crystallized_Essence_Limus, 1),
                setStackSize(EssenceList.Crystallized_Essence_Herba, 1),
                setStackSize(EssenceList.Crystallized_Essence_Arbor, 1),
                setStackSize(EssenceList.Crystallized_Essence_Bestia, 1),
                setStackSize(EssenceList.Crystallized_Essence_Corpus, 1),
                setStackSize(EssenceList.Crystallized_Essence_Exanimis, 1),
                setStackSize(EssenceList.Crystallized_Essence_Cognitio, 1),
                setStackSize(EssenceList.Crystallized_Essence_Sensus, 1),
                setStackSize(EssenceList.Crystallized_Essence_Humanus, 1),
                setStackSize(EssenceList.Crystallized_Essence_Messis, 1),
                setStackSize(EssenceList.Crystallized_Essence_Perfodio, 1),
                setStackSize(EssenceList.Crystallized_Essence_Instrumentum, 1),
                setStackSize(EssenceList.Crystallized_Essence_Meto, 1),
                setStackSize(EssenceList.Crystallized_Essence_Telum, 1),
                setStackSize(EssenceList.Crystallized_Essence_Tutamen, 1),
                setStackSize(EssenceList.Crystallized_Essence_Fames, 1),
                setStackSize(EssenceList.Crystallized_Essence_Lucrum, 1),
                setStackSize(EssenceList.Crystallized_Essence_Fabrico, 1),
                setStackSize(EssenceList.Crystallized_Essence_Pannus, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addEssenceFarmRecipes);

        // Crystallized_Essence_3
        GTValues.RA.stdBuilder()
            .itemInputs(getModItem(GregTech.ID, "gt.metaitem.01", 16L, 2522), GTUtility.getIntegratedCircuit(3))
            .itemOutputs(
                setStackSize(EssenceList.Crystallized_Essence_Machina, 1),
                setStackSize(EssenceList.Crystallized_Essence_Vinculum, 1),
                setStackSize(EssenceList.Crystallized_Essence_Strontio, 1),
                setStackSize(EssenceList.Crystallized_Essence_Nebrisum, 1),
                setStackSize(EssenceList.Crystallized_Essence_Electrum, 1),
                setStackSize(EssenceList.Crystallized_Essence_Magneto, 1),
                setStackSize(EssenceList.Crystallized_Essence_Radio, 1),
                setStackSize(EssenceList.Crystallized_Essence_Aequalitas, 1),
                setStackSize(EssenceList.Crystallized_Essence_Vesania, 1),
                setStackSize(EssenceList.Crystallized_Essence_Primordium, 1),
                setStackSize(EssenceList.Crystallized_Essence_Astrum, 1),
                setStackSize(EssenceList.Crystallized_Essence_Gloria, 1),
                setStackSize(EssenceList.Crystallized_Essence_Terminus, 1),
                setStackSize(EssenceList.Crystallized_Essence_Luxuria, 1),
                setStackSize(EssenceList.Crystallized_Essence_Infernus, 1),
                setStackSize(EssenceList.Crystallized_Essence_Superbia, 1),
                setStackSize(EssenceList.Crystallized_Essence_Gula, 1),
                setStackSize(EssenceList.Crystallized_Essence_Invidia, 1),
                setStackSize(EssenceList.Crystallized_Essence_Desidia, 1),
                setStackSize(EssenceList.Crystallized_Essence_Ira, 1),
                setStackSize(EssenceList.Crystallized_Essence_Tempus, 1),
                setStackSize(EssenceList.Crystallized_Essence_Caelum, 1),
                setStackSize(EssenceList.Crystallized_Essence_Tabernus, 1))
            .duration(SECONDS)
            .eut(RECIPE_LV)
            .addTo(addEssenceFarmRecipes);
    }
}
