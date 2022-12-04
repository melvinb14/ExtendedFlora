package com.melvinbur.extendedflora.common;


import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.ComposterBlock;

public class CompostablesInit {

    public static void init() {
        //Plants & Bushes
        setCompostInfo(BlockInit.MORE_GRASS.get(), 0.1F);
        setCompostInfo(BlockInit.NETHER_PLANT.get(), 0.1F);
        setCompostInfo(BlockInit.ENDER_PLANT.get(), 0.1F);
        setCompostInfo(BlockInit.BUSH.get(), 0.1F);

        setCompostInfo(BlockInit.NETTLE.get(), 0.2F);
        setCompostInfo(BlockInit.FLAX.get(), 0.25F);
        setCompostInfo(BlockInit.GORSE.get(), 0.25F);
        setCompostInfo(BlockInit.GERANIUM.get(), 0.25F);
        setCompostInfo(BlockInit.BEACH_ASTER.get(), 0.28F);
        setCompostInfo(BlockInit.BEE_BALM.get(), 0.30F);
        setCompostInfo(BlockInit.BLAZING_STAR.get(), 0.35F);
        setCompostInfo(BlockInit.BROWN_EYES.get(), 0.26F);
        setCompostInfo(BlockInit.SCORPION_WEED.get(), 0.15F);


        setCompostInfo(BlockInit.AASLARD.get(), 0.28F);
        setCompostInfo(BlockInit.KRARD.get(), 0.31F);
        setCompostInfo(BlockInit.EAFRUS.get(), 0.30F);
        setCompostInfo(BlockInit.PHORE.get(), 0.33F);
        setCompostInfo(BlockInit.APHRIRE.get(), 0.34F);
        setCompostInfo(BlockInit.EEKORE.get(), 0.36F);
        setCompostInfo(BlockInit.IBINE.get(), 0.37F);
        setCompostInfo(BlockInit.ZOXARY.get(), 0.41F);
        setCompostInfo(BlockInit.DAWN_APISOS.get(), 0.45F);

        //Mushrooms
        setCompostInfo(BlockInit.IXTAL.get(), 0.8F);
        setCompostInfo(BlockInit.NOXUS.get(), 0.8F);
        setCompostInfo(BlockInit.DEMACIA.get(), 0.8F);





    }

    public static void setCompostInfo(ItemLike item, float chance) {
        ComposterBlock.COMPOSTABLES.put(item.asItem(), chance);
    }
}