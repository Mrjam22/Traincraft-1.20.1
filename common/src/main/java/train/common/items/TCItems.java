package train.common.items;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import train.common.Traincraft;
import train.common.blocks.TCBlocks;
import train.library.Info;

public class TCItems {
	

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(Info.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> item_stake = ITEMS.register("stake", () -> new Item(new Item.Properties().arch$tab(Traincraft.TraincraftTab)));
    public static final RegistrySupplier<Item> item_normal_track = ITEMS.register("normal_track", () -> new BlockItem(TCBlocks.normal_track.get(), new Item.Properties().arch$tab(Traincraft.TraincraftTab)));
    public static final RegistrySupplier<Item> stopper = ITEMS.register("stopper", () -> new BlockItem(TCBlocks.stopper.get(), new Item.Properties().arch$tab(Traincraft.TraincraftTab)));
    public static final RegistrySupplier<Item> ballast = ITEMS.register("ballast", () -> new BlockItem(TCBlocks.ballast.get(), new Item.Properties().arch$tab(Traincraft.TraincraftTab)));
    public static final RegistrySupplier<Item> item_embedded_track = ITEMS.register("embedded_track", () -> new BlockItem(TCBlocks.embedded_track.get(), new Item.Properties().arch$tab(Traincraft.TraincraftTab)));
    
    public static void init() {
    	ITEMS.register();
    }
}
