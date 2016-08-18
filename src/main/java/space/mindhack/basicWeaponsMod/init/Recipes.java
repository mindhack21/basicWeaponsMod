package space.mindhack.basicWeaponsMod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {
    public static void init() {
        // Weapon Workbench
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.weaponWorkbench), "iii", "p p", "p p", 'i', "ingotIron", 'p',  "plankWood"));

        // Graphite Ingot
        GameRegistry.addSmelting(Items.coal, new ItemStack(ModItems.ingotGraphite), 0.1F);
        // Graphite Lubricant
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.graphiteTube), "ingotGraphite", "ingotIron"));
        // Lens
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lens), " p ", "pgp", " p ", 'p', "paneGlass", 'g', "blockGlass"));
        // 2x Scope
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rifleScope20), "rl ", "ii ", "   ", 'r', "dustRedstone", 'l', new ItemStack(ModItems.lens), 'i', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rifleScope20), " rl", " ii", "   ", 'r', "dustRedstone", 'l', new ItemStack(ModItems.lens), 'i', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rifleScope20), "   ", "rl ", "ii ", 'r', "dustRedstone", 'l', new ItemStack(ModItems.lens), 'i', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rifleScope20), "   ", " rl", " ii", 'r', "dustRedstone", 'l', new ItemStack(ModItems.lens), 'i', "ingotIron"));
        // 4x Scope
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rifleScope40), " i ", "lrl", " i ", 'r', "dustRedstone", 'l', new ItemStack(ModItems.lens), 'i', "ingotIron"));
        // Rifle Barrel
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rifleBarrel), "iii", "   ", "   ", 'i', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rifleBarrel), "   ", "iii", "   ", 'i', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rifleBarrel), "   ", "   ", "iii", 'i', "ingotIron"));
        // Rifle Receiver
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rifleReceiver), " i ", "iii", "i  ", 'i', "ingotIron"));
        // Rifle Stock
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rifleStock), "iii", "i  ", "   ", 'i', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rifleStock), "   ", "iii", "i  ", 'i', "ingotIron"));

        // M16
        GameRegistry.addRecipe(new ItemStack(ModItems.m16), "g  ", "srb", "   ", 'g', new ItemStack(ModItems.graphiteTube), 's', new ItemStack(ModItems.rifleStock), 'r', new ItemStack(ModItems.rifleReceiver), 'b', new ItemStack(ModItems.rifleBarrel));
        GameRegistry.addRecipe(new ItemStack(ModItems.m16), " g ", "srb", "   ", 'g', new ItemStack(ModItems.graphiteTube), 's', new ItemStack(ModItems.rifleStock), 'r', new ItemStack(ModItems.rifleReceiver), 'b', new ItemStack(ModItems.rifleBarrel));
        GameRegistry.addRecipe(new ItemStack(ModItems.m16), "  g", "srb", "   ", 'g', new ItemStack(ModItems.graphiteTube), 's', new ItemStack(ModItems.rifleStock), 'r', new ItemStack(ModItems.rifleReceiver), 'b', new ItemStack(ModItems.rifleBarrel));
        GameRegistry.addRecipe(new ItemStack(ModItems.m16), "   ", "srb", "g  ", 'g', new ItemStack(ModItems.graphiteTube), 's', new ItemStack(ModItems.rifleStock), 'r', new ItemStack(ModItems.rifleReceiver), 'b', new ItemStack(ModItems.rifleBarrel));
        GameRegistry.addRecipe(new ItemStack(ModItems.m16), "   ", "srb", " g ", 'g', new ItemStack(ModItems.graphiteTube), 's', new ItemStack(ModItems.rifleStock), 'r', new ItemStack(ModItems.rifleReceiver), 'b', new ItemStack(ModItems.rifleBarrel));
        GameRegistry.addRecipe(new ItemStack(ModItems.m16), "   ", "srb", "  g", 'g', new ItemStack(ModItems.graphiteTube), 's', new ItemStack(ModItems.rifleStock), 'r', new ItemStack(ModItems.rifleReceiver), 'b', new ItemStack(ModItems.rifleBarrel));
        GameRegistry.addRecipe(new ItemStack(ModItems.m16), "g  ", "   ", "srb", 'g', new ItemStack(ModItems.graphiteTube), 's', new ItemStack(ModItems.rifleStock), 'r', new ItemStack(ModItems.rifleReceiver), 'b', new ItemStack(ModItems.rifleBarrel));
        GameRegistry.addRecipe(new ItemStack(ModItems.m16), " g ", "   ", "srb", 'g', new ItemStack(ModItems.graphiteTube), 's', new ItemStack(ModItems.rifleStock), 'r', new ItemStack(ModItems.rifleReceiver), 'b', new ItemStack(ModItems.rifleBarrel));
        GameRegistry.addRecipe(new ItemStack(ModItems.m16), "  g", "   ", "srb", 'g', new ItemStack(ModItems.graphiteTube), 's', new ItemStack(ModItems.rifleStock), 'r', new ItemStack(ModItems.rifleReceiver), 'b', new ItemStack(ModItems.rifleBarrel));
        GameRegistry.addRecipe(new ItemStack(ModItems.m16), "   ", "g  ", "srb", 'g', new ItemStack(ModItems.graphiteTube), 's', new ItemStack(ModItems.rifleStock), 'r', new ItemStack(ModItems.rifleReceiver), 'b', new ItemStack(ModItems.rifleBarrel));
        GameRegistry.addRecipe(new ItemStack(ModItems.m16), "   ", " g ", "srb", 'g', new ItemStack(ModItems.graphiteTube), 's', new ItemStack(ModItems.rifleStock), 'r', new ItemStack(ModItems.rifleReceiver), 'b', new ItemStack(ModItems.rifleBarrel));
        GameRegistry.addRecipe(new ItemStack(ModItems.m16), "   ", "  g", "srb", 'g', new ItemStack(ModItems.graphiteTube), 's', new ItemStack(ModItems.rifleStock), 'r', new ItemStack(ModItems.rifleReceiver), 'b', new ItemStack(ModItems.rifleBarrel));
    }
}
