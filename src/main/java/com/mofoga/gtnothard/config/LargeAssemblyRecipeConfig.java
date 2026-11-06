package com.mofoga.gtnothard.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.mofoga.gtnothard.MyMod;

public final class LargeAssemblyRecipeConfig {

    public static boolean enabledItemRecipes = true;
    public static boolean enableNormalRecipes = true;

    private LargeAssemblyRecipeConfig() {}

    public static void load(File configDirectory) {
        Configuration configuration = new Configuration(new File(configDirectory, MyMod.MODID + ".cfg"));
        enabledItemRecipes = configuration.getBoolean("enabledItemRecipes", "assemblyRecipes", true, "");
        enableNormalRecipes = configuration.getBoolean("enableNormalRecipes", "assemblyRecipes", true, "");
        if (configuration.hasChanged()) {
            configuration.save();
        }
    }
}
