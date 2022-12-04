package com.melvinbur.extendedflora.util;


import com.melvinbur.extendedflora.ExtendedFlora;
import net.minecraft.resources.ResourceLocation;

public class ResourceLocationHelper {
    public static ResourceLocation prefix(String path) {
        return new ResourceLocation(ExtendedFlora.MOD_ID, path);
    }
}