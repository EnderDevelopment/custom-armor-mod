package com.franssonmelvin095.customarmormod.items;

import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class CustomArmorMaterial implements ArmorMaterial {
    public static final CustomArmorMaterial INSTANCE = new CustomArmorMaterial();

    private static final int[] BASE_DURABILITY = {13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = {2, 5, 6, 2};

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * 25;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return PROTECTION_VALUES[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.DIAMOND);
    }

    @Override
    public String getName() {
        return "custom";
    }

    @Override
    public float getToughness() {
        return 2.0f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0f;
    }
}
