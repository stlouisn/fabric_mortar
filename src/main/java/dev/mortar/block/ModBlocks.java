package dev.mortar.block;

import dev.mortar.utils.ModConstants;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.Blocks;
import net.minecraft.block.ButtonBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings({"unused", "DanglingJavadoc"})
public class ModBlocks {

/** BLOCK SETTINGS **/

  /** Stone **/
  public static final Block STONE_WALL = registerWallBlock("stone_wall", Blocks.STONE, Blocks.STONE_SLAB, null);

  /** Cobblestone **/
  public static final Block COBBLESTONE_PRESSURE_PLATE = registerPressurePlateBlock("cobblestone_pressure_plate", BlockSetType.STONE, Blocks.COBBLESTONE, Blocks.COBBLESTONE_WALL,null);
  public static final Block COBBLESTONE_BUTTON = registerStoneButtonBlock("cobblestone_button", BlockSetType.STONE, Blocks.COBBLESTONE, ModBlocks.COBBLESTONE_PRESSURE_PLATE,null);

  /** Mossy Cobblestone **/
  public static final Block MOSSY_COBBLESTONE_PRESSURE_PLATE = registerPressurePlateBlock("mossy_cobblestone_pressure_plate", BlockSetType.STONE, Blocks.MOSSY_COBBLESTONE, Blocks.MOSSY_COBBLESTONE_WALL,null);
  public static final Block MOSSY_COBBLESTONE_BUTTON = registerStoneButtonBlock("mossy_cobblestone_button", BlockSetType.STONE, Blocks.MOSSY_COBBLESTONE, ModBlocks.MOSSY_COBBLESTONE_PRESSURE_PLATE,null);

  /** Smooth Stone **/
  public static final Block SMOOTH_STONE_STAIRS = registerStairsBlock("smooth_stone_stairs", Blocks.SMOOTH_STONE, Blocks.SMOOTH_STONE, null);
  public static final Block SMOOTH_STONE_WALL = registerWallBlock("smooth_stone_wall", Blocks.SMOOTH_STONE, Blocks.SMOOTH_STONE_SLAB, null);
  public static final Block SMOOTH_STONE_PRESSURE_PLATE = registerPressurePlateBlock("smooth_stone_pressure_plate", BlockSetType.STONE, Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_WALL,null);
  public static final Block SMOOTH_STONE_BUTTON = registerStoneButtonBlock("smooth_stone_button", BlockSetType.STONE, Blocks.SMOOTH_STONE, ModBlocks.SMOOTH_STONE_PRESSURE_PLATE,null);

  /** Stone Bricks **/

  /** Mossy Stone Bricks **/
  public static final Block MOSSY_CHISELED_STONE_BRICKS = registerSimpleBlock("mossy_chiseled_stone_bricks", Blocks.CHISELED_STONE_BRICKS, Blocks.MOSSY_STONE_BRICK_WALL, null);
  public static final Block MOSSY_CRACKED_STONE_BRICKS = registerSimpleBlock("mossy_cracked_stone_bricks", Blocks.CRACKED_STONE_BRICKS, ModBlocks.MOSSY_CHISELED_STONE_BRICKS, null);

  /** Granite **/
  public static final Block POLISHED_GRANITE_WALL = registerWallBlock("polished_granite_wall", Blocks.POLISHED_GRANITE, Blocks.POLISHED_GRANITE_SLAB, null);
  public static final Block GRANITE_BRICKS = registerSimpleBlock("granite_bricks", Blocks.GRANITE, ModBlocks.POLISHED_GRANITE_WALL, null);
  public static final Block GRANITE_BRICK_STAIRS = registerStairsBlock("granite_brick_stairs", Blocks.GRANITE, ModBlocks.GRANITE_BRICKS, null);
  public static final Block GRANITE_BRICK_SLAB = registerSlabBlock("granite_brick_slab", Blocks.GRANITE, ModBlocks.GRANITE_BRICK_STAIRS, null);
  public static final Block GRANITE_BRICK_WALL = registerWallBlock("granite_brick_wall", Blocks.GRANITE, ModBlocks.GRANITE_BRICK_SLAB, null);

