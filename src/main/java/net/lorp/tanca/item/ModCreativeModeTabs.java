package net.lorp.tanca.item;

import net.lorp.tanca.ToughAsNailsCreateAddon;
import net.lorp.tanca.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ToughAsNailsCreateAddon.MOD_ID);

    public static final Supplier<CreativeModeTab> TANCA_TAB = CREATIVE_MODE_TAB.register("tanca_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LOGO.get()))
                    .title(Component.translatable("creativetab.tanca.tanca_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.PURIFIED_WATER_BUCKET);
                        output.accept(ModItems.APPLE_JUICE_BUCKET);
                        output.accept(ModItems.CACTUS_JUICE_BUCKET);
                        output.accept(ModItems.CHORUS_FRUIT_JUICE_BUCKET);
                        output.accept(ModItems.DIRTY_WATER_BUCKET);
                        output.accept(ModItems.MELON_JUICE_BUCKET);
                        output.accept(ModItems.PUMPKIN_JUICE_BUCKET);
                        output.accept(ModItems.GLOWBERRY_JUICE_BUCKET);
                        output.accept(ModItems.SWEETBERRY_JUICE_BUCKET);
                        output.accept(ModItems.LOGO );

                    }).build());

    public static  void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
