package com.YunusKayne.PetRock.client.handler;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.StatCollector;

import com.YunusKayne.PetRock.client.settings.Keybindings;
import com.YunusKayne.PetRock.init.PetRockEventHandler;
import com.YunusKayne.PetRock.utility.ChatHelper;
import com.YunusKayne.PetRock.utility.LogHelper;
import com.YunusKayne.PetRock.utility.RecipeHandler;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class KeyInputHandler
{	
	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event)
	{
		EntityPlayer player = FMLClientHandler.instance().getClient().thePlayer;
		if(Keybindings.Hello.isPressed())
		{
			ChatHelper.ChatMessageString(StatCollector.translateToLocal("Chat.Hello") + " " + player.getCommandSenderName() + "!");
			if(Author())
			{
				ChatHelper.ChatMessageString(":O Your one of the Authors of this mod! :O");
			}
		}
		else if(ConfigHandler.debugMode && Keybindings.Debug.isPressed())
		{
			ChatHelper.Debug("----------------------------------------------------");
			ChatHelper.Debug(RecipeHandler.current + " = " + RecipeHandler.p[RecipeHandler.current]);
			ChatHelper.Debug("Current Item: " + PetRockEventHandler.CurrentItem);
			if(RecipeHandler.PetriumPick && RecipeHandler.isBlockEqual()) ChatHelper.Debug("aa(): " + true);
			else ChatHelper.Debug("aa(): " + false);
		}
	}
	
	private static boolean Author()
	{
		EntityPlayer player = FMLClientHandler.instance().getClient().thePlayer;
		
		if(player.getCommandSenderName().equals("Yunus1903")) return true;
		if(player.getCommandSenderName().equals("KakesRevengeCZ")) return true;
		if(player.getCommandSenderName().equals("TheKayneGame")) return true;
		if(player.getCommandSenderName().equals("manmaed")) return true;
		
		return false;	
	}
}
