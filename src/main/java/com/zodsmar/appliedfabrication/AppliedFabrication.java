package com.zodsmar.appliedfabrication;

import java.util.logging.Level;

import com.zodsmar.appliedfabrication.blocks.ModBlocks;
import com.zodsmar.appliedfabrication.crafting.Recipes;
import com.zodsmar.appliedfabrication.items.ModItems;
import com.zodsmar.appliedfabrication.lib.reference.ModInfo;
import com.zodsmar.appliedfabrication.lib.util.LogHelper;
import com.zodsmar.appliedfabrication.proxy.IProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.MODID, name = ModInfo.MODNAME, version = ModInfo.VERSION)
public class AppliedFabrication
{

	@Mod.Instance
	public static AppliedFabrication instance;

	@SidedProxy(clientSide = ModInfo.CLIENT_SIDE_PROXY, serverSide = ModInfo.SERVER_SIDE_PROXY)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		LogHelper.log(Level.INFO, "Preparing blocks");
		ModBlocks.init();
		ModBlocks.addNames();
		LogHelper.log(Level.INFO, "Blocks loaded");

		LogHelper.log(Level.INFO, "Preparing items");
		ModItems.init();
		ModItems.addNames();
		LogHelper.log(Level.INFO, "Items loaded");


		LogHelper.log(Level.INFO, "Preparing recipes");
		Recipes.init();
		LogHelper.log(Level.INFO, "Recipes loaded");

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}
