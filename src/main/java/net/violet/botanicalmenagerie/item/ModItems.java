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
import net.violet.botanicalmenagerie.item.custom.ChiselItem;

import java.util.function.Function;


public class ModItems {

    public static final Item GOLEM_CORE = registerItem("golem_core", Item:: new);

    public static final Item CHISEL = registerItem("chisel", settings -> new ChiselItem(settings));

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(BotanicalMenagerie.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BotanicalMenagerie.MOD_ID, name)))));
    }

    public static void registerModItems() {
        BotanicalMenagerie.LOGGER.info("Registering Mod Items for " + BotanicalMenagerie.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(GOLEM_CORE);
        });
    }
}
