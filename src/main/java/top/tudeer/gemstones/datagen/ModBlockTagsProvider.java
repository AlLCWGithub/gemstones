package top.tudeer.gemstones.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import top.tudeer.gemstones.blocks.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.AMBER_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.MAGIC_BLOCK)
                .add(ModBlocks.MAGNET_BLOCK)
                .add(ModBlocks.RUBY_STAIRS)
                .add(ModBlocks.RUBY_SLAB)
                .add(ModBlocks.SAPPHIRE_STAIRS)
                .add(ModBlocks.SAPPHIRE_SLAB)
                .add(ModBlocks.AMBER_STAIRS)
                .add(ModBlocks.AMBER_SLAB);

        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.AMBER_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.MAGIC_BLOCK)
                .add(ModBlocks.RUBY_STAIRS)
                .add(ModBlocks.RUBY_SLAB)
                .add(ModBlocks.SAPPHIRE_STAIRS)
                .add(ModBlocks.SAPPHIRE_SLAB)
                .add(ModBlocks.AMBER_STAIRS)
                .add(ModBlocks.AMBER_SLAB);

        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.MAGNET_BLOCK);

        valueLookupBuilder(BlockTags.STAIRS)
                .add(ModBlocks.RUBY_STAIRS)
                .add(ModBlocks.SAPPHIRE_STAIRS)
                .add(ModBlocks.AMBER_STAIRS);

        valueLookupBuilder(BlockTags.SLABS)
                .add(ModBlocks.RUBY_SLAB)
                .add(ModBlocks.SAPPHIRE_SLAB)
                .add(ModBlocks.AMBER_SLAB);

        valueLookupBuilder(BlockTags.BUTTONS)
                .add(ModBlocks.RUBY_BUTTON)
                .add(ModBlocks.SAPPHIRE_BUTTON)
                .add(ModBlocks.AMBER_BUTTON);

        valueLookupBuilder(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.RUBY_PRESSURE_PLATE)
                .add(ModBlocks.SAPPHIRE_PRESSURE_PLATE)
                .add(ModBlocks.AMBER_PRESSURE_PLATE);
    }
}