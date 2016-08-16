package space.mindhack.basicWeaponsMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import space.mindhack.basicWeaponsMod.configuration.ConfigurationHandler;
import space.mindhack.basicWeaponsMod.proxy.IProxy;
import space.mindhack.basicWeaponsMod.reference.Reference;
import space.mindhack.basicWeaponsMod.utility.LogHelper;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class basicWeaponsMod {

    @Mod.Instance(Reference.MOD_ID)
    public static basicWeaponsMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        /* Load network handling, network configuration, init items/blocks */
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        LogHelper.info("Configuration loaded!");
        LogHelper.info("Pre-Initialization complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        /* Load GUIs, tile entities, crafting recipes */

        LogHelper.info("Initialization complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        /* Wrap things up after other mods have initialized */

        LogHelper.info("Post-Initialization complete!");
    }
}
