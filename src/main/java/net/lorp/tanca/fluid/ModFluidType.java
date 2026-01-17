package net.lorp.tanca.fluid;

import net.lorp.tanca.ToughAsNailsCreateAddon;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Consumer;

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
            ) {
                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                    consumer.accept(new IClientFluidTypeExtensions() {
                        private static final ResourceLocation STILL = ResourceLocation.fromNamespaceAndPath(ToughAsNailsCreateAddon.MOD_ID, "block/purified_water_still");
                        private static final ResourceLocation FLOW = ResourceLocation.fromNamespaceAndPath(ToughAsNailsCreateAddon.MOD_ID, "block/purified_water_flow");
                        @Override public ResourceLocation getStillTexture() { return STILL; }
                        @Override public ResourceLocation getFlowingTexture() { return FLOW; }
                    });
                }
            }
    );

    public static final DeferredHolder<FluidType, FluidType> APPLE_JUICE = FLUID_TYPES.register("apple_juice",
            () -> new FluidType(FluidType.Properties.create()
                    .density(1)
                    .canSwim(true)
                    .canDrown(true)
                    .canPushEntity(true)
                    .canHydrate(false)
                    .supportsBoating(true)
            ) {
                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                    consumer.accept(new IClientFluidTypeExtensions() {
                        private static final ResourceLocation STILL = ResourceLocation.fromNamespaceAndPath(ToughAsNailsCreateAddon.MOD_ID, "block/apple_juice_still");
                        private static final ResourceLocation FLOW = ResourceLocation.fromNamespaceAndPath(ToughAsNailsCreateAddon.MOD_ID, "block/apple_juice_flow");
                        @Override public ResourceLocation getStillTexture() { return STILL; }
                        @Override public ResourceLocation getFlowingTexture() { return FLOW; }
                    });
                }
            }
    );

    public static final DeferredHolder<FluidType, FluidType> CACTUS_JUICE = FLUID_TYPES.register("cactus_juice",
            () -> new FluidType(FluidType.Properties.create()
                    .density(1)
                    .canSwim(true)
                    .canDrown(true)
                    .canPushEntity(true)
                    .canHydrate(false)
                    .supportsBoating(true)
            ) {
                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                    consumer.accept(new IClientFluidTypeExtensions() {
                        private static final ResourceLocation STILL = ResourceLocation.fromNamespaceAndPath(ToughAsNailsCreateAddon.MOD_ID, "block/cactus_juice_still");
                        private static final ResourceLocation FLOW = ResourceLocation.fromNamespaceAndPath(ToughAsNailsCreateAddon.MOD_ID, "block/cactus_juice_flow");
                        @Override public ResourceLocation getStillTexture() { return STILL; }
                        @Override public ResourceLocation getFlowingTexture() { return FLOW; }
                    });
                }
            }
    );

    public static final DeferredHolder<FluidType, FluidType> CHORUS_FRUIT_JUICE = FLUID_TYPES.register("chorus_fruit_juice",
            () -> new FluidType(FluidType.Properties.create()
                    .density(1)
                    .canSwim(true)
                    .canDrown(true)
                    .canPushEntity(true)
                    .canHydrate(false)
                    .supportsBoating(true)
            ) {
                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                    consumer.accept(new IClientFluidTypeExtensions() {
                        private static final ResourceLocation STILL = ResourceLocation.fromNamespaceAndPath(ToughAsNailsCreateAddon.MOD_ID, "block/chorus_fruit_juice_still");
                        private static final ResourceLocation FLOW = ResourceLocation.fromNamespaceAndPath(ToughAsNailsCreateAddon.MOD_ID, "block/chorus_fruit_juice_flow");
                        @Override public ResourceLocation getStillTexture() { return STILL; }
                        @Override public ResourceLocation getFlowingTexture() { return FLOW; }
                    });
                }
            }
    );

    public static final DeferredHolder<FluidType, FluidType> DIRTY_WATER = FLUID_TYPES.register("dirty_water",
            () -> new FluidType(FluidType.Properties.create()
                    .density(1)
                    .canSwim(true)
                    .canDrown(true)
                    .canPushEntity(true)
                    .canHydrate(false)
                    .supportsBoating(true)
            ) {
                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                    consumer.accept(new IClientFluidTypeExtensions() {
                        private static final ResourceLocation STILL = ResourceLocation.fromNamespaceAndPath(ToughAsNailsCreateAddon.MOD_ID, "block/dirty_water_still");
                        private static final ResourceLocation FLOW = ResourceLocation.fromNamespaceAndPath(ToughAsNailsCreateAddon.MOD_ID, "block/dirty_water_flow");
                        @Override public ResourceLocation getStillTexture() { return STILL; }
                        @Override public ResourceLocation getFlowingTexture() { return FLOW; }
                    });
                }
            }
    );

    public static final DeferredHolder<FluidType, FluidType> MELON_JUICE = FLUID_TYPES.register("melon_juice",
            () -> new FluidType(FluidType.Properties.create()
                    .density(1)
                    .canSwim(true)
                    .canDrown(true)
                    .canPushEntity(true)
                    .canHydrate(false)
                    .supportsBoating(true)
            ) {
                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                    consumer.accept(new IClientFluidTypeExtensions() {
                        private static final ResourceLocation STILL = ResourceLocation.fromNamespaceAndPath(ToughAsNailsCreateAddon.MOD_ID, "block/melon_juice_still");
                        private static final ResourceLocation FLOW = ResourceLocation.fromNamespaceAndPath(ToughAsNailsCreateAddon.MOD_ID, "block/melon_juice_flow");
                        @Override public ResourceLocation getStillTexture() { return STILL; }
                        @Override public ResourceLocation getFlowingTexture() { return FLOW; }
                    });
                }
            }
    );

    public static final DeferredHolder<FluidType, FluidType> PUMPKIN_JUICE = FLUID_TYPES.register("pumpkin_juice",
            () -> new FluidType(FluidType.Properties.create()
                    .density(1)
                    .canSwim(true)
                    .canDrown(true)
                    .canPushEntity(true)
                    .canHydrate(false)
                    .supportsBoating(true)
            ) {
                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                    consumer.accept(new IClientFluidTypeExtensions() {
                        private static final ResourceLocation STILL = ResourceLocation.fromNamespaceAndPath(ToughAsNailsCreateAddon.MOD_ID, "block/pumpkin_juice_still");
                        private static final ResourceLocation FLOW = ResourceLocation.fromNamespaceAndPath(ToughAsNailsCreateAddon.MOD_ID, "block/pumpkin_juice_flow");
                        @Override public ResourceLocation getStillTexture() { return STILL; }
                        @Override public ResourceLocation getFlowingTexture() { return FLOW; }
                    });
                }
            }
    );

    public static final DeferredHolder<FluidType, FluidType> GLOWBERRY_JUICE = FLUID_TYPES.register("glowberry_juice",
            () -> new FluidType(FluidType.Properties.create()
                    .density(1)
                    .canSwim(true)
                    .canDrown(true)
                    .canPushEntity(true)
                    .canHydrate(false)
                    .supportsBoating(true)
            ) {
                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                    consumer.accept(new IClientFluidTypeExtensions() {
                        private static final ResourceLocation STILL = ResourceLocation.fromNamespaceAndPath(ToughAsNailsCreateAddon.MOD_ID, "block/glowberry_juice_still");
                        private static final ResourceLocation FLOW = ResourceLocation.fromNamespaceAndPath(ToughAsNailsCreateAddon.MOD_ID, "block/glowberry_juice_flow");
                        @Override public ResourceLocation getStillTexture() { return STILL; }
                        @Override public ResourceLocation getFlowingTexture() { return FLOW; }
                    });
                }
            }
    );

    public static final DeferredHolder<FluidType, FluidType> SWEETBERRY_JUICE = FLUID_TYPES.register("sweetberry_juice",
            () -> new FluidType(FluidType.Properties.create()
                    .density(1)
                    .canSwim(true)
                    .canDrown(true)
                    .canPushEntity(true)
                    .canHydrate(false)
                    .supportsBoating(true)
            ) {
                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                    consumer.accept(new IClientFluidTypeExtensions() {
                        private static final ResourceLocation STILL = ResourceLocation.fromNamespaceAndPath(ToughAsNailsCreateAddon.MOD_ID, "block/sweetberry_juice_still");
                        private static final ResourceLocation FLOW = ResourceLocation.fromNamespaceAndPath(ToughAsNailsCreateAddon.MOD_ID, "block/sweetberry_juice_flow");
                        @Override public ResourceLocation getStillTexture() { return STILL; }
                        @Override public ResourceLocation getFlowingTexture() { return FLOW; }
                    });
                }
            }
    );

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}