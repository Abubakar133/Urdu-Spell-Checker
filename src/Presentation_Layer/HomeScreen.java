package Presentation_Layer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeScreen extends JFrame {

	private JPanel contentPane;
	static HomeScreen frame1 = new HomeScreen();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame1 = new HomeScreen();
					frame1.setVisible(true);
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
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Our Spell ");
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel.setForeground(new Color(25, 25, 112));
		lblNewLabel.setBounds(170, 26, 301, 89);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("XML Files");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				words_Database.frame.setVisible(true);
				
				frame1.dispose();
				
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
				frame1.dispose();
				
			}
		});
		btnNewButton_1.setBounds(245, 175, 130, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Check Text");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hilight.frame.setVisible(true);
				frame1.dispose();
				
			}
		});
		btnNewButton_2.setBounds(245, 219, 130, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnViewWordTable = new JButton("view Word Table");
		btnViewWordTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				viewandupdate.frame.setVisible(true);
				
				//frame1.setVisible(false);
				
				frame1.dispose();
				
			}
		});
		btnViewWordTable.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnViewWordTable.setBounds(245, 265, 130, 21);
		contentPane.add(btnViewWordTable);
	}
}