  /** Diorite **/
  public static final Block POLISHED_DIORITE_WALL = registerWallBlock("polished_diorite_wall", Blocks.POLISHED_DIORITE, Blocks.POLISHED_DIORITE_SLAB, null);
  public static final Block DIORITE_BRICKS = registerSimpleBlock("diorite_bricks", Blocks.DIORITE, ModBlocks.POLISHED_DIORITE_WALL, null);
  public static final Block DIORITE_BRICK_STAIRS = registerStairsBlock("diorite_brick_stairs", Blocks.DIORITE, ModBlocks.DIORITE_BRICKS, null);
  public static final Block DIORITE_BRICK_SLAB = registerSlabBlock("diorite_brick_slab", Blocks.DIORITE, ModBlocks.DIORITE_BRICK_STAIRS, null);
  public static final Block DIORITE_BRICK_WALL = registerWallBlock("diorite_brick_wall", Blocks.DIORITE, ModBlocks.DIORITE_BRICK_SLAB, null);

  /** Andesite **/
  public static final Block POLISHED_ANDESITE_WALL = registerWallBlock("polished_andesite_wall", Blocks.POLISHED_ANDESITE, Blocks.POLISHED_ANDESITE_SLAB, null);
  public static final Block ANDESITE_BRICKS = registerSimpleBlock("andesite_bricks", Blocks.ANDESITE, ModBlocks.POLISHED_ANDESITE_WALL, null);
  public static final Block ANDESITE_BRICK_STAIRS = registerStairsBlock("andesite_brick_stairs", Blocks.ANDESITE, ModBlocks.ANDESITE_BRICKS, null);
  public static final Block ANDESITE_BRICK_SLAB = registerSlabBlock("andesite_brick_slab", Blocks.ANDESITE, ModBlocks.ANDESITE_BRICK_STAIRS, null);
  public static final Block ANDESITE_BRICK_WALL = registerWallBlock("andesite_brick_wall", Blocks.ANDESITE, ModBlocks.ANDESITE_BRICK_SLAB, null);

  /** Deepslate **/
  public static final Block DEEPSLATE_STAIRS = registerStairsBlock("deepslate_stairs", Blocks.DEEPSLATE, Blocks.DEEPSLATE, null);
  public static final Block DEEPSLATE_SLAB = registerSlabBlock("deepslate_slab", Blocks.DEEPSLATE, ModBlocks.DEEPSLATE_STAIRS, null);
  public static final Block DEEPSLATE_WALL = registerWallBlock("deepslate_wall", Blocks.DEEPSLATE, ModBlocks.DEEPSLATE_SLAB, null);

  /** Tuff **/

  /** Calcite **/
  public static final Block CALCITE_STAIRS = registerStairsBlock("calcite_stairs", Blocks.CALCITE, Blocks.CALCITE, null);
  public static final Block CALCITE_SLAB = registerSlabBlock("calcite_slab", Blocks.CALCITE, ModBlocks.CALCITE_STAIRS, null);
  public static final Block CALCITE_WALL = registerWallBlock("calcite_wall", Blocks.CALCITE, ModBlocks.CALCITE_SLAB, null);
  public static final Block POLISHED_CALCITE = registerSimpleBlock("polished_calcite", Blocks.CALCITE, ModBlocks.CALCITE_WALL, ModBlockSounds.POLISHED_CALCITE);
  public static final Block POLISHED_CALCITE_STAIRS = registerStairsBlock("polished_calcite_stairs", Blocks.CALCITE, ModBlocks.POLISHED_CALCITE, ModBlockSounds.POLISHED_CALCITE);
  public static final Block POLISHED_CALCITE_SLAB = registerSlabBlock("polished_calcite_slab", Blocks.CALCITE, ModBlocks.POLISHED_CALCITE_STAIRS, ModBlockSounds.POLISHED_CALCITE);
  public static final Block POLISHED_CALCITE_WALL = registerWallBlock("polished_calcite_wall", Blocks.CALCITE, ModBlocks.POLISHED_CALCITE_SLAB, ModBlockSounds.POLISHED_CALCITE);
  public static final Block CALCITE_BRICKS = registerSimpleBlock("calcite_bricks", Blocks.CALCITE, ModBlocks.POLISHED_CALCITE_WALL, null);
  public static final Block CALCITE_BRICK_STAIRS = registerStairsBlock("calcite_brick_stairs", Blocks.CALCITE, ModBlocks.CALCITE_BRICKS, null);
  public static final Block CALCITE_BRICK_SLAB = registerSlabBlock("calcite_brick_slab", Blocks.CALCITE, ModBlocks.CALCITE_BRICK_STAIRS, null);
  public static final Block CALCITE_BRICK_WALL = registerWallBlock("calcite_brick_wall", Blocks.CALCITE, ModBlocks.CALCITE_BRICK_SLAB, null);

