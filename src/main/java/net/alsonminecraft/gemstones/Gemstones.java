package net.alsonminecraft.gemstones;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.alsonminecraft.gemstones.item.ModItems;
import net.alsonminecraft.gemstones.block.ModBlocks;
import net.alsonminecraft.gemstones.item.ModItemGroups;

public class Gemstones implements ModInitializer {
	public static final String MOD_ID = "gemstones";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerModItemGroups();
	}
}
