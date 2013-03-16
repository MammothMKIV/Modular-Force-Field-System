package mffs.client.gui;

import mffs.common.ZhuYao;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;

import org.lwjgl.opengl.GL11;

import universalelectricity.core.vector.Vector2;

public class GuiButtonMFFS extends GuiButton
{
	protected Vector2 offset = new Vector2();
	private int type;

	public GuiButtonMFFS(int id, int x, int y, Vector2 offset)
	{
		super(id, x, y, 18, 18, "");
		this.offset = offset;
	}

	public GuiButtonMFFS(int id, int x, int y)
	{
		this(id, x, y, new Vector2());
	}

	@Override
	public void drawButton(Minecraft minecraft, int x, int y)
	{
		if (this.drawButton)
		{
			Minecraft.getMinecraft().renderEngine.func_98187_b(ZhuYao.GUI_BUTTON);
			GL11.glColor4f(1, 1, 1, 1);
			this.drawTexturedModalRect(this.xPosition, this.yPosition, this.offset.intX(), this.offset.intY(), this.width, this.height);
			this.mouseDragged(minecraft, x, y);
			/*
			 * 
			 * if (this.tileEntity instanceof TileEntityMFFS && this.type == 0) {
			 * drawTexturedModalRect(this.xPosition, this.yPosition, 80 + ((TileEntityMFFS)
			 * this.tileEntity).getStatusMode() * 16, 112, this.width, this.height); }
			 * 
			 * if ((this.tileEntity instanceof TileEntityConverter)) { if (this.type == 1) {
			 * drawTexturedModalRect(this.xPosition, this.yPosition, 80 + ((TileEntityConverter)
			 * this.tileEntity).getIC_Output() * 16, 128, this.width, this.height); } if (this.type
			 * == 2) { drawTexturedModalRect(this.xPosition, this.yPosition, 80 +
			 * ((TileEntityConverter) this.tileEntity).getUE_Output() * 16, 128, this.width,
			 * this.height); }
			 * 
			 * }
			 * 
			 * if ((this.tileEntity instanceof TileEntityControlSystem)) { if
			 * (((TileEntityControlSystem) this.tileEntity).getStackInSlot(1) != null) { if
			 * (this.type == 1) { if (((TileEntityControlSystem) this.tileEntity).getRemoteActive())
			 * { drawTexturedModalRect(this.xPosition, this.yPosition, 176, 80, this.width,
			 * this.height); }
			 * 
			 * if (!((TileEntityControlSystem) this.tileEntity).getRemoteActive()) {
			 * drawTexturedModalRect(this.xPosition, this.yPosition, 192, 80, this.width,
			 * this.height); } } if ((this.type == 2) && (((TileEntityControlSystem)
			 * this.tileEntity).getRemoteSwitchModi() > 0)) { drawTexturedModalRect(this.xPosition,
			 * this.yPosition, 80 + ((TileEntityControlSystem)
			 * this.tileEntity).getRemoteSwitchModi() * 16, 112, this.width, this.height); }
			 * 
			 * if ((this.type == 3) && (((TileEntityControlSystem)
			 * this.tileEntity).getRemoteSwitchModi() == 3)) { if (((TileEntityControlSystem)
			 * this.tileEntity).getRemoteSwitchValue()) { drawTexturedModalRect(this.xPosition,
			 * this.yPosition, 208, 80, this.width, this.height); } else {
			 * drawTexturedModalRect(this.xPosition, this.yPosition, 224, 80, this.width,
			 * this.height); } } }
			 * 
			 * }
			 * 
			 * if ((this.tileEntity instanceof TileEntityDefenseStation)) { if (this.type == 1) {
			 * drawTexturedModalRect(this.xPosition, this.yPosition, 176 +
			 * ((TileEntityDefenseStation) this.tileEntity).getcontratyp() * 16, 80, this.width,
			 * this.height); }
			 * 
			 * if (this.type == 2) { drawTexturedModalRect(this.xPosition, this.yPosition, 64 +
			 * ((TileEntityDefenseStation) this.tileEntity).getActionmode() * 16, 96, this.width,
			 * this.height); }
			 * 
			 * if (this.type == 3) { drawTexturedModalRect(this.xPosition, this.yPosition, 160 +
			 * ((TileEntityDefenseStation) this.tileEntity).getScanmode() * 16, 96, this.width,
			 * this.height); } } if ((this.tileEntity instanceof TileEntityFortronCapacitor)) { if
			 * (this.type == 1) { drawTexturedModalRect(this.xPosition, this.yPosition, 96 +
			 * ((TileEntityFortronCapacitor) this.tileEntity).getPowerLinkMode() * 16, 80,
			 * this.width, this.height); } } if ((this.tileEntity instanceof TileEntityProjector)) {
			 * if (this.type == 1) { drawTexturedModalRect(this.xPosition, this.yPosition, 0 +
			 * ((TileEntityProjector) this.tileEntity).getAccessType() * 16, 80, this.width,
			 * this.height); } }
			 */
		}
	}

	@Override
	protected void mouseDragged(Minecraft minecraft, int x, int y)
	{
		if (this.isPointInRegion(this.xPosition, this.yPosition, this.width, this.height, x, y))
		{
			// this.mainGui.tooltip = this.displayString;
		}
	}

	protected boolean isPointInRegion(int x, int y, int width, int height, int checkX, int checkY)
	{
		int var7 = 0;
		;
		int var8 = 0;
		checkX -= var7;
		checkY -= var8;
		return checkX >= x - 1 && checkX < x + width + 1 && checkY >= y - 1 && checkY < y + height + 1;
	}
}