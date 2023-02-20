package com.example.mod1.datagen;

import com.example.mod1.Mod1;
import com.example.mod1.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutItemTags extends ItemTagsProvider {
    public TutItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super (generator, blockTags, Mod1.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.STONE)
                .add(Registration.SPEED_BLOCK_ITEM.get());
    }

    @Override
    public String getName() { return "Workshop Tags"; }
}
