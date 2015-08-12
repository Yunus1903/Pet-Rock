package com.YunusKayne.PetRock.client.handler;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.StatCollector;

import com.YunusKayne.PetRock.blocks.tileentity.petrockCrate;
import com.YunusKayne.PetRock.client.settings.Keybindings;
import com.YunusKayne.PetRock.init.PetRockEventHandler;
import com.YunusKayne.PetRock.utility.ChatHelper;
import com.YunusKayne.PetRock.utility.RecipeHandler;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputHandler
{	
	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event)
	{
		EntityPlayer player = FMLClientHandler.instance().getClient().thePlayer;
		if(Keybindings.Hello.isPressed())
		{
			ChatHelper.ChatMessageString(StatCollector.translateToLocal("Chat.Hello") + " " + player.getCommandSenderName() + "!");
		}
		else if(ConfigHandler.debugMode && Keybindings.Debug.isPressed())
		{
			ChatHelper.Debug("----------------------------------------------------");
			ChatHelper.Debug(RecipeHandler.current + " = " + RecipeHandler.p[RecipeHandler.current]);
			ChatHelper.Debug("Current Item: " + PetRockEventHandler.CurrentItem);
			if(RecipeHandler.PetriumPick && RecipeHandler.isBlockEqual()) ChatHelper.Debug("aa(): " + true);
			else ChatHelper.Debug("aa(): " + false);
			
			petrockCrate crate = new petrockCrate(Material.wood, "petrockCrate");
			crate.setBlockBounds(0.1F, 0.0F, 0.1F, 0.9F, 1.0F, 0.9F);
		}
	}
	
	private static boolean KillList()
	{
		EntityPlayer player = FMLClientHandler.instance().getClient().thePlayer;
		
		if(player.getCommandSenderName().equals("manmaed")) return true;
		if(player.getCommandSenderName().equals("TheKayneGame")) return true;
		if(player.getCommandSenderName().equals("UnRealDinnerbone")) return true;
		if(player.getCommandSenderName().equals("Dinnerbeef")) return true;
		
		return false;	
	}
}
