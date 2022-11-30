package lesson31;

import java.io.File;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

public class TreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame	f = new JFrame();
		DefaultTreeModel m = new DefaultTreeModel(buildTree(new File("c:/temp")));
		JTree	t = new JTree(m);
		
		f.getContentPane().add(new JScrollPane(t));
		t.addTreeSelectionListener(new TreeSelectionListener() {
			
			@Override
			public void valueChanged(TreeSelectionEvent e) {
				// TODO Auto-generated method stub
				System.err.println("selected: "+
				((DefaultMutableTreeNode)e.getNewLeadSelectionPath().getLastPathComponent())
					.getUserObject().toString()
				);
				
			}
		});
		
		m.addTreeModelListener(new TreeModelListener() {
			
			@Override
			public void treeStructureChanged(TreeModelEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void treeNodesRemoved(TreeModelEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void treeNodesInserted(TreeModelEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void treeNodesChanged(TreeModelEvent e) {
				// TODO Auto-generated method stub

			}
		});
		
		
//		t.setRootVisible(false);
		f.setSize(300,300);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
	}

	private static TreeNode buildTree(final File f) {
		final DefaultMutableTreeNode n = new DefaultMutableTreeNode(f);
		
		if (f.isDirectory()) {
			for (File item : f.listFiles()) {
				n.add((MutableTreeNode)buildTree(item));
			}
		}
		return n;
	}
}
