package com.melvinbur.extendedflora.core.registry.world;

import com.melvinbur.extendedflora.ExtendedFlora;
import com.melvinbur.extendedflora.core.registry.world.features.SimpleBlockMatchWaterFeature;
import com.melvinbur.extendedflora.core.registry.world.features.stateproviders.DirectionalStateProvider;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProviderType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EFFeatures  {

    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, ExtendedFlora.MOD_ID);


    public static final RegistryObject<Feature<SimpleBlockConfiguration>> SIMPLE_BLOCK_MATCH_WATER = registerFeature("simple_block_match_water", new SimpleBlockMatchWaterFeature(SimpleBlockConfiguration.CODEC));




    private static<FC extends FeatureConfiguration> RegistryObject<Feature<FC>> registerFeature(String name, Feature<FC> feature) {
        return FEATURES.register(name, () -> feature);
    }

    public static class StateProviders {

        public static final DeferredRegister<BlockStateProviderType<?>> TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_STATE_PROVIDER_TYPES, ExtendedFlora.MOD_ID);

        public static final RegistryObject<BlockStateProviderType<DirectionalStateProvider>> DIRECTIONAL_STATE_PROVIDER = TYPES.register("directional_state_provider", () -> new BlockStateProviderType<>(DirectionalStateProvider.CODEC));
    }
}