package cn.sweetberry.mcmod.cooler_popsicle

import net.neoforged.neoforge.common.ModConfigSpec

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Neo's config APIs
object Config {
    private val BUILDER = ModConfigSpec.Builder()

    val IS_ENABLED: ModConfigSpec.BooleanValue = BUILDER
        .comment("Whether the mod is enabled")
        .define("isEnabled", true)

    val COOLING_TIME: ModConfigSpec.IntValue = BUILDER
        .comment("The time it takes for the cooling effect to wear off, in ticks")
        .defineInRange("coolingTime", 6000, 0, Int.MAX_VALUE)

    val SPEC: ModConfigSpec = BUILDER.build()
}
