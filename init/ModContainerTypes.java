package com.belgieyt.morefeatures.init;

import com.belgieyt.morefeatures.MoreFeatures;
import com.belgieyt.morefeatures.containers.AdvancerContainer;
import com.belgieyt.morefeatures.containers.ItemHolderContainer;
import com.belgieyt.morefeatures.containers.TeaBlockContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainerTypes {

    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = DeferredRegister.create(
            ForgeRegistries.CONTAINERS, MoreFeatures.MOD_ID);

    public static final RegistryObject<ContainerType<ItemHolderContainer>> ITEM_HOLDER = CONTAINER_TYPES
            .register("item_holder", () -> IForgeContainerType.create(ItemHolderContainer::new));

    public static final RegistryObject<ContainerType<AdvancerContainer>> ADVANCER = CONTAINER_TYPES
            .register("advancer", () -> IForgeContainerType.create(AdvancerContainer::new));

    public static final RegistryObject<ContainerType<TeaBlockContainer>> TEA = CONTAINER_TYPES
            .register("tea", () -> IForgeContainerType.create(TeaBlockContainer::new));

    public static void register() {}

}

