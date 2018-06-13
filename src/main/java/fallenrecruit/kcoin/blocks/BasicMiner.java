package fallenrecruit.kcoin.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BasicMiner extends BlockBase 
{

	public BasicMiner(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.ANVIL);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe",0);
		setLightLevel(1.0F);
		setLightOpacity(1);
	}

}
