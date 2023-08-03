
package net.mcreator.beyondtheend.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TabIconItem extends Item {
	public TabIconItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
