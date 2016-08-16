package space.mindhack.basicWeaponsMod.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static void init(File configFile) {
        // Create configuration object from given config file
        Configuration configuration = new Configuration(configFile);
        try {
            // Load the configuration file
            configuration.load();

            // Read in properties from file
            /* boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", false, "This is an example config value").getBoolean(false); */
            String reloadKey = configuration.get("controls", "reloadKey", "r", "Reload gun").getString();
        }
        catch (Exception e) {
            // Log the exception
        }
        finally {
            // Save the configuration file
            configuration.save();
        }
    }
}
