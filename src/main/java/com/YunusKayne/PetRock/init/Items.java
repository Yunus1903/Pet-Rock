package com.YunusKayne.PetRock.init;

import net.minecraft.block.material.Material;

import com.YunusKayne.PetRock.items.ingotPetrium;
import com.YunusKayne.PetRock.items.itemLove;

import cpw.mods.fml.common.registry.GameRegistry;

public class Items
{
	//List of items
	public static ingotPetrium ingotPetrium = new ingotPetrium(Material.rock, "ingotPetrium");
	public static itemLove itemLove = new itemLove(Material.glass, "itemLove");
		
	public static void initItems()
	{
		//Item Registry's
		GameRegistry.registerItem(ingotPetrium, "ingotPetrium");
		GameRegistry.registerItem(itemLove, "itemLove");
	}
}
