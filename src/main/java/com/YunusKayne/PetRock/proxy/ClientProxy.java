package com.YunusKayne.PetRock.proxy;

import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

import com.YunusKayne.PetRock.client.handler.KeyInputHandler;
import com.YunusKayne.PetRock.client.models.ModelPetRock;
import com.YunusKayne.PetRock.client.render.RenderItemPetRock;
import com.YunusKayne.PetRock.client.render.RenderPetRock;
import com.YunusKayne.PetRock.client.render.RenderPetrockCrate;
import com.YunusKayne.PetRock.client.settings.Keybindings;
import com.YunusKayne.PetRock.entity.entityPetRock;
import com.YunusKayne.PetRock.entity.Tile.petrockCrateEntity;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;

public class ClientProxy extends CommonProxy
{
	public static void registerKeyInput()
	{
		FMLCommonHandler.instance().bus().register(new KeyInputHandler());
		Keybindings.init();
	}
	
	public static void registerRendering()
	{
		RenderingRegistry.registerEntityRenderingHandler(entityPetRock.class, new RenderPetRock(new ModelPetRock(), 0));
		MinecraftForgeClient.registerItemRenderer(com.YunusKayne.PetRock.init.Items.itemPetRock, (IItemRenderer) new RenderItemPetRock());
		ClientRegistry.bindTileEntitySpecialRenderer(petrockCrateEntity.class, new RenderPetrockCrate());
	}
}
