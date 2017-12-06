import javax.swing.AbstractListModel;
import javax.swing.JList;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTree;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.AbstractListModel;

public class Objects {

	JList list = new JList();
	list.setModel(new AbstractListModel() {
		String[] values = new String[] {"jkhjkl", "jkljklj", "jlppuiji"};
		public int getSize() {
			return values.length;
		}
		public Object getElementAt(int index) {
			return values[index];
		}
	});
	list.setBounds(155, 72, 337, 244);
	frame.getContentPane().add(list);
	
}
