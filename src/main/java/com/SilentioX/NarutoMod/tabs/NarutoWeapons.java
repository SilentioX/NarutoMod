package com.SilentioX.NarutoMod.tabs;

import java.util.ArrayList;
import java.util.List;

import com.SilentioX.NarutoMod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class NarutoWeapons extends CreativeTabs
{
	
	public NarutoWeapons(String label) 
	{
		super("narutoweapons");
		this.setBackgroundImageName("nm.png");
	}
	
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.HIRAISHIN_KUNAI);
	}
}
