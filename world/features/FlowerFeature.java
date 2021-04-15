package com.belgieyt.morefeatures.world.features;

import com.belgieyt.morefeatures.MoreFeatures;
import com.belgieyt.morefeatures.init.BlockInit;
import com.belgieyt.morefeatures.init.FluidInit;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.blockplacer.DoublePlantBlockPlacer;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.AxisRotatingBlockStateProvider;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.MegaPineFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.PineFoliagePlacer;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator;
import net.minecraft.world.gen.treedecorator.CocoaTreeDecorator;
import net.minecraft.world.gen.trunkplacer.GiantTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Random;
import java.util.Set;

public class FlowerFeature {



    //Vanilla
    public static final BlockClusterFeatureConfig MILK_CUP = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.MILK_CUP.get().getDefaultState()),
            new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(64)
            .build();

    public static final BlockClusterFeatureConfig LAVENDER = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.LAVENDER.get().getDefaultState()),
            new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(64)
            .build();

    public static final BlockClusterFeatureConfig BLACK_ROSE_BUSH = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.BLACK_ROSE_BUSH.get().getDefaultState()),
            new DoublePlantBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(64)
            .build();
    public static final BlockClusterFeatureConfig WHITE_ROSE_BUSH = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.WHITE_ROSE_BUSH.get().getDefaultState()),
            new DoublePlantBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(64)
            .build();
    public static final BlockClusterFeatureConfig GRAY_ROSE_BUSH = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.GRAY_ROSE_BUSH.get().getDefaultState()),
            new DoublePlantBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(64)
            .build();
    public static final BlockClusterFeatureConfig BROWN_ROSE_BUSH = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.BROWN_ROSE_BUSH.get().getDefaultState()),
            new DoublePlantBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(64)
            .build();
    public static final BlockClusterFeatureConfig LIGHT_GRAY_ROSE_BUSH = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.LIGHT_GRAY_ROSE_BUSH.get().getDefaultState()),
            new DoublePlantBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(64)
            .build();
    public static final BlockClusterFeatureConfig BLUE_ROSE_BUSH = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.BLUE_ROSE_BUSH.get().getDefaultState()),
            new DoublePlantBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(64)
            .build();
    public static final BlockClusterFeatureConfig CYAN_ROSE_BUSH = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.CYAN_ROSE_BUSH.get().getDefaultState()),
            new DoublePlantBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(64)
            .build();
    public static final BlockClusterFeatureConfig LIGHT_BLUE_ROSE_BUSH = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.LIGHT_BLUE_ROSE_BUSH.get().getDefaultState()),
            new DoublePlantBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(64)
            .build();
    public static final BlockClusterFeatureConfig PINK_ROSE_BUSH = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.PINK_ROSE_BUSH.get().getDefaultState()),
            new DoublePlantBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(64)
            .build();
    public static final BlockClusterFeatureConfig PURPLE_ROSE_BUSH = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.PURPLE_ROSE_BUSH.get().getDefaultState()),
            new DoublePlantBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(64)
            .build();
    public static final BlockClusterFeatureConfig MAGENTA_ROSE_BUSH = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.MAGENTA_ROSE_BUSH.get().getDefaultState()),
            new DoublePlantBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(64)
            .build();
    public static final BlockClusterFeatureConfig YELLOW_ROSE_BUSH = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.BLACK_ROSE_BUSH.get().getDefaultState()),
            new DoublePlantBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(64)
            .build();
    public static final BlockClusterFeatureConfig ORANGE_ROSE_BUSH = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.BLACK_ROSE_BUSH.get().getDefaultState()),
            new DoublePlantBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(64)
            .build();
    public static final BlockClusterFeatureConfig STRAWBERRY_BUSH = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.STRAWBERRY_BUSH.get().getDefaultState()),
            new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(64)
            .build();
    public static final BlockClusterFeatureConfig BLACKBERRY_BUSH = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.BLACKBERRY_BUSH.get().getDefaultState()),
            new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(64)
            .build();
    public static final BlockClusterFeatureConfig BLUEBERRY_BUSH = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.BLUEBERRY_BUSH.get().getDefaultState()),
            new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(64)
            .build();
    public static final BlockClusterFeatureConfig KIWI_VINES = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.KIWI_VINES.get().getDefaultState()),
            new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(64)
            .build();
    public static final BlockClusterFeatureConfig FLOWER_O_POISON = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.FLOWER_O_POISON.get().getDefaultState()),
            new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(64)
            .build();
    public static final BlockClusterFeatureConfig FLOWER_O_HEALING = (new BlockClusterFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockInit.FLOWER_O_HEALING.get().getDefaultState()),
            new SimpleBlockPlacer())).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK))
            .tries(64)
            .build();


    public static ConfiguredFeature MILK_CUP_Configured = new ConfiguredFeature(
            Feature.FLOWER,
            MILK_CUP);

    public static ConfiguredFeature LAVENDER_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            LAVENDER);

    public static ConfiguredFeature BLACK_ROSE_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            BLACK_ROSE_BUSH);

    public static ConfiguredFeature WHITE_ROSE_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            WHITE_ROSE_BUSH);

    public static ConfiguredFeature GRAY_ROSE_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            GRAY_ROSE_BUSH);

    public static ConfiguredFeature LIGHT_GRAY_ROSE_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            LIGHT_GRAY_ROSE_BUSH);

    public static ConfiguredFeature BROWN_ROSE_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            BROWN_ROSE_BUSH);

    public static ConfiguredFeature BLUE_ROSE_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            BLUE_ROSE_BUSH);

    public static ConfiguredFeature LIGHT_BLUE_ROSE_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            LIGHT_BLUE_ROSE_BUSH);

    public static ConfiguredFeature CYAN_ROSE_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            CYAN_ROSE_BUSH);

    public static ConfiguredFeature PINK_ROSE_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            PINK_ROSE_BUSH);

    public static ConfiguredFeature PURPLE_ROSE_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            PURPLE_ROSE_BUSH);

    public static ConfiguredFeature MAGENTA_ROSE_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            MAGENTA_ROSE_BUSH);

    public static ConfiguredFeature YELLOW_ROSE_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            YELLOW_ROSE_BUSH);

    public static ConfiguredFeature ORANGE_ROSE_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            ORANGE_ROSE_BUSH);
    public static ConfiguredFeature BLACK_BERRY_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            BLACKBERRY_BUSH);
    public static ConfiguredFeature STRAWBERRY_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            STRAWBERRY_BUSH);
    public static ConfiguredFeature BLUE_BERRY_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            BLUEBERRY_BUSH);
    public static ConfiguredFeature KIWI_VINES_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            KIWI_VINES);
    public static ConfiguredFeature FLOWER_HEALING_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            FLOWER_O_HEALING);
    public static ConfiguredFeature FLOWER_POISON_Configured = new ConfiguredFeature(
            Feature.RANDOM_PATCH,
            FLOWER_O_POISON);



        public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> OAK = register("oak", Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()), new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()), new BlobFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3), new StraightTrunkPlacer(4, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build()));
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> MEGA_SPRUCE = register("mega_spruce", Feature.TREE.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()), new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()), new MegaPineFoliagePlacer(FeatureSpread.func_242252_a(0), FeatureSpread.func_242252_a(0), FeatureSpread.func_242253_a(13, 4)), new GiantTrunkPlacer(13, 2, 14), new TwoLayerFeature(1, 1, 2))).setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(BlockInit.MOSS_BLOCK.get().getDefaultState())))).setDecorators(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(BlockInit.MOSS_BLOCK_SLAB.get().getDefaultState())))).build()));
    public static final ConfiguredFeature<?, ?> DESERT_WELL = register("desert_well", com.belgieyt.morefeatures.world.features.Features.DESERT_WELL.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).chance(100));
    public static final ConfiguredFeature<?, ?> FOREST_ROCK = register("forest_rock", Feature.FOREST_ROCK.withConfiguration(new BlockStateFeatureConfig(BlockInit.MOSS_BLOCK.get().getDefaultState())).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).func_242732_c(2));


    public static final ConfiguredFeature<?, ?> TREES_GIANT_SPRUCE = register("trees_giant_spruce", Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(MEGA_SPRUCE.withChance(0.1F), OAK.withChance(0.1F)), OAK))).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1)));


    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String key, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, key, configuredFeature);


    }


}