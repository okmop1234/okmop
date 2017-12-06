import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import javax.swing.AbstractListModel;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class CafeCalculatorboy {

	private JFrame frame;
	private JList list_1;
	String japanese ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CafeCalculatorboy window = new CafeCalculatorboy();
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
	public CafeCalculatorboy() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 739, 639);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTypeOfFood = new JLabel("Type of Food");
		lblTypeOfFood.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTypeOfFood.setBounds(48, 46, 101, 45);
		frame.getContentPane().add(lblTypeOfFood);
		
		JComboBox typefood = new JComboBox();
		typefood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				list_1.setListData(typefood.getSelectedObjects()) ;
				
			}
		});
		typefood.setModel(new DefaultComboBoxModel(new String[] ("Japanese Food", "International Food", "Asian Food", "Noodle ", "Vegetarian Food", "Dessert", "Drinks"}));
		typefood.setBounds(34, 93, 129, 27);
		frame.getContentPane().add(typefood);
		
		JLabel lblFood = new JLabel("Food");
		lblFood.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFood.setBounds(292, 59, 107, 19);
		frame.getContentPane().add(lblFood);
		
		JLabel lblEisCafeteria = new JLabel("EIS CAFETERIA");
		lblEisCafeteria.setBounds(34, 11, 289, 24);
		frame.getContentPane().add(lblEisCafeteria);
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		
		list.setModel(new AbstractListModel() {
			
			
			String[] japanese = new String[] {"gin                  30", "kaow             30", "pao                40", "dome            30", "glue               50"};
			
			public int getSize() {
				return japanese.length;
			}
			public Object getElementAt(int index) {
				return japanese[index];
			
			}
		});
		list.setBounds(246, 78, 153, 217);
		frame.getContentPane().add(list);
		
		JCheckBox chckbxNormal = new JCheckBox("Normal");
		chckbxNormal.setBounds(268, 342, 76, 23);
		frame.getContentPane().add(chckbxNormal);
		
		JCheckBox chckbxSpecial = new JCheckBox("Special");
		chckbxSpecial.setBounds(268, 368, 97, 23);
		frame.getContentPane().add(chckbxSpecial);
		
		JCheckBox chckbxExtraSpecial = new JCheckBox("Extra Special");
		chckbxExtraSpecial.setBounds(268, 394, 97, 23);
		frame.getContentPane().add(chckbxExtraSpecial);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(520, 330, 60, 60);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(590, 330, 60, 60);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(663, 330, 60, 60);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(520, 395, 60, 60);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(590, 395, 60, 60);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(663, 395, 60, 60);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(520, 460, 60, 60);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(590, 460, 60, 60);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn9.setBounds(663, 460, 60, 60);
		frame.getContentPane().add(btn9);
		
		
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(590, 531, 60, 60);
		frame.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.setBounds(520, 531, 60, 60);
		frame.getContentPane().add(btnClear);
		
		JButton btnPM = new JButton("+/-");
		btnPM.setBounds(663, 531, 60, 60);
		frame.getContentPane().add(btnPM);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(195, 46, 1, 522);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(195, 59, 1, 498);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(476, 59, 1, 512);
		frame.getContentPane().add(separator_2);
		
		list_1 = new JList();
		
		list_1.setBounds(523, 21, 189, 294);
		frame.getContentPane().add(list_1);
		
		JButton btnMove = new JButton("Move >\r\n\r\n\r\n");
		btnMove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list_1.setListData(list.getSelectedValues());
			}
		});
		btnMove.setBounds(268, 306, 89, 23);
		frame.getContentPane().add(btnMove);
		
	}
}
