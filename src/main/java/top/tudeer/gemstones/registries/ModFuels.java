package top.tudeer.gemstones.registries;

import net.fabricmc.fabric.api.registry.FuelValueEvents;
import top.tudeer.gemstones.Gemstones;
import top.tudeer.gemstones.item.ModItems;

public class ModFuels {
    public static void registerFuels() {
        Gemstones.LOGGER.info("Registering Fuels For " + Gemstones.MOD_ID);

        FuelValueEvents.BUILD.register((builder, context) -> {
            builder.add(ModItems.CRUDE_OIL, 8000);
        });
    }
}