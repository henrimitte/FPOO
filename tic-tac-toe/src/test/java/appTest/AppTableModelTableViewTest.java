package appTest;

import java.net.URL;

import javax.swing.ImageIcon;

import model.Mark;
import model.table.SimpleTableModel;
import model.table.TableModel;
import ticTacToe.gui.MainWindow;
import ticTacToe.gui.TableView;

public class AppTableModelTableViewTest {

	TableModel tableModel = new SimpleTableModel();

	MainWindow window = new MainWindow();
	TableView tableView = createTableView();

	public AppTableModelTableViewTest() {
		tableView.setTableModel(tableModel);

		ImageIcon icon = loadImage("background.jpg");
		window.setBackground(icon);

		window.add(tableView);
	}

	public static void main(String[] args) throws Exception {
		AppTableModelTableViewTest app = new AppTableModelTableViewTest();
		app.play();
	}

	private TableView createTableView() {
		ImageIcon icon = loadImage("tic-tac-toe.png");
		TableView table = new TableView(50, 50, 200, 200, icon);

		icon = loadImage("markX.png");
		table.setIconX(icon);

		icon = loadImage("markO.png");
		table.setIconO(icon);

		return table;
	}

	private ImageIcon loadImage(String filename) {
		String path = "../ticTacToe/images/";
		URL url = getClass().getResource(path + filename);
		return new ImageIcon(url);
	}

	private void play() throws Exception {
		Thread.sleep(1000);
		tableModel.setMark(1, 1, Mark.X);
		Thread.sleep(1000);
		tableModel.setMark(0, 0, Mark.O);
		Thread.sleep(1000);
		tableModel.setMark(0, 1, Mark.X);
		Thread.sleep(1000);
		tableModel.setMark(2, 1, Mark.O);
		Thread.sleep(1000);
		tableModel.setMark(2, 0, Mark.X);
		Thread.sleep(1000);
		tableModel.setMark(0, 2, Mark.O);
		Thread.sleep(1000);
		tableModel.setMark(1, 0, Mark.X);
		Thread.sleep(1000);
		tableModel.setMark(1, 2, Mark.O);
		Thread.sleep(1000);
		tableModel.setMark(2, 2, Mark.X);
	}
}
