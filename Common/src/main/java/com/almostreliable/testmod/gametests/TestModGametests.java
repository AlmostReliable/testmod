package com.almostreliable.testmod.gametests;

import com.almostreliable.testmod.RegistryGameTest;
import com.almostreliable.lib.gametest.AlmostGameTestRegistry;

public class TestModGametests {
    public static void init() {
        AlmostGameTestRegistry.register(RegistryGameTest.class);
    }
}
