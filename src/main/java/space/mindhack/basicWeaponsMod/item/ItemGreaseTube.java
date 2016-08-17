package space.mindhack.basicWeaponsMod.item;

public class ItemGreaseTube extends ItemBasicWeaponsMod {
    public ItemGreaseTube() {
        super();
        this.setUnlocalizedName("greaseTube");
        this.maxStackSize = 1;
        // Damage value for how much of the grease is used
        this.setMaxDamage(10);
        this.setNoRepair();
    }
}
