package com.haru.lithereal.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.state.BlockState;
import com.haru.lithereal.block.ModBlocks;

public class BlueFireBlock extends BaseFireBlock {
    public BlueFireBlock(Properties properties, float lightLevel) {
        super(properties, lightLevel);
    }

    public BlockState updateShape(BlockState blockState, Direction direction, BlockState state, LevelAccessor levelAccessor, BlockPos blockPos, BlockPos blockPos1) {
        return this.canSurvive(blockState, levelAccessor, blockPos) ? this.defaultBlockState() : this.defaultBlockState();
    }

    public boolean canSurvive(BlockState blockState, LevelReader levelReader, BlockPos blockPos) {
        return true;
        //return canSurviveOnBlock(levelReader.getBlockState(blockPos.below()));
    }

    public static boolean canSurviveOnBlock(BlockState blockState) {
        return blockState.is(ModBlocks.HEATED_LITHERITE_BLOCK.get());
    }

    protected boolean canBurn(BlockState blockState) {
        return true;
    }
}
