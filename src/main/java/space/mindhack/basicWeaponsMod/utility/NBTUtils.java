package space.mindhack.basicWeaponsMod.utility;

import space.mindhack.basicWeaponsMod.reference.Colors;
import space.mindhack.basicWeaponsMod.reference.NBTType;
import space.mindhack.basicWeaponsMod.reference.Names;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

import java.util.UUID;

public class NBTUtils {

    public static void clearStatefulNBTTags(ItemStack itemStack) {

        if (NBTUtils.hasKey(itemStack, Names.NBT.CRAFTING_GUI_OPEN)) {
            NBTUtils.removeTag(itemStack, Names.NBT.CRAFTING_GUI_OPEN);
        }
        else if (NBTUtils.hasKey(itemStack, Names.NBT.WEAPON_WORKBENCH_GUI_OPEN)) {
            NBTUtils.removeTag(itemStack, Names.NBT.WEAPON_WORKBENCH_GUI_OPEN);
        }
    }

    public static boolean hasUUID(ItemStack itemStack) {
        return getLong(itemStack, Names.NBT.UUID_MOST_SIG) != null && getLong(itemStack, Names.NBT.UUID_LEAST_SIG) != null;
    }

    public static UUID getUUID(ItemStack itemStack) {

        if (hasUUID(itemStack)) {
            return new UUID(getLong(itemStack, Names.NBT.UUID_MOST_SIG), getLong(itemStack, Names.NBT.UUID_LEAST_SIG));
        }

        return null;
    }

    public static ItemStack setUUID(ItemStack itemStack, UUID uuid) {
        if (itemStack != null) {

            initNBTTagCompound(itemStack);

            if (uuid == null) {
                uuid = UUID.randomUUID();
            }

            setLong(itemStack, Names.NBT.UUID_MOST_SIG, uuid.getMostSignificantBits());
            setLong(itemStack, Names.NBT.UUID_LEAST_SIG, uuid.getLeastSignificantBits());
        }
        return itemStack;
    }

    public static boolean hasColor(ItemStack itemStack) {

        return hasKey(itemStack, Names.NBT.DISPLAY, NBTType.COMPOUND) && getTagCompound(itemStack, Names.NBT.DISPLAY).hasKey(Names.NBT.COLOR, NBTType.INT.ordinal());
    }

    public static int getColor(ItemStack itemStack) {
        if (hasColor(itemStack)) {
            return itemStack.getTagCompound().getCompoundTag(Names.NBT.DISPLAY).getInteger(Names.NBT.COLOR);
        }

        return Colors.PURE_WHITE;
    }

    public static ItemStack setColor(ItemStack itemStack, int color) {
        if (itemStack != null) {
            if (itemStack.getTagCompound() == null) {
                itemStack.setTagCompound(new NBTTagCompound());
            }

            if (itemStack.getTagCompound().hasKey(Names.NBT.DISPLAY, NBTType.COMPOUND.ordinal())) {
                itemStack.getTagCompound().getCompoundTag(Names.NBT.DISPLAY).setInteger(Names.NBT.COLOR, color);
            }
            else {
                NBTTagCompound displayTagCompound = new NBTTagCompound();
                displayTagCompound.setInteger(Names.NBT.COLOR, color);
                itemStack.getTagCompound().setTag(Names.NBT.DISPLAY, displayTagCompound);
            }
        }
        return itemStack;
    }

    public static boolean hasKey(ItemStack itemStack, String keyName) {
        return itemStack != null && itemStack.getTagCompound() != null && itemStack.getTagCompound().hasKey(keyName);
    }

    public static boolean hasKey(ItemStack itemStack, String keyName, NBTType nbtType) {
        return itemStack != null && itemStack.getTagCompound() != null && itemStack.getTagCompound().hasKey(keyName, nbtType.ordinal());
    }

    public static void removeTag(ItemStack itemStack, String keyName) {

        if (itemStack != null && itemStack.getTagCompound() != null && keyName != null && !keyName.isEmpty()) {
            itemStack.getTagCompound().removeTag(keyName);
        }
    }

    /**
     * Initializes the NBT Tag Compound for the given ItemStack
     *
     * @param itemStack The ItemStack for which its NBT Tag Compound is being checked for initialization
     */
    private static ItemStack initNBTTagCompound(ItemStack itemStack) {
        if (itemStack != null && itemStack.getTagCompound() == null) {
            itemStack.setTagCompound(new NBTTagCompound());
        }
        return itemStack;
    }

    // String
    public static String getString(ItemStack itemStack, String keyName) {
        if (hasKey(itemStack, keyName, NBTType.STRING)) {
            return itemStack.getTagCompound().getString(keyName);
        }

        return null;
    }

    public static ItemStack setString(ItemStack itemStack, String keyName, String keyValue) {
        if (itemStack != null && keyName != null && !keyName.isEmpty()) {
            initNBTTagCompound(itemStack);
            itemStack.getTagCompound().setString(keyName, keyValue);
        }
        return itemStack;
    }

