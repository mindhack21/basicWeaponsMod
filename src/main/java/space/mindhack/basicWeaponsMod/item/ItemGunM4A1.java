package space.mindhack.basicWeaponsMod.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import space.mindhack.basicWeaponsMod.init.ModItems;
import space.mindhack.basicWeaponsMod.reference.Names;
import space.mindhack.basicWeaponsMod.reference.Reference;
import space.mindhack.basicWeaponsMod.reference.Sounds;
import space.mindhack.basicWeaponsMod.utility.NBTUtils;

import java.util.List;

public class ItemGunM4A1 extends ItemGun {
    @SideOnly(Side.CLIENT)
    private IIcon scope1;
    @SideOnly(Side.CLIENT)
    private IIcon scope2;
    @SideOnly(Side.CLIENT)
    private IIcon scope4;

    public ItemGunM4A1() {
        super(Sounds.GUN_M4A1, 30);
        this.setUnlocalizedName(Names.Items.GUN_M4A1);
    }

    @Override
    public void registerIcons(IIconRegister iconRegister) {
        this.scope1 = iconRegister.registerIcon(Reference.RESOURCE_PREFIX + Names.Items.GUN_M4A1);
        this.itemIcon = this.scope1;
        this.scope2 = iconRegister.registerIcon(Reference.RESOURCE_PREFIX + Names.Items.GUN_M4A1 + Names.Items.SCOPE_2);
        this.scope4 = iconRegister.registerIcon(Reference.RESOURCE_PREFIX + Names.Items.GUN_M4A1 + Names.Items.SCOPE_4);
    }

    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean par4) {
        if (!NBTUtils.hasKey(itemStack, Names.NBT.GUN_SCOPE)) {
            list.add("Iron Sights"); // TODO Localize
        } else if (NBTUtils.getInteger(itemStack, Names.NBT.GUN_SCOPE) == 0) {
            list.add("Iron Sights"); // TODO Localize
        } else if (NBTUtils.getInteger(itemStack, Names.NBT.GUN_SCOPE) == 1) {
            list.add("2x Scope"); // TODO Localize
        } else if (NBTUtils.getInteger(itemStack, Names.NBT.GUN_SCOPE) == 2) {
            list.add("4x Scope"); // TODO Localize
        }
    }
}
