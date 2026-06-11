package top.tudeer.gemstones.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import top.tudeer.gemstones.blocks.ModBlocks;
import top.tudeer.gemstones.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        dropSelf(ModBlocks.RUBY_BLOCK);
        dropSelf(ModBlocks.SAPPHIRE_BLOCK);
        dropSelf(ModBlocks.AMBER_BLOCK);
        dropSelf(ModBlocks.MAGIC_BLOCK);
        dropSelf(ModBlocks.MAGNET_BLOCK);
        dropSelf(ModBlocks.RUBY_STAIRS);
        add(ModBlocks.RUBY_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.SAPPHIRE_STAIRS);
        add(ModBlocks.SAPPHIRE_SLAB, this::createSlabItemTable);
        dropSelf(ModBlocks.AMBER_STAIRS);
        add(ModBlocks.AMBER_SLAB, this::createSlabItemTable);
        add(ModBlocks.RUBY_ORE, createMultipleOreDrops(ModBlocks.RUBY_ORE, ModItems.ROUGH_RUBY, 1, 2));
        dropSelf(ModBlocks.RUBY_BUTTON);
        dropSelf(ModBlocks.RUBY_PRESSURE_PLATE);
        dropSelf(ModBlocks.SAPPHIRE_BUTTON);
        dropSelf(ModBlocks.SAPPHIRE_PRESSURE_PLATE);
        dropSelf(ModBlocks.AMBER_BUTTON);
        dropSelf(ModBlocks.AMBER_PRESSURE_PLATE);
        dropSelf(ModBlocks.RUBY_FENCE);
        dropSelf(ModBlocks.RUBY_FENCE_GATE);
        dropSelf(ModBlocks.RUBY_WALL);
        dropSelf(ModBlocks.SAPPHIRE_FENCE);
        dropSelf(ModBlocks.SAPPHIRE_FENCE_GATE);
        dropSelf(ModBlocks.SAPPHIRE_WALL);
        dropSelf(ModBlocks.AMBER_FENCE);
        dropSelf(ModBlocks.AMBER_FENCE_GATE);
        dropSelf(ModBlocks.AMBER_WALL);
        add(ModBlocks.RUBY_DOOR, this::createDoorTable);
        dropSelf(ModBlocks.RUBY_TRAPDOOR);
        add(ModBlocks.SAPPHIRE_DOOR, this::createDoorTable);
        dropSelf(ModBlocks.SAPPHIRE_TRAPDOOR);
        add(ModBlocks.AMBER_DOOR, this::createDoorTable);
        dropSelf(ModBlocks.AMBER_TRAPDOOR);
    }

    public LootTable.Builder createMultipleOreDrops(final Block block, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(block, (LootPoolEntryContainer.Builder<?>)this.applyExplosionDecay(block, LootItem.lootTableItem(item).apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops))).apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))));
    }
}