package com.YunusKayne.PetRock.items;

import java.util.List;

import com.YunusKayne.PetRock.creativetab.Tab;
import com.YunusKayne.PetRock.entity.entityPetRock;
import com.YunusKayne.PetRock.utility.ChatHelper;
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
	public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
	{
		if (!world.isRemote)
		{
			if (!player.capabilities.isCreativeMode)
			{
				--item.stackSize;
			}
			EntityPlayer p = world.getClosestPlayer(x, y, z, 100);
			float yaw = p.rotationYaw;
			float pitch = p.rotationPitch;
			
			entityPetRock PetRock = new entityPetRock(world);
			PetRock.setLocationAndAngles(x, y, z, yaw, pitch);
			
			world.spawnEntityInWorld(PetRock);
			ChatHelper.ChatMessage("PetRockTime");
			return true;
		}
		return false;
	}
}
