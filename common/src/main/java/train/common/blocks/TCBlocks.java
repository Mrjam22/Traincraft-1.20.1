package train.common.blocks;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RailBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import train.common.Traincraft;
import train.common.blocks.tracks.CopperTrackBlock;
import train.common.items.TCItems;
import train.library.Info;


public class TCBlocks {
	
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(Info.MOD_ID, Registries.BLOCK);
    public static final RegistrySupplier<Block> normal_track = BLOCKS.register("normal_track", () -> new BlockTCRail(true, BlockBehaviour.Properties.of().noOcclusion().noCollission().strength(4f,15f)));
    public static final RegistrySupplier<Block> embedded_track = BLOCKS.register("embedded_track", () -> new BlockTCRail(true, BlockBehaviour.Properties.of().noOcclusion().noCollission().strength(4f,15f)));
    public static final RegistrySupplier<Block> stopper = BLOCKS.register("stopper", () -> new BlockStopper(BlockBehaviour.Properties.of().noOcclusion().strength(4f,15f)));
    public static final RegistrySupplier<Block> ballast = BLOCKS.register("ballast", () -> new Block(BlockBehaviour.Properties.of().strength(2f,12f).sound(SoundType.GRAVEL)));
    
    //Tracks for Railcraft Reborn on 1.20.1 Forge Only 
    public static RegistrySupplier<Block> CopperTrack;
    public static RegistrySupplier<Item> CopperTrackItem;
    
	public static void init() {
		BLOCKS.register();
	}
	
	 // Register Tracks for Railcraft Reborn on 1.20.1 Forge Only 
	public static void initRailcraft() {
		

	    RegistrySupplier<CreativeModeTab> RailcraftTracksTab = Traincraft.TABS.register(
	            "traincraft_railcraft_tracks", // Tab ID
	            () -> CreativeTabRegistry.create(
	                    Component.translatable("category.traincraft_railcraft_tracks"),
	                    () -> new ItemStack(CopperTrackItem.get())
	            )
	    );
	    
	    
		
		CopperTrack = BLOCKS.register("track.copper", () ->  new CopperTrackBlock(Properties.of().noOcclusion().strength(0.7F).sound(SoundType.METAL)));
		CopperTrackItem = TCItems.ITEMS.register("track.copper", () -> new BlockItem(TCBlocks.CopperTrack.get(), new Item.Properties().arch$tab(RailcraftTracksTab)));
	
	
	}

}
