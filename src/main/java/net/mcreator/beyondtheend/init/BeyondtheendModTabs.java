
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beyondtheend.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BeyondtheendModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(BeyondtheendModItems.ENDERITE_SWORD.get());
			tabData.accept(BeyondtheendModItems.ENDERITE_ARMOR_HELMET.get());
			tabData.accept(BeyondtheendModItems.ENDERITE_ARMOR_CHESTPLATE.get());
			tabData.accept(BeyondtheendModItems.ENDERITE_ARMOR_LEGGINGS.get());
			tabData.accept(BeyondtheendModItems.ENDERITE_ARMOR_BOOTS.get());
		}

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(BeyondtheendModItems.ENDERITE_PICKAXE.get());
			tabData.accept(BeyondtheendModItems.ENDERITE_AXE.get());
			tabData.accept(BeyondtheendModItems.ENDERITE_SHOVEL.get());
			tabData.accept(BeyondtheendModItems.ENDERITE_HOE.get());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("beyondtheend", "beyond_the_end"),
				builder -> builder.title(Component.translatable("item_group.beyondtheend.beyond_the_end")).icon(() -> new ItemStack(BeyondtheendModItems.TAB_ICON.get())).displayItems((parameters, tabData) -> {
					tabData.accept(BeyondtheendModBlocks.SPORESTEM_LOG.get().asItem());
					tabData.accept(BeyondtheendModBlocks.SPORESTEM_WOOD.get().asItem());
					tabData.accept(BeyondtheendModBlocks.SPORESTEM_PLANKS.get().asItem());
					tabData.accept(BeyondtheendModBlocks.SPORESTEM_LEAVES.get().asItem());
					tabData.accept(BeyondtheendModBlocks.SPORESTEM_STAIRS.get().asItem());
					tabData.accept(BeyondtheendModBlocks.SPORESTEM_SLAB.get().asItem());
					tabData.accept(BeyondtheendModBlocks.SPORESTEM_FENCE.get().asItem());
					tabData.accept(BeyondtheendModBlocks.SPORESTEM_FENCE_GATE.get().asItem());
					tabData.accept(BeyondtheendModBlocks.SPORESTEM_PRESSURE_PLATE.get().asItem());
					tabData.accept(BeyondtheendModBlocks.SPORESTEM_BUTTON.get().asItem());
					tabData.accept(BeyondtheendModBlocks.BEYOND_WILLOW_LOG.get().asItem());
					tabData.accept(BeyondtheendModBlocks.BEYOND_WILLOW_WOOD.get().asItem());
					tabData.accept(BeyondtheendModBlocks.BEYOND_WILLOW_PLANKS.get().asItem());
					tabData.accept(BeyondtheendModBlocks.BEYOND_WILLOW_STAIRS.get().asItem());
					tabData.accept(BeyondtheendModBlocks.BEYOND_WILLOW_SLAB.get().asItem());
					tabData.accept(BeyondtheendModBlocks.BEYOND_WILLOW_LEAVES.get().asItem());
					tabData.accept(BeyondtheendModBlocks.BEYOND_WILLOW_FENCE.get().asItem());
					tabData.accept(BeyondtheendModBlocks.BEYOND_WILLOW_FENCE_GATE.get().asItem());
					tabData.accept(BeyondtheendModBlocks.BEYOND_WILLOW_PRESSURE_PLATE.get().asItem());
					tabData.accept(BeyondtheendModBlocks.BEYOND_WILLOW_BUTTON.get().asItem());
					tabData.accept(BeyondtheendModBlocks.ENDERITE_ORE.get().asItem());
					tabData.accept(BeyondtheendModItems.ENDERITE.get());
					tabData.accept(BeyondtheendModBlocks.ENDERITE_BLOCK.get().asItem());
				})

		);
	}
}
