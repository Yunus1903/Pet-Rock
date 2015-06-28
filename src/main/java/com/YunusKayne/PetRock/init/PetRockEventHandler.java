package com.YunusKayne.PetRock.init;

import java.lang.reflect.Array;
import java.util.Random;

import scala.collection.concurrent.Debug;

import com.YunusKayne.PetRock.utility.LogHelper;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.init.Blocks;

public class PetRockEventHandler
{		
	private static ItemStack[] o;
	private static Block[] p;
	public static int meta;
	public static HarvestDropsEvent Event;
	private static int total = 0;
	private static int current = 0;
	private static int setMaxRange = 100;

	public static void addPetriumPickaxeRecipe(ItemStack itemStack, Block params)
	{
		total++;
		
		//String outputS = itemStack.toString();
		//String paramsS = params.toString();
		//Object oo = (Object) output;

		o[total] = itemStack;
		p[total] = params;
	}

	private static boolean isBlockEqual()
	{
		boolean a = false;
		if(!a)
		{
			while(current >= setMaxRange)
			{
				String pString = (String) (Object) PetRockEventHandler.p[current];
				if(Event.block.equals(PetRockEventHandler.p[current]) && !pString.isEmpty())
				{
					LogHelper.chat("true");
					a = true;
				}
				else if (current == setMaxRange) return false;
			}
		}
		return true;
	}

	@SubscribeEvent
	public void harvestDrops(HarvestDropsEvent event)
	{
		ItemStack CurrentItem = event.harvester.getCurrentEquippedItem();
		meta = event.blockMetadata;
		Event = event;
		ItemStack[] itemOutput = {};
		Block[] itemParams = {};
		itemOutput[current] = PetRockEventHandler.o[current];
		itemParams[current] = PetRockEventHandler.p[current];
		Object PetriumPick = Tools.PetriumPickaxe;

		if(event.block.equals(Blocks.stone) || event.block.equals(Blocks.cobblestone))
		{
			for(int x = event.drops.size() - 1; x >= 0; x--)
			{
				if(CurrentItem.getItem().equals(PetriumPick))
				{
					Random random = new Random();
					event.drops.remove(x);
					event.dropChance = 0.7F;
					event.drops.add(new ItemStack(Items.crushedStone));
				}
			}
		}

		LogHelper.chat("params: " + itemParams);
		LogHelper.chat("output:" + itemOutput);
		LogHelper.chat("Metadata: " + PetRockEventHandler.meta);
		LogHelper.chat("Total: " + total);
		LogHelper.chat("Current: " + current);

		ItemStack[] Output = {};
		Block[] Params = {};
		Output[current] = itemOutput[current];
		Params[current] = itemParams[current];
		int a = 0;

		LogHelper.chat("CurrentItem: " + CurrentItem);
		if(CurrentItem.getItem().equals(PetriumPick) && isBlockEqual())
		{
			LogHelper.info(Output[current]);
			event.drops.add(Output[current]);
			a++;
		}
		else LogHelper.chat("Not working: " + Output[current] + " :Output - itemOutput: " + itemOutput[current]);
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
			if(CurrentItem.getItem().equals(PetriumPick)) {
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
			if(CurrentItem.getItem().equals(PetriumPick)) {
				event.drops.add(new ItemStack(Blocks.glass_pane,1,event.blockMetadata));
			}
		}
	}
}