    // boolean
    public static Boolean getBoolean(ItemStack itemStack, String keyName) {
        if (hasKey(itemStack, keyName, NBTType.BYTE)) {
            itemStack.getTagCompound().getBoolean(keyName);
        }

        return null;
    }

    public static ItemStack setBoolean(ItemStack itemStack, String keyName, boolean keyValue) {
        if (itemStack != null && keyName != null && !keyName.isEmpty()) {
            initNBTTagCompound(itemStack);
            itemStack.getTagCompound().setBoolean(keyName, keyValue);
        }
        return itemStack;
    }

    // byte
    public static Byte getByte(ItemStack itemStack, String keyName) {
        if (hasKey(itemStack, keyName, NBTType.BYTE)) {
            return itemStack.getTagCompound().getByte(keyName);
        }

        return null;
    }

    public static ItemStack setByte(ItemStack itemStack, String keyName, byte keyValue) {
        if (itemStack != null && keyName != null && !keyName.isEmpty()) {
            initNBTTagCompound(itemStack);
            itemStack.getTagCompound().setByte(keyName, keyValue);
        }
        return itemStack;
    }

    // short
    public static Short getShort(ItemStack itemStack, String keyName) {
        if (hasKey(itemStack, keyName, NBTType.SHORT)) {
            return itemStack.getTagCompound().getShort(keyName);
        }

        return null;
    }

    public static ItemStack setShort(ItemStack itemStack, String keyName, short keyValue) {
        if (itemStack != null && keyName != null && !keyName.isEmpty()) {
            initNBTTagCompound(itemStack);
            itemStack.getTagCompound().setShort(keyName, keyValue);
        }
        return itemStack;
    }

    // int
    public static Integer getInteger(ItemStack itemStack, String keyName) {
        if (hasKey(itemStack, keyName, NBTType.INT)) {
            return itemStack.getTagCompound().getInteger(keyName);
        }

        return null;
    }

    public static ItemStack setInteger(ItemStack itemStack, String keyName, int keyValue) {
        if (itemStack != null && keyName != null && !keyName.isEmpty()) {
            initNBTTagCompound(itemStack);
            itemStack.getTagCompound().setInteger(keyName, keyValue);
        }
        return itemStack;
    }

    // long
    public static Long getLong(ItemStack itemStack, String keyName) {
        if (hasKey(itemStack, keyName, NBTType.LONG)) {
            return itemStack.getTagCompound().getLong(keyName);
        }

        return null;
    }

    public static ItemStack setLong(ItemStack itemStack, String keyName, long keyValue) {
        if (itemStack != null && keyName != null && !keyName.isEmpty()) {

            initNBTTagCompound(itemStack);
            itemStack.getTagCompound().setLong(keyName, keyValue);
        }
        return itemStack;
    }

    // float
    public static Float getFloat(ItemStack itemStack, String keyName) {
        if (hasKey(itemStack, keyName, NBTType.FLOAT)) {
            return itemStack.getTagCompound().getFloat(keyName);
        }

        return null;
    }

    public static ItemStack setFloat(ItemStack itemStack, String keyName, float keyValue) {
        if (itemStack != null && keyName != null && !keyName.isEmpty()) {
            initNBTTagCompound(itemStack);
            itemStack.getTagCompound().setFloat(keyName, keyValue);
        }
        return itemStack;
    }

    // double
    public static Double getDouble(ItemStack itemStack, String keyName) {
        if (hasKey(itemStack, keyName, NBTType.DOUBLE)) {
            return itemStack.getTagCompound().getDouble(keyName);
        }

        return null;
    }

    public static ItemStack setDouble(ItemStack itemStack, String keyName, double keyValue) {
        if (itemStack != null && keyName != null && !keyName.isEmpty()) {
            initNBTTagCompound(itemStack);
            itemStack.getTagCompound().setDouble(keyName, keyValue);
        }
        return itemStack;
    }

    // tag list
    public static NBTTagList getTagList(ItemStack itemStack, String keyName, int nbtBaseType) {
        if (hasKey(itemStack, keyName, NBTType.LIST)) {
            return itemStack.getTagCompound().getTagList(keyName, nbtBaseType);
        }

        return null;
    }

    public static ItemStack setTagList(ItemStack itemStack, String keyName, NBTTagList nbtTagList) {
        if (itemStack != null && keyName != null && !keyName.isEmpty()) {
            initNBTTagCompound(itemStack);
            itemStack.getTagCompound().setTag(keyName, nbtTagList);
        }
        return itemStack;
    }

    // tag compound
    public static NBTTagCompound getTagCompound(ItemStack itemStack, String keyName) {
        if (hasKey(itemStack, keyName, NBTType.COMPOUND)) {
            return itemStack.getTagCompound().getCompoundTag(keyName);
        }

        return null;
    }

    public static ItemStack setTagCompound(ItemStack itemStack, String keyName, NBTTagCompound nbtTagCompound) {
        if (itemStack != null && keyName != null && !keyName.isEmpty()) {
            initNBTTagCompound(itemStack);
            itemStack.getTagCompound().setTag(keyName, nbtTagCompound);
        }
        return itemStack;
    }
}