package dev.mortar.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import dev.mortar.block.ModBlocks;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.structure.OceanRuinGenerator;
import net.minecraft.structure.StructurePlacementData;
import net.minecraft.structure.processor.RuleStructureProcessor;
import net.minecraft.structure.processor.StructureProcessorRule;
import net.minecraft.structure.rule.AlwaysTruePosRuleTest;
import net.minecraft.structure.rule.AlwaysTrueRuleTest;
import net.minecraft.structure.rule.RandomBlockMatchRuleTest;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

/**
 * Adds mossy_chiseled_stone_bricks, mossy_cracked_stone_bricks, granite_bricks, and diorite_bricks to ocean ruin structures.
 */
@Mixin(OceanRuinGenerator.Piece.class)
public class OceanRuinGeneratorMixin {

  @ModifyReturnValue(method = "createPlacementData(Lnet/minecraft/util/BlockRotation;FLnet/minecraft/world/gen/structure/OceanRuinStructure$BiomeTemperature;)Lnet/minecraft/structure/StructurePlacementData;", at = @At("RETURN"))
  private static StructurePlacementData mortar$addMortarBlocksProcessor(StructurePlacementData original) {
    return original.addProcessor(new RuleStructureProcessor(List.of(
        createReplaceRule(Blocks.CHISELED_STONE_BRICKS, ModBlocks.MOSSY_CHISELED_STONE_BRICKS),
        createReplaceRule(Blocks.CRACKED_STONE_BRICKS, ModBlocks.MOSSY_CRACKED_STONE_BRICKS),
        createReplaceRule(Blocks.POLISHED_GRANITE, ModBlocks.GRANITE_BRICKS),
        createReplaceRule(Blocks.POLISHED_DIORITE, ModBlocks.DIORITE_BRICKS)
    )));
  }

  @Unique
  private static StructureProcessorRule createReplaceRule(Block in, Block out) {
    return new StructureProcessorRule(new RandomBlockMatchRuleTest(in, 0.5f), AlwaysTrueRuleTest.INSTANCE, AlwaysTruePosRuleTest.INSTANCE, out.getDefaultState());
  }
}
