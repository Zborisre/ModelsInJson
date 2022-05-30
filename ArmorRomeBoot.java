// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class ArmorRomeBoot extends EntityModel<Entity> {
	private final ModelRenderer RightBoot;
	private final ModelRenderer LeftBoot;

	public ArmorRomeBoot() {
		textureWidth = 128;
		textureHeight = 128;

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightBoot.setTextureOffset(0, 56).addBox(-0.8F, 11.0F, -2.9F, 3.0F, 1.0F, 5.0F, 0.0F, false);
		RightBoot.setTextureOffset(0, 56).addBox(-0.9F, 10.0F, -2.1F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		RightBoot.setTextureOffset(0, 56).addBox(-0.8F, 10.0F, -1.9F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		RightBoot.setTextureOffset(0, 56).addBox(-2.1F, 10.0F, -2.1F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		RightBoot.setTextureOffset(0, 56).addBox(-2.1F, 10.0F, -2.1F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		RightBoot.setTextureOffset(0, 56).addBox(-2.1F, 10.0F, -1.9F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		RightBoot.setTextureOffset(0, 56).addBox(-2.1F, 10.0F, -1.9F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		RightBoot.setTextureOffset(0, 56).addBox(-2.2F, 11.0F, -2.9F, 3.0F, 1.0F, 5.0F, 0.0F, false);
		RightBoot.setTextureOffset(0, 56).addBox(-2.2F, 11.0F, -2.9F, 3.0F, 1.0F, 5.0F, 0.0F, false);

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftBoot.setTextureOffset(0, 79).addBox(-2.2F, 11.0F, -2.9F, 3.0F, 1.0F, 5.0F, 0.0F, true);
		LeftBoot.setTextureOffset(0, 79).addBox(-2.1F, 10.0F, -2.1F, 3.0F, 1.0F, 4.0F, 0.0F, true);
		LeftBoot.setTextureOffset(0, 79).addBox(-2.2F, 10.0F, -1.9F, 3.0F, 1.0F, 4.0F, 0.0F, true);
		LeftBoot.setTextureOffset(0, 79).addBox(-0.9F, 10.0F, -2.1F, 3.0F, 1.0F, 4.0F, 0.0F, true);
		LeftBoot.setTextureOffset(0, 79).addBox(-0.9F, 10.0F, -2.1F, 3.0F, 1.0F, 4.0F, 0.0F, true);
		LeftBoot.setTextureOffset(0, 79).addBox(-0.9F, 10.0F, -1.9F, 3.0F, 1.0F, 4.0F, 0.0F, true);
		LeftBoot.setTextureOffset(0, 79).addBox(-0.9F, 10.0F, -1.9F, 3.0F, 1.0F, 4.0F, 0.0F, true);
		LeftBoot.setTextureOffset(0, 79).addBox(-0.8F, 11.0F, -2.9F, 3.0F, 1.0F, 5.0F, 0.0F, true);
		LeftBoot.setTextureOffset(0, 79).addBox(-0.8F, 11.0F, -2.9F, 3.0F, 1.0F, 5.0F, 0.0F, true);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		RightBoot.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftBoot.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}