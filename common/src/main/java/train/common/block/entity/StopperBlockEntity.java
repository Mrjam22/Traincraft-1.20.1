package train.common.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class StopperBlockEntity extends BlockEntity {
	


	public StopperBlockEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
		super(blockEntityType, blockPos, blockState);
		// TODO Auto-generated constructor stub
	}
	
	public StopperBlockEntity(BlockPos blockPos, BlockState blockState) {
		super(TCBlockEntities.Stopper.get(), blockPos, blockState);
		// TODO Auto-generated constructor stub
	}
	
	private int facingMeta;


	public int getFacing() {
		return facingMeta;
	}

	public void setFacing(int facing) {
		this.facingMeta = facing;
	}

}
