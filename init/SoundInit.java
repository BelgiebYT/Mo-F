package com.belgieyt.morefeatures.init;

import com.belgieyt.morefeatures.MoreFeatures;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundInit {


        public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MoreFeatures.MOD_ID);

        public static final RegistryObject<SoundEvent> MUSHROOM_BOSS_WALKING = SOUNDS.register("entity.mushroomboss.walking",
                () -> new SoundEvent(new ResourceLocation(MoreFeatures.MOD_ID, "entity.mushroomboss.walking")));

    public static final RegistryObject<SoundEvent> MUSHROOM_BOSS_HURT = SOUNDS.register("entity.mushroomboss.hurt",
            () -> new SoundEvent(new ResourceLocation(MoreFeatures.MOD_ID, "entity.mushroomboss.hurt")));

    public static final RegistryObject<SoundEvent> TEA_DRINK = SOUNDS.register("item.honey_bottle.drink",
            () -> new SoundEvent(new ResourceLocation(MoreFeatures.MOD_ID, "item.honey_bottle.drink")));

    public static final RegistryObject<SoundEvent> FRUIT_FIELD_AMBIENT = SOUNDS.register("misc.fruit_fields.ambient",
            () -> new SoundEvent(new ResourceLocation(MoreFeatures.MOD_ID, "misc.fruit_fields.ambient")));
}
