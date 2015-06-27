package com.YunusKayne.PetRock.items;

import net.minecraft.item.Item;

import com.YunusKayne.PetRock.creativetab.Tab;
import com.YunusKayne.PetRock.reference.Reference;

public class crushedStone extends Item
{
	public crushedStone(String name)
	{
		this.setUnlocalizedName(name);
		this.setCreativeTab(Tab.PetRockTab);
		this.setTextureName(Reference.MOD_ID + ":" + name);
	}
}
