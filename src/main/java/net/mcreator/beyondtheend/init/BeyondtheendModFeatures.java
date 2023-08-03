
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.beyondtheend.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.beyondtheend.world.features.ores.EnderiteOreFeature;
import net.mcreator.beyondtheend.BeyondtheendMod;

@Mod.EventBusSubscriber
public class BeyondtheendModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, BeyondtheendMod.MODID);
	public static final RegistryObject<Feature<?>> ENDERITE_ORE = REGISTRY.register("enderite_ore", EnderiteOreFeature::new);
}
