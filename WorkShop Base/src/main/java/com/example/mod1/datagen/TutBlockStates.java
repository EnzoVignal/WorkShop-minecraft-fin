package com.example.mod1.datagen;

import com.example.mod1.Mod1;
import com.example.mod1.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutBlockStates extends BlockStateProvider {

    public TutBlockStates(DataGenerator gen, ExistingFileHelper helper) {super(gen, Mod1.MODID, helper);}

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.SPEED_BLOCK.get());
    }
}
