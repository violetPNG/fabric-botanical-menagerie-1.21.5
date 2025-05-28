package net.violet.botanicalmenagerie.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.violet.botanicalmenagerie.BotanicalMenagerie;

public class ModItemGroups {
    public static final ItemGroup BOTANICAL_MENAGERIE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BotanicalMenagerie.MOD_ID, "botanical_menagerie"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.GOLEM_CORE))
                    .displayName(Text.translatable("itemgroup.botanical_menagerie.botanical_menagerie"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.GOLEM_CORE);
                    }).build());


    public static void registerItemGroups() {
        BotanicalMenagerie.LOGGER.info("Registering Item Groups for " + BotanicalMenagerie.MOD_ID);
    }
}
