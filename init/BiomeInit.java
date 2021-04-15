package com.belgieyt.morefeatures.init;

import com.belgieyt.morefeatures.MoreFeatures;
import com.belgieyt.morefeatures.world.biomes.FruitFields;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = MoreFeatures.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BiomeInit {
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, MoreFeatures.MOD_ID);

    // Dummy biomes to reserve the numeric ID safely for the json biomes to overwrite.
    // No static variable to hold as these dummy biomes should NOT be held and referenced elsewhere.
    public static final RegistryObject<Biome> FRUIT_FIELDS =  createBiome("fruit_fields", FruitFields::makeFruitFieldsBiome);

    public static class Keys {
        public static final RegistryKey<Biome> FRUIT_FIELDS_KEY = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, new ResourceLocation(MoreFeatures.MOD_ID, "fruit_fields"));
          }



    public static RegistryObject<Biome> createBiome(String name, Supplier<Biome> biome) {
        return BIOMES.register(name, biome);
    }
    public static void registerBiomes() {
        registerBiome(Keys.FRUIT_FIELDS_KEY, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.OVERWORLD);

    }

    private static void registerBiome(RegistryKey<Biome> biome, BiomeDictionary.Type... types) {
        // the line below will make it spawn in the overworld
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 100));
        BiomeDictionary.addTypes(biome, types);

    }
}