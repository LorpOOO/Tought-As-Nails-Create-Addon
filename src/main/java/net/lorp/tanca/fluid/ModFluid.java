package net.lorp.tanca.fluid;

import com.google.common.base.Suppliers;
import net.lorp.tanca.ToughAsNailsCreateAddon;
import net.lorp.tanca.block.ModBlocks;
import net.lorp.tanca.item.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModFluid {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(BuiltInRegistries.FLUID, ToughAsNailsCreateAddon.MOD_ID);

    public static DeferredHolder<Fluid, BaseFlowingFluid> SOURCE_PURIFIED_WATER;
    public static DeferredHolder<Fluid, BaseFlowingFluid> FLOWING_PURIFIED_WATER;

    public static final DeferredHolder<Fluid, BaseFlowingFluid> PURIFIED_WATER_SOURCE = FLUIDS.register("purified_water",
            () -> new BaseFlowingFluid.Source(ModFluid.PURIFIED_WATER_PROPERTIES.get()));
    public static final DeferredHolder<Fluid, BaseFlowingFluid> PURIFIED_WATER_FLOWING = FLUIDS.register("purified_water_flow",
            () -> new BaseFlowingFluid.Flowing(ModFluid.PURIFIED_WATER_PROPERTIES.get()));

    private static final Supplier<BaseFlowingFluid.Properties> PURIFIED_WATER_PROPERTIES = Suppliers.memoize(() ->
            new BaseFlowingFluid.Properties(ModFluidType.PURIFIED_WATER, PURIFIED_WATER_SOURCE, PURIFIED_WATER_FLOWING)
                    .block(ModBlocks.PURIFIED_WATER_BLOCK)
                    .bucket(ModItems.PURIFIED_WATER_BUCKET)
    );

    public static final DeferredHolder<Fluid, BaseFlowingFluid> APPLE_JUICE_SOURCE = FLUIDS.register("apple_juice",
            () -> new BaseFlowingFluid.Source(ModFluid.APPLE_JUICE_PROPERTIES.get()));
    public static final DeferredHolder<Fluid, BaseFlowingFluid> APPLE_JUICE_FLOWING = FLUIDS.register("apple_juice_flow",
            () -> new BaseFlowingFluid.Flowing(ModFluid.APPLE_JUICE_PROPERTIES.get()));

    private static final Supplier<BaseFlowingFluid.Properties> APPLE_JUICE_PROPERTIES = Suppliers.memoize(() ->
            new BaseFlowingFluid.Properties(ModFluidType.APPLE_JUICE, APPLE_JUICE_SOURCE, APPLE_JUICE_FLOWING)
                    .block(ModBlocks.APPLE_JUICE_BLOCK)
                    .bucket(ModItems.APPLE_JUICE_BUCKET)
    );

    public static final DeferredHolder<Fluid, BaseFlowingFluid> CACTUS_JUICE_SOURCE = FLUIDS.register("cactus_juice",
            () -> new BaseFlowingFluid.Source(ModFluid.CACTUS_JUICE_PROPERTIES.get()));
    public static final DeferredHolder<Fluid, BaseFlowingFluid> CACTUS_JUICE_FLOWING = FLUIDS.register("cactus_juice_flow",
            () -> new BaseFlowingFluid.Flowing(ModFluid.CACTUS_JUICE_PROPERTIES.get()));

    private static final Supplier<BaseFlowingFluid.Properties> CACTUS_JUICE_PROPERTIES = Suppliers.memoize(() ->
            new BaseFlowingFluid.Properties(ModFluidType.CACTUS_JUICE, CACTUS_JUICE_SOURCE, CACTUS_JUICE_FLOWING)
                    .block(ModBlocks.CACTUS_JUICE_BLOCK)
                    .bucket(ModItems.CACTUS_JUICE_BUCKET)
    );

    public static final DeferredHolder<Fluid, BaseFlowingFluid> CHORUS_FRUIT_JUICE_SOURCE = FLUIDS.register("chorus_fruit_juice",
            () -> new BaseFlowingFluid.Source(ModFluid.CHORUS_FRUIT_JUICE_PROPERTIES.get()));
    public static final DeferredHolder<Fluid, BaseFlowingFluid> CHORUS_FRUIT_JUICE_FLOWING = FLUIDS.register("chorus_fruit_juice_flow",
            () -> new BaseFlowingFluid.Flowing(ModFluid.CHORUS_FRUIT_JUICE_PROPERTIES.get()));

    private static final Supplier<BaseFlowingFluid.Properties> CHORUS_FRUIT_JUICE_PROPERTIES = Suppliers.memoize(() ->
            new BaseFlowingFluid.Properties(ModFluidType.CHORUS_FRUIT_JUICE, CHORUS_FRUIT_JUICE_SOURCE, CHORUS_FRUIT_JUICE_FLOWING)
                    .block(ModBlocks.CHORUS_FRUIT_JUICE_BLOCK)
                    .bucket(ModItems.CHORUS_FRUIT_JUICE_BUCKET)
    );

    public static final DeferredHolder<Fluid, BaseFlowingFluid> DIRTY_WATER_SOURCE = FLUIDS.register("dirty_water",
            () -> new BaseFlowingFluid.Source(ModFluid.DIRTY_WATER_PROPERTIES.get()));
    public static final DeferredHolder<Fluid, BaseFlowingFluid> DIRTY_WATER_FLOWING = FLUIDS.register("dirty_water_flow",
            () -> new BaseFlowingFluid.Flowing(ModFluid.DIRTY_WATER_PROPERTIES.get()));

    private static final Supplier<BaseFlowingFluid.Properties> DIRTY_WATER_PROPERTIES = Suppliers.memoize(() ->
            new BaseFlowingFluid.Properties(ModFluidType.DIRTY_WATER, DIRTY_WATER_SOURCE, DIRTY_WATER_FLOWING)
                    .block(ModBlocks.DIRTY_WATER_BLOCK)
                    .bucket(ModItems.DIRTY_WATER_BUCKET)
    );

    public static final DeferredHolder<Fluid, BaseFlowingFluid> MELON_JUICE_SOURCE = FLUIDS.register("melon_juice",
            () -> new BaseFlowingFluid.Source(ModFluid.MELON_JUICE_PROPERTIES.get()));
    public static final DeferredHolder<Fluid, BaseFlowingFluid> MELON_JUICE_FLOWING = FLUIDS.register("melon_juice_flow",
            () -> new BaseFlowingFluid.Flowing(ModFluid.MELON_JUICE_PROPERTIES.get()));

    private static final Supplier<BaseFlowingFluid.Properties> MELON_JUICE_PROPERTIES = Suppliers.memoize(() ->
            new BaseFlowingFluid.Properties(ModFluidType.MELON_JUICE, MELON_JUICE_SOURCE, MELON_JUICE_FLOWING)
                    .block(ModBlocks.MELON_JUICE_BLOCK)
                    .bucket(ModItems.MELON_JUICE_BUCKET)
    );

    public static final DeferredHolder<Fluid, BaseFlowingFluid> PUMPKIN_JUICE_SOURCE = FLUIDS.register("pumpkin_juice",
            () -> new BaseFlowingFluid.Source(ModFluid.PUMPKIN_JUICE_PROPERTIES.get()));
    public static final DeferredHolder<Fluid, BaseFlowingFluid> PUMPKIN_JUICE_FLOWING = FLUIDS.register("pumpkin_juice_flow",
            () -> new BaseFlowingFluid.Flowing(ModFluid.PUMPKIN_JUICE_PROPERTIES.get()));

    private static final Supplier<BaseFlowingFluid.Properties> PUMPKIN_JUICE_PROPERTIES = Suppliers.memoize(() ->
            new BaseFlowingFluid.Properties(ModFluidType.PUMPKIN_JUICE, PUMPKIN_JUICE_SOURCE, PUMPKIN_JUICE_FLOWING)
                    .block(ModBlocks.PUMPKIN_JUICE_BLOCK)
                    .bucket(ModItems.PUMPKIN_JUICE_BUCKET)
    );

    public static final DeferredHolder<Fluid, BaseFlowingFluid> GLOWBERRY_JUICE_SOURCE = FLUIDS.register("glowberry_juice",
            () -> new BaseFlowingFluid.Source(ModFluid.GLOWBERRY_JUICE_PROPERTIES.get()));
    public static final DeferredHolder<Fluid, BaseFlowingFluid> GLOWBERRY_JUICE_FLOWING = FLUIDS.register("glowberry_juice_flow",
            () -> new BaseFlowingFluid.Flowing(ModFluid.GLOWBERRY_JUICE_PROPERTIES.get()));

    private static final Supplier<BaseFlowingFluid.Properties> GLOWBERRY_JUICE_PROPERTIES = Suppliers.memoize(() ->
            new BaseFlowingFluid.Properties(ModFluidType.GLOWBERRY_JUICE, GLOWBERRY_JUICE_SOURCE, GLOWBERRY_JUICE_FLOWING)
                    .block(ModBlocks.GLOWBERRY_JUICE_BLOCK)
                    .bucket(ModItems.GLOWBERRY_JUICE_BUCKET)
    );

    public static final DeferredHolder<Fluid, BaseFlowingFluid> SWEETBERRY_JUICE_SOURCE = FLUIDS.register("sweetberry_juice",
            () -> new BaseFlowingFluid.Source(ModFluid.SWEETBERRY_JUICE_PROPERTIES.get()));
    public static final DeferredHolder<Fluid, BaseFlowingFluid> SWEETBERRY_JUICE_FLOWING = FLUIDS.register("sweetberry_juice_flow",
            () -> new BaseFlowingFluid.Flowing(ModFluid.SWEETBERRY_JUICE_PROPERTIES.get()));

    private static final Supplier<BaseFlowingFluid.Properties> SWEETBERRY_JUICE_PROPERTIES = Suppliers.memoize(() ->
            new BaseFlowingFluid.Properties(ModFluidType.SWEETBERRY_JUICE, SWEETBERRY_JUICE_SOURCE, SWEETBERRY_JUICE_FLOWING)
                    .block(ModBlocks.SWEETBERRY_JUICE_BLOCK)
                    .bucket(ModItems.SWEETBERRY_JUICE_BUCKET)
    );

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}