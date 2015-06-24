package com.YunusKayne.PetRock.init;

import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityList;
import net.minecraft.world.WorldType;

import com.YunusKayne.PetRock.PetRock;
import com.YunusKayne.PetRock.blocks.orePetrium;
import com.YunusKayne.PetRock.entity.entityPetRock;

import cpw.mods.fml.common.registry.EntityRegistry;

public class Entity
{
	//public static entityPetRock entityPetRock = new entityPetRock(net.minecraft.world.World, "entityPetRock");
	
	public static void initEntity()
	{
		//EntityRegistry.registerGlobalEntityID(entityPetRock, "entityPetRock", EntityRegistry.findGlobalUniqueEntityId());
		createEntity(entityPetRock.class, "entityPetRock", 0x0000FF, 0x00FF00);
	}
	
	public static void createEntity(Class entityClass, String entityName, int eggPrimaryColor, int eggSecondaryColor)
	{
		int RandomId = EntityRegistry.findGlobalUniqueEntityId();
		
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, RandomId);
		EntityRegistry.registerModEntity(entityClass, entityName, RandomId, PetRock.instance, 64, 1, true);
		createEgg(RandomId, eggPrimaryColor, eggSecondaryColor);
	}

	private static void createEgg(int RandomId, int eggPrimaryColor, int eggSecondaryColor)
	{
		EntityList.entityEggs.put(Integer.valueOf(RandomId), new EntityList.EntityEggInfo(RandomId, eggPrimaryColor, eggSecondaryColor));
	}
}
