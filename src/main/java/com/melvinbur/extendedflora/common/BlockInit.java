package com.melvinbur.extendedflora.common;

import com.melvinbur.extendedflora.ExtendedFlora;
import com.melvinbur.extendedflora.common.blockbench.DemaciaBlock;
import com.melvinbur.extendedflora.common.blockbench.IxtalBlock;
import com.melvinbur.extendedflora.common.blockbench.NoxusBlock;
import com.melvinbur.extendedflora.common.end.EndFlowerBlock;
import com.melvinbur.extendedflora.common.end.EndPlantBlock;
import com.melvinbur.extendedflora.common.nether.NetherFlowerBlock;
import com.melvinbur.extendedflora.common.nether.NetherPlantBlock;
import com.melvinbur.extendedflora.common.overworld.DesertFlowerBlock;
import com.melvinbur.extendedflora.common.overworld.FlaxCropBlock;
import com.melvinbur.extendedflora.common.universal.PlantBlock;
import com.melvinbur.extendedflora.common.universal.ShortGrassBlock;
import com.melvinbur.extendedflora.common.universal.ThornsBlock;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;
import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ExtendedFlora.MOD_ID);

    /* Ideas
    * Ryegrass(end)
    *
    * Bush(all)
    * Bulbs(all)
    * Bog plants(all)
    * Flowers(all)
    *
    *
    *
    * */



    /* CROPS */
    public static final RegistryObject<Block> FLAX_CROP = BLOCKS.register("flax_crop",
            () -> new FlaxCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));




    /* OVERWORLD FLORA */
    public static final RegistryObject<Block> MORE_GRASS = registerBlock("more_grass", ShortGrassBlock::new);

    // Desert || Beach
    public static final RegistryObject<Block> FLAX = registerBlock("flax", DesertFlowerBlock::new);
    public static final RegistryObject<Block> GORSE = registerBlock("gorse", DesertFlowerBlock::new);
    public static final RegistryObject<Block> GERANIUM = registerBlock("geranium", DesertFlowerBlock::new);
    public static final RegistryObject<Block> BEACH_ASTER = registerBlock("beach_aster", DesertFlowerBlock::new);
    public static final RegistryObject<Block> BEE_BALM = registerBlock("bee_balm", DesertFlowerBlock::new);
    public static final RegistryObject<Block> BLAZING_STAR = registerBlock("blazing_star", DesertFlowerBlock::new);
    public static final RegistryObject<Block> BROWN_EYES = registerBlock("brown_eyes", DesertFlowerBlock::new);
    public static final RegistryObject<Block> SCORPION_WEED = registerBlock("scorpion_weed", DesertFlowerBlock::new);


    // Forest
    public static final RegistryObject<Block> NETTLE = registerBlock("nettle", ThornsBlock::new);
    public static final RegistryObject<Block> BUSH = registerBlock("bush", PlantBlock::new);
    public static final RegistryObject<Block> DEMACIA = registerBlock("demacia", DemaciaBlock::new);




    /* NETHER FLORA */
    public static final RegistryObject<Block> IXTAL = registerBlock("ixtal", IxtalBlock::new);
    public static final RegistryObject<Block> AASLARD = registerBlock("aaslard", NetherFlowerBlock::new);
    public static final RegistryObject<Block> KRARD = registerBlock("krard", NetherFlowerBlock::new);

    public static final RegistryObject<Block> NETHER_PLANT = registerBlock("nether_plant", NetherPlantBlock::new);

    // Forest
    public static final RegistryObject<Block> EAFRUS = registerBlock("eafrus", NetherFlowerBlock::new);
    public static final RegistryObject<Block> PHORE = registerBlock("phore", NetherFlowerBlock::new);

    // Soul Sand Valley
    public static final RegistryObject<Block> NOXUS = registerBlock("noxus", NoxusBlock::new);


    /* END FLORA */
    public static final RegistryObject<Block> ENDER_PLANT = registerBlock("ender_plant", EndPlantBlock::new);
    public static final RegistryObject<Block> APHRIRE = registerBlock("aphrire", EndFlowerBlock::new);
    public static final RegistryObject<Block> EEKORE = registerBlock("eekore", EndFlowerBlock::new);
    public static final RegistryObject<Block> IBINE = registerBlock("ibine", EndFlowerBlock::new);
    public static final RegistryObject<Block> ZOXARY = registerBlock("zoxary", EndFlowerBlock::new);

    // Small Island
    public static final RegistryObject<Block> DAWN_APISOS = registerBlock("dawn_apisos", EndFlowerBlock::new);



    /* MISC */
    public static final RegistryObject<Block> POTTED_GORSE = registerBlockWithoutItem("potted_gorse", () -> createFlowerPot(GORSE.get()));
    public static final RegistryObject<Block> POTTED_GERANIUM = registerBlockWithoutItem("potted_geranium", () -> createFlowerPot(GERANIUM.get()));
    public static final RegistryObject<Block> POTTED_BEACH_ASTER = registerBlockWithoutItem("potted_beach_aster", () -> createFlowerPot(BEACH_ASTER.get()));
    public static final RegistryObject<Block> POTTED_BEE_BALM = registerBlockWithoutItem("potted_bee_balm", () -> createFlowerPot(BEE_BALM.get()));
    public static final RegistryObject<Block> POTTED_FLAX = registerBlockWithoutItem("potted_flax", () -> createFlowerPot(FLAX.get()));
    public static final RegistryObject<Block> POTTED_BLAZING_STAR = registerBlockWithoutItem("potted_blazing_star", () -> createFlowerPot(BLAZING_STAR.get()));
    public static final RegistryObject<Block> POTTED_BROWN_EYES = registerBlockWithoutItem("potted_brown_eyes", () -> createFlowerPot(BROWN_EYES.get()));
    public static final RegistryObject<Block> POTTED_SCORPION_WEED = registerBlockWithoutItem("potted_scorpion_weed", () -> createFlowerPot(SCORPION_WEED.get()));
    public static final RegistryObject<Block> POTTED_DEMACIA = registerBlockWithoutItem("potted_demacia", () -> createFlowerPot(DEMACIA.get()));
    public static final RegistryObject<Block> POTTED_IXTAL = registerBlockWithoutItem("potted_ixtal", () -> createFlowerPot(IXTAL.get()));
    public static final RegistryObject<Block> POTTED_PHORE = registerBlockWithoutItem("potted_phore", () -> createFlowerPot(PHORE.get()));
    public static final RegistryObject<Block> POTTED_AASLARD = registerBlockWithoutItem("potted_aaslard", () -> createFlowerPot(AASLARD.get()));
    public static final RegistryObject<Block> POTTED_KRARD = registerBlockWithoutItem("potted_krard", () -> createFlowerPot(KRARD.get()));
    public static final RegistryObject<Block> POTTED_EAFRUS = registerBlockWithoutItem("potted_eafrus", () -> createFlowerPot(EAFRUS.get()));
    public static final RegistryObject<Block> POTTED_APHRIRE = registerBlockWithoutItem("potted_aphrire", () -> createFlowerPot(APHRIRE.get()));
    public static final RegistryObject<Block> POTTED_NOXUS = registerBlockWithoutItem("potted_noxus", () -> createFlowerPot(NOXUS.get()));
    public static final RegistryObject<Block> POTTED_EEKORE = registerBlockWithoutItem("potted_eekore", () -> createFlowerPot(EEKORE.get()));
    public static final RegistryObject<Block> POTTED_IBINE = registerBlockWithoutItem("potted_ibine", () -> createFlowerPot(IBINE.get()));
    public static final RegistryObject<Block> POTTED_ZOXARY = registerBlockWithoutItem("potted_zoxary", () -> createFlowerPot(ZOXARY.get()));
    public static final RegistryObject<Block> POTTED_DAWN_APISOS = registerBlockWithoutItem("potted_dawn_apisos", () -> createFlowerPot(DAWN_APISOS.get()));








    private static RegistryObject<Block> registerBlock(String name, Supplier<Block> block) {
        RegistryObject<Block> temp = BLOCKS.register(name, block);

        ItemInit.ITEMS.register(name, () -> new ItemNameBlockItem(temp.get(), new Item.Properties().tab(CreativeModeTabInit.EXTENDEDFLORA_TAB)));
        return temp;
    }

    private static RegistryObject<Block> registerBlock(String name, Supplier<Item> item, Supplier<Block> block) {
        RegistryObject<Block> temp = BLOCKS.register(name, block);

        ItemInit.ITEMS.register(name, item);
        return temp;
    }

    private static RegistryObject<Block> registerBlockWithoutItem(String name, Supplier<Block> block) {
        return BLOCKS.register(name, block);
    }





    public static Block createFlowerPot(Block plant) {
        Block block = new FlowerPotBlock(() -> (FlowerPotBlock)Blocks.FLOWER_POT, ()-> plant, BlockBehaviour.Properties.copy(Blocks.FLOWER_POT));
        ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(plant)), () -> block);
        return block;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
