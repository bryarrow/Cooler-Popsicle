package cn.sweetberry.mcmod.cooler_popsicle

import cn.sweetberry.mcmod.cooler_popsicle.event.ModEvents
import cn.sweetberry.mcmod.cooler_popsicle.registry.ModEffects
import com.mojang.logging.LogUtils
import net.neoforged.bus.api.IEventBus
import net.neoforged.fml.ModContainer
import net.neoforged.fml.common.Mod
import net.neoforged.fml.config.ModConfig
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent
import net.neoforged.neoforge.common.NeoForge
import org.slf4j.Logger

@Mod(CoolerPopsicle.MOD_ID)
class CoolerPopsicle(modEventBus: IEventBus, modContainer: ModContainer) {
    companion object {
        const val MOD_ID = "cooler_popsicle"
        val LOGGER: Logger = LogUtils.getLogger()
    }

    init {
        modEventBus.addListener { event: FMLCommonSetupEvent -> this.commonSetup(event) }

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC)

        ModEffects.REGISTRY.register(modEventBus)

        NeoForge.EVENT_BUS.register(ModEvents)
    }

    private fun commonSetup(event: FMLCommonSetupEvent?) {
        LOGGER.info("Cooler Popsicle is setting up!")
    }
}
