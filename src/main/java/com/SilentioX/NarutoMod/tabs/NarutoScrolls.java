package com.SilentioX.NarutoMod.tabs;

import com.SilentioX.NarutoMod.init.ModBlocks;
import com.SilentioX.NarutoMod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class NarutoScrolls extends CreativeTabs
{
	public NarutoScrolls(String label)
	{
		super("narutoscrolls");
		this.setBackgroundImageName("nm.png");
	}

	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.SCROLL_OF_SEALS);
	}
}
