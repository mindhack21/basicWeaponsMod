package space.mindhack.basicWeaponsMod.handler;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import space.mindhack.basicWeaponsMod.reference.Reference;
import space.mindhack.basicWeaponsMod.utility.LogHelper;

import java.io.File;

public class ConfigurationHandler {
    public static Configuration configuration;
    //public static String reloadKey;

    public static void init(File configFile) {
        // Create configuration object from given config file
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            // Resync config

        }
    }

    private static void loadConfiguration() {
        //reloadKey = configuration.getString("reloadKey", "controls", "r", "Reload gun");

        LogHelper.info("Configuration loaded!");

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }
}
