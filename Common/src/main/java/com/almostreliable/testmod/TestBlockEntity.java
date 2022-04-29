package com.almostreliable.testmod;

import com.almostreliable.testmod.registry.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class TestBlockEntity extends BlockEntity {
    public TestBlockEntity(BlockPos $$1, BlockState $$2) {
        super(ModBlockEntities.TEST_BLOCK_ENTITY.get(), $$1, $$2);
    }
}
