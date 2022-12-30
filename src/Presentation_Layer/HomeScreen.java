package Presentation_Layer;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class HomeScreen extends JFrame {

	private JPanel contentPane;
	static HomeScreen Homescreen = new HomeScreen();
	
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
					 Homescreen = new HomeScreen();
					Homescreen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomeScreen() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 355);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Our Spell Checker\r\n");
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setBounds(103, 26, 406, 89);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("XML Files");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				words_Database.frame.setVisible(true);
				
				Homescreen.dispose();
				
				//frame1.setVisible(false);
			}
		});
		btnNewButton.setBounds(245, 127, 130, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Mutants");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mutants.frame.setVisible(true);
				Homescreen.dispose();
				
			}
		});
		btnNewButton_1.setBounds(245, 175, 130, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Check Text");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hilight.frame.setVisible(true);
				Homescreen.dispose();
				
			}
		});
		btnNewButton_2.setBounds(245, 219, 130, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnViewWordTable = new JButton("view Word Table");
		btnViewWordTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				viewandupdate.viewupdate.setVisible(true);
				
				//frame1.setVisible(false);
				
				Homescreen.dispose();
				
			}
		});
		btnViewWordTable.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnViewWordTable.setBounds(245, 265, 130, 21);
		contentPane.add(btnViewWordTable);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(HomeScreen.class.getResource("/images/Grey Minimal Modern Magic School Wisdom Spells Logo (3) (1).png")));
		lblNewLabel_1.setBounds(536, 26, 80, 89);
		contentPane.add(lblNewLabel_1);
	}
}
