package com.melvinbur.extendedflora.core.registry.world;


import com.melvinbur.extendedflora.ExtendedFlora;
import com.melvinbur.extendedflora.common.BlockInit;
import com.melvinbur.extendedflora.common.end.EndPlantBlock;
import com.melvinbur.extendedflora.common.nether.NetherPlantBlock;
import com.melvinbur.extendedflora.common.universal.PlantBlock;
import com.melvinbur.extendedflora.common.universal.ShortGrassBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.BiasedToBottomInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.RandomizedIntStateProvider;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class EFConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, ExtendedFlora.MOD_ID);

    // Overworld
    public static final RegistryObject<ConfiguredFeature<?, ?>> GORSE = register("gorse", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(41, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.GORSE.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> GERANIUM = register("geranium", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(29, 8, 5, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.GERANIUM.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> BEACH_ASTER = register("beach_aster", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(15, 15, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.BEACH_ASTER.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> BEE_BALM = register("bee_balm", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(9, 10, 4, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.BEE_BALM.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> BLAZING_STAR = register("blazing_star", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(13, 7, 5, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.BLAZING_STAR.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> BROWN_EYES = register("brown_eyes", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(19, 5, 8, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.BROWN_EYES.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> SCORPION_WEED = register("scorpion_weed", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(30, 6, 6, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.SCORPION_WEED.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETTLE = register("nettle", () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, randomPatchConfig(15, 7, 4, BlockInit.NETTLE.get().defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> FLAX = register("flax", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(15, 2, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.FLAX.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> MORE_GRASS = register("more_grass", () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new RandomizedIntStateProvider(BlockStateProvider.simple(BlockInit.MORE_GRASS.get()), ShortGrassBlock.MODEL, UniformInt.of(0, 6))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> BUSH = register("bush", () -> new ConfiguredFeature<>(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new RandomizedIntStateProvider(BlockStateProvider.simple(BlockInit.BUSH.get()), PlantBlock.MODEL, UniformInt.of(0, 3))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> DEMACIA = register("demacia", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(40, 0, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.DEMACIA.get()))))));




    // Nether
    public static final RegistryObject<ConfiguredFeature<?, ?>> PHORE = register("phore", () -> new ConfiguredFeature<>(Feature.NETHER_FOREST_VEGETATION, new NetherForestVegetationConfig(BlockStateProvider.simple(BlockInit.PHORE.get()), 6, 3)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> EAFRUS = register("eafrus", () -> new ConfiguredFeature<>(Feature.NETHER_FOREST_VEGETATION, new NetherForestVegetationConfig(BlockStateProvider.simple(BlockInit.EAFRUS.get()), 5, 4)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> AASLARD = register("aaslard", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(29, 1, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.AASLARD.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_PLANT = register("nether_plant", () ->  new ConfiguredFeature<>(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new RandomizedIntStateProvider(BlockStateProvider.simple(BlockInit.NETHER_PLANT.get()), NetherPlantBlock.MODEL, UniformInt.of(0, 2))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> KRARD = register("krard", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(29, 2, 5, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.KRARD.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NOXUS = register("noxus", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(31, 0, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.NOXUS.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> IXTAL = register("ixtal", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(45, 0, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.IXTAL.get()))))));


    // End
    public static final RegistryObject<ConfiguredFeature<?, ?>> APHRIRE = register("aphrire", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(24, 6, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.APHRIRE.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> DAWN_APISOS = register("dawn_apisos", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(12, 2, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.DAWN_APISOS.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> EEKORE = register("eekore", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(19, 9, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.EEKORE.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> IBINE = register("ibine", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(21, 1, 7, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.IBINE.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ZOXARY = register("zoxary", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(17, 3, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(BlockInit.ZOXARY.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ENDER_PLANT = register("ender_plant", () ->  new ConfiguredFeature<>(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new RandomizedIntStateProvider(BlockStateProvider.simple(BlockInit.ENDER_PLANT.get()), EndPlantBlock.MODEL, UniformInt.of(0, 2))))));

    public static <FC extends FeatureConfiguration, F extends Feature<FC>> RegistryObject<ConfiguredFeature<?, ?>> register(String name, Supplier<ConfiguredFeature<?, ?>> configuredFeature) {
        return CONFIGURED_FEATURES.register(name, configuredFeature);
    }

    private static RandomPatchConfiguration randomPatchConfig(int tries, int xzSpread, int ySpread, BlockState block) {
        return new RandomPatchConfiguration(tries, xzSpread, ySpread, PlacementUtils.filtered(EFFeatures.SIMPLE_BLOCK_MATCH_WATER.get(),
                new SimpleBlockConfiguration(BlockStateProvider.simple(block)), BlockPredicate.allOf(BlockPredicate.replaceable(),
                        BlockPredicate.not(BlockPredicate.matchesBlocks(new BlockPos(0, -1, 0), Blocks.ICE)),
                        BlockPredicate.not(BlockPredicate.matchesBlocks(new BlockPos(0, 0, 0), Blocks.SNOW)),
                        BlockPredicate.not(BlockPredicate.matchesFluids(new BlockPos(0, 0, 0), Fluids.LAVA)),
                        BlockPredicate.not(BlockPredicate.matchesFluids(new BlockPos(0, 0, 0), Fluids.WATER)))));
    }

    private static RandomPatchConfiguration cattailConfig(int tries, int xzSpread, int ySpread, BlockState block) {
        return new RandomPatchConfiguration(tries, xzSpread, ySpread, PlacementUtils.filtered(EFFeatures.SIMPLE_BLOCK_MATCH_WATER.get(),
                new SimpleBlockConfiguration(BlockStateProvider.simple(block)), BlockPredicate.allOf(BlockPredicate.replaceable(),
                        BlockPredicate.not(BlockPredicate.matchesBlocks(new BlockPos(0, -1, 0), Blocks.ICE)),
                        BlockPredicate.not(BlockPredicate.matchesBlocks(new BlockPos(0, 0, 0), Blocks.SNOW)),
                        BlockPredicate.not(BlockPredicate.matchesFluids(new BlockPos(0, 0, 0), Fluids.LAVA)))));
    }




    private static RandomPatchConfiguration simpleRandomPatch(BlockState blockstate) {
        return FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(blockstate)));
    }

    public static RandomPatchConfiguration simpleRandomPatch(BlockStateProvider provider) {
        return FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(provider));
    }

    private static RandomPatchConfiguration columnPlantWithFluid(int tries, int xzspread, int yspread, Block block, Fluid fluid1, Fluid fluid2) {
        return new RandomPatchConfiguration(tries, xzspread, yspread, PlacementUtils.filtered(Feature.BLOCK_COLUMN, BlockColumnConfiguration.simple(BiasedToBottomInt.of(2, 4), BlockStateProvider.simple(block)),
                BlockPredicate.allOf(BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                        BlockPredicate.wouldSurvive(block.defaultBlockState(), BlockPos.ZERO),
                        BlockPredicate.anyOf(BlockPredicate.matchesFluids(new BlockPos(1, -1, 0), List.of(fluid1, fluid2)),
                                BlockPredicate.matchesFluids(new BlockPos(-1, -1, 0), List.of(fluid1, fluid2)),
                                BlockPredicate.matchesFluids(new BlockPos(0, -1, 1), List.of(fluid1, fluid2)),
                                BlockPredicate.matchesFluids(new BlockPos(0, -1, -1), List.of(fluid1, fluid2))))));
    }

}