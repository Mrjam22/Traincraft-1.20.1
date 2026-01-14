package train.quilt.client;

import org.quiltmc.loader.api.ModContainer;


import dev.felnull.specialmodelloader.api.event.SpecialModelLoaderEvents;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import train.common.blocks.TCBlocks;
import train.library.Info;

public class TraincraftQuiltClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		// TODO Auto-generated method stub
		SpecialModelLoaderEvents.LOAD_SCOPE.register(location -> Info.MOD_ID.equals(location.getNamespace()));
		BlockRenderLayerMap.INSTANCE.putBlock(TCBlocks.CopperTrack.get(), RenderType.cutout());
	}

}
