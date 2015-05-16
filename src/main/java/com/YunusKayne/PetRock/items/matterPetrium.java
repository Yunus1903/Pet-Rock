package com.YunusKayne.PetRock.items;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.YunusKayne.PetRock.creativetab.Tab;
import com.YunusKayne.PetRock.init.Items;
import com.YunusKayne.PetRock.reference.Reference;

public class matterPetrium extends Item
{
	public matterPetrium(Material snow, String name)
	{
		this.setUnlocalizedName(name);
		this.setCreativeTab(Tab.PetRockTab);
		this.setTextureName(Reference.MOD_ID + ":matterPetrium");
		
		OreDictionary.registerOre("matterPetrium", Items.matterPetrium);
	}
}
