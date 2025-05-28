package net.violet.botanicalmenagerie.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.violet.botanicalmenagerie.BotanicalMenagerie;


public class ModItems {

    public static final Item GOLEM_CORE = registerItem("golem_core", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BotanicalMenagerie.MOD_ID,"golem_core")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BotanicalMenagerie.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BotanicalMenagerie.LOGGER.info("Registering Mod Items for " + BotanicalMenagerie.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(GOLEM_CORE);
        });
    }
}
