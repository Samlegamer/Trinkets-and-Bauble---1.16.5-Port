package fr.samlegamer.xat;

import fr.samlegamer.xat.items.XATItemsRegistry;
import fr.samlegamer.xat.key.XATKeys;
import fr.samlegamer.xat.utils.XatItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = Xat.MODID)
@Mod.EventBusSubscriber(modid = Xat.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Xat
{
	public static final String MODID = "xat";
		
	public static final XatItemGroup XAT_ITEMS_TAB = new XatItemGroup("xat_tab_items");
	
	public Xat()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
				
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		XATItemsRegistry.ITEMS_REGISTRY.register(bus);
	}
	
	private void setup(FMLCommonSetupEvent event)
	{
		
	}
	
	private void ClientSetup(FMLClientSetupEvent event)
	{
		XATKeys.registerKeys();
	}
}