package net.lorp.tanca;

import net.lorp.tanca.block.ModBlocks;
import net.lorp.tanca.fluid.ModFluid;
import net.lorp.tanca.fluid.ModFluidType;
import net.lorp.tanca.item.ModCreativeModeTabs;
import net.lorp.tanca.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(ToughAsNailsCreateAddon.MOD_ID)
public class ToughAsNailsCreateAddon {
    public static final String MOD_ID = "tanca";
    public static final Logger LOGGER = LogUtils.getLogger();
    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public ToughAsNailsCreateAddon(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        //Registers the mod's custom items and blocks
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModFluidType.register(modEventBus);
        ModFluid.register(modEventBus);
        //Records the fluids and fluid types of the mo

        //Registers the custom creative tabs
        ModCreativeModeTabs.register(modEventBus);

        // Register the item to a creative tab

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}