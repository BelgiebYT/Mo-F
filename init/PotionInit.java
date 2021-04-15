package com.belgieyt.morefeatures.init;

import com.belgieyt.morefeatures.MoreFeatures;
import net.java.games.input.Component;
import net.minecraft.item.Item;
import net.minecraft.potion.*;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Optional;

public class PotionInit extends Potion {

    public static final DeferredRegister<Effect> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS,
            MoreFeatures.MOD_ID);

    public static final DeferredRegister<Potion> POTION = DeferredRegister.create(ForgeRegistries.POTION_TYPES, MoreFeatures.MOD_ID);


}
