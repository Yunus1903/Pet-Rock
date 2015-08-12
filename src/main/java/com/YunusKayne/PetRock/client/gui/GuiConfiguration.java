package com.YunusKayne.PetRock.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import com.YunusKayne.PetRock.Reference;
import com.YunusKayne.PetRock.client.handler.ConfigHandler;

import cpw.mods.fml.client.config.GuiConfig;

public class GuiConfiguration extends GuiConfig
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public GuiConfiguration(GuiScreen guiScreen)
	{
		super(guiScreen, new ConfigElement(ConfigHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				Reference.MOD_ID,
				false,
				false,
				GuiConfig.getAbridgedConfigPath(ConfigHandler.configuration.toString()));
	}
}
