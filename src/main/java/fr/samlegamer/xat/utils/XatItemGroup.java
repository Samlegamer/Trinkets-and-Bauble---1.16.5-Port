package fr.samlegamer.xat.utils;

import fr.samlegamer.xat.items.XATItemsRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class XatItemGroup extends ItemGroup
{
	public XatItemGroup(String label)
	{
        super(label);
    }
	
	@Override
	public ItemStack makeIcon()
	{
        return new ItemStack(XATItemsRegistry.GLOWING_RING.get());
	}
	
    @Override
    public boolean hasSearchBar()
    {
        return false;
    }
}