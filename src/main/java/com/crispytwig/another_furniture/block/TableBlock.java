package com.crispytwig.another_furniture.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TableBlock extends BaseBlock {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    protected static final VoxelShape TOP = Block.box(0.0D, 14.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape LEG_1 = Block.box(14.0D, 0.0D, 14.0D, 16.0D, 14.0D, 16.0D);
    protected static final VoxelShape LEG_2 = Block.box(0.0D, 0.0D, 14.0D, 2.0D, 14.0D, 16.0D);
    protected static final VoxelShape LEG_3 = Block.box(0.0D, 0.0D, 0.0D, 2.0D, 14.0D, 2.0D);
    protected static final VoxelShape LEG_4 = Block.box(14.0D, 0.0D, 0.0D, 16.0D, 14.0D, 2.0D);
    protected static final VoxelShape SHAPE = Shapes.or(TOP, LEG_1, LEG_2, LEG_3, LEG_4);

    public TableBlock(Properties properties) {
        super(properties);
    }

    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext ctx) {
        return SHAPE;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
