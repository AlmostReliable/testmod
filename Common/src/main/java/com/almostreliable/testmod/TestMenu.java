package com.almostreliable.testmod;

import com.almostreliable.testmod.registry.ModMenus;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;

public class TestMenu extends AbstractContainerMenu {
    public TestMenu(int id) {
        super(ModMenus.TEST_MENU.get(), id);
    }

    @Override
    public boolean stillValid(Player entity) {
        return true;
    }
}
