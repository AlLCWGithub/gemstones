package net.alsonminecraft.gemstones.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.alsonminecraft.gemstones.Gemstones;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

	public static final Block RUBY_BLOCK = registerBlock("ruby_block", new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Gemstones.MOD_ID, "ruby_block"))).strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
	public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block", new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Gemstones.MOD_ID, "sapphire_block"))).strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, Identifier.of(Gemstones.MOD_ID, name), block);
	}

	private static void registerBlockItem(String name, Block block) {
		Registry.register(Registries.ITEM, Identifier.of(Gemstones.MOD_ID, name), new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Gemstones.MOD_ID, name)))));
	}

	public static void registerModBlocks() {
		Gemstones.LOGGER.info("Registering Mod Blocks for " + Gemstones.MOD_ID);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			entries.add(ModBlocks.RUBY_BLOCK);
			entries.add(ModBlocks.SAPPHIRE_BLOCK);
		});
	}
}
