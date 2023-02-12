package pl.moderr.powerofwardens.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import pl.moderr.powerofwardens.PowerOfWardensMod;

public class ModItems {

    public static final Item INFUSED_SWORD = new SwordItem(ModToolMaterials.SCULKERITE, 0, -2, new Item.Settings().rarity(Rarity.EPIC));
    public static final Item INFUSED_SHOVEL = new ShovelItem(ModToolMaterials.SCULKERITE, -1.5f, -2, new Item.Settings().rarity(Rarity.EPIC));
    public static final Item INFUSED_PICKAXE = new PickaxeItem(ModToolMaterials.SCULKERITE, -2, -2, new Item.Settings().rarity(Rarity.EPIC));
    public static final Item INFUSED_AXE = new AxeItem(ModToolMaterials.SCULKERITE, 1, -3, new Item.Settings().rarity(Rarity.EPIC));
    public static final Item INFUSED_HOE = new HoeItem(ModToolMaterials.SCULKERITE, -8, -3, new Item.Settings().rarity(Rarity.EPIC));
    public static final Item INFUSED_HELMET = new ArmorItem(ModArmorMaterials.SCULKERITE, EquipmentSlot.HEAD, new Item.Settings().rarity(Rarity.EPIC));
    public static final Item INFUSED_CHESTPLATE = new ArmorItem(ModArmorMaterials.SCULKERITE, EquipmentSlot.CHEST, new Item.Settings().rarity(Rarity.EPIC));
    public static final Item INFUSED_LEGGINGS = new ArmorItem(ModArmorMaterials.SCULKERITE, EquipmentSlot.LEGS, new Item.Settings().rarity(Rarity.EPIC));
    public static final Item INFUSED_BOOTS = new ArmorItem(ModArmorMaterials.SCULKERITE, EquipmentSlot.FEET, new Item.Settings().rarity(Rarity.EPIC));
    public static final Item WARDEN_EYE = new Item(new FabricItemSettings().maxCount(16).rarity(Rarity.EPIC));
    public static final Item WARDEN_HORN = new Item(new FabricItemSettings().maxCount(16).rarity(Rarity.RARE));
    public static final Item SCULK_LEATHER = new Item(new FabricItemSettings().rarity(Rarity.RARE));
    public static final Item INFUSED_INGOT = new Item(new FabricItemSettings().rarity(Rarity.RARE));

    private static void register(String id, Item item){
        Registry.register(Registries.ITEM, new Identifier(PowerOfWardensMod.MOD_ID, id), item);
        ItemGroupEvents.modifyEntriesEvent(PowerOfWardensMod.ITEM_GROUP).register(content -> {
            content.add(item.getDefaultStack());
        });
    }

    public static void register() {
        register("sculk_leather", SCULK_LEATHER);
        register("warden_horn", WARDEN_HORN);
        register("warden_eye", WARDEN_EYE);
        register("infused_ingot", INFUSED_INGOT);
        register("infused_sword", INFUSED_SWORD);
        register("infused_shovel", INFUSED_SHOVEL);
        register("infused_pickaxe", INFUSED_PICKAXE);
        register("infused_axe", INFUSED_AXE);
        register("infused_hoe", INFUSED_HOE);
        register("infused_helmet", INFUSED_HELMET);
        register("infused_chestplate", INFUSED_CHESTPLATE);
        register("infused_leggings", INFUSED_LEGGINGS);
        register("infused_boots", INFUSED_BOOTS);
    }
}
