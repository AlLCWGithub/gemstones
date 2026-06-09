package top.tudeer.gemstones.blocks;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import top.tudeer.gemstones.Gemstones;
import top.tudeer.gemstones.blocks.custom.MagicBlock;
import top.tudeer.gemstones.blocks.custom.MagnetBlock;

import java.awt.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block", (properties) -> new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block", (properties) -> new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block AMBER_BLOCK = registerBlock("amber_block", (properties) -> new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block RUBY_ORE = registerBlock("ruby_ore", (properties) -> new DropExperienceBlock(UniformInt.of(2, 5), properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block MAGIC_BLOCK = registerBlock("magic_block", (properties) -> new MagicBlock(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)), Component.translatable("tooltip.gemstones.magic_block"));
    public static final Block MAGNET_BLOCK = registerBlock("magnet_block", (properties) -> new MagnetBlock(properties.strength(4f, 1200f).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final Block RUBY_STAIRS = registerBlock("ruby_stairs", (properties) -> new StairBlock(ModBlocks.RUBY_BLOCK.defaultBlockState(), properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block RUBY_SLAB = registerBlock("ruby_slab", (properties) -> new SlabBlock(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block SAPPHIRE_STAIRS = registerBlock("sapphire_stairs", (properties) -> new StairBlock(ModBlocks.SAPPHIRE_BLOCK.defaultBlockState(), properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block SAPPHIRE_SLAB = registerBlock("sapphire_slab", (properties) -> new SlabBlock(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block AMBER_STAIRS = registerBlock("amber_stairs", (properties) -> new StairBlock(ModBlocks.AMBER_BLOCK.defaultBlockState(), properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block AMBER_SLAB = registerBlock("amber_slab", (properties) -> new SlabBlock(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block RUBY_BUTTON = registerBlock("ruby_button", (properties) -> new ButtonBlock(BlockSetType.IRON, 20, properties.strength(4f).noCollision()));
    public static final Block RUBY_PRESSURE_PLATE = registerBlock("ruby_pressure_plate", (properties) -> new PressurePlateBlock(BlockSetType.IRON, properties.mapColor(MapColor.COLOR_RED).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(4f).noCollision().pushReaction(PushReaction.DESTROY)));
    public static final Block SAPPHIRE_BUTTON = registerBlock("sapphire_button", (properties) -> new ButtonBlock(BlockSetType.IRON, 20, properties.strength(4f).noCollision()));
    public static final Block SAPPHIRE_PRESSURE_PLATE = registerBlock("sapphire_pressure_plate", (properties) -> new PressurePlateBlock(BlockSetType.IRON, properties.mapColor(MapColor.COLOR_BLUE).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(4f).noCollision().pushReaction(PushReaction.DESTROY)));
    public static final Block AMBER_BUTTON = registerBlock("amber_button", (properties) -> new ButtonBlock(BlockSetType.IRON, 20, properties.strength(4f).noCollision()));
    public static final Block AMBER_PRESSURE_PLATE = registerBlock("amber_pressure_plate", (properties) -> new PressurePlateBlock(BlockSetType.IRON, properties.mapColor(MapColor.COLOR_YELLOW).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(4f).noCollision().pushReaction(PushReaction.DESTROY)));
    public static final Block RUBY_FENCE = registerBlock("ruby_fence", (properties) -> new FenceBlock(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block RUBY_FENCE_GATE = registerBlock("ruby_fence_gate", (properties) -> new FenceGateBlock(WoodType.ACACIA, properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block RUBY_WALL = registerBlock("ruby_wall", (properties) -> new WallBlock(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block SAPPHIRE_FENCE = registerBlock("sapphire_fence", (properties) -> new FenceBlock(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block SAPPHIRE_FENCE_GATE = registerBlock("sapphire_fence_gate", (properties) -> new FenceGateBlock(WoodType.ACACIA, properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block SAPPHIRE_WALL = registerBlock("sapphire_wall", (properties) -> new WallBlock(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block AMBER_FENCE = registerBlock("amber_fence", (properties) -> new FenceBlock(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block AMBER_FENCE_GATE = registerBlock("amber_fence_gate", (properties) -> new FenceGateBlock(WoodType.ACACIA, properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block AMBER_WALL = registerBlock("amber_wall", (properties) -> new WallBlock(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Gemstones.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Gemstones.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Gemstones.MOD_ID, name), new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Gemstones.MOD_ID, name)))));
    }

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, Component... tooltips) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Gemstones.MOD_ID, name))));
        registerBlockItem(name, toRegister, tooltips);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Gemstones.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block, Component... toolTips) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Gemstones.MOD_ID, name), new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Gemstones.MOD_ID, name)))) {
            @Override
            public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
                for(Component component : toolTips) {
                    builder.accept(component);
                }
                super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
            }
        });
    }


    public static void registerModBlocks() {
        Gemstones.LOGGER.info("Registering Mod Blocks For " + Gemstones.MOD_ID);
    }
}
