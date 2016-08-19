package space.mindhack.basicWeaponsMod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import space.mindhack.basicWeaponsMod.block.BlockBasicWeaponsMod;
import space.mindhack.basicWeaponsMod.block.BlockGraphite;
import space.mindhack.basicWeaponsMod.block.BlockWeaponWorkbench;
import space.mindhack.basicWeaponsMod.reference.Names;
import space.mindhack.basicWeaponsMod.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockBasicWeaponsMod weaponWorkbench = new BlockWeaponWorkbench();
    public static final BlockBasicWeaponsMod blockGraphite = new BlockGraphite();

    public static void init() {
        GameRegistry.registerBlock(weaponWorkbench, Names.Blocks.WEAPON_WORKBENCH);
        GameRegistry.registerBlock(blockGraphite, Names.Blocks.BLOCK_GRAPHITE);
        OreDictionary.registerOre(Names.Blocks.BLOCK_GRAPHITE, blockGraphite);
    }
}
