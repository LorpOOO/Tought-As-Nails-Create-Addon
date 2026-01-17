package net.lorp.tanca.block;

import net.lorp.tanca.ToughAsNailsCreateAddon;
import net.lorp.tanca.fluid.ModFluid;
import net.lorp.tanca.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ToughAsNailsCreateAddon.MOD_ID);

    public static final DeferredHolder<Block, LiquidBlock> PURIFIED_WATER_BLOCK = BLOCKS.register("purified_water_block",
            () -> new LiquidBlock(
                    ModFluid.PURIFIED_WATER_SOURCE.get(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.WATER)
                            .noCollission()
                            .strength(100.0F)
                            .noLootTable()
                            .replaceable()
            ));
    public static final DeferredHolder<Block, LiquidBlock> APPLE_JUICE_BLOCK = BLOCKS.register("apple_juice_block",
            () -> new LiquidBlock(
                    ModFluid.APPLE_JUICE_SOURCE.get(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_ORANGE)
                            .noCollission()
                            .strength(100.0F)
                            .noLootTable()
                            .replaceable()
            ));
    public static final DeferredHolder<Block, LiquidBlock> CACTUS_JUICE_BLOCK = BLOCKS.register("cactus_juice_block",
            () -> new LiquidBlock(
                    ModFluid.CACTUS_JUICE_SOURCE.get(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_GREEN)
                            .noCollission()
                            .strength(100.0F)
                            .noLootTable()
                            .replaceable()
            ));
    public static final DeferredHolder<Block, LiquidBlock> CHORUS_FRUIT_JUICE_BLOCK = BLOCKS.register("chorus_fruit_juice_block",
            () -> new LiquidBlock(
                    ModFluid.CHORUS_FRUIT_JUICE_SOURCE.get(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_PURPLE)
                            .noCollission()
                            .strength(100.0F)
                            .noLootTable()
                            .replaceable()
            ));
    public static final DeferredHolder<Block, LiquidBlock> DIRTY_WATER_BLOCK = BLOCKS.register("dirty_water_block",
            () -> new LiquidBlock(
                    ModFluid.DIRTY_WATER_SOURCE.get(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.DIRT)
                            .noCollission()
                            .strength(100.0F)
                            .noLootTable()
                            .replaceable()
            ));
    public static final DeferredHolder<Block, LiquidBlock> MELON_JUICE_BLOCK = BLOCKS.register("melon_juice_block",
            () -> new LiquidBlock(
                    ModFluid.MELON_JUICE_SOURCE.get(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_RED)
                            .noCollission()
                            .strength(100.0F)
                            .noLootTable()
                            .replaceable()
            ));
    public static final DeferredHolder<Block, LiquidBlock> PUMPKIN_JUICE_BLOCK = BLOCKS.register("pumpkin_juice_block",
            () -> new LiquidBlock(
                    ModFluid.PUMPKIN_JUICE_SOURCE.get(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_ORANGE)
                            .noCollission()
                            .strength(100.0F)
                            .noLootTable()
                            .replaceable()
            ));
    public static final DeferredHolder<Block, LiquidBlock> GLOWBERRY_JUICE_BLOCK = BLOCKS.register("glowberry_juice_block",
            () -> new LiquidBlock(
                    ModFluid.GLOWBERRY_JUICE_SOURCE.get(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.GOLD)
                            .noCollission()
                            .strength(100.0F)
                            .noLootTable()
                            .replaceable()
            ));
    public static final DeferredHolder<Block, LiquidBlock> SWEETBERRY_JUICE_BLOCK = BLOCKS.register("sweetberry_juice_block",
            () -> new LiquidBlock(
                    ModFluid.SWEETBERRY_JUICE_SOURCE.get(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_RED)
                            .noCollission()
                            .strength(100.0F)
                            .noLootTable()
                            .replaceable()
            ));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
