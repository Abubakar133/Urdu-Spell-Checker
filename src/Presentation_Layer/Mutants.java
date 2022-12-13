package Presentation_Layer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import BussinessLogic_Layer.Generate_Mutant;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class Mutants extends JFrame {

	private JPanel contentPane;
	static Mutants frame= new Mutants();
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
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		Generate_Mutant obj=new Generate_Mutant();
		
		progressBar = new JProgressBar();
		progressBar.setFont(new Font("Tahoma", Font.BOLD, 10));
		progressBar.setBounds(210, 361, 264, 21);
		contentPane.add(progressBar);
		progressBar.setValue(0);
		progressBar.setOpaque(true);
		progressBar.setForeground(Color.blue);
		progressBar.setStringPainted(true);
		
		JButton btnNewButton = new JButton("Generate Mutant");
		btnNewButton.setIcon(new ImageIcon(Mutants.class.getResource("/images/Generate-tables-icon.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
				progressBar.setValue(1);
				obj.Get_Words();
				//progressBar.setValue();
				progressBar.setValue(50);
				obj.Insert_DB();
				progressBar.setValue(100);
			}
		});
		btnNewButton.setBounds(243, 179, 188, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Insert To database");
		btnNewButton_1.setIcon(new ImageIcon(Mutants.class.getResource("/images/Network-Upload-icon.png")));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				progressBar.setValue(0);
				obj.Insert_DB();
				progressBar.setValue(100);
			}
		});
		btnNewButton_1.setBounds(243, 267, 188, 42);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Mutant Generator");
		lblNewLabel.setForeground(SystemColor.window);
		lblNewLabel.setFont(new Font("Wide Latin", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(180, 76, 327, 63);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("Home");
		btnNewButton_2.setIcon(new ImageIcon(Mutants.class.getResource("/images/home-icon.png")));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//HomeScreen frame1 = new HomeScreen();
				HomeScreen.frame1.setVisible(true);
				
	      		
				Mutants.frame.dispose();
			}
		});
		btnNewButton_2.setBounds(537, 51, 106, 32);
		contentPane.add(btnNewButton_2);
		
	}
	

}
