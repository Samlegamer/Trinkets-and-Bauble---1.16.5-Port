package fr.samlegamer.xat.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class WeightlessStoneItem extends Item implements ICurioItem
{	
	public PlayerEntity player;
	
	public WeightlessStoneItem(Properties props)
	{
		super(props);
	}
	
	@Override
	public void curioTick(String identifier, int index, LivingEntity livingEntity, ItemStack stack)
	{
		
		if(!livingEntity.hasEffect(Effects.DAMAGE_RESISTANCE)) {
            EffectInstance effectInstance = new EffectInstance(Effects.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 0, false, false);
            if(livingEntity.level.isClientSide) effectInstance.getDuration();
            livingEntity.addEffect(effectInstance);
            
		}
	}

	@Override
    public boolean canEquipFromUse(SlotContext slotContext, ItemStack stack)
    {
        return true;
    }
	
    @Override
    public boolean canUnequip(String identifier, LivingEntity livingEntity, ItemStack stack)
    {
    	return livingEntity.removeEffect(Effects.DAMAGE_RESISTANCE);
    }
}