package ticTacToe.component.button;

import java.awt.Graphics;
import java.awt.Image;

public class ImageButton extends Button {

	protected Image image = null;

	public ImageButton() {
		super();
	}

	public ImageButton(int x, int y) {
		super(x, y);
	}

	public ImageButton(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	public Image getImage() {
		return this.image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public void paint(Graphics g) {
		super.paint(g);

		if (this.image == null)
			return;

		g.drawImage(image, position.x, position.y, width(), height(), null);
	}
}
