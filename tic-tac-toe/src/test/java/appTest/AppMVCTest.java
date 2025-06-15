package appTest;

import java.net.URL;

import javax.swing.ImageIcon;

import model.Mark;
import model.table.SimpleTableModel;
import model.table.TableModel;
import ticTacToe.gui.MainWindow;
import ticTacToe.gui.TableView;

public class AppMVCTest {

	TableModel tableModel = new SimpleTableModel();

	MainWindow window = new MainWindow();
	TableView tableView = createTableView();

	public AppMVCTest() {
		tableView.setTableModel(tableModel);
		tableView.addCellClickListener(
				(cell) -> tableModel.setMark(cell.lin, cell.col, Math.random() > 0.5 ? Mark.X : Mark.O));

		ImageIcon icon = loadImage("background.jpg");
		window.setBackground(icon);
		window.add(tableView);

		window.addMouseMotionListener(tableView.mouseMotionListener());
		window.addMouseListener(tableView.mouseListener());
	}

	public static void main(String[] args) throws Exception {
		AppMVCTest app = new AppMVCTest();
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
}
