package model.table;

import model.Mark;

public interface ReadOnlyTableModel {

	Mark getMark(int lin, int col);
}
