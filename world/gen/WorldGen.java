package com.belgieyt.morefeatures.world.gen;

import com.belgieyt.morefeatures.init.BiomeInit;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class WorldGen {

    @SubscribeEvent(priority = EventPriority.NORMAL)
    public static void addBiomeFeatures(BiomeLoadingEvent event) {
        RegistryKey<Biome> biome = RegistryKey.getOrCreateKey(ForgeRegistries.Keys.BIOMES, event.getName());
        Set<BiomeDictionary.Type> biomeTypes = BiomeDictionary.getTypes(biome);
        List<Supplier<ConfiguredFeature<?, ?>>> vegetalFeatures = event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);


    }
}
