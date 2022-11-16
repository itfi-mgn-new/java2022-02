package lesson29;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.InputVerifier;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame			parent = new JFrame();
		JList<String>	list = new JList(new String[]{"1","2","3","4","5"});
		
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				System.err.println("Changed");
			}
		});
		DefaultListCellRenderer r;
		list.setCellRenderer(new DefaultListCellRenderer() {
			@Override
			public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
				// TODO Auto-generated method stub
				final JLabel	result = (JLabel)super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
			
				result.setBorder(new LineBorder(Color.GREEN));
				return result;
			}
		});
		
		
		JComboBox<String> combo = new JComboBox<>(new String[] {"q1","q2"});
		
		parent.getContentPane().add(list);
		parent.getContentPane().add(combo, BorderLayout.SOUTH);
		
		list.setInputVerifier(new InputVerifier() {
			
			@Override
			public boolean verify(JComponent arg0) {
				// TODO Auto-generated method stub
				System.err.println("sdsdsdsd");
				return true;
			}
		});
		
		
		parent.setSize(200,200);
		parent.setLocationRelativeTo(null);
		parent.setVisible(true);
		
		
	}

}
