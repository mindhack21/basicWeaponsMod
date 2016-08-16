package space.mindhack.basicWeaponsMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="basicWeaponsMod", name="Basic Weapons Mod", version="1.7.10-1.0")
public class basicWeaponsMod {
    @Mod.Instance("basicWeaponsMod")
    public static basicWeaponsMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        /* Load network handling, network configuration, init items/blocks */

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        /* Load GUIs, tile entities, crafting recipes */

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        /* Wrap things up after other mods have initialized */

    }
}
