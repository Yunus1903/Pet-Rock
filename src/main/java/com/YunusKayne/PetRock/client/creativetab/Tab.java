package com.YunusKayne.PetRock.client.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.YunusKayne.PetRock.Reference;
import com.YunusKayne.PetRock.init.Items;

public class Tab
{
	public static final CreativeTabs PetRockTab = new CreativeTabs(Reference.MOD_ID)
	{
		@Override
		public Item getTabIconItem()
		{
			return Items.itemPetRock;
		}
	};
}
