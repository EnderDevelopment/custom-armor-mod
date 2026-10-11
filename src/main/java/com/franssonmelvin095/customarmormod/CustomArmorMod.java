package com.franssonmelvin095.customarmormod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomArmorMod implements ModInitializer {
    public static final String MOD_ID = "customarmormod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("CustomArmorMod has been initialized!");
    }
}