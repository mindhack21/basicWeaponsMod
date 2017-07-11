package space.mindhack.basicWeaponsMod.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import space.mindhack.basicWeaponsMod.entity.EntityBullet;
import space.mindhack.basicWeaponsMod.init.ModItems;
import space.mindhack.basicWeaponsMod.reference.Reference;
import space.mindhack.basicWeaponsMod.utility.LogHelper;

public class ItemGun extends ItemBasicWeaponsMod {
    private int ammoCount;
    private String fireSound;

    public ItemGun(String soundPath, int ammo) {
        super();
        this.maxStackSize = 1;
        this.bFull3D = true;
        this.fireSound = soundPath;
        this.ammoCount = ammo;
        this.setMaxDamage(this.ammoCount);
        this.setNoRepair();
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        if (!world.isRemote) {
            if (this.getDamage(itemStack) < this.ammoCount-1) {
                // Spawn EntityBullet
                world.spawnEntityInWorld(new EntityBullet(world, entityPlayer));
                // Play firing sound
                // FIXME Gun sounds
                //world.playSoundAtEntity(entityPlayer, Reference.RESOURCE_PREFIX + this.fireSound, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
                // FIXME Gun ammunition metadata
                int dmg = itemStack.getItemDamage();
                itemStack.setItemDamage(dmg + 1);
            } else {
                // Play empty clicking sound
            }
        }

        return itemStack;
    }

    /*
    *   Called when reload gun keybind is pressed Args: ItemStack, World, EntityPlayer
    */
    public void onReloadKeybinding(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        if (itemStack.getItemDamage() == ammoCount) {
            entityPlayer.inventory.consumeInventoryItem(ModItems.magazineSTANAG);
            // Get list of magazineSTANAG items in player's inventory
            // Damage item until "magazine" is "empty" then move to next item
        }
    }
}
