package com.YunusKayne.PetRock.init;

import net.minecraft.block.material.Material;

import com.YunusKayne.PetRock.blocks.blockPetrium;
import com.YunusKayne.PetRock.blocks.orePetrium;

import cpw.mods.fml.common.registry.GameRegistry;

public class Blocks
{
	//List of blocks
	public static orePetrium orePetrium = new orePetrium(Material.rock, "orePetrium");
	public static blockPetrium blockPetrium = new blockPetrium(Material.rock, "orePetrium");
	
	
	public static void initBlocks()
	{
		//Block Registry's
		GameRegistry.registerBlock(orePetrium, "orePetrium");
		GameRegistry.registerBlock(blockPetrium, "blockPetrium");
	}
}
