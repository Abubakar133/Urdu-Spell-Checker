package Presentation_Layer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import BussinessLogic_Layer.Facade;
import BussinessLogic_Layer.IFacade;
import javax.swing.ImageIcon;

public class UploadWord extends JFrame {

	File fileobj;
	static String folderpath;
	private JPanel contentpane;
	private static JTextField textfield_address;
	private JTextField textField_getword;
	private JTextField textField_filename;
	static UploadWord insertword = new UploadWord();
	private static IFacade facad=new Facade();
	JProgressBar progressBar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
					if ("Nimbus".equals(info.getName())) {
						try {
							UIManager.setLookAndFeel(info.getClassName());
						} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
								| UnsupportedLookAndFeelException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					}
				}
				try {
					       insertword = new UploadWord();
					insertword.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UploadWord() {
		setBackground(new Color(192, 192, 192));
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 450);
		contentpane = new JPanel();
		contentpane.setForeground(new Color(0, 0, 0));
		contentpane.setBackground(SystemColor.desktop);
		contentpane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentpane);
		contentpane.setLayout(null);
		
		
		textfield_address = new JTextField();
		textfield_address.setBounds(451, 145, 155, 31);
		contentpane.add(textfield_address);
		textfield_address.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Browser");
		btnNewButton.setIcon(new ImageIcon(UploadWord.class.getResource("/images/Search-icon (1).png")));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBackground(new Color(224, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				progressBar.setValue(1);
				JFileChooser Chooser = new JFileChooser();
				int response=Chooser.showOpenDialog(null);
				if(response==JFileChooser.APPROVE_OPTION) {
					File file =new File (Chooser.getSelectedFile().getAbsolutePath());
					fileobj=file;
					textField_filename.setText(fileobj.getName());
					progressBar.setValue(100);
				}
			}
		});
		btnNewButton.setBounds(636, 145, 143, 31);
		contentpane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Upload PG");
		btnNewButton_1.setIcon(new ImageIcon(UploadWord.class.getResource("/images/Network-Upload-icon.png")));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String field=textfield_address.getText();
				progressBar.setValue(1);
				System.out.println(field);
				try {
					
				if(field.isEmpty()&&fileobj==null) {
					JOptionPane.showMessageDialog(null,"Please Select Something");
					progressBar.setValue(1);
				}
				
				else if((field.isEmpty())) {
                	textfield_address.setText("");
                	//ReadXML f=new ReadXML();
                	
					facad.XML_Single(fileobj);
					textfield_address.setText("");	
					progressBar.setValue(100);
                	}

                else  {
                	String field1=textfield_address.getText();
                	if((field1.isEmpty())){
                		JOptionPane.showMessageDialog(null,"Please Select Something");
                		progressBar.setValue(1);
                	}
                	else {
                	fileobj=null;
					getFolder();
					progressBar.setValue(100);
                	}
				}
                }
                catch(NullPointerException e1) {
                	JOptionPane.showMessageDialog(null,"Please Select Something");
                }
			}
		});
		btnNewButton_1.setBackground(new Color(224, 255, 255));
		btnNewButton_1.setBounds(561, 238, 149, 41);
		contentpane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Generate Word");
		btnNewButton_2.setIcon(new ImageIcon(UploadWord.class.getResource("/images/Generate-tables-icon.png")));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2.setBackground(new Color(224, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				progressBar.setValue(1);
				
				facad.controller();
				progressBar.setValue(100);
			}
		});
		btnNewButton_2.setBounds(55, 238, 149, 41);
		contentpane.add(btnNewButton_2);
		textField_getword = new JTextField();
		textField_getword.setBounds(135, 145, 155, 31);
		contentpane.add(textField_getword);
		textField_getword.setColumns(10);
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Select to Insert Word");
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBackground(SystemColor.desktop);
		rdbtnNewRadioButton.setBounds(147, 189, 157, 21);
		contentpane.add(rdbtnNewRadioButton);
		
		JButton btnNewButton_3 = new JButton("Upload Word");
		btnNewButton_3.setIcon(new ImageIcon(UploadWord.class.getResource("/images/Network-Upload-icon.png")));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				progressBar.setValue(1);
				if(rdbtnNewRadioButton.isSelected()) {
				String Word=textField_getword .getText();

                   
				facad.Word_Single(Word);
				progressBar.setValue(100);
				}
				else {
					JOptionPane.showMessageDialog(null,"Please Select Button"); 
				}
			}
		});
		btnNewButton_3.setBackground(new Color(224, 255, 255));
		btnNewButton_3.setBounds(216, 238, 149, 41);
		contentpane.add(btnNewButton_3);
		
		textField_filename = new JTextField();
		textField_filename.setEditable(false);
		textField_filename.setBounds(675, 186, 104, 24);
		contentpane.add(textField_filename);
		textField_filename.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Insert Word");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setBounds(182, 121, 122, 13);
		contentpane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Insert Address");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBounds(489, 122, 104, 13);
		contentpane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Task Flow Spell Checker");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel_2.setBounds(238, 29, 407, 52);
		contentpane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("File");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(646, 188, 32, 13);
		contentpane.add(lblNewLabel_3);
		
		JButton btnNewButton_5 = new JButton("Clear words");
		btnNewButton_5.setIcon(new ImageIcon(UploadWord.class.getResource("/images/clear-icon.png")));
		btnNewButton_5.setBackground(new Color(224, 255, 255));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				facad.delete(true);
				progressBar.setValue(100);
				
			}
		});
		btnNewButton_5.setBounds(71, 306, 279, 41);
		contentpane.add(btnNewButton_5);
		
		 progressBar = new JProgressBar();
		progressBar.setFont(new Font("Tahoma", Font.BOLD, 10));
		progressBar.setBounds(289, 361, 264, 21);
		contentpane.add(progressBar);
		progressBar.setValue(0);
		progressBar.setOpaque(true);
		progressBar.setForeground(Color.blue);
		progressBar.setStringPainted(true);
		
		JButton btnNewButton_4 = new JButton("Home");
		btnNewButton_4.setIcon(new ImageIcon(UploadWord.class.getResource("/images/home-icon.png")));
		btnNewButton_4.setBackground(new Color(230, 230, 250));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeScreen.Homescreen.setVisible(true);
				insertword.hide();
				
		
	            
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_4.setBounds(675, 39, 117, 31);
		contentpane.add(btnNewButton_4);
		
		

	}
	
	public static void getFolder() {
		String path=textfield_address.getText();
		System.out.println(path);
		File Folder= new File(path);
		File[] file = Folder.listFiles();
	
				
			
      			facad.XML_Folder(file);
				
		textfield_address.setText("");
		
		
	}
}
