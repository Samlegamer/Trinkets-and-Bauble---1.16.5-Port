package fr.samlegamer.xat.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class WitherRingItem extends Item implements ICurioItem
{
	public World world;
	
	public WitherRingItem(Properties props)
	{
		super(props);
	}
	
	@Override
	public void curioTick(String identifier, int index, LivingEntity livingEntity, ItemStack stack)
	{
        livingEntity.removeEffect(Effects.WITHER);
        livingEntity.removeEffect(Effects.CONFUSION);
	}
	
	@Override
    public boolean canEquipFromUse(SlotContext slotContext, ItemStack stack)
    {
        return true;
    }
	
	@Override
	public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> tooltip, ITooltipFlag p_77624_4_)
	{
		tooltip.add(new TranslationTextComponent("item.xat.wither_ring.desc").withStyle(TextFormatting.GOLD));
	}
}