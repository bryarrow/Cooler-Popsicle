package cn.sweetberry.mcmod.cooler_popsicle.registry

import cn.sweetberry.mcmod.cooler_popsicle.CoolerPopsicle
import cn.sweetberry.mcmod.cooler_popsicle.effect.CoolEffect
import net.minecraft.core.registries.Registries
import net.minecraft.world.effect.MobEffect
import net.neoforged.neoforge.registries.DeferredHolder
import net.neoforged.neoforge.registries.DeferredRegister

object ModEffects {
    val REGISTRY: DeferredRegister<MobEffect> = DeferredRegister.create(
        Registries.MOB_EFFECT,
        CoolerPopsicle.MOD_ID
    )

    val COOL_EFFECT: DeferredHolder<MobEffect, CoolEffect> = REGISTRY.register("cool_effect", ::CoolEffect)
}
