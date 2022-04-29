package com.almostreliable.testmod.registry;

import com.almostreliable.lib.registry.RegistryEntry;
import com.almostreliable.testmod.TestBlock;
import com.almostreliable.testmod.TestModCommon;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.material.Material;

public class ModBlocks {
    public static final RegistryEntry<TestBlock> TEST_BLOCK = TestModCommon.MANAGER
            .block("test_block", Material.BAMBOO, TestBlock::new)
            .strength(2)
            .blockstate((entry, provider) -> {
                ResourceLocation location = ModelTemplates.CUBE_ALL.create(entry.get(),
                        TextureMapping.cube(entry.get()),
                        provider.getModelConsumer());
                MultiVariantGenerator generator = MultiVariantGenerator.multiVariant(entry.get(),
                        Variant.variant().with(VariantProperties.MODEL, location));
                provider.addBlockState(generator);
            })
            .dropSelf()
            .tab(TestModCommon.TAB)
            .itemTags(ItemTags.CANDLES)
            .defaultLang()
            .register();
}
