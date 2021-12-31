package fr.samlegamer.xat.compat;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.ModList;

public class LMCompat
{	
	private static final String paralysis = "paralysis";
	private static final String penetration = "penetration";
	private static final String weight = "weight";
	private static final String fear = "fear";
	private static final String decay = "decay";
	private static final String insomnia = "insomnia";
	private static final String instability = "instability";
	private static final String lifeleak = "lifeleak";
	private static final String bleed = "bleed";
	private static final String plague = "plague";
	private static final String aphagia = "aphagia";
	private static final String smited = "smited";
	//private static final String smouldering = "smouldering";
	private static final String leech = "leech";
	private static final String swiftswimming = "swiftswimming";
	private static final String fallresist = "fallresist";
	private static final String rejuvenation = "rejuvenation";
	private static final String immunization = "immunization";
	private static final String cleansed = "cleansed";
	private static final String repulsion = "repulsion";

	public static void removeFear(LivingEntity entity)
	{
		removeEffect(entity, fear);
	}
	
	public static void removeParalysis(LivingEntity entity) {
		removeEffect(entity, paralysis);
	}

	public static void removePenetration(LivingEntity entity) {
		removeEffect(entity, penetration);
	}

	public static void removeWeight(LivingEntity entity) {
		removeEffect(entity, weight);
	}

	public static void removeDecay(LivingEntity entity) {
		removeEffect(entity, decay);
	}

	public static void removeInsomnia(LivingEntity entity) {
		removeEffect(entity, insomnia);
	}

	public static void removeInstability(LivingEntity entity) {
		removeEffect(entity, instability);
	}

	public static void removeLifeleak(LivingEntity entity) {
		removeEffect(entity, lifeleak);
	}

	public static void removeBleed(LivingEntity entity) {
		removeEffect(entity, bleed);
	}

	public static void removePlague(LivingEntity entity) {
		removeEffect(entity, plague);
	}

	public static void removeAphagia(LivingEntity entity) {
		removeEffect(entity, aphagia);
	}

	public static void removeSmited(LivingEntity entity) {
		removeEffect(entity, smited);
	}

	public static void removeLeech(LivingEntity entity) {
		// Good Effect
		removeEffect(entity, leech);
	}

	public static void removeSwiftSwimming(LivingEntity entity) {
		// Good Effect
		removeEffect(entity, swiftswimming);
	}

	public static void removeFallResist(LivingEntity entity) {
		// Good Effect
		removeEffect(entity, fallresist);
	}

	public static void removeRejuvenation(LivingEntity entity) {
		// Good Effect
		removeEffect(entity, rejuvenation);
	}

	public static void removeImmunization(LivingEntity entity) {
		// Good Effect
		removeEffect(entity, immunization);
	}

	public static void removeCleansed(LivingEntity entity) {
		// Good Effect
		removeEffect(entity, cleansed);
	}

	public static void removeRepulsion(LivingEntity entity) {
		// Good Effect
		removeEffect(entity, repulsion);
	}
	
	public static void removeEffect(LivingEntity entity, String name)
	{
		if(ModList.get().isLoaded("lycanitesmobs"))
		{
			try {
				Potion effect = Potion.byName("lycanitesmobs:" + name);
				if ((effect != null) && entity.hasEffect((Effect) effect.getEffects())) {
					entity.removeEffect((Effect) effect.getEffects());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}