package space.mindhack.basicWeaponsMod.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import space.mindhack.basicWeaponsMod.item.ItemBasicWeaponsMod;

public class TileEntityBasicWeaponsMod extends TileEntity {

    private ItemStack[] inventory;
    private String customName;

    /*public TileEntityBasicWeaponsMod() {
        this.inventory = new ItemStack[this.getSizeInventory()];
    }

    public String getCustomName() {
        return this.customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    @Override
    public void closeInventory() {

    }

    @Override
    public ItemStack getStackInSlot(int slot) {

    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer entityPlayer) {

    }

    @Override
    public void  update() {

    }*/
}