  /** Bricks **/

  /** Mud **/

  /** Sandstone **/
  public static final Block SMOOTH_SANDSTONE_WALL = registerWallBlock("smooth_sandstone_wall", Blocks.SMOOTH_SANDSTONE, Blocks.SMOOTH_SANDSTONE_SLAB, null);
  public static final Block CUT_SANDSTONE_STAIRS = registerStairsBlock("cut_sandstone_stairs", Blocks.CUT_SANDSTONE, Blocks.CUT_SANDSTONE, null);
  public static final Block CUT_SANDSTONE_WALL = registerWallBlock("cut_sandstone_wall", Blocks.CUT_SANDSTONE, Blocks.CUT_SANDSTONE_SLAB, null);

  /** Red Sandstone **/
  public static final Block SMOOTH_RED_SANDSTONE_WALL = registerWallBlock("smooth_red_sandstone_wall", Blocks.SMOOTH_RED_SANDSTONE, Blocks.SMOOTH_RED_SANDSTONE_SLAB, null);
  public static final Block CUT_RED_SANDSTONE_STAIRS = registerStairsBlock("cut_red_sandstone_stairs", Blocks.CUT_RED_SANDSTONE, Blocks.CUT_RED_SANDSTONE, null);
  public static final Block CUT_RED_SANDSTONE_WALL = registerWallBlock("cut_red_sandstone_wall", Blocks.CUT_RED_SANDSTONE, Blocks.CUT_RED_SANDSTONE_SLAB, null);

  /** Prismarine **/
  public static final Block POLISHED_PRISMARINE = registerSimpleBlock("polished_prismarine", Blocks.PRISMARINE, Blocks.PRISMARINE_WALL, null);
  public static final Block POLISHED_PRISMARINE_STAIRS = registerStairsBlock("polished_prismarine_stairs", Blocks.PRISMARINE, ModBlocks.POLISHED_PRISMARINE, null);
  public static final Block POLISHED_PRISMARINE_SLAB = registerSlabBlock("polished_prismarine_slab", Blocks.PRISMARINE, ModBlocks.POLISHED_PRISMARINE_STAIRS, null);
  public static final Block POLISHED_PRISMARINE_WALL = registerWallBlock("polished_prismarine_wall", Blocks.PRISMARINE, ModBlocks.POLISHED_PRISMARINE_SLAB, null);
  public static final Block PRISMARINE_BRICK_WALL = registerWallBlock("prismarine_brick_wall", Blocks.PRISMARINE_BRICKS, Blocks.PRISMARINE_BRICK_SLAB, null);

  /** Dark Prismarine **/
  public static final Block DARK_PRISMARINE_WALL = registerWallBlock("dark_prismarine_wall", Blocks.DARK_PRISMARINE, Blocks.DARK_PRISMARINE_SLAB, null);


