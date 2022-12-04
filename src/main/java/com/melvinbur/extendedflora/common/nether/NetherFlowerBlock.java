package com.melvinbur.extendedflora.common.nether;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class NetherFlowerBlock extends FlowerBlock {

    public NetherFlowerBlock() {
        super(MobEffects.SATURATION, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION).sound(SoundType.NETHER_SPROUTS));
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return state.is(Blocks.SOUL_SAND) || state.is(Blocks.BASALT) || state.is(Blocks.NETHERRACK) || state.is(BlockTags.NYLIUM) || state.is(Blocks.SOUL_SOIL) || super.mayPlaceOn(state, worldIn, pos);
    }

}
