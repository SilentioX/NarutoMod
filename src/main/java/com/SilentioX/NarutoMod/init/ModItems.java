package com.SilentioX.NarutoMod.init;

import java.util.ArrayList;
import java.util.List;

import com.SilentioX.NarutoMod.util.Reference;
import com.SilentioX.NarutoMod.items.ItemBase;
import com.SilentioX.NarutoMod.items.edible.food.FoodBase;
import com.SilentioX.NarutoMod.items.edible.pills.HealthPill;
import com.SilentioX.NarutoMod.items.jutsu.JutsuBase;
import com.SilentioX.NarutoMod.items.scrolls.ScrollsBase;
import com.SilentioX.NarutoMod.items.weapons.HiraiK;
import com.SilentioX.NarutoMod.tabs.NarutoWeapons;

import net.minecraft.block.Block;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{
	public static final List <Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_HIRAI = EnumHelper.addToolMaterial("material_hirai", 0, 1000000000, 0F, 46.0F, 10);
	
	//Jutsus
	public static final Item KAGEBUNSHIN = new JutsuBase("kagebunshin");
	public static final Item TAJUKAGEBUNSHIN = new JutsuBase("tajukagebunshin");
	public static final Item KAGESHURIKEN = new JutsuBase("kageshuriken");
	public static final Item REAPERSEAL = new JutsuBase("reaperseal");
	public static final ItemSword HIRAISHIN_KUNAI = new HiraiK("hiraishin_kunai", MATERIAL_HIRAI);
	
	//Items
	public static final Item SCROLL_OF_SEALS = new ScrollsBase("scroll_of_seals");
	public static final Item SCROLL_COIN = new ItemBase("scroll_coin");
	
	//Armor
	
	//Food
	public static final Item RAMEN = new FoodBase("ramen", 40, 20F, false);
	
	//Pills
	public static final Item RED_PILL = new HealthPill("red_pill", 0, 0F, false, new PotionEffect(MobEffects.INSTANT_HEALTH, (1*20), 20, true, false));
	
	//Currency
	public static final Item BRONZE_RYO = new ItemBase("bronze_ryo");
	public static final Item SILVER_RYO = new ItemBase("silver_ryo");
	public static final Item GOLD_RYO = new ItemBase("gold_ryo");
	public static final Item ONYX_RYO = new ItemBase("onyx_ryo");
	
	//Weapons
	
}
