package net.shindo.shindocraft.Block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.shindo.shindocraft.ShindoCraft;
import net.shindo.shindocraft.item.ModItemGroup;
import net.shindo.shindocraft.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS
           = DeferredRegister.create(ForgeRegistries.BLOCKS, ShindoCraft.MOD_ID);

    public static final RegistryObject<Block> PERGAMINHOS_VERMELHO = registerBlock("pergaminhos_vermelho",
            () -> new Block(Block.Properties.of(Material.WOOD).noCollission().strength(4f, 1200f).harvestLevel(2).harvestTool(ToolType.AXE).lightLevel((state) -> 1)));

    public static final RegistryObject<Block> PERGAMINHOS_AMARELO = registerBlock("pergaminhos_amarelo",
            () -> new Block(Block.Properties.of(Material.WOOD).noCollission().strength(4f, 1200f).harvestLevel(2).harvestTool(ToolType.AXE).lightLevel((state) -> 1)));

    public static final RegistryObject<Block> PERGAMINHOS_ROXO = registerBlock("pergaminhos_roxo",
            () -> new Block(Block.Properties.of(Material.WOOD).noCollission().strength(4f, 1200f).harvestLevel(2).harvestTool(ToolType.AXE).lightLevel((state) -> 1)));





    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItems(name, toReturn);

        return toReturn;
    }

    private static <T extends Block> void registerBlockItems(String name,RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModItemGroup.SHINDOCRAFT_GROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
