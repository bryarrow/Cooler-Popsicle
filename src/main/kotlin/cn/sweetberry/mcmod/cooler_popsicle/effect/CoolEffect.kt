package cn.sweetberry.mcmod.cooler_popsicle.effect

import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.effect.MobEffect
import net.minecraft.world.effect.MobEffectCategory
import net.minecraft.world.entity.LivingEntity
import net.minecraft.world.entity.player.Player
import java.awt.Color
import kotlin.jvm.optionals.getOrNull

class CoolEffect : MobEffect(
    MobEffectCategory.BENEFICIAL,
    Color.BLUE.rgb
){
    override fun applyEffectTick(livingEntity: LivingEntity?, amplifier: Int): Boolean {
        val player = livingEntity as? Player ?: return false
        val effect = BuiltInRegistries.MOB_EFFECT.getHolder(
            ResourceLocation.fromNamespaceAndPath("eclipticseasons", "heat_stroke")
        ).getOrNull() ?: return false
        player.removeEffect(effect)
        return true
    }

    override fun shouldApplyEffectTickThisTick(duration: Int, amplifier: Int): Boolean {
        return true
    }
}