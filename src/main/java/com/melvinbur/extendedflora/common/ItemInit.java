package com.melvinbur.extendedflora.common;

import com.melvinbur.extendedflora.ExtendedFlora;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {



    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedFlora.MOD_ID);



    //Items
    public static final RegistryObject<Item> FLAX_FIBER = ITEMS.register("flax_fiber",
            () -> new Item(new Item.Properties().tab(CreativeModeTabInit.EXTENDEDFLORA_TAB)));

    public static final RegistryObject<Item> FLAX_SEEDS = ITEMS.register("flax_seeds",
            () -> new ItemNameBlockItem(BlockInit.FLAX_CROP.get(),
                    new Item.Properties().tab(CreativeModeTabInit.EXTENDEDFLORA_TAB)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}


