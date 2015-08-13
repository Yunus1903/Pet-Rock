package com.YunusKayne.PetRock.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Crate - TheKayneGame
 * Created using Tabula 5.1.0
 */
public class ModelPetrockCrate extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer shape3;
    public ModelRenderer shape4;
    public ModelRenderer shape5;
    public ModelRenderer shape8;

    public ModelPetrockCrate() {
        this.textureWidth = 64;
        this.textureHeight = 107;
        this.shape8 = new ModelRenderer(this, 0, 64);
        this.shape8.setRotationPoint(-5.399999999999999F, 8.999999999999991F, -5.1000000000000005F);
        this.shape8.addBox(0.0F, 0.0F, 0.0F, 14, 1, 14, 0.0F);
        this.setRotateAngle(shape8, 0.0F, 0.5918411493512771F, 0.0F);
        this.shape1 = new ModelRenderer(this, 26, 49);
        this.shape1.setRotationPoint(-6.999999999999995F, 9.999999999999988F, -7.099999999999996F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 14, 14, 1, 0.0F);
        this.shape4 = new ModelRenderer(this, 0, 38);
        this.shape4.setRotationPoint(6.000000000000023F, 9.999999999999988F, -6.099999999999998F);
        this.shape4.addBox(0.0F, 0.0F, 0.0F, 1, 14, 12, 0.0F);
        this.shape2 = new ModelRenderer(this, 30, 23);
        this.shape2.setRotationPoint(-6.999999999999995F, 9.999999999999988F, -6.099999999999998F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 1, 14, 12, 0.0F);
        this.shape5 = new ModelRenderer(this, 0, 10);
        this.shape5.setRotationPoint(-5.9999999999999964F, 23.00000000000004F, -6.099999999999998F);
        this.shape5.addBox(0.0F, 0.0F, 0.0F, 12, 1, 12, 0.0F);
        this.shape3 = new ModelRenderer(this, 0, 23);
        this.shape3.setRotationPoint(-6.999999999999995F, 9.999999999999988F, 5.900000000000022F);
        this.shape3.addBox(0.0F, 0.0F, 0.0F, 14, 14, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape8.render(f5);
        this.shape1.render(f5);
        this.shape4.render(f5);
        this.shape2.render(f5);
        this.shape5.render(f5);
        this.shape3.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
