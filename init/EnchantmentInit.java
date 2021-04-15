package com.belgieyt.morefeatures.init;

import com.belgieyt.morefeatures.MoreFeatures;
import com.belgieyt.morefeatures.enchantments.AdvancedSilkTouch;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EnchantmentInit {

    public static DeferredRegister<Enchantment> ENCHANTMENT = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MoreFeatures.MOD_ID);

    public static final RegistryObject<Enchantment> ADVANCED_SILK_TOUCH = ENCHANTMENT.register("advanced_silk_touch",() -> new AdvancedSilkTouch(Enchantment.Rarity.VERY_RARE, EquipmentSlotType.MAINHAND));

}
