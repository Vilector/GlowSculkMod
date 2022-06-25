package net.vile.glowsculk.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vile.glowsculk.GlowSculk;
import net.vile.glowsculk.block.custom.BuddingSculkBlock;
import net.vile.glowsculk.block.custom.SculkBlock;
import net.vile.glowsculk.block.custom.SculkClusterBlock;
import net.vile.glowsculk.item.ModItemGroup;



public class ModBlocks {
    public static final Block GLOW_WOOL_BLOCK = registerBlock("glow_wool_block", new Block(FabricBlockSettings.of(Material.WOOL).luminance((state) -> { return 15;}).strength(0.8f).sounds(BlockSoundGroup.WOOL)), ModItemGroup.HOWTO);
    //public static final Block SMALL_SCULK_BUD = registerBlock("small_sculk_bud", new Block(FabricBlockSettings.of(Material.AMETHYST).strength(1.5f).sounds(BlockSoundGroup.SCULK)), ModItemGroup.HOWTO);
    //public static final Block MEDIUM_SCULK_BUD = registerBlock("medium_sculk_bud", new Block(FabricBlockSettings.of(Material.AMETHYST).strength(1.5f).sounds(BlockSoundGroup.SCULK)), ModItemGroup.HOWTO);
   // public static final Block LARGE_SCULK_BUD = registerBlock("large_sculk_bud", new Block(FabricBlockSettings.of(Material.AMETHYST).strength(1.5f).sounds(BlockSoundGroup.SCULK)), ModItemGroup.HOWTO);

    public static final Block SCULK_CLUSTER = registerBlock("sculk_cluster", new SculkClusterBlock(7, 3,
            AbstractBlock.Settings.of(Material.AMETHYST).nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5F).luminance((state) -> {return 5;
    })), ModItemGroup.HOWTO);
    public static final Block LARGE_SCULK_BUD = registerBlock("large_sculk_bud", new SculkClusterBlock(5, 3,AbstractBlock.Settings.copy(SCULK_CLUSTER).nonOpaque().sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD).luminance((state) -> {
        return 4;
    })), ModItemGroup.HOWTO);
    public static final Block MEDIUM_SCULK_BUD = registerBlock("medium_sculk_bud", new SculkClusterBlock(4, 3,AbstractBlock.Settings.copy(SCULK_CLUSTER).nonOpaque().sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).luminance((state) -> {
        return 2;
    })), ModItemGroup.HOWTO);
    public static final Block SMALL_SCULK_BUD = registerBlock("small_sculk_bud", new SculkClusterBlock(3, 4,AbstractBlock.Settings.copy(SCULK_CLUSTER).nonOpaque().sounds(BlockSoundGroup.SMALL_AMETHYST_BUD).luminance((state) -> {
        return 1;
    })), ModItemGroup.HOWTO);

    public static final Block SCULK_BLOCK = registerBlock("sculk_block", new SculkBlock(FabricBlockSettings.of(Material.SCULK).strength(1.5f).sounds(BlockSoundGroup.SCULK)), ModItemGroup.HOWTO);
    //public static final Block SCULK_CLUSTER_BLOCK = registerBlock("sculk_cluster_block", new SculkClusterBlock(2, 1, AbstractBlock.Settings.of(Material.AMETHYST).sounds(BlockSoundGroup.AMETHYST_CLUSTER).requiresTool()), ModItemGroup.HOWTO);
    public static final Block BUDDING_SCULK_BLOCK = registerBlock("budding_sculk_block", new BuddingSculkBlock(AbstractBlock.Settings.of(Material.AMETHYST).ticksRandomly().strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()), ModItemGroup.HOWTO);


    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(GlowSculk.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(GlowSculk.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks(){
        GlowSculk.LOGGER.debug("Registering ModBlocks for " + GlowSculk.MOD_ID);
    }
}
