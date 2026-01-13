package train.quilt;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import train.fabriclike.TraincraftFabricLike;

public final class TraincraftQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        // Run the Fabric-like setup.
        TraincraftFabricLike.init();
    }
}
