package com.YunusKayne.PetRock.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.YunusKayne.PetRock.utility.Kayne;

import cpw.mods.fml.client.FMLClientHandler;

public class entityPetRock extends EntityAnimal
{
	public int inLove;

	public static String customNameTag = "";

	private float Health = 2.0F;

	public entityPetRock(World world)
	{	
		super(world);
		EntityPlayer player = FMLClientHandler.instance().getClient().thePlayer;
		this.setSize(0.8F, 0.5F);
		this.isImmuneToFire = true; 
		this.setHealth(Health);
		if(player.getCommandSenderName().equals("TheKayneGame")) this.setCustomNameTag(Kayne.getRandomName());
		//else this.setCustomNameTag(customNameTag);
		//world.getWorldTime()
		
		//Do something with love | Use Health for it
	}

	@Override
	protected boolean isAIEnabled()
	{
		return true;
	}

	@Override
	protected boolean canDespawn()
	{
		return false;
	}

	@Override
	public boolean canBreatheUnderwater()
	{
		return true;
	}
	
	@Override
	public boolean canBePushed()
    {
        return false;
    }

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.0D);
	}

	protected Item getDropItem()
	{
		ItemStack item = new ItemStack(com.YunusKayne.PetRock.init.Items.itemPetRock);
		this.entityDropItem(item, 0.0F);
		//if(this.getCustomNameTag() != StatCollector.translateToLocal("item.itemPetRock.name"))
		{
			//if(!this.getCustomNameTag().isEmpty() && customNameTag != null && customNameTag != " ") item.setStackDisplayName(this.getCustomNameTag());
		}
		return Item.getItemById(0);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_)
	{
		return new entityPetRock(worldObj);
	}

	@Override
	public boolean isBreedingItem(ItemStack item)
	{
		return item.getItem() == com.YunusKayne.PetRock.init.Items.canisterLove;
	}

	@Override
	public boolean interact(EntityPlayer player)
	{
		ItemStack itemstack = player.inventory.getCurrentItem();

		if (itemstack != null && this.isBreedingItem(itemstack) && this.inLove <= 0)
		{	
			Health = Health + 2.0F;
			this.setHealth(Health);
			if (!player.capabilities.isCreativeMode)
			{
				--itemstack.stackSize;
				player.inventory.addItemStackToInventory(new ItemStack(com.YunusKayne.PetRock.init.Items.canisterEmptyLove));

				if (itemstack.stackSize <= 0)
				{
					player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack) null);
				}
			}

			this.func_146082_f(player);
			return true;
		}
		else
		{
			return super.interact(player);
		}

	}

	@Override
	public void onLivingUpdate()
	{
		super.onLivingUpdate();

		if (this.inLove > 0)
		{
			--this.inLove;
			String s = "heart";
			
			if (this.inLove % 10 == 0)
			{	
				double d0 = this.rand.nextGaussian() * 0.02D;
				double d1 = this.rand.nextGaussian() * 0.02D;
				double d2 = this.rand.nextGaussian() * 0.02D;
				this.worldObj.spawnParticle(s, this.posX + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, this.posY + 0.5D + (double)(this.rand.nextFloat() * this.height), this.posZ + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, d0, d1, d2);
			}
		}
	}

	@Override
	public boolean isInLove()
	{
		return this.inLove > 0;
	}

	@Override
	public void resetInLove()
	{
		this.inLove = 0;
	}

}
