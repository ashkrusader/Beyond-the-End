
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beyondtheend.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BeyondtheendModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(BeyondtheendModBlocks.SPORESTEM_FENCE_GATE.get().asItem());
			tabData.accept(BeyondtheendModBlocks.SPORESTEM_PRESSURE_PLATE.get().asItem());
			tabData.accept(BeyondtheendModBlocks.BEYOND_WILLOW_FENCE_GATE.get().asItem());
			tabData.accept(BeyondtheendModBlocks.BEYOND_WILLOW_PRESSURE_PLATE.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(BeyondtheendModBlocks.SPORESTEM_LEAVES.get().asItem());
			tabData.accept(BeyondtheendModBlocks.SPORESTEM_FENCE.get().asItem());
			tabData.accept(BeyondtheendModBlocks.BEYOND_WILLOW_LEAVES.get().asItem());
			tabData.accept(BeyondtheendModBlocks.BEYOND_WILLOW_FENCE.get().asItem());
		}
	}
}
