package com.YunusKayne.PetRock.init;

import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityList;
import net.minecraft.world.WorldType;

import com.YunusKayne.PetRock.PetRock;
import com.YunusKayne.PetRock.blocks.orePetrium;
import com.YunusKayne.PetRock.client.handler.ConfigHandler;
import com.YunusKayne.PetRock.entity.entityPetRock;

import cpw.mods.fml.common.registry.EntityRegistry;

public class Entity
{
	public static void initEntity()
	{
		createEntity(entityPetRock.class, "entityPetRock", 0x535353, 0xB8B8B8, !ConfigHandler.useItemPetRock);
	}
	
	public static void createEntity(Class entityClass, String entityName, int eggPrimaryColor, int eggSecondaryColor, boolean createEgg)
	{
		int RandomId = EntityRegistry.findGlobalUniqueEntityId();
		
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, RandomId);
		EntityRegistry.registerModEntity(entityClass, entityName, RandomId, PetRock.instance, 64, 1, true);
		if(createEgg)
		{
			createEgg(RandomId, eggPrimaryColor, eggSecondaryColor);
		}
	}

	private static void createEgg(int RandomId, int eggPrimaryColor, int eggSecondaryColor)
	{
		EntityList.entityEggs.put(Integer.valueOf(RandomId), new EntityList.EntityEggInfo(RandomId, eggPrimaryColor, eggSecondaryColor));
	}
}
