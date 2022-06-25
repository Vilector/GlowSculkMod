package net.vile.glowsculk.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vile.glowsculk.GlowSculk;

public class ModItems {

    public static Item SCULK_ORE = registerItem("sculk_ore",
            new Item(new FabricItemSettings().fireproof().group(ModItemGroup.HOWTO)));
    public static Item SCULK_CRYSTAL = registerItem("sculk_crystal",
            new Item(new FabricItemSettings().fireproof().group(ModItemGroup.HOWTO)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(GlowSculk.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GlowSculk.LOGGER.debug("Registering Mod Items for " + GlowSculk.MOD_ID);
    }
}
