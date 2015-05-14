package com.YunusKayne.PetRock.init;

import net.minecraft.block.material.Material;

import com.YunusKayne.PetRock.items.ingotPetrium;

import cpw.mods.fml.common.registry.GameRegistry;

public class Items
{
	//List of items
	public static ingotPetrium ingotPetrium = new ingotPetrium(Material.rock, "ingotPetrium");
		
	public static void initItems()
	{
		//Item Registry's
		GameRegistry.registerItem(ingotPetrium, "ingotPetrium");
	}
}
