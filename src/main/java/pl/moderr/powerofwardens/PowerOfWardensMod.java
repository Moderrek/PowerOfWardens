package pl.moderr.powerofwardens;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.moderr.powerofwardens.item.ModItems;
import pl.moderr.powerofwardens.item.ModLootTables;

public class PowerOfWardensMod implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("power-of-wardens");
	public static final String MOD_ID = "power-of-wardens";

	public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder(new Identifier(MOD_ID, "pow_item_group")).icon(() -> new ItemStack(ModItems.WARDEN_EYE)).build();

	@Override
	public void onInitialize() {
		ModItems.register();
		ModLootTables.ModifyLootTables();
	}
}