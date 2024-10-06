package dev.mortar.utils;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroups;

public class CreativeTabOverride {

  public static void register() {
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.addBefore(Blocks.BRICKS, Blocks.CALCITE));
  }
}
