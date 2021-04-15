package com.belgieyt.morefeatures.blocks;

import net.minecraft.block.*;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Random;

public class MoonFlower extends Block {
    public static final BooleanProperty LIT = RedstoneTorchBlock.LIT;
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    protected final IParticleData particleData;

    public MoonFlower(Properties properties, IParticleData particleData) {
        super(properties);
        this.particleData = particleData;
        this.setDefaultState(this.getDefaultState().with(LIT, Boolean.valueOf(false)));
    }

    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        double d0 = (double)pos.getX() + 0.5D;
        double d1 = (double)pos.getY() + 0.7D;
        double d2 = (double)pos.getZ() + 0.5D;
        worldIn.addParticle(ParticleTypes.ENCHANT, d0, d1, d2, 0.0D, 0.0D, 0.0D);
        worldIn.addParticle(this.particleData, d0, d1, d2, 0.0D, 0.0D, 0.0D);
    }
}