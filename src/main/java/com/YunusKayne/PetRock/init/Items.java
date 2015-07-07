package com.YunusKayne.PetRock.init;

import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraftforge.oredict.OreDictionary;

import com.YunusKayne.PetRock.client.handler.ConfigHandler;
import com.YunusKayne.PetRock.client.models.ModelPetRock;
import com.YunusKayne.PetRock.client.render.RenderPetRock;
import com.YunusKayne.PetRock.items.canisterEmptyLove;
import com.YunusKayne.PetRock.items.canisterLove;
import com.YunusKayne.PetRock.items.crushedStone;
import com.YunusKayne.PetRock.items.itemPetRock;
import com.YunusKayne.PetRock.items.matterPetrium;

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
	public static crushedStone crushedStone = new crushedStone("crushedStone");
		
	public static void initItems()
	{
		//Item Registry's
		GameRegistry.registerItem(matterPetrium, "matterPetrium");
		GameRegistry.registerItem(canisterLove, "canisterLove");
		GameRegistry.registerItem(canisterEmptyLove, "canisterEmptyLove");
		if(ConfigHandler.useItemPetRock) GameRegistry.registerItem(itemPetRock, "itemPetRock");
		if(ConfigHandler.debugMode) GameRegistry.registerItem(crushedStone, "crushedStone"); //DEBUG
		
		//OreDictionary
		OreDictionary.registerOre("matterPetrium", Items.matterPetrium);
		OreDictionary.registerOre("crushedStone", Items.crushedStone);
	}
	
	public static boolean displayNameEqualsName(ItemStack itemStack) //Best name ever :P
	{
		String name = itemStack.getUnlocalizedName();
		if(itemStack.getDisplayName() == StatCollector.translateToLocal(name))
		{
			return true;
		}
		return false;
	}
}
