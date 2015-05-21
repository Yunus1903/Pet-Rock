package com.YunusKayne.PetRock.utility;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.living.LivingEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ChatHelper
{	
	//FIX!
	
	private static LivingEvent event;
	private static EntityPlayer entityplayer = (EntityPlayer) event.entityLiving;
	
	public static String playername = entityplayer.getCommandSenderName(); //Crashes Client

	@SubscribeEvent
	public static void ChatMessage(String string)
	{
		event = null;
		
		entityplayer.addChatComponentMessage(new ChatComponentText(string));
	}
}
