package com.YunusKayne.PetRock.init;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import com.YunusKayne.PetRock.utility.ChatHelper;
import com.YunusKayne.PetRock.utility.LogHelper;

public class RecipeHandler
{
	private static ItemStack iStack = new ItemStack(Blocks.air);
	private static Block bBlock = Blocks.air;
	public static ItemStack[] o = {iStack, iStack, iStack, iStack, iStack, iStack, iStack, iStack, iStack, iStack, iStack, iStack, iStack, iStack, iStack};
	public static Block[] p = {bBlock, bBlock, bBlock, bBlock, bBlock, bBlock, bBlock, bBlock, bBlock, bBlock, bBlock, bBlock, bBlock, bBlock, bBlock};
	
	public static boolean PetriumPick;
	
	public static int total = 0;
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

	public static boolean isBlockEqual()
	{
		current = 0;
		boolean a = false;
		if(!a)
		{
			current++;
			while(current <= total && !a)
			{
				if(current > total) {current = 0; return false;}
				ChatHelper.Debug(current + " --> " + total);
				if(!p[current].getLocalizedName().isEmpty() && PetRockEventHandler.Event.block.equals(p[current]))
				{
					ChatHelper.Debug("---true---" + p[current]);
					a = true;
					LogHelper.info(a);
					LogHelper.info("It should work.");
					return a;
				}
				else if(!PetRockEventHandler.Event.block.equals(p[current])) current++;
				else if(p[current].getLocalizedName().isEmpty()) return false;
			}
		}
		return a;
	}
}
