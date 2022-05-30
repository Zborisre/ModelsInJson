// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class ArmorRomeBody extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer Zaklepka;
	private final ModelRenderer bone8;
	private final ModelRenderer bone16;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer RightZaklepish;
	private final ModelRenderer bone7;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer LeftZaklepish;
	private final ModelRenderer bone15;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer LeftZaklepish2;
	private final ModelRenderer bone14;
	private final ModelRenderer bone24;
	private final ModelRenderer bone25;
	private final ModelRenderer bone26;
	private final ModelRenderer bone27;
	private final ModelRenderer LeftZaklepish3;
	private final ModelRenderer bone28;
	private final ModelRenderer bone29;
	private final ModelRenderer bone30;
	private final ModelRenderer bone31;
	private final ModelRenderer bone32;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;

	public ArmorRomeBody() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(44, 121).addBox(-4.2F, 11.0F, -2.6F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		Body.setTextureOffset(0, 122).addBox(-1.1F, 11.0F, -2.7F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(0, 113).addBox(-0.8F, 11.0F, -2.6F, 5.0F, 1.0F, 5.0F, 0.0F, false);

		Zaklepka = new ModelRenderer(this);
		Zaklepka.setRotationPoint(-0.05F, 24.0F, 0.0F);
		Body.addChild(Zaklepka);
		

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-2.45F, -15.25F, -0.25F);
		Zaklepka.addChild(bone8);
		setRotationAngle(bone8, 0.7854F, 0.0F, 0.0F);
		bone8.setTextureOffset(0, 116).addBox(1.0F, -1.0F, -2.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bone8.setTextureOffset(0, 116).addBox(1.0F, -0.1515F, -2.8485F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-2.45F, -16.75F, -0.25F);
		Zaklepka.addChild(bone16);
		setRotationAngle(bone16, 0.7854F, 0.0F, 0.0F);
		bone16.setTextureOffset(0, 116).addBox(1.0F, -1.0F, -2.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-2.45F, -18.5F, -0.25F);
		Zaklepka.addChild(bone21);
		setRotationAngle(bone21, 0.7854F, 0.0F, 0.0F);
		bone21.setTextureOffset(0, 116).addBox(1.0F, -1.0F, -2.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-2.45F, -23.0F, -0.25F);
		Zaklepka.addChild(bone22);
		setRotationAngle(bone22, 0.7854F, 0.0F, 0.0F);
		bone22.setTextureOffset(0, 116).addBox(1.0F, -1.0F, -2.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-2.45F, -20.0F, -0.25F);
		Zaklepka.addChild(bone23);
		setRotationAngle(bone23, 0.7854F, 0.0F, 0.0F);
		bone23.setTextureOffset(0, 116).addBox(1.0F, -1.0F, -2.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		RightZaklepish = new ModelRenderer(this);
		RightZaklepish.setRotationPoint(-0.05F, 24.0F, 0.0F);
		Body.addChild(RightZaklepish);
		

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, -22.75F, -0.25F);
		RightZaklepish.addChild(bone7);
		setRotationAngle(bone7, -0.0873F, 0.0F, 0.0F);
		bone7.setTextureOffset(0, 120).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, -19.5F, -0.25F);
		RightZaklepish.addChild(bone9);
		setRotationAngle(bone9, -0.0873F, 0.0F, 0.0F);
		bone9.setTextureOffset(24, 121).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, -17.75F, -0.25F);
		RightZaklepish.addChild(bone10);
		setRotationAngle(bone10, -0.0873F, 0.0F, 0.0F);
		bone10.setTextureOffset(24, 121).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, -16.25F, -0.25F);
		RightZaklepish.addChild(bone11);
		setRotationAngle(bone11, -0.0873F, 0.0F, 0.0F);
		bone11.setTextureOffset(24, 121).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, -14.75F, -0.25F);
		RightZaklepish.addChild(bone12);
		setRotationAngle(bone12, -0.0873F, 0.0F, 0.0F);
		bone12.setTextureOffset(24, 121).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, -13.75F, -0.25F);
		RightZaklepish.addChild(bone13);
		setRotationAngle(bone13, -0.0873F, 0.0F, 0.0F);
		bone13.setTextureOffset(24, 121).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		LeftZaklepish = new ModelRenderer(this);
		LeftZaklepish.setRotationPoint(4.05F, 24.0F, 0.0F);
		Body.addChild(LeftZaklepish);
		

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, -22.75F, -0.25F);
		LeftZaklepish.addChild(bone15);
		setRotationAngle(bone15, -0.0873F, 0.0F, 0.0F);
		bone15.setTextureOffset(0, 120).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, -19.5F, -0.25F);
		LeftZaklepish.addChild(bone17);
		setRotationAngle(bone17, -0.0873F, 0.0F, 0.0F);
		bone17.setTextureOffset(24, 121).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, -17.75F, -0.25F);
		LeftZaklepish.addChild(bone18);
		setRotationAngle(bone18, -0.0873F, 0.0F, 0.0F);
		bone18.setTextureOffset(24, 121).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, -16.25F, -0.25F);
		LeftZaklepish.addChild(bone19);
		setRotationAngle(bone19, -0.0873F, 0.0F, 0.0F);
		bone19.setTextureOffset(24, 121).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, -14.75F, -0.25F);
		LeftZaklepish.addChild(bone20);
		setRotationAngle(bone20, -0.0873F, 0.0F, 0.0F);
		bone20.setTextureOffset(24, 121).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		bone20.setTextureOffset(24, 121).addBox(-4.0F, 0.2951F, -1.8867F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		LeftZaklepish2 = new ModelRenderer(this);
		LeftZaklepish2.setRotationPoint(4.15F, 24.0F, 0.0F);
		Body.addChild(LeftZaklepish2);
		

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, -22.75F, 0.25F);
		LeftZaklepish2.addChild(bone14);
		setRotationAngle(bone14, 0.0873F, 0.0F, 0.0F);
		bone14.setTextureOffset(0, 120).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.0F, -19.5F, 0.25F);
		LeftZaklepish2.addChild(bone24);
		setRotationAngle(bone24, 0.0873F, 0.0F, 0.0F);
		bone24.setTextureOffset(0, 122).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0F, -17.75F, 0.25F);
		LeftZaklepish2.addChild(bone25);
		setRotationAngle(bone25, 0.0873F, 0.0F, 0.0F);
		bone25.setTextureOffset(0, 122).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.0F, -16.25F, 0.25F);
		LeftZaklepish2.addChild(bone26);
		setRotationAngle(bone26, 0.0873F, 0.0F, 0.0F);
		bone26.setTextureOffset(0, 122).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(0.0F, -14.75F, 0.25F);
		LeftZaklepish2.addChild(bone27);
		setRotationAngle(bone27, 0.0873F, 0.0F, 0.0F);
		bone27.setTextureOffset(0, 122).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		bone27.setTextureOffset(0, 122).addBox(-4.0F, 0.2951F, -2.1133F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		LeftZaklepish3 = new ModelRenderer(this);
		LeftZaklepish3.setRotationPoint(-0.15F, 24.0F, 0.0F);
		Body.addChild(LeftZaklepish3);
		

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(0.0F, -22.75F, 0.25F);
		LeftZaklepish3.addChild(bone28);
		setRotationAngle(bone28, 0.0873F, 0.0F, 0.0F);
		bone28.setTextureOffset(0, 120).addBox(-4.0F, -1.0F, -2.0F, 5.0F, 4.0F, 4.0F, 0.0F, false);

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(0.0F, -19.5F, 0.25F);
		LeftZaklepish3.addChild(bone29);
		setRotationAngle(bone29, 0.0873F, 0.0F, 0.0F);
		bone29.setTextureOffset(24, 121).addBox(-4.0F, -1.0F, -2.0F, 5.0F, 2.0F, 4.0F, 0.0F, false);

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(0.0F, -17.75F, 0.25F);
		LeftZaklepish3.addChild(bone30);
		setRotationAngle(bone30, 0.0873F, 0.0F, 0.0F);
		bone30.setTextureOffset(24, 121).addBox(-4.0F, -1.0F, -2.0F, 5.0F, 2.0F, 4.0F, 0.0F, false);

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(0.0F, -16.25F, 0.25F);
		LeftZaklepish3.addChild(bone31);
		setRotationAngle(bone31, 0.0873F, 0.0F, 0.0F);
		bone31.setTextureOffset(24, 121).addBox(-4.0F, -1.0F, -2.0F, 5.0F, 2.0F, 4.0F, 0.0F, false);

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(0.0F, -14.75F, 0.25F);
		LeftZaklepish3.addChild(bone32);
		setRotationAngle(bone32, 0.0873F, 0.0F, 0.0F);
		bone32.setTextureOffset(24, 121).addBox(-4.0F, -1.0F, -2.0F, 5.0F, 2.0F, 4.0F, 0.0F, false);
		bone32.setTextureOffset(24, 121).addBox(-4.0F, 0.2951F, -2.1133F, 5.0F, 2.0F, 4.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(112, 117).addBox(1.4F, -2.75F, -2.85F, 2.0F, 4.0F, 6.0F, 0.0F, false);
		RightArm.setTextureOffset(110, 108).addBox(-0.8F, -2.25F, -2.45F, 4.0F, 3.0F, 5.0F, 0.0F, false);
		RightArm.setTextureOffset(86, 122).addBox(-3.2F, -2.15F, -0.55F, 4.0F, 2.0F, 3.0F, 0.0F, false);
		RightArm.setTextureOffset(86, 122).addBox(-3.2F, -2.15F, -2.25F, 4.0F, 2.0F, 3.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(112, 117).addBox(-3.4F, -2.75F, -2.85F, 2.0F, 4.0F, 6.0F, 0.0F, true);
		LeftArm.setTextureOffset(110, 108).addBox(-3.2F, -2.25F, -2.45F, 4.0F, 3.0F, 5.0F, 0.0F, true);
		LeftArm.setTextureOffset(86, 122).addBox(-0.8F, -2.15F, -0.55F, 4.0F, 2.0F, 3.0F, 0.0F, true);
		LeftArm.setTextureOffset(86, 122).addBox(-0.8F, -2.15F, -2.25F, 4.0F, 2.0F, 3.0F, 0.0F, true);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}