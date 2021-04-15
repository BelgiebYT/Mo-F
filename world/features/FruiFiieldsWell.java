package com.belgieyt.morefeatures.world.features;

import com.belgieyt.morefeatures.init.BlockInit;
import com.belgieyt.morefeatures.init.FluidInit;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockStateMatcher;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Random;

public class FruiFiieldsWell extends Feature<NoFeatureConfig> {
    private static final BlockStateMatcher IS_SAND = BlockStateMatcher.forBlock(Blocks.GRASS_BLOCK);
    private final BlockState sandSlab = BlockInit.LIME_PLANK_SLAB.get().getDefaultState();
    private final BlockState sandstone = BlockInit.LIME_PLANKS.get().getDefaultState();
    private final BlockState chest = Blocks.CHEST.getDefaultState();
    private final BlockState water = FluidInit.HEALING_WATER_BLOCK.get().getDefaultState();

    public FruiFiieldsWell(Codec<NoFeatureConfig> p_i231948_1_) {
        super(p_i231948_1_);
    }

    public boolean generate(ISeedReader reader, ChunkGenerator generator, Random rand, BlockPos pos, NoFeatureConfig config) {
        for(pos = pos.up(); reader.isAirBlock(pos) && pos.getY() > 2; pos = pos.down()) {
        }

        if (!IS_SAND.test(reader.getBlockState(pos))) {
            return false;
        } else {
            for(int i = -2; i <= 2; ++i) {
                for(int j = -2; j <= 2; ++j) {
                    if (reader.isAirBlock(pos.add(i, -1, j)) && reader.isAirBlock(pos.add(i, -2, j))) {
                        return false;
                    }
                }
            }

            for(int l = -1; l <= 0; ++l) {
                for(int l1 = -2; l1 <= 2; ++l1) {
                    for(int k = -2; k <= 2; ++k) {
                        reader.setBlockState(pos.add(l1, l, k), this.sandstone, 2);
                    }
                }
            }

            reader.setBlockState(pos, this.water, 2);

            for(Direction direction : Direction.Plane.HORIZONTAL) {
                reader.setBlockState(pos.offset(direction), this.water, 2);
            }

            for(int i1 = -2; i1 <= 2; ++i1) {
                for(int i2 = -2; i2 <= 2; ++i2) {
                    if (i1 == -2 || i1 == 2 || i2 == -2 || i2 == 2) {
                        reader.setBlockState(pos.add(i1, 1, i2), this.sandstone, 2);
                    }
                }
            }

            reader.setBlockState(pos.add(2, 1, 0), this.sandSlab, 2);
            reader.setBlockState(pos.add(-2, 1, 0), this.sandSlab, 2);
            reader.setBlockState(pos.add(0, 1, 2), this.sandSlab, 2);
            reader.setBlockState(pos.add(0, 1, -2), this.sandSlab, 2);

            for(int j1 = -1; j1 <= 1; ++j1) {
                for(int j2 = -1; j2 <= 1; ++j2) {
                    if (j1 == 0 && j2 == 0) {
                        reader.setBlockState(pos.add(j1, 4, j2), this.sandstone, 2);
                    } else {
                        reader.setBlockState(pos.add(j1, 4, j2), this.sandSlab, 2);
                    }
                }
            }

            for(int k1 = 1; k1 <= 3; ++k1) {
                reader.setBlockState(pos.add(-1, k1, -1), this.sandstone, 2);
                reader.setBlockState(pos.add(-1, k1, 1), this.sandstone, 2);
                reader.setBlockState(pos.add(1, k1, -1), this.sandstone, 2);
                reader.setBlockState(pos.add(1, k1, 1), this.sandstone, 2);

            }

            return true;
        }
    }
}

