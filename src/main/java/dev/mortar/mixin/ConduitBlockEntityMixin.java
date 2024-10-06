package dev.mortar.mixin;

import dev.mortar.block.ModBlocks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.entity.ConduitBlockEntity;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

/**
 * Adds polished_prismarine to the blocks that power conduits.
 */
@Mixin(ConduitBlockEntity.class)
public class ConduitBlockEntityMixin {

  @Shadow
  @Mutable
  @Final
  private static Block[] ACTIVATING_BLOCKS;

  static {
    List<Block> conduitBlocks = new ArrayList<>(Arrays.stream(ACTIVATING_BLOCKS).toList());
    conduitBlocks.add(ModBlocks.POLISHED_PRISMARINE);
    ACTIVATING_BLOCKS = conduitBlocks.toArray(new Block[0]);
  }
}
