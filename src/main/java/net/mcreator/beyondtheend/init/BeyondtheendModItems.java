
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beyondtheend.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.beyondtheend.BeyondtheendMod;

public class BeyondtheendModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BeyondtheendMod.MODID);
	public static final RegistryObject<Item> SPORESTEM_LOG = block(BeyondtheendModBlocks.SPORESTEM_LOG);
	public static final RegistryObject<Item> SPORESTEM_WOOD = block(BeyondtheendModBlocks.SPORESTEM_WOOD);
	public static final RegistryObject<Item> SPORESTEM_PLANKS = block(BeyondtheendModBlocks.SPORESTEM_PLANKS);
	public static final RegistryObject<Item> SPORESTEM_LEAVES = block(BeyondtheendModBlocks.SPORESTEM_LEAVES);
	public static final RegistryObject<Item> SPORESTEM_STAIRS = block(BeyondtheendModBlocks.SPORESTEM_STAIRS);
	public static final RegistryObject<Item> SPORESTEM_SLAB = block(BeyondtheendModBlocks.SPORESTEM_SLAB);
	public static final RegistryObject<Item> SPORESTEM_FENCE = block(BeyondtheendModBlocks.SPORESTEM_FENCE);
	public static final RegistryObject<Item> SPORESTEM_FENCE_GATE = block(BeyondtheendModBlocks.SPORESTEM_FENCE_GATE);
	public static final RegistryObject<Item> SPORESTEM_PRESSURE_PLATE = block(BeyondtheendModBlocks.SPORESTEM_PRESSURE_PLATE);
	public static final RegistryObject<Item> SPORESTEM_BUTTON = block(BeyondtheendModBlocks.SPORESTEM_BUTTON);
	public static final RegistryObject<Item> BEYOND_WILLOW_WOOD = block(BeyondtheendModBlocks.BEYOND_WILLOW_WOOD);
	public static final RegistryObject<Item> BEYOND_WILLOW_LOG = block(BeyondtheendModBlocks.BEYOND_WILLOW_LOG);
	public static final RegistryObject<Item> BEYOND_WILLOW_PLANKS = block(BeyondtheendModBlocks.BEYOND_WILLOW_PLANKS);
	public static final RegistryObject<Item> BEYOND_WILLOW_LEAVES = block(BeyondtheendModBlocks.BEYOND_WILLOW_LEAVES);
	public static final RegistryObject<Item> BEYOND_WILLOW_STAIRS = block(BeyondtheendModBlocks.BEYOND_WILLOW_STAIRS);
	public static final RegistryObject<Item> BEYOND_WILLOW_SLAB = block(BeyondtheendModBlocks.BEYOND_WILLOW_SLAB);
	public static final RegistryObject<Item> BEYOND_WILLOW_FENCE = block(BeyondtheendModBlocks.BEYOND_WILLOW_FENCE);
	public static final RegistryObject<Item> BEYOND_WILLOW_FENCE_GATE = block(BeyondtheendModBlocks.BEYOND_WILLOW_FENCE_GATE);
	public static final RegistryObject<Item> BEYOND_WILLOW_PRESSURE_PLATE = block(BeyondtheendModBlocks.BEYOND_WILLOW_PRESSURE_PLATE);
	public static final RegistryObject<Item> BEYOND_WILLOW_BUTTON = block(BeyondtheendModBlocks.BEYOND_WILLOW_BUTTON);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
