package top.tudeer.gemstones.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import top.tudeer.gemstones.Gemstones;
import top.tudeer.gemstones.blocks.ModBlocks;
import top.tudeer.gemstones.item.ModItems;

public class ModCreativeModeTab {
    public static final CreativeModeTab GEMSTONES_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(Gemstones.MOD_ID, "gemstone_items"), FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY)).title(Component.translatable("creativemodetab.gemstones.gemstone_items")).displayItems((parameters, output) -> {
        output.accept(ModItems.RUBY);
        output.accept(ModItems.SAPPHIRE);
        output.accept(ModItems.AMBER);
        output.accept(ModItems.ROUGH_RUBY);
        output.accept(ModItems.CHISEL);
        output.accept(ModItems.ORANGE);
        output.accept(ModItems.CRUDE_OIL);
    }).build());

    public static final CreativeModeTab GEMSTONE_BLOCKS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(Gemstones.MOD_ID, "gemstone_block_items"), FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.RUBY_BLOCK)).title(Component.translatable("creativemodetab.gemstones.gemstone_block_items")).displayItems((parameters, output) -> {
        output.accept(ModBlocks.RUBY_BLOCK);
        output.accept(ModBlocks.SAPPHIRE_BLOCK);
        output.accept(ModBlocks.AMBER_BLOCK);
        output.accept(ModBlocks.RUBY_ORE);
        output.accept(ModBlocks.MAGIC_BLOCK);
        output.accept(ModBlocks.MAGNET_BLOCK);
        output.accept(ModBlocks.RUBY_STAIRS);
        output.accept(ModBlocks.RUBY_SLAB);
        output.accept(ModBlocks.SAPPHIRE_STAIRS);
        output.accept(ModBlocks.SAPPHIRE_SLAB);
        output.accept(ModBlocks.AMBER_STAIRS);
        output.accept(ModBlocks.AMBER_SLAB);
        output.accept(ModBlocks.RUBY_BUTTON);
        output.accept(ModBlocks.RUBY_PRESSURE_PLATE);
        output.accept(ModBlocks.SAPPHIRE_BUTTON);
        output.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE);
        output.accept(ModBlocks.AMBER_BUTTON);
        output.accept(ModBlocks.AMBER_PRESSURE_PLATE);
        output.accept(ModBlocks.RUBY_FENCE);
        output.accept(ModBlocks.RUBY_FENCE_GATE);
        output.accept(ModBlocks.RUBY_WALL);
        output.accept(ModBlocks.SAPPHIRE_FENCE);
        output.accept(ModBlocks.SAPPHIRE_FENCE_GATE);
        output.accept(ModBlocks.SAPPHIRE_WALL);
        output.accept(ModBlocks.AMBER_FENCE);
        output.accept(ModBlocks.AMBER_FENCE_GATE);
        output.accept(ModBlocks.AMBER_WALL);
    }).build());

    public static void registerModCreativeModeTabs() {
        Gemstones.LOGGER.info("Registering Creative Mode Tabs For " + Gemstones.MOD_ID);
    }
}