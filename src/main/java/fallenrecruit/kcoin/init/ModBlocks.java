package fallenrecruit.kcoin.init;

import java.util.ArrayList;
import java.util.List;

import fallenrecruit.kcoin.blocks.BasicMiner;
import fallenrecruit.kcoin.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class ModBlocks 
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BASIC_MINER_TIER1_BLOCK = new BasicMiner("basic_miner_tier1_block", Material.IRON);
	public static final Block BASIC_MINER_TIER2_BLOCK = new BasicMiner("basic_miner_tier2_block", Material.IRON);
	public static final Block BASIC_MINER_TIER3_BLOCK = new BasicMiner("basic_miner_tier3_block", Material.IRON);
	
}
