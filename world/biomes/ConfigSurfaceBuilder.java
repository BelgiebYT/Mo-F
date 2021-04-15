package com.belgieyt.morefeatures.world.biomes;

import com.belgieyt.morefeatures.MoreFeatures;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class ConfigSurfaceBuilder {

    public static final ConfiguredSurfaceBuilder<net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig> FRUIT_FIELDS = register("ss_fruit_fields", MoSurfaceBuilder.FRUIT_FIELDS.get().func_242929_a(MoSurfaceBuilder.GRASS_GRASS_GRASS_CONFIG));


    private static <SC extends ISurfaceBuilderConfig> ConfiguredSurfaceBuilder<SC> register(String name,
                                                                                            ConfiguredSurfaceBuilder<SC> builder) {
        return WorldGenRegistries.register(WorldGenRegistries.CONFIGURED_SURFACE_BUILDER, new ResourceLocation(MoreFeatures.MOD_ID, name), builder);
    }

}
