package com.belgieyt.morefeatures.init;

import com.belgieyt.morefeatures.MoreFeatures;
import net.minecraft.stats.IStatFormatter;
import net.minecraft.stats.StatType;
import net.minecraft.stats.Stats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class StatsInit {

    public static final DeferredRegister<StatType<?>> STATS = DeferredRegister.create(ForgeRegistries.STAT_TYPES, MoreFeatures.MOD_ID);


    public static final ResourceLocation INSPECT_ADVANCER = registerCustom("inspect_advancer", IStatFormatter.DEFAULT);
    public static final ResourceLocation INSPECT_ITEM_PLINTHS = registerCustom("inspect_item_plinths", IStatFormatter.DEFAULT);

    private static ResourceLocation registerCustom(String key, IStatFormatter formatter) {
        ResourceLocation resourcelocation = new ResourceLocation(key);
        Registry.register(Registry.CUSTOM_STAT, key, resourcelocation);
        Stats.CUSTOM.get(resourcelocation, formatter);
        return resourcelocation;
    }

    private static <T> StatType<T> registerType(String key, Registry<T> registry) {
        return Registry.register(Registry.STATS, key, new StatType<>(registry));
    }
}
