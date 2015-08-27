package com.YunusKayne.PetRock.Waila;

import com.YunusKayne.PetRock.Waila.Handler.WailaPetrockCrateHandler;
import com.YunusKayne.PetRock.blocks.tileentity.petrockCrate;

import mcp.mobius.waila.api.IWailaRegistrar;

public class Waila
{
	public static void onCall(IWailaRegistrar registrar)
	{
		registrar.registerStackProvider(new WailaPetrockCrateHandler(), petrockCrate.class);
	}
}
