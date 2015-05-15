package com.YunusKayne.PetRock.items;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.YunusKayne.PetRock.creativetab.Tab;
import com.YunusKayne.PetRock.reference.Reference;

public class canisterLove extends Item
{
	public canisterLove(Material glass, String name)
	{
		this.setUnlocalizedName(name);
		this.setCreativeTab(Tab.PetRockTab);
		this.setTextureName(Reference.MOD_ID + ":canisterLove");
	}
}
