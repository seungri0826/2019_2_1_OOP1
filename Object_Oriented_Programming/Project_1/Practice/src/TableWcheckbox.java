import javax.swing.*;
import javax.swing.table.*;

public class TableWcheckbox extends JFrame {
	JTable table;
	
	public TableWcheckbox() {
		super("Table with Checkbox");
		TableModel model = new TableModel();
		table = new JTable(model);
		getContentPane().add(new JScrollPane(table), "Center");
		setSize(300,200);
		setVisible(true);
	}
	
	class TableModel extends AbstractTableModel {
		Object[][] data = {
				{"Kim Y.C.", 22, "yckim@my.com", true},
				{"Shin K.H.", 23, "shin@my.com", false},
				{"Park J.S.", 20, "park@my.com", false},
				{"Kim S.H.", 21, "kim@my.com", true},
		};
		String[] columnName = {"Name", "Age", "E-mail", "Married"};
		
		public int getColumnCount() {
			return columnName.length;
		}
		
		public int getRowCount() {
			return data.length;
		}
		
		public String getColumnName(int col) {
			return columnName[col];
		}
		
		public Object getValueAt(int row, int col) {
			return data[row][col];
		}
		
		public Class getColumnClass(int c) {
			return getValueAt(0,c).getClass();
		}
	}

	public static void main(String[] args) {
		new TableWcheckbox();

	}

}
