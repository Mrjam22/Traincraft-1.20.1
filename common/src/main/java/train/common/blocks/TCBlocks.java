package train.common.blocks;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RailBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import train.Traincraft;
import train.common.blocks.tracks.CopperTrackBlock;
import train.common.items.TCItems;
import train.library.Info;

public class TCBlocks {
	
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(Info.MOD_ID, Registries.BLOCK);
    public static final RegistrySupplier<Block> normal_track = BLOCKS.register("normal_track", () -> new BlockTCRail(true, BlockBehaviour.Properties.of().noOcclusion().noCollission().strength(4f,15f)));
    public static final RegistrySupplier<Block> stopper = BLOCKS.register("stopper", () -> new BlockTCRail(true, BlockBehaviour.Properties.of().noOcclusion().noCollission().strength(4f,15f)));
    
    
    //Tracks for Railcraft Reborn on 1.20.1 Forge Only 
    public static RegistrySupplier<Block> CopperTrack;
    
	public static void init() {
		BLOCKS.register();
	}
	
	 // Register Tracks for Railcraft Reborn on 1.20.1 Forge Only 
	public static void initRailcraft() {
		CopperTrack = BLOCKS.register("track.copper", () ->  new CopperTrackBlock(Properties.of().noOcclusion().strength(0.7F).sound(SoundType.METAL)));
		RegistrySupplier<Item> CopperTrack = TCItems.ITEMS.register("track.copper", () -> new BlockItem(TCBlocks.CopperTrack.get(), new Item.Properties().arch$tab(CreativeModeTabs.REDSTONE_BLOCKS)));
	}

}
