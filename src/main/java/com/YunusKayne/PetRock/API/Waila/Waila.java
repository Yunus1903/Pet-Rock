package com.YunusKayne.PetRock.API.Waila;

import com.YunusKayne.PetRock.API.Waila.Handler.WailaStoneBlockHandler;

import mcp.mobius.waila.api.IWailaRegistrar;
import net.minecraft.block.BlockStone;

public class Waila
{
	public static void onCall(IWailaRegistrar registrar)
	{
		registrar.registerStackProvider(new WailaStoneBlockHandler(), BlockStone.class);
	}
}
