package com.YunusKayne.PetRock.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelPetrockCrate - TheKayneGame
 * Created using Tabula 5.1.0
 */

public class ModelPetrockCrate extends ModelBase
{
	public ModelRenderer shape1;
	public ModelRenderer shape2;
	public ModelRenderer shape3;
	public ModelRenderer shape4;
	public ModelRenderer shape5;
	public ModelRenderer shape7;

	public ModelPetrockCrate()
	{
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.shape1 = new ModelRenderer(this, 0, 0);
		this.shape1.setRotationPoint(-6.0F, 10.0F, -7.0F);
		this.shape1.addBox(0.0F, 0.0F, 0.0F, 13, 14, 1, 0.0F);
		this.shape5 = new ModelRenderer(this, 0, 19);
		this.shape5.setRotationPoint(-6.0F, 23.0F, -6.0F);
		this.shape5.addBox(0.0F, 0.0F, 0.0F, 12, 1, 12, 0.0F);
		this.shape4 = new ModelRenderer(this, 0, 6);
		this.shape4.setRotationPoint(6.0F, 10.0F, -6.0F);
		this.shape4.addBox(0.0F, 0.0F, 0.0F, 1, 14, 12, 0.0F);
		this.shape2 = new ModelRenderer(this, 28, 0);
		this.shape2.setRotationPoint(-7.0F, 10.0F, -7.0F);
		this.shape2.addBox(0.0F, 0.0F, 0.0F, 1, 14, 13, 0.0F);
		this.shape3 = new ModelRenderer(this, 0, 17);
		this.shape3.setRotationPoint(-7.0F, 10.0F, 6.0F);
		this.shape3.addBox(0.0F, 0.0F, 0.0F, 14, 14, 1, 0.0F);
		this.shape7 = new ModelRenderer(this, 0, 17);
		this.shape7.setRotationPoint(-5.6F, 9.0F, 4.4F);
		this.shape7.addBox(0.0F, 0.0F, 0.0F, 14, 1, 14, 0.0F);
		this.setRotateAngle(shape7, 0.0F, 1.1383037381507017F, 0.0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{ 
		this.shape1.render(f5);
		this.shape5.render(f5);
		this.shape4.render(f5);
		this.shape2.render(f5);
		this.shape3.render(f5);
		this.shape7.render(f5);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	 public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
	 {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	 }
}
