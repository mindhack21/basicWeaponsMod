package space.mindhack.basicWeaponsMod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import space.mindhack.basicWeaponsMod.item.*;

public class ModItems {
    public static final ItemBWM m16 = new ItemM16();
    public static final ItemBWM colt = new ItemColt1911();
    public static final ItemBWM magnum = new Item44Magnum();
    public static final ItemBWM pistolBarrel = new ItemPistolBarrel();
    public static final ItemBWM rifleBarrel = new ItemRifleBarrel();
    public static final ItemBWM pistolReceiver = new ItemPistolReceiver();
    public static final ItemBWM rifleReceiver = new ItemRifleReceiver();
    public static final ItemBWM revolverReceiver = new ItemRevolverReceiver();
    public static final ItemBWM rifleStock = new ItemRifleStock();
    public static final ItemBWM rifleScope = new ItemRifleScope();
    public static final ItemBWM greaseTube = new ItemGreaseTube();

    public static void init() {
        GameRegistry.registerItem(m16, "m16");
        GameRegistry.registerItem(colt, "colt1911");
        GameRegistry.registerItem(magnum, "44magnum");
        GameRegistry.registerItem(pistolBarrel, "pistolBarrel");
        GameRegistry.registerItem(rifleBarrel, "rifleBarrel");
        GameRegistry.registerItem(pistolReceiver, "pistolReceiver");
        GameRegistry.registerItem(rifleReceiver, "rifleReceiver");
        GameRegistry.registerItem(revolverReceiver, "revolverReceiver");
        GameRegistry.registerItem(rifleStock, "rifleStock");
        GameRegistry.registerItem(rifleScope, "rifleScope");
        GameRegistry.registerItem(greaseTube, "greaseTube");
    }
}
