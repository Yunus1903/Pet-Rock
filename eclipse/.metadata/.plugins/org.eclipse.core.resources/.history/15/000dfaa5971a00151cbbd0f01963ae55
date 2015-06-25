package com.YunusKayne.PetRock;

import com.YunusKayne.PetRock.client.handler.KeyInputEventHandler;
import com.YunusKayne.PetRock.handler.ConfigHandler;
import com.YunusKayne.PetRock.init.Blocks;
import com.YunusKayne.PetRock.init.Entity;
import com.YunusKayne.PetRock.init.Items;
import com.YunusKayne.PetRock.init.Liquids;
import com.YunusKayne.PetRock.init.Recipes;
import com.YunusKayne.PetRock.init.WorldGen;
import com.YunusKayne.PetRock.proxy.IProxy;
import com.YunusKayne.PetRock.reference.Reference;
import com.YunusKayne.PetRock.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUIFACTORY)
//STARTING DATE: 13/05/2015

/*	If you are planning to update then change the version number in Reference class, build.gradle and modmc.info
 * 	
 * 	ToDo List:
 * 
 * - Liquids
 * - Fix ChatHelper class
 * 
 */	

public class PetRock
{
	@Mod.Instance(Reference.MOD_ID)
	public static PetRock instance;
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.SERVERPROXY)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());
		
		WorldGen WorldGen = new WorldGen();		
		
		proxy.registerKeyBindings();
		Blocks.initBlocks();
		Items.initItems();
		Entity.initEntity();
		Liquids.initLiquids();
		Recipes.init();
		GameRegistry.registerWorldGenerator(WorldGen, 1);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		LogHelper.info("Loading Complete!");
	}
}
