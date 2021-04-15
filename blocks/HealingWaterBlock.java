package com.belgieyt.morefeatures.blocks;

import com.belgieyt.morefeatures.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

public class HealingWaterBlock extends FlowingFluidBlock {

    public HealingWaterBlock(java.util.function.Supplier<? extends FlowingFluid> supplier) {
        super(supplier, Block.Properties.create(Material.WATER).doesNotBlockMovement().hardnessAndResistance(100.0F, 100.0F).noDrops().speedFactor(0.95F));
    }

    @Override
    public void neighborChanged(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        if (this.receiveNeighborFluids(world, pos, state)) {
            world.getPendingFluidTicks().scheduleTick(pos, state.getFluidState().getFluid(), this.getFluid().getTickRate(world));
        }
    }

    private boolean receiveNeighborFluids(World world, BlockPos pos, BlockState state)  {
        boolean flag = false;

        for (Direction direction : Direction.values()) {
            if (direction != Direction.DOWN && world.getFluidState(pos.offset(direction)).isTagged(FluidTags.LAVA)) {
                flag = true;
                break;
            }
        }

        if (flag) {
            FluidState ifluidstate = world.getFluidState(pos);
            if (ifluidstate.isSource()) {
                world.setBlockState(pos, BlockInit.MOLTEN_OBSIDIAN.get().getDefaultState());
                this.triggerMixEffects(world, pos);
                return false;
            }

            if (ifluidstate.getActualHeight(world, pos) >= 0.44444445F) {
                world.setBlockState(pos, BlockInit.MOLTEN_OBSIDIAN.get().getDefaultState());
                this.triggerMixEffects(world, pos);
                return false;
            }
        }

        return true;
    }


    /**
     * Heal bees slightly if they are in Sugar Water and aren't taking damage.
     */
    @Deprecated
    @Override
    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
        if (!worldIn.isRemote) {
            if (entityIn instanceof LivingEntity) {
                LivingEntity livingentity = (LivingEntity)entityIn;
                    livingentity.addPotionEffect(new EffectInstance(Effects.REGENERATION, 40));
                }
            }

        }


    private void triggerMixEffects(World world, BlockPos pos) {
        world.playEvent(1501, pos, 0);
    }
}
