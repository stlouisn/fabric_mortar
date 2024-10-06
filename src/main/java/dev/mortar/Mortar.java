package dev.mortar;

import dev.mortar.block.CreativeTabRedstoneBlocks;
import dev.mortar.block.ModBlocks;
import dev.mortar.utils.CreativeTabOverride;
import dev.mortar.utils.ModConstants;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mortar implements ModInitializer {

  @SuppressWarnings("unused")
  public static final Logger LOGGER = LoggerFactory.getLogger(ModConstants.MOD_ID);

  @Override
  public void onInitialize() {
    CreativeTabOverride.register();
    ModBlocks.register();
    CreativeTabRedstoneBlocks.init();
  }
}