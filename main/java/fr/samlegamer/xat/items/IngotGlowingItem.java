package fr.samlegamer.xat.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class IngotGlowingItem extends Item
{
	public IngotGlowingItem(Properties p_i48487_1_)
	{
		super(p_i48487_1_);
	}

    @Override
	public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> tooltip, ITooltipFlag p_77624_4_)
	{
		tooltip.add(new TranslationTextComponent("item.xat.glowing_ingot.desc").withStyle(TextFormatting.YELLOW));
	}
}