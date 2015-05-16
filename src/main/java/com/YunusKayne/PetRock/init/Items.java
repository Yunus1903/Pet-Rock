package com.YunusKayne.PetRock.init;

import net.minecraft.block.material.Material;

import com.YunusKayne.PetRock.items.canisterEmptyLove;
import com.YunusKayne.PetRock.items.canisterLove;
import com.YunusKayne.PetRock.items.matterPetrium;

import cpw.mods.fml.common.registry.GameRegistry;

public class Items
{
	//List of items
	public static matterPetrium matterPetrium = new matterPetrium(Material.snow, "matterPetrium");
	public static canisterLove canisterLove = new canisterLove(Material.glass, "canisterLove");
	public static canisterEmptyLove canisterEmptyLove = new canisterEmptyLove(Material.glass, "canisterEmptyLove");
		
	public static void initItems()
	{
		//Item Registry's
		GameRegistry.registerItem(matterPetrium, "matterPetrium");
		GameRegistry.registerItem(canisterLove, "canisterLove");
		GameRegistry.registerItem(canisterEmptyLove, "canisterEmptyLove");
	}
}
