package Recipes.SingularityRecipes_VoidOre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.minecraft.item.ItemStack;

import gregtech.api.enums.OreMixes;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.enums.SmallOres;
import gregtech.api.interfaces.IOreMaterial;
import gtneioreplugin.util.DimensionHelper;
import util.RegisteredResourceCatalog;

final class DimensionOreCatalog {

    private DimensionOreCatalog() {}

    static ItemStack[] collect(String abbreviation, ItemStack[] fallback) {
        String dimension = DimensionHelper.ABBR_TO_INTERNAL.get(abbreviation);
        if (dimension != null) {
            List<ItemStack> resources = new ArrayList<>();
            for (OreMixes mix : OreMixes.VALUES) {
                if (mix.oreMixBuilder.dimsEnabled.contains(dimension)) {
                    addOre(resources, mix.oreMixBuilder.primary);
                    addOre(resources, mix.oreMixBuilder.secondary);
                    addOre(resources, mix.oreMixBuilder.between);
                    addOre(resources, mix.oreMixBuilder.sporadic);
                }
            }
            for (SmallOres smallOre : SmallOres.values()) {
                if (smallOre.smallOreBuilder.dimsEnabled.contains(dimension)) {
                    addOre(resources, smallOre.smallOreBuilder.ore);
                }
            }
            ItemStack[] result = RegisteredResourceCatalog.normalizeItems(resources);
            if (result.length > 0) {
                return result;
            }
        }
        return RegisteredResourceCatalog.normalizeItems(Arrays.asList(fallback));
    }

    private static void addOre(List<ItemStack> resources, IOreMaterial material) {
        if (material != null) {
            resources.add(material.getPart(OrePrefixes.ore, 1));
        }
    }
}
