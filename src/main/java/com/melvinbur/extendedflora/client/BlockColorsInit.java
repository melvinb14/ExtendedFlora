package com.melvinbur.extendedflora.client;

import com.melvinbur.extendedflora.common.BlockInit;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockColorsInit {

    @SubscribeEvent
    public static void onColorHandlerEvent(RegisterColorHandlersEvent.Block event) {
        event.register(getFoliageColor(), BlockInit.BUSH.get());
        event.register(getGrassColor(), BlockInit.MORE_GRASS.get());
    }

    @SubscribeEvent
    public static void onColorHandlerEvent(RegisterColorHandlersEvent.Item event) {
        BlockColors blockColors = event.getBlockColors();


        event.register((itemstack, tintIndex) -> {
            BlockState state = Blocks.OAK_LEAVES.defaultBlockState();
            int color = blockColors.getColor(state, null, null, tintIndex);
            return color;
        }, BlockInit.MORE_GRASS.get());



        event.register((itemstack, tintIndex) -> {
            BlockState state = Blocks.OAK_LEAVES.defaultBlockState();
            int color = blockColors.getColor(state, null, null, tintIndex);
            return color;
        }, BlockInit.BUSH.get());
    }

    private static BlockColor getFoliageColor() {
        return (state, world, pos, tintIndex) -> (world != null && pos != null)
                ? BiomeColors.getAverageFoliageColor(world, pos)
                : FoliageColor.getDefaultColor();
    }



    private static BlockColor getGrassColor() {
        return (state, world, pos, tintIndex) -> (world != null && pos != null)
                ? BiomeColors.getAverageGrassColor(world, pos)
                : GrassColor.get(0.5D, 1.0D);
    }
}