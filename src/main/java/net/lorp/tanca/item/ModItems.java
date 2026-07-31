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
    public static final DeferredItem<Item> GLOW_BERRY_JUICE_BUCKET = ITEMS.register("glow_berry_juice_bucket",
            () -> new BucketItem(ModFluid.GLOW_BERRY_JUICE_SOURCE.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> SWEET_BERRY_JUICE_BUCKET = ITEMS.register("sweet_berry_juice_bucket",
            () -> new BucketItem(ModFluid.SWEET_BERRY_JUICE_SOURCE.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final DeferredItem<Item> BUILDERS_ICE_TEA = ITEMS.register("builders_ice_tea",
            () -> new ModDrinksItem(new Item.Properties()
                    .stacksTo(16)
                    .component(DataComponents.RARITY, Rarity.COMMON)
                    .craftRemainder(Items.GLASS_BOTTLE)));

    public static final DeferredItem<Item> HOT_CHOCOLATE = ITEMS.register("hot_chocolate",
            () -> new ModDrinksItem(new Item.Properties()
                    .stacksTo(16)
                    .component(DataComponents.RARITY, Rarity.COMMON)
                    .craftRemainder(Items.GLASS_BOTTLE)));

    public static final DeferredItem<Item> LOGO = ITEMS.register("logo",
            () -> new Item(new Item.Properties()
                    .component(DataComponents.RARITY, Rarity.EPIC)
            ));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}