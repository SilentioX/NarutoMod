package com.SilentioX.NarutoMod.items.edible.food;

import com.SilentioX.NarutoMod.Main;
import com.SilentioX.NarutoMod.init.ModItems;
import com.SilentioX.NarutoMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel
{
	public FoodBase(String name, int amount, float saturation, boolean IsAnimalFood)
	{
		super(amount, saturation, IsAnimalFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
