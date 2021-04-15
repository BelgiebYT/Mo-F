package com.belgieyt.morefeatures.world.biomes;

import com.belgieyt.morefeatures.MoreFeatures;
import com.belgieyt.morefeatures.world.features.FruitFieldsSurfaceBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = MoreFeatures.MOD_ID)
public  class MoSurfaceBuilder <C extends ISurfaceBuilderConfig> extends net.minecraftforge.registries.ForgeRegistryEntry<SurfaceBuilder<?>> {


    public static final DeferredRegister<SurfaceBuilder<?>> SURFACE_BUILDER = DeferredRegister.create(ForgeRegistries.SURFACE_BUILDERS, MoreFeatures.MOD_ID);

    public static final RegistryObject<SurfaceBuilder<SurfaceBuilderConfig>> FRUIT_FIELDS = SURFACE_BUILDER.register("fruit_fields", () -> new FruitFieldsSurfaceBuilder(SurfaceBuilderConfig.field_237203_a_));


    public static final SurfaceBuilderConfig MOSS_GRASS_GRASS_CONFIG = new SurfaceBuilderConfig( BlockInit.MOSS_BLOCK.get().getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState());

    public static final SurfaceBuilderConfig GRASS_GRASS_GRASS_CONFIG = new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState());

}


