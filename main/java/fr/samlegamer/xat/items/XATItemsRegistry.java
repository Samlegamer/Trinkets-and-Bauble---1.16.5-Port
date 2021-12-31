package fr.samlegamer.xat.items;

import fr.samlegamer.xat.Xat;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class XATItemsRegistry
{
	public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Xat.MODID);
	
	//normal items
	public static final RegistryObject<Item> GLOWING_DUST = ITEMS_REGISTRY.register("glowing_powder", () -> new PowderGlowingItem(new Item.Properties().tab(Xat.XAT_ITEMS_TAB)));
	public static final RegistryObject<Item> GLOWING_INGOT = ITEMS_REGISTRY.register("glowing_ingot", () -> new IngotGlowingItem(new Item.Properties().tab(Xat.XAT_ITEMS_TAB)));
	public static final RegistryObject<Item> GLOWING_GEM = ITEMS_REGISTRY.register("glowing_gem", () -> new GemGlowingItem(new Item.Properties().tab(Xat.XAT_ITEMS_TAB)));
	
	//Trinket
	public static final RegistryObject<Item> DRAGON_EYE = ITEMS_REGISTRY.register("dragon_eye", () -> new DragonEyeItem(new Item.Properties().stacksTo(1).tab(Xat.XAT_ITEMS_TAB).fireResistant()));
	public static final RegistryObject<Item> GLOWING_RING = ITEMS_REGISTRY.register("glowing_ring", () -> new GlowingRingItem(new Item.Properties().stacksTo(1).tab(Xat.XAT_ITEMS_TAB)));
	public static final RegistryObject<Item> DAMAGE_SHIELD = ITEMS_REGISTRY.register("damage_shield", () -> new DamageShieldItem(new Item.Properties().stacksTo(1).tab(Xat.XAT_ITEMS_TAB)));
	public static final RegistryObject<Item> POISON_STONE = ITEMS_REGISTRY.register("poison_stone", () -> new PoisonStoneItem(new Item.Properties().stacksTo(1).tab(Xat.XAT_ITEMS_TAB)));
	public static final RegistryObject<Item> WITHER_RING = ITEMS_REGISTRY.register("wither_ring", () -> new WitherRingItem(new Item.Properties().stacksTo(1).tab(Xat.XAT_ITEMS_TAB)));
	public static final RegistryObject<Item> TEDDY_BEAR = ITEMS_REGISTRY.register("teddy_bear", () -> new TeddyBearItem(new Item.Properties().stacksTo(1).tab(Xat.XAT_ITEMS_TAB)));
	public static final RegistryObject<Item> WEIGHLESS_STONE = ITEMS_REGISTRY.register("weightless_stone", () -> new WeightlessStoneItem(new Item.Properties().stacksTo(1).tab(Xat.XAT_ITEMS_TAB)));

}