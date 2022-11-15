package com.melvinbur.extendedflora;


import com.melvinbur.extendedflora.common.util.Logger;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExtendedFlora.MOD_ID)
public class ExtendedFlora {
    public static final String MOD_ID = "extendedflora";
    public static final Logger LOGGER = new Logger(MOD_ID);

    public ExtendedFlora() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //Register config
       


        com.melvinbur.extendedflora.core.ItemInit.register(eventBus);
        com.melvinbur.extendedflora.core.BlockInit.register(eventBus);

        


     

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);



        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }





    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent evt) {
        LOGGER.debug("Debug Log.");
        LOGGER.error("Error Log.");
    }

    private void clientSetup(final FMLClientSetupEvent event) {
    }


    private void setup(final FMLCommonSetupEvent event) {
    }
}
