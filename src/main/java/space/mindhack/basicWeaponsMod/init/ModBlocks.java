package space.mindhack.basicWeaponsMod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import space.mindhack.basicWeaponsMod.block.BlockBasicWeaponsMod;
import space.mindhack.basicWeaponsMod.block.BlockWeaponWorkbench;
import space.mindhack.basicWeaponsMod.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockBasicWeaponsMod weaponWorkbench = new BlockWeaponWorkbench();

    public static void init() {
        GameRegistry.registerBlock(weaponWorkbench, "weaponWorkbench");
    }
}
