package space.mindhack.basicWeaponsMod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import space.mindhack.basicWeaponsMod.utility.NBTUtils;

public class Recipes {
    public static void init() {
        // Weapon Workbench
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.weaponWorkbench), "iii", "p p", "p p", 'i', "ingotIron", 'p',  "plankWood"));

        // Graphite Ingot
        GameRegistry.addSmelting(Items.coal, new ItemStack(ModItems.ingotGraphite), 0.1F);
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ingotGraphite, 9), "blockGraphite"));
        // Graphite Block
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockGraphite), "ggg", "ggg", "ggg", 'g', "ingotGraphite"));
        // Graphite Lubricant
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.tubeGraphite), "ingotGraphite", "ingotIron"));
        // Lens
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lens), " p ", "pgp", " p ", 'p', "paneGlass", 'g', "blockGlass"));
        // 2x Scope
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.scope20), "rl ", "ii ", "   ", 'r', "dustRedstone", 'l', new ItemStack(ModItems.lens), 'i', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.scope20), " rl", " ii", "   ", 'r', "dustRedstone", 'l', new ItemStack(ModItems.lens), 'i', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.scope20), "   ", "rl ", "ii ", 'r', "dustRedstone", 'l', new ItemStack(ModItems.lens), 'i', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.scope20), "   ", " rl", " ii", 'r', "dustRedstone", 'l', new ItemStack(ModItems.lens), 'i', "ingotIron"));
        // 4x Scope
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.scope40), " i ", "lrl", " i ", 'r', "dustRedstone", 'l', new ItemStack(ModItems.lens), 'i', "ingotIron"));
        // Rifle Barrel
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.barrelRifle), "iii", "   ", "   ", 'i', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.barrelRifle), "   ", "iii", "   ", 'i', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.barrelRifle), "   ", "   ", "iii", 'i', "ingotIron"));
        // Rifle Receiver
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.receiverRifle), " i ", "iii", "i  ", 'i', "ingotIron"));
        // Rifle Stock
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.stockRifle), "iii", "i  ", "   ", 'i', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.stockRifle), "   ", "iii", "i  ", 'i', "ingotIron"));

        // M16
        // Iron Sights
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "Iron Sights"), "srb", "g  ", "   ", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle)); // TODO Localize
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "Iron Sights"), "srb", " g ", "   ", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "Iron Sights"), "srb", "  g", "   ", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "Iron Sights"), "srb", "   ", "g  ", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "Iron Sights"), "srb", "   ", " g ", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "Iron Sights"), "srb", "   ", "  g", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "Iron Sights"), "g  ", "srb", "   ", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "Iron Sights"), " g ", "srb", "   ", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "Iron Sights"), "  g", "srb", "   ", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "Iron Sights"), "   ", "srb", "g  ", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "Iron Sights"), "   ", "srb", " g ", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "Iron Sights"), "   ", "srb", "  g", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "Iron Sights"), "g  ", "   ", "srb", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "Iron Sights"), " g ", "   ", "srb", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "Iron Sights"), "  g", "   ", "srb", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "Iron Sights"), "   ", "g  ", "srb", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "Iron Sights"), "   ", " g ", "srb", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "Iron Sights"), "   ", "  g", "srb", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        // 2x Scope
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "2.0x Scope"), "ga ", "srb", "   ", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 'a', new ItemStack(ModItems.scope20), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "2.0x Scope"), " ag", "srb", "   ", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 'a', new ItemStack(ModItems.scope20), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "2.0x Scope"), " a ", "srb", "g  ", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 'a', new ItemStack(ModItems.scope20), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "2.0x Scope"), " a ", "srb", " g ", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 'a', new ItemStack(ModItems.scope20), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "2.0x Scope"), " a ", "srb", "  g", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 'a', new ItemStack(ModItems.scope20), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "2.0x Scope"), "g  ", "   ", "srb", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 'a', new ItemStack(ModItems.scope20), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "2.0x Scope"), " g ", "   ", "srb", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 'a', new ItemStack(ModItems.scope20), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "2.0x Scope"), "  g", "   ", "srb", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 'a', new ItemStack(ModItems.scope20), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "2.0x Scope"), "   ", "ga ", "srb", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 'a', new ItemStack(ModItems.scope20), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "2.0x Scope"), "   ", " ag", "srb", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 'a', new ItemStack(ModItems.scope20), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        // 4x Scope
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "4.0x Scope"), "ga ", "srb", "   ", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 'a', new ItemStack(ModItems.scope40), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "4.0x Scope"), " ag", "srb", "   ", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 'a', new ItemStack(ModItems.scope40), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "4.0x Scope"), " a ", "srb", "g  ", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 'a', new ItemStack(ModItems.scope40), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "4.0x Scope"), " a ", "srb", " g ", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 'a', new ItemStack(ModItems.scope40), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "4.0x Scope"), " a ", "srb", "  g", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 'a', new ItemStack(ModItems.scope40), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "4.0x Scope"), "g  ", "   ", "srb", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 'a', new ItemStack(ModItems.scope40), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "4.0x Scope"), " g ", "   ", "srb", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 'a', new ItemStack(ModItems.scope40), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "4.0x Scope"), "  g", "   ", "srb", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 'a', new ItemStack(ModItems.scope40), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "4.0x Scope"), "   ", "ga ", "srb", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 'a', new ItemStack(ModItems.scope40), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
        GameRegistry.addRecipe(NBTUtils.setString(new ItemStack(ModItems.gunM4A1), "scope", "4.0x Scope"), "   ", " ag", "srb", 'g', new ItemStack(ModItems.tubeGraphite, 1, OreDictionary.WILDCARD_VALUE), 'a', new ItemStack(ModItems.scope40), 's', new ItemStack(ModItems.stockRifle), 'r', new ItemStack(ModItems.receiverRifle), 'b', new ItemStack(ModItems.barrelRifle));
    }
}
