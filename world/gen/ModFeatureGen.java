package com.belgieyt.morefeatures.world.gen;

import com.belgieyt.morefeatures.MoreFeatures;
import com.belgieyt.morefeatures.init.BiomeInit;
import com.belgieyt.morefeatures.init.BlockInit;
import com.belgieyt.morefeatures.init.SoundInit;
import com.belgieyt.morefeatures.util.BiomeUtil;
import com.belgieyt.morefeatures.util.FlowerGenConfig;
import com.belgieyt.morefeatures.world.features.FlowerFeature;
import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import net.java.games.input.Component;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockplacer.ColumnBlockPlacer;
import net.minecraft.world.gen.blockplacer.DoublePlantBlockPlacer;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.ForestFlowerBlockStateProvider;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.blockstateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = MoreFeatures.MOD_ID)
public class ModFeatureGen {
   
    

    public static void addFeaturesToBiomes(BiomeLoadingEvent biomes) {
        ResourceLocation biomeName = biomes.getName();

        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            biomes.getGeneration().withFeature(
                    GenerationStage.Decoration.VEGETAL_DECORATION,
                    FlowerFeature.DESERT_WELL);
        }

        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            if (FlowerGenConfig.CONFIG.allowMilkcupGen.get() == true) {
                biomes.getGeneration().withFeature(
                        GenerationStage.Decoration.VEGETAL_DECORATION,
                        FlowerFeature.MILK_CUP_Configured
                );
            }
        }
        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            if (FlowerGenConfig.CONFIG.allowLavendercupGen.get() == true) {
                biomes.getGeneration().withFeature(
                        GenerationStage.Decoration.VEGETAL_DECORATION,
                        FlowerFeature.LAVENDER_Configured
                );
            }
        }
        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            if (FlowerGenConfig.CONFIG.allowBlackRoseGen.get() == true) {
                biomes.getGeneration().withFeature(
                        GenerationStage.Decoration.VEGETAL_DECORATION,
                        FlowerFeature.LAVENDER_Configured
                );
            }
        }
        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            if (FlowerGenConfig.CONFIG.allowPinkRoseGen.get() == true) {
                biomes.getGeneration().withFeature(
                        GenerationStage.Decoration.VEGETAL_DECORATION,
                        FlowerFeature.PINK_ROSE_Configured
                );
            }
        }
        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            if (FlowerGenConfig.CONFIG.allowPurpleRoseGen.get() == true) {
                biomes.getGeneration().withFeature(
                        GenerationStage.Decoration.VEGETAL_DECORATION,
                        FlowerFeature.PURPLE_ROSE_Configured
                );
            }
        }
        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            if (FlowerGenConfig.CONFIG.allowMagentaRoseGen.get() == true) {
                biomes.getGeneration().withFeature(
                        GenerationStage.Decoration.VEGETAL_DECORATION,
                        FlowerFeature.MAGENTA_ROSE_Configured
                );
            }
        }
        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            if (FlowerGenConfig.CONFIG.allowBlueRoseGen.get() == true) {
                biomes.getGeneration().withFeature(
                        GenerationStage.Decoration.VEGETAL_DECORATION,
                        FlowerFeature.BLUE_ROSE_Configured
                );
            }
        }
        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            if (FlowerGenConfig.CONFIG.allowCyanRoseGen.get() == true) {
                biomes.getGeneration().withFeature(
                        GenerationStage.Decoration.VEGETAL_DECORATION,
                        FlowerFeature.CYAN_ROSE_Configured
                );
            }
        }
        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            if (FlowerGenConfig.CONFIG.allowLightblueRoseGen.get() == true) {
                biomes.getGeneration().withFeature(
                        GenerationStage.Decoration.VEGETAL_DECORATION,
                        FlowerFeature.LIGHT_BLUE_ROSE_Configured
                );
            }
        }
        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            if (FlowerGenConfig.CONFIG.allowWhiteRoseGen.get() == true) {
                biomes.getGeneration().withFeature(
                        GenerationStage.Decoration.VEGETAL_DECORATION,
                        FlowerFeature.WHITE_ROSE_Configured
                );
            }
        }
        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            if (FlowerGenConfig.CONFIG.allowGrayRoseGen.get() == true) {
                biomes.getGeneration().withFeature(
                        GenerationStage.Decoration.VEGETAL_DECORATION,
                        FlowerFeature.GRAY_ROSE_Configured
                );
            }
        }
        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            if (FlowerGenConfig.CONFIG.allowLightGrayRoseGen.get() == true) {
                biomes.getGeneration().withFeature(
                        GenerationStage.Decoration.VEGETAL_DECORATION,
                        FlowerFeature.LIGHT_GRAY_ROSE_Configured
                );
            }
        }
        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            if (FlowerGenConfig.CONFIG.allowBrownRoseGen.get() == true) {
                biomes.getGeneration().withFeature(
                        GenerationStage.Decoration.VEGETAL_DECORATION,
                        FlowerFeature.BROWN_ROSE_Configured
                );
            }
        }
        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            if (FlowerGenConfig.CONFIG.allowYellowRoseGen.get() == true) {
                biomes.getGeneration().withFeature(
                        GenerationStage.Decoration.VEGETAL_DECORATION,
                        FlowerFeature.YELLOW_ROSE_Configured
                );
            }
        }
        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
                biomes.getGeneration().withFeature(
                        GenerationStage.Decoration.VEGETAL_DECORATION,
                        FlowerFeature.MEGA_SPRUCE.chance(100)
                );
            }
        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            biomes.getGeneration().withFeature(
                    GenerationStage.Decoration.VEGETAL_DECORATION,
                    FlowerFeature.TREES_GIANT_SPRUCE
            );
        }
        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            biomes.getGeneration().withFeature(
                    GenerationStage.Decoration.VEGETAL_DECORATION,
                    FlowerFeature.FOREST_ROCK
            );
        }
        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            biomes.getGeneration().withFeature(
                    GenerationStage.Decoration.VEGETAL_DECORATION,
                    FlowerFeature.ORANGE_ROSE_Configured
            );
        }
        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            biomes.getGeneration().withFeature(
                    GenerationStage.Decoration.VEGETAL_DECORATION,
                    FlowerFeature.STRAWBERRY_Configured
            );
        }
        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            biomes.getGeneration().withFeature(
                    GenerationStage.Decoration.VEGETAL_DECORATION,
                    FlowerFeature.BLUE_BERRY_Configured
            );
        }
        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            biomes.getGeneration().withFeature(
                    GenerationStage.Decoration.VEGETAL_DECORATION,
                    FlowerFeature.BLACK_BERRY_Configured
            );
        }
        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            biomes.getGeneration().withFeature(
                    GenerationStage.Decoration.VEGETAL_DECORATION,
                    FlowerFeature.KIWI_VINES_Configured
            );
        }
        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            biomes.getGeneration().withFeature(
                    GenerationStage.Decoration.VEGETAL_DECORATION,
                    FlowerFeature.FLOWER_HEALING_Configured
            );
        }
        if (BiomeUtil.matchesKeys(biomeName, Biomes.SWAMP)) {
            biomes.getGeneration().withFeature(
                    GenerationStage.Decoration.VEGETAL_DECORATION,
                    FlowerFeature.FLOWER_POISON_Configured
            );
        }
    }
}
