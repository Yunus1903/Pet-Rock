package com.YunusKayne.PetRock.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.YunusKayne.PetRock.Reference;
import com.YunusKayne.PetRock.client.creativetab.Tab;

public class orePetrium extends Block
{
	public orePetrium(Material rock, String name)
	{
		super(rock);
		this.setBlockName(name);
		this.setCreativeTab(Tab.PetRockTab);
		this.setBlockTextureName(Reference.MOD_ID + ":orePetrium");
		this.setStepSound(soundTypePiston);
		this.setHardness(6.0F);
		this.setResistance(5.0F);
	}
}
