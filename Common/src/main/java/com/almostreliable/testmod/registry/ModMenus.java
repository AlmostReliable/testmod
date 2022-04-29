package com.almostreliable.testmod.registry;

import com.almostreliable.lib.registry.RegistryEntry;
import com.almostreliable.testmod.TestMenu;
import com.almostreliable.testmod.TestModCommon;
import com.almostreliable.testmod.TestScreen;
import net.minecraft.world.inventory.MenuType;

public class ModMenus {
    public static final RegistryEntry<MenuType<TestMenu>> TEST_MENU = TestModCommon.MANAGER.menu("test_menu",
            (id, inventory, buffer) -> new TestMenu(id),
            () -> TestScreen::new);
}
