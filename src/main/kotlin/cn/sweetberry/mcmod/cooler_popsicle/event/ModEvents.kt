package cn.sweetberry.mcmod.cooler_popsicle.event

import cn.sweetberry.mcmod.cooler_popsicle.Config
import net.neoforged.neoforge.event.entity.living.MobEffectEvent.Applicable.Result
import cn.sweetberry.mcmod.cooler_popsicle.registry.ModEffects
import cn.sweetberry.mcmod.cooler_popsicle.registry.ModEffects.COOL_EFFECT
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.entity.player.Player
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent
import net.neoforged.neoforge.event.entity.living.MobEffectEvent
import kotlin.jvm.optionals.getOrNull

object ModEvents {

    @SubscribeEvent
    fun onItemUseFinish(event: LivingEntityUseItemEvent.Finish) {
        if (!Config.IS_ENABLED.get()) return
        val player = event.entity as? Player ?: return
        if (player.level().isClientSide) return

        if (event.item.item.toString() != "farmersdelight:melon_popsicle") return

        player.addEffect(
            MobEffectInstance(
                ModEffects.COOL_EFFECT,
                Config.COOLING_TIME.get(),
                0
            )
        )
    }

    @SubscribeEvent
    fun onApplyEffect(event: MobEffectEvent.Applicable){
        if (!Config.IS_ENABLED.get()) return
        val player = event.entity as? Player ?: return
        if (player.level().isClientSide) return

        val heatStrokeEffectHolder = BuiltInRegistries.MOB_EFFECT.getHolder(
            ResourceLocation.fromNamespaceAndPath("eclipticseasons", "heat_stroke")
        ).getOrNull() ?: return
        if (event.effectInstance?.effect != heatStrokeEffectHolder) return

        if (player.hasEffect(COOL_EFFECT)) event.result = Result.DO_NOT_APPLY
    }
}
