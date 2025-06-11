package ticTacToe.component.button;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;

public class ImageButton extends Button {

	protected ImageIcon icon = null;

	public ImageButton() {
		super();
	}

	public ImageButton(int x, int y, ImageIcon icon) {
		super(x, y);
		this.icon = icon;
	}

	public ImageButton(int x, int y, int width, int height, ImageIcon icon) {
		super(x, y, width, height);
		this.icon = icon;
	}

	public ImageIcon getImage() {
		return this.icon;
	}

	public void setImage(ImageIcon icon) {
		this.icon = icon;
	}

	private void drawImage(Graphics2D g2D) {
		g2D.drawImage(icon.getImage(), position.x, position.y, width(), height(), null);
	}

	public void paint(Graphics g) {

		if (this.icon != null)
			drawImage((Graphics2D) g);

		if (mouseOver)
			super.doMouseOverDecoration(g);

	}
}
