// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class ArmorRomeLeg extends EntityModel<Entity> {
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public ArmorRomeLeg() {
		textureWidth = 128;
		textureHeight = 128;

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(0, 0).addBox(-2.1F, 0.0F, -2.5F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(27, 9).addBox(0.9F, 0.0F, -2.6F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(0, 0).addBox(-2.1F, 0.0F, -1.7F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(0, 0).addBox(1.9F, 0.0F, -2.5F, 4.0F, 6.0F, 4.0F, 0.0F, true);
		RightLeg.setTextureOffset(27, 8).addBox(1.9F, 0.0F, -2.6F, 1.0F, 4.0F, 1.0F, 0.0F, true);
		RightLeg.setTextureOffset(0, 0).addBox(1.9F, 0.0F, -1.7F, 4.0F, 6.0F, 4.0F, 0.0F, true);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(0, 0).addBox(-1.9F, 0.0F, -2.5F, 4.0F, 6.0F, 4.0F, 0.0F, true);
		LeftLeg.setTextureOffset(27, 8).addBox(-1.9F, 0.0F, -2.6F, 1.0F, 4.0F, 1.0F, 0.0F, true);
		LeftLeg.setTextureOffset(0, 0).addBox(-1.9F, 0.0F, -1.7F, 4.0F, 6.0F, 4.0F, 0.0F, true);
		LeftLeg.setTextureOffset(0, 0).addBox(-5.9F, 0.0F, -2.5F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		LeftLeg.setTextureOffset(27, 9).addBox(-2.9F, 0.0F, -2.6F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		LeftLeg.setTextureOffset(0, 0).addBox(-5.9F, 0.0F, -1.7F, 4.0F, 6.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}