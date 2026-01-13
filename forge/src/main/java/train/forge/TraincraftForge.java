package train.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import train.Traincraft;
import train.library.Info;

@Mod(Info.MOD_ID)
public final class TraincraftForge {
    public TraincraftForge() {
        EventBuses.registerModEventBus(Info.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Traincraft.init();
    }
}
