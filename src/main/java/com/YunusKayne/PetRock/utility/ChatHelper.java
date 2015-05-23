package com.YunusKayne.PetRock.utility;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class ChatHelper
{		
	public static void ChatMessage(String string, EntityPlayer player)
	{
        player.addChatComponentMessage(new ChatComponentText(string));
    }
}
