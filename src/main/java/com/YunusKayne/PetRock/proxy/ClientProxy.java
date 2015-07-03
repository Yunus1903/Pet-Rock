package com.YunusKayne.PetRock.proxy;

import com.YunusKayne.PetRock.client.handler.KeyInputHandler;
import com.YunusKayne.PetRock.client.models.ModelPetRock;
import com.YunusKayne.PetRock.client.render.RenderItemPetRock;
import com.YunusKayne.PetRock.client.render.RenderPetRock;
import com.YunusKayne.PetRock.client.settings.Keybindings;
import com.YunusKayne.PetRock.entity.entityPetRock;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

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
	}
}
