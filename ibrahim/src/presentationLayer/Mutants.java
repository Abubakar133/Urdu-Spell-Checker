package presentationLayer;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bussinesslogicLayer.Generate_Mutant;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

@SuppressWarnings("serial")
public class Mutants extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mutants frame = new Mutants();
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
	}

}
