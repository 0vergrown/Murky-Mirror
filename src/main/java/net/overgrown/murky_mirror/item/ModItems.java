package net.overgrown.murky_mirror.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.overgrown.murky_mirror.MurkyMirror;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item MURKY_MIRROR = registerItem("murky_mirror",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.MISC).maxCount(1)));

    public static final Item BROKEN_MURKY_MIRROR = registerItem("broken_murky_mirror",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.MISC).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MurkyMirror.MOD_ID, name), item);
    }
    public static void registerModItems() {
        MurkyMirror.LOGGER.info("Registering Mod Items for " + MurkyMirror.MOD_ID);
    }
}
