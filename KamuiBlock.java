package com.SilentioX.NarutoMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class KamuiBlock extends BlockBase 
{

	public KamuiBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		//setHardness(18000000F);
		setResistance(18000000F);
		//setHarvestLevel("pickaxe", 3);
		setLightLevel(0.5F);
		//setLightOpacity(50);
		setBlockUnbreakable();
	}

}
