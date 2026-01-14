package train;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import train.common.blocks.TCBlocks;
import train.common.items.TCItems;
import train.library.Info;

public final class Traincraft {
	
    private static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Info.MOD_ID, Registries.CREATIVE_MODE_TAB);
   
    public static final RegistrySupplier<CreativeModeTab> TraincraftTab = TABS.register(
            "traincraft_main", // Tab ID
            () -> CreativeTabRegistry.create(
                    Component.translatable("category.traincraft"),
                    () -> new ItemStack(TCItems.item_stake.get())
            )
    );
    

    public static void init() {
    	TCBlocks.init();
    	TCBlocks.initRailcraft();
    	TCItems.init();
    	TABS.register();
    }
    
 
}
