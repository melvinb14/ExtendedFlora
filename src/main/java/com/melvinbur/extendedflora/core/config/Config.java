package com.melvinbur.extendedflora.core.config;


import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;

import java.util.HashMap;

public class Config {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final Data CONFIG_DATA = new Data(BUILDER);
    public static final ForgeConfigSpec CONFIG = BUILDER.build();

    public static class Data {

        public HashMap<String, ForgeConfigSpec.BooleanValue> configOptions = new HashMap<>();

        public ForgeConfigSpec.BooleanValue enableGorse;
        public ForgeConfigSpec.BooleanValue enableGeranium;
        public ForgeConfigSpec.BooleanValue enableBeachAster;
        public ForgeConfigSpec.BooleanValue enableBeeBalm;
        public ForgeConfigSpec.BooleanValue enableNettle;
        public ForgeConfigSpec.BooleanValue enableFlax;
        public ForgeConfigSpec.BooleanValue enableMoreGrass;
        public ForgeConfigSpec.BooleanValue enableBush;
        public ForgeConfigSpec.BooleanValue enableNoxus;
        public ForgeConfigSpec.BooleanValue enableIxtal;
        public ForgeConfigSpec.BooleanValue enableDemacia;
        public ForgeConfigSpec.BooleanValue enablePhore;
        public ForgeConfigSpec.BooleanValue enableEafrus;
        public ForgeConfigSpec.BooleanValue enableAaslard;
        public ForgeConfigSpec.BooleanValue enableKrard;
        public ForgeConfigSpec.BooleanValue enableNetherPlant;
        public ForgeConfigSpec.BooleanValue enableBlazingStar;
        public ForgeConfigSpec.BooleanValue enableBrownEyes;
        public ForgeConfigSpec.BooleanValue enableScorpionWeed;
        public ForgeConfigSpec.BooleanValue enableAphrire;
        public ForgeConfigSpec.BooleanValue enableDawnApisos;
        public ForgeConfigSpec.BooleanValue enableEekore;
        public ForgeConfigSpec.BooleanValue enableIbine;
        public ForgeConfigSpec.BooleanValue enableZoxary;
        public ForgeConfigSpec.BooleanValue enableEnderPlant;





        public Data(ForgeConfigSpec.Builder builder) {
            builder.push("Requires_game_restart");
            builder.comment("World Generation");
            builder.pop();

            //Overworld
            builder.push("Overworld");
            config("enableGorse", enableGorse, builder.comment("Enable generation of Gorse").define("enableGorse", true));
            config("enableGeranium", enableGeranium, builder.comment("Enable generation of Geranium").define("enableGeranium", true));
            config("enableBeachAster", enableBeachAster, builder.comment("Enable generation of Beach Aster").define("enableBeachAster", true));
            config("enableBeeBalm", enableBeeBalm, builder.comment("Enable generation of Bee Balm").define("enableBeeBalm", true));
            config("enableNettle", enableNettle, builder.comment("Enable generation of Nettle").define("enableNettle", true));
            config("enableFlax", enableFlax, builder.comment("Enable generation of Blue Flax").define("enableFlax", true));
            config("enableMoreGrass", enableMoreGrass, builder.comment("Enable generation of Plant").define("enableMoreGrass", true));
            config("enableBush", enableBush, builder.comment("Enable generation of Bush").define("enableBush", true));
            config("enableBlazingStar", enableBlazingStar, builder.comment("Enable generation of Blazing Star").define("enableBlazingStar", true));
            config("enableBrownEyes", enableBrownEyes, builder.comment("Enable generation of Brown Eyes").define("enableBrownEyes", true));
            config("enableScorpionWeed", enableScorpionWeed, builder.comment("Enable generation of Scorpion Weed").define("enableScorpionWeed", true));

            builder.pop();

            //Nether
            builder.push("Nether");
            config("enableNoxus", enableNoxus, builder.comment("Enable generation of Noxus").define("enableNoxus", true));
            config("enableIxtal", enableIxtal, builder.comment("Enable generation of Ixtal").define("enableIxtal", true));
            config("enableDemacia", enableDemacia, builder.comment("Enable generation of Demacia").define("enableDemacia", true));
            config("enablePhore", enablePhore, builder.comment("Enable generation of Phore").define("enablePhore", true));
            config("enableEafrus", enableEafrus, builder.comment("Enable generation of Eafrus").define("enableEafrus", true));
            config("enableAaslard", enableAaslard, builder.comment("Enable generation of Aaslard").define("enableAaslard", true));
            config("enableKrard", enableKrard, builder.comment("Enable generation of Krard").define("enableKrard", true));
            config("enableNetherPlant", enableNetherPlant, builder.comment("Enable generation of Nether Plant").define("enableNetherPlant", true));

            builder.pop();

            //End
            builder.push("End");
            config("enableAphrire", enableAphrire, builder.comment("Enable generation of Aphrire").define("enableAphrire", true));
            config("enableDawnApisos", enableDawnApisos, builder.comment("Enable generation of Dawn apisos").define("enableDawnApisos", true));
            config("enableEekore", enableEekore, builder.comment("Enable generation of Eekore").define("enableEekore", true));
            config("enableIbine", enableIbine, builder.comment("Enable generation of Ibine").define("enableIbine", true));
            config("enableZoxary", enableZoxary, builder.comment("Enable generation of Zoxary").define("enableZoxary", true));
            config("enableEnderPlant", enableEnderPlant, builder.comment("Enable generation of Ender Plant").define("enableEnderPlant", true));

            builder.pop();


        }

        private void config(String name, ForgeConfigSpec.BooleanValue spec, BooleanValue value) {
            configOptions.put(name, value);
        }
    }
}