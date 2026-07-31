package net.lorp.tanca.item;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModDrinksItem extends Item {

    private static final Pattern HEX_PATTERN = Pattern.compile("&#([0-9a-fA-F]{6})_([^&#]*)");

    public ModDrinksItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);
        player.startUsingItem(hand);
        return InteractionResultHolder.consume(itemStack);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        if (entity instanceof Player player) {
            player.playSound(SoundEvents.GENERIC_DRINK, 1.0F, 1.0F);
            player.awardStat(Stats.ITEM_USED.get(this));

            if (!level.isClientSide) {
                if (stack.getItem() == ModItems.BUILDERS_ICE_TEA.get()) {
                    player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0));
                } else if (stack.getItem() == ModItems.HOT_CHOCOLATE.get()) {
                    player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 0));
                }
            }

            if (player instanceof ServerPlayer serverPlayer) {
                CriteriaTriggers.CONSUME_ITEM.trigger(serverPlayer, stack);
            }
            if (!player.getAbilities().instabuild) {
                return new ItemStack(Items.GLASS_BOTTLE);
            }
        }
        return stack;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        String key = stack.getItem().getDescriptionId();
        String descKey = key + ".description";
        String desc = Component.translatable(descKey).getString();

        if (Screen.hasShiftDown()) {
            String[] parts = desc.split("Shift");
            if (parts.length == 2) {
                MutableComponent before = Component.literal(parts[0]).withStyle(ChatFormatting.DARK_GRAY);
                MutableComponent shift = Component.literal("Shift").withStyle(ChatFormatting.WHITE);
                MutableComponent after = Component.literal(parts[1]).withStyle(ChatFormatting.DARK_GRAY);
                tooltipComponents.add(before.append(shift).append(after));
            }
        } else {
            String[] parts = desc.split("Shift");
            if (parts.length == 2) {
                MutableComponent before = Component.literal(parts[0]).withStyle(ChatFormatting.DARK_GRAY);
                MutableComponent shift = Component.literal("Shift").withStyle(ChatFormatting.GRAY);
                MutableComponent after = Component.literal(parts[1]).withStyle(ChatFormatting.DARK_GRAY);
                tooltipComponents.add(before.append(shift).append(after));
            }
        }

        if (Screen.hasShiftDown()) {
            tooltipComponents.add(Component.literal(""));
            String line1Key = key + ".effect.line1";
            String line2Key = key + ".effect.line2";
            String line1 = Component.translatable(line1Key).getString();
            String line2 = Component.translatable(line2Key).getString();
            if (!line1.equals(line1Key)) {
                tooltipComponents.add(parseHexColors(line1));
            }
            if (!line2.equals(line2Key)) {
                tooltipComponents.add(parseHexColors(line2));
            }
        }

        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }

    private MutableComponent parseHexColors(String text) {
        MutableComponent result = Component.literal("");
        Matcher matcher = HEX_PATTERN.matcher(text);
        int lastEnd = 0;

        while (matcher.find()) {
            if (matcher.start() > lastEnd) {
                result.append(Component.literal(text.substring(lastEnd, matcher.start())));
            }
            String hex = matcher.group(1);
            String content = matcher.group(2);
            TextColor color = TextColor.parseColor("#" + hex).result().orElse(null);
            if (color != null) {
                result.append(Component.literal(content).withStyle(Style.EMPTY.withColor(color)));
            } else {
                result.append(Component.literal(content));
            }
            lastEnd = matcher.end();
        }

        if (lastEnd < text.length()) {
            result.append(Component.literal(text.substring(lastEnd)));
        }

        return result;
    }

    @Override
    public int getUseDuration(ItemStack stack, LivingEntity entity) {
        return 32;
    }

    @Override
    public SoundEvent getDrinkingSound() {
        return SoundEvents.GENERIC_DRINK;
    }

    @Override
    public SoundEvent getEatingSound() {
        return SoundEvents.GENERIC_DRINK;
    }
}