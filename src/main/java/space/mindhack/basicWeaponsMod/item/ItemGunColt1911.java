package space.mindhack.basicWeaponsMod.item;

import space.mindhack.basicWeaponsMod.init.ModItems;
import space.mindhack.basicWeaponsMod.reference.Names;
import space.mindhack.basicWeaponsMod.reference.Sounds;

public class ItemGunColt1911 extends ItemGun {
    public ItemGunColt1911() {
        super(ModItems.gunColt1911, Sounds.GUN_M4A1, 7);
        this.setUnlocalizedName(Names.Items.GUN_COLT_1911);
    }
}
