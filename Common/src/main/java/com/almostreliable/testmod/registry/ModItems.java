package com.almostreliable.testmod.registry;

import com.almostreliable.lib.registry.RegistryEntry;
import com.almostreliable.testmod.TestModCommon;
import com.almostreliable.testmod.items.ToolItems;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CompassItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class ModItems {
    public static final RegistryEntry<CompassItem> DUMMY_ITEM = TestModCommon.MANAGER
            .item("dummy_item", CompassItem::new)
            .durability(3)
            .tab(TestModCommon.TAB)
            .defaultModel()
            .register();

    public static final RegistryEntry<SwordItem> DUMMY_SWORD = TestModCommon.MANAGER
            .itemSword("dummy_sword", Tiers.GOLD, 3, 1, SwordItem::new)
            .durability(3)
            .tab(TestModCommon.TAB)
            .defaultLang()
            .defaultHandheldModel()
            .register();

    public static final RegistryEntry<ToolItems.ShovelItem> DUMMY_SHOVEL = TestModCommon.MANAGER
            .itemTool("dummy_shovel", Tiers.GOLD, 3, 1, ToolItems.ShovelItem::new)
            .defaultHandheldModel()
            .defaultLang()
            .tags(TestModCommon.TEST_TAG)
            .tab(TestModCommon.TAB)
            .register();

    public static final RegistryEntry<ToolItems.AxeItem> DUMMY_AXE = TestModCommon.MANAGER
            .itemTool("dummy_axe", Tiers.GOLD, 3, 1, ToolItems.AxeItem::new)
            .defaultHandheldModel()
            .defaultLang()
            .tab(TestModCommon.TAB)
            .register();

    public static final RegistryEntry<ToolItems.HoeItem> DUMMY_HOE = TestModCommon.MANAGER
            .itemTool("dummy_hoe", Tiers.GOLD, 3, 1, ToolItems.HoeItem::new)
            .defaultHandheldModel()
            .defaultLang()
            .tab(TestModCommon.TAB)
            .register();

    public static final RegistryEntry<ToolItems.PickaxeItem> DUMMY_PICKAXE = TestModCommon.MANAGER
            .itemTool("dummy_pickaxe", Tiers.NETHERITE, 3, 1, ToolItems.PickaxeItem::new)
            .defaultHandheldModel()
            .defaultLang()
            .tab(TestModCommon.TAB)
            .register();

    public static final RegistryEntry<BlockItem> TEST_BLOCK_ITEM = TestModCommon.MANAGER.getLink(Registry.ITEM_REGISTRY,
            ModBlocks.TEST_BLOCK);
}
