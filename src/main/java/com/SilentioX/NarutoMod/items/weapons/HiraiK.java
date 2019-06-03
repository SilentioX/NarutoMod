package com.SilentioX.NarutoMod.items.weapons;

import com.SilentioX.NarutoMod.Main;
import com.SilentioX.NarutoMod.entity.weapons.EntityHiraishinK;
import com.SilentioX.NarutoMod.init.ModItems;
import com.SilentioX.NarutoMod.util.IHasModel;

import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class HiraiK extends ItemSword implements IHasModel
{
	public HiraiK(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.narutoweapons);
		this.maxStackSize = 1;
		
		ModItems.ITEMS.add(this);
	}
	
	 public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	    {
	        ItemStack itemstack = playerIn.getHeldItem(handIn);

	        worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_ENDERPEARL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
	        playerIn.getCooldownTracker().setCooldown(this, 30);

	        if (!worldIn.isRemote)
	        {
	            EntityHiraishinK entityhirai = new EntityHiraishinK(worldIn, playerIn);
	            entityhirai.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
	            worldIn.spawnEntity(entityhirai);
	            entityhirai.motionX *=2;
	            entityhirai.motionY *=2;
	            entityhirai.motionZ *=2;
	        }

	        playerIn.addStat(StatList.getObjectUseStats(this));
	        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
	    }
	 

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
