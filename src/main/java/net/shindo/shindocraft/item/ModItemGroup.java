package net.shindo.shindocraft.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup SHINDOCRAFT_GROUP = new ItemGroup("ShindoCraftModTab")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.EMBLEMA_VILA_DA_AREIA.get());
        }
    };

}
