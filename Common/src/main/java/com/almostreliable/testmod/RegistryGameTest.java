package com.almostreliable.testmod;

import com.almostreliable.lib.AlmostLib;
import com.almostreliable.lib.gametest.AlmostGameTest;
import com.almostreliable.lib.registry.RegistryEntry;
import com.almostreliable.testmod.registry.ModBlockEntities;
import com.almostreliable.testmod.registry.ModBlocks;
import com.almostreliable.testmod.registry.ModItems;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestHelper;

@AlmostGameTest(AlmostLib.MOD_ID)
public class RegistryGameTest {

    public static final String EMPTY_STRUCTURE = "almostlib:empty_structure";

    @GameTest(template = EMPTY_STRUCTURE)
    public void dummyItemPresent(GameTestHelper helper) {
        ifPresentCheck(helper, ModItems.DUMMY_ITEM);
    }

    @GameTest(template = EMPTY_STRUCTURE)
    public void dummySwordPresent(GameTestHelper helper) {
        ifPresentCheck(helper, ModItems.DUMMY_SWORD);
    }

    @GameTest(template = EMPTY_STRUCTURE)
    public void dummyBlockPresent(GameTestHelper helper) {
        ifPresentCheck(helper, ModBlocks.TEST_BLOCK);
    }

    @GameTest(template = EMPTY_STRUCTURE)
    public void dummyBlockLinkPresent(GameTestHelper helper) {
        ifPresentCheck(helper, ModItems.TEST_BLOCK_ITEM);
    }

    @GameTest(template = EMPTY_STRUCTURE)
    public void dummyEntityPresent(GameTestHelper helper) {
        ifPresentCheck(helper, ModBlockEntities.TEST_BLOCK_ENTITY);
    }

    private void ifPresentCheck(GameTestHelper helper, RegistryEntry<?> registryEntry) {
        if (registryEntry.isPresent()) {
            helper.succeed();
        } else {
            helper.fail("Failed as " + registryEntry.getRegistryName() + " is not present");
        }
    }
}
