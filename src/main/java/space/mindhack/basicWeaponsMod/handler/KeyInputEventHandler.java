package space.mindhack.basicWeaponsMod.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import space.mindhack.basicWeaponsMod.client.settings.Keybindings;
import space.mindhack.basicWeaponsMod.reference.Key;

public class KeyInputEventHandler {
    private static Key getPressedKeybinding() {
        if (Keybindings.reload.isPressed()) {
            return Key.RELOAD;
        }
        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event) {

    }
}
