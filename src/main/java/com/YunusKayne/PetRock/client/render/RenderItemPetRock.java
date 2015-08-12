package com.YunusKayne.PetRock.client.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import com.YunusKayne.PetRock.Reference;
import com.YunusKayne.PetRock.client.models.ModelPetRock;

public class RenderItemPetRock implements IItemRenderer
{
	protected ModelPetRock Model;

	public RenderItemPetRock()
	{
		Model = new ModelPetRock();
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type)
	{
		switch(type)
		{
		case EQUIPPED: return true;
		default: return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
	{
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data)
	{
		switch(type)
		{
		case EQUIPPED:
		{
			GL11.glPushMatrix();

			Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Reference.MOD_ID + ":textures/items/itemPetRock.png"));

			float scale = 1.0F;

			GL11.glScalef(scale, scale, scale);

			GL11.glRotatef(0.0F, 1.0F, 0.0F, 0.0F); //x
			GL11.glRotatef(0.0F, 0.0F, 1.0F, 0.0F); //y
			GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F); //z

			if(data[1] != null && data[1] instanceof EntityPlayer)
			{
				if(!((EntityPlayer)data[1] == Minecraft.getMinecraft().renderViewEntity && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0 && !((Minecraft.getMinecraft().currentScreen instanceof GuiInventory || Minecraft.getMinecraft().currentScreen instanceof GuiContainerCreative) && RenderManager.instance.playerViewY == 180.0F)))
				{
					GL11.glTranslatef(0.0F, -0.7F, 0.0F);
				}
			}
			else
			{
				GL11.glTranslatef(0.0F, -0.7F, 0.0F);
			}

			Model.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

			GL11.glPopMatrix();
		}
		default: break;
		}
	}
}
