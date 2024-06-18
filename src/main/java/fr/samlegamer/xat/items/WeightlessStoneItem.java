package fr.samlegamer.xat.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class WeightlessStoneItem extends Item implements ICurioItem
{		
	public WeightlessStoneItem(Properties props)
	{
		super(props);
	}
	
	@Override
	public void curioTick(String identifier, int index, LivingEntity livingEntity, ItemStack stack)
	{
		if (!livingEntity.isOnGround()) {
			livingEntity.yo = 0;
			if ((!(livingEntity.isShiftKeyDown())) && livingEntity.swinging) {
				livingEntity.yo += 0.1;
			}
			if (livingEntity.isShiftKeyDown() && livingEntity.swinging) {
				livingEntity.yo -= 0.1;
			}
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
    	return true;
    }
}