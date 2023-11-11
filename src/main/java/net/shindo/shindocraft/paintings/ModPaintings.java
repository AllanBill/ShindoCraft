package net.shindo.shindocraft.paintings;

import net.shindo.shindocraft.ShindoCraft;
import net.minecraft.entity.item.PaintingType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModPaintings {
    public  static final DeferredRegister<PaintingType> PAINTING_TYPES =
            DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, ShindoCraft.MOD_ID);

    public static final RegistryObject<PaintingType> EMBLEMA_AREIA =
            PAINTING_TYPES.register("emblema_areia", () -> new PaintingType(32, 32));

    public static final RegistryObject<PaintingType> EMBLEMA_CHUVA =
            PAINTING_TYPES.register("emblema_chuva", () -> new PaintingType(32, 32));


    public static final RegistryObject<PaintingType> EMBLEMA_ESTRELA =
            PAINTING_TYPES.register("emblema_estrela", () -> new PaintingType(32, 32));


    public static final RegistryObject<PaintingType> EMBLEMA_FOLHA =
            PAINTING_TYPES.register("emblema_folha", () -> new PaintingType(32, 32));


    public static final RegistryObject<PaintingType> EMBLEMA_LUA =
            PAINTING_TYPES.register("emblema_lua", () -> new PaintingType(32, 32));


    public static final RegistryObject<PaintingType> EMBLEMA_NEVE =
            PAINTING_TYPES.register("emblema_neve", () -> new PaintingType(32, 32));


    public static final RegistryObject<PaintingType> EMBLEMA_NEVOA =
            PAINTING_TYPES.register("emblema_nevoa", () -> new PaintingType(32, 32));


    public static final RegistryObject<PaintingType> EMBLEMA_NUVEM =
            PAINTING_TYPES.register("emblema_nuvem", () -> new PaintingType(32, 32));


    public static final RegistryObject<PaintingType> EMBLEMA_PEDRA =
            PAINTING_TYPES.register("emblema_pedra", () -> new PaintingType(32, 32));


    public static final RegistryObject<PaintingType> EMBLEMA_SOM =
            PAINTING_TYPES.register("emblema_som", () -> new PaintingType(32, 32));

    public static void register(IEventBus eventBus) {
        PAINTING_TYPES.register(eventBus);
    }
}
