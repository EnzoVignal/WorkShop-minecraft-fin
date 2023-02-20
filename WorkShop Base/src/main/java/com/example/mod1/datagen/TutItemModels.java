package com.example.mod1.datagen;

import com.example.mod1.Mod1;
import com.example.mod1.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutItemModels extends ItemModelProvider {
    public TutItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Mod1.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Registration.SPEED_BLOCK_ITEM.get().getRegistryName().getPath(), modLoc("block/speed_block"));
    }
}
