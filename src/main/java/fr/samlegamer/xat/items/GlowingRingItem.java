package fr.samlegamer.xat.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class GlowingRingItem extends Item implements ICurioItem
{
	public World world;
	
	public GlowingRingItem(Properties props)
	{
		super(props);
	}
	
	@Override
	public void curioTick(String identifier, int index, LivingEntity livingEntity, ItemStack stack)
	{
		
		if(!livingEntity.hasEffect(Effects.NIGHT_VISION)) {
            EffectInstance effectInstance = new EffectInstance(Effects.NIGHT_VISION, Integer.MAX_VALUE, 0, false, false);
            if(livingEntity.level.isClientSide) effectInstance.getDuration();
            livingEntity.addEffect(effectInstance);
		}
		livingEntity.removeEffect(Effects.BLINDNESS);
	}

    @Override
    public boolean canUnequip(String identifier, LivingEntity livingEntity, ItemStack stack)
    {
    	return livingEntity.removeEffect(Effects.NIGHT_VISION);
    }
    
    @Override
    public boolean canEquipFromUse(SlotContext slotContext, ItemStack stack)
    {
        return true;
    }
    
    @Override
	public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> tooltip, ITooltipFlag p_77624_4_)
	{
		tooltip.add(new TranslationTextComponent("item.xat.glowing_ring.desc").withStyle(TextFormatting.YELLOW));
	}
}