package com.melvinbur.extendedflora.core;

import com.melvinbur.extendedflora.ExtendedFlora;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedFlora.MOD_ID);


    public static final RegistryObject<Block> FLAX = registerBlock("flax",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 2,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> POTTED_FLAX = BLOCKS.register("potted_flax",
            () -> new FlowerPotBlock(null, BlockInit.FLAX,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION)));

    public static final RegistryObject<Block> FLAX_CROP = BLOCKS.register("flax_crop",
            () -> new FlaxCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> TWIG = registerBlock("twig",
            () -> new TwigBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion().noCollission()),CreativeModeTabInit.ARCHBOWS_TAB);




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(CreativeModeTabInit.ARCHBOWS_TAB)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
