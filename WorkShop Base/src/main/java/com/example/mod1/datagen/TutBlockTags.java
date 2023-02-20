package com.example.mod1.datagen;

import com.example.mod1.Mod1;
import com.example.mod1.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutBlockTags extends BlockTagsProvider {
    public TutBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, Mod1.MODID, helper);
    }

    @Override
    protected void addTags(){
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.SPEED_BLOCK.get());
    }

    @Override
    public String getName() { return "Workshop Tags"; }
}
