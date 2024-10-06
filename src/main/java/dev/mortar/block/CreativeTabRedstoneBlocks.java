package dev.mortar.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroups;

public class CreativeTabRedstoneBlocks {

  public static void init() {

    ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> entries.addAfter(Blocks.STONE_BUTTON, ModBlocks.COBBLESTONE_BUTTON));
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> entries.addAfter(ModBlocks.COBBLESTONE_BUTTON, ModBlocks.MOSSY_COBBLESTONE_BUTTON));
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> entries.addAfter(ModBlocks.MOSSY_COBBLESTONE_BUTTON, ModBlocks.SMOOTH_STONE_BUTTON));

    ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> entries.addAfter(Blocks.STONE_PRESSURE_PLATE, ModBlocks.COBBLESTONE_PRESSURE_PLATE));
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> entries.addAfter(ModBlocks.COBBLESTONE_PRESSURE_PLATE, ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE));
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> entries.addAfter(ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE, ModBlocks.SMOOTH_STONE_PRESSURE_PLATE));
  }
}
