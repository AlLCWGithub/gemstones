package top.tudeer.gemstones;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.tudeer.gemstones.blocks.ModBlocks;
import top.tudeer.gemstones.creativemodetab.ModCreativeModeTab;
import top.tudeer.gemstones.item.ModItems;
import top.tudeer.gemstones.registries.ModFuels;


public class Gemstones implements ModInitializer {
	public static final String MOD_ID = "gemstones";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTab.registerModCreativeModeTabs();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModFuels.registerFuels();
	}
}