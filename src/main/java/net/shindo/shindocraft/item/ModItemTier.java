package net.shindo.shindocraft.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    KUSANAGI_NO_TSURUGI(4, 999999999, 9, 1, 15, () -> {
        return Ingredient.of(ModItems.EMBLEMA_VILA_DA_AREIA.get());
    }),

    KABUTOWARI(4, 999999999, 9, 1, 15, () -> {
      return Ingredient.of(ModItems.EMBLEMA_VILA_DA_AREIA.get());
  }),
  
    KIBA(4, 999999999, 9, 1, 15, () -> {
      return Ingredient.of(ModItems.EMBLEMA_VILA_DA_AREIA.get());
   }),

   HIRAMEKAREI(4, 999999999, 9, 1, 15, () -> {
      return Ingredient.of(ModItems.EMBLEMA_VILA_DA_AREIA.get());
   }),

   SAMEHADA(4, 999999999, 9, 1, 15, () -> {
      return Ingredient.of(ModItems.EMBLEMA_VILA_DA_AREIA.get());
   }),
    SHIBUKI(4, 999999999, 9, 1, 15, () -> {
      return Ingredient.of(ModItems.EMBLEMA_VILA_DA_AREIA.get());
  });
    

   private final int level;
   private final int uses;
   private final float speed;
   private final float damage;
   private final int enchantmentValue;
   private final LazyValue<Ingredient> repairIngredient;

   ModItemTier(int level, int uses, int speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
    this.level = level;
    this.uses = uses;
    this.speed = speed;
    this.damage = damage;
    this.enchantmentValue = enchantmentValue;
    this.repairIngredient = new LazyValue<>(repairIngredient);
   }



    public int getUses() {
      return uses;
   }

   public float getSpeed() {
      return speed;
   }

   public float getAttackDamageBonus() {
      return damage;
   }

   public int getLevel() {
      return level;
   }

   public int getEnchantmentValue() {
      return enchantmentValue;
   }

   public Ingredient getRepairIngredient() {
      return repairIngredient.get();
   }
}