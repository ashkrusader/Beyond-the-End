
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beyondtheend.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.beyondtheend.block.SporestemWoodBlock;
import net.mcreator.beyondtheend.block.SporestemStairsBlock;
import net.mcreator.beyondtheend.block.SporestemSlabBlock;
import net.mcreator.beyondtheend.block.SporestemPressurePlateBlock;
import net.mcreator.beyondtheend.block.SporestemPlanksBlock;
import net.mcreator.beyondtheend.block.SporestemLogBlock;
import net.mcreator.beyondtheend.block.SporestemLeavesBlock;
import net.mcreator.beyondtheend.block.SporestemFenceGateBlock;
import net.mcreator.beyondtheend.block.SporestemFenceBlock;
import net.mcreator.beyondtheend.block.SporestemButtonBlock;
import net.mcreator.beyondtheend.block.BeyondWillowWoodBlock;
import net.mcreator.beyondtheend.block.BeyondWillowStairsBlock;
import net.mcreator.beyondtheend.block.BeyondWillowSlabBlock;
import net.mcreator.beyondtheend.block.BeyondWillowPressurePlateBlock;
import net.mcreator.beyondtheend.block.BeyondWillowPlanksBlock;
import net.mcreator.beyondtheend.block.BeyondWillowLogBlock;
import net.mcreator.beyondtheend.block.BeyondWillowLeavesBlock;
import net.mcreator.beyondtheend.block.BeyondWillowFenceGateBlock;
import net.mcreator.beyondtheend.block.BeyondWillowFenceBlock;
import net.mcreator.beyondtheend.block.BeyondWillowButtonBlock;
import net.mcreator.beyondtheend.BeyondtheendMod;

public class BeyondtheendModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BeyondtheendMod.MODID);
	public static final RegistryObject<Block> SPORESTEM_LOG = REGISTRY.register("sporestem_log", () -> new SporestemLogBlock());
	public static final RegistryObject<Block> SPORESTEM_WOOD = REGISTRY.register("sporestem_wood", () -> new SporestemWoodBlock());
	public static final RegistryObject<Block> SPORESTEM_PLANKS = REGISTRY.register("sporestem_planks", () -> new SporestemPlanksBlock());
	public static final RegistryObject<Block> SPORESTEM_LEAVES = REGISTRY.register("sporestem_leaves", () -> new SporestemLeavesBlock());
	public static final RegistryObject<Block> SPORESTEM_STAIRS = REGISTRY.register("sporestem_stairs", () -> new SporestemStairsBlock());
	public static final RegistryObject<Block> SPORESTEM_SLAB = REGISTRY.register("sporestem_slab", () -> new SporestemSlabBlock());
	public static final RegistryObject<Block> SPORESTEM_FENCE = REGISTRY.register("sporestem_fence", () -> new SporestemFenceBlock());
	public static final RegistryObject<Block> SPORESTEM_FENCE_GATE = REGISTRY.register("sporestem_fence_gate", () -> new SporestemFenceGateBlock());
	public static final RegistryObject<Block> SPORESTEM_PRESSURE_PLATE = REGISTRY.register("sporestem_pressure_plate", () -> new SporestemPressurePlateBlock());
	public static final RegistryObject<Block> SPORESTEM_BUTTON = REGISTRY.register("sporestem_button", () -> new SporestemButtonBlock());
	public static final RegistryObject<Block> BEYOND_WILLOW_WOOD = REGISTRY.register("beyond_willow_wood", () -> new BeyondWillowWoodBlock());
	public static final RegistryObject<Block> BEYOND_WILLOW_LOG = REGISTRY.register("beyond_willow_log", () -> new BeyondWillowLogBlock());
	public static final RegistryObject<Block> BEYOND_WILLOW_PLANKS = REGISTRY.register("beyond_willow_planks", () -> new BeyondWillowPlanksBlock());
	public static final RegistryObject<Block> BEYOND_WILLOW_LEAVES = REGISTRY.register("beyond_willow_leaves", () -> new BeyondWillowLeavesBlock());
	public static final RegistryObject<Block> BEYOND_WILLOW_STAIRS = REGISTRY.register("beyond_willow_stairs", () -> new BeyondWillowStairsBlock());
	public static final RegistryObject<Block> BEYOND_WILLOW_SLAB = REGISTRY.register("beyond_willow_slab", () -> new BeyondWillowSlabBlock());
	public static final RegistryObject<Block> BEYOND_WILLOW_FENCE = REGISTRY.register("beyond_willow_fence", () -> new BeyondWillowFenceBlock());
	public static final RegistryObject<Block> BEYOND_WILLOW_FENCE_GATE = REGISTRY.register("beyond_willow_fence_gate", () -> new BeyondWillowFenceGateBlock());
	public static final RegistryObject<Block> BEYOND_WILLOW_PRESSURE_PLATE = REGISTRY.register("beyond_willow_pressure_plate", () -> new BeyondWillowPressurePlateBlock());
	public static final RegistryObject<Block> BEYOND_WILLOW_BUTTON = REGISTRY.register("beyond_willow_button", () -> new BeyondWillowButtonBlock());
}
