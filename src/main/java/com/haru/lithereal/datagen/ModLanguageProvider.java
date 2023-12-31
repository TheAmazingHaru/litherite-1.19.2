package com.haru.lithereal.datagen;

import com.haru.lithereal.Lithereal;
import com.haru.lithereal.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import com.haru.lithereal.item.ModItems;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(DataGenerator generator, String locale) {
        super(generator, Lithereal.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        addItem(ModItems.LITHERITE_CRYSTAL, "Litherite Crystal");
        addItem(ModItems.HEATED_LITHERITE_CRYSTAL, "Burning Litherite Crystal");
        addItem(ModItems.COOLED_LITHERITE_CRYSTAL, "Frozen Litherite Crystal");

        addItem(ModItems.LITHERITE_SWORD, "Litherite Crystal Sword");
        addItem(ModItems.COOLED_LITHERITE_SWORD, "Frozen Litherite Crystal Sword");
        addItem(ModItems.HEATED_LITHERITE_SWORD, "Burning Litherite Crystal Sword");

        addItem(ModItems.LITHERITE_HOE, "Litherite Crystal Hoe");
        addItem(ModItems.COOLED_LITHERITE_HOE, "Frozen Litherite Crystal Hoe");
        addItem(ModItems.HEATED_LITHERITE_HOE, "Burning Litherite Crystal Hoe");

        addItem(ModItems.LITHERITE_PICKAXE, "Litherite Crystal Pickaxe");
        addItem(ModItems.COOLED_LITHERITE_PICKAXE, "Frozen Litherite Crystal Pickaxe");
        addItem(ModItems.HEATED_LITHERITE_PICKAXE, "Burning Litherite Crystal Pickaxe");

        addItem(ModItems.LITHERITE_HAMMER, "Litherite Crystal Hammer");
        addItem(ModItems.FROZEN_LITHERITE_HAMMER, "Frozen Litherite Crystal Hammer");
        addItem(ModItems.BURNING_LITHERITE_HAMMER, "Burning Litherite Crystal Hammer");

        addItem(ModItems.LITHERITE_AXE, "Litherite Crystal Axe");
        addItem(ModItems.COOLED_LITHERITE_AXE, "Frozen Litherite Crystal Axe");
        addItem(ModItems.HEATED_LITHERITE_AXE, "Burning Litherite Crystal Axe");

        addItem(ModItems.LITHERITE_SHOVEL, "Litherite Crystal Shovel");
        addItem(ModItems.COOLED_LITHERITE_SHOVEL, "Frozen Litherite Crystal Shovel");
        addItem(ModItems.HEATED_LITHERITE_SHOVEL, "Burning Litherite Crystal Shovel");

        addItem(ModItems.LITHERITE_HELMET, "Litherite Crystal Helmet");
        addItem(ModItems.COOLED_LITHERITE_HELMET, "Frozen Litherite Crystal Helmet");
        addItem(ModItems.HEATED_LITHERITE_HELMET, "Burning Litherite Crystal Helmet");

        addItem(ModItems.LITHERITE_CHESTPLATE, "Litherite Crystal Chestplate");
        addItem(ModItems.COOLED_LITHERITE_CHESTPLATE, "Frozen Litherite Crystal Chestplate");
        addItem(ModItems.HEATED_LITHERITE_CHESTPLATE, "Burning Litherite Crystal Chestplate");

        addItem(ModItems.LITHERITE_LEGGINGS, "Litherite Crystal Leggings");
        addItem(ModItems.COOLED_LITHERITE_LEGGINGS, "Frozen Litherite Crystal Leggings");
        addItem(ModItems.HEATED_LITHERITE_LEGGINGS, "Burning Litherite Crystal Leggings");

        addItem(ModItems.LITHERITE_BOOTS, "Litherite Crystal Boots");
        addItem(ModItems.COOLED_LITHERITE_BOOTS, "Frozen Litherite Crystal Boots");
        addItem(ModItems.HEATED_LITHERITE_BOOTS, "Burning Litherite Crystal Boots");

        addBlock(ModBlocks.LITHERITE_BLOCK, "Litherite Block");
        addBlock(ModBlocks.LITHERITE_ORE, "Litherite Ore");
        addBlock(ModBlocks.DEEPSLATE_LITHERITE_ORE, "Deepslate Litherite Ore");
        addBlock(ModBlocks.COOLED_LITHERITE_BLOCK, "Frozen Litherite Block");
        addBlock(ModBlocks.HEATED_LITHERITE_BLOCK, "Burning Litherite Block");

        addBlock(ModBlocks.FREEZING_STATION, "Freezing Station");
        addBlock(ModBlocks.FIRE_CRUCIBLE, "Fire Crucible");

        addBlock(ModBlocks.BLUE_FIRE, "Blue Fire");

        add("creativemodetab.lithereal_tab", "Lithereal");
    }
}
