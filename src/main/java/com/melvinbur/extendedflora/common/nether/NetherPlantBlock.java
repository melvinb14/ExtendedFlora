package com.melvinbur.extendedflora.common.nether;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class NetherPlantBlock extends BushBlock {

    public NetherPlantBlock() {
        super(Properties.of(Material.REPLACEABLE_FIREPROOF_PLANT).noCollission().instabreak().sound(SoundType.NETHER_SPROUTS).offsetType(OffsetType.XZ));
        this.registerDefaultState(this.stateDefinition.any().setValue(MODEL, 0));
    }
    protected static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 13.0D, 14.0D);
    public static final IntegerProperty MODEL = IntegerProperty.create("model", 0, 2);


    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        int model = context.getLevel().getRandom().nextInt(3);
        return this.defaultBlockState().setValue(MODEL, model);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(MODEL);
    }
    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return state.is(Blocks.SOUL_SAND) || state.is(Blocks.BASALT) || state.is(Blocks.NETHERRACK) || state.is(BlockTags.NYLIUM) || state.is(Blocks.SOUL_SOIL) || super.mayPlaceOn(state, worldIn, pos);
    }
}