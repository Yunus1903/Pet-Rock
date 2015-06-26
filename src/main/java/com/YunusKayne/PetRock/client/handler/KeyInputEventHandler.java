package com.YunusKayne.PetRock.client.handler;

import com.YunusKayne.PetRock.client.settings.KeyBindings;
import com.YunusKayne.PetRock.reference.Key;
import com.YunusKayne.PetRock.utility.ChatHelper;
import com.YunusKayne.PetRock.utility.LogHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.entity.player.EntityPlayer;

public class KeyInputEventHandler
{	
	private static Key getPressedKeyBinding(EntityPlayer player)
	{
		if(KeyBindings.Hello.isPressed())
		{
			ChatHelper.ChatMessageString("Hi " + player.getCommandSenderName() + "!");
			LogHelper.info("Working!");
			return Key.Hello;
		}
		LogHelper.info("Key");
		
		//Make "else if" if you want to add more
		
		return Key.Unkown;
	}
	
	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
	{
		//Every time a key gets pressed this will be initialized
	}
}
