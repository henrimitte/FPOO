package ticTacToe.gui.score;

import java.awt.Graphics;

import javax.swing.ImageIcon;

import model.score.ReadOnlyScoreModel;
import ticTacToe.component.AbstractComponent;
import ticTacToe.component.button.TextButton;

public class SimpleScoreView extends AbstractComponent {

	private ReadOnlyScoreModel scoreModel;

	private TextButton scoreX;
	private TextButton scoreO;

	private ImageIcon background;

	public SimpleScoreView(int x, int y, int width, int height, ReadOnlyScoreModel scoreModel) {
		super(x, y, width, height);

		this.scoreModel = scoreModel;

		int yTop = y + height / 2;
		int halfWidth = width / 2;

		this.scoreO = new TextButton(x, yTop, halfWidth, 30);
		this.scoreX = new TextButton(x + halfWidth, yTop, halfWidth, 30);
	}

	public void setBackground(ImageIcon icon) {
		this.background = icon;
	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(background.getImage(), position.x, position.y, width(), height(), null);

		scoreO.setText(Integer.toString(scoreModel.scoreO()));
		scoreO.paint(g);

		scoreX.setText(Integer.toString(scoreModel.scoreX()));
		scoreX.paint(g);
	}

}
