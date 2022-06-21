package net.vile.glowsculk;

import net.fabricmc.api.ModInitializer;
import net.vile.glowsculk.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlowSculk implements ModInitializer {
	public static final String MOD_ID = "glowsculk";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}
