package space.mindhack.basicWeaponsMod.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import space.mindhack.basicWeaponsMod.entity.EntityBullet;
import space.mindhack.basicWeaponsMod.init.ModItems;
import space.mindhack.basicWeaponsMod.utility.LogHelper;

public class ItemGun extends ItemBasicWeaponsMod {
    private int ammoCount;
    private String fireSound;

    public ItemGun(Item item, String soundPath, int ammo) {
        super();
        this.maxStackSize = 1;
        this.bFull3D = true;
        this.fireSound = "sounds." + soundPath;
        this.ammoCount = ammo;
        this.setMaxDamage(this.ammoCount);
        this.setNoRepair();
    }

    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        if (!world.isRemote) {
            if (this.getDamage(itemStack) < this.ammoCount-1) {
                // Spawn EntityBullet
                world.spawnEntityInWorld(new EntityBullet(world, entityPlayer));
                // Play firing sound
                //world.playSoundAtEntity(entityPlayer, fireSound, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
                 itemStack.damageItem(1, entityPlayer);
            } else {
                // Play empty clicking sound
            }
        }

        return itemStack;
    }
}
