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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class viewandupdate extends JFrame {

	private JPanel contentPane;
	private JTable tableData;
	private DefaultTableModel MD;
	private JTextField textFieldID;
	private JTextField textFieldword;
	private JTextField textField_2;
	JRadioButton Insert;
	JRadioButton update;
	JRadioButton delete;
	JRadioButton search;
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
		contentPane.setBackground(new Color(95, 158, 160));
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
		
		
		
		
		tableData = new JTable();
		tableData.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		scrollPane.setViewportView(tableData);
		
		tableData.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
					"Count","id", "word", "Frequency"
			}
		));
		
		String[] colNames = { "Count","id","Word","Frequency"};
	    MD = new DefaultTableModel(colNames, 0);
		
		JButton btnNewButton = new JButton("View Table");
		btnNewButton.setBackground(new Color(245, 245, 220));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dm = (DefaultTableModel)tableData.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();

				
				words=obj1.getWords();
				int c=1;
				for (int i = 0; i <words.size();i=i+3)  {
					
					Object[] B_Dat = new Object[4];
					B_Dat[0]=c++;
					 B_Dat[1]= words.get(i);
		            B_Dat[2]= words.get(i+1);
		              B_Dat[3]=words.get(i+2);
                        
		       
		        MD.addRow(B_Dat);
				 }
				 tableData.setModel(MD);
		        

			}
			
		});
		btnNewButton.setBounds(206, 533, 178, 41);
		contentPane.add(btnNewButton);
		
		textFieldID = new JTextField();
		textFieldID.setEditable(false);
		textFieldID.setBounds(671, 185, 132, 32);
		contentPane.add(textFieldID);
		textFieldID.setColumns(10);
		
		textFieldword = new JTextField();
		textFieldword.setEditable(false);
		textFieldword.setColumns(10);
		textFieldword.setBounds(671, 246, 132, 32);
		contentPane.add(textFieldword);
		
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
		
		
		
		JButton btnNewButton_1 = new JButton("insert");
		btnNewButton_1.setBackground(new Color(245, 222, 179));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Make_Word obj=new Make_Word();
				obj.Word_Single(textFieldword.getText());
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnNewButton_1.setBounds(586, 400, 109, 32);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Update");
		btnNewButton_1_1.setBackground(new Color(245, 222, 179));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int id=Integer.parseInt(textFieldID.getText());
				int fre=Integer.parseInt(textField_2.getText());
				 obj1.update(textFieldword.getText(),id,fre);
				
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1_1.setBounds(718, 400, 96, 32);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Delete");
		btnNewButton_1_1_1.setBackground(new Color(245, 222, 179));
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int id=Integer.parseInt(textFieldID.getText());
				obj1.delete(id);
				
				
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1_1_1.setBounds(586, 463, 109, 32);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("Clear");
		btnNewButton_1_1_2.setBackground(new Color(245, 245, 220));
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel dm = (DefaultTableModel)tableData.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				textFieldword.setText("");
				textField_2.setText("");
				textFieldID.setText("");
				
			}
		});
		btnNewButton_1_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1_1_2.setBounds(718, 463, 96, 32);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Search");
		btnNewButton_1_1_1_1.setBackground(new Color(245, 222, 179));
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dm = (DefaultTableModel)tableData.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				String id=textFieldID.getText();
				String Wor=textFieldword.getText();
				

				try {
				 if(id!=null) {
				for (int i = 0; i <words.size();i=i+3)  {
					if(id.equals(words.get(i))) {
						
					
					
					Object[] B_Data = new Object[4];
					 B_Data[0]=1;
		            B_Data[1]= words.get(i);
		              B_Data[2]=words.get(i+1);
		              B_Data[3]=words.get(i+2);
					
		       
		        MD.addRow(B_Data);
		        break;
				 }
				}
				 tableData.setModel(MD);
			}
			
			   if(Wor!=null) {
				
				for (int i = 0; i <words.size();i=i+3)  {
					if(Wor.equals(words.get(i+1))) {
						
						Object[] B_Data = new Object[4];
						 B_Data[0]=1;
			            B_Data[1]= words.get(i);
			              B_Data[2]=words.get(i+1);
			              B_Data[3]=words.get(i+2);
					
		       
		        MD.addRow(B_Data);
		        break;
				 }
				}
				 tableData.setModel(MD);
			}
			   if(textField_2.getText()!=null) {
				   int fre=Integer.parseInt(textField_2.getText());
					for (int i = 0; i <words.size();i=i+3)  {
						String Str=(String) words.get(i+2);
						int f= Integer.parseInt(Str );
						if(f<= fre) {
							
							Object[] B_Data = new Object[4];
							 B_Data[0]=1;
				            B_Data[1]= words.get(i);
				              B_Data[2]=words.get(i+1);
				              B_Data[3]=words.get(i+2);
						
			       
			        MD.addRow(B_Data);
			       
					 }
					}
					 tableData.setModel(MD);
				}
				}
				catch(NumberFormatException e1) {
					
				}
			}
				
		});
		btnNewButton_1_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1_1_1_1.setBounds(651, 520, 109, 32);
		contentPane.add(btnNewButton_1_1_1_1);
		
		 Insert = new JRadioButton("");
		 Insert.setBackground(new Color(95, 158, 160));
		Insert.setBounds(583, 380, 28, 21);
		contentPane.add(Insert);
		
		 update = new JRadioButton("");
		 update.setBackground(new Color(95, 158, 160));
		update.setBounds(718, 380, 28, 21);
		contentPane.add(update);
		
		 delete = new JRadioButton("");
		 delete.setBackground(new Color(95, 158, 160));
		delete.setBounds(583, 446, 28, 21);
		contentPane.add(delete);
		
		 search = new JRadioButton("");
		 search.setBackground(new Color(95, 158, 160));
		search.setBounds(651, 501, 28, 21);
		contentPane.add(search);
		ButtonGroup bg=new ButtonGroup();
        bg.add(Insert);
        bg.add(update);
        bg.add(search);
        bg.add(delete);
        bg.add(search);
        
        getContentPane().add(Insert);
        getContentPane().add(update);
       getContentPane().add(delete );
        getContentPane().add(search);

        Insert.addAncestorListener(null);;
		 update.addAncestorListener(null);
		 
		
		 if(Insert.isSelected()) {
			 textFieldID.setEnabled(true);
		 }
		 else if(update.isSelected()) {
			 textFieldID.setEnabled(false);
		 }
		 
		 Insert.addActionListener(new ActionListener() {

			 public void actionPerformed(ActionEvent e) {

			 textFieldword.setEditable(true);
			 textFieldID.setEditable(false);
			 textField_2.setEditable(false);
			 

			 }

			 });
		 update.addActionListener(new ActionListener() {

			 public void actionPerformed(ActionEvent e) {

				 textFieldword.setEditable(true);
				 textFieldID.setEditable(true);
				 textField_2.setEditable(true);
			 }

			 });
		 delete.addActionListener(new ActionListener() {

			 public void actionPerformed(ActionEvent e) {

				 textFieldword.setEditable(false);
				 textFieldID.setEditable(true);
				 textField_2.setEditable(false);

			 }

			 });
		 search.addActionListener(new ActionListener() {

			 public void actionPerformed(ActionEvent e) {

				 textFieldword.setEditable(true);
				 textFieldID.setEditable(true);
				 textField_2.setEditable(true);

			 }

			 });
		
		 tableData.addMouseListener(new MouseAdapter() {
			    @Override
			    public void mouseClicked(final MouseEvent e) {
			    	try {
			        if (e.getClickCount() == 1) {
			            final JTable le= (JTable)e.getSource();
			            final int r = le.getSelectedRow();
			            final int c = le.getSelectedColumn();
			            final String val = (String)le.getValueAt(r, c);
			            textFieldID.setText(val);
			        }}
			    	catch(Exception e1){
			    		
			    		
			    	}
			    }
			    });	
	}
}
