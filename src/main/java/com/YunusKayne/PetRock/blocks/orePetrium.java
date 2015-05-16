package com.YunusKayne.PetRock.blocks;

import com.YunusKayne.PetRock.creativetab.Tab;
import com.YunusKayne.PetRock.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class orePetrium extends Block
{
	public orePetrium(Material rock, String name)
	{
		super(rock);
		this.setBlockName(name);
		this.setCreativeTab(Tab.PetRockTab);
		this.setBlockTextureName(Reference.MOD_ID + ":orePetrium");
		this.setStepSound(soundTypePiston);
		this.setHardness(3.0F);
		this.setResistance(5.0F);
		
		//OreDictionary.registerOre("orePetrium", Blocks.orePetrium);
	}
}
