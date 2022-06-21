package net.vile.glowsculk.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vile.glowsculk.GlowSculk;

public class ModItems {

    public static final Item GLOW_WOOL = registerItem( "glow_wool", new Item(new FabricItemSettings().group(ModItemGroup.HOWTO)));
    public static final Item RAW_SC0RE = registerItem( "raw_sc0re", new Item(new FabricItemSettings().group(ModItemGroup.HOWTO)));
    public static final Item SC0RE = registerItem( "sc0re", new Item(new FabricItemSettings().group(ModItemGroup.HOWTO)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(GlowSculk.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GlowSculk.LOGGER.debug("Registering Mod Items for " + GlowSculk.MOD_ID);
    }
}
