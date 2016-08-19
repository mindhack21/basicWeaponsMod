package space.mindhack.basicWeaponsMod.block;

import net.minecraft.block.material.Material;
import space.mindhack.basicWeaponsMod.reference.Names;
import space.mindhack.basicWeaponsMod.reference.Reference;

public class BlockGraphite extends BlockBasicWeaponsMod {
    public BlockGraphite() {
        super(Material.iron);
        this.setBlockName(Names.Blocks.BLOCK_GRAPHITE);
        this.setBlockTextureName(Reference.RESOURCE_PREFIX + Names.Blocks.BLOCK_GRAPHITE );
        this.setHardness(3.0F);
    }
}
