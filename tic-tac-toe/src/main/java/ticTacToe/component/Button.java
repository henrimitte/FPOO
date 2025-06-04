package ticTacToe.component;

import java.awt.Color;
import java.awt.Graphics;

public class Button extends AbstractComponent {

	public Button() {
		super();
	}

	public Button(int x, int y) {
		super(x, y);
	}

	public Button(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	private void doMouseOverDecoration(Graphics g) {

		Color defaultColor = g.getColor();
		int offset = 2;
		int doubleOffset = offset * 2;

		g.setColor(Color.red);
		g.drawRect(position.x + offset, position.y + offset,
				width() - doubleOffset, height() - doubleOffset);

		g.setColor(defaultColor);

	}

	@Override
	public void paint(Graphics g) {
		g.drawRect(position.x, position.y, width(), height());

		if (this.mouseOver)
			doMouseOverDecoration(g);
	}
}
