package com.YunusKayne.PetRock.init;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes
{
	public static void init()
	{
		//Shaped Recipe
		GameRegistry.addRecipe(new ItemStack(Blocks.blockPetrium, 1),
				"AAA",
				"AAA",
				"AAA",
			    'A', Items.matterPetrium);
		
		GameRegistry.addRecipe(new ItemStack(Items.canisterEmptyLove, 1),
				"AAA",
				"ABA",
				"AAA",
				'A', net.minecraft.init.Blocks.glass, 'B', net.minecraft.init.Items.diamond);
		
		//Shapeless Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(Items.matterPetrium, 9), new ItemStack(Blocks.blockPetrium));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.canisterEmptyLove, 1), new ItemStack(Items.canisterLove));
		
			//Extra Random Recipes
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.diamond, 3), new ItemStack(net.minecraft.init.Items.diamond_pickaxe));
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.gold_ingot, 3), new ItemStack(net.minecraft.init.Items.golden_pickaxe));
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.iron_ingot, 3), new ItemStack(net.minecraft.init.Items.iron_pickaxe));
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Blocks.cobblestone, 3), new ItemStack(net.minecraft.init.Items.stone_pickaxe));
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Blocks.planks, 3), new ItemStack(net.minecraft.init.Items.wooden_pickaxe));
			
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.diamond, 3), new ItemStack(net.minecraft.init.Items.diamond_axe));
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.gold_ingot, 3), new ItemStack(net.minecraft.init.Items.golden_axe));
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.iron_ingot, 3), new ItemStack(net.minecraft.init.Items.iron_axe));
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Blocks.cobblestone, 3), new ItemStack(net.minecraft.init.Items.stone_axe));
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Blocks.planks, 3), new ItemStack(net.minecraft.init.Items.wooden_axe));
			
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.diamond, 1), new ItemStack(net.minecraft.init.Items.diamond_shovel));
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.gold_ingot, 1), new ItemStack(net.minecraft.init.Items.golden_shovel));
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.iron_ingot, 1), new ItemStack(net.minecraft.init.Items.iron_shovel));
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Blocks.cobblestone, 1), new ItemStack(net.minecraft.init.Items.stone_shovel));
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Blocks.planks, 1), new ItemStack(net.minecraft.init.Items.wooden_shovel));
			
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.diamond, 2), new ItemStack(net.minecraft.init.Items.diamond_hoe));
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.gold_ingot, 2), new ItemStack(net.minecraft.init.Items.golden_hoe));
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.iron_ingot, 2), new ItemStack(net.minecraft.init.Items.iron_hoe));
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Blocks.cobblestone, 2), new ItemStack(net.minecraft.init.Items.stone_hoe));
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Blocks.planks, 2), new ItemStack(net.minecraft.init.Items.wooden_hoe));
			
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.diamond, 2), new ItemStack(net.minecraft.init.Items.diamond_sword));
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.gold_ingot, 2), new ItemStack(net.minecraft.init.Items.golden_sword));
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Items.iron_ingot, 2), new ItemStack(net.minecraft.init.Items.iron_sword));
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Blocks.cobblestone, 2), new ItemStack(net.minecraft.init.Items.stone_sword));
			GameRegistry.addShapelessRecipe(new ItemStack(net.minecraft.init.Blocks.planks, 2), new ItemStack(net.minecraft.init.Items.wooden_sword));
		
		
		//Smelting Recipe
		GameRegistry.addSmelting(Blocks.orePetrium, new ItemStack(Items.matterPetrium), 0.5f);
	}
}
