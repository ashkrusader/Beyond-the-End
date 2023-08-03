
package net.mcreator.beyondtheend.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;

import net.mcreator.beyondtheend.init.BeyondtheendModItems;

public abstract class EnderiteArmorItem extends ArmorItem {
	public EnderiteArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 75;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{10, 30, 25, 10}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 45;
			}

			@Override
			public SoundEvent getEquipSound() {
				return SoundEvents.EMPTY;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BeyondtheendModItems.ENDERITE.get()));
			}

			@Override
			public String getName() {
				return "enderite_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, type, properties);
	}

	public static class Helmet extends EnderiteArmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "beyondtheend:textures/models/armor/enderite_layer_1.png";
		}
	}

	public static class Chestplate extends EnderiteArmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "beyondtheend:textures/models/armor/enderite_layer_1.png";
		}
	}

	public static class Leggings extends EnderiteArmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "beyondtheend:textures/models/armor/enderite_layer_2.png";
		}
	}

	public static class Boots extends EnderiteArmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "beyondtheend:textures/models/armor/enderite_layer_1.png";
		}
	}
}
