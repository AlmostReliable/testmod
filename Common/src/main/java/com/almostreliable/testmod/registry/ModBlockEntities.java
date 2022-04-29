package com.almostreliable.testmod.registry;

import com.almostreliable.lib.registry.RegistryEntry;
import com.almostreliable.testmod.TestBlockEntity;
import com.almostreliable.testmod.TestBlockEntityRenderer;
import com.almostreliable.testmod.TestModCommon;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ModBlockEntities {
    public static final RegistryEntry<BlockEntityType<TestBlockEntity>> TEST_BLOCK_ENTITY = TestModCommon.MANAGER
            .blockEntity("test_block_entity", TestBlockEntity::new)
            .blocks(block -> block == ModBlocks.TEST_BLOCK.get())
            .renderer(() -> TestBlockEntityRenderer::new)
            .register();
}
