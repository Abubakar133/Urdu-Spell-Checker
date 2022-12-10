package Presentation_Layer;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import BussinessLogic_Layer.Make_Word;
import BussinessLogic_Layer.view_update;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class viewandupdate extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel MD;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	view_update obj1=new view_update();
	List words =new ArrayList();
	boolean T=false;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewandupdate frame = new viewandupdate();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public viewandupdate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 838, 621);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane js=new JScrollPane();
		js.setVisible(true);
		getContentPane().add(js);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		scrollPane.setBounds(26, 35, 551, 478);
		contentPane.add(scrollPane);
		
		
		
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		scrollPane.setViewportView(table);
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"id", "word", "Frequency"
			}
		));
		
		String[] colNames = { "id","Word","Frequency"};
	    MD = new DefaultTableModel(colNames, 0);
		
		JButton btnNewButton = new JButton("View Table");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dm = (DefaultTableModel)table.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();

				//List words =new ArrayList();
				words=obj1.getWords();
				
				for (int i = 0; i <words.size();i=i+3)  {
					int j=0;
					Object[] B_Dat = new Object[3];
					 B_Dat[j]= words.get(i);
		            B_Dat[j+1]= words.get(i+1);
		              B_Dat[j+2]=words.get(i+2);
                        
		       
		        MD.addRow(B_Dat);
				 }
				 table.setModel(MD);
		        

			}
			
		});
		btnNewButton.setBounds(206, 533, 178, 41);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(671, 185, 132, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(671, 246, 132, 32);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(671, 311, 132, 32);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblNewLabel.setBounds(590, 185, 81, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblWord = new JLabel("word");
		lblWord.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblWord.setBounds(587, 246, 84, 32);
		contentPane.add(lblWord);
		
		JLabel lblFrequency = new JLabel("Frequency");
		lblFrequency.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblFrequency.setBounds(587, 311, 84, 32);
		contentPane.add(lblFrequency);
		ButtonGroup bg=new ButtonGroup();;
		
		
	}
}
