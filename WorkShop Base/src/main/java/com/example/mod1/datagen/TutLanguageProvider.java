package com.example.mod1.datagen;

import com.example.mod1.Mod1;
import com.example.mod1.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.example.mod1.setup.ModSetup.TAB_NAME;

public class TutLanguageProvider extends LanguageProvider {
    public TutLanguageProvider(DataGenerator gen, String locale) { super(gen, Mod1.MODID, locale);}

    @Override
    protected void addTranslations() {
        add(Registration.SPEED_BLOCK.get(), "Speedy Tek Block");
    }
}
