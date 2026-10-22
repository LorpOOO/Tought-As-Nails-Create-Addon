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

    public static final DeferredHolder<Fluid, BaseFlowingFluid> GLOW_BERRY_JUICE_SOURCE = FLUIDS.register("glow_berry_juice",
            () -> new BaseFlowingFluid.Source(ModFluid.GLOW_BERRY_JUICE_PROPERTIES.get()));
    public static final DeferredHolder<Fluid, BaseFlowingFluid> GLOW_BERRY_JUICE_FLOWING = FLUIDS.register("glow_berry_juice_flow",
            () -> new BaseFlowingFluid.Flowing(ModFluid.GLOW_BERRY_JUICE_PROPERTIES.get()));

    private static final Supplier<BaseFlowingFluid.Properties> GLOW_BERRY_JUICE_PROPERTIES = Suppliers.memoize(() ->
            new BaseFlowingFluid.Properties(ModFluidType.GLOW_BERRY_JUICE, GLOW_BERRY_JUICE_SOURCE, GLOW_BERRY_JUICE_FLOWING)
                    .block(ModBlocks.GLOW_BERRY_JUICE_BLOCK)
                    .bucket(ModItems.GLOW_BERRY_JUICE_BUCKET)
    );

    public static final DeferredHolder<Fluid, BaseFlowingFluid> SWEET_BERRY_JUICE_SOURCE = FLUIDS.register("sweet_berry_juice",
            () -> new BaseFlowingFluid.Source(ModFluid.SWEET_BERRY_JUICE_PROPERTIES.get()));
    public static final DeferredHolder<Fluid, BaseFlowingFluid> SWEET_BERRY_JUICE_FLOWING = FLUIDS.register("sweet_berry_juice_flow",
            () -> new BaseFlowingFluid.Flowing(ModFluid.SWEET_BERRY_JUICE_PROPERTIES.get()));

    private static final Supplier<BaseFlowingFluid.Properties> SWEET_BERRY_JUICE_PROPERTIES = Suppliers.memoize(() ->
            new BaseFlowingFluid.Properties(ModFluidType.SWEET_BERRY_JUICE, SWEET_BERRY_JUICE_SOURCE, SWEET_BERRY_JUICE_FLOWING)
                    .block(ModBlocks.SWEET_BERRY_JUICE_BLOCK)
                    .bucket(ModItems.SWEET_BERRY_JUICE_BUCKET)
    );

    public static final DeferredHolder<Fluid, BaseFlowingFluid> ICE_TEA_SOURCE = FLUIDS.register("ice_tea",
            () -> new BaseFlowingFluid.Source(ModFluid.ICE_TEA_PROPERTIES.get()));
    public static final DeferredHolder<Fluid, BaseFlowingFluid> ICE_TEA_FLOWING = FLUIDS.register("ice_tea_flow",
            () -> new BaseFlowingFluid.Flowing(ModFluid.ICE_TEA_PROPERTIES.get()));

    private static final Supplier<BaseFlowingFluid.Properties> ICE_TEA_PROPERTIES = Suppliers.memoize(() ->
            new BaseFlowingFluid.Properties(ModFluidType.ICE_TEA, ICE_TEA_SOURCE, ICE_TEA_FLOWING)
    );

    public static final DeferredHolder<Fluid, BaseFlowingFluid> HOT_CHOCOLATE_SOURCE = FLUIDS.register("hot_chocolate",
            () -> new BaseFlowingFluid.Source(ModFluid.HOT_CHOCOLATE_PROPERTIES.get()));
    public static final DeferredHolder<Fluid, BaseFlowingFluid> HOT_CHOCOLATE_FLOWING = FLUIDS.register("hot_chocolate_flow",
            () -> new BaseFlowingFluid.Flowing(ModFluid.HOT_CHOCOLATE_PROPERTIES.get()));

    private static final Supplier<BaseFlowingFluid.Properties> HOT_CHOCOLATE_PROPERTIES = Suppliers.memoize(() ->
            new BaseFlowingFluid.Properties(ModFluidType.HOT_CHOCOLATE, HOT_CHOCOLATE_SOURCE, HOT_CHOCOLATE_FLOWING)
    );

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}