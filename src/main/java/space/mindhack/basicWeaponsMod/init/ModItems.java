package space.mindhack.basicWeaponsMod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import space.mindhack.basicWeaponsMod.item.*;
import space.mindhack.basicWeaponsMod.reference.Reference;

import java.sql.Ref;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemBasicWeaponsMod magnum44 = new Item44Magnum();
    public static final ItemBasicWeaponsMod colt1911 = new ItemColt1911();
    public static final ItemBasicWeaponsMod m16 = new ItemM16();
    public static final ItemBasicWeaponsMod greaseTube = new ItemGreaseTube();
    public static final ItemBasicWeaponsMod pistolBarrel = new ItemPistolBarrel();
    public static final ItemBasicWeaponsMod pistolReceiver = new ItemPistolReceiver();
    public static final ItemBasicWeaponsMod revolverReceiver = new ItemRevolverReceiver();
    public static final ItemBasicWeaponsMod rifleBarrel = new ItemRifleBarrel();
    public static final ItemBasicWeaponsMod rifleReceiver = new ItemRifleReceiver();
    public static final ItemBasicWeaponsMod rifleScope20 = new ItemRifleScope20();
    public static final ItemBasicWeaponsMod rifleScope34 = new ItemRifleScope34();
    public static final ItemBasicWeaponsMod rifleScope40 = new ItemRifleScope40();
    public static final ItemBasicWeaponsMod rifleStock = new ItemRifleStock();

    public static void init() {
        GameRegistry.registerItem(magnum44, "44magnum");
        GameRegistry.registerItem(colt1911, "colt1911");
        GameRegistry.registerItem(greaseTube, "greaseTube");
        GameRegistry.registerItem(m16, "m16");
        GameRegistry.registerItem(pistolBarrel, "pistolBarrel");
        GameRegistry.registerItem(pistolReceiver, "pistolReceiver");
        GameRegistry.registerItem(revolverReceiver, "revolverReceiver");
        GameRegistry.registerItem(rifleBarrel, "rifleBarrel");
        GameRegistry.registerItem(rifleReceiver, "rifleReceiver");
        GameRegistry.registerItem(rifleScope20, "rifleScope20");
        GameRegistry.registerItem(rifleScope34, "rifleScope34");
        GameRegistry.registerItem(rifleScope40, "rifleScope40");
        GameRegistry.registerItem(rifleStock, "rifleStock");
    }
}
