package com.YunusKayne.PetRock.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.YunusKayne.PetRock.Reference;
import com.YunusKayne.PetRock.client.creativetab.Tab;

public class blockPetrium extends Block
{
	public blockPetrium(Material rock, String name)
	{
		super(rock);
		this.setBlockName(name);
		this.setCreativeTab(Tab.PetRockTab);
		this.setBlockTextureName(Reference.MOD_ID + ":blockPetrium");
		this.setStepSound(soundTypePiston);
		this.setHardness(10.0F);
		this.setResistance(10.0F);
	}
}
