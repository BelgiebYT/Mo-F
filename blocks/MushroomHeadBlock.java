package com.belgieyt.morefeatures.blocks;

import com.belgieyt.morefeatures.entities.MushroomBossEntity;
import com.belgieyt.morefeatures.init.BlockInit;
import com.belgieyt.morefeatures.init.ModEntityTypes;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.pattern.BlockPattern;
import net.minecraft.block.pattern.BlockPatternBuilder;
import net.minecraft.block.pattern.BlockStateMatcher;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.CachedBlockInfo;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.function.Predicate;

public class MushroomHeadBlock extends HorizontalBlock {
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    protected static final VoxelShape SHAPE = Block.makeCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 8.0D, 12.0D);
    @Nullable
    private BlockPattern snowmanBasePattern;
    @Nullable
    private BlockPattern snowmanPattern;
    private static final Predicate<BlockState> IS_PUMPKIN = (state) -> {
        return state != null && (state.isIn(BlockInit.MUSHROOM_HEAD.get()));
    };

    public MushroomHeadBlock(Properties properties) {
        super(properties);
       this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
}
    public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving) {
        if (!oldState.isIn(state.getBlock())) {
            this.trySpawnGolem(worldIn, pos);
        }
    }

    private void trySpawnGolem(World world, BlockPos pos) {
        BlockPattern.PatternHelper blockpattern$patternhelper = this.getSnowmanPattern().match(world, pos);
        if (blockpattern$patternhelper != null) {
            for(int i = 0; i < this.getSnowmanPattern().getThumbLength(); ++i) {
                CachedBlockInfo cachedblockinfo = blockpattern$patternhelper.translateOffset(0, i, 0);
                world.setBlockState(cachedblockinfo.getPos(), Blocks.AIR.getDefaultState(), 2);
                world.playEvent(2001, cachedblockinfo.getPos(), Block.getStateId(cachedblockinfo.getBlockState()));
            }

            MushroomBossEntity snowgolementity = ModEntityTypes.mushroomboss.get().create(world);
            BlockPos blockpos1 = blockpattern$patternhelper.translateOffset(0, 2, 0).getPos();
            snowgolementity.setLocationAndAngles((double)blockpos1.getX() + 0.5D, (double)blockpos1.getY() + 0.05D, (double)blockpos1.getZ() + 0.5D, 0.0F, 0.0F);
            world.addEntity(snowgolementity);

            for(ServerPlayerEntity serverplayerentity : world.getEntitiesWithinAABB(ServerPlayerEntity.class, snowgolementity.getBoundingBox().grow(5.0D))) {
                CriteriaTriggers.SUMMONED_ENTITY.trigger(serverplayerentity, snowgolementity);
            }

            for(int l = 0; l < this.getSnowmanPattern().getThumbLength(); ++l) {
                CachedBlockInfo cachedblockinfo3 = blockpattern$patternhelper.translateOffset(0, l, 0);
                world.func_230547_a_(cachedblockinfo3.getPos(), Blocks.AIR);
            }

                }
            }



                private BlockPattern getSnowmanBasePattern() {
        if (this.snowmanBasePattern == null) {
            this.snowmanBasePattern = BlockPatternBuilder.start().aisle(" ", "#", "#").where('#', CachedBlockInfo.hasState(BlockStateMatcher.forBlock(Blocks.MUSHROOM_STEM))).build();
        }

        return this.snowmanBasePattern;
    }

    private BlockPattern getSnowmanPattern() {
        if (this.snowmanPattern == null) {
            this.snowmanPattern = BlockPatternBuilder.start().aisle("^", "#", "#").where('^', CachedBlockInfo.hasState(IS_PUMPKIN)).where('#', CachedBlockInfo.hasState(BlockStateMatcher.forBlock(Blocks.MUSHROOM_STEM))).build();
        }

        return this.snowmanPattern;
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}



