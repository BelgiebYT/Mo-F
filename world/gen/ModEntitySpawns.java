package com.belgieyt.morefeatures.world.gen;


import com.belgieyt.morefeatures.MoreFeatures;
import com.belgieyt.morefeatures.init.BiomeInit;
import com.belgieyt.morefeatures.init.ModEntityTypes;
import com.belgieyt.morefeatures.util.BiomeUtil;
import com.belgieyt.morefeatures.world.features.FlowerFeature;
import net.minecraft.entity.EntityClassification;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MoreFeatures.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntitySpawns {


    public static void addSpawnsToBiomes(BiomeLoadingEvent biomes) {
        ResourceLocation biomeName = biomes.getName();

        if (BiomeUtil.matchesKeys(biomeName, BiomeInit.Keys.FRUIT_FIELDS_KEY)) {
            biomes.getSpawns().getCost(ModEntityTypes.devilcow.get()).getMaxSpawnCost();
        }
}
}






