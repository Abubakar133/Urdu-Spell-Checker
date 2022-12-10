package Presentation_Layer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BussinessLogic_Layer.Generate_Mutant;

@SuppressWarnings("serial")
public class Mutants extends JFrame {

	private JPanel contentPane;
	static Mutants frame= new Mutants();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new Mutants();
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
	public Mutants() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 687, 471);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 205, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		Generate_Mutant obj=new Generate_Mutant();
		
		
		JButton btnNewButton = new JButton("Generate Mutant");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
				
				obj.Get_Words();
			}
		});
		btnNewButton.setBounds(243, 179, 188, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Insert To database");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				obj.Insert_DB();
				
			}
		});
		btnNewButton_1.setBounds(243, 267, 188, 42);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Spell Checker");
		lblNewLabel.setFont(new Font("Wide Latin", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(185, 76, 327, 63);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("Home");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HomeScreen frame1 = new HomeScreen();
				frame1.setVisible(true);
				
	      		
	            frame.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(533, 41, 110, 42);
		contentPane.add(btnNewButton_2);
	}

}
