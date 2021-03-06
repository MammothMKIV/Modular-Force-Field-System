package mffs.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

import org.lwjgl.opengl.GL11;

public class MFangYingJi extends ModelBase
{
	// fields
	ModelRenderer top;
	ModelRenderer axle;
	ModelRenderer bottom;
	ModelRenderer thingfront;
	ModelRenderer thingback;
	ModelRenderer thingright;
	ModelRenderer thingleft;
	ModelRenderer attacherbig1;
	ModelRenderer attacherbig2;
	ModelRenderer attachersmall3;
	ModelRenderer attachersmall4;
	ModelRenderer attachersmall2;
	ModelRenderer attachersmall_1;
	ModelRenderer corner1;
	ModelRenderer corner2;
	ModelRenderer corner3;
	ModelRenderer corner4;
	ModelRenderer lense;
	ModelRenderer lensesidefront;
	ModelRenderer lensesideback;
	ModelRenderer lensesideright;
	ModelRenderer lensesideleft;
	ModelRenderer lensecorner1;
	ModelRenderer lensecorner2;
	ModelRenderer lensecorner3;
	ModelRenderer lensecorner4;

	public MFangYingJi()
	{
		textureWidth = 128;
		textureHeight = 64;

		top = new ModelRenderer(this, 0, 0);
		top.addBox(-8F, -4F, -8F, 16, 2, 16);
		top.setRotationPoint(0F, 16F, 0F);
		top.setTextureSize(128, 64);
		top.mirror = true;
		setRotation(top, 0F, 0F, 0F);
		axle = new ModelRenderer(this, 16, 26);
		axle.addBox(-1F, -2F, -1F, 2, 8, 2);
		axle.setRotationPoint(0F, 16F, 0F);
		axle.setTextureSize(128, 64);
		axle.mirror = true;
		setRotation(axle, 0F, 0F, 0F);
		bottom = new ModelRenderer(this, 0, 44);
		bottom.addBox(-8F, 6F, -8F, 16, 2, 16);
		bottom.setRotationPoint(0F, 16F, 0F);
		bottom.setTextureSize(128, 64);
		bottom.mirror = true;
		setRotation(bottom, 0F, 0F, 0F);
		thingfront = new ModelRenderer(this, 0, 20);
		thingfront.addBox(-2F, -2F, -7F, 4, 8, 4);
		thingfront.setRotationPoint(0F, 16F, 0F);
		thingfront.setTextureSize(128, 64);
		thingfront.mirror = true;
		setRotation(thingfront, 0F, 0F, 0F);
		thingback = new ModelRenderer(this, 0, 20);
		thingback.addBox(-2F, -2F, 3F, 4, 8, 4);
		thingback.setRotationPoint(0F, 16F, 0F);
		thingback.setTextureSize(128, 64);
		thingback.mirror = true;
		setRotation(thingback, 0F, 0F, 0F);
		thingright = new ModelRenderer(this, 0, 20);
		thingright.addBox(-6F, -2F, -2F, 4, 8, 4);
		thingright.setRotationPoint(0F, 16F, 0F);
		thingright.setTextureSize(128, 64);
		thingright.mirror = true;
		setRotation(thingright, 0F, 0F, 0F);
		thingleft = new ModelRenderer(this, 0, 20);
		thingleft.addBox(2F, -2F, -2F, 4, 8, 4);
		thingleft.setRotationPoint(0F, 16F, 0F);
		thingleft.setTextureSize(128, 64);
		thingleft.mirror = true;
		setRotation(thingleft, 0F, 0F, 0F);
		attacherbig1 = new ModelRenderer(this, 16, 20);
		attacherbig1.addBox(-7F, -1F, -3F, 14, 1, 6);
		attacherbig1.setRotationPoint(0F, 16F, 0F);
		attacherbig1.setTextureSize(128, 64);
		attacherbig1.mirror = true;
		setRotation(attacherbig1, 0F, 0F, 0F);
		attacherbig2 = new ModelRenderer(this, 16, 20);
		attacherbig2.addBox(-7F, 4F, -3F, 14, 1, 6);
		attacherbig2.setRotationPoint(0F, 16F, 0F);
		attacherbig2.setTextureSize(128, 64);
		attacherbig2.mirror = true;
		setRotation(attacherbig2, 0F, 0F, 0F);
		attachersmall3 = new ModelRenderer(this, 16, 36);
		attachersmall3.addBox(-3F, -1F, -8F, 6, 1, 5);
		attachersmall3.setRotationPoint(0F, 16F, 0F);
		attachersmall3.setTextureSize(128, 64);
		attachersmall3.mirror = true;
		setRotation(attachersmall3, 0F, 0F, 0F);
		attachersmall4 = new ModelRenderer(this, 16, 36);
		attachersmall4.addBox(-3F, 4F, -8F, 6, 1, 5);
		attachersmall4.setRotationPoint(0F, 16F, 0F);
		attachersmall4.setTextureSize(128, 64);
		attachersmall4.mirror = true;
		setRotation(attachersmall4, 0F, 0F, 0F);
		attachersmall2 = new ModelRenderer(this, 16, 36);
		attachersmall2.addBox(-3F, 4F, 3F, 6, 1, 5);
		attachersmall2.setRotationPoint(0F, 16F, 0F);
		attachersmall2.setTextureSize(128, 64);
		attachersmall2.mirror = true;
		setRotation(attachersmall2, 0F, 0F, 0F);
		attachersmall_1 = new ModelRenderer(this, 16, 36);
		attachersmall_1.addBox(-3F, -1F, 3F, 6, 1, 5);
		attachersmall_1.setRotationPoint(0F, 16F, 0F);
		attachersmall_1.setTextureSize(128, 64);
		attachersmall_1.mirror = true;
		setRotation(attachersmall_1, 0F, 0F, 0F);
		corner1 = new ModelRenderer(this, 38, 32);
		corner1.addBox(6F, -2F, -8F, 2, 8, 2);
		corner1.setRotationPoint(0F, 16F, 0F);
		corner1.setTextureSize(128, 64);
		corner1.mirror = true;
		setRotation(corner1, 0F, 0F, 0F);
		corner2 = new ModelRenderer(this, 46, 32);
		corner2.addBox(6F, -2F, 6F, 2, 8, 2);
		corner2.setRotationPoint(0F, 16F, 0F);
		corner2.setTextureSize(128, 64);
		corner2.mirror = true;
		setRotation(corner2, 0F, 0F, 0F);
		corner3 = new ModelRenderer(this, 0, 32);
		corner3.addBox(-8F, -2F, 6F, 2, 8, 2);
		corner3.setRotationPoint(0F, 16F, 0F);
		corner3.setTextureSize(128, 64);
		corner3.mirror = true;
		setRotation(corner3, 0F, 0F, 0F);
		corner4 = new ModelRenderer(this, 8, 32);
		corner4.addBox(-8F, -2F, -8F, 2, 8, 2);
		corner4.setRotationPoint(0F, 16F, 0F);
		corner4.setTextureSize(128, 64);
		corner4.mirror = true;
		setRotation(corner4, 0F, 0F, 0F);
		lense = new ModelRenderer(this, 96, 0);
		lense.addBox(-4F, -5F, -4F, 8, 1, 8);
		lense.setRotationPoint(0F, 16F, 0F);
		lense.setTextureSize(128, 64);
		lense.mirror = true;
		setRotation(lense, 0F, 0F, 0F);
		lensesidefront = new ModelRenderer(this, 64, 5);
		lensesidefront.addBox(-3F, -6F, -5F, 6, 2, 1);
		lensesidefront.setRotationPoint(0F, 16F, 0F);
		lensesidefront.setTextureSize(128, 64);
		lensesidefront.mirror = true;
		setRotation(lensesidefront, 0F, 0F, 0F);
		lensesideback = new ModelRenderer(this, 64, 5);
		lensesideback.addBox(-3F, -6F, 4F, 6, 2, 1);
		lensesideback.setRotationPoint(0F, 16F, 0F);
		lensesideback.setTextureSize(128, 64);
		lensesideback.mirror = true;
		setRotation(lensesideback, 0F, 0F, 0F);
		lensesideright = new ModelRenderer(this, 64, 8);
		lensesideright.addBox(-5F, -6F, -3F, 1, 2, 6);
		lensesideright.setRotationPoint(0F, 16F, 0F);
		lensesideright.setTextureSize(128, 64);
		lensesideright.mirror = true;
		setRotation(lensesideright, 0F, 0F, 0F);
		lensesideleft = new ModelRenderer(this, 64, 8);
		lensesideleft.addBox(4F, -6F, -3F, 1, 2, 6);
		lensesideleft.setRotationPoint(0F, 16F, 0F);
		lensesideleft.setTextureSize(128, 64);
		lensesideleft.mirror = true;
		setRotation(lensesideleft, 0F, 0F, 0F);
		lensecorner1 = new ModelRenderer(this, 64, 16);
		lensecorner1.addBox(3F, -6F, -4F, 1, 2, 1);
		lensecorner1.setRotationPoint(0F, 16F, 0F);
		lensecorner1.setTextureSize(128, 64);
		lensecorner1.mirror = true;
		setRotation(lensecorner1, 0F, 0F, 0F);
		lensecorner2 = new ModelRenderer(this, 64, 16);
		lensecorner2.addBox(3F, -6F, 3F, 1, 2, 1);
		lensecorner2.setRotationPoint(0F, 16F, 0F);
		lensecorner2.setTextureSize(128, 64);
		lensecorner2.mirror = true;
		setRotation(lensecorner2, 0F, 0F, 0F);
		lensecorner3 = new ModelRenderer(this, 64, 16);
		lensecorner3.addBox(-4F, -6F, 3F, 1, 2, 1);
		lensecorner3.setRotationPoint(0F, 16F, 0F);
		lensecorner3.setTextureSize(128, 64);
		lensecorner3.mirror = true;
		setRotation(lensecorner3, 0F, 0F, 0F);
		lensecorner4 = new ModelRenderer(this, 64, 16);
		lensecorner4.addBox(-4F, -6F, -4F, 1, 2, 1);
		lensecorner4.setRotationPoint(0F, 16F, 0F);
		lensecorner4.setTextureSize(128, 64);
		lensecorner4.mirror = true;
		setRotation(lensecorner4, 0F, 0F, 0F);
	}

	public void render(float rotation, float f5)
	{
		top.render(f5);
		axle.render(f5);
		bottom.render(f5);

		GL11.glPushMatrix();
		GL11.glRotatef(rotation, 0, 1, 0);
		thingfront.render(f5);
		attachersmall3.render(f5);
		thingback.render(f5);
		thingright.render(f5);
		thingleft.render(f5);
		attacherbig1.render(f5);
		attacherbig2.render(f5);
		attachersmall4.render(f5);
		attachersmall2.render(f5);
		attachersmall_1.render(f5);
		GL11.glPopMatrix();

		corner1.render(f5);
		corner2.render(f5);
		corner3.render(f5);
		corner4.render(f5);
		lense.render(f5);
		lensesidefront.render(f5);
		lensesideback.render(f5);
		lensesideright.render(f5);
		lensesideleft.render(f5);
		lensecorner1.render(f5);
		lensecorner2.render(f5);
		lensecorner3.render(f5);
		lensecorner4.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
