package com.YunusKayne.PetRock.utility;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class ChatHelper
{		
	private static EntityPlayer player = FMLClientHandler.instance().getClient().thePlayer;
	private static World world = Minecraft.getMinecraft().theWorld;

	public static void ChatMessage(String UnlocalizedName)
	{
		player.addChatComponentMessage(new ChatComponentText("§B[Pet Rock]§f " + StatCollector.translateToLocal("Chat." + UnlocalizedName)));
	}

	public static void ChatMessageString(String string)
	{
		player.addChatComponentMessage(new ChatComponentText("§B[Pet Rock]§f " + string));
	}

	public static void Debug(Object object)
	{
		ChatHelper.ChatMessageString("§cDebug:§f " + (String) object);
	}
}
