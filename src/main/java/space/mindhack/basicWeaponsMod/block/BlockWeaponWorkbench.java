package space.mindhack.basicWeaponsMod.block;

import net.minecraft.block.material.Material;

public class BlockWeaponWorkbench extends BlockBasicWeaponsMod {
    public BlockWeaponWorkbench() {
        super(Material.wood);
        this.setBlockName("weaponWorkbench");
        this.setBlockTextureName("weaponWorkbench");
        //this.setStepSound();
    }
}
