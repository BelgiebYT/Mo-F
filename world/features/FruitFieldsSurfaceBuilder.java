package com.belgieyt.morefeatures.world.features;

import com.belgieyt.morefeatures.world.biomes.MoSurfaceBuilder;
import com.mojang.serialization.Codec;
import com.sun.org.apache.bcel.internal.classfile.Code;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

import java.util.Random;

public class FruitFieldsSurfaceBuilder extends SurfaceBuilder<SurfaceBuilderConfig> {
    public FruitFieldsSurfaceBuilder(Codec<SurfaceBuilderConfig> CODEC) {
        super(CODEC);
    }

    public void buildSurface(Random rand, IChunk chunk, Biome biome, int x, int z, int startHeight, double noise,
                             BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config) {
        if (noise > 1.75D) {
            SurfaceBuilder.DEFAULT.buildSurface(rand, chunk, biome, x, z, startHeight, noise, defaultBlock,
                    defaultFluid, seaLevel, seed, MoSurfaceBuilder.GRASS_GRASS_GRASS_CONFIG);
        } else if (noise <= 1.75D && noise > 1.2D) {
            SurfaceBuilder.DEFAULT.buildSurface(rand, chunk, biome, x, z, startHeight, noise, defaultBlock,
                    defaultFluid, seaLevel, seed, MoSurfaceBuilder.GRASS_GRASS_GRASS_CONFIG);
        } else if (noise > -0.90D) {
            SurfaceBuilder.DEFAULT.buildSurface(rand, chunk, biome, x, z, startHeight, noise, defaultBlock,
                    defaultFluid, seaLevel, seed, MoSurfaceBuilder.GRASS_GRASS_GRASS_CONFIG);
        } else {
            SurfaceBuilder.DEFAULT.buildSurface(rand, chunk, biome, x, z, startHeight, noise, defaultBlock,
                    defaultFluid, seaLevel, seed, MoSurfaceBuilder.GRASS_GRASS_GRASS_CONFIG);
        }

    }
}
