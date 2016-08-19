package space.mindhack.basicWeaponsMod.client.settings;

import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;
import space.mindhack.basicWeaponsMod.reference.Names;

public class Keybindings {
    public static KeyBinding reload = new KeyBinding(Names.Keys.RELOAD, Keyboard.KEY_R, Names.Keys.CATEGORY);
}
