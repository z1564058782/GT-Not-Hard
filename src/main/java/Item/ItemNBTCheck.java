package Item;

import static Item.GTItemNBT.GregTech_gt_metaitem_01;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;
import static util.AggregateItemStackArray.addSplitAggregateArray;
import static util.Utils.setStackSize;

import net.minecraft.item.ItemStack;

import gregtech.api.enums.GTValues;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBackend;
import gregtech.api.recipe.RecipeMapBuilder;
import util.RecipesFrontend.OneToManyItemsFrontend_Large;

public class ItemNBTCheck {

    public static int NEI_ItemOutput_Size = 90;

    public static final RecipeMap<RecipeMapBackend> addItemNBTCheckRecipes = RecipeMapBuilder.of("Item NBT Check")
        .maxIO(1, NEI_ItemOutput_Size, 0, 0)
        .minInputs(1, 0)
        .neiHandlerInfo(builder -> builder.setHeight(335))
        .frontend(OneToManyItemsFrontend_Large::new)
        .build();

    public static void addItemNBTCheckRecipes() {

        // GregTech:gt.metaitem.01
        ItemStack[][] Fake_GregTech_gt_metaitem_01_Split = addSplitAggregateArray(
            GregTech_gt_metaitem_01,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_GregTech_gt_metaitem_01_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item NBT Check")
                .eut(0)
                .addTo(addItemNBTCheckRecipes);
        }

        // Thaumcraft:ItemEssence
        ItemStack[] Fake_Thaumcraft_ItemEssence = new ItemStack[] { setStackSize(MagicItemNBT.Phial_of_Essentia_Aer, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Terra, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Ignis, 1), setStackSize(MagicItemNBT.Phial_of_Essentia_Aqua, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Ordo, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Perditio, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Vacuos, 1), setStackSize(MagicItemNBT.Phial_of_Essentia_Lux, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Tempestas, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Motus, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Gelum, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Vitreus, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Victus, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Venenum, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Potentia, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Permutatio, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Metallum, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Mortuus, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Volatus, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Tenebrae, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Spiritus, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Sano, 1), setStackSize(MagicItemNBT.Phial_of_Essentia_Iter, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Alienis, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Praecantatio, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Auram, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Vitium, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Limus, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Herba, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Arbor, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Bestia, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Corpus, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Exanimis, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Cognitio, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Sensus, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Humanus, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Messis, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Perfodio, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Instrumentum, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Meto, 1), setStackSize(MagicItemNBT.Phial_of_Essentia_Telum, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Tutamen, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Fames, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Lucrum, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Fabrico, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Pannus, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Machina, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Vinculum, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Strontio, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Nebrisum, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Electrum, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Magneto, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Radio, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Aequalitas, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Vesania, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Primordium, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Astrum, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Gloria, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Terminus, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Luxuria, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Infernus, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Superbia, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Gula, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Invidia, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Desidia, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Ira, 1), setStackSize(MagicItemNBT.Phial_of_Essentia_Tempus, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Caelum, 1),
            setStackSize(MagicItemNBT.Phial_of_Essentia_Tabernus, 1) };
        ItemStack[][] Fake_Thaumcraft_ItemEssence_Split = addSplitAggregateArray(
            Fake_Thaumcraft_ItemEssence,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_Thaumcraft_ItemEssence_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item NBT Check")
                .eut(0)
                .addTo(addItemNBTCheckRecipes);
        }

        // Thaumcraft:ItemWispEssence
        ItemStack[] Fake_Thaumcraft_ItemWispEssence = new ItemStack[] {
            setStackSize(MagicItemNBT.Ethereal_Essence_Aer, 1), setStackSize(MagicItemNBT.Ethereal_Essence_Terra, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Ignis, 1), setStackSize(MagicItemNBT.Ethereal_Essence_Aqua, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Ordo, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Perditio, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Vacuos, 1), setStackSize(MagicItemNBT.Ethereal_Essence_Lux, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Tempestas, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Motus, 1), setStackSize(MagicItemNBT.Ethereal_Essence_Gelum, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Vitreus, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Victus, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Venenum, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Potentia, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Permutatio, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Metallum, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Mortuus, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Volatus, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Tenebrae, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Spiritus, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Sano, 1), setStackSize(MagicItemNBT.Ethereal_Essence_Iter, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Alienis, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Praecantatio, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Auram, 1), setStackSize(MagicItemNBT.Ethereal_Essence_Vitium, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Limus, 1), setStackSize(MagicItemNBT.Ethereal_Essence_Herba, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Arbor, 1), setStackSize(MagicItemNBT.Ethereal_Essence_Bestia, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Corpus, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Exanimis, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Cognitio, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Sensus, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Humanus, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Messis, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Perfodio, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Instrumentum, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Meto, 1), setStackSize(MagicItemNBT.Ethereal_Essence_Telum, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Tutamen, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Fames, 1), setStackSize(MagicItemNBT.Ethereal_Essence_Lucrum, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Fabrico, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Pannus, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Machina, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Vinculum, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Strontio, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Nebrisum, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Electrum, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Magneto, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Radio, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Aequalitas, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Vesania, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Primordium, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Astrum, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Gloria, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Terminus, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Luxuria, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Infernus, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Superbia, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Gula, 1), setStackSize(MagicItemNBT.Ethereal_Essence_Invidia, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Desidia, 1), setStackSize(MagicItemNBT.Ethereal_Essence_Ira, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Tempus, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Caelum, 1),
            setStackSize(MagicItemNBT.Ethereal_Essence_Tabernus, 1) };
        ItemStack[][] Fake_Thaumcraft_ItemWispEssence_Split = addSplitAggregateArray(
            Fake_Thaumcraft_ItemWispEssence,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_Thaumcraft_ItemWispEssence_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item NBT Check")
                .eut(0)
                .addTo(addItemNBTCheckRecipes);
        }

        // Thaumcraft:ItemCrystalEssence
        ItemStack[] Fake_Thaumcraft_ItemCrystalEssence = new ItemStack[] {
            setStackSize(MagicItemNBT.Crystallized_Essence_Aer, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Terra, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Ignis, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Aqua, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Ordo, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Perditio, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Vacuos, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Lux, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Tempestas, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Motus, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Gelum, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Vitreus, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Victus, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Venenum, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Potentia, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Permutatio, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Metallum, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Mortuus, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Volatus, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Tenebrae, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Spiritus, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Sano, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Iter, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Alienis, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Praecantatio, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Auram, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Vitium, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Limus, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Herba, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Arbor, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Bestia, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Corpus, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Exanimis, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Cognitio, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Sensus, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Humanus, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Messis, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Perfodio, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Instrumentum, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Meto, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Telum, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Tutamen, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Fames, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Lucrum, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Fabrico, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Pannus, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Machina, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Vinculum, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Strontio, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Nebrisum, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Electrum, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Magneto, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Radio, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Aequalitas, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Vesania, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Primordium, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Astrum, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Gloria, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Terminus, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Luxuria, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Infernus, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Superbia, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Gula, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Invidia, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Desidia, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Ira, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Tempus, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Caelum, 1),
            setStackSize(MagicItemNBT.Crystallized_Essence_Tabernus, 1) };
        ItemStack[][] Fake_Thaumcraft_ItemCrystalEssence_Split = addSplitAggregateArray(
            Fake_Thaumcraft_ItemCrystalEssence,
            NEI_ItemOutput_Size);
        for (ItemStack[] tempItemStacks : Fake_Thaumcraft_ItemCrystalEssence_Split) {
            GTValues.RA.stdBuilder()
                .itemInputs(getModItem(Minecraft.ID, "stone", 1L))
                .itemOutputs(tempItemStacks)
                .fake()
                .duration(3 * SECONDS)
                .setNEIDesc("Debug Item NBT Check")
                .eut(0)
                .addTo(addItemNBTCheckRecipes);
        }
    }

}
