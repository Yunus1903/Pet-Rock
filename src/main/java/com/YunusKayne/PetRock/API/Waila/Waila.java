package com.YunusKayne.PetRock.API.Waila;

import com.YunusKayne.PetRock.API.Waila.Handler.WailaBlockHandler;
import com.YunusKayne.PetRock.entity.entityPetRock;
import com.YunusKayne.PetRock.utility.LogHelper;

import mcp.mobius.waila.api.IWailaRegistrar;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.init.Blocks;

public class Waila
{
	public static void onCall(IWailaRegistrar registrar)
	{
		WailaBlockHandler.RegisterBlockInfo(registrar, Blocks.stone, "Stone.info1");
	}
}
