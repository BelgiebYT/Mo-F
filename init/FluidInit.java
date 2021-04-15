package com.belgieyt.morefeatures.init;

import com.belgieyt.morefeatures.MoreFeatures;
import com.belgieyt.morefeatures.blocks.HasteWaterBlock;
import com.belgieyt.morefeatures.blocks.HealingWaterBlock;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.WaterFluid;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidInit {

    public static final DeferredRegister<Fluid> FLUID = DeferredRegister.create(ForgeRegistries.FLUIDS, MoreFeatures.MOD_ID);

    public static final ResourceLocation HEALING_WATER_STILL_RL = new ResourceLocation(MoreFeatures.MOD_ID, "blocks/healing_water_still");
    public static final ResourceLocation HEALING_WATER_FLOW_RL = new ResourceLocation(MoreFeatures.MOD_ID, "blocks/healing_water_flowing");
    public static final ResourceLocation HEALING_WATER_OVERLAY_RL = new ResourceLocation(MoreFeatures.MOD_ID, "blocks/healing_water_overlay");

    public static final RegistryObject<FlowingFluid> HEALING_WATER = FLUID.register("healing_water",
            () -> new ForgeFlowingFluid.Source(FluidInit.HEALING_WATER_PROPERTIES));
    public static final RegistryObject<FlowingFluid> HEALING_WATER_FLOWING = FLUID.register("healing_water_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.HEALING_WATER_PROPERTIES));

    public static final ForgeFlowingFluid.Properties HEALING_WATER_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> HEALING_WATER.get(), () -> HEALING_WATER_FLOWING.get(), FluidAttributes.builder(HEALING_WATER_STILL_RL, HEALING_WATER_FLOW_RL)
            .density(1000).luminosity(1000).rarity(Rarity.RARE).sound(SoundEvents.BLOCK_WATER_AMBIENT).overlay(HEALING_WATER_OVERLAY_RL)).block(() -> FluidInit.HEALING_WATER_BLOCK.get()).bucket(() -> ItemInit.HEALING_WATER_BUCKET.get());

    public static final RegistryObject<FlowingFluidBlock> HEALING_WATER_BLOCK = BlockInit.BLOCKS.register("healing_water_block", () -> new HealingWaterBlock(() -> FluidInit.HEALING_WATER.get()));



    public static final ResourceLocation HASTE_WATER_STILL_RL = new ResourceLocation(MoreFeatures.MOD_ID, "blocks/haste_water_still");
    public static final ResourceLocation HASTE_WATER_FLOW_RL = new ResourceLocation(MoreFeatures.MOD_ID, "blocks/haste_water_flowing");
    public static final ResourceLocation HASTE_WATER_OVERLAY_RL = new ResourceLocation(MoreFeatures.MOD_ID, "blocks/haste_water_overlay");

    public static final RegistryObject<FlowingFluid> HASTE_WATER = FLUID.register("haste_water",
            () -> new ForgeFlowingFluid.Source(FluidInit.HASTE_WATER_PROPERTIES));
    public static final RegistryObject<FlowingFluid> HASTE_WATER_FLOWING = FLUID.register("haste_water_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidInit.HASTE_WATER_PROPERTIES));

    public static final ForgeFlowingFluid.Properties HASTE_WATER_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> HASTE_WATER.get(), () -> HASTE_WATER_FLOWING.get(), FluidAttributes.builder(HASTE_WATER_STILL_RL, HASTE_WATER_FLOW_RL)
            .density(1000).luminosity(1000).rarity(Rarity.RARE).sound(SoundEvents.BLOCK_WATER_AMBIENT).overlay(HASTE_WATER_OVERLAY_RL)).block(() -> FluidInit.HASTE_WATER_BLOCK.get()).bucket(() -> ItemInit.HASTE_WATER_BUCKET.get());

    public static final RegistryObject<FlowingFluidBlock> HASTE_WATER_BLOCK = BlockInit.BLOCKS.register("haste_water_block", () -> new HasteWaterBlock(() -> FluidInit.HASTE_WATER.get()));

}