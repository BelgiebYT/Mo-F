package com.belgieyt.morefeatures.init;

import com.belgieyt.morefeatures.MoreFeatures;
import com.belgieyt.morefeatures.recipes.*;
import com.google.gson.JsonObject;
import net.minecraft.item.crafting.*;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RecipeSerializerInit {

    public static final IRecipeSerializer<AdvancerRecipe> ADVANCER_RECIPE_SERIALIZER = new AdvancerRecipeSerializer<>(AdvancerRecipe::new, 100);
    public static final IRecipeSerializer<TeaRecipe> TEA_RECIPE_SERIALIZER = new TeaRecipe.Serializer();


    public static final IRecipeType<AdvancerRecipe> ADVANCER_TYPE = registerType(IAdvancerRecipe.RECIPE_TYPE_ID);
    public static final IRecipeType<TeaRecipe> TEA_TYPE = registerType(IAdvancerRecipe.RECIPE_TYPE_ID);


    public static final DeferredRegister<IRecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(
            ForgeRegistries.RECIPE_SERIALIZERS, MoreFeatures.MOD_ID);

    public static final RegistryObject<IRecipeSerializer<?>> ADVANCER_SERIALIZER = RECIPE_SERIALIZERS.register("advancer",
            () -> ADVANCER_RECIPE_SERIALIZER);
    public static final RegistryObject<IRecipeSerializer<?>> TEA_SERIALIZER = RECIPE_SERIALIZERS.register("tea",
            () -> TEA_RECIPE_SERIALIZER);

    private static class RecipeType<T extends IRecipe<?>> implements IRecipeType<T> {
        @Override
        public String toString() {
            return Registry.RECIPE_TYPE.getKey(this).toString();
        }
    }

    private static <T extends IRecipeType> T registerType(ResourceLocation recipeTypeId) {
        return (T) Registry.register(Registry.RECIPE_TYPE, recipeTypeId, new RecipeType<>());
    }
}

