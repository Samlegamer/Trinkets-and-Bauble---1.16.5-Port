package fr.samlegamer.xat.key;

import org.lwjgl.glfw.GLFW;

import fr.samlegamer.xat.Xat;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class XATKeys
{
	public static final KeyBinding DRAGON_EYE_NIGHT_VISION = new KeyBinding("key." + Xat.MODID + ".dragon_eye_night_vision", GLFW.GLFW_KEY_DOWN, "key.categories." + Xat.MODID);
	
	public static void registerKeys()
	{
		ClientRegistry.registerKeyBinding(DRAGON_EYE_NIGHT_VISION);
	}
}