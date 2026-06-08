package top.tudeer.gemstones.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

import java.util.List;

public class ModFoods {
    public static final FoodProperties ORANGE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f).build();
    public static final Consumable ORANGE_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1.6f).onConsume(new ApplyStatusEffectsConsumeEffect(List.of(new MobEffectInstance(MobEffects.ABSORPTION, 600, 9), new MobEffectInstance(MobEffects.REGENERATION, 200, 4)))).build();
}