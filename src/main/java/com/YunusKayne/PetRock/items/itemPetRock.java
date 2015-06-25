package com.YunusKayne.PetRock.items;

import java.util.List;

import com.YunusKayne.PetRock.creativetab.Tab;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class itemPetRock extends Item
{
	public static Item itemID;

	public itemPetRock(String name)
	{
		this.setUnlocalizedName(name);
		this.setCreativeTab(Tab.PetRockTab);
		this.setMaxStackSize(1);
		this.setFull3D();
	}
	
	@Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
    {
		list.add(StatCollector.translateToLocal("Info.wip"));
    }
}
