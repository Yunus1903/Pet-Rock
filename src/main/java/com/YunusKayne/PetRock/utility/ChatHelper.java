package com.YunusKayne.PetRock.utility;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.StatCollector;

public class ChatHelper
{		
	private static EntityPlayer player = FMLClientHandler.instance().getClient().thePlayer;
	
	public static void ChatMessage(String UnlocalizedName)
	{
        player.addChatComponentMessage(new ChatComponentText("§B[Pet Rock]§f " + StatCollector.translateToLocal("Chat." + UnlocalizedName)));
    }
	
	public static void ChatMessageString(String string)
	{
        player.addChatComponentMessage(new ChatComponentText("§B[Pet Rock]§f " + string));
    }
}