  /** End Stone **/
  public static final Block END_STONE_STAIRS = registerStairsBlock("end_stone_stairs", Blocks.END_STONE, Blocks.END_STONE, null);
  public static final Block END_STONE_SLAB = registerSlabBlock("end_stone_slab", Blocks.END_STONE, ModBlocks.END_STONE_STAIRS, null);
  public static final Block END_STONE_WALL = registerWallBlock("end_stone_wall", Blocks.END_STONE, ModBlocks.END_STONE_SLAB, null);
  public static final Block POLISHED_END_STONE = registerSimpleBlock("polished_end_stone", Blocks.END_STONE, ModBlocks.END_STONE_WALL, null);
  public static final Block POLISHED_END_STONE_STAIRS = registerStairsBlock("polished_end_stone_stairs", Blocks.END_STONE, ModBlocks.POLISHED_END_STONE, null);
  public static final Block POLISHED_END_STONE_SLAB = registerSlabBlock("polished_end_stone_slab", Blocks.END_STONE, ModBlocks.POLISHED_END_STONE_STAIRS, null);
  public static final Block POLISHED_END_STONE_WALL = registerWallBlock("polished_end_stone_wall", Blocks.END_STONE, ModBlocks.POLISHED_END_STONE_SLAB, null);

  /** Purpur **/
  public static final Block PURPUR_WALL = registerWallBlock("purpur_wall", Blocks.PURPUR_BLOCK, Blocks.PURPUR_SLAB, null);

  /** Quartz **/
  public static final Block QUARTZ_WALL = registerWallBlock("quartz_wall", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_SLAB, null);
  public static final Block SMOOTH_QUARTZ_WALL = registerWallBlock("smooth_quartz_wall", Blocks.SMOOTH_QUARTZ, Blocks.SMOOTH_QUARTZ_SLAB, null);
  public static final Block QUARTZ_BRICK_STAIRS = registerStairsBlock("quartz_brick_stairs", Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS, null);
  public static final Block QUARTZ_BRICK_SLAB = registerSlabBlock("quartz_brick_slab", Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_STAIRS, null);
  public static final Block QUARTZ_BRICK_WALL = registerWallBlock("quartz_brick_wall", Blocks.QUARTZ_BRICKS, ModBlocks.QUARTZ_BRICK_SLAB, null);

/** BLOCK-TYPE DEFINITIONS **/

  private static Block registerSimpleBlock(String name, Block copiedBlock, Block blockBefore, @Nullable BlockSoundGroup soundGroup) {
    return registerBlock(name, new Block(copiedBlock.getSettings()), blockBefore);
  }

  private static Block registerStairsBlock(String name, Block copiedBlock, Block blockBefore, @Nullable BlockSoundGroup soundGroup) {
    return registerBlock(name, new StairsBlock(copiedBlock.getDefaultState(), copiedBlock.getSettings()), blockBefore);
  }

  private static Block registerSlabBlock(String name, Block copiedBlock, Block blockBefore, @Nullable BlockSoundGroup soundGroup) {
    return registerBlock(name, new SlabBlock(copiedBlock.getSettings()), blockBefore);
  }

  private static Block registerWallBlock(String name, Block copiedBlock, Block blockBefore, @Nullable BlockSoundGroup soundGroup) {
    return registerBlock(name, new WallBlock(copiedBlock.getSettings()), blockBefore);
  }

  private static Block registerPressurePlateBlock(String name, BlockSetType blockSetType, Block copiedBlock,Block blockBefore, @Nullable BlockSoundGroup soundGroup) {
    return registerBlock(name, new PressurePlateBlock(blockSetType, copiedBlock.getSettings()), blockBefore);
  }

  private static Block registerStoneButtonBlock(String name, BlockSetType blockSetType, Block copiedBlock, Block blockBefore, @Nullable BlockSoundGroup soundGroup) {
    return registerBlock(name, new ButtonBlock(blockSetType, 20, copiedBlock.getSettings()), blockBefore);
  }

/** BLOCK REGISTRY **/

  private static Block registerBlock(String name, Block block, Block blockBefore) {
    registerBlockItem(name, block, blockBefore);
    return Registry.register(Registries.BLOCK, Identifier.of(ModConstants.MOD_ID, name), block);
  }

  private static void registerBlockItem(String name, Block block, Block blockBefore) {
    addBlockBefore(block, blockBefore);
    Registry.register(Registries.ITEM, Identifier.of(ModConstants.MOD_ID, name), new BlockItem(block, new Item.Settings()));
  }

/** CREATIVE TAB REGISTRY **/

  private static void addBlockBefore(Block block, Block blockBefore) {
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.addAfter(blockBefore, block));
  }

  public static void register() {
  }

}
