package net.alsonminecraft.gemstones.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.alsonminecraft.gemstones.Gemstones;
import net.alsonminecraft.gemstones.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
	public static final ItemGroup GEMSTONES_ITEMS = Registry.register(Registries.ITEM_GROUP, Identifier.of(Gemstones.MOD_ID, "gemstones_items"), FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RUBY)).displayName(Text.translatable("itemgroup.gemstones.gemstones_items")).entries((displayContext, entries) -> {
		entries.add(ModItems.RUBY);
		entries.add(ModItems.SAPPHIRE);
		entries.add(ModItems.FURIGEM);
	}).build());

	public static final ItemGroup GEMSTONES_BLOCKS = Registry.register(Registries.ITEM_GROUP, Identifier.of(Gemstones.MOD_ID, "gemstones_blocks"), FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RUBY)).displayName(Text.translatable("itemgroup.gemstones.gemstones_blocks")).entries((displayContext, entries) -> {
		entries.add(ModBlocks.RUBY_BLOCK);
		entries.add(ModBlocks.SAPPHIRE_BLOCK);
	}).build());

	public static void registerItemGroups() {
		Gemstones.LOGGER.info("Registering Item Groups for " + Gemstones.MOD_ID);
	}
}
