package com.YunusKayne.PetRock.items;

import net.minecraft.item.Item;

import com.YunusKayne.PetRock.Reference;
import com.YunusKayne.PetRock.client.creativetab.Tab;

public class crushedStone extends Item
{
	public crushedStone(String name)
	{
		this.setUnlocalizedName(name);
		this.setCreativeTab(Tab.PetRockTab);
		this.setTextureName(Reference.MOD_ID + ":" + name);
	}
}
