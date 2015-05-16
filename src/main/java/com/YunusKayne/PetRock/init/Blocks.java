package com.YunusKayne.PetRock.init;

import com.YunusKayne.PetRock.blocks.blockPetrium;
import com.YunusKayne.PetRock.blocks.orePetrium;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

public class Blocks
{
	//List of blocks
	public static orePetrium orePetrium = new orePetrium(Material.rock, "orePetrium");
	public static blockPetrium blockPetrium = new blockPetrium(Material.rock, "blockPetrium");
	
	
	public static void initBlocks()
	{
		//Block Registry's
		GameRegistry.registerBlock(orePetrium, "orePetrium");
		GameRegistry.registerBlock(blockPetrium, "blockPetrium");
	}
}
