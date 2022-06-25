package net.vile.glowsculk;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;
import net.vile.glowsculk.block.ModBlocks;
import net.vile.glowsculk.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlowSculk implements ModInitializer {
	public static final String MOD_ID = "glowsculk";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	private static final Identifier SQUID_LOOT_TABLE_ID = EntityType.GLOW_SQUID.getLootTableId();

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		LootTableEvents.MODIFY.register(((resourceManager, lootManager, id, tableBuilder, source) -> {
			if (source.isBuiltin() && SQUID_LOOT_TABLE_ID.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.builder()
						.with(ItemEntry.builder(ModBlocks.GLOW_WOOL_BLOCK));

				tableBuilder.pool(poolBuilder);
			}
		}));

	}
}
