package com.YunusKayne.PetRock.utility;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import cpw.mods.fml.client.FMLClientHandler;

public class ChatHelper
{	
	private static EntityPlayer player = FMLClientHandler.instance().getClient().thePlayer;

	public static void ChatMessage(String UnlocalizedName)
	{
		player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.AQUA + "[Petrock] " + EnumChatFormatting.WHITE + StatCollector.translateToLocal("Chat." + UnlocalizedName)));
	}

	public static void ChatMessageString(String string)
	{
		player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.AQUA + "[Petrock] " + EnumChatFormatting.WHITE + string));
	}

	public static void Debug(Object object)
	{
		ChatHelper.ChatMessageString(EnumChatFormatting.RED + "Debug: " + EnumChatFormatting.WHITE + (String) object);
	}
}
