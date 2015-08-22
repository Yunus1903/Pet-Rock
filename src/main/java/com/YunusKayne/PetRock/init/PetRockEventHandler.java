package com.YunusKayne.PetRock.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;

public class PetRockEventHandler
{		
	
	
	public static int meta;
	public static ItemStack CurrentItem;
	public static HarvestDropsEvent Event;

	/*
	@SubscribeEvent
	public void harvestDrops(HarvestDropsEvent event)
	{
		Event = event;
		CurrentItem = event.harvester.getCurrentEquippedItem();
		RecipeHandler.PetriumPick = CurrentItem.getItem().equals(Tools.PetriumPickaxe);
		meta = event.blockMetadata;

		ChatHelper.ChatMessageString("------------------------------------------");
		ChatHelper.Debug("Metadata: " + PetRockEventHandler.meta);
		ChatHelper.Debug("isBlockEqual: " + RecipeHandler.isBlockEqual());
		ChatHelper.Debug("Petrium Pickaxe: " + RecipeHandler.PetriumPick);

		if(RecipeHandler.current > RecipeHandler.total)
		{
			ChatHelper.Debug("current > total --> " + RecipeHandler.current + " > " + RecipeHandler.total);
			RecipeHandler.current = 0;
		}
		else if(RecipeHandler.PetriumPick && RecipeHandler.isBlockEqual())
		{
			event.drops.add(RecipeHandler.o[RecipeHandler.current]);
			ChatHelper.Debug("---Dropped--- " + RecipeHandler.current);
			RecipeHandler.current = 0;
		}
		else if(!RecipeHandler.PetriumPick || !RecipeHandler.isBlockEqual()) {ChatHelper.Debug("NOT WORKING! " + RecipeHandler.current); RecipeHandler.current = 0;}
		ChatHelper.Debug("Initialized");

		if(event.block.equals(Blocks.stone))
		{
			for(int x = event.drops.size() - 1; x >= 0; x--)
			{
				if(RecipeHandler.PetriumPick)
				{
					Random random = new Random();
					event.drops.remove(x);
					event.dropChance = 0.7F;
					event.drops.add(new ItemStack(Items.crushedStone));
					RecipeHandler.current = 0;
				}
			}
		}
		if(event.block.equals(Blocks.stained_glass_pane)) {
			if(RecipeHandler.PetriumPick) {
				event.drops.add(new ItemStack(Blocks.stained_glass_pane, 1, event.blockMetadata));
			}
		}
		if(event.block.equals(Blocks.glass_pane)) {
			if(RecipeHandler.PetriumPick) {
				event.drops.add(new ItemStack(Blocks.glass_pane,1,event.blockMetadata));
			}
		}
	}
	*/
}
