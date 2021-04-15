package com.belgieyt.morefeatures.init;

import com.belgieyt.morefeatures.MoreFeatures;
import com.belgieyt.morefeatures.entities.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.entity.item.ExperienceBottleEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.item.minecart.MinecartEntity;
import net.minecraft.entity.projectile.EyeOfEnderEntity;
import net.minecraft.entity.projectile.SmallFireballEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, MoreFeatures.MOD_ID);


    public static final RegistryObject<EntityType<StrawberryCowEntity>> strawberrycow = ENTITY_TYPES.register("strawberrycow",
            () -> EntityType.Builder.create(StrawberryCowEntity:: new, EntityClassification.CREATURE)
                    .size(1.0F, 1.3F)
                    .build(new ResourceLocation(MoreFeatures.MOD_ID, "strawberrycow").toString()));
    public static final RegistryObject<EntityType<LemonCowEntity>> lemoncow = ENTITY_TYPES.register("lemoncow",
            () -> EntityType.Builder.create(LemonCowEntity:: new, EntityClassification.CREATURE)
                    .size(1.0F, 1.3F)
                    .build(new ResourceLocation(MoreFeatures.MOD_ID, "lemoncow").toString()));
    public static final RegistryObject<EntityType<BlueberryCowEntity>> blueberrycow = ENTITY_TYPES.register("blueberrycow",
            () -> EntityType.Builder.create(BlueberryCowEntity:: new, EntityClassification.CREATURE)
                    .size(1.0F, 1.3F)
                    .build(new ResourceLocation(MoreFeatures.MOD_ID, "blueberrycow").toString()));
    public static final RegistryObject<EntityType<BerryCowEntity>> berrycow = ENTITY_TYPES.register("berrycow",
            () -> EntityType.Builder.create(BerryCowEntity:: new, EntityClassification.CREATURE)
                    .size(1.0F, 1.3F)
                    .build(new ResourceLocation(MoreFeatures.MOD_ID, "berrycow").toString()));
    public static final RegistryObject<EntityType<PumpkinCowEntity>> pumpkincow = ENTITY_TYPES.register("pumpkincow",
            () -> EntityType.Builder.create(PumpkinCowEntity:: new, EntityClassification.CREATURE)
                    .size(1.0F, 1.3F)
                    .build(new ResourceLocation(MoreFeatures.MOD_ID, "pumpkincow").toString()));
    public static final RegistryObject<EntityType<MelonCowEntity>> meloncow = ENTITY_TYPES.register("meloncow",
            () -> EntityType.Builder.create(MelonCowEntity:: new, EntityClassification.CREATURE)
                    .size(1.0F, 1.3F)
                    .build(new ResourceLocation(MoreFeatures.MOD_ID, "meloncow").toString()));
    public static final RegistryObject<EntityType<KiwiCowEntity>> kiwicow = ENTITY_TYPES.register("kiwicow",
            () -> EntityType.Builder.create(KiwiCowEntity:: new, EntityClassification.CREATURE)
                    .size(1.0F, 1.3F)
                    .build(new ResourceLocation(MoreFeatures.MOD_ID, "kiwicow").toString()));
    public static final RegistryObject<EntityType<BlackberryCowEntity>> blackberrycow = ENTITY_TYPES.register("blackberrycow",
            () -> EntityType.Builder.create(BlackberryCowEntity:: new, EntityClassification.CREATURE)
                    .size(1.0F, 1.3F)
                    .build(new ResourceLocation(MoreFeatures.MOD_ID, "blackberrycow").toString()));
    public static final RegistryObject<EntityType<PeachCowEntity>> peachcow = ENTITY_TYPES.register("peachcow",
            () -> EntityType.Builder.create(PeachCowEntity:: new, EntityClassification.CREATURE)
                    .size(1.0F, 1.3F)
                    .build(new ResourceLocation(MoreFeatures.MOD_ID, "peachcow").toString()));
    public static final RegistryObject<EntityType<MangoCowEntity>> mangocow = ENTITY_TYPES.register("mangocow",
            () -> EntityType.Builder.create(MangoCowEntity:: new, EntityClassification.CREATURE)
                    .size(1.0F, 1.3F)
                    .build(new ResourceLocation(MoreFeatures.MOD_ID, "mangocow").toString()));
    public static final RegistryObject<EntityType<DevilCowEntity>> devilcow = ENTITY_TYPES.register("devilcow",
            () -> EntityType.Builder.create(DevilCowEntity:: new, EntityClassification.CREATURE)
                    .size(1.0F, 1.3F)
                    .build(new ResourceLocation(MoreFeatures.MOD_ID, "devilcow").toString()));
    public static final RegistryObject<EntityType<JollyLlamaEntity>> jollyllama = ENTITY_TYPES.register("jollyllama",
            () -> EntityType.Builder.create(JollyLlamaEntity:: new, EntityClassification.CREATURE)
                    .size(1.0F, 1.6F)
                    .build(new ResourceLocation(MoreFeatures.MOD_ID, "jollyllama").toString()));
    public static final RegistryObject<EntityType<BoneSpiderEntity>> bonespider = ENTITY_TYPES.register("bonespider",
            () -> EntityType.Builder.create(BoneSpiderEntity:: new, EntityClassification.MONSTER)
                    .size(1.8F, 0.6F)
                    .build(new ResourceLocation(MoreFeatures.MOD_ID, "bonespider").toString()));
    public static final RegistryObject<EntityType<JumboRabbitEntity>> jumborabbit = ENTITY_TYPES.register("jumborabbit",
            () -> EntityType.Builder.create(JumboRabbitEntity:: new, EntityClassification.CREATURE)
                    .size(1.0F, 1.0F)
                    .build(new ResourceLocation(MoreFeatures.MOD_ID, "jumborabbit").toString()));
    public static final RegistryObject<EntityType<BoneDogEntity>> bonedog = ENTITY_TYPES.register("bonedog",
            () -> EntityType.Builder.create(BoneDogEntity:: new, EntityClassification.CREATURE)
                    .size(0.7F, 0.8F)
                    .build(new ResourceLocation(MoreFeatures.MOD_ID, "bonedog").toString()));


    public static final RegistryObject<EntityType<BastionEyeEntity>> bastioneye = ENTITY_TYPES.register("bastioneye",
            () -> EntityType.Builder.<BastionEyeEntity>create(BastionEyeEntity::new, EntityClassification.MISC)
                    .size(0.25F, 0.25F)

                    .build(new ResourceLocation(MoreFeatures.MOD_ID, "bastioneye").toString()));
    public static final RegistryObject<EntityType<FortressEyeEntity>> fortresseye = ENTITY_TYPES.register("fortresseye",
            () -> EntityType.Builder.<FortressEyeEntity>create(FortressEyeEntity::new, EntityClassification.MISC)
                    .size(0.25F, 0.25F)
                    .build(new ResourceLocation(MoreFeatures.MOD_ID, "fortresseye").toString()));
    public static final RegistryObject<EntityType<CityEyeEntity>> cityeye = ENTITY_TYPES.register("cityeye",
            () -> EntityType.Builder.<CityEyeEntity>create(CityEyeEntity::new, EntityClassification.MISC)
                    .size(0.25F, 0.25F)
                    .build(new ResourceLocation(MoreFeatures.MOD_ID, "cityeye").toString()));

    public static final RegistryObject<EntityType<RedToadStoolEntity>> redtoadstool = ENTITY_TYPES.register("redtoadstool",
            () -> EntityType.Builder.create(RedToadStoolEntity:: new, EntityClassification.CREATURE)
                    .size(0.7F, 0.7F)
                    .build(new ResourceLocation(MoreFeatures.MOD_ID, "redtoadstool").toString()));
    public static final RegistryObject<EntityType<BrownToadStoolEntity>> browntoadstool = ENTITY_TYPES.register("browntoadstool",
            () -> EntityType.Builder.create(BrownToadStoolEntity:: new, EntityClassification.CREATURE)
                    .size(0.7F, 0.7F)
                    .build(new ResourceLocation(MoreFeatures.MOD_ID, "browntoadstool").toString()));

    public static final RegistryObject<EntityType<MushroomBossEntity>> mushroomboss = ENTITY_TYPES.register("mushroomboss",
            () -> EntityType.Builder.create(MushroomBossEntity:: new, EntityClassification.CREATURE)
                    .size(1.3F, 3.0F)
                    .build(new ResourceLocation(MoreFeatures.MOD_ID, "mushroomboss").toString()));

    public static final RegistryObject<EntityType<EndBlazeEntity>> endblaze = ENTITY_TYPES.register("endblaze",
            () -> EntityType.Builder.create(EndBlazeEntity:: new, EntityClassification.CREATURE)
                    .immuneToFire().size(0.6F, 1.8F).trackingRange(8)
                    .build(new ResourceLocation(MoreFeatures.MOD_ID, "endblaze").toString()));

}
