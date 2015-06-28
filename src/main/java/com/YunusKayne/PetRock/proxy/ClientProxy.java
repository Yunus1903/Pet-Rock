package com.YunusKayne.PetRock.proxy;

import com.YunusKayne.PetRock.PetRock;
import com.YunusKayne.PetRock.client.models.ModelPetRock;
import com.YunusKayne.PetRock.entity.entityPetRock;
import com.YunusKayne.PetRock.items.itemPetRock;
import com.YunusKayne.PetRock.render.RenderItemPetRock;
import com.YunusKayne.PetRock.render.RenderPetRock;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy
{
	public static void registerRendering()
	{
		RenderingRegistry.registerEntityRenderingHandler(entityPetRock.class, new RenderPetRock(new ModelPetRock(), 0));
		MinecraftForgeClient.registerItemRenderer(com.YunusKayne.PetRock.init.Items.itemPetRock, (IItemRenderer)new RenderItemPetRock());
	}
}
