package train.common.items;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import train.library.Info;

public class TCItems {
	

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(Info.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> item_stake = ITEMS.register("stake", () -> new Item(new Item.Properties()));

    public static void init() {
    	ITEMS.register();
    }
}
