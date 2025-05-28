package net.violet.botanicalmenagerie;

import net.fabricmc.api.ModInitializer;

import net.violet.botanicalmenagerie.item.ModItemGroups;
import net.violet.botanicalmenagerie.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BotanicalMenagerie implements ModInitializer {
	public static final String MOD_ID = "botanical-menagerie";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}