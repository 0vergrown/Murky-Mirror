package net.overgrown.murky_mirror;

import net.fabricmc.api.ModInitializer;
import net.overgrown.murky_mirror.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MurkyMirror implements ModInitializer {
	public static final String MOD_ID = "murky_mirror";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}