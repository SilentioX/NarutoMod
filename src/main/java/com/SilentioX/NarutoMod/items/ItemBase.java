package com.SilentioX.NarutoMod.items;

import com.SilentioX.NarutoMod.Main;
import com.SilentioX.NarutoMod.init.ModItems;
import com.SilentioX.NarutoMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;

public class ItemBase extends Item implements IHasModel
{
	
	private int enchantability;

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.narutocurrency);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
