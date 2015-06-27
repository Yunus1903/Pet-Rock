package com.YunusKayne.PetRock.client.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.StatCollector;

import com.YunusKayne.PetRock.client.settings.Keybindings;
import com.YunusKayne.PetRock.utility.ChatHelper;

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
    }
}
