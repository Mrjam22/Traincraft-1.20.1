package train.common.block.entity;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.entity.BlockEntityType;
import train.common.blocks.TCBlocks;
import train.library.Info;

public class TCBlockEntities {
	
	public static final DeferredRegister<BlockEntityType<?>> BlockEntities = DeferredRegister.create(Info.MOD_ID, Registries.BLOCK_ENTITY_TYPE);

	
	public static final RegistrySupplier<BlockEntityType<StopperBlockEntity>> Stopper = BlockEntities.register("tile.stopper", () -> BlockEntityType.Builder.of(StopperBlockEntity::new, TCBlocks.stopper.get()).build(null));


	public TCBlockEntities() {
		// TODO Auto-generated constructor stub
	}

	public static void init() {
		BlockEntities.register();
	}
	
}
