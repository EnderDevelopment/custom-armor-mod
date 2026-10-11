package com.franssonmelvin095.customarmormod.items;

import com.franssonmelvin095.customarmormod.CustomArmorMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CustomArmorItems {
    public static final Item CUSTOM_HELMET = registerArmorItem("custom_helmet", ArmorItem.Type.HELMET);
    public static final Item CUSTOM_CHESTPLATE = registerArmorItem("custom_chestplate", ArmorItem.Type.CHESTPLATE);
    public static final Item CUSTOM_LEGGINGS = registerArmorItem("custom_leggings", ArmorItem.Type.LEGGINGS);
    public static final Item CUSTOM_BOOTS = registerArmorItem("custom_boots", ArmorItem.Type.BOOTS);

    private static Item registerArmorItem(String name, ArmorItem.Type type) {
        Item item = new ArmorItem(CustomArmorMaterial.INSTANCE, type, new Item.Settings());
        Registry.register(Registries.ITEM, new Identifier(CustomArmorMod.MOD_ID, name), item);
        return item;
    }

    public static void register() {
        // Registration is done in the registerArmorItem method
    }
}
