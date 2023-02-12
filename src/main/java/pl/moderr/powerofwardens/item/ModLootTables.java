package pl.moderr.powerofwardens.item;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTables {

    public static void ModifyLootTables(){
        ModifyWardenLootTable();
    }

    private static void ModifyWardenLootTable(){
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(source.isBuiltin() && EntityType.WARDEN.getLootTableId().equals(id)){
                LootPool.Builder heart = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f))
                        .with(ItemEntry.builder(ModItems.WARDEN_EYE));
                tableBuilder.pool(heart.build());
                LootPool.Builder shard = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.SCULK_LEATHER))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4f)).build());
                tableBuilder.pool(shard.build());
                LootPool.Builder horn = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.WARDEN_HORN))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                tableBuilder.pool(horn.build());
            }
        });
    }

}
