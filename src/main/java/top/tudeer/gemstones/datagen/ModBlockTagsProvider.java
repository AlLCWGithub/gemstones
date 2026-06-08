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
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.RUBY_BLOCK);
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.SAPPHIRE_BLOCK);
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.AMBER_BLOCK);
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.RUBY_ORE);
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.MAGIC_BLOCK);
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.MAGNET_BLOCK);
        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.RUBY_BLOCK);
        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.SAPPHIRE_BLOCK);
        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.AMBER_BLOCK);
        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.RUBY_ORE);
        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL).add(ModBlocks.MAGNET_BLOCK);
    }
}