package top.tudeer.gemstones.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import top.tudeer.gemstones.Gemstones;
import top.tudeer.gemstones.food.ModFoods;
import top.tudeer.gemstones.item.custom.ChiselItem;

import java.util.function.Consumer;
import java.util.function.Function;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", Item::new);
    public static final Item SAPPHIRE = registerItem("sapphire", Item::new);
    public static final Item AMBER = registerItem("amber", Item::new);
    public static final Item ROUGH_RUBY = registerItem("rough_ruby", Item::new);
    public static final Item CHISEL = registerItem("chisel", (properties) -> new ChiselItem(properties.durability(32)));
    public static final Item ORANGE = registerItem("orange", (properties) -> new Item(properties.food(ModFoods.ORANGE, ModFoods.ORANGE_CONSUMABLE)) {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.gemstones.orange"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });
    public static final Item CRUDE_OIL = registerItem("crude_oil", (properties) -> new Item(properties.stacksTo(1)));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Gemstones.MOD_ID, name), function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Gemstones.MOD_ID, name)))));
    }

    public static void registerModItems() {
        Gemstones.LOGGER.info("Registering Mod Items For " + Gemstones.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register((output) -> output.accept(RUBY));
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register((output) -> output.accept(SAPPHIRE));
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register((output) -> output.accept(AMBER));
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register((output) -> output.accept(ROUGH_RUBY));
    }
}