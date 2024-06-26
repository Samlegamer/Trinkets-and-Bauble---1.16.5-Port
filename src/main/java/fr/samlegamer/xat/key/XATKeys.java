package fr.samlegamer.xat.key;

import org.lwjgl.glfw.GLFW;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import fr.samlegamer.xat.Xat;

public class XATKeys
{
	public static final KeyBinding DRAGON_EYE_NIGHT_VISION_ON = new KeyBinding("key." + Xat.MODID + ".dragon_eye_night_vision", GLFW.GLFW_KEY_UP, "key.categories." + Xat.MODID);
	public static final KeyBinding DRAGON_EYE_NIGHT_VISION_OFF = new KeyBinding("key." + Xat.MODID + ".dragon_eye_night_vision_off", GLFW.GLFW_KEY_DOWN, "key.categories." + Xat.MODID);

	public static void registerKeys()
	{
		ClientRegistry.registerKeyBinding(DRAGON_EYE_NIGHT_VISION_ON);
		ClientRegistry.registerKeyBinding(DRAGON_EYE_NIGHT_VISION_OFF);
	}
}