package Presentation_Layer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import BussinessLogic_Layer.Make_Word;
import BussinessLogic_Layer.ReadXML;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JProgressBar;

public class words_Database extends JFrame {

	File File3;
	static String FolderPath;
	private JPanel contentPane;
	private static JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	static words_Database frame = new words_Database();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					       frame = new words_Database();
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
	public words_Database() {
		setBackground(new Color(192, 192, 192));
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		textField = new JTextField();
		textField.setBounds(451, 145, 155, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Browser");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBackground(new Color(238, 232, 170));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser Chooser = new JFileChooser();
				int response=Chooser.showOpenDialog(null);
				if(response==JFileChooser.APPROVE_OPTION) {
					File file =new File (Chooser.getSelectedFile().getAbsolutePath());
					File3=file;
					textField_2.setText(File3.getName());
				}
			}
		});
		btnNewButton.setBounds(636, 145, 143, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Upload PG");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String field=textField.getText();
				System.out.println(field);
				try {
					
				if(field.isBlank()&&File3==null) {
					JOptionPane.showMessageDialog(null,"Please Select Something");
					
				}
				
				else if((field.isBlank())) {
                	textField.setText("");
                	ReadXML f=new ReadXML();
                	
					ReadXML.XML_Single(File3);
					textField.setText("");				
                	}

                else  {
                	String field1=textField.getText();
                	if((field1.isEmpty())){
                		JOptionPane.showMessageDialog(null,"Please Select Something");
                	}
                	else {
                	File3=null;
					getFolder();
                	}
				}
                }
                catch(NullPointerException e1) {
                	JOptionPane.showMessageDialog(null,"Please Select Something");
                }
			}
		});
		btnNewButton_1.setBackground(new Color(245, 245, 220));
		btnNewButton_1.setBounds(559, 238, 104, 41);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Generate Word");
		btnNewButton_2.setBackground(new Color(245, 245, 220));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Make_Word obj=new Make_Word();
				obj.controller();
				
			}
		});
		btnNewButton_2.setBounds(71, 238, 122, 41);
		contentPane.add(btnNewButton_2);
		textField_1 = new JTextField();
		textField_1.setBounds(104, 145, 213, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Select to Insert Word");
		rdbtnNewRadioButton.setBounds(147, 199, 134, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JButton btnNewButton_3 = new JButton("Upload Word");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
				String Word=textField_1 .getText();
				Make_Word obj=new Make_Word();
				obj.Word_Single(Word);
				}
				else {
					JOptionPane.showMessageDialog(null,"Please Select Button"); 
				}
			}
		});
		btnNewButton_3.setBackground(new Color(245, 245, 220));
		btnNewButton_3.setBounds(216, 238, 134, 41);
		contentPane.add(btnNewButton_3);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(657, 186, 122, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Insert Word");
		lblNewLabel.setBounds(182, 121, 122, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Insert Address");
		lblNewLabel_1.setBounds(489, 122, 104, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Task Flow Spell Checker");
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel_2.setBounds(238, 29, 407, 52);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("File");
		lblNewLabel_3.setBounds(622, 189, 32, 13);
		contentPane.add(lblNewLabel_3);
		
		
		
		
		JLabel lblNewLabel_4 = new JLabel("<");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4.setBounds(10, 382, 26, 21);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_5 = new JButton("Clear words");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Make_Word obj=new Make_Word();
				obj.delete(true);
				
			}
		});
		btnNewButton_5.setBounds(71, 306, 122, 41);
		contentPane.add(btnNewButton_5);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(289, 361, 264, 21);
		contentPane.add(progressBar);
		progressBar.setValue(0);
		progressBar.setOpaque(true);
		progressBar.setForeground(Color.YELLOW);
		progressBar.setStringPainted(true);
		
		JButton btnNewButton_4 = new JButton("Home");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeScreen.frame1.setVisible(true);
				frame.hide();
				
		
	            
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4.setBounds(682, 29, 110, 41);
		contentPane.add(btnNewButton_4);
		
		

	}
	
	public static void getFolder() {
		String path=textField.getText();
		System.out.println(path);
		File Folder= new File(path);
		File[] file = Folder.listFiles();
	
				ReadXML f=new ReadXML();
			
      			ReadXML.XML_Folder(file);
				
		textField.setText("");
		
		
	}
}
