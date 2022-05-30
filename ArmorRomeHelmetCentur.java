// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class ArmorRomeHelmetCentur extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer bone22;
	private final ModelRenderer bone;
	private final ModelRenderer bone8;
	private final ModelRenderer bone11;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer bone12;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer bone13;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer RightShtuka2;
	private final ModelRenderer bone2;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer LeftShtuka3;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone7;

	public ArmorRomeHelmetCentur() {
		textureWidth = 256;
		textureHeight = 256;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(79, 67).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 3.0F, 10.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-4.5F, -9.9F, -4.4F, 9.0F, 1.0F, 9.0F, 0.0F, false);
		Head.setTextureOffset(0, 238).addBox(-4.0F, -10.9F, -3.65F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(0, 166).addBox(-5.0F, -7.0F, 4.0F, 10.0F, 5.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(247, 3).addBox(4.0F, -7.0F, 3.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(247, 3).addBox(-5.0F, -7.0F, 3.0F, 1.0F, 5.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(0, 118).addBox(4.0F, -2.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 118).addBox(-6.0F, -2.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		Head.setTextureOffset(226, 107).addBox(-6.0F, -2.0F, 4.0F, 12.0F, 1.0F, 3.0F, 0.0F, false);

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-1.0F, 24.0F, 0.0F);
		Head.addChild(bone22);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone22.addChild(bone);
		bone.setTextureOffset(0, 0).addBox(0.5F, -37.4F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 24).addBox(-1.0F, -38.4F, -1.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-1.0F, -37.0F, 0.0F);
		bone22.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, -0.2618F);
		bone8.setTextureOffset(0, 24).addBox(-1.6377F, -1.3523F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-2.9F, -37.0F, 0.0F);
		bone22.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, -0.7854F);
		bone11.setTextureOffset(0, 24).addBox(-1.3986F, -0.6464F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(-2.9F, -37.0F, 0.0F);
		bone22.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, -1.1345F);
		bone14.setTextureOffset(0, 24).addBox(-3.0932F, -1.0858F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(4.9F, -37.0F, 0.0F);
		bone22.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.0F, 1.1345F);
		bone15.setTextureOffset(0, 24).addBox(1.0932F, -1.0858F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(4.9F, -37.0F, 0.0F);
		bone22.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.0F, 0.7854F);
		bone12.setTextureOffset(0, 24).addBox(-0.6014F, -0.6464F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(3.0F, -37.0F, 0.0F);
		bone22.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, 0.2618F);
		bone9.setTextureOffset(0, 24).addBox(-0.3623F, -1.3523F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(1.0F, -38.0F, 0.0F);
		bone22.addChild(bone10);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.0262F);
		cube_r1.setTextureOffset(0, 136).addBox(-0.4F, -4.9F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 136).addBox(-1.3F, -4.8F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 136).addBox(-2.3F, -4.8F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.0611F);
		cube_r2.setTextureOffset(0, 136).addBox(-3.0F, -4.8F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.1658F);
		cube_r3.setTextureOffset(0, 136).addBox(-3.4F, -5.1F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.3578F);
		cube_r4.setTextureOffset(0, 136).addBox(-3.3F, -5.6F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.5149F);
		cube_r5.setTextureOffset(0, 136).addBox(-3.3F, -6.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.6021F);
		cube_r6.setTextureOffset(0, 136).addBox(-3.6F, -6.3F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.6894F);
		cube_r7.setTextureOffset(0, 136).addBox(-4.0F, -6.6F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7592F);
		cube_r8.setTextureOffset(0, 136).addBox(-4.5F, -6.8F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -1.2479F);
		cube_r9.setTextureOffset(0, 136).addBox(-5.0F, -8.8F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -1.1432F);
		cube_r10.setTextureOffset(0, 136).addBox(-5.2F, -8.3F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -1.0559F);
		cube_r11.setTextureOffset(0, 136).addBox(-5.3F, -7.9F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.9163F);
		cube_r12.setTextureOffset(0, 136).addBox(-5.4F, -7.3F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r12.setTextureOffset(0, 136).addBox(-4.4F, -7.3F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(1.0F, -38.0F, 0.0F);
		bone22.addChild(bone13);
		

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.0262F);
		cube_r13.setTextureOffset(0, 136).addBox(-0.6F, -4.9F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, true);
		cube_r13.setTextureOffset(0, 136).addBox(0.3F, -4.8F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, true);
		cube_r13.setTextureOffset(0, 136).addBox(1.3F, -4.8F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, true);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.0611F);
		cube_r14.setTextureOffset(0, 136).addBox(2.0F, -4.8F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, true);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.1658F);
		cube_r15.setTextureOffset(0, 136).addBox(2.4F, -5.1F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, true);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.3578F);
		cube_r16.setTextureOffset(0, 136).addBox(2.3F, -5.6F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, true);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.5149F);
		cube_r17.setTextureOffset(0, 136).addBox(2.3F, -6.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, true);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.6021F);
		cube_r18.setTextureOffset(0, 136).addBox(2.6F, -6.3F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, true);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.6894F);
		cube_r19.setTextureOffset(0, 136).addBox(3.0F, -6.6F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, true);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.7592F);
		cube_r20.setTextureOffset(0, 136).addBox(3.5F, -6.8F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, true);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 1.2479F);
		cube_r21.setTextureOffset(0, 136).addBox(4.0F, -8.8F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, true);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 1.1432F);
		cube_r22.setTextureOffset(0, 136).addBox(4.2F, -8.3F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, true);

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 1.0559F);
		cube_r23.setTextureOffset(0, 136).addBox(4.3F, -7.9F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, true);

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.9163F);
		cube_r24.setTextureOffset(0, 136).addBox(4.4F, -7.3F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, true);
		cube_r24.setTextureOffset(0, 136).addBox(3.4F, -7.3F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, true);

		RightShtuka2 = new ModelRenderer(this);
		RightShtuka2.setRotationPoint(3.0F, 0.0F, 0.0F);
		Head.addChild(RightShtuka2);
		setRotationAngle(RightShtuka2, 0.0F, -0.1309F, 0.0F);
		RightShtuka2.setTextureOffset(242, 243).addBox(-0.0131F, -5.7F, -5.0991F, 2.0F, 6.0F, 5.0F, 0.0F, true);
		RightShtuka2.setTextureOffset(0, 78).addBox(-2.0131F, -0.6F, -5.0991F, 4.0F, 1.0F, 1.0F, 0.0F, true);
		RightShtuka2.setTextureOffset(246, 162).addBox(0.0F, -0.6F, -4.15F, 2.0F, 1.0F, 4.0F, 0.0F, true);
		RightShtuka2.setTextureOffset(182, 174).addBox(-0.0991F, -5.7F, -1.3369F, 2.0F, 3.0F, 2.0F, 0.0F, true);
		RightShtuka2.setTextureOffset(103, 173).addBox(0.5F, -6.5F, -3.85F, 1.0F, 3.0F, 4.0F, 0.0F, true);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(1.0F, -1.7F, 0.0F);
		RightShtuka2.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.48F);
		bone2.setTextureOffset(178, 28).addBox(-3.169F, -0.4095F, -5.0F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(1.0F, -4.7F, -1.0F);
		RightShtuka2.addChild(bone5);
		setRotationAngle(bone5, 1.1781F, 0.0F, 0.0F);
		bone5.setTextureOffset(101, 10).addBox(-1.0991F, -0.2124F, -4.3241F, 2.0F, 3.0F, 4.0F, 0.0F, true);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(1.0F, -7.4F, -1.0F);
		RightShtuka2.addChild(bone6);
		setRotationAngle(bone6, 2.2689F, 0.0F, 0.0F);
		bone6.setTextureOffset(142, 238).addBox(-0.4957F, -3.7497F, -4.7129F, 1.0F, 3.0F, 4.0F, 0.0F, true);

		LeftShtuka3 = new ModelRenderer(this);
		LeftShtuka3.setRotationPoint(-3.0F, 0.0F, 0.0F);
		Head.addChild(LeftShtuka3);
		setRotationAngle(LeftShtuka3, 0.0F, 0.1309F, 0.0F);
		LeftShtuka3.setTextureOffset(242, 243).addBox(-1.9869F, -5.7F, -5.0991F, 2.0F, 6.0F, 5.0F, 0.0F, false);
		LeftShtuka3.setTextureOffset(0, 78).addBox(-1.9869F, -0.6F, -5.0991F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		LeftShtuka3.setTextureOffset(246, 162).addBox(-2.0F, -0.6F, -4.15F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		LeftShtuka3.setTextureOffset(182, 174).addBox(-1.9009F, -5.7F, -1.3369F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		LeftShtuka3.setTextureOffset(103, 173).addBox(-1.5F, -6.5F, -3.85F, 1.0F, 3.0F, 4.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-1.0F, -1.7F, 0.0F);
		LeftShtuka3.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, 0.48F);
		bone3.setTextureOffset(178, 28).addBox(0.169F, -0.4095F, -5.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.0F, -4.7F, -1.0F);
		LeftShtuka3.addChild(bone4);
		setRotationAngle(bone4, 1.1781F, 0.0F, 0.0F);
		bone4.setTextureOffset(101, 10).addBox(-0.9009F, -0.2124F, -4.3241F, 2.0F, 3.0F, 4.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-1.0F, -7.4F, -1.0F);
		LeftShtuka3.addChild(bone7);
		setRotationAngle(bone7, 2.2689F, 0.0F, 0.0F);
		bone7.setTextureOffset(142, 238).addBox(-0.5043F, -3.7497F, -4.7129F, 1.0F, 3.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}