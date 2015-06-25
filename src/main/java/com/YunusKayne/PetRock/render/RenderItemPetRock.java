package com.YunusKayne.PetRock.render;

import org.lwjgl.opengl.GL11;

import com.YunusKayne.PetRock.Models.ModelPetRock;
import com.YunusKayne.PetRock.reference.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

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
		return false;
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
				
				Model.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
				
				GL11.glPopMatrix();
			}
			default: break;
		}
	}
}