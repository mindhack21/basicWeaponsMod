package space.mindhack.basicWeaponsMod.block;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import space.mindhack.basicWeaponsMod.reference.Names;
import space.mindhack.basicWeaponsMod.reference.Reference;

import java.util.List;

public class BlockWeaponWorkbench extends BlockBasicWeaponsMod {
    @SideOnly(Side.CLIENT)
    private IIcon topTexture;
    @SideOnly(Side.CLIENT)
    private IIcon frontTexture;

    public BlockWeaponWorkbench() {
        super(Material.wood);
        this.setBlockName(Names.Blocks.WEAPON_WORKBENCH);
        this.setBlockTextureName(Reference.RESOURCE_PREFIX + Names.Blocks.WEAPON_WORKBENCH);
        this.setHardness(3.0F);
        this.setStepSound(soundTypePiston);
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return side == 1 ? this.topTexture : (side == 0 ? Blocks.planks.getBlockTextureFromSide(side) : (side != 2 && side != 4 ? this.blockIcon : this.frontTexture));
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon(this.getTextureName() + "Side");
        this.topTexture = iconRegister.registerIcon(this.getTextureName() + "Top");
        this.frontTexture = iconRegister.registerIcon(this.getTextureName() + "Front");
    }

    /**
     * Called upon block activation (right click on the block.)
     */

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int metadata, float param7, float param8, float param9) // TODO Add GUI for Weapon Workbench
    {
        if (world.isRemote)
        {
            return true;
        }
        else
        {
            // Open the GUI
            return true;
        }
    }
}
