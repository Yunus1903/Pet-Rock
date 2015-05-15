package com.YunusKayne.PetRock.client.handler;

import com.YunusKayne.PetRock.client.settings.Keybindings;
import com.YunusKayne.PetRock.reference.Key;
import com.YunusKayne.PetRock.utility.LogHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler
{
	private static Key getPressedKeyBinding()
	{
		if(Keybindings.Hello.isPressed())
		{
			return Key.Hello;
			//Say "Hi %player%!" in chat
		}
		
		//Make "else if" if you want to add more
		
		return Key.Unkown;
	}
	
	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
	{
		//Every time a key gets pressed this will be initialized
	}
}
