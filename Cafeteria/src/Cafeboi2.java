import java.awt.EventQueue;
import java.awt.List;

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
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JTextField;

public class Cafeboi2 {

	private JFrame frame;
	private JTable table;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cafeboi2 window = new Cafeboi2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cafeboi2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 707, 601);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton Japanese = new JButton("\u65E5\u672C\u8A9E");
		Japanese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
		});
		Japanese.setBounds(29, 72, 100, 49);
		frame.getContentPane().add(Japanese);
		
		JButton Nazi = new JButton("Internationale");
		Nazi.setBounds(29, 120, 100, 49);
		frame.getContentPane().add(Nazi);
		
		JButton Thai = new JButton("\u0E44\u0E17\u0E22");
		Thai.setBounds(29, 168, 100, 49);
		frame.getContentPane().add(Thai);
		
		JButton Noodle = new JButton("\u9EB5\u689D");
		Noodle.setBounds(29, 216, 100, 49);
		frame.getContentPane().add(Noodle);
		
		JButton Dessert = new JButton("Desserto");
		Dessert.setBounds(29, 263, 100, 49);
		frame.getContentPane().add(Dessert);
		
		JButton btnNewButton_1 = new JButton("vvvv Add vvvv");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton_1.setBounds(255, 323, 127, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_2.setBounds(275, 529, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JList list = new JList();
		
		
		
		 Japanese.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0) {
				list.setModel(new AbstractListModel() {
					String[] values = new String[] {"SQUARD","hello","Chicken Mellon"};
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});
				
				
			}
		});
		
		 list.setBounds(155, 72, 337, 232);
		frame.getContentPane().add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(155, 356, 337, 173);
		frame.getContentPane().add(list_1);
		
		
		
		//Thai 
		 Thai.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0) {
				list.setModel(new AbstractListModel() {
					String[] values = new String[] {"Sdas","hello","Chicken Mellon"};
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});
				
				
			}
		});
		 
		 //Germany
		 
		 Nazi.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0) {
				list.setModel(new AbstractListModel() {
					String[] values = new String[] {"Hitler","hello","Chicken Mellon"};
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});
				
				
			}
		});
		 
		 //Chinese Fucker
		 Noodle.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0) {
				list.setModel(new AbstractListModel() {
					String[] values = new String[] {"SQUARD","hello","Chicken Mellon"};
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});
				
				
			}
		});
		 
		 
		 //Dessert
		 Dessert.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0) {
				list.setModel(new AbstractListModel() {
					String[] values = new String[] {"SQUARD","hello","Chicken Mellon"};
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});
				
				
			}
		});
		 
		 
		 //Add button
		 btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					list_1.setListData(list.getSelectedValues());
					
				}
			});
		
	
		
		
		
		
	}
	}
		
	

