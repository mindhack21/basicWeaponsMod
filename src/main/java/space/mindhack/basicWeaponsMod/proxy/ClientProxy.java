package space.mindhack.basicWeaponsMod.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import space.mindhack.basicWeaponsMod.client.settings.Keybindings;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerKeybindings() {
        ClientRegistry.registerKeyBinding(Keybindings.reload);
    }
}
