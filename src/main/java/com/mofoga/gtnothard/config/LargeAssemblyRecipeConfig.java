package com.mofoga.gtnothard.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

/** Configuration for isolating and diagnosing the large assembly recipe group. */
public final class LargeAssemblyRecipeConfig {

    public static boolean enabledItemRecipes = true;
    public static boolean enableNormalRecipes = true;
    public static boolean logRegistration = true;

    private LargeAssemblyRecipeConfig() {}

    public static void load(File configurationDirectory) {
        Configuration config = new Configuration(new File(configurationDirectory, "gtnothard-large-recipes.cfg"));
        config.load();
        enabledItemRecipes = config.getBoolean(
            "enabled",
            "largeAssemblyRecipes",
            true,
            "Register the item assembly recipe group. Set false for an A/B startup diagnosis.");
        enableNormalRecipes = config.getBoolean(
            "enableNormalRecipes",
            "largeAssemblyRecipes",
            true,
            "Register the four normal assembly groups: casing, hatch, item and machine recipes.");
        logRegistration = config.getBoolean(
            "logRegistration",
            "largeAssemblyRecipes",
            true,
            "Log begin/end, input counts and registration time for both assembly recipe maps.");
        if (config.hasChanged()) config.save();
    }
}
