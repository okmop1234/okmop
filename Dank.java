import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Dank {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_26;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dank window = new Dank();
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
	public Dank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		
		
		
		
		
		
		
		double[] itemcost = new double[26];
		
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Carl");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chckbxNewCheckBox.isSelected())
				{
					
					textField.setEnabled(true);
					textField.setText(" ");
					textField.requestFocus();
					
				}
				else
				{
					
					textField.setEnabled(false);
					textField.setText("0");
					
				}
			}
		});
		chckbxNewCheckBox.setBounds(173, 44, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox_1.isSelected())
				{
					
					textField_1.setEnabled(true);
					textField_1.setText(" ");
					textField_1.requestFocus();
					
				}
				else
				{
					
					textField_1.setEnabled(false);
					textField_1.setText("0");
					
				}
				
			}
		});
		chckbxNewCheckBox_1.setBounds(173, 78, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox_2.isSelected())
				{
					
					textField_2.setEnabled(true);
					textField_2.setText(" ");
					textField_2.requestFocus();
					
				}
				else
				{
					
					textField_2.setEnabled(false);
					textField_2.setText("0");
					
				}
				
			}
		});
		chckbxNewCheckBox_2.setBounds(173, 112, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("New check box");
		chckbxNewCheckBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox_3.isSelected())
				{
					
					textField_3.setEnabled(true);
					textField_3.setText(" ");
					textField_3.requestFocus();
					
				}
				else
				{
					
					textField_3.setEnabled(false);
					textField_3.setText("0");
					
				}
			}
		});
		chckbxNewCheckBox_3.setBounds(173, 146, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_3);
		
		JCheckBox checkBox_2 = new JCheckBox("New check box");
		checkBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox_2.isSelected())
				{
					
					textField_4.setEnabled(true);
					textField_4.setText(" ");
					textField_4.requestFocus();
					
				}
				else
				{
					
					textField_4.setEnabled(false);
					textField_4.setText("0");
					
				}
					
			}
		});
		checkBox_2.setBounds(173, 180, 97, 23);
		frame.getContentPane().add(checkBox_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 227, 609, 314);
		frame.getContentPane().add(textArea);
		
		
		
		JCheckBox checkBox = new JCheckBox("Carl");
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox.isSelected())
				{
					
					textField_5.setEnabled(true);
					textField_5.setText(" ");
					textField_5.requestFocus();
					
				}
				else
				{
					
					textField_5.setEnabled(false);
					textField_5.setText("0");
				}
			}
		});
		checkBox.setBounds(367, 44, 53, 23);
		frame.getContentPane().add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("Carl");
		checkBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox_1.isSelected())
				{
					
					textField_6.setEnabled(true);
					textField_6.setText(" ");
					textField_6.requestFocus();
					
				}
				else
				{
					
					textField_6.setEnabled(false);
					textField_6.setText("0");
					
				}
				
			}
		});
		checkBox_1.setBounds(367, 78, 53, 23);
		frame.getContentPane().add(checkBox_1);
		
		JCheckBox checkBox_3 = new JCheckBox("Carl");
		checkBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox_3.isSelected())
				{
					
					textField_7.setEnabled(true);
					textField_7.setText(" ");
					textField_7.requestFocus();
					
				}
				else
				{
					
					textField_7.setEnabled(false);
					textField_7.setText("0");
					
				}
			}
		});
		checkBox_3.setBounds(367, 112, 53, 23);
		frame.getContentPane().add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("Carl");
		checkBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox_4.isSelected())
				{
					
					textField_8.setEnabled(true);
					textField_8.setText(" ");
					textField_8.requestFocus();
					
				}
				else
				{
					
					textField_8.setEnabled(false);
					textField_8.setText("0");
					
				}
			}
		});
		checkBox_4.setBounds(367, 146, 53, 23);
		frame.getContentPane().add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("Carl");
		checkBox_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox_5.isSelected())
				{
					
					textField_9.setEnabled(true);
					textField_9.setText(" ");
					textField_9.requestFocus();
					
				}
				else
				{
					
					textField_9.setEnabled(false);
					textField_9.setText("0");
					
				}
			}
		});
		checkBox_5.setBounds(367, 180, 53, 23);
		frame.getContentPane().add(checkBox_5);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setText("0");
		textField_5.setColumns(10);
		textField_5.setBounds(426, 47, 53, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setText("0");
		textField_6.setColumns(10);
		textField_6.setBounds(426, 81, 53, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setText("0");
		textField_7.setColumns(10);
		textField_7.setBounds(426, 115, 53, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setText("0");
		textField_8.setColumns(10);
		textField_8.setBounds(426, 149, 53, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setText("0");
		textField_9.setColumns(10);
		textField_9.setBounds(426, 183, 53, 20);
		frame.getContentPane().add(textField_9);
		
		JCheckBox checkBox_6 = new JCheckBox("Carl");
		checkBox_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox_6.isSelected())
				{
					
					textField_14.setEnabled(true);
					textField_14.setText(" ");
					textField_14.requestFocus();
					
				}
				else
				{
					
					textField_14.setEnabled(false);
					textField_14.setText("0");
				}
			}
		});
		checkBox_6.setBounds(500, 44, 53, 23);
		frame.getContentPane().add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("Carl");
		checkBox_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox_7.isSelected())
				{
					
					textField_13.setEnabled(true);
					textField_13.setText(" ");
					textField_13.requestFocus();
					
				}
				else
				{
					
					textField_13.setEnabled(false);
					textField_13.setText("0");
					
				}
			}
		});
		checkBox_7.setBounds(500, 78, 53, 23);
		frame.getContentPane().add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("Carl");
		checkBox_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox_8.isSelected())
				{
					
					textField_12.setEnabled(true);
					textField_12.setText(" ");
					textField_12.requestFocus();
					
				}
				else
				{
					
					textField_12.setEnabled(false);
					textField_12.setText("0");
					
				}
			}
		});
		checkBox_8.setBounds(500, 112, 53, 23);
		frame.getContentPane().add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("Carl");
		checkBox_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox_9.isSelected())
				{
					
					textField_11.setEnabled(true);
					textField_11.setText(" ");
					textField_11.requestFocus();
				}
				else
				{
					
					textField_11.setEnabled(false);
					textField_11.setText("0");
				}
			}
		});
		checkBox_9.setBounds(500, 146, 53, 23);
		frame.getContentPane().add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("Carl");
		checkBox_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox_10.isSelected())
				{
					
					textField_10.setEnabled(true);
					textField_10.setText(" ");
					textField_10.requestFocus();
				}
				else
				{
					
					textField_10.setEnabled(true);
					textField_10.setText("0");
					
				}
			}
		});
		checkBox_10.setBounds(500, 180, 53, 23);
		frame.getContentPane().add(checkBox_10);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setText("0");
		textField_10.setColumns(10);
		textField_10.setBounds(566, 183, 53, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setText("0");
		textField_11.setColumns(10);
		textField_11.setBounds(566, 149, 53, 20);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setText("0");
		textField_12.setColumns(10);
		textField_12.setBounds(566, 115, 53, 20);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setText("0");
		textField_13.setColumns(10);
		textField_13.setBounds(566, 81, 53, 20);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setText("0");
		textField_14.setColumns(10);
		textField_14.setBounds(566, 48, 53, 20);
		frame.getContentPane().add(textField_14);
		
		JCheckBox checkBox_11 = new JCheckBox("Carl");
		checkBox_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox_11.isSelected())
				{
					
					textField_15.setEnabled(true);
					
				}
				else
				{
					
					textField_15.setEnabled(false);
					textField_15.setText("0");
				}
					
			}
		});
		checkBox_11.setBounds(639, 180, 53, 23);
		frame.getContentPane().add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("Carl");
		checkBox_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox_12.isSelected())
				{
					
					textField_16.setEnabled(true);
					textField_16.setText(" ");
					textField_16.requestFocus();
					
				}
				else
				{
					
					textField_16.setEnabled(false);
					textField_16.setText("0");
					
				}
				
				
			}
		});
		checkBox_12.setBounds(639, 146, 53, 23);
		frame.getContentPane().add(checkBox_12);
		
		JCheckBox checkBox_13 = new JCheckBox("Carl");
		checkBox_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox_13.isSelected())
				{
					
					textField_17.setEnabled(true);
					textField_17.setText(" ");
					textField_17.requestFocus();
					
				}
				else
				{
					
					textField_17.setEnabled(false);
					textField_17.setText("0");
				}
			}
		});
		checkBox_13.setBounds(639, 112, 53, 23);
		frame.getContentPane().add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("Carl");
		checkBox_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox_14.isSelected())
				{
					
					textField_18.setEnabled(true);
					textField_18.setText(" ");
					textField_18.requestFocus();
				}
				else
				{
					
					textField_18.setEnabled(false);
					textField_18.setText("0");
				}
			}
		});
		checkBox_14.setBounds(639, 78, 53, 23);
		frame.getContentPane().add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("Carl");
		checkBox_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox_15.isSelected())
				{
					
					textField_19.setEnabled(true);
					textField_19.setText(" ");
					textField_19.requestFocus();
				}
				else
				{
					
					textField_19.setEnabled(false);
					textField_19.setText("0");
					
				}
			}
		});
		checkBox_15.setBounds(639, 44, 53, 23);
		frame.getContentPane().add(checkBox_15);
		
		textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setText("0");
		textField_15.setColumns(10);
		textField_15.setBounds(698, 183, 53, 20);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setText("0");
		textField_16.setColumns(10);
		textField_16.setBounds(698, 149, 53, 20);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setText("0");
		textField_17.setColumns(10);
		textField_17.setBounds(698, 115, 53, 20);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setText("0");
		textField_18.setColumns(10);
		textField_18.setBounds(698, 81, 53, 20);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setText("0");
		textField_19.setColumns(10);
		textField_19.setBounds(698, 48, 53, 20);
		frame.getContentPane().add(textField_19);
		
		JCheckBox checkBox_16 = new JCheckBox("Carl");
		checkBox_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox_16.isSelected())
				{
					
					textField_20.setEnabled(true);
					textField_20.setText(" ");
					textField_20.requestFocus();
					
				}
				else
				{
					
					textField_20.setEnabled(false);
					textField_20.setText("0");
					
				}
			}
		});
		checkBox_16.setBounds(768, 180, 53, 23);
		frame.getContentPane().add(checkBox_16);
		
		JCheckBox checkBox_17 = new JCheckBox("Carl");
		checkBox_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox_17.isSelected())
				{
					
					textField_21.setEnabled(true);
					textField_21.setText(" ");
					textField_21.requestFocus();
					
				}
				else
				{
					
					textField_21.setEnabled(false);
					textField_21.setText("0");
					
					
				}
			}
		});
		checkBox_17.setBounds(768, 146, 53, 23);
		frame.getContentPane().add(checkBox_17);
		
		JCheckBox checkBox_18 = new JCheckBox("Carl");
		checkBox_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox_18.isSelected())
				{
					
					textField_22.setEnabled(true);
					textField_22.setText(" ");
					textField_22.requestFocus();
				}
				else
				{
					
					
					textField_22.setEnabled(false);
					textField_22.setText("0");
				}
			}
		});
		checkBox_18.setBounds(768, 112, 53, 23);
		frame.getContentPane().add(checkBox_18);
		
		JCheckBox checkBox_19 = new JCheckBox("Carl");
		checkBox_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox_19.isSelected())
				{
					
					textField_23.setEnabled(true);
					textField_23.setText(" ");
					textField_23.requestFocus();
					
				}
				else
				{
					
					textField_23.setEnabled(false);
					textField_23.setText("0");
					
				}
			}
		});
		checkBox_19.setBounds(768, 78, 53, 23);
		frame.getContentPane().add(checkBox_19);
		
		JCheckBox checkBox_20 = new JCheckBox("Carl");
		checkBox_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkBox_20.isSelected())
				{
					
					textField_24.setEnabled(true);
					textField_24.setText(" ");
					textField_24.requestFocus();
					
				}
				else
				{
					
					textField_24.setEnabled(false);
					textField_24.setText("0");
					
				}
			}
		});
		checkBox_20.setBounds(768, 44, 53, 23);
		frame.getContentPane().add(checkBox_20);
		
		textField_20 = new JTextField();
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setText("0");
		textField_20.setColumns(10);
		textField_20.setBounds(827, 183, 53, 20);
		frame.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setText("0");
		textField_21.setColumns(10);
		textField_21.setBounds(827, 149, 53, 20);
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setText("0");
		textField_22.setColumns(10);
		textField_22.setBounds(827, 115, 53, 20);
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setText("0");
		textField_23.setColumns(10);
		textField_23.setBounds(827, 81, 53, 20);
		frame.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setText("0");
		textField_24.setColumns(10);
		textField_24.setBounds(827, 48, 53, 20);
		frame.getContentPane().add(textField_24);
		
		textField_26 = new JTextField();
		textField_26.setBounds(639, 351, 182, 20);
		frame.getContentPane().add(textField_26);
		textField_26.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("RESET");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxNewCheckBox.setSelected(false);
				chckbxNewCheckBox_1.setSelected(false);
				chckbxNewCheckBox_2.setSelected(false);
				chckbxNewCheckBox_3.setSelected(false);
				checkBox_2.setSelected(false);
				checkBox_1.setSelected(false);
				checkBox.setSelected(false);
				checkBox_3.setSelected(false);
				checkBox_4.setSelected(false);
				checkBox_5.setSelected(false);
				checkBox_6.setSelected(false);
				checkBox_7.setSelected(false);
				checkBox_8.setSelected(false);
				checkBox_9.setSelected(false);
				checkBox_10.setSelected(false);
				checkBox_11.setSelected(false);
				checkBox_12.setSelected(false);
				checkBox_13.setSelected(false);
				checkBox_14.setSelected(false);
				checkBox_15.setSelected(false);
				checkBox_16.setSelected(false);
				checkBox_17.setSelected(false);
				checkBox_18.setSelected(false);
				checkBox_19.setSelected(false);
				checkBox_20.setSelected(false);
				
				textField.setEnabled(false);
				textField_1.setEnabled(false);
				textField_2.setEnabled(false);
				textField_3.setEnabled(false);
				textField_4.setEnabled(false);
				textField_5.setEnabled(false);
				textField_6.setEnabled(false);
				textField_7.setEnabled(false);
				textField_8.setEnabled(false);
				textField_9.setEnabled(false);
				textField_10.setEnabled(false);
				textField_11.setEnabled(false);
				textField_12.setEnabled(false);
				textField_13.setEnabled(false);
				textField_14.setEnabled(false);
				textField_15.setEnabled(false);
				textField_16.setEnabled(false);
				textField_17.setEnabled(false);
				textField_18.setEnabled(false);
				textField_19.setEnabled(false);
				textField_20.setEnabled(false);
				textField_21.setEnabled(false);
				textField_22.setEnabled(false);
				textField_23.setEnabled(false);
				textField_24.setEnabled(false);
				textField_26.setEnabled(false);
				textArea.setEnabled(false);
				
				
				
				
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textField_24.setText("");
				textField_26.setText("");
			}
		});
		btnNewButton_2.setBounds(181, 552, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("EXIT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setBounds(347, 552, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("0");
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				char c = e.getKeyChar() ;
				if(!(Character.isDigit(c))
				||(c == KeyEvent.VK_BACK_SPACE)
				||(c == KeyEvent.VK_DELETE)) {
				e.consume();
						
				
				
			}
		}});
		textField_1.setColumns(10);
		textField_1.setBounds(290, 79, 53, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setText("0");
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				char c = e.getKeyChar() ;
				if(!(Character.isDigit(c))
				||(c == KeyEvent.VK_BACK_SPACE)
				||(c == KeyEvent.VK_DELETE)) {
				e.consume();
			}
		}});
		textField_2.setColumns(10);
		textField_2.setBounds(290, 113, 53, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText("0");
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar() ;
				if(!(Character.isDigit(c))
				||(c == KeyEvent.VK_BACK_SPACE)
				||(c == KeyEvent.VK_DELETE)) {
				e.consume();
			}
		}});
		textField_3.setColumns(10);
		textField_3.setBounds(290, 147, 53, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setText("0");
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				char c = e.getKeyChar() ;
				if(!(Character.isDigit(c))
				||(c == KeyEvent.VK_BACK_SPACE)
				||(c == KeyEvent.VK_DELETE)) {
				e.consume();
			}
		}});
		textField_4.setColumns(10);
		textField_4.setBounds(290, 181, 53, 20);
		frame.getContentPane().add(textField_4);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("0");
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				char c = e.getKeyChar() ;
				if(!(Character.isDigit(c))
				||(c == KeyEvent.VK_BACK_SPACE)
				||(c == KeyEvent.VK_DELETE)) {
				e.consume();
			}
		}});
		
		textField.setBounds(290, 45, 53, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(834, 354, 46, 14);
		frame.getContentPane().add(lblTotal);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				
				textField.setEnabled(false);
				textField_1.setEnabled(false);
				textField_2.setEnabled(false);
				textField_3.setEnabled(false);
				textField_4.setEnabled(false);
				textField_5.setEnabled(false);
				textField_6.setEnabled(false);
				textField_7.setEnabled(false);
				textField_8.setEnabled(false);
				textField_9.setEnabled(false);
				textField_10.setEnabled(false);
				textField_11.setEnabled(false);
				textField_12.setEnabled(false);
				textField_13.setEnabled(false);
				textField_14.setEnabled(false);
				textField_15.setEnabled(false);
				textField_16.setEnabled(false);
				textField_17.setEnabled(false);
				textField_18.setEnabled(false);
				textField_19.setEnabled(false);
				textField_20.setEnabled(false);
				textField_21.setEnabled(false);
				textField_22.setEnabled(false);
				textField_23.setEnabled(false);
				textField_24.setEnabled(false);
				textField_26.setEnabled(false);
				textArea.setEnabled(false);
				
				
				
				textField_26.setText(null);
				

				chckbxNewCheckBox.setEnabled(false);
				chckbxNewCheckBox_1.setEnabled(false);
				chckbxNewCheckBox_2.setEnabled(false);
				chckbxNewCheckBox_3.setEnabled(false);
				checkBox.setEnabled(false);
				checkBox_1.setEnabled(false);
				checkBox_2.setEnabled(false);
				checkBox_3.setEnabled(false);
				checkBox_4.setEnabled(false);
				checkBox_5.setEnabled(false);
				checkBox_6.setEnabled(false);
				checkBox_7.setEnabled(false);
				checkBox_8.setEnabled(false);
				checkBox_9.setEnabled(false);
				checkBox_10.setEnabled(false);
				checkBox_11.setEnabled(false);
				checkBox_12.setEnabled(false);
				checkBox_13.setEnabled(false);
				checkBox_14.setEnabled(false);
				checkBox_15.setEnabled(false);
				checkBox_16.setEnabled(false);
				checkBox_17.setEnabled(false);
				checkBox_18.setEnabled(false);
				checkBox_19.setEnabled(false);
				checkBox_20.setEnabled(false);
				
				
				
				
				
				
				
			
		}});
		frame.setBounds(100, 100, 922, 636);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\u65E5\u672C\u8A9E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				chckbxNewCheckBox.setEnabled(true);
				chckbxNewCheckBox_1.setEnabled(true);
				chckbxNewCheckBox_2.setEnabled(true);
				chckbxNewCheckBox_3.setEnabled(true);
				checkBox_2.setEnabled(true);
				
				checkBox.setEnabled(false);
				checkBox_1.setEnabled(false);
				checkBox_3.setEnabled(false);
				checkBox_4.setEnabled(false);
				checkBox_5.setEnabled(false);
				checkBox_6.setEnabled(false);
				checkBox_7.setEnabled(false);
				checkBox_8.setEnabled(false);
				checkBox_9.setEnabled(false);
				checkBox_10.setEnabled(false);
				checkBox_11.setEnabled(false);
				checkBox_12.setEnabled(false);
				checkBox_13.setEnabled(false);
				checkBox_14.setEnabled(false);
				checkBox_15.setEnabled(false);
				checkBox_16.setEnabled(false);
				checkBox_17.setEnabled(false);
				checkBox_18.setEnabled(false);
				checkBox_19.setEnabled(false);
				checkBox_20.setEnabled(false);
			}
		});
		btnNewButton.setBounds(10, 44, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnInternationale = new JButton("Internationale");
		btnInternationale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkBox.setEnabled(true);
				checkBox_1.setEnabled(true);
				checkBox_3.setEnabled(true);
				checkBox_4.setEnabled(true);
				checkBox_5.setEnabled(true);
				
				chckbxNewCheckBox.setEnabled(false);
				chckbxNewCheckBox_1.setEnabled(false);
				chckbxNewCheckBox_2.setEnabled(false);
				chckbxNewCheckBox_3.setEnabled(false);
				checkBox_2.setEnabled(false);
				checkBox_6.setEnabled(false);
				checkBox_7.setEnabled(false);
				checkBox_8.setEnabled(false);
				checkBox_9.setEnabled(false);
				checkBox_10.setEnabled(false);
				checkBox_11.setEnabled(false);
				checkBox_12.setEnabled(false);
				checkBox_13.setEnabled(false);
				checkBox_14.setEnabled(false);
				checkBox_15.setEnabled(false);
				checkBox_16.setEnabled(false);
				checkBox_17.setEnabled(false);
				checkBox_18.setEnabled(false);
				checkBox_19.setEnabled(false);
				checkBox_20.setEnabled(false);
			
				
			}
		});
		btnInternationale.setBounds(10, 78, 89, 23);
		frame.getContentPane().add(btnInternationale);
		

		JButton button_1 = new JButton("\u0E44\u0E17\u0E22");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkBox_6.setEnabled(true);
				checkBox_7.setEnabled(true);
				checkBox_8.setEnabled(true);
				checkBox_9.setEnabled(true);
				checkBox_10.setEnabled(true);
				
				chckbxNewCheckBox.setEnabled(false);
				chckbxNewCheckBox_1.setEnabled(false);
				chckbxNewCheckBox_2.setEnabled(false);
				chckbxNewCheckBox_3.setEnabled(false);
				checkBox.setEnabled(false);
				checkBox_1.setEnabled(false);
				checkBox_2.setEnabled(false);
				checkBox_3.setEnabled(false);
				checkBox_4.setEnabled(false);
				checkBox_5.setEnabled(false);
				checkBox_11.setEnabled(false);
				checkBox_12.setEnabled(false);
				checkBox_13.setEnabled(false);
				checkBox_14.setEnabled(false);
				checkBox_15.setEnabled(false);
				checkBox_16.setEnabled(false);
				checkBox_17.setEnabled(false);
				checkBox_18.setEnabled(false);
				checkBox_19.setEnabled(false);
				checkBox_20.setEnabled(false);
				
				
			}
		});
		button_1.setBounds(10, 112, 89, 23);
		frame.getContentPane().add(button_1);
		
		
		
		JButton button_2 = new JButton("\u9EB5\u689D");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkBox_11.setEnabled(true);
				checkBox_12.setEnabled(true);
				checkBox_13.setEnabled(true);
				checkBox_14.setEnabled(true);
				checkBox_15.setEnabled(true);
				

				chckbxNewCheckBox.setEnabled(false);
				chckbxNewCheckBox_1.setEnabled(false);
				chckbxNewCheckBox_2.setEnabled(false);
				chckbxNewCheckBox_3.setEnabled(false);
				checkBox.setEnabled(false);
				checkBox_1.setEnabled(false);
				checkBox_2.setEnabled(false);
				checkBox_3.setEnabled(false);
				checkBox_4.setEnabled(false);
				checkBox_5.setEnabled(false);
				checkBox_6.setEnabled(false);
				checkBox_7.setEnabled(false);
				checkBox_8.setEnabled(false);
				checkBox_9.setEnabled(false);
				checkBox_10.setEnabled(false);
				checkBox_16.setEnabled(false);
				checkBox_17.setEnabled(false);
				checkBox_18.setEnabled(false);
				checkBox_19.setEnabled(false);
				checkBox_20.setEnabled(false);
				
				
			}
		});
		button_2.setBounds(10, 146, 89, 23);
		frame.getContentPane().add(button_2);
		
		
		JButton btnDesserto = new JButton("Desserto");
		btnDesserto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkBox_16.setEnabled(true);
				checkBox_17.setEnabled(true);
				checkBox_18.setEnabled(true);
				checkBox_19.setEnabled(true);
				checkBox_20.setEnabled(true);
				
				
				chckbxNewCheckBox.setEnabled(false);
				chckbxNewCheckBox_1.setEnabled(false);
				chckbxNewCheckBox_2.setEnabled(false);
				chckbxNewCheckBox_3.setEnabled(false);
				checkBox.setEnabled(false);
				checkBox_1.setEnabled(false);
				checkBox_2.setEnabled(false);
				checkBox_3.setEnabled(false);
				checkBox_4.setEnabled(false);
				checkBox_5.setEnabled(false);
				checkBox_6.setEnabled(false);
				checkBox_7.setEnabled(false);
				checkBox_8.setEnabled(false);
				checkBox_9.setEnabled(false);
				checkBox_10.setEnabled(false);
				checkBox_11.setEnabled(false);
				checkBox_12.setEnabled(false);
				checkBox_13.setEnabled(false);
				checkBox_14.setEnabled(false);
				checkBox_15.setEnabled(false);
				
			}
		});
		btnDesserto.setBounds(10, 180, 89, 23);
		frame.getContentPane().add(btnDesserto);
		
		
		//Food price 
		JButton btnNewButton_1 = new JButton("Total");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Total;
				
				itemcost[0] = Double.parseDouble(textField.getText()) * 50;
				itemcost[1] = Double.parseDouble(textField_1.getText()) * 20;
				itemcost[2] = Double.parseDouble(textField_2.getText()) * 30;
				itemcost[3] = Double.parseDouble(textField_3.getText()) * 40;
				itemcost[4] = Double.parseDouble(textField_4.getText()) * 50;
				itemcost[5] = Double.parseDouble(textField_5.getText()) * 50;
				itemcost[6] = Double.parseDouble(textField_6.getText()) * 50;
				itemcost[7] = Double.parseDouble(textField_7.getText()) * 50;
				itemcost[8] = Double.parseDouble(textField_8.getText()) * 50;
				itemcost[9] = Double.parseDouble(textField_9.getText()) * 50;
				itemcost[10] = Double.parseDouble(textField_14.getText()) * 50;
				itemcost[11] = Double.parseDouble(textField_13.getText()) * 50;
				itemcost[12] = Double.parseDouble(textField_12.getText()) * 50;
				itemcost[13] = Double.parseDouble(textField_11.getText()) * 50;
				itemcost[14] = Double.parseDouble(textField_10.getText()) * 50;
				itemcost[15] = Double.parseDouble(textField_19.getText()) * 50;
				itemcost[16] = Double.parseDouble(textField_18.getText()) * 50;
				itemcost[17] = Double.parseDouble(textField_17.getText()) * 50;
				itemcost[18] = Double.parseDouble(textField_16.getText()) * 50;
				itemcost[19] = Double.parseDouble(textField_15.getText()) * 50;
				itemcost[20] = Double.parseDouble(textField_24.getText()) * 50;
				itemcost[21] = Double.parseDouble(textField_23.getText()) * 50;
				itemcost[22] = Double.parseDouble(textField_22.getText()) * 50;
				itemcost[23] = Double.parseDouble(textField_21.getText()) * 50;
				itemcost[24] = Double.parseDouble(textField_20.getText()) * 50;
				
				itemcost[25] = itemcost[0] + itemcost[1] + itemcost[2] + itemcost[3] + itemcost[4] + itemcost[5] + itemcost[6] + itemcost[7] + itemcost[8] + itemcost[9] + itemcost[10] + itemcost[11] + itemcost[12] + itemcost[13] + itemcost[14] + itemcost[15] + itemcost[16] + itemcost[17] + itemcost[18] + itemcost[19] + itemcost[20] + itemcost[21] + itemcost[22] + itemcost[23] + itemcost[24];
				
				Total = String.format("carl"+ "   " +    itemcost[25]);
				
				textField_26.setText(Total);
				
			}
		});
		btnNewButton_1.setBounds(10, 552, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
	}
}
