package com.belgieyt.morefeatures.init;

import com.belgieyt.morefeatures.MoreFeatures;
import com.belgieyt.morefeatures.tileentity.AdvancerTileentity;
import com.belgieyt.morefeatures.tileentity.ChickenHutTileentity;
import com.belgieyt.morefeatures.tileentity.ItemHolderTileentity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {


    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(
            ForgeRegistries.TILE_ENTITIES, MoreFeatures.MOD_ID);


    public static final RegistryObject<TileEntityType<ItemHolderTileentity>> ITEM_HOLDER = TILE_ENTITY_TYPES
            .register("item_holder", () -> TileEntityType.Builder
                    .create(ItemHolderTileentity::new, BlockInit.BLACK_ITEM_HOLDER.get(),
                            BlockInit.WHITE_ITEM_HOLDER.get(),
                            BlockInit.BLUE_ITEM_HOLDER.get(),
                            BlockInit.RED_ITEM_HOLDER.get(),
                            BlockInit.YELLOW_ITEM_HOLDER.get(),
                            BlockInit.PINK_ITEM_HOLDER.get(),
                            BlockInit.GREEN_ITEM_HOLDER.get(),
                            BlockInit.GRAY_ITEM_HOLDER.get(),
                            BlockInit.LIGHT_GRAY_ITEM_HOLDER.get(),
                            BlockInit.LIGHT_BLUE_ITEM_HOLDER.get(),
                            BlockInit.BROWN_ITEM_HOLDER.get(),
                            BlockInit.CYAN_ITEM_HOLDER.get(),
                            BlockInit.LIME_ITEM_HOLDER.get(),
                            BlockInit.ORANGE_ITEM_HOLDER.get(),
                            BlockInit.PURPLE_ITEM_HOLDER.get(),
                            BlockInit.BIRCH_ITEM_HOLDER.get(),
                            BlockInit.OAK_ITEM_HOLDER.get(),
                            BlockInit.JUNGLE_ITEM_HOLDER.get(),
                            BlockInit.CRIMSON_ITEM_HOLDER.get(),
                            BlockInit.WARPED_ITEM_HOLDER.get(),
                            BlockInit.ACACIA_ITEM_HOLDER.get(),
                            BlockInit.DARK_OAK_ITEM_HOLDER.get(),
                            BlockInit.SPRUCE_ITEM_HOLDER.get(),
                            BlockInit.MAGENTA_ITEM_HOLDER.get()
                    ).build(null));

    public static final RegistryObject<TileEntityType<AdvancerTileentity>> ADVANCER = TILE_ENTITY_TYPES.register("advancer", () ->
            TileEntityType.Builder.create(AdvancerTileentity::new, BlockInit.ADVANCER.get()).build(null));

    public static final RegistryObject<TileEntityType<ChickenHutTileentity>> CHICKEN_HUTS = TILE_ENTITY_TYPES.register("chicken_hut", () ->
            TileEntityType.Builder.create(() -> ChickenHutTileentity.create(1), BlockInit.CHICKEN_HUT.get()).build(null));

}


