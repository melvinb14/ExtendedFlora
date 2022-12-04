package com.melvinbur.extendedflora.common.overworld;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.common.PlantType;

public class DesertFlowerBlock extends FlowerBlock {


    public DesertFlowerBlock() {
        super(MobEffects.SATURATION, 2, BlockBehaviour.Properties.copy(Blocks.DANDELION));
    }



    @Override
    public PlantType getPlantType(BlockGetter world, BlockPos pos) {
        return PlantType.DESERT;
    }
}

