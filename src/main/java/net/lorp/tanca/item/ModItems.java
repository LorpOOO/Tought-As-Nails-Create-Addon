package net.lorp.tanca.item;

import net.lorp.tanca.ToughAsNailsCreateAddon;
import net.lorp.tanca.fluid.ModFluid;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ToughAsNailsCreateAddon.MOD_ID);

    public static final DeferredItem<Item> PURIFIED_WATER_BUCKET = ITEMS.register("purified_water_bucket",
            () -> new BucketItem(ModFluid.PURIFIED_WATER_SOURCE.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> APPLE_JUICE_BUCKET = ITEMS.register("apple_juice_bucket",
            () -> new BucketItem(ModFluid.APPLE_JUICE_SOURCE.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> CACTUS_JUICE_BUCKET = ITEMS.register("cactus_juice_bucket",
            () -> new BucketItem(ModFluid.CACTUS_JUICE_SOURCE.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> CHORUS_FRUIT_JUICE_BUCKET = ITEMS.register("chorus_fruit_juice_bucket",
            () -> new BucketItem(ModFluid.CHORUS_FRUIT_JUICE_SOURCE.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> DIRTY_WATER_BUCKET = ITEMS.register("dirty_water_bucket",
            () -> new BucketItem(ModFluid.DIRTY_WATER_SOURCE.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> MELON_JUICE_BUCKET = ITEMS.register("melon_juice_bucket",
            () -> new BucketItem(ModFluid.MELON_JUICE_SOURCE.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> PUMPKIN_JUICE_BUCKET = ITEMS.register("pumpkin_juice_bucket",
            () -> new BucketItem(ModFluid.PUMPKIN_JUICE_SOURCE.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> GLOWBERRY_JUICE_BUCKET = ITEMS.register("glowberry_juice_bucket",
            () -> new BucketItem(ModFluid.GLOWBERRY_JUICE_SOURCE.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> SWEETBERRY_JUICE_BUCKET = ITEMS.register("sweetberry_juice_bucket",
            () -> new BucketItem(ModFluid.SWEETBERRY_JUICE_SOURCE.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final DeferredItem<Item> LOGO = ITEMS.register("logo",
            () -> new Item(new Item.Properties()
                    .component(DataComponents.RARITY, Rarity.EPIC)
            ));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}