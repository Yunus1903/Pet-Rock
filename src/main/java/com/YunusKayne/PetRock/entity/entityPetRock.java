package com.YunusKayne.PetRock.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class entityPetRock extends EntityAnimal
{
	public entityPetRock(World world)
	{
		super(world);
		this.setSize(0.8F, 0.5F);
		this.isImmuneToFire = true;
	}

	public boolean isAIEnabled()
	{
		return false;
	}
	
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0D); //Health
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.0D); //Movement Speed
	}
	
	protected Item getDropItem()
    {
		this.entityDropItem(new ItemStack(com.YunusKayne.PetRock.init.Items.itemPetRock), 0.0F);
        return Item.getItemById(0);
    }
	
	@Override
	public EntityAgeable createChild(EntityAgeable p_90011_1_)
	{
		return new entityPetRock(worldObj);
	}
}
