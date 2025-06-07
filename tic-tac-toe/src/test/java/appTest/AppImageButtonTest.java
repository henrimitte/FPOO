package appTest;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import ticTacToe.component.button.ImageButton;
import ticTacToe.gui.MainWindow;

public class AppImageButtonTest {

	static Image loadImage(String imagePath) throws IOException {
		URL url = AppImageButtonTest.class.getResource(imagePath);
		return ImageIO.read(url);
	}

	public static void main(String[] args) throws IOException {
		String path = "../ticTacToe/images/";

		Image buttonImage = loadImage(path + "tic-tac-toe.png");

		MainWindow window = new MainWindow();
		ImageButton imageButton = new ImageButton(50, 50, 200, 200);
		imageButton.setImage(buttonImage);
		window.add(imageButton);
	}
}
