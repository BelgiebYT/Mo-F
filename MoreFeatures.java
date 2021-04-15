package com.belgieyt.morefeatures;

import com.belgieyt.morefeatures.blocks.GardeningTableBlock;
import com.belgieyt.morefeatures.entities.*;
import com.belgieyt.morefeatures.events.BoneMealEvent;
import com.belgieyt.morefeatures.init.*;
import com.belgieyt.morefeatures.util.ClientEventBusSubscriber;
import com.belgieyt.morefeatures.util.FlowerGenConfig;
import com.belgieyt.morefeatures.util.MoBConfig;
import com.belgieyt.morefeatures.world.biomes.ConfigSurfaceBuilder;
import com.belgieyt.morefeatures.world.biomes.MoSurfaceBuilder;
import com.belgieyt.morefeatures.world.features.Features;
import com.belgieyt.morefeatures.world.features.FlowerFeature;
import com.belgieyt.morefeatures.world.gen.ModEntitySpawns;
import com.belgieyt.morefeatures.world.gen.ModFeatureGen;
import com.ibm.icu.text.MessagePattern;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.MixinEnvironment;


@SuppressWarnings("deprecation")
@Mod("morefeatures")
@Mod.EventBusSubscriber(modid = MoreFeatures.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoreFeatures {
    public static final String MOD_ID = "morefeatures";
    public static MoreFeatures instance = null;
    private static final Logger LOGGER = LogManager.getLogger(MOD_ID);


    public MoreFeatures() {

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::loadCompleteEvent);

        BiomeInit.BIOMES.register(modEventBus);
        SoundInit.SOUNDS.register(modEventBus);
        EnchantmentInit.ENCHANTMENT.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
        RecipeSerializerInit.RECIPE_SERIALIZERS.register(modEventBus);
        FluidInit.FLUID.register(modEventBus);
        BlockInit.subscribe(FMLJavaModLoadingContext.get().getModEventBus());
        ModTileEntityTypes.TILE_ENTITY_TYPES.register(modEventBus);
        ModContainerTypes.CONTAINER_TYPES.register(modEventBus);
        ModEntityTypes.ENTITY_TYPES.register(modEventBus);
        MoSurfaceBuilder.SURFACE_BUILDER.register(modEventBus);
        Features.FEATURES.register(modEventBus);


        instance = this;
		MinecraftForge.EVENT_BUS.register(this);
}

    private void setup(final FMLCommonSetupEvent event) { }

    private void loadCompleteEvent(final FMLClientSetupEvent event) {

        if (FlowerGenConfig.CONFIG.allowWorldGen.get() == true) {
            MinecraftForge.EVENT_BUS.addListener(ModFeatureGen::addFeaturesToBiomes); }

        MinecraftForge.EVENT_BUS.register(new BoneMealEvent()); }




        private void clientRegistries(final FMLClientSetupEvent event) {
            DeferredWorkQueue.runLater(() -> {

                GlobalEntityTypeAttributes.put(ModEntityTypes.strawberrycow.get(), StrawberryCowEntity.setCustomAttributes().create());
                GlobalEntityTypeAttributes.put(ModEntityTypes.lemoncow.get(), LemonCowEntity.setCustomAttributes().create());
                GlobalEntityTypeAttributes.put(ModEntityTypes.blueberrycow.get(), LemonCowEntity.setCustomAttributes().create());
                GlobalEntityTypeAttributes.put(ModEntityTypes.berrycow.get(), BerryCowEntity.setCustomAttributes().create());
                GlobalEntityTypeAttributes.put(ModEntityTypes.pumpkincow.get(), PumpkinCowEntity.setCustomAttributes().create());
                GlobalEntityTypeAttributes.put(ModEntityTypes.meloncow.get(), MelonCowEntity.setCustomAttributes().create());
                GlobalEntityTypeAttributes.put(ModEntityTypes.kiwicow.get(), KiwiCowEntity.setCustomAttributes().create());
                GlobalEntityTypeAttributes.put(ModEntityTypes.blackberrycow.get(), BlackberryCowEntity.setCustomAttributes().create());
                GlobalEntityTypeAttributes.put(ModEntityTypes.peachcow.get(), PeachCowEntity.setCustomAttributes().create());
                GlobalEntityTypeAttributes.put(ModEntityTypes.mangocow.get(), MangoCowEntity.setCustomAttributes().create());
                GlobalEntityTypeAttributes.put(ModEntityTypes.devilcow.get(), DevilCowEntity.setCustomAttributes().create());
                GlobalEntityTypeAttributes.put(ModEntityTypes.jollyllama.get(), JollyLlamaEntity.setCustomAttributes().create());
                GlobalEntityTypeAttributes.put(ModEntityTypes.bonespider.get(), BoneSpiderEntity.setCustomAttributes().create());
                GlobalEntityTypeAttributes.put(ModEntityTypes.jumborabbit.get(), JumboRabbitEntity.setCustomAttributes().create());
                GlobalEntityTypeAttributes.put(ModEntityTypes.bonedog.get(), BoneDogEntity.setCustomAttributes().create());
                GlobalEntityTypeAttributes.put(ModEntityTypes.redtoadstool.get(), RedToadStoolEntity.setCustomAttributes().create());
                GlobalEntityTypeAttributes.put(ModEntityTypes.browntoadstool.get(), BrownToadStoolEntity.setCustomAttributes().create());
                GlobalEntityTypeAttributes.put(ModEntityTypes.mushroomboss.get(), MushroomBossEntity.setCustomAttributes().create());
                GlobalEntityTypeAttributes.put(ModEntityTypes.endblaze.get(), EndBlazeEntity.setCustomAttributes().create());
            });

        }




    public static class MoreFeaturesItemGroup extends ItemGroup {
        public static final MoreFeaturesItemGroup BLOCKS = new MoreFeaturesItemGroup(ItemGroup.GROUPS.length, "morefeaturestab");

        private MoreFeaturesItemGroup(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlockInit.BLACK_PLANKS.get());
        }
    }

    public static class MoreFeaturesItemGroup2 extends ItemGroup
    {
        public static final MoreFeaturesItemGroup2 ITEMS = new MoreFeaturesItemGroup2(ItemGroup.GROUPS.length, "morefeaturestab2");
        private MoreFeaturesItemGroup2(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.MOLTEN.get());
        }

        }
    public static class MoreFeaturesItemGroup3 extends ItemGroup
    {
        public static final MoreFeaturesItemGroup3 TOOLS = new MoreFeaturesItemGroup3(ItemGroup.GROUPS.length, "morefeaturestab3");
        private MoreFeaturesItemGroup3(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.DIAMOND_KARAMBIT.get());
        }
    }
    public static class MoreFeaturesItemGroup4 extends ItemGroup
    {
        public static final MoreFeaturesItemGroup4 SPAWN_EGGS = new MoreFeaturesItemGroup4(ItemGroup.GROUPS.length, "morefeaturestab4");
        private MoreFeaturesItemGroup4(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.STRAWBERRYCOW_SPAWN_EGG.get());
        }
    }
    public static class MoreFeaturesItemGroup5 extends ItemGroup
    {
        public static final MoreFeaturesItemGroup5 VEG = new MoreFeaturesItemGroup5(ItemGroup.GROUPS.length, "morefeaturestab5");
        private MoreFeaturesItemGroup5(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlockInit.BLACK_ROSE_BUSH.get().asItem());
        }
    }
    public static ResourceLocation loc(String name) {
        return new ResourceLocation(MOD_ID, name);
    }
}



