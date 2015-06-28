package com.YunusKayne.PetRock.init;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import scala.collection.concurrent.Debug;

import com.YunusKayne.PetRock.utility.LogHelper;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.init.Blocks;

public class PetRockEventHandler
{		
	private static ItemStack iStack = new ItemStack(Blocks.air);
	private static Block bBlock = Blocks.air;
	private static ItemStack[] o = {iStack, iStack, iStack, iStack, iStack, iStack};
	public static Block[] p = {bBlock, bBlock, bBlock, bBlock, bBlock, bBlock};
	public static int meta;
	public static HarvestDropsEvent Event;
	private static int total = 0;
	public static int current = 0;

	public static void addPetriumPickaxeRecipe(ItemStack itemStack, Block params)
	{
		total++;

		//String outputS = itemStack.toString();
		//String paramsS = params.toString();
		//Object oo = (Object) output;

		//o = new ItemStack[total];
		//p = new Block[total];

		o[total] = itemStack;
		p[total] = params;
	}

	private static boolean isBlockEqual()
	{
		boolean a = false;
		if(!a)
		{
			current++;
			if(Event.block.equals(PetRockEventHandler.p[current]))
			{
				while(current <= total && !a)
				{
					LogHelper.chat(current + " --> " + total);
					if(!PetRockEventHandler.p[current].getLocalizedName().isEmpty())
					{
						LogHelper.chat("---true---" + PetRockEventHandler.p[current]);
						a = true;
						LogHelper.info(a);
						return a;
					}
					else return false;
				}
				if (current >= total){current = 0; return false;}
			}
			else return false;
		}
		return a;
	}

	@SubscribeEvent
	public void harvestDrops(HarvestDropsEvent event)
	{
		ItemStack CurrentItem = event.harvester.getCurrentEquippedItem();
		boolean PetriumPick = CurrentItem.getItem().equals(Tools.PetriumPickaxe);
		meta = event.blockMetadata;
		Event = event;
		ItemStack[] itemOutput = {iStack, iStack, iStack, iStack, iStack, iStack};
		Block[] itemParams = {bBlock, bBlock, bBlock, bBlock, bBlock, bBlock};
		itemOutput[current] = PetRockEventHandler.o[current];
		itemParams[current] = PetRockEventHandler.p[current];

		if(event.block.equals(Blocks.stone) || event.block.equals(Blocks.cobblestone))
		{
			for(int x = event.drops.size() - 1; x >= 0; x--)
			{
				if(PetriumPick)
				{
					Random random = new Random();
					event.drops.remove(x);
					event.dropChance = 0.7F;
					event.drops.add(new ItemStack(Items.crushedStone));
				}
			}
		}

		LogHelper.chat("params: " + itemParams);
		LogHelper.chat("output: " + itemOutput);
		LogHelper.chat("Metadata: " + PetRockEventHandler.meta);
		LogHelper.chat("Total: " + total);
		LogHelper.chat("Current: " + current);
		LogHelper.chat("isBlockEqual: " + isBlockEqual());

		Block[] Params = {bBlock, bBlock, bBlock, bBlock, bBlock, bBlock};
		Params[current] = itemParams[current];
		int a = 0;

		if(current > total)
		{
			current = 0;
			LogHelper.chat("current > total");
			//PetRockEventHandler.isBlockEqual();
			this.harvestDrops(event);
		}
		else if(PetriumPick && isBlockEqual())
		{
			//LogHelper.info(Output[current]);
			event.drops.add(PetRockEventHandler.o[current]);
			LogHelper.chat("---Dropped---");
			current = 0;
			a++;
		}
		else LogHelper.chat("NOT WORKING!");
		LogHelper.chat("Initialized: " + a);

		/*
		if(event.block.equals(Blocks.stained_glass)) {
			ItemStack CurrentItem = event.harvester.getCurrentEquippedItem();
			if(CurrentItem.getItem().equals(Tools.PetriumPickaxe)) {
				event.drops.add(new ItemStack(Blocks.stained_glass,1,event.blockMetadata));
			}
		}
		 */
		if(event.block.equals(Blocks.stained_glass_pane)) {
			if(PetriumPick) {
				event.drops.add(new ItemStack(Blocks.stained_glass_pane,1,event.blockMetadata));
			}
		}
		/*
		if(event.block.equals(Blocks.glass)) {
			if(CurrentItem.getItem().equals(PetriumPick)) {
				event.drops.add(new ItemStack(Blocks.glass,1,event.blockMetadata));
			}
		}
		 */
		if(event.block.equals(Blocks.glass_pane)) {
			if(PetriumPick) {
				event.drops.add(new ItemStack(Blocks.glass_pane,1,event.blockMetadata));
			}
		}
	}
}
