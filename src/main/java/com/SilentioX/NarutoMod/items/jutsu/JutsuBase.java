package com.SilentioX.NarutoMod.items.jutsu;

import com.SilentioX.NarutoMod.Main;
import com.SilentioX.NarutoMod.init.ModItems;
import com.SilentioX.NarutoMod.items.ItemBase;
import com.SilentioX.NarutoMod.util.IHasModel;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class JutsuBase extends Item implements IHasModel
{
	
	public JutsuBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.narutocurrency);
		this.maxStackSize = 1;
		
		ModItems.ITEMS.add(this);
	}
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
        return super.hasEffect(stack) || stack.getMetadata() > 0;
    }

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
