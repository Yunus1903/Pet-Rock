package com.YunusKayne.PetRock.init;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes
{
	public static void init()
	{
		//Shaped Recipe
		GameRegistry.addRecipe(new ItemStack(Blocks.blockPetrium),
				"AAA",
				"AAA",
				"AAA",
			    'A', Items.matterPetrium);
		
		GameRegistry.addRecipe(new ItemStack(Items.canisterEmptyLove),
				"AAA",
				"ABA",
				"AAA",
				'A', net.minecraft.init.Blocks.glass, 'B', net.minecraft.init.Items.diamond);
		
		//Shapeless Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(Items.matterPetrium,9), new ItemStack(Blocks.blockPetrium));
		
		
		//Smelting Recipe
		GameRegistry.addSmelting(Blocks.orePetrium, new ItemStack(Items.matterPetrium), 0.5f);
	}
}
