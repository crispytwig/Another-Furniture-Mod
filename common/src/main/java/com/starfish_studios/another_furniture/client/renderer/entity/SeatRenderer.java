package com.starfish_studios.another_furniture.client.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.starfish_studios.another_furniture.entity.SeatEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

@Environment(value= EnvType.CLIENT)
public class SeatRenderer extends EntityRenderer<SeatEntity> {
    public SeatRenderer(EntityRendererProvider.Context context)
    {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(SeatEntity seatEntity)
    {
        return null;
    }

    @Override
    protected void renderNameTag(SeatEntity entity, Component displayName, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, float partialTick) {}
}