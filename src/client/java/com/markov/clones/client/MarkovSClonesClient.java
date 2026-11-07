package com.markov.clones.client;

import net.fabricmc.api.ClientModInitializer;

public class MarkovsSClonesClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        System.out.println("Markov's Clones: client loaded!");
    }
}
