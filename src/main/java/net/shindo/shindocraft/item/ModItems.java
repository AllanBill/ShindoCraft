package net.shindo.shindocraft.item;

import net.shindo.shindocraft.ShindoCraft;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ShindoCraft.MOD_ID);

    public static final RegistryObject<Item> EMBLEMA_VILA_DA_AREIA = ITEMS.register("emblema_vila_da_areia",
            ()-> new Item(new Item.Properties().tab(ModItemGroup.SHINDOCRAFT_GROUP)));

    public static final RegistryObject<Item> KUSANAGI_NO_TSURUGI_EM = ITEMS.register("kusanagi_no_tsurugi_em",
            ()-> new Item(new Item.Properties().tab(ModItemGroup.SHINDOCRAFT_GROUP)));

    public static final RegistryObject<Item> KUSANAGI_NO_TSURUGI_DES = ITEMS.register("kusanagi_no_tsurugi_des",
            ()-> new Item(new Item.Properties().tab(ModItemGroup.SHINDOCRAFT_GROUP)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
