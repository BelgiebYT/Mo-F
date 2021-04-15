package com.belgieyt.morefeatures.init;

import com.belgieyt.morefeatures.MoreFeatures;
import com.belgieyt.morefeatures.armor.ModArmourMaterial;
import com.belgieyt.morefeatures.items.*;
import net.minecraft.fluid.Fluids;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {


    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreFeatures.MOD_ID);


    // Items
    public static final RegistryObject<Item> STRAWBERRY_LEATHER = ITEMS.register("strawberry_leather", ItemBase::new);
    public static final RegistryObject<StrawberryBasket> STRAWBERRY_BASKET = ITEMS.register("strawberry_basket", StrawberryBasket::new);
    public static final RegistryObject<Item> BASKET = ITEMS.register("basket", ItemBase::new);
    public static final RegistryObject<Item> LEMON_LEATHER = ITEMS.register("lemon_leather", ItemBase::new);
    public static final RegistryObject<LemonBasket> LEMON_BASKET = ITEMS.register("lemon_basket", LemonBasket::new);
    public static final RegistryObject<Lemon> LEMON = ITEMS.register("lemon", Lemon::new);
    public static final RegistryObject<StrawberryBasket> BLUEBERRY_BASKET = ITEMS.register("blueberry_basket", StrawberryBasket::new);
    public static final RegistryObject<Item> BLUEBERRY_LEATHER = ITEMS.register("blueberry_leather", ItemBase::new);
    public static final RegistryObject<Item> BERRY_LEATHER = ITEMS.register("berry_leather", ItemBase::new);
    public static final RegistryObject<StrawberryBasket> BERRY_BASKET = ITEMS.register("berry_basket", StrawberryBasket::new);
    public static final RegistryObject<Item> PUMPKIN_LEATHER = ITEMS.register("pumpkin_leather", ItemBase::new);
    public static final RegistryObject<StrawberryBasket> PUMPKIN_BASKET = ITEMS.register("pumpkin_basket", StrawberryBasket::new);
    public static final RegistryObject<Item> MELON_LEATHER = ITEMS.register("melon_leather", ItemBase::new);
    public static final RegistryObject<StrawberryBasket> MELON_BASKET = ITEMS.register("melon_basket", StrawberryBasket::new);
    public static final RegistryObject<Item> KIWI_LEATHER = ITEMS.register("kiwi_leather", ItemBase::new);
    public static final RegistryObject<StrawberryBasket> KIWI_BASKET = ITEMS.register("kiwi_basket", StrawberryBasket::new);
    public static final RegistryObject<Item> BLACKBERRY_LEATHER = ITEMS.register("blackberry_leather", ItemBase::new);
    public static final RegistryObject<StrawberryBasket> BLACKBERRY_BASKET = ITEMS.register("blackberry_basket", StrawberryBasket::new);
    public static final RegistryObject<Item> PEACH_LEATHER = ITEMS.register("peach_leather", ItemBase::new);
    public static final RegistryObject<StrawberryBasket> PEACH_BASKET = ITEMS.register("peach_basket", StrawberryBasket::new);
    public static final RegistryObject<Item> MANGO_LEATHER = ITEMS.register("mango_leather", ItemBase::new);
    public static final RegistryObject<StrawberryBasket> MANGO_BASKET = ITEMS.register("mango_basket", StrawberryBasket::new);
    public static final RegistryObject<WitchHat> WITCH_HAT = ITEMS.register("witch_hat", WitchHat::new);
    public static final RegistryObject<DevilCoal> DEVIL_COAL = ITEMS.register("devil_coal", DevilCoal::new);
    public static final RegistryObject<Antlers> ANTLERS = ITEMS.register("antlers", Antlers::new);
    public static final RegistryObject<NetheriteApple> NETHERITE_APPLE = ITEMS.register("netherite_apple", NetheriteApple::new);
    public static final RegistryObject<BastionEyeItem> BASTION_EYE_ITEM = ITEMS.register("bastion_eye", BastionEyeItem::new);
    public static final RegistryObject<FortressEyeItem> FORTRESS_EYE_ITEM = ITEMS.register("fortress_eye", FortressEyeItem::new);
    public static final RegistryObject<CityEyeItem> CITY_EYE_ITEM = ITEMS.register("city_eye", CityEyeItem::new);
    public static final RegistryObject<Molten> MOLTEN = ITEMS.register("molten", Molten::new);
    public static final RegistryObject<Item> END_BLAZE_ROD = ITEMS.register("end_blaze_rod", ItemBaseNew::new);
    public static final RegistryObject<Item> END_BLAZE_POWDER = ITEMS.register("end_blaze_powder", ItemBaseNew::new);
    public static final RegistryObject<HasteApple> HASTE_APPLE = ITEMS.register("haste_apple", HasteApple::new);
    public static final RegistryObject<LuckApple> LUCK_APPLE = ITEMS.register("luck_apple", LuckApple::new);
    public static final RegistryObject<Item> LUCK_SHARD = ITEMS.register("luck_shard", ItemBaseNew::new);
    public static final RegistryObject<Item> HASTE_SHARD = ITEMS.register("haste_shard", ItemBaseNew::new);
    public static final RegistryObject<Item> ADVANCED_SHEARS = ITEMS.register("advanced_shears", () -> new ShearsItem((new Item.Properties()).maxDamage(576).group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<Item> ADVANCED_FLINT_AND_STEEL = ITEMS.register("advanced_flint_and_steel", () -> new FlintAndSteelItem((new Item.Properties()).maxDamage(128).group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<Item> ADVANCED_FISHING_ROD = ITEMS.register("advanced_fishing_rod", () -> new FishingRodItem((new Item.Properties()).maxDamage(128).group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<Item> ADVANCED_GLASS_BOTTLE = ITEMS.register("advanced_glass_bottle", () -> new AdvancedGlassBottleItem((new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup2.ITEMS)));
    public static final RegistryObject<Item> ADVANCED_LAVA_BOTTLE = ITEMS.register("advanced_lava_bottle", LavaBottle::new);
    public static final RegistryObject<Item> BONDED_LEATHER = ITEMS.register("bonded_leather", ItemBaseNew::new);
    public static final RegistryObject<Item> BETTER_BONE_MEAL = ITEMS.register("better_bone_meal", () -> new BetterBoneMeal((new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup2.ITEMS)));
    public static final RegistryObject<Item> ENHANCED_EGG = ITEMS.register("enhanced_egg", ItemBaseNew::new);
    public static final RegistryObject<BucketItem> HEALING_WATER_BUCKET = ITEMS.register("healing_water_bucket", () -> new BucketItem(() -> FluidInit.HEALING_WATER.get(), new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup2.ITEMS).maxStackSize(1)));
    public static final RegistryObject<BucketItem> HASTE_WATER_BUCKET = ITEMS.register("haste_water_bucket", () -> new BucketItem(() -> FluidInit.HASTE_WATER.get(), new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup2.ITEMS).maxStackSize(1)));


    //Mob Spawn Egg
    public static final RegistryObject<ModSpawnEggItem> STRAWBERRYCOW_SPAWN_EGG = ITEMS.register("strawberrycow_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.strawberrycow, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup4.SPAWN_EGGS)));
    public static final RegistryObject<ModSpawnEggItem> LEMONCOW_SPAWN_EGG = ITEMS.register("lemoncow_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.lemoncow, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup4.SPAWN_EGGS)));
    public static final RegistryObject<ModSpawnEggItem> BLUEBERRYCOW_SPAWN_EGG = ITEMS.register("blueberrycow_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.blueberrycow, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup4.SPAWN_EGGS)));
    public static final RegistryObject<ModSpawnEggItem> BERRYCOW_SPAWN_EGG = ITEMS.register("berrycow_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.berrycow, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup4.SPAWN_EGGS)));
    public static final RegistryObject<ModSpawnEggItem> PUMPKINCOW_SPAWN_EGG = ITEMS.register("pumpkincow_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.pumpkincow, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup4.SPAWN_EGGS)));
    public static final RegistryObject<ModSpawnEggItem> MELONCOW_SPAWN_EGG = ITEMS.register("meloncow_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.meloncow, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup4.SPAWN_EGGS)));
    public static final RegistryObject<ModSpawnEggItem> KIWICOW_SPAWN_EGG = ITEMS.register("kiwicow_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.kiwicow, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup4.SPAWN_EGGS)));
    public static final RegistryObject<ModSpawnEggItem> MANGOCOW_SPAWN_EGG = ITEMS.register("mangocow_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.mangocow, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup4.SPAWN_EGGS)));
    public static final RegistryObject<ModSpawnEggItem> PEACHCOW_SPAWN_EGG = ITEMS.register("peachcow_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.peachcow, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup4.SPAWN_EGGS)));
    public static final RegistryObject<ModSpawnEggItem> BLACKBERRYCOW_SPAWN_EGG = ITEMS.register("blackberrycow_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.blackberrycow, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup4.SPAWN_EGGS)));
    public static final RegistryObject<ModSpawnEggItem> DEVILCOW_SPAWN_EGG = ITEMS.register("devilcow_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.devilcow, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup4.SPAWN_EGGS)));
    public static final RegistryObject<ModSpawnEggItem> JOLLYLLAMA_SPAWN_EGG = ITEMS.register("jollyllama_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.jollyllama, 0x00FF00, 0xFF0000, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup4.SPAWN_EGGS)));
    public static final RegistryObject<ModSpawnEggItem> BONESPIDER_SPAWN_EGG = ITEMS.register("bonespider_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.bonespider, 0x000000, 0xFFFFFF, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup4.SPAWN_EGGS)));
    public static final RegistryObject<ModSpawnEggItem> JUMBORABBIT_SPAWN_EGG = ITEMS.register("jumborabbit_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.jumborabbit, 0xECAD72, 0x3E1E00, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup4.SPAWN_EGGS)));
    public static final RegistryObject<ModSpawnEggItem> BONEDOG_SPAWN_EGG = ITEMS.register("bonedog_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.bonedog, 0xFFFFFF, 0x000000, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup4.SPAWN_EGGS)));
    public static final RegistryObject<ModSpawnEggItem> REDTOADSTOOL_SPAWN_EGG = ITEMS.register("redtoadstool_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.redtoadstool, 0xC2BCAC, 0xC92B29, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup4.SPAWN_EGGS)));
    public static final RegistryObject<ModSpawnEggItem> BROWNTOADSTOOL_SPAWN_EGG = ITEMS.register("browntoadstool_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.browntoadstool, 0xC2BCAC, 0x977251, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup4.SPAWN_EGGS)));
    public static final RegistryObject<ModSpawnEggItem> ENDBLAZE_SPAWN_EGG = ITEMS.register("endblaze_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.endblaze, 0x16711805, 0x12976383, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup4.SPAWN_EGGS)));


    //Armour
    public static final RegistryObject<ArmorItem> STRAWBERRY_HELMET = ITEMS.register("strawberry_helmet", () -> new ArmorItem(ModArmourMaterial.STRAWBERRYA,
            EquipmentSlotType.HEAD, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> STRAWBERRY_CHESTPLATE = ITEMS.register("strawberry_chestplate", () -> new ArmorItem(ModArmourMaterial.STRAWBERRYA,
            EquipmentSlotType.CHEST, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> STRAWBERRY_LEGGINGS = ITEMS.register("strawberry_leggings", () -> new ArmorItem(ModArmourMaterial.STRAWBERRYA,
            EquipmentSlotType.LEGS, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> STRAWBERRY_BOOTS = ITEMS.register("strawberry_boots", () -> new ArmorItem(ModArmourMaterial.STRAWBERRYA,
            EquipmentSlotType.FEET, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> LEMON_HELMET = ITEMS.register("lemon_helmet", () -> new ArmorItem(ModArmourMaterial.LEMONA,
            EquipmentSlotType.HEAD, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> LEMON_CHESTPLATE = ITEMS.register("lemon_chestplate", () -> new ArmorItem(ModArmourMaterial.LEMONA,
            EquipmentSlotType.CHEST, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> LEMON_LEGGINGS = ITEMS.register("lemon_leggings", () -> new ArmorItem(ModArmourMaterial.LEMONA,
            EquipmentSlotType.LEGS, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> LEMON_BOOTS = ITEMS.register("lemon_boots", () -> new ArmorItem(ModArmourMaterial.LEMONA,
            EquipmentSlotType.FEET, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> BLUEBERRY_HELMET = ITEMS.register("blueberry_helmet", () -> new ArmorItem(ModArmourMaterial.BLUEBERRYA,
            EquipmentSlotType.HEAD, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> BLUEBERRY_CHESTPLATE = ITEMS.register("blueberry_chestplate", () -> new ArmorItem(ModArmourMaterial.BLUEBERRYA,
            EquipmentSlotType.CHEST, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> BLUEBERRY_LEGGINGS = ITEMS.register("blueberry_leggings", () -> new ArmorItem(ModArmourMaterial.BLUEBERRYA,
            EquipmentSlotType.LEGS, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> BLUEBERRY_BOOTS = ITEMS.register("blueberry_boots", () -> new ArmorItem(ModArmourMaterial.BLUEBERRYA,
            EquipmentSlotType.FEET, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> BERRY_HELMET = ITEMS.register("berry_helmet", () -> new ArmorItem(ModArmourMaterial.BERRYA,
            EquipmentSlotType.HEAD, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> BERRY_CHESTPLATE = ITEMS.register("berry_chestplate", () -> new ArmorItem(ModArmourMaterial.BERRYA,
            EquipmentSlotType.CHEST, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> BERRY_LEGGINGS = ITEMS.register("berry_leggings", () -> new ArmorItem(ModArmourMaterial.BERRYA,
            EquipmentSlotType.LEGS, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> BERRY_BOOTS = ITEMS.register("berry_boots", () -> new ArmorItem(ModArmourMaterial.BERRYA,
            EquipmentSlotType.FEET, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> PUMPKIN_HELMET = ITEMS.register("pumpkin_helmet", () -> new ArmorItem(ModArmourMaterial.PUMPKINA,
            EquipmentSlotType.HEAD, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> PUMPKIN_CHESTPLATE = ITEMS.register("pumpkin_chestplate", () -> new ArmorItem(ModArmourMaterial.PUMPKINA,
            EquipmentSlotType.CHEST, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> PUMPKIN_LEGGINGS = ITEMS.register("pumpkin_leggings", () -> new ArmorItem(ModArmourMaterial.PUMPKINA,
            EquipmentSlotType.LEGS, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> PUMPKIN_BOOTS = ITEMS.register("pumpkin_boots", () -> new ArmorItem(ModArmourMaterial.PUMPKINA,
            EquipmentSlotType.FEET, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> MELON_HELMET = ITEMS.register("melon_helmet", () -> new ArmorItem(ModArmourMaterial.MELONA,
            EquipmentSlotType.HEAD, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> MELON_CHESTPLATE = ITEMS.register("melon_chestplate", () -> new ArmorItem(ModArmourMaterial.MELONA,
            EquipmentSlotType.CHEST, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> MELON_LEGGINGS = ITEMS.register("melon_leggings", () -> new ArmorItem(ModArmourMaterial.MELONA,
            EquipmentSlotType.LEGS, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> MELON_BOOTS = ITEMS.register("melon_boots", () -> new ArmorItem(ModArmourMaterial.MELONA,
            EquipmentSlotType.FEET, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> KIWI_HELMET = ITEMS.register("kiwi_helmet", () -> new ArmorItem(ModArmourMaterial.KIWIA,
            EquipmentSlotType.HEAD, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> KIWI_CHESTPLATE = ITEMS.register("kiwi_chestplate", () -> new ArmorItem(ModArmourMaterial.KIWIA,
            EquipmentSlotType.CHEST, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> KIWI_LEGGINGS = ITEMS.register("kiwi_leggings", () -> new ArmorItem(ModArmourMaterial.KIWIA,
            EquipmentSlotType.LEGS, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> KIWI_BOOTS = ITEMS.register("kiwi_boots", () -> new ArmorItem(ModArmourMaterial.KIWIA,
            EquipmentSlotType.FEET, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> MANGO_HELMET = ITEMS.register("mango_helmet", () -> new ArmorItem(ModArmourMaterial.MANGOA,
            EquipmentSlotType.HEAD, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> MANGO_CHESTPLATE = ITEMS.register("mango_chestplate", () -> new ArmorItem(ModArmourMaterial.MANGOA,
            EquipmentSlotType.CHEST, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> MANGO_LEGGINGS = ITEMS.register("mango_leggings", () -> new ArmorItem(ModArmourMaterial.MANGOA,
            EquipmentSlotType.LEGS, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> MANGO_BOOTS = ITEMS.register("mango_boots", () -> new ArmorItem(ModArmourMaterial.MANGOA,
            EquipmentSlotType.FEET, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> PEACH_HELMET = ITEMS.register("peach_helmet", () -> new ArmorItem(ModArmourMaterial.PEACHA,
            EquipmentSlotType.HEAD, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> PEACH_CHESTPLATE = ITEMS.register("peach_chestplate", () -> new ArmorItem(ModArmourMaterial.PEACHA,
            EquipmentSlotType.CHEST, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> PEACH_LEGGINGS = ITEMS.register("peach_leggings", () -> new ArmorItem(ModArmourMaterial.PEACHA,
            EquipmentSlotType.LEGS, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> PEACH_BOOTS = ITEMS.register("peach_boots", () -> new ArmorItem(ModArmourMaterial.PEACHA,
            EquipmentSlotType.FEET, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> BLACKBERRY_HELMET = ITEMS.register("blackberry_helmet", () -> new ArmorItem(ModArmourMaterial.BLACKBERRYA,
            EquipmentSlotType.HEAD, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> BLACKBERRY_CHESTPLATE = ITEMS.register("blackberry_chestplate", () -> new ArmorItem(ModArmourMaterial.BLACKBERRYA,
            EquipmentSlotType.CHEST, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> BLACKBERRY_LEGGINGS = ITEMS.register("blackberry_leggings", () -> new ArmorItem(ModArmourMaterial.BLACKBERRYA,
            EquipmentSlotType.LEGS, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ArmorItem> BLACKBERRY_BOOTS = ITEMS.register("blackberry_boots", () -> new ArmorItem(ModArmourMaterial.BLACKBERRYA,
            EquipmentSlotType.FEET, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));


    // Tools
    public static final RegistryObject<SwordItem> DIAMOND_KARAMBIT = ITEMS.register("diamond_karambit", () ->
            new SwordItem(ItemTier.DIAMOND, 3, 4.0F, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ToolItem> DIAMOND_PICKAXEOL = ITEMS.register("diamond_pickaxeol", () ->
            new Pickaxelol(ItemTier.DIAMOND, 1, -2.8F, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<SwordItem> WOOD_KARAMBIT = ITEMS.register("wood_karambit", () ->
            new SwordItem(ItemTier.WOOD, 3, 0.0F, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<SwordItem> STONE_KARAMBIT = ITEMS.register("stone_karambit", () ->
            new SwordItem(ItemTier.STONE, 3, 1.0F, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<SwordItem> GOLD_KARAMBIT = ITEMS.register("gold_karambit", () ->
            new SwordItem(ItemTier.GOLD, 3, 3.0F, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<SwordItem> IRON_KARAMBIT = ITEMS.register("iron_karambit", () ->
            new SwordItem(ItemTier.IRON, 3, 3.0F, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<SwordItem> NETHERITE_KARAMBIT = ITEMS.register("netherite_karambit", () ->
            new SwordItem(ItemTier.NETHERITE, 3, 5.0F, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));
    public static final RegistryObject<ToolItem> NETHERITE_PICKAXEOL = ITEMS.register("netherite_pickaxeol", () ->
            new Pickaxelol(ItemTier.NETHERITE, 1, -2.8F, new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup3.TOOLS)));

    //Block Item
    public static final RegistryObject<Item> STRAWBERRY_BUSH_ITEM = ITEMS.register("strawberry", () -> new BlockNamedItem(BlockInit.STRAWBERRY_BUSH.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup5.VEG).food(FoodItems.Strawberry)));
    public static final RegistryObject<Item> MAGENTA_LEAVES_ITEM = ITEMS.register("magenta_leaves", () -> new BlockNamedItem(BlockInit.MAGENTA_LEAVES.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> BLUEBERRY_BUSH_ITEM = ITEMS.register("blueberry", () -> new BlockNamedItem(BlockInit.BLUEBERRY_BUSH.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup5.VEG).food(FoodItems.Blueberry)));
    public static final RegistryObject<Item> KIWI_VINES_ITEM = ITEMS.register("kiwi", () -> new BlockNamedItem(BlockInit.KIWI_VINES.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup5.VEG).food(FoodItems.kiwi)));
    public static final RegistryObject<Item> BLACKBERRY_BUSH_ITEM = ITEMS.register("blackberry", () -> new BlockNamedItem(BlockInit.BLACKBERRY_BUSH.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup5.VEG).food(FoodItems.Blackberry)));
    public static final RegistryObject<Item> DEVIL_TORCH_ITEM = ITEMS.register("devil_torch", () -> new WallOrFloorItem(BlockInit.DEVIL_TORCH.get(), BlockInit.DEVIL_WALL_TORCH.get(), new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> BLACK_PLANKS_ITEM = ITEMS.register("black_planks", () -> new BlockNamedItem(BlockInit.BLACK_PLANKS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> BLACK_PLANK_STAIRS_ITEM = ITEMS.register("black_plank_stairs", () -> new BlockNamedItem(BlockInit.BLACK_PLANK_STAIRS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> BLACK_PLANK_SLAB_ITEM = ITEMS.register("black_plank_slab", () -> new BlockNamedItem(BlockInit.BLACK_PLANK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BLACK_PLANK_DOOR_ITEM = ITEMS.register("black_plank_door", () -> new BlockNamedItem(BlockInit.BLACK_PLANK_DOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BLACK_PLANK_TRAPDOOR_ITEM = ITEMS.register("black_plank_trapdoor", () -> new BlockNamedItem(BlockInit.BLACK_PLANK_TRAPDOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> WHITE_PLANKS_ITEM = ITEMS.register("white_planks", () -> new BlockNamedItem(BlockInit.WHITE_PLANKS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> WHITE_PLANK_STAIRS_ITEM = ITEMS.register("white_plank_stairs", () -> new BlockNamedItem(BlockInit.WHITE_PLANK_STAIRS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> WHITE_PLANK_SLAB_ITEM = ITEMS.register("white_plank_slab", () -> new BlockNamedItem(BlockInit.WHITE_PLANK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> WHITE_PLANK_DOOR_ITEM = ITEMS.register("white_plank_door", () -> new BlockNamedItem(BlockInit.WHITE_PLANK_DOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> WHITE_PLANK_TRAPDOOR_ITEM = ITEMS.register("white_plank_trapdoor", () -> new BlockNamedItem(BlockInit.WHITE_PLANK_TRAPDOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> RED_PLANKS_ITEM = ITEMS.register("red_planks", () -> new BlockNamedItem(BlockInit.RED_PLANKS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> RED_PLANK_STAIRS_ITEM = ITEMS.register("red_plank_stairs", () -> new BlockNamedItem(BlockInit.RED_PLANK_STAIRS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> RED_PLANK_SLAB_ITEM = ITEMS.register("red_plank_slab", () -> new BlockNamedItem(BlockInit.RED_PLANK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> RED_PLANK_DOOR_ITEM = ITEMS.register("red_plank_door", () -> new BlockNamedItem(BlockInit.RED_PLANK_DOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> RED_PLANK_TRAPDOOR_ITEM = ITEMS.register("red_plank_trapdoor", () -> new BlockNamedItem(BlockInit.RED_PLANK_TRAPDOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BLUE_PLANKS_ITEM = ITEMS.register("blue_planks", () -> new BlockNamedItem(BlockInit.BLUE_PLANKS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> BLUE_PLANK_STAIRS_ITEM = ITEMS.register("blue_plank_stairs", () -> new BlockNamedItem(BlockInit.BLUE_PLANK_STAIRS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> BLUE_PLANK_SLAB_ITEM = ITEMS.register("blue_plank_slab", () -> new BlockNamedItem(BlockInit.BLUE_PLANK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BLUE_PLANK_DOOR_ITEM = ITEMS.register("blue_plank_door", () -> new BlockNamedItem(BlockInit.BLUE_PLANK_DOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BLUE_PLANK_TRAPDOOR_ITEM = ITEMS.register("blue_plank_trapdoor", () -> new BlockNamedItem(BlockInit.BLUE_PLANK_TRAPDOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> GRAY_PLANKS_ITEM = ITEMS.register("gray_planks", () -> new BlockNamedItem(BlockInit.GRAY_PLANKS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> GRAY_PLANK_STAIRS_ITEM = ITEMS.register("gray_plank_stairs", () -> new BlockNamedItem(BlockInit.GRAY_PLANK_STAIRS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> GRAY_PLANK_SLAB_ITEM = ITEMS.register("gray_plank_slab", () -> new BlockNamedItem(BlockInit.GRAY_PLANK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> GRAY_PLANK_DOOR_ITEM = ITEMS.register("gray_plank_door", () -> new BlockNamedItem(BlockInit.GRAY_PLANK_DOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> GRAY_PLANK_TRAPDOOR_ITEM = ITEMS.register("gray_plank_trapdoor", () -> new BlockNamedItem(BlockInit.GRAY_PLANK_TRAPDOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> PINK_PLANKS_ITEM = ITEMS.register("pink_planks", () -> new BlockNamedItem(BlockInit.PINK_PLANKS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> PINK_PLANK_STAIRS_ITEM = ITEMS.register("pink_plank_stairs", () -> new BlockNamedItem(BlockInit.PINK_PLANK_STAIRS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> PINK_PLANK_SLAB_ITEM = ITEMS.register("pink_plank_slab", () -> new BlockNamedItem(BlockInit.PINK_PLANK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> PINK_PLANK_DOOR_ITEM = ITEMS.register("pink_plank_door", () -> new BlockNamedItem(BlockInit.PINK_PLANK_DOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> PINK_PLANK_TRAPDOOR_ITEM = ITEMS.register("pink_plank_trapdoor", () -> new BlockNamedItem(BlockInit.PINK_PLANK_TRAPDOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> ORANGE_PLANKS_ITEM = ITEMS.register("orange_planks", () -> new BlockNamedItem(BlockInit.ORANGE_PLANKS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> ORANGE_PLANK_STAIRS_ITEM = ITEMS.register("orange_plank_stairs", () -> new BlockNamedItem(BlockInit.ORANGE_PLANK_STAIRS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> ORANGE_PLANK_SLAB_ITEM = ITEMS.register("orange_plank_slab", () -> new BlockNamedItem(BlockInit.ORANGE_PLANK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> ORANGE_PLANK_DOOR_ITEM = ITEMS.register("orange_plank_door", () -> new BlockNamedItem(BlockInit.ORANGE_PLANK_DOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> ORANGE_PLANK_TRAPDOOR_ITEM = ITEMS.register("orange_plank_trapdoor", () -> new BlockNamedItem(BlockInit.ORANGE_PLANK_TRAPDOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIME_PLANKS_ITEM = ITEMS.register("lime_planks", () -> new BlockNamedItem(BlockInit.LIME_PLANKS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> LIME_PLANK_STAIRS_ITEM = ITEMS.register("lime_plank_stairs", () -> new BlockNamedItem(BlockInit.LIME_PLANK_STAIRS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> LIME_PLANK_SLAB_ITEM = ITEMS.register("lime_plank_slab", () -> new BlockNamedItem(BlockInit.LIME_PLANK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIME_PLANK_DOOR_ITEM = ITEMS.register("lime_plank_door", () -> new BlockNamedItem(BlockInit.LIME_PLANK_DOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIME_PLANK_TRAPDOOR_ITEM = ITEMS.register("lime_plank_trapdoor", () -> new BlockNamedItem(BlockInit.LIME_PLANK_TRAPDOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> DIRT_STAIRS_ITEM = ITEMS.register("dirt_stairs", () -> new BlockNamedItem(BlockInit.DIRT_STAIRS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> DIRT_SLAB_ITEM = ITEMS.register("dirt_slab", () -> new BlockNamedItem(BlockInit.DIRT_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> STONE_WALL_ITEM = ITEMS.register("stone_wall", () -> new BlockNamedItem(BlockInit.STONE_WALL.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> SMOOTH_STONE_WALL_ITEM = ITEMS.register("smooth_stone_wall", () -> new BlockNamedItem(BlockInit.SMOOTH_STONE_WALL.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> QUARTZ_WALL_ITEM = ITEMS.register("quartz_wall", () -> new BlockNamedItem(BlockInit.QUARTZ_WALL.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> PRISMARINE_BRICK_WALL_ITEM = ITEMS.register("prismarine_brick_wall", () -> new BlockNamedItem(BlockInit.PRISMARINE_BRICK_WALL.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> DARK_PRISMARINE_WALL_ITEM = ITEMS.register("dark_prismarine_wall", () -> new BlockNamedItem(BlockInit.DARK_PRISMARINE_WALL.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> OAK_LOG_FENCE_ITEM = ITEMS.register("oak_log_fence", () -> new BlockNamedItem(BlockInit.OAK_LOG_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> SPRUCE_LOG_FENCE_ITEM = ITEMS.register("spruce_log_fence", () -> new BlockNamedItem(BlockInit.SPRUCE_LOG_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> BIRCH_LOG_FENCE_ITEM = ITEMS.register("birch_log_fence", () -> new BlockNamedItem(BlockInit.BIRCH_LOG_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> ACACIA_LOG_FENCE_ITEM = ITEMS.register("acacia_log_fence", () -> new BlockNamedItem(BlockInit.ACACIA_LOG_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> DARK_OAK_LOG_FENCE_ITEM = ITEMS.register("dark_oak_log_fence", () -> new BlockNamedItem(BlockInit.DARK_OAK_LOG_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> JUNGLE_LOG_FENCE_ITEM = ITEMS.register("jungle_log_fence", () -> new BlockNamedItem(BlockInit.JUNGLE_LOG_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> CRIMSON_LOG_FENCE_ITEM = ITEMS.register("crimson_log_fence", () -> new BlockNamedItem(BlockInit.CRIMSON_LOG_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> WARPED_LOG_FENCE_ITEM = ITEMS.register("warped_log_fence", () -> new BlockNamedItem(BlockInit.WARPED_LOG_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> BROWN_PLANKS_ITEM = ITEMS.register("brown_planks", () -> new BlockNamedItem(BlockInit.BROWN_PLANKS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> BROWN_PLANK_STAIRS_ITEM = ITEMS.register("brown_plank_stairs", () -> new BlockNamedItem(BlockInit.BROWN_PLANK_STAIRS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> BROWN_PLANK_SLAB_ITEM = ITEMS.register("brown_plank_slab", () -> new BlockNamedItem(BlockInit.BROWN_PLANK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BROWN_PLANK_DOOR_ITEM = ITEMS.register("brown_plank_door", () -> new BlockNamedItem(BlockInit.BROWN_PLANK_DOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BROWN_PLANK_TRAPDOOR_ITEM = ITEMS.register("brown_plank_trapdoor", () -> new BlockNamedItem(BlockInit.BROWN_PLANK_TRAPDOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> YELLOW_PLANKS_ITEM = ITEMS.register("yellow_planks", () -> new BlockNamedItem(BlockInit.YELLOW_PLANKS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> YELLOW_PLANK_STAIRS_ITEM = ITEMS.register("yellow_plank_stairs", () -> new BlockNamedItem(BlockInit.YELLOW_PLANK_STAIRS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> YELLOW_PLANK_SLAB_ITEM = ITEMS.register("yellow_plank_slab", () -> new BlockNamedItem(BlockInit.YELLOW_PLANK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> YELLOW_PLANK_DOOR_ITEM = ITEMS.register("yellow_plank_door", () -> new BlockNamedItem(BlockInit.YELLOW_PLANK_DOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> YELLOW_PLANK_TRAPDOOR_ITEM = ITEMS.register("yellow_plank_trapdoor", () -> new BlockNamedItem(BlockInit.YELLOW_PLANK_TRAPDOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIGHT_GRAY_PLANKS_ITEM = ITEMS.register("light_gray_planks", () -> new BlockNamedItem(BlockInit.LIGHT_GRAY_PLANKS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> LIGHT_GRAY_PLANK_STAIRS_ITEM = ITEMS.register("light_gray_plank_stairs", () -> new BlockNamedItem(BlockInit.LIGHT_GRAY_PLANK_STAIRS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> LIGHT_GRAY_PLANK_SLAB_ITEM = ITEMS.register("light_gray_plank_slab", () -> new BlockNamedItem(BlockInit.LIGHT_GRAY_PLANK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIGHT_GRAY_PLANK_DOOR_ITEM = ITEMS.register("light_gray_plank_door", () -> new BlockNamedItem(BlockInit.LIGHT_GRAY_PLANK_DOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIGHT_GRAY_PLANK_TRAPDOOR_ITEM = ITEMS.register("light_gray_plank_trapdoor", () -> new BlockNamedItem(BlockInit.LIGHT_GRAY_PLANK_TRAPDOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> PURPLE_PLANKS_ITEM = ITEMS.register("purple_planks", () -> new BlockNamedItem(BlockInit.PURPLE_PLANKS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> PURPLE_PLANK_STAIRS_ITEM = ITEMS.register("purple_plank_stairs", () -> new BlockNamedItem(BlockInit.PURPLE_PLANK_STAIRS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> PURPLE_PLANK_SLAB_ITEM = ITEMS.register("purple_plank_slab", () -> new BlockNamedItem(BlockInit.PURPLE_PLANK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> PURPLE_PLANK_DOOR_ITEM = ITEMS.register("purple_plank_door", () -> new BlockNamedItem(BlockInit.PURPLE_PLANK_DOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> PURPLE_PLANK_TRAPDOOR_ITEM = ITEMS.register("purple_plank_trapdoor", () -> new BlockNamedItem(BlockInit.PURPLE_PLANK_TRAPDOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> CYAN_PLANKS_ITEM = ITEMS.register("cyan_planks", () -> new BlockNamedItem(BlockInit.CYAN_PLANKS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> CYAN_PLANK_STAIRS_ITEM = ITEMS.register("cyan_plank_stairs", () -> new BlockNamedItem(BlockInit.CYAN_PLANK_STAIRS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> CYAN_PLANK_SLAB_ITEM = ITEMS.register("cyan_plank_slab", () -> new BlockNamedItem(BlockInit.CYAN_PLANK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> CYAN_PLANK_DOOR_ITEM = ITEMS.register("cyan_plank_door", () -> new BlockNamedItem(BlockInit.CYAN_PLANK_DOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> CYAN_PLANK_TRAPDOOR_ITEM = ITEMS.register("cyan_plank_trapdoor", () -> new BlockNamedItem(BlockInit.CYAN_PLANK_TRAPDOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> OAK_LOG_FENCE_GATE_ITEM = ITEMS.register("oak_log_fence_gate", () -> new BlockNamedItem(BlockInit.OAK_LOG_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> SPRUCE_LOG_FENCE_GATE_ITEM = ITEMS.register("spruce_log_fence_gate", () -> new BlockNamedItem(BlockInit.SPRUCE_LOG_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> BIRCH_LOG_FENCE_GATE_ITEM = ITEMS.register("birch_log_fence_gate", () -> new BlockNamedItem(BlockInit.BIRCH_LOG_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> ACACIA_LOG_FENCE_GATE_ITEM = ITEMS.register("acacia_log_fence_gate", () -> new BlockNamedItem(BlockInit.ACACIA_LOG_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> DARK_OAK_LOG_FENCE_GATE_ITEM = ITEMS.register("dark_oak_log_fence_gate", () -> new BlockNamedItem(BlockInit.DARK_OAK_LOG_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> JUNGLE_LOG_FENCE_GATE_ITEM = ITEMS.register("jungle_log_fence_gate", () -> new BlockNamedItem(BlockInit.JUNGLE_LOG_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> CRIMSON_LOG_FENCE_GATE_ITEM = ITEMS.register("crimson_log_fence_gate", () -> new BlockNamedItem(BlockInit.CRIMSON_LOG_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> WARPED_LOG_FENCE_GATE_ITEM = ITEMS.register("warped_log_fence_gate", () -> new BlockNamedItem(BlockInit.WARPED_LOG_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> BLACK_PLANK_FENCE_GATE_ITEM = ITEMS.register("black_plank_fence_gate", () -> new BlockNamedItem(BlockInit.BLACK_PLANK_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> BLACK_PLANK_FENCE_ITEM = ITEMS.register("black_plank_fence", () -> new BlockNamedItem(BlockInit.BLACK_PLANK_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> BLACK_PLANK_BUTTON_ITEM = ITEMS.register("black_plank_button", () -> new BlockNamedItem(BlockInit.BLACK_PLANK_BUTTON.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> BLACK_PLANK_PRESSURE_PLATE_ITEM = ITEMS.register("black_plank_pressure_plate", () -> new BlockNamedItem(BlockInit.BLACK_PLANK_PRESSURE_PLATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> YELLOW_PLANK_FENCE_GATE_ITEM = ITEMS.register("yellow_plank_fence_gate", () -> new BlockNamedItem(BlockInit.YELLOW_PLANK_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> YELLOW_PLANK_FENCE_ITEM = ITEMS.register("yellow_plank_fence", () -> new BlockNamedItem(BlockInit.YELLOW_PLANK_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> YELLOW_PLANK_BUTTON_ITEM = ITEMS.register("yellow_plank_button", () -> new BlockNamedItem(BlockInit.YELLOW_PLANK_BUTTON.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> YELLOW_PLANK_PRESSURE_PLATE_ITEM = ITEMS.register("yellow_plank_pressure_plate", () -> new BlockNamedItem(BlockInit.YELLOW_PLANK_PRESSURE_PLATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> BROWN_PLANK_FENCE_GATE_ITEM = ITEMS.register("brown_plank_fence_gate", () -> new BlockNamedItem(BlockInit.BROWN_PLANK_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> BROWN_PLANK_FENCE_ITEM = ITEMS.register("brown_plank_fence", () -> new BlockNamedItem(BlockInit.BROWN_PLANK_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> BROWN_PLANK_BUTTON_ITEM = ITEMS.register("brown_plank_button", () -> new BlockNamedItem(BlockInit.BROWN_PLANK_BUTTON.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> BROWN_PLANK_PRESSURE_PLATE_ITEM = ITEMS.register("brown_plank_pressure_plate", () -> new BlockNamedItem(BlockInit.BROWN_PLANK_PRESSURE_PLATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> WHITE_PLANK_FENCE_GATE_ITEM = ITEMS.register("white_plank_fence_gate", () -> new BlockNamedItem(BlockInit.WHITE_PLANK_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> WHITE_PLANK_FENCE_ITEM = ITEMS.register("white_plank_fence", () -> new BlockNamedItem(BlockInit.WHITE_PLANK_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> WHITE_PLANK_BUTTON_ITEM = ITEMS.register("white_plank_button", () -> new BlockNamedItem(BlockInit.WHITE_PLANK_BUTTON.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> WHITE_PLANK_PRESSURE_PLATE_ITEM = ITEMS.register("white_plank_pressure_plate", () -> new BlockNamedItem(BlockInit.WHITE_PLANK_PRESSURE_PLATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> LIME_PLANK_FENCE_GATE_ITEM = ITEMS.register("lime_plank_fence_gate", () -> new BlockNamedItem(BlockInit.LIME_PLANK_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> LIME_PLANK_FENCE_ITEM = ITEMS.register("lime_plank_fence", () -> new BlockNamedItem(BlockInit.LIME_PLANK_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> LIME_PLANK_BUTTON_ITEM = ITEMS.register("lime_plank_button", () -> new BlockNamedItem(BlockInit.LIME_PLANK_BUTTON.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> LIME_PLANK_PRESSURE_PLATE_ITEM = ITEMS.register("lime_plank_pressure_plate", () -> new BlockNamedItem(BlockInit.LIME_PLANK_PRESSURE_PLATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> MAGENTA_PLANKS_ITEM = ITEMS.register("magenta_planks", () -> new BlockNamedItem(BlockInit.MAGENTA_PLANKS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> MAGENTA_PLANK_STAIRS_ITEM = ITEMS.register("magenta_plank_stairs", () -> new BlockNamedItem(BlockInit.MAGENTA_PLANK_STAIRS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> MAGENTA_PLANK_SLAB_ITEM = ITEMS.register("magenta_plank_slab", () -> new BlockNamedItem(BlockInit.MAGENTA_PLANK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> MAGENTA_PLANK_DOOR_ITEM = ITEMS.register("magenta_plank_door", () -> new BlockNamedItem(BlockInit.MAGENTA_PLANK_DOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> MAGENTA_PLANK_TRAPDOOR_ITEM = ITEMS.register("magenta_plank_trapdoor", () -> new BlockNamedItem(BlockInit.MAGENTA_PLANK_TRAPDOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> RED_PLANK_FENCE_GATE_ITEM = ITEMS.register("red_plank_fence_gate", () -> new BlockNamedItem(BlockInit.RED_PLANK_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> RED_PLANK_FENCE_ITEM = ITEMS.register("red_plank_fence", () -> new BlockNamedItem(BlockInit.RED_PLANK_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> RED_PLANK_BUTTON_ITEM = ITEMS.register("red_plank_button", () -> new BlockNamedItem(BlockInit.RED_PLANK_BUTTON.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> RED_PLANK_PRESSURE_PLATE_ITEM = ITEMS.register("red_plank_pressure_plate", () -> new BlockNamedItem(BlockInit.RED_PLANK_PRESSURE_PLATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> BLUE_PLANK_FENCE_GATE_ITEM = ITEMS.register("blue_plank_fence_gate", () -> new BlockNamedItem(BlockInit.BLUE_PLANK_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> BLUE_PLANK_FENCE_ITEM = ITEMS.register("blue_plank_fence", () -> new BlockNamedItem(BlockInit.BLUE_PLANK_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> BLUE_PLANK_BUTTON_ITEM = ITEMS.register("blue_plank_button", () -> new BlockNamedItem(BlockInit.BLUE_PLANK_BUTTON.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> BLUE_PLANK_PRESSURE_PLATE_ITEM = ITEMS.register("blue_plank_pressure_plate", () -> new BlockNamedItem(BlockInit.BLUE_PLANK_PRESSURE_PLATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> GRAY_PLANK_FENCE_GATE_ITEM = ITEMS.register("gray_plank_fence_gate", () -> new BlockNamedItem(BlockInit.GRAY_PLANK_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> GRAY_PLANK_FENCE_ITEM = ITEMS.register("gray_plank_fence", () -> new BlockNamedItem(BlockInit.GRAY_PLANK_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> GRAY_PLANK_BUTTON_ITEM = ITEMS.register("gray_plank_button", () -> new BlockNamedItem(BlockInit.GRAY_PLANK_BUTTON.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> GRAY_PLANK_PRESSURE_PLATE_ITEM = ITEMS.register("gray_plank_pressure_plate", () -> new BlockNamedItem(BlockInit.GRAY_PLANK_PRESSURE_PLATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> PINK_PLANK_FENCE_GATE_ITEM = ITEMS.register("pink_plank_fence_gate", () -> new BlockNamedItem(BlockInit.PINK_PLANK_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> PINK_PLANK_FENCE_ITEM = ITEMS.register("pink_plank_fence", () -> new BlockNamedItem(BlockInit.PINK_PLANK_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> PINK_PLANK_BUTTON_ITEM = ITEMS.register("pink_plank_button", () -> new BlockNamedItem(BlockInit.PINK_PLANK_BUTTON.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> PINK_PLANK_PRESSURE_PLATE_ITEM = ITEMS.register("pink_plank_pressure_plate", () -> new BlockNamedItem(BlockInit.PINK_PLANK_PRESSURE_PLATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> ORANGE_PLANK_FENCE_GATE_ITEM = ITEMS.register("orange_plank_fence_gate", () -> new BlockNamedItem(BlockInit.ORANGE_PLANK_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> ORANGE_PLANK_FENCE_ITEM = ITEMS.register("orange_plank_fence", () -> new BlockNamedItem(BlockInit.ORANGE_PLANK_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> ORANGE_PLANK_BUTTON_ITEM = ITEMS.register("orange_plank_button", () -> new BlockNamedItem(BlockInit.ORANGE_PLANK_BUTTON.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> ORANGE_PLANK_PRESSURE_PLATE_ITEM = ITEMS.register("orange_plank_pressure_plate", () -> new BlockNamedItem(BlockInit.ORANGE_PLANK_PRESSURE_PLATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> LIGHT_GRAY_PLANK_FENCE_GATE_ITEM = ITEMS.register("light_gray_plank_fence_gate", () -> new BlockNamedItem(BlockInit.LIGHT_GRAY_PLANK_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> LIGHT_GRAY_PLANK_FENCE_ITEM = ITEMS.register("light_gray_plank_fence", () -> new BlockNamedItem(BlockInit.LIGHT_GRAY_PLANK_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> LIGHT_GRAY_PLANK_BUTTON_ITEM = ITEMS.register("light_gray_plank_button", () -> new BlockNamedItem(BlockInit.LIGHT_GRAY_PLANK_BUTTON.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> LIGHT_GRAY_PLANK_PRESSURE_PLATE_ITEM = ITEMS.register("light_gray_plank_pressure_plate", () -> new BlockNamedItem(BlockInit.LIGHT_GRAY_PLANK_PRESSURE_PLATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> PURPLE_PLANK_FENCE_GATE_ITEM = ITEMS.register("purple_plank_fence_gate", () -> new BlockNamedItem(BlockInit.PURPLE_PLANK_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> PURPLE_PLANK_FENCE_ITEM = ITEMS.register("purple_plank_fence", () -> new BlockNamedItem(BlockInit.PURPLE_PLANK_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> PURPLE_PLANK_BUTTON_ITEM = ITEMS.register("purple_plank_button", () -> new BlockNamedItem(BlockInit.PURPLE_PLANK_BUTTON.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> PURPLE_PLANK_PRESSURE_PLATE_ITEM = ITEMS.register("purple_plank_pressure_plate", () -> new BlockNamedItem(BlockInit.PURPLE_PLANK_PRESSURE_PLATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> CYAN_PLANK_FENCE_GATE_ITEM = ITEMS.register("cyan_plank_fence_gate", () -> new BlockNamedItem(BlockInit.CYAN_PLANK_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> CYAN_PLANK_FENCE_ITEM = ITEMS.register("cyan_plank_fence", () -> new BlockNamedItem(BlockInit.CYAN_PLANK_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> CYAN_PLANK_BUTTON_ITEM = ITEMS.register("cyan_plank_button", () -> new BlockNamedItem(BlockInit.CYAN_PLANK_BUTTON.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> CYAN_PLANK_PRESSURE_PLATE_ITEM = ITEMS.register("cyan_plank_pressure_plate", () -> new BlockNamedItem(BlockInit.CYAN_PLANK_PRESSURE_PLATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> GREEN_PLANKS_ITEM = ITEMS.register("green_planks", () -> new BlockNamedItem(BlockInit.GREEN_PLANKS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> GREEN_PLANK_STAIRS_ITEM = ITEMS.register("green_plank_stairs", () -> new BlockNamedItem(BlockInit.GREEN_PLANK_STAIRS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> GREEN_PLANK_SLAB_ITEM = ITEMS.register("green_plank_slab", () -> new BlockNamedItem(BlockInit.GREEN_PLANK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> GREEN_PLANK_DOOR_ITEM = ITEMS.register("green_plank_door", () -> new BlockNamedItem(BlockInit.GREEN_PLANK_DOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> GREEN_PLANK_TRAPDOOR_ITEM = ITEMS.register("green_plank_trapdoor", () -> new BlockNamedItem(BlockInit.GREEN_PLANK_TRAPDOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> GREEN_PLANK_FENCE_GATE_ITEM = ITEMS.register("green_plank_fence_gate", () -> new BlockNamedItem(BlockInit.GREEN_PLANK_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> GREEN_PLANK_FENCE_ITEM = ITEMS.register("green_plank_fence", () -> new BlockNamedItem(BlockInit.GREEN_PLANK_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> GREEN_PLANK_BUTTON_ITEM = ITEMS.register("green_plank_button", () -> new BlockNamedItem(BlockInit.GREEN_PLANK_BUTTON.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> GREEN_PLANK_PRESSURE_PLATE_ITEM = ITEMS.register("green_plank_pressure_plate", () -> new BlockNamedItem(BlockInit.GREEN_PLANK_PRESSURE_PLATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> MAGENTA_PLANK_FENCE_GATE_ITEM = ITEMS.register("magenta_plank_fence_gate", () -> new BlockNamedItem(BlockInit.MAGENTA_PLANK_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> MAGENTA_PLANK_FENCE_ITEM = ITEMS.register("magenta_plank_fence", () -> new BlockNamedItem(BlockInit.MAGENTA_PLANK_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> MAGENTA_PLANK_BUTTON_ITEM = ITEMS.register("magenta_plank_button", () -> new BlockNamedItem(BlockInit.MAGENTA_PLANK_BUTTON.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> MAGENTA_PLANK_PRESSURE_PLATE_ITEM = ITEMS.register("magenta_plank_pressure_plate", () -> new BlockNamedItem(BlockInit.MAGENTA_PLANK_PRESSURE_PLATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> LIGHT_BLUE_PLANKS_ITEM = ITEMS.register("light_blue_planks", () -> new BlockNamedItem(BlockInit.LIGHT_BLUE_PLANKS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> LIGHT_BLUE_PLANK_STAIRS_ITEM = ITEMS.register("light_blue_plank_stairs", () -> new BlockNamedItem(BlockInit.LIGHT_BLUE_PLANK_STAIRS.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> LIGHT_BLUE_PLANK_SLAB_ITEM = ITEMS.register("light_blue_plank_slab", () -> new BlockNamedItem(BlockInit.LIGHT_BLUE_PLANK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIGHT_BLUE_PLANK_DOOR_ITEM = ITEMS.register("light_blue_plank_door", () -> new BlockNamedItem(BlockInit.LIGHT_BLUE_PLANK_DOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIGHT_BLUE_PLANK_TRAPDOOR_ITEM = ITEMS.register("light_blue_plank_trapdoor", () -> new BlockNamedItem(BlockInit.LIGHT_BLUE_PLANK_TRAPDOOR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIGHT_BLUE_PLANK_FENCE_GATE_ITEM = ITEMS.register("light_blue_plank_fence_gate", () -> new BlockNamedItem(BlockInit.LIGHT_BLUE_PLANK_FENCE_GATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> LIGHT_BLUE_PLANK_FENCE_ITEM = ITEMS.register("light_blue_plank_fence", () -> new BlockNamedItem(BlockInit.LIGHT_BLUE_PLANK_FENCE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> LIGHT_BLUE_PLANK_BUTTON_ITEM = ITEMS.register("light_blue_plank_button", () -> new BlockNamedItem(BlockInit.LIGHT_BLUE_PLANK_BUTTON.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> LIGHT_BLUE_PLANK_PRESSURE_PLATE_ITEM = ITEMS.register("light_blue_plank_pressure_plate", () -> new BlockNamedItem(BlockInit.LIGHT_BLUE_PLANK_PRESSURE_PLATE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> SOULSTONE_ITEM = ITEMS.register("soulstone", () -> new BlockNamedItem(BlockInit.SOULSTONE.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> SOUL_JACK_O_LANTERN_ITEM = ITEMS.register("soul_jack_o_lantern", () -> new BlockNamedItem(BlockInit.SOUL_JACK_O_LANTERN.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> ASH_MUSHROOM_ITEM = ITEMS.register("ash_mushroom", () -> new BlockNamedItem(BlockInit.ASH_MUSHROOM.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup5.VEG)));
    public static final RegistryObject<Item> BLACK_CORUPTED_STONE_ITEM = ITEMS.register("black_corupted_stone", () -> new BlockNamedItem(BlockInit.BLACK_CORUPTED_STONE.get(), (new Item.Properties()).group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<Item> DEVIL_JACK_O_LANTERN_ITEM = ITEMS.register("devil_jack_o_lantern", () -> new BlockNamedItem(BlockInit.DEVIL_JACK_O_LANTERN.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BLUE_BRICKS_ITEM = ITEMS.register("blue_bricks", () -> new BlockNamedItem(BlockInit.BLUE_BRICKS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIME_BRICKS_ITEM = ITEMS.register("lime_bricks", () -> new BlockNamedItem(BlockInit.LIME_BRICKS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BLACK_BRICKS_ITEM = ITEMS.register("black_bricks", () -> new BlockNamedItem(BlockInit.BLACK_BRICKS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> WHITE_BRICKS_ITEM = ITEMS.register("white_bricks", () -> new BlockNamedItem(BlockInit.WHITE_BRICKS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> PURPLE_BRICKS_ITEM = ITEMS.register("purple_bricks", () -> new BlockNamedItem(BlockInit.PURPLE_BRICKS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> PINK_BRICKS_ITEM = ITEMS.register("pink_bricks", () -> new BlockNamedItem(BlockInit.PINK_BRICKS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> ORANGE_BRICKS_ITEM = ITEMS.register("orange_bricks", () -> new BlockNamedItem(BlockInit.ORANGE_BRICKS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> YELLOW_BRICKS_ITEM = ITEMS.register("yellow_bricks", () -> new BlockNamedItem(BlockInit.YELLOW_BRICKS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> GREEN_BRICKS_ITEM = ITEMS.register("green_bricks", () -> new BlockNamedItem(BlockInit.GREEN_BRICKS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIGHT_BLUE_BRICKS_ITEM = ITEMS.register("light_blue_bricks", () -> new BlockNamedItem(BlockInit.LIGHT_BLUE_BRICKS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> FLOWER_O_HEALING_ITEM = ITEMS.register("flower_o_healing", () -> new BlockNamedItem(BlockInit.FLOWER_O_HEALING.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG).maxStackSize(16))));
    public static final RegistryObject<Item> FLOWER_O_POISON_ITEM = ITEMS.register("flower_o_poison", () -> new BlockNamedItem(BlockInit.FLOWER_O_POISON.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG).maxStackSize(16))));
    public static final RegistryObject<Item> WET_LAVA_SPONGE_ITEM = ITEMS.register("wet_lava_sponge", () -> new BlockNamedItem(BlockInit.WET_LAVA_SPONGE.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)).isImmuneToFire()));
    public static final RegistryObject<Item> LAVA_SPONGE_ITEM = ITEMS.register("lava_sponge", () -> new BlockNamedItem(BlockInit.LAVA_SPONGE.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)).isImmuneToFire()));
    public static final RegistryObject<Item> HEAVY_COBBLESTONE_ITEM = ITEMS.register("heavy_cobblestone", () -> new BlockNamedItem(BlockInit.HEAVY_COBBLESTONE.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> GRAY_BRICKS_ITEM = ITEMS.register("gray_bricks", () -> new BlockNamedItem(BlockInit.GRAY_BRICKS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIGHT_GRAY_BRICKS_ITEM = ITEMS.register("light_gray_bricks", () -> new BlockNamedItem(BlockInit.LIGHT_GRAY_BRICKS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BROWN_BRICKS_ITEM = ITEMS.register("brown_bricks", () -> new BlockNamedItem(BlockInit.BROWN_BRICKS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> CYAN_BRICKS_ITEM = ITEMS.register("cyan_bricks", () -> new BlockNamedItem(BlockInit.CYAN_BRICKS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> MUSHROOM_HEAD_ITEM = ITEMS.register("mushroom_head", () -> new BlockNamedItem(BlockInit.MUSHROOM_HEAD.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BLACK_ITEM_HOLDER_ITEM = ITEMS.register("black_item_holder", () -> new BlockNamedItem(BlockInit.BLACK_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> WHITE_ITEM_HOLDER_ITEM = ITEMS.register("white_item_holder", () -> new BlockNamedItem(BlockInit.WHITE_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> RED_ITEM_HOLDER_ITEM = ITEMS.register("red_item_holder", () -> new BlockNamedItem(BlockInit.RED_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BLUE_ITEM_HOLDER_ITEM = ITEMS.register("blue_item_holder", () -> new BlockNamedItem(BlockInit.BLUE_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> YELLOW_ITEM_HOLDER_ITEM = ITEMS.register("yellow_item_holder", () -> new BlockNamedItem(BlockInit.YELLOW_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> PINK_ITEM_HOLDER_ITEM = ITEMS.register("pink_item_holder", () -> new BlockNamedItem(BlockInit.PINK_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> GREEN_ITEM_HOLDER_ITEM = ITEMS.register("green_item_holder", () -> new BlockNamedItem(BlockInit.GREEN_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> GRAY_ITEM_HOLDER_ITEM = ITEMS.register("gray_item_holder", () -> new BlockNamedItem(BlockInit.GRAY_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIGHT_GRAY_ITEM_HOLDER_ITEM = ITEMS.register("light_gray_item_holder", () -> new BlockNamedItem(BlockInit.LIGHT_GRAY_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIGHT_BLUE_ITEM_HOLDER_ITEM = ITEMS.register("light_blue_item_holder", () -> new BlockNamedItem(BlockInit.LIGHT_BLUE_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BROWN_ITEM_HOLDER_ITEM = ITEMS.register("brown_item_holder", () -> new BlockNamedItem(BlockInit.BROWN_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> CYAN_ITEM_HOLDER_ITEM = ITEMS.register("cyan_item_holder", () -> new BlockNamedItem(BlockInit.CYAN_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIME_ITEM_HOLDER_ITEM = ITEMS.register("lime_item_holder", () -> new BlockNamedItem(BlockInit.LIME_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> RED_LEAVES_ITEM = ITEMS.register("red_leaves", () -> new BlockNamedItem(BlockInit.RED_LEAVES.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> RED_VINE_ITEM = ITEMS.register("red_vine", () -> new BlockNamedItem(BlockInit.RED_VINE.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> BLACK_LEAVES_ITEM = ITEMS.register("black_leaves", () -> new BlockNamedItem(BlockInit.BLACK_LEAVES.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> WHITE_LEAVES_ITEM = ITEMS.register("white_leaves", () -> new BlockNamedItem(BlockInit.WHITE_LEAVES.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> PINK_LEAVES_ITEM = ITEMS.register("pink_leaves", () -> new BlockNamedItem(BlockInit.PINK_LEAVES.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> PURPLE_LEAVES_ITEM = ITEMS.register("purple_leaves", () -> new BlockNamedItem(BlockInit.PURPLE_LEAVES.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> CYAN_LEAVES_ITEM = ITEMS.register("cyan_leaves", () -> new BlockNamedItem(BlockInit.CYAN_LEAVES.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> BLUE_LEAVES_ITEM = ITEMS.register("blue_leaves", () -> new BlockNamedItem(BlockInit.BLUE_LEAVES.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> LIGHT_BLUE_LEAVES_ITEM = ITEMS.register("light_blue_leaves", () -> new BlockNamedItem(BlockInit.LIGHT_BLUE_LEAVES.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> GRAY_LEAVES_ITEM = ITEMS.register("gray_leaves", () -> new BlockNamedItem(BlockInit.GRAY_LEAVES.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> LIGHT_GRAY_LEAVES_ITEM = ITEMS.register("light_gray_leaves", () -> new BlockNamedItem(BlockInit.LIGHT_GRAY_LEAVES.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> ORANGE_LEAVES_ITEM = ITEMS.register("orange_leaves", () -> new BlockNamedItem(BlockInit.ORANGE_LEAVES.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> BROWN_LEAVES_ITEM = ITEMS.register("brown_leaves", () -> new BlockNamedItem(BlockInit.BROWN_LEAVES.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> YELLOW_LEAVES_ITEM = ITEMS.register("yellow_leaves", () -> new BlockNamedItem(BlockInit.YELLOW_LEAVES.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> HEAVY_COBBLESTONE_STAIR_ITEM = ITEMS.register("heavy_cobblestone_stair", () -> new BlockNamedItem(BlockInit.HEAVY_COBBLESTONE_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> HEAVY_COBBLESTONE_SLAB_ITEM = ITEMS.register("heavy_cobblestone_slab", () -> new BlockNamedItem(BlockInit.HEAVY_COBBLESTONE_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> ADVANCER_ITEM = ITEMS.register("advancer", () -> new BlockNamedItem(BlockInit.ADVANCER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LAVENDER_ITEM = ITEMS.register("lavender", () -> new BlockNamedItem(BlockInit.LAVENDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> BLUE_BRICK_WALL_ITEM = ITEMS.register("blue_brick_wall", () -> new BlockNamedItem(BlockInit.BLUE_BRICK_WALL.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> GREEN_BRICK_WALL_ITEM = ITEMS.register("green_brick_wall", () -> new BlockNamedItem(BlockInit.GREEN_BRICK_WALL.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIME_BRICK_WALL_ITEM = ITEMS.register("lime_brick_wall", () -> new BlockNamedItem(BlockInit.LIME_BRICK_WALL.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> YELLOW_BRICK_WALL_ITEM = ITEMS.register("yellow_brick_wall", () -> new BlockNamedItem(BlockInit.YELLOW_BRICK_WALL.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> ORANGE_BRICK_WALL_ITEM = ITEMS.register("orange_brick_wall", () -> new BlockNamedItem(BlockInit.ORANGE_BRICK_WALL.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> ORANGE_ROSE_BUSH_ITEM = ITEMS.register("orange_rose_bush", () -> new BlockNamedItem(BlockInit.ORANGE_ROSE_BUSH.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> BLACK_ROSE_BUSH_ITEM = ITEMS.register("black_rose_bush", () -> new BlockNamedItem(BlockInit.BLACK_ROSE_BUSH.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> LIGHT_GRAY_ROSE_BUSH_ITEM = ITEMS.register("light_gray_rose_bush", () -> new BlockNamedItem(BlockInit.LIGHT_GRAY_ROSE_BUSH.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> YELLOW_ROSE_BUSH_ITEM = ITEMS.register("yellow_rose_bush", () -> new BlockNamedItem(BlockInit.YELLOW_ROSE_BUSH.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> PURPLE_ROSE_BUSH_ITEM = ITEMS.register("purple_rose_bush", () -> new BlockNamedItem(BlockInit.PURPLE_ROSE_BUSH.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> WHITE_ROSE_BUSH_ITEM = ITEMS.register("white_rose_bush", () -> new BlockNamedItem(BlockInit.WHITE_ROSE_BUSH.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> BLUE_ROSE_BUSH_ITEM = ITEMS.register("blue_rose_bush", () -> new BlockNamedItem(BlockInit.BLUE_ROSE_BUSH.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> PINK_ROSE_BUSH_ITEM = ITEMS.register("pink_rose_bush", () -> new BlockNamedItem(BlockInit.PINK_ROSE_BUSH.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> GRAY_ROSE_BUSH_ITEM = ITEMS.register("gray_rose_bush", () -> new BlockNamedItem(BlockInit.GRAY_ROSE_BUSH.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> LIGHT_BLUE_ROSE_BUSH_ITEM = ITEMS.register("light_blue_rose_bush", () -> new BlockNamedItem(BlockInit.LIGHT_BLUE_ROSE_BUSH.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> MAGENTA_ROSE_BUSH_ITEM = ITEMS.register("magenta_rose_bush", () -> new BlockNamedItem(BlockInit.MAGENTA_ROSE_BUSH.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> PURPLE_ITEM_HOLDER_ITEM = ITEMS.register("purple_item_holder", () -> new BlockNamedItem(BlockInit.PURPLE_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> ORANGE_ITEM_HOLDER_ITEM = ITEMS.register("orange_item_holder", () -> new BlockNamedItem(BlockInit.ORANGE_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> MAGENTA_ITEM_HOLDER_ITEM = ITEMS.register("magenta_item_holder", () -> new BlockNamedItem(BlockInit.MAGENTA_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> CYAN_ROSE_BUSH_ITEM = ITEMS.register("cyan_rose_bush", () -> new BlockNamedItem(BlockInit.CYAN_ROSE_BUSH.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> BLACK_BRICK_WALL_ITEM = ITEMS.register("black_brick_wall", () -> new BlockNamedItem(BlockInit.BLACK_BRICK_WALL.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> WHITE_BRICK_WALL_ITEM = ITEMS.register("white_brick_wall", () -> new BlockNamedItem(BlockInit.WHITE_BRICK_WALL.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> GRAY_BRICK_WALL_ITEM = ITEMS.register("gray_brick_wall", () -> new BlockNamedItem(BlockInit.GRAY_BRICK_WALL.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIGHT_GRAY_BRICK_WALL_ITEM = ITEMS.register("light_gray_brick_wall", () -> new BlockNamedItem(BlockInit.LIGHT_GRAY_BRICK_WALL.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> PURPLE_BRICK_WALL_ITEM = ITEMS.register("purple_brick_wall", () -> new BlockNamedItem(BlockInit.PURPLE_BRICK_WALL.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> PINK_BRICK_WALL_ITEM = ITEMS.register("pink_brick_wall", () -> new BlockNamedItem(BlockInit.PINK_BRICK_WALL.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> MAGENTA_BRICK_WALL_ITEM = ITEMS.register("magenta_brick_wall", () -> new BlockNamedItem(BlockInit.MAGENTA_BRICK_WALL.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> CYAN_BRICK_WALL_ITEM = ITEMS.register("cyan_brick_wall", () -> new BlockNamedItem(BlockInit.CYAN_BRICK_WALL.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BROWN_BRICK_WALL_ITEM = ITEMS.register("brown_brick_wall", () -> new BlockNamedItem(BlockInit.BROWN_BRICK_WALL.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIGHT_BLUE_BRICK_WALL_ITEM = ITEMS.register("light_blue_brick_wall", () -> new BlockNamedItem(BlockInit.LIGHT_BLUE_BRICK_WALL.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BROWN_BRICK_SLAB_ITEM = ITEMS.register("brown_brick_slab", () -> new BlockNamedItem(BlockInit.BROWN_BRICK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BLACK_BRICK_SLAB_ITEM = ITEMS.register("black_brick_slab", () -> new BlockNamedItem(BlockInit.BLACK_BRICK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> WHITE_BRICK_SLAB_ITEM = ITEMS.register("white_brick_slab", () -> new BlockNamedItem(BlockInit.WHITE_BRICK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> GRAY_BRICK_SLAB_ITEM = ITEMS.register("gray_brick_slab", () -> new BlockNamedItem(BlockInit.GRAY_BRICK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> PURPLE_BRICK_SLAB_ITEM = ITEMS.register("purple_brick_slab", () -> new BlockNamedItem(BlockInit.PURPLE_BRICK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> PINK_BRICK_SLAB_ITEM = ITEMS.register("pink_brick_slab", () -> new BlockNamedItem(BlockInit.PINK_BRICK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> MAGENTA_BRICK_SLAB_ITEM = ITEMS.register("magenta_brick_slab", () -> new BlockNamedItem(BlockInit.MAGENTA_BRICK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> GREEN_BRICK_SLAB_ITEM = ITEMS.register("green_brick_slab", () -> new BlockNamedItem(BlockInit.GREEN_BRICK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIME_BRICK_SLAB_ITEM = ITEMS.register("lime_brick_slab", () -> new BlockNamedItem(BlockInit.LIME_BRICK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BLUE_BRICK_SLAB_ITEM = ITEMS.register("blue_brick_slab", () -> new BlockNamedItem(BlockInit.BLUE_BRICK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> CYAN_BRICK_SLAB_ITEM = ITEMS.register("cyan_brick_slab", () -> new BlockNamedItem(BlockInit.CYAN_BRICK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIGHT_BLUE_BRICK_SLAB_ITEM = ITEMS.register("light_blue_brick_slab", () -> new BlockNamedItem(BlockInit.LIGHT_BLUE_BRICK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> YELLOW_BRICK_SLAB_ITEM = ITEMS.register("yellow_brick_slab", () -> new BlockNamedItem(BlockInit.YELLOW_BRICK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> ORANGE_BRICK_SLAB_ITEM = ITEMS.register("orange_brick_slab", () -> new BlockNamedItem(BlockInit.ORANGE_BRICK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIGHT_GRAY_BRICK_SLAB_ITEM = ITEMS.register("light_gray_brick_slab", () -> new BlockNamedItem(BlockInit.LIGHT_GRAY_BRICK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BLUE_VINE_ITEM = ITEMS.register("blue_vine", () -> new BlockNamedItem(BlockInit.BLUE_VINE.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> BLACK_BRICK_STAIR_ITEM = ITEMS.register("black_brick_stair", () -> new BlockNamedItem(BlockInit.BLACK_BRICK_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> WHITE_BRICK_STAIR_ITEM = ITEMS.register("white_brick_stair", () -> new BlockNamedItem(BlockInit.WHITE_BRICK_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> GRAY_BRICK_STAIR_ITEM = ITEMS.register("gray_brick_stair", () -> new BlockNamedItem(BlockInit.GRAY_BRICK_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> WHITE_POLISHED_GLASS_ITEM = ITEMS.register("white_polished_glass", () -> new BlockNamedItem(BlockInit.WHITE_POLISHED_GLASS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BLACK_POLISHED_GLASS_ITEM = ITEMS.register("black_polished_glass", () -> new BlockNamedItem(BlockInit.BLACK_POLISHED_GLASS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> GRAY_POLISHED_GLASS_ITEM = ITEMS.register("gray_polished_glass", () -> new BlockNamedItem(BlockInit.GRAY_POLISHED_GLASS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> RED_POLISHED_GLASS_ITEM = ITEMS.register("red_polished_glass", () -> new BlockNamedItem(BlockInit.RED_POLISHED_GLASS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> CYAN_POLISHED_GLASS_ITEM = ITEMS.register("cyan_polished_glass", () -> new BlockNamedItem(BlockInit.CYAN_POLISHED_GLASS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BLUE_POLISHED_GLASS_ITEM = ITEMS.register("blue_polished_glass", () -> new BlockNamedItem(BlockInit.BLUE_POLISHED_GLASS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIGHT_BLUE_POLISHED_GLASS_ITEM = ITEMS.register("light_blue_polished_glass", () -> new BlockNamedItem(BlockInit.LIGHT_BLUE_POLISHED_GLASS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> PINK_POLISHED_GLASS_ITEM = ITEMS.register("pink_polished_glass", () -> new BlockNamedItem(BlockInit.PINK_POLISHED_GLASS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> PURPLE_POLISHED_GLASS_ITEM = ITEMS.register("purple_polished_glass", () -> new BlockNamedItem(BlockInit.PURPLE_POLISHED_GLASS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> MAGENTA_POLISHED_GLASS_ITEM = ITEMS.register("magenta_polished_glass", () -> new BlockNamedItem(BlockInit.MAGENTA_POLISHED_GLASS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> GREEN_POLISHED_GLASS_ITEM = ITEMS.register("green_polished_glass", () -> new BlockNamedItem(BlockInit.GREEN_POLISHED_GLASS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIME_POLISHED_GLASS_ITEM = ITEMS.register("lime_polished_glass", () -> new BlockNamedItem(BlockInit.LIME_POLISHED_GLASS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> ORANGE_POLISHED_GLASS_ITEM = ITEMS.register("orange_polished_glass", () -> new BlockNamedItem(BlockInit.ORANGE_POLISHED_GLASS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> YELLOW_POLISHED_GLASS_ITEM = ITEMS.register("yellow_polished_glass", () -> new BlockNamedItem(BlockInit.YELLOW_POLISHED_GLASS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BROWN_POLISHED_GLASS_ITEM = ITEMS.register("brown_polished_glass", () -> new BlockNamedItem(BlockInit.BROWN_POLISHED_GLASS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIGHT_GRAY_POLISHED_GLASS_ITEM = ITEMS.register("light_gray_polished_glass", () -> new BlockNamedItem(BlockInit.LIGHT_GRAY_POLISHED_GLASS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> MOLTEN_OBSIDIAN_ITEM = ITEMS.register("molten_obsidian", () -> new BlockNamedItem(BlockInit.MOLTEN_OBSIDIAN.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BLUE_BRICK_STAIR_ITEM = ITEMS.register("blue_brick_stair", () -> new BlockNamedItem(BlockInit.BLUE_BRICK_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> CYAN_BRICK_STAIR_ITEM = ITEMS.register("cyan_brick_stair", () -> new BlockNamedItem(BlockInit.CYAN_BRICK_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIGHT_BLUE_BRICK_STAIR_ITEM = ITEMS.register("light_blue_brick_stair", () -> new BlockNamedItem(BlockInit.LIGHT_BLUE_BRICK_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> HEAVY_COBBLESTONE_WALL_ITEM = ITEMS.register("heavy_cobblestone_wall", () -> new BlockNamedItem(BlockInit.HEAVY_COBBLESTONE_WALL.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> RED_BRICKS_ITEM = ITEMS.register("red_bricks", () -> new BlockNamedItem(BlockInit.RED_BRICKS.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> PINK_BRICK_STAIR_ITEM = ITEMS.register("pink_brick_stair", () -> new BlockNamedItem(BlockInit.PINK_BRICK_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> PURPLE_BRICK_STAIR_ITEM = ITEMS.register("purple_brick_stair", () -> new BlockNamedItem(BlockInit.PURPLE_BRICK_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> MAGENTA_BRICK_STAIR_ITEM = ITEMS.register("magenta_brick_stair", () -> new BlockNamedItem(BlockInit.MAGENTA_BRICK_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIME_BRICK_STAIR_ITEM = ITEMS.register("lime_brick_stair", () -> new BlockNamedItem(BlockInit.LIME_BRICK_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> GREEN_BRICK_STAIR_ITEM = ITEMS.register("green_brick_stair", () -> new BlockNamedItem(BlockInit.GREEN_BRICK_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> YELLOW_BRICK_STAIR_ITEM = ITEMS.register("yellow_brick_stair", () -> new BlockNamedItem(BlockInit.YELLOW_BRICK_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> ORANGE_BRICK_STAIR_ITEM = ITEMS.register("orange_brick_stair", () -> new BlockNamedItem(BlockInit.ORANGE_BRICK_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BROWN_BRICK_STAIR_ITEM = ITEMS.register("brown_brick_stair", () -> new BlockNamedItem(BlockInit.BROWN_BRICK_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIGHT_GRAY_BRICK_STAIR_ITEM = ITEMS.register("light_gray_brick_stair", () -> new BlockNamedItem(BlockInit.LIGHT_GRAY_BRICK_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> RED_BRICK_STAIR_ITEM = ITEMS.register("red_brick_stair", () -> new BlockNamedItem(BlockInit.RED_BRICK_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> RED_BRICK_SLAB_ITEM = ITEMS.register("red_brick_slab", () -> new BlockNamedItem(BlockInit.RED_BRICK_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> RED_BRICK_WALL_ITEM = ITEMS.register("red_brick_wall", () -> new BlockNamedItem(BlockInit.RED_BRICK_WALL.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> WHITE_VINE_ITEM = ITEMS.register("white_vine", () -> new BlockNamedItem(BlockInit.WHITE_VINE.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> LIGHT_BLUE_VINE_ITEM = ITEMS.register("light_blue_vine", () -> new BlockNamedItem(BlockInit.LIGHT_BLUE_VINE.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> YELLOW_VINE_ITEM = ITEMS.register("yellow_vine", () -> new BlockNamedItem(BlockInit.YELLOW_VINE.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> ORANGE_VINE_ITEM = ITEMS.register("orange_vine", () -> new BlockNamedItem(BlockInit.ORANGE_VINE.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> OAK_ITEM_HOLDER_ITEM = ITEMS.register("oak_item_holder", () -> new BlockNamedItem(BlockInit.OAK_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> JUNGLE_ITEM_HOLDER_ITEM = ITEMS.register("jungle_item_holder", () -> new BlockNamedItem(BlockInit.JUNGLE_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BIRCH_ITEM_HOLDER_ITEM = ITEMS.register("birch_item_holder", () -> new BlockNamedItem(BlockInit.BIRCH_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> CRIMSON_ITEM_HOLDER_ITEM = ITEMS.register("crimson_item_holder", () -> new BlockNamedItem(BlockInit.CRIMSON_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> WARPED_ITEM_HOLDER_ITEM = ITEMS.register("warped_item_holder", () -> new BlockNamedItem(BlockInit.WARPED_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> ACACIA_ITEM_HOLDER_ITEM = ITEMS.register("acacia_item_holder", () -> new BlockNamedItem(BlockInit.ACACIA_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> GREEN_CONCRETE_STAIR_ITEM = ITEMS.register("green_concrete_stair", () -> new BlockNamedItem(BlockInit.GREEN_CONCRETE_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> YELLOW_LEAVE_CARPET_ITEM = ITEMS.register("yellow_leave_carpet", () -> new BlockNamedItem(BlockInit.YELLOW_LEAVE_CARPET.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> BLUE_LEAVE_CARPET_ITEM = ITEMS.register("blue_leave_carpet", () -> new BlockNamedItem(BlockInit.BLUE_LEAVE_CARPET.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> ORANGE_LEAVE_CARPET_ITEM = ITEMS.register("orange_leave_carpet", () -> new BlockNamedItem(BlockInit.ORANGE_LEAVE_CARPET.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    ;
    public static final RegistryObject<Item> RED_LEAVE_CARPET_ITEM = ITEMS.register("red_leave_carpet", () -> new BlockNamedItem(BlockInit.RED_LEAVE_CARPET.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> BLACK_LEAVE_CARPET_ITEM = ITEMS.register("black_leave_carpet", () -> new BlockNamedItem(BlockInit.BLACK_LEAVE_CARPET.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> WHITE_LEAVE_CARPET_ITEM = ITEMS.register("white_leave_carpet", () -> new BlockNamedItem(BlockInit.WHITE_LEAVE_CARPET.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> GRAY_LEAVE_CARPET_ITEM = ITEMS.register("gray_leave_carpet", () -> new BlockNamedItem(BlockInit.GRAY_LEAVE_CARPET.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> PINK_LEAVE_CARPET_ITEM = ITEMS.register("pink_leave_carpet", () -> new BlockNamedItem(BlockInit.PINK_LEAVE_CARPET.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> PURPLE_LEAVE_CARPET_ITEM = ITEMS.register("purple_leave_carpet", () -> new BlockNamedItem(BlockInit.PURPLE_LEAVE_CARPET.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> MAGENTA_LEAVE_CARPET_ITEM = ITEMS.register("magenta_leave_carpet", () -> new BlockNamedItem(BlockInit.MAGENTA_LEAVE_CARPET.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> LIGHT_GRAY_LEAVE_CARPET_ITEM = ITEMS.register("light_gray_leave_carpet", () -> new BlockNamedItem(BlockInit.LIGHT_GRAY_LEAVE_CARPET.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> LIGHT_BLUE_LEAVE_CARPET_ITEM = ITEMS.register("light_blue_leave_carpet", () -> new BlockNamedItem(BlockInit.LIGHT_BLUE_LEAVE_CARPET.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> CYAN_LEAVE_CARPET_ITEM = ITEMS.register("cyan_leave_carpet", () -> new BlockNamedItem(BlockInit.CYAN_LEAVE_CARPET.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> BROWN_LEAVE_CARPET_ITEM = ITEMS.register("brown_leave_carpet", () -> new BlockNamedItem(BlockInit.BROWN_LEAVE_CARPET.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> BLACK_VINE_ITEM = ITEMS.register("black_vine", () -> new BlockNamedItem(BlockInit.BLACK_VINE.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> GRAY_VINE_ITEM = ITEMS.register("gray_vine", () -> new BlockNamedItem(BlockInit.GRAY_VINE.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> PINK_VINE_ITEM = ITEMS.register("pink_vine", () -> new BlockNamedItem(BlockInit.PINK_VINE.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> PURPLE_VINE_ITEM = ITEMS.register("purple_vine", () -> new BlockNamedItem(BlockInit.PURPLE_VINE.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> MAGENTA_VINE_ITEM = ITEMS.register("magenta_vine", () -> new BlockNamedItem(BlockInit.MAGENTA_VINE.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> CYAN_VINE_ITEM = ITEMS.register("cyan_vine", () -> new BlockNamedItem(BlockInit.CYAN_VINE.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> DARK_OAK_ITEM_HOLDER_ITEM = ITEMS.register("dark_oak_item_holder", () -> new BlockNamedItem(BlockInit.DARK_OAK_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> SPRUCE_ITEM_HOLDER_ITEM = ITEMS.register("spruce_item_holder", () -> new BlockNamedItem(BlockInit.SPRUCE_ITEM_HOLDER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BROWN_VINE_ITEM = ITEMS.register("brown_vine", () -> new BlockNamedItem(BlockInit.BROWN_VINE.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> LIGHT_GRAY_VINE_ITEM = ITEMS.register("light_gray_vine", () -> new BlockNamedItem(BlockInit.LIGHT_GRAY_VINE.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> BLACK_CONCRETE_STAIR_ITEM = ITEMS.register("black_concrete_stair", () -> new BlockNamedItem(BlockInit.BLACK_CONCRETE_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> WHITE_CONCRETE_STAIR_ITEM = ITEMS.register("white_concrete_stair", () -> new BlockNamedItem(BlockInit.WHITE_CONCRETE_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> GRAY_CONCRETE_STAIR_ITEM = ITEMS.register("gray_concrete_stair", () -> new BlockNamedItem(BlockInit.GRAY_CONCRETE_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> MOON_FLOWER_ITEM = ITEMS.register("moon_flower", () -> new BlockNamedItem(BlockInit.MOON_FLOWER.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> BLUE_CONCRETE_STAIR_ITEM = ITEMS.register("blue_concrete_stair", () -> new BlockNamedItem(BlockInit.BLUE_CONCRETE_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> CYAN_CONCRETE_STAIR_ITEM = ITEMS.register("cyan_concrete_stair", () -> new BlockNamedItem(BlockInit.CYAN_CONCRETE_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_STAIR_ITEM = ITEMS.register("light_blue_concrete_stair", () -> new BlockNamedItem(BlockInit.LIGHT_BLUE_CONCRETE_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BROWN_ROSE_BUSH_ITEM = ITEMS.register("brown_rose_bush", () -> new BlockNamedItem(BlockInit.BROWN_ROSE_BUSH.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG))));
    public static final RegistryObject<Item> PINK_CONCRETE_STAIR_ITEM = ITEMS.register("pink_concrete_stair", () -> new BlockNamedItem(BlockInit.PINK_CONCRETE_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> PURPLE_CONCRETE_STAIR_ITEM = ITEMS.register("purple_concrete_stair", () -> new BlockNamedItem(BlockInit.PURPLE_CONCRETE_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_STAIR_ITEM = ITEMS.register("magenta_concrete_stair", () -> new BlockNamedItem(BlockInit.MAGENTA_CONCRETE_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIME_CONCRETE_STAIR_ITEM = ITEMS.register("lime_concrete_stair", () -> new BlockNamedItem(BlockInit.LIME_CONCRETE_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> YELLOW_CONCRETE_STAIR_ITEM = ITEMS.register("yellow_concrete_stair", () -> new BlockNamedItem(BlockInit.YELLOW_CONCRETE_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> ORANGE_CONCRETE_STAIR_ITEM = ITEMS.register("orange_concrete_stair", () -> new BlockNamedItem(BlockInit.ORANGE_CONCRETE_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LUCK_ORE_ITEM = ITEMS.register("luck_ore", () -> new BlockNamedItem(BlockInit.LUCK_ORE.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> HASTE_ORE_ITEM = ITEMS.register("haste_ore", () -> new BlockNamedItem(BlockInit.HASTE_ORE.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> RED_CONCRETE_STAIR_ITEM = ITEMS.register("red_concrete_stair", () -> new BlockNamedItem(BlockInit.RED_CONCRETE_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BROWN_CONCRETE_STAIR_ITEM = ITEMS.register("brown_concrete_stair", () -> new BlockNamedItem(BlockInit.BROWN_CONCRETE_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_STAIR_ITEM = ITEMS.register("light_gray_concrete_stair", () -> new BlockNamedItem(BlockInit.LIGHT_GRAY_CONCRETE_STAIR.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> CYAN_CONCRETE_SLAB_ITEM = ITEMS.register("cyan_concrete_slab", () -> new BlockNamedItem(BlockInit.CYAN_CONCRETE_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BLUE_CONCRETE_SLAB_ITEM = ITEMS.register("blue_concrete_slab", () -> new BlockNamedItem(BlockInit.BLUE_CONCRETE_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_SLAB_ITEM = ITEMS.register("light_blue_concrete_slab", () -> new BlockNamedItem(BlockInit.LIGHT_BLUE_CONCRETE_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BLACK_CONCRETE_SLAB_ITEM = ITEMS.register("black_concrete_slab", () -> new BlockNamedItem(BlockInit.BLACK_CONCRETE_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> WHITE_CONCRETE_SLAB_ITEM = ITEMS.register("white_concrete_slab", () -> new BlockNamedItem(BlockInit.WHITE_CONCRETE_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> BROWN_CONCRETE_SLAB_ITEM = ITEMS.register("brown_concrete_slab", () -> new BlockNamedItem(BlockInit.BROWN_CONCRETE_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> RED_CONCRETE_SLAB_ITEM = ITEMS.register("red_concrete_slab", () -> new BlockNamedItem(BlockInit.RED_CONCRETE_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> ORANGE_CONCRETE_SLAB_ITEM = ITEMS.register("orange_concrete_slab", () -> new BlockNamedItem(BlockInit.ORANGE_CONCRETE_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> YELLOW_CONCRETE_SLAB_ITEM = ITEMS.register("yellow_concrete_slab", () -> new BlockNamedItem(BlockInit.YELLOW_CONCRETE_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> CHICKEN_HUT_ITEM = ITEMS.register("chicken_hut", () -> new BlockNamedItem(BlockInit.CHICKEN_HUT.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> GARDENING_TABLE_ITEM = ITEMS.register("gardening_table", () -> new BlockNamedItem(BlockInit.GARDENING_TABLE.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> PINK_CONCRETE_SLAB_ITEM = ITEMS.register("pink_concrete_slab", () -> new BlockNamedItem(BlockInit.PINK_CONCRETE_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> PURPLE_CONCRETE_SLAB_ITEM = ITEMS.register("purple_concrete_slab", () -> new BlockNamedItem(BlockInit.PURPLE_CONCRETE_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_SLAB_ITEM = ITEMS.register("magenta_concrete_slab", () -> new BlockNamedItem(BlockInit.MAGENTA_CONCRETE_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> GRAY_CONCRETE_SLAB_ITEM = ITEMS.register("gray_concrete_slab", () -> new BlockNamedItem(BlockInit.GRAY_CONCRETE_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_SLAB_ITEM = ITEMS.register("light_gray_concrete_slab", () -> new BlockNamedItem(BlockInit.LIGHT_GRAY_CONCRETE_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> GREEN_CONCRETE_SLAB_ITEM = ITEMS.register("green_concrete_slab", () -> new BlockNamedItem(BlockInit.GREEN_CONCRETE_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIME_CONCRETE_SLAB_ITEM = ITEMS.register("lime_concrete_slab", () -> new BlockNamedItem(BlockInit.LIME_CONCRETE_SLAB.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> LIME_SAND_ITEM = ITEMS.register("lime_sand", () -> new BlockNamedItem(BlockInit.LIME_SAND.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> ORANGE_SAND_ITEM = ITEMS.register("orange_sand", () -> new BlockNamedItem(BlockInit.ORANGE_SAND.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> YELLOW_SAND_ITEM = ITEMS.register("yellow_sand", () -> new BlockNamedItem(BlockInit.YELLOW_SAND.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> PINK_SAND_ITEM = ITEMS.register("pink_sand", () -> new BlockNamedItem(BlockInit.PINK_SAND.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<Item> PURPLE_SAND_ITEM = ITEMS.register("purple_sand", () -> new BlockNamedItem(BlockInit.PURPLE_SAND.get(), (new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS))));
    public static final RegistryObject<BlockItem> MILK_CUP_ITEM = ITEMS.register("milkcup_flower", () -> new BlockItem(BlockInit.MILK_CUP.get(), new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG)));
    public static final RegistryObject<BlockItem> MOSS_BLOCK_ITEM = ITEMS.register("moss_block", () -> new BlockItem(BlockInit.MOSS_BLOCK.get(), new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));
    public static final RegistryObject<BlockItem> MANGO_BLOCK_ITEM = ITEMS.register("mango_block", () -> new BlockItem(BlockInit.MANGO_BLOCK.get(), new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup5.VEG).food(FoodItems.mango)));
    public static final RegistryObject<BlockItem> MOSS_BLOCK_SLAB_ITEM = ITEMS.register("moss_block_slab", () -> new BlockItem(BlockInit.MOSS_BLOCK_SLAB.get(), new Item.Properties().group(MoreFeatures.MoreFeaturesItemGroup.BLOCKS)));



}
