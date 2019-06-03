package com.SilentioX.NarutoMod;

import com.SilentioX.NarutoMod.proxy.CommonProxy;
import com.SilentioX.NarutoMod.tabs.NarutoArmor;
import com.SilentioX.NarutoMod.tabs.NarutoCurrency;
import com.SilentioX.NarutoMod.tabs.NarutoScrolls;
import com.SilentioX.NarutoMod.tabs.NarutoWeapons;
import com.SilentioX.NarutoMod.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	public static final CreativeTabs narutocurrency = new NarutoCurrency("narutocurrency");
	public static final CreativeTabs narutoweapons = new NarutoWeapons("narutoweapons");
	public static final CreativeTabs narutoarmor = new NarutoArmor("narutoarmor");
	public static final CreativeTabs narutoscrolls = new NarutoScrolls("narutoscrolls");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		
	}
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		
	}	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}

}
