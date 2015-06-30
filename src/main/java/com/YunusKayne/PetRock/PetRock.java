package com.YunusKayne.PetRock;

import net.minecraftforge.common.MinecraftForge;

import com.YunusKayne.PetRock.client.handler.ConfigHandler;
import com.YunusKayne.PetRock.client.handler.KeyInputHandler;
import com.YunusKayne.PetRock.client.settings.Keybindings;
import com.YunusKayne.PetRock.init.BlocksHandler;
import com.YunusKayne.PetRock.init.Entity;
import com.YunusKayne.PetRock.init.Items;
import com.YunusKayne.PetRock.init.Liquids;
import com.YunusKayne.PetRock.init.PetRockEventHandler;
import com.YunusKayne.PetRock.init.Recipes;
import com.YunusKayne.PetRock.init.Tools;
import com.YunusKayne.PetRock.init.WorldGen;
import com.YunusKayne.PetRock.proxy.ClientProxy;
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
 * - Liquid love
 * - find kakes in czech republic and kill him
 * - When youre not looking the Pet Rock will move slowly
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
		FMLCommonHandler.instance().bus().register(new KeyInputHandler());
		FMLCommonHandler.instance().bus().register(new PetRockEventHandler());
		MinecraftForge.EVENT_BUS.register(new PetRockEventHandler());

		WorldGen WorldGen = new WorldGen();		

		Keybindings.init();
		BlocksHandler.initBlocks();
		Items.initItems();
		Tools.initTools();
		Entity.initEntity();
		ClientProxy.registerRendering();
		Liquids.initLiquids();
		Recipes.init();
		GameRegistry.registerWorldGenerator(WorldGen, 1);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		LogHelper.error("manmaed is Weird!");
		LogHelper.info("Loading Complete!");
	}
}
