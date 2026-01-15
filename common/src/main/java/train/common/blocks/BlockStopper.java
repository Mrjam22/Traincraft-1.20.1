package train.common.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.RailBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import train.common.block.entity.StopperBlockEntity;

public class BlockStopper extends BaseEntityBlock {

	public BlockStopper(Properties properties) {
		super(properties);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
		// TODO Auto-generated method stub
		return new StopperBlockEntity(null, blockPos, blockState);
	}

}
