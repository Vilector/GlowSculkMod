package net.vile.glowsculk.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.vile.glowsculk.GlowSculk;
import net.vile.glowsculk.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup HOWTO = FabricItemGroupBuilder.build(
            new Identifier(GlowSculk.MOD_ID, "howto"), () -> new ItemStack(ModItems.SCULK_CRYSTAL));

}
