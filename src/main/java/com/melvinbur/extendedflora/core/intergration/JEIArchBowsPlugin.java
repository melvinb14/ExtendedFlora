package com.melvinbur.extendedflora.core.intergration;


import com.melvinbur.extendedflora.ExtendedFlora;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import net.minecraft.resources.ResourceLocation;


@JeiPlugin
public class JEIArchBowsPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(ExtendedFlora.MOD_ID, "jei_plugin");
    }
}
