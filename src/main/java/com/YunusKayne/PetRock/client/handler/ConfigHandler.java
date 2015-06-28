package com.YunusKayne.PetRock.client.handler;

import java.io.File;

import net.minecraft.util.StatCollector;
import net.minecraftforge.common.config.Configuration;

import com.YunusKayne.PetRock.reference.Reference;
import com.YunusKayne.PetRock.utility.LogHelper;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigHandler
{
	public static Configuration configuration;
	
	public static Boolean useItemPetRock;
	public static Boolean debugMode;
	
	public static void init(File configFile)
	{
		if(configuration == null)
		{
			configuration = new Configuration(configFile);
			LogHelper.info("Configuration Loaded!");
			loadConfiguration();
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
		{
			LogHelper.info("Configuration Loaded!");
			loadConfiguration();
		}
	}
	
	private static void loadConfiguration()
	{	
		useItemPetRock = configuration.get(Configuration.CATEGORY_GENERAL, "Use itemPetRock", true, StatCollector.translateToLocal("Config.useItemPetRock")).getBoolean(true);
		debugMode = configuration.get(Configuration.CATEGORY_GENERAL, "Debug Mode", false, StatCollector.translateToLocal("Config.debugMode")).getBoolean(false);
		
		if(configuration.hasChanged())
		{
			LogHelper.info("Configuration Saved!");
			configuration.save();
		}
	}
}
