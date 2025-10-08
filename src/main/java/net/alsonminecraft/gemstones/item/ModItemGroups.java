package net.alsonminecraft.gemstones.item;

import net.alsonminecraft.gemstones.Gemstones;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registry;

public class ModItemGroups {
	public static final ItemGroup GEMSTONES_ITEMS = Registry.registry

	public static void registerItemGroups() {
		Gemstones.LOGGER.info("Registering Item Groups for " + Gemstones.MOD_ID);
	}
}
