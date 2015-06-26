package com.YunusKayne.PetRock.items;

import java.util.List;

import com.YunusKayne.PetRock.creativetab.Tab;
import com.YunusKayne.PetRock.entity.entityPetRock;
import com.YunusKayne.PetRock.utility.LogHelper;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class itemPetRock extends Item
{	
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

	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player)
	{
		if (!player.capabilities.isCreativeMode)
		{
			--item.stackSize;
			LogHelper.info("if thing");
		}	

		if (!world.isRemote)
		{
			world.spawnEntityInWorld(new entityPetRock(world));
			LogHelper.info("Spawned");
		}

		return item;
	}
}
