package space.mindhack.basicWeaponsMod.creativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import space.mindhack.basicWeaponsMod.init.ModItems;
import space.mindhack.basicWeaponsMod.reference.Reference;

public class CreativeTabBasicWeaponsMod {
    public static final CreativeTabs BWM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.m16;
        }
    };
}
