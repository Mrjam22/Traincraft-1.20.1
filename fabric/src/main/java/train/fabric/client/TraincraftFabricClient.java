package train.fabric.client;

import dev.felnull.specialmodelloader.api.event.SpecialModelLoaderEvents;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import train.common.blocks.TCBlocks;
import train.library.Info;

public final class TraincraftFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
    	SpecialModelLoaderEvents.LOAD_SCOPE.register(location -> Info.MOD_ID.equals(location.getNamespace()));
    	BlockRenderLayerMap.INSTANCE.putBlock(TCBlocks.CopperTrack.get(), RenderType.cutout());
    	BlockRenderLayerMap.INSTANCE.putBlock(TCBlocks.embedded_track.get(), RenderType.cutout());
    }
}
