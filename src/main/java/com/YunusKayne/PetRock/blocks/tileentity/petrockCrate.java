package com.YunusKayne.PetRock.blocks.tileentity;

import com.YunusKayne.PetRock.Reference;
import com.YunusKayne.PetRock.client.creativetab.Tab;
import com.YunusKayne.PetRock.entity.entityPetRock;
import com.YunusKayne.PetRock.entity.Tile.petrockCrateEntity;
import com.YunusKayne.PetRock.init.Items;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class petrockCrate extends BlockContainer
{
	public petrockCrate(Material material, String name)
	{
		super(material);
		this.setBlockName(name);
		this.setCreativeTab(Tab.PetRockTab);
		this.setBlockBounds(0.1F, 0.0F, 0.1F, 0.9F, 1.0F, 0.9F); 
		this.setBlockTextureName(Reference.MOD_ID + ":" + name);
		this.setHardness(2.0F);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int id)
	{
		return new petrockCrateEntity();
	}

	@Override
	public int getRenderType()
	{
		return -1;
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	public boolean renderAsNormalBlock()
	{
		return false;
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
	{
		NBTTagCompound nbt = new NBTTagCompound();
		TileEntity entity = world.getTileEntity(x,y,z);
		entity.writeToNBT(nbt);
		entity.readFromNBT(nbt);
		
		if (world.isRemote)
		{
			return true;
		}
		else
		{
			final InventoryPlayer inventory = player.inventory;

			if(ItemStack.areItemStacksEqual(inventory.getCurrentItem(), new ItemStack(Items.canisterLove)) && !nbt.getBoolean("item1"))
			{
				nbt.setBoolean("item1", true);
				return this.doThings(world, player, inventory, new ItemStack(Items.canisterLove), x, y, z, nbt);
			}
			else if(ItemStack.areItemStacksEqual(inventory.getCurrentItem(), new ItemStack(Items.matterPetrium)) && !nbt.getBoolean("item2"))
			{
				nbt.setBoolean("item2", true);
				return this.doThings(world, player, inventory, new ItemStack(Items.matterPetrium), x, y, z, nbt);
			}
			else
			{
				return false;
			}
		}
	}

	public boolean doThings(World world, EntityPlayer player, InventoryPlayer inventory, ItemStack item, int x, int y, int z, NBTTagCompound nbt)
	{
		if (!player.capabilities.isCreativeMode)
		{
			inventory.decrStackSize(inventory.currentItem, 1);
		}

		if(nbt.getBoolean("item1") && nbt.getBoolean("item2"))
		{
			world.setBlockToAir(x, y, z);
			//Block block = world.getBlock(x, y, z);
			//block.breakBlock(world, x, y, z, block, world.getBlockMetadata(x, y, z));

			float yaw = player.rotationYaw;
			float pitch = player.rotationPitch;

			final entityPetRock entityPetRock = new entityPetRock(world);
			entityPetRock.setLocationAndAngles(x+0.5, y+1.5, z+0.5, yaw, pitch);

			world.spawnEntityInWorld(entityPetRock);

			nbt.setBoolean("item1", false);
			nbt.setBoolean("item2", false);
			return true;
		}
		else
		{
			return false;
		}
	}
}