package com.melvinbur.extendedflora.core.registry.world;


import com.melvinbur.extendedflora.ExtendedFlora;
import com.melvinbur.extendedflora.core.registry.world.modifiers.EFBiomeModifier;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Registry;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EFBiomeModifiers {
    public static final DeferredRegister<Codec<? extends BiomeModifier>> BIOME_MODIFIER_SERIALIZERS = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, ExtendedFlora.MOD_ID);

    public static final RegistryObject<Codec<EFBiomeModifier>> BIOME_MODIFIER_SERIALIZER = BIOME_MODIFIER_SERIALIZERS.register("biome_modifier_serializer",
            () -> RecordCodecBuilder.create(builder -> builder.group(
                    TagKey.codec(Registry.BIOME_REGISTRY).fieldOf("dimension").forGetter(EFBiomeModifier::dimension),
                    Biome.LIST_CODEC.listOf().fieldOf("biomes").forGetter(EFBiomeModifier::biomes),
                    Biome.LIST_CODEC.listOf().fieldOf("blacklist").forGetter(EFBiomeModifier::blacklist),
                    GenerationStep.Decoration.CODEC.fieldOf("decoration").forGetter(EFBiomeModifier::decoration),
                    PlacedFeature.CODEC.fieldOf("feature").forGetter(EFBiomeModifier::feature),
                    PrimitiveCodec.STRING.fieldOf("configOption").forGetter(EFBiomeModifier::configOption)
            ).apply(builder, EFBiomeModifier::new)));



}