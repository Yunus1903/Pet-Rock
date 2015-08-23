package com.YunusKayne.PetRock.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
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
		
		GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone, 1), //Debug
				"AA",
				"AA",
				'A', Items.crushedStone);
		
		GameRegistry.addRecipe(new ItemStack(Tools.PetriumPickaxe, 1), //Debug
				"AAA",
				" B ",
				" B ",
				'A', com.YunusKayne.PetRock.init.Blocks.blockPetrium, 'B', net.minecraft.init.Items.stick);
		
		GameRegistry.addRecipe(new ItemStack(TileEntitys.petrockCrate, 1),
				"AAA",
				"BCB",
				"BBB",
				'A', Blocks.wooden_slab, 'B', Blocks.planks, 'C', com.YunusKayne.PetRock.init.Blocks.blockPetrium);
		
		
		//Shapeless Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(Items.matterPetrium, 9), new ItemStack(com.YunusKayne.PetRock.init.Blocks.blockPetrium));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.canisterEmptyLove, 1), new ItemStack(Items.canisterLove));
		
		
		//Smelting Recipe
		GameRegistry.addSmelting(com.YunusKayne.PetRock.init.Blocks.orePetrium, new ItemStack(Items.matterPetrium), 0.5f);
		
		
		//Petrium Pickaxe Recipe
		//RecipeHandler.addPetriumPickaxeRecipe(new ItemStack(Blocks.stained_glass, 1, PetRockEventHandler.meta), Blocks.stained_glass); //meta get's loaded in-game so it will always be 0
		//RecipeHandler.addPetriumPickaxeRecipe(new ItemStack(Blocks.glass), Blocks.glass);
		
		//Temp Recipe's (DEBUG)
		GameRegistry.addRecipe(new ItemStack(Items.canisterLove, 1),
				"BCB",
				"CAC",
				"BCB",
				'A', Items.canisterEmptyLove, 'B', Items.matterPetrium, 'C', Blocks.red_flower);
		
		
	}
}
