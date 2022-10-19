package lesson25;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class SwingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final JFrame	frame = new JFrame();
		
		final JSplitPane	split = new JSplitPane();
		
		
//		frame.getContentPane().setLayout(null);
		
		JLabel labelN = new JLabel("label N", JLabel.CENTER);
		JLabel labelC = new JLabel("label C", JLabel.CENTER);
		JLabel labelS = new JLabel("label S", JLabel.CENTER);
		
//		label.setLocation(20, 20);
//		label.setSize(100,100);
		labelN.setMinimumSize(new Dimension(100, 100));
		labelN.setPreferredSize(new Dimension(200, 200));
		labelN.setMaximumSize(new Dimension(300, 300));
		
		JPanel	panel = new JPanel(new GridLayout(4, 1));
		
		panel.add(new JLabel("1.1"));
		panel.add(new JLabel("1.2"));
		panel.add(new JLabel("2.1"));
		panel.add(new JLabel("2.2"));
		
		JButton button = new JButton("Press me");
		
		button.addActionListener((e)->{
			System.err.println("Pressed");
		});
		
		
		split.setLeftComponent(panel);
		split.setRightComponent(button);
		
		frame.getContentPane().add(labelN, BorderLayout.NORTH);
		frame.getContentPane().add(split);
		frame.getContentPane().add(labelS, BorderLayout.SOUTH);
	
//		frame.pack();
		frame.setSize(200,200);
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
		System.err.println("TErminated");
	}

}
