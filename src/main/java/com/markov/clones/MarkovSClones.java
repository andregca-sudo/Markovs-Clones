package com.markov.clones;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.markov.clones.entity.ModEntityTypes;

public class MarkovSClones implements ModInitializer {
    public static final String MOD_ID = "markovs-clones";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModEntityTypes.initialize();

        LOGGER.info("Markov's Clones loaded!");
    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
