package com.SilentioX.NarutoMod.init;

import java.util.ArrayList;
import java.util.List;

import com.SilentioX.NarutoMod.blocks.BlockBase;
import com.SilentioX.NarutoMod.blocks.KamuiBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block KAMUI_BLOCK = new KamuiBlock("kamui_block", Material.GROUND);
}
