package appTest;

import java.io.IOException;
import java.net.URL;

import javax.swing.ImageIcon;

import ticTacToe.component.button.ImageButton;
import ticTacToe.gui.MainWindow;

public class AppImageButtonTest {

	public static void main(String[] args) throws IOException {
		String path = "../ticTacToe/images/";
		URL url = AppImageButtonTest.class.getResource(path + "markO.png");
		ImageIcon icon = new ImageIcon(url); 

		ImageButton button = new ImageButton(100, 100, 50, 50, icon);
		
		MainWindow window = new MainWindow();
		window.add(button);
		window.addMouseListener(button.mouseListener());
		window.addMouseMotionListener(button.mouseMotionListener());
	}
}
