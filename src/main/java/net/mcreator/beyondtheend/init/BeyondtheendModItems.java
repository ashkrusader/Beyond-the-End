
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

import net.mcreator.beyondtheend.item.TabIconItem;
import net.mcreator.beyondtheend.item.EnderiteSwordItem;
import net.mcreator.beyondtheend.item.EnderiteShovelItem;
import net.mcreator.beyondtheend.item.EnderitePickaxeItem;
import net.mcreator.beyondtheend.item.EnderiteItem;
import net.mcreator.beyondtheend.item.EnderiteHoeItem;
import net.mcreator.beyondtheend.item.EnderiteAxeItem;
import net.mcreator.beyondtheend.item.EnderiteArmorItem;
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
	public static final RegistryObject<Item> BEYOND_WILLOW_LOG = block(BeyondtheendModBlocks.BEYOND_WILLOW_LOG);
	public static final RegistryObject<Item> BEYOND_WILLOW_WOOD = block(BeyondtheendModBlocks.BEYOND_WILLOW_WOOD);
	public static final RegistryObject<Item> BEYOND_WILLOW_PLANKS = block(BeyondtheendModBlocks.BEYOND_WILLOW_PLANKS);
	public static final RegistryObject<Item> BEYOND_WILLOW_STAIRS = block(BeyondtheendModBlocks.BEYOND_WILLOW_STAIRS);
	public static final RegistryObject<Item> BEYOND_WILLOW_SLAB = block(BeyondtheendModBlocks.BEYOND_WILLOW_SLAB);
	public static final RegistryObject<Item> BEYOND_WILLOW_LEAVES = block(BeyondtheendModBlocks.BEYOND_WILLOW_LEAVES);
	public static final RegistryObject<Item> BEYOND_WILLOW_FENCE = block(BeyondtheendModBlocks.BEYOND_WILLOW_FENCE);
	public static final RegistryObject<Item> BEYOND_WILLOW_FENCE_GATE = block(BeyondtheendModBlocks.BEYOND_WILLOW_FENCE_GATE);
	public static final RegistryObject<Item> BEYOND_WILLOW_PRESSURE_PLATE = block(BeyondtheendModBlocks.BEYOND_WILLOW_PRESSURE_PLATE);
	public static final RegistryObject<Item> BEYOND_WILLOW_BUTTON = block(BeyondtheendModBlocks.BEYOND_WILLOW_BUTTON);
	public static final RegistryObject<Item> TAB_ICON = REGISTRY.register("tab_icon", () -> new TabIconItem());
	public static final RegistryObject<Item> ENDERITE_ORE = block(BeyondtheendModBlocks.ENDERITE_ORE);
	public static final RegistryObject<Item> ENDERITE = REGISTRY.register("enderite", () -> new EnderiteItem());
	public static final RegistryObject<Item> ENDERITE_BLOCK = block(BeyondtheendModBlocks.ENDERITE_BLOCK);
	public static final RegistryObject<Item> ENDERITE_PICKAXE = REGISTRY.register("enderite_pickaxe", () -> new EnderitePickaxeItem());
	public static final RegistryObject<Item> ENDERITE_AXE = REGISTRY.register("enderite_axe", () -> new EnderiteAxeItem());
	public static final RegistryObject<Item> ENDERITE_SWORD = REGISTRY.register("enderite_sword", () -> new EnderiteSwordItem());
	public static final RegistryObject<Item> ENDERITE_SHOVEL = REGISTRY.register("enderite_shovel", () -> new EnderiteShovelItem());
	public static final RegistryObject<Item> ENDERITE_HOE = REGISTRY.register("enderite_hoe", () -> new EnderiteHoeItem());
	public static final RegistryObject<Item> ENDERITE_ARMOR_HELMET = REGISTRY.register("enderite_armor_helmet", () -> new EnderiteArmorItem.Helmet());
	public static final RegistryObject<Item> ENDERITE_ARMOR_CHESTPLATE = REGISTRY.register("enderite_armor_chestplate", () -> new EnderiteArmorItem.Chestplate());
	public static final RegistryObject<Item> ENDERITE_ARMOR_LEGGINGS = REGISTRY.register("enderite_armor_leggings", () -> new EnderiteArmorItem.Leggings());
	public static final RegistryObject<Item> ENDERITE_ARMOR_BOOTS = REGISTRY.register("enderite_armor_boots", () -> new EnderiteArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
