package train.client.init;

import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import train.client.render.StopperBlockEntityRenderer;
import train.common.block.entity.TCBlockEntities;

public class RendererInit {

	public RendererInit() {
		// TODO Auto-generated constructor stub
	}

	public static void RegisterRenders() {
		BlockEntityRenderers.register(TCBlockEntities.Stopper.get(), StopperBlockEntityRenderer::new);
	}
}
