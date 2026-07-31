package net.lorp.tanca;

import net.lorp.tanca.block.ModBlocks;
import net.lorp.tanca.fluid.ModFluidType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;

@SuppressWarnings("deprecation")
@EventBusSubscriber(modid = ToughAsNailsCreateAddon.MOD_ID, value = Dist.CLIENT)
public class ToughAsNailsCreateAddonClient {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURIFIED_WATER_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.APPLE_JUICE_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CACTUS_JUICE_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHORUS_FRUIT_JUICE_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DIRTY_WATER_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MELON_JUICE_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PUMPKIN_JUICE_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLOW_BERRY_JUICE_BLOCK.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SWEET_BERRY_JUICE_BLOCK.get(), RenderType.translucent());
        });
    }

    @SubscribeEvent
    public static void onRegisterClientExtensions(RegisterClientExtensionsEvent event) {
        registerFluidRender(event, ModFluidType.PURIFIED_WATER.get(), "purified_water");
        registerFluidRender(event, ModFluidType.APPLE_JUICE.get(), "apple_juice");
        registerFluidRender(event, ModFluidType.CACTUS_JUICE.get(), "cactus_juice");
        registerFluidRender(event, ModFluidType.CHORUS_FRUIT_JUICE.get(), "chorus_fruit_juice");
        registerFluidRender(event, ModFluidType.DIRTY_WATER.get(), "dirty_water");
        registerFluidRender(event, ModFluidType.MELON_JUICE.get(), "melon_juice");
        registerFluidRender(event, ModFluidType.PUMPKIN_JUICE.get(), "pumpkin_juice");
        registerFluidRender(event, ModFluidType.GLOW_BERRY_JUICE.get(), "glow_berry_juice");
        registerFluidRender(event, ModFluidType.SWEET_BERRY_JUICE.get(), "sweet_berry_juice");
        registerFluidRender(event, ModFluidType.ICE_TEA.get(), "ice_tea");
        registerFluidRender(event, ModFluidType.HOT_CHOCOLATE.get(), "hot_chocolate");
    }

    private static void registerFluidRender(RegisterClientExtensionsEvent event, net.neoforged.neoforge.fluids.FluidType type, String textureName) {
        event.registerFluidType(new IClientFluidTypeExtensions() {
            private final ResourceLocation STILL = ResourceLocation.fromNamespaceAndPath(ToughAsNailsCreateAddon.MOD_ID, "block/" + textureName + "_still");
            private final ResourceLocation FLOW = ResourceLocation.fromNamespaceAndPath(ToughAsNailsCreateAddon.MOD_ID, "block/" + textureName + "_flow");

            @Override
            public ResourceLocation getStillTexture() {
                return STILL;
            }

            @Override
            public ResourceLocation getFlowingTexture() {
                return FLOW;
            }
        }, type);
    }
}