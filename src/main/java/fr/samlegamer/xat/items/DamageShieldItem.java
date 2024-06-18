package fr.samlegamer.xat.items;

import com.mojang.blaze3d.platform.GlStateManager;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.PlayerRenderer;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class DamageShieldItem extends Item implements ICurioItem
{	
	public DamageShieldItem(Properties props)
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
    
    public PlayerRenderer renderer;
    public float scale;
    public boolean render = true;
    /*
	private boolean stackHasStatus(ItemStack stack) {
		return this.getTagCompoundSafe(stack).hasKey("status");
	}

	public NBTTagCompound getTagCompoundSafe(ItemStack stack) {
		NBTTagCompound tagCompound = stack.getTagCompound();
		if (tagCompound == null) {
			tagCompound = new NBTTagCompound();
			stack.setTagCompound(tagCompound);
		}
		return tagCompound;
	}*/
    
    
    
    @SuppressWarnings({ "deprecation", "null" })
	@OnlyIn(Dist.CLIENT)
    @Override
    public boolean canRender(String identifier, int index, LivingEntity livingEntity, ItemStack stack)
    {
		//ModelResourceLocation normal = new ModelResourceLocation(this.getRegistryName().toString(), "inventory");

		float offsetX = 0.17F;
		float offsetY = 0.22F;
		float offsetZ = 0.16F;
		GlStateManager._pushMatrix();
		if (livingEntity.isShiftKeyDown()) {
			GlStateManager._translatef(0F, 0.2F, 0F);
		}
		renderer.getModel().body.addBox(scale, (Float) null, (Float) null, (Float) null, (Float) null, (Float) null);
		GlStateManager._rotatef(180F, 1F, 0F, 0F);
		GlStateManager._translatef(offsetX, -offsetY, offsetZ);
		if (livingEntity.hasItemInSlot(EquipmentSlotType.CHEST)) {
			GlStateManager._translatef(offsetX - 0.14F, 0, -(offsetZ - 0.2F));
		}
		float bS = 3f;
		GlStateManager._scalef(scale * bS, scale * bS, scale * bS);
		Minecraft.getInstance().getItemRenderer().render(stack, ItemCameraTransforms.TransformType.NONE, false, null, null, index, index, null);
		GlStateManager._popMatrix();

    	
		return false;
    }
}