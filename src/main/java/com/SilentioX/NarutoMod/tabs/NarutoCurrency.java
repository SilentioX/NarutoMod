package com.SilentioX.NarutoMod.tabs;

import com.SilentioX.NarutoMod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class NarutoCurrency extends CreativeTabs
{
	public NarutoCurrency(String label)
	{
		super("narutocurrency");
		this.setBackgroundImageName("nm.png");
	}

	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.ONYX_RYO);
	}
}
