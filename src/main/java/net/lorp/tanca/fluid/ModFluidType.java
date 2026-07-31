package net.lorp.tanca.fluid;

import net.lorp.tanca.ToughAsNailsCreateAddon;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModFluidType {
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, ToughAsNailsCreateAddon.MOD_ID);

    public static final DeferredHolder<FluidType, FluidType> PURIFIED_WATER = FLUID_TYPES.register("purified_water",
            () -> new FluidType(FluidType.Properties.create()
                    .density(1)
                    .canSwim(true)
                    .canDrown(true)
                    .canPushEntity(true)
                    .canHydrate(true)
                    .supportsBoating(true)
            ));

    public static final DeferredHolder<FluidType, FluidType> APPLE_JUICE = FLUID_TYPES.register("apple_juice",
            () -> new FluidType(FluidType.Properties.create()
                    .density(1)
                    .canSwim(true)
                    .canDrown(true)
                    .canPushEntity(true)
                    .canHydrate(false)
                    .supportsBoating(true)
            ));

    public static final DeferredHolder<FluidType, FluidType> CACTUS_JUICE = FLUID_TYPES.register("cactus_juice",
            () -> new FluidType(FluidType.Properties.create()
                    .density(1)
                    .canSwim(true)
                    .canDrown(true)
                    .canPushEntity(true)
                    .canHydrate(false)
                    .supportsBoating(true)
            ));

    public static final DeferredHolder<FluidType, FluidType> CHORUS_FRUIT_JUICE = FLUID_TYPES.register("chorus_fruit_juice",
            () -> new FluidType(FluidType.Properties.create()
                    .density(1)
                    .canSwim(true)
                    .canDrown(true)
                    .canPushEntity(true)
                    .canHydrate(false)
                    .supportsBoating(true)
            ));

    public static final DeferredHolder<FluidType, FluidType> DIRTY_WATER = FLUID_TYPES.register("dirty_water",
            () -> new FluidType(FluidType.Properties.create()
                    .density(1)
                    .canSwim(true)
                    .canDrown(true)
                    .canPushEntity(true)
                    .canHydrate(false)
                    .supportsBoating(true)
            ));

    public static final DeferredHolder<FluidType, FluidType> MELON_JUICE = FLUID_TYPES.register("melon_juice",
            () -> new FluidType(FluidType.Properties.create()
                    .density(1)
                    .canSwim(true)
                    .canDrown(true)
                    .canPushEntity(true)
                    .canHydrate(false)
                    .supportsBoating(true)
            ));

    public static final DeferredHolder<FluidType, FluidType> PUMPKIN_JUICE = FLUID_TYPES.register("pumpkin_juice",
            () -> new FluidType(FluidType.Properties.create()
                    .density(1)
                    .canSwim(true)
                    .canDrown(true)
                    .canPushEntity(true)
                    .canHydrate(false)
                    .supportsBoating(true)
            ));

    public static final DeferredHolder<FluidType, FluidType> GLOW_BERRY_JUICE = FLUID_TYPES.register("glow_berry_juice",
            () -> new FluidType(FluidType.Properties.create()
                    .density(1)
                    .canSwim(true)
                    .canDrown(true)
                    .canPushEntity(true)
                    .canHydrate(false)
                    .supportsBoating(true)
            ));

    public static final DeferredHolder<FluidType, FluidType> SWEET_BERRY_JUICE = FLUID_TYPES.register("sweet_berry_juice",
            () -> new FluidType(FluidType.Properties.create()
                    .density(1)
                    .canSwim(true)
                    .canDrown(true)
                    .canPushEntity(true)
                    .canHydrate(false)
                    .supportsBoating(true)
            ));

    public static final DeferredHolder<FluidType, FluidType> ICE_TEA = FLUID_TYPES.register("ice_tea",
            () -> new FluidType(FluidType.Properties.create()
                    .density(1)
                    .canSwim(true)
                    .canDrown(true)
                    .canPushEntity(true)
                    .canHydrate(false)
                    .supportsBoating(true)
            ));

    public static final DeferredHolder<FluidType, FluidType> HOT_CHOCOLATE = FLUID_TYPES.register("hot_chocolate",
            () -> new FluidType(FluidType.Properties.create()
                    .density(1)
                    .canSwim(true)
                    .canDrown(true)
                    .canPushEntity(true)
                    .canHydrate(false)
                    .supportsBoating(true)
            ));

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}