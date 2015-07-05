package com.YunusKayne.PetRock.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import com.YunusKayne.PetRock.utility.RecipeHandler;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes
{
	public static void init()
	{
		//Shaped Recipe
		GameRegistry.addRecipe(new ItemStack(com.YunusKayne.PetRock.init.Blocks.blockPetrium, 1),
				"AAA",
				"AAA",
				"AAA",
			    'A', Items.matterPetrium);
		
		GameRegistry.addRecipe(new ItemStack(Items.canisterEmptyLove, 1),
				"AAA",
				"ABA",
				"AAA",
				'A', Blocks.glass, 'B', net.minecraft.init.Items.diamond);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone, 1),
				"AA",
				"AA",
				'A', Items.crushedStone);
		
		
		GameRegistry.addRecipe(new ItemStack(Tools.PetriumPickaxe, 1),
				"AAA",
				" B ",
				" B ",
				'A', com.YunusKayne.PetRock.init.Blocks.blockPetrium, 'B', net.minecraft.init.Items.stick);
		
		
		//Shapeless Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(Items.matterPetrium, 9), new ItemStack(com.YunusKayne.PetRock.init.Blocks.blockPetrium));
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
		GameRegistry.addSmelting(com.YunusKayne.PetRock.init.Blocks.orePetrium, new ItemStack(Items.matterPetrium), 0.5f);
		
		//Petrium Pickaxe Recipe
		RecipeHandler.addPetriumPickaxeRecipe(new ItemStack(Blocks.stained_glass, 1, PetRockEventHandler.meta), Blocks.stained_glass);
		RecipeHandler.addPetriumPickaxeRecipe(new ItemStack(Blocks.glass),  Blocks.glass);
	}
}
