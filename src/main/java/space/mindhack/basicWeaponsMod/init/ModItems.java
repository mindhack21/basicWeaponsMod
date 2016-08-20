package space.mindhack.basicWeaponsMod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import space.mindhack.basicWeaponsMod.item.*;
import space.mindhack.basicWeaponsMod.reference.Names;
import space.mindhack.basicWeaponsMod.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    // Guns
    public static final ItemBasicWeaponsMod gunColt1911 = new ItemGunColt1911();
    public static final ItemBasicWeaponsMod gunM4A1 = new ItemGunM4A1();

    // Crafting components
    public static final ItemBasicWeaponsMod ingotGraphite = new ItemIngotGraphite();
    public static final ItemBasicWeaponsMod tubeGraphite = new ItemTubeGraphite();
    public static final ItemBasicWeaponsMod lens = new ItemLens();

    public static final ItemBasicWeaponsMod magazine45ACP = new ItemMagazine45ACP();
    public static final ItemBasicWeaponsMod magazineSTANAG = new ItemMagazineSTANAG();

    public static final ItemBasicWeaponsMod barrelPistol = new ItemBarrelPistol();
    public static final ItemBasicWeaponsMod receiverPistol = new ItemReceiverPistol();
    public static final ItemBasicWeaponsMod barrelRifle = new ItemBarrelRifle();
    public static final ItemBasicWeaponsMod receiverRifle = new ItemReceiverRifle();
    public static final ItemBasicWeaponsMod scope20 = new ItemScope2();
    public static final ItemBasicWeaponsMod scope40 = new ItemScope4();
    public static final ItemBasicWeaponsMod scope120 = new ItemScope12();
    public static final ItemBasicWeaponsMod stockRifle = new ItemStockRifle();

    public static void init() {
        GameRegistry.registerItem(gunColt1911, Names.Items.GUN_COLT_1911);
        GameRegistry.registerItem(gunM4A1, Names.Items.GUN_M4A1);
        GameRegistry.registerItem(ingotGraphite, Names.Items.INGOT_GRAPHITE);
        GameRegistry.registerItem(tubeGraphite, Names.Items.TUBE_GRAPHITE);
        OreDictionary.registerOre(Names.Items.INGOT_GRAPHITE, ingotGraphite);
        GameRegistry.registerItem(lens, Names.Items.LENS);
        GameRegistry.registerItem(magazine45ACP, Names.Items.MAGAZINE_45_ACP);
        GameRegistry.registerItem(magazineSTANAG, Names.Items.MAGAZINE_STANAG);
        GameRegistry.registerItem(barrelPistol, Names.Items.BARREL_PISTOL);
        GameRegistry.registerItem(receiverPistol, Names.Items.RECEIVER_PISTOL);
        GameRegistry.registerItem(barrelRifle, Names.Items.BARREL_RIFLE);
        GameRegistry.registerItem(receiverRifle, Names.Items.RECEIVER_RIFLE);
        GameRegistry.registerItem(scope20, Names.Items.SCOPE_2);
        GameRegistry.registerItem(scope40, Names.Items.SCOPE_4);
        GameRegistry.registerItem(scope120, Names.Items.SCOPE_12);
        GameRegistry.registerItem(stockRifle, Names.Items.STOCK_RIFLE);
    }
}
