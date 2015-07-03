package com.YunusKayne.PetRock.client.render;

import com.YunusKayne.PetRock.entity.entityPetRock;
import com.YunusKayne.PetRock.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderPetRock extends RenderLiving
{
    private static final ResourceLocation entityTextures = new ResourceLocation(Reference.MOD_ID +  ":textures/entity/entityPetRock.png");
    private static final String __OBFID = "CL_00000984";

    public RenderPetRock(ModelBase p_i1253_1_, float p_i1253_2_)
    {
        super(p_i1253_1_, p_i1253_2_);
    }

    protected ResourceLocation getEntityTexture(entityPetRock p_110775_1_)
    {
        return entityTextures;
    }

    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return this.getEntityTexture((entityPetRock)p_110775_1_);
    }
}