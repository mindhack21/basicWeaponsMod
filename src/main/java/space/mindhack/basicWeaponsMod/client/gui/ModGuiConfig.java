package space.mindhack.basicWeaponsMod.client.gui;

import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import space.mindhack.basicWeaponsMod.handler.ConfigurationHandler;
import space.mindhack.basicWeaponsMod.reference.Reference;

import java.util.List;

public class ModGuiConfig extends GuiConfig {
    public ModGuiConfig(GuiScreen guiScreen) {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory("controls")).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
