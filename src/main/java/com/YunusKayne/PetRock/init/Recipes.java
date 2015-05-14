package com.YunusKayne.PetRock.init;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes
{
	public static void init()
	{
		//Smelting Recipe
		GameRegistry.addSmelting(Blocks.orePetrium, new ItemStack(Items.ingotPetrium), 0.5f);
	}
}
