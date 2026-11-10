package dev.enderdevelopment.frontier;

import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(FrontierAdventures.MOD_ID)
public final class FrontierAdventures {
    public static final String MOD_ID = "frontier_adventures";
    private static final Logger LOGGER = LoggerFactory.getLogger(FrontierAdventures.class);

    public FrontierAdventures() {
        LOGGER.info("Frontier Adventures pack guide loaded for Minecraft 1.21.1.");
    }
}
