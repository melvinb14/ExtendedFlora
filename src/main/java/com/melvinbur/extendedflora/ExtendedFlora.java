package com.melvinbur.extendedflora;


import com.melvinbur.extendedflora.common.BlockInit;
import com.melvinbur.extendedflora.common.CompostablesInit;
import com.melvinbur.extendedflora.common.ItemInit;
import com.melvinbur.extendedflora.core.config.Config;
import com.melvinbur.extendedflora.core.registry.world.EFBiomeModifiers;
import com.melvinbur.extendedflora.core.registry.world.EFConfiguredFeatures;
import com.melvinbur.extendedflora.core.registry.world.EFFeatures;
import com.melvinbur.extendedflora.core.registry.world.EFPlacements;
import com.melvinbur.extendedflora.util.Logger;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExtendedFlora.MOD_ID)
public class ExtendedFlora {
    public static final String MOD_ID = "extendedflora";
    public static final Logger LOGGER = new Logger(MOD_ID);


    public ExtendedFlora() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.register(eventBus);
        BlockInit.register(eventBus);


        EFFeatures.FEATURES.register(eventBus);
        EFFeatures.StateProviders.TYPES.register(eventBus);
        EFBiomeModifiers.BIOME_MODIFIER_SERIALIZERS.register(eventBus);
        EFConfiguredFeatures.CONFIGURED_FEATURES.register(eventBus);
        EFPlacements.PLACED_FEATURES.register(eventBus);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.CONFIG);


        MinecraftForge.EVENT_BUS.register(this);

        eventBus.addListener(this::commonSetup);
        eventBus.addListener(this::clientSetup);


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

    }


    private void clientSetup(final FMLClientSetupEvent event) {
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(CompostablesInit::init);

    }

    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent evt) {
        LOGGER.debug("Debug Log.");
        LOGGER.error("Error Log.");


    }
}


