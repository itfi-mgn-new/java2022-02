package lesson30;

import java.io.File;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame	f = new JFrame();
		TableModel	model = new MyTableModel(new File("c:/temp"));
		JTable	t = new JTable(model);
		
		f.getContentPane().add(new JScrollPane(t));
		f.setSize(500,500);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

	
	public static class MyTableModel extends DefaultTableModel {
		final File[]	content;
		
		public MyTableModel(final File	dir) {
			content = dir.listFiles();
		}
		
		@Override
		public Class<?> getColumnClass(int columnIndex) {
			switch (columnIndex) {
				case 0 : return String.class;
				case 1 : return Number.class;
				case 2 : return Date.class;
			}
			return null;
		}

		@Override
		public int getColumnCount() {
			return 3;
		}

		@Override
		public String getColumnName(int columnIndex) {
			switch (columnIndex) {
				case 0 : return "Name";
				case 1 : return "Size";
				case 2 : return "Last modified";
			}
			return null;
		}

		@Override
		public int getRowCount() {
			return content == null ? 0 : content.length;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			switch (columnIndex) {
				case 0 : return content[rowIndex].getName();
				case 1 : return content[rowIndex].length();
				case 2 : return new Date(content[rowIndex].lastModified());
			}
			return null;
		}

		@Override
		public boolean isCellEditable(int rowIndex, int columnIndex) {
			return columnIndex == 0;
		}

		@Override
		public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			System.err.println("Call: "+aValue);
			fireTableCellUpdated(rowIndex, columnIndex);
		}
	}
}
