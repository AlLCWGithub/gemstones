package top.tudeer.gemstones.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import top.tudeer.gemstones.blocks.ModBlocks;
import top.tudeer.gemstones.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                List<ItemLike> GEMSTONE_SMELTABLES = List.of(ModItems.ROUGH_RUBY, ModBlocks.RUBY_ORE);
                oreSmelting(GEMSTONE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.RUBY, 0.25f, 200, "ruby");
                oreBlasting(GEMSTONE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.RUBY, 0.25f, 100, "ruby");
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RUBY, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_BLOCK);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAPPHIRE_BLOCK).pattern("RRR").pattern("RRR").pattern("RRR").define('R', ModItems.SAPPHIRE).unlockedBy(getHasName(ModItems.SAPPHIRE), has(ModItems.SAPPHIRE)).group("gemstones").save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMBER_BLOCK).pattern("AA").pattern("AA").define('A', ModItems.AMBER).unlockedBy(getHasName(ModItems.AMBER), has(ModItems.AMBER)).group("gemstones").save(output);
                shapeless(RecipeCategory.BUILDING_BLOCKS, ModItems.SAPPHIRE, 9).requires(ModBlocks.SAPPHIRE_BLOCK).unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK), has(ModBlocks.SAPPHIRE_BLOCK)).save(output);
                shapeless(RecipeCategory.BUILDING_BLOCKS, ModItems.AMBER, 4).requires(ModBlocks.AMBER_BLOCK).unlockedBy(getHasName(ModBlocks.AMBER_BLOCK), has(ModBlocks.AMBER_BLOCK)).save(output);
                shapeless(RecipeCategory.MISC, Blocks.TNT).requires(ModItems.RUBY).requires(ModItems.SAPPHIRE).requires(ModItems.AMBER).unlockedBy(getHasName(Blocks.TNT), has(Blocks.TNT)).save(output);
                shaped(RecipeCategory.MISC, ModBlocks.MAGIC_BLOCK).pattern("RRR").pattern("SSS").pattern("AAA").define('R', ModBlocks.RUBY_BLOCK).define('S', ModBlocks.SAPPHIRE_BLOCK).define('A', ModBlocks.AMBER_BLOCK).unlockedBy(getHasName(ModBlocks.RUBY_BLOCK), has(ModBlocks.RUBY_BLOCK)).group("gemstones").save(output);
                shaped(RecipeCategory.MISC, ModBlocks.MAGNET_BLOCK).pattern("I I").pattern("IRI").pattern("IBI").define('I', Items.IRON_INGOT).define('R', Blocks.REDSTONE_BLOCK).define('B', Blocks.IRON_BLOCK).unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT)).group("gemstones").save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "Gemstone Recipes";
    }
}