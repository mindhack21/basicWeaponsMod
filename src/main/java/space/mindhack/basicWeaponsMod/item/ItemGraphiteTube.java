package space.mindhack.basicWeaponsMod.item;

public class ItemGraphiteTube extends ItemBasicWeaponsMod {
    public ItemGraphiteTube() {
        super();
        this.setUnlocalizedName("graphiteTube");
        this.maxStackSize = 1;
        // Damage value for how much of the grease is used
        this.setMaxDamage(10);
        this.setNoRepair();
    }
}
