package space.mindhack.basicWeaponsMod.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import space.mindhack.basicWeaponsMod.init.ModItems;
import space.mindhack.basicWeaponsMod.reference.Names;
import space.mindhack.basicWeaponsMod.reference.Sounds;
import space.mindhack.basicWeaponsMod.utility.NBTUtils;

import java.util.List;

public class ItemGunM4A1 extends ItemGun {
    public ItemGunM4A1() {
        super(ModItems.gunM4A1, Sounds.GUN_M4A1, 30);
        this.setUnlocalizedName(Names.Items.GUN_M4A1);
    }

    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean par4) {
        String scope = NBTUtils.getString(itemStack, "scope");
        if (!scope.equals("null")) {
            list.add(scope);
        }
    }
}
