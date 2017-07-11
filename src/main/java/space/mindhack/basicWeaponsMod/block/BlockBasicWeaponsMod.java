package space.mindhack.basicWeaponsMod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import space.mindhack.basicWeaponsMod.creativetab.CreativeTabBasicWeaponsMod;
import space.mindhack.basicWeaponsMod.reference.Reference;

public class BlockBasicWeaponsMod extends Block {

    public BlockBasicWeaponsMod(Material material) {
        super(material);
        this.setCreativeTab(CreativeTabBasicWeaponsMod.BWM_TAB);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(getUnwrappedUnlocalizedName(this.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
