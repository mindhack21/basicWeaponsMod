package space.mindhack.basicWeaponsMod.item;

import space.mindhack.basicWeaponsMod.init.ModItems;
import space.mindhack.basicWeaponsMod.reference.Names;
import space.mindhack.basicWeaponsMod.reference.Sounds;

public class ItemGun44Magnum extends ItemGun {
    public ItemGun44Magnum() {
        super(ModItems.gun44Magnum, Sounds.GUN_44_MAGNUM, 6);
        this.setUnlocalizedName(Names.Items.GUN_44_MAGNUM);
    }
}
