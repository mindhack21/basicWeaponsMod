package space.mindhack.basicWeaponsMod.item;

import net.minecraft.item.ItemStack;
import space.mindhack.basicWeaponsMod.init.ModItems;
import space.mindhack.basicWeaponsMod.reference.Names;

public class ItemTubeGraphite extends ItemBasicWeaponsMod {
    private ItemStack emptyItem;
    private static int maxDamage = 5;

    public ItemTubeGraphite() {
        super();
        this.setUnlocalizedName(Names.Items.TUBE_GRAPHITE);
        this.maxStackSize = 1;
        // Damage value for how much of the grease is used
        this.setMaxDamage(maxDamage);
        this.setNoRepair();
    }

    @Override
    public boolean hasContainerItem() {
        return true;
    }

    public void setEmptyItem(ItemStack itemStack) {
        this.emptyItem = itemStack;
    }

    public boolean doesContainerItemLeaveCraftingGrid(ItemStack par1ItemStack) {
        return false;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        int dmg = itemStack.getItemDamage();
        if (dmg == this.maxDamage) {
            return new ItemStack(ModItems.tubeGraphite, 0, this.maxDamage);
        } else {
            ItemStack tr = copyStack(itemStack, 1);
            tr.setItemDamage(dmg + 1);
            return tr;
        }
    }

    public static ItemStack copyStack(ItemStack itemStack, int n) {
        return new ItemStack(ModItems.tubeGraphite, n, itemStack.getItemDamage());
    }
}
