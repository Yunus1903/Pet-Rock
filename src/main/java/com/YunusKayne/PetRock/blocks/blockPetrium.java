package com.YunusKayne.PetRock.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

import com.YunusKayne.PetRock.creativetab.Tab;
import com.YunusKayne.PetRock.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class blockPetrium extends Block
{
	public blockPetrium(Material rock, String name)
	{
		super(rock);
		this.setBlockName(name);
		this.setCreativeTab(Tab.PetRockTab);
		this.setBlockTextureName("PetRock:blockPetrium");
		this.setStepSound(soundTypeMetal);
		this.setHardness(5.0F);
		this.setResistance(10.0F);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
	this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName());
	}
}
