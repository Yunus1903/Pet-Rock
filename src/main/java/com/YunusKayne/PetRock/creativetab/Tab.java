package com.YunusKayne.PetRock.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.YunusKayne.PetRock.init.Items;
import com.YunusKayne.PetRock.reference.Reference;

public class Tab
{
	public static final CreativeTabs PetRockTab = new CreativeTabs(Reference.MOD_ID)
	{
		@Override
		public Item getTabIconItem()
		{
			return Items.matterPetrium;
		}
	};
}
