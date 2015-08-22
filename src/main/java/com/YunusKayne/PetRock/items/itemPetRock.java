package com.YunusKayne.PetRock.items;

import com.YunusKayne.PetRock.Reference;
import com.YunusKayne.PetRock.client.creativetab.Tab;
import com.YunusKayne.PetRock.entity.entityPetRock;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class itemPetRock extends Item
{	
	public itemPetRock(String name)
	{
		this.setUnlocalizedName(name);
		this.setCreativeTab(Tab.PetRockTab);
		this.setMaxStackSize(1);
		this.setFull3D();
		this.setTextureName(Reference.MOD_ID + ":" + name);
	}

	@Override
	public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side, float xOfset, float yOfset, float zOfset)
	{	
		if (!world.isRemote)
		{
			if (!player.capabilities.isCreativeMode)
			{
				--item.stackSize;
			}
			EntityPlayer p = world.getClosestPlayer(x, y, z, 10);
			float yaw = p.rotationYaw;
			float pitch = p.rotationPitch;
			
			entityPetRock entityPetRock = new entityPetRock(world);
			entityPetRock.setLocationAndAngles(x+0.5, y+1.5, z+0.5, yaw, pitch);
			
			/*
			com.YunusKayne.PetRock.entity.entityPetRock.customNameTag = "";
			if(!Items.displayNameEqualsName(item))
			{
				com.YunusKayne.PetRock.entity.entityPetRock.customNameTag = item.getDisplayName();
				ChatHelper.Debug("'" + item.getDisplayName()  + "' =notEqual= '" +  StatCollector.translateToLocal("item.itemPetRock.name") + "'");
				world.spawnEntityInWorld(entityPetRock);
				ChatHelper.Debug(com.YunusKayne.PetRock.entity.entityPetRock.customNameTag);
			}
			else if(Items.displayNameEqualsName(item))
			{
				com.YunusKayne.PetRock.entity.entityPetRock.customNameTag = "";
				ChatHelper.Debug(this.getItemStackDisplayName(item)  + " =Equal= " +  StatCollector.translateToLocal("item.itemPetRock.name"));
				world.spawnEntityInWorld(entityPetRock);
			}
			*/
			world.spawnEntityInWorld(entityPetRock); //DEBUG
			return true;
		}
		return false;
	}
}
