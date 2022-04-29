package com.almostreliable.testmod;

import com.almostreliable.lib.AlmostLib;
import com.almostreliable.lib.registry.AlmostManager;
import com.almostreliable.testmod.registry.ModBlockEntities;
import com.almostreliable.testmod.registry.ModBlocks;
import com.almostreliable.testmod.registry.ModItems;
import com.almostreliable.testmod.registry.ModMenus;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

@SuppressWarnings("InstantiationOfUtilityClass")
public class TestModCommon {
    public static final String MOD_ID = "almosttest";

    public static final AlmostManager MANAGER = AlmostLib.INSTANCE.createManager(MOD_ID);

    public static final CreativeModeTab TAB = MANAGER.tab("Testmod Items", () -> new ItemStack(Blocks.ANVIL));

    public static final TagKey<Item> TEST_TAG = AlmostLib.INSTANCE.createItemTag("dusts/coal");

    static {
        new ModBlocks();
        new ModItems();
        new ModMenus();
        new ModBlockEntities();
    }
}
