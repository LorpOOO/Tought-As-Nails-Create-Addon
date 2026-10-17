package net.lorp.tanca;

import net.lorp.tanca.block.ModBlocks;
import net.lorp.tanca.fluid.ModFluid;
import net.lorp.tanca.fluid.ModFluidType;
import net.lorp.tanca.item.ModCreativeModeTabs;
import net.lorp.tanca.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(ToughAsNailsCreateAddon.MOD_ID)
public class ToughAsNailsCreateAddon {
    public static final String MOD_ID = "tanca";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ToughAsNailsCreateAddon(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModFluidType.register(modEventBus);
        ModFluid.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
    }
}
