package top.tudeer.gemstones.blocks;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import top.tudeer.gemstones.Gemstones;
import top.tudeer.gemstones.blocks.custom.MagicBlock;
import top.tudeer.gemstones.blocks.custom.MagnetBlock;

import java.util.function.Function;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block", (properties) -> new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block", (properties) -> new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block AMBER_BLOCK = registerBlock("amber_block", (properties) -> new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block RUBY_ORE = registerBlock("ruby_ore", (properties) -> new DropExperienceBlock(UniformInt.of(2, 5), properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block MAGIC_BLOCK = registerBlock("magic_block", (properties) -> new MagicBlock(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block MAGNET_BLOCK = registerBlock("magnet_block", (properties) -> new MagnetBlock(properties.strength(4f, 1200f).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Gemstones.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Gemstones.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Gemstones.MOD_ID, name), new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Gemstones.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        Gemstones.LOGGER.info("Registering Mod Blocks For " + Gemstones.MOD_ID);
    }
}
