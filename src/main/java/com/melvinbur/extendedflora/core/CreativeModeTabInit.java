package com.melvinbur.extendedflora.core;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeModeTabInit {
    public static final CreativeModeTab EXTENDEDFLORA_TAB = new CreativeModeTab("extendedfloraTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.FLAX_FIBER.get());
        }
    };
}

