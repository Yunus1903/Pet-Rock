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
		RegisterBlockInfo(registrar, Blocks.stone, null, "Stone.info1", null);
		RegisterBlockInfo(registrar, com.YunusKayne.PetRock.init.Blocks.blockPetrium, null, "Petrium.info2", null);
	}
	
	public static Block Block;
	public static String Head;
	public static String Body;
	public static String Tail;
	
	public static void RegisterBlockInfo(IWailaRegistrar registrar, Block block, String LocalizedHead, String LocalizedBody, String LocalizedTail)
	{
		Head = null;
		Body = null;
		Tail = null;
		Block = null;
		
		Head = LocalizedHead;
		Body = LocalizedBody;
		Tail = LocalizedTail;
		Block = block;

		registrar.registerStackProvider(new WailaBlockHandler(), Block.getClass());
		registrar.registerHeadProvider(new WailaBlockHandler(), Block.getClass());
		registrar.registerBodyProvider(new WailaBlockHandler(), Block.getClass());
		registrar.registerTailProvider(new WailaBlockHandler(), Block.getClass());
		registrar.registerNBTProvider(new WailaBlockHandler(), Block.getClass());
	}
}
