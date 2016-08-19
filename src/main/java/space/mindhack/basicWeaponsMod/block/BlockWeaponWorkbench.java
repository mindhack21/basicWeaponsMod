package space.mindhack.basicWeaponsMod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import space.mindhack.basicWeaponsMod.reference.Names;
import space.mindhack.basicWeaponsMod.reference.Reference;

public class BlockWeaponWorkbench extends BlockBasicWeaponsMod {
    @SideOnly(Side.CLIENT)
    private IIcon topTexture;
    @SideOnly(Side.CLIENT)
    private IIcon frontTexture;

    public BlockWeaponWorkbench() {
        super(Material.iron);
        this.setBlockName(Names.Blocks.WEAPON_WORKBENCH);
        this.setBlockTextureName(Reference.RESOURCE_PREFIX + Names.Blocks.WEAPON_WORKBENCH + "Side");
        this.setHardness(3.0F);
        //this.setStepSound(soundTypePiston);
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        return side == 1 ? this.topTexture : (side == 0 ? Blocks.planks.getBlockTextureFromSide(side) : (side != 2 && side != 4 ? this.blockIcon : this.frontTexture));
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon(this.getTextureName() + "Side");
        this.topTexture = iconRegister.registerIcon(this.getTextureName() + "Top");
        this.frontTexture = iconRegister.registerIcon(this.getTextureName() + "Front");
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World world, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer entityPlayer, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
        if (world.isRemote)
        {
            return true;
        }
        else
        {
            //entityPlayer.displayGUIWorkbench(p_149727_2_, p_149727_3_, p_149727_4_);
            return true;
        }
    }
}
