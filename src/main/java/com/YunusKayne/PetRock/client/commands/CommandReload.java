package com.YunusKayne.PetRock.client.commands;

import com.YunusKayne.PetRock.client.handler.ConfigHandler;
import com.YunusKayne.PetRock.utility.ChatHelper;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.StatCollector;

public class CommandReload extends CommandBase
{
	@Override
	public String getCommandName()
	{
		return "Reload Configs";
	}

	@Override
	public String getCommandUsage(ICommandSender commandSender)
	{
		return "command.Reload.usage";
	}

	@Override
	public void processCommand(ICommandSender commandSender, String[] p_71515_2_)
	{
		ConfigHandler.loadConfiguration();
		ChatHelper.ChatMessage("command.Reload.success");
	}
}
