package com.almostreliable.testmod;

import com.almostreliable.testmod.gametests.TestModGametests;
import net.minecraftforge.event.RegisterGameTestsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod(TestModCommon.MOD_ID)
public class TestModForge {
    public TestModForge() {
        TestModCommon.MANAGER.registerManager();
        TestModCommon.MANAGER.registerClientManager();

        var eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener((RegisterGameTestsEvent event) -> {
            TestModGametests.init();
        });
    }
}
