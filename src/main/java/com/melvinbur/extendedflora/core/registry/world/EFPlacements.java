package com.melvinbur.extendedflora.core.registry.world;


import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.melvinbur.extendedflora.ExtendedFlora;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

;import static net.minecraft.data.worldgen.placement.VegetationPlacements.worldSurfaceSquaredWithCount;

public class EFPlacements  {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, ExtendedFlora.MOD_ID);

    
    // Overworld
    public static final RegistryObject<PlacedFeature> GORSE = register("gorse", EFConfiguredFeatures.GORSE, List.of(RarityFilter.onAverageOnceEvery(12), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
    public static final RegistryObject<PlacedFeature> GERANIUM = register("geranium", EFConfiguredFeatures.GERANIUM, List.of(RarityFilter.onAverageOnceEvery(17), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
    public static final RegistryObject<PlacedFeature> BEACH_ASTER = register("beach_aster", EFConfiguredFeatures.BEACH_ASTER, List.of(RarityFilter.onAverageOnceEvery(28), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
    public static final RegistryObject<PlacedFeature> BEE_BALM = register("bee_balm", EFConfiguredFeatures.BEE_BALM, List.of(RarityFilter.onAverageOnceEvery(35), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
    public static final RegistryObject<PlacedFeature> Nettle = register("nettle", EFConfiguredFeatures.NETTLE, onceEvery(9));
    public static final RegistryObject<PlacedFeature> FLAX = register("flax", EFConfiguredFeatures.FLAX, List.of(RarityFilter.onAverageOnceEvery(33), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
    public static final RegistryObject<PlacedFeature> MORE_GRASS = register("more_grass", EFConfiguredFeatures.MORE_GRASS, worldSurfaceSquaredWithCount(1));
    public static final RegistryObject<PlacedFeature> BUSH = register("bush", EFConfiguredFeatures.BUSH, List.of(RarityFilter.onAverageOnceEvery(28), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
    public static final RegistryObject<PlacedFeature> DEMACIA = register("demacia", EFConfiguredFeatures.DEMACIA, RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome());
    public static final RegistryObject<PlacedFeature> BLAZING_STAR = register("blazing_star", EFConfiguredFeatures.BLAZING_STAR, List.of(RarityFilter.onAverageOnceEvery(42), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
    public static final RegistryObject<PlacedFeature> BROWN_EYES = register("brown_eyes", EFConfiguredFeatures.BROWN_EYES, List.of(RarityFilter.onAverageOnceEvery(24), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
    public static final RegistryObject<PlacedFeature> SCORPION_WEED = register("scorpion_weed", EFConfiguredFeatures.SCORPION_WEED, List.of(RarityFilter.onAverageOnceEvery(17), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));


    // Nether
    public static final RegistryObject<PlacedFeature> PHORE = register("phore", EFConfiguredFeatures.PHORE, RarityFilter.onAverageOnceEvery(2), CountOnEveryLayerPlacement.of(1), BiomeFilter.biome());
    public static final RegistryObject<PlacedFeature> EAFRUS = register("eafrus", EFConfiguredFeatures.EAFRUS, RarityFilter.onAverageOnceEvery(2), CountOnEveryLayerPlacement.of(1), BiomeFilter.biome());
    public static final RegistryObject<PlacedFeature> AASLARD = register("aaslard", EFConfiguredFeatures.AASLARD, RarityFilter.onAverageOnceEvery(4), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome());
    public static final RegistryObject<PlacedFeature> KRARD = register("krard", EFConfiguredFeatures.KRARD, RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome());
    public static final RegistryObject<PlacedFeature> NOXUS = register("noxus", EFConfiguredFeatures.NOXUS, RarityFilter.onAverageOnceEvery(4), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome());
    public static final RegistryObject<PlacedFeature> IXTAL = register("ixtal", EFConfiguredFeatures.IXTAL, RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome());
    public static final RegistryObject<PlacedFeature> NETHER_PLANT = register("nether_plant", EFConfiguredFeatures.NETHER_PLANT,RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome());

    // End
    public static final RegistryObject<PlacedFeature> APHRIRE = register("aphrire", EFConfiguredFeatures.APHRIRE, RarityFilter.onAverageOnceEvery(3), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome());
    public static final RegistryObject<PlacedFeature> DAWN_APISOS = register("dawn_apisos", EFConfiguredFeatures.DAWN_APISOS, RarityFilter.onAverageOnceEvery(6),InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome());
    public static final RegistryObject<PlacedFeature> EEKORE = register("eekore", EFConfiguredFeatures.EEKORE, RarityFilter.onAverageOnceEvery(4), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome());
    public static final RegistryObject<PlacedFeature> IBINE = register("ibine", EFConfiguredFeatures.IBINE, RarityFilter.onAverageOnceEvery(3), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome());
    public static final RegistryObject<PlacedFeature> ZOXARY = register("zoxary", EFConfiguredFeatures.ZOXARY, RarityFilter.onAverageOnceEvery(5), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome());
    public static final RegistryObject<PlacedFeature> ENDER_PLANT = register("ender_plant", EFConfiguredFeatures.ENDER_PLANT,RarityFilter.onAverageOnceEvery(1), InSquarePlacement.spread(), PlacementUtils.FULL_RANGE, BiomeFilter.biome());






    private static RegistryObject<PlacedFeature> copy(String name, Holder<PlacedFeature> placedFeature) {
        return register(name, placedFeature.value().feature(), placedFeature.value().placement());
    }

    private static <T extends FeatureConfiguration> RegistryObject<PlacedFeature> register(String name, Holder<? extends ConfiguredFeature<?, ?>> feature, List<PlacementModifier> modifiers) {
        return PLACED_FEATURES.register(name, () -> new PlacedFeature(Holder.hackyErase(feature), modifiers));
    }

    public static RegistryObject<PlacedFeature> register(String name, RegistryObject<ConfiguredFeature<?, ?>> feature, List<PlacementModifier> modifiers) {
        return PLACED_FEATURES.register(name, () -> new PlacedFeature(Holder.hackyErase(feature.getHolder().orElseThrow()), modifiers));
    }

    public static RegistryObject<PlacedFeature> register(String name, RegistryObject<ConfiguredFeature<?, ?>> feature, PlacementModifier... modifiers) {
        return register(name, feature, List.of(modifiers));
    }

    public static List<PlacementModifier> onceEvery(int distance) {
        Builder<PlacementModifier> builder = ImmutableList.builder();
        builder.add(RarityFilter.onAverageOnceEvery(distance));

        builder.add(InSquarePlacement.spread());
        builder.add(PlacementUtils.HEIGHTMAP);
        builder.add(BiomeFilter.biome());
        return builder.build();
    }

    public static void init() {};
}