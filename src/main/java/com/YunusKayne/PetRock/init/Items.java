package com.YunusKayne.PetRock.init;

import net.minecraftforge.oredict.OreDictionary;

import com.YunusKayne.PetRock.Models.ModelPetRock;
import com.YunusKayne.PetRock.client.handler.ConfigHandler;
import com.YunusKayne.PetRock.items.canisterEmptyLove;
import com.YunusKayne.PetRock.items.canisterLove;
import com.YunusKayne.PetRock.items.itemPetRock;
import com.YunusKayne.PetRock.items.matterPetrium;
import com.YunusKayne.PetRock.render.RenderPetRock;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class Items
{	
	//List of items
	public static matterPetrium matterPetrium = new matterPetrium("matterPetrium");
	public static canisterLove canisterLove = new canisterLove("canisterLove", 0, 0, true);
	public static canisterEmptyLove canisterEmptyLove = new canisterEmptyLove("canisterEmptyLove");
	public static itemPetRock itemPetRock = new itemPetRock("itemPetRock");
		
	public static void initItems()
	{
		//Item Registry's
		GameRegistry.registerItem(matterPetrium, "matterPetrium");
		GameRegistry.registerItem(canisterLove, "canisterLove");
		GameRegistry.registerItem(canisterEmptyLove, "canisterEmptyLove");
		if(ConfigHandler.useItemPetRock)
		{
			GameRegistry.registerItem(itemPetRock, "itemPetRock");
		}
		
		//OreDictionary
		OreDictionary.registerOre("matterPetrium", Items.matterPetrium);
	}
}
